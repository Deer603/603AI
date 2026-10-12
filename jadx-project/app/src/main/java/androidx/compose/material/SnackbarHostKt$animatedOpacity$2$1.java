package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
final class SnackbarHostKt$animatedOpacity$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $alpha;
    final /* synthetic */ AnimationSpec<Float> $animation;
    final /* synthetic */ Function0<Unit> $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    SnackbarHostKt$animatedOpacity$2$1(Animatable<Float, AnimationVector1D> r2, boolean r3, AnimationSpec<Float> r4, Function0<Unit> r5, Continuation<? super SnackbarHostKt$animatedOpacity$2$1> r6) {
        this.$alpha = r2;
        this.$visible = r3;
        this.$animation = r4;
        this.$onAnimationFinish = r5;
        super(2, r6);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
        return new SnackbarHostKt$animatedOpacity$2$1(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, r8);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((SnackbarHostKt$animatedOpacity$2$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
    L14:
        this.$onAnimationFinish.invoke();
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        Animatable<Float, AnimationVector1D> r1 = this.$alpha;
        if (this.$visible == false) goto L10;
        float r2 = 1.0f;
    L11:
        this.label = 1;
        if (Animatable.animateTo$default(r1, Boxing.boxFloat(r2), this.$animation, null, null, this, 12, null) != r0) goto L14;
        return r0;
    L10:
        r2 = 0.0f;
        goto L11
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
