package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: ModifierLocalManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tJ\u0006\u0010\u0015\u001a\u00020\u0012J*\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00172\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tJ\u0006\u0010\u001b\u001a\u00020\u0012J\u001a\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "owner", "Landroidx/compose/ui/node/Owner;", "(Landroidx/compose/ui/node/Owner;)V", "inserted", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/BackwardsCompatNode;", "insertedLocal", "Landroidx/compose/ui/modifier/ModifierLocal;", "invalidated", "", "getOwner", "()Landroidx/compose/ui/node/Owner;", "removed", "Landroidx/compose/ui/node/LayoutNode;", "removedLocal", "insertedProvider", "", "node", "key", "invalidate", "invalidateConsumersOfNodeForKey", "Landroidx/compose/ui/Modifier$Node;", "set", "", "removedProvider", "triggerUpdates", "updatedProvider", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ModifierLocalManager {
    public static final int $stable = 0;
    private final MutableVector<BackwardsCompatNode> inserted;
    private final MutableVector<ModifierLocal<?>> insertedLocal;
    private boolean invalidated;
    private final Owner owner;
    private final MutableVector<LayoutNode> removed;
    private final MutableVector<ModifierLocal<?>> removedLocal;

    static {
        $stable = 8;
    }

    public ModifierLocalManager(Owner owner) {
        this.owner = owner;
        this.inserted = new MutableVector(new BackwardsCompatNode[16], 0);
        this.insertedLocal = new MutableVector(new ModifierLocal[16], 0);
        this.removed = new MutableVector(new LayoutNode[16], 0);
        this.removedLocal = new MutableVector(new ModifierLocal[16], 0);
    }

    public final Owner getOwner() {
        return this.owner;
    }

    public final void invalidate() {
        if (this.invalidated == true) goto L6;
        this.invalidated = true;
        this.owner.registerOnEndApplyChangesListener(new AnonymousClass1(this));
        return;
    }

    public final void triggerUpdates() {
        this.invalidated = false;
        Iterable toUpdate = new HashSet();
        MutableVector<LayoutNode> r1 = this.removed;
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L3:
        if (i$iv >= size$iv) goto L8;
        LayoutNode layout = (LayoutNode) content$iv[i$iv];
        int i = i$iv;
        ModifierLocal<?> r9 = this.removedLocal.content[i];
        if (layout.getNodes$ui_release().getHead$ui_release().isAttached() == false) goto L7;
        invalidateConsumersOfNodeForKey(layout.getNodes$ui_release().getHead$ui_release(), r9, (Set) toUpdate);
    L7:
        i$iv = i$iv + 1;
        goto L3
    L8:
        this.removed.clear();
        this.removedLocal.clear();
        MutableVector<BackwardsCompatNode> r2 = this.inserted;
        int i$iv2 = 0;
        Object[] content$iv2 = r2.content;
        int size$iv2 = r2.getSize();
    L9:
        if (i$iv2 >= size$iv2) goto L14;
        BackwardsCompatNode node = (BackwardsCompatNode) content$iv2[i$iv2];
        int i2 = i$iv2;
        ModifierLocal<?> r10 = this.insertedLocal.content[i2];
        if (node.isAttached() == false) goto L13;
        invalidateConsumersOfNodeForKey(node, r10, (Set) toUpdate);
    L13:
        i$iv2 = i$iv2 + 1;
        goto L9
    L14:
        this.inserted.clear();
        this.insertedLocal.clear();
        Iterable $this$forEach$iv = toUpdate;
        Iterator r3 = $this$forEach$iv.iterator();
    L16:
        if (r3.hasNext() == false) goto L19;
        Object element$iv = r3.next();
        BackwardsCompatNode it = (BackwardsCompatNode) element$iv;
        it.updateModifierLocalConsumer();
        goto L16
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void invalidateConsumersOfNodeForKey(Modifier.Node node, ModifierLocal<?> r32, Set<BackwardsCompatNode> r33) {
        r32 = r32;
        Modifier.Node $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = node;
        int type$iv = NodeKind.m5976constructorimpl(32);
        boolean value$iv$iv$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
    L5:
        boolean r13 = false;
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L8;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L9:
        boolean r14 = true;
        if (branches$iv$iv.getSize() == 0) goto L12;
        boolean r9 = true;
    L13:
        if (r9 == false) goto L84;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L82;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L17:
        if (node$iv$iv == null) goto L82;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L78;
        Modifier.Node node$iv = node$iv$iv;
        MutableVector r18 = null;
        Modifier.Node r15 = node$iv;
    L21:
        if (r15 == null) goto L73;
        if ((r15 instanceof ModifierLocalModifierNode) == true) goto L24;
        DelegatableNode $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        Modifier.Node this_$iv$iv$iv = r15;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L40;
        boolean r1 = true;
    L41:
        if (r1 == false) goto L71;
        if ((r15 instanceof DelegatingNode) == false) goto L71;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r15;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L45:
        if (node$iv$iv$iv == null) goto L68;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L49;
        boolean r26 = true;
    L50:
        if (r26 == false) goto L67;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != 1) goto L54;
        r15 = next$iv$iv;
        goto L67
    L54:
        if (r18 != null) goto L56;
        MutableVector r2 = new MutableVector(new Modifier.Node[16], 0);
    L57:
        Modifier.Node theNode$iv$iv = r15;
        if (theNode$iv$iv == null) goto L62;
        if (r2 == null) goto L61;
        r2.add(theNode$iv$iv);
    L61:
        r15 = null;
    L62:
        if (r2 == null) goto L65;
        r2.add(next$iv$iv);
    L65:
        r18 = r2;
        count$iv$iv = count$iv$iv;
        goto L67
    L56:
        r2 = r18;
    L67:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        goto L45
    L49:
        r26 = false;
        goto L50
    L68:
        boolean r0 = true;
        if (count$iv$iv != 1) goto L72;
        r14 = true;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L72:
        r15 = DelegatableNodeKt.access$pop(r18);
        r14 = r0;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L71:
        r0 = true;
        goto L72
    L40:
        r1 = false;
        goto L41
    L24:
        Object it$iv = r15;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        ModifierLocalModifierNode it = (ModifierLocalModifierNode) it$iv;
        type$iv2 = type$iv;
        if ((it instanceof BackwardsCompatNode) == false) goto L34;
        if ((((BackwardsCompatNode) it).getElement() instanceof ModifierLocalConsumer) == false) goto L34;
        if (((BackwardsCompatNode) it).getReadValues().contains(r32) == false) goto L34;
        r33.add(it);
    L34:
        if (it.getProvidedValues().contains$ui_release(r32) == true) goto L35;
        r0 = true;
        goto L72
    L35:
        boolean r3 = true;
        boolean diveDeeper$iv$iv = false;
    L75:
        if (diveDeeper$iv$iv == true) goto L79;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
        r13 = false;
    L79:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r14 = r3;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
        r32 = r32;
        goto L17
    L73:
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        r3 = r14;
        diveDeeper$iv$iv = r3;
        goto L75
    L78:
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        r3 = r14;
    L82:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r13 = false;
        goto L9
    L84:
        return;
    L12:
        r9 = r13;
        goto L13
    L8:
        branches$iv$iv.add(child$iv$iv);
        goto L9
    }

    public final void updatedProvider(BackwardsCompatNode node, ModifierLocal<?> r4) {
        this.inserted.add(node);
        this.insertedLocal.add(r4);
        invalidate();
    }

    public final void insertedProvider(BackwardsCompatNode node, ModifierLocal<?> r4) {
        this.inserted.add(node);
        this.insertedLocal.add(r4);
        invalidate();
    }

    public final void removedProvider(BackwardsCompatNode node, ModifierLocal<?> r5) {
        this.removed.add(DelegatableNodeKt.requireLayoutNode(node));
        this.removedLocal.add(r5);
        invalidate();
    }
}
