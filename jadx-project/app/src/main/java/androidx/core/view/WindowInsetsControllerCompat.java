package androidx.core.view;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class WindowInsetsControllerCompat {
    public static final int BEHAVIOR_DEFAULT = 1;

    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;

    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
    private final Impl mImpl;

    private static class Impl {
        static final int KEY_BEHAVIOR = 356039078;

        Impl() {
        }

        void show(int types) {
        }

        void hide(int types) {
        }

        void controlWindowInsetsAnimation(int types, long durationMillis, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat listener) {
        }

        void setSystemBarsBehavior(int behavior) {
        }

        int getSystemBarsBehavior() {
            return 1;
        }

        public boolean isAppearanceLightStatusBars() {
            return false;
        }

        public void setAppearanceLightStatusBars(boolean isLight) {
        }

        public boolean isAppearanceLightNavigationBars() {
            return false;
        }

        public void setAppearanceLightNavigationBars(boolean isLight) {
        }

        void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener listener) {
        }

        void removeOnControllableInsetsChangedListener(OnControllableInsetsChangedListener listener) {
        }
    }

    private static class Impl20 extends Impl {
        private final SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;
        protected final Window mWindow;

        Impl20(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.mWindow = window;
            this.mSoftwareKeyboardControllerCompat = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void show(int typeMask) {
            int i = 1;
        L4:
            if (i > 512) goto L10;
            if ((typeMask & i) == 0) goto L9;
            showForType(i);
        L9:
            i = i << 1;
            goto L4
        }

        private void showForType(int type) {
            switch(type) {
                case 1: goto L7;
                case 2: goto L5;
                case 8: goto L4;
                default: goto L10;
            };
        L4:
            this.mSoftwareKeyboardControllerCompat.show();
            return;
        L5:
            unsetSystemUiFlag(2);
            return;
        L7:
            unsetSystemUiFlag(4);
            unsetWindowFlag(1024);
            return;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void hide(int typeMask) {
            int i = 1;
        L4:
            if (i > 512) goto L10;
            if ((typeMask & i) == 0) goto L9;
            hideForType(i);
        L9:
            i = i << 1;
            goto L4
        }

        private void hideForType(int type) {
            switch(type) {
                case 1: goto L7;
                case 2: goto L5;
                case 8: goto L4;
                default: goto L10;
            };
        L4:
            this.mSoftwareKeyboardControllerCompat.hide();
            return;
        L5:
            setSystemUiFlag(2);
            return;
        L7:
            setSystemUiFlag(4);
            return;
        }

        protected void setSystemUiFlag(int systemUiFlag) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | systemUiFlag);
        }

        protected void unsetSystemUiFlag(int systemUiFlag) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~systemUiFlag));
        }

        protected void setWindowFlag(int windowFlag) {
            this.mWindow.addFlags(windowFlag);
        }

        protected void unsetWindowFlag(int windowFlag) {
            this.mWindow.clearFlags(windowFlag);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void controlWindowInsetsAnimation(int types, long durationMillis, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat listener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void setSystemBarsBehavior(int behavior) {
            this.mWindow.getDecorView().setTag(356039078, Integer.valueOf(behavior));
            switch(behavior) {
                case 0: goto L7;
                case 1: goto L6;
                case 2: goto L5;
                default: goto L11;
            };
        L5:
            unsetSystemUiFlag(2048);
            setSystemUiFlag(4096);
            return;
        L6:
            unsetSystemUiFlag(4096);
            setSystemUiFlag(2048);
            return;
        L7:
            unsetSystemUiFlag(6144);
            return;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        int getSystemBarsBehavior() {
            Object behaviorTag = this.mWindow.getDecorView().getTag(356039078);
            if (behaviorTag != null) goto L7;
            return 1;
        L7:
            return ((Integer) behaviorTag).intValue();
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener listener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void removeOnControllableInsetsChangedListener(OnControllableInsetsChangedListener listener) {
        }
    }

    private static class Impl23 extends Impl20 {
        Impl23(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            if ((this.mWindow.getDecorView().getSystemUiVisibility() & 8192) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean isLight) {
            if (isLight == false) goto L5;
            unsetWindowFlag(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            setWindowFlag(Integer.MIN_VALUE);
            setSystemUiFlag(8192);
            return;
        L5:
            unsetSystemUiFlag(8192);
        }
    }

    private static class Impl26 extends Impl23 {
        Impl26(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            if ((this.mWindow.getDecorView().getSystemUiVisibility() & 16) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean isLight) {
            if (isLight == false) goto L5;
            unsetWindowFlag(134217728);
            setWindowFlag(Integer.MIN_VALUE);
            setSystemUiFlag(16);
            return;
        L5:
            unsetSystemUiFlag(16);
        }
    }

    private static class Impl30 extends Impl {
        final WindowInsetsControllerCompat mCompatController;
        final WindowInsetsController mInsetsController;
        private final SimpleArrayMap<OnControllableInsetsChangedListener, WindowInsetsController.OnControllableInsetsChangedListener> mListeners;
        final SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;
        protected Window mWindow;

        Impl30(Window window, WindowInsetsControllerCompat compatController, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this(window.getInsetsController(), compatController, softwareKeyboardControllerCompat);
            this.mWindow = window;
        }

        Impl30(WindowInsetsController insetsController, WindowInsetsControllerCompat compatController, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.mListeners = new SimpleArrayMap();
            this.mInsetsController = insetsController;
            this.mCompatController = compatController;
            this.mSoftwareKeyboardControllerCompat = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void show(int types) {
            if ((types & 8) == 0) goto L5;
            this.mSoftwareKeyboardControllerCompat.show();
        L5:
            this.mInsetsController.show(types & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void hide(int types) {
            if ((types & 8) == 0) goto L5;
            this.mSoftwareKeyboardControllerCompat.hide();
        L5:
            this.mInsetsController.hide(types & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            this.mInsetsController.setSystemBarsAppearance(0, 0);
            if ((this.mInsetsController.getSystemBarsAppearance() & 8) == 0) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean isLight) {
            Window r0 = this.mWindow;
            if (isLight == false) goto L7;
            if (r0 == null) goto L6;
            setSystemUiFlag(8192);
        L6:
            this.mInsetsController.setSystemBarsAppearance(8, 8);
            return;
        L7:
            if (r0 == null) goto L9;
            unsetSystemUiFlag(8192);
        L9:
            this.mInsetsController.setSystemBarsAppearance(0, 8);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            this.mInsetsController.setSystemBarsAppearance(0, 0);
            if ((this.mInsetsController.getSystemBarsAppearance() & 16) == 0) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean isLight) {
            Window r0 = this.mWindow;
            if (isLight == false) goto L7;
            if (r0 == null) goto L6;
            setSystemUiFlag(16);
        L6:
            this.mInsetsController.setSystemBarsAppearance(16, 16);
            return;
        L7:
            if (r0 == null) goto L9;
            unsetSystemUiFlag(16);
        L9:
            this.mInsetsController.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void controlWindowInsetsAnimation(int types, long durationMillis, Interpolator interpolator, CancellationSignal cancellationSignal, final WindowInsetsAnimationControlListenerCompat listener) {
            WindowInsetsAnimationControlListener fwListener = new AnonymousClass1(this, listener);
            this.mInsetsController.controlWindowInsetsAnimation(types, durationMillis, interpolator, cancellationSignal, fwListener);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void setSystemBarsBehavior(int behavior) {
            if (this.mWindow == null) goto L11;
            this.mWindow.getDecorView().setTag(356039078, Integer.valueOf(behavior));
            switch(behavior) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                default: goto L16;
            };
        L7:
            unsetSystemUiFlag(2048);
            setSystemUiFlag(4096);
            return;
        L8:
            unsetSystemUiFlag(4096);
            setSystemUiFlag(2048);
            return;
        L9:
            unsetSystemUiFlag(6144);
            return;
        L16:
            return;
        L11:
            this.mInsetsController.setSystemBarsBehavior(behavior);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        int getSystemBarsBehavior() {
            if (this.mWindow == null) goto L10;
            Object behaviorTag = this.mWindow.getDecorView().getTag(356039078);
            if (behaviorTag != null) goto L11;
            return 1;
        L11:
            return ((Integer) behaviorTag).intValue();
        L10:
            return this.mInsetsController.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void addOnControllableInsetsChangedListener(final OnControllableInsetsChangedListener listener) {
            if (this.mListeners.containsKey(listener) == false) goto L5;
            return;
        L5:
            WindowInsetsController.OnControllableInsetsChangedListener fwListener = new WindowInsetsControllerCompat$Impl30$$ExternalSyntheticLambda0(this, listener);
            this.mListeners.put(listener, fwListener);
            this.mInsetsController.addOnControllableInsetsChangedListener(fwListener);
        }

        /* JADX INFO: renamed from: lambda$addOnControllableInsetsChangedListener$0$androidx-core-view-WindowInsetsControllerCompat$Impl30, reason: not valid java name */
        /* synthetic */ void m7255xe96d8c51(OnControllableInsetsChangedListener listener, WindowInsetsController controller, int typeMask) {
            if (this.mInsetsController != controller) goto L6;
            listener.onControllableInsetsChanged(this.mCompatController, typeMask);
            return;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void removeOnControllableInsetsChangedListener(OnControllableInsetsChangedListener listener) {
            WindowInsetsController.OnControllableInsetsChangedListener fwListener = this.mListeners.remove(listener);
            if (fwListener == null) goto L6;
            this.mInsetsController.removeOnControllableInsetsChangedListener(fwListener);
            return;
        }

        protected void unsetSystemUiFlag(int systemUiFlag) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~systemUiFlag));
        }

        protected void setSystemUiFlag(int systemUiFlag) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | systemUiFlag);
        }
    }

    private static class Impl31 extends Impl30 {
        Impl31(Window window, WindowInsetsControllerCompat compatController, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, compatController, softwareKeyboardControllerCompat);
        }

        Impl31(WindowInsetsController insetsController, WindowInsetsControllerCompat compatController, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(insetsController, compatController, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        void setSystemBarsBehavior(int behavior) {
            this.mInsetsController.setSystemBarsBehavior(behavior);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        int getSystemBarsBehavior() {
            return this.mInsetsController.getSystemBarsBehavior();
        }
    }

    private static class Impl35 extends Impl31 {
        Impl35(Window window, WindowInsetsControllerCompat compatController, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, compatController, softwareKeyboardControllerCompat);
        }

        Impl35(WindowInsetsController insetsController, WindowInsetsControllerCompat compatController, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(insetsController, compatController, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            if ((this.mInsetsController.getSystemBarsAppearance() & 8) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            if ((this.mInsetsController.getSystemBarsAppearance() & 16) == 0) goto L5;
            return true;
        L5:
            return false;
        }
    }

    public interface OnControllableInsetsChangedListener {
        void onControllableInsetsChanged(WindowInsetsControllerCompat r1, int r2);
    }

    @Deprecated
    private WindowInsetsControllerCompat(WindowInsetsController insetsController) {
        if (Build.VERSION.SDK_INT < 35) goto L5;
        this.mImpl = new Impl35(insetsController, this, new SoftwareKeyboardControllerCompat(insetsController));
        return;
    L5:
        this.mImpl = new Impl30(insetsController, this, new SoftwareKeyboardControllerCompat(insetsController));
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        if (Build.VERSION.SDK_INT < 35) goto L6;
        this.mImpl = new Impl35(window, this, softwareKeyboardControllerCompat);
        return;
    L6:
        if (Build.VERSION.SDK_INT < 30) goto L8;
        this.mImpl = new Impl30(window, this, softwareKeyboardControllerCompat);
        return;
    L8:
        this.mImpl = new Impl26(window, softwareKeyboardControllerCompat);
    }

    @Deprecated
    public static WindowInsetsControllerCompat toWindowInsetsControllerCompat(WindowInsetsController insetsController) {
        return new WindowInsetsControllerCompat(insetsController);
    }

    public void show(int types) {
        this.mImpl.show(types);
    }

    public void hide(int types) {
        this.mImpl.hide(types);
    }

    public boolean isAppearanceLightStatusBars() {
        return this.mImpl.isAppearanceLightStatusBars();
    }

    public void setAppearanceLightStatusBars(boolean isLight) {
        this.mImpl.setAppearanceLightStatusBars(isLight);
    }

    public boolean isAppearanceLightNavigationBars() {
        return this.mImpl.isAppearanceLightNavigationBars();
    }

    public void setAppearanceLightNavigationBars(boolean isLight) {
        this.mImpl.setAppearanceLightNavigationBars(isLight);
    }

    public void controlWindowInsetsAnimation(int types, long durationMillis, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat listener) {
        this.mImpl.controlWindowInsetsAnimation(types, durationMillis, interpolator, cancellationSignal, listener);
    }

    public void setSystemBarsBehavior(int behavior) {
        this.mImpl.setSystemBarsBehavior(behavior);
    }

    public int getSystemBarsBehavior() {
        return this.mImpl.getSystemBarsBehavior();
    }

    public void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener listener) {
        this.mImpl.addOnControllableInsetsChangedListener(listener);
    }

    public void removeOnControllableInsetsChangedListener(OnControllableInsetsChangedListener listener) {
        this.mImpl.removeOnControllableInsetsChangedListener(listener);
    }
}
