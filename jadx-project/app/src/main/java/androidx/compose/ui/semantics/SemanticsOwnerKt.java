package androidx.compose.ui.semantics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: SemanticsOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b*\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\u000b"}, d2 = {"getAllSemanticsNodes", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "mergingEnabled", "", "skipDeactivatedNodes", "getAllSemanticsNodesToMap", "", "", "useUnmergedTree", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SemanticsOwnerKt {
    public static /* synthetic */ List getAllSemanticsNodes$default(SemanticsOwner r0, boolean r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = true;
    L6:
        return getAllSemanticsNodes(r0, r1, r2);
    }

    public static final List<SemanticsNode> getAllSemanticsNodes(SemanticsOwner $this$getAllSemanticsNodes, boolean mergingEnabled, boolean skipDeactivatedNodes) {
        return CollectionsKt.toList(getAllSemanticsNodesToMap($this$getAllSemanticsNodes, !mergingEnabled, skipDeactivatedNodes).values());
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use a new overload instead")
    public static final /* synthetic */ List getAllSemanticsNodes(SemanticsOwner $this$getAllSemanticsNodes, boolean mergingEnabled) {
        return getAllSemanticsNodes($this$getAllSemanticsNodes, mergingEnabled, true);
    }

    public static /* synthetic */ Map getAllSemanticsNodesToMap$default(SemanticsOwner r0, boolean r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = true;
    L9:
        return getAllSemanticsNodesToMap(r0, r1, r2);
    }

    public static final Map<Integer, SemanticsNode> getAllSemanticsNodesToMap(SemanticsOwner $this$getAllSemanticsNodesToMap, boolean useUnmergedTree, boolean skipDeactivatedNodes) {
        Map nodes = new LinkedHashMap();
        if (useUnmergedTree == false) goto L5;
        SemanticsNode root = $this$getAllSemanticsNodesToMap.getUnmergedRootSemanticsNode();
    L6:
        if (skipDeactivatedNodes == true) goto L8;
    L9:
        getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(nodes, skipDeactivatedNodes, root);
    L10:
        return nodes;
    L8:
        if (root.getLayoutNode$ui_release().isDeactivated() == true) goto L10;
    L5:
        root = $this$getAllSemanticsNodesToMap.getRootSemanticsNode();
        goto L6
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(Map<Integer, SemanticsNode> r7, boolean $skipDeactivatedNodes, SemanticsNode currentNode) {
        r7.put(Integer.valueOf(currentNode.getId()), currentNode);
        List $this$fastForEach$iv = SemanticsNode.getChildren$ui_release$default(currentNode, false, false, !$skipDeactivatedNodes, 3, null);
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L3:
        if (index$iv >= r3) goto L6;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        SemanticsNode child = (SemanticsNode) item$iv;
        getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(r7, $skipDeactivatedNodes, child);
        index$iv = index$iv + 1;
        goto L3
    }
}
