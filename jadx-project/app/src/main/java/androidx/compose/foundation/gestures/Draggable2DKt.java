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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Draggable2D.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001\u001a!\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001H\u0007¢\u0006\u0002\u0010\u000e\u001a\u0088\u0001\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00132#\b\u0002\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00012#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0013H\u0007\")\u0010\u0000\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\")\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"NoOpOnDragStart", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startedPosition", "", "NoOpOnDragStop", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Draggable2DState", "Landroidx/compose/foundation/gestures/Draggable2DState;", "onDelta", "rememberDraggable2DState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/Draggable2DState;", "draggable2D", "Landroidx/compose/ui/Modifier;", "state", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "onDragStarted", "onDragStopped", "reverseDirection", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Draggable2DKt {
    private static final Function1<Offset, Unit> NoOpOnDragStart = null;
    private static final Function1<Velocity, Unit> NoOpOnDragStop = null;

    public static final Draggable2DState Draggable2DState(Function1<? super Offset, Unit> r1) {
        return new DefaultDraggable2DState(r1);
    }

    public static final Draggable2DState rememberDraggable2DState(Function1<? super Offset, Unit> r8, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1150277615, "C(rememberDraggable2DState)107@4641L29,108@4682L63:Draggable2D.kt#8bwon0");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1150277615, $changed, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:106)");
    L5:
        final State onDeltaState = SnapshotStateKt.rememberUpdatedState(r8, $composer, $changed & 14);
        ComposerKt.sourceInformationMarkerStart($composer, -428502648, "CC(remember):Draggable2D.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = Draggable2DState(new Draggable2DKt$rememberDraggable2DState$1$1(onDeltaState));
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        Draggable2DState r4 = (Draggable2DState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    }

    public static /* synthetic */ Modifier draggable2D$default(Modifier r7, Draggable2DState r8, boolean r9, MutableInteractionSource r10, boolean r11, Function1 r12, Function1 r13, boolean r14, int r15, Object r16) {
        if ((r15 & 2) == 0) goto L5;
        boolean r0 = true;
    L7:
        if ((r15 & 4) == 0) goto L9;
        MutableInteractionSource r1 = null;
    L10:
        boolean r3 = false;
        if ((r15 & 8) == 0) goto L13;
        boolean r2 = false;
    L15:
        if ((r15 & 16) == 0) goto L17;
        Function1 r4 = NoOpOnDragStart;
    L19:
        if ((r15 & 32) == 0) goto L21;
        Function1 r5 = NoOpOnDragStop;
    L23:
        if ((r15 & 64) != 0) goto L27;
        r3 = r14;
    L27:
        return draggable2D(r7, r8, r0, r1, r2, r4, r5, r3);
    L21:
        r5 = r13;
        goto L23
    L17:
        r4 = r12;
        goto L19
    L13:
        r2 = r11;
        goto L15
    L9:
        r1 = r10;
        goto L10
    L5:
        r0 = r9;
        goto L7
    }

    public static final Modifier draggable2D(Modifier $this$draggable2D, Draggable2DState state, boolean enabled, MutableInteractionSource interactionSource, boolean startDragImmediately, Function1<? super Offset, Unit> r13, Function1<? super Velocity, Unit> r14, boolean reverseDirection) {
        return $this$draggable2D.then(new Draggable2DElement(state, enabled, interactionSource, startDragImmediately, r13, r14, reverseDirection));
    }

    static {
        NoOpOnDragStart = Draggable2DKt$NoOpOnDragStart$1.INSTANCE;
        NoOpOnDragStop = Draggable2DKt$NoOpOnDragStop$1.INSTANCE;
    }
}
