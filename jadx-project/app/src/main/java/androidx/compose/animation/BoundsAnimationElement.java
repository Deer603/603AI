package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimateBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00126\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\r0\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J9\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\r0\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0010HÆ\u0003Ja\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u000628\b\u0002\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\r0\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\u0013\u0010 \u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0002H\u0016J\f\u0010*\u001a\u00020(*\u00020+H\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017RA\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006,"}, d2 = {"Landroidx/compose/animation/BoundsAnimationElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/BoundsAnimationModifierNode;", "lookaheadScope", "Landroidx/compose/ui/layout/LookaheadScope;", "boundsTransform", "Landroidx/compose/animation/BoundsTransform;", "resolveMeasureConstraints", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "animatedSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "animateMotionFrameOfReference", "", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/animation/BoundsTransform;Lkotlin/jvm/functions/Function2;Z)V", "getAnimateMotionFrameOfReference", "()Z", "getBoundsTransform", "()Landroidx/compose/animation/BoundsTransform;", "getLookaheadScope", "()Landroidx/compose/ui/layout/LookaheadScope;", "getResolveMeasureConstraints", "()Lkotlin/jvm/functions/Function2;", "component1", "component2", "component3", "component4", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BoundsAnimationElement extends ModifierNodeElement<BoundsAnimationModifierNode> {
    public static final int $stable = 0;
    private final boolean animateMotionFrameOfReference;
    private final BoundsTransform boundsTransform;
    private final LookaheadScope lookaheadScope;
    private final Function2<IntSize, Constraints, Constraints> resolveMeasureConstraints;

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoundsAnimationElement copy$default(BoundsAnimationElement r0, LookaheadScope r1, BoundsTransform r2, Function2 r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.lookaheadScope;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.boundsTransform;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.resolveMeasureConstraints;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.animateMotionFrameOfReference;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final LookaheadScope component1() {
        return this.lookaheadScope;
    }

    public final BoundsTransform component2() {
        return this.boundsTransform;
    }

    public final Function2<IntSize, Constraints, Constraints> component3() {
        return this.resolveMeasureConstraints;
    }

    public final boolean component4() {
        return this.animateMotionFrameOfReference;
    }

    public final BoundsAnimationElement copy(LookaheadScope r2, BoundsTransform r3, Function2<? super IntSize, ? super Constraints, Constraints> r4, boolean r5) {
        return new BoundsAnimationElement(r2, r3, r4, r5);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof BoundsAnimationElement) == true) goto L8;
        return false;
    L8:
        BoundsAnimationElement r1 = (BoundsAnimationElement) r6;
        if (Intrinsics.areEqual(this.lookaheadScope, r1.lookaheadScope) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.boundsTransform, r1.boundsTransform) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.resolveMeasureConstraints, r1.resolveMeasureConstraints) == true) goto L18;
        return false;
    L18:
        if (this.animateMotionFrameOfReference == r1.animateMotionFrameOfReference) goto L20;
        return false;
    L20:
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((this.lookaheadScope.hashCode() * 31) + this.boundsTransform.hashCode()) * 31) + this.resolveMeasureConstraints.hashCode()) * 31) + Boolean.hashCode(this.animateMotionFrameOfReference);
    }

    public String toString() {
        return "BoundsAnimationElement(lookaheadScope=" + this.lookaheadScope + ", boundsTransform=" + this.boundsTransform + ", resolveMeasureConstraints=" + this.resolveMeasureConstraints + ", animateMotionFrameOfReference=" + this.animateMotionFrameOfReference + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((BoundsAnimationModifierNode) node);
    }

    public final LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    public final BoundsTransform getBoundsTransform() {
        return this.boundsTransform;
    }

    public final Function2<IntSize, Constraints, Constraints> getResolveMeasureConstraints() {
        return this.resolveMeasureConstraints;
    }

    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BoundsAnimationElement(LookaheadScope lookaheadScope, BoundsTransform boundsTransform, Function2<? super IntSize, ? super Constraints, Constraints> r3, boolean animateMotionFrameOfReference) {
        this.lookaheadScope = lookaheadScope;
        this.boundsTransform = boundsTransform;
        this.resolveMeasureConstraints = r3;
        this.animateMotionFrameOfReference = animateMotionFrameOfReference;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BoundsAnimationModifierNode create() {
        return new BoundsAnimationModifierNode(this.lookaheadScope, this.boundsTransform, this.resolveMeasureConstraints, this.animateMotionFrameOfReference);
    }

    public void update(BoundsAnimationModifierNode node) {
        node.setLookaheadScope(this.lookaheadScope);
        node.setBoundsTransform(this.boundsTransform);
        node.setOnChooseMeasureConstraints(this.resolveMeasureConstraints);
        node.setAnimateMotionFrameOfReference(this.animateMotionFrameOfReference);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
        $this$inspectableProperties.setName("boundsAnimation");
        $this$inspectableProperties.getProperties().set("lookaheadScope", this.lookaheadScope);
        $this$inspectableProperties.getProperties().set("boundsTransform", this.boundsTransform);
        $this$inspectableProperties.getProperties().set("onChooseMeasureConstraints", this.resolveMeasureConstraints);
        $this$inspectableProperties.getProperties().set("animateMotionFrameOfReference", Boolean.valueOf(this.animateMotionFrameOfReference));
    }
}
