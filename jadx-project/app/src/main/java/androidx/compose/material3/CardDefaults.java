package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0014\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJN\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u0010(\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001cJN\u0010*\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010'J\u0017\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/H\u0007¢\u0006\u0002\u00100J\r\u00101\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u00101\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001cJN\u00103\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010'R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0012\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/material3/CardDefaults;", "", "()V", "elevatedShape", "Landroidx/compose/ui/graphics/Shape;", "getElevatedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "shape", "getShape", "defaultCardColors", "Landroidx/compose/material3/CardColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultCardColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CardColors;", "defaultElevatedCardColors", "getDefaultElevatedCardColors$material3_release", "defaultOutlinedCardColors", "getDefaultOutlinedCardColors$material3_release", "cardColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CardColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "cardColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardColors;", "cardElevation", "Landroidx/compose/material3/CardElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "cardElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardElevation;", "elevatedCardColors", "elevatedCardColors-ro_MJ88", "elevatedCardElevation", "elevatedCardElevation-aqJV_2Y", "outlinedCardBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "outlinedCardColors", "outlinedCardColors-ro_MJ88", "outlinedCardElevation", "outlinedCardElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardDefaults {
    public static final int $stable = 0;
    public static final CardDefaults INSTANCE = null;

    static {
        INSTANCE = new CardDefaults();
    }

    private CardDefaults() {
    }

    public final Shape getShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1266660211, "C376@16530L5:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1266660211, $changed, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:376)");
    L5:
        Shape r0 = ShapesKt.getValue(FilledCardTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getElevatedShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -133496185, "C380@16675L5:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-133496185, $changed, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:380)");
    L5:
        Shape r0 = ShapesKt.getValue(ElevatedCardTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getOutlinedShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1095404023, "C384@16820L5:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1095404023, $changed, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:384)");
    L5:
        Shape r0 = ShapesKt.getValue(OutlinedCardTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: cardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1957cardElevationaqJV_2Y(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, -574898487, "C(cardElevation)P(0:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp):Card.kt#uh7d8r");
        if ((r20 & 1) == 0) goto L5;
        float defaultElevation2 = FilledCardTokens.INSTANCE.m3373getContainerElevationD9Ej5fM();
        float defaultElevation3 = defaultElevation2;
    L7:
        if ((r20 & 2) == 0) goto L9;
        float pressedElevation2 = FilledCardTokens.INSTANCE.m3379getPressedContainerElevationD9Ej5fM();
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r20 & 4) == 0) goto L13;
        float focusedElevation2 = FilledCardTokens.INSTANCE.m3376getFocusContainerElevationD9Ej5fM();
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r20 & 8) == 0) goto L17;
        float hoveredElevation2 = FilledCardTokens.INSTANCE.m3377getHoverContainerElevationD9Ej5fM();
    L19:
        if ((r20 & 16) == 0) goto L21;
        float draggedElevation2 = FilledCardTokens.INSTANCE.m3375getDraggedContainerElevationD9Ej5fM();
    L23:
        if ((r20 & 32) == 0) goto L25;
        float disabledElevation2 = FilledCardTokens.INSTANCE.m3374getDisabledContainerElevationD9Ej5fM();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(-574898487, $changed, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:405)");
    L30:
        CardElevation r3 = new CardElevation(defaultElevation3, pressedElevation3, focusedElevation3, hoveredElevation2, draggedElevation2, disabledElevation2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L25:
        disabledElevation2 = disabledElevation;
        goto L27
    L21:
        draggedElevation2 = draggedElevation;
        goto L23
    L17:
        hoveredElevation2 = hoveredElevation;
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

    /* JADX INFO: renamed from: elevatedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1959elevatedCardElevationaqJV_2Y(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, 1154241939, "C(elevatedCardElevation)P(0:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp):Card.kt#uh7d8r");
        if ((r20 & 1) == 0) goto L5;
        float defaultElevation2 = ElevatedCardTokens.INSTANCE.m3292getContainerElevationD9Ej5fM();
        float defaultElevation3 = defaultElevation2;
    L7:
        if ((r20 & 2) == 0) goto L9;
        float pressedElevation2 = ElevatedCardTokens.INSTANCE.m3298getPressedContainerElevationD9Ej5fM();
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r20 & 4) == 0) goto L13;
        float focusedElevation2 = ElevatedCardTokens.INSTANCE.m3295getFocusContainerElevationD9Ej5fM();
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r20 & 8) == 0) goto L17;
        float hoveredElevation2 = ElevatedCardTokens.INSTANCE.m3296getHoverContainerElevationD9Ej5fM();
    L19:
        if ((r20 & 16) == 0) goto L21;
        float draggedElevation2 = ElevatedCardTokens.INSTANCE.m3294getDraggedContainerElevationD9Ej5fM();
    L23:
        if ((r20 & 32) == 0) goto L25;
        float disabledElevation2 = ElevatedCardTokens.INSTANCE.m3293getDisabledContainerElevationD9Ej5fM();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(1154241939, $changed, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:434)");
    L30:
        CardElevation r3 = new CardElevation(defaultElevation3, pressedElevation3, focusedElevation3, hoveredElevation2, draggedElevation2, disabledElevation2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L25:
        disabledElevation2 = disabledElevation;
        goto L27
    L21:
        draggedElevation2 = draggedElevation;
        goto L23
    L17:
        hoveredElevation2 = hoveredElevation;
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

    /* JADX INFO: renamed from: outlinedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1961outlinedCardElevationaqJV_2Y(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, -97678773, "C(outlinedCardElevation)P(0:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp):Card.kt#uh7d8r");
        if ((r20 & 1) == 0) goto L5;
        float defaultElevation2 = OutlinedCardTokens.INSTANCE.m3472getContainerElevationD9Ej5fM();
        float defaultElevation3 = defaultElevation2;
    L7:
        if ((r20 & 2) == 0) goto L9;
        float pressedElevation2 = defaultElevation3;
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r20 & 4) == 0) goto L13;
        float focusedElevation2 = defaultElevation3;
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r20 & 8) == 0) goto L17;
        float hoveredElevation2 = defaultElevation3;
    L19:
        if ((r20 & 16) == 0) goto L21;
        float draggedElevation2 = OutlinedCardTokens.INSTANCE.m3474getDraggedContainerElevationD9Ej5fM();
    L23:
        if ((r20 & 32) == 0) goto L25;
        float disabledElevation2 = OutlinedCardTokens.INSTANCE.m3473getDisabledContainerElevationD9Ej5fM();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(-97678773, $changed, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:463)");
    L30:
        CardElevation r3 = new CardElevation(defaultElevation3, pressedElevation3, focusedElevation3, hoveredElevation2, draggedElevation2, disabledElevation2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L25:
        disabledElevation2 = disabledElevation;
        goto L27
    L21:
        draggedElevation2 = draggedElevation;
        goto L23
    L17:
        hoveredElevation2 = hoveredElevation;
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

    public final CardColors cardColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1876034303, "C(cardColors)476@21292L11:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1876034303, $changed, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:476)");
    L5:
        CardColors r0 = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: cardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1956cardColorsro_MJ88(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, Composer $composer, int $changed, int r27) {
        ComposerKt.sourceInformationMarkerStart($composer, -1589582123, "C(cardColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)490@21903L31,494@22109L11:Card.kt#uh7d8r");
        if ((r27 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r27 & 2) == 0) goto L9;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer, $changed & 14);
    L11:
        if ((r27 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r27 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(contentColor2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(-1589582123, $changed, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:494)");
    L21:
        CardColors r2 = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1951copyjRlVdoo(containerColor2, contentColor2, disabledContainerColor2, disabledContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L24;
        ComposerKt.traceEventEnd();
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
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

    public final CardColors getDefaultCardColors$material3_release(ColorScheme $this$defaultCardColors) {
        CardColors it = $this$defaultCardColors.getDefaultCardColorsCached$material3_release();
        if (it != null) goto L6;
        CardColors it2 = new CardColors(ColorSchemeKt.fromToken($this$defaultCardColors, FilledCardTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m2056contentColorFor4WTKRHQ($this$defaultCardColors, ColorSchemeKt.fromToken($this$defaultCardColors, FilledCardTokens.INSTANCE.getContainerColor())), ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultCardColors, FilledCardTokens.INSTANCE.getDisabledContainerColor()), FilledCardTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultCardColors, FilledCardTokens.INSTANCE.getContainerColor())), Color.m4365copywmQWz5c$default(ColorSchemeKt.m2056contentColorFor4WTKRHQ($this$defaultCardColors, ColorSchemeKt.fromToken($this$defaultCardColors, FilledCardTokens.INSTANCE.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultCardColors.setDefaultCardColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final CardColors elevatedCardColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1610137975, "C(elevatedCardColors)522@23477L11:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1610137975, $changed, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:522)");
    L5:
        CardColors r0 = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: elevatedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1958elevatedCardColorsro_MJ88(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, Composer $composer, int $changed, int r27) {
        ComposerKt.sourceInformationMarkerStart($composer, 139558303, "C(elevatedCardColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)536@24145L31,540@24351L11:Card.kt#uh7d8r");
        if ((r27 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r27 & 2) == 0) goto L9;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer, $changed & 14);
    L11:
        if ((r27 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r27 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(contentColor2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(139558303, $changed, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:540)");
    L21:
        CardColors r2 = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1951copyjRlVdoo(containerColor2, contentColor2, disabledContainerColor2, disabledContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L24;
        ComposerKt.traceEventEnd();
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
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

    public final CardColors getDefaultElevatedCardColors$material3_release(ColorScheme $this$defaultElevatedCardColors) {
        CardColors it = $this$defaultElevatedCardColors.getDefaultElevatedCardColorsCached$material3_release();
        if (it != null) goto L6;
        CardColors it2 = new CardColors(ColorSchemeKt.fromToken($this$defaultElevatedCardColors, ElevatedCardTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m2056contentColorFor4WTKRHQ($this$defaultElevatedCardColors, ColorSchemeKt.fromToken($this$defaultElevatedCardColors, ElevatedCardTokens.INSTANCE.getContainerColor())), ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedCardColors, ElevatedCardTokens.INSTANCE.getDisabledContainerColor()), ElevatedCardTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultElevatedCardColors, ElevatedCardTokens.INSTANCE.getDisabledContainerColor())), Color.m4365copywmQWz5c$default(ColorSchemeKt.m2056contentColorFor4WTKRHQ($this$defaultElevatedCardColors, ColorSchemeKt.fromToken($this$defaultElevatedCardColors, ElevatedCardTokens.INSTANCE.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultElevatedCardColors.setDefaultElevatedCardColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final CardColors outlinedCardColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1204388929, "C(outlinedCardColors)571@25869L11:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1204388929, $changed, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:571)");
    L5:
        CardColors r0 = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: outlinedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1960outlinedCardColorsro_MJ88(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, Composer $composer, int $changed, int r31) {
        ComposerKt.sourceInformationMarkerStart($composer, -1112362409, "C(outlinedCardColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)585@26537L31,587@26667L31,589@26762L11:Card.kt#uh7d8r");
        if ((r31 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r31 & 2) == 0) goto L9;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer, $changed & 14);
    L11:
        if ((r31 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r31 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer, $changed & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(-1112362409, $changed, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:589)");
    L21:
        CardColors r2 = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1951copyjRlVdoo(containerColor2, contentColor2, disabledContainerColor2, disabledContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L24;
        ComposerKt.traceEventEnd();
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
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

    public final CardColors getDefaultOutlinedCardColors$material3_release(ColorScheme $this$defaultOutlinedCardColors) {
        CardColors it = $this$defaultOutlinedCardColors.getDefaultOutlinedCardColorsCached$material3_release();
        if (it != null) goto L6;
        CardColors it2 = new CardColors(ColorSchemeKt.fromToken($this$defaultOutlinedCardColors, OutlinedCardTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m2056contentColorFor4WTKRHQ($this$defaultOutlinedCardColors, ColorSchemeKt.fromToken($this$defaultOutlinedCardColors, OutlinedCardTokens.INSTANCE.getContainerColor())), ColorSchemeKt.fromToken($this$defaultOutlinedCardColors, OutlinedCardTokens.INSTANCE.getContainerColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.m2056contentColorFor4WTKRHQ($this$defaultOutlinedCardColors, ColorSchemeKt.fromToken($this$defaultOutlinedCardColors, OutlinedCardTokens.INSTANCE.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultOutlinedCardColors.setDefaultOutlinedCardColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final BorderStroke outlinedCardBorder(boolean enabled, Composer $composer, int $changed, int r13) {
        ComposerKt.sourceInformationMarkerStart($composer, -392936593, "C(outlinedCardBorder)626@28402L72:Card.kt#uh7d8r");
        if ((r13 & 1) == 0) goto L6;
        enabled = true;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(-392936593, $changed, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:617)");
    L9:
        if (enabled == false) goto L11;
        $composer.startReplaceGroup(-134409770);
        ComposerKt.sourceInformation($composer, "620@28131L5");
        long color = ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getOutlineColor(), $composer, 6);
        $composer.endReplaceGroup();
    L12:
        ComposerKt.sourceInformationMarkerStart($composer, -974156849, "CC(remember):Card.kt#9igjgp");
        boolean invalid$iv = $composer.changed(color);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L15;
    L18:
        Object value$iv = BorderStrokeKt.m261BorderStrokecXLIe8U(OutlinedCardTokens.INSTANCE.m3478getOutlineWidthD9Ej5fM(), color);
        $composer.updateRememberedValue(value$iv);
    L19:
        BorderStroke r6 = (BorderStroke) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventEnd();
    L22:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L15:
        if (it$iv == Composer.Companion.getEmpty()) goto L18;
        value$iv = it$iv;
        goto L19
    L11:
        $composer.startReplaceGroup(-134330379);
        ComposerKt.sourceInformation($composer, "622@28214L5,624@28366L5");
        color = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getDisabledOutlineColor(), $composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(ElevatedCardTokens.INSTANCE.getContainerColor(), $composer, 6));
        $composer.endReplaceGroup();
        goto L12
    }
}
