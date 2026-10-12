package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a*\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"absoluteOffset", "Landroidx/compose/ui/Modifier;", "offset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "x", "Landroidx/compose/ui/unit/Dp;", "y", "absoluteOffset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "offset-VpY3zN4", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OffsetKt {
    /* JADX INFO: renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m685offsetVpY3zN4$default(Modifier r1, float r2, float r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = Dp.m6973constructorimpl(0);
    L6:
        if ((r4 & 2) == 0) goto L9;
        r3 = Dp.m6973constructorimpl(0);
    L9:
        return m684offsetVpY3zN4(r1, r2, r3);
    }

    /* JADX INFO: renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m684offsetVpY3zN4(Modifier $this$offset_u2dVpY3zN4, final float x, final float y) {
        return $this$offset_u2dVpY3zN4.then(new OffsetElement(x, y, true, new C02851(x, y), null));
    }

    /* JADX INFO: renamed from: absoluteOffset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m683absoluteOffsetVpY3zN4$default(Modifier r1, float r2, float r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = Dp.m6973constructorimpl(0);
    L6:
        if ((r4 & 2) == 0) goto L9;
        r3 = Dp.m6973constructorimpl(0);
    L9:
        return m682absoluteOffsetVpY3zN4(r1, r2, r3);
    }

    /* JADX INFO: renamed from: absoluteOffset-VpY3zN4, reason: not valid java name */
    public static final Modifier m682absoluteOffsetVpY3zN4(Modifier $this$absoluteOffset_u2dVpY3zN4, final float x, final float y) {
        return $this$absoluteOffset_u2dVpY3zN4.then(new OffsetElement(x, y, false, new AnonymousClass1(x, y), null));
    }

    public static final Modifier offset(Modifier $this$offset, final Function1<? super Density, IntOffset> r4) {
        return $this$offset.then(new OffsetPxElement(r4, true, new C02862(r4)));
    }

    public static final Modifier absoluteOffset(Modifier $this$absoluteOffset, final Function1<? super Density, IntOffset> r4) {
        return $this$absoluteOffset.then(new OffsetPxElement(r4, false, new AnonymousClass2(r4)));
    }
}
