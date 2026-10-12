package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010!J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\r2!\b\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2%\b\u0002\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-J3\u0010\u001e\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u00100J3\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u00103J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\r2!\b\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2%\b\u0002\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u00104J\r\u0010\u0017\u001a\u00020\rH\u0007¢\u0006\u0002\u00105Jv\u0010\u0017\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020)2\b\b\u0002\u00107\u001a\u00020)2\b\b\u0002\u00108\u001a\u00020)2\b\b\u0002\u00109\u001a\u00020)2\b\b\u0002\u0010:\u001a\u00020)2\b\b\u0002\u0010;\u001a\u00020)2\b\b\u0002\u0010<\u001a\u00020)2\b\b\u0002\u0010=\u001a\u00020)2\b\b\u0002\u0010>\u001a\u00020)2\b\b\u0002\u0010?\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ2\u0010\"\u001a\u00020\u00122\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010GJÄ\u0001\u0010H\u001a\u00020\u0012*\u00020$2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u00109\u001a\u00020)2\u0006\u00107\u001a\u00020)2\u0006\u0010:\u001a\u00020)2\u0006\u00108\u001a\u00020)2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u001f\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2#\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\u0006\u0010Q\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ>\u0010T\u001a\u00020\u0012*\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020U2\u0006\u0010E\u001a\u00020)2\u0006\u0010V\u001a\u00020L2\u0006\u0010W\u001a\u00020LH\u0002ø\u0001\u0000¢\u0006\u0004\bX\u0010YR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "()V", "TickSize", "Landroidx/compose/ui/unit/Dp;", "getTickSize-D9Ej5fM", "()F", "F", "TrackStopIndicatorSize", "getTrackStopIndicatorSize-D9Ej5fM", "trackPath", "Landroidx/compose/ui/graphics/Path;", "defaultSliderColors", "Landroidx/compose/material3/SliderColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSliderColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "enabled", "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "rangeSliderState", "Landroidx/compose/material3/RangeSliderState;", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "drawStopIndicator", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "drawTick", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Color;", "thumbTrackGapSize", "trackInsideCornerSize", "Track-4EFweAY", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "sliderState", "Landroidx/compose/material3/SliderState;", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "drawScope", "offset", "size", "color", "drawStopIndicator-x3O1jOs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V", "drawTrack", "tickFractions", "", "activeRangeStart", "", "activeRangeEnd", "height", "startThumbWidth", "endThumbWidth", "isRangeSlider", "drawTrack-ngJ0SCU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V", "drawTrackPath", "Landroidx/compose/ui/geometry/Size;", "startCornerRadius", "endCornerRadius", "drawTrackPath-Cx2C_VA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = null;
    private static final float TickSize = 0.0f;
    private static final float TrackStopIndicatorSize = 0.0f;
    private static final Path trackPath = null;

    private SliderDefaults() {
    }

    /* JADX INFO: renamed from: access$drawStopIndicator-x3O1jOs, reason: not valid java name */
    public static final /* synthetic */ void m2614access$drawStopIndicatorx3O1jOs(SliderDefaults $this, DrawScope drawScope, long offset, float size, long color) {
        $this.m2616drawStopIndicatorx3O1jOs(drawScope, offset, size, color);
    }

    /* JADX INFO: renamed from: access$drawTrack-ngJ0SCU, reason: not valid java name */
    public static final /* synthetic */ void m2615access$drawTrackngJ0SCU(SliderDefaults $this, DrawScope $receiver, float[] tickFractions, float activeRangeStart, float activeRangeEnd, long inactiveTrackColor, long activeTrackColor, long inactiveTickColor, long activeTickColor, float height, float startThumbWidth, float endThumbWidth, float thumbTrackGapSize, float trackInsideCornerSize, Function2 drawStopIndicator, Function3 drawTick, boolean isRangeSlider) {
        $this.m2617drawTrackngJ0SCU($receiver, tickFractions, activeRangeStart, activeRangeEnd, inactiveTrackColor, activeTrackColor, inactiveTickColor, activeTickColor, height, startThumbWidth, endThumbWidth, thumbTrackGapSize, trackInsideCornerSize, drawStopIndicator, drawTick, isRangeSlider);
    }

    public final SliderColors colors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1376295968, "C(colors)845@36907L11:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1376295968, $changed, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:845)");
    L5:
        SliderColors r0 = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m2622colorsq0g_0yA(long thumbColor, long activeTrackColor, long activeTickColor, long inactiveTrackColor, long inactiveTickColor, long disabledThumbColor, long disabledActiveTrackColor, long disabledActiveTickColor, long disabledInactiveTrackColor, long disabledInactiveTickColor, Composer $composer, int $changed, int $changed1, int r50) {
        ComposerKt.sourceInformationMarkerStart($composer, 885588574, "C(colors)P(9:c#ui.graphics.Color,1:c#ui.graphics.Color,0:c#ui.graphics.Color,8:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color)887@39230L11:Slider.kt#uh7d8r");
        if ((r50 & 1) == 0) goto L5;
        long thumbColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r50 & 2) == 0) goto L9;
        long activeTrackColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r50 & 4) == 0) goto L13;
        long activeTickColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r50 & 8) == 0) goto L17;
        long inactiveTrackColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r50 & 16) == 0) goto L21;
        long inactiveTickColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r50 & 32) == 0) goto L25;
        long disabledThumbColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if ((r50 & 64) == 0) goto L29;
        long disabledActiveTrackColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L31:
        if ((r50 & 128) == 0) goto L33;
        long disabledActiveTickColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L35:
        if ((r50 & 256) == 0) goto L37;
        long disabledInactiveTrackColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L39:
        if ((r50 & 512) == 0) goto L41;
        long disabledInactiveTickColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventStart(885588574, $changed, $changed1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:887)");
    L46:
        SliderColors r1 = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2600copyK518z4(thumbColor2, activeTrackColor2, activeTickColor2, inactiveTrackColor2, inactiveTickColor2, disabledThumbColor2, disabledActiveTrackColor2, disabledActiveTickColor2, disabledInactiveTrackColor2, disabledInactiveTickColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L49;
        ComposerKt.traceEventEnd();
    L49:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L41:
        disabledInactiveTickColor2 = disabledInactiveTickColor;
        goto L43
    L37:
        disabledInactiveTrackColor2 = disabledInactiveTrackColor;
        goto L39
    L33:
        disabledActiveTickColor2 = disabledActiveTickColor;
        goto L35
    L29:
        disabledActiveTrackColor2 = disabledActiveTrackColor;
        goto L31
    L25:
        disabledThumbColor2 = disabledThumbColor;
        goto L27
    L21:
        inactiveTickColor2 = inactiveTickColor;
        goto L23
    L17:
        inactiveTrackColor2 = inactiveTrackColor;
        goto L19
    L13:
        activeTickColor2 = activeTickColor;
        goto L15
    L9:
        activeTrackColor2 = activeTrackColor;
        goto L11
    L5:
        thumbColor2 = thumbColor;
        goto L7
    }

    public final SliderColors getDefaultSliderColors$material3_release(ColorScheme $this$defaultSliderColors) {
        SliderColors it = $this$defaultSliderColors.getDefaultSliderColorsCached$material3_release();
        if (it != null) goto L6;
        SliderColors it2 = new SliderColors(ColorSchemeKt.fromToken($this$defaultSliderColors, SliderTokens.INSTANCE.getHandleColor()), ColorSchemeKt.fromToken($this$defaultSliderColors, SliderTokens.INSTANCE.getActiveTrackColor()), ColorSchemeKt.fromToken($this$defaultSliderColors, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken($this$defaultSliderColors, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken($this$defaultSliderColors, SliderTokens.INSTANCE.getActiveTrackColor()), ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSliderColors, SliderTokens.INSTANCE.getDisabledHandleColor()), SliderTokens.INSTANCE.getDisabledHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), $this$defaultSliderColors.m2043getSurface0d7_KjU()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSliderColors, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSliderColors, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSliderColors, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSliderColors, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultSliderColors.setDefaultSliderColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    /* JADX INFO: renamed from: Thumb-9LiSoMs, reason: not valid java name */
    public final void m2619Thumb9LiSoMs(final MutableInteractionSource interactionSource, Modifier modifier, SliderColors colors, boolean enabled, long thumbSize, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(-290277409);
        ComposerKt.sourceInformation($composer2, "C(Thumb)P(2,3!,4:c#ui.unit.DpSize)947@42562L8,951@42678L46,952@42767L658,952@42733L692,975@43824L5,971@43620L220:Slider.kt#uh7d8r");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r32 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        SliderColors colors2 = colors;
    L34:
        int r11 = r32 & 8;
        if (r11 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L45:
        int r13 = r32 & 16;
        if (r13 == 0) goto L49;
        $dirty = $dirty | 24576;
        long r14 = thumbSize;
    L57:
        if ((r32 & 32) == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L67:
        if (($dirty & 74899) == 74898) goto L69;
    L72:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L75;
    L81:
        if (r4 == 0) goto L84;
        modifier2 = Modifier.Companion;
    L84:
        if ((r32 & 4) == 0) goto L86;
        SliderColors colors3 = colors($composer2, ($dirty >> 15) & 14);
        $dirty = $dirty & (-897);
        colors2 = colors3;
    L86:
        if (r11 == 0) goto L88;
        enabled2 = true;
    L88:
        if (r13 == 0) goto L90;
        long thumbSize2 = SliderKt.access$getThumbSize$p();
    L91:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventStart(-290277409, $dirty, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
    L94:
        ComposerKt.sourceInformationMarkerStart($composer2, -1068636116, "CC(remember):Slider.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L97;
        Object value$iv = SnapshotStateKt.mutableStateListOf();
        $composer2.updateRememberedValue(value$iv);
    L98:
        SnapshotStateList interactions = (SnapshotStateList) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1068632656, "CC(remember):Slider.kt#9igjgp");
        if (($dirty & 14) != 4) goto L101;
        boolean invalid$iv = true;
    L102:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L105;
    L108:
        SliderDefaults$Thumb$1$1 value$iv2 = new SliderDefaults$Thumb$1$1(interactionSource, interactions, null);
        $composer2.updateRememberedValue(value$iv2);
    L109:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(interactionSource, (Function2) value$iv2, $composer2, $dirty & 14);
        if (interactions.isEmpty() == true) goto L112;
        float arg0$iv = DpSize.m7071getWidthD9Ej5fM(thumbSize2);
        long size = DpSize.m7064copyDwJknco$default(thumbSize2, Dp.m6973constructorimpl(arg0$iv / 2), 0.0f, 2, null);
    L113:
        SpacerKt.Spacer(BackgroundKt.m233backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m773size6HolHcs(modifier2, size), interactionSource, false, 2, null), colors2.m2611thumbColorvNxB06k$material3_release(enabled2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), $composer2, 6)), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L116;
        ComposerKt.traceEventEnd();
    L116:
        final Modifier modifier3 = modifier2;
        final long thumbSize3 = thumbSize2;
        final SliderColors colors4 = colors2;
        final boolean enabled3 = enabled2;
    L117:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L121;
        r12.updateScope(new SliderDefaults$Thumb$2(this, interactionSource, modifier3, colors4, enabled3, thumbSize3, $changed, r32));
        return;
    L121:
        return;
    L112:
        size = thumbSize2;
        goto L113
    L105:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L108;
        value$iv2 = it$iv2;
        goto L109
    L101:
        invalid$iv = false;
        goto L102
    L97:
        value$iv = it$iv;
        goto L98
    L90:
        thumbSize2 = r14;
        goto L91
    L75:
        if ($composer2.getDefaultsInvalid() == true) goto L81;
        $composer2.skipToGroupEnd();
        if ((r32 & 4) == 0) goto L80;
        $dirty = $dirty & (-897);
    L80:
        thumbSize2 = r14;
        goto L91
    L69:
        if ($composer2.getSkipping() == false) goto L72;
        $composer2.skipToGroupEnd();
        modifier3 = modifier2;
        thumbSize3 = r14;
        colors4 = colors2;
        enabled3 = enabled2;
        goto L117
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        if ($composer2.changed(this) == false) goto L64;
        int r16 = 131072;
    L65:
        $dirty = $dirty | r16;
        goto L67
    L64:
        r16 = 65536;
        goto L65
    L49:
        if (($changed & 24576) != 0) goto L55;
        r14 = thumbSize;
        if ($composer2.changed(r14) == false) goto L53;
        int r17 = 16384;
    L54:
        $dirty = $dirty | r17;
        goto L57
    L53:
        r17 = 8192;
        goto L54
    L55:
        r14 = thumbSize;
        goto L57
    L38:
        if (($changed & 3072) != 0) goto L44;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L42;
        int r15 = 2048;
    L43:
        $dirty = $dirty | r15;
        goto L45
    L42:
        r15 = 1024;
        goto L43
    L44:
        enabled2 = enabled;
        goto L45
    L26:
        if ((r32 & 4) != 0) goto L30;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L31;
        int r18 = 256;
    L32:
        $dirty = $dirty | r18;
    L31:
        r18 = 128;
        goto L32
    L30:
        colors2 = colors;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r9 = 32;
    L21:
        $dirty = $dirty | r9;
        goto L24
    L20:
        r9 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(interactionSource) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L12
    L10:
        r5 = 2;
        goto L11
    }

    @Deprecated(message = "Use version that supports slider state")
    public final void Track(final SliderPositions sliderPositions, Modifier modifier, SliderColors colors, boolean enabled, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(-1546713545);
        ComposerKt.sourceInformation($composer2, "C(Track)P(3,2)997@44755L8,1004@45160L1834,1004@45108L1886:Slider.kt#uh7d8r");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        final SliderPositions r12 = sliderPositions;
    L13:
        int r3 = r32 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r5 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        SliderColors r7 = colors;
    L35:
        int r9 = r32 & 8;
        if (r9 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r10 = enabled;
    L47:
        if ((r32 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L57:
        if (($dirty & 9363) == 9362) goto L59;
    L62:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L65;
    L71:
        if (r3 == 0) goto L73;
        Modifier.Companion modifier2 = Modifier.Companion;
    L75:
        if ((r32 & 4) == 0) goto L77;
        SliderColors colors2 = colors($composer2, ($dirty >> 12) & 14);
        $dirty = $dirty & (-897);
    L78:
        if (r9 == 0) goto L80;
        boolean enabled2 = true;
    L81:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L84;
        ComposerKt.traceEventStart(-1546713545, $dirty, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:999)");
    L84:
        final long inactiveTrackColor = colors2.m2613trackColorWaAFU9c$material3_release(enabled2, false);
        final long activeTrackColor = colors2.m2613trackColorWaAFU9c$material3_release(enabled2, true);
        int $dirty2 = $dirty;
        final long inactiveTickColor = colors2.m2612tickColorWaAFU9c$material3_release(enabled2, false);
        final long activeTickColor = colors2.m2612tickColorWaAFU9c$material3_release(enabled2, true);
        Modifier r2 = SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), SliderKt.getTrackHeight());
        ComposerKt.sourceInformationMarkerStart($composer2, -801023075, "CC(remember):Slider.kt#9igjgp");
        boolean r4 = $composer2.changed(inactiveTrackColor);
        Modifier modifier3 = modifier2;
        if (($dirty2 & 14) != 4) goto L87;
        boolean r11 = true;
    L88:
        boolean invalid$iv = (((r4 | r11) | $composer2.changed(activeTrackColor)) | $composer2.changed(inactiveTickColor)) | $composer2.changed(activeTickColor);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L95;
        if (it$iv == Composer.Companion.getEmpty()) goto L95;
        Object value$iv = it$iv;
    L96:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r2, (Function1) value$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L99;
        ComposerKt.traceEventEnd();
    L99:
        final SliderColors colors3 = colors2;
        final boolean enabled3 = enabled2;
        final Modifier modifier4 = modifier3;
    L100:
        ScopeUpdateScope r13 = $composer2.endRestartGroup();
        if (r13 == null) goto L104;
        r13.updateScope(new AnonymousClass2(this, sliderPositions, modifier4, colors3, enabled3, $changed, r32));
        return;
    L104:
        return;
    L95:
        value$iv = (Function1) new SliderDefaults$Track$1$1(inactiveTrackColor, r12, activeTrackColor, inactiveTickColor, activeTickColor);
        $composer2.updateRememberedValue(value$iv);
        goto L96
    L87:
        r11 = false;
        goto L88
    L80:
        enabled2 = r10;
        goto L81
    L77:
        colors2 = r7;
        goto L78
    L73:
        modifier2 = r5;
        goto L75
    L65:
        if ($composer2.getDefaultsInvalid() == true) goto L71;
        $composer2.skipToGroupEnd();
        if ((r32 & 4) == 0) goto L70;
        $dirty = $dirty & (-897);
    L70:
        modifier2 = r5;
        colors2 = r7;
        enabled2 = r10;
        goto L81
    L59:
        if ($composer2.getSkipping() == false) goto L62;
        $composer2.skipToGroupEnd();
        modifier4 = r5;
        colors3 = r7;
        enabled3 = r10;
        goto L100
    L50:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changed(this) == false) goto L54;
        int r14 = 16384;
    L55:
        $dirty = $dirty | r14;
        goto L57
    L54:
        r14 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        r10 = enabled;
        if ($composer2.changed(r10) == false) goto L43;
        int r15 = 2048;
    L44:
        $dirty = $dirty | r15;
        goto L47
    L43:
        r15 = 1024;
        goto L44
    L45:
        r10 = enabled;
        goto L47
    L27:
        if ((r32 & 4) != 0) goto L31;
        r7 = colors;
        if ($composer2.changed(r7) == false) goto L32;
        int r16 = 256;
    L33:
        $dirty = $dirty | r16;
    L32:
        r16 = 128;
        goto L33
    L31:
        r7 = colors;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
        goto L25
    L21:
        r8 = 16;
        goto L22
    L23:
        r5 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r12 = sliderPositions;
        if ($composer2.changed(r12) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    L12:
        r12 = sliderPositions;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacySliderSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "Track(sliderState, modifier, enabled, colors, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    public final /* synthetic */ void Track(final SliderState sliderState, Modifier modifier, SliderColors colors, boolean enabled, Composer $composer, final int $changed, final int r21) {
        Composer $composer2 = $composer.startRestartGroup(593554206);
        ComposerKt.sourceInformation($composer2, "C(Track)P(3,2)1079@48295L8,1082@48353L213:Slider.kt#uh7d8r");
        int $dirty = $changed;
        if ((r21 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r21 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r5 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        SliderColors r6 = colors;
    L34:
        int r7 = r21 & 8;
        if (r7 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean r8 = enabled;
    L46:
        if ((r21 & 16) == 0) goto L49;
        $dirty = $dirty | 24576;
    L56:
        if (($dirty & 9363) == 9362) goto L58;
    L61:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L64;
    L70:
        if (r4 == 0) goto L72;
        Modifier.Companion modifier2 = Modifier.Companion;
    L74:
        if ((r21 & 4) == 0) goto L76;
        SliderColors colors2 = colors($composer2, ($dirty >> 12) & 14);
        $dirty = $dirty & (-897);
    L77:
        if (r7 == 0) goto L79;
        int $dirty2 = $dirty;
        Modifier modifier3 = modifier2;
        final SliderColors colors3 = colors2;
        boolean enabled2 = true;
    L80:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L83;
        ComposerKt.traceEventStart(593554206, $dirty2, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1081)");
    L83:
        m2621Track4EFweAY(sliderState, modifier3, enabled2, colors3, null, null, SliderKt.access$getThumbTrackGapSize$p(), SliderKt.access$getTrackInsideCornerSize$p(), $composer2, ((((($dirty2 & 14) | 14155776) | ($dirty2 & 112)) | (($dirty2 >> 3) & 896)) | (($dirty2 << 3) & 7168)) | (234881024 & ($dirty2 << 12)), 48);
        if (ComposerKt.isTraceInProgress() == false) goto L86;
        ComposerKt.traceEventEnd();
    L86:
        final boolean enabled3 = enabled2;
        final Modifier modifier4 = modifier3;
    L87:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L91;
        r9.updateScope(new AnonymousClass3(this, sliderState, modifier4, colors3, enabled3, $changed, r21));
        return;
    L91:
        return;
    L79:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        colors3 = colors2;
        enabled2 = r8;
        goto L80
    L76:
        colors2 = r6;
        goto L77
    L72:
        modifier2 = r5;
        goto L74
    L64:
        if ($composer2.getDefaultsInvalid() == true) goto L70;
        $composer2.skipToGroupEnd();
        if ((r21 & 4) == 0) goto L69;
        $dirty = $dirty & (-897);
    L69:
        $dirty2 = $dirty;
        modifier3 = r5;
        colors3 = r6;
        enabled2 = r8;
        goto L80
    L58:
        if ($composer2.getSkipping() == false) goto L61;
        $composer2.skipToGroupEnd();
        modifier4 = r5;
        colors3 = r6;
        enabled3 = r8;
        goto L87
    L49:
        if (($changed & 24576) != 0) goto L56;
        if ($composer2.changed(this) == false) goto L53;
        int r10 = 16384;
    L54:
        $dirty = $dirty | r10;
        goto L56
    L53:
        r10 = 8192;
        goto L54
    L38:
        if (($changed & 3072) != 0) goto L44;
        r8 = enabled;
        if ($composer2.changed(r8) == false) goto L42;
        int r11 = 2048;
    L43:
        $dirty = $dirty | r11;
        goto L46
    L42:
        r11 = 1024;
        goto L43
    L44:
        r8 = enabled;
        goto L46
    L26:
        if ((r21 & 4) != 0) goto L30;
        r6 = colors;
        if ($composer2.changed(r6) == false) goto L31;
        int r12 = 256;
    L32:
        $dirty = $dirty | r12;
    L31:
        r12 = 128;
        goto L32
    L30:
        r6 = colors;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L20;
        int r13 = 32;
    L21:
        $dirty = $dirty | r13;
        goto L24
    L20:
        r13 = 16;
        goto L21
    L22:
        r5 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(sliderState) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L12
    L10:
        r14 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: Track-4EFweAY, reason: not valid java name */
    public final void m2621Track4EFweAY(final SliderState sliderState, Modifier modifier, boolean enabled, SliderColors colors, Function2<? super DrawScope, ? super Offset, Unit> r32, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> r33, float thumbTrackGapSize, float trackInsideCornerSize, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(49984771);
        ComposerKt.sourceInformation($composer2, "C(Track)P(5,4,3!3,6:c#ui.unit.Dp,7:c#ui.unit.Dp)1114@49756L8,1115@49825L232,1137@50806L7,1138@50862L595,1133@50659L798:Slider.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r7 = r38 & 2;
        if (r7 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L23:
        int r9 = r38 & 4;
        if (r9 == 0) goto L27;
        $dirty = $dirty | 384;
        final boolean enabled2 = enabled;
    L35:
        if (($changed & 3072) == 0) goto L37;
        final SliderColors colors2 = colors;
    L46:
        if (($changed & 24576) == 0) goto L48;
        Function2<? super DrawScope, ? super Offset, Unit> r14 = r32;
    L56:
        int r16 = r38 & 32;
        if (r16 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> r15 = r33;
    L67:
        int r18 = r38 & 64;
        if (r18 == 0) goto L71;
        $dirty = $dirty | 1572864;
        float thumbTrackGapSize2 = thumbTrackGapSize;
    L78:
        int r10 = r38 & 128;
        if (r10 == 0) goto L82;
        $dirty = $dirty | 12582912;
        float trackInsideCornerSize2 = trackInsideCornerSize;
    L90:
        if ((r38 & 256) == 0) goto L94;
        int r0 = 100663296;
    L92:
        $dirty = $dirty | r0;
    L100:
        if ((38347923 & $dirty) == 38347922) goto L102;
    L105:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L108;
    L117:
        if (r7 == 0) goto L119;
        modifier2 = Modifier.Companion;
    L119:
        if (r9 == 0) goto L122;
        enabled2 = true;
    L122:
        if ((r38 & 8) == 0) goto L125;
        SliderColors colors3 = colors($composer2, ($dirty >> 24) & 14);
        $dirty = $dirty & (-7169);
        colors2 = colors3;
    L125:
        if ((r38 & 16) == 0) goto L147;
        ComposerKt.sourceInformationMarkerStart($composer2, -800875397, "CC(remember):Slider.kt#9igjgp");
        if ((($dirty & 7168) ^ 3072) <= 2048) goto L131;
        if ($composer2.changed(colors2) == false) goto L131;
    L132:
        boolean r1 = true;
    L135:
        if (($dirty & 896) != 256) goto L137;
        boolean r8 = true;
    L138:
        boolean invalid$iv = r1 | r8;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L145;
        if (it$iv == Composer.Companion.getEmpty()) goto L145;
        Object value$iv = it$iv;
    L146:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty = $dirty & (-57345);
        r14 = (Function2) value$iv;
    L145:
        value$iv = (Function2) new SliderDefaults$Track$4$1(colors2, enabled2);
        $composer2.updateRememberedValue(value$iv);
        goto L146
    L137:
        r8 = false;
    L131:
        if (($dirty & 3072) == 2048) goto L132;
        r1 = false;
    L147:
        if (r16 == 0) goto L149;
        r15 = AnonymousClass5.INSTANCE;
    L149:
        if (r18 == 0) goto L151;
        thumbTrackGapSize2 = SliderKt.access$getThumbTrackGapSize$p();
    L151:
        if (r10 == 0) goto L153;
        SliderColors r3 = colors2;
        float thumbTrackGapSize3 = thumbTrackGapSize2;
        SliderColors colors4 = r3;
        trackInsideCornerSize2 = SliderKt.access$getTrackInsideCornerSize$p();
        Modifier modifier3 = modifier2;
        boolean enabled3 = enabled2;
    L154:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L157;
        ComposerKt.traceEventStart(49984771, $dirty, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1128)");
    L157:
        final long inactiveTrackColor = colors4.m2613trackColorWaAFU9c$material3_release(enabled3, false);
        float thumbTrackGapSize4 = thumbTrackGapSize3;
        final long activeTrackColor = colors4.m2613trackColorWaAFU9c$material3_release(enabled3, true);
        float trackInsideCornerSize3 = trackInsideCornerSize2;
        Function2<? super DrawScope, ? super Offset, Unit> r17 = r14;
        final long inactiveTickColor = colors4.m2612tickColorWaAFU9c$material3_release(enabled3, false);
        final long activeTickColor = colors4.m2612tickColorWaAFU9c$material3_release(enabled3, true);
        Modifier r2 = SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
        ProvidableCompositionLocal<LayoutDirection> r11 = CompositionLocalsKt.getLocalLayoutDirection();
        Modifier modifier4 = modifier3;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer2.consume(r11);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (r4 != LayoutDirection.Rtl) goto L160;
        float r5 = 180.0f;
    L161:
        Modifier r6 = RotateKt.rotate(r2, r5);
        ComposerKt.sourceInformationMarkerStart($composer2, -800841850, "CC(remember):Slider.kt#9igjgp");
        boolean r12 = ((($composer2.changedInstance(sliderState) | $composer2.changed(inactiveTrackColor)) | $composer2.changed(activeTrackColor)) | $composer2.changed(inactiveTickColor)) | $composer2.changed(activeTickColor);
        if (($dirty & 3670016) != 1048576) goto L164;
        boolean r13 = true;
    L165:
        boolean r19 = r12 | r13;
        if ((29360128 & $dirty) != 8388608) goto L168;
        boolean r20 = true;
    L169:
        boolean r21 = r19 | r20;
        if (((57344 & $dirty) ^ 24576) <= 16384) goto L175;
        Function2<? super DrawScope, ? super Offset, Unit> r22 = r17;
        if ($composer2.changed(r22) == false) goto L176;
        Function2<? super DrawScope, ? super Offset, Unit> r110 = r22;
    L178:
        boolean r23 = true;
    L180:
        boolean r24 = r21 | r23;
        if ((458752 & $dirty) != 131072) goto L183;
        boolean r25 = true;
    L184:
        boolean invalid$iv2 = r24 | r25;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L190;
        Composer $this$cache$iv = $composer2;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L191;
        Object value$iv2 = it$iv2;
        final float thumbTrackGapSize5 = thumbTrackGapSize4;
        final Function2<? super DrawScope, ? super Offset, Unit> r111 = r110;
        final float trackInsideCornerSize4 = trackInsideCornerSize3;
    L192:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Composer $composer3 = $composer2;
        CanvasKt.Canvas(r6, (Function1) value$iv2, $composer3, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L195;
        ComposerKt.traceEventEnd();
    L195:
        final float thumbTrackGapSize6 = thumbTrackGapSize5;
        final boolean enabled4 = enabled3;
        final SliderColors colors5 = colors4;
        final Modifier modifier5 = modifier4;
        final float trackInsideCornerSize5 = trackInsideCornerSize4;
        final Function2<? super DrawScope, ? super Offset, Unit> r26 = r111;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> r27 = r15;
    L196:
        ScopeUpdateScope r112 = $composer3.endRestartGroup();
        if (r112 == null) goto L200;
        r112.updateScope(new AnonymousClass7(this, sliderState, modifier5, enabled4, colors5, r26, r27, thumbTrackGapSize6, trackInsideCornerSize5, $changed, r38));
        return;
    L200:
        return;
    L191:
        thumbTrackGapSize5 = thumbTrackGapSize4;
        r111 = r110;
        trackInsideCornerSize4 = trackInsideCornerSize3;
        value$iv2 = (Function1) new SliderDefaults$Track$6$1(sliderState, inactiveTrackColor, activeTrackColor, inactiveTickColor, activeTickColor, thumbTrackGapSize5, trackInsideCornerSize4, r111, r15);
        $this$cache$iv.updateRememberedValue(value$iv2);
        goto L192
    L190:
        $this$cache$iv = $composer2;
        goto L191
    L183:
        r25 = false;
    L176:
        r110 = r22;
        if (($dirty & 24576) == 16384) goto L178;
        r23 = false;
        goto L180
    L175:
        r22 = r17;
        goto L176
    L168:
        r20 = false;
        goto L169
    L164:
        r13 = false;
        goto L165
    L160:
        r5 = 0.0f;
        goto L161
    L153:
        SliderColors r28 = colors2;
        thumbTrackGapSize3 = thumbTrackGapSize2;
        colors4 = r28;
        modifier3 = modifier2;
        enabled3 = enabled2;
        goto L154
    L108:
        if ($composer2.getDefaultsInvalid() == true) goto L117;
        $composer2.skipToGroupEnd();
        if ((r38 & 8) == 0) goto L114;
        $dirty = $dirty & (-7169);
    L114:
        if ((r38 & 16) == 0) goto L116;
        SliderColors r29 = colors2;
        thumbTrackGapSize3 = thumbTrackGapSize2;
        colors4 = r29;
        $dirty = (-57345) & $dirty;
        modifier3 = modifier2;
        enabled3 = enabled2;
        goto L154
    L116:
        SliderColors r30 = colors2;
        thumbTrackGapSize3 = thumbTrackGapSize2;
        colors4 = r30;
        modifier3 = modifier2;
        enabled3 = enabled2;
        goto L154
    L102:
        if ($composer2.getSkipping() == false) goto L105;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier5 = modifier2;
        colors5 = colors2;
        thumbTrackGapSize6 = thumbTrackGapSize2;
        enabled4 = enabled2;
        trackInsideCornerSize5 = trackInsideCornerSize2;
        r26 = r14;
        r27 = r15;
        goto L196
    L94:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changed(this) == false) goto L98;
        r0 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        goto L92
    L98:
        r0 = 33554432;
        goto L92
    L82:
        if (($changed & 12582912) != 0) goto L88;
        trackInsideCornerSize2 = trackInsideCornerSize;
        if ($composer2.changed(trackInsideCornerSize2) == false) goto L86;
        int r210 = 8388608;
    L87:
        $dirty = $dirty | r210;
        goto L90
    L86:
        r210 = 4194304;
        goto L87
    L88:
        trackInsideCornerSize2 = trackInsideCornerSize;
        goto L90
    L71:
        if (($changed & 1572864) != 0) goto L77;
        thumbTrackGapSize2 = thumbTrackGapSize;
        if ($composer2.changed(thumbTrackGapSize2) == false) goto L75;
        int r211 = 1048576;
    L76:
        $dirty = $dirty | r211;
        goto L78
    L75:
        r211 = 524288;
        goto L76
    L77:
        thumbTrackGapSize2 = thumbTrackGapSize;
        goto L78
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        r15 = r33;
        if ($composer2.changedInstance(r15) == false) goto L64;
        int r113 = 131072;
    L65:
        $dirty = $dirty | r113;
        goto L67
    L64:
        r113 = 65536;
        goto L65
    L66:
        r15 = r33;
        goto L67
    L48:
        if ((r38 & 16) != 0) goto L52;
        r14 = r32;
        if ($composer2.changedInstance(r14) == false) goto L53;
        int r114 = 16384;
    L54:
        $dirty = $dirty | r114;
    L53:
        r114 = 8192;
        goto L54
    L52:
        r14 = r32;
        goto L53
    L37:
        if ((r38 & 8) != 0) goto L41;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L42;
        int r115 = 2048;
    L43:
        $dirty = $dirty | r115;
    L42:
        r115 = 1024;
        goto L43
    L41:
        colors2 = colors;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L33;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L31;
        int r116 = 256;
    L32:
        $dirty = $dirty | r116;
        goto L35
    L31:
        r116 = 128;
        goto L32
    L33:
        enabled2 = enabled;
        goto L35
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r31 = 32;
    L21:
        $dirty = $dirty | r31;
        goto L23
    L20:
        r31 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(sliderState) == false) goto L10;
        int r34 = 4;
    L11:
        $dirty = $dirty | r34;
        goto L12
    L10:
        r34 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacyRangeSliderSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "Track(rangeSliderState, modifier, colors, enabled, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    public final /* synthetic */ void Track(final RangeSliderState rangeSliderState, Modifier modifier, SliderColors colors, boolean enabled, Composer $composer, final int $changed, final int r21) {
        Composer $composer2 = $composer.startRestartGroup(-1617869097);
        ComposerKt.sourceInformation($composer2, "C(Track)P(3,2)1187@52807L8,1190@52865L218:Slider.kt#uh7d8r");
        int $dirty = $changed;
        if ((r21 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r21 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r5 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        SliderColors r6 = colors;
    L34:
        int r7 = r21 & 8;
        if (r7 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean r8 = enabled;
    L46:
        if ((r21 & 16) == 0) goto L49;
        $dirty = $dirty | 24576;
    L56:
        if (($dirty & 9363) == 9362) goto L58;
    L61:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L64;
    L70:
        if (r4 == 0) goto L72;
        Modifier.Companion modifier2 = Modifier.Companion;
    L74:
        if ((r21 & 4) == 0) goto L76;
        SliderColors colors2 = colors($composer2, ($dirty >> 12) & 14);
        $dirty = $dirty & (-897);
    L77:
        if (r7 == 0) goto L79;
        int $dirty2 = $dirty;
        Modifier modifier3 = modifier2;
        final SliderColors colors3 = colors2;
        boolean enabled2 = true;
    L80:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L83;
        ComposerKt.traceEventStart(-1617869097, $dirty2, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1189)");
    L83:
        m2620Track4EFweAY(rangeSliderState, modifier3, enabled2, colors3, null, null, SliderKt.access$getThumbTrackGapSize$p(), SliderKt.access$getTrackInsideCornerSize$p(), $composer2, ((((($dirty2 & 14) | 14155776) | ($dirty2 & 112)) | (($dirty2 >> 3) & 896)) | (($dirty2 << 3) & 7168)) | (234881024 & ($dirty2 << 12)), 48);
        if (ComposerKt.isTraceInProgress() == false) goto L86;
        ComposerKt.traceEventEnd();
    L86:
        final boolean enabled3 = enabled2;
        final Modifier modifier4 = modifier3;
    L87:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L91;
        r9.updateScope(new AnonymousClass8(this, rangeSliderState, modifier4, colors3, enabled3, $changed, r21));
        return;
    L91:
        return;
    L79:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        colors3 = colors2;
        enabled2 = r8;
        goto L80
    L76:
        colors2 = r6;
        goto L77
    L72:
        modifier2 = r5;
        goto L74
    L64:
        if ($composer2.getDefaultsInvalid() == true) goto L70;
        $composer2.skipToGroupEnd();
        if ((r21 & 4) == 0) goto L69;
        $dirty = $dirty & (-897);
    L69:
        $dirty2 = $dirty;
        modifier3 = r5;
        colors3 = r6;
        enabled2 = r8;
        goto L80
    L58:
        if ($composer2.getSkipping() == false) goto L61;
        $composer2.skipToGroupEnd();
        modifier4 = r5;
        colors3 = r6;
        enabled3 = r8;
        goto L87
    L49:
        if (($changed & 24576) != 0) goto L56;
        if ($composer2.changed(this) == false) goto L53;
        int r10 = 16384;
    L54:
        $dirty = $dirty | r10;
        goto L56
    L53:
        r10 = 8192;
        goto L54
    L38:
        if (($changed & 3072) != 0) goto L44;
        r8 = enabled;
        if ($composer2.changed(r8) == false) goto L42;
        int r11 = 2048;
    L43:
        $dirty = $dirty | r11;
        goto L46
    L42:
        r11 = 1024;
        goto L43
    L44:
        r8 = enabled;
        goto L46
    L26:
        if ((r21 & 4) != 0) goto L30;
        r6 = colors;
        if ($composer2.changed(r6) == false) goto L31;
        int r12 = 256;
    L32:
        $dirty = $dirty | r12;
    L31:
        r12 = 128;
        goto L32
    L30:
        r6 = colors;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L20;
        int r13 = 32;
    L21:
        $dirty = $dirty | r13;
        goto L24
    L20:
        r13 = 16;
        goto L21
    L22:
        r5 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(rangeSliderState) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L12
    L10:
        r14 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: Track-4EFweAY, reason: not valid java name */
    public final void m2620Track4EFweAY(final RangeSliderState rangeSliderState, Modifier modifier, boolean enabled, SliderColors colors, Function2<? super DrawScope, ? super Offset, Unit> r32, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> r33, float thumbTrackGapSize, float trackInsideCornerSize, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(-541824132);
        ComposerKt.sourceInformation($composer2, "C(Track)P(5,4,3!3,6:c#ui.unit.Dp,7:c#ui.unit.Dp)1222@54320L8,1223@54389L232,1245@55370L7,1246@55426L706,1241@55223L909:Slider.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r7 = r38 & 2;
        if (r7 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L23:
        int r9 = r38 & 4;
        if (r9 == 0) goto L27;
        $dirty = $dirty | 384;
        final boolean enabled2 = enabled;
    L35:
        if (($changed & 3072) == 0) goto L37;
        final SliderColors colors2 = colors;
    L46:
        if (($changed & 24576) == 0) goto L48;
        Function2<? super DrawScope, ? super Offset, Unit> r14 = r32;
    L56:
        int r16 = r38 & 32;
        if (r16 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> r15 = r33;
    L67:
        int r18 = r38 & 64;
        if (r18 == 0) goto L71;
        $dirty = $dirty | 1572864;
        float thumbTrackGapSize2 = thumbTrackGapSize;
    L78:
        int r10 = r38 & 128;
        if (r10 == 0) goto L82;
        $dirty = $dirty | 12582912;
        float trackInsideCornerSize2 = trackInsideCornerSize;
    L90:
        if ((r38 & 256) == 0) goto L94;
        int r0 = 100663296;
    L92:
        $dirty = $dirty | r0;
    L100:
        if ((38347923 & $dirty) == 38347922) goto L102;
    L105:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L108;
    L117:
        if (r7 == 0) goto L119;
        modifier2 = Modifier.Companion;
    L119:
        if (r9 == 0) goto L122;
        enabled2 = true;
    L122:
        if ((r38 & 8) == 0) goto L125;
        SliderColors colors3 = colors($composer2, ($dirty >> 24) & 14);
        $dirty = $dirty & (-7169);
        colors2 = colors3;
    L125:
        if ((r38 & 16) == 0) goto L147;
        ComposerKt.sourceInformationMarkerStart($composer2, -800729349, "CC(remember):Slider.kt#9igjgp");
        if ((($dirty & 7168) ^ 3072) <= 2048) goto L131;
        if ($composer2.changed(colors2) == false) goto L131;
    L132:
        boolean r1 = true;
    L135:
        if (($dirty & 896) != 256) goto L137;
        boolean r8 = true;
    L138:
        boolean invalid$iv = r1 | r8;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L145;
        if (it$iv == Composer.Companion.getEmpty()) goto L145;
        Object value$iv = it$iv;
    L146:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty = $dirty & (-57345);
        r14 = (Function2) value$iv;
    L145:
        value$iv = (Function2) new SliderDefaults$Track$9$1(colors2, enabled2);
        $composer2.updateRememberedValue(value$iv);
        goto L146
    L137:
        r8 = false;
    L131:
        if (($dirty & 3072) == 2048) goto L132;
        r1 = false;
    L147:
        if (r16 == 0) goto L149;
        r15 = AnonymousClass10.INSTANCE;
    L149:
        if (r18 == 0) goto L151;
        thumbTrackGapSize2 = SliderKt.access$getThumbTrackGapSize$p();
    L151:
        if (r10 == 0) goto L153;
        SliderColors r3 = colors2;
        float thumbTrackGapSize3 = thumbTrackGapSize2;
        SliderColors colors4 = r3;
        trackInsideCornerSize2 = SliderKt.access$getTrackInsideCornerSize$p();
        Modifier modifier3 = modifier2;
        boolean enabled3 = enabled2;
    L154:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L157;
        ComposerKt.traceEventStart(-541824132, $dirty, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1236)");
    L157:
        final long inactiveTrackColor = colors4.m2613trackColorWaAFU9c$material3_release(enabled3, false);
        float thumbTrackGapSize4 = thumbTrackGapSize3;
        final long activeTrackColor = colors4.m2613trackColorWaAFU9c$material3_release(enabled3, true);
        float trackInsideCornerSize3 = trackInsideCornerSize2;
        Function2<? super DrawScope, ? super Offset, Unit> r17 = r14;
        final long inactiveTickColor = colors4.m2612tickColorWaAFU9c$material3_release(enabled3, false);
        final long activeTickColor = colors4.m2612tickColorWaAFU9c$material3_release(enabled3, true);
        Modifier r2 = SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
        ProvidableCompositionLocal<LayoutDirection> r11 = CompositionLocalsKt.getLocalLayoutDirection();
        Modifier modifier4 = modifier3;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer2.consume(r11);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (r4 != LayoutDirection.Rtl) goto L160;
        float r5 = 180.0f;
    L161:
        Modifier r6 = RotateKt.rotate(r2, r5);
        ComposerKt.sourceInformationMarkerStart($composer2, -800695691, "CC(remember):Slider.kt#9igjgp");
        boolean r12 = ((($composer2.changedInstance(rangeSliderState) | $composer2.changed(inactiveTrackColor)) | $composer2.changed(activeTrackColor)) | $composer2.changed(inactiveTickColor)) | $composer2.changed(activeTickColor);
        if (($dirty & 3670016) != 1048576) goto L164;
        boolean r13 = true;
    L165:
        boolean r19 = r12 | r13;
        if ((29360128 & $dirty) != 8388608) goto L168;
        boolean r20 = true;
    L169:
        boolean r21 = r19 | r20;
        if (((57344 & $dirty) ^ 24576) <= 16384) goto L175;
        Function2<? super DrawScope, ? super Offset, Unit> r22 = r17;
        if ($composer2.changed(r22) == false) goto L176;
        Function2<? super DrawScope, ? super Offset, Unit> r110 = r22;
    L178:
        boolean r23 = true;
    L180:
        boolean r24 = r21 | r23;
        if ((458752 & $dirty) != 131072) goto L183;
        boolean r25 = true;
    L184:
        boolean invalid$iv2 = r24 | r25;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L190;
        Composer $this$cache$iv = $composer2;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L191;
        Object value$iv2 = it$iv2;
        final float thumbTrackGapSize5 = thumbTrackGapSize4;
        final Function2<? super DrawScope, ? super Offset, Unit> r111 = r110;
        final float trackInsideCornerSize4 = trackInsideCornerSize3;
    L192:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Composer $composer3 = $composer2;
        CanvasKt.Canvas(r6, (Function1) value$iv2, $composer3, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L195;
        ComposerKt.traceEventEnd();
    L195:
        final float thumbTrackGapSize6 = thumbTrackGapSize5;
        final boolean enabled4 = enabled3;
        final SliderColors colors5 = colors4;
        final Modifier modifier5 = modifier4;
        final float trackInsideCornerSize5 = trackInsideCornerSize4;
        final Function2<? super DrawScope, ? super Offset, Unit> r26 = r111;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> r27 = r15;
    L196:
        ScopeUpdateScope r112 = $composer3.endRestartGroup();
        if (r112 == null) goto L200;
        r112.updateScope(new AnonymousClass12(this, rangeSliderState, modifier5, enabled4, colors5, r26, r27, thumbTrackGapSize6, trackInsideCornerSize5, $changed, r38));
        return;
    L200:
        return;
    L191:
        thumbTrackGapSize5 = thumbTrackGapSize4;
        r111 = r110;
        trackInsideCornerSize4 = trackInsideCornerSize3;
        value$iv2 = (Function1) new SliderDefaults$Track$11$1(rangeSliderState, inactiveTrackColor, activeTrackColor, inactiveTickColor, activeTickColor, thumbTrackGapSize5, trackInsideCornerSize4, r111, r15);
        $this$cache$iv.updateRememberedValue(value$iv2);
        goto L192
    L190:
        $this$cache$iv = $composer2;
        goto L191
    L183:
        r25 = false;
    L176:
        r110 = r22;
        if (($dirty & 24576) == 16384) goto L178;
        r23 = false;
        goto L180
    L175:
        r22 = r17;
        goto L176
    L168:
        r20 = false;
        goto L169
    L164:
        r13 = false;
        goto L165
    L160:
        r5 = 0.0f;
        goto L161
    L153:
        SliderColors r28 = colors2;
        thumbTrackGapSize3 = thumbTrackGapSize2;
        colors4 = r28;
        modifier3 = modifier2;
        enabled3 = enabled2;
        goto L154
    L108:
        if ($composer2.getDefaultsInvalid() == true) goto L117;
        $composer2.skipToGroupEnd();
        if ((r38 & 8) == 0) goto L114;
        $dirty = $dirty & (-7169);
    L114:
        if ((r38 & 16) == 0) goto L116;
        SliderColors r29 = colors2;
        thumbTrackGapSize3 = thumbTrackGapSize2;
        colors4 = r29;
        $dirty = (-57345) & $dirty;
        modifier3 = modifier2;
        enabled3 = enabled2;
        goto L154
    L116:
        SliderColors r30 = colors2;
        thumbTrackGapSize3 = thumbTrackGapSize2;
        colors4 = r30;
        modifier3 = modifier2;
        enabled3 = enabled2;
        goto L154
    L102:
        if ($composer2.getSkipping() == false) goto L105;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier5 = modifier2;
        colors5 = colors2;
        thumbTrackGapSize6 = thumbTrackGapSize2;
        enabled4 = enabled2;
        trackInsideCornerSize5 = trackInsideCornerSize2;
        r26 = r14;
        r27 = r15;
        goto L196
    L94:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changed(this) == false) goto L98;
        r0 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        goto L92
    L98:
        r0 = 33554432;
        goto L92
    L82:
        if (($changed & 12582912) != 0) goto L88;
        trackInsideCornerSize2 = trackInsideCornerSize;
        if ($composer2.changed(trackInsideCornerSize2) == false) goto L86;
        int r210 = 8388608;
    L87:
        $dirty = $dirty | r210;
        goto L90
    L86:
        r210 = 4194304;
        goto L87
    L88:
        trackInsideCornerSize2 = trackInsideCornerSize;
        goto L90
    L71:
        if (($changed & 1572864) != 0) goto L77;
        thumbTrackGapSize2 = thumbTrackGapSize;
        if ($composer2.changed(thumbTrackGapSize2) == false) goto L75;
        int r211 = 1048576;
    L76:
        $dirty = $dirty | r211;
        goto L78
    L75:
        r211 = 524288;
        goto L76
    L77:
        thumbTrackGapSize2 = thumbTrackGapSize;
        goto L78
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        r15 = r33;
        if ($composer2.changedInstance(r15) == false) goto L64;
        int r113 = 131072;
    L65:
        $dirty = $dirty | r113;
        goto L67
    L64:
        r113 = 65536;
        goto L65
    L66:
        r15 = r33;
        goto L67
    L48:
        if ((r38 & 16) != 0) goto L52;
        r14 = r32;
        if ($composer2.changedInstance(r14) == false) goto L53;
        int r114 = 16384;
    L54:
        $dirty = $dirty | r114;
    L53:
        r114 = 8192;
        goto L54
    L52:
        r14 = r32;
        goto L53
    L37:
        if ((r38 & 8) != 0) goto L41;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L42;
        int r115 = 2048;
    L43:
        $dirty = $dirty | r115;
    L42:
        r115 = 1024;
        goto L43
    L41:
        colors2 = colors;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L33;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L31;
        int r116 = 256;
    L32:
        $dirty = $dirty | r116;
        goto L35
    L31:
        r116 = 128;
        goto L32
    L33:
        enabled2 = enabled;
        goto L35
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r31 = 32;
    L21:
        $dirty = $dirty | r31;
        goto L23
    L20:
        r31 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(rangeSliderState) == false) goto L10;
        int r34 = 4;
    L11:
        $dirty = $dirty | r34;
        goto L12
    L10:
        r34 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: drawTrack-ngJ0SCU, reason: not valid java name */
    private final void m2617drawTrackngJ0SCU(DrawScope $this$drawTrack_u2dngJ0SCU, float[] tickFractions, float activeRangeStart, float activeRangeEnd, long inactiveTrackColor, long activeTrackColor, long inactiveTickColor, long activeTickColor, float height, float startThumbWidth, float endThumbWidth, float thumbTrackGapSize, float trackInsideCornerSize, Function2<? super DrawScope, ? super Offset, Unit> r62, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> r63, boolean isRangeSlider) {
        long sliderStart = OffsetKt.Offset(0.0f, Offset.m4126getYimpl($this$drawTrack_u2dngJ0SCU.mo4916getCenterF1C5BW0()));
        long sliderEnd = OffsetKt.Offset(Size.m4194getWidthimpl($this$drawTrack_u2dngJ0SCU.mo4917getSizeNHjbRc()), Offset.m4126getYimpl($this$drawTrack_u2dngJ0SCU.mo4916getCenterF1C5BW0()));
        float trackStrokeWidth = $this$drawTrack_u2dngJ0SCU.mo376toPx0680j_4(height);
        long sliderValueEnd = OffsetKt.Offset(Offset.m4125getXimpl(sliderStart) + ((Offset.m4125getXimpl(sliderEnd) - Offset.m4125getXimpl(sliderStart)) * activeRangeEnd), Offset.m4126getYimpl($this$drawTrack_u2dngJ0SCU.mo4916getCenterF1C5BW0()));
        long sliderValueStart = OffsetKt.Offset(Offset.m4125getXimpl(sliderStart) + ((Offset.m4125getXimpl(sliderEnd) - Offset.m4125getXimpl(sliderStart)) * activeRangeStart), Offset.m4126getYimpl($this$drawTrack_u2dngJ0SCU.mo4916getCenterF1C5BW0()));
        float cornerSize = trackStrokeWidth / 2.0f;
        float cornerSize2 = $this$drawTrack_u2dngJ0SCU.mo376toPx0680j_4(trackInsideCornerSize);
        if (Dp.m6972compareTo0680j_4(thumbTrackGapSize, Dp.m6973constructorimpl(0)) <= 0) goto L5;
        float startGap = ($this$drawTrack_u2dngJ0SCU.mo376toPx0680j_4(startThumbWidth) / 2.0f) + $this$drawTrack_u2dngJ0SCU.mo376toPx0680j_4(thumbTrackGapSize);
        float endGap = ($this$drawTrack_u2dngJ0SCU.mo376toPx0680j_4(endThumbWidth) / 2.0f) + $this$drawTrack_u2dngJ0SCU.mo376toPx0680j_4(thumbTrackGapSize);
        float startGap2 = startGap;
        float endGap2 = endGap;
    L6:
        if (isRangeSlider == true) goto L8;
    L12:
        float trackStrokeWidth2 = trackStrokeWidth;
    L14:
        if (Offset.m4125getXimpl(sliderValueEnd) >= ((Offset.m4125getXimpl(sliderEnd) - endGap2) - cornerSize)) goto L18;
        float start = Offset.m4125getXimpl(sliderValueEnd) + endGap2;
        float end = Offset.m4125getXimpl(sliderEnd);
        m2618drawTrackPathCx2C_VA($this$drawTrack_u2dngJ0SCU, OffsetKt.Offset(start, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(end - start, trackStrokeWidth2), inactiveTrackColor, cornerSize2, cornerSize);
        float cornerSize3 = cornerSize;
        cornerSize2 = cornerSize2;
        if (r62 == null) goto L19;
        r62.invoke($this$drawTrack_u2dngJ0SCU, Offset.m4114boximpl(OffsetKt.Offset(end - cornerSize3, Offset.m4126getYimpl($this$drawTrack_u2dngJ0SCU.mo4916getCenterF1C5BW0()))));
    L19:
        if (isRangeSlider == false) goto L21;
        float r2 = Offset.m4125getXimpl(sliderValueStart) + startGap2;
    L22:
        float activeTrackStart = r2;
        float activeTrackEnd = Offset.m4125getXimpl(sliderValueEnd) - endGap2;
        if (isRangeSlider == false) goto L25;
        float startCornerRadius = cornerSize2;
    L27:
        if ((activeTrackEnd - activeTrackStart) <= startCornerRadius) goto L30;
        m2618drawTrackPathCx2C_VA($this$drawTrack_u2dngJ0SCU, OffsetKt.Offset(activeTrackStart, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(activeTrackEnd - activeTrackStart, trackStrokeWidth2), activeTrackColor, startCornerRadius, cornerSize2);
    L30:
        long start2 = OffsetKt.Offset(Offset.m4125getXimpl(sliderStart) + cornerSize3, Offset.m4126getYimpl(sliderStart));
        long end2 = OffsetKt.Offset(Offset.m4125getXimpl(sliderEnd) - cornerSize3, Offset.m4126getYimpl(sliderEnd));
        ClosedFloatingPointRange<Float> r0 = RangesKt.rangeTo(Offset.m4125getXimpl(sliderValueStart) - startGap2, Offset.m4125getXimpl(sliderValueStart) + startGap2);
        ClosedFloatingPointRange<Float> r6 = RangesKt.rangeTo(Offset.m4125getXimpl(sliderValueEnd) - endGap2, Offset.m4125getXimpl(sliderValueEnd) + endGap2);
        int index$iv = 0;
        int r8 = tickFractions.length;
        int index = 0;
    L31:
        if (index >= r8) goto L64;
        float item$iv = tickFractions[index];
        int index$iv2 = index$iv + 1;
        boolean outsideFraction = true;
        if (r62 == null) goto L41;
        if (isRangeSlider == false) goto L38;
        if (index$iv != 0) goto L38;
        int r36 = index;
        int r37 = r8;
    L40:
        long start3 = start2;
    L62:
        index = r36 + 1;
        index$iv = index$iv2;
        r0 = r0;
        r8 = r37;
        start2 = start3;
    L38:
        r36 = index;
        r37 = r8;
        int index2 = index$iv;
        if (index2 == (tickFractions.length - 1)) goto L40;
    L43:
        if (item$iv <= activeRangeEnd) goto L45;
    L48:
        start3 = start2;
        long center = OffsetKt.Offset(Offset.m4125getXimpl(OffsetKt.m4148lerpWko1d7g(start2, end2, item$iv)), Offset.m4126getYimpl($this$drawTrack_u2dngJ0SCU.mo4916getCenterF1C5BW0()));
        if (isRangeSlider == false) goto L55;
        if (r0.contains(Float.valueOf(Offset.m4125getXimpl(center))) == true) goto L62;
    L55:
        if (r6.contains(Float.valueOf(Offset.m4125getXimpl(center))) == true) goto L62;
        Offset r3 = Offset.m4114boximpl(center);
        if (outsideFraction == false) goto L60;
        long r42 = inactiveTickColor;
    L61:
        r63.invoke($this$drawTrack_u2dngJ0SCU, r3, Color.m4356boximpl(r42));
        goto L62
    L60:
        r42 = activeTickColor;
        goto L61
    L45:
        if (item$iv < activeRangeStart) goto L48;
        outsideFraction = false;
        goto L48
    L41:
        r36 = index;
        r37 = r8;
        goto L43
    L64:
        return;
    L25:
        startCornerRadius = cornerSize3;
        goto L27
    L21:
        r2 = 0.0f;
        goto L22
    L18:
        cornerSize3 = cornerSize;
        goto L19
    L8:
        if (Offset.m4125getXimpl(sliderValueStart) <= ((Offset.m4125getXimpl(sliderStart) + startGap2) + cornerSize)) goto L12;
        float start4 = Offset.m4125getXimpl(sliderStart);
        float end3 = Offset.m4125getXimpl(sliderValueStart) - startGap2;
        trackStrokeWidth2 = trackStrokeWidth;
        m2618drawTrackPathCx2C_VA($this$drawTrack_u2dngJ0SCU, Offset.Companion.m4141getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size(end3 - start4, trackStrokeWidth), inactiveTrackColor, cornerSize, cornerSize2);
        if (r62 == null) goto L14;
        r62.invoke($this$drawTrack_u2dngJ0SCU, Offset.m4114boximpl(OffsetKt.Offset(start4 + cornerSize, Offset.m4126getYimpl($this$drawTrack_u2dngJ0SCU.mo4916getCenterF1C5BW0()))));
        goto L14
    L5:
        startGap2 = 0.0f;
        endGap2 = 0.0f;
        goto L6
    }

    /* JADX INFO: renamed from: drawTrackPath-Cx2C_VA, reason: not valid java name */
    private final void m2618drawTrackPathCx2C_VA(DrawScope $this$drawTrackPath_u2dCx2C_VA, long offset, long size, long color, float startCornerRadius, float endCornerRadius) {
        long startCorner = CornerRadiusKt.CornerRadius(startCornerRadius, startCornerRadius);
        long endCorner = CornerRadiusKt.CornerRadius(endCornerRadius, endCornerRadius);
        RoundRect track = RoundRectKt.m4177RoundRectZAM2FJo(RectKt.m4165Recttz77jQw(OffsetKt.Offset(Offset.m4125getXimpl(offset), 0.0f), androidx.compose.ui.geometry.SizeKt.Size(Size.m4194getWidthimpl(size), Size.m4191getHeightimpl(size))), startCorner, endCorner, endCorner, startCorner);
        Path.addRoundRect$default(trackPath, track, null, 2, null);
        DrawScope.m4907drawPathLG529CI$default($this$drawTrackPath_u2dCx2C_VA, trackPath, color, 0.0f, null, null, 0, 60, null);
        trackPath.rewind();
    }

    /* JADX INFO: renamed from: drawStopIndicator-x3O1jOs, reason: not valid java name */
    private final void m2616drawStopIndicatorx3O1jOs(DrawScope drawScope, long offset, float size, long color) {
        DrawScope.m4898drawCircleVaOC9Bg$default(drawScope, color, drawScope.mo376toPx0680j_4(size) / 2.0f, offset, 0.0f, null, null, 0, 120, null);
    }

    static {
        INSTANCE = new SliderDefaults();
        TrackStopIndicatorSize = SliderTokens.INSTANCE.m3625getStopIndicatorSizeD9Ej5fM();
        TickSize = SliderTokens.INSTANCE.m3625getStopIndicatorSizeD9Ej5fM();
        trackPath = AndroidPath_androidKt.Path();
    }

    /* JADX INFO: renamed from: getTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m2624getTrackStopIndicatorSizeD9Ej5fM() {
        return TrackStopIndicatorSize;
    }

    /* JADX INFO: renamed from: getTickSize-D9Ej5fM, reason: not valid java name */
    public final float m2623getTickSizeD9Ej5fM() {
        return TickSize;
    }
}
