package kotlin.random;

import androidx.webkit.Profile;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b'\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000bH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0005H\u0016¨\u0006\u0019"}, d2 = {"Lkotlin/random/Random;", "", "<init>", "()V", "nextBits", "", "bitCount", "nextInt", "until", "from", "nextLong", "", "nextBoolean", "", "nextDouble", "", "nextFloat", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", Profile.DEFAULT_PROFILE_NAME, "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Random {
    public static final Default Default = null;
    private static final Random defaultRandom = null;

    /* JADX INFO: compiled from: Random.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0019\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0010H\u0016J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "defaultRandom", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "nextBits", "", "bitCount", "nextInt", "until", "from", "nextLong", "", "nextBoolean", "", "nextDouble", "", "nextFloat", "", "nextBytes", "", "array", "size", "fromIndex", "toIndex", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default extends Random implements Serializable {

        /* JADX INFO: compiled from: Random.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        private static final class Serialized implements Serializable {
            public static final Serialized INSTANCE = null;
            private static final long serialVersionUID = 0;

            static {
                INSTANCE = new Serialized();
            }

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        public /* synthetic */ Default(DefaultConstructorMarker r1) {
            this();
        }

        private Default() {
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        private final void readObject(ObjectInputStream input) {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        @Override // kotlin.random.Random
        public int nextBits(int bitCount) {
            return Random.access$getDefaultRandom$cp().nextBits(bitCount);
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.access$getDefaultRandom$cp().nextInt();
        }

        @Override // kotlin.random.Random
        public int nextInt(int until) {
            return Random.access$getDefaultRandom$cp().nextInt(until);
        }

        @Override // kotlin.random.Random
        public int nextInt(int from, int until) {
            return Random.access$getDefaultRandom$cp().nextInt(from, until);
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.access$getDefaultRandom$cp().nextLong();
        }

        @Override // kotlin.random.Random
        public long nextLong(long until) {
            return Random.access$getDefaultRandom$cp().nextLong(until);
        }

        @Override // kotlin.random.Random
        public long nextLong(long from, long until) {
            return Random.access$getDefaultRandom$cp().nextLong(from, until);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.access$getDefaultRandom$cp().nextBoolean();
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.access$getDefaultRandom$cp().nextDouble();
        }

        @Override // kotlin.random.Random
        public double nextDouble(double until) {
            return Random.access$getDefaultRandom$cp().nextDouble(until);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double from, double until) {
            return Random.access$getDefaultRandom$cp().nextDouble(from, until);
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.access$getDefaultRandom$cp().nextFloat();
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.access$getDefaultRandom$cp().nextBytes(array);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(int size) {
            return Random.access$getDefaultRandom$cp().nextBytes(size);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array, int fromIndex, int toIndex) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.access$getDefaultRandom$cp().nextBytes(array, fromIndex, toIndex);
        }
    }

    public abstract int nextBits(int r1);

    public Random() {
    }

    public static final /* synthetic */ Random access$getDefaultRandom$cp() {
        return defaultRandom;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public int nextInt(int until) {
        return nextInt(0, until);
    }

    public int nextInt(int from, int until) {
        RandomKt.checkRangeBounds(from, until);
        int n = until - from;
        if (n > 0) goto L14;
        if (n == Integer.MIN_VALUE) goto L14;
    L7:
        int rnd = nextInt();
        boolean r3 = false;
        if (from > rnd) goto L11;
        if (rnd >= until) goto L11;
        r3 = true;
    L11:
        if (r3 == false) goto L7;
        return rnd;
    L14:
        if (((-n) & n) != n) goto L17;
        int bitCount = RandomKt.fastLog2(n);
        int bitCount2 = nextBits(bitCount);
    L21:
        return from + bitCount2;
    L17:
        int bits = nextInt() >>> 1;
        int v = bits % n;
        if (((bits - v) + (n - 1)) < 0) goto L17;
        bitCount2 = v;
        goto L21
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public long nextLong(long until) {
        return nextLong(0, until);
    }

    public long nextLong(long from, long until) {
        RandomKt.checkRangeBounds(from, until);
        long n = until - from;
        if (n > 0) goto L5;
    L19:
        long rnd = nextLong();
        boolean r7 = false;
        if (from > rnd) goto L24;
        if (rnd >= until) goto L24;
        r7 = true;
    L24:
        if (r7 == false) goto L19;
        return rnd;
    L5:
        if (((-n) & n) != n) goto L14;
        int nLow = (int) n;
        int nHigh = (int) (n >>> 32);
        if (nLow == 0) goto L9;
        int bitCount = RandomKt.fastLog2(nLow);
        long v = 4294967295L & ((long) nextBits(bitCount));
    L18:
        return from + v;
    L9:
        if (nHigh != 1) goto L11;
        v = 4294967295L & ((long) nextInt());
        goto L18
    L11:
        int bitCount2 = RandomKt.fastLog2(nHigh);
        v = (4294967295L & ((long) nextInt())) + (((long) nextBits(bitCount2)) << 32);
    L14:
        long bits = nextLong() >>> 1;
        v = bits % n;
        if (((bits - v) + (n - 1)) < 0) goto L14;
        goto L18
    }

    public boolean nextBoolean() {
        if (nextBits(1) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public double nextDouble(double until) {
        return nextDouble(0.0d, until);
    }

    public double nextDouble(double from, double until) {
        RandomKt.checkRangeBounds(from, until);
        double size = until - from;
        if (Double.isInfinite(size) == false) goto L15;
        boolean r3 = true;
        if (Math.abs(from) > Double.MAX_VALUE) goto L7;
        boolean r2 = true;
    L8:
        if (r2 == false) goto L15;
        if (Math.abs(until) <= Double.MAX_VALUE) goto L13;
        r3 = false;
    L13:
        if (r3 == false) goto L15;
        double r1 = nextDouble() * ((until / 2.0d) - (from / 2.0d));
        double r = (from + r1) + r1;
    L17:
        if (r < until) goto L20;
        return Math.nextAfter(until, Double.NEGATIVE_INFINITY);
    L20:
        return r;
    L7:
        r2 = false;
    L15:
        r = from + (nextDouble() * size);
        goto L17
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public static /* synthetic */ byte[] nextBytes$default(Random r0, byte[] r1, int r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 2) == 0) goto L7;
        r2 = 0;
    L7:
        if ((r4 & 4) == 0) goto L10;
        r3 = r1.length;
    L10:
        return r0.nextBytes(r1, r2, r3);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public byte[] nextBytes(byte[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        boolean r0 = true;
        int r1 = 0;
        if (fromIndex >= 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == false) goto L16;
        if (toIndex >= 0) goto L11;
    L13:
        boolean r3 = false;
    L14:
        if (r3 == false) goto L16;
        boolean r4 = true;
    L18:
        if (r4 == false) goto L33;
        if (fromIndex <= toIndex) goto L22;
        r0 = false;
    L22:
        if (r0 == false) goto L31;
        int steps = (toIndex - fromIndex) / 4;
        int position = fromIndex;
    L24:
        if (r1 >= steps) goto L26;
        int v = nextInt();
        array[position] = (byte) v;
        array[position + 1] = (byte) (v >>> 8);
        array[position + 2] = (byte) (v >>> 16);
        array[position + 3] = (byte) (v >>> 24);
        position = position + 4;
        r1 = r1 + 1;
        goto L24
    L26:
        int remainder = toIndex - position;
        int vr = nextBits(remainder * 8);
        int i = 0;
    L27:
        if (i >= remainder) goto L29;
        array[position + i] = (byte) (vr >>> (i * 8));
        i = i + 1;
        goto L27
    L29:
        return array;
    L31:
        throw new IllegalArgumentException(("fromIndex (" + fromIndex + ") must be not greater than toIndex (" + toIndex + ").").toString());
    L33:
        throw new IllegalArgumentException(("fromIndex (" + fromIndex + ") or toIndex (" + toIndex + ") are out of range: 0.." + array.length + '.').toString());
    L11:
        if (toIndex > array.length) goto L13;
        r3 = true;
    L16:
        r4 = false;
        goto L18
    L5:
        if (fromIndex > array.length) goto L7;
        r2 = true;
        goto L8
    }

    public byte[] nextBytes(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return nextBytes(array, 0, array.length);
    }

    public byte[] nextBytes(int size) {
        return nextBytes(new byte[size]);
    }

    static {
        Default = new Default(null);
        defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
    }
}
