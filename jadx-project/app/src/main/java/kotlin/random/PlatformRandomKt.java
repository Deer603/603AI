package kotlin.random;

import kotlin.Metadata;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\t\u0010\u0004\u001a\u00020\u0002H\u0081\b\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¨\u0006\n"}, d2 = {"asJavaRandom", "Ljava/util/Random;", "Lkotlin/random/Random;", "asKotlinRandom", "defaultPlatformRandom", "doubleFromParts", "", "hi26", "", "low27", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PlatformRandomKt {
    public static final java.util.Random asJavaRandom(Random $this$asJavaRandom) {
        Intrinsics.checkNotNullParameter($this$asJavaRandom, "<this>");
        if (($this$asJavaRandom instanceof AbstractPlatformRandom) == false) goto L5;
        AbstractPlatformRandom r0 = (AbstractPlatformRandom) $this$asJavaRandom;
    L6:
        if (r0 == null) goto L10;
        java.util.Random r1 = r0.getImpl();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return new KotlinRandom($this$asJavaRandom);
    L5:
        r0 = null;
        goto L6
    }

    public static final Random asKotlinRandom(java.util.Random $this$asKotlinRandom) {
        Intrinsics.checkNotNullParameter($this$asKotlinRandom, "<this>");
        if (($this$asKotlinRandom instanceof KotlinRandom) == false) goto L5;
        KotlinRandom r0 = (KotlinRandom) $this$asKotlinRandom;
    L6:
        if (r0 == null) goto L10;
        Random r1 = r0.getImpl();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return new PlatformRandom($this$asKotlinRandom);
    L5:
        r0 = null;
        goto L6
    }

    private static final Random defaultPlatformRandom() {
        return PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
    }

    public static final double doubleFromParts(int hi26, int low27) {
        return ((((long) hi26) << 27) + ((long) low27)) / 9.007199254740992E15d;
    }
}
