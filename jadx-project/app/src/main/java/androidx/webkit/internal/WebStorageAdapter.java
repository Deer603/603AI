package androidx.webkit.internal;

import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebStorageBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public class WebStorageAdapter implements WebStorageBoundaryInterface {
    final WebStorageBoundaryInterface mImpl;

    public WebStorageAdapter(WebStorageBoundaryInterface impl) {
        this.mImpl = impl;
    }

    @Override // org.chromium.support_lib_boundary.WebStorageBoundaryInterface
    public void deleteBrowsingData(Executor callbackExecutor, Runnable doneCallback) {
        this.mImpl.deleteBrowsingData(callbackExecutor, doneCallback);
    }

    @Override // org.chromium.support_lib_boundary.WebStorageBoundaryInterface
    public String deleteBrowsingDataForSite(String domainOrUrl, Executor callbackExecutor, Runnable doneCallback) {
        return this.mImpl.deleteBrowsingDataForSite(domainOrUrl, callbackExecutor, doneCallback);
    }
}
