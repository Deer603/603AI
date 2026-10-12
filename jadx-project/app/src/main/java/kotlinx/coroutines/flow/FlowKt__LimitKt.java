package kotlinx.coroutines.flow;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aS\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000323\b\u0004\u0010\u0004\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0080H¢\u0006\u0002\u0010\f\u001a$\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f\u001aE\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\u0010\u0011\u001a0\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00132\u0006\u0010\b\u001a\u0002H\u00022\u0006\u0010\u0014\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a$\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f\u001aE\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\u0010\u0011\u001am\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u00020\u00032D\b\u0001\u0010\u001b\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u0013\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c¢\u0006\u0002\b\u001d¢\u0006\u0002\u0010\u001e¨\u0006\u001f"}, d2 = {"collectWhile", "", "T", "Lkotlinx/coroutines/flow/Flow;", "predicate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "value", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drop", "count", "", "dropWhile", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "emitAbort", "Lkotlinx/coroutines/flow/FlowCollector;", "ownershipMarker", "emitAbort$FlowKt__LimitKt", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "take", "takeWhile", "transformWhile", "R", "transform", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1, reason: invalid class name */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {133}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt.collectWhile(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {149}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    static final class C07591<R> extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T> $this_transformWhile;
        final /* synthetic */ Function3<FlowCollector<? super R>, T, Continuation<? super Boolean>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07591(Flow<? extends T> r2, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> r3, Continuation<? super C07591> r4) {
            this.$this_transformWhile = r2;
            this.$transform = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07591 r0 = new C07591(this.$this_transformWhile, this.$transform, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((FlowCollector) r2, r3);
        }

        public final Object invoke(FlowCollector<? super R> r3, Continuation<? super Unit> r4) {
            return ((C07591) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 collector$iv = (FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) this.L$0;
            ResultKt.throwOnFailure($result);     // Catch: AbortFlowException -> L9
        L21:
            return Unit.INSTANCE;
        L9:
            e$iv = e;
        L19:
            FlowExceptions_commonKt.checkOwnership(e$iv, collector$iv);
            goto L21
        L11:
            ResultKt.throwOnFailure($result);
            FlowCollector $this$flow = (FlowCollector) this.L$0;
            Flow $this$collectWhile$iv = this.$this_transformWhile;
            FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 collector$iv2 = new FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(this.$transform, $this$flow);
            this.L$0 = collector$iv2;     // Catch: AbortFlowException -> L17
            this.label = 1;     // Catch: AbortFlowException -> L17
            if ($this$collectWhile$iv.collect(collector$iv2, this) != r0) goto L21;
            return r0;
        L17:
            e$iv = e;
            collector$iv = collector$iv2;
            goto L19
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ Object access$emitAbort$FlowKt__LimitKt(FlowCollector $receiver, Object value, Object ownershipMarker, Continuation $completion) {
        return emitAbort$FlowKt__LimitKt($receiver, value, ownershipMarker, $completion);
    }

    public static final <T> Flow<T> drop(final Flow<? extends T> r3, final int count) {
        if (count < 0) goto L4;
        boolean r0 = true;
    L5:
        if (r0 == false) goto L9;
        return new FlowKt__LimitKt$drop$$inlined$unsafeFlow$1(r3, count);
    L9:
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + count).toString());
    L4:
        r0 = false;
        goto L5
    }

    public static final <T> Flow<T> dropWhile(final Flow<? extends T> r2, final Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> r3) {
        return new FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(r2, r3);
    }

    public static final <T> Flow<T> take(Flow<? extends T> r3, int count) {
        if (count <= 0) goto L4;
        boolean r0 = true;
    L5:
        if (r0 == false) goto L9;
        return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(r3, count);
    L9:
        throw new IllegalArgumentException(("Requested element count " + count + " should be positive").toString());
    L4:
        r0 = false;
        goto L5
    }

    private static final <T> Object emitAbort$FlowKt__LimitKt(FlowCollector<? super T> r3, T r4, Object ownershipMarker, Continuation<? super Unit> r6) {
        if ((r6 instanceof FlowKt__LimitKt$emitAbort$1) == false) goto L7;
        FlowKt__LimitKt$emitAbort$1 r0 = (FlowKt__LimitKt$emitAbort$1) r6;
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
        Object ownershipMarker2 = r0.L$0;
        ResultKt.throwOnFailure($result);
    L18:
        throw new AbortFlowException(ownershipMarker2);
    L13:
        ResultKt.throwOnFailure($result);
        r0.L$0 = ownershipMarker;
        r0.label = 1;
        if (r3.emit(r4, r0) != r1) goto L16;
        return r1;
    L16:
        ownershipMarker2 = ownershipMarker;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new FlowKt__LimitKt$emitAbort$1(r6);
        goto L8
    }

    public static final <T> Flow<T> takeWhile(Flow<? extends T> r2, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> r3) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(r2, r3);
    }

    public static final <T, R> Flow<R> transformWhile(Flow<? extends T> r2, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> r3) {
        return FlowKt.flow(new C07591(r2, r3, null));
    }

    public static final <T> Object collectWhile(Flow<? extends T> r5, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> r6, Continuation<? super Unit> r7) {
        if ((r7 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r7;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        FlowCollector<? super Object> collector = (FlowKt__LimitKt$collectWhile$collector$1) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: AbortFlowException -> L15
    L27:
        return Unit.INSTANCE;
    L15:
        e = e;
    L25:
        FlowExceptions_commonKt.checkOwnership(e, collector);
        goto L27
    L17:
        ResultKt.throwOnFailure($result);
        FlowCollector<? super Object> collector2 = new FlowKt__LimitKt$collectWhile$collector$1(r6);
        r0.L$0 = collector2;     // Catch: AbortFlowException -> L23
        r0.label = 1;     // Catch: AbortFlowException -> L23
        if (r5.collect(collector2, r0) != r1) goto L27;
        return r1;
    L23:
        e = e;
        collector = collector2;
        goto L25
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r7);
        goto L8
    }

    private static final <T> Object collectWhile$$forInline(Flow<? extends T> r3, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> r4, Continuation<? super Unit> r5) {
        FlowKt__LimitKt$collectWhile$collector$1 collector = new FlowKt__LimitKt$collectWhile$collector$1(r4);
        r3.collect(collector, r5);     // Catch: AbortFlowException -> L5
    L8:
        return Unit.INSTANCE;
    L5:
        e = move-exception;
        FlowExceptions_commonKt.checkOwnership(e, collector);
        goto L8
    }
}
