package androidx.compose.ui.unit;

import kotlin.Metadata;

/* JADX INFO: compiled from: FontScaling.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\n*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/FontScalingLinear;", "", "fontScale", "", "getFontScale$annotations", "()V", "getFontScale", "()F", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "toSp", "toSp-0xMU5do", "(F)J", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FontScalingLinear {

    /* JADX INFO: compiled from: FontScaling.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7091toSp0xMU5do(FontScalingLinear $this, float $receiver) {
            return FontScalingLinear.m7087access$toSp0xMU5do$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7090toDpGaN1DYA(FontScalingLinear $this, long $receiver) {
            return FontScalingLinear.m7086access$toDpGaN1DYA$jd($this, $receiver);
        }
    }

    float getFontScale();

    /* JADX INFO: renamed from: access$toDp-GaN1DYA$jd, reason: not valid java name */
    static /* synthetic */ float m7086access$toDpGaN1DYA$jd(FontScalingLinear $this, long $receiver) {
        return super.m7088toDpGaN1DYA($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-0xMU5do$jd, reason: not valid java name */
    static /* synthetic */ long m7087access$toSp0xMU5do$jd(FontScalingLinear $this, float $receiver) {
        return super.m7089toSp0xMU5do($receiver);
    }

    /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
    default long m7089toSp0xMU5do(float $this$toSp_u2d0xMU5do) {
        return TextUnitKt.getSp($this$toSp_u2d0xMU5do / getFontScale());
    }

    /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
    default float m7088toDpGaN1DYA(long $this$toDp_u2dGaN1DYA) {
        if (TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA($this$toDp_u2dGaN1DYA), TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L7;
        return Dp.m6973constructorimpl(TextUnit.m7167getValueimpl($this$toDp_u2dGaN1DYA) * getFontScale());
    L7:
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }
}
