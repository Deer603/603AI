package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.android.selection.SegmentFinder_androidKt;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TextLayoutGetRangeForRectExtensions.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001af\u0010\b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u001aH\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00032\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\u0013H\u0000\u001af\u0010\u001d\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u001aV\u0010\u001e\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010 \u001a\u00020\u0014H\u0002\u001a\u001c\u0010!\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0001H\u0002¨\u0006$"}, d2 = {"getCharacterLeftBounds", "", "offset", "", "lineStart", "horizontalBounds", "", "getCharacterRightBounds", "getEndOffsetForRectWithinRun", "Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "rect", "Landroid/graphics/RectF;", "lineTop", "lineBottom", "runLeft", "runRight", "segmentFinder", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "inclusionStrategy", "Lkotlin/Function2;", "", "getRangeForRect", "", "Landroidx/compose/ui/text/android/TextLayout;", "layout", "Landroid/text/Layout;", "layoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "granularity", "getStartOffsetForRectWithinRun", "getStartOrEndOffsetForRectWithinLine", "lineIndex", "getStart", "horizontalOverlap", "left", "right", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    public static final int[] getRangeForRect(TextLayout $this$getRangeForRect, Layout layout, LayoutHelper layoutHelper, RectF rect, int granularity, Function2<? super RectF, ? super RectF, Boolean> r15) {
        if (granularity != 1) goto L5;
        WordSegmentFinder r0 = new WordSegmentFinder($this$getRangeForRect.getText(), $this$getRangeForRect.getWordIterator());
    L6:
        SegmentFinder segmentFinder = r0;
        int startLine = layout.getLineForVertical((int) rect.top);
        if (rect.top <= $this$getRangeForRect.getLineBottom(startLine)) goto L12;
        int startLine2 = startLine + 1;
        if (startLine2 < $this$getRangeForRect.getLineCount()) goto L11;
        return null;
    L11:
        int startLine3 = startLine2;
    L13:
        int endLine = layout.getLineForVertical((int) rect.bottom);
        if (endLine == 0) goto L16;
    L18:
        int start = getStartOrEndOffsetForRectWithinLine($this$getRangeForRect, layout, layoutHelper, startLine3, rect, segmentFinder, r15, true);
    L19:
        int startLine4 = startLine3;
        if (start != (-1)) goto L23;
        if (startLine4 >= endLine) goto L23;
        startLine3 = startLine4 + 1;
        start = getStartOrEndOffsetForRectWithinLine($this$getRangeForRect, layout, layoutHelper, startLine3, rect, segmentFinder, r15, true);
    L23:
        if (start != (-1)) goto L25;
        return null;
    L25:
        int end = getStartOrEndOffsetForRectWithinLine($this$getRangeForRect, layout, layoutHelper, endLine, rect, segmentFinder, r15, false);
    L26:
        if (end != (-1)) goto L29;
        if (startLine4 >= endLine) goto L29;
        int endLine2 = endLine - 1;
        end = getStartOrEndOffsetForRectWithinLine($this$getRangeForRect, layout, layoutHelper, endLine2, rect, segmentFinder, r15, false);
        endLine = endLine2;
    L29:
        if (end != (-1)) goto L32;
        return null;
    L32:
        return new int[]{segmentFinder.previousStartBoundary(start + 1), segmentFinder.nextEndBoundary(end - 1)};
    L16:
        if (rect.bottom >= $this$getRangeForRect.getLineTop(0)) goto L18;
        return null;
    L12:
        startLine3 = startLine;
        goto L13
    L5:
        r0 = SegmentFinder_androidKt.createGraphemeClusterSegmentFinder($this$getRangeForRect.getText(), $this$getRangeForRect.getTextPaint());
        goto L6
    }

    private static final int getStartOrEndOffsetForRectWithinLine(TextLayout $this$getStartOrEndOffsetForRectWithinLine, Layout layout, LayoutHelper layoutHelper, int lineIndex, RectF rect, SegmentFinder segmentFinder, Function2<? super RectF, ? super RectF, Boolean> r26, boolean getStart) {
        int lineTop = layout.getLineTop(lineIndex);
        int lineBottom = layout.getLineBottom(lineIndex);
        int lineStart = layout.getLineStart(lineIndex);
        int lineEnd = layout.getLineEnd(lineIndex);
        byte r13 = -1;
        if (lineStart != lineEnd) goto L5;
        return -1;
    L5:
        float[] horizontalBounds = new float[(lineEnd - lineStart) * 2];
        $this$getStartOrEndOffsetForRectWithinLine.fillLineHorizontalBounds$ui_text_release(lineIndex, horizontalBounds);
        LayoutHelper.BidiRun[] bidiRuns = layoutHelper.getLineBidiRuns$ui_text_release(lineIndex);
        if (getStart == false) goto L8;
        IntRange r2 = ArraysKt.getIndices(bidiRuns);
    L9:
        IntProgression range = r2;
        int runIndex = range.getFirst();
        int r3 = range.getLast();
        int r17 = range.getStep();
        if (r17 <= 0) goto L12;
        if (runIndex > r3) goto L12;
    L14:
        int runIndex2 = runIndex;
        LayoutHelper.BidiRun bidiRun = bidiRuns[runIndex2];
        if (bidiRun.isRtl() == false) goto L17;
        float runLeft = getCharacterLeftBounds(bidiRun.getEnd() - 1, lineStart, horizontalBounds);
    L19:
        if (bidiRun.isRtl() == false) goto L21;
        float runRight = getCharacterRightBounds(bidiRun.getStart(), lineStart, horizontalBounds);
    L23:
        if (getStart == false) goto L25;
        float runLeft2 = runLeft;
        float runLeft3 = runRight;
        int result = getStartOffsetForRectWithinRun(bidiRun, rect, lineStart, lineTop, lineBottom, runLeft2, runLeft3, horizontalBounds, segmentFinder, r26);
    L27:
        if (result >= 0) goto L28;
        if (runIndex2 == r3) goto L36;
        runIndex = runIndex2 + r17;
        r3 = r3;
        r13 = r13;
        goto L14
    L36:
        return r13;
    L28:
        return result;
    L25:
        float runLeft4 = runLeft;
        float runLeft5 = runRight;
        result = getEndOffsetForRectWithinRun(bidiRun, rect, lineStart, lineTop, lineBottom, runLeft4, runLeft5, horizontalBounds, segmentFinder, r26);
        goto L27
    L21:
        runRight = getCharacterRightBounds(bidiRun.getEnd() - 1, lineStart, horizontalBounds);
        goto L23
    L17:
        runLeft = getCharacterLeftBounds(bidiRun.getStart(), lineStart, horizontalBounds);
    L12:
        if (r17 >= 0) goto L32;
        if (r3 <= runIndex) goto L14;
    L32:
        return -1;
    L8:
        r2 = RangesKt.downTo(ArraysKt.getLastIndex(bidiRuns), 0);
        goto L9
    }

    private static final int getStartOffsetForRectWithinRun(LayoutHelper.BidiRun $this$getStartOffsetForRectWithinRun, RectF rect, int lineStart, int lineTop, int lineBottom, float runLeft, float runRight, float[] horizontalBounds, SegmentFinder segmentFinder, Function2<? super RectF, ? super RectF, Boolean> r25) {
        if (horizontalOverlap(rect, runLeft, runRight) == true) goto L6;
        return -1;
    L6:
        if ($this$getStartOffsetForRectWithinRun.isRtl() == true) goto L10;
        if (rect.left > runLeft) goto L10;
    L13:
        int firstCharOffset = $this$getStartOffsetForRectWithinRun.getStart();
    L32:
        int segmentEnd = segmentFinder.nextEndBoundary(firstCharOffset);
        if (segmentEnd != (-1)) goto L35;
        return -1;
    L35:
        int segmentStart = segmentFinder.previousStartBoundary(segmentEnd);
        if (segmentStart < $this$getStartOffsetForRectWithinRun.getEnd()) goto L38;
        return -1;
    L38:
        int segmentStart2 = RangesKt.coerceAtLeast(segmentStart, $this$getStartOffsetForRectWithinRun.getStart());
        int segmentEnd2 = RangesKt.coerceAtMost(segmentEnd, $this$getStartOffsetForRectWithinRun.getEnd());
        RectF textBounds = new RectF(0.0f, lineTop, 0.0f, lineBottom);
    L40:
        if ($this$getStartOffsetForRectWithinRun.isRtl() == false) goto L42;
        float r12 = getCharacterLeftBounds(segmentEnd2 - 1, lineStart, horizontalBounds);
    L43:
        textBounds.left = r12;
        if ($this$getStartOffsetForRectWithinRun.isRtl() == false) goto L46;
        float r13 = getCharacterRightBounds(segmentStart2, lineStart, horizontalBounds);
    L47:
        textBounds.right = r13;
        if (r25.invoke(textBounds, rect).booleanValue() == true) goto L49;
        segmentStart2 = segmentFinder.nextStartBoundary(segmentStart2);
        if (segmentStart2 == (-1)) goto L56;
        if (segmentStart2 >= $this$getStartOffsetForRectWithinRun.getEnd()) goto L56;
        segmentEnd2 = RangesKt.coerceAtMost(segmentFinder.nextEndBoundary(segmentStart2), $this$getStartOffsetForRectWithinRun.getEnd());
    L56:
        return -1;
    L49:
        return segmentStart2;
    L46:
        r13 = getCharacterRightBounds(segmentEnd2 - 1, lineStart, horizontalBounds);
        goto L47
    L42:
        r12 = getCharacterLeftBounds(segmentStart2, lineStart, horizontalBounds);
    L10:
        if ($this$getStartOffsetForRectWithinRun.isRtl() == true) goto L12;
    L14:
        int low = $this$getStartOffsetForRectWithinRun.getStart();
        int high = $this$getStartOffsetForRectWithinRun.getEnd();
    L16:
        if ((high - low) <= 1) goto L28;
        int guess = (high + low) / 2;
        float position = getCharacterLeftBounds(guess, lineStart, horizontalBounds);
        if ($this$getStartOffsetForRectWithinRun.isRtl() == true) goto L22;
        if (position <= rect.left) goto L22;
    L25:
        high = guess;
    L22:
        if ($this$getStartOffsetForRectWithinRun.isRtl() == false) goto L26;
        if (position < rect.right) goto L25;
    L26:
        low = guess;
        goto L16
    L28:
        if ($this$getStartOffsetForRectWithinRun.isRtl() == false) goto L30;
        int r10 = high;
    L31:
        firstCharOffset = r10;
        goto L32
    L30:
        r10 = low;
        goto L31
    L12:
        if (rect.right < runRight) goto L14;
        goto L13
    }

    private static final int getEndOffsetForRectWithinRun(LayoutHelper.BidiRun $this$getEndOffsetForRectWithinRun, RectF rect, int lineStart, int lineTop, int lineBottom, float runLeft, float runRight, float[] horizontalBounds, SegmentFinder segmentFinder, Function2<? super RectF, ? super RectF, Boolean> r25) {
        if (horizontalOverlap(rect, runLeft, runRight) == true) goto L6;
        return -1;
    L6:
        if ($this$getEndOffsetForRectWithinRun.isRtl() == true) goto L10;
        if (rect.right < runRight) goto L10;
    L13:
        int low = $this$getEndOffsetForRectWithinRun.getEnd() - 1;
    L32:
        int lastCharOffset = low + 1;
        int segmentStart = segmentFinder.previousStartBoundary(lastCharOffset);
        if (segmentStart != (-1)) goto L35;
        return -1;
    L35:
        int segmentEnd = segmentFinder.nextEndBoundary(segmentStart);
        if (segmentEnd > $this$getEndOffsetForRectWithinRun.getStart()) goto L38;
        return -1;
    L38:
        int segmentStart2 = RangesKt.coerceAtLeast(segmentStart, $this$getEndOffsetForRectWithinRun.getStart());
        int segmentEnd2 = RangesKt.coerceAtMost(segmentEnd, $this$getEndOffsetForRectWithinRun.getEnd());
        RectF textBounds = new RectF(0.0f, lineTop, 0.0f, lineBottom);
    L40:
        if ($this$getEndOffsetForRectWithinRun.isRtl() == false) goto L42;
        float r12 = getCharacterLeftBounds(segmentEnd2 - 1, lineStart, horizontalBounds);
    L43:
        textBounds.left = r12;
        if ($this$getEndOffsetForRectWithinRun.isRtl() == false) goto L46;
        float r13 = getCharacterRightBounds(segmentStart2, lineStart, horizontalBounds);
    L47:
        textBounds.right = r13;
        if (r25.invoke(textBounds, rect).booleanValue() == true) goto L49;
        segmentEnd2 = segmentFinder.previousEndBoundary(segmentEnd2);
        if (segmentEnd2 == (-1)) goto L56;
        if (segmentEnd2 <= $this$getEndOffsetForRectWithinRun.getStart()) goto L56;
        segmentStart2 = RangesKt.coerceAtLeast(segmentFinder.previousStartBoundary(segmentEnd2), $this$getEndOffsetForRectWithinRun.getStart());
    L56:
        return -1;
    L49:
        return segmentEnd2;
    L46:
        r13 = getCharacterRightBounds(segmentEnd2 - 1, lineStart, horizontalBounds);
        goto L47
    L42:
        r12 = getCharacterLeftBounds(segmentStart2, lineStart, horizontalBounds);
    L10:
        if ($this$getEndOffsetForRectWithinRun.isRtl() == true) goto L12;
    L14:
        int low2 = $this$getEndOffsetForRectWithinRun.getStart();
        int high = $this$getEndOffsetForRectWithinRun.getEnd();
    L16:
        if ((high - low2) <= 1) goto L28;
        int guess = (high + low2) / 2;
        float position = getCharacterLeftBounds(guess, lineStart, horizontalBounds);
        if ($this$getEndOffsetForRectWithinRun.isRtl() == true) goto L22;
        if (position <= rect.right) goto L22;
    L25:
        high = guess;
    L22:
        if ($this$getEndOffsetForRectWithinRun.isRtl() == false) goto L26;
        if (position < rect.left) goto L25;
    L26:
        low2 = guess;
        goto L16
    L28:
        if ($this$getEndOffsetForRectWithinRun.isRtl() == false) goto L30;
        int r9 = high;
    L31:
        low = r9;
        goto L32
    L30:
        r9 = low2;
        goto L31
    L12:
        if (rect.left > runLeft) goto L14;
        goto L13
    }

    private static final float getCharacterLeftBounds(int offset, int lineStart, float[] horizontalBounds) {
        return horizontalBounds[(offset - lineStart) * 2];
    }

    private static final float getCharacterRightBounds(int offset, int lineStart, float[] horizontalBounds) {
        return horizontalBounds[((offset - lineStart) * 2) + 1];
    }

    private static final boolean horizontalOverlap(RectF $this$horizontalOverlap, float left, float right) {
        if (right >= $this$horizontalOverlap.left) goto L5;
    L7:
        return false;
    L5:
        if (left > $this$horizontalOverlap.right) goto L7;
        return true;
    }
}
