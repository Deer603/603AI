package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.view.MotionEventCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: PointerMoveDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0080@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"detectMoves", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "pointerEventPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "onMove", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PointerMoveDetectorKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2, reason: invalid class name */
    /* JADX INFO: compiled from: PointerMoveDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", i = {}, l = {MotionEventCompat.AXIS_GENERIC_10}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        final /* synthetic */ PointerInputScope $this_detectMoves;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: PointerMoveDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", i = {0, 0}, l = {MotionEventCompat.AXIS_GENERIC_13}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "previousPosition"}, s = {"L$0", "L$1"})
        static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineContext $currentContext;
            final /* synthetic */ Function1<Offset, Unit> $onMove;
            final /* synthetic */ PointerEventPass $pointerEventPass;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CoroutineContext r2, PointerEventPass r3, Function1<? super Offset, Unit> r4, Continuation<? super AnonymousClass1> r5) {
                this.$currentContext = r2;
                this.$pointerEventPass = r3;
                this.$onMove = r4;
                super(2, r5);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
                AnonymousClass1 r0 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, r6);
                r0.L$0 = r5;
                return r0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX WARN: Type inference failed for: r9v1, types: [T, androidx.compose.ui.geometry.Offset] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:14:0x0054). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: goto L7;
                    case 1: goto L6;
                    default: goto L5;
                };
            L6:
                Ref.ObjectRef previousPosition = (Ref.ObjectRef) this.L$1;
                AwaitPointerEventScope $this$awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure($result);
                AnonymousClass1 r5 = this;
                AwaitPointerEventScope $this$awaitPointerEventScope2 = $this$awaitPointerEventScope;
                Ref.ObjectRef previousPosition2 = previousPosition;
                Object r1 = $result2;
                Object $result3 = $result;
            L14:
                PointerEvent event = (PointerEvent) $result;
                int r6 = event.m5531getType7fucELk();
                if (PointerEventType.m5538equalsimpl0(r6, PointerEventType.Companion.m5544getMove7fucELk()) == false) goto L17;
                boolean r7 = true;
            L18:
                if (r7 == false) goto L20;
                boolean r8 = true;
            L21:
                if (r8 == false) goto L29;
                Offset r12 = Offset.m4114boximpl(((PointerInputChange) CollectionsKt.first(event.getChanges())).m5589getPositionF1C5BW0());
                long it = r12.m4135unboximpl();
                if (Offset.m4121equalsimpl(it, previousPosition2.element) == false) goto L26;
                r12 = null;
            L26:
                if (r12 == null) goto L29;
                Function1<Offset, Unit> r9 = r5.$onMove;
                long position = r12.m4135unboximpl();
                previousPosition2.element = Offset.m4114boximpl(position);
                r9.invoke(Offset.m4114boximpl(position));
            L29:
                $result = $result3;
                $result2 = r1;
                Ref.ObjectRef previousPosition3 = previousPosition2;
                AwaitPointerEventScope $this$awaitPointerEventScope3 = $this$awaitPointerEventScope2;
                AnonymousClass1 r4 = r5;
            L9:
                if (JobKt.isActive(r4.$currentContext) == false) goto L31;
                r4.L$0 = $this$awaitPointerEventScope3;
                r4.L$1 = previousPosition3;
                r4.label = 1;
                Object r10 = $this$awaitPointerEventScope3.awaitPointerEvent(r4.$pointerEventPass, r4);
                if (r10 != $result2) goto L13;
                return $result2;
            L13:
                Object r11 = $result2;
                $result3 = $result;
                $result = r10;
                r5 = r4;
                $this$awaitPointerEventScope2 = $this$awaitPointerEventScope3;
                previousPosition2 = previousPosition3;
                r1 = r11;
                goto L14
            L31:
                return Unit.INSTANCE;
            L20:
                r8 = PointerEventType.m5538equalsimpl0(r6, PointerEventType.Companion.m5543getExit7fucELk());
                goto L21
            L17:
                r7 = PointerEventType.m5538equalsimpl0(r6, PointerEventType.Companion.m5542getEnter7fucELk());
                goto L18
            L7:
                ResultKt.throwOnFailure($result);
                AwaitPointerEventScope $this$awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                $this$awaitPointerEventScope3 = $this$awaitPointerEventScope4;
                previousPosition3 = new Ref.ObjectRef();
                r4 = this;
                goto L9
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(PointerInputScope r2, PointerEventPass r3, Function1<? super Offset, Unit> r4, Continuation<? super AnonymousClass2> r5) {
            this.$this_detectMoves = r2;
            this.$pointerEventPass = r3;
            this.$onMove = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            return new AnonymousClass2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, r6);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            CoroutineContext currentContext = getContext();
            this.label = 1;
            if (this.$this_detectMoves.awaitPointerEventScope(new AnonymousClass1(currentContext, this.$pointerEventPass, this.$onMove, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope r0, PointerEventPass r1, Function1 r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = PointerEventPass.Initial;
    L6:
        return detectMoves(r0, r1, r2, r3);
    }

    public static final Object detectMoves(PointerInputScope $this$detectMoves, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> r4, Continuation<? super Unit> r5) {
        Object r0 = CoroutineScopeKt.coroutineScope(new AnonymousClass2($this$detectMoves, pointerEventPass, r4, null), r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }
}
