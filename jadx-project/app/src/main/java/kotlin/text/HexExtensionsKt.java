package kotlin.text;

import androidx.collection.SieveCacheKt;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: HexExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0001\n\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010\u000b\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a,\u0010\u0012\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0016\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0017\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0018\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a<\u0010\u0019\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a,\u0010\u0019\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a(\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0002\u001a@\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0000\u001a\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0016\u0010+\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010+\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a&\u0010,\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a&\u0010-\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a&\u0010.\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a$\u0010/\u001a\u00020\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0014\u00100\u001a\u000201*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0002\u001a@\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0000\u001a \u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010H\u0002\u001a \u00108\u001a\u00020*2\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\u0006\u00107\u001a\u00020\u0010H\u0002\u001a\u001c\u00109\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u0002012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010:\u001a\u000201*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010:\u001a\u000201*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020;2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010<\u001a\u00020;*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010<\u001a\u00020;*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010=\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010=\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020*2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010>\u001a\u00020**\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010>\u001a\u00020**\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a$\u0010?\u001a\u00020\u0001*\u00020*2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u0010H\u0002\u001a\u001c\u0010D\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a,\u0010E\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a,\u0010G\u001a\u00020**\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a<\u0010H\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a$\u0010N\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a\u001c\u0010O\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u001c\u0010P\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u001c\u0010Q\u001a\u00020**\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a5\u0010R\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010T\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010U\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0082\b\u001a\u0015\u0010V\u001a\u00020**\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0082\b\u001a,\u0010W\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0010H\u0002\u001a,\u0010Z\u001a\u00020I*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u0001H\u0002\u001a,\u0010[\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\\\u001a\u00020]*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, d2 = {"LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "", "getBYTE_TO_LOWER_CASE_HEX_DIGITS", "()[I", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "HEX_DIGITS_TO_LONG_DECIMAL", "", "toHexString", "", "format", "Lkotlin/text/HexFormat;", "startIndex", "", "endIndex", "toHexStringNoLineAndGroupSeparator", "bytesFormat", "Lkotlin/text/HexFormat$BytesHexFormat;", "byteToDigits", "toHexStringShortByteSeparatorNoPrefixAndSuffix", "toHexStringNoLineAndGroupSeparatorSlowPath", "toHexStringSlowPath", "formatByteAt", "index", "bytePrefix", "byteSuffix", "destination", "", "destinationOffset", "formattedStringLength", "numberOfBytes", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "checkFormatLength", "formatLength", "", "hexToByteArray", "hexToByteArrayNoLineAndGroupSeparator", "hexToByteArrayShortByteSeparatorNoPrefixAndSuffix", "hexToByteArrayNoLineAndGroupSeparatorSlowPath", "hexToByteArraySlowPath", "parseByteAt", "", "parsedByteArrayMaxSize", "stringLength", "charsPerSet", "charsPerElement", "elementsPerSet", "elementSeparatorLength", "wholeElementsPerSet", "checkNewLineAt", "hexToByte", "", "hexToShort", "hexToInt", "hexToLong", "toHexStringImpl", "numberFormat", "Lkotlin/text/HexFormat$NumberHexFormat;", "digits", "bits", "toCharArrayIfNotEmpty", "hexToIntImpl", "typeHexLength", "hexToLongImpl", "checkPrefixSuffixNumberOfDigits", "", "prefix", "suffix", "ignoreCase", "", "checkNumberOfDigits", "checkZeroDigits", "parseInt", "parseLong", "checkContainsAt", "part", "partName", "decimalFromHexDigitAt", "longDecimalFromHexDigitAt", "throwInvalidNumberOfDigits", "specifier", "expected", "throwNotContainedAt", "throwInvalidPrefixSuffix", "throwInvalidDigitAt", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class HexExtensionsKt {
    private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS = null;
    private static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS = null;
    private static final int[] HEX_DIGITS_TO_DECIMAL = null;
    private static final long[] HEX_DIGITS_TO_LONG_DECIMAL = null;
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
        int[] r1 = new int[256];
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r3 >= 256) goto L6;
        r1[r3] = LOWER_CASE_HEX_DIGITS.charAt(r3 & 15) | (LOWER_CASE_HEX_DIGITS.charAt(r3 >> 4) << '\b');
        r3 = r3 + 1;
        goto L4
    L6:
        BYTE_TO_LOWER_CASE_HEX_DIGITS = r1;
        int[] r4 = new int[256];
        int r5 = 0;
    L8:
        if (r5 >= 256) goto L10;
        r4[r5] = UPPER_CASE_HEX_DIGITS.charAt(r5 & 15) | (UPPER_CASE_HEX_DIGITS.charAt(r5 >> 4) << '\b');
        r5 = r5 + 1;
        goto L8
    L10:
        BYTE_TO_UPPER_CASE_HEX_DIGITS = r4;
        int[] $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242 = new int[256];
        int r6 = 0;
    L11:
        if (r6 >= 256) goto L13;
        $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[r6] = -1;
        r6 = r6 + 1;
        goto L11
    L13:
        int index$iv = 0;
        int r10 = 0;
    L15:
        if (r10 >= $this$forEachIndexed$iv.length()) goto L17;
        char item$iv = $this$forEachIndexed$iv.charAt(r10);
        $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[item$iv] = index$iv;
        r10 = r10 + 1;
        index$iv = index$iv + 1;
        goto L15
    L17:
        int index$iv2 = 0;
        int r11 = 0;
    L19:
        if (r11 >= $this$forEachIndexed$iv.length()) goto L21;
        char item$iv2 = $this$forEachIndexed$iv.charAt(r11);
        $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[item$iv2] = index$iv2;
        r11 = r11 + 1;
        index$iv2 = index$iv2 + 1;
        goto L19
    L21:
        HEX_DIGITS_TO_DECIMAL = $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242;
        long[] $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245 = new long[256];
        int r7 = 0;
    L22:
        if (r7 >= 256) goto L24;
        $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245[r7] = -1;
        r7 = r7 + 1;
        goto L22
    L24:
        int index$iv3 = 0;
        int r8 = 0;
    L26:
        if (r8 >= $this$forEachIndexed$iv.length()) goto L28;
        char item$iv3 = $this$forEachIndexed$iv.charAt(r8);
        $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245[item$iv3] = index$iv3;
        r8 = r8 + 1;
        index$iv3 = index$iv3 + 1;
        goto L26
    L28:
        int index$iv4 = 0;
    L30:
        if (r2 >= $this$forEachIndexed$iv.length()) goto L32;
        char item$iv4 = $this$forEachIndexed$iv.charAt(r2);
        $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245[item$iv4] = index$iv4;
        r2 = r2 + 1;
        index$iv4 = index$iv4 + 1;
        goto L30
    L32:
        HEX_DIGITS_TO_LONG_DECIMAL = $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245;
    }

    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
        return BYTE_TO_LOWER_CASE_HEX_DIGITS;
    }

    public static /* synthetic */ String toHexString$default(byte[] r0, HexFormat r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = HexFormat.Companion.getDefault();
    L6:
        return toHexString(r0, r1);
    }

    public static final String toHexString(byte[] $this$toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$toHexString, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString($this$toHexString, 0, $this$toHexString.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] r0, int r1, int r2, HexFormat r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.length;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = HexFormat.Companion.getDefault();
    L12:
        return toHexString(r0, r1, r2, r3);
    }

    public static final String toHexString(byte[] $this$toHexString, int startIndex, int endIndex, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$toHexString, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$toHexString.length);
        if (startIndex != endIndex) goto L7;
        return "";
    L7:
        if (format.getUpperCase() == false) goto L9;
        int[] byteToDigits = BYTE_TO_UPPER_CASE_HEX_DIGITS;
    L10:
        HexFormat.BytesHexFormat bytesFormat = format.getBytes();
        if (bytesFormat.getNoLineAndGroupSeparator$kotlin_stdlib() == false) goto L15;
        return toHexStringNoLineAndGroupSeparator($this$toHexString, startIndex, endIndex, bytesFormat, byteToDigits);
    L15:
        return toHexStringSlowPath($this$toHexString, startIndex, endIndex, bytesFormat, byteToDigits);
    L9:
        byteToDigits = BYTE_TO_LOWER_CASE_HEX_DIGITS;
        goto L10
    }

    private static final String toHexStringNoLineAndGroupSeparator(byte[] $this$toHexStringNoLineAndGroupSeparator, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat, int[] byteToDigits) {
        if (bytesFormat.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() == false) goto L7;
        return toHexStringShortByteSeparatorNoPrefixAndSuffix($this$toHexStringNoLineAndGroupSeparator, startIndex, endIndex, bytesFormat, byteToDigits);
    L7:
        return toHexStringNoLineAndGroupSeparatorSlowPath($this$toHexStringNoLineAndGroupSeparator, startIndex, endIndex, bytesFormat, byteToDigits);
    }

    private static final String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] $this$toHexStringShortByteSeparatorNoPrefixAndSuffix, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat, int[] byteToDigits) {
        int byteSeparatorLength = bytesFormat.getByteSeparator().length();
        boolean r2 = true;
        if (byteSeparatorLength <= 1) goto L6;
        r2 = false;
    L6:
        if (r2 == false) goto L20;
        int numberOfBytes = endIndex - startIndex;
        int charIndex = 0;
        if (byteSeparatorLength != 0) goto L14;
        char[] charArray = new char[checkFormatLength(((long) numberOfBytes) * 2)];
        int byteIndex = startIndex;
    L10:
        if (byteIndex >= endIndex) goto L13;
        charIndex = formatByteAt($this$toHexStringShortByteSeparatorNoPrefixAndSuffix, byteIndex, byteToDigits, charArray, charIndex);
        byteIndex = byteIndex + 1;
        goto L10
    L13:
        return StringsKt.concatToString(charArray);
    L14:
        char[] charArray2 = new char[checkFormatLength((((long) numberOfBytes) * 3) - 1)];
        char byteSeparatorChar = bytesFormat.getByteSeparator().charAt(0);
        int charIndex2 = formatByteAt($this$toHexStringShortByteSeparatorNoPrefixAndSuffix, startIndex, byteToDigits, charArray2, 0);
        int byteIndex2 = startIndex + 1;
    L15:
        if (byteIndex2 >= endIndex) goto L18;
        charArray2[charIndex2] = byteSeparatorChar;
        charIndex2 = formatByteAt($this$toHexStringShortByteSeparatorNoPrefixAndSuffix, byteIndex2, byteToDigits, charArray2, charIndex2 + 1);
        byteIndex2 = byteIndex2 + 1;
        goto L15
    L18:
        return StringsKt.concatToString(charArray2);
    L20:
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] $this$toHexStringNoLineAndGroupSeparatorSlowPath, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat, int[] byteToDigits) {
        String bytePrefix = bytesFormat.getBytePrefix();
        String byteSuffix = bytesFormat.getByteSuffix();
        String byteSeparator = bytesFormat.getByteSeparator();
        int formatLength = formattedStringLength(endIndex - startIndex, byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] charArray = new char[formatLength];
        int charIndex = formatByteAt($this$toHexStringNoLineAndGroupSeparatorSlowPath, startIndex, bytePrefix, byteSuffix, byteToDigits, charArray, 0);
        int byteIndex = startIndex + 1;
    L3:
        if (byteIndex >= endIndex) goto L6;
        charIndex = formatByteAt($this$toHexStringNoLineAndGroupSeparatorSlowPath, byteIndex, bytePrefix, byteSuffix, byteToDigits, charArray, toCharArrayIfNotEmpty(byteSeparator, charArray, charIndex));
        byteIndex = byteIndex + 1;
        goto L3
    L6:
        return StringsKt.concatToString(charArray);
    }

    private static final String toHexStringSlowPath(byte[] $this$toHexStringSlowPath, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat, int[] byteToDigits) {
        int bytesPerLine = bytesFormat.getBytesPerLine();
        int bytesPerGroup = bytesFormat.getBytesPerGroup();
        String byteSuffix = bytesFormat.getBytePrefix();
        String byteSuffix2 = bytesFormat.getByteSuffix();
        String byteSeparator = bytesFormat.getByteSeparator();
        String groupSeparator = bytesFormat.getGroupSeparator();
        int formatLength = formattedStringLength(endIndex - startIndex, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), byteSuffix.length(), byteSuffix2.length());
        String bytePrefix = byteSuffix2;
        char[] charArray = new char[formatLength];
        int charIndex = 0;
        int indexInLine = 0;
        int indexInGroup = 0;
        int charIndex2 = startIndex;
    L3:
        boolean r13 = true;
        if (charIndex2 >= endIndex) goto L14;
        if (indexInLine != bytesPerLine) goto L7;
        charArray[charIndex] = '\n';
        int indexInGroup2 = 0;
        charIndex = charIndex + 1;
        int charIndex3 = 0;
    L10:
        if (indexInGroup2 == 0) goto L12;
        charIndex = toCharArrayIfNotEmpty(byteSeparator, charArray, charIndex);
    L12:
        String bytePrefix2 = byteSuffix;
        int byteIndex = charIndex2;
        int charIndex4 = formatByteAt($this$toHexStringSlowPath, byteIndex, bytePrefix2, bytePrefix, byteToDigits, charArray, charIndex);
        indexInGroup = indexInGroup2 + 1;
        indexInLine = charIndex3 + 1;
        charIndex2 = byteIndex + 1;
        charIndex = charIndex4;
        byteSuffix = bytePrefix2;
        bytePrefix = bytePrefix;
        goto L3
    L7:
        if (indexInGroup != bytesPerGroup) goto L9;
        charIndex = toCharArrayIfNotEmpty(groupSeparator, charArray, charIndex);
        charIndex3 = indexInLine;
        indexInGroup2 = 0;
        goto L10
    L9:
        charIndex3 = indexInLine;
        indexInGroup2 = indexInGroup;
        goto L10
    L14:
        if (charIndex == formatLength) goto L17;
        r13 = false;
    L17:
        if (r13 == false) goto L21;
        return StringsKt.concatToString(charArray);
    L21:
        throw new IllegalStateException("Check failed.");
    }

    private static final int formatByteAt(byte[] $this$formatByteAt, int index, String bytePrefix, String byteSuffix, int[] byteToDigits, char[] destination, int destinationOffset) {
        int offset = toCharArrayIfNotEmpty(bytePrefix, destination, destinationOffset);
        return toCharArrayIfNotEmpty(byteSuffix, destination, formatByteAt($this$formatByteAt, index, byteToDigits, destination, offset));
    }

    private static final int formatByteAt(byte[] $this$formatByteAt, int index, int[] byteToDigits, char[] destination, int destinationOffset) {
        int byteDigits = byteToDigits[$this$formatByteAt[index] & 255];
        destination[destinationOffset] = (char) (byteDigits >> 8);
        destination[destinationOffset + 1] = (char) (byteDigits & 255);
        return destinationOffset + 2;
    }

    private static final int formattedStringLength(int numberOfBytes, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
        if (numberOfBytes <= 0) goto L4;
        boolean r0 = true;
    L5:
        if (r0 == false) goto L9;
        long charsPerByte = ((((long) bytePrefixLength) + 2) + ((long) byteSuffixLength)) + ((long) byteSeparatorLength);
        long formatLength = (((long) numberOfBytes) * charsPerByte) - ((long) byteSeparatorLength);
        return checkFormatLength(formatLength);
    L9:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L4:
        r0 = false;
        goto L5
    }

    public static final int formattedStringLength(int numberOfBytes, int bytesPerLine, int bytesPerGroup, int groupSeparatorLength, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
        if (numberOfBytes <= 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L13;
        int lineSeparators = (numberOfBytes - 1) / bytesPerLine;
        int groupSeparatorsPerLine = (bytesPerLine - 1) / bytesPerGroup;
        int it = numberOfBytes % bytesPerLine;
        if (it != 0) goto L10;
        it = bytesPerLine;
    L10:
        int groupSeparatorsInLastLine = (it - 1) / bytesPerGroup;
        int groupSeparators = (lineSeparators * groupSeparatorsPerLine) + groupSeparatorsInLastLine;
        int byteSeparators = ((numberOfBytes - 1) - lineSeparators) - groupSeparators;
        long formatLength = ((((long) lineSeparators) + (((long) groupSeparators) * ((long) groupSeparatorLength))) + (((long) byteSeparators) * ((long) byteSeparatorLength))) + (((long) numberOfBytes) * ((((long) bytePrefixLength) + 2) + ((long) byteSuffixLength)));
        return checkFormatLength(formatLength);
    L13:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L5:
        r1 = false;
        goto L6
    }

    private static final int checkFormatLength(long formatLength) {
        boolean r1 = false;
        if (0 <= formatLength) goto L5;
    L7:
        if (r1 == false) goto L11;
        return (int) formatLength;
    L11:
        throw new IllegalArgumentException("The resulting string length is too big: " + ULong.m7645toStringimpl(ULong.m7599constructorimpl(formatLength)));
    L5:
        if (formatLength > SieveCacheKt.NodeLinkMask) goto L7;
        r1 = true;
        goto L7
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String r0, HexFormat r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = HexFormat.Companion.getDefault();
    L6:
        return hexToByteArray(r0, r1);
    }

    public static final byte[] hexToByteArray(String $this$hexToByteArray, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToByteArray, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByteArray($this$hexToByteArray, 0, $this$hexToByteArray.length(), format);
    }

    static /* synthetic */ byte[] hexToByteArray$default(String r0, int r1, int r2, HexFormat r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.length();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = HexFormat.Companion.getDefault();
    L12:
        return hexToByteArray(r0, r1, r2, r3);
    }

    private static final byte[] hexToByteArray(String $this$hexToByteArray, int startIndex, int endIndex, HexFormat format) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$hexToByteArray.length());
        if (startIndex == endIndex) goto L5;
        HexFormat.BytesHexFormat bytesFormat = format.getBytes();
        if (bytesFormat.getNoLineAndGroupSeparator$kotlin_stdlib() == false) goto L13;
        byte[] it = hexToByteArrayNoLineAndGroupSeparator($this$hexToByteArray, startIndex, endIndex, bytesFormat);
        if (it == null) goto L13;
        return it;
    L13:
        return hexToByteArraySlowPath($this$hexToByteArray, startIndex, endIndex, bytesFormat);
    L5:
        return new byte[0];
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparator(String $this$hexToByteArrayNoLineAndGroupSeparator, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat) {
        if (bytesFormat.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() == false) goto L7;
        return hexToByteArrayShortByteSeparatorNoPrefixAndSuffix($this$hexToByteArrayNoLineAndGroupSeparator, startIndex, endIndex, bytesFormat);
    L7:
        return hexToByteArrayNoLineAndGroupSeparatorSlowPath($this$hexToByteArrayNoLineAndGroupSeparator, startIndex, endIndex, bytesFormat);
    }

    private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(String $this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat) {
        int byteSeparatorLength = bytesFormat.getByteSeparator().length();
        boolean r3 = false;
        boolean r4 = true;
        if (byteSeparatorLength > 1) goto L5;
        boolean r5 = true;
    L6:
        if (r5 == false) goto L40;
        int numberOfChars = endIndex - startIndex;
        int charIndex = 0;
        if (byteSeparatorLength != 0) goto L17;
        if ((numberOfChars & 1) == 0) goto L12;
        return null;
    L12:
        int numberOfBytes = numberOfChars >> 1;
        byte[] byteArray = new byte[numberOfBytes];
        int byteIndex = 0;
    L13:
        if (byteIndex >= numberOfBytes) goto L15;
        byteArray[byteIndex] = parseByteAt($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, charIndex);
        charIndex = charIndex + 2;
        byteIndex = byteIndex + 1;
        goto L13
    L15:
        return byteArray;
    L17:
        if ((numberOfChars % 3) == 2) goto L19;
        return null;
    L19:
        int numberOfBytes2 = (numberOfChars / 3) + 1;
        byte[] byteArray2 = new byte[numberOfBytes2];
        char byteSeparatorChar = bytesFormat.getByteSeparator().charAt(0);
        byteArray2[0] = parseByteAt($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, 0);
        int charIndex2 = 0 + 2;
        int byteIndex2 = 1;
    L20:
        if (byteIndex2 >= numberOfBytes2) goto L38;
        if ($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix.charAt(charIndex2) == byteSeparatorChar) goto L36;
        String part$iv = bytesFormat.getByteSeparator();
        boolean ignoreCase$iv = bytesFormat.getIgnoreCase$kotlin_stdlib();
        if (part$iv.length() != 0) goto L26;
        boolean r16 = r4;
    L27:
        if (r16 == true) goto L35;
        int r6 = part$iv.length();
        int i$iv = 0;
    L29:
        if (i$iv >= r6) goto L34;
        int byteSeparatorLength2 = byteSeparatorLength;
        int r18 = r6;
        if (CharsKt.equals(part$iv.charAt(i$iv), $this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix.charAt(charIndex2 + i$iv), ignoreCase$iv) == true) goto L33;
        throwNotContainedAt($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, charIndex2, endIndex, part$iv, "byte separator");
    L33:
        i$iv = i$iv + 1;
        byteSeparatorLength = byteSeparatorLength2;
        r6 = r18;
        goto L29
    L34:
        int byteSeparatorLength3 = byteSeparatorLength;
        part$iv.length();
    L37:
        byteArray2[byteIndex2] = parseByteAt($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, charIndex2 + 1);
        charIndex2 = charIndex2 + 3;
        byteIndex2 = byteIndex2 + 1;
        byteSeparatorLength = byteSeparatorLength3;
        r3 = false;
        r4 = true;
        goto L20
    L35:
        byteSeparatorLength3 = byteSeparatorLength;
        goto L37
    L26:
        r16 = r3;
        goto L27
    L36:
        byteSeparatorLength3 = byteSeparatorLength;
        goto L37
    L38:
        return byteArray2;
    L40:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L5:
        r5 = false;
        goto L6
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(String $this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat) {
        String bytePrefix = bytesFormat.getBytePrefix();
        String byteSuffix = bytesFormat.getByteSuffix();
        String byteSeparator = bytesFormat.getByteSeparator();
        int byteSeparatorLength = byteSeparator.length();
        long charsPerByte = ((((long) bytePrefix.length()) + 2) + ((long) byteSuffix.length())) + ((long) byteSeparatorLength);
        long numberOfChars = endIndex - startIndex;
        int numberOfBytes = (int) ((((long) byteSeparatorLength) + numberOfChars) / charsPerByte);
        if (((((long) numberOfBytes) * charsPerByte) - ((long) byteSeparatorLength)) == numberOfChars) goto L6;
        return null;
    L6:
        boolean ignoreCase = bytesFormat.getIgnoreCase$kotlin_stdlib();
        byte[] byteArray = new byte[numberOfBytes];
        boolean r18 = false;
        if (bytePrefix.length() != 0) goto L9;
        boolean r17 = true;
    L10:
        if (r17 == false) goto L12;
        int byteSeparatorLength2 = startIndex;
    L19:
        String between = byteSuffix + byteSeparator + bytePrefix;
        int byteIndex = 0;
        int r13 = numberOfBytes - 1;
    L20:
        if (byteIndex >= r13) goto L35;
        byteArray[byteIndex] = parseByteAt($this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, byteSeparatorLength2);
        int index$iv = byteSeparatorLength2 + 2;
        String $this$checkContainsAt$iv = $this$hexToByteArrayNoLineAndGroupSeparatorSlowPath;
        if (between.length() != 0) goto L24;
        boolean r20 = true;
    L25:
        if (r20 == false) goto L27;
        int byteIndex2 = byteIndex;
    L34:
        byteSeparatorLength2 = index$iv;
        byteIndex = byteIndex2 + 1;
        byteSeparator = byteSeparator;
        bytePrefix = bytePrefix;
        goto L20
    L27:
        int r2 = between.length();
        int i$iv = 0;
    L28:
        if (i$iv >= r2) goto L33;
        int r21 = r2;
        int i$iv2 = i$iv;
        int byteIndex3 = byteIndex;
        String $this$checkContainsAt$iv2 = $this$checkContainsAt$iv;
        if (CharsKt.equals(between.charAt(i$iv), $this$checkContainsAt$iv2.charAt(index$iv + i$iv2), ignoreCase) == true) goto L32;
        throwNotContainedAt($this$checkContainsAt$iv2, index$iv, endIndex, between, "byte suffix + byte separator + byte prefix");
    L32:
        i$iv = i$iv2 + 1;
        $this$checkContainsAt$iv = $this$checkContainsAt$iv2;
        r2 = r21;
        byteIndex = byteIndex3;
        goto L28
    L33:
        byteIndex2 = byteIndex;
        index$iv = between.length() + index$iv;
        goto L34
    L24:
        r20 = false;
        goto L25
    L35:
        byteArray[numberOfBytes - 1] = parseByteAt($this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, byteSeparatorLength2);
        int index$iv2 = byteSeparatorLength2 + 2;
        if (byteSuffix.length() != 0) goto L38;
        r18 = true;
    L38:
        if (r18 == true) goto L47;
        int i$iv3 = 0;
        int r15 = byteSuffix.length();
    L40:
        if (i$iv3 >= r15) goto L45;
        int charIndex = byteSeparatorLength2;
        int charIndex2 = index$iv2 + i$iv3;
        if (CharsKt.equals(byteSuffix.charAt(i$iv3), $this$hexToByteArrayNoLineAndGroupSeparatorSlowPath.charAt(charIndex2), ignoreCase) == true) goto L44;
        throwNotContainedAt($this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, index$iv2, endIndex, byteSuffix, "byte suffix");
    L44:
        i$iv3 = i$iv3 + 1;
        byteSeparatorLength2 = charIndex;
        goto L40
    L45:
        byteSuffix.length();
    L47:
        return byteArray;
    L12:
        int byteSeparatorLength3 = bytePrefix.length();
        int i$iv4 = 0;
    L13:
        if (i$iv4 >= byteSeparatorLength3) goto L18;
        int r19 = byteSeparatorLength3;
        if (CharsKt.equals(bytePrefix.charAt(i$iv4), $this$hexToByteArrayNoLineAndGroupSeparatorSlowPath.charAt(startIndex + i$iv4), ignoreCase) == true) goto L17;
        throwNotContainedAt($this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, startIndex, endIndex, bytePrefix, "byte prefix");
    L17:
        i$iv4 = i$iv4 + 1;
        byteSeparatorLength3 = r19;
        goto L13
    L18:
        byteSeparatorLength2 = bytePrefix.length() + startIndex;
        goto L19
    L9:
        r17 = false;
        goto L10
    }

    private static final byte[] hexToByteArraySlowPath(String $this$hexToByteArraySlowPath, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat) {
        int bytesPerLine = bytesFormat.getBytesPerLine();
        int charIndex = bytesFormat.getBytesPerGroup();
        String bytePrefix = bytesFormat.getBytePrefix();
        String byteSuffix = bytesFormat.getByteSuffix();
        String byteSeparator = bytesFormat.getByteSeparator();
        String groupSeparator = bytesFormat.getGroupSeparator();
        boolean ignoreCase = bytesFormat.getIgnoreCase$kotlin_stdlib();
        int parseMaxSize = parsedByteArrayMaxSize(endIndex - startIndex, bytesPerLine, charIndex, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        byte[] byteArray = new byte[parseMaxSize];
        int charIndex2 = startIndex;
        int byteIndex = 0;
        int indexInLine = 0;
        int indexInGroup = 0;
    L3:
        if (charIndex2 >= endIndex) goto L71;
        if (indexInLine != bytesPerLine) goto L7;
        charIndex2 = checkNewLineAt($this$hexToByteArraySlowPath, charIndex2, endIndex);
        indexInLine = 0;
        indexInGroup = 0;
        parseMaxSize = parseMaxSize;
        int bytesPerLine2 = bytesPerLine;
        int bytesPerGroup = charIndex;
    L40:
        int indexInLine2 = indexInLine + 1;
        indexInGroup = indexInGroup + 1;
        if (bytePrefix.length() != 0) goto L43;
        boolean r15 = true;
    L44:
        if (r15 == false) goto L46;
        int $i$f$checkContainsAt = charIndex2;
        int indexInLine3 = indexInLine2;
    L54:
        if ((endIndex - 2) >= $i$f$checkContainsAt) goto L56;
        throwInvalidNumberOfDigits($this$hexToByteArraySlowPath, $i$f$checkContainsAt, endIndex, "exactly", 2);
    L56:
        int byteIndex2 = byteIndex + 1;
        byteArray[byteIndex] = parseByteAt($this$hexToByteArraySlowPath, $i$f$checkContainsAt);
        int index$iv = $i$f$checkContainsAt + 2;
        if (byteSuffix.length() != 0) goto L59;
        boolean r16 = true;
    L60:
        if (r16 == false) goto L62;
        int byteIndex3 = byteIndex2;
    L69:
        charIndex2 = index$iv;
        byteIndex = byteIndex3;
        indexInLine = indexInLine3;
        bytesPerLine = bytesPerLine2;
        parseMaxSize = parseMaxSize;
        charIndex = bytesPerGroup;
        goto L3
    L62:
        int i$iv = 0;
        int r0 = byteSuffix.length();
    L63:
        if (i$iv >= r0) goto L68;
        int r17 = r0;
        int byteIndex4 = byteIndex2;
        int byteIndex5 = index$iv + i$iv;
        if (CharsKt.equals(byteSuffix.charAt(i$iv), $this$hexToByteArraySlowPath.charAt(byteIndex5), ignoreCase) == true) goto L67;
        throwNotContainedAt($this$hexToByteArraySlowPath, index$iv, endIndex, byteSuffix, "byte suffix");
    L67:
        i$iv = i$iv + 1;
        r0 = r17;
        byteIndex2 = byteIndex4;
        goto L63
    L68:
        byteIndex3 = byteIndex2;
        index$iv = byteSuffix.length() + index$iv;
        goto L69
    L59:
        r16 = false;
        goto L60
    L46:
        int i$iv2 = 0;
        int $i$f$checkContainsAt2 = bytePrefix.length();
    L47:
        if (i$iv2 >= $i$f$checkContainsAt2) goto L52;
        int r18 = $i$f$checkContainsAt2;
        int indexInLine4 = indexInLine2;
        int indexInLine5 = charIndex2 + i$iv2;
        if (CharsKt.equals(bytePrefix.charAt(i$iv2), $this$hexToByteArraySlowPath.charAt(indexInLine5), ignoreCase) == true) goto L51;
        throwNotContainedAt($this$hexToByteArraySlowPath, charIndex2, endIndex, bytePrefix, "byte prefix");
    L51:
        i$iv2 = i$iv2 + 1;
        $i$f$checkContainsAt2 = r18;
        indexInLine2 = indexInLine4;
        goto L47
    L52:
        indexInLine3 = indexInLine2;
        $i$f$checkContainsAt = bytePrefix.length() + charIndex2;
        goto L54
    L43:
        r15 = false;
        goto L44
    L7:
        if (indexInGroup != charIndex) goto L23;
        String $this$checkContainsAt$iv = $this$hexToByteArraySlowPath;
        String partName$iv = "group separator";
        if (groupSeparator.length() != 0) goto L11;
        boolean r20 = true;
    L12:
        if (r20 == false) goto L14;
        bytesPerLine2 = bytesPerLine;
        bytesPerGroup = charIndex;
        int bytesPerLine3 = charIndex2;
    L22:
        charIndex2 = bytesPerLine3;
        indexInGroup = 0;
        goto L40
    L14:
        int r19 = groupSeparator.length();
        int parseMaxSize2 = 0;
    L15:
        if (parseMaxSize2 >= r19) goto L21;
        int bytesPerLine4 = bytesPerLine;
        int i$iv3 = parseMaxSize2;
        int bytesPerGroup2 = charIndex;
        String $this$checkContainsAt$iv2 = $this$checkContainsAt$iv;
        if (CharsKt.equals(groupSeparator.charAt(parseMaxSize2), $this$checkContainsAt$iv2.charAt(charIndex2 + i$iv3), ignoreCase) == true) goto L19;
        String partName$iv2 = partName$iv;
        throwNotContainedAt($this$checkContainsAt$iv2, charIndex2, endIndex, groupSeparator, partName$iv2);
    L20:
        partName$iv = partName$iv2;
        parseMaxSize2 = i$iv3 + 1;
        $this$checkContainsAt$iv = $this$checkContainsAt$iv2;
        bytesPerLine = bytesPerLine4;
        charIndex = bytesPerGroup2;
        goto L15
    L19:
        partName$iv2 = partName$iv;
        goto L20
    L21:
        bytesPerLine2 = bytesPerLine;
        bytesPerGroup = charIndex;
        bytesPerLine3 = groupSeparator.length() + charIndex2;
        goto L22
    L11:
        r20 = false;
        goto L12
    L23:
        parseMaxSize = parseMaxSize;
        bytesPerLine2 = bytesPerLine;
        bytesPerGroup = charIndex;
        if (indexInGroup == 0) goto L40;
        if (byteSeparator.length() != 0) goto L28;
        boolean r110 = true;
    L29:
        if (r110 == false) goto L31;
        int $i$f$checkContainsAt3 = charIndex2;
        int indexInLine6 = indexInLine;
    L38:
        charIndex2 = $i$f$checkContainsAt3;
        indexInLine = indexInLine6;
        goto L40
    L31:
        int i$iv4 = 0;
        int $i$f$checkContainsAt4 = byteSeparator.length();
    L32:
        if (i$iv4 >= $i$f$checkContainsAt4) goto L37;
        int r111 = $i$f$checkContainsAt4;
        int indexInLine7 = indexInLine;
        int indexInLine8 = charIndex2 + i$iv4;
        if (CharsKt.equals(byteSeparator.charAt(i$iv4), $this$hexToByteArraySlowPath.charAt(indexInLine8), ignoreCase) == true) goto L36;
        throwNotContainedAt($this$hexToByteArraySlowPath, charIndex2, endIndex, byteSeparator, "byte separator");
    L36:
        i$iv4 = i$iv4 + 1;
        $i$f$checkContainsAt4 = r111;
        indexInLine = indexInLine7;
        goto L32
    L37:
        indexInLine6 = indexInLine;
        $i$f$checkContainsAt3 = byteSeparator.length() + charIndex2;
        goto L38
    L28:
        r110 = false;
        goto L29
    L71:
        if (byteIndex == byteArray.length) goto L90;
        byte[] r1 = Arrays.copyOf(byteArray, byteIndex);
        Intrinsics.checkNotNullExpressionValue(r1, "copyOf(...)");
        return r1;
    L90:
        return byteArray;
    }

    private static final byte parseByteAt(String $this$parseByteAt, int index) {
        int code$iv = $this$parseByteAt.charAt(index);
        if ((code$iv >>> 8) == 0) goto L5;
    L14:
        throwInvalidDigitAt($this$parseByteAt, index);
        throw new KotlinNothingValueException();
    L5:
        if (HEX_DIGITS_TO_DECIMAL[code$iv] < 0) goto L14;
        int high = HEX_DIGITS_TO_DECIMAL[code$iv];
        int index$iv = index + 1;
        int code$iv2 = $this$parseByteAt.charAt(index$iv);
        if ((code$iv2 >>> 8) == 0) goto L9;
    L12:
        throwInvalidDigitAt($this$parseByteAt, index$iv);
        throw new KotlinNothingValueException();
    L9:
        if (HEX_DIGITS_TO_DECIMAL[code$iv2] < 0) goto L12;
        int low = HEX_DIGITS_TO_DECIMAL[code$iv2];
        return (byte) ((high << 4) | low);
    }

    public static final int parsedByteArrayMaxSize(int stringLength, int bytesPerLine, int bytesPerGroup, int groupSeparatorLength, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
        if (stringLength <= 0) goto L5;
        boolean r7 = true;
    L6:
        if (r7 == false) goto L21;
        long charsPerByte = (((long) bytePrefixLength) + 2) + ((long) byteSuffixLength);
        long charsPerGroup = charsPerSet(charsPerByte, bytesPerGroup, byteSeparatorLength);
        if (bytesPerLine > bytesPerGroup) goto L10;
        long charsPerLine = charsPerSet(charsPerByte, bytesPerLine, byteSeparatorLength);
    L14:
        long numberOfChars = stringLength;
        long wholeLines = wholeElementsPerSet(numberOfChars, charsPerLine, 1);
        long numberOfChars2 = numberOfChars - ((charsPerLine + 1) * wholeLines);
        long wholeGroupsInLastLine = wholeElementsPerSet(numberOfChars2, charsPerGroup, groupSeparatorLength);
        long numberOfChars3 = numberOfChars2 - ((((long) groupSeparatorLength) + charsPerGroup) * wholeGroupsInLastLine);
        long wholeBytesInLastGroup = wholeElementsPerSet(numberOfChars3, charsPerByte, byteSeparatorLength);
        if ((numberOfChars3 - ((((long) byteSeparatorLength) + charsPerByte) * wholeBytesInLastGroup)) <= 0) goto L17;
        int spare = 1;
    L19:
        return (int) ((((((long) bytesPerLine) * wholeLines) + (((long) bytesPerGroup) * wholeGroupsInLastLine)) + wholeBytesInLastGroup) + ((long) spare));
    L17:
        spare = 0;
        goto L19
    L10:
        int groupsPerLine = bytesPerLine / bytesPerGroup;
        long result = charsPerSet(charsPerGroup, groupsPerLine, groupSeparatorLength);
        int bytesPerLastGroupInLine = bytesPerLine % bytesPerGroup;
        if (bytesPerLastGroupInLine == 0) goto L13;
        result = (result + ((long) groupSeparatorLength)) + charsPerSet(charsPerByte, bytesPerLastGroupInLine, byteSeparatorLength);
    L13:
        charsPerLine = result;
        goto L14
    L21:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L5:
        r7 = false;
        goto L6
    }

    private static final long charsPerSet(long charsPerElement, int elementsPerSet, int elementSeparatorLength) {
        if (elementsPerSet <= 0) goto L4;
        boolean r0 = true;
    L5:
        if (r0 == false) goto L9;
        return (((long) elementsPerSet) * charsPerElement) + (((long) elementSeparatorLength) * (((long) elementsPerSet) - 1));
    L9:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L4:
        r0 = false;
        goto L5
    }

    private static final long wholeElementsPerSet(long charsPerSet, long charsPerElement, int elementSeparatorLength) {
        if (charsPerSet > 0) goto L5;
        return 0;
    L5:
        if (charsPerElement > 0) goto L8;
        return 0;
    L8:
        return (((long) elementSeparatorLength) + charsPerSet) / (((long) elementSeparatorLength) + charsPerElement);
    }

    private static final int checkNewLineAt(String $this$checkNewLineAt, int index, int endIndex) {
        if ($this$checkNewLineAt.charAt(index) != '\r') goto L11;
        if ((index + 1) >= endIndex) goto L17;
        if ($this$checkNewLineAt.charAt(index + 1) != '\n') goto L17;
        return index + 2;
    L17:
        return index + 1;
    L11:
        if ($this$checkNewLineAt.charAt(index) != '\n') goto L15;
        return index + 1;
    L15:
        throw new NumberFormatException("Expected a new line at index " + index + ", but was " + $this$checkNewLineAt.charAt(index));
    }

    public static /* synthetic */ String toHexString$default(byte r0, HexFormat r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = HexFormat.Companion.getDefault();
    L6:
        return toHexString(r0, r1);
    }

    public static final String toHexString(byte $this$toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        if (format.getUpperCase() == false) goto L5;
        String digits = UPPER_CASE_HEX_DIGITS;
    L6:
        HexFormat.NumberHexFormat numberFormat = format.getNumber();
        if (numberFormat.isDigitsOnlyAndNoPadding$kotlin_stdlib() == false) goto L14;
        char[] charArray = {digits.charAt(($this$toHexString >> 4) & 15), digits.charAt($this$toHexString & 15)};
        if (numberFormat.getRemoveLeadingZeros() == false) goto L12;
        return StringsKt.concatToString$default(charArray, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros($this$toHexString & UByte.MAX_VALUE) - 24) >> 2, 1), 0, 2, null);
    L12:
        return StringsKt.concatToString(charArray);
    L14:
        return toHexStringImpl($this$toHexString, numberFormat, digits, 8);
    L5:
        digits = LOWER_CASE_HEX_DIGITS;
        goto L6
    }

    public static /* synthetic */ byte hexToByte$default(String r0, HexFormat r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = HexFormat.Companion.getDefault();
    L6:
        return hexToByte(r0, r1);
    }

    public static final byte hexToByte(String $this$hexToByte, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToByte, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByte($this$hexToByte, 0, $this$hexToByte.length(), format);
    }

    static /* synthetic */ byte hexToByte$default(String r0, int r1, int r2, HexFormat r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.length();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = HexFormat.Companion.getDefault();
    L12:
        return hexToByte(r0, r1, r2, r3);
    }

    private static final byte hexToByte(String $this$hexToByte, int startIndex, int endIndex, HexFormat format) {
        return (byte) hexToIntImpl($this$hexToByte, startIndex, endIndex, format, 2);
    }

    public static /* synthetic */ String toHexString$default(short r0, HexFormat r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = HexFormat.Companion.getDefault();
    L6:
        return toHexString(r0, r1);
    }

    public static final String toHexString(short $this$toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        if (format.getUpperCase() == false) goto L5;
        String digits = UPPER_CASE_HEX_DIGITS;
    L6:
        HexFormat.NumberHexFormat numberFormat = format.getNumber();
        if (numberFormat.isDigitsOnlyAndNoPadding$kotlin_stdlib() == false) goto L14;
        char[] charArray = {digits.charAt(($this$toHexString >> 12) & 15), digits.charAt(($this$toHexString >> 8) & 15), digits.charAt(($this$toHexString >> 4) & 15), digits.charAt($this$toHexString & 15)};
        if (numberFormat.getRemoveLeadingZeros() == false) goto L12;
        return StringsKt.concatToString$default(charArray, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(65535 & $this$toHexString) - 16) >> 2, 3), 0, 2, null);
    L12:
        return StringsKt.concatToString(charArray);
    L14:
        return toHexStringImpl($this$toHexString, numberFormat, digits, 16);
    L5:
        digits = LOWER_CASE_HEX_DIGITS;
        goto L6
    }

    public static /* synthetic */ short hexToShort$default(String r0, HexFormat r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = HexFormat.Companion.getDefault();
    L6:
        return hexToShort(r0, r1);
    }

    public static final short hexToShort(String $this$hexToShort, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToShort, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort($this$hexToShort, 0, $this$hexToShort.length(), format);
    }

    static /* synthetic */ short hexToShort$default(String r0, int r1, int r2, HexFormat r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.length();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = HexFormat.Companion.getDefault();
    L12:
        return hexToShort(r0, r1, r2, r3);
    }

    private static final short hexToShort(String $this$hexToShort, int startIndex, int endIndex, HexFormat format) {
        return (short) hexToIntImpl($this$hexToShort, startIndex, endIndex, format, 4);
    }

    public static /* synthetic */ String toHexString$default(int r0, HexFormat r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = HexFormat.Companion.getDefault();
    L6:
        return toHexString(r0, r1);
    }

    public static final String toHexString(int $this$toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        if (format.getUpperCase() == false) goto L5;
        String digits = UPPER_CASE_HEX_DIGITS;
    L6:
        HexFormat.NumberHexFormat numberFormat = format.getNumber();
        if (numberFormat.isDigitsOnlyAndNoPadding$kotlin_stdlib() == false) goto L14;
        char[] charArray = {digits.charAt(($this$toHexString >> 28) & 15), digits.charAt(($this$toHexString >> 24) & 15), digits.charAt(($this$toHexString >> 20) & 15), digits.charAt(($this$toHexString >> 16) & 15), digits.charAt(($this$toHexString >> 12) & 15), digits.charAt(($this$toHexString >> 8) & 15), digits.charAt(($this$toHexString >> 4) & 15), digits.charAt($this$toHexString & 15)};
        if (numberFormat.getRemoveLeadingZeros() == false) goto L12;
        return StringsKt.concatToString$default(charArray, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros($this$toHexString) >> 2, 7), 0, 2, null);
    L12:
        return StringsKt.concatToString(charArray);
    L14:
        return toHexStringImpl($this$toHexString, numberFormat, digits, 32);
    L5:
        digits = LOWER_CASE_HEX_DIGITS;
        goto L6
    }

    public static /* synthetic */ int hexToInt$default(String r0, HexFormat r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = HexFormat.Companion.getDefault();
    L6:
        return hexToInt(r0, r1);
    }

    public static final int hexToInt(String $this$hexToInt, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToInt, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToInt($this$hexToInt, 0, $this$hexToInt.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(String r0, int r1, int r2, HexFormat r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.length();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = HexFormat.Companion.getDefault();
    L12:
        return hexToInt(r0, r1, r2, r3);
    }

    public static final int hexToInt(String $this$hexToInt, int startIndex, int endIndex, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToInt, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToIntImpl($this$hexToInt, startIndex, endIndex, format, 8);
    }

    public static /* synthetic */ String toHexString$default(long r0, HexFormat r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r2 = HexFormat.Companion.getDefault();
    L6:
        return toHexString(r0, r2);
    }

    public static final String toHexString(long $this$toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        if (format.getUpperCase() == false) goto L5;
        String digits = UPPER_CASE_HEX_DIGITS;
    L6:
        HexFormat.NumberHexFormat numberFormat = format.getNumber();
        if (numberFormat.isDigitsOnlyAndNoPadding$kotlin_stdlib() == false) goto L14;
        char[] charArray = {digits.charAt((int) (($this$toHexString >> 60) & 15)), digits.charAt((int) (($this$toHexString >> 56) & 15)), digits.charAt((int) (($this$toHexString >> 52) & 15)), digits.charAt((int) (($this$toHexString >> 48) & 15)), digits.charAt((int) (($this$toHexString >> 44) & 15)), digits.charAt((int) (($this$toHexString >> 40) & 15)), digits.charAt((int) (($this$toHexString >> 36) & 15)), digits.charAt((int) (($this$toHexString >> 32) & 15)), digits.charAt((int) (($this$toHexString >> 28) & 15)), digits.charAt((int) (($this$toHexString >> 24) & 15)), digits.charAt((int) (($this$toHexString >> 20) & 15)), digits.charAt((int) (($this$toHexString >> 16) & 15)), digits.charAt((int) (($this$toHexString >> 12) & 15)), digits.charAt((int) (($this$toHexString >> 8) & 15)), digits.charAt((int) (($this$toHexString >> 4) & 15)), digits.charAt((int) (15 & $this$toHexString))};
        if (numberFormat.getRemoveLeadingZeros() == false) goto L12;
        return StringsKt.concatToString$default(charArray, RangesKt.coerceAtMost(Long.numberOfLeadingZeros($this$toHexString) >> 2, 15), 0, 2, null);
    L12:
        return StringsKt.concatToString(charArray);
    L14:
        return toHexStringImpl($this$toHexString, numberFormat, digits, 64);
    L5:
        digits = LOWER_CASE_HEX_DIGITS;
        goto L6
    }

    public static /* synthetic */ long hexToLong$default(String r0, HexFormat r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = HexFormat.Companion.getDefault();
    L6:
        return hexToLong(r0, r1);
    }

    public static final long hexToLong(String $this$hexToLong, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToLong, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong($this$hexToLong, 0, $this$hexToLong.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String r0, int r1, int r2, HexFormat r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.length();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = HexFormat.Companion.getDefault();
    L12:
        return hexToLong(r0, r1, r2, r3);
    }

    public static final long hexToLong(String $this$hexToLong, int startIndex, int endIndex, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToLong, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLongImpl($this$hexToLong, startIndex, endIndex, format, 16);
    }

    private static final String toHexStringImpl(long $this$toHexStringImpl, HexFormat.NumberHexFormat numberFormat, String digits, int bits) {
        if ((bits & 3) != 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L29;
        long value = $this$toHexStringImpl;
        int typeHexLength = bits >> 2;
        int minLength = numberFormat.getMinLength();
        int pads = RangesKt.coerceAtLeast(minLength - typeHexLength, 0);
        String prefix = numberFormat.getPrefix();
        String suffix = numberFormat.getSuffix();
        boolean removeZeros = numberFormat.getRemoveLeadingZeros();
        long formatLength = ((((long) prefix.length()) + ((long) pads)) + ((long) typeHexLength)) + ((long) suffix.length());
        char[] charArray = new char[checkFormatLength(formatLength)];
        int charIndex = toCharArrayIfNotEmpty(prefix, charArray, 0);
        if (pads <= 0) goto L10;
        ArraysKt.fill(charArray, digits.charAt(0), charIndex, charIndex + pads);
        charIndex = charIndex + pads;
    L10:
        int shift = bits;
        int r15 = 0;
    L11:
        if (r15 >= typeHexLength) goto L23;
        shift = shift - 4;
        long value2 = value;
        int decimal = (int) ((value >> shift) & 15);
        if (removeZeros == false) goto L18;
        if (decimal != 0) goto L18;
        if ((shift >> 2) < minLength) goto L18;
        boolean r4 = true;
    L19:
        removeZeros = r4;
        if (removeZeros == true) goto L22;
        charArray[charIndex] = digits.charAt(decimal);
        charIndex = charIndex + 1;
    L22:
        r15 = r15 + 1;
        value = value2;
    L18:
        r4 = false;
        goto L19
    L23:
        int charIndex2 = toCharArrayIfNotEmpty(suffix, charArray, charIndex);
        if (charIndex2 != charArray.length) goto L27;
        return StringsKt.concatToString(charArray);
    L27:
        return StringsKt.concatToString$default(charArray, 0, charIndex2, 1, null);
    L29:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L5:
        r1 = false;
        goto L6
    }

    private static final int toCharArrayIfNotEmpty(String $this$toCharArrayIfNotEmpty, char[] destination, int destinationOffset) {
        switch($this$toCharArrayIfNotEmpty.length()) {
            case 0: goto L7;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        int r0 = $this$toCharArrayIfNotEmpty.length();
        Intrinsics.checkNotNull($this$toCharArrayIfNotEmpty, "null cannot be cast to non-null type java.lang.String");
        $this$toCharArrayIfNotEmpty.getChars(0, r0, destination, destinationOffset);
        goto L7
    L5:
        destination[destinationOffset] = $this$toCharArrayIfNotEmpty.charAt(0);
    L7:
        return $this$toCharArrayIfNotEmpty.length() + destinationOffset;
    }

    private static final int hexToIntImpl(String $this$hexToIntImpl, int startIndex, int endIndex, HexFormat format, int typeHexLength) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$hexToIntImpl.length());
        HexFormat.NumberHexFormat numberFormat = format.getNumber();
        if (numberFormat.isDigitsOnly$kotlin_stdlib() == false) goto L6;
        checkNumberOfDigits($this$hexToIntImpl, startIndex, endIndex, typeHexLength);
        return parseInt($this$hexToIntImpl, startIndex, endIndex);
    L6:
        String prefix = numberFormat.getPrefix();
        String suffix = numberFormat.getSuffix();
        checkPrefixSuffixNumberOfDigits($this$hexToIntImpl, startIndex, endIndex, prefix, suffix, numberFormat.getIgnoreCase$kotlin_stdlib(), typeHexLength);
        return parseInt($this$hexToIntImpl, startIndex + prefix.length(), endIndex - suffix.length());
    }

    private static final long hexToLongImpl(String $this$hexToLongImpl, int startIndex, int endIndex, HexFormat format, int typeHexLength) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$hexToLongImpl.length());
        HexFormat.NumberHexFormat numberFormat = format.getNumber();
        if (numberFormat.isDigitsOnly$kotlin_stdlib() == false) goto L6;
        checkNumberOfDigits($this$hexToLongImpl, startIndex, endIndex, typeHexLength);
        return parseLong($this$hexToLongImpl, startIndex, endIndex);
    L6:
        String prefix = numberFormat.getPrefix();
        String suffix = numberFormat.getSuffix();
        checkPrefixSuffixNumberOfDigits($this$hexToLongImpl, startIndex, endIndex, prefix, suffix, numberFormat.getIgnoreCase$kotlin_stdlib(), typeHexLength);
        return parseLong($this$hexToLongImpl, startIndex + prefix.length(), endIndex - suffix.length());
    }

    private static final void checkPrefixSuffixNumberOfDigits(String $this$checkPrefixSuffixNumberOfDigits, int startIndex, int endIndex, String prefix, String suffix, boolean ignoreCase, int typeHexLength) {
        if (((endIndex - startIndex) - prefix.length()) > suffix.length()) goto L5;
        throwInvalidPrefixSuffix($this$checkPrefixSuffixNumberOfDigits, startIndex, endIndex, prefix, suffix);
    L5:
        boolean r4 = false;
        if (prefix.length() != 0) goto L8;
        boolean r3 = true;
    L9:
        if (r3 == false) goto L11;
        int digitsStartIndex = startIndex;
    L18:
        int digitsEndIndex = endIndex - suffix.length();
        if (suffix.length() != 0) goto L21;
        r4 = true;
    L21:
        if (r4 == true) goto L29;
        int i$iv = 0;
        int r5 = suffix.length();
    L23:
        if (i$iv >= r5) goto L28;
        if (CharsKt.equals(suffix.charAt(i$iv), $this$checkPrefixSuffixNumberOfDigits.charAt(digitsEndIndex + i$iv), ignoreCase) == true) goto L27;
        throwNotContainedAt($this$checkPrefixSuffixNumberOfDigits, digitsEndIndex, endIndex, suffix, "suffix");
    L27:
        i$iv = i$iv + 1;
        goto L23
    L28:
        suffix.length();
    L29:
        checkNumberOfDigits($this$checkPrefixSuffixNumberOfDigits, digitsStartIndex, digitsEndIndex, typeHexLength);
        return;
    L11:
        int i$iv2 = 0;
        int r6 = prefix.length();
    L12:
        if (i$iv2 >= r6) goto L17;
        if (CharsKt.equals(prefix.charAt(i$iv2), $this$checkPrefixSuffixNumberOfDigits.charAt(startIndex + i$iv2), ignoreCase) == true) goto L16;
        throwNotContainedAt($this$checkPrefixSuffixNumberOfDigits, startIndex, endIndex, prefix, "prefix");
    L16:
        i$iv2 = i$iv2 + 1;
        goto L12
    L17:
        int i$iv3 = prefix.length();
        digitsStartIndex = i$iv3 + startIndex;
        goto L18
    L8:
        r3 = false;
        goto L9
    }

    private static final void checkNumberOfDigits(String $this$checkNumberOfDigits, int startIndex, int endIndex, int typeHexLength) {
        int digits = endIndex - startIndex;
        if (digits >= 1) goto L5;
        throwInvalidNumberOfDigits($this$checkNumberOfDigits, startIndex, endIndex, "at least", 1);
        return;
    L5:
        if (digits <= typeHexLength) goto L9;
        checkZeroDigits($this$checkNumberOfDigits, startIndex, (startIndex + digits) - typeHexLength);
        return;
    }

    private static final void checkZeroDigits(String $this$checkZeroDigits, int startIndex, int endIndex) {
        int index = startIndex;
    L3:
        if (index >= endIndex) goto L9;
        if ($this$checkZeroDigits.charAt(index) != '0') goto L8;
        index = index + 1;
        goto L3
    L8:
        throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + index + ", but was '" + $this$checkZeroDigits.charAt(index) + "'.\nThe result won't fit the type being parsed.");
    }

    private static final int parseInt(String $this$parseInt, int startIndex, int endIndex) {
        int result = 0;
        int i = startIndex;
    L3:
        if (i >= endIndex) goto L11;
        int r2 = result << 4;
        int code$iv = $this$parseInt.charAt(i);
        if ((code$iv >>> 8) != 0) goto L9;
        if (HEX_DIGITS_TO_DECIMAL[code$iv] < 0) goto L9;
        result = r2 | HEX_DIGITS_TO_DECIMAL[code$iv];
        i = i + 1;
    L9:
        throwInvalidDigitAt($this$parseInt, i);
        throw new KotlinNothingValueException();
    L11:
        return result;
    }

    private static final long parseLong(String $this$parseLong, int startIndex, int endIndex) {
        long result = 0;
        int i = startIndex;
    L3:
        if (i >= endIndex) goto L11;
        long r3 = result << 4;
        int code$iv = $this$parseLong.charAt(i);
        if ((code$iv >>> 8) != 0) goto L9;
        if (HEX_DIGITS_TO_LONG_DECIMAL[code$iv] < 0) goto L9;
        result = r3 | HEX_DIGITS_TO_LONG_DECIMAL[code$iv];
        i = i + 1;
    L9:
        throwInvalidDigitAt($this$parseLong, i);
        throw new KotlinNothingValueException();
    L11:
        return result;
    }

    private static final int checkContainsAt(String $this$checkContainsAt, int index, int endIndex, String part, boolean ignoreCase, String partName) {
        if (part.length() != 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L8;
        return index;
    L8:
        int i = 0;
        int r2 = part.length();
    L9:
        if (i >= r2) goto L14;
        if (CharsKt.equals(part.charAt(i), $this$checkContainsAt.charAt(index + i), ignoreCase) == true) goto L13;
        throwNotContainedAt($this$checkContainsAt, index, endIndex, part, partName);
    L13:
        i = i + 1;
        goto L9
    L14:
        int i2 = part.length();
        return i2 + index;
    L5:
        r1 = false;
        goto L6
    }

    private static final int decimalFromHexDigitAt(String $this$decimalFromHexDigitAt, int index) {
        int code = $this$decimalFromHexDigitAt.charAt(index);
        if ((code >>> 8) == 0) goto L5;
    L8:
        throwInvalidDigitAt($this$decimalFromHexDigitAt, index);
        throw new KotlinNothingValueException();
    L5:
        if (HEX_DIGITS_TO_DECIMAL[code] < 0) goto L8;
        return HEX_DIGITS_TO_DECIMAL[code];
    }

    private static final long longDecimalFromHexDigitAt(String $this$longDecimalFromHexDigitAt, int index) {
        int code = $this$longDecimalFromHexDigitAt.charAt(index);
        if ((code >>> 8) == 0) goto L5;
    L8:
        throwInvalidDigitAt($this$longDecimalFromHexDigitAt, index);
        throw new KotlinNothingValueException();
    L5:
        if (HEX_DIGITS_TO_LONG_DECIMAL[code] < 0) goto L8;
        return HEX_DIGITS_TO_LONG_DECIMAL[code];
    }

    private static final void throwInvalidNumberOfDigits(String $this$throwInvalidNumberOfDigits, int startIndex, int endIndex, String specifier, int expected) {
        Intrinsics.checkNotNull($this$throwInvalidNumberOfDigits, "null cannot be cast to non-null type java.lang.String");
        String substring = $this$throwInvalidNumberOfDigits.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException("Expected " + specifier + ' ' + expected + " hexadecimal digits at index " + startIndex + ", but was \"" + substring + "\" of length " + (endIndex - startIndex));
    }

    private static final void throwNotContainedAt(String $this$throwNotContainedAt, int index, int endIndex, String part, String partName) {
        int r0 = RangesKt.coerceAtMost(part.length() + index, endIndex);
        Intrinsics.checkNotNull($this$throwNotContainedAt, "null cannot be cast to non-null type java.lang.String");
        String substring = $this$throwNotContainedAt.substring(index, r0);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException("Expected " + partName + " \"" + part + "\" at index " + index + ", but was " + substring);
    }

    private static final void throwInvalidPrefixSuffix(String $this$throwInvalidPrefixSuffix, int startIndex, int endIndex, String prefix, String suffix) {
        Intrinsics.checkNotNull($this$throwInvalidPrefixSuffix, "null cannot be cast to non-null type java.lang.String");
        String substring = $this$throwInvalidPrefixSuffix.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + prefix + "\" and suffix \"" + suffix + "\", but was " + substring);
    }

    private static final Void throwInvalidDigitAt(String $this$throwInvalidDigitAt, int index) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + index + ", but was " + $this$throwInvalidDigitAt.charAt(index));
    }
}
