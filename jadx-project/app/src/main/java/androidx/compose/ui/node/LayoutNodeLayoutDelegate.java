package androidx.compose.ui.node;

import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\\\u001a\u00020]J\r\u0010^\u001a\u00020]H\u0000¢\u0006\u0002\b_J\u0006\u0010`\u001a\u00020]J\u0006\u0010a\u001a\u00020]J\r\u0010b\u001a\u00020]H\u0000¢\u0006\u0002\bcJ\r\u0010d\u001a\u00020]H\u0000¢\u0006\u0002\beJ\r\u0010f\u001a\u00020]H\u0000¢\u0006\u0002\bgJ\r\u0010h\u001a\u00020]H\u0000¢\u0006\u0002\biJ\u0006\u0010j\u001a\u00020]J\u001a\u0010k\u001a\u00020]2\u0006\u0010l\u001a\u00020%H\u0000ø\u0001\u0000¢\u0006\u0004\bm\u0010nJ\u0006\u0010o\u001a\u00020]J\u0006\u0010p\u001a\u00020]R\u0014\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u0014\u0010\"\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\rR\u0019\u0010$\u001a\u0004\u0018\u00010%8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0019\u0010(\u001a\u0004\u0018\u00010%8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0016R\u001a\u0010.\u001a\u00020/X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00104\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\bR$\u00106\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010\u0018R$\u00109\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0016\"\u0004\b;\u0010\u0018R\u001a\u0010<\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0016\"\u0004\b>\u0010\u0018R\u001a\u0010?\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0016\"\u0004\bA\u0010\u0018R\u001a\u0010B\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0016\"\u0004\bD\u0010\u0018R\"\u0010G\u001a\u0004\u0018\u00010F2\b\u0010E\u001a\u0004\u0018\u00010F@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020KX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0016R\u001a\u0010P\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\r\"\u0004\bR\u0010\u000fR\u001a\u0010S\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\r\"\u0004\bU\u0010\u000fR\u0011\u0010V\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner$ui_release", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "value", "", "childrenAccessingCoordinatesDuringPlacement", "getChildrenAccessingCoordinatesDuringPlacement", "()I", "setChildrenAccessingCoordinatesDuringPlacement", "(I)V", "childrenAccessingLookaheadCoordinatesDuringPlacement", "getChildrenAccessingLookaheadCoordinatesDuringPlacement", "setChildrenAccessingLookaheadCoordinatesDuringPlacement", "", "coordinatesAccessedDuringModifierPlacement", "getCoordinatesAccessedDuringModifierPlacement", "()Z", "setCoordinatesAccessedDuringModifierPlacement", "(Z)V", "coordinatesAccessedDuringPlacement", "getCoordinatesAccessedDuringPlacement", "setCoordinatesAccessedDuringPlacement", "detachedFromParentLookaheadPass", "getDetachedFromParentLookaheadPass$ui_release", "setDetachedFromParentLookaheadPass$ui_release", "detachedFromParentLookaheadPlacement", "getDetachedFromParentLookaheadPlacement$ui_release", "setDetachedFromParentLookaheadPlacement$ui_release", "height", "getHeight$ui_release", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastLookaheadConstraints", "getLastLookaheadConstraints-DWUhwKw", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "layoutPending", "getLayoutPending$ui_release", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "setLayoutState$ui_release", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "lookaheadAlignmentLinesOwner", "getLookaheadAlignmentLinesOwner$ui_release", "lookaheadCoordinatesAccessedDuringModifierPlacement", "getLookaheadCoordinatesAccessedDuringModifierPlacement", "setLookaheadCoordinatesAccessedDuringModifierPlacement", "lookaheadCoordinatesAccessedDuringPlacement", "getLookaheadCoordinatesAccessedDuringPlacement", "setLookaheadCoordinatesAccessedDuringPlacement", "lookaheadLayoutPending", "getLookaheadLayoutPending$ui_release", "setLookaheadLayoutPending$ui_release", "lookaheadLayoutPendingForAlignment", "getLookaheadLayoutPendingForAlignment$ui_release", "setLookaheadLayoutPendingForAlignment$ui_release", "lookaheadMeasurePending", "getLookaheadMeasurePending$ui_release", "setLookaheadMeasurePending$ui_release", "<set-?>", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "lookaheadPassDelegate", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LookaheadPassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePending", "getMeasurePending$ui_release", "nextChildLookaheadPlaceOrder", "getNextChildLookaheadPlaceOrder$ui_release", "setNextChildLookaheadPlaceOrder$ui_release", "nextChildPlaceOrder", "getNextChildPlaceOrder$ui_release", "setNextChildPlaceOrder$ui_release", "outerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "width", "getWidth$ui_release", "clearLookaheadDelegate", "", "ensureLookaheadDelegateCreated", "ensureLookaheadDelegateCreated$ui_release", "invalidateParentData", "markChildrenDirty", "markLayoutPending", "markLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadLayoutPending$ui_release", "markLookaheadMeasurePending", "markLookaheadMeasurePending$ui_release", "markMeasurePending", "markMeasurePending$ui_release", "onCoordinatesUsed", "performLookaheadMeasure", "constraints", "performLookaheadMeasure-BRTryo0$ui_release", "(J)V", "resetAlignmentLines", "updateParentData", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutNodeLayoutDelegate {
    public static final int $stable = 0;
    private int childrenAccessingCoordinatesDuringPlacement;
    private int childrenAccessingLookaheadCoordinatesDuringPlacement;
    private boolean coordinatesAccessedDuringModifierPlacement;
    private boolean coordinatesAccessedDuringPlacement;
    private boolean detachedFromParentLookaheadPass;
    private boolean detachedFromParentLookaheadPlacement;
    private final LayoutNode layoutNode;
    private LayoutNode.LayoutState layoutState;
    private boolean lookaheadCoordinatesAccessedDuringModifierPlacement;
    private boolean lookaheadCoordinatesAccessedDuringPlacement;
    private boolean lookaheadLayoutPending;
    private boolean lookaheadLayoutPendingForAlignment;
    private boolean lookaheadMeasurePending;
    private LookaheadPassDelegate lookaheadPassDelegate;
    private final MeasurePassDelegate measurePassDelegate;
    private int nextChildLookaheadPlaceOrder;
    private int nextChildPlaceOrder;

    static {
        $stable = 8;
    }

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        this.layoutState = LayoutNode.LayoutState.Idle;
        this.measurePassDelegate = new MeasurePassDelegate(this);
    }

    public final LayoutNode getLayoutNode$ui_release() {
        return this.layoutNode;
    }

    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNode.getNodes$ui_release().getOuterCoordinator$ui_release();
    }

    /* JADX INFO: renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m5906getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m5929getLastConstraintsDWUhwKw();
    }

    /* JADX INFO: renamed from: getLastLookaheadConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m5907getLastLookaheadConstraintsDWUhwKw() {
        LookaheadPassDelegate r0 = this.lookaheadPassDelegate;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.m5919getLastConstraintsDWUhwKw();
    }

    public final int getHeight$ui_release() {
        return this.measurePassDelegate.getHeight();
    }

    public final int getWidth$ui_release() {
        return this.measurePassDelegate.getWidth();
    }

    public final boolean getDetachedFromParentLookaheadPass$ui_release() {
        return this.detachedFromParentLookaheadPass;
    }

    public final void setDetachedFromParentLookaheadPass$ui_release(boolean r1) {
        this.detachedFromParentLookaheadPass = r1;
    }

    public final boolean getDetachedFromParentLookaheadPlacement$ui_release() {
        return this.detachedFromParentLookaheadPlacement;
    }

    public final void setDetachedFromParentLookaheadPlacement$ui_release(boolean r1) {
        this.detachedFromParentLookaheadPlacement = r1;
    }

    public final LayoutNode.LayoutState getLayoutState$ui_release() {
        return this.layoutState;
    }

    public final void setLayoutState$ui_release(LayoutNode.LayoutState r1) {
        this.layoutState = r1;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.measurePassDelegate.getMeasurePending$ui_release();
    }

    public final boolean getLayoutPending$ui_release() {
        return this.measurePassDelegate.getLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.lookaheadMeasurePending;
    }

    public final void setLookaheadMeasurePending$ui_release(boolean r1) {
        this.lookaheadMeasurePending = r1;
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.lookaheadLayoutPending;
    }

    public final void setLookaheadLayoutPending$ui_release(boolean r1) {
        this.lookaheadLayoutPending = r1;
    }

    public final boolean getLookaheadLayoutPendingForAlignment$ui_release() {
        return this.lookaheadLayoutPendingForAlignment;
    }

    public final void setLookaheadLayoutPendingForAlignment$ui_release(boolean r1) {
        this.lookaheadLayoutPendingForAlignment = r1;
    }

    public final int getNextChildLookaheadPlaceOrder$ui_release() {
        return this.nextChildLookaheadPlaceOrder;
    }

    public final void setNextChildLookaheadPlaceOrder$ui_release(int r1) {
        this.nextChildLookaheadPlaceOrder = r1;
    }

    public final int getNextChildPlaceOrder$ui_release() {
        return this.nextChildPlaceOrder;
    }

    public final void setNextChildPlaceOrder$ui_release(int r1) {
        this.nextChildPlaceOrder = r1;
    }

    public final void markLayoutPending$ui_release() {
        this.measurePassDelegate.markLayoutPending();
    }

    public final void markMeasurePending$ui_release() {
        this.measurePassDelegate.markMeasurePending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.lookaheadMeasurePending = true;
    }

    public final AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.measurePassDelegate;
    }

    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean value) {
        boolean oldValue = this.coordinatesAccessedDuringPlacement;
        if (oldValue == value) goto L14;
        this.coordinatesAccessedDuringPlacement = value;
        if (value == true) goto L7;
    L9:
        if (value == false) goto L11;
        return;
    L11:
        if (this.coordinatesAccessedDuringModifierPlacement == true) goto L17;
        setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
        return;
    L17:
        return;
    L7:
        if (this.coordinatesAccessedDuringModifierPlacement == true) goto L9;
        setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
        return;
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean value) {
        boolean oldValue = this.coordinatesAccessedDuringModifierPlacement;
        if (oldValue == value) goto L14;
        this.coordinatesAccessedDuringModifierPlacement = value;
        if (value == true) goto L7;
    L9:
        if (value == false) goto L11;
        return;
    L11:
        if (this.coordinatesAccessedDuringPlacement == true) goto L17;
        setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
        return;
    L17:
        return;
    L7:
        if (this.coordinatesAccessedDuringPlacement == true) goto L9;
        setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
        return;
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int value) {
        int oldValue = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = value;
        boolean r1 = false;
        if (oldValue != 0) goto L5;
        boolean r3 = true;
    L6:
        if (value != 0) goto L8;
        r1 = true;
    L8:
        if (r3 == r1) goto L18;
        LayoutNode r2 = this.layoutNode.getParent$ui_release();
        if (r2 == null) goto L12;
        LayoutNodeLayoutDelegate parentLayoutDelegate = r2.getLayoutDelegate$ui_release();
    L13:
        if (parentLayoutDelegate == null) goto L19;
        if (value != 0) goto L16;
        parentLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(parentLayoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
        return;
    L16:
        parentLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(parentLayoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
        return;
    L19:
        return;
    L12:
        parentLayoutDelegate = null;
        goto L13
    L18:
        return;
    L5:
        r3 = false;
        goto L6
    }

    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.lookaheadCoordinatesAccessedDuringPlacement;
    }

    public final void setLookaheadCoordinatesAccessedDuringPlacement(boolean value) {
        boolean oldValue = this.lookaheadCoordinatesAccessedDuringPlacement;
        if (oldValue == value) goto L14;
        this.lookaheadCoordinatesAccessedDuringPlacement = value;
        if (value == true) goto L7;
    L9:
        if (value == false) goto L11;
        return;
    L11:
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement == true) goto L17;
        setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
        return;
    L17:
        return;
    L7:
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement == true) goto L9;
        setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
        return;
    }

    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.lookaheadCoordinatesAccessedDuringModifierPlacement;
    }

    public final void setLookaheadCoordinatesAccessedDuringModifierPlacement(boolean value) {
        boolean oldValue = this.lookaheadCoordinatesAccessedDuringModifierPlacement;
        if (oldValue == value) goto L14;
        this.lookaheadCoordinatesAccessedDuringModifierPlacement = value;
        if (value == true) goto L7;
    L9:
        if (value == false) goto L11;
        return;
    L11:
        if (this.lookaheadCoordinatesAccessedDuringPlacement == true) goto L17;
        setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
        return;
    L17:
        return;
    L7:
        if (this.lookaheadCoordinatesAccessedDuringPlacement == true) goto L9;
        setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
        return;
    }

    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.childrenAccessingLookaheadCoordinatesDuringPlacement;
    }

    public final void setChildrenAccessingLookaheadCoordinatesDuringPlacement(int value) {
        int oldValue = this.childrenAccessingLookaheadCoordinatesDuringPlacement;
        this.childrenAccessingLookaheadCoordinatesDuringPlacement = value;
        boolean r1 = false;
        if (oldValue != 0) goto L5;
        boolean r3 = true;
    L6:
        if (value != 0) goto L8;
        r1 = true;
    L8:
        if (r3 == r1) goto L18;
        LayoutNode r2 = this.layoutNode.getParent$ui_release();
        if (r2 == null) goto L12;
        LayoutNodeLayoutDelegate parentLayoutDelegate = r2.getLayoutDelegate$ui_release();
    L13:
        if (parentLayoutDelegate == null) goto L19;
        if (value != 0) goto L16;
        parentLayoutDelegate.setChildrenAccessingLookaheadCoordinatesDuringPlacement(parentLayoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
        return;
    L16:
        parentLayoutDelegate.setChildrenAccessingLookaheadCoordinatesDuringPlacement(parentLayoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
        return;
    L19:
        return;
    L12:
        parentLayoutDelegate = null;
        goto L13
    L18:
        return;
    L5:
        r3 = false;
        goto L6
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.measurePassDelegate;
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final void onCoordinatesUsed() {
        LayoutNode.LayoutState state = this.layoutNode.getLayoutState$ui_release();
        if (state == LayoutNode.LayoutState.LayingOut) goto L7;
        if (state == LayoutNode.LayoutState.LookaheadLayingOut) goto L7;
    L11:
        if (state != LayoutNode.LayoutState.LookaheadLayingOut) goto L21;
        LookaheadPassDelegate r1 = this.lookaheadPassDelegate;
        boolean r3 = false;
        if (r1 != null) goto L15;
    L17:
        if (r3 == false) goto L19;
        setLookaheadCoordinatesAccessedDuringPlacement(true);
        return;
    L19:
        setLookaheadCoordinatesAccessedDuringModifierPlacement(true);
        return;
    L15:
        if (r1.getLayingOutChildren() != true) goto L17;
        r3 = true;
        goto L17
    L21:
        return;
    L7:
        if (this.measurePassDelegate.getLayingOutChildren() == false) goto L9;
        setCoordinatesAccessedDuringPlacement(true);
        goto L11
    L9:
        setCoordinatesAccessedDuringModifierPlacement(true);
        goto L11
    }

    /* JADX INFO: renamed from: performLookaheadMeasure-BRTryo0$ui_release, reason: not valid java name */
    public final void m5908performLookaheadMeasureBRTryo0$ui_release(long constraints) {
        LookaheadPassDelegate r0 = this.lookaheadPassDelegate;
        if (r0 == null) goto L6;
        r0.m5920performMeasureBRTryo0$ui_release(constraints);
        return;
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if (this.lookaheadPassDelegate != null) goto L6;
        this.lookaheadPassDelegate = new LookaheadPassDelegate(this);
        return;
    }

    public final void updateParentData() {
        if (this.measurePassDelegate.updateParentData() == false) goto L7;
        LayoutNode r1 = this.layoutNode.getParent$ui_release();
        if (r1 == null) goto L7;
        LayoutNode.requestRemeasure$ui_release$default(r1, false, false, false, 7, null);
    L7:
        LookaheadPassDelegate r0 = this.lookaheadPassDelegate;
        boolean r2 = false;
        if (r0 != null) goto L10;
    L12:
        if (r2 == false) goto L22;
        boolean r3 = LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode);
        LayoutNode r4 = this.layoutNode;
        if (r3 == false) goto L18;
        LayoutNode r5 = r4.getParent$ui_release();
        if (r5 == null) goto L23;
        LayoutNode.requestRemeasure$ui_release$default(r5, false, false, false, 7, null);
        return;
    L23:
        return;
    L18:
        LayoutNode r8 = r4.getParent$ui_release();
        if (r8 == null) goto L25;
        LayoutNode.requestLookaheadRemeasure$ui_release$default(r8, false, false, false, 7, null);
        return;
    L25:
        return;
    L22:
        return;
    L10:
        if (r0.updateParentData() != true) goto L12;
        r2 = true;
        goto L12
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        LookaheadPassDelegate r0 = this.lookaheadPassDelegate;
        if (r0 == null) goto L6;
        r0.invalidateParentData();
        return;
    }

    public final void resetAlignmentLines() {
        this.measurePassDelegate.getAlignmentLines().reset$ui_release();
        LookaheadPassDelegate r0 = this.lookaheadPassDelegate;
        if (r0 == null) goto L8;
        AlignmentLines r1 = r0.getAlignmentLines();
        if (r1 == null) goto L9;
        r1.reset$ui_release();
        return;
    L9:
        return;
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildDelegatesDirty$ui_release(true);
        LookaheadPassDelegate it = this.lookaheadPassDelegate;
        if (it == null) goto L6;
        it.setChildDelegatesDirty$ui_release(true);
        return;
    }

    public final void clearLookaheadDelegate() {
        this.lookaheadPassDelegate = null;
    }
}
