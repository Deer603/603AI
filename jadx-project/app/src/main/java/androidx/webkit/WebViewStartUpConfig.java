package androidx.webkit;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class WebViewStartUpConfig {
    private final Executor mExecutor;
    private final boolean mShouldRunUiThreadStartUpTasks;

    /* JADX INFO: renamed from: androidx.webkit.WebViewStartUpConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private final Executor mExecutor;
        private boolean mShouldRunUiThreadStartUpTasks;

        public Builder(Executor executor) {
            this.mShouldRunUiThreadStartUpTasks = true;
            this.mExecutor = executor;
        }

        public Builder setShouldRunUiThreadStartUpTasks(boolean shouldRunUiThreadStartUpTasks) {
            this.mShouldRunUiThreadStartUpTasks = shouldRunUiThreadStartUpTasks;
            return this;
        }

        public WebViewStartUpConfig build() {
            return new WebViewStartUpConfig(this.mExecutor, this.mShouldRunUiThreadStartUpTasks, null);
        }
    }

    /* synthetic */ WebViewStartUpConfig(Executor x0, boolean x1, AnonymousClass1 x2) {
        this(x0, x1);
    }

    private WebViewStartUpConfig(Executor executor, boolean shouldRunUiThreadStartUpTasks) {
        this.mExecutor = executor;
        this.mShouldRunUiThreadStartUpTasks = shouldRunUiThreadStartUpTasks;
    }

    public Executor getBackgroundExecutor() {
        return this.mExecutor;
    }

    public boolean shouldRunUiThreadStartUpTasks() {
        return this.mShouldRunUiThreadStartUpTasks;
    }
}
