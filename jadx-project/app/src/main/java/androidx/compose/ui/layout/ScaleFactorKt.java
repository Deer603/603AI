package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ScaleFactor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0087\b¢\u0006\u0002\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u0019\u001a\u001f\u0010\u001f\u001a\u00020\u0016*\u00020\u00022\u0006\u0010!\u001a\u00020\u0016H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0019\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/layout/ScaleFactor;", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified-FK8aYYs", "(J)Z", "isUnspecified", "isUnspecified-FK8aYYs$annotations", "isUnspecified-FK8aYYs", "ScaleFactor", "scaleX", "", "scaleY", "(FF)J", "lerp", "start", "stop", "fraction", "lerp--bDIf60", "(JJF)J", "div", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "div-UQTWf7w", "(JJ)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", "times", "times-UQTWf7w", "size", "times-m-w2e94", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScaleFactorKt {
    /* JADX INFO: renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m5813isSpecifiedFK8aYYs$annotations(long r0) {
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m5815isUnspecifiedFK8aYYs$annotations(long r0) {
    }

    public static final long ScaleFactor(float scaleX, float scaleY) {
        long v1$iv = Float.floatToRawIntBits(scaleX);
        long v2$iv = Float.floatToRawIntBits(scaleY);
        return ScaleFactor.m5797constructorimpl((v1$iv << 32) | (4294967295L & v2$iv));
    }

    /* JADX INFO: renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m5812isSpecifiedFK8aYYs(long $this$isSpecified) {
        if ($this$isSpecified == ScaleFactor.Companion.m5810getUnspecified_hLwfpc()) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m5814isUnspecifiedFK8aYYs(long $this$isUnspecified) {
        if ($this$isUnspecified != ScaleFactor.Companion.m5810getUnspecified_hLwfpc()) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m5817takeOrElseoyDd2qo(long $this$takeOrElse_u2doyDd2qo, Function0<ScaleFactor> r8) {
        if ($this$takeOrElse_u2doyDd2qo == ScaleFactor.Companion.m5810getUnspecified_hLwfpc()) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L9;
        return $this$takeOrElse_u2doyDd2qo;
    L9:
        return r8.invoke().m5808unboximpl();
    L5:
        r4 = false;
        goto L6
    }

    /* JADX INFO: renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m5818timesUQTWf7w(long $this$times_u2dUQTWf7w, long scaleFactor) {
        int bits$iv$iv$iv = (int) ($this$times_u2dUQTWf7w >> 32);
        int bits$iv$iv$iv2 = (int) (scaleFactor >> 32);
        float width$iv = Float.intBitsToFloat(bits$iv$iv$iv) * Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) ($this$times_u2dUQTWf7w & 4294967295L);
        int bits$iv$iv$iv4 = (int) (scaleFactor & 4294967295L);
        float height$iv = Float.intBitsToFloat(bits$iv$iv$iv3) * Float.intBitsToFloat(bits$iv$iv$iv4);
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m5819timesmw2e94(long $this$times_u2dm_u2dw2e94, long size) {
        return m5818timesUQTWf7w(size, $this$times_u2dm_u2dw2e94);
    }

    /* JADX INFO: renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m5811divUQTWf7w(long $this$div_u2dUQTWf7w, long scaleFactor) {
        int bits$iv$iv$iv = (int) ($this$div_u2dUQTWf7w >> 32);
        int bits$iv$iv$iv2 = (int) (scaleFactor >> 32);
        float width$iv = Float.intBitsToFloat(bits$iv$iv$iv) / Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) ($this$div_u2dUQTWf7w & 4294967295L);
        int bits$iv$iv$iv4 = (int) (scaleFactor & 4294967295L);
        float height$iv = Float.intBitsToFloat(bits$iv$iv$iv3) / Float.intBitsToFloat(bits$iv$iv$iv4);
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m5816lerpbDIf60(long start, long stop, float fraction) {
        int bits$iv$iv$iv = (int) (start >> 32);
        int bits$iv$iv$iv2 = (int) (stop >> 32);
        float scaleX$iv = MathHelpersKt.lerp(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2), fraction);
        int bits$iv$iv$iv3 = (int) (start & 4294967295L);
        int bits$iv$iv$iv4 = (int) (stop & 4294967295L);
        float scaleY$iv = MathHelpersKt.lerp(Float.intBitsToFloat(bits$iv$iv$iv3), Float.intBitsToFloat(bits$iv$iv$iv4), fraction);
        long v1$iv$iv = Float.floatToRawIntBits(scaleX$iv);
        long v2$iv$iv = Float.floatToRawIntBits(scaleY$iv);
        return ScaleFactor.m5797constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }
}
