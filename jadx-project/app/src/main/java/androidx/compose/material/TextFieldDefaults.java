package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%J×\u0001\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u00106Já\u0001\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u00107JÂ\u0001\u00108\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u000204H\u0007¢\u0006\u0002\u00109JÌ\u0001\u00108\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u000204H\u0007¢\u0006\u0002\u0010:Jä\u0001\u0010;\u001a\u00020 2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=2\b\b\u0002\u0010A\u001a\u00020=2\b\b\u0002\u0010B\u001a\u00020=2\b\b\u0002\u0010C\u001a\u00020=2\b\b\u0002\u0010D\u001a\u00020=2\b\b\u0002\u0010E\u001a\u00020=2\b\b\u0002\u0010F\u001a\u00020=2\b\b\u0002\u0010G\u001a\u00020=2\b\b\u0002\u0010H\u001a\u00020=2\b\b\u0002\u0010I\u001a\u00020=2\b\b\u0002\u0010J\u001a\u00020=2\b\b\u0002\u0010K\u001a\u00020=2\b\b\u0002\u0010L\u001a\u00020=2\b\b\u0002\u0010M\u001a\u00020=2\b\b\u0002\u0010N\u001a\u00020=2\b\b\u0002\u0010O\u001a\u00020=2\b\b\u0002\u0010P\u001a\u00020=2\b\b\u0002\u0010Q\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ:\u0010T\u001a\u0002042\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u00062\b\b\u0002\u0010W\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJä\u0001\u0010[\u001a\u00020 2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=2\b\b\u0002\u0010A\u001a\u00020=2\b\b\u0002\u0010\\\u001a\u00020=2\b\b\u0002\u0010]\u001a\u00020=2\b\b\u0002\u0010^\u001a\u00020=2\b\b\u0002\u0010_\u001a\u00020=2\b\b\u0002\u0010F\u001a\u00020=2\b\b\u0002\u0010G\u001a\u00020=2\b\b\u0002\u0010H\u001a\u00020=2\b\b\u0002\u0010I\u001a\u00020=2\b\b\u0002\u0010J\u001a\u00020=2\b\b\u0002\u0010K\u001a\u00020=2\b\b\u0002\u0010L\u001a\u00020=2\b\b\u0002\u0010M\u001a\u00020=2\b\b\u0002\u0010N\u001a\u00020=2\b\b\u0002\u0010O\u001a\u00020=2\b\b\u0002\u0010P\u001a\u00020=2\b\b\u0002\u0010Q\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\b`\u0010SJ:\u0010a\u001a\u0002042\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010W\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bb\u0010ZJ:\u0010c\u001a\u0002042\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u00062\b\b\u0002\u0010W\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bd\u0010ZJJ\u0010e\u001a\u00020f*\u00020f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010g\u001a\u00020\u00062\b\b\u0002\u0010h\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bi\u0010jR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\f\u0010\bR\u0019\u0010\r\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0015\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0016\u0010\bR\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "()V", "BackgroundOpacity", "", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "IconOpacity", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedTextFieldShape", "Landroidx/compose/ui/graphics/Shape;", "getOutlinedTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getTextFieldShape", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorLineOpacity", "BorderBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedTextFieldDecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", OutlinedTextFieldKt.BorderId, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "outlinedTextFieldColors", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "outlinedTextFieldPadding", "start", "top", "end", "bottom", "outlinedTextFieldPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-dx8h9Zs", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    private static final float FocusedBorderThickness = 0.0f;
    public static final TextFieldDefaults INSTANCE = null;
    public static final float IconOpacity = 0.54f;
    private static final float MinHeight = 0.0f;
    private static final float MinWidth = 0.0f;
    private static final float UnfocusedBorderThickness = 0.0f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;

    private TextFieldDefaults() {
    }

    static {
        INSTANCE = new TextFieldDefaults();
        MinHeight = Dp.m6973constructorimpl(56);
        MinWidth = Dp.m6973constructorimpl(280);
        UnfocusedBorderThickness = Dp.m6973constructorimpl(1);
        FocusedBorderThickness = Dp.m6973constructorimpl(2);
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1822getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1823getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final Shape getTextFieldShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1117199624, "C(<get-TextFieldShape>)220@8352L6:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1117199624, $changed, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:220)");
    L5:
        CornerBasedShape r0 = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes($composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getOutlinedTextFieldShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1899109048, "C(<get-OutlinedTextFieldShape>)227@8659L6:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1899109048, $changed, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:227)");
    L5:
        CornerBasedShape r0 = MaterialTheme.INSTANCE.getShapes($composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1824getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1821getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1816indicatorLinegv0btCI$default(TextFieldDefaults r8, Modifier r9, boolean r10, boolean r11, InteractionSource r12, TextFieldColors r13, float r14, float r15, int r16, Object r17) {
        if ((r16 & 16) == 0) goto L5;
        float r6 = FocusedBorderThickness;
    L7:
        if ((r16 & 32) == 0) goto L9;
        float r7 = UnfocusedBorderThickness;
    L11:
        return r8.m1825indicatorLinegv0btCI(r9, r10, r11, r12, r13, r6, r7);
    L9:
        r7 = r15;
        goto L11
    L5:
        r6 = r14;
        goto L7
    }

    /* JADX INFO: renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m1825indicatorLinegv0btCI(Modifier $this$indicatorLine_u2dgv0btCI, final boolean enabled, final boolean isError, final InteractionSource interactionSource, final TextFieldColors colors, final float focusedIndicatorLineThickness, final float unfocusedIndicatorLineThickness) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(enabled, isError, interactionSource, colors, focusedIndicatorLineThickness, unfocusedIndicatorLineThickness);
    L7:
        return ComposedModifierKt.composed($this$indicatorLine_u2dgv0btCI, r2, new TextFieldDefaults$indicatorLine$2(enabled, isError, interactionSource, colors, focusedIndicatorLineThickness, unfocusedIndicatorLineThickness));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    public final void m1820BorderBoxnbWgWpA(final boolean enabled, final boolean isError, final InteractionSource interactionSource, final TextFieldColors colors, Shape shape, float focusedBorderThickness, float unfocusedBorderThickness, Composer $composer, final int $changed, final int r29) {
        Composer $composer2 = $composer.startRestartGroup(943754022);
        ComposerKt.sourceInformation($composer2, "C(BorderBox)P(1,4,3!1,5,2:c#ui.unit.Dp,6:c#ui.unit.Dp)327@12851L231,335@13091L47:TextFieldDefaults.kt#jmzs0o");
        int $dirty = $changed;
        if ((r29 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r11 = enabled;
    L14:
        if ((r29 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        boolean r12 = isError;
    L25:
        if ((r29 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        InteractionSource r13 = interactionSource;
    L36:
        if ((r29 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
        TextFieldColors r5 = colors;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Shape shape2 = shape;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        float focusedBorderThickness2 = focusedBorderThickness;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        float r7 = unfocusedBorderThickness;
    L80:
        if ((r29 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        if ((4793491 & $dirty) == 4793490) goto L92;
        boolean r8 = true;
    L94:
        if ($composer2.shouldExecute(r8, $dirty & 1) == false) goto L127;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "322@12655L22");
        if (($changed & 1) == 0) goto L111;
        if ($composer2.getDefaultsInvalid() == true) goto L111;
        $composer2.skipToGroupEnd();
        if ((r29 & 16) == 0) goto L104;
        $dirty = $dirty & (-57345);
    L104:
        if ((r29 & 32) == 0) goto L107;
        $dirty = $dirty & (-458753);
    L107:
        if ((r29 & 64) == 0) goto L109;
        $dirty = $dirty & (-3670017);
        float focusedBorderThickness3 = focusedBorderThickness2;
        int r6 = 0;
        float unfocusedBorderThickness2 = r7;
    L120:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L123;
        ComposerKt.traceEventStart(943754022, $dirty, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:325)");
    L123:
        State borderStroke = TextFieldDefaultsKt.m1831access$animateBorderStrokeAsStateNuRrP5Q(r11, r12, r13, r5, focusedBorderThickness3, unfocusedBorderThickness2, $composer2, ((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (($dirty >> 3) & 57344)) | (458752 & ($dirty >> 3)));
        Composer $composer3 = $composer2;
        BoxKt.Box(BorderKt.border(Modifier.Companion, (BorderStroke) borderStroke.getValue(), shape2), $composer3, r6);
        if (ComposerKt.isTraceInProgress() == false) goto L126;
        ComposerKt.traceEventEnd();
    L126:
        final float focusedBorderThickness4 = focusedBorderThickness3;
        final float unfocusedBorderThickness3 = unfocusedBorderThickness2;
        final Shape shape3 = shape2;
    L128:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L132;
        r14.updateScope(new TextFieldDefaults$BorderBox$1(this, enabled, isError, interactionSource, colors, shape3, focusedBorderThickness4, unfocusedBorderThickness3, $changed, r29));
        return;
    L132:
        return;
    L109:
        focusedBorderThickness3 = focusedBorderThickness2;
        r6 = 0;
        unfocusedBorderThickness2 = r7;
    L111:
        if ((r29 & 16) == 0) goto L114;
        shape2 = getOutlinedTextFieldShape($composer2, ($dirty >> 21) & 14);
        $dirty = $dirty & (-57345);
    L114:
        if ((r29 & 32) == 0) goto L117;
        focusedBorderThickness2 = FocusedBorderThickness;
        $dirty = $dirty & (-458753);
    L117:
        if ((r29 & 64) == 0) goto L119;
        $dirty = $dirty & (-3670017);
        focusedBorderThickness3 = focusedBorderThickness2;
        r6 = 0;
        unfocusedBorderThickness2 = UnfocusedBorderThickness;
        goto L120
    L119:
        focusedBorderThickness3 = focusedBorderThickness2;
        r6 = 0;
        unfocusedBorderThickness2 = r7;
        goto L120
    L127:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        unfocusedBorderThickness3 = r7;
        focusedBorderThickness4 = focusedBorderThickness2;
        shape3 = shape2;
        goto L128
    L92:
        r8 = false;
        goto L94
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(this) == false) goto L87;
        int r9 = 8388608;
    L88:
        $dirty = $dirty | r9;
        goto L90
    L87:
        r9 = 4194304;
        goto L88
    L71:
        if ((r29 & 64) != 0) goto L75;
        r7 = unfocusedBorderThickness;
        if ($composer2.changed(r7) == false) goto L76;
        int r10 = 1048576;
    L77:
        $dirty = $dirty | r10;
    L76:
        r10 = 524288;
        goto L77
    L75:
        r7 = unfocusedBorderThickness;
        goto L76
    L60:
        if ((r29 & 32) != 0) goto L64;
        focusedBorderThickness2 = focusedBorderThickness;
        if ($composer2.changed(focusedBorderThickness2) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
    L65:
        r15 = 65536;
        goto L66
    L64:
        focusedBorderThickness2 = focusedBorderThickness;
        goto L65
    L49:
        if ((r29 & 16) != 0) goto L53;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
    L54:
        r16 = 8192;
        goto L55
    L53:
        shape2 = shape;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        r5 = colors;
        if ($composer2.changed(r5) == false) goto L43;
        int r4 = 2048;
    L44:
        $dirty = $dirty | r4;
        goto L47
    L43:
        r4 = 1024;
        goto L44
    L45:
        r5 = colors;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        r13 = interactionSource;
        if ($composer2.changed(r13) == false) goto L32;
        int r17 = 256;
    L33:
        $dirty = $dirty | r17;
        goto L36
    L32:
        r17 = 128;
        goto L33
    L34:
        r13 = interactionSource;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r12 = isError;
        if ($composer2.changed(r12) == false) goto L21;
        int r18 = 32;
    L22:
        $dirty = $dirty | r18;
        goto L25
    L21:
        r18 = 16;
        goto L22
    L23:
        r12 = isError;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r11 = enabled;
        if ($composer2.changed(r11) == false) goto L10;
        int r19 = 4;
    L11:
        $dirty = $dirty | r19;
        goto L14
    L10:
        r19 = 2;
        goto L11
    L12:
        r11 = enabled;
        goto L14
    }

    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1818textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = TextFieldImplKt.getTextFieldPadding();
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = TextFieldImplKt.getTextFieldPadding();
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = TextFieldKt.getFirstBaselineOffset();
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = TextFieldKt.getTextFieldBottomPadding();
    L15:
        return r0.m1829textFieldWithLabelPaddinga9UjIt4(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1829textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m721PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1819textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
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
        return r0.m1830textFieldWithoutLabelPaddinga9UjIt4(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1830textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m721PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1817outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
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
        return r0.m1827outlinedTextFieldPaddinga9UjIt4(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1827outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m721PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* JADX INFO: renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1828textFieldColorsdx8h9Zs(long textColor, long disabledTextColor, long backgroundColor, long cursorColor, long errorCursorColor, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long leadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long trailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long placeholderColor, long disabledPlaceholderColor, Composer $composer, int $changed, int $changed1, int $changed2, int r99) {
        ComposerKt.sourceInformationMarkerStart($composer, 231892599, "C(textFieldColors)P(17:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,19:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,15:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,18:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,20:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,16:c#ui.graphics.Color,5:c#ui.graphics.Color)385@15008L7,385@15039L7,386@15112L8,387@15170L6,388@15263L6,389@15327L6,390@15394L6,390@15435L4,392@15509L6,393@15661L8,394@15723L6,395@15785L6,396@15914L8,398@16031L6,399@16162L8,400@16227L6,401@16290L6,401@16331L4,402@16389L6,402@16424L6,403@16507L8,404@16565L6,405@16627L6,405@16662L6,406@16748L8:TextFieldDefaults.kt#jmzs0o");
        if ((r99 & 1) == 0) goto L5;
        ProvidableCompositionLocal<Color> r3 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r8 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long r9 = ((Color) r8).m4376unboximpl();
        ProvidableCompositionLocal<Float> r4 = ContentAlphaKt.getLocalContentAlpha();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long textColor2 = Color.m4365copywmQWz5c$default(r9, ((Number) r6).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
    L7:
        if ((r99 & 2) == 0) goto L9;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(textColor2, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r99 & 4) == 0) goto L13;
        long backgroundColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r99 & 8) == 0) goto L17;
        long cursorColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU();
    L19:
        if ((r99 & 16) == 0) goto L21;
        long errorCursorColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L23:
        if ((r99 & 32) == 0) goto L25;
        long focusedIndicatorColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L27:
        if ((r99 & 64) == 0) goto L29;
        long unfocusedIndicatorColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null);
    L31:
        if ((r99 & 128) == 0) goto L33;
        long unfocusedIndicatorColor3 = unfocusedIndicatorColor2;
        long unfocusedIndicatorColor4 = unfocusedIndicatorColor3;
        long disabledIndicatorColor2 = Color.m4365copywmQWz5c$default(unfocusedIndicatorColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L35:
        if ((r99 & 256) == 0) goto L37;
        long errorIndicatorColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L39:
        if ((r99 & 512) == 0) goto L41;
        long leadingIconColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L43:
        if ((r99 & 1024) == 0) goto L45;
        long leadingIconColor3 = leadingIconColor2;
        long leadingIconColor4 = Color.m4365copywmQWz5c$default(leadingIconColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long leadingIconColor5 = leadingIconColor3;
    L47:
        if ((r99 & 2048) == 0) goto L49;
        long errorLeadingIconColor2 = leadingIconColor5;
    L51:
        if ((r99 & 4096) == 0) goto L53;
        long trailingIconColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L55:
        if ((r99 & 8192) == 0) goto L57;
        long trailingIconColor3 = trailingIconColor2;
        long trailingIconColor4 = Color.m4365copywmQWz5c$default(trailingIconColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long trailingIconColor5 = trailingIconColor3;
    L59:
        if ((r99 & 16384) == 0) goto L61;
        long errorTrailingIconColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L63:
        if ((32768 & r99) == 0) goto L65;
        long focusedLabelColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L67:
        if ((65536 & r99) == 0) goto L69;
        long unfocusedLabelColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L71:
        if ((131072 & r99) == 0) goto L73;
        long unfocusedLabelColor3 = unfocusedLabelColor2;
        long unfocusedLabelColor4 = Color.m4365copywmQWz5c$default(unfocusedLabelColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long unfocusedLabelColor5 = unfocusedLabelColor3;
    L75:
        if ((262144 & r99) == 0) goto L77;
        long errorLabelColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L79:
        if ((524288 & r99) == 0) goto L81;
        long placeholderColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L83:
        if ((r99 & 1048576) == 0) goto L85;
        long placeholderColor3 = placeholderColor2;
        long disabledPlaceholderColor2 = Color.m4365copywmQWz5c$default(placeholderColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L87:
        if (ComposerKt.isTraceInProgress() == false) goto L90;
        ComposerKt.traceEventStart(231892599, $changed, $changed1, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:408)");
    L90:
        long unfocusedIndicatorColor5 = unfocusedIndicatorColor4;
        long unfocusedIndicatorColor6 = errorIndicatorColor2;
        DefaultTextFieldColors r5 = new DefaultTextFieldColors(textColor2, disabledTextColor2, cursorColor2, errorCursorColor2, focusedIndicatorColor2, unfocusedIndicatorColor5, unfocusedIndicatorColor6, disabledIndicatorColor2, leadingIconColor5, leadingIconColor4, errorLeadingIconColor2, trailingIconColor5, trailingIconColor4, errorTrailingIconColor2, backgroundColor2, focusedLabelColor2, unfocusedLabelColor5, unfocusedLabelColor4, errorLabelColor2, placeholderColor2, disabledPlaceholderColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L93;
        ComposerKt.traceEventEnd();
    L93:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L85:
        disabledPlaceholderColor2 = disabledPlaceholderColor;
        goto L87
    L81:
        placeholderColor2 = placeholderColor;
        goto L83
    L77:
        errorLabelColor2 = errorLabelColor;
        goto L79
    L73:
        unfocusedLabelColor5 = unfocusedLabelColor2;
        unfocusedLabelColor4 = disabledLabelColor;
        goto L75
    L69:
        unfocusedLabelColor2 = unfocusedLabelColor;
        goto L71
    L65:
        focusedLabelColor2 = focusedLabelColor;
        goto L67
    L61:
        errorTrailingIconColor2 = errorTrailingIconColor;
        goto L63
    L57:
        trailingIconColor5 = trailingIconColor2;
        trailingIconColor4 = disabledTrailingIconColor;
        goto L59
    L53:
        trailingIconColor2 = trailingIconColor;
        goto L55
    L49:
        errorLeadingIconColor2 = errorLeadingIconColor;
        goto L51
    L45:
        leadingIconColor5 = leadingIconColor2;
        leadingIconColor4 = disabledLeadingIconColor;
        goto L47
    L41:
        leadingIconColor2 = leadingIconColor;
        goto L43
    L37:
        errorIndicatorColor2 = errorIndicatorColor;
        goto L39
    L33:
        unfocusedIndicatorColor4 = unfocusedIndicatorColor2;
        disabledIndicatorColor2 = disabledIndicatorColor;
        goto L35
    L29:
        unfocusedIndicatorColor2 = unfocusedIndicatorColor;
        goto L31
    L25:
        focusedIndicatorColor2 = focusedIndicatorColor;
        goto L27
    L21:
        errorCursorColor2 = errorCursorColor;
        goto L23
    L17:
        cursorColor2 = cursorColor;
        goto L19
    L13:
        backgroundColor2 = backgroundColor;
        goto L15
    L9:
        disabledTextColor2 = disabledTextColor;
        goto L11
    L5:
        textColor2 = textColor;
        goto L7
    }

    /* JADX INFO: renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1826outlinedTextFieldColorsdx8h9Zs(long textColor, long disabledTextColor, long backgroundColor, long cursorColor, long errorCursorColor, long focusedBorderColor, long unfocusedBorderColor, long disabledBorderColor, long errorBorderColor, long leadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long trailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long placeholderColor, long disabledPlaceholderColor, Composer $composer, int $changed, int $changed1, int $changed2, int r99) {
        ComposerKt.sourceInformationMarkerStart($composer, 1762667317, "C(outlinedTextFieldColors)P(17:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,9:c#ui.graphics.Color,13:c#ui.graphics.Color,19:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.graphics.Color,15:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,18:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,20:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,16:c#ui.graphics.Color,5:c#ui.graphics.Color)439@18276L7,439@18307L7,440@18380L8,442@18486L6,443@18550L6,444@18614L6,444@18655L4,446@18726L6,446@18769L8,447@18864L8,448@18923L6,449@18985L6,450@19114L8,452@19231L6,453@19362L8,454@19427L6,455@19490L6,455@19531L4,456@19589L6,456@19624L6,457@19707L8,458@19765L6,459@19827L6,459@19862L6,460@19948L8:TextFieldDefaults.kt#jmzs0o");
        if ((r99 & 1) == 0) goto L5;
        ProvidableCompositionLocal<Color> r3 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r8 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long r9 = ((Color) r8).m4376unboximpl();
        ProvidableCompositionLocal<Float> r4 = ContentAlphaKt.getLocalContentAlpha();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long textColor2 = Color.m4365copywmQWz5c$default(r9, ((Number) r6).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
    L7:
        if ((r99 & 2) == 0) goto L9;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(textColor2, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r99 & 4) == 0) goto L13;
        long backgroundColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L15:
        if ((r99 & 8) == 0) goto L17;
        long cursorColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU();
    L19:
        if ((r99 & 16) == 0) goto L21;
        long errorCursorColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L23:
        if ((r99 & 32) == 0) goto L25;
        long focusedBorderColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L27:
        if ((r99 & 64) == 0) goto L29;
        long unfocusedBorderColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L31:
        if ((r99 & 128) == 0) goto L33;
        long unfocusedBorderColor3 = unfocusedBorderColor2;
        long unfocusedBorderColor4 = unfocusedBorderColor3;
        long disabledBorderColor2 = Color.m4365copywmQWz5c$default(unfocusedBorderColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L35:
        if ((r99 & 256) == 0) goto L37;
        long errorBorderColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L39:
        if ((r99 & 512) == 0) goto L41;
        long leadingIconColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L43:
        if ((r99 & 1024) == 0) goto L45;
        long leadingIconColor3 = leadingIconColor2;
        long leadingIconColor4 = Color.m4365copywmQWz5c$default(leadingIconColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long leadingIconColor5 = leadingIconColor3;
    L47:
        if ((r99 & 2048) == 0) goto L49;
        long errorLeadingIconColor2 = leadingIconColor5;
    L51:
        if ((r99 & 4096) == 0) goto L53;
        long trailingIconColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L55:
        if ((r99 & 8192) == 0) goto L57;
        long trailingIconColor3 = trailingIconColor2;
        long trailingIconColor4 = Color.m4365copywmQWz5c$default(trailingIconColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long trailingIconColor5 = trailingIconColor3;
    L59:
        if ((r99 & 16384) == 0) goto L61;
        long errorTrailingIconColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L63:
        if ((32768 & r99) == 0) goto L65;
        long focusedLabelColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L67:
        if ((65536 & r99) == 0) goto L69;
        long unfocusedLabelColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L71:
        if ((131072 & r99) == 0) goto L73;
        long unfocusedLabelColor3 = unfocusedLabelColor2;
        long unfocusedLabelColor4 = Color.m4365copywmQWz5c$default(unfocusedLabelColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long unfocusedLabelColor5 = unfocusedLabelColor3;
    L75:
        if ((262144 & r99) == 0) goto L77;
        long errorLabelColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L79:
        if ((524288 & r99) == 0) goto L81;
        long placeholderColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L83:
        if ((r99 & 1048576) == 0) goto L85;
        long placeholderColor3 = placeholderColor2;
        long disabledPlaceholderColor2 = Color.m4365copywmQWz5c$default(placeholderColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L87:
        if (ComposerKt.isTraceInProgress() == false) goto L90;
        ComposerKt.traceEventStart(1762667317, $changed, $changed1, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:462)");
    L90:
        long unfocusedBorderColor5 = unfocusedBorderColor4;
        long unfocusedBorderColor6 = errorBorderColor2;
        DefaultTextFieldColors r5 = new DefaultTextFieldColors(textColor2, disabledTextColor2, cursorColor2, errorCursorColor2, focusedBorderColor2, unfocusedBorderColor5, unfocusedBorderColor6, disabledBorderColor2, leadingIconColor5, leadingIconColor4, errorLeadingIconColor2, trailingIconColor5, trailingIconColor4, errorTrailingIconColor2, backgroundColor2, focusedLabelColor2, unfocusedLabelColor5, unfocusedLabelColor4, errorLabelColor2, placeholderColor2, disabledPlaceholderColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L93;
        ComposerKt.traceEventEnd();
    L93:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L85:
        disabledPlaceholderColor2 = disabledPlaceholderColor;
        goto L87
    L81:
        placeholderColor2 = placeholderColor;
        goto L83
    L77:
        errorLabelColor2 = errorLabelColor;
        goto L79
    L73:
        unfocusedLabelColor5 = unfocusedLabelColor2;
        unfocusedLabelColor4 = disabledLabelColor;
        goto L75
    L69:
        unfocusedLabelColor2 = unfocusedLabelColor;
        goto L71
    L65:
        focusedLabelColor2 = focusedLabelColor;
        goto L67
    L61:
        errorTrailingIconColor2 = errorTrailingIconColor;
        goto L63
    L57:
        trailingIconColor5 = trailingIconColor2;
        trailingIconColor4 = disabledTrailingIconColor;
        goto L59
    L53:
        trailingIconColor2 = trailingIconColor;
        goto L55
    L49:
        errorLeadingIconColor2 = errorLeadingIconColor;
        goto L51
    L45:
        leadingIconColor5 = leadingIconColor2;
        leadingIconColor4 = disabledLeadingIconColor;
        goto L47
    L41:
        leadingIconColor2 = leadingIconColor;
        goto L43
    L37:
        errorBorderColor2 = errorBorderColor;
        goto L39
    L33:
        unfocusedBorderColor4 = unfocusedBorderColor2;
        disabledBorderColor2 = disabledBorderColor;
        goto L35
    L29:
        unfocusedBorderColor2 = unfocusedBorderColor;
        goto L31
    L25:
        focusedBorderColor2 = focusedBorderColor;
        goto L27
    L21:
        errorCursorColor2 = errorCursorColor;
        goto L23
    L17:
        cursorColor2 = cursorColor;
        goto L19
    L13:
        backgroundColor2 = backgroundColor;
        goto L15
    L9:
        disabledTextColor2 = disabledTextColor;
        goto L11
    L5:
        textColor2 = textColor;
        goto L7
    }

    public final void TextFieldDecorationBox(final String value, final Function2<? super Composer, ? super Integer, Unit> r62, final boolean enabled, final boolean singleLine, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean isError, Function2<? super Composer, ? super Integer, Unit> r68, Function2<? super Composer, ? super Integer, Unit> r69, Function2<? super Composer, ? super Integer, Unit> r70, Function2<? super Composer, ? super Integer, Unit> r71, Shape shape, TextFieldColors colors, PaddingValues contentPadding, Composer $composer, final int $changed, final int $changed1, int r78) {
        int r3 = r78;
        Composer $composer2 = $composer.startRestartGroup(-1391531252);
        ComposerKt.sourceInformation($composer2, "C(TextFieldDecorationBox)P(12,3,2,10,13,4,5,6,8,7,11,9)566@26239L624:TextFieldDefaults.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r3 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r3 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r16 = 128;
        if ((r3 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L35:
        int r18 = 1024;
        if ((r3 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        int r21 = 16384;
        if ((r3 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L58:
        if ((r3 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        int r20 = r3 & 64;
        if (r20 == 0) goto L72;
        $dirty = $dirty | 1572864;
        boolean r10 = isError;
    L79:
        int r12 = r3 & 128;
        if (r12 == 0) goto L83;
        $dirty = $dirty | 12582912;
        Function2<? super Composer, ? super Integer, Unit> r13 = r68;
    L90:
        int r15 = r3 & 256;
        if (r15 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r0 = r3 & 512;
        if (r0 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r1 = r3 & 1024;
        if (r1 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L124:
        if (($changed1 & 48) != 0) goto L135;
        if ((r3 & 2048) != 0) goto L131;
        if ($composer2.changed(shape) == false) goto L131;
        int r24 = 32;
    L132:
        $dirty1 = $dirty1 | r24;
    L131:
        r24 = 16;
    L135:
        if (($changed1 & 384) != 0) goto L145;
        if ((r3 & 4096) != 0) goto L142;
        if ($composer2.changed(colors) == false) goto L142;
        r16 = 256;
    L142:
        $dirty1 = $dirty1 | r16;
    L145:
        if (($changed1 & 3072) != 0) goto L155;
        if ((r3 & 8192) != 0) goto L152;
        if ($composer2.changed(contentPadding) == false) goto L152;
        r18 = 2048;
    L152:
        $dirty1 = $dirty1 | r18;
    L155:
        if ((r3 & 16384) == 0) goto L158;
        $dirty1 = $dirty1 | 24576;
    L165:
        if ((306783379 & $dirty) == 306783378) goto L167;
    L170:
        boolean r2 = true;
    L172:
        if ($composer2.shouldExecute(r2, $dirty & 1) == false) goto L226;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "557@25955L14,558@26005L17");
        if (($changed & 1) != 0) goto L176;
    L188:
        if (r20 == 0) goto L190;
        boolean isError2 = false;
    L191:
        if (r12 == 0) goto L193;
        Function2<? super Composer, ? super Integer, Unit> r50 = null;
    L194:
        if (r15 == 0) goto L196;
        Function2<? super Composer, ? super Integer, Unit> r51 = null;
    L197:
        if (r0 == 0) goto L199;
        Function2<? super Composer, ? super Integer, Unit> r52 = null;
    L200:
        if (r1 == 0) goto L202;
        Function2<? super Composer, ? super Integer, Unit> r53 = null;
    L204:
        if ((r3 & 2048) == 0) goto L206;
        Shape shape2 = getTextFieldShape($composer2, ($dirty1 >> 12) & 14);
        $dirty1 = $dirty1 & (-113);
        Shape shape3 = shape2;
    L208:
        if ((r3 & 4096) == 0) goto L210;
        int $dirty2 = $dirty;
        TextFieldColors colors2 = m1828textFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 0, ($dirty1 >> 9) & 112, 2097151);
        Composer $composer3 = $composer2;
        $dirty1 = $dirty1 & (-897);
    L211:
        r3 = r78;
        if ((r3 & 8192) == 0) goto L217;
        if (r50 != null) goto L215;
        PaddingValues contentPadding2 = m1819textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    L216:
        boolean isError3 = isError2;
        PaddingValues contentPadding3 = contentPadding2;
        int $dirty3 = $dirty1 & (-7169);
        TextFieldColors colors3 = colors2;
        final Function2<? super Composer, ? super Integer, Unit> r9 = r50;
        final Function2<? super Composer, ? super Integer, Unit> r11 = r51;
        final Function2<? super Composer, ? super Integer, Unit> r14 = r52;
        final Function2<? super Composer, ? super Integer, Unit> r17 = r53;
        Shape shape4 = shape3;
    L218:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L221;
        int $dirty4 = $dirty2;
        ComposerKt.traceEventStart(-1391531252, $dirty4, $dirty3, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:565)");
    L222:
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, r62, visualTransformation, r9, r11, r14, r17, singleLine, enabled, isError3, interactionSource, contentPadding3, shape4, colors3, null, $composer3, (((((((((($dirty4 << 3) & 112) | 6) | (($dirty4 << 3) & 896)) | (($dirty4 >> 3) & 7168)) | (($dirty4 >> 9) & 57344)) | (($dirty4 >> 9) & 458752)) | (($dirty4 >> 9) & 3670016)) | (($dirty3 << 21) & 29360128)) | (($dirty4 << 15) & 234881024)) | (($dirty4 << 21) & 1879048192), (((((($dirty4 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | (($dirty4 >> 12) & 112)) | (($dirty3 >> 3) & 896)) | (($dirty3 << 6) & 7168)) | (($dirty3 << 6) & 57344));
        if (ComposerKt.isTraceInProgress() == false) goto L225;
        ComposerKt.traceEventEnd();
    L225:
        final boolean isError4 = isError3;
        final PaddingValues contentPadding4 = contentPadding3;
        final Shape shape5 = shape4;
        final TextFieldColors colors4 = colors3;
    L227:
        ScopeUpdateScope r4 = $composer3.endRestartGroup();
        if (r4 == null) goto L231;
        final int r19 = r3;
        r4.updateScope(new C04571(this, value, r62, enabled, singleLine, visualTransformation, interactionSource, isError4, r9, r11, r14, r17, shape5, colors4, contentPadding4, $changed, $changed1, r19));
        return;
    L231:
        return;
    L221:
        $dirty4 = $dirty2;
        goto L222
    L215:
        contentPadding2 = m1818textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        goto L216
    L217:
        contentPadding3 = contentPadding;
        isError3 = isError2;
        colors3 = colors2;
        $dirty3 = $dirty1;
        r9 = r50;
        r11 = r51;
        r14 = r52;
        r17 = r53;
        shape4 = shape3;
        goto L218
    L210:
        $composer3 = $composer2;
        $dirty2 = $dirty;
        colors2 = colors;
        goto L211
    L206:
        shape3 = shape;
        goto L208
    L202:
        r53 = r71;
        goto L204
    L199:
        r52 = r70;
        goto L200
    L196:
        r51 = r69;
        goto L197
    L193:
        r50 = r13;
        goto L194
    L190:
        isError2 = r10;
        goto L191
    L176:
        if ($composer2.getDefaultsInvalid() == true) goto L188;
        $composer2.skipToGroupEnd();
        if ((r3 & 2048) == 0) goto L182;
        $dirty1 = $dirty1 & (-113);
    L182:
        if ((r3 & 4096) == 0) goto L185;
        $dirty1 = $dirty1 & (-897);
    L185:
        if ((r3 & 8192) == 0) goto L187;
        $dirty3 = $dirty1 & (-7169);
        r14 = r70;
        r17 = r71;
        shape4 = shape;
        colors3 = colors;
        contentPadding3 = contentPadding;
        $composer3 = $composer2;
        $dirty2 = $dirty;
        isError3 = r10;
        r9 = r13;
        r11 = r69;
        goto L218
    L187:
        r14 = r70;
        r17 = r71;
        shape4 = shape;
        colors3 = colors;
        contentPadding3 = contentPadding;
        $composer3 = $composer2;
        $dirty2 = $dirty;
        $dirty3 = $dirty1;
        isError3 = r10;
        r9 = r13;
        r11 = r69;
        goto L218
    L226:
        $composer3 = $composer2;
        $dirty4 = $dirty;
        $composer3.skipToGroupEnd();
        r14 = r70;
        r17 = r71;
        colors4 = colors;
        contentPadding4 = contentPadding;
        isError4 = r10;
        r9 = r13;
        r11 = r69;
        shape5 = shape;
        goto L227
    L167:
        if (($dirty1 & 9363) != 9362) goto L170;
        r2 = false;
        goto L172
    L158:
        if (($changed1 & 24576) != 0) goto L165;
        if ($composer2.changed(this) == true) goto L163;
        r21 = 8192;
    L163:
        $dirty1 = $dirty1 | r21;
        goto L165
    L116:
        if (($changed1 & 6) != 0) goto L124;
        if ($composer2.changedInstance(r71) == false) goto L120;
        int r23 = 4;
    L121:
        $dirty1 = $dirty1 | r23;
        goto L124
    L120:
        r23 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r70) == false) goto L109;
        int r28 = 536870912;
    L110:
        $dirty = $dirty | r28;
        goto L112
    L109:
        r28 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r69) == false) goto L98;
        int r27 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r27;
        goto L101
    L98:
        r27 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r13 = r68;
        if ($composer2.changedInstance(r13) == false) goto L87;
        int r26 = 8388608;
    L88:
        $dirty = $dirty | r26;
        goto L90
    L87:
        r26 = 4194304;
        goto L88
    L89:
        r13 = r68;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r10 = isError;
        if ($composer2.changed(r10) == false) goto L76;
        int r25 = 1048576;
    L77:
        $dirty = $dirty | r25;
        goto L79
    L76:
        r25 = 524288;
        goto L77
    L78:
        r10 = isError;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changed(interactionSource) == false) goto L65;
        int r22 = 131072;
    L66:
        $dirty = $dirty | r22;
        goto L68
    L65:
        r22 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L58;
        if ($composer2.changed(visualTransformation) == false) goto L54;
        int r29 = 16384;
    L55:
        $dirty = $dirty | r29;
        goto L58
    L54:
        r29 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(singleLine) == false) goto L43;
        int r210 = 2048;
    L44:
        $dirty = $dirty | r210;
        goto L46
    L43:
        r210 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L35;
        if ($composer2.changed(enabled) == false) goto L32;
        int r110 = 256;
    L33:
        $dirty = $dirty | r110;
        goto L35
    L32:
        r110 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r62) == false) goto L21;
        int r111 = 32;
    L22:
        $dirty = $dirty | r111;
        goto L24
    L21:
        r111 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(value) == false) goto L10;
        int r112 = 4;
    L11:
        $dirty = $dirty | r112;
        goto L14
    L10:
        r112 = 2;
        goto L11
    }

    public final void OutlinedTextFieldDecorationBox(final String value, final Function2<? super Composer, ? super Integer, Unit> r63, final boolean enabled, final boolean singleLine, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean isError, Function2<? super Composer, ? super Integer, Unit> r69, Function2<? super Composer, ? super Integer, Unit> r70, Function2<? super Composer, ? super Integer, Unit> r71, Function2<? super Composer, ? super Integer, Unit> r72, Shape shape, TextFieldColors colors, PaddingValues contentPadding, Function2<? super Composer, ? super Integer, Unit> r76, Composer $composer, final int $changed, final int $changed1, int r80) {
        int r3 = r80;
        Composer $composer2 = $composer.startRestartGroup(-920823490);
        ComposerKt.sourceInformation($composer2, "C(OutlinedTextFieldDecorationBox)P(13,4,3,11,14,5,6,7,9,8,12,10,1,2)662@31811L628:TextFieldDefaults.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r3 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r3 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r16 = 128;
        if ((r3 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L35:
        int r18 = 1024;
        if ((r3 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        int r21 = 16384;
        if ((r3 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L58:
        if ((r3 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        int r20 = r3 & 64;
        if (r20 == 0) goto L72;
        $dirty = $dirty | 1572864;
        boolean r10 = isError;
    L79:
        int r12 = r3 & 128;
        if (r12 == 0) goto L83;
        $dirty = $dirty | 12582912;
        Function2<? super Composer, ? super Integer, Unit> r13 = r69;
    L90:
        int r15 = r3 & 256;
        if (r15 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r0 = r3 & 512;
        if (r0 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r1 = r3 & 1024;
        if (r1 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L124:
        if (($changed1 & 48) != 0) goto L135;
        if ((r3 & 2048) != 0) goto L131;
        if ($composer2.changed(shape) == false) goto L131;
        int r25 = 32;
    L132:
        $dirty1 = $dirty1 | r25;
    L131:
        r25 = 16;
    L135:
        if (($changed1 & 384) != 0) goto L145;
        if ((r3 & 4096) != 0) goto L142;
        if ($composer2.changed(colors) == false) goto L142;
        r16 = 256;
    L142:
        $dirty1 = $dirty1 | r16;
    L145:
        if (($changed1 & 3072) != 0) goto L154;
        if ((r3 & 8192) != 0) goto L152;
        if ($composer2.changed(contentPadding) == false) goto L152;
        r18 = 2048;
    L152:
        $dirty1 = $dirty1 | r18;
    L154:
        int r4 = r3 & 16384;
        if (r4 == 0) goto L158;
        $dirty1 = $dirty1 | 24576;
    L166:
        if ((r3 & 32768) == 0) goto L169;
        $dirty1 = $dirty1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L176:
        if (($dirty & 306783379) == 306783378) goto L178;
    L181:
        boolean r2 = true;
    L183:
        if ($composer2.shouldExecute(r2, $dirty & 1) == false) goto L237;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "655@31515L22,656@31573L25,658@31709L85");
        if (($changed & 1) != 0) goto L187;
    L199:
        if (r20 == 0) goto L201;
        boolean isError2 = false;
    L202:
        if (r12 == 0) goto L204;
        Function2<? super Composer, ? super Integer, Unit> r49 = null;
    L205:
        if (r15 == 0) goto L207;
        Function2<? super Composer, ? super Integer, Unit> r50 = null;
    L208:
        if (r0 == 0) goto L210;
        Function2<? super Composer, ? super Integer, Unit> r51 = null;
    L211:
        if (r1 == 0) goto L213;
        Function2<? super Composer, ? super Integer, Unit> r52 = null;
    L215:
        if ((r3 & 2048) == 0) goto L217;
        Shape shape2 = getOutlinedTextFieldShape($composer2, ($dirty1 >> 15) & 14);
        $dirty1 = $dirty1 & (-113);
        Shape shape3 = shape2;
    L219:
        if ((r3 & 4096) == 0) goto L221;
        int r58 = r4;
        int $dirty2 = $dirty;
        TextFieldColors colors2 = m1826outlinedTextFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 0, ($dirty1 >> 12) & 112, 2097151);
        Composer $composer3 = $composer2;
        $dirty1 = $dirty1 & (-897);
    L222:
        r3 = r80;
        if ((r3 & 8192) == 0) goto L225;
        PaddingValues contentPadding2 = m1817outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        $dirty1 = $dirty1 & (-7169);
    L226:
        if (r58 == 0) goto L228;
        final boolean isError3 = isError2;
        final TextFieldColors colors3 = colors2;
        final Shape shape4 = shape3;
        PaddingValues contentPadding3 = contentPadding2;
        Function2<? super Composer, ? super Integer, Unit> r22 = ComposableLambdaKt.rememberComposableLambda(2147252344, true, new AnonymousClass1(enabled, isError3, interactionSource, colors3, shape4), $composer3, 54);
        TextFieldColors colors4 = colors3;
        Shape shape5 = shape4;
        int $dirty3 = $dirty1;
        boolean isError4 = isError3;
        final Function2<? super Composer, ? super Integer, Unit> r9 = r49;
        final Function2<? super Composer, ? super Integer, Unit> r11 = r50;
        final Function2<? super Composer, ? super Integer, Unit> r14 = r51;
        final Function2<? super Composer, ? super Integer, Unit> r17 = r52;
    L229:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L232;
        int $dirty4 = $dirty2;
        ComposerKt.traceEventStart(-920823490, $dirty4, $dirty3, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:661)");
    L233:
        Composer $composer4 = $composer3;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, r63, visualTransformation, r9, r11, r14, r17, singleLine, enabled, isError4, interactionSource, contentPadding3, shape5, colors4, r22, $composer4, (((((((((($dirty4 << 3) & 112) | 6) | (($dirty4 << 3) & 896)) | (($dirty4 >> 3) & 7168)) | (($dirty4 >> 9) & 57344)) | (($dirty4 >> 9) & 458752)) | (3670016 & ($dirty4 >> 9))) | (($dirty3 << 21) & 29360128)) | (($dirty4 << 15) & 234881024)) | (($dirty4 << 21) & 1879048192), (((((($dirty4 >> 18) & 14) | (($dirty4 >> 12) & 112)) | (($dirty3 >> 3) & 896)) | (($dirty3 << 6) & 7168)) | (($dirty3 << 6) & 57344)) | (458752 & ($dirty3 << 3)));
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L236;
        ComposerKt.traceEventEnd();
    L236:
        final boolean isError5 = isError4;
        final PaddingValues contentPadding4 = contentPadding3;
        final Shape shape6 = shape5;
        final TextFieldColors colors5 = colors4;
        final Function2<? super Composer, ? super Integer, Unit> r19 = r22;
    L238:
        ScopeUpdateScope r5 = $composer5.endRestartGroup();
        if (r5 == null) goto L242;
        final int r110 = r3;
        r5.updateScope(new AnonymousClass2(this, value, r63, enabled, singleLine, visualTransformation, interactionSource, isError5, r9, r11, r14, r17, shape6, colors5, contentPadding4, r19, $changed, $changed1, r110));
        return;
    L242:
        return;
    L232:
        $dirty4 = $dirty2;
        goto L233
    L228:
        boolean isError6 = isError2;
        r22 = r76;
        contentPadding3 = contentPadding2;
        colors4 = colors2;
        shape5 = shape3;
        $dirty3 = $dirty1;
        isError4 = isError6;
        r9 = r49;
        r11 = r50;
        r14 = r51;
        r17 = r52;
        goto L229
    L225:
        contentPadding2 = contentPadding;
        goto L226
    L221:
        $composer3 = $composer2;
        $dirty2 = $dirty;
        r58 = r4;
        colors2 = colors;
        goto L222
    L217:
        shape3 = shape;
        goto L219
    L213:
        r52 = r72;
        goto L215
    L210:
        r51 = r71;
        goto L211
    L207:
        r50 = r70;
        goto L208
    L204:
        r49 = r13;
        goto L205
    L201:
        isError2 = r10;
        goto L202
    L187:
        if ($composer2.getDefaultsInvalid() == true) goto L199;
        $composer2.skipToGroupEnd();
        if ((r3 & 2048) == 0) goto L193;
        $dirty1 = $dirty1 & (-113);
    L193:
        if ((r3 & 4096) == 0) goto L196;
        $dirty1 = $dirty1 & (-897);
    L196:
        if ((r3 & 8192) == 0) goto L198;
        $dirty3 = $dirty1 & (-7169);
        r14 = r71;
        r17 = r72;
        shape5 = shape;
        colors4 = colors;
        contentPadding3 = contentPadding;
        r22 = r76;
        $composer3 = $composer2;
        $dirty2 = $dirty;
        isError4 = r10;
        r9 = r13;
        r11 = r70;
        goto L229
    L198:
        r14 = r71;
        r17 = r72;
        shape5 = shape;
        colors4 = colors;
        contentPadding3 = contentPadding;
        r22 = r76;
        $composer3 = $composer2;
        $dirty2 = $dirty;
        $dirty3 = $dirty1;
        isError4 = r10;
        r9 = r13;
        r11 = r70;
        goto L229
    L237:
        $composer5 = $composer2;
        $dirty4 = $dirty;
        $composer5.skipToGroupEnd();
        r14 = r71;
        r17 = r72;
        colors5 = colors;
        contentPadding4 = contentPadding;
        r19 = r76;
        isError5 = r10;
        r9 = r13;
        r11 = r70;
        shape6 = shape;
        goto L238
    L178:
        if ((74899 & $dirty1) != 74898) goto L181;
        r2 = false;
        goto L183
    L169:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L176;
        if ($composer2.changed(this) == false) goto L173;
        int r111 = 131072;
    L174:
        $dirty1 = $dirty1 | r111;
        goto L176
    L173:
        r111 = 65536;
        goto L174
    L158:
        if (($changed1 & 24576) != 0) goto L166;
        if ($composer2.changedInstance(r76) == true) goto L163;
        r21 = 8192;
    L163:
        $dirty1 = $dirty1 | r21;
        goto L166
    L116:
        if (($changed1 & 6) != 0) goto L124;
        if ($composer2.changedInstance(r72) == false) goto L120;
        int r24 = 4;
    L121:
        $dirty1 = $dirty1 | r24;
        goto L124
    L120:
        r24 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r71) == false) goto L109;
        int r29 = 536870912;
    L110:
        $dirty = $dirty | r29;
        goto L112
    L109:
        r29 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r70) == false) goto L98;
        int r28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r28;
        goto L101
    L98:
        r28 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r13 = r69;
        if ($composer2.changedInstance(r13) == false) goto L87;
        int r27 = 8388608;
    L88:
        $dirty = $dirty | r27;
        goto L90
    L87:
        r27 = 4194304;
        goto L88
    L89:
        r13 = r69;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r10 = isError;
        if ($composer2.changed(r10) == false) goto L76;
        int r26 = 1048576;
    L77:
        $dirty = $dirty | r26;
        goto L79
    L76:
        r26 = 524288;
        goto L77
    L78:
        r10 = isError;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changed(interactionSource) == false) goto L65;
        int r23 = 131072;
    L66:
        $dirty = $dirty | r23;
        goto L68
    L65:
        r23 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L58;
        if ($composer2.changed(visualTransformation) == false) goto L54;
        int r210 = 16384;
    L55:
        $dirty = $dirty | r210;
        goto L58
    L54:
        r210 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(singleLine) == false) goto L43;
        int r211 = 2048;
    L44:
        $dirty = $dirty | r211;
        goto L46
    L43:
        r211 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L35;
        if ($composer2.changed(enabled) == false) goto L32;
        int r112 = 256;
    L33:
        $dirty = $dirty | r112;
        goto L35
    L32:
        r112 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r63) == false) goto L21;
        int r113 = 32;
    L22:
        $dirty = $dirty | r113;
        goto L24
    L21:
        r113 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(value) == false) goto L10;
        int r114 = 4;
    L11:
        $dirty = $dirty | r114;
        goto L14
    L10:
        r114 = 2;
        goto L11
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with `shape` parameter.")
    public final /* synthetic */ void TextFieldDecorationBox(java.lang.String r58, kotlin.jvm.functions.Function2 r59, boolean r60, boolean r61, androidx.compose.ui.text.input.VisualTransformation r62, androidx.compose.foundation.interaction.InteractionSource r63, boolean r64, kotlin.jvm.functions.Function2 r65, kotlin.jvm.functions.Function2 r66, kotlin.jvm.functions.Function2 r67, kotlin.jvm.functions.Function2 r68, androidx.compose.material.TextFieldColors r69, androidx.compose.foundation.layout.PaddingValues r70, androidx.compose.runtime.Composer r71, int r72, int r73, int r74) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: INVOKE (r15v0 ?? I:androidx.compose.runtime.Composer) = (r71v0 ?? I:androidx.compose.runtime.Composer A[D('$composer' androidx.compose.runtime.Composer)]), (1171040065 int) INTERFACE call: androidx.compose.runtime.Composer.startRestartGroup(int):androidx.compose.runtime.Composer A[DECLARE_VAR, MD:(int):androidx.compose.runtime.Composer (m)] in method: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.compose.material.TextFieldDefaults] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.compose.material.TextFieldDefaults] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r59v0, types: [androidx.compose.material.TextFieldDefaults, java.lang.Object] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with `shape` parameter.")
    public final /* synthetic */ void OutlinedTextFieldDecorationBox(final String r60, final Function2 r61, final boolean r62, final boolean r63, final VisualTransformation r64, final InteractionSource r65, boolean r66, Function2 r67, Function2 r68, Function2 r69, Function2 r70, TextFieldColors r71, PaddingValues r72, Function2 r73, Composer r74, final int r75, final int r76, final int r77) {
        Composer r7 = r74.startRestartGroup(-1280721485);
        ComposerKt.sourceInformation(r7, "C(OutlinedTextFieldDecorationBox)P(12,4,3,10,13,5,6,7,9,8,11,1,2)759@35431L22,747@34954L613:TextFieldDefaults.kt#jmzs0o");
        int r8 = r75;
        int r9 = r76;
        if ((r77 & 1) == 0) goto L6;
        r8 = r8 | 6;
    L14:
        if ((r77 & 2) == 0) goto L17;
        r8 = r8 | 48;
    L24:
        int r17 = 256;
        if ((r77 & 4) == 0) goto L28;
        r8 = r8 | 384;
    L34:
        int r19 = 1024;
        if ((r77 & 8) == 0) goto L38;
        r8 = r8 | 3072;
    L45:
        int r22 = 16384;
        if ((r77 & 16) == 0) goto L49;
        r8 = r8 | 24576;
    L57:
        if ((r77 & 32) == 0) goto L60;
        r8 = r8 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L66:
        int r21 = r77 & 64;
        if (r21 == 0) goto L70;
        r8 = r8 | 1572864;
        final boolean r12 = r66;
    L77:
        int r14 = r77 & 128;
        if (r14 == 0) goto L81;
        r8 = r8 | 12582912;
        Function2 r15 = r67;
    L88:
        int r1 = r77 & 256;
        if (r1 == 0) goto L92;
        r8 = r8 | 100663296;
    L99:
        int r2 = r77 & 512;
        if (r2 == 0) goto L103;
        r8 = r8 | 805306368;
    L110:
        int r3 = r77 & 1024;
        if (r3 == 0) goto L114;
        r9 = r9 | 6;
    L122:
        if ((r76 & 48) != 0) goto L133;
        if ((r77 & 2048) != 0) goto L129;
        if (r7.changed(r71) == false) goto L129;
        int r25 = 32;
    L130:
        r9 = r9 | r25;
    L129:
        r25 = 16;
    L133:
        if ((r76 & 384) != 0) goto L143;
        if ((r77 & 4096) != 0) goto L140;
        if (r7.changed(r72) == false) goto L140;
    L141:
        r9 = r9 | r17;
    L140:
        r17 = 128;
    L143:
        int r4 = r77 & 8192;
        if (r4 == 0) goto L147;
        r9 = r9 | 3072;
    L154:
        if ((r77 & 16384) == 0) goto L157;
        r9 = r9 | 24576;
    L163:
        int r5 = r9;
        if ((306783379 & r8) == 306783378) goto L166;
    L169:
        boolean r0 = true;
    L171:
        if (r7.shouldExecute(r0, r8 & 1) == false) goto L218;
        r7.startDefaults();
        ComposerKt.sourceInformation(r7, "743@34743L25,745@34879L58");
        if ((r75 & 1) != 0) goto L175;
    L184:
        if (r21 == 0) goto L186;
        r12 = false;
    L187:
        if (r14 == 0) goto L189;
        Function2 r49 = null;
    L190:
        if (r1 == 0) goto L192;
        Function2 r50 = null;
    L193:
        if (r2 == 0) goto L195;
        Function2 r51 = null;
    L196:
        if (r3 == 0) goto L198;
        Function2 r52 = null;
    L200:
        if ((r77 & 2048) == 0) goto L202;
        int r55 = r4;
        int r57 = r8;
        int r6 = r77;
        TextFieldColors r10 = m1826outlinedTextFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, r7, 0, 0, (r5 >> 9) & 112, 2097151);
        r7 = r7;
        int r11 = r5 & (-113);
        final TextFieldColors r13 = r10;
    L204:
        if ((r6 & 4096) == 0) goto L206;
        ?? r16 = this;
        PaddingValues r18 = m1817outlinedTextFieldPaddinga9UjIt4$default(r16, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        r11 = r11 & (-897);
        ?? r20 = r16;
    L207:
        if (r55 == 0) goto L209;
        final boolean r23 = r62;
        final InteractionSource r24 = r65;
        final PaddingValues r110 = r18;
        final Function2 r111 = ComposableLambdaKt.rememberComposableLambda(1261916269, true, new AnonymousClass3(r23, r12, r24, r13), r7, 54);
        final TextFieldColors r112 = r13;
        r5 = r11;
        Function2 r26 = r49;
        Function2 r27 = r50;
        Function2 r113 = r51;
        Function2 r114 = r52;
        ?? r28 = r20;
    L210:
        r7.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L213;
        int r29 = r57;
        ComposerKt.traceEventStart(-1280721485, r29, r5, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:747)");
    L214:
        Composer r115 = r7;
        boolean r30 = r12;
        OutlinedTextFieldDecorationBox(r60, r61, r23, r63, r64, r24, r30, r26, r27, r113, r114, r28.getOutlinedTextFieldShape(r7, (r5 >> 12) & 14), r112, r110, r111, r115, ((((((((r29 & 896) | ((r29 & 14) | (r29 & 112))) | (r29 & 7168)) | (57344 & r29)) | (458752 & r29)) | (3670016 & r29)) | (29360128 & r29)) | (234881024 & r29)) | (1879048192 & r29), ((((r5 & 14) | ((r5 << 3) & 896)) | ((r5 << 3) & 7168)) | ((r5 << 3) & 57344)) | ((r5 << 3) & 458752), 0);
        Composer r44 = r115;
        if (ComposerKt.isTraceInProgress() == false) goto L217;
        ComposerKt.traceEventEnd();
    L217:
        final Function2 r116 = r114;
        final Function2 r117 = r113;
        final Function2 r118 = r27;
        final Function2 r31 = r26;
        final boolean r32 = r30;
    L219:
        ScopeUpdateScope r33 = r44.endRestartGroup();
        if (r33 == null) goto L223;
        r33.updateScope(new AnonymousClass4(this, r60, r61, r62, r63, r64, r65, r32, r31, r118, r117, r116, r112, r110, r111, r75, r76, r77));
        return;
    L223:
        return;
    L213:
        r29 = r57;
        goto L214
    L209:
        r23 = r62;
        r24 = r65;
        r111 = r73;
        r110 = r18;
        r112 = r13;
        r5 = r11;
        r26 = r49;
        r27 = r50;
        r113 = r51;
        r114 = r52;
        r28 = r20;
        goto L210
    L206:
        r20 = this;
        r18 = r72;
        goto L207
    L202:
        r6 = r77;
        r57 = r8;
        r55 = r4;
        r13 = r71;
        r11 = r5;
        goto L204
    L198:
        r52 = r70;
        goto L200
    L195:
        r51 = r69;
        goto L196
    L192:
        r50 = r68;
        goto L193
    L189:
        r49 = r15;
        goto L190
    L186:
        r12 = r12;
        goto L187
    L175:
        if (r7.getDefaultsInvalid() == true) goto L184;
        r7.skipToGroupEnd();
        if ((r77 & 2048) == 0) goto L181;
        r5 = r5 & (-113);
    L181:
        if ((r77 & 4096) == 0) goto L183;
        r23 = r62;
        r24 = r65;
        r27 = r68;
        r113 = r69;
        r114 = r70;
        r112 = r71;
        r110 = r72;
        r5 = r5 & (-897);
        r57 = r8;
        r26 = r15;
        r28 = this;
        r111 = r73;
        goto L210
    L183:
        r28 = this;
        r23 = r62;
        r24 = r65;
        r27 = r68;
        r113 = r69;
        r114 = r70;
        r112 = r71;
        r110 = r72;
        r57 = r8;
        r26 = r15;
        r111 = r73;
        goto L210
    L218:
        r44 = r7;
        r44.skipToGroupEnd();
        r118 = r68;
        r117 = r69;
        r112 = r71;
        r110 = r72;
        r32 = r12;
        r31 = r15;
        r116 = r70;
        r111 = r73;
        goto L219
    L166:
        if ((r5 & 9363) != 9362) goto L169;
        r0 = false;
        goto L171
    L157:
        if ((r76 & 24576) != 0) goto L163;
        if (r7.changed(this) == true) goto L162;
        r22 = 8192;
    L162:
        r9 = r9 | r22;
        goto L163
    L147:
        if ((r76 & 3072) != 0) goto L154;
        if (r7.changedInstance(r73) == false) goto L151;
        r19 = 2048;
    L151:
        r9 = r9 | r19;
        goto L154
    L114:
        if ((r76 & 6) != 0) goto L122;
        if (r7.changedInstance(r70) == false) goto L118;
        int r210 = 4;
    L119:
        r9 = r9 | r210;
        goto L122
    L118:
        r210 = 2;
        goto L119
    L103:
        if ((r75 & 805306368) != 0) goto L110;
        if (r7.changedInstance(r69) == false) goto L107;
        int r211 = 536870912;
    L108:
        r8 = r8 | r211;
        goto L110
    L107:
        r211 = 268435456;
        goto L108
    L92:
        if ((r75 & 100663296) != 0) goto L99;
        if (r7.changedInstance(r68) == false) goto L96;
        int r212 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        r8 = r8 | r212;
        goto L99
    L96:
        r212 = 33554432;
        goto L97
    L81:
        if ((r75 & 12582912) != 0) goto L87;
        r15 = r67;
        if (r7.changedInstance(r15) == false) goto L85;
        int r213 = 8388608;
    L86:
        r8 = r8 | r213;
        goto L88
    L85:
        r213 = 4194304;
        goto L86
    L87:
        r15 = r67;
        goto L88
    L70:
        if ((r75 & 1572864) != 0) goto L76;
        r12 = r66;
        if (r7.changed(r12) == false) goto L74;
        int r214 = 1048576;
    L75:
        r8 = r8 | r214;
        goto L77
    L74:
        r214 = 524288;
        goto L75
    L76:
        r12 = r66;
        goto L77
    L60:
        if ((r75 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        if (r7.changed(r65) == false) goto L64;
        int r215 = 131072;
    L65:
        r8 = r8 | r215;
        goto L66
    L64:
        r215 = 65536;
        goto L65
    L49:
        if ((r75 & 24576) != 0) goto L57;
        if (r7.changed(r64) == false) goto L53;
        int r216 = 16384;
    L54:
        r8 = r8 | r216;
        goto L57
    L53:
        r216 = 8192;
        goto L54
    L38:
        if ((r75 & 3072) != 0) goto L45;
        if (r7.changed(r63) == false) goto L42;
        int r217 = 2048;
    L43:
        r8 = r8 | r217;
        goto L45
    L42:
        r217 = 1024;
        goto L43
    L28:
        if ((r75 & 384) != 0) goto L34;
        if (r7.changed(r62) == false) goto L32;
        int r34 = 256;
    L33:
        r8 = r8 | r34;
        goto L34
    L32:
        r34 = 128;
        goto L33
    L17:
        if ((r75 & 48) != 0) goto L24;
        if (r7.changedInstance(r61) == false) goto L21;
        int r119 = 32;
    L22:
        r8 = r8 | r119;
        goto L24
    L21:
        r119 = 16;
        goto L22
    L6:
        if ((r75 & 6) != 0) goto L14;
        if (r7.changed(r60) == false) goto L10;
        int r120 = 4;
    L11:
        r8 = r8 | r120;
        goto L14
    L10:
        r120 = 2;
        goto L11
    }
}
