package androidx.webkit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TracingConfig {
    public static final int CATEGORIES_ALL = 1;
    public static final int CATEGORIES_ANDROID_WEBVIEW = 2;
    public static final int CATEGORIES_FRAME_VIEWER = 64;
    public static final int CATEGORIES_INPUT_LATENCY = 8;
    public static final int CATEGORIES_JAVASCRIPT_AND_RENDERING = 32;
    public static final int CATEGORIES_NONE = 0;
    public static final int CATEGORIES_RENDERING = 16;
    public static final int CATEGORIES_WEB_DEVELOPER = 4;
    public static final int RECORD_CONTINUOUSLY = 1;
    public static final int RECORD_UNTIL_FULL = 0;
    private final List<String> mCustomIncludedCategories;
    private final int mPredefinedCategories;
    private final int mTracingMode;

    public static class Builder {
        private final List<String> mCustomIncludedCategories;
        private int mPredefinedCategories;
        private int mTracingMode;

        public Builder() {
            this.mPredefinedCategories = 0;
            this.mCustomIncludedCategories = new ArrayList();
            this.mTracingMode = 1;
        }

        public TracingConfig build() {
            return new TracingConfig(this.mPredefinedCategories, this.mCustomIncludedCategories, this.mTracingMode);
        }

        public Builder addCategories(int... predefinedCategories) {
            int r0 = predefinedCategories.length;
            int r1 = 0;
        L3:
            if (r1 >= r0) goto L5;
            int categorySet = predefinedCategories[r1];
            this.mPredefinedCategories |= categorySet;
            r1 = r1 + 1;
            goto L3
        L5:
            return this;
        }

        public Builder addCategories(String... categories) {
            this.mCustomIncludedCategories.addAll(Arrays.asList(categories));
            return this;
        }

        public Builder addCategories(Collection<String> categories) {
            this.mCustomIncludedCategories.addAll(categories);
            return this;
        }

        public Builder setTracingMode(int tracingMode) {
            this.mTracingMode = tracingMode;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PredefinedCategories {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TracingMode {
    }

    public TracingConfig(int predefinedCategories, List<String> customIncludedCategories, int tracingMode) {
        this.mCustomIncludedCategories = new ArrayList();
        this.mPredefinedCategories = predefinedCategories;
        this.mCustomIncludedCategories.addAll(customIncludedCategories);
        this.mTracingMode = tracingMode;
    }

    public int getPredefinedCategories() {
        return this.mPredefinedCategories;
    }

    public List<String> getCustomIncludedCategories() {
        return this.mCustomIncludedCategories;
    }

    public int getTracingMode() {
        return this.mTracingMode;
    }
}
