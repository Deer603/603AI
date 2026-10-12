package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Icon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0011\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0014\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u0017\u001a\u00020\u0018*\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"DefaultIconSizeModifier", "Landroidx/compose/ui/Modifier;", "Icon", "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "contentDescription", "", "modifier", "tint", "Landroidx/compose/ui/graphics/Color;", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/ColorProducer;", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/ColorProducer;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "defaultSizeFor", "defaultSizeForColorProducer", "isInfinite", "", "Landroidx/compose/ui/geometry/Size;", "isInfinite-uvyYCjk", "(J)Z", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = null;

    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m2277Iconww6aTOc(final ImageVector imageVector, final String contentDescription, Modifier modifier, long tint, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(-126890956);
        ComposerKt.sourceInformation($composer2, "C(Icon)P(1!,3:c#ui.graphics.Color)69@3394L7,72@3434L34,71@3410L163:Icon.kt#uh7d8r");
        int $dirty = $changed;
        if ((r22 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r22 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
        String r8 = contentDescription;
    L23:
        int r2 = r22 & 4;
        if (r2 == 0) goto L27;
        $dirty = $dirty | 384;
        final Modifier modifier2 = modifier;
    L35:
        if (($changed & 3072) == 0) goto L37;
        final long tint2 = tint;
    L46:
        if (($dirty & 1171) == 1170) goto L48;
    L51:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L54;
    L60:
        if (r2 == 0) goto L62;
        Modifier.Companion modifier3 = Modifier.Companion;
    L64:
        if ((r22 & 8) == 0) goto L66;
        ProvidableCompositionLocal<Color> r3 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty = $dirty & (-7169);
        Modifier modifier4 = modifier3;
        long tint3 = ((Color) r10).m4376unboximpl();
    L67:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventStart(-126890956, $dirty, -1, "androidx.compose.material3.Icon (Icon.kt:70)");
    L70:
        m2276Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, $composer2, $dirty & 14), r8, modifier4, tint3, $composer2, ((VectorPainter.$stable | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventEnd();
    L73:
        modifier2 = modifier4;
        tint2 = tint3;
    L74:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L78;
        r9.updateScope(new AnonymousClass1(imageVector, contentDescription, modifier2, tint2, $changed, r22));
        return;
    L78:
        return;
    L66:
        modifier4 = modifier3;
        tint3 = tint2;
        goto L67
    L62:
        modifier3 = modifier2;
        goto L64
    L54:
        if ($composer2.getDefaultsInvalid() == true) goto L60;
        $composer2.skipToGroupEnd();
        if ((r22 & 8) == 0) goto L59;
        $dirty = $dirty & (-7169);
    L59:
        modifier4 = modifier2;
        tint3 = tint2;
        goto L67
    L48:
        if ($composer2.getSkipping() == false) goto L51;
        $composer2.skipToGroupEnd();
        goto L74
    L37:
        if ((r22 & 8) != 0) goto L41;
        tint2 = tint;
        if ($composer2.changed(tint2) == false) goto L42;
        int r7 = 2048;
    L43:
        $dirty = $dirty | r7;
    L42:
        r7 = 1024;
        goto L43
    L41:
        tint2 = tint;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r4 = 256;
    L32:
        $dirty = $dirty | r4;
        goto L35
    L31:
        r4 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L35
    L16:
        if (($changed & 48) != 0) goto L22;
        r8 = contentDescription;
        if ($composer2.changed(r8) == false) goto L20;
        int r5 = 32;
    L21:
        $dirty = $dirty | r5;
        goto L23
    L20:
        r5 = 16;
        goto L21
    L22:
        r8 = contentDescription;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(imageVector) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m2275Iconww6aTOc(final ImageBitmap bitmap, final String contentDescription, Modifier modifier, long tint, Composer $composer, final int $changed, final int r28) {
        Composer $composer2 = $composer.startRestartGroup(-1092052280);
        ComposerKt.sourceInformation($composer2, "C(Icon)P(!,3:c#ui.graphics.Color)105@5106L7,107@5136L42,108@5183L136:Icon.kt#uh7d8r");
        int $dirty = $changed;
        if ((r28 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r28 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
        String r10 = contentDescription;
    L23:
        int r3 = r28 & 4;
        if (r3 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long r5 = tint;
    L46:
        if (($dirty & 1171) == 1170) goto L48;
    L51:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L54;
    L60:
        if (r3 == 0) goto L62;
        Modifier.Companion modifier2 = Modifier.Companion;
    L64:
        if ((r28 & 8) == 0) goto L66;
        ProvidableCompositionLocal<Color> r6 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r11 = $composer2.consume(r6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long tint2 = ((Color) r11).m4376unboximpl();
        int $dirty2 = $dirty & (-7169);
        Modifier modifier3 = modifier2;
        long tint3 = tint2;
    L67:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventStart(-1092052280, $dirty2, -1, "androidx.compose.material3.Icon (Icon.kt:106)");
    L70:
        ComposerKt.sourceInformationMarkerStart($composer2, -2144951290, "CC(remember):Icon.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(bitmap);
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L73;
    L76:
        value$iv = new BitmapPainter(bitmap, 0, 0, 6, null);
        $composer2.updateRememberedValue(value$iv);
    L77:
        BitmapPainter painter = (BitmapPainter) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        m2276Iconww6aTOc(painter, r10, modifier3, tint3, $composer2, (($dirty2 & 112) | ($dirty2 & 896)) | ($dirty2 & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L80;
        ComposerKt.traceEventEnd();
    L80:
        final Modifier modifier4 = modifier3;
        final long tint4 = tint3;
    L81:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L85;
        r12.updateScope(new AnonymousClass2(bitmap, contentDescription, modifier4, tint4, $changed, r28));
        return;
    L85:
        return;
    L73:
        if (value$iv != Composer.Companion.getEmpty()) goto L77;
    L66:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        tint3 = r5;
        goto L67
    L62:
        modifier2 = r4;
        goto L64
    L54:
        if ($composer2.getDefaultsInvalid() == true) goto L60;
        $composer2.skipToGroupEnd();
        if ((r28 & 8) == 0) goto L59;
        $dirty = $dirty & (-7169);
    L59:
        $dirty2 = $dirty;
        modifier3 = r4;
        tint3 = r5;
        goto L67
    L48:
        if ($composer2.getSkipping() == false) goto L51;
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        tint4 = r5;
        goto L81
    L37:
        if ((r28 & 8) != 0) goto L41;
        r5 = tint;
        if ($composer2.changed(r5) == false) goto L42;
        int r7 = 2048;
    L43:
        $dirty = $dirty | r7;
    L42:
        r7 = 1024;
        goto L43
    L41:
        r5 = tint;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L33;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L31;
        int r8 = 256;
    L32:
        $dirty = $dirty | r8;
        goto L35
    L31:
        r8 = 128;
        goto L32
    L33:
        r4 = modifier;
        goto L35
    L16:
        if (($changed & 48) != 0) goto L22;
        r10 = contentDescription;
        if ($composer2.changed(r10) == false) goto L20;
        int r9 = 32;
    L21:
        $dirty = $dirty | r9;
        goto L23
    L20:
        r9 = 16;
        goto L21
    L22:
        r10 = contentDescription;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(bitmap) == false) goto L10;
        int r13 = 4;
    L11:
        $dirty = $dirty | r13;
        goto L13
    L10:
        r13 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m2276Iconww6aTOc(final Painter painter, final String contentDescription, Modifier modifier, long tint, Composer $composer, final int $changed, final int r27) {
        Composer $composer2 = $composer.startRestartGroup(-2142239481);
        ComposerKt.sourceInformation($composer2, "C(Icon)P(2!,3:c#ui.graphics.Color)142@6849L7,145@6891L82,155@7235L217:Icon.kt#uh7d8r");
        int $dirty = $changed;
        if ((r27 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r27 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r3 = r27 & 4;
        if (r3 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier r5 = modifier;
    L34:
        if (($changed & 3072) == 0) goto L36;
        long r12 = tint;
    L45:
        if (($dirty & 1171) == 1170) goto L47;
    L50:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L53;
    L59:
        if (r3 == 0) goto L61;
        Modifier.Companion modifier2 = Modifier.Companion;
    L63:
        if ((r27 & 8) == 0) goto L65;
        ProvidableCompositionLocal<Color> r6 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty = $dirty & (-7169);
        Modifier modifier3 = modifier2;
        long tint2 = ((Color) r14).m4376unboximpl();
    L66:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L69;
        ComposerKt.traceEventStart(-2142239481, $dirty, -1, "androidx.compose.material3.Icon (Icon.kt:143)");
    L69:
        ComposerKt.sourceInformationMarkerStart($composer2, -2144895090, "CC(remember):Icon.kt#9igjgp");
        if ((($dirty & 7168) ^ 3072) <= 2048) goto L74;
        if ($composer2.changed(tint2) == false) goto L74;
    L75:
        boolean invalid$iv = true;
    L77:
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L84;
        if (value$iv == Composer.Companion.getEmpty()) goto L84;
    L88:
        ColorFilter colorFilter = (ColorFilter) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.startReplaceGroup(-2144891392);
        ComposerKt.sourceInformation($composer2, "148@7067L115");
        if (contentDescription == null) goto L102;
        Modifier.Companion r0 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, -2144889425, "CC(remember):Icon.kt#9igjgp");
        if (($dirty & 112) != 32) goto L93;
        boolean invalid$iv2 = true;
    L94:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L97;
    L100:
        Object value$iv2 = (Function1) new IconKt$Icon$semantics$1$1(contentDescription);
        $composer2.updateRememberedValue(value$iv2);
    L101:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int r4 = 0;
        Modifier.Companion semantics = SemanticsModifierKt.semantics$default(r0, false, (Function1) value$iv2, 1, null);
    L103:
        $composer2.endReplaceGroup();
        BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier3), painter), painter, false, null, ContentScale.Companion.getFit(), 0.0f, colorFilter, 22, null).then(semantics), $composer2, r4);
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventEnd();
    L106:
        final Modifier modifier4 = modifier3;
        final long tint3 = tint2;
    L107:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L111;
        r8.updateScope(new AnonymousClass3(painter, contentDescription, modifier4, tint3, $changed, r27));
        return;
    L111:
        return;
    L97:
        if (it$iv == Composer.Companion.getEmpty()) goto L100;
        value$iv2 = it$iv;
        goto L101
    L93:
        invalid$iv2 = false;
        goto L94
    L102:
        r4 = 0;
        semantics = Modifier.Companion;
    L84:
        if (Color.m4367equalsimpl0(tint2, Color.Companion.m4402getUnspecified0d7_KjU()) == false) goto L86;
        ColorFilter r7 = null;
    L87:
        value$iv = r7;
        $composer2.updateRememberedValue(value$iv);
        goto L88
    L86:
        r7 = ColorFilter.Companion.m4407tintxETnrds$default(ColorFilter.Companion, tint2, 0, 2, null);
    L74:
        if (($dirty & 3072) == 2048) goto L75;
        invalid$iv = false;
        goto L77
    L65:
        tint2 = r12;
        modifier3 = modifier2;
        goto L66
    L61:
        modifier2 = r5;
        goto L63
    L53:
        if ($composer2.getDefaultsInvalid() == true) goto L59;
        $composer2.skipToGroupEnd();
        if ((r27 & 8) == 0) goto L58;
        $dirty = $dirty & (-7169);
    L58:
        tint2 = r12;
        modifier3 = r5;
        goto L66
    L47:
        if ($composer2.getSkipping() == false) goto L50;
        $composer2.skipToGroupEnd();
        modifier4 = r5;
        tint3 = r12;
        goto L107
    L36:
        if ((r27 & 8) != 0) goto L40;
        r12 = tint;
        if ($composer2.changed(r12) == false) goto L41;
        int r9 = 2048;
    L42:
        $dirty = $dirty | r9;
    L41:
        r9 = 1024;
        goto L42
    L40:
        r12 = tint;
        goto L41
    L26:
        if (($changed & 384) != 0) goto L32;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L30;
        int r10 = 256;
    L31:
        $dirty = $dirty | r10;
        goto L34
    L30:
        r10 = 128;
        goto L31
    L32:
        r5 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changed(contentDescription) == false) goto L20;
        int r11 = 32;
    L21:
        $dirty = $dirty | r11;
        goto L22
    L20:
        r11 = 16;
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

    public static final void Icon(final Painter painter, final ColorProducer tint, final String contentDescription, Modifier modifier, Composer $composer, final int $changed, final int r23) {
        Composer $composer2 = $composer.startRestartGroup(1755070997);
        ComposerKt.sourceInformation($composer2, "C(Icon)P(2,3)206@9303L163,202@9171L330:Icon.kt#uh7d8r");
        int $dirty = $changed;
        if ((r23 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r23 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r23 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
    L32:
        int r6 = r23 & 8;
        if (r6 == 0) goto L36;
        $dirty = $dirty | 3072;
        Modifier modifier2 = modifier;
    L43:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L46;
    L49:
        if (r6 == 0) goto L52;
        modifier2 = Modifier.Companion;
    L52:
        if (ComposerKt.isTraceInProgress() == false) goto L54;
        ComposerKt.traceEventStart(1755070997, $dirty2, -1, "androidx.compose.material3.Icon (Icon.kt:191)");
    L54:
        $composer2.startReplaceGroup(-2144829472);
        ComposerKt.sourceInformation($composer2, "194@9002L115");
        if (contentDescription == null) goto L68;
        Modifier.Companion r7 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, -2144827505, "CC(remember):Icon.kt#9igjgp");
        if (($dirty2 & 896) != 256) goto L59;
        boolean invalid$iv = true;
    L60:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L63;
    L66:
        Object value$iv = (Function1) new IconKt$Icon$semantics$2$1(contentDescription);
        $composer2.updateRememberedValue(value$iv);
    L67:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion semantics = SemanticsModifierKt.semantics$default(r7, false, (Function1) value$iv, 1, null);
    L69:
        $composer2.endReplaceGroup();
        Modifier r8 = defaultSizeForColorProducer(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier2), painter);
        ComposerKt.sourceInformationMarkerStart($composer2, -2144817825, "CC(remember):Icon.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changedInstance(painter) | $composer2.changedInstance(tint);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L72;
    L75:
        Object value$iv2 = (Function1) new IconKt$Icon$4$1(painter, tint);
        $composer2.updateRememberedValue(value$iv2);
    L76:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        BoxKt.Box(DrawModifierKt.drawBehind(r8, (Function1) value$iv2).then(semantics), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L79;
        ComposerKt.traceEventEnd();
    L79:
        final Modifier modifier3 = modifier2;
    L80:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L84;
        r9.updateScope(new AnonymousClass5(painter, tint, contentDescription, modifier3, $changed, r23));
        return;
    L84:
        return;
    L72:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L75;
        value$iv2 = it$iv2;
        goto L76
    L63:
        if (it$iv == Composer.Companion.getEmpty()) goto L66;
        value$iv = it$iv;
        goto L67
    L59:
        invalid$iv = false;
        goto L60
    L68:
        semantics = Modifier.Companion;
        goto L69
    L46:
        if ($composer2.getSkipping() == false) goto L49;
        $composer2.skipToGroupEnd();
        modifier3 = modifier2;
        goto L80
    L36:
        if (($changed & 3072) != 0) goto L42;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L40;
        int r10 = 2048;
    L41:
        $dirty = $dirty | r10;
        goto L43
    L40:
        r10 = 1024;
        goto L41
    L42:
        modifier2 = modifier;
        goto L43
    L26:
        if (($changed & 384) != 0) goto L32;
        if ($composer2.changed(contentDescription) == false) goto L30;
        int r11 = 256;
    L31:
        $dirty = $dirty | r11;
        goto L32
    L30:
        r11 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(tint) == false) goto L20;
        int r12 = 32;
    L21:
        $dirty = $dirty | r12;
        goto L23
    L20:
        r12 = 16;
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

    private static final Modifier defaultSizeForColorProducer(Modifier $this$defaultSizeForColorProducer, Painter painter) {
        if (Size.m4190equalsimpl0(painter.mo5037getIntrinsicSizeNHjbRc(), Size.Companion.m4202getUnspecifiedNHjbRc()) == false) goto L5;
    L8:
        Modifier r4 = DefaultIconSizeModifier;
    L10:
        return $this$defaultSizeForColorProducer.then(r4);
    L5:
        if (m2278isInfiniteuvyYCjk(painter.mo5037getIntrinsicSizeNHjbRc()) == true) goto L8;
        long intrinsicSize = painter.mo5037getIntrinsicSizeNHjbRc();
        final float srcWidth = Size.m4194getWidthimpl(intrinsicSize);
        final float srcHeight = Size.m4191getHeightimpl(intrinsicSize);
        r4 = LayoutModifierKt.layout(Modifier.Companion, new C05321(srcWidth, srcHeight));
        goto L10
    }

    private static final Modifier defaultSizeFor(Modifier $this$defaultSizeFor, Painter painter) {
        if (Size.m4190equalsimpl0(painter.mo5037getIntrinsicSizeNHjbRc(), Size.Companion.m4202getUnspecifiedNHjbRc()) == false) goto L5;
    L8:
        Modifier.Companion r0 = DefaultIconSizeModifier;
    L10:
        return $this$defaultSizeFor.then(r0);
    L5:
        if (m2278isInfiniteuvyYCjk(painter.mo5037getIntrinsicSizeNHjbRc()) == true) goto L8;
        r0 = Modifier.Companion;
        goto L10
    }

    /* JADX INFO: renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m2278isInfiniteuvyYCjk(long $this$isInfinite_u2duvyYCjk) {
        if (Float.isInfinite(Size.m4194getWidthimpl($this$isInfinite_u2duvyYCjk)) == true) goto L5;
    L7:
        return false;
    L5:
        if (Float.isInfinite(Size.m4191getHeightimpl($this$isInfinite_u2duvyYCjk)) == false) goto L7;
        return true;
    }

    static {
        DefaultIconSizeModifier = SizeKt.m772size3ABfNKs(Modifier.Companion, IconButtonTokens.INSTANCE.m3416getIconSizeD9Ej5fM());
    }
}
