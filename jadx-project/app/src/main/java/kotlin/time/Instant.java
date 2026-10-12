package kotlin.time;

import androidx.compose.animation.core.AnimationKt;
import androidx.core.app.NotificationManagerCompat;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Instant.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001'B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001cH\u0002J\u0019\u0010!\u001a\u00020\"2\n\u0010#\u001a\u00060$j\u0002`%H\u0002¢\u0006\u0002\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006("}, d2 = {"Lkotlin/time/Instant;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "epochSeconds", "", "nanosecondsOfSecond", "", "<init>", "(JI)V", "getEpochSeconds", "()J", "getNanosecondsOfSecond", "()I", "toEpochMilliseconds", "plus", "duration", "Lkotlin/time/Duration;", "plus-LRDsOJo", "(J)Lkotlin/time/Instant;", "minus", "minus-LRDsOJo", "other", "minus-UwyO8pc", "(Lkotlin/time/Instant;)J", "compareTo", "equals", "", "", "hashCode", "toString", "", "writeReplace", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Instant implements Comparable<Instant>, Serializable {
    public static final Companion Companion = null;
    private static final Instant MAX = null;
    private static final Instant MIN = null;
    private final long epochSeconds;
    private final int nanosecondsOfSecond;

    /* JADX INFO: compiled from: Instant.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, d2 = {"Lkotlin/time/Instant$Companion;", "", "<init>", "()V", "now", "Lkotlin/time/Instant;", "fromEpochMilliseconds", "epochMilliseconds", "", "fromEpochSeconds", "epochSeconds", "nanosecondAdjustment", "", "parse", "input", "", "parseOrNull", "DISTANT_PAST", "getDISTANT_PAST", "()Lkotlin/time/Instant;", "DISTANT_FUTURE", "getDISTANT_FUTURE", "MIN", "getMIN$kotlin_stdlib", "MAX", "getMAX$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Use Clock.System.now() instead", replaceWith = @ReplaceWith(expression = "Clock.System.now()", imports = {"kotlin.time.Clock"}))
        public final Instant now() {
            throw new NotImplementedError(null, 1, null);
        }

        public final Instant fromEpochMilliseconds(long epochMilliseconds) {
            long epochSeconds = epochMilliseconds / 1000;
            if ((epochMilliseconds ^ 1000) < 0) goto L5;
        L7:
            long r4 = epochMilliseconds % 1000;
            int nanosecondsOfSecond = (int) ((r4 + (1000 & (((r4 ^ 1000) & ((-r4) | r4)) >> 63))) * AnimationKt.MillisToNanos);
            if (epochSeconds >= (-31557014167219200L)) goto L11;
            return getMIN$kotlin_stdlib();
        L11:
            if (epochSeconds <= 31556889864403199L) goto L14;
            return getMAX$kotlin_stdlib();
        L14:
            return fromEpochSeconds(epochSeconds, nanosecondsOfSecond);
        L5:
            if ((epochSeconds * 1000) == epochMilliseconds) goto L7;
            epochSeconds = epochSeconds - 1;
            goto L7
        }

        public static /* synthetic */ Instant fromEpochSeconds$default(Companion r0, long r1, long r3, int r5, Object r6) {
            if ((r5 & 2) == 0) goto L6;
            r3 = 0;
        L6:
            return r0.fromEpochSeconds(r1, r3);
        }

        public final Instant fromEpochSeconds(long epochSeconds, long nanosecondAdjustment) {
            long b$iv = nanosecondAdjustment / 1000000000;
            if ((nanosecondAdjustment ^ 1000000000) < 0) goto L5;
        L7:
            long sum$iv = epochSeconds + b$iv;
            if ((epochSeconds ^ sum$iv) >= 0) goto L17;
            if ((epochSeconds ^ b$iv) < 0) goto L17;
            if (epochSeconds <= 0) goto L15;
            return Instant.Companion.getMAX$kotlin_stdlib();
        L15:
            return Instant.Companion.getMIN$kotlin_stdlib();
        L17:
            if (sum$iv >= (-31557014167219200L)) goto L20;
            return getMIN$kotlin_stdlib();
        L20:
            if (sum$iv > 31556889864403199L) goto L26;
            long r2 = nanosecondAdjustment % 1000000000;
            int nanoseconds = (int) (r2 + (1000000000 & (((r2 ^ 1000000000) & ((-r2) | r2)) >> 63)));
            return new Instant(sum$iv, nanoseconds);
        L26:
            return getMAX$kotlin_stdlib();
        L5:
            if ((b$iv * 1000000000) == nanosecondAdjustment) goto L7;
            b$iv = b$iv - 1;
            goto L7
        }

        public final Instant fromEpochSeconds(long epochSeconds, int nanosecondAdjustment) {
            return fromEpochSeconds(epochSeconds, nanosecondAdjustment);
        }

        public final Instant parse(CharSequence input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return InstantKt.access$parseIso(input).toInstant();
        }

        public final Instant parseOrNull(CharSequence input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return InstantKt.access$parseIso(input).toInstantOrNull();
        }

        public final Instant getDISTANT_PAST() {
            return fromEpochSeconds(-3217862419201L, 999999999);
        }

        public final Instant getDISTANT_FUTURE() {
            return fromEpochSeconds(3093527980800L, 0);
        }

        public final Instant getMIN$kotlin_stdlib() {
            return Instant.access$getMIN$cp();
        }

        public final Instant getMAX$kotlin_stdlib() {
            return Instant.access$getMAX$cp();
        }
    }

    public static final /* synthetic */ Instant access$getMAX$cp() {
        return MAX;
    }

    public static final /* synthetic */ Instant access$getMIN$cp() {
        return MIN;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Instant r2) {
        return compareTo2(r2);
    }

    public Instant(long epochSeconds, int nanosecondsOfSecond) {
        this.epochSeconds = epochSeconds;
        this.nanosecondsOfSecond = nanosecondsOfSecond;
        long r0 = this.epochSeconds;
        boolean r3 = false;
        if ((-31557014167219200L) <= r0) goto L5;
    L7:
        if (r3 == false) goto L10;
        return;
    L10:
        throw new IllegalArgumentException("Instant exceeds minimum or maximum instant".toString());
    L5:
        if (r0 >= 31556889864403200L) goto L7;
        r3 = true;
        goto L7
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    public final long toEpochMilliseconds() {
        if (this.epochSeconds < 0) goto L38;
        long a$iv = this.epochSeconds;
        if (1000 != 1) goto L8;
    L30:
        long b$iv = this.nanosecondsOfSecond / DurationKt.NANOS_IN_MILLIS;
        long sum$iv = a$iv + b$iv;
        if ((a$iv ^ sum$iv) < 0) goto L33;
    L37:
        return sum$iv;
    L33:
        if ((a$iv ^ b$iv) < 0) goto L37;
        return Long.MAX_VALUE;
    L8:
        if (a$iv != 1) goto L11;
        a$iv = 1000;
        goto L30
    L11:
        if (a$iv != 0) goto L13;
    L29:
        a$iv = 0;
        goto L30
    L13:
        if (1000 == 0) goto L29;
        long total$iv = a$iv * 1000;
        if ((total$iv / 1000) != a$iv) goto L28;
        if (a$iv != Long.MIN_VALUE) goto L22;
        if (1000 == (-1)) goto L28;
    L22:
        if (1000 == Long.MIN_VALUE) goto L24;
    L26:
        a$iv = total$iv;
        goto L30
    L24:
        if (a$iv != (-1)) goto L26;
    L28:
        return Long.MAX_VALUE;
    L38:
        long millis = this.epochSeconds;
        long a$iv2 = millis + 1;
        if (1000 != 1) goto L42;
    L64:
        long b$iv2 = (this.nanosecondsOfSecond / DurationKt.NANOS_IN_MILLIS) + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        long sum$iv2 = a$iv2 + b$iv2;
        if ((a$iv2 ^ sum$iv2) < 0) goto L67;
    L71:
        return sum$iv2;
    L67:
        if ((a$iv2 ^ b$iv2) < 0) goto L71;
        return Long.MIN_VALUE;
    L42:
        if (a$iv2 != 1) goto L45;
        a$iv2 = 1000;
        goto L64
    L45:
        if (a$iv2 != 0) goto L47;
    L63:
        a$iv2 = 0;
        goto L64
    L47:
        if (1000 == 0) goto L63;
        long total$iv2 = a$iv2 * 1000;
        if ((total$iv2 / 1000) != a$iv2) goto L62;
        if (a$iv2 != Long.MIN_VALUE) goto L56;
        if (1000 == (-1)) goto L62;
    L56:
        if (1000 == Long.MIN_VALUE) goto L58;
    L60:
        a$iv2 = total$iv2;
        goto L64
    L58:
        if (a$iv2 != (-1)) goto L60;
    L62:
        return Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public final Instant m8864plusLRDsOJo(long duration) {
        long secondsToAdd = Duration.m8778getInWholeSecondsimpl(duration);
        int nanosecondsToAdd = Duration.m8780getNanosecondsComponentimpl(duration);
        if (secondsToAdd != 0) goto L6;
        if (nanosecondsToAdd != 0) goto L6;
        return this;
    L6:
        long a$iv = this.epochSeconds;
        long sum$iv = a$iv + secondsToAdd;
        if ((a$iv ^ sum$iv) < 0) goto L9;
    L15:
        int nanoAdjustment = this.nanosecondsOfSecond + nanosecondsToAdd;
        return Companion.fromEpochSeconds(sum$iv, nanoAdjustment);
    L9:
        if ((a$iv ^ secondsToAdd) < 0) goto L15;
        if (Duration.m8791isPositiveimpl(duration) == false) goto L14;
        return MAX;
    L14:
        return MIN;
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public final Instant m8862minusLRDsOJo(long duration) {
        return m8864plusLRDsOJo(Duration.m8808unaryMinusUwyO8pc(duration));
    }

    /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m8863minusUwyO8pc(Instant other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Duration.Companion r0 = Duration.Companion;
        long r1 = DurationKt.toDuration(this.epochSeconds - other.epochSeconds, DurationUnit.SECONDS);
        Duration.Companion r2 = Duration.Companion;
        return Duration.m8793plusLRDsOJo(r1, DurationKt.toDuration(this.nanosecondsOfSecond - other.nanosecondsOfSecond, DurationUnit.NANOSECONDS));
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(Instant other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int s = Intrinsics.compare(this.epochSeconds, other.epochSeconds);
        if (s == 0) goto L6;
        return s;
    L6:
        return Intrinsics.compare(this.nanosecondsOfSecond, other.nanosecondsOfSecond);
    }

    public boolean equals(Object other) {
        if (this != other) goto L4;
    L11:
        return true;
    L4:
        if ((other instanceof Instant) == true) goto L6;
    L10:
        return false;
    L6:
        if (this.epochSeconds != ((Instant) other).epochSeconds) goto L10;
        if (this.nanosecondsOfSecond != ((Instant) other).nanosecondsOfSecond) goto L10;
        goto L10
    }

    public int hashCode() {
        return Long.hashCode(this.epochSeconds) + (this.nanosecondsOfSecond * 51);
    }

    public String toString() {
        return InstantKt.access$formatIso(this);
    }

    private final Object writeReplace() {
        return InstantJvmKt.serializedInstant(this);
    }

    private final void readObject(ObjectInputStream input) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    static {
        Companion = new Companion(null);
        MIN = new Instant(-31557014167219200L, 0);
        MAX = new Instant(31556889864403199L, 999999999);
    }
}
