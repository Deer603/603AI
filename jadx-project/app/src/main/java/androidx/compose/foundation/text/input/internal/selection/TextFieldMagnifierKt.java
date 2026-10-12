package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TextFieldMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-hUlJWOE", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;J)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldMagnifierKt {

    /* JADX INFO: compiled from: TextFieldMagnifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Handle.values().length];
            r0[Handle.Cursor.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[Handle.SelectionStart.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[Handle.SelectionEnd.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-hUlJWOE, reason: not valid java name */
    public static final long m1341calculateSelectionMagnifierCenterAndroidhUlJWOE(TransformedTextFieldState textFieldState, TextFieldSelectionState selectionState, TextLayoutState textLayoutState, long magnifierSize) {
        long localDragPosition = selectionState.m1365getHandleDragPositionF1C5BW0();
        boolean r6 = true;
        if ((9223372034707292159L & localDragPosition) != InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L50;
        if (textFieldState.getVisualText().length() == 0) goto L11;
        r6 = false;
    L11:
        if (r6 == true) goto L50;
        long selection = textFieldState.getVisualText().m1188getSelectiond9O1mEE();
        Handle r4 = selectionState.getDraggingHandle();
        if (r4 != null) goto L16;
        int r5 = -1;
    L17:
        switch(r5) {
            case -1: goto L47;
            case 0: goto L19;
            case 1: goto L21;
            case 2: goto L21;
            case 3: goto L20;
            default: goto L19;
        };
    L20:
        int textOffset = TextRange.m6412getEndimpl(selection);
    L22:
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) goto L25;
        int bits$iv$iv$iv = (int) (localDragPosition >> 32);
        float dragX = Float.intBitsToFloat(bits$iv$iv$iv);
        int line = layoutResult.getLineForOffset(textOffset);
        float lineStart = layoutResult.getLineLeft(line);
        float lineEnd = layoutResult.getLineRight(line);
        float lineMin = Math.min(lineStart, lineEnd);
        float lineMax = Math.max(lineStart, lineEnd);
        float centerX = RangesKt.coerceIn(dragX, lineMin, lineMax);
        if (IntSize.m7142equalsimpl0(magnifierSize, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L33;
        if (Math.abs(dragX - centerX) <= (((int) (magnifierSize >> 32)) / 2)) goto L33;
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L33:
        float top = layoutResult.getLineTop(line);
        float bottom = layoutResult.getLineBottom(line);
        float centerY = ((bottom - top) / 2.0f) + top;
        long v1$iv$iv = Float.floatToRawIntBits(centerX);
        long v2$iv$iv = Float.floatToRawIntBits(centerY);
        long offset = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        LayoutCoordinates innerCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (innerCoordinates == null) goto L45;
        if (innerCoordinates.isAttached() == true) goto L39;
        innerCoordinates = null;
    L39:
        if (innerCoordinates == null) goto L45;
        offset = TextLayoutStateKt.m1303coerceIn3MmeM6k(offset, SelectionManagerKt.visibleBounds(innerCoordinates));
    L45:
        return TextLayoutStateKt.m1305fromTextLayoutToCoreUv8p0NA(textLayoutState, offset);
    L25:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L21:
        textOffset = TextRange.m6417getStartimpl(selection);
        goto L22
    L19:
        throw new NoWhenBranchMatchedException();
    L47:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L16:
        r5 = WhenMappings.$EnumSwitchMapping$0[r4.ordinal()];
    L50:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L5:
        r2 = false;
        goto L6
    }
}
