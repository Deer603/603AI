package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Icon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u000f\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"DefaultIconSizeModifier", "Landroidx/compose/ui/Modifier;", "Icon", "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "contentDescription", "", "modifier", "tint", "Landroidx/compose/ui/graphics/Color;", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "defaultSizeFor", "isInfinite", "", "Landroidx/compose/ui/geometry/Size;", "isInfinite-uvyYCjk", "(J)Z", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = null;

    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1690Iconww6aTOc(ImageVector imageVector, String contentDescription, Modifier modifier, long tint, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, -800853103, "C(Icon)P(1!,3:c#ui.graphics.Color)65@3157L7,65@3196L7,68@3237L34,67@3213L163:Icon.kt#jmzs0o");
        if ((r25 & 4) == 0) goto L5;
        Modifier modifier2 = Modifier.Companion;
    L7:
        if ((r25 & 8) == 0) goto L9;
        ProvidableCompositionLocal<Color> r1 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r9 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long r10 = ((Color) r9).m4376unboximpl();
        ProvidableCompositionLocal<Float> r2 = ContentAlphaKt.getLocalContentAlpha();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long tint2 = Color.m4365copywmQWz5c$default(r10, ((Number) r6).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-800853103, $changed, -1, "androidx.compose.material.Icon (Icon.kt:66)");
    L13:
        VectorPainter r0 = VectorPainterKt.rememberVectorPainter(imageVector, $composer, $changed & 14);
        int r3 = (VectorPainter.$stable | ($changed & 112)) | ($changed & 896);
        m1689Iconww6aTOc(r0, contentDescription, modifier2, tint2, $composer, ($changed & 7168) | r3, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L9:
        tint2 = tint;
        goto L11
    L5:
        modifier2 = modifier;
        goto L7
    }

    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1688Iconww6aTOc(ImageBitmap bitmap, String contentDescription, Modifier modifier, long tint, Composer $composer, int $changed, int r26) {
        ComposerKt.sourceInformationMarkerStart($composer, -554892675, "C(Icon)P(!,3:c#ui.graphics.Color)99@4816L7,99@4855L7,101@4886L42,102@4933L136:Icon.kt#jmzs0o");
        if ((r26 & 4) == 0) goto L5;
        Modifier modifier2 = Modifier.Companion;
    L7:
        if ((r26 & 8) == 0) goto L9;
        ProvidableCompositionLocal<Color> r1 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r9 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long r10 = ((Color) r9).m4376unboximpl();
        ProvidableCompositionLocal<Float> r2 = ContentAlphaKt.getLocalContentAlpha();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long tint2 = Color.m4365copywmQWz5c$default(r10, ((Number) r6).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-554892675, $changed, -1, "androidx.compose.material.Icon (Icon.kt:100)");
    L13:
        ComposerKt.sourceInformationMarkerStart($composer, 724307081, "CC(remember):Icon.kt#9igjgp");
        boolean invalid$iv = $composer.changed(bitmap);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L16;
    L19:
        Object value$iv = new BitmapPainter(bitmap, 0, 0, 6, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L20:
        BitmapPainter painter = (BitmapPainter) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        int r3 = ($changed & 112) | ($changed & 896);
        m1689Iconww6aTOc(painter, contentDescription, modifier2, tint2, $composer, ($changed & 7168) | r3, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
    L23:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L16:
        if (it$iv != Composer.Companion.getEmpty()) goto L20;
    L9:
        tint2 = tint;
        goto L11
    L5:
        modifier2 = modifier;
        goto L7
    }

    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1689Iconww6aTOc(final Painter painter, final String contentDescription, Modifier modifier, long tint, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(-1142959010);
        ComposerKt.sourceInformation($composer2, "C(Icon)P(2!,3:c#ui.graphics.Color)136@6562L82,146@6906L217:Icon.kt#jmzs0o");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r34 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r3 = r34 & 4;
        if (r3 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier r5 = modifier;
    L34:
        if (($changed & 3072) == 0) goto L36;
        long r12 = tint;
    L45:
        if (($dirty & 1171) == 1170) goto L47;
        boolean r6 = true;
    L49:
        if ($composer2.shouldExecute(r6, $dirty & 1) == false) goto L107;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "133@6480L7,133@6519L7");
        if (($changed & 1) != 0) goto L53;
    L59:
        if (r3 == 0) goto L61;
        Modifier.Companion modifier2 = Modifier.Companion;
    L63:
        if ((r34 & 8) == 0) goto L65;
        ProvidableCompositionLocal<Color> r7 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r16 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long r17 = ((Color) r16).m4376unboximpl();
        ProvidableCompositionLocal<Float> r8 = ContentAlphaKt.getLocalContentAlpha();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long tint2 = Color.m4365copywmQWz5c$default(r17, ((Number) r14).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        int $dirty2 = $dirty & (-7169);
        Modifier modifier3 = modifier2;
    L66:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L69;
        ComposerKt.traceEventStart(-1142959010, $dirty2, -1, "androidx.compose.material.Icon (Icon.kt:134)");
    L69:
        ComposerKt.sourceInformationMarkerStart($composer2, 724360753, "CC(remember):Icon.kt#9igjgp");
        if ((($dirty2 & 7168) ^ 3072) <= 2048) goto L74;
        if ($composer2.changed(tint2) == false) goto L74;
    L75:
        boolean invalid$iv = true;
    L77:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L84;
        if (it$iv == Composer.Companion.getEmpty()) goto L84;
        long tint3 = tint2;
    L88:
        ColorFilter colorFilter = (ColorFilter) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (contentDescription == null) goto L102;
        $composer2.startReplaceGroup(980491077);
        ComposerKt.sourceInformation($composer2, "139@6738L115");
        Modifier.Companion r0 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 724366418, "CC(remember):Icon.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L93;
        boolean invalid$iv2 = true;
    L94:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L97;
    L100:
        Object value$iv = (Function1) new IconKt$Icon$semantics$1$1(contentDescription);
        $composer2.updateRememberedValue(value$iv);
        it$iv2 = value$iv;
    L101:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion r1 = SemanticsModifierKt.semantics$default(r0, false, (Function1) it$iv2, 1, null);
        $composer2.endReplaceGroup();
    L103:
        Modifier semantics = r1;
        BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier3), painter), painter, false, null, ContentScale.Companion.getFit(), 0.0f, colorFilter, 22, null).then(semantics), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventEnd();
    L106:
        final Modifier modifier4 = modifier3;
        final long tint4 = tint3;
    L108:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L112;
        r9.updateScope(new IconKt$Icon$1(painter, contentDescription, modifier4, tint4, $changed, r34));
        return;
    L112:
        return;
    L97:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L101;
    L93:
        invalid$iv2 = false;
        goto L94
    L102:
        $composer2.startReplaceGroup(980649859);
        $composer2.endReplaceGroup();
        r1 = Modifier.Companion;
    L84:
        if (Color.m4367equalsimpl0(tint2, Color.Companion.m4402getUnspecified0d7_KjU()) == false) goto L86;
        tint3 = tint2;
        Object value$iv2 = null;
    L87:
        $composer2.updateRememberedValue(value$iv2);
        it$iv = value$iv2;
        goto L88
    L86:
        tint3 = tint2;
        value$iv2 = ColorFilter.Companion.m4407tintxETnrds$default(ColorFilter.Companion, tint3, 0, 2, null);
    L74:
        if (($dirty2 & 3072) == 2048) goto L75;
        invalid$iv = false;
        goto L77
    L65:
        tint2 = r12;
        $dirty2 = $dirty;
        modifier3 = modifier2;
        goto L66
    L61:
        modifier2 = r5;
        goto L63
    L53:
        if ($composer2.getDefaultsInvalid() == true) goto L59;
        $composer2.skipToGroupEnd();
        if ((r34 & 8) == 0) goto L58;
        $dirty = $dirty & (-7169);
    L58:
        long r25 = r12;
        modifier3 = r5;
        tint2 = r25;
        $dirty2 = $dirty;
        goto L66
    L107:
        $composer2.skipToGroupEnd();
        modifier4 = r5;
        tint4 = r12;
        goto L108
    L47:
        r6 = false;
        goto L49
    L36:
        if ((r34 & 8) != 0) goto L40;
        r12 = tint;
        if ($composer2.changed(r12) == false) goto L41;
        int r10 = 2048;
    L42:
        $dirty = $dirty | r10;
    L41:
        r10 = 1024;
        goto L42
    L40:
        r12 = tint;
        goto L41
    L26:
        if (($changed & 384) != 0) goto L32;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L30;
        int r11 = 256;
    L31:
        $dirty = $dirty | r11;
        goto L34
    L30:
        r11 = 128;
        goto L31
    L32:
        r5 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changed(contentDescription) == false) goto L20;
        int r4 = 32;
    L21:
        $dirty = $dirty | r4;
        goto L22
    L20:
        r4 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(painter) == false) goto L10;
        int r13 = 4;
    L11:
        $dirty = $dirty | r13;
        goto L13
    L10:
        r13 = 2;
        goto L11
    }

    private static final Modifier defaultSizeFor(Modifier $this$defaultSizeFor, Painter painter) {
        if (Size.m4190equalsimpl0(painter.mo5037getIntrinsicSizeNHjbRc(), Size.Companion.m4202getUnspecifiedNHjbRc()) == false) goto L5;
    L8:
        Modifier.Companion r0 = DefaultIconSizeModifier;
    L10:
        return $this$defaultSizeFor.then(r0);
    L5:
        if (m1691isInfiniteuvyYCjk(painter.mo5037getIntrinsicSizeNHjbRc()) == true) goto L8;
        r0 = Modifier.Companion;
        goto L10
    }

    /* JADX INFO: renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m1691isInfiniteuvyYCjk(long $this$isInfinite_u2duvyYCjk) {
        if (Float.isInfinite(Size.m4194getWidthimpl($this$isInfinite_u2duvyYCjk)) == true) goto L5;
    L7:
        return false;
    L5:
        if (Float.isInfinite(Size.m4191getHeightimpl($this$isInfinite_u2duvyYCjk)) == false) goto L7;
        return true;
    }

    static {
        DefaultIconSizeModifier = SizeKt.m772size3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(24));
    }
}
