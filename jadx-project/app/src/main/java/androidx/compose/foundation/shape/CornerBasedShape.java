package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: CornerBasedShape.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003J0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H&J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "topStart", "Landroidx/compose/foundation/shape/CornerSize;", "topEnd", "bottomEnd", "bottomStart", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "getBottomEnd", "()Landroidx/compose/foundation/shape/CornerSize;", "getBottomStart", "getTopEnd", "getTopStart", "copy", "all", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;
    private final CornerSize bottomEnd;
    private final CornerSize bottomStart;
    private final CornerSize topEnd;
    private final CornerSize topStart;

    static {
    }

    public abstract CornerBasedShape copy(CornerSize r1, CornerSize r2, CornerSize r3, CornerSize r4);

    /* JADX INFO: renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo1001createOutlineLjSzlW0(long r1, float r3, float r4, float r5, float r6, LayoutDirection r7);

    public CornerBasedShape(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart) {
        this.topStart = topStart;
        this.topEnd = topEnd;
        this.bottomEnd = bottomEnd;
        this.bottomStart = bottomStart;
    }

    public final CornerSize getTopStart() {
        return this.topStart;
    }

    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Outline mo290createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        float topStart = this.topStart.mo1009toPxTmRCtEA(size, density);
        float topEnd = this.topEnd.mo1009toPxTmRCtEA(size, density);
        float bottomEnd = this.bottomEnd.mo1009toPxTmRCtEA(size, density);
        float bottomStart = this.bottomStart.mo1009toPxTmRCtEA(size, density);
        float minDimension = Size.m4193getMinDimensionimpl(size);
        if ((topStart + bottomStart) <= minDimension) goto L5;
        float scale = minDimension / (topStart + bottomStart);
        topStart = topStart * scale;
        float scale2 = bottomStart * scale;
    L7:
        if ((topEnd + bottomEnd) <= minDimension) goto L9;
        float scale3 = minDimension / (topEnd + bottomEnd);
        float topEnd2 = topEnd * scale3;
        float scale4 = bottomEnd * scale3;
        float bottomEnd2 = topEnd2;
    L11:
        if (topStart >= 0.0f) goto L13;
    L19:
        boolean value$iv = false;
    L21:
        if (value$iv == true) goto L24;
        InlineClassHelperKt.throwIllegalArgumentException("Corner size in Px can't be negative(topStart = " + topStart + ", topEnd = " + bottomEnd2 + ", bottomEnd = " + scale4 + ", bottomStart = " + scale2 + ")!");
    L24:
        return mo1001createOutlineLjSzlW0(size, topStart, bottomEnd2, scale4, scale2, layoutDirection);
    L13:
        if (bottomEnd2 < 0.0f) goto L19;
        if (scale4 < 0.0f) goto L19;
        if (scale2 < 0.0f) goto L19;
        value$iv = true;
        goto L21
    L9:
        scale4 = bottomEnd;
        bottomEnd2 = topEnd;
        goto L11
    L5:
        scale2 = bottomStart;
        goto L7
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape r0, CornerSize r1, CornerSize r2, CornerSize r3, CornerSize r4, int r5, Object r6) {
        if (r6 != null) goto L18;
        if ((r5 & 1) == 0) goto L7;
        r1 = r0.topStart;
    L7:
        if ((r5 & 2) == 0) goto L10;
        r2 = r0.topEnd;
    L10:
        if ((r5 & 4) == 0) goto L13;
        r3 = r0.bottomEnd;
    L13:
        if ((r5 & 8) == 0) goto L16;
        r4 = r0.bottomStart;
    L16:
        return r0.copy(r1, r2, r3, r4);
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final CornerBasedShape copy(CornerSize all) {
        return copy(all, all, all, all);
    }
}
