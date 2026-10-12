package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InnerNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 B2\u00020\u0001:\u0002BCB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J:\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011H\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0016J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011H\u0016J\u0010\u0010.\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0016J\b\u0010/\u001a\u00020\u0015H\u0002J\u001a\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J=\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0019\u0010:\u001a\u0015\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0015\u0018\u00010;¢\u0006\u0002\b=H\u0014ø\u0001\u0000¢\u0006\u0004\b>\u0010?J*\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010@\u001a\u000204H\u0014ø\u0001\u0000¢\u0006\u0004\b>\u0010AR(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@TX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "<set-?>", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "tail", "Landroidx/compose/ui/node/TailModifierNode;", "getTail", "()Landroidx/compose/ui/node/TailModifierNode;", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "ensureLookaheadDelegateCreated", "", "hitTestChild", "hitTestSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "isInLayer", "", "hitTestChild-qzLsGqo", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "onAfterPlaceAt", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "placeAt", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Companion", "LookaheadDelegateImpl", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Paint innerBoundsPaint = null;
    private LookaheadDelegate lookaheadDelegate;
    private final TailModifierNode tail;

    /* JADX INFO: compiled from: InnerNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$Companion;", "", "()V", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.access$getInnerBoundsPaint$cp();
        }
    }

    /* JADX INFO: compiled from: InnerNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl;", "Landroidx/compose/ui/node/LookaheadDelegate;", "(Landroidx/compose/ui/node/InnerNodeCoordinator;)V", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "placeChildren", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class LookaheadDelegateImpl extends LookaheadDelegate {
        final /* synthetic */ InnerNodeCoordinator this$0;

        public LookaheadDelegateImpl(InnerNodeCoordinator this$0) {
            this.this$0 = this$0;
            super(this$0);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo5714measureBRTryo0(long constraints) {
            LookaheadDelegateImpl this_$iv = this;
            LookaheadDelegate.m5910access$setMeasurementConstraintsBRTryo0(this_$iv, constraints);
            MutableVector<LayoutNode> r7 = getLayoutNode().get_children$ui_release();
            int i$iv$iv = 0;
            Object[] content$iv$iv = r7.content;
            int size$iv$iv = r7.getSize();
        L3:
            if (i$iv$iv >= size$iv$iv) goto L5;
            LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
            LookaheadPassDelegate r14 = it.getLookaheadPassDelegate$ui_release();
            Intrinsics.checkNotNull(r14);
            r14.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
            i$iv$iv = i$iv$iv + 1;
            goto L3
        L5:
            MeasurePolicy $this$measure_BRTryo0_u24lambda_u242_u24lambda_u241 = getLayoutNode().getMeasurePolicy();
            MeasureResult measureResult = $this$measure_BRTryo0_u24lambda_u242_u24lambda_u241.mo32measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), constraints);
            LookaheadDelegate.access$set_measureResult(this_$iv, measureResult);
            return this_$iv;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            Integer r0 = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            if (r0 == null) goto L5;
            int r1 = r0.intValue();
        L6:
            int it = r1;
            getCachedAlignmentLinesMap().set(alignmentLine, it);
            return r1;
        L5:
            r1 = Integer.MIN_VALUE;
            goto L6
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        protected void placeChildren() {
            LookaheadPassDelegate r0 = getLayoutNode().getLookaheadPassDelegate$ui_release();
            Intrinsics.checkNotNull(r0);
            r0.onNodePlaced$ui_release();
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            return getLayoutNode().minLookaheadIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            return getLayoutNode().minLookaheadIntrinsicHeight(width);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            return getLayoutNode().maxLookaheadIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            return getLayoutNode().maxLookaheadIntrinsicHeight(width);
        }
    }

    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        this.tail = new TailModifierNode();
        getTail().updateCoordinator$ui_release(this);
        if (layoutNode.getLookaheadRoot$ui_release() == null) goto L5;
        LookaheadDelegateImpl r0 = new LookaheadDelegateImpl(this);
    L6:
        this.lookaheadDelegate = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    public static final /* synthetic */ Paint access$getInnerBoundsPaint$cp() {
        return innerBoundsPaint;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public /* bridge */ /* synthetic */ Modifier.Node getTail() {
        return getTail();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public TailModifierNode getTail() {
        return this.tail;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected void setLookaheadDelegate(LookaheadDelegate r1) {
        this.lookaheadDelegate = r1;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() != null) goto L6;
        setLookaheadDelegate(new LookaheadDelegateImpl(this));
        return;
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo5714measureBRTryo0(long constraints) {
        if (getForceMeasureWithLookaheadConstraints$ui_release() == false) goto L5;
        LookaheadDelegate r1 = getLookaheadDelegate();
        Intrinsics.checkNotNull(r1);
        long constraints2 = r1.m5912getConstraintsmsEJaDk$ui_release();
    L6:
        InnerNodeCoordinator this_$iv = this;
        NodeCoordinator.m5943access$setMeasurementConstraintsBRTryo0(this_$iv, constraints2);
        MutableVector<LayoutNode> r8 = getLayoutNode().get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r8.content;
        int size$iv$iv = r8.getSize();
    L7:
        if (i$iv$iv >= size$iv$iv) goto L9;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        NodeCoordinator this_$iv2 = this_$iv;
        it.getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        goto L7
    L9:
        MeasurePolicy $this$measure_BRTryo0_u24lambda_u242_u24lambda_u241 = getLayoutNode().getMeasurePolicy();
        setMeasureResult$ui_release($this$measure_BRTryo0_u24lambda_u242_u24lambda_u241.mo32measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), constraints2));
        onMeasured();
        return this;
    L5:
        constraints2 = constraints;
        goto L6
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return getLayoutNode().minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return getLayoutNode().minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return getLayoutNode().maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return getLayoutNode().maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    protected void mo5775placeAtf8xVGno(long position, float zIndex, GraphicsLayer layer) {
        super.mo5775placeAtf8xVGno(position, zIndex, layer);
        onAfterPlaceAt();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    protected void mo5715placeAtf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r4) {
        super.mo5715placeAtf8xVGno(position, zIndex, r4);
        onAfterPlaceAt();
    }

    private final void onAfterPlaceAt() {
        if (isShallowPlacing$ui_release() == false) goto L5;
        return;
    L5:
        getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegate r0 = getLookaheadDelegate();
        if (r0 != null) goto L10;
        Integer r1 = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (r1 != null) goto L11;
        return Integer.MIN_VALUE;
    L11:
        return r1.intValue();
    L10:
        return r0.calculateAlignmentLine(alignmentLine);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        Owner owner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> r1 = getLayoutNode().getZSortedChildren();
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L3:
        if (i$iv >= size$iv) goto L9;
        LayoutNode child = (LayoutNode) content$iv[i$iv];
        if (child.isPlaced() == false) goto L7;
        child.draw$ui_release(canvas, graphicsLayer);
    L7:
        i$iv = i$iv + 1;
        goto L3
    L9:
        if (owner.getShowLayoutBounds() == false) goto L15;
        drawBorder(canvas, innerBoundsPaint);
        return;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: hitTestChild-qzLsGqo, reason: not valid java name */
    public void mo5880hitTestChildqzLsGqo(NodeCoordinator.HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        long r3 = pointerPosition;
        boolean inLayer = isInLayer;
        NodeCoordinator.HitTestSource r6 = hitTestSource;
        if (r6.shouldHitTestChildren(getLayoutNode()) == true) goto L5;
        int r7 = pointerType;
    L16:
        boolean hitTestChildren = false;
    L17:
        if (hitTestChildren == false) goto L39;
        int depth$iv = HitTestResult.access$getHitDepth$p(hitTestResult);
        MutableVector<LayoutNode> r15 = getLayoutNode().getZSortedChildren();
        Object[] content$iv = r15.content;
        int i$iv = r15.getSize() - 1;
    L19:
        if (i$iv < 0) goto L37;
        LayoutNode child = (LayoutNode) content$iv[i$iv];
        if (child.isPlaced() == false) goto L32;
        int r19 = r7;
        boolean inLayer2 = inLayer;
        Object[] content$iv2 = content$iv;
        r6.mo5971childHitTestqzLsGqo(child, r3, hitTestResult, r19, inLayer2);
        boolean wasHit = hitTestResult.hasHit();
        if (wasHit == true) goto L26;
        boolean continueHitTest = true;
    L29:
        if (continueHitTest == true) goto L31;
        boolean wasHit2 = true;
    L34:
        if (wasHit2 == true) goto L37;
        i$iv = i$iv - 1;
        r6 = hitTestSource;
        r3 = pointerPosition;
        inLayer = inLayer2;
        content$iv = content$iv2;
        r7 = pointerType;
        goto L19
    L31:
        wasHit2 = false;
        goto L34
    L26:
        if (child.getOuterCoordinator$ui_release().shouldSharePointerInputWithSiblings() == false) goto L28;
        hitTestResult.acceptHits();
        continueHitTest = true;
        goto L29
    L28:
        continueHitTest = false;
        goto L29
    L32:
        inLayer2 = inLayer;
        content$iv2 = content$iv;
        wasHit2 = false;
    L37:
        HitTestResult.access$setHitDepth$p(hitTestResult, depth$iv);
        return;
    L39:
        return;
    L5:
        if (m5970withinLayerBoundsk4lQ0M(r3) == false) goto L7;
        r7 = pointerType;
        hitTestChildren = true;
        goto L17
    L7:
        r7 = pointerType;
        if (PointerType.m5660equalsimpl0(r7, PointerType.Companion.m5667getTouchT8wyACA()) == false) goto L16;
        float $this$fastIsFinite$iv = m5958distanceInMinimumTouchTargettz77jQw(r3, m5961getMinimumTouchTargetSizeNHjbRc());
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv) & Integer.MAX_VALUE) >= 2139095040) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L16;
        inLayer = false;
        hitTestChildren = true;
        goto L17
    L12:
        r5 = false;
        goto L13
    }

    static {
        Companion = new Companion(null);
        Paint paint = AndroidPaint_androidKt.Paint();
        paint.mo4245setColor8_81llA(Color.Companion.m4400getRed0d7_KjU());
        paint.setStrokeWidth(1.0f);
        paint.mo4249setStylek9PVt8s(PaintingStyle.Companion.m4634getStrokeTiuSbCo());
        innerBoundsPaint = paint;
    }
}
