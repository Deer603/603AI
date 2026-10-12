package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$2$1", f = "Button.kt", i = {}, l = {554, 563}, m = "invokeSuspend", n = {}, s = {})
final class DefaultButtonElevation$elevation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ DefaultButtonElevation this$0;

    DefaultButtonElevation$elevation$2$1(Animatable<Dp, AnimationVector1D> r2, float r3, boolean r4, DefaultButtonElevation r5, Interaction r6, Continuation<? super DefaultButtonElevation$elevation$2$1> r7) {
        this.$animatable = r2;
        this.$target = r3;
        this.$enabled = r4;
        this.this$0 = r5;
        this.$interaction = r6;
        super(2, r7);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
        return new DefaultButtonElevation$elevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, r9);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((DefaultButtonElevation$elevation$2$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
    L31:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        goto L31
    L8:
        ResultKt.throwOnFailure($result);
        if (Dp.m6978equalsimpl0(this.$animatable.getTargetValue().m6987unboximpl(), this.$target) == true) goto L31;
        boolean r1 = this.$enabled;
        Animatable<Dp, AnimationVector1D> r2 = this.$animatable;
        if (r1 == true) goto L16;
        this.label = 1;
        if (r2.snapTo(Dp.m6971boximpl(this.$target), this) != r0) goto L31;
        return r0;
    L16:
        float r3 = r2.getTargetValue().m6987unboximpl();
        FocusInteraction.Focus r4 = null;
        if (Dp.m6978equalsimpl0(r3, DefaultButtonElevation.access$getPressedElevation$p(this.this$0)) == false) goto L20;
        r4 = new PressInteraction.Press(Offset.Companion.m4141getZeroF1C5BW0(), null);
    L26:
        this.label = 2;
        if (ElevationKt.m1662animateElevationrAjV9yQ(this.$animatable, this.$target, r4, this.$interaction, this) != r0) goto L31;
        return r0;
    L20:
        if (Dp.m6978equalsimpl0(r3, DefaultButtonElevation.access$getHoveredElevation$p(this.this$0)) == false) goto L23;
        r4 = new HoverInteraction.Enter();
        goto L26
    L23:
        if (Dp.m6978equalsimpl0(r3, DefaultButtonElevation.access$getFocusedElevation$p(this.this$0)) == false) goto L26;
        r4 = new FocusInteraction.Focus();
        goto L26
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
