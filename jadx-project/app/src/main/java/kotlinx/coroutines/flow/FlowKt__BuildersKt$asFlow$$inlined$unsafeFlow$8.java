package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 implements Flow<Long> {
    final /* synthetic */ long[] $this_asFlow$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {114}, m = "collect", n = {"$this$asFlow_u24lambda_u2415", "$this$forEach$iv"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 this$0;

        public AnonymousClass1(FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 r1, Continuation r2) {
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

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:18:0x006e). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super Long> r13, Continuation<? super Unit> r14) {
        if ((r14 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r14;
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
        int $i$f$forEach = r0.I$1;
        int r6 = r0.I$0;
        long[] $this$forEach$iv = (long[]) r0.L$1;
        FlowCollector $this$asFlow_u24lambda_u2415 = (FlowCollector) r0.L$0;
        ResultKt.throwOnFailure($result);
    L18:
        r6 = r6 + 1;
    L14:
        if (r6 >= $i$f$forEach) goto L20;
        long value = $this$forEach$iv[r6];
        Long r11 = Boxing.boxLong(value);
        r0.L$0 = $this$asFlow_u24lambda_u2415;
        r0.L$1 = $this$forEach$iv;
        r0.I$0 = r6;
        r0.I$1 = $i$f$forEach;
        r0.label = 1;
        if ($this$asFlow_u24lambda_u2415.emit(r11, r0) != r1) goto L18;
        return r1;
    L20:
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        long[] $this$forEach$iv2 = this.$this_asFlow$inlined;
        $this$forEach$iv = $this$forEach$iv2;
        $i$f$forEach = $this$forEach$iv2.length;
        r6 = 0;
        $this$asFlow_u24lambda_u2415 = r13;
        goto L14
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r14);
        goto L8
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(long[] r1) {
        this.$this_asFlow$inlined = r1;
    }
}
