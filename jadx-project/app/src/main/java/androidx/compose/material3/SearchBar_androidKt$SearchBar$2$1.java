package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: SearchBar.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u008a@"}, d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_PROGRESS, "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1", f = "SearchBar.android.kt", i = {}, l = {ComposerKt.compositionLocalMapKey}, m = "invokeSuspend", n = {}, s = {})
final class SearchBar_androidKt$SearchBar$2$1 extends SuspendLambda implements Function2<Flow<BackEventCompat>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<BackEventCompat> $currentBackEvent;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<BackEventCompat> $firstBackEvent;
    final /* synthetic */ MutatorMutex $mutatorMutex;
    final /* synthetic */ Function1<Boolean, Unit> $onExpandedChange;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SearchBar.android.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1", f = "SearchBar.android.kt", i = {}, l = {205, 216}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
        final /* synthetic */ MutableState<BackEventCompat> $currentBackEvent;
        final /* synthetic */ MutableFloatState $finalBackProgress;
        final /* synthetic */ MutableState<BackEventCompat> $firstBackEvent;
        final /* synthetic */ Function1<Boolean, Unit> $onExpandedChange;
        final /* synthetic */ Flow<BackEventCompat> $progress;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(MutableFloatState r2, Flow<BackEventCompat> r3, Animatable<Float, AnimationVector1D> r4, Function1<? super Boolean, Unit> r5, MutableState<BackEventCompat> r6, MutableState<BackEventCompat> r7, Continuation<? super AnonymousClass1> r8) {
            this.$finalBackProgress = r2;
            this.$progress = r3;
            this.$animationProgress = r4;
            this.$onExpandedChange = r5;
            this.$firstBackEvent = r6;
            this.$currentBackEvent = r7;
            super(1, r8);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r9) {
            return new AnonymousClass1(this.$finalBackProgress, this.$progress, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, r9);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> r3) {
            return ((AnonymousClass1) create(r3)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L12;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            AnonymousClass1 r0 = this;
            ResultKt.throwOnFailure($result);
        L21:
            r0.$finalBackProgress.setFloatValue(Float.NaN);
            r0.$firstBackEvent.setValue(null);
            r0.$currentBackEvent.setValue(null);
        L23:
            return Unit.INSTANCE;
        L7:
            AnonymousClass1 r3 = this;
            ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L10
        L16:
            r3.$finalBackProgress.setFloatValue(r3.$animationProgress.getValue().floatValue());     // Catch: CancellationException -> L10
            r3.$onExpandedChange.invoke(Boxing.boxBoolean(false));     // Catch: CancellationException -> L10
        L12:
            ResultKt.throwOnFailure($result);
            r3 = this;
            r3.$finalBackProgress.setFloatValue(Float.NaN);     // Catch: CancellationException -> L10
            Flow<BackEventCompat> r2 = r3.$progress;     // Catch: CancellationException -> L10
            final MutableState<BackEventCompat> r5 = r3.$firstBackEvent;     // Catch: CancellationException -> L10
            final MutableState<BackEventCompat> r6 = r3.$currentBackEvent;     // Catch: CancellationException -> L10
            final Animatable<Float, AnimationVector1D> r7 = r3.$animationProgress;     // Catch: CancellationException -> L10
            r3.label = 1;     // Catch: CancellationException -> L10
            if (r2.collect(new C01111(r5, r6, r7), r3) != r1) goto L16;
            return r1;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L11:
            r0 = r3;
            r0.label = 2;
            if (Animatable.animateTo$default(r0.$animationProgress, Boxing.boxFloat(1.0f), SearchBar_androidKt.access$getAnimationPredictiveBackExitFloatSpec$p(), null, null, r0, 12, null) != r1) goto L21;
            return r1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    SearchBar_androidKt$SearchBar$2$1(MutatorMutex r2, MutableFloatState r3, Animatable<Float, AnimationVector1D> r4, Function1<? super Boolean, Unit> r5, MutableState<BackEventCompat> r6, MutableState<BackEventCompat> r7, Continuation<? super SearchBar_androidKt$SearchBar$2$1> r8) {
        this.$mutatorMutex = r2;
        this.$finalBackProgress = r3;
        this.$animationProgress = r4;
        this.$onExpandedChange = r5;
        this.$firstBackEvent = r6;
        this.$currentBackEvent = r7;
        super(2, r8);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r9, Continuation<?> r10) {
        SearchBar_androidKt$SearchBar$2$1 r0 = new SearchBar_androidKt$SearchBar$2$1(this.$mutatorMutex, this.$finalBackProgress, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, r10);
        r0.L$0 = r9;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Flow<BackEventCompat> r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Flow<BackEventCompat> r3, Continuation<? super Unit> r4) {
        return ((SearchBar_androidKt$SearchBar$2$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
    L12:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        Flow progress = (Flow) this.L$0;
        this.label = 1;
        if (MutatorMutex.mutate$default(this.$mutatorMutex, null, new AnonymousClass1(this.$finalBackProgress, progress, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, null), this, 1, null) != r0) goto L12;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
