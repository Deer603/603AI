package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
final class SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ SizeAnimationModifierNode.AnimData $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifierNode this$0;

    SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.AnimData r2, long r3, SizeAnimationModifierNode r5, Continuation<? super SizeAnimationModifierNode$animateTo$data$1$1> r6) {
        this.$this_apply = r2;
        this.$targetSize = r3;
        this.this$0 = r5;
        super(2, r6);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, r8);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        AnimationResult result = (AnimationResult) $result;
        if (result.getEndReason() != AnimationEndReason.Finished) goto L17;
        Function2<IntSize, IntSize, Unit> r1 = this.this$0.getListener();
        if (r1 == 0) goto L17;
        r1.invoke(IntSize.m7136boximpl(this.$this_apply.m119getStartSizeYbymL2g()), result.getEndState().getValue());
    L17:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        this.label = 1;
        Object r2 = Animatable.animateTo$default(this.$this_apply.getAnim(), IntSize.m7136boximpl(this.$targetSize), this.this$0.getAnimationSpec(), null, null, this, 12, null);
        if (r2 != r0) goto L10;
        return r0;
    L10:
        $result = r2;
        goto L11
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
