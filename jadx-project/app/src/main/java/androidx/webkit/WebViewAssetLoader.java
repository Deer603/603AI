package androidx.webkit;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.core.util.Pair;
import androidx.webkit.internal.AssetHelper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class WebViewAssetLoader {
    public static final String DEFAULT_DOMAIN = "appassets.androidplatform.net";
    private static final String TAG = "WebViewAssetLoader";
    private final List<PathMatcher> mMatchers;

    public static final class AssetsPathHandler implements PathHandler {
        private final AssetHelper mAssetHelper;

        public AssetsPathHandler(Context context) {
            this.mAssetHelper = new AssetHelper(context);
        }

        AssetsPathHandler(AssetHelper assetHelper) {
            this.mAssetHelper = assetHelper;
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public WebResourceResponse handle(String path) {
            InputStream is = this.mAssetHelper.openAsset(path);     // Catch: IOException -> L5
            String mimeType = AssetHelper.guessMimeType(path);     // Catch: IOException -> L5
            return new WebResourceResponse(mimeType, null, is);
        L5:
            e = move-exception;
            Log.e(WebViewAssetLoader.TAG, "Error opening asset path: " + path, e);
            return new WebResourceResponse(null, null, null);
        }
    }

    public static final class Builder {
        private String mDomain;
        private final List<Pair<String, PathHandler>> mHandlerList;
        private boolean mHttpAllowed;

        public Builder() {
            this.mDomain = WebViewAssetLoader.DEFAULT_DOMAIN;
            this.mHandlerList = new ArrayList();
        }

        public Builder setDomain(String domain) {
            this.mDomain = domain;
            return this;
        }

        public Builder setHttpAllowed(boolean httpAllowed) {
            this.mHttpAllowed = httpAllowed;
            return this;
        }

        public Builder addPathHandler(String path, PathHandler handler) {
            this.mHandlerList.add(Pair.create(path, handler));
            return this;
        }

        public WebViewAssetLoader build() {
            List<PathMatcher> pathMatcherList = new ArrayList();
            Iterator<Pair<String, PathHandler>> r1 = this.mHandlerList.iterator();
        L4:
            if (r1.hasNext() == false) goto L7;
            Pair<String, PathHandler> pair = r1.next();
            String path = pair.first;
            PathHandler handler = pair.second;
            pathMatcherList.add(new PathMatcher(this.mDomain, path, this.mHttpAllowed, handler));
            goto L4
        L7:
            return new WebViewAssetLoader(pathMatcherList);
        }
    }

    public static final class InternalStoragePathHandler implements PathHandler {
        private static final String[] FORBIDDEN_DATA_DIRS = null;
        private final File mDirectory;

        static {
            FORBIDDEN_DATA_DIRS = new String[]{"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
        }

        public InternalStoragePathHandler(Context context, File directory) {
            this.mDirectory = new File(AssetHelper.getCanonicalDirPath(directory));     // Catch: IOException -> L8
            if (isAllowedInternalStorageDir(context) == false) goto L7;
            return;
        L7:
            throw new IllegalArgumentException("The given directory \"" + directory + "\" doesn't exist under an allowed app internal storage directory");     // Catch: IOException -> L8
        L8:
            e = move-exception;
            throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + directory.getPath(), e);
        }

        private boolean isAllowedInternalStorageDir(Context context) throws IOException {
            String dir = AssetHelper.getCanonicalDirPath(this.mDirectory);
            String cacheDir = AssetHelper.getCanonicalDirPath(context.getCacheDir());
            String dataDir = AssetHelper.getCanonicalDirPath(AssetHelper.getDataDir(context));
            if (dir.startsWith(cacheDir) == true) goto L8;
            if (dir.startsWith(dataDir) == true) goto L8;
            return false;
        L8:
            if (dir.equals(cacheDir) == false) goto L10;
        L20:
            return false;
        L10:
            if (dir.equals(dataDir) == true) goto L20;
            String[] r3 = FORBIDDEN_DATA_DIRS;
            int r5 = r3.length;
            int r6 = 0;
        L13:
            if (r6 >= r5) goto L18;
            String forbiddenPath = r3[r6];
            if (dir.startsWith(dataDir + forbiddenPath) == true) goto L16;
            r6 = r6 + 1;
            goto L13
        L16:
            return false;
        L18:
            return true;
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public WebResourceResponse handle(String path) {
            File file = AssetHelper.getCanonicalFileIfChild(this.mDirectory, path);     // Catch: IOException -> L9
            if (file == null) goto L7;
            InputStream is = AssetHelper.openFile(file);     // Catch: IOException -> L9
            String mimeType = AssetHelper.guessMimeType(path);     // Catch: IOException -> L9
            return new WebResourceResponse(mimeType, null, is);
        L7:
            Log.e(WebViewAssetLoader.TAG, String.format("The requested file: %s is outside the mounted directory: %s", new Object[]{path, this.mDirectory}));     // Catch: IOException -> L9
        L12:
            return new WebResourceResponse(null, null, null);
        L9:
            e = move-exception;
            Log.e(WebViewAssetLoader.TAG, "Error opening the requested path: " + path, e);
            goto L12
        }
    }

    public interface PathHandler {
        WebResourceResponse handle(String r1);
    }

    static class PathMatcher {
        static final String HTTPS_SCHEME = "https";
        static final String HTTP_SCHEME = "http";
        final String mAuthority;
        final PathHandler mHandler;
        final boolean mHttpEnabled;
        final String mPath;

        PathMatcher(String authority, String path, boolean httpEnabled, PathHandler handler) {
            if (path.isEmpty() == true) goto L13;
            if (path.charAt(0) != '/') goto L13;
            if (path.endsWith("/") == false) goto L11;
            this.mAuthority = authority;
            this.mPath = path;
            this.mHttpEnabled = httpEnabled;
            this.mHandler = handler;
            return;
        L11:
            throw new IllegalArgumentException("Path should end with a slash '/'");
        L13:
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }

        public PathHandler match(Uri uri) {
            if (uri.getScheme().equals("http") == false) goto L8;
            if (this.mHttpEnabled == true) goto L8;
            return null;
        L8:
            if (uri.getScheme().equals("http") == true) goto L13;
            if (uri.getScheme().equals("https") == true) goto L13;
            return null;
        L13:
            if (uri.getAuthority().equals(this.mAuthority) == true) goto L16;
            return null;
        L16:
            if (uri.getPath().startsWith(this.mPath) == true) goto L19;
            return null;
        L19:
            return this.mHandler;
        }

        public String getSuffixPath(String path) {
            return path.replaceFirst(this.mPath, "");
        }
    }

    public static final class ResourcesPathHandler implements PathHandler {
        private final AssetHelper mAssetHelper;

        public ResourcesPathHandler(Context context) {
            this.mAssetHelper = new AssetHelper(context);
        }

        ResourcesPathHandler(AssetHelper assetHelper) {
            this.mAssetHelper = assetHelper;
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public WebResourceResponse handle(String path) {
            InputStream is = this.mAssetHelper.openResource(path);     // Catch: IOException -> L5 Resources.NotFoundException -> L7
            String mimeType = AssetHelper.guessMimeType(path);     // Catch: IOException -> L5 Resources.NotFoundException -> L7
            return new WebResourceResponse(mimeType, null, is);
        L7:
            e = move-exception;
            Log.e(WebViewAssetLoader.TAG, "Resource not found from the path: " + path, e);
        L10:
            return new WebResourceResponse(null, null, null);
        L5:
            e = move-exception;
            Log.e(WebViewAssetLoader.TAG, "Error opening resource from the path: " + path, e);
            goto L10
        }
    }

    WebViewAssetLoader(List<PathMatcher> pathMatchers) {
        this.mMatchers = pathMatchers;
    }

    public WebResourceResponse shouldInterceptRequest(Uri url) {
        Iterator<PathMatcher> r0 = this.mMatchers.iterator();
    L4:
        if (r0.hasNext() == false) goto L12;
        PathMatcher matcher = r0.next();
        PathHandler handler = matcher.match(url);
        if (handler == null) goto L4;
        String suffixPath = matcher.getSuffixPath(url.getPath());
        WebResourceResponse response = handler.handle(suffixPath);
        if (response == null) goto L4;
        return response;
    L12:
        return null;
    }
}
