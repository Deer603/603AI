package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\b\u001a\u00020\t*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0010\u001a\u00020\n*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001fH\u0017J\u0016\u0010 \u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u0019\u0010\"\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010\"\u001a\u00020\r*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010%R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006&À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "(J)F", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Density extends FontScaling {

    /* JADX INFO: compiled from: Density.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m6961toDpGaN1DYA(Density $this, long $receiver) {
            return Density.m6949access$toDpGaN1DYA$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m6968toSp0xMU5do(Density $this, float $receiver) {
            return Density.m6956access$toSp0xMU5do$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m6966toPx0680j_4(Density $this, float $receiver) {
            return Density.m6954access$toPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m6960roundToPx0680j_4(Density $this, float $receiver) {
            return Density.m6948access$roundToPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m6965toPxR2X_6o(Density $this, long $receiver) {
            return Density.m6953access$toPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m6959roundToPxR2X_6o(Density $this, long $receiver) {
            return Density.m6947access$roundToPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6963toDpu2uoSUM(Density $this, int $receiver) {
            return Density.m6951access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6970toSpkPz2Gy4(Density $this, int $receiver) {
            return Density.m6958access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6962toDpu2uoSUM(Density $this, float $receiver) {
            return Density.m6950access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6969toSpkPz2Gy4(Density $this, float $receiver) {
            return Density.m6957access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        public static Rect toRect(Density $this, DpRect $receiver) {
            return Density.access$toRect$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m6967toSizeXkaWNTQ(Density $this, long $receiver) {
            return Density.m6955access$toSizeXkaWNTQ$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m6964toDpSizekrfVVM(Density $this, long $receiver) {
            return Density.m6952access$toDpSizekrfVVM$jd($this, $receiver);
        }
    }

    float getDensity();

    /* JADX INFO: renamed from: access$roundToPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ int m6947access$roundToPxR2X_6o$jd(Density $this, long $receiver) {
        return super.mo369roundToPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$roundToPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ int m6948access$roundToPx0680j_4$jd(Density $this, float $receiver) {
        return super.mo370roundToPx0680j_4($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-GaN1DYA$jd, reason: not valid java name */
    static /* synthetic */ float m6949access$toDpGaN1DYA$jd(Density $this, long $receiver) {
        return super.mo371toDpGaN1DYA($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m6950access$toDpu2uoSUM$jd(Density $this, float $receiver) {
        return super.mo372toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m6951access$toDpu2uoSUM$jd(Density $this, int $receiver) {
        return super.mo373toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDpSize-k-rfVVM$jd, reason: not valid java name */
    static /* synthetic */ long m6952access$toDpSizekrfVVM$jd(Density $this, long $receiver) {
        return super.mo374toDpSizekrfVVM($receiver);
    }

    /* JADX INFO: renamed from: access$toPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ float m6953access$toPxR2X_6o$jd(Density $this, long $receiver) {
        return super.mo375toPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$toPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ float m6954access$toPx0680j_4$jd(Density $this, float $receiver) {
        return super.mo376toPx0680j_4($receiver);
    }

    static /* synthetic */ Rect access$toRect$jd(Density $this, DpRect $receiver) {
        return super.toRect($receiver);
    }

    /* JADX INFO: renamed from: access$toSize-XkaWNTQ$jd, reason: not valid java name */
    static /* synthetic */ long m6955access$toSizeXkaWNTQ$jd(Density $this, long $receiver) {
        return super.mo377toSizeXkaWNTQ($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-0xMU5do$jd, reason: not valid java name */
    static /* synthetic */ long m6956access$toSp0xMU5do$jd(Density $this, float $receiver) {
        return super.mo378toSp0xMU5do($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m6957access$toSpkPz2Gy4$jd(Density $this, float $receiver) {
        return super.mo379toSpkPz2Gy4($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m6958access$toSpkPz2Gy4$jd(Density $this, int $receiver) {
        return super.mo380toSpkPz2Gy4($receiver);
    }

    /* JADX INFO: renamed from: toPx-0680j_4 */
    default float mo376toPx0680j_4(float $this$toPx_u2d0680j_4) {
        return getDensity() * $this$toPx_u2d0680j_4;
    }

    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    default int mo370roundToPx0680j_4(float $this$roundToPx_u2d0680j_4) {
        float px = mo376toPx0680j_4($this$roundToPx_u2d0680j_4);
        if (Float.isInfinite(px) == false) goto L6;
        return Integer.MAX_VALUE;
    L6:
        return Math.round(px);
    }

    /* JADX INFO: renamed from: toPx--R2X_6o */
    default float mo375toPxR2X_6o(long $this$toPx_u2d_u2dR2X_6o) {
        boolean value$iv = TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA($this$toPx_u2d_u2dR2X_6o), TextUnitType.Companion.m7200getSpUIouoOA());
        if (value$iv == true) goto L6;
        InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
    L6:
        return mo376toPx0680j_4(mo371toDpGaN1DYA($this$toPx_u2d_u2dR2X_6o));
    }

    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    default int mo369roundToPxR2X_6o(long $this$roundToPx_u2d_u2dR2X_6o) {
        float $this$fastRoundToInt$iv = mo375toPxR2X_6o($this$roundToPx_u2d_u2dR2X_6o);
        return Math.round($this$fastRoundToInt$iv);
    }

    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo373toDpu2uoSUM(int $this$toDp_u2du2uoSUM) {
        float $this$dp$iv = $this$toDp_u2du2uoSUM / getDensity();
        return Dp.m6973constructorimpl($this$dp$iv);
    }

    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo380toSpkPz2Gy4(int $this$toSp_u2dkPz2Gy4) {
        return mo378toSp0xMU5do(mo373toDpu2uoSUM($this$toSp_u2dkPz2Gy4));
    }

    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo372toDpu2uoSUM(float $this$toDp_u2du2uoSUM) {
        float $this$dp$iv = $this$toDp_u2du2uoSUM / getDensity();
        return Dp.m6973constructorimpl($this$dp$iv);
    }

    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo379toSpkPz2Gy4(float $this$toSp_u2dkPz2Gy4) {
        return mo378toSp0xMU5do(mo372toDpu2uoSUM($this$toSp_u2dkPz2Gy4));
    }

    default Rect toRect(DpRect $this$toRect) {
        return new Rect(mo376toPx0680j_4($this$toRect.m7056getLeftD9Ej5fM()), mo376toPx0680j_4($this$toRect.m7058getTopD9Ej5fM()), mo376toPx0680j_4($this$toRect.m7057getRightD9Ej5fM()), mo376toPx0680j_4($this$toRect.m7055getBottomD9Ej5fM()));
    }

    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    default long mo377toSizeXkaWNTQ(long $this$toSize_u2dXkaWNTQ) {
        if ($this$toSize_u2dXkaWNTQ == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L9;
        float width$iv = mo376toPx0680j_4(DpSize.m7071getWidthD9Ej5fM($this$toSize_u2dXkaWNTQ));
        float height$iv = mo376toPx0680j_4(DpSize.m7069getHeightD9Ej5fM($this$toSize_u2dXkaWNTQ));
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    L9:
        return Size.Companion.m4202getUnspecifiedNHjbRc();
    L5:
        r3 = false;
        goto L6
    }

    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    default long mo374toDpSizekrfVVM(long $this$toDpSize_u2dk_u2drfVVM) {
        if ($this$toDpSize_u2dk_u2drfVVM == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L9;
        int bits$iv$iv$iv = (int) ($this$toDpSize_u2dk_u2drfVVM >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & $this$toDpSize_u2dk_u2drfVVM);
        return DpKt.m6995DpSizeYgX7TsA(mo372toDpu2uoSUM(Float.intBitsToFloat(bits$iv$iv$iv)), mo372toDpu2uoSUM(Float.intBitsToFloat(bits$iv$iv$iv2)));
    L9:
        return DpSize.Companion.m7080getUnspecifiedMYxV2XQ();
    L5:
        r3 = false;
        goto L6
    }
}
