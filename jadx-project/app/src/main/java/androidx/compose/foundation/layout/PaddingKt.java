package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a:\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a>\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a*\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a>\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PaddingKt {
    /* JADX INFO: renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m729paddingqDBjuR0$default(Modifier r1, float r2, float r3, float r4, float r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L5;
        r2 = Dp.m6973constructorimpl(0);
    L5:
        int $i$f$getDp = r6 & 2;
        if ($i$f$getDp == 0) goto L8;
        r3 = Dp.m6973constructorimpl(0);
    L8:
        int $i$f$getDp2 = r6 & 4;
        if ($i$f$getDp2 == 0) goto L12;
        r4 = Dp.m6973constructorimpl(0);
    L12:
        if ((r6 & 8) == 0) goto L15;
        r5 = Dp.m6973constructorimpl(0);
    L15:
        return m728paddingqDBjuR0(r1, r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m728paddingqDBjuR0(Modifier $this$padding_u2dqDBjuR0, final float start, final float top, final float end, final float bottom) {
        boolean r5 = true;
        return $this$padding_u2dqDBjuR0.then(new PaddingElement(start, top, end, bottom, r5, new AnonymousClass1(start, top, end, bottom), null));
    }

    /* JADX INFO: renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m727paddingVpY3zN4$default(Modifier r1, float r2, float r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = Dp.m6973constructorimpl(0);
    L6:
        if ((r4 & 2) == 0) goto L9;
        r3 = Dp.m6973constructorimpl(0);
    L9:
        return m726paddingVpY3zN4(r1, r2, r3);
    }

    /* JADX INFO: renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m726paddingVpY3zN4(Modifier $this$padding_u2dVpY3zN4, final float horizontal, final float vertical) {
        boolean r5 = true;
        return $this$padding_u2dVpY3zN4.then(new PaddingElement(horizontal, vertical, horizontal, vertical, r5, new AnonymousClass2(horizontal, vertical), null));
    }

    /* JADX INFO: renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m725padding3ABfNKs(Modifier $this$padding_u2d3ABfNKs, final float all) {
        boolean r5 = true;
        return $this$padding_u2d3ABfNKs.then(new PaddingElement(all, all, all, all, r5, new AnonymousClass3(all), null));
    }

    public static final Modifier padding(Modifier $this$padding, final PaddingValues paddingValues) {
        return $this$padding.then(new PaddingValuesElement(paddingValues, new AnonymousClass4(paddingValues)));
    }

    /* JADX INFO: renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m724absolutePaddingqDBjuR0$default(Modifier r1, float r2, float r3, float r4, float r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L5;
        r2 = Dp.m6973constructorimpl(0);
    L5:
        int $i$f$getDp = r6 & 2;
        if ($i$f$getDp == 0) goto L8;
        r3 = Dp.m6973constructorimpl(0);
    L8:
        int $i$f$getDp2 = r6 & 4;
        if ($i$f$getDp2 == 0) goto L12;
        r4 = Dp.m6973constructorimpl(0);
    L12:
        if ((r6 & 8) == 0) goto L15;
        r5 = Dp.m6973constructorimpl(0);
    L15:
        return m723absolutePaddingqDBjuR0(r1, r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m723absolutePaddingqDBjuR0(Modifier $this$absolutePadding_u2dqDBjuR0, final float left, final float top, final float right, final float bottom) {
        boolean r5 = false;
        return $this$absolutePadding_u2dqDBjuR0.then(new PaddingElement(left, top, right, bottom, r5, new PaddingKt$absolutePadding$1(left, top, right, bottom), null));
    }

    public static final float calculateStartPadding(PaddingValues $this$calculateStartPadding, LayoutDirection layoutDirection) {
        if (layoutDirection != LayoutDirection.Ltr) goto L6;
        return $this$calculateStartPadding.mo675calculateLeftPaddingu2uoSUM(layoutDirection);
    L6:
        return $this$calculateStartPadding.mo676calculateRightPaddingu2uoSUM(layoutDirection);
    }

    public static final float calculateEndPadding(PaddingValues $this$calculateEndPadding, LayoutDirection layoutDirection) {
        if (layoutDirection != LayoutDirection.Ltr) goto L6;
        return $this$calculateEndPadding.mo676calculateRightPaddingu2uoSUM(layoutDirection);
    L6:
        return $this$calculateEndPadding.mo675calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    /* JADX INFO: renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m718PaddingValues0680j_4(float all) {
        return new PaddingValuesImpl(all, all, all, all, null);
    }

    /* JADX INFO: renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m720PaddingValuesYgX7TsA$default(float r1, float r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dp.m6973constructorimpl(0);
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Dp.m6973constructorimpl(0);
    L9:
        return m719PaddingValuesYgX7TsA(r1, r2);
    }

    /* JADX INFO: renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m719PaddingValuesYgX7TsA(float horizontal, float vertical) {
        return new PaddingValuesImpl(horizontal, vertical, horizontal, vertical, null);
    }

    /* JADX INFO: renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m722PaddingValuesa9UjIt4$default(float r1, float r2, float r3, float r4, int r5, Object r6) {
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
        return m721PaddingValuesa9UjIt4(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m721PaddingValuesa9UjIt4(float start, float top, float end, float bottom) {
        return new PaddingValuesImpl(start, top, end, bottom, null);
    }
}
