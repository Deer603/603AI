package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.RuntimeHelpersKt;
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

/* JADX INFO: compiled from: DoubleList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0014\u001a\u00020\u0015H\u0086\bJ:\u0010\u0014\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J$\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u0003H\u0007J\u0011\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0018H\u0086\u0002J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0000J\t\u0010\"\u001a\u00020\u0003H\u0086\bJ:\u0010\"\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0010\u0010#\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020\u0003J9\u0010%\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020\u00032!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00180\u0017H\u0086\bø\u0001\u0000J\u0013\u0010'\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010)\u001a\u00020\u0018J:\u0010)\u001a\u00020\u00182!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001Jb\u0010*\u001a\u0002H+\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001a\u0002H+26\u0010-\u001a2\u0012\u0013\u0012\u0011H+¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H+0.H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00100Jw\u00101\u001a\u0002H+\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001a\u0002H+2K\u0010-\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H+¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H+02H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00103Jb\u00104\u001a\u0002H+\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001a\u0002H+26\u0010-\u001a2\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u0011H+¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(/\u0012\u0004\u0012\u0002H+0.H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00100Jw\u00105\u001a\u0002H+\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001a\u0002H+2K\u0010-\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u0011H+¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(/\u0012\u0004\u0012\u0002H+02H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00103J:\u00106\u001a\u0002072!\u00108\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002070\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u00109\u001a\u00020726\u00108\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002070.H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010:\u001a\u0002072!\u00108\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002070\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010;\u001a\u00020726\u00108\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002070.H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010<\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020\u0003H\u0086\u0002J\b\u0010=\u001a\u00020\u0003H\u0016J\u000e\u0010>\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0018J:\u0010?\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010@\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\t\u0010A\u001a\u00020\u0015H\u0086\bJ\t\u0010B\u001a\u00020\u0015H\u0086\bJ:\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020F2\b\b\u0002\u0010H\u001a\u00020F2\b\b\u0002\u0010I\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020FH\u0007JT\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020F2\b\b\u0002\u0010H\u001a\u00020F2\b\b\u0002\u0010I\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020F2\u0014\b\u0004\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020F0\u0017H\u0087\bø\u0001\u0000J\u0006\u0010L\u001a\u00020\u0018J:\u0010L\u001a\u00020\u00182!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000e\u0010M\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0018J\t\u0010N\u001a\u00020\u0015H\u0086\bJ:\u0010O\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010P\u001a\u00020DH\u0016R\u0018\u0010\u0005\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0007R\u0012\u0010\u000b\u001a\u00020\f8Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0082\u0001\u0001Q\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006R"}, d2 = {"Landroidx/collection/DoubleList;", "", "initialCapacity", "", "(I)V", "_size", "get_size$annotations", "()V", "content", "", "getContent$annotations", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "size", "getSize", "any", "", "predicate", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "binarySearch", "fromIndex", "toIndex", "contains", "containsAll", "elements", "count", "elementAt", "index", "elementAtOrElse", "defaultValue", "equals", "other", "first", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "last", "lastIndexOf", "none", "reversedAny", "toString", "Landroidx/collection/MutableDoubleList;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class DoubleList {
    public int _size;
    public double[] content;

    public /* synthetic */ DoubleList(int r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    private DoubleList(int initialCapacity) {
        if (initialCapacity != 0) goto L5;
        double[] r0 = DoubleSetKt.getEmptyDoubleArray();
    L6:
        this.content = r0;
        return;
    L5:
        r0 = new double[initialCapacity];
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
        if (this._size != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean any() {
        if (this._size == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean any(Function1<? super Double, Boolean> r11) {
        Intrinsics.checkNotNullParameter(r11, "predicate");
        double[] content$iv = this.content;
        int i$iv = 0;
        int r5 = this._size;
    L3:
        if (i$iv >= r5) goto L9;
        double it = content$iv[i$iv];
        if (r11.invoke(Double.valueOf(it)).booleanValue() == true) goto L6;
        i$iv = i$iv + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public final boolean reversedAny(Function1<? super Double, Boolean> r11) {
        Intrinsics.checkNotNullParameter(r11, "predicate");
        double[] content$iv = this.content;
        int i$iv = this._size - 1;
    L4:
        if ((-1) >= i$iv) goto L9;
        double it = content$iv[i$iv];
        if (r11.invoke(Double.valueOf(it)).booleanValue() == true) goto L7;
        i$iv = i$iv - 1;
        goto L4
    L7:
        return true;
    L9:
        return false;
    }

    public final boolean contains(double element) {
        double[] content$iv = this.content;
        int i$iv = 0;
        int r4 = this._size;
    L3:
        boolean r5 = false;
        if (i$iv >= r4) goto L12;
        double it = content$iv[i$iv];
        if (it != element) goto L8;
        r5 = true;
    L8:
        if (r5 == true) goto L9;
        i$iv = i$iv + 1;
        goto L3
    L9:
        return true;
    L12:
        return false;
    }

    public final boolean containsAll(DoubleList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntRange r0 = RangesKt.until(0, elements._size);
        int i = r0.getFirst();
        int r1 = r0.getLast();
        if (i <= r1) goto L5;
        return true;
    L5:
        if (contains(elements.get(i)) == false) goto L6;
        if (i == r1) goto L13;
        i = i + 1;
        goto L5
    L13:
        return true;
    L6:
        return false;
    }

    public final int count() {
        return this._size;
    }

    public final int count(Function1<? super Double, Boolean> r12) {
        Intrinsics.checkNotNullParameter(r12, "predicate");
        int count = 0;
        double[] content$iv = this.content;
        int i$iv = 0;
        int r6 = this._size;
    L3:
        if (i$iv >= r6) goto L9;
        double it = content$iv[i$iv];
        if (r12.invoke(Double.valueOf(it)).booleanValue() == false) goto L7;
        count = count + 1;
    L7:
        i$iv = i$iv + 1;
        goto L3
    L9:
        return count;
    }

    public final double first() {
        if (this._size != 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L9;
        RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
    L9:
        return this.content[0];
    L5:
        r2 = false;
        goto L6
    }

    public final double first(Function1<? super Double, Boolean> r11) {
        Intrinsics.checkNotNullParameter(r11, "predicate");
        double[] content$iv = this.content;
        int i$iv = 0;
        int r5 = this._size;
    L3:
        if (i$iv >= r5) goto L9;
        double item = content$iv[i$iv];
        if (r11.invoke(Double.valueOf(item)).booleanValue() == true) goto L6;
        i$iv = i$iv + 1;
        goto L3
    L6:
        return item;
    L9:
        throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
    }

    public final <R> R fold(R r12, Function2<? super R, ? super Double, ? extends R> r13) {
        Intrinsics.checkNotNullParameter(r13, "operation");
        R r1 = r12;
        double[] r4 = this.content;
        int r5 = 0;
        int r6 = this._size;
    L3:
        if (r5 >= r6) goto L6;
        R r2 = r1;
        r1 = r13.invoke(r2, Double.valueOf(r4[r5]));
        r5 = r5 + 1;
        goto L3
    L6:
        return r1;
    }

    public final <R> R foldIndexed(R r14, Function3<? super Integer, ? super R, ? super Double, ? extends R> r15) {
        Intrinsics.checkNotNullParameter(r15, "operation");
        R r1 = r14;
        double[] r4 = this.content;
        int r5 = 0;
        int r6 = this._size;
    L3:
        if (r5 >= r6) goto L6;
        double r7 = r4[r5];
        R r2 = r1;
        r1 = r15.invoke(Integer.valueOf(r5), r2, Double.valueOf(r7));
        r5 = r5 + 1;
        goto L3
    L6:
        return r1;
    }

    public final <R> R foldRight(R r11, Function2<? super Double, ? super R, ? extends R> r12) {
        Intrinsics.checkNotNullParameter(r12, "operation");
        R r1 = r11;
        double[] r4 = this.content;
        int r5 = this._size;
    L3:
        r5 = r5 - 1;
        if ((-1) >= r5) goto L7;
        r1 = r12.invoke(Double.valueOf(r4[r5]), r1);
        goto L3
    L7:
        return r1;
    }

    public final <R> R foldRightIndexed(R r13, Function3<? super Integer, ? super Double, ? super R, ? extends R> r14) {
        Intrinsics.checkNotNullParameter(r14, "operation");
        R r1 = r13;
        double[] r4 = this.content;
        int r5 = this._size;
    L3:
        r5 = r5 - 1;
        if ((-1) >= r5) goto L7;
        r1 = r14.invoke(Integer.valueOf(r5), Double.valueOf(r4[r5]), r1);
        goto L3
    L7:
        return r1;
    }

    public final void forEach(Function1<? super Double, Unit> r7) {
        Intrinsics.checkNotNullParameter(r7, "block");
        double[] content = this.content;
        int i = 0;
        int r3 = this._size;
    L3:
        if (i >= r3) goto L5;
        r7.invoke(Double.valueOf(content[i]));
        i = i + 1;
        goto L3
    }

    public final void forEachIndexed(Function2<? super Integer, ? super Double, Unit> r8) {
        Intrinsics.checkNotNullParameter(r8, "block");
        double[] content = this.content;
        int i = 0;
        int r3 = this._size;
    L3:
        if (i >= r3) goto L5;
        r8.invoke(Integer.valueOf(i), Double.valueOf(content[i]));
        i = i + 1;
        goto L3
    }

    public final void forEachReversed(Function1<? super Double, Unit> r6) {
        Intrinsics.checkNotNullParameter(r6, "block");
        double[] content = this.content;
        int i = this._size;
    L3:
        i = i - 1;
        if ((-1) >= i) goto L6;
        r6.invoke(Double.valueOf(content[i]));
        goto L3
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super Double, Unit> r7) {
        Intrinsics.checkNotNullParameter(r7, "block");
        double[] content = this.content;
        int i = this._size;
    L3:
        i = i - 1;
        if ((-1) >= i) goto L6;
        r7.invoke(Integer.valueOf(i), Double.valueOf(content[i]));
        goto L3
    }

    public final double get(int index) {
        boolean r0 = false;
        if (index >= 0) goto L5;
    L7:
        if (r0 == true) goto L10;
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
    L10:
        return this.content[index];
    L5:
        if (index >= this._size) goto L7;
        r0 = true;
        goto L7
    }

    public final double elementAt(int index) {
        boolean r0 = false;
        if (index >= 0) goto L5;
    L7:
        if (r0 == true) goto L10;
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
    L10:
        return this.content[index];
    L5:
        if (index >= this._size) goto L7;
        r0 = true;
        goto L7
    }

    public final double elementAtOrElse(int index, Function1<? super Integer, Double> r6) {
        Intrinsics.checkNotNullParameter(r6, "defaultValue");
        boolean r1 = false;
        if (index >= 0) goto L5;
    L7:
        if (r1 == true) goto L11;
        return r6.invoke(Integer.valueOf(index)).doubleValue();
    L11:
        return this.content[index];
    L5:
        if (index >= this._size) goto L7;
        r1 = true;
        goto L7
    }

    public final int indexOf(double element) {
        double[] content$iv = this.content;
        int i$iv = 0;
        int r4 = this._size;
    L3:
        if (i$iv >= r4) goto L11;
        double item = content$iv[i$iv];
        int i = i$iv;
        if (element != item) goto L7;
        boolean r9 = true;
    L8:
        if (r9 == true) goto L9;
        i$iv = i$iv + 1;
        goto L3
    L9:
        return i;
    L7:
        r9 = false;
        goto L8
    L11:
        return -1;
    }

    public final int indexOfFirst(Function1<? super Double, Boolean> r12) {
        Intrinsics.checkNotNullParameter(r12, "predicate");
        double[] content$iv = this.content;
        int i$iv = 0;
        int r5 = this._size;
    L3:
        if (i$iv >= r5) goto L8;
        double item = content$iv[i$iv];
        int i = i$iv;
        if (r12.invoke(Double.valueOf(item)).booleanValue() == true) goto L6;
        i$iv = i$iv + 1;
        goto L3
    L6:
        return i;
    L8:
        return -1;
    }

    public final int indexOfLast(Function1<? super Double, Boolean> r11) {
        Intrinsics.checkNotNullParameter(r11, "predicate");
        double[] content$iv = this.content;
        int i$iv = this._size;
    L3:
        i$iv = i$iv - 1;
        if ((-1) >= i$iv) goto L10;
        double item = content$iv[i$iv];
        if (r11.invoke(Double.valueOf(item)).booleanValue() == false) goto L3;
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

    public final double last() {
        if (this._size != 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L9;
        RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
    L9:
        return this.content[this._size - 1];
    L5:
        r2 = false;
        goto L6
    }

    public final double last(Function1<? super Double, Boolean> r10) {
        Intrinsics.checkNotNullParameter(r10, "predicate");
        double[] content$iv = this.content;
        int i$iv = this._size;
    L3:
        i$iv = i$iv - 1;
        if ((-1) >= i$iv) goto L10;
        double item = content$iv[i$iv];
        if (r10.invoke(Double.valueOf(item)).booleanValue() == false) goto L3;
        return item;
    L10:
        throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
    }

    public final int lastIndexOf(double element) {
        double[] content$iv = this.content;
        int i$iv = this._size - 1;
    L4:
        if ((-1) >= i$iv) goto L13;
        double item = content$iv[i$iv];
        int i = i$iv;
        if (item != element) goto L8;
        boolean r9 = true;
    L9:
        if (r9 == true) goto L10;
        i$iv = i$iv - 1;
        goto L4
    L10:
        return i;
    L8:
        r9 = false;
        goto L9
    L13:
        return -1;
    }

    public static /* synthetic */ int binarySearch$default(DoubleList this_$iv, int r1, int r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 2) == 0) goto L7;
        r2 = 0;
    L7:
        if ((r4 & 4) == 0) goto L10;
        r3 = this_$iv._size;
    L10:
        return this_$iv.binarySearch(r1, r2, r3);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
    }

    public final int binarySearch(int element, int fromIndex, int toIndex) {
        if (fromIndex < 0) goto L6;
        if (fromIndex >= toIndex) goto L6;
        if (toIndex > this._size) goto L6;
    L7:
        int low = fromIndex;
        int high = toIndex - 1;
    L8:
        if (low > high) goto L17;
        int mid = (low + high) >>> 1;
        double midVal = this.content[mid];
        if (midVal < element) goto L11;
        if (midVal <= element) goto L15;
        high = mid - 1;
        goto L8
    L15:
        return mid;
    L11:
        low = mid + 1;
        goto L8
    L17:
        return -(low + 1);
    L6:
        RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        goto L7
    }

    public final int binarySearch(int element) {
        return binarySearch$default(this, element, 0, 0, 6, null);
    }

    public final int binarySearch(int element, int fromIndex) {
        return binarySearch$default(this, element, fromIndex, 0, 4, null);
    }

    public static /* synthetic */ String joinToString$default(DoubleList r1, CharSequence r2, CharSequence r3, CharSequence r4, int r5, CharSequence r6, int r7, Object r8) {
        if (r8 != null) goto L22;
        if ((r7 & 1) == 0) goto L7;
    L7:
        if ((r7 & 2) == 0) goto L10;
    L10:
        if ((r7 & 4) == 0) goto L13;
    L13:
        if ((r7 & 8) == 0) goto L16;
        r5 = -1;
    L16:
        if ((r7 & 16) == 0) goto L18;
    L19:
        CharSequence r9 = r4;
        int r10 = r5;
        return r1.joinToString(r2, r3, r9, r10, r8);
    L18:
        CharSequence r11 = r6;
        goto L19
    L22:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder $this$joinToString_u24lambda_u2430 = new StringBuilder();
        $this$joinToString_u24lambda_u2430.append(prefix);
        double[] content$iv = this.content;
        int i$iv = 0;
        int r11 = this._size;
    L3:
        if (i$iv >= r11) goto L10;
        double element = content$iv[i$iv];
        int index = i$iv;
        if (index == limit) goto L6;
        if (index == 0) goto L9;
        $this$joinToString_u24lambda_u2430.append(separator);
    L9:
        $this$joinToString_u24lambda_u2430.append(element);
        i$iv = i$iv + 1;
        goto L3
    L6:
        $this$joinToString_u24lambda_u2430.append(truncated);
    L11:
        String r4 = $this$joinToString_u24lambda_u2430.toString();
        Intrinsics.checkNotNullExpressionValue(r4, "toString(...)");
        return r4;
    L10:
        $this$joinToString_u24lambda_u2430.append(postfix);
        goto L11
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, limit, null, 16, null);
    }

    public static /* synthetic */ String joinToString$default(DoubleList $this, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1 transform, int r25, Object r26) {
        if (r26 != null) goto L36;
        if ((r25 & 1) == 0) goto L7;
    L9:
        if ((r25 & 2) == 0) goto L11;
    L13:
        if ((r25 & 4) == 0) goto L15;
    L17:
        if ((r25 & 8) == 0) goto L19;
        int limit2 = -1;
    L21:
        if ((r25 & 16) == 0) goto L23;
    L24:
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder $this$joinToString_u24lambda_u2432 = new StringBuilder();
        $this$joinToString_u24lambda_u2432.append(prefix);
        double[] content$iv = $this.content;
        int i$iv = 0;
        int r14 = $this._size;
    L25:
        if (i$iv >= r14) goto L32;
        double element = content$iv[i$iv];
        int index = i$iv;
        CharSequence prefix2 = prefix;
        if (index == limit2) goto L28;
        if (index == 0) goto L31;
        $this$joinToString_u24lambda_u2432.append(separator);
    L31:
        CharSequence separator2 = separator;
        $this$joinToString_u24lambda_u2432.append((CharSequence) transform.invoke(Double.valueOf(element)));
        i$iv = i$iv + 1;
        CharSequence separator3 = separator2;
        CharSequence prefix3 = prefix2;
        goto L25
    L28:
        $this$joinToString_u24lambda_u2432.append(truncated);
    L33:
        String r1 = $this$joinToString_u24lambda_u2432.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L32:
        $this$joinToString_u24lambda_u2432.append(postfix);
        goto L33
    L23:
        CharSequence truncated2 = truncated;
        goto L24
    L19:
        limit2 = limit;
        goto L21
    L15:
        CharSequence postfix2 = postfix;
        goto L17
    L11:
        prefix3 = prefix;
        goto L13
    L7:
        separator3 = separator;
        goto L9
    L36:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super Double, ? extends CharSequence> r24) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(r24, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2432 = new StringBuilder();
        $this$joinToString_u24lambda_u2432.append(prefix);
        double[] content$iv = this.content;
        int i$iv = 0;
        int r13 = this._size;
    L3:
        if (i$iv >= r13) goto L10;
        double element = content$iv[i$iv];
        int index = i$iv;
        int index2 = $i$f$joinToString;
        if (index == limit) goto L6;
        if (index == 0) goto L9;
        $this$joinToString_u24lambda_u2432.append(r0);
    L9:
        $this$joinToString_u24lambda_u2432.append(r24.invoke(Double.valueOf(element)));
        i$iv = i$iv + 1;
        r0 = separator;
        $i$f$joinToString = index2;
        goto L3
    L6:
        $this$joinToString_u24lambda_u2432.append(truncated);
    L11:
        String r1 = $this$joinToString_u24lambda_u2432.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L10:
        $this$joinToString_u24lambda_u2432.append(postfix);
        goto L11
    }

    public int hashCode() {
        int hashCode = 0;
        double[] content$iv = this.content;
        int i$iv = 0;
        int r5 = this._size;
    L3:
        if (i$iv >= r5) goto L6;
        double element = content$iv[i$iv];
        hashCode = hashCode + (Double.hashCode(element) * 31);
        i$iv = i$iv + 1;
        goto L3
    L6:
        return hashCode;
    }

    public boolean equals(Object other) {
        if ((other instanceof DoubleList) == true) goto L5;
    L18:
        return false;
    L5:
        if (((DoubleList) other)._size != this._size) goto L18;
        double[] content = this.content;
        double[] otherContent = ((DoubleList) other).content;
        IntRange r3 = RangesKt.until(0, this._size);
        int i = r3.getFirst();
        int r4 = r3.getLast();
        if (i <= r4) goto L10;
    L17:
        return true;
    L10:
        if (content[i] != otherContent[i]) goto L12;
        boolean r6 = true;
    L13:
        if (r6 == false) goto L14;
        if (i == r4) goto L17;
        i = i + 1;
        goto L10
    L14:
        return false;
    L12:
        r6 = false;
        goto L13
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, Function1<? super Double, ? extends CharSequence> r24) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(r24, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2432$iv = new StringBuilder();
        $this$joinToString_u24lambda_u2432$iv.append(prefix);
        double[] content$iv$iv = this.content;
        int i$iv$iv = 0;
        int r14 = this._size;
    L3:
        if (i$iv$iv >= r14) goto L10;
        double element$iv = content$iv$iv[i$iv$iv];
        int index$iv = i$iv$iv;
        int index$iv2 = $i$f$joinToString;
        if (index$iv == limit) goto L6;
        if (index$iv == 0) goto L9;
        $this$joinToString_u24lambda_u2432$iv.append(r0);
    L9:
        $this$joinToString_u24lambda_u2432$iv.append(r24.invoke(Double.valueOf(element$iv)));
        i$iv$iv = i$iv$iv + 1;
        r0 = separator;
        $i$f$joinToString = index$iv2;
        goto L3
    L6:
        $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
    L11:
        String r1 = $this$joinToString_u24lambda_u2432$iv.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L10:
        $this$joinToString_u24lambda_u2432$iv.append(postfix);
        goto L11
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function1<? super Double, ? extends CharSequence> r24) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(r24, "transform");
        StringBuilder $this$joinToString_u24lambda_u2432$iv = new StringBuilder();
        $this$joinToString_u24lambda_u2432$iv.append(prefix);
        double[] content$iv$iv = this.content;
        int i$iv$iv = 0;
        int r15 = this._size;
    L3:
        if (i$iv$iv >= r15) goto L10;
        double element$iv = content$iv$iv[i$iv$iv];
        int index$iv = i$iv$iv;
        if (index$iv == (-1)) goto L6;
        if (index$iv == 0) goto L9;
        $this$joinToString_u24lambda_u2432$iv.append(r0);
    L9:
        $this$joinToString_u24lambda_u2432$iv.append(r24.invoke(Double.valueOf(element$iv)));
        i$iv$iv = i$iv$iv + 1;
        r0 = separator;
        goto L3
    L6:
        $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
    L11:
        String r1 = $this$joinToString_u24lambda_u2432$iv.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L10:
        $this$joinToString_u24lambda_u2432$iv.append(postfix);
        goto L11
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function1<? super Double, ? extends CharSequence> r23) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(r23, "transform");
        StringBuilder $this$joinToString_u24lambda_u2432$iv = new StringBuilder();
        $this$joinToString_u24lambda_u2432$iv.append(prefix);
        double[] content$iv$iv = this.content;
        int i$iv$iv = 0;
        int r15 = this._size;
    L3:
        if (i$iv$iv >= r15) goto L10;
        double element$iv = content$iv$iv[i$iv$iv];
        int index$iv = i$iv$iv;
        if (index$iv == (-1)) goto L6;
        if (index$iv == 0) goto L9;
        $this$joinToString_u24lambda_u2432$iv.append(r0);
    L9:
        $this$joinToString_u24lambda_u2432$iv.append(r23.invoke(Double.valueOf(element$iv)));
        i$iv$iv = i$iv$iv + 1;
        r0 = separator;
        goto L3
    L6:
        $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
    L11:
        String r1 = $this$joinToString_u24lambda_u2432$iv.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L10:
        $this$joinToString_u24lambda_u2432$iv.append(postfix$iv);
        goto L11
    }

    public final String joinToString(CharSequence separator, Function1<? super Double, ? extends CharSequence> r23) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(r23, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2432$iv = new StringBuilder();
        $this$joinToString_u24lambda_u2432$iv.append(prefix$iv);
        double[] content$iv$iv = this.content;
        int i$iv$iv = 0;
        int r15 = this._size;
    L3:
        if (i$iv$iv >= r15) goto L10;
        double element$iv = content$iv$iv[i$iv$iv];
        int index$iv = i$iv$iv;
        int $i$f$joinToString2 = $i$f$joinToString;
        if (index$iv == (-1)) goto L6;
        if (index$iv == 0) goto L9;
        $this$joinToString_u24lambda_u2432$iv.append(r0);
    L9:
        $this$joinToString_u24lambda_u2432$iv.append(r23.invoke(Double.valueOf(element$iv)));
        i$iv$iv = i$iv$iv + 1;
        r0 = separator;
        $i$f$joinToString = $i$f$joinToString2;
        goto L3
    L6:
        $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
    L11:
        String r1 = $this$joinToString_u24lambda_u2432$iv.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L10:
        $this$joinToString_u24lambda_u2432$iv.append(postfix$iv);
        goto L11
    }

    public final String joinToString(Function1<? super Double, ? extends CharSequence> r22) {
        Intrinsics.checkNotNullParameter(r22, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2432$iv = new StringBuilder();
        $this$joinToString_u24lambda_u2432$iv.append(prefix$iv);
        double[] content$iv$iv = this.content;
        int i$iv$iv = 0;
        int r15 = this._size;
    L3:
        if (i$iv$iv >= r15) goto L10;
        double element$iv = content$iv$iv[i$iv$iv];
        int index$iv = i$iv$iv;
        int $i$f$joinToString2 = $i$f$joinToString;
        if (index$iv == (-1)) goto L6;
        if (index$iv == 0) goto L9;
        $this$joinToString_u24lambda_u2432$iv.append(separator$iv);
    L9:
        $this$joinToString_u24lambda_u2432$iv.append(r22.invoke(Double.valueOf(element$iv)));
        i$iv$iv = i$iv$iv + 1;
        $i$f$joinToString = $i$f$joinToString2;
        goto L3
    L6:
        $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
    L11:
        String r1 = $this$joinToString_u24lambda_u2432$iv.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L10:
        $this$joinToString_u24lambda_u2432$iv.append(postfix$iv);
        goto L11
    }
}
