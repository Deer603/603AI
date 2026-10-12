package androidx.core.view.insets;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public class GradientProtection extends Protection {
    private static final float[] ALPHAS = null;
    private int mColor;
    private final int[] mColors;
    private final GradientDrawable mDrawable;
    private boolean mHasColor;
    private float mScale;

    static {
        ALPHAS = new float[100];
        PathInterpolator interpolator = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
        int steps = ALPHAS.length - 1;
        int i = steps;
    L3:
        if (i < 0) goto L5;
        ALPHAS[i] = interpolator.getInterpolation((steps - i) / steps);
        i = i - 1;
        goto L3
    }

    public GradientProtection(int side) {
        super(side);
        this.mDrawable = new GradientDrawable();
        this.mColors = new int[ALPHAS.length];
        this.mColor = 0;
        this.mScale = 1.2f;
        switch(side) {
            case 1: goto L8;
            case 2: goto L7;
            case 4: goto L6;
            case 8: goto L5;
            default: goto L13;
        };
    L5:
        this.mDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        return;
    L6:
        this.mDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        return;
    L7:
        this.mDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        return;
    L8:
        this.mDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        return;
    }

    public GradientProtection(int side, int color) {
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
        toColors(this.mColor, this.mColors);
        this.mDrawable.setColors(this.mColors);
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

    private static void toColors(int color, int[] colors) {
        int i = colors.length - 1;
    L3:
        if (i < 0) goto L5;
        colors[i] = Color.argb((int) (ALPHAS[i] * Color.alpha(color)), Color.red(color), Color.green(color), Color.blue(color));
        i = i - 1;
        goto L3
    }

    @Override // androidx.core.view.insets.Protection
    int getThickness(int inset) {
        return (int) (this.mScale * inset);
    }

    public void setScale(float scale) {
        if (scale < 0.0f) goto L7;
        this.mScale = scale;
        updateLayout();
        return;
    L7:
        throw new IllegalArgumentException("Scale must not be negative.");
    }

    public float getScale() {
        return this.mScale;
    }
}
