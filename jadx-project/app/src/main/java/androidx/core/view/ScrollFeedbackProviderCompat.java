package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class ScrollFeedbackProviderCompat {
    private final ScrollFeedbackProviderImpl mImpl;

    /* JADX INFO: renamed from: androidx.core.view.ScrollFeedbackProviderCompat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class ScrollFeedbackProviderApi35Impl implements ScrollFeedbackProviderImpl {
        private final ScrollFeedbackProvider mProvider;

        ScrollFeedbackProviderApi35Impl(View view) {
            this.mProvider = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onSnapToItem(int inputDeviceId, int source, int axis) {
            this.mProvider.onSnapToItem(inputDeviceId, source, axis);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollLimit(int inputDeviceId, int source, int axis, boolean isStart) {
            this.mProvider.onScrollLimit(inputDeviceId, source, axis, isStart);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollProgress(int inputDeviceId, int source, int axis, int deltaInPixels) {
            this.mProvider.onScrollProgress(inputDeviceId, source, axis, deltaInPixels);
        }
    }

    private static class ScrollFeedbackProviderBaseImpl implements ScrollFeedbackProviderImpl {
        private ScrollFeedbackProviderBaseImpl() {
        }

        /* synthetic */ ScrollFeedbackProviderBaseImpl(AnonymousClass1 x0) {
            this();
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onSnapToItem(int inputDeviceId, int source, int axis) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollLimit(int inputDeviceId, int source, int axis, boolean isStart) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollProgress(int inputDeviceId, int source, int axis, int deltaInPixels) {
        }
    }

    private interface ScrollFeedbackProviderImpl {
        void onScrollLimit(int r1, int r2, int r3, boolean r4);

        void onScrollProgress(int r1, int r2, int r3, int r4);

        void onSnapToItem(int r1, int r2, int r3);
    }

    private ScrollFeedbackProviderCompat(View view) {
        if (Build.VERSION.SDK_INT < 35) goto L5;
        this.mImpl = new ScrollFeedbackProviderApi35Impl(view);
        return;
    L5:
        this.mImpl = new ScrollFeedbackProviderBaseImpl(null);
    }

    public static ScrollFeedbackProviderCompat createProvider(View view) {
        return new ScrollFeedbackProviderCompat(view);
    }

    public void onSnapToItem(int inputDeviceId, int source, int axis) {
        this.mImpl.onSnapToItem(inputDeviceId, source, axis);
    }

    public void onScrollLimit(int inputDeviceId, int source, int axis, boolean isStart) {
        this.mImpl.onScrollLimit(inputDeviceId, source, axis, isStart);
    }

    public void onScrollProgress(int inputDeviceId, int source, int axis, int deltaInPixels) {
        this.mImpl.onScrollProgress(inputDeviceId, source, axis, deltaInPixels);
    }
}
