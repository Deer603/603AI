package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\b\u0010J\u001a\u00020KH\u0016J \u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ \u0010Q\u001a\u00020\n2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010PJ \u0010S\u001a\u00020\n2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010PJ&\u0010U\u001a\u00020V*\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020.H\u0016ø\u0001\u0000¢\u0006\u0004\b[\u0010\\R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0019\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010*\"\u0004\b+\u0010,R&\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020.@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\"\u0004\b0\u00101R\u000e\u00103\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00104\u001a\u00020\u0007X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00102R2\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R2\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00106\"\u0004\b:\u00108R.\u0010;\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040=\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070>0<¢\u0006\u0002\b?¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR2\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00106\"\u0004\bC\u00108R.\u0010D\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040=\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0>0<¢\u0006\u0002\b?¢\u0006\b\n\u0000\u001a\u0004\bE\u0010AR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "offsetAnimation", "Landroidx/compose/ui/unit/IntOffset;", "slideAnimation", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "isEnabled", "Lkotlin/Function0;", "", "graphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "currentAlignment", "getCurrentAlignment", "setCurrentAlignment", "(Landroidx/compose/ui/Alignment;)V", "getEnter", "()Landroidx/compose/animation/EnterTransition;", "setEnter", "(Landroidx/compose/animation/EnterTransition;)V", "getExit", "()Landroidx/compose/animation/ExitTransition;", "setExit", "(Landroidx/compose/animation/ExitTransition;)V", "getGraphicsLayerBlock", "()Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "setGraphicsLayerBlock", "(Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "()Lkotlin/jvm/functions/Function0;", "setEnabled", "(Lkotlin/jvm/functions/Function0;)V", "value", "Landroidx/compose/ui/unit/Constraints;", "lookaheadConstraints", "setLookaheadConstraints-BRTryo0", "(J)V", "J", "lookaheadConstraintsAvailable", "lookaheadSize", "getOffsetAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setOffsetAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "getSizeAnimation", "setSizeAnimation", "sizeTransitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "getSizeTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "getSlideAnimation", "setSlideAnimation", "slideSpec", "getSlideSpec", "getTransition", "()Landroidx/compose/animation/core/Transition;", "setTransition", "(Landroidx/compose/animation/core/Transition;)V", "onAttach", "", "sizeByState", "targetState", "fullSize", "sizeByState-Uzc_VyU", "(Landroidx/compose/animation/EnterExitState;J)J", "slideTargetValueByState", "slideTargetValueByState-oFUgxo0", "targetOffsetByState", "targetOffsetByState-oFUgxo0", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment currentAlignment;
    private EnterTransition enter;
    private ExitTransition exit;
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private Function0<Boolean> isEnabled;
    private long lookaheadConstraints;
    private boolean lookaheadConstraintsAvailable;
    private long lookaheadSize;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> slideSpec;
    private Transition<EnterExitState> transition;

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[EnterExitState.values().length];
            r0[EnterExitState.Visible.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[EnterExitState.PreEnter.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[EnterExitState.PostExit.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public final void setTransition(Transition<EnterExitState> r1) {
        this.transition = r1;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final void setSizeAnimation(Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> r1) {
        this.sizeAnimation = r1;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final void setOffsetAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> r1) {
        this.offsetAnimation = r1;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    public final void setSlideAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> r1) {
        this.slideAnimation = r1;
    }

    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final void setEnter(EnterTransition r1) {
        this.enter = r1;
    }

    public final ExitTransition getExit() {
        return this.exit;
    }

    public final void setExit(ExitTransition r1) {
        this.exit = r1;
    }

    public final Function0<Boolean> isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(Function0<Boolean> r1) {
        this.isEnabled = r1;
    }

    public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    public final void setGraphicsLayerBlock(GraphicsLayerBlockForEnterExit r1) {
        this.graphicsLayerBlock = r1;
    }

    public EnterExitTransitionModifierNode(Transition<EnterExitState> r18, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> r19, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> r20, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> r21, EnterTransition enter, ExitTransition exit, Function0<Boolean> r24, GraphicsLayerBlockForEnterExit graphicsLayerBlock) {
        this.transition = r18;
        this.sizeAnimation = r19;
        this.offsetAnimation = r20;
        this.slideAnimation = r21;
        this.enter = enter;
        this.exit = exit;
        this.isEnabled = r24;
        this.graphicsLayerBlock = graphicsLayerBlock;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.sizeTransitionSpec = new EnterExitTransitionModifierNode$sizeTransitionSpec$1(this);
        this.slideSpec = new EnterExitTransitionModifierNode$slideSpec$1(this);
    }

    /* JADX INFO: renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m92setLookaheadConstraintsBRTryo0(long value) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = value;
    }

    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    public final void setCurrentAlignment(Alignment r1) {
        this.currentAlignment = r1;
    }

    public final Alignment getAlignment() {
        if (this.transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible) == false) goto L13;
        ChangeSize r2 = this.enter.getData$animation_release().getChangeSize();
        if (r2 == null) goto L10;
        Alignment r3 = r2.getAlignment();
        if (r3 == null) goto L10;
        return r3;
    L10:
        ChangeSize r4 = this.exit.getData$animation_release().getChangeSize();
        if (r4 != null) goto L26;
        return null;
    L26:
        return r4.getAlignment();
    L13:
        ChangeSize r5 = this.exit.getData$animation_release().getChangeSize();
        if (r5 == null) goto L19;
        Alignment r6 = r5.getAlignment();
        if (r6 == null) goto L19;
        return r6;
    L19:
        ChangeSize r7 = this.enter.getData$animation_release().getChangeSize();
        if (r7 != null) goto L23;
        return null;
    L23:
        return r7.getAlignment();
    }

    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    /* JADX INFO: renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m93sizeByStateUzc_VyU(EnterExitState targetState, long fullSize) {
        switch(WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()]) {
            case 1: goto L28;
            case 2: goto L11;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        ChangeSize r0 = this.exit.getData$animation_release().getChangeSize();
        if (r0 == null) goto L18;
        Function1<IntSize, IntSize> r1 = r0.getSize();
        if (r1 == null) goto L25;
        return r1.invoke(IntSize.m7136boximpl(fullSize)).m7148unboximpl();
    L25:
        return fullSize;
    L18:
        return fullSize;
    L11:
        ChangeSize r2 = this.enter.getData$animation_release().getChangeSize();
        if (r2 == null) goto L26;
        Function1<IntSize, IntSize> r3 = r2.getSize();
        if (r3 == null) goto L27;
        return r3.invoke(IntSize.m7136boximpl(fullSize)).m7148unboximpl();
    L27:
        return fullSize;
    L26:
        return fullSize;
    L5:
        throw new NoWhenBranchMatchedException();
    L28:
        return fullSize;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
    }

    /* JADX INFO: renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m95targetOffsetByStateoFUgxo0(EnterExitState targetState, long fullSize) {
        if (this.currentAlignment != null) goto L6;
        return IntOffset.Companion.m7112getZeronOccac();
    L6:
        if (getAlignment() != null) goto L9;
        return IntOffset.Companion.m7112getZeronOccac();
    L9:
        if (Intrinsics.areEqual(this.currentAlignment, getAlignment()) == false) goto L12;
        return IntOffset.Companion.m7112getZeronOccac();
    L12:
        switch(WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()]) {
            case 1: goto L21;
            case 2: goto L27;
            case 3: goto L15;
            default: goto L14;
        };
    L15:
        ChangeSize it = this.exit.getData$animation_release().getChangeSize();
        if (it == null) goto L26;
        long endSize = it.getSize().invoke(IntSize.m7136boximpl(fullSize)).m7148unboximpl();
        Alignment r3 = getAlignment();
        Intrinsics.checkNotNull(r3);
        long targetOffset = r3.mo3942alignKFBX0sM(fullSize, endSize, LayoutDirection.Ltr);
        Alignment r4 = this.currentAlignment;
        Intrinsics.checkNotNull(r4);
        long currentOffset = r4.mo3942alignKFBX0sM(fullSize, endSize, LayoutDirection.Ltr);
        return IntOffset.m7104minusqkQi6aY(targetOffset, currentOffset);
    L26:
        return IntOffset.Companion.m7112getZeronOccac();
    L14:
        throw new NoWhenBranchMatchedException();
    L27:
        return IntOffset.Companion.m7112getZeronOccac();
    L21:
        return IntOffset.Companion.m7112getZeronOccac();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        if (this.transition.getCurrentState() != this.transition.getTargetState()) goto L6;
        this.currentAlignment = null;
    L12:
        if ($this$measure_u2d3p2s80s.isLookingAhead() == false) goto L16;
        final Placeable placeable = measurable.mo5714measureBRTryo0(constraints);
        int width$iv = placeable.getWidth();
        int height$iv = placeable.getHeight();
        long measuredSize = IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
        this.lookaheadSize = measuredSize;
        m92setLookaheadConstraintsBRTryo0(constraints);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, (int) (measuredSize >> 32), (int) (4294967295L & measuredSize), null, new EnterExitTransitionModifierNode$measure$1(placeable), 4, null);
    L16:
        if (this.isEnabled.invoke().booleanValue() == false) goto L47;
        final Function1<GraphicsLayerScope, Unit> r14 = this.graphicsLayerBlock.init();
        final Placeable placeable2 = measurable.mo5714measureBRTryo0(constraints);
        int width$iv2 = placeable2.getWidth();
        int height$iv2 = placeable2.getHeight();
        long measuredSize2 = IntSize.m7139constructorimpl((((long) height$iv2) & 4294967295L) | (((long) width$iv2) << 32));
        if (AnimationModifierKt.m64isValidozmzZPI(this.lookaheadSize) == false) goto L20;
        final long target = this.lookaheadSize;
    L21:
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> r5 = this.sizeAnimation;
        if (r5 == null) goto L24;
        State<IntSize> r6 = r5.animate(this.sizeTransitionSpec, new EnterExitTransitionModifierNode$measure$animSize$1(this, target));
    L25:
        if (r6 == null) goto L27;
        long r12 = r6.getValue().m7148unboximpl();
    L28:
        long currentSize = ConstraintsKt.m6940constrain4WqzIAM(constraints, r12);
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> r8 = this.offsetAnimation;
        if (r8 == null) goto L33;
        State<IntOffset> r9 = r8.animate(EnterExitTransitionModifierNode$measure$offsetDelta$1.INSTANCE, new EnterExitTransitionModifierNode$measure$offsetDelta$2(this, target));
        if (r9 == null) goto L33;
        final long offsetDelta = r9.getValue().m7110unboximpl();
    L34:
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> r10 = this.slideAnimation;
        if (r10 == null) goto L39;
        long r23 = 4294967295L;
        State<IntOffset> r7 = r10.animate(this.slideSpec, new EnterExitTransitionModifierNode$measure$slideOffset$1(this, target));
        if (r7 == null) goto L40;
        long slideOffset = r7.getValue().m7110unboximpl();
    L41:
        Alignment r11 = this.currentAlignment;
        if (r11 == null) goto L44;
        long target2 = r11.mo3942alignKFBX0sM(target, currentSize, LayoutDirection.Ltr);
    L45:
        final long offset = IntOffset.m7105plusqkQi6aY(target2, slideOffset);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, (int) (currentSize >> 32), (int) (currentSize & r23), null, new EnterExitTransitionModifierNode$measure$2(placeable2, offset, offsetDelta, r14), 4, null);
    L44:
        target2 = IntOffset.Companion.m7112getZeronOccac();
    L40:
        slideOffset = IntOffset.Companion.m7112getZeronOccac();
        goto L41
    L39:
        r23 = 4294967295L;
    L33:
        offsetDelta = IntOffset.Companion.m7112getZeronOccac();
        goto L34
    L27:
        r12 = measuredSize2;
        goto L28
    L24:
        r6 = null;
        goto L25
    L20:
        target = measuredSize2;
        goto L21
    L47:
        final Placeable $this$measure_3p2s80s_u24lambda_u242 = measurable.mo5714measureBRTryo0(constraints);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, $this$measure_3p2s80s_u24lambda_u242.getWidth(), $this$measure_3p2s80s_u24lambda_u242.getHeight(), null, new EnterExitTransitionModifierNode$measure$3$1($this$measure_3p2s80s_u24lambda_u242), 4, null);
    L6:
        if (this.currentAlignment != null) goto L12;
        Alignment r3 = getAlignment();
        if (r3 != null) goto L10;
        r3 = Alignment.Companion.getTopStart();
    L10:
        this.currentAlignment = r3;
        goto L12
    }

    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getSlideSpec() {
        return this.slideSpec;
    }

    /* JADX INFO: renamed from: slideTargetValueByState-oFUgxo0, reason: not valid java name */
    public final long m94slideTargetValueByStateoFUgxo0(EnterExitState targetState, long fullSize) {
        Slide r0 = this.enter.getData$animation_release().getSlide();
        if (r0 == null) goto L7;
        Function1<IntSize, IntOffset> r1 = r0.getSlideOffset();
        if (r1 == null) goto L7;
        long preEnter = r1.invoke(IntSize.m7136boximpl(fullSize)).m7110unboximpl();
    L8:
        Slide r2 = this.exit.getData$animation_release().getSlide();
        if (r2 == null) goto L13;
        Function1<IntSize, IntOffset> r3 = r2.getSlideOffset();
        if (r3 == null) goto L13;
        long postExit = r3.invoke(IntSize.m7136boximpl(fullSize)).m7110unboximpl();
    L15:
        switch(WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()]) {
            case 1: goto L21;
            case 2: goto L23;
            case 3: goto L22;
            default: goto L17;
        };
    L17:
        throw new NoWhenBranchMatchedException();
    L22:
        return postExit;
    L23:
        return preEnter;
    L21:
        return IntOffset.Companion.m7112getZeronOccac();
    L13:
        postExit = IntOffset.Companion.m7112getZeronOccac();
    L7:
        preEnter = IntOffset.Companion.m7112getZeronOccac();
        goto L8
    }
}
