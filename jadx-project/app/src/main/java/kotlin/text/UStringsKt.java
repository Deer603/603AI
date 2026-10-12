package kotlin.text;

import androidx.core.internal.view.SupportMenu;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u0007*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0019\u0010\u0013\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\n*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0019\u0010\u0016\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0018\u001a\u0011\u0010\u0019\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u0019\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001b\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007\u001a\u0016\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006 "}, d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toUByteOrNull", "toUShortOrNull", "toUIntOrNull", "toULongOrNull", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class UStringsKt {
    /* JADX INFO: renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final String m8751toStringLxnNnR4(byte $this$toString_u2dLxnNnR4, int radix) {
        String r0 = Integer.toString($this$toString_u2dLxnNnR4 & UByte.MAX_VALUE, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    /* JADX INFO: renamed from: toString-olVBNx4, reason: not valid java name */
    public static final String m8753toStringolVBNx4(short $this$toString_u2dolVBNx4, int radix) {
        String r0 = Integer.toString(65535 & $this$toString_u2dolVBNx4, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    /* JADX INFO: renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final String m8752toStringV7xB4Y4(int $this$toString_u2dV7xB4Y4, int radix) {
        long r1 = ((long) $this$toString_u2dV7xB4Y4) & 4294967295L;
        return UnsignedKt.ulongToString(r1, CharsKt.checkRadix(radix));
    }

    /* JADX INFO: renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m8750toStringJSWoG40(long $this$toString_u2dJSWoG40, int radix) {
        return UnsignedKt.ulongToString($this$toString_u2dJSWoG40, CharsKt.checkRadix(radix));
    }

    public static final byte toUByte(String $this$toUByte) {
        Intrinsics.checkNotNullParameter($this$toUByte, "<this>");
        UByte r0 = toUByteOrNull($this$toUByte);
        if (r0 != null) goto L5;
        StringsKt.numberFormatError($this$toUByte);
        throw new KotlinNothingValueException();
    L5:
        return r0.m7493unboximpl();
    }

    public static final byte toUByte(String $this$toUByte, int radix) {
        Intrinsics.checkNotNullParameter($this$toUByte, "<this>");
        UByte r0 = toUByteOrNull($this$toUByte, radix);
        if (r0 != null) goto L5;
        StringsKt.numberFormatError($this$toUByte);
        throw new KotlinNothingValueException();
    L5:
        return r0.m7493unboximpl();
    }

    public static final short toUShort(String $this$toUShort) {
        Intrinsics.checkNotNullParameter($this$toUShort, "<this>");
        UShort r0 = toUShortOrNull($this$toUShort);
        if (r0 != null) goto L5;
        StringsKt.numberFormatError($this$toUShort);
        throw new KotlinNothingValueException();
    L5:
        return r0.m7756unboximpl();
    }

    public static final short toUShort(String $this$toUShort, int radix) {
        Intrinsics.checkNotNullParameter($this$toUShort, "<this>");
        UShort r0 = toUShortOrNull($this$toUShort, radix);
        if (r0 != null) goto L5;
        StringsKt.numberFormatError($this$toUShort);
        throw new KotlinNothingValueException();
    L5:
        return r0.m7756unboximpl();
    }

    public static final int toUInt(String $this$toUInt) {
        Intrinsics.checkNotNullParameter($this$toUInt, "<this>");
        UInt r0 = toUIntOrNull($this$toUInt);
        if (r0 != null) goto L5;
        StringsKt.numberFormatError($this$toUInt);
        throw new KotlinNothingValueException();
    L5:
        return r0.m7572unboximpl();
    }

    public static final int toUInt(String $this$toUInt, int radix) {
        Intrinsics.checkNotNullParameter($this$toUInt, "<this>");
        UInt r0 = toUIntOrNull($this$toUInt, radix);
        if (r0 != null) goto L5;
        StringsKt.numberFormatError($this$toUInt);
        throw new KotlinNothingValueException();
    L5:
        return r0.m7572unboximpl();
    }

    public static final long toULong(String $this$toULong) {
        Intrinsics.checkNotNullParameter($this$toULong, "<this>");
        ULong r0 = toULongOrNull($this$toULong);
        if (r0 != null) goto L5;
        StringsKt.numberFormatError($this$toULong);
        throw new KotlinNothingValueException();
    L5:
        return r0.m7651unboximpl();
    }

    public static final long toULong(String $this$toULong, int radix) {
        Intrinsics.checkNotNullParameter($this$toULong, "<this>");
        ULong r0 = toULongOrNull($this$toULong, radix);
        if (r0 != null) goto L5;
        StringsKt.numberFormatError($this$toULong);
        throw new KotlinNothingValueException();
    L5:
        return r0.m7651unboximpl();
    }

    public static final UByte toUByteOrNull(String $this$toUByteOrNull) {
        Intrinsics.checkNotNullParameter($this$toUByteOrNull, "<this>");
        return toUByteOrNull($this$toUByteOrNull, 10);
    }

    public static final UByte toUByteOrNull(String $this$toUByteOrNull, int radix) {
        Intrinsics.checkNotNullParameter($this$toUByteOrNull, "<this>");
        UInt r0 = toUIntOrNull($this$toUByteOrNull, radix);
        if (r0 == null) goto L9;
        int r1 = r0.m7572unboximpl();
        if (Integer.compareUnsigned(r1, UInt.m7520constructorimpl(255)) <= 0) goto L8;
        return null;
    L8:
        return UByte.m7437boximpl(UByte.m7443constructorimpl((byte) r1));
    L9:
        return null;
    }

    public static final UShort toUShortOrNull(String $this$toUShortOrNull) {
        Intrinsics.checkNotNullParameter($this$toUShortOrNull, "<this>");
        return toUShortOrNull($this$toUShortOrNull, 10);
    }

    public static final UShort toUShortOrNull(String $this$toUShortOrNull, int radix) {
        Intrinsics.checkNotNullParameter($this$toUShortOrNull, "<this>");
        UInt r0 = toUIntOrNull($this$toUShortOrNull, radix);
        if (r0 == null) goto L9;
        int r1 = r0.m7572unboximpl();
        if (Integer.compareUnsigned(r1, UInt.m7520constructorimpl(SupportMenu.USER_MASK)) <= 0) goto L8;
        return null;
    L8:
        return UShort.m7700boximpl(UShort.m7706constructorimpl((short) r1));
    L9:
        return null;
    }

    public static final UInt toUIntOrNull(String $this$toUIntOrNull) {
        Intrinsics.checkNotNullParameter($this$toUIntOrNull, "<this>");
        return toUIntOrNull($this$toUIntOrNull, 10);
    }

    public static final UInt toUIntOrNull(String $this$toUIntOrNull, int radix) {
        Intrinsics.checkNotNullParameter($this$toUIntOrNull, "<this>");
        CharsKt.checkRadix(radix);
        int length = $this$toUIntOrNull.length();
        if (length != 0) goto L5;
        return null;
    L5:
        char firstChar = $this$toUIntOrNull.charAt(0);
        if (Intrinsics.compare(firstChar, 48) < 0) goto L8;
        int start = 0;
    L15:
        int limitBeforeMul = 119304647;
        int uradix = UInt.m7520constructorimpl(radix);
        int result = 0;
        int i = start;
    L16:
        if (i >= length) goto L32;
        int digit = CharsKt.digitOf($this$toUIntOrNull.charAt(i), radix);
        if (digit < 0) goto L19;
        if (Integer.compareUnsigned(result, limitBeforeMul) <= 0) goto L27;
        if (limitBeforeMul != 119304647) goto L26;
        limitBeforeMul = Integer.divideUnsigned(-1, uradix);
        if (Integer.compareUnsigned(result, limitBeforeMul) <= 0) goto L27;
        return null;
    L26:
        return null;
    L27:
        int result2 = UInt.m7520constructorimpl(result * uradix);
        result = UInt.m7520constructorimpl(UInt.m7520constructorimpl(digit) + result2);
        if (Integer.compareUnsigned(result, result2) < 0) goto L29;
        i = i + 1;
        goto L16
    L29:
        return null;
    L19:
        return null;
    L32:
        return UInt.m7514boximpl(result);
    L8:
        if (length != 1) goto L10;
    L13:
        return null;
    L10:
        if (firstChar != '+') goto L13;
        start = 1;
        goto L15
    }

    public static final ULong toULongOrNull(String $this$toULongOrNull) {
        Intrinsics.checkNotNullParameter($this$toULongOrNull, "<this>");
        return toULongOrNull($this$toULongOrNull, 10);
    }

    public static final ULong toULongOrNull(String $this$toULongOrNull, int radix) {
        String r0 = $this$toULongOrNull;
        int r1 = radix;
        Intrinsics.checkNotNullParameter(r0, "<this>");
        CharsKt.checkRadix(r1);
        int length = r0.length();
        if (length != 0) goto L5;
        return null;
    L5:
        char firstChar = r0.charAt(0);
        if (Intrinsics.compare(firstChar, 48) < 0) goto L8;
        int start = 0;
    L15:
        long limitBeforeMul = 512409557603043100L;
        long uradix = ULong.m7599constructorimpl(r1);
        long result = 0;
        int i = start;
    L16:
        if (i >= length) goto L33;
        int length2 = length;
        int digit = CharsKt.digitOf(r0.charAt(i), r1);
        if (digit < 0) goto L19;
        if (Long.compareUnsigned(result, limitBeforeMul) > 0) goto L23;
    L28:
        long result2 = ULong.m7599constructorimpl(result * uradix);
        result = ULong.m7599constructorimpl(ULong.m7599constructorimpl(((long) UInt.m7520constructorimpl(digit)) & 4294967295L) + result2);
        if (Long.compareUnsigned(result, result2) < 0) goto L30;
        i = i + 1;
        r0 = $this$toULongOrNull;
        r1 = radix;
        length = length2;
        goto L16
    L30:
        return null;
    L23:
        if (limitBeforeMul != 512409557603043100L) goto L27;
        limitBeforeMul = Long.divideUnsigned(-1, uradix);
        if (Long.compareUnsigned(result, limitBeforeMul) <= 0) goto L28;
        return null;
    L27:
        return null;
    L19:
        return null;
    L33:
        return ULong.m7593boximpl(result);
    L8:
        if (length != 1) goto L10;
    L13:
        return null;
    L10:
        if (firstChar != '+') goto L13;
        start = 1;
        goto L15
    }
}
