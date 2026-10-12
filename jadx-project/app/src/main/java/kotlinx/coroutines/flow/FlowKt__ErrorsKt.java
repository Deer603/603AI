package kotlinx.coroutines.flow;

import androidx.autofill.HintConstants;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;

/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012B\u0010\u0003\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u000e\u001a.\u0010\u000f\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0080@¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u0013*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\b\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\b\u0019\u001a`\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001c23\b\u0002\u0010\u001d\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001e¢\u0006\u0002\u0010\u001f\u001az\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012W\u0010\u001d\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0!¢\u0006\u0002\b\r¢\u0006\u0002\u0010#¨\u0006$"}, d2 = {"catch", "Lkotlinx/coroutines/flow/Flow;", "T", "action", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "catchImpl", "collector", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCancellationCause", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "isCancellationCause$FlowKt__ErrorsKt", "isSameExceptionAs", "other", "isSameExceptionAs$FlowKt__ErrorsKt", "retry", "retries", "", "predicate", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;JLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "retryWhen", "Lkotlin/Function4;", "attempt", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ErrorsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: Errors.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {152}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
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
            return FlowKt.catchImpl(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2, reason: invalid class name */
    /* JADX INFO: compiled from: Errors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<T> $collector;
        final /* synthetic */ Ref.ObjectRef<Throwable> $fromDownstream;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(FlowCollector<? super T> r1, Ref.ObjectRef<Throwable> r2) {
            this.$collector = r1;
            this.$fromDownstream = r2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T r6, Continuation<? super Unit> r7) {
            if ((r7 instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) == false) goto L7;
            FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) r7;
            if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
            r0.label -= Integer.MIN_VALUE;
        L8:
            Object r8 = r0.result;
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(r0.label) {
                case 0: goto L17;
                case 1: goto L12;
                default: goto L11;
            };
        L12:
            AnonymousClass2<T> r9 = (AnonymousClass2) r0.L$0;
            ResultKt.throwOnFailure(r8);     // Catch: Throwable -> L15
        L23:
            return Unit.INSTANCE;
        L15:
            th = move-exception;
            r1 = (T) th;
        L26:
            r9.$fromDownstream.element = (T) r1;
            throw ((Throwable) r1);
        L17:
            ResultKt.throwOnFailure(r8);
            FlowCollector<T> r3 = this.$collector;     // Catch: Throwable -> L24
            r0.L$0 = this;     // Catch: Throwable -> L24
            r0.label = 1;     // Catch: Throwable -> L24
            if (r3.emit(r6, r0) != r1) goto L23;
            return r1;
        L24:
            th = move-exception;
            r1 = (T) th;
            r9 = this;
            goto L26
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L7:
            r0 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, r7);
            goto L8
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Errors.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C07581 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
        int label;

        C07581(Continuation<? super C07581> r2) {
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C07581(r3);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Throwable r2, Continuation<? super Boolean> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Throwable r3, Continuation<? super Boolean> r4) {
            return ((C07581) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r3);
            return Boxing.boxBoolean(true);
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3, reason: invalid class name */
    /* JADX INFO: compiled from: Errors.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "cause", "", "attempt", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3<T> extends SuspendLambda implements Function4<FlowCollector<? super T>, Throwable, Long, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Function2<Throwable, Continuation<? super Boolean>, Object> $predicate;
        final /* synthetic */ long $retries;
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(long r2, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> r4, Continuation<? super AnonymousClass3> r5) {
            this.$retries = r2;
            this.$predicate = r4;
            super(4, r5);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object r7, Throwable r8, Long r9, Continuation<? super Boolean> r10) {
            return invoke((FlowCollector) r7, r8, r9.longValue(), r10);
        }

        public final Object invoke(FlowCollector<? super T> r5, Throwable r6, long r7, Continuation<? super Boolean> r9) {
            AnonymousClass3 r0 = new AnonymousClass3(this.$retries, this.$predicate, r9);
            r0.L$0 = r6;
            r0.J$0 = r7;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            boolean r2 = true;
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L14:
            if (((Boolean) $result).booleanValue() == true) goto L19;
            $result = $result;
        L17:
            r2 = false;
        L19:
            return Boxing.boxBoolean(r2);
        L7:
            ResultKt.throwOnFailure($result);
            Throwable cause = (Throwable) this.L$0;
            long attempt = this.J$0;
            if (attempt >= this.$retries) goto L17;
            Function2<Throwable, Continuation<? super Boolean>, Object> r6 = this.$predicate;
            this.label = 1;
            Object r3 = r6.invoke(cause, this);
            if (r3 != r0) goto L12;
            return r0;
        L12:
            $result = r3;
            goto L14
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final <T> Flow<T> m8955catch(Flow<? extends T> r2, Function3<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> r3) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(r2, r3);
    }

    public static /* synthetic */ Flow retry$default(Flow r0, long r1, C07581 r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = Long.MAX_VALUE;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r3 = new C07581(null);
    L9:
        return FlowKt.retry(r0, r1, r3);
    }

    public static final <T> Flow<T> retry(Flow<? extends T> r3, long retries, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> r6) {
        if (retries <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L10;
        return FlowKt.retryWhen(r3, new AnonymousClass3(retries, r6, null));
    L10:
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + retries).toString());
    L5:
        r0 = false;
        goto L6
    }

    public static final <T> Flow<T> retryWhen(Flow<? extends T> r2, Function4<? super FlowCollector<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> r3) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(r2, r3);
    }

    public static final <T> Object catchImpl(Flow<? extends T> r5, FlowCollector<? super T> r6, Continuation<? super Throwable> r7) {
        if ((r7 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r7;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r8 = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.ObjectRef r9 = (Ref.ObjectRef) r0.L$0;
        ResultKt.throwOnFailure(r8);     // Catch: Throwable -> L15
        return null;
    L15:
        th = th;
    L26:
        Throwable r10 = (Throwable) r9.element;
        if (isSameExceptionAs$FlowKt__ErrorsKt(th, r10) == false) goto L29;
    L38:
        throw th;
    L29:
        if (isCancellationCause$FlowKt__ErrorsKt(th, r0.getContext()) == true) goto L38;
        if (r10 != null) goto L33;
        return th;
    L33:
        if ((th instanceof CancellationException) == false) goto L36;
        ExceptionsKt.addSuppressed(r10, th);
        throw r10;
    L36:
        ExceptionsKt.addSuppressed(th, r10);
        throw th;
    L17:
        ResultKt.throwOnFailure(r8);
        Ref.ObjectRef r2 = new Ref.ObjectRef();
        FlowCollector<? super Object> r3 = new AnonymousClass2(r6, r2);     // Catch: Throwable -> L24
        r0.L$0 = r2;     // Catch: Throwable -> L24
        r0.label = 1;     // Catch: Throwable -> L24
        if (r5.collect(r3, r0) != r1) goto L22;
        return r1;
    L22:
        return null;
    L24:
        th = th;
        r9 = r2;
        goto L26
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r7);
        goto L8
    }

    private static final boolean isCancellationCause$FlowKt__ErrorsKt(Throwable $this$isCancellationCause, CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key);
        if (job != null) goto L5;
        return false;
    L5:
        if (job.isCancelled() == true) goto L8;
        return false;
    L8:
        return isSameExceptionAs$FlowKt__ErrorsKt($this$isCancellationCause, job.getCancellationException());
    }

    private static final boolean isSameExceptionAs$FlowKt__ErrorsKt(Throwable $this$isSameExceptionAs, Throwable other) {
        if (other != null) goto L4;
    L14:
        return false;
    L4:
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L6;
        Throwable r1 = other;
    L8:
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L10;
        Throwable r2 = $this$isSameExceptionAs;
    L12:
        if (Intrinsics.areEqual(r1, r2) == false) goto L14;
        return true;
    L10:
        r2 = StackTraceRecoveryKt.unwrapImpl($this$isSameExceptionAs);
        goto L12
    L6:
        r1 = StackTraceRecoveryKt.unwrapImpl(other);
        goto L8
    }
}
