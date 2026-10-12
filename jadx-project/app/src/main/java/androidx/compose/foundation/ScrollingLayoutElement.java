package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\f\u0010\u0016\u001a\u00020\u0014*\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ScrollNode;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "reverseScrolling", "", "isVertical", "(Landroidx/compose/foundation/ScrollState;ZZ)V", "()Z", "getReverseScrolling", "getScrollState", "()Landroidx/compose/foundation/ScrollState;", "create", "equals", "other", "", "hashCode", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ScrollingLayoutElement extends ModifierNodeElement<ScrollNode> {
    public static final int $stable = 0;
    private final boolean isVertical;
    private final boolean reverseScrolling;
    private final ScrollState scrollState;

    static {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((ScrollNode) node);
    }

    public final ScrollState getScrollState() {
        return this.scrollState;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public ScrollingLayoutElement(ScrollState scrollState, boolean reverseScrolling, boolean isVertical) {
        this.scrollState = scrollState;
        this.reverseScrolling = reverseScrolling;
        this.isVertical = isVertical;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ScrollNode create() {
        return new ScrollNode(this.scrollState, this.reverseScrolling, this.isVertical);
    }

    public void update(ScrollNode node) {
        node.setState(this.scrollState);
        node.setReverseScrolling(this.reverseScrolling);
        node.setVertical(this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int result = this.scrollState.hashCode();
        int result2 = (result * 31) + Boolean.hashCode(this.reverseScrolling);
        return (result2 * 31) + Boolean.hashCode(this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if ((other instanceof ScrollingLayoutElement) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(this.scrollState, ((ScrollingLayoutElement) other).scrollState) == true) goto L8;
        return false;
    L8:
        if (this.reverseScrolling == ((ScrollingLayoutElement) other).reverseScrolling) goto L10;
        return false;
    L10:
        if (this.isVertical != ((ScrollingLayoutElement) other).isVertical) goto L16;
        return true;
    L16:
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
        $this$inspectableProperties.setName("scroll");
        $this$inspectableProperties.getProperties().set("state", this.scrollState);
        $this$inspectableProperties.getProperties().set("reverseScrolling", Boolean.valueOf(this.reverseScrolling));
        $this$inspectableProperties.getProperties().set("isVertical", Boolean.valueOf(this.isVertical));
    }
}
