package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DurationUnit.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¨\u0006\t"}, d2 = {"shortName", "", "Lkotlin/time/DurationUnit;", "durationUnitByShortName", "durationUnitByIsoChar", "isoChar", "", "isTimeComponent", "", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt {

    /* JADX INFO: compiled from: DurationUnit.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[DurationUnit.values().length];
            r0[DurationUnit.NANOSECONDS.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L26:
            r0[DurationUnit.MICROSECONDS.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L32:
            r0[DurationUnit.MILLISECONDS.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L36:
            r0[DurationUnit.SECONDS.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L28:
            r0[DurationUnit.MINUTES.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L30:
            r0[DurationUnit.HOURS.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L38:
            r0[DurationUnit.DAYS.ordinal()] = 7;     // Catch: NoSuchFieldError -> L23
        L24:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public DurationUnitKt__DurationUnitKt() {
    }

    public static final String shortName(DurationUnit $this$shortName) {
        Intrinsics.checkNotNullParameter($this$shortName, "<this>");
        switch(WhenMappings.$EnumSwitchMapping$0[$this$shortName.ordinal()]) {
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L9;
            case 5: goto L8;
            case 6: goto L7;
            case 7: goto L6;
            default: goto L5;
        };
    L6:
        return "d";
    L7:
        return "h";
    L8:
        return "m";
    L9:
        return "s";
    L10:
        return "ms";
    L11:
        return "us";
    L12:
        return "ns";
    L5:
        throw new IllegalStateException(("Unknown unit: " + $this$shortName).toString());
    }

    public static final DurationUnit durationUnitByShortName(String shortName) {
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        switch(shortName.hashCode()) {
            case 100: goto L24;
            case 104: goto L21;
            case 109: goto L18;
            case 115: goto L15;
            case 3494: goto L12;
            case 3525: goto L9;
            case 3742: goto L6;
            default: goto L28;
        };
    L6:
        if (shortName.equals("us") == false) goto L28;
        return DurationUnit.MICROSECONDS;
    L9:
        if (shortName.equals("ns") == false) goto L28;
        return DurationUnit.NANOSECONDS;
    L12:
        if (shortName.equals("ms") == false) goto L28;
        return DurationUnit.MILLISECONDS;
    L15:
        if (shortName.equals("s") == false) goto L28;
        return DurationUnit.SECONDS;
    L18:
        if (shortName.equals("m") == false) goto L28;
        return DurationUnit.MINUTES;
    L21:
        if (shortName.equals("h") == false) goto L28;
        return DurationUnit.HOURS;
    L24:
        if (shortName.equals("d") == false) goto L28;
        return DurationUnit.DAYS;
    L28:
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    public static final DurationUnit durationUnitByIsoChar(char isoChar, boolean isTimeComponent) {
        if (isTimeComponent == false) goto L4;
        switch(isoChar) {
            case 72: goto L14;
            case 77: goto L17;
            case 83: goto L16;
            default: goto L10;
        };
    L10:
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + isoChar);
    L16:
        return DurationUnit.SECONDS;
    L17:
        return DurationUnit.MINUTES;
    L14:
        return DurationUnit.HOURS;
    L4:
        if (isoChar != 'D') goto L7;
        return DurationUnit.DAYS;
    L7:
        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + isoChar);
    }
}
