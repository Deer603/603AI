package org.chromium.support_lib_boundary;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import java.util.List;
import java.util.Set;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface StaticsBoundaryInterface {
    Uri getSafeBrowsingPrivacyPolicyUrl();

    String getVariationsHeader();

    void initSafeBrowsing(Context r1, ValueCallback<Boolean> r2);

    boolean isMultiProcessEnabled();

    void setDefaultTrafficStatsTag(int r1);

    void setDefaultTrafficStatsUid(int r1);

    void setSafeBrowsingAllowlist(Set<String> r1, ValueCallback<Boolean> r2);

    void setSafeBrowsingWhitelist(List<String> r1, ValueCallback<Boolean> r2);
}
