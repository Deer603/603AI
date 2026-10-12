package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Divider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a0\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a0\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a0\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "HorizontalDivider", "HorizontalDivider-9IZ8Weo", "VerticalDivider", "VerticalDivider-9IZ8Weo", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DividerKt {
    /* JADX INFO: renamed from: HorizontalDivider-9IZ8Weo, reason: not valid java name */
    public static final void m2199HorizontalDivider9IZ8Weo(Modifier modifier, float thickness, long color, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(75144485);
        ComposerKt.sourceInformation($composer2, "C(HorizontalDivider)P(1,2:c#ui.unit.Dp,0:c#ui.graphics.Color)52@2069L5,54@2134L220,54@2084L270:Divider.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r22 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L13:
        int r4 = r22 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        float r8 = thickness;
    L25:
        if (($changed & 384) == 0) goto L27;
        final long color2 = color;
    L36:
        if (($dirty & 147) == 146) goto L38;
    L41:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L44;
    L50:
        if (r2 == 0) goto L52;
        Modifier.Companion modifier2 = Modifier.Companion;
    L53:
        if (r4 == 0) goto L55;
        final float thickness2 = DividerDefaults.INSTANCE.m2197getThicknessD9Ej5fM();
    L57:
        if ((r22 & 4) == 0) goto L59;
        $dirty = $dirty & (-897);
        color2 = DividerDefaults.INSTANCE.getColor($composer2, 6);
    L59:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventStart(75144485, $dirty, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:54)");
    L62:
        boolean r9 = true;
        Modifier r0 = SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), thickness2);
        ComposerKt.sourceInformationMarkerStart($composer2, -873178642, "CC(remember):Divider.kt#9igjgp");
        if (($dirty & 112) != 32) goto L65;
        boolean r5 = true;
    L67:
        if ((($dirty & 896) ^ 384) <= 256) goto L71;
        if ($composer2.changed(color2) == false) goto L71;
    L74:
        boolean invalid$iv = r5 | r9;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L77;
    L80:
        Object value$iv = (Function1) new DividerKt$HorizontalDivider$1$1(thickness2, color2);
        $composer2.updateRememberedValue(value$iv);
    L81:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r0, (Function1) value$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L84;
        ComposerKt.traceEventEnd();
    L84:
        final Modifier modifier3 = modifier2;
        final float thickness3 = thickness2;
        final long color3 = color2;
    L85:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L89;
        r10.updateScope(new DividerKt$HorizontalDivider$2(modifier3, thickness3, color3, $changed, r22));
        return;
    L89:
        return;
    L77:
        if (it$iv == Composer.Companion.getEmpty()) goto L80;
        value$iv = it$iv;
    L71:
        if (($dirty & 384) == 256) goto L74;
        r9 = false;
        goto L74
    L65:
        r5 = false;
        goto L67
    L55:
        thickness2 = r8;
        goto L57
    L52:
        modifier2 = r3;
        goto L53
    L44:
        if ($composer2.getDefaultsInvalid() == true) goto L50;
        $composer2.skipToGroupEnd();
        if ((r22 & 4) == 0) goto L49;
        $dirty = $dirty & (-897);
    L49:
        modifier2 = r3;
        thickness2 = r8;
        goto L59
    L38:
        if ($composer2.getSkipping() == false) goto L41;
        $composer2.skipToGroupEnd();
        thickness3 = r8;
        modifier3 = r3;
        color3 = color2;
        goto L85
    L27:
        if ((r22 & 4) != 0) goto L31;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
    L32:
        r11 = 128;
        goto L33
    L31:
        color2 = color;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r8 = thickness;
        if ($composer2.changed(r8) == false) goto L21;
        int r12 = 32;
    L22:
        $dirty = $dirty | r12;
        goto L25
    L21:
        r12 = 16;
        goto L22
    L23:
        r8 = thickness;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L13
    }

    /* JADX INFO: renamed from: VerticalDivider-9IZ8Weo, reason: not valid java name */
    public static final void m2200VerticalDivider9IZ8Weo(Modifier modifier, float thickness, long color, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(-1534852205);
        ComposerKt.sourceInformation($composer2, "C(VerticalDivider)P(1,2:c#ui.unit.Dp,0:c#ui.graphics.Color)81@3089L5,83@3154L221,83@3104L271:Divider.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r22 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L13:
        int r4 = r22 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        float r8 = thickness;
    L25:
        if (($changed & 384) == 0) goto L27;
        final long color2 = color;
    L36:
        if (($dirty & 147) == 146) goto L38;
    L41:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L44;
    L50:
        if (r2 == 0) goto L52;
        Modifier.Companion modifier2 = Modifier.Companion;
    L53:
        if (r4 == 0) goto L55;
        final float thickness2 = DividerDefaults.INSTANCE.m2197getThicknessD9Ej5fM();
    L57:
        if ((r22 & 4) == 0) goto L59;
        $dirty = $dirty & (-897);
        color2 = DividerDefaults.INSTANCE.getColor($composer2, 6);
    L59:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventStart(-1534852205, $dirty, -1, "androidx.compose.material3.VerticalDivider (Divider.kt:83)");
    L62:
        boolean r9 = true;
        Modifier r0 = SizeKt.m777width3ABfNKs(SizeKt.fillMaxHeight$default(modifier2, 0.0f, 1, null), thickness2);
        ComposerKt.sourceInformationMarkerStart($composer2, -662977123, "CC(remember):Divider.kt#9igjgp");
        if (($dirty & 112) != 32) goto L65;
        boolean r5 = true;
    L67:
        if ((($dirty & 896) ^ 384) <= 256) goto L71;
        if ($composer2.changed(color2) == false) goto L71;
    L74:
        boolean invalid$iv = r5 | r9;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L77;
    L80:
        Object value$iv = (Function1) new DividerKt$VerticalDivider$1$1(thickness2, color2);
        $composer2.updateRememberedValue(value$iv);
    L81:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r0, (Function1) value$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L84;
        ComposerKt.traceEventEnd();
    L84:
        final Modifier modifier3 = modifier2;
        final float thickness3 = thickness2;
        final long color3 = color2;
    L85:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L89;
        r10.updateScope(new DividerKt$VerticalDivider$2(modifier3, thickness3, color3, $changed, r22));
        return;
    L89:
        return;
    L77:
        if (it$iv == Composer.Companion.getEmpty()) goto L80;
        value$iv = it$iv;
    L71:
        if (($dirty & 384) == 256) goto L74;
        r9 = false;
        goto L74
    L65:
        r5 = false;
        goto L67
    L55:
        thickness2 = r8;
        goto L57
    L52:
        modifier2 = r3;
        goto L53
    L44:
        if ($composer2.getDefaultsInvalid() == true) goto L50;
        $composer2.skipToGroupEnd();
        if ((r22 & 4) == 0) goto L49;
        $dirty = $dirty & (-897);
    L49:
        modifier2 = r3;
        thickness2 = r8;
        goto L59
    L38:
        if ($composer2.getSkipping() == false) goto L41;
        $composer2.skipToGroupEnd();
        thickness3 = r8;
        modifier3 = r3;
        color3 = color2;
        goto L85
    L27:
        if ((r22 & 4) != 0) goto L31;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
    L32:
        r11 = 128;
        goto L33
    L31:
        color2 = color;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r8 = thickness;
        if ($composer2.changed(r8) == false) goto L21;
        int r12 = 32;
    L22:
        $dirty = $dirty | r12;
        goto L25
    L21:
        r12 = 16;
        goto L22
    L23:
        r8 = thickness;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L13
    }

    @Deprecated(message = "Renamed to HorizontalDivider", replaceWith = @ReplaceWith(expression = "HorizontalDivider(modifier, thickness, color)", imports = {}))
    /* JADX INFO: renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public static final void m2198Divider9IZ8Weo(Modifier modifier, float thickness, long color, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(1562471785);
        ComposerKt.sourceInformation($composer2, "C(Divider)P(1,2:c#ui.unit.Dp,0:c#ui.graphics.Color)100@3659L5,108@3840L78:Divider.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r22 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L13:
        int r4 = r22 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        float r6 = thickness;
    L25:
        if (($changed & 384) == 0) goto L27;
        long color2 = color;
    L36:
        if (($dirty & 147) == 146) goto L38;
    L41:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L44;
    L50:
        if (r2 == 0) goto L52;
        Modifier.Companion modifier2 = Modifier.Companion;
    L53:
        if (r4 == 0) goto L55;
        float thickness2 = DividerDefaults.INSTANCE.m2197getThicknessD9Ej5fM();
    L57:
        if ((r22 & 4) == 0) goto L59;
        $dirty = $dirty & (-897);
        long color3 = DividerDefaults.INSTANCE.getColor($composer2, 6);
    L60:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L63;
        ComposerKt.traceEventStart(1562471785, $dirty, -1, "androidx.compose.material3.Divider (Divider.kt:101)");
    L63:
        $composer2.startReplaceGroup(-433645095);
        ComposerKt.sourceInformation($composer2, "*104@3767L7");
        if (Dp.m6978equalsimpl0(thickness2, Dp.Companion.m6991getHairlineD9Ej5fM()) == false) goto L66;
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r8 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        float $this$dp$iv = 1.0f / ((Density) r8).getDensity();
        float targetThickness = Dp.m6973constructorimpl($this$dp$iv);
    L67:
        $composer2.endReplaceGroup();
        BoxKt.Box(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), targetThickness), color3, null, 2, null), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventEnd();
    L70:
        final Modifier modifier3 = modifier2;
        final float thickness3 = thickness2;
        final long color4 = color3;
    L71:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L75;
        r9.updateScope(new DividerKt$Divider$1(modifier3, thickness3, color4, $changed, r22));
        return;
    L75:
        return;
    L66:
        targetThickness = thickness2;
        goto L67
    L59:
        color3 = color2;
        goto L60
    L55:
        thickness2 = r6;
        goto L57
    L52:
        modifier2 = r3;
        goto L53
    L44:
        if ($composer2.getDefaultsInvalid() == true) goto L50;
        $composer2.skipToGroupEnd();
        if ((r22 & 4) == 0) goto L49;
        $dirty = $dirty & (-897);
        modifier2 = r3;
        thickness2 = r6;
        color3 = color2;
        goto L60
    L49:
        modifier2 = r3;
        thickness2 = r6;
        color3 = color2;
        goto L60
    L38:
        if ($composer2.getSkipping() == false) goto L41;
        $composer2.skipToGroupEnd();
        modifier3 = r3;
        color4 = color2;
        thickness3 = r6;
        goto L71
    L27:
        if ((r22 & 4) != 0) goto L31;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
    L32:
        r10 = 128;
        goto L33
    L31:
        color2 = color;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r6 = thickness;
        if ($composer2.changed(r6) == false) goto L21;
        int r11 = 32;
    L22:
        $dirty = $dirty | r11;
        goto L25
    L21:
        r11 = 16;
        goto L22
    L23:
        r6 = thickness;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L13
    L10:
        r5 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L13
    }
}
