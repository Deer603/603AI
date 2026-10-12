package androidx.webkit;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebStorage;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.WebStorageAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class WebStorageCompat {
    private WebStorageCompat() {
    }

    public static void deleteBrowsingData(WebStorage instance, Executor executor, Runnable doneCallback) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.DELETE_BROWSING_DATA;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(instance).deleteBrowsingData(executor, doneCallback);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void deleteBrowsingData(WebStorage instance, Runnable doneCallback) {
        deleteBrowsingData(instance, new WebStorageCompat$$ExternalSyntheticLambda1(), doneCallback);
    }

    static /* synthetic */ void lambda$deleteBrowsingData$0(Runnable r) {
        new Handler(Looper.getMainLooper()).post(r);
    }

    public static String deleteBrowsingDataForSite(WebStorage instance, String site, Executor executor, Runnable doneCallback) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.DELETE_BROWSING_DATA;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(instance).deleteBrowsingDataForSite(site, executor, doneCallback);
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static String deleteBrowsingDataForSite(WebStorage instance, String site, Runnable doneCallback) {
        return deleteBrowsingDataForSite(instance, site, new WebStorageCompat$$ExternalSyntheticLambda0(), doneCallback);
    }

    static /* synthetic */ void lambda$deleteBrowsingDataForSite$1(Runnable r) {
        new Handler(Looper.getMainLooper()).post(r);
    }

    private static WebStorageAdapter getAdapter(WebStorage webStorage) {
        return WebViewGlueCommunicator.getCompatConverter().convertWebStorage(webStorage);
    }
}
