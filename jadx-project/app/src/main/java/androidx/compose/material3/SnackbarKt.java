package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001ae\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001ag\u0010\u0018\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u001aj\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0099\u0001\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020 2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"ContainerMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "LongButtonVerticalOffset", "SeparateButtonExtraY", "SnackbarVerticalPadding", "TextEndExtraSpacing", "NewLineButtonSnackbar", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "action", "dismissAction", "actionTextStyle", "Landroidx/compose/ui/text/TextStyle;", "actionContentColor", "Landroidx/compose/ui/graphics/Color;", "dismissActionContentColor", "NewLineButtonSnackbar-kKq0p4A", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "actionTextColor", "dismissActionColor", "OneRowSnackbar-kKq0p4A", "Snackbar", "snackbarData", "Landroidx/compose/material3/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "actionOnNewLine", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "contentColor", "actionColor", "Snackbar-sDKtq54", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V", "content", "Snackbar-eQBnUkQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SnackbarKt {
    private static final float ContainerMaxWidth = 0.0f;
    private static final float HeightToFirstLine = 0.0f;
    private static final float HorizontalSpacing = 0.0f;
    private static final float HorizontalSpacingButtonSide = 0.0f;
    private static final float LongButtonVerticalOffset = 0.0f;
    private static final float SeparateButtonExtraY = 0.0f;
    private static final float SnackbarVerticalPadding = 0.0f;
    private static final float TextEndExtraSpacing = 0.0f;

    /* JADX INFO: renamed from: access$NewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    public static final /* synthetic */ void m2657access$NewLineButtonSnackbarkKq0p4A(Function2 text, Function2 action, Function2 dismissAction, TextStyle actionTextStyle, long actionContentColor, long dismissActionContentColor, Composer $composer, int $changed) {
        m2653NewLineButtonSnackbarkKq0p4A(text, action, dismissAction, actionTextStyle, actionContentColor, dismissActionContentColor, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$OneRowSnackbar-kKq0p4A, reason: not valid java name */
    public static final /* synthetic */ void m2658access$OneRowSnackbarkKq0p4A(Function2 text, Function2 action, Function2 dismissAction, TextStyle actionTextStyle, long actionTextColor, long dismissActionColor, Composer $composer, int $changed) {
        m2654OneRowSnackbarkKq0p4A(text, action, dismissAction, actionTextStyle, actionTextColor, dismissActionColor, $composer, $changed);
    }

    public static final /* synthetic */ float access$getContainerMaxWidth$p() {
        return ContainerMaxWidth;
    }

    public static final /* synthetic */ float access$getHeightToFirstLine$p() {
        return HeightToFirstLine;
    }

    public static final /* synthetic */ float access$getTextEndExtraSpacing$p() {
        return TextEndExtraSpacing;
    }

    /* JADX INFO: renamed from: Snackbar-eQBnUkQ, reason: not valid java name */
    public static final void m2655SnackbareQBnUkQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r26, Function2<? super Composer, ? super Integer, Unit> r27, boolean actionOnNewLine, Shape shape, long containerColor, long contentColor, long actionContentColor, long dismissActionContentColor, final Function2<? super Composer, ? super Integer, Unit> r38, Composer $composer, final int $changed, final int r41) {
        Composer $composer2 = $composer.startRestartGroup(-1235788955);
        ComposerKt.sourceInformation($composer2, "C(Snackbar)P(8!1,6,2,9,3:c#ui.graphics.Color,5:c#ui.graphics.Color,1:c#ui.graphics.Color,7:c#ui.graphics.Color)107@5066L5,108@5118L5,109@5168L12,110@5231L18,111@5307L25,120@5574L1123,114@5378L1319:Snackbar.kt#uh7d8r");
        int $dirty = $changed;
        int r4 = r41 & 1;
        if (r4 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r5 = modifier;
    L13:
        int r6 = r41 & 2;
        if (r6 == 0) goto L17;
        $dirty = $dirty | 48;
        Function2<? super Composer, ? super Integer, Unit> r7 = r26;
    L24:
        int r8 = r41 & 4;
        if (r8 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r9 = r27;
    L35:
        int r10 = r41 & 8;
        if (r10 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r11 = actionOnNewLine;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Shape r12 = shape;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        long r13 = containerColor;
    L69:
        if (($changed & 1572864) == 0) goto L71;
        int $dirty2 = $dirty;
        int r39 = r4;
    L80:
        if (($changed & 12582912) != 0) goto L91;
        if ((r41 & 128) != 0) goto L87;
        if ($composer2.changed(actionContentColor) == false) goto L87;
        int r1 = 8388608;
    L88:
        $dirty2 = $dirty2 | r1;
    L87:
        r1 = 4194304;
    L91:
        if ((100663296 & $changed) != 0) goto L102;
        if ((r41 & 256) != 0) goto L98;
        if ($composer2.changed(dismissActionContentColor) == false) goto L98;
        int r2 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty2 | r2;
    L98:
        r2 = 33554432;
    L102:
        if ((r41 & 512) == 0) goto L105;
        $dirty2 = $dirty2 | 805306368;
    L113:
        if (($dirty2 & 306783379) == 306783378) goto L115;
    L118:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L121;
    L139:
        if (r39 == 0) goto L141;
        Modifier.Companion modifier2 = Modifier.Companion;
    L142:
        if (r6 == 0) goto L144;
        Function2<? super Composer, ? super Integer, Unit> r14 = null;
    L145:
        if (r8 == 0) goto L147;
        Function2<? super Composer, ? super Integer, Unit> r15 = null;
    L148:
        if (r10 == 0) goto L150;
        boolean actionOnNewLine2 = false;
    L152:
        if ((r41 & 16) == 0) goto L154;
        Shape shape2 = SnackbarDefaults.INSTANCE.getShape($composer2, 6);
        $dirty2 = $dirty2 & (-57345);
    L156:
        if ((r41 & 32) == 0) goto L158;
        long containerColor2 = SnackbarDefaults.INSTANCE.getColor($composer2, 6);
        $dirty2 = $dirty2 & (-458753);
    L160:
        if ((r41 & 64) == 0) goto L162;
        long contentColor2 = SnackbarDefaults.INSTANCE.getContentColor($composer2, 6);
        $dirty2 = $dirty2 & (-3670017);
    L164:
        if ((r41 & 128) == 0) goto L166;
        long actionContentColor2 = SnackbarDefaults.INSTANCE.getActionContentColor($composer2, 6);
        $dirty2 = $dirty2 & (-29360129);
    L168:
        if ((r41 & 256) == 0) goto L170;
        long dismissActionContentColor2 = SnackbarDefaults.INSTANCE.getDismissActionContentColor($composer2, 6);
        int $dirty3 = $dirty2 & (-234881025);
    L171:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L174;
        ComposerKt.traceEventStart(-1235788955, $dirty3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:113)");
    L174:
        final Function2<? super Composer, ? super Integer, Unit> r28 = r14;
        final Function2<? super Composer, ? super Integer, Unit> r29 = r15;
        final boolean actionOnNewLine3 = actionOnNewLine2;
        final long actionContentColor3 = actionContentColor2;
        final long dismissActionContentColor3 = dismissActionContentColor2;
        Modifier modifier3 = modifier2;
        Shape shape3 = shape2;
        long containerColor3 = containerColor2;
        long contentColor3 = contentColor2;
        SurfaceKt.m2670SurfaceT9BRK9s(modifier3, shape3, containerColor3, contentColor3, 0.0f, SnackbarTokens.INSTANCE.m3628getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.rememberComposableLambda(-1829663446, true, new SnackbarKt$Snackbar$1(actionOnNewLine3, r28, r38, r29, actionContentColor3, dismissActionContentColor3), $composer2, 54), $composer2, (((($dirty3 & 14) | 12779520) | (($dirty3 >> 9) & 112)) | (($dirty3 >> 9) & 896)) | (($dirty3 >> 9) & 7168), 80);
        final Modifier modifier4 = modifier3;
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L177;
        ComposerKt.traceEventEnd();
    L177:
        final Function2<? super Composer, ? super Integer, Unit> r3 = r28;
        final Shape shape4 = shape2;
        final boolean actionOnNewLine4 = actionOnNewLine3;
        final long contentColor4 = contentColor2;
        final long contentColor5 = dismissActionContentColor2;
        final Function2<? super Composer, ? super Integer, Unit> r16 = r15;
        final long containerColor4 = containerColor2;
        final long containerColor5 = actionContentColor2;
    L178:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L182;
        r0.updateScope(new SnackbarKt$Snackbar$2(modifier4, r3, r16, actionOnNewLine4, shape4, containerColor4, contentColor4, containerColor5, contentColor5, r38, $changed, r41));
        return;
    L182:
        return;
    L170:
        dismissActionContentColor2 = dismissActionContentColor;
        $dirty3 = $dirty2;
        goto L171
    L166:
        actionContentColor2 = actionContentColor;
        goto L168
    L162:
        contentColor2 = contentColor;
        goto L164
    L158:
        containerColor2 = r13;
        goto L160
    L154:
        shape2 = r12;
        goto L156
    L150:
        actionOnNewLine2 = r11;
        goto L152
    L147:
        r15 = r9;
        goto L148
    L144:
        r14 = r7;
        goto L145
    L141:
        modifier2 = r5;
        goto L142
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L139;
        $composer2.skipToGroupEnd();
        if ((r41 & 16) == 0) goto L127;
        $dirty2 = $dirty2 & (-57345);
    L127:
        if ((r41 & 32) == 0) goto L130;
        $dirty2 = $dirty2 & (-458753);
    L130:
        if ((r41 & 64) == 0) goto L133;
        $dirty2 = $dirty2 & (-3670017);
    L133:
        if ((r41 & 128) == 0) goto L136;
        $dirty2 = $dirty2 & (-29360129);
    L136:
        if ((r41 & 256) == 0) goto L138;
        actionContentColor2 = actionContentColor;
        dismissActionContentColor2 = dismissActionContentColor;
        $dirty3 = $dirty2 & (-234881025);
        modifier2 = r5;
        r14 = r7;
        r15 = r9;
        actionOnNewLine2 = r11;
        shape2 = r12;
        containerColor2 = r13;
        contentColor2 = contentColor;
        goto L171
    L138:
        actionContentColor2 = actionContentColor;
        dismissActionContentColor2 = dismissActionContentColor;
        modifier2 = r5;
        r14 = r7;
        r15 = r9;
        actionOnNewLine2 = r11;
        shape2 = r12;
        containerColor2 = r13;
        $dirty3 = $dirty2;
        contentColor2 = contentColor;
        goto L171
    L115:
        if ($composer2.getSkipping() == false) goto L118;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = r5;
        r3 = r7;
        r16 = r9;
        actionOnNewLine4 = r11;
        shape4 = r12;
        containerColor4 = r13;
        contentColor4 = contentColor;
        containerColor5 = actionContentColor;
        contentColor5 = dismissActionContentColor;
        goto L178
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changedInstance(r38) == false) goto L109;
        int r18 = 536870912;
    L110:
        $dirty2 = $dirty2 | r18;
        goto L113
    L109:
        r18 = 268435456;
        goto L110
    L71:
        if ((r41 & 64) != 0) goto L75;
        int $dirty4 = $dirty;
        r39 = r4;
        if ($composer2.changed(contentColor) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty2 = $dirty4 | r17;
    L76:
        r17 = 524288;
        goto L77
    L75:
        $dirty4 = $dirty;
        r39 = r4;
        goto L76
    L60:
        if ((r41 & 32) != 0) goto L64;
        r13 = containerColor;
        if ($composer2.changed(r13) == false) goto L65;
        int r19 = 131072;
    L66:
        $dirty = $dirty | r19;
    L65:
        r19 = 65536;
        goto L66
    L64:
        r13 = containerColor;
        goto L65
    L49:
        if ((r41 & 16) != 0) goto L53;
        r12 = shape;
        if ($composer2.changed(r12) == false) goto L54;
        int r110 = 16384;
    L55:
        $dirty = $dirty | r110;
    L54:
        r110 = 8192;
        goto L55
    L53:
        r12 = shape;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        r11 = actionOnNewLine;
        if ($composer2.changed(r11) == false) goto L43;
        int r111 = 2048;
    L44:
        $dirty = $dirty | r111;
        goto L47
    L43:
        r111 = 1024;
        goto L44
    L45:
        r11 = actionOnNewLine;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        r9 = r27;
        if ($composer2.changedInstance(r9) == false) goto L32;
        int r112 = 256;
    L33:
        $dirty = $dirty | r112;
        goto L35
    L32:
        r112 = 128;
        goto L33
    L34:
        r9 = r27;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r7 = r26;
        if ($composer2.changedInstance(r7) == false) goto L21;
        int r20 = 32;
    L22:
        $dirty = $dirty | r20;
        goto L24
    L21:
        r20 = 16;
        goto L22
    L23:
        r7 = r26;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L13
    L10:
        r21 = 2;
        goto L11
    L12:
        r5 = modifier;
        goto L13
    }

    /* JADX INFO: renamed from: Snackbar-sDKtq54, reason: not valid java name */
    public static final void m2656SnackbarsDKtq54(final SnackbarData snackbarData, Modifier modifier, boolean actionOnNewLine, Shape shape, long containerColor, long contentColor, long actionColor, long actionContentColor, long dismissActionContentColor, Composer $composer, final int $changed, final int r50) {
        Composer $composer2 = $composer.startRestartGroup(274621471);
        ComposerKt.sourceInformation($composer2, "C(Snackbar)P(8,6,2,7,3:c#ui.graphics.Color,4:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color)205@9602L5,206@9654L5,207@9704L12,208@9760L11,209@9822L18,210@9898L25,251@11371L38,241@10959L456:Snackbar.kt#uh7d8r");
        int $dirty = $changed;
        if ((r50 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r50 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r6 = modifier;
    L23:
        int r7 = r50 & 4;
        if (r7 == 0) goto L27;
        $dirty = $dirty | 384;
        boolean r8 = actionOnNewLine;
    L35:
        if (($changed & 3072) == 0) goto L37;
        Shape r9 = shape;
    L46:
        if (($changed & 24576) == 0) goto L48;
        long r10 = containerColor;
    L57:
        if ((196608 & $changed) == 0) goto L59;
        long r12 = contentColor;
    L68:
        if ((1572864 & $changed) == 0) goto L70;
        int $dirty2 = $dirty;
        int r48 = r5;
    L79:
        if (($changed & 12582912) != 0) goto L90;
        if ((r50 & 128) != 0) goto L86;
        if ($composer2.changed(actionContentColor) == false) goto L86;
        int r2 = 8388608;
    L87:
        $dirty2 = $dirty2 | r2;
    L86:
        r2 = 4194304;
    L90:
        if ((100663296 & $changed) != 0) goto L101;
        if ((r50 & 256) != 0) goto L97;
        if ($composer2.changed(dismissActionContentColor) == false) goto L97;
        int r3 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty2 = $dirty2 | r3;
    L97:
        r3 = 33554432;
    L101:
        if ((38347923 & $dirty2) == 38347922) goto L103;
    L106:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L109;
    L130:
        if (r48 == 0) goto L132;
        final Modifier.Companion modifier2 = Modifier.Companion;
    L133:
        if (r7 == 0) goto L135;
        boolean actionOnNewLine2 = false;
    L137:
        if ((r50 & 8) == 0) goto L139;
        Shape shape2 = SnackbarDefaults.INSTANCE.getShape($composer2, 6);
        $dirty2 = $dirty2 & (-7169);
    L141:
        if ((r50 & 16) == 0) goto L143;
        long containerColor2 = SnackbarDefaults.INSTANCE.getColor($composer2, 6);
        $dirty2 = $dirty2 & (-57345);
    L145:
        if ((r50 & 32) == 0) goto L147;
        long contentColor2 = SnackbarDefaults.INSTANCE.getContentColor($composer2, 6);
        $dirty2 = $dirty2 & (-458753);
    L149:
        if ((r50 & 64) == 0) goto L151;
        long actionColor2 = SnackbarDefaults.INSTANCE.getActionColor($composer2, 6);
        $dirty2 = $dirty2 & (-3670017);
    L153:
        if ((r50 & 128) == 0) goto L155;
        long actionContentColor2 = SnackbarDefaults.INSTANCE.getActionContentColor($composer2, 6);
        $dirty2 = $dirty2 & (-29360129);
    L157:
        if ((r50 & 256) == 0) goto L159;
        $dirty2 = (-234881025) & $dirty2;
        final long actionColor3 = actionColor2;
        long actionContentColor3 = actionContentColor2;
        long dismissActionContentColor2 = SnackbarDefaults.INSTANCE.getDismissActionContentColor($composer2, 6);
        boolean actionOnNewLine3 = actionOnNewLine2;
        Shape shape3 = shape2;
        long containerColor3 = containerColor2;
        long contentColor3 = contentColor2;
    L160:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L163;
        ComposerKt.traceEventStart(274621471, $dirty2, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:211)");
    L163:
        final String actionLabel = snackbarData.getVisuals().getActionLabel();
        $composer2.startReplaceGroup(1561344786);
        ComposerKt.sourceInformation($composer2, "215@10097L267");
        if (actionLabel == null) goto L166;
        Function2 actionComposable = ComposableLambdaKt.rememberComposableLambda(-1378313599, true, new SnackbarKt$Snackbar$actionComposable$1(actionColor3, snackbarData, actionLabel), $composer2, 54);
    L167:
        $composer2.endReplaceGroup();
        $composer2.startReplaceGroup(1561358724);
        ComposerKt.sourceInformation($composer2, "227@10548L362");
        if (snackbarData.getVisuals().getWithDismissAction() == false) goto L170;
        Function2 dismissActionComposable = ComposableLambdaKt.rememberComposableLambda(-1812633777, true, new SnackbarKt$Snackbar$dismissActionComposable$1(snackbarData), $composer2, 54);
    L171:
        $composer2.endReplaceGroup();
        Composer $composer3 = $composer2;
        m2655SnackbareQBnUkQ(PaddingKt.m725padding3ABfNKs(modifier2, Dp.m6973constructorimpl(12)), actionComposable, dismissActionComposable, actionOnNewLine3, shape3, containerColor3, contentColor3, actionContentColor3, dismissActionContentColor2, ComposableLambdaKt.rememberComposableLambda(-1266389126, true, new SnackbarKt$Snackbar$3(snackbarData), $composer2, 54), $composer3, ((((((($dirty2 << 3) & 7168) | 805306368) | (($dirty2 << 3) & 57344)) | (($dirty2 << 3) & 458752)) | (3670016 & ($dirty2 << 3))) | (29360128 & $dirty2)) | (234881024 & $dirty2), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L174;
        ComposerKt.traceEventEnd();
    L174:
        final long actionColor4 = actionColor3;
        final boolean actionOnNewLine4 = actionOnNewLine3;
        final Shape shape4 = shape3;
        final long containerColor4 = containerColor3;
        final long contentColor4 = contentColor3;
        final long actionContentColor4 = actionContentColor3;
        final long dismissActionContentColor3 = dismissActionContentColor2;
    L175:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L179;
        r0.updateScope(new SnackbarKt$Snackbar$4(snackbarData, modifier2, actionOnNewLine4, shape4, containerColor4, contentColor4, actionColor4, actionContentColor4, dismissActionContentColor3, $changed, r50));
        return;
    L179:
        return;
    L170:
        dismissActionComposable = null;
        goto L171
    L166:
        actionComposable = null;
        goto L167
    L159:
        dismissActionContentColor2 = dismissActionContentColor;
        contentColor3 = contentColor2;
        actionColor3 = actionColor2;
        actionContentColor3 = actionContentColor2;
        actionOnNewLine3 = actionOnNewLine2;
        shape3 = shape2;
        containerColor3 = containerColor2;
        goto L160
    L155:
        actionContentColor2 = actionContentColor;
        goto L157
    L151:
        actionColor2 = actionColor;
        goto L153
    L147:
        contentColor2 = r12;
        goto L149
    L143:
        containerColor2 = r10;
        goto L145
    L139:
        shape2 = r9;
        goto L141
    L135:
        actionOnNewLine2 = r8;
        goto L137
    L132:
        modifier2 = r6;
        goto L133
    L109:
        if ($composer2.getDefaultsInvalid() == true) goto L130;
        $composer2.skipToGroupEnd();
        if ((r50 & 8) == 0) goto L115;
        $dirty2 = $dirty2 & (-7169);
    L115:
        if ((r50 & 16) == 0) goto L118;
        $dirty2 = $dirty2 & (-57345);
    L118:
        if ((r50 & 32) == 0) goto L121;
        $dirty2 = $dirty2 & (-458753);
    L121:
        if ((r50 & 64) == 0) goto L124;
        $dirty2 = $dirty2 & (-3670017);
    L124:
        if ((r50 & 128) == 0) goto L127;
        $dirty2 = $dirty2 & (-29360129);
    L127:
        if ((r50 & 256) == 0) goto L129;
        actionColor3 = actionColor;
        actionContentColor3 = actionContentColor;
        dismissActionContentColor2 = dismissActionContentColor;
        $dirty2 = $dirty2 & (-234881025);
        modifier2 = r6;
        actionOnNewLine3 = r8;
        shape3 = r9;
        containerColor3 = r10;
        contentColor3 = r12;
        goto L160
    L129:
        actionColor3 = actionColor;
        actionContentColor3 = actionContentColor;
        dismissActionContentColor2 = dismissActionContentColor;
        modifier2 = r6;
        actionOnNewLine3 = r8;
        shape3 = r9;
        containerColor3 = r10;
        contentColor3 = r12;
        goto L160
    L103:
        if ($composer2.getSkipping() == false) goto L106;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier2 = r6;
        actionOnNewLine4 = r8;
        shape4 = r9;
        containerColor4 = r10;
        contentColor4 = r12;
        actionColor4 = actionColor;
        actionContentColor4 = actionContentColor;
        dismissActionContentColor3 = dismissActionContentColor;
        goto L175
    L70:
        if ((r50 & 64) != 0) goto L74;
        int $dirty3 = $dirty;
        r48 = r5;
        if ($composer2.changed(actionColor) == false) goto L75;
        int r16 = 1048576;
    L76:
        $dirty2 = $dirty3 | r16;
    L75:
        r16 = 524288;
        goto L76
    L74:
        $dirty3 = $dirty;
        r48 = r5;
        goto L75
    L59:
        if ((r50 & 32) != 0) goto L63;
        r12 = contentColor;
        if ($composer2.changed(r12) == false) goto L64;
        int r14 = 131072;
    L65:
        $dirty = $dirty | r14;
    L64:
        r14 = 65536;
        goto L65
    L63:
        r12 = contentColor;
        goto L64
    L48:
        if ((r50 & 16) != 0) goto L52;
        r10 = containerColor;
        if ($composer2.changed(r10) == false) goto L53;
        int r13 = 16384;
    L54:
        $dirty = $dirty | r13;
    L53:
        r13 = 8192;
        goto L54
    L52:
        r10 = containerColor;
        goto L53
    L37:
        if ((r50 & 8) != 0) goto L41;
        r9 = shape;
        if ($composer2.changed(r9) == false) goto L42;
        int r11 = 2048;
    L43:
        $dirty = $dirty | r11;
    L42:
        r11 = 1024;
        goto L43
    L41:
        r9 = shape;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L33;
        r8 = actionOnNewLine;
        if ($composer2.changed(r8) == false) goto L31;
        int r15 = 256;
    L32:
        $dirty = $dirty | r15;
        goto L35
    L31:
        r15 = 128;
        goto L32
    L33:
        r8 = actionOnNewLine;
        goto L35
    L16:
        if (($changed & 48) != 0) goto L22;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L20;
        int r17 = 32;
    L21:
        $dirty = $dirty | r17;
        goto L23
    L20:
        r17 = 16;
        goto L21
    L22:
        r6 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(snackbarData) == false) goto L10;
        int r18 = 4;
    L11:
        $dirty = $dirty | r18;
        goto L12
    L10:
        r18 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: NewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    private static final void m2653NewLineButtonSnackbarkKq0p4A(final Function2<? super Composer, ? super Integer, Unit> r73, final Function2<? super Composer, ? super Integer, Unit> r74, final Function2<? super Composer, ? super Integer, Unit> r75, final TextStyle actionTextStyle, final long actionContentColor, final long dismissActionContentColor, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1332496681);
        ComposerKt.sourceInformation($composer2, "C(NewLineButtonSnackbar)P(5!1,3,2,1:c#ui.graphics.Color,4:c#ui.graphics.Color)264@11690L1175:Snackbar.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r73) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r74) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L17
    L14:
        r7 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r75) == false) goto L21;
        int r8 = 256;
    L22:
        $dirty = $dirty | r8;
        goto L24
    L21:
        r8 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changed(actionTextStyle) == false) goto L28;
        int r9 = 2048;
    L29:
        $dirty = $dirty | r9;
        goto L31
    L28:
        r9 = 1024;
    L31:
        if (($changed & 24576) != 0) goto L39;
        if ($composer2.changed(actionContentColor) == false) goto L35;
        int r10 = 16384;
    L36:
        $dirty = $dirty | r10;
        goto L39
    L35:
        r10 = 8192;
    L39:
        if ((196608 & $changed) != 0) goto L46;
        if ($composer2.changed(dismissActionContentColor) == false) goto L43;
        int r11 = 131072;
    L44:
        $dirty = $dirty | r11;
        goto L46
    L43:
        r11 = 65536;
    L46:
        int $dirty2 = $dirty;
        if ((74899 & $dirty2) != 74898) goto L53;
        if ($composer2.getSkipping() == false) goto L53;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L125:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L129;
        r12.updateScope(new SnackbarKt$NewLineButtonSnackbar$2(r73, r74, r75, actionTextStyle, actionContentColor, dismissActionContentColor, $changed));
        return;
    L129:
        return;
    L53:
        if (ComposerKt.isTraceInProgress() == false) goto L55;
        ComposerKt.traceEventStart(-1332496681, $dirty2, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:263)");
    L55:
        Modifier modifier$iv = PaddingKt.m729paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m779widthInVpY3zN4$default(Modifier.Companion, 0.0f, ContainerMaxWidth, 1, null), 0.0f, 1, null), HorizontalSpacing, 0.0f, 0.0f, SeparateButtonExtraY, 6, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
        int $changed$iv = ((6 >> 3) & 14) | ((6 >> 3) & 112);
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, $changed$iv);
        int $changed$iv$iv = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r27 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L58;
        ComposablesKt.invalidApplier();
    L58:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L61;
        Function0<ComposeUiNode> r0 = r27;
        $composer2.createNode(r0);
    L62:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r13 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L69;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L69;
    L70:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
        int r14 = ((6 >> 6) & 112) | 6;
        ColumnScope $this$NewLineButtonSnackbar_kKq0p4A_u24lambda_u243 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer3, -376152340, "C272@11979L191,279@12180L679:Snackbar.kt#uh7d8r");
        Modifier modifier$iv2 = PaddingKt.m729paddingqDBjuR0$default(AlignmentLineKt.m580paddingFromBaselineVpY3zN4(Modifier.Companion, HeightToFirstLine, LongButtonVerticalOffset), 0.0f, 0.0f, HorizontalSpacingButtonSide, 0.0f, 11, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r49 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L73;
        ComposablesKt.invalidApplier();
    L73:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L76;
        Function0<ComposeUiNode> r5 = r49;
        $composer3.createNode(r5);
    L77:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r15 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L84;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L84;
    L85:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r16 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r53 = BoxScopeInstance.INSTANCE;
        int r54 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -1482962025, "C276@12154L6:Snackbar.kt#uh7d8r");
        r73.invoke($composer3, Integer.valueOf($dirty2 & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier r45 = $this$NewLineButtonSnackbar_kKq0p4A_u24lambda_u243.align(Modifier.Companion, Alignment.Companion.getEnd());
        if (r75 != null) goto L88;
        float r48 = HorizontalSpacingButtonSide;
    L89:
        Modifier modifier$iv3 = PaddingKt.m729paddingqDBjuR0$default(r45, 0.0f, 0.0f, r48, 0.0f, 11, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r46 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L92;
        ComposablesKt.invalidApplier();
    L92:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L95;
        Function0<ComposeUiNode> r17 = r46;
        $composer3.createNode(r17);
    L96:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r18 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L102;
        Composer $composer4 = $composer3;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == true) goto L104;
    L103:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r18);
    L104:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r2 = ($changed$iv$iv$iv3 >> 6) & 14;
        Composer $composer$iv = $composer4;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r19 = BoxScopeInstance.INSTANCE;
        int r110 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -1482754232, "C283@12348L501:Snackbar.kt#uh7d8r");
        ComposerKt.sourceInformationMarkerStart($composer$iv, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        Modifier modifier$iv4 = Modifier.Companion;
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
        MeasurePolicy measurePolicy$iv4 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer$iv, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        int $changed$iv$iv4 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv4 = ComposablesKt.getCurrentCompositeKeyHash($composer$iv, 0);
        CompositionLocalMap localMap$iv$iv4 = $composer$iv.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer$iv, modifier$iv4);
        Function0<ComposeUiNode> r63 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer$iv.getApplier() instanceof Applier) == true) goto L107;
        ComposablesKt.invalidApplier();
    L107:
        $composer$iv.startReusableNode();
        if ($composer$iv.getInserting() == false) goto L110;
        Function0<ComposeUiNode> r3 = r63;
        $composer$iv.createNode(r3);
    L111:
        Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m3808constructorimpl($composer$iv);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv4.getInserting() == true) goto L117;
        Composer $composer5 = $composer$iv;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv4.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv4)) == true) goto L119;
    L118:
        $this$Layout_u24lambda_u240$iv$iv4.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv4));
        $this$Layout_u24lambda_u240$iv$iv4.apply(Integer.valueOf(compositeKeyHash$iv$iv4), r4);
    L119:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.Companion.getSetModifier());
        int r20 = ($changed$iv$iv$iv4 >> 6) & 14;
        Composer $composer$iv2 = $composer5;
        ComposerKt.sourceInformationMarkerStart($composer$iv2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        RowScopeInstance r21 = RowScopeInstance.INSTANCE;
        int r22 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv2, 1996615437, "C284@12370L208:Snackbar.kt#uh7d8r");
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(actionContentColor)), TextKt.getLocalTextStyle().provides(actionTextStyle)}, r74, $composer$iv2, ProvidedValue.$stable | ($dirty2 & 112));
        $composer$iv2.startReplaceGroup(618603253);
        ComposerKt.sourceInformation($composer$iv2, "290@12644L173");
        if (r75 == null) goto L122;
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(dismissActionContentColor)), r75, $composer$iv2, ProvidedValue.$stable | (($dirty2 >> 3) & 112));
    L122:
        $composer$iv2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer$iv2);
        ComposerKt.sourceInformationMarkerEnd($composer$iv2);
        $composer5.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer5);
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
        if (ComposerKt.isTraceInProgress() == false) goto L125;
        ComposerKt.traceEventEnd();
        goto L125
    L117:
        $composer5 = $composer$iv;
        goto L118
    L110:
        r3 = r63;
        $composer$iv.useNode();
        goto L111
    L102:
        $composer4 = $composer3;
        goto L103
    L95:
        r17 = r46;
        $composer3.useNode();
        goto L96
    L88:
        r48 = Dp.m6973constructorimpl(0);
    L84:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r15);
        goto L85
    L76:
        r5 = r49;
        $composer3.useNode();
    L69:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r13);
        goto L70
    L61:
        r0 = r27;
        $composer2.useNode();
        goto L62
    }

    /* JADX INFO: renamed from: OneRowSnackbar-kKq0p4A, reason: not valid java name */
    private static final void m2654OneRowSnackbarkKq0p4A(final Function2<? super Composer, ? super Integer, Unit> r55, final Function2<? super Composer, ? super Integer, Unit> r56, final Function2<? super Composer, ? super Integer, Unit> r57, final TextStyle actionTextStyle, final long actionTextColor, final long dismissActionColor, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-903235475);
        ComposerKt.sourceInformation($composer2, "C(OneRowSnackbar)P(5!1,3,2,1:c#ui.graphics.Color,4:c#ui.graphics.Color)338@14229L3580,312@13223L4586:Snackbar.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r55) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r56) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L17
    L14:
        r7 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r57) == false) goto L21;
        int r8 = 256;
    L22:
        $dirty = $dirty | r8;
        goto L24
    L21:
        r8 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changed(actionTextStyle) == false) goto L28;
        int r9 = 2048;
    L29:
        $dirty = $dirty | r9;
        goto L31
    L28:
        r9 = 1024;
    L31:
        if (($changed & 24576) != 0) goto L39;
        if ($composer2.changed(actionTextColor) == false) goto L35;
        int r10 = 16384;
    L36:
        $dirty = $dirty | r10;
        goto L39
    L35:
        r10 = 8192;
    L39:
        if ((196608 & $changed) != 0) goto L46;
        if ($composer2.changed(dismissActionColor) == false) goto L43;
        int r11 = 131072;
    L44:
        $dirty = $dirty | r11;
        goto L46
    L43:
        r11 = 65536;
    L46:
        int $dirty2 = $dirty;
        if ((74899 & $dirty2) != 74898) goto L53;
        if ($composer2.getSkipping() == false) goto L53;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L133:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L137;
        r12.updateScope(new SnackbarKt$OneRowSnackbar$3(r55, r56, r57, actionTextStyle, actionTextColor, dismissActionColor, $changed));
        return;
    L137:
        return;
    L53:
        if (ComposerKt.isTraceInProgress() == false) goto L55;
        ComposerKt.traceEventStart(-903235475, $dirty2, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:308)");
    L55:
        final String textTag = "text";
        final String actionTag = "action";
        final String dismissActionTag = "dismissAction";
        Modifier.Companion r16 = Modifier.Companion;
        float r17 = HorizontalSpacing;
        if (r57 != null) goto L58;
        float r19 = HorizontalSpacingButtonSide;
    L59:
        Modifier modifier$iv = PaddingKt.m729paddingqDBjuR0$default(r16, r17, 0.0f, r19, 0.0f, 10, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 1386942712, "CC(remember):Snackbar.kt#9igjgp");
        MeasurePolicy value$iv = $composer2.rememberedValue();
        if (value$iv != Composer.Companion.getEmpty()) goto L63;
        value$iv = new SnackbarKt$OneRowSnackbar$2$1(actionTag, dismissActionTag, textTag);
        $composer2.updateRememberedValue(value$iv);
    L63:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r21 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = ((384 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L66;
        ComposablesKt.invalidApplier();
    L66:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L69;
        Function0<ComposeUiNode> r14 = r21;
        $composer2.createNode(r14);
    L70:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r13 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L77;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L77;
    L78:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r15 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, 2016566027, "C314@13253L86:Snackbar.kt#uh7d8r");
        Modifier modifier$iv2 = PaddingKt.m727paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r41 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L81;
        ComposablesKt.invalidApplier();
    L81:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L84;
        Function0<ComposeUiNode> r0 = r41;
        $composer3.createNode(r0);
    L85:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r18 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L92;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L92;
    L93:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r46 = BoxScopeInstance.INSTANCE;
        int r48 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 1308937155, "C314@13331L6:Snackbar.kt#uh7d8r");
        r55.invoke($composer3, Integer.valueOf($dirty2 & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.startReplaceGroup(-904778058);
        ComposerKt.sourceInformation($composer3, "316@13390L295");
        if (r56 == null) goto L112;
        Modifier modifier$iv3 = LayoutIdKt.layoutId(Modifier.Companion, "action");
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r40 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L98;
        ComposablesKt.invalidApplier();
    L98:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L101;
        Function0<ComposeUiNode> r20 = r40;
        $composer3.createNode(r20);
    L102:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r110 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L109;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L109;
    L110:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r2 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r111 = BoxScopeInstance.INSTANCE;
        int r44 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 1309057900, "C317@13446L221:Snackbar.kt#uh7d8r");
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(actionTextColor)), TextKt.getLocalTextStyle().provides(actionTextStyle)}, r56, $composer3, ProvidedValue.$stable | ($dirty2 & 112));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L109:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r110);
        goto L110
    L101:
        r20 = r40;
        $composer3.useNode();
    L112:
        $composer3.endReplaceGroup();
        $composer3.startReplaceGroup(-904766579);
        ComposerKt.sourceInformation($composer3, "325@13757L247");
        if (r57 == null) goto L130;
        Modifier modifier$iv4 = LayoutIdKt.layoutId(Modifier.Companion, "dismissAction");
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv3 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, false);
        int $changed$iv$iv4 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv4);
        Function0<ComposeUiNode> r112 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv4 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L117;
        ComposablesKt.invalidApplier();
    L117:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L120;
        Function0<ComposeUiNode> r3 = r112;
        $composer3.createNode(r3);
    L121:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L127;
        int $changed$iv = 6;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == true) goto L129;
    L128:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r4);
    L129:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r5 = ($changed$iv$iv$iv3 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r22 = BoxScopeInstance.INSTANCE;
        int r113 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 1309427203, "C326@13820L166:Snackbar.kt#uh7d8r");
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(dismissActionColor)), r57, $composer3, ProvidedValue.$stable | (($dirty2 >> 3) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        goto L130
    L127:
        $changed$iv = 6;
        goto L128
    L120:
        r3 = r112;
        $composer3.useNode();
    L130:
        $composer3.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L133;
        ComposerKt.traceEventEnd();
    L92:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r18);
        goto L93
    L84:
        r0 = r41;
        $composer3.useNode();
    L77:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r13);
        goto L78
    L69:
        r14 = r21;
        $composer2.useNode();
        goto L70
    L58:
        r19 = Dp.m6973constructorimpl(0);
        goto L59
    }

    static {
        ContainerMaxWidth = Dp.m6973constructorimpl(600);
        HeightToFirstLine = Dp.m6973constructorimpl(30);
        HorizontalSpacing = Dp.m6973constructorimpl(16);
        HorizontalSpacingButtonSide = Dp.m6973constructorimpl(8);
        SeparateButtonExtraY = Dp.m6973constructorimpl(2);
        SnackbarVerticalPadding = Dp.m6973constructorimpl(6);
        TextEndExtraSpacing = Dp.m6973constructorimpl(8);
        LongButtonVerticalOffset = Dp.m6973constructorimpl(12);
    }
}
