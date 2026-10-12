package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: RootMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final int $stable = 0;
    public static final RootMeasurePolicy INSTANCE = null;

    static {
        INSTANCE = new RootMeasurePolicy();
    }

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo32measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends Measurable> r23, long constraints) {
        switch(r23.size()) {
            case 0: goto L13;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        int maxWidth = 0;
        List target$iv = new ArrayList(r23.size());
        int index$iv$iv = 0;
        int r11 = r23.size();
        int maxHeight = 0;
    L7:
        if (index$iv$iv >= r11) goto L9;
        Object item$iv$iv = r23.get(index$iv$iv);
        Measurable it = (Measurable) item$iv$iv;
        Placeable $this$measure_3p2s80s_u24lambda_u241_u24lambda_u240 = it.mo5714measureBRTryo0(constraints);
        maxWidth = Math.max($this$measure_3p2s80s_u24lambda_u241_u24lambda_u240.getWidth(), maxWidth);
        maxHeight = Math.max($this$measure_3p2s80s_u24lambda_u241_u24lambda_u240.getHeight(), maxHeight);
        target$iv.add($this$measure_3p2s80s_u24lambda_u241_u24lambda_u240);
        index$iv$iv = index$iv$iv + 1;
        goto L7
    L9:
        final List placeables = target$iv;
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, ConstraintsKt.m6943constrainWidthK40F9xA(constraints, maxWidth), ConstraintsKt.m6942constrainHeightK40F9xA(constraints, maxHeight), null, new RootMeasurePolicy$measure$3(placeables), 4, null);
    L5:
        final Placeable placeable = r23.get(0).mo5714measureBRTryo0(constraints);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, ConstraintsKt.m6943constrainWidthK40F9xA(constraints, placeable.getWidth()), ConstraintsKt.m6942constrainHeightK40F9xA(constraints, placeable.getHeight()), null, new RootMeasurePolicy$measure$2(placeable), 4, null);
    L13:
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, Constraints.m6928getMinWidthimpl(constraints), Constraints.m6927getMinHeightimpl(constraints), null, RootMeasurePolicy$measure$1.INSTANCE, 4, null);
    }
}
