package androidx.compose.material;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/ResistanceConfig;", "", "basis", "", "factorAtMin", "factorAtMax", "(FFF)V", "getBasis", "()F", "getFactorAtMax", "getFactorAtMin", "computeResistance", "overflow", "equals", "", "other", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ResistanceConfig {
    public static final int $stable = 0;
    private final float basis;
    private final float factorAtMax;
    private final float factorAtMin;

    static {
    }

    public ResistanceConfig(float basis, float factorAtMin, float factorAtMax) {
        this.basis = basis;
        this.factorAtMin = factorAtMin;
        this.factorAtMax = factorAtMax;
    }

    public /* synthetic */ ResistanceConfig(float r2, float r3, float r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = 10.0f;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r4 = 10.0f;
    L8:
        this(r2, r3, r4);
    }

    public final float getBasis() {
        return this.basis;
    }

    public final float getFactorAtMin() {
        return this.factorAtMin;
    }

    public final float getFactorAtMax() {
        return this.factorAtMax;
    }

    public final float computeResistance(float overflow) {
        if (overflow >= 0.0f) goto L5;
        float factor = this.factorAtMin;
    L7:
        if (factor != 0.0f) goto L9;
        boolean r2 = true;
    L10:
        if (r2 == false) goto L12;
        return 0.0f;
    L12:
        float $this$fastCoerceIn$iv = overflow / this.basis;
        float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= (-1.0f)) goto L16;
        $this$fastCoerceAtLeast$iv$iv = -1.0f;
    L16:
        if ($this$fastCoerceAtLeast$iv$iv <= 1.0f) goto L19;
        $this$fastCoerceAtLeast$iv$iv = 1.0f;
    L19:
        return (this.basis / factor) * ((float) Math.sin((3.1415927f * $this$fastCoerceAtLeast$iv$iv) / 2.0f));
    L9:
        r2 = false;
        goto L10
    L5:
        factor = this.factorAtMax;
        goto L7
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof ResistanceConfig) == true) goto L9;
        return false;
    L9:
        if (this.basis != ((ResistanceConfig) other).basis) goto L11;
        boolean r1 = true;
    L12:
        if (r1 == true) goto L15;
        return false;
    L15:
        if (this.factorAtMin != ((ResistanceConfig) other).factorAtMin) goto L17;
        boolean r2 = true;
    L18:
        if (r2 == true) goto L21;
        return false;
    L21:
        if (this.factorAtMax != ((ResistanceConfig) other).factorAtMax) goto L23;
        boolean r3 = true;
    L24:
        if (r3 == true) goto L26;
        return false;
    L26:
        return true;
    L23:
        r3 = false;
        goto L24
    L17:
        r2 = false;
        goto L18
    L11:
        r1 = false;
        goto L12
    }

    public int hashCode() {
        int result = Float.hashCode(this.basis);
        int result2 = (result * 31) + Float.hashCode(this.factorAtMin);
        return (result2 * 31) + Float.hashCode(this.factorAtMax);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.basis + ", factorAtMin=" + this.factorAtMin + ", factorAtMax=" + this.factorAtMax + ')';
    }
}
