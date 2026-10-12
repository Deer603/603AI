package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TouchBoundsExpansion.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u0011\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000bJ\u0016\u0010\u0013\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000bJ\u0016\u0010\u0015\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000bJ\u0016\u0010\u0017\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000bJ\t\u0010\u0019\u001a\u00020\bHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u001b\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020(HÖ\u0001R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "isLayoutDirectionAware", "", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM", "()F", "F", "getEnd-D9Ej5fM", "()Z", "getStart-D9Ej5fM", "getTop-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "component5", "copy", "copy-lDy3nrA", "(FFFFZ)Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "equals", "other", "hashCode", "", "roundToTouchBoundsExpansion", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "density", "Landroidx/compose/ui/unit/Density;", "roundToTouchBoundsExpansion-TW6G1oQ", "(Landroidx/compose/ui/unit/Density;)J", "toString", "", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DpTouchBoundsExpansion {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private final float bottom;
    private final float end;
    private final boolean isLayoutDirectionAware;
    private final float start;
    private final float top;

    /* JADX INFO: compiled from: TouchBoundsExpansion.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/DpTouchBoundsExpansion$Companion;", "", "()V", "Absolute", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "left", "Landroidx/compose/ui/unit/Dp;", "top", "right", "bottom", "Absolute-a9UjIt4", "(FFFF)Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: Absolute-a9UjIt4$default, reason: not valid java name */
        public static /* synthetic */ DpTouchBoundsExpansion m5873Absolutea9UjIt4$default(Companion r1, float r2, float r3, float r4, float r5, int r6, Object r7) {
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
            return r1.m5874Absolutea9UjIt4(r2, r3, r4, r5);
        }

        /* JADX INFO: renamed from: Absolute-a9UjIt4, reason: not valid java name */
        public final DpTouchBoundsExpansion m5874Absolutea9UjIt4(float left, float top, float right, float bottom) {
            return new DpTouchBoundsExpansion(left, top, right, bottom, false, null);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public /* synthetic */ DpTouchBoundsExpansion(float r1, float r2, float r3, float r4, boolean r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: copy-lDy3nrA$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m5862copylDy3nrA$default(DpTouchBoundsExpansion r0, float r1, float r2, float r3, float r4, boolean r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.start;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.top;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.end;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.bottom;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.isLayoutDirectionAware;
    L17:
        float r8 = r4;
        boolean r9 = r5;
        float r10 = r3;
        float r11 = r1;
        return r0.m5867copylDy3nrA(r11, r2, r10, r8, r9);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m5863component1D9Ej5fM() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m5864component2D9Ej5fM() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m5865component3D9Ej5fM() {
        return this.end;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m5866component4D9Ej5fM() {
        return this.bottom;
    }

    public final boolean component5() {
        return this.isLayoutDirectionAware;
    }

    /* JADX INFO: renamed from: copy-lDy3nrA, reason: not valid java name */
    public final DpTouchBoundsExpansion m5867copylDy3nrA(float r8, float r9, float r10, float r11, boolean r12) {
        return new DpTouchBoundsExpansion(r8, r9, r10, r11, r12, null);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof DpTouchBoundsExpansion) == true) goto L8;
        return false;
    L8:
        DpTouchBoundsExpansion r1 = (DpTouchBoundsExpansion) r6;
        if (Dp.m6978equalsimpl0(this.start, r1.start) == true) goto L12;
        return false;
    L12:
        if (Dp.m6978equalsimpl0(this.top, r1.top) == true) goto L15;
        return false;
    L15:
        if (Dp.m6978equalsimpl0(this.end, r1.end) == true) goto L18;
        return false;
    L18:
        if (Dp.m6978equalsimpl0(this.bottom, r1.bottom) == true) goto L21;
        return false;
    L21:
        if (this.isLayoutDirectionAware == r1.isLayoutDirectionAware) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Dp.m6979hashCodeimpl(this.start) * 31) + Dp.m6979hashCodeimpl(this.top)) * 31) + Dp.m6979hashCodeimpl(this.end)) * 31) + Dp.m6979hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.isLayoutDirectionAware);
    }

    public String toString() {
        return "DpTouchBoundsExpansion(start=" + Dp.m6984toStringimpl(this.start) + ", top=" + Dp.m6984toStringimpl(this.top) + ", end=" + Dp.m6984toStringimpl(this.end) + ", bottom=" + Dp.m6984toStringimpl(this.bottom) + ", isLayoutDirectionAware=" + this.isLayoutDirectionAware + ')';
    }

    private DpTouchBoundsExpansion(float start, float top, float end, float bottom, boolean isLayoutDirectionAware) {
        this.start = start;
        this.top = top;
        this.end = end;
        this.bottom = bottom;
        this.isLayoutDirectionAware = isLayoutDirectionAware;
        boolean value$iv = true;
        if (this.start < 0.0f) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("Left must be non-negative");
    L10:
        if (this.top < 0.0f) goto L12;
        boolean value$iv3 = true;
    L14:
        if (value$iv3 == true) goto L17;
        InlineClassHelperKt.throwIllegalArgumentException("Top must be non-negative");
    L17:
        if (this.end < 0.0f) goto L19;
        boolean value$iv4 = true;
    L21:
        if (value$iv4 == true) goto L24;
        InlineClassHelperKt.throwIllegalArgumentException("Right must be non-negative");
    L24:
        if (this.bottom >= 0.0f) goto L28;
        value$iv = false;
    L28:
        if (value$iv == true) goto L32;
        InlineClassHelperKt.throwIllegalArgumentException("Bottom must be non-negative");
        return;
    L32:
        return;
    L19:
        value$iv4 = false;
        goto L21
    L12:
        value$iv3 = false;
        goto L14
    L5:
        value$iv2 = false;
        goto L7
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m5870getStartD9Ej5fM() {
        return this.start;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m5871getTopD9Ej5fM() {
        return this.top;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m5869getEndD9Ej5fM() {
        return this.end;
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m5868getBottomD9Ej5fM() {
        return this.bottom;
    }

    public final boolean isLayoutDirectionAware() {
        return this.isLayoutDirectionAware;
    }

    /* JADX INFO: renamed from: roundToTouchBoundsExpansion-TW6G1oQ, reason: not valid java name */
    public final long m5872roundToTouchBoundsExpansionTW6G1oQ(Density density) {
        return TouchBoundsExpansion.m6058constructorimpl(TouchBoundsExpansion.Companion.pack$ui_release(density.mo370roundToPx0680j_4(this.start), density.mo370roundToPx0680j_4(this.top), density.mo370roundToPx0680j_4(this.end), density.mo370roundToPx0680j_4(this.bottom), this.isLayoutDirectionAware));
    }
}
