package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTargetNodeKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.semantics.SemanticsModifier;
import kotlin.Metadata;

/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a \u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0000\u001a \u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a#\u0010\u001f\u001a\u00020\f*\u00020\u00012\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\rH\u0080\nø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a#\u0010#\u001a\u00020\u0001*\u00020\u00012\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\rH\u0080\fø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\f\u0010'\u001a\u00020\u0011*\u00020(H\u0002\u001a\f\u0010)\u001a\u00020\f*\u00020(H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Inserted", "", "getInserted$annotations", "()V", "Removed", "getRemoved$annotations", "Updated", "getUpdated$annotations", "classToKindSetMap", "Landroidx/collection/MutableObjectIntMap;", "", "includeSelfInTraversal", "", "Landroidx/compose/ui/node/NodeKind;", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "autoInvalidateInsertedNode", "", "node", "Landroidx/compose/ui/Modifier$Node;", "autoInvalidateNodeIncludingDelegates", "remainingSet", "phase", "autoInvalidateNodeSelf", "selfKindSet", "autoInvalidateRemovedNode", "autoInvalidateUpdatedNode", "calculateNodeKindSetFrom", "element", "Landroidx/compose/ui/Modifier$Element;", "calculateNodeKindSetFromIncludingDelegates", "contains", "value", "contains-64DMado", "(II)Z", "or", "other", "or-64DMado", "(II)I", "scheduleInvalidationOfAssociatedFocusTargets", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "specifiesCanFocusProperty", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;
    private static final MutableObjectIntMap<Object> classToKindSetMap = null;

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    /* JADX INFO: renamed from: or-64DMado, reason: not valid java name */
    public static final int m5986or64DMado(int $this$or_u2d64DMado, int other) {
        return $this$or_u2d64DMado | other;
    }

    /* JADX INFO: renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m5984contains64DMado(int $this$contains_u2d64DMado, int value) {
        if (($this$contains_u2d64DMado & value) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m5985getIncludeSelfInTraversalH91voCI(int $this$includeSelfInTraversal) {
        if ((NodeKind.m5976constructorimpl(128) & $this$includeSelfInTraversal) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        int mask = NodeKind.m5976constructorimpl(1);
        if ((element instanceof LayoutModifier) == false) goto L6;
        int other$iv = NodeKind.m5976constructorimpl(2) | mask;
        mask = other$iv;
    L6:
        if ((element instanceof DrawModifier) == false) goto L9;
        int $this$or_u2d64DMado$iv = mask;
        int other$iv2 = NodeKind.m5976constructorimpl(4) | $this$or_u2d64DMado$iv;
        mask = other$iv2;
    L9:
        if ((element instanceof SemanticsModifier) == false) goto L12;
        int $this$or_u2d64DMado$iv2 = mask;
        int other$iv3 = NodeKind.m5976constructorimpl(8) | $this$or_u2d64DMado$iv2;
        mask = other$iv3;
    L12:
        if ((element instanceof PointerInputModifier) == false) goto L15;
        int $this$or_u2d64DMado$iv3 = mask;
        int other$iv4 = NodeKind.m5976constructorimpl(16) | $this$or_u2d64DMado$iv3;
        mask = other$iv4;
    L15:
        if ((element instanceof ModifierLocalConsumer) == false) goto L17;
    L18:
        int $this$or_u2d64DMado$iv4 = mask;
        int other$iv5 = NodeKind.m5976constructorimpl(32) | $this$or_u2d64DMado$iv4;
        mask = other$iv5;
    L20:
        if ((element instanceof FocusEventModifier) == false) goto L23;
        int $this$or_u2d64DMado$iv5 = mask;
        int other$iv6 = NodeKind.m5976constructorimpl(4096) | $this$or_u2d64DMado$iv5;
        mask = other$iv6;
    L23:
        if ((element instanceof FocusOrderModifier) == false) goto L26;
        int $this$or_u2d64DMado$iv6 = mask;
        int other$iv7 = NodeKind.m5976constructorimpl(2048) | $this$or_u2d64DMado$iv6;
        mask = other$iv7;
    L26:
        if ((element instanceof OnGloballyPositionedModifier) == false) goto L29;
        int $this$or_u2d64DMado$iv7 = mask;
        int other$iv8 = NodeKind.m5976constructorimpl(256) | $this$or_u2d64DMado$iv7;
        mask = other$iv8;
    L29:
        if ((element instanceof ParentDataModifier) == false) goto L32;
        int $this$or_u2d64DMado$iv8 = mask;
        int other$iv9 = NodeKind.m5976constructorimpl(64) | $this$or_u2d64DMado$iv8;
        mask = other$iv9;
    L32:
        if ((element instanceof OnPlacedModifier) == false) goto L34;
    L35:
        int $this$or_u2d64DMado$iv9 = mask;
        int other$iv10 = NodeKind.m5976constructorimpl(128) | $this$or_u2d64DMado$iv9;
        mask = other$iv10;
    L37:
        if ((element instanceof BringIntoViewModifierNode) == false) goto L40;
        int $this$or_u2d64DMado$iv10 = mask;
        int other$iv11 = NodeKind.m5976constructorimpl(524288) | $this$or_u2d64DMado$iv10;
        return other$iv11;
    L40:
        return mask;
    L34:
        if ((element instanceof OnRemeasuredModifier) == false) goto L37;
    L17:
        if ((element instanceof ModifierLocalProvider) == false) goto L20;
        goto L18
    }

    static {
        classToKindSetMap = ObjectIntMapKt.mutableObjectIntMapOf();
    }

    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        if (node.getKindSet$ui_release() != 0) goto L5;
        MutableObjectIntMap<Object> r0 = classToKindSetMap;
        Object key$iv = Actual_jvmKt.classKeyForObject(node);
        int index$iv = r0.findKeyIndex(key$iv);
        if (index$iv < 0) goto L9;
        int value$iv = r0.values[index$iv];
        return value$iv;
    L9:
        int mask = NodeKind.m5976constructorimpl(1);
        if ((node instanceof LayoutModifierNode) == false) goto L13;
        int other$iv = NodeKind.m5976constructorimpl(2) | mask;
        mask = other$iv;
    L13:
        if ((node instanceof DrawModifierNode) == false) goto L16;
        int $this$or_u2d64DMado$iv = mask;
        int other$iv2 = NodeKind.m5976constructorimpl(4) | $this$or_u2d64DMado$iv;
        mask = other$iv2;
    L16:
        if ((node instanceof SemanticsModifierNode) == false) goto L19;
        int $this$or_u2d64DMado$iv2 = mask;
        int other$iv3 = NodeKind.m5976constructorimpl(8) | $this$or_u2d64DMado$iv2;
        mask = other$iv3;
    L19:
        if ((node instanceof PointerInputModifierNode) == false) goto L22;
        int $this$or_u2d64DMado$iv3 = mask;
        int other$iv4 = NodeKind.m5976constructorimpl(16) | $this$or_u2d64DMado$iv3;
        mask = other$iv4;
    L22:
        if ((node instanceof ModifierLocalModifierNode) == false) goto L25;
        int $this$or_u2d64DMado$iv4 = mask;
        int other$iv5 = NodeKind.m5976constructorimpl(32) | $this$or_u2d64DMado$iv4;
        mask = other$iv5;
    L25:
        if ((node instanceof ParentDataModifierNode) == false) goto L28;
        int $this$or_u2d64DMado$iv5 = mask;
        int other$iv6 = NodeKind.m5976constructorimpl(64) | $this$or_u2d64DMado$iv5;
        mask = other$iv6;
    L28:
        if ((node instanceof LayoutAwareModifierNode) == false) goto L31;
        int $this$or_u2d64DMado$iv6 = mask;
        int other$iv7 = NodeKind.m5976constructorimpl(128) | $this$or_u2d64DMado$iv6;
        mask = other$iv7;
    L31:
        if ((node instanceof GlobalPositionAwareModifierNode) == false) goto L34;
        int $this$or_u2d64DMado$iv7 = mask;
        int other$iv8 = NodeKind.m5976constructorimpl(256) | $this$or_u2d64DMado$iv7;
        mask = other$iv8;
    L34:
        if ((node instanceof ApproachLayoutModifierNode) == false) goto L37;
        int $this$or_u2d64DMado$iv8 = mask;
        int other$iv9 = NodeKind.m5976constructorimpl(512) | $this$or_u2d64DMado$iv8;
        mask = other$iv9;
    L37:
        if ((node instanceof FocusTargetNode) == false) goto L40;
        int $this$or_u2d64DMado$iv9 = mask;
        int other$iv10 = NodeKind.m5976constructorimpl(1024) | $this$or_u2d64DMado$iv9;
        mask = other$iv10;
    L40:
        if ((node instanceof FocusPropertiesModifierNode) == false) goto L43;
        int $this$or_u2d64DMado$iv10 = mask;
        int other$iv11 = NodeKind.m5976constructorimpl(2048) | $this$or_u2d64DMado$iv10;
        mask = other$iv11;
    L43:
        if ((node instanceof FocusEventModifierNode) == false) goto L46;
        int $this$or_u2d64DMado$iv11 = mask;
        int other$iv12 = NodeKind.m5976constructorimpl(4096) | $this$or_u2d64DMado$iv11;
        mask = other$iv12;
    L46:
        if ((node instanceof KeyInputModifierNode) == false) goto L49;
        int $this$or_u2d64DMado$iv12 = mask;
        int other$iv13 = NodeKind.m5976constructorimpl(8192) | $this$or_u2d64DMado$iv12;
        mask = other$iv13;
    L49:
        if ((node instanceof RotaryInputModifierNode) == false) goto L52;
        int $this$or_u2d64DMado$iv13 = mask;
        int other$iv14 = NodeKind.m5976constructorimpl(16384) | $this$or_u2d64DMado$iv13;
        mask = other$iv14;
    L52:
        if ((node instanceof CompositionLocalConsumerModifierNode) == false) goto L55;
        int $this$or_u2d64DMado$iv14 = mask;
        int other$iv15 = NodeKind.m5976constructorimpl(32768) | $this$or_u2d64DMado$iv14;
        mask = other$iv15;
    L55:
        if ((node instanceof SoftKeyboardInterceptionModifierNode) == false) goto L58;
        int $this$or_u2d64DMado$iv15 = mask;
        int other$iv16 = NodeKind.m5976constructorimpl(131072) | $this$or_u2d64DMado$iv15;
        mask = other$iv16;
    L58:
        if ((node instanceof TraversableNode) == false) goto L61;
        int $this$or_u2d64DMado$iv16 = mask;
        int other$iv17 = NodeKind.m5976constructorimpl(262144) | $this$or_u2d64DMado$iv16;
        mask = other$iv17;
    L61:
        if ((node instanceof BringIntoViewModifierNode) == false) goto L64;
        int $this$or_u2d64DMado$iv17 = mask;
        int other$iv18 = NodeKind.m5976constructorimpl(524288) | $this$or_u2d64DMado$iv17;
        mask = other$iv18;
    L64:
        if ((node instanceof OnUnplacedModifierNode) == false) goto L66;
        int $this$or_u2d64DMado$iv18 = mask;
        int other$iv19 = NodeKind.m5976constructorimpl(1048576) | $this$or_u2d64DMado$iv18;
        mask = other$iv19;
    L66:
        int r4 = mask;
        r0.set(key$iv, r4);
        return r4;
    L5:
        return node.getKindSet$ui_release();
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        boolean value$iv = node.isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
    L5:
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        boolean value$iv = node.isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
    L5:
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        boolean value$iv = node.isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
    L5:
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final void autoInvalidateNodeIncludingDelegates(Modifier.Node node, int remainingSet, int phase) {
        if ((node instanceof DelegatingNode) == false) goto L8;
        autoInvalidateNodeSelf(node, ((DelegatingNode) node).getSelfKindSet$ui_release() & remainingSet, phase);
        int newRemaining = (~((DelegatingNode) node).getSelfKindSet$ui_release()) & remainingSet;
        DelegatingNode this_$iv = (DelegatingNode) node;
        Modifier.Node node$iv = this_$iv.getDelegate$ui_release();
    L5:
        if (node$iv == null) goto L11;
        Modifier.Node it = node$iv;
        autoInvalidateNodeIncludingDelegates(it, newRemaining, phase);
        node$iv = node$iv.getChild$ui_release();
        goto L5
    L11:
        return;
    L8:
        autoInvalidateNodeSelf(node, node.getKindSet$ui_release() & remainingSet, phase);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(Modifier.Node r7, int selfKindSet, int phase) {
        if (phase == 0) goto L4;
    L6:
        boolean r5 = false;
        if ((selfKindSet & NodeKind.m5976constructorimpl(2)) == 0) goto L9;
        int value$iv = 1;
    L10:
        if (value$iv == 0) goto L17;
        if ((r7 instanceof LayoutModifierNode) == false) goto L17;
        LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) r7);
        if (phase != 2) goto L17;
        NodeCoordinator coordinator = DelegatableNodeKt.m5836requireCoordinator64DMado(r7, NodeKind.m5976constructorimpl(2));
        coordinator.onRelease();
    L17:
        if ((selfKindSet & NodeKind.m5976constructorimpl(128)) == 0) goto L19;
        int value$iv2 = 1;
    L20:
        if (value$iv2 == 0) goto L26;
        if ((r7 instanceof LayoutAwareModifierNode) == false) goto L26;
        if (phase == 2) goto L26;
        DelegatableNodeKt.requireLayoutNode(r7).invalidateMeasurements$ui_release();
    L26:
        if ((selfKindSet & NodeKind.m5976constructorimpl(256)) == 0) goto L28;
        int value$iv3 = 1;
    L29:
        if (value$iv3 == 0) goto L35;
        if ((r7 instanceof GlobalPositionAwareModifierNode) == false) goto L35;
        if (phase == 2) goto L35;
        DelegatableNodeKt.requireLayoutNode(r7).invalidateOnPositioned$ui_release();
    L35:
        if ((selfKindSet & NodeKind.m5976constructorimpl(4)) == 0) goto L37;
        int value$iv4 = 1;
    L38:
        if (value$iv4 == 0) goto L43;
        if ((r7 instanceof DrawModifierNode) == false) goto L43;
        DrawModifierNodeKt.invalidateDraw((DrawModifierNode) r7);
    L43:
        if ((selfKindSet & NodeKind.m5976constructorimpl(8)) == 0) goto L45;
        int value$iv5 = 1;
    L46:
        if (value$iv5 == 0) goto L51;
        if ((r7 instanceof SemanticsModifierNode) == false) goto L51;
        DelegatableNodeKt.requireLayoutNode(r7).setSemanticsInvalidated$ui_release(true);
    L51:
        if ((selfKindSet & NodeKind.m5976constructorimpl(64)) == 0) goto L53;
        int value$iv6 = 1;
    L54:
        if (value$iv6 == 0) goto L59;
        if ((r7 instanceof ParentDataModifierNode) == false) goto L59;
        ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) r7);
    L59:
        if ((selfKindSet & NodeKind.m5976constructorimpl(2048)) == 0) goto L61;
        int value$iv7 = 1;
    L62:
        if (value$iv7 == 0) goto L75;
        if ((r7 instanceof FocusPropertiesModifierNode) == false) goto L75;
        if (specifiesCanFocusProperty((FocusPropertiesModifierNode) r7) == false) goto L75;
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L71;
        scheduleInvalidationOfAssociatedFocusTargets((FocusPropertiesModifierNode) r7);
        goto L75
    L71:
        if (phase != 2) goto L73;
        scheduleInvalidationOfAssociatedFocusTargets((FocusPropertiesModifierNode) r7);
        goto L75
    L73:
        FocusPropertiesModifierNodeKt.invalidateFocusProperties((FocusPropertiesModifierNode) r7);
    L75:
        if ((selfKindSet & NodeKind.m5976constructorimpl(4096)) == 0) goto L77;
        r5 = true;
    L77:
        if (r5 == true) goto L79;
        return;
    L79:
        if ((r7 instanceof FocusEventModifierNode) == false) goto L83;
        FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) r7);
        return;
    L83:
        return;
    L61:
        value$iv7 = 0;
        goto L62
    L53:
        value$iv6 = 0;
        goto L54
    L45:
        value$iv5 = 0;
        goto L46
    L37:
        value$iv4 = 0;
        goto L38
    L28:
        value$iv3 = 0;
        goto L29
    L19:
        value$iv2 = 0;
        goto L20
    L9:
        value$iv = 0;
        goto L10
    L4:
        if (r7.getShouldAutoInvalidate() == true) goto L6;
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode $this$scheduleInvalidationOfAssociatedFocusTargets) {
        FocusPropertiesModifierNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$scheduleInvalidationOfAssociatedFocusTargets;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean zOrder$iv = false;
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L5:
        boolean r12 = false;
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L8;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L10:
        if (branches$iv$iv.getSize() == 0) goto L12;
        boolean r8 = true;
    L13:
        if (r8 == false) goto L66;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L16;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L18:
        if (node$iv$iv == null) goto L64;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) != 0) goto L21;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        goto L18
    L21:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r17 = null;
        Modifier.Node r13 = it$iv;
    L22:
        if (r13 == null) goto L62;
        if ((r13 instanceof FocusTargetNode) == true) goto L25;
        Modifier.Node this_$iv$iv$iv = r13;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L29;
        boolean r14 = true;
    L30:
        if (r14 == false) goto L60;
        if ((r13 instanceof DelegatingNode) == false) goto L60;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r13;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L34:
        if (node$iv$iv$iv == null) goto L57;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L38;
        boolean r24 = true;
    L39:
        if (r24 == false) goto L55;
        count$iv$iv = count$iv$iv + 1;
        DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        if (count$iv$iv != 1) goto L43;
        r13 = next$iv$iv;
        type$iv = type$iv;
        zOrder$iv = zOrder$iv;
    L56:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv;
        zOrder$iv = zOrder$iv;
        goto L34
    L43:
        if (r17 != null) goto L45;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L46:
        Modifier.Node theNode$iv$iv = r13;
        if (theNode$iv$iv == null) goto L51;
        if (r1 == null) goto L50;
        r1.add(theNode$iv$iv);
    L50:
        r13 = null;
    L51:
        if (r1 == null) goto L54;
        r1.add(next$iv$iv);
    L54:
        r17 = r1;
        goto L56
    L45:
        r1 = r17;
        goto L46
    L55:
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        zOrder$iv = zOrder$iv;
        goto L56
    L38:
        r24 = false;
        goto L39
    L57:
        DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv3 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        boolean zOrder$iv2 = zOrder$iv;
        boolean r0 = true;
        if (count$iv$iv != 1) goto L61;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv3;
        type$iv = type$iv2;
        zOrder$iv = zOrder$iv2;
    L61:
        r13 = DelegatableNodeKt.access$pop(r17);
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv3;
        type$iv = type$iv2;
        zOrder$iv = zOrder$iv2;
    L60:
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv3 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        zOrder$iv2 = zOrder$iv;
        r0 = true;
        goto L61
    L29:
        r14 = false;
        goto L30
    L25:
        FocusTargetNode it = (FocusTargetNode) r13;
        FocusTargetNodeKt.invalidateFocusTarget(it);
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv3 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        zOrder$iv2 = zOrder$iv;
        r0 = true;
        goto L61
    L62:
        r12 = false;
        goto L10
    L64:
        r12 = false;
        goto L10
    L16:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, zOrder$iv);
        goto L10
    L66:
        return;
    L12:
        r8 = r12;
        goto L13
    L8:
        branches$iv$iv.add(child$iv$iv);
        goto L10
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode $this$specifiesCanFocusProperty) {
        CanFocusChecker.INSTANCE.reset();
        $this$specifiesCanFocusProperty.applyFocusProperties(CanFocusChecker.INSTANCE);
        return CanFocusChecker.INSTANCE.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(Modifier.Node node) {
        if ((node instanceof DelegatingNode) == false) goto L9;
        int mask = ((DelegatingNode) node).getSelfKindSet$ui_release();
        DelegatingNode this_$iv = (DelegatingNode) node;
        Modifier.Node node$iv = this_$iv.getDelegate$ui_release();
    L5:
        if (node$iv == null) goto L11;
        Modifier.Node it = node$iv;
        mask = mask | calculateNodeKindSetFromIncludingDelegates(it);
        node$iv = node$iv.getChild$ui_release();
        goto L5
    L11:
        return mask;
    L9:
        return calculateNodeKindSetFrom(node);
    }
}
