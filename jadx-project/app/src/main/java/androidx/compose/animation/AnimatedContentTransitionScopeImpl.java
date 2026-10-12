package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003UVWB%\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0004\b>\u0010?JK\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u0002002\f\u0010C\u001a\b\u0012\u0004\u0012\u0002060D2!\u0010E\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020G0FH\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJK\u0010M\u001a\u00020N2\u0006\u0010B\u001a\u0002002\f\u0010C\u001a\b\u0012\u0004\u0012\u0002060D2!\u0010O\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020G0FH\u0016ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020=*\u00020=2\b\u0010S\u001a\u0004\u0018\u00010TH\u0096\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\f8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR1\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R&\u0010&\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0'X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010.\u001a\u00020/*\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u00103\u001a\u00020/*\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X²\u0006\u0010\u0010Y\u001a\u00020/\"\u0004\b\u0000\u0010\u0001X\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "S", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "transition", "Landroidx/compose/animation/core/Transition;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "animatedSize", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/IntSize;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "setContentAlignment", "(Landroidx/compose/ui/Alignment;)V", "currentSize", "getCurrentSize-YbymL2g", "()J", "initialState", "getInitialState", "()Ljava/lang/Object;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "measuredSize", "getMeasuredSize-YbymL2g$animation_release", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "targetSizeMap", "Landroidx/collection/MutableScatterMap;", "getTargetSizeMap$animation_release", "()Landroidx/collection/MutableScatterMap;", "targetState", "getTargetState", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", "isLeft", "", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "isLeft-gWo6LJ4", "(I)Z", "isRight", "isRight-gWo6LJ4", "calculateOffset", "Landroidx/compose/ui/unit/IntOffset;", "fullSize", "calculateOffset-emnUabE", "(JJ)J", "createSizeAnimationModifier", "Landroidx/compose/ui/Modifier;", "contentTransform", "Landroidx/compose/animation/ContentTransform;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "slideIntoContainer", "Landroidx/compose/animation/EnterTransition;", "towards", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "initialOffset", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "offsetForFullSlide", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideOutOfContainer", "Landroidx/compose/animation/ExitTransition;", "targetOffset", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "using", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "ChildData", "SizeModifierElement", "SizeModifierNode", "animation_release", "shouldAnimateSize"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {
    public static final int $stable = 0;
    private State<IntSize> animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;
    private final MutableState measuredSize$delegate;
    private final MutableScatterMap<S, State<IntSize>> targetSizeMap;
    private final Transition<S> transition;

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0002\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000e"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "isTarget", "", "(Z)V", "<set-?>", "()Z", "setTarget", "isTarget$delegate", "Landroidx/compose/runtime/MutableState;", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ChildData implements ParentDataModifier {
        public static final int $stable = 0;
        private final MutableState isTarget$delegate;

        static {
        }

        public ChildData(boolean isTarget) {
            this.isTarget$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(isTarget), null, 2, null);
        }

        public final boolean isTarget() {
            State $this$getValue$iv = this.isTarget$delegate;
            return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
        }

        public final void setTarget(boolean r5) {
            MutableState $this$setValue$iv = this.isTarget$delegate;
            $this$setValue$iv.setValue(Boolean.valueOf(r5));
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public Object modifyParentData(Density $this$modifyParentData, Object parentData) {
            return this;
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002BC\u0012\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016J\f\u0010\u001f\u001a\u00020\u001d*\u00020 H\u0016R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R)\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;", "S", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeTransform", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "scope", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "getScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "create", "equals", "", "other", "", "hashCode", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SizeModifierElement<S> extends ModifierNodeElement<SizeModifierNode<S>> {
        private final AnimatedContentTransitionScopeImpl<S> scope;
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private final State<SizeTransform> sizeTransform;

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public /* bridge */ /* synthetic */ Modifier.Node create() {
            return create();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
            update((SizeModifierNode) node);
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifierElement(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> r1, State<? extends SizeTransform> r2, AnimatedContentTransitionScopeImpl<S> r3) {
            this.sizeAnimation = r1;
            this.sizeTransform = r2;
            this.scope = r3;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public SizeModifierNode<S> create() {
            return new SizeModifierNode(this.sizeAnimation, this.sizeTransform, this.scope);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            int r0 = this.scope.hashCode() * 31;
            Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> r1 = this.sizeAnimation;
            if (r1 == null) goto L5;
            int r2 = r1.hashCode();
        L7:
            return ((r0 + r2) * 31) + this.sizeTransform.hashCode();
        L5:
            r2 = 0;
            goto L7
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object other) {
            if ((other instanceof SizeModifierElement) == true) goto L5;
        L9:
            return false;
        L5:
            if (Intrinsics.areEqual(((SizeModifierElement) other).sizeAnimation, this.sizeAnimation) == false) goto L9;
            if (Intrinsics.areEqual(((SizeModifierElement) other).sizeTransform, this.sizeTransform) == false) goto L9;
            return true;
        }

        public void update(SizeModifierNode<S> r2) {
            r2.setSizeAnimation(this.sizeAnimation);
            r2.setSizeTransform(this.sizeTransform);
            r2.setScope(this.scope);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
            $this$inspectableProperties.setName("sizeTransform");
            $this$inspectableProperties.getProperties().set("sizeAnimation", this.sizeAnimation);
            $this$inspectableProperties.getProperties().set("sizeTransform", this.sizeTransform);
            $this$inspectableProperties.getProperties().set("scope", this.scope);
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002BC\u0012\u001e\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0002\u0010\rJ\u001a\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020!H\u0016J&\u0010\"\u001a\u00020#*\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0016\u0010\u000e\u001a\u00020\u0005X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R2\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "S", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeTransform", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "scope", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "lastSize", "J", "getScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "setScope", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setSizeAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "getSizeTransform", "()Landroidx/compose/runtime/State;", "setSizeTransform", "(Landroidx/compose/runtime/State;)V", "lastContinuousSizeOrDefault", "default", "lastContinuousSizeOrDefault-mzRDjE0", "(J)J", "onReset", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SizeModifierNode<S> extends LayoutModifierNodeWithPassThroughIntrinsics {
        private long lastSize;
        private AnimatedContentTransitionScopeImpl<S> scope;
        private Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private State<? extends SizeTransform> sizeTransform;

        /* JADX INFO: renamed from: access$lastContinuousSizeOrDefault-mzRDjE0, reason: not valid java name */
        public static final /* synthetic */ long m58access$lastContinuousSizeOrDefaultmzRDjE0(SizeModifierNode $this, long r3) {
            return $this.m59lastContinuousSizeOrDefaultmzRDjE0(r3);
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final void setSizeAnimation(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> r1) {
            this.sizeAnimation = r1;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        public final void setSizeTransform(State<? extends SizeTransform> r1) {
            this.sizeTransform = r1;
        }

        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        public final void setScope(AnimatedContentTransitionScopeImpl<S> r1) {
            this.scope = r1;
        }

        public SizeModifierNode(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> r3, State<? extends SizeTransform> r4, AnimatedContentTransitionScopeImpl<S> r5) {
            this.sizeAnimation = r3;
            this.sizeTransform = r4;
            this.scope = r5;
            this.lastSize = AnimatedContentKt.access$getUnspecifiedSize$p();
        }

        /* JADX INFO: renamed from: lastContinuousSizeOrDefault-mzRDjE0, reason: not valid java name */
        private final long m59lastContinuousSizeOrDefaultmzRDjE0(long r5) {
            if (IntSize.m7142equalsimpl0(this.lastSize, AnimatedContentKt.access$getUnspecifiedSize$p()) == false) goto L6;
            return r5;
        L6:
            return this.lastSize;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onReset() {
            super.onReset();
            this.lastSize = AnimatedContentKt.access$getUnspecifiedSize$p();
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo60measure3p2s80s(MeasureScope r21, Measurable r22, long r23) {
            final Placeable r1 = r22.mo5714measureBRTryo0(r23);
            if (r21.isLookingAhead() == false) goto L6;
            int r4 = r1.getWidth();
            final long r8 = IntSize.m7139constructorimpl((((long) r4) << 32) | (((long) r1.getHeight()) & 4294967295L));
        L9:
            long r3 = r8;
            return MeasureScope.layout$default(r21, (int) (r3 >> 32), (int) (4294967295L & r3), null, new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1(this, r1, r8), 4, null);
        L6:
            if (this.sizeAnimation != null) goto L8;
            int r5 = r1.getWidth();
            r8 = IntSize.m7139constructorimpl((((long) r5) << 32) | (((long) r1.getHeight()) & 4294967295L));
            int r2 = r1.getWidth();
            this.lastSize = IntSize.m7139constructorimpl((((long) r2) << 32) | (((long) r1.getHeight()) & 4294967295L));
            goto L9
        L8:
            int r6 = r1.getWidth();
            final long r9 = IntSize.m7139constructorimpl((((long) r6) << 32) | (((long) r1.getHeight()) & 4294967295L));
            Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> r7 = this.sizeAnimation;
            Intrinsics.checkNotNull(r7);
            State<IntSize> r10 = r7.animate(new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1(this, r9), new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2(this, r9));
            this.scope.setAnimatedSize$animation_release(r10);
            long r11 = r10.getValue().m7148unboximpl();
            this.lastSize = r10.getValue().m7148unboximpl();
            r8 = r11;
            goto L9
        }
    }

    static {
        $stable = 8;
    }

    public AnimatedContentTransitionScopeImpl(Transition<S> r4, Alignment contentAlignment, LayoutDirection layoutDirection) {
        this.transition = r4;
        this.contentAlignment = contentAlignment;
        this.layoutDirection = layoutDirection;
        this.measuredSize$delegate = SnapshotStateKt.mutableStateOf$default(IntSize.m7136boximpl(IntSize.Companion.m7149getZeroYbymL2g()), null, 2, null);
        this.targetSizeMap = ScatterMapKt.mutableScatterMapOf();
    }

    /* JADX INFO: renamed from: access$calculateOffset-emnUabE, reason: not valid java name */
    public static final /* synthetic */ long m50access$calculateOffsetemnUabE(AnimatedContentTransitionScopeImpl $this, long fullSize, long currentSize) {
        return $this.m52calculateOffsetemnUabE(fullSize, currentSize);
    }

    /* JADX INFO: renamed from: access$getCurrentSize-YbymL2g, reason: not valid java name */
    public static final /* synthetic */ long m51access$getCurrentSizeYbymL2g(AnimatedContentTransitionScopeImpl $this) {
        return $this.m53getCurrentSizeYbymL2g();
    }

    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    public void setContentAlignment(Alignment r1) {
        this.contentAlignment = r1;
    }

    public final LayoutDirection getLayoutDirection$animation_release() {
        return this.layoutDirection;
    }

    public final void setLayoutDirection$animation_release(LayoutDirection r1) {
        this.layoutDirection = r1;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public ContentTransform using(ContentTransform $this$using, SizeTransform sizeTransform) {
        $this$using.setSizeTransform$animation_release(sizeTransform);
        return $this$using;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* JADX INFO: renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo35slideIntoContainermOhB8PU(int towards, FiniteAnimationSpec<IntOffset> r3, final Function1<? super Integer, Integer> r4) {
        if (m54isLeftgWo6LJ4(towards) == false) goto L6;
        return EnterExitTransitionKt.slideInHorizontally(r3, new AnimatedContentTransitionScopeImpl$slideIntoContainer$1(r4, this));
    L6:
        if (m55isRightgWo6LJ4(towards) == false) goto L9;
        return EnterExitTransitionKt.slideInHorizontally(r3, new AnimatedContentTransitionScopeImpl$slideIntoContainer$2(r4, this));
    L9:
        if (AnimatedContentTransitionScope.SlideDirection.m40equalsimpl0(towards, AnimatedContentTransitionScope.SlideDirection.Companion.m49getUpDKzdypw()) == false) goto L12;
        return EnterExitTransitionKt.slideInVertically(r3, new AnimatedContentTransitionScopeImpl$slideIntoContainer$3(r4, this));
    L12:
        if (AnimatedContentTransitionScope.SlideDirection.m40equalsimpl0(towards, AnimatedContentTransitionScope.SlideDirection.Companion.m44getDownDKzdypw()) == false) goto L15;
        return EnterExitTransitionKt.slideInVertically(r3, new AnimatedContentTransitionScopeImpl$slideIntoContainer$4(r4, this));
    L15:
        return EnterTransition.Companion.getNone();
    }

    /* JADX INFO: renamed from: isLeft-gWo6LJ4, reason: not valid java name */
    private final boolean m54isLeftgWo6LJ4(int $this$isLeft) {
        if (AnimatedContentTransitionScope.SlideDirection.m40equalsimpl0($this$isLeft, AnimatedContentTransitionScope.SlideDirection.Companion.m46getLeftDKzdypw()) == false) goto L5;
    L14:
        return true;
    L5:
        if (AnimatedContentTransitionScope.SlideDirection.m40equalsimpl0($this$isLeft, AnimatedContentTransitionScope.SlideDirection.Companion.m48getStartDKzdypw()) == false) goto L9;
        if (this.layoutDirection == LayoutDirection.Ltr) goto L14;
    L9:
        if (AnimatedContentTransitionScope.SlideDirection.m40equalsimpl0($this$isLeft, AnimatedContentTransitionScope.SlideDirection.Companion.m45getEndDKzdypw()) == true) goto L11;
    L13:
        return false;
    L11:
        if (this.layoutDirection != LayoutDirection.Rtl) goto L13;
        goto L13
    }

    /* JADX INFO: renamed from: isRight-gWo6LJ4, reason: not valid java name */
    private final boolean m55isRightgWo6LJ4(int $this$isRight) {
        if (AnimatedContentTransitionScope.SlideDirection.m40equalsimpl0($this$isRight, AnimatedContentTransitionScope.SlideDirection.Companion.m47getRightDKzdypw()) == false) goto L5;
    L14:
        return true;
    L5:
        if (AnimatedContentTransitionScope.SlideDirection.m40equalsimpl0($this$isRight, AnimatedContentTransitionScope.SlideDirection.Companion.m48getStartDKzdypw()) == false) goto L9;
        if (this.layoutDirection == LayoutDirection.Rtl) goto L14;
    L9:
        if (AnimatedContentTransitionScope.SlideDirection.m40equalsimpl0($this$isRight, AnimatedContentTransitionScope.SlideDirection.Companion.m45getEndDKzdypw()) == true) goto L11;
    L13:
        return false;
    L11:
        if (this.layoutDirection != LayoutDirection.Ltr) goto L13;
        goto L13
    }

    /* JADX INFO: renamed from: calculateOffset-emnUabE, reason: not valid java name */
    private final long m52calculateOffsetemnUabE(long fullSize, long currentSize) {
        return getContentAlignment().mo3942alignKFBX0sM(fullSize, currentSize, LayoutDirection.Ltr);
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* JADX INFO: renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo36slideOutOfContainermOhB8PU(int towards, FiniteAnimationSpec<IntOffset> r3, final Function1<? super Integer, Integer> r4) {
        if (m54isLeftgWo6LJ4(towards) == false) goto L6;
        return EnterExitTransitionKt.slideOutHorizontally(r3, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$1(this, r4));
    L6:
        if (m55isRightgWo6LJ4(towards) == false) goto L9;
        return EnterExitTransitionKt.slideOutHorizontally(r3, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$2(this, r4));
    L9:
        if (AnimatedContentTransitionScope.SlideDirection.m40equalsimpl0(towards, AnimatedContentTransitionScope.SlideDirection.Companion.m49getUpDKzdypw()) == false) goto L12;
        return EnterExitTransitionKt.slideOutVertically(r3, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$3(this, r4));
    L12:
        if (AnimatedContentTransitionScope.SlideDirection.m40equalsimpl0(towards, AnimatedContentTransitionScope.SlideDirection.Companion.m44getDownDKzdypw()) == false) goto L15;
        return EnterExitTransitionKt.slideOutVertically(r3, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$4(this, r4));
    L15:
        return ExitTransition.Companion.getNone();
    }

    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m56getMeasuredSizeYbymL2g$animation_release() {
        State $this$getValue$iv = this.measuredSize$delegate;
        return ((IntSize) $this$getValue$iv.getValue()).m7148unboximpl();
    }

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m57setMeasuredSizeozmzZPI$animation_release(long r5) {
        MutableState $this$setValue$iv = this.measuredSize$delegate;
        $this$setValue$iv.setValue(IntSize.m7136boximpl(r5));
    }

    public final MutableScatterMap<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    public final void setAnimatedSize$animation_release(State<IntSize> r1) {
        this.animatedSize = r1;
    }

    /* JADX INFO: renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    private final long m53getCurrentSizeYbymL2g() {
        State<IntSize> r0 = this.animatedSize;
        if (r0 == null) goto L6;
        return r0.getValue().m7148unboximpl();
    L6:
        return m56getMeasuredSizeYbymL2g$animation_release();
    }

    public final Modifier createSizeAnimationModifier$animation_release(ContentTransform contentTransform, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 93755870, "C(createSizeAnimationModifier)557@27860L40,558@27929L52:AnimatedContent.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(93755870, $changed, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:556)");
    L6:
        ComposerKt.sourceInformationMarkerStart($composer, -546154068, "CC(remember):AnimatedContent.kt#9igjgp");
        boolean invalid$iv = $composer.changed(this);
        Object it$iv = $composer.rememberedValue();
        boolean r9 = false;
        if (invalid$iv == false) goto L9;
    L12:
        Object value$iv = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L13:
        MutableState shouldAnimateSize$delegate = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        State sizeTransform = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), $composer, 0);
        if (Intrinsics.areEqual(this.transition.getCurrentState(), this.transition.getTargetState()) == false) goto L17;
        createSizeAnimationModifier$lambda$3(shouldAnimateSize$delegate, false);
    L20:
        if (createSizeAnimationModifier$lambda$2(shouldAnimateSize$delegate) == false) goto L37;
        $composer.startReplaceGroup(249676467);
        ComposerKt.sourceInformation($composer, "569@28486L48,570@28551L143");
        Transition.DeferredAnimation sizeAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.Companion), null, $composer, 0, 2);
        ComposerKt.sourceInformationMarkerStart($composer, -546131853, "CC(remember):AnimatedContent.kt#9igjgp");
        boolean invalid$iv2 = $composer.changed(sizeAnimation);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L24;
    L27:
        SizeTransform r13 = (SizeTransform) sizeTransform.getValue();
        if (r13 != null) goto L30;
    L32:
        if (r9 == false) goto L34;
        Object value$iv2 = (Modifier) Modifier.Companion;
    L35:
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L36:
        Modifier.Companion r5 = (Modifier) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endReplaceGroup();
    L38:
        Modifier r1 = r5.then(new SizeModifierElement(sizeAnimation, sizeTransform, this));
        if (ComposerKt.isTraceInProgress() == false) goto L41;
        ComposerKt.traceEventEnd();
    L41:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L34:
        value$iv2 = ClipKt.clipToBounds(Modifier.Companion);
        goto L35
    L30:
        if (r13.getClip() == true) goto L32;
        r9 = true;
        goto L32
    L24:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L36;
    L37:
        $composer.startReplaceGroup(249942509);
        $composer.endReplaceGroup();
        sizeAnimation = null;
        this.animatedSize = null;
        r5 = Modifier.Companion;
        goto L38
    L17:
        if (sizeTransform.getValue() == null) goto L20;
        createSizeAnimationModifier$lambda$3(shouldAnimateSize$delegate, true);
        goto L20
    L9:
        if (it$iv != Composer.Companion.getEmpty()) goto L13;
        goto L12
    }

    private static final boolean createSizeAnimationModifier$lambda$2(MutableState<Boolean> r4) {
        MutableState<Boolean> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(MutableState<Boolean> r5, boolean value) {
        r5.setValue(Boolean.valueOf(value));
    }
}
