package androidx.compose.material;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a©\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000123\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u009f\u0001\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r23\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "tabPositions", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "divider", "Lkotlin/Function0;", "tabs", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = 0.0f;
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = null;

    public static final /* synthetic */ float access$getScrollableTabRowMinimumTabWidth$p() {
        return ScrollableTabRowMinimumTabWidth;
    }

    public static final /* synthetic */ AnimationSpec access$getScrollableTabRowScrollSpec$p() {
        return ScrollableTabRowScrollSpec;
    }

    /* JADX INFO: renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    public static final void m1813TabRowpAZo6Ak(final int selectedTabIndex, Modifier modifier, long backgroundColor, long contentColor, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r31, Function2<? super Composer, ? super Integer, Unit> r32, final Function2<? super Composer, ? super Integer, Unit> r33, Composer $composer, final int $changed, final int r36) {
        Composer $composer2 = $composer.startRestartGroup(-249175289);
        ComposerKt.sourceInformation($composer2, "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)150@7337L1392,146@7206L1523:TabRow.kt#jmzs0o");
        int $dirty = $changed;
        if ((r36 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r36 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
    L24:
        if (($changed & 384) == 0) goto L26;
        long r6 = backgroundColor;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long r11 = contentColor;
    L45:
        int r8 = r36 & 16;
        if (r8 == 0) goto L49;
        $dirty = $dirty | 24576;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r13 = r31;
    L56:
        int r14 = r36 & 32;
        if (r14 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r15 = r32;
    L68:
        if ((r36 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
    L78:
        if (($dirty & 599187) == 599186) goto L80;
        boolean r0 = true;
    L82:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L119;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "137@6742L6,138@6791L32,140@6930L125");
        if (($changed & 1) != 0) goto L86;
    L95:
        if (r4 == 0) goto L97;
        Modifier.Companion modifier2 = Modifier.Companion;
    L99:
        if ((r36 & 4) == 0) goto L101;
        long backgroundColor2 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors($composer2, 6));
        $dirty = $dirty & (-897);
    L103:
        if ((r36 & 8) == 0) goto L105;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty >> 6) & 14);
        $dirty = $dirty & (-7169);
    L106:
        if (r8 == 0) goto L109;
        r13 = ComposableLambdaKt.rememberComposableLambda(-553782708, true, new TabRowKt$TabRow$1(selectedTabIndex), $composer2, 54);
    L109:
        if (r14 == 0) goto L111;
        int $dirty2 = $dirty;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r3 = r13;
        long backgroundColor3 = backgroundColor2;
        final Function2<? super Composer, ? super Integer, Unit> r5 = ComposableSingletons$TabRowKt.INSTANCE.m1636getLambda1$material_release();
        long contentColor3 = contentColor2;
        boolean r7 = true;
        Modifier modifier3 = modifier2;
    L112:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L115;
        ComposerKt.traceEventStart(-249175289, $dirty2, -1, "androidx.compose.material.TabRow (TabRow.kt:145)");
    L115:
        Composer $composer3 = $composer2;
        SurfaceKt.m1782SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier3), null, backgroundColor3, contentColor3, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1961746365, r7, new TabRowKt$TabRow$2(r33, r5, r3), $composer2, 54), $composer3, (($dirty2 & 896) | 1572864) | ($dirty2 & 7168), 50);
        if (ComposerKt.isTraceInProgress() == false) goto L118;
        ComposerKt.traceEventEnd();
    L118:
        final Modifier modifier4 = modifier3;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r9 = r3;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r5;
        final long backgroundColor4 = backgroundColor3;
        final long contentColor4 = contentColor3;
    L120:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L124;
        r16.updateScope(new TabRowKt$TabRow$3(selectedTabIndex, modifier4, backgroundColor4, contentColor4, r9, r10, r33, $changed, r36));
        return;
    L124:
        return;
    L111:
        $dirty2 = $dirty;
        r3 = r13;
        backgroundColor3 = backgroundColor2;
        modifier3 = modifier2;
        r5 = r15;
        contentColor3 = contentColor2;
        r7 = true;
        goto L112
    L105:
        contentColor2 = r11;
        goto L106
    L101:
        backgroundColor2 = r6;
        goto L103
    L97:
        modifier2 = modifier;
        goto L99
    L86:
        if ($composer2.getDefaultsInvalid() == true) goto L95;
        $composer2.skipToGroupEnd();
        if ((r36 & 4) == 0) goto L92;
        $dirty = $dirty & (-897);
    L92:
        if ((r36 & 8) == 0) goto L94;
        $dirty2 = $dirty & (-7169);
        r3 = r13;
        r5 = r15;
        modifier3 = modifier;
        backgroundColor3 = r6;
        contentColor3 = r11;
        r7 = true;
        goto L112
    L94:
        modifier3 = modifier;
        $dirty2 = $dirty;
        r3 = r13;
        r5 = r15;
        backgroundColor3 = r6;
        contentColor3 = r11;
        r7 = true;
        goto L112
    L119:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        backgroundColor4 = r6;
        contentColor4 = r11;
        modifier4 = modifier;
        r9 = r13;
        r10 = r15;
        goto L120
    L80:
        r0 = false;
        goto L82
    L71:
        if (($changed & 1572864) != 0) goto L78;
        if ($composer2.changedInstance(r33) == false) goto L75;
        int r17 = 1048576;
    L76:
        $dirty = $dirty | r17;
        goto L78
    L75:
        r17 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r15 = r32;
        if ($composer2.changedInstance(r15) == false) goto L64;
        int r18 = 131072;
    L65:
        $dirty = $dirty | r18;
        goto L68
    L64:
        r18 = 65536;
        goto L65
    L66:
        r15 = r32;
        goto L68
    L49:
        if (($changed & 24576) != 0) goto L55;
        r13 = r31;
        if ($composer2.changedInstance(r13) == false) goto L53;
        int r19 = 16384;
    L54:
        $dirty = $dirty | r19;
        goto L56
    L53:
        r19 = 8192;
        goto L54
    L55:
        r13 = r31;
        goto L56
    L37:
        if ((r36 & 8) != 0) goto L41;
        r11 = contentColor;
        if ($composer2.changed(r11) == false) goto L42;
        int r12 = 2048;
    L43:
        $dirty = $dirty | r12;
    L42:
        r12 = 1024;
        goto L43
    L41:
        r11 = contentColor;
        goto L42
    L26:
        if ((r36 & 4) != 0) goto L30;
        r6 = backgroundColor;
        if ($composer2.changed(r6) == false) goto L31;
        int r20 = 256;
    L32:
        $dirty = $dirty | r20;
    L31:
        r20 = 128;
        goto L32
    L30:
        r6 = backgroundColor;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(modifier) == false) goto L20;
        int r21 = 32;
    L21:
        $dirty = $dirty | r21;
        goto L24
    L20:
        r21 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(selectedTabIndex) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L12
    L10:
        r22 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    public static final void m1812ScrollableTabRowsKfQg0A(final int selectedTabIndex, Modifier modifier, long backgroundColor, long contentColor, float edgePadding, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r32, Function2<? super Composer, ? super Integer, Unit> r33, final Function2<? super Composer, ? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-1473476840);
        ComposerKt.sourceInformation($composer2, "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)237@11978L2927,237@11895L3010:TabRow.kt#jmzs0o");
        int $dirty = $changed;
        if ((r37 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r37 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
    L24:
        if (($changed & 384) == 0) goto L26;
        long r6 = backgroundColor;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long r8 = contentColor;
    L45:
        int r10 = r37 & 16;
        if (r10 == 0) goto L49;
        $dirty = $dirty | 24576;
        float r13 = edgePadding;
    L56:
        int r14 = r37 & 32;
        if (r14 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r15 = r32;
    L67:
        int r16 = r37 & 64;
        if (r16 == 0) goto L71;
        $dirty = $dirty | 1572864;
    L79:
        if ((r37 & 128) == 0) goto L82;
        $dirty = $dirty | 12582912;
    L90:
        if (($dirty & 4793491) == 4793490) goto L92;
        boolean r0 = true;
    L94:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L134;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "227@11369L6,228@11418L32,231@11619L125");
        if (($changed & 1) != 0) goto L98;
    L107:
        if (r4 == 0) goto L109;
        Modifier.Companion modifier2 = Modifier.Companion;
    L111:
        if ((r37 & 4) == 0) goto L113;
        long backgroundColor2 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors($composer2, 6));
        $dirty = $dirty & (-897);
    L115:
        if ((r37 & 8) == 0) goto L117;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty >> 6) & 14);
        $dirty = $dirty & (-7169);
    L118:
        if (r10 == 0) goto L120;
        float edgePadding2 = TabRowDefaults.INSTANCE.m1810getScrollableTabRowPaddingD9Ej5fM();
    L121:
        if (r14 == 0) goto L123;
        ComposableLambda r9 = ComposableLambdaKt.rememberComposableLambda(-655609869, true, new TabRowKt$ScrollableTabRow$1(selectedTabIndex), $composer2, 54);
    L124:
        if (r16 == 0) goto L126;
        Function2<? super Composer, ? super Integer, Unit> r11 = ComposableSingletons$TabRowKt.INSTANCE.m1637getLambda2$material_release();
        Modifier modifier3 = modifier2;
        long backgroundColor3 = backgroundColor2;
        int r5 = -1473476840;
        long contentColor3 = contentColor2;
    L127:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L130;
        ComposerKt.traceEventStart(r5, $dirty, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:236)");
    L130:
        final float edgePadding3 = edgePadding2;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r30 = r9;
        final Function2<? super Composer, ? super Integer, Unit> r29 = r11;
        Composer $composer3 = $composer2;
        SurfaceKt.m1782SurfaceFjzlyU(modifier3, null, backgroundColor3, contentColor3, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1455860572, true, new TabRowKt$ScrollableTabRow$2(edgePadding3, r34, r29, r30, selectedTabIndex), $composer2, 54), $composer3, ((1572864 | (($dirty >> 3) & 14)) | ($dirty & 896)) | ($dirty & 7168), 50);
        if (ComposerKt.isTraceInProgress() == false) goto L133;
        ComposerKt.traceEventEnd();
    L133:
        final float edgePadding4 = edgePadding2;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r12 = r9;
        final Function2<? super Composer, ? super Integer, Unit> r17 = r11;
        final Modifier modifier4 = modifier3;
        final long contentColor4 = contentColor3;
        final long backgroundColor4 = backgroundColor3;
    L135:
        ScopeUpdateScope r18 = $composer3.endRestartGroup();
        if (r18 == null) goto L139;
        r18.updateScope(new TabRowKt$ScrollableTabRow$3(selectedTabIndex, modifier4, backgroundColor4, contentColor4, edgePadding4, r12, r17, r34, $changed, r37));
        return;
    L139:
        return;
    L126:
        r11 = r33;
        modifier3 = modifier2;
        backgroundColor3 = backgroundColor2;
        r5 = -1473476840;
        contentColor3 = contentColor2;
        goto L127
    L123:
        r9 = r15;
        goto L124
    L120:
        edgePadding2 = r13;
        goto L121
    L117:
        contentColor2 = r8;
        goto L118
    L113:
        backgroundColor2 = r6;
        goto L115
    L109:
        modifier2 = modifier;
        goto L111
    L98:
        if ($composer2.getDefaultsInvalid() == true) goto L107;
        $composer2.skipToGroupEnd();
        if ((r37 & 4) == 0) goto L104;
        $dirty = $dirty & (-897);
    L104:
        if ((r37 & 8) == 0) goto L106;
        r11 = r33;
        $dirty = $dirty & (-7169);
        r5 = -1473476840;
        contentColor3 = r8;
        edgePadding2 = r13;
        r9 = r15;
        modifier3 = modifier;
        backgroundColor3 = r6;
        goto L127
    L106:
        r11 = r33;
        r5 = -1473476840;
        contentColor3 = r8;
        edgePadding2 = r13;
        r9 = r15;
        modifier3 = modifier;
        backgroundColor3 = r6;
        goto L127
    L134:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        backgroundColor4 = r6;
        edgePadding4 = r13;
        modifier4 = modifier;
        contentColor4 = r8;
        r12 = r15;
        r17 = r33;
        goto L135
    L92:
        r0 = false;
        goto L94
    L82:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r34) == false) goto L86;
        int r19 = 8388608;
    L87:
        $dirty = $dirty | r19;
        goto L90
    L86:
        r19 = 4194304;
        goto L87
    L71:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r33) == false) goto L75;
        int r110 = 1048576;
    L76:
        $dirty = $dirty | r110;
        goto L79
    L75:
        r110 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r15 = r32;
        if ($composer2.changedInstance(r15) == false) goto L64;
        int r111 = 131072;
    L65:
        $dirty = $dirty | r111;
        goto L67
    L64:
        r111 = 65536;
        goto L65
    L66:
        r15 = r32;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        r13 = edgePadding;
        if ($composer2.changed(r13) == false) goto L53;
        int r112 = 16384;
    L54:
        $dirty = $dirty | r112;
        goto L56
    L53:
        r112 = 8192;
        goto L54
    L55:
        r13 = edgePadding;
        goto L56
    L37:
        if ((r37 & 8) != 0) goto L41;
        r8 = contentColor;
        if ($composer2.changed(r8) == false) goto L42;
        int r113 = 2048;
    L43:
        $dirty = $dirty | r113;
    L42:
        r113 = 1024;
        goto L43
    L41:
        r8 = contentColor;
        goto L42
    L26:
        if ((r37 & 4) != 0) goto L30;
        r6 = backgroundColor;
        if ($composer2.changed(r6) == false) goto L31;
        int r20 = 256;
    L32:
        $dirty = $dirty | r20;
    L31:
        r20 = 128;
        goto L32
    L30:
        r6 = backgroundColor;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(modifier) == false) goto L20;
        int r7 = 32;
    L21:
        $dirty = $dirty | r7;
        goto L24
    L20:
        r7 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(selectedTabIndex) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L12
    L10:
        r21 = 2;
        goto L11
    }

    static {
        ScrollableTabRowMinimumTabWidth = Dp.m6973constructorimpl(90);
        ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    }
}
