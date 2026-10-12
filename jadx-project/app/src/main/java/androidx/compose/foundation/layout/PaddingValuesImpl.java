package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0015\u0010\u0013\u001a\u00020\u0003H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000bJ\u001d\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u0003H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000bJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016R$\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR$\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000bR$\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesImpl;", "Landroidx/compose/foundation/layout/PaddingValues;", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM$annotations", "()V", "getBottom-D9Ej5fM", "()F", "F", "getEnd-D9Ej5fM$annotations", "getEnd-D9Ej5fM", "getStart-D9Ej5fM$annotations", "getStart-D9Ej5fM", "getTop-D9Ej5fM$annotations", "getTop-D9Ej5fM", "calculateBottomPadding", "calculateBottomPadding-D9Ej5fM", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "equals", "", "other", "", "hashCode", "", "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaddingValuesImpl implements PaddingValues {
    public static final int $stable = 0;
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    static {
    }

    public /* synthetic */ PaddingValuesImpl(float r1, float r2, float r3, float r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m742getBottomD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m743getEndD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m744getStartD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m745getTopD9Ej5fM$annotations() {
    }

    private PaddingValuesImpl(float start, float top, float end, float bottom) {
        this.start = start;
        this.top = top;
        this.end = end;
        this.bottom = bottom;
        boolean r2 = true;
        if (this.start < 0.0f) goto L5;
        boolean r0 = true;
    L7:
        if (this.top < 0.0f) goto L9;
        boolean r4 = true;
    L10:
        boolean r1 = r0 & r4;
        if (this.end < 0.0f) goto L13;
        boolean r5 = true;
    L14:
        boolean r3 = r1 & r5;
        if (this.bottom >= 0.0f) goto L18;
        r2 = false;
    L18:
        boolean value$iv = r3 & r2;
        if (value$iv == true) goto L23;
        InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        return;
    L23:
        return;
    L13:
        r5 = false;
        goto L14
    L9:
        r4 = false;
        goto L10
    L5:
        r0 = false;
        goto L7
    }

    public /* synthetic */ PaddingValuesImpl(float r7, float r8, float r9, float r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L5;
        float r1 = Dp.m6973constructorimpl(0);
    L7:
        if ((r11 & 2) == 0) goto L9;
        float r2 = Dp.m6973constructorimpl(0);
    L11:
        if ((r11 & 4) == 0) goto L13;
        float r3 = Dp.m6973constructorimpl(0);
    L15:
        if ((r11 & 8) == 0) goto L17;
        float r4 = Dp.m6973constructorimpl(0);
    L18:
        this(r1, r2, r3, r4, null);
        return;
    L17:
        r4 = r10;
        goto L18
    L13:
        r3 = r9;
        goto L15
    L9:
        r2 = r8;
        goto L11
    L5:
        r1 = r7;
        goto L7
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m748getStartD9Ej5fM() {
        return this.start;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m749getTopD9Ej5fM() {
        return this.top;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m747getEndD9Ej5fM() {
        return this.end;
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m746getBottomD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    public float mo675calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        if (layoutDirection != LayoutDirection.Ltr) goto L6;
        return this.start;
    L6:
        return this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    public float mo677calculateTopPaddingD9Ej5fM() {
        return this.top;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    public float mo676calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        if (layoutDirection != LayoutDirection.Ltr) goto L6;
        return this.end;
    L6:
        return this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo674calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    public boolean equals(Object other) {
        if ((other instanceof PaddingValuesImpl) == true) goto L6;
        return false;
    L6:
        if (Dp.m6978equalsimpl0(this.start, ((PaddingValuesImpl) other).start) == true) goto L8;
        return false;
    L8:
        if (Dp.m6978equalsimpl0(this.top, ((PaddingValuesImpl) other).top) == true) goto L10;
        return false;
    L10:
        if (Dp.m6978equalsimpl0(this.end, ((PaddingValuesImpl) other).end) == true) goto L12;
        return false;
    L12:
        if (Dp.m6978equalsimpl0(this.bottom, ((PaddingValuesImpl) other).bottom) == false) goto L19;
        return true;
    L19:
        return false;
    }

    public int hashCode() {
        return (((((Dp.m6979hashCodeimpl(this.start) * 31) + Dp.m6979hashCodeimpl(this.top)) * 31) + Dp.m6979hashCodeimpl(this.end)) * 31) + Dp.m6979hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "PaddingValues(start=" + Dp.m6984toStringimpl(this.start) + ", top=" + Dp.m6984toStringimpl(this.top) + ", end=" + Dp.m6984toStringimpl(this.end) + ", bottom=" + Dp.m6984toStringimpl(this.bottom) + ')';
    }
}
