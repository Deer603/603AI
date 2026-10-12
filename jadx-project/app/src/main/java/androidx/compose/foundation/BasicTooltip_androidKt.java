package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BasicTooltip.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"BasicTooltipBoxAndroid", "", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "tooltip", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "state", "Landroidx/compose/foundation/BasicTooltipState;", "modifier", "Landroidx/compose/ui/Modifier;", "focusable", "", "enableUserInput", "content", "BasicTooltipBox", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BasicTooltip_androidKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility.")
    public static final /* synthetic */ void BasicTooltipBox(final PopupPositionProvider positionProvider, final Function2 tooltip, final BasicTooltipState state, Modifier modifier, boolean focusable, boolean enableUserInput, final Function2 content, Composer $composer, final int $changed, final int r28) {
        Composer $composer2 = $composer.startRestartGroup(-2005652140);
        ComposerKt.sourceInformation($composer2, "C(BasicTooltipBoxAndroid)P(4,6,5,3,2,1)62@2702L247:BasicTooltip.android.kt#71ulvw");
        int $dirty = $changed;
        if ((r28 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        PopupPositionProvider r9 = positionProvider;
    L14:
        if ((r28 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2 r10 = tooltip;
    L25:
        if ((r28 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        BasicTooltipState r11 = state;
    L35:
        int r3 = r28 & 8;
        if (r3 == 0) goto L39;
        $dirty = $dirty | 3072;
        final Modifier modifier2 = modifier;
    L46:
        int r5 = r28 & 16;
        if (r5 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean r6 = focusable;
    L57:
        int r7 = r28 & 32;
        if (r7 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L69:
        if ((r28 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2 r15 = content;
    L80:
        if ((599187 & $dirty) == 599186) goto L82;
        boolean r13 = true;
    L84:
        if ($composer2.shouldExecute(r13, $dirty & 1) == false) goto L101;
        if (r3 == 0) goto L87;
        Modifier modifier3 = Modifier.Companion;
    L88:
        if (r5 == 0) goto L90;
        boolean focusable2 = true;
    L91:
        if (r7 == 0) goto L93;
        boolean enableUserInput2 = true;
    L95:
        if (ComposerKt.isTraceInProgress() == false) goto L97;
        ComposerKt.traceEventStart(-2005652140, $dirty, -1, "androidx.compose.foundation.BasicTooltipBoxAndroid (BasicTooltip.android.kt:61)");
    L97:
        Composer $composer3 = $composer2;
        BasicTooltipKt.BasicTooltipBox(r9, r10, r11, modifier3, focusable2, enableUserInput2, r15, $composer3, (((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L100;
        ComposerKt.traceEventEnd();
    L100:
        modifier2 = modifier3;
        final boolean focusable3 = focusable2;
        final boolean enableUserInput3 = enableUserInput2;
    L102:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L106;
        r12.updateScope(new BasicTooltip_androidKt$BasicTooltipBoxAndroid$1(positionProvider, tooltip, state, modifier2, focusable3, enableUserInput3, content, $changed, r28));
        return;
    L106:
        return;
    L93:
        enableUserInput2 = enableUserInput;
        goto L95
    L90:
        focusable2 = r6;
        goto L91
    L87:
        modifier3 = modifier2;
        goto L88
    L101:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        focusable3 = r6;
        enableUserInput3 = enableUserInput;
        goto L102
    L82:
        r13 = false;
        goto L84
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r15 = content;
        if ($composer2.changedInstance(r15) == false) goto L76;
        int r14 = 1048576;
    L77:
        $dirty = $dirty | r14;
        goto L80
    L76:
        r14 = 524288;
        goto L77
    L78:
        r15 = content;
        goto L80
    L61:
        if ((196608 & $changed) != 0) goto L69;
        if ($composer2.changed(enableUserInput) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
        goto L69
    L65:
        r16 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        r6 = focusable;
        if ($composer2.changed(r6) == false) goto L54;
        int r8 = 16384;
    L55:
        $dirty = $dirty | r8;
        goto L57
    L54:
        r8 = 8192;
        goto L55
    L56:
        r6 = focusable;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
        goto L46
    L43:
        r17 = 1024;
        goto L44
    L45:
        modifier2 = modifier;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r11 = state;
        if ($composer2.changed(r11) == false) goto L32;
        int r4 = 256;
    L33:
        $dirty = $dirty | r4;
        goto L35
    L32:
        r4 = 128;
        goto L33
    L34:
        r11 = state;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r10 = tooltip;
        if ($composer2.changedInstance(r10) == false) goto L21;
        int r18 = 32;
    L22:
        $dirty = $dirty | r18;
        goto L25
    L21:
        r18 = 16;
        goto L22
    L23:
        r10 = tooltip;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = positionProvider;
        if ($composer2.changed(r9) == false) goto L10;
        int r19 = 4;
    L11:
        $dirty = $dirty | r19;
        goto L14
    L10:
        r19 = 2;
        goto L11
    L12:
        r9 = positionProvider;
        goto L14
    }
}
