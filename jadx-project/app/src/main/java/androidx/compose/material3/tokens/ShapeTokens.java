package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: ShapeTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/tokens/ShapeTokens;", "", "()V", "CornerExtraLarge", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCornerExtraLarge", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "CornerExtraLargeTop", "getCornerExtraLargeTop", "CornerExtraSmall", "getCornerExtraSmall", "CornerExtraSmallTop", "getCornerExtraSmallTop", "CornerFull", "getCornerFull", "CornerLarge", "getCornerLarge", "CornerLargeEnd", "getCornerLargeEnd", "CornerLargeTop", "getCornerLargeTop", "CornerMedium", "getCornerMedium", "CornerNone", "Landroidx/compose/ui/graphics/Shape;", "getCornerNone", "()Landroidx/compose/ui/graphics/Shape;", "CornerSmall", "getCornerSmall", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShapeTokens {
    public static final int $stable = 0;
    private static final RoundedCornerShape CornerExtraLarge = null;
    private static final RoundedCornerShape CornerExtraLargeTop = null;
    private static final RoundedCornerShape CornerExtraSmall = null;
    private static final RoundedCornerShape CornerExtraSmallTop = null;
    private static final RoundedCornerShape CornerFull = null;
    private static final RoundedCornerShape CornerLarge = null;
    private static final RoundedCornerShape CornerLargeEnd = null;
    private static final RoundedCornerShape CornerLargeTop = null;
    private static final RoundedCornerShape CornerMedium = null;
    private static final Shape CornerNone = null;
    private static final RoundedCornerShape CornerSmall = null;
    public static final ShapeTokens INSTANCE = null;

    private ShapeTokens() {
    }

    static {
        INSTANCE = new ShapeTokens();
        CornerExtraLarge = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl((float) 28.0d));
        CornerExtraLargeTop = RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl((float) 28.0d), Dp.m6973constructorimpl((float) 28.0d), Dp.m6973constructorimpl((float) 0.0d), Dp.m6973constructorimpl((float) 0.0d));
        CornerExtraSmall = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl((float) 4.0d));
        CornerExtraSmallTop = RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl((float) 4.0d), Dp.m6973constructorimpl((float) 4.0d), Dp.m6973constructorimpl((float) 0.0d), Dp.m6973constructorimpl((float) 0.0d));
        CornerFull = RoundedCornerShapeKt.getCircleShape();
        CornerLarge = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl((float) 16.0d));
        CornerLargeEnd = RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl((float) 0.0d), Dp.m6973constructorimpl((float) 16.0d), Dp.m6973constructorimpl((float) 16.0d), Dp.m6973constructorimpl((float) 0.0d));
        CornerLargeTop = RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl((float) 16.0d), Dp.m6973constructorimpl((float) 16.0d), Dp.m6973constructorimpl((float) 0.0d), Dp.m6973constructorimpl((float) 0.0d));
        CornerMedium = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl((float) 12.0d));
        CornerNone = RectangleShapeKt.getRectangleShape();
        CornerSmall = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl((float) 8.0d));
    }

    public final RoundedCornerShape getCornerExtraLarge() {
        return CornerExtraLarge;
    }

    public final RoundedCornerShape getCornerExtraLargeTop() {
        return CornerExtraLargeTop;
    }

    public final RoundedCornerShape getCornerExtraSmall() {
        return CornerExtraSmall;
    }

    public final RoundedCornerShape getCornerExtraSmallTop() {
        return CornerExtraSmallTop;
    }

    public final RoundedCornerShape getCornerFull() {
        return CornerFull;
    }

    public final RoundedCornerShape getCornerLarge() {
        return CornerLarge;
    }

    public final RoundedCornerShape getCornerLargeEnd() {
        return CornerLargeEnd;
    }

    public final RoundedCornerShape getCornerLargeTop() {
        return CornerLargeTop;
    }

    public final RoundedCornerShape getCornerMedium() {
        return CornerMedium;
    }

    public final Shape getCornerNone() {
        return CornerNone;
    }

    public final RoundedCornerShape getCornerSmall() {
        return CornerSmall;
    }
}
