package androidx.compose.material3.carousel;

import kotlin.Metadata;

/* JADX INFO: compiled from: KeylineList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JO\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006 "}, d2 = {"Landroidx/compose/material3/carousel/Keyline;", "", "size", "", "offset", "unadjustedOffset", "isFocal", "", "isAnchor", "isPivot", "cutoff", "(FFFZZZF)V", "getCutoff", "()F", "()Z", "getOffset", "getSize", "getUnadjustedOffset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Keyline {
    public static final int $stable = 0;
    private final float cutoff;
    private final boolean isAnchor;
    private final boolean isFocal;
    private final boolean isPivot;
    private final float offset;
    private final float size;
    private final float unadjustedOffset;

    static {
    }

    public static /* synthetic */ Keyline copy$default(Keyline r0, float r1, float r2, float r3, boolean r4, boolean r5, boolean r6, float r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.size;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.offset;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.unadjustedOffset;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.isFocal;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.isAnchor;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.isPivot;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.cutoff;
    L23:
        boolean r10 = r6;
        float r11 = r7;
        boolean r12 = r4;
        boolean r13 = r5;
        float r14 = r3;
        float r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final float component1() {
        return this.size;
    }

    public final float component2() {
        return this.offset;
    }

    public final float component3() {
        return this.unadjustedOffset;
    }

    public final boolean component4() {
        return this.isFocal;
    }

    public final boolean component5() {
        return this.isAnchor;
    }

    public final boolean component6() {
        return this.isPivot;
    }

    public final float component7() {
        return this.cutoff;
    }

    public final Keyline copy(float r9, float r10, float r11, boolean r12, boolean r13, boolean r14, float r15) {
        return new Keyline(r9, r10, r11, r12, r13, r14, r15);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof Keyline) == true) goto L8;
        return false;
    L8:
        Keyline r1 = (Keyline) r6;
        if (Float.compare(this.size, r1.size) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.offset, r1.offset) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.unadjustedOffset, r1.unadjustedOffset) == 0) goto L18;
        return false;
    L18:
        if (this.isFocal == r1.isFocal) goto L21;
        return false;
    L21:
        if (this.isAnchor == r1.isAnchor) goto L24;
        return false;
    L24:
        if (this.isPivot == r1.isPivot) goto L27;
        return false;
    L27:
        if (Float.compare(this.cutoff, r1.cutoff) == 0) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((Float.hashCode(this.size) * 31) + Float.hashCode(this.offset)) * 31) + Float.hashCode(this.unadjustedOffset)) * 31) + Boolean.hashCode(this.isFocal)) * 31) + Boolean.hashCode(this.isAnchor)) * 31) + Boolean.hashCode(this.isPivot)) * 31) + Float.hashCode(this.cutoff);
    }

    public String toString() {
        return "Keyline(size=" + this.size + ", offset=" + this.offset + ", unadjustedOffset=" + this.unadjustedOffset + ", isFocal=" + this.isFocal + ", isAnchor=" + this.isAnchor + ", isPivot=" + this.isPivot + ", cutoff=" + this.cutoff + ')';
    }

    public Keyline(float size, float offset, float unadjustedOffset, boolean isFocal, boolean isAnchor, boolean isPivot, float cutoff) {
        this.size = size;
        this.offset = offset;
        this.unadjustedOffset = unadjustedOffset;
        this.isFocal = isFocal;
        this.isAnchor = isAnchor;
        this.isPivot = isPivot;
        this.cutoff = cutoff;
    }

    public final float getSize() {
        return this.size;
    }

    public final float getOffset() {
        return this.offset;
    }

    public final float getUnadjustedOffset() {
        return this.unadjustedOffset;
    }

    public final boolean isFocal() {
        return this.isFocal;
    }

    public final boolean isAnchor() {
        return this.isAnchor;
    }

    public final boolean isPivot() {
        return this.isPivot;
    }

    public final float getCutoff() {
        return this.cutoff;
    }
}
