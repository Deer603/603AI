package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.tokens.FilledAutocompleteTokens;
import androidx.compose.material3.tokens.OutlinedAutocompleteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.PopupProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000bJ\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000eJ\u0082\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0084\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0098\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u0010>\u001a\u00020\u00122\b\b\u0002\u0010?\u001a\u00020\u00122\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u001a\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0082\u0002\u0010I\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010J\u001a\u00020\u00122\b\b\u0002\u0010K\u001a\u00020\u00122\b\b\u0002\u0010L\u001a\u00020\u00122\b\b\u0002\u0010M\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010,J\u0084\u0003\u0010I\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010J\u001a\u00020\u00122\b\b\u0002\u0010K\u001a\u00020\u00122\b\b\u0002\u0010L\u001a\u00020\u00122\b\b\u0002\u0010M\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010=J\u0098\u0003\u0010I\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u0010>\u001a\u00020\u00122\b\b\u0002\u0010?\u001a\u00020\u00122\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010J\u001a\u00020\u00122\b\b\u0002\u0010K\u001a\u00020\u00122\b\b\u0002\u0010L\u001a\u00020\u00122\b\b\u0002\u0010M\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\bP\u0010BR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q²\u0006\n\u0010R\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuDefaults;", "", "()V", "ItemContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "TrailingIcon", "", "expanded", "", "(ZLandroidx/compose/runtime/Composer;I)V", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "outlinedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "containerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-St-qZLY", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "unfocusedTextColor", "errorTextColor", "errorContainerColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "errorPlaceholderColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "outlinedTextFieldColors-tN0la-I", "(JJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "outlinedTextFieldColors-FD9MK7s", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "popupProperties", "Landroidx/compose/ui/window/PopupProperties;", "anchorType", "Landroidx/compose/material3/MenuAnchorType;", "popupProperties-pR6Bxps$material3_release", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/window/PopupProperties;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-St-qZLY", "textFieldColors-tN0la-I", "textFieldColors-FD9MK7s", "material3_release", "a11yServicesEnabled"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = null;
    private static final PaddingValues ItemContentPadding = null;

    private ExposedDropdownMenuDefaults() {
    }

    public final void TrailingIcon(final boolean expanded, Modifier modifier, Composer $composer, final int $changed, final int r17) {
        Composer $composer2 = $composer.startRestartGroup(-1987096744);
        ComposerKt.sourceInformation($composer2, "C(TrailingIcon)520@22966L83:ExposedDropdownMenu.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((r17 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r17 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18) goto L25;
    L28:
        if (r3 == 0) goto L30;
        Modifier.Companion modifier2 = Modifier.Companion;
    L32:
        if (ComposerKt.isTraceInProgress() == false) goto L34;
        ComposerKt.traceEventStart(-1987096744, $dirty2, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:519)");
    L34:
        ImageVector r4 = ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE);
        if (expanded == false) goto L37;
        float r0 = 180.0f;
    L38:
        IconKt.m2277Iconww6aTOc(r4, null, RotateKt.rotate(modifier2, r0), 0, $composer2, 48, 8);
        if (ComposerKt.isTraceInProgress() == false) goto L41;
        ComposerKt.traceEventEnd();
    L41:
        final Modifier modifier3 = modifier2;
    L42:
        ScopeUpdateScope r6 = $composer2.endRestartGroup();
        if (r6 == null) goto L46;
        r6.updateScope(new AnonymousClass1(this, expanded, modifier3, $changed, r17));
        return;
    L46:
        return;
    L37:
        r0 = 0.0f;
        goto L38
    L30:
        modifier2 = modifier;
        goto L32
    L25:
        if ($composer2.getSkipping() == false) goto L28;
        $composer2.skipToGroupEnd();
        modifier3 = modifier;
        goto L42
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changed(modifier) == false) goto L20;
        int r5 = 32;
    L21:
        $dirty = $dirty | r5;
        goto L22
    L20:
        r5 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(expanded) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L12
    L10:
        r7 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: textFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m2215textFieldColorsFD9MK7s(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, TextSelectionColors selectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor, Composer $composer, int $changed, int $changed1, int $changed2, int $changed3, int r180, int r181) {
        ComposerKt.sourceInformationMarkerStart($composer, 768358577, "C(textFieldColors)P(27:c#ui.graphics.Color,37:c#ui.graphics.Color,8:c#ui.graphics.Color,18:c#ui.graphics.Color,20:c#ui.graphics.Color,30:c#ui.graphics.Color,1:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,11:c#ui.graphics.Color,29,21:c#ui.graphics.Color,31:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.graphics.Color,23:c#ui.graphics.Color,33:c#ui.graphics.Color,4:c#ui.graphics.Color,14:c#ui.graphics.Color,28:c#ui.graphics.Color,38:c#ui.graphics.Color,9:c#ui.graphics.Color,19:c#ui.graphics.Color,22:c#ui.graphics.Color,32:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.graphics.Color,24:c#ui.graphics.Color,34:c#ui.graphics.Color,5:c#ui.graphics.Color,15:c#ui.graphics.Color,25:c#ui.graphics.Color,35:c#ui.graphics.Color,6:c#ui.graphics.Color,16:c#ui.graphics.Color,26:c#ui.graphics.Color,36:c#ui.graphics.Color,7:c#ui.graphics.Color,17:c#ui.graphics.Color)573@27038L5,574@27126L5,576@27233L5,579@27421L5,580@27516L5,581@27613L5,582@27709L5,583@27802L5,584@27883L5,585@27979L5,586@28058L7,588@28178L5,590@28293L5,592@28415L5,596@28640L5,598@28756L5,599@28857L5,601@28977L5,605@29196L5,607@29314L5,609@29429L5,611@29551L5,615@29773L5,616@29865L5,617@29954L5,618@30050L5,619@30140L5,620@30238L5,621@30338L5,623@30457L5,626@30657L5,627@30750L5,628@30845L5,630@30959L5,633@31154L5,634@31247L5,635@31342L5,637@31456L5,640@31651L5,642@31709L2230:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((r180 & 1) == 0) goto L5;
        long focusedTextColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), $composer, 6);
    L7:
        if ((r180 & 2) == 0) goto L9;
        long unfocusedTextColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), $composer, 6);
    L11:
        if ((r180 & 4) == 0) goto L13;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), $composer, 6), FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r180 & 8) == 0) goto L17;
        long errorTextColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), $composer, 6);
    L19:
        if ((r180 & 16) == 0) goto L21;
        long focusedContainerColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), $composer, 6);
    L23:
        if ((r180 & 32) == 0) goto L25;
        long unfocusedContainerColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), $composer, 6);
    L27:
        if ((r180 & 64) == 0) goto L29;
        long disabledContainerColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), $composer, 6);
    L31:
        if ((r180 & 128) == 0) goto L33;
        long errorContainerColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), $composer, 6);
    L35:
        if ((r180 & 256) == 0) goto L37;
        long cursorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), $composer, 6);
    L39:
        if ((r180 & 512) == 0) goto L41;
        long errorCursorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), $composer, 6);
    L43:
        if ((r180 & 1024) == 0) goto L45;
        ProvidableCompositionLocal<TextSelectionColors> r7 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer);
        TextSelectionColors selectionColors2 = (TextSelectionColors) r6;
    L47:
        if ((r180 & 2048) == 0) goto L49;
        int r8 = 6;
        long focusedIndicatorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), $composer, 6);
    L51:
        if ((r180 & 4096) == 0) goto L53;
        long unfocusedIndicatorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), $composer, r8);
    L55:
        if ((r180 & 8192) == 0) goto L57;
        long disabledIndicatorColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), $composer, r8), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L58:
        TextSelectionColors selectionColors3 = selectionColors2;
        if ((r180 & 16384) == 0) goto L61;
        int r4 = 6;
        long errorIndicatorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), $composer, 6);
    L63:
        if ((r180 & 32768) == 0) goto L65;
        long focusedLeadingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), $composer, r4);
    L67:
        if ((r180 & 65536) == 0) goto L69;
        long unfocusedLeadingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), $composer, r4);
    L71:
        if ((r180 & 131072) == 0) goto L73;
        long disabledLeadingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), $composer, r4), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L75:
        if ((r180 & 262144) == 0) goto L77;
        int r9 = 6;
        long errorLeadingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), $composer, 6);
    L79:
        if ((r180 & 524288) == 0) goto L81;
        long focusedTrailingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), $composer, r9);
    L83:
        if ((r180 & 1048576) == 0) goto L85;
        long unfocusedTrailingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), $composer, r9);
    L87:
        if ((r180 & 2097152) == 0) goto L89;
        long disabledTrailingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), $composer, r9), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L91:
        if ((r180 & 4194304) == 0) goto L93;
        int r10 = 6;
        long errorTrailingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), $composer, 6);
    L95:
        if ((r180 & 8388608) == 0) goto L97;
        long focusedLabelColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), $composer, r10);
    L99:
        if ((r180 & 16777216) == 0) goto L101;
        long unfocusedLabelColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), $composer, r10);
    L103:
        if ((r180 & 33554432) == 0) goto L105;
        long disabledLabelColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), $composer, r10);
    L107:
        if ((r180 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L109;
        long errorLabelColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), $composer, r10);
    L111:
        if ((r180 & 134217728) == 0) goto L113;
        long focusedPlaceholderColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r10);
    L115:
        if ((r180 & 268435456) == 0) goto L117;
        long unfocusedPlaceholderColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r10);
    L119:
        if ((r180 & 536870912) == 0) goto L121;
        long disabledPlaceholderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, r10), FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L123:
        if ((r180 & 1073741824) == 0) goto L125;
        int r11 = 6;
        long errorPlaceholderColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L127:
        if ((r181 & 1) == 0) goto L129;
        long focusedPrefixColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r11);
    L131:
        if ((r181 & 2) == 0) goto L133;
        long unfocusedPrefixColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r11);
    L135:
        if ((r181 & 4) == 0) goto L137;
        long disabledPrefixColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, r11), FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L139:
        if ((r181 & 8) == 0) goto L141;
        int r12 = 6;
        long errorPrefixColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L143:
        if ((r181 & 16) == 0) goto L145;
        long focusedSuffixColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r12);
    L147:
        if ((r181 & 32) == 0) goto L149;
        long unfocusedSuffixColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r12);
    L151:
        if ((r181 & 64) == 0) goto L153;
        long disabledSuffixColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, r12), FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L155:
        if ((r181 & 128) == 0) goto L157;
        long errorSuffixColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L159:
        if (ComposerKt.isTraceInProgress() == false) goto L161;
        ComposerKt.traceEventStart(768358577, $changed, $changed1, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:642)");
    L161:
        int r88 = ((((((((($changed & 14) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168)) | ($changed & 57344)) | ($changed & 458752)) | ($changed & 3670016)) | ($changed & 29360128)) | ($changed & 234881024)) | ($changed & 1879048192);
        int r89 = ((((((((($changed1 & 14) | ($changed1 & 112)) | ($changed1 & 896)) | ($changed1 & 7168)) | ($changed1 & 57344)) | ($changed1 & 458752)) | ($changed1 & 3670016)) | ($changed1 & 29360128)) | ($changed1 & 234881024)) | ($changed1 & 1879048192);
        int r90 = ((((((((($changed2 & 14) | ($changed2 & 112)) | ($changed2 & 896)) | ($changed2 & 7168)) | ($changed2 & 57344)) | ($changed2 & 458752)) | ($changed2 & 3670016)) | ($changed2 & 29360128)) | ($changed2 & 234881024)) | ($changed2 & 1879048192);
        int r91 = ((((($changed3 & 14) | (($changed3 << 12) & 458752)) | (($changed3 << 12) & 3670016)) | (($changed3 << 12) & 29360128)) | (($changed3 << 12) & 234881024)) | (($changed3 << 12) & 1879048192);
        int r92 = (((($changed3 >> 18) & 14) | 3072) | (($changed3 >> 18) & 112)) | (($changed3 >> 18) & 896);
        long errorCursorColor3 = errorCursorColor2;
        long errorCursorColor4 = disabledIndicatorColor2;
        long disabledTextColor3 = disabledTextColor2;
        long errorTextColor3 = errorTextColor2;
        long cursorColor3 = cursorColor2;
        long cursorColor4 = unfocusedIndicatorColor2;
        long unfocusedIndicatorColor3 = unfocusedLeadingIconColor2;
        long unfocusedLeadingIconColor3 = focusedTrailingIconColor2;
        long focusedTrailingIconColor3 = errorTrailingIconColor2;
        long errorTrailingIconColor3 = disabledLabelColor2;
        long disabledLabelColor3 = unfocusedPlaceholderColor2;
        long errorContainerColor3 = errorContainerColor2;
        long errorContainerColor4 = focusedIndicatorColor2;
        long focusedIndicatorColor3 = errorIndicatorColor2;
        long errorIndicatorColor3 = disabledLeadingIconColor2;
        long disabledLeadingIconColor3 = unfocusedTrailingIconColor2;
        long unfocusedTrailingIconColor3 = focusedLabelColor2;
        long focusedLabelColor3 = errorLabelColor2;
        long errorLabelColor3 = disabledPlaceholderColor2;
        long focusedLeadingIconColor3 = focusedLeadingIconColor2;
        long focusedLeadingIconColor4 = errorLeadingIconColor2;
        long errorLeadingIconColor3 = disabledTrailingIconColor2;
        long disabledTrailingIconColor3 = unfocusedLabelColor2;
        long unfocusedLabelColor3 = focusedPlaceholderColor2;
        long focusedPlaceholderColor3 = errorPlaceholderColor2;
        TextFieldColors r0 = TextFieldDefaults.INSTANCE.m2801colors0hiis_0(focusedTextColor2, unfocusedTextColor2, disabledTextColor3, errorTextColor3, focusedContainerColor2, unfocusedContainerColor2, disabledContainerColor2, errorContainerColor3, cursorColor3, errorCursorColor3, selectionColors3, errorContainerColor4, cursorColor4, errorCursorColor4, focusedIndicatorColor3, focusedLeadingIconColor3, unfocusedIndicatorColor3, errorIndicatorColor3, focusedLeadingIconColor4, unfocusedLeadingIconColor3, disabledLeadingIconColor3, errorLeadingIconColor3, focusedTrailingIconColor3, unfocusedTrailingIconColor3, disabledTrailingIconColor3, errorTrailingIconColor3, focusedLabelColor3, unfocusedLabelColor3, disabledLabelColor3, errorLabelColor3, focusedPlaceholderColor3, 0, 0, 0, 0, focusedPrefixColor2, unfocusedPrefixColor2, disabledPrefixColor2, errorPrefixColor2, focusedSuffixColor2, unfocusedSuffixColor2, disabledSuffixColor2, errorSuffixColor2, $composer, r88, r89, r90, r91, r92, 0, 15);
        if (ComposerKt.isTraceInProgress() == false) goto L164;
        ComposerKt.traceEventEnd();
    L164:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L157:
        errorSuffixColor2 = errorSuffixColor;
        goto L159
    L153:
        disabledSuffixColor2 = disabledSuffixColor;
        goto L155
    L149:
        unfocusedSuffixColor2 = unfocusedSuffixColor;
        goto L151
    L145:
        focusedSuffixColor2 = focusedSuffixColor;
        goto L147
    L141:
        r12 = 6;
        errorPrefixColor2 = errorPrefixColor;
        goto L143
    L137:
        disabledPrefixColor2 = disabledPrefixColor;
        goto L139
    L133:
        unfocusedPrefixColor2 = unfocusedPrefixColor;
        goto L135
    L129:
        focusedPrefixColor2 = focusedPrefixColor;
        goto L131
    L125:
        r11 = 6;
        errorPlaceholderColor2 = errorPlaceholderColor;
        goto L127
    L121:
        disabledPlaceholderColor2 = disabledPlaceholderColor;
        goto L123
    L117:
        unfocusedPlaceholderColor2 = unfocusedPlaceholderColor;
        goto L119
    L113:
        focusedPlaceholderColor2 = focusedPlaceholderColor;
        goto L115
    L109:
        errorLabelColor2 = errorLabelColor;
        goto L111
    L105:
        disabledLabelColor2 = disabledLabelColor;
        goto L107
    L101:
        unfocusedLabelColor2 = unfocusedLabelColor;
        goto L103
    L97:
        focusedLabelColor2 = focusedLabelColor;
        goto L99
    L93:
        r10 = 6;
        errorTrailingIconColor2 = errorTrailingIconColor;
        goto L95
    L89:
        disabledTrailingIconColor2 = disabledTrailingIconColor;
        goto L91
    L85:
        unfocusedTrailingIconColor2 = unfocusedTrailingIconColor;
        goto L87
    L81:
        focusedTrailingIconColor2 = focusedTrailingIconColor;
        goto L83
    L77:
        r9 = 6;
        errorLeadingIconColor2 = errorLeadingIconColor;
        goto L79
    L73:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L75
    L69:
        unfocusedLeadingIconColor2 = unfocusedLeadingIconColor;
        goto L71
    L65:
        focusedLeadingIconColor2 = focusedLeadingIconColor;
        goto L67
    L61:
        r4 = 6;
        errorIndicatorColor2 = errorIndicatorColor;
        goto L63
    L57:
        disabledIndicatorColor2 = disabledIndicatorColor;
        goto L58
    L53:
        unfocusedIndicatorColor2 = unfocusedIndicatorColor;
        goto L55
    L49:
        r8 = 6;
        focusedIndicatorColor2 = focusedIndicatorColor;
        goto L51
    L45:
        selectionColors2 = selectionColors;
        goto L47
    L41:
        errorCursorColor2 = errorCursorColor;
        goto L43
    L37:
        cursorColor2 = cursorColor;
        goto L39
    L33:
        errorContainerColor2 = errorContainerColor;
        goto L35
    L29:
        disabledContainerColor2 = disabledContainerColor;
        goto L31
    L25:
        unfocusedContainerColor2 = unfocusedContainerColor;
        goto L27
    L21:
        focusedContainerColor2 = focusedContainerColor;
        goto L23
    L17:
        errorTextColor2 = errorTextColor;
        goto L19
    L13:
        disabledTextColor2 = disabledTextColor;
        goto L15
    L9:
        unfocusedTextColor2 = unfocusedTextColor;
        goto L11
    L5:
        focusedTextColor2 = focusedTextColor;
        goto L7
    }

    /* JADX INFO: renamed from: outlinedTextFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m2211outlinedTextFieldColorsFD9MK7s(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, TextSelectionColors selectionColors, long focusedBorderColor, long unfocusedBorderColor, long disabledBorderColor, long errorBorderColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor, Composer $composer, int $changed, int $changed1, int $changed2, int $changed3, int r180, int r181) {
        ComposerKt.sourceInformationMarkerStart($composer, -1567195085, "C(outlinedTextFieldColors)P(27:c#ui.graphics.Color,37:c#ui.graphics.Color,8:c#ui.graphics.Color,18:c#ui.graphics.Color,21:c#ui.graphics.Color,31:c#ui.graphics.Color,2:c#ui.graphics.Color,11:c#ui.graphics.Color,0:c#ui.graphics.Color,12:c#ui.graphics.Color,29,20:c#ui.graphics.Color,30:c#ui.graphics.Color,1:c#ui.graphics.Color,10:c#ui.graphics.Color,23:c#ui.graphics.Color,33:c#ui.graphics.Color,4:c#ui.graphics.Color,14:c#ui.graphics.Color,28:c#ui.graphics.Color,38:c#ui.graphics.Color,9:c#ui.graphics.Color,19:c#ui.graphics.Color,22:c#ui.graphics.Color,32:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.graphics.Color,24:c#ui.graphics.Color,34:c#ui.graphics.Color,5:c#ui.graphics.Color,15:c#ui.graphics.Color,25:c#ui.graphics.Color,35:c#ui.graphics.Color,6:c#ui.graphics.Color,16:c#ui.graphics.Color,26:c#ui.graphics.Color,36:c#ui.graphics.Color,7:c#ui.graphics.Color,17:c#ui.graphics.Color)734@37917L5,735@38007L5,737@38116L5,740@38308L5,745@38624L5,746@38722L5,747@38801L7,748@38900L5,749@38994L5,751@39107L5,754@39305L5,756@39423L5,758@39538L5,760@39660L5,764@39883L5,766@40003L5,768@40120L5,770@40244L5,774@40470L5,775@40564L5,776@40655L5,778@40765L5,781@40958L5,782@41058L5,784@41172L5,786@41293L5,789@41497L5,790@41592L5,791@41689L5,793@41805L5,796@42004L5,797@42099L5,798@42196L5,800@42312L5,803@42511L5,805@42577L2206:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((r180 & 1) == 0) goto L5;
        long focusedTextColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), $composer, 6);
    L7:
        if ((r180 & 2) == 0) goto L9;
        long unfocusedTextColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), $composer, 6);
    L11:
        if ((r180 & 4) == 0) goto L13;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), $composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r180 & 8) == 0) goto L17;
        long errorTextColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), $composer, 6);
    L19:
        if ((r180 & 16) == 0) goto L21;
        long focusedContainerColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L23:
        if ((r180 & 32) == 0) goto L25;
        long unfocusedContainerColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L27:
        if ((r180 & 64) == 0) goto L29;
        long disabledContainerColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L31:
        if ((r180 & 128) == 0) goto L33;
        long errorContainerColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L35:
        if ((r180 & 256) == 0) goto L37;
        long cursorColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), $composer, 6);
    L39:
        if ((r180 & 512) == 0) goto L41;
        long errorCursorColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), $composer, 6);
    L43:
        if ((r180 & 1024) == 0) goto L45;
        ProvidableCompositionLocal<TextSelectionColors> r7 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer);
        TextSelectionColors selectionColors2 = (TextSelectionColors) r6;
    L47:
        if ((r180 & 2048) == 0) goto L49;
        int r8 = 6;
        long focusedBorderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), $composer, 6);
    L51:
        if ((r180 & 4096) == 0) goto L53;
        long unfocusedBorderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), $composer, r8);
    L55:
        if ((r180 & 8192) == 0) goto L57;
        long disabledBorderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), $composer, r8), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L58:
        TextSelectionColors selectionColors3 = selectionColors2;
        if ((r180 & 16384) == 0) goto L61;
        int r4 = 6;
        long errorBorderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), $composer, 6);
    L63:
        if ((r180 & 32768) == 0) goto L65;
        long focusedLeadingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), $composer, r4);
    L67:
        if ((r180 & 65536) == 0) goto L69;
        long unfocusedLeadingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), $composer, r4);
    L71:
        if ((r180 & 131072) == 0) goto L73;
        long disabledLeadingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), $composer, r4), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L75:
        if ((r180 & 262144) == 0) goto L77;
        int r9 = 6;
        long errorLeadingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), $composer, 6);
    L79:
        if ((r180 & 524288) == 0) goto L81;
        long focusedTrailingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), $composer, r9);
    L83:
        if ((r180 & 1048576) == 0) goto L85;
        long unfocusedTrailingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), $composer, r9);
    L87:
        if ((r180 & 2097152) == 0) goto L89;
        long disabledTrailingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), $composer, r9), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L91:
        if ((r180 & 4194304) == 0) goto L93;
        int r10 = 6;
        long errorTrailingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), $composer, 6);
    L95:
        if ((r180 & 8388608) == 0) goto L97;
        long focusedLabelColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), $composer, r10);
    L99:
        if ((r180 & 16777216) == 0) goto L101;
        long unfocusedLabelColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), $composer, r10);
    L103:
        if ((r180 & 33554432) == 0) goto L105;
        long disabledLabelColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), $composer, r10), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L107:
        if ((r180 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L109;
        int r11 = 6;
        long errorLabelColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), $composer, 6);
    L111:
        if ((r180 & 134217728) == 0) goto L113;
        long focusedPlaceholderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r11);
    L115:
        if ((r180 & 268435456) == 0) goto L117;
        long unfocusedPlaceholderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r11);
    L119:
        if ((r180 & 536870912) == 0) goto L121;
        long disabledPlaceholderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, r11), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L123:
        if ((r180 & 1073741824) == 0) goto L125;
        int r12 = 6;
        long errorPlaceholderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L127:
        if ((r181 & 1) == 0) goto L129;
        long focusedPrefixColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r12);
    L131:
        if ((r181 & 2) == 0) goto L133;
        long unfocusedPrefixColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r12);
    L135:
        if ((r181 & 4) == 0) goto L137;
        long disabledPrefixColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, r12), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L139:
        if ((r181 & 8) == 0) goto L141;
        int r13 = 6;
        long errorPrefixColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L143:
        if ((r181 & 16) == 0) goto L145;
        long focusedSuffixColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r13);
    L147:
        if ((r181 & 32) == 0) goto L149;
        long unfocusedSuffixColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r13);
    L151:
        if ((r181 & 64) == 0) goto L153;
        long disabledSuffixColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, r13), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L155:
        if ((r181 & 128) == 0) goto L157;
        long errorSuffixColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L159:
        if (ComposerKt.isTraceInProgress() == false) goto L161;
        ComposerKt.traceEventStart(-1567195085, $changed, $changed1, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:805)");
    L161:
        int r88 = ((((((((($changed & 14) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168)) | ($changed & 57344)) | ($changed & 458752)) | ($changed & 3670016)) | ($changed & 29360128)) | ($changed & 234881024)) | ($changed & 1879048192);
        int r89 = ((((((((($changed1 & 14) | ($changed1 & 112)) | ($changed1 & 896)) | ($changed1 & 7168)) | ($changed1 & 57344)) | ($changed1 & 458752)) | ($changed1 & 3670016)) | ($changed1 & 29360128)) | ($changed1 & 234881024)) | ($changed1 & 1879048192);
        int r90 = ((((((((($changed2 & 14) | ($changed2 & 112)) | ($changed2 & 896)) | ($changed2 & 7168)) | ($changed2 & 57344)) | ($changed2 & 458752)) | ($changed2 & 3670016)) | ($changed2 & 29360128)) | ($changed2 & 234881024)) | ($changed2 & 1879048192);
        int r91 = ((((($changed3 & 14) | (($changed3 << 12) & 458752)) | (($changed3 << 12) & 3670016)) | (($changed3 << 12) & 29360128)) | (($changed3 << 12) & 234881024)) | (($changed3 << 12) & 1879048192);
        int r92 = (((($changed3 >> 18) & 14) | 3072) | (($changed3 >> 18) & 112)) | (($changed3 >> 18) & 896);
        long errorCursorColor3 = errorCursorColor2;
        long errorCursorColor4 = disabledBorderColor2;
        long disabledTextColor3 = disabledTextColor2;
        long errorTextColor3 = errorTextColor2;
        long cursorColor3 = cursorColor2;
        long cursorColor4 = unfocusedBorderColor2;
        long unfocusedBorderColor3 = unfocusedLeadingIconColor2;
        long unfocusedLeadingIconColor3 = focusedTrailingIconColor2;
        long focusedTrailingIconColor3 = errorTrailingIconColor2;
        long errorTrailingIconColor3 = disabledLabelColor2;
        long disabledLabelColor3 = unfocusedPlaceholderColor2;
        long errorContainerColor3 = errorContainerColor2;
        long errorContainerColor4 = focusedBorderColor2;
        long focusedBorderColor3 = errorBorderColor2;
        long errorBorderColor3 = disabledLeadingIconColor2;
        long disabledLeadingIconColor3 = unfocusedTrailingIconColor2;
        long unfocusedTrailingIconColor3 = focusedLabelColor2;
        long focusedLabelColor3 = errorLabelColor2;
        long errorLabelColor3 = disabledPlaceholderColor2;
        long focusedLeadingIconColor3 = focusedLeadingIconColor2;
        long focusedLeadingIconColor4 = errorLeadingIconColor2;
        long errorLeadingIconColor3 = disabledTrailingIconColor2;
        long disabledTrailingIconColor3 = unfocusedLabelColor2;
        long unfocusedLabelColor3 = focusedPlaceholderColor2;
        long focusedPlaceholderColor3 = errorPlaceholderColor2;
        TextFieldColors r0 = OutlinedTextFieldDefaults.INSTANCE.m2470colors0hiis_0(focusedTextColor2, unfocusedTextColor2, disabledTextColor3, errorTextColor3, focusedContainerColor2, unfocusedContainerColor2, disabledContainerColor2, errorContainerColor3, cursorColor3, errorCursorColor3, selectionColors3, errorContainerColor4, cursorColor4, errorCursorColor4, focusedBorderColor3, focusedLeadingIconColor3, unfocusedBorderColor3, errorBorderColor3, focusedLeadingIconColor4, unfocusedLeadingIconColor3, disabledLeadingIconColor3, errorLeadingIconColor3, focusedTrailingIconColor3, unfocusedTrailingIconColor3, disabledTrailingIconColor3, errorTrailingIconColor3, focusedLabelColor3, unfocusedLabelColor3, disabledLabelColor3, errorLabelColor3, focusedPlaceholderColor3, 0, 0, 0, 0, focusedPrefixColor2, unfocusedPrefixColor2, disabledPrefixColor2, errorPrefixColor2, focusedSuffixColor2, unfocusedSuffixColor2, disabledSuffixColor2, errorSuffixColor2, $composer, r88, r89, r90, r91, r92, 0, 15);
        if (ComposerKt.isTraceInProgress() == false) goto L164;
        ComposerKt.traceEventEnd();
    L164:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L157:
        errorSuffixColor2 = errorSuffixColor;
        goto L159
    L153:
        disabledSuffixColor2 = disabledSuffixColor;
        goto L155
    L149:
        unfocusedSuffixColor2 = unfocusedSuffixColor;
        goto L151
    L145:
        focusedSuffixColor2 = focusedSuffixColor;
        goto L147
    L141:
        r13 = 6;
        errorPrefixColor2 = errorPrefixColor;
        goto L143
    L137:
        disabledPrefixColor2 = disabledPrefixColor;
        goto L139
    L133:
        unfocusedPrefixColor2 = unfocusedPrefixColor;
        goto L135
    L129:
        focusedPrefixColor2 = focusedPrefixColor;
        goto L131
    L125:
        r12 = 6;
        errorPlaceholderColor2 = errorPlaceholderColor;
        goto L127
    L121:
        disabledPlaceholderColor2 = disabledPlaceholderColor;
        goto L123
    L117:
        unfocusedPlaceholderColor2 = unfocusedPlaceholderColor;
        goto L119
    L113:
        focusedPlaceholderColor2 = focusedPlaceholderColor;
        goto L115
    L109:
        r11 = 6;
        errorLabelColor2 = errorLabelColor;
        goto L111
    L105:
        disabledLabelColor2 = disabledLabelColor;
        goto L107
    L101:
        unfocusedLabelColor2 = unfocusedLabelColor;
        goto L103
    L97:
        focusedLabelColor2 = focusedLabelColor;
        goto L99
    L93:
        r10 = 6;
        errorTrailingIconColor2 = errorTrailingIconColor;
        goto L95
    L89:
        disabledTrailingIconColor2 = disabledTrailingIconColor;
        goto L91
    L85:
        unfocusedTrailingIconColor2 = unfocusedTrailingIconColor;
        goto L87
    L81:
        focusedTrailingIconColor2 = focusedTrailingIconColor;
        goto L83
    L77:
        r9 = 6;
        errorLeadingIconColor2 = errorLeadingIconColor;
        goto L79
    L73:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L75
    L69:
        unfocusedLeadingIconColor2 = unfocusedLeadingIconColor;
        goto L71
    L65:
        focusedLeadingIconColor2 = focusedLeadingIconColor;
        goto L67
    L61:
        r4 = 6;
        errorBorderColor2 = errorBorderColor;
        goto L63
    L57:
        disabledBorderColor2 = disabledBorderColor;
        goto L58
    L53:
        unfocusedBorderColor2 = unfocusedBorderColor;
        goto L55
    L49:
        r8 = 6;
        focusedBorderColor2 = focusedBorderColor;
        goto L51
    L45:
        selectionColors2 = selectionColors;
        goto L47
    L41:
        errorCursorColor2 = errorCursorColor;
        goto L43
    L37:
        cursorColor2 = cursorColor;
        goto L39
    L33:
        errorContainerColor2 = errorContainerColor;
        goto L35
    L29:
        disabledContainerColor2 = disabledContainerColor;
        goto L31
    L25:
        unfocusedContainerColor2 = unfocusedContainerColor;
        goto L27
    L21:
        focusedContainerColor2 = focusedContainerColor;
        goto L23
    L17:
        errorTextColor2 = errorTextColor;
        goto L19
    L13:
        disabledTextColor2 = disabledTextColor;
        goto L15
    L9:
        unfocusedTextColor2 = unfocusedTextColor;
        goto L11
    L5:
        focusedTextColor2 = focusedTextColor;
        goto L7
    }

    public final PaddingValues getItemContentPadding() {
        return ItemContentPadding;
    }

    static {
        INSTANCE = new ExposedDropdownMenuDefaults();
        ItemContentPadding = PaddingKt.m719PaddingValuesYgX7TsA(ExposedDropdownMenu_androidKt.access$getExposedDropdownMenuItemHorizontalPadding$p(), Dp.m6973constructorimpl(0));
    }

    /* JADX INFO: renamed from: popupProperties-pR6Bxps$material3_release, reason: not valid java name */
    public final PopupProperties m2214popupPropertiespR6Bxps$material3_release(String anchorType, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1724259382, "C(popupProperties)P(0:c#material3.MenuAnchorType)861@45439L35:ExposedDropdownMenu.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1724259382, $changed, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.popupProperties (ExposedDropdownMenu.android.kt:860)");
    L5:
        boolean imeRequired = false;
        State<Boolean> r1 = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, $composer, 0, 3);
        int flags = 393216;
        if (popupProperties_pR6Bxps$lambda$0(r1) == true) goto L9;
        flags = 393216 | 32;
    L9:
        if (MenuAnchorType.m2347equalsimpl0(anchorType, MenuAnchorType.Companion.m2351getPrimaryEditableMg6Rgbw()) == false) goto L11;
    L14:
        imeRequired = true;
    L16:
        if (imeRequired == false) goto L18;
        int flags2 = flags | 8;
    L19:
        PopupProperties r3 = new PopupProperties(flags2, false, false, false, false, false, 62, null);
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventEnd();
    L22:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L18:
        flags2 = flags;
        goto L19
    L11:
        if (MenuAnchorType.m2347equalsimpl0(anchorType, MenuAnchorType.Companion.m2353getSecondaryEditableMg6Rgbw()) == false) goto L16;
        if (popupProperties_pR6Bxps$lambda$0(r1) == true) goto L16;
        goto L14
    }

    private static final boolean popupProperties_pR6Bxps$lambda$0(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public final /* synthetic */ void TrailingIcon(boolean expanded, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-473088613);
        ComposerKt.sourceInformation($composer2, "C(TrailingIcon)886@46586L32:ExposedDropdownMenu.android.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(expanded) == false) goto L7;
        int r1 = 4;
    L8:
        $dirty = $dirty | r1;
        goto L10
    L7:
        r1 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(this) == false) goto L14;
        int r2 = 32;
    L15:
        $dirty = $dirty | r2;
        goto L17
    L14:
        r2 = 16;
    L17:
        if (($dirty & 19) != 18) goto L23;
        if ($composer2.getSkipping() == false) goto L23;
        $composer2.skipToGroupEnd();
        final boolean expanded2 = expanded;
    L28:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L32;
        r8.updateScope(new AnonymousClass2(this, expanded2, $changed));
        return;
    L32:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-473088613, $dirty, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:886)");
    L25:
        expanded2 = expanded;
        TrailingIcon(expanded2, Modifier.Companion, $composer2, (($dirty & 14) | 48) | (($dirty << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L28;
        ComposerKt.traceEventEnd();
        goto L28
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: textFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2217textFieldColorstN0laI(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long containerColor, long errorContainerColor, long cursorColor, long errorCursorColor, TextSelectionColors selectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor, Composer $composer, int $changed, int $changed1, int $changed2, int $changed3, int r165, int r166) {
        ComposerKt.sourceInformationMarkerStart($composer, 611690079, "C(textFieldColors)P(26:c#ui.graphics.Color,35:c#ui.graphics.Color,8:c#ui.graphics.Color,18:c#ui.graphics.Color,0:c#ui.graphics.Color,10:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,28,20:c#ui.graphics.Color,29:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.graphics.Color,22:c#ui.graphics.Color,31:c#ui.graphics.Color,4:c#ui.graphics.Color,14:c#ui.graphics.Color,27:c#ui.graphics.Color,36:c#ui.graphics.Color,9:c#ui.graphics.Color,19:c#ui.graphics.Color,21:c#ui.graphics.Color,30:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.graphics.Color,23:c#ui.graphics.Color,32:c#ui.graphics.Color,5:c#ui.graphics.Color,15:c#ui.graphics.Color,24:c#ui.graphics.Color,33:c#ui.graphics.Color,6:c#ui.graphics.Color,16:c#ui.graphics.Color,25:c#ui.graphics.Color,34:c#ui.graphics.Color,7:c#ui.graphics.Color,17:c#ui.graphics.Color)891@46833L5,892@46921L5,894@47028L5,897@47216L5,898@47304L5,899@47397L5,900@47478L5,901@47574L5,902@47653L7,904@47773L5,906@47888L5,908@48010L5,912@48235L5,914@48351L5,915@48452L5,917@48572L5,921@48791L5,923@48909L5,925@49024L5,927@49146L5,931@49368L5,932@49460L5,933@49549L5,934@49645L5,935@49735L5,936@49833L5,937@49933L5,939@50052L5,942@50252L5,943@50345L5,944@50440L5,946@50554L5,949@50749L5,950@50842L5,951@50937L5,953@51051L5,956@51246L5,958@51286L2215:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((r165 & 1) == 0) goto L5;
        long focusedTextColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), $composer, 6);
    L7:
        if ((r165 & 2) == 0) goto L9;
        long unfocusedTextColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), $composer, 6);
    L11:
        if ((r165 & 4) == 0) goto L13;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), $composer, 6), FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r165 & 8) == 0) goto L17;
        long errorTextColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), $composer, 6);
    L19:
        if ((r165 & 16) == 0) goto L21;
        long containerColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), $composer, 6);
    L23:
        if ((r165 & 32) == 0) goto L25;
        long errorContainerColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), $composer, 6);
    L27:
        if ((r165 & 64) == 0) goto L29;
        long cursorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), $composer, 6);
    L31:
        if ((r165 & 128) == 0) goto L33;
        long errorCursorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), $composer, 6);
    L35:
        if ((r165 & 256) == 0) goto L37;
        ProvidableCompositionLocal<TextSelectionColors> r5 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r5);
        ComposerKt.sourceInformationMarkerEnd($composer);
        TextSelectionColors selectionColors2 = (TextSelectionColors) r4;
    L39:
        if ((r165 & 512) == 0) goto L41;
        int r6 = 6;
        long focusedIndicatorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), $composer, 6);
    L43:
        if ((r165 & 1024) == 0) goto L45;
        long unfocusedIndicatorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), $composer, r6);
    L47:
        if ((r165 & 2048) == 0) goto L49;
        long disabledIndicatorColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), $composer, r6), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L50:
        TextSelectionColors selectionColors3 = selectionColors2;
        if ((r165 & 4096) == 0) goto L53;
        int r7 = 6;
        long errorIndicatorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), $composer, 6);
    L55:
        if ((r165 & 8192) == 0) goto L57;
        long focusedLeadingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), $composer, r7);
    L59:
        if ((r165 & 16384) == 0) goto L61;
        long unfocusedLeadingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), $composer, r7);
    L63:
        if ((32768 & r165) == 0) goto L65;
        long disabledLeadingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), $composer, r7), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L67:
        if ((65536 & r165) == 0) goto L69;
        int r8 = 6;
        long errorLeadingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), $composer, 6);
    L71:
        if ((131072 & r165) == 0) goto L73;
        long focusedTrailingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), $composer, r8);
    L75:
        if ((262144 & r165) == 0) goto L77;
        long unfocusedTrailingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), $composer, r8);
    L79:
        if ((524288 & r165) == 0) goto L81;
        long disabledTrailingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), $composer, r8), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L83:
        if ((1048576 & r165) == 0) goto L85;
        int r9 = 6;
        long errorTrailingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), $composer, 6);
    L87:
        if ((2097152 & r165) == 0) goto L89;
        long focusedLabelColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), $composer, r9);
    L91:
        if ((4194304 & r165) == 0) goto L93;
        long unfocusedLabelColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), $composer, r9);
    L95:
        if ((8388608 & r165) == 0) goto L97;
        long disabledLabelColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), $composer, r9);
    L99:
        if ((16777216 & r165) == 0) goto L101;
        long errorLabelColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), $composer, r9);
    L103:
        if ((33554432 & r165) == 0) goto L105;
        long focusedPlaceholderColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r9);
    L107:
        if ((67108864 & r165) == 0) goto L109;
        long unfocusedPlaceholderColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r9);
    L111:
        if ((134217728 & r165) == 0) goto L113;
        long disabledPlaceholderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, r9), FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L115:
        if ((268435456 & r165) == 0) goto L117;
        int r10 = 6;
        long errorPlaceholderColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L119:
        if ((536870912 & r165) == 0) goto L121;
        long focusedPrefixColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r10);
    L123:
        if ((r165 & 1073741824) == 0) goto L125;
        long unfocusedPrefixColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r10);
    L127:
        if ((r166 & 1) == 0) goto L129;
        long disabledPrefixColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, r10), FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L131:
        if ((r166 & 2) == 0) goto L133;
        int r11 = 6;
        long errorPrefixColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L135:
        if ((r166 & 4) == 0) goto L137;
        long focusedSuffixColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r11);
    L139:
        if ((r166 & 8) == 0) goto L141;
        long unfocusedSuffixColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r11);
    L143:
        if ((r166 & 16) == 0) goto L145;
        long disabledSuffixColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, r11), FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L147:
        if ((r166 & 32) == 0) goto L149;
        long errorSuffixColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L151:
        if (ComposerKt.isTraceInProgress() == false) goto L153;
        ComposerKt.traceEventStart(611690079, $changed, $changed1, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:958)");
    L153:
        int r3 = ((((((((($changed & 14) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168)) | ($changed & 57344)) | (($changed << 3) & 458752)) | (($changed << 6) & 3670016)) | (($changed << 6) & 29360128)) | (($changed << 6) & 234881024)) | (($changed << 6) & 1879048192);
        int r12 = ($changed1 << 6) & 896;
        int r81 = (((((((r12 | ((($changed >> 24) & 14) | (($changed >> 24) & 112))) | (($changed1 << 6) & 7168)) | (($changed1 << 6) & 57344)) | (($changed1 << 6) & 458752)) | (($changed1 << 6) & 3670016)) | (($changed1 << 6) & 29360128)) | (($changed1 << 6) & 234881024)) | (($changed1 << 6) & 1879048192);
        int r82 = (((((((((($changed1 >> 24) & 14) | (($changed1 >> 24) & 112)) | (($changed2 << 6) & 896)) | (($changed2 << 6) & 7168)) | (($changed2 << 6) & 57344)) | (($changed2 << 6) & 458752)) | (($changed2 << 6) & 3670016)) | (($changed2 << 6) & 29360128)) | (($changed2 << 6) & 234881024)) | (($changed2 << 6) & 1879048192);
        int r83 = (((((((((($changed2 >> 24) & 14) | (($changed2 >> 24) & 112)) | (($changed3 << 6) & 896)) | (($changed3 << 6) & 7168)) | (($changed3 << 6) & 57344)) | (($changed3 << 6) & 458752)) | (($changed3 << 6) & 3670016)) | (($changed3 << 6) & 29360128)) | (($changed3 << 6) & 234881024)) | (($changed3 << 6) & 1879048192);
        long containerColor3 = containerColor2;
        long unfocusedIndicatorColor3 = unfocusedIndicatorColor2;
        long unfocusedIndicatorColor4 = disabledIndicatorColor2;
        TextFieldColors r0 = m2215textFieldColorsFD9MK7s(focusedTextColor2, unfocusedTextColor2, disabledTextColor2, errorTextColor2, containerColor3, containerColor2, containerColor3, errorContainerColor2, cursorColor2, errorCursorColor2, selectionColors3, focusedIndicatorColor2, unfocusedIndicatorColor3, unfocusedIndicatorColor4, errorIndicatorColor2, focusedLeadingIconColor2, unfocusedLeadingIconColor2, disabledLeadingIconColor2, errorLeadingIconColor2, focusedTrailingIconColor2, unfocusedTrailingIconColor2, disabledTrailingIconColor2, errorTrailingIconColor2, focusedLabelColor2, unfocusedLabelColor2, disabledLabelColor2, errorLabelColor2, focusedPlaceholderColor2, unfocusedPlaceholderColor2, disabledPlaceholderColor2, errorPlaceholderColor2, focusedPrefixColor2, unfocusedPrefixColor2, disabledPrefixColor2, errorPrefixColor2, focusedSuffixColor2, unfocusedSuffixColor2, disabledSuffixColor2, errorSuffixColor2, $composer, r3, r81, r82, r83, 0, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L156;
        ComposerKt.traceEventEnd();
    L156:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L149:
        errorSuffixColor2 = errorSuffixColor;
        goto L151
    L145:
        disabledSuffixColor2 = disabledSuffixColor;
        goto L147
    L141:
        unfocusedSuffixColor2 = unfocusedSuffixColor;
        goto L143
    L137:
        focusedSuffixColor2 = focusedSuffixColor;
        goto L139
    L133:
        r11 = 6;
        errorPrefixColor2 = errorPrefixColor;
        goto L135
    L129:
        disabledPrefixColor2 = disabledPrefixColor;
        goto L131
    L125:
        unfocusedPrefixColor2 = unfocusedPrefixColor;
        goto L127
    L121:
        focusedPrefixColor2 = focusedPrefixColor;
        goto L123
    L117:
        r10 = 6;
        errorPlaceholderColor2 = errorPlaceholderColor;
        goto L119
    L113:
        disabledPlaceholderColor2 = disabledPlaceholderColor;
        goto L115
    L109:
        unfocusedPlaceholderColor2 = unfocusedPlaceholderColor;
        goto L111
    L105:
        focusedPlaceholderColor2 = focusedPlaceholderColor;
        goto L107
    L101:
        errorLabelColor2 = errorLabelColor;
        goto L103
    L97:
        disabledLabelColor2 = disabledLabelColor;
        goto L99
    L93:
        unfocusedLabelColor2 = unfocusedLabelColor;
        goto L95
    L89:
        focusedLabelColor2 = focusedLabelColor;
        goto L91
    L85:
        r9 = 6;
        errorTrailingIconColor2 = errorTrailingIconColor;
        goto L87
    L81:
        disabledTrailingIconColor2 = disabledTrailingIconColor;
        goto L83
    L77:
        unfocusedTrailingIconColor2 = unfocusedTrailingIconColor;
        goto L79
    L73:
        focusedTrailingIconColor2 = focusedTrailingIconColor;
        goto L75
    L69:
        r8 = 6;
        errorLeadingIconColor2 = errorLeadingIconColor;
        goto L71
    L65:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L67
    L61:
        unfocusedLeadingIconColor2 = unfocusedLeadingIconColor;
        goto L63
    L57:
        focusedLeadingIconColor2 = focusedLeadingIconColor;
        goto L59
    L53:
        r7 = 6;
        errorIndicatorColor2 = errorIndicatorColor;
        goto L55
    L49:
        disabledIndicatorColor2 = disabledIndicatorColor;
        goto L50
    L45:
        unfocusedIndicatorColor2 = unfocusedIndicatorColor;
        goto L47
    L41:
        r6 = 6;
        focusedIndicatorColor2 = focusedIndicatorColor;
        goto L43
    L37:
        selectionColors2 = selectionColors;
        goto L39
    L33:
        errorCursorColor2 = errorCursorColor;
        goto L35
    L29:
        cursorColor2 = cursorColor;
        goto L31
    L25:
        errorContainerColor2 = errorContainerColor;
        goto L27
    L21:
        containerColor2 = containerColor;
        goto L23
    L17:
        errorTextColor2 = errorTextColor;
        goto L19
    L13:
        disabledTextColor2 = disabledTextColor;
        goto L15
    L9:
        unfocusedTextColor2 = unfocusedTextColor;
        goto L11
    L5:
        focusedTextColor2 = focusedTextColor;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: outlinedTextFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2213outlinedTextFieldColorstN0laI(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long containerColor, long errorContainerColor, long cursorColor, long errorCursorColor, TextSelectionColors selectionColors, long focusedBorderColor, long unfocusedBorderColor, long disabledBorderColor, long errorBorderColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor, Composer $composer, int $changed, int $changed1, int $changed2, int $changed3, int r165, int r166) {
        ComposerKt.sourceInformationMarkerStart($composer, -388128543, "C(outlinedTextFieldColors)P(26:c#ui.graphics.Color,35:c#ui.graphics.Color,8:c#ui.graphics.Color,18:c#ui.graphics.Color,0:c#ui.graphics.Color,11:c#ui.graphics.Color,1:c#ui.graphics.Color,12:c#ui.graphics.Color,28,20:c#ui.graphics.Color,29:c#ui.graphics.Color,2:c#ui.graphics.Color,10:c#ui.graphics.Color,22:c#ui.graphics.Color,31:c#ui.graphics.Color,4:c#ui.graphics.Color,14:c#ui.graphics.Color,27:c#ui.graphics.Color,36:c#ui.graphics.Color,9:c#ui.graphics.Color,19:c#ui.graphics.Color,21:c#ui.graphics.Color,30:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.graphics.Color,23:c#ui.graphics.Color,32:c#ui.graphics.Color,5:c#ui.graphics.Color,15:c#ui.graphics.Color,24:c#ui.graphics.Color,33:c#ui.graphics.Color,6:c#ui.graphics.Color,16:c#ui.graphics.Color,25:c#ui.graphics.Color,34:c#ui.graphics.Color,7:c#ui.graphics.Color,17:c#ui.graphics.Color)1003@53726L5,1004@53816L5,1006@53925L5,1009@54117L5,1012@54307L5,1013@54405L5,1014@54484L7,1015@54583L5,1016@54677L5,1018@54790L5,1021@54988L5,1023@55106L5,1025@55221L5,1027@55343L5,1031@55566L5,1033@55686L5,1035@55803L5,1037@55927L5,1041@56153L5,1042@56247L5,1043@56338L5,1045@56448L5,1048@56641L5,1049@56741L5,1051@56855L5,1053@56976L5,1056@57180L5,1057@57275L5,1058@57372L5,1060@57488L5,1063@57687L5,1064@57782L5,1065@57879L5,1067@57995L5,1070@58194L5,1072@58234L2199:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((r165 & 1) == 0) goto L5;
        long focusedTextColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), $composer, 6);
    L7:
        if ((r165 & 2) == 0) goto L9;
        long unfocusedTextColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), $composer, 6);
    L11:
        if ((r165 & 4) == 0) goto L13;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), $composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r165 & 8) == 0) goto L17;
        long errorTextColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), $composer, 6);
    L19:
        if ((r165 & 16) == 0) goto L21;
        long containerColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L23:
        if ((r165 & 32) == 0) goto L25;
        long errorContainerColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L27:
        if ((r165 & 64) == 0) goto L29;
        long cursorColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), $composer, 6);
    L31:
        if ((r165 & 128) == 0) goto L33;
        long errorCursorColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), $composer, 6);
    L35:
        if ((r165 & 256) == 0) goto L37;
        ProvidableCompositionLocal<TextSelectionColors> r5 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r5);
        ComposerKt.sourceInformationMarkerEnd($composer);
        TextSelectionColors selectionColors2 = (TextSelectionColors) r4;
    L39:
        if ((r165 & 512) == 0) goto L41;
        int r6 = 6;
        long focusedBorderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), $composer, 6);
    L43:
        if ((r165 & 1024) == 0) goto L45;
        long unfocusedBorderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), $composer, r6);
    L47:
        if ((r165 & 2048) == 0) goto L49;
        long disabledBorderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), $composer, r6), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L50:
        TextSelectionColors selectionColors3 = selectionColors2;
        if ((r165 & 4096) == 0) goto L53;
        int r7 = 6;
        long errorBorderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), $composer, 6);
    L55:
        if ((r165 & 8192) == 0) goto L57;
        long focusedLeadingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), $composer, r7);
    L59:
        if ((r165 & 16384) == 0) goto L61;
        long unfocusedLeadingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), $composer, r7);
    L63:
        if ((32768 & r165) == 0) goto L65;
        long disabledLeadingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), $composer, r7), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L67:
        if ((65536 & r165) == 0) goto L69;
        int r8 = 6;
        long errorLeadingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), $composer, 6);
    L71:
        if ((131072 & r165) == 0) goto L73;
        long focusedTrailingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), $composer, r8);
    L75:
        if ((262144 & r165) == 0) goto L77;
        long unfocusedTrailingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), $composer, r8);
    L79:
        if ((524288 & r165) == 0) goto L81;
        long disabledTrailingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), $composer, r8), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L83:
        if ((1048576 & r165) == 0) goto L85;
        int r9 = 6;
        long errorTrailingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), $composer, 6);
    L87:
        if ((2097152 & r165) == 0) goto L89;
        long focusedLabelColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), $composer, r9);
    L91:
        if ((4194304 & r165) == 0) goto L93;
        long unfocusedLabelColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), $composer, r9);
    L95:
        if ((8388608 & r165) == 0) goto L97;
        long disabledLabelColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), $composer, r9), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L99:
        if ((16777216 & r165) == 0) goto L101;
        int r10 = 6;
        long errorLabelColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), $composer, 6);
    L103:
        if ((33554432 & r165) == 0) goto L105;
        long focusedPlaceholderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r10);
    L107:
        if ((67108864 & r165) == 0) goto L109;
        long unfocusedPlaceholderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r10);
    L111:
        if ((134217728 & r165) == 0) goto L113;
        long disabledPlaceholderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, r10), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L115:
        if ((268435456 & r165) == 0) goto L117;
        int r11 = 6;
        long errorPlaceholderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L119:
        if ((536870912 & r165) == 0) goto L121;
        long focusedPrefixColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r11);
    L123:
        if ((r165 & 1073741824) == 0) goto L125;
        long unfocusedPrefixColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r11);
    L127:
        if ((r166 & 1) == 0) goto L129;
        long disabledPrefixColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, r11), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L131:
        if ((r166 & 2) == 0) goto L133;
        int r12 = 6;
        long errorPrefixColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L135:
        if ((r166 & 4) == 0) goto L137;
        long focusedSuffixColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r12);
    L139:
        if ((r166 & 8) == 0) goto L141;
        long unfocusedSuffixColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, r12);
    L143:
        if ((r166 & 16) == 0) goto L145;
        long disabledSuffixColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, r12), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L147:
        if ((r166 & 32) == 0) goto L149;
        long errorSuffixColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L151:
        if (ComposerKt.isTraceInProgress() == false) goto L153;
        ComposerKt.traceEventStart(-388128543, $changed, $changed1, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:1072)");
    L153:
        int r3 = ((((((((($changed & 14) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168)) | ($changed & 57344)) | (($changed << 3) & 458752)) | (($changed << 6) & 3670016)) | (($changed << 6) & 29360128)) | (($changed << 6) & 234881024)) | (($changed << 6) & 1879048192);
        int r13 = ($changed1 << 6) & 896;
        int r81 = (((((((r13 | ((($changed >> 24) & 14) | (($changed >> 24) & 112))) | (($changed1 << 6) & 7168)) | (($changed1 << 6) & 57344)) | (($changed1 << 6) & 458752)) | (($changed1 << 6) & 3670016)) | (($changed1 << 6) & 29360128)) | (($changed1 << 6) & 234881024)) | (($changed1 << 6) & 1879048192);
        int r82 = (((((((((($changed1 >> 24) & 14) | (($changed1 >> 24) & 112)) | (($changed2 << 6) & 896)) | (($changed2 << 6) & 7168)) | (($changed2 << 6) & 57344)) | (($changed2 << 6) & 458752)) | (($changed2 << 6) & 3670016)) | (($changed2 << 6) & 29360128)) | (($changed2 << 6) & 234881024)) | (($changed2 << 6) & 1879048192);
        int r83 = (((((((((($changed2 >> 24) & 14) | (($changed2 >> 24) & 112)) | (($changed3 << 6) & 896)) | (($changed3 << 6) & 7168)) | (($changed3 << 6) & 57344)) | (($changed3 << 6) & 458752)) | (($changed3 << 6) & 3670016)) | (($changed3 << 6) & 29360128)) | (($changed3 << 6) & 234881024)) | (($changed3 << 6) & 1879048192);
        long containerColor3 = containerColor2;
        long unfocusedBorderColor3 = unfocusedBorderColor2;
        long unfocusedBorderColor4 = disabledBorderColor2;
        TextFieldColors r0 = m2211outlinedTextFieldColorsFD9MK7s(focusedTextColor2, unfocusedTextColor2, disabledTextColor2, errorTextColor2, containerColor3, containerColor2, containerColor3, errorContainerColor2, cursorColor2, errorCursorColor2, selectionColors3, focusedBorderColor2, unfocusedBorderColor3, unfocusedBorderColor4, errorBorderColor2, focusedLeadingIconColor2, unfocusedLeadingIconColor2, disabledLeadingIconColor2, errorLeadingIconColor2, focusedTrailingIconColor2, unfocusedTrailingIconColor2, disabledTrailingIconColor2, errorTrailingIconColor2, focusedLabelColor2, unfocusedLabelColor2, disabledLabelColor2, errorLabelColor2, focusedPlaceholderColor2, unfocusedPlaceholderColor2, disabledPlaceholderColor2, errorPlaceholderColor2, focusedPrefixColor2, unfocusedPrefixColor2, disabledPrefixColor2, errorPrefixColor2, focusedSuffixColor2, unfocusedSuffixColor2, disabledSuffixColor2, errorSuffixColor2, $composer, r3, r81, r82, r83, 0, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L156;
        ComposerKt.traceEventEnd();
    L156:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L149:
        errorSuffixColor2 = errorSuffixColor;
        goto L151
    L145:
        disabledSuffixColor2 = disabledSuffixColor;
        goto L147
    L141:
        unfocusedSuffixColor2 = unfocusedSuffixColor;
        goto L143
    L137:
        focusedSuffixColor2 = focusedSuffixColor;
        goto L139
    L133:
        r12 = 6;
        errorPrefixColor2 = errorPrefixColor;
        goto L135
    L129:
        disabledPrefixColor2 = disabledPrefixColor;
        goto L131
    L125:
        unfocusedPrefixColor2 = unfocusedPrefixColor;
        goto L127
    L121:
        focusedPrefixColor2 = focusedPrefixColor;
        goto L123
    L117:
        r11 = 6;
        errorPlaceholderColor2 = errorPlaceholderColor;
        goto L119
    L113:
        disabledPlaceholderColor2 = disabledPlaceholderColor;
        goto L115
    L109:
        unfocusedPlaceholderColor2 = unfocusedPlaceholderColor;
        goto L111
    L105:
        focusedPlaceholderColor2 = focusedPlaceholderColor;
        goto L107
    L101:
        r10 = 6;
        errorLabelColor2 = errorLabelColor;
        goto L103
    L97:
        disabledLabelColor2 = disabledLabelColor;
        goto L99
    L93:
        unfocusedLabelColor2 = unfocusedLabelColor;
        goto L95
    L89:
        focusedLabelColor2 = focusedLabelColor;
        goto L91
    L85:
        r9 = 6;
        errorTrailingIconColor2 = errorTrailingIconColor;
        goto L87
    L81:
        disabledTrailingIconColor2 = disabledTrailingIconColor;
        goto L83
    L77:
        unfocusedTrailingIconColor2 = unfocusedTrailingIconColor;
        goto L79
    L73:
        focusedTrailingIconColor2 = focusedTrailingIconColor;
        goto L75
    L69:
        r8 = 6;
        errorLeadingIconColor2 = errorLeadingIconColor;
        goto L71
    L65:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L67
    L61:
        unfocusedLeadingIconColor2 = unfocusedLeadingIconColor;
        goto L63
    L57:
        focusedLeadingIconColor2 = focusedLeadingIconColor;
        goto L59
    L53:
        r7 = 6;
        errorBorderColor2 = errorBorderColor;
        goto L55
    L49:
        disabledBorderColor2 = disabledBorderColor;
        goto L50
    L45:
        unfocusedBorderColor2 = unfocusedBorderColor;
        goto L47
    L41:
        r6 = 6;
        focusedBorderColor2 = focusedBorderColor;
        goto L43
    L37:
        selectionColors2 = selectionColors;
        goto L39
    L33:
        errorCursorColor2 = errorCursorColor;
        goto L35
    L29:
        cursorColor2 = cursorColor;
        goto L31
    L25:
        errorContainerColor2 = errorContainerColor;
        goto L27
    L21:
        containerColor2 = containerColor;
        goto L23
    L17:
        errorTextColor2 = errorTextColor;
        goto L19
    L13:
        disabledTextColor2 = disabledTextColor;
        goto L15
    L9:
        unfocusedTextColor2 = unfocusedTextColor;
        goto L11
    L5:
        focusedTextColor2 = focusedTextColor;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: textFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2216textFieldColorsStqZLY(long textColor, long disabledTextColor, long containerColor, long cursorColor, long errorCursorColor, TextSelectionColors selectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long placeholderColor, long disabledPlaceholderColor, Composer $composer, int $changed, int $changed1, int $changed2, int r138) {
        ComposerKt.sourceInformationMarkerStart($composer, -1343678550, "C(textFieldColors)P(19:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,18,13:c#ui.graphics.Color,20:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,15:c#ui.graphics.Color,22:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,16:c#ui.graphics.Color,23:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,21:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,5:c#ui.graphics.Color)1117@60636L5,1119@60743L5,1122@60930L5,1123@61011L5,1124@61107L5,1125@61186L7,1127@61306L5,1129@61421L5,1131@61543L5,1135@61768L5,1137@61884L5,1138@61985L5,1140@62105L5,1144@62324L5,1146@62442L5,1148@62557L5,1150@62679L5,1154@62901L5,1155@62993L5,1156@63082L5,1157@63178L5,1158@63268L5,1159@63359L5,1161@63473L5,1197@65427L5,1198@65521L5,1200@65638L5,1203@65842L5,1204@65934L5,1205@66028L5,1207@66145L5,1210@66349L5,1165@63611L2754:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((r138 & 1) == 0) goto L5;
        long textColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), $composer, 6);
    L7:
        if ((r138 & 2) == 0) goto L9;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), $composer, 6), FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r138 & 4) == 0) goto L13;
        long containerColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), $composer, 6);
    L15:
        if ((r138 & 8) == 0) goto L17;
        long cursorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), $composer, 6);
    L19:
        if ((r138 & 16) == 0) goto L21;
        long errorCursorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), $composer, 6);
    L23:
        if ((r138 & 32) == 0) goto L25;
        ProvidableCompositionLocal<TextSelectionColors> r5 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r5);
        ComposerKt.sourceInformationMarkerEnd($composer);
        TextSelectionColors selectionColors2 = (TextSelectionColors) r4;
    L27:
        if ((r138 & 64) == 0) goto L29;
        long focusedIndicatorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), $composer, 6);
    L31:
        if ((r138 & 128) == 0) goto L33;
        long unfocusedIndicatorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), $composer, 6);
    L35:
        if ((r138 & 256) == 0) goto L37;
        long disabledIndicatorColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), $composer, 6), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L39:
        if ((r138 & 512) == 0) goto L41;
        long errorIndicatorColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), $composer, 6);
    L43:
        if ((r138 & 1024) == 0) goto L45;
        long focusedLeadingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), $composer, 6);
    L47:
        if ((r138 & 2048) == 0) goto L49;
        long unfocusedLeadingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), $composer, 6);
    L51:
        if ((r138 & 4096) == 0) goto L53;
        long disabledLeadingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), $composer, 6), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L55:
        if ((r138 & 8192) == 0) goto L57;
        long errorLeadingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), $composer, 6);
    L59:
        if ((r138 & 16384) == 0) goto L61;
        long focusedTrailingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), $composer, 6);
    L63:
        if ((32768 & r138) == 0) goto L65;
        long unfocusedTrailingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), $composer, 6);
    L67:
        if ((65536 & r138) == 0) goto L69;
        long disabledTrailingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), $composer, 6), FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L71:
        if ((131072 & r138) == 0) goto L73;
        long errorTrailingIconColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), $composer, 6);
    L75:
        if ((262144 & r138) == 0) goto L77;
        long focusedLabelColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), $composer, 6);
    L79:
        if ((524288 & r138) == 0) goto L81;
        long unfocusedLabelColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), $composer, 6);
    L83:
        if ((1048576 & r138) == 0) goto L85;
        long disabledLabelColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), $composer, 6);
    L87:
        if ((2097152 & r138) == 0) goto L89;
        long errorLabelColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), $composer, 6);
    L91:
        if ((4194304 & r138) == 0) goto L93;
        long placeholderColor2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L95:
        if ((r138 & 8388608) == 0) goto L97;
        long disabledPlaceholderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), $composer, 6), FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L99:
        if (ComposerKt.isTraceInProgress() == false) goto L101;
        ComposerKt.traceEventStart(-1343678550, $changed, $changed1, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:1165)");
    L101:
        long r63 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
        long r65 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
        long r67 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long r69 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
        long r71 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
        long r73 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
        long r75 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long r77 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
        int r80 = ((((((((($changed & 14) | (($changed << 3) & 112)) | (($changed << 3) & 896)) | (($changed << 9) & 7168)) | (($changed << 6) & 57344)) | (($changed << 9) & 458752)) | (($changed << 12) & 3670016)) | (($changed << 15) & 29360128)) | (($changed << 15) & 234881024)) | (($changed << 15) & 1879048192);
        int r81 = (((((((((($changed >> 15) & 14) | (($changed >> 15) & 112)) | (($changed >> 15) & 896)) | (($changed >> 15) & 7168)) | (($changed >> 15) & 57344)) | (($changed1 << 15) & 458752)) | (($changed1 << 15) & 3670016)) | (($changed1 << 15) & 29360128)) | (($changed1 << 15) & 234881024)) | (($changed1 << 15) & 1879048192);
        int r82 = (((((((((($changed1 >> 15) & 14) | (($changed1 >> 15) & 112)) | (($changed1 >> 15) & 896)) | (($changed1 >> 15) & 7168)) | (($changed1 >> 15) & 57344)) | (($changed2 << 15) & 458752)) | (($changed2 << 15) & 3670016)) | (($changed2 << 15) & 29360128)) | (($changed2 << 18) & 234881024)) | (($changed2 << 18) & 1879048192);
        int r83 = (($changed2 >> 6) & 14) | (($changed2 << 15) & 1879048192);
        long textColor3 = textColor2;
        long containerColor3 = containerColor2;
        TextFieldColors r0 = m2215textFieldColorsFD9MK7s(textColor3, textColor2, disabledTextColor2, textColor3, containerColor3, containerColor3, containerColor3, containerColor3, cursorColor2, errorCursorColor2, selectionColors2, focusedIndicatorColor2, unfocusedIndicatorColor2, disabledIndicatorColor2, errorIndicatorColor2, focusedLeadingIconColor2, unfocusedLeadingIconColor2, disabledLeadingIconColor2, errorLeadingIconColor2, focusedTrailingIconColor2, unfocusedTrailingIconColor2, disabledTrailingIconColor2, errorTrailingIconColor2, focusedLabelColor2, unfocusedLabelColor2, disabledLabelColor2, errorLabelColor2, placeholderColor2, placeholderColor2, disabledPlaceholderColor2, placeholderColor2, r63, r65, r67, r69, r71, r73, r75, r77, $composer, r80, r81, r82, r83, 0, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L104;
        ComposerKt.traceEventEnd();
    L104:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L97:
        disabledPlaceholderColor2 = disabledPlaceholderColor;
        goto L99
    L93:
        placeholderColor2 = placeholderColor;
        goto L95
    L89:
        errorLabelColor2 = errorLabelColor;
        goto L91
    L85:
        disabledLabelColor2 = disabledLabelColor;
        goto L87
    L81:
        unfocusedLabelColor2 = unfocusedLabelColor;
        goto L83
    L77:
        focusedLabelColor2 = focusedLabelColor;
        goto L79
    L73:
        errorTrailingIconColor2 = errorTrailingIconColor;
        goto L75
    L69:
        disabledTrailingIconColor2 = disabledTrailingIconColor;
        goto L71
    L65:
        unfocusedTrailingIconColor2 = unfocusedTrailingIconColor;
        goto L67
    L61:
        focusedTrailingIconColor2 = focusedTrailingIconColor;
        goto L63
    L57:
        errorLeadingIconColor2 = errorLeadingIconColor;
        goto L59
    L53:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L55
    L49:
        unfocusedLeadingIconColor2 = unfocusedLeadingIconColor;
        goto L51
    L45:
        focusedLeadingIconColor2 = focusedLeadingIconColor;
        goto L47
    L41:
        errorIndicatorColor2 = errorIndicatorColor;
        goto L43
    L37:
        disabledIndicatorColor2 = disabledIndicatorColor;
        goto L39
    L33:
        unfocusedIndicatorColor2 = unfocusedIndicatorColor;
        goto L35
    L29:
        focusedIndicatorColor2 = focusedIndicatorColor;
        goto L31
    L25:
        selectionColors2 = selectionColors;
        goto L27
    L21:
        errorCursorColor2 = errorCursorColor;
        goto L23
    L17:
        cursorColor2 = cursorColor;
        goto L19
    L13:
        containerColor2 = containerColor;
        goto L15
    L9:
        disabledTextColor2 = disabledTextColor;
        goto L11
    L5:
        textColor2 = textColor;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: outlinedTextFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2212outlinedTextFieldColorsStqZLY(long textColor, long disabledTextColor, long containerColor, long cursorColor, long errorCursorColor, TextSelectionColors selectionColors, long focusedBorderColor, long unfocusedBorderColor, long disabledBorderColor, long errorBorderColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long placeholderColor, long disabledPlaceholderColor, Composer $composer, int $changed, int $changed1, int $changed2, int r138) {
        ComposerKt.sourceInformationMarkerStart($composer, -836383316, "C(outlinedTextFieldColors)P(19:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,9:c#ui.graphics.Color,18,13:c#ui.graphics.Color,20:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.graphics.Color,15:c#ui.graphics.Color,22:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,16:c#ui.graphics.Color,23:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,21:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,5:c#ui.graphics.Color)1216@66578L5,1218@66687L5,1222@66922L5,1223@67020L5,1224@67099L7,1225@67198L5,1226@67292L5,1228@67405L5,1231@67603L5,1233@67721L5,1235@67836L5,1237@67958L5,1241@68181L5,1243@68301L5,1245@68418L5,1247@68542L5,1251@68768L5,1252@68862L5,1253@68953L5,1255@69063L5,1258@69256L5,1259@69349L5,1261@69465L5,1297@71405L5,1298@71499L5,1300@71616L5,1303@71820L5,1304@71912L5,1305@72006L5,1307@72123L5,1310@72327L5,1265@69605L2738:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((r138 & 1) == 0) goto L5;
        long textColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), $composer, 6);
    L7:
        if ((r138 & 2) == 0) goto L9;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), $composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r138 & 4) == 0) goto L13;
        long containerColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L15:
        if ((r138 & 8) == 0) goto L17;
        long cursorColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), $composer, 6);
    L19:
        if ((r138 & 16) == 0) goto L21;
        long errorCursorColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), $composer, 6);
    L23:
        if ((r138 & 32) == 0) goto L25;
        ProvidableCompositionLocal<TextSelectionColors> r5 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r5);
        ComposerKt.sourceInformationMarkerEnd($composer);
        TextSelectionColors selectionColors2 = (TextSelectionColors) r4;
    L27:
        if ((r138 & 64) == 0) goto L29;
        long focusedBorderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), $composer, 6);
    L31:
        if ((r138 & 128) == 0) goto L33;
        long unfocusedBorderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), $composer, 6);
    L35:
        if ((r138 & 256) == 0) goto L37;
        long disabledBorderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), $composer, 6), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L39:
        if ((r138 & 512) == 0) goto L41;
        long errorBorderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), $composer, 6);
    L43:
        if ((r138 & 1024) == 0) goto L45;
        long focusedLeadingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), $composer, 6);
    L47:
        if ((r138 & 2048) == 0) goto L49;
        long unfocusedLeadingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), $composer, 6);
    L51:
        if ((r138 & 4096) == 0) goto L53;
        long disabledLeadingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), $composer, 6), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L55:
        if ((r138 & 8192) == 0) goto L57;
        long errorLeadingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), $composer, 6);
    L59:
        if ((r138 & 16384) == 0) goto L61;
        long focusedTrailingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), $composer, 6);
    L63:
        if ((32768 & r138) == 0) goto L65;
        long unfocusedTrailingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), $composer, 6);
    L67:
        if ((65536 & r138) == 0) goto L69;
        long disabledTrailingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), $composer, 6), OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L71:
        if ((131072 & r138) == 0) goto L73;
        long errorTrailingIconColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), $composer, 6);
    L75:
        if ((262144 & r138) == 0) goto L77;
        long focusedLabelColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), $composer, 6);
    L79:
        if ((524288 & r138) == 0) goto L81;
        long unfocusedLabelColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), $composer, 6);
    L83:
        if ((1048576 & r138) == 0) goto L85;
        long disabledLabelColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), $composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L87:
        if ((2097152 & r138) == 0) goto L89;
        long errorLabelColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), $composer, 6);
    L91:
        if ((4194304 & r138) == 0) goto L93;
        long placeholderColor2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
    L95:
        if ((r138 & 8388608) == 0) goto L97;
        long disabledPlaceholderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), $composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L99:
        if (ComposerKt.isTraceInProgress() == false) goto L101;
        ComposerKt.traceEventStart(-836383316, $changed, $changed1, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:1265)");
    L101:
        long r63 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
        long r65 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
        long r67 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long r69 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
        long r71 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
        long r73 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
        long r75 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), $composer, 6), OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long r77 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), $composer, 6);
        int r80 = ((((((((($changed & 14) | (($changed << 3) & 112)) | (($changed << 3) & 896)) | (($changed << 9) & 7168)) | (($changed << 6) & 57344)) | (($changed << 9) & 458752)) | (($changed << 12) & 3670016)) | (($changed << 15) & 29360128)) | (($changed << 15) & 234881024)) | (($changed << 15) & 1879048192);
        int r81 = (((((((((($changed >> 15) & 14) | (($changed >> 15) & 112)) | (($changed >> 15) & 896)) | (($changed >> 15) & 7168)) | (($changed >> 15) & 57344)) | (($changed1 << 15) & 458752)) | (($changed1 << 15) & 3670016)) | (($changed1 << 15) & 29360128)) | (($changed1 << 15) & 234881024)) | (($changed1 << 15) & 1879048192);
        int r82 = (((((((((($changed1 >> 15) & 14) | (($changed1 >> 15) & 112)) | (($changed1 >> 15) & 896)) | (($changed1 >> 15) & 7168)) | (($changed1 >> 15) & 57344)) | (($changed2 << 15) & 458752)) | (($changed2 << 15) & 3670016)) | (($changed2 << 15) & 29360128)) | (($changed2 << 18) & 234881024)) | (($changed2 << 18) & 1879048192);
        int r83 = (($changed2 >> 6) & 14) | (($changed2 << 15) & 1879048192);
        long textColor3 = textColor2;
        long containerColor3 = containerColor2;
        TextFieldColors r0 = m2211outlinedTextFieldColorsFD9MK7s(textColor3, textColor2, disabledTextColor2, textColor3, containerColor3, containerColor3, containerColor3, containerColor3, cursorColor2, errorCursorColor2, selectionColors2, focusedBorderColor2, unfocusedBorderColor2, disabledBorderColor2, errorBorderColor2, focusedLeadingIconColor2, unfocusedLeadingIconColor2, disabledLeadingIconColor2, errorLeadingIconColor2, focusedTrailingIconColor2, unfocusedTrailingIconColor2, disabledTrailingIconColor2, errorTrailingIconColor2, focusedLabelColor2, unfocusedLabelColor2, disabledLabelColor2, errorLabelColor2, placeholderColor2, placeholderColor2, disabledPlaceholderColor2, placeholderColor2, r63, r65, r67, r69, r71, r73, r75, r77, $composer, r80, r81, r82, r83, 0, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L104;
        ComposerKt.traceEventEnd();
    L104:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L97:
        disabledPlaceholderColor2 = disabledPlaceholderColor;
        goto L99
    L93:
        placeholderColor2 = placeholderColor;
        goto L95
    L89:
        errorLabelColor2 = errorLabelColor;
        goto L91
    L85:
        disabledLabelColor2 = disabledLabelColor;
        goto L87
    L81:
        unfocusedLabelColor2 = unfocusedLabelColor;
        goto L83
    L77:
        focusedLabelColor2 = focusedLabelColor;
        goto L79
    L73:
        errorTrailingIconColor2 = errorTrailingIconColor;
        goto L75
    L69:
        disabledTrailingIconColor2 = disabledTrailingIconColor;
        goto L71
    L65:
        unfocusedTrailingIconColor2 = unfocusedTrailingIconColor;
        goto L67
    L61:
        focusedTrailingIconColor2 = focusedTrailingIconColor;
        goto L63
    L57:
        errorLeadingIconColor2 = errorLeadingIconColor;
        goto L59
    L53:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L55
    L49:
        unfocusedLeadingIconColor2 = unfocusedLeadingIconColor;
        goto L51
    L45:
        focusedLeadingIconColor2 = focusedLeadingIconColor;
        goto L47
    L41:
        errorBorderColor2 = errorBorderColor;
        goto L43
    L37:
        disabledBorderColor2 = disabledBorderColor;
        goto L39
    L33:
        unfocusedBorderColor2 = unfocusedBorderColor;
        goto L35
    L29:
        focusedBorderColor2 = focusedBorderColor;
        goto L31
    L25:
        selectionColors2 = selectionColors;
        goto L27
    L21:
        errorCursorColor2 = errorCursorColor;
        goto L23
    L17:
        cursorColor2 = cursorColor;
        goto L19
    L13:
        containerColor2 = containerColor;
        goto L15
    L9:
        disabledTextColor2 = disabledTextColor;
        goto L11
    L5:
        textColor2 = textColor;
        goto L7
    }
}
