package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: LineHeightStyleSpan.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J8\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J'\u0010%\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b&R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "lineHeight", "", "startIndex", "", "endIndex", "trimFirstLineTop", "", "trimLastLineBottom", "topRatio", "preserveMinimumHeight", "(FIIZZFZ)V", "ascent", "descent", "firstAscent", "<set-?>", "firstAscentDiff", "getFirstAscentDiff", "()I", "lastDescent", "lastDescentDiff", "getLastDescentDiff", "getLineHeight", "()F", "getTrimLastLineBottom", "()Z", "calculateTargetMetrics", "", "fontMetricsInt", "Landroid/graphics/Paint$FontMetricsInt;", "chooseHeight", "text", "", "start", "end", "spanStartVertical", "copy", "copy$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 0;
    private int ascent;
    private int descent;
    private final int endIndex;
    private int firstAscent;
    private int firstAscentDiff;
    private int lastDescent;
    private int lastDescentDiff;
    private final float lineHeight;
    private final boolean preserveMinimumHeight;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;

    static {
        $stable = 8;
    }

    public LineHeightStyleSpan(float lineHeight, int startIndex, int endIndex, boolean trimFirstLineTop, boolean trimLastLineBottom, float topRatio, boolean preserveMinimumHeight) {
        this.lineHeight = lineHeight;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.trimFirstLineTop = trimFirstLineTop;
        this.trimLastLineBottom = trimLastLineBottom;
        this.topRatio = topRatio;
        this.preserveMinimumHeight = preserveMinimumHeight;
        this.firstAscent = Integer.MIN_VALUE;
        this.ascent = Integer.MIN_VALUE;
        this.descent = Integer.MIN_VALUE;
        this.lastDescent = Integer.MIN_VALUE;
        float r0 = this.topRatio;
        boolean value$iv = true;
        if (0.0f <= r0) goto L5;
    L7:
        boolean r1 = false;
    L8:
        if (r1 == true) goto L17;
        if (this.topRatio != (-1.0f)) goto L12;
        boolean r2 = true;
    L13:
        if (r2 == true) goto L17;
        value$iv = false;
        goto L17
    L12:
        r2 = false;
    L17:
        if (value$iv == true) goto L21;
        InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
        return;
    L21:
        return;
    L5:
        if (r0 > 1.0f) goto L7;
        r1 = true;
        goto L8
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanStartVertical, int lineHeight, Paint.FontMetricsInt fontMetricsInt) {
        int currentHeight = LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        if (currentHeight > 0) goto L5;
        return;
    L5:
        boolean isLastLine = true;
        if (start != this.startIndex) goto L8;
        boolean isFirstLine = true;
    L10:
        if (end == this.endIndex) goto L13;
        isLastLine = false;
    L13:
        if (isFirstLine == false) goto L21;
        if (isLastLine == false) goto L21;
        if (this.trimFirstLineTop == false) goto L21;
        if (this.trimLastLineBottom == false) goto L21;
        return;
    L21:
        if (this.firstAscent != Integer.MIN_VALUE) goto L23;
        calculateTargetMetrics(fontMetricsInt);
    L23:
        if (isFirstLine == false) goto L25;
        int r3 = this.firstAscent;
    L26:
        fontMetricsInt.ascent = r3;
        if (isLastLine == false) goto L29;
        int r4 = this.lastDescent;
    L30:
        fontMetricsInt.descent = r4;
        return;
    L29:
        r4 = this.descent;
        goto L30
    L25:
        r3 = this.ascent;
        goto L26
    L8:
        isFirstLine = false;
        goto L10
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        int currentHeight = LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        int ceiledLineHeight = (int) Math.ceil(this.lineHeight);
        int diff = ceiledLineHeight - currentHeight;
        boolean r4 = false;
        if (this.preserveMinimumHeight == false) goto L8;
        if (diff > 0) goto L8;
        this.ascent = fontMetricsInt.ascent;
        this.descent = fontMetricsInt.descent;
        this.firstAscent = this.ascent;
        this.lastDescent = this.descent;
        this.firstAscentDiff = 0;
        this.lastDescentDiff = 0;
        return;
    L8:
        if (this.topRatio != (-1.0f)) goto L10;
        r4 = true;
    L10:
        if (r4 == false) goto L12;
        float ascentRatio = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
    L14:
        if (diff > 0) goto L16;
        int descentDiff = (int) Math.ceil(diff * ascentRatio);
    L17:
        this.descent = fontMetricsInt.descent + descentDiff;
        this.ascent = this.descent - ceiledLineHeight;
        if (this.trimFirstLineTop == false) goto L20;
        int r5 = fontMetricsInt.ascent;
    L21:
        this.firstAscent = r5;
        if (this.trimLastLineBottom == false) goto L24;
        int r6 = fontMetricsInt.descent;
    L25:
        this.lastDescent = r6;
        this.firstAscentDiff = fontMetricsInt.ascent - this.firstAscent;
        this.lastDescentDiff = this.lastDescent - fontMetricsInt.descent;
        return;
    L24:
        r6 = this.descent;
        goto L25
    L20:
        r5 = this.ascent;
        goto L21
    L16:
        descentDiff = (int) Math.ceil(diff * (1.0f - ascentRatio));
        goto L17
    L12:
        ascentRatio = this.topRatio;
        goto L14
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text_release$default(LineHeightStyleSpan r0, int r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = r0.trimFirstLineTop;
    L6:
        return r0.copy$ui_text_release(r1, r2, r3);
    }

    public final LineHeightStyleSpan copy$ui_text_release(int startIndex, int endIndex, boolean trimFirstLineTop) {
        return new LineHeightStyleSpan(this.lineHeight, startIndex, endIndex, trimFirstLineTop, this.trimLastLineBottom, this.topRatio, this.preserveMinimumHeight);
    }
}
