package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Arrays.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00030\u0003¢\u0006\u0002\u0010\u0004\u001aG\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00010\u0006\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u00060\u0003¢\u0006\u0002\u0010\b\u001a)\u0010\t\u001a\u00020\n*\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0002\u0010\u000b\u001aH\u0010\f\u001a\u0002H\u0007\"\u0010\b\u0000\u0010\r*\u0006\u0012\u0002\b\u00030\u0003*\u0002H\u0007\"\u0004\b\u0001\u0010\u0007*\u0002H\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0010\u001a5\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u00032\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a?\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2\u0010\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u001fH\u0002¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"flatten", "", "T", "", "([[Ljava/lang/Object;)Ljava/util/List;", "unzip", "Lkotlin/Pair;", "R", "([Lkotlin/Pair;)Lkotlin/Pair;", "isNullOrEmpty", "", "([Ljava/lang/Object;)Z", "ifEmpty", "C", "defaultValue", "Lkotlin/Function0;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "contentDeepEqualsImpl", "other", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepToStringImpl", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringInternal", "", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", "", "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    public ArraysKt__ArraysKt() {
    }

    public static final <T> List<T> flatten(T[][] r7) {
        Intrinsics.checkNotNullParameter(r7, "<this>");
        T[][] r0 = r7;
        int r1 = r0.length;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r1) goto L5;
        Object[] it = r0[r3];
        r4 = r4 + it.length;
        r3 = r3 + 1;
        goto L3
    L5:
        ArrayList result = new ArrayList(r4);
        int r5 = r7.length;
    L6:
        if (r2 >= r5) goto L9;
        CollectionsKt.addAll(result, r7[r2]);
        r2 = r2 + 1;
        goto L6
    L9:
        return result;
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(Pair<? extends T, ? extends R>[] r6) {
        Intrinsics.checkNotNullParameter(r6, "<this>");
        ArrayList listT = new ArrayList(r6.length);
        ArrayList listR = new ArrayList(r6.length);
        int r2 = r6.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L6;
        Pair<? extends T, ? extends R> r4 = r6[r3];
        listT.add(r4.getFirst());
        listR.add(r4.getSecond());
        r3 = r3 + 1;
        goto L3
    L6:
        return TuplesKt.to(listT, listR);
    }

    private static final boolean isNullOrEmpty(Object[] $this$isNullOrEmpty) {
        if ($this$isNullOrEmpty != null) goto L5;
        return true;
    L5:
        if ($this$isNullOrEmpty.length != 0) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == false) goto L11;
        return true;
    L11:
        return false;
    L7:
        r1 = false;
        goto L8
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    private static final Object ifEmpty(Object[] $this$ifEmpty, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if ($this$ifEmpty.length != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return defaultValue.invoke();
    L9:
        return $this$ifEmpty;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean contentDeepEquals(T[] r8, T[] r9) {
        if (r8 != r9) goto L6;
        return true;
    L6:
        if (r8 == 0) goto L116;
        if (r9 == 0) goto L116;
        if (r8.length != r9.length) goto L116;
        int i = 0;
        int r3 = r8.length;
    L12:
        if (i >= r3) goto L115;
        Object[] r4 = r8[i];
        Object[] r5 = r9[i];
        if (r4 == r5) goto L113;
        if (r4 == 0) goto L114;
        if (r5 == 0) goto L114;
        if ((r4 instanceof Object[]) == false) goto L27;
        if ((r5 instanceof Object[]) == false) goto L27;
        if (ArraysKt.contentDeepEquals(r4, r5) == true) goto L113;
        return false;
    L27:
        if ((r4 instanceof byte[]) == false) goto L34;
        if ((r5 instanceof byte[]) == false) goto L34;
        if (Arrays.equals((byte[]) r4, (byte[]) r5) == true) goto L113;
        return false;
    L34:
        if ((r4 instanceof short[]) == false) goto L41;
        if ((r5 instanceof short[]) == false) goto L41;
        if (Arrays.equals((short[]) r4, (short[]) r5) == true) goto L113;
        return false;
    L41:
        if ((r4 instanceof int[]) == false) goto L48;
        if ((r5 instanceof int[]) == false) goto L48;
        if (Arrays.equals((int[]) r4, (int[]) r5) == true) goto L113;
        return false;
    L48:
        if ((r4 instanceof long[]) == false) goto L55;
        if ((r5 instanceof long[]) == false) goto L55;
        if (Arrays.equals((long[]) r4, (long[]) r5) == true) goto L113;
        return false;
    L55:
        if ((r4 instanceof float[]) == false) goto L62;
        if ((r5 instanceof float[]) == false) goto L62;
        if (Arrays.equals((float[]) r4, (float[]) r5) == true) goto L113;
        return false;
    L62:
        if ((r4 instanceof double[]) == false) goto L69;
        if ((r5 instanceof double[]) == false) goto L69;
        if (Arrays.equals((double[]) r4, (double[]) r5) == true) goto L113;
        return false;
    L69:
        if ((r4 instanceof char[]) == false) goto L76;
        if ((r5 instanceof char[]) == false) goto L76;
        if (Arrays.equals((char[]) r4, (char[]) r5) == true) goto L113;
        return false;
    L76:
        if ((r4 instanceof boolean[]) == false) goto L83;
        if ((r5 instanceof boolean[]) == false) goto L83;
        if (Arrays.equals((boolean[]) r4, (boolean[]) r5) == true) goto L113;
        return false;
    L83:
        if ((r4 instanceof UByteArray) == false) goto L90;
        if ((r5 instanceof UByteArray) == false) goto L90;
        if (UArraysKt.m7999contentEqualskV0jMPg(((UByteArray) r4).m7510unboximpl(), ((UByteArray) r5).m7510unboximpl()) == true) goto L113;
        return false;
    L90:
        if ((r4 instanceof UShortArray) == false) goto L97;
        if ((r5 instanceof UShortArray) == false) goto L97;
        if (UArraysKt.m7997contentEqualsFGO6Aew(((UShortArray) r4).m7773unboximpl(), ((UShortArray) r5).m7773unboximpl()) == true) goto L113;
        return false;
    L97:
        if ((r4 instanceof UIntArray) == false) goto L104;
        if ((r5 instanceof UIntArray) == false) goto L104;
        if (UArraysKt.m7998contentEqualsKJPZfPQ(((UIntArray) r4).m7589unboximpl(), ((UIntArray) r5).m7589unboximpl()) == true) goto L113;
        return false;
    L104:
        if ((r4 instanceof ULongArray) == false) goto L111;
        if ((r5 instanceof ULongArray) == false) goto L111;
        if (UArraysKt.m8000contentEqualslec5QzE(((ULongArray) r4).m7668unboximpl(), ((ULongArray) r5).m7668unboximpl()) == true) goto L113;
        return false;
    L111:
        if (Intrinsics.areEqual(r4, r5) == true) goto L113;
        return false;
    L114:
        return false;
    L113:
        i = i + 1;
        goto L12
    L115:
        return true;
    L116:
        return false;
    }

    public static final <T> String contentDeepToString(T[] r5) {
        if (r5 != null) goto L5;
        return "null";
    L5:
        int length = (RangesKt.coerceAtMost(r5.length, 429496729) * 5) + 2;
        StringBuilder $this$contentDeepToStringImpl_u24lambda_u241 = new StringBuilder(length);
        contentDeepToStringInternal$ArraysKt__ArraysKt(r5, $this$contentDeepToStringImpl_u24lambda_u241, new ArrayList());
        return $this$contentDeepToStringImpl_u24lambda_u241.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] r5, StringBuilder r6, List<Object[]> r7) {
        if (r7.contains(r5) == false) goto L6;
        r6.append("[...]");
        return;
    L6:
        r7.add(r5);
        r6.append('[');
        int r0 = 0;
        int r1 = r5.length;
    L7:
        if (r0 >= r1) goto L66;
        if (r0 == 0) goto L10;
        r6.append(", ");
    L10:
        Object[] r2 = r5[r0];
        if (r2 != 0) goto L14;
        r6.append("null");
    L65:
        r0 = r0 + 1;
        goto L7
    L14:
        if ((r2 instanceof Object[]) == false) goto L17;
        contentDeepToStringInternal$ArraysKt__ArraysKt(r2, r6, r7);
        Unit r3 = Unit.INSTANCE;
        goto L65
    L17:
        if ((r2 instanceof byte[]) == false) goto L20;
        String r4 = Arrays.toString((byte[]) r2);
        Intrinsics.checkNotNullExpressionValue(r4, "toString(...)");
        r6.append(r4);
        goto L65
    L20:
        if ((r2 instanceof short[]) == false) goto L23;
        String r8 = Arrays.toString((short[]) r2);
        Intrinsics.checkNotNullExpressionValue(r8, "toString(...)");
        r6.append(r8);
        goto L65
    L23:
        if ((r2 instanceof int[]) == false) goto L26;
        String r9 = Arrays.toString((int[]) r2);
        Intrinsics.checkNotNullExpressionValue(r9, "toString(...)");
        r6.append(r9);
        goto L65
    L26:
        if ((r2 instanceof long[]) == false) goto L29;
        String r10 = Arrays.toString((long[]) r2);
        Intrinsics.checkNotNullExpressionValue(r10, "toString(...)");
        r6.append(r10);
        goto L65
    L29:
        if ((r2 instanceof float[]) == false) goto L32;
        String r11 = Arrays.toString((float[]) r2);
        Intrinsics.checkNotNullExpressionValue(r11, "toString(...)");
        r6.append(r11);
        goto L65
    L32:
        if ((r2 instanceof double[]) == false) goto L35;
        String r12 = Arrays.toString((double[]) r2);
        Intrinsics.checkNotNullExpressionValue(r12, "toString(...)");
        r6.append(r12);
        goto L65
    L35:
        if ((r2 instanceof char[]) == false) goto L38;
        String r13 = Arrays.toString((char[]) r2);
        Intrinsics.checkNotNullExpressionValue(r13, "toString(...)");
        r6.append(r13);
        goto L65
    L38:
        if ((r2 instanceof boolean[]) == false) goto L40;
        String r14 = Arrays.toString((boolean[]) r2);
        Intrinsics.checkNotNullExpressionValue(r14, "toString(...)");
        r6.append(r14);
        goto L65
    L40:
        long[] r15 = null;
        byte[] r16 = null;
        short[] r17 = null;
        int[] r18 = null;
        if ((r2 instanceof UByteArray) == false) goto L47;
        UByteArray r19 = (UByteArray) r2;
        if (r19 == null) goto L45;
        r16 = r19.m7510unboximpl();
    L45:
        r6.append(UArraysKt.m8005contentToString2csIQuQ(r16));
        goto L65
    L47:
        if ((r2 instanceof UShortArray) == false) goto L53;
        UShortArray r20 = (UShortArray) r2;
        if (r20 == null) goto L51;
        r17 = r20.m7773unboximpl();
    L51:
        r6.append(UArraysKt.m8007contentToStringd6D3K8(r17));
        goto L65
    L53:
        if ((r2 instanceof UIntArray) == false) goto L59;
        UIntArray r21 = (UIntArray) r2;
        if (r21 == null) goto L57;
        r18 = r21.m7589unboximpl();
    L57:
        r6.append(UArraysKt.m8006contentToStringXUkPCBk(r18));
        goto L65
    L59:
        if ((r2 instanceof ULongArray) == false) goto L64;
        ULongArray r22 = (ULongArray) r2;
        if (r22 == null) goto L63;
        r15 = r22.m7668unboximpl();
    L63:
        r6.append(UArraysKt.m8008contentToStringuLth9ew(r15));
        goto L65
    L64:
        r6.append(r2.toString());
        goto L65
    L66:
        r6.append(']');
        r7.remove(CollectionsKt.getLastIndex(r7));
    }
}
