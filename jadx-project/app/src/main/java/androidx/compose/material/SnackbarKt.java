package androidx.compose.material;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a3\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001a3\u0010\u0012\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001a`\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001ax\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u00012\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a \u0010&\u001a\u00020\f2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010'\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"HeightToFirstLine", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalSpacing", "HorizontalSpacingButtonSide", "LongButtonVerticalOffset", "SeparateButtonExtraY", "SnackbarMinHeightOneLine", "SnackbarMinHeightTwoLines", "SnackbarVerticalPadding", "TextEndExtraSpacing", "NewLineButtonSnackbar", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "action", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "Snackbar", "snackbarData", "Landroidx/compose/material/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "actionOnNewLine", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "actionColor", "elevation", "Snackbar-sPrSdHI", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V", "content", "Snackbar-7zSek6w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TextOnlySnackbar", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnackbarKt {
    private static final float HeightToFirstLine = 0.0f;
    private static final float HorizontalSpacing = 0.0f;
    private static final float HorizontalSpacingButtonSide = 0.0f;
    private static final float LongButtonVerticalOffset = 0.0f;
    private static final float SeparateButtonExtraY = 0.0f;
    private static final float SnackbarMinHeightOneLine = 0.0f;
    private static final float SnackbarMinHeightTwoLines = 0.0f;
    private static final float SnackbarVerticalPadding = 0.0f;
    private static final float TextEndExtraSpacing = 0.0f;

    public static final /* synthetic */ void access$NewLineButtonSnackbar(Function2 text, Function2 action, Composer $composer, int $changed) {
        NewLineButtonSnackbar(text, action, $composer, $changed);
    }

    public static final /* synthetic */ void access$OneRowSnackbar(Function2 text, Function2 action, Composer $composer, int $changed) {
        OneRowSnackbar(text, action, $composer, $changed);
    }

    public static final /* synthetic */ void access$TextOnlySnackbar(Function2 content, Composer $composer, int $changed) {
        TextOnlySnackbar(content, $composer, $changed);
    }

    public static final /* synthetic */ float access$getHeightToFirstLine$p() {
        return HeightToFirstLine;
    }

    public static final /* synthetic */ float access$getSnackbarMinHeightOneLine$p() {
        return SnackbarMinHeightOneLine;
    }

    public static final /* synthetic */ float access$getSnackbarMinHeightTwoLines$p() {
        return SnackbarMinHeightTwoLines;
    }

    public static final /* synthetic */ float access$getTextEndExtraSpacing$p() {
        return TextEndExtraSpacing;
    }

    /* JADX INFO: renamed from: Snackbar-7zSek6w, reason: not valid java name */
    public static final void m1764Snackbar7zSek6w(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r26, boolean actionOnNewLine, Shape shape, long backgroundColor, long contentColor, float elevation, final Function2<? super Composer, ? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-558258760);
        ComposerKt.sourceInformation($composer2, "C(Snackbar)P(6!2,7,2:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.unit.Dp)101@4475L464,95@4308L631:Snackbar.kt#jmzs0o");
        int $dirty = $changed;
        int r3 = r37 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L13:
        int r5 = r37 & 2;
        if (r5 == 0) goto L17;
        $dirty = $dirty | 48;
        final Function2<? super Composer, ? super Integer, Unit> r6 = r26;
    L24:
        int r7 = r37 & 4;
        if (r7 == 0) goto L28;
        $dirty = $dirty | 384;
        final boolean actionOnNewLine2 = actionOnNewLine;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape shape2 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        long backgroundColor2 = backgroundColor;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        int $dirty2 = $dirty;
        int r35 = r3;
    L68:
        int r16 = r37 & 64;
        if (r16 == 0) goto L72;
        $dirty2 = $dirty2 | 1572864;
    L80:
        if ((r37 & 128) == 0) goto L83;
        $dirty2 = $dirty2 | 12582912;
    L90:
        if ((4793491 & $dirty2) == 4793490) goto L92;
        boolean r0 = true;
    L94:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L136;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "89@4105L6,90@4165L15,91@4222L6");
        if (($changed & 1) != 0) goto L98;
    L110:
        if (r35 == 0) goto L112;
        modifier2 = Modifier.Companion;
    L112:
        if (r5 == 0) goto L114;
        r6 = null;
    L114:
        if (r7 == 0) goto L117;
        actionOnNewLine2 = false;
    L117:
        if ((r37 & 8) == 0) goto L120;
        $dirty2 = $dirty2 & (-7169);
        shape2 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getSmall();
    L120:
        if ((r37 & 16) == 0) goto L123;
        backgroundColor2 = SnackbarDefaults.INSTANCE.getBackgroundColor($composer2, 6);
        $dirty2 = $dirty2 & (-57345);
    L123:
        if ((r37 & 32) == 0) goto L125;
        long contentColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
        $dirty2 = $dirty2 & (-458753);
    L126:
        if (r16 == 0) goto L128;
        long contentColor3 = contentColor2;
        float elevation2 = Dp.m6973constructorimpl(6);
        int $dirty3 = $dirty2;
        long backgroundColor3 = backgroundColor2;
        Modifier modifier3 = modifier2;
        Shape shape3 = shape2;
        int r4 = -558258760;
    L129:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L132;
        ComposerKt.traceEventStart(r4, $dirty3, -1, "androidx.compose.material.Snackbar (Snackbar.kt:94)");
    L132:
        Composer $composer3 = $composer2;
        SurfaceKt.m1782SurfaceFjzlyU(modifier3, shape3, backgroundColor3, contentColor3, null, elevation2, ComposableLambdaKt.rememberComposableLambda(-2084221700, true, new SnackbarKt$Snackbar$1(r6, r34, actionOnNewLine2), $composer2, 54), $composer3, ((((1572864 | ($dirty3 & 14)) | (($dirty3 >> 6) & 112)) | (($dirty3 >> 6) & 896)) | (($dirty3 >> 6) & 7168)) | (($dirty3 >> 3) & 458752), 16);
        if (ComposerKt.isTraceInProgress() == false) goto L135;
        ComposerKt.traceEventEnd();
    L135:
        final Function2<? super Composer, ? super Integer, Unit> r2 = r6;
        final boolean actionOnNewLine3 = actionOnNewLine2;
        final Modifier modifier4 = modifier3;
        final Shape shape4 = shape3;
        final long backgroundColor4 = backgroundColor3;
        final long contentColor4 = contentColor3;
        final float elevation3 = elevation2;
    L137:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L141;
        r13.updateScope(new SnackbarKt$Snackbar$2(modifier4, r2, actionOnNewLine3, shape4, backgroundColor4, contentColor4, elevation3, r34, $changed, r37));
        return;
    L141:
        return;
    L128:
        $dirty3 = $dirty2;
        contentColor3 = contentColor2;
        elevation2 = elevation;
        backgroundColor3 = backgroundColor2;
        modifier3 = modifier2;
        shape3 = shape2;
        r4 = -558258760;
        goto L129
    L125:
        contentColor2 = contentColor;
        goto L126
    L98:
        if ($composer2.getDefaultsInvalid() == true) goto L110;
        $composer2.skipToGroupEnd();
        if ((r37 & 8) == 0) goto L104;
        $dirty2 = $dirty2 & (-7169);
    L104:
        if ((r37 & 16) == 0) goto L107;
        $dirty2 = $dirty2 & (-57345);
    L107:
        if ((r37 & 32) == 0) goto L109;
        $dirty3 = $dirty2 & (-458753);
        elevation2 = elevation;
        backgroundColor3 = backgroundColor2;
        contentColor3 = contentColor;
        modifier3 = modifier2;
        shape3 = shape2;
        r4 = -558258760;
        goto L129
    L109:
        elevation2 = elevation;
        $dirty3 = $dirty2;
        contentColor3 = contentColor;
        backgroundColor3 = backgroundColor2;
        modifier3 = modifier2;
        shape3 = shape2;
        r4 = -558258760;
        goto L129
    L136:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = modifier2;
        r2 = r6;
        actionOnNewLine3 = actionOnNewLine2;
        shape4 = shape2;
        backgroundColor4 = backgroundColor2;
        contentColor4 = contentColor;
        elevation3 = elevation;
        goto L137
    L92:
        r0 = false;
        goto L94
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r34) == false) goto L87;
        int r1 = 8388608;
    L88:
        $dirty2 = $dirty2 | r1;
        goto L90
    L87:
        r1 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changed(elevation) == false) goto L76;
        int r19 = 1048576;
    L77:
        $dirty2 = $dirty2 | r19;
        goto L80
    L76:
        r19 = 524288;
        goto L77
    L60:
        if ((r37 & 32) != 0) goto L64;
        int $dirty4 = $dirty;
        r35 = r3;
        if ($composer2.changed(contentColor) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty2 = $dirty4 | r17;
    L65:
        r17 = 65536;
        goto L66
    L64:
        $dirty4 = $dirty;
        r35 = r3;
        goto L65
    L49:
        if ((r37 & 16) != 0) goto L53;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L54;
        int r15 = 16384;
    L55:
        $dirty = $dirty | r15;
    L54:
        r15 = 8192;
        goto L55
    L53:
        backgroundColor2 = backgroundColor;
        goto L54
    L38:
        if ((r37 & 8) != 0) goto L42;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L43;
        int r14 = 2048;
    L44:
        $dirty = $dirty | r14;
    L43:
        r14 = 1024;
        goto L44
    L42:
        shape2 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        actionOnNewLine2 = actionOnNewLine;
        if ($composer2.changed(actionOnNewLine2) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L36
    L32:
        r9 = 128;
        goto L33
    L34:
        actionOnNewLine2 = actionOnNewLine;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r6 = r26;
        if ($composer2.changedInstance(r6) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
        goto L24
    L21:
        r8 = 16;
        goto L22
    L23:
        r6 = r26;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L13
    L10:
        r10 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L13
    }

    /* JADX INFO: renamed from: Snackbar-sPrSdHI, reason: not valid java name */
    public static final void m1765SnackbarsPrSdHI(final SnackbarData snackbarData, Modifier modifier, boolean actionOnNewLine, Shape shape, long backgroundColor, long contentColor, long actionColor, float elevation, Composer $composer, final int $changed, final int r42) {
        Composer $composer2 = $composer.startRestartGroup(258660814);
        ComposerKt.sourceInformation($composer2, "C(Snackbar)P(7,5,1,6,2:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,4:c#ui.unit.Dp)183@8068L30,181@7996L320:Snackbar.kt#jmzs0o");
        int $dirty = $changed;
        if ((r42 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L15:
        int r4 = r42 & 2;
        if (r4 == 0) goto L19;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L26:
        int r6 = r42 & 4;
        if (r6 == 0) goto L30;
        $dirty = $dirty | 384;
        boolean actionOnNewLine2 = actionOnNewLine;
    L38:
        if (($changed & 3072) == 0) goto L40;
        Shape shape2 = shape;
    L49:
        if (($changed & 24576) == 0) goto L51;
        long backgroundColor2 = backgroundColor;
    L60:
        if ((196608 & $changed) == 0) goto L62;
        long contentColor2 = contentColor;
    L71:
        if ((1572864 & $changed) != 0) goto L81;
        if ((r42 & 64) != 0) goto L78;
        if ($composer2.changed(actionColor) == false) goto L78;
        int r16 = 1048576;
    L79:
        $dirty = $dirty | r16;
    L78:
        r16 = 524288;
    L81:
        int r11 = r42 & 128;
        if (r11 == 0) goto L85;
        $dirty = $dirty | 12582912;
    L93:
        if ((4793491 & $dirty) == 4793490) goto L95;
        boolean r0 = true;
    L97:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L147;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "162@7296L6,163@7356L15,164@7413L6,165@7471L18");
        if (($changed & 1) != 0) goto L101;
    L116:
        if (r4 == 0) goto L118;
        modifier2 = Modifier.Companion;
    L118:
        if (r6 == 0) goto L121;
        actionOnNewLine2 = false;
    L121:
        if ((r42 & 8) == 0) goto L124;
        $dirty = $dirty & (-7169);
        shape2 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getSmall();
    L124:
        if ((r42 & 16) == 0) goto L127;
        backgroundColor2 = SnackbarDefaults.INSTANCE.getBackgroundColor($composer2, 6);
        $dirty = $dirty & (-57345);
    L127:
        if ((r42 & 32) == 0) goto L130;
        contentColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
        $dirty = $dirty & (-458753);
    L130:
        if ((r42 & 64) == 0) goto L132;
        long actionColor2 = SnackbarDefaults.INSTANCE.getPrimaryActionColor($composer2, 6);
        $dirty = $dirty & (-3670017);
    L133:
        if (r11 == 0) goto L135;
        float elevation2 = Dp.m6973constructorimpl(6);
        long contentColor3 = contentColor2;
        final long actionColor3 = actionColor2;
        boolean actionOnNewLine3 = actionOnNewLine2;
        Shape shape3 = shape2;
        long backgroundColor3 = backgroundColor2;
    L136:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L139;
        ComposerKt.traceEventStart(258660814, $dirty, -1, "androidx.compose.material.Snackbar (Snackbar.kt:167)");
    L139:
        final String actionLabel = snackbarData.getActionLabel();
        if (actionLabel == null) goto L142;
        $composer2.startReplaceGroup(1609221416);
        ComposerKt.sourceInformation($composer2, "171@7680L267");
        final SnackbarData r12 = snackbarData;
        Function2 r9 = ComposableLambdaKt.rememberComposableLambda(1843479216, true, new SnackbarKt$Snackbar$actionComposable$1(actionColor3, r12, actionLabel), $composer2, 54);
        $composer2.endReplaceGroup();
        Function2 actionComposable = r9;
    L143:
        Composer $composer3 = $composer2;
        m1764Snackbar7zSek6w(PaddingKt.m725padding3ABfNKs(modifier2, Dp.m6973constructorimpl(12)), actionComposable, actionOnNewLine3, shape3, backgroundColor3, contentColor3, elevation2, ComposableLambdaKt.rememberComposableLambda(-261845785, true, new SnackbarKt$Snackbar$3(r12), $composer2, 54), $composer3, ((((($dirty & 896) | 12582912) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (($dirty >> 3) & 3670016), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L146;
        ComposerKt.traceEventEnd();
    L146:
        final long actionColor4 = actionColor3;
        final Modifier modifier3 = modifier2;
        final boolean actionOnNewLine4 = actionOnNewLine3;
        final Shape shape4 = shape3;
        final long backgroundColor4 = backgroundColor3;
        final long contentColor4 = contentColor3;
        final float elevation3 = elevation2;
    L148:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L152;
        r15.updateScope(new SnackbarKt$Snackbar$4(snackbarData, modifier3, actionOnNewLine4, shape4, backgroundColor4, contentColor4, actionColor4, elevation3, $changed, r42));
        return;
    L152:
        return;
    L142:
        r12 = snackbarData;
        $composer2.startReplaceGroup(1609519419);
        $composer2.endReplaceGroup();
        actionComposable = null;
        goto L143
    L135:
        elevation2 = elevation;
        contentColor3 = contentColor2;
        actionColor3 = actionColor2;
        actionOnNewLine3 = actionOnNewLine2;
        shape3 = shape2;
        backgroundColor3 = backgroundColor2;
        goto L136
    L132:
        actionColor2 = actionColor;
        goto L133
    L101:
        if ($composer2.getDefaultsInvalid() == true) goto L116;
        $composer2.skipToGroupEnd();
        if ((r42 & 8) == 0) goto L107;
        $dirty = $dirty & (-7169);
    L107:
        if ((r42 & 16) == 0) goto L110;
        $dirty = $dirty & (-57345);
    L110:
        if ((r42 & 32) == 0) goto L113;
        $dirty = $dirty & (-458753);
    L113:
        if ((r42 & 64) == 0) goto L115;
        elevation2 = elevation;
        $dirty = $dirty & (-3670017);
        shape3 = shape2;
        backgroundColor3 = backgroundColor2;
        contentColor3 = contentColor2;
        actionColor3 = actionColor;
        actionOnNewLine3 = actionOnNewLine2;
        goto L136
    L115:
        actionColor3 = actionColor;
        elevation2 = elevation;
        shape3 = shape2;
        backgroundColor3 = backgroundColor2;
        contentColor3 = contentColor2;
        actionOnNewLine3 = actionOnNewLine2;
        goto L136
    L147:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        elevation3 = elevation;
        modifier3 = modifier2;
        shape4 = shape2;
        backgroundColor4 = backgroundColor2;
        actionColor4 = actionColor;
        actionOnNewLine4 = actionOnNewLine2;
        contentColor4 = contentColor2;
        goto L148
    L95:
        r0 = false;
        goto L97
    L85:
        if (($changed & 12582912) != 0) goto L93;
        if ($composer2.changed(elevation) == false) goto L89;
        int r1 = 8388608;
    L90:
        $dirty = $dirty | r1;
        goto L93
    L89:
        r1 = 4194304;
        goto L90
    L62:
        if ((r42 & 32) != 0) goto L66;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L67;
        int r13 = 131072;
    L68:
        $dirty = $dirty | r13;
    L67:
        r13 = 65536;
        goto L68
    L66:
        contentColor2 = contentColor;
        goto L67
    L51:
        if ((r42 & 16) != 0) goto L55;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L56;
        int r14 = 16384;
    L57:
        $dirty = $dirty | r14;
    L56:
        r14 = 8192;
        goto L57
    L55:
        backgroundColor2 = backgroundColor;
        goto L56
    L40:
        if ((r42 & 8) != 0) goto L44;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L45;
        int r10 = 2048;
    L46:
        $dirty = $dirty | r10;
    L45:
        r10 = 1024;
        goto L46
    L44:
        shape2 = shape;
        goto L45
    L30:
        if (($changed & 384) != 0) goto L36;
        actionOnNewLine2 = actionOnNewLine;
        if ($composer2.changed(actionOnNewLine2) == false) goto L34;
        int r8 = 256;
    L35:
        $dirty = $dirty | r8;
        goto L38
    L34:
        r8 = 128;
        goto L35
    L36:
        actionOnNewLine2 = actionOnNewLine;
        goto L38
    L19:
        if (($changed & 48) != 0) goto L25;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L23;
        int r7 = 32;
    L24:
        $dirty = $dirty | r7;
        goto L26
    L23:
        r7 = 16;
        goto L24
    L25:
        modifier2 = modifier;
        goto L26
    L6:
        if (($changed & 6) != 0) goto L15;
        if (($changed & 8) != 0) goto L10;
        boolean r5 = $composer2.changed(snackbarData);
    L11:
        if (r5 == false) goto L13;
        int r17 = 4;
    L14:
        $dirty = $dirty | r17;
        goto L15
    L13:
        r17 = 2;
        goto L14
    L10:
        r5 = $composer2.changedInstance(snackbarData);
        goto L11
    }

    private static final void TextOnlySnackbar(final Function2<? super Composer, ? super Integer, Unit> r40, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(917397959);
        ComposerKt.sourceInformation($composer2, "C(TextOnlySnackbar)238@10111L1862:Snackbar.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r40) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r6 = true;
    L14:
        if ($composer2.shouldExecute(r6, $dirty & 1) == true) goto L16;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L52:
        ScopeUpdateScope r2 = $composer3.endRestartGroup();
        if (r2 == null) goto L56;
        r2.updateScope(new C04503(r40, $changed));
        return;
    L56:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(917397959, $dirty, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:237)");
    L18:
        MeasurePolicy measurePolicy$iv = C04492.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        Modifier modifier$iv = Modifier.Companion;
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r14 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = ((384 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L21;
        ComposablesKt.invalidApplier();
    L21:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L24;
        $composer2.createNode(r14);
    L25:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L31;
        int $dirty2 = $dirty;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L33;
    L32:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r3);
    L33:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r4 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, 1169336756, "C239@10128L172:Snackbar.kt#jmzs0o");
        Modifier modifier$iv2 = PaddingKt.m726paddingVpY3zN4(Modifier.Companion, HorizontalSpacing, SnackbarVerticalPadding);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L36;
        ComposablesKt.invalidApplier();
    L36:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L39;
        Function0<ComposeUiNode> r7 = r18;
        $composer3.createNode(r7);
    L40:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r8 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L46;
        Composer $composer4 = $composer3;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L48;
    L47:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r8);
    L48:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r9 = ($changed$iv$iv$iv >> 6) & 14;
        Composer $composer$iv = $composer4;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r10 = BoxScopeInstance.INSTANCE;
        int r11 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, 2052555064, "C243@10281L9:Snackbar.kt#jmzs0o");
        r40.invoke($composer$iv, Integer.valueOf($dirty2 & 14));
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L52;
        ComposerKt.traceEventEnd();
        goto L52
    L46:
        $composer4 = $composer3;
        goto L47
    L39:
        r7 = r18;
        $composer3.useNode();
        goto L40
    L31:
        $dirty2 = $dirty;
        goto L32
    L24:
        $composer2.useNode();
        goto L25
    L12:
        r6 = false;
        goto L14
    }

    private static final void NewLineButtonSnackbar(final Function2<? super Composer, ? super Integer, Unit> r58, final Function2<? super Composer, ? super Integer, Unit> r59, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1229075900);
        ComposerKt.sourceInformation($composer2, "C(NewLineButtonSnackbar)P(1)292@12091L528:Snackbar.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r58) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r59) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L17
    L14:
        r7 = 16;
    L17:
        if (($dirty & 19) == 18) goto L19;
        boolean r8 = true;
    L21:
        if ($composer2.shouldExecute(r8, $dirty & 1) == true) goto L23;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L74:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L78;
        r3.updateScope(new AnonymousClass2(r58, r59, $changed));
        return;
    L78:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-1229075900, $dirty, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:291)");
    L25:
        Modifier modifier$iv = PaddingKt.m729paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), HorizontalSpacing, 0.0f, HorizontalSpacingButtonSide, SeparateButtonExtraY, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, ((6 >> 3) & 14) | ((6 >> 3) & 112));
        int $changed$iv$iv = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r19 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L28;
        ComposablesKt.invalidApplier();
    L28:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L31;
        Function0<ComposeUiNode> r4 = r19;
        $composer2.createNode(r4);
    L32:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L38;
        int $changed$iv = 6;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L40;
    L39:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r5);
    L40:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r9 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        int r10 = (($changed$iv >> 6) & 112) | 6;
        ColumnScope $this$NewLineButtonSnackbar_u24lambda_u244 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer3, -322322840, "C301@12366L191,307@12566L47:Snackbar.kt#jmzs0o");
        Modifier modifier$iv2 = PaddingKt.m729paddingqDBjuR0$default(AlignmentLineKt.m580paddingFromBaselineVpY3zN4(Modifier.Companion, HeightToFirstLine, LongButtonVerticalOffset), 0.0f, 0.0f, HorizontalSpacingButtonSide, 0.0f, 11, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r44 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L43;
        ComposablesKt.invalidApplier();
    L43:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L46;
        Function0<ComposeUiNode> r11 = r44;
        $composer3.createNode(r11);
    L47:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r12 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L54;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L54;
    L55:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r13 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r49 = BoxScopeInstance.INSTANCE;
        int r51 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -559559878, "C305@12541L6:Snackbar.kt#jmzs0o");
        r58.invoke($composer3, Integer.valueOf($dirty2 & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier modifier$iv3 = $this$NewLineButtonSnackbar_u24lambda_u244.align(Modifier.Companion, Alignment.Companion.getEnd());
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L58;
        ComposablesKt.invalidApplier();
    L58:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L61;
        Function0<ComposeUiNode> r14 = r18;
        $composer3.createNode(r14);
    L62:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r15 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L68;
        Composer $composer4 = $composer3;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == true) goto L70;
    L69:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r15);
    L70:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r16 = ($changed$iv$iv$iv3 >> 6) & 14;
        Composer $composer$iv = $composer4;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r17 = BoxScopeInstance.INSTANCE;
        int r20 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -559498312, "C307@12603L8:Snackbar.kt#jmzs0o");
        r59.invoke($composer$iv, Integer.valueOf(($dirty2 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventEnd();
        goto L74
    L68:
        $composer4 = $composer3;
        goto L69
    L61:
        r14 = r18;
        $composer3.useNode();
    L54:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r12);
        goto L55
    L46:
        r11 = r44;
        $composer3.useNode();
        goto L47
    L38:
        $changed$iv = 6;
        goto L39
    L31:
        r4 = r19;
        $composer2.useNode();
        goto L32
    L19:
        r8 = false;
        goto L21
    }

    private static final void OneRowSnackbar(final Function2<? super Composer, ? super Integer, Unit> r51, final Function2<? super Composer, ? super Integer, Unit> r52, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-534813202);
        ComposerKt.sourceInformation($composer2, "C(OneRowSnackbar)P(1)321@13075L2277,315@12784L2568:Snackbar.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r51) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r52) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L17
    L14:
        r7 = 16;
    L17:
        if (($dirty & 19) == 18) goto L19;
        boolean r8 = true;
    L21:
        if ($composer2.shouldExecute(r8, $dirty & 1) == true) goto L23;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L78:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L82;
        r3.updateScope(new AnonymousClass3(r51, r52, $changed));
        return;
    L82:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-534813202, $dirty, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:312)");
    L25:
        final String textTag = "text";
        final String actionTag = "action";
        Modifier modifier$iv = PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, HorizontalSpacing, 0.0f, HorizontalSpacingButtonSide, 0.0f, 10, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -1075352668, "CC(remember):Snackbar.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L29;
        Object value$iv = (MeasurePolicy) new SnackbarKt$OneRowSnackbar$2$1(actionTag, textTag);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L29:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = ((432 << 6) & 896) | 6;
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L32;
        ComposablesKt.invalidApplier();
    L32:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L35;
        Function0<ComposeUiNode> r5 = r17;
        $composer2.createNode(r5);
    L36:
        $composer3 = $composer2;
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r9 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L43;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L43;
    L44:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r4 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -15870028, "C317@12814L86,318@12913L46:Snackbar.kt#jmzs0o");
        Modifier modifier$iv2 = PaddingKt.m727paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r37 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L47;
        ComposablesKt.invalidApplier();
    L47:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L50;
        Function0<ComposeUiNode> r10 = r37;
        $composer3.createNode(r10);
    L51:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r11 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L58;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L58;
    L59:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r12 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r42 = BoxScopeInstance.INSTANCE;
        int r44 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -1078251520, "C317@12892L6:Snackbar.kt#jmzs0o");
        r51.invoke($composer3, Integer.valueOf($dirty2 & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier modifier$iv3 = LayoutIdKt.layoutId(Modifier.Companion, "action");
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L62;
        ComposablesKt.invalidApplier();
    L62:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L65;
        Function0<ComposeUiNode> r13 = r18;
        $composer3.createNode(r13);
    L66:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L72;
        Composer $composer4 = $composer3;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L74;
    L73:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r14);
    L74:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r15 = ($changed$iv$iv$iv2 >> 6) & 14;
        Composer $composer$iv = $composer4;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r16 = BoxScopeInstance.INSTANCE;
        int r19 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -1078194914, "C318@12949L8:Snackbar.kt#jmzs0o");
        r52.invoke($composer$iv, Integer.valueOf(($dirty2 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L78;
        ComposerKt.traceEventEnd();
        goto L78
    L72:
        $composer4 = $composer3;
        goto L73
    L65:
        r13 = r18;
        $composer3.useNode();
    L58:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r11);
        goto L59
    L50:
        r10 = r37;
        $composer3.useNode();
    L43:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r9);
        goto L44
    L35:
        r5 = r17;
        $composer2.useNode();
        goto L36
    L19:
        r8 = false;
        goto L21
    }

    static {
        HeightToFirstLine = Dp.m6973constructorimpl(30);
        HorizontalSpacing = Dp.m6973constructorimpl(16);
        HorizontalSpacingButtonSide = Dp.m6973constructorimpl(8);
        SeparateButtonExtraY = Dp.m6973constructorimpl(2);
        SnackbarVerticalPadding = Dp.m6973constructorimpl(6);
        TextEndExtraSpacing = Dp.m6973constructorimpl(8);
        LongButtonVerticalOffset = Dp.m6973constructorimpl(12);
        SnackbarMinHeightOneLine = Dp.m6973constructorimpl(48);
        SnackbarMinHeightTwoLines = Dp.m6973constructorimpl(68);
    }
}
