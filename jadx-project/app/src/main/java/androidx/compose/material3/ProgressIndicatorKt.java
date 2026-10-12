package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ProgressIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aR\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\\\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a0\u0010%\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001aD\u0010%\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a8\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001aL\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010;\u001aH\u0010<\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001am\u0010<\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020\u00052\u0019\b\u0002\u0010?\u001a\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020&0@¢\u0006\u0002\bBH\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a0\u0010<\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+H\u0007ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a:\u0010<\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001aD\u0010<\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a8\u0010<\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+H\u0007ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001aB\u0010<\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b=\u0010M\u001a6\u0010N\u001a\u00020&*\u00020A2\u0006\u0010O\u001a\u00020\u00012\u0006\u0010P\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010Q\u001a\u00020RH\u0002ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a&\u0010U\u001a\u00020&*\u00020A2\u0006\u0010*\u001a\u00020+2\u0006\u0010Q\u001a\u00020RH\u0002ø\u0001\u0000¢\u0006\u0004\bV\u0010W\u001a6\u0010X\u001a\u00020&*\u00020A2\u0006\u0010O\u001a\u00020\u00012\u0006\u0010P\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010Q\u001a\u00020RH\u0002ø\u0001\u0000¢\u0006\u0004\bY\u0010T\u001a>\u0010Z\u001a\u00020&*\u00020A2\u0006\u0010O\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010Q\u001a\u00020RH\u0002ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u001a>\u0010]\u001a\u00020&*\u00020A2\u0006\u0010^\u001a\u00020\u00012\u0006\u0010_\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00012\u0006\u0010.\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\b`\u0010a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0016\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0017\u0010\u0007\"\u0016\u0010\u0018\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0019\u0010\u0007\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010#\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u000e\u0010$\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006b"}, d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "getCircularIndicatorDiameter", "()F", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "IncreaseSemanticsBounds", "Landroidx/compose/ui/Modifier;", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "getLinearIndicatorHeight", "LinearIndicatorWidth", "getLinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "SemanticsBoundsPadding", "StartAngleOffset", "CircularProgressIndicator", "", NotificationCompat.CATEGORY_PROGRESS, "Lkotlin/Function0;", "modifier", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "trackColor", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "CircularProgressIndicator-DUhRLBM", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "gapSize", "CircularProgressIndicator-IyT6zlY", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-_5eSR-E", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "drawStopIndicator", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "LinearProgressIndicator-GJbTh5U", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJIFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-rIrjwxo", "(Landroidx/compose/ui/Modifier;JJIFLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorTrack", "drawCircularIndicatorTrack-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final CubicBezierEasing CircularEasing = null;
    private static final float CircularIndicatorDiameter = 0.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final CubicBezierEasing FirstLineHeadEasing = null;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final CubicBezierEasing FirstLineTailEasing = null;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final Modifier IncreaseSemanticsBounds = null;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float LinearIndicatorHeight = 0.0f;
    private static final float LinearIndicatorWidth = 0.0f;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final CubicBezierEasing SecondLineHeadEasing = null;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final CubicBezierEasing SecondLineTailEasing = null;
    private static final float SemanticsBoundsPadding = 0.0f;
    private static final float StartAngleOffset = -90.0f;

    /* JADX INFO: renamed from: access$drawCircularIndicator-42QJj7c, reason: not valid java name */
    public static final /* synthetic */ void m2504access$drawCircularIndicator42QJj7c(DrawScope $receiver, float startAngle, float sweep, long color, Stroke stroke) {
        m2509drawCircularIndicator42QJj7c($receiver, startAngle, sweep, color, stroke);
    }

    /* JADX INFO: renamed from: access$drawCircularIndicatorTrack-bw27NRU, reason: not valid java name */
    public static final /* synthetic */ void m2505access$drawCircularIndicatorTrackbw27NRU(DrawScope $receiver, long color, Stroke stroke) {
        m2510drawCircularIndicatorTrackbw27NRU($receiver, color, stroke);
    }

    /* JADX INFO: renamed from: access$drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final /* synthetic */ void m2506access$drawDeterminateCircularIndicator42QJj7c(DrawScope $receiver, float startAngle, float sweep, long color, Stroke stroke) {
        m2511drawDeterminateCircularIndicator42QJj7c($receiver, startAngle, sweep, color, stroke);
    }

    /* JADX INFO: renamed from: access$drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final /* synthetic */ void m2507access$drawIndeterminateCircularIndicatorhrjfTZI(DrawScope $receiver, float startAngle, float strokeWidth, float sweep, long color, Stroke stroke) {
        m2512drawIndeterminateCircularIndicatorhrjfTZI($receiver, startAngle, strokeWidth, sweep, color, stroke);
    }

    /* JADX INFO: renamed from: access$drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final /* synthetic */ void m2508access$drawLinearIndicatorqYKTg0g(DrawScope $receiver, float startFraction, float endFraction, long color, float strokeWidth, int strokeCap) {
        m2513drawLinearIndicatorqYKTg0g($receiver, startFraction, endFraction, color, strokeWidth, strokeCap);
    }

    public static final /* synthetic */ CubicBezierEasing access$getCircularEasing$p() {
        return CircularEasing;
    }

    public static final /* synthetic */ CubicBezierEasing access$getFirstLineHeadEasing$p() {
        return FirstLineHeadEasing;
    }

    public static final /* synthetic */ CubicBezierEasing access$getFirstLineTailEasing$p() {
        return FirstLineTailEasing;
    }

    public static final /* synthetic */ CubicBezierEasing access$getSecondLineHeadEasing$p() {
        return SecondLineHeadEasing;
    }

    public static final /* synthetic */ CubicBezierEasing access$getSecondLineTailEasing$p() {
        return SecondLineTailEasing;
    }

    public static final /* synthetic */ float access$getSemanticsBoundsPadding$p() {
        return SemanticsBoundsPadding;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `gapSize` and `drawStopIndicator`, see `LegacyLinearProgressIndicatorSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "LinearProgressIndicator(progress, modifier, color, trackColor, strokeCap, gapSize, drawStopIndicator)", imports = {}))
    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    public static final /* synthetic */ void m2501LinearProgressIndicator_5eSRE(final Function0 progress, Modifier modifier, long color, long trackColor, int strokeCap, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(-1796992155);
        ComposerKt.sourceInformation($composer2, "C(LinearProgressIndicator)P(2,1,0:c#ui.graphics.Color,4:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)96@4380L11,97@4443L16,100@4539L192:ProgressIndicator.kt#uh7d8r");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0 r9 = progress;
    L13:
        int r3 = r32 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        long r5 = color;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long trackColor2 = trackColor;
    L46:
        int r7 = r32 & 16;
        if (r7 == 0) goto L50;
        $dirty = $dirty | 24576;
        int r12 = strokeCap;
    L58:
        if (($dirty & 9363) == 9362) goto L60;
    L63:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L66;
    L75:
        if (r3 == 0) goto L77;
        Modifier.Companion modifier2 = Modifier.Companion;
    L79:
        if ((r32 & 4) == 0) goto L81;
        long color2 = ProgressIndicatorDefaults.INSTANCE.getLinearColor($composer2, 6);
        $dirty = $dirty & (-897);
    L83:
        if ((r32 & 8) == 0) goto L85;
        trackColor2 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L85:
        if (r7 == 0) goto L87;
        int strokeCap2 = ProgressIndicatorDefaults.INSTANCE.m2489getLinearStrokeCapKaPHkGw();
        long trackColor3 = trackColor2;
        Modifier modifier3 = modifier2;
        long color3 = color2;
    L88:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L91;
        ComposerKt.traceEventStart(-1796992155, $dirty, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:99)");
    L91:
        Composer $composer3 = $composer2;
        m2498LinearProgressIndicatorGJbTh5U(r9, modifier3, color3, trackColor3, strokeCap2, ProgressIndicatorDefaults.INSTANCE.m2488getLinearIndicatorTrackGapSizeD9Ej5fM(), null, $composer3, ((((($dirty & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty), 64);
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventEnd();
    L94:
        final Modifier modifier4 = modifier3;
        final long color4 = color3;
        final long trackColor4 = trackColor3;
        final int strokeCap3 = strokeCap2;
    L95:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L99;
        r11.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$1(progress, modifier4, color4, trackColor4, strokeCap3, $changed, r32));
        return;
    L99:
        return;
    L87:
        trackColor3 = trackColor2;
        strokeCap2 = r12;
        modifier3 = modifier2;
        color3 = color2;
        goto L88
    L81:
        color2 = r5;
        goto L83
    L77:
        modifier2 = r4;
        goto L79
    L66:
        if ($composer2.getDefaultsInvalid() == true) goto L75;
        $composer2.skipToGroupEnd();
        if ((r32 & 4) == 0) goto L72;
        $dirty = $dirty & (-897);
    L72:
        if ((r32 & 8) == 0) goto L74;
        $dirty = $dirty & (-7169);
    L74:
        trackColor3 = trackColor2;
        strokeCap2 = r12;
        modifier3 = r4;
        color3 = r5;
        goto L88
    L60:
        if ($composer2.getSkipping() == false) goto L63;
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        color4 = r5;
        trackColor4 = trackColor2;
        $composer3 = $composer2;
        strokeCap3 = r12;
        goto L95
    L50:
        if (($changed & 24576) != 0) goto L56;
        r12 = strokeCap;
        if ($composer2.changed(r12) == false) goto L54;
        int r13 = 16384;
    L55:
        $dirty = $dirty | r13;
        goto L58
    L54:
        r13 = 8192;
        goto L55
    L56:
        r12 = strokeCap;
        goto L58
    L38:
        if ((r32 & 8) != 0) goto L42;
        trackColor2 = trackColor;
        if ($composer2.changed(trackColor2) == false) goto L43;
        int r8 = 2048;
    L44:
        $dirty = $dirty | r8;
    L43:
        r8 = 1024;
        goto L44
    L42:
        trackColor2 = trackColor;
        goto L43
    L27:
        if ((r32 & 4) != 0) goto L31;
        r5 = color;
        if ($composer2.changed(r5) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
    L32:
        r10 = 128;
        goto L33
    L31:
        r5 = color;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L25
    L21:
        r6 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = progress;
        if ($composer2.changedInstance(r9) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L13
    L10:
        r14 = 2;
        goto L11
    L12:
        r9 = progress;
        goto L13
    }

    /* JADX INFO: renamed from: LinearProgressIndicator-GJbTh5U, reason: not valid java name */
    public static final void m2498LinearProgressIndicatorGJbTh5U(final Function0<Float> r34, Modifier modifier, long color, long trackColor, int strokeCap, float gapSize, Function1<? super DrawScope, Unit> r42, Composer $composer, final int $changed, final int r45) {
        Composer $composer2 = $composer.startRestartGroup(-339970038);
        ComposerKt.sourceInformation($composer2, "C(LinearProgressIndicator)P(4,3,0:c#ui.graphics.Color,6:c#ui.graphics.Color,5:c#ui.graphics.StrokeCap,2:c#ui.unit.Dp)140@6419L11,141@6482L16,144@6689L214,153@6935L31,157@7087L102,161@7259L806,154@6971L1094:ProgressIndicator.kt#uh7d8r");
        int $dirty = $changed;
        if ((r45 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r45 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        final long color2 = color;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long trackColor2 = trackColor;
    L45:
        int r6 = r45 & 16;
        if (r6 == 0) goto L49;
        $dirty = $dirty | 24576;
        final int strokeCap2 = strokeCap;
    L56:
        int r16 = r45 & 32;
        if (r16 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float gapSize2 = gapSize;
    L68:
        if (($changed & 1572864) == 0) goto L70;
        Function1<? super DrawScope, Unit> r0 = r42;
    L79:
        if (($dirty & 599187) == 599186) goto L81;
    L84:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L87;
    L99:
        if (r3 == 0) goto L102;
        modifier2 = Modifier.Companion;
    L102:
        if ((r45 & 4) == 0) goto L105;
        color2 = ProgressIndicatorDefaults.INSTANCE.getLinearColor($composer2, 6);
        $dirty = $dirty & (-897);
    L105:
        if ((r45 & 8) == 0) goto L107;
        trackColor2 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L107:
        if (r6 == 0) goto L109;
        strokeCap2 = ProgressIndicatorDefaults.INSTANCE.m2489getLinearStrokeCapKaPHkGw();
    L109:
        if (r16 == 0) goto L112;
        gapSize2 = ProgressIndicatorDefaults.INSTANCE.m2488getLinearIndicatorTrackGapSizeD9Ej5fM();
    L112:
        if ((r45 & 64) == 0) goto L134;
        ComposerKt.sourceInformationMarkerStart($composer2, 1144997616, "CC(remember):ProgressIndicator.kt#9igjgp");
        if ((($dirty & 896) ^ 384) <= 256) goto L118;
        if ($composer2.changed(color2) == false) goto L118;
    L119:
        boolean r4 = true;
    L122:
        if ((57344 & $dirty) != 16384) goto L124;
        boolean r7 = true;
    L125:
        boolean invalid$iv = r4 | r7;
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L131;
        int $dirty2 = $dirty;
        if (value$iv != Composer.Companion.getEmpty()) goto L133;
    L132:
        value$iv = (Function1) new ProgressIndicatorKt$LinearProgressIndicator$2$1(color2, strokeCap2);
        $composer2.updateRememberedValue(value$iv);
    L133:
        Function1<? super DrawScope, Unit> r1 = (Function1) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty = $dirty2 & (-3670017);
        final float gapSize3 = gapSize2;
        final int strokeCap3 = strokeCap2;
    L135:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L138;
        ComposerKt.traceEventStart(-339970038, $dirty, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:152)");
    L138:
        ComposerKt.sourceInformationMarkerStart($composer2, 1145005305, "CC(remember):ProgressIndicator.kt#9igjgp");
        if (($dirty & 14) != 4) goto L141;
        boolean invalid$iv2 = true;
    L142:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L149;
        if (it$iv == Composer.Companion.getEmpty()) goto L149;
        Object value$iv2 = it$iv;
    L150:
        final Function0 coercedProgress = (Function0) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r5 = modifier2.then(IncreaseSemanticsBounds);
        ComposerKt.sourceInformationMarkerStart($composer2, 1145010240, "CC(remember):ProgressIndicator.kt#9igjgp");
        boolean invalid$iv3 = $composer2.changed(coercedProgress);
        Object value$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L156;
        Modifier modifier3 = modifier2;
        if (value$iv3 != Composer.Companion.getEmpty()) goto L158;
    L157:
        value$iv3 = (Function1) new ProgressIndicatorKt$LinearProgressIndicator$3$1(coercedProgress);
        $composer2.updateRememberedValue(value$iv3);
    L158:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        boolean r8 = true;
        Modifier r2 = SizeKt.m774sizeVpY3zN4(SemanticsModifierKt.semantics(r5, true, (Function1) value$iv3), LinearIndicatorWidth, LinearIndicatorHeight);
        ComposerKt.sourceInformationMarkerStart($composer2, 1145016448, "CC(remember):ProgressIndicator.kt#9igjgp");
        if ((57344 & $dirty) != 16384) goto L161;
        boolean r9 = true;
    L163:
        if ((458752 & $dirty) != 131072) goto L165;
        boolean r10 = true;
    L166:
        boolean r11 = (r9 | r10) | $composer2.changed(coercedProgress);
        if ((($dirty & 7168) ^ 3072) <= 2048) goto L171;
        if ($composer2.changed(trackColor2) == false) goto L171;
    L172:
        boolean r12 = true;
    L174:
        boolean r13 = r11 | r12;
        if ((($dirty & 896) ^ 384) <= 256) goto L179;
        if ($composer2.changed(color2) == false) goto L179;
    L180:
        boolean r14 = true;
    L182:
        boolean r15 = r13 | r14;
        if (((3670016 & $dirty) ^ 1572864) <= 1048576) goto L187;
        if ($composer2.changed(r1) == false) goto L187;
    L190:
        boolean invalid$iv4 = r15 | r8;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv4 == false) goto L193;
    L196:
        final Function1<? super DrawScope, Unit> r31 = r1;
        final long color3 = color2;
        final long trackColor3 = trackColor2;
        Object value$iv4 = new ProgressIndicatorKt$LinearProgressIndicator$4$1(strokeCap3, gapSize3, coercedProgress, trackColor3, color3, r31);
        $composer2.updateRememberedValue(value$iv4);
    L197:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r2, (Function1) value$iv4, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L200;
        ComposerKt.traceEventEnd();
    L200:
        final int strokeCap4 = strokeCap3;
        final float gapSize4 = gapSize3;
        final long trackColor4 = trackColor3;
        final long color4 = color3;
        final Function1<? super DrawScope, Unit> r17 = r31;
        final Modifier modifier4 = modifier3;
    L201:
        ScopeUpdateScope r18 = $composer2.endRestartGroup();
        if (r18 == null) goto L205;
        r18.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$5(r34, modifier4, color4, trackColor4, strokeCap4, gapSize4, r17, $changed, r45));
        return;
    L205:
        return;
    L193:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L196;
        r31 = r1;
        value$iv4 = it$iv2;
        color3 = color2;
        trackColor3 = trackColor2;
    L187:
        if (($dirty & 1572864) == 1048576) goto L190;
        r8 = false;
    L179:
        if (($dirty & 384) == 256) goto L180;
        r14 = false;
    L171:
        if (($dirty & 3072) == 2048) goto L172;
        r12 = false;
        goto L174
    L165:
        r10 = false;
        goto L166
    L161:
        r9 = false;
        goto L163
    L156:
        modifier3 = modifier2;
    L149:
        value$iv2 = (Function0) new ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1(r34);
        $composer2.updateRememberedValue(value$iv2);
        goto L150
    L141:
        invalid$iv2 = false;
        goto L142
    L131:
        $dirty2 = $dirty;
        goto L132
    L124:
        r7 = false;
    L118:
        if (($dirty & 384) == 256) goto L119;
        r4 = false;
        goto L122
    L134:
        r1 = r42;
        gapSize3 = gapSize2;
        strokeCap3 = strokeCap2;
        goto L135
    L87:
        if ($composer2.getDefaultsInvalid() == true) goto L99;
        $composer2.skipToGroupEnd();
        if ((r45 & 4) == 0) goto L93;
        $dirty = $dirty & (-897);
    L93:
        if ((r45 & 8) == 0) goto L96;
        $dirty = $dirty & (-7169);
    L96:
        if ((r45 & 64) == 0) goto L98;
        $dirty = $dirty & (-3670017);
    L98:
        r1 = r42;
        gapSize3 = gapSize2;
        strokeCap3 = strokeCap2;
        goto L135
    L81:
        if ($composer2.getSkipping() == false) goto L84;
        $composer2.skipToGroupEnd();
        long r19 = color2;
        gapSize4 = gapSize2;
        color4 = r19;
        modifier4 = modifier2;
        trackColor4 = trackColor2;
        r17 = r0;
        strokeCap4 = strokeCap2;
        goto L201
    L70:
        if ((r45 & 64) != 0) goto L74;
        r0 = r42;
        if ($composer2.changedInstance(r0) == false) goto L75;
        int r22 = 1048576;
    L76:
        $dirty = $dirty | r22;
    L75:
        r22 = 524288;
        goto L76
    L74:
        r0 = r42;
        goto L75
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        gapSize2 = gapSize;
        if ($composer2.changed(gapSize2) == false) goto L64;
        int r110 = 131072;
    L65:
        $dirty = $dirty | r110;
        goto L68
    L64:
        r110 = 65536;
        goto L65
    L66:
        gapSize2 = gapSize;
        goto L68
    L49:
        if (($changed & 24576) != 0) goto L55;
        strokeCap2 = strokeCap;
        if ($composer2.changed(strokeCap2) == false) goto L53;
        int r111 = 16384;
    L54:
        $dirty = $dirty | r111;
        goto L56
    L53:
        r111 = 8192;
        goto L54
    L55:
        strokeCap2 = strokeCap;
        goto L56
    L37:
        if ((r45 & 8) != 0) goto L41;
        trackColor2 = trackColor;
        if ($composer2.changed(trackColor2) == false) goto L42;
        int r20 = 2048;
    L43:
        $dirty = $dirty | r20;
    L42:
        r20 = 1024;
        goto L43
    L41:
        trackColor2 = trackColor;
        goto L42
    L26:
        if ((r45 & 4) != 0) goto L30;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L31;
        int r21 = 256;
    L32:
        $dirty = $dirty | r21;
    L31:
        r21 = 128;
        goto L32
    L30:
        color2 = color;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r23 = 32;
    L21:
        $dirty = $dirty | r23;
        goto L24
    L20:
        r23 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r34) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L12
    L10:
        r24 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `gapSize`, see `LegacyIndeterminateLinearProgressIndicatorSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "LinearProgressIndicator(modifier, color, trackColor, strokeCap, gapSize)", imports = {}))
    /* JADX INFO: renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    public static final /* synthetic */ void m2497LinearProgressIndicator2cYBFYY(Modifier modifier, long color, long trackColor, int strokeCap, Composer $composer, final int $changed, final int r28) {
        Composer $composer2 = $composer.startRestartGroup(-476865359);
        ComposerKt.sourceInformation($composer2, "C(LinearProgressIndicator)P(1,0:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.StrokeCap)214@9497L11,215@9560L16,218@9656L175:ProgressIndicator.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r28 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long r4 = color;
    L25:
        if (($changed & 384) == 0) goto L27;
        long trackColor2 = trackColor;
    L35:
        int r6 = r28 & 8;
        if (r6 == 0) goto L39;
        $dirty = $dirty | 3072;
        int r10 = strokeCap;
    L47:
        if (($dirty & 1171) == 1170) goto L49;
    L52:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L55;
    L64:
        if (r2 == 0) goto L66;
        Modifier.Companion modifier2 = Modifier.Companion;
    L68:
        if ((r28 & 2) == 0) goto L70;
        long color2 = ProgressIndicatorDefaults.INSTANCE.getLinearColor($composer2, 6);
        $dirty = $dirty & (-113);
    L72:
        if ((r28 & 4) == 0) goto L74;
        trackColor2 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor($composer2, 6);
        $dirty = $dirty & (-897);
    L74:
        if (r6 == 0) goto L76;
        int strokeCap2 = ProgressIndicatorDefaults.INSTANCE.m2489getLinearStrokeCapKaPHkGw();
        long trackColor3 = trackColor2;
        Modifier modifier3 = modifier2;
        long color3 = color2;
    L77:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L80;
        ComposerKt.traceEventStart(-476865359, $dirty, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:217)");
    L80:
        m2503LinearProgressIndicatorrIrjwxo(modifier3, color3, trackColor3, strokeCap2, ProgressIndicatorDefaults.INSTANCE.m2488getLinearIndicatorTrackGapSizeD9Ej5fM(), $composer2, (((($dirty & 14) | 24576) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L83;
        ComposerKt.traceEventEnd();
    L83:
        final long color4 = color3;
        final long trackColor4 = trackColor3;
        final int strokeCap3 = strokeCap2;
        final Modifier modifier4 = modifier3;
    L84:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L88;
        r11.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$6(modifier4, color4, trackColor4, strokeCap3, $changed, r28));
        return;
    L88:
        return;
    L76:
        trackColor3 = trackColor2;
        strokeCap2 = r10;
        modifier3 = modifier2;
        color3 = color2;
        goto L77
    L70:
        color2 = r4;
        goto L72
    L66:
        modifier2 = r3;
        goto L68
    L55:
        if ($composer2.getDefaultsInvalid() == true) goto L64;
        $composer2.skipToGroupEnd();
        if ((r28 & 2) == 0) goto L61;
        $dirty = $dirty & (-113);
    L61:
        if ((r28 & 4) == 0) goto L63;
        $dirty = $dirty & (-897);
    L63:
        trackColor3 = trackColor2;
        strokeCap2 = r10;
        modifier3 = r3;
        color3 = r4;
        goto L77
    L49:
        if ($composer2.getSkipping() == false) goto L52;
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        color4 = r4;
        trackColor4 = trackColor2;
        strokeCap3 = r10;
        goto L84
    L39:
        if (($changed & 3072) != 0) goto L45;
        r10 = strokeCap;
        if ($composer2.changed(r10) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L47
    L43:
        r12 = 1024;
        goto L44
    L45:
        r10 = strokeCap;
        goto L47
    L27:
        if ((r28 & 4) != 0) goto L31;
        trackColor2 = trackColor;
        if ($composer2.changed(trackColor2) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
    L32:
        r7 = 128;
        goto L33
    L31:
        trackColor2 = trackColor;
        goto L32
    L16:
        if ((r28 & 2) != 0) goto L20;
        r4 = color;
        if ($composer2.changed(r4) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
    L21:
        r8 = 16;
        goto L22
    L20:
        r4 = color;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L14
    L10:
        r5 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L14
    }

    /* JADX INFO: renamed from: LinearProgressIndicator-rIrjwxo, reason: not valid java name */
    public static final void m2503LinearProgressIndicatorrIrjwxo(Modifier modifier, long color, long trackColor, int strokeCap, float gapSize, Composer $composer, final int $changed, final int r39) {
        Composer $composer2 = $composer.startRestartGroup(567589233);
        ComposerKt.sourceInformation($composer2, "C(LinearProgressIndicator)P(2,0:c#ui.graphics.Color,4:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap,1:c#ui.unit.Dp)249@11000L11,250@11063L16,254@11257L28,259@11547L396,272@11995L396,285@12444L400,298@12897L400,315@13472L1839,310@13302L2009:ProgressIndicator.kt#uh7d8r");
        int $dirty = $changed;
        int r3 = r39 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long color2 = color;
    L25:
        if (($changed & 384) == 0) goto L27;
        long trackColor2 = trackColor;
    L35:
        int r5 = r39 & 8;
        if (r5 == 0) goto L39;
        $dirty = $dirty | 3072;
        int strokeCap2 = strokeCap;
    L46:
        int r15 = r39 & 16;
        if (r15 == 0) goto L50;
        $dirty = $dirty | 24576;
        final float gapSize2 = gapSize;
    L58:
        if (($dirty & 9363) == 9362) goto L60;
    L63:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L66;
    L75:
        if (r3 == 0) goto L77;
        Modifier.Companion modifier2 = Modifier.Companion;
    L79:
        if ((r39 & 2) == 0) goto L82;
        color2 = ProgressIndicatorDefaults.INSTANCE.getLinearColor($composer2, 6);
        $dirty = $dirty & (-113);
    L82:
        if ((r39 & 4) == 0) goto L84;
        trackColor2 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor($composer2, 6);
        $dirty = $dirty & (-897);
    L84:
        if (r5 == 0) goto L86;
        strokeCap2 = ProgressIndicatorDefaults.INSTANCE.m2489getLinearStrokeCapKaPHkGw();
    L86:
        if (r15 == 0) goto L88;
        final float gapSize3 = ProgressIndicatorDefaults.INSTANCE.m2488getLinearIndicatorTrackGapSizeD9Ej5fM();
        final int strokeCap3 = strokeCap2;
    L89:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L92;
        ComposerKt.traceEventStart(567589233, $dirty, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:253)");
    L92:
        InfiniteTransition infiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, $composer2, 0, 1);
        final State<Float> r22 = InfiniteTransitionKt.animateFloat(infiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1.INSTANCE), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        final State<Float> r25 = InfiniteTransitionKt.animateFloat(infiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1.INSTANCE), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        final State<Float> r28 = InfiniteTransitionKt.animateFloat(infiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1.INSTANCE), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        final State<Float> r29 = InfiniteTransitionKt.animateFloat(infiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1.INSTANCE), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        Composer $composer3 = $composer2;
        Modifier r6 = SizeKt.m774sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier2.then(IncreaseSemanticsBounds)), LinearIndicatorWidth, LinearIndicatorHeight);
        ComposerKt.sourceInformationMarkerStart($composer3, 1145216297, "CC(remember):ProgressIndicator.kt#9igjgp");
        if (($dirty & 7168) != 2048) goto L95;
        boolean r7 = true;
    L97:
        if ((57344 & $dirty) != 16384) goto L99;
        boolean r1 = true;
    L100:
        boolean r2 = (r1 | r7) | $composer3.changed(r22);
        if ((($dirty & 896) ^ 384) <= 256) goto L105;
        if ($composer3.changed(trackColor2) == false) goto L105;
    L106:
        boolean r8 = true;
    L108:
        boolean r9 = (r2 | r8) | $composer3.changed(r25);
        if ((($dirty & 112) ^ 48) <= 32) goto L113;
        if ($composer3.changed(color2) == false) goto L113;
    L114:
        boolean r10 = true;
    L116:
        boolean invalid$iv = ((r9 | r10) | $composer3.changed(r28)) | $composer3.changed(r29);
        Object it$iv = $composer3.rememberedValue();
        if (invalid$iv == true) goto L123;
        if (it$iv == Composer.Companion.getEmpty()) goto L123;
        Object value$iv = it$iv;
        final long color3 = color2;
        final long trackColor3 = trackColor2;
    L124:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        CanvasKt.Canvas(r6, (Function1) value$iv, $composer3, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L127;
        ComposerKt.traceEventEnd();
    L127:
        final Modifier modifier3 = modifier2;
        final int strokeCap4 = strokeCap3;
        gapSize2 = gapSize3;
        final long trackColor4 = trackColor3;
        final long color4 = color3;
    L128:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L132;
        r11.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$8(modifier3, color4, trackColor4, strokeCap4, gapSize2, $changed, r39));
        return;
    L132:
        return;
    L123:
        color3 = color2;
        trackColor3 = trackColor2;
        value$iv = new ProgressIndicatorKt$LinearProgressIndicator$7$1(strokeCap3, gapSize3, r22, trackColor3, r25, color3, r28, r29);
        $composer3.updateRememberedValue(value$iv);
    L113:
        if (($dirty & 48) == 32) goto L114;
        r10 = false;
    L105:
        if (($dirty & 384) == 256) goto L106;
        r8 = false;
        goto L108
    L99:
        r1 = false;
        goto L100
    L95:
        r7 = false;
        goto L97
    L88:
        gapSize3 = gapSize2;
        strokeCap3 = strokeCap2;
        goto L89
    L77:
        modifier2 = r4;
        goto L79
    L66:
        if ($composer2.getDefaultsInvalid() == true) goto L75;
        $composer2.skipToGroupEnd();
        if ((r39 & 2) == 0) goto L72;
        $dirty = $dirty & (-113);
    L72:
        if ((r39 & 4) == 0) goto L74;
        $dirty = $dirty & (-897);
    L74:
        modifier2 = r4;
        gapSize3 = gapSize2;
        strokeCap3 = strokeCap2;
        goto L89
    L60:
        if ($composer2.getSkipping() == false) goto L63;
        $composer2.skipToGroupEnd();
        color4 = color2;
        strokeCap4 = strokeCap2;
        $composer3 = $composer2;
        modifier3 = r4;
        trackColor4 = trackColor2;
        goto L128
    L50:
        if (($changed & 24576) != 0) goto L56;
        gapSize2 = gapSize;
        if ($composer2.changed(gapSize2) == false) goto L54;
        int r18 = 16384;
    L55:
        $dirty = $dirty | r18;
        goto L58
    L54:
        r18 = 8192;
        goto L55
    L56:
        gapSize2 = gapSize;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        strokeCap2 = strokeCap;
        if ($composer2.changed(strokeCap2) == false) goto L43;
        int r16 = 2048;
    L44:
        $dirty = $dirty | r16;
        goto L46
    L43:
        r16 = 1024;
        goto L44
    L45:
        strokeCap2 = strokeCap;
        goto L46
    L27:
        if ((r39 & 4) != 0) goto L31;
        trackColor2 = trackColor;
        if ($composer2.changed(trackColor2) == false) goto L32;
        int r12 = 256;
    L33:
        $dirty = $dirty | r12;
    L32:
        r12 = 128;
        goto L33
    L31:
        trackColor2 = trackColor;
        goto L32
    L16:
        if ((r39 & 2) != 0) goto L20;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L21;
        int r13 = 32;
    L22:
        $dirty = $dirty | r13;
    L21:
        r13 = 16;
        goto L22
    L20:
        color2 = color;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L14
    L10:
        r14 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L14
    }

    @Deprecated(message = "Use the overload that takes `progress` as a lambda", replaceWith = @ReplaceWith(expression = "LinearProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    public static final void m2500LinearProgressIndicator_5eSRE(final float progress, Modifier modifier, long color, long trackColor, int strokeCap, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(905419617);
        ComposerKt.sourceInformation($composer2, "C(LinearProgressIndicator)P(2,1,0:c#ui.graphics.Color,4:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)385@15871L11,386@15934L16,390@16074L12,389@16030L179:ProgressIndicator.kt#uh7d8r");
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
        long color2 = color;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long trackColor2 = trackColor;
    L45:
        int r7 = r32 & 16;
        if (r7 == 0) goto L49;
        $dirty = $dirty | 24576;
        int r13 = strokeCap;
    L57:
        if (($dirty & 9363) == 9362) goto L59;
    L62:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L65;
    L74:
        if (r4 == 0) goto L77;
        modifier2 = Modifier.Companion;
    L77:
        if ((r32 & 4) == 0) goto L80;
        color2 = ProgressIndicatorDefaults.INSTANCE.getLinearColor($composer2, 6);
        $dirty = $dirty & (-897);
    L80:
        if ((r32 & 8) == 0) goto L82;
        trackColor2 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L82:
        if (r7 == 0) goto L84;
        int strokeCap2 = ProgressIndicatorDefaults.INSTANCE.m2489getLinearStrokeCapKaPHkGw();
        long trackColor3 = trackColor2;
        long trackColor4 = color2;
        Modifier modifier3 = modifier2;
    L85:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L88;
        ComposerKt.traceEventStart(905419617, $dirty, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:389)");
    L88:
        ComposerKt.sourceInformationMarkerStart($composer2, 1145297734, "CC(remember):ProgressIndicator.kt#9igjgp");
        if (($dirty & 14) != 4) goto L91;
        boolean invalid$iv = true;
    L92:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L95;
    L98:
        Object value$iv = (Function0) new ProgressIndicatorKt$LinearProgressIndicator$9$1(progress);
        $composer2.updateRememberedValue(value$iv);
    L99:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Composer $composer3 = $composer2;
        m2498LinearProgressIndicatorGJbTh5U((Function0) value$iv, modifier3, trackColor4, trackColor3, strokeCap2, 0.0f, null, $composer3, ((($dirty & 112) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty), 96);
        if (ComposerKt.isTraceInProgress() == false) goto L102;
        ComposerKt.traceEventEnd();
    L102:
        final Modifier modifier4 = modifier3;
        final long trackColor5 = trackColor3;
        final int strokeCap3 = strokeCap2;
        final long color3 = trackColor4;
    L103:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L107;
        r11.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$10(progress, modifier4, color3, trackColor5, strokeCap3, $changed, r32));
        return;
    L107:
        return;
    L95:
        if (it$iv == Composer.Companion.getEmpty()) goto L98;
        value$iv = it$iv;
        goto L99
    L91:
        invalid$iv = false;
        goto L92
    L84:
        strokeCap2 = r13;
        trackColor3 = trackColor2;
        trackColor4 = color2;
        modifier3 = modifier2;
        goto L85
    L65:
        if ($composer2.getDefaultsInvalid() == true) goto L74;
        $composer2.skipToGroupEnd();
        if ((r32 & 4) == 0) goto L71;
        $dirty = $dirty & (-897);
    L71:
        if ((r32 & 8) == 0) goto L73;
        $dirty = $dirty & (-7169);
    L73:
        strokeCap2 = r13;
        trackColor3 = trackColor2;
        trackColor4 = color2;
        modifier3 = modifier2;
        goto L85
    L59:
        if ($composer2.getSkipping() == false) goto L62;
        $composer2.skipToGroupEnd();
        color3 = color2;
        $composer3 = $composer2;
        modifier4 = modifier2;
        trackColor5 = trackColor2;
        strokeCap3 = r13;
        goto L103
    L49:
        if (($changed & 24576) != 0) goto L55;
        r13 = strokeCap;
        if ($composer2.changed(r13) == false) goto L53;
        int r14 = 16384;
    L54:
        $dirty = $dirty | r14;
        goto L57
    L53:
        r14 = 8192;
        goto L54
    L55:
        r13 = strokeCap;
        goto L57
    L37:
        if ((r32 & 8) != 0) goto L41;
        trackColor2 = trackColor;
        if ($composer2.changed(trackColor2) == false) goto L42;
        int r8 = 2048;
    L43:
        $dirty = $dirty | r8;
    L42:
        r8 = 1024;
        goto L43
    L41:
        trackColor2 = trackColor;
        goto L42
    L26:
        if ((r32 & 4) != 0) goto L30;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L31;
        int r9 = 256;
    L32:
        $dirty = $dirty | r9;
    L31:
        r9 = 128;
        goto L32
    L30:
        color2 = color;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r10 = 32;
    L21:
        $dirty = $dirty | r10;
        goto L24
    L20:
        r10 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(progress) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L12
    L10:
        r5 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    public static final /* synthetic */ void m2502LinearProgressIndicatoreaDK9VM(final float progress, Modifier modifier, long color, long trackColor, Composer $composer, final int $changed, final int r26) {
        Composer $composer2 = $composer.startRestartGroup(-372717133);
        ComposerKt.sourceInformation($composer2, "C(LinearProgressIndicator)P(2,1,0:c#ui.graphics.Color,3:c#ui.graphics.Color)403@16462L11,404@16525L16,406@16551L164:ProgressIndicator.kt#uh7d8r");
        int $dirty = $changed;
        if ((r26 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        float r8 = progress;
    L13:
        int r2 = r26 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r3 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        long r4 = color;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long r9 = trackColor;
    L47:
        if (($dirty & 1171) == 1170) goto L49;
    L52:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L55;
    L64:
        if (r2 == 0) goto L66;
        Modifier.Companion modifier2 = Modifier.Companion;
    L68:
        if ((r26 & 4) == 0) goto L70;
        long color2 = ProgressIndicatorDefaults.INSTANCE.getLinearColor($composer2, 6);
        $dirty = $dirty & (-897);
    L72:
        if ((r26 & 8) == 0) goto L74;
        $dirty = $dirty & (-7169);
        Modifier modifier3 = modifier2;
        long color3 = color2;
        long trackColor2 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor($composer2, 6);
    L75:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L78;
        ComposerKt.traceEventStart(-372717133, $dirty, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:406)");
    L78:
        m2500LinearProgressIndicator_5eSRE(r8, modifier3, color3, trackColor2, ProgressIndicatorDefaults.INSTANCE.m2489getLinearStrokeCapKaPHkGw(), $composer2, (((($dirty & 14) | 24576) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L81;
        ComposerKt.traceEventEnd();
    L81:
        final Modifier modifier4 = modifier3;
        final long color4 = color3;
        final long trackColor3 = trackColor2;
    L82:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L86;
        r10.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$11(progress, modifier4, color4, trackColor3, $changed, r26));
        return;
    L86:
        return;
    L74:
        trackColor2 = r9;
        modifier3 = modifier2;
        color3 = color2;
        goto L75
    L70:
        color2 = r4;
        goto L72
    L66:
        modifier2 = r3;
        goto L68
    L55:
        if ($composer2.getDefaultsInvalid() == true) goto L64;
        $composer2.skipToGroupEnd();
        if ((r26 & 4) == 0) goto L61;
        $dirty = $dirty & (-897);
    L61:
        if ((r26 & 8) == 0) goto L63;
        $dirty = $dirty & (-7169);
    L63:
        trackColor2 = r9;
        modifier3 = r3;
        color3 = r4;
        goto L75
    L49:
        if ($composer2.getSkipping() == false) goto L52;
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        color4 = r4;
        trackColor3 = r9;
        goto L82
    L38:
        if ((r26 & 8) != 0) goto L42;
        r9 = trackColor;
        if ($composer2.changed(r9) == false) goto L43;
        int r6 = 2048;
    L44:
        $dirty = $dirty | r6;
    L43:
        r6 = 1024;
        goto L44
    L42:
        r9 = trackColor;
        goto L43
    L27:
        if ((r26 & 4) != 0) goto L31;
        r4 = color;
        if ($composer2.changed(r4) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
    L32:
        r7 = 128;
        goto L33
    L31:
        r4 = color;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L21;
        int r5 = 32;
    L22:
        $dirty = $dirty | r5;
        goto L25
    L21:
        r5 = 16;
        goto L22
    L23:
        r3 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r8 = progress;
        if ($composer2.changed(r8) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L13
    L10:
        r11 = 2;
        goto L11
    L12:
        r8 = progress;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m2499LinearProgressIndicatorRIQooxk(Modifier modifier, long color, long trackColor, Composer $composer, final int $changed, final int r26) {
        Composer $composer2 = $composer.startRestartGroup(585576195);
        ComposerKt.sourceInformation($composer2, "C(LinearProgressIndicator)P(1,0:c#ui.graphics.Color,2:c#ui.graphics.Color)418@16922L11,419@16985L16,421@17011L146:ProgressIndicator.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r26 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long r4 = color;
    L25:
        if (($changed & 384) == 0) goto L27;
        long trackColor2 = trackColor;
    L36:
        if (($dirty & 147) == 146) goto L38;
    L41:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L44;
    L53:
        if (r2 == 0) goto L55;
        Modifier.Companion modifier2 = Modifier.Companion;
    L57:
        if ((r26 & 2) == 0) goto L59;
        long color2 = ProgressIndicatorDefaults.INSTANCE.getLinearColor($composer2, 6);
        $dirty = $dirty & (-113);
    L61:
        if ((r26 & 4) == 0) goto L63;
        $dirty = $dirty & (-897);
        long trackColor3 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor($composer2, 6);
        Modifier modifier3 = modifier2;
        long color3 = color2;
    L64:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L67;
        ComposerKt.traceEventStart(585576195, $dirty, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:421)");
    L67:
        m2503LinearProgressIndicatorrIrjwxo(modifier3, color3, trackColor3, ProgressIndicatorDefaults.INSTANCE.m2489getLinearStrokeCapKaPHkGw(), 0.0f, $composer2, ((($dirty & 14) | 3072) | ($dirty & 112)) | ($dirty & 896), 16);
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventEnd();
    L70:
        final long color4 = color3;
        final long trackColor4 = trackColor3;
        final Modifier modifier4 = modifier3;
    L71:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L75;
        r9.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$12(modifier4, color4, trackColor4, $changed, r26));
        return;
    L75:
        return;
    L63:
        trackColor3 = trackColor2;
        modifier3 = modifier2;
        color3 = color2;
        goto L64
    L59:
        color2 = r4;
        goto L61
    L55:
        modifier2 = r3;
        goto L57
    L44:
        if ($composer2.getDefaultsInvalid() == true) goto L53;
        $composer2.skipToGroupEnd();
        if ((r26 & 2) == 0) goto L50;
        $dirty = $dirty & (-113);
    L50:
        if ((r26 & 4) == 0) goto L52;
        $dirty = $dirty & (-897);
    L52:
        trackColor3 = trackColor2;
        modifier3 = r3;
        color3 = r4;
        goto L64
    L38:
        if ($composer2.getSkipping() == false) goto L41;
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        color4 = r4;
        trackColor4 = trackColor2;
        goto L71
    L27:
        if ((r26 & 4) != 0) goto L31;
        trackColor2 = trackColor;
        if ($composer2.changed(trackColor2) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
    L32:
        r10 = 128;
        goto L33
    L31:
        trackColor2 = trackColor;
        goto L32
    L16:
        if ((r26 & 2) != 0) goto L20;
        r4 = color;
        if ($composer2.changed(r4) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
    L21:
        r7 = 16;
        goto L22
    L20:
        r4 = color;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L14
    L10:
        r5 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L14
    }

    /* JADX INFO: renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    private static final void m2513drawLinearIndicatorqYKTg0g(DrawScope $this$drawLinearIndicator_u2dqYKTg0g, float startFraction, float endFraction, long color, float strokeWidth, int strokeCap) {
        float width = Size.m4194getWidthimpl($this$drawLinearIndicator_u2dqYKTg0g.mo4917getSizeNHjbRc());
        float height = Size.m4191getHeightimpl($this$drawLinearIndicator_u2dqYKTg0g.mo4917getSizeNHjbRc());
        float yOffset = height / 2.0f;
        if ($this$drawLinearIndicator_u2dqYKTg0g.getLayoutDirection() != LayoutDirection.Ltr) goto L5;
        boolean isLtr = true;
    L7:
        if (isLtr == false) goto L9;
        float r6 = startFraction;
    L10:
        float barStart = r6 * width;
        if (isLtr == false) goto L13;
        float r5 = endFraction;
    L14:
        float barEnd = r5 * width;
        if (StrokeCap.m4715equalsimpl0(strokeCap, StrokeCap.Companion.m4719getButtKaPHkGw()) == false) goto L17;
    L23:
        DrawScope.m4903drawLineNGM6Ib0$default($this$drawLinearIndicator_u2dqYKTg0g, color, OffsetKt.Offset(barStart, yOffset), OffsetKt.Offset(barEnd, yOffset), strokeWidth, 0, null, 0.0f, null, 0, 496, null);
        return;
    L17:
        if (height > width) goto L23;
        float strokeCapOffset = strokeWidth / 2.0f;
        ClosedFloatingPointRange<Float> r7 = RangesKt.rangeTo(strokeCapOffset, width - strokeCapOffset);
        float adjustedBarStart = ((Number) RangesKt.coerceIn(Float.valueOf(barStart), r7)).floatValue();
        float adjustedBarEnd = ((Number) RangesKt.coerceIn(Float.valueOf(barEnd), r7)).floatValue();
        if (Math.abs(endFraction - startFraction) <= 0.0f) goto L26;
        DrawScope.m4903drawLineNGM6Ib0$default($this$drawLinearIndicator_u2dqYKTg0g, color, OffsetKt.Offset(adjustedBarStart, yOffset), OffsetKt.Offset(adjustedBarEnd, yOffset), strokeWidth, strokeCap, null, 0.0f, null, 0, 480, null);
        return;
    L26:
        return;
    L13:
        r5 = 1.0f - startFraction;
        goto L14
    L9:
        r6 = 1.0f - endFraction;
        goto L10
    L5:
        isLtr = false;
        goto L7
    }

    static {
        SemanticsBoundsPadding = Dp.m6973constructorimpl(10);
        IncreaseSemanticsBounds = PaddingKt.m727paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.Companion, ProgressIndicatorKt$IncreaseSemanticsBounds$1.INSTANCE), true, ProgressIndicatorKt$IncreaseSemanticsBounds$2.INSTANCE), 0.0f, SemanticsBoundsPadding, 1, null);
        LinearIndicatorWidth = Dp.m6973constructorimpl(240);
        LinearIndicatorHeight = ProgressIndicatorTokens.INSTANCE.m3594getTrackThicknessD9Ej5fM();
        float arg0$iv = ProgressIndicatorTokens.INSTANCE.m3591getSizeD9Ej5fM();
        float arg0$iv2 = ProgressIndicatorTokens.INSTANCE.m3594getTrackThicknessD9Ej5fM();
        CircularIndicatorDiameter = Dp.m6973constructorimpl(arg0$iv - Dp.m6973constructorimpl(2 * arg0$iv2));
        FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `gapSize`, see `LegacyCircularProgressIndicatorSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "CircularProgressIndicator(progress, modifier, color, strokeWidth, trackColor, strokeCap, gapSize)", imports = {}))
    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    public static final /* synthetic */ void m2492CircularProgressIndicatorDUhRLBM(final Function0 progress, Modifier modifier, long color, float strokeWidth, long trackColor, int strokeCap, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(-761680467);
        ComposerKt.sourceInformation($composer2, "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,4:c#ui.unit.Dp,5:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)529@21735L13,531@21869L29,534@21991L217:ProgressIndicator.kt#uh7d8r");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0 r10 = progress;
    L13:
        int r3 = r34 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        long color2 = color;
    L35:
        int r7 = r34 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        float strokeWidth2 = strokeWidth;
    L47:
        if (($changed & 24576) == 0) goto L49;
        long trackColor2 = trackColor;
    L57:
        int r13 = r34 & 32;
        if (r13 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        int r14 = strokeCap;
    L69:
        if ((74899 & $dirty) == 74898) goto L71;
    L74:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L77;
    L86:
        if (r3 == 0) goto L88;
        Modifier.Companion modifier2 = Modifier.Companion;
    L90:
        if ((r34 & 4) == 0) goto L92;
        color2 = ProgressIndicatorDefaults.INSTANCE.getCircularColor($composer2, 6);
        $dirty = $dirty & (-897);
    L92:
        if (r7 == 0) goto L95;
        strokeWidth2 = ProgressIndicatorDefaults.INSTANCE.m2487getCircularStrokeWidthD9Ej5fM();
    L95:
        if ((r34 & 16) == 0) goto L97;
        $dirty = $dirty & (-57345);
        trackColor2 = ProgressIndicatorDefaults.INSTANCE.getCircularDeterminateTrackColor($composer2, 6);
    L97:
        if (r13 == 0) goto L99;
        int strokeCap2 = ProgressIndicatorDefaults.INSTANCE.m2484getCircularDeterminateStrokeCapKaPHkGw();
        float strokeWidth3 = strokeWidth2;
        long trackColor3 = trackColor2;
        Modifier modifier3 = modifier2;
        long color3 = color2;
        int r0 = -761680467;
    L100:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L103;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:533)");
    L103:
        Composer $composer3 = $composer2;
        m2493CircularProgressIndicatorIyT6zlY(r10, modifier3, color3, strokeWidth3, trackColor3, strokeCap2, ProgressIndicatorDefaults.INSTANCE.m2486getCircularIndicatorTrackGapSizeD9Ej5fM(), $composer3, (((((($dirty & 14) | 1572864) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventEnd();
    L106:
        final Modifier modifier4 = modifier3;
        final long color4 = color3;
        final float strokeWidth4 = strokeWidth3;
        final long trackColor4 = trackColor3;
        final int strokeCap3 = strokeCap2;
    L107:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L111;
        r12.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$1(progress, modifier4, color4, strokeWidth4, trackColor4, strokeCap3, $changed, r34));
        return;
    L111:
        return;
    L99:
        trackColor3 = trackColor2;
        strokeCap2 = r14;
        modifier3 = modifier2;
        color3 = color2;
        strokeWidth3 = strokeWidth2;
        r0 = -761680467;
        goto L100
    L88:
        modifier2 = r4;
        goto L90
    L77:
        if ($composer2.getDefaultsInvalid() == true) goto L86;
        $composer2.skipToGroupEnd();
        if ((r34 & 4) == 0) goto L83;
        $dirty = $dirty & (-897);
    L83:
        if ((r34 & 16) == 0) goto L85;
        $dirty = $dirty & (-57345);
        trackColor3 = trackColor2;
        strokeCap2 = r14;
        r0 = -761680467;
        modifier3 = r4;
        color3 = color2;
        strokeWidth3 = strokeWidth2;
        goto L100
    L85:
        trackColor3 = trackColor2;
        strokeCap2 = r14;
        r0 = -761680467;
        modifier3 = r4;
        color3 = color2;
        strokeWidth3 = strokeWidth2;
        goto L100
    L71:
        if ($composer2.getSkipping() == false) goto L74;
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        color4 = color2;
        trackColor4 = trackColor2;
        $composer3 = $composer2;
        strokeWidth4 = strokeWidth2;
        strokeCap3 = r14;
        goto L107
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r14 = strokeCap;
        if ($composer2.changed(r14) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
        goto L69
    L65:
        r15 = 65536;
        goto L66
    L67:
        r14 = strokeCap;
        goto L69
    L49:
        if ((r34 & 16) != 0) goto L53;
        trackColor2 = trackColor;
        if ($composer2.changed(trackColor2) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
    L54:
        r16 = 8192;
        goto L55
    L53:
        trackColor2 = trackColor;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        strokeWidth2 = strokeWidth;
        if ($composer2.changed(strokeWidth2) == false) goto L43;
        int r11 = 2048;
    L44:
        $dirty = $dirty | r11;
        goto L47
    L43:
        r11 = 1024;
        goto L44
    L45:
        strokeWidth2 = strokeWidth;
        goto L47
    L27:
        if ((r34 & 4) != 0) goto L31;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
    L32:
        r8 = 128;
        goto L33
    L31:
        color2 = color;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r5 = 32;
    L22:
        $dirty = $dirty | r5;
        goto L25
    L21:
        r5 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r10 = progress;
        if ($composer2.changedInstance(r10) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    L12:
        r10 = progress;
        goto L13
    }

    /* JADX INFO: renamed from: CircularProgressIndicator-IyT6zlY, reason: not valid java name */
    public static final void m2493CircularProgressIndicatorIyT6zlY(final Function0<Float> r31, Modifier modifier, long color, float strokeWidth, long trackColor, int strokeCap, float gapSize, Composer $composer, final int $changed, final int r42) {
        Composer $composer2 = $composer.startRestartGroup(-1798883595);
        ComposerKt.sourceInformation($composer2, "C(CircularProgressIndicator)P(3,2,0:c#ui.graphics.Color,5:c#ui.unit.Dp,6:c#ui.graphics.Color,4:c#ui.graphics.StrokeCap,1:c#ui.unit.Dp)575@23884L13,577@24018L29,581@24237L31,*582@24304L7,585@24446L102,589@24600L709,583@24373L936:ProgressIndicator.kt#uh7d8r");
        int $dirty = $changed;
        if ((r42 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r42 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) != 0) goto L34;
        if ((r42 & 4) != 0) goto L31;
        if ($composer2.changed(color) == false) goto L31;
        int r6 = 256;
    L32:
        $dirty = $dirty | r6;
    L31:
        r6 = 128;
    L34:
        int r7 = r42 & 8;
        if (r7 == 0) goto L38;
        $dirty = $dirty | 3072;
        float strokeWidth2 = strokeWidth;
    L46:
        if (($changed & 24576) == 0) goto L48;
        long trackColor2 = trackColor;
    L56:
        int r9 = r42 & 32;
        if (r9 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        int strokeCap2 = strokeCap;
    L67:
        int r17 = r42 & 64;
        if (r17 == 0) goto L71;
        $dirty = $dirty | 1572864;
        float r11 = gapSize;
    L79:
        if (($dirty & 599187) == 599186) goto L81;
    L84:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L87;
    L96:
        if (r3 == 0) goto L99;
        modifier2 = Modifier.Companion;
    L99:
        if ((r42 & 4) == 0) goto L101;
        long color2 = ProgressIndicatorDefaults.INSTANCE.getCircularColor($composer2, 6);
        $dirty = $dirty & (-897);
    L102:
        if (r7 == 0) goto L105;
        strokeWidth2 = ProgressIndicatorDefaults.INSTANCE.m2487getCircularStrokeWidthD9Ej5fM();
    L105:
        if ((r42 & 16) == 0) goto L107;
        $dirty = $dirty & (-57345);
        trackColor2 = ProgressIndicatorDefaults.INSTANCE.getCircularDeterminateTrackColor($composer2, 6);
    L107:
        if (r9 == 0) goto L109;
        strokeCap2 = ProgressIndicatorDefaults.INSTANCE.m2484getCircularDeterminateStrokeCapKaPHkGw();
    L109:
        if (r17 == 0) goto L111;
        int $dirty2 = $dirty;
        final float gapSize2 = ProgressIndicatorDefaults.INSTANCE.m2486getCircularIndicatorTrackGapSizeD9Ej5fM();
        final int strokeCap3 = strokeCap2;
        long color3 = color2;
    L112:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L115;
        ComposerKt.traceEventStart(-1798883595, $dirty2, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:580)");
    L115:
        ComposerKt.sourceInformationMarkerStart($composer2, -291619137, "CC(remember):ProgressIndicator.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L118;
        boolean invalid$iv = true;
    L119:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L122;
    L125:
        Object value$iv = (Function0) new ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1(r31);
        $composer2.updateRememberedValue(value$iv);
    L126:
        final Function0 coercedProgress = (Function0) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<Density> r10 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r1 = $composer2.consume(r10);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$CircularProgressIndicator_IyT6zlY_u24lambda_u247 = (Density) r1;
        final Stroke stroke = new Stroke($this$CircularProgressIndicator_IyT6zlY_u24lambda_u247.mo376toPx0680j_4(strokeWidth2), 0.0f, strokeCap3, 0, null, 26, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -291612378, "CC(remember):ProgressIndicator.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changed(coercedProgress);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L133;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L133;
        Object value$iv2 = it$iv2;
    L134:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        boolean r12 = true;
        Modifier r13 = SizeKt.m772size3ABfNKs(SemanticsModifierKt.semantics(modifier2, true, (Function1) value$iv2), CircularIndicatorDiameter);
        ComposerKt.sourceInformationMarkerStart($composer2, -291606843, "CC(remember):ProgressIndicator.kt#9igjgp");
        boolean r8 = $composer2.changed(coercedProgress);
        if ((458752 & $dirty2) != 131072) goto L137;
        boolean r14 = true;
    L138:
        boolean r15 = r8 | r14;
        if ((3670016 & $dirty2) != 1048576) goto L141;
        boolean r16 = true;
    L142:
        boolean r18 = r15 | r16;
        if (($dirty2 & 7168) != 2048) goto L145;
        boolean r19 = true;
    L146:
        boolean r20 = r18 | r19;
        if (((57344 & $dirty2) ^ 24576) <= 16384) goto L151;
        if ($composer2.changed(trackColor2) == false) goto L151;
    L152:
        boolean r110 = true;
    L154:
        boolean r21 = (r20 | r110) | $composer2.changedInstance(stroke);
        if ((($dirty2 & 896) ^ 384) <= 256) goto L159;
        if ($composer2.changed(color3) == false) goto L159;
    L162:
        boolean invalid$iv3 = r21 | r12;
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L169;
        if (it$iv3 == Composer.Companion.getEmpty()) goto L169;
        final long color4 = color3;
        final long trackColor3 = trackColor2;
        final float strokeWidth3 = strokeWidth2;
        Object value$iv3 = it$iv3;
    L170:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r13, (Function1) value$iv3, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L173;
        ComposerKt.traceEventEnd();
    L173:
        final Modifier modifier3 = modifier2;
        final int strokeCap4 = strokeCap3;
        final float gapSize3 = gapSize2;
        final float strokeWidth4 = strokeWidth3;
        final long trackColor4 = trackColor3;
        final long color5 = color4;
    L174:
        ScopeUpdateScope r111 = $composer2.endRestartGroup();
        if (r111 == null) goto L178;
        r111.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$4(r31, modifier3, color5, strokeWidth4, trackColor4, strokeCap4, gapSize3, $changed, r42));
        return;
    L178:
        return;
    L169:
        color4 = color3;
        trackColor3 = trackColor2;
        strokeWidth3 = strokeWidth2;
        value$iv3 = new ProgressIndicatorKt$CircularProgressIndicator$3$1(coercedProgress, strokeCap3, gapSize2, strokeWidth3, trackColor3, stroke, color4);
        $composer2.updateRememberedValue(value$iv3);
    L159:
        if (($dirty2 & 384) == 256) goto L162;
        r12 = false;
    L151:
        if (($dirty2 & 24576) == 16384) goto L152;
        r110 = false;
        goto L154
    L145:
        r19 = false;
        goto L146
    L141:
        r16 = false;
        goto L142
    L137:
        r14 = false;
    L133:
        value$iv2 = (Function1) new ProgressIndicatorKt$CircularProgressIndicator$2$1(coercedProgress);
        $composer2.updateRememberedValue(value$iv2);
        goto L134
    L122:
        if (it$iv == Composer.Companion.getEmpty()) goto L125;
        value$iv = it$iv;
        goto L126
    L118:
        invalid$iv = false;
        goto L119
    L111:
        $dirty2 = $dirty;
        gapSize2 = r11;
        strokeCap3 = strokeCap2;
        color3 = color2;
        goto L112
    L101:
        color2 = color;
        goto L102
    L87:
        if ($composer2.getDefaultsInvalid() == true) goto L96;
        $composer2.skipToGroupEnd();
        if ((r42 & 4) == 0) goto L93;
        $dirty = $dirty & (-897);
    L93:
        if ((r42 & 16) == 0) goto L95;
        $dirty = $dirty & (-57345);
    L95:
        $dirty2 = $dirty;
        gapSize2 = r11;
        strokeCap3 = strokeCap2;
        color3 = color;
        goto L112
    L81:
        if ($composer2.getSkipping() == false) goto L84;
        $composer2.skipToGroupEnd();
        modifier3 = modifier2;
        strokeWidth4 = strokeWidth2;
        color5 = color;
        trackColor4 = trackColor2;
        gapSize3 = r11;
        strokeCap4 = strokeCap2;
        goto L174
    L71:
        if (($changed & 1572864) != 0) goto L77;
        r11 = gapSize;
        if ($composer2.changed(r11) == false) goto L75;
        int r22 = 1048576;
    L76:
        $dirty = $dirty | r22;
        goto L79
    L75:
        r22 = 524288;
        goto L76
    L77:
        r11 = gapSize;
        goto L79
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        strokeCap2 = strokeCap;
        if ($composer2.changed(strokeCap2) == false) goto L64;
        int r112 = 131072;
    L65:
        $dirty = $dirty | r112;
        goto L67
    L64:
        r112 = 65536;
        goto L65
    L66:
        strokeCap2 = strokeCap;
        goto L67
    L48:
        if ((r42 & 16) != 0) goto L52;
        trackColor2 = trackColor;
        if ($composer2.changed(trackColor2) == false) goto L53;
        int r23 = 16384;
    L54:
        $dirty = $dirty | r23;
    L53:
        r23 = 8192;
        goto L54
    L52:
        trackColor2 = trackColor;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        strokeWidth2 = strokeWidth;
        if ($composer2.changed(strokeWidth2) == false) goto L42;
        int r113 = 2048;
    L43:
        $dirty = $dirty | r113;
        goto L46
    L42:
        r113 = 1024;
        goto L43
    L44:
        strokeWidth2 = strokeWidth;
        goto L46
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r24 = 32;
    L21:
        $dirty = $dirty | r24;
        goto L24
    L20:
        r24 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r31) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L12
    L10:
        r4 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    public static final void m2494CircularProgressIndicatorLxG7B9w(Modifier modifier, long color, float strokeWidth, long trackColor, int strokeCap, Composer $composer, final int $changed, final int r43) {
        Composer $composer2 = $composer.startRestartGroup(-115871647);
        ComposerKt.sourceInformation($composer2, "C(CircularProgressIndicator)P(1,0:c#ui.graphics.Color,3:c#ui.unit.Dp,4:c#ui.graphics.Color,2:c#ui.graphics.StrokeCap)633@26429L13,635@26563L31,*638@26720L7,640@26807L28,643@26972L350,657@27444L208,666@27777L422,679@28240L431,691@28745L628,691@28676L697:ProgressIndicator.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r43 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long color2 = color;
    L24:
        int r5 = r43 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        float strokeWidth2 = strokeWidth;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long trackColor2 = trackColor;
    L46:
        int r12 = r43 & 16;
        if (r12 == 0) goto L50;
        $dirty = $dirty | 24576;
        int r6 = strokeCap;
    L58:
        if (($dirty & 9363) == 9362) goto L60;
    L63:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L66;
    L75:
        if (r2 == 0) goto L77;
        Modifier.Companion modifier2 = Modifier.Companion;
    L79:
        if ((r43 & 2) == 0) goto L81;
        color2 = ProgressIndicatorDefaults.INSTANCE.getCircularColor($composer2, 6);
        $dirty = $dirty & (-113);
    L81:
        if (r5 == 0) goto L84;
        strokeWidth2 = ProgressIndicatorDefaults.INSTANCE.m2487getCircularStrokeWidthD9Ej5fM();
    L84:
        if ((r43 & 8) == 0) goto L86;
        $dirty = $dirty & (-7169);
        trackColor2 = ProgressIndicatorDefaults.INSTANCE.getCircularIndeterminateTrackColor($composer2, 6);
    L86:
        if (r12 == 0) goto L88;
        int $dirty2 = $dirty;
        int strokeCap2 = ProgressIndicatorDefaults.INSTANCE.m2485getCircularIndeterminateStrokeCapKaPHkGw();
        long color3 = color2;
        float strokeWidth3 = strokeWidth2;
        long trackColor3 = trackColor2;
    L89:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L92;
        ComposerKt.traceEventStart(-115871647, $dirty2, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
    L92:
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r11 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$CircularProgressIndicator_LxG7B9w_u24lambda_u2410 = (Density) r11;
        final Stroke stroke = new Stroke($this$CircularProgressIndicator_LxG7B9w_u24lambda_u2410.mo376toPx0680j_4(strokeWidth3), 0.0f, strokeCap2, 0, null, 26, null);
        int strokeCap3 = strokeCap2;
        InfiniteTransition transition = InfiniteTransitionKt.rememberInfiniteTransition(null, $composer2, 0, 1);
        final float strokeWidth4 = strokeWidth3;
        Modifier modifier3 = modifier2;
        boolean r21 = true;
        final State currentRotation = InfiniteTransitionKt.animateValue(transition, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 12), 16);
        final State<Float> r28 = InfiniteTransitionKt.animateFloat(transition, 0.0f, BaseRotationAngle, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        final State<Float> r26 = InfiniteTransitionKt.animateFloat(transition, 0.0f, JumpRotationAngle, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$CircularProgressIndicator$endAngle$1.INSTANCE), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        final State<Float> r27 = InfiniteTransitionKt.animateFloat(transition, 0.0f, JumpRotationAngle, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$CircularProgressIndicator$startAngle$1.INSTANCE), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        Modifier r13 = SizeKt.m772size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter);
        ComposerKt.sourceInformationMarkerStart($composer2, -291474284, "CC(remember):ProgressIndicator.kt#9igjgp");
        if ((($dirty2 & 7168) ^ 3072) <= 2048) goto L97;
        if ($composer2.changed(trackColor3) == false) goto L97;
    L98:
        boolean r1 = true;
    L100:
        boolean r3 = ((((r1 | $composer2.changedInstance(stroke)) | $composer2.changed(currentRotation)) | $composer2.changed(r26)) | $composer2.changed(r27)) | $composer2.changed(r28);
        if (($dirty2 & 896) != 256) goto L103;
        boolean r7 = true;
    L104:
        boolean r8 = r3 | r7;
        if ((($dirty2 & 112) ^ 48) <= 32) goto L109;
        if ($composer2.changed(color3) == false) goto L109;
    L112:
        boolean invalid$iv = r8 | r21;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L119;
        if (it$iv == Composer.Companion.getEmpty()) goto L119;
        Object value$iv = it$iv;
        final long color4 = color3;
        final long trackColor4 = trackColor3;
    L120:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r13, (Function1) value$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L123;
        ComposerKt.traceEventEnd();
    L123:
        final long trackColor5 = trackColor4;
        final float strokeWidth5 = strokeWidth4;
        final long color5 = color4;
        final int $dirty3 = strokeCap3;
        final Modifier modifier4 = modifier3;
    L124:
        ScopeUpdateScope r14 = $composer2.endRestartGroup();
        if (r14 == null) goto L128;
        r14.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$6(modifier4, color5, strokeWidth5, trackColor5, $dirty3, $changed, r43));
        return;
    L128:
        return;
    L119:
        color4 = color3;
        trackColor4 = trackColor3;
        value$iv = new ProgressIndicatorKt$CircularProgressIndicator$5$1(trackColor4, stroke, currentRotation, r26, r27, r28, strokeWidth4, color4);
        $composer2.updateRememberedValue(value$iv);
    L109:
        if (($dirty2 & 48) == 32) goto L112;
        r21 = false;
        goto L112
    L103:
        r7 = false;
    L97:
        if (($dirty2 & 3072) == 2048) goto L98;
        r1 = false;
        goto L100
    L88:
        $dirty2 = $dirty;
        strokeCap2 = r6;
        color3 = color2;
        strokeWidth3 = strokeWidth2;
        trackColor3 = trackColor2;
        goto L89
    L77:
        modifier2 = r4;
        goto L79
    L66:
        if ($composer2.getDefaultsInvalid() == true) goto L75;
        $composer2.skipToGroupEnd();
        if ((r43 & 2) == 0) goto L72;
        $dirty = $dirty & (-113);
    L72:
        if ((r43 & 8) == 0) goto L74;
        $dirty = $dirty & (-7169);
    L74:
        $dirty2 = $dirty;
        modifier2 = r4;
        strokeCap2 = r6;
        color3 = color2;
        strokeWidth3 = strokeWidth2;
        trackColor3 = trackColor2;
        goto L89
    L60:
        if ($composer2.getSkipping() == false) goto L63;
        $composer2.skipToGroupEnd();
        $dirty3 = r6;
        color5 = color2;
        trackColor5 = trackColor2;
        modifier4 = r4;
        strokeWidth5 = strokeWidth2;
        goto L124
    L50:
        if (($changed & 24576) != 0) goto L56;
        r6 = strokeCap;
        if ($composer2.changed(r6) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
        goto L58
    L54:
        r16 = 8192;
        goto L55
    L56:
        r6 = strokeCap;
        goto L58
    L38:
        if ((r43 & 8) != 0) goto L42;
        trackColor2 = trackColor;
        if ($composer2.changed(trackColor2) == false) goto L43;
        int r15 = 2048;
    L44:
        $dirty = $dirty | r15;
    L43:
        r15 = 1024;
        goto L44
    L42:
        trackColor2 = trackColor;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        strokeWidth2 = strokeWidth;
        if ($composer2.changed(strokeWidth2) == false) goto L32;
        int r17 = 256;
    L33:
        $dirty = $dirty | r17;
        goto L36
    L32:
        r17 = 128;
        goto L33
    L34:
        strokeWidth2 = strokeWidth;
        goto L36
    L16:
        if ((r43 & 2) != 0) goto L20;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L21;
        int r9 = 32;
    L22:
        $dirty = $dirty | r9;
    L21:
        r9 = 16;
        goto L22
    L20:
        color2 = color;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L14
    L10:
        r10 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L14
    }

    @Deprecated(message = "Use the overload that takes `progress` as a lambda", replaceWith = @ReplaceWith(expression = "CircularProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\nstrokeWidth = strokeWidth,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    public static final void m2491CircularProgressIndicatorDUhRLBM(final float progress, Modifier modifier, long color, float strokeWidth, long trackColor, int strokeCap, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(-1472321743);
        ComposerKt.sourceInformation($composer2, "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,4:c#ui.unit.Dp,5:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)730@30011L13,732@30145L18,736@30302L12,735@30256L216:ProgressIndicator.kt#uh7d8r");
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
        long color2 = color;
    L34:
        int r10 = r32 & 8;
        if (r10 == 0) goto L38;
        $dirty = $dirty | 3072;
        float strokeWidth2 = strokeWidth;
    L46:
        if (($changed & 24576) == 0) goto L48;
        long trackColor2 = trackColor;
    L56:
        int r14 = r32 & 32;
        if (r14 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        int r15 = strokeCap;
    L68:
        if (($dirty & 74899) == 74898) goto L70;
    L73:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L76;
    L85:
        if (r4 == 0) goto L88;
        modifier2 = Modifier.Companion;
    L88:
        if ((r32 & 4) == 0) goto L90;
        color2 = ProgressIndicatorDefaults.INSTANCE.getCircularColor($composer2, 6);
        $dirty = $dirty & (-897);
    L90:
        if (r10 == 0) goto L93;
        strokeWidth2 = ProgressIndicatorDefaults.INSTANCE.m2487getCircularStrokeWidthD9Ej5fM();
    L93:
        if ((r32 & 16) == 0) goto L95;
        trackColor2 = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor($composer2, 6);
        $dirty = $dirty & (-57345);
    L95:
        if (r14 == 0) goto L97;
        int strokeCap2 = ProgressIndicatorDefaults.INSTANCE.m2484getCircularDeterminateStrokeCapKaPHkGw();
        float strokeWidth3 = strokeWidth2;
        long trackColor3 = trackColor2;
        int r0 = -1472321743;
        Modifier modifier3 = modifier2;
        long trackColor4 = color2;
    L98:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L101;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:735)");
    L101:
        ComposerKt.sourceInformationMarkerStart($composer2, -291425076, "CC(remember):ProgressIndicator.kt#9igjgp");
        if (($dirty & 14) != 4) goto L104;
        boolean invalid$iv = true;
    L105:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L108;
    L111:
        Object value$iv = (Function0) new ProgressIndicatorKt$CircularProgressIndicator$7$1(progress);
        $composer2.updateRememberedValue(value$iv);
    L112:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Composer $composer3 = $composer2;
        m2493CircularProgressIndicatorIyT6zlY((Function0) value$iv, modifier3, trackColor4, strokeWidth3, trackColor3, strokeCap2, 0.0f, $composer3, (((($dirty & 112) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty), 64);
        if (ComposerKt.isTraceInProgress() == false) goto L115;
        ComposerKt.traceEventEnd();
    L115:
        final Modifier modifier4 = modifier3;
        final float strokeWidth4 = strokeWidth3;
        final long trackColor5 = trackColor3;
        final int strokeCap3 = strokeCap2;
        final long color3 = trackColor4;
    L116:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L120;
        r12.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$8(progress, modifier4, color3, strokeWidth4, trackColor5, strokeCap3, $changed, r32));
        return;
    L120:
        return;
    L108:
        if (it$iv == Composer.Companion.getEmpty()) goto L111;
        value$iv = it$iv;
        goto L112
    L104:
        invalid$iv = false;
        goto L105
    L97:
        strokeWidth3 = strokeWidth2;
        strokeCap2 = r15;
        r0 = -1472321743;
        modifier3 = modifier2;
        trackColor3 = trackColor2;
        trackColor4 = color2;
        goto L98
    L76:
        if ($composer2.getDefaultsInvalid() == true) goto L85;
        $composer2.skipToGroupEnd();
        if ((r32 & 4) == 0) goto L82;
        $dirty = $dirty & (-897);
    L82:
        if ((r32 & 16) == 0) goto L84;
        $dirty = $dirty & (-57345);
        strokeWidth3 = strokeWidth2;
        strokeCap2 = r15;
        r0 = -1472321743;
        modifier3 = modifier2;
        trackColor3 = trackColor2;
        trackColor4 = color2;
        goto L98
    L84:
        strokeWidth3 = strokeWidth2;
        strokeCap2 = r15;
        r0 = -1472321743;
        modifier3 = modifier2;
        trackColor3 = trackColor2;
        trackColor4 = color2;
        goto L98
    L70:
        if ($composer2.getSkipping() == false) goto L73;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = modifier2;
        strokeWidth4 = strokeWidth2;
        color3 = color2;
        trackColor5 = trackColor2;
        strokeCap3 = r15;
        goto L116
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r15 = strokeCap;
        if ($composer2.changed(r15) == false) goto L64;
        int r16 = 131072;
    L65:
        $dirty = $dirty | r16;
        goto L68
    L64:
        r16 = 65536;
        goto L65
    L66:
        r15 = strokeCap;
        goto L68
    L48:
        if ((r32 & 16) != 0) goto L52;
        trackColor2 = trackColor;
        if ($composer2.changed(trackColor2) == false) goto L53;
        int r17 = 16384;
    L54:
        $dirty = $dirty | r17;
    L53:
        r17 = 8192;
        goto L54
    L52:
        trackColor2 = trackColor;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        strokeWidth2 = strokeWidth;
        if ($composer2.changed(strokeWidth2) == false) goto L42;
        int r13 = 2048;
    L43:
        $dirty = $dirty | r13;
        goto L46
    L42:
        r13 = 1024;
        goto L43
    L44:
        strokeWidth2 = strokeWidth;
        goto L46
    L26:
        if ((r32 & 4) != 0) goto L30;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L31;
        int r11 = 256;
    L32:
        $dirty = $dirty | r11;
    L31:
        r11 = 128;
        goto L32
    L30:
        color2 = color;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r7 = 32;
    L21:
        $dirty = $dirty | r7;
        goto L24
    L20:
        r7 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(progress) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L12
    L10:
        r5 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    public static final /* synthetic */ void m2495CircularProgressIndicatorMBs18nI(final float progress, Modifier modifier, long color, float strokeWidth, Composer $composer, final int $changed, final int r27) {
        Composer $composer2 = $composer.startRestartGroup(402841196);
        ComposerKt.sourceInformation($composer2, "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,3:c#ui.unit.Dp)750@30727L13,758@30964L18,753@30818L247:ProgressIndicator.kt#uh7d8r");
        int $dirty = $changed;
        if ((r27 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        float r7 = progress;
    L13:
        int r2 = r27 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r3 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        long r4 = color;
    L35:
        int r8 = r27 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        float r9 = strokeWidth;
    L47:
        if (($dirty & 1171) == 1170) goto L49;
    L52:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L55;
    L61:
        if (r2 == 0) goto L63;
        Modifier.Companion modifier2 = Modifier.Companion;
    L65:
        if ((r27 & 4) == 0) goto L67;
        long color2 = ProgressIndicatorDefaults.INSTANCE.getCircularColor($composer2, 6);
        $dirty = $dirty & (-897);
    L68:
        if (r8 == 0) goto L70;
        float strokeWidth2 = ProgressIndicatorDefaults.INSTANCE.m2487getCircularStrokeWidthD9Ej5fM();
        Modifier modifier3 = modifier2;
        long color3 = color2;
    L71:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventStart(402841196, $dirty, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:753)");
    L74:
        float strokeWidth3 = strokeWidth2;
        m2491CircularProgressIndicatorDUhRLBM(r7, modifier3, color3, strokeWidth3, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor($composer2, 6), ProgressIndicatorDefaults.INSTANCE.m2484getCircularDeterminateStrokeCapKaPHkGw(), $composer2, (((($dirty & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L77;
        ComposerKt.traceEventEnd();
    L77:
        final Modifier modifier4 = modifier3;
        final long color4 = color3;
        final float strokeWidth4 = strokeWidth3;
    L78:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L82;
        r10.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$9(progress, modifier4, color4, strokeWidth4, $changed, r27));
        return;
    L82:
        return;
    L70:
        modifier3 = modifier2;
        strokeWidth2 = r9;
        color3 = color2;
        goto L71
    L67:
        color2 = r4;
        goto L68
    L63:
        modifier2 = r3;
        goto L65
    L55:
        if ($composer2.getDefaultsInvalid() == true) goto L61;
        $composer2.skipToGroupEnd();
        if ((r27 & 4) == 0) goto L60;
        $dirty = $dirty & (-897);
    L60:
        strokeWidth2 = r9;
        color3 = r4;
        modifier3 = r3;
        goto L71
    L49:
        if ($composer2.getSkipping() == false) goto L52;
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        color4 = r4;
        strokeWidth4 = r9;
        goto L78
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = strokeWidth;
        if ($composer2.changed(r9) == false) goto L43;
        int r11 = 2048;
    L44:
        $dirty = $dirty | r11;
        goto L47
    L43:
        r11 = 1024;
        goto L44
    L45:
        r9 = strokeWidth;
        goto L47
    L27:
        if ((r27 & 4) != 0) goto L31;
        r4 = color;
        if ($composer2.changed(r4) == false) goto L32;
        int r12 = 256;
    L33:
        $dirty = $dirty | r12;
    L32:
        r12 = 128;
        goto L33
    L31:
        r4 = color;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L21;
        int r5 = 32;
    L22:
        $dirty = $dirty | r5;
        goto L25
    L21:
        r5 = 16;
        goto L22
    L23:
        r3 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r7 = progress;
        if ($composer2.changed(r7) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    L12:
        r7 = progress;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    public static final /* synthetic */ void m2496CircularProgressIndicatoraMcp0Q(Modifier modifier, long color, float strokeWidth, Composer $composer, final int $changed, final int r24) {
        Composer $composer2 = $composer.startRestartGroup(947193756);
        ComposerKt.sourceInformation($composer2, "C(CircularProgressIndicator)P(1,0:c#ui.graphics.Color,2:c#ui.unit.Dp)767@31299L13,774@31518L18,770@31390L231:ProgressIndicator.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r24 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long color2 = color;
    L24:
        int r4 = r24 & 4;
        if (r4 == 0) goto L28;
        $dirty = $dirty | 384;
        float r8 = strokeWidth;
    L36:
        if (($dirty & 147) == 146) goto L38;
    L41:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L44;
    L50:
        if (r2 == 0) goto L52;
        Modifier.Companion modifier2 = Modifier.Companion;
    L54:
        if ((r24 & 2) == 0) goto L56;
        color2 = ProgressIndicatorDefaults.INSTANCE.getCircularColor($composer2, 6);
        $dirty = $dirty & (-113);
    L56:
        if (r4 == 0) goto L58;
        float strokeWidth2 = ProgressIndicatorDefaults.INSTANCE.m2487getCircularStrokeWidthD9Ej5fM();
        long color3 = color2;
        Modifier modifier3 = modifier2;
    L59:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventStart(947193756, $dirty, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:770)");
    L62:
        m2494CircularProgressIndicatorLxG7B9w(modifier3, color3, strokeWidth2, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor($composer2, 6), ProgressIndicatorDefaults.INSTANCE.m2485getCircularIndeterminateStrokeCapKaPHkGw(), $composer2, ((($dirty & 14) | 24576) | ($dirty & 112)) | ($dirty & 896), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L65;
        ComposerKt.traceEventEnd();
    L65:
        final long color4 = color3;
        final float strokeWidth3 = strokeWidth2;
        final Modifier modifier4 = modifier3;
    L66:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L70;
        r9.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$10(modifier4, color4, strokeWidth3, $changed, r24));
        return;
    L70:
        return;
    L58:
        strokeWidth2 = r8;
        color3 = color2;
        modifier3 = modifier2;
        goto L59
    L52:
        modifier2 = r3;
        goto L54
    L44:
        if ($composer2.getDefaultsInvalid() == true) goto L50;
        $composer2.skipToGroupEnd();
        if ((r24 & 2) == 0) goto L49;
        $dirty = $dirty & (-113);
    L49:
        strokeWidth2 = r8;
        color3 = color2;
        modifier3 = r3;
        goto L59
    L38:
        if ($composer2.getSkipping() == false) goto L41;
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        color4 = color2;
        strokeWidth3 = r8;
        goto L66
    L28:
        if (($changed & 384) != 0) goto L34;
        r8 = strokeWidth;
        if ($composer2.changed(r8) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
        goto L36
    L32:
        r10 = 128;
        goto L33
    L34:
        r8 = strokeWidth;
        goto L36
    L16:
        if ((r24 & 2) != 0) goto L20;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L21;
        int r5 = 32;
    L22:
        $dirty = $dirty | r5;
    L21:
        r5 = 16;
        goto L22
    L20:
        color2 = color;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L14
    L10:
        r6 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L14
    }

    /* JADX INFO: renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m2509drawCircularIndicator42QJj7c(DrawScope $this$drawCircularIndicator_u2d42QJj7c, float startAngle, float sweep, long color, Stroke stroke) {
        float diameterOffset = stroke.getWidth() / 2.0f;
        float arcDimen = Size.m4194getWidthimpl($this$drawCircularIndicator_u2d42QJj7c.mo4917getSizeNHjbRc()) - (2.0f * diameterOffset);
        DrawScope.m4896drawArcyD3GUKo$default($this$drawCircularIndicator_u2d42QJj7c, color, startAngle, sweep, false, OffsetKt.Offset(diameterOffset, diameterOffset), androidx.compose.ui.geometry.SizeKt.Size(arcDimen, arcDimen), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: renamed from: drawCircularIndicatorTrack-bw27NRU, reason: not valid java name */
    private static final void m2510drawCircularIndicatorTrackbw27NRU(DrawScope $this$drawCircularIndicatorTrack_u2dbw27NRU, long color, Stroke stroke) {
        m2509drawCircularIndicator42QJj7c($this$drawCircularIndicatorTrack_u2dbw27NRU, 0.0f, 360.0f, color, stroke);
    }

    /* JADX INFO: renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m2511drawDeterminateCircularIndicator42QJj7c(DrawScope $this$drawDeterminateCircularIndicator_u2d42QJj7c, float startAngle, float sweep, long color, Stroke stroke) {
        m2509drawCircularIndicator42QJj7c($this$drawDeterminateCircularIndicator_u2d42QJj7c, startAngle, sweep, color, stroke);
    }

    /* JADX INFO: renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    private static final void m2512drawIndeterminateCircularIndicatorhrjfTZI(DrawScope $this$drawIndeterminateCircularIndicator_u2dhrjfTZI, float startAngle, float strokeWidth, float sweep, long color, Stroke stroke) {
        if (StrokeCap.m4715equalsimpl0(stroke.m4986getCapKaPHkGw(), StrokeCap.Companion.m4719getButtKaPHkGw()) == false) goto L5;
        float strokeCapOffset = 0.0f;
    L6:
        float adjustedStartAngle = startAngle + strokeCapOffset;
        float adjustedSweep = Math.max(sweep, 0.1f);
        m2509drawCircularIndicator42QJj7c($this$drawIndeterminateCircularIndicator_u2dhrjfTZI, adjustedStartAngle, adjustedSweep, color, stroke);
        return;
    L5:
        float arg0$iv = CircularIndicatorDiameter;
        float other$iv = strokeWidth / Dp.m6973constructorimpl(arg0$iv / 2);
        strokeCapOffset = (other$iv * 57.29578f) / 2.0f;
        goto L6
    }

    public static final float getLinearIndicatorWidth() {
        return LinearIndicatorWidth;
    }

    public static final float getLinearIndicatorHeight() {
        return LinearIndicatorHeight;
    }

    public static final float getCircularIndicatorDiameter() {
        return CircularIndicatorDiameter;
    }
}
