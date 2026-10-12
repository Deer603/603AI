package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080@¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080@¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0005¨\u0006\t"}, d2 = {"detectDownAndDragGesturesWithObserver", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "observer", "Landroidx/compose/foundation/text/TextDragObserver;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPressWithObserver", "detectDragGesturesWithObserver", "detectPreDragGesturesWithObserver", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LongPressTextDragObserverKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2, reason: invalid class name */
    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ TextDragObserver $observer;
            final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
            int label;

            AnonymousClass1(PointerInputScope r2, TextDragObserver r3, Continuation<? super AnonymousClass1> r4) {
                this.$this_detectDownAndDragGesturesWithObserver = r2;
                this.$observer = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                return new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, r5);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                this.label = 1;
                if (LongPressTextDragObserverKt.access$detectPreDragGesturesWithObserver(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
        static final class C00412 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ TextDragObserver $observer;
            final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
            int label;

            C00412(PointerInputScope r2, TextDragObserver r3, Continuation<? super C00412> r4) {
                this.$this_detectDownAndDragGesturesWithObserver = r2;
                this.$observer = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                return new C00412(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, r5);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((C00412) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                this.label = 1;
                if (LongPressTextDragObserverKt.access$detectDragGesturesWithObserver(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass2(PointerInputScope r2, TextDragObserver r3, Continuation<? super AnonymousClass2> r4) {
            this.$this_detectDownAndDragGesturesWithObserver = r2;
            this.$observer = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Job> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Job> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r9);
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default($this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1, null);
            return BuildersKt.launch$default($this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new C00412(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1, null);
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {0, 1, 1}, l = {87, 91}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
    static final class C03562 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C03562(TextDragObserver r2, Continuation<? super C03562> r3) {
            this.$observer = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C03562 r0 = new C03562(this.$observer, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((C03562) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:17:0x007c). Please report as a decompilation issue!!! */
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
            C03562 r7 = this;
            AwaitPointerEventScope $this$awaitEachGesture2 = $this$awaitEachGesture;
            PointerInputChange down2 = down;
            Object $result3 = $result2;
        L17:
            PointerEvent event = (PointerEvent) $result2;
            List<PointerInputChange> r2 = event.getChanges();
            int index$iv$iv = 0;
            int r11 = r2.size();
        L18:
            if (index$iv$iv >= r11) goto L28;
            Object it$iv = r2.get(index$iv$iv);
            PointerInputChange it = (PointerInputChange) it$iv;
            Object $result4 = $result3;
            if (PointerId.m5571equalsimpl0(it.m5587getIdJ3iCeTQ(), down2.m5587getIdJ3iCeTQ()) == true) goto L22;
        L24:
            boolean r12 = false;
        L25:
            if (r12 == true) goto L26;
            index$iv$iv = index$iv$iv + 1;
            $result3 = $result4;
            goto L18
        L26:
            boolean r13 = true;
        L29:
            if (r13 == true) goto L32;
            r7.$observer.onUp();
            return Unit.INSTANCE;
        L32:
            Object $result5 = $result4;
            PointerInputChange down3 = down2;
            AwaitPointerEventScope $this$awaitEachGesture3 = $this$awaitEachGesture2;
            C03562 r6 = r7;
            r3 = 1;
        L13:
            r6.L$0 = $this$awaitEachGesture3;
            r6.L$1 = down3;
            r6.label = 2;
            Object r8 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitEachGesture3, null, r6, r3, null);
            if (r8 != r1) goto L16;
            return r1;
        L16:
            PointerInputChange r17 = down3;
            $result3 = $result5;
            $result2 = r8;
            r7 = r6;
            $this$awaitEachGesture2 = $this$awaitEachGesture3;
            down2 = r17;
            goto L17
        L22:
            if (it.getPressed() == false) goto L24;
            r12 = true;
            goto L25
        L28:
            $result4 = $result3;
            r13 = false;
            goto L29
        L7:
            Object $result6 = $result;
            AwaitPointerEventScope $this$awaitEachGesture4 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result6);
            $this$awaitEachGesture3 = $this$awaitEachGesture4;
            Object $result7 = $result6;
        L12:
            PointerInputChange down4 = (PointerInputChange) $result6;
            this.$observer.mo1131onDownk4lQ0M(down4.m5589getPositionF1C5BW0());
            Object r9 = $result7;
            down3 = down4;
            $result5 = r9;
            r6 = this;
            goto L13
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

    public static final /* synthetic */ Object access$detectDragGesturesWithObserver(PointerInputScope $receiver, TextDragObserver observer, Continuation $completion) {
        return detectDragGesturesWithObserver($receiver, observer, $completion);
    }

    public static final /* synthetic */ Object access$detectPreDragGesturesWithObserver(PointerInputScope $receiver, TextDragObserver observer, Continuation $completion) {
        return detectPreDragGesturesWithObserver($receiver, observer, $completion);
    }

    public static final Object detectDragGesturesAfterLongPressWithObserver(PointerInputScope $this$detectDragGesturesAfterLongPressWithObserver, final TextDragObserver observer, Continuation<? super Unit> r9) {
        Object r7 = DragGestureDetectorKt.detectDragGesturesAfterLongPress($this$detectDragGesturesAfterLongPressWithObserver, new C03512(observer), new AnonymousClass3(observer), new AnonymousClass4(observer), new AnonymousClass5(observer), r9);
        if (r7 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r7;
    L6:
        return Unit.INSTANCE;
    }

    public static final Object detectDownAndDragGesturesWithObserver(PointerInputScope $this$detectDownAndDragGesturesWithObserver, TextDragObserver observer, Continuation<? super Unit> r4) {
        Object r0 = CoroutineScopeKt.coroutineScope(new AnonymousClass2($this$detectDownAndDragGesturesWithObserver, observer, null), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    private static final Object detectPreDragGesturesWithObserver(PointerInputScope $this$detectPreDragGesturesWithObserver, TextDragObserver observer, Continuation<? super Unit> r4) {
        Object r0 = ForEachGestureKt.awaitEachGesture($this$detectPreDragGesturesWithObserver, new C03562(observer, null), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    private static final Object detectDragGesturesWithObserver(PointerInputScope $this$detectDragGesturesWithObserver, final TextDragObserver observer, Continuation<? super Unit> r9) {
        Object r7 = DragGestureDetectorKt.detectDragGestures($this$detectDragGesturesWithObserver, new C03522(observer), new C03533(observer), new C03544(observer), new C03555(observer), r9);
        if (r7 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r7;
    L6:
        return Unit.INSTANCE;
    }
}
