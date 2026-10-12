package androidx.core.util;

import android.util.LongSparseArray;
import androidx.autofill.HintConstants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: LongSparseArray.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0000\u001a!\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0086\n\u001a!\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0086\b\u001a&\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\f\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\r\u001aQ\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000326\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\b\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0086\b\u001a.\u0010\u0014\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0016\u001a4\u0010\u0017\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0018H\u0086\b¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a\u0019\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a\u0016\u0010\u001c\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a-\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\u0002\u001a$\u0010 \u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a+\u0010!\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u0002H\u0002¢\u0006\u0002\u0010\"\u001a.\u0010#\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u0002H\u0002H\u0086\n¢\u0006\u0002\u0010$\u001a\u001c\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00020&\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\"\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006'"}, d2 = {"size", "", "T", "Landroid/util/LongSparseArray;", "getSize", "(Landroid/util/LongSparseArray;)I", "contains", "", "key", "", "containsKey", "containsValue", "value", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getOrDefault", "defaultValue", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Landroid/util/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/LongIterator;", "plus", "other", "putAll", "remove", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "set", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "valueIterator", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LongSparseArrayKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.core.util.LongSparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"androidx/core/util/LongSparseArrayKt$valueIterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "kotlin.jvm.PlatformType", "()Ljava/lang/Object;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C06831<T> implements Iterator<T>, KMappedMarker {
        final /* synthetic */ LongSparseArray<T> $this_valueIterator;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C06831(LongSparseArray<T> r1) {
            this.$this_valueIterator = r1;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setIndex(int r1) {
            this.index = r1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.index >= this.$this_valueIterator.size()) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> r0 = this.$this_valueIterator;
            int r1 = this.index;
            this.index = r1 + 1;
            return r0.valueAt(r1);
        }
    }

    public static final <T> int getSize(LongSparseArray<T> r2) {
        return r2.size();
    }

    public static final <T> boolean contains(LongSparseArray<T> r2, long key) {
        if (r2.indexOfKey(key) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <T> void set(LongSparseArray<T> r1, long key, T r4) {
        r1.put(key, r4);
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> r3, LongSparseArray<T> r4) {
        LongSparseArray<T> r0 = new LongSparseArray(r3.size() + r4.size());
        putAll(r0, r3);
        putAll(r0, r4);
        return r0;
    }

    public static final <T> boolean containsKey(LongSparseArray<T> r2, long key) {
        if (r2.indexOfKey(key) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <T> boolean containsValue(LongSparseArray<T> r2, T r3) {
        if (r2.indexOfValue(r3) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <T> T getOrDefault(LongSparseArray<T> r2, long key, T r5) {
        T r1 = r2.get(key);
        if (r1 == null) goto L5;
        return r1;
    L5:
        return r5;
    }

    public static final <T> T getOrElse(LongSparseArray<T> r2, long key, Function0<? extends T> r5) {
        T r1 = r2.get(key);
        if (r1 == null) goto L5;
        return r1;
    L5:
        return r5.invoke();
    }

    public static final <T> boolean isEmpty(LongSparseArray<T> r2) {
        if (r2.size() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> r2) {
        if (r2.size() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <T> boolean remove(LongSparseArray<T> r2, long key, T r5) {
        int index = r2.indexOfKey(key);
        if (index >= 0) goto L5;
        return false;
    L5:
        if (Intrinsics.areEqual(r5, r2.valueAt(index)) == false) goto L10;
        r2.removeAt(index);
        return true;
    L10:
        return false;
    }

    public static final <T> void putAll(LongSparseArray<T> r8, LongSparseArray<T> r9) {
        int index$iv = 0;
        int r3 = r9.size();
    L3:
        if (index$iv >= r3) goto L6;
        long p0 = r9.keyAt(index$iv);
        r8.put(p0, r9.valueAt(index$iv));
        index$iv = index$iv + 1;
        goto L3
    }

    public static final <T> void forEach(LongSparseArray<T> r5, Function2<? super Long, ? super T, Unit> r6) {
        int index = 0;
        int r2 = r5.size();
    L3:
        if (index >= r2) goto L5;
        r6.invoke(Long.valueOf(r5.keyAt(index)), r5.valueAt(index));
        index = index + 1;
        goto L3
    }

    public static final <T> LongIterator keyIterator(final LongSparseArray<T> r1) {
        return new AnonymousClass1(r1);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> r1) {
        return new C06831(r1);
    }
}
