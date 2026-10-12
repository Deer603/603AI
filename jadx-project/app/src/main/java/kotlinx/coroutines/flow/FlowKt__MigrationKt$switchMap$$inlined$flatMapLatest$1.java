package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {189, 189}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1<R, T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(Function2 r2, Continuation r3) {
        this.$transform = r2;
        super(3, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object r2, Object r3, Continuation<? super Unit> r4) {
        return invoke((FlowCollector) r2, r3, r4);
    }

    public final Object invoke(FlowCollector<? super R> r3, T r4, Continuation<? super Unit> r5) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 r0 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.$transform, r5);
        r0.L$0 = r3;
        r0.L$1 = r4;
        return r0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L8;
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure($result);
    L17:
        return Unit.INSTANCE;
    L7:
        FlowCollector r2 = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure($result);
        FlowCollector r3 = r2;
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1<R, T> r4 = this;
    L12:
        r4.L$0 = null;
        r4.label = 2;
        if (FlowKt.emitAll(r3, (Flow) $result, r4) != r0) goto L17;
        return r0;
    L8:
        ResultKt.throwOnFailure($result);
        FlowCollector $this$transformLatest = (FlowCollector) this.L$0;
        Object it = this.L$1;
        Function2 r5 = this.$transform;
        this.L$0 = $this$transformLatest;
        this.label = 1;
        Object it2 = r5.invoke(it, this);
        if (it2 != r0) goto L11;
        return r0;
    L11:
        $result = it2;
        r3 = $this$transformLatest;
        r4 = this;
        goto L12
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
