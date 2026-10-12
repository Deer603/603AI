package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DepthSortedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u0086\bJ\u0006\u0010\u0010\u001a\u00020\u0007J\u001f\u0010\u0011\u001a\u00020\u000b2\u0014\b\u0004\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0013H\u0086\bJ\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "extraAssertions", "", "(Z)V", "mapOfOriginalDepth", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/node/LayoutNode;", "set", "Landroidx/compose/ui/node/TreeSet;", "add", "", "node", "contains", "isEmpty", "isNotEmpty", "pop", "popEach", "block", "Lkotlin/Function1;", "remove", "safeMapOfOriginalDepth", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DepthSortedSet {
    public static final int $stable = 0;
    private final boolean extraAssertions;
    private MutableObjectIntMap<LayoutNode> mapOfOriginalDepth;
    private final TreeSet<LayoutNode> set;

    static {
        $stable = 8;
    }

    public DepthSortedSet(boolean extraAssertions) {
        this.extraAssertions = extraAssertions;
        this.set = new TreeSet(DepthSortedSetKt.access$getDepthComparator$p());
    }

    public final boolean contains(LayoutNode node) {
        boolean contains = this.set.contains(node);
        if (this.extraAssertions == true) goto L5;
    L12:
        return contains;
    L5:
        if (contains != safeMapOfOriginalDepth().containsKey(node)) goto L7;
        boolean value$iv = true;
    L9:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalStateException("inconsistency in TreeSet");
        goto L12
    L7:
        value$iv = false;
        goto L9
    }

    public final void add(LayoutNode node) {
        boolean value$iv = node.isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
    L5:
        boolean value$iv2 = this.extraAssertions;
        if (value$iv2 == false) goto L18;
        MutableObjectIntMap<LayoutNode> r0 = safeMapOfOriginalDepth();
        int usedDepth = r0.getOrDefault(node, Integer.MAX_VALUE);
        if (usedDepth != Integer.MAX_VALUE) goto L11;
        r0.set(node, node.getDepth$ui_release());
        goto L18
    L11:
        if (usedDepth != node.getDepth$ui_release()) goto L13;
        boolean value$iv3 = true;
    L15:
        if (value$iv3 == true) goto L18;
        InlineClassHelperKt.throwIllegalStateException("invalid node depth");
        goto L18
    L13:
        value$iv3 = false;
    L18:
        this.set.add(node);
    }

    public final boolean remove(LayoutNode node) {
        boolean value$iv = node.isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
    L5:
        boolean contains = this.set.remove(node);
        if (this.extraAssertions == false) goto L20;
        MutableObjectIntMap<LayoutNode> r1 = safeMapOfOriginalDepth();
        MutableObjectIntMap<LayoutNode> this_$iv = r1;
        if (this_$iv.containsKey(node) == false) goto L20;
        int usedDepth = r1.get(node);
        r1.remove(node);
        if (contains == false) goto L12;
        int r3 = node.getDepth$ui_release();
    L13:
        if (usedDepth != r3) goto L15;
        boolean value$iv2 = true;
    L17:
        if (value$iv2 == true) goto L20;
        InlineClassHelperKt.throwIllegalStateException("invalid node depth");
        goto L20
    L15:
        value$iv2 = false;
        goto L17
    L12:
        r3 = Integer.MAX_VALUE;
    L20:
        return contains;
    }

    public final LayoutNode pop() {
        LayoutNode node = this.set.first();
        remove(node);
        return node;
    }

    public final void popEach(Function1<? super LayoutNode, Unit> r5) {
    L4:
        if (isEmpty() == true) goto L6;
        LayoutNode node = pop();
        r5.invoke(node);
        goto L4
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    private final MutableObjectIntMap<LayoutNode> safeMapOfOriginalDepth() {
        if (this.mapOfOriginalDepth != null) goto L5;
        this.mapOfOriginalDepth = ObjectIntMapKt.mutableObjectIntMapOf();
    L5:
        MutableObjectIntMap<LayoutNode> r0 = this.mapOfOriginalDepth;
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    public String toString() {
        return this.set.toString();
    }
}
