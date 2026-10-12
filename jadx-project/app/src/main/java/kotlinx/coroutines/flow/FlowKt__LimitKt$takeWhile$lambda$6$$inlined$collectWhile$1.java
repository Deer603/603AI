package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> implements FlowCollector<T> {
    final /* synthetic */ Function2 $predicate$inlined;
    final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {139, 140}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 this$0;

        public AnonymousClass1(FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 r1, Continuation r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(Function2 r1, FlowCollector r2) {
        this.$predicate$inlined = r1;
        this.$this_unsafeFlow$inlined = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T r9, Continuation<? super Unit> r10) {
        if ((r10 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean r3 = true;
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> r2 = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) r0.L$0;
        ResultKt.throwOnFailure($result);
    L24:
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> r4 = r2;
    L27:
        if (r3 == false) goto L31;
        return Unit.INSTANCE;
    L31:
        throw new AbortFlowException(r4);
    L13:
        Object value = r0.L$1;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> r5 = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object value2 = value;
        r4 = r5;
        Object r6 = $result;
    L19:
        if (((Boolean) r6).booleanValue() == false) goto L25;
        FlowCollector r7 = r4.$this_unsafeFlow$inlined;
        r0.L$0 = r4;
        r0.L$1 = null;
        r0.label = 2;
        if (r7.emit(value2, r0) != r1) goto L23;
        return r1;
    L23:
        r2 = r4;
        goto L24
    L25:
        r3 = false;
        goto L27
    L14:
        ResultKt.throwOnFailure($result);
        r4 = this;
        Function2 r8 = r4.$predicate$inlined;
        r0.L$0 = r4;
        r0.L$1 = r9;
        r0.label = 1;
        r6 = r8.invoke(r9, r0);
        if (r6 != r1) goto L17;
        return r1;
    L17:
        value2 = r9;
        goto L19
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r10);
        goto L8
    }
}
