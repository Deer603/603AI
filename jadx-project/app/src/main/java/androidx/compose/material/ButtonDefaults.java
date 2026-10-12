package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J0\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.JD\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102J0\u00103\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105J0\u00106\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00105R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0016\u0010\u001a\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "buttonColors", "Landroidx/compose/material/ButtonColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledBackgroundColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "elevation", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "pressedElevation", "disabledElevation", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "outlinedButtonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "textButtonColors", "textButtonColors-RGew2ao", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding = 0.0f;
    private static final float ButtonVerticalPadding = 0.0f;
    private static final PaddingValues ContentPadding = null;
    public static final ButtonDefaults INSTANCE = null;
    private static final float IconSize = 0.0f;
    private static final float IconSpacing = 0.0f;
    private static final float MinHeight = 0.0f;
    private static final float MinWidth = 0.0f;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize = 0.0f;
    private static final PaddingValues TextButtonContentPadding = null;
    private static final float TextButtonHorizontalPadding = 0.0f;

    private ButtonDefaults() {
    }

    static {
        INSTANCE = new ButtonDefaults();
        ButtonHorizontalPadding = Dp.m6973constructorimpl(16);
        ButtonVerticalPadding = Dp.m6973constructorimpl(8);
        ContentPadding = PaddingKt.m721PaddingValuesa9UjIt4(ButtonHorizontalPadding, ButtonVerticalPadding, ButtonHorizontalPadding, ButtonVerticalPadding);
        MinWidth = Dp.m6973constructorimpl(64);
        MinHeight = Dp.m6973constructorimpl(36);
        IconSize = Dp.m6973constructorimpl(18);
        IconSpacing = Dp.m6973constructorimpl(8);
        OutlinedBorderSize = Dp.m6973constructorimpl(1);
        TextButtonHorizontalPadding = Dp.m6973constructorimpl(8);
        TextButtonContentPadding = PaddingKt.m721PaddingValuesa9UjIt4(TextButtonHorizontalPadding, ContentPadding.mo677calculateTopPaddingD9Ej5fM(), TextButtonHorizontalPadding, ContentPadding.mo674calculateBottomPaddingD9Ej5fM());
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1570getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1569getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1567getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* JADX INFO: renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1568getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    /* JADX INFO: renamed from: elevation-yajeYGU, reason: not valid java name */
    public final /* synthetic */ ButtonElevation m1566elevationyajeYGU(float defaultElevation, float pressedElevation, float disabledElevation, Composer $composer, int $changed, int r18) {
        ComposerKt.sourceInformationMarkerStart($composer, 1428576874, "C(elevation)P(0:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp)350@14970L185:Button.kt#jmzs0o");
        if ((r18 & 1) == 0) goto L5;
        float defaultElevation2 = Dp.m6973constructorimpl(2);
        float defaultElevation3 = defaultElevation2;
    L7:
        if ((r18 & 2) == 0) goto L9;
        float pressedElevation2 = Dp.m6973constructorimpl(8);
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r18 & 4) == 0) goto L13;
        float disabledElevation2 = Dp.m6973constructorimpl(0);
        float disabledElevation3 = disabledElevation2;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(1428576874, $changed, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:350)");
    L17:
        int $this$dp$iv = $changed & 14;
        ButtonElevation r13 = m1565elevationR_JCAzs(defaultElevation3, pressedElevation3, disabledElevation3, Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(4), $composer, ((($this$dp$iv | 27648) | ($changed & 112)) | ($changed & 896)) | (($changed << 6) & 458752), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r13;
    L13:
        disabledElevation3 = disabledElevation;
        goto L15
    L9:
        pressedElevation3 = pressedElevation;
        goto L11
    L5:
        defaultElevation3 = defaultElevation;
        goto L7
    }

    /* JADX INFO: renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1565elevationR_JCAzs(float defaultElevation, float pressedElevation, float disabledElevation, float hoveredElevation, float focusedElevation, Composer $composer, int $changed, int r23) {
        ComposerKt.sourceInformationMarkerStart($composer, -737170518, "C(elevation)P(0:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,3:c#ui.unit.Dp,2:c#ui.unit.Dp)378@16121L497:Button.kt#jmzs0o");
        if ((r23 & 1) == 0) goto L5;
        float defaultElevation2 = Dp.m6973constructorimpl(2);
    L7:
        if ((r23 & 2) == 0) goto L9;
        float pressedElevation2 = Dp.m6973constructorimpl(8);
    L11:
        if ((r23 & 4) == 0) goto L13;
        float disabledElevation2 = Dp.m6973constructorimpl(0);
    L15:
        if ((r23 & 8) == 0) goto L17;
        float hoveredElevation2 = Dp.m6973constructorimpl(4);
    L19:
        if ((r23 & 16) == 0) goto L21;
        float focusedElevation2 = Dp.m6973constructorimpl(4);
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-737170518, $changed, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:377)");
    L25:
        ComposerKt.sourceInformationMarkerStart($composer, -511807158, "CC(remember):Button.kt#9igjgp");
        boolean r4 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L30;
        if ($composer.changed(defaultElevation2) == false) goto L30;
    L31:
        boolean r2 = true;
    L34:
        if ((($changed & 112) ^ 48) <= 32) goto L38;
        if ($composer.changed(pressedElevation2) == false) goto L38;
    L39:
        boolean r3 = true;
    L41:
        boolean r5 = r2 | r3;
        if ((($changed & 896) ^ 384) <= 256) goto L46;
        if ($composer.changed(disabledElevation2) == false) goto L46;
    L47:
        boolean r6 = true;
    L49:
        boolean r7 = r5 | r6;
        if ((($changed & 7168) ^ 3072) <= 2048) goto L54;
        if ($composer.changed(hoveredElevation2) == false) goto L54;
    L55:
        boolean r8 = true;
    L57:
        boolean r9 = r7 | r8;
        if (((57344 & $changed) ^ 24576) <= 16384) goto L62;
        if ($composer.changed(focusedElevation2) == false) goto L62;
    L63:
        r4 = true;
    L64:
        boolean invalid$iv = r9 | r4;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L67;
    L70:
        Object value$iv = new DefaultButtonElevation(defaultElevation2, pressedElevation2, disabledElevation2, hoveredElevation2, focusedElevation2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L71:
        DefaultButtonElevation r12 = (DefaultButtonElevation) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventEnd();
    L74:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    L67:
        if (it$iv != Composer.Companion.getEmpty()) goto L71;
    L62:
        if (($changed & 24576) != 16384) goto L64;
    L54:
        if (($changed & 3072) == 2048) goto L55;
        r8 = false;
    L46:
        if (($changed & 384) == 256) goto L47;
        r6 = false;
    L38:
        if (($changed & 48) == 32) goto L39;
        r3 = false;
    L30:
        if (($changed & 6) == 4) goto L31;
        r2 = false;
        goto L34
    L21:
        focusedElevation2 = focusedElevation;
        goto L23
    L17:
        hoveredElevation2 = hoveredElevation;
        goto L19
    L13:
        disabledElevation2 = disabledElevation;
        goto L15
    L9:
        pressedElevation2 = pressedElevation;
        goto L11
    L5:
        defaultElevation2 = defaultElevation;
        goto L7
    }

    /* JADX INFO: renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1564buttonColorsro_MJ88(long backgroundColor, long contentColor, long disabledBackgroundColor, long disabledContentColor, Composer $composer, int $changed, int r33) {
        ComposerKt.sourceInformationMarkerStart($composer, 1870371134, "C(buttonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)406@17187L6,407@17233L32,409@17334L6,411@17433L6,413@17514L6,413@17557L8:Button.kt#jmzs0o");
        if ((r33 & 1) == 0) goto L5;
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU();
    L7:
        if ((r33 & 2) == 0) goto L9;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer, $changed & 14);
    L11:
        if ((r33 & 4) == 0) goto L13;
        long disabledBackgroundColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU());
    L15:
        if ((r33 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(1870371134, $changed, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:415)");
    L21:
        DefaultButtonColors r7 = new DefaultButtonColors(backgroundColor2, contentColor2, disabledBackgroundColor2, disabledContentColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L24;
        ComposerKt.traceEventEnd();
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r7;
    L17:
        disabledContentColor2 = disabledContentColor;
        goto L19
    L13:
        disabledBackgroundColor2 = disabledBackgroundColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        backgroundColor2 = backgroundColor;
        goto L7
    }

    /* JADX INFO: renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m1572outlinedButtonColorsRGew2ao(long backgroundColor, long contentColor, long disabledContentColor, Composer $composer, int $changed, int r28) {
        ComposerKt.sourceInformationMarkerStart($composer, -2124406093, "C(outlinedButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color)432@18332L6,433@18392L6,435@18472L6,435@18515L8:Button.kt#jmzs0o");
        if ((r28 & 1) == 0) goto L5;
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU();
    L7:
        if ((r28 & 2) == 0) goto L9;
        long contentColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU();
    L11:
        if ((r28 & 4) == 0) goto L13;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-2124406093, $changed, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:437)");
    L18:
        DefaultButtonColors r6 = new DefaultButtonColors(backgroundColor2, contentColor2, backgroundColor2, disabledContentColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventEnd();
    L21:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L13:
        disabledContentColor2 = disabledContentColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        backgroundColor2 = backgroundColor;
        goto L7
    }

    /* JADX INFO: renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m1573textButtonColorsRGew2ao(long backgroundColor, long contentColor, long disabledContentColor, Composer $composer, int $changed, int r26) {
        ComposerKt.sourceInformationMarkerStart($composer, 182742216, "C(textButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color)455@19310L6,457@19390L6,457@19433L8:Button.kt#jmzs0o");
        if ((r26 & 1) == 0) goto L5;
        long backgroundColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L7:
        if ((r26 & 2) == 0) goto L9;
        long contentColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU();
    L11:
        if ((r26 & 4) == 0) goto L13;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(182742216, $changed, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:459)");
    L18:
        DefaultButtonColors r4 = new DefaultButtonColors(backgroundColor2, contentColor2, backgroundColor2, disabledContentColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventEnd();
    L21:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    L13:
        disabledContentColor2 = disabledContentColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        backgroundColor2 = backgroundColor;
        goto L7
    }

    /* JADX INFO: renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1571getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    public final BorderStroke getOutlinedBorder(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -2091313033, "C(<get-outlinedBorder>)478@20161L6:Button.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2091313033, $changed, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:476)");
    L5:
        BorderStroke r0 = BorderStrokeKt.m261BorderStrokecXLIe8U(OutlinedBorderSize, Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }
}
