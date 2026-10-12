package androidx.core.view.insets;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Protection {
    private static final long DEFAULT_DURATION_IN = 333;
    private static final long DEFAULT_DURATION_OUT = 166;
    private static final Interpolator DEFAULT_INTERPOLATOR_FADE_IN = null;
    private static final Interpolator DEFAULT_INTERPOLATOR_FADE_OUT = null;
    private static final Interpolator DEFAULT_INTERPOLATOR_MOVE_IN = null;
    private static final Interpolator DEFAULT_INTERPOLATOR_MOVE_OUT = null;
    private final Attributes mAttributes;
    private Object mController;
    private Insets mInsets;
    private Insets mInsetsIgnoringVisibility;
    private final int mSide;
    private float mSystemAlpha;
    private float mSystemInsetAmount;
    private float mUserAlpha;
    private ValueAnimator mUserAlphaAnimator;
    private float mUserInsetAmount;
    private ValueAnimator mUserInsetAmountAnimator;

    static class Attributes {
        private static final int UNSPECIFIED = -1;
        private float mAlpha;
        private Callback mCallback;
        private Drawable mDrawable;
        private int mHeight;
        private Insets mMargin;
        private float mTranslationX;
        private float mTranslationY;
        private boolean mVisible;
        private int mWidth;

        interface Callback {
            default void onWidthChanged(int width) {
            }

            default void onHeightChanged(int height) {
            }

            default void onMarginChanged(Insets margin) {
            }

            default void onVisibilityChanged(boolean visible) {
            }

            default void onDrawableChanged(Drawable drawable) {
            }

            default void onTranslationXChanged(float translationX) {
            }

            default void onTranslationYChanged(float translationY) {
            }

            default void onAlphaChanged(float alpha) {
            }
        }

        Attributes() {
            this.mWidth = -1;
            this.mHeight = -1;
            this.mMargin = Insets.NONE;
            this.mVisible = false;
            this.mDrawable = null;
            this.mTranslationX = 0.0f;
            this.mTranslationY = 0.0f;
            this.mAlpha = 1.0f;
        }

        static /* synthetic */ void access$000(Attributes x0, Insets x1) {
            x0.setMargin(x1);
        }

        static /* synthetic */ void access$100(Attributes x0, int x1) {
            x0.setWidth(x1);
        }

        static /* synthetic */ void access$200(Attributes x0, int x1) {
            x0.setHeight(x1);
        }

        static /* synthetic */ void access$300(Attributes x0, boolean x1) {
            x0.setVisible(x1);
        }

        static /* synthetic */ void access$400(Attributes x0, float x1) {
            x0.setAlpha(x1);
        }

        static /* synthetic */ int access$500(Attributes x0) {
            return x0.mWidth;
        }

        static /* synthetic */ void access$600(Attributes x0, float x1) {
            x0.setTranslationX(x1);
        }

        static /* synthetic */ int access$700(Attributes x0) {
            return x0.mHeight;
        }

        static /* synthetic */ void access$800(Attributes x0, float x1) {
            x0.setTranslationY(x1);
        }

        static /* synthetic */ void access$900(Attributes x0, Drawable x1) {
            x0.setDrawable(x1);
        }

        int getWidth() {
            return this.mWidth;
        }

        int getHeight() {
            return this.mHeight;
        }

        Insets getMargin() {
            return this.mMargin;
        }

        boolean isVisible() {
            return this.mVisible;
        }

        Drawable getDrawable() {
            return this.mDrawable;
        }

        float getTranslationX() {
            return this.mTranslationX;
        }

        float getTranslationY() {
            return this.mTranslationY;
        }

        float getAlpha() {
            return this.mAlpha;
        }

        private void setWidth(int width) {
            if (this.mWidth == width) goto L8;
            this.mWidth = width;
            if (this.mCallback == null) goto L9;
            this.mCallback.onWidthChanged(width);
            return;
        L9:
            return;
        }

        private void setHeight(int height) {
            if (this.mHeight == height) goto L8;
            this.mHeight = height;
            if (this.mCallback == null) goto L9;
            this.mCallback.onHeightChanged(height);
            return;
        L9:
            return;
        }

        private void setMargin(Insets margin) {
            if (this.mMargin.equals(margin) == true) goto L8;
            this.mMargin = margin;
            if (this.mCallback == null) goto L9;
            this.mCallback.onMarginChanged(margin);
            return;
        L9:
            return;
        }

        private void setVisible(boolean visible) {
            if (this.mVisible == visible) goto L8;
            this.mVisible = visible;
            if (this.mCallback == null) goto L9;
            this.mCallback.onVisibilityChanged(visible);
            return;
        L9:
            return;
        }

        private void setDrawable(Drawable drawable) {
            this.mDrawable = drawable;
            if (this.mCallback == null) goto L6;
            this.mCallback.onDrawableChanged(drawable);
            return;
        }

        private void setTranslationX(float translationX) {
            if (this.mTranslationX == translationX) goto L8;
            this.mTranslationX = translationX;
            if (this.mCallback == null) goto L9;
            this.mCallback.onTranslationXChanged(translationX);
            return;
        L9:
            return;
        }

        private void setTranslationY(float translationY) {
            if (this.mTranslationY == translationY) goto L8;
            this.mTranslationY = translationY;
            if (this.mCallback == null) goto L9;
            this.mCallback.onTranslationYChanged(translationY);
            return;
        L9:
            return;
        }

        private void setAlpha(float alpha) {
            if (this.mAlpha == alpha) goto L8;
            this.mAlpha = alpha;
            if (this.mCallback == null) goto L9;
            this.mCallback.onAlphaChanged(alpha);
            return;
        L9:
            return;
        }

        void setCallback(Callback callback) {
            if (this.mCallback == null) goto L8;
            if (callback == null) goto L8;
            throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
        L8:
            this.mCallback = callback;
        }
    }

    static {
        DEFAULT_INTERPOLATOR_MOVE_IN = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        DEFAULT_INTERPOLATOR_MOVE_OUT = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        DEFAULT_INTERPOLATOR_FADE_IN = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        DEFAULT_INTERPOLATOR_FADE_OUT = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public Protection(int side) {
        this.mAttributes = new Attributes();
        this.mInsets = Insets.NONE;
        this.mInsetsIgnoringVisibility = Insets.NONE;
        this.mSystemAlpha = 1.0f;
        this.mUserAlpha = 1.0f;
        this.mSystemInsetAmount = 1.0f;
        this.mUserInsetAmount = 1.0f;
        this.mController = null;
        this.mUserAlphaAnimator = null;
        this.mUserInsetAmountAnimator = null;
        switch(side) {
            case 1: goto L6;
            case 2: goto L6;
            case 4: goto L6;
            case 8: goto L6;
            default: goto L5;
        };
    L6:
        this.mSide = side;
        return;
    L5:
        throw new IllegalArgumentException("Unexpected side: " + side);
    }

    public int getSide() {
        return this.mSide;
    }

    Attributes getAttributes() {
        return this.mAttributes;
    }

    int getThickness(int inset) {
        return inset;
    }

    boolean occupiesCorners() {
        return false;
    }

    Insets dispatchInsets(Insets insets, Insets insetsIgnoringVisibility, Insets consumed) {
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insetsIgnoringVisibility;
        Attributes.access$000(this.mAttributes, consumed);
        return updateLayout();
    }

    Insets updateLayout() {
        Insets consumed = Insets.NONE;
        boolean r2 = false;
        switch(this.mSide) {
            case 1: goto L14;
            case 2: goto L11;
            case 4: goto L8;
            case 8: goto L5;
            default: goto L4;
        };
    L4:
        int inset = 0;
    L17:
        if (inset <= 0) goto L19;
        r2 = true;
    L19:
        setSystemVisible(r2);
        float r3 = 1.0f;
        if (inset <= 0) goto L22;
        float r4 = 1.0f;
    L23:
        setSystemAlpha(r4);
        if (inset > 0) goto L27;
        r3 = 0.0f;
    L27:
        setSystemInsetAmount(r3);
        return consumed;
    L22:
        r4 = 0.0f;
        goto L23
    L5:
        inset = this.mInsets.bottom;
        Attributes.access$200(this.mAttributes, getThickness(this.mInsetsIgnoringVisibility.bottom));
        if (occupiesCorners() == false) goto L17;
        consumed = Insets.of(0, 0, 0, getThickness(inset));
        goto L17
    L8:
        inset = this.mInsets.right;
        Attributes.access$100(this.mAttributes, getThickness(this.mInsetsIgnoringVisibility.right));
        if (occupiesCorners() == false) goto L17;
        consumed = Insets.of(0, 0, getThickness(inset), 0);
        goto L17
    L11:
        inset = this.mInsets.top;
        Attributes.access$200(this.mAttributes, getThickness(this.mInsetsIgnoringVisibility.top));
        if (occupiesCorners() == false) goto L17;
        consumed = Insets.of(0, getThickness(inset), 0, 0);
        goto L17
    L14:
        inset = this.mInsets.left;
        Attributes.access$100(this.mAttributes, getThickness(this.mInsetsIgnoringVisibility.left));
        if (occupiesCorners() == false) goto L17;
        consumed = Insets.of(getThickness(inset), 0, 0, 0);
        goto L17
    }

    void dispatchColorHint(int color) {
    }

    Object getController() {
        return this.mController;
    }

    void setController(Object controller) {
        this.mController = controller;
    }

    void setSystemVisible(boolean visible) {
        Attributes.access$300(this.mAttributes, visible);
    }

    void setSystemAlpha(float alpha) {
        this.mSystemAlpha = alpha;
        updateAlpha();
    }

    public void setAlpha(float alpha) {
        if (alpha < 0.0f) goto L9;
        if (alpha > 1.0f) goto L9;
        cancelUserAlphaAnimation();
        setAlphaInternal(alpha);
        return;
    L9:
        throw new IllegalArgumentException("Alpha must in a range of [0, 1]. Got: " + alpha);
    }

    private void setAlphaInternal(float alpha) {
        this.mUserAlpha = alpha;
        updateAlpha();
    }

    public float getAlpha() {
        return this.mUserAlpha;
    }

    private void updateAlpha() {
        Attributes.access$400(this.mAttributes, this.mSystemAlpha * this.mUserAlpha);
    }

    private void cancelUserAlphaAnimation() {
        if (this.mUserAlphaAnimator == null) goto L6;
        this.mUserAlphaAnimator.cancel();
        this.mUserAlphaAnimator = null;
        return;
    }

    public void animateAlpha(float toAlpha) {
        cancelUserAlphaAnimation();
        if (toAlpha != this.mUserAlpha) goto L5;
        return;
    L5:
        this.mUserAlphaAnimator = ValueAnimator.ofFloat(new float[]{this.mUserAlpha, toAlpha});
        float r0 = this.mUserAlpha;
        ValueAnimator r1 = this.mUserAlphaAnimator;
        if (r0 >= toAlpha) goto L8;
        r1.setDuration(DEFAULT_DURATION_IN);
        this.mUserAlphaAnimator.setInterpolator(DEFAULT_INTERPOLATOR_FADE_IN);
    L9:
        this.mUserAlphaAnimator.addUpdateListener(new Protection$$ExternalSyntheticLambda1(this));
        this.mUserAlphaAnimator.start();
        return;
    L8:
        r1.setDuration(DEFAULT_DURATION_OUT);
        this.mUserAlphaAnimator.setInterpolator(DEFAULT_INTERPOLATOR_FADE_OUT);
        goto L9
    }

    /* JADX INFO: renamed from: lambda$animateAlpha$0$androidx-core-view-insets-Protection, reason: not valid java name */
    /* synthetic */ void m7256lambda$animateAlpha$0$androidxcoreviewinsetsProtection(ValueAnimator animation) {
        setAlphaInternal(((Float) animation.getAnimatedValue()).floatValue());
    }

    void setSystemInsetAmount(float insetAmount) {
        this.mSystemInsetAmount = insetAmount;
        updateInsetAmount();
    }

    public void setInsetAmount(float insetAmount) {
        if (insetAmount < 0.0f) goto L9;
        if (insetAmount > 1.0f) goto L9;
        cancelUserInsetsAmountAnimation();
        setInsetAmountInternal(insetAmount);
        return;
    L9:
        throw new IllegalArgumentException("Inset amount must in a range of [0, 1]. Got: " + insetAmount);
    }

    private void setInsetAmountInternal(float insetAmount) {
        this.mUserInsetAmount = insetAmount;
        updateInsetAmount();
    }

    public float getInsetAmount() {
        return this.mUserInsetAmount;
    }

    private void updateInsetAmount() {
        float finalInsetAmount = this.mUserInsetAmount * this.mSystemInsetAmount;
        switch(this.mSide) {
            case 1: goto L8;
            case 2: goto L7;
            case 4: goto L6;
            case 8: goto L5;
            default: goto L13;
        };
    L5:
        Attributes.access$800(this.mAttributes, (1.0f - finalInsetAmount) * Attributes.access$700(this.mAttributes));
        return;
    L6:
        Attributes.access$600(this.mAttributes, (1.0f - finalInsetAmount) * Attributes.access$500(this.mAttributes));
        return;
    L7:
        Attributes.access$800(this.mAttributes, (-(1.0f - finalInsetAmount)) * Attributes.access$700(this.mAttributes));
        return;
    L8:
        Attributes.access$600(this.mAttributes, (-(1.0f - finalInsetAmount)) * Attributes.access$500(this.mAttributes));
        return;
    }

    private void cancelUserInsetsAmountAnimation() {
        if (this.mUserInsetAmountAnimator == null) goto L6;
        this.mUserInsetAmountAnimator.cancel();
        this.mUserInsetAmountAnimator = null;
        return;
    }

    public void animateInsetsAmount(float toInsetsAmount) {
        cancelUserInsetsAmountAnimation();
        if (toInsetsAmount != this.mUserInsetAmount) goto L5;
        return;
    L5:
        this.mUserInsetAmountAnimator = ValueAnimator.ofFloat(new float[]{this.mUserInsetAmount, toInsetsAmount});
        float r0 = this.mUserInsetAmount;
        ValueAnimator r1 = this.mUserInsetAmountAnimator;
        if (r0 >= toInsetsAmount) goto L8;
        r1.setDuration(DEFAULT_DURATION_IN);
        this.mUserInsetAmountAnimator.setInterpolator(DEFAULT_INTERPOLATOR_MOVE_IN);
    L9:
        this.mUserInsetAmountAnimator.addUpdateListener(new Protection$$ExternalSyntheticLambda0(this));
        this.mUserInsetAmountAnimator.start();
        return;
    L8:
        r1.setDuration(DEFAULT_DURATION_OUT);
        this.mUserInsetAmountAnimator.setInterpolator(DEFAULT_INTERPOLATOR_MOVE_OUT);
        goto L9
    }

    /* JADX INFO: renamed from: lambda$animateInsetsAmount$1$androidx-core-view-insets-Protection, reason: not valid java name */
    /* synthetic */ void m7257x124db077(ValueAnimator animation) {
        setAlphaInternal(((Float) animation.getAnimatedValue()).floatValue());
    }

    void setDrawable(Drawable drawable) {
        Attributes.access$900(this.mAttributes, drawable);
    }
}
