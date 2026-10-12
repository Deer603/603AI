package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.Metadata;

/* JADX INFO: compiled from: FontScaling.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\n*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/FontScaling;", "", "fontScale", "", "getFontScale$annotations", "()V", "getFontScale", "()F", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "toSp", "toSp-0xMU5do", "(F)J", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FontScaling {

    /* JADX INFO: compiled from: FontScaling.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7085toSp0xMU5do(FontScaling $this, float $receiver) {
            return FontScaling.m7083access$toSp0xMU5do$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7084toDpGaN1DYA(FontScaling $this, long $receiver) {
            return FontScaling.m7082access$toDpGaN1DYA$jd($this, $receiver);
        }
    }

    float getFontScale();

    /* JADX INFO: renamed from: access$toDp-GaN1DYA$jd, reason: not valid java name */
    static /* synthetic */ float m7082access$toDpGaN1DYA$jd(FontScaling $this, long $receiver) {
        return super.mo371toDpGaN1DYA($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-0xMU5do$jd, reason: not valid java name */
    static /* synthetic */ long m7083access$toSp0xMU5do$jd(FontScaling $this, float $receiver) {
        return super.mo378toSp0xMU5do($receiver);
    }

    /* JADX INFO: renamed from: toSp-0xMU5do */
    default long mo378toSp0xMU5do(float $this$toSp_u2d0xMU5do) {
        if (FontScaleConverterFactory.INSTANCE.isNonLinearFontScalingActive(getFontScale()) == false) goto L5;
        FontScaleConverter converter = FontScaleConverterFactory.INSTANCE.forScale(getFontScale());
        if (converter == null) goto L9;
        float r1 = converter.convertDpToSp($this$toSp_u2d0xMU5do);
    L11:
        return TextUnitKt.getSp(r1);
    L9:
        r1 = $this$toSp_u2d0xMU5do / getFontScale();
        goto L11
    L5:
        return TextUnitKt.getSp($this$toSp_u2d0xMU5do / getFontScale());
    }

    /* JADX INFO: renamed from: toDp-GaN1DYA */
    default float mo371toDpGaN1DYA(long $this$toDp_u2dGaN1DYA) {
        boolean value$iv = TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA($this$toDp_u2dGaN1DYA), TextUnitType.Companion.m7200getSpUIouoOA());
        if (value$iv == true) goto L6;
        InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
    L6:
        if (FontScaleConverterFactory.INSTANCE.isNonLinearFontScalingActive(getFontScale()) == false) goto L8;
        FontScaleConverter converter = FontScaleConverterFactory.INSTANCE.forScale(getFontScale());
        float r1 = TextUnit.m7167getValueimpl($this$toDp_u2dGaN1DYA);
        if (converter != null) goto L12;
        float r2 = r1 * getFontScale();
    L14:
        return Dp.m6973constructorimpl(r2);
    L12:
        r2 = converter.convertSpToDp(r1);
        goto L14
    L8:
        return Dp.m6973constructorimpl(TextUnit.m7167getValueimpl($this$toDp_u2dGaN1DYA) * getFontScale());
    }
}
