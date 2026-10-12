package androidx.compose.material;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Strings.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"getString", "", "string", "Landroidx/compose/material/Strings;", "getString-4foXLRw", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Strings_androidKt {
    /* JADX INFO: renamed from: getString-4foXLRw, reason: not valid java name */
    public static final String m1781getString4foXLRw(int string, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -726638443, "C(getString)P(0:c#material.Strings)26@969L7,27@1010L7:Strings.android.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-726638443, $changed, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
    L5:
        ProvidableCompositionLocal<Configuration> r0 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        CompositionLocal this_$iv = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(this_$iv);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Resources resources = ((Context) r3).getResources();
        if (Strings.m1769equalsimpl0(string, Strings.Companion.m1777getNavigationMenuUdPEhr4()) == false) goto L9;
        String r1 = resources.getString(androidx.compose.ui.R.string.navigation_menu);
    L31:
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L9:
        if (Strings.m1769equalsimpl0(string, Strings.Companion.m1773getCloseDrawerUdPEhr4()) == false) goto L12;
        r1 = resources.getString(androidx.compose.ui.R.string.close_drawer);
        goto L31
    L12:
        if (Strings.m1769equalsimpl0(string, Strings.Companion.m1774getCloseSheetUdPEhr4()) == false) goto L15;
        r1 = resources.getString(androidx.compose.ui.R.string.close_sheet);
        goto L31
    L15:
        if (Strings.m1769equalsimpl0(string, Strings.Companion.m1775getDefaultErrorMessageUdPEhr4()) == false) goto L18;
        r1 = resources.getString(androidx.compose.ui.R.string.default_error_message);
        goto L31
    L18:
        if (Strings.m1769equalsimpl0(string, Strings.Companion.m1776getExposedDropdownMenuUdPEhr4()) == false) goto L21;
        r1 = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
        goto L31
    L21:
        if (Strings.m1769equalsimpl0(string, Strings.Companion.m1779getSliderRangeStartUdPEhr4()) == false) goto L24;
        r1 = resources.getString(androidx.compose.ui.R.string.range_start);
        goto L31
    L24:
        if (Strings.m1769equalsimpl0(string, Strings.Companion.m1778getSliderRangeEndUdPEhr4()) == false) goto L27;
        r1 = resources.getString(androidx.compose.ui.R.string.range_end);
        goto L31
    L27:
        if (Strings.m1769equalsimpl0(string, Strings.Companion.m1780getSnackbarPaneTitleUdPEhr4()) == false) goto L29;
        r1 = resources.getString(R.string.mc2_snackbar_pane_title);
        goto L31
    L29:
        r1 = "";
        goto L31
    }
}
