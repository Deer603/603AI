package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0010\u001a\u00020\u0004HÂ\u0003J\u0016\u0010\u0011\u001a\u00020\u0006HÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0016\u001a\u00020\nHÂ\u0003J\u0016\u0010\u0017\u001a\u00020\fHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0002H\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0004HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0002H\u0016J\f\u0010(\u001a\u00020&*\u00020)H\u0016R\u0016\u0010\u0005\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u00020\fX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MarqueeModifierNode;", "iterations", "", "animationMode", "Landroidx/compose/foundation/MarqueeAnimationMode;", "delayMillis", "initialDelayMillis", "spacing", "Landroidx/compose/foundation/MarqueeSpacing;", "velocity", "Landroidx/compose/ui/unit/Dp;", "(IIIILandroidx/compose/foundation/MarqueeSpacing;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "I", "F", "component1", "component2", "component2-ZbEOnfQ", "()I", "component3", "component4", "component5", "component6", "component6-D9Ej5fM", "()F", "copy", "copy-lWfNwf4", "(IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/foundation/MarqueeModifierElement;", "create", "equals", "", "other", "", "hashCode", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {
    private final int animationMode;
    private final int delayMillis;
    private final int initialDelayMillis;
    private final int iterations;
    private final MarqueeSpacing spacing;
    private final float velocity;

    public /* synthetic */ MarqueeModifierElement(int r1, int r2, int r3, int r4, MarqueeSpacing r5, float r6, DefaultConstructorMarker r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    private final int component1() {
        return this.iterations;
    }

    /* JADX INFO: renamed from: component2-ZbEOnfQ, reason: not valid java name */
    private final int m316component2ZbEOnfQ() {
        return this.animationMode;
    }

    private final int component3() {
        return this.delayMillis;
    }

    private final int component4() {
        return this.initialDelayMillis;
    }

    private final MarqueeSpacing component5() {
        return this.spacing;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m317component6D9Ej5fM() {
        return this.velocity;
    }

    /* JADX INFO: renamed from: copy-lWfNwf4$default, reason: not valid java name */
    public static /* synthetic */ MarqueeModifierElement m318copylWfNwf4$default(MarqueeModifierElement r0, int r1, int r2, int r3, int r4, MarqueeSpacing r5, float r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.iterations;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.animationMode;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.delayMillis;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.initialDelayMillis;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.spacing;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.velocity;
    L20:
        MarqueeSpacing r9 = r5;
        float r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.m319copylWfNwf4(r1, r2, r11, r12, r9, r10);
    }

    /* JADX INFO: renamed from: copy-lWfNwf4, reason: not valid java name */
    public final MarqueeModifierElement m319copylWfNwf4(int r9, int r10, int r11, int r12, MarqueeSpacing r13, float r14) {
        return new MarqueeModifierElement(r9, r10, r11, r12, r13, r14, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof MarqueeModifierElement) == true) goto L8;
        return false;
    L8:
        MarqueeModifierElement r1 = (MarqueeModifierElement) r6;
        if (this.iterations == r1.iterations) goto L12;
        return false;
    L12:
        if (MarqueeAnimationMode.m309equalsimpl0(this.animationMode, r1.animationMode) == true) goto L15;
        return false;
    L15:
        if (this.delayMillis == r1.delayMillis) goto L18;
        return false;
    L18:
        if (this.initialDelayMillis == r1.initialDelayMillis) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.spacing, r1.spacing) == true) goto L24;
        return false;
    L24:
        if (Dp.m6978equalsimpl0(this.velocity, r1.velocity) == true) goto L26;
        return false;
    L26:
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((Integer.hashCode(this.iterations) * 31) + MarqueeAnimationMode.m310hashCodeimpl(this.animationMode)) * 31) + Integer.hashCode(this.delayMillis)) * 31) + Integer.hashCode(this.initialDelayMillis)) * 31) + this.spacing.hashCode()) * 31) + Dp.m6979hashCodeimpl(this.velocity);
    }

    public String toString() {
        return "MarqueeModifierElement(iterations=" + this.iterations + ", animationMode=" + MarqueeAnimationMode.m311toStringimpl(this.animationMode) + ", delayMillis=" + this.delayMillis + ", initialDelayMillis=" + this.initialDelayMillis + ", spacing=" + this.spacing + ", velocity=" + Dp.m6984toStringimpl(this.velocity) + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((MarqueeModifierNode) node);
    }

    private MarqueeModifierElement(int iterations, int animationMode, int delayMillis, int initialDelayMillis, MarqueeSpacing spacing, float velocity) {
        this.iterations = iterations;
        this.animationMode = animationMode;
        this.delayMillis = delayMillis;
        this.initialDelayMillis = initialDelayMillis;
        this.spacing = spacing;
        this.velocity = velocity;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MarqueeModifierNode create() {
        return new MarqueeModifierNode(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity, null);
    }

    public void update(MarqueeModifierNode node) {
        node.m322updatelWfNwf4(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
        $this$inspectableProperties.setName("basicMarquee");
        $this$inspectableProperties.getProperties().set("iterations", Integer.valueOf(this.iterations));
        $this$inspectableProperties.getProperties().set("animationMode", MarqueeAnimationMode.m306boximpl(this.animationMode));
        $this$inspectableProperties.getProperties().set("delayMillis", Integer.valueOf(this.delayMillis));
        $this$inspectableProperties.getProperties().set("initialDelayMillis", Integer.valueOf(this.initialDelayMillis));
        $this$inspectableProperties.getProperties().set("spacing", this.spacing);
        $this$inspectableProperties.getProperties().set("velocity", Dp.m6971boximpl(this.velocity));
    }
}
