package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0099\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J!\u00101\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J!\u00102\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J!\u00103\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u00107\u001a\u00020\u0015HÆ\u0003J\u00ad\u0001\u00108\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042 \b\u0002\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\b\u00109\u001a\u00020\u0002H\u0016J\u0013\u0010:\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020@HÖ\u0001J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0002H\u0016J\f\u0010D\u001a\u00020B*\u00020EH\u0016R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010#\"\u0004\b$\u0010%R2\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R2\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R2\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006F"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/EnterExitTransitionModifierNode;", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "offsetAnimation", "Landroidx/compose/ui/unit/IntOffset;", "slideAnimation", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "isEnabled", "Lkotlin/Function0;", "", "graphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "getEnter", "()Landroidx/compose/animation/EnterTransition;", "setEnter", "(Landroidx/compose/animation/EnterTransition;)V", "getExit", "()Landroidx/compose/animation/ExitTransition;", "setExit", "(Landroidx/compose/animation/ExitTransition;)V", "getGraphicsLayerBlock", "()Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "setGraphicsLayerBlock", "(Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "()Lkotlin/jvm/functions/Function0;", "setEnabled", "(Lkotlin/jvm/functions/Function0;)V", "getOffsetAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setOffsetAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "getSizeAnimation", "setSizeAnimation", "getSlideAnimation", "setSlideAnimation", "getTransition", "()Landroidx/compose/animation/core/Transition;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class EnterExitTransitionElement extends ModifierNodeElement<EnterExitTransitionModifierNode> {
    private EnterTransition enter;
    private ExitTransition exit;
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private Function0<Boolean> isEnabled;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;
    private final Transition<EnterExitState> transition;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnterExitTransitionElement copy$default(EnterExitTransitionElement r0, Transition r1, Transition.DeferredAnimation r2, Transition.DeferredAnimation r3, Transition.DeferredAnimation r4, EnterTransition r5, ExitTransition r6, Function0 r7, GraphicsLayerBlockForEnterExit r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.transition;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.sizeAnimation;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.offsetAnimation;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.slideAnimation;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.enter;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.exit;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.isEnabled;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.graphicsLayerBlock;
    L26:
        Function0 r11 = r7;
        GraphicsLayerBlockForEnterExit r12 = r8;
        EnterTransition r13 = r5;
        ExitTransition r14 = r6;
        Transition.DeferredAnimation r15 = r3;
        Transition.DeferredAnimation r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
    }

    public final Transition<EnterExitState> component1() {
        return this.transition;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> component2() {
        return this.sizeAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component3() {
        return this.offsetAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component4() {
        return this.slideAnimation;
    }

    public final EnterTransition component5() {
        return this.enter;
    }

    public final ExitTransition component6() {
        return this.exit;
    }

    public final Function0<Boolean> component7() {
        return this.isEnabled;
    }

    public final GraphicsLayerBlockForEnterExit component8() {
        return this.graphicsLayerBlock;
    }

    public final EnterExitTransitionElement copy(Transition<EnterExitState> r10, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> r11, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> r12, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> r13, EnterTransition r14, ExitTransition r15, Function0<Boolean> r16, GraphicsLayerBlockForEnterExit r17) {
        return new EnterExitTransitionElement(r10, r11, r12, r13, r14, r15, r16, r17);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof EnterExitTransitionElement) == true) goto L8;
        return false;
    L8:
        EnterExitTransitionElement r1 = (EnterExitTransitionElement) r6;
        if (Intrinsics.areEqual(this.transition, r1.transition) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.sizeAnimation, r1.sizeAnimation) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.offsetAnimation, r1.offsetAnimation) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.slideAnimation, r1.slideAnimation) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.enter, r1.enter) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.exit, r1.exit) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.areEqual(this.isEnabled, r1.isEnabled) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.areEqual(this.graphicsLayerBlock, r1.graphicsLayerBlock) == true) goto L32;
        return false;
    L32:
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int r1 = this.transition.hashCode() * 31;
        int r3 = 0;
        if (this.sizeAnimation != null) goto L5;
        int r2 = 0;
    L6:
        int r0 = (r1 + r2) * 31;
        if (this.offsetAnimation != null) goto L9;
        int r4 = 0;
    L10:
        int r5 = (r0 + r4) * 31;
        if (this.slideAnimation == null) goto L15;
        r3 = this.slideAnimation.hashCode();
    L15:
        return ((((((((r5 + r3) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.isEnabled.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    L9:
        r4 = this.offsetAnimation.hashCode();
        goto L10
    L5:
        r2 = this.sizeAnimation.hashCode();
        goto L6
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", isEnabled=" + this.isEnabled + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((EnterExitTransitionModifierNode) node);
    }

    public final Transition<EnterExitState> getTransition() {
        return this.transition;
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

    public EnterExitTransitionElement(Transition<EnterExitState> r1, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> r2, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> r3, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> r4, EnterTransition enter, ExitTransition exit, Function0<Boolean> r7, GraphicsLayerBlockForEnterExit graphicsLayerBlock) {
        this.transition = r1;
        this.sizeAnimation = r2;
        this.offsetAnimation = r3;
        this.slideAnimation = r4;
        this.enter = enter;
        this.exit = exit;
        this.isEnabled = r7;
        this.graphicsLayerBlock = graphicsLayerBlock;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public EnterExitTransitionModifierNode create() {
        return new EnterExitTransitionModifierNode(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.isEnabled, this.graphicsLayerBlock);
    }

    public void update(EnterExitTransitionModifierNode node) {
        node.setTransition(this.transition);
        node.setSizeAnimation(this.sizeAnimation);
        node.setOffsetAnimation(this.offsetAnimation);
        node.setSlideAnimation(this.slideAnimation);
        node.setEnter(this.enter);
        node.setExit(this.exit);
        node.setEnabled(this.isEnabled);
        node.setGraphicsLayerBlock(this.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
        $this$inspectableProperties.setName("enterExitTransition");
        $this$inspectableProperties.getProperties().set("transition", this.transition);
        $this$inspectableProperties.getProperties().set("sizeAnimation", this.sizeAnimation);
        $this$inspectableProperties.getProperties().set("offsetAnimation", this.offsetAnimation);
        $this$inspectableProperties.getProperties().set("slideAnimation", this.slideAnimation);
        $this$inspectableProperties.getProperties().set("enter", this.enter);
        $this$inspectableProperties.getProperties().set("exit", this.exit);
        $this$inspectableProperties.getProperties().set("graphicsLayerBlock", this.graphicsLayerBlock);
    }
}
