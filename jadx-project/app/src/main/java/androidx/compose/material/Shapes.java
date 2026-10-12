package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/Shapes;", "", "small", "Landroidx/compose/foundation/shape/CornerBasedShape;", "medium", "large", "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)V", "getLarge", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "getMedium", "getSmall", "copy", "equals", "", "other", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Shapes {
    public static final int $stable = 0;
    private final CornerBasedShape large;
    private final CornerBasedShape medium;
    private final CornerBasedShape small;

    static {
    }

    public Shapes() {
        CornerBasedShape r1 = null;
        CornerBasedShape r2 = null;
        CornerBasedShape r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public Shapes(CornerBasedShape small, CornerBasedShape medium, CornerBasedShape large) {
        this.small = small;
        this.medium = medium;
        this.large = large;
    }

    public /* synthetic */ Shapes(RoundedCornerShape r2, RoundedCornerShape r3, RoundedCornerShape r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(4));
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(4));
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(0));
    L11:
        this(r2, r3, r4);
    }

    public final CornerBasedShape getSmall() {
        return this.small;
    }

    public final CornerBasedShape getMedium() {
        return this.medium;
    }

    public final CornerBasedShape getLarge() {
        return this.large;
    }

    public static /* synthetic */ Shapes copy$default(Shapes r0, CornerBasedShape r1, CornerBasedShape r2, CornerBasedShape r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.small;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.medium;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.large;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final Shapes copy(CornerBasedShape small, CornerBasedShape medium, CornerBasedShape large) {
        return new Shapes(small, medium, large);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof Shapes) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.small, ((Shapes) other).small) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.medium, ((Shapes) other).medium) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.large, ((Shapes) other).large) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int result = this.small.hashCode();
        int result2 = (result * 31) + this.medium.hashCode();
        return (result2 * 31) + this.large.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ')';
    }
}
