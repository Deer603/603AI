package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\r\u0010J\u001a\u00020\u0000H\u0000¢\u0006\u0002\bKJ\u0016\u0010L\u001a\u00020M2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00000OH\u0002J3\u0010P\u001a\u00020\u00002\b\u0010Q\u001a\u0004\u0018\u00010R2\u0017\u0010S\u001a\u0013\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020M0T¢\u0006\u0002\bVH\u0002ø\u0001\u0000¢\u0006\u0002\bWJ\u000f\u0010X\u001a\u0004\u0018\u00010YH\u0000¢\u0006\u0002\bZJ,\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00000O2\u000e\b\u0002\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00000OH\u0002J\u000e\u0010]\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020_J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\b\b\u0002\u0010`\u001a\u00020\u00052\b\b\u0002\u0010a\u001a\u00020\u00052\b\b\u0002\u0010b\u001a\u00020\u0005H\u0000¢\u0006\u0002\bcJ\u001e\u0010d\u001a\u00020M2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00000O2\u0006\u0010e\u001a\u00020\tH\u0002J7\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\u000e\b\u0002\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00000O2\b\b\u0002\u0010a\u001a\u00020\u00052\b\b\u0002\u0010b\u001a\u00020\u0005H\u0000¢\u0006\u0002\bfJ\"\u0010g\u001a\u00020M*\u00020\u00072\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00000O2\u0006\u0010b\u001a\u00020\u0005H\u0002J2\u0010h\u001a\u00020M*\b\u0012\u0004\u0012\u00020\u00000O2\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020M0TH\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001R\u0014\u0010\u000b\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0014\u0010&\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0014\u0010(\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u00103\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0017\u00106\u001a\u0002078Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b8\u00109R\u0017\u0010:\u001a\u0002078Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b;\u00109R\u0017\u0010<\u001a\u0002078Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b=\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0016R\u0013\u0010@\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0017\u0010D\u001a\u00020E8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bF\u00109R\u0011\u0010G\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bH\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "outerSemanticsNode", "Landroidx/compose/ui/Modifier$Node;", "mergingEnabled", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "(Landroidx/compose/ui/Modifier$Node;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "getBoundsInParent$ui_release", "()Landroidx/compose/ui/geometry/Rect;", "boundsInRoot", "getBoundsInRoot", "boundsInWindow", "getBoundsInWindow", "children", "", "getChildren", "()Ljava/util/List;", "config", "getConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "fakeNodeParent", "id", "", "getId", "()I", "isFake", "isFake$ui_release", "()Z", "setFake$ui_release", "(Z)V", "isMergingSemanticsOfDescendants", "isRoot", "isTransparent", "isTransparent$ui_release", "isUnmergedLeafNode", "isUnmergedLeafNode$ui_release", "layoutInfo", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "getMergingEnabled", "getOuterSemanticsNode$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "parent", "getParent", "()Landroidx/compose/ui/semantics/SemanticsNode;", "positionInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "()J", "positionInWindow", "getPositionInWindow-F1C5BW0", "positionOnScreen", "getPositionOnScreen-F1C5BW0", "replacedChildren", "getReplacedChildren$ui_release", "root", "Landroidx/compose/ui/node/RootForTest;", "getRoot", "()Landroidx/compose/ui/node/RootForTest;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "touchBoundsInRoot", "getTouchBoundsInRoot", "getUnmergedConfig$ui_release", "copyWithMergingEnabled", "copyWithMergingEnabled$ui_release", "emitFakeNodes", "", "unmergedChildren", "", "fakeSemanticsNode", "role", "Landroidx/compose/ui/semantics/Role;", "properties", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/ExtensionFunctionType;", "fakeSemanticsNode-ypyhhiA", "findCoordinatorToGetBounds", "Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds$ui_release", "findOneLayerOfMergingSemanticsNodes", "list", "getAlignmentLinePosition", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "includeReplacedSemantics", "includeFakeNodes", "includeDeactivatedNodes", "getChildren$ui_release", "mergeConfig", "mergedConfig", "unmergedChildren$ui_release", "fillOneLayerOfSemanticsWrappers", "forEachUnmergedChild", "block", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SemanticsNode {
    public static final int $stable = 0;
    private SemanticsNode fakeNodeParent;
    private final int id;
    private boolean isFake;
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;
    private final Modifier.Node outerSemanticsNode;
    private final SemanticsConfiguration unmergedConfig;

    static {
        $stable = 8;
    }

    public SemanticsNode(Modifier.Node outerSemanticsNode, boolean mergingEnabled, LayoutNode layoutNode, SemanticsConfiguration unmergedConfig) {
        this.outerSemanticsNode = outerSemanticsNode;
        this.mergingEnabled = mergingEnabled;
        this.layoutNode = layoutNode;
        this.unmergedConfig = unmergedConfig;
        this.id = this.layoutNode.getSemanticsId();
    }

    public final Modifier.Node getOuterSemanticsNode$ui_release() {
        return this.outerSemanticsNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    public final LayoutNode getLayoutNode$ui_release() {
        return this.layoutNode;
    }

    public final SemanticsConfiguration getUnmergedConfig$ui_release() {
        return this.unmergedConfig;
    }

    public final boolean isFake$ui_release() {
        return this.isFake;
    }

    public final void setFake$ui_release(boolean r1) {
        this.isFake = r1;
    }

    public final boolean isUnmergedLeafNode$ui_release() {
        if (this.isFake == false) goto L5;
        return false;
    L5:
        if (getReplacedChildren$ui_release().isEmpty() == false) goto L26;
        LayoutNode $this$findClosestParentNode$iv = this.layoutNode;
        LayoutNode currentParent$iv = $this$findClosestParentNode$iv.getParent$ui_release();
    L8:
        if (currentParent$iv == null) goto L18;
        LayoutNode it = currentParent$iv;
        SemanticsConfiguration r7 = it.getSemanticsConfiguration();
        if (r7 != null) goto L12;
    L14:
        boolean r5 = false;
    L15:
        if (r5 == true) goto L19;
        currentParent$iv = currentParent$iv.getParent$ui_release();
    L19:
        if (currentParent$iv == null) goto L22;
        return false;
    L22:
        return true;
    L12:
        if (r7.isMergingSemanticsOfDescendants() != true) goto L14;
        r5 = true;
        goto L15
    L18:
        currentParent$iv = null;
        goto L19
    L26:
        return false;
    }

    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    public final RootForTest getRoot() {
        Owner r0 = this.layoutNode.getOwner$ui_release();
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getRootForTest();
    }

    public final int getId() {
        return this.id;
    }

    public final Rect getTouchBoundsInRoot() {
        if (this.unmergedConfig.isMergingSemanticsOfDescendants() == false) goto L9;
        DelegatableNode r0 = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
        if (r0 != null) goto L8;
        r0 = this.outerSemanticsNode;
    L8:
        Modifier.Node entity = r0;
    L11:
        return SemanticsModifierNodeKt.touchBoundsInRoot(entity.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.unmergedConfig));
    L9:
        entity = this.outerSemanticsNode;
        goto L11
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m6194getSizeYbymL2g() {
        NodeCoordinator r0 = findCoordinatorToGetBounds$ui_release();
        if (r0 == null) goto L6;
        return r0.mo5722getSizeYbymL2g();
    L6:
        return IntSize.Companion.m7149getZeroYbymL2g();
    }

    public final Rect getBoundsInRoot() {
        NodeCoordinator it = findCoordinatorToGetBounds$ui_release();
        if (it == null) goto L12;
        if (it.isAttached() == true) goto L8;
        it = null;
    L8:
        if (it == null) goto L12;
        Rect r0 = LayoutCoordinatesKt.boundsInRoot(it);
        if (r0 == null) goto L12;
        return r0;
    L12:
        return Rect.Companion.getZero();
    }

    /* JADX INFO: renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m6191getPositionInRootF1C5BW0() {
        NodeCoordinator it = findCoordinatorToGetBounds$ui_release();
        if (it == null) goto L11;
        if (it.isAttached() == true) goto L8;
        it = null;
    L8:
        if (it == null) goto L11;
        return LayoutCoordinatesKt.positionInRoot(it);
    L11:
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    public final Rect getBoundsInWindow() {
        NodeCoordinator it = findCoordinatorToGetBounds$ui_release();
        if (it == null) goto L12;
        if (it.isAttached() == true) goto L8;
        it = null;
    L8:
        if (it == null) goto L12;
        Rect r0 = LayoutCoordinatesKt.boundsInWindow(it);
        if (r0 == null) goto L12;
        return r0;
    L12:
        return Rect.Companion.getZero();
    }

    /* JADX INFO: renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m6192getPositionInWindowF1C5BW0() {
        NodeCoordinator it = findCoordinatorToGetBounds$ui_release();
        if (it == null) goto L11;
        if (it.isAttached() == true) goto L8;
        it = null;
    L8:
        if (it == null) goto L11;
        return LayoutCoordinatesKt.positionInWindow(it);
    L11:
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m6193getPositionOnScreenF1C5BW0() {
        NodeCoordinator it = findCoordinatorToGetBounds$ui_release();
        if (it == null) goto L11;
        if (it.isAttached() == true) goto L8;
        it = null;
    L8:
        if (it == null) goto L11;
        return LayoutCoordinatesKt.positionOnScreen(it);
    L11:
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    public final Rect getBoundsInParent$ui_release() {
        SemanticsNode parent = getParent();
        if (parent == null) goto L5;
        NodeCoordinator it = findCoordinatorToGetBounds$ui_release();
        if (it == null) goto L19;
        if (it.isAttached() == true) goto L12;
        it = null;
    L12:
        if (it == null) goto L19;
        LayoutCoordinates currentCoordinates = it.getCoordinates();
        if (currentCoordinates == null) goto L19;
        return LayoutCoordinates.localBoundingBoxOf$default(DelegatableNodeKt.m5836requireCoordinator64DMado(parent.outerSemanticsNode, NodeKind.m5976constructorimpl(8)), currentCoordinates, false, 2, null);
    L19:
        return Rect.Companion.getZero();
    L5:
        return Rect.Companion.getZero();
    }

    public final boolean isTransparent$ui_release() {
        NodeCoordinator r0 = findCoordinatorToGetBounds$ui_release();
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.isTransparent();
    }

    public final int getAlignmentLinePosition(AlignmentLine alignmentLine) {
        NodeCoordinator r0 = findCoordinatorToGetBounds$ui_release();
        if (r0 != null) goto L7;
        return Integer.MIN_VALUE;
    L7:
        return r0.get(alignmentLine);
    }

    public final SemanticsConfiguration getConfig() {
        boolean r0 = isMergingSemanticsOfDescendants();
        SemanticsConfiguration r1 = this.unmergedConfig;
        if (r0 == false) goto L6;
        SemanticsConfiguration mergedConfig = r1.copy();
        mergeConfig(new ArrayList(), mergedConfig);
        return mergedConfig;
    L6:
        return r1;
    }

    private final void mergeConfig(List<SemanticsNode> r10, SemanticsConfiguration mergedConfig) {
        if (this.unmergedConfig.isClearingSemantics() == true) goto L11;
        int start$iv = r10.size();
        unmergedChildren$ui_release$default(this, r10, false, false, 6, null);
        int end$iv = r10.size();
        int i$iv = start$iv;
    L5:
        if (i$iv >= end$iv) goto L15;
        SemanticsNode child = r10.get(i$iv);
        if (child.isMergingSemanticsOfDescendants() == true) goto L9;
        mergedConfig.mergeChild$ui_release(child.unmergedConfig);
        child.mergeConfig(r10, mergedConfig);
    L9:
        i$iv = i$iv + 1;
        goto L5
    L15:
        return;
    }

    private final boolean isMergingSemanticsOfDescendants() {
        if (this.mergingEnabled == true) goto L5;
    L7:
        return false;
    L5:
        if (this.unmergedConfig.isMergingSemanticsOfDescendants() == false) goto L7;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode r1, ArrayList r2, boolean r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = new ArrayList();
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = false;
    L12:
        return r1.unmergedChildren$ui_release(r2, r3, r4);
    }

    public final List<SemanticsNode> unmergedChildren$ui_release(List<SemanticsNode> r2, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (this.isFake == true) goto L5;
        fillOneLayerOfSemanticsWrappers(this.layoutNode, r2, includeDeactivatedNodes);
        if (includeFakeNodes == false) goto L9;
        emitFakeNodes(r2);
    L9:
        return r2;
    L5:
        return CollectionsKt.emptyList();
    }

    private final void fillOneLayerOfSemanticsWrappers(LayoutNode $this$fillOneLayerOfSemanticsWrappers, List<SemanticsNode> r12, boolean includeDeactivatedNodes) {
        MutableVector<LayoutNode> r0 = $this$fillOneLayerOfSemanticsWrappers.getZSortedChildren();
        int i$iv = 0;
        Object[] content$iv = r0.content;
        int size$iv = r0.getSize();
    L3:
        if (i$iv >= size$iv) goto L15;
        LayoutNode child = (LayoutNode) content$iv[i$iv];
        if (child.isAttached() == false) goto L13;
        if (includeDeactivatedNodes == true) goto L10;
        if (child.isDeactivated() == true) goto L13;
    L10:
        if (child.getNodes$ui_release().m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(8)) == false) goto L12;
        r12.add(SemanticsNodeKt.SemanticsNode(child, this.mergingEnabled));
        goto L13
    L12:
        fillOneLayerOfSemanticsWrappers(child, r12, includeDeactivatedNodes);
    L13:
        i$iv = i$iv + 1;
        goto L3
    }

    public final List<SemanticsNode> getChildren() {
        return getChildren$ui_release$default(this, false, false, false, 7, null);
    }

    public final List<SemanticsNode> getReplacedChildren$ui_release() {
        return getChildren$ui_release$default(this, false, true, false, 4, null);
    }

    public static /* synthetic */ List getChildren$ui_release$default(SemanticsNode r1, boolean r2, boolean r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = !r1.mergingEnabled;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = false;
    L12:
        return r1.getChildren$ui_release(r2, r3, r4);
    }

    public final List<SemanticsNode> getChildren$ui_release(boolean includeReplacedSemantics, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (includeReplacedSemantics == false) goto L4;
    L7:
        List unmergedChildren = new ArrayList();
        if (isMergingSemanticsOfDescendants() == false) goto L12;
        return findOneLayerOfMergingSemanticsNodes$default(this, unmergedChildren, null, 2, null);
    L12:
        return unmergedChildren$ui_release(unmergedChildren, includeFakeNodes, includeDeactivatedNodes);
    L4:
        if (this.unmergedConfig.isClearingSemantics() == false) goto L7;
        return CollectionsKt.emptyList();
    }

    public final boolean isRoot() {
        if (getParent() != null) goto L5;
        return true;
    L5:
        return false;
    }

    public final SemanticsNode getParent() {
        if (this.fakeNodeParent != null) goto L5;
        LayoutNode node = null;
        if (this.mergingEnabled == false) goto L20;
        LayoutNode $this$findClosestParentNode$iv = this.layoutNode;
        LayoutNode currentParent$iv = $this$findClosestParentNode$iv.getParent$ui_release();
    L9:
        if (currentParent$iv == null) goto L18;
        LayoutNode it = currentParent$iv;
        SemanticsConfiguration r7 = it.getSemanticsConfiguration();
        boolean r8 = false;
        if (r7 != null) goto L13;
    L15:
        if (r8 == true) goto L19;
        currentParent$iv = currentParent$iv.getParent$ui_release();
    L19:
        node = currentParent$iv;
        goto L20
    L13:
        if (r7.isMergingSemanticsOfDescendants() != true) goto L15;
        r8 = true;
        goto L15
    L18:
        currentParent$iv = null;
    L20:
        if (node != null) goto L29;
        LayoutNode $this$findClosestParentNode$iv2 = this.layoutNode;
        LayoutNode currentParent$iv2 = $this$findClosestParentNode$iv2.getParent$ui_release();
    L22:
        if (currentParent$iv2 == null) goto L27;
        LayoutNode it2 = currentParent$iv2;
        if (it2.getNodes$ui_release().m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(8)) == true) goto L28;
        currentParent$iv2 = currentParent$iv2.getParent$ui_release();
    L28:
        node = currentParent$iv2;
        goto L29
    L27:
        currentParent$iv2 = null;
    L29:
        if (node != null) goto L32;
        return null;
    L32:
        return SemanticsNodeKt.SemanticsNode(node, this.mergingEnabled);
    L5:
        return this.fakeNodeParent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode r0, List r1, ArrayList r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = new ArrayList();
    L6:
        return r0.findOneLayerOfMergingSemanticsNodes(r1, r2);
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> r10, List<SemanticsNode> r11) {
        int start$iv = r10.size();
        unmergedChildren$ui_release$default(this, r10, false, false, 6, null);
        int end$iv = r10.size();
        int i$iv = start$iv;
    L3:
        if (i$iv >= end$iv) goto L12;
        SemanticsNode child = r10.get(i$iv);
        if (child.isMergingSemanticsOfDescendants() == false) goto L8;
        r11.add(child);
    L10:
        i$iv = i$iv + 1;
        goto L3
    L8:
        if (child.unmergedConfig.isClearingSemantics() == true) goto L10;
        child.findOneLayerOfMergingSemanticsNodes(r10, r11);
        goto L10
    L12:
        return r11;
    }

    private final void forEachUnmergedChild(List<SemanticsNode> r9, Function1<? super SemanticsNode, Unit> r10) {
        int start = r9.size();
        unmergedChildren$ui_release$default(this, r9, false, false, 6, null);
        int end = r9.size();
        int i = start;
    L3:
        if (i >= end) goto L5;
        r10.invoke(r9.get(i));
        i = i + 1;
        goto L3
    }

    public final NodeCoordinator findCoordinatorToGetBounds$ui_release() {
        if (this.isFake == false) goto L9;
        SemanticsNode r0 = getParent();
        if (r0 != null) goto L15;
        return null;
    L15:
        return r0.findCoordinatorToGetBounds$ui_release();
    L9:
        DelegatableNode r1 = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
        if (r1 != null) goto L13;
        r1 = this.outerSemanticsNode;
    L13:
        DelegatableNode semanticsModifierNode = r1;
        return DelegatableNodeKt.m5836requireCoordinator64DMado(semanticsModifierNode, NodeKind.m5976constructorimpl(8));
    }

    private final void emitFakeNodes(List<SemanticsNode> r5) {
        final Role nodeRole = SemanticsNodeKt.access$getRole(this);
        if (nodeRole == null) goto L10;
        if (this.unmergedConfig.isMergingSemanticsOfDescendants() == false) goto L10;
        if (r5.isEmpty() == true) goto L10;
        SemanticsNode fakeNode = m6190fakeSemanticsNodeypyhhiA(nodeRole, new SemanticsNode$emitFakeNodes$fakeNode$1(nodeRole));
        r5.add(fakeNode);
    L10:
        if (this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getContentDescription()) == true) goto L12;
        return;
    L12:
        if (r5.isEmpty() == false) goto L14;
        return;
    L14:
        if (this.unmergedConfig.isMergingSemanticsOfDescendants() == false) goto L25;
        List r1 = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, SemanticsProperties.INSTANCE.getContentDescription());
        if (r1 == null) goto L18;
        final String contentDescription = (String) CollectionsKt.firstOrNull(r1);
    L20:
        if (contentDescription == null) goto L26;
        SemanticsNode fakeNode2 = m6190fakeSemanticsNodeypyhhiA(null, new SemanticsNode$emitFakeNodes$fakeNode$2(contentDescription));
        r5.add(0, fakeNode2);
        return;
    L26:
        return;
    L18:
        contentDescription = null;
        goto L20
    }

    /* JADX INFO: renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final SemanticsNode m6190fakeSemanticsNodeypyhhiA(Role role, Function1<? super SemanticsPropertyReceiver, Unit> r9) {
        SemanticsConfiguration it = new SemanticsConfiguration();
        it.setMergingSemanticsOfDescendants(false);
        it.setClearingSemantics(false);
        r9.invoke(it);
        SemanticsNode$fakeSemanticsNode$fakeNode$1 r2 = new SemanticsNode$fakeSemanticsNode$fakeNode$1(r9);
        if (role == null) goto L5;
        int r5 = SemanticsNodeKt.access$roleFakeNodeId(this);
    L6:
        SemanticsNode fakeNode = new SemanticsNode(r2, false, new LayoutNode(true, r5), it);
        fakeNode.isFake = true;
        fakeNode.fakeNodeParent = this;
        return fakeNode;
    L5:
        r5 = SemanticsNodeKt.access$contentDescriptionFakeNodeId(this);
        goto L6
    }

    public final SemanticsNode copyWithMergingEnabled$ui_release() {
        return new SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }
}
