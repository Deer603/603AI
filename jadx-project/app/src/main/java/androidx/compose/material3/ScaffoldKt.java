package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a±\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0013\b\u0002\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0013\b\u0002\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0087\u0001\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000e2\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0002\b\t2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material3/FabPosition;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScaffoldLayout", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScaffoldKt {
    private static final float FabSpacing = 0.0f;

    /* JADX INFO: renamed from: access$ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final /* synthetic */ void m2537access$ScaffoldLayoutFMILGgc(int fabPosition, Function2 topBar, Function3 content, Function2 snackbar, Function2 fab, WindowInsets contentWindowInsets, Function2 bottomBar, Composer $composer, int $changed) {
        m2536ScaffoldLayoutFMILGgc(fabPosition, topBar, content, snackbar, fab, contentWindowInsets, bottomBar, $composer, $changed);
    }

    public static final /* synthetic */ float access$getFabSpacing$p() {
        return FabSpacing;
    }

    /* JADX INFO: renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    public static final void m2535ScaffoldTvnljyQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r31, Function2<? super Composer, ? super Integer, Unit> r32, Function2<? super Composer, ? super Integer, Unit> r33, Function2<? super Composer, ? super Integer, Unit> r34, int floatingActionButtonPosition, long containerColor, long contentColor, WindowInsets contentWindowInsets, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> r41, Composer $composer, final int $changed, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(-1219521777);
        ComposerKt.sourceInformation($composer2, "C(Scaffold)P(7,9!1,8,5,6:c#material3.FabPosition,1:c#ui.graphics.Color,3:c#ui.graphics.Color,4)90@4654L11,91@4704L31,92@4794L19,95@4889L74,98@5047L224,104@5347L314,96@4968L693:Scaffold.kt#uh7d8r");
        int $dirty = $changed;
        int r3 = r44 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L13:
        int r5 = r44 & 2;
        if (r5 == 0) goto L17;
        $dirty = $dirty | 48;
        Function2<? super Composer, ? super Integer, Unit> r6 = r31;
    L24:
        int r7 = r44 & 4;
        if (r7 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r8 = r32;
    L35:
        int r9 = r44 & 8;
        if (r9 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r10 = r33;
    L46:
        int r11 = r44 & 16;
        if (r11 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r12 = r34;
    L57:
        int r15 = r44 & 32;
        if (r15 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L69:
        if (($changed & 1572864) == 0) goto L71;
        int $dirty2 = $dirty;
        int r42 = r3;
    L80:
        if (($changed & 12582912) != 0) goto L91;
        if ((r44 & 128) != 0) goto L87;
        if ($composer2.changed(contentColor) == false) goto L87;
        int r0 = 8388608;
    L88:
        $dirty2 = $dirty2 | r0;
    L87:
        r0 = 4194304;
    L91:
        if (($changed & 100663296) != 0) goto L102;
        if ((r44 & 256) != 0) goto L98;
        if ($composer2.changed(contentWindowInsets) == false) goto L98;
        int r21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty2 | r21;
    L98:
        r21 = 33554432;
    L102:
        if ((r44 & 512) == 0) goto L105;
        $dirty2 = $dirty2 | 805306368;
    L113:
        if (($dirty2 & 306783379) == 306783378) goto L115;
    L118:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L121;
    L133:
        if (r42 == 0) goto L135;
        modifier2 = Modifier.Companion;
    L135:
        if (r5 == 0) goto L137;
        r6 = ComposableSingletons$ScaffoldKt.INSTANCE.m2101getLambda1$material3_release();
    L137:
        if (r7 == 0) goto L139;
        r8 = ComposableSingletons$ScaffoldKt.INSTANCE.m2102getLambda2$material3_release();
    L139:
        if (r9 == 0) goto L141;
        r10 = ComposableSingletons$ScaffoldKt.INSTANCE.m2103getLambda3$material3_release();
    L141:
        if (r11 == 0) goto L143;
        r12 = ComposableSingletons$ScaffoldKt.INSTANCE.m2104getLambda4$material3_release();
    L143:
        if (r15 == 0) goto L145;
        final int floatingActionButtonPosition2 = FabPosition.Companion.m2232getEndERTFSPs();
    L147:
        if ((r44 & 64) == 0) goto L149;
        $dirty2 = $dirty2 & (-3670017);
        long containerColor2 = MaterialTheme.INSTANCE.getColorScheme($composer2, 6).m2019getBackground0d7_KjU();
    L151:
        if ((r44 & 128) == 0) goto L153;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty2 >> 18) & 14);
        $dirty2 = $dirty2 & (-29360129);
    L155:
        if ((r44 & 256) == 0) goto L157;
        final WindowInsets contentWindowInsets2 = ScaffoldDefaults.INSTANCE.getContentWindowInsets($composer2, 6);
        int $dirty3 = $dirty2 & (-234881025);
        long containerColor3 = containerColor2;
    L158:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L161;
        ComposerKt.traceEventStart(-1219521777, $dirty3, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
    L161:
        ComposerKt.sourceInformationMarkerStart($composer2, -1794939901, "CC(remember):Scaffold.kt#9igjgp");
        if (((234881024 & $dirty3) ^ 100663296) <= 67108864) goto L166;
        if ($composer2.changed(contentWindowInsets2) == false) goto L166;
    L167:
        boolean invalid$iv = true;
    L169:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L172;
    L175:
        Object value$iv = new MutableWindowInsets(contentWindowInsets2);
        $composer2.updateRememberedValue(value$iv);
    L176:
        final MutableWindowInsets safeInsets = (MutableWindowInsets) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1794934695, "CC(remember):Scaffold.kt#9igjgp");
        boolean r2 = $composer2.changed(safeInsets);
        if (((234881024 & $dirty3) ^ 100663296) <= 67108864) goto L181;
        if ($composer2.changed(contentWindowInsets2) == false) goto L181;
    L182:
        boolean r4 = true;
    L184:
        boolean invalid$iv2 = r2 | r4;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L191;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L191;
        Object value$iv2 = it$iv2;
    L192:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Function2<? super Composer, ? super Integer, Unit> r35 = r6;
        final Function2<? super Composer, ? super Integer, Unit> r37 = r8;
        final Function2<? super Composer, ? super Integer, Unit> r36 = r10;
        final Function2<? super Composer, ? super Integer, Unit> r38 = r12;
        int floatingActionButtonPosition3 = floatingActionButtonPosition2;
        long contentColor3 = contentColor2;
        Composer $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier2, (Function1) value$iv2), null, containerColor3, contentColor3, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1979205334, true, new ScaffoldKt$Scaffold$2(floatingActionButtonPosition2, r35, r41, r36, r38, safeInsets, r37), $composer2, 54), $composer3, ((($dirty3 >> 12) & 896) | 12582912) | (($dirty3 >> 12) & 7168), 114);
        if (ComposerKt.isTraceInProgress() == false) goto L195;
        ComposerKt.traceEventEnd();
    L195:
        final Modifier modifier3 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> r13 = r6;
        final WindowInsets contentWindowInsets3 = contentWindowInsets2;
        final Function2<? super Composer, ? super Integer, Unit> r14 = r10;
        final long contentColor4 = contentColor3;
        final int floatingActionButtonPosition4 = floatingActionButtonPosition3;
        final Function2<? super Composer, ? super Integer, Unit> r16 = r8;
        final long containerColor4 = containerColor3;
        final Function2<? super Composer, ? super Integer, Unit> r17 = r12;
    L196:
        ScopeUpdateScope r18 = $composer3.endRestartGroup();
        if (r18 == null) goto L200;
        r18.updateScope(new ScaffoldKt$Scaffold$3(modifier3, r13, r16, r14, r17, floatingActionButtonPosition4, containerColor4, contentColor4, contentWindowInsets3, r41, $changed, r44));
        return;
    L200:
        return;
    L191:
        value$iv2 = (Function1) new ScaffoldKt$Scaffold$1$1(safeInsets, contentWindowInsets2);
        $composer2.updateRememberedValue(value$iv2);
    L181:
        if (($dirty3 & 100663296) == 67108864) goto L182;
        r4 = false;
        goto L184
    L172:
        if (it$iv == Composer.Companion.getEmpty()) goto L175;
        value$iv = it$iv;
    L166:
        if (($dirty3 & 100663296) == 67108864) goto L167;
        invalid$iv = false;
        goto L169
    L157:
        contentWindowInsets2 = contentWindowInsets;
        $dirty3 = $dirty2;
        containerColor3 = containerColor2;
        goto L158
    L153:
        contentColor2 = contentColor;
        goto L155
    L149:
        containerColor2 = containerColor;
        goto L151
    L145:
        floatingActionButtonPosition2 = floatingActionButtonPosition;
        goto L147
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L133;
        $composer2.skipToGroupEnd();
        if ((r44 & 64) == 0) goto L127;
        $dirty2 = $dirty2 & (-3670017);
    L127:
        if ((r44 & 128) == 0) goto L130;
        $dirty2 = $dirty2 & (-29360129);
    L130:
        if ((r44 & 256) == 0) goto L132;
        contentColor2 = contentColor;
        contentWindowInsets2 = contentWindowInsets;
        $dirty3 = $dirty2 & (-234881025);
        floatingActionButtonPosition2 = floatingActionButtonPosition;
        containerColor3 = containerColor;
        goto L158
    L132:
        floatingActionButtonPosition2 = floatingActionButtonPosition;
        contentColor2 = contentColor;
        contentWindowInsets2 = contentWindowInsets;
        $dirty3 = $dirty2;
        containerColor3 = containerColor;
        goto L158
    L115:
        if ($composer2.getSkipping() == false) goto L118;
        $composer2.skipToGroupEnd();
        contentWindowInsets3 = contentWindowInsets;
        $composer3 = $composer2;
        modifier3 = modifier2;
        r13 = r6;
        r16 = r8;
        r14 = r10;
        floatingActionButtonPosition4 = floatingActionButtonPosition;
        containerColor4 = containerColor;
        contentColor4 = contentColor;
        r17 = r12;
        goto L196
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changedInstance(r41) == false) goto L109;
        int r22 = 536870912;
    L110:
        $dirty2 = $dirty2 | r22;
        goto L113
    L109:
        r22 = 268435456;
        goto L110
    L71:
        if ((r44 & 64) != 0) goto L75;
        int $dirty4 = $dirty;
        r42 = r3;
        if ($composer2.changed(containerColor) == false) goto L76;
        int r19 = 1048576;
    L77:
        $dirty2 = $dirty4 | r19;
    L76:
        r19 = 524288;
        goto L77
    L75:
        $dirty4 = $dirty;
        r42 = r3;
        goto L76
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L69;
        if ($composer2.changed(floatingActionButtonPosition) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L69
    L65:
        r110 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        r12 = r34;
        if ($composer2.changedInstance(r12) == false) goto L54;
        int r111 = 16384;
    L55:
        $dirty = $dirty | r111;
        goto L57
    L54:
        r111 = 8192;
        goto L55
    L56:
        r12 = r34;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r10 = r33;
        if ($composer2.changedInstance(r10) == false) goto L43;
        int r112 = 2048;
    L44:
        $dirty = $dirty | r112;
        goto L46
    L43:
        r112 = 1024;
        goto L44
    L45:
        r10 = r33;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r8 = r32;
        if ($composer2.changedInstance(r8) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
        goto L35
    L32:
        r20 = 128;
        goto L33
    L34:
        r8 = r32;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r6 = r31;
        if ($composer2.changedInstance(r6) == false) goto L21;
        int r23 = 32;
    L22:
        $dirty = $dirty | r23;
        goto L24
    L21:
        r23 = 16;
        goto L22
    L23:
        r6 = r31;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L13
    L10:
        r24 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L13
    }

    /* JADX INFO: renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    private static final void m2536ScaffoldLayoutFMILGgc(final int fabPosition, final Function2<? super Composer, ? super Integer, Unit> r21, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> r22, final Function2<? super Composer, ? super Integer, Unit> r23, final Function2<? super Composer, ? super Integer, Unit> r24, final WindowInsets contentWindowInsets, final Function2<? super Composer, ? super Integer, Unit> r26, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-975511942);
        ComposerKt.sourceInformation($composer2, "C(ScaffoldLayout)P(4:c#material3.FabPosition,6,1,5,3,2)139@6582L6951,139@6565L6968:Scaffold.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        final int r14 = fabPosition;
        if ($composer2.changed(r14) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
    L11:
        if (($changed & 48) != 0) goto L17;
        final Function2<? super Composer, ? super Integer, Unit> r11 = r21;
        if ($composer2.changedInstance(r11) == false) goto L15;
        int r3 = 32;
    L16:
        $dirty = $dirty | r3;
    L19:
        if (($changed & 384) != 0) goto L25;
        Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> r4 = r22;
        if ($composer2.changedInstance(r4) == false) goto L23;
        int r6 = 256;
    L24:
        $dirty = $dirty | r6;
    L27:
        if (($changed & 3072) != 0) goto L33;
        final Function2<? super Composer, ? super Integer, Unit> r12 = r23;
        if ($composer2.changedInstance(r12) == false) goto L31;
        int r7 = 2048;
    L32:
        $dirty = $dirty | r7;
    L35:
        if (($changed & 24576) != 0) goto L41;
        final Function2<? super Composer, ? super Integer, Unit> r13 = r24;
        if ($composer2.changedInstance(r13) == false) goto L39;
        int r8 = 16384;
    L40:
        $dirty = $dirty | r8;
    L43:
        if ((196608 & $changed) != 0) goto L49;
        WindowInsets r9 = contentWindowInsets;
        if ($composer2.changed(r9) == false) goto L47;
        int r16 = 131072;
    L48:
        $dirty = $dirty | r16;
    L51:
        if (($changed & 1572864) != 0) goto L57;
        Function2<? super Composer, ? super Integer, Unit> r5 = r26;
        if ($composer2.changedInstance(r5) == false) goto L55;
        int r17 = 1048576;
    L56:
        $dirty = $dirty | r17;
    L59:
        if (($dirty & 599187) != 599186) goto L65;
        if ($composer2.getSkipping() == false) goto L65;
        $composer2.skipToGroupEnd();
    L105:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L109;
        r10.updateScope(new ScaffoldKt$ScaffoldLayout$2(fabPosition, r21, r22, r23, r24, contentWindowInsets, r26, $changed));
        return;
    L109:
        return;
    L65:
        if (ComposerKt.isTraceInProgress() == false) goto L67;
        ComposerKt.traceEventStart(-975511942, $dirty, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
    L67:
        ComposerKt.sourceInformationMarkerStart($composer2, 1690368138, "CC(remember):Scaffold.kt#9igjgp");
        if (($dirty & 112) != 32) goto L70;
        boolean r0 = true;
    L72:
        if (($dirty & 7168) != 2048) goto L74;
        boolean r15 = true;
    L75:
        boolean r1 = r0 | r15;
        if ((458752 & $dirty) != 131072) goto L78;
        boolean r18 = true;
    L79:
        boolean r19 = r1 | r18;
        if ((57344 & $dirty) != 16384) goto L82;
        boolean r20 = true;
    L83:
        boolean r25 = r19 | r20;
        if (($dirty & 14) != 4) goto L86;
        boolean r27 = true;
    L87:
        boolean r28 = r25 | r27;
        if ((3670016 & $dirty) != 1048576) goto L90;
        boolean r29 = true;
    L91:
        boolean r30 = r28 | r29;
        if (($dirty & 896) != 256) goto L94;
        boolean r31 = true;
    L95:
        boolean invalid$iv = r30 | r31;
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L98;
    L101:
        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> r110 = r4;
        final Function2<? super Composer, ? super Integer, Unit> r111 = r5;
        int r32 = 0;
        final WindowInsets r112 = r9;
        value$iv = new ScaffoldKt$ScaffoldLayout$1$1(r11, r12, r13, r14, r112, r111, r110);
        $composer2.updateRememberedValue(value$iv);
    L102:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) value$iv, $composer2, r32, 1);
        if (ComposerKt.isTraceInProgress() == false) goto L105;
        ComposerKt.traceEventEnd();
        goto L105
    L98:
        if (value$iv == Composer.Companion.getEmpty()) goto L101;
        r32 = 0;
        goto L102
    L94:
        r31 = false;
        goto L95
    L90:
        r29 = false;
        goto L91
    L86:
        r27 = false;
        goto L87
    L82:
        r20 = false;
        goto L83
    L78:
        r18 = false;
        goto L79
    L74:
        r15 = false;
        goto L75
    L70:
        r0 = false;
        goto L72
    L55:
        r17 = 524288;
        goto L56
    L57:
        r5 = r26;
        goto L59
    L47:
        r16 = 65536;
        goto L48
    L49:
        r9 = contentWindowInsets;
        goto L51
    L39:
        r8 = 8192;
        goto L40
    L41:
        r13 = r24;
        goto L43
    L31:
        r7 = 1024;
        goto L32
    L33:
        r12 = r23;
        goto L35
    L23:
        r6 = 128;
        goto L24
    L25:
        r4 = r22;
        goto L27
    L15:
        r3 = 16;
        goto L16
    L17:
        r11 = r21;
        goto L19
    L7:
        r2 = 2;
        goto L8
    L9:
        r14 = fabPosition;
        goto L11
    }

    static {
        FabSpacing = Dp.m6973constructorimpl(16);
    }
}
