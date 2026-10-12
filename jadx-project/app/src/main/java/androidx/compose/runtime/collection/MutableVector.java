package androidx.compose.runtime.collection;

import androidx.autofill.HintConstants;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: MutableVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003tuvB\u001f\b\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bJ\u0019\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010 J\u001c\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u001c\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000!J\u001c\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\"J\u0014\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000!J\u0017\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0086\bJ(\u0010#\u001a\u00020\u00182\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0006\u0010'\u001a\u00020\u001bJ\u0016\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u001aJ\u0014\u0010)\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010)\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000!J\u0014\u0010)\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\"J\u0014\u0010*\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0011\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u0007H\u0086\bJ\u000b\u0010.\u001a\u00028\u0000¢\u0006\u0002\u0010/J-\u0010.\u001a\u00028\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0010\u00101\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u0010/J/\u00101\u001a\u0004\u0018\u00018\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100JP\u00102\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32'\u00105\u001a#\u0012\u0013\u0012\u0011H3¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H306H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010:Je\u0010;\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32<\u00105\u001a8\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H3¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H30<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010=JP\u0010>\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32'\u00105\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H3¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u0002H306H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010:Je\u0010?\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32<\u00105\u001a8\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H3¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u0002H30<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010=J(\u0010@\u001a\u00020\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J.\u0010B\u001a\u00020\u001b2\u0018\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b06H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010C\u001a\u00020\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J.\u0010D\u001a\u00020\u001b2\u0018\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b06H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010E\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0086\n¢\u0006\u0002\u0010FJ\u0015\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010JJ(\u0010K\u001a\u00020\u00072\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010L\u001a\u00020\u00072\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\t\u0010M\u001a\u00020\u0018H\u0086\bJ\t\u0010N\u001a\u00020\u0018H\u0086\bJ\u000b\u0010O\u001a\u00028\u0000¢\u0006\u0002\u0010/J-\u0010O\u001a\u00028\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0013\u0010P\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010JJ\u0010\u0010Q\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u0010/J/\u0010Q\u001a\u0004\u0018\u00018\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J;\u0010R\u001a\b\u0012\u0004\u0012\u0002H30\u0005\"\u0006\b\u0001\u00103\u0018\u00012\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H30%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010TJP\u0010U\u001a\b\u0012\u0004\u0012\u0002H30\u0005\"\u0006\b\u0001\u00103\u0018\u00012'\u0010S\u001a#\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H306H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010VJM\u0010W\u001a\b\u0012\u0004\u0012\u0002H30\u0000\"\u0006\b\u0001\u00103\u0018\u00012)\u0010S\u001a%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H306H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J8\u0010X\u001a\b\u0012\u0004\u0012\u0002H30\u0000\"\u0006\b\u0001\u00103\u0018\u00012\u0014\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H30%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010Y\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010ZJ\u0016\u0010[\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010ZJ\u0013\u0010\\\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u001aJ\u0014\u0010]\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010]\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000!J\u0014\u0010]\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\"J\u0013\u0010^\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0002\u0010FJ\u001d\u0010_\u001a\u00020\u001b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\bJ\u0016\u0010`\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u0007J\u0010\u0010c\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u0007H\u0001J\u0014\u0010d\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000!J(\u0010e\u001a\u00020\u00182\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u001e\u0010f\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010gJ\u0010\u0010h\u001a\u00020\u001b2\u0006\u0010i\u001a\u00020\u0007H\u0001J\u001e\u0010j\u001a\u00020\u001b2\u0016\u0010k\u001a\u0012\u0012\u0004\u0012\u00028\u00000lj\b\u0012\u0004\u0012\u00028\u0000`mJ(\u0010n\u001a\u00020\u00072\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\t\u0010p\u001a\u00020qH\u0081\bJ\u0010\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020sH\u0001R\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u000b\u0012\u0004\b\t\u0010\nR\u0012\u0010\f\u001a\u00020\r8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006w"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "content", "", "size", "", "([Ljava/lang/Object;I)V", "getContent$annotations", "()V", "[Ljava/lang/Object;", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "list", "", "<set-?>", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "([Ljava/lang/Object;)Z", "", "", "any", "predicate", "Lkotlin/Function1;", "asMutableList", "clear", "contains", "containsAll", "contentEquals", "other", "ensureCapacity", "capacity", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "getContent", "()[Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "map", "transform", "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "mapNotNull", "minusAssign", "(Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeAt", "removeIf", "removeRange", "start", "end", "resizeStorage", "retainAll", "reversedAny", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "setSize", "newSize", "sortWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sumBy", "selector", "throwNoSuchElementException", "", "message", "", "MutableVectorList", "SubList", "VectorListIterator", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 0;
    public T[] content;
    private List<T> list;
    private int size;

    /* JADX INFO: compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u001d\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH\u0096\u0002J\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0015\u0010#\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0018J\u0016\u0010$\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u001e\u0010%\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", "T", "", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "(Landroidx/compose/runtime/collection/MutableVector;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class MutableVectorList<T> implements List<T>, KMutableList {
        private final MutableVector<T> vector;

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] r2) {
            return (T[]) CollectionToArray.toArray(this, r2);
        }

        public MutableVectorList(MutableVector<T> r1) {
            this.vector = r1;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int index) {
            return removeAt(index);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.contains(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> r2) {
            return this.vector.containsAll(r2);
        }

        @Override // java.util.List
        public T get(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.content[index];
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.indexOf(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (this.vector.getSize() != 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.lastIndexOf(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T r2) {
            return this.vector.add(r2);
        }

        @Override // java.util.List
        public void add(int index, T r3) {
            this.vector.add(index, r3);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> r3) {
            return this.vector.addAll(index, r3);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> r2) {
            return this.vector.addAll(r2);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.remove(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> r2) {
            return this.vector.removeAll(r2);
        }

        public T removeAt(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.removeAt(index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> r2) {
            return this.vector.retainAll(r2);
        }

        @Override // java.util.List
        public T set(int index, T r3) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.set(index, r3);
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            MutableVectorKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }
    }

    /* JADX INFO: compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0017\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\fH\u0016J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002J\u0015\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010#\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0015\u0010$\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0019J\u0016\u0010%\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u001e\u0010&\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", "T", "", "list", "start", "", "end", "(Ljava/util/List;II)V", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SubList<T> implements List<T>, KMutableList {
        private int end;
        private final List<T> list;
        private final int start;

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] r2) {
            return (T[]) CollectionToArray.toArray(this, r2);
        }

        public SubList(List<T> r1, int start, int end) {
            this.list = r1;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int index) {
            return removeAt(index);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i = this.start;
            int r1 = this.end;
        L3:
            if (i >= r1) goto L9;
            if (Intrinsics.areEqual(this.list.get(i), element) == true) goto L6;
            i = i + 1;
            goto L3
        L6:
            return true;
        L9:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> r8) {
            Collection<? extends Object> $this$forEach$iv = r8;
            Iterator<T> r2 = $this$forEach$iv.iterator();
        L4:
            if (r2.hasNext() == false) goto L10;
            Object element$iv = r2.next();
            if (contains(element$iv) == true) goto L4;
            return false;
        L10:
            return true;
        }

        @Override // java.util.List
        public T get(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.list.get(this.start + index);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i = this.start;
            int r1 = this.end;
        L3:
            if (i >= r1) goto L9;
            if (Intrinsics.areEqual(this.list.get(i), element) == true) goto L7;
            i = i + 1;
            goto L3
        L7:
            return i - this.start;
        L9:
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (this.end != this.start) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i = this.end - 1;
            int r1 = this.start;
            if (r1 <= i) goto L5;
            return -1;
        L5:
            if (Intrinsics.areEqual(this.list.get(i), element) == true) goto L7;
            if (i == r1) goto L14;
            i = i - 1;
            goto L5
        L14:
            return -1;
        L7:
            return i - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T r4) {
            List<T> r0 = this.list;
            int r1 = this.end;
            this.end = r1 + 1;
            r0.add(r1, r4);
            return true;
        }

        @Override // java.util.List
        public void add(int index, T r4) {
            this.list.add(this.start + index, r4);
            this.end++;
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> r4) {
            this.list.addAll(this.start + index, r4);
            int size = r4.size();
            this.end += size;
            if (size <= 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> r3) {
            this.list.addAll(this.end, r3);
            int size = r3.size();
            this.end += size;
            if (size <= 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.end - 1;
            int r1 = this.start;
            if (r1 > i) goto L7;
        L4:
            this.list.remove(i);
            if (i == r1) goto L7;
            i = i - 1;
        L7:
            this.end = this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i = this.start;
            int r1 = this.end;
        L3:
            if (i >= r1) goto L9;
            if (Intrinsics.areEqual(this.list.get(i), element) == true) goto L6;
            i = i + 1;
            goto L3
        L6:
            this.list.remove(i);
            this.end--;
            return true;
        L9:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> r8) {
            int originalEnd = this.end;
            Collection<? extends Object> $this$forEach$iv = r8;
            Iterator<T> r3 = $this$forEach$iv.iterator();
        L4:
            if (r3.hasNext() == false) goto L7;
            Object element$iv = r3.next();
            remove(element$iv);
            goto L4
        L7:
            if (originalEnd == this.end) goto L9;
            return true;
        L9:
            return false;
        }

        public T removeAt(int index) {
            MutableVectorKt.checkIndex(this, index);
            T r0 = this.list.remove(this.start + index);
            this.end--;
            return r0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> r7) {
            int originalEnd = this.end;
            int i = this.end - 1;
            int r3 = this.start;
            if (r3 > i) goto L10;
        L4:
            Object item = this.list.get(i);
            if (r7.contains(item) == true) goto L7;
            this.list.remove(i);
            this.end--;
        L7:
            if (i == r3) goto L10;
            i = i - 1;
        L10:
            if (originalEnd != this.end) goto L15;
            return false;
        L15:
            return true;
        }

        @Override // java.util.List
        public T set(int index, T r4) {
            MutableVectorKt.checkIndex(this, index);
            return this.list.set(this.start + index, r4);
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            MutableVectorKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }
    }

    /* JADX INFO: compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000bJ\t\u0010\f\u001a\u00020\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u000f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\r\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", "T", "", "list", "", "index", "", "(Ljava/util/List;I)V", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class VectorListIterator<T> implements ListIterator<T>, KMutableListIterator {
        private int index;
        private final List<T> list;

        public VectorListIterator(List<T> r1, int index) {
            this.list = r1;
            this.index = index;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.index >= this.list.size()) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> r0 = this.list;
            int r1 = this.index;
            this.index = r1 + 1;
            return r0.get(r1);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.index--;
            this.list.remove(this.index);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.index <= 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            this.index--;
            return this.list.get(this.index);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator
        public void add(T r3) {
            this.list.add(this.index, r3);
            this.index++;
        }

        @Override // java.util.ListIterator
        public void set(T r3) {
            this.list.set(this.index, r3);
        }
    }

    static {
        $stable = 8;
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public MutableVector(T[] r1, int size) {
        this.content = r1;
        this.size = size;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final IntRange getIndices() {
        return RangesKt.until(0, getSize());
    }

    public final T[] getContent() {
        return this.content;
    }

    public final boolean add(T r6) {
        int capacity$iv = this.size + 1;
        if (this.content.length >= capacity$iv) goto L5;
        resizeStorage(capacity$iv);
    L5:
        this.content[this.size] = r6;
        this.size++;
        return true;
    }

    public final void add(int index, T r8) {
        int capacity$iv = this.size + 1;
        if (this.content.length >= capacity$iv) goto L5;
        resizeStorage(capacity$iv);
    L5:
        Object[] content = this.content;
        if (index == this.size) goto L8;
        int destinationOffset$iv = index + 1;
        int endIndex$iv = this.size;
        System.arraycopy(content, index, content, destinationOffset$iv, endIndex$iv - index);
    L8:
        content[index] = r8;
        this.size++;
    }

    public final boolean addAll(int index, List<? extends T> r9) {
        if (r9.isEmpty() == false) goto L6;
        return false;
    L6:
        int elementsSize = r9.size();
        int capacity$iv = this.size + elementsSize;
        if (this.content.length >= capacity$iv) goto L9;
        resizeStorage(capacity$iv);
    L9:
        Object[] content = this.content;
        if (index == this.size) goto L12;
        int destinationOffset$iv = index + elementsSize;
        int endIndex$iv = this.size;
        System.arraycopy(content, index, content, destinationOffset$iv, endIndex$iv - index);
    L12:
        int i = 0;
        int r3 = r9.size();
    L13:
        if (i >= r3) goto L15;
        content[index + i] = r9.get(i);
        i = i + 1;
        goto L13
    L15:
        int i2 = this.size;
        this.size = i2 + elementsSize;
        return true;
    }

    public final boolean addAll(int index, MutableVector<T> r10) {
        int elementsSize = r10.size;
        if (elementsSize != 0) goto L5;
        return false;
    L5:
        int capacity$iv = this.size + elementsSize;
        if (this.content.length >= capacity$iv) goto L8;
        resizeStorage(capacity$iv);
    L8:
        Object[] content = this.content;
        if (index == this.size) goto L11;
        int destinationOffset$iv = index + elementsSize;
        int endIndex$iv = this.size;
        System.arraycopy(content, index, content, destinationOffset$iv, endIndex$iv - index);
    L11:
        Object[] $this$fastCopyInto$iv = r10.content;
        System.arraycopy($this$fastCopyInto$iv, 0, content, index, elementsSize - 0);
        int startIndex$iv = this.size;
        this.size = startIndex$iv + elementsSize;
        return true;
    }

    public final boolean addAll(List<? extends T> r3) {
        return addAll(getSize(), r3);
    }

    public final boolean addAll(MutableVector<T> r3) {
        return addAll(getSize(), r3);
    }

    public final boolean addAll(T[] r8) {
        int elementsSize = r8.length;
        if (elementsSize != 0) goto L6;
        return false;
    L6:
        int capacity$iv = this.size + elementsSize;
        if (this.content.length >= capacity$iv) goto L9;
        resizeStorage(capacity$iv);
    L9:
        Object[] destination$iv = this.content;
        int destinationOffset$iv = this.size;
        System.arraycopy(r8, 0, destination$iv, destinationOffset$iv, elementsSize - 0);
        this.size += elementsSize;
        return true;
    }

    public final boolean addAll(int index, Collection<? extends T> r13) {
        if (r13.isEmpty() == false) goto L6;
        return false;
    L6:
        int elementsSize = r13.size();
        int capacity$iv = this.size + elementsSize;
        if (this.content.length >= capacity$iv) goto L9;
        resizeStorage(capacity$iv);
    L9:
        Object[] content = this.content;
        if (index == this.size) goto L12;
        int destinationOffset$iv = index + elementsSize;
        int endIndex$iv = this.size;
        System.arraycopy(content, index, content, destinationOffset$iv, endIndex$iv - index);
    L12:
        Collection<? extends T> $this$forEachIndexed$iv = r13;
        int i = 0;
        Iterator<T> r5 = $this$forEachIndexed$iv.iterator();
    L14:
        if (r5.hasNext() == false) goto L19;
        Object item$iv = r5.next();
        int index$iv = i + 1;
        if (i >= 0) goto L18;
        CollectionsKt.throwIndexOverflow();
    L18:
        content[index + i] = item$iv;
        i = index$iv;
        goto L14
    L19:
        this.size += elementsSize;
        return true;
    }

    public final boolean addAll(Collection<? extends T> r2) {
        return addAll(this.size, r2);
    }

    public final boolean any(Function1<? super T, Boolean> r6) {
        Object[] content = this.content;
        int size = getSize();
        int i = 0;
    L3:
        if (i >= size) goto L9;
        if (r6.invoke(content[i]).booleanValue() == true) goto L6;
        i = i + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public final boolean reversedAny(Function1<? super T, Boolean> r6) {
        Object[] content = this.content;
        int i = getSize() - 1;
    L3:
        if (i < 0) goto L8;
        if (r6.invoke(content[i]).booleanValue() == true) goto L6;
        i = i - 1;
        goto L3
    L6:
        return true;
    L8:
        return false;
    }

    public final List<T> asMutableList() {
        List<T> r0 = this.list;
        if (r0 != null) goto L6;
        MutableVectorList it = new MutableVectorList(this);
        this.list = it;
        return it;
    L6:
        return r0;
    }

    public final void clear() {
        Object[] content = this.content;
        int i = 0;
        int r2 = this.size;
    L3:
        if (i >= r2) goto L5;
        content[i] = null;
        i = i + 1;
        goto L3
    L5:
        this.size = 0;
    }

    public final boolean contains(T r7) {
        int i = 0;
        int r3 = getSize() - 1;
        if (0 <= r3) goto L5;
        return false;
    L5:
        if (Intrinsics.areEqual(this.content[i], r7) == true) goto L6;
        if (i == r3) goto L13;
        i = i + 1;
        goto L5
    L13:
        return false;
    L6:
        return true;
    }

    public final boolean containsAll(List<? extends T> r4) {
        int i = 0;
        int r1 = r4.size();
    L3:
        if (i >= r1) goto L9;
        if (contains(r4.get(i)) == false) goto L6;
        i = i + 1;
        goto L3
    L6:
        return false;
    L9:
        return true;
    }

    public final boolean containsAll(Collection<? extends T> r8) {
        Collection<? extends T> $this$forEach$iv = r8;
        Iterator<T> r2 = $this$forEach$iv.iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        if (contains(r2.next()) == true) goto L4;
        return false;
    L10:
        return true;
    }

    public final boolean containsAll(MutableVector<T> r7) {
        IntRange r0 = RangesKt.until(0, r7.getSize());
        int i = r0.getFirst();
        int r1 = r0.getLast();
        if (i <= r1) goto L5;
        return true;
    L5:
        if (contains(r7.content[i]) == false) goto L6;
        if (i == r1) goto L13;
        i = i + 1;
        goto L5
    L13:
        return true;
    L6:
        return false;
    }

    public final boolean contentEquals(MutableVector<T> r9) {
        if (r9.size == this.size) goto L5;
        return false;
    L5:
        int i = 0;
        int r4 = getSize() - 1;
        if (0 <= r4) goto L8;
    L12:
        return true;
    L8:
        if (Intrinsics.areEqual(r9.content[i], this.content[i]) == false) goto L9;
        if (i == r4) goto L12;
        i = i + 1;
        goto L8
    L9:
        return false;
    }

    public final void ensureCapacity(int capacity) {
        if (this.content.length >= capacity) goto L6;
        resizeStorage(capacity);
        return;
    }

    public final void resizeStorage(int r10) {
        T[] r0 = this.content;
        int r1 = r0.length;
        T[] r3 = (T[]) new Object[Math.max(r10, r1 * 2)];
        System.arraycopy(r0, 0, r3, 0, r1 - 0);
        this.content = r3;
    }

    public final T first() {
        if (getSize() != 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L8;
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    L8:
        return this.content[0];
    L5:
        r2 = false;
        goto L6
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    public final T first(Function1<? super T, Boolean> r7) {
        T[] r1 = this.content;
        int r2 = getSize();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L8;
        ?? r4 = (Object) r1[r3];
        if (r7.invoke(r4).booleanValue() == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return r4;
    L8:
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public final Void throwNoSuchElementException() {
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final Void throwNoSuchElementException(String message) {
        throw new NoSuchElementException(message);
    }

    public final T firstOrNull() {
        if (getSize() != 0) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L9;
        return null;
    L9:
        return this.content[0];
    L5:
        r3 = false;
        goto L6
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    public final T firstOrNull(Function1<? super T, Boolean> r7) {
        T[] r1 = this.content;
        int r2 = getSize();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L8;
        ?? r4 = (Object) r1[r3];
        if (r7.invoke(r4).booleanValue() == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return r4;
    L8:
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R fold(R r7, Function2<? super R, ? super T, ? extends R> r8) {
        R r1 = r7;
        T[] r2 = this.content;
        int r3 = getSize();
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        R r5 = r1;
        r1 = r8.invoke(r5, r2[r4]);
        r4 = r4 + 1;
        goto L3
    L5:
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldIndexed(R r8, Function3<? super Integer, ? super R, ? super T, ? extends R> r9) {
        R r1 = r8;
        T[] r2 = this.content;
        int r3 = getSize();
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        R r5 = r1;
        r1 = r9.invoke(Integer.valueOf(r4), r5, r2[r4]);
        r4 = r4 + 1;
        goto L3
    L5:
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRight(R r6, Function2<? super T, ? super R, ? extends R> r7) {
        R r1 = r6;
        int r2 = getSize() - 1;
        T[] r3 = this.content;
        if (r2 < r3.length) goto L5;
        return r1;
    L5:
        if (r2 < 0) goto L7;
        r1 = r7.invoke(r3[r2], r1);
        r2 = r2 - 1;
        goto L5
    L7:
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRightIndexed(R r7, Function3<? super Integer, ? super T, ? super R, ? extends R> r8) {
        R r1 = r7;
        int r2 = getSize() - 1;
        T[] r3 = this.content;
        if (r2 < r3.length) goto L5;
        return r1;
    L5:
        if (r2 < 0) goto L7;
        r1 = r8.invoke(Integer.valueOf(r2), r3[r2], r1);
        r2 = r2 - 1;
        goto L5
    L7:
        return r1;
    }

    public final void forEach(Function1<? super T, Unit> r6) {
        int i = 0;
        Object[] content = this.content;
        int size = getSize();
    L3:
        if (i >= size) goto L5;
        r6.invoke(content[i]);
        i = i + 1;
        goto L3
    }

    public final void forEachIndexed(Function2<? super Integer, ? super T, Unit> r7) {
        int i = 0;
        Object[] content = this.content;
        int size = getSize();
    L3:
        if (i >= size) goto L5;
        r7.invoke(Integer.valueOf(i), content[i]);
        i = i + 1;
        goto L3
    }

    public final void forEachReversed(Function1<? super T, Unit> r5) {
        int i = getSize() - 1;
        Object[] content = this.content;
        if (i < content.length) goto L5;
        return;
    L5:
        if (i < 0) goto L7;
        r5.invoke(content[i]);
        i = i - 1;
        goto L5
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super T, Unit> r6) {
        int i = getSize() - 1;
        Object[] content = this.content;
        if (i < content.length) goto L5;
        return;
    L5:
        if (i < 0) goto L7;
        r6.invoke(Integer.valueOf(i), content[i]);
        i = i - 1;
        goto L5
    }

    public final T get(int index) {
        return this.content[index];
    }

    public final int indexOf(T r5) {
        Object[] content = this.content;
        int size = this.size;
        int i = 0;
    L3:
        if (i >= size) goto L8;
        if (Intrinsics.areEqual(r5, content[i]) == true) goto L6;
        i = i + 1;
        goto L3
    L6:
        return i;
    L8:
        return -1;
    }

    public final int indexOfFirst(Function1<? super T, Boolean> r6) {
        Object[] content = this.content;
        int size = getSize();
        int i = 0;
    L3:
        if (i >= size) goto L8;
        if (r6.invoke(content[i]).booleanValue() == true) goto L6;
        i = i + 1;
        goto L3
    L6:
        return i;
    L8:
        return -1;
    }

    public final int indexOfLast(Function1<? super T, Boolean> r5) {
        int i = getSize() - 1;
        Object[] content = this.content;
        if (i >= content.length) goto L9;
    L4:
        if (i < 0) goto L13;
        if (r5.invoke(content[i]).booleanValue() == true) goto L7;
        i = i - 1;
        goto L4
    L7:
        return i;
    L13:
        return -1;
    L9:
        return -1;
    }

    public final boolean isEmpty() {
        if (getSize() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isNotEmpty() {
        if (getSize() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final T last() {
        if (getSize() != 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L9;
        int index$iv = getSize() - 1;
        return this.content[index$iv];
    L9:
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    L5:
        r2 = false;
        goto L6
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Object] */
    public final T last(Function1<? super T, Boolean> r6) {
        int r1 = getSize() - 1;
        T[] r2 = this.content;
    L3:
        if (r1 < 0) goto L8;
        ?? r3 = (Object) r2[r1];
        if (r6.invoke(r3).booleanValue() == true) goto L6;
        r1 = r1 - 1;
        goto L3
    L6:
        return r3;
    L8:
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public final int lastIndexOf(T r4) {
        int i = this.size - 1;
        Object[] content = this.content;
    L3:
        if (i < 0) goto L8;
        if (Intrinsics.areEqual(r4, content[i]) == true) goto L6;
        i = i - 1;
        goto L3
    L6:
        return i;
    L8:
        return -1;
    }

    public final T lastOrNull() {
        if (getSize() != 0) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L8;
        return null;
    L8:
        int index$iv = getSize() - 1;
        return this.content[index$iv];
    L5:
        r3 = false;
        goto L6
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    public final T lastOrNull(Function1<? super T, Boolean> r6) {
        int r1 = getSize() - 1;
        T[] r2 = this.content;
    L3:
        if (r1 < 0) goto L8;
        ?? r3 = (Object) r2[r1];
        if (r6.invoke(r3).booleanValue() == true) goto L6;
        r1 = r1 - 1;
        goto L3
    L6:
        return r3;
    L8:
        return null;
    }

    public final /* synthetic */ <R> R[] map(Function1<? super T, ? extends R> r8) {
        int r1 = getSize();
        int r3 = 0;
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] r2 = (R[]) new Object[r1];
    L3:
        if (r3 >= r1) goto L5;
        r2[r3] = r8.invoke(this.content[r3]);
        r3 = r3 + 1;
        goto L3
    L5:
        return r2;
    }

    public final /* synthetic */ <R> R[] mapIndexed(Function2<? super Integer, ? super T, ? extends R> r9) {
        int r1 = getSize();
        int r3 = 0;
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] r2 = (R[]) new Object[r1];
    L3:
        if (r3 >= r1) goto L5;
        r2[r3] = r9.invoke(Integer.valueOf(r3), this.content[r3]);
        r3 = r3 + 1;
        goto L3
    L5:
        return r2;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(Function2<? super Integer, ? super T, ? extends R> r9) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] arr = new Object[size];
        int targetSize = 0;
        Object[] content = this.content;
        int i = 0;
    L3:
        if (i >= size) goto L9;
        Object target = r9.invoke(Integer.valueOf(i), content[i]);
        if (target == null) goto L7;
        arr[targetSize] = target;
        targetSize = targetSize + 1;
    L7:
        i = i + 1;
        goto L3
    L9:
        return new MutableVector(arr, targetSize);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(Function1<? super T, ? extends R> r9) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] arr = new Object[size];
        int targetSize = 0;
        Object[] content = this.content;
        int i = 0;
    L3:
        if (i >= size) goto L9;
        Object target = r9.invoke(content[i]);
        if (target == null) goto L7;
        arr[targetSize] = target;
        targetSize = targetSize + 1;
    L7:
        i = i + 1;
        goto L3
    L9:
        return new MutableVector(arr, targetSize);
    }

    public final void plusAssign(T r2) {
        add(r2);
    }

    public final void minusAssign(T r2) {
        remove(r2);
    }

    public final boolean remove(T r3) {
        int index = indexOf(r3);
        if (index < 0) goto L6;
        removeAt(index);
        return true;
    L6:
        return false;
    }

    public final boolean removeAll(List<? extends T> r5) {
        int initialSize = this.size;
        int i = 0;
        int r2 = r5.size();
    L3:
        if (i >= r2) goto L5;
        remove(r5.get(i));
        i = i + 1;
        goto L3
    L5:
        int i2 = this.size;
        if (initialSize == i2) goto L8;
        return true;
    L8:
        return false;
    }

    public final boolean removeAll(MutableVector<T> r8) {
        int initialSize = this.size;
        int i = 0;
        int r4 = r8.getSize() - 1;
        if (0 > r4) goto L7;
    L4:
        remove(r8.content[i]);
        if (i == r4) goto L7;
        i = i + 1;
    L7:
        int i2 = this.size;
        if (initialSize != i2) goto L13;
        return false;
    L13:
        return true;
    }

    public final boolean removeAll(Collection<? extends T> r9) {
        if (r9.isEmpty() == false) goto L5;
        return false;
    L5:
        int initialSize = this.size;
        Collection<? extends T> $this$forEach$iv = r9;
        Iterator<T> r4 = $this$forEach$iv.iterator();
    L7:
        if (r4.hasNext() == false) goto L10;
        remove(r4.next());
        goto L7
    L10:
        if (initialSize == this.size) goto L14;
        return true;
    L14:
        return false;
    }

    public final T removeAt(int index) {
        T[] r0 = this.content;
        T r1 = r0[index];
        if (index == (getSize() - 1)) goto L5;
        int startIndex$iv = index + 1;
        int endIndex$iv = this.size;
        System.arraycopy(r0, startIndex$iv, r0, index, endIndex$iv - startIndex$iv);
    L5:
        this.size--;
        r0[this.size] = null;
        return r1;
    }

    public final void removeRange(int start, int end) {
        if (end > start) goto L4;
        return;
    L4:
        if (end >= this.size) goto L6;
        Object[] $this$fastCopyInto$iv = this.content;
        Object[] destination$iv = this.content;
        int endIndex$iv = this.size;
        System.arraycopy($this$fastCopyInto$iv, end, destination$iv, start, endIndex$iv - end);
    L6:
        int newSize = this.size - (end - start);
        int i = newSize;
        int r4 = getSize() - 1;
        if (i > r4) goto L11;
    L8:
        this.content[i] = null;
        if (i == r4) goto L11;
        i = i + 1;
    L11:
        this.size = newSize;
    }

    public final void setSize(int newSize) {
        this.size = newSize;
    }

    public final void removeIf(Function1<? super T, Boolean> r8) {
        int r1 = 0;
        int r2 = getSize();
        int r3 = 0;
    L3:
        T[] r4 = this.content;
        if (r3 >= r2) goto L11;
        if (r8.invoke(r4[r3]).booleanValue() == false) goto L8;
        r1 = r1 + 1;
    L10:
        r3 = r3 + 1;
        goto L3
    L8:
        if (r1 <= 0) goto L10;
        this.content[r3 - r1] = this.content[r3];
        goto L10
    L11:
        ArraysKt.fill(r4, null, r2 - r1, r2);
        setSize(r2 - r1);
    }

    public final boolean retainAll(Collection<? extends T> r7) {
        int initialSize = this.size;
        int i = getSize() - 1;
    L4:
        if ((-1) >= i) goto L10;
        Object item = this.content[i];
        if (r7.contains(item) == true) goto L8;
        removeAt(i);
    L8:
        i = i - 1;
        goto L4
    L10:
        if (initialSize != this.size) goto L17;
        return false;
    L17:
        return true;
    }

    public final T set(int index, T r4) {
        T[] r0 = this.content;
        T r1 = r0[index];
        r0[index] = r4;
        return r1;
    }

    public final void sortWith(Comparator<T> r4) {
        ArraysKt.sortWith(this.content, r4, 0, this.size);
    }

    public final int sumBy(Function1<? super T, Integer> r6) {
        int sum = 0;
        Object[] content = this.content;
        int i = 0;
    L4:
        if (i >= getSize()) goto L6;
        sum = sum + r6.invoke(content[i]).intValue();
        i = i + 1;
        goto L4
    L6:
        return sum;
    }
}
