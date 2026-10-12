package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScrollingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BU\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u0004\u0018\u00010\u0013J\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020!H\u0016J\b\u0010&\u001a\u00020!H\u0016J\u0006\u0010\u001f\u001a\u00020\tJV\u0010'\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Landroidx/compose/foundation/ScrollingContainerNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "state", "Landroidx/compose/foundation/gestures/ScrollableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "", "reverseScrolling", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "useLocalOverscrollFactory", "userProvidedOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;ZLandroidx/compose/foundation/OverscrollEffect;)V", "localOverscrollFactory", "Landroidx/compose/foundation/OverscrollFactory;", "localOverscrollFactoryCreatedOverscrollEffect", "overscrollNode", "Landroidx/compose/ui/node/DelegatableNode;", "scrollableNode", "Landroidx/compose/foundation/gestures/ScrollableNode;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "shouldReverseDirection", "attachOverscrollNodeIfNeeded", "", "getOverscrollEffect", "onAttach", "onDetach", "onLayoutDirectionChange", "onObservedReadsChanged", "update", "overscrollEffect", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ScrollingContainerNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    private BringIntoViewSpec bringIntoViewSpec;
    private boolean enabled;
    private FlingBehavior flingBehavior;
    private MutableInteractionSource interactionSource;
    private OverscrollFactory localOverscrollFactory;
    private OverscrollEffect localOverscrollFactoryCreatedOverscrollEffect;
    private Orientation orientation;
    private DelegatableNode overscrollNode;
    private boolean reverseScrolling;
    private ScrollableNode scrollableNode;
    private final boolean shouldAutoInvalidate;
    private boolean shouldReverseDirection;
    private ScrollableState state;
    private boolean useLocalOverscrollFactory;
    private OverscrollEffect userProvidedOverscrollEffect;

    public static final /* synthetic */ OverscrollFactory access$getLocalOverscrollFactory$p(ScrollingContainerNode $this) {
        return $this.localOverscrollFactory;
    }

    public static final /* synthetic */ void access$setLocalOverscrollFactory$p(ScrollingContainerNode $this, OverscrollFactory r1) {
        $this.localOverscrollFactory = r1;
    }

    public static final /* synthetic */ void access$setLocalOverscrollFactoryCreatedOverscrollEffect$p(ScrollingContainerNode $this, OverscrollEffect r1) {
        $this.localOverscrollFactoryCreatedOverscrollEffect = r1;
    }

    public ScrollingContainerNode(ScrollableState state, Orientation orientation, boolean enabled, boolean reverseScrolling, FlingBehavior flingBehavior, MutableInteractionSource interactionSource, BringIntoViewSpec bringIntoViewSpec, boolean useLocalOverscrollFactory, OverscrollEffect userProvidedOverscrollEffect) {
        this.state = state;
        this.orientation = orientation;
        this.enabled = enabled;
        this.reverseScrolling = reverseScrolling;
        this.flingBehavior = flingBehavior;
        this.interactionSource = interactionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.useLocalOverscrollFactory = useLocalOverscrollFactory;
        this.userProvidedOverscrollEffect = userProvidedOverscrollEffect;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final OverscrollEffect getOverscrollEffect() {
        if (this.useLocalOverscrollFactory == false) goto L6;
        return this.localOverscrollFactoryCreatedOverscrollEffect;
    L6:
        return this.userProvidedOverscrollEffect;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.shouldReverseDirection = shouldReverseDirection();
        attachOverscrollNodeIfNeeded();
        if (this.scrollableNode != null) goto L6;
        this.scrollableNode = (ScrollableNode) delegate(new ScrollableNode(this.state, getOverscrollEffect(), this.flingBehavior, this.orientation, this.enabled, this.shouldReverseDirection, this.interactionSource, this.bringIntoViewSpec));
        return;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode it = this.overscrollNode;
        if (it == null) goto L6;
        undelegate(it);
        return;
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public void onLayoutDirectionChange() {
        boolean reverseDirection = shouldReverseDirection();
        if (this.shouldReverseDirection == reverseDirection) goto L6;
        this.shouldReverseDirection = reverseDirection;
        update(this.state, this.orientation, this.useLocalOverscrollFactory, getOverscrollEffect(), this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
        return;
    }

    public final void update(ScrollableState state, Orientation orientation, boolean useLocalOverscrollFactory, OverscrollEffect overscrollEffect, boolean enabled, boolean reverseScrolling, FlingBehavior flingBehavior, MutableInteractionSource interactionSource, BringIntoViewSpec bringIntoViewSpec) {
        this.state = state;
        this.orientation = orientation;
        if (this.useLocalOverscrollFactory == useLocalOverscrollFactory) goto L5;
        this.useLocalOverscrollFactory = useLocalOverscrollFactory;
        boolean useLocalOverscrollFactoryChanged = true;
    L7:
        if (Intrinsics.areEqual(this.userProvidedOverscrollEffect, overscrollEffect) == true) goto L9;
        this.userProvidedOverscrollEffect = overscrollEffect;
        boolean overscrollEffectChanged = true;
    L11:
        if (useLocalOverscrollFactoryChanged == true) goto L14;
        if (overscrollEffectChanged == false) goto L18;
        if (useLocalOverscrollFactory == false) goto L14;
    L18:
        this.enabled = enabled;
        this.reverseScrolling = reverseScrolling;
        this.flingBehavior = flingBehavior;
        this.interactionSource = interactionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.shouldReverseDirection = shouldReverseDirection();
        ScrollableNode r2 = this.scrollableNode;
        if (r2 == null) goto L22;
        r2.update(state, orientation, getOverscrollEffect(), enabled, this.shouldReverseDirection, flingBehavior, interactionSource, bringIntoViewSpec);
        return;
    L22:
        return;
    L14:
        DelegatableNode it = this.overscrollNode;
        if (it == null) goto L17;
        undelegate(it);
    L17:
        this.overscrollNode = null;
        attachOverscrollNodeIfNeeded();
        goto L18
    L9:
        overscrollEffectChanged = false;
        goto L11
    L5:
        useLocalOverscrollFactoryChanged = false;
        goto L7
    }

    public final boolean shouldReverseDirection() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        if (isAttached() == false) goto L6;
        layoutDirection = DelegatableNodeKt.requireLayoutDirection(this);
    L6:
        return ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, this.orientation, this.reverseScrolling);
    }

    private final void attachOverscrollNodeIfNeeded() {
        if (this.overscrollNode == null) goto L5;
        DelegatableNode it = this.overscrollNode;
        if (it != null) goto L15;
        return;
    L15:
        if (it.getNode().isAttached() == true) goto L23;
        delegate(it);
        return;
    L23:
        return;
    L5:
        if (this.useLocalOverscrollFactory == false) goto L7;
        ObserverModifierNodeKt.observeReads(this, new AnonymousClass1(this));
    L7:
        OverscrollEffect effect = getOverscrollEffect();
        if (effect == null) goto L18;
        DelegatableNode node = effect.getNode();
        if (node.getNode().isAttached() == true) goto L19;
        this.overscrollNode = delegate(node);
        return;
    L19:
        return;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        OverscrollFactory factory = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, OverscrollKt.getLocalOverscrollFactory());
        if (Intrinsics.areEqual(factory, this.localOverscrollFactory) == true) goto L11;
        this.localOverscrollFactory = factory;
        this.localOverscrollFactoryCreatedOverscrollEffect = null;
        DelegatableNode it = this.overscrollNode;
        if (it == null) goto L7;
        undelegate(it);
    L7:
        this.overscrollNode = null;
        attachOverscrollNodeIfNeeded();
        ScrollableNode r4 = this.scrollableNode;
        if (r4 == null) goto L12;
        r4.update(this.state, this.orientation, getOverscrollEffect(), this.enabled, this.shouldReverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
        return;
    L12:
        return;
    }
}
