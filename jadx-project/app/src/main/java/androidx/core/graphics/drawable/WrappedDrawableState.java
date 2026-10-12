package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
final class WrappedDrawableState extends Drawable.ConstantState {
    int mChangingConfigurations;
    Drawable.ConstantState mDrawableState;
    ColorStateList mTint;
    PorterDuff.Mode mTintMode;

    WrappedDrawableState(WrappedDrawableState orig) {
        this.mTint = null;
        this.mTintMode = WrappedDrawableApi14.DEFAULT_TINT_MODE;
        if (orig == null) goto L6;
        this.mChangingConfigurations = orig.mChangingConfigurations;
        this.mDrawableState = orig.mDrawableState;
        this.mTint = orig.mTint;
        this.mTintMode = orig.mTintMode;
        return;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources res) {
        return new WrappedDrawableApi21(this, res);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int r0 = this.mChangingConfigurations;
        if (this.mDrawableState == null) goto L5;
        int r1 = this.mDrawableState.getChangingConfigurations();
    L7:
        return r0 | r1;
    L5:
        r1 = 0;
        goto L7
    }

    boolean canConstantState() {
        if (this.mDrawableState == null) goto L5;
        return true;
    L5:
        return false;
    }
}
