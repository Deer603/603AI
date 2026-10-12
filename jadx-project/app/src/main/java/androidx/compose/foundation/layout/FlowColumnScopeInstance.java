package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J!\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0097\u0001J\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0097\u0001J\u0014\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J!\u0010\u0012\u001a\u00020\u0005*\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0097\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/layout/FlowColumnScopeInstance;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "()V", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLine", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "fillMaxColumnWidth", "fraction", "", "weight", "fill", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowColumnScopeInstance implements ColumnScope, FlowColumnScope {
    public static final int $stable = 0;
    public static final FlowColumnScopeInstance INSTANCE = null;
    private final /* synthetic */ ColumnScopeInstance $$delegate_0;

    static {
        INSTANCE = new FlowColumnScopeInstance();
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier align(Modifier r2, Alignment.Horizontal r3) {
        return this.$$delegate_0.align(r2, r3);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier alignBy(Modifier r2, VerticalAlignmentLine r3) {
        return this.$$delegate_0.alignBy(r2, r3);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier alignBy(Modifier r2, Function1<? super Measured, Integer> r3) {
        return this.$$delegate_0.alignBy(r2, r3);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier weight(Modifier r2, float r3, boolean r4) {
        return this.$$delegate_0.weight(r2, r3, r4);
    }

    private FlowColumnScopeInstance() {
        this.$$delegate_0 = ColumnScopeInstance.INSTANCE;
    }

    @Override // androidx.compose.foundation.layout.FlowColumnScope
    public Modifier fillMaxColumnWidth(Modifier $this$fillMaxColumnWidth, float fraction) {
        if (fraction >= 0.0f) goto L5;
    L7:
        boolean value$iv = false;
    L9:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("invalid fraction " + fraction + "; must be >= 0 and <= 1.0");
    L12:
        return $this$fillMaxColumnWidth.then(new FillCrossAxisSizeElement(fraction));
    L5:
        if (fraction > 1.0f) goto L7;
        value$iv = true;
        goto L9
    }
}
