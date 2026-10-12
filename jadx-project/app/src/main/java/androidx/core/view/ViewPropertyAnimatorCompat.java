package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewPropertyAnimatorCompat {
    private final WeakReference<View> mView;

    static class Api21Impl {
        private Api21Impl() {
        }

        static ViewPropertyAnimator translationZBy(ViewPropertyAnimator viewPropertyAnimator, float value) {
            return viewPropertyAnimator.translationZBy(value);
        }

        static ViewPropertyAnimator translationZ(ViewPropertyAnimator viewPropertyAnimator, float value) {
            return viewPropertyAnimator.translationZ(value);
        }

        static ViewPropertyAnimator z(ViewPropertyAnimator viewPropertyAnimator, float value) {
            return viewPropertyAnimator.z(value);
        }

        static ViewPropertyAnimator zBy(ViewPropertyAnimator viewPropertyAnimator, float value) {
            return viewPropertyAnimator.zBy(value);
        }
    }

    ViewPropertyAnimatorCompat(View view) {
        this.mView = new WeakReference(view);
    }

    public ViewPropertyAnimatorCompat setDuration(long value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().setDuration(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat alpha(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().alpha(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat alphaBy(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().alphaBy(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat translationX(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().translationX(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat translationY(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().translationY(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat withEndAction(Runnable runnable) {
        View view = this.mView.get();
        if (view == null) goto L5;
        ViewPropertyAnimator animator = view.animate();
        animator.withEndAction(runnable);
    L5:
        return this;
    }

    public long getDuration() {
        View view = this.mView.get();
        if (view != null) goto L5;
        return 0;
    L5:
        return view.animate().getDuration();
    }

    public ViewPropertyAnimatorCompat setInterpolator(Interpolator value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().setInterpolator(value);
    L5:
        return this;
    }

    public Interpolator getInterpolator() {
        View view = this.mView.get();
        if (view == null) goto L6;
        ViewPropertyAnimator animator = view.animate();
        return (Interpolator) animator.getInterpolator();
    L6:
        return null;
    }

    public ViewPropertyAnimatorCompat setStartDelay(long value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().setStartDelay(value);
    L5:
        return this;
    }

    public long getStartDelay() {
        View view = this.mView.get();
        if (view != null) goto L5;
        return 0;
    L5:
        return view.animate().getStartDelay();
    }

    public ViewPropertyAnimatorCompat rotation(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().rotation(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat rotationBy(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().rotationBy(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat rotationX(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().rotationX(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat rotationXBy(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().rotationXBy(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat rotationY(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().rotationY(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat rotationYBy(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().rotationYBy(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat scaleX(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().scaleX(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat scaleXBy(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().scaleXBy(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat scaleY(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().scaleY(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat scaleYBy(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().scaleYBy(value);
    L5:
        return this;
    }

    public void cancel() {
        View view = this.mView.get();
        if (view == null) goto L6;
        view.animate().cancel();
        return;
    }

    public ViewPropertyAnimatorCompat x(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().x(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat xBy(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().xBy(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat y(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().y(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat yBy(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().yBy(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat translationXBy(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().translationXBy(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat translationYBy(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        view.animate().translationYBy(value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat translationZBy(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        ViewPropertyAnimator animator = view.animate();
        Api21Impl.translationZBy(animator, value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat translationZ(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        ViewPropertyAnimator animator = view.animate();
        Api21Impl.translationZ(animator, value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat z(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        ViewPropertyAnimator animator = view.animate();
        Api21Impl.z(animator, value);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat zBy(float value) {
        View view = this.mView.get();
        if (view == null) goto L5;
        ViewPropertyAnimator animator = view.animate();
        Api21Impl.zBy(animator, value);
    L5:
        return this;
    }

    public void start() {
        View view = this.mView.get();
        if (view == null) goto L6;
        view.animate().start();
        return;
    }

    public ViewPropertyAnimatorCompat withLayer() {
        View view = this.mView.get();
        if (view == null) goto L5;
        ViewPropertyAnimator animator = view.animate();
        animator.withLayer();
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat withStartAction(Runnable runnable) {
        View view = this.mView.get();
        if (view == null) goto L5;
        ViewPropertyAnimator animator = view.animate();
        animator.withStartAction(runnable);
    L5:
        return this;
    }

    public ViewPropertyAnimatorCompat setListener(ViewPropertyAnimatorListener listener) {
        View view = this.mView.get();
        if (view == null) goto L5;
        setListenerInternal(view, listener);
    L5:
        return this;
    }

    private void setListenerInternal(final View view, final ViewPropertyAnimatorListener listener) {
        if (listener == null) goto L4;
        view.animate().setListener(new AnonymousClass1(this, listener, view));
        return;
    L4:
        view.animate().setListener(null);
    }

    public ViewPropertyAnimatorCompat setUpdateListener(final ViewPropertyAnimatorUpdateListener listener) {
        final View view = this.mView.get();
        if (view == null) goto L8;
        ValueAnimator.AnimatorUpdateListener wrapped = null;
        if (listener == null) goto L7;
        wrapped = new ViewPropertyAnimatorCompat$$ExternalSyntheticLambda0(listener, view);
    L7:
        ViewPropertyAnimator animator = view.animate();
        animator.setUpdateListener(wrapped);
    L8:
        return this;
    }

    static /* synthetic */ void lambda$setUpdateListener$0(ViewPropertyAnimatorUpdateListener listener, View view, ValueAnimator valueAnimator) {
        listener.onAnimationUpdate(view);
    }
}
