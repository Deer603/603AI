package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BeyondBoundsLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006¢\u0006\u0002\b\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"searchBeyondBounds", "T", "Landroidx/compose/ui/focus/FocusTargetNode;", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BeyondBoundsLayoutKt {
    /* JADX INFO: renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m4004searchBeyondBoundsOMvw8(FocusTargetNode r33, int r34, Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> r35) {
        FocusTargetNode r1 = r33;
        int r2 = NodeKind.m5976constructorimpl(1024);
        int r3 = 0;
        FocusTargetNode r4 = r1;
        if (r4.getNode().isAttached() == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node r10 = r4.getNode().getParent$ui_release();
        LayoutNode r11 = DelegatableNodeKt.requireLayoutNode(r4);
    L6:
        if (r11 == null) goto L65;
        if ((r11.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r2) == 0) goto L57;
    L9:
        if (r10 == null) goto L56;
        if ((r10.getKindSet$ui_release() & r2) == 0) goto L54;
        MutableVector r18 = null;
        Modifier.Node r12 = r10;
        T r19 = null;
    L13:
        if (r12 == null) goto L53;
        r1 = r1;
        if ((r12 instanceof FocusTargetNode) == true) goto L16;
        if ((r12.getKindSet$ui_release() & r2) == 0) goto L20;
        int r21 = 1;
    L21:
        if (r21 == 0) goto L51;
        if ((r12 instanceof DelegatingNode) == false) goto L51;
        int r5 = 0;
        Modifier.Node r24 = ((DelegatingNode) r12).getDelegate$ui_release();
    L25:
        if (r24 == null) goto L48;
        Modifier.Node r25 = r24;
        if ((r25.getKindSet$ui_release() & r2) == 0) goto L29;
        boolean r27 = true;
    L30:
        if (r27 == false) goto L46;
        r5 = r5 + 1;
        int r28 = r2;
        if (r5 != 1) goto L34;
        r12 = r25;
        r3 = r3;
        r4 = r4;
    L47:
        r24 = r24.getChild$ui_release();
        r2 = r28;
        r3 = r3;
        r4 = r4;
        goto L25
    L34:
        if (r18 != null) goto L36;
        MutableVector r6 = new MutableVector(new Modifier.Node[16], 0);
    L37:
        Modifier.Node r7 = r12;
        if (r7 == null) goto L42;
        if (r6 == null) goto L41;
        r6.add(r7);
    L41:
        r12 = null;
    L42:
        if (r6 == null) goto L45;
        r6.add(r25);
    L45:
        r18 = r6;
        r5 = r5;
        goto L47
    L36:
        r6 = r18;
        goto L37
    L46:
        r28 = r2;
        r3 = r3;
        r4 = r4;
        goto L47
    L29:
        r27 = false;
        goto L30
    L48:
        int r29 = r2;
        int r31 = r3;
        FocusTargetNode r32 = r4;
        if (r5 == 1) goto L50;
    L52:
        r12 = DelegatableNodeKt.access$pop(r18);
        r2 = r29;
        r3 = r31;
        r4 = r32;
        goto L13
    L50:
        r2 = r29;
        r3 = r31;
        r4 = r32;
    L51:
        r29 = r2;
        r31 = r3;
        r32 = r4;
        goto L52
    L20:
        r21 = 0;
        goto L21
    L16:
        Modifier.Node r8 = r12;
    L66:
        FocusTargetNode r9 = (FocusTargetNode) r8;
        if (r9 != null) goto L69;
    L72:
        BeyondBoundsLayout r13 = r33.getBeyondBoundsLayoutParent();
        if (r13 == null) goto L96;
        if (FocusDirection.m4009equalsimpl0(r34, FocusDirection.Companion.m4020getUpdhqQ8s()) == false) goto L78;
        int r14 = BeyondBoundsLayout.LayoutDirection.Companion.m5700getAbovehoxUOeE();
    L116:
        return (T) r13.mo881layouto7g1Pn8(r14, r35);
    L78:
        if (FocusDirection.m4009equalsimpl0(r34, FocusDirection.Companion.m4013getDowndhqQ8s()) == false) goto L81;
        r14 = BeyondBoundsLayout.LayoutDirection.Companion.m5703getBelowhoxUOeE();
        goto L116
    L81:
        if (FocusDirection.m4009equalsimpl0(r34, FocusDirection.Companion.m4016getLeftdhqQ8s()) == false) goto L84;
        r14 = BeyondBoundsLayout.LayoutDirection.Companion.m5704getLefthoxUOeE();
        goto L116
    L84:
        if (FocusDirection.m4009equalsimpl0(r34, FocusDirection.Companion.m4019getRightdhqQ8s()) == false) goto L87;
        r14 = BeyondBoundsLayout.LayoutDirection.Companion.m5705getRighthoxUOeE();
        goto L116
    L87:
        if (FocusDirection.m4009equalsimpl0(r34, FocusDirection.Companion.m4017getNextdhqQ8s()) == false) goto L90;
        r14 = BeyondBoundsLayout.LayoutDirection.Companion.m5701getAfterhoxUOeE();
        goto L116
    L90:
        if (FocusDirection.m4009equalsimpl0(r34, FocusDirection.Companion.m4018getPreviousdhqQ8s()) == false) goto L94;
        r14 = BeyondBoundsLayout.LayoutDirection.Companion.m5702getBeforehoxUOeE();
        goto L116
    L94:
        throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
    L96:
        return r19;
    L69:
        if (Intrinsics.areEqual(r9.getBeyondBoundsLayoutParent(), r33.getBeyondBoundsLayoutParent()) == false) goto L72;
        return r19;
    L53:
        FocusTargetNode r20 = r1;
        int r210 = r2;
        int r36 = r3;
        FocusTargetNode r37 = r4;
    L55:
        r10 = r10.getParent$ui_release();
        r1 = r20;
        r2 = r210;
        r3 = r36;
        r4 = r37;
        goto L9
    L54:
        r20 = r1;
        r210 = r2;
        r36 = r3;
        r37 = r4;
        goto L55
    L56:
        FocusTargetNode r22 = r1;
        int r211 = r2;
        int r38 = r3;
        FocusTargetNode r39 = r4;
        Modifier.Node r110 = null;
    L58:
        r11 = r11.getParent$ui_release();
        if (r11 == null) goto L63;
        NodeChain r15 = r11.getNodes$ui_release();
        if (r15 == null) goto L63;
        Modifier.Node r16 = r15.getTail$ui_release();
    L64:
        r10 = r16;
        r1 = r22;
        r2 = r211;
        r3 = r38;
        r4 = r39;
    L63:
        r16 = r110;
        goto L64
    L57:
        r22 = r1;
        r211 = r2;
        r38 = r3;
        r39 = r4;
        r110 = null;
        goto L58
    L65:
        r19 = null;
        r8 = null;
        goto L66
    }
}
