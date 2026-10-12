package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.PointerId;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PointerIdArray.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u001b\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0011J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0013J\u001e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0006H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\rJ\u001b\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0011J\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010 \u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0006J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0006H\u0002J#\u0010#\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\nø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0019\u0010#\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "", "()V", "internalArray", "", "lastIndex", "", "getLastIndex", "()I", "<set-?>", "size", "getSize", "add", "", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "add-0FcD4WY", "(J)Z", "value", "", "clear", "", "contains", "contains-0FcD4WY", "pointerIdValue", "get", "index", "get-_I2yYro", "(I)J", "isEmpty", "remove", "remove-0FcD4WY", "removeAt", "resizeStorage", "minSize", "set", "set-DmW0f2w", "(IJ)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerIdArray {
    public static final int $stable = 0;
    private long[] internalArray;
    private int size;

    static {
        $stable = 8;
    }

    public PointerIdArray() {
        this.internalArray = new long[2];
    }

    public final int getSize() {
        return this.size;
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    /* JADX INFO: renamed from: get-_I2yYro, reason: not valid java name */
    public final long m5682get_I2yYro(int index) {
        return PointerId.m5569constructorimpl(this.internalArray[index]);
    }

    /* JADX INFO: renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m5683remove0FcD4WY(long pointerId) {
        return remove(pointerId);
    }

    public final boolean remove(long pointerIdValue) {
        int i = 0;
        int r1 = this.size;
    L3:
        if (i >= r1) goto L12;
        if (pointerIdValue == this.internalArray[i]) goto L6;
        i = i + 1;
        goto L3
    L6:
        int j = i;
        int r2 = this.size - 1;
    L7:
        if (j >= r2) goto L9;
        this.internalArray[j] = this.internalArray[j + 1];
        j = j + 1;
        goto L7
    L9:
        int j2 = this.size;
        this.size = j2 - 1;
        return true;
    L12:
        return false;
    }

    public final boolean removeAt(int index) {
        if (index >= this.size) goto L9;
        int i = index;
        int r1 = this.size - 1;
    L5:
        if (i >= r1) goto L7;
        this.internalArray[i] = this.internalArray[i + 1];
        i = i + 1;
        goto L5
    L7:
        int i2 = this.size;
        this.size = i2 - 1;
        return true;
    L9:
        return false;
    }

    public final boolean isEmpty() {
        if (this.size != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean add(long value) {
        if (contains(value) == true) goto L6;
        set(this.size, value);
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m5680add0FcD4WY(long pointerId) {
        return add(pointerId);
    }

    public final void set(int index, long value) {
        long[] internalArray = this.internalArray;
        if (index < internalArray.length) goto L5;
        internalArray = resizeStorage(index + 1);
    L5:
        internalArray[index] = value;
        if (index < this.size) goto L9;
        this.size = index + 1;
        return;
    }

    private final long[] resizeStorage(int minSize) {
        long[] $this$resizeStorage_u24lambda_u240 = Arrays.copyOf(this.internalArray, Math.max(minSize, this.internalArray.length * 2));
        Intrinsics.checkNotNullExpressionValue($this$resizeStorage_u24lambda_u240, "copyOf(...)");
        this.internalArray = $this$resizeStorage_u24lambda_u240;
        return $this$resizeStorage_u24lambda_u240;
    }

    /* JADX INFO: renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m5684setDmW0f2w(int index, long pointerId) {
        set(index, pointerId);
    }

    public final void clear() {
        this.size = 0;
    }

    /* JADX INFO: renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m5681contains0FcD4WY(long pointerId) {
        return contains(pointerId);
    }

    public final boolean contains(long pointerIdValue) {
        int i = 0;
        int r1 = this.size;
    L3:
        if (i >= r1) goto L9;
        if (this.internalArray[i] == pointerIdValue) goto L6;
        i = i + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }
}
