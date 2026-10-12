package androidx.webkit.internal;

import androidx.webkit.NoVarySearchHeader;
import java.util.List;
import org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public class NoVarySearchHeaderAdapter implements NoVarySearchDataBoundaryInterface {
    private final NoVarySearchHeader mImpl;

    public NoVarySearchHeaderAdapter(NoVarySearchHeader impl) {
        this.mImpl = impl;
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public boolean getVaryOnKeyOrder() {
        return this.mImpl.varyOnKeyOrder;
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public boolean getIgnoreDifferencesInParameters() {
        return this.mImpl.ignoreDifferencesInParameters;
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public List<String> getIgnoredQueryParameters() {
        return this.mImpl.ignoredQueryParameters;
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public List<String> getConsideredQueryParameters() {
        return this.mImpl.consideredQueryParameters;
    }
}
