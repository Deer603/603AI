package androidx.compose.material;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MaterialTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"MaterialTheme", "", "colors", "Landroidx/compose/material/Colors;", "typography", "Landroidx/compose/material/Typography;", "shapes", "Landroidx/compose/material/Shapes;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MaterialThemeKt {
    public static final void MaterialTheme(Colors colors, Typography typography, Shapes shapes, final Function2<? super Composer, ? super Integer, Unit> r47, Composer $composer, final int $changed, final int r50) {
        Composer $composer2 = $composer.startRestartGroup(-891417079);
        ComposerKt.sourceInformation($composer2, "C(MaterialTheme)P(!1,3,2)*65@2983L216,72@3310L45,75@3481L4,80@3684L93,73@3360L417:MaterialTheme.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) == 0) goto L5;
        Colors colors2 = colors;
    L14:
        if (($changed & 48) == 0) goto L16;
        final Typography typography2 = typography;
    L25:
        if (($changed & 384) == 0) goto L27;
        Shapes shapes2 = shapes;
    L36:
        if ((r50 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        if (($dirty & 1171) == 1170) goto L48;
        boolean r10 = true;
    L50:
        if ($composer2.shouldExecute(r10, $dirty & 1) == false) goto L87;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "59@2802L6,60@2853L10,61@2900L6");
        if (($changed & 1) == 0) goto L67;
        if ($composer2.getDefaultsInvalid() == true) goto L67;
        $composer2.skipToGroupEnd();
        if ((r50 & 1) == 0) goto L60;
        $dirty = $dirty & (-15);
    L60:
        if ((r50 & 2) == 0) goto L63;
        $dirty = $dirty & (-113);
    L63:
        if ((r50 & 4) == 0) goto L65;
        $dirty = $dirty & (-897);
        Colors colors3 = colors2;
    L76:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L79;
        ComposerKt.traceEventStart(-891417079, $dirty, -1, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:63)");
    L79:
        ComposerKt.sourceInformationMarkerStart($composer2, 586109300, "CC(remember):MaterialTheme.kt#9igjgp");
        Object value$iv = $composer2.rememberedValue();
        if (value$iv != Composer.Companion.getEmpty()) goto L83;
        value$iv = Colors.m1589copypvPzIIM$default(colors3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 8191, null);
        $composer2.updateRememberedValue(value$iv);
    L83:
        Colors rememberedColors = (Colors) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ColorsKt.updateColorsFrom(rememberedColors, colors3);
        IndicationNodeFactory rippleIndication = RippleKt.m1746rippleH2RKhps$default(false, 0.0f, 0, 7, null);
        TextSelectionColors selectionColors = MaterialTextSelectionColorsKt.rememberTextSelectionColors(rememberedColors, $composer2, 0);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ColorsKt.getLocalColors().provides(rememberedColors), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh($composer2, 6))), IndicationKt.getLocalIndication().provides(rippleIndication), ShapesKt.getLocalShapes().provides(shapes2), TextSelectionColorsKt.getLocalTextSelectionColors().provides(selectionColors), TypographyKt.getLocalTypography().provides(typography2)}, ComposableLambdaKt.rememberComposableLambda(-1740102967, true, new AnonymousClass1(typography2, r47), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L86;
        ComposerKt.traceEventEnd();
    L86:
        final Typography typography3 = typography2;
        final Colors colors4 = colors3;
        final Shapes shapes3 = shapes2;
    L88:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L92;
        r9.updateScope(new AnonymousClass2(colors4, typography3, shapes3, r47, $changed, r50));
        return;
    L92:
        return;
    L65:
        colors3 = colors2;
    L67:
        if ((r50 & 1) == 0) goto L70;
        colors2 = MaterialTheme.INSTANCE.getColors($composer2, 6);
        $dirty = $dirty & (-15);
    L70:
        if ((r50 & 2) == 0) goto L73;
        typography2 = MaterialTheme.INSTANCE.getTypography($composer2, 6);
        $dirty = $dirty & (-113);
    L73:
        if ((r50 & 4) == 0) goto L75;
        shapes2 = MaterialTheme.INSTANCE.getShapes($composer2, 6);
        $dirty = $dirty & (-897);
        colors3 = colors2;
        goto L76
    L75:
        colors3 = colors2;
        goto L76
    L87:
        $composer2.skipToGroupEnd();
        colors4 = colors2;
        typography3 = typography2;
        shapes3 = shapes2;
        goto L88
    L48:
        r10 = false;
        goto L50
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changedInstance(r47) == false) goto L43;
        int r11 = 2048;
    L44:
        $dirty = $dirty | r11;
        goto L46
    L43:
        r11 = 1024;
        goto L44
    L27:
        if ((r50 & 4) != 0) goto L31;
        shapes2 = shapes;
        if ($composer2.changed(shapes2) == false) goto L32;
        int r12 = 256;
    L33:
        $dirty = $dirty | r12;
    L32:
        r12 = 128;
        goto L33
    L31:
        shapes2 = shapes;
        goto L32
    L16:
        if ((r50 & 2) != 0) goto L20;
        typography2 = typography;
        if ($composer2.changed(typography2) == false) goto L21;
        int r13 = 32;
    L22:
        $dirty = $dirty | r13;
    L21:
        r13 = 16;
        goto L22
    L20:
        typography2 = typography;
        goto L21
    L5:
        if ((r50 & 1) != 0) goto L9;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L10;
        int r8 = 4;
    L11:
        $dirty = $dirty | r8;
    L10:
        r8 = 2;
        goto L11
    L9:
        colors2 = colors;
        goto L10
    }
}
