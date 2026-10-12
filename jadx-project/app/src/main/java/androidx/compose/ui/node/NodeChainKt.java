package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000\u001a \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0002\u001a$\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\u0011*\u00020\u0012*\b\u0012\u0004\u0012\u0002H\u00110\u00132\u0006\u0010\u0014\u001a\u00020\u0012H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0015"}, d2 = {"ActionReplace", "", "ActionReuse", "ActionUpdate", "SentinelHead", "androidx/compose/ui/node/NodeChainKt$SentinelHead$1", "Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;", "actionForModifiers", "prev", "Landroidx/compose/ui/Modifier$Element;", "next", "fillVector", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier;", "result", "updateUnsafe", "", "T", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ModifierNodeElement;", "node", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NodeChainKt {
    private static final int ActionReplace = 0;
    private static final int ActionReuse = 2;
    private static final int ActionUpdate = 1;
    private static final NodeChainKt$SentinelHead$1 SentinelHead = null;

    public static final /* synthetic */ MutableVector access$fillVector(Modifier $receiver, MutableVector result) {
        return fillVector($receiver, result);
    }

    public static final /* synthetic */ NodeChainKt$SentinelHead$1 access$getSentinelHead$p() {
        return SentinelHead;
    }

    public static final /* synthetic */ void access$updateUnsafe(ModifierNodeElement $receiver, Modifier.Node node) {
        updateUnsafe($receiver, node);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.node.NodeChainKt$SentinelHead$1] */
    static {
        ?? r0 = new NodeChainKt$SentinelHead$1();
        r0.setAggregateChildKindSet$ui_release(-1);
        SentinelHead = r0;
    }

    public static final int actionForModifiers(Modifier.Element prev, Modifier.Element next) {
        if (Intrinsics.areEqual(prev, next) == false) goto L6;
        return 2;
    L6:
        if (Actual_jvmKt.areObjectsOfSameType(prev, next) == false) goto L8;
        return 1;
    L8:
        return 0;
    }

    private static final <T extends Modifier.Node> void updateUnsafe(ModifierNodeElement<T> r1, Modifier.Node node) {
        Intrinsics.checkNotNull(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        r1.update(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final MutableVector<Modifier.Element> fillVector(Modifier $this$fillVector, final MutableVector<Modifier.Element> r9) {
        int capacity = RangesKt.coerceAtLeast(r9.getSize(), 16);
        MutableVector stack = new MutableVector(new Modifier[capacity], 0);
        stack.add($this$fillVector);
        Function1<Modifier.Element, Boolean> r1 = null;
    L4:
        if (stack.getSize() == 0) goto L6;
        boolean r3 = true;
    L7:
        if (r3 == false) goto L19;
        Modifier next = (Modifier) stack.removeAt(stack.getSize() - 1);
        if ((next instanceof CombinedModifier) == true) goto L10;
        if ((next instanceof Modifier.Element) == true) goto L13;
        if (r1 != null) goto L17;
        Function1<Modifier.Element, Boolean> r5 = new AnonymousClass1(r9);
        Function1<Modifier.Element, Boolean> r6 = r5;
        r1 = r5;
    L18:
        next.all(r1);
        r1 = r6;
        goto L4
    L17:
        r6 = r1;
        goto L18
    L13:
        r9.add(next);
        goto L4
    L10:
        stack.add(((CombinedModifier) next).getInner$ui_release());
        stack.add(((CombinedModifier) next).getOuter$ui_release());
        goto L4
    L19:
        return r9;
    L6:
        r3 = false;
        goto L7
    }
}
