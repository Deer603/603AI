package androidx.webkit.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes4.dex */
public class AssetHelper {
    public static final String DEFAULT_MIME_TYPE = "text/plain";
    private final Context mContext;

    public AssetHelper(Context context) {
        this.mContext = context;
    }

    private static InputStream handleSvgzStream(String path, InputStream stream) throws IOException {
        if (path.endsWith(".svgz") == false) goto L6;
        return new GZIPInputStream(stream);
    L6:
        return stream;
    }

    private static String removeLeadingSlash(String path) {
        if (path.length() > 1) goto L5;
        return path;
    L5:
        if (path.charAt(0) == '/') goto L7;
        return path;
    L7:
        return path.substring(1);
    }

    private int getFieldId(String resourceType, String resourceName) {
        String packageName = this.mContext.getPackageName();
        return this.mContext.getResources().getIdentifier(resourceName, resourceType, packageName);
    }

    private int getValueType(int fieldId) {
        TypedValue value = new TypedValue();
        this.mContext.getResources().getValue(fieldId, value, true);
        return value.type;
    }

    public InputStream openResource(String path) throws Resources.NotFoundException, IOException {
        String path2 = removeLeadingSlash(path);
        String[] pathSegments = path2.split("/", -1);
        if (pathSegments.length != 2) goto L14;
        String resourceType = pathSegments[0];
        String resourceName = pathSegments[1];
        int dotIndex = resourceName.lastIndexOf(46);
        if (dotIndex == (-1)) goto L7;
        resourceName = resourceName.substring(0, dotIndex);
    L7:
        int fieldId = getFieldId(resourceType, resourceName);
        int valueType = getValueType(fieldId);
        if (valueType != 3) goto L12;
        return handleSvgzStream(path2, this.mContext.getResources().openRawResource(fieldId));
    L12:
        throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", new Object[]{path2, Integer.valueOf(valueType)}));
    L14:
        throw new IllegalArgumentException("Incorrect resource path: " + path2);
    }

    public InputStream openAsset(String path) throws IOException {
        String path2 = removeLeadingSlash(path);
        AssetManager assets = this.mContext.getAssets();
        return handleSvgzStream(path2, assets.open(path2, 2));
    }

    public static InputStream openFile(File file) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(file);
        return handleSvgzStream(file.getPath(), fis);
    }

    public static File getCanonicalFileIfChild(File parent, String child) throws IOException {
        String parentCanonicalPath = getCanonicalDirPath(parent);
        String childCanonicalPath = new File(parent, child).getCanonicalPath();
        if (childCanonicalPath.startsWith(parentCanonicalPath) == true) goto L5;
        return null;
    L5:
        return new File(childCanonicalPath);
    }

    public static String getCanonicalDirPath(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.endsWith("/") == false) goto L5;
        return canonicalPath;
    L5:
        return canonicalPath + "/";
    }

    public static File getDataDir(Context context) {
        return ApiHelperForN.getDataDir(context);
    }

    public static String guessMimeType(String filePath) {
        String mimeType = MimeUtil.getMimeFromFileName(filePath);
        if (mimeType != null) goto L6;
        return DEFAULT_MIME_TYPE;
    L6:
        return mimeType;
    }
}
