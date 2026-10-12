package kotlin.internal;

import androidx.autofill.HintConstants;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.text.MatchGroup;
import kotlin.time.Clock;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0017¨\u0006\u0016"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "<init>", "()V", "addSuppressed", "", "cause", "", "exception", "getSuppressed", "", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", HintConstants.AUTOFILL_HINT_NAME, "", "defaultPlatformRandom", "Lkotlin/random/Random;", "getSystemClock", "Lkotlin/time/Clock;", "ReflectThrowable", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class PlatformImplementations {

    /* JADX INFO: compiled from: PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "<init>", "()V", "addSuppressed", "Ljava/lang/reflect/Method;", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class ReflectThrowable {
        public static final ReflectThrowable INSTANCE = null;
        public static final Method addSuppressed = null;
        public static final Method getSuppressed = null;

        private ReflectThrowable() {
        }

        static {
            INSTANCE = new ReflectThrowable();
            Method[] throwableMethods = Throwable.class.getMethods();
            Intrinsics.checkNotNull(throwableMethods);
            int r2 = throwableMethods.length;
            int r3 = 0;
            int r4 = 0;
        L3:
            Method r5 = null;
            if (r4 >= r2) goto L14;
            Method it = throwableMethods[r4];
            if (Intrinsics.areEqual(it.getName(), "addSuppressed") == false) goto L10;
            Class<?>[] r9 = it.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(r9, "getParameterTypes(...)");
            if (Intrinsics.areEqual(ArraysKt.singleOrNull(r9), Throwable.class) == false) goto L10;
            boolean r10 = true;
        L11:
            if (r10 == true) goto L15;
            r4 = r4 + 1;
        L15:
            addSuppressed = it;
            int r6 = throwableMethods.length;
        L16:
            if (r3 >= r6) goto L21;
            Method it2 = throwableMethods[r3];
            if (Intrinsics.areEqual(it2.getName(), "getSuppressed") == true) goto L19;
            r3 = r3 + 1;
            goto L16
        L19:
            r5 = it2;
        L21:
            getSuppressed = r5;
            return;
        L10:
            r10 = false;
            goto L11
        L14:
            it = null;
            goto L15
        }
    }

    public PlatformImplementations() {
    }

    public void addSuppressed(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method r0 = ReflectThrowable.addSuppressed;
        if (r0 == null) goto L6;
        r0.invoke(cause, new Object[]{exception});
        return;
    }

    public List<Throwable> getSuppressed(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method r0 = ReflectThrowable.getSuppressed;
        if (r0 == null) goto L9;
        Object it = r0.invoke(exception, new Object[0]);
        if (it == null) goto L9;
        List<Throwable> r1 = ArraysKt.asList((Throwable[]) it);
        if (r1 == null) goto L9;
        return r1;
    L9:
        return CollectionsKt.emptyList();
    }

    public MatchGroup getMatchResultNamedGroup(MatchResult matchResult, String name) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, HintConstants.AUTOFILL_HINT_NAME);
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public Random defaultPlatformRandom() {
        return new FallbackThreadLocalRandom();
    }

    public Clock getSystemClock() {
        throw new UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
    }
}
