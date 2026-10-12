package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;

/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J)\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\t2\u0006\u0010\u000f\u001a\u0002H\bH\u0016¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/DelegatableNode;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "current", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "provide", "", "key", "value", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ModifierLocalModifierNode extends ModifierLocalReadScope, DelegatableNode {
    default ModifierLocalMap getProvidedValues() {
        return EmptyMap.INSTANCE;
    }

    default <T> void provide(ModifierLocal<T> r6, T r7) {
        if (getProvidedValues() == EmptyMap.INSTANCE) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap");
    L9:
        boolean value$iv2 = getProvidedValues().contains$ui_release(r6);
        if (value$iv2 == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + r6 + " was not found.");
    L12:
        getProvidedValues().mo5820set$ui_release(r6, r7);
        return;
    L5:
        value$iv = false;
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v21 */
    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    default <T> T getCurrent(ModifierLocal<T> r32) {
        if (getNode().isAttached() == true) goto L5;
        InlineClassHelperKt.throwIllegalArgumentException("ModifierLocal accessed from an unattached node");
    L5:
        ModifierLocal<T> r0 = r32;
        ModifierLocalModifierNode r1 = this;
        int r2 = NodeKind.m5976constructorimpl(32);
        if (r1.getNode().isAttached() == true) goto L8;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L8:
        Modifier.Node r8 = r1.getNode().getParent$ui_release();
        LayoutNode r9 = DelegatableNodeKt.requireLayoutNode(r1);
    L9:
        if (r9 == null) goto L74;
        if ((r9.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r2) == 0) goto L65;
    L12:
        if (r8 == null) goto L64;
        if ((r8.getKindSet$ui_release() & r2) == 0) goto L62;
        ?? r15 = 0;
        Modifier.Node r3 = r8;
    L16:
        if (r3 == null) goto L61;
        r2 = r2;
        if ((r3 instanceof ModifierLocalModifierNode) == true) goto L19;
        ModifierLocal<T> r20 = r0;
        int r4 = 1;
        if ((r3.getKindSet$ui_release() & r2) == 0) goto L27;
        boolean r5 = true;
    L28:
        if (r5 == false) goto L60;
        if ((r3 instanceof DelegatingNode) == false) goto L60;
        int r6 = 0;
        Modifier.Node r21 = ((DelegatingNode) r3).getDelegate$ui_release();
        r15 = r15;
    L32:
        if (r21 == null) goto L56;
        Modifier.Node r22 = r21;
        if ((r22.getKindSet$ui_release() & r2) == 0) goto L36;
        int r24 = r4;
    L37:
        if (r24 == 0) goto L55;
        r6 = r6 + 1;
        if (r6 != r4) goto L41;
        r3 = r22;
        goto L55
    L41:
        if (r15 != 0) goto L43;
        ?? r7 = new MutableVector(new Modifier.Node[16], 0);
    L44:
        r15 = r7;
        Object r10 = r3;
        if (r10 == null) goto L49;
        if (r15 == 0) goto L48;
        r15.add(r10);
    L48:
        Modifier.Node r11 = null;
    L50:
        if (r15 == 0) goto L53;
        r15.add(r22);
    L53:
        r3 = r11;
        r6 = r6;
        goto L55
    L49:
        r11 = r3;
        goto L50
    L43:
        r7 = r15;
    L55:
        r21 = r21.getChild$ui_release();
        r4 = 1;
        r15 = r15;
        goto L32
    L36:
        r24 = 0;
        goto L37
    L56:
        Modifier.Node r27 = r3;
        if (r6 != 1) goto L60;
        r0 = r20;
        r3 = r27;
    L60:
        r3 = DelegatableNodeKt.access$pop(r15);
        r0 = r20;
        goto L16
    L27:
        r5 = false;
        goto L28
    L19:
        ModifierLocalModifierNode r12 = (ModifierLocalModifierNode) r3;
        if (r12.getProvidedValues().contains$ui_release(r0) == true) goto L22;
        r20 = r0;
        goto L60
    L22:
        return (T) r12.getProvidedValues().get$ui_release(r0);
    L61:
        ModifierLocal<T> r23 = r0;
    L63:
        r8 = r8.getParent$ui_release();
        r1 = r1;
        r2 = r2;
        r0 = r23;
        goto L12
    L62:
        r23 = r0;
        goto L63
    L64:
        ModifierLocal<T> r25 = r0;
        ModifierLocalModifierNode r16 = r1;
        int r17 = r2;
    L66:
        r9 = r9.getParent$ui_release();
        if (r9 == null) goto L71;
        NodeChain r13 = r9.getNodes$ui_release();
        if (r13 == null) goto L71;
        Modifier.Node r14 = r13.getTail$ui_release();
    L72:
        r8 = r14;
        r1 = r16;
        r2 = r17;
        r0 = r25;
    L71:
        r14 = null;
        goto L72
    L65:
        r25 = r0;
        r16 = r1;
        r17 = r2;
        goto L66
    L74:
        return r0.getDefaultFactory$ui_release().invoke();
    }
}
