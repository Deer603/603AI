package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "", "()V", "previousPointerInputData", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "clear", "", "produce", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "pointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "PointerInputData", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class PointerInputChangeEventProducer {
    private final LongSparseArray<PointerInputData> previousPointerInputData;

    /* JADX INFO: compiled from: PointerInputEventProcessor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "", "uptime", "", "positionOnScreen", "Landroidx/compose/ui/geometry/Offset;", "down", "", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDown", "()Z", "getPositionOnScreen-F1C5BW0", "()J", "J", "getUptime", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final long uptime;

        public /* synthetic */ PointerInputData(long r1, long r3, boolean r5, DefaultConstructorMarker r6) {
            this(r1, r3, r5);
        }

        private PointerInputData(long uptime, long positionOnScreen, boolean down) {
            this.uptime = uptime;
            this.positionOnScreen = positionOnScreen;
            this.down = down;
        }

        public final long getUptime() {
            return this.uptime;
        }

        /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
        public final long m5594getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        public final boolean getDown() {
            return this.down;
        }
    }

    public PointerInputChangeEventProducer() {
        this.previousPointerInputData = new LongSparseArray(0, 1, null);
    }

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        LongSparseArray changes = new LongSparseArray(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> r2 = pointerInputEvent.getPointers();
        int $i$f$fastForEach = 0;
        int index$iv = 0;
        int r5 = r2.size();
    L3:
        if (index$iv >= r5) goto L14;
        Object item$iv = r2.get(index$iv);
        PointerInputEventData it = (PointerInputEventData) item$iv;
        List<PointerInputEventData> r15 = r2;
        int $i$f$fastForEach2 = $i$f$fastForEach;
        PointerInputData previousData = this.previousPointerInputData.get(it.m5603getIdJ3iCeTQ());
        if (previousData != null) goto L7;
        long previousTime = it.getUptime();
        long previousPosition = it.m5605getPositionF1C5BW0();
        boolean previousDown = false;
        long previousTime2 = previousTime;
        long previousPosition2 = previousPosition;
    L8:
        changes.put(it.m5603getIdJ3iCeTQ(), new PointerInputChange(it.m5603getIdJ3iCeTQ(), it.getUptime(), it.m5605getPositionF1C5BW0(), it.getDown(), it.getPressure(), previousTime2, previousPosition2, previousDown, false, it.m5608getTypeT8wyACA(), it.getHistorical(), it.m5607getScrollDeltaF1C5BW0(), it.m5604getOriginalEventPositionF1C5BW0(), null));
        boolean r3 = it.getDown();
        LongSparseArray<PointerInputData> r9 = this.previousPointerInputData;
        if (r3 == false) goto L11;
        r9.put(it.m5603getIdJ3iCeTQ(), new PointerInputData(it.getUptime(), it.m5606getPositionOnScreenF1C5BW0(), it.getDown(), null));
    L12:
        index$iv = index$iv + 1;
        r2 = r15;
        $i$f$fastForEach = $i$f$fastForEach2;
        goto L3
    L11:
        r9.remove(it.m5603getIdJ3iCeTQ());
        goto L12
    L7:
        long previousTime3 = previousData.getUptime();
        boolean previousDown2 = previousData.getDown();
        long previousPosition3 = positionCalculator.mo5670screenToLocalMKHz9U(previousData.m5594getPositionOnScreenF1C5BW0());
        previousDown = previousDown2;
        previousTime2 = previousTime3;
        previousPosition2 = previousPosition3;
        goto L8
    L14:
        return new InternalPointerEvent(changes, pointerInputEvent);
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }
}
