package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.IntOffset;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", i = {0}, l = {141, 148}, m = "invokeSuspend", n = {"finalSpec"}, s = {"L$0"})
final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation r2, FiniteAnimationSpec<IntOffset> r3, long r4, Continuation<? super LazyLayoutItemAnimation$animatePlacementDelta$1> r6) {
        this.this$0 = r2;
        this.$spec = r3;
        this.$totalDelta = r4;
        super(2, r6);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, r8);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L13;
            case 1: goto L10;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L8
    L32:
        LazyLayoutItemAnimation.access$setPlacementAnimationInProgress(this.this$0, false);     // Catch: CancellationException -> L8
        LazyLayoutItemAnimation.access$setRunningMovingAwayAnimation$p(this.this$0, false);     // Catch: CancellationException -> L8
        goto L34
    L10:
        FiniteAnimationSpec<IntOffset> r1 = (FiniteAnimationSpec) this.L$0;
        ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L8
    L28:
        LazyLayoutItemAnimation.access$getOnLayerPropertyChanged$p(this.this$0).invoke();     // Catch: CancellationException -> L8
    L29:
        final long animationTarget = IntOffset.m7104minusqkQi6aY(((IntOffset) LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(this.this$0).getValue()).m7110unboximpl(), this.$totalDelta);     // Catch: CancellationException -> L8
        final LazyLayoutItemAnimation r8 = this.this$0;     // Catch: CancellationException -> L8
        this.L$0 = null;     // Catch: CancellationException -> L8
        this.label = 2;     // Catch: CancellationException -> L8
        if (Animatable.animateTo$default(LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(this.this$0), IntOffset.m7092boximpl(animationTarget), r1, null, new AnonymousClass1(r8, animationTarget), this, 4, null) != r0) goto L32;
        return r0;
    L13:
        ResultKt.throwOnFailure($result);
        boolean r2 = LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(this.this$0).isRunning();     // Catch: CancellationException -> L8
        SpringSpec r3 = this.$spec;
        if (r2 == true) goto L18;
    L23:
        r1 = r3;
        if (LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(this.this$0).isRunning() == true) goto L29;
        this.L$0 = r1;     // Catch: CancellationException -> L8
        this.label = 1;     // Catch: CancellationException -> L8
        if (LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(this.this$0).snapTo(IntOffset.m7092boximpl(this.$totalDelta), this) != r0) goto L28;
        return r0;
    L18:
        if ((r3 instanceof SpringSpec) == false) goto L20;
        SpringSpec r4 = (SpringSpec) this.$spec;     // Catch: CancellationException -> L8
    L21:
        r3 = r4;     // Catch: CancellationException -> L8
        goto L23
    L20:
        r4 = LazyLayoutItemAnimationKt.access$getInterruptionSpec$p();     // Catch: CancellationException -> L8
        goto L21
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L34:
        return Unit.INSTANCE;
    }
}
