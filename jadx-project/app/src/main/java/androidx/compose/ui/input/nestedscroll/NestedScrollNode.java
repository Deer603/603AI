package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: NestedScrollNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J#\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J*\u0010'\u001a\u00020(2\u0006\u0010#\u001a\u00020(2\u0006\u0010$\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\"\u00100\u001a\u00020(2\u0006\u0010$\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102J\b\u00103\u001a\u00020\u001fH\u0002J\u0012\u00104\u001a\u00020\u001f2\b\u00105\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u00106\u001a\u00020\u001fH\u0002J\u001f\u00107\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b8R\u001a\u0010\u0004\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/Modifier$Node;", "connection", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "lastKnownParentNode", "getLastKnownParentNode$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "setLastKnownParentNode$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "nestedCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getNestedCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "parentConnection", "getParentConnection", "parentNestedScrollNode", "getParentNestedScrollNode$ui_release", "resolvedDispatcher", "traverseKey", "", "getTraverseKey", "()Ljava/lang/Object;", "onAttach", "", "onDetach", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "resetDispatcherFields", "updateDispatcher", "newDispatcher", "updateDispatcherFields", "updateNode", "updateNode$ui_release", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {
    public static final int $stable = 0;
    private NestedScrollConnection connection;
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollDispatcher resolvedDispatcher;
    private final Object traverseKey;

    static {
        $stable = 8;
    }

    public static final /* synthetic */ CoroutineScope access$getNestedCoroutineScope(NestedScrollNode $this) {
        return $this.getNestedCoroutineScope();
    }

    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final void setConnection(NestedScrollConnection r1) {
        this.connection = r1;
    }

    public NestedScrollNode(NestedScrollConnection connection, NestedScrollDispatcher dispatcher) {
        this.connection = connection;
        if (dispatcher != null) goto L5;
        NestedScrollDispatcher r0 = new NestedScrollDispatcher();
    L6:
        this.resolvedDispatcher = r0;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
        return;
    L5:
        r0 = dispatcher;
        goto L6
    }

    public final NestedScrollNode getLastKnownParentNode$ui_release() {
        return this.lastKnownParentNode;
    }

    public final void setLastKnownParentNode$ui_release(NestedScrollNode r1) {
        this.lastKnownParentNode = r1;
    }

    public final NestedScrollNode getParentNestedScrollNode$ui_release() {
        if (isAttached() == true) goto L7;
        return null;
    L7:
        return (NestedScrollNode) TraversableNodeKt.findNearestAncestor(this);
    }

    private final NestedScrollConnection getParentConnection() {
        if (isAttached() == true) goto L7;
        return null;
    L7:
        return getParentNestedScrollNode$ui_release();
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    private final CoroutineScope getNestedCoroutineScope() {
        NestedScrollNode r0 = getParentNestedScrollNode$ui_release();
        if (r0 == null) goto L6;
        CoroutineScope r1 = r0.getNestedCoroutineScope();
        if (r1 == null) goto L6;
    L8:
        return r1;
    L6:
        r1 = this.resolvedDispatcher.getScope$ui_release();
        if (r1 != null) goto L8;
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo803onPreScrollOzD1aCk(long available, int source) {
        NestedScrollConnection r0 = getParentConnection();
        if (r0 == null) goto L5;
        long parentPreConsumed = r0.mo803onPreScrollOzD1aCk(available, source);
    L6:
        long selfPreConsumed = this.connection.mo803onPreScrollOzD1aCk(Offset.m4129minusMKHz9U(available, parentPreConsumed), source);
        return Offset.m4130plusMKHz9U(parentPreConsumed, selfPreConsumed);
    L5:
        parentPreConsumed = Offset.Companion.m4141getZeroF1C5BW0();
        goto L6
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo497onPostScrollDzOQY0M(long consumed, long available, int source) {
        long selfConsumed = this.connection.mo497onPostScrollDzOQY0M(consumed, available, source);
        NestedScrollConnection r0 = getParentConnection();
        if (r0 == null) goto L5;
        long parentConsumed = r0.mo497onPostScrollDzOQY0M(Offset.m4130plusMKHz9U(consumed, selfConsumed), Offset.m4129minusMKHz9U(available, selfConsumed), source);
    L7:
        return Offset.m4130plusMKHz9U(selfConsumed, parentConsumed);
    L5:
        parentConsumed = Offset.Companion.m4141getZeroF1C5BW0();
        goto L7
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo802onPreFlingQWom1Mo(long parentPreConsumed, Continuation<? super Velocity> r13) {
        if ((r13 instanceof NestedScrollNode$onPreFling$1) == false) goto L7;
        NestedScrollNode$onPreFling$1 r0 = (NestedScrollNode$onPreFling$1) r13;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        long parentPreConsumed2 = r0.J$0;
        ResultKt.throwOnFailure($result);
        long parentPreConsumed3 = parentPreConsumed2;
        Object r11 = $result;
    L24:
        long selfPreConsumed = ((Velocity) r11).m7220unboximpl();
        return Velocity.m7202boximpl(Velocity.m7215plusAH228Gc(parentPreConsumed3, selfPreConsumed));
    L13:
        parentPreConsumed = r0.J$0;
        NestedScrollNode r3 = (NestedScrollNode) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object r4 = $result;
    L19:
        parentPreConsumed3 = ((Velocity) r4).m7220unboximpl();
    L21:
        NestedScrollConnection r6 = r3.connection;
        long r7 = Velocity.m7214minusAH228Gc(parentPreConsumed, parentPreConsumed3);
        r0.L$0 = null;
        r0.J$0 = parentPreConsumed3;
        r0.label = 2;
        r11 = r6.mo802onPreFlingQWom1Mo(r7, r0);
        if (r11 != r2) goto L24;
        return r2;
    L14:
        ResultKt.throwOnFailure($result);
        r3 = this;
        NestedScrollConnection r5 = r3.getParentConnection();
        if (r5 == null) goto L20;
        r0.L$0 = r3;
        r0.J$0 = parentPreConsumed;
        r0.label = 1;
        r4 = r5.mo802onPreFlingQWom1Mo(parentPreConsumed, r0);
        if (r4 != r2) goto L19;
        return r2;
    L20:
        parentPreConsumed3 = Velocity.Companion.m7222getZero9UxMQ8M();
        goto L21
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new NestedScrollNode$onPreFling$1(this, r13);
        goto L8
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo496onPostFlingRZ2iAVY(long consumed, long available, Continuation<? super Velocity> r21) {
        if ((r21 instanceof NestedScrollNode$onPostFling$1) == false) goto L7;
        NestedScrollNode$onPostFling$1 r1 = (NestedScrollNode$onPostFling$1) r21;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        NestedScrollNode$onPostFling$1 r8 = r1;
        Object $result = r8.result;
        Object r9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r8.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        long selfConsumed = r8.J$0;
        ResultKt.throwOnFailure($result);
        Object r0 = $result;
    L31:
        long parentConsumed = ((Velocity) r0).m7220unboximpl();
        long selfConsumed2 = selfConsumed;
    L34:
        return Velocity.m7202boximpl(Velocity.m7215plusAH228Gc(selfConsumed2, parentConsumed));
    L13:
        long selfConsumed3 = r8.J$1;
        long consumed2 = r8.J$0;
        NestedScrollNode r7 = (NestedScrollNode) r8.L$0;
        ResultKt.throwOnFailure($result);
        long available2 = selfConsumed3;
        long consumed3 = consumed2;
        Object r3 = $result;
    L18:
        selfConsumed2 = ((Velocity) r3).m7220unboximpl();
        if (ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled == true) goto L21;
        NestedScrollNode parent = r7.getParentConnection();
    L26:
        if (parent == null) goto L32;
        long r4 = Velocity.m7215plusAH228Gc(consumed3, selfConsumed2);
        long r6 = Velocity.m7214minusAH228Gc(available2, selfConsumed2);
        r8.L$0 = null;
        r8.J$0 = selfConsumed2;
        r8.label = 2;
        r0 = parent.mo496onPostFlingRZ2iAVY(r4, r6, r8);
        if (r0 != r9) goto L30;
        return r9;
    L30:
        selfConsumed = selfConsumed2;
        goto L31
    L32:
        parentConsumed = Velocity.Companion.m7222getZero9UxMQ8M();
        goto L34
    L21:
        if (r7.isAttached() == false) goto L23;
        parent = r7.getParentConnection();
        goto L26
    L23:
        parent = r7.lastKnownParentNode;
        goto L26
    L14:
        ResultKt.throwOnFailure($result);
        NestedScrollConnection r5 = this.connection;
        r8.L$0 = this;
        r8.J$0 = consumed;
        r8.J$1 = available;
        r8.label = 1;
        r3 = r5.mo496onPostFlingRZ2iAVY(consumed, available, r8);
        if (r3 != r9) goto L17;
        return r9;
    L17:
        r7 = this;
        available2 = available;
        consumed3 = consumed;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new NestedScrollNode$onPostFling$1(this, r21);
        goto L8
    }

    private final void updateDispatcher(NestedScrollDispatcher newDispatcher) {
        resetDispatcherFields();
        if (newDispatcher != null) goto L6;
        this.resolvedDispatcher = new NestedScrollDispatcher();
    L9:
        if (isAttached() == false) goto L12;
        updateDispatcherFields();
        return;
    L12:
        return;
    L6:
        if (Intrinsics.areEqual(newDispatcher, this.resolvedDispatcher) == true) goto L9;
        this.resolvedDispatcher = newDispatcher;
        goto L9
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        if (ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled == false) goto L5;
        this.lastKnownParentNode = (NestedScrollNode) NestedScrollNodeKt.access$findNearestAttachedAncestor(this);
        this.resolvedDispatcher.setLastKnownParentNode$ui_release(this.lastKnownParentNode);
    L5:
        resetDispatcherFields();
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setNestedScrollNode$ui_release(this);
        if (ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled == false) goto L5;
        this.resolvedDispatcher.setLastKnownParentNode$ui_release(null);
        this.lastKnownParentNode = null;
    L5:
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui_release(new AnonymousClass1(this));
        this.resolvedDispatcher.setScope$ui_release(getCoroutineScope());
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getNestedScrollNode$ui_release() != this) goto L6;
        this.resolvedDispatcher.setNestedScrollNode$ui_release(null);
        return;
    }

    public final void updateNode$ui_release(NestedScrollConnection connection, NestedScrollDispatcher dispatcher) {
        this.connection = connection;
        updateDispatcher(dispatcher);
    }
}
