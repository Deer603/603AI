package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b7\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100J7\u00101\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u0015H\u0007¢\u0006\u0002\u00102J¦\u0002\u00103\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020$07¢\u0006\u0002\b82\u0006\u0010%\u001a\u00020&2\u0006\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020;2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010'\u001a\u00020&2\u0015\b\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010?\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010@\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010A\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010B\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010C\u001a\u00020D2\u0013\b\u0002\u0010E\u001a\r\u0012\u0004\u0012\u00020$07¢\u0006\u0002\b8H\u0007¢\u0006\u0002\u0010FJ\r\u0010,\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010GJÂ\u0003\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010H\u001a\u00020I2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020I2\b\b\u0002\u0010L\u001a\u00020I2\b\b\u0002\u0010M\u001a\u00020I2\b\b\u0002\u0010N\u001a\u00020I2\b\b\u0002\u0010O\u001a\u00020I2\b\b\u0002\u0010P\u001a\u00020I2\b\b\u0002\u0010Q\u001a\u00020I2\b\b\u0002\u0010R\u001a\u00020I2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\b\b\u0002\u0010U\u001a\u00020I2\b\b\u0002\u0010V\u001a\u00020I2\b\b\u0002\u0010W\u001a\u00020I2\b\b\u0002\u0010X\u001a\u00020I2\b\b\u0002\u0010Y\u001a\u00020I2\b\b\u0002\u0010Z\u001a\u00020I2\b\b\u0002\u0010[\u001a\u00020I2\b\b\u0002\u0010\\\u001a\u00020I2\b\b\u0002\u0010]\u001a\u00020I2\b\b\u0002\u0010^\u001a\u00020I2\b\b\u0002\u0010_\u001a\u00020I2\b\b\u0002\u0010`\u001a\u00020I2\b\b\u0002\u0010a\u001a\u00020I2\b\b\u0002\u0010b\u001a\u00020I2\b\b\u0002\u0010c\u001a\u00020I2\b\b\u0002\u0010d\u001a\u00020I2\b\b\u0002\u0010e\u001a\u00020I2\b\b\u0002\u0010f\u001a\u00020I2\b\b\u0002\u0010g\u001a\u00020I2\b\b\u0002\u0010h\u001a\u00020I2\b\b\u0002\u0010i\u001a\u00020I2\b\b\u0002\u0010j\u001a\u00020I2\b\b\u0002\u0010k\u001a\u00020I2\b\b\u0002\u0010l\u001a\u00020I2\b\b\u0002\u0010m\u001a\u00020I2\b\b\u0002\u0010n\u001a\u00020I2\b\b\u0002\u0010o\u001a\u00020I2\b\b\u0002\u0010p\u001a\u00020I2\b\b\u0002\u0010q\u001a\u00020I2\b\b\u0002\u0010r\u001a\u00020I2\b\b\u0002\u0010s\u001a\u00020I2\b\b\u0002\u0010t\u001a\u00020IH\u0007ø\u0001\u0000¢\u0006\u0004\bu\u0010vJ8\u0010w\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b|\u0010}J8\u0010~\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u007f\u0010}J<\u0010\u0080\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0081\u0001\u0010}J<\u0010\u0082\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0005\b\u0083\u0001\u0010}J<\u0010\u0084\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0085\u0001\u0010}J<\u0010\u0086\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0087\u0001\u0010}JM\u0010\u0088\u0001\u001a\u00020+*\u00020+2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0019\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\u001e\u001a\u00020\u001f*\u00020 8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008b\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM$annotations", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape$annotations", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape$annotations", "getOutlinedShape", "shape", "getShape", "defaultTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", TextFieldImplKt.ContainerId, "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "ContainerBox", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "container", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "contentPaddingWithLabel", "start", "end", "top", "bottom", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithoutLabel", "contentPaddingWithoutLabel-a9UjIt4", "outlinedTextFieldPadding", "outlinedTextFieldPadding-a9UjIt4", "supportingTextPadding", "supportingTextPadding-a9UjIt4$material3_release", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness = 0.0f;
    private static final float FocusedIndicatorThickness = 0.0f;
    public static final TextFieldDefaults INSTANCE = null;
    private static final float MinHeight = 0.0f;
    private static final float MinWidth = 0.0f;
    private static final float UnfocusedBorderThickness = 0.0f;
    private static final float UnfocusedIndicatorThickness = 0.0f;

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.shape", imports = {}))
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2793getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2794getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    private TextFieldDefaults() {
    }

    public final Shape getShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1941327459, "C60@2756L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1941327459, $changed, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:60)");
    L5:
        Shape r0 = ShapesKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    static {
        INSTANCE = new TextFieldDefaults();
        MinHeight = Dp.m6973constructorimpl(56);
        MinWidth = Dp.m6973constructorimpl(280);
        UnfocusedIndicatorThickness = Dp.m6973constructorimpl(1);
        FocusedIndicatorThickness = Dp.m6973constructorimpl(2);
        UnfocusedBorderThickness = UnfocusedIndicatorThickness;
        FocusedBorderThickness = FocusedIndicatorThickness;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2806getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2807getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* JADX INFO: renamed from: getUnfocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m2809getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    /* JADX INFO: renamed from: getFocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m2805getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* JADX INFO: renamed from: Container-4EFweAY, reason: not valid java name */
    public final void m2800Container4EFweAY(final boolean enabled, final boolean isError, final InteractionSource interactionSource, Modifier modifier, TextFieldColors colors, Shape shape, float focusedIndicatorLineThickness, float unfocusedIndicatorLineThickness, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(-818661242);
        ComposerKt.sourceInformation($composer2, "C(Container)P(1,4,3,5!1,6,2:c#ui.unit.Dp,7:c#ui.unit.Dp)105@4681L8,106@4732L5,110@4933L25,112@5006L198,116@5213L496:TextFieldDefaults.kt#uh7d8r");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r34 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r34 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
    L32:
        int r7 = r34 & 8;
        if (r7 == 0) goto L36;
        $dirty = $dirty | 3072;
        Modifier modifier2 = modifier;
    L44:
        if (($changed & 24576) == 0) goto L46;
        TextFieldColors colors2 = colors;
    L55:
        if ((196608 & $changed) == 0) goto L57;
        Shape shape2 = shape;
    L66:
        if ((1572864 & $changed) == 0) goto L68;
        float focusedIndicatorLineThickness2 = focusedIndicatorLineThickness;
    L77:
        if ((12582912 & $changed) == 0) goto L79;
        float r14 = unfocusedIndicatorLineThickness;
    L88:
        if ((r34 & 256) == 0) goto L91;
        $dirty = $dirty | 100663296;
    L98:
        if ((38347923 & $dirty) == 38347922) goto L100;
    L103:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L106;
    L121:
        if (r7 == 0) goto L124;
        modifier2 = Modifier.Companion;
    L124:
        if ((r34 & 16) == 0) goto L127;
        TextFieldColors colors3 = colors($composer2, ($dirty >> 24) & 14);
        $dirty = $dirty & (-57345);
        colors2 = colors3;
    L127:
        if ((r34 & 32) == 0) goto L130;
        $dirty = $dirty & (-458753);
        shape2 = INSTANCE.getShape($composer2, 6);
    L130:
        if ((r34 & 64) == 0) goto L133;
        $dirty = $dirty & (-3670017);
        focusedIndicatorLineThickness2 = FocusedIndicatorThickness;
    L133:
        if ((r34 & 128) == 0) goto L135;
        float unfocusedIndicatorLineThickness2 = UnfocusedIndicatorThickness;
        Shape shape3 = shape2;
        int $dirty2 = $dirty & (-29360129);
        float focusedIndicatorLineThickness3 = focusedIndicatorLineThickness2;
    L136:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L139;
        ComposerKt.traceEventStart(-818661242, $dirty2, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:109)");
    L139:
        boolean focused = FocusInteractionKt.collectIsFocusedAsState(interactionSource, $composer2, ($dirty2 >> 6) & 14).getValue().booleanValue();
        final State<Color> r0 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(colors2.m2737containerColorXeAY9LY$material3_release(enabled, isError, focused), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, $composer2, 48, 12);
        Composer $composer3 = $composer2;
        TextFieldColors colors4 = colors2;
        Shape shape4 = shape3;
        BoxKt.Box(m2810indicatorLinegv0btCI(TextFieldImplKt.textFieldBackground(modifier2, new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new TextFieldDefaults$Container$1(r0)), shape3), enabled, isError, interactionSource, colors4, focusedIndicatorLineThickness3, unfocusedIndicatorLineThickness2), $composer3, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L142;
        ComposerKt.traceEventEnd();
    L142:
        float r22 = focusedIndicatorLineThickness3;
        final TextFieldColors colors5 = colors4;
        final Modifier modifier3 = modifier2;
        final float focusedIndicatorLineThickness4 = r22;
        final float unfocusedIndicatorLineThickness3 = unfocusedIndicatorLineThickness2;
        final Shape shape5 = shape4;
    L143:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L147;
        r13.updateScope(new TextFieldDefaults$Container$2(this, enabled, isError, interactionSource, modifier3, colors5, shape5, focusedIndicatorLineThickness4, unfocusedIndicatorLineThickness3, $changed, r34));
        return;
    L147:
        return;
    L135:
        shape3 = shape2;
        unfocusedIndicatorLineThickness2 = r14;
        $dirty2 = $dirty;
        focusedIndicatorLineThickness3 = focusedIndicatorLineThickness2;
        goto L136
    L106:
        if ($composer2.getDefaultsInvalid() == true) goto L121;
        $composer2.skipToGroupEnd();
        if ((r34 & 16) == 0) goto L112;
        $dirty = $dirty & (-57345);
    L112:
        if ((r34 & 32) == 0) goto L115;
        $dirty = $dirty & (-458753);
    L115:
        if ((r34 & 64) == 0) goto L118;
        $dirty = $dirty & (-3670017);
    L118:
        if ((r34 & 128) == 0) goto L120;
        int r1 = $dirty & (-29360129);
        Shape r6 = shape2;
        $dirty2 = r1;
        shape3 = r6;
        focusedIndicatorLineThickness3 = focusedIndicatorLineThickness2;
        unfocusedIndicatorLineThickness2 = r14;
        goto L136
    L120:
        shape3 = shape2;
        unfocusedIndicatorLineThickness2 = r14;
        $dirty2 = $dirty;
        focusedIndicatorLineThickness3 = focusedIndicatorLineThickness2;
        goto L136
    L100:
        if ($composer2.getSkipping() == false) goto L103;
        $composer2.skipToGroupEnd();
        colors5 = colors2;
        shape5 = shape2;
        unfocusedIndicatorLineThickness3 = r14;
        $composer3 = $composer2;
        modifier3 = modifier2;
        focusedIndicatorLineThickness4 = focusedIndicatorLineThickness2;
        goto L143
    L91:
        if (($changed & 100663296) != 0) goto L98;
        if ($composer2.changed(this) == false) goto L95;
        int r15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L96:
        $dirty = $dirty | r15;
        goto L98
    L95:
        r15 = 33554432;
        goto L96
    L79:
        if ((r34 & 128) != 0) goto L83;
        r14 = unfocusedIndicatorLineThickness;
        if ($composer2.changed(r14) == false) goto L84;
        int r16 = 8388608;
    L85:
        $dirty = $dirty | r16;
    L84:
        r16 = 4194304;
        goto L85
    L83:
        r14 = unfocusedIndicatorLineThickness;
        goto L84
    L68:
        if ((r34 & 64) != 0) goto L72;
        focusedIndicatorLineThickness2 = focusedIndicatorLineThickness;
        if ($composer2.changed(focusedIndicatorLineThickness2) == false) goto L73;
        int r17 = 1048576;
    L74:
        $dirty = $dirty | r17;
    L73:
        r17 = 524288;
        goto L74
    L72:
        focusedIndicatorLineThickness2 = focusedIndicatorLineThickness;
        goto L73
    L57:
        if ((r34 & 32) != 0) goto L61;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L62;
        int r18 = 131072;
    L63:
        $dirty = $dirty | r18;
    L62:
        r18 = 65536;
        goto L63
    L61:
        shape2 = shape;
        goto L62
    L46:
        if ((r34 & 16) != 0) goto L50;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L51;
        int r12 = 16384;
    L52:
        $dirty = $dirty | r12;
    L51:
        r12 = 8192;
        goto L52
    L50:
        colors2 = colors;
        goto L51
    L36:
        if (($changed & 3072) != 0) goto L42;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L40;
        int r9 = 2048;
    L41:
        $dirty = $dirty | r9;
        goto L44
    L40:
        r9 = 1024;
        goto L41
    L42:
        modifier2 = modifier;
        goto L44
    L26:
        if (($changed & 384) != 0) goto L32;
        if ($composer2.changed(interactionSource) == false) goto L30;
        int r8 = 256;
    L31:
        $dirty = $dirty | r8;
        goto L32
    L30:
        r8 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(isError) == false) goto L20;
        int r10 = 32;
    L21:
        $dirty = $dirty | r10;
        goto L23
    L20:
        r10 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(enabled) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L13
    L10:
        r11 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2795indicatorLinegv0btCI$default(TextFieldDefaults r8, Modifier r9, boolean r10, boolean r11, InteractionSource r12, TextFieldColors r13, float r14, float r15, int r16, Object r17) {
        if ((r16 & 16) == 0) goto L5;
        float r6 = FocusedIndicatorThickness;
    L7:
        if ((r16 & 32) == 0) goto L9;
        float r7 = UnfocusedIndicatorThickness;
    L11:
        return r8.m2810indicatorLinegv0btCI(r9, r10, r11, r12, r13, r6, r7);
    L9:
        r7 = r15;
        goto L11
    L5:
        r6 = r14;
        goto L7
    }

    /* JADX INFO: renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m2810indicatorLinegv0btCI(Modifier $this$indicatorLine_u2dgv0btCI, final boolean enabled, final boolean isError, final InteractionSource interactionSource, final TextFieldColors colors, final float focusedIndicatorLineThickness, final float unfocusedIndicatorLineThickness) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(enabled, isError, interactionSource, colors, focusedIndicatorLineThickness, unfocusedIndicatorLineThickness);
    L7:
        return ComposedModifierKt.composed($this$indicatorLine_u2dgv0btCI, r2, new TextFieldDefaults$indicatorLine$2(interactionSource, enabled, isError, colors, focusedIndicatorLineThickness, unfocusedIndicatorLineThickness));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public final void DecorationBox(final String value, final Function2<? super Composer, ? super Integer, Unit> r37, final boolean enabled, final boolean singleLine, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean isError, Function2<? super Composer, ? super Integer, Unit> r43, Function2<? super Composer, ? super Integer, Unit> r44, Function2<? super Composer, ? super Integer, Unit> r45, Function2<? super Composer, ? super Integer, Unit> r46, Function2<? super Composer, ? super Integer, Unit> r47, Function2<? super Composer, ? super Integer, Unit> r48, Function2<? super Composer, ? super Integer, Unit> r49, Shape shape, TextFieldColors colors, PaddingValues contentPadding, Function2<? super Composer, ? super Integer, Unit> r53, Composer $composer, final int $changed, final int $changed1, final int r57) {
        Composer $composer2 = $composer.startRestartGroup(289640444);
        ComposerKt.sourceInformation($composer2, "C(DecorationBox)P(16,4,3,12,17,5,6,7,9,8,15,10,13,14,11!1,2)256@13034L5,257@13075L8,264@13325L428,277@13770L707:TextFieldDefaults.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r57 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        String r7 = value;
    L14:
        if ((r57 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L25:
        if ((r57 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        boolean r13 = enabled;
    L35:
        int r17 = 2048;
        if ((r57 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r8 = singleLine;
    L46:
        int r19 = 8192;
        if ((r57 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L58:
        if ((r57 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        InteractionSource r11 = interactionSource;
    L68:
        int r24 = r57 & 64;
        if (r24 == 0) goto L72;
        $dirty = $dirty | 1572864;
        boolean isError2 = isError;
    L79:
        int r14 = r57 & 128;
        if (r14 == 0) goto L83;
        $dirty = $dirty | 12582912;
        Function2<? super Composer, ? super Integer, Unit> r15 = r43;
    L90:
        int r0 = r57 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r1 = r57 & 512;
        if (r1 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r2 = r57 & 1024;
        if (r2 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r3 = r57 & 2048;
        if (r3 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r4 = r57 & 4096;
        if (r4 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r21 = r4;
    L145:
        int r5 = r57 & 8192;
        if (r5 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r25 = r5;
    L157:
        if (($changed1 & 24576) != 0) goto L167;
        if ((r57 & 16384) != 0) goto L164;
        if ($composer2.changed(shape) == false) goto L164;
        r19 = 16384;
    L164:
        $dirty1 = $dirty1 | r19;
    L167:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L178;
        if ((r57 & 32768) != 0) goto L174;
        if ($composer2.changed(colors) == false) goto L174;
        int r18 = 131072;
    L175:
        $dirty1 = $dirty1 | r18;
    L174:
        r18 = 65536;
    L178:
        if (($changed1 & 1572864) != 0) goto L188;
        if ((r57 & 65536) != 0) goto L185;
        if ($composer2.changed(contentPadding) == false) goto L185;
        int r110 = 1048576;
    L186:
        $dirty1 = $dirty1 | r110;
    L185:
        r110 = 524288;
    L188:
        int r111 = r57 & 131072;
        if (r111 == 0) goto L192;
        $dirty1 = $dirty1 | 12582912;
    L200:
        if ((r57 & 262144) == 0) goto L203;
        $dirty1 = $dirty1 | 100663296;
    L210:
        if (($dirty & 306783379) == 306783378) goto L212;
    L217:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L220;
    L232:
        if (r24 == 0) goto L234;
        isError2 = false;
    L234:
        if (r14 == 0) goto L236;
        r15 = null;
    L236:
        if (r0 == 0) goto L238;
        Function2<? super Composer, ? super Integer, Unit> r6 = null;
    L239:
        if (r1 == 0) goto L241;
        Function2<? super Composer, ? super Integer, Unit> r16 = null;
    L242:
        if (r2 == 0) goto L244;
        Function2<? super Composer, ? super Integer, Unit> r112 = null;
    L245:
        if (r3 == 0) goto L247;
        Function2<? super Composer, ? super Integer, Unit> r113 = null;
    L248:
        if (r21 == 0) goto L250;
        Function2<? super Composer, ? super Integer, Unit> r114 = null;
    L251:
        if (r25 == 0) goto L253;
        Function2<? super Composer, ? super Integer, Unit> r20 = null;
    L255:
        if ((r57 & 16384) == 0) goto L257;
        Shape shape2 = INSTANCE.getShape($composer2, 6);
        $dirty1 = $dirty1 & (-57345);
    L259:
        if ((32768 & r57) == 0) goto L261;
        TextFieldColors colors2 = colors($composer2, ($dirty1 >> 24) & 14);
        $dirty1 = $dirty1 & (-458753);
    L263:
        if ((r57 & 65536) == 0) goto L268;
        if (r15 != null) goto L266;
        PaddingValues contentPadding2 = m2792contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    L267:
        $dirty1 = $dirty1 & (-3670017);
    L269:
        if (r111 == 0) goto L271;
        final TextFieldColors colors3 = colors2;
        final Shape shape3 = shape2;
        final InteractionSource r410 = r11;
        final boolean isError3 = isError2;
        final boolean r411 = r13;
        PaddingValues contentPadding3 = contentPadding2;
        Function2<? super Composer, ? super Integer, Unit> r9 = r112;
        boolean isError4 = isError2;
        final Function2<? super Composer, ? super Integer, Unit> r12 = r9;
        Function2<? super Composer, ? super Integer, Unit> r22 = ComposableLambdaKt.rememberComposableLambda(-435523791, true, new C05681(r411, isError3, r410, colors3, shape3), $composer2, 54);
        int $dirty2 = $dirty1;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r15;
        final Function2<? super Composer, ? super Integer, Unit> r115 = r113;
        final Function2<? super Composer, ? super Integer, Unit> r116 = r20;
        final Function2<? super Composer, ? super Integer, Unit> r117 = r6;
        PaddingValues contentPadding4 = contentPadding3;
        Shape shape4 = shape3;
        TextFieldColors colors4 = colors3;
        final Function2<? super Composer, ? super Integer, Unit> r118 = r16;
        final Function2<? super Composer, ? super Integer, Unit> r119 = r114;
    L272:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L275;
        ComposerKt.traceEventStart(289640444, $dirty, $dirty2, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:276)");
    L275:
        Shape shape5 = shape4;
        Composer $composer3 = $composer2;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, r7, r37, visualTransformation, r10, r117, r118, r12, r115, r119, r116, r8, enabled, isError4, interactionSource, contentPadding4, colors4, r22, $composer3, ((((((((($dirty << 3) & 896) | ((($dirty << 3) & 112) | 6)) | (($dirty >> 3) & 7168)) | (($dirty >> 9) & 57344)) | (($dirty >> 9) & 458752)) | (($dirty >> 9) & 3670016)) | (($dirty2 << 21) & 29360128)) | (($dirty2 << 21) & 234881024)) | (($dirty2 << 21) & 1879048192), (((((((($dirty2 >> 9) & 14) | (($dirty >> 6) & 112)) | ($dirty & 896)) | (($dirty >> 9) & 7168)) | (($dirty >> 3) & 57344)) | (($dirty2 >> 3) & 458752)) | (($dirty2 << 3) & 3670016)) | (29360128 & $dirty2), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L278;
        ComposerKt.traceEventEnd();
    L278:
        final Shape shape6 = shape5;
        final boolean isError5 = isError4;
        final PaddingValues contentPadding5 = contentPadding4;
        final TextFieldColors colors5 = colors4;
        final Function2<? super Composer, ? super Integer, Unit> r120 = r22;
    L279:
        ScopeUpdateScope r23 = $composer3.endRestartGroup();
        if (r23 == null) goto L283;
        r23.updateScope(new AnonymousClass2(this, value, r37, enabled, singleLine, visualTransformation, interactionSource, isError5, r10, r117, r118, r12, r115, r119, r116, shape6, colors5, contentPadding5, r120, $changed, $changed1, r57));
        return;
    L283:
        return;
    L271:
        TextFieldColors colors6 = colors2;
        PaddingValues contentPadding6 = contentPadding2;
        Function2<? super Composer, ? super Integer, Unit> r26 = r112;
        isError4 = isError2;
        r12 = r26;
        shape4 = shape2;
        r22 = r53;
        $dirty2 = $dirty1;
        r10 = r15;
        r115 = r113;
        r116 = r20;
        r117 = r6;
        contentPadding4 = contentPadding6;
        colors4 = colors6;
        r118 = r16;
        r119 = r114;
        goto L272
    L266:
        contentPadding2 = m2791contentPaddingWithLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        goto L267
    L268:
        contentPadding2 = contentPadding;
        goto L269
    L261:
        colors2 = colors;
        goto L263
    L257:
        shape2 = shape;
        goto L259
    L253:
        r20 = r49;
        goto L255
    L250:
        r114 = r48;
        goto L251
    L247:
        r113 = r47;
        goto L248
    L244:
        r112 = r46;
        goto L245
    L241:
        r16 = r45;
        goto L242
    L238:
        r6 = r44;
        goto L239
    L220:
        if ($composer2.getDefaultsInvalid() == true) goto L232;
        $composer2.skipToGroupEnd();
        if ((r57 & 16384) == 0) goto L226;
        $dirty1 = $dirty1 & (-57345);
    L226:
        if ((32768 & r57) == 0) goto L229;
        $dirty1 = $dirty1 & (-458753);
    L229:
        if ((r57 & 65536) == 0) goto L231;
        r117 = r44;
        r118 = r45;
        r115 = r47;
        r119 = r48;
        colors4 = colors;
        contentPadding4 = contentPadding;
        r22 = r53;
        $dirty2 = (-3670017) & $dirty1;
        isError4 = isError2;
        r10 = r15;
        r12 = r46;
        r116 = r49;
        shape4 = shape;
        goto L272
    L231:
        r117 = r44;
        r118 = r45;
        r115 = r47;
        r119 = r48;
        shape4 = shape;
        colors4 = colors;
        contentPadding4 = contentPadding;
        r22 = r53;
        $dirty2 = $dirty1;
        isError4 = isError2;
        r10 = r15;
        r12 = r46;
        r116 = r49;
        goto L272
    L212:
        if ((38347923 & $dirty1) != 38347922) goto L217;
        if ($composer2.getSkipping() == false) goto L217;
        $composer2.skipToGroupEnd();
        r117 = r44;
        r118 = r45;
        r115 = r47;
        r119 = r48;
        shape6 = shape;
        colors5 = colors;
        contentPadding5 = contentPadding;
        r120 = r53;
        $composer3 = $composer2;
        isError5 = isError2;
        r10 = r15;
        r12 = r46;
        r116 = r49;
        goto L279
    L203:
        if (($changed1 & 100663296) != 0) goto L210;
        if ($composer2.changed(this) == false) goto L207;
        int r121 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L208:
        $dirty1 = $dirty1 | r121;
        goto L210
    L207:
        r121 = 33554432;
        goto L208
    L192:
        if (($changed1 & 12582912) != 0) goto L200;
        if ($composer2.changedInstance(r53) == false) goto L196;
        int r122 = 8388608;
    L197:
        $dirty1 = $dirty1 | r122;
        goto L200
    L196:
        r122 = 4194304;
        goto L197
    L148:
        r25 = r5;
        if (($changed1 & 3072) != 0) goto L157;
        if ($composer2.changedInstance(r49) == true) goto L154;
        r17 = 1024;
    L154:
        $dirty1 = $dirty1 | r17;
        goto L157
    L137:
        r21 = r4;
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changedInstance(r48) == false) goto L142;
        int r27 = 256;
    L143:
        $dirty1 = $dirty1 | r27;
        goto L145
    L142:
        r27 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changedInstance(r47) == false) goto L131;
        int r28 = 32;
    L132:
        $dirty1 = $dirty1 | r28;
        goto L134
    L131:
        r28 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changedInstance(r46) == false) goto L120;
        int r123 = 4;
    L121:
        $dirty1 = $dirty1 | r123;
        goto L123
    L120:
        r123 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r45) == false) goto L109;
        int r32 = 536870912;
    L110:
        $dirty = $dirty | r32;
        goto L112
    L109:
        r32 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r44) == false) goto L98;
        int r31 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r31;
        goto L101
    L98:
        r31 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r15 = r43;
        if ($composer2.changedInstance(r15) == false) goto L87;
        int r29 = 8388608;
    L88:
        $dirty = $dirty | r29;
        goto L90
    L87:
        r29 = 4194304;
        goto L88
    L89:
        r15 = r43;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        isError2 = isError;
        if ($composer2.changed(isError2) == false) goto L76;
        int r210 = 1048576;
    L77:
        $dirty = $dirty | r210;
        goto L79
    L76:
        r210 = 524288;
        goto L77
    L78:
        isError2 = isError;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r11 = interactionSource;
        if ($composer2.changed(r11) == false) goto L65;
        int r211 = 131072;
    L66:
        $dirty = $dirty | r211;
        goto L68
    L65:
        r211 = 65536;
        goto L66
    L67:
        r11 = interactionSource;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L58;
        if ($composer2.changed(visualTransformation) == false) goto L54;
        int r212 = 16384;
    L55:
        $dirty = $dirty | r212;
        goto L58
    L54:
        r212 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = singleLine;
        if ($composer2.changed(r8) == false) goto L43;
        int r124 = 2048;
    L44:
        $dirty = $dirty | r124;
        goto L46
    L43:
        r124 = 1024;
        goto L44
    L45:
        r8 = singleLine;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r13 = enabled;
        if ($composer2.changed(r13) == false) goto L32;
        int r125 = 256;
    L33:
        $dirty = $dirty | r125;
        goto L35
    L32:
        r125 = 128;
        goto L33
    L34:
        r13 = enabled;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L25;
        if ($composer2.changedInstance(r37) == false) goto L21;
        int r126 = 32;
    L22:
        $dirty = $dirty | r126;
        goto L25
    L21:
        r126 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r7 = value;
        if ($composer2.changed(r7) == false) goto L10;
        int r127 = 4;
    L11:
        $dirty = $dirty | r127;
        goto L14
    L10:
        r127 = 2;
        goto L11
    L12:
        r7 = value;
        goto L14
    }

    /* JADX INFO: renamed from: contentPaddingWithLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2791contentPaddingWithLabela9UjIt4$default(TextFieldDefaults r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = TextFieldImplKt.getTextFieldPadding();
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = TextFieldImplKt.getTextFieldPadding();
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
    L15:
        return r0.m2802contentPaddingWithLabela9UjIt4(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: contentPaddingWithLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2802contentPaddingWithLabela9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m721PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* JADX INFO: renamed from: contentPaddingWithoutLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2792contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = TextFieldImplKt.getTextFieldPadding();
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = TextFieldImplKt.getTextFieldPadding();
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = TextFieldImplKt.getTextFieldPadding();
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = TextFieldImplKt.getTextFieldPadding();
    L15:
        return r0.m2803contentPaddingWithoutLabela9UjIt4(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: contentPaddingWithoutLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2803contentPaddingWithoutLabela9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m721PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* JADX INFO: renamed from: supportingTextPadding-a9UjIt4$material3_release$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2797supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = TextFieldImplKt.getTextFieldPadding();
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = TextFieldImplKt.getSupportingTopPadding();
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = TextFieldImplKt.getTextFieldPadding();
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = Dp.m6973constructorimpl(0);
    L15:
        return r0.m2812supportingTextPaddinga9UjIt4$material3_release(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: supportingTextPadding-a9UjIt4$material3_release, reason: not valid java name */
    public final PaddingValues m2812supportingTextPaddinga9UjIt4$material3_release(float start, float top, float end, float bottom) {
        return PaddingKt.m721PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    public final TextFieldColors colors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 831731228, "C(colors)336@16080L11,336@16092L22:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(831731228, $changed, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:336)");
    L5:
        TextFieldColors r0 = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme($composer, 6), $composer, ($changed << 3) & 112);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m2801colors0hiis_0(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, TextSelectionColors selectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor, Composer $composer, int $changed, int $changed1, int $changed2, int $changed3, int $changed4, int r184, int r185) {
        ComposerKt.sourceInformationMarkerStart($composer, 1513344955, "C(colors)P(30:c#ui.graphics.Color,41:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,22:c#ui.graphics.Color,33:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,0:c#ui.graphics.Color,12:c#ui.graphics.Color,32,23:c#ui.graphics.Color,34:c#ui.graphics.Color,2:c#ui.graphics.Color,13:c#ui.graphics.Color,25:c#ui.graphics.Color,36:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,31:c#ui.graphics.Color,42:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,24:c#ui.graphics.Color,35:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,26:c#ui.graphics.Color,37:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,29:c#ui.graphics.Color,40:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,38:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,28:c#ui.graphics.Color,39:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)438@22922L11,438@22934L22:TextFieldDefaults.kt#uh7d8r");
        if ((r184 & 1) == 0) goto L5;
        long focusedTextColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r184 & 2) == 0) goto L9;
        long unfocusedTextColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r184 & 4) == 0) goto L13;
        long disabledTextColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r184 & 8) == 0) goto L17;
        long errorTextColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r184 & 16) == 0) goto L21;
        long focusedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r184 & 32) == 0) goto L25;
        long unfocusedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if ((r184 & 64) == 0) goto L29;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L31:
        if ((r184 & 128) == 0) goto L33;
        long errorContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L35:
        if ((r184 & 256) == 0) goto L37;
        long cursorColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L39:
        if ((r184 & 512) == 0) goto L41;
        long errorCursorColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L43:
        if ((r184 & 1024) == 0) goto L45;
        TextSelectionColors selectionColors2 = null;
    L47:
        if ((r184 & 2048) == 0) goto L49;
        long focusedIndicatorColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r184 & 4096) == 0) goto L53;
        long unfocusedIndicatorColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L55:
        if ((r184 & 8192) == 0) goto L57;
        long disabledIndicatorColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L59:
        if ((r184 & 16384) == 0) goto L61;
        long errorIndicatorColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L63:
        if ((32768 & r184) == 0) goto L65;
        long focusedLeadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L67:
        if ((65536 & r184) == 0) goto L69;
        long unfocusedLeadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L71:
        if ((131072 & r184) == 0) goto L73;
        long disabledLeadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L75:
        if ((262144 & r184) == 0) goto L77;
        long errorLeadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L79:
        if ((524288 & r184) == 0) goto L81;
        long focusedTrailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L83:
        if ((1048576 & r184) == 0) goto L85;
        long unfocusedTrailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L87:
        if ((2097152 & r184) == 0) goto L89;
        long disabledTrailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L91:
        if ((4194304 & r184) == 0) goto L93;
        long errorTrailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L95:
        if ((8388608 & r184) == 0) goto L97;
        long focusedLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L99:
        if ((16777216 & r184) == 0) goto L101;
        long unfocusedLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L103:
        if ((33554432 & r184) == 0) goto L105;
        long disabledLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L107:
        if ((67108864 & r184) == 0) goto L109;
        long errorLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L111:
        if ((134217728 & r184) == 0) goto L113;
        long focusedPlaceholderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L115:
        if ((268435456 & r184) == 0) goto L117;
        long unfocusedPlaceholderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L119:
        if ((536870912 & r184) == 0) goto L121;
        long disabledPlaceholderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L123:
        if ((r184 & 1073741824) == 0) goto L125;
        long errorPlaceholderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L127:
        if ((r185 & 1) == 0) goto L129;
        long focusedSupportingTextColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L131:
        if ((r185 & 2) == 0) goto L133;
        long unfocusedSupportingTextColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L135:
        if ((r185 & 4) == 0) goto L137;
        long disabledSupportingTextColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L139:
        if ((r185 & 8) == 0) goto L141;
        long errorSupportingTextColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L143:
        if ((r185 & 16) == 0) goto L145;
        long focusedPrefixColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L147:
        if ((r185 & 32) == 0) goto L149;
        long unfocusedPrefixColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L151:
        if ((r185 & 64) == 0) goto L153;
        long disabledPrefixColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L155:
        if ((r185 & 128) == 0) goto L157;
        long errorPrefixColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L159:
        if ((r185 & 256) == 0) goto L161;
        long focusedSuffixColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L163:
        if ((r185 & 512) == 0) goto L165;
        long unfocusedSuffixColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L167:
        if ((r185 & 1024) == 0) goto L169;
        long disabledSuffixColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L171:
        if ((r185 & 2048) == 0) goto L173;
        long errorSuffixColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L175:
        if (ComposerKt.isTraceInProgress() == false) goto L178;
        ComposerKt.traceEventStart(1513344955, $changed, $changed1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:438)");
    L178:
        TextFieldColors r1 = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme($composer, 6), $composer, ($changed4 >> 6) & 112).m2738copyejIjP34(focusedTextColor2, unfocusedTextColor2, disabledTextColor2, errorTextColor2, focusedContainerColor2, unfocusedContainerColor2, disabledContainerColor2, errorContainerColor2, cursorColor2, errorCursorColor2, selectionColors2, focusedIndicatorColor2, unfocusedIndicatorColor2, disabledIndicatorColor2, errorIndicatorColor2, focusedLeadingIconColor2, unfocusedLeadingIconColor2, disabledLeadingIconColor2, errorLeadingIconColor2, focusedTrailingIconColor2, unfocusedTrailingIconColor2, disabledTrailingIconColor2, errorTrailingIconColor2, focusedLabelColor2, unfocusedLabelColor2, disabledLabelColor2, errorLabelColor2, focusedPlaceholderColor2, unfocusedPlaceholderColor2, disabledPlaceholderColor2, errorPlaceholderColor2, focusedSupportingTextColor2, unfocusedSupportingTextColor2, disabledSupportingTextColor2, errorSupportingTextColor2, focusedPrefixColor2, unfocusedPrefixColor2, disabledPrefixColor2, errorPrefixColor2, focusedSuffixColor2, unfocusedSuffixColor2, disabledSuffixColor2, errorSuffixColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L181;
        ComposerKt.traceEventEnd();
    L181:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L173:
        errorSuffixColor2 = errorSuffixColor;
        goto L175
    L169:
        disabledSuffixColor2 = disabledSuffixColor;
        goto L171
    L165:
        unfocusedSuffixColor2 = unfocusedSuffixColor;
        goto L167
    L161:
        focusedSuffixColor2 = focusedSuffixColor;
        goto L163
    L157:
        errorPrefixColor2 = errorPrefixColor;
        goto L159
    L153:
        disabledPrefixColor2 = disabledPrefixColor;
        goto L155
    L149:
        unfocusedPrefixColor2 = unfocusedPrefixColor;
        goto L151
    L145:
        focusedPrefixColor2 = focusedPrefixColor;
        goto L147
    L141:
        errorSupportingTextColor2 = errorSupportingTextColor;
        goto L143
    L137:
        disabledSupportingTextColor2 = disabledSupportingTextColor;
        goto L139
    L133:
        unfocusedSupportingTextColor2 = unfocusedSupportingTextColor;
        goto L135
    L129:
        focusedSupportingTextColor2 = focusedSupportingTextColor;
        goto L131
    L125:
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
        errorIndicatorColor2 = errorIndicatorColor;
        goto L63
    L57:
        disabledIndicatorColor2 = disabledIndicatorColor;
        goto L59
    L53:
        unfocusedIndicatorColor2 = unfocusedIndicatorColor;
        goto L55
    L49:
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

    public final TextFieldColors getDefaultTextFieldColors(ColorScheme $this$defaultTextFieldColors, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1341970309, "C:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(1341970309, $changed, -1, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:486)");
    L6:
        TextFieldColors it = $this$defaultTextFieldColors.getDefaultTextFieldColorsCached$material3_release();
        $composer.startReplaceGroup(27085453);
        ComposerKt.sourceInformation($composer, "*501@26788L7");
        if (it != null) goto L9;
        long r7 = ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getFocusInputColor());
        long r9 = ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getInputColor());
        long r11 = Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getDisabledInputColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long r13 = ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getErrorInputColor());
        long r15 = ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getContainerColor());
        long r17 = ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getContainerColor());
        long r19 = ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getContainerColor());
        long r21 = ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getContainerColor());
        long r23 = ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getCaretColor());
        long r25 = ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor());
        ProvidableCompositionLocal<TextSelectionColors> r2 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        it = new TextFieldColors(r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, (TextSelectionColors) r3, ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor()), FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getLabelColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getDisabledLabelColor()), FilledTextFieldTokens.INSTANCE.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getDisabledInputColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getSupportingColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor()), FilledTextFieldTokens.INSTANCE.getDisabledSupportingOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultTextFieldColors, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
        $this$defaultTextFieldColors.setDefaultTextFieldColorsCached$material3_release(it);
    L9:
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return it;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to TextFieldDefaults.Container", replaceWith = @ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n)", imports = {}))
    public final void ContainerBox(final boolean enabled, final boolean isError, final InteractionSource interactionSource, final TextFieldColors colors, Shape shape, Composer $composer, final int $changed, final int r28) {
        Composer $composer2 = $composer.startRestartGroup(918564008);
        ComposerKt.sourceInformation($composer2, "C(ContainerBox)P(1,3,2)590@32311L5,592@32334L368:TextFieldDefaults.kt#uh7d8r");
        int $dirty = $changed;
        if ((r28 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r9 = enabled;
    L14:
        if ((r28 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        boolean r10 = isError;
    L25:
        if ((r28 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        InteractionSource r11 = interactionSource;
    L36:
        if ((r28 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
        TextFieldColors r13 = colors;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Shape shape2 = shape;
    L58:
        if ((r28 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        TextFieldDefaults r8 = this;
    L69:
        if ((74899 & $dirty) == 74898) goto L71;
    L74:
        $composer2.startDefaults();
        if (($changed & 1) == 0) goto L83;
        if ($composer2.getDefaultsInvalid() == true) goto L83;
        $composer2.skipToGroupEnd();
        if ((r28 & 16) == 0) goto L85;
        $dirty = $dirty & (-57345);
        Shape shape3 = shape2;
    L86:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L89;
        ComposerKt.traceEventStart(918564008, $dirty, -1, "androidx.compose.material3.TextFieldDefaults.ContainerBox (TextFieldDefaults.kt:592)");
    L89:
        Composer $composer3 = $composer2;
        r8.m2800Container4EFweAY(r9, r10, r11, Modifier.Companion, r13, shape3, FocusedIndicatorThickness, UnfocusedIndicatorThickness, $composer3, (((((($dirty & 14) | 3072) | ($dirty & 112)) | ($dirty & 896)) | (($dirty << 3) & 57344)) | (458752 & ($dirty << 3))) | (($dirty << 9) & 234881024), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L92;
        ComposerKt.traceEventEnd();
    L92:
        final Shape shape4 = shape3;
    L93:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L97;
        r12.updateScope(new AnonymousClass1(this, enabled, isError, interactionSource, colors, shape4, $changed, r28));
        return;
    L97:
        return;
    L85:
        shape3 = shape2;
    L83:
        if ((r28 & 16) == 0) goto L85;
        $dirty = $dirty & (-57345);
        shape3 = INSTANCE.getShape($composer2, 6);
        goto L86
    L71:
        if ($composer2.getSkipping() == false) goto L74;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        shape4 = shape2;
        goto L93
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r8 = this;
        if ($composer2.changed(r8) == false) goto L65;
        int r4 = 131072;
    L66:
        $dirty = $dirty | r4;
        goto L69
    L65:
        r4 = 65536;
        goto L66
    L67:
        r8 = this;
        goto L69
    L49:
        if ((r28 & 16) != 0) goto L53;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L54;
        int r5 = 16384;
    L55:
        $dirty = $dirty | r5;
    L54:
        r5 = 8192;
        goto L55
    L53:
        shape2 = shape;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        r13 = colors;
        if ($composer2.changed(r13) == false) goto L43;
        int r3 = 2048;
    L44:
        $dirty = $dirty | r3;
        goto L47
    L43:
        r3 = 1024;
        goto L44
    L45:
        r13 = colors;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        r11 = interactionSource;
        if ($composer2.changed(r11) == false) goto L32;
        int r6 = 256;
    L33:
        $dirty = $dirty | r6;
        goto L36
    L32:
        r6 = 128;
        goto L33
    L34:
        r11 = interactionSource;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r10 = isError;
        if ($composer2.changed(r10) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L25
    L21:
        r7 = 16;
        goto L22
    L23:
        r10 = isError;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = enabled;
        if ($composer2.changed(r9) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L14
    L10:
        r14 = 2;
        goto L11
    L12:
        r9 = enabled;
        goto L14
    }

    public final Shape getOutlinedShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -584749279, "C613@33100L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-584749279, $changed, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:613)");
    L5:
        Shape r0 = OutlinedTextFieldDefaults.INSTANCE.getShape($composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getFilledShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 611926497, "C621@33346L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(611926497, $changed, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:621)");
    L5:
        Shape r0 = getShape($composer, $changed & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2808getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2804getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2798textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = TextFieldImplKt.getTextFieldPadding();
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = TextFieldImplKt.getTextFieldPadding();
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
    L15:
        return r0.m2813textFieldWithLabelPaddinga9UjIt4(r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2813textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return m2802contentPaddingWithLabela9UjIt4(start, end, top, bottom);
    }

    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2799textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = TextFieldImplKt.getTextFieldPadding();
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = TextFieldImplKt.getTextFieldPadding();
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = TextFieldImplKt.getTextFieldPadding();
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = TextFieldImplKt.getTextFieldPadding();
    L15:
        return r0.m2814textFieldWithoutLabelPaddinga9UjIt4(r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2814textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return m2803contentPaddingWithoutLabela9UjIt4(start, top, end, bottom);
    }

    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2796outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = TextFieldImplKt.getTextFieldPadding();
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = TextFieldImplKt.getTextFieldPadding();
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = TextFieldImplKt.getTextFieldPadding();
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = TextFieldImplKt.getTextFieldPadding();
    L15:
        return r0.m2811outlinedTextFieldPaddinga9UjIt4(r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2811outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return OutlinedTextFieldDefaults.INSTANCE.m2471contentPaddinga9UjIt4(start, top, end, bottom);
    }
}
