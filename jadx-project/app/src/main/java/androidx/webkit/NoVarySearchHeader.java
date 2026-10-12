package androidx.webkit;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NoVarySearchHeader {
    public final List<String> consideredQueryParameters;
    public final boolean ignoreDifferencesInParameters;
    public final List<String> ignoredQueryParameters;
    public final boolean varyOnKeyOrder;

    private NoVarySearchHeader(boolean varyOnKeyOrder, boolean ignoreDifferencesInParameters, List<String> ignoredQueryParameters, List<String> consideredQueryParameters) {
        this.varyOnKeyOrder = varyOnKeyOrder;
        this.ignoreDifferencesInParameters = ignoreDifferencesInParameters;
        this.ignoredQueryParameters = ignoredQueryParameters;
        this.consideredQueryParameters = consideredQueryParameters;
    }

    public static NoVarySearchHeader neverVaryHeader() {
        return new NoVarySearchHeader(false, true, new ArrayList(), new ArrayList());
    }

    public static NoVarySearchHeader alwaysVaryHeader() {
        return new NoVarySearchHeader(true, false, new ArrayList(), new ArrayList());
    }

    public static NoVarySearchHeader neverVaryExcept(boolean varyOnOrdering, List<String> consideredQueryParameters) {
        return new NoVarySearchHeader(varyOnOrdering, true, new ArrayList(), consideredQueryParameters);
    }

    public static NoVarySearchHeader varyExcept(boolean varyOnOrdering, List<String> ignoredQueryParameters) {
        return new NoVarySearchHeader(varyOnOrdering, false, ignoredQueryParameters, new ArrayList());
    }
}
