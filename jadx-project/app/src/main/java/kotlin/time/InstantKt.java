package kotlin.time;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: compiled from: Instant.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0006\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003\u001a\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0003\u001a'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a'\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a\u0010\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0015H\u0000\u001a\u0014\u0010'\u001a\u00020\u0015*\u00020\u00152\u0006\u0010%\u001a\u00020\u0001H\u0002\u001a\u0014\u0010-\u001a\u00020\u0012*\u00020\u00102\u0006\u0010.\u001a\u00020\u0015H\u0002\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\"\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0006\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0015X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"isDistantPast", "", "Lkotlin/time/Instant;", "isDistantPast$annotations", "(Lkotlin/time/Instant;)V", "(Lkotlin/time/Instant;)Z", "isDistantFuture", "isDistantFuture$annotations", "DISTANT_PAST_SECONDS", "", "DISTANT_FUTURE_SECONDS", "MIN_SECOND", "MAX_SECOND", "parseIso", "Lkotlin/time/InstantParseResult;", "isoString", "", "formatIso", "", "instant", "DAYS_PER_CYCLE", "", "DAYS_0000_TO_1970", "safeAddOrElse", "a", "b", "action", "Lkotlin/Function0;", "", "safeMultiplyOrElse", "SECONDS_PER_HOUR", "SECONDS_PER_MINUTE", "HOURS_PER_DAY", "SECONDS_PER_DAY", "NANOS_PER_SECOND", "NANOS_PER_MILLI", "MILLIS_PER_SECOND", "isLeapYear", "year", "monthLength", "POWERS_OF_TEN", "", "asciiDigitPositionsInIsoStringAfterYear", "colonsInIsoOffsetString", "asciiDigitsInIsoOffsetString", "truncateForErrorMessage", "maxLength", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class InstantKt {
    private static final int DAYS_0000_TO_1970 = 719528;
    private static final int DAYS_PER_CYCLE = 146097;
    private static final long DISTANT_FUTURE_SECONDS = 3093527980800L;
    private static final long DISTANT_PAST_SECONDS = -3217862419201L;
    private static final int HOURS_PER_DAY = 24;
    private static final long MAX_SECOND = 31556889864403199L;
    private static final int MILLIS_PER_SECOND = 1000;
    private static final long MIN_SECOND = -31557014167219200L;
    private static final int NANOS_PER_MILLI = 1000000;
    public static final int NANOS_PER_SECOND = 1000000000;
    private static final int[] POWERS_OF_TEN = null;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int[] asciiDigitPositionsInIsoStringAfterYear = null;
    private static final int[] asciiDigitsInIsoOffsetString = null;
    private static final int[] colonsInIsoOffsetString = null;

    public static final /* synthetic */ String access$formatIso(Instant instant) {
        return formatIso(instant);
    }

    public static final /* synthetic */ InstantParseResult access$parseIso(CharSequence isoString) {
        return parseIso(isoString);
    }

    public static final /* synthetic */ String access$truncateForErrorMessage(CharSequence $receiver, int maxLength) {
        return truncateForErrorMessage($receiver, maxLength);
    }

    public static /* synthetic */ void isDistantFuture$annotations(Instant r0) {
    }

    public static /* synthetic */ void isDistantPast$annotations(Instant r0) {
    }

    private static final boolean isDistantPast(Instant $this$isDistantPast) {
        Intrinsics.checkNotNullParameter($this$isDistantPast, "<this>");
        if ($this$isDistantPast.compareTo2(Instant.Companion.getDISTANT_PAST()) > 0) goto L5;
        return true;
    L5:
        return false;
    }

    private static final boolean isDistantFuture(Instant $this$isDistantFuture) {
        Intrinsics.checkNotNullParameter($this$isDistantFuture, "<this>");
        if ($this$isDistantFuture.compareTo2(Instant.Companion.getDISTANT_FUTURE()) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    private static final InstantParseResult.Failure parseIso$parseFailure(CharSequence $isoString, String error) {
        return new InstantParseResult.Failure(error + " when parsing an Instant from \"" + truncateForErrorMessage($isoString, 64) + Typography.quote, $isoString);
    }

    private static final InstantParseResult.Failure parseIso$expect(CharSequence $isoString, String what, int where, Function1<? super Character, Boolean> r6) {
        char c = $isoString.charAt(where);
        if (r6.invoke(Character.valueOf(c)).booleanValue() == false) goto L6;
        return null;
    L6:
        return parseIso$parseFailure($isoString, "Expected " + what + ", but got '" + c + "' at position " + where);
    }

    private static final InstantParseResult parseIso(CharSequence isoString) {
        int i = 0;
        if (isoString.length() != 0) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == true) goto L8;
        char c = isoString.charAt(0);
        switch(c) {
            case 43: goto L12;
            case 44: goto L11;
            case 45: goto L12;
            default: goto L11;
        };
    L11:
        c = ' ';
    L13:
        int yearStart = i;
        int absYear = 0;
    L15:
        if (i >= isoString.length()) goto L23;
        char r9 = isoString.charAt(i);
        if ('0' > r9) goto L20;
        if (r9 >= ':') goto L20;
        boolean r10 = true;
    L21:
        if (r10 == false) goto L23;
        absYear = (absYear * 10) + (isoString.charAt(i) - '0');
        i = i + 1;
    L20:
        r10 = false;
    L23:
        int yearStrLength = i - yearStart;
        if (yearStrLength > 10) goto L26;
        if (yearStrLength != 10) goto L33;
        if (Intrinsics.compare(isoString.charAt(yearStart), 50) < 0) goto L33;
        return parseIso$parseFailure(isoString, "Expected at most 9 digits for the year number or year 1000000000, got " + yearStrLength + " digits");
    L33:
        if (yearStrLength >= 4) goto L37;
        return parseIso$parseFailure(isoString, "The year number must be padded to 4 digits, got " + yearStrLength + " digits");
    L37:
        if (c != '+') goto L41;
        if (yearStrLength != 4) goto L41;
        return parseIso$parseFailure(isoString, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
    L41:
        if (c != ' ') goto L46;
        if (yearStrLength == 4) goto L46;
        return parseIso$parseFailure(isoString, "A '+' or '-' sign is required for year numbers longer than 4 digits");
    L46:
        if (c != '-') goto L48;
        int year = -absYear;
    L50:
        if (isoString.length() < (i + 16)) goto L52;
        InstantParseResult.Failure it = parseIso$expect(isoString, "'-'", i, new InstantKt$$ExternalSyntheticLambda0());
        if (it != null) goto L56;
        InstantParseResult.Failure it2 = parseIso$expect(isoString, "'-'", i + 3, new InstantKt$$ExternalSyntheticLambda1());
        if (it2 != null) goto L60;
        InstantParseResult.Failure it3 = parseIso$expect(isoString, "'T' or 't'", i + 6, new InstantKt$$ExternalSyntheticLambda2());
        if (it3 != null) goto L64;
        InstantParseResult.Failure it4 = parseIso$expect(isoString, "':'", i + 9, new InstantKt$$ExternalSyntheticLambda3());
        if (it4 != null) goto L68;
        InstantParseResult.Failure it5 = parseIso$expect(isoString, "':'", i + 12, new InstantKt$$ExternalSyntheticLambda4());
        if (it5 != null) goto L72;
        int[] r4 = asciiDigitPositionsInIsoStringAfterYear;
        int r6 = r4.length;
        int r15 = 0;
    L74:
        if (r15 >= r6) goto L80;
        InstantParseResult.Failure it6 = parseIso$expect(isoString, "an ASCII digit", i + r4[r15], new InstantKt$$ExternalSyntheticLambda5());
        if (it6 != null) goto L78;
        r15 = r15 + 1;
        goto L74
    L78:
        return it6;
    L80:
        int month = parseIso$twoDigitNumber(isoString, i + 1);
        int day = parseIso$twoDigitNumber(isoString, i + 4);
        int hour = parseIso$twoDigitNumber(isoString, i + 7);
        int minute = parseIso$twoDigitNumber(isoString, i + 10);
        int second = parseIso$twoDigitNumber(isoString, i + 13);
        if (isoString.charAt(i + 15) != '.') goto L104;
        int fractionStart = i + 16;
        int i2 = fractionStart;
        int fraction = 0;
    L83:
        char yearSign = c;
        if (i2 >= isoString.length()) goto L94;
        char r5 = isoString.charAt(i2);
        int yearStart2 = yearStart;
        if ('0' <= r5) goto L88;
    L90:
        boolean r7 = false;
    L91:
        if (r7 == false) goto L94;
        fraction = (fraction * 10) + (isoString.charAt(i2) - '0');
        i2 = i2 + 1;
        c = yearSign;
        yearStart = yearStart2;
        goto L83
    L88:
        if (r5 >= ':') goto L90;
        r7 = true;
    L94:
        int fractionStrLength = i2 - fractionStart;
        if (1 <= fractionStrLength) goto L97;
    L99:
        boolean r8 = false;
    L100:
        if (r8 == false) goto L103;
        int nanosecond = POWERS_OF_TEN[9 - fractionStrLength] * fraction;
    L106:
        if (i2 >= isoString.length()) goto L108;
        char sign = isoString.charAt(i2);
        switch(sign) {
            case 43: goto L118;
            case 45: goto L118;
            case 90: goto L114;
            case 122: goto L114;
            default: goto L112;
        };
    L118:
        int offsetStrLength = isoString.length() - i2;
        if (offsetStrLength <= 9) goto L123;
        return parseIso$parseFailure(isoString, "The UTC offset string \"" + truncateForErrorMessage(isoString.subSequence(i2, isoString.length()).toString(), 16) + "\" is too long");
    L123:
        if ((offsetStrLength % 3) != 0) goto L125;
        int[] r12 = colonsInIsoOffsetString;
        int r11 = r12.length;
        int absYear2 = 0;
    L127:
        if (absYear2 >= r11) goto L136;
        int j = r12[absYear2];
        int r28 = r11;
        int r29 = absYear2;
        if ((i2 + j) >= isoString.length()) goto L136;
        if (isoString.charAt(i2 + j) != ':') goto L134;
        absYear2 = r29 + 1;
        r11 = r28;
        goto L127
    L134:
        return parseIso$parseFailure(isoString, "Expected ':' at index " + (i2 + j) + ", got '" + isoString.charAt(i2 + j) + '\'');
    L136:
        int[] r13 = asciiDigitsInIsoOffsetString;
        int r14 = r13.length;
        int r16 = 0;
    L137:
        if (r16 >= r14) goto L152;
        int j2 = r13[r16];
        int[] r210 = r13;
        int r211 = r14;
        if ((i2 + j2) >= isoString.length()) goto L152;
        char r17 = isoString.charAt(i2 + j2);
        if ('0' > r17) goto L147;
        if (r17 >= ':') goto L147;
        boolean r18 = true;
    L148:
        if (r18 == false) goto L150;
        r16 = r16 + 1;
        r13 = r210;
        r14 = r211;
        goto L137
    L150:
        return parseIso$parseFailure(isoString, "Expected an ASCII digit at index " + (i2 + j2) + ", got '" + isoString.charAt(i2 + j2) + '\'');
    L147:
        r18 = false;
    L152:
        int offsetHour = parseIso$twoDigitNumber(isoString, i2 + 1);
        if (offsetStrLength <= 3) goto L155;
        int offsetMinute = parseIso$twoDigitNumber(isoString, i2 + 4);
    L157:
        if (offsetStrLength <= 6) goto L159;
        int offsetSecond = parseIso$twoDigitNumber(isoString, i2 + 7);
    L161:
        if (offsetMinute <= 59) goto L165;
        return parseIso$parseFailure(isoString, "Expected offset-minute-of-hour in 0..59, got " + offsetMinute);
    L165:
        if (offsetSecond <= 59) goto L169;
        return parseIso$parseFailure(isoString, "Expected offset-second-of-minute in 0..59, got " + offsetSecond);
    L169:
        if (offsetHour > 17) goto L171;
    L176:
        int r19 = ((offsetHour * SECONDS_PER_HOUR) + (offsetMinute * 60)) + offsetSecond;
        if (sign != '-') goto L179;
        int r110 = -1;
    L180:
        int yearStrLength2 = r19 * r110;
    L182:
        if (1 <= month) goto L184;
    L186:
        boolean r20 = false;
    L187:
        if (r20 == true) goto L191;
        return parseIso$parseFailure(isoString, "Expected a month number in 1..12, got " + month);
    L191:
        if (1 <= day) goto L193;
    L195:
        boolean r111 = false;
    L196:
        if (r111 == true) goto L200;
        return parseIso$parseFailure(isoString, "Expected a valid day-of-month for month " + month + " of year " + year + ", got " + day);
    L200:
        if (hour <= 23) goto L204;
        return parseIso$parseFailure(isoString, "Expected hour in 0..23, got " + hour);
    L204:
        if (minute <= 59) goto L208;
        return parseIso$parseFailure(isoString, "Expected minute-of-hour in 0..59, got " + minute);
    L208:
        if (second > 59) goto L210;
        UnboundLocalDateTime this_$iv = new UnboundLocalDateTime(year, month, day, hour, minute, second, nanosecond);
        long y$iv = this_$iv.getYear();
        long total$iv = 365 * y$iv;
        if (y$iv < 0) goto L214;
        long total$iv2 = total$iv + ((((y$iv + 3) / 4) - ((y$iv + 99) / 100)) + ((y$iv + 399) / 400));
    L215:
        long total$iv3 = (total$iv2 + ((long) (((this_$iv.getMonth() * 367) - 362) / 12))) + ((long) (this_$iv.getDay() - 1));
        if (this_$iv.getMonth() <= 2) goto L220;
        total$iv3 = total$iv3 - 1;
        if (isLeapYear(this_$iv.getYear()) == true) goto L220;
        total$iv3 = total$iv3 - 1;
    L220:
        long epochDays$iv = total$iv3 - 719528;
        int daySeconds$iv = ((this_$iv.getHour() * SECONDS_PER_HOUR) + (this_$iv.getMinute() * 60)) + this_$iv.getSecond();
        long epochSeconds$iv = ((86400 * epochDays$iv) + ((long) daySeconds$iv)) - ((long) yearStrLength2);
        int p1 = this_$iv.getNanosecond();
        return new InstantParseResult.Success(epochSeconds$iv, p1);
    L214:
        total$iv2 = total$iv - (((y$iv / (-4)) - (y$iv / (-100))) + (y$iv / (-400)));
        goto L215
    L210:
        return parseIso$parseFailure(isoString, "Expected second-of-minute in 0..59, got " + second);
    L193:
        if (day > monthLength(month, isLeapYear(year))) goto L195;
        r111 = true;
        goto L196
    L184:
        if (month >= 13) goto L186;
        r20 = true;
        goto L187
    L179:
        r110 = 1;
        goto L180
    L171:
        if (offsetHour != 18) goto L175;
        if (offsetMinute != 0) goto L175;
        if (offsetSecond == 0) goto L176;
    L175:
        return parseIso$parseFailure(isoString, "Expected an offset in -18:00..+18:00, got " + isoString.subSequence(i2, isoString.length()).toString());
    L159:
        offsetSecond = 0;
        goto L161
    L155:
        offsetMinute = 0;
        goto L157
    L125:
        return parseIso$parseFailure(isoString, "Invalid UTC offset string \"" + isoString.subSequence(i2, isoString.length()).toString() + Typography.quote);
    L112:
        return parseIso$parseFailure(isoString, "Expected the UTC offset at position " + i2 + ", got '" + sign + '\'');
    L114:
        if (isoString.length() != (i2 + 1)) goto L117;
        yearStrLength2 = 0;
        goto L182
    L117:
        return parseIso$parseFailure(isoString, "Extra text after the instant at position " + (i2 + 1));
    L108:
        return parseIso$parseFailure(isoString, "The UTC offset at the end of the string is missing");
    L103:
        return parseIso$parseFailure(isoString, "1..9 digits are supported for the fraction of the second, got " + fractionStrLength + " digits");
    L97:
        if (fractionStrLength >= 10) goto L99;
        r8 = true;
        goto L100
    L104:
        i2 = i + 15;
        nanosecond = 0;
        goto L106
    L72:
        return it5;
    L68:
        return it4;
    L64:
        return it3;
    L60:
        return it2;
    L56:
        return it;
    L52:
        return parseIso$parseFailure(isoString, "The input string is too short");
    L48:
        year = absYear;
        goto L50
    L26:
        return parseIso$parseFailure(isoString, "Expected at most 10 digits for the year number, got " + yearStrLength + " digits");
    L12:
        i = 0 + 1;
        goto L13
    L8:
        return new InstantParseResult.Failure("An empty string is not a valid Instant", isoString);
    L5:
        r3 = false;
        goto L6
    }

    static final boolean parseIso$lambda$0(char it) {
        if (it != '-') goto L5;
        return true;
    L5:
        return false;
    }

    static final boolean parseIso$lambda$2(char it) {
        if (it != '-') goto L5;
        return true;
    L5:
        return false;
    }

    static final boolean parseIso$lambda$4(char it) {
        if (it != 'T') goto L5;
    L8:
        return true;
    L5:
        if (it == 't') goto L8;
        return false;
    }

    static final boolean parseIso$lambda$6(char it) {
        if (it != ':') goto L5;
        return true;
    L5:
        return false;
    }

    static final boolean parseIso$lambda$8(char it) {
        if (it != ':') goto L5;
        return true;
    L5:
        return false;
    }

    static final boolean parseIso$lambda$10(char it) {
        if ('0' <= it) goto L5;
        return false;
    L5:
        if (it >= ':') goto L9;
        return true;
    L9:
        return false;
    }

    private static final int parseIso$twoDigitNumber(CharSequence s, int index) {
        return ((s.charAt(index) - '0') * 10) + (s.charAt(index + 1) - '0');
    }

    private static final String formatIso(Instant instant) {
        StringBuilder $this$formatIso_u24lambda_u2413 = new StringBuilder();
        UnboundLocalDateTime ldt = UnboundLocalDateTime.Companion.fromInstant(instant);
        int number = ldt.getYear();
        if (Math.abs(number) >= 1000) goto L10;
        StringBuilder innerBuilder = new StringBuilder();
        if (number < 0) goto L7;
        Intrinsics.checkNotNullExpressionValue(innerBuilder.append(number + 10000).deleteCharAt(0), "deleteCharAt(...)");
    L8:
        $this$formatIso_u24lambda_u2413.append(innerBuilder);
    L13:
        $this$formatIso_u24lambda_u2413.append('-');
        formatIso$lambda$13$appendTwoDigits($this$formatIso_u24lambda_u2413, $this$formatIso_u24lambda_u2413, ldt.getMonth());
        $this$formatIso_u24lambda_u2413.append('-');
        formatIso$lambda$13$appendTwoDigits($this$formatIso_u24lambda_u2413, $this$formatIso_u24lambda_u2413, ldt.getDay());
        $this$formatIso_u24lambda_u2413.append('T');
        formatIso$lambda$13$appendTwoDigits($this$formatIso_u24lambda_u2413, $this$formatIso_u24lambda_u2413, ldt.getHour());
        $this$formatIso_u24lambda_u2413.append(':');
        formatIso$lambda$13$appendTwoDigits($this$formatIso_u24lambda_u2413, $this$formatIso_u24lambda_u2413, ldt.getMinute());
        $this$formatIso_u24lambda_u2413.append(':');
        formatIso$lambda$13$appendTwoDigits($this$formatIso_u24lambda_u2413, $this$formatIso_u24lambda_u2413, ldt.getSecond());
        if (ldt.getNanosecond() == 0) goto L20;
        $this$formatIso_u24lambda_u2413.append('.');
        int zerosToStrip = 0;
    L17:
        if ((ldt.getNanosecond() % POWERS_OF_TEN[zerosToStrip + 1]) != 0) goto L19;
        zerosToStrip = zerosToStrip + 1;
        goto L17
    L19:
        int zerosToStrip2 = zerosToStrip - (zerosToStrip % 3);
        int numberToOutput = ldt.getNanosecond() / POWERS_OF_TEN[zerosToStrip2];
        String r6 = String.valueOf(POWERS_OF_TEN[9 - zerosToStrip2] + numberToOutput);
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type java.lang.String");
        String r7 = r6.substring(1);
        Intrinsics.checkNotNullExpressionValue(r7, "substring(...)");
        $this$formatIso_u24lambda_u2413.append(r7);
    L20:
        $this$formatIso_u24lambda_u2413.append('Z');
        return $this$formatIso_u24lambda_u2413.toString();
    L7:
        Intrinsics.checkNotNullExpressionValue(innerBuilder.append(number - 10000).deleteCharAt(1), "deleteCharAt(...)");
        goto L8
    L10:
        if (number < 10000) goto L12;
        $this$formatIso_u24lambda_u2413.append('+');
    L12:
        $this$formatIso_u24lambda_u2413.append(number);
        goto L13
    }

    private static final void formatIso$lambda$13$appendTwoDigits(Appendable $this$formatIso_u24lambda_u2413_u24appendTwoDigits, StringBuilder $this_buildString, int number) {
        if (number >= 10) goto L5;
        $this$formatIso_u24lambda_u2413_u24appendTwoDigits.append('0');
    L5:
        $this_buildString.append(number);
    }

    private static final long safeAddOrElse(long a, long b, Function0 action) {
        long sum = a + b;
        if ((a ^ sum) < 0) goto L5;
    L9:
        return sum;
    L5:
        if ((a ^ b) < 0) goto L9;
        action.invoke();
        throw new KotlinNothingValueException();
    }

    private static final long safeMultiplyOrElse(long a, long b, Function0 action) {
        if (b != 1) goto L6;
        return a;
    L6:
        if (a != 1) goto L9;
        return b;
    L9:
        if (a != 0) goto L11;
    L26:
        return 0;
    L11:
        if (b == 0) goto L26;
        long total = a * b;
        if ((total / b) == a) goto L16;
    L24:
        action.invoke();
        throw new KotlinNothingValueException();
    L16:
        if (a != Long.MIN_VALUE) goto L20;
        if (b == (-1)) goto L24;
    L20:
        if (b == Long.MIN_VALUE) goto L22;
    L23:
        return total;
    L22:
        if (a == (-1)) goto L24;
        goto L23
    }

    public static final boolean isLeapYear(int year) {
        if ((year & 3) == 0) goto L5;
    L9:
        return false;
    L5:
        if ((year % 100) == 0) goto L7;
    L8:
        return true;
    L7:
        if ((year % 400) != 0) goto L9;
        goto L8
    }

    private static final int monthLength(int $this$monthLength, boolean isLeapYear) {
        switch($this$monthLength) {
            case 2: goto L5;
            case 4: goto L4;
            case 6: goto L4;
            case 9: goto L4;
            case 11: goto L4;
            default: goto L3;
        };
    L3:
        return 31;
    L4:
        return 30;
    L5:
        if (isLeapYear == false) goto L7;
        return 29;
    L7:
        return 28;
    }

    static {
        POWERS_OF_TEN = new int[]{1, 10, 100, 1000, 10000, AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, 1000000, 10000000, 100000000, NANOS_PER_SECOND};
        asciiDigitPositionsInIsoStringAfterYear = new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
        colonsInIsoOffsetString = new int[]{3, 6};
        asciiDigitsInIsoOffsetString = new int[]{1, 2, 4, 5, 7, 8};
    }

    private static final String truncateForErrorMessage(CharSequence $this$truncateForErrorMessage, int maxLength) {
        if ($this$truncateForErrorMessage.length() > maxLength) goto L6;
        return $this$truncateForErrorMessage.toString();
    L6:
        return $this$truncateForErrorMessage.subSequence(0, maxLength).toString() + "...";
    }
}
