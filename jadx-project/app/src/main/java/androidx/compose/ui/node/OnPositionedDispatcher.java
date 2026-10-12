package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnPositionedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher;", "", "()V", "cachedNodes", "", "Landroidx/compose/ui/node/LayoutNode;", "[Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "Landroidx/compose/runtime/collection/MutableVector;", "dispatch", "", "dispatchHierarchy", "layoutNode", "isNotEmpty", "", "onNodePositioned", "node", "onRootNodePositioned", "rootNode", "remove", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnPositionedDispatcher {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final int MinArraySize = 16;
    private LayoutNode[] cachedNodes;
    private final MutableVector<LayoutNode> layoutNodes;

    /* JADX INFO: compiled from: OnPositionedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher$Companion;", "", "()V", "MinArraySize", "", "DepthComparator", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: OnPositionedDispatcher.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher$Companion$DepthComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class DepthComparator implements Comparator<LayoutNode> {
            public static final DepthComparator INSTANCE = null;

            static {
                INSTANCE = new DepthComparator();
            }

            private DepthComparator() {
            }

            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(LayoutNode r3, LayoutNode r4) {
                return compare2(r3, r4);
            }

            /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
            public int compare2(LayoutNode a, LayoutNode b) {
                int depthDiff = Intrinsics.compare(b.getDepth$ui_release(), a.getDepth$ui_release());
                if (depthDiff == 0) goto L6;
                return depthDiff;
            L6:
                return Intrinsics.compare(a.hashCode(), b.hashCode());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public OnPositionedDispatcher() {
        this.layoutNodes = new MutableVector(new LayoutNode[16], 0);
    }

    public final boolean isNotEmpty() {
        if (this.layoutNodes.getSize() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void onNodePositioned(LayoutNode node) {
        this.layoutNodes.add(node);
        node.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void remove(LayoutNode node) {
        this.layoutNodes.remove(node);
    }

    public final void onRootNodePositioned(LayoutNode rootNode) {
        this.layoutNodes.clear();
        this.layoutNodes.add(rootNode);
        rootNode.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void dispatch() {
        this.layoutNodes.sortWith(Companion.DepthComparator.INSTANCE);
        int size = this.layoutNodes.getSize();
        LayoutNode[] cachedNodes = this.cachedNodes;
        if (cachedNodes != null) goto L5;
    L8:
        LayoutNode[] cache = new LayoutNode[Math.max(16, this.layoutNodes.getSize())];
    L9:
        this.cachedNodes = null;
        int i = 0;
    L10:
        if (i >= size) goto L12;
        cache[i] = this.layoutNodes.content[i];
        i = i + 1;
        goto L10
    L12:
        this.layoutNodes.clear();
        int i2 = size - 1;
    L14:
        if ((-1) >= i2) goto L19;
        LayoutNode layoutNode = cache[i2];
        Intrinsics.checkNotNull(layoutNode);
        if (layoutNode.getNeedsOnPositionedDispatch$ui_release() == false) goto L18;
        dispatchHierarchy(layoutNode);
    L18:
        i2 = i2 - 1;
        goto L14
    L19:
        this.cachedNodes = cache;
        return;
    L5:
        if (cachedNodes.length < size) goto L8;
        cache = cachedNodes;
        goto L9
    }

    private final void dispatchHierarchy(LayoutNode layoutNode) {
        layoutNode.dispatchOnPositionedCallbacks$ui_release();
        layoutNode.setNeedsOnPositionedDispatch$ui_release(false);
        MutableVector<LayoutNode> r2 = layoutNode.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L6;
        LayoutNode child = (LayoutNode) content$iv$iv[i$iv$iv];
        dispatchHierarchy(child);
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }
}
