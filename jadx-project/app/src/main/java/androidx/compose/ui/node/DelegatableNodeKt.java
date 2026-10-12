package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DelegatableNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u001a\"\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a5\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u000b\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0007H\u0000\u001aA\u0010\u0013\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006*\u00020\u001a2\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a\"\u0010\u001b\u001a\u00020\u0001*\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\n\u0010\u001e\u001a\u00020\u0005*\u00020\u0002\u001a3\u0010\u001f\u001a\u0004\u0018\u0001H\f\"\n\b\u0000\u0010\f\u0018\u0001*\u00020 *\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010#\u001a\u00020$H\u0000\u001a\u0016\u0010%\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002\u001a\n\u0010&\u001a\u00020\u0005*\u00020\u0002\u001a\"\u0010'\u001a\u00020(*\u00020\u00022\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\n\u0010+\u001a\u00020,*\u00020\u0002\u001a\n\u0010-\u001a\u00020.*\u00020\u0002\u001a\n\u0010/\u001a\u000200*\u00020\u0002\u001a\n\u00101\u001a\u000202*\u00020\u0002\u001a\f\u00103\u001a\u00020\u001a*\u00020\u0002H\u0000\u001a\f\u00104\u001a\u000205*\u00020\u0002H\u0000\u001a\f\u00106\u001a\u000207*\u00020\u0002H\u0000\u001aK\u00108\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u00109\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a3\u00108\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\b\b\u0002\u00109\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001aK\u0010<\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b=\u0010;\u001a1\u0010<\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001aA\u0010>\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a)\u0010>\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001aA\u0010A\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bB\u0010@\u001a)\u0010A\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001a3\u0010A\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\b\b\u0002\u00109\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001aM\u0010C\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\n\u0010D\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aK\u0010G\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bH\u0010;\u001aA\u0010I\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bJ\u0010@\u001aK\u0010K\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bL\u0010;\u001aK\u0010M\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00010\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bN\u0010;\u001a1\u0010M\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0016H\u0080\b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O"}, d2 = {"isDelegationRoot", "", "Landroidx/compose/ui/node/DelegatableNode;", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "addLayoutNodeChildren", "", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Node;", "node", "zOrder", "ancestors", "", "T", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/node/NodeKind;", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "asLayoutModifierNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "dispatchForKind", "kind", "block", "Lkotlin/Function1;", "dispatchForKind-6rFNWt0", "(Landroidx/compose/ui/Modifier$Node;ILkotlin/jvm/functions/Function1;)V", "getChildren", "Landroidx/compose/ui/node/LayoutNode;", "has", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "invalidateSubtree", "nearestAncestor", "", "nearestAncestor-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "mask", "", "pop", "requestAutofill", "requireCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireDensity", "Landroidx/compose/ui/unit/Density;", "requireGraphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "requireLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "requireLayoutNode", "requireOwner", "Landroidx/compose/ui/node/Owner;", "requireSemanticsInfo", "Landroidx/compose/ui/semantics/SemanticsInfo;", "visitAncestors", "includeSelf", "visitAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;IZLkotlin/jvm/functions/Function1;)V", "visitChildren", "visitChildren-Y-YKmho", "visitLocalAncestors", "visitLocalAncestors-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;)V", "visitLocalDescendants", "visitLocalDescendants-6rFNWt0", "visitSelfAndAncestors", "untilType", "visitSelfAndAncestors-5BbP62I", "(Landroidx/compose/ui/node/DelegatableNode;IILkotlin/jvm/functions/Function1;)V", "visitSelfAndChildren", "visitSelfAndChildren-Y-YKmho", "visitSelfAndLocalDescendants", "visitSelfAndLocalDescendants-6rFNWt0", "visitSubtree", "visitSubtree-Y-YKmho", "visitSubtreeIf", "visitSubtreeIf-Y-YKmho", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DelegatableNodeKt {
    public static final /* synthetic */ void access$addLayoutNodeChildren(MutableVector $receiver, Modifier.Node node, boolean zOrder) {
        addLayoutNodeChildren($receiver, node, zOrder);
    }

    public static final /* synthetic */ Modifier.Node access$pop(MutableVector $receiver) {
        return pop($receiver);
    }

    public static final boolean isDelegationRoot(DelegatableNode $this$isDelegationRoot) {
        if ($this$isDelegationRoot.getNode() != $this$isDelegationRoot) goto L5;
        return true;
    L5:
        return false;
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode $this$visitAncestors_u24default, int mask, boolean includeSelf, Function1 block, int r7, Object r8) {
        if ((r7 & 2) == 0) goto L5;
        includeSelf = false;
    L5:
        boolean value$iv = $this$visitAncestors_u24default.getNode().isAttached();
        if (value$iv == true) goto L8;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L8:
        Modifier.Node node = $this$visitAncestors_u24default.getNode();
        if (includeSelf == true) goto L12;
        node = node.getParent$ui_release();
    L12:
        LayoutNode layout = requireLayoutNode($this$visitAncestors_u24default);
    L13:
        if (layout == null) goto L28;
        Modifier.Node head = layout.getNodes$ui_release().getHead$ui_release();
        if ((head.getAggregateChildKindSet$ui_release() & mask) == 0) goto L21;
    L16:
        if (node == null) goto L21;
        if ((node.getKindSet$ui_release() & mask) == 0) goto L20;
        block.invoke(node);
    L20:
        node = node.getParent$ui_release();
    L21:
        layout = layout.getParent$ui_release();
        if (layout == null) goto L26;
        NodeChain r2 = layout.getNodes$ui_release();
        if (r2 == null) goto L26;
        Modifier.Node r3 = r2.getTail$ui_release();
    L27:
        node = r3;
    L26:
        r3 = null;
        goto L27
    }

    public static final void visitAncestors(DelegatableNode $this$visitAncestors, int mask, boolean includeSelf, Function1<? super Modifier.Node, Unit> r8) {
        boolean value$iv = $this$visitAncestors.getNode().isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node = $this$visitAncestors.getNode();
        if (includeSelf == true) goto L9;
        node = node.getParent$ui_release();
    L9:
        LayoutNode layout = requireLayoutNode($this$visitAncestors);
    L10:
        if (layout == null) goto L25;
        Modifier.Node head = layout.getNodes$ui_release().getHead$ui_release();
        if ((head.getAggregateChildKindSet$ui_release() & mask) == 0) goto L18;
    L13:
        if (node == null) goto L18;
        if ((node.getKindSet$ui_release() & mask) == 0) goto L17;
        r8.invoke(node);
    L17:
        node = node.getParent$ui_release();
    L18:
        layout = layout.getParent$ui_release();
        if (layout == null) goto L23;
        NodeChain r4 = layout.getNodes$ui_release();
        if (r4 == null) goto L23;
        Modifier.Node r5 = r4.getTail$ui_release();
    L24:
        node = r5;
    L23:
        r5 = null;
        goto L24
    }

    public static final Modifier.Node nearestAncestor(DelegatableNode $this$nearestAncestor, int mask) {
        boolean value$iv = $this$nearestAncestor.getNode().isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("nearestAncestor called on an unattached node");
    L5:
        Modifier.Node node = $this$nearestAncestor.getNode().getParent$ui_release();
        LayoutNode layout = requireLayoutNode($this$nearestAncestor);
    L6:
        Modifier.Node r2 = null;
        if (layout == null) goto L21;
        Modifier.Node head = layout.getNodes$ui_release().getHead$ui_release();
        if ((head.getAggregateChildKindSet$ui_release() & mask) == 0) goto L15;
    L10:
        if (node == null) goto L15;
        if ((node.getKindSet$ui_release() & mask) != 0) goto L13;
        node = node.getParent$ui_release();
        goto L10
    L13:
        return node;
    L15:
        layout = layout.getParent$ui_release();
        if (layout == null) goto L20;
        NodeChain r4 = layout.getNodes$ui_release();
        if (r4 == null) goto L20;
        r2 = r4.getTail$ui_release();
    L20:
        node = r2;
        goto L6
    L21:
        return null;
    }

    private static final MutableVector<LayoutNode> getChildren(LayoutNode $this$getChildren, boolean zOrder) {
        if (zOrder == false) goto L5;
        return $this$getChildren.getZSortedChildren();
    L5:
        return $this$getChildren.get_children$ui_release();
    }

    private static final void addLayoutNodeChildren(MutableVector<Modifier.Node> r7, Modifier.Node node, boolean zOrder) {
        MutableVector<LayoutNode> r0 = getChildren(requireLayoutNode(node), zOrder);
        int i$iv = r0.getSize() - 1;
        Object[] content$iv = r0.content;
        if (i$iv >= content$iv.length) goto L7;
    L4:
        if (i$iv < 0) goto L9;
        LayoutNode it = (LayoutNode) content$iv[i$iv];
        r7.add(it.getNodes$ui_release().getHead$ui_release());
        i$iv = i$iv - 1;
        goto L4
    L9:
        return;
    }

    public static final void visitChildren(DelegatableNode $this$visitChildren, int mask, boolean zOrder, Function1<? super Modifier.Node, Unit> r11) {
        boolean value$iv = $this$visitChildren.getNode().isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L5:
        MutableVector branches = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = $this$visitChildren.getNode().getChild$ui_release();
        if (child != null) goto L8;
        access$addLayoutNodeChildren(branches, $this$visitChildren.getNode(), zOrder);
    L10:
        if (branches.getSize() == 0) goto L12;
        boolean r2 = true;
    L13:
        if (r2 == false) goto L23;
        Modifier.Node branch = (Modifier.Node) branches.removeAt(branches.getSize() - 1);
        if ((branch.getAggregateChildKindSet$ui_release() & mask) == 0) goto L16;
        Modifier.Node node = branch;
    L18:
        if (node == null) goto L10;
        if ((node.getKindSet$ui_release() & mask) != 0) goto L21;
        node = node.getChild$ui_release();
        goto L18
    L21:
        r11.invoke(node);
        goto L10
    L16:
        access$addLayoutNodeChildren(branches, branch, zOrder);
        goto L10
    L23:
        return;
    L12:
        r2 = false;
        goto L13
    L8:
        branches.add(child);
        goto L10
    }

    public static final void visitSubtreeIf(DelegatableNode $this$visitSubtreeIf, int mask, boolean zOrder, Function1<? super Modifier.Node, Boolean> r11) {
        boolean value$iv = $this$visitSubtreeIf.getNode().isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
    L5:
        MutableVector branches = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = $this$visitSubtreeIf.getNode().getChild$ui_release();
        if (child != null) goto L8;
        access$addLayoutNodeChildren(branches, $this$visitSubtreeIf.getNode(), zOrder);
    L10:
        if (branches.getSize() == 0) goto L12;
        boolean r2 = true;
    L13:
        if (r2 == false) goto L24;
        Modifier.Node branch = (Modifier.Node) branches.removeAt(branches.getSize() - 1);
        if ((branch.getAggregateChildKindSet$ui_release() & mask) == 0) goto L23;
        Modifier.Node node = branch;
    L17:
        if (node == null) goto L23;
        if ((node.getKindSet$ui_release() & mask) == 0) goto L22;
        boolean diveDeeper = r11.invoke(node).booleanValue();
        if (diveDeeper == false) goto L10;
    L22:
        node = node.getChild$ui_release();
    L23:
        access$addLayoutNodeChildren(branches, branch, zOrder);
        goto L10
    L24:
        return;
    L12:
        r2 = false;
        goto L13
    L8:
        branches.add(child);
        goto L10
    }

    public static final void visitLocalDescendants(DelegatableNode $this$visitLocalDescendants, int mask, Function1<? super Modifier.Node, Unit> r9) {
        boolean value$iv$iv = $this$visitLocalDescendants.getNode().isAttached();
        if (value$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
    L5:
        Modifier.Node self$iv = $this$visitLocalDescendants.getNode();
        if ((self$iv.getAggregateChildKindSet$ui_release() & mask) == 0) goto L14;
        Modifier.Node next$iv = self$iv.getChild$ui_release();
    L8:
        if (next$iv == null) goto L18;
        if ((next$iv.getKindSet$ui_release() & mask) == 0) goto L12;
        r9.invoke(next$iv);
    L12:
        next$iv = next$iv.getChild$ui_release();
        goto L8
    L18:
        return;
    }

    public static /* synthetic */ void visitLocalDescendants$default(DelegatableNode $this$visitLocalDescendants_u24default, int mask, boolean includeSelf, Function1 block, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L5;
        includeSelf = false;
    L5:
        boolean value$iv = $this$visitLocalDescendants_u24default.getNode().isAttached();
        if (value$iv == true) goto L8;
        InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
    L8:
        Modifier.Node self = $this$visitLocalDescendants_u24default.getNode();
        if ((self.getAggregateChildKindSet$ui_release() & mask) != 0) goto L11;
        return;
    L11:
        if (includeSelf == false) goto L13;
        Modifier.Node next = self;
    L14:
        if (next == null) goto L19;
        if ((next.getKindSet$ui_release() & mask) == 0) goto L18;
        block.invoke(next);
    L18:
        next = next.getChild$ui_release();
        goto L14
    L19:
        return;
    L13:
        next = self.getChild$ui_release();
        goto L14
    }

    public static final void visitLocalDescendants(DelegatableNode $this$visitLocalDescendants, int mask, boolean includeSelf, Function1<? super Modifier.Node, Unit> r7) {
        boolean value$iv = $this$visitLocalDescendants.getNode().isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
    L5:
        Modifier.Node self = $this$visitLocalDescendants.getNode();
        if ((self.getAggregateChildKindSet$ui_release() & mask) != 0) goto L8;
        return;
    L8:
        if (includeSelf == false) goto L10;
        Modifier.Node next = self;
    L11:
        if (next == null) goto L16;
        if ((next.getKindSet$ui_release() & mask) == 0) goto L15;
        r7.invoke(next);
    L15:
        next = next.getChild$ui_release();
        goto L11
    L16:
        return;
    L10:
        next = self.getChild$ui_release();
        goto L11
    }

    public static final void visitLocalAncestors(DelegatableNode $this$visitLocalAncestors, int mask, Function1<? super Modifier.Node, Unit> r6) {
        boolean value$iv = $this$visitLocalAncestors.getNode().isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
    L5:
        Modifier.Node next = $this$visitLocalAncestors.getNode().getParent$ui_release();
    L6:
        if (next == null) goto L11;
        if ((next.getKindSet$ui_release() & mask) == 0) goto L10;
        r6.invoke(next);
    L10:
        next = next.getParent$ui_release();
        goto L6
    }

    /* JADX INFO: renamed from: visitSelfAndLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5846visitSelfAndLocalDescendants6rFNWt0(DelegatableNode $this$visitSelfAndLocalDescendants_u2d6rFNWt0, int type, Function1<? super T, Unit> r28) {
        int r0 = 0;
        boolean includeSelf$iv = true;
        DelegatableNode $this$visitLocalDescendants$iv = $this$visitSelfAndLocalDescendants_u2d6rFNWt0;
        int mask$iv = type;
        boolean value$iv$iv = $this$visitLocalDescendants$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
    L5:
        Modifier.Node self$iv = $this$visitLocalDescendants$iv.getNode();
        if ((self$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L58;
        Modifier.Node next$iv = self$iv;
    L8:
        if (next$iv == null) goto L75;
        if ((next$iv.getKindSet$ui_release() & mask$iv) == 0) goto L55;
        Object it = next$iv;
        Object stack$iv = null;
        Object node$iv = it;
    L12:
        if (node$iv == null) goto L55;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv instanceof Object) == true) goto L15;
        Modifier.Node this_$iv$iv = (Modifier.Node) node$iv;
        int r17 = r0;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L19;
        boolean r14 = true;
    L20:
        if (r14 == false) goto L51;
        if ((node$iv instanceof DelegatingNode) == false) goto L51;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L24:
        if (node$iv$iv == null) goto L48;
        Modifier.Node next$iv2 = node$iv$iv;
        if ((next$iv2.getKindSet$ui_release() & type) == 0) goto L28;
        boolean r20 = true;
    L29:
        if (r20 == false) goto L46;
        count$iv = count$iv + 1;
        boolean includeSelf$iv2 = includeSelf$iv;
        if (count$iv != 1) goto L33;
        node$iv = next$iv2;
        $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv;
        mask$iv = mask$iv;
    L47:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        includeSelf$iv = includeSelf$iv2;
        $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv;
        mask$iv = mask$iv;
        goto L24
    L33:
        Object r1 = (MutableVector) stack$iv;
        if (r1 != null) goto L36;
        Object r2 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r3 = (MutableVector) r2;
    L37:
        stack$iv = r2;
        Modifier.Node theNode$iv = (Modifier.Node) node$iv;
        if (theNode$iv == null) goto L43;
        MutableVector r4 = (MutableVector) stack$iv;
        if (r4 == null) goto L42;
        r4.add(theNode$iv);
    L42:
        node$iv = null;
    L43:
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L47;
        r5.add(next$iv2);
        goto L47
    L36:
        r2 = r1;
        goto L37
    L46:
        includeSelf$iv2 = includeSelf$iv;
        $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv;
        mask$iv = mask$iv;
        goto L47
    L28:
        r20 = false;
        goto L29
    L48:
        boolean includeSelf$iv3 = includeSelf$iv;
        DelegatableNode $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv;
        int mask$iv2 = mask$iv;
        if (count$iv != 1) goto L52;
        r0 = r17;
        includeSelf$iv = includeSelf$iv3;
        $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv2;
        mask$iv = mask$iv2;
    L52:
        node$iv = access$pop((MutableVector) stack$iv);
        r0 = r17;
        includeSelf$iv = includeSelf$iv3;
        $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv2;
        mask$iv = mask$iv2;
    L51:
        includeSelf$iv3 = includeSelf$iv;
        $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv;
        mask$iv2 = mask$iv;
        goto L52
    L19:
        r14 = false;
        goto L20
    L15:
        r28.invoke(node$iv);
        r17 = r0;
        includeSelf$iv3 = includeSelf$iv;
        $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv;
        mask$iv2 = mask$iv;
    L55:
        next$iv = next$iv.getChild$ui_release();
        r0 = r0;
        includeSelf$iv = includeSelf$iv;
        $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv;
        mask$iv = mask$iv;
        goto L8
    L75:
        return;
    }

    /* JADX INFO: renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5842visitLocalDescendants6rFNWt0(DelegatableNode $this$visitLocalDescendants_u2d6rFNWt0, int type, Function1<? super T, Unit> r29) {
        int r0 = 0;
        int mask$iv = type;
        DelegatableNode $this$visitLocalDescendants$iv = $this$visitLocalDescendants_u2d6rFNWt0;
        int $i$f$visitLocalDescendants = 0;
        boolean value$iv$iv$iv = $this$visitLocalDescendants$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
    L5:
        Modifier.Node self$iv$iv = $this$visitLocalDescendants$iv.getNode();
        if ((self$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L59;
        Modifier.Node next$iv$iv = self$iv$iv.getChild$ui_release();
    L8:
        if (next$iv$iv == null) goto L76;
        if ((next$iv$iv.getKindSet$ui_release() & mask$iv) == 0) goto L55;
        Object it = next$iv$iv;
        Object stack$iv = null;
        Object node$iv = it;
    L12:
        if (node$iv == null) goto L55;
        r0 = r0;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv instanceof Object) == true) goto L15;
        Modifier.Node this_$iv$iv = (Modifier.Node) node$iv;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L19;
        boolean r15 = true;
    L20:
        if (r15 == false) goto L51;
        if ((node$iv instanceof DelegatingNode) == false) goto L51;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L24:
        if (node$iv$iv == null) goto L48;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L28;
        boolean r21 = true;
    L29:
        if (r21 == false) goto L46;
        count$iv = count$iv + 1;
        int mask$iv2 = mask$iv;
        if (count$iv != 1) goto L33;
        node$iv = next$iv;
        $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv;
        $i$f$visitLocalDescendants = $i$f$visitLocalDescendants;
    L47:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        mask$iv = mask$iv2;
        $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv;
        $i$f$visitLocalDescendants = $i$f$visitLocalDescendants;
        goto L24
    L33:
        Object r1 = (MutableVector) stack$iv;
        if (r1 != null) goto L36;
        Object r2 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r3 = (MutableVector) r2;
    L37:
        stack$iv = r2;
        Modifier.Node theNode$iv = (Modifier.Node) node$iv;
        if (theNode$iv == null) goto L43;
        MutableVector r4 = (MutableVector) stack$iv;
        if (r4 == null) goto L42;
        r4.add(theNode$iv);
    L42:
        node$iv = null;
    L43:
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L47;
        r5.add(next$iv);
        goto L47
    L36:
        r2 = r1;
        goto L37
    L46:
        mask$iv2 = mask$iv;
        $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv;
        $i$f$visitLocalDescendants = $i$f$visitLocalDescendants;
        goto L47
    L28:
        r21 = false;
        goto L29
    L48:
        int mask$iv3 = mask$iv;
        DelegatableNode $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv;
        int $i$f$visitLocalDescendants2 = $i$f$visitLocalDescendants;
        if (count$iv != 1) goto L52;
        mask$iv = mask$iv3;
        $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv2;
        $i$f$visitLocalDescendants = $i$f$visitLocalDescendants2;
    L52:
        node$iv = access$pop((MutableVector) stack$iv);
        mask$iv = mask$iv3;
        $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv2;
        $i$f$visitLocalDescendants = $i$f$visitLocalDescendants2;
    L51:
        mask$iv3 = mask$iv;
        $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv;
        $i$f$visitLocalDescendants2 = $i$f$visitLocalDescendants;
        goto L52
    L19:
        r15 = false;
        goto L20
    L15:
        r29.invoke(node$iv);
        mask$iv3 = mask$iv;
        $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv;
        $i$f$visitLocalDescendants2 = $i$f$visitLocalDescendants;
    L55:
        next$iv$iv = next$iv$iv.getChild$ui_release();
        r0 = r0;
        mask$iv = mask$iv;
        $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv;
        $i$f$visitLocalDescendants = $i$f$visitLocalDescendants;
        goto L8
    L76:
        return;
    }

    /* JADX INFO: renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5841visitLocalAncestors6rFNWt0(DelegatableNode $this$visitLocalAncestors_u2d6rFNWt0, int type, Function1<? super T, Unit> r26) {
        int r0 = 0;
        int mask$iv = type;
        DelegatableNode $this$visitLocalAncestors$iv = $this$visitLocalAncestors_u2d6rFNWt0;
        boolean value$iv$iv = $this$visitLocalAncestors$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
    L5:
        Modifier.Node next$iv = $this$visitLocalAncestors$iv.getNode().getParent$ui_release();
    L6:
        if (next$iv == null) goto L55;
        if ((next$iv.getKindSet$ui_release() & mask$iv) == 0) goto L53;
        Object it = next$iv;
        Object stack$iv = null;
        Object node$iv = it;
    L10:
        if (node$iv == null) goto L53;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv instanceof Object) == true) goto L13;
        Modifier.Node this_$iv$iv = (Modifier.Node) node$iv;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L17;
        boolean r12 = true;
    L18:
        if (r12 == false) goto L49;
        if ((node$iv instanceof DelegatingNode) == false) goto L49;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L22:
        if (node$iv$iv == null) goto L46;
        Modifier.Node next$iv2 = node$iv$iv;
        if ((next$iv2.getKindSet$ui_release() & type) == 0) goto L26;
        boolean r18 = true;
    L27:
        if (r18 == false) goto L44;
        count$iv = count$iv + 1;
        int r19 = r0;
        if (count$iv != 1) goto L31;
        node$iv = next$iv2;
        mask$iv = mask$iv;
        $this$visitLocalAncestors$iv = $this$visitLocalAncestors$iv;
    L45:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r0 = r19;
        mask$iv = mask$iv;
        $this$visitLocalAncestors$iv = $this$visitLocalAncestors$iv;
        goto L22
    L31:
        Object r1 = (MutableVector) stack$iv;
        if (r1 != null) goto L34;
        Object r2 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r3 = (MutableVector) r2;
    L35:
        stack$iv = r2;
        Modifier.Node theNode$iv = (Modifier.Node) node$iv;
        if (theNode$iv == null) goto L41;
        MutableVector r4 = (MutableVector) stack$iv;
        if (r4 == null) goto L40;
        r4.add(theNode$iv);
    L40:
        node$iv = null;
    L41:
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L45;
        r5.add(next$iv2);
        goto L45
    L34:
        r2 = r1;
        goto L35
    L44:
        r19 = r0;
        mask$iv = mask$iv;
        $this$visitLocalAncestors$iv = $this$visitLocalAncestors$iv;
        goto L45
    L26:
        r18 = false;
        goto L27
    L46:
        int r110 = r0;
        int mask$iv2 = mask$iv;
        DelegatableNode $this$visitLocalAncestors$iv2 = $this$visitLocalAncestors$iv;
        if (count$iv != 1) goto L50;
        r0 = r110;
        mask$iv = mask$iv2;
        $this$visitLocalAncestors$iv = $this$visitLocalAncestors$iv2;
    L50:
        node$iv = access$pop((MutableVector) stack$iv);
        r0 = r110;
        mask$iv = mask$iv2;
        $this$visitLocalAncestors$iv = $this$visitLocalAncestors$iv2;
    L49:
        r110 = r0;
        mask$iv2 = mask$iv;
        $this$visitLocalAncestors$iv2 = $this$visitLocalAncestors$iv;
        goto L50
    L17:
        r12 = false;
        goto L18
    L13:
        r26.invoke(node$iv);
        r110 = r0;
        mask$iv2 = mask$iv;
        $this$visitLocalAncestors$iv2 = $this$visitLocalAncestors$iv;
    L53:
        next$iv = next$iv.getParent$ui_release();
        r0 = r0;
        mask$iv = mask$iv;
        $this$visitLocalAncestors$iv = $this$visitLocalAncestors$iv;
        goto L6
    }

    /* JADX INFO: renamed from: visitAncestors-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m5838visitAncestorsYYKmho$default(DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default, int type, boolean includeSelf, Function1 block, int r30, Object r31) {
        if ((r30 & 2) == 0) goto L5;
        boolean includeSelf2 = false;
    L6:
        int r1 = 0;
        int mask$iv = type;
        DelegatableNode $this$visitAncestors$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default;
        boolean value$iv$iv = $this$visitAncestors$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L9:
        Modifier.Node node$iv = $this$visitAncestors$iv.getNode();
        if (includeSelf2 == true) goto L13;
        node$iv = node$iv.getParent$ui_release();
    L13:
        LayoutNode layout$iv = requireLayoutNode($this$visitAncestors$iv);
    L14:
        if (layout$iv == null) goto L75;
        Modifier.Node head$iv = layout$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L66;
    L17:
        if (node$iv == null) goto L65;
        if ((node$iv.getKindSet$ui_release() & mask$iv) == 0) goto L64;
        Modifier.Node it = node$iv;
        Object stack$iv = null;
        Modifier.Node r13 = it;
    L21:
        if (r13 == null) goto L64;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r13 instanceof Object) == true) goto L24;
        Modifier.Node this_$iv$iv = r13;
        boolean includeSelf3 = includeSelf2;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L28;
        boolean r15 = true;
    L29:
        if (r15 == false) goto L60;
        if ((r13 instanceof DelegatingNode) == false) goto L60;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) r13;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L33:
        if (node$iv$iv == null) goto L57;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L37;
        boolean r20 = true;
    L38:
        if (r20 == false) goto L55;
        count$iv = count$iv + 1;
        int r21 = r1;
        if (count$iv != 1) goto L42;
        r13 = next$iv;
        mask$iv = mask$iv;
        $this$visitAncestors$iv = $this$visitAncestors$iv;
    L56:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r1 = r21;
        mask$iv = mask$iv;
        $this$visitAncestors$iv = $this$visitAncestors$iv;
        goto L33
    L42:
        Object r2 = (MutableVector) stack$iv;
        if (r2 != null) goto L45;
        Object r3 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r4 = (MutableVector) r3;
    L46:
        stack$iv = r3;
        Modifier.Node theNode$iv = r13;
        if (theNode$iv == null) goto L52;
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L51;
        r5.add(theNode$iv);
    L51:
        r13 = null;
    L52:
        MutableVector r6 = (MutableVector) stack$iv;
        if (r6 == null) goto L56;
        r6.add(next$iv);
        goto L56
    L45:
        r3 = r2;
        goto L46
    L55:
        r21 = r1;
        mask$iv = mask$iv;
        $this$visitAncestors$iv = $this$visitAncestors$iv;
        goto L56
    L37:
        r20 = false;
        goto L38
    L57:
        int r22 = r1;
        int mask$iv2 = mask$iv;
        DelegatableNode $this$visitAncestors$iv2 = $this$visitAncestors$iv;
        if (count$iv != 1) goto L61;
        includeSelf2 = includeSelf3;
        r1 = r22;
        mask$iv = mask$iv2;
        $this$visitAncestors$iv = $this$visitAncestors$iv2;
    L61:
        r13 = access$pop((MutableVector) stack$iv);
        includeSelf2 = includeSelf3;
        r1 = r22;
        mask$iv = mask$iv2;
        $this$visitAncestors$iv = $this$visitAncestors$iv2;
    L60:
        r22 = r1;
        mask$iv2 = mask$iv;
        $this$visitAncestors$iv2 = $this$visitAncestors$iv;
        goto L61
    L28:
        r15 = false;
        goto L29
    L24:
        block.invoke(r13);
        includeSelf3 = includeSelf2;
        r22 = r1;
        mask$iv2 = mask$iv;
        $this$visitAncestors$iv2 = $this$visitAncestors$iv;
    L64:
        node$iv = node$iv.getParent$ui_release();
        includeSelf2 = includeSelf2;
        r1 = r1;
        mask$iv = mask$iv;
        $this$visitAncestors$iv = $this$visitAncestors$iv;
        goto L17
    L65:
        boolean includeSelf4 = includeSelf2;
        int r23 = r1;
        int mask$iv3 = mask$iv;
        DelegatableNode $this$visitAncestors$iv3 = $this$visitAncestors$iv;
    L67:
        layout$iv = layout$iv.getParent$ui_release();
        if (layout$iv == null) goto L72;
        NodeChain r0 = layout$iv.getNodes$ui_release();
        if (r0 == null) goto L72;
        Modifier.Node r7 = r0.getTail$ui_release();
    L73:
        node$iv = r7;
        includeSelf2 = includeSelf4;
        r1 = r23;
        mask$iv = mask$iv3;
        $this$visitAncestors$iv = $this$visitAncestors$iv3;
    L72:
        r7 = null;
        goto L73
    L66:
        includeSelf4 = includeSelf2;
        r23 = r1;
        mask$iv3 = mask$iv;
        $this$visitAncestors$iv3 = $this$visitAncestors$iv;
        goto L67
    L75:
        return;
    L5:
        includeSelf2 = includeSelf;
        goto L6
    }

    /* JADX INFO: renamed from: visitAncestors-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m5837visitAncestorsYYKmho(DelegatableNode $this$visitAncestors_u2dY_u2dYKmho, int type, boolean includeSelf, Function1<? super T, Unit> r29) {
        int r0 = 0;
        int mask$iv = type;
        DelegatableNode $this$visitAncestors$iv = $this$visitAncestors_u2dY_u2dYKmho;
        int $i$f$visitAncestors = 0;
        boolean value$iv$iv = $this$visitAncestors$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv = $this$visitAncestors$iv.getNode();
        if (includeSelf == true) goto L9;
        node$iv = node$iv.getParent$ui_release();
    L9:
        LayoutNode layout$iv = requireLayoutNode($this$visitAncestors$iv);
    L10:
        if (layout$iv == null) goto L71;
        Modifier.Node head$iv = layout$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L62;
    L13:
        if (node$iv == null) goto L61;
        if ((node$iv.getKindSet$ui_release() & mask$iv) == 0) goto L60;
        Object it = node$iv;
        Object stack$iv = null;
        Object node$iv2 = it;
    L17:
        if (node$iv2 == null) goto L60;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv2 instanceof Object) == true) goto L20;
        Modifier.Node this_$iv$iv = (Modifier.Node) node$iv2;
        int r17 = r0;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L24;
        boolean r14 = true;
    L25:
        if (r14 == false) goto L56;
        if ((node$iv2 instanceof DelegatingNode) == false) goto L56;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv2;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L29:
        if (node$iv$iv == null) goto L53;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L33;
        boolean r20 = true;
    L34:
        if (r20 == false) goto L51;
        count$iv = count$iv + 1;
        int mask$iv2 = mask$iv;
        if (count$iv != 1) goto L38;
        node$iv2 = next$iv;
        $this$visitAncestors$iv = $this$visitAncestors$iv;
        $i$f$visitAncestors = $i$f$visitAncestors;
    L52:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        mask$iv = mask$iv2;
        $this$visitAncestors$iv = $this$visitAncestors$iv;
        $i$f$visitAncestors = $i$f$visitAncestors;
        goto L29
    L38:
        Object r1 = (MutableVector) stack$iv;
        if (r1 != null) goto L41;
        Object r2 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r3 = (MutableVector) r2;
    L42:
        stack$iv = r2;
        Modifier.Node theNode$iv = (Modifier.Node) node$iv2;
        if (theNode$iv == null) goto L48;
        MutableVector r4 = (MutableVector) stack$iv;
        if (r4 == null) goto L47;
        r4.add(theNode$iv);
    L47:
        node$iv2 = null;
    L48:
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L52;
        r5.add(next$iv);
        goto L52
    L41:
        r2 = r1;
        goto L42
    L51:
        mask$iv2 = mask$iv;
        $this$visitAncestors$iv = $this$visitAncestors$iv;
        $i$f$visitAncestors = $i$f$visitAncestors;
        goto L52
    L33:
        r20 = false;
        goto L34
    L53:
        int mask$iv3 = mask$iv;
        DelegatableNode $this$visitAncestors$iv2 = $this$visitAncestors$iv;
        int $i$f$visitAncestors2 = $i$f$visitAncestors;
        if (count$iv != 1) goto L57;
        r0 = r17;
        mask$iv = mask$iv3;
        $this$visitAncestors$iv = $this$visitAncestors$iv2;
        $i$f$visitAncestors = $i$f$visitAncestors2;
    L57:
        node$iv2 = access$pop((MutableVector) stack$iv);
        r0 = r17;
        mask$iv = mask$iv3;
        $this$visitAncestors$iv = $this$visitAncestors$iv2;
        $i$f$visitAncestors = $i$f$visitAncestors2;
    L56:
        mask$iv3 = mask$iv;
        $this$visitAncestors$iv2 = $this$visitAncestors$iv;
        $i$f$visitAncestors2 = $i$f$visitAncestors;
        goto L57
    L24:
        r14 = false;
        goto L25
    L20:
        r29.invoke(node$iv2);
        r17 = r0;
        mask$iv3 = mask$iv;
        $this$visitAncestors$iv2 = $this$visitAncestors$iv;
        $i$f$visitAncestors2 = $i$f$visitAncestors;
    L60:
        node$iv = node$iv.getParent$ui_release();
        r0 = r0;
        mask$iv = mask$iv;
        $this$visitAncestors$iv = $this$visitAncestors$iv;
        $i$f$visitAncestors = $i$f$visitAncestors;
        goto L13
    L61:
        int r18 = r0;
        int mask$iv4 = mask$iv;
        DelegatableNode $this$visitAncestors$iv3 = $this$visitAncestors$iv;
        int $i$f$visitAncestors3 = $i$f$visitAncestors;
    L63:
        layout$iv = layout$iv.getParent$ui_release();
        if (layout$iv == null) goto L68;
        NodeChain r6 = layout$iv.getNodes$ui_release();
        if (r6 == null) goto L68;
        Modifier.Node r7 = r6.getTail$ui_release();
    L69:
        node$iv = r7;
        r0 = r18;
        mask$iv = mask$iv4;
        $this$visitAncestors$iv = $this$visitAncestors$iv3;
        $i$f$visitAncestors = $i$f$visitAncestors3;
    L68:
        r7 = null;
        goto L69
    L62:
        r18 = r0;
        mask$iv4 = mask$iv;
        $this$visitAncestors$iv3 = $this$visitAncestors$iv;
        $i$f$visitAncestors3 = $i$f$visitAncestors;
        goto L63
    }

    /* JADX INFO: renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final /* synthetic */ <T> void m5843visitSelfAndAncestors5BbP62I(DelegatableNode $this$visitSelfAndAncestors_u2d5BbP62I, int type, int untilType, Function1<? super T, Unit> r31) {
        int r0 = 0;
        Modifier.Node self = $this$visitSelfAndAncestors_u2d5BbP62I.getNode();
        int mask$iv = type | untilType;
        boolean includeSelf$iv = true;
        boolean value$iv$iv = $this$visitSelfAndAncestors_u2d5BbP62I.getNode().isAttached();
        if (value$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv = $this$visitSelfAndAncestors_u2d5BbP62I.getNode();
        LayoutNode layout$iv = requireLayoutNode($this$visitSelfAndAncestors_u2d5BbP62I);
    L6:
        if (layout$iv == null) goto L82;
        Modifier.Node head$iv = layout$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L73;
    L9:
        if (node$iv == null) goto L72;
        if ((node$iv.getKindSet$ui_release() & mask$iv) == 0) goto L71;
        Modifier.Node it = node$iv;
        if (it == self) goto L21;
        if ((it.getKindSet$ui_release() & untilType) == 0) goto L17;
        boolean r13 = true;
    L18:
        if (r13 == false) goto L21;
        return;
    L17:
        r13 = false;
    L21:
        if ((it.getKindSet$ui_release() & type) == 0) goto L23;
        boolean r14 = true;
    L24:
        if (r14 == false) goto L71;
        Object stack$iv = null;
        Object node$iv2 = it;
    L26:
        if (node$iv2 == null) goto L71;
        r0 = r0;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv2 instanceof Object) == true) goto L29;
        Modifier.Node this_$iv$iv = (Modifier.Node) node$iv2;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L33;
        boolean r12 = true;
    L34:
        if (r12 == false) goto L65;
        if ((node$iv2 instanceof DelegatingNode) == false) goto L65;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv2;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L38:
        if (node$iv$iv == null) goto L62;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L42;
        boolean r22 = true;
    L43:
        if (r22 == false) goto L60;
        count$iv = count$iv + 1;
        Modifier.Node self2 = self;
        if (count$iv != 1) goto L47;
        node$iv2 = next$iv;
        mask$iv = mask$iv;
        includeSelf$iv = includeSelf$iv;
    L61:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        self = self2;
        mask$iv = mask$iv;
        includeSelf$iv = includeSelf$iv;
        goto L38
    L47:
        Object r1 = (MutableVector) stack$iv;
        if (r1 != null) goto L50;
        Object r2 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r3 = (MutableVector) r2;
    L51:
        stack$iv = r2;
        Modifier.Node theNode$iv = (Modifier.Node) node$iv2;
        if (theNode$iv == null) goto L57;
        MutableVector r4 = (MutableVector) stack$iv;
        if (r4 == null) goto L56;
        r4.add(theNode$iv);
    L56:
        node$iv2 = null;
    L57:
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L61;
        r5.add(next$iv);
        goto L61
    L50:
        r2 = r1;
        goto L51
    L60:
        self2 = self;
        mask$iv = mask$iv;
        includeSelf$iv = includeSelf$iv;
        goto L61
    L42:
        r22 = false;
        goto L43
    L62:
        Modifier.Node self3 = self;
        int mask$iv2 = mask$iv;
        boolean includeSelf$iv2 = includeSelf$iv;
        if (count$iv != 1) goto L66;
        self = self3;
        mask$iv = mask$iv2;
        includeSelf$iv = includeSelf$iv2;
    L66:
        node$iv2 = access$pop((MutableVector) stack$iv);
        self = self3;
        mask$iv = mask$iv2;
        includeSelf$iv = includeSelf$iv2;
    L65:
        self3 = self;
        mask$iv2 = mask$iv;
        includeSelf$iv2 = includeSelf$iv;
        goto L66
    L33:
        r12 = false;
        goto L34
    L29:
        r31.invoke(node$iv2);
        self3 = self;
        mask$iv2 = mask$iv;
        includeSelf$iv2 = includeSelf$iv;
        goto L66
    L23:
        r14 = false;
    L71:
        node$iv = node$iv.getParent$ui_release();
        r0 = r0;
        self = self;
        mask$iv = mask$iv;
        includeSelf$iv = includeSelf$iv;
        goto L9
    L72:
        int r17 = r0;
        Modifier.Node self4 = self;
        int mask$iv3 = mask$iv;
        boolean includeSelf$iv3 = includeSelf$iv;
    L74:
        layout$iv = layout$iv.getParent$ui_release();
        if (layout$iv == null) goto L79;
        NodeChain r6 = layout$iv.getNodes$ui_release();
        if (r6 == null) goto L79;
        Modifier.Node r7 = r6.getTail$ui_release();
    L80:
        node$iv = r7;
        r0 = r17;
        self = self4;
        mask$iv = mask$iv3;
        includeSelf$iv = includeSelf$iv3;
    L79:
        r7 = null;
        goto L80
    L73:
        r17 = r0;
        self4 = self;
        mask$iv3 = mask$iv;
        includeSelf$iv3 = includeSelf$iv;
        goto L74
    }

    /* JADX INFO: renamed from: ancestors-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m5832ancestors64DMado(DelegatableNode $this$ancestors_u2d64DMado, int type) {
        int r0 = 0;
        Object result = null;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$ancestors_u2d64DMado;
        boolean includeSelf$iv = false;
        boolean value$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv = requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv);
    L6:
        if (layout$iv$iv == null) goto L73;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & type) == 0) goto L64;
    L9:
        if (node$iv$iv == null) goto L63;
        if ((node$iv$iv.getKindSet$ui_release() & type) == 0) goto L62;
        Modifier.Node it$iv = node$iv$iv;
        Object stack$iv$iv = null;
        Modifier.Node r1 = it$iv;
    L13:
        if (r1 == null) goto L62;
        Object result2 = result;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r1 instanceof Object) == true) goto L16;
        Modifier.Node this_$iv$iv$iv = r1;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type) == 0) goto L23;
        int r2 = 1;
    L24:
        if (r2 == 0) goto L58;
        if ((r1 instanceof DelegatingNode) == false) goto L58;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r1;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L28:
        if (node$iv$iv$iv == null) goto L54;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type) == 0) goto L32;
        boolean r23 = true;
    L33:
        if (r23 == false) goto L52;
        count$iv$iv = count$iv$iv + 1;
        Modifier.Node r24 = r1;
        if (count$iv$iv != 1) goto L37;
        r1 = next$iv$iv;
        includeSelf$iv = includeSelf$iv;
    L53:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        includeSelf$iv = includeSelf$iv;
        goto L28
    L37:
        Object node$iv$iv2 = stack$iv$iv;
        Object r3 = (MutableVector) node$iv$iv2;
        if (r3 != null) goto L40;
        Object r4 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r5 = (MutableVector) r4;
    L41:
        stack$iv$iv = r4;
        Modifier.Node theNode$iv$iv = r24;
        if (theNode$iv$iv == null) goto L47;
        MutableVector r6 = (MutableVector) stack$iv$iv;
        if (r6 == null) goto L46;
        r6.add(theNode$iv$iv);
    L46:
        Modifier.Node r7 = null;
    L48:
        MutableVector r8 = (MutableVector) stack$iv$iv;
        if (r8 == null) goto L51;
        r8.add(next$iv$iv);
    L51:
        r1 = r7;
        count$iv$iv = count$iv$iv;
        goto L53
    L47:
        r7 = r24;
        goto L48
    L40:
        r4 = r3;
        goto L41
    L52:
        includeSelf$iv = includeSelf$iv;
        goto L53
    L32:
        r23 = false;
        goto L33
    L54:
        Modifier.Node r25 = r1;
        boolean includeSelf$iv2 = includeSelf$iv;
        if (count$iv$iv != 1) goto L57;
        result = result2;
        r1 = r25;
        includeSelf$iv = includeSelf$iv2;
        goto L13
    L57:
        result = result2;
    L59:
        r1 = access$pop((MutableVector) stack$iv$iv);
        includeSelf$iv = includeSelf$iv2;
    L58:
        includeSelf$iv2 = includeSelf$iv;
        result = result2;
        goto L59
    L23:
        r2 = 0;
        goto L24
    L16:
        Modifier.Node r9 = r1;
        if (result2 != null) goto L19;
        Object result3 = new ArrayList();
        result2 = (List) result3;
    L19:
        ((List) result2).add(r9);
        includeSelf$iv2 = includeSelf$iv;
        result = result2;
    L62:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        r0 = r0;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        includeSelf$iv = includeSelf$iv;
        goto L9
    L63:
        int r16 = r0;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        boolean includeSelf$iv3 = includeSelf$iv;
    L65:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L70;
        NodeChain r10 = layout$iv$iv.getNodes$ui_release();
        if (r10 == null) goto L70;
        Modifier.Node r11 = r10.getTail$ui_release();
    L71:
        node$iv$iv = r11;
        r0 = r16;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        includeSelf$iv = includeSelf$iv3;
    L70:
        r11 = null;
        goto L71
    L64:
        r16 = r0;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        includeSelf$iv3 = includeSelf$iv;
        goto L65
    L73:
        return (List) result;
    }

    /* JADX INFO: renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m5835nearestAncestor64DMado(DelegatableNode r29, int r30) {
        int r0 = 0;
        DelegatableNode r1 = r29;
        boolean r2 = false;
        int r3 = 0;
        int r4 = r30;
        if (r1.getNode().isAttached() == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node r7 = r1.getNode().getParent$ui_release();
        LayoutNode r8 = requireLayoutNode(r1);
    L6:
        if (r8 == null) goto L68;
        if ((r8.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r4) == 0) goto L60;
    L9:
        if (r7 == null) goto L59;
        if ((r7.getKindSet$ui_release() & r4) == 0) goto L57;
        Object r15 = null;
        Modifier.Node r9 = r7;
    L13:
        if (r9 == null) goto L56;
        r0 = r0;
        r1 = r1;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r9 instanceof Object) == true) goto L17;
        if ((r9.getKindSet$ui_release() & r30) == 0) goto L21;
        int r5 = 1;
    L22:
        if (r5 == 0) goto L54;
        if ((r9 instanceof DelegatingNode) == false) goto L54;
        int r6 = 0;
        Modifier.Node r21 = ((DelegatingNode) r9).getDelegate$ui_release();
    L26:
        if (r21 == null) goto L51;
        Modifier.Node r10 = r21;
        if ((r10.getKindSet$ui_release() & r30) == 0) goto L30;
        boolean r23 = true;
    L31:
        if (r23 == false) goto L49;
        r6 = r6 + 1;
        boolean r24 = r2;
        if (r6 != 1) goto L35;
        r9 = r10;
        r3 = r3;
        r4 = r4;
    L50:
        r21 = r21.getChild$ui_release();
        r2 = r24;
        r3 = r3;
        r4 = r4;
        goto L26
    L35:
        MutableVector r11 = (MutableVector) r15;
        if (r11 != null) goto L39;
        r11 = new MutableVector(new Modifier.Node[16], 0);
    L39:
        r15 = r11;
        Modifier.Node r12 = r9;
        if (r12 == null) goto L45;
        MutableVector r13 = (MutableVector) r15;
        if (r13 == null) goto L44;
        r13.add(r12);
    L44:
        r9 = null;
    L45:
        MutableVector r14 = (MutableVector) r15;
        if (r14 == null) goto L48;
        r14.add(r10);
    L48:
        r6 = r6;
        goto L50
    L49:
        r24 = r2;
        r3 = r3;
        r4 = r4;
        goto L50
    L30:
        r23 = false;
        goto L31
    L51:
        boolean r25 = r2;
        int r27 = r3;
        int r28 = r4;
        if (r6 == 1) goto L53;
    L55:
        r9 = access$pop((MutableVector) r15);
        r2 = r25;
        r3 = r27;
        r4 = r28;
        goto L13
    L53:
        r2 = r25;
        r3 = r27;
        r4 = r28;
    L54:
        r25 = r2;
        r27 = r3;
        r28 = r4;
        goto L55
    L21:
        r5 = 0;
        goto L22
    L17:
        return (T) r9;
    L56:
        int r17 = r0;
        DelegatableNode r18 = r1;
        boolean r26 = r2;
        int r210 = r3;
        int r211 = r4;
    L58:
        r7 = r7.getParent$ui_release();
        r0 = r17;
        r1 = r18;
        r2 = r26;
        r3 = r210;
        r4 = r211;
        goto L9
    L57:
        r17 = r0;
        r18 = r1;
        r26 = r2;
        r210 = r3;
        r211 = r4;
        goto L58
    L59:
        int r19 = r0;
        DelegatableNode r110 = r1;
        boolean r212 = r2;
        int r213 = r3;
        int r214 = r4;
        Modifier.Node r16 = null;
    L61:
        r8 = r8.getParent$ui_release();
        if (r8 == null) goto L66;
        NodeChain r20 = r8.getNodes$ui_release();
        if (r20 == null) goto L66;
        Modifier.Node r22 = r20.getTail$ui_release();
    L67:
        r7 = r22;
        r0 = r19;
        r1 = r110;
        r2 = r212;
        r3 = r213;
        r4 = r214;
    L66:
        r22 = r16;
        goto L67
    L60:
        r19 = r0;
        r110 = r1;
        r212 = r2;
        r213 = r3;
        r214 = r4;
        r16 = null;
        goto L61
    L68:
        return null;
    }

    /* JADX INFO: renamed from: visitChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m5840visitChildrenYYKmho$default(DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default, int type, boolean zOrder, Function1 block, int r30, Object r31) {
        if ((r30 & 2) == 0) goto L5;
        boolean zOrder2 = false;
    L6:
        int r1 = 0;
        int mask$iv = type;
        DelegatableNode $this$visitChildren$iv = $this$visitChildren_u2dY_u2dYKmho_u24default;
        boolean value$iv$iv = $this$visitChildren$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L9:
        int r10 = 0;
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv = $this$visitChildren$iv.getNode().getChild$ui_release();
        if (child$iv != null) goto L12;
        access$addLayoutNodeChildren(branches$iv, $this$visitChildren$iv.getNode(), zOrder2);
    L14:
        if (branches$iv.getSize() == 0) goto L16;
        int r6 = 1;
    L17:
        if (r6 == 0) goto L71;
        Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
        if ((branch$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L20;
        Modifier.Node node$iv = branch$iv;
    L22:
        if (node$iv == null) goto L69;
        if ((node$iv.getKindSet$ui_release() & mask$iv) != 0) goto L25;
        node$iv = node$iv.getChild$ui_release();
        zOrder2 = zOrder2;
        r1 = r1;
        goto L22
    L25:
        Modifier.Node it = node$iv;
        Object stack$iv = null;
        Modifier.Node r11 = it;
    L26:
        if (r11 == null) goto L67;
        zOrder2 = zOrder2;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r11 instanceof Object) == true) goto L29;
        Modifier.Node this_$iv$iv = r11;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L33;
        boolean r12 = true;
    L34:
        if (r12 == false) goto L65;
        if ((r11 instanceof DelegatingNode) == false) goto L65;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) r11;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L38:
        if (node$iv$iv == null) goto L62;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L42;
        boolean r21 = true;
    L43:
        if (r21 == false) goto L60;
        count$iv = count$iv + 1;
        int r32 = r1;
        if (count$iv != 1) goto L47;
        r11 = next$iv;
        mask$iv = mask$iv;
        $this$visitChildren$iv = $this$visitChildren$iv;
    L61:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r1 = r32;
        mask$iv = mask$iv;
        $this$visitChildren$iv = $this$visitChildren$iv;
        goto L38
    L47:
        Object r2 = (MutableVector) stack$iv;
        if (r2 != null) goto L50;
        Object r3 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r4 = (MutableVector) r3;
    L51:
        stack$iv = r3;
        Modifier.Node theNode$iv = r11;
        if (theNode$iv == null) goto L57;
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L56;
        r5.add(theNode$iv);
    L56:
        r11 = null;
    L57:
        MutableVector r7 = (MutableVector) stack$iv;
        if (r7 == null) goto L61;
        r7.add(next$iv);
        goto L61
    L50:
        r3 = r2;
        goto L51
    L60:
        r32 = r1;
        mask$iv = mask$iv;
        $this$visitChildren$iv = $this$visitChildren$iv;
        goto L61
    L42:
        r21 = false;
        goto L43
    L62:
        int r33 = r1;
        int mask$iv2 = mask$iv;
        DelegatableNode $this$visitChildren$iv2 = $this$visitChildren$iv;
        boolean r0 = true;
        if (count$iv != 1) goto L66;
        r1 = r33;
        mask$iv = mask$iv2;
        $this$visitChildren$iv = $this$visitChildren$iv2;
    L66:
        r11 = access$pop((MutableVector) stack$iv);
        r1 = r33;
        mask$iv = mask$iv2;
        $this$visitChildren$iv = $this$visitChildren$iv2;
    L65:
        r33 = r1;
        mask$iv2 = mask$iv;
        $this$visitChildren$iv2 = $this$visitChildren$iv;
        r0 = true;
        goto L66
    L33:
        r12 = false;
        goto L34
    L29:
        block.invoke(r11);
        r33 = r1;
        mask$iv2 = mask$iv;
        $this$visitChildren$iv2 = $this$visitChildren$iv;
        r0 = true;
        goto L66
    L67:
        r10 = 0;
        r1 = r1;
        goto L14
    L69:
        r1 = r1;
        goto L14
    L20:
        access$addLayoutNodeChildren(branches$iv, branch$iv, zOrder2);
        goto L14
    L71:
        return;
    L16:
        r6 = r10;
        goto L17
    L12:
        branches$iv.add(child$iv);
        goto L14
    L5:
        zOrder2 = zOrder;
        goto L6
    }

    /* JADX INFO: renamed from: visitChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m5839visitChildrenYYKmho(DelegatableNode $this$visitChildren_u2dY_u2dYKmho, int type, boolean zOrder, Function1<? super T, Unit> r30) {
        boolean r0 = zOrder;
        int r1 = 0;
        int mask$iv = type;
        DelegatableNode $this$visitChildren$iv = $this$visitChildren_u2dY_u2dYKmho;
        boolean value$iv$iv = $this$visitChildren$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L5:
        int r10 = 0;
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv = $this$visitChildren$iv.getNode().getChild$ui_release();
        if (child$iv != null) goto L8;
        access$addLayoutNodeChildren(branches$iv, $this$visitChildren$iv.getNode(), r0);
    L10:
        if (branches$iv.getSize() == 0) goto L12;
        int r6 = 1;
    L13:
        if (r6 == 0) goto L67;
        Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
        if ((branch$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L16;
        Modifier.Node node$iv = branch$iv;
    L18:
        if (node$iv == null) goto L65;
        if ((node$iv.getKindSet$ui_release() & mask$iv) != 0) goto L21;
        node$iv = node$iv.getChild$ui_release();
        r1 = r1;
        goto L18
    L21:
        Object it = node$iv;
        Object stack$iv = null;
        Object node$iv2 = it;
    L22:
        if (node$iv2 == null) goto L63;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv2 instanceof Object) == true) goto L25;
        Modifier.Node this_$iv$iv = (Modifier.Node) node$iv2;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L29;
        boolean r11 = true;
    L30:
        if (r11 == false) goto L61;
        if ((node$iv2 instanceof DelegatingNode) == false) goto L61;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv2;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L34:
        if (node$iv$iv == null) goto L58;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L38;
        boolean r21 = true;
    L39:
        if (r21 == false) goto L56;
        count$iv = count$iv + 1;
        int r22 = r1;
        if (count$iv != 1) goto L43;
        node$iv2 = next$iv;
        mask$iv = mask$iv;
        $this$visitChildren$iv = $this$visitChildren$iv;
    L57:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r1 = r22;
        mask$iv = mask$iv;
        $this$visitChildren$iv = $this$visitChildren$iv;
        goto L34
    L43:
        Object r2 = (MutableVector) stack$iv;
        if (r2 != null) goto L46;
        Object r3 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r4 = (MutableVector) r3;
    L47:
        stack$iv = r3;
        Modifier.Node theNode$iv = (Modifier.Node) node$iv2;
        if (theNode$iv == null) goto L53;
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L52;
        r5.add(theNode$iv);
    L52:
        node$iv2 = null;
    L53:
        MutableVector r7 = (MutableVector) stack$iv;
        if (r7 == null) goto L57;
        r7.add(next$iv);
        goto L57
    L46:
        r3 = r2;
        goto L47
    L56:
        r22 = r1;
        mask$iv = mask$iv;
        $this$visitChildren$iv = $this$visitChildren$iv;
        goto L57
    L38:
        r21 = false;
        goto L39
    L58:
        int r23 = r1;
        int mask$iv2 = mask$iv;
        DelegatableNode $this$visitChildren$iv2 = $this$visitChildren$iv;
        boolean r8 = true;
        if (count$iv != 1) goto L62;
        r1 = r23;
        mask$iv = mask$iv2;
        $this$visitChildren$iv = $this$visitChildren$iv2;
    L62:
        node$iv2 = access$pop((MutableVector) stack$iv);
        r1 = r23;
        mask$iv = mask$iv2;
        $this$visitChildren$iv = $this$visitChildren$iv2;
    L61:
        r23 = r1;
        mask$iv2 = mask$iv;
        $this$visitChildren$iv2 = $this$visitChildren$iv;
        r8 = true;
        goto L62
    L29:
        r11 = false;
        goto L30
    L25:
        r30.invoke(node$iv2);
        r23 = r1;
        mask$iv2 = mask$iv;
        $this$visitChildren$iv2 = $this$visitChildren$iv;
        r8 = true;
        goto L62
    L63:
        r0 = zOrder;
        r10 = 0;
        r1 = r1;
        goto L10
    L65:
        r0 = zOrder;
        r1 = r1;
        goto L10
    L16:
        access$addLayoutNodeChildren(branches$iv, branch$iv, r0);
        goto L10
    L67:
        return;
    L12:
        r6 = r10;
        goto L13
    L8:
        branches$iv.add(child$iv);
        goto L10
    }

    /* JADX INFO: renamed from: visitSelfAndChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m5845visitSelfAndChildrenYYKmho$default(DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default, int type, boolean zOrder, Function1 block, int r32, Object r33) {
        block = block;
        if ((r32 & 2) == 0) goto L5;
        boolean zOrder2 = false;
    L6:
        int r2 = 0;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default.getNode();
        Object stack$iv = null;
        Modifier.Node r6 = $this$dispatchForKind_u2d6rFNWt0$iv;
    L7:
        int count$iv = 3;
        boolean r9 = false;
        int r10 = 1;
        if (r6 == null) goto L49;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r6 instanceof Object) == true) goto L11;
        Modifier.Node this_$iv$iv = r6;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L15;
        boolean r7 = true;
    L16:
        if (r7 == false) goto L47;
        if ((r6 instanceof DelegatingNode) == false) goto L47;
        int count$iv2 = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) r6;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L20:
        if (node$iv$iv == null) goto L44;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L24;
        int r15 = r10;
    L25:
        if (r15 == 0) goto L42;
        count$iv2 = count$iv2 + 1;
        if (count$iv2 != r10) goto L29;
        r6 = next$iv;
        r2 = r2;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
    L43:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r2 = r2;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
        r10 = 1;
        goto L20
    L29:
        Object r16 = (MutableVector) stack$iv;
        if (r16 != null) goto L33;
        Object r3 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r4 = (MutableVector) r3;
        r16 = r3;
    L33:
        stack$iv = r16;
        Modifier.Node theNode$iv = r6;
        if (theNode$iv == null) goto L39;
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L38;
        r5.add(theNode$iv);
    L38:
        r6 = null;
    L39:
        MutableVector r8 = (MutableVector) stack$iv;
        if (r8 == null) goto L43;
        r8.add(next$iv);
        goto L43
    L42:
        r2 = r2;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L43
    L24:
        r15 = 0;
        goto L25
    L44:
        int r34 = r2;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv;
        if (count$iv2 != 1) goto L48;
        r2 = r34;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv2;
    L48:
        r6 = access$pop((MutableVector) stack$iv);
        r2 = r34;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv2;
    L47:
        r34 = r2;
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L48
    L15:
        r7 = false;
        goto L16
    L11:
        block.invoke(r6);
        r34 = r2;
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L48
    L49:
        int mask$iv = type;
        DelegatableNode $this$visitChildren$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default;
        boolean value$iv$iv = $this$visitChildren$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L52;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L52:
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv = $this$visitChildren$iv.getNode().getChild$ui_release();
        if (child$iv != null) goto L55;
        access$addLayoutNodeChildren(branches$iv, $this$visitChildren$iv.getNode(), zOrder2);
    L57:
        if (branches$iv.getSize() == 0) goto L59;
        boolean r11 = true;
    L60:
        if (r11 == false) goto L114;
        Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
        if ((branch$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L63;
        Modifier.Node node$iv = branch$iv;
    L65:
        if (node$iv == null) goto L112;
        if ((node$iv.getKindSet$ui_release() & mask$iv) != 0) goto L68;
        node$iv = node$iv.getChild$ui_release();
        block = block;
        zOrder2 = zOrder2;
        mask$iv = mask$iv;
        count$iv = 3;
        goto L65
    L68:
        Modifier.Node it = node$iv;
        Object stack$iv2 = null;
        Modifier.Node r12 = it;
    L69:
        if (r12 == null) goto L110;
        Intrinsics.reifiedOperationMarker(count$iv, "T");
        if ((r12 instanceof Object) == true) goto L72;
        Modifier.Node this_$iv$iv3 = r12;
        if ((this_$iv$iv3.getKindSet$ui_release() & type) == 0) goto L76;
        boolean r13 = true;
    L77:
        if (r13 == false) goto L108;
        if ((r12 instanceof DelegatingNode) == false) goto L108;
        int count$iv3 = 0;
        DelegatingNode this_$iv$iv4 = (DelegatingNode) r12;
        Modifier.Node node$iv$iv2 = this_$iv$iv4.getDelegate$ui_release();
    L81:
        if (node$iv$iv2 == null) goto L105;
        Modifier.Node next$iv2 = node$iv$iv2;
        if ((next$iv2.getKindSet$ui_release() & type) == 0) goto L85;
        boolean r22 = true;
    L86:
        if (r22 == false) goto L103;
        count$iv3 = count$iv3 + 1;
        boolean zOrder3 = zOrder2;
        if (count$iv3 != 1) goto L90;
        r12 = next$iv2;
        mask$iv = mask$iv;
        $this$visitChildren$iv = $this$visitChildren$iv;
    L104:
        node$iv$iv2 = node$iv$iv2.getChild$ui_release();
        zOrder2 = zOrder3;
        mask$iv = mask$iv;
        $this$visitChildren$iv = $this$visitChildren$iv;
        goto L81
    L90:
        Object r1 = (MutableVector) stack$iv2;
        if (r1 != null) goto L93;
        Object r14 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r17 = (MutableVector) r14;
    L94:
        stack$iv2 = r14;
        Modifier.Node theNode$iv2 = r12;
        if (theNode$iv2 == null) goto L100;
        MutableVector r18 = (MutableVector) stack$iv2;
        if (r18 == null) goto L99;
        r18.add(theNode$iv2);
    L99:
        r12 = null;
    L100:
        MutableVector r19 = (MutableVector) stack$iv2;
        if (r19 == null) goto L104;
        r19.add(next$iv2);
        goto L104
    L93:
        r14 = r1;
        goto L94
    L103:
        zOrder3 = zOrder2;
        mask$iv = mask$iv;
        $this$visitChildren$iv = $this$visitChildren$iv;
        goto L104
    L85:
        r22 = false;
        goto L86
    L105:
        boolean zOrder4 = zOrder2;
        int mask$iv2 = mask$iv;
        DelegatableNode $this$visitChildren$iv2 = $this$visitChildren$iv;
        if (count$iv3 != 1) goto L109;
        zOrder2 = zOrder4;
        mask$iv = mask$iv2;
        $this$visitChildren$iv = $this$visitChildren$iv2;
        count$iv = 3;
    L109:
        r12 = access$pop((MutableVector) stack$iv2);
        zOrder2 = zOrder4;
        mask$iv = mask$iv2;
        $this$visitChildren$iv = $this$visitChildren$iv2;
        count$iv = 3;
    L108:
        zOrder4 = zOrder2;
        mask$iv2 = mask$iv;
        $this$visitChildren$iv2 = $this$visitChildren$iv;
        goto L109
    L76:
        r13 = false;
        goto L77
    L72:
        block.invoke(r12);
        zOrder4 = zOrder2;
        mask$iv2 = mask$iv;
        $this$visitChildren$iv2 = $this$visitChildren$iv;
        goto L109
    L110:
        block = block;
        r9 = false;
        zOrder2 = zOrder2;
        mask$iv = mask$iv;
        count$iv = 3;
        goto L57
    L112:
        block = block;
        zOrder2 = zOrder2;
        mask$iv = mask$iv;
        count$iv = 3;
        goto L57
    L63:
        access$addLayoutNodeChildren(branches$iv, branch$iv, zOrder2);
        goto L57
    L114:
        return;
    L59:
        r11 = r9;
        goto L60
    L55:
        branches$iv.add(child$iv);
        goto L57
    L5:
        zOrder2 = zOrder;
        goto L6
    }

    /* JADX INFO: renamed from: visitSelfAndChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m5844visitSelfAndChildrenYYKmho(DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho, int type, boolean zOrder, Function1<? super T, Unit> r32) {
        boolean r0 = zOrder;
        r32 = r32;
        int r2 = 0;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho.getNode();
        Object stack$iv = null;
        Modifier.Node node$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
    L3:
        int count$iv = 3;
        boolean r9 = false;
        int r10 = 1;
        if (node$iv == null) goto L45;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv instanceof Object) == true) goto L7;
        Modifier.Node this_$iv$iv = node$iv;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L11;
        boolean r7 = true;
    L12:
        if (r7 == false) goto L43;
        if ((node$iv instanceof DelegatingNode) == false) goto L43;
        int count$iv2 = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L16:
        if (node$iv$iv == null) goto L40;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L20;
        int r15 = r10;
    L21:
        if (r15 == 0) goto L38;
        count$iv2 = count$iv2 + 1;
        if (count$iv2 != r10) goto L25;
        node$iv = next$iv;
        r2 = r2;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
    L39:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r2 = r2;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
        r10 = 1;
        goto L16
    L25:
        Object r16 = (MutableVector) stack$iv;
        if (r16 != null) goto L29;
        Object r3 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r4 = (MutableVector) r3;
        r16 = r3;
    L29:
        stack$iv = r16;
        Modifier.Node theNode$iv = node$iv;
        if (theNode$iv == null) goto L35;
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L34;
        r5.add(theNode$iv);
    L34:
        node$iv = null;
    L35:
        MutableVector r6 = (MutableVector) stack$iv;
        if (r6 == null) goto L39;
        r6.add(next$iv);
        goto L39
    L38:
        r2 = r2;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L39
    L20:
        r15 = 0;
        goto L21
    L40:
        int r18 = r2;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv;
        if (count$iv2 != 1) goto L44;
        r2 = r18;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv2;
    L44:
        node$iv = access$pop((MutableVector) stack$iv);
        r2 = r18;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv2;
    L43:
        r18 = r2;
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L44
    L11:
        r7 = false;
        goto L12
    L7:
        r32.invoke(node$iv);
        r18 = r2;
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L44
    L45:
        int mask$iv = type;
        DelegatableNode $this$visitChildren$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho;
        boolean value$iv$iv = $this$visitChildren$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L48;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L48:
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv = $this$visitChildren$iv.getNode().getChild$ui_release();
        if (child$iv != null) goto L51;
        access$addLayoutNodeChildren(branches$iv, $this$visitChildren$iv.getNode(), r0);
    L53:
        if (branches$iv.getSize() == 0) goto L55;
        boolean r8 = true;
    L56:
        if (r8 == false) goto L110;
        Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
        if ((branch$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L59;
        Modifier.Node node$iv2 = branch$iv;
    L61:
        if (node$iv2 == null) goto L108;
        if ((node$iv2.getKindSet$ui_release() & mask$iv) != 0) goto L64;
        node$iv2 = node$iv2.getChild$ui_release();
        mask$iv = mask$iv;
        count$iv = 3;
        r32 = r32;
        goto L61
    L64:
        Object it = node$iv2;
        Object stack$iv2 = null;
        Object node$iv3 = it;
    L65:
        if (node$iv3 == null) goto L106;
        Intrinsics.reifiedOperationMarker(count$iv, "T");
        if ((node$iv3 instanceof Object) == true) goto L68;
        Modifier.Node this_$iv$iv3 = (Modifier.Node) node$iv3;
        if ((this_$iv$iv3.getKindSet$ui_release() & type) == 0) goto L72;
        boolean r11 = true;
    L73:
        if (r11 == false) goto L104;
        if ((node$iv3 instanceof DelegatingNode) == false) goto L104;
        int count$iv3 = 0;
        DelegatingNode this_$iv$iv4 = (DelegatingNode) node$iv3;
        Modifier.Node node$iv$iv2 = this_$iv$iv4.getDelegate$ui_release();
    L77:
        if (node$iv$iv2 == null) goto L101;
        Modifier.Node next$iv2 = node$iv$iv2;
        if ((next$iv2.getKindSet$ui_release() & type) == 0) goto L81;
        boolean r24 = true;
    L82:
        if (r24 == false) goto L99;
        count$iv3 = count$iv3 + 1;
        if (count$iv3 != 1) goto L86;
        node$iv3 = next$iv2;
        mask$iv = mask$iv;
        $this$visitChildren$iv = $this$visitChildren$iv;
    L100:
        node$iv$iv2 = node$iv$iv2.getChild$ui_release();
        mask$iv = mask$iv;
        $this$visitChildren$iv = $this$visitChildren$iv;
        goto L77
    L86:
        Object r1 = (MutableVector) stack$iv2;
        if (r1 != null) goto L89;
        Object r12 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r13 = (MutableVector) r12;
    L90:
        stack$iv2 = r12;
        Modifier.Node theNode$iv2 = (Modifier.Node) node$iv3;
        if (theNode$iv2 == null) goto L96;
        MutableVector r14 = (MutableVector) stack$iv2;
        if (r14 == null) goto L95;
        r14.add(theNode$iv2);
    L95:
        node$iv3 = null;
    L96:
        MutableVector r17 = (MutableVector) stack$iv2;
        if (r17 == null) goto L100;
        r17.add(next$iv2);
        goto L100
    L89:
        r12 = r1;
        goto L90
    L99:
        mask$iv = mask$iv;
        $this$visitChildren$iv = $this$visitChildren$iv;
        goto L100
    L81:
        r24 = false;
        goto L82
    L101:
        int mask$iv2 = mask$iv;
        DelegatableNode $this$visitChildren$iv2 = $this$visitChildren$iv;
        if (count$iv3 != 1) goto L105;
        mask$iv = mask$iv2;
        $this$visitChildren$iv = $this$visitChildren$iv2;
        count$iv = 3;
    L105:
        node$iv3 = access$pop((MutableVector) stack$iv2);
        mask$iv = mask$iv2;
        $this$visitChildren$iv = $this$visitChildren$iv2;
        count$iv = 3;
    L104:
        mask$iv2 = mask$iv;
        $this$visitChildren$iv2 = $this$visitChildren$iv;
        goto L105
    L72:
        r11 = false;
        goto L73
    L68:
        r32.invoke(node$iv3);
        mask$iv2 = mask$iv;
        $this$visitChildren$iv2 = $this$visitChildren$iv;
        goto L105
    L106:
        r0 = zOrder;
        r9 = false;
        mask$iv = mask$iv;
        count$iv = 3;
        r32 = r32;
        goto L53
    L108:
        r0 = zOrder;
        mask$iv = mask$iv;
        count$iv = 3;
        r32 = r32;
        goto L53
    L59:
        access$addLayoutNodeChildren(branches$iv, branch$iv, r0);
        goto L53
    L110:
        return;
    L55:
        r8 = r9;
        goto L56
    L51:
        branches$iv.add(child$iv);
        goto L53
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: visitSubtreeIf-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m5850visitSubtreeIfYYKmho$default(DelegatableNode $this$visitSubtreeIf_u2dY_u2dYKmho_u24default, int type, boolean zOrder, Function1 block, int r30, Object r31) {
        if ((r30 & 2) == 0) goto L5;
        boolean zOrder2 = false;
    L6:
        int r1 = 0;
        int mask$iv = type;
        DelegatableNode $this$visitSubtreeIf$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default;
        int $i$f$visitSubtreeIf = 0;
        boolean value$iv$iv = $this$visitSubtreeIf$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
    L9:
        Modifier.Node child$iv = null;
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv2 = $this$visitSubtreeIf$iv.getNode().getChild$ui_release();
        if (child$iv2 != null) goto L12;
        access$addLayoutNodeChildren(branches$iv, $this$visitSubtreeIf$iv.getNode(), zOrder2);
    L13:
        int r11 = 1;
        if (branches$iv.getSize() == 0) goto L16;
        Object r6 = 1;
    L17:
        if (r6 == 0) goto L81;
        Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
        if ((branch$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L79;
        Modifier.Node node$iv = branch$iv;
    L21:
        if (node$iv == null) goto L79;
        if ((node$iv.getKindSet$ui_release() & mask$iv) == 0) goto L75;
        Modifier.Node node = node$iv;
        Object stack$iv = null;
        Modifier.Node r10 = node;
    L25:
        if (r10 == null) goto L70;
        r1 = r1;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r10 instanceof Object) == true) goto L28;
        int mask$iv2 = mask$iv;
        Modifier.Node this_$iv$iv = r10;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L35;
        boolean r2 = true;
    L36:
        if (r2 == false) goto L68;
        if ((r10 instanceof DelegatingNode) == false) goto L68;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) r10;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L40:
        if (node$iv$iv == null) goto L65;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L44;
        boolean r20 = true;
    L45:
        if (r20 == false) goto L63;
        count$iv = count$iv + 1;
        DelegatableNode $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv;
        if (count$iv != 1) goto L49;
        r10 = next$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
    L64:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv2;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
        goto L40
    L49:
        Object r3 = (MutableVector) stack$iv;
        if (r3 != null) goto L53;
        r3 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r4 = (MutableVector) r3;
    L53:
        stack$iv = r3;
        Modifier.Node theNode$iv = r10;
        if (theNode$iv == null) goto L59;
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L58;
        r5.add(theNode$iv);
    L58:
        r10 = null;
    L59:
        MutableVector r7 = (MutableVector) stack$iv;
        if (r7 == null) goto L62;
        r7.add(next$iv);
    L62:
        count$iv = count$iv;
        goto L64
    L63:
        $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
        goto L64
    L44:
        r20 = false;
        goto L45
    L65:
        DelegatableNode $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv;
        int $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf;
        Modifier.Node child$iv3 = child$iv2;
        int r8 = 1;
        if (count$iv != 1) goto L69;
        r11 = 1;
        mask$iv = mask$iv2;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv3;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf2;
        child$iv2 = child$iv3;
    L69:
        r10 = access$pop((MutableVector) stack$iv);
        r11 = r8;
        mask$iv = mask$iv2;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv3;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf2;
        child$iv2 = child$iv3;
    L68:
        $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf;
        child$iv3 = child$iv2;
        r8 = 1;
        goto L69
    L35:
        r2 = false;
        goto L36
    L28:
        mask$iv2 = mask$iv;
        if (((Boolean) block.invoke(r10)).booleanValue() == false) goto L30;
        $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf;
        child$iv3 = child$iv2;
        r8 = 1;
        goto L69
    L30:
        int r9 = 0;
        int r12 = 1;
        Modifier.Node child$iv4 = null;
    L72:
        if (r9 != 0) goto L76;
        r1 = r1;
        child$iv = child$iv4;
        mask$iv = mask$iv2;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
    L76:
        node$iv = node$iv.getChild$ui_release();
        r1 = r1;
        r11 = r12;
        child$iv = child$iv4;
        mask$iv = mask$iv2;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
        goto L21
    L70:
        r1 = r1;
        mask$iv2 = mask$iv;
        r12 = r11;
        child$iv4 = null;
        r9 = r12;
        goto L72
    L75:
        r1 = r1;
        mask$iv2 = mask$iv;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
        child$iv4 = child$iv;
        r12 = r11;
    L79:
        access$addLayoutNodeChildren(branches$iv, branch$iv, zOrder2);
        r1 = r1;
        child$iv = child$iv;
        mask$iv = mask$iv;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
        goto L13
    L81:
        return;
    L16:
        r6 = child$iv;
        goto L17
    L12:
        branches$iv.add(child$iv2);
        goto L13
    L5:
        zOrder2 = zOrder;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: visitSubtreeIf-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m5849visitSubtreeIfYYKmho(DelegatableNode $this$visitSubtreeIf_u2dY_u2dYKmho, int type, boolean zOrder, Function1<? super T, Boolean> r31) {
        int r1 = 0;
        int mask$iv = type;
        DelegatableNode $this$visitSubtreeIf$iv = $this$visitSubtreeIf_u2dY_u2dYKmho;
        int $i$f$visitSubtreeIf = 0;
        boolean value$iv$iv = $this$visitSubtreeIf$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
    L5:
        Modifier.Node child$iv = null;
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv2 = $this$visitSubtreeIf$iv.getNode().getChild$ui_release();
        if (child$iv2 != null) goto L8;
        access$addLayoutNodeChildren(branches$iv, $this$visitSubtreeIf$iv.getNode(), zOrder);
    L9:
        boolean r11 = true;
        if (branches$iv.getSize() == 0) goto L12;
        Object r6 = 1;
    L13:
        if (r6 == 0) goto L77;
        Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
        if ((branch$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L75;
        Modifier.Node node$iv = branch$iv;
    L17:
        if (node$iv == null) goto L75;
        if ((node$iv.getKindSet$ui_release() & mask$iv) == 0) goto L71;
        Object node = node$iv;
        Object stack$iv = null;
        Object node$iv2 = node;
    L21:
        if (node$iv2 == null) goto L66;
        r1 = r1;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv2 instanceof Object) == true) goto L24;
        int mask$iv2 = mask$iv;
        Modifier.Node this_$iv$iv = (Modifier.Node) node$iv2;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L31;
        boolean r2 = true;
    L32:
        if (r2 == false) goto L64;
        if ((node$iv2 instanceof DelegatingNode) == false) goto L64;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv2;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L36:
        if (node$iv$iv == null) goto L61;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L40;
        boolean r22 = true;
    L41:
        if (r22 == false) goto L59;
        count$iv = count$iv + 1;
        DelegatableNode $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv;
        if (count$iv != 1) goto L45;
        node$iv2 = next$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
    L60:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv2;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
        goto L36
    L45:
        Object r3 = (MutableVector) stack$iv;
        if (r3 != null) goto L49;
        r3 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r4 = (MutableVector) r3;
    L49:
        stack$iv = r3;
        Modifier.Node theNode$iv = (Modifier.Node) node$iv2;
        if (theNode$iv == null) goto L55;
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L54;
        r5.add(theNode$iv);
    L54:
        node$iv2 = null;
    L55:
        MutableVector r7 = (MutableVector) stack$iv;
        if (r7 == null) goto L58;
        r7.add(next$iv);
    L58:
        count$iv = count$iv;
        goto L60
    L59:
        $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
        goto L60
    L40:
        r22 = false;
        goto L41
    L61:
        DelegatableNode $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv;
        int $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf;
        Modifier.Node child$iv3 = child$iv2;
        boolean r8 = true;
        if (count$iv != 1) goto L65;
        r11 = true;
        mask$iv = mask$iv2;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv3;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf2;
        child$iv2 = child$iv3;
    L65:
        node$iv2 = access$pop((MutableVector) stack$iv);
        r11 = r8;
        mask$iv = mask$iv2;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv3;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf2;
        child$iv2 = child$iv3;
    L64:
        $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf;
        child$iv3 = child$iv2;
        r8 = true;
        goto L65
    L31:
        r2 = false;
        goto L32
    L24:
        Object it = node$iv2;
        mask$iv2 = mask$iv;
        if (r31.invoke(it).booleanValue() == false) goto L26;
        $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf;
        child$iv3 = child$iv2;
        r8 = true;
        goto L65
    L26:
        boolean r9 = true;
        Modifier.Node child$iv4 = null;
        boolean diveDeeper$iv = false;
    L68:
        if (diveDeeper$iv == true) goto L72;
        child$iv = child$iv4;
        r1 = r1;
        mask$iv = mask$iv2;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
    L72:
        node$iv = node$iv.getChild$ui_release();
        r11 = r9;
        child$iv = child$iv4;
        r1 = r1;
        mask$iv = mask$iv2;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
        goto L17
    L66:
        r1 = r1;
        mask$iv2 = mask$iv;
        r9 = r11;
        child$iv4 = null;
        diveDeeper$iv = r9;
        goto L68
    L71:
        r1 = r1;
        mask$iv2 = mask$iv;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
        child$iv4 = child$iv;
        r9 = r11;
    L75:
        access$addLayoutNodeChildren(branches$iv, branch$iv, zOrder);
        child$iv = child$iv;
        r1 = r1;
        mask$iv = mask$iv;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        child$iv2 = child$iv2;
        goto L9
    L77:
        return;
    L12:
        r6 = child$iv;
        goto L13
    L8:
        branches$iv.add(child$iv2);
        goto L9
    }

    /* JADX INFO: renamed from: visitSubtree-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m5848visitSubtreeYYKmho$default(DelegatableNode $this$visitSubtree_u2dY_u2dYKmho_u24default, int type, boolean zOrder, Function1 block, int r30, Object r31) {
        if ((r30 & 2) == 0) goto L5;
        boolean zOrder2 = false;
    L6:
        int r1 = 0;
        int mask$iv = type;
        DelegatableNode $this$visitSubtreeIf$iv = $this$visitSubtree_u2dY_u2dYKmho_u24default;
        int $i$f$visitSubtreeIf = 0;
        boolean value$iv$iv = $this$visitSubtreeIf$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
    L9:
        int r10 = 0;
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv = $this$visitSubtreeIf$iv.getNode().getChild$ui_release();
        if (child$iv != null) goto L12;
        access$addLayoutNodeChildren(branches$iv, $this$visitSubtreeIf$iv.getNode(), zOrder2);
    L13:
        int r11 = 1;
        if (branches$iv.getSize() == 0) goto L16;
        int r6 = 1;
    L17:
        if (r6 == 0) goto L76;
        Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
        if ((branch$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L74;
        Modifier.Node node$iv = branch$iv;
    L21:
        if (node$iv == null) goto L74;
        if ((node$iv.getKindSet$ui_release() & mask$iv) == 0) goto L70;
        Modifier.Node it = node$iv;
        Object stack$iv = null;
        Modifier.Node r12 = it;
    L25:
        if (r12 == null) goto L66;
        r1 = r1;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r12 instanceof Object) == true) goto L28;
        Modifier.Node this_$iv$iv = r12;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L32;
        boolean r13 = true;
    L33:
        if (r13 == false) goto L64;
        if ((r12 instanceof DelegatingNode) == false) goto L64;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) r12;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L37:
        if (node$iv$iv == null) goto L61;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L41;
        boolean r20 = true;
    L42:
        if (r20 == false) goto L59;
        count$iv = count$iv + 1;
        int mask$iv2 = mask$iv;
        if (count$iv != 1) goto L46;
        r12 = next$iv;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
    L60:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        mask$iv = mask$iv2;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        goto L37
    L46:
        Object r2 = (MutableVector) stack$iv;
        if (r2 != null) goto L49;
        Object r3 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r4 = (MutableVector) r3;
    L50:
        stack$iv = r3;
        Modifier.Node theNode$iv = r12;
        if (theNode$iv == null) goto L56;
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L55;
        r5.add(theNode$iv);
    L55:
        r12 = null;
    L56:
        MutableVector r7 = (MutableVector) stack$iv;
        if (r7 == null) goto L60;
        r7.add(next$iv);
        goto L60
    L49:
        r3 = r2;
        goto L50
    L59:
        mask$iv2 = mask$iv;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        goto L60
    L41:
        r20 = false;
        goto L42
    L61:
        int mask$iv3 = mask$iv;
        DelegatableNode $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv;
        int $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf;
        if (count$iv != 1) goto L65;
        mask$iv = mask$iv3;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv2;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf2;
    L65:
        r12 = access$pop((MutableVector) stack$iv);
        mask$iv = mask$iv3;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv2;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf2;
    L64:
        mask$iv3 = mask$iv;
        $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf;
        goto L65
    L32:
        r13 = false;
        goto L33
    L28:
        block.invoke(r12);
        mask$iv3 = mask$iv;
        $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf;
        goto L65
    L66:
        int r32 = r1;
        int mask$iv4 = mask$iv;
        DelegatableNode $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv;
        int $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf;
        int mask$iv5 = 0;
        int r8 = 1;
        if (1 != 0) goto L71;
        r1 = r32;
        r10 = 0;
        mask$iv = mask$iv4;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv3;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf3;
    L71:
        node$iv = node$iv.getChild$ui_release();
        r11 = r8;
        r10 = mask$iv5;
        mask$iv = mask$iv4;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv3;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf3;
        r1 = r32;
        goto L21
    L70:
        r32 = r1;
        mask$iv4 = mask$iv;
        $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf;
        mask$iv5 = r10;
        r8 = r11;
    L74:
        int mask$iv6 = mask$iv;
        int mask$iv7 = r10;
        access$addLayoutNodeChildren(branches$iv, branch$iv, zOrder2);
        r1 = r1;
        r10 = mask$iv7;
        mask$iv = mask$iv6;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        goto L13
    L76:
        return;
    L16:
        r6 = r10;
        goto L17
    L12:
        branches$iv.add(child$iv);
        goto L13
    L5:
        zOrder2 = zOrder;
        goto L6
    }

    /* JADX INFO: renamed from: visitSubtree-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m5847visitSubtreeYYKmho(DelegatableNode $this$visitSubtree_u2dY_u2dYKmho, int type, boolean zOrder, Function1<? super T, Unit> r32) {
        int r1 = 0;
        int mask$iv = type;
        DelegatableNode $this$visitSubtreeIf$iv = $this$visitSubtree_u2dY_u2dYKmho;
        int $i$f$visitSubtreeIf = 0;
        boolean value$iv$iv = $this$visitSubtreeIf$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
    L5:
        int r10 = 0;
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv = $this$visitSubtreeIf$iv.getNode().getChild$ui_release();
        if (child$iv != null) goto L8;
        access$addLayoutNodeChildren(branches$iv, $this$visitSubtreeIf$iv.getNode(), zOrder);
    L9:
        boolean r11 = true;
        if (branches$iv.getSize() == 0) goto L12;
        int r6 = 1;
    L13:
        if (r6 == 0) goto L72;
        Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
        if ((branch$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L70;
        Modifier.Node node$iv = branch$iv;
    L17:
        if (node$iv == null) goto L70;
        if ((node$iv.getKindSet$ui_release() & mask$iv) == 0) goto L66;
        Object it = node$iv;
        Object stack$iv = null;
        Object node$iv2 = it;
    L21:
        if (node$iv2 == null) goto L62;
        r1 = r1;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv2 instanceof Object) == true) goto L24;
        Modifier.Node this_$iv$iv = (Modifier.Node) node$iv2;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L28;
        boolean r12 = true;
    L29:
        if (r12 == false) goto L60;
        if ((node$iv2 instanceof DelegatingNode) == false) goto L60;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv2;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L33:
        if (node$iv$iv == null) goto L57;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L37;
        boolean r23 = true;
    L38:
        if (r23 == false) goto L55;
        count$iv = count$iv + 1;
        int mask$iv2 = mask$iv;
        if (count$iv != 1) goto L42;
        node$iv2 = next$iv;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
    L56:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        mask$iv = mask$iv2;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        goto L33
    L42:
        Object r2 = (MutableVector) stack$iv;
        if (r2 != null) goto L45;
        Object r3 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r4 = (MutableVector) r3;
    L46:
        stack$iv = r3;
        Modifier.Node theNode$iv = (Modifier.Node) node$iv2;
        if (theNode$iv == null) goto L52;
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L51;
        r5.add(theNode$iv);
    L51:
        node$iv2 = null;
    L52:
        MutableVector r7 = (MutableVector) stack$iv;
        if (r7 == null) goto L56;
        r7.add(next$iv);
        goto L56
    L45:
        r3 = r2;
        goto L46
    L55:
        mask$iv2 = mask$iv;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        goto L56
    L37:
        r23 = false;
        goto L38
    L57:
        int mask$iv3 = mask$iv;
        DelegatableNode $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv;
        int $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf;
        if (count$iv != 1) goto L61;
        mask$iv = mask$iv3;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv2;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf2;
    L61:
        node$iv2 = access$pop((MutableVector) stack$iv);
        mask$iv = mask$iv3;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv2;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf2;
    L60:
        mask$iv3 = mask$iv;
        $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf;
        goto L61
    L28:
        r12 = false;
        goto L29
    L24:
        r32.invoke(node$iv2);
        mask$iv3 = mask$iv;
        $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf;
        goto L61
    L62:
        int r18 = r1;
        int mask$iv4 = mask$iv;
        DelegatableNode $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv;
        int $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf;
        int mask$iv5 = 0;
        boolean r17 = true;
        if (1 != 0) goto L67;
        r10 = 0;
        r1 = r18;
        mask$iv = mask$iv4;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv3;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf3;
    L67:
        node$iv = node$iv.getChild$ui_release();
        r10 = mask$iv5;
        r11 = r17;
        r1 = r18;
        mask$iv = mask$iv4;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv3;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf3;
        goto L17
    L66:
        r18 = r1;
        mask$iv4 = mask$iv;
        $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf;
        mask$iv5 = r10;
        r17 = r11;
    L70:
        int mask$iv6 = mask$iv;
        int mask$iv7 = r10;
        access$addLayoutNodeChildren(branches$iv, branch$iv, zOrder);
        r10 = mask$iv7;
        r1 = r1;
        mask$iv = mask$iv6;
        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv;
        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf;
        goto L9
    L72:
        return;
    L12:
        r6 = r10;
        goto L13
    L8:
        branches$iv.add(child$iv);
        goto L9
    }

    /* JADX INFO: renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m5834has64DMado(DelegatableNode $this$has_u2d64DMado, int type) {
        if (($this$has_u2d64DMado.getNode().getAggregateChildKindSet$ui_release() & type) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m5836requireCoordinator64DMado(DelegatableNode $this$requireCoordinator_u2d64DMado, int kind) {
        NodeCoordinator coordinator = $this$requireCoordinator_u2d64DMado.getNode().getCoordinator$ui_release();
        Intrinsics.checkNotNull(coordinator);
        if (coordinator.getTail() != $this$requireCoordinator_u2d64DMado) goto L9;
        if (NodeKindKt.m5985getIncludeSelfInTraversalH91voCI(kind) == false) goto L9;
        NodeCoordinator r1 = coordinator.getWrapped$ui_release();
        Intrinsics.checkNotNull(r1);
        return r1;
    L9:
        return coordinator;
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode $this$requireLayoutNode) {
        NodeCoordinator r0 = $this$requireLayoutNode.getNode().getCoordinator$ui_release();
        if (r0 != null) goto L5;
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    L5:
        return r0.getLayoutNode();
    }

    public static final SemanticsInfo requireSemanticsInfo(DelegatableNode $this$requireSemanticsInfo) {
        return requireLayoutNode($this$requireSemanticsInfo);
    }

    public static final Owner requireOwner(DelegatableNode $this$requireOwner) {
        Owner r0 = requireLayoutNode($this$requireOwner).getOwner$ui_release();
        if (r0 == null) goto L5;
        return r0;
    L5:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }

    public static final void requestAutofill(DelegatableNode $this$requestAutofill) {
        requireLayoutNode($this$requestAutofill).requestAutofill$ui_release();
    }

    public static final Density requireDensity(DelegatableNode $this$requireDensity) {
        return requireLayoutNode($this$requireDensity).getDensity();
    }

    public static final GraphicsContext requireGraphicsContext(DelegatableNode $this$requireGraphicsContext) {
        return requireOwner($this$requireGraphicsContext).getGraphicsContext();
    }

    public static final LayoutDirection requireLayoutDirection(DelegatableNode $this$requireLayoutDirection) {
        return requireLayoutNode($this$requireLayoutDirection).getLayoutDirection();
    }

    public static final LayoutCoordinates requireLayoutCoordinates(DelegatableNode $this$requireLayoutCoordinates) {
        boolean value$iv = $this$requireLayoutCoordinates.getNode().isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
    L5:
        LayoutCoordinates coordinates = m5836requireCoordinator64DMado($this$requireLayoutCoordinates, NodeKind.m5976constructorimpl(2)).getCoordinates();
        boolean value$iv2 = coordinates.isAttached();
        if (value$iv2 == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
    L9:
        return coordinates;
    }

    public static final void invalidateSubtree(DelegatableNode $this$invalidateSubtree) {
        if ($this$invalidateSubtree.getNode().isAttached() == false) goto L6;
        LayoutNode.invalidateSubtree$default(requireLayoutNode($this$invalidateSubtree), false, 1, null);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode asLayoutModifierNode(Modifier.Node r9) {
        if ((r9.getKindSet$ui_release() & NodeKind.m5976constructorimpl(2)) == 0) goto L5;
        int kind$iv = 1;
    L7:
        if (kind$iv != 0) goto L10;
        return null;
    L10:
        if ((r9 instanceof LayoutModifierNode) == false) goto L14;
        return (LayoutModifierNode) r9;
    L14:
        if ((r9 instanceof DelegatingNode) == false) goto L31;
        Modifier.Node node = ((DelegatingNode) r9).getDelegate$ui_release();
    L16:
        if (node == null) goto L31;
        if ((node instanceof LayoutModifierNode) == true) goto L20;
        if ((node instanceof DelegatingNode) == false) goto L29;
        Modifier.Node this_$iv = node;
        if ((this_$iv.getKindSet$ui_release() & NodeKind.m5976constructorimpl(2)) == 0) goto L26;
        int kind$iv2 = 1;
    L27:
        if (kind$iv2 == 0) goto L29;
        Modifier.Node r3 = ((DelegatingNode) node).getDelegate$ui_release();
    L30:
        node = r3;
        goto L16
    L26:
        kind$iv2 = 0;
    L29:
        r3 = node.getChild$ui_release();
        goto L30
    L20:
        return (LayoutModifierNode) node;
    L31:
        return null;
    L5:
        kind$iv = 0;
        goto L7
    }

    /* JADX INFO: renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5833dispatchForKind6rFNWt0(Modifier.Node $this$dispatchForKind_u2d6rFNWt0, int kind, Function1<? super T, Unit> r18) {
        Object stack = null;
        Object node = $this$dispatchForKind_u2d6rFNWt0;
    L3:
        if (node == null) goto L42;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node instanceof Object) == true) goto L6;
        Modifier.Node this_$iv = (Modifier.Node) node;
        int r8 = 1;
        if ((this_$iv.getKindSet$ui_release() & kind) == 0) goto L10;
        boolean r4 = true;
    L11:
        if (r4 == false) goto L40;
        if ((node instanceof DelegatingNode) == false) goto L40;
        int count = 0;
        DelegatingNode this_$iv2 = (DelegatingNode) node;
        Modifier.Node node$iv = this_$iv2.getDelegate$ui_release();
    L15:
        if (node$iv == null) goto L38;
        Modifier.Node next = node$iv;
        if ((next.getKindSet$ui_release() & kind) == 0) goto L19;
        int r12 = r8;
    L20:
        if (r12 == 0) goto L36;
        count = count + 1;
        if (count != r8) goto L24;
        node = next;
        goto L36
    L24:
        Object r13 = (MutableVector) stack;
        if (r13 != null) goto L27;
        Object r15 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r9 = (MutableVector) r15;
        r13 = r15;
    L27:
        stack = r13;
        Modifier.Node theNode = (Modifier.Node) node;
        if (theNode == null) goto L33;
        MutableVector r14 = (MutableVector) stack;
        if (r14 == null) goto L32;
        r14.add(theNode);
    L32:
        node = null;
    L33:
        MutableVector r16 = (MutableVector) stack;
        if (r16 == null) goto L36;
        r16.add(next);
    L36:
        node$iv = node$iv.getChild$ui_release();
        r8 = 1;
        goto L15
    L19:
        r12 = 0;
        goto L20
    L38:
        if (count == 1) goto L3;
    L40:
        node = access$pop((MutableVector) stack);
        goto L3
    L10:
        r4 = false;
        goto L11
    L6:
        r18.invoke(node);
        goto L40
    }

    private static final Modifier.Node pop(MutableVector<Modifier.Node> r4) {
        if (r4 != null) goto L4;
    L10:
        return null;
    L4:
        if (r4.getSize() != 0) goto L6;
        boolean r2 = true;
    L7:
        if (r2 == true) goto L10;
        return r4.removeAt(r4.getSize() - 1);
    L6:
        r2 = false;
        goto L7
    }
}
