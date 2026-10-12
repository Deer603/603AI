package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: SieveCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u001d\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002Bà\u0001\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u00128\b\u0002\u0010\u0007\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\b\u0012%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000e\u0012d\b\u0002\u0010\u000f\u001a^\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\u0002\u0010\u0016J\r\u00103\u001a\u00020\u0015H\u0000¢\u0006\u0002\b4J&\u00105\u001a\u00020\u00132\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\bH\u0086\bø\u0001\u0000J\u0006\u00107\u001a\u00020\u0013J&\u00107\u001a\u00020\u00132\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\bH\u0086\bø\u0001\u0000J\u0016\u00108\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u00109J\u0013\u0010;\u001a\u00020\u00132\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0002\u00109J\u0006\u0010\u001e\u001a\u00020\u0005J&\u0010\u001e\u001a\u00020\u00052\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\bH\u0086\bø\u0001\u0000J\r\u0010<\u001a\u00020\u0015H\u0000¢\u0006\u0002\b=J\u0013\u0010>\u001a\u00020\u00132\b\u0010?\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0006\u0010@\u001a\u00020\u0015J\b\u0010A\u001a\u00020\u0005H\u0002J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0002J\u0015\u0010D\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010EJ\u0015\u0010F\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010EJ\u0010\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00020+H\u0002JD\u0010J\u001a\u00020\u001526\u0010K\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00150\bH\u0086\bø\u0001\u0000J/\u0010L\u001a\u00020\u00152!\u0010K\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(M\u0012\u0004\u0012\u00020\u00150\u000eH\u0081\bø\u0001\u0000J/\u0010N\u001a\u00020\u00152!\u0010K\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00150\u000eH\u0086\bø\u0001\u0000J/\u0010O\u001a\u00020\u00152!\u0010K\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00150\u000eH\u0086\bø\u0001\u0000J\u0018\u0010P\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010QJ\b\u0010R\u001a\u00020\u0005H\u0016J\b\u0010S\u001a\u00020\u0015H\u0002J\u0010\u0010T\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0010\u0010U\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0006\u0010V\u001a\u00020\u0013J\u0006\u0010W\u001a\u00020\u0013J\u0011\u0010X\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0005H\u0082\bJ\u0016\u0010Y\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010ZJ\u0017\u0010Y\u001a\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0086\nJ\u0017\u0010Y\u001a\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\\H\u0086\nJ\u001e\u0010Y\u001a\u00020\u00152\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000&H\u0086\n¢\u0006\u0002\u0010]J\u0017\u0010Y\u001a\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000^H\u0086\nJ\u0017\u0010Y\u001a\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000_H\u0086\nJ\u0011\u0010`\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0005H\u0082\bJ\u0006\u0010a\u001a\u00020\u0013J\u001d\u0010b\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010dH\u0086\nJ\u001d\u0010b\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0086\nJ*\u0010b\u001a\u00020\u00152\u001a\u0010e\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0&H\u0086\n¢\u0006\u0002\u0010gJ\u001d\u0010b\u001a\u00020\u00152\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010fH\u0086\nJ#\u0010b\u001a\u00020\u00152\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0^H\u0086\nJ\u001d\u0010b\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010iH\u0086\nJ#\u0010b\u001a\u00020\u00152\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0_H\u0086\nJ\u001d\u0010j\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0002\u0010kJ\u001a\u0010l\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010dJ\u001a\u0010l\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000J'\u0010l\u001a\u00020\u00152\u001a\u0010e\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0&¢\u0006\u0002\u0010gJ \u0010l\u001a\u00020\u00152\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0^J\u001a\u0010l\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010iJ \u0010l\u001a\u00020\u00152\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0_J\u0015\u0010m\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010QJ\u001b\u0010m\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0002\u0010nJ \u0010o\u001a\u00020\u00152\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\bJ\u0011\u0010p\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0005H\u0082\bJ\u0017\u0010q\u001a\u0004\u0018\u00018\u00012\u0006\u0010M\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010rJ\u0010\u0010s\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u0015\u0010t\u001a\u00020\u00152\u0006\u0010u\u001a\u00020\u0005H\u0000¢\u0006\u0002\bvJ\u001e\u0010w\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0086\n¢\u0006\u0002\u0010xJ\b\u0010y\u001a\u00020zH\u0016J\u000e\u0010{\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001dR+\u0010\r\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020&8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010(\u0012\u0004\b'\u0010 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010\u001dR\u0018\u0010*\u001a\u00020+8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b,\u0010 R\u000e\u0010-\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000Rj\u0010\u000f\u001a^\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b/\u0010\u001dR>\u0010\u0007\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020&8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010(\u0012\u0004\b2\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006|"}, d2 = {"Landroidx/collection/SieveCache;", "K", "", "V", "maxSize", "", "initialCapacity", "sizeOf", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "key", "value", "createValueFromKey", "Lkotlin/Function1;", "onEntryRemoved", "Lkotlin/Function4;", "oldValue", "newValue", "", "evicted", "", "(IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "_capacity", "_count", "_maxSize", "_size", "capacity", "getCapacity", "()I", "count", "getCount$annotations", "()V", "getCount", "growthLimit", "hand", "head", "keys", "", "getKeys$annotations", "[Ljava/lang/Object;", "getMaxSize", "metadata", "", "getMetadata$annotations", "nodes", "size", "getSize", "tail", "values", "getValues$annotations", "adjustStorage", "adjustStorage$collection", "all", "predicate", "any", "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "dropDeletes", "dropDeletes$collection", "equals", "other", "evictAll", "findEvictionCandidate", "findFirstAvailableSlot", "hash1", "findInsertIndex", "(Ljava/lang/Object;)I", "findKeyIndex", "fixupNodes", "mapping", "", "forEach", "block", "forEachIndexed", "index", "forEachKey", "forEachValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "initializeGrowth", "initializeMetadata", "initializeStorage", "isEmpty", "isNotEmpty", "markNodeVisited", "minusAssign", "(Ljava/lang/Object;)V", "Landroidx/collection/ObjectList;", "Landroidx/collection/ScatterSet;", "([Ljava/lang/Object;)V", "", "Lkotlin/sequences/Sequence;", "moveNodeToHead", "none", "plusAssign", "from", "Landroidx/collection/ScatterMap;", "pairs", "Lkotlin/Pair;", "([Lkotlin/Pair;)V", "pair", "", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeIf", "removeNode", "removeValueAt", "(I)Ljava/lang/Object;", "resize", "resizeStorage", "newCapacity", "resizeStorage$collection", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "toString", "", "trimToSize", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SieveCache<K, V> {
    private int _capacity;
    private int _count;
    private int _maxSize;
    private int _size;
    private final Function1<K, V> createValueFromKey;
    private int growthLimit;
    private int hand;
    private int head;
    public Object[] keys;
    public long[] metadata;
    private long[] nodes;
    private final Function4<K, V, V, Boolean, Unit> onEntryRemoved;
    private final Function2<K, V, Integer> sizeOf;
    private int tail;
    public Object[] values;

    public static /* synthetic */ void getCount$annotations() {
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SieveCache(int maxSize, int initialCapacity, Function2<? super K, ? super V, Integer> r6, Function1<? super K, ? extends V> r7, Function4<? super K, ? super V, ? super V, ? super Boolean, Unit> r8) {
        Intrinsics.checkNotNullParameter(r6, "sizeOf");
        Intrinsics.checkNotNullParameter(r7, "createValueFromKey");
        Intrinsics.checkNotNullParameter(r8, "onEntryRemoved");
        this.sizeOf = r6;
        this.createValueFromKey = r7;
        this.onEntryRemoved = r8;
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        this.nodes = SieveCacheKt.getEmptyNodes();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        this.hand = Integer.MAX_VALUE;
        if (maxSize <= 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        RuntimeHelpersKt.throwIllegalArgumentException("maxSize must be > 0");
    L9:
        this._maxSize = maxSize;
        initializeStorage(ScatterMapKt.unloadedCapacity(initialCapacity));
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public /* synthetic */ SieveCache(int r7, int r8, Function2 r9, Function1 r10, Function4 r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 2) == 0) goto L5;
        int r2 = 6;
    L7:
        if ((r12 & 4) == 0) goto L9;
        Function2 r3 = AnonymousClass1.INSTANCE;
    L11:
        if ((r12 & 8) == 0) goto L13;
        Function1 r4 = AnonymousClass2.INSTANCE;
    L15:
        if ((r12 & 16) == 0) goto L17;
        Function4 r5 = AnonymousClass3.INSTANCE;
    L18:
        this(r7, r2, r3, r4, r5);
        return;
    L17:
        r5 = r11;
        goto L18
    L13:
        r4 = r10;
        goto L15
    L9:
        r3 = r9;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    public final int getSize() {
        return this._size;
    }

    public final int getMaxSize() {
        return this._maxSize;
    }

    public final int getCount() {
        return this._count;
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final boolean any() {
        if (this._count == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean none() {
        if (this._count != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isEmpty() {
        if (this._count != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isNotEmpty() {
        if (this._count == 0) goto L5;
        return true;
    L5:
        return false;
    }

    private final void initializeStorage(int initialCapacity) {
        if (initialCapacity <= 0) goto L4;
        int newCapacity = Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity));
    L5:
        this._capacity = newCapacity;
        initializeMetadata(newCapacity);
        if (newCapacity != 0) goto L8;
        Object[] r1 = ContainerHelpersKt.EMPTY_OBJECTS;
    L9:
        this.keys = r1;
        if (newCapacity != 0) goto L12;
        Object[] r2 = ContainerHelpersKt.EMPTY_OBJECTS;
    L13:
        this.values = r2;
        if (newCapacity != 0) goto L16;
        long[] $this$initializeStorage_u24lambda_u241 = SieveCacheKt.getEmptyNodes();
    L17:
        this.nodes = $this$initializeStorage_u24lambda_u241;
        return;
    L16:
        $this$initializeStorage_u24lambda_u241 = new long[newCapacity];
        ArraysKt.fill$default($this$initializeStorage_u24lambda_u241, 4611686018427387903L, 0, 0, 6, null);
        goto L17
    L12:
        r2 = new Object[newCapacity];
        goto L13
    L8:
        r1 = new Object[newCapacity];
        goto L9
    L4:
        newCapacity = 0;
        goto L5
    }

    private final void initializeMetadata(int capacity) {
        if (capacity != 0) goto L4;
        long[] r0 = ScatterMapKt.EmptyGroup;
    L5:
        this.metadata = r0;
        initializeGrowth();
        return;
    L4:
        int size = ((((capacity + 1) + 7) + 7) & (-8)) >> 3;
        long[] $this$initializeMetadata_u24lambda_u242 = new long[size];
        ArraysKt.fill$default($this$initializeMetadata_u24lambda_u242, -9187201950435737472L, 0, 0, 6, null);
        int i$iv = capacity >> 3;
        int b$iv = (capacity & 7) << 3;
        $this$initializeMetadata_u24lambda_u242[i$iv] = ($this$initializeMetadata_u24lambda_u242[i$iv] & (~(255 << b$iv))) | (255 << b$iv);
        r0 = $this$initializeMetadata_u24lambda_u242;
        goto L5
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - getCount();
    }

    public final V get(K r10) {
        Intrinsics.checkNotNullParameter(r10, "key");
        int r0 = findKeyIndex(r10);
        if (r0 < 0) goto L6;
        this.nodes[r0] = (this.nodes[r0] & 4611686018427387903L) | SieveCacheKt.NodeVisitedBit;
        return (V) this.values[r0];
    L6:
        V r1 = this.createValueFromKey.invoke(r10);
        if (r1 != null) goto L10;
        return null;
    L10:
        put(r10, r1);
        return r1;
    }

    public final void set(K r2, V r3) {
        Intrinsics.checkNotNullParameter(r2, "key");
        Intrinsics.checkNotNullParameter(r3, "value");
        put(r2, r3);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final V put(K r21, V r22) {
        Intrinsics.checkNotNullParameter(r21, "key");
        Intrinsics.checkNotNullParameter(r22, "value");
        int r3 = findInsertIndex(r21);
        if (r3 >= 0) goto L5;
        r3 = ~r3;
    L5:
        V r4 = (V) this.values[r3];
        this.values[r3] = r22;
        this.keys[r3] = r21;
        this._size += this.sizeOf.invoke(r21, r22).intValue();
        if (r4 == null) goto L9;
        this._size -= ((Number) this.sizeOf.invoke(r21, r4)).intValue();
        this.onEntryRemoved.invoke(r21, r4, r22, false);
        trimToSize(this._maxSize);
        return r4;
    L9:
        trimToSize(this._maxSize);
        this.nodes[r3] = (((long) this.head) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (this.head == Integer.MAX_VALUE) goto L12;
        this.nodes[this.head] = (this.nodes[this.head] & SieveCacheKt.NodeMetaAndNextMask) | ((((long) r3) & SieveCacheKt.NodeLinkMask) << 31);
    L12:
        this.head = r3;
        if (this.tail != Integer.MAX_VALUE) goto L16;
        this.tail = r3;
    L16:
        return r4;
    }

    public final void putAll(Pair<? extends K, ? extends V>[] r7) {
        Intrinsics.checkNotNullParameter(r7, "pairs");
        int r0 = r7.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Pair<? extends K, ? extends V> r2 = r7[r1];
        put(r2.component1(), r2.component2());
        r1 = r1 + 1;
        goto L3
    }

    public final void putAll(Iterable<? extends Pair<? extends K, ? extends V>> r6) {
        Intrinsics.checkNotNullParameter(r6, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> r0 = r6.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Pair<? extends K, ? extends V> r1 = r0.next();
        put(r1.component1(), r1.component2());
        goto L4
    }

    public final void putAll(Sequence<? extends Pair<? extends K, ? extends V>> r6) {
        Intrinsics.checkNotNullParameter(r6, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> r0 = r6.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Pair<? extends K, ? extends V> r1 = r0.next();
        put(r1.component1(), r1.component2());
        goto L4
    }

    public final void putAll(Map<K, ? extends V> r10) {
        Intrinsics.checkNotNullParameter(r10, "from");
        Iterator<Map.Entry<K, ? extends V>> r2 = r10.entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        Map.Entry<K, ? extends V> r3 = r2.next();
        put(r3.getKey(), r3.getValue());
        goto L4
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ScatterMap<K, V> r24) {
        Intrinsics.checkNotNullParameter(r24, "from");
        ScatterMap<K, V> r0 = r24;
        int $i$f$forEach = 0;
        Object[] k$iv = r0.keys;
        Object[] v$iv = r0.values;
        long[] m$iv$iv = r0.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        ScatterMap<K, V> r15 = r0;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r1 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L16;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L15;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        put(key, value);
    L15:
        slot$iv$iv = slot$iv$iv >> r1;
        j$iv$iv = j$iv$iv + 1;
        r1 = r1;
        $i$f$forEach = $i$f$forEach;
        k$iv = k$iv;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        int $i$f$forEach2 = $i$f$forEach;
        Object[] k$iv2 = k$iv;
        if (bitCount$iv$iv != r1) goto L31;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        r0 = r15;
        $i$f$forEach = $i$f$forEach2;
        k$iv = k$iv2;
        goto L4
    L32:
        return;
    L31:
        return;
    L19:
        $i$f$forEach2 = $i$f$forEach;
        k$iv2 = k$iv;
        goto L20
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(SieveCache<K, V> r24) {
        Intrinsics.checkNotNullParameter(r24, "from");
        SieveCache<K, V> r0 = r24;
        int $i$f$forEach = 0;
        Object[] k$iv = r0.keys;
        Object[] v$iv = r0.values;
        long[] m$iv$iv = r0.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        SieveCache<K, V> r15 = r0;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r1 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L16;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L15;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object key = k$iv[index$iv$iv];
        Intrinsics.checkNotNull(key, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
        Object value = v$iv[index$iv$iv];
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
        put(key, value);
    L15:
        slot$iv$iv = slot$iv$iv >> r1;
        j$iv$iv = j$iv$iv + 1;
        r1 = r1;
        $i$f$forEach = $i$f$forEach;
        k$iv = k$iv;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        int $i$f$forEach2 = $i$f$forEach;
        Object[] k$iv2 = k$iv;
        if (bitCount$iv$iv != r1) goto L31;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        r0 = r15;
        $i$f$forEach = $i$f$forEach2;
        k$iv = k$iv2;
        goto L4
    L32:
        return;
    L31:
        return;
    L19:
        $i$f$forEach2 = $i$f$forEach;
        k$iv2 = k$iv;
        goto L20
    }

    public final void plusAssign(Pair<? extends K, ? extends V> r6) {
        Intrinsics.checkNotNullParameter(r6, "pair");
        put(r6.getFirst(), r6.getSecond());
    }

    public final void plusAssign(Pair<? extends K, ? extends V>[] r2) {
        Intrinsics.checkNotNullParameter(r2, "pairs");
        putAll(r2);
    }

    public final void plusAssign(Iterable<? extends Pair<? extends K, ? extends V>> r2) {
        Intrinsics.checkNotNullParameter(r2, "pairs");
        putAll(r2);
    }

    public final void plusAssign(Sequence<? extends Pair<? extends K, ? extends V>> r2) {
        Intrinsics.checkNotNullParameter(r2, "pairs");
        putAll(r2);
    }

    public final void plusAssign(Map<K, ? extends V> r2) {
        Intrinsics.checkNotNullParameter(r2, "from");
        putAll(r2);
    }

    public final void plusAssign(ScatterMap<K, V> r2) {
        Intrinsics.checkNotNullParameter(r2, "from");
        putAll(r2);
    }

    public final void plusAssign(SieveCache<K, V> r2) {
        Intrinsics.checkNotNullParameter(r2, "from");
        putAll(r2);
    }

    public final V remove(K r6) {
        Intrinsics.checkNotNullParameter(r6, "key");
        int index = findKeyIndex(r6);
        if (index < 0) goto L9;
        V r2 = removeValueAt(index);
        if (r2 != null) goto L7;
        return null;
    L7:
        this._size -= this.sizeOf.invoke(r6, r2).intValue();
        this.onEntryRemoved.invoke(r6, r2, null, false);
        return r2;
    L9:
        return null;
    }

    public final boolean remove(K r6, V r7) {
        Intrinsics.checkNotNullParameter(r6, "key");
        Intrinsics.checkNotNullParameter(r7, "value");
        int index = findKeyIndex(r6);
        if (index >= 0) goto L5;
    L11:
        return false;
    L5:
        if (Intrinsics.areEqual(this.values[index], r7) == false) goto L11;
        V r2 = removeValueAt(index);
        if (r2 != null) goto L9;
        return false;
    L9:
        this._size -= this.sizeOf.invoke(r6, r2).intValue();
        this.onEntryRemoved.invoke(r6, r2, null, false);
        return true;
    }

    public final void removeIf(Function2<? super K, ? super V, Boolean> r20) {
        Function2<? super K, ? super V, Boolean> r1 = r20;
        Intrinsics.checkNotNullParameter(r1, "predicate");
        SieveCache<K, V> r2 = this;
        long[] r4 = r2.metadata;
        int r5 = r4.length - 2;
        int r6 = 0;
        if (0 > r5) goto L30;
    L4:
        long r7 = r4[r6];
        if (((((~r7) << 7) & r7) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L25;
        int r10 = 8;
        int r9 = 8 - ((~(r6 - r5)) >>> 31);
        int r11 = 0;
    L7:
        if (r11 >= r9) goto L22;
        if ((255 & r7) >= 128) goto L11;
        boolean r15 = true;
    L12:
        if (r15 == false) goto L20;
        int r12 = (r6 << 3) + r11;
        Object r16 = this.keys[r12];
        int r17 = r10;
        Intrinsics.checkNotNull(r16, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
        Object r13 = this.values[r12];
        SieveCache<K, V> r18 = r2;
        Intrinsics.checkNotNull(r13, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
        if (r1.invoke(r16, r13).booleanValue() == false) goto L21;
        V r3 = this.removeValueAt(r12);
        if (r3 == null) goto L17;
        this._size -= this.sizeOf.invoke((K) r16, r3).intValue();
        this.onEntryRemoved.invoke((K) r16, r3, null, false);
        goto L21
    L17:
        return;
    L21:
        r7 = r7 >> r17;
        r11 = r11 + 1;
        SieveCache<K, V> this = this;
        r1 = r20;
        r10 = r17;
        r2 = r18;
        goto L7
    L20:
        r18 = r2;
        r17 = r10;
        goto L21
    L11:
        r15 = false;
        goto L12
    L22:
        SieveCache<K, V> r19 = r2;
        if (r9 != r10) goto L38;
    L26:
        if (r6 == r5) goto L39;
        r6 = r6 + 1;
        r1 = r20;
        r2 = r19;
        goto L4
    L39:
        return;
    L38:
        return;
    L25:
        r19 = r2;
        goto L26
    }

    public final void minusAssign(K r2) {
        Intrinsics.checkNotNullParameter(r2, "key");
        remove(r2);
    }

    public final void minusAssign(K[] r5) {
        Intrinsics.checkNotNullParameter(r5, "keys");
        int r1 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        remove(r5[r2]);
        r2 = r2 + 1;
        goto L3
    }

    public final void minusAssign(Iterable<? extends K> r4) {
        Intrinsics.checkNotNullParameter(r4, "keys");
        Iterator<? extends K> r1 = r4.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        remove(r1.next());
        goto L4
    }

    public final void minusAssign(Sequence<? extends K> r4) {
        Intrinsics.checkNotNullParameter(r4, "keys");
        Iterator<? extends K> r1 = r4.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        remove(r1.next());
        goto L4
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<K> r21) {
        Intrinsics.checkNotNullParameter(r21, "keys");
        int $i$f$minusAssign = 0;
        ScatterSet<K> r2 = r21;
        Object[] elements$iv = r2.elements;
        long[] m$iv$iv = r2.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int $i$f$minusAssign2 = $i$f$minusAssign;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r1 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L16;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L15;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object key = elements$iv[index$iv$iv];
        remove(key);
    L15:
        slot$iv$iv = slot$iv$iv >> r1;
        j$iv$iv = j$iv$iv + 1;
        r1 = r1;
        r2 = r2;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        ScatterSet<K> r19 = r2;
        if (bitCount$iv$iv != r1) goto L31;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        $i$f$minusAssign = $i$f$minusAssign2;
        r2 = r19;
        goto L4
    L32:
        return;
    L31:
        return;
    L19:
        r19 = r2;
        goto L20
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<K> r9) {
        Intrinsics.checkNotNullParameter(r9, "keys");
        Object[] content$iv = r9.content;
        int i$iv = 0;
        int r5 = r9._size;
    L3:
        if (i$iv >= r5) goto L6;
        Object key = content$iv[i$iv];
        remove(key);
        i$iv = i$iv + 1;
        goto L3
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final void resize(int maxSize) {
        this._maxSize = maxSize;
        trimToSize(maxSize);
    }

    public final void trimToSize(int r7) {
    L3:
        if (this._size <= r7) goto L14;
        if (getCount() == 0) goto L22;
        int r0 = findEvictionCandidate();
        if (r0 == Integer.MAX_VALUE) goto L9;
        Object r1 = this.keys[r0];
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
        V r2 = removeValueAt(r0);
        if (r2 == null) goto L3;
        this._size -= this.sizeOf.invoke((K) r1, r2).intValue();
        this.onEntryRemoved.invoke((K) r1, r2, null, true);
        goto L3
    L9:
        return;
    L22:
        return;
    }

    public final void forEach(Function2<? super K, ? super V, Unit> r21) {
        Intrinsics.checkNotNullParameter(r21, "block");
        int $i$f$forEach = 0;
        Object[] k = this.keys;
        Object[] v = this.values;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L24;
    L4:
        long slot$iv = m$iv[i$iv];
        int $i$f$forEach2 = $i$f$forEach;
        Object[] k2 = k;
        if (((((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r3 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L16;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r18 = true;
    L12:
        if (r18 == false) goto L15;
        int index$iv = (i$iv << 3) + j$iv;
        Object r4 = k2[index$iv];
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
        Object r0 = v[index$iv];
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
        r21.invoke(r4, r0);
    L15:
        slot$iv = slot$iv >> r3;
        j$iv = j$iv + 1;
        r3 = r3;
        v = v;
        goto L7
    L11:
        r18 = false;
        goto L12
    L16:
        Object[] v2 = v;
        if (bitCount$iv != r3) goto L30;
    L20:
        if (i$iv == lastIndex$iv) goto L31;
        i$iv = i$iv + 1;
        $i$f$forEach = $i$f$forEach2;
        k = k2;
        v = v2;
        goto L4
    L31:
        return;
    L30:
        return;
    L19:
        v2 = v;
        goto L20
    }

    public final void forEachKey(Function1<? super K, Unit> r20) {
        Intrinsics.checkNotNullParameter(r20, "block");
        int $i$f$forEachKey = 0;
        Object[] k = this.keys;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L24;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L19;
        int r12 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L16;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L15;
        int index$iv = (i$iv << 3) + j$iv;
        Object r13 = k[index$iv];
        Intrinsics.checkNotNull(r13, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
        r20.invoke(r13);
    L15:
        slot$iv = slot$iv >> r12;
        j$iv = j$iv + 1;
        r12 = r12;
        $i$f$forEachKey = $i$f$forEachKey;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        int $i$f$forEachKey2 = $i$f$forEachKey;
        if (bitCount$iv != r12) goto L30;
    L20:
        if (i$iv == lastIndex$iv) goto L31;
        i$iv = i$iv + 1;
        $i$f$forEachKey = $i$f$forEachKey2;
        goto L4
    L31:
        return;
    L30:
        return;
    L19:
        $i$f$forEachKey2 = $i$f$forEachKey;
        goto L20
    }

    public final void forEachValue(Function1<? super V, Unit> r20) {
        Intrinsics.checkNotNullParameter(r20, "block");
        int $i$f$forEachValue = 0;
        Object[] v = this.values;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L24;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L19;
        int r12 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L16;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L15;
        int index$iv = (i$iv << 3) + j$iv;
        Object r13 = v[index$iv];
        Intrinsics.checkNotNull(r13, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
        r20.invoke(r13);
    L15:
        slot$iv = slot$iv >> r12;
        j$iv = j$iv + 1;
        r12 = r12;
        $i$f$forEachValue = $i$f$forEachValue;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        int $i$f$forEachValue2 = $i$f$forEachValue;
        if (bitCount$iv != r12) goto L30;
    L20:
        if (i$iv == lastIndex$iv) goto L31;
        i$iv = i$iv + 1;
        $i$f$forEachValue = $i$f$forEachValue2;
        goto L4
    L31:
        return;
    L30:
        return;
    L19:
        $i$f$forEachValue2 = $i$f$forEachValue;
        goto L20
    }

    public final boolean all(Function2<? super K, ? super V, Boolean> r26) {
        Intrinsics.checkNotNullParameter(r26, "predicate");
        int $i$f$all = 0;
        SieveCache<K, V> r2 = this;
        Object[] k$iv = r2.keys;
        Object[] v$iv = r2.values;
        long[] m$iv$iv = r2.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L28;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long slot$iv$iv2 = slot$iv$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L19;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r14 = true;
    L12:
        if (r14 == false) goto L18;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object key = k$iv[index$iv$iv];
        Intrinsics.checkNotNull(key, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
        Object value = v$iv[index$iv$iv];
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
        if (r26.invoke(key, value).booleanValue() == true) goto L18;
        return false;
    L18:
        slot$iv$iv2 = slot$iv$iv2 >> r12;
        j$iv$iv = j$iv$iv + 1;
        r12 = r12;
        $i$f$all = $i$f$all;
        r2 = r2;
        goto L7
    L11:
        r14 = false;
        goto L12
    L19:
        int $i$f$all2 = $i$f$all;
        SieveCache<K, V> r23 = r2;
        if (bitCount$iv$iv != r12) goto L35;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L36;
        i$iv$iv = i$iv$iv + 1;
        $i$f$all = $i$f$all2;
        r2 = r23;
        goto L4
    L36:
        return true;
    L35:
        return true;
    L22:
        $i$f$all2 = $i$f$all;
        r23 = r2;
        goto L23
    L28:
        return true;
    }

    public final boolean any(Function2<? super K, ? super V, Boolean> r26) {
        Intrinsics.checkNotNullParameter(r26, "predicate");
        int $i$f$any = 0;
        SieveCache<K, V> r2 = this;
        Object[] k$iv = r2.keys;
        Object[] v$iv = r2.values;
        long[] m$iv$iv = r2.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L28;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long slot$iv$iv2 = slot$iv$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L19;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r14 = true;
    L12:
        if (r14 == false) goto L18;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object key = k$iv[index$iv$iv];
        Intrinsics.checkNotNull(key, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
        Object value = v$iv[index$iv$iv];
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
        if (r26.invoke(key, value).booleanValue() == false) goto L18;
        return true;
    L18:
        slot$iv$iv2 = slot$iv$iv2 >> r12;
        j$iv$iv = j$iv$iv + 1;
        r12 = r12;
        $i$f$any = $i$f$any;
        r2 = r2;
        goto L7
    L11:
        r14 = false;
        goto L12
    L19:
        int $i$f$any2 = $i$f$any;
        SieveCache<K, V> r23 = r2;
        if (bitCount$iv$iv != r12) goto L35;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L36;
        i$iv$iv = i$iv$iv + 1;
        $i$f$any = $i$f$any2;
        r2 = r23;
        goto L4
    L36:
        return false;
    L35:
        return false;
    L22:
        $i$f$any2 = $i$f$any;
        r23 = r2;
        goto L23
    L28:
        return false;
    }

    public final int count() {
        return getSize();
    }

    public final int count(Function2<? super K, ? super V, Boolean> r25) {
        Intrinsics.checkNotNullParameter(r25, "predicate");
        int $i$f$count = 0;
        int count = 0;
        SieveCache<K, V> r3 = this;
        Object[] k$iv = r3.keys;
        Object[] v$iv = r3.values;
        long[] m$iv$iv = r3.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L28;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int $i$f$count2 = $i$f$count;
        int count2 = count;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L19;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r20 = true;
    L12:
        if (r20 == false) goto L17;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r21 = r2;
        Object key = k$iv[index$iv$iv];
        SieveCache<K, V> r22 = r3;
        Intrinsics.checkNotNull(key, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
        Object value = v$iv[index$iv$iv];
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
        if (r25.invoke(key, value).booleanValue() == false) goto L18;
        count2 = count2 + 1;
    L18:
        slot$iv$iv = slot$iv$iv >> r21;
        j$iv$iv = j$iv$iv + 1;
        r2 = r21;
        r3 = r22;
        goto L7
    L17:
        r21 = r2;
        r22 = r3;
        goto L18
    L11:
        r20 = false;
        goto L12
    L19:
        SieveCache<K, V> r23 = r3;
        if (bitCount$iv$iv != r2) goto L35;
        count = count2;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L28;
        i$iv$iv = i$iv$iv + 1;
        $i$f$count = $i$f$count2;
        r3 = r23;
        goto L4
    L35:
        return count2;
    L22:
        r23 = r3;
        count = count2;
    L28:
        return count;
    }

    public final boolean contains(K r2) {
        Intrinsics.checkNotNullParameter(r2, "key");
        if (findKeyIndex(r2) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean containsKey(K r2) {
        Intrinsics.checkNotNullParameter(r2, "key");
        if (findKeyIndex(r2) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean containsValue(V r21) {
        Intrinsics.checkNotNullParameter(r21, "value");
        Object[] v = this.values;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L25;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L22;
        int r12 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L19;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r14 = true;
    L12:
        if (r14 == false) goto L18;
        int index$iv = (i$iv << 3) + j$iv;
        Object r8 = v[index$iv];
        Intrinsics.checkNotNull(r8, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
        if (Intrinsics.areEqual(r21, r8) == false) goto L18;
        return true;
    L18:
        slot$iv = slot$iv >> r12;
        j$iv = j$iv + 1;
        r12 = r12;
        goto L7
    L11:
        r14 = false;
        goto L12
    L19:
        boolean r17 = false;
        if (bitCount$iv != r12) goto L34;
    L23:
        if (i$iv == lastIndex$iv) goto L35;
        i$iv = i$iv + 1;
        goto L4
    L35:
        return r17;
    L34:
        return false;
    L22:
        r17 = false;
        goto L23
    L25:
        return false;
    }

    private final int findEvictionCandidate() {
        long[] nodes = this.nodes;
        int r2 = Integer.MAX_VALUE;
        if (this.hand == Integer.MAX_VALUE) goto L5;
        int candidate = this.hand;
    L7:
        if (candidate == Integer.MAX_VALUE) goto L15;
        long $this$visited$iv = nodes[candidate];
        if (((int) (($this$visited$iv >> 62) & 1)) == 0) goto L15;
        long node = nodes[candidate];
        int previousIndex = (int) (SieveCacheKt.NodeLinkMask & (node >> 31));
        nodes[candidate] = node & 4611686018427387903L;
        if (previousIndex == Integer.MAX_VALUE) goto L13;
        int r4 = previousIndex;
    L14:
        candidate = r4;
        goto L7
    L13:
        r4 = this.tail;
    L15:
        long $this$previousNode$iv = nodes[candidate];
        int previousIndex2 = (int) (SieveCacheKt.NodeLinkMask & ($this$previousNode$iv >> 31));
        if (previousIndex2 == Integer.MAX_VALUE) goto L18;
        r2 = previousIndex2;
    L18:
        this.hand = r2;
        return candidate;
    L5:
        candidate = this.tail;
        goto L7
    }

    private final void moveNodeToHead(int index) {
        long[] r1 = this.nodes;
        int next$iv = this.head;
        r1[index] = (((long) next$iv) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (this.head == Integer.MAX_VALUE) goto L5;
        long[] r2 = this.nodes;
        int r3 = this.head;
        long node$iv = this.nodes[this.head];
        r2[r3] = (SieveCacheKt.NodeMetaAndNextMask & node$iv) | ((((long) index) & SieveCacheKt.NodeLinkMask) << 31);
    L5:
        this.head = index;
        if (this.tail != Integer.MAX_VALUE) goto L9;
        this.tail = index;
        return;
    }

    private final V removeValueAt(int r22) {
        this._count--;
        long[] r2 = this.metadata;
        int r3 = this._capacity;
        int r8 = r22 >> 3;
        int r9 = (r22 & 7) << 3;
        r2[r8] = (r2[r8] & (~(255 << r9))) | (254 << r9);
        r2[(((r22 - 7) & r3) + (r3 & 7)) >> 3] = r2[r22 >> 3];
        this.keys[r22] = null;
        V r4 = (V) this.values[r22];
        this.values[r22] = null;
        long[] r5 = this.nodes;
        long r6 = r5[r22];
        int r10 = (int) ((r6 >> 31) & SieveCacheKt.NodeLinkMask);
        int r11 = (int) (r6 & SieveCacheKt.NodeLinkMask);
        if (r10 == Integer.MAX_VALUE) goto L5;
        long r19 = 2147483647L;
        r5[r10] = (r5[r10] & SieveCacheKt.NodeMetaAndPreviousMask) | (((long) r11) & SieveCacheKt.NodeLinkMask);
    L6:
        if (r11 == Integer.MAX_VALUE) goto L8;
        long[] r17 = r5;
        r17[r11] = ((((long) r10) & r19) << 31) | (SieveCacheKt.NodeMetaAndNextMask & r5[r11]);
    L10:
        if (this.hand != r22) goto L12;
        this.hand = r10;
    L12:
        r17[r22] = 4611686018427387903L;
        return r4;
    L8:
        r17 = r5;
        this.tail = r10;
        goto L10
    L5:
        r19 = 2147483647L;
        this.head = r11;
        goto L6
    }

    private final void removeNode(int index) {
        long[] nodes = this.nodes;
        long node = nodes[index];
        int previousIndex = (int) ((node >> 31) & SieveCacheKt.NodeLinkMask);
        int nextIndex = (int) (node & SieveCacheKt.NodeLinkMask);
        if (previousIndex == Integer.MAX_VALUE) goto L5;
        long node$iv = nodes[previousIndex];
        long r15 = SieveCacheKt.NodeMetaAndPreviousMask & node$iv;
        nodes[previousIndex] = (((long) nextIndex) & SieveCacheKt.NodeLinkMask) | r15;
    L6:
        if (nextIndex == Integer.MAX_VALUE) goto L8;
        long node$iv2 = nodes[nextIndex];
        long node$iv3 = (SieveCacheKt.NodeMetaAndNextMask & node$iv2) | ((((long) previousIndex) & SieveCacheKt.NodeLinkMask) << 31);
        nodes[nextIndex] = node$iv3;
    L10:
        if (this.hand != index) goto L12;
        this.hand = previousIndex;
    L12:
        nodes[index] = 4611686018427387903L;
        return;
    L8:
        this.tail = previousIndex;
        goto L10
    L5:
        this.head = nextIndex;
        goto L6
    }

    private final void markNodeVisited(int index) {
        this.nodes[index] = (this.nodes[index] & 4611686018427387903L) | SieveCacheKt.NodeVisitedBit;
    }

    private final int findKeyIndex(K r23) {
        if (r23 == null) goto L5;
        int r4 = r23.hashCode();
    L6:
        int hash$iv = r4 * ScatterMapKt.MurmurHashC1;
        int hash = hash$iv ^ (hash$iv << 16);
        int hash2 = hash & WorkQueueKt.MASK;
        int probeMask = this._capacity;
        int $i$f$h1 = hash >>> 7;
        int probeOffset = $i$f$h1 & probeMask;
        int probeIndex = 0;
    L7:
        long[] metadata$iv = this.metadata;
        int i$iv = probeOffset >> 3;
        int b$iv = (probeOffset & 7) << 3;
        int hash3 = hash2;
        long g = (((-b$iv) >> 63) & (metadata$iv[i$iv + 1] << (64 - b$iv))) | (metadata$iv[i$iv] >>> b$iv);
        long x$iv = (((long) hash3) * ScatterMapKt.BitmaskLsb) ^ g;
        int hash4 = hash;
        long m = ((~x$iv) & (x$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L8:
        long $this$hasNext$iv = m;
        if ($this$hasNext$iv == 0) goto L11;
        boolean r10 = true;
    L12:
        if (r10 == false) goto L17;
        long $this$get$iv = m;
        int $i$f$lowestBitSet = Long.numberOfTrailingZeros($this$get$iv) >> 3;
        int index = ($i$f$lowestBitSet + probeOffset) & probeMask;
        if (Intrinsics.areEqual(this.keys[index], r23) == true) goto L15;
        long $this$next$iv = m;
        m = $this$next$iv & ($this$next$iv - 1);
        goto L8
    L15:
        return index;
    L17:
        long $this$maskEmpty$iv = (((~g) << 6) & g) & (-9187201950435737472L);
        if ($this$maskEmpty$iv != 0) goto L19;
        probeIndex = probeIndex + 8;
        probeOffset = (probeOffset + probeIndex) & probeMask;
        hash2 = hash3;
        hash = hash4;
        goto L7
    L19:
        return -1;
    L11:
        r10 = false;
        goto L12
    L5:
        r4 = 0;
        goto L6
    }

    private final int findInsertIndex(K r25) {
        if (r25 == null) goto L5;
        int r4 = r25.hashCode();
    L6:
        int hash$iv = r4 * ScatterMapKt.MurmurHashC1;
        int hash = hash$iv ^ (hash$iv << 16);
        int hash1 = hash >>> 7;
        int $i$f$h2 = hash & WorkQueueKt.MASK;
        int probeMask = this._capacity;
        int probeOffset = hash1 & probeMask;
        int probeIndex = 0;
    L7:
        long[] metadata$iv = this.metadata;
        int i$iv = probeOffset >> 3;
        int b$iv = (probeOffset & 7) << 3;
        int hash2 = hash1;
        long g = (((-b$iv) >> 63) & (metadata$iv[i$iv + 1] << (64 - b$iv))) | (metadata$iv[i$iv] >>> b$iv);
        long x$iv = (((long) $i$f$h2) * ScatterMapKt.BitmaskLsb) ^ g;
        int hash3 = hash;
        long m = ((~x$iv) & (x$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L8:
        long $this$hasNext$iv = m;
        if ($this$hasNext$iv == 0) goto L11;
        int $i$f$hasNext = 1;
    L12:
        if ($i$f$hasNext == 0) goto L17;
        long $this$get$iv = m;
        int index = ((Long.numberOfTrailingZeros($this$get$iv) >> 3) + probeOffset) & probeMask;
        if (Intrinsics.areEqual(this.keys[index], r25) == true) goto L15;
        long $this$next$iv = m;
        m = $this$next$iv & ($this$next$iv - 1);
        goto L8
    L15:
        return index;
    L17:
        long $this$maskEmpty$iv = (((~g) << 6) & g) & (-9187201950435737472L);
        if ($this$maskEmpty$iv != 0) goto L19;
        hash1 = hash2;
        probeIndex = probeIndex + 8;
        probeOffset = (probeOffset + probeIndex) & probeMask;
        hash = hash3;
        goto L7
    L19:
        int index2 = findFirstAvailableSlot(hash2);
        if (this.growthLimit == 0) goto L22;
    L27:
        this._count++;
        int r3 = this.growthLimit;
        if (((this.metadata[index2 >> 3] >> ((index2 & 7) << 3)) & 255) != 128) goto L30;
        int r17 = 1;
    L31:
        this.growthLimit = r3 - r17;
        long[] data$iv = this.metadata;
        int capacity$iv = this._capacity;
        long value$iv = $i$f$h2;
        int i$iv$iv = index2 >> 3;
        int b$iv$iv = (index2 & 7) << 3;
        data$iv[i$iv$iv] = (data$iv[i$iv$iv] & (~(255 << b$iv$iv))) | (value$iv << b$iv$iv);
        int cloneIndex$iv = ((index2 - 7) & capacity$iv) + (capacity$iv & 7);
        data$iv[cloneIndex$iv >> 3] = data$iv[index2 >> 3];
        return ~index2;
    L30:
        r17 = 0;
        goto L31
    L22:
        if (((this.metadata[index2 >> 3] >> ((index2 & 7) << 3)) & 255) != 254) goto L24;
        boolean r5 = true;
    L25:
        if (r5 == true) goto L27;
        adjustStorage$collection();
        index2 = findFirstAvailableSlot(hash2);
        goto L27
    L24:
        r5 = false;
        goto L25
    L11:
        $i$f$hasNext = 0;
        goto L12
    L5:
        r4 = 0;
        goto L6
    }

    private final int findFirstAvailableSlot(int hash1) {
        int probeMask = this._capacity;
        int probeOffset = hash1 & probeMask;
        int probeIndex = 0;
    L3:
        long[] metadata$iv = this.metadata;
        int i$iv = probeOffset >> 3;
        int b$iv = (probeOffset & 7) << 3;
        long g = (metadata$iv[i$iv] >>> b$iv) | ((metadata$iv[i$iv + 1] << (64 - b$iv)) & ((-b$iv) >> 63));
        long $this$maskEmptyOrDeleted$iv = (((~g) << 7) & g) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv != 0) goto L6;
        probeIndex = probeIndex + 8;
        probeOffset = (probeOffset + probeIndex) & probeMask;
        goto L3
    L6:
        return ((Long.numberOfTrailingZeros($this$maskEmptyOrDeleted$iv) >> 3) + probeOffset) & probeMask;
    }

    public final void adjustStorage$collection() {
        if (this._capacity > 8) goto L5;
    L7:
        resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        return;
    L5:
        if (Long.compareUnsigned(ULong.m7599constructorimpl(ULong.m7599constructorimpl(getCount()) * 32), ULong.m7599constructorimpl(ULong.m7599constructorimpl(this._capacity) * 25)) > 0) goto L7;
        dropDeletes$collection();
    }

    public final void dropDeletes$collection() {
        long[] metadata = this.metadata;
        if (metadata != null) goto L5;
        return;
    L5:
        int capacity = this._capacity;
        Object[] keys = this.keys;
        Object[] values = this.values;
        long[] nodes = this.nodes;
        long[] indexMapping = new long[capacity];
        long r7 = 9223372034707292159L;
        int targetIndex = 0;
        ArraysKt.fill(indexMapping, 9223372034707292159L, 0, capacity);
        int end$iv = (capacity + 7) >> 3;
        int i$iv = 0;
    L6:
        if (i$iv >= end$iv) goto L8;
        long maskedGroup$iv = metadata[i$iv] & (-9187201950435737472L);
        metadata[i$iv] = ((~maskedGroup$iv) + (maskedGroup$iv >>> 7)) & (-72340172838076674L);
        i$iv = i$iv + 1;
        r7 = r7;
        goto L6
    L8:
        long r15 = r7;
        int lastIndex$iv = ArraysKt.getLastIndex(metadata);
        metadata[lastIndex$iv - 1] = (metadata[lastIndex$iv - 1] & 72057594037927935L) | (-72057594037927936L);
        metadata[lastIndex$iv] = metadata[0];
        int index = 0;
    L9:
        if (index == capacity) goto L39;
        long m = (metadata[index >> 3] >> ((index & 7) << 3)) & 255;
        if (m == 128) goto L12;
        if (m != 254) goto L15;
        Object k$iv = keys[index];
        if (k$iv == null) goto L19;
        int r19 = k$iv.hashCode();
    L20:
        int hash$iv = r19 * ScatterMapKt.MurmurHashC1;
        int hash = hash$iv ^ (hash$iv << 16);
        int $i$f$h1 = hash >>> 7;
        int r110 = targetIndex;
        int targetIndex2 = findFirstAvailableSlot($i$f$h1);
        int probeOffset = $i$f$h1 & capacity;
        int newProbeIndex = ((targetIndex2 - probeOffset) & capacity) / 8;
        int oldProbeIndex = ((index - probeOffset) & capacity) / 8;
        if (newProbeIndex == oldProbeIndex) goto L22;
        Object[] keys2 = keys;
        long r24 = r15;
        int capacity2 = capacity;
        if (((metadata[targetIndex2 >> 3] >> ((targetIndex2 & 7) << 3)) & 255) != 128) goto L33;
        int $i$f$h2 = hash & WorkQueueKt.MASK;
        long value$iv = $i$f$h2;
        int i$iv2 = targetIndex2 >> 3;
        int b$iv = (targetIndex2 & 7) << 3;
        metadata[i$iv2] = (metadata[i$iv2] & (~(255 << b$iv))) | (value$iv << b$iv);
        int i$iv3 = index >> 3;
        int b$iv2 = (index & 7) << 3;
        long value$iv2 = 255 << b$iv2;
        metadata[i$iv3] = (metadata[i$iv3] & (~value$iv2)) | (128 << b$iv2);
        keys2[targetIndex2] = keys2[index];
        keys2[index] = null;
        values[targetIndex2] = values[index];
        values[index] = null;
        nodes[targetIndex2] = nodes[index];
        nodes[index] = 4611686018427387903L;
        long mapping = indexMapping[index];
        int src = (int) ((mapping >> 32) & 4294967295L);
        if (src == Integer.MAX_VALUE) goto L31;
        long mapping$iv = indexMapping[src];
        indexMapping[src] = (mapping$iv & (-4294967296L)) | ((long) targetIndex2);
        long mapping$iv2 = indexMapping[index];
        indexMapping[index] = (mapping$iv2 & 4294967295L) | (-4294967296L);
    L32:
        Object[] values2 = values;
        indexMapping[targetIndex2] = (((long) index) << 32) | ((long) Integer.MAX_VALUE);
    L38:
        metadata[metadata.length - 1] = metadata[r110];
        index = index + 1;
        capacity = capacity2;
        targetIndex = r110;
        r15 = r24;
        keys = keys2;
        values = values2;
        goto L9
    L31:
        indexMapping[index] = targetIndex2 | (((long) Integer.MAX_VALUE) << 32);
        goto L32
    L33:
        values2 = values;
        int $i$f$h3 = hash & WorkQueueKt.MASK;
        long value$iv3 = $i$f$h3;
        int i$iv4 = targetIndex2 >> 3;
        int b$iv3 = (targetIndex2 & 7) << 3;
        metadata[i$iv4] = (metadata[i$iv4] & (~(255 << b$iv3))) | (value$iv3 << b$iv3);
        Object oldKey = keys2[targetIndex2];
        keys2[targetIndex2] = keys2[index];
        keys2[index] = oldKey;
        Object oldValue = values2[targetIndex2];
        values2[targetIndex2] = values2[index];
        values2[index] = oldValue;
        long oldNode = nodes[targetIndex2];
        nodes[targetIndex2] = nodes[index];
        nodes[index] = oldNode;
        long mapping2 = indexMapping[index];
        int src2 = (int) ((mapping2 >> 32) & 4294967295L);
        if (src2 == Integer.MAX_VALUE) goto L36;
        long mapping$iv3 = indexMapping[src2];
        indexMapping[src2] = (mapping$iv3 & (-4294967296L)) | ((long) targetIndex2);
        long mapping$iv4 = indexMapping[index];
        long mapping$iv5 = targetIndex2;
        indexMapping[index] = (mapping$iv5 << 32) | (mapping$iv4 & 4294967295L);
        int src3 = src2;
    L37:
        indexMapping[targetIndex2] = (((long) src3) << 32) | ((long) index);
        index = index - 1;
        goto L38
    L36:
        indexMapping[index] = (((long) targetIndex2) << 32) | ((long) targetIndex2);
        src3 = index;
        goto L37
    L22:
        int $i$f$h4 = hash & WorkQueueKt.MASK;
        Object[] keys3 = keys;
        long r25 = r15;
        int capacity3 = capacity;
        long value$iv4 = $i$f$h4;
        int i$iv5 = index >> 3;
        int b$iv4 = (index & 7) << 3;
        long value$iv5 = 255 << b$iv4;
        metadata[i$iv5] = (metadata[i$iv5] & (~value$iv5)) | (value$iv4 << b$iv4);
        if (indexMapping[index] != r25) goto L25;
        indexMapping[index] = (((long) index) << 32) | ((long) index);
    L25:
        metadata[metadata.length - 1] = metadata[r110];
        index = index + 1;
        capacity = capacity3;
        targetIndex = r110;
        r15 = r25;
        keys = keys3;
        goto L9
    L19:
        r19 = targetIndex;
        goto L20
    L15:
        index = index + 1;
        goto L9
    L12:
        index = index + 1;
        goto L9
    L39:
        initializeGrowth();
        fixupNodes(indexMapping);
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] previousMetadata = this.metadata;
        Object[] previousKeys = this.keys;
        Object[] previousValues = this.values;
        long[] previousNodes = this.nodes;
        int previousCapacity = this._capacity;
        int[] indexMapping = new int[previousCapacity];
        initializeStorage(newCapacity);
        long[] newMetadata = this.metadata;
        Object[] newKeys = this.keys;
        Object[] newValues = this.values;
        long[] newNodes = this.nodes;
        int capacity = this._capacity;
        int i = 0;
    L3:
        if (i >= previousCapacity) goto L15;
        int r15 = 0;
        if (((previousMetadata[i >> 3] >> ((i & 7) << 3)) & 255) >= 128) goto L7;
        boolean r14 = true;
    L8:
        if (r14 == false) goto L14;
        Object previousKey = previousKeys[i];
        if (previousKey == null) goto L12;
        r15 = previousKey.hashCode();
    L12:
        int hash$iv = r15 * ScatterMapKt.MurmurHashC1;
        int $i$f$hash = hash$iv ^ (hash$iv << 16);
        int $i$f$h1 = $i$f$hash >>> 7;
        int index = findFirstAvailableSlot($i$f$h1);
        long value$iv = $i$f$hash & WorkQueueKt.MASK;
        int i$iv$iv = index >> 3;
        int b$iv$iv = (index & 7) << 3;
        long value$iv2 = 255 << b$iv$iv;
        newMetadata[i$iv$iv] = (newMetadata[i$iv$iv] & (~value$iv2)) | (value$iv << b$iv$iv);
        int cloneIndex$iv = ((index - 7) & capacity) + (capacity & 7);
        newMetadata[cloneIndex$iv >> 3] = newMetadata[index >> 3];
        newKeys[index] = previousKey;
        newValues[index] = previousValues[i];
        newNodes[index] = previousNodes[i];
        indexMapping[i] = index;
    L14:
        i = i + 1;
        previousKeys = previousKeys;
        previousMetadata = previousMetadata;
        goto L3
    L7:
        r14 = false;
        goto L8
    L15:
        fixupNodes(indexMapping);
    }

    private final void fixupNodes(long[] mapping) {
        long[] nodes = this.nodes;
        int i = 0;
        int r3 = nodes.length;
    L3:
        int $i$f$getDst = Integer.MAX_VALUE;
        if (i >= r3) goto L14;
        long node = nodes[i];
        int previous = (int) ((node >> 31) & SieveCacheKt.NodeLinkMask);
        int next = (int) (node & SieveCacheKt.NodeLinkMask);
        long r13 = SieveCacheKt.NodeMetaMask & node;
        if (previous != Integer.MAX_VALUE) goto L8;
        int r4 = Integer.MAX_VALUE;
        long r18 = 4294967295L;
    L9:
        long r5 = (((long) r4) | r13) << 31;
        if (next == Integer.MAX_VALUE) goto L13;
        long $this$dst$iv$iv = mapping[next];
        $i$f$getDst = (int) ($this$dst$iv$iv & r18);
    L13:
        long $this$dst$iv$iv2 = $i$f$getDst;
        nodes[i] = r5 | $this$dst$iv$iv2;
        i = i + 1;
        goto L3
    L8:
        long $this$dst$iv$iv3 = mapping[previous];
        r18 = 4294967295L;
        r4 = (int) ($this$dst$iv$iv3 & 4294967295L);
        goto L9
    L14:
        int i2 = this.head;
        if (i2 == Integer.MAX_VALUE) goto L18;
        long $this$dst$iv = mapping[this.head];
        this.head = (int) ($this$dst$iv & 4294967295L);
    L18:
        if (this.tail == Integer.MAX_VALUE) goto L21;
        long $this$dst$iv2 = mapping[this.tail];
        this.tail = (int) ($this$dst$iv2 & 4294967295L);
    L21:
        if (this.hand == Integer.MAX_VALUE) goto L27;
        long $this$dst$iv3 = mapping[this.hand];
        this.hand = (int) ($this$dst$iv3 & 4294967295L);
        return;
    }

    private final void fixupNodes(int[] mapping) {
        long[] nodes = this.nodes;
        int i = 0;
        int r2 = nodes.length;
    L3:
        int r3 = Integer.MAX_VALUE;
        if (i >= r2) goto L14;
        long node = nodes[i];
        int previous = (int) ((node >> 31) & SieveCacheKt.NodeLinkMask);
        int next = (int) (node & SieveCacheKt.NodeLinkMask);
        long r10 = SieveCacheKt.NodeMetaMask & node;
        if (previous != Integer.MAX_VALUE) goto L8;
        int r12 = Integer.MAX_VALUE;
    L9:
        long r9 = (r10 | ((long) r12)) << 31;
        if (next == Integer.MAX_VALUE) goto L13;
        r3 = mapping[next];
    L13:
        nodes[i] = r9 | ((long) r3);
        i = i + 1;
        goto L3
    L8:
        r12 = mapping[previous];
        goto L9
    L14:
        int i2 = this.head;
        if (i2 == Integer.MAX_VALUE) goto L18;
        this.head = mapping[this.head];
    L18:
        if (this.tail == Integer.MAX_VALUE) goto L21;
        this.tail = mapping[this.tail];
    L21:
        if (this.hand == Integer.MAX_VALUE) goto L27;
        this.hand = mapping[this.hand];
        return;
    }

    public final void forEachIndexed(Function1<? super Integer, Unit> r15) {
        Intrinsics.checkNotNullParameter(r15, "block");
        long[] m = this.metadata;
        int lastIndex = m.length - 2;
        int i = 0;
        if (0 > lastIndex) goto L19;
    L4:
        long slot = m[i];
        long $this$maskEmptyOrDeleted$iv = (((~slot) << 7) & slot) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv == (-9187201950435737472L)) goto L17;
        int bitCount = 8 - ((~(i - lastIndex)) >>> 31);
        int j = 0;
    L7:
        if (j >= bitCount) goto L15;
        long value$iv = 255 & slot;
        if (value$iv >= 128) goto L11;
        boolean r12 = true;
    L12:
        if (r12 == false) goto L14;
        int index = (i << 3) + j;
        r15.invoke(Integer.valueOf(index));
    L14:
        slot = slot >> 8;
        j = j + 1;
        goto L7
    L11:
        r12 = false;
        goto L12
    L15:
        if (bitCount == 8) goto L17;
        return;
    L17:
        if (i == lastIndex) goto L25;
        i = i + 1;
        goto L4
    L25:
        return;
    }

    public int hashCode() {
        int bitCount$iv$iv = 0;
        SieveCache<K, V> r1 = this;
        int $i$f$forEach = 0;
        Object[] k$iv = r1.keys;
        Object[] v$iv = r1.values;
        long[] m$iv$iv = r1.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int hash = bitCount$iv$iv;
        SieveCache<K, V> r15 = r1;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r2 = 8;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv2) goto L16;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r18 = true;
    L12:
        if (r18 == false) goto L15;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object key = k$iv[index$iv$iv];
        Intrinsics.checkNotNull(key, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
        Object value = v$iv[index$iv$iv];
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
        hash = hash + (key.hashCode() ^ value.hashCode());
    L15:
        slot$iv$iv = slot$iv$iv >> r2;
        j$iv$iv = j$iv$iv + 1;
        r2 = r2;
        $i$f$forEach = $i$f$forEach;
        goto L7
    L11:
        r18 = false;
        goto L12
    L16:
        int $i$f$forEach2 = $i$f$forEach;
        if (bitCount$iv$iv2 != r2) goto L31;
        bitCount$iv$iv = hash;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L25;
        i$iv$iv = i$iv$iv + 1;
        r1 = r15;
        $i$f$forEach = $i$f$forEach2;
        goto L4
    L31:
        return hash;
    L19:
        $i$f$forEach2 = $i$f$forEach;
        bitCount$iv$iv = hash;
    L25:
        return bitCount$iv$iv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.collection.SieveCache] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public boolean equals(Object r26) {
        boolean r2 = true;
        if (r26 != this) goto L5;
        return true;
    L5:
        boolean r4 = false;
        if ((r26 instanceof SieveCache) == true) goto L9;
        return false;
    L9:
        if (((SieveCache) r26).getSize() != getSize()) goto L41;
        if (((SieveCache) r26)._count != this._count) goto L50;
        SieveCache<K, V> r5 = this;
        Object[] r7 = r5.keys;
        Object[] r8 = r5.values;
        long[] r11 = r5.metadata;
        int r12 = r11.length - 2;
        int r13 = 0;
        ?? r3 = (SieveCache) r26;
        if (0 > r12) goto L39;
    L15:
        long r14 = r11[r13];
        boolean r19 = r4;
        SieveCache<K, V> r20 = r5;
        boolean r16 = r2;
        ?? r17 = r3;
        if (((((~r14) << 7) & r14) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L33;
        int r6 = 8;
        int r9 = 8 - ((~(r13 - r12)) >>> 31);
        int r10 = 0;
        ?? r18 = r17;
    L18:
        if (r10 >= r9) goto L30;
        if ((r14 & 255) >= 128) goto L22;
        boolean r15 = r16;
    L23:
        if (r15 == false) goto L28;
        int r21 = (r13 << 3) + r10;
        Object r22 = r7[r21];
        Intrinsics.checkNotNull(r22, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
        Object r0 = r8[r21];
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
        ?? r1 = r18;
        if (Intrinsics.areEqual(r0, r1.get(r22)) == true) goto L29;
        return r19;
    L29:
        r14 = r14 >> r6;
        r10 = r10 + 1;
        r18 = r1;
        r6 = r6;
        goto L18
    L28:
        r1 = r18;
        goto L29
    L22:
        r15 = r19;
        goto L23
    L30:
        ?? r23 = r18;
        if (r9 != r6) goto L49;
    L34:
        if (r13 == r12) goto L48;
        r13 = r13 + 1;
        r3 = r23;
        r2 = r16;
        r4 = r19;
        r5 = r20;
        goto L15
    L48:
        return r16;
    L49:
        return r16;
    L33:
        r23 = r17;
        goto L34
    L39:
        return true;
    L50:
        return false;
    L41:
        return false;
    }

    public String toString() {
        return "SieveCache[maxSize=" + this._maxSize + ", size=" + this._size + ", capacity=" + this._capacity + ", count=" + this._count + ']';
    }
}
