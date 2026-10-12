package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a§\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u00122\u0013\b\u0002\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2 \b\u0002\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u009f\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u00122\u0013\b\u0002\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2 \b\u0002\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a¨\u0001\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u00192\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0012¢\u0006\u0002\b22\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0012¢\u0006\u0002\b22\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0012¢\u0006\u0002\b22\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0012¢\u0006\u0002\b22\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0012¢\u0006\u0002\b2H\u0003ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a!\u00107\u001a\u00020\u000f2\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010;\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Scaffold", "", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "isFloatingActionButtonDocked", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerGesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-u4IkXBM", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ScaffoldLayout", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-i1QSOvI", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rememberScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScaffoldKt {
    private static final float FabSpacing = 0.0f;
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = null;

    /* JADX INFO: renamed from: access$ScaffoldLayout-i1QSOvI, reason: not valid java name */
    public static final /* synthetic */ void m1752access$ScaffoldLayouti1QSOvI(boolean isFabDocked, int fabPosition, Function2 topBar, Function3 content, Function2 snackbar, Function2 fab, WindowInsets contentWindowInsets, Function2 bottomBar, Composer $composer, int $changed) {
        m1751ScaffoldLayouti1QSOvI(isFabDocked, fabPosition, topBar, content, snackbar, fab, contentWindowInsets, bottomBar, $composer, $changed);
    }

    public static final /* synthetic */ float access$getFabSpacing$p() {
        return FabSpacing;
    }

    public static final ScaffoldState rememberScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer $composer, int $changed, int r12) {
        ComposerKt.sourceInformationMarkerStart($composer, 1569641925, "C(rememberScaffoldState)71@2876L39,72@2960L32,73@3012L58:Scaffold.kt#jmzs0o");
        if ((r12 & 1) == 0) goto L6;
        drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, $composer, 6, 2);
    L6:
        if ((r12 & 2) == 0) goto L13;
        ComposerKt.sourceInformationMarkerStart($composer, -694657848, "CC(remember):Scaffold.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L11;
        Object value$iv = new SnackbarHostState();
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L11:
        snackbarHostState = (SnackbarHostState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
    L13:
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventStart(1569641925, $changed, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:73)");
    L15:
        ComposerKt.sourceInformationMarkerStart($composer, -694656158, "CC(remember):Scaffold.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L19;
        Object value$iv2 = new ScaffoldState(drawerState, snackbarHostState);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L19:
        ScaffoldState r2 = (ScaffoldState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventEnd();
    L22:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    }

    /* JADX INFO: renamed from: Scaffold-u4IkXBM, reason: not valid java name */
    public static final void m1750Scaffoldu4IkXBM(final WindowInsets contentWindowInsets, Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> r43, Function2<? super Composer, ? super Integer, Unit> r44, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r45, Function2<? super Composer, ? super Integer, Unit> r46, int floatingActionButtonPosition, final boolean isFloatingActionButtonDocked, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r49, boolean drawerGesturesEnabled, Shape drawerShape, float drawerElevation, long drawerBackgroundColor, long drawerContentColor, long drawerScrimColor, long backgroundColor, long contentColor, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> r63, Composer $composer, final int $changed, final int $changed1, final int r67) {
        Composer $composer2 = $composer.startRestartGroup(-1288630565);
        ComposerKt.sourceInformation($composer2, "C(Scaffold)P(4,15,16,18,1,17,12,13:c#material.FabPosition,14,6,9,11,8:c#ui.unit.Dp,5:c#ui.graphics.Color,7:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color)198@9536L74,200@9647L1022:Scaffold.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r67 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r7 = r67 & 2;
        if (r7 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        ScaffoldState scaffoldState2 = scaffoldState;
    L34:
        int r16 = r67 & 8;
        int r17 = 1024;
        if (r16 == 0) goto L38;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r8 = r43;
    L45:
        int r19 = r67 & 16;
        int r20 = 16384;
        if (r19 == 0) goto L49;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r10 = r44;
    L56:
        int r23 = r67 & 32;
        if (r23 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r11 = r45;
    L67:
        int r28 = r67 & 64;
        if (r28 == 0) goto L71;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r14 = r46;
    L78:
        int r15 = r67 & 128;
        if (r15 == 0) goto L82;
        $dirty = $dirty | 12582912;
        int floatingActionButtonPosition2 = floatingActionButtonPosition;
    L89:
        int r0 = r67 & 256;
        if (r0 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L100:
        int r1 = r67 & 512;
        if (r1 == 0) goto L104;
        $dirty = $dirty | 805306368;
    L111:
        int r2 = r67 & 1024;
        if (r2 == 0) goto L115;
        $dirty1 = $dirty1 | 6;
    L123:
        if (($changed1 & 48) != 0) goto L133;
        if ((r67 & 2048) != 0) goto L130;
        if ($composer2.changed(drawerShape) == false) goto L130;
        int r22 = 32;
    L131:
        $dirty1 = $dirty1 | r22;
    L130:
        r22 = 16;
    L133:
        int r3 = r67 & 4096;
        if (r3 == 0) goto L136;
        $dirty1 = $dirty1 | 384;
        int r24 = r3;
    L145:
        if (($changed1 & 3072) == 0) goto L147;
        int $dirty2 = $dirty1;
        int r64 = r7;
    L154:
        int $dirty3 = $dirty2;
        if (($changed1 & 24576) == 0) goto L157;
        int $dirty4 = $dirty3;
    L166:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L177;
        if ((r67 & 32768) != 0) goto L173;
        if ($composer2.changed(drawerScrimColor) == false) goto L173;
        int r18 = 131072;
    L174:
        $dirty4 = $dirty4 | r18;
    L173:
        r18 = 65536;
    L177:
        if (($changed1 & 1572864) != 0) goto L188;
        if ((r67 & 65536) != 0) goto L184;
        if ($composer2.changed(backgroundColor) == false) goto L184;
        int r110 = 1048576;
    L185:
        $dirty4 = $dirty4 | r110;
    L184:
        r110 = 524288;
    L188:
        if (($changed1 & 12582912) != 0) goto L199;
        if ((r67 & 131072) != 0) goto L195;
        if ($composer2.changed(contentColor) == false) goto L195;
        int r111 = 8388608;
    L196:
        $dirty4 = $dirty4 | r111;
    L195:
        r111 = 4194304;
    L199:
        if ((r67 & 262144) == 0) goto L202;
        int $dirty5 = $dirty4 | 100663296;
    L210:
        if (($dirty & 306783379) == 306783378) goto L212;
    L215:
        boolean r4 = true;
    L217:
        if ($composer2.shouldExecute(r4, $dirty & 1) == false) goto L320;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "180@8570L23,189@9080L6,191@9195L6,192@9243L38,193@9328L10,194@9383L6,195@9428L32");
        if (($changed & 1) != 0) goto L221;
    L245:
        if (r64 == 0) goto L248;
        modifier2 = Modifier.Companion;
    L248:
        if ((r67 & 4) == 0) goto L250;
        $dirty = $dirty & (-897);
        scaffoldState2 = rememberScaffoldState(null, null, $composer2, 0, 3);
    L250:
        if (r16 == 0) goto L252;
        r8 = ComposableSingletons$ScaffoldKt.INSTANCE.m1627getLambda1$material_release();
    L252:
        if (r19 == 0) goto L254;
        r10 = ComposableSingletons$ScaffoldKt.INSTANCE.m1628getLambda2$material_release();
    L254:
        if (r23 == 0) goto L256;
        r11 = ComposableSingletons$ScaffoldKt.INSTANCE.m1629getLambda3$material_release();
    L256:
        if (r28 == 0) goto L258;
        r14 = ComposableSingletons$ScaffoldKt.INSTANCE.m1630getLambda4$material_release();
    L258:
        if (r15 == 0) goto L260;
        floatingActionButtonPosition2 = FabPosition.Companion.m1677getEnd5ygKITE();
    L260:
        if (r0 == 0) goto L262;
        boolean isFloatingActionButtonDocked2 = false;
    L263:
        if (r1 == 0) goto L265;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r5 = null;
    L266:
        if (r2 == 0) goto L268;
        boolean drawerGesturesEnabled2 = true;
    L270:
        if ((r67 & 2048) == 0) goto L272;
        CornerBasedShape drawerShape2 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getLarge();
        int $dirty6 = $dirty5 & (-113);
    L273:
        if (r24 == 0) goto L275;
        float drawerElevation2 = DrawerDefaults.INSTANCE.m1646getElevationD9Ej5fM();
    L277:
        if ((r67 & 8192) == 0) goto L279;
        long drawerBackgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
        $dirty6 = $dirty6 & (-7169);
    L281:
        if ((r67 & 16384) == 0) goto L283;
        long drawerContentColor2 = ColorsKt.m1616contentColorForek8zF_U(drawerBackgroundColor2, $composer2, ($dirty6 >> 9) & 14);
        $dirty6 = $dirty6 & (-57345);
    L285:
        if ((32768 & r67) == 0) goto L287;
        int r6 = 6;
        long drawerScrimColor2 = DrawerDefaults.INSTANCE.getScrimColor($composer2, 6);
        $dirty6 = $dirty6 & (-458753);
    L289:
        if ((r67 & 65536) == 0) goto L291;
        $dirty6 = $dirty6 & (-3670017);
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, r6).m1591getBackground0d7_KjU();
    L293:
        if ((r67 & 131072) == 0) goto L295;
        int $dirty7 = $dirty6 & (-29360129);
        isFloatingActionButtonDocked = isFloatingActionButtonDocked2;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty6 >> 18) & 14);
        long backgroundColor3 = backgroundColor2;
        boolean drawerGesturesEnabled3 = drawerGesturesEnabled2;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r9 = r5;
    L296:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L300;
        ComposerKt.traceEventStart(-1288630565, $dirty, $dirty7, "androidx.compose.material.Scaffold (Scaffold.kt:197)");
    L300:
        ComposerKt.sourceInformationMarkerStart($composer2, -1364486362, "CC(remember):Scaffold.kt#9igjgp");
        if (($dirty & 14) != 4) goto L303;
        boolean invalid$iv = true;
    L304:
        int $dirty8 = $dirty7;
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L311;
        if (value$iv == Composer.Companion.getEmpty()) goto L311;
    L312:
        final MutableWindowInsets safeInsets = (MutableWindowInsets) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Function2<? super Composer, ? super Integer, Unit> r50 = r8;
        final int floatingActionButtonPosition3 = floatingActionButtonPosition2;
        final Function2<? super Composer, ? super Integer, Unit> r53 = r10;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r54 = r11;
        final ScaffoldState scaffoldState3 = scaffoldState2;
        final Function2<? super Composer, ? super Integer, Unit> r52 = r14;
        final long backgroundColor4 = backgroundColor3;
        final long contentColor3 = contentColor2;
        boolean isFloatingActionButtonDocked3 = isFloatingActionButtonDocked;
        final Function3 child = ComposableLambdaKt.rememberComposableLambda(-219833176, true, new ScaffoldKt$Scaffold$child$1(safeInsets, contentWindowInsets, backgroundColor4, contentColor3, isFloatingActionButtonDocked, floatingActionButtonPosition3, r50, r63, r52, r53, r54, scaffoldState3), $composer2, 54);
        if (r9 == 0) goto L315;
        $composer2.startReplaceGroup(651765711);
        ComposerKt.sourceInformation($composer2, "235@11170L19,225@10712L487");
        long drawerBackgroundColor3 = drawerBackgroundColor2;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r41 = r9;
        boolean drawerGesturesEnabled4 = drawerGesturesEnabled3;
        Modifier modifier3 = modifier2;
        DrawerKt.m1649ModalDrawerGs3lGvM(r41, modifier3, scaffoldState2.getDrawerState(), drawerGesturesEnabled4, drawerShape2, drawerElevation2, drawerBackgroundColor3, drawerContentColor2, drawerScrimColor2, ComposableLambdaKt.rememberComposableLambda(-1409196448, true, new ScaffoldKt$Scaffold$1(child), $composer2, 54), $composer2, ((((((((($dirty >> 27) & 14) | 805306368) | ($dirty & 112)) | (($dirty8 << 9) & 7168)) | (($dirty8 << 9) & 57344)) | (($dirty8 << 9) & 458752)) | (($dirty8 << 9) & 3670016)) | (($dirty8 << 9) & 29360128)) | (234881024 & ($dirty8 << 9)), 0);
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r12 = r41;
        boolean drawerGesturesEnabled5 = drawerGesturesEnabled4;
        drawerBackgroundColor2 = drawerBackgroundColor3;
        Composer $composer3 = $composer2;
        $composer3.endReplaceGroup();
    L317:
        if (ComposerKt.isTraceInProgress() == false) goto L319;
        ComposerKt.traceEventEnd();
    L319:
        final Function2<? super Composer, ? super Integer, Unit> r13 = r8;
        final int floatingActionButtonPosition4 = floatingActionButtonPosition2;
        final boolean isFloatingActionButtonDocked4 = isFloatingActionButtonDocked3;
        Function2<? super Composer, ? super Integer, Unit> r39 = r10;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r112 = r12;
        final Modifier modifier4 = modifier2;
        final Shape drawerShape3 = drawerShape2;
        final Function2<? super Composer, ? super Integer, Unit> r21 = r14;
        final long drawerBackgroundColor4 = drawerBackgroundColor2;
        final Function2<? super Composer, ? super Integer, Unit> r25 = r39;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r26 = r11;
        final boolean drawerGesturesEnabled6 = drawerGesturesEnabled5;
        final ScaffoldState scaffoldState4 = scaffoldState2;
        final float drawerElevation3 = drawerElevation2;
        final long drawerContentColor3 = drawerContentColor2;
        final long drawerScrimColor3 = drawerScrimColor2;
        final long backgroundColor5 = backgroundColor3;
        final long contentColor4 = contentColor2;
    L321:
        ScopeUpdateScope r27 = $composer3.endRestartGroup();
        if (r27 == null) goto L325;
        r27.updateScope(new ScaffoldKt$Scaffold$2(contentWindowInsets, modifier4, scaffoldState4, r13, r25, r26, r21, floatingActionButtonPosition4, isFloatingActionButtonDocked4, r112, drawerGesturesEnabled6, drawerShape3, drawerElevation3, drawerBackgroundColor4, drawerContentColor3, drawerScrimColor3, backgroundColor5, contentColor4, r63, $changed, $changed1, r67));
        return;
    L325:
        return;
    L315:
        r12 = r9;
        drawerGesturesEnabled5 = drawerGesturesEnabled3;
        $composer3 = $composer2;
        $composer3.startReplaceGroup(652256007);
        ComposerKt.sourceInformation($composer3, "238@11221L15");
        child.invoke(modifier2, $composer3, Integer.valueOf((($dirty >> 3) & 14) | 48));
        $composer3.endReplaceGroup();
    L311:
        value$iv = new MutableWindowInsets(contentWindowInsets);
        $composer2.updateRememberedValue(value$iv);
        goto L312
    L303:
        invalid$iv = false;
        goto L304
    L295:
        isFloatingActionButtonDocked = isFloatingActionButtonDocked2;
        contentColor2 = contentColor;
        backgroundColor3 = backgroundColor2;
        $dirty7 = $dirty6;
        drawerGesturesEnabled3 = drawerGesturesEnabled2;
        r9 = r5;
        goto L296
    L291:
        backgroundColor2 = backgroundColor;
        goto L293
    L287:
        r6 = 6;
        drawerScrimColor2 = drawerScrimColor;
        goto L289
    L283:
        drawerContentColor2 = drawerContentColor;
        goto L285
    L279:
        drawerBackgroundColor2 = drawerBackgroundColor;
        goto L281
    L275:
        drawerElevation2 = drawerElevation;
        goto L277
    L272:
        drawerShape2 = drawerShape;
        $dirty6 = $dirty5;
        goto L273
    L268:
        drawerGesturesEnabled2 = drawerGesturesEnabled;
        goto L270
    L265:
        r5 = r49;
        goto L266
    L262:
        isFloatingActionButtonDocked2 = isFloatingActionButtonDocked;
        goto L263
    L221:
        if ($composer2.getDefaultsInvalid() == true) goto L245;
        $composer2.skipToGroupEnd();
        if ((r67 & 4) == 0) goto L227;
        $dirty = $dirty & (-897);
    L227:
        if ((r67 & 2048) == 0) goto L229;
        $dirty5 = $dirty5 & (-113);
    L229:
        $dirty7 = $dirty5;
        if ((r67 & 8192) == 0) goto L233;
        $dirty7 = $dirty7 & (-7169);
    L233:
        if ((r67 & 16384) == 0) goto L236;
        $dirty7 = $dirty7 & (-57345);
    L236:
        if ((32768 & r67) == 0) goto L239;
        $dirty7 = $dirty7 & (-458753);
    L239:
        if ((r67 & 65536) == 0) goto L242;
        $dirty7 = $dirty7 & (-3670017);
    L242:
        if ((r67 & 131072) == 0) goto L244;
        $dirty7 = $dirty7 & (-29360129);
    L244:
        r9 = r49;
        drawerGesturesEnabled3 = drawerGesturesEnabled;
        drawerShape2 = drawerShape;
        drawerElevation2 = drawerElevation;
        drawerContentColor2 = drawerContentColor;
        drawerScrimColor2 = drawerScrimColor;
        backgroundColor3 = backgroundColor;
        contentColor2 = contentColor;
        $dirty = $dirty;
        drawerBackgroundColor2 = drawerBackgroundColor;
        goto L296
    L320:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        drawerScrimColor3 = drawerScrimColor;
        backgroundColor5 = backgroundColor;
        contentColor4 = contentColor;
        r13 = r8;
        floatingActionButtonPosition4 = floatingActionButtonPosition2;
        r25 = r10;
        r26 = r11;
        modifier4 = modifier2;
        scaffoldState4 = scaffoldState2;
        r21 = r14;
        isFloatingActionButtonDocked4 = isFloatingActionButtonDocked;
        r112 = r49;
        drawerGesturesEnabled6 = drawerGesturesEnabled;
        drawerShape3 = drawerShape;
        drawerElevation3 = drawerElevation;
        drawerBackgroundColor4 = drawerBackgroundColor;
        drawerContentColor3 = drawerContentColor;
        goto L321
    L212:
        if (($dirty5 & 38347923) != 38347922) goto L215;
        r4 = false;
        goto L217
    L202:
        if (($changed1 & 100663296) != 0) goto L208;
        int $dirty9 = $dirty4;
        if ($composer2.changedInstance(r63) == false) goto L206;
        int r113 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L207:
        $dirty5 = $dirty9 | r113;
        goto L210
    L206:
        r113 = 33554432;
        goto L207
    L208:
        $dirty5 = $dirty4;
        goto L210
    L157:
        if ((r67 & 16384) != 0) goto L162;
        if ($composer2.changed(drawerContentColor) == false) goto L162;
    L163:
        $dirty4 = $dirty3 | r20;
    L162:
        r20 = 8192;
        goto L163
    L147:
        if ((r67 & 8192) != 0) goto L151;
        int $dirty10 = $dirty1;
        r64 = r7;
        if ($composer2.changed(drawerBackgroundColor) == false) goto L152;
        r17 = 2048;
    L152:
        $dirty2 = $dirty10 | r17;
        goto L154
    L151:
        $dirty10 = $dirty1;
        r64 = r7;
        goto L152
    L136:
        r24 = r3;
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(drawerElevation) == false) goto L141;
        int r29 = 256;
    L142:
        $dirty1 = $dirty1 | r29;
        goto L145
    L141:
        r29 = 128;
        goto L142
    L115:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(drawerGesturesEnabled) == false) goto L119;
        int r36 = 4;
    L120:
        $dirty1 = $dirty1 | r36;
        goto L123
    L119:
        r36 = 2;
        goto L120
    L104:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changedInstance(r49) == false) goto L108;
        int r35 = 536870912;
    L109:
        $dirty = $dirty | r35;
        goto L111
    L108:
        r35 = 268435456;
        goto L109
    L93:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changed(isFloatingActionButtonDocked) == false) goto L97;
        int r34 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r34;
        goto L100
    L97:
        r34 = 33554432;
        goto L98
    L82:
        if (($changed & 12582912) != 0) goto L88;
        floatingActionButtonPosition2 = floatingActionButtonPosition;
        if ($composer2.changed(floatingActionButtonPosition2) == false) goto L86;
        int r32 = 8388608;
    L87:
        $dirty = $dirty | r32;
        goto L89
    L86:
        r32 = 4194304;
        goto L87
    L88:
        floatingActionButtonPosition2 = floatingActionButtonPosition;
        goto L89
    L71:
        if (($changed & 1572864) != 0) goto L77;
        r14 = r46;
        if ($composer2.changedInstance(r14) == false) goto L75;
        int r30 = 1048576;
    L76:
        $dirty = $dirty | r30;
        goto L78
    L75:
        r30 = 524288;
        goto L76
    L77:
        r14 = r46;
        goto L78
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        r11 = r45;
        if ($composer2.changedInstance(r11) == false) goto L64;
        int r210 = 131072;
    L65:
        $dirty = $dirty | r210;
        goto L67
    L64:
        r210 = 65536;
        goto L65
    L66:
        r11 = r45;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        r10 = r44;
        if ($composer2.changedInstance(r10) == false) goto L53;
        int r211 = 16384;
    L54:
        $dirty = $dirty | r211;
        goto L56
    L53:
        r211 = 8192;
        goto L54
    L55:
        r10 = r44;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r8 = r43;
        if ($composer2.changedInstance(r8) == false) goto L42;
        int r114 = 2048;
    L43:
        $dirty = $dirty | r114;
        goto L45
    L42:
        r114 = 1024;
        goto L43
    L44:
        r8 = r43;
        goto L45
    L26:
        if ((r67 & 4) != 0) goto L30;
        scaffoldState2 = scaffoldState;
        if ($composer2.changed(scaffoldState2) == false) goto L31;
        int r115 = 256;
    L32:
        $dirty = $dirty | r115;
    L31:
        r115 = 128;
        goto L32
    L30:
        scaffoldState2 = scaffoldState;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r116 = 32;
    L21:
        $dirty = $dirty | r116;
        goto L24
    L20:
        r116 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(contentWindowInsets) == false) goto L10;
        int r31 = 4;
    L11:
        $dirty = $dirty | r31;
        goto L12
    L10:
        r31 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: Scaffold-27mzLpw, reason: not valid java name */
    public static final void m1749Scaffold27mzLpw(Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> r40, Function2<? super Composer, ? super Integer, Unit> r41, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r42, Function2<? super Composer, ? super Integer, Unit> r43, int floatingActionButtonPosition, boolean isFloatingActionButtonDocked, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r46, boolean drawerGesturesEnabled, Shape drawerShape, float drawerElevation, long drawerBackgroundColor, long drawerContentColor, long drawerScrimColor, long backgroundColor, long contentColor, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> r60, Composer $composer, final int $changed, final int $changed1, final int r64) {
        Composer $composer2 = $composer.startRestartGroup(1037492569);
        ComposerKt.sourceInformation($composer2, "C(Scaffold)P(14,15,17,1,16,11,12:c#material.FabPosition,13,5,8,10,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,9:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color)324@16098L495:Scaffold.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        int r6 = r64 & 1;
        if (r6 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        ScaffoldState scaffoldState2 = scaffoldState;
    L24:
        int r13 = r64 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r7 = r40;
    L35:
        int r16 = r64 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r8 = r41;
    L46:
        int r20 = r64 & 16;
        int r21 = 16384;
        if (r20 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r11 = r42;
    L57:
        int r24 = r64 & 32;
        if (r24 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r12 = r43;
    L68:
        int r29 = r64 & 64;
        if (r29 == 0) goto L72;
        $dirty = $dirty | 1572864;
        int floatingActionButtonPosition2 = floatingActionButtonPosition;
    L79:
        int r15 = r64 & 128;
        if (r15 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r0 = r64 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r1 = r64 & 512;
        if (r1 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L113:
        if (($changed1 & 6) != 0) goto L123;
        if ((r64 & 1024) != 0) goto L120;
        if ($composer2.changed(drawerShape) == false) goto L120;
        int r19 = 4;
    L121:
        $dirty1 = $dirty1 | r19;
    L120:
        r19 = 2;
    L123:
        int r2 = r64 & 2048;
        if (r2 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L135:
        if (($changed1 & 384) == 0) goto L137;
        int $dirty2 = $dirty;
        int $dirty3 = $dirty1;
    L145:
        int $dirty4 = $dirty3;
        if (($changed1 & 3072) == 0) goto L148;
        long r4 = drawerContentColor;
        int $dirty5 = $dirty4;
    L156:
        int $dirty6 = $dirty5;
        if (($changed1 & 24576) != 0) goto L168;
        if ((r64 & 16384) != 0) goto L164;
        if ($composer2.changed(drawerScrimColor) == false) goto L164;
    L165:
        $dirty6 = $dirty6 | r21;
    L164:
        r21 = 8192;
    L168:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L179;
        if ((r64 & 32768) != 0) goto L175;
        if ($composer2.changed(backgroundColor) == false) goto L175;
        int r18 = 131072;
    L176:
        $dirty6 = $dirty6 | r18;
    L175:
        r18 = 65536;
    L179:
        if (($changed1 & 1572864) != 0) goto L190;
        if ((r64 & 65536) != 0) goto L186;
        if ($composer2.changed(contentColor) == false) goto L186;
        int r110 = 1048576;
    L187:
        $dirty6 = $dirty6 | r110;
    L186:
        r110 = 524288;
    L190:
        if ((r64 & 131072) == 0) goto L193;
        $dirty6 = $dirty6 | 12582912;
    L201:
        if (($dirty2 & 306783379) == 306783378) goto L203;
    L206:
        boolean r3 = true;
    L208:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == false) goto L296;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "306@15149L23,315@15659L6,317@15774L6,318@15822L38,319@15907L10,320@15962L6,321@16007L32");
        if (($changed & 1) != 0) goto L212;
    L237:
        if (r6 == 0) goto L240;
        modifier2 = Modifier.Companion;
    L240:
        if ((r64 & 2) == 0) goto L242;
        int $dirty7 = $dirty2 & (-113);
        scaffoldState2 = rememberScaffoldState(null, null, $composer2, 0, 3);
    L243:
        if (r13 == 0) goto L245;
        r7 = ComposableSingletons$ScaffoldKt.INSTANCE.m1631getLambda5$material_release();
    L245:
        if (r16 == 0) goto L247;
        r8 = ComposableSingletons$ScaffoldKt.INSTANCE.m1632getLambda6$material_release();
    L247:
        if (r20 == 0) goto L249;
        r11 = ComposableSingletons$ScaffoldKt.INSTANCE.m1633getLambda7$material_release();
    L249:
        if (r24 == 0) goto L251;
        r12 = ComposableSingletons$ScaffoldKt.INSTANCE.m1634getLambda8$material_release();
    L251:
        if (r29 == 0) goto L253;
        floatingActionButtonPosition2 = FabPosition.Companion.m1677getEnd5ygKITE();
    L253:
        if (r15 == 0) goto L255;
        boolean isFloatingActionButtonDocked2 = false;
    L256:
        if (r0 == 0) goto L258;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r5 = null;
    L259:
        if (r1 == 0) goto L261;
        boolean drawerGesturesEnabled2 = true;
    L263:
        if ((r64 & 1024) == 0) goto L265;
        CornerBasedShape drawerShape2 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getLarge();
        int $dirty8 = $dirty6 & (-15);
    L266:
        if (r2 == 0) goto L268;
        float drawerElevation2 = DrawerDefaults.INSTANCE.m1646getElevationD9Ej5fM();
    L270:
        if ((r64 & 4096) == 0) goto L272;
        $dirty8 = $dirty8 & (-897);
        long drawerBackgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
    L274:
        if ((r64 & 8192) == 0) goto L276;
        long drawerContentColor2 = ColorsKt.m1616contentColorForek8zF_U(drawerBackgroundColor2, $composer2, ($dirty8 >> 6) & 14);
        $dirty8 = $dirty8 & (-7169);
    L278:
        if ((r64 & 16384) == 0) goto L280;
        long drawerScrimColor2 = DrawerDefaults.INSTANCE.getScrimColor($composer2, 6);
        $dirty8 = $dirty8 & (-57345);
    L282:
        if ((32768 & r64) == 0) goto L284;
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1591getBackground0d7_KjU();
        $dirty8 = $dirty8 & (-458753);
    L286:
        if ((r64 & 65536) == 0) goto L288;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty8 >> 15) & 14);
        int r14 = (-3670017) & $dirty8;
        int $dirty9 = floatingActionButtonPosition2;
        boolean drawerGesturesEnabled3 = drawerGesturesEnabled2;
        Modifier modifier3 = modifier2;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r9 = r11;
        int floatingActionButtonPosition3 = $dirty9;
        long drawerBackgroundColor3 = drawerContentColor2;
        long drawerContentColor3 = drawerBackgroundColor2;
        Shape drawerShape3 = drawerShape2;
        ScaffoldState scaffoldState3 = scaffoldState2;
        Function2<? super Composer, ? super Integer, Unit> r10 = r12;
        long contentColor3 = contentColor2;
        boolean isFloatingActionButtonDocked3 = isFloatingActionButtonDocked2;
        long backgroundColor3 = backgroundColor2;
        int $dirty10 = $dirty7;
        int $dirty11 = r14;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r111 = r5;
    L289:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L292;
        ComposerKt.traceEventStart(1037492569, $dirty10, $dirty11, "androidx.compose.material.Scaffold (Scaffold.kt:323)");
    L292:
        int $dirty12 = $dirty10;
        Composer $composer3 = $composer2;
        m1750Scaffoldu4IkXBM(WindowInsetsKt.m797WindowInsetsa9UjIt4$default(Dp.m6973constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null), modifier3, scaffoldState3, r7, r8, r9, r10, floatingActionButtonPosition3, isFloatingActionButtonDocked3, r111, drawerGesturesEnabled3, drawerShape3, drawerElevation2, drawerContentColor3, drawerBackgroundColor3, drawerScrimColor2, backgroundColor3, contentColor3, r60, $composer3, ((((((((($dirty12 << 3) & 112) | (($dirty12 << 3) & 896)) | (($dirty12 << 3) & 7168)) | (($dirty12 << 3) & 57344)) | (($dirty12 << 3) & 458752)) | (($dirty12 << 3) & 3670016)) | (($dirty12 << 3) & 29360128)) | (($dirty12 << 3) & 234881024)) | (($dirty12 << 3) & 1879048192), ((((((((($dirty12 >> 27) & 14) | (($dirty11 << 3) & 112)) | (($dirty11 << 3) & 896)) | (($dirty11 << 3) & 7168)) | (($dirty11 << 3) & 57344)) | (($dirty11 << 3) & 458752)) | (($dirty11 << 3) & 3670016)) | (($dirty11 << 3) & 29360128)) | (($dirty11 << 3) & 234881024), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L295;
        ComposerKt.traceEventEnd();
    L295:
        final Modifier modifier4 = modifier3;
        final ScaffoldState scaffoldState4 = scaffoldState3;
        final Function2<? super Composer, ? super Integer, Unit> r22 = r7;
        final Function2<? super Composer, ? super Integer, Unit> r23 = r8;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r25 = r9;
        final Function2<? super Composer, ? super Integer, Unit> r26 = r10;
        final int floatingActionButtonPosition4 = floatingActionButtonPosition3;
        final boolean isFloatingActionButtonDocked4 = isFloatingActionButtonDocked3;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r27 = r111;
        final boolean drawerGesturesEnabled4 = drawerGesturesEnabled3;
        final Shape drawerShape4 = drawerShape3;
        final float drawerElevation3 = drawerElevation2;
        final long drawerBackgroundColor4 = drawerContentColor3;
        final long drawerContentColor4 = drawerBackgroundColor3;
        final long drawerBackgroundColor5 = drawerScrimColor2;
        final long drawerContentColor5 = backgroundColor3;
        final long drawerScrimColor3 = contentColor3;
    L297:
        ScopeUpdateScope r28 = $composer3.endRestartGroup();
        if (r28 == null) goto L301;
        r28.updateScope(new ScaffoldKt$Scaffold$3(modifier4, scaffoldState4, r22, r23, r25, r26, floatingActionButtonPosition4, isFloatingActionButtonDocked4, r27, drawerGesturesEnabled4, drawerShape4, drawerElevation3, drawerBackgroundColor4, drawerContentColor4, drawerBackgroundColor5, drawerContentColor5, drawerScrimColor3, r60, $changed, $changed1, r64));
        return;
    L301:
        return;
    L288:
        int $dirty13 = floatingActionButtonPosition2;
        drawerGesturesEnabled3 = drawerGesturesEnabled2;
        modifier3 = modifier2;
        r9 = r11;
        floatingActionButtonPosition3 = $dirty13;
        drawerBackgroundColor3 = drawerContentColor2;
        drawerContentColor3 = drawerBackgroundColor2;
        r111 = r5;
        contentColor3 = contentColor;
        backgroundColor3 = backgroundColor2;
        $dirty10 = $dirty7;
        $dirty11 = $dirty8;
        drawerShape3 = drawerShape2;
        scaffoldState3 = scaffoldState2;
        r10 = r12;
        isFloatingActionButtonDocked3 = isFloatingActionButtonDocked2;
        goto L289
    L284:
        backgroundColor2 = backgroundColor;
        goto L286
    L280:
        drawerScrimColor2 = drawerScrimColor;
        goto L282
    L276:
        drawerContentColor2 = drawerContentColor;
        goto L278
    L272:
        drawerBackgroundColor2 = drawerBackgroundColor;
        goto L274
    L268:
        drawerElevation2 = drawerElevation;
        goto L270
    L265:
        drawerShape2 = drawerShape;
        $dirty8 = $dirty6;
        goto L266
    L261:
        drawerGesturesEnabled2 = drawerGesturesEnabled;
        goto L263
    L258:
        r5 = r46;
        goto L259
    L255:
        isFloatingActionButtonDocked2 = isFloatingActionButtonDocked;
        goto L256
    L242:
        $dirty7 = $dirty2;
        goto L243
    L212:
        if ($composer2.getDefaultsInvalid() == true) goto L237;
        $composer2.skipToGroupEnd();
        if ((r64 & 2) == 0) goto L217;
        $dirty10 = $dirty2 & (-113);
    L219:
        if ((r64 & 1024) == 0) goto L221;
        $dirty6 = $dirty6 & (-15);
    L221:
        $dirty11 = $dirty6;
        if ((r64 & 4096) == 0) goto L225;
        $dirty11 = $dirty11 & (-897);
    L225:
        if ((r64 & 8192) == 0) goto L228;
        $dirty11 = $dirty11 & (-7169);
    L228:
        if ((r64 & 16384) == 0) goto L231;
        $dirty11 = $dirty11 & (-57345);
    L231:
        if ((32768 & r64) == 0) goto L234;
        $dirty11 = $dirty11 & (-458753);
    L234:
        if ((r64 & 65536) == 0) goto L236;
        $dirty11 = $dirty11 & (-3670017);
    L236:
        r111 = r46;
        drawerShape3 = drawerShape;
        drawerElevation2 = drawerElevation;
        drawerContentColor3 = drawerBackgroundColor;
        drawerScrimColor2 = drawerScrimColor;
        backgroundColor3 = backgroundColor;
        contentColor3 = contentColor;
        drawerBackgroundColor3 = r4;
        modifier3 = modifier2;
        scaffoldState3 = scaffoldState2;
        r9 = r11;
        r10 = r12;
        floatingActionButtonPosition3 = floatingActionButtonPosition2;
        isFloatingActionButtonDocked3 = isFloatingActionButtonDocked;
        drawerGesturesEnabled3 = drawerGesturesEnabled;
        goto L289
    L217:
        $dirty10 = $dirty2;
        goto L219
    L296:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        drawerContentColor4 = drawerContentColor;
        drawerContentColor5 = backgroundColor;
        drawerScrimColor3 = contentColor;
        r22 = r7;
        r23 = r8;
        modifier4 = modifier2;
        scaffoldState4 = scaffoldState2;
        r25 = r11;
        r26 = r12;
        floatingActionButtonPosition4 = floatingActionButtonPosition2;
        isFloatingActionButtonDocked4 = isFloatingActionButtonDocked;
        r27 = r46;
        drawerGesturesEnabled4 = drawerGesturesEnabled;
        drawerShape4 = drawerShape;
        drawerElevation3 = drawerElevation;
        drawerBackgroundColor4 = drawerBackgroundColor;
        drawerBackgroundColor5 = drawerScrimColor;
        goto L297
    L203:
        if (($dirty6 & 4793491) != 4793490) goto L206;
        r3 = false;
        goto L208
    L193:
        if (($changed1 & 12582912) != 0) goto L201;
        if ($composer2.changedInstance(r60) == false) goto L197;
        int r30 = 8388608;
    L198:
        $dirty6 = $dirty6 | r30;
        goto L201
    L197:
        r30 = 4194304;
        goto L198
    L148:
        if ((r64 & 8192) != 0) goto L152;
        r4 = drawerContentColor;
        if ($composer2.changed(r4) == true) goto L154;
    L153:
        r17 = 1024;
    L154:
        $dirty5 = $dirty4 | r17;
        goto L156
    L152:
        r4 = drawerContentColor;
        goto L153
    L137:
        if ((r64 & 4096) != 0) goto L141;
        $dirty2 = $dirty;
        int $dirty14 = $dirty1;
        if ($composer2.changed(drawerBackgroundColor) == false) goto L142;
        int r31 = 256;
    L143:
        $dirty3 = $dirty14 | r31;
    L142:
        r31 = 128;
        goto L143
    L141:
        $dirty2 = $dirty;
        $dirty14 = $dirty1;
        goto L142
    L127:
        if (($changed1 & 48) != 0) goto L135;
        if ($composer2.changed(drawerElevation) == false) goto L131;
        int r210 = 32;
    L132:
        $dirty1 = $dirty1 | r210;
        goto L135
    L131:
        r210 = 16;
        goto L132
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changed(drawerGesturesEnabled) == false) goto L109;
        int r36 = 536870912;
    L110:
        $dirty = $dirty | r36;
        goto L113
    L109:
        r36 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r46) == false) goto L98;
        int r35 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r35;
        goto L101
    L98:
        r35 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(isFloatingActionButtonDocked) == false) goto L87;
        int r34 = 8388608;
    L88:
        $dirty = $dirty | r34;
        goto L90
    L87:
        r34 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L78;
        floatingActionButtonPosition2 = floatingActionButtonPosition;
        if ($composer2.changed(floatingActionButtonPosition2) == false) goto L76;
        int r32 = 1048576;
    L77:
        $dirty = $dirty | r32;
        goto L79
    L76:
        r32 = 524288;
        goto L77
    L78:
        floatingActionButtonPosition2 = floatingActionButtonPosition;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r12 = r43;
        if ($composer2.changedInstance(r12) == false) goto L65;
        int r211 = 131072;
    L66:
        $dirty = $dirty | r211;
        goto L68
    L65:
        r211 = 65536;
        goto L66
    L67:
        r12 = r43;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r11 = r42;
        if ($composer2.changedInstance(r11) == false) goto L54;
        int r212 = 16384;
    L55:
        $dirty = $dirty | r212;
        goto L57
    L54:
        r212 = 8192;
        goto L55
    L56:
        r11 = r42;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = r41;
        if ($composer2.changedInstance(r8) == false) goto L43;
        int r213 = 2048;
    L44:
        $dirty = $dirty | r213;
        goto L46
    L43:
        r213 = 1024;
        goto L44
    L45:
        r8 = r41;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r7 = r40;
        if ($composer2.changedInstance(r7) == false) goto L32;
        int r112 = 256;
    L33:
        $dirty = $dirty | r112;
        goto L35
    L32:
        r112 = 128;
        goto L33
    L34:
        r7 = r40;
        goto L35
    L16:
        if ((r64 & 2) != 0) goto L20;
        scaffoldState2 = scaffoldState;
        if ($composer2.changed(scaffoldState2) == false) goto L21;
        int r113 = 32;
    L22:
        $dirty = $dirty | r113;
    L21:
        r113 = 16;
        goto L22
    L20:
        scaffoldState2 = scaffoldState;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r114 = 4;
    L11:
        $dirty = $dirty | r114;
        goto L14
    L10:
        r114 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }

    /* JADX INFO: renamed from: ScaffoldLayout-i1QSOvI, reason: not valid java name */
    private static final void m1751ScaffoldLayouti1QSOvI(final boolean isFabDocked, final int fabPosition, final Function2<? super Composer, ? super Integer, Unit> r28, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> r29, final Function2<? super Composer, ? super Integer, Unit> r30, final Function2<? super Composer, ? super Integer, Unit> r31, final WindowInsets contentWindowInsets, final Function2<? super Composer, ? super Integer, Unit> r33, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-468424875);
        ComposerKt.sourceInformation($composer2, "C(ScaffoldLayout)P(5,4:c#material.FabPosition,7,1,6,3,2)383@18273L626,399@18922L6942,399@18905L6959:Scaffold.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        boolean r2 = isFabDocked;
        if ($composer2.changed(r2) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
    L11:
        if (($changed & 48) != 0) goto L17;
        final int r15 = fabPosition;
        if ($composer2.changed(r15) == false) goto L15;
        int r5 = 32;
    L16:
        $dirty = $dirty | r5;
    L19:
        if (($changed & 384) != 0) goto L25;
        final Function2<? super Composer, ? super Integer, Unit> r12 = r28;
        if ($composer2.changedInstance(r12) == false) goto L23;
        int r6 = 256;
    L24:
        $dirty = $dirty | r6;
    L27:
        if (($changed & 3072) != 0) goto L33;
        Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> r7 = r29;
        if ($composer2.changedInstance(r7) == false) goto L31;
        int r8 = 2048;
    L32:
        $dirty = $dirty | r8;
    L35:
        if (($changed & 24576) != 0) goto L41;
        final Function2<? super Composer, ? super Integer, Unit> r13 = r30;
        if ($composer2.changedInstance(r13) == false) goto L39;
        int r9 = 16384;
    L40:
        $dirty = $dirty | r9;
    L43:
        if ((196608 & $changed) != 0) goto L49;
        Function2<? super Composer, ? super Integer, Unit> r10 = r31;
        if ($composer2.changedInstance(r10) == false) goto L47;
        int r16 = 131072;
    L48:
        $dirty = $dirty | r16;
    L51:
        if (($changed & 1572864) != 0) goto L57;
        WindowInsets r3 = contentWindowInsets;
        if ($composer2.changed(r3) == false) goto L55;
        int r17 = 1048576;
    L56:
        $dirty = $dirty | r17;
    L59:
        if (($changed & 12582912) != 0) goto L65;
        Function2<? super Composer, ? super Integer, Unit> r11 = r33;
        if ($composer2.changedInstance(r11) == false) goto L63;
        int r19 = 8388608;
    L64:
        $dirty = $dirty | r19;
    L67:
        if (($dirty & 4793491) == 4793490) goto L69;
        boolean r14 = true;
    L71:
        if ($composer2.shouldExecute(r14, $dirty & 1) == true) goto L73;
        $composer2.skipToGroupEnd();
    L122:
        ScopeUpdateScope r18 = $composer2.endRestartGroup();
        if (r18 == null) goto L126;
        r18.updateScope(new ScaffoldKt$ScaffoldLayout$2(isFabDocked, fabPosition, r28, r29, r30, r31, contentWindowInsets, r33, $changed));
        return;
    L126:
        return;
    L73:
        if (ComposerKt.isTraceInProgress() == false) goto L75;
        ComposerKt.traceEventStart(-468424875, $dirty, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:378)");
    L75:
        ComposerKt.sourceInformationMarkerStart($composer2, -771521224, "CC(remember):Scaffold.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L79;
        Object value$iv = new ScaffoldKt$ScaffoldLayout$contentPadding$1$1();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L79:
        final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 contentPadding = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -771494140, "CC(remember):Scaffold.kt#9igjgp");
        if (($dirty & 896) != 256) goto L82;
        boolean r20 = true;
    L84:
        if ((57344 & $dirty) != 16384) goto L86;
        boolean r21 = true;
    L87:
        boolean r22 = r20 | r21;
        if ((3670016 & $dirty) != 1048576) goto L90;
        boolean r23 = true;
    L91:
        boolean r24 = r22 | r23;
        if ((458752 & $dirty) != 131072) goto L94;
        boolean r25 = true;
    L95:
        boolean r26 = r24 | r25;
        if (($dirty & 112) != 32) goto L98;
        boolean r27 = true;
    L99:
        boolean r32 = r26 | r27;
        if (($dirty & 14) != 4) goto L102;
        boolean r34 = true;
    L103:
        boolean r35 = r32 | r34;
        if ((29360128 & $dirty) != 8388608) goto L106;
        boolean r36 = true;
    L107:
        boolean r37 = r35 | r36;
        if (($dirty & 7168) != 2048) goto L110;
        boolean r38 = true;
    L111:
        boolean invalid$iv = r37 | r38;
        Object value$iv2 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L114;
    L117:
        final boolean r110 = r2;
        final WindowInsets r111 = r3;
        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> r210 = r7;
        final Function2<? super Composer, ? super Integer, Unit> r112 = r11;
        int r39 = 0;
        final Function2<? super Composer, ? super Integer, Unit> r113 = r10;
        value$iv2 = (Function2) new ScaffoldKt$ScaffoldLayout$1$1(r12, r13, r113, r15, r110, r111, contentPadding, r112, r210);
        $composer2.updateRememberedValue(value$iv2);
    L118:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) value$iv2, $composer2, r39, 1);
        if (ComposerKt.isTraceInProgress() == false) goto L122;
        ComposerKt.traceEventEnd();
        goto L122
    L114:
        if (value$iv2 == Composer.Companion.getEmpty()) goto L117;
        r39 = 0;
        goto L118
    L110:
        r38 = false;
        goto L111
    L106:
        r36 = false;
        goto L107
    L102:
        r34 = false;
        goto L103
    L98:
        r27 = false;
        goto L99
    L94:
        r25 = false;
        goto L95
    L90:
        r23 = false;
        goto L91
    L86:
        r21 = false;
        goto L87
    L82:
        r20 = false;
        goto L84
    L69:
        r14 = false;
        goto L71
    L63:
        r19 = 4194304;
        goto L64
    L65:
        r11 = r33;
        goto L67
    L55:
        r17 = 524288;
        goto L56
    L57:
        r3 = contentWindowInsets;
        goto L59
    L47:
        r16 = 65536;
        goto L48
    L49:
        r10 = r31;
        goto L51
    L39:
        r9 = 8192;
        goto L40
    L41:
        r13 = r30;
        goto L43
    L31:
        r8 = 1024;
        goto L32
    L33:
        r7 = r29;
        goto L35
    L23:
        r6 = 128;
        goto L24
    L25:
        r12 = r28;
        goto L27
    L15:
        r5 = 16;
        goto L16
    L17:
        r15 = fabPosition;
        goto L19
    L7:
        r4 = 2;
        goto L8
    L9:
        r2 = isFabDocked;
        goto L11
    }

    static {
        LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(ScaffoldKt$LocalFabPlacement$1.INSTANCE);
        FabSpacing = Dp.m6973constructorimpl(16);
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
