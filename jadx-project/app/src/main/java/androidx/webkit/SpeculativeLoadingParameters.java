package androidx.webkit;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class SpeculativeLoadingParameters {
    private final Map<String, String> mAdditionalHeaders;
    private final NoVarySearchHeader mExpectedNoVarySearchHeader;
    private final boolean mIsJavaScriptEnabled;

    /* JADX INFO: renamed from: androidx.webkit.SpeculativeLoadingParameters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private final Map<String, String> mAdditionalHeaders;
        private NoVarySearchHeader mExpectedNoVarySearchHeader;
        private boolean mIsJavaScriptEnabled;

        public Builder() {
            this.mAdditionalHeaders = new HashMap();
            this.mExpectedNoVarySearchHeader = null;
            this.mIsJavaScriptEnabled = false;
        }

        public SpeculativeLoadingParameters build() {
            return new SpeculativeLoadingParameters(this.mAdditionalHeaders, this.mExpectedNoVarySearchHeader, this.mIsJavaScriptEnabled, null);
        }

        public Builder addAdditionalHeader(String key, String value) {
            this.mAdditionalHeaders.put(key, value);
            return this;
        }

        public Builder addAdditionalHeaders(Map<String, String> additionalHeaders) {
            this.mAdditionalHeaders.putAll(additionalHeaders);
            return this;
        }

        public Builder setExpectedNoVarySearchData(NoVarySearchHeader expectedNoVarySearchHeader) {
            this.mExpectedNoVarySearchHeader = expectedNoVarySearchHeader;
            return this;
        }

        public Builder setJavaScriptEnabled(boolean javaScriptEnabled) {
            this.mIsJavaScriptEnabled = javaScriptEnabled;
            return this;
        }
    }

    /* synthetic */ SpeculativeLoadingParameters(Map x0, NoVarySearchHeader x1, boolean x2, AnonymousClass1 x3) {
        this(x0, x1, x2);
    }

    private SpeculativeLoadingParameters(Map<String, String> additionalHeaders, NoVarySearchHeader noVarySearchHeader, boolean isJavaScriptEnabled) {
        this.mAdditionalHeaders = additionalHeaders;
        this.mExpectedNoVarySearchHeader = noVarySearchHeader;
        this.mIsJavaScriptEnabled = isJavaScriptEnabled;
    }

    public Map<String, String> getAdditionalHeaders() {
        return this.mAdditionalHeaders;
    }

    public NoVarySearchHeader getExpectedNoVarySearchData() {
        return this.mExpectedNoVarySearchHeader;
    }

    public boolean isJavaScriptEnabled() {
        return this.mIsJavaScriptEnabled;
    }
}
