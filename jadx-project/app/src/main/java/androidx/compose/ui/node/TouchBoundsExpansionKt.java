package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: TouchBoundsExpansion.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u000b¢\u0006\u0002\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"DpTouchBoundsExpansion", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "DpTouchBoundsExpansion-a9UjIt4", "(FFFF)Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "TouchBoundsExpansion", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "", "(IIII)J", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TouchBoundsExpansionKt {
    public static /* synthetic */ long TouchBoundsExpansion$default(int r1, int r2, int r3, int r4, int r5, Object r6) {
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
        return TouchBoundsExpansion(r1, r2, r3, r4);
    }

    public static final long TouchBoundsExpansion(int start, int top, int end, int bottom) {
        boolean value$iv = true;
        if (start < 0) goto L6;
        if (start >= 32768) goto L6;
        boolean value$iv2 = true;
    L8:
        if (value$iv2 == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
    L11:
        if (top < 0) goto L14;
        if (top >= 32768) goto L14;
        boolean value$iv3 = true;
    L16:
        if (value$iv3 == true) goto L19;
        InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
    L19:
        if (end < 0) goto L22;
        if (end >= 32768) goto L22;
        boolean value$iv4 = true;
    L24:
        if (value$iv4 == true) goto L27;
        InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
    L27:
        if (bottom < 0) goto L30;
        if (bottom >= 32768) goto L30;
    L32:
        if (value$iv == true) goto L35;
        InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
    L35:
        return TouchBoundsExpansion.m6058constructorimpl(TouchBoundsExpansion.Companion.pack$ui_release(start, top, end, bottom, true));
    L30:
        value$iv = false;
    L22:
        value$iv4 = false;
    L14:
        value$iv3 = false;
    L6:
        value$iv2 = false;
        goto L8
    }

    /* JADX INFO: renamed from: DpTouchBoundsExpansion-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m6073DpTouchBoundsExpansiona9UjIt4$default(float r1, float r2, float r3, float r4, int r5, Object r6) {
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
        return m6072DpTouchBoundsExpansiona9UjIt4(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: DpTouchBoundsExpansion-a9UjIt4, reason: not valid java name */
    public static final DpTouchBoundsExpansion m6072DpTouchBoundsExpansiona9UjIt4(float start, float top, float end, float bottom) {
        return new DpTouchBoundsExpansion(start, top, end, bottom, true, null);
    }
}
