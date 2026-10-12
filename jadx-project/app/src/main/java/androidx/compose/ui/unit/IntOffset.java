package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: IntOffset.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0014\u0010\rJ'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010\rJ\u001b\u0010$\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b(\u0010&J\u001e\u0010)\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\u001cJ\u000f\u0010.\u001a\u00020/H\u0017¢\u0006\u0004\b0\u00101J\u0016\u00102\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u0088\u0001\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)I", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-iSbpLlY", "(JII)J", "div", "operand", "", "div-Bjo55l4", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "minus", "minus-qkQi6aY", "(JJ)J", "plus", "plus-qkQi6aY", "rem", "rem-Bjo55l4", "(JI)J", "times", "times-Bjo55l4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-nOcc-ac", "Companion", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class IntOffset {
    public static final Companion Companion = null;
    private static final long Max = 0;
    private static final long Zero = 0;
    private final long packedValue;

    /* JADX INFO: compiled from: IntOffset.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "()V", "Max", "Landroidx/compose/ui/unit/IntOffset;", "getMax-nOcc-ac", "()J", "J", "Zero", "getZero-nOcc-ac", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m7112getZeronOccac() {
            return IntOffset.access$getZero$cp();
        }

        /* JADX INFO: renamed from: getMax-nOcc-ac, reason: not valid java name */
        public final long m7111getMaxnOccac() {
            return IntOffset.access$getMax$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m7092boximpl(long r1) {
        return new IntOffset(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m7095constructorimpl(long r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7099equalsimpl(long r4, Object r6) {
        if ((r6 instanceof IntOffset) == true) goto L6;
        return false;
    L6:
        if (r4 == ((IntOffset) r6).m7110unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7100equalsimpl0(long r1, long r3) {
        if (r1 != r3) goto L5;
        return true;
    L5:
        return false;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7103hashCodeimpl(long r1) {
        return Long.hashCode(r1);
    }

    public boolean equals(Object r3) {
        return m7099equalsimpl(this.packedValue, r3);
    }

    public int hashCode() {
        return m7103hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7110unboximpl() {
        return this.packedValue;
    }

    public static final /* synthetic */ long access$getMax$cp() {
        return Max;
    }

    public static final /* synthetic */ long access$getZero$cp() {
        return Zero;
    }

    private /* synthetic */ IntOffset(long packedValue) {
        this.packedValue = packedValue;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final int m7101getXimpl(long arg0) {
        return (int) (arg0 >> 32);
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final int m7102getYimpl(long arg0) {
        return (int) (4294967295L & arg0);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m7093component1impl(long arg0) {
        return m7101getXimpl(arg0);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m7094component2impl(long arg0) {
        return m7102getYimpl(arg0);
    }

    /* JADX INFO: renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m7097copyiSbpLlY$default(long value$iv, int $i$f$unpackInt1, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        $i$f$unpackInt1 = (int) (value$iv >> 32);
    L6:
        if ((r8 & 2) == 0) goto L9;
        r7 = (int) (4294967295L & value$iv);
    L9:
        return m7096copyiSbpLlY(value$iv, $i$f$unpackInt1, r7);
    }

    /* JADX INFO: renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m7096copyiSbpLlY(long arg0, int x, int y) {
        return m7095constructorimpl((((long) x) << 32) | (((long) y) & 4294967295L));
    }

    /* JADX INFO: renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m7104minusqkQi6aY(long arg0, long other) {
        int val1$iv = ((int) (arg0 >> 32)) - ((int) (other >> 32));
        int $i$f$unpackInt2 = (int) (other & 4294967295L);
        int val2$iv = ((int) (arg0 & 4294967295L)) - $i$f$unpackInt2;
        return m7095constructorimpl((((long) val1$iv) << 32) | (4294967295L & ((long) val2$iv)));
    }

    /* JADX INFO: renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m7105plusqkQi6aY(long arg0, long other) {
        int val1$iv = ((int) (arg0 >> 32)) + ((int) (other >> 32));
        int $i$f$unpackInt2 = (int) (other & 4294967295L);
        int val2$iv = ((int) (arg0 & 4294967295L)) + $i$f$unpackInt2;
        return m7095constructorimpl((((long) val1$iv) << 32) | (4294967295L & ((long) val2$iv)));
    }

    /* JADX INFO: renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m7109unaryMinusnOccac(long arg0) {
        int val1$iv = -((int) (arg0 >> 32));
        int val2$iv = -((int) (arg0 & 4294967295L));
        return m7095constructorimpl((((long) val1$iv) << 32) | (4294967295L & ((long) val2$iv)));
    }

    /* JADX INFO: renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m7107timesBjo55l4(long arg0, float operand) {
        float $this$fastRoundToInt$iv = ((int) (arg0 >> 32)) * operand;
        int val1$iv = Math.round($this$fastRoundToInt$iv);
        float $this$fastRoundToInt$iv2 = ((int) (arg0 & 4294967295L)) * operand;
        int val2$iv = Math.round($this$fastRoundToInt$iv2);
        return m7095constructorimpl((((long) val1$iv) << 32) | (4294967295L & ((long) val2$iv)));
    }

    /* JADX INFO: renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m7098divBjo55l4(long arg0, float operand) {
        float $this$fastRoundToInt$iv = ((int) (arg0 >> 32)) / operand;
        int val1$iv = Math.round($this$fastRoundToInt$iv);
        float $this$fastRoundToInt$iv2 = ((int) (arg0 & 4294967295L)) / operand;
        int val2$iv = Math.round($this$fastRoundToInt$iv2);
        return m7095constructorimpl((((long) val1$iv) << 32) | (4294967295L & ((long) val2$iv)));
    }

    /* JADX INFO: renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m7106remBjo55l4(long arg0, int operand) {
        int val1$iv = ((int) (arg0 >> 32)) % operand;
        int val2$iv = ((int) (arg0 & 4294967295L)) % operand;
        return m7095constructorimpl((((long) val1$iv) << 32) | (4294967295L & ((long) val2$iv)));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7108toStringimpl(long arg0) {
        return '(' + m7101getXimpl(arg0) + ", " + m7102getYimpl(arg0) + ')';
    }

    public String toString() {
        return m7108toStringimpl(this.packedValue);
    }

    static {
        Companion = new Companion(null);
        Zero = m7095constructorimpl(0);
        Max = m7095constructorimpl(9223372034707292159L);
    }
}
