package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

/* JADX INFO: compiled from: PaintExtensions.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a,\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a$\u0010\u000b\u001a\u00020\u0002*\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0000\u001a$\u0010\u000f\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0001¨\u0006\u0010"}, d2 = {"extendWith", "", "Landroid/graphics/Rect;", "rect", "fillStringBounds", "Landroid/graphics/Paint;", "text", "", "start", "", "end", "getCharSequenceBounds", "Landroid/text/TextPaint;", "startInclusive", "endExclusive", "getStringBounds", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PaintExtensions_androidKt {
    public static final Rect getCharSequenceBounds(TextPaint $this$getCharSequenceBounds, CharSequence text, int startInclusive, int endExclusive) {
        if ((text instanceof Spanned) == false) goto L18;
        if (SpannedExtensions_androidKt.hasSpan((Spanned) text, MetricAffectingSpan.class, startInclusive, endExclusive) == false) goto L18;
        Rect finalRect = new Rect();
        Rect tmpRect = new Rect();
        TextPaint tmpPaint = new TextPaint();
        int tmpStart = startInclusive;
    L8:
        if (tmpStart >= endExclusive) goto L16;
        int tmpEnd = ((Spanned) text).nextSpanTransition(tmpStart, endExclusive, MetricAffectingSpan.class);
        MetricAffectingSpan[] spans = (MetricAffectingSpan[]) ((Spanned) text).getSpans(tmpStart, tmpEnd, MetricAffectingSpan.class);
        tmpPaint.set($this$getCharSequenceBounds);
        int r7 = spans.length;
        int r8 = 0;
    L10:
        if (r8 >= r7) goto L15;
        MetricAffectingSpan span = spans[r8];
        int spanStart = ((Spanned) text).getSpanStart(span);
        int spanEnd = ((Spanned) text).getSpanEnd(span);
        if (spanStart == spanEnd) goto L14;
        span.updateMeasureState(tmpPaint);
    L14:
        r8 = r8 + 1;
        goto L10
    L15:
        fillStringBounds(tmpPaint, text, tmpStart, tmpEnd, tmpRect);
        extendWith(finalRect, tmpRect);
        tmpStart = tmpEnd;
        goto L8
    L16:
        return finalRect;
    L18:
        return getStringBounds($this$getCharSequenceBounds, text, startInclusive, endExclusive);
    }

    private static final void extendWith(Rect $this$extendWith, Rect rect) {
        $this$extendWith.right += rect.width();
        $this$extendWith.top = Math.min($this$extendWith.top, rect.top);
        $this$extendWith.bottom = Math.max($this$extendWith.bottom, rect.bottom);
    }

    public static final Rect getStringBounds(Paint $this$getStringBounds, CharSequence text, int start, int end) {
        Rect rect = new Rect();
        fillStringBounds($this$getStringBounds, text, start, end, rect);
        return rect;
    }

    private static final void fillStringBounds(Paint $this$fillStringBounds, CharSequence text, int start, int end, Rect rect) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        Paint29.getTextBounds($this$fillStringBounds, text, start, end, rect);
        return;
    L5:
        $this$fillStringBounds.getTextBounds(text.toString(), start, end, rect);
    }
}
