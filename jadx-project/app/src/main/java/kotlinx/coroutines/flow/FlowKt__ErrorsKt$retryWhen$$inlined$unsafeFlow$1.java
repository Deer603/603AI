package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ Function4 $predicate$inlined;
    final /* synthetic */ Flow $this_retryWhen$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {116, 118}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u242", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u242", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 this$0;

        public AnonymousClass1(FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r1, Continuation r2) {
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

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a6 -> B:25:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c1 -> B:30:0x00c9). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> r13, Continuation<? super Unit> r14) {
        if ((r14 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r14;
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
        int r15 = 0;
        long attempt = r0.J$0;
        Throwable cause = (Throwable) r0.L$2;
        FlowCollector<? super T> r5 = (FlowCollector) r0.L$1;
        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> r6 = (FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r0.L$0;
        ResultKt.throwOnFailure($result);
        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> r7 = r6;
        FlowCollector<? super T> r8 = r5;
        Throwable cause2 = cause;
        long attempt2 = attempt;
        Object r2 = r1;
        AnonymousClass1 r3 = r0;
        Object $result2 = $result;
    L26:
        if (((Boolean) $result).booleanValue() == false) goto L28;
        long attempt3 = attempt2 + 1;
        int r4 = r15;
        r13 = r8;
        int r9 = 1;
        $result = $result2;
        r0 = r3;
        r1 = r2;
        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> r10 = r7;
    L30:
        if (r9 == 0) goto L32;
    L15:
        r9 = 0;
        Flow r11 = r10.$this_retryWhen$inlined;
        r0.L$0 = r10;
        r0.L$1 = r13;
        r0.L$2 = null;
        r0.J$0 = attempt3;
        r0.I$0 = 0;
        r0.label = 1;
        Object r12 = FlowKt.catchImpl(r11, r13, r0);
        if (r12 != r1) goto L18;
        return r1;
    L18:
        FlowCollector<? super T> r16 = r13;
        r15 = r4;
        attempt2 = attempt3;
        AnonymousClass1 r17 = r0;
        $result2 = $result;
        $result = r12;
        r7 = r10;
        r2 = r1;
        r3 = r17;
    L19:
        Throwable cause3 = (Throwable) $result;
        if (cause3 == null) goto L29;
        Function4 r18 = r7.$predicate$inlined;
        Long r19 = Boxing.boxLong(attempt2);
        r3.L$0 = r7;
        r3.L$1 = r16;
        r3.L$2 = cause3;
        r3.J$0 = attempt2;
        r3.label = 2;
        Object r20 = r18.invoke(r16, cause3, r19, r3);
        if (r20 != r2) goto L24;
        return r2;
    L24:
        FlowCollector<? super T> r110 = r16;
        cause2 = cause3;
        $result = r20;
        r8 = r110;
        goto L26
    L29:
        long r111 = attempt2;
        r4 = r15;
        r13 = r16;
        attempt3 = r111;
        $result = $result2;
        r0 = r3;
        r1 = r2;
        r10 = r7;
        goto L30
    L32:
        return Unit.INSTANCE;
    L28:
        throw cause2;
    L13:
        r15 = 0;
        int r21 = r0.I$0;
        attempt2 = r0.J$0;
        r16 = (FlowCollector) r0.L$1;
        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> r22 = (FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r0.L$0;
        ResultKt.throwOnFailure($result);
        r7 = r22;
        r9 = r21;
        r2 = r1;
        r3 = r0;
        $result2 = $result;
        goto L19
    L14:
        ResultKt.throwOnFailure($result);
        r10 = this;
        r4 = 0;
        attempt3 = 0;
        goto L15
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r14);
        goto L8
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(Flow r1, Function4 r2) {
        this.$this_retryWhen$inlined = r1;
        this.$predicate$inlined = r2;
    }
}
