package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.internal.ElevationKt;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", i = {}, l = {989, 998}, m = "invokeSuspend", n = {}, s = {})
final class ButtonElevation$animateElevation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ ButtonElevation this$0;

    ButtonElevation$animateElevation$2$1(Animatable<Dp, AnimationVector1D> r2, float r3, boolean r4, ButtonElevation r5, Interaction r6, Continuation<? super ButtonElevation$animateElevation$2$1> r7) {
        this.$animatable = r2;
        this.$target = r3;
        this.$enabled = r4;
        this.this$0 = r5;
        this.$interaction = r6;
        super(2, r7);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
        return new ButtonElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, r9);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((ButtonElevation$animateElevation$2$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        ButtonElevation$animateElevation$2$1 r1 = this;
        ResultKt.throwOnFailure($result);
    L33:
        return Unit.INSTANCE;
    L7:
        ButtonElevation$animateElevation$2$1 r2 = this;
        ResultKt.throwOnFailure($result);
        goto L33
    L8:
        ResultKt.throwOnFailure($result);
        if (Dp.m6978equalsimpl0(this.$animatable.getTargetValue().m6987unboximpl(), this.$target) == true) goto L33;
        boolean r3 = this.$enabled;
        Animatable<Dp, AnimationVector1D> r4 = this.$animatable;
        if (r3 == true) goto L17;
        this.label = 1;
        if (r4.snapTo(Dp.m6971boximpl(this.$target), this) != r0) goto L15;
        return r0;
    L15:
        r2 = this;
        goto L33
    L17:
        float r5 = r4.getTargetValue().m6987unboximpl();
        FocusInteraction.Focus r6 = null;
        if (Dp.m6978equalsimpl0(r5, ButtonElevation.access$getPressedElevation$p(this.this$0)) == false) goto L21;
        r6 = new PressInteraction.Press(Offset.Companion.m4141getZeroF1C5BW0(), null);
    L27:
        this.label = 2;
        if (ElevationKt.m3027animateElevationrAjV9yQ(this.$animatable, this.$target, r6, this.$interaction, this) != r0) goto L30;
        return r0;
    L30:
        r1 = this;
        goto L33
    L21:
        if (Dp.m6978equalsimpl0(r5, ButtonElevation.access$getHoveredElevation$p(this.this$0)) == false) goto L24;
        r6 = new HoverInteraction.Enter();
        goto L27
    L24:
        if (Dp.m6978equalsimpl0(r5, ButtonElevation.access$getFocusedElevation$p(this.this$0)) == false) goto L27;
        r6 = new FocusInteraction.Focus();
        goto L27
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
