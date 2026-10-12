package androidx.webkit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class Policy {
    private final List<ConfigRunnable> mBehaviors;

    /* JADX INFO: renamed from: androidx.webkit.Policy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        final List<ConfigRunnable> mBehaviors;

        public Builder() {
            this.mBehaviors = new ArrayList();
        }

        public Policy build() {
            return new Policy(this.mBehaviors, null);
        }
    }

    private interface ConfigRunnable {
        void configure(WebViewBuilderBoundaryInterface.Config r1) throws WebViewBuilderException;
    }

    /* synthetic */ Policy(List x0, AnonymousClass1 x1) {
        this(x0);
    }

    private Policy(List<ConfigRunnable> behaviors) {
        this.mBehaviors = behaviors;
    }

    void configure(WebViewBuilderBoundaryInterface.Config config) throws WebViewBuilderException {
        Iterator<ConfigRunnable> r0 = this.mBehaviors.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ConfigRunnable behavior = r0.next();
        behavior.configure(config);
        goto L4
    }
}
