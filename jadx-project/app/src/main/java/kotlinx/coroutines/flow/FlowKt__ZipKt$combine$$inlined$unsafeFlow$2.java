package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2<R> implements Flow<R> {
    final /* synthetic */ Flow[] $flows$inlined;
    final /* synthetic */ Function2 $transform$inlined;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(Flow[] r1, Function2 r2) {
        this.$flows$inlined = r1;
        this.$transform$inlined = r2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super R> r9, Continuation<? super Unit> r10) {
        Flow[] r3 = this.$flows$inlined;
        Intrinsics.needClassReification();
        FlowKt__ZipKt$combine$5$1 r4 = new FlowKt__ZipKt$combine$5$1(this.$flows$inlined);
        Intrinsics.needClassReification();
        Object r5 = CombineKt.combineInternal(r9, r3, r4, new FlowKt__ZipKt$combine$5$2(this.$transform$inlined, null), r10);
        if (r5 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r5;
    L6:
        return Unit.INSTANCE;
    }

    public Object collect$$forInline(FlowCollector collector, final Continuation $completion) {
        new AnonymousClass1(this, $completion);
        Flow[] r3 = this.$flows$inlined;
        Intrinsics.needClassReification();
        FlowKt__ZipKt$combine$5$1 r4 = new FlowKt__ZipKt$combine$5$1(this.$flows$inlined);
        Intrinsics.needClassReification();
        CombineKt.combineInternal(collector, r3, r4, new FlowKt__ZipKt$combine$5$2(this.$transform$inlined, null), $completion);
        return Unit.INSTANCE;
    }
}
