package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J#\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u000f*\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u000f*\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u0005X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/gestures/TouchSlopDetector;", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "initialPositionChange", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "totalPositionChange", "J", "addPointerInputChange", "dragEvent", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "touchSlop", "", "addPointerInputChange-dBAh8RU", "(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J", "calculatePostSlopOffset", "calculatePostSlopOffset-tuRUvjQ", "(F)J", "reset", "", "crossAxis", "crossAxis-k-4lQ0M", "(J)F", "mainAxis", "mainAxis-k-4lQ0M", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TouchSlopDetector {
    public static final int $stable = 0;
    private final Orientation orientation;
    private long totalPositionChange;

    static {
        $stable = 8;
    }

    public /* synthetic */ TouchSlopDetector(Orientation r1, long r2, DefaultConstructorMarker r4) {
        this(r1, r2);
    }

    private TouchSlopDetector(Orientation orientation, long initialPositionChange) {
        this.orientation = orientation;
        this.totalPositionChange = initialPositionChange;
    }

    public /* synthetic */ TouchSlopDetector(Orientation r2, long r3, int r5, DefaultConstructorMarker r6) {
        DefaultConstructorMarker r0 = null;
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L8;
        r3 = Offset.Companion.m4141getZeroF1C5BW0();
    L8:
        this(r2, r3, r0);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m523mainAxisk4lQ0M(long $this$mainAxis_u2dk_u2d4lQ0M) {
        if (this.orientation != Orientation.Horizontal) goto L5;
        int bits$iv$iv$iv = (int) ($this$mainAxis_u2dk_u2d4lQ0M >> 32);
        return Float.intBitsToFloat(bits$iv$iv$iv);
    L5:
        int bits$iv$iv$iv2 = (int) (4294967295L & $this$mainAxis_u2dk_u2d4lQ0M);
        return Float.intBitsToFloat(bits$iv$iv$iv2);
    }

    /* JADX INFO: renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m522crossAxisk4lQ0M(long $this$crossAxis_u2dk_u2d4lQ0M) {
        if (this.orientation != Orientation.Horizontal) goto L5;
        int bits$iv$iv$iv = (int) (4294967295L & $this$crossAxis_u2dk_u2d4lQ0M);
        return Float.intBitsToFloat(bits$iv$iv$iv);
    L5:
        int bits$iv$iv$iv2 = (int) ($this$crossAxis_u2dk_u2d4lQ0M >> 32);
        return Float.intBitsToFloat(bits$iv$iv$iv2);
    }

    /* JADX INFO: renamed from: addPointerInputChange-dBAh8RU, reason: not valid java name */
    public final long m521addPointerInputChangedBAh8RU(PointerInputChange dragEvent, float touchSlop) {
        long currentPosition = dragEvent.m5589getPositionF1C5BW0();
        long previousPosition = dragEvent.m5590getPreviousPositionF1C5BW0();
        long positionChange = Offset.m4129minusMKHz9U(currentPosition, previousPosition);
        this.totalPositionChange = Offset.m4130plusMKHz9U(this.totalPositionChange, positionChange);
        Orientation r6 = this.orientation;
        long r7 = this.totalPositionChange;
        if (r6 != null) goto L5;
        float inDirection = Offset.m4123getDistanceimpl(r7);
    L7:
        if (inDirection < touchSlop) goto L9;
        boolean hasCrossedSlop = true;
    L10:
        if (hasCrossedSlop == false) goto L13;
        return m520calculatePostSlopOffsettuRUvjQ(touchSlop);
    L13:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L9:
        hasCrossedSlop = false;
        goto L10
    L5:
        inDirection = Math.abs(m523mainAxisk4lQ0M(r7));
        goto L7
    }

    public final void reset() {
        this.totalPositionChange = Offset.Companion.m4141getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m520calculatePostSlopOffsettuRUvjQ(float touchSlop) {
        Orientation r0 = this.orientation;
        long r1 = this.totalPositionChange;
        if (r0 != null) goto L5;
        long touchSlopOffset = Offset.m4132timestuRUvjQ(Offset.m4120divtuRUvjQ(r1, Offset.m4123getDistanceimpl(this.totalPositionChange)), touchSlop);
        return Offset.m4129minusMKHz9U(this.totalPositionChange, touchSlopOffset);
    L5:
        float finalMainAxisChange = m523mainAxisk4lQ0M(r1) - (Math.signum(m523mainAxisk4lQ0M(this.totalPositionChange)) * touchSlop);
        float finalCrossAxisChange = m522crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation != Orientation.Horizontal) goto L8;
        long v1$iv$iv = Float.floatToRawIntBits(finalMainAxisChange);
        long v2$iv$iv = Float.floatToRawIntBits(finalCrossAxisChange);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    L8:
        long v1$iv$iv2 = Float.floatToRawIntBits(finalCrossAxisChange);
        long v2$iv$iv2 = Float.floatToRawIntBits(finalMainAxisChange);
        return Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (4294967295L & v2$iv$iv2));
    }
}
