package androidx.compose.ui.draganddrop;

import androidx.autofill.HintConstants;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.core.app.NotificationCompat;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: DragAndDropNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a3\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\nH\u0007\u001a%\u0010\u000b\u001a\u00020\f2\u001d\u0010\r\u001a\u0019\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0002\b\u0012\u001a1\u0010\u0013\u001a\u00020\u00142!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\n\u001a\u001e\u0010\u0015\u001a\u00020\b*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u001a4\u0010\u001b\u001a\u0004\u0018\u0001H\u001c\"\b\b\u0000\u0010\u001c*\u00020\u001d*\u0002H\u001c2\u0014\b\u0004\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u00020\b0\u0003H\u0082\b¢\u0006\u0002\u0010\u001f\u001a/\u0010 \u001a\u00020\u0011\"\b\b\u0000\u0010\u001c*\u00020\u001d*\u0002H\u001c2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u00020\"0\u0003H\u0002¢\u0006\u0002\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"DragAndDropModifierNode", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "shouldStartDragAndDrop", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, NotificationCompat.CATEGORY_EVENT, "", "target", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "DragAndDropSourceModifierNode", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "onStartTransfer", "Lkotlin/Function2;", "Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;", "Landroidx/compose/ui/geometry/Offset;", "", "Lkotlin/ExtensionFunctionType;", "DragAndDropTargetModifierNode", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "contains", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "positionInRoot", "contains-Uv8p0NA", "(Landroidx/compose/ui/draganddrop/DragAndDropNode;J)Z", "dispatchEntered", "firstDescendantOrNull", "T", "Landroidx/compose/ui/node/TraversableNode;", "predicate", "(Landroidx/compose/ui/node/TraversableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/TraversableNode;", "traverseSelfAndDescendants", "block", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "(Landroidx/compose/ui/node/TraversableNode;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DragAndDropNodeKt {
    /* JADX INFO: renamed from: access$contains-Uv8p0NA, reason: not valid java name */
    public static final /* synthetic */ boolean m3969access$containsUv8p0NA(DragAndDropNode $receiver, long positionInRoot) {
        return m3970containsUv8p0NA($receiver, positionInRoot);
    }

    public static final /* synthetic */ void access$dispatchEntered(DragAndDropTarget $receiver, DragAndDropEvent event) {
        dispatchEntered($receiver, event);
    }

    public static final /* synthetic */ void access$traverseSelfAndDescendants(TraversableNode $receiver, Function1 block) {
        traverseSelfAndDescendants($receiver, block);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(message = "Use DragAndDropSourceModifierNode instead", replaceWith = @ReplaceWith(expression = "DragAndDropSourceModifierNode", imports = {}))
    public static final DragAndDropModifierNode DragAndDropModifierNode() {
        Object[] r1 = 0 == true ? 1 : 0;
        return new DragAndDropNode(null, r1, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(message = "Use DragAndDropTargetModifierNode instead", replaceWith = @ReplaceWith(expression = "DragAndDropTargetModifierNode", imports = {}))
    public static final DragAndDropModifierNode DragAndDropModifierNode(final Function1<? super DragAndDropEvent, Boolean> r4, final DragAndDropTarget r5) {
        Function2 r3 = null;
        return new DragAndDropNode(r3, new AnonymousClass1(r4, r5), 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DragAndDropSourceModifierNode DragAndDropSourceModifierNode(Function2<? super DragAndDropStartTransferScope, ? super Offset, Unit> r3) {
        return new DragAndDropNode(r3, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DragAndDropTargetModifierNode DragAndDropTargetModifierNode(final Function1<? super DragAndDropEvent, Boolean> r4, final DragAndDropTarget r5) {
        Function2 r3 = null;
        return new DragAndDropNode(r3, new C06271(r4, r5), 1, 0 == true ? 1 : 0);
    }

    private static final void dispatchEntered(DragAndDropTarget $this$dispatchEntered, DragAndDropEvent event) {
        $this$dispatchEntered.onEntered(event);
        $this$dispatchEntered.onMoved(event);
    }

    /* JADX INFO: renamed from: contains-Uv8p0NA, reason: not valid java name */
    private static final boolean m3970containsUv8p0NA(DragAndDropNode $this$contains_u2dUv8p0NA, long positionInRoot) {
        if ($this$contains_u2dUv8p0NA.getNode().isAttached() == true) goto L5;
        return false;
    L5:
        LayoutCoordinates currentCoordinates = DelegatableNodeKt.requireLayoutNode($this$contains_u2dUv8p0NA).getCoordinates();
        if (currentCoordinates.isAttached() == true) goto L8;
        return false;
    L8:
        long value$iv$iv$iv = LayoutCoordinatesKt.positionInRoot(currentCoordinates);
        int bits$iv$iv$iv$iv = (int) (value$iv$iv$iv >> 32);
        float x1 = Float.intBitsToFloat(bits$iv$iv$iv$iv);
        int bits$iv$iv$iv$iv2 = (int) (value$iv$iv$iv & 4294967295L);
        float y1 = Float.intBitsToFloat(bits$iv$iv$iv$iv2);
        long arg0$iv = $this$contains_u2dUv8p0NA.m3964getSizeYbymL2g$ui_release();
        float x2 = ((int) (arg0$iv >> 32)) + x1;
        long arg0$iv2 = $this$contains_u2dUv8p0NA.m3964getSizeYbymL2g$ui_release();
        int $i$f$unpackInt2 = (int) (arg0$iv2 & 4294967295L);
        float y2 = $i$f$unpackInt2 + y1;
        int bits$iv$iv$iv = (int) (positionInRoot >> 32);
        float r9 = Float.intBitsToFloat(bits$iv$iv$iv);
        if (x1 <= r9) goto L11;
    L13:
        boolean r4 = false;
    L14:
        if (r4 == false) goto L24;
        int bits$iv$iv$iv2 = (int) (4294967295L & positionInRoot);
        float r7 = Float.intBitsToFloat(bits$iv$iv$iv2);
        if (y1 <= r7) goto L18;
    L20:
        boolean r5 = false;
    L21:
        if (r5 == true) goto L23;
        return false;
    L23:
        return true;
    L18:
        if (r7 > y2) goto L20;
        r5 = true;
        goto L21
    L24:
        return false;
    L11:
        if (r9 > x2) goto L13;
        r4 = true;
        goto L14
    }

    private static final <T extends TraversableNode> void traverseSelfAndDescendants(T r2, Function1<? super T, ? extends TraversableNode.Companion.TraverseDescendantsAction> r3) {
        if (r3.invoke(r2) == TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal) goto L5;
        return;
    L5:
        TraversableNodeKt.traverseDescendants(r2, r3);
    }

    private static final <T extends TraversableNode> T firstDescendantOrNull(T r3, final Function1<? super T, Boolean> r4) {
        if (r3.getNode().isAttached() == true) goto L6;
        return null;
    L6:
        final Ref.ObjectRef match = new Ref.ObjectRef();
        TraversableNodeKt.traverseDescendants(r3, new C06281(r4, match));
        return (T) match.element;
    }
}
