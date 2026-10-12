package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.material3.internal.ElevationKt;
import androidx.compose.runtime.MutableState;
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

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", f = "Chip.kt", i = {}, l = {2380, 2382}, m = "invokeSuspend", n = {}, s = {})
final class SelectableChipElevation$animateElevation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ MutableState<Interaction> $lastInteraction$delegate;
    final /* synthetic */ float $target;
    int label;

    SelectableChipElevation$animateElevation$2$1(Animatable<Dp, AnimationVector1D> r2, float r3, boolean r4, Interaction r5, MutableState<Interaction> r6, Continuation<? super SelectableChipElevation$animateElevation$2$1> r7) {
        this.$animatable = r2;
        this.$target = r3;
        this.$enabled = r4;
        this.$interaction = r5;
        this.$lastInteraction$delegate = r6;
        super(2, r7);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
        return new SelectableChipElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.$interaction, this.$lastInteraction$delegate, r9);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((SelectableChipElevation$animateElevation$2$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        SelectableChipElevation$animateElevation$2$1 r1 = this;
        ResultKt.throwOnFailure($result);
    L21:
        SelectableChipElevation$animateElevation$2$1 r2 = r1;
    L22:
        SelectableChipElevation.access$animateElevation$lambda$3(r2.$lastInteraction$delegate, r2.$interaction);
    L24:
        return Unit.INSTANCE;
    L7:
        SelectableChipElevation$animateElevation$2$1 r3 = this;
        ResultKt.throwOnFailure($result);
    L16:
        r2 = r3;
        goto L22
    L8:
        ResultKt.throwOnFailure($result);
        if (Dp.m6978equalsimpl0(this.$animatable.getTargetValue().m6987unboximpl(), this.$target) == true) goto L24;
        if (this.$enabled == true) goto L17;
        this.label = 1;
        if (this.$animatable.snapTo(Dp.m6971boximpl(this.$target), this) != r0) goto L15;
        return r0;
    L15:
        r3 = this;
        goto L16
    L17:
        Interaction r4 = SelectableChipElevation.access$animateElevation$lambda$2(this.$lastInteraction$delegate);
        this.label = 2;
        if (ElevationKt.m3027animateElevationrAjV9yQ(this.$animatable, this.$target, r4, this.$interaction, this) != r0) goto L20;
        return r0;
    L20:
        r1 = this;
        goto L21
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
