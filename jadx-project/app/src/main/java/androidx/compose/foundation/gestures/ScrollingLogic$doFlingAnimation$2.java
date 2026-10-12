package androidx.compose.foundation.gestures;

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
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {814}, m = "invokeSuspend", n = {}, s = {})
final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref.LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    ScrollingLogic$doFlingAnimation$2(ScrollingLogic r2, Ref.LongRef r3, long r4, Continuation<? super ScrollingLogic$doFlingAnimation$2> r6) {
        this.this$0 = r2;
        this.$result = r3;
        this.$available = r4;
        super(2, r6);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
        ScrollingLogic$doFlingAnimation$2 r0 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, r8);
        r0.L$0 = r7;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(NestedScrollScope r3, Continuation<? super Unit> r4) {
        return ((ScrollingLogic$doFlingAnimation$2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        long r2 = this.J$0;
        Ref.LongRef r4 = (Ref.LongRef) this.L$2;
        ScrollingLogic r5 = (ScrollingLogic) this.L$1;
        ScrollingLogic r6 = (ScrollingLogic) this.L$0;
        ResultKt.throwOnFailure($result);
    L11:
        r4.element = ScrollingLogic.m503access$updateQWom1Mo(r5, r2, r6.reverseIfNeeded(((Number) $result).floatValue()));
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
        final ScrollingLogic r3 = this.this$0;
        ScrollScope r7 = new ScrollingLogic$doFlingAnimation$2$reverseScope$1(r3, nestedScrollScope);
        r5 = this.this$0;
        r4 = this.$result;
        long r8 = this.$available;
        FlingBehavior $this$invokeSuspend_u24lambda_u241_u24lambda_u240 = ScrollingLogic.access$getFlingBehavior$p(r5);
        long r9 = r4.element;
        float r10 = r5.reverseIfNeeded(ScrollingLogic.m502access$toFloatTH1AsA0(r5, r8));
        this.L$0 = r5;
        this.L$1 = r5;
        this.L$2 = r4;
        this.J$0 = r9;
        this.label = 1;
        Object r11 = $this$invokeSuspend_u24lambda_u241_u24lambda_u240.performFling(r7, r10, this);
        if (r11 != r0) goto L10;
        return r0;
    L10:
        $result = r11;
        r6 = r5;
        r2 = r9;
        goto L11
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
