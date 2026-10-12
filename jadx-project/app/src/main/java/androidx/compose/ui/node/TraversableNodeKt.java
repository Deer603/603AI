package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TraversableNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u0001¢\u0006\u0002\u0010\u0003\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0002*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a-\u0010\u0007\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\f\u001a(\u0010\u0007\u001a\u00020\b*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u001a-\u0010\r\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\f\u001a(\u0010\r\u001a\u00020\b*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u001a-\u0010\u000e\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0002\u0010\f\u001a(\u0010\u000e\u001a\u00020\b*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\n¨\u0006\u0010"}, d2 = {"findNearestAncestor", "T", "Landroidx/compose/ui/node/TraversableNode;", "(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/DelegatableNode;", "key", "", "traverseAncestors", "", "block", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/node/TraversableNode;Lkotlin/jvm/functions/Function1;)V", "traverseChildren", "traverseDescendants", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TraversableNodeKt {
    public static final TraversableNode findNearestAncestor(DelegatableNode $this$findNearestAncestor, Object key) {
        int type$iv = NodeKind.m5976constructorimpl(262144);
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$findNearestAncestor;
        boolean includeSelf$iv = false;
        int r3 = 0;
        boolean value$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv);
    L6:
        if (layout$iv$iv == null) goto L68;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L60;
    L9:
        if (node$iv$iv == null) goto L59;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L57;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r15 = null;
        Modifier.Node r9 = it$iv;
    L13:
        if (r9 == null) goto L56;
        type$iv = type$iv;
        if ((r9 instanceof TraversableNode) == true) goto L16;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        Modifier.Node this_$iv$iv$iv = r9;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L23;
        int r18 = 1;
    L24:
        if (r18 == 0) goto L54;
        if ((r9 instanceof DelegatingNode) == false) goto L54;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r9;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L28:
        if (node$iv$iv$iv == null) goto L51;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L32;
        boolean r25 = true;
    L33:
        if (r25 == false) goto L49;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != 1) goto L37;
        r9 = next$iv$iv;
        includeSelf$iv = includeSelf$iv;
        r3 = r3;
    L50:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        includeSelf$iv = includeSelf$iv;
        r3 = r3;
        goto L28
    L37:
        if (r15 != null) goto L39;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L40:
        r15 = r1;
        Modifier.Node theNode$iv$iv = r9;
        if (theNode$iv$iv == null) goto L45;
        if (r15 == null) goto L44;
        r15.add(theNode$iv$iv);
    L44:
        r9 = null;
    L45:
        if (r15 == null) goto L48;
        r15.add(next$iv$iv);
    L48:
        count$iv$iv = count$iv$iv;
        goto L50
    L39:
        r1 = r15;
        goto L40
    L49:
        includeSelf$iv = includeSelf$iv;
        r3 = r3;
        goto L50
    L32:
        r25 = false;
        goto L33
    L51:
        boolean includeSelf$iv2 = includeSelf$iv;
        int r29 = r3;
        if (count$iv$iv != 1) goto L55;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        includeSelf$iv = includeSelf$iv2;
        r3 = r29;
    L55:
        r9 = DelegatableNodeKt.access$pop(r15);
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        includeSelf$iv = includeSelf$iv2;
        r3 = r29;
    L54:
        includeSelf$iv2 = includeSelf$iv;
        r29 = r3;
        goto L55
    L23:
        r18 = 0;
        goto L24
    L16:
        TraversableNode it = (TraversableNode) r9;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        if (Intrinsics.areEqual(key, it.getTraverseKey()) == true) goto L18;
        includeSelf$iv2 = includeSelf$iv;
        r29 = r3;
        goto L55
    L18:
        return it;
    L56:
        int type$iv2 = type$iv;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        boolean includeSelf$iv3 = includeSelf$iv;
        int r210 = r3;
    L58:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        type$iv = type$iv2;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3;
        includeSelf$iv = includeSelf$iv3;
        r3 = r210;
        goto L9
    L57:
        type$iv2 = type$iv;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        includeSelf$iv3 = includeSelf$iv;
        r210 = r3;
        goto L58
    L59:
        int type$iv3 = type$iv;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv4 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        boolean includeSelf$iv4 = includeSelf$iv;
        int r211 = r3;
        Modifier.Node r16 = null;
    L61:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L66;
        NodeChain r0 = layout$iv$iv.getNodes$ui_release();
        if (r0 == null) goto L66;
        Modifier.Node r10 = r0.getTail$ui_release();
    L67:
        node$iv$iv = r10;
        type$iv = type$iv3;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv4;
        includeSelf$iv = includeSelf$iv4;
        r3 = r211;
    L66:
        r10 = r16;
        goto L67
    L60:
        type$iv3 = type$iv;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv4 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        includeSelf$iv4 = includeSelf$iv;
        r211 = r3;
        r16 = null;
        goto L61
    L68:
        return null;
    }

    public static final <T extends TraversableNode> T findNearestAncestor(T r31) {
        r31 = r31;
        T $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = r31;
        int type$iv = NodeKind.m5976constructorimpl(262144);
        boolean includeSelf$iv = false;
        boolean value$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv);
    L6:
        if (layout$iv$iv == null) goto L69;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L61;
    L9:
        if (node$iv$iv == null) goto L60;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L58;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r16 = null;
        Modifier.Node this_$iv$iv$iv = it$iv;
    L13:
        if (this_$iv$iv$iv == null) goto L57;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        if ((this_$iv$iv$iv instanceof TraversableNode) == true) goto L16;
        int type$iv2 = type$iv;
        boolean includeSelf$iv2 = includeSelf$iv;
        int r0 = 1;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L25;
        boolean r1 = true;
    L26:
        if (r1 == false) goto L56;
        if ((this_$iv$iv$iv instanceof DelegatingNode) == false) goto L56;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L30:
        if (node$iv$iv$iv == null) goto L54;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L34;
        int r25 = r0;
    L35:
        if (r25 == 0) goto L51;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != r0) goto L39;
        this_$iv$iv$iv = next$iv$iv;
        this_$iv$iv$iv2 = this_$iv$iv$iv2;
    L52:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv$iv$iv2 = this_$iv$iv$iv2;
        r0 = 1;
        goto L30
    L39:
        if (r16 != null) goto L41;
        MutableVector r2 = new MutableVector(new Modifier.Node[16], 0);
    L42:
        Modifier.Node theNode$iv$iv = this_$iv$iv$iv;
        if (theNode$iv$iv == null) goto L47;
        if (r2 == null) goto L46;
        r2.add(theNode$iv$iv);
    L46:
        this_$iv$iv$iv = null;
    L47:
        if (r2 == null) goto L50;
        r2.add(next$iv$iv);
    L50:
        r16 = r2;
        count$iv$iv = count$iv$iv;
        goto L52
    L41:
        r2 = r16;
        goto L42
    L51:
        this_$iv$iv$iv2 = this_$iv$iv$iv2;
        goto L52
    L34:
        r25 = 0;
        goto L35
    L54:
        if (count$iv$iv != 1) goto L56;
        type$iv = type$iv2;
        includeSelf$iv = includeSelf$iv2;
    L56:
        this_$iv$iv$iv = DelegatableNodeKt.access$pop(r16);
        type$iv = type$iv2;
        includeSelf$iv = includeSelf$iv2;
        goto L13
    L25:
        r1 = false;
        goto L26
    L16:
        T r3 = (T) this_$iv$iv$iv;
        type$iv2 = type$iv;
        includeSelf$iv2 = includeSelf$iv;
        if (Intrinsics.areEqual(r31.getTraverseKey(), r3.getTraverseKey()) == false) goto L56;
        if (Actual_jvmKt.areObjectsOfSameType(r31, r3) == false) goto L56;
        return r3;
    L57:
        T $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        int type$iv3 = type$iv;
        boolean includeSelf$iv3 = includeSelf$iv;
    L59:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        r31 = r31;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv3;
        includeSelf$iv = includeSelf$iv3;
        goto L9
    L58:
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        type$iv3 = type$iv;
        includeSelf$iv3 = includeSelf$iv;
        goto L59
    L60:
        T $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        int type$iv4 = type$iv;
        boolean includeSelf$iv4 = includeSelf$iv;
        Modifier.Node r17 = null;
    L62:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L67;
        NodeChain r4 = layout$iv$iv.getNodes$ui_release();
        if (r4 == null) goto L67;
        Modifier.Node r10 = r4.getTail$ui_release();
    L68:
        node$iv$iv = r10;
        r31 = r31;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3;
        type$iv = type$iv4;
        includeSelf$iv = includeSelf$iv4;
    L67:
        r10 = r17;
        goto L68
    L61:
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        type$iv4 = type$iv;
        includeSelf$iv4 = includeSelf$iv;
        r17 = null;
        goto L62
    L69:
        return null;
    }

    public static final void traverseAncestors(DelegatableNode $this$traverseAncestors, Object key, Function1<? super TraversableNode, Boolean> r32) {
        int type$iv = NodeKind.m5976constructorimpl(262144);
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$traverseAncestors;
        boolean includeSelf$iv = false;
        int r3 = 0;
        boolean value$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv);
    L6:
        if (layout$iv$iv == null) goto L73;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L64;
    L9:
        if (node$iv$iv == null) goto L63;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L62;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r14 = null;
        Modifier.Node r15 = it$iv;
    L13:
        if (r15 == null) goto L62;
        type$iv = type$iv;
        if ((r15 instanceof TraversableNode) == true) goto L16;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        boolean includeSelf$iv2 = includeSelf$iv;
        Modifier.Node this_$iv$iv$iv = r15;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L27;
        int r18 = 1;
    L28:
        if (r18 == 0) goto L58;
        if ((r15 instanceof DelegatingNode) == false) goto L58;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r15;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L32:
        if (node$iv$iv$iv == null) goto L55;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L36;
        boolean r26 = true;
    L37:
        if (r26 == false) goto L53;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != 1) goto L41;
        r15 = next$iv$iv;
        r3 = r3;
    L54:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        r3 = r3;
        goto L32
    L41:
        if (r14 != null) goto L43;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L44:
        r14 = r1;
        Modifier.Node theNode$iv$iv = r15;
        if (theNode$iv$iv == null) goto L49;
        if (r14 == null) goto L48;
        r14.add(theNode$iv$iv);
    L48:
        r15 = null;
    L49:
        if (r14 == null) goto L52;
        r14.add(next$iv$iv);
    L52:
        count$iv$iv = count$iv$iv;
        goto L54
    L43:
        r1 = r14;
        goto L44
    L53:
        r3 = r3;
        goto L54
    L36:
        r26 = false;
        goto L37
    L55:
        int r29 = r3;
        if (count$iv$iv != 1) goto L59;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        includeSelf$iv = includeSelf$iv2;
        r3 = r29;
    L59:
        r15 = DelegatableNodeKt.access$pop(r14);
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        includeSelf$iv = includeSelf$iv2;
        r3 = r29;
    L58:
        r29 = r3;
        goto L59
    L27:
        r18 = 0;
        goto L28
    L16:
        TraversableNode it = (TraversableNode) r15;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        includeSelf$iv2 = includeSelf$iv;
        if (Intrinsics.areEqual(key, it.getTraverseKey()) == false) goto L19;
        boolean continueTraversal = r32.invoke(it).booleanValue();
    L21:
        if (continueTraversal == false) goto L22;
        r29 = r3;
        goto L59
    L22:
        return;
    L19:
        continueTraversal = true;
    L62:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        type$iv = type$iv;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        includeSelf$iv = includeSelf$iv;
        r3 = r3;
        goto L9
    L63:
        int type$iv2 = type$iv;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        boolean includeSelf$iv3 = includeSelf$iv;
        int r210 = r3;
    L65:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L70;
        NodeChain r0 = layout$iv$iv.getNodes$ui_release();
        if (r0 == null) goto L70;
        Modifier.Node r2 = r0.getTail$ui_release();
    L71:
        node$iv$iv = r2;
        type$iv = type$iv2;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3;
        includeSelf$iv = includeSelf$iv3;
        r3 = r210;
    L70:
        r2 = null;
        goto L71
    L64:
        type$iv2 = type$iv;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        includeSelf$iv3 = includeSelf$iv;
        r210 = r3;
        goto L65
    }

    public static final <T extends TraversableNode> void traverseAncestors(T r32, Function1<? super T, Boolean> r33) {
        r32 = r32;
        T $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = r32;
        int type$iv = NodeKind.m5976constructorimpl(262144);
        boolean includeSelf$iv = false;
        int r4 = 0;
        boolean value$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv);
    L6:
        if (layout$iv$iv == null) goto L76;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L67;
    L9:
        if (node$iv$iv == null) goto L66;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L65;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r15 = null;
        Modifier.Node theNode$iv$iv = it$iv;
    L13:
        if (theNode$iv$iv == null) goto L65;
        type$iv = type$iv;
        if ((theNode$iv$iv instanceof TraversableNode) == true) goto L16;
        boolean includeSelf$iv2 = includeSelf$iv;
        int r21 = r4;
        Modifier.Node this_$iv$iv$iv = theNode$iv$iv;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L29;
        boolean r2 = true;
    L30:
        if (r2 == false) goto L62;
        if ((theNode$iv$iv instanceof DelegatingNode) == false) goto L62;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) theNode$iv$iv;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L34:
        if (node$iv$iv$iv == null) goto L58;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L38;
        boolean r25 = true;
    L39:
        if (r25 == false) goto L57;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != 1) goto L43;
        theNode$iv$iv = next$iv$iv;
        goto L57
    L43:
        if (r15 != null) goto L45;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L46:
        r15 = r1;
        Modifier.Node theNode$iv$iv2 = theNode$iv$iv;
        if (theNode$iv$iv2 == null) goto L51;
        if (r15 == null) goto L50;
        r15.add(theNode$iv$iv2);
    L50:
        Modifier.Node r3 = null;
    L52:
        if (r15 == null) goto L55;
        r15.add(next$iv$iv);
    L55:
        theNode$iv$iv = r3;
        count$iv$iv = count$iv$iv;
        goto L57
    L51:
        r3 = theNode$iv$iv;
        goto L52
    L45:
        r1 = r15;
    L57:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        goto L34
    L38:
        r25 = false;
        goto L39
    L58:
        Modifier.Node r28 = theNode$iv$iv;
        if (count$iv$iv != 1) goto L62;
        includeSelf$iv = includeSelf$iv2;
        r4 = r21;
        theNode$iv$iv = r28;
    L62:
        theNode$iv$iv = DelegatableNodeKt.access$pop(r15);
        includeSelf$iv = includeSelf$iv2;
        r4 = r21;
        goto L13
    L29:
        r2 = false;
        goto L30
    L16:
        TraversableNode it = (TraversableNode) theNode$iv$iv;
        includeSelf$iv2 = includeSelf$iv;
        r21 = r4;
        if (Intrinsics.areEqual(r32.getTraverseKey(), it.getTraverseKey()) == true) goto L19;
    L21:
        boolean continueTraversal = true;
    L23:
        if (continueTraversal == true) goto L62;
        return;
    L19:
        if (Actual_jvmKt.areObjectsOfSameType(r32, it) == false) goto L21;
        continueTraversal = r33.invoke(it).booleanValue();
    L65:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        r32 = r32;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        includeSelf$iv = includeSelf$iv;
        r4 = r4;
        goto L9
    L66:
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        boolean includeSelf$iv3 = includeSelf$iv;
        int r22 = r4;
    L68:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L73;
        NodeChain r0 = layout$iv$iv.getNodes$ui_release();
        if (r0 == null) goto L73;
        Modifier.Node r5 = r0.getTail$ui_release();
    L74:
        node$iv$iv = r5;
        r32 = r32;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
        includeSelf$iv = includeSelf$iv3;
        r4 = r22;
    L73:
        r5 = null;
        goto L74
    L67:
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        includeSelf$iv3 = includeSelf$iv;
        r22 = r4;
        goto L68
    }

    public static final void traverseChildren(DelegatableNode $this$traverseChildren, Object key, Function1<? super TraversableNode, Boolean> r32) {
        int type$iv = NodeKind.m5976constructorimpl(262144);
        DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$traverseChildren;
        boolean zOrder$iv = false;
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L5:
        boolean r12 = false;
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L8;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L10:
        if (branches$iv$iv.getSize() == 0) goto L12;
        boolean r8 = true;
    L13:
        if (r8 == false) goto L73;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L16;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L18:
        if (node$iv$iv == null) goto L71;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) != 0) goto L21;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        type$iv = type$iv;
        goto L18
    L21:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r17 = null;
        Modifier.Node r13 = it$iv;
    L22:
        if (r13 == null) goto L69;
        if ((r13 instanceof TraversableNode) == true) goto L25;
        int type$iv2 = type$iv;
        DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        Modifier.Node this_$iv$iv$iv = r13;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L36;
        boolean r14 = true;
    L37:
        if (r14 == false) goto L67;
        if ((r13 instanceof DelegatingNode) == false) goto L67;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r13;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L41:
        if (node$iv$iv$iv == null) goto L64;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L45;
        boolean r26 = true;
    L46:
        if (r26 == false) goto L62;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != 1) goto L50;
        r13 = next$iv$iv;
        zOrder$iv = zOrder$iv;
    L63:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        zOrder$iv = zOrder$iv;
        goto L41
    L50:
        if (r17 != null) goto L52;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L53:
        Modifier.Node theNode$iv$iv = r13;
        if (theNode$iv$iv == null) goto L58;
        if (r1 == null) goto L57;
        r1.add(theNode$iv$iv);
    L57:
        r13 = null;
    L58:
        if (r1 == null) goto L61;
        r1.add(next$iv$iv);
    L61:
        r17 = r1;
        goto L63
    L52:
        r1 = r17;
        goto L53
    L62:
        zOrder$iv = zOrder$iv;
        goto L63
    L45:
        r26 = false;
        goto L46
    L64:
        boolean zOrder$iv2 = zOrder$iv;
        boolean r0 = true;
        if (count$iv$iv != 1) goto L68;
        type$iv = type$iv2;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
        zOrder$iv = zOrder$iv2;
    L68:
        r13 = DelegatableNodeKt.access$pop(r17);
        type$iv = type$iv2;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
        zOrder$iv = zOrder$iv2;
    L67:
        zOrder$iv2 = zOrder$iv;
        r0 = true;
        goto L68
    L36:
        r14 = false;
        goto L37
    L25:
        TraversableNode it = (TraversableNode) r13;
        type$iv2 = type$iv;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        if (Intrinsics.areEqual(key, it.getTraverseKey()) == false) goto L28;
        boolean continueTraversal = r32.invoke(it).booleanValue();
    L30:
        if (continueTraversal == false) goto L31;
        zOrder$iv2 = zOrder$iv;
        r0 = true;
        goto L68
    L31:
        return;
    L28:
        continueTraversal = true;
        goto L30
    L69:
        r12 = false;
        goto L10
    L71:
        r12 = false;
        goto L10
    L16:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, zOrder$iv);
        goto L10
    L73:
        return;
    L12:
        r8 = r12;
        goto L13
    L8:
        branches$iv$iv.add(child$iv$iv);
        goto L10
    }

    public static final <T extends TraversableNode> void traverseChildren(T r30, Function1<? super T, Boolean> r31) {
        r30 = r30;
        T $this$visitChildren_u2dY_u2dYKmho_u24default$iv = r30;
        int count$iv$iv = NodeKind.m5976constructorimpl(262144);
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L5:
        boolean r13 = false;
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L8;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L10:
        if (branches$iv$iv.getSize() == 0) goto L12;
        boolean r9 = true;
    L13:
        if (r9 == false) goto L75;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & count$iv$iv) == 0) goto L16;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L18:
        if (node$iv$iv == null) goto L73;
        if ((node$iv$iv.getKindSet$ui_release() & count$iv$iv) != 0) goto L21;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r30 = r30;
        goto L18
    L21:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r18 = null;
        Modifier.Node r14 = it$iv;
    L22:
        if (r14 == null) goto L71;
        if ((r14 instanceof TraversableNode) == true) goto L25;
        DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv = count$iv$iv;
        Modifier.Node this_$iv$iv$iv = r14;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L38;
        boolean r2 = true;
    L39:
        if (r2 == false) goto L69;
        if ((r14 instanceof DelegatingNode) == false) goto L69;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r14;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L43:
        if (node$iv$iv$iv == null) goto L66;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L47;
        boolean r26 = true;
    L48:
        if (r26 == false) goto L65;
        count$iv$iv2 = count$iv$iv2 + 1;
        if (count$iv$iv2 != 1) goto L52;
        r14 = next$iv$iv;
        goto L65
    L52:
        if (r18 != null) goto L54;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L55:
        Modifier.Node theNode$iv$iv = r14;
        if (theNode$iv$iv == null) goto L60;
        if (r1 == null) goto L59;
        r1.add(theNode$iv$iv);
    L59:
        r14 = null;
    L60:
        if (r1 == null) goto L63;
        r1.add(next$iv$iv);
    L63:
        r18 = r1;
        count$iv$iv2 = count$iv$iv2;
        goto L65
    L54:
        r1 = r18;
    L65:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        goto L43
    L47:
        r26 = false;
        goto L48
    L66:
        boolean r0 = true;
        if (count$iv$iv2 != 1) goto L70;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
        count$iv$iv = type$iv;
    L70:
        r14 = DelegatableNodeKt.access$pop(r18);
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
        count$iv$iv = type$iv;
    L69:
        r0 = true;
        goto L70
    L38:
        r2 = false;
        goto L39
    L25:
        TraversableNode it = (TraversableNode) r14;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = count$iv$iv;
        if (Intrinsics.areEqual(r30.getTraverseKey(), it.getTraverseKey()) == true) goto L28;
    L30:
        boolean continueTraversal = true;
    L32:
        if (continueTraversal == false) goto L33;
        r0 = true;
        goto L70
    L33:
        return;
    L28:
        if (Actual_jvmKt.areObjectsOfSameType(r30, it) == false) goto L30;
        continueTraversal = r31.invoke(it).booleanValue();
        goto L32
    L71:
        r30 = r30;
        r13 = false;
        goto L10
    L73:
        r30 = r30;
        r13 = false;
        goto L10
    L16:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        goto L10
    L75:
        return;
    L12:
        r9 = r13;
        goto L13
    L8:
        branches$iv$iv.add(child$iv$iv);
        goto L10
    }

    public static final void traverseDescendants(DelegatableNode $this$traverseDescendants, Object key, Function1<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> r32) {
        int count$iv$iv = NodeKind.m5976constructorimpl(262144);
        DelegatableNode $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$traverseDescendants;
        int r3 = 0;
        int mask$iv$iv = count$iv$iv;
        boolean value$iv$iv$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
    L5:
        int r12 = 0;
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L8;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L9:
        boolean r13 = true;
        if (branches$iv$iv.getSize() == 0) goto L12;
        int r8 = 1;
    L13:
        if (r8 == 0) goto L85;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv$iv) == 0) goto L83;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L17:
        if (node$iv$iv == null) goto L83;
        if ((node$iv$iv.getKindSet$ui_release() & mask$iv$iv) == 0) goto L79;
        Modifier.Node node$iv = node$iv$iv;
        MutableVector r17 = null;
        Modifier.Node this_$iv$iv$iv = node$iv;
    L21:
        if (this_$iv$iv$iv == null) goto L74;
        if ((this_$iv$iv$iv instanceof TraversableNode) == true) goto L24;
        int type$iv = count$iv$iv;
        DelegatableNode $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        int r23 = r3;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L41;
        boolean r0 = true;
    L42:
        if (r0 == false) goto L72;
        if ((this_$iv$iv$iv instanceof DelegatingNode) == false) goto L72;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L46:
        if (node$iv$iv$iv == null) goto L69;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L50;
        boolean r25 = true;
    L51:
        if (r25 == false) goto L67;
        count$iv$iv2 = count$iv$iv2 + 1;
        DelegatingNode this_$iv$iv$iv3 = this_$iv$iv$iv2;
        if (count$iv$iv2 != 1) goto L55;
        this_$iv$iv$iv = next$iv$iv;
        mask$iv$iv = mask$iv$iv;
    L68:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv$iv$iv2 = this_$iv$iv$iv3;
        mask$iv$iv = mask$iv$iv;
        goto L46
    L55:
        if (r17 != null) goto L57;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L58:
        Modifier.Node theNode$iv$iv = this_$iv$iv$iv;
        if (theNode$iv$iv == null) goto L63;
        if (r1 == null) goto L62;
        r1.add(theNode$iv$iv);
    L62:
        this_$iv$iv$iv = null;
    L63:
        if (r1 == null) goto L66;
        r1.add(next$iv$iv);
    L66:
        r17 = r1;
        count$iv$iv2 = count$iv$iv2;
        goto L68
    L57:
        r1 = r17;
        goto L58
    L67:
        this_$iv$iv$iv3 = this_$iv$iv$iv2;
        mask$iv$iv = mask$iv$iv;
        goto L68
    L50:
        r25 = false;
        goto L51
    L69:
        int mask$iv$iv2 = mask$iv$iv;
        boolean r2 = true;
        if (count$iv$iv2 != 1) goto L73;
        r13 = true;
        count$iv$iv = type$iv;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        r3 = r23;
        mask$iv$iv = mask$iv$iv2;
    L73:
        this_$iv$iv$iv = DelegatableNodeKt.access$pop(r17);
        r13 = r2;
        count$iv$iv = type$iv;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        r3 = r23;
        mask$iv$iv = mask$iv$iv2;
    L72:
        mask$iv$iv2 = mask$iv$iv;
        r2 = true;
        goto L73
    L41:
        r0 = false;
        goto L42
    L24:
        Object it$iv = this_$iv$iv$iv;
        type$iv = count$iv$iv;
        TraversableNode it = (TraversableNode) it$iv;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        r23 = r3;
        if (Intrinsics.areEqual(key, it.getTraverseKey()) == false) goto L27;
        TraversableNode.Companion.TraverseDescendantsAction r24 = r32.invoke(it);
    L28:
        TraversableNode.Companion.TraverseDescendantsAction action = r24;
        if (action == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) goto L30;
        if (action == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) goto L34;
        boolean r4 = true;
    L35:
        if (r4 == false) goto L36;
        mask$iv$iv2 = mask$iv$iv;
        r2 = true;
        goto L73
    L36:
        boolean r5 = true;
        int mask$iv$iv3 = 0;
        boolean diveDeeper$iv$iv = false;
    L76:
        if (diveDeeper$iv$iv == true) goto L80;
        r12 = mask$iv$iv3;
        count$iv$iv = type$iv;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        r3 = r23;
        mask$iv$iv = mask$iv$iv;
    L80:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r13 = r5;
        r12 = mask$iv$iv3;
        count$iv$iv = type$iv;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        r3 = r23;
        mask$iv$iv = mask$iv$iv;
        goto L17
    L34:
        r4 = false;
        goto L35
    L30:
        return;
    L27:
        r24 = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        goto L28
    L74:
        type$iv = count$iv$iv;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        r23 = r3;
        r5 = r13;
        mask$iv$iv3 = 0;
        diveDeeper$iv$iv = r5;
        goto L76
    L79:
        type$iv = count$iv$iv;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        r23 = r3;
        mask$iv$iv = mask$iv$iv;
        mask$iv$iv3 = r12;
        r5 = r13;
    L83:
        int type$iv2 = count$iv$iv;
        int mask$iv$iv4 = mask$iv$iv;
        int mask$iv$iv5 = r12;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        r12 = mask$iv$iv5;
        count$iv$iv = type$iv2;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        r3 = r3;
        mask$iv$iv = mask$iv$iv4;
        goto L9
    L85:
        return;
    L12:
        r8 = r12;
        goto L13
    L8:
        branches$iv$iv.add(child$iv$iv);
        goto L9
    }

    public static final <T extends TraversableNode> void traverseDescendants(T r30, Function1<? super T, ? extends TraversableNode.Companion.TraverseDescendantsAction> r31) {
        r30 = r30;
        T $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = r30;
        int type$iv = NodeKind.m5976constructorimpl(262144);
        int r4 = 0;
        boolean value$iv$iv$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
    L5:
        int r13 = 0;
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L8;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L9:
        boolean r14 = true;
        if (branches$iv$iv.getSize() == 0) goto L12;
        int r9 = 1;
    L13:
        if (r9 == 0) goto L87;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L85;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L17:
        if (node$iv$iv == null) goto L85;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L81;
        Modifier.Node node$iv = node$iv$iv;
        MutableVector r18 = null;
        Modifier.Node this_$iv$iv$iv = node$iv;
    L21:
        if (this_$iv$iv$iv == null) goto L76;
        if ((this_$iv$iv$iv instanceof TraversableNode) == true) goto L24;
        DelegatableNode $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        int r24 = r4;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L43;
        boolean r0 = true;
    L44:
        if (r0 == false) goto L74;
        if ((this_$iv$iv$iv instanceof DelegatingNode) == false) goto L74;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv;
        int $i$f$forEachImmediateDelegate$ui_release = 0;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L48:
        if (node$iv$iv$iv == null) goto L71;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L52;
        boolean r25 = true;
    L53:
        if (r25 == false) goto L69;
        count$iv$iv = count$iv$iv + 1;
        DelegatingNode this_$iv$iv$iv3 = this_$iv$iv$iv2;
        if (count$iv$iv != 1) goto L57;
        this_$iv$iv$iv = next$iv$iv;
        $i$f$forEachImmediateDelegate$ui_release = $i$f$forEachImmediateDelegate$ui_release;
    L70:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv$iv$iv2 = this_$iv$iv$iv3;
        $i$f$forEachImmediateDelegate$ui_release = $i$f$forEachImmediateDelegate$ui_release;
        goto L48
    L57:
        if (r18 != null) goto L59;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L60:
        Modifier.Node theNode$iv$iv = this_$iv$iv$iv;
        if (theNode$iv$iv == null) goto L65;
        if (r1 == null) goto L64;
        r1.add(theNode$iv$iv);
    L64:
        this_$iv$iv$iv = null;
    L65:
        if (r1 == null) goto L68;
        r1.add(next$iv$iv);
    L68:
        r18 = r1;
        count$iv$iv = count$iv$iv;
        goto L70
    L59:
        r1 = r18;
        goto L60
    L69:
        this_$iv$iv$iv3 = this_$iv$iv$iv2;
        $i$f$forEachImmediateDelegate$ui_release = $i$f$forEachImmediateDelegate$ui_release;
        goto L70
    L52:
        r25 = false;
        goto L53
    L71:
        boolean r2 = true;
        if (count$iv$iv != 1) goto L75;
        r14 = true;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
        r4 = r24;
    L75:
        this_$iv$iv$iv = DelegatableNodeKt.access$pop(r18);
        r14 = r2;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
        r4 = r24;
    L74:
        r2 = true;
        goto L75
    L43:
        r0 = false;
        goto L44
    L24:
        Object it$iv = this_$iv$iv$iv;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        TraversableNode it = (TraversableNode) it$iv;
        type$iv2 = type$iv;
        r24 = r4;
        if (Intrinsics.areEqual(r30.getTraverseKey(), it.getTraverseKey()) == true) goto L27;
    L29:
        TraversableNode.Companion.TraverseDescendantsAction action = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    L31:
        if (action == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) goto L32;
        if (action == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) goto L36;
        boolean r3 = true;
    L37:
        if (r3 == false) goto L38;
        r2 = true;
        goto L75
    L38:
        boolean r5 = true;
        int r6 = 0;
        boolean diveDeeper$iv$iv = false;
    L78:
        if (diveDeeper$iv$iv == true) goto L82;
        r13 = r6;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
        r4 = r24;
    L82:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r30 = r30;
        r14 = r5;
        r13 = r6;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
        r4 = r24;
        goto L17
    L36:
        r3 = false;
        goto L37
    L32:
        return;
    L27:
        if (Actual_jvmKt.areObjectsOfSameType(r30, it) == false) goto L29;
        action = r31.invoke(it);
        goto L31
    L76:
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        r24 = r4;
        r5 = r14;
        r6 = 0;
        diveDeeper$iv$iv = r5;
        goto L78
    L81:
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        r24 = r4;
        r6 = r13;
        r5 = r14;
    L85:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        r13 = r13;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r4 = r4;
        goto L9
    L87:
        return;
    L12:
        r9 = r13;
        goto L13
    L8:
        branches$iv$iv.add(child$iv$iv);
        goto L9
    }
}
