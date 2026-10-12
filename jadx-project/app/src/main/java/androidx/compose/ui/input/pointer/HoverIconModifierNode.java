package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\"\u001a\u00020#H\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0002J\n\u0010'\u001a\u0004\u0018\u00010\u0000H\u0002J\n\u0010(\u001a\u0004\u0018\u00010\u0000H\u0002J\u001a\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020+H&ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\b\u0010.\u001a\u00020#H\u0016J\b\u0010/\u001a\u00020#H\u0016J\b\u00100\u001a\u00020#H\u0002J\b\u00101\u001a\u00020#H\u0002J*\u00102\u001a\u00020#2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "overrideDescendants", "", "dpTouchBoundsExpansion", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "(Landroidx/compose/ui/input/pointer/PointerIcon;ZLandroidx/compose/ui/node/DpTouchBoundsExpansion;)V", "cursorInBoundsOfNode", "getDpTouchBoundsExpansion", "()Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "setDpTouchBoundsExpansion", "(Landroidx/compose/ui/node/DpTouchBoundsExpansion;)V", "value", "getIcon", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "setIcon", "(Landroidx/compose/ui/input/pointer/PointerIcon;)V", "getOverrideDescendants", "()Z", "setOverrideDescendants", "(Z)V", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "touchBoundsExpansion", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "getTouchBoundsExpansion-RZrCHBk", "()J", "displayIcon", "", "displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon", "displayIconFromCurrentNodeOrDescendantsWithCursorInBounds", "displayIconIfDescendantsDoNotHavePriority", "findDescendantNodeWithCursorInBounds", "findOverridingAncestorNode", "isRelevantPointerType", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "isRelevantPointerType-uerMTgs", "(I)Z", "onCancelPointerInput", "onDetach", "onEnter", "onExit", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 0;
    private boolean cursorInBoundsOfNode;
    private DpTouchBoundsExpansion dpTouchBoundsExpansion;
    private PointerIcon icon;
    private boolean overrideDescendants;

    static {
        $stable = 8;
    }

    public abstract void displayIcon(PointerIcon r1);

    /* JADX INFO: renamed from: isRelevantPointerType-uerMTgs, reason: not valid java name */
    public abstract boolean mo5516isRelevantPointerTypeuerMTgs(int r1);

    public /* synthetic */ HoverIconModifierNode(PointerIcon r1, boolean r2, DpTouchBoundsExpansion r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = null;
    L8:
        this(r1, r2, r3);
    }

    public static final /* synthetic */ boolean access$getCursorInBoundsOfNode$p(HoverIconModifierNode $this) {
        return $this.cursorInBoundsOfNode;
    }

    public final DpTouchBoundsExpansion getDpTouchBoundsExpansion() {
        return this.dpTouchBoundsExpansion;
    }

    public final void setDpTouchBoundsExpansion(DpTouchBoundsExpansion r1) {
        this.dpTouchBoundsExpansion = r1;
    }

    public HoverIconModifierNode(PointerIcon icon, boolean overrideDescendants, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = icon;
        this.overrideDescendants = overrideDescendants;
    }

    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final void setIcon(PointerIcon value) {
        if (Intrinsics.areEqual(this.icon, value) == true) goto L8;
        this.icon = value;
        if (this.cursorInBoundsOfNode == false) goto L9;
        displayIconIfDescendantsDoNotHavePriority();
        return;
    L9:
        return;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    public final void setOverrideDescendants(boolean value) {
        if (this.overrideDescendants == value) goto L11;
        this.overrideDescendants = value;
        boolean r0 = this.overrideDescendants;
        boolean r1 = this.cursorInBoundsOfNode;
        if (r0 == false) goto L8;
        if (r1 == false) goto L12;
        displayIcon();
        return;
    L12:
        return;
    L8:
        if (r1 == false) goto L14;
        displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
        return;
    L14:
        return;
    }

    protected final PointerIconService getPointerIconService() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo204onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        if (pass != PointerEventPass.Main) goto L21;
        List<PointerInputChange> r0 = pointerEvent.getChanges();
        int index$iv$iv = 0;
        int r5 = r0.size();
    L5:
        if (index$iv$iv >= r5) goto L10;
        Object item$iv$iv = r0.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (mo5516isRelevantPointerTypeuerMTgs(it.m5592getTypeT8wyACA()) == true) goto L8;
        index$iv$iv = index$iv$iv + 1;
        goto L5
    L8:
        boolean r6 = true;
    L11:
        if (r6 == true) goto L13;
        return;
    L13:
        if (PointerEventType.m5538equalsimpl0(pointerEvent.m5531getType7fucELk(), PointerEventType.Companion.m5542getEnter7fucELk()) == false) goto L16;
        onEnter();
        return;
    L16:
        if (PointerEventType.m5538equalsimpl0(pointerEvent.m5531getType7fucELk(), PointerEventType.Companion.m5543getExit7fucELk()) == false) goto L24;
        onExit();
        return;
    L24:
        return;
    L10:
        r6 = false;
        goto L11
    }

    private final void onEnter() {
        this.cursorInBoundsOfNode = true;
        displayIconIfDescendantsDoNotHavePriority();
    }

    private final void onExit() {
        if (this.cursorInBoundsOfNode == false) goto L8;
        this.cursorInBoundsOfNode = false;
        if (isAttached() == false) goto L9;
        displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
        return;
    L9:
        return;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        onExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        onExit();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo1174getTouchBoundsExpansionRZrCHBk() {
        DpTouchBoundsExpansion r0 = this.dpTouchBoundsExpansion;
        if (r0 == null) goto L6;
        return r0.m5872roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this));
    L6:
        return TouchBoundsExpansion.Companion.m6071getNoneRZrCHBk();
    }

    private final void displayIcon() {
        HoverIconModifierNode r0 = findOverridingAncestorNode();
        if (r0 == null) goto L6;
        PointerIcon iconToUse = r0.icon;
        if (iconToUse == null) goto L6;
    L7:
        displayIcon(iconToUse);
        return;
    L6:
        iconToUse = this.icon;
        goto L7
    }

    private final void displayIconIfDescendantsDoNotHavePriority() {
        final Ref.BooleanRef hasIconRightsOverDescendants = new Ref.BooleanRef();
        hasIconRightsOverDescendants.element = true;
        if (this.overrideDescendants == true) goto L6;
        TraversableNodeKt.traverseDescendants(this, new C06301(hasIconRightsOverDescendants));
    L6:
        if (hasIconRightsOverDescendants.element == false) goto L9;
        displayIcon();
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HoverIconModifierNode findDescendantNodeWithCursorInBounds() {
        final Ref.ObjectRef descendantNodeWithCursorInBounds = new Ref.ObjectRef();
        TraversableNodeKt.traverseDescendants(this, new C06311(descendantNodeWithCursorInBounds));
        return (HoverIconModifierNode) descendantNodeWithCursorInBounds.element;
    }

    private final void displayIconFromCurrentNodeOrDescendantsWithCursorInBounds() {
        if (this.cursorInBoundsOfNode == true) goto L5;
        return;
    L5:
        Object hoverIconModifierNode = this;
        if (this.overrideDescendants == true) goto L10;
        Object it = findDescendantNodeWithCursorInBounds();
        if (it == null) goto L10;
        hoverIconModifierNode = it;
    L10:
        ((HoverIconModifierNode) hoverIconModifierNode).displayIcon();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HoverIconModifierNode findOverridingAncestorNode() {
        final Ref.ObjectRef hoverIconModifierNode = new Ref.ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new C06321(hoverIconModifierNode));
        return (HoverIconModifierNode) hoverIconModifierNode.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        final Ref.ObjectRef hoverIconModifierNode = new Ref.ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new AnonymousClass1(hoverIconModifierNode));
        HoverIconModifierNode r1 = (HoverIconModifierNode) hoverIconModifierNode.element;
        if (r1 == null) goto L5;
        r1.displayIcon();
        Unit r2 = Unit.INSTANCE;
    L6:
        if (r2 != null) goto L9;
        displayIcon(null);
        return;
    L9:
        return;
    L5:
        r2 = null;
        goto L6
    }
}
