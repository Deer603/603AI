package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LongList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\b\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\fJ\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\bJ\u0018\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001J\u0018\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\bJ\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0003J\u0011\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086\nJ\u0011\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086\nJ\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\nJ\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\u0003J\u001a\u0010\u0018\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u001b\u0010\u001c\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002J\u0006\u0010\u001d\u001a\u00020\tJ\u0006\u0010\u001e\u001a\u00020\tJ\u0010\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u0003R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006!"}, d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "add", "", "index", "element", "", "", "addAll", "elements", "", "clear", "ensureCapacity", "minusAssign", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableLongList extends LongList {
    public MutableLongList() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public MutableLongList(int initialCapacity) {
        super(initialCapacity, null);
    }

    public /* synthetic */ MutableLongList(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 16;
    L5:
        this(r1);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(long element) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = element;
        this._size++;
        return true;
    }

    public final void add(int index, long element) {
        boolean r0 = false;
        if (index >= 0) goto L5;
    L7:
        if (r0 == true) goto L9;
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
    L9:
        ensureCapacity(this._size + 1);
        long[] content = this.content;
        if (index == this._size) goto L12;
        ArraysKt.copyInto(content, content, index + 1, index, this._size);
    L12:
        content[index] = element;
        this._size++;
        return;
    L5:
        if (index > this._size) goto L7;
        r0 = true;
        goto L7
    }

    public final boolean addAll(int index, long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index >= 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == true) goto L11;
        RuntimeHelpersKt.throwIndexOutOfBoundsException("");
    L11:
        if (elements.length != 0) goto L13;
        boolean r3 = true;
    L14:
        if (r3 == false) goto L16;
        return false;
    L16:
        ensureCapacity(this._size + elements.length);
        long[] content = this.content;
        if (index == this._size) goto L19;
        ArraysKt.copyInto(content, content, elements.length + index, index, this._size);
    L19:
        ArraysKt.copyInto$default(elements, content, index, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    L13:
        r3 = false;
        goto L14
    L5:
        if (index > this._size) goto L7;
        r2 = true;
        goto L8
    }

    public final boolean addAll(int index, LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index >= 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == true) goto L11;
        RuntimeHelpersKt.throwIndexOutOfBoundsException("");
    L11:
        if (elements._size != 0) goto L13;
        boolean r3 = true;
    L14:
        if (r3 == false) goto L16;
        return false;
    L16:
        ensureCapacity(this._size + elements._size);
        long[] content = this.content;
        if (index == this._size) goto L19;
        ArraysKt.copyInto(content, content, elements._size + index, index, this._size);
    L19:
        ArraysKt.copyInto(elements.content, content, index, 0, elements._size);
        this._size += elements._size;
        return true;
    L13:
        r3 = false;
        goto L14
    L5:
        if (index > this._size) goto L7;
        r2 = true;
        goto L8
    }

    public final boolean addAll(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final void plusAssign(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final void plusAssign(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final void clear() {
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableLongList r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = r0._size;
    L5:
        r0.trim(r1);
    }

    public final void trim(int minCapacity) {
        int minSize = Math.max(minCapacity, this._size);
        if (this.content.length <= minSize) goto L6;
        long[] r1 = Arrays.copyOf(this.content, minSize);
        Intrinsics.checkNotNullExpressionValue(r1, "copyOf(...)");
        this.content = r1;
        return;
    }

    public final void ensureCapacity(int capacity) {
        long[] oldContent = this.content;
        if (oldContent.length >= capacity) goto L6;
        int newSize = Math.max(capacity, (oldContent.length * 3) / 2);
        long[] r2 = Arrays.copyOf(oldContent, newSize);
        Intrinsics.checkNotNullExpressionValue(r2, "copyOf(...)");
        this.content = r2;
        return;
    }

    public final void plusAssign(long element) {
        add(element);
    }

    public final void minusAssign(long element) {
        remove(element);
    }

    public final boolean remove(long element) {
        int index = indexOf(element);
        if (index < 0) goto L6;
        removeAt(index);
        return true;
    L6:
        return false;
    }

    public final boolean removeAll(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        int i = 0;
        int r2 = elements.length;
    L3:
        if (i >= r2) goto L5;
        remove(elements[i]);
        i = i + 1;
        goto L3
    L5:
        int i2 = this._size;
        if (initialSize == i2) goto L8;
        return true;
    L8:
        return false;
    }

    public final boolean removeAll(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        int i = 0;
        int r4 = elements._size - 1;
        if (0 > r4) goto L7;
    L4:
        remove(elements.get(i));
        if (i == r4) goto L7;
        i = i + 1;
    L7:
        int i2 = this._size;
        if (initialSize != i2) goto L13;
        return false;
    L13:
        return true;
    }

    public final void minusAssign(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int r2 = elements.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L6;
        long element$iv = elements[r3];
        remove(element$iv);
        r3 = r3 + 1;
        goto L3
    }

    public final void minusAssign(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] content$iv = elements.content;
        int i$iv = 0;
        int r4 = elements._size;
    L3:
        if (i$iv >= r4) goto L6;
        long element = content$iv[i$iv];
        remove(element);
        i$iv = i$iv + 1;
        goto L3
    }

    public final long removeAt(int index) {
        boolean r0 = false;
        if (index >= 0) goto L5;
    L7:
        if (r0 == true) goto L9;
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
    L9:
        long[] content = this.content;
        long item = content[index];
        MutableLongList this_$iv = this;
        if (index == (this_$iv._size - 1)) goto L12;
        ArraysKt.copyInto(content, content, index, index + 1, this._size);
    L12:
        this._size--;
        return item;
    L5:
        if (index >= this._size) goto L7;
        r0 = true;
        goto L7
    }

    public final void removeRange(int start, int end) {
        boolean r0 = true;
        if (start >= 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == false) goto L15;
        if (end >= 0) goto L11;
    L13:
        r0 = false;
    L14:
        if (r0 == false) goto L15;
    L16:
        if (end >= start) goto L18;
        RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
    L18:
        if (end != start) goto L20;
        return;
    L20:
        if (end >= this._size) goto L22;
        ArraysKt.copyInto(this.content, this.content, start, end, this._size);
    L22:
        this._size -= end - start;
        return;
    L11:
        if (end > this._size) goto L13;
    L15:
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        goto L16
    L5:
        if (start > this._size) goto L7;
        r2 = true;
        goto L8
    }

    public final boolean retainAll(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        long[] content = this.content;
        MutableLongList this_$iv = this;
        int i = this_$iv._size - 1;
    L3:
        int r5 = -1;
        if ((-1) >= i) goto L19;
        long item = content[i];
        int index$iv = 0;
        int r13 = elements.length;
    L6:
        if (index$iv >= r13) goto L15;
        long it = elements[index$iv];
        if (it != item) goto L10;
        boolean r14 = true;
    L11:
        if (r14 == true) goto L12;
        index$iv = index$iv + 1;
        goto L6
    L12:
        r5 = index$iv;
        goto L15
    L10:
        r14 = false;
    L15:
        if (r5 >= 0) goto L17;
        removeAt(i);
    L17:
        i = i - 1;
        goto L3
    L19:
        if (initialSize == this._size) goto L22;
        return true;
    L22:
        return false;
    }

    public final boolean retainAll(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        long[] content = this.content;
        MutableLongList this_$iv = this;
        int i = this_$iv._size - 1;
    L4:
        if ((-1) >= i) goto L10;
        long item = content[i];
        if (elements.contains(item) == true) goto L8;
        removeAt(i);
    L8:
        i = i - 1;
        goto L4
    L10:
        if (initialSize != this._size) goto L17;
        return false;
    L17:
        return true;
    }

    public final long set(int index, long element) {
        boolean r0 = false;
        if (index >= 0) goto L5;
    L7:
        if (r0 == true) goto L9;
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
    L9:
        long[] content = this.content;
        long old = content[index];
        content[index] = element;
        return old;
    L5:
        if (index >= this._size) goto L7;
        r0 = true;
        goto L7
    }

    public final void sort() {
        if (this._size != 0) goto L5;
        return;
    L5:
        ArraysKt.sort(this.content, 0, this._size);
    }

    public final void sortDescending() {
        if (this._size != 0) goto L5;
        return;
    L5:
        ArraysKt.sortDescending(this.content, 0, this._size);
    }
}
