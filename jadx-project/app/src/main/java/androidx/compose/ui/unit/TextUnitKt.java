package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\u001a \u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0015\u001a\"\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a*\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a*\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001d\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\fH\u0001¢\u0006\u0002\u00107\u001a%\u00108\u001a\u00020\u0006*\u00020\u00062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060:H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u001f\u0010=\u001a\u00020\u0006*\u00020\u00072\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u001f\u0010=\u001a\u00020\u0006*\u00020\f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010#\u001a\u001f\u0010=\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010A\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\r\u001a\u0004\b\n\u0010\u000e\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0010\u001a\u0004\b\n\u0010\u0011\"\u001f\u0010\u0012\u001a\u00020\u0013*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001f\u0010\u0018\u001a\u00020\u0013*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u000b\"\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000e\"\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"UNIT_MASK", "", "UNIT_TYPE_EM", "UNIT_TYPE_SP", "UNIT_TYPE_UNSPECIFIED", "em", "Landroidx/compose/ui/unit/TextUnit;", "", "getEm$annotations", "(D)V", "getEm", "(D)J", "", "(F)V", "(F)J", "", "(I)V", "(I)J", "isSpecified", "", "isSpecified--R2X_6o$annotations", "(J)V", "isSpecified--R2X_6o", "(J)Z", "isUnspecified", "isUnspecified--R2X_6o$annotations", "isUnspecified--R2X_6o", "sp", "getSp$annotations", "getSp", "TextUnit", "value", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/unit/TextUnitType;", "TextUnit-anM5pPY", "(FJ)J", "checkArithmetic", "", "a", "checkArithmetic--R2X_6o", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", "lerp", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "pack", "unitType", "v", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "times", "other", "times-mpE4wyQ", "(DJ)J", "(IJ)J", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    public static /* synthetic */ void getEm$annotations(double r0) {
    }

    public static /* synthetic */ void getEm$annotations(float r0) {
    }

    public static /* synthetic */ void getEm$annotations(int r0) {
    }

    public static /* synthetic */ void getSp$annotations(double r0) {
    }

    public static /* synthetic */ void getSp$annotations(float r0) {
    }

    public static /* synthetic */ void getSp$annotations(int r0) {
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m7184isSpecifiedR2X_6o$annotations(long r0) {
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m7186isUnspecifiedR2X_6o$annotations(long r0) {
    }

    /* JADX INFO: renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m7179TextUnitanM5pPY(float value, long type) {
        return pack(type, value);
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m7183isSpecifiedR2X_6o(long $this$isSpecified) {
        if (TextUnit.m7165getRawTypeimpl($this$isSpecified) != 0) goto L5;
        boolean r4 = true;
    L7:
        return !r4;
    L5:
        r4 = false;
        goto L7
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m7185isUnspecifiedR2X_6o(long $this$isUnspecified) {
        if (TextUnit.m7165getRawTypeimpl($this$isUnspecified) != 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m7188takeOrElseeAf_CNQ(long $this$takeOrElse_u2deAf_CNQ, Function0<TextUnit> r13) {
        if (TextUnit.m7165getRawTypeimpl($this$takeOrElse_u2deAf_CNQ) != 0) goto L5;
        boolean r7 = true;
    L7:
        if (r7 == true) goto L10;
        return $this$takeOrElse_u2deAf_CNQ;
    L10:
        return r13.invoke().m7176unboximpl();
    L5:
        r7 = false;
        goto L7
    }

    public static final long getSp(float $this$sp) {
        return pack(UNIT_TYPE_SP, $this$sp);
    }

    public static final long getEm(float $this$em) {
        return pack(UNIT_TYPE_EM, $this$em);
    }

    public static final long getSp(double $this$sp) {
        return pack(UNIT_TYPE_SP, (float) $this$sp);
    }

    public static final long getEm(double $this$em) {
        return pack(UNIT_TYPE_EM, (float) $this$em);
    }

    public static final long getSp(int $this$sp) {
        return pack(UNIT_TYPE_SP, $this$sp);
    }

    public static final long getEm(int $this$em) {
        return pack(UNIT_TYPE_EM, $this$em);
    }

    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m7190timesmpE4wyQ(float $this$times_u2dmpE4wyQ, long other) {
        m7180checkArithmeticR2X_6o(other);
        return pack(TextUnit.m7165getRawTypeimpl(other), TextUnit.m7167getValueimpl(other) * $this$times_u2dmpE4wyQ);
    }

    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m7189timesmpE4wyQ(double $this$times_u2dmpE4wyQ, long other) {
        m7180checkArithmeticR2X_6o(other);
        return pack(TextUnit.m7165getRawTypeimpl(other), ((float) $this$times_u2dmpE4wyQ) * TextUnit.m7167getValueimpl(other));
    }

    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m7191timesmpE4wyQ(int $this$times_u2dmpE4wyQ, long other) {
        m7180checkArithmeticR2X_6o(other);
        return pack(TextUnit.m7165getRawTypeimpl(other), $this$times_u2dmpE4wyQ * TextUnit.m7167getValueimpl(other));
    }

    public static final long pack(long unitType, float v) {
        return TextUnit.m7159constructorimpl((((long) Float.floatToRawIntBits(v)) & 4294967295L) | unitType);
    }

    /* JADX INFO: renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m7180checkArithmeticR2X_6o(long a) {
        if (TextUnit.m7165getRawTypeimpl(a) != 0) goto L5;
        boolean r3 = true;
    L6:
        boolean value$iv = !r3;
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        return;
    L11:
        return;
    L5:
        r3 = false;
        goto L6
    }

    /* JADX INFO: renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m7181checkArithmeticNB67dxo(long a, long b) {
        boolean value$iv = true;
        if (TextUnit.m7165getRawTypeimpl(a) != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
    L13:
        value$iv = false;
    L15:
        if (value$iv == true) goto L17;
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
    L17:
        boolean value$iv2 = TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA(a), TextUnit.m7166getTypeUIouoOA(b));
        if (value$iv2 == true) goto L22;
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + TextUnitType.m7197toStringimpl(TextUnit.m7166getTypeUIouoOA(a)) + " and " + TextUnitType.m7197toStringimpl(TextUnit.m7166getTypeUIouoOA(b)));
        return;
    L22:
        return;
    L8:
        if (TextUnit.m7165getRawTypeimpl(b) != 0) goto L10;
        boolean r1 = true;
    L11:
        if (r1 == true) goto L13;
    L10:
        r1 = false;
        goto L11
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m7182checkArithmeticvU0ePk(long a, long b, long c) {
        boolean value$iv = true;
        if (TextUnit.m7165getRawTypeimpl(a) != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
    L18:
        boolean value$iv2 = false;
    L20:
        if (value$iv2 == true) goto L23;
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
    L23:
        if (TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA(a), TextUnit.m7166getTypeUIouoOA(b)) == true) goto L25;
    L27:
        value$iv = false;
    L29:
        if (value$iv == true) goto L33;
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + TextUnitType.m7197toStringimpl(TextUnit.m7166getTypeUIouoOA(a)) + " and " + TextUnitType.m7197toStringimpl(TextUnit.m7166getTypeUIouoOA(b)));
        return;
    L33:
        return;
    L25:
        if (TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA(b), TextUnit.m7166getTypeUIouoOA(c)) == false) goto L27;
    L8:
        if (TextUnit.m7165getRawTypeimpl(b) != 0) goto L10;
        boolean r1 = true;
    L11:
        if (r1 == true) goto L18;
        if (TextUnit.m7165getRawTypeimpl(c) != 0) goto L15;
        boolean r2 = true;
    L16:
        if (r2 == true) goto L18;
        value$iv2 = true;
        goto L20
    L15:
        r2 = false;
        goto L16
    L10:
        r1 = false;
        goto L11
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m7187lerpC3pnCVY(long start, long stop, float fraction) {
        m7181checkArithmeticNB67dxo(start, stop);
        return pack(TextUnit.m7165getRawTypeimpl(start), MathHelpersKt.lerp(TextUnit.m7167getValueimpl(start), TextUnit.m7167getValueimpl(stop), fraction));
    }
}
