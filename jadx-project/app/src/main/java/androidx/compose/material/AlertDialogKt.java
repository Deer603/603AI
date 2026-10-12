package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlertDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a{\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a¥\u0001\u0010\u001e\u001a\u00020\t2\u000e\b\b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0013\b\b\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u00052\u0015\b\b\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\b\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\b\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#H\u0081\bø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u008e\u0001\u0010\u001e\u001a\u00020\t2\u000e\b\b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0013\b\b\u0010\n\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u00052\u0015\b\b\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\b\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#H\u0081\bø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a;\u0010(\u001a\u00020\t*\u00020)2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\fH\u0001¢\u0006\u0002\u0010*\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"TextBaselineDistanceFromTitle", "Landroidx/compose/ui/unit/TextUnit;", "J", "TextBaselineDistanceFromTop", "TextPadding", "Landroidx/compose/ui/Modifier;", "TitleBaselineDistanceFromTop", "TitlePadding", "AlertDialogContent", "", "buttons", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "AlertDialogContent-WMdw5o4", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "AlertDialogFlowRow", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogImpl", "onDismissRequest", "confirmButton", "dismissButton", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialogImpl-0nD-MI0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;I)V", "AlertDialogImpl-SxpAMN0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;I)V", "AlertDialogBaselineLayout", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AlertDialogKt {
    private static final long TextBaselineDistanceFromTitle = 0;
    private static final long TextBaselineDistanceFromTop = 0;
    private static final Modifier TextPadding = null;
    private static final long TitleBaselineDistanceFromTop = 0;
    private static final Modifier TitlePadding = null;

    public static final /* synthetic */ long access$getTextBaselineDistanceFromTitle$p() {
        return TextBaselineDistanceFromTitle;
    }

    public static final /* synthetic */ long access$getTextBaselineDistanceFromTop$p() {
        return TextBaselineDistanceFromTop;
    }

    public static final /* synthetic */ long access$getTitleBaselineDistanceFromTop$p() {
        return TitleBaselineDistanceFromTop;
    }

    /* JADX INFO: renamed from: AlertDialogImpl-0nD-MI0, reason: not valid java name */
    public static final void m1516AlertDialogImpl0nDMI0(Function0<Unit> r16, Function2<? super Composer, ? super Integer, Unit> r17, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r19, Function2<? super Composer, ? super Integer, Unit> r20, Function2<? super Composer, ? super Integer, Unit> r21, Shape shape, long backgroundColor, long contentColor, DialogProperties properties, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1114174731, "CC(AlertDialogImpl)P(5,1,4,3,9,8,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color)151@6968L386,149@6892L677:AlertDialog.kt#jmzs0o");
        AndroidAlertDialog_androidKt.m1519AlertDialogwqdebIU(r16, ComposableLambdaKt.rememberComposableLambda(1167440211, true, new AlertDialogKt$AlertDialogImpl$1(r19, r17), $composer, 54), modifier, r20, r21, shape, backgroundColor, contentColor, properties, $composer, (((((((($changed & 14) | 48) | ($changed & 896)) | (($changed >> 3) & 7168)) | (($changed >> 3) & 57344)) | (($changed >> 3) & 458752)) | (($changed >> 3) & 3670016)) | (($changed >> 3) & 29360128)) | (234881024 & ($changed >> 3)), 0);
        ComposerKt.sourceInformationMarkerEnd($composer);
    }

    /* JADX INFO: renamed from: AlertDialogImpl-SxpAMN0, reason: not valid java name */
    public static final void m1517AlertDialogImplSxpAMN0(Function0<Unit> r17, Function2<? super Composer, ? super Integer, Unit> r18, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r20, Function2<? super Composer, ? super Integer, Unit> r21, Shape shape, long backgroundColor, long contentColor, DialogProperties properties, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 678652607, "CC(AlertDialogImpl)P(4,1,3,8,7,6,0:c#ui.graphics.Color,2:c#ui.graphics.Color)182@8044L275,182@7975L344:AlertDialog.kt#jmzs0o");
        AndroidDialog_androidKt.Dialog(r17, properties, ComposableLambdaKt.rememberComposableLambda(-66632952, true, new AlertDialogKt$AlertDialogImpl$2(r18, modifier, r20, r21, shape, backgroundColor, contentColor), $composer, 54), $composer, (($changed & 14) | 384) | (($changed >> 21) & 112), 0);
        ComposerKt.sourceInformationMarkerEnd($composer);
    }

    /* JADX INFO: renamed from: AlertDialogContent-WMdw5o4, reason: not valid java name */
    public static final void m1514AlertDialogContentWMdw5o4(final Function2<? super Composer, ? super Integer, Unit> r23, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r25, Function2<? super Composer, ? super Integer, Unit> r26, Shape shape, long backgroundColor, long contentColor, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(-453679601);
        ComposerKt.sourceInformation($composer2, "C(AlertDialogContent)P(1,3,6,5,4,0:c#ui.graphics.Color,2:c#ui.graphics.Color)209@8838L1015,204@8702L1151:AlertDialog.kt#jmzs0o");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r34 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L23:
        int r6 = r34 & 4;
        if (r6 == 0) goto L27;
        $dirty = $dirty | 384;
        final Function2<? super Composer, ? super Integer, Unit> r7 = r25;
    L34:
        int r8 = r34 & 8;
        if (r8 == 0) goto L38;
        $dirty = $dirty | 3072;
        final Function2<? super Composer, ? super Integer, Unit> r9 = r26;
    L46:
        if (($changed & 24576) == 0) goto L48;
        Shape shape2 = shape;
    L57:
        if ((196608 & $changed) == 0) goto L59;
        long backgroundColor2 = backgroundColor;
    L68:
        if (($changed & 1572864) == 0) goto L70;
        int r32 = 1572864;
        long r14 = contentColor;
    L78:
        int $dirty2 = $dirty;
        if (($dirty & 599187) == 599186) goto L81;
        boolean r0 = true;
    L83:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L123;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "200@8560L6,201@8618L6,202@8660L32");
        if (($changed & 1) != 0) goto L87;
    L99:
        if (r4 == 0) goto L101;
        modifier2 = Modifier.Companion;
    L101:
        if (r6 == 0) goto L103;
        r7 = null;
    L103:
        if (r8 == 0) goto L106;
        r9 = null;
    L106:
        if ((r34 & 16) == 0) goto L108;
        int $dirty3 = $dirty2 & (-57345);
        shape2 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getMedium();
    L110:
        if ((r34 & 32) == 0) goto L113;
        backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
        $dirty3 = $dirty3 & (-458753);
    L113:
        if ((r34 & 64) == 0) goto L115;
        int $dirty4 = $dirty3 & (-3670017);
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty3 >> 15) & 14);
        long backgroundColor3 = backgroundColor2;
        Shape shape3 = shape2;
        Modifier modifier3 = modifier2;
    L116:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L119;
        ComposerKt.traceEventStart(-453679601, $dirty4, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:203)");
    L119:
        Composer $composer3 = $composer2;
        SurfaceKt.m1782SurfaceFjzlyU(modifier3, shape3, backgroundColor3, contentColor2, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(629950291, true, new AlertDialogKt$AlertDialogContent$1(r7, r9, r23), $composer2, 54), $composer3, ((((($dirty4 >> 3) & 14) | r32) | (($dirty4 >> 9) & 112)) | (($dirty4 >> 9) & 896)) | (($dirty4 >> 9) & 7168), 48);
        if (ComposerKt.isTraceInProgress() == false) goto L122;
        ComposerKt.traceEventEnd();
    L122:
        final Function2<? super Composer, ? super Integer, Unit> r5 = r9;
        final Modifier modifier4 = modifier3;
        final Shape shape4 = shape3;
        final long contentColor3 = contentColor2;
        final Function2<? super Composer, ? super Integer, Unit> r3 = r7;
        final long backgroundColor4 = backgroundColor3;
    L124:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L128;
        r12.updateScope(new AlertDialogKt$AlertDialogContent$2(r23, modifier4, r3, r5, shape4, backgroundColor4, contentColor3, $changed, r34));
        return;
    L128:
        return;
    L115:
        $dirty4 = $dirty3;
        contentColor2 = r14;
        backgroundColor3 = backgroundColor2;
        shape3 = shape2;
        modifier3 = modifier2;
        goto L116
    L108:
        $dirty3 = $dirty2;
        goto L110
    L87:
        if ($composer2.getDefaultsInvalid() == true) goto L99;
        $composer2.skipToGroupEnd();
        if ((r34 & 16) == 0) goto L93;
        $dirty2 = $dirty2 & (-57345);
    L93:
        if ((r34 & 32) == 0) goto L96;
        $dirty2 = $dirty2 & (-458753);
    L96:
        if ((r34 & 64) == 0) goto L98;
        $dirty4 = $dirty2 & (-3670017);
        contentColor2 = r14;
        backgroundColor3 = backgroundColor2;
        shape3 = shape2;
        modifier3 = modifier2;
        goto L116
    L98:
        $dirty4 = $dirty2;
        contentColor2 = r14;
        backgroundColor3 = backgroundColor2;
        shape3 = shape2;
        modifier3 = modifier2;
        goto L116
    L123:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = modifier2;
        r3 = r7;
        r5 = r9;
        shape4 = shape2;
        backgroundColor4 = backgroundColor2;
        contentColor3 = r14;
        goto L124
    L81:
        r0 = false;
        goto L83
    L70:
        if ((r34 & 64) != 0) goto L74;
        r32 = 1572864;
        r14 = contentColor;
        if ($composer2.changed(r14) == false) goto L75;
        int r16 = 1048576;
    L76:
        $dirty = $dirty | r16;
    L75:
        r16 = 524288;
        goto L76
    L74:
        r32 = 1572864;
        r14 = contentColor;
        goto L75
    L59:
        if ((r34 & 32) != 0) goto L63;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L64;
        int r15 = 131072;
    L65:
        $dirty = $dirty | r15;
    L64:
        r15 = 65536;
        goto L65
    L63:
        backgroundColor2 = backgroundColor;
        goto L64
    L48:
        if ((r34 & 16) != 0) goto L52;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L53;
        int r13 = 16384;
    L54:
        $dirty = $dirty | r13;
    L53:
        r13 = 8192;
        goto L54
    L52:
        shape2 = shape;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        r9 = r26;
        if ($composer2.changedInstance(r9) == false) goto L42;
        int r11 = 2048;
    L43:
        $dirty = $dirty | r11;
        goto L46
    L42:
        r11 = 1024;
        goto L43
    L44:
        r9 = r26;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        r7 = r25;
        if ($composer2.changedInstance(r7) == false) goto L31;
        int r10 = 256;
    L32:
        $dirty = $dirty | r10;
        goto L34
    L31:
        r10 = 128;
        goto L32
    L33:
        r7 = r25;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r17 = 32;
    L21:
        $dirty = $dirty | r17;
        goto L23
    L20:
        r17 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r23) == false) goto L10;
        int r18 = 4;
    L11:
        $dirty = $dirty | r18;
        goto L12
    L10:
        r18 = 2;
        goto L11
    }

    public static final void AlertDialogBaselineLayout(final ColumnScope $this$AlertDialogBaselineLayout, final Function2<? super Composer, ? super Integer, Unit> r54, final Function2<? super Composer, ? super Integer, Unit> r55, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-555573207);
        ComposerKt.sourceInformation($composer2, "C(AlertDialogBaselineLayout)P(1)250@10329L3698:AlertDialog.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed($this$AlertDialogBaselineLayout) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r54) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r55) == false) goto L21;
        int r9 = 256;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 128;
    L24:
        if (($dirty & 147) == 146) goto L26;
        boolean r10 = true;
    L28:
        if ($composer2.shouldExecute(r10, $dirty & 1) == true) goto L30;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L88:
        ScopeUpdateScope r4 = $composer3.endRestartGroup();
        if (r4 == null) goto L92;
        r4.updateScope(new AnonymousClass3($this$AlertDialogBaselineLayout, r54, r55, $changed));
        return;
    L92:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(-555573207, $dirty, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:249)");
    L32:
        Modifier modifier$iv = $this$AlertDialogBaselineLayout.weight(Modifier.Companion, 1.0f, false);
        MeasurePolicy measurePolicy$iv = AnonymousClass2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = ((384 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L35;
        ComposablesKt.invalidApplier();
    L35:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L38;
        Function0<ComposeUiNode> r11 = r16;
        $composer2.createNode(r11);
    L39:
        $composer3 = $composer2;
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L46;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L46;
    L47:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r5 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, 1317319259, "C:AlertDialog.kt#jmzs0o");
        if (r54 != null) goto L50;
        $composer3.startReplaceGroup(1317321954);
        $composer3.endReplaceGroup();
    L66:
        if (r55 != null) goto L68;
        $composer3.startReplaceGroup(1317454758);
        $composer3.endReplaceGroup();
        Composer $composer4 = $composer3;
    L84:
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L88;
        ComposerKt.traceEventEnd();
        goto L88
    L68:
        $composer3.startReplaceGroup(1317454759);
        ComposerKt.sourceInformation($composer3, "*256@10530L67");
        Modifier modifier$iv2 = $this$AlertDialogBaselineLayout.align(LayoutIdKt.layoutId(TextPadding, "text"), Alignment.Companion.getStart());
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r35 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L71;
        ComposablesKt.invalidApplier();
    L71:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L74;
        Function0<ComposeUiNode> r12 = r35;
        $composer3.createNode(r12);
    L75:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r13 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L81;
        $composer4 = $composer3;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L83;
    L82:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r13);
    L83:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r14 = ($changed$iv$iv$iv >> 6) & 14;
        Composer $composer$iv = $composer4;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r15 = BoxScopeInstance.INSTANCE;
        int r17 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -148937197, "C256@10589L6:AlertDialog.kt#jmzs0o");
        r55.invoke($composer$iv, 0);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer4.endReplaceGroup();
        goto L84
    L81:
        $composer4 = $composer3;
        goto L82
    L74:
        r12 = r35;
        $composer3.useNode();
        goto L75
    L50:
        $composer3.startReplaceGroup(1317321955);
        ComposerKt.sourceInformation($composer3, "*253@10397L70");
        Modifier modifier$iv3 = $this$AlertDialogBaselineLayout.align(LayoutIdKt.layoutId(TitlePadding, "title"), Alignment.Companion.getStart());
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r40 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L53;
        ComposablesKt.invalidApplier();
    L53:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L56;
        Function0<ComposeUiNode> r18 = r40;
        $composer3.createNode(r18);
    L57:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r19 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L64;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L64;
    L65:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r20 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r110 = BoxScopeInstance.INSTANCE;
        int r44 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -149067118, "C253@10458L7:AlertDialog.kt#jmzs0o");
        r54.invoke($composer3, 0);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L64:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r19);
        goto L65
    L56:
        r18 = r40;
        $composer3.useNode();
    L46:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r6);
        goto L47
    L38:
        r11 = r16;
        $composer2.useNode();
        goto L39
    L26:
        r10 = false;
        goto L28
    }

    /* JADX INFO: renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m1515AlertDialogFlowRowixp7dh8(final float mainAxisSpacing, final float crossAxisSpacing, final Function2<? super Composer, ? super Integer, Unit> r25, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(73434452);
        ComposerKt.sourceInformation($composer2, "C(AlertDialogFlowRow)P(2:c#ui.unit.Dp,1:c#ui.unit.Dp)352@14301L3557,352@14285L3573:AlertDialog.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(mainAxisSpacing) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(crossAxisSpacing) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) == 0) goto L19;
    L23:
        boolean r11 = true;
        if (($dirty & 147) == 146) goto L26;
        boolean r9 = true;
    L28:
        if ($composer2.shouldExecute(r9, $dirty & 1) == true) goto L30;
        $composer2.skipToGroupEnd();
    L66:
        ScopeUpdateScope r4 = $composer2.endRestartGroup();
        if (r4 == null) goto L70;
        r4.updateScope(new AlertDialogKt$AlertDialogFlowRow$2(mainAxisSpacing, crossAxisSpacing, r25, $changed));
        return;
    L70:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(73434452, $dirty, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:351)");
    L32:
        ComposerKt.sourceInformationMarkerStart($composer2, 2008443859, "CC(remember):AlertDialog.kt#9igjgp");
        if (($dirty & 14) != 4) goto L35;
        boolean r5 = true;
    L37:
        if (($dirty & 112) == 32) goto L40;
        r11 = false;
    L40:
        boolean invalid$iv = r5 | r11;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L43;
    L46:
        Object value$iv = (MeasurePolicy) new AlertDialogKt$AlertDialogFlowRow$1$1(mainAxisSpacing, crossAxisSpacing);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L47:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv = ($dirty >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        Modifier modifier$iv = Modifier.Companion;
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r13 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L50;
        ComposablesKt.invalidApplier();
    L50:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L53;
        $composer2.createNode(r13);
    L54:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r10 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L61;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L61;
    L62:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        r25.invoke($composer2, Integer.valueOf(($changed$iv$iv >> 6) & 14));
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L66;
        ComposerKt.traceEventEnd();
    L61:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r10);
        goto L62
    L53:
        $composer2.useNode();
        goto L54
    L43:
        if (it$iv != Composer.Companion.getEmpty()) goto L47;
    L35:
        r5 = false;
        goto L37
    L26:
        r9 = false;
        goto L28
    L19:
        if ($composer2.changedInstance(r25) == false) goto L21;
        int r12 = 256;
    L22:
        $dirty = $dirty | r12;
        goto L23
    L21:
        r12 = 128;
        goto L22
    }

    static {
        TitlePadding = PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, Dp.m6973constructorimpl(24), 0.0f, Dp.m6973constructorimpl(24), 0.0f, 10, null);
        TextPadding = PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, Dp.m6973constructorimpl(24), 0.0f, Dp.m6973constructorimpl(24), Dp.m6973constructorimpl(28), 2, null);
        TitleBaselineDistanceFromTop = TextUnitKt.getSp(40);
        TextBaselineDistanceFromTitle = TextUnitKt.getSp(36);
        TextBaselineDistanceFromTop = TextUnitKt.getSp(38);
    }
}
