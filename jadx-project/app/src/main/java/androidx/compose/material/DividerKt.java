package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: Divider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"DividerAlpha", "", "Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "thickness", "Landroidx/compose/ui/unit/Dp;", "startIndent", "Divider-oMI9zvI", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DividerKt {
    private static final float DividerAlpha = 0.12f;

    /* JADX INFO: renamed from: Divider-oMI9zvI, reason: not valid java name */
    public static final void m1641DivideroMI9zvI(Modifier modifier, long color, float thickness, float startIndent, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(-1249392198);
        ComposerKt.sourceInformation($composer2, "C(Divider)P(1,0:c#ui.graphics.Color,3:c#ui.unit.Dp,2:c#ui.unit.Dp)64@2318L94:Divider.kt#jmzs0o");
        int $dirty = $changed;
        int r2 = r32 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long r4 = color;
    L24:
        int r7 = r32 & 4;
        if (r7 == 0) goto L28;
        $dirty = $dirty | 384;
        float thickness2 = thickness;
    L35:
        int r10 = r32 & 8;
        if (r10 == 0) goto L39;
        $dirty = $dirty | 3072;
        float r11 = startIndent;
    L47:
        if (($dirty & 1171) == 1170) goto L49;
        boolean r12 = true;
    L51:
        if ($composer2.shouldExecute(r12, $dirty & 1) == false) goto L91;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "48@1889L6");
        if (($changed & 1) != 0) goto L55;
    L61:
        if (r2 == 0) goto L63;
        Modifier.Companion modifier2 = Modifier.Companion;
    L65:
        if ((r32 & 2) == 0) goto L67;
        long color2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer2, 6).m1597getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        $dirty = $dirty & (-113);
    L68:
        if (r7 == 0) goto L70;
        thickness2 = Dp.m6973constructorimpl(1);
    L70:
        if (r10 == 0) goto L72;
        float startIndent2 = Dp.m6973constructorimpl(0);
    L73:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L77;
        ComposerKt.traceEventStart(-1249392198, $dirty, -1, "androidx.compose.material.Divider (Divider.kt:51)");
    L77:
        if (startIndent2 != 0.0f) goto L79;
        boolean r5 = true;
    L80:
        if (r5 == true) goto L82;
        Modifier.Companion indentMod = PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, startIndent2, 0.0f, 0.0f, 0.0f, 14, null);
    L84:
        if (Dp.m6978equalsimpl0(thickness2, Dp.Companion.m6991getHairlineD9Ej5fM()) == false) goto L86;
        $composer2.startReplaceGroup(-129273423);
        ComposerKt.sourceInformation($composer2, "*60@2245L7");
        ProvidableCompositionLocal<Density> r8 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r13 = $composer2.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        float $this$dp$iv = 1.0f / ((Density) r13).getDensity();
        float targetThickness = Dp.m6973constructorimpl($this$dp$iv);
        $composer2.endReplaceGroup();
    L87:
        BoxKt.Box(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2.then(indentMod), 0.0f, 1, null), targetThickness), color2, null, 2, null), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L90;
        ComposerKt.traceEventEnd();
    L90:
        final Modifier modifier3 = modifier2;
        final long color3 = color2;
        final float thickness3 = thickness2;
        final float startIndent3 = startIndent2;
    L92:
        ScopeUpdateScope r14 = $composer2.endRestartGroup();
        if (r14 == null) goto L96;
        r14.updateScope(new DividerKt$Divider$1(modifier3, color3, thickness3, startIndent3, $changed, r32));
        return;
    L96:
        return;
    L86:
        $composer2.startReplaceGroup(-129206866);
        $composer2.endReplaceGroup();
        targetThickness = thickness2;
        goto L87
    L82:
        indentMod = Modifier.Companion;
        goto L84
    L79:
        r5 = false;
        goto L80
    L72:
        startIndent2 = r11;
        goto L73
    L67:
        color2 = r4;
        goto L68
    L63:
        modifier2 = r3;
        goto L65
    L55:
        if ($composer2.getDefaultsInvalid() == true) goto L61;
        $composer2.skipToGroupEnd();
        if ((r32 & 2) == 0) goto L60;
        $dirty = $dirty & (-113);
    L60:
        modifier2 = r3;
        color2 = r4;
        startIndent2 = r11;
        goto L73
    L91:
        $composer2.skipToGroupEnd();
        modifier3 = r3;
        color3 = r4;
        thickness3 = thickness2;
        startIndent3 = r11;
        goto L92
    L49:
        r12 = false;
        goto L51
    L39:
        if (($changed & 3072) != 0) goto L45;
        r11 = startIndent;
        if ($composer2.changed(r11) == false) goto L43;
        int r15 = 2048;
    L44:
        $dirty = $dirty | r15;
        goto L47
    L43:
        r15 = 1024;
        goto L44
    L45:
        r11 = startIndent;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        thickness2 = thickness;
        if ($composer2.changed(thickness2) == false) goto L32;
        int r16 = 256;
    L33:
        $dirty = $dirty | r16;
        goto L35
    L32:
        r16 = 128;
        goto L33
    L34:
        thickness2 = thickness;
        goto L35
    L16:
        if ((r32 & 2) != 0) goto L20;
        r4 = color;
        if ($composer2.changed(r4) == false) goto L21;
        int r9 = 32;
    L22:
        $dirty = $dirty | r9;
    L21:
        r9 = 16;
        goto L22
    L20:
        r4 = color;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L14
    L10:
        r6 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L14
    }
}
