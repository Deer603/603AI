package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0007\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0007\u001a\f\u0010\n\u001a\u00020\b*\u00020\u0002H\u0007\u001a\u001e\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0015*\u00020\u0002¢\u0006\u0002\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u000f\u0010\u0018\u001a\u00020\u0015*\u00020\u0002¢\u0006\u0002\u0010\u0016\u001a\u001b\u0010\u0019\u001a\u00020\u0015*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u001b\u001a\n\u0010\u001c\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u001d\u001a\u00020\u0001*\u00020\u0002\u001a\r\u0010\u001e\u001a\u00020\u001f*\u00020\u0001H\u0082\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"anyChangeConsumed", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changedToDown", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "consumeAllChanges", "", "consumeDownChange", "consumePositionChange", "isOutOfBounds", "size", "Landroidx/compose/ui/unit/IntSize;", "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "isOutOfBounds-jwHxaWs", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z", "positionChange", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeConsumed", "positionChangeIgnoreConsumed", "positionChangeInternal", "ignoreConsumed", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J", "positionChanged", "positionChangedIgnoreConsumed", "toInt", "", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PointerEventKt {
    public static final boolean changedToDown(PointerInputChange $this$changedToDown) {
        if ($this$changedToDown.isConsumed() == false) goto L5;
    L9:
        return false;
    L5:
        if ($this$changedToDown.getPreviousPressed() == true) goto L9;
        if ($this$changedToDown.getPressed() == false) goto L9;
        return true;
    }

    public static final boolean changedToDownIgnoreConsumed(PointerInputChange $this$changedToDownIgnoreConsumed) {
        if ($this$changedToDownIgnoreConsumed.getPreviousPressed() == false) goto L5;
    L7:
        return false;
    L5:
        if ($this$changedToDownIgnoreConsumed.getPressed() == false) goto L7;
        return true;
    }

    public static final boolean changedToUp(PointerInputChange $this$changedToUp) {
        if ($this$changedToUp.isConsumed() == false) goto L5;
    L9:
        return false;
    L5:
        if ($this$changedToUp.getPreviousPressed() == false) goto L9;
        if ($this$changedToUp.getPressed() == true) goto L9;
        return true;
    }

    public static final boolean changedToUpIgnoreConsumed(PointerInputChange $this$changedToUpIgnoreConsumed) {
        if ($this$changedToUpIgnoreConsumed.getPreviousPressed() == true) goto L5;
    L7:
        return false;
    L5:
        if ($this$changedToUpIgnoreConsumed.getPressed() == true) goto L7;
        return true;
    }

    public static final boolean positionChanged(PointerInputChange $this$positionChanged) {
        return !Offset.m4122equalsimpl0(positionChangeInternal($this$positionChanged, false), Offset.Companion.m4141getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange $this$positionChangedIgnoreConsumed) {
        return true ^ Offset.m4122equalsimpl0(positionChangeInternal($this$positionChangedIgnoreConsumed, true), Offset.Companion.m4141getZeroF1C5BW0());
    }

    public static final long positionChange(PointerInputChange $this$positionChange) {
        return positionChangeInternal($this$positionChange, false);
    }

    public static final long positionChangeIgnoreConsumed(PointerInputChange $this$positionChangeIgnoreConsumed) {
        return positionChangeInternal($this$positionChangeIgnoreConsumed, true);
    }

    static /* synthetic */ long positionChangeInternal$default(PointerInputChange r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = false;
    L6:
        return positionChangeInternal(r0, r1);
    }

    private static final long positionChangeInternal(PointerInputChange $this$positionChangeInternal, boolean ignoreConsumed) {
        long previousPosition = $this$positionChangeInternal.m5590getPreviousPositionF1C5BW0();
        long currentPosition = $this$positionChangeInternal.m5589getPositionF1C5BW0();
        long offset = Offset.m4129minusMKHz9U(currentPosition, previousPosition);
        if (ignoreConsumed == true) goto L8;
        if ($this$positionChangeInternal.isConsumed() == false) goto L8;
        return Offset.Companion.m4141getZeroF1C5BW0();
    L8:
        return offset;
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean positionChangeConsumed(PointerInputChange $this$positionChangeConsumed) {
        return $this$positionChangeConsumed.isConsumed();
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean anyChangeConsumed(PointerInputChange $this$anyChangeConsumed) {
        return $this$anyChangeConsumed.isConsumed();
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @ReplaceWith(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void consumeDownChange(PointerInputChange $this$consumeDownChange) {
        if ($this$consumeDownChange.getPressed() == $this$consumeDownChange.getPreviousPressed()) goto L6;
        $this$consumeDownChange.consume();
        return;
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @ReplaceWith(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void consumePositionChange(PointerInputChange $this$consumePositionChange) {
        if (Offset.m4122equalsimpl0(positionChange($this$consumePositionChange), Offset.Companion.m4141getZeroF1C5BW0()) == true) goto L6;
        $this$consumePositionChange.consume();
        return;
    }

    @Deprecated(message = "Use consume() instead", replaceWith = @ReplaceWith(expression = "consume()", imports = {}))
    public static final void consumeAllChanges(PointerInputChange $this$consumeAllChanges) {
        $this$consumeAllChanges.consume();
    }

    @Deprecated(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    /* JADX INFO: renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m5533isOutOfBoundsO0kMr_c(PointerInputChange $this$isOutOfBounds_u2dO0kMr_c, long size) {
        long position = $this$isOutOfBounds_u2dO0kMr_c.m5589getPositionF1C5BW0();
        int bits$iv$iv$iv = (int) (position >> 32);
        float x = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (position & 4294967295L);
        float y = Float.intBitsToFloat(bits$iv$iv$iv2);
        int width = (int) (size >> 32);
        int height = (int) (4294967295L & size);
        boolean r6 = true;
        if (x >= 0.0f) goto L5;
        boolean r5 = true;
    L7:
        if (x <= width) goto L9;
        boolean r9 = true;
    L10:
        boolean r7 = r5 | r9;
        if (y >= 0.0f) goto L13;
        boolean r2 = true;
    L14:
        boolean r3 = r2 | r7;
        if (y > height) goto L19;
        r6 = false;
    L19:
        return r3 | r6;
    L13:
        r2 = false;
        goto L14
    L9:
        r9 = false;
        goto L10
    L5:
        r5 = false;
        goto L7
    }

    /* JADX INFO: renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m5534isOutOfBoundsjwHxaWs(PointerInputChange r15, long r16, long r18) {
        boolean r0 = PointerType.m5660equalsimpl0(r15.m5592getTypeT8wyACA(), PointerType.Companion.m5667getTouchT8wyACA());
        long r1 = r15.m5589getPositionF1C5BW0();
        float r8 = Float.intBitsToFloat((int) (r1 >> 32));
        float r11 = Float.intBitsToFloat((int) (r1 & 4294967295L));
        float r12 = Float.intBitsToFloat((int) (r18 >> 32)) * (r0 ? 1.0f : 0.0f);
        float r3 = ((int) (r16 >> 32)) + r12;
        float r13 = Float.intBitsToFloat((int) (r18 & 4294967295L)) * (r0 ? 1.0f : 0.0f);
        float r4 = ((int) (4294967295L & r16)) + r13;
        boolean r6 = true;
        if (r8 >= (-r12)) goto L5;
        boolean r5 = true;
    L7:
        if (r8 <= r3) goto L9;
        boolean r9 = true;
    L10:
        boolean r7 = r5 | r9;
        if (r11 >= (-r13)) goto L13;
        boolean r10 = true;
    L14:
        boolean r14 = r7 | r10;
        if (r11 > r4) goto L19;
        r6 = false;
    L19:
        return r14 | r6;
    L13:
        r10 = false;
        goto L14
    L9:
        r9 = false;
        goto L10
    L5:
        r5 = false;
        goto L7
    }

    private static final int toInt(boolean r1) {
        return r1 ? 1 : 0;
    }
}
