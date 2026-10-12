package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: CursorAnchorInfoBuilder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001ax\u0010\t\u001a\u00020\n*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a$\u0010\u001a\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"addCharacterBounds", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "", "endOffset", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "innerTextFieldBounds", "Landroidx/compose/ui/geometry/Rect;", "build", "Landroid/view/inputmethod/CursorAnchorInfo;", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "composition", "matrix", "Landroid/graphics/Matrix;", "decorationBoxBounds", "includeInsertionMarker", "", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "build-vxqZcH0", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Landroidx/compose/ui/text/TextLayoutResult;Landroid/graphics/Matrix;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "setInsertionMarker", "selectionStart", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX INFO: renamed from: build-vxqZcH0$default, reason: not valid java name */
    public static /* synthetic */ CursorAnchorInfo m1227buildvxqZcH0$default(CursorAnchorInfo.Builder r1, CharSequence r2, long r3, TextRange r5, TextLayoutResult r6, Matrix r7, Rect r8, Rect r9, boolean r10, boolean r11, boolean r12, boolean r13, int r14, Object r15) {
        if ((r14 & 128) == 0) goto L6;
        r10 = true;
    L6:
        if ((r14 & 256) == 0) goto L9;
        r11 = true;
    L9:
        if ((r14 & 512) == 0) goto L12;
        r12 = true;
    L12:
        if ((r14 & 1024) == 0) goto L15;
        r13 = true;
    L15:
        return m1226buildvxqZcH0(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    }

    /* JADX INFO: renamed from: build-vxqZcH0, reason: not valid java name */
    public static final CursorAnchorInfo m1226buildvxqZcH0(CursorAnchorInfo.Builder $this$build_u2dvxqZcH0, CharSequence text, long selection, TextRange composition, TextLayoutResult textLayoutResult, Matrix matrix, Rect innerTextFieldBounds, Rect decorationBoxBounds, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        $this$build_u2dvxqZcH0.reset();
        $this$build_u2dvxqZcH0.setMatrix(matrix);
        int selectionStart = TextRange.m6415getMinimpl(selection);
        int selectionEnd = TextRange.m6414getMaximpl(selection);
        $this$build_u2dvxqZcH0.setSelectionRange(selectionStart, selectionEnd);
        if (includeInsertionMarker == false) goto L5;
        setInsertionMarker($this$build_u2dvxqZcH0, selectionStart, textLayoutResult, innerTextFieldBounds);
    L5:
        if (includeCharacterBounds == false) goto L18;
        int compositionEnd = -1;
        if (composition == null) goto L9;
        int compositionStart = TextRange.m6415getMinimpl(composition.m6421unboximpl());
    L10:
        if (composition == null) goto L12;
        compositionEnd = TextRange.m6414getMaximpl(composition.m6421unboximpl());
    L12:
        boolean r4 = false;
        if (compositionStart < 0) goto L16;
        if (compositionStart >= compositionEnd) goto L16;
        r4 = true;
    L16:
        if (r4 == false) goto L18;
        $this$build_u2dvxqZcH0.setComposingText(compositionStart, text.subSequence(compositionStart, compositionEnd));
        addCharacterBounds($this$build_u2dvxqZcH0, compositionStart, compositionEnd, textLayoutResult, innerTextFieldBounds);
        goto L18
    L9:
        compositionStart = -1;
    L18:
        int compositionEnd2 = Build.VERSION.SDK_INT;
        if (compositionEnd2 < 33) goto L23;
        if (includeEditorBounds == false) goto L23;
        CursorAnchorInfoApi33Helper.setEditorBoundsInfo($this$build_u2dvxqZcH0, decorationBoxBounds);
    L23:
        if (Build.VERSION.SDK_INT < 34) goto L27;
        if (includeLineBounds == false) goto L27;
        CursorAnchorInfoApi34Helper.addVisibleLineBounds($this$build_u2dvxqZcH0, textLayoutResult, innerTextFieldBounds);
    L27:
        return $this$build_u2dvxqZcH0.build();
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder $this$setInsertionMarker, int selectionStart, TextLayoutResult textLayoutResult, Rect innerTextFieldBounds) {
        if (selectionStart >= 0) goto L4;
        return $this$setInsertionMarker;
    L4:
        Rect cursorRect = textLayoutResult.getCursorRect(selectionStart);
        float r1 = cursorRect.getLeft();
        long arg0$iv = textLayoutResult.m6388getSizeYbymL2g();
        float x = RangesKt.coerceIn(r1, 0.0f, (int) (arg0$iv >> 32));
        boolean isTopVisible = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(innerTextFieldBounds, x, cursorRect.getTop());
        boolean isBottomVisible = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(innerTextFieldBounds, x, cursorRect.getBottom());
        if (textLayoutResult.getBidiRunDirection(selectionStart) != ResolvedTextDirection.Rtl) goto L7;
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

    private static final CursorAnchorInfo.Builder addCharacterBounds(CursorAnchorInfo.Builder $this$addCharacterBounds, int startOffset, int endOffset, TextLayoutResult textLayoutResult, Rect innerTextFieldBounds) {
        float[] array = new float[(endOffset - startOffset) * 4];
        textLayoutResult.getMultiParagraph().m6267fillBoundingBoxes8ffj60Q(TextRangeKt.TextRange(startOffset, endOffset), array, 0);
        int offset = startOffset;
    L3:
        if (offset >= endOffset) goto L18;
        int arrayIndex = (offset - startOffset) * 4;
        Rect rect = new Rect(array[arrayIndex], array[arrayIndex + 1], array[arrayIndex + 2], array[arrayIndex + 3]);
        int flags = 0;
        if (innerTextFieldBounds.overlaps(rect) == false) goto L8;
        flags = 0 | 1;
    L8:
        if (LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(innerTextFieldBounds, rect.getLeft(), rect.getTop()) == true) goto L10;
    L11:
        flags = flags | 2;
    L13:
        if (textLayoutResult.getBidiRunDirection(offset) != ResolvedTextDirection.Rtl) goto L16;
        flags = flags | 4;
    L16:
        float r4 = rect.getLeft();
        float r5 = rect.getTop();
        float r6 = rect.getRight();
        float r7 = rect.getBottom();
        $this$addCharacterBounds.addCharacterBounds(offset, r4, r5, r6, r7, flags);
        offset = offset + 1;
        goto L3
    L10:
        if (LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(innerTextFieldBounds, rect.getRight(), rect.getBottom()) == true) goto L13;
    L18:
        return $this$addCharacterBounds;
    }
}
