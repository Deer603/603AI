package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {
    static final PorterDuff.Mode DEFAULT_TINT_MODE = null;
    private boolean mColorFilterSet;
    private int mCurrentColor;
    private PorterDuff.Mode mCurrentMode;
    Drawable mDrawable;
    private boolean mMutated;
    WrappedDrawableState mState;

    static {
        DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    }

    WrappedDrawableApi14(WrappedDrawableState state, Resources res) {
        this.mState = state;
        updateLocalState(res);
    }

    WrappedDrawableApi14(Drawable dr) {
        this.mState = mutateConstantState();
        setWrappedDrawable(dr);
    }

    private void updateLocalState(Resources res) {
        if (this.mState != null) goto L5;
        return;
    L5:
        if (this.mState.mDrawableState == null) goto L9;
        setWrappedDrawable(this.mState.mDrawableState.newDrawable(res));
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.mDrawable.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.mDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        if (this.mDrawable == null) goto L6;
        this.mDrawable.setBounds(bounds);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int configs) {
        this.mDrawable.setChangingConfigurations(configs);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int r0 = super.getChangingConfigurations();
        if (this.mState == null) goto L5;
        int r1 = this.mState.getChangingConfigurations();
    L7:
        return (r0 | r1) | this.mDrawable.getChangingConfigurations();
    L5:
        r1 = 0;
        goto L7
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean dither) {
        this.mDrawable.setDither(dither);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean filter) {
        this.mDrawable.setFilterBitmap(filter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.mDrawable.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
        this.mDrawable.setColorFilter(cf);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (isCompatTintEnabled() == true) goto L5;
    L7:
        ColorStateList tintList = null;
    L9:
        if (tintList == null) goto L13;
        if (tintList.isStateful() == false) goto L13;
    L14:
        return true;
    L13:
        if (this.mDrawable.isStateful() == true) goto L14;
        return false;
    L5:
        if (this.mState == null) goto L7;
        tintList = this.mState.mTint;
        goto L9
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] stateSet) {
        boolean handled = this.mDrawable.setState(stateSet);
        if (updateTint(stateSet) == true) goto L7;
        if (handled == true) goto L7;
        return false;
    L7:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.mDrawable.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.mDrawable.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        if (super.setVisible(visible, restart) == false) goto L5;
    L8:
        return true;
    L5:
        if (this.mDrawable.setVisible(visible, restart) == true) goto L8;
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.mDrawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.mDrawable.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mDrawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mDrawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.mDrawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.mDrawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        return this.mDrawable.getPadding(padding);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean mirrored) {
        DrawableCompat.setAutoMirrored(this.mDrawable, mirrored);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return DrawableCompat.isAutoMirrored(this.mDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int layoutDirection) {
        return DrawableCompat.setLayoutDirection(this.mDrawable, layoutDirection);
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return DrawableCompat.getLayoutDirection(this.mDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.mState != null) goto L5;
        return null;
    L5:
        if (this.mState.canConstantState() == false) goto L10;
        WrappedDrawableState r0 = this.mState;
        r0.mChangingConfigurations = getChangingConfigurations();
        return this.mState;
    L10:
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.mMutated == false) goto L5;
    L17:
        return this;
    L5:
        if (super.mutate() != this) goto L17;
        this.mState = mutateConstantState();
        if (this.mDrawable == null) goto L10;
        this.mDrawable.mutate();
    L10:
        if (this.mState == null) goto L16;
        WrappedDrawableState r0 = this.mState;
        if (this.mDrawable == null) goto L14;
        Drawable.ConstantState r1 = this.mDrawable.getConstantState();
    L15:
        r0.mDrawableState = r1;
        goto L16
    L14:
        r1 = null;
    L16:
        this.mMutated = true;
        goto L17
    }

    private WrappedDrawableState mutateConstantState() {
        return new WrappedDrawableState(this.mState);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        scheduleSelf(what, when);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable who, Runnable what) {
        unscheduleSelf(what);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int level) {
        return this.mDrawable.setLevel(level);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int tint) {
        setTintList(ColorStateList.valueOf(tint));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList tint) {
        this.mState.mTint = tint;
        updateTint(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        this.mState.mTintMode = tintMode;
        updateTint(getState());
    }

    private boolean updateTint(int[] state) {
        if (isCompatTintEnabled() == true) goto L5;
        return false;
    L5:
        ColorStateList tintList = this.mState.mTint;
        PorterDuff.Mode tintMode = this.mState.mTintMode;
        if (tintList == null) goto L18;
        if (tintMode == null) goto L18;
        int color = tintList.getColorForState(state, tintList.getDefaultColor());
        if (this.mColorFilterSet == true) goto L11;
    L16:
        setColorFilter(color, tintMode);
        this.mCurrentColor = color;
        this.mCurrentMode = tintMode;
        this.mColorFilterSet = true;
        return true;
    L11:
        if (color != this.mCurrentColor) goto L16;
        if (tintMode != this.mCurrentMode) goto L16;
    L19:
        return false;
    L18:
        this.mColorFilterSet = false;
        clearColorFilter();
        goto L19
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final Drawable getWrappedDrawable() {
        return this.mDrawable;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void setWrappedDrawable(Drawable dr) {
        if (this.mDrawable == null) goto L5;
        this.mDrawable.setCallback(null);
    L5:
        this.mDrawable = dr;
        if (dr == null) goto L10;
        dr.setCallback(this);
        setVisible(dr.isVisible(), true);
        setState(dr.getState());
        setLevel(dr.getLevel());
        setBounds(dr.getBounds());
        if (this.mState == null) goto L10;
        WrappedDrawableState r0 = this.mState;
        r0.mDrawableState = dr.getConstantState();
    L10:
        invalidateSelf();
    }

    protected boolean isCompatTintEnabled() {
        return true;
    }
}
