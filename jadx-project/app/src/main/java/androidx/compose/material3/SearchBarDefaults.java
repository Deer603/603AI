package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SearchBar.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JÈ\u0001\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0 2\u0006\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c0 2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020#2\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0018\u00010)¢\u0006\u0002\b*2\b\b\u0002\u0010-\u001a\u00020.2\n\b\u0002\u0010/\u001a\u0004\u0018\u000100H\u0007¢\u0006\u0002\u00101J&\u0010-\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000204H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107J0\u0010-\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00108\u001a\u00020.H\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u008a\u0001\u00108\u001a\u00020.2\b\b\u0002\u0010;\u001a\u0002042\b\b\u0002\u0010<\u001a\u0002042\b\b\u0002\u0010=\u001a\u0002042\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u0002042\b\b\u0002\u0010A\u001a\u0002042\b\b\u0002\u0010B\u001a\u0002042\b\b\u0002\u0010C\u001a\u0002042\b\b\u0002\u0010D\u001a\u0002042\b\b\u0002\u0010E\u001a\u0002042\b\b\u0002\u0010F\u001a\u0002042\b\b\u0002\u0010G\u001a\u000204H\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u009e\u0001\u00108\u001a\u00020.2\b\b\u0002\u0010J\u001a\u0002042\b\b\u0002\u0010K\u001a\u0002042\b\b\u0002\u0010<\u001a\u0002042\b\b\u0002\u0010=\u001a\u0002042\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u0002042\b\b\u0002\u0010A\u001a\u0002042\b\b\u0002\u0010B\u001a\u0002042\b\b\u0002\u0010C\u001a\u0002042\b\b\u0002\u0010D\u001a\u0002042\b\b\u0002\u0010E\u001a\u0002042\b\b\u0002\u0010L\u001a\u0002042\b\b\u0002\u0010M\u001a\u0002042\b\b\u0002\u0010G\u001a\u000204H\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010OR$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0019\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/material3/SearchBarDefaults;", "", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM$annotations", "getElevation-D9Ej5fM", "()F", "F", "InputFieldHeight", "getInputFieldHeight-D9Ej5fM", "ShadowElevation", "getShadowElevation-D9Ej5fM", "TonalElevation", "getTonalElevation-D9Ej5fM", "dockedShape", "Landroidx/compose/ui/graphics/Shape;", "getDockedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "fullScreenShape", "getFullScreenShape", "inputFieldShape", "getInputFieldShape", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "InputField", "", "query", "", "onQueryChange", "Lkotlin/Function1;", "onSearch", "expanded", "", "onExpandedChange", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "placeholder", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "leadingIcon", "trailingIcon", "colors", "Landroidx/compose/material3/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/SearchBarColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "dividerColor", "colors-dgg9oW8", "(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "inputFieldColors", "colors-Klgx-Pg", "(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "textColor", "disabledTextColor", "cursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "placeholderColor", "disabledPlaceholderColor", "inputFieldColors--u-KgnY", "(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "unfocusedTextColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "inputFieldColors-ITpI4ow", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SearchBarDefaults {
    public static final int $stable = 0;
    private static final float Elevation = 0.0f;
    public static final SearchBarDefaults INSTANCE = null;
    private static final float InputFieldHeight = 0.0f;
    private static final float ShadowElevation = 0.0f;
    private static final float TonalElevation = 0.0f;

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to TonalElevation. Not to be confused with ShadowElevation.", replaceWith = @ReplaceWith(expression = "TonalElevation", imports = {}))
    /* JADX INFO: renamed from: getElevation-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2541getElevationD9Ej5fM$annotations() {
    }

    private SearchBarDefaults() {
    }

    static {
        INSTANCE = new SearchBarDefaults();
        TonalElevation = ElevationTokens.INSTANCE.m3299getLevel0D9Ej5fM();
        ShadowElevation = ElevationTokens.INSTANCE.m3299getLevel0D9Ej5fM();
        Elevation = TonalElevation;
        InputFieldHeight = SearchBarTokens.INSTANCE.m3600getContainerHeightD9Ej5fM();
    }

    /* JADX INFO: renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m2547getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    /* JADX INFO: renamed from: getShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m2546getShadowElevationD9Ej5fM() {
        return ShadowElevation;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2544getElevationD9Ej5fM() {
        return Elevation;
    }

    /* JADX INFO: renamed from: getInputFieldHeight-D9Ej5fM, reason: not valid java name */
    public final float m2545getInputFieldHeightD9Ej5fM() {
        return InputFieldHeight;
    }

    public final Shape getInputFieldShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -971556142, "C349@15770L5:SearchBar.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-971556142, $changed, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.android.kt:349)");
    L5:
        Shape r0 = ShapesKt.getValue(SearchBarTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getFullScreenShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1665502056, "C353@15944L5:SearchBar.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1665502056, $changed, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.android.kt:353)");
    L5:
        Shape r0 = ShapesKt.getValue(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getDockedShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1006952150, "C357@16094L5:SearchBar.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1006952150, $changed, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.android.kt:357)");
    L5:
        Shape r0 = ShapesKt.getValue(SearchViewTokens.INSTANCE.getDockedContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final WindowInsets getWindowInsets(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 2112270157, "C361@16229L10:SearchBar.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(2112270157, $changed, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.android.kt:361)");
    L5:
        WindowInsets r0 = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: colors-dgg9oW8, reason: not valid java name */
    public final SearchBarColors m2543colorsdgg9oW8(long containerColor, long dividerColor, Composer $composer, int $changed, int r45) {
        ComposerKt.sourceInformationMarkerStart($composer, -1507037523, "C(colors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color)375@16778L5,376@16845L5,381@17019L18:SearchBar.android.kt#uh7d8r");
        if ((r45 & 1) == 0) goto L5;
        long containerColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), $composer, 6);
    L7:
        if ((r45 & 2) == 0) goto L9;
        long dividerColor2 = ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), $composer, 6);
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-1507037523, $changed, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:378)");
    L13:
        long containerColor3 = containerColor2;
        long dividerColor3 = dividerColor2;
        SearchBarColors r37 = new SearchBarColors(containerColor3, dividerColor3, m2549inputFieldColorsITpI4ow(0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer, 0, ($changed << 6) & 57344, 16383), null);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r37;
    L9:
        dividerColor2 = dividerColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    /* JADX INFO: renamed from: inputFieldColors-ITpI4ow, reason: not valid java name */
    public final TextFieldColors m2549inputFieldColorsITpI4ow(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long cursorColor, TextSelectionColors selectionColors, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, Composer $composer, int $changed, int $changed1, int r126) {
        ComposerKt.sourceInformationMarkerStart($composer, -602148837, "C(inputFieldColors)P(7:c#ui.graphics.Color,12:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,9,5:c#ui.graphics.Color,10:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,4:c#ui.graphics.Color,6:c#ui.graphics.Color,11:c#ui.graphics.Color,2:c#ui.graphics.Color)410@18829L5,411@18903L5,413@18998L5,416@19154L5,417@19233L7,418@19316L5,419@19399L5,421@19507L5,424@19683L5,425@19768L5,427@19878L5,430@20056L5,431@20142L5,433@20244L5,437@20389L847:SearchBar.android.kt#uh7d8r");
        if ((r126 & 1) == 0) goto L5;
        long focusedTextColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), $composer, 6);
    L7:
        if ((r126 & 2) == 0) goto L9;
        long unfocusedTextColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), $composer, 6);
    L11:
        if ((r126 & 4) == 0) goto L13;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), $composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r126 & 8) == 0) goto L17;
        long cursorColor2 = ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), $composer, 6);
    L19:
        if ((r126 & 16) == 0) goto L21;
        ProvidableCompositionLocal<TextSelectionColors> r5 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r5);
        ComposerKt.sourceInformationMarkerEnd($composer);
        TextSelectionColors selectionColors2 = (TextSelectionColors) r4;
    L23:
        if ((r126 & 32) == 0) goto L25;
        long focusedLeadingIconColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), $composer, 6);
    L27:
        if ((r126 & 64) == 0) goto L29;
        long unfocusedLeadingIconColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), $composer, 6);
    L31:
        if ((r126 & 128) == 0) goto L33;
        long disabledLeadingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), $composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L35:
        if ((r126 & 256) == 0) goto L37;
        long focusedTrailingIconColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), $composer, 6);
    L39:
        if ((r126 & 512) == 0) goto L41;
        long unfocusedTrailingIconColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), $composer, 6);
    L43:
        if ((r126 & 1024) == 0) goto L45;
        long disabledTrailingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), $composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L47:
        if ((r126 & 2048) == 0) goto L49;
        long focusedPlaceholderColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), $composer, 6);
    L51:
        if ((r126 & 4096) == 0) goto L53;
        long unfocusedPlaceholderColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), $composer, 6);
    L55:
        if ((r126 & 8192) == 0) goto L57;
        long disabledPlaceholderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), $composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L59:
        if (ComposerKt.isTraceInProgress() == false) goto L61;
        ComposerKt.traceEventStart(-602148837, $changed, $changed1, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:437)");
    L61:
        int r88 = ((($changed & 14) | ($changed & 112)) | ($changed & 896)) | (($changed << 15) & 234881024);
        int r89 = ((((($changed >> 12) & 14) | (458752 & $changed)) | (3670016 & $changed)) | ($changed & 29360128)) | (($changed << 3) & 1879048192);
        int r90 = ((((($changed >> 27) & 14) | (($changed1 << 3) & 112)) | (29360128 & ($changed1 << 18))) | (($changed1 << 18) & 234881024)) | (($changed1 << 18) & 1879048192);
        TextFieldColors r0 = TextFieldDefaults.INSTANCE.m2801colors0hiis_0(focusedTextColor2, unfocusedTextColor2, disabledTextColor2, 0, 0, 0, 0, 0, cursorColor2, 0, selectionColors2, 0, 0, 0, 0, focusedLeadingIconColor2, unfocusedLeadingIconColor2, disabledLeadingIconColor2, 0, focusedTrailingIconColor2, unfocusedTrailingIconColor2, disabledTrailingIconColor2, 0, 0, 0, 0, 0, focusedPlaceholderColor2, unfocusedPlaceholderColor2, disabledPlaceholderColor2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer, r88, r89, r90, 0, 3072, 1204058872, 4095);
        if (ComposerKt.isTraceInProgress() == false) goto L64;
        ComposerKt.traceEventEnd();
    L64:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L57:
        disabledPlaceholderColor2 = disabledPlaceholderColor;
        goto L59
    L53:
        unfocusedPlaceholderColor2 = unfocusedPlaceholderColor;
        goto L55
    L49:
        focusedPlaceholderColor2 = focusedPlaceholderColor;
        goto L51
    L45:
        disabledTrailingIconColor2 = disabledTrailingIconColor;
        goto L47
    L41:
        unfocusedTrailingIconColor2 = unfocusedTrailingIconColor;
        goto L43
    L37:
        focusedTrailingIconColor2 = focusedTrailingIconColor;
        goto L39
    L33:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L35
    L29:
        unfocusedLeadingIconColor2 = unfocusedLeadingIconColor;
        goto L31
    L25:
        focusedLeadingIconColor2 = focusedLeadingIconColor;
        goto L27
    L21:
        selectionColors2 = selectionColors;
        goto L23
    L17:
        cursorColor2 = cursorColor;
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

    public final void InputField(final String query, final Function1<? super String, Unit> r79, final Function1<? super String, Unit> r80, final boolean expanded, final Function1<? super Boolean, Unit> r82, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r85, Function2<? super Composer, ? super Integer, Unit> r86, Function2<? super Composer, ? super Integer, Unit> r87, TextFieldColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int r93) {
        Composer $composer2 = $composer.startRestartGroup(1451366815);
        ComposerKt.sourceInformation($composer2, "C(InputField)P(10,7,8,2,6,5,1,9,4,11)492@23517L18,498@23776L25,499@23837L29,500@23912L7,502@23951L34,503@24030L39,*506@24122L7,521@24685L44,522@24761L378,534@25242L7,537@25496L19,540@25625L1172,510@24250L2557,566@26894L320,566@26869L345:SearchBar.android.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r93 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r93 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        int r17 = 128;
        if ((r93 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L34:
        if ((r93 & 8) == 0) goto L37;
        $dirty = $dirty | 3072;
    L44:
        if ((r93 & 16) == 0) goto L47;
        $dirty = $dirty | 24576;
    L53:
        int r12 = r93 & 32;
        if (r12 == 0) goto L57;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Modifier r13 = modifier;
    L64:
        int r18 = r93 & 64;
        if (r18 == 0) goto L68;
        $dirty = $dirty | 1572864;
        boolean r14 = enabled;
    L75:
        int r15 = r93 & 128;
        if (r15 == 0) goto L79;
        $dirty = $dirty | 12582912;
        Function2<? super Composer, ? super Integer, Unit> r7 = r85;
    L86:
        int r4 = r93 & 256;
        if (r4 == 0) goto L90;
        $dirty = $dirty | 100663296;
    L97:
        int r5 = r93 & 512;
        if (r5 == 0) goto L101;
        $dirty = $dirty | 805306368;
    L109:
        if (($changed1 & 6) != 0) goto L119;
        if ((r93 & 1024) != 0) goto L116;
        if ($composer2.changed(colors) == false) goto L116;
        int r23 = 4;
    L117:
        $dirty1 = $dirty1 | r23;
    L116:
        r23 = 2;
    L119:
        int $dirty2 = $dirty;
        int $dirty3 = r93 & 2048;
        if ($dirty3 == 0) goto L123;
        $dirty1 = $dirty1 | 48;
        MutableInteractionSource r9 = interactionSource;
    L131:
        if ((r93 & 4096) == 0) goto L134;
        $dirty1 = $dirty1 | 384;
    L141:
        if (($dirty2 & 306783379) == 306783378) goto L143;
    L148:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L151;
    L157:
        if (r12 == 0) goto L159;
        Modifier.Companion modifier2 = Modifier.Companion;
    L160:
        if (r18 == 0) goto L162;
        boolean enabled2 = true;
    L163:
        if (r15 == 0) goto L165;
        r7 = null;
    L165:
        if (r4 == 0) goto L167;
        Function2<? super Composer, ? super Integer, Unit> r40 = null;
    L168:
        if (r5 == 0) goto L170;
        Function2<? super Composer, ? super Integer, Unit> r41 = null;
    L172:
        if ((r93 & 1024) == 0) goto L174;
        int r43 = $dirty3;
        TextFieldColors colors2 = m2549inputFieldColorsITpI4ow(0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, ($dirty1 << 6) & 57344, 16383);
        $composer2 = $composer2;
        $dirty1 = $dirty1 & (-15);
    L175:
        if (r43 == 0) goto L177;
        Modifier modifier3 = modifier2;
        MutableInteractionSource interactionSource2 = null;
        int $dirty4 = $dirty1;
        TextFieldColors colors3 = colors2;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r7;
        boolean enabled3 = enabled2;
    L178:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L181;
        ComposerKt.traceEventStart(1451366815, $dirty2, $dirty4, "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.android.kt:494)");
    L181:
        $composer2.startReplaceGroup(-320443616);
        ComposerKt.sourceInformation($composer2, "496@23695L39");
        if (interactionSource2 != null) goto L188;
        ComposerKt.sourceInformationMarkerStart($composer2, -320442965, "CC(remember):SearchBar.android.kt#9igjgp");
        Composer $this$cache$iv = $composer2;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L186;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
    L187:
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
    L189:
        $composer2.endReplaceGroup();
        boolean focused = FocusInteractionKt.collectIsFocusedAsState(interactionSource3, $composer2, 0).getValue().booleanValue();
        ComposerKt.sourceInformationMarkerStart($composer2, -320438431, "CC(remember):SearchBar.android.kt#9igjgp");
        Composer $this$cache$iv2 = $composer2;
        Object it$iv2 = $this$cache$iv2.rememberedValue();
        final MutableInteractionSource interactionSource4 = interactionSource3;
        if (it$iv2 != Composer.Companion.getEmpty()) goto L192;
        Object value$iv2 = new FocusRequester();
        $this$cache$iv2.updateRememberedValue(value$iv2);
    L193:
        final FocusRequester focusRequester = (FocusRequester) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<FocusManager> r11 = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r16 = $composer2.consume(r11);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        FocusManager focusManager = (FocusManager) r16;
        Strings.Companion r19 = Strings.Companion;
        final String searchSemantics = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_search_bar_search), $composer2, 0);
        Strings.Companion r110 = Strings.Companion;
        final String suggestionsAvailableSemantics = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_suggestions_available), $composer2, 0);
        ProvidableCompositionLocal<TextStyle> r111 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r20 = $composer2.consume(r111);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long $this$takeOrElse_u2dDxMtmZc$iv = ((TextStyle) r20).m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L196;
        boolean r112 = true;
    L197:
        if (r112 == true) goto L200;
        $this$takeOrElse_u2dDxMtmZc$iv = colors3.m2789textColorXeAY9LY$material3_release(enabled3, false, focused);
    L200:
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        Modifier modifier4 = modifier3;
        Modifier modifier5 = FocusRequesterModifierKt.focusRequester(SizeKt.m776sizeInqDBjuR0$default(modifier3, SearchBar_androidKt.getSearchBarMinWidth(), InputFieldHeight, SearchBar_androidKt.access$getSearchBarMaxWidth$p(), 0.0f, 8, null), focusRequester);
        ComposerKt.sourceInformationMarkerStart($composer2, -320411280, "CC(remember):SearchBar.android.kt#9igjgp");
        if ((57344 & $dirty2) != 16384) goto L203;
        boolean invalid$iv = true;
    L204:
        Composer $this$cache$iv3 = $composer2;
        final boolean enabled4 = enabled3;
        Object value$iv3 = $this$cache$iv3.rememberedValue();
        if (invalid$iv == true) goto L211;
        if (value$iv3 == Composer.Companion.getEmpty()) goto L211;
    L212:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r8 = FocusChangedModifierKt.onFocusChanged(modifier5, (Function1) value$iv3);
        ComposerKt.sourceInformationMarkerStart($composer2, -320408514, "CC(remember):SearchBar.android.kt#9igjgp");
        boolean r113 = $composer2.changed(searchSemantics);
        if (($dirty2 & 7168) != 2048) goto L215;
        boolean r114 = true;
    L216:
        boolean invalid$iv2 = (r113 | r114) | $composer2.changed(suggestionsAvailableSemantics);
        Composer $this$cache$iv4 = $composer2;
        Object it$iv3 = $this$cache$iv4.rememberedValue();
        if (invalid$iv2 == false) goto L219;
    L222:
        Object value$iv4 = (Function1) new SearchBarDefaults$InputField$2$1(searchSemantics, expanded, suggestionsAvailableSemantics, focusRequester);
        $this$cache$iv4.updateRememberedValue(value$iv4);
    L223:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r3 = SemanticsModifierKt.semantics$default(r8, false, (Function1) value$iv4, 1, null);
        ProvidableCompositionLocal<TextStyle> r21 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r0 = $composer2.consume(r21);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle r1 = ((TextStyle) r0).merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        SolidColor r22 = new SolidColor(colors3.m2739cursorColorvNxB06k$material3_release(false), null);
        KeyboardOptions r27 = new KeyboardOptions(0, null, 0, ImeAction.Companion.m6602getSearcheUduSuo(), null, null, null, 119, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -320385353, "CC(remember):SearchBar.android.kt#9igjgp");
        if (($dirty2 & 896) != 256) goto L226;
        boolean r115 = true;
    L228:
        if (($dirty2 & 14) != 4) goto L230;
        boolean r116 = true;
    L231:
        boolean invalid$iv3 = r116 | r115;
        Composer $this$cache$iv5 = $composer2;
        Object it$iv4 = $this$cache$iv5.rememberedValue();
        if (invalid$iv3 == true) goto L237;
        TextStyle r24 = r1;
        if (it$iv4 == Composer.Companion.getEmpty()) goto L238;
        final String r2 = query;
        Object value$iv5 = it$iv4;
    L239:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final String r84 = r2;
        final TextFieldColors colors4 = colors3;
        final Function2<? super Composer, ? super Integer, Unit> r88 = r40;
        final Function2<? super Composer, ? super Integer, Unit> r89 = r41;
        Function2<? super Composer, ? super Integer, Unit> r30 = r10;
        int $dirty5 = $dirty2;
        Composer $composer3 = $composer2;
        BasicTextFieldKt.BasicTextField(query, r79, r3, enabled4, false, r24, r27, new KeyboardActions(null, null, null, null, (Function1) value$iv5, null, 47, null), true, 0, 0, null, null, interactionSource4, r22, ComposableLambdaKt.rememberComposableLambda(-2029278807, true, new AnonymousClass4(r84, enabled4, interactionSource4, r10, r88, r89, colors4), $composer2, 54), $composer3, ((($dirty2 & 14) | 102236160) | ($dirty2 & 112)) | (($dirty2 >> 9) & 7168), ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 7696);
        Composer $composer4 = $composer3;
        if (expanded == true) goto L243;
        if (focused == false) goto L243;
        boolean shouldClearFocus = true;
    L244:
        Boolean r6 = Boolean.valueOf(expanded);
        ComposerKt.sourceInformationMarkerStart($composer4, -320340316, "CC(remember):SearchBar.android.kt#9igjgp");
        boolean invalid$iv4 = $composer4.changed(shouldClearFocus) | $composer4.changedInstance(focusManager);
        Object it$iv5 = $composer4.rememberedValue();
        if (invalid$iv4 == false) goto L247;
    L250:
        Object value$iv6 = (Function2) new SearchBarDefaults$InputField$5$1(shouldClearFocus, focusManager, null);
        $composer4.updateRememberedValue(value$iv6);
    L251:
        ComposerKt.sourceInformationMarkerEnd($composer4);
        EffectsKt.LaunchedEffect(r6, (Function2) value$iv6, $composer4, ($dirty5 >> 9) & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L254;
        ComposerKt.traceEventEnd();
    L254:
        final boolean enabled5 = enabled4;
        final MutableInteractionSource interactionSource5 = interactionSource2;
        final Modifier modifier6 = modifier4;
        final TextFieldColors colors5 = colors4;
        final Function2<? super Composer, ? super Integer, Unit> r25 = r30;
        final Function2<? super Composer, ? super Integer, Unit> r117 = r40;
        final Function2<? super Composer, ? super Integer, Unit> r118 = r41;
    L255:
        ScopeUpdateScope r26 = $composer4.endRestartGroup();
        if (r26 == null) goto L259;
        r26.updateScope(new AnonymousClass6(this, query, r79, r80, expanded, r82, modifier6, enabled5, r25, r117, r118, colors5, interactionSource5, $changed, $changed1, r93));
        return;
    L259:
        return;
    L247:
        if (it$iv5 == Composer.Companion.getEmpty()) goto L250;
        value$iv6 = it$iv5;
    L243:
        shouldClearFocus = false;
    L238:
        r2 = query;
        value$iv5 = (Function1) new SearchBarDefaults$InputField$3$1(r80, r2);
        $this$cache$iv5.updateRememberedValue(value$iv5);
        goto L239
    L237:
        r24 = r1;
        goto L238
    L230:
        r116 = false;
        goto L231
    L226:
        r115 = false;
        goto L228
    L219:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L222;
        value$iv4 = it$iv3;
        goto L223
    L215:
        r114 = false;
    L211:
        value$iv3 = (Function1) new SearchBarDefaults$InputField$1$1(r82);
        $this$cache$iv3.updateRememberedValue(value$iv3);
        goto L212
    L203:
        invalid$iv = false;
        goto L204
    L196:
        r112 = false;
        goto L197
    L192:
        value$iv2 = it$iv2;
        goto L193
    L186:
        value$iv = it$iv;
        goto L187
    L188:
        interactionSource3 = interactionSource2;
        goto L189
    L177:
        modifier3 = modifier2;
        interactionSource2 = interactionSource;
        $dirty4 = $dirty1;
        colors3 = colors2;
        r10 = r7;
        enabled3 = enabled2;
        goto L178
    L174:
        r43 = $dirty3;
        colors2 = colors;
        goto L175
    L170:
        r41 = r87;
        goto L172
    L167:
        r40 = r86;
        goto L168
    L162:
        enabled2 = r14;
        goto L163
    L159:
        modifier2 = r13;
        goto L160
    L151:
        if ($composer2.getDefaultsInvalid() == true) goto L157;
        $composer2.skipToGroupEnd();
        if ((r93 & 1024) == 0) goto L156;
        $dirty1 = $dirty1 & (-15);
    L156:
        r40 = r86;
        r41 = r87;
        $dirty2 = $dirty2;
        interactionSource2 = r9;
        $dirty4 = $dirty1;
        modifier3 = r13;
        colors3 = colors;
        r10 = r7;
        enabled3 = r14;
        goto L178
    L143:
        if (($dirty1 & 147) != 146) goto L148;
        if ($composer2.getSkipping() == false) goto L148;
        $composer2.skipToGroupEnd();
        MutableInteractionSource r28 = r9;
        r25 = r7;
        modifier6 = r13;
        interactionSource5 = r28;
        r118 = r87;
        colors5 = colors;
        $composer4 = $composer2;
        enabled5 = r14;
        r117 = r86;
        goto L255
    L134:
        if (($changed1 & 384) != 0) goto L141;
        if ($composer2.changed(this) == false) goto L138;
        r17 = 256;
    L138:
        $dirty1 = $dirty1 | r17;
        goto L141
    L123:
        if (($changed1 & 48) != 0) goto L129;
        r9 = interactionSource;
        if ($composer2.changed(r9) == false) goto L127;
        int r119 = 32;
    L128:
        $dirty1 = $dirty1 | r119;
        goto L131
    L127:
        r119 = 16;
        goto L128
    L129:
        r9 = interactionSource;
        goto L131
    L101:
        if (($changed & 805306368) != 0) goto L109;
        if ($composer2.changedInstance(r87) == false) goto L105;
        int r29 = 536870912;
    L106:
        $dirty = $dirty | r29;
        goto L109
    L105:
        r29 = 268435456;
        goto L106
    L90:
        if (($changed & 100663296) != 0) goto L97;
        if ($composer2.changedInstance(r86) == false) goto L94;
        int r210 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L95:
        $dirty = $dirty | r210;
        goto L97
    L94:
        r210 = 33554432;
        goto L95
    L79:
        if (($changed & 12582912) != 0) goto L85;
        r7 = r85;
        if ($composer2.changedInstance(r7) == false) goto L83;
        int r211 = 8388608;
    L84:
        $dirty = $dirty | r211;
        goto L86
    L83:
        r211 = 4194304;
        goto L84
    L85:
        r7 = r85;
        goto L86
    L68:
        if (($changed & 1572864) != 0) goto L74;
        r14 = enabled;
        if ($composer2.changed(r14) == false) goto L72;
        int r212 = 1048576;
    L73:
        $dirty = $dirty | r212;
        goto L75
    L72:
        r212 = 524288;
        goto L73
    L74:
        r14 = enabled;
        goto L75
    L57:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L63;
        r13 = modifier;
        if ($composer2.changed(r13) == false) goto L61;
        int r120 = 131072;
    L62:
        $dirty = $dirty | r120;
        goto L64
    L61:
        r120 = 65536;
        goto L62
    L63:
        r13 = modifier;
        goto L64
    L47:
        if (($changed & 24576) != 0) goto L53;
        if ($composer2.changedInstance(r82) == false) goto L51;
        int r121 = 16384;
    L52:
        $dirty = $dirty | r121;
        goto L53
    L51:
        r121 = 8192;
        goto L52
    L37:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changed(expanded) == false) goto L41;
        int r122 = 2048;
    L42:
        $dirty = $dirty | r122;
        goto L44
    L41:
        r122 = 1024;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r80) == false) goto L31;
        int r123 = 256;
    L32:
        $dirty = $dirty | r123;
        goto L34
    L31:
        r123 = 128;
        goto L32
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r79) == false) goto L20;
        int r124 = 32;
    L21:
        $dirty = $dirty | r124;
        goto L23
    L20:
        r124 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(query) == false) goto L10;
        int r125 = 4;
    L11:
        $dirty = $dirty | r125;
        goto L13
    L10:
        r125 = 2;
        goto L11
    }

    @Deprecated(message = "Search bars now take the input field as a parameter. `inputFieldColors` should be passed explicitly to the input field. This parameter will be removed in a future version of the library.", replaceWith = @ReplaceWith(expression = "colors(containerColor, dividerColor)", imports = {}))
    /* JADX INFO: renamed from: colors-Klgx-Pg, reason: not valid java name */
    public final SearchBarColors m2542colorsKlgxPg(long containerColor, long dividerColor, TextFieldColors inputFieldColors, Composer $composer, int $changed, int r45) {
        ComposerKt.sourceInformationMarkerStart($composer, -1216168196, "C(colors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color)586@27706L5,587@27773L5,588@27824L18:SearchBar.android.kt#uh7d8r");
        if ((r45 & 1) == 0) goto L5;
        long containerColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), $composer, 6);
    L7:
        if ((r45 & 2) == 0) goto L9;
        long dividerColor2 = ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), $composer, 6);
    L11:
        if ((r45 & 4) == 0) goto L13;
        TextFieldColors inputFieldColors2 = m2549inputFieldColorsITpI4ow(0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer, 0, ($changed << 3) & 57344, 16383);
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(-1216168196, $changed, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:590)");
    L17:
        SearchBarColors r6 = new SearchBarColors(containerColor2, dividerColor2, inputFieldColors2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L13:
        inputFieldColors2 = inputFieldColors;
        goto L15
    L9:
        dividerColor2 = dividerColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: inputFieldColors--u-KgnY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2548inputFieldColorsuKgnY(long textColor, long disabledTextColor, long cursorColor, TextSelectionColors selectionColors, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long placeholderColor, long disabledPlaceholderColor, Composer $composer, int $changed, int $changed1, int r60) {
        ComposerKt.sourceInformationMarkerStart($composer, 355927049, "C(inputFieldColors)P(9:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,8,5:c#ui.graphics.Color,10:c#ui.graphics.Color,1:c#ui.graphics.Color,6:c#ui.graphics.Color,11:c#ui.graphics.Color,4:c#ui.graphics.Color,7:c#ui.graphics.Color,2:c#ui.graphics.Color)599@28228L5,601@28323L5,604@28479L5,605@28558L7,606@28641L5,607@28724L5,609@28832L5,612@29008L5,613@29093L5,615@29203L5,618@29374L5,620@29476L5,624@29586L825:SearchBar.android.kt#uh7d8r");
        if ((r60 & 1) == 0) goto L5;
        long textColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), $composer, 6);
    L7:
        if ((r60 & 2) == 0) goto L9;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), $composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r60 & 4) == 0) goto L13;
        long cursorColor2 = ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), $composer, 6);
    L15:
        if ((r60 & 8) == 0) goto L17;
        ProvidableCompositionLocal<TextSelectionColors> r5 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r5);
        ComposerKt.sourceInformationMarkerEnd($composer);
        TextSelectionColors selectionColors2 = (TextSelectionColors) r4;
    L19:
        if ((r60 & 16) == 0) goto L21;
        long focusedLeadingIconColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), $composer, 6);
    L23:
        if ((r60 & 32) == 0) goto L25;
        long unfocusedLeadingIconColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), $composer, 6);
    L27:
        if ((r60 & 64) == 0) goto L29;
        long disabledLeadingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), $composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L31:
        if ((r60 & 128) == 0) goto L33;
        long focusedTrailingIconColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), $composer, 6);
    L35:
        if ((r60 & 256) == 0) goto L37;
        long unfocusedTrailingIconColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), $composer, 6);
    L39:
        if ((r60 & 512) == 0) goto L41;
        long disabledTrailingIconColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), $composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L43:
        if ((r60 & 1024) == 0) goto L45;
        long placeholderColor2 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), $composer, 6);
    L47:
        if ((r60 & 2048) == 0) goto L49;
        long disabledPlaceholderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), $composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L51:
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventStart(355927049, $changed, $changed1, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:624)");
    L53:
        int r30 = ((((((((($changed & 14) | (($changed << 3) & 112)) | (($changed << 3) & 896)) | (($changed << 3) & 7168)) | (($changed << 3) & 57344)) | (($changed << 3) & 458752)) | (($changed << 3) & 3670016)) | (($changed << 3) & 29360128)) | (($changed << 3) & 234881024)) | (($changed << 3) & 1879048192);
        int r31 = ((((($changed >> 27) & 14) | (($changed1 << 3) & 112)) | (($changed1 << 6) & 896)) | (($changed1 << 6) & 7168)) | (($changed1 << 6) & 57344);
        long textColor3 = textColor2;
        long disabledLeadingIconColor3 = disabledLeadingIconColor2;
        long disabledLeadingIconColor4 = unfocusedTrailingIconColor2;
        long unfocusedTrailingIconColor3 = placeholderColor2;
        long placeholderColor3 = disabledPlaceholderColor2;
        long cursorColor3 = cursorColor2;
        long cursorColor4 = focusedLeadingIconColor2;
        long focusedLeadingIconColor3 = unfocusedLeadingIconColor2;
        long unfocusedLeadingIconColor3 = focusedTrailingIconColor2;
        long focusedTrailingIconColor3 = disabledTrailingIconColor2;
        TextFieldColors r0 = m2549inputFieldColorsITpI4ow(textColor3, textColor3, disabledTextColor2, cursorColor3, selectionColors2, cursorColor4, focusedLeadingIconColor3, disabledLeadingIconColor3, unfocusedLeadingIconColor3, disabledLeadingIconColor4, focusedTrailingIconColor3, unfocusedTrailingIconColor3, unfocusedTrailingIconColor3, placeholderColor3, $composer, r30, r31, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L56;
        ComposerKt.traceEventEnd();
    L56:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L49:
        disabledPlaceholderColor2 = disabledPlaceholderColor;
        goto L51
    L45:
        placeholderColor2 = placeholderColor;
        goto L47
    L41:
        disabledTrailingIconColor2 = disabledTrailingIconColor;
        goto L43
    L37:
        unfocusedTrailingIconColor2 = unfocusedTrailingIconColor;
        goto L39
    L33:
        focusedTrailingIconColor2 = focusedTrailingIconColor;
        goto L35
    L29:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L31
    L25:
        unfocusedLeadingIconColor2 = unfocusedLeadingIconColor;
        goto L27
    L21:
        focusedLeadingIconColor2 = focusedLeadingIconColor;
        goto L23
    L17:
        selectionColors2 = selectionColors;
        goto L19
    L13:
        cursorColor2 = cursorColor;
        goto L15
    L9:
        disabledTextColor2 = disabledTextColor;
        goto L11
    L5:
        textColor2 = textColor;
        goto L7
    }
}
