package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.IntSize;
import androidx.core.app.NotificationCompat;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: DragAndDropNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001DBB\u0012!\b\u0002\u0010\u0007\u001a\u001b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0002\b\f\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u000fH\u0016J;\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0002\b\fH\u0017ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000fH\u0016J\b\u00103\u001a\u00020\u000bH\u0016J\u0010\u00104\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u000fH\u0016J\u0010\u00105\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000fH\u0016J\u0010\u00106\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000fH\u0016J\u0010\u00107\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000fH\u0016J\u0010\u00108\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000fH\u0016J\u001a\u00109\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010\u001fJ\u0010\u0010;\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000fH\u0016J\u001a\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b>\u0010\u001fJ*\u0010?\u001a\u00020\u000b*\u00020\t2\u0006\u0010=\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00160Aø\u0001\u0000¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0007\u001a\u001b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0002\b\fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\u00020\u001bX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010!\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "onStartTransfer", "Lkotlin/Function2;", "Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;", "Landroidx/compose/ui/geometry/Offset;", "", "Lkotlin/ExtensionFunctionType;", "onDropTargetValidate", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "dragAndDropManager", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "hasEligibleDropTarget", "", "()Z", "isRequestDragAndDropTransferRequired", "lastChildDragAndDropModifierNode", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g$ui_release", "()J", "setSize-ozmzZPI$ui_release", "(J)V", "J", "thisDragAndDropTarget", "traverseKey", "", "getTraverseKey", "()Ljava/lang/Object;", "acceptDragAndDropTransfer", "startEvent", "drag", "transferData", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "decorationSize", "Landroidx/compose/ui/geometry/Size;", "drawDragDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)V", "onChanged", NotificationCompat.CATEGORY_EVENT, "onDetach", "onDrop", "onEnded", "onEntered", "onExited", "onMoved", "onRemeasured", "onRemeasured-ozmzZPI", "onStarted", "requestDragAndDropTransfer", "offset", "requestDragAndDropTransfer-k-4lQ0M", "startDragAndDropTransfer", "isTransferStarted", "Lkotlin/Function0;", "startDragAndDropTransfer-d-4ec7I", "(Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;JLkotlin/jvm/functions/Function0;)V", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode, DragAndDropSourceModifierNode, DragAndDropTargetModifierNode, DragAndDropTarget {
    public static final int $stable = 0;
    private static final Companion Companion = null;
    private DragAndDropNode lastChildDragAndDropModifierNode;
    private final Function1<DragAndDropEvent, DragAndDropTarget> onDropTargetValidate;
    private Function2<? super DragAndDropStartTransferScope, ? super Offset, Unit> onStartTransfer;
    private long size;
    private DragAndDropTarget thisDragAndDropTarget;
    private final Object traverseKey;

    /* JADX INFO: compiled from: DragAndDropNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion;", "", "()V", "DragAndDropTraversableKey", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {

        /* JADX INFO: compiled from: DragAndDropNode.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$DragAndDropTraversableKey;", "", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class DragAndDropTraversableKey {
            public static final DragAndDropTraversableKey INSTANCE = null;

            static {
                INSTANCE = new DragAndDropTraversableKey();
            }

            private DragAndDropTraversableKey() {
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

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ DragAndDropManager access$getDragAndDropManager(DragAndDropNode $this) {
        return $this.getDragAndDropManager();
    }

    public static final /* synthetic */ Function1 access$getOnDropTargetValidate$p(DragAndDropNode $this) {
        return $this.onDropTargetValidate;
    }

    public static final /* synthetic */ Function2 access$getOnStartTransfer$p(DragAndDropNode $this) {
        return $this.onStartTransfer;
    }

    public static final /* synthetic */ DragAndDropTarget access$getThisDragAndDropTarget$p(DragAndDropNode $this) {
        return $this.thisDragAndDropTarget;
    }

    public static final /* synthetic */ void access$setLastChildDragAndDropModifierNode$p(DragAndDropNode $this, DragAndDropNode r1) {
        $this.lastChildDragAndDropModifierNode = r1;
    }

    public static final /* synthetic */ void access$setThisDragAndDropTarget$p(DragAndDropNode $this, DragAndDropTarget r1) {
        $this.thisDragAndDropTarget = r1;
    }

    public /* synthetic */ DragAndDropNode(Function2 r2, Function1 r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode(Function2<? super DragAndDropStartTransferScope, ? super Offset, Unit> r3, Function1<? super DragAndDropEvent, ? extends DragAndDropTarget> r4) {
        this.onStartTransfer = r3;
        this.onDropTargetValidate = r4;
        this.traverseKey = Companion.DragAndDropTraversableKey.INSTANCE;
        this.size = IntSize.Companion.m7149getZeroYbymL2g();
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    private final DragAndDropManager getDragAndDropManager() {
        return DelegatableNodeKt.requireOwner(this).getDragAndDropManager();
    }

    public final boolean hasEligibleDropTarget() {
        if (this.lastChildDragAndDropModifierNode == null) goto L5;
    L8:
        return true;
    L5:
        if (this.thisDragAndDropTarget != null) goto L8;
        return false;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g$ui_release, reason: not valid java name */
    public final long m3964getSizeYbymL2g$ui_release() {
        return this.size;
    }

    /* JADX INFO: renamed from: setSize-ozmzZPI$ui_release, reason: not valid java name */
    public final void m3966setSizeozmzZPI$ui_release(long r1) {
        this.size = r1;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo364onRemeasuredozmzZPI(long size) {
        this.size = size;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    public boolean isRequestDragAndDropTransferRequired() {
        return getDragAndDropManager().isRequestDragAndDropTransferRequired();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    /* JADX INFO: renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
    public void mo3965requestDragAndDropTransferk4lQ0M(long offset) {
        if (this.onStartTransfer == null) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("Check failed.");
    L9:
        getDragAndDropManager().mo3961requestDragAndDropTransferUv8p0NA(this, offset);
        return;
    L5:
        value$iv = false;
        goto L7
    }

    /* JADX INFO: renamed from: startDragAndDropTransfer-d-4ec7I, reason: not valid java name */
    public final void m3967startDragAndDropTransferd4ec7I(final DragAndDropStartTransferScope $this$startDragAndDropTransfer_u2dd_u2d4ec7I, final long offset, final Function0<Boolean> r11) {
        final LayoutCoordinates nodeCoordinates = DelegatableNodeKt.requireLayoutNode(this).getCoordinates();
        DragAndDropNodeKt.access$traverseSelfAndDescendants(this, new DragAndDropNode$startDragAndDropTransfer$1(offset, nodeCoordinates, $this$startDragAndDropTransfer_u2dd_u2d4ec7I, r11));
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    @Deprecated(message = "Use DragAndDropSourceModifierNode.requestDragAndDropTransfer instead")
    /* JADX INFO: renamed from: drag-12SF9DM */
    public void mo3963drag12SF9DM(final DragAndDropTransferData transferData, final long decorationSize, final Function1<? super DrawScope, Unit> r7) {
        if (this.onStartTransfer != null) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("Check failed.");
    L9:
        this.onStartTransfer = new DragAndDropNode$drag$1(transferData, decorationSize, r7);
        getDragAndDropManager().mo3961requestDragAndDropTransferUv8p0NA(this, Offset.Companion.m4140getUnspecifiedF1C5BW0());
        this.onStartTransfer = null;
        return;
    L5:
        value$iv = false;
        goto L7
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public boolean acceptDragAndDropTransfer(final DragAndDropEvent startEvent) {
        final Ref.BooleanRef handled = new Ref.BooleanRef();
        DragAndDropNodeKt.access$traverseSelfAndDescendants(this, new AnonymousClass1(startEvent, this, handled));
        return handled.element;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onStarted(DragAndDropEvent event) {
        DragAndDropTarget self = this.thisDragAndDropTarget;
        if (self != null) goto L7;
        DragAndDropNode r1 = this.lastChildDragAndDropModifierNode;
        if (r1 == null) goto L9;
        r1.onStarted(event);
        return;
    L9:
        return;
    L7:
        self.onStarted(event);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEntered(DragAndDropEvent event) {
        DragAndDropTarget self = this.thisDragAndDropTarget;
        if (self != null) goto L7;
        DragAndDropNode r1 = this.lastChildDragAndDropModifierNode;
        if (r1 == null) goto L9;
        r1.onEntered(event);
        return;
    L9:
        return;
    L7:
        self.onEntered(event);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onMoved(final DragAndDropEvent event) {
        DragAndDropNode currentChildNode = this.lastChildDragAndDropModifierNode;
        boolean r1 = false;
        if (currentChildNode != null) goto L5;
    L7:
        if (r1 == false) goto L9;
        DragAndDropNode newChildNode = currentChildNode;
    L15:
        if (newChildNode == null) goto L20;
        if (currentChildNode != null) goto L20;
        DragAndDropNodeKt.access$dispatchEntered(newChildNode, event);
        DragAndDropTarget r2 = this.thisDragAndDropTarget;
        if (r2 == null) goto L37;
        r2.onExited(event);
    L37:
        this.lastChildDragAndDropModifierNode = newChildNode;
        return;
    L20:
        if (newChildNode != null) goto L27;
        if (currentChildNode == null) goto L27;
        DragAndDropTarget r3 = this.thisDragAndDropTarget;
        if (r3 == null) goto L25;
        DragAndDropNodeKt.access$dispatchEntered(r3, event);
    L25:
        currentChildNode.onExited(event);
    L27:
        if (Intrinsics.areEqual(newChildNode, currentChildNode) == true) goto L32;
        if (newChildNode == null) goto L30;
        DragAndDropNodeKt.access$dispatchEntered(newChildNode, event);
    L30:
        if (currentChildNode == null) goto L37;
        currentChildNode.onExited(event);
        goto L37
    L32:
        if (newChildNode == null) goto L34;
        newChildNode.onMoved(event);
        goto L37
    L34:
        DragAndDropTarget r4 = this.thisDragAndDropTarget;
        if (r4 == null) goto L37;
        r4.onMoved(event);
        goto L37
    L9:
        DragAndDropNode $this$firstDescendantOrNull$iv = this;
        if ($this$firstDescendantOrNull$iv.getNode().isAttached() == true) goto L12;
        TraversableNode r5 = null;
    L13:
        newChildNode = (DragAndDropNode) r5;
        goto L15
    L12:
        final Ref.ObjectRef match$iv = new Ref.ObjectRef();
        TraversableNodeKt.traverseDescendants($this$firstDescendantOrNull$iv, new DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1(match$iv, this, event));
        r5 = (TraversableNode) match$iv.element;
        goto L13
    L5:
        if (DragAndDropNodeKt.m3969access$containsUv8p0NA(currentChildNode, DragAndDrop_androidKt.getPositionInRoot(event)) != true) goto L7;
        r1 = true;
        goto L7
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onChanged(DragAndDropEvent event) {
        DragAndDropTarget self = this.thisDragAndDropTarget;
        if (self != null) goto L7;
        DragAndDropNode r1 = this.lastChildDragAndDropModifierNode;
        if (r1 == null) goto L9;
        r1.onChanged(event);
        return;
    L9:
        return;
    L7:
        self.onChanged(event);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onExited(DragAndDropEvent event) {
        DragAndDropTarget r0 = this.thisDragAndDropTarget;
        if (r0 == null) goto L5;
        r0.onExited(event);
    L5:
        DragAndDropNode r1 = this.lastChildDragAndDropModifierNode;
        if (r1 == null) goto L8;
        r1.onExited(event);
    L8:
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public boolean onDrop(DragAndDropEvent event) {
        DragAndDropNode currentChildDropTarget = this.lastChildDragAndDropModifierNode;
        if (currentChildDropTarget != null) goto L9;
        DragAndDropTarget r1 = this.thisDragAndDropTarget;
        if (r1 != null) goto L10;
        return false;
    L10:
        return r1.onDrop(event);
    L9:
        return currentChildDropTarget.onDrop(event);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEnded(final DragAndDropEvent event) {
        DragAndDropNodeKt.access$traverseSelfAndDescendants(this, new C06261(event));
    }
}
