package androidx.compose.ui.relocation;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: BringIntoViewModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0086@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"bringIntoView", "", "Landroidx/compose/ui/node/DelegatableNode;", "bounds", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BringIntoViewModifierNodeKt {
    public static /* synthetic */ Object bringIntoView$default(DelegatableNode r0, Function0 r1, Continuation r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = null;
    L6:
        return bringIntoView(r0, r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.compose.ui.Modifier$Node] */
    public static final Object bringIntoView(DelegatableNode $this$bringIntoView, final Function0<Rect> r33, Continuation<? super Unit> r34) {
        if ($this$bringIntoView.getNode().isAttached() == false) goto L5;
        int type$iv = NodeKind.m5976constructorimpl(524288);
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv = $this$bringIntoView;
        int r2 = 0;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv = $this$nearestAncestor_u2d64DMado$iv;
        boolean value$iv$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv.getNode().isAttached();
        if (value$iv$iv$iv$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L9:
        Modifier.Node node$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv);
    L10:
        if (layout$iv$iv$iv == null) goto L69;
        Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L61;
    L13:
        if (node$iv$iv$iv == null) goto L60;
        if ((node$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L59;
        Object it$iv$iv = node$iv$iv$iv;
        MutableVector r17 = null;
        Object node$iv$iv$iv2 = it$iv$iv;
    L17:
        if (node$iv$iv$iv2 == null) goto L59;
        type$iv = type$iv;
        if ((node$iv$iv$iv2 instanceof BringIntoViewModifierNode) == true) goto L70;
        if ((node$iv$iv$iv2.getKindSet$ui_release() & type$iv) == 0) goto L24;
        int r20 = 1;
    L25:
        if (r20 == 0) goto L55;
        if ((node$iv$iv$iv2 instanceof DelegatingNode) == false) goto L55;
        int count$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv = (DelegatingNode) node$iv$iv$iv2;
        Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv.getDelegate$ui_release();
    L29:
        if (node$iv$iv$iv$iv == null) goto L52;
        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
        if ((next$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L33;
        boolean r26 = true;
    L34:
        if (r26 == false) goto L50;
        count$iv$iv$iv = count$iv$iv$iv + 1;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv;
        if (count$iv$iv$iv != 1) goto L38;
        node$iv$iv$iv2 = next$iv$iv$iv;
        r2 = r2;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv;
    L51:
        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild$ui_release();
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv2;
        r2 = r2;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv;
        goto L29
    L38:
        if (r17 != null) goto L40;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L41:
        Object r0 = node$iv$iv$iv2;
        if (r0 == null) goto L46;
        if (r1 == null) goto L45;
        Boxing.boxBoolean(r1.add(r0));
    L45:
        node$iv$iv$iv2 = null;
    L46:
        if (r1 == null) goto L49;
        Boxing.boxBoolean(r1.add(next$iv$iv$iv));
    L49:
        r17 = r1;
        count$iv$iv$iv = count$iv$iv$iv;
        goto L51
    L40:
        r1 = r17;
        goto L41
    L50:
        $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv;
        r2 = r2;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv;
        goto L51
    L33:
        r26 = false;
        goto L34
    L52:
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv;
        int r30 = r2;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv;
        if (count$iv$iv$iv == 1) goto L54;
    L56:
        node$iv$iv$iv2 = DelegatableNodeKt.access$pop(r17);
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv3;
        r2 = r30;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv2;
        goto L17
    L54:
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv3;
        r2 = r30;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv2;
    L55:
        $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv;
        r30 = r2;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv;
        goto L56
    L24:
        r20 = 0;
    L70:
        BringIntoViewModifierNode parent = (BringIntoViewModifierNode) node$iv$iv$iv2;
        if (parent == null) goto L73;
        final LayoutCoordinates layoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates($this$bringIntoView);
        Object r3 = parent.bringIntoView(layoutCoordinates, new AnonymousClass2(r33, layoutCoordinates), r34);
        if (r3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L78;
        return r3;
    L78:
        return Unit.INSTANCE;
    L73:
        return Unit.INSTANCE;
    L59:
        node$iv$iv$iv = node$iv$iv$iv.getParent$ui_release();
        type$iv = type$iv;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        r2 = r2;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv;
        goto L13
    L60:
        int type$iv2 = type$iv;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv;
        int r31 = r2;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv;
    L62:
        layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
        if (layout$iv$iv$iv == null) goto L67;
        NodeChain r4 = layout$iv$iv$iv.getNodes$ui_release();
        if (r4 == null) goto L67;
        Modifier.Node r11 = r4.getTail$ui_release();
    L68:
        node$iv$iv$iv = r11;
        type$iv = type$iv2;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv4;
        r2 = r31;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv3;
    L67:
        r11 = null;
        goto L68
    L61:
        type$iv2 = type$iv;
        $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv;
        r31 = r2;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv;
        goto L62
    L69:
        node$iv$iv$iv2 = null;
        goto L70
    L5:
        return Unit.INSTANCE;
    }
}
