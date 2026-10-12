package androidx.compose.ui.semantics;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0080\u0002¢\u0006\u0002\b\u001bJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0002\b!R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\""}, d2 = {"Landroidx/compose/ui/semantics/SemanticsOwner;", "", "rootNode", "Landroidx/compose/ui/node/LayoutNode;", "outerSemanticsNode", "Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "nodes", "Landroidx/collection/IntObjectMap;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/EmptySemanticsModifier;Landroidx/collection/IntObjectMap;)V", "listeners", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/semantics/SemanticsListener;", "getListeners$ui_release", "()Landroidx/collection/MutableObjectList;", "rootInfo", "Landroidx/compose/ui/semantics/SemanticsInfo;", "getRootInfo$ui_release", "()Landroidx/compose/ui/semantics/SemanticsInfo;", "rootSemanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRootSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedRootSemanticsNode", "getUnmergedRootSemanticsNode", "get", "semanticsId", "", "get$ui_release", "notifySemanticsChange", "", "semanticsInfo", "previousSemanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "notifySemanticsChange$ui_release", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SemanticsOwner {
    public static final int $stable = 0;
    private final MutableObjectList<SemanticsListener> listeners;
    private final IntObjectMap<LayoutNode> nodes;
    private final EmptySemanticsModifier outerSemanticsNode;
    private final LayoutNode rootNode;

    static {
        $stable = 8;
    }

    public SemanticsOwner(LayoutNode rootNode, EmptySemanticsModifier outerSemanticsNode, IntObjectMap<LayoutNode> r5) {
        this.rootNode = rootNode;
        this.outerSemanticsNode = outerSemanticsNode;
        this.nodes = r5;
        this.listeners = new MutableObjectList(2);
    }

    public final SemanticsNode getRootSemanticsNode() {
        return SemanticsNodeKt.SemanticsNode(this.rootNode, true);
    }

    public final SemanticsNode getUnmergedRootSemanticsNode() {
        EmptySemanticsModifier r0 = this.outerSemanticsNode;
        EmptySemanticsModifier r1 = r0;
        return new SemanticsNode(r1, false, this.rootNode, new SemanticsConfiguration());
    }

    public final MutableObjectList<SemanticsListener> getListeners$ui_release() {
        return this.listeners;
    }

    public final SemanticsInfo getRootInfo$ui_release() {
        return this.rootNode;
    }

    public final SemanticsInfo get$ui_release(int semanticsId) {
        return this.nodes.get(semanticsId);
    }

    public final void notifySemanticsChange$ui_release(SemanticsInfo semanticsInfo, SemanticsConfiguration previousSemanticsConfiguration) {
        ObjectList this_$iv = this.listeners;
        Object[] content$iv = this_$iv.content;
        int i$iv = 0;
        int r4 = this_$iv._size;
    L3:
        if (i$iv >= r4) goto L6;
        SemanticsListener it = (SemanticsListener) content$iv[i$iv];
        it.onSemanticsChanged(semanticsInfo, previousSemanticsConfiguration);
        i$iv = i$iv + 1;
        goto L3
    }
}
