package androidx.webkit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ServiceWorkerWebSettingsCompat {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheMode {
    }

    public abstract boolean getAllowContentAccess();

    public abstract boolean getAllowFileAccess();

    public abstract boolean getBlockNetworkLoads();

    public abstract int getCacheMode();

    public abstract Set<String> getRequestedWithHeaderOriginAllowList();

    public abstract void setAllowContentAccess(boolean r1);

    public abstract void setAllowFileAccess(boolean r1);

    public abstract void setBlockNetworkLoads(boolean r1);

    public abstract void setCacheMode(int r1);

    public abstract void setRequestedWithHeaderOriginAllowList(Set<String> r1);

    public ServiceWorkerWebSettingsCompat() {
    }
}
