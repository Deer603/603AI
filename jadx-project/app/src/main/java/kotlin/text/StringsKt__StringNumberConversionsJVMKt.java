package kotlin.text;

import androidx.core.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\u0010\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u000e\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u000f\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u0001H\u0087\b\u001a\r\u0010\t\u001a\u00020\u0002*\u00020\u0001H\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\u0004*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\f\u001a\u00020\u0006*\u00020\u0001H\u0087\b\u001a\u0015\u0010\f\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u0001H\u0087\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0001H\u0087\b\u001a\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0016*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0016*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0001H\u0007\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\r\u0010\u0018\u001a\u00020\u0019*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0018\u001a\u00020\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0087\b\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u0001H\u0007\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0007\u001a4\u0010\u001d\u001a\u0004\u0018\u0001H\u001e\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u001e0!H\u0082\b¢\u0006\u0004\b\"\u0010#\u001a\u0015\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0001H\u0002¢\u0006\u0002\b&\u001a \u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\b*\u001a\u0012\u0010+\u001a\u00020\b*\u00020,H\u0083\b¢\u0006\u0002\b-\u001a\u0012\u0010.\u001a\u00020\b*\u00020,H\u0083\b¢\u0006\u0002\b/\u001a\u0012\u00100\u001a\u00020\u0004*\u00020,H\u0083\b¢\u0006\u0002\b1\u001a6\u00102\u001a\u00020\u0004*\u00020\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0!H\u0083\b¢\u0006\u0002\b4\u001a6\u00105\u001a\u00020\u0004*\u00020\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0!H\u0083\b¢\u0006\u0002\b6\u001a>\u00107\u001a\u00020\u0004*\u00020\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u00108\u001a\u00020\b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0!H\u0083\b¢\u0006\u0002\b9¨\u0006:"}, d2 = {"toString", "", "", "radix", "", "", "", "toBoolean", "", "toByte", "toShort", "toInt", "toLong", "toFloat", "", "toDouble", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toBigInteger", "Ljava/math/BigInteger;", "toBigIntegerOrNull", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "screenFloatValue", "T", "str", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "isValidFloat", "s", "isValidFloat$StringsKt__StringNumberConversionsJVMKt", "guessNamedFloatConstant", "start", "endInclusive", "guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt", "isAsciiDigit", "", "isAsciiDigit$StringsKt__StringNumberConversionsJVMKt", "isHexLetter", "isHexLetter$StringsKt__StringNumberConversionsJVMKt", "asciiLetterToLowerCaseCode", "asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt", "advanceWhile", "predicate", "advanceWhile$StringsKt__StringNumberConversionsJVMKt", "backtrackWhile", "backtrackWhile$StringsKt__StringNumberConversionsJVMKt", "advanceAndValidateMantissa", "hexFormat", "advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
    public StringsKt__StringNumberConversionsJVMKt() {
    }

    private static final String toString(byte $this$toString, int radix) {
        String r0 = Integer.toString($this$toString, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    private static final String toString(short $this$toString, int radix) {
        String r0 = Integer.toString($this$toString, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    private static final String toString(int $this$toString, int radix) {
        String r0 = Integer.toString($this$toString, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    private static final String toString(long $this$toString, int radix) {
        String r0 = Long.toString($this$toString, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    private static final boolean toBoolean(String $this$toBoolean) {
        return Boolean.parseBoolean($this$toBoolean);
    }

    private static final byte toByte(String $this$toByte) {
        Intrinsics.checkNotNullParameter($this$toByte, "<this>");
        return Byte.parseByte($this$toByte);
    }

    private static final byte toByte(String $this$toByte, int radix) {
        Intrinsics.checkNotNullParameter($this$toByte, "<this>");
        return Byte.parseByte($this$toByte, CharsKt.checkRadix(radix));
    }

    private static final short toShort(String $this$toShort) {
        Intrinsics.checkNotNullParameter($this$toShort, "<this>");
        return Short.parseShort($this$toShort);
    }

    private static final short toShort(String $this$toShort, int radix) {
        Intrinsics.checkNotNullParameter($this$toShort, "<this>");
        return Short.parseShort($this$toShort, CharsKt.checkRadix(radix));
    }

    private static final int toInt(String $this$toInt) {
        Intrinsics.checkNotNullParameter($this$toInt, "<this>");
        return Integer.parseInt($this$toInt);
    }

    private static final int toInt(String $this$toInt, int radix) {
        Intrinsics.checkNotNullParameter($this$toInt, "<this>");
        return Integer.parseInt($this$toInt, CharsKt.checkRadix(radix));
    }

    private static final long toLong(String $this$toLong) {
        Intrinsics.checkNotNullParameter($this$toLong, "<this>");
        return Long.parseLong($this$toLong);
    }

    private static final long toLong(String $this$toLong, int radix) {
        Intrinsics.checkNotNullParameter($this$toLong, "<this>");
        return Long.parseLong($this$toLong, CharsKt.checkRadix(radix));
    }

    private static final float toFloat(String $this$toFloat) {
        Intrinsics.checkNotNullParameter($this$toFloat, "<this>");
        return Float.parseFloat($this$toFloat);
    }

    private static final double toDouble(String $this$toDouble) {
        Intrinsics.checkNotNullParameter($this$toDouble, "<this>");
        return Double.parseDouble($this$toDouble);
    }

    public static final Float toFloatOrNull(String $this$toFloatOrNull) {
        Intrinsics.checkNotNullParameter($this$toFloatOrNull, "<this>");
        if (isValidFloat$StringsKt__StringNumberConversionsJVMKt($this$toFloatOrNull) == false) goto L15;
        return Float.valueOf(Float.parseFloat($this$toFloatOrNull));
    L15:
        return null;
    L11:
        return null;
    }

    public static final Double toDoubleOrNull(String $this$toDoubleOrNull) {
        Intrinsics.checkNotNullParameter($this$toDoubleOrNull, "<this>");
        if (isValidFloat$StringsKt__StringNumberConversionsJVMKt($this$toDoubleOrNull) == false) goto L15;
        return Double.valueOf(Double.parseDouble($this$toDoubleOrNull));
    L15:
        return null;
    L11:
        return null;
    }

    private static final BigInteger toBigInteger(String $this$toBigInteger) {
        Intrinsics.checkNotNullParameter($this$toBigInteger, "<this>");
        return new BigInteger($this$toBigInteger);
    }

    private static final BigInteger toBigInteger(String $this$toBigInteger, int radix) {
        Intrinsics.checkNotNullParameter($this$toBigInteger, "<this>");
        return new BigInteger($this$toBigInteger, CharsKt.checkRadix(radix));
    }

    public static final BigInteger toBigIntegerOrNull(String $this$toBigIntegerOrNull) {
        Intrinsics.checkNotNullParameter($this$toBigIntegerOrNull, "<this>");
        return StringsKt.toBigIntegerOrNull($this$toBigIntegerOrNull, 10);
    }

    public static final BigInteger toBigIntegerOrNull(String $this$toBigIntegerOrNull, int radix) {
        Intrinsics.checkNotNullParameter($this$toBigIntegerOrNull, "<this>");
        CharsKt.checkRadix(radix);
        int length = $this$toBigIntegerOrNull.length();
        int start = 0;
        switch(length) {
            case 0: goto L10;
            case 1: goto L8;
            default: goto L5;
        };
    L10:
        return null;
    L5:
        if ($this$toBigIntegerOrNull.charAt(0) != '-') goto L11;
        start = 1;
    L11:
        int index = start;
    L12:
        if (index >= length) goto L18;
        if (CharsKt.digitOf($this$toBigIntegerOrNull.charAt(index), radix) < 0) goto L15;
        index = index + 1;
        goto L12
    L15:
        return null;
    L18:
        return new BigInteger($this$toBigIntegerOrNull, CharsKt.checkRadix(radix));
    L8:
        if (CharsKt.digitOf($this$toBigIntegerOrNull.charAt(0), radix) >= 0) goto L18;
        return null;
    }

    private static final BigDecimal toBigDecimal(String $this$toBigDecimal) {
        Intrinsics.checkNotNullParameter($this$toBigDecimal, "<this>");
        return new BigDecimal($this$toBigDecimal);
    }

    private static final BigDecimal toBigDecimal(String $this$toBigDecimal, MathContext mathContext) {
        Intrinsics.checkNotNullParameter($this$toBigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal($this$toBigDecimal, mathContext);
    }

    public static final BigDecimal toBigDecimalOrNull(String $this$toBigDecimalOrNull) {
        Intrinsics.checkNotNullParameter($this$toBigDecimalOrNull, "<this>");
        if (isValidFloat$StringsKt__StringNumberConversionsJVMKt($this$toBigDecimalOrNull) == false) goto L15;
        return new BigDecimal($this$toBigDecimalOrNull);
    L15:
        return null;
    L11:
        return null;
    }

    public static final BigDecimal toBigDecimalOrNull(String $this$toBigDecimalOrNull, MathContext mathContext) {
        Intrinsics.checkNotNullParameter($this$toBigDecimalOrNull, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        if (isValidFloat$StringsKt__StringNumberConversionsJVMKt($this$toBigDecimalOrNull) == false) goto L15;
        return new BigDecimal($this$toBigDecimalOrNull, mathContext);
    L15:
        return null;
    L11:
        return null;
    }

    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, Function1<? super String, ? extends T> r4) {
        if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str) == false) goto L14;
        return r4.invoke(str);
    L14:
        return null;
    L10:
        return null;
    }

    private static final boolean isValidFloat$StringsKt__StringNumberConversionsJVMKt(String s) {
        boolean r3 = true;
        int endInclusive = s.length() - 1;
        int start = 0;
    L3:
        char r5 = ' ';
        if (start > endInclusive) goto L11;
        char it = s.charAt(start);
        if (it > ' ') goto L8;
        char it2 = 1;
    L9:
        if (it2 == 0) goto L11;
        start = start + 1;
        goto L3
    L8:
        it2 = 0;
    L11:
        if (start <= endInclusive) goto L13;
        return false;
    L13:
        int endInclusive2 = endInclusive;
    L14:
        if (endInclusive2 <= start) goto L22;
        char it3 = s.charAt(endInclusive2);
        if (it3 > ' ') goto L18;
        char it4 = 1;
    L19:
        if (it4 == 0) goto L22;
        endInclusive2 = endInclusive2 - 1;
        goto L14
    L18:
        it4 = 0;
    L22:
        if (s.charAt(start) != 43) goto L24;
    L25:
        start = start + 1;
    L26:
        if (start <= endInclusive2) goto L28;
        return false;
    L28:
        boolean isHex = false;
        if (s.charAt(start) != '0') goto L95;
        int start2 = start + 1;
        if (start2 <= endInclusive2) goto L34;
        return true;
    L34:
        if ((s.charAt(start2) | ' ') != 120) goto L94;
        int start3 = start2 + 1;
        int r9 = start3;
    L37:
        if (r9 > endInclusive2) goto L53;
        char it5 = s.charAt(r9);
        boolean r18 = r3;
        if (((it5 - '0') & SupportMenu.USER_MASK) >= 10) goto L41;
        boolean r4 = r18;
    L42:
        if (r4 == false) goto L44;
    L50:
        boolean r6 = r18;
    L51:
        if (r6 == false) goto L54;
        r9 = r9 + 1;
        r3 = r18;
    L54:
        if (start3 == r9) goto L56;
        boolean r7 = r18;
    L57:
        if (r9 <= endInclusive2) goto L61;
    L59:
        r9 = -1;
    L88:
        start = r9;
        if (start == (-1)) goto L93;
        if (start > endInclusive2) goto L93;
        isHex = true;
    L96:
        if (isHex == true) goto L144;
        int r8 = start;
    L98:
        if (r8 > endInclusive2) goto L105;
        char it6 = s.charAt(r8);
        if (((it6 - '0') & SupportMenu.USER_MASK) >= 10) goto L102;
        boolean r12 = r18;
    L103:
        if (r12 == false) goto L105;
        r8 = r8 + 1;
        goto L98
    L102:
        r12 = false;
    L105:
        if (start == r8) goto L107;
        boolean r10 = r18;
    L108:
        if (r8 <= endInclusive2) goto L111;
    L139:
        start = r8;
        if (start != (-1)) goto L142;
        return false;
    L142:
        if (start <= endInclusive2) goto L144;
        return r18;
    L111:
        if (s.charAt(r8) != '.') goto L123;
        int r11 = r8 + 1;
        int r13 = r11;
    L113:
        if (r13 > endInclusive2) goto L120;
        char it7 = s.charAt(r13);
        if (((it7 - '0') & SupportMenu.USER_MASK) >= 10) goto L117;
        boolean r15 = r18;
    L118:
        if (r15 == false) goto L120;
        r13 = r13 + 1;
        goto L113
    L117:
        r15 = false;
    L120:
        if (r11 == r13) goto L122;
        boolean r14 = r18;
    L124:
        if (r10 == true) goto L138;
        if (r14 == true) goto L138;
        if (endInclusive2 != ((r13 + 3) - 1)) goto L130;
        String r16 = "NaN";
    L133:
        if (r16 != null) goto L136;
    L134:
        r8 = -1;
        goto L139
    L136:
        if (StringsKt.indexOf(s, r16, r13, false) != r13) goto L134;
        r8 = endInclusive2 + 1;
        goto L139
    L130:
        if (endInclusive2 != ((r13 + 8) - 1)) goto L132;
        r16 = "Infinity";
        goto L133
    L132:
        r16 = null;
    L138:
        r8 = r13;
        goto L139
    L122:
        r14 = false;
        goto L124
    L123:
        r13 = r8;
        r14 = false;
        goto L124
    L107:
        r10 = false;
    L144:
        int start4 = start + 1;
        int l = s.charAt(start) | 32;
        if (isHex == false) goto L147;
        int r17 = 112;
    L149:
        if (l == r17) goto L157;
        if (isHex == true) goto L156;
        if (l == 102) goto L153;
        if (l != 100) goto L156;
    L153:
        if (start4 <= endInclusive2) goto L156;
        return r18;
    L156:
        return false;
    L157:
        if (start4 <= endInclusive2) goto L160;
        return false;
    L160:
        if (s.charAt(start4) != '+') goto L162;
    L163:
        start4 = start4 + 1;
        if (start4 <= endInclusive2) goto L166;
        return false;
    L166:
        int start5 = start4;
    L167:
        if (start5 > endInclusive2) goto L174;
        char it8 = s.charAt(start5);
        if (((it8 - '0') & SupportMenu.USER_MASK) >= 10) goto L171;
        boolean r19 = r18;
    L172:
        if (r19 == false) goto L174;
        start5 = start5 + 1;
        goto L167
    L171:
        r19 = false;
    L174:
        if (start5 <= endInclusive2) goto L176;
        return r18;
    L176:
        if (start5 != endInclusive2) goto L183;
        int l2 = s.charAt(start5) | 32;
        if (l2 == 102) goto L199;
        if (l2 != 100) goto L182;
        return r18;
    L182:
        return false;
    L199:
        return r18;
    L183:
        return false;
    L162:
        if (s.charAt(start4) != '-') goto L166;
    L147:
        r17 = 101;
    L93:
        return false;
    L61:
        if (s.charAt(r9) != '.') goto L84;
        int r20 = r9 + 1;
        int r110 = r20;
    L63:
        if (r110 > endInclusive2) goto L80;
        char it9 = s.charAt(r110);
        char r21 = r5;
        if (((it9 - '0') & SupportMenu.USER_MASK) >= 10) goto L67;
        boolean r22 = r18;
    L68:
        if (r22 == false) goto L70;
    L76:
        boolean r23 = r18;
    L77:
        if (r23 == false) goto L80;
        r110 = r110 + 1;
        r5 = r21;
        goto L63
    L70:
        if ((((it9 | ' ') - 97) & SupportMenu.USER_MASK) >= 6) goto L72;
        boolean r24 = r18;
    L73:
        if (r24 == true) goto L76;
        r23 = false;
        goto L77
    L72:
        r24 = false;
        goto L73
    L67:
        r22 = false;
    L80:
        if (r20 == r110) goto L82;
        boolean r25 = r18;
    L83:
        r9 = r110;
    L85:
        if (r7 == true) goto L88;
        if (r25 == true) goto L88;
    L82:
        r25 = false;
        goto L83
    L84:
        r25 = false;
        goto L85
    L56:
        r7 = false;
        goto L57
    L44:
        if ((((it5 | ' ') - 97) & SupportMenu.USER_MASK) >= 6) goto L46;
        boolean r26 = r18;
    L47:
        if (r26 == true) goto L50;
        r6 = false;
        goto L51
    L46:
        r26 = false;
        goto L47
    L41:
        r4 = false;
        goto L42
    L53:
        r18 = r3;
        goto L54
    L94:
        r18 = true;
        start = start2 - 1;
        goto L96
    L95:
        r18 = true;
        goto L96
    L24:
        if (s.charAt(start) != '-') goto L26;
        goto L25
    }

    private static final String guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt(int start, int endInclusive) {
        if (endInclusive != ((start + 3) - 1)) goto L6;
        return "NaN";
    L6:
        if (endInclusive != ((start + 8) - 1)) goto L8;
        return "Infinity";
    L8:
        return null;
    }

    private static final boolean isAsciiDigit$StringsKt__StringNumberConversionsJVMKt(char $this$isAsciiDigit) {
        if ((($this$isAsciiDigit - '0') & SupportMenu.USER_MASK) >= 10) goto L5;
        return true;
    L5:
        return false;
    }

    private static final boolean isHexLetter$StringsKt__StringNumberConversionsJVMKt(char $this$isHexLetter) {
        if (((($this$isHexLetter | ' ') - 97) & SupportMenu.USER_MASK) >= 6) goto L5;
        return true;
    L5:
        return false;
    }

    private static final int asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt(char $this$asciiLetterToLowerCaseCode) {
        return $this$asciiLetterToLowerCaseCode | ' ';
    }

    private static final int advanceWhile$StringsKt__StringNumberConversionsJVMKt(String $this$advanceWhile, int start, int endInclusive, Function1<? super Character, Boolean> r5) {
        int start2 = start;
    L3:
        if (start2 > endInclusive) goto L7;
        if (r5.invoke(Character.valueOf($this$advanceWhile.charAt(start2))).booleanValue() == false) goto L7;
        start2 = start2 + 1;
    L7:
        return start2;
    }

    private static final int backtrackWhile$StringsKt__StringNumberConversionsJVMKt(String $this$backtrackWhile, int start, int endInclusive, Function1<? super Character, Boolean> r5) {
        int endInclusive2 = endInclusive;
    L3:
        if (endInclusive2 <= start) goto L7;
        if (r5.invoke(Character.valueOf($this$backtrackWhile.charAt(endInclusive2))).booleanValue() == false) goto L7;
        endInclusive2 = endInclusive2 - 1;
    L7:
        return endInclusive2;
    }

    private static final int advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt(String $this$advanceAndValidateMantissa, int start, int endInclusive, boolean hexFormat, Function1<? super Character, Boolean> r13) {
        int start2 = start;
    L3:
        if (start2 > endInclusive) goto L8;
        if (r13.invoke(Character.valueOf($this$advanceAndValidateMantissa.charAt(start2))).booleanValue() == false) goto L8;
        start2 = start2 + 1;
    L8:
        if (start == start2) goto L10;
        boolean hasIntegerPart = true;
    L12:
        if (start2 <= endInclusive) goto L17;
        if (hexFormat == false) goto L16;
        return -1;
    L16:
        return start2;
    L17:
        boolean hasFractionalPart = false;
        if ($this$advanceAndValidateMantissa.charAt(start2) != '.') goto L29;
        int start3 = start2 + 1;
        int r7 = start3;
    L20:
        if (r7 > endInclusive) goto L24;
        if (r13.invoke(Character.valueOf($this$advanceAndValidateMantissa.charAt(r7))).booleanValue() == false) goto L24;
        r7 = r7 + 1;
    L24:
        start2 = r7;
        if (start3 == start2) goto L27;
        boolean r8 = true;
    L28:
        hasFractionalPart = r8;
        goto L29
    L27:
        r8 = false;
    L29:
        if (hasIntegerPart == true) goto L46;
        if (hasFractionalPart == true) goto L46;
        if (hexFormat == false) goto L34;
        return -1;
    L34:
        if (endInclusive != ((start2 + 3) - 1)) goto L37;
        String constant = "NaN";
    L40:
        if (constant != null) goto L43;
        return -1;
    L43:
        if (StringsKt.indexOf($this$advanceAndValidateMantissa, constant, start2, false) == start2) goto L45;
        return -1;
    L45:
        return endInclusive + 1;
    L37:
        if (endInclusive != ((start2 + 8) - 1)) goto L39;
        constant = "Infinity";
        goto L40
    L39:
        constant = null;
    L46:
        return start2;
    L10:
        hasIntegerPart = false;
        goto L12
    }
}
