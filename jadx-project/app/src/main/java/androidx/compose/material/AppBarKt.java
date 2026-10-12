package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aj\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001av\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001an\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u008c\u0001\u0010$\u001a\u00020\f2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\f0&¢\u0006\u0002\b\u001a2\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010&¢\u0006\u0002\b\u001a2\u001e\b\u0002\u0010(\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u0084\u0001\u0010$\u001a\u00020\f2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\f0&¢\u0006\u0002\b\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010&¢\u0006\u0002\b\u001a2\u001e\b\u0002\u0010(\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001aj\u0010$\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001ab\u0010$\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000202H\u0080\b\u001a,\u00105\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202062\u0006\u00107\u001a\u0002022\u0006\u00104\u001a\u0002022\u0006\u00108\u001a\u000202H\u0000\u001a\u0011\u00109\u001a\u0002022\u0006\u0010:\u001a\u000202H\u0082\b\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"AppBarHeight", "Landroidx/compose/ui/unit/Dp;", "F", "AppBarHorizontalPadding", "BottomAppBarCutoutOffset", "BottomAppBarRoundedEdgeRadius", "TitleIconModifier", "Landroidx/compose/ui/Modifier;", "TitleInsetWithoutIcon", "ZeroInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "AppBar", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "shape", "Landroidx/compose/ui/graphics/Shape;", "windowInsets", "modifier", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "AppBar-HkEspTQ", "(JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "cutoutShape", "BottomAppBar-DanWW-k", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar-Y1yfwus", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TopAppBar", "title", "Lkotlin/Function0;", "navigationIcon", "actions", "TopAppBar-Rx1qByU", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar-xWeB9-s", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar-afqeVBk", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TopAppBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "calculateCutoutCircleYIntercept", "", "cutoutRadius", "verticalOffset", "calculateRoundedEdgeIntercept", "Lkotlin/Pair;", "controlPointX", "radius", "square", "x", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AppBarKt {
    private static final float AppBarHeight = 0.0f;
    private static final float AppBarHorizontalPadding = 0.0f;
    private static final float BottomAppBarCutoutOffset = 0.0f;
    private static final float BottomAppBarRoundedEdgeRadius = 0.0f;
    private static final Modifier TitleIconModifier = null;
    private static final Modifier TitleInsetWithoutIcon = null;
    private static final WindowInsets ZeroInsets = null;

    /* JADX INFO: renamed from: access$AppBar-HkEspTQ, reason: not valid java name */
    public static final /* synthetic */ void m1531access$AppBarHkEspTQ(long backgroundColor, long contentColor, float elevation, PaddingValues contentPadding, Shape shape, WindowInsets windowInsets, Modifier modifier, Function3 content, Composer $composer, int $changed, int $default) {
        m1524AppBarHkEspTQ(backgroundColor, contentColor, elevation, contentPadding, shape, windowInsets, modifier, content, $composer, $changed, $default);
    }

    public static final /* synthetic */ float access$getAppBarHeight$p() {
        return AppBarHeight;
    }

    public static final /* synthetic */ float access$getAppBarHorizontalPadding$p() {
        return AppBarHorizontalPadding;
    }

    public static final /* synthetic */ float access$getBottomAppBarCutoutOffset$p() {
        return BottomAppBarCutoutOffset;
    }

    public static final /* synthetic */ float access$getBottomAppBarRoundedEdgeRadius$p() {
        return BottomAppBarRoundedEdgeRadius;
    }

    public static final /* synthetic */ Modifier access$getTitleIconModifier$p() {
        return TitleIconModifier;
    }

    public static final /* synthetic */ Modifier access$getTitleInsetWithoutIcon$p() {
        return TitleInsetWithoutIcon;
    }

    /* JADX INFO: renamed from: TopAppBar-Rx1qByU, reason: not valid java name */
    public static final void m1528TopAppBarRx1qByU(final Function2<? super Composer, ? super Integer, Unit> r28, final WindowInsets windowInsets, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r31, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r32, long backgroundColor, long contentColor, float elevation, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(-763778507);
        ComposerKt.sourceInformation($composer2, "C(TopAppBar)P(6,7,4,5!1,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.unit.Dp)102@4714L1060,94@4532L1242:AppBar.kt#jmzs0o");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r40 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
        WindowInsets r4 = windowInsets;
    L23:
        int r5 = r40 & 4;
        if (r5 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L34:
        int r7 = r40 & 8;
        if (r7 == 0) goto L38;
        $dirty = $dirty | 3072;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r31;
    L45:
        int r9 = r40 & 16;
        if (r9 == 0) goto L49;
        $dirty = $dirty | 24576;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r10 = r32;
    L57:
        if ((196608 & $changed) == 0) goto L59;
        long backgroundColor2 = backgroundColor;
    L68:
        if ((1572864 & $changed) != 0) goto L78;
        if ((r40 & 64) != 0) goto L75;
        if ($composer2.changed(contentColor) == false) goto L75;
        int r16 = 1048576;
    L76:
        $dirty = $dirty | r16;
    L75:
        r16 = 524288;
    L78:
        int r15 = r40 & 128;
        if (r15 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L89:
        int $dirty2 = $dirty;
        if ((4793491 & $dirty) == 4793490) goto L92;
        boolean r0 = true;
    L94:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L130;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "90@4386L6,91@4435L32");
        if (($changed & 1) != 0) goto L98;
    L107:
        if (r5 == 0) goto L109;
        modifier2 = Modifier.Companion;
    L109:
        if (r7 == 0) goto L111;
        r8 = null;
    L111:
        if (r9 == 0) goto L114;
        r10 = ComposableSingletons$AppBarKt.INSTANCE.m1621getLambda1$material_release();
    L114:
        if ((r40 & 32) == 0) goto L117;
        backgroundColor2 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors($composer2, 6));
        $dirty2 = $dirty2 & (-458753);
    L117:
        if ((r40 & 64) == 0) goto L119;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty2 >> 15) & 14);
        $dirty2 = $dirty2 & (-3670017);
    L120:
        if (r15 == 0) goto L122;
        long r26 = contentColor2;
        float elevation2 = AppBarDefaults.INSTANCE.m1523getTopAppBarElevationD9Ej5fM();
        int $dirty3 = $dirty2;
        long contentColor3 = r26;
        Modifier modifier3 = modifier2;
    L123:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L126;
        ComposerKt.traceEventStart(-763778507, $dirty3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:93)");
    L126:
        Composer $composer3 = $composer2;
        m1524AppBarHkEspTQ(backgroundColor2, contentColor3, elevation2, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), r4, modifier3, ComposableLambdaKt.rememberComposableLambda(1849684359, true, new AppBarKt$TopAppBar$1(r8, r28, r10), $composer2, 54), $composer3, (((((($dirty3 >> 15) & 14) | 12610560) | (($dirty3 >> 15) & 112)) | (($dirty3 >> 15) & 896)) | (($dirty3 << 12) & 458752)) | (3670016 & ($dirty3 << 12)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L129;
        ComposerKt.traceEventEnd();
    L129:
        final Function2<? super Composer, ? super Integer, Unit> r6 = r8;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r11 = r10;
        final long contentColor4 = contentColor3;
        final float elevation3 = elevation2;
        final Modifier modifier4 = modifier3;
        final long backgroundColor3 = backgroundColor2;
    L131:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L135;
        r13.updateScope(new AppBarKt$TopAppBar$2(r28, windowInsets, modifier4, r6, r11, backgroundColor3, contentColor4, elevation3, $changed, r40));
        return;
    L135:
        return;
    L122:
        modifier3 = modifier2;
        $dirty3 = $dirty2;
        contentColor3 = contentColor2;
        elevation2 = elevation;
        goto L123
    L119:
        contentColor2 = contentColor;
        goto L120
    L98:
        if ($composer2.getDefaultsInvalid() == true) goto L107;
        $composer2.skipToGroupEnd();
        if ((r40 & 32) == 0) goto L104;
        $dirty2 = $dirty2 & (-458753);
    L104:
        if ((r40 & 64) == 0) goto L106;
        $dirty3 = $dirty2 & (-3670017);
        contentColor3 = contentColor;
        elevation2 = elevation;
        modifier3 = modifier2;
        goto L123
    L106:
        elevation2 = elevation;
        modifier3 = modifier2;
        $dirty3 = $dirty2;
        contentColor3 = contentColor;
        goto L123
    L130:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = modifier2;
        r6 = r8;
        r11 = r10;
        contentColor4 = contentColor;
        elevation3 = elevation;
        backgroundColor3 = backgroundColor2;
        goto L131
    L92:
        r0 = false;
        goto L94
    L82:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changed(elevation) == false) goto L86;
        int r1 = 8388608;
    L87:
        $dirty = $dirty | r1;
        goto L89
    L86:
        r1 = 4194304;
        goto L87
    L59:
        if ((r40 & 32) != 0) goto L63;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L64;
        int r17 = 131072;
    L65:
        $dirty = $dirty | r17;
    L64:
        r17 = 65536;
        goto L65
    L63:
        backgroundColor2 = backgroundColor;
        goto L64
    L49:
        if (($changed & 24576) != 0) goto L55;
        r10 = r32;
        if ($composer2.changedInstance(r10) == false) goto L53;
        int r14 = 16384;
    L54:
        $dirty = $dirty | r14;
        goto L57
    L53:
        r14 = 8192;
        goto L54
    L55:
        r10 = r32;
        goto L57
    L38:
        if (($changed & 3072) != 0) goto L44;
        r8 = r31;
        if ($composer2.changedInstance(r8) == false) goto L42;
        int r12 = 2048;
    L43:
        $dirty = $dirty | r12;
        goto L45
    L42:
        r12 = 1024;
        goto L43
    L44:
        r8 = r31;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r18 = 256;
    L32:
        $dirty = $dirty | r18;
        goto L34
    L31:
        r18 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r4 = windowInsets;
        if ($composer2.changed(r4) == false) goto L20;
        int r19 = 32;
    L21:
        $dirty = $dirty | r19;
        goto L23
    L20:
        r19 = 16;
        goto L21
    L22:
        r4 = windowInsets;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(r28) == false) goto L10;
        int r20 = 4;
    L11:
        $dirty = $dirty | r20;
        goto L13
    L10:
        r20 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    public static final void m1530TopAppBarxWeB9s(final Function2<? super Composer, ? super Integer, Unit> r24, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r26, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r27, long backgroundColor, long contentColor, float elevation, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(-2087748139);
        ComposerKt.sourceInformation($composer2, "C(TopAppBar)P(6,4,5!1,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.unit.Dp)171@7819L175:AppBar.kt#jmzs0o");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function2<? super Composer, ? super Integer, Unit> r11 = r24;
    L13:
        int r3 = r35 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r5 = r35 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r6 = r26;
    L35:
        int r7 = r35 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r8 = r27;
    L47:
        if (($changed & 24576) == 0) goto L49;
        long backgroundColor2 = backgroundColor;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        long contentColor2 = contentColor;
    L68:
        int r9 = r35 & 64;
        if (r9 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int $dirty2 = $dirty;
        if (($dirty & 599187) == 599186) goto L82;
        boolean r0 = true;
    L84:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L121;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "167@7674L6,168@7723L32");
        if (($changed & 1) != 0) goto L88;
    L98:
        if (r3 == 0) goto L100;
        modifier2 = Modifier.Companion;
    L100:
        if (r5 == 0) goto L102;
        r6 = null;
    L102:
        if (r7 == 0) goto L105;
        r8 = ComposableSingletons$AppBarKt.INSTANCE.m1622getLambda2$material_release();
    L105:
        if ((r35 & 16) == 0) goto L107;
        backgroundColor2 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors($composer2, 6));
        int $dirty3 = $dirty2 & (-57345);
    L109:
        if ((r35 & 32) == 0) goto L111;
        contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty3 >> 12) & 14);
        $dirty3 = $dirty3 & (-458753);
    L111:
        if (r9 == 0) goto L113;
        float elevation2 = AppBarDefaults.INSTANCE.m1523getTopAppBarElevationD9Ej5fM();
        long backgroundColor3 = backgroundColor2;
        long contentColor3 = contentColor2;
        int $dirty4 = $dirty3;
        Modifier modifier3 = modifier2;
        Function2<? super Composer, ? super Integer, Unit> r14 = r6;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r15 = r8;
        int $dirty5 = -2087748139;
    L114:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L117;
        ComposerKt.traceEventStart($dirty5, $dirty4, -1, "androidx.compose.material.TopAppBar (AppBar.kt:170)");
    L117:
        Composer $composer3 = $composer2;
        m1528TopAppBarRx1qByU(r11, ZeroInsets, modifier3, r14, r15, backgroundColor3, contentColor3, elevation2, $composer3, ((((((($dirty4 & 14) | 48) | (($dirty4 << 3) & 896)) | (($dirty4 << 3) & 7168)) | (($dirty4 << 3) & 57344)) | (($dirty4 << 3) & 458752)) | (($dirty4 << 3) & 3670016)) | (29360128 & ($dirty4 << 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L120;
        ComposerKt.traceEventEnd();
    L120:
        final Modifier modifier4 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> r4 = r14;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r10 = r15;
        final long backgroundColor4 = backgroundColor3;
        final long contentColor4 = contentColor3;
        final float elevation3 = elevation2;
    L122:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L126;
        r13.updateScope(new AppBarKt$TopAppBar$3(r24, modifier4, r4, r10, backgroundColor4, contentColor4, elevation3, $changed, r35));
        return;
    L126:
        return;
    L113:
        elevation2 = elevation;
        $dirty4 = $dirty3;
        backgroundColor3 = backgroundColor2;
        contentColor3 = contentColor2;
        $dirty5 = -2087748139;
        modifier3 = modifier2;
        r14 = r6;
        r15 = r8;
        goto L114
    L107:
        $dirty3 = $dirty2;
        goto L109
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L98;
        $composer2.skipToGroupEnd();
        if ((r35 & 16) == 0) goto L93;
        int $dirty6 = $dirty2 & (-57345);
    L95:
        if ((r35 & 32) == 0) goto L97;
        $dirty6 = $dirty6 & (-458753);
    L97:
        elevation2 = elevation;
        $dirty4 = $dirty6;
        backgroundColor3 = backgroundColor2;
        contentColor3 = contentColor2;
        $dirty5 = -2087748139;
        modifier3 = modifier2;
        r14 = r6;
        r15 = r8;
        goto L114
    L93:
        $dirty6 = $dirty2;
        goto L95
    L121:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        elevation3 = elevation;
        modifier4 = modifier2;
        r4 = r6;
        r10 = r8;
        backgroundColor4 = backgroundColor2;
        contentColor4 = contentColor2;
        goto L122
    L82:
        r0 = false;
        goto L84
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(elevation) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty = $dirty | r17;
        goto L79
    L76:
        r17 = 524288;
        goto L77
    L60:
        if ((r35 & 32) != 0) goto L64;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L65;
        int r12 = 131072;
    L66:
        $dirty = $dirty | r12;
    L65:
        r12 = 65536;
        goto L66
    L64:
        contentColor2 = contentColor;
        goto L65
    L49:
        if ((r35 & 16) != 0) goto L53;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
    L54:
        r16 = 8192;
        goto L55
    L53:
        backgroundColor2 = backgroundColor;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = r27;
        if ($composer2.changedInstance(r8) == false) goto L43;
        int r18 = 2048;
    L44:
        $dirty = $dirty | r18;
        goto L47
    L43:
        r18 = 1024;
        goto L44
    L45:
        r8 = r27;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = r26;
        if ($composer2.changedInstance(r6) == false) goto L32;
        int r19 = 256;
    L33:
        $dirty = $dirty | r19;
        goto L35
    L32:
        r19 = 128;
        goto L33
    L34:
        r6 = r26;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r20 = 32;
    L22:
        $dirty = $dirty | r20;
        goto L24
    L21:
        r20 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r11 = r24;
        if ($composer2.changedInstance(r11) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L13
    L10:
        r21 = 2;
        goto L11
    L12:
        r11 = r24;
        goto L13
    }

    /* JADX INFO: renamed from: TopAppBar-afqeVBk, reason: not valid java name */
    public static final void m1529TopAppBarafqeVBk(final WindowInsets windowInsets, Modifier modifier, long backgroundColor, long contentColor, float elevation, PaddingValues contentPadding, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(883764366);
        ComposerKt.sourceInformation($composer2, "C(TopAppBar)P(6,5,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,3)225@10188L204:AppBar.kt#jmzs0o");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r4 = r35 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        long backgroundColor2 = backgroundColor;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long contentColor2 = contentColor;
    L46:
        int r11 = r35 & 16;
        if (r11 == 0) goto L50;
        $dirty = $dirty | 24576;
        float elevation2 = elevation;
    L57:
        int r13 = r35 & 32;
        if (r13 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        PaddingValues r14 = contentPadding;
    L69:
        if ((r35 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if (($dirty & 599187) == 599186) goto L82;
        boolean r0 = true;
    L84:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L117;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "219@9930L6,220@9979L32");
        if (($changed & 1) != 0) goto L88;
    L97:
        if (r4 == 0) goto L100;
        modifier2 = Modifier.Companion;
    L100:
        if ((r35 & 4) == 0) goto L103;
        $dirty = $dirty & (-897);
        backgroundColor2 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors($composer2, 6));
    L103:
        if ((r35 & 8) == 0) goto L105;
        long contentColor3 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty >> 6) & 14);
        $dirty = $dirty & (-7169);
        contentColor2 = contentColor3;
    L105:
        if (r11 == 0) goto L107;
        elevation2 = AppBarDefaults.INSTANCE.m1523getTopAppBarElevationD9Ej5fM();
    L107:
        if (r13 == 0) goto L109;
        PaddingValues contentPadding2 = AppBarDefaults.INSTANCE.getContentPadding();
        Modifier modifier3 = modifier2;
        long contentColor4 = contentColor2;
        float elevation3 = elevation2;
        long backgroundColor3 = backgroundColor2;
    L110:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L113;
        ComposerKt.traceEventStart(883764366, $dirty, -1, "androidx.compose.material.TopAppBar (AppBar.kt:224)");
    L113:
        Composer $composer3 = $composer2;
        m1524AppBarHkEspTQ(backgroundColor3, contentColor4, elevation3, contentPadding2, RectangleShapeKt.getRectangleShape(), windowInsets, modifier3, r32, $composer3, (((((((($dirty >> 6) & 14) | 24576) | (($dirty >> 6) & 112)) | (($dirty >> 6) & 896)) | (($dirty >> 6) & 7168)) | (($dirty << 15) & 458752)) | (3670016 & ($dirty << 15))) | (($dirty << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L116;
        ComposerKt.traceEventEnd();
    L116:
        final long backgroundColor4 = backgroundColor3;
        final long contentColor5 = contentColor4;
        final float elevation4 = elevation3;
        final PaddingValues contentPadding3 = contentPadding2;
        final Modifier modifier4 = modifier3;
    L118:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L122;
        r15.updateScope(new AppBarKt$TopAppBar$4(windowInsets, modifier4, backgroundColor4, contentColor5, elevation4, contentPadding3, r32, $changed, r35));
        return;
    L122:
        return;
    L109:
        modifier3 = modifier2;
        elevation3 = elevation2;
        contentPadding2 = r14;
        backgroundColor3 = backgroundColor2;
        contentColor4 = contentColor2;
        goto L110
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L97;
        $composer2.skipToGroupEnd();
        if ((r35 & 4) == 0) goto L94;
        $dirty = $dirty & (-897);
    L94:
        if ((r35 & 8) == 0) goto L96;
        $dirty = $dirty & (-7169);
        modifier3 = modifier2;
        elevation3 = elevation2;
        contentPadding2 = r14;
        backgroundColor3 = backgroundColor2;
        contentColor4 = contentColor2;
        goto L110
    L96:
        modifier3 = modifier2;
        elevation3 = elevation2;
        contentPadding2 = r14;
        backgroundColor3 = backgroundColor2;
        contentColor4 = contentColor2;
        goto L110
    L117:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        backgroundColor4 = backgroundColor2;
        elevation4 = elevation2;
        modifier4 = modifier2;
        contentColor5 = contentColor2;
        contentPadding3 = r14;
        goto L118
    L82:
        r0 = false;
        goto L84
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changedInstance(r32) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
        goto L80
    L76:
        r16 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r14 = contentPadding;
        if ($composer2.changed(r14) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L69
    L65:
        r17 = 65536;
        goto L66
    L67:
        r14 = contentPadding;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L54;
        int r18 = 16384;
    L55:
        $dirty = $dirty | r18;
        goto L57
    L54:
        r18 = 8192;
        goto L55
    L56:
        elevation2 = elevation;
        goto L57
    L38:
        if ((r35 & 8) != 0) goto L42;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
    L43:
        r12 = 1024;
        goto L44
    L42:
        contentColor2 = contentColor;
        goto L43
    L27:
        if ((r35 & 4) != 0) goto L31;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
    L32:
        r8 = 128;
        goto L33
    L31:
        backgroundColor2 = backgroundColor;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L25
    L21:
        r6 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(windowInsets) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L13
    L10:
        r5 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: TopAppBar-HsRjFd4, reason: not valid java name */
    public static final void m1527TopAppBarHsRjFd4(Modifier modifier, long backgroundColor, long contentColor, float elevation, PaddingValues contentPadding, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r30, Composer $composer, final int $changed, final int r33) {
        Composer $composer2 = $composer.startRestartGroup(1897058582);
        ComposerKt.sourceInformation($composer2, "C(TopAppBar)P(5,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,3)274@12336L202:AppBar.kt#jmzs0o");
        int $dirty = $changed;
        int r3 = r33 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long backgroundColor2 = backgroundColor;
    L25:
        if (($changed & 384) == 0) goto L27;
        long contentColor2 = contentColor;
    L35:
        int r10 = r33 & 8;
        if (r10 == 0) goto L39;
        $dirty = $dirty | 3072;
        float elevation2 = elevation;
    L46:
        int r12 = r33 & 16;
        if (r12 == 0) goto L50;
        $dirty = $dirty | 24576;
        PaddingValues r13 = contentPadding;
    L58:
        if ((r33 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L69:
        if ((74899 & $dirty) == 74898) goto L71;
        boolean r0 = true;
    L73:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L107;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "268@12078L6,269@12127L32");
        if (($changed & 1) != 0) goto L77;
    L86:
        if (r3 == 0) goto L88;
        Modifier.Companion modifier2 = Modifier.Companion;
    L90:
        if ((r33 & 2) == 0) goto L93;
        $dirty = $dirty & (-113);
        backgroundColor2 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors($composer2, 6));
    L93:
        if ((r33 & 4) == 0) goto L95;
        long contentColor3 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty >> 3) & 14);
        $dirty = $dirty & (-897);
        contentColor2 = contentColor3;
    L95:
        if (r10 == 0) goto L97;
        elevation2 = AppBarDefaults.INSTANCE.m1523getTopAppBarElevationD9Ej5fM();
    L97:
        if (r12 == 0) goto L99;
        Modifier modifier3 = modifier2;
        PaddingValues contentPadding2 = AppBarDefaults.INSTANCE.getContentPadding();
        long contentColor4 = contentColor2;
        float elevation3 = elevation2;
        long backgroundColor3 = backgroundColor2;
    L100:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L103;
        ComposerKt.traceEventStart(1897058582, $dirty, -1, "androidx.compose.material.TopAppBar (AppBar.kt:273)");
    L103:
        Composer $composer3 = $composer2;
        m1524AppBarHkEspTQ(backgroundColor3, contentColor4, elevation3, contentPadding2, RectangleShapeKt.getRectangleShape(), ZeroInsets, modifier3, r30, $composer3, ((((((($dirty >> 3) & 14) | 221184) | (($dirty >> 3) & 112)) | (($dirty >> 3) & 896)) | (($dirty >> 3) & 7168)) | (($dirty << 18) & 3670016)) | (($dirty << 6) & 29360128), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventEnd();
    L106:
        final long backgroundColor4 = backgroundColor3;
        final long contentColor5 = contentColor4;
        final float elevation4 = elevation3;
        final PaddingValues contentPadding3 = contentPadding2;
        final Modifier modifier4 = modifier3;
    L108:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L112;
        r14.updateScope(new AppBarKt$TopAppBar$5(modifier4, backgroundColor4, contentColor5, elevation4, contentPadding3, r30, $changed, r33));
        return;
    L112:
        return;
    L99:
        modifier3 = modifier2;
        elevation3 = elevation2;
        contentPadding2 = r13;
        backgroundColor3 = backgroundColor2;
        contentColor4 = contentColor2;
        goto L100
    L88:
        modifier2 = r4;
        goto L90
    L77:
        if ($composer2.getDefaultsInvalid() == true) goto L86;
        $composer2.skipToGroupEnd();
        if ((r33 & 2) == 0) goto L83;
        $dirty = $dirty & (-113);
    L83:
        if ((r33 & 4) == 0) goto L85;
        $dirty = $dirty & (-897);
        modifier3 = r4;
        elevation3 = elevation2;
        contentPadding2 = r13;
        backgroundColor3 = backgroundColor2;
        contentColor4 = contentColor2;
        goto L100
    L85:
        modifier3 = r4;
        elevation3 = elevation2;
        contentPadding2 = r13;
        backgroundColor3 = backgroundColor2;
        contentColor4 = contentColor2;
        goto L100
    L107:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        backgroundColor4 = backgroundColor2;
        elevation4 = elevation2;
        modifier4 = r4;
        contentColor5 = contentColor2;
        contentPadding3 = r13;
        goto L108
    L71:
        r0 = false;
        goto L73
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L69;
        if ($composer2.changedInstance(r30) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
        goto L69
    L65:
        r15 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        r13 = contentPadding;
        if ($composer2.changed(r13) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
        goto L58
    L54:
        r16 = 8192;
        goto L55
    L56:
        r13 = contentPadding;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
        goto L46
    L43:
        r17 = 1024;
        goto L44
    L45:
        elevation2 = elevation;
        goto L46
    L27:
        if ((r33 & 4) != 0) goto L31;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
    L32:
        r11 = 128;
        goto L33
    L31:
        contentColor2 = contentColor;
        goto L32
    L16:
        if ((r33 & 2) != 0) goto L20;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
    L21:
        r7 = 16;
        goto L22
    L20:
        backgroundColor2 = backgroundColor;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L14
    L10:
        r5 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L14
    }

    /* JADX INFO: renamed from: BottomAppBar-DanWW-k, reason: not valid java name */
    public static final void m1525BottomAppBarDanWWk(final WindowInsets windowInsets, Modifier modifier, long backgroundColor, long contentColor, Shape cutoutShape, float elevation, PaddingValues contentPadding, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r35, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(382658343);
        ComposerKt.sourceInformation($composer2, "C(BottomAppBar)P(7,6,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4,5:c#ui.unit.Dp,3)342@15627L7,349@15841L174:AppBar.kt#jmzs0o");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r4 = r38 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        long backgroundColor2 = backgroundColor;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long contentColor2 = contentColor;
    L46:
        int r10 = r38 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | 24576;
        Shape cutoutShape2 = cutoutShape;
    L57:
        int r14 = r38 & 32;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float elevation2 = elevation;
    L68:
        int r16 = r38 & 64;
        if (r16 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if ((r38 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        boolean r18 = false;
        if (($dirty & 4793491) == 4793490) goto L93;
        boolean r0 = true;
    L95:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L139;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "335@15297L6,336@15346L32");
        if (($changed & 1) != 0) goto L99;
    L108:
        if (r4 == 0) goto L111;
        modifier2 = Modifier.Companion;
    L111:
        if ((r38 & 4) == 0) goto L114;
        backgroundColor2 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors($composer2, 6));
        $dirty = $dirty & (-897);
    L114:
        if ((r38 & 8) == 0) goto L116;
        contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty >> 6) & 14);
        $dirty = $dirty & (-7169);
    L116:
        if (r10 == 0) goto L118;
        cutoutShape2 = null;
    L118:
        if (r14 == 0) goto L120;
        elevation2 = AppBarDefaults.INSTANCE.m1522getBottomAppBarElevationD9Ej5fM();
    L120:
        if (r16 == 0) goto L122;
        Modifier modifier3 = modifier2;
        float elevation3 = elevation2;
        int r5 = 382658343;
        PaddingValues contentPadding2 = AppBarDefaults.INSTANCE.getContentPadding();
        long contentColor3 = contentColor2;
        Shape cutoutShape3 = cutoutShape2;
        long backgroundColor3 = backgroundColor2;
    L123:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L126;
        ComposerKt.traceEventStart(r5, $dirty, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:341)");
    L126:
        ProvidableCompositionLocal<FabPlacement> r6 = ScaffoldKt.getLocalFabPlacement();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r8 = $composer2.consume(r6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        FabPlacement fabPlacement = (FabPlacement) r8;
        if (cutoutShape3 == null) goto L134;
        if (fabPlacement != null) goto L130;
    L132:
        if (r18 == false) goto L134;
        Shape shape = new BottomAppBarCutoutShape(cutoutShape3, fabPlacement);
    L135:
        Composer $composer3 = $composer2;
        m1524AppBarHkEspTQ(backgroundColor3, contentColor3, elevation3, contentPadding2, shape, windowInsets, modifier3, r35, $composer3, ((((((($dirty >> 6) & 14) | (($dirty >> 6) & 112)) | (($dirty >> 9) & 896)) | (($dirty >> 9) & 7168)) | (($dirty << 15) & 458752)) | (3670016 & ($dirty << 15))) | (29360128 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L138;
        ComposerKt.traceEventEnd();
    L138:
        final Shape cutoutShape4 = cutoutShape3;
        final long backgroundColor4 = backgroundColor3;
        final long contentColor4 = contentColor3;
        final float elevation4 = elevation3;
        final PaddingValues contentPadding3 = contentPadding2;
        final Modifier modifier4 = modifier3;
    L140:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L144;
        r15.updateScope(new AppBarKt$BottomAppBar$1(windowInsets, modifier4, backgroundColor4, contentColor4, cutoutShape4, elevation4, contentPadding3, r35, $changed, r38));
        return;
    L144:
        return;
    L130:
        if (fabPlacement.isDocked() != true) goto L132;
        r18 = true;
    L134:
        shape = RectangleShapeKt.getRectangleShape();
        goto L135
    L122:
        modifier3 = modifier2;
        cutoutShape3 = cutoutShape2;
        elevation3 = elevation2;
        r5 = 382658343;
        contentPadding2 = contentPadding;
        backgroundColor3 = backgroundColor2;
        contentColor3 = contentColor2;
        goto L123
    L99:
        if ($composer2.getDefaultsInvalid() == true) goto L108;
        $composer2.skipToGroupEnd();
        if ((r38 & 4) == 0) goto L105;
        $dirty = $dirty & (-897);
    L105:
        if ((r38 & 8) == 0) goto L107;
        $dirty = $dirty & (-7169);
        modifier3 = modifier2;
        cutoutShape3 = cutoutShape2;
        elevation3 = elevation2;
        r5 = 382658343;
        contentPadding2 = contentPadding;
        backgroundColor3 = backgroundColor2;
        contentColor3 = contentColor2;
        goto L123
    L107:
        modifier3 = modifier2;
        cutoutShape3 = cutoutShape2;
        elevation3 = elevation2;
        r5 = 382658343;
        contentPadding2 = contentPadding;
        backgroundColor3 = backgroundColor2;
        contentColor3 = contentColor2;
        goto L123
    L139:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        backgroundColor4 = backgroundColor2;
        cutoutShape4 = cutoutShape2;
        modifier4 = modifier2;
        contentColor4 = contentColor2;
        elevation4 = elevation2;
        contentPadding3 = contentPadding;
        goto L140
    L93:
        r0 = false;
        goto L95
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r35) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L90
    L87:
        r19 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changed(contentPadding) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
        goto L80
    L76:
        r110 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L68
    L65:
        r17 = 65536;
        goto L66
    L67:
        elevation2 = elevation;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        cutoutShape2 = cutoutShape;
        if ($composer2.changed(cutoutShape2) == false) goto L54;
        int r111 = 16384;
    L55:
        $dirty = $dirty | r111;
        goto L57
    L54:
        r111 = 8192;
        goto L55
    L56:
        cutoutShape2 = cutoutShape;
        goto L57
    L38:
        if ((r38 & 8) != 0) goto L42;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L43;
        int r11 = 2048;
    L44:
        $dirty = $dirty | r11;
    L43:
        r11 = 1024;
        goto L44
    L42:
        contentColor2 = contentColor;
        goto L43
    L27:
        if ((r38 & 4) != 0) goto L31;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
    L32:
        r9 = 128;
        goto L33
    L31:
        backgroundColor2 = backgroundColor;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L25
    L21:
        r7 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(windowInsets) == false) goto L10;
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L13
    L10:
        r12 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: BottomAppBar-Y1yfwus, reason: not valid java name */
    public static final void m1526BottomAppBarY1yfwus(Modifier modifier, long backgroundColor, long contentColor, Shape cutoutShape, float elevation, PaddingValues contentPadding, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(-1651948973);
        ComposerKt.sourceInformation($composer2, "C(BottomAppBar)P(6,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4,5:c#ui.unit.Dp,3)412@18851L7,419@19065L172:AppBar.kt#jmzs0o");
        int $dirty = $changed;
        int r3 = r35 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long backgroundColor2 = backgroundColor;
    L25:
        if (($changed & 384) == 0) goto L27;
        long contentColor2 = contentColor;
    L35:
        int r9 = r35 & 8;
        if (r9 == 0) goto L39;
        $dirty = $dirty | 3072;
        Shape cutoutShape2 = cutoutShape;
    L46:
        int r12 = r35 & 16;
        if (r12 == 0) goto L50;
        $dirty = $dirty | 24576;
        float elevation2 = elevation;
    L57:
        int r14 = r35 & 32;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        PaddingValues r15 = contentPadding;
    L69:
        if ((r35 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int $dirty2 = $dirty;
        boolean r18 = false;
        if (($dirty & 599187) == 599186) goto L82;
        boolean r0 = true;
    L84:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L130;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "405@18521L6,406@18570L32");
        if (($changed & 1) != 0) goto L88;
    L98:
        if (r3 == 0) goto L101;
        modifier2 = Modifier.Companion;
    L101:
        if ((r35 & 2) == 0) goto L103;
        backgroundColor2 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors($composer2, 6));
        int $dirty3 = $dirty2 & (-113);
    L105:
        if ((r35 & 4) == 0) goto L107;
        contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty3 >> 3) & 14);
        $dirty3 = $dirty3 & (-897);
    L107:
        if (r9 == 0) goto L109;
        cutoutShape2 = null;
    L109:
        if (r12 == 0) goto L111;
        elevation2 = AppBarDefaults.INSTANCE.m1522getBottomAppBarElevationD9Ej5fM();
    L111:
        if (r14 == 0) goto L113;
        PaddingValues contentPadding2 = AppBarDefaults.INSTANCE.getContentPadding();
        Modifier modifier3 = modifier2;
        Shape cutoutShape3 = cutoutShape2;
        float elevation3 = elevation2;
        int r4 = -1651948973;
        long backgroundColor3 = backgroundColor2;
        long contentColor3 = contentColor2;
    L114:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L117;
        ComposerKt.traceEventStart(r4, $dirty3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:411)");
    L117:
        ProvidableCompositionLocal<FabPlacement> r5 = ScaffoldKt.getLocalFabPlacement();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r7 = $composer2.consume(r5);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        FabPlacement fabPlacement = (FabPlacement) r7;
        if (cutoutShape3 == null) goto L125;
        if (fabPlacement != null) goto L121;
    L123:
        if (r18 == false) goto L125;
        Shape shape = new BottomAppBarCutoutShape(cutoutShape3, fabPlacement);
    L126:
        Composer $composer3 = $composer2;
        m1524AppBarHkEspTQ(backgroundColor3, contentColor3, elevation3, contentPadding2, shape, ZeroInsets, modifier3, r32, $composer3, ((((((($dirty3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | (($dirty3 >> 3) & 112)) | (($dirty3 >> 6) & 896)) | (($dirty3 >> 6) & 7168)) | (($dirty3 << 18) & 3670016)) | (29360128 & ($dirty3 << 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L129;
        ComposerKt.traceEventEnd();
    L129:
        final Shape cutoutShape4 = cutoutShape3;
        final long backgroundColor4 = backgroundColor3;
        final long contentColor4 = contentColor3;
        final float elevation4 = elevation3;
        final PaddingValues contentPadding3 = contentPadding2;
        final Modifier modifier4 = modifier3;
    L131:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L135;
        r13.updateScope(new AppBarKt$BottomAppBar$2(modifier4, backgroundColor4, contentColor4, cutoutShape4, elevation4, contentPadding3, r32, $changed, r35));
        return;
    L135:
        return;
    L121:
        if (fabPlacement.isDocked() != true) goto L123;
        r18 = true;
    L125:
        shape = RectangleShapeKt.getRectangleShape();
        goto L126
    L113:
        modifier3 = modifier2;
        cutoutShape3 = cutoutShape2;
        contentPadding2 = r15;
        r4 = -1651948973;
        backgroundColor3 = backgroundColor2;
        elevation3 = elevation2;
        contentColor3 = contentColor2;
        goto L114
    L103:
        $dirty3 = $dirty2;
        goto L105
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L98;
        $composer2.skipToGroupEnd();
        if ((r35 & 2) == 0) goto L93;
        $dirty3 = $dirty2 & (-113);
    L95:
        if ((r35 & 4) == 0) goto L97;
        $dirty3 = $dirty3 & (-897);
        modifier3 = modifier2;
        cutoutShape3 = cutoutShape2;
        contentPadding2 = r15;
        r4 = -1651948973;
        backgroundColor3 = backgroundColor2;
        elevation3 = elevation2;
        contentColor3 = contentColor2;
        goto L114
    L97:
        modifier3 = modifier2;
        cutoutShape3 = cutoutShape2;
        contentPadding2 = r15;
        r4 = -1651948973;
        backgroundColor3 = backgroundColor2;
        elevation3 = elevation2;
        contentColor3 = contentColor2;
        goto L114
    L93:
        $dirty3 = $dirty2;
        goto L95
    L130:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = modifier2;
        backgroundColor4 = backgroundColor2;
        contentColor4 = contentColor2;
        cutoutShape4 = cutoutShape2;
        elevation4 = elevation2;
        contentPadding3 = r15;
        goto L131
    L82:
        r0 = false;
        goto L84
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r32) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty = $dirty | r17;
        goto L79
    L76:
        r17 = 524288;
        goto L77
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r15 = contentPadding;
        if ($composer2.changed(r15) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
        goto L69
    L65:
        r16 = 65536;
        goto L66
    L67:
        r15 = contentPadding;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L54;
        int r19 = 16384;
    L55:
        $dirty = $dirty | r19;
        goto L57
    L54:
        r19 = 8192;
        goto L55
    L56:
        elevation2 = elevation;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        cutoutShape2 = cutoutShape;
        if ($composer2.changed(cutoutShape2) == false) goto L43;
        int r110 = 2048;
    L44:
        $dirty = $dirty | r110;
        goto L46
    L43:
        r110 = 1024;
        goto L44
    L45:
        cutoutShape2 = cutoutShape;
        goto L46
    L27:
        if ((r35 & 4) != 0) goto L31;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
    L32:
        r10 = 128;
        goto L33
    L31:
        contentColor2 = contentColor;
        goto L32
    L16:
        if ((r35 & 2) != 0) goto L20;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
    L21:
        r8 = 16;
        goto L22
    L20:
        backgroundColor2 = backgroundColor;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L14
    L10:
        r6 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }

    private static final float square(float x) {
        return x * x;
    }

    public static final float calculateCutoutCircleYIntercept(float cutoutRadius, float verticalOffset) {
        return -((float) Math.sqrt((cutoutRadius * cutoutRadius) - (verticalOffset * verticalOffset)));
    }

    public static final Pair<Float, Float> calculateRoundedEdgeIntercept(float controlPointX, float verticalOffset, float radius) {
        float discriminant = ((verticalOffset * verticalOffset) * (radius * radius)) * (((controlPointX * controlPointX) + (verticalOffset * verticalOffset)) - (radius * radius));
        float divisor = (controlPointX * controlPointX) + (verticalOffset * verticalOffset);
        float bCoefficient = (radius * radius) * controlPointX;
        float xSolutionA = (bCoefficient - ((float) Math.sqrt(discriminant))) / divisor;
        float xSolutionB = (((float) Math.sqrt(discriminant)) + bCoefficient) / divisor;
        float ySolutionA = (float) Math.sqrt((radius * radius) - (xSolutionA * xSolutionA));
        float ySolutionB = (float) Math.sqrt((radius * radius) - (xSolutionB * xSolutionB));
        if (verticalOffset <= 0.0f) goto L10;
        if (ySolutionA <= ySolutionB) goto L7;
        Float r10 = Float.valueOf(xSolutionA);
        Float r11 = Float.valueOf(ySolutionA);
    L8:
        Pair r12 = TuplesKt.to(r10, r11);
    L14:
        float xSolution = ((Number) r12.component1()).floatValue();
        float ySolution = ((Number) r12.component2()).floatValue();
        if (xSolution >= controlPointX) goto L17;
        float adjustedYSolution = -ySolution;
    L19:
        return TuplesKt.to(Float.valueOf(xSolution), Float.valueOf(adjustedYSolution));
    L17:
        adjustedYSolution = ySolution;
        goto L19
    L7:
        r10 = Float.valueOf(xSolutionB);
        r11 = Float.valueOf(ySolutionB);
        goto L8
    L10:
        if (ySolutionA >= ySolutionB) goto L12;
        Float r13 = Float.valueOf(xSolutionA);
        Float r14 = Float.valueOf(ySolutionA);
    L13:
        r12 = TuplesKt.to(r13, r14);
        goto L14
    L12:
        r13 = Float.valueOf(xSolutionB);
        r14 = Float.valueOf(ySolutionB);
        goto L13
    }

    /* JADX INFO: renamed from: AppBar-HkEspTQ, reason: not valid java name */
    private static final void m1524AppBarHkEspTQ(final long backgroundColor, final long contentColor, final float elevation, final PaddingValues contentPadding, final Shape shape, final WindowInsets windowInsets, Modifier modifier, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-712505634);
        ComposerKt.sourceInformation($composer2, "C(AppBar)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,3,6,7,5)711@31822L471,705@31655L638:AppBar.kt#jmzs0o");
        int $dirty = $changed;
        if ((r37 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r37 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L25:
        if ((r37 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        float r5 = elevation;
    L36:
        if ((r37 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        if ((r37 & 16) == 0) goto L49;
        $dirty = $dirty | 24576;
        Shape r7 = shape;
    L57:
        if ((r37 & 32) == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L66:
        int r9 = r37 & 64;
        if (r9 == 0) goto L70;
        $dirty = $dirty | 1572864;
        Modifier r15 = modifier;
    L78:
        if ((r37 & 128) == 0) goto L81;
        $dirty = $dirty | 12582912;
    L87:
        int $dirty2 = $dirty;
        if ((4793491 & $dirty2) == 4793490) goto L90;
        boolean r2 = true;
    L92:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L103;
        if (r9 == 0) goto L95;
        Modifier modifier2 = Modifier.Companion;
    L97:
        if (ComposerKt.isTraceInProgress() == false) goto L99;
        ComposerKt.traceEventStart(-712505634, $dirty2, -1, "androidx.compose.material.AppBar (AppBar.kt:704)");
    L99:
        Composer $composer3 = $composer2;
        Shape r14 = r7;
        SurfaceKt.m1782SurfaceFjzlyU(modifier2, r14, backgroundColor, contentColor, null, r5, ComposableLambdaKt.rememberComposableLambda(213273114, true, new AppBarKt$AppBar$1(windowInsets, contentPadding, r34), $composer2, 54), $composer3, (((((($dirty2 >> 18) & 14) | 1572864) | (($dirty2 >> 9) & 112)) | (($dirty2 << 6) & 896)) | (($dirty2 << 6) & 7168)) | (458752 & ($dirty2 << 9)), 16);
        if (ComposerKt.isTraceInProgress() == false) goto L102;
        ComposerKt.traceEventEnd();
    L102:
        final Modifier modifier3 = modifier2;
    L104:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L108;
        r13.updateScope(new AppBarKt$AppBar$2(backgroundColor, contentColor, elevation, contentPadding, shape, windowInsets, modifier3, r34, $changed, r37));
        return;
    L108:
        return;
    L95:
        modifier2 = r15;
        goto L97
    L103:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier3 = r15;
        goto L104
    L90:
        r2 = false;
        goto L92
    L81:
        if (($changed & 12582912) != 0) goto L87;
        if ($composer2.changedInstance(r34) == false) goto L85;
        int r0 = 8388608;
    L86:
        $dirty = $dirty | r0;
        goto L87
    L85:
        r0 = 4194304;
        goto L86
    L70:
        if (($changed & 1572864) != 0) goto L76;
        r15 = modifier;
        if ($composer2.changed(r15) == false) goto L74;
        int r16 = 1048576;
    L75:
        $dirty = $dirty | r16;
        goto L78
    L74:
        r16 = 524288;
        goto L75
    L76:
        r15 = modifier;
        goto L78
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        if ($composer2.changed(windowInsets) == false) goto L64;
        int r10 = 131072;
    L65:
        $dirty = $dirty | r10;
        goto L66
    L64:
        r10 = 65536;
        goto L65
    L49:
        if (($changed & 24576) != 0) goto L55;
        r7 = shape;
        if ($composer2.changed(r7) == false) goto L53;
        int r11 = 16384;
    L54:
        $dirty = $dirty | r11;
        goto L57
    L53:
        r11 = 8192;
        goto L54
    L55:
        r7 = shape;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(contentPadding) == false) goto L43;
        int r8 = 2048;
    L44:
        $dirty = $dirty | r8;
        goto L46
    L43:
        r8 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        r5 = elevation;
        if ($composer2.changed(r5) == false) goto L32;
        int r12 = 256;
    L33:
        $dirty = $dirty | r12;
        goto L36
    L32:
        r12 = 128;
        goto L33
    L34:
        r5 = elevation;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L25;
        if ($composer2.changed(contentColor) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L25
    L21:
        r6 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(backgroundColor) == false) goto L10;
        int r17 = 4;
    L11:
        $dirty = $dirty | r17;
        goto L14
    L10:
        r17 = 2;
        goto L11
    }

    static {
        AppBarHeight = Dp.m6973constructorimpl(56);
        AppBarHorizontalPadding = Dp.m6973constructorimpl(4);
        Modifier.Companion r0 = Modifier.Companion;
        float arg0$iv = Dp.m6973constructorimpl(16);
        float other$iv = AppBarHorizontalPadding;
        TitleInsetWithoutIcon = SizeKt.m777width3ABfNKs(r0, Dp.m6973constructorimpl(arg0$iv - other$iv));
        Modifier r1 = SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null);
        float arg0$iv2 = Dp.m6973constructorimpl(72);
        float other$iv2 = AppBarHorizontalPadding;
        TitleIconModifier = SizeKt.m777width3ABfNKs(r1, Dp.m6973constructorimpl(arg0$iv2 - other$iv2));
        BottomAppBarCutoutOffset = Dp.m6973constructorimpl(8);
        BottomAppBarRoundedEdgeRadius = Dp.m6973constructorimpl(4);
        ZeroInsets = WindowInsetsKt.m797WindowInsetsa9UjIt4$default(Dp.m6973constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);
    }
}
