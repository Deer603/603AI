package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.view.MotionEventCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PressDownGesture.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0080@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"detectPressDownGesture", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDown", "Landroidx/compose/foundation/text/input/internal/selection/TapOnPosition;", "onUp", "Lkotlin/Function0;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/input/internal/selection/TapOnPosition;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PressDownGestureKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2, reason: invalid class name */
    /* JADX INFO: compiled from: PressDownGesture.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", i = {0, 1, 1}, l = {31, MotionEventCompat.AXIS_GENERIC_6}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
    static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TapOnPosition $onDown;
        final /* synthetic */ Function0<Unit> $onUp;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass2(TapOnPosition r2, Function0<Unit> r3, Continuation<? super AnonymousClass2> r4) {
            this.$onDown = r2;
            this.$onUp = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$onDown, this.$onUp, r5);
            r0.L$0 = r4;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0078 -> B:19:0x0080). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int r3 = 1;
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            Object $result2 = $result;
            PointerInputChange down = (PointerInputChange) this.L$1;
            AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result2);
            AnonymousClass2 r7 = this;
            AwaitPointerEventScope $this$awaitEachGesture2 = $this$awaitEachGesture;
            PointerInputChange down2 = down;
            Object $result3 = $result2;
        L19:
            PointerEvent event = (PointerEvent) $result2;
            List<PointerInputChange> r2 = event.getChanges();
            int index$iv$iv = 0;
            int r11 = r2.size();
        L20:
            if (index$iv$iv >= r11) goto L30;
            Object it$iv = r2.get(index$iv$iv);
            PointerInputChange it = (PointerInputChange) it$iv;
            Object $result4 = $result3;
            if (PointerId.m5571equalsimpl0(it.m5587getIdJ3iCeTQ(), down2.m5587getIdJ3iCeTQ()) == true) goto L24;
        L26:
            boolean r12 = false;
        L27:
            if (r12 == true) goto L28;
            index$iv$iv = index$iv$iv + 1;
            $result3 = $result4;
            goto L20
        L28:
            boolean r13 = true;
        L31:
            if (r13 == true) goto L33;
            r7.$onUp.invoke();
        L36:
            return Unit.INSTANCE;
        L33:
            Object $result5 = $result4;
            PointerInputChange down3 = down2;
            AwaitPointerEventScope $this$awaitEachGesture3 = $this$awaitEachGesture2;
            AnonymousClass2 r6 = r7;
            r3 = 1;
        L15:
            r6.L$0 = $this$awaitEachGesture3;
            r6.L$1 = down3;
            r6.label = 2;
            Object r8 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitEachGesture3, null, r6, r3, null);
            if (r8 != r1) goto L18;
            return r1;
        L18:
            PointerInputChange r17 = down3;
            $result3 = $result5;
            $result2 = r8;
            r7 = r6;
            $this$awaitEachGesture2 = $this$awaitEachGesture3;
            down2 = r17;
            goto L19
        L24:
            if (it.getPressed() == false) goto L26;
            r12 = true;
            goto L27
        L30:
            $result4 = $result3;
            r13 = false;
            goto L31
        L7:
            Object $result6 = $result;
            AwaitPointerEventScope $this$awaitEachGesture4 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result6);
            $this$awaitEachGesture3 = $this$awaitEachGesture4;
            Object $result7 = $result6;
        L12:
            PointerInputChange down4 = (PointerInputChange) $result6;
            this.$onDown.mo1336onEventk4lQ0M(down4.m5589getPositionF1C5BW0());
            if (this.$onUp == null) goto L36;
            Object r9 = $result7;
            down3 = down4;
            $result5 = r9;
            r6 = this;
            goto L15
        L8:
            ResultKt.throwOnFailure($result);
            $this$awaitEachGesture3 = (AwaitPointerEventScope) this.L$0;
            this.L$0 = $this$awaitEachGesture3;
            this.label = 1;
            Object r4 = TapGestureDetectorKt.awaitFirstDown$default($this$awaitEachGesture3, false, null, this, 2, null);
            if (r4 != r1) goto L11;
            return r1;
        L11:
            $result7 = $result;
            $result6 = r4;
            goto L12
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ Object detectPressDownGesture$default(PointerInputScope r0, TapOnPosition r1, Function0 r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        return detectPressDownGesture(r0, r1, r2, r3);
    }

    public static final Object detectPressDownGesture(PointerInputScope $this$detectPressDownGesture, TapOnPosition onDown, Function0<Unit> r4, Continuation<? super Unit> r5) {
        Object r0 = ForEachGestureKt.awaitEachGesture($this$detectPressDownGesture, new AnonymousClass2(onDown, r4, null), r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }
}
