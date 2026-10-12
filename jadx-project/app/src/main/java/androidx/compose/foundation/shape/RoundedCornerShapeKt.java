package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: RoundedCornerShape.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0011\u001a.\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00112\b\b\u0002\u0010\r\u001a\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u0011\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013\u001a.\u0010\u0004\u001a\u00020\u00012\b\b\u0003\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0003\u0010\u0016\u001a\u00020\u00132\b\b\u0003\u0010\u0017\u001a\u00020\u0013\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"CircleShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCircleShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "RoundedCornerShape", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "size", "Landroidx/compose/ui/unit/Dp;", "RoundedCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/RoundedCornerShape;", "topStart", "topEnd", "bottomEnd", "bottomStart", "RoundedCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/RoundedCornerShape;", "", "percent", "", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RoundedCornerShapeKt {
    private static final RoundedCornerShape CircleShape = null;

    static {
        CircleShape = RoundedCornerShape(50);
    }

    public static final RoundedCornerShape getCircleShape() {
        return CircleShape;
    }

    public static final RoundedCornerShape RoundedCornerShape(CornerSize corner) {
        return new RoundedCornerShape(corner, corner, corner, corner);
    }

    /* JADX INFO: renamed from: RoundedCornerShape-0680j_4, reason: not valid java name */
    public static final RoundedCornerShape m1018RoundedCornerShape0680j_4(float size) {
        return RoundedCornerShape(CornerSizeKt.m1010CornerSize0680j_4(size));
    }

    public static final RoundedCornerShape RoundedCornerShape(float size) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(size));
    }

    public static final RoundedCornerShape RoundedCornerShape(int percent) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(percent));
    }

    /* JADX INFO: renamed from: RoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ RoundedCornerShape m1020RoundedCornerShapea9UjIt4$default(float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L5;
        r1 = Dp.m6973constructorimpl(0);
    L5:
        int $i$f$getDp = r5 & 2;
        if ($i$f$getDp == 0) goto L8;
        r2 = Dp.m6973constructorimpl(0);
    L8:
        int $i$f$getDp2 = r5 & 4;
        if ($i$f$getDp2 == 0) goto L12;
        r3 = Dp.m6973constructorimpl(0);
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = Dp.m6973constructorimpl(0);
    L15:
        return m1019RoundedCornerShapea9UjIt4(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: RoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final RoundedCornerShape m1019RoundedCornerShapea9UjIt4(float topStart, float topEnd, float bottomEnd, float bottomStart) {
        return new RoundedCornerShape(CornerSizeKt.m1010CornerSize0680j_4(topStart), CornerSizeKt.m1010CornerSize0680j_4(topEnd), CornerSizeKt.m1010CornerSize0680j_4(bottomEnd), CornerSizeKt.m1010CornerSize0680j_4(bottomStart));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = 0.0f;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = 0.0f;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = 0.0f;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = 0.0f;
    L15:
        return RoundedCornerShape(r1, r2, r3, r4);
    }

    public static final RoundedCornerShape RoundedCornerShape(float topStart, float topEnd, float bottomEnd, float bottomStart) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(topStart), CornerSizeKt.CornerSize(topEnd), CornerSizeKt.CornerSize(bottomEnd), CornerSizeKt.CornerSize(bottomStart));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = 0;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = 0;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = 0;
    L15:
        return RoundedCornerShape(r1, r2, r3, r4);
    }

    public static final RoundedCornerShape RoundedCornerShape(int topStartPercent, int topEndPercent, int bottomEndPercent, int bottomStartPercent) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(topStartPercent), CornerSizeKt.CornerSize(topEndPercent), CornerSizeKt.CornerSize(bottomEndPercent), CornerSizeKt.CornerSize(bottomStartPercent));
    }
}
