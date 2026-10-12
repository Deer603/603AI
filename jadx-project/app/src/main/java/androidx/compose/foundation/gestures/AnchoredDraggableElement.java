package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002BY\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\f\u0010\u001d\u001a\u00020\u001b*\u00020\u001eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0012\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableElement;", "T", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/AnchoredDraggableNode;", "state", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLjava/lang/Boolean;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Boolean;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;)V", "Ljava/lang/Boolean;", "create", "equals", "other", "", "hashCode", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AnchoredDraggableElement<T> extends ModifierNodeElement<AnchoredDraggableNode<T>> {
    private final boolean enabled;
    private final FlingBehavior flingBehavior;
    private final MutableInteractionSource interactionSource;
    private final Orientation orientation;
    private final OverscrollEffect overscrollEffect;
    private final Boolean reverseDirection;
    private final Boolean startDragImmediately;
    private final AnchoredDraggableState<T> state;

    public /* synthetic */ AnchoredDraggableElement(AnchoredDraggableState r2, Orientation r3, boolean r4, Boolean r5, MutableInteractionSource r6, Boolean r7, OverscrollEffect r8, FlingBehavior r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 32) == 0) goto L6;
        r7 = null;
    L6:
        if ((r10 & 128) == 0) goto L8;
        FlingBehavior r12 = null;
    L9:
        this(r2, r3, r4, r5, r6, r7, r8, r12);
        return;
    L8:
        r12 = r9;
        goto L9
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((AnchoredDraggableNode) node);
    }

    public AnchoredDraggableElement(AnchoredDraggableState<T> r1, Orientation orientation, boolean enabled, Boolean reverseDirection, MutableInteractionSource interactionSource, Boolean startDragImmediately, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior) {
        this.state = r1;
        this.orientation = orientation;
        this.enabled = enabled;
        this.reverseDirection = reverseDirection;
        this.interactionSource = interactionSource;
        this.startDragImmediately = startDragImmediately;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AnchoredDraggableNode<T> create() {
        return new AnchoredDraggableNode(this.state, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.overscrollEffect, this.startDragImmediately, this.flingBehavior);
    }

    public void update(AnchoredDraggableNode<T> r10) {
        r10.update(this.state, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.overscrollEffect, this.startDragImmediately, this.flingBehavior);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int result = this.state.hashCode();
        int result2 = ((((result * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Boolean r2 = this.reverseDirection;
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = r2.hashCode();
    L6:
        int result3 = (result2 + r4) * 31;
        MutableInteractionSource r5 = this.interactionSource;
        if (r5 == null) goto L9;
        int r6 = r5.hashCode();
    L10:
        int result4 = (result3 + r6) * 31;
        Boolean r7 = this.startDragImmediately;
        if (r7 == null) goto L13;
        int r8 = r7.hashCode();
    L14:
        int result5 = (result4 + r8) * 31;
        OverscrollEffect r9 = this.overscrollEffect;
        if (r9 == null) goto L17;
        int r10 = r9.hashCode();
    L18:
        int result6 = (result5 + r10) * 31;
        FlingBehavior r11 = this.flingBehavior;
        if (r11 == null) goto L22;
        r3 = r11.hashCode();
    L22:
        return result6 + r3;
    L17:
        r10 = 0;
        goto L18
    L13:
        r8 = 0;
        goto L14
    L9:
        r6 = 0;
        goto L10
    L5:
        r4 = 0;
        goto L6
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof AnchoredDraggableElement) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.state, ((AnchoredDraggableElement) other).state) == true) goto L12;
        return false;
    L12:
        if (this.orientation == ((AnchoredDraggableElement) other).orientation) goto L15;
        return false;
    L15:
        if (this.enabled == ((AnchoredDraggableElement) other).enabled) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.reverseDirection, ((AnchoredDraggableElement) other).reverseDirection) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.interactionSource, ((AnchoredDraggableElement) other).interactionSource) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.startDragImmediately, ((AnchoredDraggableElement) other).startDragImmediately) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.areEqual(this.overscrollEffect, ((AnchoredDraggableElement) other).overscrollEffect) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.areEqual(this.flingBehavior, ((AnchoredDraggableElement) other).flingBehavior) == true) goto L32;
        return false;
    L32:
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
        $this$inspectableProperties.setName("anchoredDraggable");
        $this$inspectableProperties.getProperties().set("state", this.state);
        $this$inspectableProperties.getProperties().set("orientation", this.orientation);
        $this$inspectableProperties.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        $this$inspectableProperties.getProperties().set("reverseDirection", this.reverseDirection);
        $this$inspectableProperties.getProperties().set("interactionSource", this.interactionSource);
        $this$inspectableProperties.getProperties().set("startDragImmediately", this.startDragImmediately);
        $this$inspectableProperties.getProperties().set("overscrollEffect", this.overscrollEffect);
        $this$inspectableProperties.getProperties().set("flingBehavior", this.flingBehavior);
    }
}
