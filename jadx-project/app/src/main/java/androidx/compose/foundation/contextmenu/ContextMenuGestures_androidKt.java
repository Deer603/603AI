package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: ContextMenuGestures.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082@¢\u0006\u0002\u0010\u0003\u001a \u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a&\u0010\f\u001a\u00020\t*\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0081@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"awaitFirstRightClickDown", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contextMenuGestures", "Landroidx/compose/ui/Modifier;", "onOpenGesture", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "state", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "onRightClickDown", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDown", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContextMenuGestures_androidKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1, reason: invalid class name */
    /* JADX INFO: compiled from: ContextMenuGestures.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", f = "ContextMenuGestures.android.kt", i = {0}, l = {71}, m = "awaitFirstRightClickDown", n = {"$this$awaitFirstRightClickDown"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ContextMenuGestures_androidKt.access$awaitFirstRightClickDown(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContextMenuGestures.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", f = "ContextMenuGestures.android.kt", i = {0}, l = {58, LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    static final class C02232 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onDown;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C02232(Function1<? super Offset, Unit> r2, Continuation<? super C02232> r3) {
            this.$onDown = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C02232 r0 = new C02232(this.$onDown, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((C02232) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L15:
            PointerInputChange r9 = (PointerInputChange) $result;
            if (r9 == null) goto L19;
            r9.consume();
        L19:
            return Unit.INSTANCE;
        L7:
            AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);
            AwaitPointerEventScope $this$awaitEachGesture2 = $this$awaitEachGesture;
        L12:
            PointerInputChange down = (PointerInputChange) $result;
            down.consume();
            this.$onDown.invoke(Offset.m4114boximpl(down.m5589getPositionF1C5BW0()));
            this.L$0 = null;
            this.label = 2;
            $result = TapGestureDetectorKt.waitForUpOrCancellation$default($this$awaitEachGesture2, null, this, 1, null);
            if ($result != r0) goto L15;
            return r0;
        L8:
            ResultKt.throwOnFailure($result);
            AwaitPointerEventScope $this$awaitEachGesture3 = (AwaitPointerEventScope) this.L$0;
            this.L$0 = $this$awaitEachGesture3;
            this.label = 1;
            Object r3 = ContextMenuGestures_androidKt.access$awaitFirstRightClickDown($this$awaitEachGesture3, this);
            if (r3 != r0) goto L11;
            return r0;
        L11:
            $result = r3;
            $this$awaitEachGesture2 = $this$awaitEachGesture3;
            goto L12
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ Object access$awaitFirstRightClickDown(AwaitPointerEventScope $receiver, Continuation $completion) {
        return awaitFirstRightClickDown($receiver, $completion);
    }

    public static final Modifier contextMenuGestures(Modifier $this$contextMenuGestures, final ContextMenuState state) {
        return contextMenuGestures($this$contextMenuGestures, new C02221(state));
    }

    public static final Modifier contextMenuGestures(Modifier $this$contextMenuGestures, final Function1<? super Offset, Unit> r3) {
        return SuspendingPointerInputFilterKt.pointerInput($this$contextMenuGestures, ContextMenuKey.INSTANCE, new AnonymousClass2(r3));
    }

    public static final Object onRightClickDown(PointerInputScope $this$onRightClickDown, Function1<? super Offset, Unit> r3, Continuation<? super Unit> r4) {
        Object r0 = ForEachGestureKt.awaitEachGesture($this$onRightClickDown, new C02232(r3, null), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004c -> B:18:0x0053). Please report as a decompilation issue!!! */
    private static final Object awaitFirstRightClickDown(AwaitPointerEventScope r19, Continuation<? super PointerInputChange> r20) {
        if ((r20 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r1 = (AnonymousClass1) r20;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        AwaitPointerEventScope $this$awaitFirstRightClickDown = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$awaitFirstRightClickDown2 = $this$awaitFirstRightClickDown;
        Object r4 = $result2;
        Object $result3 = $result;
    L18:
        PointerEvent event = (PointerEvent) $result;
        if (PointerEvent_androidKt.m5564isSecondaryPressedaHzCxE(event.m5529getButtonsry648PA()) == false) goto L31;
        List<PointerInputChange> r7 = event.getChanges();
        int index$iv$iv = 0;
        int r11 = r7.size();
    L22:
        if (index$iv$iv >= r11) goto L27;
        Object item$iv$iv = r7.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (PointerEventKt.changedToDown(it) == false) goto L25;
        index$iv$iv = index$iv$iv + 1;
        goto L22
    L25:
        boolean r8 = false;
    L28:
        if (r8 == false) goto L31;
        return event.getChanges().get(0);
    L27:
        r8 = true;
    L31:
        $result = $result3;
        $result2 = r4;
        AwaitPointerEventScope $this$awaitFirstRightClickDown3 = $this$awaitFirstRightClickDown2;
    L14:
        r1.L$0 = $this$awaitFirstRightClickDown3;
        r1.label = 1;
        Object r6 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitFirstRightClickDown3, null, r1, 1, null);
        if (r6 != $result2) goto L17;
        return $result2;
    L17:
        Object r18 = $result2;
        $result3 = $result;
        $result = r6;
        $this$awaitFirstRightClickDown2 = $this$awaitFirstRightClickDown3;
        r4 = r18;
        goto L18
    L13:
        ResultKt.throwOnFailure($result);
        $this$awaitFirstRightClickDown3 = r19;
        goto L14
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new AnonymousClass1(r20);
        goto L8
    }
}
