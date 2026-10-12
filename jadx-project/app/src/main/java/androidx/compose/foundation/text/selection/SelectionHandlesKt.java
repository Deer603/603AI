package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: SelectionHandles.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0000\u001a \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0012H\u0000\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"HandleHeight", "Landroidx/compose/ui/unit/Dp;", "getHandleHeight", "()F", "F", "HandleWidth", "getHandleWidth", "SelectionHandleInfoKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "getSelectionHandleInfoKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getAdjustedCoordinates", "Landroidx/compose/ui/geometry/Offset;", "position", "getAdjustedCoordinates-k-4lQ0M", "(J)J", "isHandleLtrDirection", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "areHandlesCrossed", "isLeftSelectionHandle", "isStartHandle", "handlesCrossed", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectionHandlesKt {
    private static final float HandleHeight = 0.0f;
    private static final float HandleWidth = 0.0f;
    private static final SemanticsPropertyKey<SelectionHandleInfo> SelectionHandleInfoKey = null;

    static {
        HandleWidth = Dp.m6973constructorimpl(25);
        HandleHeight = Dp.m6973constructorimpl(25);
        SelectionHandleInfoKey = new SemanticsPropertyKey("SelectionHandleInfo", null, 2, null);
    }

    public static final float getHandleWidth() {
        return HandleWidth;
    }

    public static final float getHandleHeight() {
        return HandleHeight;
    }

    public static final SemanticsPropertyKey<SelectionHandleInfo> getSelectionHandleInfoKey() {
        return SelectionHandleInfoKey;
    }

    /* JADX INFO: renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m1447getAdjustedCoordinatesk4lQ0M(long position) {
        int bits$iv$iv$iv = (int) (position >> 32);
        float x$iv = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (position & 4294967295L);
        float y$iv = Float.intBitsToFloat(bits$iv$iv$iv2) - 1.0f;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    public static final boolean isLeftSelectionHandle(boolean isStartHandle, ResolvedTextDirection direction, boolean handlesCrossed) {
        if (isStartHandle == false) goto L5;
        return isHandleLtrDirection(direction, handlesCrossed);
    L5:
        if (isHandleLtrDirection(direction, handlesCrossed) == true) goto L7;
        return true;
    L7:
        return false;
    }

    public static final boolean isHandleLtrDirection(ResolvedTextDirection direction, boolean areHandlesCrossed) {
        if (direction != ResolvedTextDirection.Ltr) goto L6;
        if (areHandlesCrossed == true) goto L6;
    L8:
        return true;
    L6:
        if (direction != ResolvedTextDirection.Rtl) goto L9;
        if (areHandlesCrossed == true) goto L8;
    L9:
        return false;
    }
}
