package androidx.compose.ui.node;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayoutTreeConsistencyChecker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\f\u0010\u0012\u001a\u00020\r*\u00020\u0003H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "postponedMeasureRequests", "", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;Ljava/util/List;)V", "assertConsistent", "", "isTreeConsistent", "", "node", "logTree", "", "nodeToString", "consistentLayoutState", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutTreeConsistencyChecker {
    public static final int $stable = 0;
    private final List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;

    static {
        $stable = 8;
    }

    public LayoutTreeConsistencyChecker(LayoutNode root, DepthSortedSetsForDifferentPasses relayoutNodes, List<MeasureAndLayoutDelegate.PostponedRequest> r3) {
        this.root = root;
        this.relayoutNodes = relayoutNodes;
        this.postponedMeasureRequests = r3;
    }

    public final void assertConsistent() {
        boolean inconsistencyFound = !isTreeConsistent(this.root);
        if (inconsistencyFound == true) goto L5;
        return;
    L5:
        System.out.println(logTree());
        throw new IllegalStateException("Inconsistency found!");
    }

    private final boolean isTreeConsistent(LayoutNode node) {
        if (consistentLayoutState(node) == true) goto L5;
        return false;
    L5:
        List<LayoutNode> r0 = node.getChildren$ui_release();
        int index$iv = 0;
        int r4 = r0.size();
    L6:
        if (index$iv >= r4) goto L11;
        Object item$iv = r0.get(index$iv);
        LayoutNode it = (LayoutNode) item$iv;
        if (isTreeConsistent(it) == false) goto L9;
        index$iv = index$iv + 1;
        goto L6
    L9:
        return false;
    L11:
        return true;
    }

    private final boolean consistentLayoutState(LayoutNode $this$consistentLayoutState) {
        LayoutNode parent = $this$consistentLayoutState.getParent$ui_release();
        if (parent == null) goto L5;
        LayoutNode.LayoutState parentLayoutState = parent.getLayoutState$ui_release();
    L6:
        boolean r7 = true;
        if ($this$consistentLayoutState.isPlaced() == true) goto L18;
        if ($this$consistentLayoutState.getPlaceOrder$ui_release() == Integer.MAX_VALUE) goto L88;
        if (parent != null) goto L12;
    L14:
        boolean r5 = false;
    L15:
        if (r5 == false) goto L88;
    L12:
        if (parent.isPlaced() != true) goto L14;
        r5 = true;
    L88:
        if (Intrinsics.areEqual($this$consistentLayoutState.isPlacedInLookahead(), true) == true) goto L90;
        return true;
    L90:
        if ($this$consistentLayoutState.getLookaheadMeasurePending$ui_release() == false) goto L105;
        List<MeasureAndLayoutDelegate.PostponedRequest> r3 = this.postponedMeasureRequests;
        int index$iv$iv = 0;
        int r10 = r3.size();
    L92:
        if (index$iv$iv >= r10) goto L102;
        Object item$iv$iv = r3.get(index$iv$iv);
        MeasureAndLayoutDelegate.PostponedRequest it = (MeasureAndLayoutDelegate.PostponedRequest) item$iv$iv;
        boolean r16 = r7;
        if (Intrinsics.areEqual(it.getNode(), $this$consistentLayoutState) == true) goto L96;
    L98:
        boolean r8 = false;
    L99:
        if (r8 == true) goto L100;
        index$iv$iv = index$iv$iv + 1;
        r7 = r16;
        goto L92
    L100:
        Object r4 = item$iv$iv;
    L103:
        if (r4 == null) goto L107;
        return r16;
    L107:
        if ($this$consistentLayoutState.getLookaheadMeasurePending$ui_release() == false) goto L131;
        boolean r6 = r16;
        if (this.relayoutNodes.contains($this$consistentLayoutState, r6) == true) goto L128;
        if (parent != null) goto L112;
    L114:
        boolean r9 = false;
    L115:
        if (r9 == true) goto L128;
        if (parentLayoutState == LayoutNode.LayoutState.LookaheadMeasuring) goto L128;
        if (parent != null) goto L120;
    L122:
        boolean r11 = false;
    L123:
        if (r11 == true) goto L125;
    L127:
        return false;
    L125:
        if (Intrinsics.areEqual($this$consistentLayoutState.getLookaheadRoot$ui_release(), $this$consistentLayoutState) == false) goto L127;
    L120:
        if (parent.getMeasurePending$ui_release() != true) goto L122;
        r11 = true;
        goto L123
    L112:
        if (parent.getLookaheadMeasurePending$ui_release() != r6) goto L114;
        r9 = true;
    L128:
        return true;
    L131:
        if ($this$consistentLayoutState.getLookaheadLayoutPending$ui_release() == true) goto L133;
        return true;
    L133:
        if (this.relayoutNodes.contains($this$consistentLayoutState, true) == true) goto L149;
        if (parent == null) goto L149;
        if (parent.getLookaheadMeasurePending$ui_release() == true) goto L149;
        if (parent.getLookaheadLayoutPending$ui_release() == true) goto L149;
        if (parentLayoutState == LayoutNode.LayoutState.LookaheadMeasuring) goto L149;
        if (parentLayoutState == LayoutNode.LayoutState.LookaheadLayingOut) goto L149;
        if (parent.getLayoutPending$ui_release() == true) goto L146;
    L148:
        return false;
    L146:
        if (Intrinsics.areEqual($this$consistentLayoutState.getLookaheadRoot$ui_release(), $this$consistentLayoutState) == false) goto L148;
    L149:
        return true;
    L96:
        if (it.isLookahead() == false) goto L98;
        r8 = r16;
        goto L99
    L102:
        r16 = r7;
        r4 = null;
        goto L103
    L105:
        r16 = true;
    L18:
        if ($this$consistentLayoutState.getMeasurePending$ui_release() == false) goto L34;
        List<MeasureAndLayoutDelegate.PostponedRequest> r12 = this.postponedMeasureRequests;
        int index$iv$iv2 = 0;
        int r13 = r12.size();
    L20:
        if (index$iv$iv2 >= r13) goto L30;
        Object item$iv$iv2 = r12.get(index$iv$iv2);
        Object it$iv = item$iv$iv2;
        MeasureAndLayoutDelegate.PostponedRequest it2 = (MeasureAndLayoutDelegate.PostponedRequest) it$iv;
        if (Intrinsics.areEqual(it2.getNode(), $this$consistentLayoutState) == true) goto L24;
    L26:
        boolean r14 = false;
    L27:
        if (r14 == true) goto L31;
        index$iv$iv2 = index$iv$iv2 + 1;
    L31:
        if (it$iv == null) goto L34;
        return true;
    L24:
        if (it2.isLookahead() == true) goto L26;
        r14 = true;
        goto L27
    L30:
        it$iv = null;
    L34:
        if ($this$consistentLayoutState.isDeactivated() == false) goto L37;
        return true;
    L37:
        if ($this$consistentLayoutState.getMeasurePending$ui_release() == false) goto L61;
        if (this.relayoutNodes.contains($this$consistentLayoutState) == true) goto L59;
        if ($this$consistentLayoutState.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring) goto L59;
        if (parent != null) goto L44;
    L46:
        boolean r15 = false;
    L47:
        if (r15 == true) goto L59;
        if (parent != null) goto L50;
    L52:
        boolean r17 = false;
    L53:
        if (r17 == true) goto L59;
        if (parentLayoutState == LayoutNode.LayoutState.Measuring) goto L59;
        return false;
    L50:
        if (parent.getLookaheadMeasurePending$ui_release() != true) goto L52;
        r17 = true;
        goto L53
    L44:
        if (parent.getMeasurePending$ui_release() != true) goto L46;
        r15 = true;
    L59:
        return true;
    L61:
        if ($this$consistentLayoutState.getLayoutPending$ui_release() == false) goto L88;
        if (this.relayoutNodes.contains($this$consistentLayoutState) == true) goto L86;
        if (parent == null) goto L86;
        if (parent.getMeasurePending$ui_release() == true) goto L86;
        if (parent.getLayoutPending$ui_release() == true) goto L86;
        if (parentLayoutState == LayoutNode.LayoutState.Measuring) goto L86;
        if (parentLayoutState == LayoutNode.LayoutState.LayingOut) goto L86;
        List<MeasureAndLayoutDelegate.PostponedRequest> r18 = this.postponedMeasureRequests;
        int index$iv$iv3 = 0;
        int r19 = r18.size();
    L74:
        if (index$iv$iv3 >= r19) goto L79;
        Object item$iv$iv3 = r18.get(index$iv$iv3);
        if (Intrinsics.areEqual(((MeasureAndLayoutDelegate.PostponedRequest) item$iv$iv3).getNode(), $this$consistentLayoutState) == true) goto L77;
        index$iv$iv3 = index$iv$iv3 + 1;
        goto L74
    L77:
        boolean r20 = true;
    L80:
        if (r20 == true) goto L86;
        if ($this$consistentLayoutState.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) goto L86;
        return false;
    L79:
        r20 = false;
    L86:
        return true;
    L5:
        parentLayoutState = null;
        goto L6
    }

    private final String nodeToString(LayoutNode node) {
        StringBuilder $this$nodeToString_u24lambda_u244 = new StringBuilder();
        $this$nodeToString_u24lambda_u244.append(node);
        $this$nodeToString_u24lambda_u244.append(new StringBuilder().append('[').append(node.getLayoutState$ui_release()).append(']').toString());
        if (node.isPlaced() == true) goto L5;
        $this$nodeToString_u24lambda_u244.append("[!isPlaced]");
    L5:
        $this$nodeToString_u24lambda_u244.append("[measuredByParent=" + node.getMeasuredByParent$ui_release() + ']');
        if (consistentLayoutState(node) == true) goto L9;
        $this$nodeToString_u24lambda_u244.append("[INCONSISTENT]");
    L9:
        return $this$nodeToString_u24lambda_u244.toString();
    }

    private final String logTree() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder r1 = stringBuilder.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(r1, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r1.append('\n'), "append(...)");
        logTree$printSubTree(this, stringBuilder, this.root, 0);
        return stringBuilder.toString();
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker this$0, StringBuilder stringBuilder, LayoutNode node, int depth) {
        int childrenDepth = depth;
        String nodeRepresentation = this$0.nodeToString(node);
        if (nodeRepresentation.length() <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L11;
        int i = 0;
    L8:
        if (i >= depth) goto L10;
        stringBuilder.append("..");
        i = i + 1;
        goto L8
    L10:
        StringBuilder r3 = stringBuilder.append(nodeRepresentation);
        Intrinsics.checkNotNullExpressionValue(r3, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r3.append('\n'), "append(...)");
        childrenDepth = childrenDepth + 1;
    L11:
        List<LayoutNode> r4 = node.getChildren$ui_release();
        int index$iv = 0;
        int r5 = r4.size();
    L12:
        if (index$iv >= r5) goto L15;
        Object item$iv = r4.get(index$iv);
        LayoutNode it = (LayoutNode) item$iv;
        logTree$printSubTree(this$0, stringBuilder, it, childrenDepth);
        index$iv = index$iv + 1;
        goto L12
    L15:
        return;
    L5:
        r2 = false;
        goto L6
    }
}
