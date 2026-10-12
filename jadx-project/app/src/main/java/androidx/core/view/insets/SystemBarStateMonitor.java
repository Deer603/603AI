package androidx.core.view.insets;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
class SystemBarStateMonitor {
    private final ArrayList<Callback> mCallbacks;
    private int mColorHint;
    private final View mDetector;
    private Insets mInsets;
    private Insets mInsetsIgnoringVisibility;

    interface Callback {
        void onAnimationEnd();

        void onAnimationProgress(int r1, Insets r2, RectF r3);

        void onAnimationStart();

        void onColorHintChanged(int r1);

        void onInsetsChanged(Insets r1, Insets r2);
    }

    static /* synthetic */ int access$000(SystemBarStateMonitor x0) {
        return x0.mColorHint;
    }

    static /* synthetic */ int access$002(SystemBarStateMonitor x0, int x1) {
        x0.mColorHint = x1;
        return x1;
    }

    static /* synthetic */ ArrayList access$100(SystemBarStateMonitor x0) {
        return x0.mCallbacks;
    }

    static /* synthetic */ Insets access$200(SystemBarStateMonitor x0, WindowInsetsCompat x1) {
        return x0.getInsets(x1);
    }

    SystemBarStateMonitor(final ViewGroup rootView) {
        this.mCallbacks = new ArrayList();
        this.mInsets = Insets.NONE;
        this.mInsetsIgnoringVisibility = Insets.NONE;
        Drawable drawable = rootView.getBackground();
        final int r2 = 0;
        if ((drawable instanceof ColorDrawable) == false) goto L5;
        int r1 = ((ColorDrawable) drawable).getColor();
    L6:
        this.mColorHint = r1;
        final Context r3 = rootView.getContext();
        this.mDetector = new AnonymousClass1(this, r3, rootView);
        this.mDetector.setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this.mDetector, new SystemBarStateMonitor$$ExternalSyntheticLambda0(this));
        ViewCompat.setWindowInsetsAnimationCallback(this.mDetector, new AnonymousClass2(this, r2));
        rootView.addView(this.mDetector, 0);
        return;
    L5:
        r1 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-core-view-insets-SystemBarStateMonitor, reason: not valid java name */
    /* synthetic */ WindowInsetsCompat m7259lambda$new$0$androidxcoreviewinsetsSystemBarStateMonitor(View view, WindowInsetsCompat windowInsets) {
        Insets insets = getInsets(windowInsets);
        Insets insetsIgnoringVis = getInsetsIgnoringVisibility(windowInsets);
        if (insets.equals(this.mInsets) == true) goto L5;
    L6:
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insetsIgnoringVis;
        int i = this.mCallbacks.size() - 1;
    L7:
        if (i < 0) goto L9;
        this.mCallbacks.get(i).onInsetsChanged(insets, insetsIgnoringVis);
        i = i - 1;
    L9:
        return windowInsets;
    L5:
        if (insetsIgnoringVis.equals(this.mInsetsIgnoringVisibility) == true) goto L9;
        goto L6
    }

    private Insets getInsets(WindowInsetsCompat w) {
        Insets systemBarInsets = w.getInsets(WindowInsetsCompat.Type.systemBars());
        Insets tappableElementInsets = w.getInsets(WindowInsetsCompat.Type.tappableElement());
        return Insets.min(systemBarInsets, tappableElementInsets);
    }

    private Insets getInsetsIgnoringVisibility(WindowInsetsCompat w) {
        Insets systemBarInsets = w.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Insets tappableElementInsets = w.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement());
        return Insets.min(systemBarInsets, tappableElementInsets);
    }

    void addCallback(Callback callback) {
        if (this.mCallbacks.contains(callback) == false) goto L5;
        return;
    L5:
        this.mCallbacks.add(callback);
        callback.onInsetsChanged(this.mInsets, this.mInsetsIgnoringVisibility);
        callback.onColorHintChanged(this.mColorHint);
    }

    void removeCallback(Callback callback) {
        this.mCallbacks.remove(callback);
    }

    boolean hasCallback() {
        return !this.mCallbacks.isEmpty();
    }

    void detachFromWindow() {
        this.mDetector.post(new SystemBarStateMonitor$$ExternalSyntheticLambda1(this));
    }

    /* JADX INFO: renamed from: lambda$detachFromWindow$1$androidx-core-view-insets-SystemBarStateMonitor, reason: not valid java name */
    /* synthetic */ void m7258xf3edbe07() {
        ViewParent parent = this.mDetector.getParent();
        if ((parent instanceof ViewGroup) == false) goto L6;
        ((ViewGroup) parent).removeView(this.mDetector);
        return;
    }
}
