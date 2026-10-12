package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0012\u001a!\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0012H\u0007¢\u0006\u0002\u0010\u0014\u001aË\u0001\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2>\b\u0002\u0010\u001f\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001¢\u0006\u0002\b\n2>\b\u0002\u0010 \u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001¢\u0006\u0002\b\n2\b\b\u0002\u0010!\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\"\u001a\u001e\u0010#\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u001e\u0010#\u001a\u00020\r*\u00020&2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010%\u001a\u0016\u0010(\u001a\u00020&*\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"F\u0010\u0000\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001¢\u0006\u0002\b\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b\"F\u0010\f\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001¢\u0006\u0002\b\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"NoOpOnDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function3;", "NoOpOnDragStopped", "", "velocity", "DraggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "onDelta", "Lkotlin/Function1;", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "draggable", "Landroidx/compose/ui/Modifier;", "state", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "onDragStarted", "onDragStopped", "reverseDirection", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "toFloat", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "toValidVelocity", "toValidVelocity-TH1AsA0", "(J)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DraggableKt {
    private static final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> NoOpOnDragStarted = null;
    private static final Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> NoOpOnDragStopped = null;

    public static final /* synthetic */ Function3 access$getNoOpOnDragStarted$p() {
        return NoOpOnDragStarted;
    }

    public static final /* synthetic */ Function3 access$getNoOpOnDragStopped$p() {
        return NoOpOnDragStopped;
    }

    /* JADX INFO: renamed from: access$toFloat-3MmeM6k, reason: not valid java name */
    public static final /* synthetic */ float m448access$toFloat3MmeM6k(long $receiver, Orientation orientation) {
        return m451toFloat3MmeM6k($receiver, orientation);
    }

    /* JADX INFO: renamed from: access$toFloat-sF-c-tU, reason: not valid java name */
    public static final /* synthetic */ float m449access$toFloatsFctU(long $receiver, Orientation orientation) {
        return m452toFloatsFctU($receiver, orientation);
    }

    /* JADX INFO: renamed from: access$toValidVelocity-TH1AsA0, reason: not valid java name */
    public static final /* synthetic */ long m450access$toValidVelocityTH1AsA0(long $receiver) {
        return m453toValidVelocityTH1AsA0($receiver);
    }

    public static final DraggableState DraggableState(Function1<? super Float, Unit> r1) {
        return new DefaultDraggableState(r1);
    }

    public static final DraggableState rememberDraggableState(Function1<? super Float, Unit> r8, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -183245213, "C(rememberDraggableState)128@5770L29,129@5811L61:Draggable.kt#8bwon0");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-183245213, $changed, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:127)");
    L5:
        final State onDeltaState = SnapshotStateKt.rememberUpdatedState(r8, $composer, $changed & 14);
        ComposerKt.sourceInformationMarkerStart($composer, 1306924984, "CC(remember):Draggable.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = DraggableState(new DraggableKt$rememberDraggableState$1$1(onDeltaState));
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        DraggableState r4 = (DraggableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    }

    public static /* synthetic */ Modifier draggable$default(Modifier r9, DraggableState r10, Orientation r11, boolean r12, MutableInteractionSource r13, boolean r14, Function3 r15, Function3 r16, boolean r17, int r18, Object r19) {
        if ((r18 & 4) == 0) goto L5;
        boolean r3 = true;
    L7:
        if ((r18 & 8) == 0) goto L9;
        MutableInteractionSource r4 = null;
    L11:
        if ((r18 & 16) == 0) goto L13;
        boolean r5 = false;
    L15:
        if ((r18 & 32) == 0) goto L17;
        Function3 r6 = NoOpOnDragStarted;
    L19:
        if ((r18 & 64) == 0) goto L21;
        Function3 r7 = NoOpOnDragStopped;
    L23:
        if ((r18 & 128) == 0) goto L25;
        boolean r8 = false;
    L27:
        return draggable(r9, r10, r11, r3, r4, r5, r6, r7, r8);
    L25:
        r8 = r17;
        goto L27
    L21:
        r7 = r16;
        goto L23
    L17:
        r6 = r15;
        goto L19
    L13:
        r5 = r14;
        goto L15
    L9:
        r4 = r13;
        goto L11
    L5:
        r3 = r12;
        goto L7
    }

    public static final Modifier draggable(Modifier $this$draggable, DraggableState state, Orientation orientation, boolean enabled, MutableInteractionSource interactionSource, boolean startDragImmediately, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> r15, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> r16, boolean reverseDirection) {
        return $this$draggable.then(new DraggableElement(state, orientation, enabled, interactionSource, startDragImmediately, r15, r16, reverseDirection));
    }

    /* JADX INFO: renamed from: toFloat-3MmeM6k, reason: not valid java name */
    private static final float m451toFloat3MmeM6k(long $this$toFloat_u2d3MmeM6k, Orientation orientation) {
        if (orientation != Orientation.Vertical) goto L5;
        int bits$iv$iv$iv = (int) (4294967295L & $this$toFloat_u2d3MmeM6k);
        return Float.intBitsToFloat(bits$iv$iv$iv);
    L5:
        int bits$iv$iv$iv2 = (int) ($this$toFloat_u2d3MmeM6k >> 32);
        return Float.intBitsToFloat(bits$iv$iv$iv2);
    }

    /* JADX INFO: renamed from: toFloat-sF-c-tU, reason: not valid java name */
    private static final float m452toFloatsFctU(long $this$toFloat_u2dsF_u2dc_u2dtU, Orientation orientation) {
        if (orientation != Orientation.Vertical) goto L6;
        return Velocity.m7212getYimpl($this$toFloat_u2dsF_u2dc_u2dtU);
    L6:
        return Velocity.m7211getXimpl($this$toFloat_u2dsF_u2dc_u2dtU);
    }

    /* JADX INFO: renamed from: toValidVelocity-TH1AsA0, reason: not valid java name */
    private static final long m453toValidVelocityTH1AsA0(long $this$toValidVelocity_u2dTH1AsA0) {
        float r1 = 0.0f;
        if (Float.isNaN(Velocity.m7211getXimpl($this$toValidVelocity_u2dTH1AsA0)) == false) goto L5;
        float r0 = 0.0f;
    L7:
        if (Float.isNaN(Velocity.m7212getYimpl($this$toValidVelocity_u2dTH1AsA0)) == true) goto L11;
        r1 = Velocity.m7212getYimpl($this$toValidVelocity_u2dTH1AsA0);
    L11:
        return VelocityKt.Velocity(r0, r1);
    L5:
        r0 = Velocity.m7211getXimpl($this$toValidVelocity_u2dTH1AsA0);
        goto L7
    }

    static {
        NoOpOnDragStarted = new DraggableKt$NoOpOnDragStarted$1(null);
        NoOpOnDragStopped = new DraggableKt$NoOpOnDragStopped$1(null);
    }
}
