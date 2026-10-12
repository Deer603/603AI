package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
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

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aØ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001aØ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020-2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001aì\u0001\u0010/\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0019\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0002\b\u00142\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u0010\"\u001a\u00020\u000e2\u0006\u00103\u001a\u0002042\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u00107\u001a\u000208H\u0001¢\u0006\u0002\u00109\u001ar\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020$2\u0006\u00103\u001a\u0002042\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u0002042\u0006\u00107\u001a\u000208H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001aR\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020$2\u0006\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020$2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\u001a\u0010R\u001a\u00020\f*\u00020\f2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020U0TH\u0000\u001a\u009a\u0001\u0010V\u001a\u00020\u0006*\u00020W2\u0006\u0010X\u001a\u00020$2\u0006\u0010Y\u001a\u00020$2\u0006\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010[2\b\u0010]\u001a\u0004\u0018\u00010[2\b\u0010^\u001a\u0004\u0018\u00010[2\b\u0010_\u001a\u0004\u0018\u00010[2\b\u0010`\u001a\u0004\u0018\u00010[2\b\u0010a\u001a\u0004\u0018\u00010[2\u0006\u0010b\u001a\u00020[2\b\u0010c\u001a\u0004\u0018\u00010[2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020$2\u0006\u0010e\u001a\u00020$2\u0006\u00103\u001a\u0002042\u0006\u0010E\u001a\u000204H\u0002\u001a\u0080\u0001\u0010f\u001a\u00020\u0006*\u00020W2\u0006\u0010X\u001a\u00020$2\u0006\u0010Y\u001a\u00020$2\u0006\u0010g\u001a\u00020[2\b\u0010]\u001a\u0004\u0018\u00010[2\b\u0010^\u001a\u0004\u0018\u00010[2\b\u0010_\u001a\u0004\u0018\u00010[2\b\u0010`\u001a\u0004\u0018\u00010[2\b\u0010a\u001a\u0004\u0018\u00010[2\u0006\u0010b\u001a\u00020[2\b\u0010c\u001a\u0004\u0018\u00010[2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010E\u001a\u0002042\u0006\u00107\u001a\u000208H\u0002\u001a\u0014\u0010h\u001a\u00020$*\u00020$2\u0006\u0010i\u001a\u00020$H\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006j"}, d2 = {"TextFieldWithLabelVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "getTextFieldWithLabelVerticalPadding", "()F", "F", "TextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "container", "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-yeHjK3Y", "(IIIIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "totalHeight", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "substractConstraintSafely", "from", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldKt {
    private static final float TextFieldWithLabelVerticalPadding = 0.0f;

    /* JADX INFO: renamed from: access$calculateHeight-mKXJcVc, reason: not valid java name */
    public static final /* synthetic */ int m2815access$calculateHeightmKXJcVc(int textFieldHeight, int labelHeight, int leadingHeight, int trailingHeight, int prefixHeight, int suffixHeight, int placeholderHeight, int supportingHeight, float animationProgress, long constraints, float density, PaddingValues paddingValues) {
        return m2817calculateHeightmKXJcVc(textFieldHeight, labelHeight, leadingHeight, trailingHeight, prefixHeight, suffixHeight, placeholderHeight, supportingHeight, animationProgress, constraints, density, paddingValues);
    }

    /* JADX INFO: renamed from: access$calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final /* synthetic */ int m2816access$calculateWidthyeHjK3Y(int leadingWidth, int trailingWidth, int prefixWidth, int suffixWidth, int textFieldWidth, int labelWidth, int placeholderWidth, long constraints) {
        return m2818calculateWidthyeHjK3Y(leadingWidth, trailingWidth, prefixWidth, suffixWidth, textFieldWidth, labelWidth, placeholderWidth, constraints);
    }

    public static final /* synthetic */ void access$placeWithLabel(Placeable.PlacementScope $receiver, int width, int totalHeight, Placeable textfieldPlaceable, Placeable labelPlaceable, Placeable placeholderPlaceable, Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable prefixPlaceable, Placeable suffixPlaceable, Placeable containerPlaceable, Placeable supportingPlaceable, boolean singleLine, int labelEndPosition, int textPosition, float animationProgress, float density) {
        placeWithLabel($receiver, width, totalHeight, textfieldPlaceable, labelPlaceable, placeholderPlaceable, leadingPlaceable, trailingPlaceable, prefixPlaceable, suffixPlaceable, containerPlaceable, supportingPlaceable, singleLine, labelEndPosition, textPosition, animationProgress, density);
    }

    public static final /* synthetic */ void access$placeWithoutLabel(Placeable.PlacementScope $receiver, int width, int totalHeight, Placeable textPlaceable, Placeable placeholderPlaceable, Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable prefixPlaceable, Placeable suffixPlaceable, Placeable containerPlaceable, Placeable supportingPlaceable, boolean singleLine, float density, PaddingValues paddingValues) {
        placeWithoutLabel($receiver, width, totalHeight, textPlaceable, placeholderPlaceable, leadingPlaceable, trailingPlaceable, prefixPlaceable, suffixPlaceable, containerPlaceable, supportingPlaceable, singleLine, density, paddingValues);
    }

    public static final /* synthetic */ int access$substractConstraintSafely(int $receiver, int from) {
        return substractConstraintSafely($receiver, from);
    }

    public static final void TextField(final String value, final Function1<? super String, Unit> r69, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> r74, Function2<? super Composer, ? super Integer, Unit> r75, Function2<? super Composer, ? super Integer, Unit> r76, Function2<? super Composer, ? super Integer, Unit> r77, Function2<? super Composer, ? super Integer, Unit> r78, Function2<? super Composer, ? super Integer, Unit> r79, Function2<? super Composer, ? super Integer, Unit> r80, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int $changed2, final int r95) {
        Composer $composer2 = $composer.startRestartGroup(-676242365);
        ComposerKt.sourceInformation($composer2, "C(TextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)201@10573L7,217@11369L5,218@11424L8,230@12004L1956,230@11917L2043:TextField.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        int $dirty2 = $changed2;
        if ((r95 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        final String r15 = value;
    L14:
        if ((r95 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function1<? super String, Unit> r8 = r69;
    L24:
        int r13 = r95 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r17 = r95 & 8;
        int r18 = 2048;
        if (r17 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r21 = r95 & 16;
        int r22 = 16384;
        if (r21 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean readOnly2 = readOnly;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L60;
        TextStyle textStyle2 = textStyle;
    L68:
        int r28 = r95 & 64;
        if (r28 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r14 = r74;
    L79:
        int r0 = r95 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r1 = r95 & 256;
        if (r1 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r2 = r95 & 512;
        if (r2 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r3 = r95 & 1024;
        if (r3 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r4 = r95 & 2048;
        if (r4 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r5 = r95 & 4096;
        if (r5 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r39 = r5;
    L145:
        int r6 = r95 & 8192;
        if (r6 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r40 = r6;
    L156:
        int r7 = r95 & 16384;
        if (r7 == 0) goto L159;
        $dirty1 = $dirty1 | 24576;
        int r19 = r7;
    L167:
        int r110 = r95 & 32768;
        if (r110 == 0) goto L171;
        $dirty1 = $dirty1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L178:
        int r23 = r95 & 65536;
        if (r23 == 0) goto L182;
        $dirty1 = $dirty1 | 1572864;
    L189:
        int r24 = r95 & 131072;
        if (r24 == 0) goto L193;
        $dirty1 = $dirty1 | 12582912;
    L201:
        if (($changed1 & 100663296) != 0) goto L211;
        if ((r95 & 262144) != 0) goto L208;
        if ($composer2.changed(maxLines) == false) goto L208;
        int r25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L209:
        $dirty1 = $dirty1 | r25;
    L208:
        r25 = 33554432;
    L211:
        int r26 = r95 & 524288;
        if (r26 == 0) goto L215;
        $dirty1 = $dirty1 | 805306368;
    L222:
        int r27 = r95 & 1048576;
        if (r27 == 0) goto L226;
        $dirty2 = $dirty2 | 6;
    L234:
        if (($changed2 & 48) != 0) goto L245;
        if ((r95 & 2097152) != 0) goto L241;
        if ($composer2.changed(shape) == false) goto L241;
        int r29 = 32;
    L242:
        $dirty2 = $dirty2 | r29;
    L241:
        r29 = 16;
    L245:
        if (($changed2 & 384) != 0) goto L256;
        if ((r95 & 4194304) != 0) goto L252;
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
        if (r13 == 0) goto L285;
        modifier2 = Modifier.Companion;
    L285:
        if (r17 == 0) goto L287;
        enabled2 = true;
    L287:
        if (r21 == 0) goto L290;
        readOnly2 = false;
    L290:
        if ((r95 & 32) == 0) goto L292;
        ProvidableCompositionLocal<TextStyle> r9 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty = $dirty & (-458753);
        textStyle2 = (TextStyle) r10;
    L292:
        if (r28 == 0) goto L294;
        r14 = null;
    L294:
        if (r0 == 0) goto L296;
        Function2<? super Composer, ? super Integer, Unit> r11 = null;
    L297:
        if (r1 == 0) goto L299;
        Function2<? super Composer, ? super Integer, Unit> r12 = null;
    L300:
        if (r2 == 0) goto L302;
        Function2<? super Composer, ? super Integer, Unit> r16 = null;
    L303:
        if (r3 == 0) goto L305;
        Function2<? super Composer, ? super Integer, Unit> r111 = null;
    L306:
        if (r4 == 0) goto L308;
        Function2<? super Composer, ? super Integer, Unit> r112 = null;
    L309:
        if (r39 == 0) goto L311;
        Function2<? super Composer, ? super Integer, Unit> r113 = null;
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
        final KeyboardActions keyboardActions2 = KeyboardActions.Companion.getDefault();
    L324:
        if (r24 == 0) goto L326;
        final boolean singleLine2 = false;
    L328:
        if ((r95 & 262144) == 0) goto L333;
        if (singleLine2 == false) goto L331;
        final int maxLines2 = 1;
    L332:
        $dirty1 = $dirty1 & (-234881025);
    L334:
        if (r26 == 0) goto L336;
        final int minLines2 = 1;
    L337:
        if (r27 == 0) goto L339;
        MutableInteractionSource interactionSource2 = null;
    L340:
        Function2<? super Composer, ? super Integer, Unit> r70 = r11;
        if ((r95 & 2097152) == 0) goto L343;
        Shape shape2 = TextFieldDefaults.INSTANCE.getShape($composer2, 6);
        $dirty2 = $dirty2 & (-113);
    L345:
        if ((r95 & 4194304) == 0) goto L347;
        final Function2<? super Composer, ? super Integer, Unit> r210 = r70;
        final Function2<? super Composer, ? super Integer, Unit> r211 = r12;
        final Shape shape3 = shape2;
        $dirty2 = $dirty2 & (-897);
        final Function2<? super Composer, ? super Integer, Unit> r31 = r16;
        final Function2<? super Composer, ? super Integer, Unit> r32 = r111;
        final Function2<? super Composer, ? super Integer, Unit> r212 = r14;
        final Function2<? super Composer, ? super Integer, Unit> r33 = r112;
        final Function2<? super Composer, ? super Integer, Unit> r34 = r113;
        final boolean isError3 = isError2;
        MutableInteractionSource interactionSource3 = interactionSource2;
        final TextFieldColors colors2 = TextFieldDefaults.INSTANCE.colors($composer2, 6);
        TextStyle textStyle3 = textStyle2;
        final VisualTransformation visualTransformation3 = visualTransformation2;
        final KeyboardOptions keyboardOptions3 = keyboardOptions2;
        final Modifier modifier3 = modifier2;
        final boolean readOnly3 = readOnly2;
    L348:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L351;
        ComposerKt.traceEventStart(-676242365, $dirty, $dirty1, "androidx.compose.material3.TextField (TextField.kt:219)");
    L351:
        $composer2.startReplaceGroup(-508515290);
        ComposerKt.sourceInformation($composer2, "221@11518L39");
        if (interactionSource3 != null) goto L358;
        ComposerKt.sourceInformationMarkerStart($composer2, -508514639, "CC(remember):TextField.kt#9igjgp");
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
        $composer2.startReplaceGroup(-508509180);
        ComposerKt.sourceInformation($composer2, "*225@11742L25");
        long $this$takeOrElse_u2dDxMtmZc$iv = textStyle3.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L362;
        boolean r114 = true;
    L363:
        if (r114 == true) goto L366;
        boolean focused = FocusInteractionKt.collectIsFocusedAsState(interactionSource5, $composer2, 0).getValue().booleanValue();
        $this$takeOrElse_u2dDxMtmZc$iv = colors2.m2789textColorXeAY9LY$material3_release(enabled2, isError3, focused);
    L366:
        $composer2.endReplaceGroup();
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        final TextStyle mergedTextStyle = textStyle3.merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        final Function1<? super String, Unit> r115 = r8;
        final boolean enabled3 = enabled2;
        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(colors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1859145987, true, new AnonymousClass1(modifier3, isError3, colors2, r15, r115, enabled3, readOnly3, mergedTextStyle, keyboardOptions3, keyboardActions2, singleLine2, maxLines2, minLines2, visualTransformation3, interactionSource5, r212, r210, r211, r31, r32, r33, r34, shape3), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L369;
        ComposerKt.traceEventEnd();
    L369:
        modifier2 = modifier3;
        final KeyboardOptions keyboardOptions4 = keyboardOptions3;
        final int maxLines3 = maxLines2;
        final int minLines3 = minLines2;
        final VisualTransformation visualTransformation4 = visualTransformation3;
        final Function2<? super Composer, ? super Integer, Unit> r20 = r210;
        final Function2<? super Composer, ? super Integer, Unit> r116 = r31;
        final Function2<? super Composer, ? super Integer, Unit> r117 = r32;
        final Function2<? super Composer, ? super Integer, Unit> r118 = r33;
        final TextFieldColors colors3 = colors2;
        final boolean readOnly4 = readOnly3;
        final boolean readOnly5 = singleLine2;
        final Function2<? super Composer, ? super Integer, Unit> r35 = r212;
        final Shape shape4 = shape3;
        final TextStyle textStyle4 = textStyle3;
        final boolean isError4 = isError3;
        final boolean enabled4 = enabled3;
        final KeyboardActions keyboardActions3 = keyboardActions2;
        final Function2<? super Composer, ? super Integer, Unit> r119 = r34;
        final MutableInteractionSource interactionSource6 = interactionSource4;
    L370:
        ScopeUpdateScope r36 = $composer2.endRestartGroup();
        if (r36 == null) goto L374;
        final Modifier modifier4 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> r37 = r211;
        r36.updateScope(new AnonymousClass2(value, r69, modifier4, enabled4, readOnly4, textStyle4, r35, r20, r37, r116, r117, r118, r119, isError4, visualTransformation4, keyboardOptions4, keyboardActions3, readOnly5, maxLines3, minLines3, interactionSource6, shape4, colors3, $changed, $changed1, $changed2, r95));
        return;
    L374:
        return;
    L362:
        r114 = false;
        goto L363
    L356:
        value$iv = it$iv;
        goto L357
    L358:
        interactionSource4 = interactionSource3;
        interactionSource5 = interactionSource4;
        goto L359
    L347:
        r210 = r70;
        r211 = r12;
        shape3 = shape2;
        r31 = r16;
        textStyle3 = textStyle2;
        r32 = r111;
        r212 = r14;
        r33 = r112;
        r34 = r113;
        isError3 = isError2;
        interactionSource3 = interactionSource2;
        colors2 = colors;
        modifier3 = modifier2;
        visualTransformation3 = visualTransformation2;
        keyboardOptions3 = keyboardOptions2;
        readOnly3 = readOnly2;
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
        r113 = r80;
        goto L312
    L308:
        r112 = r79;
        goto L309
    L305:
        r111 = r78;
        goto L306
    L302:
        r16 = r77;
        goto L303
    L299:
        r12 = r76;
        goto L300
    L296:
        r11 = r75;
        goto L297
    L268:
        if ($composer2.getDefaultsInvalid() == true) goto L283;
        $composer2.skipToGroupEnd();
        if ((r95 & 32) == 0) goto L274;
        $dirty = $dirty & (-458753);
    L274:
        if ((262144 & r95) == 0) goto L277;
        $dirty1 = $dirty1 & (-234881025);
    L277:
        if ((2097152 & r95) == 0) goto L280;
        $dirty2 = $dirty2 & (-113);
    L280:
        if ((r95 & 4194304) == 0) goto L282;
        r210 = r75;
        r211 = r76;
        r31 = r77;
        r32 = r78;
        r33 = r79;
        r34 = r80;
        isError3 = isError;
        visualTransformation3 = visualTransformation;
        keyboardOptions3 = keyboardOptions;
        keyboardActions2 = keyboardActions;
        singleLine2 = singleLine;
        maxLines2 = maxLines;
        minLines2 = minLines;
        interactionSource3 = interactionSource;
        shape3 = shape;
        $dirty2 = $dirty2 & (-897);
        readOnly3 = readOnly2;
        textStyle3 = textStyle2;
        r212 = r14;
        colors2 = colors;
        modifier3 = modifier2;
        goto L348
    L282:
        r210 = r75;
        r211 = r76;
        r31 = r77;
        r32 = r78;
        r33 = r79;
        r34 = r80;
        isError3 = isError;
        visualTransformation3 = visualTransformation;
        keyboardOptions3 = keyboardOptions;
        keyboardActions2 = keyboardActions;
        singleLine2 = singleLine;
        maxLines2 = maxLines;
        minLines2 = minLines;
        interactionSource3 = interactionSource;
        shape3 = shape;
        readOnly3 = readOnly2;
        textStyle3 = textStyle2;
        r212 = r14;
        colors2 = colors;
        modifier3 = modifier2;
        goto L348
    L258:
        if ((306783379 & $dirty1) != 306783378) goto L265;
        if (($dirty2 & 147) != 146) goto L265;
        if ($composer2.getSkipping() == false) goto L265;
        $composer2.skipToGroupEnd();
        r20 = r75;
        r211 = r76;
        r119 = r80;
        visualTransformation4 = visualTransformation;
        keyboardOptions4 = keyboardOptions;
        keyboardActions3 = keyboardActions;
        readOnly5 = singleLine;
        maxLines3 = maxLines;
        minLines3 = minLines;
        interactionSource6 = interactionSource;
        shape4 = shape;
        colors3 = colors;
        enabled4 = enabled2;
        readOnly4 = readOnly2;
        textStyle4 = textStyle2;
        r35 = r14;
        r116 = r77;
        r117 = r78;
        r118 = r79;
        isError4 = isError;
        goto L370
    L226:
        if (($changed2 & 6) != 0) goto L234;
        if ($composer2.changed(interactionSource) == false) goto L230;
        int r213 = 4;
    L231:
        $dirty2 = $dirty2 | r213;
        goto L234
    L230:
        r213 = 2;
        goto L231
    L215:
        if (($changed1 & 805306368) != 0) goto L222;
        if ($composer2.changed(minLines) == false) goto L219;
        int r214 = 536870912;
    L220:
        $dirty1 = $dirty1 | r214;
        goto L222
    L219:
        r214 = 268435456;
        goto L220
    L193:
        if (($changed1 & 12582912) != 0) goto L201;
        if ($composer2.changed(singleLine) == false) goto L197;
        int r215 = 8388608;
    L198:
        $dirty1 = $dirty1 | r215;
        goto L201
    L197:
        r215 = 4194304;
        goto L198
    L182:
        if (($changed1 & 1572864) != 0) goto L189;
        if ($composer2.changed(keyboardActions) == false) goto L186;
        int r216 = 1048576;
    L187:
        $dirty1 = $dirty1 | r216;
        goto L189
    L186:
        r216 = 524288;
        goto L187
    L171:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L178;
        if ($composer2.changed(keyboardOptions) == false) goto L175;
        int r217 = 131072;
    L176:
        $dirty1 = $dirty1 | r217;
        goto L178
    L175:
        r217 = 65536;
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
        if ($composer2.changedInstance(r80) == false) goto L142;
        int r41 = 256;
    L143:
        $dirty1 = $dirty1 | r41;
        goto L145
    L142:
        r41 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changedInstance(r79) == false) goto L131;
        int r310 = 32;
    L132:
        $dirty1 = $dirty1 | r310;
        goto L134
    L131:
        r310 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changedInstance(r78) == false) goto L120;
        int r38 = 4;
    L121:
        $dirty1 = $dirty1 | r38;
        goto L123
    L120:
        r38 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r77) == false) goto L109;
        int r311 = 536870912;
    L110:
        $dirty = $dirty | r311;
        goto L112
    L109:
        r311 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r76) == false) goto L98;
        int r312 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r312;
        goto L101
    L98:
        r312 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r75) == false) goto L87;
        int r313 = 8388608;
    L88:
        $dirty = $dirty | r313;
        goto L90
    L87:
        r313 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r14 = r74;
        if ($composer2.changedInstance(r14) == false) goto L76;
        int r314 = 1048576;
    L77:
        $dirty = $dirty | r314;
        goto L79
    L76:
        r314 = 524288;
        goto L77
    L78:
        r14 = r74;
        goto L79
    L60:
        if ((r95 & 32) != 0) goto L64;
        textStyle2 = textStyle;
        if ($composer2.changed(textStyle2) == false) goto L65;
        int r218 = 131072;
    L66:
        $dirty = $dirty | r218;
    L65:
        r218 = 65536;
        goto L66
    L64:
        textStyle2 = textStyle;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        readOnly2 = readOnly;
        if ($composer2.changed(readOnly2) == false) goto L54;
        int r219 = 16384;
    L55:
        $dirty = $dirty | r219;
        goto L58
    L54:
        r219 = 8192;
        goto L55
    L56:
        readOnly2 = readOnly;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r220 = 2048;
    L44:
        $dirty = $dirty | r220;
        goto L46
    L43:
        r220 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r120 = 256;
    L33:
        $dirty = $dirty | r120;
        goto L35
    L32:
        r120 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r8 = r69;
        if ($composer2.changedInstance(r8) == false) goto L21;
        int r121 = 32;
    L22:
        $dirty = $dirty | r121;
        goto L24
    L21:
        r121 = 16;
        goto L22
    L23:
        r8 = r69;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r15 = value;
        if ($composer2.changed(r15) == false) goto L10;
        int r42 = 4;
    L11:
        $dirty = $dirty | r42;
        goto L14
    L10:
        r42 = 2;
        goto L11
    L12:
        r15 = value;
        goto L14
    }

    public static final void TextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> r69, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> r74, Function2<? super Composer, ? super Integer, Unit> r75, Function2<? super Composer, ? super Integer, Unit> r76, Function2<? super Composer, ? super Integer, Unit> r77, Function2<? super Composer, ? super Integer, Unit> r78, Function2<? super Composer, ? super Integer, Unit> r79, Function2<? super Composer, ? super Integer, Unit> r80, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int $changed2, final int r95) {
        Composer $composer2 = $composer.startRestartGroup(-1268528240);
        ComposerKt.sourceInformation($composer2, "C(TextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)357@19138L7,373@19934L5,374@19989L8,386@20569L1961,386@20482L2048:TextField.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        int $dirty2 = $changed2;
        if ((r95 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        final TextFieldValue r15 = value;
    L14:
        if ((r95 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function1<? super TextFieldValue, Unit> r8 = r69;
    L24:
        int r13 = r95 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r17 = r95 & 8;
        int r18 = 2048;
        if (r17 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r21 = r95 & 16;
        int r22 = 16384;
        if (r21 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean readOnly2 = readOnly;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L60;
        TextStyle textStyle2 = textStyle;
    L68:
        int r28 = r95 & 64;
        if (r28 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r14 = r74;
    L79:
        int r0 = r95 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r1 = r95 & 256;
        if (r1 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r2 = r95 & 512;
        if (r2 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r3 = r95 & 1024;
        if (r3 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r4 = r95 & 2048;
        if (r4 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r5 = r95 & 4096;
        if (r5 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r39 = r5;
    L145:
        int r6 = r95 & 8192;
        if (r6 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r40 = r6;
    L156:
        int r7 = r95 & 16384;
        if (r7 == 0) goto L159;
        $dirty1 = $dirty1 | 24576;
        int r19 = r7;
    L167:
        int r110 = r95 & 32768;
        if (r110 == 0) goto L171;
        $dirty1 = $dirty1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L178:
        int r23 = r95 & 65536;
        if (r23 == 0) goto L182;
        $dirty1 = $dirty1 | 1572864;
    L189:
        int r24 = r95 & 131072;
        if (r24 == 0) goto L193;
        $dirty1 = $dirty1 | 12582912;
    L201:
        if (($changed1 & 100663296) != 0) goto L211;
        if ((r95 & 262144) != 0) goto L208;
        if ($composer2.changed(maxLines) == false) goto L208;
        int r25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L209:
        $dirty1 = $dirty1 | r25;
    L208:
        r25 = 33554432;
    L211:
        int r26 = r95 & 524288;
        if (r26 == 0) goto L215;
        $dirty1 = $dirty1 | 805306368;
    L222:
        int r27 = r95 & 1048576;
        if (r27 == 0) goto L226;
        $dirty2 = $dirty2 | 6;
    L234:
        if (($changed2 & 48) != 0) goto L245;
        if ((r95 & 2097152) != 0) goto L241;
        if ($composer2.changed(shape) == false) goto L241;
        int r29 = 32;
    L242:
        $dirty2 = $dirty2 | r29;
    L241:
        r29 = 16;
    L245:
        if (($changed2 & 384) != 0) goto L256;
        if ((r95 & 4194304) != 0) goto L252;
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
        if (r13 == 0) goto L285;
        modifier2 = Modifier.Companion;
    L285:
        if (r17 == 0) goto L287;
        enabled2 = true;
    L287:
        if (r21 == 0) goto L290;
        readOnly2 = false;
    L290:
        if ((r95 & 32) == 0) goto L292;
        ProvidableCompositionLocal<TextStyle> r9 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty = $dirty & (-458753);
        textStyle2 = (TextStyle) r10;
    L292:
        if (r28 == 0) goto L294;
        r14 = null;
    L294:
        if (r0 == 0) goto L296;
        Function2<? super Composer, ? super Integer, Unit> r11 = null;
    L297:
        if (r1 == 0) goto L299;
        Function2<? super Composer, ? super Integer, Unit> r12 = null;
    L300:
        if (r2 == 0) goto L302;
        Function2<? super Composer, ? super Integer, Unit> r16 = null;
    L303:
        if (r3 == 0) goto L305;
        Function2<? super Composer, ? super Integer, Unit> r111 = null;
    L306:
        if (r4 == 0) goto L308;
        Function2<? super Composer, ? super Integer, Unit> r112 = null;
    L309:
        if (r39 == 0) goto L311;
        Function2<? super Composer, ? super Integer, Unit> r113 = null;
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
        final KeyboardActions keyboardActions2 = KeyboardActions.Companion.getDefault();
    L324:
        if (r24 == 0) goto L326;
        final boolean singleLine2 = false;
    L328:
        if ((r95 & 262144) == 0) goto L333;
        if (singleLine2 == false) goto L331;
        final int maxLines2 = 1;
    L332:
        $dirty1 = $dirty1 & (-234881025);
    L334:
        if (r26 == 0) goto L336;
        final int minLines2 = 1;
    L337:
        if (r27 == 0) goto L339;
        MutableInteractionSource interactionSource2 = null;
    L340:
        Function2<? super Composer, ? super Integer, Unit> r70 = r11;
        if ((r95 & 2097152) == 0) goto L343;
        Shape shape2 = TextFieldDefaults.INSTANCE.getShape($composer2, 6);
        $dirty2 = $dirty2 & (-113);
    L345:
        if ((r95 & 4194304) == 0) goto L347;
        final Function2<? super Composer, ? super Integer, Unit> r210 = r70;
        final Function2<? super Composer, ? super Integer, Unit> r211 = r12;
        final Shape shape3 = shape2;
        $dirty2 = $dirty2 & (-897);
        final Function2<? super Composer, ? super Integer, Unit> r31 = r16;
        final Function2<? super Composer, ? super Integer, Unit> r32 = r111;
        final Function2<? super Composer, ? super Integer, Unit> r212 = r14;
        final Function2<? super Composer, ? super Integer, Unit> r33 = r112;
        final Function2<? super Composer, ? super Integer, Unit> r34 = r113;
        final boolean isError3 = isError2;
        MutableInteractionSource interactionSource3 = interactionSource2;
        final TextFieldColors colors2 = TextFieldDefaults.INSTANCE.colors($composer2, 6);
        TextStyle textStyle3 = textStyle2;
        final VisualTransformation visualTransformation3 = visualTransformation2;
        final KeyboardOptions keyboardOptions3 = keyboardOptions2;
        final Modifier modifier3 = modifier2;
        final boolean readOnly3 = readOnly2;
    L348:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L351;
        ComposerKt.traceEventStart(-1268528240, $dirty, $dirty1, "androidx.compose.material3.TextField (TextField.kt:375)");
    L351:
        $composer2.startReplaceGroup(-508241210);
        ComposerKt.sourceInformation($composer2, "377@20083L39");
        if (interactionSource3 != null) goto L358;
        ComposerKt.sourceInformationMarkerStart($composer2, -508240559, "CC(remember):TextField.kt#9igjgp");
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
        $composer2.startReplaceGroup(-508235100);
        ComposerKt.sourceInformation($composer2, "*381@20307L25");
        long $this$takeOrElse_u2dDxMtmZc$iv = textStyle3.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L362;
        boolean r114 = true;
    L363:
        if (r114 == true) goto L366;
        boolean focused = FocusInteractionKt.collectIsFocusedAsState(interactionSource5, $composer2, 0).getValue().booleanValue();
        $this$takeOrElse_u2dDxMtmZc$iv = colors2.m2789textColorXeAY9LY$material3_release(enabled2, isError3, focused);
    L366:
        $composer2.endReplaceGroup();
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        final TextStyle mergedTextStyle = textStyle3.merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        final Function1<? super TextFieldValue, Unit> r115 = r8;
        final boolean enabled3 = enabled2;
        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(colors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-1163788208, true, new AnonymousClass3(modifier3, isError3, colors2, r15, r115, enabled3, readOnly3, mergedTextStyle, keyboardOptions3, keyboardActions2, singleLine2, maxLines2, minLines2, visualTransformation3, interactionSource5, r212, r210, r211, r31, r32, r33, r34, shape3), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L369;
        ComposerKt.traceEventEnd();
    L369:
        modifier2 = modifier3;
        final KeyboardOptions keyboardOptions4 = keyboardOptions3;
        final int maxLines3 = maxLines2;
        final int minLines3 = minLines2;
        final VisualTransformation visualTransformation4 = visualTransformation3;
        final Function2<? super Composer, ? super Integer, Unit> r20 = r210;
        final Function2<? super Composer, ? super Integer, Unit> r116 = r31;
        final Function2<? super Composer, ? super Integer, Unit> r117 = r32;
        final Function2<? super Composer, ? super Integer, Unit> r118 = r33;
        final TextFieldColors colors3 = colors2;
        final boolean readOnly4 = readOnly3;
        final boolean readOnly5 = singleLine2;
        final Function2<? super Composer, ? super Integer, Unit> r35 = r212;
        final Shape shape4 = shape3;
        final TextStyle textStyle4 = textStyle3;
        final boolean isError4 = isError3;
        final boolean enabled4 = enabled3;
        final KeyboardActions keyboardActions3 = keyboardActions2;
        final Function2<? super Composer, ? super Integer, Unit> r119 = r34;
        final MutableInteractionSource interactionSource6 = interactionSource4;
    L370:
        ScopeUpdateScope r36 = $composer2.endRestartGroup();
        if (r36 == null) goto L374;
        final Modifier modifier4 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> r37 = r211;
        r36.updateScope(new AnonymousClass4(value, r69, modifier4, enabled4, readOnly4, textStyle4, r35, r20, r37, r116, r117, r118, r119, isError4, visualTransformation4, keyboardOptions4, keyboardActions3, readOnly5, maxLines3, minLines3, interactionSource6, shape4, colors3, $changed, $changed1, $changed2, r95));
        return;
    L374:
        return;
    L362:
        r114 = false;
        goto L363
    L356:
        value$iv = it$iv;
        goto L357
    L358:
        interactionSource4 = interactionSource3;
        interactionSource5 = interactionSource4;
        goto L359
    L347:
        r210 = r70;
        r211 = r12;
        shape3 = shape2;
        r31 = r16;
        textStyle3 = textStyle2;
        r32 = r111;
        r212 = r14;
        r33 = r112;
        r34 = r113;
        isError3 = isError2;
        interactionSource3 = interactionSource2;
        colors2 = colors;
        modifier3 = modifier2;
        visualTransformation3 = visualTransformation2;
        keyboardOptions3 = keyboardOptions2;
        readOnly3 = readOnly2;
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
        r113 = r80;
        goto L312
    L308:
        r112 = r79;
        goto L309
    L305:
        r111 = r78;
        goto L306
    L302:
        r16 = r77;
        goto L303
    L299:
        r12 = r76;
        goto L300
    L296:
        r11 = r75;
        goto L297
    L268:
        if ($composer2.getDefaultsInvalid() == true) goto L283;
        $composer2.skipToGroupEnd();
        if ((r95 & 32) == 0) goto L274;
        $dirty = $dirty & (-458753);
    L274:
        if ((262144 & r95) == 0) goto L277;
        $dirty1 = $dirty1 & (-234881025);
    L277:
        if ((2097152 & r95) == 0) goto L280;
        $dirty2 = $dirty2 & (-113);
    L280:
        if ((r95 & 4194304) == 0) goto L282;
        r210 = r75;
        r211 = r76;
        r31 = r77;
        r32 = r78;
        r33 = r79;
        r34 = r80;
        isError3 = isError;
        visualTransformation3 = visualTransformation;
        keyboardOptions3 = keyboardOptions;
        keyboardActions2 = keyboardActions;
        singleLine2 = singleLine;
        maxLines2 = maxLines;
        minLines2 = minLines;
        interactionSource3 = interactionSource;
        shape3 = shape;
        $dirty2 = $dirty2 & (-897);
        readOnly3 = readOnly2;
        textStyle3 = textStyle2;
        r212 = r14;
        colors2 = colors;
        modifier3 = modifier2;
        goto L348
    L282:
        r210 = r75;
        r211 = r76;
        r31 = r77;
        r32 = r78;
        r33 = r79;
        r34 = r80;
        isError3 = isError;
        visualTransformation3 = visualTransformation;
        keyboardOptions3 = keyboardOptions;
        keyboardActions2 = keyboardActions;
        singleLine2 = singleLine;
        maxLines2 = maxLines;
        minLines2 = minLines;
        interactionSource3 = interactionSource;
        shape3 = shape;
        readOnly3 = readOnly2;
        textStyle3 = textStyle2;
        r212 = r14;
        colors2 = colors;
        modifier3 = modifier2;
        goto L348
    L258:
        if ((306783379 & $dirty1) != 306783378) goto L265;
        if (($dirty2 & 147) != 146) goto L265;
        if ($composer2.getSkipping() == false) goto L265;
        $composer2.skipToGroupEnd();
        r20 = r75;
        r211 = r76;
        r119 = r80;
        visualTransformation4 = visualTransformation;
        keyboardOptions4 = keyboardOptions;
        keyboardActions3 = keyboardActions;
        readOnly5 = singleLine;
        maxLines3 = maxLines;
        minLines3 = minLines;
        interactionSource6 = interactionSource;
        shape4 = shape;
        colors3 = colors;
        enabled4 = enabled2;
        readOnly4 = readOnly2;
        textStyle4 = textStyle2;
        r35 = r14;
        r116 = r77;
        r117 = r78;
        r118 = r79;
        isError4 = isError;
        goto L370
    L226:
        if (($changed2 & 6) != 0) goto L234;
        if ($composer2.changed(interactionSource) == false) goto L230;
        int r213 = 4;
    L231:
        $dirty2 = $dirty2 | r213;
        goto L234
    L230:
        r213 = 2;
        goto L231
    L215:
        if (($changed1 & 805306368) != 0) goto L222;
        if ($composer2.changed(minLines) == false) goto L219;
        int r214 = 536870912;
    L220:
        $dirty1 = $dirty1 | r214;
        goto L222
    L219:
        r214 = 268435456;
        goto L220
    L193:
        if (($changed1 & 12582912) != 0) goto L201;
        if ($composer2.changed(singleLine) == false) goto L197;
        int r215 = 8388608;
    L198:
        $dirty1 = $dirty1 | r215;
        goto L201
    L197:
        r215 = 4194304;
        goto L198
    L182:
        if (($changed1 & 1572864) != 0) goto L189;
        if ($composer2.changed(keyboardActions) == false) goto L186;
        int r216 = 1048576;
    L187:
        $dirty1 = $dirty1 | r216;
        goto L189
    L186:
        r216 = 524288;
        goto L187
    L171:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L178;
        if ($composer2.changed(keyboardOptions) == false) goto L175;
        int r217 = 131072;
    L176:
        $dirty1 = $dirty1 | r217;
        goto L178
    L175:
        r217 = 65536;
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
        if ($composer2.changedInstance(r80) == false) goto L142;
        int r41 = 256;
    L143:
        $dirty1 = $dirty1 | r41;
        goto L145
    L142:
        r41 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changedInstance(r79) == false) goto L131;
        int r310 = 32;
    L132:
        $dirty1 = $dirty1 | r310;
        goto L134
    L131:
        r310 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changedInstance(r78) == false) goto L120;
        int r38 = 4;
    L121:
        $dirty1 = $dirty1 | r38;
        goto L123
    L120:
        r38 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r77) == false) goto L109;
        int r311 = 536870912;
    L110:
        $dirty = $dirty | r311;
        goto L112
    L109:
        r311 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r76) == false) goto L98;
        int r312 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r312;
        goto L101
    L98:
        r312 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r75) == false) goto L87;
        int r313 = 8388608;
    L88:
        $dirty = $dirty | r313;
        goto L90
    L87:
        r313 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r14 = r74;
        if ($composer2.changedInstance(r14) == false) goto L76;
        int r314 = 1048576;
    L77:
        $dirty = $dirty | r314;
        goto L79
    L76:
        r314 = 524288;
        goto L77
    L78:
        r14 = r74;
        goto L79
    L60:
        if ((r95 & 32) != 0) goto L64;
        textStyle2 = textStyle;
        if ($composer2.changed(textStyle2) == false) goto L65;
        int r218 = 131072;
    L66:
        $dirty = $dirty | r218;
    L65:
        r218 = 65536;
        goto L66
    L64:
        textStyle2 = textStyle;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        readOnly2 = readOnly;
        if ($composer2.changed(readOnly2) == false) goto L54;
        int r219 = 16384;
    L55:
        $dirty = $dirty | r219;
        goto L58
    L54:
        r219 = 8192;
        goto L55
    L56:
        readOnly2 = readOnly;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r220 = 2048;
    L44:
        $dirty = $dirty | r220;
        goto L46
    L43:
        r220 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r120 = 256;
    L33:
        $dirty = $dirty | r120;
        goto L35
    L32:
        r120 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r8 = r69;
        if ($composer2.changedInstance(r8) == false) goto L21;
        int r121 = 32;
    L22:
        $dirty = $dirty | r121;
        goto L24
    L21:
        r121 = 16;
        goto L22
    L23:
        r8 = r69;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r15 = value;
        if ($composer2.changed(r15) == false) goto L10;
        int r42 = 4;
    L11:
        $dirty = $dirty | r42;
        goto L14
    L10:
        r42 = 2;
        goto L11
    L12:
        r15 = value;
        goto L14
    }

    public static final void TextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r62, final Function2<? super Composer, ? super Integer, Unit> r63, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> r64, final Function2<? super Composer, ? super Integer, Unit> r65, final Function2<? super Composer, ? super Integer, Unit> r66, final Function2<? super Composer, ? super Integer, Unit> r67, final Function2<? super Composer, ? super Integer, Unit> r68, final boolean singleLine, float animationProgress, final Function2<? super Composer, ? super Integer, Unit> r71, Function2<? super Composer, ? super Integer, Unit> r72, PaddingValues paddingValues, Composer $composer, final int $changed, final int $changed1) {
        final float r10 = animationProgress;
        Composer $composer2 = $composer.startRestartGroup(-1830307184);
        ComposerKt.sourceInformation($composer2, "C(TextFieldLayout)P(4,11,2,6,3,12,7,9,8!2,10)455@23228L147,458@23423L7,459@23435L4118:TextField.kt#uh7d8r");
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) goto L5;
        int $dirty = $changed;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changedInstance(r62) == false) goto L15;
        int r19 = 32;
    L16:
        $dirty = $dirty | r19;
        goto L18
    L15:
        r19 = 16;
    L18:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changedInstance(r63) == false) goto L22;
        int r110 = 256;
    L23:
        $dirty = $dirty | r110;
        goto L25
    L22:
        r110 = 128;
    L25:
        if (($changed & 3072) != 0) goto L32;
        if ($composer2.changedInstance(r64) == false) goto L29;
        int r0 = 2048;
    L30:
        $dirty = $dirty | r0;
        goto L32
    L29:
        r0 = 1024;
    L32:
        if (($changed & 24576) != 0) goto L39;
        if ($composer2.changedInstance(r65) == false) goto L36;
        int r1 = 16384;
    L37:
        $dirty = $dirty | r1;
        goto L39
    L36:
        r1 = 8192;
    L39:
        if ((196608 & $changed) != 0) goto L46;
        if ($composer2.changedInstance(r66) == false) goto L43;
        int r2 = 131072;
    L44:
        $dirty = $dirty | r2;
        goto L46
    L43:
        r2 = 65536;
    L46:
        if ((1572864 & $changed) != 0) goto L53;
        if ($composer2.changedInstance(r67) == false) goto L50;
        int r3 = 1048576;
    L51:
        $dirty = $dirty | r3;
        goto L53
    L50:
        r3 = 524288;
    L53:
        if ((12582912 & $changed) != 0) goto L60;
        if ($composer2.changedInstance(r68) == false) goto L57;
        int r4 = 8388608;
    L58:
        $dirty = $dirty | r4;
        goto L60
    L57:
        r4 = 4194304;
    L60:
        if ((100663296 & $changed) != 0) goto L67;
        if ($composer2.changed(singleLine) == false) goto L64;
        int r5 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L65:
        $dirty = $dirty | r5;
        goto L67
    L64:
        r5 = 33554432;
    L67:
        if ((805306368 & $changed) == 0) goto L69;
    L73:
        int $dirty2 = $dirty;
        int $dirty3 = $changed1 & 6;
        if ($dirty3 != 0) goto L81;
        if ($composer2.changedInstance(r71) == false) goto L78;
        int r18 = 4;
    L79:
        $dirty1 = $dirty1 | r18;
        goto L81
    L78:
        r18 = 2;
    L81:
        if (($changed1 & 48) != 0) goto L88;
        if ($composer2.changedInstance(r72) == false) goto L85;
        int r111 = 32;
    L86:
        $dirty1 = $dirty1 | r111;
        goto L88
    L85:
        r111 = 16;
    L88:
        if (($changed1 & 384) != 0) goto L94;
        PaddingValues r14 = paddingValues;
        if ($composer2.changed(r14) == false) goto L92;
        int r112 = 256;
    L93:
        $dirty1 = $dirty1 | r112;
    L95:
        int $dirty4 = $dirty1;
        if (($dirty2 & 306783379) != 306783378) goto L104;
        if (($dirty4 & 147) != 146) goto L104;
        if ($composer2.getSkipping() == false) goto L104;
        $composer2.skipToGroupEnd();
        Function2<? super Composer, ? super Integer, Unit> r6 = r72;
        Composer $composer3 = $composer2;
    L292:
        ScopeUpdateScope r7 = $composer3.endRestartGroup();
        if (r7 == null) goto L296;
        final Function2<? super Composer, ? super Integer, Unit> r12 = r6;
        final PaddingValues r13 = r14;
        r7.updateScope(new C05692(modifier, r62, r63, r64, r65, r66, r67, r68, singleLine, r10, r71, r12, r13, $changed, $changed1));
        return;
    L296:
        return;
    L104:
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventStart(-1830307184, $dirty2, $dirty4, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)");
    L106:
        ComposerKt.sourceInformationMarkerStart($composer2, -1052646361, "CC(remember):TextField.kt#9igjgp");
        if ((234881024 & $dirty2) != 67108864) goto L109;
        boolean r8 = true;
    L111:
        if (($dirty2 & 1879048192) != 536870912) goto L113;
        boolean r9 = true;
    L114:
        boolean r11 = r9 | r8;
        if (($dirty4 & 896) != 256) goto L117;
        boolean r15 = true;
    L118:
        boolean invalid$iv = r11 | r15;
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L125;
        if (value$iv == Composer.Companion.getEmpty()) goto L125;
    L126:
        TextFieldMeasurePolicy measurePolicy = (TextFieldMeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<LayoutDirection> r16 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r17 = $composer2.consume(r16);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LayoutDirection layoutDirection = (LayoutDirection) r17;
        int $changed$iv = ($dirty2 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier);
        Function0<ComposeUiNode> r24 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L129;
        ComposablesKt.invalidApplier();
    L129:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L132;
        Function0<ComposeUiNode> r20 = r24;
        $composer2.createNode(r20);
    L133:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L140;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L140;
    L141:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r22 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -1362557328, "C465@23754L11,550@26868L187:TextField.kt#uh7d8r");
        r71.invoke($composer3, Integer.valueOf($dirty4 & 14));
        $composer3.startReplaceGroup(1341517187);
        ComposerKt.sourceInformation($composer3, "468@23818L219");
        if (r65 == null) goto L160;
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
        if (($composer3.getApplier() instanceof Applier) == true) goto L146;
        ComposablesKt.invalidApplier();
    L146:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L149;
        Function0<ComposeUiNode> r23 = r44;
        $composer3.createNode(r23);
    L150:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r113 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L157;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L157;
    L158:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r25 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r114 = BoxScopeInstance.INSTANCE;
        int r48 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -948431736, "C472@24010L9:TextField.kt#uh7d8r");
        r65.invoke($composer3, Integer.valueOf(($dirty2 >> 12) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L157:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r113);
        goto L158
    L149:
        r23 = r44;
        $composer3.useNode();
    L160:
        $composer3.endReplaceGroup();
        $composer3.startReplaceGroup(1341526310);
        ComposerKt.sourceInformation($composer3, "476@24104L221");
        if (r66 == null) goto L178;
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
        if (($composer3.getApplier() instanceof Applier) == true) goto L165;
        ComposablesKt.invalidApplier();
    L165:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L168;
        Function0<ComposeUiNode> r26 = r41;
        $composer3.createNode(r26);
    L169:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r115 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L176;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L176;
    L177:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r27 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r116 = BoxScopeInstance.INSTANCE;
        int r45 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -948147001, "C480@24297L10:TextField.kt#uh7d8r");
        r66.invoke($composer3, Integer.valueOf(($dirty2 >> 15) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L176:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r115);
        goto L177
    L168:
        r26 = r41;
        $composer3.useNode();
    L178:
        $composer3.endReplaceGroup();
        float startTextFieldPadding = PaddingKt.calculateStartPadding(r14, layoutDirection);
        float endTextFieldPadding = PaddingKt.calculateEndPadding(r14, layoutDirection);
        if (r65 == null) goto L181;
        float other$iv = TextFieldImplKt.getHorizontalIconPadding();
        float other$iv2 = Dp.m6973constructorimpl(startTextFieldPadding - other$iv);
        float minimumValue$iv = Dp.m6973constructorimpl(0);
        float $this$coerceAtLeast_u2dYgX7TsA$iv = Dp.m6973constructorimpl(RangesKt.coerceAtLeast(other$iv2, minimumValue$iv));
    L182:
        float startPadding = $this$coerceAtLeast_u2dYgX7TsA$iv;
        if (r66 == null) goto L185;
        float other$iv3 = TextFieldImplKt.getHorizontalIconPadding();
        float other$iv4 = Dp.m6973constructorimpl(endTextFieldPadding - other$iv3);
        float minimumValue$iv2 = Dp.m6973constructorimpl(0);
        float $this$coerceAtLeast_u2dYgX7TsA$iv2 = Dp.m6973constructorimpl(RangesKt.coerceAtLeast(other$iv4, minimumValue$iv2));
        float r42 = $this$coerceAtLeast_u2dYgX7TsA$iv2;
    L186:
        float endPadding = r42;
        $composer3.startReplaceGroup(1341556924);
        ComposerKt.sourceInformation($composer3, "501@25056L309");
        if (r67 == null) goto L205;
        Modifier modifier$iv3 = PaddingKt.m729paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m760heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), startPadding, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv3 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, false);
        int $changed$iv$iv4 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r43 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv4 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L191;
        ComposablesKt.invalidApplier();
    L191:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L194;
        Function0<ComposeUiNode> r28 = r43;
        $composer3.createNode(r28);
    L195:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r29 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L202;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == false) goto L202;
    L203:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r30 = ($changed$iv$iv$iv3 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r31 = BoxScopeInstance.INSTANCE;
        int r49 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -947113399, "C507@25339L8:TextField.kt#uh7d8r");
        r67.invoke($composer3, Integer.valueOf(($dirty2 >> 18) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L202:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r29);
        goto L203
    L194:
        r28 = r43;
        $composer3.useNode();
    L205:
        $composer3.endReplaceGroup();
        $composer3.startReplaceGroup(1341568890);
        ComposerKt.sourceInformation($composer3, "511@25430L307");
        if (r68 == null) goto L224;
        Modifier modifier$iv4 = PaddingKt.m729paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m760heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, endPadding, 0.0f, 10, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv4 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv4, false);
        int $changed$iv$iv5 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv4 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv4 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer3, modifier$iv4);
        Function0<ComposeUiNode> r46 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv4 = (($changed$iv$iv5 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L210;
        ComposablesKt.invalidApplier();
    L210:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L213;
        Function0<ComposeUiNode> r32 = r46;
        $composer3.createNode(r32);
    L214:
        Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r33 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv4.getInserting() == true) goto L221;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv4.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv4)) == false) goto L221;
    L222:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.Companion.getSetModifier());
        int r34 = ($changed$iv$iv$iv4 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r35 = BoxScopeInstance.INSTANCE;
        int r410 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -946744375, "C517@25711L8:TextField.kt#uh7d8r");
        r68.invoke($composer3, Integer.valueOf(($dirty2 >> 21) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L221:
        $this$Layout_u24lambda_u240$iv$iv4.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv4));
        $this$Layout_u24lambda_u240$iv$iv4.apply(Integer.valueOf(compositeKeyHash$iv$iv4), r33);
        goto L222
    L213:
        r32 = r46;
        $composer3.useNode();
    L224:
        $composer3.endReplaceGroup();
        $composer3.startReplaceGroup(1341581092);
        ComposerKt.sourceInformation($composer3, "522@25802L574");
        if (r63 == null) goto L242;
        r10 = animationProgress;
        Modifier modifier$iv5 = PaddingKt.m729paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m760heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Label"), DpKt.m7016lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), r10), 0.0f, 2, null), null, false, 3, null), startPadding, 0.0f, endPadding, 0.0f, 10, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv5 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv5 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv5, false);
        int $changed$iv$iv6 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv5 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv5 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer3, modifier$iv5);
        Function0<ComposeUiNode> r47 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv5 = (($changed$iv$iv6 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L229;
        ComposablesKt.invalidApplier();
    L229:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L232;
        Function0<ComposeUiNode> r36 = r47;
        $composer3.createNode(r36);
    L233:
        Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r37 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv5.getInserting() == true) goto L240;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv5.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv5)) == false) goto L240;
    L241:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv5, ComposeUiNode.Companion.getSetModifier());
        int r38 = ($changed$iv$iv$iv5 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r39 = BoxScopeInstance.INSTANCE;
        int r411 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -946109526, "C535@26351L7:TextField.kt#uh7d8r");
        r63.invoke($composer3, Integer.valueOf(($dirty2 >> 6) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L243:
        $composer3.endReplaceGroup();
        Modifier r412 = SizeKt.wrapContentHeight$default(SizeKt.m760heightInVpY3zN4$default(Modifier.Companion, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
        if (r67 != null) goto L246;
        float r413 = startPadding;
    L248:
        if (r68 != null) goto L250;
        float r414 = endPadding;
    L251:
        Modifier textPadding = PaddingKt.m729paddingqDBjuR0$default(r412, r413, 0.0f, r414, 0.0f, 10, null);
        $composer3.startReplaceGroup(1341611627);
        ComposerKt.sourceInformation($composer3, "548@26778L63");
        if (r64 == null) goto L255;
        r64.invoke(LayoutIdKt.layoutId(Modifier.Companion, "Hint").then(textPadding), $composer3, Integer.valueOf(($dirty2 >> 6) & 112));
    L255:
        $composer3.endReplaceGroup();
        Modifier modifier$iv6 = LayoutIdKt.layoutId(Modifier.Companion, "TextField").then(textPadding);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv6 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv6 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv6, true);
        int $changed$iv$iv7 = (384 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv6 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv6 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv6 = ComposedModifierKt.materializeModifier($composer3, modifier$iv6);
        Function0<ComposeUiNode> r415 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv6 = (($changed$iv$iv7 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L258;
        ComposablesKt.invalidApplier();
    L258:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L261;
        Function0<ComposeUiNode> r40 = r415;
        $composer3.createNode(r40);
    L262:
        Composer $this$Layout_u24lambda_u240$iv$iv6 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv6, measurePolicy$iv6, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv6, localMap$iv$iv6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r50 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv6.getInserting() == true) goto L269;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv6.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv6)) == false) goto L269;
    L270:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv6, materialized$iv$iv6, ComposeUiNode.Companion.getSetModifier());
        int r51 = ($changed$iv$iv$iv6 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r52 = BoxScopeInstance.INSTANCE;
        int r416 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -945435834, "C554@27030L11:TextField.kt#uh7d8r");
        r62.invoke($composer3, Integer.valueOf(($dirty2 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.startReplaceGroup(1341622624);
        ComposerKt.sourceInformation($composer3, "559@27167L317");
        if (r72 == null) goto L288;
        Modifier modifier$iv7 = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m760heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m2797supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv7 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv7 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv7, false);
        int $changed$iv$iv8 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv7 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv7 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv7 = ComposedModifierKt.materializeModifier($composer3, modifier$iv7);
        Function0<ComposeUiNode> r210 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv7 = (($changed$iv$iv8 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L275;
        ComposablesKt.invalidApplier();
    L275:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L278;
        Function0<ComposeUiNode> r53 = r210;
        $composer3.createNode(r53);
    L279:
        Composer $this$Layout_u24lambda_u240$iv$iv7 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv7, measurePolicy$iv7, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv7, localMap$iv$iv7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r54 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv7.getInserting() == true) goto L286;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv7.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv7)) == false) goto L286;
    L287:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv7, materialized$iv$iv7, ComposeUiNode.Companion.getSetModifier());
        int r55 = ($changed$iv$iv$iv7 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r117 = BoxScopeInstance.INSTANCE;
        int r118 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -945015195, "C565@27454L12:TextField.kt#uh7d8r");
        r6 = r72;
        r6.invoke($composer3, Integer.valueOf(($dirty4 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L289:
        $composer3.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L292;
        ComposerKt.traceEventEnd();
    L286:
        $this$Layout_u24lambda_u240$iv$iv7.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv7));
        $this$Layout_u24lambda_u240$iv$iv7.apply(Integer.valueOf(compositeKeyHash$iv$iv7), r54);
        goto L287
    L278:
        r53 = r210;
        $composer3.useNode();
        goto L279
    L288:
        r6 = r72;
    L269:
        $this$Layout_u24lambda_u240$iv$iv6.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv6));
        $this$Layout_u24lambda_u240$iv$iv6.apply(Integer.valueOf(compositeKeyHash$iv$iv6), r50);
        goto L270
    L261:
        r40 = r415;
        $composer3.useNode();
        goto L262
    L250:
        r414 = Dp.m6973constructorimpl(0);
        goto L251
    L246:
        r413 = Dp.m6973constructorimpl(0);
    L240:
        $this$Layout_u24lambda_u240$iv$iv5.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv5));
        $this$Layout_u24lambda_u240$iv$iv5.apply(Integer.valueOf(compositeKeyHash$iv$iv5), r37);
        goto L241
    L232:
        r36 = r47;
        $composer3.useNode();
        goto L233
    L242:
        r10 = animationProgress;
        goto L243
    L185:
        r42 = endTextFieldPadding;
        goto L186
    L181:
        $this$coerceAtLeast_u2dYgX7TsA$iv = startTextFieldPadding;
    L140:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r21);
        goto L141
    L132:
        r20 = r24;
        $composer2.useNode();
    L125:
        value$iv = new TextFieldMeasurePolicy(singleLine, r10, r14);
        $composer2.updateRememberedValue(value$iv);
        goto L126
    L117:
        r15 = false;
        goto L118
    L113:
        r9 = false;
        goto L114
    L109:
        r8 = false;
        goto L111
    L92:
        r112 = 128;
        goto L93
    L94:
        r14 = paddingValues;
        goto L95
    L69:
        if ($composer2.changed(r10) == false) goto L71;
        int r56 = 536870912;
    L72:
        $dirty = $dirty | r56;
        goto L73
    L71:
        r56 = 268435456;
        goto L72
    L5:
        if ($composer2.changed(modifier) == false) goto L7;
        int r119 = 4;
    L8:
        $dirty = $changed | r119;
        goto L11
    L7:
        r119 = 2;
        goto L8
    }

    private static final int substractConstraintSafely(int $this$substractConstraintSafely, int from) {
        if ($this$substractConstraintSafely != Integer.MAX_VALUE) goto L6;
        return $this$substractConstraintSafely;
    L6:
        return $this$substractConstraintSafely - from;
    }

    /* JADX INFO: renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    private static final int m2818calculateWidthyeHjK3Y(int leadingWidth, int trailingWidth, int prefixWidth, int suffixWidth, int textFieldWidth, int labelWidth, int placeholderWidth, long constraints) {
        int affixTotalWidth = prefixWidth + suffixWidth;
        int middleSection = Math.max(textFieldWidth + affixTotalWidth, Math.max(placeholderWidth + affixTotalWidth, labelWidth));
        int wrappedWidth = (leadingWidth + middleSection) + trailingWidth;
        return Math.max(wrappedWidth, Constraints.m6928getMinWidthimpl(constraints));
    }

    /* JADX INFO: renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    private static final int m2817calculateHeightmKXJcVc(int textFieldHeight, int labelHeight, int leadingHeight, int trailingHeight, int prefixHeight, int suffixHeight, int placeholderHeight, int supportingHeight, float animationProgress, long constraints, float density, PaddingValues paddingValues) {
        if (labelHeight <= 0) goto L5;
        boolean hasLabel = true;
    L6:
        float arg0$iv = paddingValues.mo677calculateTopPaddingD9Ej5fM();
        float other$iv = paddingValues.mo674calculateBottomPaddingD9Ej5fM();
        float verticalPadding = Dp.m6973constructorimpl(arg0$iv + other$iv) * density;
        if (hasLabel == false) goto L9;
        float arg0$iv2 = TextFieldImplKt.getTextFieldPadding();
        float actualVerticalPadding = MathHelpersKt.lerp(Dp.m6973constructorimpl(2 * arg0$iv2) * density, verticalPadding, animationProgress);
    L10:
        int inputFieldHeight = ComparisonsKt.maxOf(textFieldHeight, new int[]{placeholderHeight, prefixHeight, suffixHeight, MathHelpersKt.lerp(labelHeight, 0, animationProgress)});
        float middleSectionHeight = (MathHelpersKt.lerp(0, labelHeight, animationProgress) + actualVerticalPadding) + inputFieldHeight;
        return Math.max(Constraints.m6927getMinHeightimpl(constraints), Math.max(leadingHeight, Math.max(trailingHeight, MathKt.roundToInt(middleSectionHeight))) + supportingHeight);
    L9:
        actualVerticalPadding = verticalPadding;
        goto L10
    L5:
        hasLabel = false;
        goto L6
    }

    private static final void placeWithLabel(Placeable.PlacementScope $this$placeWithLabel, int width, int totalHeight, Placeable textfieldPlaceable, Placeable labelPlaceable, Placeable placeholderPlaceable, Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable prefixPlaceable, Placeable suffixPlaceable, Placeable containerPlaceable, Placeable supportingPlaceable, boolean singleLine, int labelEndPosition, int textPosition, float animationProgress, float density) {
        Placeable.PlacementScope.m5778place70tqf50$default($this$placeWithLabel, containerPlaceable, IntOffset.Companion.m7112getZeronOccac(), 0.0f, 2, null);
        int height = totalHeight - TextFieldImplKt.heightOrZero(supportingPlaceable);
        if (leadingPlaceable == null) goto L5;
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, leadingPlaceable, 0, Alignment.Companion.getCenterVertically().align(leadingPlaceable.getHeight(), height), 0.0f, 4, null);
    L5:
        if (labelPlaceable != null) goto L7;
    L11:
        if (prefixPlaceable == null) goto L13;
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, prefixPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), textPosition, 0.0f, 4, null);
    L13:
        int textHorizontalPosition = TextFieldImplKt.widthOrZero(leadingPlaceable) + TextFieldImplKt.widthOrZero(prefixPlaceable);
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, textfieldPlaceable, textHorizontalPosition, textPosition, 0.0f, 4, null);
        if (placeholderPlaceable == null) goto L17;
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, placeholderPlaceable, textHorizontalPosition, textPosition, 0.0f, 4, null);
    L17:
        if (suffixPlaceable == null) goto L19;
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, suffixPlaceable, (width - TextFieldImplKt.widthOrZero(trailingPlaceable)) - suffixPlaceable.getWidth(), textPosition, 0.0f, 4, null);
    L19:
        if (trailingPlaceable == null) goto L21;
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, trailingPlaceable, width - trailingPlaceable.getWidth(), Alignment.Companion.getCenterVertically().align(trailingPlaceable.getHeight(), height), 0.0f, 4, null);
    L21:
        if (supportingPlaceable == null) goto L24;
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, supportingPlaceable, 0, height, 0.0f, 4, null);
        return;
    L24:
        return;
    L7:
        if (singleLine == false) goto L9;
        int startPosition = Alignment.Companion.getCenterVertically().align(labelPlaceable.getHeight(), height);
    L10:
        int distance = startPosition - labelEndPosition;
        int positionY = startPosition - MathKt.roundToInt(distance * animationProgress);
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, labelPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), positionY, 0.0f, 4, null);
        goto L11
    L9:
        startPosition = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * density);
        goto L10
    }

    private static final void placeWithoutLabel(Placeable.PlacementScope $this$placeWithoutLabel, int width, int totalHeight, Placeable textPlaceable, Placeable placeholderPlaceable, Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable prefixPlaceable, Placeable suffixPlaceable, Placeable containerPlaceable, Placeable supportingPlaceable, boolean singleLine, float density, PaddingValues paddingValues) {
        Placeable.PlacementScope.m5778place70tqf50$default($this$placeWithoutLabel, containerPlaceable, IntOffset.Companion.m7112getZeronOccac(), 0.0f, 2, null);
        int height = totalHeight - TextFieldImplKt.heightOrZero(supportingPlaceable);
        int topPadding = MathKt.roundToInt(paddingValues.mo677calculateTopPaddingD9Ej5fM() * density);
        if (leadingPlaceable == null) goto L5;
        Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, leadingPlaceable, 0, Alignment.Companion.getCenterVertically().align(leadingPlaceable.getHeight(), height), 0.0f, 4, null);
    L5:
        if (prefixPlaceable == null) goto L7;
        Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, prefixPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), placeWithoutLabel$calculateVerticalPosition(singleLine, height, topPadding, prefixPlaceable), 0.0f, 4, null);
    L7:
        int r0 = TextFieldImplKt.widthOrZero(leadingPlaceable);
        int textHorizontalPosition = TextFieldImplKt.widthOrZero(prefixPlaceable) + r0;
        Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, textPlaceable, textHorizontalPosition, placeWithoutLabel$calculateVerticalPosition(singleLine, height, topPadding, textPlaceable), 0.0f, 4, null);
        if (placeholderPlaceable == null) goto L11;
        Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, placeholderPlaceable, textHorizontalPosition, placeWithoutLabel$calculateVerticalPosition(singleLine, height, topPadding, placeholderPlaceable), 0.0f, 4, null);
    L11:
        if (suffixPlaceable == null) goto L13;
        Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, suffixPlaceable, (width - TextFieldImplKt.widthOrZero(trailingPlaceable)) - suffixPlaceable.getWidth(), placeWithoutLabel$calculateVerticalPosition(singleLine, height, topPadding, suffixPlaceable), 0.0f, 4, null);
    L13:
        if (trailingPlaceable == null) goto L15;
        Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, trailingPlaceable, width - trailingPlaceable.getWidth(), Alignment.Companion.getCenterVertically().align(trailingPlaceable.getHeight(), height), 0.0f, 4, null);
    L15:
        if (supportingPlaceable == null) goto L18;
        Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, supportingPlaceable, 0, height, 0.0f, 4, null);
        return;
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(boolean $singleLine, int height, int topPadding, Placeable placeable) {
        if ($singleLine == false) goto L5;
        return Alignment.Companion.getCenterVertically().align(placeable.getHeight(), height);
    L5:
        return topPadding;
    }

    public static final Modifier drawIndicatorLine(Modifier $this$drawIndicatorLine, final State<BorderStroke> r2) {
        return DrawModifierKt.drawWithContent($this$drawIndicatorLine, new C05701(r2));
    }

    static {
        TextFieldWithLabelVerticalPadding = Dp.m6973constructorimpl(8);
    }

    public static final float getTextFieldWithLabelVerticalPadding() {
        return TextFieldWithLabelVerticalPadding;
    }
}
