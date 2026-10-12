package kotlin.internal.jdk8;

import androidx.autofill.HintConstants;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.jdk8.PlatformThreadLocalRandom;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import kotlin.time.Clock;

/* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0017¨\u0006\u0013"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "<init>", "()V", "sdkIsNullOrAtLeast", "", "version", "", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", HintConstants.AUTOFILL_HINT_NAME, "", "defaultPlatformRandom", "Lkotlin/random/Random;", "getSystemClock", "Lkotlin/time/Clock;", "ReflectSdkVersion", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {

    /* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion;", "", "<init>", "()V", "sdkVersion", "", "Ljava/lang/Integer;", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class ReflectSdkVersion {
        public static final ReflectSdkVersion INSTANCE = null;
        public static final Integer sdkVersion = null;

        private ReflectSdkVersion() {
        }

        static {
            INSTANCE = new ReflectSdkVersion();
            Integer r0 = null;
            Object r1 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);     // Catch: Throwable -> L8
            if ((r1 instanceof Integer) == false) goto L7;
            Integer r2 = (Integer) r1;     // Catch: Throwable -> L8
        L11:
            if (r2 == null) goto L18;
            int it = r2.intValue();
            if (it <= 0) goto L15;
            boolean r4 = true;
        L16:
            if (r4 == false) goto L18;
            r0 = r2;
            goto L18
        L15:
            r4 = false;
        L18:
            sdkVersion = r0;
            return;
        L7:
            r2 = null;
        L9:
            r2 = null;
            goto L11
        }
    }

    public JDK8PlatformImplementations() {
    }

    private final boolean sdkIsNullOrAtLeast(int version) {
        if (ReflectSdkVersion.sdkVersion != null) goto L5;
    L8:
        return true;
    L5:
        if (ReflectSdkVersion.sdkVersion.intValue() >= version) goto L8;
        return false;
    }

    @Override // kotlin.internal.PlatformImplementations
    public MatchGroup getMatchResultNamedGroup(MatchResult matchResult, String name) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, HintConstants.AUTOFILL_HINT_NAME);
        if ((matchResult instanceof Matcher) == false) goto L5;
        Matcher matcher = (Matcher) matchResult;
    L6:
        if (matcher == null) goto L13;
        IntRange range = new IntRange(matcher.start(name), matcher.end(name) - 1);
        if (range.getStart().intValue() < 0) goto L14;
        String r3 = matcher.group(name);
        Intrinsics.checkNotNullExpressionValue(r3, "group(...)");
        return new MatchGroup(r3, range);
    L14:
        return null;
    L13:
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    L5:
        matcher = null;
        goto L6
    }

    @Override // kotlin.internal.PlatformImplementations
    public Random defaultPlatformRandom() {
        if (sdkIsNullOrAtLeast(34) == false) goto L6;
        return new PlatformThreadLocalRandom();
    L6:
        return super.defaultPlatformRandom();
    }

    @Override // kotlin.internal.PlatformImplementations
    public Clock getSystemClock() {
        if (sdkIsNullOrAtLeast(26) == false) goto L6;
        return new AnonymousClass1();
    L6:
        return new AnonymousClass2();
    }
}
