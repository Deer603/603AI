package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: FocusRestorer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\nH\u0000\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\nH\u0000\u001a\f\u0010\r\u001a\u00020\f*\u00020\nH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"PrevFocusedChild", "", "focusRestorer", "Landroidx/compose/ui/Modifier;", "onRestoreFailed", "Lkotlin/Function0;", "Landroidx/compose/ui/focus/FocusRequester;", "fallback", "pinFocusedChild", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "Landroidx/compose/ui/focus/FocusTargetNode;", "restoreFocusedChild", "", "saveFocusedChild", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusRestorerKt {
    private static final String PrevFocusedChild = "previouslyFocusedChildHash";

    public static final boolean saveFocusedChild(final FocusTargetNode $this$saveFocusedChild) {
        $this$saveFocusedChild = $this$saveFocusedChild;
        boolean r2 = false;
        if ($this$saveFocusedChild.getFocusState().getHasFocus() == true) goto L5;
        return false;
    L5:
        FocusTargetNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$saveFocusedChild;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L8;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L8:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L11;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L12:
        boolean r14 = true;
        if (branches$iv$iv.getSize() == 0) goto L15;
        boolean r10 = true;
    L16:
        if (r10 == false) goto L76;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L19;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L21:
        if (node$iv$iv == null) goto L75;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) != 0) goto L24;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        $this$saveFocusedChild = $this$saveFocusedChild;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        goto L21
    L24:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r18 = null;
        Modifier.Node this_$iv$iv$iv = it$iv;
    L25:
        if (this_$iv$iv$iv == null) goto L73;
        boolean r20 = r14;
        if ((this_$iv$iv$iv instanceof FocusTargetNode) == true) goto L28;
        DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L38;
        boolean r0 = r20;
    L39:
        if (r0 == false) goto L71;
        if ((this_$iv$iv$iv instanceof DelegatingNode) == false) goto L71;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L43:
        if (node$iv$iv$iv == null) goto L67;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L47;
        boolean r25 = r20;
    L48:
        if (r25 == false) goto L65;
        count$iv$iv = count$iv$iv + 1;
        DelegatingNode this_$iv$iv$iv3 = this_$iv$iv$iv2;
        if (count$iv$iv != r20) goto L52;
        MutableVector r1 = r18;
        Modifier.Node r19 = next$iv$iv;
    L66:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv$iv$iv = r19;
        r20 = true;
        r18 = r1;
        this_$iv$iv$iv2 = this_$iv$iv$iv3;
        goto L43
    L52:
        if (r18 != null) goto L54;
        r1 = new MutableVector(new Modifier.Node[16], 0);
    L55:
        Modifier.Node theNode$iv$iv = this_$iv$iv$iv;
        if (theNode$iv$iv == null) goto L60;
        if (r1 == null) goto L59;
        r1.add(theNode$iv$iv);
    L59:
        r19 = null;
    L61:
        if (r1 == null) goto L64;
        r1.add(next$iv$iv);
    L64:
        count$iv$iv = count$iv$iv;
        goto L66
    L60:
        r19 = this_$iv$iv$iv;
        goto L61
    L54:
        r1 = r18;
        goto L55
    L65:
        this_$iv$iv$iv3 = this_$iv$iv$iv2;
        r1 = r18;
        r19 = this_$iv$iv$iv;
        goto L66
    L47:
        r25 = false;
        goto L48
    L67:
        Modifier.Node r29 = this_$iv$iv$iv;
        boolean r3 = true;
        if (count$iv$iv != 1) goto L72;
        r14 = true;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
        this_$iv$iv$iv = r29;
    L72:
        this_$iv$iv$iv = DelegatableNodeKt.access$pop(r18);
        r14 = r3;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L71:
        r3 = r20;
        goto L72
    L38:
        r0 = false;
        goto L39
    L28:
        FocusTargetNode it = (FocusTargetNode) this_$iv$iv$iv;
        if (it.getFocusState().getHasFocus() == true) goto L30;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        r3 = r20;
        goto L72
    L30:
        $this$saveFocusedChild.setPreviouslyFocusedChildHash(DelegatableNodeKt.requireLayoutNode(it).getCompositeKeyHash());
        SaveableStateRegistry r4 = (SaveableStateRegistry) CompositionLocalConsumerModifierNodeKt.currentValueOf($this$saveFocusedChild, SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        if (r4 == null) goto L33;
        r4.registerProvider(PrevFocusedChild, new FocusRestorerKt$saveFocusedChild$1$1($this$saveFocusedChild));
    L33:
        return r20;
    L73:
        $this$saveFocusedChild = $this$saveFocusedChild;
        r2 = false;
        goto L12
    L75:
        $this$saveFocusedChild = $this$saveFocusedChild;
        r2 = false;
        goto L12
    L19:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        goto L12
    L76:
        return false;
    L15:
        r10 = r2;
        goto L16
    L11:
        branches$iv$iv.add(child$iv$iv);
        goto L12
    }

    public static final boolean restoreFocusedChild(FocusTargetNode $this$restoreFocusedChild) {
        if ($this$restoreFocusedChild.getPreviouslyFocusedChildHash() != 0) goto L10;
        SaveableStateRegistry savableStateRegistry = (SaveableStateRegistry) CompositionLocalConsumerModifierNodeKt.currentValueOf($this$restoreFocusedChild, SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        if (savableStateRegistry == null) goto L10;
        Object it = savableStateRegistry.consumeRestored(PrevFocusedChild);
        if (it == null) goto L10;
        $this$restoreFocusedChild.setPreviouslyFocusedChildHash(((Integer) it).intValue());
    L10:
        boolean r2 = false;
        if ($this$restoreFocusedChild.getPreviouslyFocusedChildHash() != 0) goto L13;
        return false;
    L13:
        FocusTargetNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$restoreFocusedChild;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean zOrder$iv = false;
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L16;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L16:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L19;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L21:
        if (branches$iv$iv.getSize() == 0) goto L23;
        boolean r10 = true;
    L24:
        if (r10 == false) goto L92;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L27;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L29:
        if (node$iv$iv == null) goto L91;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) != 0) goto L32;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        goto L29
    L32:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r18 = null;
        Modifier.Node this_$iv$iv$iv = it$iv;
    L33:
        if (this_$iv$iv$iv == null) goto L89;
        if ((this_$iv$iv$iv instanceof FocusTargetNode) == true) goto L36;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        zOrder$iv = zOrder$iv;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L55;
        boolean r0 = true;
    L56:
        if (r0 == false) goto L87;
        if ((this_$iv$iv$iv instanceof DelegatingNode) == false) goto L87;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L60:
        if (node$iv$iv$iv == null) goto L83;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L64;
        boolean r24 = true;
    L65:
        if (r24 == false) goto L81;
        count$iv$iv = count$iv$iv + 1;
        DelegatingNode this_$iv$iv$iv3 = this_$iv$iv$iv2;
        if (count$iv$iv != 1) goto L69;
        this_$iv$iv$iv = next$iv$iv;
    L82:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv$iv$iv2 = this_$iv$iv$iv3;
        goto L60
    L69:
        if (r18 != null) goto L71;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L72:
        Modifier.Node theNode$iv$iv = this_$iv$iv$iv;
        if (theNode$iv$iv == null) goto L77;
        if (r1 == null) goto L76;
        r1.add(theNode$iv$iv);
    L76:
        this_$iv$iv$iv = null;
    L78:
        if (r1 == null) goto L80;
        r1.add(next$iv$iv);
    L80:
        r18 = r1;
        count$iv$iv = count$iv$iv;
        goto L82
    L77:
        this_$iv$iv$iv = this_$iv$iv$iv;
        goto L78
    L71:
        r1 = r18;
        goto L72
    L81:
        this_$iv$iv$iv3 = this_$iv$iv$iv2;
        goto L82
    L64:
        r24 = false;
        goto L65
    L83:
        Modifier.Node r28 = this_$iv$iv$iv;
        boolean r3 = true;
        if (count$iv$iv != 1) goto L88;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        zOrder$iv = zOrder$iv;
        this_$iv$iv$iv = r28;
    L88:
        this_$iv$iv$iv = DelegatableNodeKt.access$pop(r18);
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        zOrder$iv = zOrder$iv;
    L87:
        r3 = true;
        goto L88
    L55:
        r0 = false;
        goto L56
    L36:
        FocusTargetNode it2 = (FocusTargetNode) this_$iv$iv$iv;
        if (it2.isAttached() == false) goto L51;
        if (DelegatableNodeKt.requireLayoutNode(it2).getCompositeKeyHash() != $this$restoreFocusedChild.getPreviouslyFocusedChildHash()) goto L51;
        if (restoreFocusedChild(it2) == true) goto L47;
        if (FocusTargetModifierNode.m4038requestFocus3ESFkO8$default(it2, 0, 1, null) == true) goto L47;
        return false;
    L47:
        return true;
    L51:
        r3 = true;
        goto L88
    L89:
        r2 = false;
        goto L21
    L91:
        r2 = false;
        goto L21
    L27:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, zOrder$iv);
        goto L21
    L92:
        return false;
    L23:
        r10 = r2;
        goto L24
    L19:
        branches$iv$iv.add(child$iv$iv);
        goto L21
    }

    public static final PinnableContainer.PinnedHandle pinFocusedChild(FocusTargetNode $this$pinFocusedChild) {
        FocusTargetNode r0 = FocusTraversalKt.findActiveFocusNode($this$pinFocusedChild);
        if (r0 == null) goto L7;
        PinnableContainer r1 = (PinnableContainer) CompositionLocalConsumerModifierNodeKt.currentValueOf(r0, PinnableContainerKt.getLocalPinnableContainer());
        if (r1 == null) goto L7;
        return r1.pin();
    L7:
        return null;
    }

    public static /* synthetic */ Modifier focusRestorer$default(Modifier r0, FocusRequester r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = FocusRequester.Companion.getDefault();
    L6:
        return focusRestorer(r0, r1);
    }

    public static final Modifier focusRestorer(Modifier $this$focusRestorer, FocusRequester fallback) {
        return $this$focusRestorer.then(new FocusRestorerElement(fallback));
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use focusRestorer(FocusRequester) instead", replaceWith = @ReplaceWith(expression = "this.focusRestorer(onRestoreFailed())", imports = {}))
    public static final Modifier focusRestorer(Modifier $this$focusRestorer, Function0<FocusRequester> r2) {
        if (r2 == null) goto L5;
        FocusRequester r0 = r2.invoke();
        if (r0 == null) goto L5;
    L7:
        return focusRestorer($this$focusRestorer, r0);
    L5:
        r0 = FocusRequester.Companion.getDefault();
        goto L7
    }
}
