package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DelegatingNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\rH\u0004¢\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\"\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140\u0016H\u0080\b¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0014H\u0010¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0014H\u0010¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\u0014H\u0010¢\u0006\u0002\b\u001dJ\r\u0010\u001e\u001a\u00020\u0014H\u0010¢\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020\u0014H\u0010¢\u0006\u0002\b!J\u0015\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0001H\u0010¢\u0006\u0002\b$J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u000eH\u0004J\u0015\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u000eH\u0000¢\u0006\u0002\b(J\u0017\u0010)\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010+H\u0010¢\u0006\u0002\b,J\u0018\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u000200H\u0002J\u0018\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0001H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f¨\u00064"}, d2 = {"Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/Modifier$Node;", "()V", "delegate", "getDelegate$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "setDelegate$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "selfKindSet", "", "getSelfKindSet$ui_release$annotations", "getSelfKindSet$ui_release", "()I", "T", "Landroidx/compose/ui/node/DelegatableNode;", "delegatableNode", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;", "delegateUnprotected", "delegateUnprotected$ui_release", "forEachImmediateDelegate", "", "block", "Lkotlin/Function1;", "forEachImmediateDelegate$ui_release", "markAsAttached", "markAsAttached$ui_release", "markAsDetached", "markAsDetached$ui_release", "reset", "reset$ui_release", "runAttachLifecycle", "runAttachLifecycle$ui_release", "runDetachLifecycle", "runDetachLifecycle$ui_release", "setAsDelegateTo", "owner", "setAsDelegateTo$ui_release", "undelegate", "instance", "undelegateUnprotected", "undelegateUnprotected$ui_release", "updateCoordinator", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "updateCoordinator$ui_release", "updateNodeKindSet", "newKindSet", "recalculateOwner", "", "validateDelegateKindSet", "delegateKindSet", "delegateNode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class DelegatingNode extends Modifier.Node {
    public static final int $stable = 0;
    private Modifier.Node delegate;
    private final int selfKindSet;

    static {
        $stable = 8;
    }

    public static /* synthetic */ void getSelfKindSet$ui_release$annotations() {
    }

    public DelegatingNode() {
        this.selfKindSet = NodeKindKt.calculateNodeKindSetFrom(this);
    }

    public final int getSelfKindSet$ui_release() {
        return this.selfKindSet;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void updateCoordinator$ui_release(NodeCoordinator coordinator) {
        super.updateCoordinator$ui_release(coordinator);
        Modifier.Node node$iv = getDelegate$ui_release();
    L3:
        if (node$iv == null) goto L6;
        Modifier.Node it = node$iv;
        it.updateCoordinator$ui_release(coordinator);
        node$iv = node$iv.getChild$ui_release();
        goto L3
    }

    public final Modifier.Node getDelegate$ui_release() {
        return this.delegate;
    }

    public final void setDelegate$ui_release(Modifier.Node r1) {
        this.delegate = r1;
    }

    public final <T extends DelegatableNode> T delegateUnprotected$ui_release(T r2) {
        return (T) delegate(r2);
    }

    public final void undelegateUnprotected$ui_release(DelegatableNode instance) {
        undelegate(instance);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void setAsDelegateTo$ui_release(Modifier.Node owner) {
        super.setAsDelegateTo$ui_release(owner);
        Modifier.Node node$iv = getDelegate$ui_release();
    L3:
        if (node$iv == null) goto L6;
        Modifier.Node it = node$iv;
        it.setAsDelegateTo$ui_release(owner);
        node$iv = node$iv.getChild$ui_release();
        goto L3
    }

    protected final <T extends DelegatableNode> T delegate(T r13) {
        Modifier.Node delegateNode = r13.getNode();
        boolean isDelegatedToThisNode = true;
        if (delegateNode == r13) goto L5;
        boolean isAlreadyDelegated = true;
    L6:
        Modifier.Node delegator = null;
        if (isAlreadyDelegated == true) goto L9;
        boolean value$iv = !delegateNode.isAttached();
        if (value$iv == true) goto L27;
        InlineClassHelperKt.throwIllegalStateException("Cannot delegate to an already attached node");
    L27:
        delegateNode.setAsDelegateTo$ui_release(getNode());
        int beforeKindSet = getKindSet$ui_release();
        int delegatedKindSet = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(delegateNode);
        delegateNode.setKindSet$ui_release(delegatedKindSet);
        validateDelegateKindSet(delegatedKindSet, delegateNode);
        delegateNode.setChild$ui_release(this.delegate);
        this.delegate = delegateNode;
        delegateNode.setParent$ui_release(this);
        updateNodeKindSet(getKindSet$ui_release() | delegatedKindSet, false);
        if (isAttached() == true) goto L30;
    L42:
        return r13;
    L30:
        if ((delegatedKindSet & NodeKind.m5976constructorimpl(2)) == 0) goto L32;
        int value$iv2 = 1;
    L33:
        if (value$iv2 != 0) goto L35;
    L40:
        updateCoordinator$ui_release(getCoordinator$ui_release());
    L41:
        delegateNode.markAsAttached$ui_release();
        delegateNode.runAttachLifecycle$ui_release();
        NodeKindKt.autoInvalidateInsertedNode(delegateNode);
        goto L42
    L35:
        if ((beforeKindSet & NodeKind.m5976constructorimpl(2)) != 0) goto L38;
        isDelegatedToThisNode = false;
    L38:
        if (isDelegatedToThisNode == true) goto L40;
        NodeChain chain = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
        getNode().updateCoordinator$ui_release(null);
        chain.syncCoordinators();
        goto L41
    L32:
        value$iv2 = 0;
        goto L33
    L9:
        if ((r13 instanceof Modifier.Node) == false) goto L11;
        Modifier.Node r5 = (Modifier.Node) r13;
    L12:
        if (r5 == null) goto L15;
        delegator = r5.getParent$ui_release();
    L15:
        if (delegateNode == getNode()) goto L17;
    L19:
        isDelegatedToThisNode = false;
    L20:
        if (isDelegatedToThisNode == false) goto L23;
        return r13;
    L23:
        throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
    L17:
        if (Intrinsics.areEqual(delegator, this) == false) goto L19;
    L11:
        r5 = null;
        goto L12
    L5:
        isAlreadyDelegated = false;
        goto L6
    }

    protected final void undelegate(DelegatableNode instance) {
        Modifier.Node prev = null;
        Modifier.Node it = this.delegate;
        boolean found = false;
    L3:
        boolean r4 = false;
        if (it == null) goto L15;
        if (it == instance) goto L7;
        prev = it;
        it = it.getChild$ui_release();
        goto L3
    L7:
        if (it.isAttached() == false) goto L9;
        NodeKindKt.autoInvalidateRemovedNode(it);
        it.runDetachLifecycle$ui_release();
        it.markAsDetached$ui_release();
    L9:
        it.setAsDelegateTo$ui_release(it);
        it.setAggregateChildKindSet$ui_release(0);
        if (prev != null) goto L12;
        this.delegate = it.getChild$ui_release();
    L13:
        it.setChild$ui_release(null);
        it.setParent$ui_release(null);
        found = true;
        goto L15
    L12:
        prev.setChild$ui_release(it.getChild$ui_release());
    L15:
        if (found == false) goto L30;
        int beforeKindSet = getKindSet$ui_release();
        int afterKindSet = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(this);
        updateNodeKindSet(afterKindSet, true);
        if (isAttached() == true) goto L19;
        return;
    L19:
        if ((beforeKindSet & NodeKind.m5976constructorimpl(2)) == 0) goto L21;
        int value$iv = 1;
    L22:
        if (value$iv != 0) goto L24;
        return;
    L24:
        if ((afterKindSet & NodeKind.m5976constructorimpl(2)) == 0) goto L26;
        r4 = true;
    L26:
        if (r4 == true) goto L35;
        NodeChain chain = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
        getNode().updateCoordinator$ui_release(null);
        chain.syncCoordinators();
        return;
    L35:
        return;
    L21:
        value$iv = 0;
        goto L22
    L30:
        throw new IllegalStateException(("Could not find delegate: " + instance).toString());
    }

    private final void validateDelegateKindSet(int delegateKindSet, Modifier.Node delegateNode) {
        int current = getKindSet$ui_release();
        boolean r6 = true;
        if ((delegateKindSet & NodeKind.m5976constructorimpl(2)) == 0) goto L5;
        int value$iv = 1;
    L6:
        if (value$iv != 0) goto L8;
        return;
    L8:
        if ((current & NodeKind.m5976constructorimpl(2)) != 0) goto L11;
        r6 = false;
    L11:
        if (r6 == false) goto L17;
        boolean value$iv2 = this instanceof LayoutModifierNode;
        if (value$iv2 == true) goto L19;
        InlineClassHelperKt.throwIllegalStateException("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + delegateNode);
        return;
    L19:
        return;
    L17:
        return;
    L5:
        value$iv = 0;
        goto L6
    }

    private final void updateNodeKindSet(int newKindSet, boolean recalculateOwner) {
        int before = getKindSet$ui_release();
        setKindSet$ui_release(newKindSet);
        if (before == newKindSet) goto L25;
        int agg = newKindSet;
        if (DelegatableNodeKt.isDelegationRoot(this) == false) goto L8;
        setAggregateChildKindSet$ui_release(agg);
    L8:
        if (isAttached() == false) goto L29;
        Modifier.Node owner = getNode();
        DelegatingNode it = this;
    L10:
        if (it == null) goto L14;
        agg = agg | it.getKindSet$ui_release();
        it.setKindSet$ui_release(agg);
        if (it == owner) goto L14;
        it = it.getParent$ui_release();
    L14:
        if (recalculateOwner == false) goto L17;
        if (it != owner) goto L17;
        agg = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(owner);
        owner.setKindSet$ui_release(agg);
    L17:
        if (it == null) goto L21;
        Modifier.Node r4 = it.getChild$ui_release();
        if (r4 == null) goto L21;
        int r5 = r4.getAggregateChildKindSet$ui_release();
    L22:
        int agg2 = agg | r5;
    L23:
        if (it == null) goto L30;
        agg2 = agg2 | it.getKindSet$ui_release();
        it.setAggregateChildKindSet$ui_release(agg2);
        it = it.getParent$ui_release();
        goto L23
    L30:
        return;
    L21:
        r5 = 0;
        goto L22
    L29:
        return;
    }

    public final void forEachImmediateDelegate$ui_release(Function1<? super Modifier.Node, Unit> r3) {
        Modifier.Node node = getDelegate$ui_release();
    L3:
        if (node == null) goto L5;
        r3.invoke(node);
        node = node.getChild$ui_release();
        goto L3
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        Modifier.Node node$iv = getDelegate$ui_release();
    L3:
        if (node$iv == null) goto L9;
        Modifier.Node it = node$iv;
        it.updateCoordinator$ui_release(getCoordinator$ui_release());
        if (it.isAttached() == true) goto L7;
        it.markAsAttached$ui_release();
    L7:
        node$iv = node$iv.getChild$ui_release();
        goto L3
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runAttachLifecycle$ui_release() {
        Modifier.Node node$iv = getDelegate$ui_release();
    L3:
        if (node$iv == null) goto L5;
        Modifier.Node it = node$iv;
        it.runAttachLifecycle$ui_release();
        node$iv = node$iv.getChild$ui_release();
        goto L3
    L5:
        super.runAttachLifecycle$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        Modifier.Node node$iv = getDelegate$ui_release();
    L3:
        if (node$iv == null) goto L6;
        Modifier.Node it = node$iv;
        it.runDetachLifecycle$ui_release();
        node$iv = node$iv.getChild$ui_release();
        goto L3
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsDetached$ui_release() {
        Modifier.Node node$iv = getDelegate$ui_release();
    L3:
        if (node$iv == null) goto L5;
        Modifier.Node it = node$iv;
        it.markAsDetached$ui_release();
        node$iv = node$iv.getChild$ui_release();
        goto L3
    L5:
        super.markAsDetached$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void reset$ui_release() {
        super.reset$ui_release();
        Modifier.Node node$iv = getDelegate$ui_release();
    L3:
        if (node$iv == null) goto L6;
        Modifier.Node it = node$iv;
        it.reset$ui_release();
        node$iv = node$iv.getChild$ui_release();
        goto L3
    }
}
