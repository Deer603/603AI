package androidx.webkit;

/* JADX INFO: loaded from: classes4.dex */
public class SpeculativeLoadingConfig {
    private final int mMaxPrefetches;
    private final int mMaxPrerenders;
    private final int mPrefetchTTLSeconds;

    /* JADX INFO: renamed from: androidx.webkit.SpeculativeLoadingConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private int mMaxPrefetches;
        private int mMaxPrerenders;
        private int mPrefetchTTLSeconds;

        public Builder() {
        }

        public Builder setPrefetchTtlSeconds(int ttlSeconds) {
            if (ttlSeconds <= 0) goto L6;
            this.mPrefetchTTLSeconds = ttlSeconds;
            return this;
        L6:
            throw new IllegalArgumentException("Prefetch TTL must be greater than 0");
        }

        public Builder setMaxPrefetches(int max) {
            if (max < 1) goto L7;
            this.mMaxPrefetches = max;
            return this;
        L7:
            throw new IllegalArgumentException("Max prefetches must be greater than 0");
        }

        public Builder setMaxPrerenders(int max) {
            if (max < 1) goto L7;
            this.mMaxPrerenders = max;
            return this;
        L7:
            throw new IllegalArgumentException("Max prerenders must be greater than 0");
        }

        public SpeculativeLoadingConfig build() {
            return new SpeculativeLoadingConfig(this.mPrefetchTTLSeconds, this.mMaxPrefetches, this.mMaxPrerenders, null);
        }
    }

    /* synthetic */ SpeculativeLoadingConfig(int x0, int x1, int x2, AnonymousClass1 x3) {
        this(x0, x1, x2);
    }

    private SpeculativeLoadingConfig(int ttlSecs, int maxPrefetches, int maxPrerenders) {
        this.mPrefetchTTLSeconds = ttlSecs;
        this.mMaxPrefetches = maxPrefetches;
        this.mMaxPrerenders = maxPrerenders;
    }

    public int getPrefetchTtlSeconds() {
        return this.mPrefetchTTLSeconds;
    }

    public int getMaxPrefetches() {
        return this.mMaxPrefetches;
    }

    public int getMaxPrerenders() {
        return this.mMaxPrerenders;
    }
}
