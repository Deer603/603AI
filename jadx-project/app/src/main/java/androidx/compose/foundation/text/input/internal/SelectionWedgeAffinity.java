package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: TransformedTextFieldState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "", "affinity", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V", "startAffinity", "endAffinity", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V", "getEndAffinity", "()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "getStartAffinity", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelectionWedgeAffinity {
    public static final int $stable = 0;
    private final WedgeAffinity endAffinity;
    private final WedgeAffinity startAffinity;

    static {
    }

    public static /* synthetic */ SelectionWedgeAffinity copy$default(SelectionWedgeAffinity r0, WedgeAffinity r1, WedgeAffinity r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.startAffinity;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.endAffinity;
    L9:
        return r0.copy(r1, r2);
    }

    public final WedgeAffinity component1() {
        return this.startAffinity;
    }

    public final WedgeAffinity component2() {
        return this.endAffinity;
    }

    public final SelectionWedgeAffinity copy(WedgeAffinity r2, WedgeAffinity r3) {
        return new SelectionWedgeAffinity(r2, r3);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof SelectionWedgeAffinity) == true) goto L8;
        return false;
    L8:
        SelectionWedgeAffinity r1 = (SelectionWedgeAffinity) r6;
        if (this.startAffinity == r1.startAffinity) goto L12;
        return false;
    L12:
        if (this.endAffinity == r1.endAffinity) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.startAffinity.hashCode() * 31) + this.endAffinity.hashCode();
    }

    public String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.startAffinity + ", endAffinity=" + this.endAffinity + ')';
    }

    public SelectionWedgeAffinity(WedgeAffinity startAffinity, WedgeAffinity endAffinity) {
        this.startAffinity = startAffinity;
        this.endAffinity = endAffinity;
    }

    public final WedgeAffinity getStartAffinity() {
        return this.startAffinity;
    }

    public final WedgeAffinity getEndAffinity() {
        return this.endAffinity;
    }

    public SelectionWedgeAffinity(WedgeAffinity affinity) {
        this(affinity, affinity);
    }
}
