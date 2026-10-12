package androidx.compose.ui.graphics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: IntervalTree.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001)B\u0005¢\u0006\u0002\u0010\u0003J%\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0011\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0086\u0002J\u0017\u0010\u0012\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0086\u0002J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0016J:\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u001a2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u001aJ6\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u001a2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u001aJ:\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020\u000b0\u001eH\u0080\b¢\u0006\u0002\b\u001fJ6\u0010\u001c\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020\u000b0\u001eH\u0080\b¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180!H\u0086\u0002J\u0017\u0010\"\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\u0002J\u001a\u0010#\u001a\u00020\u000b2\u0010\u0010$\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u001a\u0010%\u001a\u00020\u000b2\u0010\u0010&\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u001a\u0010'\u001a\u00020\u000b2\u0010\u0010&\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u001a\u0010(\u001a\u00020\u000b2\u0010\u0010&\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002R\u001c\u0010\u0004\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R4\u0010\u0006\u001a&\u0012\u000e\u0012\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00000\u0007j\u0012\u0012\u000e\u0012\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000`\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree;", "T", "", "()V", "root", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "stack", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "terminator", "addInterval", "", "start", "", "end", "data", "(FFLjava/lang/Object;)V", "clear", "contains", "", "value", "interval", "Lkotlin/ranges/ClosedFloatingPointRange;", "findFirstOverlap", "Landroidx/compose/ui/graphics/Interval;", "findOverlaps", "", "results", "forEach", "block", "Lkotlin/Function1;", "forEach$ui_graphics_release", "iterator", "", "plusAssign", "rebalance", "target", "rotateLeft", "node", "rotateRight", "updateNodeData", "Node", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntervalTree<T> {
    public IntervalTree<T>.Node root;
    public final ArrayList<IntervalTree<T>.Node> stack;
    public final IntervalTree<T>.Node terminator;

    /* JADX INFO: compiled from: IntervalTree.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0002\u0010\tJ\u0010\u0010\"\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0010\u0010#\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000fR\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001c\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R$\u0010\u001f\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/Interval;", "start", "", "end", "data", "color", "", "Landroidx/compose/ui/graphics/TreeColor;", "(Landroidx/compose/ui/graphics/IntervalTree;FFLjava/lang/Object;I)V", "getColor", "()I", "setColor", "(I)V", "left", "Landroidx/compose/ui/graphics/IntervalTree;", "getLeft", "()Landroidx/compose/ui/graphics/IntervalTree$Node;", "setLeft", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "max", "getMax", "()F", "setMax", "(F)V", "min", "getMin", "setMin", "parent", "getParent", "setParent", "right", "getRight", "setRight", "lowestNode", "next", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Node extends Interval<T> {
        private int color;
        private IntervalTree<T>.Node left;
        private float max;
        private float min;
        private IntervalTree<T>.Node parent;
        private IntervalTree<T>.Node right;
        final /* synthetic */ IntervalTree<T> this$0;

        public Node(IntervalTree this$0, float start, float end, T r5, int color) {
            this.this$0 = this$0;
            super(start, end, r5);
            this.color = color;
            this.min = start;
            this.max = end;
            this.left = this.this$0.terminator;
            this.right = this.this$0.terminator;
            this.parent = this.this$0.terminator;
        }

        public final int getColor() {
            return this.color;
        }

        public final void setColor(int r1) {
            this.color = r1;
        }

        public final float getMin() {
            return this.min;
        }

        public final void setMin(float r1) {
            this.min = r1;
        }

        public final float getMax() {
            return this.max;
        }

        public final void setMax(float r1) {
            this.max = r1;
        }

        public final IntervalTree<T>.Node getLeft() {
            return this.left;
        }

        public final void setLeft(IntervalTree<T>.Node r1) {
            this.left = r1;
        }

        public final IntervalTree<T>.Node getRight() {
            return this.right;
        }

        public final void setRight(IntervalTree<T>.Node r1) {
            this.right = r1;
        }

        public final IntervalTree<T>.Node getParent() {
            return this.parent;
        }

        public final void setParent(IntervalTree<T>.Node r1) {
            this.parent = r1;
        }

        public final IntervalTree<T>.Node lowestNode() {
            Node node = this;
        L4:
            if (node.left == this.this$0.terminator) goto L6;
            node = node.left;
            goto L4
        L6:
            return node;
        }

        public final IntervalTree<T>.Node next() {
            if (this.right != this.this$0.terminator) goto L5;
            Node a = this;
            IntervalTree<T>.Node r1 = this.parent;
        L8:
            if (r1 == this.this$0.terminator) goto L12;
            if (a != r1.right) goto L12;
            a = r1;
            r1 = r1.parent;
        L12:
            return r1;
        L5:
            return this.right.lowestNode();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.IntervalTree$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: IntervalTree.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002R$\u0010\u0003\u001a\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"androidx/compose/ui/graphics/IntervalTree$iterator$1", "", "Landroidx/compose/ui/graphics/Interval;", "next", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/IntervalTree;", "getNext", "()Landroidx/compose/ui/graphics/IntervalTree$Node;", "setNext", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "hasNext", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<Interval<T>>, KMappedMarker {
        private IntervalTree<T>.Node next;
        final /* synthetic */ IntervalTree<T> this$0;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1(IntervalTree<T> r2) {
            this.this$0 = r2;
            this.next = r2.root.lowestNode();
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return next();
        }

        public final IntervalTree<T>.Node getNext() {
            return this.next;
        }

        public final void setNext(IntervalTree<T>.Node r1) {
            this.next = r1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.next == this.this$0.terminator) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.Iterator
        public Interval<T> next() {
            IntervalTree<T>.Node r0 = this.next;
            this.next = this.next.next();
            return r0;
        }
    }

    public IntervalTree() {
        this.terminator = new Node(this, Float.MAX_VALUE, Float.MIN_VALUE, null, 1);
        this.root = this.terminator;
        this.stack = new ArrayList();
    }

    public final void clear() {
        this.root = this.terminator;
    }

    public final Interval<T> findFirstOverlap(ClosedFloatingPointRange<Float> r3) {
        return findFirstOverlap(r3.getStart().floatValue(), r3.getEndInclusive().floatValue());
    }

    public static /* synthetic */ Interval findFirstOverlap$default(IntervalTree r0, float r1, float r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r1;
    L6:
        return r0.findFirstOverlap(r1, r2);
    }

    public final Interval<T> findFirstOverlap(float r7, float r8) {
        if (this.root != this.terminator) goto L5;
    L25:
        Interval<T> r0 = (Interval<T>) IntervalTreeKt.getEmptyInterval();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.graphics.Interval<T of androidx.compose.ui.graphics.IntervalTree>");
        return r0;
    L5:
        if (this.root == this.terminator) goto L25;
        ArrayList<IntervalTree<T>.Node> r2 = this.stack;
        r2.add(this.root);
    L8:
        if (r2.size() <= 0) goto L23;
        IntervalTree<T>.Node r3 = r2.remove(r2.size() - 1);
        if (r3.overlaps(r7, r8) == true) goto L12;
        if (r3.getLeft() == this.terminator) goto L19;
        if (r3.getLeft().getMax() < r7) goto L19;
        r2.add(r3.getLeft());
    L19:
        if (r3.getRight() == this.terminator) goto L8;
        if (r3.getRight().getMin() > r8) goto L8;
        r2.add(r3.getRight());
        goto L8
    L12:
        return r3;
    L23:
        r2.clear();
        goto L25
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree r0, ClosedFloatingPointRange r1, ArrayList r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = new ArrayList();
    L6:
        return r0.findOverlaps(r1, r2);
    }

    public final List<Interval<T>> findOverlaps(ClosedFloatingPointRange<Float> r3, List<Interval<T>> r4) {
        return findOverlaps(r3.getStart().floatValue(), r3.getEndInclusive().floatValue(), r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree r0, float r1, float r2, ArrayList r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = r1;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = new ArrayList();
    L9:
        return r0.findOverlaps(r1, r2, r3);
    }

    public final List<Interval<T>> findOverlaps(float start, float end, List<Interval<T>> r9) {
        if (this.root == this.terminator) goto L22;
        ArrayList<IntervalTree<T>.Node> r2 = this.stack;
        r2.add(this.root);
    L6:
        if (r2.size() <= 0) goto L20;
        IntervalTree<T>.Node r3 = r2.remove(r2.size() - 1);
        if (r3.overlaps(start, end) == false) goto L11;
        IntervalTree<T>.Node interval = r3;
        r9.add(interval);
    L11:
        if (r3.getLeft() == this.terminator) goto L16;
        if (r3.getLeft().getMax() < start) goto L16;
        r2.add(r3.getLeft());
    L16:
        if (r3.getRight() == this.terminator) goto L6;
        if (r3.getRight().getMin() > end) goto L6;
        r2.add(r3.getRight());
        goto L6
    L20:
        r2.clear();
    L22:
        return r9;
    }

    public final void forEach$ui_graphics_release(ClosedFloatingPointRange<Float> r10, Function1<? super Interval<T>, Unit> r11) {
        float start$iv = r10.getStart().floatValue();
        float end$iv = r10.getEndInclusive().floatValue();
        if (this.root == this.terminator) goto L30;
        ArrayList<IntervalTree<T>.Node> r5 = this.stack;
        r5.add(this.root);
    L6:
        if (r5.size() <= 0) goto L20;
        IntervalTree<T>.Node r6 = r5.remove(r5.size() - 1);
        if (r6.overlaps(start$iv, end$iv) == false) goto L11;
        r11.invoke(r6);
    L11:
        if (r6.getLeft() == this.terminator) goto L16;
        if (r6.getLeft().getMax() < start$iv) goto L16;
        r5.add(r6.getLeft());
    L16:
        if (r6.getRight() == this.terminator) goto L6;
        if (r6.getRight().getMin() > end$iv) goto L6;
        r5.add(r6.getRight());
        goto L6
    L20:
        r5.clear();
        return;
    }

    public static /* synthetic */ void forEach$ui_graphics_release$default(IntervalTree $this, float start, float end, Function1 block, int r7, Object r8) {
        if ((r7 & 2) == 0) goto L6;
        end = start;
    L6:
        if ($this.root == $this.terminator) goto L32;
        ArrayList<IntervalTree<T>.Node> r9 = $this.stack;
        r9.add($this.root);
    L9:
        if (r9.size() <= 0) goto L23;
        IntervalTree<T>.Node r0 = r9.remove(r9.size() - 1);
        if (r0.overlaps(start, end) == false) goto L14;
        block.invoke(r0);
    L14:
        if (r0.getLeft() == $this.terminator) goto L19;
        if (r0.getLeft().getMax() < start) goto L19;
        r9.add(r0.getLeft());
    L19:
        if (r0.getRight() == $this.terminator) goto L9;
        if (r0.getRight().getMin() > end) goto L9;
        r9.add(r0.getRight());
        goto L9
    L23:
        r9.clear();
        return;
    }

    public final void forEach$ui_graphics_release(float start, float end, Function1<? super Interval<T>, Unit> r8) {
        if (this.root == this.terminator) goto L29;
        ArrayList<IntervalTree<T>.Node> r1 = this.stack;
        r1.add(this.root);
    L6:
        if (r1.size() <= 0) goto L20;
        IntervalTree<T>.Node r2 = r1.remove(r1.size() - 1);
        if (r2.overlaps(start, end) == false) goto L11;
        r8.invoke(r2);
    L11:
        if (r2.getLeft() == this.terminator) goto L16;
        if (r2.getLeft().getMax() < start) goto L16;
        r1.add(r2.getLeft());
    L16:
        if (r2.getRight() == this.terminator) goto L6;
        if (r2.getRight().getMin() > end) goto L6;
        r1.add(r2.getRight());
        goto L6
    L20:
        r1.clear();
        return;
    }

    public final boolean contains(float value) {
        if (findFirstOverlap(value, value) == IntervalTreeKt.getEmptyInterval()) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean contains(ClosedFloatingPointRange<Float> r3) {
        if (findFirstOverlap(r3.getStart().floatValue(), r3.getEndInclusive().floatValue()) == IntervalTreeKt.getEmptyInterval()) goto L5;
        return true;
    L5:
        return false;
    }

    public final Iterator<Interval<T>> iterator() {
        return new AnonymousClass1(this);
    }

    public final void plusAssign(Interval<T> r4) {
        addInterval(r4.getStart(), r4.getEnd(), r4.getData());
    }

    public final void addInterval(float start, float end, T r9) {
        IntervalTree<T>.Node r0 = new Node(this, start, end, r9, 0);
        IntervalTree<T>.Node r7 = this.root;
        IntervalTree<T>.Node r8 = this.terminator;
    L4:
        if (r7 == this.terminator) goto L10;
        r8 = r7;
        if (r0.getStart() > r7.getStart()) goto L8;
        IntervalTree<T>.Node r10 = r7.getLeft();
    L9:
        r7 = r10;
        goto L4
    L8:
        r10 = r7.getRight();
        goto L9
    L10:
        r0.setParent(r8);
        if (r8 != this.terminator) goto L14;
        this.root = r0;
    L17:
        updateNodeData(r0);
        rebalance(r0);
        return;
    L14:
        if (r0.getStart() > r8.getStart()) goto L16;
        r8.setLeft(r0);
        goto L17
    L16:
        r8.setRight(r0);
        goto L17
    }

    private final void rebalance(IntervalTree<T>.Node r7) {
        IntervalTree<T>.Node r0 = r7;
    L4:
        if (r0 == this.root) goto L23;
        if (r0.getParent().getColor() != 0) goto L23;
        IntervalTree<T>.Node r1 = r0.getParent().getParent();
        if (r0.getParent() == r1.getLeft()) goto L9;
        IntervalTree<T>.Node r3 = r1.getLeft();
        if (r3.getColor() == 0) goto L18;
        if (r0 != r0.getParent().getLeft()) goto L22;
        r0 = r0.getParent();
        rotateRight(r0);
    L22:
        r0.getParent().setColor(1);
        r1.setColor(0);
        rotateLeft(r1);
        goto L4
    L18:
        r3.setColor(1);
        r0.getParent().setColor(1);
        r1.setColor(0);
        r0 = r1;
        goto L4
    L9:
        IntervalTree<T>.Node r4 = r1.getRight();
        if (r4.getColor() == 0) goto L11;
        if (r0 != r0.getParent().getRight()) goto L15;
        r0 = r0.getParent();
        rotateLeft(r0);
    L15:
        r0.getParent().setColor(1);
        r1.setColor(0);
        rotateRight(r1);
        goto L4
    L11:
        r4.setColor(1);
        r0.getParent().setColor(1);
        r1.setColor(0);
        r0 = r1;
    L23:
        this.root.setColor(1);
    }

    private final void rotateLeft(IntervalTree<T>.Node r4) {
        IntervalTree<T>.Node r0 = r4.getRight();
        r4.setRight(r0.getLeft());
        if (r0.getLeft() == this.terminator) goto L5;
        r0.getLeft().setParent(r4);
    L5:
        r0.setParent(r4.getParent());
        if (r4.getParent() != this.terminator) goto L9;
        this.root = r0;
    L12:
        r0.setLeft(r4);
        r4.setParent(r0);
        updateNodeData(r4);
        return;
    L9:
        if (r4.getParent().getLeft() != r4) goto L11;
        r4.getParent().setLeft(r0);
        goto L12
    L11:
        r4.getParent().setRight(r0);
        goto L12
    }

    private final void rotateRight(IntervalTree<T>.Node r4) {
        IntervalTree<T>.Node r0 = r4.getLeft();
        r4.setLeft(r0.getRight());
        if (r0.getRight() == this.terminator) goto L5;
        r0.getRight().setParent(r4);
    L5:
        r0.setParent(r4.getParent());
        if (r4.getParent() != this.terminator) goto L9;
        this.root = r0;
    L12:
        r0.setRight(r4);
        r4.setParent(r0);
        updateNodeData(r4);
        return;
    L9:
        if (r4.getParent().getRight() != r4) goto L11;
        r4.getParent().setRight(r0);
        goto L12
    L11:
        r4.getParent().setLeft(r0);
        goto L12
    }

    private final void updateNodeData(IntervalTree<T>.Node r5) {
        IntervalTree<T>.Node r0 = r5;
    L4:
        if (r0 == this.terminator) goto L6;
        r0.setMin(Math.min(r0.getStart(), Math.min(r0.getLeft().getMin(), r0.getRight().getMin())));
        r0.setMax(Math.max(r0.getEnd(), Math.max(r0.getLeft().getMax(), r0.getRight().getMax())));
        r0 = r0.getParent();
        goto L4
    }
}
