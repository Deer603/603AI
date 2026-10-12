package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.InstantKt;

/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\"\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0000\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0007H\u0002\u001a#\u0010\u0011\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0013H\u0080\b\u001a\f\u0010\u0014\u001a\u00020\u0010*\u00020\u0007H\u0002\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"outerMergingSemantics", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/LayoutNode;", "getOuterMergingSemantics", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/SemanticsModifierNode;", "role", "Landroidx/compose/ui/semantics/Role;", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRole", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;", "SemanticsNode", "layoutNode", "mergingEnabled", "", "outerSemanticsNode", "contentDescriptionFakeNodeId", "", "findClosestParentNode", "selector", "Lkotlin/Function1;", "roleFakeNodeId", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SemanticsNodeKt {
    public static final /* synthetic */ int access$contentDescriptionFakeNodeId(SemanticsNode $receiver) {
        return contentDescriptionFakeNodeId($receiver);
    }

    public static final /* synthetic */ Role access$getRole(SemanticsNode $receiver) {
        return getRole($receiver);
    }

    public static final /* synthetic */ int access$roleFakeNodeId(SemanticsNode $receiver) {
        return roleFakeNodeId($receiver);
    }

    public static final SemanticsNode SemanticsNode(LayoutNode layoutNode, boolean mergingEnabled) {
        NodeChain this_$iv = layoutNode.getNodes$ui_release();
        int type$iv = NodeKind.m5976constructorimpl(8);
        int r2 = 0;
        if ((NodeChain.access$getAggregateChildKindSet(this_$iv) & type$iv) == 0) goto L58;
        Modifier.Node node$iv$iv$iv$iv = this_$iv.getHead$ui_release();
    L5:
        if (node$iv$iv$iv$iv == null) goto L58;
        Modifier.Node it$iv$iv$iv = node$iv$iv$iv$iv;
        if ((it$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L52;
        MutableVector r17 = null;
        Modifier.Node r0 = it$iv$iv$iv;
    L9:
        if (r0 == null) goto L51;
        type$iv = type$iv;
        if ((r0 instanceof SemanticsModifierNode) == true) goto L12;
        Modifier.Node this_$iv$iv$iv$iv = r0;
        if ((this_$iv$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L16;
        int r20 = 1;
    L17:
        if (r20 == 0) goto L49;
        if ((r0 instanceof DelegatingNode) == false) goto L49;
        int count$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) r0;
        Modifier.Node node$iv$iv$iv$iv2 = this_$iv$iv$iv$iv2.getDelegate$ui_release();
    L21:
        if (node$iv$iv$iv$iv2 == null) goto L45;
        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv2;
        if ((next$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L25;
        boolean r26 = true;
    L26:
        if (r26 == false) goto L43;
        count$iv$iv$iv = count$iv$iv$iv + 1;
        Modifier.Node r27 = r0;
        if (count$iv$iv$iv != 1) goto L30;
        r2 = r2;
        MutableVector r3 = r17;
        Modifier.Node r18 = next$iv$iv$iv;
    L44:
        node$iv$iv$iv$iv2 = node$iv$iv$iv$iv2.getChild$ui_release();
        r0 = r18;
        r17 = r3;
        r2 = r2;
        goto L21
    L30:
        if (r17 != null) goto L32;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L34:
        if (r27 == null) goto L38;
        if (r1 == null) goto L37;
        r1.add(r27);
    L37:
        r18 = null;
    L39:
        if (r1 == null) goto L42;
        r1.add(next$iv$iv$iv);
    L42:
        r3 = r1;
        count$iv$iv$iv = count$iv$iv$iv;
        goto L44
    L38:
        r18 = r27;
        goto L39
    L32:
        r1 = r17;
        goto L34
    L43:
        r2 = r2;
        r3 = r17;
        r18 = r0;
        goto L44
    L25:
        r26 = false;
        goto L26
    L45:
        Modifier.Node r28 = r0;
        int r30 = r2;
        if (count$iv$iv$iv == 1) goto L47;
    L50:
        r0 = DelegatableNodeKt.access$pop(r17);
        r2 = r30;
        goto L9
    L47:
        r0 = r28;
        r2 = r30;
    L49:
        r30 = r2;
        goto L50
    L16:
        r20 = 0;
        goto L17
    L12:
        Object r4 = r0;
    L59:
        Intrinsics.checkNotNull(r4);
        Modifier.Node r5 = ((SemanticsModifierNode) r4).getNode();
        SemanticsConfiguration r6 = layoutNode.getSemanticsConfiguration();
        if (r6 != null) goto L63;
        r6 = new SemanticsConfiguration();
    L63:
        return new SemanticsNode(r5, mergingEnabled, layoutNode, r6);
    L51:
        int type$iv2 = type$iv;
        int r31 = r2;
    L54:
        if ((it$iv$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L58;
        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild$ui_release();
        this_$iv = this_$iv;
        type$iv = type$iv2;
        r2 = r31;
        goto L5
    L52:
        type$iv2 = type$iv;
        r31 = r2;
    L58:
        r4 = null;
        goto L59
    }

    public static /* synthetic */ SemanticsNode SemanticsNode$default(SemanticsModifierNode r0, boolean r1, LayoutNode r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = DelegatableNodeKt.requireLayoutNode(r0);
    L6:
        return SemanticsNode(r0, r1, r2);
    }

    public static final SemanticsNode SemanticsNode(SemanticsModifierNode outerSemanticsNode, boolean mergingEnabled, LayoutNode layoutNode) {
        Modifier.Node r1 = outerSemanticsNode.getNode();
        SemanticsConfiguration r2 = layoutNode.getSemanticsConfiguration();
        if (r2 != null) goto L6;
        r2 = new SemanticsConfiguration();
    L6:
        return new SemanticsNode(r1, mergingEnabled, layoutNode, r2);
    }

    public static final SemanticsModifierNode getOuterMergingSemantics(LayoutNode $this$outerMergingSemantics) {
        NodeChain this_$iv = $this$outerMergingSemantics.getNodes$ui_release();
        int type$iv = NodeKind.m5976constructorimpl(8);
        int r2 = 0;
        if ((NodeChain.access$getAggregateChildKindSet(this_$iv) & type$iv) == 0) goto L61;
        Modifier.Node node$iv$iv$iv$iv = this_$iv.getHead$ui_release();
    L5:
        if (node$iv$iv$iv$iv == null) goto L61;
        Modifier.Node it$iv$iv$iv = node$iv$iv$iv$iv;
        if ((it$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L55;
        MutableVector r17 = null;
        Modifier.Node r0 = it$iv$iv$iv;
    L9:
        if (r0 == null) goto L54;
        type$iv = type$iv;
        if ((r0 instanceof SemanticsModifierNode) == true) goto L12;
        Modifier.Node this_$iv$iv$iv$iv = r0;
        if ((this_$iv$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L19;
        int r20 = 1;
    L20:
        if (r20 == 0) goto L52;
        if ((r0 instanceof DelegatingNode) == false) goto L52;
        int count$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) r0;
        Modifier.Node node$iv$iv$iv$iv2 = this_$iv$iv$iv$iv2.getDelegate$ui_release();
    L24:
        if (node$iv$iv$iv$iv2 == null) goto L48;
        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv2;
        if ((next$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L28;
        boolean r26 = true;
    L29:
        if (r26 == false) goto L46;
        count$iv$iv$iv = count$iv$iv$iv + 1;
        Modifier.Node r27 = r0;
        if (count$iv$iv$iv != 1) goto L33;
        r2 = r2;
        MutableVector r3 = r17;
        Modifier.Node r18 = next$iv$iv$iv;
    L47:
        node$iv$iv$iv$iv2 = node$iv$iv$iv$iv2.getChild$ui_release();
        r0 = r18;
        r17 = r3;
        r2 = r2;
        goto L24
    L33:
        if (r17 != null) goto L35;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L37:
        if (r27 == null) goto L41;
        if (r1 == null) goto L40;
        r1.add(r27);
    L40:
        r18 = null;
    L42:
        if (r1 == null) goto L45;
        r1.add(next$iv$iv$iv);
    L45:
        r3 = r1;
        count$iv$iv$iv = count$iv$iv$iv;
        goto L47
    L41:
        r18 = r27;
        goto L42
    L35:
        r1 = r17;
        goto L37
    L46:
        r2 = r2;
        r3 = r17;
        r18 = r0;
        goto L47
    L28:
        r26 = false;
        goto L29
    L48:
        Modifier.Node r28 = r0;
        int r30 = r2;
        if (count$iv$iv$iv != 1) goto L53;
        r0 = r28;
        r2 = r30;
    L53:
        r0 = DelegatableNodeKt.access$pop(r17);
        r2 = r30;
    L52:
        r30 = r2;
        goto L53
    L19:
        r20 = 0;
        goto L20
    L12:
        Object it$iv = r0;
        SemanticsModifierNode it = (SemanticsModifierNode) it$iv;
        if (it.getShouldMergeDescendantSemantics() == true) goto L63;
        r30 = r2;
    L63:
        return (SemanticsModifierNode) it$iv;
    L54:
        int type$iv2 = type$iv;
        int r31 = r2;
    L57:
        if ((it$iv$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L61;
        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild$ui_release();
        this_$iv = this_$iv;
        type$iv = type$iv2;
        r2 = r31;
        goto L5
    L55:
        type$iv2 = type$iv;
        r31 = r2;
    L61:
        it$iv = null;
        goto L63
    }

    public static final LayoutNode findClosestParentNode(LayoutNode $this$findClosestParentNode, Function1<? super LayoutNode, Boolean> r4) {
        LayoutNode currentParent = $this$findClosestParentNode.getParent$ui_release();
    L3:
        if (currentParent == null) goto L8;
        if (r4.invoke(currentParent).booleanValue() == true) goto L6;
        currentParent = currentParent.getParent$ui_release();
        goto L3
    L6:
        return currentParent;
    L8:
        return null;
    }

    private static final Role getRole(SemanticsNode $this$role) {
        return (Role) SemanticsConfigurationKt.getOrNull($this$role.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
    }

    private static final int contentDescriptionFakeNodeId(SemanticsNode $this$contentDescriptionFakeNodeId) {
        return $this$contentDescriptionFakeNodeId.getId() + 2000000000;
    }

    private static final int roleFakeNodeId(SemanticsNode $this$roleFakeNodeId) {
        return $this$roleFakeNodeId.getId() + InstantKt.NANOS_PER_SECOND;
    }
}
