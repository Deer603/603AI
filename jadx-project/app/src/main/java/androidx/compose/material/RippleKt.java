package androidx.compose.material;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a0\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"DarkThemeRippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "DefaultBoundedRipple", "Landroidx/compose/material/RippleNodeFactory;", "DefaultUnboundedRipple", "LightThemeHighContrastRippleAlpha", "LightThemeLowContrastRippleAlpha", "LocalRippleConfiguration", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/RippleConfiguration;", "getLocalRippleConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ripple", "Landroidx/compose/foundation/IndicationNodeFactory;", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "ripple-wH6b6FI", "(Landroidx/compose/ui/graphics/ColorProducer;ZF)Landroidx/compose/foundation/IndicationNodeFactory;", "Landroidx/compose/ui/graphics/Color;", "ripple-H2RKhps", "(ZFJ)Landroidx/compose/foundation/IndicationNodeFactory;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RippleKt {
    private static final RippleAlpha DarkThemeRippleAlpha = null;
    private static final RippleNodeFactory DefaultBoundedRipple = null;
    private static final RippleNodeFactory DefaultUnboundedRipple = null;
    private static final RippleAlpha LightThemeHighContrastRippleAlpha = null;
    private static final RippleAlpha LightThemeLowContrastRippleAlpha = null;
    private static final ProvidableCompositionLocal<RippleConfiguration> LocalRippleConfiguration = null;

    public static final /* synthetic */ RippleAlpha access$getDarkThemeRippleAlpha$p() {
        return DarkThemeRippleAlpha;
    }

    public static final /* synthetic */ RippleAlpha access$getLightThemeHighContrastRippleAlpha$p() {
        return LightThemeHighContrastRippleAlpha;
    }

    public static final /* synthetic */ RippleAlpha access$getLightThemeLowContrastRippleAlpha$p() {
        return LightThemeLowContrastRippleAlpha;
    }

    /* JADX INFO: renamed from: ripple-H2RKhps$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m1746rippleH2RKhps$default(boolean r0, float r1, long r2, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r0 = true;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r1 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L12:
        return m1745rippleH2RKhps(r0, r1, r2);
    }

    /* JADX INFO: renamed from: ripple-H2RKhps, reason: not valid java name */
    public static final IndicationNodeFactory m1745rippleH2RKhps(boolean bounded, float radius, long color) {
        if (Dp.m6978equalsimpl0(radius, Dp.Companion.m6993getUnspecifiedD9Ej5fM()) == false) goto L11;
        if (Color.m4367equalsimpl0(color, Color.Companion.m4402getUnspecified0d7_KjU()) == false) goto L11;
        if (bounded == false) goto L12;
        return DefaultBoundedRipple;
    L12:
        return DefaultUnboundedRipple;
    L11:
        return new RippleNodeFactory(bounded, radius, color, null);
    }

    /* JADX INFO: renamed from: ripple-wH6b6FI$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m1748ripplewH6b6FI$default(ColorProducer r0, boolean r1, float r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r1 = true;
    L6:
        if ((r3 & 4) == 0) goto L9;
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        return m1747ripplewH6b6FI(r0, r1, r2);
    }

    /* JADX INFO: renamed from: ripple-wH6b6FI, reason: not valid java name */
    public static final IndicationNodeFactory m1747ripplewH6b6FI(ColorProducer color, boolean bounded, float radius) {
        return new RippleNodeFactory(bounded, radius, color, null);
    }

    public static final ProvidableCompositionLocal<RippleConfiguration> getLocalRippleConfiguration() {
        return LocalRippleConfiguration;
    }

    static {
        LocalRippleConfiguration = CompositionLocalKt.compositionLocalOf$default(null, RippleKt$LocalRippleConfiguration$1.INSTANCE, 1, null);
        boolean r2 = true;
        DefaultBoundedRipple = new RippleNodeFactory(r2, Dp.Companion.m6993getUnspecifiedD9Ej5fM(), Color.Companion.m4402getUnspecified0d7_KjU(), null);
        boolean r3 = false;
        DefaultUnboundedRipple = new RippleNodeFactory(r3, Dp.Companion.m6993getUnspecifiedD9Ej5fM(), Color.Companion.m4402getUnspecified0d7_KjU(), null);
        LightThemeHighContrastRippleAlpha = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
        LightThemeLowContrastRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
        DarkThemeRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);
    }
}
