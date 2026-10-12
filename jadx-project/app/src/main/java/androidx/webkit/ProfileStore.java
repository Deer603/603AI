package androidx.webkit;

import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ProfileStoreImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface ProfileStore {
    boolean deleteProfile(String r1);

    List<String> getAllProfileNames();

    Profile getOrCreateProfile(String r1);

    Profile getProfile(String r1);

    static ProfileStore getInstance() {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.MULTI_PROFILE;
        if (feature.isSupportedByWebView() == false) goto L7;
        return ProfileStoreImpl.getInstance();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
