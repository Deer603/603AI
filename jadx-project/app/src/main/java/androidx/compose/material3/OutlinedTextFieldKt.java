package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aØ\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.H\u0007¢\u0006\u0002\u0010/\u001aØ\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u0002002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.H\u0007¢\u0006\u0002\u00101\u001a\u0080\u0002\u00102\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0002\b\u00172\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00105\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u0010%\u001a\u00020\u00112\u0006\u00106\u001a\u0002072\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\t0\r2\u0011\u0010:\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0013\u0010;\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\u0010>\u001ar\u0010?\u001a\u00020'2\u0006\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020'2\u0006\u0010B\u001a\u00020'2\u0006\u0010C\u001a\u00020'2\u0006\u0010D\u001a\u00020'2\u0006\u0010E\u001a\u00020'2\u0006\u0010F\u001a\u00020'2\u0006\u0010G\u001a\u00020'2\u0006\u00106\u001a\u0002072\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u0002072\u0006\u0010<\u001a\u00020=H\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001aj\u0010M\u001a\u00020'2\u0006\u0010N\u001a\u00020'2\u0006\u0010O\u001a\u00020'2\u0006\u0010P\u001a\u00020'2\u0006\u0010Q\u001a\u00020'2\u0006\u0010R\u001a\u00020'2\u0006\u0010S\u001a\u00020'2\u0006\u0010T\u001a\u00020'2\u0006\u00106\u001a\u0002072\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u0002072\u0006\u0010<\u001a\u00020=H\u0002ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\"\u0010W\u001a\u00020\u000f*\u00020\u000f2\f\u0010X\u001a\b\u0012\u0004\u0012\u0002090\u00162\u0006\u0010<\u001a\u00020=H\u0000\u001a\u009a\u0001\u0010Y\u001a\u00020\t*\u00020Z2\u0006\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020'2\b\u0010]\u001a\u0004\u0018\u00010^2\b\u0010_\u001a\u0004\u0018\u00010^2\b\u0010`\u001a\u0004\u0018\u00010^2\b\u0010a\u001a\u0004\u0018\u00010^2\u0006\u0010b\u001a\u00020^2\b\u0010c\u001a\u0004\u0018\u00010^2\b\u0010d\u001a\u0004\u0018\u00010^2\u0006\u0010e\u001a\u00020^2\b\u0010f\u001a\u0004\u0018\u00010^2\u0006\u00106\u001a\u0002072\u0006\u0010%\u001a\u00020\u00112\u0006\u0010J\u001a\u0002072\u0006\u0010g\u001a\u00020h2\u0006\u0010<\u001a\u00020=H\u0002\u001a\u0014\u0010i\u001a\u00020'*\u00020'2\u0006\u0010j\u001a\u00020'H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006k"}, d2 = {"OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "Landroidx/compose/ui/unit/TextUnit;", "getOutlinedTextFieldTopPadding", "()J", "J", "OutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", "container", "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "textFieldHeight", "labelHeight", "placeholderHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-DHJA7U0", "(IIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "outlineCutout", "labelSize", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "substractConstraintSafely", "from", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = 0.0f;
    private static final long OutlinedTextFieldTopPadding = 0;

    /* JADX INFO: renamed from: access$calculateHeight-mKXJcVc, reason: not valid java name */
    public static final /* synthetic */ int m2476access$calculateHeightmKXJcVc(int leadingHeight, int trailingHeight, int prefixHeight, int suffixHeight, int textFieldHeight, int labelHeight, int placeholderHeight, int supportingHeight, float animationProgress, long constraints, float density, PaddingValues paddingValues) {
        return m2478calculateHeightmKXJcVc(leadingHeight, trailingHeight, prefixHeight, suffixHeight, textFieldHeight, labelHeight, placeholderHeight, supportingHeight, animationProgress, constraints, density, paddingValues);
    }

    /* JADX INFO: renamed from: access$calculateWidth-DHJA7U0, reason: not valid java name */
    public static final /* synthetic */ int m2477access$calculateWidthDHJA7U0(int leadingPlaceableWidth, int trailingPlaceableWidth, int prefixPlaceableWidth, int suffixPlaceableWidth, int textFieldPlaceableWidth, int labelPlaceableWidth, int placeholderPlaceableWidth, float animationProgress, long constraints, float density, PaddingValues paddingValues) {
        return m2479calculateWidthDHJA7U0(leadingPlaceableWidth, trailingPlaceableWidth, prefixPlaceableWidth, suffixPlaceableWidth, textFieldPlaceableWidth, labelPlaceableWidth, placeholderPlaceableWidth, animationProgress, constraints, density, paddingValues);
    }

    public static final /* synthetic */ float access$getOutlinedTextFieldInnerPadding$p() {
        return OutlinedTextFieldInnerPadding;
    }

    public static final /* synthetic */ void access$place(Placeable.PlacementScope $receiver, int totalHeight, int width, Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable prefixPlaceable, Placeable suffixPlaceable, Placeable textFieldPlaceable, Placeable labelPlaceable, Placeable placeholderPlaceable, Placeable containerPlaceable, Placeable supportingPlaceable, float animationProgress, boolean singleLine, float density, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        place($receiver, totalHeight, width, leadingPlaceable, trailingPlaceable, prefixPlaceable, suffixPlaceable, textFieldPlaceable, labelPlaceable, placeholderPlaceable, containerPlaceable, supportingPlaceable, animationProgress, singleLine, density, layoutDirection, paddingValues);
    }

    public static final /* synthetic */ int access$substractConstraintSafely(int $receiver, int from) {
        return substractConstraintSafely($receiver, from);
    }

    public static final void OutlinedTextField(final String value, final Function1<? super String, Unit> r70, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> r75, Function2<? super Composer, ? super Integer, Unit> r76, Function2<? super Composer, ? super Integer, Unit> r77, Function2<? super Composer, ? super Integer, Unit> r78, Function2<? super Composer, ? super Integer, Unit> r79, Function2<? super Composer, ? super Integer, Unit> r80, Function2<? super Composer, ? super Integer, Unit> r81, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int $changed2, final int r96) {
        Composer $composer2 = $composer.startRestartGroup(-1922450045);
        ComposerKt.sourceInformation($composer2, "C(OutlinedTextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)175@9821L7,191@10625L5,192@10688L8,204@11208L7,206@11308L2853,206@11221L2940:OutlinedTextField.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        int $dirty2 = $changed2;
        if ((r96 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        String r8 = value;
    L14:
        if ((r96 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r14 = r96 & 4;
        if (r14 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r17 = r96 & 8;
        int r18 = 2048;
        if (r17 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r21 = r96 & 16;
        int r22 = 16384;
        if (r21 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean readOnly2 = readOnly;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L60;
        TextStyle textStyle2 = textStyle;
    L68:
        int r28 = r96 & 64;
        if (r28 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r15 = r75;
    L79:
        int r0 = r96 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r1 = r96 & 256;
        if (r1 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r2 = r96 & 512;
        if (r2 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r3 = r96 & 1024;
        if (r3 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r4 = r96 & 2048;
        if (r4 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r5 = r96 & 4096;
        if (r5 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r39 = r5;
    L145:
        int r6 = r96 & 8192;
        if (r6 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r40 = r6;
    L156:
        int r7 = r96 & 16384;
        if (r7 == 0) goto L159;
        $dirty1 = $dirty1 | 24576;
        int r19 = r7;
    L167:
        int r110 = r96 & 32768;
        if (r110 == 0) goto L171;
        $dirty1 = $dirty1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L178:
        int r23 = r96 & 65536;
        if (r23 == 0) goto L182;
        $dirty1 = $dirty1 | 1572864;
    L189:
        int r24 = r96 & 131072;
        if (r24 == 0) goto L193;
        $dirty1 = $dirty1 | 12582912;
    L201:
        if (($changed1 & 100663296) != 0) goto L211;
        if ((r96 & 262144) != 0) goto L208;
        if ($composer2.changed(maxLines) == false) goto L208;
        int r25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L209:
        $dirty1 = $dirty1 | r25;
    L208:
        r25 = 33554432;
    L211:
        int r26 = r96 & 524288;
        if (r26 == 0) goto L215;
        $dirty1 = $dirty1 | 805306368;
    L222:
        int r27 = r96 & 1048576;
        if (r27 == 0) goto L226;
        $dirty2 = $dirty2 | 6;
    L234:
        if (($changed2 & 48) != 0) goto L245;
        if ((r96 & 2097152) != 0) goto L241;
        if ($composer2.changed(shape) == false) goto L241;
        int r29 = 32;
    L242:
        $dirty2 = $dirty2 | r29;
    L241:
        r29 = 16;
    L245:
        if (($changed2 & 384) != 0) goto L256;
        if ((r96 & 4194304) != 0) goto L252;
        if ($composer2.changed(colors) == false) goto L252;
        int r30 = 256;
    L253:
        $dirty2 = $dirty2 | r30;
    L252:
        r30 = 128;
    L256:
        if (($dirty & 306783379) == 306783378) goto L258;
    L265:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L268;
    L283:
        if (r14 == 0) goto L285;
        modifier2 = Modifier.Companion;
    L285:
        if (r17 == 0) goto L287;
        enabled2 = true;
    L287:
        if (r21 == 0) goto L290;
        readOnly2 = false;
    L290:
        if ((r96 & 32) == 0) goto L292;
        ProvidableCompositionLocal<TextStyle> r9 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty = $dirty & (-458753);
        textStyle2 = (TextStyle) r10;
    L292:
        if (r28 == 0) goto L294;
        r15 = null;
    L294:
        if (r0 == 0) goto L296;
        Function2<? super Composer, ? super Integer, Unit> r11 = null;
    L297:
        if (r1 == 0) goto L299;
        Function2<? super Composer, ? super Integer, Unit> r12 = null;
    L300:
        if (r2 == 0) goto L302;
        Function2<? super Composer, ? super Integer, Unit> r13 = null;
    L303:
        if (r3 == 0) goto L305;
        Function2<? super Composer, ? super Integer, Unit> r16 = null;
    L306:
        if (r4 == 0) goto L308;
        Function2<? super Composer, ? super Integer, Unit> r111 = null;
    L309:
        if (r39 == 0) goto L311;
        Function2<? super Composer, ? super Integer, Unit> r112 = null;
    L312:
        if (r40 == 0) goto L314;
        boolean isError2 = false;
    L315:
        if (r19 == 0) goto L317;
        VisualTransformation visualTransformation2 = VisualTransformation.Companion.getNone();
    L318:
        if (r110 == 0) goto L320;
        KeyboardOptions keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L321:
        if (r23 == 0) goto L323;
        KeyboardActions keyboardActions2 = KeyboardActions.Companion.getDefault();
    L324:
        if (r24 == 0) goto L326;
        boolean singleLine2 = false;
    L328:
        if ((r96 & 262144) == 0) goto L333;
        if (singleLine2 == false) goto L331;
        int maxLines2 = 1;
    L332:
        $dirty1 = $dirty1 & (-234881025);
    L334:
        if (r26 == 0) goto L336;
        int minLines2 = 1;
    L337:
        if (r27 == 0) goto L339;
        MutableInteractionSource interactionSource2 = null;
    L340:
        Function2<? super Composer, ? super Integer, Unit> r71 = r11;
        if ((r96 & 2097152) == 0) goto L343;
        Shape shape2 = OutlinedTextFieldDefaults.INSTANCE.getShape($composer2, 6);
        $dirty2 = $dirty2 & (-113);
    L345:
        if ((r96 & 4194304) == 0) goto L347;
        final Function2<? super Composer, ? super Integer, Unit> r210 = r71;
        final Function2<? super Composer, ? super Integer, Unit> r31 = r12;
        final Shape shape3 = shape2;
        $dirty2 = $dirty2 & (-897);
        final Function2<? super Composer, ? super Integer, Unit> r32 = r13;
        final Function2<? super Composer, ? super Integer, Unit> r33 = r16;
        final Function2<? super Composer, ? super Integer, Unit> r34 = r111;
        final Function2<? super Composer, ? super Integer, Unit> r35 = r112;
        final VisualTransformation visualTransformation3 = visualTransformation2;
        final int minLines3 = minLines2;
        MutableInteractionSource interactionSource3 = interactionSource2;
        TextFieldColors colors2 = OutlinedTextFieldDefaults.INSTANCE.colors($composer2, 6);
        TextStyle textStyle3 = textStyle2;
        final Function2<? super Composer, ? super Integer, Unit> r113 = r15;
        final boolean isError3 = isError2;
        final boolean singleLine3 = singleLine2;
        final int maxLines3 = maxLines2;
        final boolean isError4 = readOnly2;
        final KeyboardOptions keyboardOptions3 = keyboardOptions2;
        final KeyboardActions keyboardActions3 = keyboardActions2;
        final Modifier modifier3 = modifier2;
    L348:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L351;
        ComposerKt.traceEventStart(-1922450045, $dirty, $dirty1, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:193)");
    L351:
        $composer2.startReplaceGroup(30062948);
        ComposerKt.sourceInformation($composer2, "195@10782L39");
        if (interactionSource3 != null) goto L358;
        ComposerKt.sourceInformationMarkerStart($composer2, 30063599, "CC(remember):OutlinedTextField.kt#9igjgp");
        MutableInteractionSource interactionSource4 = interactionSource3;
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L356;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L357:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final MutableInteractionSource interactionSource5 = (MutableInteractionSource) value$iv;
    L359:
        $composer2.endReplaceGroup();
        $composer2.startReplaceGroup(30069058);
        ComposerKt.sourceInformation($composer2, "*199@11006L25");
        long $this$takeOrElse_u2dDxMtmZc$iv = textStyle3.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L362;
        boolean r20 = true;
    L363:
        if (r20 == true) goto L366;
        boolean focused = FocusInteractionKt.collectIsFocusedAsState(interactionSource5, $composer2, 0).getValue().booleanValue();
        $this$takeOrElse_u2dDxMtmZc$iv = colors2.m2789textColorXeAY9LY$material3_release(enabled2, isError3, focused);
    L366:
        $composer2.endReplaceGroup();
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        final TextStyle mergedTextStyle = textStyle3.merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        ProvidableCompositionLocal<Density> r36 = CompositionLocalsKt.getLocalDensity();
        TextStyle textStyle4 = textStyle3;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r37 = $composer2.consume(r36);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Density density = (Density) r37;
        final TextFieldColors colors3 = colors2;
        final String r114 = r8;
        final boolean enabled3 = enabled2;
        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(colors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-1886965181, true, new AnonymousClass1(modifier3, r113, density, isError3, colors3, r114, r70, enabled3, isError4, mergedTextStyle, keyboardOptions3, keyboardActions3, singleLine3, maxLines3, minLines3, visualTransformation3, interactionSource5, r210, r31, r32, r33, r34, r35, shape3), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L369;
        ComposerKt.traceEventEnd();
    L369:
        final MutableInteractionSource interactionSource6 = interactionSource4;
        final Modifier modifier4 = modifier3;
        final boolean isError5 = isError3;
        final boolean enabled4 = enabled3;
        final boolean readOnly3 = isError4;
        final KeyboardActions keyboardActions4 = keyboardActions3;
        final boolean singleLine4 = singleLine3;
        final int maxLines4 = maxLines3;
        final int minLines4 = minLines3;
        final VisualTransformation visualTransformation4 = visualTransformation3;
        final Function2<? super Composer, ? super Integer, Unit> r38 = r210;
        final Function2<? super Composer, ? super Integer, Unit> r41 = r31;
        final Function2<? super Composer, ? super Integer, Unit> r115 = r32;
        final Function2<? super Composer, ? super Integer, Unit> r116 = r33;
        final Function2<? super Composer, ? super Integer, Unit> r117 = r34;
        final Function2<? super Composer, ? super Integer, Unit> r42 = r113;
        final TextFieldColors colors4 = colors3;
        final KeyboardOptions keyboardOptions4 = keyboardOptions3;
        final Function2<? super Composer, ? super Integer, Unit> r118 = r35;
        final Shape shape4 = shape3;
        final TextStyle textStyle5 = textStyle4;
    L370:
        ScopeUpdateScope r43 = $composer2.endRestartGroup();
        if (r43 == null) goto L374;
        r43.updateScope(new AnonymousClass2(value, r70, modifier4, enabled4, readOnly3, textStyle5, r42, r38, r41, r115, r116, r117, r118, isError5, visualTransformation4, keyboardOptions4, keyboardActions4, singleLine4, maxLines4, minLines4, interactionSource6, shape4, colors4, $changed, $changed1, $changed2, r96));
        return;
    L374:
        return;
    L362:
        r20 = false;
        goto L363
    L356:
        value$iv = it$iv;
        goto L357
    L358:
        interactionSource4 = interactionSource3;
        interactionSource5 = interactionSource4;
        goto L359
    L347:
        r210 = r71;
        r31 = r12;
        shape3 = shape2;
        r32 = r13;
        textStyle3 = textStyle2;
        r33 = r16;
        r113 = r15;
        r34 = r111;
        r35 = r112;
        visualTransformation3 = visualTransformation2;
        isError3 = isError2;
        minLines3 = minLines2;
        interactionSource3 = interactionSource2;
        colors2 = colors;
        isError4 = readOnly2;
        singleLine3 = singleLine2;
        maxLines3 = maxLines2;
        modifier3 = modifier2;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        goto L348
    L343:
        shape2 = shape;
        goto L345
    L339:
        interactionSource2 = interactionSource;
        goto L340
    L336:
        minLines2 = minLines;
        goto L337
    L331:
        maxLines2 = Integer.MAX_VALUE;
        goto L332
    L333:
        maxLines2 = maxLines;
        goto L334
    L326:
        singleLine2 = singleLine;
        goto L328
    L323:
        keyboardActions2 = keyboardActions;
        goto L324
    L320:
        keyboardOptions2 = keyboardOptions;
        goto L321
    L317:
        visualTransformation2 = visualTransformation;
        goto L318
    L314:
        isError2 = isError;
        goto L315
    L311:
        r112 = r81;
        goto L312
    L308:
        r111 = r80;
        goto L309
    L305:
        r16 = r79;
        goto L306
    L302:
        r13 = r78;
        goto L303
    L299:
        r12 = r77;
        goto L300
    L296:
        r11 = r76;
        goto L297
    L268:
        if ($composer2.getDefaultsInvalid() == true) goto L283;
        $composer2.skipToGroupEnd();
        if ((r96 & 32) == 0) goto L274;
        $dirty = $dirty & (-458753);
    L274:
        if ((262144 & r96) == 0) goto L277;
        $dirty1 = $dirty1 & (-234881025);
    L277:
        if ((2097152 & r96) == 0) goto L280;
        $dirty2 = $dirty2 & (-113);
    L280:
        if ((r96 & 4194304) == 0) goto L282;
        r210 = r76;
        r31 = r77;
        r32 = r78;
        r33 = r79;
        r34 = r80;
        r35 = r81;
        visualTransformation3 = visualTransformation;
        keyboardOptions3 = keyboardOptions;
        keyboardActions3 = keyboardActions;
        singleLine3 = singleLine;
        maxLines3 = maxLines;
        minLines3 = minLines;
        interactionSource3 = interactionSource;
        shape3 = shape;
        colors2 = colors;
        $dirty2 = $dirty2 & (-897);
        isError4 = readOnly2;
        textStyle3 = textStyle2;
        r113 = r15;
        isError3 = isError;
        modifier3 = modifier2;
        goto L348
    L282:
        r210 = r76;
        r31 = r77;
        r32 = r78;
        r33 = r79;
        r34 = r80;
        r35 = r81;
        visualTransformation3 = visualTransformation;
        keyboardOptions3 = keyboardOptions;
        keyboardActions3 = keyboardActions;
        singleLine3 = singleLine;
        maxLines3 = maxLines;
        minLines3 = minLines;
        interactionSource3 = interactionSource;
        shape3 = shape;
        colors2 = colors;
        isError4 = readOnly2;
        textStyle3 = textStyle2;
        r113 = r15;
        isError3 = isError;
        modifier3 = modifier2;
        goto L348
    L258:
        if ((306783379 & $dirty1) != 306783378) goto L265;
        if (($dirty2 & 147) != 146) goto L265;
        if ($composer2.getSkipping() == false) goto L265;
        $composer2.skipToGroupEnd();
        r38 = r76;
        r116 = r79;
        isError5 = isError;
        keyboardOptions4 = keyboardOptions;
        keyboardActions4 = keyboardActions;
        singleLine4 = singleLine;
        maxLines4 = maxLines;
        minLines4 = minLines;
        interactionSource6 = interactionSource;
        shape4 = shape;
        colors4 = colors;
        modifier4 = modifier2;
        enabled4 = enabled2;
        readOnly3 = readOnly2;
        textStyle5 = textStyle2;
        r42 = r15;
        r41 = r77;
        r115 = r78;
        r117 = r80;
        r118 = r81;
        visualTransformation4 = visualTransformation;
        goto L370
    L226:
        if (($changed2 & 6) != 0) goto L234;
        if ($composer2.changed(interactionSource) == false) goto L230;
        int r211 = 4;
    L231:
        $dirty2 = $dirty2 | r211;
        goto L234
    L230:
        r211 = 2;
        goto L231
    L215:
        if (($changed1 & 805306368) != 0) goto L222;
        if ($composer2.changed(minLines) == false) goto L219;
        int r212 = 536870912;
    L220:
        $dirty1 = $dirty1 | r212;
        goto L222
    L219:
        r212 = 268435456;
        goto L220
    L193:
        if (($changed1 & 12582912) != 0) goto L201;
        if ($composer2.changed(singleLine) == false) goto L197;
        int r213 = 8388608;
    L198:
        $dirty1 = $dirty1 | r213;
        goto L201
    L197:
        r213 = 4194304;
        goto L198
    L182:
        if (($changed1 & 1572864) != 0) goto L189;
        if ($composer2.changed(keyboardActions) == false) goto L186;
        int r214 = 1048576;
    L187:
        $dirty1 = $dirty1 | r214;
        goto L189
    L186:
        r214 = 524288;
        goto L187
    L171:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L178;
        if ($composer2.changed(keyboardOptions) == false) goto L175;
        int r215 = 131072;
    L176:
        $dirty1 = $dirty1 | r215;
        goto L178
    L175:
        r215 = 65536;
        goto L176
    L159:
        r19 = r7;
        if (($changed1 & 24576) != 0) goto L167;
        if ($composer2.changed(visualTransformation) == true) goto L165;
        r22 = 8192;
    L165:
        $dirty1 = $dirty1 | r22;
        goto L167
    L148:
        r40 = r6;
        if (($changed1 & 3072) != 0) goto L156;
        if ($composer2.changed(isError) == true) goto L154;
        r18 = 1024;
    L154:
        $dirty1 = $dirty1 | r18;
        goto L156
    L137:
        r39 = r5;
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changedInstance(r81) == false) goto L142;
        int r44 = 256;
    L143:
        $dirty1 = $dirty1 | r44;
        goto L145
    L142:
        r44 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changedInstance(r80) == false) goto L131;
        int r310 = 32;
    L132:
        $dirty1 = $dirty1 | r310;
        goto L134
    L131:
        r310 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changedInstance(r79) == false) goto L120;
        int r311 = 4;
    L121:
        $dirty1 = $dirty1 | r311;
        goto L123
    L120:
        r311 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r78) == false) goto L109;
        int r312 = 536870912;
    L110:
        $dirty = $dirty | r312;
        goto L112
    L109:
        r312 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r77) == false) goto L98;
        int r313 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r313;
        goto L101
    L98:
        r313 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r76) == false) goto L87;
        int r314 = 8388608;
    L88:
        $dirty = $dirty | r314;
        goto L90
    L87:
        r314 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r15 = r75;
        if ($composer2.changedInstance(r15) == false) goto L76;
        int r315 = 1048576;
    L77:
        $dirty = $dirty | r315;
        goto L79
    L76:
        r315 = 524288;
        goto L77
    L78:
        r15 = r75;
        goto L79
    L60:
        if ((r96 & 32) != 0) goto L64;
        textStyle2 = textStyle;
        if ($composer2.changed(textStyle2) == false) goto L65;
        int r216 = 131072;
    L66:
        $dirty = $dirty | r216;
    L65:
        r216 = 65536;
        goto L66
    L64:
        textStyle2 = textStyle;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        readOnly2 = readOnly;
        if ($composer2.changed(readOnly2) == false) goto L54;
        int r217 = 16384;
    L55:
        $dirty = $dirty | r217;
        goto L58
    L54:
        r217 = 8192;
        goto L55
    L56:
        readOnly2 = readOnly;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r218 = 2048;
    L44:
        $dirty = $dirty | r218;
        goto L46
    L43:
        r218 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r119 = 256;
    L33:
        $dirty = $dirty | r119;
        goto L35
    L32:
        r119 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r70) == false) goto L21;
        int r120 = 32;
    L22:
        $dirty = $dirty | r120;
        goto L24
    L21:
        r120 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r8 = value;
        if ($composer2.changed(r8) == false) goto L10;
        int r121 = 4;
    L11:
        $dirty = $dirty | r121;
        goto L14
    L10:
        r121 = 2;
        goto L11
    L12:
        r8 = value;
        goto L14
    }

    public static final void OutlinedTextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> r70, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> r75, Function2<? super Composer, ? super Integer, Unit> r76, Function2<? super Composer, ? super Integer, Unit> r77, Function2<? super Composer, ? super Integer, Unit> r78, Function2<? super Composer, ? super Integer, Unit> r79, Function2<? super Composer, ? super Integer, Unit> r80, Function2<? super Composer, ? super Integer, Unit> r81, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int $changed2, final int r96) {
        Composer $composer2 = $composer.startRestartGroup(-1570442800);
        ComposerKt.sourceInformation($composer2, "C(OutlinedTextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)350@19364L7,366@20168L5,367@20231L8,379@20751L7,381@20851L2858,381@20764L2945:OutlinedTextField.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        int $dirty2 = $changed2;
        if ((r96 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        TextFieldValue r8 = value;
    L14:
        if ((r96 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r14 = r96 & 4;
        if (r14 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r17 = r96 & 8;
        int r18 = 2048;
        if (r17 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r21 = r96 & 16;
        int r22 = 16384;
        if (r21 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean readOnly2 = readOnly;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L60;
        TextStyle textStyle2 = textStyle;
    L68:
        int r28 = r96 & 64;
        if (r28 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r15 = r75;
    L79:
        int r0 = r96 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r1 = r96 & 256;
        if (r1 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r2 = r96 & 512;
        if (r2 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r3 = r96 & 1024;
        if (r3 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r4 = r96 & 2048;
        if (r4 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r5 = r96 & 4096;
        if (r5 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r39 = r5;
    L145:
        int r6 = r96 & 8192;
        if (r6 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r40 = r6;
    L156:
        int r7 = r96 & 16384;
        if (r7 == 0) goto L159;
        $dirty1 = $dirty1 | 24576;
        int r19 = r7;
    L167:
        int r110 = r96 & 32768;
        if (r110 == 0) goto L171;
        $dirty1 = $dirty1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L178:
        int r23 = r96 & 65536;
        if (r23 == 0) goto L182;
        $dirty1 = $dirty1 | 1572864;
    L189:
        int r24 = r96 & 131072;
        if (r24 == 0) goto L193;
        $dirty1 = $dirty1 | 12582912;
    L201:
        if (($changed1 & 100663296) != 0) goto L211;
        if ((r96 & 262144) != 0) goto L208;
        if ($composer2.changed(maxLines) == false) goto L208;
        int r25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L209:
        $dirty1 = $dirty1 | r25;
    L208:
        r25 = 33554432;
    L211:
        int r26 = r96 & 524288;
        if (r26 == 0) goto L215;
        $dirty1 = $dirty1 | 805306368;
    L222:
        int r27 = r96 & 1048576;
        if (r27 == 0) goto L226;
        $dirty2 = $dirty2 | 6;
    L234:
        if (($changed2 & 48) != 0) goto L245;
        if ((r96 & 2097152) != 0) goto L241;
        if ($composer2.changed(shape) == false) goto L241;
        int r29 = 32;
    L242:
        $dirty2 = $dirty2 | r29;
    L241:
        r29 = 16;
    L245:
        if (($changed2 & 384) != 0) goto L256;
        if ((r96 & 4194304) != 0) goto L252;
        if ($composer2.changed(colors) == false) goto L252;
        int r30 = 256;
    L253:
        $dirty2 = $dirty2 | r30;
    L252:
        r30 = 128;
    L256:
        if (($dirty & 306783379) == 306783378) goto L258;
    L265:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L268;
    L283:
        if (r14 == 0) goto L285;
        modifier2 = Modifier.Companion;
    L285:
        if (r17 == 0) goto L287;
        enabled2 = true;
    L287:
        if (r21 == 0) goto L290;
        readOnly2 = false;
    L290:
        if ((r96 & 32) == 0) goto L292;
        ProvidableCompositionLocal<TextStyle> r9 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty = $dirty & (-458753);
        textStyle2 = (TextStyle) r10;
    L292:
        if (r28 == 0) goto L294;
        r15 = null;
    L294:
        if (r0 == 0) goto L296;
        Function2<? super Composer, ? super Integer, Unit> r11 = null;
    L297:
        if (r1 == 0) goto L299;
        Function2<? super Composer, ? super Integer, Unit> r12 = null;
    L300:
        if (r2 == 0) goto L302;
        Function2<? super Composer, ? super Integer, Unit> r13 = null;
    L303:
        if (r3 == 0) goto L305;
        Function2<? super Composer, ? super Integer, Unit> r16 = null;
    L306:
        if (r4 == 0) goto L308;
        Function2<? super Composer, ? super Integer, Unit> r111 = null;
    L309:
        if (r39 == 0) goto L311;
        Function2<? super Composer, ? super Integer, Unit> r112 = null;
    L312:
        if (r40 == 0) goto L314;
        boolean isError2 = false;
    L315:
        if (r19 == 0) goto L317;
        VisualTransformation visualTransformation2 = VisualTransformation.Companion.getNone();
    L318:
        if (r110 == 0) goto L320;
        KeyboardOptions keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L321:
        if (r23 == 0) goto L323;
        KeyboardActions keyboardActions2 = KeyboardActions.Companion.getDefault();
    L324:
        if (r24 == 0) goto L326;
        boolean singleLine2 = false;
    L328:
        if ((r96 & 262144) == 0) goto L333;
        if (singleLine2 == false) goto L331;
        int maxLines2 = 1;
    L332:
        $dirty1 = $dirty1 & (-234881025);
    L334:
        if (r26 == 0) goto L336;
        int minLines2 = 1;
    L337:
        if (r27 == 0) goto L339;
        MutableInteractionSource interactionSource2 = null;
    L340:
        Function2<? super Composer, ? super Integer, Unit> r71 = r11;
        if ((r96 & 2097152) == 0) goto L343;
        Shape shape2 = OutlinedTextFieldDefaults.INSTANCE.getShape($composer2, 6);
        $dirty2 = $dirty2 & (-113);
    L345:
        if ((r96 & 4194304) == 0) goto L347;
        final Function2<? super Composer, ? super Integer, Unit> r210 = r71;
        final Function2<? super Composer, ? super Integer, Unit> r31 = r12;
        final Shape shape3 = shape2;
        $dirty2 = $dirty2 & (-897);
        final Function2<? super Composer, ? super Integer, Unit> r32 = r13;
        final Function2<? super Composer, ? super Integer, Unit> r33 = r16;
        final Function2<? super Composer, ? super Integer, Unit> r34 = r111;
        final Function2<? super Composer, ? super Integer, Unit> r35 = r112;
        final VisualTransformation visualTransformation3 = visualTransformation2;
        final int minLines3 = minLines2;
        MutableInteractionSource interactionSource3 = interactionSource2;
        TextFieldColors colors2 = OutlinedTextFieldDefaults.INSTANCE.colors($composer2, 6);
        TextStyle textStyle3 = textStyle2;
        final Function2<? super Composer, ? super Integer, Unit> r113 = r15;
        final boolean isError3 = isError2;
        final boolean singleLine3 = singleLine2;
        final int maxLines3 = maxLines2;
        final boolean isError4 = readOnly2;
        final KeyboardOptions keyboardOptions3 = keyboardOptions2;
        final KeyboardActions keyboardActions3 = keyboardActions2;
        final Modifier modifier3 = modifier2;
    L348:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L351;
        ComposerKt.traceEventStart(-1570442800, $dirty, $dirty1, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:368)");
    L351:
        $composer2.startReplaceGroup(30368324);
        ComposerKt.sourceInformation($composer2, "370@20325L39");
        if (interactionSource3 != null) goto L358;
        ComposerKt.sourceInformationMarkerStart($composer2, 30368975, "CC(remember):OutlinedTextField.kt#9igjgp");
        MutableInteractionSource interactionSource4 = interactionSource3;
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L356;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L357:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final MutableInteractionSource interactionSource5 = (MutableInteractionSource) value$iv;
    L359:
        $composer2.endReplaceGroup();
        $composer2.startReplaceGroup(30374434);
        ComposerKt.sourceInformation($composer2, "*374@20549L25");
        long $this$takeOrElse_u2dDxMtmZc$iv = textStyle3.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L362;
        boolean r20 = true;
    L363:
        if (r20 == true) goto L366;
        boolean focused = FocusInteractionKt.collectIsFocusedAsState(interactionSource5, $composer2, 0).getValue().booleanValue();
        $this$takeOrElse_u2dDxMtmZc$iv = colors2.m2789textColorXeAY9LY$material3_release(enabled2, isError3, focused);
    L366:
        $composer2.endReplaceGroup();
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        final TextStyle mergedTextStyle = textStyle3.merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        ProvidableCompositionLocal<Density> r36 = CompositionLocalsKt.getLocalDensity();
        TextStyle textStyle4 = textStyle3;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r37 = $composer2.consume(r36);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Density density = (Density) r37;
        final TextFieldColors colors3 = colors2;
        final TextFieldValue r114 = r8;
        final boolean enabled3 = enabled2;
        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(colors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1830921872, true, new AnonymousClass3(modifier3, r113, density, isError3, colors3, r114, r70, enabled3, isError4, mergedTextStyle, keyboardOptions3, keyboardActions3, singleLine3, maxLines3, minLines3, visualTransformation3, interactionSource5, r210, r31, r32, r33, r34, r35, shape3), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L369;
        ComposerKt.traceEventEnd();
    L369:
        final MutableInteractionSource interactionSource6 = interactionSource4;
        final Modifier modifier4 = modifier3;
        final boolean isError5 = isError3;
        final boolean enabled4 = enabled3;
        final boolean readOnly3 = isError4;
        final KeyboardActions keyboardActions4 = keyboardActions3;
        final boolean singleLine4 = singleLine3;
        final int maxLines4 = maxLines3;
        final int minLines4 = minLines3;
        final VisualTransformation visualTransformation4 = visualTransformation3;
        final Function2<? super Composer, ? super Integer, Unit> r38 = r210;
        final Function2<? super Composer, ? super Integer, Unit> r41 = r31;
        final Function2<? super Composer, ? super Integer, Unit> r115 = r32;
        final Function2<? super Composer, ? super Integer, Unit> r116 = r33;
        final Function2<? super Composer, ? super Integer, Unit> r117 = r34;
        final Function2<? super Composer, ? super Integer, Unit> r42 = r113;
        final TextFieldColors colors4 = colors3;
        final KeyboardOptions keyboardOptions4 = keyboardOptions3;
        final Function2<? super Composer, ? super Integer, Unit> r118 = r35;
        final Shape shape4 = shape3;
        final TextStyle textStyle5 = textStyle4;
    L370:
        ScopeUpdateScope r43 = $composer2.endRestartGroup();
        if (r43 == null) goto L374;
        r43.updateScope(new AnonymousClass4(value, r70, modifier4, enabled4, readOnly3, textStyle5, r42, r38, r41, r115, r116, r117, r118, isError5, visualTransformation4, keyboardOptions4, keyboardActions4, singleLine4, maxLines4, minLines4, interactionSource6, shape4, colors4, $changed, $changed1, $changed2, r96));
        return;
    L374:
        return;
    L362:
        r20 = false;
        goto L363
    L356:
        value$iv = it$iv;
        goto L357
    L358:
        interactionSource4 = interactionSource3;
        interactionSource5 = interactionSource4;
        goto L359
    L347:
        r210 = r71;
        r31 = r12;
        shape3 = shape2;
        r32 = r13;
        textStyle3 = textStyle2;
        r33 = r16;
        r113 = r15;
        r34 = r111;
        r35 = r112;
        visualTransformation3 = visualTransformation2;
        isError3 = isError2;
        minLines3 = minLines2;
        interactionSource3 = interactionSource2;
        colors2 = colors;
        isError4 = readOnly2;
        singleLine3 = singleLine2;
        maxLines3 = maxLines2;
        modifier3 = modifier2;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        goto L348
    L343:
        shape2 = shape;
        goto L345
    L339:
        interactionSource2 = interactionSource;
        goto L340
    L336:
        minLines2 = minLines;
        goto L337
    L331:
        maxLines2 = Integer.MAX_VALUE;
        goto L332
    L333:
        maxLines2 = maxLines;
        goto L334
    L326:
        singleLine2 = singleLine;
        goto L328
    L323:
        keyboardActions2 = keyboardActions;
        goto L324
    L320:
        keyboardOptions2 = keyboardOptions;
        goto L321
    L317:
        visualTransformation2 = visualTransformation;
        goto L318
    L314:
        isError2 = isError;
        goto L315
    L311:
        r112 = r81;
        goto L312
    L308:
        r111 = r80;
        goto L309
    L305:
        r16 = r79;
        goto L306
    L302:
        r13 = r78;
        goto L303
    L299:
        r12 = r77;
        goto L300
    L296:
        r11 = r76;
        goto L297
    L268:
        if ($composer2.getDefaultsInvalid() == true) goto L283;
        $composer2.skipToGroupEnd();
        if ((r96 & 32) == 0) goto L274;
        $dirty = $dirty & (-458753);
    L274:
        if ((262144 & r96) == 0) goto L277;
        $dirty1 = $dirty1 & (-234881025);
    L277:
        if ((2097152 & r96) == 0) goto L280;
        $dirty2 = $dirty2 & (-113);
    L280:
        if ((r96 & 4194304) == 0) goto L282;
        r210 = r76;
        r31 = r77;
        r32 = r78;
        r33 = r79;
        r34 = r80;
        r35 = r81;
        visualTransformation3 = visualTransformation;
        keyboardOptions3 = keyboardOptions;
        keyboardActions3 = keyboardActions;
        singleLine3 = singleLine;
        maxLines3 = maxLines;
        minLines3 = minLines;
        interactionSource3 = interactionSource;
        shape3 = shape;
        colors2 = colors;
        $dirty2 = $dirty2 & (-897);
        isError4 = readOnly2;
        textStyle3 = textStyle2;
        r113 = r15;
        isError3 = isError;
        modifier3 = modifier2;
        goto L348
    L282:
        r210 = r76;
        r31 = r77;
        r32 = r78;
        r33 = r79;
        r34 = r80;
        r35 = r81;
        visualTransformation3 = visualTransformation;
        keyboardOptions3 = keyboardOptions;
        keyboardActions3 = keyboardActions;
        singleLine3 = singleLine;
        maxLines3 = maxLines;
        minLines3 = minLines;
        interactionSource3 = interactionSource;
        shape3 = shape;
        colors2 = colors;
        isError4 = readOnly2;
        textStyle3 = textStyle2;
        r113 = r15;
        isError3 = isError;
        modifier3 = modifier2;
        goto L348
    L258:
        if ((306783379 & $dirty1) != 306783378) goto L265;
        if (($dirty2 & 147) != 146) goto L265;
        if ($composer2.getSkipping() == false) goto L265;
        $composer2.skipToGroupEnd();
        r38 = r76;
        r116 = r79;
        isError5 = isError;
        keyboardOptions4 = keyboardOptions;
        keyboardActions4 = keyboardActions;
        singleLine4 = singleLine;
        maxLines4 = maxLines;
        minLines4 = minLines;
        interactionSource6 = interactionSource;
        shape4 = shape;
        colors4 = colors;
        modifier4 = modifier2;
        enabled4 = enabled2;
        readOnly3 = readOnly2;
        textStyle5 = textStyle2;
        r42 = r15;
        r41 = r77;
        r115 = r78;
        r117 = r80;
        r118 = r81;
        visualTransformation4 = visualTransformation;
        goto L370
    L226:
        if (($changed2 & 6) != 0) goto L234;
        if ($composer2.changed(interactionSource) == false) goto L230;
        int r211 = 4;
    L231:
        $dirty2 = $dirty2 | r211;
        goto L234
    L230:
        r211 = 2;
        goto L231
    L215:
        if (($changed1 & 805306368) != 0) goto L222;
        if ($composer2.changed(minLines) == false) goto L219;
        int r212 = 536870912;
    L220:
        $dirty1 = $dirty1 | r212;
        goto L222
    L219:
        r212 = 268435456;
        goto L220
    L193:
        if (($changed1 & 12582912) != 0) goto L201;
        if ($composer2.changed(singleLine) == false) goto L197;
        int r213 = 8388608;
    L198:
        $dirty1 = $dirty1 | r213;
        goto L201
    L197:
        r213 = 4194304;
        goto L198
    L182:
        if (($changed1 & 1572864) != 0) goto L189;
        if ($composer2.changed(keyboardActions) == false) goto L186;
        int r214 = 1048576;
    L187:
        $dirty1 = $dirty1 | r214;
        goto L189
    L186:
        r214 = 524288;
        goto L187
    L171:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L178;
        if ($composer2.changed(keyboardOptions) == false) goto L175;
        int r215 = 131072;
    L176:
        $dirty1 = $dirty1 | r215;
        goto L178
    L175:
        r215 = 65536;
        goto L176
    L159:
        r19 = r7;
        if (($changed1 & 24576) != 0) goto L167;
        if ($composer2.changed(visualTransformation) == true) goto L165;
        r22 = 8192;
    L165:
        $dirty1 = $dirty1 | r22;
        goto L167
    L148:
        r40 = r6;
        if (($changed1 & 3072) != 0) goto L156;
        if ($composer2.changed(isError) == true) goto L154;
        r18 = 1024;
    L154:
        $dirty1 = $dirty1 | r18;
        goto L156
    L137:
        r39 = r5;
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changedInstance(r81) == false) goto L142;
        int r44 = 256;
    L143:
        $dirty1 = $dirty1 | r44;
        goto L145
    L142:
        r44 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changedInstance(r80) == false) goto L131;
        int r310 = 32;
    L132:
        $dirty1 = $dirty1 | r310;
        goto L134
    L131:
        r310 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changedInstance(r79) == false) goto L120;
        int r311 = 4;
    L121:
        $dirty1 = $dirty1 | r311;
        goto L123
    L120:
        r311 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r78) == false) goto L109;
        int r312 = 536870912;
    L110:
        $dirty = $dirty | r312;
        goto L112
    L109:
        r312 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r77) == false) goto L98;
        int r313 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r313;
        goto L101
    L98:
        r313 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r76) == false) goto L87;
        int r314 = 8388608;
    L88:
        $dirty = $dirty | r314;
        goto L90
    L87:
        r314 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r15 = r75;
        if ($composer2.changedInstance(r15) == false) goto L76;
        int r315 = 1048576;
    L77:
        $dirty = $dirty | r315;
        goto L79
    L76:
        r315 = 524288;
        goto L77
    L78:
        r15 = r75;
        goto L79
    L60:
        if ((r96 & 32) != 0) goto L64;
        textStyle2 = textStyle;
        if ($composer2.changed(textStyle2) == false) goto L65;
        int r216 = 131072;
    L66:
        $dirty = $dirty | r216;
    L65:
        r216 = 65536;
        goto L66
    L64:
        textStyle2 = textStyle;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        readOnly2 = readOnly;
        if ($composer2.changed(readOnly2) == false) goto L54;
        int r217 = 16384;
    L55:
        $dirty = $dirty | r217;
        goto L58
    L54:
        r217 = 8192;
        goto L55
    L56:
        readOnly2 = readOnly;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r218 = 2048;
    L44:
        $dirty = $dirty | r218;
        goto L46
    L43:
        r218 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r119 = 256;
    L33:
        $dirty = $dirty | r119;
        goto L35
    L32:
        r119 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r70) == false) goto L21;
        int r120 = 32;
    L22:
        $dirty = $dirty | r120;
        goto L24
    L21:
        r120 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r8 = value;
        if ($composer2.changed(r8) == false) goto L10;
        int r121 = 4;
    L11:
        $dirty = $dirty | r121;
        goto L14
    L10:
        r121 = 2;
        goto L11
    L12:
        r8 = value;
        goto L14
    }

    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r63, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> r64, final Function2<? super Composer, ? super Integer, Unit> r65, final Function2<? super Composer, ? super Integer, Unit> r66, final Function2<? super Composer, ? super Integer, Unit> r67, final Function2<? super Composer, ? super Integer, Unit> r68, final Function2<? super Composer, ? super Integer, Unit> r69, final boolean singleLine, float animationProgress, final Function1<? super Size, Unit> r72, final Function2<? super Composer, ? super Integer, Unit> r73, Function2<? super Composer, ? super Integer, Unit> r74, PaddingValues paddingValues, Composer $composer, final int $changed, final int $changed1) {
        final float r10 = animationProgress;
        Composer $composer2 = $composer.startRestartGroup(1408290209);
        ComposerKt.sourceInformation($composer2, "C(OutlinedTextFieldLayout)P(4,12,7,2,3,13,8,10,9!1,5!1,11)470@24558L267,478@24873L7,479@24885L3739:OutlinedTextField.kt#uh7d8r");
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) goto L5;
        int $dirty = $changed;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changedInstance(r63) == false) goto L15;
        int r19 = 32;
    L16:
        $dirty = $dirty | r19;
        goto L18
    L15:
        r19 = 16;
    L18:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changedInstance(r64) == false) goto L22;
        int r14 = 256;
    L23:
        $dirty = $dirty | r14;
        goto L25
    L22:
        r14 = 128;
    L25:
        if (($changed & 3072) != 0) goto L32;
        if ($composer2.changedInstance(r65) == false) goto L29;
        int r110 = 2048;
    L30:
        $dirty = $dirty | r110;
        goto L32
    L29:
        r110 = 1024;
    L32:
        if (($changed & 24576) != 0) goto L39;
        if ($composer2.changedInstance(r66) == false) goto L36;
        int r15 = 16384;
    L37:
        $dirty = $dirty | r15;
        goto L39
    L36:
        r15 = 8192;
    L39:
        if ((196608 & $changed) != 0) goto L46;
        if ($composer2.changedInstance(r67) == false) goto L43;
        int r16 = 131072;
    L44:
        $dirty = $dirty | r16;
        goto L46
    L43:
        r16 = 65536;
    L46:
        if ((1572864 & $changed) != 0) goto L53;
        if ($composer2.changedInstance(r68) == false) goto L50;
        int r17 = 1048576;
    L51:
        $dirty = $dirty | r17;
        goto L53
    L50:
        r17 = 524288;
    L53:
        if ((12582912 & $changed) != 0) goto L60;
        if ($composer2.changedInstance(r69) == false) goto L57;
        int r18 = 8388608;
    L58:
        $dirty = $dirty | r18;
        goto L60
    L57:
        r18 = 4194304;
    L60:
        if ((100663296 & $changed) != 0) goto L67;
        if ($composer2.changed(singleLine) == false) goto L64;
        int r111 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L65:
        $dirty = $dirty | r111;
        goto L67
    L64:
        r111 = 33554432;
    L67:
        if ((805306368 & $changed) == 0) goto L69;
    L73:
        int $dirty2 = $dirty;
        int $dirty3 = $changed1 & 6;
        if ($dirty3 != 0) goto L81;
        if ($composer2.changedInstance(r72) == false) goto L78;
        int r112 = 4;
    L79:
        $dirty1 = $dirty1 | r112;
        goto L81
    L78:
        r112 = 2;
    L81:
        if (($changed1 & 48) != 0) goto L88;
        if ($composer2.changedInstance(r73) == false) goto L85;
        int r113 = 32;
    L86:
        $dirty1 = $dirty1 | r113;
        goto L88
    L85:
        r113 = 16;
    L88:
        if (($changed1 & 384) != 0) goto L96;
        if ($composer2.changedInstance(r74) == false) goto L92;
        int r114 = 256;
    L93:
        $dirty1 = $dirty1 | r114;
        goto L96
    L92:
        r114 = 128;
    L96:
        if (($changed1 & 3072) != 0) goto L102;
        PaddingValues r115 = paddingValues;
        if ($composer2.changed(r115) == false) goto L100;
        int r116 = 2048;
    L101:
        $dirty1 = $dirty1 | r116;
    L103:
        int $dirty4 = $dirty1;
        if (($dirty2 & 306783379) != 306783378) goto L112;
        if (($dirty4 & 1171) != 1170) goto L112;
        if ($composer2.getSkipping() == false) goto L112;
        $composer2.skipToGroupEnd();
        Function2<? super Composer, ? super Integer, Unit> r1 = r74;
        Composer $composer3 = $composer2;
    L303:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L307;
        final Function2<? super Composer, ? super Integer, Unit> r13 = r1;
        final PaddingValues r117 = r115;
        r0.updateScope(new C05462(modifier, r63, r64, r65, r66, r67, r68, r69, singleLine, r10, r72, r73, r13, r117, $changed, $changed1));
        return;
    L307:
        return;
    L112:
        if (ComposerKt.isTraceInProgress() == false) goto L114;
        ComposerKt.traceEventStart(1408290209, $dirty2, $dirty4, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:468)");
    L114:
        ComposerKt.sourceInformationMarkerStart($composer2, 602705309, "CC(remember):OutlinedTextField.kt#9igjgp");
        if (($dirty4 & 14) != 4) goto L117;
        boolean r2 = true;
    L118:
        boolean r118 = r2;
        if ((234881024 & $dirty2) != 67108864) goto L121;
        boolean r3 = true;
    L122:
        boolean r4 = r118 | r3;
        if ((1879048192 & $dirty2) != 536870912) goto L125;
        boolean r5 = true;
    L126:
        boolean r6 = r4 | r5;
        if (($dirty4 & 7168) != 2048) goto L129;
        boolean r7 = true;
    L130:
        boolean invalid$iv = r7 | r6;
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L137;
        if (value$iv == Composer.Companion.getEmpty()) goto L137;
    L138:
        OutlinedTextFieldMeasurePolicy measurePolicy = (OutlinedTextFieldMeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<LayoutDirection> r8 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LayoutDirection layoutDirection = (LayoutDirection) r9;
        int $changed$iv = ($dirty2 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier);
        Function0<ComposeUiNode> r24 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L141;
        ComposablesKt.invalidApplier();
    L141:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L144;
        Function0<ComposeUiNode> r11 = r24;
        $composer2.createNode(r11);
    L145:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r119 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L152;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L152;
    L153:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r12 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -828374317, "C482@24954L11,550@27430L186:OutlinedTextField.kt#uh7d8r");
        r73.invoke($composer3, Integer.valueOf(($dirty4 >> 3) & 14));
        $composer3.startReplaceGroup(250370369);
        ComposerKt.sourceInformation($composer3, "485@25018L219");
        if (r66 == null) goto L172;
        Modifier modifier$iv = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
        Function0<ComposeUiNode> r44 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L158;
        ComposablesKt.invalidApplier();
    L158:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L161;
        Function0<ComposeUiNode> r20 = r44;
        $composer3.createNode(r20);
    L162:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L169;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L169;
    L170:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r22 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r120 = BoxScopeInstance.INSTANCE;
        int r48 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -367907446, "C489@25210L9:OutlinedTextField.kt#uh7d8r");
        r66.invoke($composer3, Integer.valueOf(($dirty2 >> 12) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L169:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r21);
        goto L170
    L161:
        r20 = r44;
        $composer3.useNode();
    L172:
        $composer3.endReplaceGroup();
        $composer3.startReplaceGroup(250379492);
        ComposerKt.sourceInformation($composer3, "493@25304L221");
        if (r67 == null) goto L190;
        Modifier modifier$iv2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
        Alignment contentAlignment$iv2 = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r41 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L177;
        ComposablesKt.invalidApplier();
    L177:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L180;
        Function0<ComposeUiNode> r23 = r41;
        $composer3.createNode(r23);
    L181:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r121 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L188;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L188;
    L189:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r25 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r122 = BoxScopeInstance.INSTANCE;
        int r45 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -367622711, "C497@25497L10:OutlinedTextField.kt#uh7d8r");
        r67.invoke($composer3, Integer.valueOf(($dirty2 >> 15) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L188:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r121);
        goto L189
    L180:
        r23 = r41;
        $composer3.useNode();
    L190:
        $composer3.endReplaceGroup();
        float startTextFieldPadding = PaddingKt.calculateStartPadding(r115, layoutDirection);
        float endTextFieldPadding = PaddingKt.calculateEndPadding(r115, layoutDirection);
        if (r66 == null) goto L193;
        float other$iv = TextFieldImplKt.getHorizontalIconPadding();
        float other$iv2 = Dp.m6973constructorimpl(startTextFieldPadding - other$iv);
        float minimumValue$iv = Dp.m6973constructorimpl(0);
        float $this$coerceAtLeast_u2dYgX7TsA$iv = Dp.m6973constructorimpl(RangesKt.coerceAtLeast(other$iv2, minimumValue$iv));
    L194:
        float startPadding = $this$coerceAtLeast_u2dYgX7TsA$iv;
        if (r67 == null) goto L197;
        float other$iv3 = TextFieldImplKt.getHorizontalIconPadding();
        float other$iv4 = Dp.m6973constructorimpl(endTextFieldPadding - other$iv3);
        float minimumValue$iv2 = Dp.m6973constructorimpl(0);
        float $this$coerceAtLeast_u2dYgX7TsA$iv2 = Dp.m6973constructorimpl(RangesKt.coerceAtLeast(other$iv4, minimumValue$iv2));
    L198:
        $composer3.startReplaceGroup(250410106);
        ComposerKt.sourceInformation($composer3, "518@26256L309");
        if (r68 == null) goto L217;
        Modifier modifier$iv3 = PaddingKt.m729paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m760heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), startPadding, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv3 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, false);
        int $changed$iv$iv4 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r46 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv4 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L203;
        ComposablesKt.invalidApplier();
    L203:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L206;
        Function0<ComposeUiNode> r26 = r46;
        $composer3.createNode(r26);
    L207:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r27 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L214;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == false) goto L214;
    L215:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r28 = ($changed$iv$iv$iv3 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r29 = BoxScopeInstance.INSTANCE;
        int r51 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -366589109, "C524@26539L8:OutlinedTextField.kt#uh7d8r");
        r68.invoke($composer3, Integer.valueOf(($dirty2 >> 18) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L214:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r27);
        goto L215
    L206:
        r26 = r46;
        $composer3.useNode();
    L217:
        $composer3.endReplaceGroup();
        $composer3.startReplaceGroup(250422072);
        ComposerKt.sourceInformation($composer3, "528@26630L307");
        if (r69 == null) goto L235;
        float endPadding = $this$coerceAtLeast_u2dYgX7TsA$iv2;
        Modifier modifier$iv4 = PaddingKt.m729paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m760heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, endPadding, 0.0f, 10, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv4 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv4, false);
        int $changed$iv$iv5 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv4 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv4 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer3, modifier$iv4);
        Function0<ComposeUiNode> r47 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv4 = (($changed$iv$iv5 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L222;
        ComposablesKt.invalidApplier();
    L222:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L225;
        Function0<ComposeUiNode> r30 = r47;
        $composer3.createNode(r30);
    L226:
        Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r31 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv4.getInserting() == true) goto L233;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv4.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv4)) == false) goto L233;
    L234:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.Companion.getSetModifier());
        int r32 = ($changed$iv$iv$iv4 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r33 = BoxScopeInstance.INSTANCE;
        int r50 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -366220085, "C534@26911L8:OutlinedTextField.kt#uh7d8r");
        r69.invoke($composer3, Integer.valueOf(($dirty2 >> 21) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L233:
        $this$Layout_u24lambda_u240$iv$iv4.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv4));
        $this$Layout_u24lambda_u240$iv$iv4.apply(Integer.valueOf(compositeKeyHash$iv$iv4), r31);
        goto L234
    L225:
        r30 = r47;
        $composer3.useNode();
    L235:
        $composer3.endReplaceGroup();
        Modifier r42 = SizeKt.wrapContentHeight$default(SizeKt.m760heightInVpY3zN4$default(Modifier.Companion, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
        if (r68 != null) goto L238;
        float r43 = startPadding;
    L240:
        if (r69 != null) goto L242;
        float r49 = $this$coerceAtLeast_u2dYgX7TsA$iv2;
    L243:
        Modifier textPadding = PaddingKt.m729paddingqDBjuR0$default(r42, r43, 0.0f, r49, 0.0f, 10, null);
        $composer3.startReplaceGroup(250444361);
        ComposerKt.sourceInformation($composer3, "547@27339L63");
        if (r64 == null) goto L247;
        r64.invoke(LayoutIdKt.layoutId(Modifier.Companion, "Hint").then(textPadding), $composer3, Integer.valueOf(($dirty2 >> 3) & 112));
    L247:
        $composer3.endReplaceGroup();
        Modifier modifier$iv5 = LayoutIdKt.layoutId(Modifier.Companion, "TextField").then(textPadding);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv5 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv5 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv5, true);
        int $changed$iv$iv6 = (384 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv5 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv5 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer3, modifier$iv5);
        Function0<ComposeUiNode> r410 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv5 = (($changed$iv$iv6 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L250;
        ComposablesKt.invalidApplier();
    L250:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L253;
        Function0<ComposeUiNode> r34 = r410;
        $composer3.createNode(r34);
    L254:
        Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r35 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv5.getInserting() == true) goto L261;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv5.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv5)) == false) goto L261;
    L262:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv5, ComposeUiNode.Companion.getSetModifier());
        int r36 = ($changed$iv$iv$iv5 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r37 = BoxScopeInstance.INSTANCE;
        int r52 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -365545432, "C554@27591L11:OutlinedTextField.kt#uh7d8r");
        r63.invoke($composer3, Integer.valueOf(($dirty2 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.startReplaceGroup(250455481);
        ComposerKt.sourceInformation($composer3, "558@27667L501");
        if (r65 == null) goto L280;
        r10 = animationProgress;
        Modifier modifier$iv6 = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(SizeKt.m760heightInVpY3zN4$default(Modifier.Companion, DpKt.m7016lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), r10), 0.0f, 2, null), null, false, 3, null), "Label");
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv6 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv6 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv6, false);
        int $changed$iv$iv7 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv6 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv6 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv6 = ComposedModifierKt.materializeModifier($composer3, modifier$iv6);
        Function0<ComposeUiNode> r411 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv6 = (($changed$iv$iv7 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L267;
        ComposablesKt.invalidApplier();
    L267:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L270;
        Function0<ComposeUiNode> r38 = r411;
        $composer3.createNode(r38);
    L271:
        Composer $this$Layout_u24lambda_u240$iv$iv6 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv6, measurePolicy$iv6, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv6, localMap$iv$iv6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r39 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv6.getInserting() == true) goto L278;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv6.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv6)) == false) goto L278;
    L279:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv6, materialized$iv$iv6, ComposeUiNode.Companion.getSetModifier());
        int r40 = ($changed$iv$iv$iv6 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r53 = BoxScopeInstance.INSTANCE;
        int r54 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -364997972, "C570@28143L7:OutlinedTextField.kt#uh7d8r");
        r65.invoke($composer3, Integer.valueOf(($dirty2 >> 9) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L281:
        $composer3.endReplaceGroup();
        $composer3.startReplaceGroup(250473414);
        ComposerKt.sourceInformation($composer3, "575@28238L317");
        if (r74 == null) goto L299;
        Modifier modifier$iv7 = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m760heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m2797supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv7 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv7 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv7, false);
        int $changed$iv$iv8 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv7 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv7 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv7 = ComposedModifierKt.materializeModifier($composer3, modifier$iv7);
        Function0<ComposeUiNode> r123 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv7 = (($changed$iv$iv8 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L286;
        ComposablesKt.invalidApplier();
    L286:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L289;
        Function0<ComposeUiNode> r55 = r123;
        $composer3.createNode(r55);
    L290:
        Composer $this$Layout_u24lambda_u240$iv$iv7 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv7, measurePolicy$iv7, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv7, localMap$iv$iv7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r56 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv7.getInserting() == true) goto L296;
        Composer $composer4 = $composer3;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv7.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv7)) == true) goto L298;
    L297:
        $this$Layout_u24lambda_u240$iv$iv7.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv7));
        $this$Layout_u24lambda_u240$iv$iv7.apply(Integer.valueOf(compositeKeyHash$iv$iv7), r56);
    L298:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv7, materialized$iv$iv7, ComposeUiNode.Companion.getSetModifier());
        int r57 = ($changed$iv$iv$iv7 >> 6) & 14;
        Composer $composer$iv = $composer4;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r124 = BoxScopeInstance.INSTANCE;
        int r125 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -364618873, "C581@28525L12:OutlinedTextField.kt#uh7d8r");
        r1 = r74;
        r1.invoke($composer$iv, Integer.valueOf(($dirty4 >> 6) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
    L300:
        $composer4.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L303;
        ComposerKt.traceEventEnd();
        goto L303
    L296:
        $composer4 = $composer3;
        goto L297
    L289:
        r55 = r123;
        $composer3.useNode();
        goto L290
    L299:
        r1 = r74;
        $composer4 = $composer3;
    L278:
        $this$Layout_u24lambda_u240$iv$iv6.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv6));
        $this$Layout_u24lambda_u240$iv$iv6.apply(Integer.valueOf(compositeKeyHash$iv$iv6), r39);
        goto L279
    L270:
        r38 = r411;
        $composer3.useNode();
        goto L271
    L280:
        r10 = animationProgress;
    L261:
        $this$Layout_u24lambda_u240$iv$iv5.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv5));
        $this$Layout_u24lambda_u240$iv$iv5.apply(Integer.valueOf(compositeKeyHash$iv$iv5), r35);
        goto L262
    L253:
        r34 = r410;
        $composer3.useNode();
        goto L254
    L242:
        r49 = Dp.m6973constructorimpl(0);
        goto L243
    L238:
        r43 = Dp.m6973constructorimpl(0);
        goto L240
    L197:
        $this$coerceAtLeast_u2dYgX7TsA$iv2 = endTextFieldPadding;
        goto L198
    L193:
        $this$coerceAtLeast_u2dYgX7TsA$iv = startTextFieldPadding;
    L152:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r119);
        goto L153
    L144:
        r11 = r24;
        $composer2.useNode();
    L137:
        value$iv = new OutlinedTextFieldMeasurePolicy(r72, singleLine, r10, r115);
        $composer2.updateRememberedValue(value$iv);
        goto L138
    L129:
        r7 = false;
        goto L130
    L125:
        r5 = false;
        goto L126
    L121:
        r3 = false;
        goto L122
    L117:
        r2 = false;
        goto L118
    L100:
        r116 = 1024;
        goto L101
    L102:
        r115 = paddingValues;
        goto L103
    L69:
        if ($composer2.changed(r10) == false) goto L71;
        int r126 = 536870912;
    L72:
        $dirty = $dirty | r126;
        goto L73
    L71:
        r126 = 268435456;
        goto L72
    L5:
        if ($composer2.changed(modifier) == false) goto L7;
        int r127 = 4;
    L8:
        $dirty = $changed | r127;
        goto L11
    L7:
        r127 = 2;
        goto L8
    }

    private static final int substractConstraintSafely(int $this$substractConstraintSafely, int from) {
        if ($this$substractConstraintSafely != Integer.MAX_VALUE) goto L6;
        return $this$substractConstraintSafely;
    L6:
        return $this$substractConstraintSafely - from;
    }

    /* JADX INFO: renamed from: calculateWidth-DHJA7U0, reason: not valid java name */
    private static final int m2479calculateWidthDHJA7U0(int leadingPlaceableWidth, int trailingPlaceableWidth, int prefixPlaceableWidth, int suffixPlaceableWidth, int textFieldPlaceableWidth, int labelPlaceableWidth, int placeholderPlaceableWidth, float animationProgress, long constraints, float density, PaddingValues paddingValues) {
        int affixTotalWidth = prefixPlaceableWidth + suffixPlaceableWidth;
        int middleSection = Math.max(textFieldPlaceableWidth + affixTotalWidth, Math.max(placeholderPlaceableWidth + affixTotalWidth, MathHelpersKt.lerp(labelPlaceableWidth, 0, animationProgress)));
        int wrappedWidth = (leadingPlaceableWidth + middleSection) + trailingPlaceableWidth;
        float arg0$iv = paddingValues.mo675calculateLeftPaddingu2uoSUM(LayoutDirection.Ltr);
        float other$iv = paddingValues.mo676calculateRightPaddingu2uoSUM(LayoutDirection.Ltr);
        float labelHorizontalPadding = Dp.m6973constructorimpl(arg0$iv + other$iv) * density;
        int focusedLabelWidth = MathKt.roundToInt((labelPlaceableWidth + labelHorizontalPadding) * animationProgress);
        return Math.max(wrappedWidth, Math.max(focusedLabelWidth, Constraints.m6928getMinWidthimpl(constraints)));
    }

    /* JADX INFO: renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    private static final int m2478calculateHeightmKXJcVc(int leadingHeight, int trailingHeight, int prefixHeight, int suffixHeight, int textFieldHeight, int labelHeight, int placeholderHeight, int supportingHeight, float animationProgress, long constraints, float density, PaddingValues paddingValues) {
        int inputFieldHeight = ComparisonsKt.maxOf(textFieldHeight, new int[]{placeholderHeight, prefixHeight, suffixHeight, MathHelpersKt.lerp(labelHeight, 0, animationProgress)});
        float topPadding = paddingValues.mo677calculateTopPaddingD9Ej5fM() * density;
        float actualTopPadding = MathHelpersKt.lerp(topPadding, Math.max(topPadding, labelHeight / 2.0f), animationProgress);
        float bottomPadding = paddingValues.mo674calculateBottomPaddingD9Ej5fM() * density;
        float middleSectionHeight = (inputFieldHeight + actualTopPadding) + bottomPadding;
        return Math.max(Constraints.m6927getMinHeightimpl(constraints), Math.max(leadingHeight, Math.max(trailingHeight, MathKt.roundToInt(middleSectionHeight))) + supportingHeight);
    }

    private static final void place(Placeable.PlacementScope $this$place, int totalHeight, int width, Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable prefixPlaceable, Placeable suffixPlaceable, Placeable textFieldPlaceable, Placeable labelPlaceable, Placeable placeholderPlaceable, Placeable containerPlaceable, Placeable supportingPlaceable, float animationProgress, boolean singleLine, float density, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        Placeable.PlacementScope.m5778place70tqf50$default($this$place, containerPlaceable, IntOffset.Companion.m7112getZeronOccac(), 0.0f, 2, null);
        int height = totalHeight - TextFieldImplKt.heightOrZero(supportingPlaceable);
        int topPadding = MathKt.roundToInt(paddingValues.mo677calculateTopPaddingD9Ej5fM() * density);
        int startPadding = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * density);
        float iconPadding = TextFieldImplKt.getHorizontalIconPadding() * density;
        if (leadingPlaceable == null) goto L5;
        Placeable.PlacementScope.placeRelative$default($this$place, leadingPlaceable, 0, Alignment.Companion.getCenterVertically().align(leadingPlaceable.getHeight(), height), 0.0f, 4, null);
    L5:
        if (labelPlaceable != null) goto L7;
    L15:
        if (prefixPlaceable == null) goto L17;
        Placeable.PlacementScope.placeRelative$default($this$place, prefixPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), place$calculateVerticalPosition(singleLine, height, topPadding, labelPlaceable, prefixPlaceable), 0.0f, 4, null);
    L17:
        int textHorizontalPosition = TextFieldImplKt.widthOrZero(leadingPlaceable) + TextFieldImplKt.widthOrZero(prefixPlaceable);
        Placeable.PlacementScope.placeRelative$default($this$place, textFieldPlaceable, textHorizontalPosition, place$calculateVerticalPosition(singleLine, height, topPadding, labelPlaceable, textFieldPlaceable), 0.0f, 4, null);
        if (placeholderPlaceable == null) goto L21;
        Placeable.PlacementScope.placeRelative$default($this$place, placeholderPlaceable, textHorizontalPosition, place$calculateVerticalPosition(singleLine, height, topPadding, labelPlaceable, placeholderPlaceable), 0.0f, 4, null);
    L21:
        if (suffixPlaceable == null) goto L23;
        Placeable.PlacementScope.placeRelative$default($this$place, suffixPlaceable, (width - TextFieldImplKt.widthOrZero(trailingPlaceable)) - suffixPlaceable.getWidth(), place$calculateVerticalPosition(singleLine, height, topPadding, labelPlaceable, suffixPlaceable), 0.0f, 4, null);
    L23:
        if (trailingPlaceable == null) goto L25;
        Placeable.PlacementScope.placeRelative$default($this$place, trailingPlaceable, width - trailingPlaceable.getWidth(), Alignment.Companion.getCenterVertically().align(trailingPlaceable.getHeight(), height), 0.0f, 4, null);
    L25:
        if (supportingPlaceable == null) goto L28;
        Placeable.PlacementScope.placeRelative$default($this$place, supportingPlaceable, 0, height, 0.0f, 4, null);
        return;
    L28:
        return;
    L7:
        if (singleLine == false) goto L9;
        int startPositionY = Alignment.Companion.getCenterVertically().align(labelPlaceable.getHeight(), height);
    L10:
        int positionY = MathHelpersKt.lerp(startPositionY, -(labelPlaceable.getHeight() / 2), animationProgress);
        if (leadingPlaceable != null) goto L13;
        float r3 = 0.0f;
    L14:
        int positionX = MathKt.roundToInt(r3) + startPadding;
        Placeable.PlacementScope.placeRelative$default($this$place, labelPlaceable, positionX, positionY, 0.0f, 4, null);
        goto L15
    L13:
        r3 = (TextFieldImplKt.widthOrZero(leadingPlaceable) - iconPadding) * (1.0f - animationProgress);
        goto L14
    L9:
        startPositionY = topPadding;
        goto L10
    }

    private static final int place$calculateVerticalPosition(boolean $singleLine, int height, int topPadding, Placeable $labelPlaceable, Placeable placeable) {
        if ($singleLine == false) goto L4;
        int r0 = Alignment.Companion.getCenterVertically().align(placeable.getHeight(), height);
    L6:
        return Math.max(r0, TextFieldImplKt.heightOrZero($labelPlaceable) / 2);
    L4:
        r0 = topPadding;
        goto L6
    }

    public static final Modifier outlineCutout(Modifier $this$outlineCutout, final Function0<Size> r2, final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent($this$outlineCutout, new C05471(r2, paddingValues));
    }

    static {
        OutlinedTextFieldInnerPadding = Dp.m6973constructorimpl(4);
        long arg0$iv = TypeScaleTokens.INSTANCE.m3703getBodySmallLineHeightXSAIIZE();
        TextUnitKt.m7180checkArithmeticR2X_6o(arg0$iv);
        OutlinedTextFieldTopPadding = TextUnitKt.pack(TextUnit.m7165getRawTypeimpl(arg0$iv), TextUnit.m7167getValueimpl(arg0$iv) / 2);
    }

    public static final long getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }
}
