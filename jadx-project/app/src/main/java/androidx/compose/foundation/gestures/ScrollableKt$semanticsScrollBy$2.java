package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", i = {}, l = {1024}, m = "invokeSuspend", n = {}, s = {})
final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref.FloatRef $previousValue;
    final /* synthetic */ ScrollingLogic $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    ScrollableKt$semanticsScrollBy$2(ScrollingLogic r2, long r3, Ref.FloatRef r5, Continuation<? super ScrollableKt$semanticsScrollBy$2> r6) {
        this.$this_semanticsScrollBy = r2;
        this.$offset = r3;
        this.$previousValue = r5;
        super(2, r6);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
        ScrollableKt$semanticsScrollBy$2 r0 = new ScrollableKt$semanticsScrollBy$2(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, r8);
        r0.L$0 = r7;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(NestedScrollScope r3, Continuation<? super Unit> r4) {
        return ((ScrollableKt$semanticsScrollBy$2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(NestedScrollScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure($result);
    L11:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        final NestedScrollScope $this$scroll = (NestedScrollScope) this.L$0;
        float r6 = this.$this_semanticsScrollBy.m514toFloatk4lQ0M(this.$offset);
        final Ref.FloatRef r3 = this.$previousValue;
        final ScrollingLogic r4 = this.$this_semanticsScrollBy;
        this.label = 1;
        if (SuspendAnimationKt.animate$default(0.0f, r6, 0.0f, null, new AnonymousClass1(r3, r4, $this$scroll), this, 12, null) != r0) goto L11;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
