package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InternalPointerInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007¢\u0006\u0002\u0010\u0015J\u0016\u0010(\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001cJ\u0016\u0010*\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001cJ\u0016\u0010,\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010\u001cJ\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u0016\u0010/\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u001cJ\u0016\u00101\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001cJ\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\u0016\u00105\u001a\u00020\u000eHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u0010%J\t\u00107\u001a\u00020\nHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u0087\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0007HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020AHÖ\u0001R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0014\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0013\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001cR\u0019\u0010\r\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "uptime", "", "positionOnScreen", "Landroidx/compose/ui/geometry/Offset;", "position", "down", "", "pressure", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/input/pointer/PointerType;", "activeHover", "historical", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "scrollDelta", "originalEventPosition", "(JJJJZFIZLjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActiveHover", "()Z", "getDown", "getHistorical", "()Ljava/util/List;", "getId-J3iCeTQ", "()J", "J", "getOriginalEventPosition-F1C5BW0", "getPosition-F1C5BW0", "getPositionOnScreen-F1C5BW0", "getPressure", "()F", "getScrollDelta-F1C5BW0", "getType-T8wyACA", "()I", "I", "getUptime", "component1", "component1-J3iCeTQ", "component10", "component10-F1C5BW0", "component11", "component11-F1C5BW0", "component2", "component3", "component3-F1C5BW0", "component4", "component4-F1C5BW0", "component5", "component6", "component7", "component7-T8wyACA", "component8", "component9", "copy", "copy-rc8HELY", "(JJJJZFIZLjava/util/List;JJ)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "equals", "other", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerInputEventData {
    public static final int $stable = 0;
    private final boolean activeHover;
    private final boolean down;
    private final List<HistoricalChange> historical;
    private final long id;
    private final long originalEventPosition;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    static {
        $stable = 8;
    }

    public /* synthetic */ PointerInputEventData(long r1, long r3, long r5, long r7, boolean r9, float r10, int r11, boolean r12, List r13, long r14, long r16, DefaultConstructorMarker r18) {
        this(r1, r3, r5, r7, r9, r10, r11, r12, r13, r14, r16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-rc8HELY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputEventData m5595copyrc8HELY$default(PointerInputEventData r17, long r18, long r20, long r22, long r24, boolean r26, float r27, int r28, boolean r29, List r30, long r31, long r33, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        long r2 = r17.id;
    L7:
        if ((r35 & 2) == 0) goto L9;
        long r4 = r17.uptime;
    L11:
        if ((r35 & 4) == 0) goto L13;
        long r6 = r17.positionOnScreen;
    L15:
        if ((r35 & 8) == 0) goto L17;
        long r8 = r17.position;
    L19:
        if ((r35 & 16) == 0) goto L21;
        boolean r10 = r17.down;
    L23:
        if ((r35 & 32) == 0) goto L25;
        float r11 = r17.pressure;
    L27:
        if ((r35 & 64) == 0) goto L29;
        int r12 = r17.type;
    L31:
        if ((r35 & 128) == 0) goto L33;
        boolean r13 = r17.activeHover;
    L35:
        if ((r35 & 256) == 0) goto L37;
        List r14 = r17.historical;
    L39:
        if ((r35 & 512) == 0) goto L41;
        long r3 = r17.scrollDelta;
    L43:
        if ((r35 & 1024) == 0) goto L45;
        long r32 = r3;
        long r34 = r17.originalEventPosition;
    L46:
        long r19 = r2;
        return r17.m5602copyrc8HELY(r19, r4, r6, r8, r10, r11, r12, r13, r14, r32, r34);
    L45:
        r34 = r33;
        r32 = r3;
        goto L46
    L41:
        r3 = r31;
        goto L43
    L37:
        r14 = r30;
        goto L39
    L33:
        r13 = r29;
        goto L35
    L29:
        r12 = r28;
        goto L31
    L25:
        r11 = r27;
        goto L27
    L21:
        r10 = r26;
        goto L23
    L17:
        r8 = r24;
        goto L19
    L13:
        r6 = r22;
        goto L15
    L9:
        r4 = r20;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    /* JADX INFO: renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m5596component1J3iCeTQ() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10-F1C5BW0, reason: not valid java name */
    public final long m5597component10F1C5BW0() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: component11-F1C5BW0, reason: not valid java name */
    public final long m5598component11F1C5BW0() {
        return this.originalEventPosition;
    }

    public final long component2() {
        return this.uptime;
    }

    /* JADX INFO: renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m5599component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* JADX INFO: renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m5600component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    public final float component6() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: component7-T8wyACA, reason: not valid java name */
    public final int m5601component7T8wyACA() {
        return this.type;
    }

    public final boolean component8() {
        return this.activeHover;
    }

    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    /* JADX INFO: renamed from: copy-rc8HELY, reason: not valid java name */
    public final PointerInputEventData m5602copyrc8HELY(long r20, long r22, long r24, long r26, boolean r28, float r29, int r30, boolean r31, List<HistoricalChange> r32, long r33, long r35) {
        return new PointerInputEventData(r20, r22, r24, r26, r28, r29, r30, r31, r32, r33, r35, null);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof PointerInputEventData) == true) goto L8;
        return false;
    L8:
        PointerInputEventData r1 = (PointerInputEventData) r8;
        if (PointerId.m5571equalsimpl0(this.id, r1.id) == true) goto L12;
        return false;
    L12:
        if (this.uptime == r1.uptime) goto L15;
        return false;
    L15:
        if (Offset.m4122equalsimpl0(this.positionOnScreen, r1.positionOnScreen) == true) goto L18;
        return false;
    L18:
        if (Offset.m4122equalsimpl0(this.position, r1.position) == true) goto L21;
        return false;
    L21:
        if (this.down == r1.down) goto L24;
        return false;
    L24:
        if (Float.compare(this.pressure, r1.pressure) == 0) goto L27;
        return false;
    L27:
        if (PointerType.m5660equalsimpl0(this.type, r1.type) == true) goto L30;
        return false;
    L30:
        if (this.activeHover == r1.activeHover) goto L33;
        return false;
    L33:
        if (Intrinsics.areEqual(this.historical, r1.historical) == true) goto L36;
        return false;
    L36:
        if (Offset.m4122equalsimpl0(this.scrollDelta, r1.scrollDelta) == true) goto L39;
        return false;
    L39:
        if (Offset.m4122equalsimpl0(this.originalEventPosition, r1.originalEventPosition) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((PointerId.m5572hashCodeimpl(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.m4127hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m4127hashCodeimpl(this.position)) * 31) + Boolean.hashCode(this.down)) * 31) + Float.hashCode(this.pressure)) * 31) + PointerType.m5661hashCodeimpl(this.type)) * 31) + Boolean.hashCode(this.activeHover)) * 31) + this.historical.hashCode()) * 31) + Offset.m4127hashCodeimpl(this.scrollDelta)) * 31) + Offset.m4127hashCodeimpl(this.originalEventPosition);
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("PointerInputEventData(id=").append(PointerId.m5573toStringimpl(this.id)).append(", uptime=").append(this.uptime).append(", positionOnScreen=").append(Offset.m4133toStringimpl(this.positionOnScreen)).append(", position=").append(Offset.m4133toStringimpl(this.position)).append(", down=").append(this.down).append(", pressure=").append(this.pressure).append(", type=").append(PointerType.m5662toStringimpl(this.type)).append(", activeHover=").append(this.activeHover).append(", historical=").append(this.historical).append(", scrollDelta=").append(Offset.m4133toStringimpl(this.scrollDelta)).append(", originalEventPosition=").append(Offset.m4133toStringimpl(this.originalEventPosition)).append(')');
        return r0.toString();
    }

    private PointerInputEventData(long id, long uptime, long positionOnScreen, long position, boolean down, float pressure, int type, boolean activeHover, List<HistoricalChange> r29, long scrollDelta, long originalEventPosition) {
        this.id = id;
        this.uptime = uptime;
        this.positionOnScreen = positionOnScreen;
        this.position = position;
        this.down = down;
        this.pressure = pressure;
        this.type = type;
        this.activeHover = activeHover;
        this.historical = r29;
        this.scrollDelta = scrollDelta;
        this.originalEventPosition = originalEventPosition;
    }

    public /* synthetic */ PointerInputEventData(long r22, long r24, long r26, long r28, boolean r30, float r31, int r32, boolean r33, List r34, long r35, long r37, int r39, DefaultConstructorMarker r40) {
        if ((r39 & 128) == 0) goto L5;
        boolean r14 = false;
    L7:
        if ((r39 & 256) == 0) goto L9;
        List r15 = new ArrayList();
    L11:
        if ((r39 & 512) == 0) goto L13;
        long r16 = Offset.Companion.m4141getZeroF1C5BW0();
    L15:
        if ((r39 & 1024) == 0) goto L17;
        long r18 = Offset.Companion.m4141getZeroF1C5BW0();
    L18:
        this(r22, r24, r26, r28, r30, r31, r32, r14, r15, r16, r18, null);
        return;
    L17:
        r18 = r37;
        goto L18
    L13:
        r16 = r35;
        goto L15
    L9:
        r15 = r34;
        goto L11
    L5:
        r14 = r33;
        goto L7
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m5603getIdJ3iCeTQ() {
        return this.id;
    }

    public final long getUptime() {
        return this.uptime;
    }

    /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m5606getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m5605getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getDown() {
        return this.down;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m5608getTypeT8wyACA() {
        return this.type;
    }

    public final boolean getActiveHover() {
        return this.activeHover;
    }

    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m5607getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m5604getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }
}
