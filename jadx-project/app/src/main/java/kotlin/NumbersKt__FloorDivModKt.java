package kotlin;

/* JADX INFO: compiled from: FloorDivMod.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b¨\u0006\t"}, d2 = {"floorDiv", "", "", "other", "mod", "", "", "", "", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/NumbersKt")
class NumbersKt__FloorDivModKt extends NumbersKt__BigIntegersKt {
    public NumbersKt__FloorDivModKt() {
    }

    private static final int floorDiv(byte $this$floorDiv, byte other) {
        int r0 = $this$floorDiv / other;
        if (($this$floorDiv ^ other) < 0) goto L5;
        return r0;
    L5:
        if ((r0 * other) != $this$floorDiv) goto L7;
        return r0;
    L7:
        return r0 - 1;
    }

    private static final byte mod(byte $this$mod, byte other) {
        int r0 = $this$mod % other;
        return (byte) (r0 + ((((r0 ^ other) & ((-r0) | r0)) >> 31) & other));
    }

    private static final int floorDiv(byte $this$floorDiv, short other) {
        int r0 = $this$floorDiv / other;
        if (($this$floorDiv ^ other) < 0) goto L5;
        return r0;
    L5:
        if ((r0 * other) != $this$floorDiv) goto L7;
        return r0;
    L7:
        return r0 - 1;
    }

    private static final short mod(byte $this$mod, short other) {
        int r0 = $this$mod % other;
        return (short) (r0 + ((((r0 ^ other) & ((-r0) | r0)) >> 31) & other));
    }

    private static final int floorDiv(byte $this$floorDiv, int other) {
        int r0 = $this$floorDiv / other;
        if (($this$floorDiv ^ other) < 0) goto L5;
        return r0;
    L5:
        if ((r0 * other) != $this$floorDiv) goto L7;
        return r0;
    L7:
        return r0 - 1;
    }

    private static final int mod(byte $this$mod, int other) {
        int r0 = $this$mod % other;
        return r0 + ((((r0 ^ other) & ((-r0) | r0)) >> 31) & other);
    }

    private static final long floorDiv(byte $this$floorDiv, long other) {
        long r0 = $this$floorDiv;
        long r2 = r0 / other;
        if ((r0 ^ other) < 0) goto L5;
        return r2;
    L5:
        if ((r2 * other) != r0) goto L7;
        return r2;
    L7:
        return r2 - 1;
    }

    private static final long mod(byte $this$mod, long other) {
        long r0 = ((long) $this$mod) % other;
        return r0 + ((((r0 ^ other) & ((-r0) | r0)) >> 63) & other);
    }

    private static final int floorDiv(short $this$floorDiv, byte other) {
        int r0 = $this$floorDiv / other;
        if (($this$floorDiv ^ other) < 0) goto L5;
        return r0;
    L5:
        if ((r0 * other) != $this$floorDiv) goto L7;
        return r0;
    L7:
        return r0 - 1;
    }

    private static final byte mod(short $this$mod, byte other) {
        int r0 = $this$mod % other;
        return (byte) (r0 + ((((r0 ^ other) & ((-r0) | r0)) >> 31) & other));
    }

    private static final int floorDiv(short $this$floorDiv, short other) {
        int r0 = $this$floorDiv / other;
        if (($this$floorDiv ^ other) < 0) goto L5;
        return r0;
    L5:
        if ((r0 * other) != $this$floorDiv) goto L7;
        return r0;
    L7:
        return r0 - 1;
    }

    private static final short mod(short $this$mod, short other) {
        int r0 = $this$mod % other;
        return (short) (r0 + ((((r0 ^ other) & ((-r0) | r0)) >> 31) & other));
    }

    private static final int floorDiv(short $this$floorDiv, int other) {
        int r0 = $this$floorDiv / other;
        if (($this$floorDiv ^ other) < 0) goto L5;
        return r0;
    L5:
        if ((r0 * other) != $this$floorDiv) goto L7;
        return r0;
    L7:
        return r0 - 1;
    }

    private static final int mod(short $this$mod, int other) {
        int r0 = $this$mod % other;
        return r0 + ((((r0 ^ other) & ((-r0) | r0)) >> 31) & other);
    }

    private static final long floorDiv(short $this$floorDiv, long other) {
        long r0 = $this$floorDiv;
        long r2 = r0 / other;
        if ((r0 ^ other) < 0) goto L5;
        return r2;
    L5:
        if ((r2 * other) != r0) goto L7;
        return r2;
    L7:
        return r2 - 1;
    }

    private static final long mod(short $this$mod, long other) {
        long r0 = ((long) $this$mod) % other;
        return r0 + ((((r0 ^ other) & ((-r0) | r0)) >> 63) & other);
    }

    private static final int floorDiv(int $this$floorDiv, byte other) {
        int r0 = $this$floorDiv / other;
        if (($this$floorDiv ^ other) < 0) goto L5;
        return r0;
    L5:
        if ((r0 * other) != $this$floorDiv) goto L7;
        return r0;
    L7:
        return r0 - 1;
    }

    private static final byte mod(int $this$mod, byte other) {
        int r0 = $this$mod % other;
        return (byte) (r0 + ((((r0 ^ other) & ((-r0) | r0)) >> 31) & other));
    }

    private static final int floorDiv(int $this$floorDiv, short other) {
        int r0 = $this$floorDiv / other;
        if (($this$floorDiv ^ other) < 0) goto L5;
        return r0;
    L5:
        if ((r0 * other) != $this$floorDiv) goto L7;
        return r0;
    L7:
        return r0 - 1;
    }

    private static final short mod(int $this$mod, short other) {
        int r0 = $this$mod % other;
        return (short) (r0 + ((((r0 ^ other) & ((-r0) | r0)) >> 31) & other));
    }

    private static final int floorDiv(int $this$floorDiv, int other) {
        int q = $this$floorDiv / other;
        if (($this$floorDiv ^ other) < 0) goto L5;
        return q;
    L5:
        if ((q * other) != $this$floorDiv) goto L7;
        return q;
    L7:
        return q - 1;
    }

    private static final int mod(int $this$mod, int other) {
        int r = $this$mod % other;
        return ((((r ^ other) & ((-r) | r)) >> 31) & other) + r;
    }

    private static final long floorDiv(int $this$floorDiv, long other) {
        long r0 = $this$floorDiv;
        long r2 = r0 / other;
        if ((r0 ^ other) < 0) goto L5;
        return r2;
    L5:
        if ((r2 * other) != r0) goto L7;
        return r2;
    L7:
        return r2 - 1;
    }

    private static final long mod(int $this$mod, long other) {
        long r0 = ((long) $this$mod) % other;
        return r0 + ((((r0 ^ other) & ((-r0) | r0)) >> 63) & other);
    }

    private static final long floorDiv(long $this$floorDiv, byte other) {
        long r0 = other;
        long r2 = $this$floorDiv / r0;
        if (($this$floorDiv ^ r0) < 0) goto L5;
        return r2;
    L5:
        if ((r0 * r2) != $this$floorDiv) goto L7;
        return r2;
    L7:
        return r2 - 1;
    }

    private static final byte mod(long $this$mod, byte other) {
        long r0 = other;
        long r2 = $this$mod % r0;
        return (byte) (r2 + (r0 & (((r2 ^ r0) & ((-r2) | r2)) >> 63)));
    }

    private static final long floorDiv(long $this$floorDiv, short other) {
        long r0 = other;
        long r2 = $this$floorDiv / r0;
        if (($this$floorDiv ^ r0) < 0) goto L5;
        return r2;
    L5:
        if ((r0 * r2) != $this$floorDiv) goto L7;
        return r2;
    L7:
        return r2 - 1;
    }

    private static final short mod(long $this$mod, short other) {
        long r0 = other;
        long r2 = $this$mod % r0;
        return (short) (r2 + (r0 & (((r2 ^ r0) & ((-r2) | r2)) >> 63)));
    }

    private static final long floorDiv(long $this$floorDiv, int other) {
        long r0 = other;
        long r2 = $this$floorDiv / r0;
        if (($this$floorDiv ^ r0) < 0) goto L5;
        return r2;
    L5:
        if ((r0 * r2) != $this$floorDiv) goto L7;
        return r2;
    L7:
        return r2 - 1;
    }

    private static final int mod(long $this$mod, int other) {
        long r0 = other;
        long r2 = $this$mod % r0;
        return (int) (r2 + (r0 & (((r2 ^ r0) & ((-r2) | r2)) >> 63)));
    }

    private static final long floorDiv(long $this$floorDiv, long other) {
        long q = $this$floorDiv / other;
        if (($this$floorDiv ^ other) < 0) goto L5;
        return q;
    L5:
        if ((q * other) != $this$floorDiv) goto L7;
        return q;
    L7:
        return q - 1;
    }

    private static final long mod(long $this$mod, long other) {
        long r = $this$mod % other;
        return ((((r ^ other) & ((-r) | r)) >> 63) & other) + r;
    }

    private static final float mod(float $this$mod, float other) {
        float r = $this$mod % other;
        boolean r2 = true;
        if (r != 0.0f) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L14;
        if (Math.signum(r) == Math.signum(other)) goto L11;
        r2 = false;
    L11:
        if (r2 == true) goto L14;
        return r + other;
    L14:
        return r;
    L5:
        r1 = false;
        goto L6
    }

    private static final double mod(float $this$mod, double other) {
        double r0 = ((double) $this$mod) % other;
        boolean r3 = true;
        if (r0 != 0.0d) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L8;
        return r0;
    L8:
        if (Math.signum(r0) == Math.signum(other)) goto L11;
        r3 = false;
    L11:
        if (r3 == false) goto L13;
        return r0;
    L13:
        return r0 + other;
    L5:
        r2 = false;
        goto L6
    }

    private static final double mod(double $this$mod, float other) {
        double r0 = other;
        double r2 = $this$mod % r0;
        boolean r5 = true;
        if (r2 != 0.0d) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        return r2;
    L8:
        if (Math.signum(r2) == Math.signum(r0)) goto L11;
        r5 = false;
    L11:
        if (r5 == false) goto L13;
        return r2;
    L13:
        return r2 + r0;
    L5:
        r4 = false;
        goto L6
    }

    private static final double mod(double $this$mod, double other) {
        double r = $this$mod % other;
        boolean r3 = true;
        if (r != 0.0d) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L14;
        if (Math.signum(r) == Math.signum(other)) goto L11;
        r3 = false;
    L11:
        if (r3 == true) goto L14;
        return r + other;
    L14:
        return r;
    L5:
        r2 = false;
        goto L6
    }
}
