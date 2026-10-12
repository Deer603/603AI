package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aß\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "icon", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "iconContentColor", "titleContentColor", "textContentColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-Oix01E0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidAlertDialog_androidKt {
    /* JADX INFO: renamed from: AlertDialog-Oix01E0, reason: not valid java name */
    public static final void m1889AlertDialogOix01E0(final Function0<Unit> r31, final Function2<? super Composer, ? super Integer, Unit> r32, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r34, Function2<? super Composer, ? super Integer, Unit> r35, Function2<? super Composer, ? super Integer, Unit> r36, Function2<? super Composer, ? super Integer, Unit> r37, Shape shape, long containerColor, long iconContentColor, long titleContentColor, long textContentColor, float tonalElevation, DialogProperties properties, Composer $composer, final int $changed, final int $changed1, final int r52) {
        Composer $composer2 = $composer.startRestartGroup(-2081346864);
        ComposerKt.sourceInformation($composer2, "C(AlertDialog)P(6!1,5,2,3,11,9,8,1:c#ui.graphics.Color,4:c#ui.graphics.Color,12:c#ui.graphics.Color,10:c#ui.graphics.Color,13:c#ui.unit.Dp)62@4918L5,62@4973L14,62@5039L16,62@5108L17,62@5177L16,46@1648L513:AndroidAlertDialog.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((r52 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r52 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r13 = r52 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r8 = modifier;
    L35:
        int r16 = r52 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r9 = r34;
    L46:
        int r20 = r52 & 16;
        if (r20 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r11 = r35;
    L57:
        int r22 = r52 & 32;
        if (r22 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r12 = r36;
    L68:
        int r24 = r52 & 64;
        if (r24 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r14 = r37;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        Shape shape2 = shape;
    L91:
        if (($changed & 100663296) == 0) goto L93;
        int $dirty2 = $dirty;
        int $dirty1 = $changed1;
    L102:
        if (($changed & 805306368) != 0) goto L113;
        if ((r52 & 512) != 0) goto L109;
        if ($composer2.changed(iconContentColor) == false) goto L109;
        int r0 = 536870912;
    L110:
        $dirty2 = $dirty2 | r0;
    L109:
        r0 = 268435456;
    L113:
        if (($changed1 & 6) == 0) goto L115;
        int $dirty3 = $dirty1;
    L123:
        int $dirty4 = $changed1 & 48;
        if ($dirty4 == 0) goto L126;
        long textContentColor2 = textContentColor;
    L134:
        int r3 = r52 & 4096;
        if (r3 == 0) goto L137;
        int $dirty5 = $dirty3 | 384;
    L146:
        int r4 = r52 & 8192;
        if (r4 == 0) goto L149;
        int $dirty6 = $dirty5 | 3072;
    L158:
        if (($dirty2 & 306783379) == 306783378) goto L160;
    L165:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L168;
    L186:
        if (r13 == 0) goto L188;
        Modifier.Companion modifier2 = Modifier.Companion;
    L189:
        if (r16 == 0) goto L191;
        Function2<? super Composer, ? super Integer, Unit> r10 = null;
    L192:
        if (r20 == 0) goto L194;
        r11 = null;
    L194:
        if (r22 == 0) goto L196;
        r12 = null;
    L196:
        if (r24 == 0) goto L199;
        r14 = null;
    L199:
        if ((r52 & 128) == 0) goto L202;
        $dirty2 = $dirty2 & (-29360129);
        shape2 = AlertDialogDefaults.INSTANCE.getShape($composer2, 6);
    L202:
        if ((r52 & 256) == 0) goto L204;
        long containerColor2 = AlertDialogDefaults.INSTANCE.getContainerColor($composer2, 6);
        $dirty2 = $dirty2 & (-234881025);
    L206:
        if ((r52 & 512) == 0) goto L208;
        long iconContentColor2 = AlertDialogDefaults.INSTANCE.getIconContentColor($composer2, 6);
        $dirty2 = $dirty2 & (-1879048193);
    L210:
        if ((r52 & 1024) == 0) goto L212;
        long titleContentColor2 = AlertDialogDefaults.INSTANCE.getTitleContentColor($composer2, 6);
        $dirty6 = $dirty6 & (-15);
    L214:
        if ((r52 & 2048) == 0) goto L216;
        textContentColor2 = AlertDialogDefaults.INSTANCE.getTextContentColor($composer2, 6);
        $dirty6 = $dirty6 & (-113);
    L216:
        if (r3 == 0) goto L218;
        float tonalElevation2 = AlertDialogDefaults.INSTANCE.m1883getTonalElevationD9Ej5fM();
    L219:
        if (r4 == 0) goto L221;
        DialogProperties properties2 = new DialogProperties(false, false, false, 7, null);
        Function2<? super Composer, ? super Integer, Unit> r15 = r12;
        long containerColor3 = containerColor2;
        float tonalElevation3 = tonalElevation2;
        long textContentColor3 = textContentColor2;
        Function2<? super Composer, ? super Integer, Unit> r7 = r10;
        Function2<? super Composer, ? super Integer, Unit> r18 = r11;
        Function2<? super Composer, ? super Integer, Unit> r19 = r14;
        Shape shape3 = shape2;
        long iconContentColor3 = iconContentColor2;
        long titleContentColor3 = titleContentColor2;
        Modifier modifier3 = modifier2;
        int $dirty7 = $dirty2;
    L222:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L225;
        ComposerKt.traceEventStart(-2081346864, $dirty7, $dirty6, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:46)");
    L225:
        Composer $composer3 = $composer2;
        AlertDialogKt.m1886AlertDialogImplwrnwzgE(r31, r32, modifier3, r7, r18, r15, r19, shape3, containerColor3, iconContentColor3, titleContentColor3, textContentColor3, tonalElevation3, properties2, $composer3, ((((((((($dirty7 & 14) | ($dirty7 & 112)) | ($dirty7 & 896)) | ($dirty7 & 7168)) | (57344 & $dirty7)) | (458752 & $dirty7)) | (3670016 & $dirty7)) | (29360128 & $dirty7)) | (234881024 & $dirty7)) | (1879048192 & $dirty7), ((($dirty6 & 14) | ($dirty6 & 112)) | ($dirty6 & 896)) | ($dirty6 & 7168));
        if (ComposerKt.isTraceInProgress() == false) goto L228;
        ComposerKt.traceEventEnd();
    L228:
        final Modifier modifier4 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> r5 = r7;
        final Function2<? super Composer, ? super Integer, Unit> r6 = r18;
        final Function2<? super Composer, ? super Integer, Unit> r21 = r15;
        final Function2<? super Composer, ? super Integer, Unit> r23 = r19;
        final Shape shape4 = shape3;
        final long containerColor4 = containerColor3;
        final long iconContentColor4 = iconContentColor3;
        final long titleContentColor4 = titleContentColor3;
        final long textContentColor4 = textContentColor3;
        final float tonalElevation4 = tonalElevation3;
        final DialogProperties properties3 = properties2;
    L229:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L233;
        r1.updateScope(new AndroidAlertDialog_androidKt$AlertDialog$1(r31, r32, modifier4, r5, r6, r21, r23, shape4, containerColor4, iconContentColor4, titleContentColor4, textContentColor4, tonalElevation4, properties3, $changed, $changed1, r52));
        return;
    L233:
        return;
    L221:
        textContentColor3 = textContentColor2;
        r7 = r10;
        r18 = r11;
        r15 = r12;
        r19 = r14;
        shape3 = shape2;
        containerColor3 = containerColor2;
        iconContentColor3 = iconContentColor2;
        titleContentColor3 = titleContentColor2;
        properties2 = properties;
        modifier3 = modifier2;
        tonalElevation3 = tonalElevation2;
        $dirty7 = $dirty2;
        goto L222
    L218:
        tonalElevation2 = tonalElevation;
        goto L219
    L212:
        titleContentColor2 = titleContentColor;
        goto L214
    L208:
        iconContentColor2 = iconContentColor;
        goto L210
    L204:
        containerColor2 = containerColor;
        goto L206
    L191:
        r10 = r9;
        goto L192
    L188:
        modifier2 = r8;
        goto L189
    L168:
        if ($composer2.getDefaultsInvalid() == true) goto L186;
        $composer2.skipToGroupEnd();
        if ((r52 & 128) == 0) goto L174;
        $dirty2 = $dirty2 & (-29360129);
    L174:
        if ((r52 & 256) == 0) goto L177;
        $dirty2 = $dirty2 & (-234881025);
    L177:
        if ((r52 & 512) == 0) goto L180;
        $dirty2 = $dirty2 & (-1879048193);
    L180:
        if ((r52 & 1024) == 0) goto L183;
        $dirty6 = $dirty6 & (-15);
    L183:
        if ((r52 & 2048) == 0) goto L185;
        $dirty6 = $dirty6 & (-113);
    L185:
        titleContentColor3 = titleContentColor;
        tonalElevation3 = tonalElevation;
        properties2 = properties;
        textContentColor3 = textContentColor2;
        modifier3 = r8;
        r7 = r9;
        r18 = r11;
        r15 = r12;
        r19 = r14;
        shape3 = shape2;
        $dirty7 = $dirty2;
        containerColor3 = containerColor;
        iconContentColor3 = iconContentColor;
        goto L222
    L160:
        if (($dirty6 & 1171) != 1170) goto L165;
        if ($composer2.getSkipping() == false) goto L165;
        $composer2.skipToGroupEnd();
        tonalElevation4 = tonalElevation;
        properties3 = properties;
        $composer3 = $composer2;
        modifier4 = r8;
        r5 = r9;
        r23 = r14;
        shape4 = shape2;
        containerColor4 = containerColor;
        titleContentColor4 = titleContentColor;
        textContentColor4 = textContentColor2;
        r6 = r11;
        r21 = r12;
        iconContentColor4 = iconContentColor;
        goto L229
    L149:
        int $dirty8 = $dirty5;
        int $dirty9 = $changed1 & 3072;
        if ($dirty9 == 0) goto L152;
        $dirty6 = $dirty8;
        goto L158
    L152:
        if ($composer2.changed(properties) == true) goto L155;
        r17 = 1024;
    L155:
        $dirty6 = $dirty8 | r17;
        goto L158
    L137:
        int $dirty10 = $dirty3;
        int $dirty11 = $changed1 & 384;
        if ($dirty11 != 0) goto L145;
        if ($composer2.changed(tonalElevation) == false) goto L142;
        int r26 = 256;
    L143:
        $dirty10 = $dirty10 | r26;
        goto L145
    L142:
        r26 = 128;
    L145:
        $dirty5 = $dirty10;
        goto L146
    L126:
        if ((r52 & 2048) != 0) goto L130;
        textContentColor2 = textContentColor;
        if ($composer2.changed(textContentColor2) == false) goto L131;
        int r25 = 32;
    L132:
        $dirty3 = $dirty3 | r25;
    L131:
        r25 = 16;
        goto L132
    L130:
        textContentColor2 = textContentColor;
        goto L131
    L115:
        if ((r52 & 1024) != 0) goto L120;
        if ($composer2.changed(titleContentColor) == false) goto L120;
        int r110 = 4;
    L121:
        $dirty3 = $dirty1 | r110;
    L120:
        r110 = 2;
        goto L121
    L93:
        if ((r52 & 256) != 0) goto L97;
        int $dirty12 = $dirty;
        $dirty1 = $changed1;
        if ($composer2.changed(containerColor) == false) goto L98;
        int r29 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty12 | r29;
    L98:
        r29 = 33554432;
        goto L99
    L97:
        $dirty12 = $dirty;
        $dirty1 = $changed1;
        goto L98
    L82:
        if ((r52 & 128) != 0) goto L86;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L87;
        int r27 = 8388608;
    L88:
        $dirty = $dirty | r27;
    L87:
        r27 = 4194304;
        goto L88
    L86:
        shape2 = shape;
        goto L87
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r14 = r37;
        if ($composer2.changedInstance(r14) == false) goto L76;
        int r28 = 1048576;
    L77:
        $dirty = $dirty | r28;
        goto L80
    L76:
        r28 = 524288;
        goto L77
    L78:
        r14 = r37;
        goto L80
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r12 = r36;
        if ($composer2.changedInstance(r12) == false) goto L65;
        int r210 = 131072;
    L66:
        $dirty = $dirty | r210;
        goto L68
    L65:
        r210 = 65536;
        goto L66
    L67:
        r12 = r36;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r11 = r35;
        if ($composer2.changedInstance(r11) == false) goto L54;
        int r211 = 16384;
    L55:
        $dirty = $dirty | r211;
        goto L57
    L54:
        r211 = 8192;
        goto L55
    L56:
        r11 = r35;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = r34;
        if ($composer2.changedInstance(r9) == false) goto L43;
        int r212 = 2048;
    L44:
        $dirty = $dirty | r212;
        goto L46
    L43:
        r212 = 1024;
        goto L44
    L45:
        r9 = r34;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r8 = modifier;
        if ($composer2.changed(r8) == false) goto L32;
        int r111 = 256;
    L33:
        $dirty = $dirty | r111;
        goto L35
    L32:
        r111 = 128;
        goto L33
    L34:
        r8 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r32) == false) goto L21;
        int r112 = 32;
    L22:
        $dirty = $dirty | r112;
        goto L24
    L21:
        r112 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changedInstance(r31) == false) goto L10;
        int r113 = 4;
    L11:
        $dirty = $dirty | r113;
        goto L14
    L10:
        r113 = 2;
        goto L11
    }
}
