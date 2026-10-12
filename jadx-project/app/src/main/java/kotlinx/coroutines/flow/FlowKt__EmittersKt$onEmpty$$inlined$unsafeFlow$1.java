package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ Function2 $action$inlined;
    final /* synthetic */ Flow $this_onEmpty$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {113, 121}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u243", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 this$0;

        public AnonymousClass1(FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 r1, Continuation r2) {
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
    public Object collect(FlowCollector<? super T> r10, Continuation<? super Unit> r11) {
        if ((r11 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L18;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        SafeCollector collector = (SafeCollector) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
    L28:
        collector.releaseIntercepted();
    L34:
        return Unit.INSTANCE;
    L15:
        Throwable th = th;
    L31:
        collector.releaseIntercepted();
        throw th;
    L17:
        Ref.BooleanRef isEmpty = (Ref.BooleanRef) r0.L$2;
        FlowCollector<? super T> r3 = (FlowCollector) r0.L$1;
        FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1<T> r4 = (FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1) r0.L$0;
        ResultKt.throwOnFailure($result);
    L22:
        if (isEmpty.element == false) goto L34;
        SafeCollector collector2 = new SafeCollector(r3, r0.getContext());
        Function2 r5 = r4.$action$inlined;     // Catch: Throwable -> L29
        r0.L$0 = collector2;     // Catch: Throwable -> L29
        r0.L$1 = null;     // Catch: Throwable -> L29
        r0.L$2 = null;     // Catch: Throwable -> L29
        r0.label = 2;     // Catch: Throwable -> L29
        if (r5.invoke(collector2, r0) != r1) goto L27;
        return r1;
    L27:
        collector = collector2;
    L29:
        th = move-exception;
        th = th;
        collector = collector2;
        goto L31
    L18:
        ResultKt.throwOnFailure($result);
        r4 = this;
        r3 = r10;
        isEmpty = new Ref.BooleanRef();
        isEmpty.element = true;
        Flow r6 = r4.$this_onEmpty$inlined;
        FlowKt__EmittersKt$onEmpty$1$1 r7 = new FlowKt__EmittersKt$onEmpty$1$1(isEmpty, r3);
        r0.L$0 = r4;
        r0.L$1 = r3;
        r0.L$2 = isEmpty;
        r0.label = 1;
        if (r6.collect(r7, r0) != r1) goto L22;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r11);
        goto L8
    }

    public FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(Flow r1, Function2 r2) {
        this.$this_onEmpty$inlined = r1;
        this.$action$inlined = r2;
    }
}
