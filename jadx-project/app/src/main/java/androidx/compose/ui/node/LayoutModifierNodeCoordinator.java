package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 G2\u00020\u0001:\u0002GHB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020$H\u0016J\u0010\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$H\u0016J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020$2\u0006\u0010*\u001a\u00020$H\u0016J\u0010\u00103\u001a\u00020$2\u0006\u0010,\u001a\u00020$H\u0016J\b\u00104\u001a\u00020(H\u0002J\u001a\u00105\u001a\u00020(2\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J=\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0019\u0010?\u001a\u0015\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020(\u0018\u00010@¢\u0006\u0002\bBH\u0014ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ*\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010E\u001a\u000209H\u0014ø\u0001\u0000¢\u0006\u0004\bC\u0010FR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016@TX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "measureNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutModifierNode;)V", "approachMeasureScope", "Landroidx/compose/ui/layout/ApproachMeasureScopeImpl;", "value", "layoutModifierNode", "getLayoutModifierNode", "()Landroidx/compose/ui/node/LayoutModifierNode;", "setLayoutModifierNode$ui_release", "(Landroidx/compose/ui/node/LayoutModifierNode;)V", "lookaheadConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLookaheadConstraints-DWUhwKw$ui_release", "()Landroidx/compose/ui/unit/Constraints;", "setLookaheadConstraints-_Sx5XlM$ui_release", "(Landroidx/compose/ui/unit/Constraints;)V", "<set-?>", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "tail", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "wrappedNonNull", "getWrappedNonNull", "()Landroidx/compose/ui/node/NodeCoordinator;", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "ensureLookaheadDelegateCreated", "", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "onAfterPlaceAt", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "placeAt", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Companion", "LookaheadDelegateForLayoutModifierNode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Paint modifierBoundsPaint = null;
    private ApproachMeasureScopeImpl approachMeasureScope;
    private LayoutModifierNode layoutModifierNode;
    private Constraints lookaheadConstraints;
    private LookaheadDelegate lookaheadDelegate;

    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$Companion;", "", "()V", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getModifierBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.access$getModifierBoundsPaint$cp();
        }
    }

    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;)V", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        final /* synthetic */ LayoutModifierNodeCoordinator this$0;

        public LookaheadDelegateForLayoutModifierNode(LayoutModifierNodeCoordinator this$0) {
            this.this$0 = this$0;
            super(this$0);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo5714measureBRTryo0(long constraints) {
            LookaheadDelegateForLayoutModifierNode this_$iv = this;
            LayoutModifierNodeCoordinator r1 = this.this$0;
            LookaheadDelegate.m5910access$setMeasurementConstraintsBRTryo0(this_$iv, constraints);
            r1.m5883setLookaheadConstraints_Sx5XlM$ui_release(Constraints.m6913boximpl(constraints));
            LayoutModifierNode $this$measure_BRTryo0_u24lambda_u241_u24lambda_u240 = r1.getLayoutModifierNode();
            LookaheadDelegate r2 = r1.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(r2);
            LookaheadDelegate.access$set_measureResult(this_$iv, $this$measure_BRTryo0_u24lambda_u241_u24lambda_u240.mo60measure3p2s80s(this, r2, constraints));
            return this_$iv;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            int it = LayoutModifierNodeCoordinatorKt.access$calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().set(alignmentLine, it);
            return it;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            LayoutModifierNode $this$minIntrinsicWidth_u24lambda_u243 = this.this$0.getLayoutModifierNode();
            LookaheadDelegate r1 = this.this$0.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(r1);
            return $this$minIntrinsicWidth_u24lambda_u243.minIntrinsicWidth(this, r1, height);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            LayoutModifierNode $this$maxIntrinsicWidth_u24lambda_u244 = this.this$0.getLayoutModifierNode();
            LookaheadDelegate r1 = this.this$0.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(r1);
            return $this$maxIntrinsicWidth_u24lambda_u244.maxIntrinsicWidth(this, r1, height);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            LayoutModifierNode $this$minIntrinsicHeight_u24lambda_u245 = this.this$0.getLayoutModifierNode();
            LookaheadDelegate r1 = this.this$0.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(r1);
            return $this$minIntrinsicHeight_u24lambda_u245.minIntrinsicHeight(this, r1, width);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            LayoutModifierNode $this$maxIntrinsicHeight_u24lambda_u246 = this.this$0.getLayoutModifierNode();
            LookaheadDelegate r1 = this.this$0.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(r1);
            return $this$maxIntrinsicHeight_u24lambda_u246.maxIntrinsicHeight(this, r1, width);
        }
    }

    public static final /* synthetic */ ApproachMeasureScopeImpl access$getApproachMeasureScope$p(LayoutModifierNodeCoordinator $this) {
        return $this.approachMeasureScope;
    }

    public static final /* synthetic */ Paint access$getModifierBoundsPaint$cp() {
        return modifierBoundsPaint;
    }

    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode measureNode) {
        super(layoutNode);
        this.layoutModifierNode = measureNode;
        ApproachMeasureScopeImpl r1 = null;
        if (layoutNode.getLookaheadRoot$ui_release() == null) goto L5;
        LookaheadDelegateForLayoutModifierNode r0 = new LookaheadDelegateForLayoutModifierNode(this);
    L6:
        this.lookaheadDelegate = r0;
        Modifier.Node this_$iv = measureNode.getNode();
        if ((this_$iv.getKindSet$ui_release() & NodeKind.m5976constructorimpl(512)) == 0) goto L9;
        boolean r4 = true;
    L10:
        if (r4 == false) goto L13;
        Intrinsics.checkNotNull(measureNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
        r1 = new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) measureNode);
    L13:
        this.approachMeasureScope = r1;
        return;
    L9:
        r4 = false;
        goto L10
    L5:
        r0 = null;
        goto L6
    }

    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    public final void setLayoutModifierNode$ui_release(LayoutModifierNode value) {
        if (Intrinsics.areEqual(value, this.layoutModifierNode) == true) goto L15;
        Modifier.Node this_$iv = value.getNode();
        int r1 = NodeKind.m5976constructorimpl(512);
        if ((this_$iv.getKindSet$ui_release() & r1) == 0) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == false) goto L14;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
        ApproachLayoutModifierNode r0 = (ApproachLayoutModifierNode) value;
        ApproachMeasureScopeImpl it = this.approachMeasureScope;
        if (it == null) goto L12;
        it.setApproachNode((ApproachLayoutModifierNode) value);
    L13:
        this.approachMeasureScope = it;
        goto L15
    L12:
        it = new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) value);
        goto L13
    L14:
        this.approachMeasureScope = null;
        goto L15
    L7:
        r3 = false;
    L15:
        this.layoutModifierNode = value;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator r0 = getWrapped$ui_release();
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    /* JADX INFO: renamed from: getLookaheadConstraints-DWUhwKw$ui_release, reason: not valid java name */
    public final Constraints m5882getLookaheadConstraintsDWUhwKw$ui_release() {
        return this.lookaheadConstraints;
    }

    /* JADX INFO: renamed from: setLookaheadConstraints-_Sx5XlM$ui_release, reason: not valid java name */
    public final void m5883setLookaheadConstraints_Sx5XlM$ui_release(Constraints r1) {
        this.lookaheadConstraints = r1;
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
        setLookaheadDelegate(new LookaheadDelegateForLayoutModifierNode(this));
        return;
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo5714measureBRTryo0(long constraints) {
        if (getForceMeasureWithLookaheadConstraints$ui_release() == false) goto L9;
        Constraints r1 = this.lookaheadConstraints;
        if (r1 == null) goto L8;
        long constraints2 = r1.m6932unboximpl();
    L10:
        LayoutModifierNodeCoordinator this_$iv = this;
        NodeCoordinator.m5943access$setMeasurementConstraintsBRTryo0(this_$iv, constraints2);
        ApproachMeasureScopeImpl scope = access$getApproachMeasureScope$p(this);
        if (scope == null) goto L41;
        ApproachLayoutModifierNode $this$measure_BRTryo0_u24lambda_u245_u24lambda_u243_u24lambda_u242 = scope.getApproachNode();
        boolean reachedLookaheadSize = false;
        if ($this$measure_BRTryo0_u24lambda_u245_u24lambda_u243_u24lambda_u242.mo66isMeasurementApproachInProgressozmzZPI(scope.mo5691getLookaheadSizeYbymL2g()) == false) goto L15;
    L18:
        boolean r10 = true;
    L19:
        scope.setApproachMeasureRequired$ui_release(r10);
        if (scope.getApproachMeasureRequired$ui_release() == true) goto L22;
        getWrappedNonNull().setForceMeasureWithLookaheadConstraints$ui_release(true);
    L22:
        final MeasureResult result = $this$measure_BRTryo0_u24lambda_u245_u24lambda_u243_u24lambda_u242.mo65approachMeasure3p2s80s(scope, getWrappedNonNull(), constraints2);
        getWrappedNonNull().setForceMeasureWithLookaheadConstraints$ui_release(false);
        int r13 = result.getWidth();
        LookaheadDelegate r14 = getLookaheadDelegate();
        Intrinsics.checkNotNull(r14);
        if (r13 != r14.getWidth()) goto L29;
        int r15 = result.getHeight();
        LookaheadDelegate r16 = getLookaheadDelegate();
        Intrinsics.checkNotNull(r16);
        if (r15 != r16.getHeight()) goto L29;
        reachedLookaheadSize = true;
    L29:
        if (scope.getApproachMeasureRequired$ui_release() == true) goto L38;
        long r12 = getWrappedNonNull().mo5722getSizeYbymL2g();
        LookaheadDelegate r17 = getWrappedNonNull().getLookaheadDelegate();
        if (r17 == null) goto L33;
        IntSize r18 = IntSize.m7136boximpl(r17.m5913getSizeYbymL2g$ui_release());
    L35:
        if (IntSize.m7141equalsimpl(r12, r18) == false) goto L38;
        if (reachedLookaheadSize == true) goto L38;
        MeasureResult r19 = new LayoutModifierNodeCoordinator$measure$1$1$1$1(result, this);
    L40:
        if (r19 == null) goto L41;
    L42:
        setMeasureResult$ui_release(r19);
        onMeasured();
        return this;
    L33:
        r18 = null;
    L38:
        r19 = result;
        goto L40
    L15:
        if (Constraints.m6918equalsimpl(constraints2, m5882getLookaheadConstraintsDWUhwKw$ui_release()) == false) goto L18;
        r10 = false;
    L41:
        LayoutModifierNode $this$measure_BRTryo0_u24lambda_u245_u24lambda_u244 = getLayoutModifierNode();
        r19 = $this$measure_BRTryo0_u24lambda_u245_u24lambda_u244.mo60measure3p2s80s(this, getWrappedNonNull(), constraints2);
        goto L42
    L8:
        throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.".toString());
    L9:
        constraints2 = constraints;
        goto L10
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        ApproachMeasureScopeImpl $this$minIntrinsicWidth_u24lambda_u247 = this.approachMeasureScope;
        if ($this$minIntrinsicWidth_u24lambda_u247 == null) goto L5;
        ApproachLayoutModifierNode $this$minIntrinsicWidth_u24lambda_u247_u24lambda_u246 = $this$minIntrinsicWidth_u24lambda_u247.getApproachNode();
        return $this$minIntrinsicWidth_u24lambda_u247_u24lambda_u246.minApproachIntrinsicWidth($this$minIntrinsicWidth_u24lambda_u247, getWrappedNonNull(), height);
    L5:
        LayoutModifierNode $this$minIntrinsicWidth_u24lambda_u248 = this.layoutModifierNode;
        return $this$minIntrinsicWidth_u24lambda_u248.minIntrinsicWidth(this, getWrappedNonNull(), height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        ApproachMeasureScopeImpl $this$maxIntrinsicWidth_u24lambda_u2410 = this.approachMeasureScope;
        if ($this$maxIntrinsicWidth_u24lambda_u2410 == null) goto L5;
        ApproachLayoutModifierNode $this$maxIntrinsicWidth_u24lambda_u2410_u24lambda_u249 = $this$maxIntrinsicWidth_u24lambda_u2410.getApproachNode();
        return $this$maxIntrinsicWidth_u24lambda_u2410_u24lambda_u249.maxApproachIntrinsicWidth($this$maxIntrinsicWidth_u24lambda_u2410, getWrappedNonNull(), height);
    L5:
        LayoutModifierNode $this$maxIntrinsicWidth_u24lambda_u2411 = this.layoutModifierNode;
        return $this$maxIntrinsicWidth_u24lambda_u2411.maxIntrinsicWidth(this, getWrappedNonNull(), height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        ApproachMeasureScopeImpl $this$minIntrinsicHeight_u24lambda_u2413 = this.approachMeasureScope;
        if ($this$minIntrinsicHeight_u24lambda_u2413 == null) goto L5;
        ApproachLayoutModifierNode $this$minIntrinsicHeight_u24lambda_u2413_u24lambda_u2412 = $this$minIntrinsicHeight_u24lambda_u2413.getApproachNode();
        return $this$minIntrinsicHeight_u24lambda_u2413_u24lambda_u2412.minApproachIntrinsicHeight($this$minIntrinsicHeight_u24lambda_u2413, getWrappedNonNull(), width);
    L5:
        LayoutModifierNode $this$minIntrinsicHeight_u24lambda_u2414 = this.layoutModifierNode;
        return $this$minIntrinsicHeight_u24lambda_u2414.minIntrinsicHeight(this, getWrappedNonNull(), width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        ApproachMeasureScopeImpl $this$maxIntrinsicHeight_u24lambda_u2416 = this.approachMeasureScope;
        if ($this$maxIntrinsicHeight_u24lambda_u2416 == null) goto L5;
        ApproachLayoutModifierNode $this$maxIntrinsicHeight_u24lambda_u2416_u24lambda_u2415 = $this$maxIntrinsicHeight_u24lambda_u2416.getApproachNode();
        return $this$maxIntrinsicHeight_u24lambda_u2416_u24lambda_u2415.maxApproachIntrinsicHeight($this$maxIntrinsicHeight_u24lambda_u2416, getWrappedNonNull(), width);
    L5:
        LayoutModifierNode $this$maxIntrinsicHeight_u24lambda_u2417 = this.layoutModifierNode;
        return $this$maxIntrinsicHeight_u24lambda_u2417.maxIntrinsicHeight(this, getWrappedNonNull(), width);
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
        onPlaced();
        ApproachMeasureScopeImpl it = this.approachMeasureScope;
        if (it == null) goto L25;
        ApproachLayoutModifierNode $this$onAfterPlaceAt_u24lambda_u2420_u24lambda_u2419 = it.getApproachNode();
        Placeable.PlacementScope $this$onAfterPlaceAt_u24lambda_u2420_u24lambda_u2419_u24lambda_u2418 = getPlacementScope();
        LookaheadDelegate r7 = getLookaheadDelegate();
        Intrinsics.checkNotNull(r7);
        if ($this$onAfterPlaceAt_u24lambda_u2420_u24lambda_u2419.isPlacementApproachInProgress($this$onAfterPlaceAt_u24lambda_u2420_u24lambda_u2419_u24lambda_u2418, r7.getLookaheadLayoutCoordinates()) == false) goto L10;
    L23:
        boolean approachComplete = false;
    L24:
        getWrappedNonNull().setForcePlaceWithLookaheadOffset$ui_release(approachComplete);
        goto L25
    L10:
        if (it.getApproachMeasureRequired$ui_release() == true) goto L23;
        long r8 = mo5722getSizeYbymL2g();
        LookaheadDelegate r9 = getLookaheadDelegate();
        IntSize r10 = null;
        if (r9 == null) goto L14;
        IntSize r11 = IntSize.m7136boximpl(r9.m5913getSizeYbymL2g$ui_release());
    L16:
        if (IntSize.m7141equalsimpl(r8, r11) == false) goto L23;
        long r12 = getWrappedNonNull().mo5722getSizeYbymL2g();
        LookaheadDelegate r13 = getWrappedNonNull().getLookaheadDelegate();
        if (r13 == null) goto L21;
        r10 = IntSize.m7136boximpl(r13.m5913getSizeYbymL2g$ui_release());
    L21:
        if (IntSize.m7141equalsimpl(r12, r10) == false) goto L23;
        approachComplete = true;
        goto L24
    L14:
        r11 = null;
    L25:
        getMeasureResult$ui_release().placeChildren();
        getWrappedNonNull().setForcePlaceWithLookaheadOffset$ui_release(false);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegate r0 = getLookaheadDelegate();
        if (r0 == null) goto L6;
        return r0.getCachedAlignmentLine$ui_release(alignmentLine);
    L6:
        return LayoutModifierNodeCoordinatorKt.access$calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        getWrappedNonNull().draw(canvas, graphicsLayer);
        if (LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds() == false) goto L6;
        drawBorder(canvas, modifierBoundsPaint);
        return;
    }

    static {
        Companion = new Companion(null);
        Paint paint = AndroidPaint_androidKt.Paint();
        paint.mo4245setColor8_81llA(Color.Companion.m4393getBlue0d7_KjU());
        paint.setStrokeWidth(1.0f);
        paint.mo4249setStylek9PVt8s(PaintingStyle.Companion.m4634getStrokeTiuSbCo());
        modifierBoundsPaint = paint;
    }
}
