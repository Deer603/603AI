package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a0\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0010\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a0\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0010\u001a\u00020\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"DefaultBoundedRipple", "Landroidx/compose/material3/RippleNodeFactory;", "DefaultUnboundedRipple", "LocalRippleConfiguration", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/RippleConfiguration;", "getLocalRippleConfiguration$annotations", "()V", "getLocalRippleConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalUseFallbackRippleImplementation", "", "getLocalUseFallbackRippleImplementation$annotations", "getLocalUseFallbackRippleImplementation", "ripple", "Landroidx/compose/foundation/IndicationNodeFactory;", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "bounded", "radius", "Landroidx/compose/ui/unit/Dp;", "ripple-wH6b6FI", "(Landroidx/compose/ui/graphics/ColorProducer;ZF)Landroidx/compose/foundation/IndicationNodeFactory;", "Landroidx/compose/ui/graphics/Color;", "ripple-H2RKhps", "(ZFJ)Landroidx/compose/foundation/IndicationNodeFactory;", "rippleOrFallbackImplementation", "Landroidx/compose/foundation/Indication;", "rippleOrFallbackImplementation-9IZ8Weo", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RippleKt {
    private static final RippleNodeFactory DefaultBoundedRipple = null;
    private static final RippleNodeFactory DefaultUnboundedRipple = null;
    private static final ProvidableCompositionLocal<RippleConfiguration> LocalRippleConfiguration = null;
    private static final ProvidableCompositionLocal<Boolean> LocalUseFallbackRippleImplementation = null;

    public static /* synthetic */ void getLocalRippleConfiguration$annotations() {
    }

    public static /* synthetic */ void getLocalUseFallbackRippleImplementation$annotations() {
    }

    /* JADX INFO: renamed from: ripple-H2RKhps$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m2531rippleH2RKhps$default(boolean r0, float r1, long r2, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r0 = true;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r1 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L12:
        return m2530rippleH2RKhps(r0, r1, r2);
    }

    /* JADX INFO: renamed from: ripple-H2RKhps, reason: not valid java name */
    public static final IndicationNodeFactory m2530rippleH2RKhps(boolean bounded, float radius, long color) {
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
    public static /* synthetic */ IndicationNodeFactory m2533ripplewH6b6FI$default(ColorProducer r0, boolean r1, float r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r1 = true;
    L6:
        if ((r3 & 4) == 0) goto L9;
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        return m2532ripplewH6b6FI(r0, r1, r2);
    }

    /* JADX INFO: renamed from: ripple-wH6b6FI, reason: not valid java name */
    public static final IndicationNodeFactory m2532ripplewH6b6FI(ColorProducer color, boolean bounded, float radius) {
        return new RippleNodeFactory(bounded, radius, color, null);
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalUseFallbackRippleImplementation() {
        return LocalUseFallbackRippleImplementation;
    }

    static {
        LocalUseFallbackRippleImplementation = CompositionLocalKt.staticCompositionLocalOf(RippleKt$LocalUseFallbackRippleImplementation$1.INSTANCE);
        LocalRippleConfiguration = CompositionLocalKt.compositionLocalOf$default(null, RippleKt$LocalRippleConfiguration$1.INSTANCE, 1, null);
        boolean r2 = true;
        DefaultBoundedRipple = new RippleNodeFactory(r2, Dp.Companion.m6993getUnspecifiedD9Ej5fM(), Color.Companion.m4402getUnspecified0d7_KjU(), null);
        boolean r3 = false;
        DefaultUnboundedRipple = new RippleNodeFactory(r3, Dp.Companion.m6993getUnspecifiedD9Ej5fM(), Color.Companion.m4402getUnspecified0d7_KjU(), null);
    }

    public static final ProvidableCompositionLocal<RippleConfiguration> getLocalRippleConfiguration() {
        return LocalRippleConfiguration;
    }

    /* JADX INFO: renamed from: rippleOrFallbackImplementation-9IZ8Weo, reason: not valid java name */
    public static final Indication m2534rippleOrFallbackImplementation9IZ8Weo(boolean bounded, float radius, long color, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, -1315814667, "C(rippleOrFallbackImplementation)P(!1,2:c#ui.unit.Dp,1:c#ui.graphics.Color):Ripple.kt#uh7d8r");
        if ((r14 & 1) == 0) goto L5;
        boolean bounded2 = true;
    L7:
        if ((r14 & 2) == 0) goto L9;
        float radius2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
        float radius3 = radius2;
    L11:
        if ((r14 & 4) == 0) goto L13;
        long color2 = Color.Companion.m4402getUnspecified0d7_KjU();
        long color3 = color2;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(-1315814667, $changed, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
    L17:
        $composer.startReplaceGroup(-1280632857);
        ComposerKt.sourceInformation($composer, "231@10696L7,232@10748L38");
        ProvidableCompositionLocal<Boolean> r8 = LocalUseFallbackRippleImplementation;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r11 = $composer.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (((Boolean) r11).booleanValue() == false) goto L20;
        Composer $composer2 = $composer;
        IndicationNodeFactory r9 = androidx.compose.material.ripple.RippleKt.m1874rememberRipple9IZ8Weo(bounded2, radius3, color3, $composer2, (($changed & 14) | ($changed & 112)) | ($changed & 896), 0);
    L21:
        $composer2.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L24;
        ComposerKt.traceEventEnd();
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        return r9;
    L20:
        $composer2 = $composer;
        r9 = m2530rippleH2RKhps(bounded2, radius3, color3);
        goto L21
    L13:
        color3 = color;
        goto L15
    L9:
        radius3 = radius;
        goto L11
    L5:
        bounded2 = bounded;
        goto L7
    }
}
