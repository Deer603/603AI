package androidx.webkit.internal;

import androidx.webkit.Page;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public class PageImpl implements Page {
    private final WebViewPageBoundaryInterface mPageBoundaryInterface;

    public PageImpl(WebViewPageBoundaryInterface impl) {
        this.mPageBoundaryInterface = impl;
    }
}
