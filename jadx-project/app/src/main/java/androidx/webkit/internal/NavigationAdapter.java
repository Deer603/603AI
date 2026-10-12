package androidx.webkit.internal;

import androidx.webkit.Navigation;
import androidx.webkit.Page;
import org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationAdapter implements Navigation {
    WebViewNavigationBoundaryInterface mImpl;
    PageImpl mPage;

    public NavigationAdapter(WebViewNavigationBoundaryInterface impl) {
        this.mImpl = impl;
    }

    @Override // androidx.webkit.Navigation
    public Page getPage() {
        if (this.mImpl.getPage() != null) goto L7;
        return null;
    L7:
        if (this.mPage != null) goto L10;
        WebViewPageBoundaryInterface boundaryInterface = (WebViewPageBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewPageBoundaryInterface.class, this.mImpl.getPage());
        this.mPage = new PageImpl(boundaryInterface);
    L10:
        return this.mPage;
    }

    @Override // androidx.webkit.Navigation
    public boolean wasInitiatedByPage() {
        return this.mImpl.wasInitiatedByPage();
    }

    @Override // androidx.webkit.Navigation
    public boolean isSameDocument() {
        return this.mImpl.isSameDocument();
    }

    @Override // androidx.webkit.Navigation
    public boolean isReload() {
        return this.mImpl.isReload();
    }

    @Override // androidx.webkit.Navigation
    public boolean isHistory() {
        return this.mImpl.isHistory();
    }

    @Override // androidx.webkit.Navigation
    public boolean isRestore() {
        return this.mImpl.isRestore();
    }

    @Override // androidx.webkit.Navigation
    public boolean isBack() {
        return this.mImpl.isBack();
    }

    @Override // androidx.webkit.Navigation
    public boolean isForward() {
        return this.mImpl.isForward();
    }

    @Override // androidx.webkit.Navigation
    public boolean didCommit() {
        return this.mImpl.didCommit();
    }

    @Override // androidx.webkit.Navigation
    public boolean didCommitErrorPage() {
        return this.mImpl.didCommitErrorPage();
    }

    @Override // androidx.webkit.Navigation
    public int getStatusCode() {
        return this.mImpl.getStatusCode();
    }
}
