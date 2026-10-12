package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LegacyCursorAnchorInfoBuilder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001ad\u0010\u000b\u001a\u00020\f*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0000\u001a\u001c\u0010\u0017\u001a\u00020\u0013*\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0000\u001a,\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u001d"}, d2 = {"addCharacterBounds", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "", "endOffset", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "innerTextFieldBounds", "Landroidx/compose/ui/geometry/Rect;", "build", "Landroid/view/inputmethod/CursorAnchorInfo;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "matrix", "Landroid/graphics/Matrix;", "decorationBoxBounds", "includeInsertionMarker", "", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "containsInclusive", "x", "", "y", "setInsertionMarker", "selectionStart", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LegacyCursorAnchorInfoBuilder_androidKt {
    public static /* synthetic */ CursorAnchorInfo build$default(CursorAnchorInfo.Builder r1, TextFieldValue r2, OffsetMapping r3, TextLayoutResult r4, Matrix r5, Rect r6, Rect r7, boolean r8, boolean r9, boolean r10, boolean r11, int r12, Object r13) {
        if ((r12 & 64) == 0) goto L6;
        r8 = true;
    L6:
        if ((r12 & 128) == 0) goto L9;
        r9 = true;
    L9:
        if ((r12 & 256) == 0) goto L12;
        r10 = true;
    L12:
        if ((r12 & 512) == 0) goto L15;
        r11 = true;
    L15:
        return build(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
    }

    public static final CursorAnchorInfo build(CursorAnchorInfo.Builder $this$build, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect innerTextFieldBounds, Rect decorationBoxBounds, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        $this$build.reset();
        $this$build.setMatrix(matrix);
        int selectionStart = TextRange.m6415getMinimpl(textFieldValue.m6665getSelectiond9O1mEE());
        int selectionEnd = TextRange.m6414getMaximpl(textFieldValue.m6665getSelectiond9O1mEE());
        $this$build.setSelectionRange(selectionStart, selectionEnd);
        if (includeInsertionMarker == false) goto L5;
        setInsertionMarker($this$build, selectionStart, offsetMapping, textLayoutResult, innerTextFieldBounds);
    L5:
        if (includeCharacterBounds == false) goto L20;
        TextRange r2 = textFieldValue.m6664getCompositionMzsxiRA();
        int r3 = -1;
        if (r2 == null) goto L9;
        int r4 = TextRange.m6415getMinimpl(r2.m6421unboximpl());
    L10:
        int compositionStart = r4;
        TextRange r5 = textFieldValue.m6664getCompositionMzsxiRA();
        if (r5 == null) goto L13;
        r3 = TextRange.m6414getMaximpl(r5.m6421unboximpl());
    L13:
        int compositionEnd = r3;
        boolean r6 = false;
        if (compositionStart < 0) goto L17;
        if (compositionStart >= compositionEnd) goto L17;
        r6 = true;
    L17:
        if (r6 == false) goto L20;
        $this$build.setComposingText(compositionStart, textFieldValue.getText().subSequence(compositionStart, compositionEnd));
        addCharacterBounds($this$build, compositionStart, compositionEnd, offsetMapping, textLayoutResult, innerTextFieldBounds);
        goto L20
    L9:
        r4 = -1;
    L20:
        if (Build.VERSION.SDK_INT < 33) goto L25;
        if (includeEditorBounds == false) goto L25;
        CursorAnchorInfoApi33Helper.setEditorBoundsInfo($this$build, decorationBoxBounds);
    L25:
        if (Build.VERSION.SDK_INT < 34) goto L29;
        if (includeLineBounds == false) goto L29;
        CursorAnchorInfoApi34Helper.addVisibleLineBounds($this$build, textLayoutResult, innerTextFieldBounds);
    L29:
        return $this$build.build();
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder $this$setInsertionMarker, int selectionStart, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect innerTextFieldBounds) {
        if (selectionStart >= 0) goto L4;
        return $this$setInsertionMarker;
    L4:
        int selectionStartTransformed = offsetMapping.originalToTransformed(selectionStart);
        Rect cursorRect = textLayoutResult.getCursorRect(selectionStartTransformed);
        float r2 = cursorRect.getLeft();
        long arg0$iv = textLayoutResult.m6388getSizeYbymL2g();
        float x = RangesKt.coerceIn(r2, 0.0f, (int) (arg0$iv >> 32));
        boolean isTopVisible = containsInclusive(innerTextFieldBounds, x, cursorRect.getTop());
        boolean isBottomVisible = containsInclusive(innerTextFieldBounds, x, cursorRect.getBottom());
        if (textLayoutResult.getBidiRunDirection(selectionStartTransformed) != ResolvedTextDirection.Rtl) goto L7;
        boolean isRtl = true;
    L8:
        int flags = 0;
        if (isTopVisible == true) goto L11;
        if (isBottomVisible == true) goto L11;
    L12:
        if (isTopVisible == false) goto L14;
        if (isBottomVisible == false) goto L14;
    L15:
        if (isRtl == false) goto L17;
        flags = flags | 4;
    L17:
        $this$setInsertionMarker.setInsertionMarkerLocation(x, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), flags);
        return $this$setInsertionMarker;
    L14:
        flags = flags | 2;
    L11:
        flags = 0 | 1;
        goto L12
    L7:
        isRtl = false;
        goto L8
    }

    private static final CursorAnchorInfo.Builder addCharacterBounds(CursorAnchorInfo.Builder $this$addCharacterBounds, int startOffset, int endOffset, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect innerTextFieldBounds) {
        int startOffsetTransformed = offsetMapping.originalToTransformed(startOffset);
        int endOffsetTransformed = offsetMapping.originalToTransformed(endOffset);
        float[] array = new float[(endOffsetTransformed - startOffsetTransformed) * 4];
        textLayoutResult.getMultiParagraph().m6267fillBoundingBoxes8ffj60Q(TextRangeKt.TextRange(startOffsetTransformed, endOffsetTransformed), array, 0);
        int offset = startOffset;
    L3:
        if (offset >= endOffset) goto L17;
        int offsetTransformed = offsetMapping.originalToTransformed(offset);
        int arrayIndex = (offsetTransformed - startOffsetTransformed) * 4;
        Rect rect = new Rect(array[arrayIndex], array[arrayIndex + 1], array[arrayIndex + 2], array[arrayIndex + 3]);
        int flags = 0;
        if (innerTextFieldBounds.overlaps(rect) == false) goto L8;
        flags = 0 | 1;
    L8:
        if (containsInclusive(innerTextFieldBounds, rect.getLeft(), rect.getTop()) == true) goto L10;
    L11:
        flags = flags | 2;
    L13:
        if (textLayoutResult.getBidiRunDirection(offsetTransformed) != ResolvedTextDirection.Rtl) goto L16;
        flags = flags | 4;
    L16:
        int flags2 = flags;
        $this$addCharacterBounds.addCharacterBounds(offset, rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), flags2);
        offset = offset + 1;
        goto L3
    L10:
        if (containsInclusive(innerTextFieldBounds, rect.getRight(), rect.getBottom()) == true) goto L13;
    L17:
        return $this$addCharacterBounds;
    }

    public static final boolean containsInclusive(Rect $this$containsInclusive, float x, float y) {
        float r0 = $this$containsInclusive.getLeft();
        if (x <= $this$containsInclusive.getRight()) goto L5;
    L7:
        boolean r1 = false;
    L8:
        if (r1 == false) goto L18;
        float r2 = $this$containsInclusive.getTop();
        if (y <= $this$containsInclusive.getBottom()) goto L12;
    L14:
        boolean r3 = false;
    L15:
        if (r3 == false) goto L18;
        return true;
    L12:
        if (r2 > y) goto L14;
        r3 = true;
    L18:
        return false;
    L5:
        if (r0 > x) goto L7;
        r1 = true;
        goto L8
    }
}
