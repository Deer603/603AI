package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u0002\u001a\u00020\u00032K\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0005\u001aZ\u0010\u000e\u001a\u00020\u00032K\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0005H\u0007¢\u0006\u0002\u0010\u000f\u001a_\u0010\u0010\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001a\u001a\u00020\r*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\n2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a*\u0010\u001f\u001a\u00020\r*\u00020\u00032\u0006\u0010 \u001a\u00020\u00062\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0086@¢\u0006\u0002\u0010!\u001a*\u0010\"\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0086@¢\u0006\u0002\u0010!\u001a\u001f\u0010#\u001a\u00020\r*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u001a\u0010&\u001a\u00020\r*\u00020\u00032\u0006\u0010 \u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010'\u001a\u001c\u0010(\u001a\u00020\r*\u00020\u00032\b\b\u0002\u0010)\u001a\u00020*H\u0086@¢\u0006\u0002\u0010+\u001a\u001a\u0010,\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010'\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"ZeroAnimationVelocity", "Landroidx/compose/foundation/gestures/AnimationData;", "TransformableState", "Landroidx/compose/foundation/gestures/TransformableState;", "onTransformation", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "", "rememberTransformableState", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TransformableState;", "animateBy", "zoomFactor", "panOffset", "rotationDegrees", "zoomAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "panAnimationSpec", "rotationAnimationSpec", "animateBy-Su4bsnU", "(Landroidx/compose/foundation/gestures/TransformableState;FJFLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animatePanBy", "offset", "animationSpec", "animatePanBy-ubNVwUQ", "(Landroidx/compose/foundation/gestures/TransformableState;JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateRotateBy", "degrees", "(Landroidx/compose/foundation/gestures/TransformableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateZoomBy", "panBy", "panBy-d-4ec7I", "(Landroidx/compose/foundation/gestures/TransformableState;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rotateBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopTransformation", "terminationPriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/gestures/TransformableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "zoomBy", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TransformableStateKt {
    private static final AnimationData ZeroAnimationVelocity = null;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2, reason: invalid class name */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $degrees;
        final /* synthetic */ Ref.FloatRef $previous;
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Ref.FloatRef r2, float r3, AnimationSpec<Float> r4, Continuation<? super AnonymousClass2> r5) {
            this.$previous = r2;
            this.$degrees = r3;
            this.$animationSpec = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$previous, this.$degrees, this.$animationSpec, r6);
            r0.L$0 = r5;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(TransformScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(TransformScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
            final TransformScope $this$transform = (TransformScope) this.L$0;
            AnimationState r14 = AnimationStateKt.AnimationState$default(this.$previous.element, 0.0f, 0, 0, false, 30, null);
            Float r15 = Boxing.boxFloat(this.$degrees);
            AnimationSpec<Float> r4 = this.$animationSpec;
            final Ref.FloatRef r6 = this.$previous;
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(r14, r15, r4, false, new AnonymousClass1(r6, $this$transform), this, 4, null) != r1) goto L12;
            return r1;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3, reason: invalid class name */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ Ref.FloatRef $previous;
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Ref.FloatRef r2, float r3, AnimationSpec<Float> r4, Continuation<? super AnonymousClass3> r5) {
            this.$previous = r2;
            this.$zoomFactor = r3;
            this.$animationSpec = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            AnonymousClass3 r0 = new AnonymousClass3(this.$previous, this.$zoomFactor, this.$animationSpec, r6);
            r0.L$0 = r5;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(TransformScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(TransformScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
            final TransformScope $this$transform = (TransformScope) this.L$0;
            AnimationState r14 = AnimationStateKt.AnimationState$default(this.$previous.element, 0.0f, 0, 0, false, 30, null);
            Float r15 = Boxing.boxFloat(this.$zoomFactor);
            AnimationSpec<Float> r4 = this.$animationSpec;
            final Ref.FloatRef r6 = this.$previous;
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(r14, r15, r4, false, new AnonymousClass1(r6, $this$transform), this, 4, null) != r1) goto L12;
            return r1;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C02752 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $degrees;
        private /* synthetic */ Object L$0;
        int label;

        C02752(float r2, Continuation<? super C02752> r3) {
            this.$degrees = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C02752 r0 = new C02752(this.$degrees, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(TransformScope r3, Continuation<? super Unit> r4) {
            return ((C02752) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(TransformScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r6) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r6);
            TransformScope $this$transform = (TransformScope) this.L$0;
            $this$transform.mo412transformByd4ec7I(1.0f, Offset.Companion.m4141getZeroF1C5BW0(), this.$degrees);
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C02762 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        int label;

        C02762(Continuation<? super C02762> r2) {
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C02762(r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(TransformScope r3, Continuation<? super Unit> r4) {
            return ((C02762) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(TransformScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r2) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r2);
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C02772 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        C02772(float r2, Continuation<? super C02772> r3) {
            this.$zoomFactor = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C02772 r0 = new C02772(this.$zoomFactor, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(TransformScope r3, Continuation<? super Unit> r4) {
            return ((C02772) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(TransformScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r6) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r6);
            TransformScope $this$transform = (TransformScope) this.L$0;
            $this$transform.mo412transformByd4ec7I(this.$zoomFactor, Offset.Companion.m4141getZeroF1C5BW0(), 0.0f);
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ AnimationData access$getZeroAnimationVelocity$p() {
        return ZeroAnimationVelocity;
    }

    public static final TransformableState TransformableState(Function3<? super Float, ? super Offset, ? super Float, Unit> r1) {
        return new DefaultTransformableState(r1);
    }

    public static final TransformableState rememberTransformableState(Function3<? super Float, ? super Offset, ? super Float, Unit> r8, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1681419281, "C(rememberTransformableState)123@5672L38,124@5722L80:TransformableState.kt#8bwon0");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1681419281, $changed, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:122)");
    L5:
        final State lambdaState = SnapshotStateKt.rememberUpdatedState(r8, $composer, $changed & 14);
        ComposerKt.sourceInformationMarkerStart($composer, -586901038, "CC(remember):TransformableState.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = TransformableState(new TransformableStateKt$rememberTransformableState$1$1(lambdaState));
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        TransformableState r4 = (TransformableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState r6, float r7, SpringSpec r8, Continuation r9, int r10, Object r11) {
        if ((r10 & 2) == 0) goto L6;
        r8 = new SpringSpec(0.0f, 200.0f, null, 5, null);
    L6:
        return animateZoomBy(r6, r7, r8, r9);
    }

    public static final Object animateZoomBy(TransformableState $this$animateZoomBy, float zoomFactor, AnimationSpec<Float> r11, Continuation<? super Unit> r12) {
        if (zoomFactor <= 0.0f) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
    L9:
        Ref.FloatRef previous = new Ref.FloatRef();
        previous.element = 1.0f;
        Object r9 = TransformableState.transform$default($this$animateZoomBy, null, new AnonymousClass3(previous, zoomFactor, r11, null), r12, 1, null);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L13;
        return r9;
    L13:
        return Unit.INSTANCE;
    L5:
        value$iv = false;
        goto L7
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState r6, float r7, SpringSpec r8, Continuation r9, int r10, Object r11) {
        if ((r10 & 2) == 0) goto L6;
        r8 = new SpringSpec(0.0f, 200.0f, null, 5, null);
    L6:
        return animateRotateBy(r6, r7, r8, r9);
    }

    public static final Object animateRotateBy(TransformableState $this$animateRotateBy, float degrees, AnimationSpec<Float> r11, Continuation<? super Unit> r12) {
        Ref.FloatRef previous = new Ref.FloatRef();
        Object r9 = TransformableState.transform$default($this$animateRotateBy, null, new AnonymousClass2(previous, degrees, r11, null), r12, 1, null);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r9;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m533animatePanByubNVwUQ$default(TransformableState r6, long r7, SpringSpec r9, Continuation r10, int r11, Object r12) {
        if ((r11 & 2) == 0) goto L6;
        r9 = new SpringSpec(0.0f, 200.0f, null, 5, null);
    L6:
        return m532animatePanByubNVwUQ(r6, r7, r9, r10);
    }

    /* JADX INFO: renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m532animatePanByubNVwUQ(TransformableState $this$animatePanBy_u2dubNVwUQ, long offset, AnimationSpec<Offset> r12, Continuation<? super Unit> r13) {
        Ref.LongRef previous = new Ref.LongRef();
        previous.element = Offset.Companion.m4141getZeroF1C5BW0();
        Object r0 = TransformableState.transform$default($this$animatePanBy_u2dubNVwUQ, null, new TransformableStateKt$animatePanBy$2(previous, offset, r12, null), r13, 1, null);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: animateBy-Su4bsnU$default, reason: not valid java name */
    public static /* synthetic */ Object m531animateBySu4bsnU$default(TransformableState r14, float r15, long r16, float r18, AnimationSpec r19, AnimationSpec r20, AnimationSpec r21, Continuation r22, int r23, Object r24) {
        if ((r23 & 8) == 0) goto L5;
        AnimationSpec r6 = new SpringSpec(0.0f, 200.0f, null, 5, null);
    L7:
        if ((r23 & 16) == 0) goto L9;
        AnimationSpec r7 = new SpringSpec(0.0f, 200.0f, null, 5, null);
    L11:
        if ((r23 & 32) == 0) goto L13;
        AnimationSpec r8 = new SpringSpec(0.0f, 200.0f, null, 5, null);
    L15:
        return m530animateBySu4bsnU(r14, r15, r16, r18, r6, r7, r8, r22);
    L13:
        r8 = r21;
        goto L15
    L9:
        r7 = r20;
        goto L11
    L5:
        r6 = r19;
        goto L7
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.foundation.gestures.AnimationData] */
    /* JADX INFO: renamed from: animateBy-Su4bsnU, reason: not valid java name */
    public static final Object m530animateBySu4bsnU(TransformableState $this$animateBy_u2dSu4bsnU, float zoomFactor, long panOffset, float rotationDegrees, AnimationSpec<Float> r19, AnimationSpec<Offset> r20, AnimationSpec<Float> r21, Continuation<? super Unit> r22) {
        if (zoomFactor <= 0.0f) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
    L9:
        Ref.ObjectRef previousState = new Ref.ObjectRef();
        previousState.element = new AnimationData(1.0f, Offset.Companion.m4141getZeroF1C5BW0(), 0.0f, null);
        AnimationData targetState = new AnimationData(zoomFactor, panOffset, rotationDegrees, null);
        DelegatingAnimationSpec animationSpec = new DelegatingAnimationSpec(r19, r20, r21);
        Object r6 = TransformableState.transform$default($this$animateBy_u2dSu4bsnU, null, new TransformableStateKt$animateBy$3(previousState, targetState, animationSpec, null), r22, 1, null);
        if (r6 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L13;
        return r6;
    L13:
        return Unit.INSTANCE;
    L5:
        value$iv = false;
        goto L7
    }

    static {
        ZeroAnimationVelocity = new AnimationData(0.0f, Offset.Companion.m4141getZeroF1C5BW0(), 0.0f, null);
    }

    public static final Object zoomBy(TransformableState $this$zoomBy, float zoomFactor, Continuation<? super Unit> r10) {
        Object r8 = TransformableState.transform$default($this$zoomBy, null, new C02772(zoomFactor, null), r10, 1, null);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r8;
    L6:
        return Unit.INSTANCE;
    }

    public static final Object rotateBy(TransformableState $this$rotateBy, float degrees, Continuation<? super Unit> r10) {
        Object r8 = TransformableState.transform$default($this$rotateBy, null, new C02752(degrees, null), r10, 1, null);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r8;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m534panByd4ec7I(TransformableState $this$panBy_u2dd_u2d4ec7I, long offset, Continuation<? super Unit> r11) {
        Object r8 = TransformableState.transform$default($this$panBy_u2dd_u2d4ec7I, null, new TransformableStateKt$panBy$2(offset, null), r11, 1, null);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r8;
    L6:
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState r0, MutatePriority r1, Continuation r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = MutatePriority.Default;
    L6:
        return stopTransformation(r0, r1, r2);
    }

    public static final Object stopTransformation(TransformableState $this$stopTransformation, MutatePriority terminationPriority, Continuation<? super Unit> r4) {
        Object r0 = $this$stopTransformation.transform(terminationPriority, new C02762(null), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }
}
