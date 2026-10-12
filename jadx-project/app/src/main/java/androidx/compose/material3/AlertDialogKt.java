package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlertDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u001aB\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a¦\u0001\u0010\u0019\u001a\u00020\u000f2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\u0002\b\u00172\u0013\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\u0002\b\u00172\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\u0002\b\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a5\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00012\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0002\b\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001aÇ\u0001\u0010.\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0002\b\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\u0002\b\u00172\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\u0002\b\u00172\u0013\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\u0002\b\u00172\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\u0002\b\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aB\u00103\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\b\u0010\u0006\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"ButtonsCrossAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonsMainAxisSpacing", "DialogMaxWidth", "getDialogMaxWidth", "()F", "DialogMinWidth", "getDialogMinWidth", "DialogPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "IconPadding", "TextPadding", "TitlePadding", "AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "AlertDialogContent", "buttons", "icon", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "buttonContentColor", "iconContentColor", "titleContentColor", "textContentColor", "AlertDialogContent-4hvqGtA", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JFJJJJLandroidx/compose/runtime/Composer;III)V", "AlertDialogFlowRow", "mainAxisSpacing", "crossAxisSpacing", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogImpl", "confirmButton", "dismissButton", "AlertDialogImpl-wrnwzgE", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "BasicAlertDialog", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AlertDialogKt {
    private static final float ButtonsCrossAxisSpacing = 0.0f;
    private static final float ButtonsMainAxisSpacing = 0.0f;
    private static final float DialogMaxWidth = 0.0f;
    private static final float DialogMinWidth = 0.0f;
    private static final PaddingValues DialogPadding = null;
    private static final PaddingValues IconPadding = null;
    private static final PaddingValues TextPadding = null;
    private static final PaddingValues TitlePadding = null;

    public static final /* synthetic */ float access$getButtonsCrossAxisSpacing$p() {
        return ButtonsCrossAxisSpacing;
    }

    public static final /* synthetic */ float access$getButtonsMainAxisSpacing$p() {
        return ButtonsMainAxisSpacing;
    }

    public static final /* synthetic */ PaddingValues access$getDialogPadding$p() {
        return DialogPadding;
    }

    public static final /* synthetic */ PaddingValues access$getIconPadding$p() {
        return IconPadding;
    }

    public static final /* synthetic */ PaddingValues access$getTextPadding$p() {
        return TextPadding;
    }

    public static final /* synthetic */ PaddingValues access$getTitlePadding$p() {
        return TitlePadding;
    }

    public static final void BasicAlertDialog(final Function0<Unit> r19, Modifier modifier, DialogProperties properties, final Function2<? super Composer, ? super Integer, Unit> r22, Composer $composer, final int $changed, final int r25) {
        Composer $composer2 = $composer.startRestartGroup(-1922902937);
        ComposerKt.sourceInformation($composer2, "C(BasicAlertDialog)P(2,1,3)149@6931L384,146@6839L476:AlertDialog.kt#uh7d8r");
        int $dirty = $changed;
        if ((r25 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r6 = r19;
    L13:
        int r2 = r25 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r3 = modifier;
    L24:
        int r7 = r25 & 4;
        if (r7 == 0) goto L28;
        $dirty = $dirty | 384;
        DialogProperties r8 = properties;
    L36:
        if ((r25 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L45:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L48;
    L51:
        if (r2 == 0) goto L53;
        final Modifier.Companion modifier2 = Modifier.Companion;
    L54:
        if (r7 == 0) goto L56;
        DialogProperties properties2 = new DialogProperties(false, false, false, 7, null);
    L58:
        if (ComposerKt.isTraceInProgress() == false) goto L60;
        ComposerKt.traceEventStart(-1922902937, $dirty2, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:145)");
    L60:
        AndroidDialog_androidKt.Dialog(r6, properties2, ComposableLambdaKt.rememberComposableLambda(905289008, true, new C04651(modifier2, r22), $composer2, 54), $composer2, (($dirty2 & 14) | 384) | (($dirty2 >> 3) & 112), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L63;
        ComposerKt.traceEventEnd();
    L63:
        final Modifier modifier3 = modifier2;
        final DialogProperties properties3 = properties2;
    L64:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L68;
        r9.updateScope(new AnonymousClass2(r19, modifier3, properties3, r22, $changed, r25));
        return;
    L68:
        return;
    L56:
        properties2 = r8;
        goto L58
    L53:
        modifier2 = r3;
        goto L54
    L48:
        if ($composer2.getSkipping() == false) goto L51;
        $composer2.skipToGroupEnd();
        modifier3 = r3;
        properties3 = r8;
        goto L64
    L39:
        if (($changed & 3072) != 0) goto L45;
        if ($composer2.changedInstance(r22) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
        goto L45
    L43:
        r10 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        r8 = properties;
        if ($composer2.changed(r8) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
        goto L36
    L32:
        r11 = 128;
        goto L33
    L34:
        r8 = properties;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L21;
        int r12 = 32;
    L22:
        $dirty = $dirty | r12;
        goto L24
    L21:
        r12 = 16;
        goto L22
    L23:
        r3 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r6 = r19;
        if ($composer2.changedInstance(r6) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L13
    L10:
        r4 = 2;
        goto L11
    L12:
        r6 = r19;
        goto L13
    }

    @Deprecated(message = "Use BasicAlertDialog instead", replaceWith = @ReplaceWith(expression = "BasicAlertDialog(onDismissRequest, modifier, properties, content)", imports = {}))
    public static final void AlertDialog(final Function0<Unit> r20, Modifier modifier, DialogProperties properties, final Function2<? super Composer, ? super Integer, Unit> r23, Composer $composer, final int $changed, final int r26) {
        Composer $composer2 = $composer.startRestartGroup(325249497);
        ComposerKt.sourceInformation($composer2, "C(AlertDialog)P(2,1,3)201@8986L65:AlertDialog.kt#uh7d8r");
        int $dirty = $changed;
        if ((r26 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r6 = r20;
    L13:
        int r2 = r26 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r3 = modifier;
    L24:
        int r4 = r26 & 4;
        if (r4 == 0) goto L28;
        $dirty = $dirty | 384;
        DialogProperties r7 = properties;
    L36:
        if ((r26 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r9 = r23;
    L46:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L49;
    L52:
        if (r2 == 0) goto L54;
        Modifier.Companion modifier2 = Modifier.Companion;
    L55:
        if (r4 == 0) goto L57;
        DialogProperties properties2 = new DialogProperties(false, false, false, 7, null);
    L59:
        if (ComposerKt.isTraceInProgress() == false) goto L61;
        ComposerKt.traceEventStart(325249497, $dirty2, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:201)");
    L61:
        Modifier modifier3 = modifier2;
        BasicAlertDialog(r6, modifier3, properties2, r9, $composer2, ((($dirty2 & 14) | ($dirty2 & 112)) | ($dirty2 & 896)) | ($dirty2 & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L64;
        ComposerKt.traceEventEnd();
    L64:
        final Modifier modifier4 = modifier3;
        final DialogProperties properties3 = properties2;
    L65:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L69;
        r8.updateScope(new AnonymousClass1(r20, modifier4, properties3, r23, $changed, r26));
        return;
    L69:
        return;
    L57:
        properties2 = r7;
        goto L59
    L54:
        modifier2 = r3;
        goto L55
    L49:
        if ($composer2.getSkipping() == false) goto L52;
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        properties3 = r7;
        goto L65
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = r23;
        if ($composer2.changedInstance(r9) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
        goto L46
    L43:
        r10 = 1024;
        goto L44
    L45:
        r9 = r23;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r7 = properties;
        if ($composer2.changed(r7) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
        goto L36
    L32:
        r11 = 128;
        goto L33
    L34:
        r7 = properties;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L21;
        int r5 = 32;
    L22:
        $dirty = $dirty | r5;
        goto L24
    L21:
        r5 = 16;
        goto L22
    L23:
        r3 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r6 = r20;
        if ($composer2.changedInstance(r6) == false) goto L10;
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L13
    L10:
        r12 = 2;
        goto L11
    L12:
        r6 = r20;
        goto L13
    }

    /* JADX INFO: renamed from: AlertDialogImpl-wrnwzgE, reason: not valid java name */
    public static final void m1886AlertDialogImplwrnwzgE(final Function0<Unit> r29, final Function2<? super Composer, ? super Integer, Unit> r30, final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r32, final Function2<? super Composer, ? super Integer, Unit> r33, final Function2<? super Composer, ? super Integer, Unit> r34, final Function2<? super Composer, ? super Integer, Unit> r35, final Shape shape, final long containerColor, final long iconContentColor, final long titleContentColor, final long textContentColor, final float tonalElevation, final DialogProperties properties, Composer $composer, final int $changed, final int $changed1) {
        Composer $composer2 = $composer.startRestartGroup(-919826268);
        ComposerKt.sourceInformation($composer2, "C(AlertDialogImpl)P(6!1,5,2,3,11,9,8,1:c#ui.graphics.Color,4:c#ui.graphics.Color,12:c#ui.graphics.Color,10:c#ui.graphics.Color,13:c#ui.unit.Dp)251@10652L1109,247@10522L1239:AlertDialog.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) != 0) goto L9;
        Function0<Unit> r5 = r29;
        if ($composer2.changedInstance(r5) == false) goto L7;
        int r9 = 4;
    L8:
        $dirty = $dirty | r9;
    L11:
        if (($changed & 48) != 0) goto L19;
        if ($composer2.changedInstance(r30) == false) goto L15;
        int r12 = 32;
    L16:
        $dirty = $dirty | r12;
        goto L19
    L15:
        r12 = 16;
    L19:
        if (($changed & 384) != 0) goto L26;
        if ($composer2.changed(modifier) == false) goto L23;
        int r15 = 256;
    L24:
        $dirty = $dirty | r15;
        goto L26
    L23:
        r15 = 128;
    L26:
        int r16 = 2048;
        if (($changed & 3072) != 0) goto L33;
        Function2<? super Composer, ? super Integer, Unit> r17 = r32;
        if ($composer2.changedInstance(r17) == false) goto L31;
        int r18 = 2048;
    L32:
        $dirty = $dirty | r18;
    L35:
        if (($changed & 24576) != 0) goto L41;
        Function2<? super Composer, ? super Integer, Unit> r6 = r33;
        if ($composer2.changedInstance(r6) == false) goto L39;
        int r19 = 16384;
    L40:
        $dirty = $dirty | r19;
    L43:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L49;
        Function2<? super Composer, ? super Integer, Unit> r8 = r34;
        if ($composer2.changedInstance(r8) == false) goto L47;
        int r110 = 131072;
    L48:
        $dirty = $dirty | r110;
    L51:
        if (($changed & 1572864) != 0) goto L57;
        Function2<? super Composer, ? super Integer, Unit> r10 = r35;
        if ($composer2.changedInstance(r10) == false) goto L55;
        int r20 = 1048576;
    L56:
        $dirty = $dirty | r20;
    L59:
        if (($changed & 12582912) != 0) goto L65;
        Shape r11 = shape;
        if ($composer2.changed(r11) == false) goto L63;
        int r21 = 8388608;
    L64:
        $dirty = $dirty | r21;
    L67:
        if (($changed & 100663296) != 0) goto L73;
        long r13 = containerColor;
        if ($composer2.changed(r13) == false) goto L71;
        int r23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L72:
        $dirty = $dirty | r23;
    L75:
        if (($changed & 805306368) != 0) goto L81;
        int $dirty2 = $dirty;
        if ($composer2.changed(iconContentColor) == false) goto L79;
        int r25 = 536870912;
    L80:
        int $dirty3 = $dirty2 | r25;
    L82:
        int $dirty4 = $dirty3;
        if (($changed1 & 6) != 0) goto L91;
        if ($composer2.changed(titleContentColor) == false) goto L87;
        int r111 = 4;
    L88:
        $dirty1 = $dirty1 | r111;
        goto L91
    L87:
        r111 = 2;
    L91:
        if (($changed1 & 48) != 0) goto L97;
        long r2 = textContentColor;
        if ($composer2.changed(r2) == false) goto L95;
        int r112 = 32;
    L96:
        $dirty1 = $dirty1 | r112;
    L99:
        if (($changed1 & 384) != 0) goto L107;
        if ($composer2.changed(tonalElevation) == false) goto L103;
        int r22 = 256;
    L104:
        $dirty1 = $dirty1 | r22;
        goto L107
    L103:
        r22 = 128;
    L107:
        if (($changed1 & 3072) != 0) goto L115;
        if ($composer2.changed(properties) == true) goto L112;
        r16 = 1024;
    L112:
        $dirty1 = $dirty1 | r16;
    L115:
        if (($dirty4 & 306783379) != 306783378) goto L123;
        if (($dirty1 & 1171) != 1170) goto L123;
        if ($composer2.getSkipping() == false) goto L123;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L128:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L132;
        r0.updateScope(new AlertDialogKt$AlertDialogImpl$2(r29, r30, modifier, r32, r33, r34, r35, shape, containerColor, iconContentColor, titleContentColor, textContentColor, tonalElevation, properties, $changed, $changed1));
        return;
    L132:
        return;
    L123:
        if (ComposerKt.isTraceInProgress() == false) goto L125;
        ComposerKt.traceEventStart(-919826268, $dirty4, $dirty1, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:247)");
    L125:
        final long r24 = r2;
        final Shape r113 = r11;
        final long r114 = r13;
        final Function2<? super Composer, ? super Integer, Unit> r26 = r17;
        final Function2<? super Composer, ? super Integer, Unit> r14 = r6;
        final Function2<? super Composer, ? super Integer, Unit> r115 = r8;
        final Function2<? super Composer, ? super Integer, Unit> r116 = r10;
        BasicAlertDialog(r5, modifier, properties, ComposableLambdaKt.rememberComposableLambda(-1852840226, true, new AlertDialogKt$AlertDialogImpl$1(r14, r115, r116, r113, r114, tonalElevation, iconContentColor, titleContentColor, r24, r26, r30), $composer2, 54), $composer2, ((($dirty4 & 14) | 3072) | (($dirty4 >> 3) & 112)) | (($dirty1 >> 3) & 896), 0);
        $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L128;
        ComposerKt.traceEventEnd();
        goto L128
    L95:
        r112 = 16;
        goto L96
    L97:
        r2 = textContentColor;
        goto L99
    L79:
        r25 = 268435456;
        goto L80
    L81:
        $dirty3 = $dirty;
        goto L82
    L71:
        r23 = 33554432;
        goto L72
    L73:
        r13 = containerColor;
        goto L75
    L63:
        r21 = 4194304;
        goto L64
    L65:
        r11 = shape;
        goto L67
    L55:
        r20 = 524288;
        goto L56
    L57:
        r10 = r35;
        goto L59
    L47:
        r110 = 65536;
        goto L48
    L49:
        r8 = r34;
        goto L51
    L39:
        r19 = 8192;
        goto L40
    L41:
        r6 = r33;
        goto L43
    L31:
        r18 = 1024;
        goto L32
    L33:
        r17 = r32;
        goto L35
    L7:
        r9 = 2;
        goto L8
    L9:
        r5 = r29;
        goto L11
    }

    /* JADX INFO: renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    public static final void m1884AlertDialogContent4hvqGtA(final Function2<? super Composer, ? super Integer, Unit> r29, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r31, final Function2<? super Composer, ? super Integer, Unit> r32, final Function2<? super Composer, ? super Integer, Unit> r33, final Shape shape, final long containerColor, final float tonalElevation, final long buttonContentColor, final long iconContentColor, final long titleContentColor, final long textContentColor, Composer $composer, final int $changed, final int $changed1, final int r49) {
        Composer $composer2 = $composer.startRestartGroup(1522575799);
        ComposerKt.sourceInformation($composer2, "C(AlertDialogContent)P(1,5,3,9,7,6,2:c#ui.graphics.Color,11:c#ui.unit.Dp,0:c#ui.graphics.Color,4:c#ui.graphics.Color,10:c#ui.graphics.Color,8:c#ui.graphics.Color)299@12328L2062,294@12188L2202:AlertDialog.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r49 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function2<? super Composer, ? super Integer, Unit> r5 = r29;
    L13:
        int r8 = r49 & 2;
        if (r8 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L25:
        if ((r49 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        final Function2<? super Composer, ? super Integer, Unit> r15 = r31;
    L36:
        if ((r49 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r12 = r32;
    L47:
        if ((r49 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L58:
        if ((r49 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Shape r6 = shape;
    L69:
        if ((r49 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if ((r49 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
        float r9 = tonalElevation;
    L91:
        if ((r49 & 256) == 0) goto L94;
        int $dirty2 = $dirty | 100663296;
    L102:
        if ((r49 & 512) == 0) goto L105;
        $dirty2 = $dirty2 | 805306368;
    L112:
        int $dirty3 = $dirty2;
        if ((r49 & 1024) == 0) goto L116;
        $dirty1 = $dirty1 | 6;
        long r2 = titleContentColor;
    L124:
        if ((r49 & 2048) == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L135:
        if (($dirty3 & 306783379) == 306783378) goto L137;
    L142:
        if (r8 == 0) goto L145;
        modifier2 = Modifier.Companion;
    L145:
        if (ComposerKt.isTraceInProgress() == false) goto L147;
        ComposerKt.traceEventStart(1522575799, $dirty3, $dirty1, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:293)");
    L147:
        final long r20 = r2;
        final Function2<? super Composer, ? super Integer, Unit> r26 = r5;
        final Function2<? super Composer, ? super Integer, Unit> r16 = r12;
        Modifier modifier3 = modifier2;
        Shape r4 = r6;
        SurfaceKt.m2670SurfaceT9BRK9s(modifier3, r4, containerColor, 0, r9, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-2126308228, true, new AlertDialogKt$AlertDialogContent$1(r15, r16, r33, iconContentColor, r20, textContentColor, buttonContentColor, r26), $composer2, 54), $composer2, ((((($dirty3 >> 3) & 14) | 12582912) | (($dirty3 >> 12) & 112)) | (($dirty3 >> 12) & 896)) | (($dirty3 >> 9) & 57344), LocationRequestCompat.QUALITY_LOW_POWER);
        if (ComposerKt.isTraceInProgress() == false) goto L150;
        ComposerKt.traceEventEnd();
    L150:
        final Modifier modifier4 = modifier3;
    L151:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L155;
        r0.updateScope(new AlertDialogKt$AlertDialogContent$2(r29, modifier4, r31, r32, r33, shape, containerColor, tonalElevation, buttonContentColor, iconContentColor, titleContentColor, textContentColor, $changed, $changed1, r49));
        return;
    L155:
        return;
    L137:
        if (($dirty1 & 19) != 18) goto L142;
        if ($composer2.getSkipping() == false) goto L142;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        goto L151
    L127:
        if (($changed1 & 48) != 0) goto L135;
        if ($composer2.changed(textContentColor) == false) goto L131;
        int r18 = 32;
    L132:
        $dirty1 = $dirty1 | r18;
        goto L135
    L131:
        r18 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L122;
        r2 = titleContentColor;
        if ($composer2.changed(r2) == false) goto L120;
        int r17 = 4;
    L121:
        $dirty1 = $dirty1 | r17;
        goto L124
    L120:
        r17 = 2;
        goto L121
    L122:
        r2 = titleContentColor;
        goto L124
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(iconContentColor) == false) goto L109;
        int r10 = 536870912;
    L110:
        $dirty2 = $dirty2 | r10;
        goto L112
    L109:
        r10 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L100;
        int $dirty4 = $dirty;
        if ($composer2.changed(buttonContentColor) == false) goto L98;
        int r21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty4 | r21;
        goto L102
    L98:
        r21 = 33554432;
        goto L99
    L100:
        $dirty2 = $dirty;
        goto L102
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r9 = tonalElevation;
        if ($composer2.changed(r9) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L91
    L87:
        r19 = 4194304;
        goto L88
    L89:
        r9 = tonalElevation;
        goto L91
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changed(containerColor) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
        goto L80
    L76:
        r110 = 524288;
        goto L77
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r6 = shape;
        if ($composer2.changed(r6) == false) goto L65;
        int r111 = 131072;
    L66:
        $dirty = $dirty | r111;
        goto L69
    L65:
        r111 = 65536;
        goto L66
    L67:
        r6 = shape;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L58;
        if ($composer2.changedInstance(r33) == false) goto L54;
        int r112 = 16384;
    L55:
        $dirty = $dirty | r112;
        goto L58
    L54:
        r112 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        r12 = r32;
        if ($composer2.changedInstance(r12) == false) goto L43;
        int r14 = 2048;
    L44:
        $dirty = $dirty | r14;
        goto L47
    L43:
        r14 = 1024;
        goto L44
    L45:
        r12 = r32;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        r15 = r31;
        if ($composer2.changedInstance(r15) == false) goto L32;
        int r13 = 256;
    L33:
        $dirty = $dirty | r13;
        goto L36
    L32:
        r13 = 128;
        goto L33
    L34:
        r15 = r31;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r113 = 32;
    L22:
        $dirty = $dirty | r113;
        goto L25
    L21:
        r113 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r5 = r29;
        if ($composer2.changedInstance(r5) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L13
    L10:
        r11 = 2;
        goto L11
    L12:
        r5 = r29;
        goto L13
    }

    /* JADX INFO: renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m1885AlertDialogFlowRowixp7dh8(final float mainAxisSpacing, final float crossAxisSpacing, final Function2<? super Composer, ? super Integer, Unit> r25, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(586821353);
        ComposerKt.sourceInformation($composer2, "C(AlertDialogFlowRow)P(2:c#ui.unit.Dp,1:c#ui.unit.Dp)365@14664L3370,365@14648L3386:AlertDialog.kt#uh7d8r");
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
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r25) == false) goto L21;
        int r9 = 256;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 128;
    L24:
        if (($dirty & 147) != 146) goto L30;
        if ($composer2.getSkipping() == false) goto L30;
        $composer2.skipToGroupEnd();
    L65:
        ScopeUpdateScope r4 = $composer2.endRestartGroup();
        if (r4 == null) goto L69;
        r4.updateScope(new AlertDialogKt$AlertDialogFlowRow$2(mainAxisSpacing, crossAxisSpacing, r25, $changed));
        return;
    L69:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(586821353, $dirty, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:364)");
    L32:
        ComposerKt.sourceInformationMarkerStart($composer2, -767073803, "CC(remember):AlertDialog.kt#9igjgp");
        boolean r10 = true;
        if (($dirty & 14) != 4) goto L35;
        boolean r5 = true;
    L37:
        if (($dirty & 112) == 32) goto L40;
        r10 = false;
    L40:
        boolean invalid$iv = r5 | r10;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L43;
    L46:
        MeasurePolicy value$iv = new AlertDialogKt$AlertDialogFlowRow$1$1(mainAxisSpacing, crossAxisSpacing);
        $composer2.updateRememberedValue(value$iv);
    L47:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv = ($dirty >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
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
        Function2<ComposeUiNode, Integer, Unit> r11 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L61;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L61;
    L62:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        r25.invoke($composer2, Integer.valueOf(($changed$iv$iv >> 6) & 14));
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L65;
        ComposerKt.traceEventEnd();
    L61:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r11);
        goto L62
    L53:
        $composer2.useNode();
        goto L54
    L43:
        if (it$iv == Composer.Companion.getEmpty()) goto L46;
        value$iv = it$iv;
        goto L47
    L35:
        r5 = false;
        goto L37
    }

    static {
        DialogMinWidth = Dp.m6973constructorimpl(280);
        DialogMaxWidth = Dp.m6973constructorimpl(560);
        ButtonsMainAxisSpacing = Dp.m6973constructorimpl(8);
        ButtonsCrossAxisSpacing = Dp.m6973constructorimpl(12);
        DialogPadding = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(24));
        IconPadding = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6973constructorimpl(16), 7, null);
        TitlePadding = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6973constructorimpl(16), 7, null);
        TextPadding = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6973constructorimpl(24), 7, null);
    }

    public static final float getDialogMinWidth() {
        return DialogMinWidth;
    }

    public static final float getDialogMaxWidth() {
        return DialogMaxWidth;
    }
}
