package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;

/* JADX INFO: compiled from: _URanges.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0007\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0007\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u000bH\u0087\b¢\u0006\u0002\u0010\f\u001a\u0012\u0010\n\u001a\u00020\u0004*\u00020\rH\u0087\b¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\n\u001a\u00020\u0004*\u00020\r2\u0006\u0010\n\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000bH\u0087\b\u001a\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\rH\u0087\b\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0007\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\r2\u0006\u0010\n\u001a\u00020\u000fH\u0007\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0002\b\u0016\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0087\n¢\u0006\u0002\b\u0017\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b \u0010!\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\"H\u0087\u0002¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\"H\u0087\u0002¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\u00192\u0006\u0010(\u001a\u00020\u0019H\u0087\u0004¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010'\u001a\u00020\u0005*\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b-\u0010.\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0087\u0004¢\u0006\u0004\b/\u00100\u001a\f\u00101\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\f\u00101\u001a\u00020\u0005*\u00020\u0005H\u0007\u001a\u0015\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u000203H\u0087\u0004\u001a\u0015\u00102\u001a\u00020\u0005*\u00020\u00052\u0006\u00102\u001a\u000204H\u0087\u0004\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u00192\u0006\u0010(\u001a\u00020\u0019H\u0087\u0004¢\u0006\u0004\b6\u00107\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b8\u00109\u001a\u001c\u00105\u001a\u00020\r*\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b:\u0010;\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0087\u0004¢\u0006\u0004\b<\u0010=\u001a\u001b\u0010>\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020\u0001H\u0007¢\u0006\u0004\b@\u0010A\u001a\u001b\u0010>\u001a\u00020\u0004*\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0007¢\u0006\u0004\bB\u0010C\u001a\u001b\u0010>\u001a\u00020\u0019*\u00020\u00192\u0006\u0010?\u001a\u00020\u0019H\u0007¢\u0006\u0004\bD\u0010E\u001a\u001b\u0010>\u001a\u00020\"*\u00020\"2\u0006\u0010?\u001a\u00020\"H\u0007¢\u0006\u0004\bF\u0010G\u001a\u001b\u0010H\u001a\u00020\u0001*\u00020\u00012\u0006\u0010I\u001a\u00020\u0001H\u0007¢\u0006\u0004\bJ\u0010A\u001a\u001b\u0010H\u001a\u00020\u0004*\u00020\u00042\u0006\u0010I\u001a\u00020\u0004H\u0007¢\u0006\u0004\bK\u0010C\u001a\u001b\u0010H\u001a\u00020\u0019*\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0007¢\u0006\u0004\bL\u0010E\u001a\u001b\u0010H\u001a\u00020\"*\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0007¢\u0006\u0004\bM\u0010G\u001a#\u0010N\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u0001H\u0007¢\u0006\u0004\bO\u0010P\u001a#\u0010N\u001a\u00020\u0004*\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0004H\u0007¢\u0006\u0004\bQ\u0010R\u001a#\u0010N\u001a\u00020\u0019*\u00020\u00192\u0006\u0010?\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0007¢\u0006\u0004\bS\u0010T\u001a#\u0010N\u001a\u00020\"*\u00020\"2\u0006\u0010?\u001a\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0007¢\u0006\u0004\bU\u0010V\u001a!\u0010N\u001a\u00020\u0001*\u00020\u00012\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00010XH\u0007¢\u0006\u0004\bY\u0010Z\u001a!\u0010N\u001a\u00020\u0004*\u00020\u00042\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040XH\u0007¢\u0006\u0004\b[\u0010\\¨\u0006]"}, d2 = {"first", "Lkotlin/UInt;", "Lkotlin/ranges/UIntProgression;", "(Lkotlin/ranges/UIntProgression;)I", "Lkotlin/ULong;", "Lkotlin/ranges/ULongProgression;", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "Lkotlin/ranges/UIntRange;", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/ranges/ULongRange;", "(Lkotlin/ranges/ULongRange;)J", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "contains", "", "element", "contains-biwQdVI", "contains-GYNo2lE", "value", "Lkotlin/UByte;", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "Lkotlin/UShort;", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "coerceAtLeast", "minimumValue", "coerceAtLeast-J1ME1BU", "(II)I", "coerceAtLeast-eb3DHEI", "(JJ)J", "coerceAtLeast-Kr8caGY", "(BB)B", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-Kr8caGY", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-WZ9TVnA", "(III)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-VKSA0NQ", "(SSS)S", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/ranges/URangesKt")
class URangesKt___URangesKt {
    public URangesKt___URangesKt() {
    }

    public static final int first(UIntProgression $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        if ($this$first.isEmpty() == true) goto L7;
        return $this$first.m8653getFirstpVg5ArA();
    L7:
        throw new NoSuchElementException("Progression " + $this$first + " is empty.");
    }

    public static final long first(ULongProgression $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        if ($this$first.isEmpty() == true) goto L7;
        return $this$first.m8662getFirstsVKNKU();
    L7:
        throw new NoSuchElementException("Progression " + $this$first + " is empty.");
    }

    public static final UInt firstOrNull(UIntProgression $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        if ($this$firstOrNull.isEmpty() == false) goto L6;
        return null;
    L6:
        return UInt.m7514boximpl($this$firstOrNull.m8653getFirstpVg5ArA());
    }

    public static final ULong firstOrNull(ULongProgression $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        if ($this$firstOrNull.isEmpty() == false) goto L6;
        return null;
    L6:
        return ULong.m7593boximpl($this$firstOrNull.m8662getFirstsVKNKU());
    }

    public static final int last(UIntProgression $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        if ($this$last.isEmpty() == true) goto L7;
        return $this$last.m8654getLastpVg5ArA();
    L7:
        throw new NoSuchElementException("Progression " + $this$last + " is empty.");
    }

    public static final long last(ULongProgression $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        if ($this$last.isEmpty() == true) goto L7;
        return $this$last.m8663getLastsVKNKU();
    L7:
        throw new NoSuchElementException("Progression " + $this$last + " is empty.");
    }

    public static final UInt lastOrNull(UIntProgression $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        if ($this$lastOrNull.isEmpty() == false) goto L6;
        return null;
    L6:
        return UInt.m7514boximpl($this$lastOrNull.m8654getLastpVg5ArA());
    }

    public static final ULong lastOrNull(ULongProgression $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        if ($this$lastOrNull.isEmpty() == false) goto L6;
        return null;
    L6:
        return ULong.m7593boximpl($this$lastOrNull.m8663getLastsVKNKU());
    }

    private static final int random(UIntRange $this$random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        return URangesKt.random($this$random, Random.Default);
    }

    private static final long random(ULongRange $this$random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        return URangesKt.random($this$random, Random.Default);
    }

    public static final int random(UIntRange $this$random, Random random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        return URandomKt.nextUInt(random, $this$random);
    L5:
        e = move-exception;
        throw new NoSuchElementException(e.getMessage());
    }

    public static final long random(ULongRange $this$random, Random random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        return URandomKt.nextULong(random, $this$random);
    L5:
        e = move-exception;
        throw new NoSuchElementException(e.getMessage());
    }

    private static final UInt randomOrNull(UIntRange $this$randomOrNull) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        return URangesKt.randomOrNull($this$randomOrNull, Random.Default);
    }

    private static final ULong randomOrNull(ULongRange $this$randomOrNull) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        return URangesKt.randomOrNull($this$randomOrNull, Random.Default);
    }

    public static final UInt randomOrNull(UIntRange $this$randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if ($this$randomOrNull.isEmpty() == false) goto L7;
        return null;
    L7:
        return UInt.m7514boximpl(URandomKt.nextUInt(random, $this$randomOrNull));
    }

    public static final ULong randomOrNull(ULongRange $this$randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if ($this$randomOrNull.isEmpty() == false) goto L7;
        return null;
    L7:
        return ULong.m7593boximpl(URandomKt.nextULong(random, $this$randomOrNull));
    }

    /* JADX INFO: renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m8690containsbiwQdVI(UIntRange $this$contains_u2dbiwQdVI, UInt element) {
        Intrinsics.checkNotNullParameter($this$contains_u2dbiwQdVI, "$this$contains");
        if (element != null) goto L5;
    L7:
        return false;
    L5:
        if ($this$contains_u2dbiwQdVI.m8658containsWZ4Q5Ns(element.m7572unboximpl()) == false) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m8686containsGYNo2lE(ULongRange $this$contains_u2dGYNo2lE, ULong element) {
        Intrinsics.checkNotNullParameter($this$contains_u2dGYNo2lE, "$this$contains");
        if (element != null) goto L5;
    L7:
        return false;
    L5:
        if ($this$contains_u2dGYNo2lE.m8667containsVKZWuLQ(element.m7651unboximpl()) == false) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m8685contains68kG9v0(UIntRange $this$contains_u2d68kG9v0, byte value) {
        Intrinsics.checkNotNullParameter($this$contains_u2d68kG9v0, "$this$contains");
        return $this$contains_u2d68kG9v0.m8658containsWZ4Q5Ns(UInt.m7520constructorimpl(value & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m8688containsULbyJY(ULongRange $this$contains_u2dULb_u2dyJY, byte value) {
        Intrinsics.checkNotNullParameter($this$contains_u2dULb_u2dyJY, "$this$contains");
        return $this$contains_u2dULb_u2dyJY.m8667containsVKZWuLQ(ULong.m7599constructorimpl(((long) value) & 255));
    }

    /* JADX INFO: renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m8687containsGab390E(ULongRange $this$contains_u2dGab390E, int value) {
        Intrinsics.checkNotNullParameter($this$contains_u2dGab390E, "$this$contains");
        return $this$contains_u2dGab390E.m8667containsVKZWuLQ(ULong.m7599constructorimpl(((long) value) & 4294967295L));
    }

    /* JADX INFO: renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m8691containsfz5IDCE(UIntRange $this$contains_u2dfz5IDCE, long value) {
        Intrinsics.checkNotNullParameter($this$contains_u2dfz5IDCE, "$this$contains");
        if (ULong.m7599constructorimpl(value >>> 32) == 0) goto L5;
    L7:
        return false;
    L5:
        if ($this$contains_u2dfz5IDCE.m8658containsWZ4Q5Ns(UInt.m7520constructorimpl((int) value)) == false) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m8689containsZsK3CEQ(UIntRange $this$contains_u2dZsK3CEQ, short value) {
        Intrinsics.checkNotNullParameter($this$contains_u2dZsK3CEQ, "$this$contains");
        return $this$contains_u2dZsK3CEQ.m8658containsWZ4Q5Ns(UInt.m7520constructorimpl(65535 & value));
    }

    /* JADX INFO: renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m8692containsuhHAxoY(ULongRange $this$contains_u2duhHAxoY, short value) {
        Intrinsics.checkNotNullParameter($this$contains_u2duhHAxoY, "$this$contains");
        return $this$contains_u2duhHAxoY.m8667containsVKZWuLQ(ULong.m7599constructorimpl(((long) value) & 65535));
    }

    /* JADX INFO: renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final UIntProgression m8695downToKr8caGY(byte $this$downTo_u2dKr8caGY, byte to) {
        return UIntProgression.Companion.m8655fromClosedRangeNkh28Cs(UInt.m7520constructorimpl($this$downTo_u2dKr8caGY & UByte.MAX_VALUE), UInt.m7520constructorimpl(to & UByte.MAX_VALUE), -1);
    }

    /* JADX INFO: renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final UIntProgression m8694downToJ1ME1BU(int $this$downTo_u2dJ1ME1BU, int to) {
        return UIntProgression.Companion.m8655fromClosedRangeNkh28Cs($this$downTo_u2dJ1ME1BU, to, -1);
    }

    /* JADX INFO: renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final ULongProgression m8696downToeb3DHEI(long $this$downTo_u2deb3DHEI, long to) {
        return ULongProgression.Companion.m8664fromClosedRange7ftBX0g($this$downTo_u2deb3DHEI, to, -1);
    }

    /* JADX INFO: renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final UIntProgression m8693downTo5PvTz6A(short $this$downTo_u2d5PvTz6A, short to) {
        return UIntProgression.Companion.m8655fromClosedRangeNkh28Cs(UInt.m7520constructorimpl($this$downTo_u2d5PvTz6A & UShort.MAX_VALUE), UInt.m7520constructorimpl(65535 & to), -1);
    }

    public static final UIntProgression reversed(UIntProgression $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        return UIntProgression.Companion.m8655fromClosedRangeNkh28Cs($this$reversed.m8654getLastpVg5ArA(), $this$reversed.m8653getFirstpVg5ArA(), -$this$reversed.getStep());
    }

    public static final ULongProgression reversed(ULongProgression $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        return ULongProgression.Companion.m8664fromClosedRange7ftBX0g($this$reversed.m8663getLastsVKNKU(), $this$reversed.m8662getFirstsVKNKU(), -$this$reversed.getStep());
    }

    public static final UIntProgression step(UIntProgression $this$step, int step) {
        Intrinsics.checkNotNullParameter($this$step, "<this>");
        if (step <= 0) goto L5;
        boolean r0 = true;
    L6:
        RangesKt.checkStepIsPositive(r0, Integer.valueOf(step));
        UIntProgression.Companion r1 = UIntProgression.Companion;
        int r2 = $this$step.m8653getFirstpVg5ArA();
        int r3 = $this$step.m8654getLastpVg5ArA();
        if ($this$step.getStep() <= 0) goto L9;
        int r4 = step;
    L11:
        return r1.m8655fromClosedRangeNkh28Cs(r2, r3, r4);
    L9:
        r4 = -step;
        goto L11
    L5:
        r0 = false;
        goto L6
    }

    public static final ULongProgression step(ULongProgression $this$step, long step) {
        Intrinsics.checkNotNullParameter($this$step, "<this>");
        if (step <= 0) goto L5;
        boolean r2 = true;
    L6:
        RangesKt.checkStepIsPositive(r2, Long.valueOf(step));
        ULongProgression.Companion r4 = ULongProgression.Companion;
        long r5 = $this$step.m8662getFirstsVKNKU();
        long r7 = $this$step.m8663getLastsVKNKU();
        if ($this$step.getStep() <= 0) goto L9;
        long r9 = step;
    L11:
        return r4.m8664fromClosedRange7ftBX0g(r5, r7, r9);
    L9:
        r9 = -step;
        goto L11
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: until-Kr8caGY, reason: not valid java name */
    public static final UIntRange m8699untilKr8caGY(byte $this$until_u2dKr8caGY, byte to) {
        if (Intrinsics.compare(to & UByte.MAX_VALUE, 0) > 0) goto L7;
        return UIntRange.Companion.getEMPTY();
    L7:
        return new UIntRange(UInt.m7520constructorimpl($this$until_u2dKr8caGY & UByte.MAX_VALUE), UInt.m7520constructorimpl(UInt.m7520constructorimpl(to & UByte.MAX_VALUE) - 1), null);
    }

    /* JADX INFO: renamed from: until-J1ME1BU, reason: not valid java name */
    public static final UIntRange m8698untilJ1ME1BU(int $this$until_u2dJ1ME1BU, int to) {
        if (Integer.compareUnsigned(to, 0) > 0) goto L7;
        return UIntRange.Companion.getEMPTY();
    L7:
        return new UIntRange($this$until_u2dJ1ME1BU, UInt.m7520constructorimpl(to - 1), null);
    }

    /* JADX INFO: renamed from: until-eb3DHEI, reason: not valid java name */
    public static final ULongRange m8700untileb3DHEI(long $this$until_u2deb3DHEI, long to) {
        if (Long.compareUnsigned(to, 0) > 0) goto L7;
        return ULongRange.Companion.getEMPTY();
    L7:
        return new ULongRange($this$until_u2deb3DHEI, ULong.m7599constructorimpl(to - ULong.m7599constructorimpl(1)), null);
    }

    /* JADX INFO: renamed from: until-5PvTz6A, reason: not valid java name */
    public static final UIntRange m8697until5PvTz6A(short $this$until_u2d5PvTz6A, short to) {
        if (Intrinsics.compare(to & UShort.MAX_VALUE, 0) > 0) goto L7;
        return UIntRange.Companion.getEMPTY();
    L7:
        return new UIntRange(UInt.m7520constructorimpl($this$until_u2d5PvTz6A & UShort.MAX_VALUE), UInt.m7520constructorimpl(UInt.m7520constructorimpl(65535 & to) - 1), null);
    }

    /* JADX INFO: renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m8672coerceAtLeastJ1ME1BU(int $this$coerceAtLeast_u2dJ1ME1BU, int minimumValue) {
        if (Integer.compareUnsigned($this$coerceAtLeast_u2dJ1ME1BU, minimumValue) >= 0) goto L6;
        return minimumValue;
    L6:
        return $this$coerceAtLeast_u2dJ1ME1BU;
    }

    /* JADX INFO: renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m8674coerceAtLeasteb3DHEI(long $this$coerceAtLeast_u2deb3DHEI, long minimumValue) {
        if (Long.compareUnsigned($this$coerceAtLeast_u2deb3DHEI, minimumValue) >= 0) goto L6;
        return minimumValue;
    L6:
        return $this$coerceAtLeast_u2deb3DHEI;
    }

    /* JADX INFO: renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m8673coerceAtLeastKr8caGY(byte $this$coerceAtLeast_u2dKr8caGY, byte minimumValue) {
        if (Intrinsics.compare($this$coerceAtLeast_u2dKr8caGY & UByte.MAX_VALUE, minimumValue & UByte.MAX_VALUE) >= 0) goto L6;
        return minimumValue;
    L6:
        return $this$coerceAtLeast_u2dKr8caGY;
    }

    /* JADX INFO: renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m8671coerceAtLeast5PvTz6A(short $this$coerceAtLeast_u2d5PvTz6A, short minimumValue) {
        if (Intrinsics.compare($this$coerceAtLeast_u2d5PvTz6A & UShort.MAX_VALUE, 65535 & minimumValue) >= 0) goto L6;
        return minimumValue;
    L6:
        return $this$coerceAtLeast_u2d5PvTz6A;
    }

    /* JADX INFO: renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m8676coerceAtMostJ1ME1BU(int $this$coerceAtMost_u2dJ1ME1BU, int maximumValue) {
        if (Integer.compareUnsigned($this$coerceAtMost_u2dJ1ME1BU, maximumValue) <= 0) goto L6;
        return maximumValue;
    L6:
        return $this$coerceAtMost_u2dJ1ME1BU;
    }

    /* JADX INFO: renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m8678coerceAtMosteb3DHEI(long $this$coerceAtMost_u2deb3DHEI, long maximumValue) {
        if (Long.compareUnsigned($this$coerceAtMost_u2deb3DHEI, maximumValue) <= 0) goto L6;
        return maximumValue;
    L6:
        return $this$coerceAtMost_u2deb3DHEI;
    }

    /* JADX INFO: renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m8677coerceAtMostKr8caGY(byte $this$coerceAtMost_u2dKr8caGY, byte maximumValue) {
        if (Intrinsics.compare($this$coerceAtMost_u2dKr8caGY & UByte.MAX_VALUE, maximumValue & UByte.MAX_VALUE) <= 0) goto L6;
        return maximumValue;
    L6:
        return $this$coerceAtMost_u2dKr8caGY;
    }

    /* JADX INFO: renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m8675coerceAtMost5PvTz6A(short $this$coerceAtMost_u2d5PvTz6A, short maximumValue) {
        if (Intrinsics.compare($this$coerceAtMost_u2d5PvTz6A & UShort.MAX_VALUE, 65535 & maximumValue) <= 0) goto L6;
        return maximumValue;
    L6:
        return $this$coerceAtMost_u2d5PvTz6A;
    }

    /* JADX INFO: renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m8681coerceInWZ9TVnA(int $this$coerceIn_u2dWZ9TVnA, int minimumValue, int maximumValue) {
        if (Integer.compareUnsigned(minimumValue, maximumValue) > 0) goto L12;
        if (Integer.compareUnsigned($this$coerceIn_u2dWZ9TVnA, minimumValue) >= 0) goto L8;
        return minimumValue;
    L8:
        if (Integer.compareUnsigned($this$coerceIn_u2dWZ9TVnA, maximumValue) <= 0) goto L10;
        return maximumValue;
    L10:
        return $this$coerceIn_u2dWZ9TVnA;
    L12:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UInt.m7566toStringimpl(maximumValue) + " is less than minimum " + UInt.m7566toStringimpl(minimumValue) + '.');
    }

    /* JADX INFO: renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m8683coerceInsambcqE(long $this$coerceIn_u2dsambcqE, long minimumValue, long maximumValue) {
        if (Long.compareUnsigned(minimumValue, maximumValue) > 0) goto L12;
        if (Long.compareUnsigned($this$coerceIn_u2dsambcqE, minimumValue) >= 0) goto L8;
        return minimumValue;
    L8:
        if (Long.compareUnsigned($this$coerceIn_u2dsambcqE, maximumValue) <= 0) goto L10;
        return maximumValue;
    L10:
        return $this$coerceIn_u2dsambcqE;
    L12:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ULong.m7645toStringimpl(maximumValue) + " is less than minimum " + ULong.m7645toStringimpl(minimumValue) + '.');
    }

    /* JADX INFO: renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m8682coerceInb33U2AM(byte $this$coerceIn_u2db33U2AM, byte minimumValue, byte maximumValue) {
        if (Intrinsics.compare(minimumValue & UByte.MAX_VALUE, maximumValue & UByte.MAX_VALUE) > 0) goto L12;
        if (Intrinsics.compare($this$coerceIn_u2db33U2AM & UByte.MAX_VALUE, minimumValue & UByte.MAX_VALUE) >= 0) goto L8;
        return minimumValue;
    L8:
        if (Intrinsics.compare($this$coerceIn_u2db33U2AM & UByte.MAX_VALUE, maximumValue & UByte.MAX_VALUE) <= 0) goto L10;
        return maximumValue;
    L10:
        return $this$coerceIn_u2db33U2AM;
    L12:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UByte.m7487toStringimpl(maximumValue) + " is less than minimum " + UByte.m7487toStringimpl(minimumValue) + '.');
    }

    /* JADX INFO: renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m8680coerceInVKSA0NQ(short $this$coerceIn_u2dVKSA0NQ, short minimumValue, short maximumValue) {
        if (Intrinsics.compare(minimumValue & UShort.MAX_VALUE, maximumValue & UShort.MAX_VALUE) > 0) goto L12;
        if (Intrinsics.compare($this$coerceIn_u2dVKSA0NQ & UShort.MAX_VALUE, minimumValue & UShort.MAX_VALUE) >= 0) goto L8;
        return minimumValue;
    L8:
        if (Intrinsics.compare($this$coerceIn_u2dVKSA0NQ & UShort.MAX_VALUE, 65535 & maximumValue) <= 0) goto L10;
        return maximumValue;
    L10:
        return $this$coerceIn_u2dVKSA0NQ;
    L12:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UShort.m7750toStringimpl(maximumValue) + " is less than minimum " + UShort.m7750toStringimpl(minimumValue) + '.');
    }

    /* JADX INFO: renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m8684coerceInwuiCnnA(int $this$coerceIn_u2dwuiCnnA, ClosedRange<UInt> r4) {
        Intrinsics.checkNotNullParameter(r4, "range");
        if ((r4 instanceof ClosedFloatingPointRange) == false) goto L7;
        return ((UInt) RangesKt.coerceIn(UInt.m7514boximpl($this$coerceIn_u2dwuiCnnA), (ClosedFloatingPointRange) r4)).m7572unboximpl();
    L7:
        if (r4.isEmpty() == true) goto L17;
        if (Integer.compareUnsigned($this$coerceIn_u2dwuiCnnA, ((UInt) r4.getStart()).m7572unboximpl()) >= 0) goto L12;
        return ((UInt) r4.getStart()).m7572unboximpl();
    L12:
        if (Integer.compareUnsigned($this$coerceIn_u2dwuiCnnA, ((UInt) r4.getEndInclusive()).m7572unboximpl()) <= 0) goto L15;
        return ((UInt) r4.getEndInclusive()).m7572unboximpl();
    L15:
        return $this$coerceIn_u2dwuiCnnA;
    L17:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + r4 + '.');
    }

    /* JADX INFO: renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m8679coerceInJPwROB0(long $this$coerceIn_u2dJPwROB0, ClosedRange<ULong> r5) {
        Intrinsics.checkNotNullParameter(r5, "range");
        if ((r5 instanceof ClosedFloatingPointRange) == false) goto L7;
        return ((ULong) RangesKt.coerceIn(ULong.m7593boximpl($this$coerceIn_u2dJPwROB0), (ClosedFloatingPointRange) r5)).m7651unboximpl();
    L7:
        if (r5.isEmpty() == true) goto L17;
        if (Long.compareUnsigned($this$coerceIn_u2dJPwROB0, ((ULong) r5.getStart()).m7651unboximpl()) >= 0) goto L12;
        return ((ULong) r5.getStart()).m7651unboximpl();
    L12:
        if (Long.compareUnsigned($this$coerceIn_u2dJPwROB0, ((ULong) r5.getEndInclusive()).m7651unboximpl()) <= 0) goto L15;
        return ((ULong) r5.getEndInclusive()).m7651unboximpl();
    L15:
        return $this$coerceIn_u2dJPwROB0;
    L17:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + r5 + '.');
    }
}
