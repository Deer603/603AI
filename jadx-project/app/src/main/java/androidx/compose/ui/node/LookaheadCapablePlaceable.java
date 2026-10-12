package androidx.compose.ui.node;

import androidx.collection.MutableObjectFloatMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectFloatMap;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.Ruler;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000 e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010=\u001a\u00020>2\u0006\u0010 \u001a\u00020!2\u0006\u0010?\u001a\u000204H\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH&J\u0017\u0010D\u001a\u00020>2\b\u0010E\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0002\bFJ\u0010\u0010D\u001a\u00020>2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010I\u001a\u00020\u00002\u0006\u0010?\u001a\u000204H\u0002J\u0016\u0010J\u001a\u00020K2\u0006\u0010?\u001a\u0002042\u0006\u0010L\u001a\u00020KJ\u0011\u0010M\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0086\u0002J\u0010\u0010N\u001a\u00020>2\u0006\u0010?\u001a\u000204H\u0002J`\u0010O\u001a\u00020%2\u0006\u0010P\u001a\u00020A2\u0006\u0010Q\u001a\u00020A2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020A0S2\u0019\u0010T\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020>\u0018\u00010U¢\u0006\u0002\bV2\u0017\u0010W\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020>0U¢\u0006\u0002\bVH\u0016J\u001c\u0010X\u001a\u00020>2\u0012\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0605H\u0002J\u0016\u0010Z\u001a\u00020>2\u0006\u0010?\u001a\u0002042\u0006\u0010[\u001a\u00020KJ\u0016\u0010\\\u001a\u00020>2\u0006\u0010?\u001a\u0002042\u0006\u0010[\u001a\u00020KJ\r\u0010]\u001a\u00020>H ¢\u0006\u0002\b^J\u0010\u0010_\u001a\u00020>2\u0006\u0010`\u001a\u00020\u0013H\u0016J\f\u0010a\u001a\u00020>*\u00020bH\u0004J\u0014\u0010c\u001a\u00020\u0013*\u00020!2\u0006\u0010d\u001a\u00020!H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0019R\u0012\u0010 \u001a\u00020!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0012\u0010$\u001a\u00020%X \u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u0004\u0018\u00010\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\rR\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010.\u001a\u00020/X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b0\u00101R(\u00102\u001a\u001c\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0605\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u00107\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010:\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010<\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/MeasureScopeWithLayoutNode;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "()V", "_rulerScope", "Landroidx/compose/ui/layout/RulerScope;", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "child", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "hasMeasureResult", "", "getHasMeasureResult", "()Z", "isLookingAhead", "isPlacedUnderMotionFrameOfReference", "setPlacedUnderMotionFrameOfReference", "(Z)V", "isPlacingForAlignment", "isPlacingForAlignment$ui_release", "setPlacingForAlignment$ui_release", "isShallowPlacing", "isShallowPlacing$ui_release", "setShallowPlacing$ui_release", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "parent", "getParent", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "position", "Landroidx/compose/ui/unit/IntOffset;", "getPosition-nOcc-ac", "()J", "rulerReaders", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/layout/Ruler;", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/node/WeakReference;", "rulerScope", "getRulerScope", "()Landroidx/compose/ui/layout/RulerScope;", "rulerValues", "Landroidx/collection/MutableObjectFloatMap;", "rulerValuesCache", "addRulerReader", "", "ruler", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "captureRulers", "result", "captureRulers$ui_release", "placeableResult", "Landroidx/compose/ui/node/PlaceableResult;", "findAncestorRulerDefiner", "findRulerValue", "", "defaultValue", "get", "invalidateChildrenOfDefiningRuler", "layout", "width", "height", "alignmentLines", "", "rulers", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "placementBlock", "notifyRulerValueChange", "layoutNodes", "provideRelativeRulerValue", "value", "provideRulerValue", "replace", "replace$ui_release", "updatePlacedUnderMotionFrameOfReference", "newMFR", "invalidateAlignmentLinesFromPositionChange", "Landroidx/compose/ui/node/NodeCoordinator;", "isLayoutNodeAncestor", "ancestor", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Function1<PlaceableResult, Unit> onCommitAffectingRuler = null;
    private RulerScope _rulerScope;
    private boolean isPlacedUnderMotionFrameOfReference;
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;
    private final Placeable.PlacementScope placementScope;
    private MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> rulerReaders;
    private MutableObjectFloatMap<Ruler> rulerValues;
    private MutableObjectFloatMap<Ruler> rulerValuesCache;

    /* JADX INFO: compiled from: LookaheadDelegate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable$Companion;", "", "()V", "onCommitAffectingRuler", "Lkotlin/Function1;", "Landroidx/compose/ui/node/PlaceableResult;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    public abstract int calculateAlignmentLine(AlignmentLine r1);

    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    public abstract LookaheadCapablePlaceable getChild();

    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public abstract LayoutNode getLayoutNode();

    public abstract MeasureResult getMeasureResult$ui_release();

    public abstract LookaheadCapablePlaceable getParent();

    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public abstract long mo5909getPositionnOccac();

    public abstract void replace$ui_release();

    public static final /* synthetic */ void access$captureRulers(LookaheadCapablePlaceable $this, PlaceableResult placeableResult) {
        $this.captureRulers(placeableResult);
    }

    public LookaheadCapablePlaceable() {
        this.placementScope = PlaceableKt.PlacementScope(this);
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    public void setPlacedUnderMotionFrameOfReference(boolean r1) {
        this.isPlacedUnderMotionFrameOfReference = r1;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean newMFR) {
        LookaheadCapablePlaceable r0 = getParent();
        LayoutNode.LayoutState r1 = null;
        if (r0 == null) goto L5;
        LayoutNode parentNode = r0.getLayoutNode();
    L7:
        if (Intrinsics.areEqual(parentNode, getLayoutNode()) == false) goto L10;
        setPlacedUnderMotionFrameOfReference(newMFR);
        return;
    L10:
        if (parentNode == null) goto L12;
        LayoutNode.LayoutState r2 = parentNode.getLayoutState$ui_release();
    L14:
        if (r2 == LayoutNode.LayoutState.LayingOut) goto L19;
        if (parentNode == null) goto L18;
        r1 = parentNode.getLayoutState$ui_release();
    L18:
        if (r1 == LayoutNode.LayoutState.LookaheadLayingOut) goto L19;
        return;
    L19:
        setPlacedUnderMotionFrameOfReference(newMFR);
        return;
    L12:
        r2 = null;
        goto L14
    L5:
        parentNode = null;
        goto L7
    }

    public final RulerScope getRulerScope() {
        RulerScope r0 = this._rulerScope;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new LookaheadCapablePlaceable$rulerScope$1(this);
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(AlignmentLine alignmentLine) {
        if (getHasMeasureResult() == true) goto L5;
        return Integer.MIN_VALUE;
    L5:
        int measuredPosition = calculateAlignmentLine(alignmentLine);
        if (measuredPosition != Integer.MIN_VALUE) goto L9;
        return Integer.MIN_VALUE;
    L9:
        if ((alignmentLine instanceof VerticalAlignmentLine) == false) goto L11;
        int r1 = IntOffset.m7101getXimpl(m5772getApparentToRealOffsetnOccac());
    L13:
        return r1 + measuredPosition;
    L11:
        r1 = IntOffset.m7102getYimpl(m5772getApparentToRealOffsetnOccac());
        goto L13
    }

    public final boolean isShallowPlacing$ui_release() {
        return this.isShallowPlacing;
    }

    public final void setShallowPlacing$ui_release(boolean r1) {
        this.isShallowPlacing = r1;
    }

    public final boolean isPlacingForAlignment$ui_release() {
        return this.isPlacingForAlignment;
    }

    public final void setPlacingForAlignment$ui_release(boolean r1) {
        this.isPlacingForAlignment = r1;
    }

    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    protected final void invalidateAlignmentLinesFromPositionChange(NodeCoordinator $this$invalidateAlignmentLinesFromPositionChange) {
        NodeCoordinator r0 = $this$invalidateAlignmentLinesFromPositionChange.getWrapped$ui_release();
        if (r0 == null) goto L5;
        LayoutNode r1 = r0.getLayoutNode();
    L7:
        if (Intrinsics.areEqual(r1, $this$invalidateAlignmentLinesFromPositionChange.getLayoutNode()) == true) goto L9;
        $this$invalidateAlignmentLinesFromPositionChange.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
        return;
    L9:
        AlignmentLinesOwner r2 = $this$invalidateAlignmentLinesFromPositionChange.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (r2 == null) goto L16;
        AlignmentLines r3 = r2.getAlignmentLines();
        if (r3 == null) goto L17;
        r3.onAlignmentsChanged();
        return;
    L17:
        return;
    L16:
        return;
    L5:
        r1 = null;
        goto L7
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    public final float findRulerValue(Ruler ruler, float defaultValue) {
        if (this.isPlacingForAlignment == false) goto L5;
        return defaultValue;
    L5:
        LookaheadCapablePlaceable p = this;
    L6:
        MutableObjectFloatMap<Ruler> r1 = p.rulerValues;
        float rulerValue = Float.NaN;
        if (r1 == null) goto L10;
        rulerValue = r1.getOrDefault(ruler, Float.NaN);
    L10:
        if (Float.isNaN(rulerValue) == false) goto L11;
        LookaheadCapablePlaceable parent = p.getParent();
        if (parent == null) goto L15;
        p = parent;
        goto L6
    L15:
        p.addRulerReader(getLayoutNode(), ruler);
        return defaultValue;
    L11:
        p.addRulerReader(getLayoutNode(), ruler);
        return ruler.calculateCoordinate$ui_release(rulerValue, p.getCoordinates(), getCoordinates());
    }

    private final void addRulerReader(LayoutNode layoutNode, Ruler ruler) {
        ScatterMap r2 = this.rulerReaders;
        if (r2 == null) goto L58;
        ScatterMap this_$iv = r2;
        int $i$f$forEachValue = 0;
        Object[] v$iv = this_$iv.values;
        long r17 = 128;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        long r19 = 255;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L55;
    L6:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r23 = 8;
        char r25 = 7;
        long r26 = -9187201950435737472L;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L52;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L9:
        if (j$iv$iv >= bitCount$iv$iv) goto L49;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L13;
        boolean r7 = true;
    L14:
        if (r7 == false) goto L47;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int index$iv = index$iv$iv;
        MutableScatterSet set = (MutableScatterSet) v$iv[index$iv];
        Object[] elements$iv = set.elements;
        ScatterMap this_$iv2 = this_$iv;
        MutableScatterSet this_$iv$iv = set;
        long[] m$iv$iv2 = m$iv$iv;
        long[] m$iv$iv3 = this_$iv$iv.metadata;
        int lastIndex$iv$iv2 = m$iv$iv3.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L44;
    L17:
        long slot$iv$iv2 = m$iv$iv3[i$iv$iv2];
        int j$iv$iv2 = j$iv$iv;
        int index$iv$iv2 = index$iv$iv;
        Object[] elements$iv2 = elements$iv;
        int $i$f$forEachValue2 = $i$f$forEachValue;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv2) << 7) & slot$iv$iv2) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L41;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
        int j$iv$iv3 = 0;
    L20:
        if (j$iv$iv3 >= bitCount$iv$iv2) goto L38;
        long value$iv$iv$iv2 = slot$iv$iv2 & 255;
        if (value$iv$iv$iv2 >= 128) goto L24;
        boolean r12 = true;
    L25:
        if (r12 == false) goto L36;
        int index$iv$iv3 = (i$iv$iv2 << 3) + j$iv$iv3;
        WeakReference it = (WeakReference) elements$iv2[index$iv$iv3];
        LayoutNode r45 = (LayoutNode) it.get();
        if (r45 == null) goto L31;
        int j$iv$iv4 = j$iv$iv3;
        boolean r8 = r45.isAttached();
        int index$iv2 = index$iv;
        if (r8 != true) goto L32;
        int j$iv$iv5 = 1;
    L33:
        if (j$iv$iv5 != 0) goto L37;
        set.removeElementAt(index$iv$iv3);
    L37:
        slot$iv$iv2 = slot$iv$iv2 >> r23;
        j$iv$iv3 = j$iv$iv4 + 1;
        index$iv = index$iv2;
    L32:
        j$iv$iv5 = 0;
        goto L33
    L31:
        j$iv$iv4 = j$iv$iv3;
        index$iv2 = index$iv;
        goto L32
    L36:
        j$iv$iv4 = j$iv$iv3;
        index$iv2 = index$iv;
        goto L37
    L24:
        r12 = false;
        goto L25
    L38:
        int index$iv3 = index$iv;
        int j$iv$iv6 = r23;
        if (bitCount$iv$iv2 != j$iv$iv6) goto L48;
    L42:
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L48;
        i$iv$iv2 = i$iv$iv2 + 1;
        $i$f$forEachValue = $i$f$forEachValue2;
        elements$iv = elements$iv2;
        j$iv$iv = j$iv$iv2;
        index$iv$iv = index$iv$iv2;
        index$iv = index$iv3;
        r23 = 8;
    L48:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv2 + 1;
        r23 = 8;
        this_$iv = this_$iv2;
        m$iv$iv = m$iv$iv2;
        $i$f$forEachValue = $i$f$forEachValue2;
        goto L9
    L41:
        index$iv3 = index$iv;
        goto L42
    L44:
        j$iv$iv2 = j$iv$iv;
        $i$f$forEachValue2 = $i$f$forEachValue;
        goto L48
    L47:
        this_$iv2 = this_$iv;
        m$iv$iv2 = m$iv$iv;
        j$iv$iv2 = j$iv$iv;
        $i$f$forEachValue2 = $i$f$forEachValue;
        goto L48
    L13:
        r7 = false;
        goto L14
    L49:
        ScatterMap this_$iv3 = this_$iv;
        long[] m$iv$iv4 = m$iv$iv;
        int $i$f$forEachValue3 = $i$f$forEachValue;
        if (bitCount$iv$iv != r23) goto L59;
    L53:
        if (i$iv$iv == lastIndex$iv$iv) goto L59;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv3;
        m$iv$iv = m$iv$iv4;
        $i$f$forEachValue = $i$f$forEachValue3;
    L59:
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> r3 = this.rulerReaders;
        if (r3 == null) goto L87;
        int $i$f$removeIf = 0;
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> this_$iv$iv2 = r3;
        long[] m$iv$iv5 = this_$iv$iv2.metadata;
        int lastIndex$iv$iv3 = m$iv$iv5.length - 2;
        int i$iv$iv3 = 0;
        if (0 > lastIndex$iv$iv3) goto L87;
    L63:
        long slot$iv$iv3 = m$iv$iv5[i$iv$iv3];
        long $this$maskEmptyOrDeleted$iv$iv$iv2 = (((~slot$iv$iv3) << r25) & slot$iv$iv3) & r26;
        if ($this$maskEmptyOrDeleted$iv$iv$iv2 == r26) goto L81;
        int bitCount$iv$iv3 = 8 - ((~(i$iv$iv3 - lastIndex$iv$iv3)) >>> 31);
        int j$iv$iv7 = 0;
    L66:
        if (j$iv$iv7 >= bitCount$iv$iv3) goto L78;
        long value$iv$iv$iv3 = slot$iv$iv3 & r19;
        if (value$iv$iv$iv3 >= r17) goto L70;
        boolean r13 = true;
    L71:
        if (r13 == false) goto L76;
        int index$iv$iv4 = (i$iv$iv3 << 3) + j$iv$iv7;
        int $i$f$removeIf2 = $i$f$removeIf;
        Object r4 = r3.keys[index$iv$iv4];
        MutableScatterSet value = (MutableScatterSet) r3.values[index$iv$iv4];
        Ruler r21 = (Ruler) r4;
        if (value.isEmpty() == false) goto L77;
        r3.removeValueAt(index$iv$iv4);
    L77:
        slot$iv$iv3 = slot$iv$iv3 >> 8;
        j$iv$iv7 = j$iv$iv7 + 1;
        $i$f$removeIf = $i$f$removeIf2;
        goto L66
    L76:
        $i$f$removeIf2 = $i$f$removeIf;
        goto L77
    L70:
        r13 = false;
        goto L71
    L78:
        int $i$f$removeIf3 = $i$f$removeIf;
        if (bitCount$iv$iv3 != 8) goto L87;
    L82:
        if (i$iv$iv3 == lastIndex$iv$iv3) goto L87;
        i$iv$iv3 = i$iv$iv3 + 1;
        $i$f$removeIf = $i$f$removeIf3;
        goto L63
    L81:
        $i$f$removeIf3 = $i$f$removeIf;
    L87:
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> r5 = this.rulerReaders;
        DefaultConstructorMarker r6 = null;
        if (r5 != null) goto L90;
        r5 = new MutableScatterMap(0, 1, r6);
        this.rulerReaders = r5;
    L90:
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> r9 = r5;
        Object r10 = r9.get(ruler);
        if (r10 != null) goto L93;
        MutableScatterSet<WeakReference<LayoutNode>> r11 = new MutableScatterSet(0, 1, r6);
        r9.set(ruler, r11);
        r10 = r11;
    L93:
        Object it$iv = r10;
        ((MutableScatterSet) it$iv).plusAssign(new WeakReference(layoutNode));
        return;
    L52:
        this_$iv3 = this_$iv;
        m$iv$iv4 = m$iv$iv;
        $i$f$forEachValue3 = $i$f$forEachValue;
        goto L53
    L55:
        r25 = 7;
        r26 = -9187201950435737472L;
        goto L59
    L58:
        r17 = 128;
        r19 = 255;
        r25 = 7;
        r26 = -9187201950435737472L;
        goto L59
    }

    private final LookaheadCapablePlaceable findAncestorRulerDefiner(Ruler ruler) {
        LookaheadCapablePlaceable p = this;
    L3:
        ObjectFloatMap r1 = p.rulerValues;
        boolean r2 = false;
        if (r1 == null) goto L8;
        ObjectFloatMap this_$iv = r1;
        if (this_$iv.containsKey(ruler) != true) goto L8;
        r2 = true;
    L8:
        if (r2 == true) goto L9;
        LookaheadCapablePlaceable parent = p.getParent();
        if (parent == null) goto L12;
        p = parent;
        goto L3
    L12:
        return p;
    L9:
        return p;
    }

    private final boolean isLayoutNodeAncestor(LayoutNode $this$isLayoutNodeAncestor, LayoutNode ancestor) {
        if ($this$isLayoutNodeAncestor != ancestor) goto L5;
        return true;
    L5:
        LayoutNode r0 = $this$isLayoutNodeAncestor.getParent$ui_release();
        if (r0 != null) goto L10;
        return false;
    L10:
        return isLayoutNodeAncestor(r0, ancestor);
    }

    private final void invalidateChildrenOfDefiningRuler(Ruler ruler) {
        LookaheadCapablePlaceable definer = findAncestorRulerDefiner(ruler);
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> r1 = definer.rulerReaders;
        if (r1 == null) goto L5;
        MutableScatterSet<WeakReference<LayoutNode>> r2 = r1.remove(ruler);
    L6:
        if (r2 == null) goto L9;
        notifyRulerValueChange(r2);
        return;
    L9:
        return;
    L5:
        r2 = null;
        goto L6
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(final int width, final int height, final Map<AlignmentLine, Integer> r11, final Function1<? super RulerScope, Unit> r12, final Function1<? super Placeable.PlacementScope, Unit> r13) {
        if ((width & ViewCompat.MEASURED_STATE_MASK) == 0) goto L5;
    L7:
        boolean value$iv$iv = false;
    L9:
        if (value$iv$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalStateException("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
    L12:
        return new AnonymousClass1(width, height, r11, r12, r13, this);
    L5:
        if (((-16777216) & height) != 0) goto L7;
        value$iv$iv = true;
        goto L9
    }

    public final void captureRulers$ui_release(MeasureResult result) {
        if (result == null) goto L5;
        captureRulers(new PlaceableResult(result, this));
        return;
    L5:
        ScatterMap r2 = this.rulerReaders;
        if (r2 == null) goto L28;
        ScatterMap this_$iv = r2;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L28;
    L9:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        ScatterMap this_$iv2 = this_$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r3 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L12:
        if (j$iv$iv >= bitCount$iv$iv) goto L22;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L16;
        boolean r17 = true;
    L17:
        if (r17 == false) goto L20;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        notifyRulerValueChange((MutableScatterSet) v$iv[index$iv$iv]);
    L20:
        slot$iv$iv = slot$iv$iv >> r3;
        j$iv$iv = j$iv$iv + 1;
        r3 = r3;
        goto L12
    L16:
        r17 = false;
        goto L17
    L22:
        if (bitCount$iv$iv != r3) goto L28;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L28;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
    L28:
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> r1 = this.rulerReaders;
        if (r1 == null) goto L31;
        r1.clear();
    L31:
        MutableObjectFloatMap<Ruler> r4 = this.rulerValues;
        if (r4 == null) goto L41;
        r4.clear();
        return;
    }

    private final void captureRulers(final PlaceableResult placeableResult) {
        if (this.isPlacingForAlignment == false) goto L5;
        return;
    L5:
        Function1<RulerScope, Unit> r2 = placeableResult.getResult().getRulers();
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> r3 = this.rulerReaders;
        int r12 = 8;
        if (r2 != null) goto L28;
        if (r3 == null) goto L121;
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> this_$iv = r3;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L26;
    L10:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        ScatterMap this_$iv2 = this_$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L22;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L13:
        if (j$iv$iv >= bitCount$iv$iv) goto L21;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L17;
        boolean r13 = true;
    L18:
        if (r13 == false) goto L20;
        notifyRulerValueChange((MutableScatterSet) v$iv[(i$iv$iv << 3) + j$iv$iv]);
    L20:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        goto L13
    L17:
        r13 = false;
        goto L18
    L21:
        if (bitCount$iv$iv != 8) goto L26;
    L22:
        if (i$iv$iv == lastIndex$iv$iv) goto L26;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
    L26:
        r3.clear();
        return;
    L121:
        return;
    L28:
        MutableObjectFloatMap<Ruler> this_$iv3 = this.rulerValuesCache;
        DefaultConstructorMarker r5 = null;
        if (this_$iv3 != null) goto L31;
        this_$iv3 = new MutableObjectFloatMap(0, 1, r5);
        this.rulerValuesCache = this_$iv3;
    L31:
        MutableObjectFloatMap<Ruler> r6 = this.rulerValues;
        if (r6 != null) goto L35;
        r6 = new MutableObjectFloatMap(0, 1, r5);
        this.rulerValues = r6;
    L35:
        this_$iv3.putAll(r6);
        r6.clear();
        Owner r7 = getLayoutNode().getOwner$ui_release();
        if (r7 == null) goto L40;
        OwnerSnapshotObserver r8 = r7.getSnapshotObserver();
        if (r8 == null) goto L40;
        r8.observeReads$ui_release(placeableResult, onCommitAffectingRuler, new AnonymousClass3(placeableResult, this));
    L40:
        if (r3 == null) goto L72;
        ObjectFloatMap this_$iv4 = this_$iv3;
        Object[] k$iv = this_$iv4.keys;
        float[] v$iv2 = this_$iv4.values;
        ObjectFloatMap this_$iv$iv = this_$iv4;
        long[] m$iv$iv2 = this_$iv$iv.metadata;
        int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L72;
    L43:
        long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];
        int r29 = r12;
        ObjectFloatMap this_$iv$iv2 = this_$iv$iv;
        Function1<RulerScope, Unit> r25 = r2;
        if (((((~slot$iv$iv2) << 7) & slot$iv$iv2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L66;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
        int j$iv$iv2 = 0;
    L46:
        if (j$iv$iv2 >= bitCount$iv$iv2) goto L65;
        long value$iv$iv$iv2 = slot$iv$iv2 & 255;
        if (value$iv$iv$iv2 >= 128) goto L50;
        int $i$f$isFull = 1;
    L51:
        if ($i$f$isFull == 0) goto L62;
        int index$iv$iv = (i$iv$iv2 << 3) + j$iv$iv2;
        Object r26 = k$iv[index$iv$iv];
        float oldValue = v$iv2[index$iv$iv];
        Ruler ruler = (Ruler) r26;
        int j$iv$iv3 = j$iv$iv2;
        float newValue = r6.getOrDefault(ruler, Float.NaN);
        if (newValue != oldValue) goto L55;
        boolean r32 = true;
    L56:
        if (r32 == true) goto L63;
        MutableScatterSet<WeakReference<LayoutNode>> r1 = r3.remove(ruler);
        if (r1 == null) goto L63;
        notifyRulerValueChange(r1);
    L63:
        slot$iv$iv2 = slot$iv$iv2 >> r29;
        j$iv$iv2 = j$iv$iv3 + 1;
        goto L46
    L55:
        r32 = false;
        goto L56
    L62:
        j$iv$iv3 = j$iv$iv2;
        goto L63
    L50:
        $i$f$isFull = 0;
        goto L51
    L65:
        if (bitCount$iv$iv2 != r29) goto L72;
    L66:
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L72;
        i$iv$iv2 = i$iv$iv2 + 1;
        r2 = r25;
        this_$iv$iv = this_$iv$iv2;
        r12 = 8;
    L72:
        ObjectFloatMap this_$iv5 = r6;
        int $i$f$forEachKey = 0;
        Object[] k$iv2 = this_$iv5.keys;
        long[] m$iv$iv3 = this_$iv5.metadata;
        int lastIndex$iv$iv3 = m$iv$iv3.length - 2;
        int i$iv$iv3 = 0;
        if (0 > lastIndex$iv$iv3) goto L99;
    L74:
        long slot$iv$iv3 = m$iv$iv3[i$iv$iv3];
        ObjectFloatMap this_$iv6 = this_$iv5;
        if (((((~slot$iv$iv3) << 7) & slot$iv$iv3) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L94;
        int bitCount$iv$iv3 = 8 - ((~(i$iv$iv3 - lastIndex$iv$iv3)) >>> 31);
        int j$iv$iv4 = 0;
    L77:
        if (j$iv$iv4 >= bitCount$iv$iv3) goto L91;
        long value$iv$iv$iv3 = slot$iv$iv3 & 255;
        if (value$iv$iv$iv3 >= 128) goto L81;
        boolean r14 = true;
    L82:
        if (r14 == false) goto L89;
        int j$iv$iv5 = j$iv$iv4;
        Ruler ruler2 = (Ruler) k$iv2[(i$iv$iv3 << 3) + j$iv$iv4];
        int $i$f$forEachKey2 = $i$f$forEachKey;
        if (this_$iv3.containsKey(ruler2) == true) goto L90;
        LookaheadCapablePlaceable r4 = getParent();
        if (r4 == null) goto L90;
        r4.invalidateChildrenOfDefiningRuler(ruler2);
    L90:
        slot$iv$iv3 = slot$iv$iv3 >> 8;
        j$iv$iv4 = j$iv$iv5 + 1;
        $i$f$forEachKey = $i$f$forEachKey2;
        goto L77
    L89:
        j$iv$iv5 = j$iv$iv4;
        $i$f$forEachKey2 = $i$f$forEachKey;
        goto L90
    L81:
        r14 = false;
        goto L82
    L91:
        int $i$f$forEachKey3 = $i$f$forEachKey;
        if (bitCount$iv$iv3 != 8) goto L99;
    L95:
        if (i$iv$iv3 == lastIndex$iv$iv3) goto L99;
        i$iv$iv3 = i$iv$iv3 + 1;
        this_$iv5 = this_$iv6;
        $i$f$forEachKey = $i$f$forEachKey3;
        goto L74
    L94:
        $i$f$forEachKey3 = $i$f$forEachKey;
    L99:
        this_$iv3.clear();
    }

    private final void notifyRulerValueChange(MutableScatterSet<WeakReference<LayoutNode>> r23) {
        MutableScatterSet<WeakReference<LayoutNode>> this_$iv = r23;
        Object[] elements$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L33;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L27;
        int r11 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L24;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        int r17 = r11;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r16 = true;
    L12:
        if (r16 == false) goto L23;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        WeakReference layoutNodeRef = (WeakReference) elements$iv[index$iv$iv];
        LayoutNode layoutNode = (LayoutNode) layoutNodeRef.get();
        if (layoutNode == null) goto L23;
        if (isLookingAhead() == false) goto L18;
        layoutNode.requestLookaheadRelayout$ui_release(false);
        goto L23
    L18:
        layoutNode.requestRelayout$ui_release(false);
    L23:
        slot$iv$iv = slot$iv$iv >> r17;
        j$iv$iv = j$iv$iv + 1;
        r11 = r17;
        this_$iv = this_$iv;
        goto L7
    L11:
        r16 = false;
        goto L12
    L24:
        ScatterSet this_$iv2 = this_$iv;
        if (bitCount$iv$iv != r11) goto L41;
    L28:
        if (i$iv$iv == lastIndex$iv$iv) goto L42;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        goto L4
    L42:
        return;
    L41:
        return;
    L27:
        this_$iv2 = this_$iv;
        goto L28
    }

    public final void provideRulerValue(Ruler ruler, float value) {
        MutableObjectFloatMap<Ruler> r0 = this.rulerValues;
        if (r0 != null) goto L5;
        int r3 = 0;
        r0 = new MutableObjectFloatMap(r3, 1, null);
        this.rulerValues = r0;
    L5:
        r0.set(ruler, value);
    }

    public final void provideRelativeRulerValue(Ruler ruler, float value) {
        MutableObjectFloatMap<Ruler> r0 = this.rulerValues;
        if (r0 != null) goto L6;
        r0 = new MutableObjectFloatMap(0, 1, null);
        this.rulerValues = r0;
    L6:
        if (getLayoutDirection() != LayoutDirection.Ltr) goto L8;
        float r1 = value;
    L9:
        r0.set(ruler, r1);
        return;
    L8:
        r1 = getWidth() - value;
        goto L9
    }

    static {
        Companion = new Companion(null);
        onCommitAffectingRuler = LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1.INSTANCE;
    }
}
