package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: DatePickerDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009a\u0001\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u0017¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"DialogButtonsCrossAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "DialogButtonsMainAxisSpacing", "DialogButtonsPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "shape", "Landroidx/compose/ui/graphics/Shape;", "tonalElevation", "colors", "Landroidx/compose/material3/DatePickerColors;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DatePickerDialog-GmEhDVc", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DatePickerDialog_androidKt {
    private static final float DialogButtonsCrossAxisSpacing = 0.0f;
    private static final float DialogButtonsMainAxisSpacing = 0.0f;
    private static final PaddingValues DialogButtonsPadding = null;

    public static final /* synthetic */ float access$getDialogButtonsCrossAxisSpacing$p() {
        return DialogButtonsCrossAxisSpacing;
    }

    public static final /* synthetic */ float access$getDialogButtonsMainAxisSpacing$p() {
        return DialogButtonsMainAxisSpacing;
    }

    public static final /* synthetic */ PaddingValues access$getDialogButtonsPadding$p() {
        return DialogButtonsPadding;
    }

    /* JADX INFO: renamed from: DatePickerDialog-GmEhDVc, reason: not valid java name */
    public static final void m2152DatePickerDialogGmEhDVc(final Function0<Unit> r24, final Function2<? super Composer, ? super Integer, Unit> r25, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r27, Shape shape, float tonalElevation, DatePickerColors colors, DialogProperties properties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(-36517340);
        ComposerKt.sourceInformation($composer2, "C(DatePickerDialog)P(5,1,4,3,7,8:c#ui.unit.Dp!1,6)71@3518L5,73@3635L8,81@3937L1615,77@3787L1765:DatePickerDialog.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r2 = r24;
    L14:
        if ((r35 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r4 = r35 & 4;
        if (r4 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r7 = r35 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r8 = r27;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Shape shape2 = shape;
    L57:
        int r12 = r35 & 32;
        if (r12 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float tonalElevation2 = tonalElevation;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        final DatePickerColors colors2 = colors;
    L79:
        int r15 = r35 & 128;
        if (r15 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if ((r35 & 256) == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int $dirty2 = $dirty;
        if (($dirty & 38347923) == 38347922) goto L104;
    L107:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L110;
    L120:
        if (r4 == 0) goto L122;
        modifier2 = Modifier.Companion;
    L122:
        if (r7 == 0) goto L125;
        r8 = null;
    L125:
        if ((r35 & 16) == 0) goto L127;
        int $dirty3 = $dirty2 & (-57345);
        shape2 = DatePickerDefaults.INSTANCE.getShape($composer2, 6);
    L128:
        if (r12 == 0) goto L131;
        tonalElevation2 = DatePickerDefaults.INSTANCE.m2151getTonalElevationD9Ej5fM();
    L131:
        if ((r35 & 64) == 0) goto L133;
        $dirty3 = $dirty3 & (-3670017);
        colors2 = DatePickerDefaults.INSTANCE.colors($composer2, 6);
    L133:
        if (r15 == 0) goto L135;
        Modifier modifier3 = modifier2;
        final float tonalElevation3 = tonalElevation2;
        DialogProperties properties2 = new DialogProperties(false, false, false, 3, null);
        final Function2<? super Composer, ? super Integer, Unit> r17 = r8;
        final Shape shape3 = shape2;
        int $dirty4 = $dirty3;
    L136:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L139;
        ComposerKt.traceEventStart(-36517340, $dirty4, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:76)");
    L139:
        AlertDialogKt.BasicAlertDialog(r2, SizeKt.wrapContentHeight$default(modifier3, null, false, 3, null), properties2, ComposableLambdaKt.rememberComposableLambda(-10625622, true, new DatePickerDialog_androidKt$DatePickerDialog$1(shape3, colors2, tonalElevation3, r32, r17, r25), $composer2, 54), $composer2, (($dirty4 & 14) | 3072) | (($dirty4 >> 15) & 896), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L142;
        ComposerKt.traceEventEnd();
    L142:
        final Shape shape4 = shape3;
        final float tonalElevation4 = tonalElevation3;
        final Function2<? super Composer, ? super Integer, Unit> r5 = r17;
        final DialogProperties properties3 = properties2;
        final Modifier modifier4 = modifier3;
        final DatePickerColors colors3 = colors2;
    L143:
        ScopeUpdateScope r14 = $composer2.endRestartGroup();
        if (r14 == null) goto L147;
        r14.updateScope(new DatePickerDialog_androidKt$DatePickerDialog$2(r24, r25, modifier4, r5, shape4, tonalElevation4, colors3, properties3, r32, $changed, r35));
        return;
    L147:
        return;
    L135:
        properties2 = properties;
        modifier3 = modifier2;
        r17 = r8;
        tonalElevation3 = tonalElevation2;
        $dirty4 = $dirty3;
        shape3 = shape2;
        goto L136
    L127:
        $dirty3 = $dirty2;
        goto L128
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L120;
        $composer2.skipToGroupEnd();
        if ((r35 & 16) == 0) goto L115;
        int $dirty5 = $dirty2 & (-57345);
    L117:
        if ((r35 & 64) == 0) goto L119;
        $dirty5 = $dirty5 & (-3670017);
    L119:
        properties2 = properties;
        r17 = r8;
        tonalElevation3 = tonalElevation2;
        $dirty4 = $dirty5;
        modifier3 = modifier2;
        shape3 = shape2;
        goto L136
    L115:
        $dirty5 = $dirty2;
        goto L117
    L104:
        if ($composer2.getSkipping() == false) goto L107;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        r5 = r8;
        shape4 = shape2;
        tonalElevation4 = tonalElevation2;
        properties3 = properties;
        colors3 = colors2;
        goto L143
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r32) == false) goto L98;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r18;
        goto L101
    L98:
        r18 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(properties) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L91
    L87:
        r19 = 4194304;
        goto L88
    L71:
        if ((r35 & 64) != 0) goto L75;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
    L76:
        r16 = 524288;
        goto L77
    L75:
        colors2 = colors;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        tonalElevation2 = tonalElevation;
        if ($composer2.changed(tonalElevation2) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L69
    L65:
        r110 = 65536;
        goto L66
    L67:
        tonalElevation2 = tonalElevation;
        goto L69
    L49:
        if ((r35 & 16) != 0) goto L53;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L54;
        int r13 = 16384;
    L55:
        $dirty = $dirty | r13;
    L54:
        r13 = 8192;
        goto L55
    L53:
        shape2 = shape;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = r27;
        if ($composer2.changedInstance(r8) == false) goto L43;
        int r9 = 2048;
    L44:
        $dirty = $dirty | r9;
        goto L47
    L43:
        r9 = 1024;
        goto L44
    L45:
        r8 = r27;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
        goto L35
    L32:
        r10 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r25) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r2 = r24;
        if ($composer2.changedInstance(r2) == false) goto L10;
        int r3 = 4;
    L11:
        $dirty = $dirty | r3;
        goto L14
    L10:
        r3 = 2;
        goto L11
    L12:
        r2 = r24;
        goto L14
    }

    static {
        DialogButtonsPadding = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m6973constructorimpl(6), Dp.m6973constructorimpl(8), 3, null);
        DialogButtonsMainAxisSpacing = Dp.m6973constructorimpl(8);
        DialogButtonsCrossAxisSpacing = Dp.m6973constructorimpl(12);
    }
}
