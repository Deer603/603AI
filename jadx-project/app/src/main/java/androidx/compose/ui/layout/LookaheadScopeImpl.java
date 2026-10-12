package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LookaheadScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\f\u0010\r\u001a\u00020\u0004*\u00020\u0004H\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0018\u0010\t\u001a\u00020\u0004*\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/layout/LookaheadScopeImpl;", "Landroidx/compose/ui/layout/LookaheadScope;", "scopeCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "(Lkotlin/jvm/functions/Function0;)V", "getScopeCoordinates", "()Lkotlin/jvm/functions/Function0;", "setScopeCoordinates", "lookaheadScopeCoordinates", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "toLookaheadCoordinates", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LookaheadScopeImpl implements LookaheadScope {
    public static final int $stable = 0;
    private Function0<? extends LayoutCoordinates> scopeCoordinates;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScopeImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public LookaheadScopeImpl(Function0<? extends LayoutCoordinates> r1) {
        this.scopeCoordinates = r1;
    }

    public /* synthetic */ LookaheadScopeImpl(Function0 r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }

    public final Function0<LayoutCoordinates> getScopeCoordinates() {
        return this.scopeCoordinates;
    }

    public final void setScopeCoordinates(Function0<? extends LayoutCoordinates> r1) {
        this.scopeCoordinates = r1;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates $this$toLookaheadCoordinates) {
        if (($this$toLookaheadCoordinates instanceof LookaheadLayoutCoordinates) == false) goto L5;
        LookaheadLayoutCoordinates r0 = (LookaheadLayoutCoordinates) $this$toLookaheadCoordinates;
    L6:
        if (r0 != null) goto L16;
        Intrinsics.checkNotNull($this$toLookaheadCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        NodeCoordinator it = (NodeCoordinator) $this$toLookaheadCoordinates;
        LookaheadDelegate r2 = it.getLookaheadDelegate();
        if (r2 == null) goto L13;
        LookaheadLayoutCoordinates r3 = r2.getLookaheadLayoutCoordinates();
        if (r3 == null) goto L13;
        NodeCoordinator r4 = r3;
    L15:
        return r4;
    L13:
        r4 = it;
        goto L15
    L16:
        return r0;
    L5:
        r0 = null;
        goto L6
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope $this$lookaheadScopeCoordinates) {
        Function0<? extends LayoutCoordinates> r0 = this.scopeCoordinates;
        Intrinsics.checkNotNull(r0);
        return r0.invoke();
    }
}
