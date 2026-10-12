package kotlin.time;

import androidx.compose.animation.core.AnimationKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0015\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015\u001a\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a)\u0010\u0017\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140\u001aH\u0082\b\u001a)\u0010\u001c\u001a\u00020\u0002*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140\u001aH\u0082\b\u001a\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0002\u001a\u0010\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0002\u001a\u0015\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'\u001a\u0015\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'\u001a\u001d\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010-\u001a\u0015\u0010.\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'\u001a\u0015\u0010/\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'\"\u000e\u0010\u001d\u001a\u00020\u0002X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"toDuration", "Lkotlin/time/Duration;", "", "unit", "Lkotlin/time/DurationUnit;", "(ILkotlin/time/DurationUnit;)J", "", "(JLkotlin/time/DurationUnit;)J", "", "(DLkotlin/time/DurationUnit;)J", "times", "duration", "times-mvk6XK0", "(IJ)J", "times-kIfJnKk", "(DJ)J", "parseDuration", "value", "", "strictIso", "", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "substringWhile", "startIndex", "predicate", "Lkotlin/Function1;", "", "skipWhile", "NANOS_IN_MILLIS", "MAX_NANOS", "MAX_MILLIS", "MAX_NANOS_IN_MILLIS", "nanosToMillis", "nanos", "millisToNanos", "millis", "durationOfNanos", "normalNanos", "(J)J", "durationOfMillis", "normalMillis", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfNanosNormalized", "durationOfMillisNormalized", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final /* synthetic */ long access$durationOf(long normalValue, int unitDiscriminator) {
        return durationOf(normalValue, unitDiscriminator);
    }

    public static final /* synthetic */ long access$durationOfMillis(long normalMillis) {
        return durationOfMillis(normalMillis);
    }

    public static final /* synthetic */ long access$durationOfMillisNormalized(long millis) {
        return durationOfMillisNormalized(millis);
    }

    public static final /* synthetic */ long access$durationOfNanos(long normalNanos) {
        return durationOfNanos(normalNanos);
    }

    public static final /* synthetic */ long access$durationOfNanosNormalized(long nanos) {
        return durationOfNanosNormalized(nanos);
    }

    public static final /* synthetic */ long access$millisToNanos(long millis) {
        return millisToNanos(millis);
    }

    public static final /* synthetic */ long access$nanosToMillis(long nanos) {
        return nanosToMillis(nanos);
    }

    public static final /* synthetic */ long access$parseDuration(String value, boolean strictIso) {
        return parseDuration(value, strictIso);
    }

    public static final long toDuration(int $this$toDuration, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (unit.compareTo(DurationUnit.SECONDS) > 0) goto L6;
        return durationOfNanos(DurationUnitKt.convertDurationUnitOverflow($this$toDuration, unit, DurationUnit.NANOSECONDS));
    L6:
        return toDuration($this$toDuration, unit);
    }

    public static final long toDuration(long $this$toDuration, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long maxNsInUnit = DurationUnitKt.convertDurationUnitOverflow(MAX_NANOS, DurationUnit.NANOSECONDS, unit);
        boolean r3 = false;
        if ((-maxNsInUnit) <= $this$toDuration) goto L5;
    L7:
        if (r3 == true) goto L9;
        long millis = DurationUnitKt.convertDurationUnit($this$toDuration, unit, DurationUnit.MILLISECONDS);
        return durationOfMillis(RangesKt.coerceIn(millis, -4611686018427387903L, 4611686018427387903L));
    L9:
        return durationOfNanos(DurationUnitKt.convertDurationUnitOverflow($this$toDuration, unit, DurationUnit.NANOSECONDS));
    L5:
        if ($this$toDuration > maxNsInUnit) goto L7;
        r3 = true;
        goto L7
    }

    public static final long toDuration(double $this$toDuration, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double valueInNs = DurationUnitKt.convertDurationUnit($this$toDuration, unit, DurationUnit.NANOSECONDS);
        if (Double.isNaN(valueInNs) == true) goto L14;
        long nanos = MathKt.roundToLong(valueInNs);
        boolean r5 = false;
        if ((-4611686018426999999L) <= nanos) goto L7;
    L9:
        if (r5 == false) goto L11;
        long millis = durationOfNanos(nanos);
        return millis;
    L11:
        long millis2 = MathKt.roundToLong(DurationUnitKt.convertDurationUnit($this$toDuration, unit, DurationUnit.MILLISECONDS));
        return durationOfMillisNormalized(millis2);
    L7:
        if (nanos >= 4611686018427000000L) goto L9;
        r5 = true;
        goto L9
    L14:
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    /* JADX INFO: renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m8861timesmvk6XK0(int $this$times_u2dmvk6XK0, long duration) {
        return Duration.m8795timesUwyO8pc(duration, $this$times_u2dmvk6XK0);
    }

    /* JADX INFO: renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m8860timeskIfJnKk(double $this$times_u2dkIfJnKk, long duration) {
        return Duration.m8794timesUwyO8pc(duration, $this$times_u2dkIfJnKk);
    }

    private static final long parseDuration(String value, boolean strictIso) {
        String component = value;
        int length = component.length();
        if (length == 0) goto L182;
        int index = 0;
        long result = Duration.Companion.m8855getZEROUwyO8pc();
        String infinityString = "Infinity";
        switch(component.charAt(0)) {
            case 43: goto L7;
            case 44: goto L9;
            case 45: goto L7;
            default: goto L9;
        };
    L7:
        index = 0 + 1;
    L9:
        if (index <= 0) goto L11;
        boolean r3 = true;
    L12:
        boolean hasSign = r3;
        if (hasSign == true) goto L15;
    L17:
        boolean r5 = false;
    L18:
        boolean isNegative = r5;
        if (length <= index) goto L180;
        if (component.charAt(index) != 'P') goto L85;
        int index2 = index + 1;
        if (index2 == length) goto L83;
        String nonDigitSymbols = "+-.";
        boolean isTimeComponent = false;
        DurationUnit prevUnit = null;
    L25:
        if (index2 >= length) goto L173;
        if (component.charAt(index2) == 'T') goto L28;
        int $i$f$substringWhile = 0;
        String nonDigitSymbols2 = value;
        int i$iv$iv = index2;
    L35:
        String infinityString2 = infinityString;
        if (i$iv$iv >= nonDigitSymbols2.length()) goto L52;
        String $this$skipWhile$iv$iv = nonDigitSymbols2;
        String $this$skipWhile$iv$iv2 = nonDigitSymbols;
        char it = $this$skipWhile$iv$iv.charAt(i$iv$iv);
        if ('0' <= it) goto L40;
    L42:
        boolean r2 = false;
    L43:
        if (r2 == true) goto L48;
        int length2 = length;
        int $i$f$substringWhile2 = $i$f$substringWhile;
        boolean hasSign2 = hasSign;
        if (StringsKt.contains$default($this$skipWhile$iv$iv2, it, false, 2, null) == true) goto L49;
        boolean r4 = false;
    L50:
        if (r4 == false) goto L53;
        i$iv$iv = i$iv$iv + 1;
        $i$f$substringWhile = $i$f$substringWhile2;
        hasSign = hasSign2;
        nonDigitSymbols = $this$skipWhile$iv$iv2;
        infinityString = infinityString2;
        nonDigitSymbols2 = $this$skipWhile$iv$iv;
        length = length2;
    L53:
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type java.lang.String");
        String component2 = value.substring(index2, i$iv$iv);
        Intrinsics.checkNotNullExpressionValue(component2, "substring(...)");
        if (component2.length() != 0) goto L56;
        boolean r6 = true;
    L57:
        if (r6 == true) goto L80;
        int index3 = index2 + component2.length();
        String r7 = value;
        if (index3 >= 0) goto L61;
    L63:
        boolean r8 = false;
    L64:
        if (r8 == false) goto L78;
        char unitChar = r7.charAt(index3);
        index2 = index3 + 1;
        DurationUnit unit = DurationUnitKt.durationUnitByIsoChar(unitChar, isTimeComponent);
        if (prevUnit != null) goto L68;
    L72:
        prevUnit = unit;
        int dotIndex = StringsKt.indexOf$default(component2, '.', 0, false, 6, null);
        if (unit != DurationUnit.SECONDS) goto L76;
        if (dotIndex <= 0) goto L76;
        Intrinsics.checkNotNull(component2, "null cannot be cast to non-null type java.lang.String");
        String whole = component2.substring(0, dotIndex);
        Intrinsics.checkNotNullExpressionValue(whole, "substring(...)");
        long result2 = Duration.m8793plusLRDsOJo(result, toDuration(parseOverLongIsoComponent(whole), unit));
        Intrinsics.checkNotNull(component2, "null cannot be cast to non-null type java.lang.String");
        String r10 = component2.substring(dotIndex);
        Intrinsics.checkNotNullExpressionValue(r10, "substring(...)");
        result = Duration.m8793plusLRDsOJo(result2, toDuration(Double.parseDouble(r10), unit));
        component = value;
        hasSign = hasSign2;
        nonDigitSymbols = $this$skipWhile$iv$iv2;
        infinityString = infinityString2;
        length = length2;
    L76:
        result = Duration.m8793plusLRDsOJo(result, toDuration(parseOverLongIsoComponent(component2), unit));
        component = value;
        hasSign = hasSign2;
        nonDigitSymbols = $this$skipWhile$iv$iv2;
        infinityString = infinityString2;
        length = length2;
        goto L25
    L68:
        if (prevUnit.compareTo(unit) > 0) goto L72;
        throw new IllegalArgumentException("Unexpected order of duration components");
    L78:
        throw new IllegalArgumentException("Missing unit for value " + component2);
    L61:
        if (index3 >= r7.length()) goto L63;
        r8 = true;
        goto L64
    L80:
        throw new IllegalArgumentException();
    L56:
        r6 = false;
    L49:
        r4 = true;
        goto L50
    L48:
        length2 = length;
        $i$f$substringWhile2 = $i$f$substringWhile;
        hasSign2 = hasSign;
        goto L49
    L40:
        if (it >= ':') goto L42;
        r2 = true;
        goto L43
    L52:
        length2 = length;
        hasSign2 = hasSign;
        $this$skipWhile$iv$iv2 = nonDigitSymbols;
        goto L53
    L28:
        if (isTimeComponent == true) goto L33;
        index2 = index2 + 1;
        if (index2 == length) goto L33;
        isTimeComponent = true;
    L33:
        throw new IllegalArgumentException();
    L173:
        if (isNegative == false) goto L176;
        return Duration.m8808unaryMinusUwyO8pc(result);
    L176:
        return result;
    L83:
        throw new IllegalArgumentException();
    L85:
        if (strictIso == true) goto L178;
        String infinityString3 = "Infinity";
        if (StringsKt.regionMatches(value, index, infinityString3, 0, Math.max(length - index, "Infinity".length()), true) == false) goto L89;
        result = Duration.Companion.m8853getINFINITEUwyO8pc();
        goto L173
    L89:
        DurationUnit prevUnit2 = null;
        boolean afterFirst = false;
        if (hasSign == true) goto L92;
        boolean allowSpaces = true;
    L93:
        if (hasSign == true) goto L95;
    L103:
        int length3 = length;
    L104:
        if (index >= length3) goto L173;
        if (afterFirst == false) goto L118;
        if (allowSpaces == false) goto L118;
        int i$iv = index;
    L109:
        if (i$iv >= value.length()) goto L117;
        int index4 = index;
        if (value.charAt(i$iv) != ' ') goto L113;
        char it2 = 1;
    L114:
        if (it2 == 0) goto L117;
        i$iv = i$iv + 1;
        index = index4;
        goto L109
    L113:
        it2 = 0;
    L117:
        int index5 = i$iv;
    L119:
        boolean afterFirst2 = true;
        int $i$f$substringWhile3 = 0;
        infinityString3 = infinityString3;
        int i$iv$iv2 = index5;
    L120:
        afterFirst = afterFirst2;
        if (i$iv$iv2 >= value.length()) goto L138;
        char it3 = value.charAt(i$iv$iv2);
        int $i$f$substringWhile4 = $i$f$substringWhile3;
        if ('0' > it3) goto L128;
        if (it3 >= ':') goto L128;
        boolean r18 = true;
    L129:
        if (r18 == false) goto L131;
    L134:
        char it4 = 1;
    L135:
        if (it4 == 0) goto L138;
        i$iv$iv2 = i$iv$iv2 + 1;
        afterFirst2 = afterFirst;
        $i$f$substringWhile3 = $i$f$substringWhile4;
        goto L120
    L131:
        if (it3 == '.') goto L134;
        it4 = 0;
    L128:
        r18 = false;
    L138:
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type java.lang.String");
        String component3 = value.substring(index5, i$iv$iv2);
        Intrinsics.checkNotNullExpressionValue(component3, "substring(...)");
        if (component3.length() != 0) goto L141;
        boolean r0 = true;
    L142:
        if (r0 == true) goto L171;
        int index6 = index5 + component3.length();
        int $i$f$substringWhile5 = 0;
        String $this$skipWhile$iv$iv3 = value;
        int i$iv$iv3 = index6;
    L144:
        int $i$f$substringWhile6 = $i$f$substringWhile5;
        int $i$f$substringWhile7 = $this$skipWhile$iv$iv3.length();
        if (i$iv$iv3 >= $i$f$substringWhile7) goto L155;
        char it5 = $this$skipWhile$iv$iv3.charAt(i$iv$iv3);
        String $this$skipWhile$iv$iv4 = $this$skipWhile$iv$iv3;
        if ('a' <= it5) goto L149;
    L151:
        char it6 = 0;
    L152:
        if (it6 == 0) goto L155;
        i$iv$iv3 = i$iv$iv3 + 1;
        $i$f$substringWhile5 = $i$f$substringWhile6;
        $this$skipWhile$iv$iv3 = $this$skipWhile$iv$iv4;
        goto L144
    L149:
        if (it5 >= '{') goto L151;
        it6 = 1;
    L155:
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type java.lang.String");
        String unitName = value.substring(index6, i$iv$iv3);
        Intrinsics.checkNotNullExpressionValue(unitName, "substring(...)");
        index = index6 + unitName.length();
        DurationUnit unit2 = DurationUnitKt.durationUnitByShortName(unitName);
        if (prevUnit2 != null) goto L158;
    L162:
        prevUnit2 = unit2;
        int dotIndex2 = StringsKt.indexOf$default(component3, '.', 0, false, 6, null);
        if (dotIndex2 > 0) goto L164;
        result = Duration.m8793plusLRDsOJo(result, toDuration(Long.parseLong(component3), unit2));
        goto L104
    L164:
        Intrinsics.checkNotNull(component3, "null cannot be cast to non-null type java.lang.String");
        String whole2 = component3.substring(0, dotIndex2);
        Intrinsics.checkNotNullExpressionValue(whole2, "substring(...)");
        long result3 = Duration.m8793plusLRDsOJo(result, toDuration(Long.parseLong(whole2), unit2));
        Intrinsics.checkNotNull(component3, "null cannot be cast to non-null type java.lang.String");
        String r13 = component3.substring(dotIndex2);
        Intrinsics.checkNotNullExpressionValue(r13, "substring(...)");
        result = Duration.m8793plusLRDsOJo(result3, toDuration(Double.parseDouble(r13), unit2));
        if (index >= length3) goto L104;
        throw new IllegalArgumentException("Fractional component must be last");
    L158:
        if (prevUnit2.compareTo(unit2) > 0) goto L162;
        throw new IllegalArgumentException("Unexpected order of duration components");
    L171:
        throw new IllegalArgumentException();
    L141:
        r0 = false;
    L118:
        index5 = index;
        goto L119
    L95:
        if (value.charAt(index) != '(') goto L103;
        if (StringsKt.last(value) != ')') goto L103;
        allowSpaces = true;
        index = index + 1;
        length3 = length - 1;
        if (index != length3) goto L104;
        throw new IllegalArgumentException("No components");
    L92:
        allowSpaces = false;
        goto L93
    L178:
        throw new IllegalArgumentException();
    L180:
        throw new IllegalArgumentException("No components");
    L15:
        if (StringsKt.startsWith$default(component, '-', false, 2, null) == false) goto L17;
        r5 = true;
        goto L18
    L11:
        r3 = false;
        goto L12
    L182:
        throw new IllegalArgumentException("The string is empty");
    }

    private static final long parseOverLongIsoComponent(String value) {
        int length = value.length();
        int startIndex = 0;
        boolean r4 = false;
        if (length <= 0) goto L8;
        if (StringsKt.contains$default("+-", value.charAt(0), false, 2, null) == false) goto L8;
        startIndex = 0 + 1;
    L8:
        if ((length - startIndex) <= 16) goto L31;
        int firstNonZero = startIndex;
        int index = startIndex;
    L10:
        if (index >= length) goto L22;
        char r12 = value.charAt(index);
        if (r12 != '0') goto L16;
        if (firstNonZero != index) goto L21;
        firstNonZero = firstNonZero + 1;
    L21:
        index = index + 1;
        goto L10
    L16:
        if ('1' > r12) goto L19;
        if (r12 >= ':') goto L19;
        boolean r13 = true;
    L20:
        if (r13 == false) goto L31;
    L19:
        r13 = false;
        goto L20
    L22:
        int index2 = length - firstNonZero;
        if (index2 <= 16) goto L31;
        if (value.charAt(0) != '-') goto L27;
        return Long.MIN_VALUE;
    L27:
        return Long.MAX_VALUE;
    L31:
        if (StringsKt.startsWith$default(value, "+", false, 2, null) == false) goto L40;
        if (length <= 1) goto L40;
        char r2 = value.charAt(1);
        if ('0' > r2) goto L37;
        if (r2 >= ':') goto L37;
        r4 = true;
    L37:
        if (r4 == false) goto L40;
        return Long.parseLong(StringsKt.drop(value, 1));
    L40:
        return Long.parseLong(value);
    }

    private static final String substringWhile(String $this$substringWhile, int startIndex, Function1<? super Character, Boolean> r7) {
        int i$iv = startIndex;
    L4:
        if (i$iv >= $this$substringWhile.length()) goto L8;
        if (r7.invoke(Character.valueOf($this$substringWhile.charAt(i$iv))).booleanValue() == false) goto L8;
        i$iv = i$iv + 1;
    L8:
        Intrinsics.checkNotNull($this$substringWhile, "null cannot be cast to non-null type java.lang.String");
        String r1 = $this$substringWhile.substring(startIndex, i$iv);
        Intrinsics.checkNotNullExpressionValue(r1, "substring(...)");
        return r1;
    }

    private static final int skipWhile(String $this$skipWhile, int startIndex, Function1<? super Character, Boolean> r5) {
        int i = startIndex;
    L4:
        if (i >= $this$skipWhile.length()) goto L8;
        if (r5.invoke(Character.valueOf($this$skipWhile.charAt(i))).booleanValue() == false) goto L8;
        i = i + 1;
    L8:
        return i;
    }

    private static final long nanosToMillis(long nanos) {
        return nanos / AnimationKt.MillisToNanos;
    }

    private static final long millisToNanos(long millis) {
        return AnimationKt.MillisToNanos * millis;
    }

    private static final long durationOfNanos(long normalNanos) {
        return Duration.m8764constructorimpl(normalNanos << 1);
    }

    private static final long durationOfMillis(long normalMillis) {
        return Duration.m8764constructorimpl((normalMillis << 1) + 1);
    }

    private static final long durationOf(long normalValue, int unitDiscriminator) {
        return Duration.m8764constructorimpl((normalValue << 1) + ((long) unitDiscriminator));
    }

    private static final long durationOfNanosNormalized(long nanos) {
        boolean r1 = false;
        if ((-4611686018426999999L) <= nanos) goto L5;
    L7:
        if (r1 == false) goto L10;
        return durationOfNanos(nanos);
    L10:
        return durationOfMillis(nanosToMillis(nanos));
    L5:
        if (nanos >= 4611686018427000000L) goto L7;
        r1 = true;
        goto L7
    }

    private static final long durationOfMillisNormalized(long millis) {
        boolean r1 = false;
        if ((-4611686018426L) <= millis) goto L5;
    L7:
        if (r1 == false) goto L10;
        return durationOfNanos(millisToNanos(millis));
    L10:
        return durationOfMillis(RangesKt.coerceIn(millis, -4611686018427387903L, 4611686018427387903L));
    L5:
        if (millis >= 4611686018427L) goto L7;
        r1 = true;
        goto L7
    }
}
