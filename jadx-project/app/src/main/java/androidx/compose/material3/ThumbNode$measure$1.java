package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.DurationBasedAnimationSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ThumbNode$measure$1", f = "Switch.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
final class ThumbNode$measure$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $size;
    int label;
    final /* synthetic */ ThumbNode this$0;

    ThumbNode$measure$1(ThumbNode r2, float r3, Continuation<? super ThumbNode$measure$1> r4) {
        this.this$0 = r2;
        this.$size = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new ThumbNode$measure$1(this.this$0, this.$size, r5);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((ThumbNode$measure$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
    L17:
        AnimationResult r12 = (AnimationResult) $result;
    L19:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        Animatable r3 = ThumbNode.access$getSizeAnim$p(this.this$0);
        if (r3 == null) goto L19;
        Float r4 = Boxing.boxFloat(this.$size);
        if (ThumbNode.access$isPressed$p(this.this$0) == false) goto L12;
        DurationBasedAnimationSpec r2 = SwitchKt.access$getSnapSpec$p();
    L13:
        this.label = 1;
        Object r5 = Animatable.animateTo$default(r3, r4, r2, null, null, this, 12, null);
        if (r5 != r0) goto L16;
        return r0;
    L16:
        $result = r5;
        goto L17
    L12:
        r2 = SwitchKt.access$getAnimationSpec$p();
        goto L13
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
