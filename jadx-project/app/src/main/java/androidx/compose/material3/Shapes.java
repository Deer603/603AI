package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ8\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/Shapes;", "", "extraSmall", "Landroidx/compose/foundation/shape/CornerBasedShape;", "small", "medium", "large", "extraLarge", "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)V", "getExtraLarge", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "getExtraSmall", "getLarge", "getMedium", "getSmall", "copy", "equals", "", "other", "hashCode", "", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Shapes {
    public static final int $stable = 0;
    private final CornerBasedShape extraLarge;
    private final CornerBasedShape extraSmall;
    private final CornerBasedShape large;
    private final CornerBasedShape medium;
    private final CornerBasedShape small;

    static {
    }

    public Shapes() {
        CornerBasedShape r1 = null;
        CornerBasedShape r2 = null;
        CornerBasedShape r3 = null;
        CornerBasedShape r4 = null;
        CornerBasedShape r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public Shapes(CornerBasedShape extraSmall, CornerBasedShape small, CornerBasedShape medium, CornerBasedShape large, CornerBasedShape extraLarge) {
        this.extraSmall = extraSmall;
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.extraLarge = extraLarge;
    }

    public /* synthetic */ Shapes(CornerBasedShape r1, CornerBasedShape r2, CornerBasedShape r3, CornerBasedShape r4, CornerBasedShape r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = ShapeDefaults.INSTANCE.getExtraSmall();
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = ShapeDefaults.INSTANCE.getSmall();
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = ShapeDefaults.INSTANCE.getMedium();
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = ShapeDefaults.INSTANCE.getLarge();
    L15:
        if ((r6 & 16) == 0) goto L17;
        CornerBasedShape r8 = ShapeDefaults.INSTANCE.getExtraLarge();
    L18:
        CornerBasedShape r9 = r3;
        CornerBasedShape r10 = r4;
        this(r1, r2, r9, r10, r8);
        return;
    L17:
        r8 = r5;
        goto L18
    }

    public final CornerBasedShape getExtraSmall() {
        return this.extraSmall;
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

    public final CornerBasedShape getExtraLarge() {
        return this.extraLarge;
    }

    public static /* synthetic */ Shapes copy$default(Shapes r0, CornerBasedShape r1, CornerBasedShape r2, CornerBasedShape r3, CornerBasedShape r4, CornerBasedShape r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.extraSmall;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.small;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.medium;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.large;
    L15:
        if ((r6 & 16) == 0) goto L17;
        CornerBasedShape r8 = r0.extraLarge;
    L18:
        CornerBasedShape r9 = r3;
        CornerBasedShape r10 = r4;
        return r0.copy(r1, r2, r9, r10, r8);
    L17:
        r8 = r5;
        goto L18
    }

    public final Shapes copy(CornerBasedShape extraSmall, CornerBasedShape small, CornerBasedShape medium, CornerBasedShape large, CornerBasedShape extraLarge) {
        return new Shapes(extraSmall, small, medium, large, extraLarge);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof Shapes) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.extraSmall, ((Shapes) other).extraSmall) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.small, ((Shapes) other).small) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.medium, ((Shapes) other).medium) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.large, ((Shapes) other).large) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.extraLarge, ((Shapes) other).extraLarge) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int result = this.extraSmall.hashCode();
        int result2 = (result * 31) + this.small.hashCode();
        return (((((result2 * 31) + this.medium.hashCode()) * 31) + this.large.hashCode()) * 31) + this.extraLarge.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.extraSmall + ", small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ", extraLarge=" + this.extraLarge + ')';
    }
}
