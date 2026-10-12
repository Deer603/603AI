package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayoutNodeAlignmentLines.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020'H\u0002J\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0&J\u0006\u00100\u001a\u00020+J\u0006\u00101\u001a\u00020+J\u0006\u00102\u001a\u00020+J\r\u00103\u001a\u00020+H\u0000¢\u0006\u0002\b4J\u001e\u00105\u001a\u000206*\u00020'2\u0006\u00107\u001a\u000206H$ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0014\u0010:\u001a\u00020\b*\u00020'2\u0006\u0010,\u001a\u00020\u0007H$R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000eR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001c\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u001f\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010R\u001a\u0010\"\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0&*\u00020'X¤\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0001\u0002;<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"Landroidx/compose/ui/node/AlignmentLines;", "", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "alignmentLineMap", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "dirty", "", "getDirty$ui_release", "()Z", "setDirty$ui_release", "(Z)V", "previousUsedDuringParentLayout", "getPreviousUsedDuringParentLayout$ui_release", "setPreviousUsedDuringParentLayout$ui_release", "queried", "getQueried$ui_release", "queryOwner", "required", "getRequired$ui_release", "usedByModifierLayout", "getUsedByModifierLayout$ui_release", "setUsedByModifierLayout$ui_release", "usedByModifierMeasurement", "getUsedByModifierMeasurement$ui_release", "setUsedByModifierMeasurement$ui_release", "usedDuringParentLayout", "getUsedDuringParentLayout$ui_release", "setUsedDuringParentLayout$ui_release", "usedDuringParentMeasurement", "getUsedDuringParentMeasurement$ui_release", "setUsedDuringParentMeasurement$ui_release", "alignmentLinesMap", "", "Landroidx/compose/ui/node/NodeCoordinator;", "getAlignmentLinesMap", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "addAlignmentLine", "", "alignmentLine", "initialPosition", "initialCoordinator", "getLastCalculation", "onAlignmentsChanged", "recalculate", "recalculateQueryOwner", "reset", "reset$ui_release", "calculatePositionInParent", "Landroidx/compose/ui/geometry/Offset;", "position", "calculatePositionInParent-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "getPositionFor", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "Landroidx/compose/ui/node/LookaheadAlignmentLines;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AlignmentLines {
    public static final int $stable = 0;
    private final Map<AlignmentLine, Integer> alignmentLineMap;
    private final AlignmentLinesOwner alignmentLinesOwner;
    private boolean dirty;
    private boolean previousUsedDuringParentLayout;
    private AlignmentLinesOwner queryOwner;
    private boolean usedByModifierLayout;
    private boolean usedByModifierMeasurement;
    private boolean usedDuringParentLayout;
    private boolean usedDuringParentMeasurement;

    static {
        $stable = 8;
    }

    public /* synthetic */ AlignmentLines(AlignmentLinesOwner r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    /* JADX INFO: renamed from: calculatePositionInParent-R5De75A, reason: not valid java name */
    protected abstract long mo5821calculatePositionInParentR5De75A(NodeCoordinator r1, long r2);

    protected abstract Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator r1);

    protected abstract int getPositionFor(NodeCoordinator r1, AlignmentLine r2);

    private AlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        this.alignmentLinesOwner = alignmentLinesOwner;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }

    public static final /* synthetic */ void access$addAlignmentLine(AlignmentLines $this, AlignmentLine alignmentLine, int initialPosition, NodeCoordinator initialCoordinator) {
        $this.addAlignmentLine(alignmentLine, initialPosition, initialCoordinator);
    }

    public static final /* synthetic */ Map access$getAlignmentLineMap$p(AlignmentLines $this) {
        return $this.alignmentLineMap;
    }

    public final AlignmentLinesOwner getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    public final boolean getDirty$ui_release() {
        return this.dirty;
    }

    public final void setDirty$ui_release(boolean r1) {
        this.dirty = r1;
    }

    public final boolean getUsedDuringParentMeasurement$ui_release() {
        return this.usedDuringParentMeasurement;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean r1) {
        this.usedDuringParentMeasurement = r1;
    }

    public final boolean getUsedDuringParentLayout$ui_release() {
        return this.usedDuringParentLayout;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean r1) {
        this.usedDuringParentLayout = r1;
    }

    public final boolean getPreviousUsedDuringParentLayout$ui_release() {
        return this.previousUsedDuringParentLayout;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean r1) {
        this.previousUsedDuringParentLayout = r1;
    }

    public final boolean getUsedByModifierMeasurement$ui_release() {
        return this.usedByModifierMeasurement;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean r1) {
        this.usedByModifierMeasurement = r1;
    }

    public final boolean getUsedByModifierLayout$ui_release() {
        return this.usedByModifierLayout;
    }

    public final void setUsedByModifierLayout$ui_release(boolean r1) {
        this.usedByModifierLayout = r1;
    }

    public final boolean getQueried$ui_release() {
        if (this.usedDuringParentMeasurement == false) goto L5;
    L12:
        return true;
    L5:
        if (this.previousUsedDuringParentLayout == true) goto L12;
        if (this.usedByModifierMeasurement == true) goto L12;
        if (this.usedByModifierLayout == true) goto L12;
        return false;
    }

    public final boolean getRequired$ui_release() {
        recalculateQueryOwner();
        if (this.queryOwner == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final void recalculateQueryOwner() {
        boolean r0 = getQueried$ui_release();
        AlignmentLinesOwner parentQueryOwner = this.alignmentLinesOwner;
        if (r0 == true) goto L30;
        AlignmentLinesOwner parent = parentQueryOwner.getParentAlignmentLinesOwner();
        if (parent != null) goto L8;
        return;
    L8:
        parentQueryOwner = parent.getAlignmentLines().queryOwner;
        if (parentQueryOwner != null) goto L11;
    L13:
        AlignmentLinesOwner owner = this.queryOwner;
        if (owner != null) goto L16;
        return;
    L16:
        if (owner.getAlignmentLines().getQueried$ui_release() == true) goto L33;
        AlignmentLinesOwner r3 = owner.getParentAlignmentLinesOwner();
        if (r3 == null) goto L23;
        AlignmentLines r4 = r3.getAlignmentLines();
        if (r4 == null) goto L23;
        r4.recalculateQueryOwner();
    L23:
        AlignmentLinesOwner r5 = owner.getParentAlignmentLinesOwner();
        if (r5 == null) goto L28;
        AlignmentLines r6 = r5.getAlignmentLines();
        if (r6 == null) goto L28;
        AlignmentLinesOwner r7 = r6.queryOwner;
    L29:
        parentQueryOwner = r7;
    L28:
        r7 = null;
        goto L29
    L33:
        return;
    L11:
        if (parentQueryOwner.getAlignmentLines().getQueried$ui_release() == false) goto L13;
    L30:
        this.queryOwner = parentQueryOwner;
    }

    public final Map<AlignmentLine, Integer> getLastCalculation() {
        return this.alignmentLineMap;
    }

    private final void addAlignmentLine(AlignmentLine alignmentLine, int initialPosition, NodeCoordinator initialCoordinator) {
        float x$iv = initialPosition;
        float y$iv = initialPosition;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        char r11 = ' ';
        long r14 = 4294967295L;
        long position = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        NodeCoordinator coordinator = initialCoordinator;
    L3:
        position = mo5821calculatePositionInParentR5De75A(coordinator, position);
        NodeCoordinator r6 = coordinator.getWrappedBy$ui_release();
        Intrinsics.checkNotNull(r6);
        coordinator = r6;
        if (Intrinsics.areEqual(coordinator, this.alignmentLinesOwner.getInnerCoordinator()) == true) goto L9;
        if (getAlignmentLinesMap(coordinator).containsKey(alignmentLine) == false) goto L3;
        int newPosition = getPositionFor(coordinator, alignmentLine);
        float x$iv2 = newPosition;
        float y$iv2 = newPosition;
        long v1$iv$iv2 = Float.floatToRawIntBits(x$iv2);
        char r16 = r11;
        long r17 = r14;
        long v2$iv$iv2 = Float.floatToRawIntBits(y$iv2);
        position = Offset.m4117constructorimpl((v1$iv$iv2 << r16) | (v2$iv$iv2 & r17));
        r11 = r16;
        r14 = r17;
        goto L3
    L9:
        char r18 = r11;
        long r19 = r14;
        if ((alignmentLine instanceof HorizontalAlignmentLine) == false) goto L12;
        int bits$iv$iv$iv = (int) (position & r19);
        float $this$fastRoundToInt$iv = Float.intBitsToFloat(bits$iv$iv$iv);
    L13:
        int $i$f$fastRoundToInt = Math.round($this$fastRoundToInt$iv);
        Map<AlignmentLine, Integer> r7 = this.alignmentLineMap;
        if (this.alignmentLineMap.containsKey(alignmentLine) == false) goto L16;
        int r8 = AlignmentLineKt.merge(alignmentLine, ((Number) MapsKt.getValue(this.alignmentLineMap, alignmentLine)).intValue(), $i$f$fastRoundToInt);
    L17:
        r7.put(alignmentLine, Integer.valueOf(r8));
        return;
    L16:
        r8 = $i$f$fastRoundToInt;
        goto L17
    L12:
        int bits$iv$iv$iv2 = (int) (position >> r18);
        $this$fastRoundToInt$iv = Float.intBitsToFloat(bits$iv$iv$iv2);
        goto L13
    }

    public final void recalculate() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.forEachChildAlignmentLinesOwner(new AnonymousClass1(this));
        this.alignmentLineMap.putAll(getAlignmentLinesMap(this.alignmentLinesOwner.getInnerCoordinator()));
        this.dirty = false;
    }

    public final void reset$ui_release() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void onAlignmentsChanged() {
        this.dirty = true;
        AlignmentLinesOwner parent = this.alignmentLinesOwner.getParentAlignmentLinesOwner();
        if (parent != null) goto L6;
        return;
    L6:
        if (this.usedDuringParentMeasurement == false) goto L9;
        parent.requestMeasure();
    L14:
        if (this.usedByModifierMeasurement == false) goto L17;
        this.alignmentLinesOwner.requestMeasure();
    L17:
        if (this.usedByModifierLayout == false) goto L19;
        this.alignmentLinesOwner.requestLayout();
    L19:
        parent.getAlignmentLines().onAlignmentsChanged();
        return;
    L9:
        if (this.previousUsedDuringParentLayout == false) goto L11;
    L12:
        parent.requestLayout();
        goto L14
    L11:
        if (this.usedDuringParentLayout == false) goto L14;
        goto L12
    }
}
