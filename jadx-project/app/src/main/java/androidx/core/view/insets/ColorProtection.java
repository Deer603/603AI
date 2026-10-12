package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class ColorProtection extends Protection {
    private int mColor;
    private final ColorDrawable mDrawable;
    private boolean mHasColor;

    public ColorProtection(int side) {
        super(side);
        this.mDrawable = new ColorDrawable();
        this.mColor = 0;
    }

    public ColorProtection(int side, int color) {
        this(side);
        setColor(color);
    }

    @Override // androidx.core.view.insets.Protection
    void dispatchColorHint(int color) {
        if (this.mHasColor == true) goto L6;
        setColorInner(color);
        return;
    }

    private void setColorInner(int color) {
        if (this.mColor == color) goto L6;
        this.mColor = color;
        this.mDrawable.setColor(color);
        setDrawable(this.mDrawable);
        return;
    }

    public void setColor(int color) {
        this.mHasColor = true;
        setColorInner(color);
    }

    public int getColor() {
        return this.mColor;
    }

    @Override // androidx.core.view.insets.Protection
    boolean occupiesCorners() {
        return true;
    }
}
