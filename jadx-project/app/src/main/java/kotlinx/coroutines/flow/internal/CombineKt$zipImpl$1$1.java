package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0, 0}, l = {123}, m = "invokeSuspend", n = {"second", "collectJob"}, s = {"L$0", "L$1"})
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T1> $flow;
    final /* synthetic */ Flow<T2> $flow2;
    final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
    final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ CompletableJob $collectJob;
        final /* synthetic */ Flow<T1> $flow;
        final /* synthetic */ CoroutineContext $scopeContext;
        final /* synthetic */ ReceiveChannel<Object> $second;
        final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
        final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> $transform;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ Object $cnt;
            final /* synthetic */ CompletableJob $collectJob;
            final /* synthetic */ CoroutineContext $scopeContext;
            final /* synthetic */ ReceiveChannel<Object> $second;
            final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
            final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> $transform;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {126, 129, 129}, m = "invokeSuspend", n = {}, s = {})
            static final class C01541 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                final /* synthetic */ CompletableJob $collectJob;
                final /* synthetic */ ReceiveChannel<Object> $second;
                final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
                final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> $transform;
                final /* synthetic */ T1 $value;
                Object L$0;
                int label;

                /* JADX WARN: Multi-variable type inference failed */
                C01541(ReceiveChannel<? extends Object> r2, FlowCollector<? super R> r3, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> r4, T1 r5, CompletableJob r6, Continuation<? super C01541> r7) {
                    this.$second = r2;
                    this.$this_unsafeFlow = r3;
                    this.$transform = r4;
                    this.$value = r5;
                    this.$collectJob = r6;
                    super(2, r7);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
                    return new C01541(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, this.$collectJob, r9);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Unit r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Unit r3, Continuation<? super Unit> r4) {
                    return ((C01541) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v4, types: [kotlinx.coroutines.flow.FlowCollector] */
                /* JADX WARN: Type inference failed for: r4v5 */
                /* JADX WARN: Type inference failed for: r4v6 */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object r11) {
                    Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L9;
                        case 1: goto L8;
                        case 2: goto L7;
                        case 3: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure(r11);
                L30:
                    return Unit.INSTANCE;
                L7:
                    FlowCollector r3 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(r11);
                    ?? r4 = r3;
                    C01541 r5 = this;
                L25:
                    r5.L$0 = null;
                    r5.label = 3;
                    if (r4.emit(r11, r5) != r0) goto L30;
                    return r0;
                L8:
                    C01541 r1 = this;
                    ResultKt.throwOnFailure(r11);
                    Object r6 = ((ChannelResult) r11).m8938unboximpl();
                L12:
                    CompletableJob r7 = r1.$collectJob;
                    if ((r6 instanceof ChannelResult.Failed) == false) goto L18;
                    Throwable r2 = ChannelResult.m8930exceptionOrNullimpl(r6);
                    if (r2 == null) goto L17;
                    throw r2;
                L17:
                    throw new AbortFlowException(r7);
                L18:
                    Object r8 = r1.$this_unsafeFlow;
                    Function3 r9 = r1.$transform;
                    Object r10 = r1.$value;
                    if (r6 != NullSurrogateKt.NULL) goto L21;
                    r6 = null;
                L21:
                    r1.L$0 = r8;
                    r1.label = 2;
                    Object r12 = r9.invoke(r10, r6, r1);
                    if (r12 != r0) goto L24;
                    return r0;
                L24:
                    r11 = r12;
                    r5 = r1;
                    r4 = r8;
                    goto L25
                L9:
                    ResultKt.throwOnFailure(r11);
                    r1 = this;
                    r1.label = 1;
                    r6 = r1.$second.mo8919receiveCatchingJP2dKIU(r1);
                    if (r6 != r0) goto L12;
                    return r0;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CoroutineContext r1, Object r2, ReceiveChannel<? extends Object> r3, FlowCollector<? super R> r4, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> r5, CompletableJob r6) {
                this.$scopeContext = r1;
                this.$cnt = r2;
                this.$second = r3;
                this.$this_unsafeFlow = r4;
                this.$transform = r5;
                this.$collectJob = r6;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T1 r13, Continuation<? super Unit> r14) {
                if ((r14 instanceof CombineKt$zipImpl$1$1$2$1$emit$1) == false) goto L7;
                CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (CombineKt$zipImpl$1$1$2$1$emit$1) r14;
                if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
                r0.label -= Integer.MIN_VALUE;
            L8:
                Object $result = r0.result;
                Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(r0.label) {
                    case 0: goto L13;
                    case 1: goto L12;
                    default: goto L11;
                };
            L12:
                ResultKt.throwOnFailure($result);
            L17:
                return Unit.INSTANCE;
            L13:
                ResultKt.throwOnFailure($result);
                CoroutineContext r15 = this.$scopeContext;
                Unit r10 = Unit.INSTANCE;
                Object r11 = this.$cnt;
                C01541 r3 = new C01541(this.$second, this.$this_unsafeFlow, this.$transform, r13, this.$collectJob, null);
                r0.label = 1;
                if (ChannelFlowKt.withContextUndispatched(r15, r10, r11, r3, r0) != r1) goto L17;
                return r1;
            L11:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            L7:
                r0 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, r14);
                goto L8
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Flow<? extends T1> r2, CoroutineContext r3, Object r4, ReceiveChannel<? extends Object> r5, FlowCollector<? super R> r6, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> r7, CompletableJob r8, Continuation<? super AnonymousClass2> r9) {
            this.$flow = r2;
            this.$scopeContext = r3;
            this.$cnt = r4;
            this.$second = r5;
            this.$this_unsafeFlow = r6;
            this.$transform = r7;
            this.$collectJob = r8;
            super(2, r9);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r10, Continuation<?> r11) {
            return new AnonymousClass2(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob, r11);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Unit r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Unit r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r11) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r11);
        L12:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure(r11);
            Flow<T1> r2 = this.$flow;
            AnonymousClass1 r3 = new AnonymousClass1(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob);
            this.label = 1;
            if (r2.collect(r3, this) != r0) goto L12;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    CombineKt$zipImpl$1$1(Flow<? extends T2> r2, Flow<? extends T1> r3, FlowCollector<? super R> r4, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> r5, Continuation<? super CombineKt$zipImpl$1$1> r6) {
        this.$flow2 = r2;
        this.$flow = r3;
        this.$this_unsafeFlow = r4;
        this.$transform = r5;
        super(2, r6);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
        CombineKt$zipImpl$1$1 r0 = new CombineKt$zipImpl$1$1(this.$flow2, this.$flow, this.$this_unsafeFlow, this.$transform, r8);
        r0.L$0 = r7;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((CombineKt$zipImpl$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L13;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        CompletableJob collectJob = (CompletableJob) this.L$1;
        ReceiveChannel second = (ReceiveChannel) this.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L9 AbortFlowException -> L11
    L42:
    L23:
        ReceiveChannel.DefaultImpls.cancel$default(second, null, 1, null);
        return Unit.INSTANCE;
    L11:
        e = e;
    L36:
        FlowExceptions_commonKt.checkOwnership(e, collectJob);     // Catch: Throwable -> L9
        goto L42
    L13:
        ResultKt.throwOnFailure($result);
        CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
        ReceiveChannel second2 = ProduceKt.produce$default($this$coroutineScope, null, 0, new CombineKt$zipImpl$1$1$second$1(this.$flow2, null), 3, null);
        final CompletableJob collectJob2 = JobKt.Job$default(null, 1, null);
        Intrinsics.checkNotNull(second2, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
        ((SendChannel) second2).invokeOnClose(new AnonymousClass1(collectJob2));
        CoroutineContext scopeContext = $this$coroutineScope.getCoroutineContext();     // Catch: Throwable -> L32 AbortFlowException -> L34
        Object cnt = ThreadContextKt.threadContextElements(scopeContext);     // Catch: Throwable -> L32 AbortFlowException -> L34
        CoroutineContext r9 = $this$coroutineScope.getCoroutineContext().plus(collectJob2);     // Catch: Throwable -> L32 AbortFlowException -> L34
        Unit r10 = Unit.INSTANCE;     // Catch: Throwable -> L32 AbortFlowException -> L34
    L49:
        AnonymousClass2 r13 = new AnonymousClass2(this.$flow, scopeContext, cnt, second2, this.$this_unsafeFlow, this.$transform, collectJob2, null);     // Catch: Throwable -> L28 AbortFlowException -> L30
        collectJob = collectJob2;
        this.L$0 = second2;     // Catch: Throwable -> L24 AbortFlowException -> L26
        this.L$1 = collectJob;     // Catch: Throwable -> L24 AbortFlowException -> L26
        this.label = 1;     // Catch: Throwable -> L24 AbortFlowException -> L26
        if (ChannelFlowKt.withContextUndispatched$default(r9, r10, null, r13, this, 4, null) != r0) goto L21;
        return r0;
    L21:
        second = second2;
        goto L23
    L26:
        e = e;
        second = second2;
    L24:
        th = th;
        second = second2;
    L40:
        ReceiveChannel.DefaultImpls.cancel$default(second, null, 1, null);
        throw th;
    L30:
        e = e;
        collectJob = collectJob2;
        second = second2;
    L28:
        th = th;
        second = second2;
    L34:
        e = e;
        collectJob = collectJob2;
        second = second2;
    L32:
        th = th;
        second = second2;
        goto L40
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        th = th;
        goto L40
    }
}
