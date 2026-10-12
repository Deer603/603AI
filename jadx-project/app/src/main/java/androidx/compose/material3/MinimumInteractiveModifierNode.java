package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: InteractiveComponentSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/MinimumInteractiveModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    public static final int $stable = 0;

    static {
    }

    public MinimumInteractiveModifierNode() {
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        float $this$coerceAtLeast_u2dYgX7TsA$iv = ((Dp) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m6987unboximpl();
        float minimumValue$iv = Dp.m6973constructorimpl(0);
        float $this$coerceAtLeast_u2dYgX7TsA$iv2 = Dp.m6973constructorimpl(RangesKt.coerceAtLeast($this$coerceAtLeast_u2dYgX7TsA$iv, minimumValue$iv));
        final Placeable placeable = measurable.mo5714measureBRTryo0(constraints);
        int sizePx = 0;
        if (isAttached() == true) goto L5;
    L9:
        boolean enforcement = false;
    L11:
        if (Float.isNaN($this$coerceAtLeast_u2dYgX7TsA$iv2) == true) goto L13;
        sizePx = $this$measure_u2d3p2s80s.mo370roundToPx0680j_4($this$coerceAtLeast_u2dYgX7TsA$iv2);
    L13:
        if (enforcement == false) goto L15;
        int r4 = Math.max(placeable.getWidth(), sizePx);
    L16:
        final int width = r4;
        if (enforcement == false) goto L19;
        final int height = Math.max(placeable.getHeight(), sizePx);
    L21:
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, height, null, new MinimumInteractiveModifierNode$measure$1(width, placeable, height), 4, null);
    L19:
        height = placeable.getHeight();
        goto L21
    L15:
        r4 = placeable.getWidth();
        goto L16
    L5:
        if (Float.isNaN($this$coerceAtLeast_u2dYgX7TsA$iv2) == true) goto L9;
        int $this$dp$iv = Dp.m6972compareTo0680j_4($this$coerceAtLeast_u2dYgX7TsA$iv2, Dp.m6973constructorimpl(0));
        if ($this$dp$iv <= 0) goto L9;
        enforcement = true;
        goto L11
    }
}
