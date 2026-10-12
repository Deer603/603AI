package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntervalTree.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0086\u0002J\u0013\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0016\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/Interval;", "T", "", "start", "", "end", "data", "(FFLjava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getEnd", "()F", "getStart", "contains", "", "value", "equals", "other", "hashCode", "", "overlaps", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class Interval<T> {
    private final T data;
    private final float end;
    private final float start;

    public Interval(float start, float end, T r3) {
        this.start = start;
        this.end = end;
        this.data = r3;
    }

    public /* synthetic */ Interval(float r1, float r2, Object r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        this(r1, r2, r3);
    }

    public final T getData() {
        return this.data;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public final boolean overlaps(Interval<T> r3) {
        if (this.start <= r3.end) goto L5;
    L7:
        return false;
    L5:
        if (this.end < r3.start) goto L7;
        return true;
    }

    public final boolean overlaps(float start, float end) {
        if (this.start <= end) goto L5;
    L7:
        return false;
    L5:
        if (this.end < start) goto L7;
        return true;
    }

    public final boolean contains(float value) {
        float r0 = this.start;
        if (value <= this.end) goto L5;
        return false;
    L5:
        if (r0 > value) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L26:
        return false;
    L8:
        if (getClass() != other.getClass()) goto L26;
        Interval r2 = (Interval) other;
        if (this.start != ((Interval) other).start) goto L13;
        boolean r3 = true;
    L14:
        if (r3 == true) goto L17;
        return false;
    L17:
        if (this.end != ((Interval) other).end) goto L19;
        boolean r4 = true;
    L20:
        if (r4 == true) goto L23;
        return false;
    L23:
        if (Intrinsics.areEqual(this.data, ((Interval) other).data) == true) goto L25;
        return false;
    L25:
        return true;
    L19:
        r4 = false;
        goto L20
    L13:
        r3 = false;
        goto L14
    }

    public int hashCode() {
        int result = Float.hashCode(this.start);
        int result2 = (result * 31) + Float.hashCode(this.end);
        int result3 = result2 * 31;
        T r2 = this.data;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return result3 + r3;
    L5:
        r3 = 0;
        goto L7
    }

    public String toString() {
        return "Interval(start=" + this.start + ", end=" + this.end + ", data=" + this.data + ')';
    }
}
