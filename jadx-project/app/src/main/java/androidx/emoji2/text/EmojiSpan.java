package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EmojiSpan extends ReplacementSpan {
    private short mHeight;
    private final TypefaceEmojiRasterizer mRasterizer;
    private float mRatio;
    private final Paint.FontMetricsInt mTmpFontMetrics;
    private short mWidth;

    EmojiSpan(TypefaceEmojiRasterizer rasterizer) {
        this.mTmpFontMetrics = new Paint.FontMetricsInt();
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRatio = 1.0f;
        Preconditions.checkNotNull(rasterizer, "rasterizer cannot be null");
        this.mRasterizer = rasterizer;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        paint.getFontMetricsInt(this.mTmpFontMetrics);
        int fontHeight = Math.abs(this.mTmpFontMetrics.descent - this.mTmpFontMetrics.ascent);
        this.mRatio = (fontHeight * 1.0f) / this.mRasterizer.getHeight();
        this.mHeight = (short) (this.mRasterizer.getHeight() * this.mRatio);
        this.mWidth = (short) (this.mRasterizer.getWidth() * this.mRatio);
        if (fm == null) goto L6;
        fm.ascent = this.mTmpFontMetrics.ascent;
        fm.descent = this.mTmpFontMetrics.descent;
        fm.top = this.mTmpFontMetrics.top;
        fm.bottom = this.mTmpFontMetrics.bottom;
    L6:
        return this.mWidth;
    }

    public final TypefaceEmojiRasterizer getTypefaceRasterizer() {
        return this.mRasterizer;
    }

    final int getWidth() {
        return this.mWidth;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    final float getRatio() {
        return this.mRatio;
    }

    public final int getId() {
        return getTypefaceRasterizer().getId();
    }
}
