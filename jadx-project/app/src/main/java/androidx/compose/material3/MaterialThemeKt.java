package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MaterialTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0002\b\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a>\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u0016\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"LocalUsingExpressiveTheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalUsingExpressiveTheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "TextSelectionBackgroundOpacity", "", "MaterialExpressiveTheme", "", "colorScheme", "Landroidx/compose/material3/ColorScheme;", "shapes", "Landroidx/compose/material3/Shapes;", "typography", "Landroidx/compose/material3/Typography;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "MaterialTheme", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MaterialThemeKt {
    private static final ProvidableCompositionLocal<Boolean> LocalUsingExpressiveTheme = null;
    public static final float TextSelectionBackgroundOpacity = 0.4f;

    public static final void MaterialTheme(ColorScheme colorScheme, Shapes shapes, Typography typography, final Function2<? super Composer, ? super Integer, Unit> r19, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(-2127166334);
        ComposerKt.sourceInformation($composer2, "C(MaterialTheme)P(!1,2,3)51@2364L11,52@2412L6,53@2463L10,56@2542L32,57@2601L40,67@3101L81,59@2681L501:MaterialTheme.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) == 0) goto L5;
        ColorScheme colorScheme2 = colorScheme;
    L14:
        if (($changed & 48) == 0) goto L16;
        Shapes shapes2 = shapes;
    L25:
        if (($changed & 384) == 0) goto L27;
        Typography r7 = typography;
    L36:
        if ((r22 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        if (($dirty & 1171) == 1170) goto L48;
    L51:
        $composer2.startDefaults();
        if (($changed & 1) == 0) goto L67;
        if ($composer2.getDefaultsInvalid() == true) goto L67;
        $composer2.skipToGroupEnd();
        if ((r22 & 1) == 0) goto L60;
        $dirty = $dirty & (-15);
    L60:
        if ((r22 & 2) == 0) goto L63;
        $dirty = $dirty & (-113);
    L63:
        if ((r22 & 4) == 0) goto L65;
        Shapes r15 = shapes2;
        int $dirty2 = $dirty & (-897);
        Shapes shapes3 = r15;
        final Typography typography2 = r7;
    L76:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L79;
        ComposerKt.traceEventStart(-2127166334, $dirty2, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:55)");
    L79:
        int $dirty3 = $dirty2;
        Indication rippleIndication = RippleKt.m2534rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0, $composer2, 0, 7);
        TextSelectionColors selectionColors = rememberTextSelectionColors(colorScheme2, $composer2, $dirty3 & 14);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ColorSchemeKt.getLocalColorScheme().provides(colorScheme2), IndicationKt.getLocalIndication().provides(rippleIndication), RippleThemeKt.getLocalRippleTheme().provides(CompatRippleTheme.INSTANCE), ShapesKt.getLocalShapes().provides(shapes3), TextSelectionColorsKt.getLocalTextSelectionColors().provides(selectionColors), TypographyKt.getLocalTypography().provides(typography2)}, ComposableLambdaKt.rememberComposableLambda(-1066563262, true, new C05381(typography2, r19), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventEnd();
    L82:
        ColorScheme r3 = colorScheme2;
        final Shapes shapes4 = shapes3;
        final ColorScheme colorScheme3 = r3;
        final Typography typography3 = typography2;
    L83:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L87;
        r8.updateScope(new C05392(colorScheme3, shapes4, typography3, r19, $changed, r22));
        return;
    L87:
        return;
    L65:
        Shapes r16 = shapes2;
        $dirty2 = $dirty;
        shapes3 = r16;
        typography2 = r7;
    L67:
        if ((r22 & 1) == 0) goto L70;
        colorScheme2 = MaterialTheme.INSTANCE.getColorScheme($composer2, 6);
        $dirty = $dirty & (-15);
    L70:
        if ((r22 & 2) == 0) goto L73;
        shapes2 = MaterialTheme.INSTANCE.getShapes($composer2, 6);
        $dirty = $dirty & (-113);
    L73:
        if ((r22 & 4) == 0) goto L75;
        Shapes r17 = shapes2;
        $dirty2 = $dirty & (-897);
        shapes3 = r17;
        typography2 = MaterialTheme.INSTANCE.getTypography($composer2, 6);
        goto L76
    L75:
        Shapes r18 = shapes2;
        $dirty2 = $dirty;
        shapes3 = r18;
        typography2 = r7;
        goto L76
    L48:
        if ($composer2.getSkipping() == false) goto L51;
        $composer2.skipToGroupEnd();
        typography3 = r7;
        colorScheme3 = colorScheme2;
        shapes4 = shapes2;
        goto L83
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changedInstance(r19) == false) goto L43;
        int r9 = 2048;
    L44:
        $dirty = $dirty | r9;
        goto L46
    L43:
        r9 = 1024;
        goto L44
    L27:
        if ((r22 & 4) != 0) goto L31;
        r7 = typography;
        if ($composer2.changed(r7) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
    L32:
        r10 = 128;
        goto L33
    L31:
        r7 = typography;
        goto L32
    L16:
        if ((r22 & 2) != 0) goto L20;
        shapes2 = shapes;
        if ($composer2.changed(shapes2) == false) goto L21;
        int r11 = 32;
    L22:
        $dirty = $dirty | r11;
    L21:
        r11 = 16;
        goto L22
    L20:
        shapes2 = shapes;
        goto L21
    L5:
        if ((r22 & 1) != 0) goto L9;
        colorScheme2 = colorScheme;
        if ($composer2.changed(colorScheme2) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
    L10:
        r6 = 2;
        goto L11
    L9:
        colorScheme2 = colorScheme;
        goto L10
    }

    public static final void MaterialExpressiveTheme(final ColorScheme colorScheme, final Shapes shapes, Typography typography, final Function2<? super Composer, ? super Integer, Unit> r14, Composer $composer, final int $changed, final int r17) {
        Composer $composer2 = $composer.startRestartGroup(-1399457222);
        ComposerKt.sourceInformation($composer2, "C(MaterialExpressiveTheme)P(!1,2,3)134@5791L7:MaterialTheme.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r17 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r17 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r6 = r17 & 4;
        if (r6 == 0) goto L26;
        $dirty = $dirty | 384;
    L33:
        if ((r17 & 8) == 0) goto L36;
        $dirty = $dirty | 3072;
    L42:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L45;
    L48:
        if (r2 == 0) goto L50;
        colorScheme = null;
    L50:
        if (r5 == 0) goto L52;
        shapes = null;
    L52:
        if (r6 == 0) goto L54;
        final Typography typography2 = null;
    L56:
        if (ComposerKt.isTraceInProgress() == false) goto L58;
        ComposerKt.traceEventStart(-1399457222, $dirty2, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:133)");
    L58:
        ProvidableCompositionLocal<Boolean> r0 = LocalUsingExpressiveTheme;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r7 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (((Boolean) r7).booleanValue() == false) goto L73;
        $composer2.startReplaceGroup(547059915);
        ComposerKt.sourceInformation($composer2, "135@5810L240");
        $composer2.startReplaceGroup(1126027167);
        ComposerKt.sourceInformation($composer2, "136@5880L11");
        if (colorScheme != null) goto L63;
        ColorScheme r1 = MaterialTheme.INSTANCE.getColorScheme($composer2, 6);
    L64:
        $composer2.endReplaceGroup();
        $composer2.startReplaceGroup(1126029309);
        ComposerKt.sourceInformation($composer2, "137@5946L10");
        if (typography2 != null) goto L67;
        Typography r3 = MaterialTheme.INSTANCE.getTypography($composer2, 6);
    L68:
        $composer2.endReplaceGroup();
        $composer2.startReplaceGroup(1126031253);
        ComposerKt.sourceInformation($composer2, "138@6003L6");
        if (shapes != null) goto L71;
        Shapes r4 = MaterialTheme.INSTANCE.getShapes($composer2, 6);
    L72:
        $composer2.endReplaceGroup();
        MaterialTheme(r1, r4, r3, r14, $composer2, $dirty2 & 7168, 0);
        Composer $composer3 = $composer2;
        $composer3.endReplaceGroup();
    L75:
        if (ComposerKt.isTraceInProgress() == false) goto L77;
        ComposerKt.traceEventEnd();
    L77:
        final Typography typography3 = typography2;
        final ColorScheme colorScheme2 = colorScheme;
        final Shapes shapes2 = shapes;
    L78:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L82;
        r11.updateScope(new AnonymousClass2(colorScheme2, shapes2, typography3, r14, $changed, r17));
        return;
    L82:
        return;
    L71:
        r4 = shapes;
        goto L72
    L67:
        r3 = typography2;
        goto L68
    L63:
        r1 = colorScheme;
        goto L64
    L73:
        $composer3 = $composer2;
        $composer3.startReplaceGroup(547327197);
        ComposerKt.sourceInformation($composer3, "142@6138L412,142@6072L478");
        CompositionLocalKt.CompositionLocalProvider(LocalUsingExpressiveTheme.provides(true), ComposableLambdaKt.rememberComposableLambda(2050809758, true, new AnonymousClass1(colorScheme, shapes, typography2, r14), $composer3, 54), $composer3, ProvidedValue.$stable | 48);
        $composer3.endReplaceGroup();
        goto L75
    L54:
        typography2 = typography;
        goto L56
    L45:
        if ($composer2.getSkipping() == false) goto L48;
        $composer2.skipToGroupEnd();
        typography3 = typography;
        $composer3 = $composer2;
        colorScheme2 = colorScheme;
        shapes2 = shapes;
        goto L78
    L36:
        if (($changed & 3072) != 0) goto L42;
        if ($composer2.changedInstance(r14) == false) goto L40;
        int r9 = 2048;
    L41:
        $dirty = $dirty | r9;
        goto L42
    L40:
        r9 = 1024;
        goto L41
    L26:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changed(typography) == false) goto L30;
        int r10 = 256;
    L31:
        $dirty = $dirty | r10;
        goto L33
    L30:
        r10 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changed(shapes) == false) goto L20;
        int r8 = 32;
    L21:
        $dirty = $dirty | r8;
        goto L22
    L20:
        r8 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(colorScheme) == false) goto L10;
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L12
    L10:
        r12 = 2;
        goto L11
    }

    static {
        LocalUsingExpressiveTheme = CompositionLocalKt.staticCompositionLocalOf(MaterialThemeKt$LocalUsingExpressiveTheme$1.INSTANCE);
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalUsingExpressiveTheme() {
        return LocalUsingExpressiveTheme;
    }

    public static final TextSelectionColors rememberTextSelectionColors(ColorScheme colorScheme, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1866455512, "C(rememberTextSelectionColors)161@6816L198:MaterialTheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(1866455512, $changed, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:159)");
    L6:
        long primaryColor = colorScheme.m2038getPrimary0d7_KjU();
        ComposerKt.sourceInformationMarkerStart($composer, -1160063291, "CC(remember):MaterialTheme.kt#9igjgp");
        boolean invalid$iv = $composer.changed(primaryColor);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L9;
    L12:
        Object value$iv = new TextSelectionColors(primaryColor, Color.m4365copywmQWz5c$default(primaryColor, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $composer.updateRememberedValue(value$iv);
    L13:
        TextSelectionColors r7 = (TextSelectionColors) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r7;
    L9:
        if (it$iv == Composer.Companion.getEmpty()) goto L12;
        value$iv = it$iv;
        goto L13
    }
}
