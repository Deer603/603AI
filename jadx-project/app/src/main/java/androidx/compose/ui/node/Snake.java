package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\u000bJ\u000f\u0010(\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\u00118Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0012\u0010\u0018\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000bR\u0012\u0010\u001a\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000b\u0088\u0001\u0002¨\u0006,"}, d2 = {"Landroidx/compose/ui/node/Snake;", "", "data", "", "constructor-impl", "([I)[I", "getData", "()[I", "diagonalSize", "", "getDiagonalSize-impl", "([I)I", "endX", "getEndX-impl", "endY", "getEndY-impl", "hasAdditionOrRemoval", "", "getHasAdditionOrRemoval-impl", "([I)Z", "isAddition", "isAddition-impl", "reverse", "getReverse-impl", "startX", "getStartX-impl", "startY", "getStartY-impl", "addDiagonalToStack", "", "diagonals", "Landroidx/compose/ui/node/IntStack;", "addDiagonalToStack-impl", "([ILandroidx/compose/ui/node/IntStack;)V", "equals", "other", "equals-impl", "([ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "([I)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
final class Snake {
    private final int[] data;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m6040boximpl(int[] r1) {
        return new Snake(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m6041constructorimpl(int[] r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6042equalsimpl(int[] r2, Object r3) {
        if ((r3 instanceof Snake) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((Snake) r3).m6054unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6043equalsimpl0(int[] r1, int[] r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6051hashCodeimpl(int[] r1) {
        return Arrays.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m6042equalsimpl(this.data, r2);
    }

    public int hashCode() {
        return m6051hashCodeimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m6054unboximpl() {
        return this.data;
    }

    private /* synthetic */ Snake(int[] data) {
        this.data = data;
    }

    public final int[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: getStartX-impl, reason: not valid java name */
    public static final int m6049getStartXimpl(int[] arg0) {
        return arg0[0];
    }

    /* JADX INFO: renamed from: getStartY-impl, reason: not valid java name */
    public static final int m6050getStartYimpl(int[] arg0) {
        return arg0[1];
    }

    /* JADX INFO: renamed from: getEndX-impl, reason: not valid java name */
    public static final int m6045getEndXimpl(int[] arg0) {
        return arg0[2];
    }

    /* JADX INFO: renamed from: getEndY-impl, reason: not valid java name */
    public static final int m6046getEndYimpl(int[] arg0) {
        return arg0[3];
    }

    /* JADX INFO: renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m6048getReverseimpl(int[] arg0) {
        if (arg0[4] == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m6044getDiagonalSizeimpl(int[] arg0) {
        return Math.min(arg0[2] - arg0[0], arg0[3] - arg0[1]);
    }

    /* JADX INFO: renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m6047getHasAdditionOrRemovalimpl(int[] arg0) {
        if ((arg0[3] - arg0[1]) == (arg0[2] - arg0[0])) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m6052isAdditionimpl(int[] arg0) {
        if ((arg0[3] - arg0[1]) <= (arg0[2] - arg0[0])) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m6039addDiagonalToStackimpl(int[] arg0, IntStack diagonals) {
        int r2 = 0;
        int x = arg0[0];
        int y = arg0[1];
        if (m6047getHasAdditionOrRemovalimpl(arg0) == false) goto L20;
        int size = Math.min(arg0[2] - arg0[0], arg0[3] - arg0[1]);
        if (arg0[4] == 0) goto L7;
        boolean r0 = true;
    L8:
        boolean $this$toInt$iv = !(r0 | m6052isAdditionimpl(arg0));
        if ($this$toInt$iv == false) goto L11;
        int r1 = 1;
    L12:
        x = x + r1;
        if (arg0[4] == 0) goto L15;
        boolean r3 = true;
    L16:
        boolean $this$toInt$iv2 = !(r3 | (!m6052isAdditionimpl(arg0)));
        if ($this$toInt$iv2 == false) goto L19;
        r2 = 1;
    L19:
        y = y + r2;
    L21:
        diagonals.pushDiagonal(x, y, size);
        return;
    L15:
        r3 = false;
        goto L16
    L11:
        r1 = 0;
        goto L12
    L7:
        r0 = false;
        goto L8
    L20:
        size = arg0[2] - arg0[0];
        goto L21
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6053toStringimpl(int[] arg0) {
        boolean r2 = false;
        StringBuilder r0 = new StringBuilder().append("Snake(").append(arg0[0]).append(',').append(arg0[1]).append(',').append(arg0[2]).append(',').append(arg0[3]).append(',');
        if (arg0[4] == 0) goto L6;
        r2 = true;
    L6:
        return r0.append(r2).append(')').toString();
    }

    public String toString() {
        return m6053toStringimpl(this.data);
    }
}
