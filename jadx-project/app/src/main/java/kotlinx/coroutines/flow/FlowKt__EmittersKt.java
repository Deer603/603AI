package kotlinx.coroutines.flow;

import androidx.autofill.HintConstants;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001ap\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00022D\u0010\u0005\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0002\b\r2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\u000e\u0010\u000f\u001ag\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0011\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00112D\u0010\u0005\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u0012\u001aP\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0011\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00112-\u0010\u0005\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0014¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u0015\u001aP\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0011\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00112-\u0010\u0005\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0014¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u0015\u001ap\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0011\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00040\u00112D\b\u0005\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0002\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0002\u0010\u0012\u001ap\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0011\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00040\u00112D\b\u0005\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0002\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0002\b\rH\u0081\b¢\u0006\u0002\u0010\u0012¨\u0006\u001b"}, d2 = {"ensureActive", "", "Lkotlinx/coroutines/flow/FlowCollector;", "invokeSafely", "T", "action", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "cause", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "invokeSafely$FlowKt__EmittersKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCompletion", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "onEmpty", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "onStart", "transform", "R", "value", "unsafeTransform", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__EmittersKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1, reason: invalid class name */
    /* JADX INFO: compiled from: Emitters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<R> extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T> $this_transform;
        final /* synthetic */ Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
        public static final class C01511<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<R> $$this$flow;
            final /* synthetic */ Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> $transform;

            /* JADX WARN: Multi-variable type inference failed */
            public C01511(Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> r1, FlowCollector<? super R> r2) {
                this.$transform = r1;
                this.$$this$flow = r2;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T r7, Continuation<? super Unit> r8) {
                if ((r8 instanceof FlowKt__EmittersKt$transform$1$1$emit$1) == false) goto L7;
                FlowKt__EmittersKt$transform$1$1$emit$1 r0 = (FlowKt__EmittersKt$transform$1$1$emit$1) r8;
                if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
                r0.label -= Integer.MIN_VALUE;
            L8:
                Object r9 = r0.result;
                Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(r0.label) {
                    case 0: goto L13;
                    case 1: goto L12;
                    default: goto L11;
                };
            L12:
                ResultKt.throwOnFailure(r9);
            L17:
                return Unit.INSTANCE;
            L13:
                ResultKt.throwOnFailure(r9);
                Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> r3 = this.$transform;
                FlowCollector<R> r4 = this.$$this$flow;
                r0.label = 1;
                if (r3.invoke((FlowCollector<? super R>) r4, r7, r0) != r1) goto L17;
                return r1;
            L11:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            L7:
                r0 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, r8);
                goto L8
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final Object emit$$forInline(T r3, Continuation<? super Unit> r4) {
                new FlowKt__EmittersKt$transform$1$1$emit$1(this, r4);
                this.$transform.invoke((FlowCollector<? super R>) this.$$this$flow, r3, r4);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Flow<? extends T> r2, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> r3, Continuation<? super AnonymousClass1> r4) {
            this.$this_transform = r2;
            this.$transform = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            AnonymousClass1 r0 = new AnonymousClass1(this.$this_transform, this.$transform, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((FlowCollector) r2, r3);
        }

        public final Object invoke(FlowCollector<? super R> r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r8);
        L12:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure(r8);
            FlowCollector r2 = (FlowCollector) this.L$0;
            Flow<T> r3 = this.$this_transform;
            C01511 r4 = new C01511(this.$transform, r2);
            this.label = 1;
            if (r3.collect(r4, this) != r0) goto L12;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invokeSuspend$$forInline(Object r5) {
            FlowCollector r0 = (FlowCollector) this.L$0;
            Flow<T> r1 = this.$this_transform;
            C01511 r2 = new C01511(this.$transform, r0);
            r1.collect(r2, this);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ Object access$invokeSafely$FlowKt__EmittersKt(FlowCollector $receiver, Function3 action, Throwable cause, Continuation $completion) {
        return invokeSafely$FlowKt__EmittersKt($receiver, action, cause, $completion);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> r3, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> r4) {
        return FlowKt.flow(new AnonymousClass1(r3, r4, null));
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> r3, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> r4) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(r3, r4);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> r2, Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> r3) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(r3, r2);
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> r2, Function3<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> r3) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(r2, r3);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> r2, Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> r3) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(r2, r3);
    }

    public static final void ensureActive(FlowCollector<?> r1) {
        if ((r1 instanceof ThrowingCollector) == true) goto L6;
        return;
    L6:
        throw ((ThrowingCollector) r1).e;
    }

    private static final <T> Object invokeSafely$FlowKt__EmittersKt(FlowCollector<? super T> r3, Function3<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> r4, Throwable cause, Continuation<? super Unit> r6) {
        if ((r6 instanceof FlowKt__EmittersKt$invokeSafely$1) == false) goto L7;
        FlowKt__EmittersKt$invokeSafely$1 r0 = (FlowKt__EmittersKt$invokeSafely$1) r6;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Throwable cause2 = (Throwable) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
    L23:
        return Unit.INSTANCE;
    L15:
        e = th;
    L26:
        if (cause2 == null) goto L29;
        if (cause2 == e) goto L29;
        ExceptionsKt.addSuppressed(e, cause2);
    L29:
        throw e;
    L17:
        ResultKt.throwOnFailure($result);
        r0.L$0 = cause;     // Catch: Throwable -> L24
        r0.label = 1;     // Catch: Throwable -> L24
        if (r4.invoke(r3, cause, r0) != r1) goto L23;
        return r1;
    L24:
        e = th;
        cause2 = cause;
        goto L26
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new FlowKt__EmittersKt$invokeSafely$1(r6);
        goto L8
    }
}
