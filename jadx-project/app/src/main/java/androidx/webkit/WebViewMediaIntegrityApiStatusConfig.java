package androidx.webkit;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewMediaIntegrityApiStatusConfig {
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_DISABLED = 0;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED = 2;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED_WITHOUT_APP_IDENTITY = 1;
    private final int mDefaultStatus;
    private final Map<String, Integer> mOverrideRules;

    public static final class Builder {
        private final int mDefaultStatus;
        private Map<String, Integer> mOverrideRules;

        static /* synthetic */ int access$000(Builder x0) {
            return x0.mDefaultStatus;
        }

        static /* synthetic */ Map access$100(Builder x0) {
            return x0.mOverrideRules;
        }

        public Builder(int defaultStatus) {
            this.mDefaultStatus = defaultStatus;
            this.mOverrideRules = new HashMap();
        }

        public Builder addOverrideRule(String originPattern, int permission) {
            this.mOverrideRules.put(originPattern, Integer.valueOf(permission));
            return this;
        }

        public Builder setOverrideRules(Map<String, Integer> overrideRules) {
            this.mOverrideRules = overrideRules;
            return this;
        }

        public WebViewMediaIntegrityApiStatusConfig build() {
            return new WebViewMediaIntegrityApiStatusConfig(this);
        }
    }

    public WebViewMediaIntegrityApiStatusConfig(Builder builder) {
        this.mDefaultStatus = Builder.access$000(builder);
        this.mOverrideRules = Builder.access$100(builder);
    }

    public int getDefaultStatus() {
        return this.mDefaultStatus;
    }

    public Map<String, Integer> getOverrideRules() {
        return this.mOverrideRules;
    }
}
