package kotlinx.coroutines.flow.internal;

import androidx.core.view.MotionEventCompat;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001ak\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0000¢\u0006\u0002\u0010\u000b\u001a\u008d\u0001\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00010\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u0001H\u000e\u0018\u00010\u00110\u001329\u0010\u0007\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u0014H\u0081@¢\u0006\u0002\u0010\u0015*\u001c\b\u0002\u0010\u0016\"\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0017¨\u0006\u0018"}, d2 = {"zipImpl", "Lkotlinx/coroutines/flow/Flow;", "R", "T1", "T2", "flow", "flow2", "transform", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "combineInternal", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "flows", "", "arrayFactory", "Lkotlin/Function0;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;[Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Update", "Lkotlin/collections/IndexedValue;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CombineKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 73, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<T[]> $arrayFactory;
        final /* synthetic */ Flow<T>[] $flows;
        final /* synthetic */ FlowCollector<R> $this_combineInternal;
        final /* synthetic */ Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> $transform;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {MotionEventCompat.AXIS_RELATIVE_Y}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<T>[] $flows;
            final /* synthetic */ int $i;
            final /* synthetic */ AtomicInteger $nonClosed;
            final /* synthetic */ Channel<IndexedValue<Object>> $resultChannel;
            int label;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            static final class C01531<T> implements FlowCollector {
                final /* synthetic */ int $i;
                final /* synthetic */ Channel<IndexedValue<Object>> $resultChannel;

                C01531(Channel<IndexedValue<Object>> r1, int r2) {
                    this.$resultChannel = r1;
                    this.$i = r2;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T r7, Continuation<? super Unit> r8) {
                    if ((r8 instanceof CombineKt$combineInternal$2$1$1$emit$1) == false) goto L7;
                    CombineKt$combineInternal$2$1$1$emit$1 r0 = (CombineKt$combineInternal$2$1$1$emit$1) r8;
                    if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
                    r0.label -= Integer.MIN_VALUE;
                L8:
                    Object $result = r0.result;
                    Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(r0.label) {
                        case 0: goto L14;
                        case 1: goto L13;
                        case 2: goto L12;
                        default: goto L11;
                    };
                L12:
                    ResultKt.throwOnFailure($result);
                L21:
                    return Unit.INSTANCE;
                L13:
                    ResultKt.throwOnFailure($result);
                L17:
                    r0.label = 2;
                    if (YieldKt.yield(r0) != r1) goto L21;
                    return r1;
                L14:
                    ResultKt.throwOnFailure($result);
                    Channel<IndexedValue<Object>> r3 = this.$resultChannel;
                    IndexedValue<Object> r4 = new IndexedValue(this.$i, r7);
                    r0.label = 1;
                    Object value = r3.send(r4, r0);
                    if (value != r1) goto L17;
                    return r1;
                L11:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                L7:
                    r0 = new CombineKt$combineInternal$2$1$1$emit$1(this, r8);
                    goto L8
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Flow<? extends T>[] r2, int r3, AtomicInteger r4, Channel<IndexedValue<Object>> r5, Continuation<? super AnonymousClass1> r6) {
                this.$flows = r2;
                this.$i = r3;
                this.$nonClosed = r4;
                this.$resultChannel = r5;
                super(2, r6);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
                return new AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, r8);
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
                    case 0: goto L11;
                    case 1: goto L6;
                    default: goto L5;
                };
            L6:
                AnonymousClass1 r1 = this;
                ResultKt.throwOnFailure($result);     // Catch: Throwable -> L9
            L17:
                if (r1.$nonClosed.decrementAndGet() != 0) goto L20;
                SendChannel.DefaultImpls.close$default(r1.$resultChannel, null, 1, null);
            L20:
                return Unit.INSTANCE;
            L9:
                Throwable th = th;
            L24:
                if (r1.$nonClosed.decrementAndGet() != 0) goto L26;
                SendChannel.DefaultImpls.close$default(r1.$resultChannel, null, 1, null);
            L26:
                throw th;
            L11:
                ResultKt.throwOnFailure($result);
                this.label = 1;     // Catch: Throwable -> L21
                if (this.$flows[this.$i].collect(new C01531(this.$resultChannel, this.$i), this) != r0) goto L15;
                return r0;
            L15:
                r1 = this;
            L21:
                th = move-exception;
                th = th;
                r1 = this;
                goto L24
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Flow<? extends T>[] r2, Function0<T[]> r3, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> r4, FlowCollector<? super R> r5, Continuation<? super AnonymousClass2> r6) {
            this.$flows = r2;
            this.$arrayFactory = r3;
            this.$transform = r4;
            this.$this_combineInternal = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, r8);
            r0.L$0 = r7;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0135 -> B:17:0x00c2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0158 -> B:17:0x00c2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x015b -> B:17:0x00c2). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            AnonymousClass2 r2 = this;
            int r4 = r2.I$1;
            int remainingAbsentValues = r2.I$0;
            byte[] lastReceivedEpoch = (byte[]) r2.L$2;
            Channel resultChannel = (Channel) r2.L$1;
            Object[] latestValues = (Object[]) r2.L$0;
            ResultKt.throwOnFailure($result);
            int remainingAbsentValues2 = r4;
            byte[] lastReceivedEpoch2 = lastReceivedEpoch;
            int remainingAbsentValues3 = remainingAbsentValues;
            Object[] latestValues2 = latestValues;
        L17:
            remainingAbsentValues2 = (byte) (remainingAbsentValues2 + 1);
            r2.L$0 = latestValues2;
            r2.L$1 = resultChannel;
            r2.L$2 = lastReceivedEpoch2;
            r2.I$0 = remainingAbsentValues3;
            r2.I$1 = remainingAbsentValues2;
            r2.label = 1;
            Object r9 = resultChannel.mo8919receiveCatchingJP2dKIU(r2);
            if (r9 != r0) goto L20;
            return r0;
        L20:
            Object[] latestValues3 = latestValues2;
        L21:
            IndexedValue element = (IndexedValue) ChannelResult.m8931getOrNullimpl(r9);
            if (element == null) goto L24;
        L25:
            int index = element.getIndex();
            Object previous = latestValues3[index];
            latestValues3[index] = element.getValue();
            if (previous != NullSurrogateKt.UNINITIALIZED) goto L29;
            remainingAbsentValues3 = remainingAbsentValues3 - 1;
        L29:
            if (lastReceivedEpoch2[index] == remainingAbsentValues2) goto L34;
            lastReceivedEpoch2[index] = (byte) remainingAbsentValues2;
            element = (IndexedValue) ChannelResult.m8931getOrNullimpl(resultChannel.mo8920tryReceivePtdJZtk());
            if (element != null) goto L25;
        L34:
            if (remainingAbsentValues3 != 0) goto L47;
            Object[] results = (Object[]) r2.$arrayFactory.invoke();
            if (results != null) goto L42;
            Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> r10 = r2.$transform;
            Object r11 = r2.$this_combineInternal;
            r2.L$0 = latestValues3;
            r2.L$1 = resultChannel;
            r2.L$2 = lastReceivedEpoch2;
            r2.I$0 = remainingAbsentValues3;
            r2.I$1 = remainingAbsentValues2;
            r2.label = 2;
            if (r10.invoke(r11, latestValues3, r2) != r0) goto L40;
            return r0;
        L40:
            latestValues2 = latestValues3;
            goto L17
        L42:
            ArraysKt.copyInto$default(latestValues3, results, 0, 0, 0, 14, null);
            Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> r12 = r2.$transform;
            Object r13 = r2.$this_combineInternal;
            r2.L$0 = latestValues3;
            r2.L$1 = resultChannel;
            r2.L$2 = lastReceivedEpoch2;
            r2.I$0 = remainingAbsentValues3;
            r2.I$1 = remainingAbsentValues2;
            r2.label = 3;
            if (r12.invoke(r13, results, r2) != r0) goto L45;
            return r0;
        L45:
            latestValues2 = latestValues3;
            goto L17
        L47:
            latestValues2 = latestValues3;
            goto L17
        L24:
            return Unit.INSTANCE;
        L7:
            r2 = this;
            int r5 = r2.I$1;
            int remainingAbsentValues4 = r2.I$0;
            byte[] lastReceivedEpoch3 = (byte[]) r2.L$2;
            resultChannel = (Channel) r2.L$1;
            Object[] latestValues4 = (Object[]) r2.L$0;
            ResultKt.throwOnFailure($result);
            remainingAbsentValues2 = r5;
            lastReceivedEpoch2 = lastReceivedEpoch3;
            remainingAbsentValues3 = remainingAbsentValues4;
            latestValues2 = latestValues4;
            goto L17
        L8:
            r2 = this;
            int r6 = r2.I$1;
            int remainingAbsentValues5 = r2.I$0;
            byte[] lastReceivedEpoch4 = (byte[]) r2.L$2;
            resultChannel = (Channel) r2.L$1;
            latestValues3 = (Object[]) r2.L$0;
            ResultKt.throwOnFailure($result);
            r9 = ((ChannelResult) $result).m8938unboximpl();
            remainingAbsentValues2 = r6;
            lastReceivedEpoch2 = lastReceivedEpoch4;
            remainingAbsentValues3 = remainingAbsentValues5;
            goto L21
        L9:
            ResultKt.throwOnFailure($result);
            r2 = this;
            CoroutineScope $this$flowScope = (CoroutineScope) r2.L$0;
            int size = r2.$flows.length;
            if (size == 0) goto L12;
            Object[] latestValues5 = new Object[size];
            ArraysKt.fill$default(latestValues5, NullSurrogateKt.UNINITIALIZED, 0, 0, 6, null);
            latestValues2 = latestValues5;
            Channel resultChannel2 = ChannelKt.Channel$default(size, null, null, 6, null);
            AtomicInteger nonClosed = new AtomicInteger(size);
            int i = 0;
        L14:
            if (i >= size) goto L16;
            BuildersKt.launch$default($this$flowScope, null, null, new AnonymousClass1(r2.$flows, i, nonClosed, resultChannel2, null), 3, null);
            i = i + 1;
            goto L14
        L16:
            lastReceivedEpoch2 = new byte[size];
            remainingAbsentValues2 = 0;
            resultChannel = resultChannel2;
            remainingAbsentValues3 = size;
            goto L17
        L12:
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <R, T> Object combineInternal(FlowCollector<? super R> r6, Flow<? extends T>[] r7, Function0<T[]> r8, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> r9, Continuation<? super Unit> r10) {
        Object r11 = FlowCoroutineKt.flowScope(new AnonymousClass2(r7, r8, r9, r6, null), r10);
        if (r11 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r11;
    L6:
        return Unit.INSTANCE;
    }

    public static final <T1, T2, R> Flow<R> zipImpl(final Flow<? extends T1> r2, final Flow<? extends T2> r3, final Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> r4) {
        return new CombineKt$zipImpl$$inlined$unsafeFlow$1(r3, r2, r4);
    }
}
