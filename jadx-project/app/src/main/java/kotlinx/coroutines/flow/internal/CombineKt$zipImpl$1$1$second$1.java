package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
final class CombineKt$zipImpl$1$1$second$1 extends SuspendLambda implements Function2<ProducerScope<? super Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T2> $flow2;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ ProducerScope<Object> $$this$produce;

        AnonymousClass1(ProducerScope<Object> r1) {
            this.$$this$produce = r1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T2 r5, Continuation<? super Unit> r6) {
            if ((r6 instanceof CombineKt$zipImpl$1$1$second$1$1$emit$1) == false) goto L7;
            CombineKt$zipImpl$1$1$second$1$1$emit$1 r0 = (CombineKt$zipImpl$1$1$second$1$1$emit$1) r6;
            if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
            r0.label -= Integer.MIN_VALUE;
        L8:
            Object r7 = r0.result;
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(r0.label) {
                case 0: goto L13;
                case 1: goto L12;
                default: goto L11;
            };
        L12:
            ResultKt.throwOnFailure(r7);
        L20:
            return Unit.INSTANCE;
        L13:
            ResultKt.throwOnFailure(r7);
            SendChannel<Object> r3 = this.$$this$produce.getChannel();
            Object r8 = r5;
            if (r5 != 0) goto L16;
            r8 = NullSurrogateKt.NULL;
        L16:
            r0.label = 1;
            if (r3.send(r8, r0) != r1) goto L20;
            return r1;
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L7:
            r0 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, r6);
            goto L8
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    CombineKt$zipImpl$1$1$second$1(Flow<? extends T2> r2, Continuation<? super CombineKt$zipImpl$1$1$second$1> r3) {
        this.$flow2 = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        CombineKt$zipImpl$1$1$second$1 r0 = new CombineKt$zipImpl$1$1$second$1(this.$flow2, r4);
        r0.L$0 = r3;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProducerScope<? super Object> r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProducerScope<Object> r3, Continuation<? super Unit> r4) {
        return ((CombineKt$zipImpl$1$1$second$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        ProducerScope r2 = (ProducerScope) this.L$0;
        Flow<T2> r3 = this.$flow2;
        AnonymousClass1 r4 = new AnonymousClass1(r2);
        this.label = 1;
        if (r3.collect(r4, this) != r0) goto L12;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
