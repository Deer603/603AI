package androidx.compose.ui;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J5\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "Companion", "Element", "Node", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Modifier {
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u001c\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ5\u0010\u000f\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "()V", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = null;

        static {
            $$INSTANCE = new Companion();
        }

        private Companion() {
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R r1, Function2<? super R, ? super Element, ? extends R> r2) {
            return r1;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R r1, Function2<? super Element, ? super R, ? extends R> r2) {
            return r1;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(Function1<? super Element, Boolean> r2) {
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean all(Function1<? super Element, Boolean> r2) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier then(Modifier other) {
            return other;
        }

        public String toString() {
            return "Modifier";
        }
    }

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Modifier then(Modifier $this, Modifier other) {
            return Modifier.access$then$jd($this, other);
        }
    }

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J5\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fJ5\u0010\r\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "all", "", "predicate", "Lkotlin/Function1;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Element extends Modifier {

        /* JADX INFO: compiled from: Modifier.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static Modifier then(Element $this, Modifier other) {
                return Element.access$then$jd($this, other);
            }

            @Deprecated
            public static <R> R foldIn(Element r1, R r2, Function2<? super R, ? super Element, ? extends R> r3) {
                return (R) Element.access$foldIn$jd(r1, r2, r3);
            }

            @Deprecated
            public static <R> R foldOut(Element r1, R r2, Function2<? super Element, ? super R, ? extends R> r3) {
                return (R) Element.access$foldOut$jd(r1, r2, r3);
            }

            @Deprecated
            public static boolean any(Element $this, Function1<? super Element, Boolean> r2) {
                return Element.access$any$jd($this, r2);
            }

            @Deprecated
            public static boolean all(Element $this, Function1<? super Element, Boolean> r2) {
                return Element.access$all$jd($this, r2);
            }
        }

        static /* synthetic */ boolean access$all$jd(Element $this, Function1 predicate) {
            return super.all(predicate);
        }

        static /* synthetic */ boolean access$any$jd(Element $this, Function1 predicate) {
            return super.any(predicate);
        }

        static /* synthetic */ Object access$foldIn$jd(Element $this, Object initial, Function2 operation) {
            return super.foldIn(initial, operation);
        }

        static /* synthetic */ Object access$foldOut$jd(Element $this, Object initial, Function2 operation) {
            return super.foldOut(initial, operation);
        }

        static /* synthetic */ Modifier access$then$jd(Element $this, Modifier other) {
            return super.then(other);
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldIn(R r2, Function2<? super R, ? super Element, ? extends R> r3) {
            return r3.invoke(r2, this);
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldOut(R r2, Function2<? super Element, ? super R, ? extends R> r3) {
            return r3.invoke(this, r2);
        }

        @Override // androidx.compose.ui.Modifier
        default boolean any(Function1<? super Element, Boolean> r2) {
            return r2.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default boolean all(Function1<? super Element, Boolean> r2) {
            return r2.invoke(this).booleanValue();
        }
    }

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010=\u001a\u00020\u001f2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030?H\u0080\bø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0019H\u0010¢\u0006\u0002\bCJ\r\u0010D\u001a\u00020\u0019H\u0010¢\u0006\u0002\bEJ\b\u0010F\u001a\u00020\u0019H\u0016J\b\u0010G\u001a\u00020\u0019H\u0016J\b\u0010H\u001a\u00020\u0019H\u0016J\r\u0010I\u001a\u00020\u0019H\u0010¢\u0006\u0002\bJJ\r\u0010K\u001a\u00020\u0019H\u0010¢\u0006\u0002\bLJ\r\u0010M\u001a\u00020\u0019H\u0010¢\u0006\u0002\bNJ\u0015\u0010O\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u0000H\u0010¢\u0006\u0002\bQJ\u0014\u0010R\u001a\u00020\u00192\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0017\u0010T\u001a\u00020\u00192\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0002\bUR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u001f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u001a\u0010%\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR$\u0010(\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0002\u001a\u0004\b*\u0010\u000bR\u000e\u0010+\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u0010\rR\u0010\u00106\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b8\u0010\u0002\u001a\u0004\b9\u0010!R\u001a\u0010:\u001a\u00020\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006V"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "()V", "aggregateChildKindSet", "", "getAggregateChildKindSet$ui_release", "()I", "setAggregateChildKindSet$ui_release", "(I)V", "child", "getChild$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "setChild$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "<set-?>", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "getCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "detachedListener", "Lkotlin/Function0;", "", "getDetachedListener$ui_release", "()Lkotlin/jvm/functions/Function0;", "setDetachedListener$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "insertedNodeAwaitingAttachForInvalidation", "", "getInsertedNodeAwaitingAttachForInvalidation$ui_release", "()Z", "setInsertedNodeAwaitingAttachForInvalidation$ui_release", "(Z)V", "isAttached", "kindSet", "getKindSet$ui_release", "setKindSet$ui_release", "node", "getNode$annotations", "getNode", "onAttachRunExpected", "onDetachRunExpected", "ownerScope", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "getOwnerScope$ui_release", "()Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "setOwnerScope$ui_release", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "parent", "getParent$ui_release", "setParent$ui_release", "scope", "shouldAutoInvalidate", "getShouldAutoInvalidate$annotations", "getShouldAutoInvalidate", "updatedNodeAwaitingAttachForInvalidation", "getUpdatedNodeAwaitingAttachForInvalidation$ui_release", "setUpdatedNodeAwaitingAttachForInvalidation$ui_release", "isKind", "kind", "Landroidx/compose/ui/node/NodeKind;", "isKind-H91voCI$ui_release", "(I)Z", "markAsAttached", "markAsAttached$ui_release", "markAsDetached", "markAsDetached$ui_release", "onAttach", "onDetach", "onReset", "reset", "reset$ui_release", "runAttachLifecycle", "runAttachLifecycle$ui_release", "runDetachLifecycle", "runDetachLifecycle$ui_release", "setAsDelegateTo", "owner", "setAsDelegateTo$ui_release", "sideEffect", "effect", "updateCoordinator", "updateCoordinator$ui_release", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 0;
        private int aggregateChildKindSet;
        private Node child;
        private NodeCoordinator coordinator;
        private Function0<Unit> detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private Node node;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private ObserverNodeOwnerScope ownerScope;
        private Node parent;
        private CoroutineScope scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;

        static {
            $stable = 8;
        }

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public Node() {
            this.node = this;
            this.aggregateChildKindSet = -1;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public final Node getNode() {
            return this.node;
        }

        public final CoroutineScope getCoroutineScope() {
            CoroutineScope r0 = this.scope;
            if (r0 != null) goto L6;
            CoroutineScope it = CoroutineScopeKt.CoroutineScope(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(JobKt.Job((Job) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(Job.Key))));
            this.scope = it;
            return it;
        L6:
            return r0;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        public final void setKindSet$ui_release(int r1) {
            this.kindSet = r1;
        }

        public final int getAggregateChildKindSet$ui_release() {
            return this.aggregateChildKindSet;
        }

        public final void setAggregateChildKindSet$ui_release(int r1) {
            this.aggregateChildKindSet = r1;
        }

        public final Node getParent$ui_release() {
            return this.parent;
        }

        public final void setParent$ui_release(Node r1) {
            this.parent = r1;
        }

        public final Node getChild$ui_release() {
            return this.child;
        }

        public final void setChild$ui_release(Node r1) {
            this.child = r1;
        }

        public final ObserverNodeOwnerScope getOwnerScope$ui_release() {
            return this.ownerScope;
        }

        public final void setOwnerScope$ui_release(ObserverNodeOwnerScope r1) {
            this.ownerScope = r1;
        }

        public final NodeCoordinator getCoordinator$ui_release() {
            return this.coordinator;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean r1) {
            this.insertedNodeAwaitingAttachForInvalidation = r1;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean r1) {
            this.updatedNodeAwaitingAttachForInvalidation = r1;
        }

        public final Function0<Unit> getDetachedListener$ui_release() {
            return this.detachedListener;
        }

        public final void setDetachedListener$ui_release(Function0<Unit> r1) {
            this.detachedListener = r1;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public void updateCoordinator$ui_release(NodeCoordinator coordinator) {
            this.coordinator = coordinator;
        }

        /* JADX INFO: renamed from: isKind-H91voCI$ui_release, reason: not valid java name */
        public final boolean m3943isKindH91voCI$ui_release(int kind) {
            if ((getKindSet$ui_release() & kind) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        public void markAsAttached$ui_release() {
            boolean value$iv = !this.isAttached;
            if (value$iv == true) goto L6;
            InlineClassHelperKt.throwIllegalStateException("node attached multiple times");
        L6:
            if (this.coordinator == null) goto L8;
            boolean value$iv2 = true;
        L10:
            if (value$iv2 == true) goto L12;
            InlineClassHelperKt.throwIllegalStateException("attach invoked on a node without a coordinator");
        L12:
            this.isAttached = true;
            this.onAttachRunExpected = true;
            return;
        L8:
            value$iv2 = false;
            goto L10
        }

        public void runAttachLifecycle$ui_release() {
            boolean value$iv = this.isAttached;
            if (value$iv == true) goto L5;
            InlineClassHelperKt.throwIllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
        L5:
            boolean value$iv2 = this.onAttachRunExpected;
            if (value$iv2 == true) goto L8;
            InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
        L8:
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui_release() {
            boolean value$iv = this.isAttached;
            if (value$iv == true) goto L6;
            InlineClassHelperKt.throwIllegalStateException("node detached multiple times");
        L6:
            if (this.coordinator == null) goto L8;
            boolean value$iv2 = true;
        L10:
            if (value$iv2 == true) goto L12;
            InlineClassHelperKt.throwIllegalStateException("detach invoked on a node without a coordinator");
        L12:
            boolean value$iv3 = this.onDetachRunExpected;
            if (value$iv3 == true) goto L15;
            InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        L15:
            this.onDetachRunExpected = false;
            Function0<Unit> r0 = this.detachedListener;
            if (r0 == null) goto L18;
            r0.invoke();
        L18:
            onDetach();
            return;
        L8:
            value$iv2 = false;
            goto L10
        }

        public void markAsDetached$ui_release() {
            boolean value$iv = this.isAttached;
            if (value$iv == true) goto L5;
            InlineClassHelperKt.throwIllegalStateException("Cannot detach a node that is not attached");
        L5:
            boolean value$iv2 = this.onAttachRunExpected;
            if ((!value$iv2) == true) goto L8;
            InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
        L8:
            boolean value$iv3 = this.onDetachRunExpected;
            if ((!value$iv3) == true) goto L11;
            InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
        L11:
            this.isAttached = false;
            CoroutineScope it = this.scope;
            if (it == null) goto L15;
            CoroutineScopeKt.cancel(it, new ModifierNodeDetachedCancellationException());
            this.scope = null;
            return;
        }

        public void reset$ui_release() {
            boolean value$iv = this.isAttached;
            if (value$iv == true) goto L5;
            InlineClassHelperKt.throwIllegalStateException("reset() called on an unattached node");
        L5:
            onReset();
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public final void sideEffect(Function0<Unit> r2) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(r2);
        }

        public void setAsDelegateTo$ui_release(Node owner) {
            this.node = owner;
        }
    }

    static {
        Companion = Companion.$$INSTANCE;
    }

    boolean all(Function1<? super Element, Boolean> r1);

    boolean any(Function1<? super Element, Boolean> r1);

    <R> R foldIn(R r1, Function2<? super R, ? super Element, ? extends R> r2);

    <R> R foldOut(R r1, Function2<? super Element, ? super R, ? extends R> r2);

    static /* synthetic */ Modifier access$then$jd(Modifier $this, Modifier other) {
        return super.then(other);
    }

    default Modifier then(Modifier other) {
        if (other != Companion) goto L6;
        return this;
    L6:
        return new CombinedModifier(this, other);
    }
}
