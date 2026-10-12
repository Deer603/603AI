package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {971, 993}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", NotificationCompat.CATEGORY_EVENT, "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> $currentDown;
    final /* synthetic */ Ref.BooleanRef $deepPress;
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref.BooleanRef r2, Ref.ObjectRef<PointerInputChange> r3, Ref.ObjectRef<PointerInputChange> r4, Continuation<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> r5) {
        this.$deepPress = r2;
        this.$currentDown = r3;
        this.$longPress = r4;
        super(2, r5);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 r0 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$deepPress, this.$currentDown, this.$longPress, r6);
        r0.L$0 = r5;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [T, androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Type inference failed for: r5v16, types: [T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x010c -> B:47:0x0110). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r25) {
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object $result = null;
        int r5 = 1;
        switch(this.label) {
            case 0: goto L8;
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        Object $result2 = r25;
        int r6 = this.I$0;
        PointerEvent event = (PointerEvent) this.L$1;
        AwaitPointerEventScope $this$withTimeout = (AwaitPointerEventScope) this.L$0;
        ResultKt.throwOnFailure($result2);
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 r9 = this;
        Object $result3 = $result2;
        int r4 = 1;
    L47:
        PointerEvent consumeCheck = (PointerEvent) $result2;
        List<PointerInputChange> r2 = consumeCheck.getChanges();
        int index$iv$iv = 0;
        int r12 = r2.size();
    L48:
        if (index$iv$iv >= r12) goto L53;
        Object item$iv$iv = r2.get(index$iv$iv);
        if (((PointerInputChange) item$iv$iv).isConsumed() == true) goto L51;
        index$iv$iv = index$iv$iv + 1;
        goto L48
    L51:
        int r3 = r4;
    L54:
        if (r3 == 0) goto L57;
        r6 = 1;
    L57:
        if (DragGestureDetectorKt.m416access$isPointerUpDmW0f2w(event, r9.$currentDown.element.m5587getIdJ3iCeTQ()) == false) goto L69;
        List<PointerInputChange> r7 = event.getChanges();
        int index$iv$iv2 = 0;
        int r11 = r7.size();
    L59:
        if (index$iv$iv2 >= r11) goto L64;
        Object item$iv$iv2 = r7.get(index$iv$iv2);
        Object it$iv = item$iv$iv2;
        if (((PointerInputChange) it$iv).getPressed() == true) goto L65;
        index$iv$iv2 = index$iv$iv2 + 1;
    L65:
        ?? r8 = (PointerInputChange) it$iv;
        if (r8 == 0) goto L68;
        r9.$currentDown.element = r8;
        r9.$longPress.element = r9.$currentDown.element;
        Object r22 = r1;
    L77:
        Object $result4 = $result3;
        AwaitPointerEventScope $this$withTimeout2 = $this$withTimeout;
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 r10 = r9;
        r1 = r22;
        $result = null;
        r5 = 1;
    L9:
        if (r6 != 0) goto L79;
        r10.L$0 = $this$withTimeout2;
        r10.L$1 = $result;
        r10.I$0 = r6;
        r10.label = r5;
        Object r13 = $this$withTimeout2.awaitPointerEvent(PointerEventPass.Main, r10);
        if (r13 != r1) goto L13;
        return r1;
    L13:
        int r23 = r6;
        Object $result5 = $result4;
        Object $result6 = r13;
        r9 = r10;
        $this$withTimeout = $this$withTimeout2;
        int r14 = r23;
    L14:
        PointerEvent event2 = (PointerEvent) $result6;
        List<PointerInputChange> r15 = event2.getChanges();
        int index$iv$iv3 = 0;
        int r16 = r15.size();
    L15:
        if (index$iv$iv3 >= r16) goto L20;
        Object item$iv$iv3 = r15.get(index$iv$iv3);
        if (PointerEventKt.changedToUpIgnoreConsumed((PointerInputChange) item$iv$iv3) == false) goto L18;
        index$iv$iv3 = index$iv$iv3 + 1;
        goto L15
    L18:
        int r17 = 0;
    L21:
        if (r17 == 0) goto L23;
        r14 = 1;
    L23:
        List<PointerInputChange> r18 = event2.getChanges();
        int index$iv$iv4 = 0;
        int r19 = r18.size();
    L24:
        if (index$iv$iv4 >= r19) goto L36;
        Object it$iv2 = r18.get(index$iv$iv4);
        PointerInputChange it = (PointerInputChange) it$iv2;
        if (it.isConsumed() == true) goto L31;
        Object $result7 = $result5;
        if (PointerEventKt.m5534isOutOfBoundsjwHxaWs(it, $this$withTimeout.mo5498getSizeYbymL2g(), $this$withTimeout.mo5497getExtendedTouchPaddingNHjbRc()) == true) goto L32;
        boolean r20 = false;
    L33:
        if (r20 == true) goto L34;
        index$iv$iv4 = index$iv$iv4 + 1;
        $result5 = $result7;
        goto L24
    L34:
        boolean r21 = true;
    L37:
        if (r21 == false) goto L40;
        r14 = 1;
    L40:
        if (TapGestureDetector_androidKt.isDeepPress(event2) == false) goto L42;
        r4 = 1;
        r9.$deepPress.element = true;
        r6 = 1;
    L43:
        r9.L$0 = $this$withTimeout;
        r9.L$1 = event2;
        r9.I$0 = r6;
        r9.label = 2;
        Object r24 = $this$withTimeout.awaitPointerEvent(PointerEventPass.Final, r9);
        if (r24 != r1) goto L46;
        return r1;
    L46:
        event = event2;
        $result2 = r24;
        $result3 = $result7;
        goto L47
    L42:
        r4 = 1;
        r6 = r14;
    L32:
        r20 = true;
        goto L33
    L31:
        $result7 = $result5;
        goto L32
    L36:
        $result7 = $result5;
        r21 = false;
        goto L37
    L20:
        r17 = r5;
        goto L21
    L79:
        return Unit.INSTANCE;
    L68:
        r6 = 1;
        $result4 = $result3;
        r5 = r4;
        $this$withTimeout2 = $this$withTimeout;
        r10 = r9;
        $result = null;
        goto L9
    L64:
        it$iv = null;
        goto L65
    L69:
        Ref.ObjectRef<PointerInputChange> r26 = r9.$longPress;
        List<PointerInputChange> r27 = event.getChanges();
        Ref.ObjectRef<PointerInputChange> r110 = r9.$currentDown;
        int index$iv$iv5 = 0;
        int r111 = r27.size();
    L70:
        if (index$iv$iv5 >= r111) goto L75;
        Object item$iv$iv4 = r27.get(index$iv$iv5);
        T r112 = item$iv$iv4;
        List<PointerInputChange> r28 = r27;
        r22 = r1;
        if (PointerId.m5571equalsimpl0(((PointerInputChange) r112).m5587getIdJ3iCeTQ(), r110.element.m5587getIdJ3iCeTQ()) == true) goto L76;
        index$iv$iv5 = index$iv$iv5 + 1;
        r27 = r28;
        r1 = r22;
    L76:
        r26.element = r112;
        goto L77
    L75:
        r22 = r1;
        r112 = 0;
        goto L76
    L53:
        r3 = 0;
        goto L54
    L7:
        $result6 = r25;
        int r29 = this.I$0;
        AwaitPointerEventScope $this$withTimeout3 = (AwaitPointerEventScope) this.L$0;
        ResultKt.throwOnFailure($result6);
        r9 = this;
        $this$withTimeout = $this$withTimeout3;
        r14 = r29;
        $result5 = $result6;
        goto L14
    L8:
        ResultKt.throwOnFailure(r25);
        $result4 = r25;
        AwaitPointerEventScope $this$withTimeout4 = (AwaitPointerEventScope) this.L$0;
        $this$withTimeout2 = $this$withTimeout4;
        r6 = 0;
        r10 = this;
        goto L9
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
