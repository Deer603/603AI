package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0002klB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0010H\u0002J?\u0010+\u001a\u0004\u0018\u0001H,\"\u0006\b\u0000\u0010,\u0018\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u0002H,0.2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u00020\u001900H\u0080\bø\u0001\u0000¢\u0006\u0004\b1\u00102J@\u00103\u001a\u00060\rR\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00062\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u00107\u001a\u00020\u0019H\u0002J\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09J\u001e\u0010;\u001a\u00020\u00192\n\u0010-\u001a\u0006\u0012\u0002\b\u00030.H\u0000ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0015\u0010;\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u0006H\u0000¢\u0006\u0002\b?J+\u0010\u0011\u001a\u0004\u0018\u0001H,\"\u0006\b\u0000\u0010,\u0018\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u0002H,0.H\u0080\bø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\"\u0010B\u001a\u00020C2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020C00H\u0080\b¢\u0006\u0002\bDJ=\u0010B\u001a\u00020C\"\u0006\b\u0000\u0010,\u0018\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u0002H,0.2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u00020C00H\u0080\bø\u0001\u0000¢\u0006\u0004\bE\u0010FJ*\u0010B\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00062\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020C00H\u0080\b¢\u0006\u0002\bDJ\"\u0010G\u001a\u00020C2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020C00H\u0080\b¢\u0006\u0002\bHJ\u0018\u0010I\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0006\u0010J\u001a\u00020CJ\r\u0010K\u001a\u00020CH\u0000¢\u0006\u0002\bLJ\b\u0010M\u001a\u00020\u0010H\u0002J\u0018\u0010N\u001a\u00020C2\u0006\u0010O\u001a\u00020\u00102\u0006\u0010P\u001a\u00020 H\u0002J\u0010\u0010Q\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0010H\u0002J\r\u0010R\u001a\u00020CH\u0000¢\u0006\u0002\bSJ\u0006\u0010T\u001a\u00020CJ\r\u0010U\u001a\u00020CH\u0000¢\u0006\u0002\bVJ<\u0010W\u001a\u00020C2\u0006\u00104\u001a\u00020\u00062\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010$\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0019H\u0002J\b\u0010X\u001a\u00020CH\u0002J\u0006\u0010Y\u001a\u00020CJ+\u0010$\u001a\u0004\u0018\u0001H,\"\u0006\b\u0000\u0010,\u0018\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u0002H,0.H\u0080\bø\u0001\u0000¢\u0006\u0004\bZ\u0010AJ\"\u0010[\u001a\u00020C2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020C00H\u0080\b¢\u0006\u0002\b\\J=\u0010[\u001a\u00020C\"\u0006\b\u0000\u0010,\u0018\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u0002H,0.2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u00020C00H\u0080\bø\u0001\u0000¢\u0006\u0004\b]\u0010FJ*\u0010[\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00062\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020C00H\u0080\b¢\u0006\u0002\b\\J\b\u0010^\u001a\u00020_H\u0016J\u0010\u0010`\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\u0010H\u0002J\u0015\u0010b\u001a\u00020C2\u0006\u0010c\u001a\u00020dH\u0000¢\u0006\u0002\beJ \u0010f\u001a\u00020C2\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010h\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0010H\u0002J\u0017\u0010i\u001a\u00020C2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0002\bjR\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0018\u00010\rR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020 @BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006m"}, d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "aggregateChildKindSet", "", "getAggregateChildKindSet", "()I", "buffer", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "cachedDiffer", "Landroidx/compose/ui/node/NodeChain$Differ;", "current", "<set-?>", "Landroidx/compose/ui/Modifier$Node;", "head", "getHead$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "innerCoordinator", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "isUpdating", "", "isUpdating$ui_release", "()Z", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "logger", "Landroidx/compose/ui/node/NodeChain$Logger;", "Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "getOuterCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "tail", "getTail$ui_release", "createAndInsertNodeAsChild", "element", "parent", "detachAndRemoveNode", "node", "firstFromHead", "T", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/node/NodeKind;", "block", "Lkotlin/Function1;", "firstFromHead-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getDiffer", "offset", "before", "after", "shouldAttachOnInsert", "getModifierInfo", "", "Landroidx/compose/ui/layout/ModifierInfo;", "has", "has-H91voCI$ui_release", "(I)Z", "mask", "has$ui_release", "head-H91voCI$ui_release", "(I)Ljava/lang/Object;", "headToTail", "", "headToTail$ui_release", "headToTail-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "headToTailExclusive", "headToTailExclusive$ui_release", "insertChild", "markAsAttached", "markAsDetached", "markAsDetached$ui_release", "padChain", "propagateCoordinator", "start", "coordinator", "removeNode", "resetState", "resetState$ui_release", "runAttachLifecycle", "runDetachLifecycle", "runDetachLifecycle$ui_release", "structuralUpdate", "syncAggregateChildKindSet", "syncCoordinators", "tail-H91voCI$ui_release", "tailToHead", "tailToHead$ui_release", "tailToHead-aLcG6gQ$ui_release", "toString", "", "trimChain", "paddedHead", "updateFrom", "m", "Landroidx/compose/ui/Modifier;", "updateFrom$ui_release", "updateNode", "prev", "next", "useLogger", "useLogger$ui_release", "Differ", "Logger", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NodeChain {
    public static final int $stable = 0;
    private MutableVector<Modifier.Element> buffer;
    private Differ cachedDiffer;
    private MutableVector<Modifier.Element> current;
    private Modifier.Node head;
    private final InnerNodeCoordinator innerCoordinator;
    private final LayoutNode layoutNode;
    private Logger logger;
    private NodeCoordinator outerCoordinator;
    private final Modifier.Node tail;

    /* JADX INFO: compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010!\u001a\u00020\u0005H\u0016J\u0018\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0016J\u0018\u0010&\u001a\u00020#2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006'"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/DiffCallback;", "node", "Landroidx/compose/ui/Modifier$Node;", "offset", "", "before", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "after", "shouldAttachOnInsert", "", "(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)V", "getAfter", "()Landroidx/compose/runtime/collection/MutableVector;", "setAfter", "(Landroidx/compose/runtime/collection/MutableVector;)V", "getBefore", "setBefore", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "setNode", "(Landroidx/compose/ui/Modifier$Node;)V", "getOffset", "()I", "setOffset", "(I)V", "getShouldAttachOnInsert", "()Z", "setShouldAttachOnInsert", "(Z)V", "areItemsTheSame", "oldIndex", "newIndex", "insert", "", "remove", "atIndex", "same", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class Differ implements DiffCallback {
        private MutableVector<Modifier.Element> after;
        private MutableVector<Modifier.Element> before;
        private Modifier.Node node;
        private int offset;
        private boolean shouldAttachOnInsert;
        final /* synthetic */ NodeChain this$0;

        public Differ(NodeChain this$0, Modifier.Node node, int offset, MutableVector<Modifier.Element> r4, MutableVector<Modifier.Element> r5, boolean shouldAttachOnInsert) {
            this.this$0 = this$0;
            this.node = node;
            this.offset = offset;
            this.before = r4;
            this.after = r5;
            this.shouldAttachOnInsert = shouldAttachOnInsert;
        }

        public final Modifier.Node getNode() {
            return this.node;
        }

        public final void setNode(Modifier.Node r1) {
            this.node = r1;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final void setOffset(int r1) {
            this.offset = r1;
        }

        public final MutableVector<Modifier.Element> getBefore() {
            return this.before;
        }

        public final void setBefore(MutableVector<Modifier.Element> r1) {
            this.before = r1;
        }

        public final MutableVector<Modifier.Element> getAfter() {
            return this.after;
        }

        public final void setAfter(MutableVector<Modifier.Element> r1) {
            this.after = r1;
        }

        public final boolean getShouldAttachOnInsert() {
            return this.shouldAttachOnInsert;
        }

        public final void setShouldAttachOnInsert(boolean r1) {
            this.shouldAttachOnInsert = r1;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public boolean areItemsTheSame(int oldIndex, int newIndex) {
            MutableVector<Modifier.Element> r0 = this.before;
            int index$iv = this.offset + oldIndex;
            Modifier.Element r1 = r0.content[index$iv];
            MutableVector<Modifier.Element> r2 = this.after;
            int index$iv2 = this.offset + newIndex;
            if (NodeChainKt.actionForModifiers(r1, r2.content[index$iv2]) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void insert(int newIndex) {
            int index = this.offset + newIndex;
            Modifier.Node parent = this.node;
            this.node = NodeChain.access$createAndInsertNodeAsChild(this.this$0, this.after.content[index], parent);
            Logger r1 = NodeChain.access$getLogger$p(this.this$0);
            if (r1 == null) goto L5;
            r1.nodeInserted(index, index, this.after.content[index], parent, this.node);
        L5:
            boolean r0 = this.shouldAttachOnInsert;
            Modifier.Node r2 = this.node;
            if (r0 == false) goto L12;
            Modifier.Node r3 = r2.getChild$ui_release();
            Intrinsics.checkNotNull(r3);
            NodeCoordinator childCoordinator = r3.getCoordinator$ui_release();
            Intrinsics.checkNotNull(childCoordinator);
            LayoutModifierNode layoutmod = DelegatableNodeKt.asLayoutModifierNode(this.node);
            if (layoutmod == null) goto L10;
            LayoutModifierNodeCoordinator thisCoordinator = new LayoutModifierNodeCoordinator(this.this$0.getLayoutNode(), layoutmod);
            this.node.updateCoordinator$ui_release(thisCoordinator);
            NodeChain.access$propagateCoordinator(this.this$0, this.node, thisCoordinator);
            thisCoordinator.setWrappedBy$ui_release(childCoordinator.getWrappedBy$ui_release());
            thisCoordinator.setWrapped$ui_release(childCoordinator);
            childCoordinator.setWrappedBy$ui_release(thisCoordinator);
        L11:
            this.node.markAsAttached$ui_release();
            this.node.runAttachLifecycle$ui_release();
            NodeKindKt.autoInvalidateInsertedNode(this.node);
            return;
        L10:
            this.node.updateCoordinator$ui_release(childCoordinator);
            goto L11
        L12:
            r2.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void remove(int atIndex, int oldIndex) {
            Modifier.Node toRemove = this.node.getChild$ui_release();
            Intrinsics.checkNotNull(toRemove);
            Logger r1 = NodeChain.access$getLogger$p(this.this$0);
            if (r1 == null) goto L5;
            MutableVector<Modifier.Element> r2 = this.before;
            int index$iv = this.offset + oldIndex;
            r1.nodeRemoved(oldIndex, r2.content[index$iv], toRemove);
        L5:
            int r3 = NodeKind.m5976constructorimpl(2);
            if ((toRemove.getKindSet$ui_release() & r3) == 0) goto L8;
            boolean r4 = true;
        L9:
            if (r4 == false) goto L15;
            NodeCoordinator removedCoordinator = toRemove.getCoordinator$ui_release();
            Intrinsics.checkNotNull(removedCoordinator);
            NodeCoordinator parentCoordinator = removedCoordinator.getWrappedBy$ui_release();
            NodeCoordinator childCoordinator = removedCoordinator.getWrapped$ui_release();
            Intrinsics.checkNotNull(childCoordinator);
            if (parentCoordinator == null) goto L14;
            parentCoordinator.setWrapped$ui_release(childCoordinator);
        L14:
            childCoordinator.setWrappedBy$ui_release(parentCoordinator);
            NodeChain.access$propagateCoordinator(this.this$0, this.node, childCoordinator);
        L15:
            this.node = NodeChain.access$detachAndRemoveNode(this.this$0, toRemove);
            return;
        L8:
            r4 = false;
            goto L9
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void same(int oldIndex, int newIndex) {
            Modifier.Node r0 = this.node.getChild$ui_release();
            Intrinsics.checkNotNull(r0);
            this.node = r0;
            MutableVector<Modifier.Element> r1 = this.before;
            int index$iv = this.offset + oldIndex;
            Modifier.Element prev = r1.content[index$iv];
            MutableVector<Modifier.Element> r2 = this.after;
            int index$iv2 = this.offset + newIndex;
            Modifier.Element next = r2.content[index$iv2];
            boolean r3 = Intrinsics.areEqual(prev, next);
            NodeChain r4 = this.this$0;
            if (r3 == true) goto L7;
            NodeChain.access$updateNode(r4, prev, next, this.node);
            Logger r5 = NodeChain.access$getLogger$p(this.this$0);
            if (r5 == null) goto L11;
            r5.nodeUpdated(this.offset + oldIndex, this.offset + newIndex, prev, next, this.node);
            return;
        L11:
            return;
        L7:
            Logger r6 = NodeChain.access$getLogger$p(r4);
            if (r6 == null) goto L13;
            r6.nodeReused(this.offset + oldIndex, this.offset + newIndex, prev, next, this.node);
            return;
        }
    }

    /* JADX INFO: compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "linearDiffAborted", "", "index", "", "prev", "Landroidx/compose/ui/Modifier$Element;", "next", "node", "Landroidx/compose/ui/Modifier$Node;", "nodeInserted", "atIndex", "newIndex", "element", "child", "inserted", "nodeRemoved", "oldIndex", "nodeReused", "nodeUpdated", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Logger {
        void linearDiffAborted(int r1, Modifier.Element r2, Modifier.Element r3, Modifier.Node r4);

        void nodeInserted(int r1, int r2, Modifier.Element r3, Modifier.Node r4, Modifier.Node r5);

        void nodeRemoved(int r1, Modifier.Element r2, Modifier.Node r3);

        void nodeReused(int r1, int r2, Modifier.Element r3, Modifier.Element r4, Modifier.Node r5);

        void nodeUpdated(int r1, int r2, Modifier.Element r3, Modifier.Element r4, Modifier.Node r5);
    }

    static {
        $stable = 8;
    }

    public NodeChain(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        this.innerCoordinator = new InnerNodeCoordinator(this.layoutNode);
        this.outerCoordinator = this.innerCoordinator;
        this.tail = this.innerCoordinator.getTail();
        this.head = this.tail;
    }

    public static final /* synthetic */ Modifier.Node access$createAndInsertNodeAsChild(NodeChain $this, Modifier.Element element, Modifier.Node parent) {
        return $this.createAndInsertNodeAsChild(element, parent);
    }

    public static final /* synthetic */ Modifier.Node access$detachAndRemoveNode(NodeChain $this, Modifier.Node node) {
        return $this.detachAndRemoveNode(node);
    }

    public static final /* synthetic */ int access$getAggregateChildKindSet(NodeChain $this) {
        return $this.getAggregateChildKindSet();
    }

    public static final /* synthetic */ Logger access$getLogger$p(NodeChain $this) {
        return $this.logger;
    }

    public static final /* synthetic */ void access$propagateCoordinator(NodeChain $this, Modifier.Node start, NodeCoordinator coordinator) {
        $this.propagateCoordinator(start, coordinator);
    }

    public static final /* synthetic */ void access$updateNode(NodeChain $this, Modifier.Element prev, Modifier.Element next, Modifier.Node node) {
        $this.updateNode(prev, next, node);
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final InnerNodeCoordinator getInnerCoordinator$ui_release() {
        return this.innerCoordinator;
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.outerCoordinator;
    }

    public final Modifier.Node getTail$ui_release() {
        return this.tail;
    }

    public final Modifier.Node getHead$ui_release() {
        return this.head;
    }

    public final boolean isUpdating$ui_release() {
        if (NodeChainKt.access$getSentinelHead$p().getChild$ui_release() == null) goto L5;
        return true;
    L5:
        return false;
    }

    private final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet$ui_release();
    }

    public final void useLogger$ui_release(Logger logger) {
        this.logger = logger;
    }

    private final Modifier.Node padChain() {
        if (this.head == NodeChainKt.access$getSentinelHead$p()) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("padChain called on already padded chain");
    L9:
        Modifier.Node currentHead = this.head;
        currentHead.setParent$ui_release(NodeChainKt.access$getSentinelHead$p());
        NodeChainKt.access$getSentinelHead$p().setChild$ui_release(currentHead);
        return NodeChainKt.access$getSentinelHead$p();
    L5:
        value$iv = false;
        goto L7
    }

    private final Modifier.Node trimChain(Modifier.Node paddedHead) {
        boolean value$iv = true;
        if (paddedHead != NodeChainKt.access$getSentinelHead$p()) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("trimChain called on already trimmed chain");
    L9:
        Modifier.Node result = NodeChainKt.access$getSentinelHead$p().getChild$ui_release();
        if (result != null) goto L12;
        result = this.tail;
    L12:
        result.setParent$ui_release(null);
        NodeChainKt.access$getSentinelHead$p().setChild$ui_release(null);
        NodeChainKt.access$getSentinelHead$p().setAggregateChildKindSet$ui_release(-1);
        NodeChainKt.access$getSentinelHead$p().updateCoordinator$ui_release(null);
        if (result != NodeChainKt.access$getSentinelHead$p()) goto L17;
        value$iv = false;
    L17:
        if (value$iv == true) goto L20;
        InlineClassHelperKt.throwIllegalStateException("trimChain did not update the head");
    L20:
        return result;
    L5:
        value$iv2 = false;
        goto L7
    }

    public final void updateFrom$ui_release(Modifier m) {
        boolean coordinatorSyncNeeded = false;
        Modifier.Node paddedHead = padChain();
        MutableVector<Modifier.Element> r2 = this.current;
        if (r2 == null) goto L5;
        int r4 = r2.getSize();
    L6:
        int beforeSize = r4;
        MutableVector<Modifier.Element> r5 = this.buffer;
        if (r5 != null) goto L9;
        r5 = new MutableVector(new Modifier.Element[16], 0);
    L9:
        MutableVector<Modifier.Element> r6 = NodeChainKt.access$fillVector(m, r5);
        int i = 0;
        MutableVector<Modifier.Element> r10 = null;
        if (r6.getSize() != beforeSize) goto L47;
        Modifier.Node node = paddedHead.getChild$ui_release();
        int i2 = 0;
    L12:
        if (node == null) goto L34;
        if (i2 >= beforeSize) goto L34;
        if (r2 == null) goto L32;
        Modifier.Element prev = r2.content[i2];
        Modifier.Element next = r6.content[i2];
        switch(NodeChainKt.actionForModifiers(prev, next)) {
            case 0: goto L27;
            case 1: goto L23;
            case 2: goto L19;
            default: goto L18;
        };
    L18:
        Modifier.Node node2 = node;
    L31:
        node = node2.getChild$ui_release();
        i2 = i2 + 1;
        goto L12
    L19:
        Logger r12 = this.logger;
        if (r12 == null) goto L22;
        r12.nodeReused(i2, i2, prev, next, node);
        node2 = node;
        goto L31
    L22:
        node2 = node;
        goto L31
    L23:
        Modifier.Node node3 = node;
        updateNode(prev, next, node3);
        Logger r13 = this.logger;
        if (r13 == null) goto L26;
        r13.nodeUpdated(i2, i2, prev, next, node3);
        node2 = node3;
        goto L31
    L26:
        node2 = node3;
        goto L31
    L27:
        Modifier.Node node4 = node;
        Logger r9 = this.logger;
        if (r9 == null) goto L30;
        r9.linearDiffAborted(i2, prev, next, node4);
    L30:
        Modifier.Node node5 = node4.getParent$ui_release();
    L35:
        if (i2 < beforeSize) goto L37;
        MutableVector<Modifier.Element> r3 = r6;
        Modifier.Node node6 = paddedHead;
    L81:
        this.current = r3;
        if (r2 == null) goto L84;
        r2.clear();
        r10 = r2;
    L84:
        this.buffer = r10;
        this.head = trimChain(node6);
        if (coordinatorSyncNeeded == false) goto L104;
        syncCoordinators();
        return;
    L104:
        return;
    L37:
        if (r2 != null) goto L39;
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
        throw new KotlinNothingValueException();
    L39:
        if (node5 == null) goto L41;
        r3 = r6;
        structuralUpdate(i2, r2, r3, node5, !this.layoutNode.getApplyingModifierOnAttach$ui_release());
        node6 = paddedHead;
        coordinatorSyncNeeded = true;
        goto L81
    L41:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("structuralUpdate requires a non-null tail");
        throw new KotlinNothingValueException();
    L32:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
        throw new KotlinNothingValueException();
    L34:
        node5 = node;
        goto L35
    L47:
        if (this.layoutNode.getApplyingModifierOnAttach$ui_release() == false) goto L58;
        if (beforeSize != 0) goto L58;
        coordinatorSyncNeeded = true;
        Modifier.Node node7 = paddedHead;
        int i3 = 0;
    L51:
        if (i3 >= r6.getSize()) goto L56;
        Modifier.Element next2 = r6.content[i3];
        Modifier.Node parent = node7;
        Modifier.Node node8 = createAndInsertNodeAsChild(next2, parent);
        Logger r11 = this.logger;
        if (r11 == null) goto L55;
        r11.nodeInserted(0, i3, next2, parent, node8);
    L55:
        i3 = i3 + 1;
        node7 = node8;
        goto L51
    L56:
        syncAggregateChildKindSet();
        r3 = r6;
        node6 = paddedHead;
    L58:
        if (r6.getSize() != 0) goto L77;
        if (r2 == null) goto L74;
        Modifier.Node node9 = paddedHead.getChild$ui_release();
    L62:
        if (node9 == null) goto L69;
        if (i >= r2.getSize()) goto L69;
        Logger r7 = this.logger;
        if (r7 == null) goto L68;
        r7.nodeRemoved(i, r2.content[i], node9);
    L68:
        node9 = detachAndRemoveNode(node9).getChild$ui_release();
        i = i + 1;
    L69:
        InnerNodeCoordinator r8 = this.innerCoordinator;
        LayoutNode r14 = this.layoutNode.getParent$ui_release();
        if (r14 == null) goto L72;
        NodeCoordinator r15 = r14.getInnerCoordinator$ui_release();
    L73:
        r8.setWrappedBy$ui_release(r15);
        this.outerCoordinator = this.innerCoordinator;
        r3 = r6;
        node6 = paddedHead;
        goto L81
    L72:
        r15 = null;
        goto L73
    L74:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
        throw new KotlinNothingValueException();
    L77:
        if (r2 != null) goto L79;
        MutableVector<Modifier.Element> r16 = new MutableVector(new Modifier.Element[16], 0);
    L80:
        r2 = r16;
        r3 = r6;
        node6 = paddedHead;
        structuralUpdate(0, r2, r3, node6, !this.layoutNode.getApplyingModifierOnAttach$ui_release());
        coordinatorSyncNeeded = true;
        goto L81
    L79:
        r16 = r2;
        goto L80
    L5:
        r4 = 0;
        goto L6
    }

    public final void resetState$ui_release() {
        Modifier.Node node$iv = getTail$ui_release();
    L3:
        if (node$iv == null) goto L8;
        Modifier.Node it = node$iv;
        if (it.isAttached() == false) goto L7;
        it.reset$ui_release();
    L7:
        node$iv = node$iv.getParent$ui_release();
        goto L3
    L8:
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void syncCoordinators() {
        NodeCoordinator coordinator = this.innerCoordinator;
        Modifier.Node node = this.tail.getParent$ui_release();
    L3:
        if (node == null) goto L16;
        LayoutModifierNode layoutmod = DelegatableNodeKt.asLayoutModifierNode(node);
        if (layoutmod != null) goto L7;
        node.updateCoordinator$ui_release(coordinator);
    L15:
        node = node.getParent$ui_release();
        goto L3
    L7:
        if (node.getCoordinator$ui_release() == null) goto L12;
        NodeCoordinator r3 = node.getCoordinator$ui_release();
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
        LayoutModifierNodeCoordinator c = (LayoutModifierNodeCoordinator) r3;
        LayoutModifierNode prevNode = c.getLayoutModifierNode();
        c.setLayoutModifierNode$ui_release(layoutmod);
        if (prevNode == node) goto L13;
        c.onLayoutModifierNodeChanged();
    L13:
        coordinator.setWrappedBy$ui_release(c);
        c.setWrapped$ui_release(coordinator);
        NodeCoordinator coordinator2 = c;
        coordinator = coordinator2;
        goto L15
    L12:
        c = new LayoutModifierNodeCoordinator(this.layoutNode, layoutmod);
        node.updateCoordinator$ui_release(c);
        goto L13
    L16:
        LayoutNode r2 = this.layoutNode.getParent$ui_release();
        if (r2 == null) goto L19;
        NodeCoordinator r4 = r2.getInnerCoordinator$ui_release();
    L20:
        coordinator.setWrappedBy$ui_release(r4);
        this.outerCoordinator = coordinator;
        return;
    L19:
        r4 = null;
        goto L20
    }

    private final void syncAggregateChildKindSet() {
        Modifier.Node node = this.tail.getParent$ui_release();
        int aggregateChildKindSet = 0;
    L3:
        if (node == null) goto L7;
        if (node == NodeChainKt.access$getSentinelHead$p()) goto L10;
        aggregateChildKindSet = aggregateChildKindSet | node.getKindSet$ui_release();
        node.setAggregateChildKindSet$ui_release(aggregateChildKindSet);
        node = node.getParent$ui_release();
        goto L3
    L10:
        return;
    }

    public final void markAsAttached() {
        Modifier.Node node$iv = getHead$ui_release();
    L3:
        if (node$iv == null) goto L6;
        Modifier.Node it = node$iv;
        it.markAsAttached$ui_release();
        node$iv = node$iv.getChild$ui_release();
        goto L3
    }

    public final void runAttachLifecycle() {
        NodeCoordinator coordinator = this.outerCoordinator;
        InnerNodeCoordinator innerCoordinator = this.innerCoordinator;
    L3:
        if (coordinator == innerCoordinator) goto L5;
        coordinator.onAttach();
        NodeCoordinator r2 = coordinator.getWrapped$ui_release();
        Intrinsics.checkNotNull(r2);
        coordinator = r2;
        goto L3
    L5:
        innerCoordinator.onAttach();
        Modifier.Node node$iv = getHead$ui_release();
    L6:
        if (node$iv == null) goto L15;
        Modifier.Node it = node$iv;
        it.runAttachLifecycle$ui_release();
        if (it.getInsertedNodeAwaitingAttachForInvalidation$ui_release() == false) goto L11;
        NodeKindKt.autoInvalidateInsertedNode(it);
    L11:
        if (it.getUpdatedNodeAwaitingAttachForInvalidation$ui_release() == false) goto L13;
        NodeKindKt.autoInvalidateUpdatedNode(it);
    L13:
        it.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
        it.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        node$iv = node$iv.getChild$ui_release();
        goto L6
    }

    public final List<ModifierInfo> getModifierInfo() {
        NodeChain r0 = this;
        MutableVector<Modifier.Element> r1 = r0.current;
        if (r1 == null) goto L5;
        int capacity$iv = r1.getSize();
        MutableVector infoList = new MutableVector(new ModifierInfo[capacity$iv], 0);
        int i = 0;
        Modifier.Node node$iv = getHead$ui_release();
    L7:
        if (node$iv == null) goto L29;
        if (node$iv == getTail$ui_release()) goto L29;
        Modifier.Node node = node$iv;
        NodeCoordinator coordinator = node.getCoordinator$ui_release();
        if (coordinator == null) goto L27;
        OwnedLayer currentNodeLayer = coordinator.getLayer();
        OwnedLayer innerNodeLayer = r0.innerCoordinator.getLayer();
        Modifier.Node localChild = node.getChild$ui_release();
        if (localChild == r0.tail) goto L15;
    L17:
        boolean r2 = false;
    L18:
        if (r2 == true) goto L22;
        innerNodeLayer = null;
    L22:
        if (currentNodeLayer != null) goto L24;
        OwnedLayer layer = innerNodeLayer;
    L25:
        int i2 = i + 1;
        MutableVector<Modifier.Element> r16 = r1;
        infoList.add(new ModifierInfo(r1.content[i], coordinator, layer));
        node$iv = node$iv.getChild$ui_release();
        r0 = this;
        i = i2;
        r1 = r16;
        goto L7
    L24:
        layer = currentNodeLayer;
        goto L25
    L15:
        if (node.getCoordinator$ui_release() == localChild.getCoordinator$ui_release()) goto L17;
        r2 = true;
        goto L18
    L27:
        throw new IllegalArgumentException("getModifierInfo called on node with no coordinator".toString());
    L29:
        return infoList.asMutableList();
    L5:
        return CollectionsKt.emptyList();
    }

    public final void markAsDetached$ui_release() {
        Modifier.Node node$iv = getTail$ui_release();
    L3:
        if (node$iv == null) goto L9;
        Modifier.Node it = node$iv;
        if (it.isAttached() == false) goto L7;
        it.markAsDetached$ui_release();
    L7:
        node$iv = node$iv.getParent$ui_release();
        goto L3
    }

    public final void runDetachLifecycle$ui_release() {
        Modifier.Node node$iv = getTail$ui_release();
    L3:
        if (node$iv == null) goto L8;
        Modifier.Node it = node$iv;
        if (it.isAttached() == false) goto L7;
        it.runDetachLifecycle$ui_release();
    L7:
        node$iv = node$iv.getParent$ui_release();
        goto L3
    L8:
        InnerNodeCoordinator coordinator = this.innerCoordinator;
        NodeCoordinator outerCoordinator = this.outerCoordinator;
    L9:
        if (coordinator == outerCoordinator) goto L11;
        coordinator.onDetach();
        NodeCoordinator r2 = coordinator.getWrappedBy$ui_release();
        Intrinsics.checkNotNull(r2);
        coordinator = r2;
        goto L9
    L11:
        outerCoordinator.onDetach();
    }

    private final Differ getDiffer(Modifier.Node head, int offset, MutableVector<Modifier.Element> r11, MutableVector<Modifier.Element> r12, boolean shouldAttachOnInsert) {
        Differ current = this.cachedDiffer;
        if (current != null) goto L5;
        Differ it = new Differ(this, head, offset, r11, r12, shouldAttachOnInsert);
        this.cachedDiffer = it;
        return it;
    L5:
        current.setNode(head);
        current.setOffset(offset);
        current.setBefore(r11);
        current.setAfter(r12);
        current.setShouldAttachOnInsert(shouldAttachOnInsert);
        return current;
    }

    private final void propagateCoordinator(Modifier.Node start, NodeCoordinator coordinator) {
        Modifier.Node node = start.getParent$ui_release();
    L3:
        if (node == null) goto L21;
        if (node == NodeChainKt.access$getSentinelHead$p()) goto L6;
        int r1 = NodeKind.m5976constructorimpl(2);
        Modifier.Node this_$iv = node;
        if ((this_$iv.getKindSet$ui_release() & r1) == 0) goto L14;
        boolean r4 = true;
    L15:
        if (r4 == true) goto L22;
        node.updateCoordinator$ui_release(coordinator);
        node = node.getParent$ui_release();
        goto L3
    L22:
        return;
    L14:
        r4 = false;
        goto L15
    L6:
        LayoutNode r2 = this.layoutNode.getParent$ui_release();
        if (r2 == null) goto L9;
        NodeCoordinator r3 = r2.getInnerCoordinator$ui_release();
    L10:
        coordinator.setWrappedBy$ui_release(r3);
        this.outerCoordinator = coordinator;
        return;
    L9:
        r3 = null;
        goto L10
    }

    private final void structuralUpdate(int offset, MutableVector<Modifier.Element> r8, MutableVector<Modifier.Element> r9, Modifier.Node tail, boolean shouldAttachOnInsert) {
        Differ differ = getDiffer(tail, offset, r8, r9, shouldAttachOnInsert);
        MyersDiffKt.executeDiff(r8.getSize() - offset, r9.getSize() - offset, differ);
        syncAggregateChildKindSet();
    }

    private final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.isAttached() == false) goto L6;
        NodeKindKt.autoInvalidateRemovedNode(node);
        node.runDetachLifecycle$ui_release();
        node.markAsDetached$ui_release();
    L6:
        return removeNode(node);
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child = node.getChild$ui_release();
        Modifier.Node parent = node.getParent$ui_release();
        if (child == null) goto L5;
        child.setParent$ui_release(parent);
        node.setChild$ui_release(null);
    L5:
        if (parent == null) goto L7;
        parent.setChild$ui_release(child);
        node.setParent$ui_release(null);
    L7:
        Intrinsics.checkNotNull(parent);
        return parent;
    }

    private final Modifier.Node createAndInsertNodeAsChild(Modifier.Element element, Modifier.Node parent) {
        if ((element instanceof ModifierNodeElement) == false) goto L5;
        BackwardsCompatNode it = ((ModifierNodeElement) element).create();
        it.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(it));
    L6:
        boolean value$iv = !it.isAttached();
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
    L9:
        it.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertChild(it, parent);
    L5:
        it = new BackwardsCompatNode(element);
        goto L6
    }

    private final Modifier.Node insertChild(Modifier.Node node, Modifier.Node parent) {
        Modifier.Node theChild = parent.getChild$ui_release();
        if (theChild == null) goto L5;
        theChild.setParent$ui_release(node);
        node.setChild$ui_release(theChild);
    L5:
        parent.setChild$ui_release(node);
        node.setParent$ui_release(parent);
        return node;
    }

    private final void updateNode(Modifier.Element prev, Modifier.Element next, Modifier.Node node) {
        if ((prev instanceof ModifierNodeElement) == false) goto L11;
        if ((next instanceof ModifierNodeElement) == false) goto L11;
        NodeChainKt.access$updateUnsafe((ModifierNodeElement) next, node);
        if (node.isAttached() == false) goto L9;
        NodeKindKt.autoInvalidateUpdatedNode(node);
        return;
    L9:
        node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
        return;
    L11:
        if ((node instanceof BackwardsCompatNode) == false) goto L16;
        ((BackwardsCompatNode) node).setElement(next);
        if (node.isAttached() == false) goto L15;
        NodeKindKt.autoInvalidateUpdatedNode(node);
        return;
    L15:
        node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
        return;
    L16:
        InlineClassHelperKt.throwIllegalStateException("Unknown Modifier.Node type");
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: firstFromHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m5936firstFromHeadaLcG6gQ$ui_release(int r32, Function1<? super T, Boolean> r33) {
        int r0 = 0;
        NodeChain r1 = this;
        int r2 = 0;
        int r3 = r32;
        NodeChain r4 = r1;
        if ((access$getAggregateChildKindSet(r4) & r3) == 0) goto L63;
        Modifier.Node r8 = r4.getHead$ui_release();
    L5:
        if (r8 == null) goto L81;
        Modifier.Node r9 = r8;
        if ((r9.getKindSet$ui_release() & r3) == 0) goto L57;
        Object r15 = null;
        Object r5 = r9;
    L9:
        if (r5 == null) goto L56;
        r1 = r1;
        r2 = r2;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r5 instanceof Object) == true) goto L12;
        if ((((Modifier.Node) r5).getKindSet$ui_release() & r32) == 0) goto L19;
        int r19 = 1;
    L20:
        if (r19 == 0) goto L54;
        if ((r5 instanceof DelegatingNode) == false) goto L54;
        int r6 = 0;
        Modifier.Node r22 = ((DelegatingNode) r5).getDelegate$ui_release();
    L24:
        if (r22 == null) goto L50;
        Object r23 = r5;
        Modifier.Node r7 = r22;
        if ((r7.getKindSet$ui_release() & r32) == 0) goto L28;
        boolean r25 = true;
    L29:
        if (r25 == false) goto L48;
        r6 = r6 + 1;
        if (r6 != 1) goto L33;
        Object r10 = r7;
        r3 = r3;
        r4 = r4;
    L49:
        r22 = r22.getChild$ui_release();
        r5 = r10;
        r3 = r3;
        r4 = r4;
        goto L24
    L33:
        MutableVector r11 = (MutableVector) r15;
        if (r11 != null) goto L37;
        r11 = new MutableVector(new Modifier.Node[16], 0);
    L37:
        r15 = r11;
        Modifier.Node r12 = (Modifier.Node) r23;
        if (r12 == null) goto L43;
        MutableVector r13 = (MutableVector) r15;
        if (r13 == null) goto L42;
        r13.add(r12);
    L42:
        r10 = null;
    L44:
        MutableVector r14 = (MutableVector) r15;
        if (r14 == null) goto L47;
        r14.add(r7);
    L47:
        r6 = r6;
        goto L49
    L43:
        r10 = r23;
        goto L44
    L48:
        r3 = r3;
        r4 = r4;
        r10 = r23;
        goto L49
    L28:
        r25 = false;
        goto L29
    L50:
        Object r24 = r5;
        int r28 = r3;
        NodeChain r29 = r4;
        if (r6 != 1) goto L55;
        r5 = r24;
        r3 = r28;
        r4 = r29;
    L55:
        r5 = DelegatableNodeKt.access$pop((MutableVector) r15);
        r3 = r28;
        r4 = r29;
    L54:
        r28 = r3;
        r29 = r4;
        goto L55
    L19:
        r19 = 0;
        goto L20
    L12:
        ?? r16 = (Object) r5;
        if (r33.invoke(r16).booleanValue() == true) goto L14;
        r28 = r3;
        r29 = r4;
        goto L55
    L14:
        return r16;
    L56:
        NodeChain r17 = r1;
        int r18 = r2;
        int r210 = r3;
        NodeChain r211 = r4;
    L59:
        if ((r9.getAggregateChildKindSet$ui_release() & r210) == 0) goto L82;
        r8 = r8.getChild$ui_release();
        r0 = r0;
        r1 = r17;
        r2 = r18;
        r3 = r210;
        r4 = r211;
        goto L5
    L82:
        return null;
    L57:
        r17 = r1;
        r18 = r2;
        r210 = r3;
        r211 = r4;
        goto L59
    L81:
        return null;
    L63:
        return null;
    }

    /* JADX INFO: renamed from: headToTail-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m5939headToTailaLcG6gQ$ui_release(int type, Function1<? super T, Unit> r29) {
        int r0 = 0;
        int mask$iv = type;
        NodeChain this_$iv = this;
        int $i$f$headToTail$ui_release = 0;
        if ((access$getAggregateChildKindSet(this_$iv) & mask$iv) == 0) goto L57;
        Modifier.Node node$iv$iv = this_$iv.getHead$ui_release();
    L5:
        if (node$iv$iv == null) goto L74;
        Modifier.Node it$iv = node$iv$iv;
        if ((it$iv.getKindSet$ui_release() & mask$iv) == 0) goto L51;
        Modifier.Node it = it$iv;
        Object stack$iv = null;
        Object node$iv = it;
    L9:
        if (node$iv == null) goto L50;
        r0 = r0;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv instanceof Object) == true) goto L12;
        Modifier.Node this_$iv$iv = (Modifier.Node) node$iv;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L16;
        boolean r15 = true;
    L17:
        if (r15 == false) goto L48;
        if ((node$iv instanceof DelegatingNode) == false) goto L48;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv;
        Modifier.Node node$iv$iv2 = this_$iv$iv2.getDelegate$ui_release();
    L21:
        if (node$iv$iv2 == null) goto L45;
        Modifier.Node next$iv = node$iv$iv2;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L25;
        boolean r21 = true;
    L26:
        if (r21 == false) goto L43;
        count$iv = count$iv + 1;
        int mask$iv2 = mask$iv;
        if (count$iv != 1) goto L30;
        node$iv = next$iv;
        this_$iv = this_$iv;
        $i$f$headToTail$ui_release = $i$f$headToTail$ui_release;
    L44:
        node$iv$iv2 = node$iv$iv2.getChild$ui_release();
        mask$iv = mask$iv2;
        this_$iv = this_$iv;
        $i$f$headToTail$ui_release = $i$f$headToTail$ui_release;
        goto L21
    L30:
        Object r1 = (MutableVector) stack$iv;
        if (r1 != null) goto L33;
        Object r2 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r3 = (MutableVector) r2;
    L34:
        stack$iv = r2;
        Modifier.Node theNode$iv = (Modifier.Node) node$iv;
        if (theNode$iv == null) goto L40;
        MutableVector r4 = (MutableVector) stack$iv;
        if (r4 == null) goto L39;
        r4.add(theNode$iv);
    L39:
        node$iv = null;
    L40:
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L44;
        r5.add(next$iv);
        goto L44
    L33:
        r2 = r1;
        goto L34
    L43:
        mask$iv2 = mask$iv;
        this_$iv = this_$iv;
        $i$f$headToTail$ui_release = $i$f$headToTail$ui_release;
        goto L44
    L25:
        r21 = false;
        goto L26
    L45:
        int mask$iv3 = mask$iv;
        NodeChain this_$iv2 = this_$iv;
        int $i$f$headToTail$ui_release2 = $i$f$headToTail$ui_release;
        if (count$iv != 1) goto L49;
        mask$iv = mask$iv3;
        this_$iv = this_$iv2;
        $i$f$headToTail$ui_release = $i$f$headToTail$ui_release2;
    L49:
        node$iv = DelegatableNodeKt.access$pop((MutableVector) stack$iv);
        mask$iv = mask$iv3;
        this_$iv = this_$iv2;
        $i$f$headToTail$ui_release = $i$f$headToTail$ui_release2;
    L48:
        mask$iv3 = mask$iv;
        this_$iv2 = this_$iv;
        $i$f$headToTail$ui_release2 = $i$f$headToTail$ui_release;
        goto L49
    L16:
        r15 = false;
        goto L17
    L12:
        r29.invoke(node$iv);
        mask$iv3 = mask$iv;
        this_$iv2 = this_$iv;
        $i$f$headToTail$ui_release2 = $i$f$headToTail$ui_release;
        goto L49
    L50:
        int r16 = r0;
        int mask$iv4 = mask$iv;
        NodeChain this_$iv3 = this_$iv;
        int $i$f$headToTail$ui_release3 = $i$f$headToTail$ui_release;
    L53:
        if ((it$iv.getAggregateChildKindSet$ui_release() & mask$iv4) == 0) goto L75;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r0 = r16;
        mask$iv = mask$iv4;
        this_$iv = this_$iv3;
        $i$f$headToTail$ui_release = $i$f$headToTail$ui_release3;
        goto L5
    L75:
        return;
    L51:
        r16 = r0;
        mask$iv4 = mask$iv;
        this_$iv3 = this_$iv;
        $i$f$headToTail$ui_release3 = $i$f$headToTail$ui_release;
        goto L53
    L74:
        return;
    }

    public final void headToTail$ui_release(int mask, Function1<? super Modifier.Node, Unit> r9) {
        if ((access$getAggregateChildKindSet(this) & mask) != 0) goto L5;
        return;
    L5:
        Modifier.Node node$iv = getHead$ui_release();
    L6:
        if (node$iv == null) goto L15;
        Modifier.Node it = node$iv;
        if ((it.getKindSet$ui_release() & mask) == 0) goto L11;
        r9.invoke(it);
    L11:
        if ((it.getAggregateChildKindSet$ui_release() & mask) == 0) goto L12;
        node$iv = node$iv.getChild$ui_release();
        goto L6
    L12:
        return;
    }

    public final void headToTail$ui_release(Function1<? super Modifier.Node, Unit> r3) {
        Modifier.Node node = getHead$ui_release();
    L3:
        if (node == null) goto L5;
        r3.invoke(node);
        node = node.getChild$ui_release();
        goto L3
    }

    public final void headToTailExclusive$ui_release(Function1<? super Modifier.Node, Unit> r4) {
        Modifier.Node node = getHead$ui_release();
    L3:
        if (node == null) goto L7;
        if (node == getTail$ui_release()) goto L10;
        r4.invoke(node);
        node = node.getChild$ui_release();
        goto L3
    L10:
        return;
    }

    /* JADX INFO: renamed from: tailToHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m5941tailToHeadaLcG6gQ$ui_release(int type, Function1<? super T, Unit> r29) {
        int r0 = 0;
        int mask$iv = type;
        NodeChain this_$iv = this;
        int $i$f$tailToHead$ui_release = 0;
        if ((access$getAggregateChildKindSet(this_$iv) & mask$iv) == 0) goto L55;
        Modifier.Node node$iv$iv = this_$iv.getTail$ui_release();
    L5:
        if (node$iv$iv == null) goto L72;
        Modifier.Node it$iv = node$iv$iv;
        if ((it$iv.getKindSet$ui_release() & mask$iv) == 0) goto L52;
        Modifier.Node it = it$iv;
        Object stack$iv = null;
        Object node$iv = it;
    L9:
        if (node$iv == null) goto L52;
        r0 = r0;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv instanceof Object) == true) goto L12;
        Modifier.Node this_$iv$iv = (Modifier.Node) node$iv;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L16;
        boolean r15 = true;
    L17:
        if (r15 == false) goto L48;
        if ((node$iv instanceof DelegatingNode) == false) goto L48;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv;
        Modifier.Node node$iv$iv2 = this_$iv$iv2.getDelegate$ui_release();
    L21:
        if (node$iv$iv2 == null) goto L45;
        Modifier.Node next$iv = node$iv$iv2;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L25;
        boolean r21 = true;
    L26:
        if (r21 == false) goto L43;
        count$iv = count$iv + 1;
        int mask$iv2 = mask$iv;
        if (count$iv != 1) goto L30;
        node$iv = next$iv;
        this_$iv = this_$iv;
        $i$f$tailToHead$ui_release = $i$f$tailToHead$ui_release;
    L44:
        node$iv$iv2 = node$iv$iv2.getChild$ui_release();
        mask$iv = mask$iv2;
        this_$iv = this_$iv;
        $i$f$tailToHead$ui_release = $i$f$tailToHead$ui_release;
        goto L21
    L30:
        Object r1 = (MutableVector) stack$iv;
        if (r1 != null) goto L33;
        Object r2 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r3 = (MutableVector) r2;
    L34:
        stack$iv = r2;
        Modifier.Node theNode$iv = (Modifier.Node) node$iv;
        if (theNode$iv == null) goto L40;
        MutableVector r4 = (MutableVector) stack$iv;
        if (r4 == null) goto L39;
        r4.add(theNode$iv);
    L39:
        node$iv = null;
    L40:
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L44;
        r5.add(next$iv);
        goto L44
    L33:
        r2 = r1;
        goto L34
    L43:
        mask$iv2 = mask$iv;
        this_$iv = this_$iv;
        $i$f$tailToHead$ui_release = $i$f$tailToHead$ui_release;
        goto L44
    L25:
        r21 = false;
        goto L26
    L45:
        int mask$iv3 = mask$iv;
        NodeChain this_$iv2 = this_$iv;
        int $i$f$tailToHead$ui_release2 = $i$f$tailToHead$ui_release;
        if (count$iv != 1) goto L49;
        mask$iv = mask$iv3;
        this_$iv = this_$iv2;
        $i$f$tailToHead$ui_release = $i$f$tailToHead$ui_release2;
    L49:
        node$iv = DelegatableNodeKt.access$pop((MutableVector) stack$iv);
        mask$iv = mask$iv3;
        this_$iv = this_$iv2;
        $i$f$tailToHead$ui_release = $i$f$tailToHead$ui_release2;
    L48:
        mask$iv3 = mask$iv;
        this_$iv2 = this_$iv;
        $i$f$tailToHead$ui_release2 = $i$f$tailToHead$ui_release;
        goto L49
    L16:
        r15 = false;
        goto L17
    L12:
        r29.invoke(node$iv);
        mask$iv3 = mask$iv;
        this_$iv2 = this_$iv;
        $i$f$tailToHead$ui_release2 = $i$f$tailToHead$ui_release;
    L52:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        r0 = r0;
        mask$iv = mask$iv;
        this_$iv = this_$iv;
        $i$f$tailToHead$ui_release = $i$f$tailToHead$ui_release;
        goto L5
    L72:
        return;
    }

    public final void tailToHead$ui_release(int mask, Function1<? super Modifier.Node, Unit> r9) {
        if ((access$getAggregateChildKindSet(this) & mask) != 0) goto L5;
        return;
    L5:
        Modifier.Node node$iv = getTail$ui_release();
    L6:
        if (node$iv == null) goto L12;
        Modifier.Node it = node$iv;
        if ((it.getKindSet$ui_release() & mask) == 0) goto L10;
        r9.invoke(it);
    L10:
        node$iv = node$iv.getParent$ui_release();
        goto L6
    }

    public final void tailToHead$ui_release(Function1<? super Modifier.Node, Unit> r3) {
        Modifier.Node node = getTail$ui_release();
    L3:
        if (node == null) goto L5;
        r3.invoke(node);
        node = node.getParent$ui_release();
        goto L3
    }

    /* JADX INFO: renamed from: tail-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m5940tailH91voCI$ui_release(int r31) {
        int r0 = 0;
        NodeChain r1 = this;
        int r2 = 0;
        int r3 = r31;
        if ((access$getAggregateChildKindSet(r1) & r3) == 0) goto L59;
        Modifier.Node r8 = r1.getTail$ui_release();
    L5:
        if (r8 == null) goto L76;
        Modifier.Node r9 = r8;
        if ((r9.getKindSet$ui_release() & r3) == 0) goto L56;
        Object r15 = null;
        Object r4 = r9;
    L9:
        if (r4 == null) goto L56;
        r1 = r1;
        r2 = r2;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r4 instanceof Object) == true) goto L13;
        if ((((Modifier.Node) r4).getKindSet$ui_release() & r31) == 0) goto L17;
        int r5 = 1;
    L18:
        if (r5 == 0) goto L52;
        if ((r4 instanceof DelegatingNode) == false) goto L52;
        int r6 = 0;
        Modifier.Node r21 = ((DelegatingNode) r4).getDelegate$ui_release();
    L22:
        if (r21 == null) goto L48;
        Modifier.Node r7 = r21;
        if ((r7.getKindSet$ui_release() & r31) == 0) goto L26;
        boolean r23 = true;
    L27:
        if (r23 == false) goto L46;
        r6 = r6 + 1;
        Object r24 = r4;
        if (r6 != 1) goto L31;
        r4 = r7;
        r3 = r3;
    L47:
        r21 = r21.getChild$ui_release();
        r3 = r3;
        goto L22
    L31:
        MutableVector r10 = (MutableVector) r15;
        if (r10 != null) goto L34;
        MutableVector r11 = new MutableVector(new Modifier.Node[16], 0);
    L35:
        r15 = r11;
        Modifier.Node r12 = (Modifier.Node) r24;
        if (r12 == null) goto L41;
        MutableVector r13 = (MutableVector) r15;
        if (r13 == null) goto L40;
        r13.add(r12);
    L40:
        Object r14 = null;
    L42:
        MutableVector r16 = (MutableVector) r15;
        if (r16 == null) goto L45;
        r16.add(r7);
    L45:
        r4 = r14;
        r6 = r6;
        goto L47
    L41:
        r14 = r24;
        goto L42
    L34:
        r11 = r10;
        goto L35
    L46:
        r3 = r3;
        goto L47
    L26:
        r23 = false;
        goto L27
    L48:
        Object r25 = r4;
        int r27 = r3;
        if (r6 == 1) goto L50;
    L53:
        r4 = DelegatableNodeKt.access$pop((MutableVector) r15);
        r3 = r27;
        goto L9
    L50:
        r4 = r25;
        r3 = r27;
    L52:
        r27 = r3;
        goto L53
    L17:
        r5 = 0;
        goto L18
    L13:
        return (T) r4;
    L56:
        r8 = r8.getParent$ui_release();
        r0 = r0;
        r1 = r1;
        r2 = r2;
        r3 = r3;
        goto L5
    L76:
        return null;
    L59:
        return null;
    }

    /* JADX INFO: renamed from: head-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m5938headH91voCI$ui_release(int r31) {
        int r0 = 0;
        NodeChain r1 = this;
        int r2 = 0;
        int r3 = r31;
        if ((access$getAggregateChildKindSet(r1) & r3) == 0) goto L61;
        Modifier.Node r8 = r1.getHead$ui_release();
    L5:
        if (r8 == null) goto L78;
        Modifier.Node r9 = r8;
        if ((r9.getKindSet$ui_release() & r3) == 0) goto L55;
        Object r15 = null;
        Object r4 = r9;
    L9:
        if (r4 == null) goto L54;
        r1 = r1;
        r2 = r2;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r4 instanceof Object) == true) goto L13;
        if ((((Modifier.Node) r4).getKindSet$ui_release() & r31) == 0) goto L17;
        int r5 = 1;
    L18:
        if (r5 == 0) goto L52;
        if ((r4 instanceof DelegatingNode) == false) goto L52;
        int r6 = 0;
        Modifier.Node r21 = ((DelegatingNode) r4).getDelegate$ui_release();
    L22:
        if (r21 == null) goto L48;
        Modifier.Node r7 = r21;
        if ((r7.getKindSet$ui_release() & r31) == 0) goto L26;
        boolean r23 = true;
    L27:
        if (r23 == false) goto L46;
        r6 = r6 + 1;
        Object r24 = r4;
        if (r6 != 1) goto L31;
        r4 = r7;
        r3 = r3;
    L47:
        r21 = r21.getChild$ui_release();
        r3 = r3;
        goto L22
    L31:
        MutableVector r10 = (MutableVector) r15;
        if (r10 != null) goto L34;
        MutableVector r11 = new MutableVector(new Modifier.Node[16], 0);
    L35:
        r15 = r11;
        Modifier.Node r12 = (Modifier.Node) r24;
        if (r12 == null) goto L41;
        MutableVector r13 = (MutableVector) r15;
        if (r13 == null) goto L40;
        r13.add(r12);
    L40:
        Object r14 = null;
    L42:
        MutableVector r16 = (MutableVector) r15;
        if (r16 == null) goto L45;
        r16.add(r7);
    L45:
        r4 = r14;
        r6 = r6;
        goto L47
    L41:
        r14 = r24;
        goto L42
    L34:
        r11 = r10;
        goto L35
    L46:
        r3 = r3;
        goto L47
    L26:
        r23 = false;
        goto L27
    L48:
        Object r25 = r4;
        int r27 = r3;
        if (r6 == 1) goto L50;
    L53:
        r4 = DelegatableNodeKt.access$pop((MutableVector) r15);
        r3 = r27;
        goto L9
    L50:
        r4 = r25;
        r3 = r27;
    L52:
        r27 = r3;
        goto L53
    L17:
        r5 = 0;
        goto L18
    L13:
        return (T) r4;
    L54:
        NodeChain r17 = r1;
        int r18 = r2;
        int r28 = r3;
    L57:
        if ((r9.getAggregateChildKindSet$ui_release() & r28) == 0) goto L79;
        r8 = r8.getChild$ui_release();
        r0 = r0;
        r1 = r17;
        r2 = r18;
        r3 = r28;
        goto L5
    L79:
        return null;
    L55:
        r17 = r1;
        r18 = r2;
        r28 = r3;
        goto L57
    L78:
        return null;
    L61:
        return null;
    }

    /* JADX INFO: renamed from: has-H91voCI$ui_release, reason: not valid java name */
    public final boolean m5937hasH91voCI$ui_release(int type) {
        if ((getAggregateChildKindSet() & type) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean has$ui_release(int mask) {
        if ((getAggregateChildKindSet() & mask) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public String toString() {
        StringBuilder $this$toString_u24lambda_u2428 = new StringBuilder();
        $this$toString_u24lambda_u2428.append("[");
        if (this.head != this.tail) goto L5;
        $this$toString_u24lambda_u2428.append("]");
    L14:
        String r0 = $this$toString_u24lambda_u2428.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    L5:
        Modifier.Node node$iv = getHead$ui_release();
    L6:
        if (node$iv == null) goto L14;
        if (node$iv == getTail$ui_release()) goto L14;
        Modifier.Node it = node$iv;
        $this$toString_u24lambda_u2428.append(String.valueOf(it));
        if (it.getChild$ui_release() == this.tail) goto L11;
        $this$toString_u24lambda_u2428.append(",");
        node$iv = node$iv.getChild$ui_release();
        goto L6
    L11:
        $this$toString_u24lambda_u2428.append("]");
        goto L14
    }
}
