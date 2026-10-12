package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020=H\u0016J\u0010\u0010?\u001a\u00020=2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020=H\u0002J\u000e\u0010C\u001a\u00020=H\u0082@¢\u0006\u0002\u0010DJ@\u0010E\u001a\u00020=2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\f\u0010H\u001a\u00020=*\u00020IH\u0016J\u001c\u0010J\u001a\u00020\u0006*\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0006H\u0016J\u001c\u0010O\u001a\u00020\u0006*\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010P\u001a\u00020\u0006H\u0016J&\u0010Q\u001a\u00020R*\u00020S2\u0006\u0010L\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0016ø\u0001\u0000¢\u0006\u0004\bW\u0010XJ\u001c\u0010Y\u001a\u00020\u0006*\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0006H\u0016J\u001c\u0010Z\u001a\u00020\u0006*\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010P\u001a\u00020\u0006H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R1\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R+\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R+\u0010'\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020&8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0018\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020100X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0018\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001b\u00107\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b8\u0010\u0014R\u0016\u0010\r\u001a\u00020\u000eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010;\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/foundation/MarqueeModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "iterations", "", "animationMode", "Landroidx/compose/foundation/MarqueeAnimationMode;", "delayMillis", "initialDelayMillis", "spacing", "Landroidx/compose/foundation/MarqueeSpacing;", "velocity", "Landroidx/compose/ui/unit/Dp;", "(IIIILandroidx/compose/foundation/MarqueeSpacing;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "animationJob", "Lkotlinx/coroutines/Job;", "<set-?>", "getAnimationMode-ZbEOnfQ", "()I", "setAnimationMode-97h66l8", "(I)V", "animationMode$delegate", "Landroidx/compose/runtime/MutableState;", "containerWidth", "getContainerWidth", "setContainerWidth", "containerWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "contentWidth", "getContentWidth", "setContentWidth", "contentWidth$delegate", "direction", "", "getDirection", "()F", "", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "marqueeLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "offset", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "setSpacing", "(Landroidx/compose/foundation/MarqueeSpacing;)V", "spacing$delegate", "spacingPx", "getSpacingPx", "spacingPx$delegate", "Landroidx/compose/runtime/State;", "F", "onAttach", "", "onDetach", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "restartAnimation", "runAnimation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "update-lWfNwf4", "(IIIILandroidx/compose/foundation/MarqueeSpacing;F)V", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {
    private Job animationJob;
    private final MutableState animationMode$delegate;
    private final MutableIntState containerWidth$delegate;
    private final MutableIntState contentWidth$delegate;
    private int delayMillis;
    private final MutableState hasFocus$delegate;
    private int initialDelayMillis;
    private int iterations;
    private GraphicsLayer marqueeLayer;
    private final Animatable<Float, AnimationVector1D> offset;
    private final MutableState spacing$delegate;
    private final State spacingPx$delegate;
    private float velocity;

    /* JADX INFO: compiled from: BasicMarquee.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[LayoutDirection.values().length];
            r0[LayoutDirection.Ltr.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[LayoutDirection.Rtl.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1, reason: invalid class name */
    /* JADX INFO: compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", i = {}, l = {379, 380}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Job $oldJob;
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        AnonymousClass1(Job r2, MarqueeModifierNode r3, Continuation<? super AnonymousClass1> r4) {
            this.$oldJob = r2;
            this.this$0 = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            return new AnonymousClass1(this.$oldJob, this.this$0, r5);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        L17:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
        L13:
            this.label = 2;
            if (MarqueeModifierNode.access$runAnimation(this.this$0, this) != r0) goto L17;
            return r0;
        L8:
            ResultKt.throwOnFailure($result);
            Job r1 = this.$oldJob;
            if (r1 == null) goto L13;
            this.label = 1;
            if (r1.join(this) != r0) goto L13;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2, reason: invalid class name */
    /* JADX INFO: compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: BasicMarquee.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "contentWithSpacingWidth", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {416, 418, 422, 422}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"})
        static final class C00122 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ MarqueeModifierNode this$0;

            C00122(MarqueeModifierNode r2, Continuation<? super C00122> r3) {
                this.this$0 = r2;
                super(2, r3);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                C00122 r0 = new C00122(this.this$0, r4);
                r0.L$0 = r3;
                return r0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Float r3, Continuation<? super Unit> r4) {
                return ((C00122) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Float r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.coroutines.Continuation] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Float r2 = null;
                C00122 r3 = 0;
                switch(this.label) {
                    case 0: goto L13;
                    case 1: goto L12;
                    case 2: goto L8;
                    case 3: goto L7;
                    case 4: goto L6;
                    default: goto L5;
                };
            L6:
                Throwable r0 = (Throwable) this.L$0;
                ResultKt.throwOnFailure($result);
                throw r0;
            L7:
                ResultKt.throwOnFailure($result);
            L29:
                return Unit.INSTANCE;
            L8:
                ResultKt.throwOnFailure($result);     // Catch: Throwable -> L10
            L25:
                Animatable r4 = MarqueeModifierNode.access$getOffset$p(this.this$0);
                r2 = Boxing.boxFloat(0.0f);
                r3 = this;
                this.label = 3;
                if (r4.snapTo(r2, r3) != r1) goto L29;
                return r1;
            L12:
                AnimationSpec spec = (AnimationSpec) this.L$1;
                Float contentWithSpacingWidth = (Float) this.L$0;
                ResultKt.throwOnFailure($result);
                AnimationSpec spec2 = spec;
                Float contentWithSpacingWidth2 = contentWithSpacingWidth;
            L22:
                this.L$0 = null;     // Catch: Throwable -> L10
                this.L$1 = null;     // Catch: Throwable -> L10
                this.label = 2;     // Catch: Throwable -> L10
                if (Animatable.animateTo$default(MarqueeModifierNode.access$getOffset$p(this.this$0), contentWithSpacingWidth2, spec2, null, null, this, 12, null) != r1) goto L25;
                return r1;
            L13:
                ResultKt.throwOnFailure($result);
                Float contentWithSpacingWidth3 = (Float) this.L$0;
                if (contentWithSpacingWidth3 == null) goto L16;
                AnimationSpec spec3 = BasicMarqueeKt.m238access$createMarqueeAnimationSpecZ4HSEVQ(MarqueeModifierNode.access$getIterations$p(this.this$0), contentWithSpacingWidth3.floatValue(), MarqueeModifierNode.access$getInitialDelayMillis$p(this.this$0), MarqueeModifierNode.access$getDelayMillis$p(this.this$0), MarqueeModifierNode.access$getVelocity$p(this.this$0), DelegatableNodeKt.requireDensity(this.this$0));
                this.L$0 = contentWithSpacingWidth3;
                this.L$1 = spec3;
                this.label = 1;
                if (MarqueeModifierNode.access$getOffset$p(this.this$0).snapTo(Boxing.boxFloat(0.0f), this) != r1) goto L20;
                return r1;
            L20:
                spec2 = spec3;
                contentWithSpacingWidth2 = contentWithSpacingWidth3;
                goto L22
            L16:
                return Unit.INSTANCE;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            L10:
                th = move-exception;
                this.L$0 = th;
                this.L$1 = r2;
                this.label = 4;
                if (MarqueeModifierNode.access$getOffset$p(this.this$0).snapTo(Boxing.boxFloat(r3), this) != r1) goto L36;
                return r1;
            L36:
                throw th;
            }
        }

        AnonymousClass2(MarqueeModifierNode r2, Continuation<? super AnonymousClass2> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass2(this.this$0, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            final MarqueeModifierNode r2 = this.this$0;
            this.label = 1;
            if (FlowKt.collectLatest(SnapshotStateKt.snapshotFlow(new AnonymousClass1(r2)), new C00122(this.this$0, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ MarqueeModifierNode(int r1, int r2, int r3, int r4, MarqueeSpacing r5, float r6, DefaultConstructorMarker r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    public static final /* synthetic */ int access$getContainerWidth(MarqueeModifierNode $this) {
        return $this.getContainerWidth();
    }

    public static final /* synthetic */ int access$getContentWidth(MarqueeModifierNode $this) {
        return $this.getContentWidth();
    }

    public static final /* synthetic */ int access$getDelayMillis$p(MarqueeModifierNode $this) {
        return $this.delayMillis;
    }

    public static final /* synthetic */ float access$getDirection(MarqueeModifierNode $this) {
        return $this.getDirection();
    }

    public static final /* synthetic */ boolean access$getHasFocus(MarqueeModifierNode $this) {
        return $this.getHasFocus();
    }

    public static final /* synthetic */ int access$getInitialDelayMillis$p(MarqueeModifierNode $this) {
        return $this.initialDelayMillis;
    }

    public static final /* synthetic */ int access$getIterations$p(MarqueeModifierNode $this) {
        return $this.iterations;
    }

    public static final /* synthetic */ Animatable access$getOffset$p(MarqueeModifierNode $this) {
        return $this.offset;
    }

    public static final /* synthetic */ int access$getSpacingPx(MarqueeModifierNode $this) {
        return $this.getSpacingPx();
    }

    public static final /* synthetic */ float access$getVelocity$p(MarqueeModifierNode $this) {
        return $this.velocity;
    }

    public static final /* synthetic */ Object access$runAnimation(MarqueeModifierNode $this, Continuation $completion) {
        return $this.runAnimation($completion);
    }

    private MarqueeModifierNode(int iterations, int animationMode, int delayMillis, int initialDelayMillis, final MarqueeSpacing spacing, float velocity) {
        this.iterations = iterations;
        this.delayMillis = delayMillis;
        this.initialDelayMillis = initialDelayMillis;
        this.velocity = velocity;
        this.contentWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.containerWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.hasFocus$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.spacing$delegate = SnapshotStateKt.mutableStateOf$default(spacing, null, 2, null);
        this.animationMode$delegate = SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m306boximpl(animationMode), null, 2, null);
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.spacingPx$delegate = SnapshotStateKt.derivedStateOf(new MarqueeModifierNode$spacingPx$2(spacing, this));
    }

    private final int getContentWidth() {
        IntState $this$getValue$iv = this.contentWidth$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private final void setContentWidth(int r4) {
        MutableIntState $this$setValue$iv = this.contentWidth$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    private final int getContainerWidth() {
        IntState $this$getValue$iv = this.containerWidth$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private final void setContainerWidth(int r4) {
        MutableIntState $this$setValue$iv = this.containerWidth$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    private final boolean getHasFocus() {
        State $this$getValue$iv = this.hasFocus$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private final void setHasFocus(boolean r5) {
        MutableState $this$setValue$iv = this.hasFocus$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final MarqueeSpacing getSpacing() {
        State $this$getValue$iv = this.spacing$delegate;
        return (MarqueeSpacing) $this$getValue$iv.getValue();
    }

    public final void setSpacing(MarqueeSpacing r4) {
        MutableState $this$setValue$iv = this.spacing$delegate;
        $this$setValue$iv.setValue(r4);
    }

    /* JADX INFO: renamed from: getAnimationMode-ZbEOnfQ, reason: not valid java name */
    public final int m320getAnimationModeZbEOnfQ() {
        State $this$getValue$iv = this.animationMode$delegate;
        return ((MarqueeAnimationMode) $this$getValue$iv.getValue()).m312unboximpl();
    }

    /* JADX INFO: renamed from: setAnimationMode-97h66l8, reason: not valid java name */
    public final void m321setAnimationMode97h66l8(int r5) {
        MutableState $this$setValue$iv = this.animationMode$delegate;
        $this$setValue$iv.setValue(MarqueeAnimationMode.m306boximpl(r5));
    }

    private final float getDirection() {
        float r0 = Math.signum(this.velocity);
        switch(WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()]) {
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        int r1 = -1;
    L9:
        return r0 * r1;
    L7:
        r1 = 1;
        goto L9
    L5:
        throw new NoWhenBranchMatchedException();
    }

    private final int getSpacingPx() {
        State $this$getValue$iv = this.spacingPx$delegate;
        return ((Number) $this$getValue$iv.getValue()).intValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        GraphicsLayer layer = this.marqueeLayer;
        GraphicsContext graphicsContext = DelegatableNodeKt.requireGraphicsContext(this);
        if (layer == null) goto L5;
        graphicsContext.releaseGraphicsLayer(layer);
    L5:
        this.marqueeLayer = graphicsContext.createGraphicsLayer();
        restartAnimation();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        Job r0 = this.animationJob;
        if (r0 == null) goto L5;
        Job.DefaultImpls.cancel$default(r0, null, 1, null);
    L5:
        this.animationJob = null;
        GraphicsLayer layer = this.marqueeLayer;
        if (layer == null) goto L9;
        DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(layer);
        this.marqueeLayer = null;
        return;
    }

    /* JADX INFO: renamed from: update-lWfNwf4, reason: not valid java name */
    public final void m322updatelWfNwf4(int iterations, int animationMode, int delayMillis, int initialDelayMillis, MarqueeSpacing spacing, float velocity) {
        setSpacing(spacing);
        m321setAnimationMode97h66l8(animationMode);
        if (this.iterations == iterations) goto L5;
    L10:
        this.iterations = iterations;
        this.delayMillis = delayMillis;
        this.initialDelayMillis = initialDelayMillis;
        this.velocity = velocity;
        restartAnimation();
        return;
    L5:
        if (this.delayMillis != delayMillis) goto L10;
        if (this.initialDelayMillis != initialDelayMillis) goto L10;
        if (Dp.m6978equalsimpl0(this.velocity, velocity) == false) goto L10;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        setHasFocus(focusState.getHasFocus());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        long childConstraints = Constraints.m6916copyZbe2FdA$default(constraints, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        final Placeable placeable = measurable.mo5714measureBRTryo0(childConstraints);
        setContainerWidth(ConstraintsKt.m6943constrainWidthK40F9xA(constraints, placeable.getWidth()));
        setContentWidth(placeable.getWidth());
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, getContainerWidth(), placeable.getHeight(), null, new MarqueeModifierNode$measure$1(placeable, this), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        return 0;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        return measurable.maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        return measurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        return measurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(final ContentDrawScope $this$draw) {
        float clipOffset = this.offset.getValue().floatValue() * getDirection();
        boolean r4 = true;
        if (getDirection() != 1.0f) goto L5;
        boolean r0 = true;
    L6:
        Animatable<Float, AnimationVector1D> r7 = this.offset;
        if (r0 == false) goto L13;
        if (r7.getValue().floatValue() >= getContentWidth()) goto L11;
        boolean r1 = true;
    L16:
        boolean firstCopyVisible = r1;
        if (getDirection() != 1.0f) goto L19;
        boolean r2 = true;
    L20:
        Animatable<Float, AnimationVector1D> r8 = this.offset;
        if (r2 == false) goto L27;
        if (r8.getValue().floatValue() <= ((getContentWidth() + getSpacingPx()) - getContainerWidth())) goto L25;
        boolean r3 = true;
    L30:
        boolean secondCopyVisible = r3;
        if (getDirection() == 1.0f) goto L34;
        r4 = false;
    L34:
        if (r4 == false) goto L36;
        int r5 = getContentWidth() + getSpacingPx();
    L37:
        float secondCopyOffset = r5;
        long arg0$iv = $this$draw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv = (int) (arg0$iv & 4294967295L);
        float drawHeight = Float.intBitsToFloat(bits$iv$iv$iv);
        GraphicsLayer layer = this.marqueeLayer;
        if (layer == null) goto L40;
        int width$iv = getContentWidth();
        int height$iv = MathKt.roundToInt(drawHeight);
        long r15 = 4294967295L;
        $this$draw.mo4918recordJVtK1S4(layer, IntSize.m7139constructorimpl((((long) height$iv) & 4294967295L) | (((long) width$iv) << 32)), new MarqueeModifierNode$draw$1$1($this$draw));
    L41:
        ContentDrawScope $this$clipRect_u2drOu3jXo_u24default$iv = $this$draw;
        float right$iv = clipOffset + getContainerWidth();
        long arg0$iv$iv = $this$clipRect_u2drOu3jXo_u24default$iv.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv$iv = (int) (arg0$iv$iv & r15);
        float bottom$iv = Float.intBitsToFloat(bits$iv$iv$iv$iv);
        int clipOp$iv = ClipOp.Companion.m4355getIntersectrtfAjoo();
        DrawContext $this$withTransform_u24lambda_u246$iv$iv = $this$clipRect_u2drOu3jXo_u24default$iv.getDrawContext();
        long previousSize$iv$iv = $this$withTransform_u24lambda_u246$iv$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().save();
        DrawTransform $this$clipRect_rOu3jXo_u24lambda_u244$iv = $this$withTransform_u24lambda_u246$iv$iv.getTransform();     // Catch: Throwable -> L81
        $this$clipRect_rOu3jXo_u24lambda_u244$iv.mo4841clipRectN_I0leg(clipOffset, 0.0f, right$iv, bottom$iv, clipOp$iv);     // Catch: Throwable -> L79
        GraphicsLayer layer2 = this.marqueeLayer;     // Catch: Throwable -> L77
        if (layer2 == null) goto L63;
        if (firstCopyVisible == false) goto L52;
        GraphicsLayer layer3 = layer2;
        GraphicsLayerKt.drawLayer($this$clipRect_u2drOu3jXo_u24default$iv, layer3);     // Catch: Throwable -> L65
    L53:
        if (secondCopyVisible == false) goto L75;
        $this$clipRect_u2drOu3jXo_u24default$iv.getDrawContext().getTransform().translate(secondCopyOffset, 0.0f);     // Catch: Throwable -> L65
        GraphicsLayerKt.drawLayer($this$clipRect_u2drOu3jXo_u24default$iv, layer3);     // Catch: Throwable -> L58
        $this$clipRect_u2drOu3jXo_u24default$iv.getDrawContext().getTransform().translate(-secondCopyOffset, -0.0f);     // Catch: Throwable -> L65
        goto L75
    L58:
        th = move-exception;
        $this$clipRect_u2drOu3jXo_u24default$iv.getDrawContext().getTransform().translate(-secondCopyOffset, -0.0f);     // Catch: Throwable -> L65
        throw th;     // Catch: Throwable -> L65
    L75:
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv.mo4839setSizeuvyYCjk(previousSize$iv$iv);
        return;
    L52:
        layer3 = layer2;
        goto L53
    L63:
        if (firstCopyVisible == false) goto L67;
        $this$draw.drawContent();     // Catch: Throwable -> L65
    L67:
        if (secondCopyVisible == false) goto L75;
        $this$clipRect_u2drOu3jXo_u24default$iv.getDrawContext().getTransform().translate(secondCopyOffset, 0.0f);     // Catch: Throwable -> L65
        $this$draw.drawContent();     // Catch: Throwable -> L72
        $this$clipRect_u2drOu3jXo_u24default$iv.getDrawContext().getTransform().translate(-secondCopyOffset, -0.0f);     // Catch: Throwable -> L65
        goto L75
    L72:
        th = move-exception;
        $this$clipRect_u2drOu3jXo_u24default$iv.getDrawContext().getTransform().translate(-secondCopyOffset, -0.0f);     // Catch: Throwable -> L65
        throw th;     // Catch: Throwable -> L65
    L65:
        th = th;
        DrawContext $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
    L83:
        $this$withTransform_u24lambda_u246$iv$iv2.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv2.mo4839setSizeuvyYCjk(previousSize$iv$iv);
        throw th;
    L77:
        th = th;
        $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
    L79:
        th = th;
        $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
    L81:
        th = th;
        $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
        goto L83
    L40:
        r15 = 4294967295L;
        goto L41
    L36:
        r5 = (-getContentWidth()) - getSpacingPx();
        goto L37
    L25:
        r3 = false;
        goto L30
    L27:
        if (r8.getValue().floatValue() <= getSpacingPx()) goto L29;
        r3 = true;
        goto L30
    L29:
        r3 = false;
        goto L30
    L19:
        r2 = false;
        goto L20
    L11:
        r1 = false;
        goto L16
    L13:
        if (r7.getValue().floatValue() >= getContainerWidth()) goto L15;
        r1 = true;
        goto L16
    L15:
        r1 = false;
        goto L16
    L5:
        r0 = false;
        goto L6
    }

    private final void restartAnimation() {
        Job oldJob = this.animationJob;
        if (oldJob == null) goto L6;
        Job.DefaultImpls.cancel$default(oldJob, null, 1, null);
    L6:
        if (isAttached() == false) goto L9;
        this.animationJob = BuildersKt.launch$default(getCoroutineScope(), null, null, new AnonymousClass1(oldJob, this, null), 3, null);
        return;
    }

    private final Object runAnimation(Continuation<? super Unit> r4) {
        if (this.iterations <= 0) goto L5;
        Object r0 = BuildersKt.withContext(FixedMotionDurationScale.INSTANCE, new AnonymousClass2(this, null), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r0;
    L10:
        return Unit.INSTANCE;
    L5:
        return Unit.INSTANCE;
    }
}
