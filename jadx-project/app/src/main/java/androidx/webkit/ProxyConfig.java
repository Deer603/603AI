package androidx.webkit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ProxyConfig {
    private static final String BYPASS_RULE_REMOVE_IMPLICIT = "<-loopback>";
    private static final String BYPASS_RULE_SIMPLE_NAMES = "<local>";
    private static final String DIRECT = "direct://";
    public static final String MATCH_ALL_SCHEMES = "*";
    public static final String MATCH_HTTP = "http";
    public static final String MATCH_HTTPS = "https";
    private final List<String> mBypassRules;
    private final List<ProxyRule> mProxyRules;
    private final boolean mReverseBypass;

    public static final class Builder {
        private final List<String> mBypassRules;
        private final List<ProxyRule> mProxyRules;
        private boolean mReverseBypass;

        public Builder() {
            this.mReverseBypass = false;
            this.mProxyRules = new ArrayList();
            this.mBypassRules = new ArrayList();
        }

        public Builder(ProxyConfig proxyConfig) {
            this.mReverseBypass = false;
            this.mProxyRules = proxyConfig.getProxyRules();
            this.mBypassRules = proxyConfig.getBypassRules();
            this.mReverseBypass = proxyConfig.isReverseBypassEnabled();
        }

        public ProxyConfig build() {
            return new ProxyConfig(proxyRules(), bypassRules(), reverseBypass());
        }

        public Builder addProxyRule(String proxyUrl) {
            this.mProxyRules.add(new ProxyRule(proxyUrl));
            return this;
        }

        public Builder addProxyRule(String proxyUrl, String schemeFilter) {
            this.mProxyRules.add(new ProxyRule(schemeFilter, proxyUrl));
            return this;
        }

        public Builder addBypassRule(String bypassRule) {
            this.mBypassRules.add(bypassRule);
            return this;
        }

        public Builder addDirect(String schemeFilter) {
            this.mProxyRules.add(new ProxyRule(schemeFilter, ProxyConfig.DIRECT));
            return this;
        }

        public Builder addDirect() {
            return addDirect(ProxyConfig.MATCH_ALL_SCHEMES);
        }

        public Builder bypassSimpleHostnames() {
            return addBypassRule(ProxyConfig.BYPASS_RULE_SIMPLE_NAMES);
        }

        public Builder removeImplicitRules() {
            return addBypassRule(ProxyConfig.BYPASS_RULE_REMOVE_IMPLICIT);
        }

        public Builder setReverseBypassEnabled(boolean reverseBypass) {
            this.mReverseBypass = reverseBypass;
            return this;
        }

        private List<ProxyRule> proxyRules() {
            return this.mProxyRules;
        }

        private List<String> bypassRules() {
            return this.mBypassRules;
        }

        private boolean reverseBypass() {
            return this.mReverseBypass;
        }
    }

    public static final class ProxyRule {
        private final String mSchemeFilter;
        private final String mUrl;

        public ProxyRule(String schemeFilter, String url) {
            this.mSchemeFilter = schemeFilter;
            this.mUrl = url;
        }

        public ProxyRule(String url) {
            this(ProxyConfig.MATCH_ALL_SCHEMES, url);
        }

        public String getSchemeFilter() {
            return this.mSchemeFilter;
        }

        public String getUrl() {
            return this.mUrl;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProxyScheme {
    }

    public ProxyConfig(List<ProxyRule> proxyRules, List<String> bypassRules, boolean reverseBypass) {
        this.mProxyRules = proxyRules;
        this.mBypassRules = bypassRules;
        this.mReverseBypass = reverseBypass;
    }

    public List<ProxyRule> getProxyRules() {
        return Collections.unmodifiableList(this.mProxyRules);
    }

    public List<String> getBypassRules() {
        return Collections.unmodifiableList(this.mBypassRules);
    }

    public boolean isReverseBypassEnabled() {
        return this.mReverseBypass;
    }
}
