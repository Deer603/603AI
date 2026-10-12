package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\tH\u0016J*\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\tH\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "shareWithSiblings", "", "getShareWithSiblings", "()Z", "state", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "dispatchToView", "", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "onCancel", "onPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "reset", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    private PointerInteropFilter.DispatchToViewState state;
    final /* synthetic */ PointerInteropFilter this$0;

    PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter $receiver) {
        this.this$0 = $receiver;
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
    }

    public static final /* synthetic */ void access$setState$p(PointerInteropFilter$pointerInputFilter$1 $this, PointerInteropFilter.DispatchToViewState r1) {
        $this.state = r1;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo5612onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        List<PointerInputChange> r2 = pointerEvent.getChanges();
        boolean r4 = false;
        if (this.this$0.getDisallowIntercept$ui_release() == true) goto L20;
        int index$iv$iv = 0;
        int r10 = r2.size();
    L5:
        if (index$iv$iv >= r10) goto L16;
        Object item$iv$iv = r2.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (PointerEventKt.changedToDownIgnoreConsumed(it) == false) goto L9;
    L12:
        boolean r14 = true;
    L13:
        if (r14 == true) goto L14;
        index$iv$iv = index$iv$iv + 1;
        goto L5
    L14:
        boolean r3 = true;
    L17:
        if (r3 == true) goto L20;
        boolean dispatchDuringInitialTunnel = false;
    L22:
        if (this.state == PointerInteropFilter.DispatchToViewState.NotDispatching) goto L32;
        if (pass != PointerEventPass.Initial) goto L28;
        if (dispatchDuringInitialTunnel == false) goto L28;
        dispatchToView(pointerEvent);
    L28:
        if (pass != PointerEventPass.Final) goto L32;
        if (dispatchDuringInitialTunnel == true) goto L32;
        dispatchToView(pointerEvent);
    L32:
        if (pass != PointerEventPass.Final) goto L47;
        int index$iv$iv2 = 0;
        int r11 = r2.size();
    L34:
        if (index$iv$iv2 >= r11) goto L39;
        Object item$iv$iv2 = r2.get(index$iv$iv2);
        if (PointerEventKt.changedToUpIgnoreConsumed((PointerInputChange) item$iv$iv2) == false) goto L40;
        index$iv$iv2 = index$iv$iv2 + 1;
    L40:
        if (r4 == false) goto L48;
        reset();
        return;
    L48:
        return;
    L39:
        r4 = true;
        goto L40
    L47:
        return;
    L9:
        if (PointerEventKt.changedToUpIgnoreConsumed(it) == true) goto L12;
        r14 = false;
        goto L13
    L16:
        r3 = false;
    L20:
        dispatchDuringInitialTunnel = true;
        goto L22
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state != PointerInteropFilter.DispatchToViewState.Dispatching) goto L6;
        long r0 = SystemClock.uptimeMillis();
        final PointerInteropFilter r3 = this.this$0;
        PointerInteropUtils_androidKt.emptyCancelMotionEventScope(r0, new PointerInteropFilter$pointerInputFilter$1$onCancel$1(r3));
        reset();
        return;
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
    }

    private final void dispatchToView(PointerEvent pointerEvent) {
        List<PointerInputChange> r0 = pointerEvent.getChanges();
        int index$iv$iv = 0;
        int r6 = r0.size();
    L4:
        if (index$iv$iv >= r6) goto L9;
        Object item$iv$iv = r0.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (it.isConsumed() == true) goto L7;
        index$iv$iv = index$iv$iv + 1;
        goto L4
    L7:
        boolean r3 = true;
    L11:
        if (r3 == true) goto L13;
        LayoutCoordinates r2 = getLayoutCoordinates$ui_release();
        if (r2 == null) goto L33;
        long r1 = r2.mo5725localToRootMKHz9U(Offset.Companion.m4141getZeroF1C5BW0());
        final PointerInteropFilter r4 = this.this$0;
        PointerInteropUtils_androidKt.m5648toMotionEventScoped4ec7I(pointerEvent, r1, new PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(this, r4));
        if (this.state != PointerInteropFilter.DispatchToViewState.Dispatching) goto L38;
        int index$iv = 0;
        int r5 = r0.size();
    L25:
        if (index$iv >= r5) goto L27;
        Object item$iv = r0.get(index$iv);
        PointerInputChange it2 = (PointerInputChange) item$iv;
        it2.consume();
        index$iv = index$iv + 1;
        goto L25
    L27:
        InternalPointerEvent r7 = pointerEvent.getInternalPointerEvent$ui_release();
        if (r7 == null) goto L39;
        r7.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept$ui_release());
        return;
    L39:
        return;
    L38:
        return;
    L33:
        throw new IllegalStateException("layoutCoordinates not set".toString());
    L13:
        if (this.state != PointerInteropFilter.DispatchToViewState.Dispatching) goto L19;
        LayoutCoordinates r8 = getLayoutCoordinates$ui_release();
        if (r8 == null) goto L18;
        long r9 = r8.mo5725localToRootMKHz9U(Offset.Companion.m4141getZeroF1C5BW0());
        final PointerInteropFilter r10 = this.this$0;
        PointerInteropUtils_androidKt.m5647toCancelMotionEventScoped4ec7I(pointerEvent, r9, new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(r10));
        goto L19
    L18:
        throw new IllegalStateException("layoutCoordinates not set".toString());
    L19:
        this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
        return;
    L9:
        r3 = false;
        goto L11
    }
}
