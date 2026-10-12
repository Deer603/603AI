package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B[\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0002\u0010\u0011BQ\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0014Bu\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0002\u0010\u001bBa\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0002\u0010\u001cJ\u0006\u0010G\u001a\u00020HJt\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ\u0084\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bP\u0010QJl\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010SJt\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010UJj\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bV\u0010WJz\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u0010\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\b\u0010Z\u001a\u00020[H\u0016R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F¢\u0006\f\u0012\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0011\u00104\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u0010+R\"\u0010\u001a\u001a\u00020\u0007X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b5\u00102\"\u0004\b6\u00107R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00103\u001a\u0004\b8\u00102R\u001a\u00109\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010+\"\u0004\b;\u0010-R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0019\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00103\u001a\u0004\b?\u00102R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b@\u0010+R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u00102R\u0019\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00103\u001a\u0004\bB\u00102R\u0019\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "uptimeMillis", "", "position", "Landroidx/compose/ui/geometry/Offset;", "pressed", "", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/input/pointer/PointerType;", "scrollDelta", "(JJJZJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "consumed", "Landroidx/compose/ui/input/pointer/ConsumedData;", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "pressure", "", "historical", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_consumed", "get_consumed$annotations", "()V", "_historical", "getConsumed$annotations", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "consumedDelegate", "getConsumedDelegate$ui_release", "()Landroidx/compose/ui/input/pointer/PointerInputChange;", "setConsumedDelegate$ui_release", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "downChange", "getDownChange$ui_release", "()Z", "setDownChange$ui_release", "(Z)V", "getHistorical$annotations", "getHistorical", "()Ljava/util/List;", "getId-J3iCeTQ", "()J", "J", "isConsumed", "getOriginalEventPosition-F1C5BW0$ui_release", "setOriginalEventPosition-k-4lQ0M$ui_release", "(J)V", "getPosition-F1C5BW0", "positionChange", "getPositionChange$ui_release", "setPositionChange$ui_release", "getPressed", "getPressure", "()F", "getPreviousPosition-F1C5BW0", "getPreviousPressed", "getPreviousUptimeMillis", "getScrollDelta-F1C5BW0", "getType-T8wyACA", "()I", "I", "getUptimeMillis", "consume", "", "copy", "currentTime", "currentPosition", "currentPressed", "previousTime", "copy-Tn9QgHE", "(JJJZFJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-wbzehF4", "(JJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-Ezr-O64", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;I)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-0GkPj7c", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;IJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-JKmWfYY", "(JJJZJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-OHpmEuE", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerInputChange {
    public static final int $stable = 0;
    private ConsumedData _consumed;
    private List<HistoricalChange> _historical;
    private PointerInputChange consumedDelegate;
    private boolean downChange;
    private final long id;
    private long originalEventPosition;
    private final long position;
    private boolean positionChange;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    static {
    }

    public /* synthetic */ PointerInputChange(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13, boolean r14, int r15, long r16, DefaultConstructorMarker r18) {
        this(r1, r3, r5, r7, r8, r9, r11, r13, r14, r15, r16);
    }

    public /* synthetic */ PointerInputChange(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13, boolean r14, int r15, List r16, long r17, long r19, DefaultConstructorMarker r21) {
        this(r1, r3, r5, r7, r8, r9, r11, r13, r14, r15, r16, r17, r19);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @ReplaceWith(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ PointerInputChange(long r1, long r3, long r5, boolean r7, long r8, long r10, boolean r12, ConsumedData r13, int r14, DefaultConstructorMarker r15) {
        this(r1, r3, r5, r7, r8, r10, r12, r13, r14);
    }

    public /* synthetic */ PointerInputChange(long r1, long r3, long r5, boolean r7, long r8, long r10, boolean r12, boolean r13, int r14, long r15, DefaultConstructorMarker r17) {
        this(r1, r3, r5, r7, r8, r10, r12, r13, r14, r15);
    }

    @Deprecated(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void getConsumed$annotations() {
    }

    public static /* synthetic */ void getHistorical$annotations() {
    }

    private static /* synthetic */ void get_consumed$annotations() {
    }

    private PointerInputChange(long id, long uptimeMillis, long position, boolean pressed, float pressure, long previousUptimeMillis, long previousPosition, boolean previousPressed, boolean isInitiallyConsumed, int type, long scrollDelta) {
        this.id = id;
        this.uptimeMillis = uptimeMillis;
        this.position = position;
        this.pressed = pressed;
        this.pressure = pressure;
        this.previousUptimeMillis = previousUptimeMillis;
        this.previousPosition = previousPosition;
        this.previousPressed = previousPressed;
        this.type = type;
        this.scrollDelta = scrollDelta;
        this.originalEventPosition = Offset.Companion.m4141getZeroF1C5BW0();
        this.downChange = isInitiallyConsumed;
        this.positionChange = isInitiallyConsumed;
    }

    public /* synthetic */ PointerInputChange(long r22, long r24, long r26, boolean r28, float r29, long r30, long r32, boolean r34, boolean r35, int r36, long r37, int r39, DefaultConstructorMarker r40) {
        if ((r39 & 512) == 0) goto L5;
        int r17 = PointerType.Companion.m5667getTouchT8wyACA();
    L7:
        if ((r39 & 1024) == 0) goto L9;
        long r18 = Offset.Companion.m4141getZeroF1C5BW0();
    L10:
        this(r22, r24, r26, r28, r29, r30, r32, r34, r35, r17, r18, null);
        return;
    L9:
        r18 = r37;
        goto L10
    L5:
        r17 = r36;
        goto L7
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m5587getIdJ3iCeTQ() {
        return this.id;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m5589getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* JADX INFO: renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m5590getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m5592getTypeT8wyACA() {
        return this.type;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m5591getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    public /* synthetic */ PointerInputChange(long r21, long r23, long r25, boolean r27, long r28, long r30, boolean r32, boolean r33, int r34, long r35, int r37, DefaultConstructorMarker r38) {
        if ((r37 & 256) == 0) goto L5;
        int r16 = PointerType.Companion.m5667getTouchT8wyACA();
    L7:
        if ((r37 & 512) == 0) goto L9;
        long r17 = Offset.Companion.m4141getZeroF1C5BW0();
    L10:
        this(r21, r23, r25, r27, r28, r30, r32, r33, r16, r17, null);
        return;
    L9:
        r17 = r35;
        goto L10
    L5:
        r16 = r34;
        goto L7
    }

    private PointerInputChange(long id, long uptimeMillis, long position, boolean pressed, long previousUptimeMillis, long previousPosition, boolean previousPressed, boolean isInitiallyConsumed, int type, long scrollDelta) {
        this(id, uptimeMillis, position, pressed, 1.0f, previousUptimeMillis, previousPosition, previousPressed, isInitiallyConsumed, type, scrollDelta, null);
    }

    public /* synthetic */ PointerInputChange(long r18, long r20, long r22, boolean r24, long r25, long r27, boolean r29, ConsumedData r30, int r31, int r32, DefaultConstructorMarker r33) {
        if ((r32 & 256) == 0) goto L5;
        int r15 = PointerType.Companion.m5667getTouchT8wyACA();
    L6:
        this(r18, r20, r22, r24, r25, r27, r29, r30, r15, null);
        return;
    L5:
        r15 = r31;
        goto L6
    }

    private PointerInputChange(long id, long uptimeMillis, long position, boolean pressed, long previousUptimeMillis, long previousPosition, boolean previousPressed, ConsumedData consumed, int type) {
        if (consumed.getDownChange() == false) goto L5;
    L8:
        boolean r0 = true;
    L9:
        float r9 = 1.0f;
        this(id, uptimeMillis, position, pressed, r9, previousUptimeMillis, previousPosition, previousPressed, r0, type, Offset.Companion.m4141getZeroF1C5BW0(), null);
        return;
    L5:
        if (consumed.getPositionChange() == true) goto L8;
        r0 = false;
        goto L9
    }

    private PointerInputChange(long id, long uptimeMillis, long position, boolean pressed, float pressure, long previousUptimeMillis, long previousPosition, boolean previousPressed, boolean isInitiallyConsumed, int type, List<HistoricalChange> r35, long scrollDelta, long originalEventPosition) {
        this(id, uptimeMillis, position, pressed, pressure, previousUptimeMillis, previousPosition, previousPressed, isInitiallyConsumed, type, scrollDelta, null);
        this._historical = r35;
        this.originalEventPosition = originalEventPosition;
    }

    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> r0 = this._historical;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name */
    public final long m5588getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* JADX INFO: renamed from: setOriginalEventPosition-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m5593setOriginalEventPositionk4lQ0M$ui_release(long r1) {
        this.originalEventPosition = r1;
    }

    public final boolean isConsumed() {
        PointerInputChange r0 = this.consumedDelegate;
        if (r0 == null) goto L6;
        return r0.isConsumed();
    L6:
        if (this.downChange == false) goto L8;
    L11:
        return true;
    L8:
        if (this.positionChange == true) goto L11;
        return false;
    }

    public final boolean getDownChange$ui_release() {
        return this.downChange;
    }

    public final void setDownChange$ui_release(boolean r1) {
        this.downChange = r1;
    }

    public final boolean getPositionChange$ui_release() {
        return this.positionChange;
    }

    public final void setPositionChange$ui_release(boolean r1) {
        this.positionChange = r1;
    }

    public final PointerInputChange getConsumedDelegate$ui_release() {
        return this.consumedDelegate;
    }

    public final void setConsumedDelegate$ui_release(PointerInputChange r1) {
        this.consumedDelegate = r1;
    }

    public final void consume() {
        if (this.consumedDelegate != null) goto L5;
        this.downChange = true;
        this.positionChange = true;
        return;
    L5:
        PointerInputChange r0 = this.consumedDelegate;
        if (r0 == null) goto L10;
        r0.consume();
        return;
    }

    public final ConsumedData getConsumed() {
        if (this._consumed != null) goto L5;
        this._consumed = new ConsumedData(this);
    L5:
        ConsumedData r0 = this._consumed;
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    /* JADX INFO: renamed from: copy-Ezr-O64$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m5576copyEzrO64$default(PointerInputChange r14, long r15, long r17, long r19, boolean r21, long r22, long r24, boolean r26, ConsumedData r27, int r28, int r29, Object r30) {
        if ((r29 & 1) == 0) goto L5;
        long r1 = r14.id;
    L7:
        if ((r29 & 2) == 0) goto L9;
        long r3 = r14.uptimeMillis;
    L11:
        if ((r29 & 4) == 0) goto L13;
        long r5 = r14.position;
    L15:
        if ((r29 & 8) == 0) goto L17;
        boolean r7 = r14.pressed;
    L19:
        if ((r29 & 16) == 0) goto L21;
        long r8 = r14.previousUptimeMillis;
    L23:
        if ((r29 & 32) == 0) goto L25;
        long r10 = r14.previousPosition;
    L27:
        if ((r29 & 64) == 0) goto L29;
        boolean r12 = r14.previousPressed;
    L31:
        if ((r29 & 128) == 0) goto L33;
        ConsumedData r13 = r14.getConsumed();
    L35:
        if ((r29 & 256) == 0) goto L37;
        int r0 = r14.type;
    L38:
        long r16 = r1;
        long r18 = r3;
        long r20 = r5;
        boolean r23 = r7;
        long r25 = r8;
        long r210 = r10;
        boolean r211 = r12;
        ConsumedData r212 = r13;
        return r14.m5582copyEzrO64(r16, r18, r20, r23, r25, r210, r211, r212, r0);
    L37:
        r0 = r28;
        goto L38
    L33:
        r13 = r27;
        goto L35
    L29:
        r12 = r26;
        goto L31
    L25:
        r10 = r24;
        goto L27
    L21:
        r8 = r22;
        goto L23
    L17:
        r7 = r21;
        goto L19
    L13:
        r5 = r19;
        goto L15
    L9:
        r3 = r17;
        goto L11
    L5:
        r1 = r15;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @ReplaceWith(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    /* JADX INFO: renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m5582copyEzrO64(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, ConsumedData consumed, int type) {
        float r9 = this.pressure;
        if (consumed.getDownChange() == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        PointerInputChange it = new PointerInputChange(id, currentTime, currentPosition, currentPressed, r9, previousTime, previousPosition, previousPressed, r2, type, getHistorical(), this.scrollDelta, this.originalEventPosition, null);
        it.positionChange = this.positionChange;
        it.downChange = this.downChange;
        return it;
    L5:
        if (consumed.getPositionChange() == true) goto L8;
        r2 = false;
        goto L9
    }

    /* JADX INFO: renamed from: copy-JKmWfYY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m5577copyJKmWfYY$default(PointerInputChange r17, long r18, long r20, long r22, boolean r24, long r25, long r27, boolean r29, int r30, long r31, int r33, Object r34) {
        if ((r33 & 1) == 0) goto L5;
        long r2 = r17.id;
    L7:
        if ((r33 & 2) == 0) goto L9;
        long r4 = r17.uptimeMillis;
    L11:
        if ((r33 & 4) == 0) goto L13;
        long r6 = r17.position;
    L15:
        if ((r33 & 8) == 0) goto L17;
        boolean r8 = r17.pressed;
    L19:
        if ((r33 & 16) == 0) goto L21;
        long r9 = r17.previousUptimeMillis;
    L23:
        if ((r33 & 32) == 0) goto L25;
        long r11 = r17.previousPosition;
    L27:
        if ((r33 & 64) == 0) goto L29;
        boolean r13 = r17.previousPressed;
    L31:
        if ((r33 & 128) == 0) goto L33;
        int r14 = r17.type;
    L35:
        if ((r33 & 256) == 0) goto L37;
        long r1 = r17.scrollDelta;
    L38:
        long r21 = r4;
        long r23 = r6;
        boolean r26 = r8;
        long r28 = r9;
        long r210 = r11;
        boolean r32 = r13;
        int r35 = r14;
        long r19 = r2;
        return r17.m5583copyJKmWfYY(r19, r21, r23, r26, r28, r210, r32, r35, r1);
    L37:
        r1 = r31;
        goto L38
    L33:
        r14 = r30;
        goto L35
    L29:
        r13 = r29;
        goto L31
    L25:
        r11 = r27;
        goto L27
    L21:
        r9 = r25;
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

    /* JADX INFO: renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m5583copyJKmWfYY(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        PointerInputChange it = m5586copywbzehF4(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, getHistorical(), scrollDelta);
        PointerInputChange r4 = this.consumedDelegate;
        if (r4 != null) goto L5;
        r4 = this;
    L5:
        it.consumedDelegate = r4;
        return it;
    }

    /* JADX INFO: renamed from: copy-0GkPj7c$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m5575copy0GkPj7c$default(PointerInputChange r18, long r19, long r21, long r23, boolean r25, long r26, long r28, boolean r30, ConsumedData r31, int r32, long r33, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        long r2 = r18.id;
    L7:
        if ((r35 & 2) == 0) goto L9;
        long r4 = r18.uptimeMillis;
    L11:
        if ((r35 & 4) == 0) goto L13;
        long r6 = r18.position;
    L15:
        if ((r35 & 8) == 0) goto L17;
        boolean r8 = r18.pressed;
    L19:
        if ((r35 & 16) == 0) goto L21;
        long r9 = r18.previousUptimeMillis;
    L23:
        if ((r35 & 32) == 0) goto L25;
        long r11 = r18.previousPosition;
    L27:
        if ((r35 & 64) == 0) goto L29;
        boolean r13 = r18.previousPressed;
    L31:
        if ((r35 & 256) == 0) goto L33;
        int r15 = r18.type;
    L35:
        if ((r35 & 512) == 0) goto L37;
        long r16 = r18.scrollDelta;
    L39:
        return r18.m5581copy0GkPj7c(r2, r4, r6, r8, r9, r11, r13, r31, r15, r16);
    L37:
        r16 = r33;
        goto L39
    L33:
        r15 = r32;
        goto L35
    L29:
        r13 = r30;
        goto L31
    L25:
        r11 = r28;
        goto L27
    L21:
        r9 = r26;
        goto L23
    L17:
        r8 = r25;
        goto L19
    L13:
        r6 = r23;
        goto L15
    L9:
        r4 = r21;
        goto L11
    L5:
        r2 = r19;
        goto L7
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @ReplaceWith(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    /* JADX INFO: renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m5581copy0GkPj7c(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, ConsumedData consumed, int type, long scrollDelta) {
        float r9 = this.pressure;
        if (consumed.getDownChange() == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        PointerInputChange it = new PointerInputChange(id, currentTime, currentPosition, currentPressed, r9, previousTime, previousPosition, previousPressed, r2, type, getHistorical(), scrollDelta, this.originalEventPosition, null);
        it.positionChange = this.positionChange;
        it.downChange = this.downChange;
        return it;
    L5:
        if (consumed.getPositionChange() == true) goto L8;
        r2 = false;
        goto L9
    }

    /* JADX INFO: renamed from: copy-Tn9QgHE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m5579copyTn9QgHE$default(PointerInputChange r18, long r19, long r21, long r23, boolean r25, float r26, long r27, long r29, boolean r31, int r32, long r33, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        long r2 = r18.id;
    L7:
        if ((r35 & 2) == 0) goto L9;
        long r4 = r18.uptimeMillis;
    L11:
        if ((r35 & 4) == 0) goto L13;
        long r6 = r18.position;
    L15:
        if ((r35 & 8) == 0) goto L17;
        boolean r8 = r18.pressed;
    L19:
        if ((r35 & 16) == 0) goto L21;
        float r9 = r18.pressure;
    L23:
        if ((r35 & 32) == 0) goto L25;
        long r10 = r18.previousUptimeMillis;
    L27:
        if ((r35 & 64) == 0) goto L29;
        long r12 = r18.previousPosition;
    L31:
        if ((r35 & 128) == 0) goto L33;
        boolean r14 = r18.previousPressed;
    L35:
        if ((r35 & 256) == 0) goto L37;
        int r15 = r18.type;
    L39:
        if ((r35 & 512) == 0) goto L41;
        long r1 = r18.scrollDelta;
    L42:
        long r22 = r4;
        long r24 = r6;
        boolean r28 = r8;
        float r210 = r9;
        long r211 = r10;
        long r30 = r12;
        boolean r34 = r14;
        int r37 = r15;
        long r20 = r2;
        return r18.m5585copyTn9QgHE(r20, r22, r24, r28, r210, r211, r30, r34, r37, r1);
    L41:
        r1 = r33;
        goto L42
    L37:
        r15 = r32;
        goto L39
    L33:
        r14 = r31;
        goto L35
    L29:
        r12 = r29;
        goto L31
    L25:
        r10 = r27;
        goto L27
    L21:
        r9 = r26;
        goto L23
    L17:
        r8 = r25;
        goto L19
    L13:
        r6 = r23;
        goto L15
    L9:
        r4 = r21;
        goto L11
    L5:
        r2 = r19;
        goto L7
    }

    /* JADX INFO: renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final PointerInputChange m5585copyTn9QgHE(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        boolean r15 = false;
        PointerInputChange it = new PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, r15, type, getHistorical(), scrollDelta, this.originalEventPosition, null);
        PointerInputChange r4 = this.consumedDelegate;
        if (r4 != null) goto L5;
        r4 = this;
    L5:
        it.consumedDelegate = r4;
        return it;
    }

    /* JADX INFO: renamed from: copy-OHpmEuE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m5578copyOHpmEuE$default(PointerInputChange r18, long r19, long r21, long r23, boolean r25, long r26, long r28, boolean r30, int r31, List r32, long r33, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        long r2 = r18.id;
    L7:
        if ((r35 & 2) == 0) goto L9;
        long r4 = r18.uptimeMillis;
    L11:
        if ((r35 & 4) == 0) goto L13;
        long r6 = r18.position;
    L15:
        if ((r35 & 8) == 0) goto L17;
        boolean r8 = r18.pressed;
    L19:
        if ((r35 & 16) == 0) goto L21;
        long r9 = r18.previousUptimeMillis;
    L23:
        if ((r35 & 32) == 0) goto L25;
        long r11 = r18.previousPosition;
    L27:
        if ((r35 & 64) == 0) goto L29;
        boolean r13 = r18.previousPressed;
    L31:
        if ((r35 & 128) == 0) goto L33;
        int r14 = r18.type;
    L35:
        if ((r35 & 512) == 0) goto L37;
        long r16 = r18.scrollDelta;
    L39:
        return r18.m5584copyOHpmEuE(r2, r4, r6, r8, r9, r11, r13, r14, r32, r16);
    L37:
        r16 = r33;
        goto L39
    L33:
        r14 = r31;
        goto L35
    L29:
        r13 = r30;
        goto L31
    L25:
        r11 = r28;
        goto L27
    L21:
        r9 = r26;
        goto L23
    L17:
        r8 = r25;
        goto L19
    L13:
        r6 = r23;
        goto L15
    L9:
        r4 = r21;
        goto L11
    L5:
        r2 = r19;
        goto L7
    }

    /* JADX INFO: renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m5584copyOHpmEuE(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> r33, long scrollDelta) {
        PointerInputChange it = m5586copywbzehF4(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, r33, scrollDelta);
        PointerInputChange r4 = this.consumedDelegate;
        if (r4 != null) goto L5;
        r4 = this;
    L5:
        it.consumedDelegate = r4;
        return it;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-wbzehF4$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m5580copywbzehF4$default(PointerInputChange r18, long r19, long r21, long r23, boolean r25, float r26, long r27, long r29, boolean r31, int r32, List r33, long r34, int r36, Object r37) {
        if ((r36 & 1) == 0) goto L5;
        long r2 = r18.id;
    L7:
        if ((r36 & 2) == 0) goto L9;
        long r4 = r18.uptimeMillis;
    L11:
        if ((r36 & 4) == 0) goto L13;
        long r6 = r18.position;
    L15:
        if ((r36 & 8) == 0) goto L17;
        boolean r8 = r18.pressed;
    L19:
        if ((r36 & 16) == 0) goto L21;
        float r9 = r18.pressure;
    L23:
        if ((r36 & 32) == 0) goto L25;
        long r10 = r18.previousUptimeMillis;
    L27:
        if ((r36 & 64) == 0) goto L29;
        long r12 = r18.previousPosition;
    L31:
        if ((r36 & 128) == 0) goto L33;
        boolean r14 = r18.previousPressed;
    L35:
        if ((r36 & 256) == 0) goto L37;
        int r15 = r18.type;
    L38:
        long r16 = r2;
        if ((r36 & 512) == 0) goto L41;
        List r3 = r18.getHistorical();
    L43:
        if ((r36 & 1024) == 0) goto L45;
        long r1 = r18.scrollDelta;
    L46:
        long r22 = r4;
        long r24 = r6;
        boolean r28 = r8;
        float r210 = r9;
        long r211 = r10;
        long r30 = r12;
        boolean r35 = r14;
        int r38 = r15;
        return r18.m5586copywbzehF4(r16, r22, r24, r28, r210, r211, r30, r35, r38, r3, r1);
    L45:
        r1 = r34;
        goto L46
    L41:
        r3 = r33;
        goto L43
    L37:
        r15 = r32;
        goto L38
    L33:
        r14 = r31;
        goto L35
    L29:
        r12 = r29;
        goto L31
    L25:
        r10 = r27;
        goto L27
    L21:
        r9 = r26;
        goto L23
    L17:
        r8 = r25;
        goto L19
    L13:
        r6 = r23;
        goto L15
    L9:
        r4 = r21;
        goto L11
    L5:
        r2 = r19;
        goto L7
    }

    /* JADX INFO: renamed from: copy-wbzehF4, reason: not valid java name */
    public final PointerInputChange m5586copywbzehF4(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> r38, long scrollDelta) {
        boolean r15 = false;
        PointerInputChange it = new PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, r15, type, r38, scrollDelta, this.originalEventPosition, null);
        PointerInputChange r4 = this.consumedDelegate;
        if (r4 != null) goto L5;
        r4 = this;
    L5:
        it.consumedDelegate = r4;
        return it;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("PointerInputChange(id=").append(PointerId.m5573toStringimpl(this.id)).append(", uptimeMillis=").append(this.uptimeMillis).append(", position=").append(Offset.m4133toStringimpl(this.position)).append(", pressed=").append(this.pressed).append(", pressure=").append(this.pressure).append(", previousUptimeMillis=").append(this.previousUptimeMillis).append(", previousPosition=").append(Offset.m4133toStringimpl(this.previousPosition)).append(", previousPressed=").append(this.previousPressed).append(", isConsumed=").append(isConsumed()).append(", type=").append(PointerType.m5662toStringimpl(this.type)).append(", historical=").append(getHistorical()).append(",scrollDelta=");
        r0.append(Offset.m4133toStringimpl(this.scrollDelta)).append(')');
        return r0.toString();
    }
}
