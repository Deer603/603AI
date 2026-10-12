package androidx.webkit.internal;

import androidx.webkit.NoVarySearchHeader;
import androidx.webkit.SpeculativeLoadingParameters;
import java.lang.reflect.InvocationHandler;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class SpeculativeLoadingParametersAdapter implements SpeculativeLoadingParametersBoundaryInterface {
    private final SpeculativeLoadingParameters mSpeculativeLoadingParameters;

    public SpeculativeLoadingParametersAdapter(SpeculativeLoadingParameters impl) {
        this.mSpeculativeLoadingParameters = impl;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public Map<String, String> getAdditionalHeaders() {
        if (this.mSpeculativeLoadingParameters != null) goto L7;
        return new HashMap();
    L7:
        return this.mSpeculativeLoadingParameters.getAdditionalHeaders();
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public InvocationHandler getNoVarySearchData() {
        if (this.mSpeculativeLoadingParameters != null) goto L5;
        return null;
    L5:
        NoVarySearchHeader noVarySearchHeader = this.mSpeculativeLoadingParameters.getExpectedNoVarySearchData();
        if (noVarySearchHeader != null) goto L9;
        return null;
    L9:
        return BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new NoVarySearchHeaderAdapter(noVarySearchHeader));
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public boolean isJavaScriptEnabled() {
        if (this.mSpeculativeLoadingParameters != null) goto L7;
        return false;
    L7:
        return this.mSpeculativeLoadingParameters.isJavaScriptEnabled();
    }
}
