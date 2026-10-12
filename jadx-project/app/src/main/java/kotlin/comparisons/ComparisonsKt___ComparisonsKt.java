package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: _Comparisons.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\b\u001a?\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\t\u001aK\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000b\"\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\f\u001aG\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\b\u001a?\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\t\u001aK\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000b\"\u0002H\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0006j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`\u0007H\u0007¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"maxOf", "T", "a", "b", "c", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "other", "", "(Ljava/lang/Object;[Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "minOf", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
class ComparisonsKt___ComparisonsKt extends ComparisonsKt___ComparisonsJvmKt {
    public ComparisonsKt___ComparisonsKt() {
    }

    public static final <T> T maxOf(T r1, T r2, T r3, Comparator<? super T> r4) {
        Intrinsics.checkNotNullParameter(r4, "comparator");
        return (T) ComparisonsKt.maxOf(r1, ComparisonsKt.maxOf(r2, r3, r4), r4);
    }

    public static final <T> T maxOf(T r1, T r2, Comparator<? super T> r3) {
        Intrinsics.checkNotNullParameter(r3, "comparator");
        if (r3.compare(r1, r2) < 0) goto L6;
        return r1;
    L6:
        return r2;
    }

    public static final <T> T maxOf(T r5, T[] r6, Comparator<? super T> r7) {
        Intrinsics.checkNotNullParameter(r6, "other");
        Intrinsics.checkNotNullParameter(r7, "comparator");
        T r0 = r5;
        int r1 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        T r3 = r6[r2];
        if (r7.compare(r0, r3) >= 0) goto L7;
        r0 = r3;
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r0;
    }

    public static final <T> T minOf(T r1, T r2, T r3, Comparator<? super T> r4) {
        Intrinsics.checkNotNullParameter(r4, "comparator");
        return (T) ComparisonsKt.minOf(r1, ComparisonsKt.minOf(r2, r3, r4), r4);
    }

    public static final <T> T minOf(T r1, T r2, Comparator<? super T> r3) {
        Intrinsics.checkNotNullParameter(r3, "comparator");
        if (r3.compare(r1, r2) > 0) goto L6;
        return r1;
    L6:
        return r2;
    }

    public static final <T> T minOf(T r5, T[] r6, Comparator<? super T> r7) {
        Intrinsics.checkNotNullParameter(r6, "other");
        Intrinsics.checkNotNullParameter(r7, "comparator");
        T r0 = r5;
        int r1 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        T r3 = r6[r2];
        if (r7.compare(r0, r3) <= 0) goto L7;
        r0 = r3;
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r0;
    }
}
