package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
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

/* JADX INFO: compiled from: SearchBar.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$1$1", f = "SearchBar.android.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
final class SearchBar_androidKt$SearchBar$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<BackEventCompat> $currentBackEvent;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<BackEventCompat> $firstBackEvent;
    int label;

    SearchBar_androidKt$SearchBar$1$1(Animatable<Float, AnimationVector1D> r2, boolean r3, MutableFloatState r4, MutableState<BackEventCompat> r5, MutableState<BackEventCompat> r6, Continuation<? super SearchBar_androidKt$SearchBar$1$1> r7) {
        this.$animationProgress = r2;
        this.$expanded = r3;
        this.$finalBackProgress = r4;
        this.$firstBackEvent = r5;
        this.$currentBackEvent = r6;
        super(2, r7);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
        return new SearchBar_androidKt$SearchBar$1$1(this.$animationProgress, this.$expanded, this.$finalBackProgress, this.$firstBackEvent, this.$currentBackEvent, r9);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((SearchBar_androidKt$SearchBar$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        SearchBar_androidKt$SearchBar$1$1 r1 = this;
        Object $result2 = $result;
        ResultKt.throwOnFailure($result2);
    L30:
        SearchBar_androidKt$SearchBar$1$1 r2 = r1;
    L32:
        if (r2.$expanded == true) goto L35;
        r2.$finalBackProgress.setFloatValue(Float.NaN);
        r2.$firstBackEvent.setValue(null);
        r2.$currentBackEvent.setValue(null);
    L35:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        r2 = this;
        float targetValue = 0.0f;
        boolean r7 = false;
        if (r2.$animationProgress.getValue().floatValue() > 0.0f) goto L10;
    L12:
        boolean animationInProgress = false;
    L13:
        if (animationInProgress == false) goto L15;
        FiniteAnimationSpec animationSpec = SearchBar_androidKt.access$getAnimationPredictiveBackExitFloatSpec$p();
    L20:
        if (r2.$expanded == false) goto L23;
        targetValue = 1.0f;
    L23:
        if (r2.$animationProgress.getValue().floatValue() != targetValue) goto L25;
        r7 = true;
    L25:
        if (r7 == true) goto L32;
        r2.label = 1;
        if (Animatable.animateTo$default(r2.$animationProgress, Boxing.boxFloat(targetValue), animationSpec, null, null, r2, 12, null) != r0) goto L29;
        return r0;
    L29:
        r1 = r2;
        $result2 = $result;
        goto L30
    L15:
        boolean animationInProgress2 = r2.$expanded;
        if (animationInProgress2 == false) goto L18;
        animationSpec = SearchBar_androidKt.access$getAnimationEnterFloatSpec$p();
        goto L20
    L18:
        animationSpec = SearchBar_androidKt.access$getAnimationExitFloatSpec$p();
        goto L20
    L10:
        if (r2.$animationProgress.getValue().floatValue() >= 1.0f) goto L12;
        animationInProgress = true;
        goto L13
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
