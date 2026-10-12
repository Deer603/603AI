package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J*\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J2\u0010\"\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/foundation/gestures/TransformableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "canPan", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "lockRotationOnZoomPan", "enabled", "(Landroidx/compose/foundation/gestures/TransformableState;Lkotlin/jvm/functions/Function1;ZZ)V", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "pointerInputModifierMouse", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "scrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "updatedCanPan", "onAttach", "", "onCancelPointerInput", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "update", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class TransformableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    private Function1<? super Offset, Boolean> canPan;
    private final Channel<TransformEvent> channel;
    private boolean enabled;
    private boolean lockRotationOnZoomPan;
    private PointerInputModifierNode pointerInputModifierMouse;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private ScrollConfig scrollConfig;
    private TransformableState state;
    private final Function1<Offset, Boolean> updatedCanPan;

    public static final /* synthetic */ Function1 access$getCanPan$p(TransformableNode $this) {
        return $this.canPan;
    }

    public static final /* synthetic */ Channel access$getChannel$p(TransformableNode $this) {
        return $this.channel;
    }

    public static final /* synthetic */ boolean access$getEnabled$p(TransformableNode $this) {
        return $this.enabled;
    }

    public static final /* synthetic */ boolean access$getLockRotationOnZoomPan$p(TransformableNode $this) {
        return $this.lockRotationOnZoomPan;
    }

    public static final /* synthetic */ TransformableState access$getState$p(TransformableNode $this) {
        return $this.state;
    }

    public static final /* synthetic */ Function1 access$getUpdatedCanPan$p(TransformableNode $this) {
        return $this.updatedCanPan;
    }

    public TransformableNode(TransformableState state, Function1<? super Offset, Boolean> r5, boolean lockRotationOnZoomPan, boolean enabled) {
        this.state = state;
        this.canPan = r5;
        this.lockRotationOnZoomPan = lockRotationOnZoomPan;
        this.enabled = enabled;
        this.updatedCanPan = new TransformableNode$updatedCanPan$1(this);
        this.channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new TransformableNode$pointerInputNode$1(this)));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.scrollConfig = AndroidScrollable_androidKt.platformScrollConfig(this);
    }

    public final void update(TransformableState state, Function1<? super Offset, Boolean> r4, boolean lockRotationOnZoomPan, boolean enabled) {
        this.canPan = r4;
        if (Intrinsics.areEqual(this.state, state) == true) goto L5;
    L10:
        boolean needsReset = true;
    L12:
        if (needsReset == false) goto L15;
        this.state = state;
        this.enabled = enabled;
        this.lockRotationOnZoomPan = lockRotationOnZoomPan;
        this.pointerInputNode.resetPointerInputHandler();
        return;
    L15:
        return;
    L5:
        if (this.enabled != enabled) goto L10;
        if (this.lockRotationOnZoomPan != lockRotationOnZoomPan) goto L10;
        needsReset = false;
        goto L12
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo204onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        final ScrollConfig scrollConfig = this.scrollConfig;
        if (this.enabled == false) goto L16;
        List<PointerInputChange> r6 = pointerEvent.getChanges();
        int $i$f$fastAny = 0;
        int index$iv$iv = 0;
        int r11 = r6.size();
    L5:
        if (index$iv$iv >= r11) goto L10;
        Object item$iv$iv = r6.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        List<PointerInputChange> r17 = r6;
        int r7 = it.m5592getTypeT8wyACA();
        int $i$f$fastAny2 = $i$f$fastAny;
        int $i$f$fastAny3 = PointerType.Companion.m5665getMouseT8wyACA();
        if (PointerType.m5660equalsimpl0(r7, $i$f$fastAny3) == true) goto L8;
        index$iv$iv = index$iv$iv + 1;
        r6 = r17;
        $i$f$fastAny = $i$f$fastAny2;
        goto L5
    L8:
        boolean r8 = true;
    L11:
        if (r8 == false) goto L16;
        if (scrollConfig == null) goto L16;
        if (this.pointerInputModifierMouse != null) goto L16;
        this.pointerInputModifierMouse = (PointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new TransformableNode$onPointerEvent$2(this, scrollConfig)));
        goto L16
    L10:
        r8 = false;
    L16:
        this.pointerInputNode.mo204onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        PointerInputModifierNode r9 = this.pointerInputModifierMouse;
        if (r9 == null) goto L22;
        r9.mo204onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        return;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
        PointerInputModifierNode r0 = this.pointerInputModifierMouse;
        if (r0 == null) goto L6;
        r0.onCancelPointerInput();
        return;
    }
}
