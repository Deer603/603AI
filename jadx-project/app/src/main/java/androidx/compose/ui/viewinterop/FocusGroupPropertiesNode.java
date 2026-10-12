package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionManager;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FocusGroupNode.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\u001c\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\fH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006$"}, d2 = {"Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "()V", "attachedViewTreeObserver", "Landroid/view/ViewTreeObserver;", "getAttachedViewTreeObserver", "()Landroid/view/ViewTreeObserver;", "setAttachedViewTreeObserver", "(Landroid/view/ViewTreeObserver;)V", "focusedChild", "Landroid/view/View;", "getFocusedChild", "()Landroid/view/View;", "setFocusedChild", "(Landroid/view/View;)V", "onEnter", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "", "Lkotlin/ExtensionFunctionType;", "getOnEnter", "()Lkotlin/jvm/functions/Function1;", "onExit", "getOnExit", "applyFocusProperties", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "getFocusTargetOfEmbeddedViewWrapper", "Landroidx/compose/ui/focus/FocusTargetNode;", "onAttach", "onDetach", "onGlobalFocusChanged", "oldFocus", "newFocus", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener {
    private ViewTreeObserver attachedViewTreeObserver;
    private View focusedChild;
    private final Function1<FocusEnterExitScope, Unit> onEnter;
    private final Function1<FocusEnterExitScope, Unit> onExit;

    public FocusGroupPropertiesNode() {
        this.onEnter = new FocusGroupPropertiesNode$onEnter$1(this);
        this.onExit = new FocusGroupPropertiesNode$onExit$1(this);
    }

    public final View getFocusedChild() {
        return this.focusedChild;
    }

    public final void setFocusedChild(View r1) {
        this.focusedChild = r1;
    }

    public final ViewTreeObserver getAttachedViewTreeObserver() {
        return this.attachedViewTreeObserver;
    }

    public final void setAttachedViewTreeObserver(ViewTreeObserver r1) {
        this.attachedViewTreeObserver = r1;
    }

    public final Function1<FocusEnterExitScope, Unit> getOnEnter() {
        return this.onEnter;
    }

    public final Function1<FocusEnterExitScope, Unit> getOnExit() {
        return this.onExit;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
        focusProperties.setOnEnter(this.onEnter);
        focusProperties.setOnExit(this.onExit);
    }

    private final FocusTargetNode getFocusTargetOfEmbeddedViewWrapper() {
        boolean foundFocusTargetOfFocusGroup = false;
        FocusGroupPropertiesNode $this$visitLocalDescendants_u2d6rFNWt0$iv = this;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv$iv = $this$visitLocalDescendants_u2d6rFNWt0$iv.getNode().isAttached();
        if (value$iv$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
    L5:
        Modifier.Node self$iv$iv$iv = $this$visitLocalDescendants_u2d6rFNWt0$iv.getNode();
        if ((self$iv$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L63;
        Modifier.Node next$iv$iv$iv = self$iv$iv$iv.getChild$ui_release();
    L8:
        if (next$iv$iv$iv == null) goto L63;
        if ((next$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L58;
        Modifier.Node it$iv = next$iv$iv$iv;
        MutableVector r16 = null;
        boolean foundFocusTargetOfFocusGroup2 = foundFocusTargetOfFocusGroup;
        Modifier.Node r0 = it$iv;
    L12:
        if (r0 == null) goto L57;
        $this$visitLocalDescendants_u2d6rFNWt0$iv = $this$visitLocalDescendants_u2d6rFNWt0$iv;
        if ((r0 instanceof FocusTargetNode) == true) goto L15;
        Modifier.Node this_$iv$iv$iv = r0;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L22;
        int r19 = 1;
    L23:
        if (r19 == 0) goto L55;
        if ((r0 instanceof DelegatingNode) == false) goto L55;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r0;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L27:
        if (node$iv$iv$iv == null) goto L51;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L31;
        boolean r25 = true;
    L32:
        if (r25 == false) goto L49;
        count$iv$iv = count$iv$iv + 1;
        Modifier.Node r26 = r0;
        if (count$iv$iv != 1) goto L36;
        type$iv = type$iv;
        MutableVector r2 = r16;
        Modifier.Node r17 = next$iv$iv;
    L50:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        r0 = r17;
        r16 = r2;
        type$iv = type$iv;
        goto L27
    L36:
        if (r16 != null) goto L38;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L40:
        if (r26 == null) goto L44;
        if (r1 == null) goto L43;
        r1.add(r26);
    L43:
        r17 = null;
    L45:
        if (r1 == null) goto L48;
        r1.add(next$iv$iv);
    L48:
        r2 = r1;
        count$iv$iv = count$iv$iv;
        goto L50
    L44:
        r17 = r26;
        goto L45
    L38:
        r1 = r16;
        goto L40
    L49:
        type$iv = type$iv;
        r2 = r16;
        r17 = r0;
        goto L50
    L31:
        r25 = false;
        goto L32
    L51:
        Modifier.Node r27 = r0;
        int type$iv2 = type$iv;
        if (count$iv$iv != 1) goto L56;
        r0 = r27;
        type$iv = type$iv2;
    L56:
        r0 = DelegatableNodeKt.access$pop(r16);
        type$iv = type$iv2;
    L55:
        type$iv2 = type$iv;
        goto L56
    L22:
        r19 = 0;
        goto L23
    L15:
        FocusTargetNode it = (FocusTargetNode) r0;
        if (foundFocusTargetOfFocusGroup2 == true) goto L17;
        foundFocusTargetOfFocusGroup2 = true;
        type$iv2 = type$iv;
        goto L56
    L17:
        return it;
    L57:
        DelegatableNode $this$visitLocalDescendants_u2d6rFNWt0$iv2 = $this$visitLocalDescendants_u2d6rFNWt0$iv;
        int type$iv3 = type$iv;
        foundFocusTargetOfFocusGroup = foundFocusTargetOfFocusGroup2;
    L59:
        next$iv$iv$iv = next$iv$iv$iv.getChild$ui_release();
        $this$visitLocalDescendants_u2d6rFNWt0$iv = $this$visitLocalDescendants_u2d6rFNWt0$iv2;
        type$iv = type$iv3;
        goto L8
    L58:
        $this$visitLocalDescendants_u2d6rFNWt0$iv2 = $this$visitLocalDescendants_u2d6rFNWt0$iv;
        type$iv3 = type$iv;
    L63:
        throw new IllegalStateException("Could not find focus target of embedded view wrapper".toString());
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View oldFocus, View newFocus) {
        if (DelegatableNodeKt.requireLayoutNode(this).getOwner$ui_release() != null) goto L5;
        return;
    L5:
        View embeddedView = FocusGroupNode_androidKt.access$getEmbeddedView(this);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        Owner hostView = DelegatableNodeKt.requireOwner(this);
        if (oldFocus != null) goto L8;
    L12:
        boolean subViewLostFocus = false;
    L14:
        if (newFocus != null) goto L16;
    L20:
        boolean subViewGotFocus = false;
    L22:
        if (subViewLostFocus == false) goto L25;
        if (subViewGotFocus == false) goto L25;
        this.focusedChild = newFocus;
        return;
    L25:
        if (subViewGotFocus == false) goto L41;
        this.focusedChild = newFocus;
        FocusTargetNode focusTargetNode = getFocusTargetOfEmbeddedViewWrapper();
        if (focusTargetNode.getFocusState().getHasFocus() == false) goto L29;
        return;
    L29:
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L31;
        FocusTransactionsKt.performRequestFocus(focusTargetNode);
        return;
    L31:
        FocusTransactionManager $this$iv = focusOwner.getFocusTransactionManager();
    L37:
        th = move-exception;
        FocusTransactionManager.access$commitTransaction($this$iv);
        throw th;
    L33:
        if ($this$iv.getOngoingTransaction() == false) goto L35;
        FocusTransactionManager.access$cancelTransaction($this$iv);     // Catch: Throwable -> L37
    L35:
        FocusTransactionManager.access$beginTransaction($this$iv);     // Catch: Throwable -> L37
        FocusTransactionsKt.performRequestFocus(focusTargetNode);     // Catch: Throwable -> L37
        FocusTransactionManager.access$commitTransaction($this$iv);
        return;
    L41:
        if (subViewLostFocus == false) goto L45;
        this.focusedChild = null;
        if (getFocusTargetOfEmbeddedViewWrapper().getFocusState().isFocused() == false) goto L53;
        focusOwner.mo4024clearFocusI7lrPNg(false, true, false, FocusDirection.Companion.m4015getExitdhqQ8s());
        return;
    L53:
        return;
    L45:
        this.focusedChild = null;
        return;
    L16:
        if (Intrinsics.areEqual(newFocus, hostView) == true) goto L20;
        if (FocusGroupNode_androidKt.access$containsDescendant(embeddedView, newFocus) == false) goto L20;
        subViewGotFocus = true;
        goto L22
    L8:
        if (Intrinsics.areEqual(oldFocus, hostView) == true) goto L12;
        if (FocusGroupNode_androidKt.access$containsDescendant(embeddedView, oldFocus) == false) goto L12;
        subViewLostFocus = true;
        goto L14
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        ViewTreeObserver viewTreeObserver = DelegatableNode_androidKt.requireView(this).getViewTreeObserver();
        this.attachedViewTreeObserver = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        ViewTreeObserver viewTreeObserver = this.attachedViewTreeObserver;
        if (viewTreeObserver != null) goto L5;
    L7:
        this.attachedViewTreeObserver = null;
        DelegatableNode_androidKt.requireView(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.focusedChild = null;
        super.onDetach();
        return;
    L5:
        if (viewTreeObserver.isAlive() == false) goto L7;
        viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        goto L7
    }
}
