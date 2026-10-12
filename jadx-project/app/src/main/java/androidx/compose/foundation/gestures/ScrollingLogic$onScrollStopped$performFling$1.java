package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {748, 751, 754}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic r2, Continuation<? super ScrollingLogic$onScrollStopped$performFling$1> r3) {
        this.this$0 = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        ScrollingLogic$onScrollStopped$performFling$1 r0 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, r5);
        r0.J$0 = ((Velocity) r4).m7220unboximpl();
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity r4, Continuation<? super Velocity> r5) {
        return m517invokesFctU(r4.m7220unboximpl(), r5);
    }

    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m517invokesFctU(long r3, Continuation<? super Velocity> r5) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(Velocity.m7202boximpl(r3), r5)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L9;
            case 1: goto L8;
            case 2: goto L7;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        Object $result2 = $result;
        long velocityLeft = this.J$1;
        long velocity = this.J$0;
        ResultKt.throwOnFailure($result2);
        long velocityLeft2 = velocityLeft;
    L21:
        long consumedPost = ((Velocity) $result2).m7220unboximpl();
        long totalLeft = Velocity.m7214minusAH228Gc(velocityLeft2, consumedPost);
        return Velocity.m7202boximpl(Velocity.m7214minusAH228Gc(velocity, totalLeft));
    L7:
        long available = this.J$1;
        long velocity2 = this.J$0;
        ResultKt.throwOnFailure($result);
        long available2 = available;
        velocity = velocity2;
        Object $result3 = $result;
    L17:
        velocityLeft2 = ((Velocity) $result3).m7220unboximpl();
        this.J$0 = velocity;
        this.J$1 = velocityLeft2;
        this.label = 3;
        Object r3 = ScrollingLogic.access$getNestedScrollDispatcher$p(this.this$0).m5463dispatchPostFlingRZ2iAVY(Velocity.m7214minusAH228Gc(available2, velocityLeft2), velocityLeft2, this);
        if (r3 != r1) goto L20;
        return r1;
    L20:
        $result2 = r3;
        goto L21
    L8:
        Object $result4 = $result;
        long velocity3 = this.J$0;
        ResultKt.throwOnFailure($result4);
        velocity = velocity3;
        Object $result5 = $result4;
    L13:
        long preConsumedByParent = ((Velocity) $result4).m7220unboximpl();
        available2 = Velocity.m7214minusAH228Gc(velocity, preConsumedByParent);
        this.J$0 = velocity;
        this.J$1 = available2;
        this.label = 2;
        Object r2 = this.this$0.m509doFlingAnimationQWom1Mo(available2, this);
        if (r2 != r1) goto L16;
        return r1;
    L16:
        $result3 = r2;
        goto L17
    L9:
        ResultKt.throwOnFailure($result);
        long velocity4 = this.J$0;
        this.J$0 = velocity4;
        this.label = 1;
        Object r5 = ScrollingLogic.access$getNestedScrollDispatcher$p(this.this$0).m5465dispatchPreFlingQWom1Mo(velocity4, this);
        if (r5 != r1) goto L12;
        return r1;
    L12:
        $result5 = $result;
        $result4 = r5;
        velocity = velocity4;
        goto L13
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
