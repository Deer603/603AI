package androidx.webkit.internal;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ApiHelperForOMR1 {
    private ApiHelperForOMR1() {
    }

    public static void showInterstitial(SafeBrowsingResponse safeBrowsingResponse, boolean showInterstitial) {
        safeBrowsingResponse.showInterstitial(showInterstitial);
    }

    public static void proceed(SafeBrowsingResponse frameworksImpl, boolean proceed) {
        frameworksImpl.proceed(proceed);
    }

    public static void backToSafety(SafeBrowsingResponse safeBrowsingResponse, boolean backToSafety) {
        safeBrowsingResponse.backToSafety(backToSafety);
    }

    public static void startSafeBrowsing(Context context, ValueCallback<Boolean> callback) {
        WebView.startSafeBrowsing(context, callback);
    }

    public static void setSafeBrowsingWhitelist(List<String> hosts, ValueCallback<Boolean> callback) {
        WebView.setSafeBrowsingWhitelist(hosts, callback);
    }

    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }
}
