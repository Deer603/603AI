package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ&\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u00020\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "before", "Landroidx/compose/ui/unit/TextUnit;", "after", "(Landroidx/compose/ui/layout/AlignmentLine;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAfter-XSAIIZE", "()J", "setAfter--R2X_6o", "(J)V", "J", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "setAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)V", "getBefore-XSAIIZE", "setBefore--R2X_6o", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AlignmentLineOffsetTextUnitNode extends Modifier.Node implements LayoutModifierNode {
    private long after;
    private AlignmentLine alignmentLine;
    private long before;

    public /* synthetic */ AlignmentLineOffsetTextUnitNode(AlignmentLine r1, long r2, long r4, DefaultConstructorMarker r6) {
        this(r1, r2, r4);
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    public final void setAlignmentLine(AlignmentLine r1) {
        this.alignmentLine = r1;
    }

    /* JADX INFO: renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m593getBeforeXSAIIZE() {
        return this.before;
    }

    /* JADX INFO: renamed from: setBefore--R2X_6o, reason: not valid java name */
    public final void m595setBeforeR2X_6o(long r1) {
        this.before = r1;
    }

    /* JADX INFO: renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m592getAfterXSAIIZE() {
        return this.after;
    }

    /* JADX INFO: renamed from: setAfter--R2X_6o, reason: not valid java name */
    public final void m594setAfterR2X_6o(long r1) {
        this.after = r1;
    }

    private AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long before, long after) {
        this.alignmentLine = alignmentLine;
        this.before = before;
        this.after = after;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        AlignmentLine r1 = this.alignmentLine;
        long $this$isUnspecified$iv = this.before;
        boolean r5 = true;
        if (TextUnit.m7165getRawTypeimpl($this$isUnspecified$iv) != 0) goto L5;
        int r0 = 1;
    L6:
        if (r0 != 0) goto L8;
        float r2 = $this$measure_u2d3p2s80s.mo371toDpGaN1DYA(this.before);
    L9:
        float r3 = r2;
        long $this$isUnspecified$iv2 = this.after;
        if (TextUnit.m7165getRawTypeimpl($this$isUnspecified$iv2) == 0) goto L13;
        r5 = false;
    L13:
        if (r5 == true) goto L15;
        float r4 = $this$measure_u2d3p2s80s.mo371toDpGaN1DYA(this.after);
    L17:
        return AlignmentLineKt.m574access$alignmentLineOffsetMeasuretjqqzMA($this$measure_u2d3p2s80s, r1, r3, r4, measurable, constraints);
    L15:
        r4 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
        goto L17
    L8:
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
        goto L9
    L5:
        r0 = 0;
        goto L6
    }
}
