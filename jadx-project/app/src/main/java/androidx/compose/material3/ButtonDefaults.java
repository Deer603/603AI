package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010:\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010:\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bA\u0010BJD\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010L\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010BJD\u0010N\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010KJ\r\u0010P\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010P\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bQ\u0010BJD\u0010R\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bS\u0010KJ\u0017\u0010#\u001a\u00020$2\b\b\u0002\u0010T\u001a\u00020UH\u0007¢\u0006\u0002\u0010VJ\r\u0010W\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010W\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bX\u0010BJ\r\u0010Y\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010Y\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bZ\u0010BR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0016\u0010\u0019\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u0016\u0010\u001c\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001d\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010#\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0011\u0010)\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0011\u0010+\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0018\u0010-\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0018\u00102\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0018\u00104\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0018\u00106\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00101R\u0018\u00108\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ButtonWithIconContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getButtonWithIconContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ButtonWithIconHorizontalStartPadding", "ContentPadding", "getContentPadding", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "TextButtonWithIconContentPadding", "getTextButtonWithIconContentPadding", "TextButtonWithIconHorizontalEndPadding", "elevatedShape", "Landroidx/compose/ui/graphics/Shape;", "getElevatedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "filledTonalShape", "getFilledTonalShape", "outlinedButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedButtonBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedShape", "getOutlinedShape", "shape", "getShape", "textShape", "getTextShape", "defaultButtonColors", "Landroidx/compose/material3/ButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ButtonColors;", "defaultElevatedButtonColors", "getDefaultElevatedButtonColors$material3_release", "defaultFilledTonalButtonColors", "getDefaultFilledTonalButtonColors$material3_release", "defaultOutlinedButtonColors", "getDefaultOutlinedButtonColors$material3_release", "defaultTextButtonColors", "getDefaultTextButtonColors$material3_release", "buttonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "buttonElevation", "Landroidx/compose/material3/ButtonElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "elevatedButtonColors", "elevatedButtonColors-ro_MJ88", "elevatedButtonElevation", "elevatedButtonElevation-R_JCAzs", "filledTonalButtonColors", "filledTonalButtonColors-ro_MJ88", "filledTonalButtonElevation", "filledTonalButtonElevation-R_JCAzs", "enabled", "", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "outlinedButtonColors", "outlinedButtonColors-ro_MJ88", "textButtonColors", "textButtonColors-ro_MJ88", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding = 0.0f;
    private static final float ButtonVerticalPadding = 0.0f;
    private static final PaddingValues ButtonWithIconContentPadding = null;
    private static final float ButtonWithIconHorizontalStartPadding = 0.0f;
    private static final PaddingValues ContentPadding = null;
    public static final ButtonDefaults INSTANCE = null;
    private static final float IconSize = 0.0f;
    private static final float IconSpacing = 0.0f;
    private static final float MinHeight = 0.0f;
    private static final float MinWidth = 0.0f;
    private static final PaddingValues TextButtonContentPadding = null;
    private static final float TextButtonHorizontalPadding = 0.0f;
    private static final PaddingValues TextButtonWithIconContentPadding = null;
    private static final float TextButtonWithIconHorizontalEndPadding = 0.0f;

    private ButtonDefaults() {
    }

    static {
        INSTANCE = new ButtonDefaults();
        ButtonHorizontalPadding = Dp.m6973constructorimpl(24);
        ButtonVerticalPadding = Dp.m6973constructorimpl(8);
        ContentPadding = PaddingKt.m721PaddingValuesa9UjIt4(ButtonHorizontalPadding, ButtonVerticalPadding, ButtonHorizontalPadding, ButtonVerticalPadding);
        ButtonWithIconHorizontalStartPadding = Dp.m6973constructorimpl(16);
        ButtonWithIconContentPadding = PaddingKt.m721PaddingValuesa9UjIt4(ButtonWithIconHorizontalStartPadding, ButtonVerticalPadding, ButtonHorizontalPadding, ButtonVerticalPadding);
        TextButtonHorizontalPadding = Dp.m6973constructorimpl(12);
        TextButtonContentPadding = PaddingKt.m721PaddingValuesa9UjIt4(TextButtonHorizontalPadding, ContentPadding.mo677calculateTopPaddingD9Ej5fM(), TextButtonHorizontalPadding, ContentPadding.mo674calculateBottomPaddingD9Ej5fM());
        TextButtonWithIconHorizontalEndPadding = Dp.m6973constructorimpl(16);
        TextButtonWithIconContentPadding = PaddingKt.m721PaddingValuesa9UjIt4(TextButtonHorizontalPadding, ContentPadding.mo677calculateTopPaddingD9Ej5fM(), TextButtonWithIconHorizontalEndPadding, ContentPadding.mo674calculateBottomPaddingD9Ej5fM());
        MinWidth = Dp.m6973constructorimpl(58);
        MinHeight = Dp.m6973constructorimpl(40);
        IconSize = FilledButtonTokens.INSTANCE.m3371getIconSizeD9Ej5fM();
        IconSpacing = Dp.m6973constructorimpl(8);
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    public final PaddingValues getTextButtonWithIconContentPadding() {
        return TextButtonWithIconContentPadding;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1945getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1944getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1942getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* JADX INFO: renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1943getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    public final Shape getShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1234923021, "C542@25460L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1234923021, $changed, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:542)");
    L5:
        Shape r0 = ShapesKt.getValue(FilledButtonTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getElevatedShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 2143958791, "C546@25609L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(2143958791, $changed, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:546)");
    L5:
        Shape r0 = ShapesKt.getValue(ElevatedButtonTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getFilledTonalShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -886584987, "C550@25767L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-886584987, $changed, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:550)");
    L5:
        Shape r0 = ShapesKt.getValue(FilledTonalButtonTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getOutlinedShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -2045213065, "C554@25916L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2045213065, $changed, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:554)");
    L5:
        Shape r0 = ShapesKt.getValue(OutlinedButtonTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getTextShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -349121587, "C558@26052L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-349121587, $changed, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:558)");
    L5:
        Shape r0 = ShapesKt.getValue(TextButtonTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final ButtonColors buttonColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1449248637, "C(buttonColors)564@26242L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1449248637, $changed, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:564)");
    L5:
        ButtonColors r0 = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1936buttonColorsro_MJ88(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, -339300779, "C(buttonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)582@27048L11:Button.kt#uh7d8r");
        if ((r25 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r25 & 2) == 0) goto L9;
        long contentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r25 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r25 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventStart(-339300779, $changed, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:582)");
    L22:
        ButtonColors r1 = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1931copyjRlVdoo(containerColor2, contentColor2, disabledContainerColor2, disabledContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventEnd();
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L17:
        disabledContentColor2 = disabledContentColor;
        goto L19
    L13:
        disabledContainerColor2 = disabledContainerColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final ButtonColors getDefaultButtonColors$material3_release(ColorScheme $this$defaultButtonColors) {
        ButtonColors it = $this$defaultButtonColors.getDefaultButtonColorsCached$material3_release();
        if (it != null) goto L6;
        ButtonColors it2 = new ButtonColors(ColorSchemeKt.fromToken($this$defaultButtonColors, FilledButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken($this$defaultButtonColors, FilledButtonTokens.INSTANCE.getLabelTextColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultButtonColors, FilledButtonTokens.INSTANCE.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultButtonColors, FilledButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultButtonColors.setDefaultButtonColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final ButtonColors elevatedButtonColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 2025043443, "C(elevatedButtonColors)609@28364L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(2025043443, $changed, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:609)");
    L5:
        ButtonColors r0 = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: elevatedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1938elevatedButtonColorsro_MJ88(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, 1507908383, "C(elevatedButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)627@29223L11:Button.kt#uh7d8r");
        if ((r25 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r25 & 2) == 0) goto L9;
        long contentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r25 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r25 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventStart(1507908383, $changed, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:627)");
    L22:
        ButtonColors r1 = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1931copyjRlVdoo(containerColor2, contentColor2, disabledContainerColor2, disabledContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventEnd();
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L17:
        disabledContentColor2 = disabledContentColor;
        goto L19
    L13:
        disabledContainerColor2 = disabledContainerColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final ButtonColors getDefaultElevatedButtonColors$material3_release(ColorScheme $this$defaultElevatedButtonColors) {
        ButtonColors it = $this$defaultElevatedButtonColors.getDefaultElevatedButtonColorsCached$material3_release();
        if (it != null) goto L6;
        ButtonColors it2 = new ButtonColors(ColorSchemeKt.fromToken($this$defaultElevatedButtonColors, ElevatedButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken($this$defaultElevatedButtonColors, ElevatedButtonTokens.INSTANCE.getLabelTextColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedButtonColors, ElevatedButtonTokens.INSTANCE.getDisabledContainerColor()), ElevatedButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedButtonColors, ElevatedButtonTokens.INSTANCE.getDisabledLabelTextColor()), ElevatedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultElevatedButtonColors.setDefaultElevatedButtonColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final ButtonColors filledTonalButtonColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 824987837, "C(filledTonalButtonColors)655@30593L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(824987837, $changed, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:655)");
    L5:
        ButtonColors r0 = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: filledTonalButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1940filledTonalButtonColorsro_MJ88(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, 1670757653, "C(filledTonalButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)674@31482L11:Button.kt#uh7d8r");
        if ((r25 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r25 & 2) == 0) goto L9;
        long contentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r25 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r25 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventStart(1670757653, $changed, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:674)");
    L22:
        ButtonColors r1 = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1931copyjRlVdoo(containerColor2, contentColor2, disabledContainerColor2, disabledContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventEnd();
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L17:
        disabledContentColor2 = disabledContentColor;
        goto L19
    L13:
        disabledContainerColor2 = disabledContainerColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final ButtonColors getDefaultFilledTonalButtonColors$material3_release(ColorScheme $this$defaultFilledTonalButtonColors) {
        ButtonColors it = $this$defaultFilledTonalButtonColors.getDefaultFilledTonalButtonColorsCached$material3_release();
        if (it != null) goto L6;
        ButtonColors it2 = new ButtonColors(ColorSchemeKt.fromToken($this$defaultFilledTonalButtonColors, FilledTonalButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken($this$defaultFilledTonalButtonColors, FilledTonalButtonTokens.INSTANCE.getLabelTextColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilledTonalButtonColors, FilledTonalButtonTokens.INSTANCE.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilledTonalButtonColors, FilledTonalButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultFilledTonalButtonColors.setDefaultFilledTonalButtonColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final ButtonColors outlinedButtonColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1344886725, "C(outlinedButtonColors)701@32872L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1344886725, $changed, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:701)");
    L5:
        ButtonColors r0 = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: outlinedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1946outlinedButtonColorsro_MJ88(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, -1778526249, "C(outlinedButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)719@33731L11:Button.kt#uh7d8r");
        if ((r25 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r25 & 2) == 0) goto L9;
        long contentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r25 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r25 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventStart(-1778526249, $changed, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:719)");
    L22:
        ButtonColors r1 = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1931copyjRlVdoo(containerColor2, contentColor2, disabledContainerColor2, disabledContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventEnd();
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L17:
        disabledContentColor2 = disabledContentColor;
        goto L19
    L13:
        disabledContainerColor2 = disabledContainerColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final ButtonColors getDefaultOutlinedButtonColors$material3_release(ColorScheme $this$defaultOutlinedButtonColors) {
        ButtonColors it = $this$defaultOutlinedButtonColors.getDefaultOutlinedButtonColorsCached$material3_release();
        if (it != null) goto L6;
        ButtonColors it2 = new ButtonColors(Color.Companion.m4401getTransparent0d7_KjU(), ColorSchemeKt.fromToken($this$defaultOutlinedButtonColors, OutlinedButtonTokens.INSTANCE.getLabelTextColor()), Color.Companion.m4401getTransparent0d7_KjU(), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultOutlinedButtonColors, OutlinedButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultOutlinedButtonColors.setDefaultOutlinedButtonColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final ButtonColors textButtonColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1880341584, "C(textButtonColors)744@34895L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1880341584, $changed, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:744)");
    L5:
        ButtonColors r0 = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1947textButtonColorsro_MJ88(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, -1402274782, "C(textButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)762@35725L11:Button.kt#uh7d8r");
        if ((r25 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r25 & 2) == 0) goto L9;
        long contentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r25 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r25 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventStart(-1402274782, $changed, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:762)");
    L22:
        ButtonColors r1 = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1931copyjRlVdoo(containerColor2, contentColor2, disabledContainerColor2, disabledContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventEnd();
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L17:
        disabledContentColor2 = disabledContentColor;
        goto L19
    L13:
        disabledContainerColor2 = disabledContainerColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final ButtonColors getDefaultTextButtonColors$material3_release(ColorScheme $this$defaultTextButtonColors) {
        ButtonColors it = $this$defaultTextButtonColors.getDefaultTextButtonColorsCached$material3_release();
        if (it != null) goto L6;
        ButtonColors it2 = new ButtonColors(Color.Companion.m4401getTransparent0d7_KjU(), ColorSchemeKt.fromToken($this$defaultTextButtonColors, TextButtonTokens.INSTANCE.getLabelTextColor()), Color.Companion.m4401getTransparent0d7_KjU(), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultTextButtonColors, TextButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultTextButtonColors.setDefaultTextButtonColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    /* JADX INFO: renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1937buttonElevationR_JCAzs(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation, float disabledElevation, Composer $composer, int $changed, int r18) {
        ComposerKt.sourceInformationMarkerStart($composer, 1827791191, "C(buttonElevation)P(0:c#ui.unit.Dp,4:c#ui.unit.Dp,2:c#ui.unit.Dp,3:c#ui.unit.Dp,1:c#ui.unit.Dp):Button.kt#uh7d8r");
        if ((r18 & 1) == 0) goto L5;
        float defaultElevation2 = FilledButtonTokens.INSTANCE.m3366getContainerElevationD9Ej5fM();
        float defaultElevation3 = defaultElevation2;
    L7:
        if ((r18 & 2) == 0) goto L9;
        float pressedElevation2 = FilledButtonTokens.INSTANCE.m3372getPressedContainerElevationD9Ej5fM();
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r18 & 4) == 0) goto L13;
        float focusedElevation2 = FilledButtonTokens.INSTANCE.m3369getFocusContainerElevationD9Ej5fM();
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r18 & 8) == 0) goto L17;
        float hoveredElevation2 = FilledButtonTokens.INSTANCE.m3370getHoverContainerElevationD9Ej5fM();
        float hoveredElevation3 = hoveredElevation2;
    L19:
        if ((r18 & 16) == 0) goto L21;
        float disabledElevation2 = FilledButtonTokens.INSTANCE.m3368getDisabledContainerElevationD9Ej5fM();
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventStart(1827791191, $changed, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:802)");
    L26:
        ButtonElevation r3 = new ButtonElevation(defaultElevation3, pressedElevation3, focusedElevation3, hoveredElevation3, disabledElevation2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
    L29:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L21:
        disabledElevation2 = disabledElevation;
        goto L23
    L17:
        hoveredElevation3 = hoveredElevation;
        goto L19
    L13:
        focusedElevation3 = focusedElevation;
        goto L15
    L9:
        pressedElevation3 = pressedElevation;
        goto L11
    L5:
        defaultElevation3 = defaultElevation;
        goto L7
    }

    /* JADX INFO: renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1939elevatedButtonElevationR_JCAzs(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation, float disabledElevation, Composer $composer, int $changed, int r18) {
        ComposerKt.sourceInformationMarkerStart($composer, 1065482445, "C(elevatedButtonElevation)P(0:c#ui.unit.Dp,4:c#ui.unit.Dp,2:c#ui.unit.Dp,3:c#ui.unit.Dp,1:c#ui.unit.Dp):Button.kt#uh7d8r");
        if ((r18 & 1) == 0) goto L5;
        float defaultElevation2 = ElevatedButtonTokens.INSTANCE.m3285getContainerElevationD9Ej5fM();
        float defaultElevation3 = defaultElevation2;
    L7:
        if ((r18 & 2) == 0) goto L9;
        float pressedElevation2 = ElevatedButtonTokens.INSTANCE.m3291getPressedContainerElevationD9Ej5fM();
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r18 & 4) == 0) goto L13;
        float focusedElevation2 = ElevatedButtonTokens.INSTANCE.m3288getFocusContainerElevationD9Ej5fM();
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r18 & 8) == 0) goto L17;
        float hoveredElevation2 = ElevatedButtonTokens.INSTANCE.m3289getHoverContainerElevationD9Ej5fM();
        float hoveredElevation3 = hoveredElevation2;
    L19:
        if ((r18 & 16) == 0) goto L21;
        float disabledElevation2 = ElevatedButtonTokens.INSTANCE.m3287getDisabledContainerElevationD9Ej5fM();
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventStart(1065482445, $changed, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:829)");
    L26:
        ButtonElevation r3 = new ButtonElevation(defaultElevation3, pressedElevation3, focusedElevation3, hoveredElevation3, disabledElevation2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
    L29:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L21:
        disabledElevation2 = disabledElevation;
        goto L23
    L17:
        hoveredElevation3 = hoveredElevation;
        goto L19
    L13:
        focusedElevation3 = focusedElevation;
        goto L15
    L9:
        pressedElevation3 = pressedElevation;
        goto L11
    L5:
        defaultElevation3 = defaultElevation;
        goto L7
    }

    /* JADX INFO: renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1941filledTonalButtonElevationR_JCAzs(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation, float disabledElevation, Composer $composer, int $changed, int r18) {
        ComposerKt.sourceInformationMarkerStart($composer, 5982871, "C(filledTonalButtonElevation)P(0:c#ui.unit.Dp,4:c#ui.unit.Dp,2:c#ui.unit.Dp,3:c#ui.unit.Dp,1:c#ui.unit.Dp):Button.kt#uh7d8r");
        if ((r18 & 1) == 0) goto L5;
        float defaultElevation2 = FilledTonalButtonTokens.INSTANCE.m3389getContainerElevationD9Ej5fM();
        float defaultElevation3 = defaultElevation2;
    L7:
        if ((r18 & 2) == 0) goto L9;
        float pressedElevation2 = FilledTonalButtonTokens.INSTANCE.m3395getPressedContainerElevationD9Ej5fM();
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r18 & 4) == 0) goto L13;
        float focusedElevation2 = FilledTonalButtonTokens.INSTANCE.m3392getFocusContainerElevationD9Ej5fM();
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r18 & 8) == 0) goto L17;
        float hoveredElevation2 = FilledTonalButtonTokens.INSTANCE.m3393getHoverContainerElevationD9Ej5fM();
        float hoveredElevation3 = hoveredElevation2;
    L19:
        if ((r18 & 16) == 0) goto L21;
        float disabledElevation2 = Dp.m6973constructorimpl(0);
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventStart(5982871, $changed, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:859)");
    L26:
        ButtonElevation r3 = new ButtonElevation(defaultElevation3, pressedElevation3, focusedElevation3, hoveredElevation3, disabledElevation2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
    L29:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L21:
        disabledElevation2 = disabledElevation;
        goto L23
    L17:
        hoveredElevation3 = hoveredElevation;
        goto L19
    L13:
        focusedElevation3 = focusedElevation;
        goto L15
    L9:
        pressedElevation3 = pressedElevation;
        goto L11
    L5:
        defaultElevation3 = defaultElevation;
        goto L7
    }

    @Deprecated(message = "Please use the version that takes an `enabled` param to get the `BorderStroke` with the correct opacity", replaceWith = @ReplaceWith(expression = "outlinedButtonBorder(enabled)", imports = {}))
    public final BorderStroke getOutlinedButtonBorder(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -563957672, "C879@41501L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-563957672, $changed, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:877)");
    L5:
        BorderStroke r0 = BorderStrokeKt.m261BorderStrokecXLIe8U(OutlinedButtonTokens.INSTANCE.m3471getOutlineWidthD9Ej5fM(), ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), $composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final BorderStroke outlinedButtonBorder(boolean enabled, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, -626854767, "C(outlinedButtonBorder):Button.kt#uh7d8r");
        if ((r14 & 1) == 0) goto L6;
        enabled = true;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(-626854767, $changed, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:889)");
    L8:
        float r15 = OutlinedButtonTokens.INSTANCE.m3471getOutlineWidthD9Ej5fM();
        if (enabled == false) goto L11;
        $composer.startReplaceGroup(-855870548);
        ComposerKt.sourceInformation($composer, "893@41926L5");
        long r0 = ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), $composer, 6);
        $composer.endReplaceGroup();
    L12:
        BorderStroke r16 = BorderStrokeKt.m261BorderStrokecXLIe8U(r15, r0);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r16;
    L11:
        $composer.startReplaceGroup(-855783004);
        ComposerKt.sourceInformation($composer, "895@42011L5");
        r0 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), $composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        $composer.endReplaceGroup();
        goto L12
    }
}
