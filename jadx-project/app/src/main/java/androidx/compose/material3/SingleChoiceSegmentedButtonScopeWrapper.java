package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SegmentedButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0097\u0001J!\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0097\u0001J\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0097\u0001J\r\u0010\u0010\u001a\u00020\u0006*\u00020\u0006H\u0097\u0001J!\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0097\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/SingleChoiceSegmentedButtonScopeWrapper;", "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;", "Landroidx/compose/foundation/layout/RowScope;", "scope", "(Landroidx/compose/foundation/layout/RowScope;)V", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "weight", "", "fill", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SingleChoiceSegmentedButtonScopeWrapper implements SingleChoiceSegmentedButtonRowScope, RowScope {
    private final /* synthetic */ RowScope $$delegate_0;

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

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier weight(Modifier r2, float r3, boolean r4) {
        return this.$$delegate_0.weight(r2, r3, r4);
    }

    public SingleChoiceSegmentedButtonScopeWrapper(RowScope scope) {
        this.$$delegate_0 = scope;
    }
}
