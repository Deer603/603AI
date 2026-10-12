package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Background.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u0007\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"background", "Landroidx/compose/ui/Modifier;", "brush", "Landroidx/compose/ui/graphics/Brush;", "shape", "Landroidx/compose/ui/graphics/Shape;", "alpha", "", "color", "Landroidx/compose/ui/graphics/Color;", "background-bw27NRU", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BackgroundKt {
    /* JADX INFO: renamed from: background-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m234backgroundbw27NRU$default(Modifier r0, long r1, Shape r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r3 = RectangleShapeKt.getRectangleShape();
    L6:
        return m233backgroundbw27NRU(r0, r1, r3);
    }

    /* JADX INFO: renamed from: background-bw27NRU, reason: not valid java name */
    public static final Modifier m233backgroundbw27NRU(Modifier $this$background_u2dbw27NRU, final long color, final Shape shape) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(color, shape);
    L7:
        return $this$background_u2dbw27NRU.then(new BackgroundElement(color, null, 1.0f, shape, r1, 2, null));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static /* synthetic */ Modifier background$default(Modifier r0, Brush r1, Shape r2, float r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = RectangleShapeKt.getRectangleShape();
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = 1.0f;
    L9:
        return background(r0, r1, r2, r3);
    }

    public static final Modifier background(Modifier $this$background, final Brush brush, final Shape shape, final float alpha) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new BackgroundKt$background$$inlined$debugInspectorInfo$1(alpha, brush, shape);
    L7:
        return $this$background.then(new BackgroundElement(0, brush, alpha, shape, r2, 1, null));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }
}
