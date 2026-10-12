package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0000\u0018\u0000 Q*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0003QRSB\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u0016\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0015\u0010'\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\u001d\u0010'\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u001e\u0010+\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\b\u0010.\u001a\u00020)H\u0016J\u0015\u0010/\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u001cJ\u0015\u00100\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\u0016\u00101\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u0016\u00102\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0016J'\u00106\u001a\b\u0012\u0004\u0012\u0002H70\r\"\u0004\b\u0001\u001072\f\u00108\u001a\b\u0012\u0004\u0012\u0002H70\rH\u0016¢\u0006\u0002\u00109J\u0015\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\rH\u0016¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010=\u001a\u00020\tH\u0016J\b\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020)H\u0002J\b\u0010A\u001a\u00020)H\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020\tH\u0002J\u0010\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020\tH\u0002J\u0014\u0010F\u001a\u00020\u00112\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J\u0018\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0002J\u001d\u0010I\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010*J&\u0010J\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010C\u001a\u00020\tH\u0002J\u0015\u0010K\u001a\u00028\u00002\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u001cJ\u0018\u0010L\u001a\u00020)2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\tH\u0002J.\u0010O\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010P\u001a\u00020\u0011H\u0002R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006T"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initialCapacity", "", "<init>", "(I)V", "backing", "", "[Ljava/lang/Object;", "length", "isReadOnly", "", "build", "", "writeReplace", "", "size", "getSize", "()I", "isEmpty", "get", "index", "(I)Ljava/lang/Object;", "set", "element", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "iterator", "", "listIterator", "", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "removeAt", "remove", "removeAll", "retainAll", "subList", "fromIndex", "toIndex", "toArray", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "other", "hashCode", "toString", "", "registerModification", "checkIsMutable", "ensureExtraCapacity", "n", "ensureCapacityInternal", "minCapacity", "contentEquals", "insertAtInternal", "i", "addAtInternal", "addAllInternal", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainOrRemoveAllInternal", "retain", "Companion", "Itr", "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
    private static final Companion Companion = null;
    private static final ListBuilder Empty = null;
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    /* JADX INFO: compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\f\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001TBC\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010%J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0096\u0002J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010*2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u0015\u0010+\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010,J\u001d\u0010+\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\u001e\u0010.\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\b\u00101\u001a\u00020\u0016H\u0016J\u0015\u00102\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010 J\u0015\u00103\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010,J\u0016\u00104\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\u0016\u00105\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bH\u0016J'\u00109\u001a\b\u0012\u0004\u0012\u0002H:0\t\"\u0004\b\u0002\u0010:2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H:0\tH\u0016¢\u0006\u0002\u0010<J\u0015\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\tH\u0016¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u001d2\b\u0010?\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010@\u001a\u00020\u000bH\u0016J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020\u0016H\u0002J\b\u0010D\u001a\u00020\u0016H\u0002J\b\u0010E\u001a\u00020\u0016H\u0002J\u0014\u0010H\u001a\u00020\u001d2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030IH\u0002J\u001d\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010-J&\u0010L\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u0001002\u0006\u0010M\u001a\u00020\u000bH\u0002J\u0015\u0010N\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010 J\u0018\u0010O\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000bH\u0002J.\u0010R\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u0001002\u0006\u0010S\u001a\u00020\u001dH\u0002R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010F\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006U"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "backing", "", "offset", "", "length", "parent", "root", "Lkotlin/collections/builders/ListBuilder;", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "size", "getSize", "()I", "isEmpty", "", "get", "index", "(I)Ljava/lang/Object;", "set", "element", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "iterator", "", "listIterator", "", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "removeAt", "remove", "removeAll", "retainAll", "subList", "fromIndex", "toIndex", "toArray", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "other", "hashCode", "toString", "", "registerModification", "checkForComodification", "checkIsMutable", "isReadOnly", "()Z", "contentEquals", "", "addAtInternal", "i", "addAllInternal", "n", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainOrRemoveAllInternal", "retain", "Itr", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BuilderSubList<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
        private E[] backing;
        private int length;
        private final int offset;
        private final BuilderSubList<E> parent;
        private final ListBuilder<E> root;

        /* JADX INFO: compiled from: ListBuilder.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\fH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\r\u0010\u0010\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList$Itr;", "E", "", "list", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "index", "", "<init>", "(Lkotlin/collections/builders/ListBuilder$BuilderSubList;I)V", "lastIndex", "expectedModCount", "hasPrevious", "", "hasNext", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "set", "", "element", "(Ljava/lang/Object;)V", "add", "remove", "checkForComodification", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        private static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
            private int expectedModCount;
            private int index;
            private int lastIndex;
            private final BuilderSubList<E> list;

            public Itr(BuilderSubList<E> r2, int index) {
                Intrinsics.checkNotNullParameter(r2, "list");
                this.list = r2;
                this.index = index;
                this.lastIndex = -1;
                this.expectedModCount = BuilderSubList.access$getModCount$p$s1462993667(this.list);
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                if (this.index <= 0) goto L5;
                return true;
            L5:
                return false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                if (this.index >= BuilderSubList.access$getLength$p(this.list)) goto L5;
                return true;
            L5:
                return false;
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.index - 1;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.index;
            }

            @Override // java.util.ListIterator
            public E previous() {
                checkForComodification();
                if (this.index <= 0) goto L7;
                this.index--;
                this.lastIndex = this.index;
                return (E) BuilderSubList.access$getBacking$p(this.list)[BuilderSubList.access$getOffset$p(this.list) + this.lastIndex];
            L7:
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                checkForComodification();
                if (this.index >= BuilderSubList.access$getLength$p(this.list)) goto L7;
                int r0 = this.index;
                this.index = r0 + 1;
                this.lastIndex = r0;
                return (E) BuilderSubList.access$getBacking$p(this.list)[BuilderSubList.access$getOffset$p(this.list) + this.lastIndex];
            L7:
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public void set(E r3) {
                checkForComodification();
                if (this.lastIndex == (-1)) goto L5;
                boolean r0 = true;
            L6:
                if (r0 == false) goto L10;
                this.list.set(this.lastIndex, r3);
                return;
            L10:
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            L5:
                r0 = false;
                goto L6
            }

            @Override // java.util.ListIterator
            public void add(E r4) {
                checkForComodification();
                BuilderSubList<E> r0 = this.list;
                int r1 = this.index;
                this.index = r1 + 1;
                r0.add(r1, r4);
                this.lastIndex = -1;
                this.expectedModCount = BuilderSubList.access$getModCount$p$s1462993667(this.list);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                checkForComodification();
                if (this.lastIndex == (-1)) goto L5;
                boolean r0 = true;
            L6:
                if (r0 == false) goto L10;
                this.list.removeAt(this.lastIndex);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = BuilderSubList.access$getModCount$p$s1462993667(this.list);
                return;
            L10:
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            L5:
                r0 = false;
                goto L6
            }

            private final void checkForComodification() {
                if (ListBuilder.m7895access$getModCount$p$s2084097795(BuilderSubList.access$getRoot$p(this.list)) != this.expectedModCount) goto L6;
                return;
            L6:
                throw new ConcurrentModificationException();
            }
        }

        public static final /* synthetic */ Object[] access$getBacking$p(BuilderSubList $this) {
            return $this.backing;
        }

        public static final /* synthetic */ int access$getLength$p(BuilderSubList $this) {
            return $this.length;
        }

        public static final /* synthetic */ int access$getModCount$p$s1462993667(BuilderSubList $this) {
            return $this.modCount;
        }

        public static final /* synthetic */ int access$getOffset$p(BuilderSubList $this) {
            return $this.offset;
        }

        public static final /* synthetic */ ListBuilder access$getRoot$p(BuilderSubList $this) {
            return $this.root;
        }

        public BuilderSubList(E[] r2, int offset, int length, BuilderSubList<E> r5, ListBuilder<E> r6) {
            Intrinsics.checkNotNullParameter(r2, "backing");
            Intrinsics.checkNotNullParameter(r6, "root");
            this.backing = r2;
            this.offset = offset;
            this.length = length;
            this.parent = r5;
            this.root = r6;
            this.modCount = ListBuilder.m7895access$getModCount$p$s2084097795(this.root);
        }

        private final Object writeReplace() {
            if (isReadOnly() == false) goto L7;
            return new SerializedCollection(this, 0);
        L7:
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        private final void readObject(ObjectInputStream input) {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        @Override // kotlin.collections.AbstractMutableList
        public int getSize() {
            checkForComodification();
            return this.length;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            checkForComodification();
            if (this.length != 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            checkForComodification();
            AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
            return this.backing[this.offset + index];
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public E set(int index, E r5) {
            checkIsMutable();
            checkForComodification();
            AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
            E r0 = this.backing[this.offset + index];
            this.backing[this.offset + index] = r5;
            return r0;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            checkForComodification();
            int i = 0;
        L4:
            if (i >= this.length) goto L9;
            if (Intrinsics.areEqual(this.backing[this.offset + i], element) == true) goto L7;
            i = i + 1;
            goto L4
        L7:
            return i;
        L9:
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            checkForComodification();
            int i = this.length - 1;
        L3:
            if (i < 0) goto L8;
            if (Intrinsics.areEqual(this.backing[this.offset + i], element) == true) goto L6;
            i = i - 1;
            goto L3
        L6:
            return i;
        L8:
            return -1;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            checkForComodification();
            AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
            return new Itr(this, index);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E r3) {
            checkIsMutable();
            checkForComodification();
            addAtInternal(this.offset + this.length, r3);
            return true;
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public void add(int index, E r4) {
            checkIsMutable();
            checkForComodification();
            AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
            addAtInternal(this.offset + index, r4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> r4) {
            Intrinsics.checkNotNullParameter(r4, "elements");
            checkIsMutable();
            checkForComodification();
            int n = r4.size();
            addAllInternal(this.offset + this.length, r4, n);
            if (n <= 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, Collection<? extends E> r4) {
            Intrinsics.checkNotNullParameter(r4, "elements");
            checkIsMutable();
            checkForComodification();
            AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
            int n = r4.size();
            addAllInternal(this.offset + index, r4, n);
            if (n <= 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            checkIsMutable();
            checkForComodification();
            removeRangeInternal(this.offset, this.length);
        }

        @Override // kotlin.collections.AbstractMutableList
        public E removeAt(int index) {
            checkIsMutable();
            checkForComodification();
            AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
            return removeAtInternal(this.offset + index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            checkIsMutable();
            checkForComodification();
            int i = indexOf(element);
            if (i < 0) goto L5;
            removeAt(i);
        L5:
            if (i < 0) goto L7;
            return true;
        L7:
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> r4) {
            Intrinsics.checkNotNullParameter(r4, "elements");
            checkIsMutable();
            checkForComodification();
            if (retainOrRemoveAllInternal(this.offset, this.length, r4, false) <= 0) goto L6;
            return true;
        L6:
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> r4) {
            Intrinsics.checkNotNullParameter(r4, "elements");
            checkIsMutable();
            checkForComodification();
            if (retainOrRemoveAllInternal(this.offset, this.length, r4, true) > 0) goto L7;
            return false;
        L7:
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int fromIndex, int toIndex) {
            AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.length);
            return new BuilderSubList(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] r5) {
            Intrinsics.checkNotNullParameter(r5, "array");
            checkForComodification();
            int r0 = r5.length;
            int r1 = this.length;
            E[] r2 = this.backing;
            if (r0 >= r1) goto L6;
            T[] r3 = (T[]) Arrays.copyOfRange(r2, this.offset, this.offset + this.length, r5.getClass());
            Intrinsics.checkNotNullExpressionValue(r3, "copyOfRange(...)");
            return r3;
        L6:
            ArraysKt.copyInto(r2, r5, 0, this.offset, this.offset + this.length);
            return (T[]) CollectionsKt.terminateCollectionToArray(this.length, r5);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            checkForComodification();
            return ArraysKt.copyOfRange(this.backing, this.offset, this.offset + this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object other) {
            checkForComodification();
            if (other != this) goto L5;
        L10:
            return true;
        L5:
            if ((other instanceof List) == true) goto L7;
        L9:
            return false;
        L7:
            if (contentEquals((List) other) == false) goto L9;
            goto L9
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            checkForComodification();
            return ListBuilderKt.access$subarrayContentHashCode(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            checkForComodification();
            return ListBuilderKt.access$subarrayContentToString(this.backing, this.offset, this.length, this);
        }

        private final void registerModification() {
            this.modCount++;
        }

        private final void checkForComodification() {
            if (ListBuilder.m7895access$getModCount$p$s2084097795(this.root) != this.modCount) goto L6;
            return;
        L6:
            throw new ConcurrentModificationException();
        }

        private final void checkIsMutable() {
            if (isReadOnly() == true) goto L6;
            return;
        L6:
            throw new UnsupportedOperationException();
        }

        private final boolean isReadOnly() {
            return ListBuilder.access$isReadOnly$p(this.root);
        }

        private final boolean contentEquals(List<?> r4) {
            return ListBuilderKt.access$subarrayContentEquals(this.backing, this.offset, this.length, r4);
        }

        private final void addAtInternal(int r2, E r3) {
            registerModification();
            if (this.parent == null) goto L5;
            this.parent.addAtInternal(r2, r3);
        L6:
            this.backing = (E[]) ListBuilder.access$getBacking$p(this.root);
            this.length++;
            return;
        L5:
            ListBuilder.access$addAtInternal(this.root, r2, r3);
            goto L6
        }

        private final void addAllInternal(int r2, Collection<? extends E> r3, int r4) {
            registerModification();
            if (this.parent == null) goto L5;
            this.parent.addAllInternal(r2, r3, r4);
        L6:
            this.backing = (E[]) ListBuilder.access$getBacking$p(this.root);
            this.length += r4;
            return;
        L5:
            ListBuilder.access$addAllInternal(this.root, r2, r3, r4);
            goto L6
        }

        private final E removeAtInternal(int r3) {
            registerModification();
            if (this.parent == null) goto L5;
            E r0 = this.parent.removeAtInternal(r3);
        L6:
            this.length--;
            return r0;
        L5:
            r0 = (E) ListBuilder.access$removeAtInternal(this.root, r3);
            goto L6
        }

        private final void removeRangeInternal(int rangeOffset, int rangeLength) {
            if (rangeLength <= 0) goto L5;
            registerModification();
        L5:
            if (this.parent == null) goto L7;
            this.parent.removeRangeInternal(rangeOffset, rangeLength);
        L8:
            this.length -= rangeLength;
            return;
        L7:
            ListBuilder.access$removeRangeInternal(this.root, rangeOffset, rangeLength);
            goto L8
        }

        private final int retainOrRemoveAllInternal(int rangeOffset, int rangeLength, Collection<? extends E> r5, boolean retain) {
            if (this.parent == null) goto L5;
            int removed = this.parent.retainOrRemoveAllInternal(rangeOffset, rangeLength, r5, retain);
        L7:
            if (removed <= 0) goto L9;
            registerModification();
        L9:
            this.length -= removed;
            return removed;
        L5:
            removed = ListBuilder.access$retainOrRemoveAllInternal(this.root, rangeOffset, rangeLength, r5, retain);
            goto L7
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Companion;", "", "<init>", "()V", "Empty", "Lkotlin/collections/builders/ListBuilder;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\fH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\r\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", "E", "", "list", "Lkotlin/collections/builders/ListBuilder;", "index", "", "<init>", "(Lkotlin/collections/builders/ListBuilder;I)V", "lastIndex", "expectedModCount", "hasPrevious", "", "hasNext", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "set", "", "element", "(Ljava/lang/Object;)V", "add", "remove", "checkForComodification", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
        private int expectedModCount;
        private int index;
        private int lastIndex;
        private final ListBuilder<E> list;

        public Itr(ListBuilder<E> r2, int index) {
            Intrinsics.checkNotNullParameter(r2, "list");
            this.list = r2;
            this.index = index;
            this.lastIndex = -1;
            this.expectedModCount = ListBuilder.m7895access$getModCount$p$s2084097795(this.list);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.index <= 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.index >= ListBuilder.access$getLength$p(this.list)) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            checkForComodification();
            if (this.index <= 0) goto L7;
            this.index--;
            this.lastIndex = this.index;
            return (E) ListBuilder.access$getBacking$p(this.list)[this.lastIndex];
        L7:
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            checkForComodification();
            if (this.index >= ListBuilder.access$getLength$p(this.list)) goto L7;
            int r0 = this.index;
            this.index = r0 + 1;
            this.lastIndex = r0;
            return (E) ListBuilder.access$getBacking$p(this.list)[this.lastIndex];
        L7:
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public void set(E r3) {
            checkForComodification();
            if (this.lastIndex == (-1)) goto L5;
            boolean r0 = true;
        L6:
            if (r0 == false) goto L10;
            this.list.set(this.lastIndex, r3);
            return;
        L10:
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        L5:
            r0 = false;
            goto L6
        }

        @Override // java.util.ListIterator
        public void add(E r4) {
            checkForComodification();
            ListBuilder<E> r0 = this.list;
            int r1 = this.index;
            this.index = r1 + 1;
            r0.add(r1, r4);
            this.lastIndex = -1;
            this.expectedModCount = ListBuilder.m7895access$getModCount$p$s2084097795(this.list);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            checkForComodification();
            if (this.lastIndex == (-1)) goto L5;
            boolean r0 = true;
        L6:
            if (r0 == false) goto L10;
            this.list.removeAt(this.lastIndex);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ListBuilder.m7895access$getModCount$p$s2084097795(this.list);
            return;
        L10:
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        L5:
            r0 = false;
            goto L6
        }

        private final void checkForComodification() {
            if (ListBuilder.m7895access$getModCount$p$s2084097795(this.list) != this.expectedModCount) goto L6;
            return;
        L6:
            throw new ConcurrentModificationException();
        }
    }

    public ListBuilder() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public ListBuilder(int r2) {
        this.backing = (E[]) ListBuilderKt.arrayOfUninitializedElements(r2);
    }

    public /* synthetic */ ListBuilder(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 10;
    L5:
        this(r1);
    }

    public static final /* synthetic */ void access$addAllInternal(ListBuilder $this, int i, Collection elements, int n) {
        $this.addAllInternal(i, elements, n);
    }

    public static final /* synthetic */ void access$addAtInternal(ListBuilder $this, int i, Object element) {
        $this.addAtInternal(i, element);
    }

    public static final /* synthetic */ Object[] access$getBacking$p(ListBuilder $this) {
        return $this.backing;
    }

    public static final /* synthetic */ int access$getLength$p(ListBuilder $this) {
        return $this.length;
    }

    /* JADX INFO: renamed from: access$getModCount$p$s-2084097795, reason: not valid java name */
    public static final /* synthetic */ int m7895access$getModCount$p$s2084097795(ListBuilder $this) {
        return $this.modCount;
    }

    public static final /* synthetic */ boolean access$isReadOnly$p(ListBuilder $this) {
        return $this.isReadOnly;
    }

    public static final /* synthetic */ Object access$removeAtInternal(ListBuilder $this, int i) {
        return $this.removeAtInternal(i);
    }

    public static final /* synthetic */ void access$removeRangeInternal(ListBuilder $this, int rangeOffset, int rangeLength) {
        $this.removeRangeInternal(rangeOffset, rangeLength);
    }

    public static final /* synthetic */ int access$retainOrRemoveAllInternal(ListBuilder $this, int rangeOffset, int rangeLength, Collection elements, boolean retain) {
        return $this.retainOrRemoveAllInternal(rangeOffset, rangeLength, elements, retain);
    }

    static {
        Companion = new Companion(null);
        ListBuilder it = new ListBuilder(0);
        it.isReadOnly = true;
        Empty = it;
    }

    public final List<E> build() {
        checkIsMutable();
        this.isReadOnly = true;
        if (this.length <= 0) goto L6;
        return this;
    L6:
        return Empty;
    }

    private final Object writeReplace() {
        if (this.isReadOnly == false) goto L7;
        return new SerializedCollection(this, 0);
    L7:
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (this.length != 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
        return this.backing[index];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int index, E r4) {
        checkIsMutable();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
        E r0 = this.backing[index];
        this.backing[index] = r4;
        return r0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i = 0;
    L4:
        if (i >= this.length) goto L9;
        if (Intrinsics.areEqual(this.backing[i], element) == true) goto L7;
        i = i + 1;
        goto L4
    L7:
        return i;
    L9:
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int i = this.length - 1;
    L3:
        if (i < 0) goto L8;
        if (Intrinsics.areEqual(this.backing[i], element) == true) goto L6;
        i = i - 1;
        goto L3
    L6:
        return i;
    L8:
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
        return new Itr(this, index);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r2) {
        checkIsMutable();
        addAtInternal(this.length, r2);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E r4) {
        checkIsMutable();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
        addAtInternal(index, r4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        checkIsMutable();
        int n = r3.size();
        addAllInternal(this.length, r3, n);
        if (n <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> r4) {
        Intrinsics.checkNotNullParameter(r4, "elements");
        checkIsMutable();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length);
        int n = r4.size();
        addAllInternal(index, r4, n);
        if (n <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(0, this.length);
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int index) {
        checkIsMutable();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length);
        return removeAtInternal(index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        checkIsMutable();
        int i = indexOf(element);
        if (i < 0) goto L5;
        removeAt(i);
    L5:
        if (i < 0) goto L7;
        return true;
    L7:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        checkIsMutable();
        if (retainOrRemoveAllInternal(0, this.length, r3, false) <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> r4) {
        Intrinsics.checkNotNullParameter(r4, "elements");
        checkIsMutable();
        if (retainOrRemoveAllInternal(0, this.length, r4, true) > 0) goto L5;
        return false;
    L5:
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.length);
        return new BuilderSubList(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] r5) {
        Intrinsics.checkNotNullParameter(r5, "array");
        int r0 = r5.length;
        int r1 = this.length;
        E[] r2 = this.backing;
        if (r0 >= r1) goto L6;
        T[] r3 = (T[]) Arrays.copyOfRange(r2, 0, this.length, r5.getClass());
        Intrinsics.checkNotNullExpressionValue(r3, "copyOfRange(...)");
        return r3;
    L6:
        ArraysKt.copyInto(r2, r5, 0, 0, this.length);
        return (T[]) CollectionsKt.terminateCollectionToArray(this.length, r5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return ArraysKt.copyOfRange(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object other) {
        if (other != this) goto L4;
    L9:
        return true;
    L4:
        if ((other instanceof List) == true) goto L6;
    L8:
        return false;
    L6:
        if (contentEquals((List) other) == false) goto L8;
        goto L8
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return ListBuilderKt.access$subarrayContentHashCode(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return ListBuilderKt.access$subarrayContentToString(this.backing, 0, this.length, this);
    }

    private final void registerModification() {
        this.modCount++;
    }

    private final void checkIsMutable() {
        if (this.isReadOnly == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    private final void ensureExtraCapacity(int n) {
        ensureCapacityInternal(this.length + n);
    }

    private final void ensureCapacityInternal(int r3) {
        if (r3 < 0) goto L8;
        if (r3 <= this.backing.length) goto L9;
        int r0 = AbstractList.Companion.newCapacity$kotlin_stdlib(this.backing.length, r3);
        this.backing = (E[]) ListBuilderKt.copyOfUninitializedElements(this.backing, r0);
        return;
    L9:
        return;
    L8:
        throw new OutOfMemoryError();
    }

    private final boolean contentEquals(List<?> r4) {
        return ListBuilderKt.access$subarrayContentEquals(this.backing, 0, this.length, r4);
    }

    private final void insertAtInternal(int i, int n) {
        ensureExtraCapacity(n);
        ArraysKt.copyInto(this.backing, this.backing, i + n, i, this.length);
        this.length += n;
    }

    private final void addAtInternal(int i, E r3) {
        registerModification();
        insertAtInternal(i, 1);
        this.backing[i] = r3;
    }

    private final void addAllInternal(int i, Collection<? extends E> r7, int n) {
        registerModification();
        insertAtInternal(i, n);
        int j = 0;
        Iterator<? extends E> r1 = r7.iterator();
    L3:
        if (j >= n) goto L5;
        this.backing[i + j] = r1.next();
        j = j + 1;
        goto L3
    }

    private final E removeAtInternal(int i) {
        registerModification();
        E r0 = this.backing[i];
        ArraysKt.copyInto(this.backing, this.backing, i, i + 1, this.length);
        ListBuilderKt.resetAt(this.backing, this.length - 1);
        this.length--;
        return r0;
    }

    private final void removeRangeInternal(int rangeOffset, int rangeLength) {
        if (rangeLength <= 0) goto L4;
        registerModification();
    L4:
        ArraysKt.copyInto(this.backing, this.backing, rangeOffset, rangeOffset + rangeLength, this.length);
        ListBuilderKt.resetRange(this.backing, this.length - rangeLength, this.length);
        this.length -= rangeLength;
    }

    private final int retainOrRemoveAllInternal(int rangeOffset, int rangeLength, Collection<? extends E> r11, boolean retain) {
        int i = 0;
        int j = 0;
    L3:
        E[] r2 = this.backing;
        if (i >= rangeLength) goto L9;
        if (r11.contains(r2[rangeOffset + i]) == retain) goto L7;
        i = i + 1;
        goto L3
    L7:
        this.backing[j + rangeOffset] = this.backing[i + rangeOffset];
        j = j + 1;
        i = i + 1;
        goto L3
    L9:
        int removed = rangeLength - j;
        ArraysKt.copyInto(r2, this.backing, rangeOffset + j, rangeOffset + rangeLength, this.length);
        ListBuilderKt.resetRange(this.backing, this.length - removed, this.length);
        if (removed <= 0) goto L12;
        registerModification();
    L12:
        this.length -= removed;
        return removed;
    }
}
