package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J:\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 JN\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J:\u0010%\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001eJ\r\u0010'\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 JN\u0010'\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010$J\r\u0010)\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J:\u0010)\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010\u001eJ\r\u0010+\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 JN\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010$J\u0015\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u00101J\r\u00102\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J:\u00102\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001eJ\u001f\u00104\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\u0006\u00105\u001a\u000200H\u0007¢\u0006\u0002\u00106J\r\u00107\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 JN\u00107\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010$J\u001e\u00109\u001a\u00020\n*\u00020\u000b2\u0006\u0010:\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001e\u0010=\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010:\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001e\u0010@\u001a\u00020\n*\u00020\u000b2\u0006\u0010:\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\bA\u0010<J\u001e\u0010B\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010:\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\bC\u0010?R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\u0014\u001a\u00020\u000f*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Landroidx/compose/material3/IconButtonDefaults;", "", "()V", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "defaultFilledIconButtonColors", "Landroidx/compose/material3/IconButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultFilledIconButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/IconButtonColors;", "defaultFilledIconToggleButtonColors", "Landroidx/compose/material3/IconToggleButtonColors;", "getDefaultFilledIconToggleButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/IconToggleButtonColors;", "defaultFilledTonalIconButtonColors", "getDefaultFilledTonalIconButtonColors$material3_release", "defaultFilledTonalIconToggleButtonColors", "getDefaultFilledTonalIconToggleButtonColors$material3_release", "filledIconButtonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "filledIconButtonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconButtonColors;", "filledIconToggleButtonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconToggleButtonColors;", "checkedContainerColor", "checkedContentColor", "filledIconToggleButtonColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconToggleButtonColors;", "filledTonalIconButtonColors", "filledTonalIconButtonColors-ro_MJ88", "filledTonalIconToggleButtonColors", "filledTonalIconToggleButtonColors-5tl4gsc", "iconButtonColors", "iconButtonColors-ro_MJ88", "iconToggleButtonColors", "iconToggleButtonColors-5tl4gsc", "outlinedIconButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconButtonColors", "outlinedIconButtonColors-ro_MJ88", "outlinedIconToggleButtonBorder", "checked", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconToggleButtonColors", "outlinedIconToggleButtonColors-5tl4gsc", "defaultIconButtonColors", "localContentColor", "defaultIconButtonColors-4WTKRHQ$material3_release", "(Landroidx/compose/material3/ColorScheme;J)Landroidx/compose/material3/IconButtonColors;", "defaultIconToggleButtonColors", "defaultIconToggleButtonColors-4WTKRHQ$material3_release", "(Landroidx/compose/material3/ColorScheme;J)Landroidx/compose/material3/IconToggleButtonColors;", "defaultOutlinedIconButtonColors", "defaultOutlinedIconButtonColors-4WTKRHQ$material3_release", "defaultOutlinedIconToggleButtonColors", "defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IconButtonDefaults {
    public static final int $stable = 0;
    public static final IconButtonDefaults INSTANCE = null;

    static {
        INSTANCE = new IconButtonDefaults();
    }

    private IconButtonDefaults() {
    }

    public final Shape getFilledShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1265841879, "C584@27553L5:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1265841879, $changed, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:584)");
    L5:
        Shape r0 = ShapesKt.getValue(FilledIconButtonTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getOutlinedShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1327125527, "C588@27711L5:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1327125527, $changed, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:588)");
    L5:
        Shape r0 = ShapesKt.getValue(OutlinedIconButtonTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final IconButtonColors iconButtonColors(Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1519621781);
        ComposerKt.sourceInformation($composer, "C(iconButtonColors)593@27925L7,594@27968L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-1519621781, $changed, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)");
    L6:
        ProvidableCompositionLocal<Color> r1 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor = ((Color) r5).m4376unboximpl();
        IconButtonColors colors = m2263defaultIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6), contentColor);
        if (Color.m4367equalsimpl0(colors.m2260getContentColor0d7_KjU(), contentColor) == true) goto L9;
        IconButtonColors colors2 = IconButtonColors.m2255copyjRlVdoo$default(colors, 0, contentColor, 0, Color.m4365copywmQWz5c$default(contentColor, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        $composer.endReplaceGroup();
        return colors2;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return colors;
    }

    /* JADX INFO: renamed from: iconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2271iconButtonColorsro_MJ88(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, Composer $composer, int $changed, int r30) {
        ComposerKt.sourceInformationMarkerStart($composer, 999008085, "C(iconButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)617@28950L7,622@29180L11,623@29247L7:IconButton.kt#uh7d8r");
        if ((r30 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r30 & 2) == 0) goto L9;
        ProvidableCompositionLocal<Color> r2 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r9 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor2 = ((Color) r9).m4376unboximpl();
    L11:
        if ((r30 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r30 & 8) == 0) goto L17;
        long contentColor3 = contentColor2;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(contentColor3, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventStart(999008085, $changed, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:622)");
    L22:
        ColorScheme r1 = MaterialTheme.INSTANCE.getColorScheme($composer, 6);
        ProvidableCompositionLocal<Color> r3 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor4 = contentColor3;
        long contentColor5 = disabledContainerColor2;
        IconButtonColors r5 = m2263defaultIconButtonColors4WTKRHQ$material3_release(r1, ((Color) r4).m4376unboximpl()).m2258copyjRlVdoo(containerColor2, contentColor4, contentColor5, disabledContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventEnd();
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L17:
        contentColor3 = contentColor2;
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

    /* JADX INFO: renamed from: defaultIconButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconButtonColors m2263defaultIconButtonColors4WTKRHQ$material3_release(ColorScheme $this$defaultIconButtonColors_u2d4WTKRHQ, long localContentColor) {
        IconButtonColors r0 = $this$defaultIconButtonColors_u2d4WTKRHQ.getDefaultIconButtonColorsCached$material3_release();
        if (r0 != null) goto L6;
        IconButtonColors it = new IconButtonColors(Color.Companion.m4401getTransparent0d7_KjU(), localContentColor, Color.Companion.m4401getTransparent0d7_KjU(), Color.m4365copywmQWz5c$default(localContentColor, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultIconButtonColors_u2d4WTKRHQ.setDefaultIconButtonColorsCached$material3_release(it);
        return it;
    L6:
        return r0;
    }

    public final IconToggleButtonColors iconToggleButtonColors(Composer $composer, int $changed) {
        $composer.startReplaceGroup(-589987581);
        ComposerKt.sourceInformation($composer, "C(iconToggleButtonColors)651@30397L7,652@30440L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-589987581, $changed, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:650)");
    L6:
        ProvidableCompositionLocal<Color> r1 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor = ((Color) r5).m4376unboximpl();
        IconToggleButtonColors colors = m2264defaultIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6), contentColor);
        if (Color.m4367equalsimpl0(colors.m2285getContentColor0d7_KjU(), contentColor) == true) goto L9;
        IconToggleButtonColors colors2 = IconToggleButtonColors.m2280copytNS2XkQ$default(colors, 0, contentColor, 0, Color.m4365copywmQWz5c$default(contentColor, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0, 0, 53, null);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        $composer.endReplaceGroup();
        return colors2;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return colors;
    }

    /* JADX INFO: renamed from: iconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2272iconToggleButtonColors5tl4gsc(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, long checkedContainerColor, long checkedContentColor, Composer $composer, int $changed, int r35) {
        ComposerKt.sourceInformationMarkerStart($composer, -2020719549, "C(iconToggleButtonColors)P(2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color)678@31629L7,685@31979L11,686@32052L7:IconButton.kt#uh7d8r");
        if ((r35 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r35 & 2) == 0) goto L9;
        ProvidableCompositionLocal<Color> r2 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r9 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor2 = ((Color) r9).m4376unboximpl();
    L11:
        if ((r35 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r35 & 8) == 0) goto L17;
        long contentColor3 = contentColor2;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(contentColor3, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
    L19:
        if ((r35 & 16) == 0) goto L21;
        long checkedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r35 & 32) == 0) goto L25;
        long checkedContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(-2020719549, $changed, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:685)");
    L30:
        ColorScheme r1 = MaterialTheme.INSTANCE.getColorScheme($composer, 6);
        ProvidableCompositionLocal<Color> r3 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor4 = contentColor3;
        long contentColor5 = disabledContainerColor2;
        IconToggleButtonColors r5 = m2264defaultIconToggleButtonColors4WTKRHQ$material3_release(r1, ((Color) r4).m4376unboximpl()).m2281copytNS2XkQ(containerColor2, contentColor4, contentColor5, disabledContentColor2, checkedContainerColor2, checkedContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L25:
        checkedContentColor2 = checkedContentColor;
        goto L27
    L21:
        checkedContainerColor2 = checkedContainerColor;
        goto L23
    L17:
        contentColor3 = contentColor2;
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

    /* JADX INFO: renamed from: defaultIconToggleButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconToggleButtonColors m2264defaultIconToggleButtonColors4WTKRHQ$material3_release(ColorScheme $this$defaultIconToggleButtonColors_u2d4WTKRHQ, long localContentColor) {
        IconToggleButtonColors r0 = $this$defaultIconToggleButtonColors_u2d4WTKRHQ.getDefaultIconToggleButtonColorsCached$material3_release();
        if (r0 != null) goto L6;
        IconToggleButtonColors it = new IconToggleButtonColors(Color.Companion.m4401getTransparent0d7_KjU(), localContentColor, Color.Companion.m4401getTransparent0d7_KjU(), Color.m4365copywmQWz5c$default(localContentColor, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m4401getTransparent0d7_KjU(), ColorSchemeKt.fromToken($this$defaultIconToggleButtonColors_u2d4WTKRHQ, IconButtonTokens.INSTANCE.getSelectedIconColor()), null);
        $this$defaultIconToggleButtonColors_u2d4WTKRHQ.setDefaultIconToggleButtonColorsCached$material3_release(it);
        return it;
    L6:
        return r0;
    }

    public final IconButtonColors filledIconButtonColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1857395287, "C(filledIconButtonColors)719@33486L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1857395287, $changed, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:719)");
    L5:
        IconButtonColors r0 = getDefaultFilledIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: filledIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2267filledIconButtonColorsro_MJ88(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, -669858473, "C(filledIconButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)732@34130L31,736@34326L11:IconButton.kt#uh7d8r");
        if ((r25 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r25 & 2) == 0) goto L9;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer, $changed & 14);
    L11:
        if ((r25 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r25 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(-669858473, $changed, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:736)");
    L21:
        IconButtonColors r2 = getDefaultFilledIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2258copyjRlVdoo(containerColor2, contentColor2, disabledContainerColor2, disabledContentColor2);
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

    public final IconButtonColors getDefaultFilledIconButtonColors$material3_release(ColorScheme $this$defaultFilledIconButtonColors) {
        IconButtonColors it = $this$defaultFilledIconButtonColors.getDefaultFilledIconButtonColorsCached$material3_release();
        if (it != null) goto L6;
        IconButtonColors it2 = new IconButtonColors(ColorSchemeKt.fromToken($this$defaultFilledIconButtonColors, FilledIconButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m2056contentColorFor4WTKRHQ($this$defaultFilledIconButtonColors, ColorSchemeKt.fromToken($this$defaultFilledIconButtonColors, FilledIconButtonTokens.INSTANCE.getContainerColor())), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilledIconButtonColors, FilledIconButtonTokens.INSTANCE.getDisabledContainerColor()), FilledIconButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilledIconButtonColors, FilledIconButtonTokens.INSTANCE.getDisabledColor()), FilledIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultFilledIconButtonColors.setDefaultFilledIconButtonColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final IconToggleButtonColors filledIconToggleButtonColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1554706367, "C(filledIconToggleButtonColors)766@35781L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1554706367, $changed, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:766)");
    L5:
        IconToggleButtonColors r0 = getDefaultFilledIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: filledIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2268filledIconToggleButtonColors5tl4gsc(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, long checkedContainerColor, long checkedContentColor, Composer $composer, int $changed, int r33) {
        ComposerKt.sourceInformationMarkerStart($composer, 1887173701, "C(filledIconToggleButtonColors)P(2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color)788@36995L38,790@37088L11:IconButton.kt#uh7d8r");
        if ((r33 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r33 & 2) == 0) goto L9;
        long contentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r33 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r33 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r33 & 16) == 0) goto L21;
        long checkedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r33 & 32) == 0) goto L25;
        long checkedContentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(checkedContainerColor2, $composer, ($changed >> 12) & 14);
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventStart(1887173701, $changed, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:790)");
    L29:
        IconToggleButtonColors r2 = getDefaultFilledIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2281copytNS2XkQ(containerColor2, contentColor2, disabledContainerColor2, disabledContentColor2, checkedContainerColor2, checkedContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventEnd();
    L32:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    L25:
        checkedContentColor2 = checkedContentColor;
        goto L27
    L21:
        checkedContainerColor2 = checkedContainerColor;
        goto L23
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

    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColors$material3_release(ColorScheme $this$defaultFilledIconToggleButtonColors) {
        IconToggleButtonColors it = $this$defaultFilledIconToggleButtonColors.getDefaultFilledIconToggleButtonColorsCached$material3_release();
        if (it != null) goto L6;
        IconToggleButtonColors it2 = new IconToggleButtonColors(ColorSchemeKt.fromToken($this$defaultFilledIconToggleButtonColors, FilledIconButtonTokens.INSTANCE.getUnselectedContainerColor()), ColorSchemeKt.fromToken($this$defaultFilledIconToggleButtonColors, FilledIconButtonTokens.INSTANCE.getToggleUnselectedColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilledIconToggleButtonColors, FilledIconButtonTokens.INSTANCE.getDisabledContainerColor()), FilledIconButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilledIconToggleButtonColors, FilledIconButtonTokens.INSTANCE.getDisabledColor()), FilledIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultFilledIconToggleButtonColors, FilledIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.m2056contentColorFor4WTKRHQ($this$defaultFilledIconToggleButtonColors, ColorSchemeKt.fromToken($this$defaultFilledIconToggleButtonColors, FilledIconButtonTokens.INSTANCE.getSelectedContainerColor())), null);
        $this$defaultFilledIconToggleButtonColors.setDefaultFilledIconToggleButtonColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final IconButtonColors filledTonalIconButtonColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1099140437, "C(filledTonalIconButtonColors)830@39188L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1099140437, $changed, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:830)");
    L5:
        IconButtonColors r0 = getDefaultFilledTonalIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: filledTonalIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2269filledTonalIconButtonColorsro_MJ88(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, -18532843, "C(filledTonalIconButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)844@39854L31,848@40050L11:IconButton.kt#uh7d8r");
        if ((r25 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r25 & 2) == 0) goto L9;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer, $changed & 14);
    L11:
        if ((r25 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r25 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(-18532843, $changed, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:848)");
    L21:
        IconButtonColors r2 = getDefaultFilledTonalIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2258copyjRlVdoo(containerColor2, contentColor2, disabledContainerColor2, disabledContentColor2);
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

    public final IconButtonColors getDefaultFilledTonalIconButtonColors$material3_release(ColorScheme $this$defaultFilledTonalIconButtonColors) {
        IconButtonColors it = $this$defaultFilledTonalIconButtonColors.getDefaultFilledTonalIconButtonColorsCached$material3_release();
        if (it != null) goto L6;
        IconButtonColors it2 = new IconButtonColors(ColorSchemeKt.fromToken($this$defaultFilledTonalIconButtonColors, FilledTonalIconButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m2056contentColorFor4WTKRHQ($this$defaultFilledTonalIconButtonColors, ColorSchemeKt.fromToken($this$defaultFilledTonalIconButtonColors, FilledTonalIconButtonTokens.INSTANCE.getContainerColor())), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilledTonalIconButtonColors, FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor()), FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilledTonalIconButtonColors, FilledTonalIconButtonTokens.INSTANCE.getDisabledColor()), FilledTonalIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultFilledTonalIconButtonColors.setDefaultFilledTonalIconButtonColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final IconToggleButtonColors filledTonalIconToggleButtonColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 434219587, "C(filledTonalIconToggleButtonColors)878@41565L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(434219587, $changed, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:878)");
    L5:
        IconToggleButtonColors r0 = getDefaultFilledTonalIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: filledTonalIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2270filledTonalIconToggleButtonColors5tl4gsc(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, long checkedContainerColor, long checkedContentColor, Composer $composer, int $changed, int r33) {
        ComposerKt.sourceInformationMarkerStart($composer, -19426557, "C(filledTonalIconToggleButtonColors)P(2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color)894@42431L31,900@42747L11:IconButton.kt#uh7d8r");
        if ((r33 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r33 & 2) == 0) goto L9;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer, $changed & 14);
    L11:
        if ((r33 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r33 & 8) == 0) goto L17;
        long disabledContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r33 & 16) == 0) goto L21;
        long checkedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r33 & 32) == 0) goto L25;
        long checkedContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventStart(-19426557, $changed, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:900)");
    L29:
        IconToggleButtonColors r2 = getDefaultFilledTonalIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2281copytNS2XkQ(containerColor2, contentColor2, disabledContainerColor2, disabledContentColor2, checkedContainerColor2, checkedContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventEnd();
    L32:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    L25:
        checkedContentColor2 = checkedContentColor;
        goto L27
    L21:
        checkedContainerColor2 = checkedContainerColor;
        goto L23
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

    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColors$material3_release(ColorScheme $this$defaultFilledTonalIconToggleButtonColors) {
        IconToggleButtonColors it = $this$defaultFilledTonalIconToggleButtonColors.getDefaultFilledTonalIconToggleButtonColorsCached$material3_release();
        if (it != null) goto L6;
        IconToggleButtonColors it2 = new IconToggleButtonColors(ColorSchemeKt.fromToken($this$defaultFilledTonalIconToggleButtonColors, FilledTonalIconButtonTokens.INSTANCE.getUnselectedContainerColor()), ColorSchemeKt.m2056contentColorFor4WTKRHQ($this$defaultFilledTonalIconToggleButtonColors, ColorSchemeKt.fromToken($this$defaultFilledTonalIconToggleButtonColors, FilledTonalIconButtonTokens.INSTANCE.getUnselectedContainerColor())), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilledTonalIconToggleButtonColors, FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor()), FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilledTonalIconToggleButtonColors, FilledTonalIconButtonTokens.INSTANCE.getDisabledColor()), FilledTonalIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultFilledTonalIconToggleButtonColors, FilledTonalIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken($this$defaultFilledTonalIconToggleButtonColors, FilledTonalIconButtonTokens.INSTANCE.getToggleSelectedColor()), null);
        $this$defaultFilledTonalIconToggleButtonColors.setDefaultFilledTonalIconToggleButtonColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final IconButtonColors outlinedIconButtonColors(Composer $composer, int $changed) {
        $composer.startReplaceGroup(389287465);
        ComposerKt.sourceInformation($composer, "C(outlinedIconButtonColors)940@44790L11,940@44852L7,941@44906L7:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(389287465, $changed, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:938)");
    L6:
        ColorScheme r1 = MaterialTheme.INSTANCE.getColorScheme($composer, 6);
        ProvidableCompositionLocal<Color> r2 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r8 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        IconButtonColors colors = m2265defaultOutlinedIconButtonColors4WTKRHQ$material3_release(r1, ((Color) r8).m4376unboximpl());
        ProvidableCompositionLocal<Color> r3 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor = ((Color) r6).m4376unboximpl();
        if (Color.m4367equalsimpl0(colors.m2260getContentColor0d7_KjU(), contentColor) == true) goto L9;
        IconButtonColors r4 = IconButtonColors.m2255copyjRlVdoo$default(colors, 0, contentColor, 0, Color.m4365copywmQWz5c$default(contentColor, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        $composer.endReplaceGroup();
        return r4;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return colors;
    }

    /* JADX INFO: renamed from: outlinedIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m2273outlinedIconButtonColorsro_MJ88(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, Composer $composer, int $changed, int r30) {
        ComposerKt.sourceInformationMarkerStart($composer, -1030517545, "C(outlinedIconButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)965@45873L7,970@46107L11,971@46182L7:IconButton.kt#uh7d8r");
        if ((r30 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r30 & 2) == 0) goto L9;
        ProvidableCompositionLocal<Color> r2 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r9 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor2 = ((Color) r9).m4376unboximpl();
    L11:
        if ((r30 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r30 & 8) == 0) goto L17;
        long contentColor3 = contentColor2;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(contentColor3, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventStart(-1030517545, $changed, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:970)");
    L22:
        ColorScheme r1 = MaterialTheme.INSTANCE.getColorScheme($composer, 6);
        ProvidableCompositionLocal<Color> r3 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor4 = contentColor3;
        long contentColor5 = disabledContainerColor2;
        IconButtonColors r5 = m2265defaultOutlinedIconButtonColors4WTKRHQ$material3_release(r1, ((Color) r4).m4376unboximpl()).m2258copyjRlVdoo(containerColor2, contentColor4, contentColor5, disabledContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventEnd();
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L17:
        contentColor3 = contentColor2;
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

    /* JADX INFO: renamed from: defaultOutlinedIconButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconButtonColors m2265defaultOutlinedIconButtonColors4WTKRHQ$material3_release(ColorScheme $this$defaultOutlinedIconButtonColors_u2d4WTKRHQ, long localContentColor) {
        IconButtonColors r0 = $this$defaultOutlinedIconButtonColors_u2d4WTKRHQ.getDefaultOutlinedIconButtonColorsCached$material3_release();
        if (r0 != null) goto L6;
        IconButtonColors it = new IconButtonColors(Color.Companion.m4401getTransparent0d7_KjU(), localContentColor, Color.Companion.m4401getTransparent0d7_KjU(), Color.m4365copywmQWz5c$default(localContentColor, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultOutlinedIconButtonColors_u2d4WTKRHQ.setDefaultOutlinedIconButtonColorsCached$material3_release(it);
        return it;
    L6:
        return r0;
    }

    public final IconToggleButtonColors outlinedIconToggleButtonColors(Composer $composer, int $changed) {
        $composer.startReplaceGroup(-779749183);
        ComposerKt.sourceInformation($composer, "C(outlinedIconToggleButtonColors)1001@47390L7,1002@47433L11:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-779749183, $changed, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:1000)");
    L6:
        ProvidableCompositionLocal<Color> r1 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor = ((Color) r5).m4376unboximpl();
        IconToggleButtonColors colors = m2266defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6), contentColor);
        if (Color.m4367equalsimpl0(colors.m2285getContentColor0d7_KjU(), contentColor) == true) goto L9;
        IconToggleButtonColors colors2 = IconToggleButtonColors.m2280copytNS2XkQ$default(colors, 0, contentColor, 0, Color.m4365copywmQWz5c$default(contentColor, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0, 0, 53, null);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        $composer.endReplaceGroup();
        return colors2;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return colors;
    }

    /* JADX INFO: renamed from: outlinedIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m2274outlinedIconToggleButtonColors5tl4gsc(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, long checkedContainerColor, long checkedContentColor, Composer $composer, int $changed, int r35) {
        ComposerKt.sourceInformationMarkerStart($composer, 2130592709, "C(outlinedIconToggleButtonColors)P(2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color)1028@48650L7,1033@48932L38,1035@49025L11,1036@49106L7:IconButton.kt#uh7d8r");
        if ((r35 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r35 & 2) == 0) goto L9;
        ProvidableCompositionLocal<Color> r3 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r10 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor2 = ((Color) r10).m4376unboximpl();
    L11:
        if ((r35 & 4) == 0) goto L13;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r35 & 8) == 0) goto L17;
        long contentColor3 = contentColor2;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(contentColor3, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
    L19:
        if ((r35 & 16) == 0) goto L21;
        long checkedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r35 & 32) == 0) goto L25;
        long checkedContentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(checkedContainerColor2, $composer, ($changed >> 12) & 14);
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventStart(2130592709, $changed, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:1035)");
    L29:
        ColorScheme r2 = MaterialTheme.INSTANCE.getColorScheme($composer, 6);
        ProvidableCompositionLocal<Color> r4 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long contentColor4 = contentColor3;
        long contentColor5 = disabledContainerColor2;
        IconToggleButtonColors r6 = m2266defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(r2, ((Color) r5).m4376unboximpl()).m2281copytNS2XkQ(containerColor2, contentColor4, contentColor5, disabledContentColor2, checkedContainerColor2, checkedContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventEnd();
    L32:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L25:
        checkedContentColor2 = checkedContentColor;
        goto L27
    L21:
        checkedContainerColor2 = checkedContainerColor;
        goto L23
    L17:
        contentColor3 = contentColor2;
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

    /* JADX INFO: renamed from: defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconToggleButtonColors m2266defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(ColorScheme $this$defaultOutlinedIconToggleButtonColors_u2d4WTKRHQ, long localContentColor) {
        IconToggleButtonColors r0 = $this$defaultOutlinedIconToggleButtonColors_u2d4WTKRHQ.getDefaultIconToggleButtonColorsCached$material3_release();
        if (r0 != null) goto L6;
        IconToggleButtonColors it = new IconToggleButtonColors(Color.Companion.m4401getTransparent0d7_KjU(), localContentColor, Color.Companion.m4401getTransparent0d7_KjU(), Color.m4365copywmQWz5c$default(localContentColor, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultOutlinedIconToggleButtonColors_u2d4WTKRHQ, OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.m2056contentColorFor4WTKRHQ($this$defaultOutlinedIconToggleButtonColors_u2d4WTKRHQ, ColorSchemeKt.fromToken($this$defaultOutlinedIconToggleButtonColors_u2d4WTKRHQ, OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor())), null);
        $this$defaultOutlinedIconToggleButtonColors_u2d4WTKRHQ.setDefaultOutlinedIconToggleButtonColorsCached$material3_release(it);
        return it;
    L6:
        return r0;
    }

    public final BorderStroke outlinedIconToggleButtonBorder(boolean enabled, boolean checked, Composer $composer, int $changed) {
        $composer.startReplaceGroup(1244729690);
        ComposerKt.sourceInformation($composer, "C(outlinedIconToggleButtonBorder)P(1)1082@51041L33:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1244729690, $changed, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:1078)");
    L5:
        if (checked == true) goto L7;
        BorderStroke r0 = outlinedIconButtonBorder(enabled, $composer, ($changed & 14) | (($changed >> 3) & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventEnd();
    L14:
        $composer.endReplaceGroup();
        return r0;
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventEnd();
    L9:
        $composer.endReplaceGroup();
        return null;
    }

    public final BorderStroke outlinedIconButtonBorder(boolean enabled, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -511461558, "C(outlinedIconButtonBorder)1100@51643L108:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-511461558, $changed, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:1091)");
    L6:
        if (enabled == false) goto L8;
        $composer.startReplaceGroup(1186104514);
        ComposerKt.sourceInformation($composer, "1094@51433L7");
        ProvidableCompositionLocal<Color> r2 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r0 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long color = ((Color) r0).m4376unboximpl();
        $composer.endReplaceGroup();
    L9:
        ComposerKt.sourceInformationMarkerStart($composer, 176816691, "CC(remember):IconButton.kt#9igjgp");
        boolean invalid$iv = $composer.changed(color);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L12;
    L15:
        Object value$iv = BorderStrokeKt.m261BorderStrokecXLIe8U(OutlinedIconButtonTokens.INSTANCE.m3482getUnselectedOutlineWidthD9Ej5fM(), color);
        $composer.updateRememberedValue(value$iv);
    L16:
        BorderStroke r7 = (BorderStroke) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r7;
    L12:
        if (it$iv == Composer.Companion.getEmpty()) goto L15;
        value$iv = it$iv;
        goto L16
    L8:
        $composer.startReplaceGroup(1186170420);
        ComposerKt.sourceInformation($composer, "1096@51496L7");
        ProvidableCompositionLocal<Color> r3 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r1 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        color = Color.m4365copywmQWz5c$default(((Color) r1).m4376unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        $composer.endReplaceGroup();
        goto L9
    }
}
