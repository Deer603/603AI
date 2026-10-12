package androidx.compose.material3.internal;

import androidx.autofill.HintConstants;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: DragGestureDetectorCopy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f26\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018H\u0082Hø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\u00020\u0005*\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "change", "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "getDragDirectionValue", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPointerUp", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop = 0.0f;
    private static final float mouseSlop = 0.0f;
    private static final float mouseToTouchSlopRatio = 0.0f;

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x014e -> B:18:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0199 -> B:51:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01c9 -> B:18:0x009b). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    public static final Object m3019awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope r22, long pointerId, int pointerType, Function2<? super PointerInputChange, ? super Float, Unit> r26, Continuation<? super PointerInputChange> r27) {
        if ((r27 instanceof DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) == false) goto L7;
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 r1 = (DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) r27;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        PointerEventPass r4 = null;
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        float totalPositionChange$iv = r1.F$1;
        float touchSlop$iv = r1.F$0;
        PointerInputChange dragEvent$iv = (PointerInputChange) r1.L$3;
        Ref.LongRef pointer$iv = (Ref.LongRef) r1.L$2;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv = (AwaitPointerEventScope) r1.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> r10 = (Function2) r1.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv2 = $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv;
        float touchSlop$iv2 = totalPositionChange$iv;
        Function2<? super PointerInputChange, ? super Float, Unit> r5 = r10;
        Ref.LongRef pointer$iv2 = pointer$iv;
        float touchSlop$iv3 = touchSlop$iv;
    L52:
        if (dragEvent$iv.isConsumed() == false) goto L54;
        return null;
    L54:
        r4 = null;
    L18:
        r1.L$0 = r5;
        r1.L$1 = $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv2;
        r1.L$2 = pointer$iv2;
        r1.L$3 = r4;
        r1.F$0 = touchSlop$iv3;
        r1.F$1 = touchSlop$iv2;
        r1.label = 1;
        Object r7 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv2, r4, r1, 1, r4);
        if (r7 != r2) goto L21;
        return r2;
    L21:
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 r21 = r1;
        Object $result2 = $result;
        $result = r7;
        float touchSlop$iv4 = touchSlop$iv3;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv3 = $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv2;
        Object r3 = r2;
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 r6 = r21;
    L22:
        PointerEvent event$iv = (PointerEvent) $result;
        List<PointerInputChange> r11 = event$iv.getChanges();
        int index$iv$iv$iv = 0;
        int r15 = r11.size();
    L23:
        if (index$iv$iv$iv >= r15) goto L28;
        Object item$iv$iv$iv = r11.get(index$iv$iv$iv);
        Object it$iv$iv = item$iv$iv$iv;
        PointerInputChange it$iv = (PointerInputChange) it$iv$iv;
        Function2<? super PointerInputChange, ? super Float, Unit> r23 = r5;
        PointerEvent event$iv2 = event$iv;
        Object $result3 = $result2;
        if (PointerId.m5571equalsimpl0(it$iv.m5587getIdJ3iCeTQ(), pointer$iv2.element) == true) goto L29;
        index$iv$iv$iv = index$iv$iv$iv + 1;
        r5 = r23;
        $result2 = $result3;
        event$iv = event$iv2;
    L29:
        Intrinsics.checkNotNull(it$iv$iv);
        PointerInputChange dragEvent$iv2 = (PointerInputChange) it$iv$iv;
        if (dragEvent$iv2.isConsumed() == false) goto L33;
        return null;
    L33:
        if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent$iv2) == false) goto L45;
        List<PointerInputChange> r0 = event$iv2.getChanges();
        int index$iv$iv$iv2 = 0;
        int r12 = r0.size();
    L35:
        if (index$iv$iv$iv2 >= r12) goto L40;
        Object item$iv$iv$iv2 = r0.get(index$iv$iv$iv2);
        Object it$iv$iv2 = item$iv$iv$iv2;
        PointerInputChange it$iv2 = (PointerInputChange) it$iv$iv2;
        if (it$iv2.getPressed() == true) goto L41;
        index$iv$iv$iv2 = index$iv$iv$iv2 + 1;
    L41:
        PointerInputChange otherDown$iv = (PointerInputChange) it$iv$iv2;
        if (otherDown$iv == null) goto L65;
        pointer$iv2.element = otherDown$iv.m5587getIdJ3iCeTQ();
        r5 = r23;
        $result = $result3;
        r1 = r6;
        r2 = r3;
        $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv2 = $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv3;
        r4 = null;
        touchSlop$iv3 = touchSlop$iv4;
        goto L18
    L65:
        return null;
    L40:
        it$iv$iv2 = null;
        goto L41
    L45:
        long it = dragEvent$iv2.m5589getPositionF1C5BW0();
        long it2 = dragEvent$iv2.m5590getPreviousPositionF1C5BW0();
        float positionChange$iv = Offset.m4125getXimpl(it) - Offset.m4125getXimpl(it2);
        float totalPositionChange$iv2 = touchSlop$iv2 + positionChange$iv;
        float inDirection$iv = Math.abs(totalPositionChange$iv2);
        if (inDirection$iv >= touchSlop$iv4) goto L55;
        PointerEventPass r8 = PointerEventPass.Final;
        Function2<? super PointerInputChange, ? super Float, Unit> r9 = r23;
        r6.L$0 = r9;
        r6.L$1 = $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv3;
        r6.L$2 = pointer$iv2;
        r6.L$3 = dragEvent$iv2;
        r6.F$0 = touchSlop$iv4;
        r6.F$1 = totalPositionChange$iv2;
        r6.label = 2;
        if ($this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv3.awaitPointerEvent(r8, r6) != r3) goto L50;
        return r3;
    L50:
        r1 = r6;
        r2 = r3;
        touchSlop$iv2 = totalPositionChange$iv2;
        $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv2 = $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv3;
        r5 = r9;
        touchSlop$iv3 = touchSlop$iv4;
        dragEvent$iv = dragEvent$iv2;
        $result = $result3;
        goto L52
    L55:
        Function2<? super PointerInputChange, ? super Float, Unit> r13 = r23;
        r13.invoke(dragEvent$iv2, Boxing.boxFloat(totalPositionChange$iv2 - (Math.signum(totalPositionChange$iv2) * touchSlop$iv4)));
        if (dragEvent$iv2.isConsumed() == true) goto L58;
        touchSlop$iv2 = 0.0f;
        $result = $result3;
        r1 = r6;
        r2 = r3;
        r5 = r13;
        $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv2 = $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv3;
        r4 = null;
        touchSlop$iv3 = touchSlop$iv4;
        goto L18
    L58:
        return dragEvent$iv2;
    L28:
        event$iv2 = event$iv;
        $result3 = $result2;
        r23 = r5;
        it$iv$iv = null;
        goto L29
    L13:
        float totalPositionChange$iv3 = r1.F$1;
        float touchSlop$iv5 = r1.F$0;
        Ref.LongRef pointer$iv3 = (Ref.LongRef) r1.L$2;
        $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv3 = (AwaitPointerEventScope) r1.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> r14 = (Function2) r1.L$0;
        ResultKt.throwOnFailure($result);
        pointer$iv2 = pointer$iv3;
        touchSlop$iv4 = touchSlop$iv5;
        touchSlop$iv2 = totalPositionChange$iv3;
        r5 = r14;
        r3 = r2;
        r6 = r1;
        $result2 = $result;
        goto L22
    L14:
        ResultKt.throwOnFailure($result);
        $this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv2 = r22;
        r5 = r26;
        if (m3021isPointerUpDmW0f2w($this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv2.getCurrentEvent(), pointerId) == true) goto L67;
        touchSlop$iv3 = m3022pointerSlopE8SPZFQ($this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv2.getViewConfiguration(), pointerType);
        pointer$iv2 = new Ref.LongRef();
        pointer$iv2.element = pointerId;
        touchSlop$iv2 = 0.0f;
        goto L18
    L67:
        return null;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(r27);
        goto L8
    }

    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m3020awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2dpn7EDYM, long pointerId, int pointerType, Function2<? super PointerInputChange, ? super Float, Unit> r29, Function1<? super Offset, Float> r30, Continuation<? super PointerInputChange> r31) {
        int r5 = 0;
        PointerEventPass r7 = null;
        if (m3021isPointerUpDmW0f2w($this$awaitPointerSlopOrCancellation_u2dpn7EDYM.getCurrentEvent(), pointerId) == false) goto L5;
        return null;
    L5:
        float touchSlop = m3022pointerSlopE8SPZFQ($this$awaitPointerSlopOrCancellation_u2dpn7EDYM.getViewConfiguration(), pointerType);
        Ref.LongRef pointer = new Ref.LongRef();
        pointer.element = pointerId;
        float totalPositionChange = 0.0f;
    L6:
        PointerEvent event = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default($this$awaitPointerSlopOrCancellation_u2dpn7EDYM, r7, r31, 1, r7);
        List<PointerInputChange> r12 = event.getChanges();
        PointerEventPass r17 = r7;
        int r8 = r12.size();
        int index$iv$iv = 0;
    L7:
        if (index$iv$iv >= r8) goto L12;
        Object item$iv$iv = r12.get(index$iv$iv);
        Object it$iv = item$iv$iv;
        PointerInputChange it = (PointerInputChange) it$iv;
        int index$iv$iv2 = index$iv$iv;
        int r23 = r5;
        float touchSlop2 = touchSlop;
        if (Boolean.valueOf(PointerId.m5571equalsimpl0(it.m5587getIdJ3iCeTQ(), pointer.element)).booleanValue() == true) goto L13;
        index$iv$iv = index$iv$iv2 + 1;
        r5 = r23;
        touchSlop = touchSlop2;
    L13:
        Intrinsics.checkNotNull(it$iv);
        PointerInputChange dragEvent = (PointerInputChange) it$iv;
        if (dragEvent.isConsumed() == true) goto L15;
        if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent) == false) goto L29;
        List<PointerInputChange> r2 = event.getChanges();
        int index$iv$iv3 = 0;
        int r13 = r2.size();
    L19:
        if (index$iv$iv3 >= r13) goto L24;
        Object item$iv$iv2 = r2.get(index$iv$iv3);
        Object it$iv2 = item$iv$iv2;
        PointerInputChange it2 = (PointerInputChange) it$iv2;
        if (Boolean.valueOf(it2.getPressed()).booleanValue() == true) goto L25;
        index$iv$iv3 = index$iv$iv3 + 1;
    L25:
        PointerInputChange otherDown = (PointerInputChange) it$iv2;
        if (otherDown == null) goto L27;
        pointer.element = otherDown.m5587getIdJ3iCeTQ();
    L39:
        r7 = r17;
        r5 = r23;
        touchSlop = touchSlop2;
        goto L6
    L27:
        return r17;
    L24:
        it$iv2 = r17;
        goto L25
    L29:
        long currentPosition = dragEvent.m5589getPositionF1C5BW0();
        long previousPosition = dragEvent.m5590getPreviousPositionF1C5BW0();
        float positionChange = r30.invoke(Offset.m4114boximpl(currentPosition)).floatValue() - r30.invoke(Offset.m4114boximpl(previousPosition)).floatValue();
        totalPositionChange = totalPositionChange + positionChange;
        float inDirection = Math.abs(totalPositionChange);
        if (inDirection >= touchSlop2) goto L35;
        $this$awaitPointerSlopOrCancellation_u2dpn7EDYM.awaitPointerEvent(PointerEventPass.Final, r31);
        if (dragEvent.isConsumed() == false) goto L39;
        return r17;
    L35:
        r29.invoke(dragEvent, Float.valueOf(totalPositionChange - (Math.signum(totalPositionChange) * touchSlop2)));
        if (dragEvent.isConsumed() == true) goto L37;
        totalPositionChange = 0.0f;
        goto L39
    L37:
        return dragEvent;
    L15:
        return r17;
    L12:
        r23 = r5;
        touchSlop2 = touchSlop;
        it$iv = r17;
        goto L13
    }

    /* JADX INFO: renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m3021isPointerUpDmW0f2w(PointerEvent $this$isPointerUp_u2dDmW0f2w, long pointerId) {
        List<PointerInputChange> r0 = $this$isPointerUp_u2dDmW0f2w.getChanges();
        int index$iv$iv = 0;
        int r5 = r0.size();
    L3:
        if (index$iv$iv >= r5) goto L8;
        Object item$iv$iv = r0.get(index$iv$iv);
        Object it$iv = item$iv$iv;
        PointerInputChange it = (PointerInputChange) it$iv;
        if (PointerId.m5571equalsimpl0(it.m5587getIdJ3iCeTQ(), pointerId) == true) goto L9;
        index$iv$iv = index$iv$iv + 1;
    L9:
        PointerInputChange r7 = (PointerInputChange) it$iv;
        boolean r1 = false;
        if (r7 == null) goto L15;
        if (r7.getPressed() != true) goto L15;
        r1 = true;
    L15:
        return !r1;
    L8:
        it$iv = null;
        goto L9
    }

    static {
        mouseSlop = Dp.m6973constructorimpl((float) 0.125d);
        defaultTouchSlop = Dp.m6973constructorimpl(18);
        float arg0$iv = mouseSlop;
        float other$iv = defaultTouchSlop;
        mouseToTouchSlopRatio = arg0$iv / other$iv;
    }

    /* JADX INFO: renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m3022pointerSlopE8SPZFQ(ViewConfiguration $this$pointerSlop_u2dE8SPZFQ, int pointerType) {
        if (PointerType.m5660equalsimpl0(pointerType, PointerType.Companion.m5665getMouseT8wyACA()) == false) goto L6;
        return $this$pointerSlop_u2dE8SPZFQ.getTouchSlop() * mouseToTouchSlopRatio;
    L6:
        return $this$pointerSlop_u2dE8SPZFQ.getTouchSlop();
    }
}
