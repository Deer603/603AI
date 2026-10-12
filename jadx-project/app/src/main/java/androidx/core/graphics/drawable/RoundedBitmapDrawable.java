package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RoundedBitmapDrawable extends Drawable {
    private static final int DEFAULT_PAINT_FLAGS = 3;
    private boolean mApplyGravity;
    final Bitmap mBitmap;
    private int mBitmapHeight;
    private final BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private float mCornerRadius;
    final Rect mDstRect;
    private final RectF mDstRectF;
    private int mGravity;
    private boolean mIsCircular;
    private final Paint mPaint;
    private final Matrix mShaderMatrix;
    private int mTargetDensity;

    public final Paint getPaint() {
        return this.mPaint;
    }

    public final Bitmap getBitmap() {
        return this.mBitmap;
    }

    private void computeBitmapSize() {
        this.mBitmapWidth = this.mBitmap.getScaledWidth(this.mTargetDensity);
        this.mBitmapHeight = this.mBitmap.getScaledHeight(this.mTargetDensity);
    }

    public void setTargetDensity(Canvas canvas) {
        setTargetDensity(canvas.getDensity());
    }

    public void setTargetDensity(DisplayMetrics metrics) {
        setTargetDensity(metrics.densityDpi);
    }

    public void setTargetDensity(int density) {
        if (this.mTargetDensity == density) goto L12;
        if (density != 0) goto L6;
        int r0 = 160;
    L7:
        this.mTargetDensity = r0;
        if (this.mBitmap == null) goto L10;
        computeBitmapSize();
    L10:
        invalidateSelf();
        return;
    L6:
        r0 = density;
        goto L7
    }

    public int getGravity() {
        return this.mGravity;
    }

    public void setGravity(int gravity) {
        if (this.mGravity == gravity) goto L6;
        this.mGravity = gravity;
        this.mApplyGravity = true;
        invalidateSelf();
        return;
    }

    public void setMipMap(boolean mipMap) {
        throw new UnsupportedOperationException();
    }

    public boolean hasMipMap() {
        throw new UnsupportedOperationException();
    }

    public void setAntiAlias(boolean aa) {
        this.mPaint.setAntiAlias(aa);
        invalidateSelf();
    }

    public boolean hasAntiAlias() {
        return this.mPaint.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean filter) {
        this.mPaint.setFilterBitmap(filter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean dither) {
        this.mPaint.setDither(dither);
        invalidateSelf();
    }

    void gravityCompatApply(int gravity, int bitmapWidth, int bitmapHeight, Rect bounds, Rect outRect) {
        throw new UnsupportedOperationException();
    }

    void updateDstRect() {
        if (this.mApplyGravity == true) goto L5;
        return;
    L5:
        if (this.mIsCircular == false) goto L7;
        int minDimen = Math.min(this.mBitmapWidth, this.mBitmapHeight);
        gravityCompatApply(this.mGravity, minDimen, minDimen, getBounds(), this.mDstRect);
        int minDrawDimen = Math.min(this.mDstRect.width(), this.mDstRect.height());
        int insetX = Math.max(0, (this.mDstRect.width() - minDrawDimen) / 2);
        int insetY = Math.max(0, (this.mDstRect.height() - minDrawDimen) / 2);
        this.mDstRect.inset(insetX, insetY);
        this.mCornerRadius = minDrawDimen * 0.5f;
    L8:
        this.mDstRectF.set(this.mDstRect);
        if (this.mBitmapShader == null) goto L11;
        this.mShaderMatrix.setTranslate(this.mDstRectF.left, this.mDstRectF.top);
        this.mShaderMatrix.preScale(this.mDstRectF.width() / this.mBitmap.getWidth(), this.mDstRectF.height() / this.mBitmap.getHeight());
        this.mBitmapShader.setLocalMatrix(this.mShaderMatrix);
        this.mPaint.setShader(this.mBitmapShader);
    L11:
        this.mApplyGravity = false;
        return;
    L7:
        gravityCompatApply(this.mGravity, this.mBitmapWidth, this.mBitmapHeight, getBounds(), this.mDstRect);
        goto L8
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) goto L5;
        return;
    L5:
        updateDstRect();
        if (this.mPaint.getShader() != null) goto L8;
        canvas.drawBitmap(bitmap, null, this.mDstRect, this.mPaint);
        return;
    L8:
        canvas.drawRoundRect(this.mDstRectF, this.mCornerRadius, this.mCornerRadius, this.mPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        int oldAlpha = this.mPaint.getAlpha();
        if (alpha == oldAlpha) goto L6;
        this.mPaint.setAlpha(alpha);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mPaint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
        this.mPaint.setColorFilter(cf);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.mPaint.getColorFilter();
    }

    public void setCircular(boolean circular) {
        this.mIsCircular = circular;
        this.mApplyGravity = true;
        if (circular == false) goto L5;
        updateCircularCornerRadius();
        this.mPaint.setShader(this.mBitmapShader);
        invalidateSelf();
        return;
    L5:
        setCornerRadius(0.0f);
    }

    private void updateCircularCornerRadius() {
        int minCircularSize = Math.min(this.mBitmapHeight, this.mBitmapWidth);
        this.mCornerRadius = minCircularSize / 2;
    }

    public boolean isCircular() {
        return this.mIsCircular;
    }

    public void setCornerRadius(float cornerRadius) {
        if (this.mCornerRadius != cornerRadius) goto L5;
        return;
    L5:
        this.mIsCircular = false;
        boolean r0 = isGreaterThanZero(cornerRadius);
        Paint r1 = this.mPaint;
        if (r0 == false) goto L8;
        r1.setShader(this.mBitmapShader);
    L9:
        this.mCornerRadius = cornerRadius;
        invalidateSelf();
        return;
    L8:
        r1.setShader(null);
        goto L9
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        if (this.mIsCircular == false) goto L5;
        updateCircularCornerRadius();
    L5:
        this.mApplyGravity = true;
    }

    public float getCornerRadius() {
        return this.mCornerRadius;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mBitmapWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mBitmapHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.mGravity == 119) goto L5;
    L19:
        return -3;
    L5:
        if (this.mIsCircular == true) goto L19;
        Bitmap bm = this.mBitmap;
        if (bm != null) goto L10;
        return -3;
    L10:
        if (bm.hasAlpha() == false) goto L12;
        return -3;
    L12:
        if (this.mPaint.getAlpha() >= 255) goto L14;
        return -3;
    L14:
        if (isGreaterThanZero(this.mCornerRadius) == true) goto L23;
        return -1;
    L23:
        return -3;
    }

    RoundedBitmapDrawable(Resources res, Bitmap bitmap) {
        this.mTargetDensity = 160;
        this.mGravity = 119;
        this.mPaint = new Paint(3);
        this.mShaderMatrix = new Matrix();
        this.mDstRect = new Rect();
        this.mDstRectF = new RectF();
        this.mApplyGravity = true;
        if (res == null) goto L5;
        this.mTargetDensity = res.getDisplayMetrics().densityDpi;
    L5:
        this.mBitmap = bitmap;
        if (this.mBitmap == null) goto L8;
        computeBitmapSize();
        this.mBitmapShader = new BitmapShader(this.mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        return;
    L8:
        this.mBitmapHeight = -1;
        this.mBitmapWidth = -1;
        this.mBitmapShader = null;
    }

    private static boolean isGreaterThanZero(float toCompare) {
        if (toCompare <= 0.05f) goto L5;
        return true;
    L5:
        return false;
    }
}
