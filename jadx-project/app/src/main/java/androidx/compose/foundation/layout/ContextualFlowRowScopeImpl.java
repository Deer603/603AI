package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ContextualFlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0097\u0001J!\u0010\u0015\u001a\u00020\u0012*\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0017H\u0097\u0001J\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0097\u0001J\r\u0010\u001b\u001a\u00020\u0012*\u00020\u0012H\u0097\u0001J\u0014\u0010\u001c\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J!\u0010\u001f\u001a\u00020\u0012*\u00020\u00122\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020!H\u0097\u0001R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\b\u001a\u00020\u0007X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u00020\u0007X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowScopeImpl;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "lineIndex", "", "indexInLine", "maxWidthInLine", "Landroidx/compose/ui/unit/Dp;", "maxHeight", "(IIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndexInLine", "()I", "getLineIndex", "getMaxHeight-D9Ej5fM", "()F", "F", "getMaxWidthInLine-D9Ej5fM", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "fillMaxRowHeight", "fraction", "", "weight", "fill", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ContextualFlowRowScopeImpl implements RowScope, ContextualFlowRowScope {
    public static final int $stable = 0;
    private final /* synthetic */ RowScopeInstance $$delegate_0;
    private final int indexInLine;
    private final int lineIndex;
    private final float maxHeight;
    private final float maxWidthInLine;

    static {
    }

    public /* synthetic */ ContextualFlowRowScopeImpl(int r1, int r2, float r3, float r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
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

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier weight(Modifier r2, float r3, boolean r4) {
        return this.$$delegate_0.weight(r2, r3, r4);
    }

    private ContextualFlowRowScopeImpl(int lineIndex, int indexInLine, float maxWidthInLine, float maxHeight) {
        this.lineIndex = lineIndex;
        this.indexInLine = indexInLine;
        this.maxWidthInLine = maxWidthInLine;
        this.maxHeight = maxHeight;
        this.$$delegate_0 = RowScopeInstance.INSTANCE;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    public int getLineIndex() {
        return this.lineIndex;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    public int getIndexInLine() {
        return this.indexInLine;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    /* JADX INFO: renamed from: getMaxWidthInLine-D9Ej5fM */
    public float mo644getMaxWidthInLineD9Ej5fM() {
        return this.maxWidthInLine;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM */
    public float mo643getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    public Modifier fillMaxRowHeight(Modifier $this$fillMaxRowHeight, float fraction) {
        boolean value$iv = false;
        if (0.0f > fraction) goto L8;
        if (fraction > 1.0f) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("invalid fraction " + fraction + "; must be >= 0 and <= 1.0");
    L11:
        return $this$fillMaxRowHeight.then(new FillCrossAxisSizeElement(fraction));
    }
}
