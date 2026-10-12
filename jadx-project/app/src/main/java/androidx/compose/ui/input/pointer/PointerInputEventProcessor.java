package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J-\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "hitPathTracker", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitResult", "Landroidx/compose/ui/node/HitTestResult;", "isProcessing", "", "pointerInputChangeEventProducer", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "clearPreviouslyHitModifierNodes", "", "process", "Landroidx/compose/ui/input/pointer/ProcessResult;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "isInBounds", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "processCancel", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerInputEventProcessor {
    public static final int $stable = 0;
    private final HitPathTracker hitPathTracker;
    private final HitTestResult hitResult;
    private boolean isProcessing;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer;
    private final LayoutNode root;

    static {
        $stable = 8;
    }

    public PointerInputEventProcessor(LayoutNode root) {
        this.root = root;
        this.hitPathTracker = new HitPathTracker(this.root.getCoordinates());
        this.pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
        this.hitResult = new HitTestResult();
    }

    public final LayoutNode getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m5609processBIzXfog$default(PointerInputEventProcessor r0, PointerInputEvent r1, PositionCalculator r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = true;
    L6:
        return r0.m5610processBIzXfog(r1, r2, r3);
    }

    /* JADX INFO: renamed from: process-BIzXfog, reason: not valid java name */
    public final int m5610processBIzXfog(PointerInputEvent pointerEvent, PositionCalculator positionCalculator, boolean isInBounds) {
        if (this.isProcessing == false) goto L58;
        return PointerInputEventProcessorKt.ProcessResult(false, false);
    L58:
        this.isProcessing = true;     // Catch: Throwable -> L49
        InternalPointerEvent internalPointerEvent = this.pointerInputChangeEventProducer.produce(pointerEvent, positionCalculator);     // Catch: Throwable -> L47
        boolean isHover = true;
        int i = 0;
        int r7 = internalPointerEvent.getChanges().size();     // Catch: Throwable -> L47
    L10:
        if (i >= r7) goto L18;
        PointerInputChange pointerInputChange = internalPointerEvent.getChanges().valueAt(i);     // Catch: Throwable -> L47
        if (pointerInputChange.getPressed() == true) goto L17;
        if (pointerInputChange.getPreviousPressed() == true) goto L17;
        i = i + 1;     // Catch: Throwable -> L47
    L17:
        isHover = false;
    L18:
        int i2 = 0;
        int r8 = internalPointerEvent.getChanges().size();     // Catch: Throwable -> L47
    L19:
        if (i2 >= r8) goto L28;
        PointerInputChange pointerInputChange2 = internalPointerEvent.getChanges().valueAt(i2);     // Catch: Throwable -> L47
        if (isHover == false) goto L23;
    L24:
        LayoutNode.m5884hitTest6fMxITs$ui_release$default(this.root, pointerInputChange2.m5589getPositionF1C5BW0(), this.hitResult, pointerInputChange2.m5592getTypeT8wyACA(), false, 8, null);     // Catch: Throwable -> L47
        if (this.hitResult.isEmpty() == true) goto L27;
        this.hitPathTracker.m5515addHitPathQJqDSyo(pointerInputChange2.m5587getIdJ3iCeTQ(), this.hitResult, PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2));     // Catch: Throwable -> L47
        this.hitResult.clear();     // Catch: Throwable -> L47
    L27:
        i2 = i2 + 1;     // Catch: Throwable -> L47
        goto L19
    L23:
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2) == false) goto L27;
    L28:
        boolean dispatchedToSomething = this.hitPathTracker.dispatchChanges(internalPointerEvent, isInBounds);     // Catch: Throwable -> L45
        if (internalPointerEvent.getSuppressMovementConsumption() == false) goto L33;
        boolean result = false;
    L42:
        int r9 = PointerInputEventProcessorKt.ProcessResult(dispatchedToSomething, result);     // Catch: Throwable -> L45
        this.isProcessing = false;
        return r9;
    L33:
        result = false;
        int i3 = 0;
        int r10 = internalPointerEvent.getChanges().size();     // Catch: Throwable -> L45
    L34:
        if (i3 >= r10) goto L42;
        PointerInputChange event = internalPointerEvent.getChanges().valueAt(i3);     // Catch: Throwable -> L45
        if (PointerEventKt.positionChangedIgnoreConsumed(event) == false) goto L40;
        if (event.isConsumed() == false) goto L40;
        result = true;
    L40:
        i3 = i3 + 1;     // Catch: Throwable -> L45
    L45:
        th = th;
    L52:
        this.isProcessing = false;
        throw th;
    L47:
        th = th;
    L49:
        th = th;
        goto L52
    }

    public final void processCancel() {
        if (this.isProcessing == true) goto L6;
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
        return;
    }

    public final void clearPreviouslyHitModifierNodes() {
        this.hitPathTracker.clearPreviouslyHitModifierNodeCache();
    }
}
