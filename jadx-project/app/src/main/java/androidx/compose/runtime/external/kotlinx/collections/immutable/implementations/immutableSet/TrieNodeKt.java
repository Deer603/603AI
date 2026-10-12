package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a7\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\"\u0004\b\u0000\u0010\u000b*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\f\u001a\u0002H\u000bH\u0002¢\u0006\u0002\u0010\r\u001aL\u0010\u000e\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00130\u0012H\u0082\b¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"LOG_MAX_BRANCHING_FACTOR", "", "MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "indexSegment", "index", "shift", "addElementAtIndex", "", "", "E", "element", "([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;", "filterTo", "newArray", "newArrayOffset", "predicate", "Lkotlin/Function1;", "", "([Ljava/lang/Object;[Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)I", "removeCellAtIndex", "cellIndex", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final /* synthetic */ Object[] access$addElementAtIndex(Object[] $receiver, int index, Object element) {
        return addElementAtIndex($receiver, index, element);
    }

    public static final /* synthetic */ Object[] access$removeCellAtIndex(Object[] $receiver, int cellIndex) {
        return removeCellAtIndex($receiver, cellIndex);
    }

    public static final int indexSegment(int index, int shift) {
        return (index >> shift) & 31;
    }

    private static final <E> Object[] addElementAtIndex(Object[] $this$addElementAtIndex, int index, E r10) {
        Object[] newBuffer = new Object[$this$addElementAtIndex.length + 1];
        ArraysKt.copyInto$default($this$addElementAtIndex, newBuffer, 0, 0, index, 6, null);
        ArraysKt.copyInto($this$addElementAtIndex, newBuffer, index + 1, index, $this$addElementAtIndex.length);
        newBuffer[index] = r10;
        return newBuffer;
    }

    private static final Object[] removeCellAtIndex(Object[] $this$removeCellAtIndex, int cellIndex) {
        Object[] newBuffer = new Object[$this$removeCellAtIndex.length - 1];
        ArraysKt.copyInto$default($this$removeCellAtIndex, newBuffer, 0, 0, cellIndex, 6, null);
        ArraysKt.copyInto($this$removeCellAtIndex, newBuffer, cellIndex, cellIndex + 1, $this$removeCellAtIndex.length);
        return newBuffer;
    }

    static /* synthetic */ int filterTo$default(Object[] $this$filterTo_u24default, Object[] newArray, int newArrayOffset, Function1 predicate, int r10, Object r11) {
        if ((r10 & 2) == 0) goto L6;
        newArrayOffset = 0;
    L6:
        if ((r10 & 4) == 0) goto L8;
        Function1 predicate2 = AnonymousClass1.INSTANCE;
        predicate = predicate2;
    L8:
        int i = 0;
        int j = 0;
    L10:
        if (i >= $this$filterTo_u24default.length) goto L22;
        boolean r1 = false;
        if (j > i) goto L14;
        boolean r3 = true;
    L15:
        CommonFunctionsKt.m3921assert(r3);
        Object e = $this$filterTo_u24default[i];
        if (((Boolean) predicate.invoke(e)).booleanValue() == false) goto L21;
        newArray[newArrayOffset + j] = $this$filterTo_u24default[i];
        j = j + 1;
        if ((newArrayOffset + j) > newArray.length) goto L20;
        r1 = true;
    L20:
        CommonFunctionsKt.m3921assert(r1);
    L21:
        i = i + 1;
        goto L10
    L14:
        r3 = false;
        goto L15
    L22:
        return j;
    }

    private static final int filterTo(Object[] $this$filterTo, Object[] newArray, int newArrayOffset, Function1<Object, Boolean> r11) {
        int i = 0;
        int j = 0;
    L4:
        if (i >= $this$filterTo.length) goto L16;
        boolean r3 = false;
        if (j > i) goto L8;
        boolean r5 = true;
    L9:
        CommonFunctionsKt.m3921assert(r5);
        Object e = $this$filterTo[i];
        if (r11.invoke(e).booleanValue() == false) goto L15;
        newArray[newArrayOffset + j] = $this$filterTo[i];
        j = j + 1;
        if ((newArrayOffset + j) > newArray.length) goto L14;
        r3 = true;
    L14:
        CommonFunctionsKt.m3921assert(r3);
    L15:
        i = i + 1;
        goto L4
    L8:
        r5 = false;
        goto L9
    L16:
        return j;
    }
}
