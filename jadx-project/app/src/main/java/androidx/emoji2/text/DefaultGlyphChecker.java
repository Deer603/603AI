package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.core.graphics.PaintCompat;

/* JADX INFO: loaded from: classes4.dex */
class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {
    private static final int PAINT_TEXT_SIZE = 10;
    private static final ThreadLocal<StringBuilder> sStringBuilder = null;
    private final TextPaint mTextPaint;

    static {
        sStringBuilder = new ThreadLocal();
    }

    DefaultGlyphChecker() {
        this.mTextPaint = new TextPaint();
        this.mTextPaint.setTextSize(10.0f);
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public boolean hasGlyph(CharSequence charSequence, int start, int end, int sdkAdded) {
        StringBuilder builder = getStringBuilder();
        builder.setLength(0);
    L3:
        if (start >= end) goto L6;
        builder.append(charSequence.charAt(start));
        start = start + 1;
        goto L3
    L6:
        return PaintCompat.hasGlyph(this.mTextPaint, builder.toString());
    }

    private static StringBuilder getStringBuilder() {
        if (sStringBuilder.get() != null) goto L6;
        sStringBuilder.set(new StringBuilder());
    L6:
        return sStringBuilder.get();
    }
}
