package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010M\u001a\u00020=2\u0006\u0010N\u001a\u00020\u0011H\u0000¢\u0006\u0002\bOJ\u0010\u0010P\u001a\u00020=2\u0006\u0010Q\u001a\u00020=H\u0016J\u0010\u0010R\u001a\u00020=2\u0006\u0010S\u001a\u00020=H\u0016J\u0010\u0010T\u001a\u00020=2\u0006\u0010Q\u001a\u00020=H\u0016J\u0010\u0010U\u001a\u00020=2\u0006\u0010S\u001a\u00020=H\u0016J)\u0010V\u001a\u00020W2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00070YH\u0086\bø\u0001\u0000¢\u0006\u0004\bZ\u0010[J=\u0010\\\u001a\u00020]2\u0006\u0010D\u001a\u00020E2\u0006\u0010^\u001a\u00020\"2\u0019\u0010_\u001a\u0015\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020]\u0018\u00010`¢\u0006\u0002\bbH\u0004ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ\b\u0010e\u001a\u00020]H\u0014J\u001a\u0010f\u001a\u00020]2\u0006\u0010D\u001a\u00020EH\u0002ø\u0001\u0000¢\u0006\u0004\bg\u0010HJ\u001a\u0010h\u001a\u00020]2\u0006\u0010D\u001a\u00020EH\u0000ø\u0001\u0000¢\u0006\u0004\bi\u0010HJ%\u0010j\u001a\u00020E2\u0006\u0010k\u001a\u00020\u00002\u0006\u0010l\u001a\u00020(H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010nJ\r\u0010o\u001a\u00020]H\u0010¢\u0006\u0002\bpR\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00188@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001c\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020=\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010>\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0016R\u0016\u0010@\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\"\u0010D\u001a\u00020EX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010I\u001a\u0004\bF\u0010\u001a\"\u0004\bG\u0010HR\u001a\u0010J\u001a\u00020K8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bL\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "result", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "set_measureResult", "(Landroidx/compose/ui/layout/MeasureResult;)V", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "cachedAlignmentLinesMap", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/layout/AlignmentLine;", "getCachedAlignmentLinesMap", "()Landroidx/collection/MutableObjectIntMap;", "child", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-msEJaDk$ui_release", "()J", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "hasMeasureResult", "", "getHasMeasureResult", "()Z", "isLookingAhead", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "lookaheadLayoutCoordinates", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "getLookaheadLayoutCoordinates", "()Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "measureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "oldAlignmentLines", "", "", "parent", "getParent", "parentData", "", "getParentData", "()Ljava/lang/Object;", "position", "Landroidx/compose/ui/unit/IntOffset;", "getPosition-nOcc-ac", "setPosition--gyyYBs", "(J)V", "J", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g$ui_release", "getCachedAlignmentLine", "alignmentLine", "getCachedAlignmentLine$ui_release", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "performingMeasure", "Landroidx/compose/ui/layout/Placeable;", "block", "Lkotlin/Function0;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "placeAt", "", "zIndex", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeChildren", "placeSelf", "placeSelf--gyyYBs", "placeSelfApparentToRealOffset", "placeSelfApparentToRealOffset--gyyYBs$ui_release", "positionIn", "ancestor", "excludingAgnosticOffset", "positionIn-iSbpLlY$ui_release", "(Landroidx/compose/ui/node/LookaheadDelegate;Z)J", "replace", "replace$ui_release", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public static final int $stable = 0;
    private MeasureResult _measureResult;
    private final MutableObjectIntMap<AlignmentLine> cachedAlignmentLinesMap;
    private final NodeCoordinator coordinator;
    private final LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position;

    static {
    }

    /* JADX INFO: renamed from: access$setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public static final /* synthetic */ void m5910access$setMeasurementConstraintsBRTryo0(LookaheadDelegate $this, long value) {
        $this.m5777setMeasurementConstraintsBRTryo0(value);
    }

    public static final /* synthetic */ void access$set_measureResult(LookaheadDelegate $this, MeasureResult result) {
        $this.set_measureResult(result);
    }

    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    public LookaheadDelegate(NodeCoordinator coordinator) {
        this.coordinator = coordinator;
        this.position = IntOffset.Companion.m7112getZeronOccac();
        this.lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);
        this.cachedAlignmentLinesMap = ObjectIntMapKt.mutableObjectIntMapOf();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator r0 = this.coordinator.getWrapped$ui_release();
        if (r0 == null) goto L5;
        LookaheadDelegate r1 = r0.getLookaheadDelegate();
    L7:
        return r1;
    L5:
        r1 = null;
        goto L7
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        if (this._measureResult == null) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac */
    public long mo5909getPositionnOccac() {
        return this.position;
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m5917setPositiongyyYBs(long r1) {
        this.position = r1;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult r0 = this._measureResult;
        if (r0 == null) goto L5;
        return r0;
    L5:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator r0 = this.coordinator.getWrappedBy$ui_release();
        if (r0 == null) goto L5;
        LookaheadDelegate r1 = r0.getLookaheadDelegate();
    L7:
        return r1;
    L5:
        r1 = null;
        goto L7
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g$ui_release, reason: not valid java name */
    public final long m5913getSizeYbymL2g$ui_release() {
        int width$iv = getWidth();
        int height$iv = getHeight();
        return IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m5912getConstraintsmsEJaDk$ui_release() {
        return m5774getMeasurementConstraintsmsEJaDk();
    }

    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner r0 = this.coordinator.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    private final void set_measureResult(MeasureResult result) {
        if (result == null) goto L4;
        int width$iv = result.getWidth();
        int height$iv = result.getHeight();
        m5776setMeasuredSizeozmzZPI(IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L)));
        Unit r0 = Unit.INSTANCE;
    L5:
        if (r0 != null) goto L8;
        LookaheadDelegate $this$_set__measureResult__u24lambda_u241 = this;
        $this$_set__measureResult__u24lambda_u241.m5776setMeasuredSizeozmzZPI(IntSize.Companion.m7149getZeroYbymL2g());
    L8:
        if (Intrinsics.areEqual(this._measureResult, result) == true) goto L26;
        if (result == null) goto L26;
        Map<AlignmentLine, Integer> r1 = this.oldAlignmentLines;
        if (r1 != null) goto L13;
    L16:
        boolean r2 = true;
    L17:
        if (r2 == false) goto L21;
        if (result.getAlignmentLines().isEmpty() == true) goto L26;
    L21:
        if (Intrinsics.areEqual(result.getAlignmentLines(), this.oldAlignmentLines) == true) goto L26;
        getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
        LinkedHashMap r3 = this.oldAlignmentLines;
        if (r3 != null) goto L25;
        r3 = new LinkedHashMap();
        this.oldAlignmentLines = r3;
    L25:
        r3.clear();
        r3.putAll(result.getAlignmentLines());
        goto L26
    L13:
        if (r1.isEmpty() == true) goto L16;
        r2 = false;
    L26:
        this._measureResult = result;
        return;
    L4:
        r0 = null;
        goto L5
    }

    protected final MutableObjectIntMap<AlignmentLine> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    public final int getCachedAlignmentLine$ui_release(AlignmentLine alignmentLine) {
        return this.cachedAlignmentLinesMap.getOrDefault(alignmentLine, Integer.MIN_VALUE);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo5715placeAtf8xVGno(mo5909getPositionnOccac(), 0.0f, null);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    protected final void mo5715placeAtf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r5) {
        m5911placeSelfgyyYBs(position);
        if (isShallowPlacing$ui_release() == false) goto L5;
        return;
    L5:
        placeChildren();
    }

    /* JADX INFO: renamed from: placeSelf--gyyYBs, reason: not valid java name */
    private final void m5911placeSelfgyyYBs(long position) {
        if (IntOffset.m7100equalsimpl0(mo5909getPositionnOccac(), position) == true) goto L9;
        m5917setPositiongyyYBs(position);
        LookaheadPassDelegate r0 = getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
        if (r0 == null) goto L7;
        r0.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
    L7:
        invalidateAlignmentLinesFromPositionChange(this.coordinator);
    L9:
        if (isPlacingForAlignment$ui_release() == true) goto L12;
        captureRulers$ui_release(getMeasureResult$ui_release());
        return;
    }

    /* JADX INFO: renamed from: placeSelfApparentToRealOffset--gyyYBs$ui_release, reason: not valid java name */
    public final void m5915placeSelfApparentToRealOffsetgyyYBs$ui_release(long position) {
        m5911placeSelfgyyYBs(IntOffset.m7105plusqkQi6aY(position, m5772getApparentToRealOffsetnOccac()));
    }

    protected void placeChildren() {
        getMeasureResult$ui_release().placeChildren();
    }

    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m5914performingMeasureK40F9xA(long constraints, Function0<? extends MeasureResult> r5) {
        m5910access$setMeasurementConstraintsBRTryo0(this, constraints);
        access$set_measureResult(this, r5.invoke());
        return this;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    public int minIntrinsicWidth(int height) {
        NodeCoordinator r0 = this.coordinator.getWrapped$ui_release();
        Intrinsics.checkNotNull(r0);
        LookaheadDelegate r1 = r0.getLookaheadDelegate();
        Intrinsics.checkNotNull(r1);
        return r1.minIntrinsicWidth(height);
    }

    public int maxIntrinsicWidth(int height) {
        NodeCoordinator r0 = this.coordinator.getWrapped$ui_release();
        Intrinsics.checkNotNull(r0);
        LookaheadDelegate r1 = r0.getLookaheadDelegate();
        Intrinsics.checkNotNull(r1);
        return r1.maxIntrinsicWidth(height);
    }

    public int minIntrinsicHeight(int width) {
        NodeCoordinator r0 = this.coordinator.getWrapped$ui_release();
        Intrinsics.checkNotNull(r0);
        LookaheadDelegate r1 = r0.getLookaheadDelegate();
        Intrinsics.checkNotNull(r1);
        return r1.minIntrinsicHeight(width);
    }

    public int maxIntrinsicHeight(int width) {
        NodeCoordinator r0 = this.coordinator.getWrapped$ui_release();
        Intrinsics.checkNotNull(r0);
        LookaheadDelegate r1 = r0.getLookaheadDelegate();
        Intrinsics.checkNotNull(r1);
        return r1.maxIntrinsicHeight(width);
    }

    /* JADX INFO: renamed from: positionIn-iSbpLlY$ui_release, reason: not valid java name */
    public final long m5916positionIniSbpLlY$ui_release(LookaheadDelegate ancestor, boolean excludingAgnosticOffset) {
        long aggregatedOffset = IntOffset.Companion.m7112getZeronOccac();
        LookaheadDelegate lookaheadDelegate = this;
    L4:
        if (Intrinsics.areEqual(lookaheadDelegate, ancestor) == true) goto L10;
        if (lookaheadDelegate.isPlacedUnderMotionFrameOfReference() == false) goto L8;
        if (excludingAgnosticOffset == false) goto L8;
    L9:
        NodeCoordinator r3 = lookaheadDelegate.coordinator.getWrappedBy$ui_release();
        Intrinsics.checkNotNull(r3);
        LookaheadDelegate r4 = r3.getLookaheadDelegate();
        Intrinsics.checkNotNull(r4);
        lookaheadDelegate = r4;
    L8:
        aggregatedOffset = IntOffset.m7105plusqkQi6aY(aggregatedOffset, lookaheadDelegate.mo5909getPositionnOccac());
        goto L9
    L10:
        return aggregatedOffset;
    }
}
