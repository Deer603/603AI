package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes4.dex */
public final class TypefaceEmojiSpan extends EmojiSpan {
    private static Paint sDebugPaint;
    private TextPaint mWorkingPaint;

    public TypefaceEmojiSpan(TypefaceEmojiRasterizer metadata) {
        super(metadata);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        TextPaint textPaint = applyCharacterSpanStyles(text, start, end, paint);
        if (textPaint == null) goto L9;
        if (textPaint.bgColor == 0) goto L9;
        drawBackground(canvas, textPaint, x, x + getWidth(), top, bottom);
    L9:
        if (EmojiCompat.get().isEmojiSpanIndicatorEnabled() == false) goto L12;
        canvas.drawRect(x, top, x + getWidth(), bottom, getDebugPaint());
    L12:
        TypefaceEmojiRasterizer r2 = getTypefaceRasterizer();
        float r4 = y;
        if (textPaint == 0) goto L15;
        Paint r5 = textPaint;
    L16:
        r2.draw(canvas, x, r4, r5);
        return;
    L15:
        r5 = paint;
        goto L16
    }

    void drawBackground(Canvas c, TextPaint textPaint, float leftX, float rightX, float top, float bottom) {
        int previousColor = textPaint.getColor();
        Paint.Style previousStyle = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        c.drawRect(leftX, top, rightX, bottom, textPaint);
        textPaint.setStyle(previousStyle);
        textPaint.setColor(previousColor);
    }

    private TextPaint applyCharacterSpanStyles(CharSequence text, int start, int end, Paint paint) {
        if ((text instanceof Spanned) == false) goto L28;
        Spanned spanned = (Spanned) text;
        CharacterStyle[] spans = (CharacterStyle[]) spanned.getSpans(start, end, CharacterStyle.class);
        if (spans.length == 0) goto L23;
        if (spans.length == 1) goto L9;
    L11:
        TextPaint wp = this.mWorkingPaint;
        if (wp != null) goto L14;
        wp = new TextPaint();
        this.mWorkingPaint = wp;
    L14:
        wp.set(paint);
        int pos = 0;
    L16:
        if (pos >= spans.length) goto L21;
        if ((spans[pos] instanceof MetricAffectingSpan) == true) goto L20;
        spans[pos].updateDrawState(wp);
    L20:
        pos = pos + 1;
        goto L16
    L21:
        return wp;
    L9:
        if (spans[0] != this) goto L11;
    L23:
        if ((paint instanceof TextPaint) == true) goto L25;
        return null;
    L25:
        return (TextPaint) paint;
    L28:
        if ((paint instanceof TextPaint) == true) goto L30;
        return null;
    L30:
        return (TextPaint) paint;
    }

    private static Paint getDebugPaint() {
        if (sDebugPaint != null) goto L6;
        sDebugPaint = new TextPaint();
        sDebugPaint.setColor(EmojiCompat.get().getEmojiSpanIndicatorColor());
        sDebugPaint.setStyle(Paint.Style.FILL);
    L6:
        return sDebugPaint;
    }
}
