package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StringNumberConversions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0002H\u0007¢\u0006\u0002\u0010\t\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\n\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0007¢\u0006\u0002\u0010\f\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¨\u0006\u0015"}, d2 = {"toByteOrNull", "", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "numberFormatError", "", "input", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
    public StringsKt__StringNumberConversionsKt() {
    }

    public static final Byte toByteOrNull(String $this$toByteOrNull) {
        Intrinsics.checkNotNullParameter($this$toByteOrNull, "<this>");
        return StringsKt.toByteOrNull($this$toByteOrNull, 10);
    }

    public static final Byte toByteOrNull(String $this$toByteOrNull, int radix) {
        Intrinsics.checkNotNullParameter($this$toByteOrNull, "<this>");
        Integer r0 = StringsKt.toIntOrNull($this$toByteOrNull, radix);
        if (r0 == null) goto L12;
        int r1 = r0.intValue();
        if (r1 >= (-128)) goto L7;
    L11:
        return null;
    L7:
        if (r1 > 127) goto L11;
        return Byte.valueOf((byte) r1);
    L12:
        return null;
    }

    public static final Short toShortOrNull(String $this$toShortOrNull) {
        Intrinsics.checkNotNullParameter($this$toShortOrNull, "<this>");
        return StringsKt.toShortOrNull($this$toShortOrNull, 10);
    }

    public static final Short toShortOrNull(String $this$toShortOrNull, int radix) {
        Intrinsics.checkNotNullParameter($this$toShortOrNull, "<this>");
        Integer r0 = StringsKt.toIntOrNull($this$toShortOrNull, radix);
        if (r0 == null) goto L12;
        int r1 = r0.intValue();
        if (r1 >= (-32768)) goto L7;
    L11:
        return null;
    L7:
        if (r1 > 32767) goto L11;
        return Short.valueOf((short) r1);
    L12:
        return null;
    }

    public static final Integer toIntOrNull(String $this$toIntOrNull) {
        Intrinsics.checkNotNullParameter($this$toIntOrNull, "<this>");
        return StringsKt.toIntOrNull($this$toIntOrNull, 10);
    }

    public static final Integer toIntOrNull(String $this$toIntOrNull, int radix) {
        Intrinsics.checkNotNullParameter($this$toIntOrNull, "<this>");
        CharsKt.checkRadix(radix);
        int length = $this$toIntOrNull.length();
        if (length != 0) goto L5;
        return null;
    L5:
        char firstChar = $this$toIntOrNull.charAt(0);
        if (Intrinsics.compare(firstChar, 48) < 0) goto L8;
        int start = 0;
        boolean isNegative = false;
        int limit = -2147483647;
    L16:
        int limitBeforeMul = -59652323;
        int result = 0;
        int i = start;
    L17:
        if (i >= length) goto L31;
        int digit = CharsKt.digitOf($this$toIntOrNull.charAt(i), radix);
        if (digit < 0) goto L20;
        if (result >= limitBeforeMul) goto L27;
        if (limitBeforeMul != (-59652323)) goto L26;
        limitBeforeMul = limit / radix;
        if (result >= limitBeforeMul) goto L27;
        return null;
    L26:
        return null;
    L27:
        int result2 = result * radix;
        if (result2 < (limit + digit)) goto L29;
        result = result2 - digit;
        i = i + 1;
        goto L17
    L29:
        return null;
    L20:
        return null;
    L31:
        if (isNegative == false) goto L34;
        return Integer.valueOf(result);
    L34:
        return Integer.valueOf(-result);
    L8:
        if (length != 1) goto L10;
        return null;
    L10:
        start = 1;
        switch(firstChar) {
            case 43: goto L14;
            case 44: goto L12;
            case 45: goto L13;
            default: goto L12;
        };
    L12:
        return null;
    L13:
        isNegative = true;
        limit = Integer.MIN_VALUE;
        goto L16
    L14:
        isNegative = false;
        limit = -2147483647;
        goto L16
    }

    public static final Long toLongOrNull(String $this$toLongOrNull) {
        Intrinsics.checkNotNullParameter($this$toLongOrNull, "<this>");
        return StringsKt.toLongOrNull($this$toLongOrNull, 10);
    }

    public static final Long toLongOrNull(String $this$toLongOrNull, int radix) {
        Intrinsics.checkNotNullParameter($this$toLongOrNull, "<this>");
        CharsKt.checkRadix(radix);
        int length = $this$toLongOrNull.length();
        Long r3 = null;
        if (length != 0) goto L5;
        return null;
    L5:
        char firstChar = $this$toLongOrNull.charAt(0);
        if (Intrinsics.compare(firstChar, 48) < 0) goto L8;
        int start = 0;
        boolean isNegative = false;
        long limit = -9223372036854775807L;
    L16:
        long limitBeforeMul = -256204778801521550L;
        long result = 0;
        int i = start;
    L17:
        if (i >= length) goto L36;
        Long r16 = r3;
        int digit = CharsKt.digitOf($this$toLongOrNull.charAt(i), radix);
        if (digit < 0) goto L20;
        if (result >= limitBeforeMul) goto L31;
        if (limitBeforeMul != (-256204778801521550L)) goto L29;
        long limitBeforeMul2 = limit / ((long) radix);
        if (result < limitBeforeMul2) goto L27;
        limitBeforeMul = limitBeforeMul2;
        goto L31
    L27:
        return r16;
    L29:
        return r16;
    L31:
        long result2 = result * ((long) radix);
        if (result2 < (((long) digit) + limit)) goto L33;
        result = result2 - ((long) digit);
        i = i + 1;
        r3 = r16;
        start = start;
        isNegative = isNegative;
        goto L17
    L33:
        return r16;
    L20:
        return r16;
    L36:
        if (isNegative == false) goto L39;
        return Long.valueOf(result);
    L39:
        return Long.valueOf(-result);
    L8:
        if (length != 1) goto L10;
        return null;
    L10:
        start = 1;
        switch(firstChar) {
            case 43: goto L14;
            case 44: goto L12;
            case 45: goto L13;
            default: goto L12;
        };
    L12:
        return null;
    L13:
        isNegative = true;
        limit = Long.MIN_VALUE;
        goto L16
    L14:
        isNegative = false;
        limit = -9223372036854775807L;
        goto L16
    }

    public static final Void numberFormatError(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }
}
