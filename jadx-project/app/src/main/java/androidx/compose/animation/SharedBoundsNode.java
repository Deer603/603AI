package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SharedContentNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020\u0016H\u0002J&\u0010-\u001a\u00020.*\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0014\u00106\u001a\u00020.*\u0002072\u0006\u00108\u001a\u000209H\u0002J\f\u0010:\u001a\u00020)*\u00020;H\u0016J&\u0010<\u001a\u00020.*\u0002072\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\f\u0010?\u001a\u00020)*\u00020\u0016H\u0002R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"Landroidx/compose/animation/SharedBoundsNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "state", "Landroidx/compose/animation/SharedElementInternalState;", "(Landroidx/compose/animation/SharedElementInternalState;)V", "boundsAnimation", "Landroidx/compose/animation/BoundsAnimation;", "getBoundsAnimation", "()Landroidx/compose/animation/BoundsAnimation;", "value", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "setLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "rootCoords", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getRootCoords", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "rootLookaheadCoords", "getRootLookaheadCoords", "sharedElement", "Landroidx/compose/animation/SharedElement;", "getSharedElement", "()Landroidx/compose/animation/SharedElement;", "getState", "()Landroidx/compose/animation/SharedElementInternalState;", "setState$animation_release", "isMeasurementApproachInProgress", "", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "onAttach", "", "onDetach", "onReset", "requireLookaheadLayoutCoordinates", "approachMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "approachPlace", "Landroidx/compose/ui/layout/MeasureScope;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "measure", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "updateCurrentBounds", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 0;
    private GraphicsLayer layer;
    private final ModifierLocalMap providedValues;
    private SharedElementInternalState state;

    static {
        $stable = 8;
    }

    public static final /* synthetic */ BoundsAnimation access$getBoundsAnimation(SharedBoundsNode $this) {
        return $this.getBoundsAnimation();
    }

    public static final /* synthetic */ LayoutCoordinates access$getRootCoords(SharedBoundsNode $this) {
        return $this.getRootCoords();
    }

    public static final /* synthetic */ LayoutCoordinates access$getRootLookaheadCoords(SharedBoundsNode $this) {
        return $this.getRootLookaheadCoords();
    }

    public static final /* synthetic */ SharedElement access$getSharedElement(SharedBoundsNode $this) {
        return $this.getSharedElement();
    }

    public static final /* synthetic */ LayoutCoordinates access$requireLookaheadLayoutCoordinates(SharedBoundsNode $this) {
        return $this.requireLookaheadLayoutCoordinates();
    }

    public static final /* synthetic */ void access$updateCurrentBounds(SharedBoundsNode $this, LayoutCoordinates $receiver) {
        $this.updateCurrentBounds($receiver);
    }

    public SharedBoundsNode(SharedElementInternalState state) {
        this.state = state;
        this.layer = state.getLayer();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.to(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), state));
    }

    private final LayoutCoordinates getRootCoords() {
        return getSharedElement().getScope().getRoot$animation_release();
    }

    private final LayoutCoordinates getRootLookaheadCoords() {
        return getSharedElement().getScope().getLookaheadRoot$animation_release();
    }

    public final SharedElementInternalState getState() {
        return this.state;
    }

    public final void setState$animation_release(SharedElementInternalState value) {
        if (Intrinsics.areEqual(value, this.state) == true) goto L8;
        this.state = value;
        if (isAttached() == false) goto L9;
        provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), value);
        this.state.setParentState((SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
        this.state.setLayer(this.layer);
        this.state.setLookaheadCoords(new SharedBoundsNode$state$1(this));
        return;
    L9:
        return;
    }

    private final LayoutCoordinates requireLookaheadLayoutCoordinates() {
        SharedTransitionScopeImpl $this$requireLookaheadLayoutCoordinates_u24lambda_u240 = this.state.getSharedElement().getScope();
        return $this$requireLookaheadLayoutCoordinates_u24lambda_u240.toLookaheadCoordinates(DelegatableNodeKt.requireLayoutCoordinates(this));
    }

    private final BoundsAnimation getBoundsAnimation() {
        return this.state.getBoundsAnimation();
    }

    private final void setLayer(GraphicsLayer value) {
        if (value != null) goto L6;
        GraphicsLayer it = this.layer;
        if (it == null) goto L7;
        DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(it);
    L7:
        this.layer = value;
        return;
    L6:
        this.state.setLayer(value);
        goto L7
    }

    private final SharedElement getSharedElement() {
        return this.state.getSharedElement();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), this.state);
        this.state.setParentState((SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
        setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.state.setLookaheadCoords(new C01821(this));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        setLayer(null);
        this.state.setParentState(null);
        this.state.setLookaheadCoords(C01831.INSTANCE);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        GraphicsLayer it = this.layer;
        if (it == null) goto L5;
        DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(it);
    L5:
        setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode, androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        final Placeable placeable = measurable.mo5714measureBRTryo0(constraints);
        float width$iv = placeable.getWidth();
        float height$iv = placeable.getHeight();
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        final long lookaheadSize = Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new SharedBoundsNode$measure$1(placeable, this, lookaheadSize), 4, null);
    }

    private final MeasureResult approachPlace(MeasureScope $this$approachPlace, final Placeable placeable) {
        if (getSharedElement().getFoundMatch() == false) goto L5;
        SharedTransitionScope.PlaceHolderSize r2 = this.state.getPlaceHolderSize();
        long r3 = requireLookaheadLayoutCoordinates().mo5722getSizeYbymL2g();
        int width$iv = placeable.getWidth();
        int height$iv = placeable.getHeight();
        long value$iv$iv$iv = r2.mo107calculateSizeJyjRU_E(r3, IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L)));
        int w = (int) (value$iv$iv$iv >> 32);
        int h = (int) (value$iv$iv$iv & 4294967295L);
        return MeasureScope.layout$default($this$approachPlace, w, h, null, new AnonymousClass2(this, placeable), 4, null);
    L5:
        return MeasureScope.layout$default($this$approachPlace, placeable.getWidth(), placeable.getHeight(), null, new AnonymousClass1(this, placeable), 4, null);
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* JADX INFO: renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo66isMeasurementApproachInProgressozmzZPI(long lookaheadSize) {
        if (getSharedElement().getFoundMatch() == true) goto L5;
    L7:
        return false;
    L5:
        if (this.state.getSharedElement().getScope().isTransitionActive() == false) goto L7;
        return true;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* JADX INFO: renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo65approachMeasure3p2s80s(ApproachMeasureScope $this$approachMeasure_u2d3p2s80s, Measurable measurable, long constraints) {
        if (getSharedElement().getFoundMatch() == false) goto L19;
        Rect it = getBoundsAnimation().getValue();
        if (it != null) goto L8;
        it = getSharedElement().getCurrentBounds();
    L8:
        if (it == null) goto L19;
        long value$iv$iv$iv = IntSizeKt.m7152roundToIntSizeuvyYCjk(it.m4158getSizeNHjbRc());
        int width = (int) (value$iv$iv$iv >> 32);
        int height = (int) (4294967295L & value$iv$iv$iv);
        if (width == Integer.MAX_VALUE) goto L13;
        if (height == Integer.MAX_VALUE) goto L13;
        boolean r3 = true;
    L14:
        if (r3 == false) goto L17;
        long resolvedConstraints = Constraints.Companion.m6936fixedJhjzzOo(RangesKt.coerceAtLeast(width, 0), RangesKt.coerceAtLeast(height, 0));
    L20:
        Placeable placeable = measurable.mo5714measureBRTryo0(resolvedConstraints);
        return approachPlace($this$approachMeasure_u2d3p2s80s, placeable);
    L17:
        throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + getBoundsAnimation().getValue() + ", current bounds: " + getSharedElement().getCurrentBounds()).toString());
    L13:
        r3 = false;
    L19:
        resolvedConstraints = constraints;
        goto L20
    }

    private final void updateCurrentBounds(LayoutCoordinates $this$updateCurrentBounds) {
        SharedElement r0 = getSharedElement();
        long r1 = getRootCoords().mo5723localPositionOfR5De75A($this$updateCurrentBounds, Offset.Companion.m4141getZeroF1C5BW0());
        long arg0$iv = $this$updateCurrentBounds.mo5722getSizeYbymL2g();
        float width$iv = (int) (arg0$iv >> 32);
        long arg0$iv2 = $this$updateCurrentBounds.mo5722getSizeYbymL2g();
        float height$iv = (int) (arg0$iv2 & 4294967295L);
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        r0.setCurrentBounds(RectKt.m4165Recttz77jQw(r1, Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv))));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(final ContentDrawScope $this$draw) {
        this.state.setFirstFrameDrawn$animation_release(true);
        SharedElementInternalState r0 = this.state;
        SharedTransitionScope.OverlayClip r1 = this.state.getOverlayClip();
        SharedTransitionScope.SharedContentState r2 = this.state.getUserState();
        Rect r3 = getSharedElement().getCurrentBounds();
        Intrinsics.checkNotNull(r3);
        r0.setClipPathInOverlay$animation_release(r1.getClipPath(r2, r3, $this$draw.getLayoutDirection(), DelegatableNodeKt.requireDensity(this)));
        GraphicsLayer layer = this.state.getLayer();
        if (layer == null) goto L9;
        DrawScope.m4915recordJVtK1S4$default($this$draw, layer, 0, new C01811($this$draw, this), 1, null);
        if (this.state.getShouldRenderInPlace() == false) goto L10;
        GraphicsLayerKt.drawLayer($this$draw, layer);
        return;
    L10:
        return;
    L9:
        throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + getSharedElement().getKey() + ",target: " + this.state.getBoundsAnimation().getTarget() + ", is attached: " + isAttached()).toString());
    }
}
