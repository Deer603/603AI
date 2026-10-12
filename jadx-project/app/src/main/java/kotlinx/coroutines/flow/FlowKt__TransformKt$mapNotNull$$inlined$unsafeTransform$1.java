package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 9, 0}, xi = 176)
public final class FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1<R> implements Flow<R> {
    final /* synthetic */ Flow $this_unsafeTransform$inlined;
    final /* synthetic */ Function2 $transform$inlined$1;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Emitters.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $this_unsafeFlow;
        final /* synthetic */ Function2 $transform$inlined;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {219, 220}, m = "emit", n = {"$this$mapNotNull_u24lambda_u246"}, s = {"L$0"})
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ AnonymousClass2 this$0;

            public AnonymousClass1(AnonymousClass2 r1, Continuation r2) {
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

        public AnonymousClass2(FlowCollector r1, Function2 r2) {
            this.$this_unsafeFlow = r1;
            this.$transform$inlined = r2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T r8, Continuation<? super Unit> r9) {
            if ((r9 instanceof AnonymousClass1) == false) goto L7;
            AnonymousClass1 r0 = (AnonymousClass1) r9;
            if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
            r0.label -= Integer.MIN_VALUE;
        L8:
            Object r10 = r0.result;
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(r0.label) {
                case 0: goto L14;
                case 1: goto L13;
                case 2: goto L12;
                default: goto L11;
            };
        L12:
            ResultKt.throwOnFailure(r10);
        L26:
            return Unit.INSTANCE;
        L13:
            FlowCollector r2 = (FlowCollector) r0.L$0;
            ResultKt.throwOnFailure(r10);
            int r4 = 0;
            Object r11 = r10;
            FlowCollector r3 = r2;
        L18:
            if (r11 == null) goto L26;
            r0.L$0 = null;
            r0.label = 2;
            if (r3.emit(r11, r0) != r1) goto L26;
            return r1;
        L14:
            ResultKt.throwOnFailure(r10);
            FlowCollector r5 = this.$this_unsafeFlow;
            r4 = 0;
            Function2 r6 = this.$transform$inlined;
            r0.L$0 = r5;
            r0.label = 1;
            r11 = r6.invoke(r8, r0);
            if (r11 != r1) goto L17;
            return r1;
        L17:
            r3 = r5;
            goto L18
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L7:
            r0 = new AnonymousClass1(this, r9);
            goto L8
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object emit$$forInline(Object value, Continuation $completion) {
            new AnonymousClass1(this, $completion);
            FlowCollector r0 = this.$this_unsafeFlow;
            Object transformed = this.$transform$inlined.invoke(value, $completion);
            if (transformed == null) goto L6;
            r0.emit(transformed, $completion);
        L6:
            return Unit.INSTANCE;
        }
    }

    public FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(Flow r1, Function2 r2) {
        this.$this_unsafeTransform$inlined = r1;
        this.$transform$inlined$1 = r2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector collector, Continuation $completion) {
        Object r3 = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(collector, this.$transform$inlined$1), $completion);
        if (r3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r3;
    L6:
        return Unit.INSTANCE;
    }

    public Object collect$$forInline(FlowCollector collector, final Continuation $completion) {
        new AnonymousClass1(this, $completion);
        this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(collector, this.$transform$inlined$1), $completion);
        return Unit.INSTANCE;
    }
}
