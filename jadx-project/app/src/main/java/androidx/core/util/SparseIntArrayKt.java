package androidx.core.util;

import android.util.SparseIntArray;
import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SparseIntArray.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086\b\u001aE\u0010\u000b\u001a\u00020\f*\u00020\u000226\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\f0\u000eH\u0086\b\u001a\u001d\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0086\b\u001a#\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0086\b\u001a\r\u0010\u0015\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\r\u0010\u0016\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\n\u0010\u0017\u001a\u00020\u0018*\u00020\u0002\u001a\u0015\u0010\u0019\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0086\u0002\u001a\u0012\u0010\u001b\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u001a\u0010\u001c\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001\u001a\u001d\u0010\u001d\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\n\u0010\u001e\u001a\u00020\u0018*\u00020\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u001f"}, d2 = {"size", "", "Landroid/util/SparseIntArray;", "getSize", "(Landroid/util/SparseIntArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", "remove", "set", "valueIterator", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SparseIntArrayKt {
    public static final int getSize(SparseIntArray $this$size) {
        return $this$size.size();
    }

    public static final boolean contains(SparseIntArray $this$contains, int key) {
        if ($this$contains.indexOfKey(key) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final void set(SparseIntArray $this$set, int key, int value) {
        $this$set.put(key, value);
    }

    public static final SparseIntArray plus(SparseIntArray $this$plus, SparseIntArray other) {
        SparseIntArray r0 = new SparseIntArray($this$plus.size() + other.size());
        putAll(r0, $this$plus);
        putAll(r0, other);
        return r0;
    }

    public static final boolean containsKey(SparseIntArray $this$containsKey, int key) {
        if ($this$containsKey.indexOfKey(key) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean containsValue(SparseIntArray $this$containsValue, int value) {
        if ($this$containsValue.indexOfValue(value) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final int getOrDefault(SparseIntArray $this$getOrDefault, int key, int defaultValue) {
        return $this$getOrDefault.get(key, defaultValue);
    }

    public static final int getOrElse(SparseIntArray $this$getOrElse, int key, Function0<Integer> r6) {
        int it = $this$getOrElse.indexOfKey(key);
        if (it < 0) goto L6;
        return $this$getOrElse.valueAt(it);
    L6:
        return r6.invoke().intValue();
    }

    public static final boolean isEmpty(SparseIntArray $this$isEmpty) {
        if ($this$isEmpty.size() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean isNotEmpty(SparseIntArray $this$isNotEmpty) {
        if ($this$isNotEmpty.size() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean remove(SparseIntArray $this$remove, int key, int value) {
        int index = $this$remove.indexOfKey(key);
        if (index >= 0) goto L5;
        return false;
    L5:
        if (value != $this$remove.valueAt(index)) goto L10;
        $this$remove.removeAt(index);
        return true;
    L10:
        return false;
    }

    public static final void putAll(SparseIntArray $this$putAll, SparseIntArray other) {
        int index$iv = 0;
        int r3 = other.size();
    L3:
        if (index$iv >= r3) goto L6;
        int p0 = other.keyAt(index$iv);
        int p1 = other.valueAt(index$iv);
        $this$putAll.put(p0, p1);
        index$iv = index$iv + 1;
        goto L3
    }

    public static final void forEach(SparseIntArray $this$forEach, Function2<? super Integer, ? super Integer, Unit> r6) {
        int index = 0;
        int r2 = $this$forEach.size();
    L3:
        if (index >= r2) goto L5;
        r6.invoke(Integer.valueOf($this$forEach.keyAt(index)), Integer.valueOf($this$forEach.valueAt(index)));
        index = index + 1;
        goto L3
    }

    public static final IntIterator keyIterator(final SparseIntArray $this$keyIterator) {
        return new AnonymousClass1($this$keyIterator);
    }

    public static final IntIterator valueIterator(final SparseIntArray $this$valueIterator) {
        return new C06861($this$valueIterator);
    }
}
