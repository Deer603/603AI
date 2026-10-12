package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b)\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$JR\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u009c\u0002\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00180,¢\u0006\u0002\b-2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u00180,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010;J\r\u0010 \u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010<JÂ\u0003\u0010 \u001a\u00020\u00132\b\b\u0002\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020>2\b\b\u0002\u0010A\u001a\u00020>2\b\b\u0002\u0010B\u001a\u00020>2\b\b\u0002\u0010C\u001a\u00020>2\b\b\u0002\u0010D\u001a\u00020>2\b\b\u0002\u0010E\u001a\u00020>2\b\b\u0002\u0010F\u001a\u00020>2\b\b\u0002\u0010G\u001a\u00020>2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I2\b\b\u0002\u0010J\u001a\u00020>2\b\b\u0002\u0010K\u001a\u00020>2\b\b\u0002\u0010L\u001a\u00020>2\b\b\u0002\u0010M\u001a\u00020>2\b\b\u0002\u0010N\u001a\u00020>2\b\b\u0002\u0010O\u001a\u00020>2\b\b\u0002\u0010P\u001a\u00020>2\b\b\u0002\u0010Q\u001a\u00020>2\b\b\u0002\u0010R\u001a\u00020>2\b\b\u0002\u0010S\u001a\u00020>2\b\b\u0002\u0010T\u001a\u00020>2\b\b\u0002\u0010U\u001a\u00020>2\b\b\u0002\u0010V\u001a\u00020>2\b\b\u0002\u0010W\u001a\u00020>2\b\b\u0002\u0010X\u001a\u00020>2\b\b\u0002\u0010Y\u001a\u00020>2\b\b\u0002\u0010Z\u001a\u00020>2\b\b\u0002\u0010[\u001a\u00020>2\b\b\u0002\u0010\\\u001a\u00020>2\b\b\u0002\u0010]\u001a\u00020>2\b\b\u0002\u0010^\u001a\u00020>2\b\b\u0002\u0010_\u001a\u00020>2\b\b\u0002\u0010`\u001a\u00020>2\b\b\u0002\u0010a\u001a\u00020>2\b\b\u0002\u0010b\u001a\u00020>2\b\b\u0002\u0010c\u001a\u00020>2\b\b\u0002\u0010d\u001a\u00020>2\b\b\u0002\u0010e\u001a\u00020>2\b\b\u0002\u0010f\u001a\u00020>2\b\b\u0002\u0010g\u001a\u00020>2\b\b\u0002\u0010h\u001a\u00020>2\b\b\u0002\u0010i\u001a\u00020>H\u0007ø\u0001\u0000¢\u0006\u0004\bj\u0010kJ8\u00108\u001a\u0002092\b\b\u0002\u0010l\u001a\u00020\u00042\b\b\u0002\u0010m\u001a\u00020\u00042\b\b\u0002\u0010n\u001a\u00020\u00042\b\b\u0002\u0010o\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\bp\u0010qR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultOutlinedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultOutlinedTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", TextFieldImplKt.ContainerId, "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "focusedBorderThickness", "unfocusedBorderThickness", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "ContainerBox", "ContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "container", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "start", "top", "end", "bottom", "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness = 0.0f;
    public static final OutlinedTextFieldDefaults INSTANCE = null;
    private static final float MinHeight = 0.0f;
    private static final float MinWidth = 0.0f;
    private static final float UnfocusedBorderThickness = 0.0f;

    private OutlinedTextFieldDefaults() {
    }

    public final Shape getShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1066756961, "C729@37132L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1066756961, $changed, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:729)");
    L5:
        Shape r0 = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    static {
        INSTANCE = new OutlinedTextFieldDefaults();
        MinHeight = Dp.m6973constructorimpl(56);
        MinWidth = Dp.m6973constructorimpl(280);
        UnfocusedBorderThickness = Dp.m6973constructorimpl(1);
        FocusedBorderThickness = Dp.m6973constructorimpl(2);
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2473getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2474getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2475getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2472getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: renamed from: Container-4EFweAY, reason: not valid java name */
    public final void m2468Container4EFweAY(final boolean enabled, final boolean isError, final InteractionSource interactionSource, Modifier modifier, TextFieldColors colors, Shape shape, float focusedBorderThickness, float unfocusedBorderThickness, Composer $composer, final int $changed, final int r31) {
        Composer $composer2 = $composer.startRestartGroup(1035477640);
        ComposerKt.sourceInformation($composer2, "C(Container)P(1,4,3,5!1,6,2:c#ui.unit.Dp,7:c#ui.unit.Dp)772@39024L8,773@39083L5,777@39264L25,779@39335L222,788@39599L198,792@39806L153:TextFieldDefaults.kt#uh7d8r");
        int $dirty = $changed;
        if ((r31 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r31 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r31 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
    L32:
        int r6 = r31 & 8;
        if (r6 == 0) goto L36;
        $dirty = $dirty | 3072;
        Modifier r7 = modifier;
    L44:
        if (($changed & 24576) == 0) goto L46;
        TextFieldColors r9 = colors;
    L55:
        if ((196608 & $changed) == 0) goto L57;
        Shape r12 = shape;
    L66:
        if ((1572864 & $changed) == 0) goto L68;
        float r13 = focusedBorderThickness;
    L77:
        if ((12582912 & $changed) == 0) goto L79;
        float r14 = unfocusedBorderThickness;
    L88:
        if ((r31 & 256) == 0) goto L91;
        $dirty = $dirty | 100663296;
    L98:
        if ((38347923 & $dirty) == 38347922) goto L100;
    L103:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L106;
    L121:
        if (r6 == 0) goto L123;
        Modifier.Companion modifier2 = Modifier.Companion;
    L125:
        if ((r31 & 16) == 0) goto L127;
        TextFieldColors colors2 = colors($composer2, ($dirty >> 24) & 14);
        $dirty = $dirty & (-57345);
    L129:
        if ((r31 & 32) == 0) goto L131;
        Shape shape2 = INSTANCE.getShape($composer2, 6);
        $dirty = $dirty & (-458753);
    L133:
        if ((r31 & 64) == 0) goto L135;
        float focusedBorderThickness2 = FocusedBorderThickness;
        $dirty = $dirty & (-3670017);
    L137:
        if ((r31 & 128) == 0) goto L139;
        int $dirty2 = $dirty & (-29360129);
        TextFieldColors colors3 = colors2;
        Shape shape3 = shape2;
        float focusedBorderThickness3 = focusedBorderThickness2;
        float unfocusedBorderThickness2 = UnfocusedBorderThickness;
        Modifier modifier3 = modifier2;
    L140:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L143;
        ComposerKt.traceEventStart(1035477640, $dirty2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:776)");
    L143:
        boolean focused = FocusInteractionKt.collectIsFocusedAsState(interactionSource, $composer2, ($dirty2 >> 6) & 14).getValue().booleanValue();
        State<BorderStroke> r10 = TextFieldImplKt.m3108animateBorderStrokeAsStateNuRrP5Q(enabled, isError, focused, colors3, focusedBorderThickness3, unfocusedBorderThickness2, $composer2, (((($dirty2 & 14) | ($dirty2 & 112)) | (($dirty2 >> 3) & 7168)) | (($dirty2 >> 6) & 57344)) | (($dirty2 >> 6) & 458752));
        Modifier modifier4 = modifier3;
        Shape shape4 = shape3;
        final State<Color> r15 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(colors3.m2737containerColorXeAY9LY$material3_release(enabled, isError, focused), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, $composer2, 48, 12);
        Composer $composer3 = $composer2;
        BoxKt.Box(TextFieldImplKt.textFieldBackground(BorderKt.border(modifier4, r10.getValue(), shape4), new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new OutlinedTextFieldDefaults$Container$1(r15)), shape4), $composer3, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L146;
        ComposerKt.traceEventEnd();
    L146:
        final float focusedBorderThickness4 = focusedBorderThickness3;
        final float unfocusedBorderThickness3 = unfocusedBorderThickness2;
        final Shape shape5 = shape4;
        final TextFieldColors colors4 = colors3;
        final Modifier modifier5 = modifier4;
    L147:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L151;
        r16.updateScope(new OutlinedTextFieldDefaults$Container$2(this, enabled, isError, interactionSource, modifier5, colors4, shape5, focusedBorderThickness4, unfocusedBorderThickness3, $changed, r31));
        return;
    L151:
        return;
    L139:
        modifier3 = modifier2;
        shape3 = shape2;
        unfocusedBorderThickness2 = r14;
        $dirty2 = $dirty;
        colors3 = colors2;
        focusedBorderThickness3 = focusedBorderThickness2;
        goto L140
    L135:
        focusedBorderThickness2 = r13;
        goto L137
    L131:
        shape2 = r12;
        goto L133
    L127:
        colors2 = r9;
        goto L129
    L123:
        modifier2 = r7;
        goto L125
    L106:
        if ($composer2.getDefaultsInvalid() == true) goto L121;
        $composer2.skipToGroupEnd();
        if ((r31 & 16) == 0) goto L112;
        $dirty = $dirty & (-57345);
    L112:
        if ((r31 & 32) == 0) goto L115;
        $dirty = $dirty & (-458753);
    L115:
        if ((r31 & 64) == 0) goto L118;
        $dirty = $dirty & (-3670017);
    L118:
        if ((r31 & 128) == 0) goto L120;
        int r4 = $dirty & (-29360129);
        colors3 = r9;
        focusedBorderThickness3 = r13;
        shape3 = r12;
        modifier3 = r7;
        unfocusedBorderThickness2 = r14;
        $dirty2 = r4;
        goto L140
    L120:
        focusedBorderThickness3 = r13;
        shape3 = r12;
        modifier3 = r7;
        unfocusedBorderThickness2 = r14;
        $dirty2 = $dirty;
        colors3 = r9;
        goto L140
    L100:
        if ($composer2.getSkipping() == false) goto L103;
        $composer2.skipToGroupEnd();
        modifier5 = r7;
        shape5 = r12;
        float r8 = r13;
        $composer3 = $composer2;
        focusedBorderThickness4 = r8;
        colors4 = r9;
        unfocusedBorderThickness3 = r14;
        goto L147
    L91:
        if (($changed & 100663296) != 0) goto L98;
        if ($composer2.changed(this) == false) goto L95;
        int r17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L96:
        $dirty = $dirty | r17;
        goto L98
    L95:
        r17 = 33554432;
        goto L96
    L79:
        if ((r31 & 128) != 0) goto L83;
        r14 = unfocusedBorderThickness;
        if ($composer2.changed(r14) == false) goto L84;
        int r18 = 8388608;
    L85:
        $dirty = $dirty | r18;
    L84:
        r18 = 4194304;
        goto L85
    L83:
        r14 = unfocusedBorderThickness;
        goto L84
    L68:
        if ((r31 & 64) != 0) goto L72;
        r13 = focusedBorderThickness;
        if ($composer2.changed(r13) == false) goto L73;
        int r19 = 1048576;
    L74:
        $dirty = $dirty | r19;
    L73:
        r19 = 524288;
        goto L74
    L72:
        r13 = focusedBorderThickness;
        goto L73
    L57:
        if ((r31 & 32) != 0) goto L61;
        r12 = shape;
        if ($composer2.changed(r12) == false) goto L62;
        int r110 = 131072;
    L63:
        $dirty = $dirty | r110;
    L62:
        r110 = 65536;
        goto L63
    L61:
        r12 = shape;
        goto L62
    L46:
        if ((r31 & 16) != 0) goto L50;
        r9 = colors;
        if ($composer2.changed(r9) == false) goto L51;
        int r111 = 16384;
    L52:
        $dirty = $dirty | r111;
    L51:
        r111 = 8192;
        goto L52
    L50:
        r9 = colors;
        goto L51
    L36:
        if (($changed & 3072) != 0) goto L42;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L40;
        int r11 = 2048;
    L41:
        $dirty = $dirty | r11;
        goto L44
    L40:
        r11 = 1024;
        goto L41
    L42:
        r7 = modifier;
        goto L44
    L26:
        if (($changed & 384) != 0) goto L32;
        if ($composer2.changed(interactionSource) == false) goto L30;
        int r20 = 256;
    L31:
        $dirty = $dirty | r20;
        goto L32
    L30:
        r20 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(isError) == false) goto L20;
        int r21 = 32;
    L21:
        $dirty = $dirty | r21;
        goto L23
    L20:
        r21 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(enabled) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L13
    L10:
        r22 = 2;
        goto L11
    }

    public final void DecorationBox(final String value, final Function2<? super Composer, ? super Integer, Unit> r36, final boolean enabled, final boolean singleLine, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean isError, Function2<? super Composer, ? super Integer, Unit> r42, Function2<? super Composer, ? super Integer, Unit> r43, Function2<? super Composer, ? super Integer, Unit> r44, Function2<? super Composer, ? super Integer, Unit> r45, Function2<? super Composer, ? super Integer, Unit> r46, Function2<? super Composer, ? super Integer, Unit> r47, Function2<? super Composer, ? super Integer, Unit> r48, TextFieldColors colors, PaddingValues contentPadding, Function2<? super Composer, ? super Integer, Unit> r51, Composer $composer, final int $changed, final int $changed1, final int r55) {
        Composer $composer2 = $composer.startRestartGroup(-350442135);
        ComposerKt.sourceInformation($composer2, "C(DecorationBox)P(15,4,3,11,16,5,6,7,9,8,14,10,12,13!1,2)870@44562L8,872@44674L408,885@45099L709:TextFieldDefaults.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r55 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r55 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r16 = 256;
        if ((r55 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L34:
        int r18 = 2048;
        if ((r55 & 8) == 0) goto L38;
        $dirty = $dirty | 3072;
    L45:
        int r21 = 8192;
        if ((r55 & 16) == 0) goto L49;
        $dirty = $dirty | 24576;
    L57:
        if ((r55 & 32) == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L66:
        int r20 = r55 & 64;
        if (r20 == 0) goto L70;
        $dirty = $dirty | 1572864;
        boolean r9 = isError;
    L77:
        int r11 = r55 & 128;
        if (r11 == 0) goto L81;
        $dirty = $dirty | 12582912;
        Function2<? super Composer, ? super Integer, Unit> r13 = r42;
    L88:
        int r0 = r55 & 256;
        if (r0 == 0) goto L92;
        $dirty = $dirty | 100663296;
    L99:
        int r1 = r55 & 512;
        if (r1 == 0) goto L103;
        $dirty = $dirty | 805306368;
    L110:
        int r2 = r55 & 1024;
        if (r2 == 0) goto L114;
        $dirty1 = $dirty1 | 6;
    L121:
        int r3 = r55 & 2048;
        if (r3 == 0) goto L125;
        $dirty1 = $dirty1 | 48;
    L132:
        int r4 = r55 & 4096;
        if (r4 == 0) goto L135;
        $dirty1 = $dirty1 | 384;
        int r26 = r4;
    L143:
        int r5 = r55 & 8192;
        if (r5 == 0) goto L146;
        $dirty1 = $dirty1 | 3072;
        int r17 = r5;
    L155:
        if (($changed1 & 24576) != 0) goto L165;
        if ((r55 & 16384) != 0) goto L162;
        if ($composer2.changed(colors) == false) goto L162;
        r21 = 16384;
    L162:
        $dirty1 = $dirty1 | r21;
    L165:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L175;
        if ((r55 & 32768) != 0) goto L172;
        if ($composer2.changed(contentPadding) == false) goto L172;
        int r19 = 131072;
    L173:
        $dirty1 = $dirty1 | r19;
    L172:
        r19 = 65536;
    L175:
        int r110 = r55 & 65536;
        if (r110 == 0) goto L179;
        $dirty1 = $dirty1 | 1572864;
    L187:
        if ((r55 & 131072) == 0) goto L190;
        $dirty1 = $dirty1 | 12582912;
    L197:
        if (($dirty & 306783379) == 306783378) goto L199;
    L204:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L207;
    L216:
        if (r20 == 0) goto L218;
        final boolean isError2 = false;
    L219:
        if (r11 == 0) goto L221;
        r13 = null;
    L221:
        if (r0 == 0) goto L223;
        Function2<? super Composer, ? super Integer, Unit> r6 = null;
    L224:
        if (r1 == 0) goto L226;
        Function2<? super Composer, ? super Integer, Unit> r10 = null;
    L227:
        if (r2 == 0) goto L229;
        Function2<? super Composer, ? super Integer, Unit> r12 = null;
    L230:
        if (r3 == 0) goto L232;
        Function2<? super Composer, ? super Integer, Unit> r111 = null;
    L233:
        if (r26 == 0) goto L235;
        Function2<? super Composer, ? super Integer, Unit> r112 = null;
    L236:
        if (r17 == 0) goto L238;
        Function2<? super Composer, ? super Integer, Unit> r113 = null;
    L239:
        Function2<? super Composer, ? super Integer, Unit> r52 = r6;
        if ((r55 & 16384) == 0) goto L242;
        final TextFieldColors colors2 = colors($composer2, ($dirty1 >> 21) & 14);
        $dirty1 = $dirty1 & (-57345);
    L244:
        if ((r55 & 32768) == 0) goto L246;
        PaddingValues contentPadding2 = m2467contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        $dirty1 = $dirty1 & (-458753);
    L247:
        if (r110 == 0) goto L249;
        boolean isError3 = isError2;
        ComposableLambda r7 = ComposableLambdaKt.rememberComposableLambda(-1448570018, true, new AnonymousClass1(enabled, isError2, interactionSource, colors2), $composer2, 54);
        PaddingValues contentPadding3 = contentPadding2;
        int $dirty2 = $dirty1;
        Function2<? super Composer, ? super Integer, Unit> r8 = r10;
        Function2<? super Composer, ? super Integer, Unit> r14 = r12;
        Function2<? super Composer, ? super Integer, Unit> r15 = r113;
        Function2<? super Composer, ? super Integer, Unit> r22 = r111;
        Function2<? super Composer, ? super Integer, Unit> r23 = r112;
        final TextFieldColors colors3 = colors2;
        Function2<? super Composer, ? super Integer, Unit> r24 = r13;
        boolean isError4 = isError3;
        Function2<? super Composer, ? super Integer, Unit> r114 = r7;
        Function2<? super Composer, ? super Integer, Unit> r25 = r52;
    L250:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L253;
        ComposerKt.traceEventStart(-350442135, $dirty, $dirty2, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:884)");
    L253:
        Function2<? super Composer, ? super Integer, Unit> r27 = r25;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, r36, visualTransformation, r24, r27, r8, r14, r22, r23, r15, singleLine, enabled, isError4, interactionSource, contentPadding3, colors3, r114, $composer2, (((((((((($dirty << 3) & 112) | 6) | (($dirty << 3) & 896)) | (($dirty >> 3) & 7168)) | (($dirty >> 9) & 57344)) | (($dirty >> 9) & 458752)) | (($dirty >> 9) & 3670016)) | (($dirty2 << 21) & 29360128)) | (($dirty2 << 21) & 234881024)) | (($dirty2 << 21) & 1879048192), (((((((($dirty2 >> 9) & 14) | (($dirty >> 6) & 112)) | ($dirty & 896)) | (($dirty >> 9) & 7168)) | (($dirty >> 3) & 57344)) | (458752 & $dirty2)) | (($dirty2 << 6) & 3670016)) | (($dirty2 << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L256;
        ComposerKt.traceEventEnd();
    L256:
        boolean r115 = isError4;
        final Function2<? super Composer, ? super Integer, Unit> r116 = r22;
        final boolean isError5 = r115;
        final Function2<? super Composer, ? super Integer, Unit> r117 = r8;
        final Function2<? super Composer, ? super Integer, Unit> r118 = r14;
        final Function2<? super Composer, ? super Integer, Unit> r119 = r23;
        final Function2<? super Composer, ? super Integer, Unit> r120 = r114;
        final Function2<? super Composer, ? super Integer, Unit> r28 = r24;
        final PaddingValues contentPadding4 = contentPadding3;
        final Function2<? super Composer, ? super Integer, Unit> r121 = r15;
        final Function2<? super Composer, ? super Integer, Unit> r122 = r27;
    L257:
        ScopeUpdateScope r29 = $composer2.endRestartGroup();
        if (r29 == null) goto L261;
        r29.updateScope(new AnonymousClass2(this, value, r36, enabled, singleLine, visualTransformation, interactionSource, isError5, r28, r122, r117, r118, r116, r119, r121, colors3, contentPadding4, r120, $changed, $changed1, r55));
        return;
    L261:
        return;
    L249:
        boolean isError6 = isError2;
        contentPadding3 = contentPadding2;
        r25 = r52;
        $dirty2 = $dirty1;
        r8 = r10;
        r14 = r12;
        r15 = r113;
        r22 = r111;
        r23 = r112;
        colors3 = colors2;
        r24 = r13;
        isError4 = isError6;
        r114 = r51;
        goto L250
    L246:
        contentPadding2 = contentPadding;
        goto L247
    L242:
        colors2 = colors;
        goto L244
    L238:
        r113 = r48;
        goto L239
    L235:
        r112 = r47;
        goto L236
    L232:
        r111 = r46;
        goto L233
    L229:
        r12 = r45;
        goto L230
    L226:
        r10 = r44;
        goto L227
    L223:
        r6 = r43;
        goto L224
    L218:
        isError2 = r9;
        goto L219
    L207:
        if ($composer2.getDefaultsInvalid() == true) goto L216;
        $composer2.skipToGroupEnd();
        if ((r55 & 16384) == 0) goto L213;
        $dirty1 = $dirty1 & (-57345);
    L213:
        if ((32768 & r55) == 0) goto L215;
        int r30 = (-458753) & $dirty1;
        r8 = r44;
        r14 = r45;
        r22 = r46;
        r15 = r48;
        colors3 = colors;
        contentPadding3 = contentPadding;
        r114 = r51;
        $dirty2 = r30;
        r24 = r13;
        r25 = r43;
        isError4 = r9;
        r23 = r47;
        goto L250
    L215:
        r25 = r43;
        r14 = r45;
        r22 = r46;
        r15 = r48;
        colors3 = colors;
        contentPadding3 = contentPadding;
        r114 = r51;
        $dirty2 = $dirty1;
        r24 = r13;
        r8 = r44;
        isError4 = r9;
        r23 = r47;
        goto L250
    L199:
        if ((4793491 & $dirty1) != 4793490) goto L204;
        if ($composer2.getSkipping() == false) goto L204;
        $composer2.skipToGroupEnd();
        r122 = r43;
        r117 = r44;
        r118 = r45;
        r119 = r47;
        r121 = r48;
        colors3 = colors;
        contentPadding4 = contentPadding;
        r120 = r51;
        isError5 = r9;
        r28 = r13;
        r116 = r46;
        goto L257
    L190:
        if (($changed1 & 12582912) != 0) goto L197;
        if ($composer2.changed(this) == false) goto L194;
        int r123 = 8388608;
    L195:
        $dirty1 = $dirty1 | r123;
        goto L197
    L194:
        r123 = 4194304;
        goto L195
    L179:
        if (($changed1 & 1572864) != 0) goto L187;
        if ($composer2.changedInstance(r51) == false) goto L183;
        int r124 = 1048576;
    L184:
        $dirty1 = $dirty1 | r124;
        goto L187
    L183:
        r124 = 524288;
        goto L184
    L146:
        r17 = r5;
        if (($changed1 & 3072) != 0) goto L155;
        if ($composer2.changedInstance(r48) == true) goto L152;
        r18 = 1024;
    L152:
        $dirty1 = $dirty1 | r18;
        goto L155
    L135:
        r26 = r4;
        if (($changed1 & 384) != 0) goto L143;
        if ($composer2.changedInstance(r47) == true) goto L141;
        r16 = 128;
    L141:
        $dirty1 = $dirty1 | r16;
        goto L143
    L125:
        if (($changed1 & 48) != 0) goto L132;
        if ($composer2.changedInstance(r46) == false) goto L129;
        int r210 = 32;
    L130:
        $dirty1 = $dirty1 | r210;
        goto L132
    L129:
        r210 = 16;
        goto L130
    L114:
        if (($changed1 & 6) != 0) goto L121;
        if ($composer2.changedInstance(r45) == false) goto L118;
        int r211 = 4;
    L119:
        $dirty1 = $dirty1 | r211;
        goto L121
    L118:
        r211 = 2;
        goto L119
    L103:
        if (($changed & 805306368) != 0) goto L110;
        if ($composer2.changedInstance(r44) == false) goto L107;
        int r31 = 536870912;
    L108:
        $dirty = $dirty | r31;
        goto L110
    L107:
        r31 = 268435456;
        goto L108
    L92:
        if (($changed & 100663296) != 0) goto L99;
        if ($composer2.changedInstance(r43) == false) goto L96;
        int r32 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        $dirty = $dirty | r32;
        goto L99
    L96:
        r32 = 33554432;
        goto L97
    L81:
        if (($changed & 12582912) != 0) goto L87;
        r13 = r42;
        if ($composer2.changedInstance(r13) == false) goto L85;
        int r212 = 8388608;
    L86:
        $dirty = $dirty | r212;
        goto L88
    L85:
        r212 = 4194304;
        goto L86
    L87:
        r13 = r42;
        goto L88
    L70:
        if (($changed & 1572864) != 0) goto L76;
        r9 = isError;
        if ($composer2.changed(r9) == false) goto L74;
        int r213 = 1048576;
    L75:
        $dirty = $dirty | r213;
        goto L77
    L74:
        r213 = 524288;
        goto L75
    L76:
        r9 = isError;
        goto L77
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        if ($composer2.changed(interactionSource) == false) goto L64;
        int r214 = 131072;
    L65:
        $dirty = $dirty | r214;
        goto L66
    L64:
        r214 = 65536;
        goto L65
    L49:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changed(visualTransformation) == false) goto L53;
        int r215 = 16384;
    L54:
        $dirty = $dirty | r215;
        goto L57
    L53:
        r215 = 8192;
        goto L54
    L38:
        if (($changed & 3072) != 0) goto L45;
        if ($composer2.changed(singleLine) == false) goto L42;
        int r216 = 2048;
    L43:
        $dirty = $dirty | r216;
        goto L45
    L42:
        r216 = 1024;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changed(enabled) == false) goto L32;
        int r125 = 256;
    L33:
        $dirty = $dirty | r125;
        goto L34
    L32:
        r125 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r36) == false) goto L21;
        int r126 = 32;
    L22:
        $dirty = $dirty | r126;
        goto L24
    L21:
        r126 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(value) == false) goto L10;
        int r127 = 4;
    L11:
        $dirty = $dirty | r127;
        goto L14
    L10:
        r127 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2467contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
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
        return r0.m2471contentPaddinga9UjIt4(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2471contentPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m721PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    public final TextFieldColors colors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -471651810, "C(colors)921@46417L11,921@46429L30:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-471651810, $changed, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:921)");
    L5:
        TextFieldColors r0 = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme($composer, 6), $composer, ($changed << 3) & 112);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m2470colors0hiis_0(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, TextSelectionColors selectionColors, long focusedBorderColor, long unfocusedBorderColor, long disabledBorderColor, long errorBorderColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor, Composer $composer, int $changed, int $changed1, int $changed2, int $changed3, int $changed4, int r184, int r185) {
        ComposerKt.sourceInformationMarkerStart($composer, 1767617725, "C(colors)P(30:c#ui.graphics.Color,41:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,23:c#ui.graphics.Color,34:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.graphics.Color,0:c#ui.graphics.Color,13:c#ui.graphics.Color,32,22:c#ui.graphics.Color,33:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,25:c#ui.graphics.Color,36:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,31:c#ui.graphics.Color,42:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,24:c#ui.graphics.Color,35:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,26:c#ui.graphics.Color,37:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,29:c#ui.graphics.Color,40:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,38:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,28:c#ui.graphics.Color,39:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)1023@53240L11,1023@53252L30:TextFieldDefaults.kt#uh7d8r");
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
        long focusedBorderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r184 & 4096) == 0) goto L53;
        long unfocusedBorderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L55:
        if ((r184 & 8192) == 0) goto L57;
        long disabledBorderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L59:
        if ((r184 & 16384) == 0) goto L61;
        long errorBorderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
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
        ComposerKt.traceEventStart(1767617725, $changed, $changed1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1023)");
    L178:
        TextFieldColors r1 = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme($composer, 6), $composer, ($changed4 >> 6) & 112).m2738copyejIjP34(focusedTextColor2, unfocusedTextColor2, disabledTextColor2, errorTextColor2, focusedContainerColor2, unfocusedContainerColor2, disabledContainerColor2, errorContainerColor2, cursorColor2, errorCursorColor2, selectionColors2, focusedBorderColor2, unfocusedBorderColor2, disabledBorderColor2, errorBorderColor2, focusedLeadingIconColor2, unfocusedLeadingIconColor2, disabledLeadingIconColor2, errorLeadingIconColor2, focusedTrailingIconColor2, unfocusedTrailingIconColor2, disabledTrailingIconColor2, errorTrailingIconColor2, focusedLabelColor2, unfocusedLabelColor2, disabledLabelColor2, errorLabelColor2, focusedPlaceholderColor2, unfocusedPlaceholderColor2, disabledPlaceholderColor2, errorPlaceholderColor2, focusedSupportingTextColor2, unfocusedSupportingTextColor2, disabledSupportingTextColor2, errorSupportingTextColor2, focusedPrefixColor2, unfocusedPrefixColor2, disabledPrefixColor2, errorPrefixColor2, focusedSuffixColor2, unfocusedSuffixColor2, disabledSuffixColor2, errorSuffixColor2);
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
        errorBorderColor2 = errorBorderColor;
        goto L63
    L57:
        disabledBorderColor2 = disabledBorderColor;
        goto L59
    L53:
        unfocusedBorderColor2 = unfocusedBorderColor;
        goto L55
    L49:
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

    public final TextFieldColors getDefaultOutlinedTextFieldColors(ColorScheme $this$defaultOutlinedTextFieldColors, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -292363577, "C:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-292363577, $changed, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1071)");
    L6:
        TextFieldColors it = $this$defaultOutlinedTextFieldColors.getDefaultOutlinedTextFieldColorsCached$material3_release();
        $composer.startReplaceGroup(1540400102);
        ComposerKt.sourceInformation($composer, "*1086@57012L7");
        if (it != null) goto L9;
        long r7 = ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getFocusInputColor());
        long r9 = ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getInputColor());
        long r11 = Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long r13 = ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getErrorInputColor());
        long r15 = Color.Companion.m4401getTransparent0d7_KjU();
        long r17 = Color.Companion.m4401getTransparent0d7_KjU();
        long r19 = Color.Companion.m4401getTransparent0d7_KjU();
        long r21 = Color.Companion.m4401getTransparent0d7_KjU();
        long r23 = ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getCaretColor());
        long r25 = ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor());
        ProvidableCompositionLocal<TextSelectionColors> r2 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        it = new TextFieldColors(r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, (TextSelectionColors) r3, ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getOutlineColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getLabelColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getSupportingColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultOutlinedTextFieldColors, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
        $this$defaultOutlinedTextFieldColors.setDefaultOutlinedTextFieldColorsCached$material3_release(it);
    L9:
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return it;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to OutlinedTextFieldDefaults.Container", replaceWith = @ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n    focusedBorderThickness = focusedBorderThickness,\n    unfocusedBorderThickness = unfocusedBorderThickness,\n)", imports = {}))
    /* JADX INFO: renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    public final void m2469ContainerBoxnbWgWpA(final boolean enabled, final boolean isError, final InteractionSource interactionSource, TextFieldColors colors, Shape shape, float focusedBorderThickness, float unfocusedBorderThickness, Composer $composer, final int $changed, final int r28) {
        Composer $composer2 = $composer.startRestartGroup(1461761386);
        ComposerKt.sourceInformation($composer2, "C(ContainerBox)P(1,4,3!1,5,2:c#ui.unit.Dp,6:c#ui.unit.Dp)1174@62656L8,1175@62715L5,1179@62864L348:TextFieldDefaults.kt#uh7d8r");
        int $dirty = $changed;
        if ((r28 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r3 = enabled;
    L14:
        if ((r28 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        boolean r4 = isError;
    L25:
        if ((r28 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        InteractionSource r5 = interactionSource;
    L36:
        if (($changed & 3072) == 0) goto L38;
        TextFieldColors colors2 = colors;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Shape shape2 = shape;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        float focusedBorderThickness2 = focusedBorderThickness;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        float unfocusedBorderThickness2 = unfocusedBorderThickness;
    L80:
        if ((r28 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        if ((4793491 & $dirty) == 4793490) goto L92;
    L95:
        $composer2.startDefaults();
        if (($changed & 1) == 0) goto L114;
        if ($composer2.getDefaultsInvalid() == true) goto L114;
        $composer2.skipToGroupEnd();
        if ((r28 & 8) == 0) goto L104;
        $dirty = $dirty & (-7169);
    L104:
        if ((r28 & 16) == 0) goto L107;
        $dirty = $dirty & (-57345);
    L107:
        if ((r28 & 32) == 0) goto L110;
        $dirty = $dirty & (-458753);
    L110:
        if ((r28 & 64) == 0) goto L112;
        int $dirty2 = $dirty & (-3670017);
    L127:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L130;
        ComposerKt.traceEventStart(1461761386, $dirty2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1179)");
    L130:
        boolean r17 = r4;
        boolean r1 = r3;
        InteractionSource r6 = r5;
        final TextFieldColors colors3 = colors2;
        final Shape shape3 = shape2;
        final float focusedBorderThickness3 = focusedBorderThickness2;
        final float unfocusedBorderThickness3 = unfocusedBorderThickness2;
        m2468Container4EFweAY(r1, r17, r6, Modifier.Companion, colors3, shape3, focusedBorderThickness3, unfocusedBorderThickness3, $composer2, (((((((($dirty2 & 14) | 3072) | ($dirty2 & 112)) | ($dirty2 & 896)) | (($dirty2 << 3) & 57344)) | (($dirty2 << 3) & 458752)) | (($dirty2 << 3) & 3670016)) | (($dirty2 << 3) & 29360128)) | (234881024 & ($dirty2 << 3)), 0);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L133;
        ComposerKt.traceEventEnd();
    L133:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L137;
        r15.updateScope(new OutlinedTextFieldDefaults$ContainerBox$1(this, enabled, isError, interactionSource, colors3, shape3, focusedBorderThickness3, unfocusedBorderThickness3, $changed, r28));
        return;
    L137:
        return;
    L112:
        $dirty2 = $dirty;
    L114:
        if ((r28 & 8) == 0) goto L117;
        colors2 = colors($composer2, ($dirty >> 21) & 14);
        $dirty = $dirty & (-7169);
    L117:
        if ((r28 & 16) == 0) goto L121;
        shape2 = INSTANCE.getShape($composer2, 6);
        $dirty = $dirty & (-57345);
    L121:
        if ((r28 & 32) == 0) goto L124;
        focusedBorderThickness2 = FocusedBorderThickness;
        $dirty = $dirty & (-458753);
    L124:
        if ((r28 & 64) == 0) goto L126;
        unfocusedBorderThickness2 = UnfocusedBorderThickness;
        $dirty2 = $dirty & (-3670017);
        goto L127
    L126:
        $dirty2 = $dirty;
        goto L127
    L92:
        if ($composer2.getSkipping() == false) goto L95;
        $composer2.skipToGroupEnd();
        colors3 = colors2;
        shape3 = shape2;
        focusedBorderThickness3 = focusedBorderThickness2;
        $composer3 = $composer2;
        unfocusedBorderThickness3 = unfocusedBorderThickness2;
        goto L133
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(this) == false) goto L87;
        int r11 = 8388608;
    L88:
        $dirty = $dirty | r11;
        goto L90
    L87:
        r11 = 4194304;
        goto L88
    L71:
        if ((r28 & 64) != 0) goto L75;
        unfocusedBorderThickness2 = unfocusedBorderThickness;
        if ($composer2.changed(unfocusedBorderThickness2) == false) goto L76;
        int r12 = 1048576;
    L77:
        $dirty = $dirty | r12;
    L76:
        r12 = 524288;
        goto L77
    L75:
        unfocusedBorderThickness2 = unfocusedBorderThickness;
        goto L76
    L60:
        if ((r28 & 32) != 0) goto L64;
        focusedBorderThickness2 = focusedBorderThickness;
        if ($composer2.changed(focusedBorderThickness2) == false) goto L65;
        int r10 = 131072;
    L66:
        $dirty = $dirty | r10;
    L65:
        r10 = 65536;
        goto L66
    L64:
        focusedBorderThickness2 = focusedBorderThickness;
        goto L65
    L49:
        if ((r28 & 16) != 0) goto L53;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L54;
        int r8 = 16384;
    L55:
        $dirty = $dirty | r8;
    L54:
        r8 = 8192;
        goto L55
    L53:
        shape2 = shape;
        goto L54
    L38:
        if ((r28 & 8) != 0) goto L42;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L43;
        int r7 = 2048;
    L44:
        $dirty = $dirty | r7;
    L43:
        r7 = 1024;
        goto L44
    L42:
        colors2 = colors;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        r5 = interactionSource;
        if ($composer2.changed(r5) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L36
    L32:
        r9 = 128;
        goto L33
    L34:
        r5 = interactionSource;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = isError;
        if ($composer2.changed(r4) == false) goto L21;
        int r13 = 32;
    L22:
        $dirty = $dirty | r13;
        goto L25
    L21:
        r13 = 16;
        goto L22
    L23:
        r4 = isError;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = enabled;
        if ($composer2.changed(r3) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L14
    L10:
        r14 = 2;
        goto L11
    L12:
        r3 = enabled;
        goto L14
    }
}
