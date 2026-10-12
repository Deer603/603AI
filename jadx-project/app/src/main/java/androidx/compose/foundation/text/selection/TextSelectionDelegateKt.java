package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TextSelectionDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\t\u001a$\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¨\u0006\f"}, d2 = {"getSelectionHandleCoordinates", "Landroidx/compose/ui/geometry/Offset;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "offset", "", "isStart", "", "areHandlesCrossed", "(Landroidx/compose/ui/text/TextLayoutResult;IZZ)J", "getHorizontalPosition", "", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextSelectionDelegateKt {
    public static final long getSelectionHandleCoordinates(TextLayoutResult textLayoutResult, int offset, boolean isStart, boolean areHandlesCrossed) {
        int line = textLayoutResult.getLineForOffset(offset);
        if (line >= textLayoutResult.getLineCount()) goto L5;
        float r1 = getHorizontalPosition(textLayoutResult, offset, isStart, areHandlesCrossed);
        long arg0$iv = textLayoutResult.m6388getSizeYbymL2g();
        float x = RangesKt.coerceIn(r1, 0.0f, (int) (arg0$iv >> 32));
        float r4 = textLayoutResult.getLineBottom(line);
        long arg0$iv2 = textLayoutResult.m6388getSizeYbymL2g();
        float y = RangesKt.coerceIn(r4, 0.0f, (int) (arg0$iv2 & 4294967295L));
        long v1$iv$iv = Float.floatToRawIntBits(x);
        long v2$iv$iv = Float.floatToRawIntBits(y);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
    L5:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    }

    public static final float getHorizontalPosition(TextLayoutResult $this$getHorizontalPosition, int offset, boolean isStart, boolean areHandlesCrossed) {
        boolean r0 = false;
        if (isStart == false) goto L5;
        if (areHandlesCrossed == true) goto L5;
    L7:
        int offsetToCheck = offset;
    L9:
        ResolvedTextDirection bidiRunDirection = $this$getHorizontalPosition.getBidiRunDirection(offsetToCheck);
        ResolvedTextDirection paragraphDirection = $this$getHorizontalPosition.getParagraphDirection(offset);
        if (bidiRunDirection != paragraphDirection) goto L13;
        r0 = true;
    L13:
        return $this$getHorizontalPosition.getHorizontalPosition(offset, r0);
    L5:
        if (isStart == true) goto L8;
        if (areHandlesCrossed == true) goto L7;
    L8:
        offsetToCheck = Math.max(offset - 1, 0);
        goto L9
    }
}
