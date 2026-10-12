package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"saturatingAdd", "", "value", "unit", "Lkotlin/time/DurationUnit;", "duration", "Lkotlin/time/Duration;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "checkInfiniteSumDefined", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "infinityOfSign", "(J)J", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "origin1", "origin2", "saturatingFiniteDiff", "value1", "value2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class LongSaturatedMathKt {
    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m8866saturatingAddNuflL3o(long value, DurationUnit unit, long duration) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long durationInUnit = Duration.m8803toLongimpl(duration, unit);
        boolean r11 = true;
        if (((value - 1) | 1) != Long.MAX_VALUE) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L10;
        return m8865checkInfiniteSumDefinedPjuGub4(value, duration, durationInUnit);
    L10:
        if (((durationInUnit - 1) | 1) == Long.MAX_VALUE) goto L13;
        r11 = false;
    L13:
        if (r11 == true) goto L15;
        long result = value + durationInUnit;
        if (((value ^ result) & (durationInUnit ^ result)) < 0) goto L19;
        return result;
    L19:
        if (value >= 0) goto L23;
        return Long.MIN_VALUE;
    L23:
        return Long.MAX_VALUE;
    L15:
        return m8867saturatingAddInHalvesNuflL3o(value, unit, duration);
    L5:
        r1 = false;
        goto L6
    }

    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m8865checkInfiniteSumDefinedPjuGub4(long value, long duration, long durationInUnit) {
        if (Duration.m8789isInfiniteimpl(duration) == true) goto L5;
    L9:
        return value;
    L5:
        if ((value ^ durationInUnit) >= 0) goto L9;
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m8867saturatingAddInHalvesNuflL3o(long value, DurationUnit unit, long duration) {
        long half = Duration.m8767divUwyO8pc(duration, 2);
        long halfInUnit = Duration.m8803toLongimpl(half, unit);
        if ((1 | (halfInUnit - 1)) != Long.MAX_VALUE) goto L5;
        boolean r7 = true;
    L6:
        if (r7 == false) goto L9;
        return halfInUnit;
    L9:
        return m8866saturatingAddNuflL3o(m8866saturatingAddNuflL3o(value, unit, half), unit, Duration.m8792minusLRDsOJo(duration, half));
    L5:
        r7 = false;
        goto L6
    }

    private static final long infinityOfSign(long value) {
        if (value >= 0) goto L6;
        return Duration.Companion.m8854getNEG_INFINITEUwyO8pc$kotlin_stdlib();
    L6:
        return Duration.Companion.m8853getINFINITEUwyO8pc();
    }

    public static final long saturatingDiff(long valueNs, long origin, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if ((1 | (origin - 1)) != Long.MAX_VALUE) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L10;
        return Duration.m8808unaryMinusUwyO8pc(infinityOfSign(origin));
    L10:
        return saturatingFiniteDiff(valueNs, origin, unit);
    L5:
        r3 = false;
        goto L6
    }

    public static final long saturatingOriginsDiff(long origin1, long origin2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        boolean r7 = true;
        if (((origin2 - 1) | 1) != Long.MAX_VALUE) goto L5;
        int $i$f$isSaturated = 1;
    L6:
        if ($i$f$isSaturated == 0) goto L14;
        if (origin1 != origin2) goto L12;
        return Duration.Companion.m8855getZEROUwyO8pc();
    L12:
        return Duration.m8808unaryMinusUwyO8pc(infinityOfSign(origin2));
    L14:
        if ((1 | (origin1 - 1)) == Long.MAX_VALUE) goto L17;
        r7 = false;
    L17:
        if (r7 == false) goto L21;
        return infinityOfSign(origin1);
    L21:
        return saturatingFiniteDiff(origin1, origin2, unit);
    L5:
        $i$f$isSaturated = 0;
        goto L6
    }

    private static final long saturatingFiniteDiff(long value1, long value2, DurationUnit unit) {
        long result = value1 - value2;
        if (((result ^ value1) & (~(result ^ value2))) >= 0) goto L11;
        if (unit.compareTo(DurationUnit.MILLISECONDS) >= 0) goto L9;
        long unitsInMilli = DurationUnitKt.convertDurationUnit(1, DurationUnit.MILLISECONDS, unit);
        long resultMs = (value1 / unitsInMilli) - (value2 / unitsInMilli);
        long resultUnit = (value1 % unitsInMilli) - (value2 % unitsInMilli);
        Duration.Companion r9 = Duration.Companion;
        return Duration.m8793plusLRDsOJo(DurationKt.toDuration(resultMs, DurationUnit.MILLISECONDS), DurationKt.toDuration(resultUnit, unit));
    L9:
        return Duration.m8808unaryMinusUwyO8pc(infinityOfSign(result));
    L11:
        return DurationKt.toDuration(result, unit);
    }

    public static final boolean isSaturated(long $this$isSaturated) {
        if ((1 | ($this$isSaturated - 1)) != Long.MAX_VALUE) goto L5;
        return true;
    L5:
        return false;
    }
}
