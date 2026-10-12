package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0097\u0001J!\u0010\u0013\u001a\u00020\u0010*\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0097\u0001J\u0015\u0010\u0013\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0097\u0001J\r\u0010\u0019\u001a\u00020\u0010*\u00020\u0010H\u0097\u0001J\u0017\u0010\u001a\u001a\u00020\u0010*\u00020\u00102\b\b\u0003\u0010\u001b\u001a\u00020\u001cH\u0097\u0001J\u001f\u0010\u001d\u001a\u00020\u0010*\u00020\u00102\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0097\u0001R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\t¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "state", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)V", "shownItemCount", "", "getShownItemCount", "()I", "shownItemCount$delegate", "Lkotlin/Lazy;", "totalItemCount", "getTotalItemCount", "totalItemCount$delegate", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "fillMaxRowHeight", "fraction", "", "weight", "fill", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowRowOverflowScopeImpl implements FlowRowScope, FlowRowOverflowScope {
    public static final int $stable = 0;
    private final /* synthetic */ FlowRowScopeInstance $$delegate_0;
    private final Lazy shownItemCount$delegate;
    private final FlowLayoutOverflowState state;
    private final Lazy totalItemCount$delegate;

    static {
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier align(Modifier r2, Alignment.Vertical r3) {
        return this.$$delegate_0.align(r2, r3);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier r2, HorizontalAlignmentLine r3) {
        return this.$$delegate_0.alignBy(r2, r3);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier r2, Function1<? super Measured, Integer> r3) {
        return this.$$delegate_0.alignBy(r2, r3);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignByBaseline(Modifier r2) {
        return this.$$delegate_0.alignByBaseline(r2);
    }

    @Override // androidx.compose.foundation.layout.FlowRowScope
    public Modifier fillMaxRowHeight(Modifier r2, float r3) {
        return this.$$delegate_0.fillMaxRowHeight(r2, r3);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier weight(Modifier r2, float r3, boolean r4) {
        return this.$$delegate_0.weight(r2, r3, r4);
    }

    public FlowRowOverflowScopeImpl(FlowLayoutOverflowState state) {
        this.state = state;
        this.$$delegate_0 = FlowRowScopeInstance.INSTANCE;
        this.totalItemCount$delegate = FlowLayoutOverflowKt.lazyInt$default(null, new FlowRowOverflowScopeImpl$totalItemCount$2(this), 1, null);
        this.shownItemCount$delegate = FlowLayoutOverflowKt.lazyInt(this.state.getShownItemLazyErrorMessage$foundation_layout_release(), new FlowRowOverflowScopeImpl$shownItemCount$2(this));
    }

    public static final /* synthetic */ FlowLayoutOverflowState access$getState$p(FlowRowOverflowScopeImpl $this) {
        return $this.state;
    }

    @Override // androidx.compose.foundation.layout.FlowRowOverflowScope
    public int getTotalItemCount() {
        return ((Number) this.totalItemCount$delegate.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.FlowRowOverflowScope
    public int getShownItemCount() {
        return ((Number) this.shownItemCount$delegate.getValue()).intValue();
    }
}
