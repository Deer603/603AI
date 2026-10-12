package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0016\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0017\u0010!\u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0#H\u0082\bJ.\u0010$\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0016J\u001a\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010'\u001a\u00020\rH\u0002J\u0006\u0010(\u001a\u00020\u001dJ\u001e\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00000-H\u0016J\b\u0010.\u001a\u00020/H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "modifierNode", "Landroidx/compose/ui/Modifier$Node;", "(Landroidx/compose/ui/Modifier$Node;)V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "hasExited", "", "isIn", "getModifierNode", "()Landroidx/compose/ui/Modifier$Node;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerIds", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "getPointerIds", "()Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "relevantChanges", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "wasIn", "buildCache", "changes", "parentCoordinates", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "cleanUpHits", "", "clearCache", "dispatchCancel", "dispatchFinalEventPass", "dispatchIfNeeded", "block", "Lkotlin/Function0;", "dispatchMainEventPass", "hasPositionChanged", "oldEvent", "newEvent", "markIsIn", "removeInvalidPointerIdsAndChanges", "pointerIdValue", "", "hitNodes", "Landroidx/collection/MutableObjectList;", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Node extends NodeParent {
    public static final int $stable = 0;
    private LayoutCoordinates coordinates;
    private boolean hasExited;
    private boolean isIn;
    private final Modifier.Node modifierNode;
    private PointerEvent pointerEvent;
    private final PointerIdArray pointerIds;
    private final LongSparseArray<PointerInputChange> relevantChanges;
    private boolean wasIn;

    static {
        $stable = 8;
    }

    public Node(Modifier.Node modifierNode) {
        this.modifierNode = modifierNode;
        this.pointerIds = new PointerIdArray();
        this.relevantChanges = new LongSparseArray(2);
        this.isIn = true;
        this.hasExited = true;
    }

    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void removeInvalidPointerIdsAndChanges(long pointerIdValue, MutableObjectList<Node> r10) {
        if (this.pointerIds.contains(pointerIdValue) == true) goto L5;
    L7:
        MutableVector<Node> r0 = getChildren();
        int i$iv = 0;
        Object[] content$iv = r0.content;
        int size$iv = r0.getSize();
    L8:
        if (i$iv >= size$iv) goto L11;
        Node it = (Node) content$iv[i$iv];
        it.removeInvalidPointerIdsAndChanges(pointerIdValue, r10);
        i$iv = i$iv + 1;
        goto L8
    L11:
        return;
    L5:
        if (r10.contains(this) == true) goto L7;
        this.pointerIds.remove(pointerIdValue);
        this.relevantChanges.remove(pointerIdValue);
        goto L7
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(LongSparseArray<PointerInputChange> r28, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        Node this_$iv = this;
        int $i$f$dispatchIfNeeded = 0;
        if (this_$iv.relevantChanges.isEmpty() == false) goto L6;
        return false;
    L6:
        if (this_$iv.modifierNode.isAttached() == false) goto L131;
        PointerEvent event = this.pointerEvent;
        Intrinsics.checkNotNull(event);
        LayoutCoordinates r6 = this.coordinates;
        Intrinsics.checkNotNull(r6);
        long size = r6.mo5722getSizeYbymL2g();
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv = this.modifierNode;
        int count$iv = 16;
        int r9 = NodeKind.m5976constructorimpl(16);
        MutableVector r12 = null;
        Modifier.Node r13 = $this$dispatchForKind_u2d6rFNWt0$iv;
    L9:
        int r14 = 1;
        if (r13 == null) goto L49;
        if ((r13 instanceof PointerInputModifierNode) == true) goto L13;
        int r16 = count$iv;
        Modifier.Node this_$iv$iv = r13;
        if ((this_$iv$iv.getKindSet$ui_release() & r9) == 0) goto L17;
        boolean r10 = true;
    L18:
        if (r10 == false) goto L47;
        if ((r13 instanceof DelegatingNode) == false) goto L47;
        int count$iv2 = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) r13;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L22:
        if (node$iv$iv == null) goto L44;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & r9) == 0) goto L26;
        int r21 = r14;
    L27:
        if (r21 == 0) goto L42;
        count$iv2 = count$iv2 + 1;
        if (count$iv2 != r14) goto L31;
        r13 = next$iv;
        this_$iv = this_$iv;
        $i$f$dispatchIfNeeded = $i$f$dispatchIfNeeded;
    L43:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        this_$iv = this_$iv;
        $i$f$dispatchIfNeeded = $i$f$dispatchIfNeeded;
        r14 = 1;
        goto L22
    L31:
        if (r12 != null) goto L33;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L34:
        r12 = r1;
        Modifier.Node theNode$iv = r13;
        if (theNode$iv == null) goto L39;
        if (r12 == null) goto L38;
        r12.add(theNode$iv);
    L38:
        r13 = null;
    L39:
        if (r12 == null) goto L43;
        r12.add(next$iv);
        goto L43
    L33:
        r1 = r12;
        goto L34
    L42:
        this_$iv = this_$iv;
        $i$f$dispatchIfNeeded = $i$f$dispatchIfNeeded;
        goto L43
    L26:
        r21 = 0;
        goto L27
    L44:
        Node this_$iv2 = this_$iv;
        int $i$f$dispatchIfNeeded2 = $i$f$dispatchIfNeeded;
        if (count$iv2 != 1) goto L48;
        count$iv = r16;
        this_$iv = this_$iv2;
        $i$f$dispatchIfNeeded = $i$f$dispatchIfNeeded2;
    L48:
        r13 = DelegatableNodeKt.access$pop(r12);
        count$iv = r16;
        this_$iv = this_$iv2;
        $i$f$dispatchIfNeeded = $i$f$dispatchIfNeeded2;
    L47:
        this_$iv2 = this_$iv;
        $i$f$dispatchIfNeeded2 = $i$f$dispatchIfNeeded;
        goto L48
    L17:
        r10 = false;
        goto L18
    L13:
        PointerInputModifierNode it = (PointerInputModifierNode) r13;
        r16 = count$iv;
        it.mo204onPointerEventH0pRuoY(event, PointerEventPass.Initial, size);
        this_$iv2 = this_$iv;
        $i$f$dispatchIfNeeded2 = $i$f$dispatchIfNeeded;
        goto L48
    L49:
        int r17 = count$iv;
        if (this.modifierNode.isAttached() == false) goto L57;
        MutableVector<Node> r2 = getChildren();
        int i$iv = 0;
        Object[] content$iv = r2.content;
        int size$iv = r2.getSize();
    L52:
        if (i$iv >= size$iv) goto L57;
        Node it2 = (Node) content$iv[i$iv];
        LongSparseArray<PointerInputChange> r15 = this.relevantChanges;
        LayoutCoordinates r18 = this.coordinates;
        Intrinsics.checkNotNull(r18);
        it2.dispatchMainEventPass(r15, r18, internalPointerEvent, isInBounds);
        i$iv = i$iv + 1;
    L57:
        if (this.modifierNode.isAttached() == false) goto L99;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv2 = this.modifierNode;
        int kind$iv = NodeKind.m5976constructorimpl(r17);
        MutableVector r11 = null;
        Modifier.Node r19 = $this$dispatchForKind_u2d6rFNWt0$iv2;
    L59:
        if (r19 == null) goto L133;
        if ((r19 instanceof PointerInputModifierNode) == true) goto L62;
        Modifier.Node this_$iv$iv3 = r19;
        if ((this_$iv$iv3.getKindSet$ui_release() & kind$iv) == 0) goto L66;
        boolean r110 = true;
    L67:
        if (r110 == false) goto L96;
        if ((r19 instanceof DelegatingNode) == false) goto L96;
        int count$iv3 = 0;
        DelegatingNode this_$iv$iv4 = (DelegatingNode) r19;
        Modifier.Node node$iv$iv2 = this_$iv$iv4.getDelegate$ui_release();
    L71:
        if (node$iv$iv2 == null) goto L93;
        Modifier.Node next$iv2 = node$iv$iv2;
        if ((next$iv2.getKindSet$ui_release() & kind$iv) == 0) goto L75;
        boolean r111 = true;
    L76:
        if (r111 == false) goto L91;
        count$iv3 = count$iv3 + 1;
        if (count$iv3 != 1) goto L80;
        r19 = next$iv2;
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv2;
        kind$iv = kind$iv;
    L92:
        node$iv$iv2 = node$iv$iv2.getChild$ui_release();
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv2;
        kind$iv = kind$iv;
        goto L71
    L80:
        if (r11 != null) goto L82;
        MutableVector r3 = new MutableVector(new Modifier.Node[16], 0);
    L83:
        r11 = r3;
        Modifier.Node theNode$iv2 = r19;
        if (theNode$iv2 == null) goto L88;
        if (r11 == null) goto L87;
        r11.add(theNode$iv2);
    L87:
        r19 = null;
    L88:
        if (r11 == null) goto L92;
        r11.add(next$iv2);
        goto L92
    L82:
        r3 = r11;
        goto L83
    L91:
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv2;
        kind$iv = kind$iv;
        goto L92
    L75:
        r111 = false;
        goto L76
    L93:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv2;
        int kind$iv2 = kind$iv;
        if (count$iv3 != 1) goto L97;
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv3;
        kind$iv = kind$iv2;
    L97:
        r19 = DelegatableNodeKt.access$pop(r11);
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv3;
        kind$iv = kind$iv2;
    L96:
        $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv2;
        kind$iv2 = kind$iv;
        goto L97
    L66:
        r110 = false;
        goto L67
    L62:
        PointerInputModifierNode it3 = (PointerInputModifierNode) r19;
        it3.mo204onPointerEventH0pRuoY(event, PointerEventPass.Main, size);
        $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv2;
        kind$iv2 = kind$iv;
        goto L97
    L133:
        return true;
    L99:
        return true;
    L131:
        return false;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        Node this_$iv = this;
        int $i$f$dispatchIfNeeded = 0;
        boolean result = false;
        if (this_$iv.relevantChanges.isEmpty() == false) goto L6;
    L57:
        cleanUpHits(internalPointerEvent);
        clearCache();
        return result;
    L6:
        if (this_$iv.modifierNode.isAttached() == false) goto L57;
        PointerEvent event = this.pointerEvent;
        Intrinsics.checkNotNull(event);
        LayoutCoordinates r6 = this.coordinates;
        Intrinsics.checkNotNull(r6);
        long size = r6.mo5722getSizeYbymL2g();
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv = this.modifierNode;
        int r9 = NodeKind.m5976constructorimpl(16);
        MutableVector r11 = null;
        Modifier.Node r12 = $this$dispatchForKind_u2d6rFNWt0$iv;
    L9:
        int r13 = 1;
        if (r12 == null) goto L50;
        if ((r12 instanceof PointerInputModifierNode) == true) goto L13;
        Modifier.Node this_$iv$iv = r12;
        if ((this_$iv$iv.getKindSet$ui_release() & r9) == 0) goto L17;
        boolean r14 = true;
    L18:
        if (r14 == false) goto L47;
        if ((r12 instanceof DelegatingNode) == false) goto L47;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) r12;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L22:
        if (node$iv$iv == null) goto L44;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & r9) == 0) goto L26;
        int r20 = r13;
    L27:
        if (r20 == 0) goto L42;
        count$iv = count$iv + 1;
        if (count$iv != r13) goto L31;
        r12 = next$iv;
        this_$iv = this_$iv;
        $i$f$dispatchIfNeeded = $i$f$dispatchIfNeeded;
    L43:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        this_$iv = this_$iv;
        $i$f$dispatchIfNeeded = $i$f$dispatchIfNeeded;
        r13 = 1;
        goto L22
    L31:
        if (r11 != null) goto L33;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L34:
        r11 = r1;
        Modifier.Node theNode$iv = r12;
        if (theNode$iv == null) goto L39;
        if (r11 == null) goto L38;
        r11.add(theNode$iv);
    L38:
        r12 = null;
    L39:
        if (r11 == null) goto L43;
        r11.add(next$iv);
        goto L43
    L33:
        r1 = r11;
        goto L34
    L42:
        this_$iv = this_$iv;
        $i$f$dispatchIfNeeded = $i$f$dispatchIfNeeded;
        goto L43
    L26:
        r20 = 0;
        goto L27
    L44:
        Node this_$iv2 = this_$iv;
        int $i$f$dispatchIfNeeded2 = $i$f$dispatchIfNeeded;
        if (count$iv != 1) goto L48;
        this_$iv = this_$iv2;
        $i$f$dispatchIfNeeded = $i$f$dispatchIfNeeded2;
    L48:
        r12 = DelegatableNodeKt.access$pop(r11);
        this_$iv = this_$iv2;
        $i$f$dispatchIfNeeded = $i$f$dispatchIfNeeded2;
    L47:
        this_$iv2 = this_$iv;
        $i$f$dispatchIfNeeded2 = $i$f$dispatchIfNeeded;
        goto L48
    L17:
        r14 = false;
        goto L18
    L13:
        PointerInputModifierNode it = (PointerInputModifierNode) r12;
        it.mo204onPointerEventH0pRuoY(event, PointerEventPass.Final, size);
        this_$iv2 = this_$iv;
        $i$f$dispatchIfNeeded2 = $i$f$dispatchIfNeeded;
        goto L48
    L50:
        if (this.modifierNode.isAttached() == false) goto L56;
        MutableVector<Node> r2 = getChildren();
        int i$iv = 0;
        Object[] content$iv = r2.content;
        int size$iv = r2.getSize();
    L52:
        if (i$iv >= size$iv) goto L56;
        Node it2 = (Node) content$iv[i$iv];
        it2.dispatchFinalEventPass(internalPointerEvent);
        i$iv = i$iv + 1;
    L56:
        result = true;
        goto L57
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean buildCache(LongSparseArray<PointerInputChange> r43, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        boolean childChanged = super.buildCache(r43, parentCoordinates, internalPointerEvent, isInBounds);
        int r6 = 1;
        if (this.modifierNode.isAttached() == true) goto L5;
        return true;
    L5:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv = this.modifierNode;
        int r7 = NodeKind.m5976constructorimpl(16);
        MutableVector r9 = null;
        Modifier.Node r10 = $this$dispatchForKind_u2d6rFNWt0$iv;
    L6:
        int r11 = 0;
        if (r10 == null) goto L46;
        if ((r10 instanceof PointerInputModifierNode) == true) goto L10;
        Modifier.Node this_$iv$iv = r10;
        if ((this_$iv$iv.getKindSet$ui_release() & r7) == 0) goto L14;
        int r12 = r6;
    L15:
        if (r12 == 0) goto L44;
        if ((r10 instanceof DelegatingNode) == false) goto L44;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) r10;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L19:
        if (node$iv$iv == null) goto L41;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & r7) == 0) goto L23;
        int r18 = r6;
    L24:
        if (r18 == 0) goto L39;
        count$iv = count$iv + 1;
        if (count$iv != r6) goto L28;
        r10 = next$iv;
        childChanged = childChanged;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
    L40:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        childChanged = childChanged;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
        r6 = 1;
        goto L19
    L28:
        if (r9 != null) goto L30;
        MutableVector r4 = new MutableVector(new Modifier.Node[16], 0);
    L31:
        r9 = r4;
        Modifier.Node theNode$iv = r10;
        if (theNode$iv == null) goto L36;
        if (r9 == null) goto L35;
        r9.add(theNode$iv);
    L35:
        r10 = null;
    L36:
        if (r9 == null) goto L40;
        r9.add(next$iv);
        goto L40
    L30:
        r4 = r9;
        goto L31
    L39:
        childChanged = childChanged;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L40
    L23:
        r18 = 0;
        goto L24
    L41:
        boolean childChanged2 = childChanged;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv;
        if (count$iv != 1) goto L45;
        childChanged = childChanged2;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv2;
        r6 = 1;
    L45:
        r10 = DelegatableNodeKt.access$pop(r9);
        childChanged = childChanged2;
        $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv2;
        r6 = 1;
    L44:
        childChanged2 = childChanged;
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L45
    L14:
        r12 = 0;
        goto L15
    L10:
        this.coordinates = PointerInputModifierNodeKt.getLayoutCoordinates((PointerInputModifierNode) r10);
        childChanged2 = childChanged;
        $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv;
        goto L45
    L46:
        boolean childChanged3 = childChanged;
        if (this.coordinates != null) goto L50;
        return true;
    L50:
        int j = 0;
        int r5 = r43.size();
    L51:
        if (j >= r5) goto L79;
        long keyValue = r43.keyAt(j);
        PointerInputChange change = r43.valueAt(j);
        if (this.pointerIds.contains(keyValue) == false) goto L76;
        long prevPosition = change.m5590getPreviousPositionF1C5BW0();
        long currentPosition = change.m5589getPositionF1C5BW0();
        long v$iv = prevPosition & 9223372034707292159L;
        if (((v$iv + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) != 0) goto L57;
        int r13 = 1;
    L58:
        if (r13 == 0) goto L75;
        long v$iv2 = currentPosition & 9223372034707292159L;
        if (((v$iv2 + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) != 0) goto L62;
        int r14 = 1;
    L63:
        if (r14 == 0) goto L75;
        ArrayList historical = new ArrayList(change.getHistorical().size());
        List<HistoricalChange> r15 = change.getHistorical();
        int r16 = r15.size();
        int j2 = 0;
    L65:
        if (j2 >= r16) goto L74;
        Object item$iv = r15.get(j2);
        HistoricalChange it = (HistoricalChange) item$iv;
        int index$iv = j2;
        int r41 = r5;
        long historicalPosition = it.m5513getPositionF1C5BW0();
        long v$iv3 = historicalPosition & 9223372034707292159L;
        if (((v$iv3 + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) != 0) goto L69;
        int r32 = 1;
    L70:
        if (r32 == 0) goto L73;
        long r34 = it.getUptimeMillis();
        LayoutCoordinates r17 = this.coordinates;
        Intrinsics.checkNotNull(r17);
        historical.add(new HistoricalChange(r34, r17.mo5723localPositionOfR5De75A(parentCoordinates, historicalPosition), it.m5512getOriginalEventPositionF1C5BW0$ui_release(), null));
    L73:
        j2 = index$iv + 1;
        r16 = r16;
        r5 = r41;
        goto L65
    L69:
        r32 = 0;
        goto L70
    L74:
        int r42 = r5;
        LongSparseArray<PointerInputChange> r8 = this.relevantChanges;
        LayoutCoordinates r19 = this.coordinates;
        Intrinsics.checkNotNull(r19);
        long r33 = r19.mo5723localPositionOfR5De75A(parentCoordinates, prevPosition);
        LayoutCoordinates r20 = this.coordinates;
        Intrinsics.checkNotNull(r20);
        r8.put(keyValue, PointerInputChange.m5578copyOHpmEuE$default(change, 0, 0, r20.mo5723localPositionOfR5De75A(parentCoordinates, currentPosition), false, 0, r33, false, 0, historical, 0, 731, null));
    L77:
        j = j + 1;
        r5 = r42;
        r11 = 0;
        goto L51
    L62:
        r14 = r11;
    L75:
        r42 = r5;
        goto L77
    L57:
        r13 = r11;
        goto L58
    L76:
        r42 = r5;
        goto L77
    L79:
        if (this.relevantChanges.isEmpty() == false) goto L82;
        this.pointerIds.clear();
        getChildren().clear();
        return true;
    L82:
        PointerIdArray this_$iv = this.pointerIds;
        int i = this_$iv.getSize();
    L83:
        i = i - 1;
        if ((-1) >= i) goto L89;
        long pointerId = this.pointerIds.m5682get_I2yYro(i);
        if (r43.containsKey(pointerId) == true) goto L83;
        this.pointerIds.removeAt(i);
        goto L83
    L89:
        ArrayList changesList = new ArrayList(this.relevantChanges.size());
        int i2 = 0;
        int r21 = this.relevantChanges.size();
    L90:
        if (i2 >= r21) goto L92;
        changesList.add(this.relevantChanges.valueAt(i2));
        i2 = i2 + 1;
        goto L90
    L92:
        PointerEvent event = new PointerEvent(changesList, internalPointerEvent);
        List<PointerInputChange> r22 = event.getChanges();
        int index$iv$iv = 0;
        int r110 = r22.size();
    L93:
        if (index$iv$iv >= r110) goto L98;
        Object item$iv$iv = r22.get(index$iv$iv);
        Object it$iv = item$iv$iv;
        if (internalPointerEvent.m5517activeHoverEvent0FcD4WY(((PointerInputChange) it$iv).m5587getIdJ3iCeTQ()) == true) goto L99;
        index$iv$iv = index$iv$iv + 1;
    L99:
        PointerInputChange activeHoverChange = (PointerInputChange) it$iv;
        if (activeHoverChange == null) goto L141;
        if (isInBounds == true) goto L103;
        boolean r1 = false;
        this.isIn = false;
        boolean r111 = true;
    L114:
        if (this.isIn == this.wasIn) goto L128;
        if (PointerEventType.m5538equalsimpl0(event.m5531getType7fucELk(), PointerEventType.Companion.m5544getMove7fucELk()) == true) goto L123;
        if (PointerEventType.m5538equalsimpl0(event.m5531getType7fucELk(), PointerEventType.Companion.m5542getEnter7fucELk()) == true) goto L123;
        if (PointerEventType.m5538equalsimpl0(event.m5531getType7fucELk(), PointerEventType.Companion.m5543getExit7fucELk()) == false) goto L128;
    L123:
        if (this.isIn == false) goto L125;
        int r2 = PointerEventType.Companion.m5542getEnter7fucELk();
    L126:
        event.m5532setTypeEhbLWgg$ui_release(r2);
    L142:
        if (childChanged3 == false) goto L144;
    L149:
        boolean changed = r111;
    L150:
        this.pointerEvent = event;
        return changed;
    L144:
        if (PointerEventType.m5538equalsimpl0(event.m5531getType7fucELk(), PointerEventType.Companion.m5544getMove7fucELk()) == false) goto L149;
        if (hasPositionChanged(this.pointerEvent, event) == true) goto L149;
        changed = r1;
        goto L150
    L125:
        r2 = PointerEventType.Companion.m5543getExit7fucELk();
    L128:
        if (PointerEventType.m5538equalsimpl0(event.m5531getType7fucELk(), PointerEventType.Companion.m5542getEnter7fucELk()) == false) goto L135;
        if (this.wasIn == false) goto L135;
        if (this.hasExited == true) goto L135;
        event.m5532setTypeEhbLWgg$ui_release(PointerEventType.Companion.m5544getMove7fucELk());
    L135:
        if (PointerEventType.m5538equalsimpl0(event.m5531getType7fucELk(), PointerEventType.Companion.m5543getExit7fucELk()) == false) goto L142;
        if (this.isIn == false) goto L142;
        if (activeHoverChange.getPressed() == false) goto L142;
        event.m5532setTypeEhbLWgg$ui_release(PointerEventType.Companion.m5544getMove7fucELk());
        goto L142
    L103:
        r1 = false;
        if (this.isIn == false) goto L106;
        r111 = true;
        goto L114
    L106:
        if (activeHoverChange.getPressed() == false) goto L108;
    L111:
        LayoutCoordinates r3 = this.coordinates;
        Intrinsics.checkNotNull(r3);
        long size = r3.mo5722getSizeYbymL2g();
        r111 = true;
        this.isIn = !PointerEventKt.m5533isOutOfBoundsO0kMr_c(activeHoverChange, size);
        goto L114
    L108:
        if (activeHoverChange.getPreviousPressed() == true) goto L111;
        r111 = true;
        goto L114
    L141:
        r1 = false;
        r111 = true;
        goto L142
    L98:
        it$iv = null;
        goto L99
    }

    private final boolean hasPositionChanged(PointerEvent oldEvent, PointerEvent newEvent) {
        if (oldEvent != null) goto L5;
    L15:
        return true;
    L5:
        if (oldEvent.getChanges().size() != newEvent.getChanges().size()) goto L15;
        int i = 0;
        int r2 = newEvent.getChanges().size();
    L8:
        if (i >= r2) goto L13;
        PointerInputChange old = oldEvent.getChanges().get(i);
        PointerInputChange current = newEvent.getChanges().get(i);
        if (Offset.m4122equalsimpl0(old.m5589getPositionF1C5BW0(), current.m5589getPositionF1C5BW0()) == false) goto L11;
        i = i + 1;
        goto L8
    L11:
        return true;
    L13:
        return false;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(Function0<Unit> r4) {
        if (this.relevantChanges.isEmpty() == false) goto L6;
        return false;
    L6:
        if (this.modifierNode.isAttached() == true) goto L8;
        return false;
    L8:
        r4.invoke();
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> r0 = getChildren();
        int i$iv = 0;
        Object[] content$iv = r0.content;
        int size$iv = r0.getSize();
    L3:
        if (i$iv >= size$iv) goto L5;
        Node it = (Node) content$iv[i$iv];
        it.dispatchCancel();
        i$iv = i$iv + 1;
        goto L3
    L5:
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv = this.modifierNode;
        int r2 = NodeKind.m5976constructorimpl(16);
        MutableVector r4 = null;
        Modifier.Node r5 = $this$dispatchForKind_u2d6rFNWt0$iv;
    L6:
        if (r5 == null) goto L43;
        if ((r5 instanceof PointerInputModifierNode) == true) goto L9;
        Modifier.Node this_$iv$iv = r5;
        int r10 = 1;
        if ((this_$iv$iv.getKindSet$ui_release() & r2) == 0) goto L13;
        boolean r6 = true;
    L14:
        if (r6 == false) goto L41;
        if ((r5 instanceof DelegatingNode) == false) goto L41;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) r5;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L18:
        if (node$iv$iv == null) goto L39;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & r2) == 0) goto L22;
        int r14 = r10;
    L23:
        if (r14 == 0) goto L37;
        count$iv = count$iv + 1;
        if (count$iv != r10) goto L27;
        r5 = next$iv;
        goto L37
    L27:
        if (r4 != null) goto L29;
        MutableVector r11 = new MutableVector(new Modifier.Node[16], 0);
    L30:
        r4 = r11;
        Modifier.Node theNode$iv = r5;
        if (theNode$iv == null) goto L35;
        if (r4 == null) goto L34;
        r4.add(theNode$iv);
    L34:
        r5 = null;
    L35:
        if (r4 == null) goto L37;
        r4.add(next$iv);
        goto L37
    L29:
        r11 = r4;
    L37:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r10 = 1;
        goto L18
    L22:
        r14 = 0;
        goto L23
    L39:
        if (count$iv == 1) goto L6;
    L41:
        r5 = DelegatableNodeKt.access$pop(r4);
        goto L6
    L13:
        r6 = false;
        goto L14
    L9:
        PointerInputModifierNode it2 = (PointerInputModifierNode) r5;
        it2.onCancelPointerInput();
        goto L41
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        PointerEvent event = this.pointerEvent;
        if (event != null) goto L5;
        return;
    L5:
        this.wasIn = this.isIn;
        List<PointerInputChange> r2 = event.getChanges();
        int index$iv = 0;
        int r5 = r2.size();
    L6:
        boolean removePointerId = false;
        if (index$iv >= r5) goto L18;
        Object item$iv = r2.get(index$iv);
        PointerInputChange change = (PointerInputChange) item$iv;
        boolean released = !change.getPressed();
        boolean nonHoverEventStream = !internalPointerEvent.m5517activeHoverEvent0FcD4WY(change.m5587getIdJ3iCeTQ());
        boolean outsideArea = !this.isIn;
        if (released == false) goto L11;
        if (nonHoverEventStream == false) goto L11;
    L13:
        removePointerId = true;
    L14:
        if (removePointerId == false) goto L17;
        PointerIdArray this_$iv = this.pointerIds;
        long pointerId$iv = change.m5587getIdJ3iCeTQ();
        this_$iv.remove(pointerId$iv);
    L17:
        index$iv = index$iv + 1;
        event = event;
        r2 = r2;
    L11:
        if (released == false) goto L14;
        if (outsideArea == false) goto L14;
    L18:
        this.isIn = false;
        this.hasExited = PointerEventType.m5538equalsimpl0(event.m5531getType7fucELk(), PointerEventType.Companion.m5543getExit7fucELk());
    }

    public String toString() {
        return "Node(modifierNode=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
