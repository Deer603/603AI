package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0088\u0001\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\b\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aq\u0010\u001a\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"ExtendedFabIconPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabSize", "ExtendedFabTextPadding", "FabSize", "ExtendedFloatingActionButton", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "ExtendedFloatingActionButton-wqdebIU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "content", "FloatingActionButton-bogVsAg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FloatingActionButtonKt {
    private static final float ExtendedFabIconPadding = 0.0f;
    private static final float ExtendedFabSize = 0.0f;
    private static final float ExtendedFabTextPadding = 0.0f;
    private static final float FabSize = 0.0f;

    public static final /* synthetic */ float access$getExtendedFabIconPadding$p() {
        return ExtendedFabIconPadding;
    }

    public static final /* synthetic */ float access$getExtendedFabTextPadding$p() {
        return ExtendedFabTextPadding;
    }

    public static final /* synthetic */ float access$getFabSize$p() {
        return FabSize;
    }

    /* JADX INFO: renamed from: FloatingActionButton-bogVsAg, reason: not valid java name */
    public static final void m1687FloatingActionButtonbogVsAg(final Function0<Unit> r30, Modifier modifier, MutableInteractionSource interactionSource, Shape shape, long backgroundColor, long contentColor, FloatingActionButtonElevation elevation, final Function2<? super Composer, ? super Integer, Unit> r39, Composer $composer, final int $changed, final int r42) {
        Composer $composer2 = $composer.startRestartGroup(1028985328);
        ComposerKt.sourceInformation($composer2, "C(FloatingActionButton)P(6,5,4,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)99@4545L28,101@4633L419,93@4324L728:FloatingActionButton.kt#jmzs0o");
        int $dirty = $changed;
        if ((r42 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r13 = r30;
    L13:
        int r2 = r42 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r4 = r42 & 4;
        if (r4 == 0) goto L28;
        $dirty = $dirty | 384;
        MutableInteractionSource interactionSource2 = interactionSource;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape r7 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        long r8 = backgroundColor;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        final long contentColor2 = contentColor;
    L69:
        if (($changed & 1572864) != 0) goto L80;
        if ((r42 & 64) != 0) goto L76;
        if ($composer2.changed(elevation) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty = $dirty | r17;
    L76:
        r17 = 524288;
    L80:
        if ((r42 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        if ((4793491 & $dirty) == 4793490) goto L92;
        boolean r0 = true;
    L94:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L149;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "85@3904L6,86@3992L6,87@4036L32,88@4146L11");
        if (($changed & 1) != 0) goto L98;
    L113:
        if (r2 == 0) goto L115;
        Modifier.Companion modifier2 = Modifier.Companion;
    L116:
        if (r4 == 0) goto L118;
        MutableInteractionSource interactionSource3 = null;
    L120:
        if ((r42 & 8) == 0) goto L122;
        $dirty = $dirty & (-7169);
        Shape shape2 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
    L124:
        if ((r42 & 16) == 0) goto L126;
        int $dirty2 = $dirty & (-57345);
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1600getSecondary0d7_KjU();
    L128:
        if ((r42 & 32) == 0) goto L130;
        contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty2 >> 12) & 14);
        int $dirty3 = $dirty2 & (-458753);
    L132:
        if ((r42 & 64) == 0) goto L134;
        int $dirty4 = $dirty3 & (-3670017);
        interactionSource2 = interactionSource3;
        Shape shape3 = shape2;
        long backgroundColor3 = backgroundColor2;
        int r5 = 1028985328;
        FloatingActionButtonElevation elevation2 = FloatingActionButtonDefaults.INSTANCE.m1683elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, $composer2, 24576, 15);
        Modifier modifier3 = modifier2;
    L135:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L138;
        ComposerKt.traceEventStart(r5, $dirty4, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:90)");
    L138:
        if (interactionSource2 != null) goto L144;
        $composer2.startReplaceGroup(-1991740377);
        ComposerKt.sourceInformation($composer2, "92@4280L39");
        ComposerKt.sourceInformationMarkerStart($composer2, 628486971, "CC(remember):FloatingActionButton.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L143;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L143:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endReplaceGroup();
        MutableInteractionSource interactionSource4 = (MutableInteractionSource) it$iv;
    L145:
        long contentColor3 = contentColor2;
        Composer $composer3 = $composer2;
        SurfaceKt.m1783SurfaceLPr_se0(r13, SemanticsModifierKt.semantics$default(modifier3, false, FloatingActionButtonKt$FloatingActionButton$1.INSTANCE, 1, null), false, shape3, backgroundColor3, contentColor3, null, elevation2.elevation(interactionSource4, $composer2, ($dirty4 >> 15) & 112).getValue().m6987unboximpl(), interactionSource4, ComposableLambdaKt.rememberComposableLambda(1972871863, true, new FloatingActionButtonKt$FloatingActionButton$2(contentColor2, r39), $composer2, 54), $composer3, (((($dirty4 & 14) | 805306368) | ($dirty4 & 7168)) | (57344 & $dirty4)) | (458752 & $dirty4), 68);
        if (ComposerKt.isTraceInProgress() == false) goto L148;
        ComposerKt.traceEventEnd();
    L148:
        final FloatingActionButtonElevation elevation3 = elevation2;
        final MutableInteractionSource interactionSource5 = interactionSource2;
        final Shape shape4 = shape3;
        final long backgroundColor4 = backgroundColor3;
        final long contentColor4 = contentColor3;
        final Modifier modifier4 = modifier3;
    L150:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L154;
        r14.updateScope(new FloatingActionButtonKt$FloatingActionButton$3(r30, modifier4, interactionSource5, shape4, backgroundColor4, contentColor4, elevation3, r39, $changed, r42));
        return;
    L154:
        return;
    L144:
        $composer2.startReplaceGroup(628486320);
        $composer2.endReplaceGroup();
        interactionSource4 = interactionSource2;
        goto L145
    L134:
        long backgroundColor5 = backgroundColor2;
        modifier3 = modifier2;
        $dirty4 = $dirty3;
        elevation2 = elevation;
        interactionSource2 = interactionSource3;
        shape3 = shape2;
        backgroundColor3 = backgroundColor5;
        r5 = 1028985328;
        goto L135
    L130:
        $dirty3 = $dirty2;
        goto L132
    L126:
        $dirty2 = $dirty;
        backgroundColor2 = r8;
        goto L128
    L122:
        shape2 = r7;
        goto L124
    L118:
        interactionSource3 = interactionSource2;
        goto L120
    L115:
        modifier2 = modifier;
        goto L116
    L98:
        if ($composer2.getDefaultsInvalid() == true) goto L113;
        $composer2.skipToGroupEnd();
        if ((r42 & 8) == 0) goto L104;
        $dirty = $dirty & (-7169);
    L104:
        if ((r42 & 16) == 0) goto L107;
        $dirty = $dirty & (-57345);
    L107:
        if ((r42 & 32) == 0) goto L110;
        $dirty = $dirty & (-458753);
    L110:
        if ((r42 & 64) == 0) goto L112;
        int r1 = $dirty & (-3670017);
        modifier3 = modifier;
        elevation2 = elevation;
        shape3 = r7;
        backgroundColor3 = r8;
        r5 = 1028985328;
        $dirty4 = r1;
        goto L135
    L112:
        elevation2 = elevation;
        shape3 = r7;
        backgroundColor3 = r8;
        r5 = 1028985328;
        $dirty4 = $dirty;
        modifier3 = modifier;
        goto L135
    L149:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = modifier;
        interactionSource5 = interactionSource2;
        shape4 = r7;
        backgroundColor4 = r8;
        contentColor4 = contentColor2;
        elevation3 = elevation;
        goto L150
    L92:
        r0 = false;
        goto L94
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r39) == false) goto L87;
        int r3 = 8388608;
    L88:
        $dirty = $dirty | r3;
        goto L90
    L87:
        r3 = 4194304;
        goto L88
    L60:
        if ((r42 & 32) != 0) goto L64;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
    L65:
        r16 = 65536;
        goto L66
    L64:
        contentColor2 = contentColor;
        goto L65
    L49:
        if ((r42 & 16) != 0) goto L53;
        r8 = backgroundColor;
        if ($composer2.changed(r8) == false) goto L54;
        int r15 = 16384;
    L55:
        $dirty = $dirty | r15;
    L54:
        r15 = 8192;
        goto L55
    L53:
        r8 = backgroundColor;
        goto L54
    L38:
        if ((r42 & 8) != 0) goto L42;
        r7 = shape;
        if ($composer2.changed(r7) == false) goto L43;
        int r9 = 2048;
    L44:
        $dirty = $dirty | r9;
    L43:
        r9 = 1024;
        goto L44
    L42:
        r7 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        interactionSource2 = interactionSource;
        if ($composer2.changed(interactionSource2) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
        goto L36
    L32:
        r10 = 128;
        goto L33
    L34:
        interactionSource2 = interactionSource;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(modifier) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r30;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L13
    L10:
        r11 = 2;
        goto L11
    L12:
        r13 = r30;
        goto L13
    }

    /* JADX INFO: renamed from: ExtendedFloatingActionButton-wqdebIU, reason: not valid java name */
    public static final void m1686ExtendedFloatingActionButtonwqdebIU(final Function2<? super Composer, ? super Integer, Unit> r27, final Function0<Unit> r28, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r30, MutableInteractionSource interactionSource, Shape shape, long backgroundColor, long contentColor, FloatingActionButtonElevation elevation, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(-1555720195);
        ComposerKt.sourceInformation($composer2, "C(ExtendedFloatingActionButton)P(8,6,5,3,4,7,0:c#ui.graphics.Color,1:c#ui.graphics.Color)168@7877L441,160@7549L769:FloatingActionButton.kt#jmzs0o");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r40 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
        Function0<Unit> r14 = r28;
    L23:
        int r4 = r40 & 4;
        if (r4 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L34:
        int r6 = r40 & 8;
        if (r6 == 0) goto L38;
        $dirty = $dirty | 3072;
        final Function2<? super Composer, ? super Integer, Unit> r7 = r30;
    L45:
        int r8 = r40 & 16;
        if (r8 == 0) goto L49;
        $dirty = $dirty | 24576;
        MutableInteractionSource interactionSource2 = interactionSource;
    L57:
        if ((196608 & $changed) == 0) goto L59;
        Shape shape2 = shape;
    L68:
        if ((1572864 & $changed) != 0) goto L79;
        if ((r40 & 64) != 0) goto L75;
        if ($composer2.changed(backgroundColor) == false) goto L75;
        int r15 = 1048576;
    L76:
        $dirty = $dirty | r15;
    L75:
        r15 = 524288;
    L79:
        if (($changed & 12582912) != 0) goto L90;
        if ((r40 & 128) != 0) goto L86;
        if ($composer2.changed(contentColor) == false) goto L86;
        int r11 = 8388608;
    L87:
        $dirty = $dirty | r11;
    L86:
        r11 = 4194304;
    L90:
        if ((100663296 & $changed) == 0) goto L92;
        final FloatingActionButtonElevation elevation2 = elevation;
    L101:
        if (($dirty & 38347923) == 38347922) goto L103;
        boolean r0 = true;
    L105:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L152;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "155@7287L6,156@7375L6,157@7419L32,158@7529L11");
        if (($changed & 1) != 0) goto L109;
    L124:
        if (r4 == 0) goto L126;
        modifier2 = Modifier.Companion;
    L126:
        if (r6 == 0) goto L128;
        r7 = null;
    L128:
        if (r8 == 0) goto L131;
        interactionSource2 = null;
    L131:
        if ((r40 & 32) == 0) goto L134;
        $dirty = $dirty & (-458753);
        shape2 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
    L134:
        if ((r40 & 64) == 0) goto L136;
        int $dirty2 = $dirty & (-3670017);
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1600getSecondary0d7_KjU();
    L138:
        if ((r40 & 128) == 0) goto L140;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty2 >> 18) & 14);
        $dirty2 = $dirty2 & (-29360129);
    L142:
        if ((r40 & 256) == 0) goto L144;
        Composer $composer3 = $composer2;
        FloatingActionButtonElevation elevation3 = FloatingActionButtonDefaults.INSTANCE.m1683elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, $composer2, 24576, 15);
        MutableInteractionSource interactionSource3 = interactionSource2;
        long contentColor3 = contentColor2;
        long contentColor4 = backgroundColor2;
        $dirty = $dirty2 & (-234881025);
        Shape shape3 = shape2;
    L145:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L148;
        ComposerKt.traceEventStart(-1555720195, $dirty, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)");
    L148:
        Composer $composer4 = $composer3;
        m1687FloatingActionButtonbogVsAg(r14, SizeKt.m776sizeInqDBjuR0$default(modifier2, ExtendedFabSize, ExtendedFabSize, 0.0f, 0.0f, 12, null), interactionSource3, shape3, contentColor4, contentColor3, elevation3, ComposableLambdaKt.rememberComposableLambda(1418981691, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$1(r7, r27), $composer3, 54), $composer4, (((((12582912 | (($dirty >> 3) & 14)) | (($dirty >> 6) & 896)) | (($dirty >> 6) & 7168)) | (($dirty >> 6) & 57344)) | (($dirty >> 6) & 458752)) | (($dirty >> 6) & 3670016), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L151;
        ComposerKt.traceEventEnd();
    L151:
        final Modifier modifier3 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> r5 = r7;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Shape shape4 = shape3;
        final long backgroundColor3 = contentColor4;
        final long contentColor5 = contentColor3;
        elevation2 = elevation3;
    L153:
        ScopeUpdateScope r16 = $composer4.endRestartGroup();
        if (r16 == null) goto L157;
        r16.updateScope(new FloatingActionButtonKt$ExtendedFloatingActionButton$2(r27, r28, modifier3, r5, interactionSource4, shape4, backgroundColor3, contentColor5, elevation2, $changed, r40));
        return;
    L157:
        return;
    L144:
        $composer3 = $composer2;
        interactionSource3 = interactionSource2;
        elevation3 = elevation2;
        contentColor3 = contentColor2;
        contentColor4 = backgroundColor2;
        $dirty = $dirty2;
        shape3 = shape2;
        goto L145
    L140:
        contentColor2 = contentColor;
        goto L142
    L136:
        $dirty2 = $dirty;
        backgroundColor2 = backgroundColor;
        goto L138
    L109:
        if ($composer2.getDefaultsInvalid() == true) goto L124;
        $composer2.skipToGroupEnd();
        if ((r40 & 32) == 0) goto L115;
        $dirty = $dirty & (-458753);
    L115:
        if ((r40 & 64) == 0) goto L118;
        $dirty = $dirty & (-3670017);
    L118:
        if ((r40 & 128) == 0) goto L121;
        $dirty = $dirty & (-29360129);
    L121:
        if ((r40 & 256) == 0) goto L123;
        contentColor4 = backgroundColor;
        contentColor3 = contentColor;
        $dirty = $dirty & (-234881025);
        $composer3 = $composer2;
        interactionSource3 = interactionSource2;
        elevation3 = elevation2;
        shape3 = shape2;
        goto L145
    L123:
        contentColor4 = backgroundColor;
        contentColor3 = contentColor;
        $composer3 = $composer2;
        interactionSource3 = interactionSource2;
        elevation3 = elevation2;
        shape3 = shape2;
        goto L145
    L152:
        $composer4 = $composer2;
        $composer4.skipToGroupEnd();
        modifier3 = modifier2;
        r5 = r7;
        interactionSource4 = interactionSource2;
        shape4 = shape2;
        backgroundColor3 = backgroundColor;
        contentColor5 = contentColor;
        goto L153
    L103:
        r0 = false;
        goto L105
    L92:
        if ((r40 & 256) != 0) goto L96;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L97;
        int r17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r17;
    L97:
        r17 = 33554432;
        goto L98
    L96:
        elevation2 = elevation;
        goto L97
    L59:
        if ((r40 & 32) != 0) goto L63;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L64;
        int r12 = 131072;
    L65:
        $dirty = $dirty | r12;
    L64:
        r12 = 65536;
        goto L65
    L63:
        shape2 = shape;
        goto L64
    L49:
        if (($changed & 24576) != 0) goto L55;
        interactionSource2 = interactionSource;
        if ($composer2.changed(interactionSource2) == false) goto L53;
        int r10 = 16384;
    L54:
        $dirty = $dirty | r10;
        goto L57
    L53:
        r10 = 8192;
        goto L54
    L55:
        interactionSource2 = interactionSource;
        goto L57
    L38:
        if (($changed & 3072) != 0) goto L44;
        r7 = r30;
        if ($composer2.changedInstance(r7) == false) goto L42;
        int r9 = 2048;
    L43:
        $dirty = $dirty | r9;
        goto L45
    L42:
        r9 = 1024;
        goto L43
    L44:
        r7 = r30;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r13 = 256;
    L32:
        $dirty = $dirty | r13;
        goto L34
    L31:
        r13 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r14 = r28;
        if ($composer2.changedInstance(r14) == false) goto L20;
        int r18 = 32;
    L21:
        $dirty = $dirty | r18;
        goto L23
    L20:
        r18 = 16;
        goto L21
    L22:
        r14 = r28;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(r27) == false) goto L10;
        int r19 = 4;
    L11:
        $dirty = $dirty | r19;
        goto L13
    L10:
        r19 = 2;
        goto L11
    }

    static {
        FabSize = Dp.m6973constructorimpl(56);
        ExtendedFabSize = Dp.m6973constructorimpl(48);
        ExtendedFabIconPadding = Dp.m6973constructorimpl(12);
        ExtendedFabTextPadding = Dp.m6973constructorimpl(20);
    }
}
