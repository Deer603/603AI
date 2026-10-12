package org.chromium.support_lib_boundary;

import java.util.Set;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean r1);

    void setAllowFileAccess(boolean r1);

    void setBlockNetworkLoads(boolean r1);

    void setCacheMode(int r1);

    void setIncludeCookiesOnIntercept(boolean r1);

    void setRequestedWithHeaderOriginAllowList(Set<String> r1);
}
