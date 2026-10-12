package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ListImplementation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\nJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u000eJ%\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0001¢\u0006\u0002\b\u0014J\u0019\u0010\u0015\u001a\u00020\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0001¢\u0006\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ListImplementation;", "", "()V", "checkElementIndex", "", "index", "", "size", "checkElementIndex$runtime_release", "checkPositionIndex", "checkPositionIndex$runtime_release", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$runtime_release", "orderedEquals", "", "c", "", "other", "orderedEquals$runtime_release", "orderedHashCode", "orderedHashCode$runtime_release", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ListImplementation {
    public static final int $stable = 0;
    public static final ListImplementation INSTANCE = null;

    static {
        INSTANCE = new ListImplementation();
    }

    private ListImplementation() {
    }

    @JvmStatic
    public static final void checkElementIndex$runtime_release(int index, int size) {
        if (index < 0) goto L6;
        if (index >= size) goto L6;
        return;
    L6:
        throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
    }

    @JvmStatic
    public static final void checkPositionIndex$runtime_release(int index, int size) {
        if (index < 0) goto L6;
        if (index > size) goto L6;
        return;
    L6:
        throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
    }

    @JvmStatic
    public static final void checkRangeIndexes$runtime_release(int fromIndex, int toIndex, int size) {
        if (fromIndex < 0) goto L10;
        if (toIndex > size) goto L10;
        if (fromIndex > toIndex) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("fromIndex: " + fromIndex + " > toIndex: " + toIndex);
    L10:
        throw new IndexOutOfBoundsException("fromIndex: " + fromIndex + ", toIndex: " + toIndex + ", size: " + size);
    }

    @JvmStatic
    public static final int orderedHashCode$runtime_release(Collection<?> r5) {
        int hashCode = 1;
        Iterator<?> r1 = r5.iterator();
    L4:
        if (r1.hasNext() == false) goto L10;
        Object e = r1.next();
        int r3 = hashCode * 31;
        if (e == null) goto L8;
        int r4 = e.hashCode();
    L9:
        hashCode = r3 + r4;
        goto L4
    L8:
        r4 = 0;
        goto L9
    L10:
        return hashCode;
    }

    @JvmStatic
    public static final boolean orderedEquals$runtime_release(Collection<?> r6, Collection<?> r7) {
        if (r6.size() == r7.size()) goto L5;
        return false;
    L5:
        Iterator<?> r0 = r7.iterator();
        Iterator<?> r1 = r6.iterator();
    L7:
        if (r1.hasNext() == false) goto L11;
        Object elem = r1.next();
        Object elemOther = r0.next();
        if (Intrinsics.areEqual(elem, elemOther) == true) goto L7;
        return false;
    L11:
        return true;
    }
}
