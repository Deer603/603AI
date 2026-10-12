package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000fJ;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010 \u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b$\u0010\"J\u0013\u0010%\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u000fJ\u001b\u0010'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\rJ\u0010\u0010)\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0012\u0010\u0006\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\u0004\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0015\u0088\u0001\u000e\u0092\u0001\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "mainAxisMin", "", "mainAxisMax", "crossAxisMin", "crossAxisMax", "constructor-impl", "(IIII)J", "c", "Landroidx/compose/ui/unit/Constraints;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "value", "(J)J", "getCrossAxisMax-impl", "(J)I", "getCrossAxisMin-impl", "getMainAxisMax-impl", "getMainAxisMin-impl", "J", "copy", "copy-yUG9Ft0", "(JIIII)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "maxHeight", "maxHeight-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", "maxWidth", "maxWidth-impl", "stretchCrossAxis", "stretchCrossAxis-q4ezo7Y", "toBoxConstraints", "toBoxConstraints-OenEA2s", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class OrientationIndependentConstraints {
    private final long value;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m691boximpl(long r1) {
        return new OrientationIndependentConstraints(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m693constructorimpl(long r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m697equalsimpl(long r4, Object r6) {
        if ((r6 instanceof OrientationIndependentConstraints) == true) goto L6;
        return false;
    L6:
        if (Constraints.m6919equalsimpl0(r4, ((OrientationIndependentConstraints) r6).m709unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m698equalsimpl0(long r1, long r3) {
        return Constraints.m6919equalsimpl0(r1, r3);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m703hashCodeimpl(long r1) {
        return Constraints.m6929hashCodeimpl(r1);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m708toStringimpl(long r2) {
        return "OrientationIndependentConstraints(value=" + Constraints.m6931toStringimpl(r2) + ')';
    }

    public boolean equals(Object r3) {
        return m697equalsimpl(this.value, r3);
    }

    public int hashCode() {
        return m703hashCodeimpl(this.value);
    }

    public String toString() {
        return m708toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m709unboximpl() {
        return this.value;
    }

    private /* synthetic */ OrientationIndependentConstraints(long value) {
        this.value = value;
    }

    /* JADX INFO: renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m702getMainAxisMinimpl(long arg0) {
        return Constraints.m6928getMinWidthimpl(arg0);
    }

    /* JADX INFO: renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m701getMainAxisMaximpl(long arg0) {
        return Constraints.m6926getMaxWidthimpl(arg0);
    }

    /* JADX INFO: renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m700getCrossAxisMinimpl(long arg0) {
        return Constraints.m6927getMinHeightimpl(arg0);
    }

    /* JADX INFO: renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m699getCrossAxisMaximpl(long arg0) {
        return Constraints.m6925getMaxHeightimpl(arg0);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m692constructorimpl(int mainAxisMin, int mainAxisMax, int crossAxisMin, int crossAxisMax) {
        return m693constructorimpl(ConstraintsKt.Constraints(mainAxisMin, mainAxisMax, crossAxisMin, crossAxisMax));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m694constructorimpl(long c, LayoutOrientation orientation) {
        if (orientation != LayoutOrientation.Horizontal) goto L5;
        int r0 = Constraints.m6928getMinWidthimpl(c);
    L7:
        if (orientation != LayoutOrientation.Horizontal) goto L9;
        int r1 = Constraints.m6926getMaxWidthimpl(c);
    L11:
        if (orientation != LayoutOrientation.Horizontal) goto L13;
        int r2 = Constraints.m6927getMinHeightimpl(c);
    L15:
        if (orientation != LayoutOrientation.Horizontal) goto L17;
        int r3 = Constraints.m6925getMaxHeightimpl(c);
    L19:
        return m692constructorimpl(r0, r1, r2, r3);
    L17:
        r3 = Constraints.m6926getMaxWidthimpl(c);
        goto L19
    L13:
        r2 = Constraints.m6928getMinWidthimpl(c);
        goto L15
    L9:
        r1 = Constraints.m6925getMaxHeightimpl(c);
        goto L11
    L5:
        r0 = Constraints.m6927getMinHeightimpl(c);
        goto L7
    }

    /* JADX INFO: renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m706stretchCrossAxisq4ezo7Y(long arg0) {
        int r0 = Constraints.m6928getMinWidthimpl(arg0);
        int r1 = Constraints.m6926getMaxWidthimpl(arg0);
        if (Constraints.m6925getMaxHeightimpl(arg0) == Integer.MAX_VALUE) goto L5;
        int r2 = Constraints.m6925getMaxHeightimpl(arg0);
    L7:
        return m692constructorimpl(r0, r1, r2, Constraints.m6925getMaxHeightimpl(arg0));
    L5:
        r2 = Constraints.m6927getMinHeightimpl(arg0);
        goto L7
    }

    /* JADX INFO: renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m707toBoxConstraintsOenEA2s(long arg0, LayoutOrientation orientation) {
        if (orientation != LayoutOrientation.Horizontal) goto L6;
        return ConstraintsKt.Constraints(Constraints.m6928getMinWidthimpl(arg0), Constraints.m6926getMaxWidthimpl(arg0), Constraints.m6927getMinHeightimpl(arg0), Constraints.m6925getMaxHeightimpl(arg0));
    L6:
        return ConstraintsKt.Constraints(Constraints.m6927getMinHeightimpl(arg0), Constraints.m6925getMaxHeightimpl(arg0), Constraints.m6928getMinWidthimpl(arg0), Constraints.m6926getMaxWidthimpl(arg0));
    }

    /* JADX INFO: renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m705maxWidthimpl(long arg0, LayoutOrientation orientation) {
        if (orientation != LayoutOrientation.Horizontal) goto L6;
        return Constraints.m6926getMaxWidthimpl(arg0);
    L6:
        return Constraints.m6925getMaxHeightimpl(arg0);
    }

    /* JADX INFO: renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m704maxHeightimpl(long arg0, LayoutOrientation orientation) {
        if (orientation != LayoutOrientation.Horizontal) goto L6;
        return Constraints.m6925getMaxHeightimpl(arg0);
    L6:
        return Constraints.m6926getMaxWidthimpl(arg0);
    }

    /* JADX INFO: renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m696copyyUG9Ft0$default(long r6, int r8, int r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L5;
        int r2 = Constraints.m6928getMinWidthimpl(r6);
    L7:
        if ((r12 & 2) == 0) goto L9;
        int r3 = Constraints.m6926getMaxWidthimpl(r6);
    L11:
        if ((r12 & 4) == 0) goto L13;
        int r4 = Constraints.m6927getMinHeightimpl(r6);
    L15:
        if ((r12 & 8) == 0) goto L17;
        int r5 = Constraints.m6925getMaxHeightimpl(r6);
    L19:
        return m695copyyUG9Ft0(r6, r2, r3, r4, r5);
    L17:
        r5 = r11;
        goto L19
    L13:
        r4 = r10;
        goto L15
    L9:
        r3 = r9;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    /* JADX INFO: renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m695copyyUG9Ft0(long arg0, int mainAxisMin, int mainAxisMax, int crossAxisMin, int crossAxisMax) {
        return m692constructorimpl(mainAxisMin, mainAxisMax, crossAxisMin, crossAxisMax);
    }
}
