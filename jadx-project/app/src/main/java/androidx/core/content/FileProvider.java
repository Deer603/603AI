package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.core.util.ObjectsCompat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String[] COLUMNS = null;
    private static final File DEVICE_ROOT = null;
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private static final HashMap<String, PathStrategy> sCache = null;
    private String mAuthority;
    private PathStrategy mLocalPathStrategy;
    private final Object mLock;
    private final int mResourceId;

    static class Api21Impl {
        private Api21Impl() {
        }

        static File[] getExternalMediaDirs(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    interface PathStrategy {
        File getFileForUri(Uri r1);

        Uri getUriForFile(File r1);
    }

    static class SimplePathStrategy implements PathStrategy {
        private final String mAuthority;
        private final HashMap<String, File> mRoots;

        SimplePathStrategy(String authority) {
            this.mRoots = new HashMap();
            this.mAuthority = authority;
        }

        void addRoot(String name, File root) {
            if (TextUtils.isEmpty(name) == true) goto L11;
            this.mRoots.put(name, root.getCanonicalFile());
            return;
        L7:
            e = move-exception;
            throw new IllegalArgumentException("Failed to resolve canonical path for " + root, e);
        L11:
            throw new IllegalArgumentException("Name must not be empty");
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public Uri getUriForFile(File file) {
            String path = file.getCanonicalPath();     // Catch: IOException -> L22
            Map.Entry<String, File> mostSpecific = null;
            Iterator<Map.Entry<String, File>> r2 = this.mRoots.entrySet().iterator();
        L5:
            if (r2.hasNext() == false) goto L13;
            Map.Entry<String, File> root = r2.next();
            String rootPath = root.getValue().getPath();
            if (belongsToRoot(path, rootPath) == false) goto L5;
            if (mostSpecific == null) goto L11;
            if (rootPath.length() <= mostSpecific.getValue().getPath().length()) goto L5;
        L11:
            mostSpecific = root;
            goto L5
        L13:
            if (mostSpecific == null) goto L21;
            String rootPath2 = mostSpecific.getValue().getPath();
            if (rootPath2.endsWith("/") == false) goto L17;
            String path2 = path.substring(rootPath2.length());
        L19:
            return new Uri.Builder().scheme("content").authority(this.mAuthority).encodedPath(Uri.encode(mostSpecific.getKey()) + '/' + Uri.encode(path2, "/")).build();
        L17:
            path2 = path.substring(rootPath2.length() + 1);
            goto L19
        L21:
            throw new IllegalArgumentException("Failed to find configured root that contains " + path);
        L24:
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public File getFileForUri(Uri uri) {
            String path = uri.getEncodedPath();
            int splitIndex = path.indexOf(47, 1);
            if (splitIndex == (-1)) goto L19;
            String tag = Uri.decode(path.substring(1, splitIndex));
            String path2 = Uri.decode(path.substring(splitIndex + 1));
            File root = this.mRoots.get(tag);
            if (root == null) goto L17;
            File file = new File(root, path2);
            File file2 = file.getCanonicalFile();     // Catch: IOException -> L13
            if (belongsToRoot(file2.getPath(), root.getPath()) == false) goto L12;
            return file2;
        L12:
            throw new SecurityException("Resolved path jumped beyond configured root");
        L15:
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        L17:
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        L19:
            throw new IllegalArgumentException("Unable to find path from root: " + uri);
        }

        private boolean belongsToRoot(String filePath, String rootPath) {
            return FileProvider.access$000(filePath).startsWith(FileProvider.access$000(rootPath) + '/');
        }
    }

    static /* synthetic */ String access$000(String x0) {
        return removeTrailingSlash(x0);
    }

    static {
        COLUMNS = new String[]{"_display_name", "_size"};
        DEVICE_ROOT = new File("/");
        sCache = new HashMap();
    }

    public FileProvider() {
        this(0);
    }

    protected FileProvider(int resourceId) {
        this.mLock = new Object();
        this.mResourceId = resourceId;
    }

    public static Uri getUriForFile(Context context, String authority, File file) {
        PathStrategy strategy = getPathStrategy(context, authority, 0);
        return strategy.getUriForFile(file);
    }

    public static Uri getUriForFile(Context context, String authority, File file, String displayName) {
        Uri uri = getUriForFile(context, authority, file);
        return uri.buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, displayName).build();
    }

    private static PathStrategy getPathStrategy(Context context, String authority, int resourceId) {
        HashMap<String, PathStrategy> r0 = sCache;
        monitor-enter(r0);
        PathStrategy strat = sCache.get(authority);     // Catch: Throwable -> L17
        if (strat == null) goto L21;
    L15:
        monitor-exit(r0);     // Catch: Throwable -> L17
        return strat;
    L21:
        strat = parsePathStrategy(context, authority, resourceId);     // Catch: XmlPullParserException -> L9 IOException -> L12 Throwable -> L17
        sCache.put(authority, strat);     // Catch: Throwable -> L17
        goto L15
    L12:
        e = move-exception;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);     // Catch: Throwable -> L17
    L9:
        e = move-exception;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        throw th;
    }

    static XmlResourceParser getFileProviderPathsMetaData(Context context, String authority, ProviderInfo info, int resourceId) {
        if (info == null) goto L13;
        if (info.metaData != null) goto L7;
        if (resourceId == 0) goto L7;
        info.metaData = new Bundle(1);
        info.metaData.putInt(META_DATA_FILE_PROVIDER_PATHS, resourceId);
    L7:
        XmlResourceParser in = info.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (in == null) goto L11;
        return in;
    L11:
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    L13:
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + authority);
    }

    private static PathStrategy parsePathStrategy(Context context, String authority, int resourceId) throws IOException, XmlPullParserException {
        SimplePathStrategy strat = new SimplePathStrategy(authority);
        ProviderInfo info = context.getPackageManager().resolveContentProvider(authority, 128);
        XmlResourceParser in = getFileProviderPathsMetaData(context, authority, info, resourceId);
    L3:
        int type = in.next();
        if (type == 1) goto L39;
        if (type != 2) goto L3;
        String tag = in.getName();
        String name = in.getAttributeValue(null, "name");
        String path = in.getAttributeValue(null, ATTR_PATH);
        File target = null;
        if (TAG_ROOT_PATH.equals(tag) == false) goto L11;
        target = DEVICE_ROOT;
    L36:
        if (target == null) goto L3;
        strat.addRoot(name, buildPath(target, new String[]{path}));
        goto L3
    L11:
        if (TAG_FILES_PATH.equals(tag) == false) goto L14;
        target = context.getFilesDir();
        goto L36
    L14:
        if (TAG_CACHE_PATH.equals(tag) == false) goto L17;
        target = context.getCacheDir();
        goto L36
    L17:
        if (TAG_EXTERNAL.equals(tag) == false) goto L20;
        target = Environment.getExternalStorageDirectory();
        goto L36
    L20:
        if (TAG_EXTERNAL_FILES.equals(tag) == false) goto L26;
        File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(context, null);
        if (externalFilesDirs.length <= 0) goto L36;
        target = externalFilesDirs[0];
        goto L36
    L26:
        if (TAG_EXTERNAL_CACHE.equals(tag) == false) goto L32;
        File[] externalCacheDirs = ContextCompat.getExternalCacheDirs(context);
        if (externalCacheDirs.length <= 0) goto L36;
        target = externalCacheDirs[0];
        goto L36
    L32:
        if (TAG_EXTERNAL_MEDIA.equals(tag) == false) goto L36;
        File[] externalMediaDirs = Api21Impl.getExternalMediaDirs(context);
        if (externalMediaDirs.length <= 0) goto L36;
        target = externalMediaDirs[0];
        goto L36
    L39:
        return strat;
    }

    private static int modeToMode(String mode) {
        if ("r".equals(mode) == false) goto L6;
        return 268435456;
    L6:
        if ("w".equals(mode) == false) goto L8;
    L21:
        return 738197504;
    L8:
        if ("wt".equals(mode) == true) goto L21;
        if ("wa".equals(mode) == false) goto L14;
        return 704643072;
    L14:
        if ("rw".equals(mode) == false) goto L17;
        return 939524096;
    L17:
        if ("rwt".equals(mode) == false) goto L20;
        return 1006632960;
    L20:
        throw new IllegalArgumentException("Invalid mode: " + mode);
    }

    private static File buildPath(File base, String... segments) {
        File cur = base;
        int r1 = segments.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        String segment = segments[r2];
        if (segment == null) goto L7;
        cur = new File(cur, segment);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return cur;
    }

    private static String[] copyOf(String[] original, int newLength) {
        String[] result = new String[newLength];
        System.arraycopy(original, 0, result, 0, newLength);
        return result;
    }

    private static Object[] copyOf(Object[] original, int newLength) {
        Object[] result = new Object[newLength];
        System.arraycopy(original, 0, result, 0, newLength);
        return result;
    }

    private static String removeTrailingSlash(String path) {
        if (path.length() > 0) goto L5;
    L8:
        return path;
    L5:
        if (path.charAt(path.length() - 1) != '/') goto L8;
        return path.substring(0, path.length() - 1);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo info) {
        super.attachInfo(context, info);
        if (info.exported == true) goto L30;
        if (info.grantUriPermissions == false) goto L28;
        if (info.authority == null) goto L26;
        if (info.authority.trim().isEmpty() == true) goto L26;
        String authority = info.authority.split(";")[0];
        Object r1 = this.mLock;
        monitor-enter(r1);
        this.mAuthority = authority;     // Catch: Throwable -> L22
        monitor-exit(r1);     // Catch: Throwable -> L22
        HashMap<String, PathStrategy> r2 = sCache;
        monitor-enter(r2);
        sCache.remove(authority);     // Catch: Throwable -> L19
        monitor-exit(r2);     // Catch: Throwable -> L19
        return;
    L19:
        th = move-exception;
        throw th;
    L22:
        th = move-exception;
        throw th;
    L26:
        throw new SecurityException("Provider must have a non-empty authority");
    L28:
        throw new SecurityException("Provider must grant uri permissions");
    L30:
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        File file = getLocalPathStrategy().getFileForUri(uri);
        String displayName = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (projection != null) goto L5;
        projection = COLUMNS;
    L5:
        String[] cols = new String[projection.length];
        Object[] values = new Object[projection.length];
        int i = 0;
        int r5 = projection.length;
        int r6 = 0;
    L6:
        if (r6 >= r5) goto L18;
        String col = projection[r6];
        if ("_display_name".equals(col) == false) goto L15;
        cols[i] = "_display_name";
        int i2 = i + 1;
        if (displayName != null) goto L12;
        String r9 = file.getName();
    L13:
        values[i] = r9;
        i = i2;
    L17:
        r6 = r6 + 1;
        goto L6
    L12:
        r9 = displayName;
        goto L13
    L15:
        if ("_size".equals(col) == false) goto L17;
        cols[i] = "_size";
        values[i] = Long.valueOf(file.length());
        i = i + 1;
        goto L17
    L18:
        String[] cols2 = copyOf(cols, i);
        Object[] values2 = copyOf(values, i);
        MatrixCursor cursor = new MatrixCursor(cols2, 1);
        cursor.addRow(values2);
        return cursor;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File file = getLocalPathStrategy().getFileForUri(uri);
        int lastDot = file.getName().lastIndexOf(46);
        if (lastDot < 0) goto L7;
        String extension = file.getName().substring(lastDot + 1);
        String mime = MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension);
        if (mime == null) goto L9;
        return mime;
    L9:
        return "application/octet-stream";
    L7:
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri r3, String r4, String[] r5) {
        return getLocalPathStrategy().getFileForUri(r3).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
        File file = getLocalPathStrategy().getFileForUri(uri);
        int fileMode = modeToMode(mode);
        return ParcelFileDescriptor.open(file, fileMode);
    }

    private PathStrategy getLocalPathStrategy() {
        Object r0 = this.mLock;
        monitor-enter(r0);
        ObjectsCompat.requireNonNull(this.mAuthority, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");     // Catch: Throwable -> L10
        if (this.mLocalPathStrategy != null) goto L7;
        this.mLocalPathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);     // Catch: Throwable -> L10
    L7:
        PathStrategy r1 = this.mLocalPathStrategy;     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L10:
        th = move-exception;
        throw th;
    }
}
