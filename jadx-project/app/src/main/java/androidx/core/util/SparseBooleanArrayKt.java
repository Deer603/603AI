package androidx.core.util;

import android.util.SparseBooleanArray;
import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.BooleanIterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SparseBooleanArray.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0086\b\u001aE\u0010\u000b\u001a\u00020\f*\u00020\u000226\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\f0\u000eH\u0086\b\u001a\u001d\u0010\u0011\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0006H\u0086\b\u001a#\u0010\u0013\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\b\u001a\r\u0010\u0015\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\r\u0010\u0016\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\n\u0010\u0017\u001a\u00020\u0018*\u00020\u0002\u001a\u0015\u0010\u0019\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0086\u0002\u001a\u0012\u0010\u001b\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u001a\u0010\u001c\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006\u001a\u001d\u0010\u001d\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0086\n\u001a\n\u0010\u001e\u001a\u00020\u001f*\u00020\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006 "}, d2 = {"size", "", "Landroid/util/SparseBooleanArray;", "getSize", "(Landroid/util/SparseBooleanArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", "remove", "set", "valueIterator", "Lkotlin/collections/BooleanIterator;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SparseBooleanArrayKt {
    public static final int getSize(SparseBooleanArray $this$size) {
        return $this$size.size();
    }

    public static final boolean contains(SparseBooleanArray $this$contains, int key) {
        if ($this$contains.indexOfKey(key) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final void set(SparseBooleanArray $this$set, int key, boolean value) {
        $this$set.put(key, value);
    }

    public static final SparseBooleanArray plus(SparseBooleanArray $this$plus, SparseBooleanArray other) {
        SparseBooleanArray r0 = new SparseBooleanArray($this$plus.size() + other.size());
        putAll(r0, $this$plus);
        putAll(r0, other);
        return r0;
    }

    public static final boolean containsKey(SparseBooleanArray $this$containsKey, int key) {
        if ($this$containsKey.indexOfKey(key) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean containsValue(SparseBooleanArray $this$containsValue, boolean value) {
        if ($this$containsValue.indexOfValue(value) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean getOrDefault(SparseBooleanArray $this$getOrDefault, int key, boolean defaultValue) {
        return $this$getOrDefault.get(key, defaultValue);
    }

    public static final boolean getOrElse(SparseBooleanArray $this$getOrElse, int key, Function0<Boolean> r6) {
        int it = $this$getOrElse.indexOfKey(key);
        if (it < 0) goto L6;
        return $this$getOrElse.valueAt(it);
    L6:
        return r6.invoke().booleanValue();
    }

    public static final boolean isEmpty(SparseBooleanArray $this$isEmpty) {
        if ($this$isEmpty.size() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean isNotEmpty(SparseBooleanArray $this$isNotEmpty) {
        if ($this$isNotEmpty.size() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean remove(SparseBooleanArray $this$remove, int key, boolean value) {
        int index = $this$remove.indexOfKey(key);
        if (index >= 0) goto L5;
        return false;
    L5:
        if (value != $this$remove.valueAt(index)) goto L10;
        $this$remove.delete(key);
        return true;
    L10:
        return false;
    }

    public static final void putAll(SparseBooleanArray $this$putAll, SparseBooleanArray other) {
        int index$iv = 0;
        int r3 = other.size();
    L3:
        if (index$iv >= r3) goto L6;
        int p0 = other.keyAt(index$iv);
        boolean p1 = other.valueAt(index$iv);
        $this$putAll.put(p0, p1);
        index$iv = index$iv + 1;
        goto L3
    }

    public static final void forEach(SparseBooleanArray $this$forEach, Function2<? super Integer, ? super Boolean, Unit> r6) {
        int index = 0;
        int r2 = $this$forEach.size();
    L3:
        if (index >= r2) goto L5;
        r6.invoke(Integer.valueOf($this$forEach.keyAt(index)), Boolean.valueOf($this$forEach.valueAt(index)));
        index = index + 1;
        goto L3
    }

    public static final IntIterator keyIterator(final SparseBooleanArray $this$keyIterator) {
        return new AnonymousClass1($this$keyIterator);
    }

    public static final BooleanIterator valueIterator(final SparseBooleanArray $this$valueIterator) {
        return new C06851($this$valueIterator);
    }
}
