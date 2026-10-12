package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u0084\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005:\f\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001BG\b\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0013J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&J\b\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020!H\u0016J\u0015\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00100J\u0015\u00101\u001a\u00020!2\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00100J\u0018\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010/\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00103J\u001f\u00104\u001a\u0004\u0018\u00018\u00012\u0006\u0010/\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00105J\u001e\u00106\u001a\u00020*2\u0014\u00107\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0016J\u0017\u00108\u001a\u0004\u0018\u00018\u00012\u0006\u0010/\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J\b\u00109\u001a\u00020*H\u0016J\u0013\u0010E\u001a\u00020!2\b\u0010F\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010G\u001a\u00020\rH\u0016J\b\u0010H\u001a\u00020IH\u0016J\b\u0010N\u001a\u00020*H\u0002J\r\u0010O\u001a\u00020*H\u0000¢\u0006\u0002\bPJ\u0010\u0010Q\u001a\u00020*2\u0006\u0010R\u001a\u00020\rH\u0002J\u0010\u0010S\u001a\u00020!2\u0006\u0010T\u001a\u00020\rH\u0002J\u0010\u0010U\u001a\u00020*2\u0006\u0010V\u001a\u00020\rH\u0002J\u0013\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020\r2\u0006\u0010/\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010ZJ\u0010\u0010[\u001a\u00020*2\u0006\u0010\\\u001a\u00020!H\u0002J\u0010\u0010]\u001a\u00020*2\u0006\u0010^\u001a\u00020\rH\u0002J\u0010\u0010_\u001a\u00020!2\u0006\u0010`\u001a\u00020\rH\u0002J\u0015\u0010a\u001a\u00020\r2\u0006\u0010/\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010ZJ\u0015\u0010b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010ZJ\u0017\u0010c\u001a\u00020\r2\u0006\u0010/\u001a\u00028\u0000H\u0000¢\u0006\u0004\bd\u0010ZJ\u0017\u0010e\u001a\u00020!2\u0006\u0010/\u001a\u00028\u0000H\u0000¢\u0006\u0004\bf\u00100J\u0010\u0010g\u001a\u00020*2\u0006\u0010h\u001a\u00020\rH\u0002J\u0010\u0010i\u001a\u00020*2\u0006\u0010j\u001a\u00020\rH\u0002J!\u0010k\u001a\u00020!2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0000¢\u0006\u0002\bnJ\u0018\u0010o\u001a\u00020!2\u000e\u0010F\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&H\u0002J\u0019\u0010p\u001a\u00020!2\n\u0010q\u001a\u0006\u0012\u0002\b\u00030rH\u0000¢\u0006\u0002\bsJ\u001c\u0010t\u001a\u00020!2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0002J\"\u0010u\u001a\u00020!2\u0018\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010m0rH\u0002J!\u0010v\u001a\u00020!2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0000¢\u0006\u0002\bwJ\u0017\u0010x\u001a\u00020!2\u0006\u0010y\u001a\u00028\u0001H\u0000¢\u0006\u0004\bz\u00100J\u0019\u0010{\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010|H\u0000¢\u0006\u0002\b}J\u001a\u0010~\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u007fH\u0000¢\u0006\u0003\b\u0080\u0001J\u001c\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001H\u0000¢\u0006\u0003\b\u0083\u0001R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR&\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010=R\u0014\u0010J\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u001aR\u0014\u0010L\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u001a¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "keysArray", "", "valuesArray", "presenceArray", "", "hashArray", "maxProbeDistance", "", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "[Ljava/lang/Object;", "hashShift", "modCount", "value", "size", "getSize", "()I", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "", "isReadOnly", "isReadOnly$kotlin_stdlib", "()Z", "build", "", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "isEmpty", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "remove", "clear", "keys", "", "getKeys", "()Ljava/util/Set;", "values", "", "getValues", "()Ljava/util/Collection;", "entries", "", "getEntries", "equals", "other", "hashCode", "toString", "", "capacity", "getCapacity$kotlin_stdlib", "hashSize", "getHashSize", "registerModification", "checkIsMutable", "checkIsMutable$kotlin_stdlib", "ensureExtraCapacity", "n", "shouldCompact", "extraCapacity", "ensureCapacity", "minCapacity", "allocateValuesArray", "()[Ljava/lang/Object;", "hash", "(Ljava/lang/Object;)I", "compact", "updateHashArray", "rehash", "newHashSize", "putRehash", "i", "findKey", "findValue", "addKey", "addKey$kotlin_stdlib", "removeKey", "removeKey$kotlin_stdlib", "removeEntryAt", "index", "removeHashAt", "removedHash", "containsEntry", "entry", "", "containsEntry$kotlin_stdlib", "contentEquals", "containsAllEntries", "m", "", "containsAllEntries$kotlin_stdlib", "putEntry", "putAllEntries", "removeEntry", "removeEntry$kotlin_stdlib", "removeValue", "element", "removeValue$kotlin_stdlib", "keysIterator", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "entriesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "Companion", "Itr", "KeysItr", "ValuesItr", "EntriesItr", "EntryRef", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {
    public static final Companion Companion = null;
    private static final MapBuilder Empty = null;
    private static final int INITIAL_CAPACITY = 8;
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    private static final int MAGIC = -1640531527;
    private static final int TOMBSTONE = -1;
    private MapBuilderEntries<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private MapBuilderKeys<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private MapBuilderValues<V> valuesView;

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "<init>", "()V", "MAGIC", "", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "Empty", "Lkotlin/collections/builders/MapBuilder;", "", "getEmpty$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "computeHashSize", "capacity", "computeShift", "hashSize", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ int access$computeHashSize(Companion $this, int capacity) {
            return $this.computeHashSize(capacity);
        }

        public static final /* synthetic */ int access$computeShift(Companion $this, int hashSize) {
            return $this.computeShift(hashSize);
        }

        public final MapBuilder getEmpty$kotlin_stdlib() {
            return MapBuilder.access$getEmpty$cp();
        }

        private final int computeHashSize(int capacity) {
            return Integer.highestOneBit(RangesKt.coerceAtLeast(capacity, 1) * 3);
        }

        private final int computeShift(int hashSize) {
            return Integer.numberOfLeadingZeros(hashSize) + 1;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000bH\u0096\u0002J\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0012\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "nextHashCode", "", "nextHashCode$kotlin_stdlib", "nextAppendString", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EntriesItr<K, V> extends Itr<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        public EntriesItr(MapBuilder<K, V> r2) {
            Intrinsics.checkNotNullParameter(r2, "map");
            super(r2);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return next();
        }

        @Override // java.util.Iterator
        public EntryRef<K, V> next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= MapBuilder.access$getLength$p(getMap$kotlin_stdlib())) goto L7;
            int r0 = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(r0 + 1);
            setLastIndex$kotlin_stdlib(r0);
            EntryRef<K, V> r1 = new EntryRef(getMap$kotlin_stdlib(), getLastIndex$kotlin_stdlib());
            initNext$kotlin_stdlib();
            return r1;
        L7:
            throw new NoSuchElementException();
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (getIndex$kotlin_stdlib() >= MapBuilder.access$getLength$p(getMap$kotlin_stdlib())) goto L14;
            int r0 = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(r0 + 1);
            setLastIndex$kotlin_stdlib(r0);
            Object r1 = MapBuilder.access$getKeysArray$p(getMap$kotlin_stdlib())[getLastIndex$kotlin_stdlib()];
            int r2 = 0;
            if (r1 == null) goto L7;
            int r3 = r1.hashCode();
        L8:
            Object[] r4 = MapBuilder.access$getValuesArray$p(getMap$kotlin_stdlib());
            Intrinsics.checkNotNull(r4);
            Object r5 = r4[getLastIndex$kotlin_stdlib()];
            if (r5 == null) goto L11;
            r2 = r5.hashCode();
        L11:
            int result = r3 ^ r2;
            initNext$kotlin_stdlib();
            return result;
        L7:
            r3 = 0;
            goto L8
        L14:
            throw new NoSuchElementException();
        }

        public final void nextAppendString(StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            if (getIndex$kotlin_stdlib() >= MapBuilder.access$getLength$p(getMap$kotlin_stdlib())) goto L15;
            int r0 = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(r0 + 1);
            setLastIndex$kotlin_stdlib(r0);
            Object key = MapBuilder.access$getKeysArray$p(getMap$kotlin_stdlib())[getLastIndex$kotlin_stdlib()];
            if (key != getMap$kotlin_stdlib()) goto L7;
            sb.append("(this Map)");
        L8:
            sb.append('=');
            Object[] r1 = MapBuilder.access$getValuesArray$p(getMap$kotlin_stdlib());
            Intrinsics.checkNotNull(r1);
            Object value = r1[getLastIndex$kotlin_stdlib()];
            if (value != getMap$kotlin_stdlib()) goto L11;
            sb.append("(this Map)");
        L12:
            initNext$kotlin_stdlib();
            return;
        L11:
            sb.append(value);
            goto L12
        L7:
            sb.append(key);
            goto L8
        L15:
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0010\u001a\u00028\u00032\u0006\u0010\u0011\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "map", "Lkotlin/collections/builders/MapBuilder;", "index", "", "<init>", "(Lkotlin/collections/builders/MapBuilder;I)V", "expectedModCount", "key", "getKey", "()Ljava/lang/Object;", "value", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "toString", "", "checkForComodification", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EntryRef<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
        private final int expectedModCount;
        private final int index;
        private final MapBuilder<K, V> map;

        public EntryRef(MapBuilder<K, V> r2, int index) {
            Intrinsics.checkNotNullParameter(r2, "map");
            this.map = r2;
            this.index = index;
            this.expectedModCount = MapBuilder.access$getModCount$p(this.map);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            checkForComodification();
            return (K) MapBuilder.access$getKeysArray$p(this.map)[this.index];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            checkForComodification();
            Object[] r0 = MapBuilder.access$getValuesArray$p(this.map);
            Intrinsics.checkNotNull(r0);
            return (V) r0[this.index];
        }

        @Override // java.util.Map.Entry
        public V setValue(V r4) {
            checkForComodification();
            this.map.checkIsMutable$kotlin_stdlib();
            Object[] r0 = MapBuilder.access$allocateValuesArray(this.map);
            V r1 = (V) r0[this.index];
            r0[this.index] = r4;
            return r1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if ((other instanceof Map.Entry) == true) goto L5;
        L9:
            return false;
        L5:
            if (Intrinsics.areEqual(((Map.Entry) other).getKey(), getKey()) == false) goto L9;
            if (Intrinsics.areEqual(((Map.Entry) other).getValue(), getValue()) == false) goto L9;
            return true;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K r0 = getKey();
            int r1 = 0;
            if (r0 == null) goto L5;
            int r2 = r0.hashCode();
        L6:
            V r3 = getValue();
            if (r3 == null) goto L10;
            r1 = r3.hashCode();
        L10:
            return r2 ^ r1;
        L5:
            r2 = 0;
            goto L6
        }

        public String toString() {
            return new StringBuilder().append(getKey()).append('=').append(getValue()).toString();
        }

        private final void checkForComodification() {
            if (MapBuilder.access$getModCount$p(this.map) != this.expectedModCount) goto L6;
            return;
        L6:
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0015J\r\u0010\u001a\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u001bR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "index", "", "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "lastIndex", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "expectedModCount", "initNext", "", "initNext$kotlin_stdlib", "hasNext", "", "remove", "checkForComodification", "checkForComodification$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class Itr<K, V> {
        private int expectedModCount;
        private int index;
        private int lastIndex;
        private final MapBuilder<K, V> map;

        public Itr(MapBuilder<K, V> r2) {
            Intrinsics.checkNotNullParameter(r2, "map");
            this.map = r2;
            this.lastIndex = -1;
            this.expectedModCount = MapBuilder.access$getModCount$p(this.map);
            initNext$kotlin_stdlib();
        }

        public final MapBuilder<K, V> getMap$kotlin_stdlib() {
            return this.map;
        }

        public final int getIndex$kotlin_stdlib() {
            return this.index;
        }

        public final void setIndex$kotlin_stdlib(int r1) {
            this.index = r1;
        }

        public final int getLastIndex$kotlin_stdlib() {
            return this.lastIndex;
        }

        public final void setLastIndex$kotlin_stdlib(int r1) {
            this.lastIndex = r1;
        }

        public final void initNext$kotlin_stdlib() {
        L3:
            if (this.index >= MapBuilder.access$getLength$p(this.map)) goto L7;
            if (MapBuilder.access$getPresenceArray$p(this.map)[this.index] >= 0) goto L10;
            this.index++;
            goto L3
        L10:
            return;
        }

        public final boolean hasNext() {
            if (this.index >= MapBuilder.access$getLength$p(this.map)) goto L5;
            return true;
        L5:
            return false;
        }

        public final void remove() {
            checkForComodification$kotlin_stdlib();
            if (this.lastIndex == (-1)) goto L5;
            boolean r0 = true;
        L6:
            if (r0 == false) goto L10;
            this.map.checkIsMutable$kotlin_stdlib();
            MapBuilder.access$removeEntryAt(this.map, this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = MapBuilder.access$getModCount$p(this.map);
            return;
        L10:
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        L5:
            r0 = false;
            goto L6
        }

        public final void checkForComodification$kotlin_stdlib() {
            if (MapBuilder.access$getModCount$p(this.map) != this.expectedModCount) goto L6;
            return;
        L6:
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KeysItr<K, V> extends Itr<K, V> implements Iterator<K>, KMutableIterator {
        public KeysItr(MapBuilder<K, V> r2) {
            Intrinsics.checkNotNullParameter(r2, "map");
            super(r2);
        }

        @Override // java.util.Iterator
        public K next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= MapBuilder.access$getLength$p(getMap$kotlin_stdlib())) goto L7;
            int r0 = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(r0 + 1);
            setLastIndex$kotlin_stdlib(r0);
            K r1 = (K) MapBuilder.access$getKeysArray$p(getMap$kotlin_stdlib())[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return r1;
        L7:
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ValuesItr<K, V> extends Itr<K, V> implements Iterator<V>, KMutableIterator {
        public ValuesItr(MapBuilder<K, V> r2) {
            Intrinsics.checkNotNullParameter(r2, "map");
            super(r2);
        }

        @Override // java.util.Iterator
        public V next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= MapBuilder.access$getLength$p(getMap$kotlin_stdlib())) goto L7;
            int r0 = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(r0 + 1);
            setLastIndex$kotlin_stdlib(r0);
            Object[] r1 = MapBuilder.access$getValuesArray$p(getMap$kotlin_stdlib());
            Intrinsics.checkNotNull(r1);
            V r2 = (V) r1[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return r2;
        L7:
            throw new NoSuchElementException();
        }
    }

    private MapBuilder(K[] r3, V[] r4, int[] presenceArray, int[] hashArray, int maxProbeDistance, int length) {
        this.keysArray = r3;
        this.valuesArray = r4;
        this.presenceArray = presenceArray;
        this.hashArray = hashArray;
        this.maxProbeDistance = maxProbeDistance;
        this.length = length;
        this.hashShift = Companion.access$computeShift(Companion, getHashSize());
    }

    public static final /* synthetic */ Object[] access$allocateValuesArray(MapBuilder $this) {
        return $this.allocateValuesArray();
    }

    public static final /* synthetic */ MapBuilder access$getEmpty$cp() {
        return Empty;
    }

    public static final /* synthetic */ Object[] access$getKeysArray$p(MapBuilder $this) {
        return $this.keysArray;
    }

    public static final /* synthetic */ int access$getLength$p(MapBuilder $this) {
        return $this.length;
    }

    public static final /* synthetic */ int access$getModCount$p(MapBuilder $this) {
        return $this.modCount;
    }

    public static final /* synthetic */ int[] access$getPresenceArray$p(MapBuilder $this) {
        return $this.presenceArray;
    }

    public static final /* synthetic */ Object[] access$getValuesArray$p(MapBuilder $this) {
        return $this.valuesArray;
    }

    public static final /* synthetic */ void access$removeEntryAt(MapBuilder $this, int index) {
        $this.removeEntryAt(index);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public int getSize() {
        return this.size;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int initialCapacity) {
        this(ListBuilderKt.arrayOfUninitializedElements(initialCapacity), null, new int[initialCapacity], new int[Companion.access$computeHashSize(Companion, initialCapacity)], 2, 0);
    }

    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) goto L7;
        MapBuilder r0 = Empty;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return r0;
    L7:
        return this;
    }

    private final Object writeReplace() {
        if (this.isReadOnly == false) goto L7;
        return new SerializedMap(this);
    L7:
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void readObject(ObjectInputStream input) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object r2) {
        if (findKey(r2) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object r2) {
        if (findValue(r2) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object r3) {
        int index = findKey(r3);
        if (index >= 0) goto L6;
        return null;
    L6:
        V[] r1 = this.valuesArray;
        Intrinsics.checkNotNull(r1);
        return r1[index];
    }

    @Override // java.util.Map
    public V put(K r5, V r6) {
        checkIsMutable$kotlin_stdlib();
        int index = addKey$kotlin_stdlib(r5);
        V[] r1 = allocateValuesArray();
        if (index >= 0) goto L6;
        V r2 = r1[(-index) - 1];
        r1[(-index) - 1] = r6;
        return r2;
    L6:
        r1[index] = r6;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> r2) {
        Intrinsics.checkNotNullParameter(r2, "from");
        checkIsMutable$kotlin_stdlib();
        putAllEntries(r2.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object r3) {
        checkIsMutable$kotlin_stdlib();
        int index = findKey(r3);
        if (index >= 0) goto L6;
        return null;
    L6:
        V[] r1 = this.valuesArray;
        Intrinsics.checkNotNull(r1);
        V r2 = r1[index];
        removeEntryAt(index);
        return r2;
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i = 0;
        int r1 = this.length - 1;
        if (0 > r1) goto L9;
    L4:
        int hash = this.presenceArray[i];
        if (hash < 0) goto L7;
        this.hashArray[hash] = 0;
        this.presenceArray[i] = -1;
    L7:
        if (i == r1) goto L9;
        i = i + 1;
    L9:
        ListBuilderKt.resetRange(this.keysArray, 0, this.length);
        V[] r0 = this.valuesArray;
        if (r0 == null) goto L12;
        ListBuilderKt.resetRange(r0, 0, this.length);
    L12:
        this.size = 0;
        this.length = 0;
        registerModification();
    }

    public Set<K> getKeys() {
        MapBuilderKeys<K> r0 = this.keysView;
        if (r0 != null) goto L6;
        MapBuilderKeys<K> r1 = new MapBuilderKeys(this);
        this.keysView = r1;
        return r1;
    L6:
        return r0;
    }

    public Collection<V> getValues() {
        MapBuilderValues<V> r0 = this.valuesView;
        if (r0 != null) goto L6;
        MapBuilderValues<V> r1 = new MapBuilderValues(this);
        this.valuesView = r1;
        return r1;
    L6:
        return r0;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        MapBuilderEntries<K, V> r0 = this.entriesView;
        if (r0 != null) goto L7;
        MapBuilderEntries<K, V> r1 = new MapBuilderEntries(this);
        this.entriesView = r1;
        return r1;
    L7:
        return r0;
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other != this) goto L4;
    L9:
        return true;
    L4:
        if ((other instanceof Map) == true) goto L6;
    L8:
        return false;
    L6:
        if (contentEquals((Map) other) == false) goto L8;
        goto L8
    }

    @Override // java.util.Map
    public int hashCode() {
        int result = 0;
        EntriesItr<K, V> r1 = entriesIterator$kotlin_stdlib();
    L4:
        if (r1.hasNext() == false) goto L6;
        result = result + r1.nextHashCode$kotlin_stdlib();
        goto L4
    L6:
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        int i = 0;
        EntriesItr<K, V> r2 = entriesIterator$kotlin_stdlib();
    L4:
        if (r2.hasNext() == false) goto L8;
        if (i <= 0) goto L7;
        sb.append(", ");
    L7:
        r2.nextAppendString(sb);
        i = i + 1;
        goto L4
    L8:
        sb.append("}");
        String r3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(r3, "toString(...)");
        return r3;
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    private final void registerModification() {
        this.modCount++;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    private final void ensureExtraCapacity(int n) {
        if (shouldCompact(n) == false) goto L5;
        compact(true);
        return;
    L5:
        ensureCapacity(this.length + n);
    }

    private final boolean shouldCompact(int extraCapacity) {
        int spareCapacity = getCapacity$kotlin_stdlib() - this.length;
        int gaps = this.length - size();
        if (spareCapacity < extraCapacity) goto L5;
    L9:
        return false;
    L5:
        if ((gaps + spareCapacity) < extraCapacity) goto L9;
        if (gaps < (getCapacity$kotlin_stdlib() / 4)) goto L9;
        return true;
    }

    private final void ensureCapacity(int r4) {
        if (r4 < 0) goto L14;
        if (r4 <= getCapacity$kotlin_stdlib()) goto L15;
        int r0 = AbstractList.Companion.newCapacity$kotlin_stdlib(getCapacity$kotlin_stdlib(), r4);
        this.keysArray = (K[]) ListBuilderKt.copyOfUninitializedElements(this.keysArray, r0);
        V[] r1 = this.valuesArray;
        if (r1 == null) goto L8;
        V[] r2 = (V[]) ListBuilderKt.copyOfUninitializedElements(r1, r0);
    L9:
        this.valuesArray = r2;
        int[] r3 = Arrays.copyOf(this.presenceArray, r0);
        Intrinsics.checkNotNullExpressionValue(r3, "copyOf(...)");
        this.presenceArray = r3;
        int r5 = Companion.access$computeHashSize(Companion, r0);
        if (r5 <= getHashSize()) goto L16;
        rehash(r5);
        return;
    L16:
        return;
    L8:
        r2 = null;
        goto L9
    L15:
        return;
    L14:
        throw new OutOfMemoryError();
    }

    private final V[] allocateValuesArray() {
        V[] r0 = this.valuesArray;
        if (r0 == null) goto L5;
        return r0;
    L5:
        V[] r1 = (V[]) ListBuilderKt.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
        this.valuesArray = r1;
        return r1;
    }

    private final int hash(K r3) {
        if (r3 == null) goto L4;
        int r0 = r3.hashCode();
    L6:
        return (r0 * MAGIC) >>> this.hashShift;
    L4:
        r0 = 0;
        goto L6
    }

    private final void compact(boolean updateHashArray) {
        int i = 0;
        int j = 0;
        Object[] valuesArray = this.valuesArray;
    L4:
        if (i >= this.length) goto L14;
        int hash = this.presenceArray[i];
        if (hash < 0) goto L13;
        this.keysArray[j] = this.keysArray[i];
        if (valuesArray == null) goto L10;
        valuesArray[j] = valuesArray[i];
    L10:
        if (updateHashArray == false) goto L12;
        this.presenceArray[j] = hash;
        this.hashArray[hash] = j + 1;
    L12:
        j = j + 1;
    L13:
        i = i + 1;
        goto L4
    L14:
        ListBuilderKt.resetRange(this.keysArray, j, this.length);
        if (valuesArray == null) goto L17;
        ListBuilderKt.resetRange(valuesArray, j, this.length);
    L17:
        this.length = j;
    }

    private final void rehash(int newHashSize) {
        registerModification();
        if (this.length <= size()) goto L5;
        compact(false);
    L5:
        this.hashArray = new int[newHashSize];
        this.hashShift = Companion.access$computeShift(Companion, newHashSize);
        int i = 0;
    L7:
        if (i >= this.length) goto L13;
        int i2 = i + 1;
        if (putRehash(i) == false) goto L12;
        i = i2;
        goto L7
    L12:
        throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
    }

    private final boolean putRehash(int i) {
        int hash = hash(this.keysArray[i]);
        int probesLeft = this.maxProbeDistance;
    L3:
        int index = this.hashArray[hash];
        if (index == 0) goto L5;
        probesLeft = probesLeft - 1;
        if (probesLeft < 0) goto L9;
        int hash2 = hash - 1;
        if (hash == 0) goto L13;
        hash = hash2;
        goto L3
    L13:
        hash = getHashSize() - 1;
        goto L3
    L9:
        return false;
    L5:
        this.hashArray[hash] = i + 1;
        this.presenceArray[i] = hash;
        return true;
    }

    private final int findKey(K r7) {
        int hash = hash(r7);
        int probesLeft = this.maxProbeDistance;
    L3:
        int index = this.hashArray[hash];
        if (index == 0) goto L5;
        if (index > 0) goto L8;
    L11:
        probesLeft = probesLeft - 1;
        if (probesLeft < 0) goto L13;
        int hash2 = hash - 1;
        if (hash == 0) goto L16;
        hash = hash2;
        goto L3
    L16:
        hash = getHashSize() - 1;
        goto L3
    L13:
        return -1;
    L8:
        if (Intrinsics.areEqual(this.keysArray[index - 1], r7) == false) goto L11;
        return index - 1;
    L5:
        return -1;
    }

    private final int findValue(V r3) {
        int i = this.length;
    L3:
        i = i - 1;
        if (i < 0) goto L10;
        if (this.presenceArray[i] < 0) goto L3;
        V[] r1 = this.valuesArray;
        Intrinsics.checkNotNull(r1);
        if (Intrinsics.areEqual(r1[i], r3) == false) goto L3;
        return i;
    L10:
        return -1;
    }

    public final int addKey$kotlin_stdlib(K r9) {
        checkIsMutable$kotlin_stdlib();
    L3:
        int hash = hash(r9);
        int tentativeMaxProbeDistance = RangesKt.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
        int probeDistance = 0;
    L4:
        int index = this.hashArray[hash];
        if (index <= 0) goto L7;
        if (Intrinsics.areEqual(this.keysArray[index - 1], r9) == true) goto L16;
        probeDistance = probeDistance + 1;
        if (probeDistance > tentativeMaxProbeDistance) goto L19;
        int hash2 = hash - 1;
        if (hash == 0) goto L22;
        hash = hash2;
        goto L4
    L22:
        hash = getHashSize() - 1;
        goto L4
    L19:
        rehash(getHashSize() * 2);
        goto L3
    L16:
        return -index;
    L7:
        if (this.length < getCapacity$kotlin_stdlib()) goto L9;
        ensureExtraCapacity(1);
        goto L3
    L9:
        int putIndex = this.length;
        this.length = putIndex + 1;
        this.keysArray[putIndex] = r9;
        this.presenceArray[putIndex] = hash;
        this.hashArray[hash] = putIndex + 1;
        this.size = size() + 1;
        registerModification();
        if (probeDistance <= this.maxProbeDistance) goto L12;
        this.maxProbeDistance = probeDistance;
    L12:
        return putIndex;
    }

    public final boolean removeKey$kotlin_stdlib(K r3) {
        checkIsMutable$kotlin_stdlib();
        int index = findKey(r3);
        if (index >= 0) goto L6;
        return false;
    L6:
        removeEntryAt(index);
        return true;
    }

    private final void removeEntryAt(int index) {
        ListBuilderKt.resetAt(this.keysArray, index);
        V[] r0 = this.valuesArray;
        if (r0 == null) goto L5;
        ListBuilderKt.resetAt(r0, index);
    L5:
        removeHashAt(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size = size() - 1;
        registerModification();
    }

    private final void removeHashAt(int removedHash) {
        int hash = removedHash;
        int hole = removedHash;
        int probeDistance = 0;
        int patchAttemptsLeft = RangesKt.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
    L3:
        int hash2 = hash - 1;
        if (hash != 0) goto L6;
        hash = getHashSize() - 1;
    L7:
        probeDistance = probeDistance + 1;
        int r4 = this.maxProbeDistance;
        int[] r5 = this.hashArray;
        if (probeDistance > r4) goto L9;
        int index = r5[hash];
        if (index == 0) goto L13;
        if (index >= 0) goto L18;
        this.hashArray[hole] = -1;
        hole = hash;
        probeDistance = 0;
    L21:
        patchAttemptsLeft = patchAttemptsLeft - 1;
        if (patchAttemptsLeft >= 0) goto L3;
        this.hashArray[hole] = -1;
        return;
    L18:
        int otherHash = hash(this.keysArray[index - 1]);
        if (((otherHash - hash) & (getHashSize() - 1)) < probeDistance) goto L21;
        this.hashArray[hole] = index;
        this.presenceArray[index - 1] = hole;
        hole = hash;
        probeDistance = 0;
        goto L21
    L13:
        this.hashArray[hole] = 0;
        return;
    L9:
        r5[hole] = 0;
        return;
    L6:
        hash = hash2;
        goto L7
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> r4) {
        Intrinsics.checkNotNullParameter(r4, "entry");
        int index = findKey(r4.getKey());
        if (index >= 0) goto L6;
        return false;
    L6:
        V[] r1 = this.valuesArray;
        Intrinsics.checkNotNull(r1);
        return Intrinsics.areEqual(r1[index], r4.getValue());
    }

    private final boolean contentEquals(Map<?, ?> r3) {
        if (size() == r3.size()) goto L5;
    L7:
        return false;
    L5:
        if (containsAllEntries$kotlin_stdlib(r3.entrySet()) == false) goto L7;
        return true;
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> r5) {
        Intrinsics.checkNotNullParameter(r5, "m");
        Iterator<?> r0 = r5.iterator();
    L4:
        if (r0.hasNext() == false) goto L13;
        Object entry = r0.next();
        if (entry == null) goto L12;
        if (containsEntry$kotlin_stdlib((Map.Entry) entry) == true) goto L4;
    L11:
        return false;
    L12:
        return false;
    L13:
        return true;
    }

    private final boolean putEntry(Map.Entry<? extends K, ? extends V> r7) {
        int index = addKey$kotlin_stdlib(r7.getKey());
        Object[] valuesArray = allocateValuesArray();
        if (index < 0) goto L6;
        valuesArray[index] = r7.getValue();
        return true;
    L6:
        Object oldValue = valuesArray[(-index) - 1];
        if (Intrinsics.areEqual(r7.getValue(), oldValue) == true) goto L10;
        valuesArray[(-index) - 1] = r7.getValue();
        return true;
    L10:
        return false;
    }

    private final boolean putAllEntries(Collection<? extends Map.Entry<? extends K, ? extends V>> r4) {
        if (r4.isEmpty() == false) goto L6;
        return false;
    L6:
        ensureExtraCapacity(r4.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> r0 = r4.iterator();
        boolean updated = false;
    L8:
        if (r0.hasNext() == false) goto L12;
        if (putEntry(r0.next()) == false) goto L8;
        updated = true;
        goto L8
    L12:
        return updated;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> r5) {
        Intrinsics.checkNotNullParameter(r5, "entry");
        checkIsMutable$kotlin_stdlib();
        int index = findKey(r5.getKey());
        if (index >= 0) goto L5;
        return false;
    L5:
        V[] r2 = this.valuesArray;
        Intrinsics.checkNotNull(r2);
        if (Intrinsics.areEqual(r2[index], r5.getValue()) == true) goto L8;
        return false;
    L8:
        removeEntryAt(index);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V r3) {
        checkIsMutable$kotlin_stdlib();
        int index = findValue(r3);
        if (index >= 0) goto L6;
        return false;
    L6:
        removeEntryAt(index);
        return true;
    }

    public final KeysItr<K, V> keysIterator$kotlin_stdlib() {
        return new KeysItr(this);
    }

    public final ValuesItr<K, V> valuesIterator$kotlin_stdlib() {
        return new ValuesItr(this);
    }

    public final EntriesItr<K, V> entriesIterator$kotlin_stdlib() {
        return new EntriesItr(this);
    }

    static {
        Companion = new Companion(null);
        MapBuilder it = new MapBuilder(0);
        it.isReadOnly = true;
        Empty = it;
    }
}
