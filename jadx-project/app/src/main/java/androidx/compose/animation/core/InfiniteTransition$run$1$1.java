package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: InfiniteTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {172, 193}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
final class InfiniteTransition$run$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<State<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Float, Continuation<? super Boolean>, Object> {
        /* synthetic */ float F$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> r2) {
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass3 r0 = new AnonymousClass3(r4);
            r0.F$0 = ((Number) r3).floatValue();
            return r0;
        }

        public final Object invoke(float r3, Continuation<? super Boolean> r4) {
            return ((AnonymousClass3) create(Float.valueOf(r3), r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float r3, Continuation<? super Boolean> r4) {
            return invoke(r3.floatValue(), r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r3);
            float it = this.F$0;
            if (it <= 0.0f) goto L9;
            boolean r1 = true;
        L11:
            return Boxing.boxBoolean(r1);
        L9:
            r1 = false;
            goto L11
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    InfiniteTransition$run$1$1(MutableState<State<Long>> r2, InfiniteTransition r3, Continuation<? super InfiniteTransition$run$1$1> r4) {
        this.$toolingOverride = r2;
        this.this$0 = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        InfiniteTransition$run$1$1 r0 = new InfiniteTransition$run$1$1(this.$toolingOverride, this.this$0, r5);
        r0.L$0 = r4;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((InfiniteTransition$run$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008d -> B:9:0x0044). Please report as a decompilation issue!!! */
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
        Ref.FloatRef durationScale = (Ref.FloatRef) this.L$1;
        CoroutineScope $this$LaunchedEffect = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure($result);
        final Ref.FloatRef durationScale2 = durationScale;
        final CoroutineScope $this$LaunchedEffect2 = $this$LaunchedEffect;
        InfiniteTransition$run$1$1 r4 = this;
    L9:
        final MutableState<State<Long>> r6 = r4.$toolingOverride;
        final InfiniteTransition r7 = r4.this$0;
        r4.L$0 = $this$LaunchedEffect2;
        r4.L$1 = durationScale2;
        r4.label = 1;
        if (InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(new AnonymousClass1(r6, r7, durationScale2, $this$LaunchedEffect2), r4) != r0) goto L13;
        return r0;
    L13:
        if (durationScale2.element != 0.0f) goto L21;
        if (1 == 0) goto L9;
        r4.L$0 = $this$LaunchedEffect2;
        r4.L$1 = durationScale2;
        r4.label = 2;
        if (FlowKt.first(SnapshotStateKt.snapshotFlow(new AnonymousClass2($this$LaunchedEffect2)), new AnonymousClass3(null), r4) != r0) goto L9;
        return r0;
    L21:
        if (0 == 0) goto L9;
        goto L9
    L7:
        Ref.FloatRef durationScale3 = (Ref.FloatRef) this.L$1;
        CoroutineScope $this$LaunchedEffect3 = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure($result);
        durationScale2 = durationScale3;
        $this$LaunchedEffect2 = $this$LaunchedEffect3;
        r4 = this;
        goto L13
    L8:
        ResultKt.throwOnFailure($result);
        $this$LaunchedEffect2 = (CoroutineScope) this.L$0;
        durationScale2 = new Ref.FloatRef();
        durationScale2.element = 1.0f;
        r4 = this;
        goto L9
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
