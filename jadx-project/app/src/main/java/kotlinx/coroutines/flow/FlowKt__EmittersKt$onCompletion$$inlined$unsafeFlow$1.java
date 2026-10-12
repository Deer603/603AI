package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ Function3 $action$inlined;
    final /* synthetic */ Flow $this_onCompletion$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {113, 120, WorkQueueKt.MASK}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 this$0;

        public AnonymousClass1(FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r1, Continuation r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> r9, Continuation<? super Unit> r10) {
        if ((r10 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L21;
            case 1: goto L18;
            case 2: goto L17;
            case 3: goto L12;
            default: goto L11;
        };
    L12:
        SafeCollector sc = (SafeCollector) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
    L30:
        sc.releaseIntercepted();
        return Unit.INSTANCE;
    L15:
        th = th;
    L34:
        sc.releaseIntercepted();
        throw th;
    L17:
        Throwable e = (Throwable) r0.L$0;
        ResultKt.throwOnFailure($result);
        throw e;
    L18:
        FlowCollector<? super T> r2 = (FlowCollector) r0.L$1;
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> r4 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L36
    L25:
        SafeCollector sc2 = new SafeCollector(r2, r0.getContext());
        Function3 r3 = r4.$action$inlined;     // Catch: Throwable -> L32
        r0.L$0 = sc2;     // Catch: Throwable -> L32
        r0.L$1 = null;     // Catch: Throwable -> L32
        r0.label = 3;     // Catch: Throwable -> L32
        if (r3.invoke(sc2, null, r0) != r1) goto L29;
        return r1;
    L29:
        sc = sc2;
    L32:
        th = th;
        sc = sc2;
        goto L34
    L21:
        ResultKt.throwOnFailure($result);
        r4 = this;
        r2 = r9;
        Flow r5 = r4.$this_onCompletion$inlined;     // Catch: Throwable -> L36
        r0.L$0 = r4;     // Catch: Throwable -> L36
        r0.L$1 = r2;     // Catch: Throwable -> L36
        r0.label = 1;     // Catch: Throwable -> L36
        if (r5.collect(r2, r0) != r1) goto L25;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L36:
        e = move-exception;
        ThrowingCollector r6 = new ThrowingCollector(e);
        Function3 r7 = r4.$action$inlined;
        r0.L$0 = e;
        r0.L$1 = null;
        r0.label = 2;
        if (FlowKt__EmittersKt.access$invokeSafely$FlowKt__EmittersKt(r6, r7, e, r0) != r1) goto L41;
        return r1;
    L41:
        throw e;
    L7:
        r0 = new AnonymousClass1(this, r10);
        goto L8
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(Flow r1, Function3 r2) {
        this.$this_onCompletion$inlined = r1;
        this.$action$inlined = r2;
    }
}
