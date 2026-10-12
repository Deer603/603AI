package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aª\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-6oU6zVQ", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "buttons", "AlertDialog-wqdebIU", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidAlertDialog_androidKt {
    /* JADX INFO: renamed from: AlertDialog-6oU6zVQ, reason: not valid java name */
    public static final void m1518AlertDialog6oU6zVQ(final Function0<Unit> r29, final Function2<? super Composer, ? super Integer, Unit> r30, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r32, Function2<? super Composer, ? super Integer, Unit> r33, Function2<? super Composer, ? super Integer, Unit> r34, Shape shape, long backgroundColor, long contentColor, DialogProperties properties, Composer $composer, final int $changed, final int r43) {
        Composer $composer2 = $composer.startRestartGroup(-606536823);
        ComposerKt.sourceInformation($composer2, "C(AlertDialog)P(5,1,4,3,9,8,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color)41@1489L353:AndroidAlertDialog.android.kt#jmzs0o");
        int $dirty = $changed;
        if ((r43 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r15 = r29;
    L14:
        if ((r43 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L23:
        int r4 = r43 & 4;
        if (r4 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L34:
        int r6 = r43 & 8;
        if (r6 == 0) goto L38;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r7 = r32;
    L45:
        int r8 = r43 & 16;
        if (r8 == 0) goto L49;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r9 = r33;
    L56:
        int r10 = r43 & 32;
        if (r10 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r11 = r34;
    L68:
        if ((1572864 & $changed) == 0) goto L70;
        Shape shape2 = shape;
    L79:
        if (($changed & 12582912) == 0) goto L81;
        int $dirty2 = $dirty;
        int r41 = r4;
    L90:
        if (($changed & 100663296) != 0) goto L100;
        int $dirty3 = $dirty2;
        if ((r43 & 256) != 0) goto L97;
        if ($composer2.changed(contentColor) == false) goto L97;
        int r0 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty2 = $dirty3 | r0;
    L97:
        r0 = 33554432;
    L100:
        int $dirty4 = $dirty2;
        int $dirty5 = r43 & 512;
        if ($dirty5 == 0) goto L104;
        $dirty4 = $dirty4 | 805306368;
    L112:
        if (($dirty4 & 306783379) == 306783378) goto L114;
        boolean r1 = true;
    L116:
        if ($composer2.shouldExecute(r1, $dirty4 & 1) == false) goto L161;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "77@4300L6,77@4358L6,77@4400L32");
        if (($changed & 1) != 0) goto L120;
    L132:
        if (r41 == 0) goto L134;
        modifier2 = Modifier.Companion;
    L134:
        if (r6 == 0) goto L136;
        r7 = null;
    L136:
        if (r8 == 0) goto L138;
        r9 = null;
    L138:
        if (r10 == 0) goto L141;
        r11 = null;
    L141:
        if ((r43 & 64) == 0) goto L144;
        $dirty4 = $dirty4 & (-3670017);
        shape2 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getMedium();
    L144:
        if ((r43 & 128) == 0) goto L146;
        $dirty4 = $dirty4 & (-29360129);
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
    L148:
        if ((r43 & 256) == 0) goto L150;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty4 >> 21) & 14);
        $dirty4 = $dirty4 & (-234881025);
    L151:
        if ($dirty5 == 0) goto L153;
        DialogProperties properties2 = new DialogProperties(false, false, false, 7, null);
        long backgroundColor3 = backgroundColor2;
        Function2<? super Composer, ? super Integer, Unit> r18 = r9;
        int $dirty6 = $dirty4;
        long contentColor3 = contentColor2;
        Function2<? super Composer, ? super Integer, Unit> r19 = r11;
    L154:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L157;
        ComposerKt.traceEventStart(-606536823, $dirty6, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:41)");
    L157:
        int $changed$iv = ((((((((($dirty6 & 14) | ($dirty6 & 112)) | ($dirty6 & 896)) | ($dirty6 & 7168)) | (57344 & $dirty6)) | (458752 & $dirty6)) | (3670016 & $dirty6)) | (29360128 & $dirty6)) | (234881024 & $dirty6)) | (1879048192 & $dirty6);
        Modifier modifier$iv = modifier2;
        Shape shape$iv = shape2;
        DialogProperties properties$iv = properties2;
        ComposerKt.sourceInformationMarkerStart($composer2, 1114174731, "CC(AlertDialogImpl)P(5,1,4,3,9,8,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color)151@6968L386,149@6892L677:AlertDialog.kt#jmzs0o");
        Composer $composer3 = $composer2;
        m1519AlertDialogwqdebIU(r15, ComposableLambdaKt.rememberComposableLambda(1167440211, true, new AlertDialogKt$AlertDialogImpl$1(r7, r30), $composer2, 54), modifier$iv, r18, r19, shape$iv, backgroundColor3, contentColor3, properties$iv, $composer3, (((((((($changed$iv & 14) | 48) | ($changed$iv & 896)) | (($changed$iv >> 3) & 7168)) | (($changed$iv >> 3) & 57344)) | (($changed$iv >> 3) & 458752)) | (($changed$iv >> 3) & 3670016)) | (($changed$iv >> 3) & 29360128)) | (234881024 & ($changed$iv >> 3)), 0);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L160;
        ComposerKt.traceEventEnd();
    L160:
        final Modifier modifier3 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> r5 = r7;
        final Shape shape3 = shape2;
        final Function2<? super Composer, ? super Integer, Unit> r12 = r18;
        final Function2<? super Composer, ? super Integer, Unit> r13 = r19;
        final long backgroundColor4 = backgroundColor3;
        final long contentColor4 = contentColor3;
        final DialogProperties properties3 = properties2;
    L162:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L166;
        r16.updateScope(new AndroidAlertDialog_androidKt$AlertDialog$1(r29, r30, modifier3, r5, r12, r13, shape3, backgroundColor4, contentColor4, properties3, $changed, r43));
        return;
    L166:
        return;
    L153:
        properties2 = properties;
        backgroundColor3 = backgroundColor2;
        r18 = r9;
        $dirty6 = $dirty4;
        contentColor3 = contentColor2;
        r19 = r11;
        goto L154
    L150:
        contentColor2 = contentColor;
        goto L151
    L146:
        backgroundColor2 = backgroundColor;
        goto L148
    L120:
        if ($composer2.getDefaultsInvalid() == true) goto L132;
        $composer2.skipToGroupEnd();
        if ((r43 & 64) == 0) goto L126;
        $dirty4 = $dirty4 & (-3670017);
    L126:
        if ((r43 & 128) == 0) goto L129;
        $dirty4 = $dirty4 & (-29360129);
    L129:
        if ((r43 & 256) == 0) goto L131;
        backgroundColor3 = backgroundColor;
        contentColor3 = contentColor;
        $dirty6 = $dirty4 & (-234881025);
        r18 = r9;
        r19 = r11;
        properties2 = properties;
        goto L154
    L131:
        backgroundColor3 = backgroundColor;
        contentColor3 = contentColor;
        properties2 = properties;
        r18 = r9;
        r19 = r11;
        $dirty6 = $dirty4;
        goto L154
    L161:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier3 = modifier2;
        r5 = r7;
        r12 = r9;
        r13 = r11;
        shape3 = shape2;
        backgroundColor4 = backgroundColor;
        contentColor4 = contentColor;
        properties3 = properties;
        goto L162
    L114:
        r1 = false;
        goto L116
    L104:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(properties) == false) goto L108;
        int r110 = 536870912;
    L109:
        $dirty4 = $dirty4 | r110;
        goto L112
    L108:
        r110 = 268435456;
        goto L109
    L81:
        if ((r43 & 128) != 0) goto L85;
        int $dirty7 = $dirty;
        r41 = r4;
        if ($composer2.changed(backgroundColor) == false) goto L86;
        int r17 = 8388608;
    L87:
        $dirty2 = $dirty7 | r17;
    L86:
        r17 = 4194304;
        goto L87
    L85:
        $dirty7 = $dirty;
        r41 = r4;
        goto L86
    L70:
        if ((r43 & 64) != 0) goto L74;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L75;
        int r111 = 1048576;
    L76:
        $dirty = $dirty | r111;
    L75:
        r111 = 524288;
        goto L76
    L74:
        shape2 = shape;
        goto L75
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r11 = r34;
        if ($composer2.changedInstance(r11) == false) goto L64;
        int r14 = 131072;
    L65:
        $dirty = $dirty | r14;
        goto L68
    L64:
        r14 = 65536;
        goto L65
    L66:
        r11 = r34;
        goto L68
    L49:
        if (($changed & 24576) != 0) goto L55;
        r9 = r33;
        if ($composer2.changedInstance(r9) == false) goto L53;
        int r112 = 16384;
    L54:
        $dirty = $dirty | r112;
        goto L56
    L53:
        r112 = 8192;
        goto L54
    L55:
        r9 = r33;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r7 = r32;
        if ($composer2.changedInstance(r7) == false) goto L42;
        int r20 = 2048;
    L43:
        $dirty = $dirty | r20;
        goto L45
    L42:
        r20 = 1024;
        goto L43
    L44:
        r7 = r32;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r21 = 256;
    L32:
        $dirty = $dirty | r21;
        goto L34
    L31:
        r21 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L34
    L17:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r30) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L23
    L21:
        r22 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r15 = r29;
        if ($composer2.changedInstance(r15) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L14
    L10:
        r23 = 2;
        goto L11
    L12:
        r15 = r29;
        goto L14
    }

    /* JADX INFO: renamed from: AlertDialog-wqdebIU, reason: not valid java name */
    public static final void m1519AlertDialogwqdebIU(final Function0<Unit> r21, final Function2<? super Composer, ? super Integer, Unit> r22, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r24, Function2<? super Composer, ? super Integer, Unit> r25, Shape shape, long backgroundColor, long contentColor, DialogProperties properties, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(1035523925);
        ComposerKt.sourceInformation($composer2, "C(AlertDialog)P(4,1,3,8,7,6,0:c#ui.graphics.Color,2:c#ui.graphics.Color)66@2168L302:AndroidAlertDialog.android.kt#jmzs0o");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r34 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2<? super Composer, ? super Integer, Unit> r4 = r22;
    L24:
        int r5 = r34 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r7 = r34 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r8 = r24;
    L46:
        int r9 = r34 & 16;
        if (r9 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r10 = r25;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        Shape shape2 = shape;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        long backgroundColor2 = backgroundColor;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        int $dirty2 = $dirty;
    L90:
        int $dirty3 = $dirty2;
        int $dirty4 = r34 & 256;
        if ($dirty4 == 0) goto L94;
        int $dirty5 = $dirty3 | 100663296;
    L102:
        if (($dirty5 & 38347923) == 38347922) goto L104;
        boolean r0 = true;
    L106:
        if ($composer2.shouldExecute(r0, $dirty5 & 1) == false) goto L148;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "77@6236L6,77@6294L6,77@6336L32");
        if (($changed & 1) != 0) goto L110;
    L122:
        if (r5 == 0) goto L124;
        modifier2 = Modifier.Companion;
    L124:
        if (r7 == 0) goto L126;
        r8 = null;
    L126:
        if (r9 == 0) goto L129;
        r10 = null;
    L129:
        if ((r34 & 32) == 0) goto L132;
        $dirty5 = $dirty5 & (-458753);
        shape2 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getMedium();
    L132:
        if ((r34 & 64) == 0) goto L135;
        backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
        $dirty5 = $dirty5 & (-3670017);
    L135:
        if ((r34 & 128) == 0) goto L137;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty5 >> 18) & 14);
        $dirty5 = $dirty5 & (-29360129);
    L138:
        if ($dirty4 == 0) goto L140;
        DialogProperties properties2 = new DialogProperties(false, false, false, 7, null);
        int $dirty6 = $dirty5;
    L141:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L144;
        ComposerKt.traceEventStart(1035523925, $dirty6, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:66)");
    L144:
        int $changed$iv = (((((((($dirty6 & 14) | ($dirty6 & 112)) | ($dirty6 & 896)) | ($dirty6 & 7168)) | (57344 & $dirty6)) | (458752 & $dirty6)) | (3670016 & $dirty6)) | (29360128 & $dirty6)) | (234881024 & $dirty6);
        Modifier modifier$iv = modifier2;
        Shape shape$iv = shape2;
        DialogProperties properties$iv = properties2;
        DialogProperties properties3 = properties2;
        ComposerKt.sourceInformationMarkerStart($composer2, 678652607, "CC(AlertDialogImpl)P(4,1,3,8,7,6,0:c#ui.graphics.Color,2:c#ui.graphics.Color)182@8044L275,182@7975L344:AlertDialog.kt#jmzs0o");
        AndroidDialog_androidKt.Dialog(r21, properties$iv, ComposableLambdaKt.rememberComposableLambda(-66632952, true, new AlertDialogKt$AlertDialogImpl$2(r4, modifier$iv, r8, r10, shape$iv, backgroundColor2, contentColor2), $composer2, 54), $composer2, (($changed$iv & 14) | 384) | (($changed$iv >> 21) & 112), 0);
        Composer $composer3 = $composer2;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L147;
        ComposerKt.traceEventEnd();
    L147:
        final Modifier modifier3 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> r6 = r10;
        final Shape shape3 = shape2;
        final DialogProperties properties4 = properties3;
        final long contentColor3 = contentColor2;
        final Function2<? super Composer, ? super Integer, Unit> r11 = r8;
        final long backgroundColor3 = backgroundColor2;
    L149:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L153;
        r14.updateScope(new AndroidAlertDialog_androidKt$AlertDialog$2(r21, r22, modifier3, r11, r6, shape3, backgroundColor3, contentColor3, properties4, $changed, r34));
        return;
    L153:
        return;
    L140:
        properties2 = properties;
        $dirty6 = $dirty5;
        goto L141
    L137:
        contentColor2 = contentColor;
        goto L138
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L122;
        $composer2.skipToGroupEnd();
        if ((r34 & 32) == 0) goto L116;
        $dirty5 = $dirty5 & (-458753);
    L116:
        if ((r34 & 64) == 0) goto L119;
        $dirty5 = $dirty5 & (-3670017);
    L119:
        if ((r34 & 128) == 0) goto L121;
        contentColor2 = contentColor;
        $dirty6 = $dirty5 & (-29360129);
        properties2 = properties;
        goto L141
    L121:
        contentColor2 = contentColor;
        properties2 = properties;
        $dirty6 = $dirty5;
        goto L141
    L148:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier3 = modifier2;
        r6 = r10;
        shape3 = shape2;
        contentColor3 = contentColor;
        properties4 = properties;
        r11 = r8;
        backgroundColor3 = backgroundColor2;
        goto L149
    L104:
        r0 = false;
        goto L106
    L94:
        if (($changed & 100663296) == 0) goto L96;
        $dirty5 = $dirty3;
        goto L102
    L96:
        if ($composer2.changed(properties) == false) goto L98;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty5 = $dirty3 | r18;
        goto L102
    L98:
        r18 = 33554432;
        goto L99
    L82:
        if ((r34 & 128) != 0) goto L86;
        int $dirty7 = $dirty;
        if ($composer2.changed(contentColor) == false) goto L87;
        int r1 = 8388608;
    L88:
        $dirty2 = $dirty7 | r1;
    L87:
        r1 = 4194304;
        goto L88
    L86:
        $dirty7 = $dirty;
        goto L87
    L71:
        if ((r34 & 64) != 0) goto L75;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
    L76:
        r16 = 524288;
        goto L77
    L75:
        backgroundColor2 = backgroundColor;
        goto L76
    L60:
        if ((r34 & 32) != 0) goto L64;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
    L65:
        r15 = 65536;
        goto L66
    L64:
        shape2 = shape;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        r10 = r25;
        if ($composer2.changedInstance(r10) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
        goto L58
    L54:
        r12 = 8192;
        goto L55
    L56:
        r10 = r25;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = r24;
        if ($composer2.changedInstance(r8) == false) goto L43;
        int r13 = 2048;
    L44:
        $dirty = $dirty | r13;
        goto L46
    L43:
        r13 = 1024;
        goto L44
    L45:
        r8 = r24;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r17 = 256;
    L33:
        $dirty = $dirty | r17;
        goto L35
    L32:
        r17 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = r22;
        if ($composer2.changedInstance(r4) == false) goto L21;
        int r19 = 32;
    L22:
        $dirty = $dirty | r19;
        goto L24
    L21:
        r19 = 16;
        goto L22
    L23:
        r4 = r22;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changedInstance(r21) == false) goto L10;
        int r20 = 4;
    L11:
        $dirty = $dirty | r20;
        goto L14
    L10:
        r20 = 2;
        goto L11
    }
}
