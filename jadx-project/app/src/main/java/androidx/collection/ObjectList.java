package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0017J:\u0010\u0016\u001a\u00020\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH&J\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0019\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\u0010#J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000$J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eJ\u0006\u0010%\u001a\u00020\u0004J:\u0010%\u001a\u00020\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0015\u0010&\u001a\u00028\u00002\b\b\u0001\u0010'\u001a\u00020\u0004¢\u0006\u0002\u0010(J>\u0010)\u001a\u00028\u00002\b\b\u0001\u0010'\u001a\u00020\u00042!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u000b\u0010.\u001a\u00028\u0000¢\u0006\u0002\u0010/J?\u0010.\u001a\u00028\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0010\u00101\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u0010/JA\u00101\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100Jb\u00102\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H326\u00105\u001a2\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H306H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00108Jw\u00109\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32K\u00105\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H30:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010;Jb\u0010<\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H326\u00105\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002H306H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00108Jw\u0010=\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32K\u00105\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002H30:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010;J:\u0010>\u001a\u00020?2!\u0010@\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?0\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010A\u001a\u00020?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?06H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010B\u001a\u00020?2!\u0010@\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?0\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010C\u001a\u00020?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?06H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u0010D\u001a\u00028\u00002\b\b\u0001\u0010'\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0002\u0010(J\b\u0010E\u001a\u00020\u0004H\u0016J\u0013\u0010F\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010GJ:\u0010H\u001a\u00020\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010I\u001a\u00020\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010J\u001a\u00020\u0017J\u0006\u0010K\u001a\u00020\u0017JR\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020O2\b\b\u0002\u0010Q\u001a\u00020O2\b\b\u0002\u0010R\u001a\u00020\u00042\b\b\u0002\u0010S\u001a\u00020O2\u0016\b\u0002\u0010T\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020O\u0018\u00010\u0019H\u0007J\u000b\u0010U\u001a\u00028\u0000¢\u0006\u0002\u0010/J?\u0010U\u001a\u00028\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0013\u0010V\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010GJ\u0010\u0010W\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u0010/JA\u0010W\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0006\u0010X\u001a\u00020\u0017J:\u0010Y\u001a\u00020\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0015\u0010Z\u001a\u00020?2\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0002\b[J\b\u0010\\\u001a\u00020MH\u0016R\u0018\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\f\u0012\u0004\b\u000b\u0010\bR\u0012\u0010\r\u001a\u00020\u000e8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u00048Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0082\u0001\u0001]\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006^"}, d2 = {"Landroidx/collection/ObjectList;", "E", "", "initialCapacity", "", "(I)V", "_size", "get_size$annotations", "()V", "content", "", "getContent$annotations", "[Ljava/lang/Object;", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "size", "getSize", "any", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "asList", "", "contains", "(Ljava/lang/Object;)Z", "containsAll", "elements", "([Ljava/lang/Object;)Z", "", "count", "elementAt", "index", "(I)Ljava/lang/Object;", "elementAtOrElse", "defaultValue", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "equals", "other", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "last", "lastIndexOf", "lastOrNull", "none", "reversedAny", "throwIndexOutOfBoundsExclusiveException", "throwIndexOutOfBoundsExclusiveException$collection", "toString", "Landroidx/collection/MutableObjectList;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    public /* synthetic */ ObjectList(int r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public abstract List<E> asList();

    private ObjectList(int initialCapacity) {
        if (initialCapacity != 0) goto L5;
        Object[] r0 = ObjectListKt.access$getEmptyArray$p();
    L6:
        this.content = r0;
        return;
    L5:
        r0 = new Object[initialCapacity];
        goto L6
    }

    public final int getSize() {
        return this._size;
    }

    public final int getLastIndex() {
        return this._size - 1;
    }

    public final IntRange getIndices() {
        return RangesKt.until(0, this._size);
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean any(Function1<? super E, Boolean> r10) {
        Intrinsics.checkNotNullParameter(r10, "predicate");
        Object[] content$iv = this.content;
        int i$iv = 0;
        int r5 = this._size;
    L3:
        if (i$iv >= r5) goto L9;
        Object it = content$iv[i$iv];
        if (r10.invoke(it).booleanValue() == true) goto L6;
        i$iv = i$iv + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public final boolean reversedAny(Function1<? super E, Boolean> r10) {
        Intrinsics.checkNotNullParameter(r10, "predicate");
        Object[] content$iv = this.content;
        int i$iv = this._size - 1;
    L4:
        if ((-1) >= i$iv) goto L9;
        Object it = content$iv[i$iv];
        if (r10.invoke(it).booleanValue() == true) goto L7;
        i$iv = i$iv - 1;
        goto L4
    L7:
        return true;
    L9:
        return false;
    }

    public final boolean contains(E r2) {
        if (indexOf(r2) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean containsAll(E[] r4) {
        Intrinsics.checkNotNullParameter(r4, "elements");
        int i = 0;
        int r1 = r4.length;
    L3:
        if (i >= r1) goto L9;
        if (contains(r4[i]) == false) goto L6;
        i = i + 1;
        goto L3
    L6:
        return false;
    L9:
        return true;
    }

    public final boolean containsAll(List<? extends E> r4) {
        Intrinsics.checkNotNullParameter(r4, "elements");
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

    public final boolean containsAll(Iterable<? extends E> r8) {
        Intrinsics.checkNotNullParameter(r8, "elements");
        Iterator<? extends E> r2 = r8.iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        if (contains(r2.next()) == true) goto L4;
        return false;
    L10:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> r9) {
        Intrinsics.checkNotNullParameter(r9, "elements");
        Object[] content$iv = r9.content;
        int i$iv = 0;
        int r4 = r9._size;
    L3:
        if (i$iv >= r4) goto L9;
        Object element = content$iv[i$iv];
        if (contains(element) == false) goto L6;
        i$iv = i$iv + 1;
        goto L3
    L6:
        return false;
    L9:
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final int count(Function1<? super E, Boolean> r11) {
        Intrinsics.checkNotNullParameter(r11, "predicate");
        int count = 0;
        Object[] content$iv = this.content;
        int i$iv = 0;
        int r6 = this._size;
    L3:
        if (i$iv >= r6) goto L9;
        Object it = content$iv[i$iv];
        if (r11.invoke(it).booleanValue() == false) goto L7;
        count = count + 1;
    L7:
        i$iv = i$iv + 1;
        goto L3
    L9:
        return count;
    }

    public final E first() {
        if (isEmpty() == false) goto L6;
        RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
    L6:
        return (E) this.content[0];
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [E, java.lang.Object] */
    public final E first(Function1<? super E, Boolean> r10) {
        Intrinsics.checkNotNullParameter(r10, "predicate");
        Object[] r3 = this.content;
        int r4 = 0;
        int r5 = this._size;
    L3:
        if (r4 >= r5) goto L9;
        ?? r6 = (Object) r3[r4];
        if (r10.invoke(r6).booleanValue() == true) goto L6;
        r4 = r4 + 1;
        goto L3
    L6:
        return r6;
    L9:
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final E firstOrNull() {
        if (isEmpty() == false) goto L6;
        return null;
    L6:
        return get(0);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [E, java.lang.Object] */
    public final E firstOrNull(Function1<? super E, Boolean> r10) {
        Intrinsics.checkNotNullParameter(r10, "predicate");
        Object[] r3 = this.content;
        int r4 = 0;
        int r5 = this._size;
    L3:
        if (r4 >= r5) goto L8;
        ?? r6 = (Object) r3[r4];
        if (r10.invoke(r6).booleanValue() == true) goto L6;
        r4 = r4 + 1;
        goto L3
    L6:
        return r6;
    L8:
        return null;
    }

    public final <R> R fold(R r10, Function2<? super R, ? super E, ? extends R> r11) {
        Intrinsics.checkNotNullParameter(r11, "operation");
        R r1 = r10;
        Object[] r4 = this.content;
        int r5 = 0;
        int r6 = this._size;
    L3:
        if (r5 >= r6) goto L6;
        R r2 = r1;
        r1 = r11.invoke(r2, r4[r5]);
        r5 = r5 + 1;
        goto L3
    L6:
        return r1;
    }

    public final <R> R foldIndexed(R r12, Function3<? super Integer, ? super R, ? super E, ? extends R> r13) {
        Intrinsics.checkNotNullParameter(r13, "operation");
        R r1 = r12;
        Object[] r4 = this.content;
        int r5 = 0;
        int r6 = this._size;
    L3:
        if (r5 >= r6) goto L6;
        Object r7 = r4[r5];
        r1 = r13.invoke(Integer.valueOf(r5), r1, r7);
        r5 = r5 + 1;
        goto L3
    L6:
        return r1;
    }

    public final <R> R foldRight(R r9, Function2<? super E, ? super R, ? extends R> r10) {
        Intrinsics.checkNotNullParameter(r10, "operation");
        R r1 = r9;
        Object[] r4 = this.content;
        int r5 = this._size;
    L3:
        r5 = r5 - 1;
        if ((-1) >= r5) goto L7;
        r1 = r10.invoke(r4[r5], r1);
        goto L3
    L7:
        return r1;
    }

    public final <R> R foldRightIndexed(R r11, Function3<? super Integer, ? super E, ? super R, ? extends R> r12) {
        Intrinsics.checkNotNullParameter(r12, "operation");
        R r1 = r11;
        Object[] r4 = this.content;
        int r5 = this._size;
    L3:
        r5 = r5 - 1;
        if ((-1) >= r5) goto L7;
        r1 = r12.invoke(Integer.valueOf(r5), r4[r5], r1);
        goto L3
    L7:
        return r1;
    }

    public final void forEach(Function1<? super E, Unit> r6) {
        Intrinsics.checkNotNullParameter(r6, "block");
        Object[] content = this.content;
        int i = 0;
        int r3 = this._size;
    L3:
        if (i >= r3) goto L5;
        r6.invoke(content[i]);
        i = i + 1;
        goto L3
    }

    public final void forEachIndexed(Function2<? super Integer, ? super E, Unit> r7) {
        Intrinsics.checkNotNullParameter(r7, "block");
        Object[] content = this.content;
        int i = 0;
        int r3 = this._size;
    L3:
        if (i >= r3) goto L5;
        r7.invoke(Integer.valueOf(i), content[i]);
        i = i + 1;
        goto L3
    }

    public final void forEachReversed(Function1<? super E, Unit> r5) {
        Intrinsics.checkNotNullParameter(r5, "block");
        Object[] content = this.content;
        int i = this._size;
    L3:
        i = i - 1;
        if ((-1) >= i) goto L6;
        r5.invoke(content[i]);
        goto L3
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super E, Unit> r6) {
        Intrinsics.checkNotNullParameter(r6, "block");
        Object[] content = this.content;
        int i = this._size;
    L3:
        i = i - 1;
        if ((-1) >= i) goto L6;
        r6.invoke(Integer.valueOf(i), content[i]);
        goto L3
    }

    public final E get(int r3) {
        boolean r0 = false;
        if (r3 >= 0) goto L5;
    L7:
        if (r0 == true) goto L10;
        throwIndexOutOfBoundsExclusiveException$collection(r3);
    L10:
        return (E) this.content[r3];
    L5:
        if (r3 >= this._size) goto L7;
        r0 = true;
        goto L7
    }

    public final E elementAt(int r3) {
        boolean r0 = false;
        if (r3 >= 0) goto L5;
    L7:
        if (r0 == true) goto L10;
        throwIndexOutOfBoundsExclusiveException$collection(r3);
    L10:
        return (E) this.content[r3];
    L5:
        if (r3 >= this._size) goto L7;
        r0 = true;
        goto L7
    }

    public final void throwIndexOutOfBoundsExclusiveException$collection(int index) {
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index " + index + " must be in 0.." + (this._size - 1));
    }

    public final E elementAtOrElse(int r4, Function1<? super Integer, ? extends E> r5) {
        Intrinsics.checkNotNullParameter(r5, "defaultValue");
        boolean r1 = false;
        if (r4 >= 0) goto L5;
    L7:
        if (r1 == true) goto L11;
        return r5.invoke(Integer.valueOf(r4));
    L11:
        return (E) this.content[r4];
    L5:
        if (r4 >= this._size) goto L7;
        r1 = true;
        goto L7
    }

    public final int indexOf(E r10) {
        if (r10 != null) goto L10;
        Object[] content$iv = this.content;
        int i$iv = 0;
        int r4 = this._size;
    L4:
        if (i$iv >= r4) goto L17;
        Object item = content$iv[i$iv];
        int i = i$iv;
        if (item == null) goto L7;
        i$iv = i$iv + 1;
        goto L4
    L7:
        return i;
    L17:
        return -1;
    L10:
        Object[] content$iv2 = this.content;
        int i$iv2 = 0;
        int r5 = this._size;
    L11:
        if (i$iv2 >= r5) goto L23;
        Object item2 = content$iv2[i$iv2];
        int i2 = i$iv2;
        if (r10.equals(item2) == true) goto L14;
        i$iv2 = i$iv2 + 1;
        goto L11
    L14:
        return i2;
    L23:
        return -1;
    }

    public final int indexOfFirst(Function1<? super E, Boolean> r11) {
        Intrinsics.checkNotNullParameter(r11, "predicate");
        Object[] content$iv = this.content;
        int i$iv = 0;
        int r5 = this._size;
    L3:
        if (i$iv >= r5) goto L8;
        Object element = content$iv[i$iv];
        int i = i$iv;
        if (r11.invoke(element).booleanValue() == true) goto L6;
        i$iv = i$iv + 1;
        goto L3
    L6:
        return i;
    L8:
        return -1;
    }

    public final int indexOfLast(Function1<? super E, Boolean> r10) {
        Intrinsics.checkNotNullParameter(r10, "predicate");
        Object[] content$iv = this.content;
        int i$iv = this._size;
    L3:
        i$iv = i$iv - 1;
        if ((-1) >= i$iv) goto L10;
        Object element = content$iv[i$iv];
        if (r10.invoke(element).booleanValue() == false) goto L3;
        return i$iv;
    L10:
        return -1;
    }

    public final boolean isEmpty() {
        if (this._size != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isNotEmpty() {
        if (this._size == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final E last() {
        if (isEmpty() == false) goto L6;
        RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
    L6:
        return (E) this.content[this._size - 1];
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [E, java.lang.Object] */
    public final E last(Function1<? super E, Boolean> r9) {
        Intrinsics.checkNotNullParameter(r9, "predicate");
        Object[] r3 = this.content;
        int r4 = this._size;
    L3:
        r4 = r4 - 1;
        if ((-1) >= r4) goto L10;
        ?? r5 = (Object) r3[r4];
        if (r9.invoke(r5).booleanValue() == false) goto L3;
        return r5;
    L10:
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final E lastOrNull() {
        if (isEmpty() == false) goto L6;
        return null;
    L6:
        return (E) this.content[this._size - 1];
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [E, java.lang.Object] */
    public final E lastOrNull(Function1<? super E, Boolean> r9) {
        Intrinsics.checkNotNullParameter(r9, "predicate");
        Object[] r3 = this.content;
        int r4 = this._size;
    L3:
        r4 = r4 - 1;
        if ((-1) >= r4) goto L9;
        ?? r5 = (Object) r3[r4];
        if (r9.invoke(r5).booleanValue() == false) goto L3;
        return r5;
    L9:
        return null;
    }

    public final int lastIndexOf(E r10) {
        if (r10 != null) goto L11;
        Object[] content$iv = this.content;
        int i$iv = this._size - 1;
    L5:
        if ((-1) >= i$iv) goto L18;
        Object item = content$iv[i$iv];
        int i = i$iv;
        if (item == null) goto L8;
        i$iv = i$iv - 1;
        goto L5
    L8:
        return i;
    L18:
        return -1;
    L11:
        Object[] content$iv2 = this.content;
        int i$iv2 = this._size - 1;
    L12:
        if ((-1) >= i$iv2) goto L18;
        Object item2 = content$iv2[i$iv2];
        int i2 = i$iv2;
        if (r10.equals(item2) == true) goto L15;
        i$iv2 = i$iv2 - 1;
        goto L12
    L15:
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(ObjectList r1, CharSequence r2, CharSequence r3, CharSequence r4, int r5, CharSequence r6, Function1 r7, int r8, Object r9) {
        if (r9 != null) goto L25;
        if ((r8 & 1) == 0) goto L7;
    L7:
        if ((r8 & 2) == 0) goto L10;
    L10:
        if ((r8 & 4) == 0) goto L13;
    L13:
        if ((r8 & 8) == 0) goto L16;
        r5 = -1;
    L16:
        if ((r8 & 16) == 0) goto L19;
    L19:
        if ((r8 & 32) == 0) goto L21;
        Function1 r10 = null;
    L22:
        CharSequence r11 = r6;
        CharSequence r12 = r4;
        return r1.joinToString(r2, r3, r12, r5, r11, r10);
    L21:
        r10 = r7;
        goto L22
    L25:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super E, ? extends CharSequence> r23) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder $this$joinToString_u24lambda_u2437 = new StringBuilder();
        $this$joinToString_u24lambda_u2437.append(prefix);
        Object[] content$iv = this.content;
        int i$iv = 0;
        int r12 = this._size;
    L3:
        if (i$iv >= r12) goto L13;
        Object element = content$iv[i$iv];
        int index = i$iv;
        if (index == limit) goto L6;
        if (index == 0) goto L9;
        $this$joinToString_u24lambda_u2437.append(r0);
    L9:
        if (r23 != null) goto L11;
        $this$joinToString_u24lambda_u2437.append(element);
    L12:
        i$iv = i$iv + 1;
        r0 = separator;
        goto L3
    L11:
        $this$joinToString_u24lambda_u2437.append(r23.invoke(element));
        goto L12
    L6:
        $this$joinToString_u24lambda_u2437.append(truncated);
    L14:
        String r1 = $this$joinToString_u24lambda_u2437.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L13:
        $this$joinToString_u24lambda_u2437.append(postfix);
        goto L14
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, limit, null, null, 48, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, limit, truncated, null, 32, null);
    }

    public int hashCode() {
        int hashCode = 0;
        Object[] content$iv = this.content;
        int i$iv = 0;
        int r5 = this._size;
    L3:
        if (i$iv >= r5) goto L10;
        Object element = content$iv[i$iv];
        if (element == null) goto L7;
        int r8 = element.hashCode();
    L8:
        hashCode = hashCode + (r8 * 31);
        i$iv = i$iv + 1;
        goto L3
    L7:
        r8 = 0;
        goto L8
    L10:
        return hashCode;
    }

    public boolean equals(Object other) {
        if ((other instanceof ObjectList) == true) goto L5;
    L16:
        return false;
    L5:
        if (((ObjectList) other)._size != this._size) goto L16;
        Object[] content = this.content;
        Object[] otherContent = ((ObjectList) other).content;
        IntRange r3 = RangesKt.until(0, this._size);
        int i = r3.getFirst();
        int r4 = r3.getLast();
        if (i <= r4) goto L10;
        return true;
    L10:
        if (Intrinsics.areEqual(content[i], otherContent[i]) == false) goto L11;
        if (i == r4) goto L19;
        i = i + 1;
        goto L10
    L19:
        return true;
    L11:
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new AnonymousClass1(this), 25, null);
    }
}
