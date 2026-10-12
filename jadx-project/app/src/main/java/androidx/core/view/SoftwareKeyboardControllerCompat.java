package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class SoftwareKeyboardControllerCompat {
    private final Impl mImpl;

    private static class Impl {
        Impl() {
        }

        void show() {
        }

        void hide() {
        }
    }

    private static class Impl20 extends Impl {
        private final View mView;

        Impl20(View view) {
            this.mView = view;
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void show() {
            View view = this.mView;
            if (view != null) goto L6;
            return;
        L6:
            if (view.isInEditMode() == false) goto L8;
        L11:
            view.requestFocus();
        L12:
            if (view != null) goto L14;
            view = this.mView.getRootView().findViewById(R.id.content);
        L14:
            if (view != null) goto L16;
            return;
        L16:
            if (view.hasWindowFocus() == false) goto L20;
            final View finalView = view;
            finalView.post(new SoftwareKeyboardControllerCompat$Impl20$$ExternalSyntheticLambda0(finalView));
            return;
        L20:
            return;
        L8:
            if (view.onCheckIsTextEditor() == true) goto L11;
            view = view.getRootView().findFocus();
            goto L12
        }

        static /* synthetic */ void lambda$show$0(View finalView) {
            InputMethodManager imm = (InputMethodManager) finalView.getContext().getSystemService("input_method");
            imm.showSoftInput(finalView, 0);
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void hide() {
            if (this.mView == null) goto L6;
            ((InputMethodManager) this.mView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
            return;
        }
    }

    private static class Impl30 extends Impl20 {
        private View mView;
        private WindowInsetsController mWindowInsetsController;

        Impl30(View view) {
            super(view);
            this.mView = view;
        }

        Impl30(WindowInsetsController windowInsetsController) {
            super(null);
            this.mWindowInsetsController = windowInsetsController;
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void show() {
            if (this.mView != null) goto L5;
        L7:
            WindowInsetsController insetsController = null;
            if (this.mWindowInsetsController == null) goto L11;
            insetsController = this.mWindowInsetsController;
        L13:
            if (insetsController == null) goto L15;
            insetsController.show(WindowInsets.Type.ime());
        L15:
            super.show();
            return;
        L11:
            if (this.mView == null) goto L13;
            insetsController = this.mView.getWindowInsetsController();
            goto L13
        L5:
            if (Build.VERSION.SDK_INT >= 33) goto L7;
            InputMethodManager imm = (InputMethodManager) this.mView.getContext().getSystemService("input_method");
            imm.isActive();
            goto L7
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void hide() {
            WindowInsetsController insetsController = null;
            if (this.mWindowInsetsController == null) goto L6;
            insetsController = this.mWindowInsetsController;
        L8:
            if (insetsController == null) goto L15;
            final AtomicBoolean isImeInsetsControllable = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener listener = new SoftwareKeyboardControllerCompat$Impl30$$ExternalSyntheticLambda0(isImeInsetsControllable);
            insetsController.addOnControllableInsetsChangedListener(listener);
            if (isImeInsetsControllable.get() == false) goto L12;
        L14:
            insetsController.removeOnControllableInsetsChangedListener(listener);
            insetsController.hide(WindowInsets.Type.ime());
            return;
        L12:
            if (this.mView == null) goto L14;
            InputMethodManager imm = (InputMethodManager) this.mView.getContext().getSystemService("input_method");
            imm.hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
            goto L14
        L15:
            super.hide();
            return;
        L6:
            if (this.mView == null) goto L8;
            insetsController = this.mView.getWindowInsetsController();
            goto L8
        }

        static /* synthetic */ void lambda$hide$0(AtomicBoolean isImeInsetsControllable, WindowInsetsController windowInsetsController, int typeMask) {
            if ((typeMask & 8) == 0) goto L5;
            boolean r0 = true;
        L6:
            isImeInsetsControllable.set(r0);
            return;
        L5:
            r0 = false;
            goto L6
        }
    }

    public SoftwareKeyboardControllerCompat(View view) {
        if (Build.VERSION.SDK_INT < 30) goto L5;
        this.mImpl = new Impl30(view);
        return;
    L5:
        this.mImpl = new Impl20(view);
    }

    @Deprecated
    SoftwareKeyboardControllerCompat(WindowInsetsController windowInsetsController) {
        this.mImpl = new Impl30(windowInsetsController);
    }

    public void show() {
        this.mImpl.show();
    }

    public void hide() {
        this.mImpl.hide();
    }
}
