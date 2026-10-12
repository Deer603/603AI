package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextLayout.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\t\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0000\u001a3\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0002\u0010\u0018\u001a\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014*\u00020\u000fH\u0002¢\u0006\u0002\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0003*\u00020\u000fH\u0002¢\u0006\u0002\u0010\u001c\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006!"}, d2 = {"SharedTextAndroidCanvas", "Landroidx/compose/ui/text/android/TextAndroidCanvas;", "ZeroVerticalPadding", "Landroidx/compose/ui/text/android/VerticalPaddings;", "J", "VerticalPaddings", "topPadding", "", "bottomPadding", "(II)J", "getTextDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "textDirectionHeuristic", "getLastLineMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "Landroidx/compose/ui/text/android/TextLayout;", "textPaint", "Landroid/text/TextPaint;", "frameworkTextDir", "lineHeightSpans", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;)Landroid/graphics/Paint$FontMetricsInt;", "getLineHeightPaddings", "([Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;)J", "getLineHeightSpans", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "getVerticalPaddings", "(Landroidx/compose/ui/text/android/TextLayout;)J", "isLineEllipsized", "", "Landroid/text/Layout;", "lineIndex", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextLayout_androidKt {
    private static final TextAndroidCanvas SharedTextAndroidCanvas = null;
    private static final long ZeroVerticalPadding = 0;

    public static final /* synthetic */ Paint.FontMetricsInt access$getLastLineMetrics(TextLayout $receiver, TextPaint textPaint, TextDirectionHeuristic frameworkTextDir, LineHeightStyleSpan[] lineHeightSpans) {
        return getLastLineMetrics($receiver, textPaint, frameworkTextDir, lineHeightSpans);
    }

    public static final /* synthetic */ long access$getLineHeightPaddings(LineHeightStyleSpan[] $receiver) {
        return getLineHeightPaddings($receiver);
    }

    public static final /* synthetic */ LineHeightStyleSpan[] access$getLineHeightSpans(TextLayout $receiver) {
        return getLineHeightSpans($receiver);
    }

    public static final /* synthetic */ TextAndroidCanvas access$getSharedTextAndroidCanvas$p() {
        return SharedTextAndroidCanvas;
    }

    public static final /* synthetic */ long access$getVerticalPaddings(TextLayout $receiver) {
        return getVerticalPaddings($receiver);
    }

    public static final /* synthetic */ long access$getZeroVerticalPadding$p() {
        return ZeroVerticalPadding;
    }

    static {
        SharedTextAndroidCanvas = new TextAndroidCanvas();
        ZeroVerticalPadding = VerticalPaddings(0, 0);
    }

    public static final TextDirectionHeuristic getTextDirectionHeuristic(int textDirectionHeuristic) {
        switch(textDirectionHeuristic) {
            case 0: goto L10;
            case 1: goto L16;
            case 2: goto L15;
            case 3: goto L14;
            case 4: goto L13;
            case 5: goto L12;
            default: goto L11;
        };
    L11:
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    L12:
        return TextDirectionHeuristics.LOCALE;
    L13:
        return TextDirectionHeuristics.ANYRTL_LTR;
    L14:
        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
    L15:
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    L16:
        return TextDirectionHeuristics.RTL;
    L10:
        return TextDirectionHeuristics.LTR;
    }

    public static final long VerticalPaddings(int topPadding, int bottomPadding) {
        return VerticalPaddings.m6465constructorimpl((((long) topPadding) << 32) | (((long) bottomPadding) & 4294967295L));
    }

    private static final long getVerticalPaddings(TextLayout $this$getVerticalPaddings) {
        if ($this$getVerticalPaddings.getIncludePadding() == true) goto L26;
        if ($this$getVerticalPaddings.isFallbackLinespacingApplied$ui_text_release() == true) goto L26;
        TextPaint paint = $this$getVerticalPaddings.getLayout().getPaint();
        CharSequence text = $this$getVerticalPaddings.getLayout().getText();
        Rect firstLineTextBounds = PaintExtensions_androidKt.getCharSequenceBounds(paint, text, $this$getVerticalPaddings.getLayout().getLineStart(0), $this$getVerticalPaddings.getLayout().getLineEnd(0));
        int ascent = $this$getVerticalPaddings.getLayout().getLineAscent(0);
        if (firstLineTextBounds.top >= ascent) goto L10;
        int topPadding = ascent - firstLineTextBounds.top;
    L12:
        if ($this$getVerticalPaddings.getLineCount() != 1) goto L14;
        Rect lastLineTextBounds = firstLineTextBounds;
    L15:
        int descent = $this$getVerticalPaddings.getLayout().getLineDescent($this$getVerticalPaddings.getLineCount() - 1);
        if (lastLineTextBounds.bottom <= descent) goto L18;
        int bottomPadding = lastLineTextBounds.bottom - descent;
    L20:
        if (topPadding != 0) goto L24;
        if (bottomPadding != 0) goto L24;
        return ZeroVerticalPadding;
    L24:
        return VerticalPaddings(topPadding, bottomPadding);
    L18:
        bottomPadding = $this$getVerticalPaddings.getLayout().getBottomPadding();
        goto L20
    L14:
        int line = $this$getVerticalPaddings.getLineCount() - 1;
        lastLineTextBounds = PaintExtensions_androidKt.getCharSequenceBounds(paint, text, $this$getVerticalPaddings.getLayout().getLineStart(line), $this$getVerticalPaddings.getLayout().getLineEnd(line));
        goto L15
    L10:
        topPadding = $this$getVerticalPaddings.getLayout().getTopPadding();
    L26:
        return ZeroVerticalPadding;
    }

    private static final long getLineHeightPaddings(LineHeightStyleSpan[] $this$getLineHeightPaddings) {
        int firstAscentDiff = 0;
        int lastDescentDiff = 0;
        int r2 = $this$getLineHeightPaddings.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L11;
        LineHeightStyleSpan span = $this$getLineHeightPaddings[r3];
        if (span.getFirstAscentDiff() >= 0) goto L8;
        firstAscentDiff = Math.max(firstAscentDiff, Math.abs(span.getFirstAscentDiff()));
    L8:
        if (span.getLastDescentDiff() >= 0) goto L10;
        lastDescentDiff = Math.max(firstAscentDiff, Math.abs(span.getLastDescentDiff()));
    L10:
        r3 = r3 + 1;
        goto L3
    L11:
        if (firstAscentDiff != 0) goto L15;
        if (lastDescentDiff != 0) goto L15;
        return ZeroVerticalPadding;
    L15:
        return VerticalPaddings(firstAscentDiff, lastDescentDiff);
    }

    private static final Paint.FontMetricsInt getLastLineMetrics(TextLayout $this$getLastLineMetrics, TextPaint textPaint, TextDirectionHeuristic frameworkTextDir, LineHeightStyleSpan[] lineHeightSpans) {
        boolean r2 = true;
        int lastLine = $this$getLastLineMetrics.getLineCount() - 1;
        if ($this$getLastLineMetrics.getLayout().getLineStart(lastLine) == $this$getLastLineMetrics.getLayout().getLineEnd(lastLine)) goto L5;
        return null;
    L5:
        if (lineHeightSpans != null) goto L7;
    L13:
        if (r2 == true) goto L24;
        SpannableString emptyText = new SpannableString("\u200b");
        LineHeightStyleSpan lineHeightSpan = (LineHeightStyleSpan) ArraysKt.first(lineHeightSpans);
        int r5 = emptyText.length();
        if (lastLine != 0) goto L17;
    L19:
        boolean r6 = lineHeightSpan.getTrimLastLineBottom();
    L20:
        LineHeightStyleSpan newLineHeightSpan = lineHeightSpan.copy$ui_text_release(0, r5, r6);
        emptyText.setSpan(newLineHeightSpan, 0, emptyText.length(), 33);
        StaticLayout tmpLayout = StaticLayoutFactory.create$default(StaticLayoutFactory.INSTANCE, emptyText, textPaint, Integer.MAX_VALUE, 0, emptyText.length(), frameworkTextDir, null, 0, null, 0, 0.0f, 0.0f, 0, $this$getLastLineMetrics.getIncludePadding(), $this$getLastLineMetrics.getFallbackLineSpacing(), 0, 0, 0, 0, null, null, 2072512, null);
        Paint.FontMetricsInt lastLineFontMetrics = new Paint.FontMetricsInt();
        lastLineFontMetrics.ascent = tmpLayout.getLineAscent(0);
        lastLineFontMetrics.descent = tmpLayout.getLineDescent(0);
        lastLineFontMetrics.top = tmpLayout.getLineTop(0);
        lastLineFontMetrics.bottom = tmpLayout.getLineBottom(0);
        return lastLineFontMetrics;
    L17:
        if (lineHeightSpan.getTrimLastLineBottom() == false) goto L19;
        r6 = false;
        goto L20
    L24:
        return null;
    L7:
        if (lineHeightSpans.length != 0) goto L9;
        boolean r4 = true;
    L10:
        if (r4 == true) goto L13;
        r2 = false;
        goto L13
    L9:
        r4 = false;
        goto L10
    }

    private static final LineHeightStyleSpan[] getLineHeightSpans(TextLayout $this$getLineHeightSpans) {
        if (($this$getLineHeightSpans.getText() instanceof Spanned) == true) goto L5;
        return null;
    L5:
        CharSequence r0 = $this$getLineHeightSpans.getText();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type android.text.Spanned");
        if (SpannedExtensions_androidKt.hasSpan((Spanned) r0, LineHeightStyleSpan.class) == false) goto L8;
    L13:
        CharSequence r1 = $this$getLineHeightSpans.getText();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type android.text.Spanned");
        LineHeightStyleSpan[] lineHeightStyleSpans = (LineHeightStyleSpan[]) ((Spanned) r1).getSpans(0, $this$getLineHeightSpans.getText().length(), LineHeightStyleSpan.class);
        return lineHeightStyleSpans;
    L8:
        if ($this$getLineHeightSpans.getText().length() <= 0) goto L10;
        boolean r2 = true;
    L11:
        if (r2 == false) goto L13;
        return null;
    L10:
        r2 = false;
        goto L11
    }

    public static final boolean isLineEllipsized(Layout $this$isLineEllipsized, int lineIndex) {
        if ($this$isLineEllipsized.getEllipsisCount(lineIndex) <= 0) goto L5;
        return true;
    L5:
        return false;
    }
}
