package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayoutIntrinsics.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\rH\u0002J\b\u0010\u001d\u001a\u00020\rH\u0002J\u001c\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u0007H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "charSequence", "", "textPaint", "Landroid/text/TextPaint;", "textDirectionHeuristic", "", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "_boringMetrics", "Landroid/text/BoringLayout$Metrics;", "_charSequenceForIntrinsicWidth", "_maxIntrinsicWidth", "", "_minIntrinsicWidth", "boringMetrics", "getBoringMetrics", "()Landroid/text/BoringLayout$Metrics;", "boringMetricsIsInit", "", "charSequenceForIntrinsicWidth", "getCharSequenceForIntrinsicWidth", "()Ljava/lang/CharSequence;", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "()F", "minIntrinsicWidth", "getMinIntrinsicWidth", "computeMaxIntrinsicWidth", "computeMinIntrinsicWidth", "getDesiredWidth", "start", "end", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutIntrinsics {
    public static final int $stable = 0;
    private BoringLayout.Metrics _boringMetrics;
    private CharSequence _charSequenceForIntrinsicWidth;
    private float _maxIntrinsicWidth;
    private float _minIntrinsicWidth;
    private boolean boringMetricsIsInit;
    private final CharSequence charSequence;
    private final int textDirectionHeuristic;
    private final TextPaint textPaint;

    static {
        $stable = 8;
    }

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int textDirectionHeuristic) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = textDirectionHeuristic;
        this._maxIntrinsicWidth = Float.NaN;
        this._minIntrinsicWidth = Float.NaN;
    }

    private final CharSequence getCharSequenceForIntrinsicWidth() {
        if (this._charSequenceForIntrinsicWidth != null) goto L8;
        boolean r0 = LayoutIntrinsics_androidKt.access$getStripNonMetricAffectingCharSpans$p();
        CharSequence r1 = this.charSequence;
        if (r0 == false) goto L11;
        CharSequence it = LayoutIntrinsics_androidKt.access$stripNonMetricAffectingCharacterStyleSpans(r1);
        this._charSequenceForIntrinsicWidth = it;
        return it;
    L11:
        return r1;
    L8:
        CharSequence r2 = this._charSequenceForIntrinsicWidth;
        Intrinsics.checkNotNull(r2);
        return r2;
    }

    public final BoringLayout.Metrics getBoringMetrics() {
        if (this.boringMetricsIsInit == true) goto L6;
        TextDirectionHeuristic frameworkTextDir = TextLayout_androidKt.getTextDirectionHeuristic(this.textDirectionHeuristic);
        this._boringMetrics = BoringLayoutFactory.INSTANCE.measure(this.charSequence, this.textPaint, frameworkTextDir);
        this.boringMetricsIsInit = true;
    L6:
        return this._boringMetrics;
    }

    public final float getMinIntrinsicWidth() {
        if (Float.isNaN(this._minIntrinsicWidth) == false) goto L7;
        this._minIntrinsicWidth = computeMinIntrinsicWidth();
    L7:
        return this._minIntrinsicWidth;
    }

    private final float computeMinIntrinsicWidth() {
        BreakIterator iterator = BreakIterator.getLineInstance(this.textPaint.getTextLocale());
        iterator.setText(new CharSequenceCharacterIterator(this.charSequence, 0, this.charSequence.length()));
        PriorityQueue longestWordCandidates = new PriorityQueue(10, new LayoutIntrinsics$$ExternalSyntheticLambda0());
        int start = 0;
        int end = iterator.next();
    L4:
        if (end == (-1)) goto L16;
        if (longestWordCandidates.size() >= 10) goto L8;
        longestWordCandidates.add(new Pair(Integer.valueOf(start), Integer.valueOf(end)));
    L14:
        start = end;
        end = iterator.next();
        goto L4
    L8:
        Pair minPair = (Pair) longestWordCandidates.peek();
        if (minPair == null) goto L14;
        if ((((Number) minPair.getSecond()).intValue() - ((Number) minPair.getFirst()).intValue()) >= (end - start)) goto L14;
        longestWordCandidates.poll();
        longestWordCandidates.add(new Pair(Integer.valueOf(start), Integer.valueOf(end)));
        goto L14
    L16:
        if (longestWordCandidates.isEmpty() == false) goto L18;
        return 0.0f;
    L18:
        Iterator r5 = longestWordCandidates.iterator();
        if (r5.hasNext() == false) goto L27;
        Pair r6 = (Pair) r5.next();
        int start2 = ((Number) r6.component1()).intValue();
        int end2 = ((Number) r6.component2()).intValue();
        float r7 = getDesiredWidth(start2, end2);
    L22:
        if (r5.hasNext() == false) goto L25;
        Pair r8 = (Pair) r5.next();
        int start3 = ((Number) r8.component1()).intValue();
        int end3 = ((Number) r8.component2()).intValue();
        r7 = Math.max(r7, getDesiredWidth(start3, end3));
        goto L22
    L25:
        return r7;
    L27:
        throw new NoSuchElementException();
    }

    static final int computeMinIntrinsicWidth$lambda$1(Pair left, Pair right) {
        return (((Number) left.getSecond()).intValue() - ((Number) left.getFirst()).intValue()) - (((Number) right.getSecond()).intValue() - ((Number) right.getFirst()).intValue());
    }

    public final float getMaxIntrinsicWidth() {
        if (Float.isNaN(this._maxIntrinsicWidth) == false) goto L7;
        this._maxIntrinsicWidth = computeMaxIntrinsicWidth();
    L7:
        return this._maxIntrinsicWidth;
    }

    private final float computeMaxIntrinsicWidth() {
        BoringLayout.Metrics r0 = getBoringMetrics();
        if (r0 == null) goto L5;
        int r1 = r0.width;
    L6:
        float desiredWidth = r1;
        if (desiredWidth >= 0.0f) goto L10;
        desiredWidth = (float) Math.ceil(getDesiredWidth$default(this, 0, 0, 3, null));
    L10:
        if (LayoutIntrinsics_androidKt.access$shouldIncreaseMaxIntrinsic(desiredWidth, this.charSequence, this.textPaint) == true) goto L12;
        return desiredWidth;
    L12:
        return desiredWidth + 0.5f;
    L5:
        r1 = -1;
        goto L6
    }

    static /* synthetic */ float getDesiredWidth$default(LayoutIntrinsics r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.getCharSequenceForIntrinsicWidth().length();
    L9:
        return r0.getDesiredWidth(r1, r2);
    }

    private final float getDesiredWidth(int start, int end) {
        return Layout.getDesiredWidth(getCharSequenceForIntrinsicWidth(), start, end, this.textPaint);
    }
}
