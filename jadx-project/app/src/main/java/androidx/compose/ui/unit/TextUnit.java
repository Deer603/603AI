package androidx.compose.ui.unit;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010 J\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010!J\u001a\u0010\"\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010 J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0005R\u0017\u0010\u0010\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "packedValue", "", "constructor-impl", "(J)J", "isEm", "", "isEm-impl", "(J)Z", "isSp", "isSp-impl", "rawType", "getRawType$annotations", "()V", "getRawType-impl", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "value", "", "getValue-impl", "(J)F", "compareTo", "", "other", "compareTo--R2X_6o", "(JJ)I", "div", "", "div-kPz2Gy4", "(JD)J", "(JF)J", "(JI)J", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "times", "times-kPz2Gy4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-XSAIIZE", "Companion", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class TextUnit {
    public static final Companion Companion = null;
    private static final TextUnitType[] TextUnitTypes = null;
    private static final long Unspecified = 0;
    private final long packedValue;

    /* JADX INFO: compiled from: TextUnit.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "()V", "TextUnitTypes", "", "Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit_release", "()[Landroidx/compose/ui/unit/TextUnitType;", "[Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "Landroidx/compose/ui/unit/TextUnit;", "getUnspecified-XSAIIZE$annotations", "getUnspecified-XSAIIZE", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7177getUnspecifiedXSAIIZE$annotations() {
        }

        private Companion() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.access$getTextUnitTypes$cp();
        }

        /* JADX INFO: renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m7178getUnspecifiedXSAIIZE() {
            return TextUnit.access$getUnspecified$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m7157boximpl(long r1) {
        return new TextUnit(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m7159constructorimpl(long r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7163equalsimpl(long r4, Object r6) {
        if ((r6 instanceof TextUnit) == true) goto L6;
        return false;
    L6:
        if (r4 == ((TextUnit) r6).m7176unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7164equalsimpl0(long r1, long r3) {
        if (r1 != r3) goto L5;
        return true;
    L5:
        return false;
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7168hashCodeimpl(long r1) {
        return Long.hashCode(r1);
    }

    public boolean equals(Object r3) {
        return m7163equalsimpl(this.packedValue, r3);
    }

    public int hashCode() {
        return m7168hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7176unboximpl() {
        return this.packedValue;
    }

    public static final /* synthetic */ TextUnitType[] access$getTextUnitTypes$cp() {
        return TextUnitTypes;
    }

    public static final /* synthetic */ long access$getUnspecified$cp() {
        return Unspecified;
    }

    private /* synthetic */ TextUnit(long packedValue) {
        this.packedValue = packedValue;
    }

    /* JADX INFO: renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m7175unaryMinusXSAIIZE(long arg0) {
        TextUnitKt.m7180checkArithmeticR2X_6o(arg0);
        return TextUnitKt.pack(m7165getRawTypeimpl(arg0), -m7167getValueimpl(arg0));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m7161divkPz2Gy4(long arg0, float other) {
        TextUnitKt.m7180checkArithmeticR2X_6o(arg0);
        return TextUnitKt.pack(m7165getRawTypeimpl(arg0), m7167getValueimpl(arg0) / other);
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m7160divkPz2Gy4(long arg0, double other) {
        TextUnitKt.m7180checkArithmeticR2X_6o(arg0);
        return TextUnitKt.pack(m7165getRawTypeimpl(arg0), (float) (((double) m7167getValueimpl(arg0)) / other));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m7162divkPz2Gy4(long arg0, int other) {
        TextUnitKt.m7180checkArithmeticR2X_6o(arg0);
        return TextUnitKt.pack(m7165getRawTypeimpl(arg0), m7167getValueimpl(arg0) / other);
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7172timeskPz2Gy4(long arg0, float other) {
        TextUnitKt.m7180checkArithmeticR2X_6o(arg0);
        return TextUnitKt.pack(m7165getRawTypeimpl(arg0), m7167getValueimpl(arg0) * other);
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7171timeskPz2Gy4(long arg0, double other) {
        TextUnitKt.m7180checkArithmeticR2X_6o(arg0);
        return TextUnitKt.pack(m7165getRawTypeimpl(arg0), (float) (((double) m7167getValueimpl(arg0)) * other));
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7173timeskPz2Gy4(long arg0, int other) {
        TextUnitKt.m7180checkArithmeticR2X_6o(arg0);
        return TextUnitKt.pack(m7165getRawTypeimpl(arg0), m7167getValueimpl(arg0) * other);
    }

    /* JADX INFO: renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m7158compareToR2X_6o(long arg0, long other) {
        TextUnitKt.m7181checkArithmeticNB67dxo(arg0, other);
        return Float.compare(m7167getValueimpl(arg0), m7167getValueimpl(other));
    }

    public String toString() {
        return m7174toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7174toStringimpl(long arg0) {
        long r0 = m7166getTypeUIouoOA(arg0);
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7201getUnspecifiedUIouoOA()) == false) goto L6;
        return "Unspecified";
    L6:
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L9;
        return m7167getValueimpl(arg0) + ".sp";
    L9:
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7199getEmUIouoOA()) == true) goto L15;
        return "Invalid";
    L15:
        return m7167getValueimpl(arg0) + ".em";
    }

    static {
        Companion = new Companion(null);
        TextUnitTypes = new TextUnitType[]{TextUnitType.m7192boximpl(TextUnitType.Companion.m7201getUnspecifiedUIouoOA()), TextUnitType.m7192boximpl(TextUnitType.Companion.m7200getSpUIouoOA()), TextUnitType.m7192boximpl(TextUnitType.Companion.m7199getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0, Float.NaN);
    }

    /* JADX INFO: renamed from: getRawType-impl, reason: not valid java name */
    public static final long m7165getRawTypeimpl(long arg0) {
        return 1095216660480L & arg0;
    }

    /* JADX INFO: renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m7166getTypeUIouoOA(long arg0) {
        return TextUnitTypes[(int) (m7165getRawTypeimpl(arg0) >>> 32)].m7198unboximpl();
    }

    /* JADX INFO: renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m7170isSpimpl(long arg0) {
        if (m7165getRawTypeimpl(arg0) != 4294967296L) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m7169isEmimpl(long arg0) {
        if (m7165getRawTypeimpl(arg0) != 8589934592L) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    public static final float m7167getValueimpl(long arg0) {
        int bits$iv = (int) (4294967295L & arg0);
        return Float.intBitsToFloat(bits$iv);
    }
}
