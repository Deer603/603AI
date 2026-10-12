package androidx.compose.material;

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
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ProgressIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a0\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aD\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a8\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aN\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a0\u00101\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a:\u00101\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a8\u00101\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001aD\u00101\u001a\u00020\u001f2\b\b\u0001\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a6\u0010:\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a&\u0010B\u001a\u00020\u001f*\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a6\u0010E\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010A\u001a>\u0010G\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a>\u0010J\u001a\u00020\u001f*\u00020;2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a.\u0010O\u001a\u00020\u001f*\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\f\u0010R\u001a\u00020!*\u00020!H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0013\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006S²\u0006\n\u0010T\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010U\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010V\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010W\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010X\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010Y\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010Z\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010<\u001a\u00020\u0001X\u008a\u0084\u0002"}, d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "LinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "StartAngleOffset", "CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "backgroundColor", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", NotificationCompat.CATEGORY_PROGRESS, "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorBackground", "drawCircularIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "increaseSemanticsBounds", "material_release", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "currentRotation", "baseRotation", "endAngle"}, k = 2, mv = {1, 9, 0}, xi = 48)
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
    private static final float StartAngleOffset = -90.0f;

    public static final /* synthetic */ float access$CircularProgressIndicator_LxG7B9w$lambda$10(State $baseRotation$delegate) {
        return CircularProgressIndicator_LxG7B9w$lambda$10($baseRotation$delegate);
    }

    public static final /* synthetic */ float access$CircularProgressIndicator_LxG7B9w$lambda$11(State $endAngle$delegate) {
        return CircularProgressIndicator_LxG7B9w$lambda$11($endAngle$delegate);
    }

    public static final /* synthetic */ float access$CircularProgressIndicator_LxG7B9w$lambda$12(State $startAngle$delegate) {
        return CircularProgressIndicator_LxG7B9w$lambda$12($startAngle$delegate);
    }

    public static final /* synthetic */ int access$CircularProgressIndicator_LxG7B9w$lambda$9(State $currentRotation$delegate) {
        return CircularProgressIndicator_LxG7B9w$lambda$9($currentRotation$delegate);
    }

    public static final /* synthetic */ float access$LinearProgressIndicator_2cYBFYY$lambda$1(State $firstLineHead$delegate) {
        return LinearProgressIndicator_2cYBFYY$lambda$1($firstLineHead$delegate);
    }

    public static final /* synthetic */ float access$LinearProgressIndicator_2cYBFYY$lambda$2(State $firstLineTail$delegate) {
        return LinearProgressIndicator_2cYBFYY$lambda$2($firstLineTail$delegate);
    }

    public static final /* synthetic */ float access$LinearProgressIndicator_2cYBFYY$lambda$3(State $secondLineHead$delegate) {
        return LinearProgressIndicator_2cYBFYY$lambda$3($secondLineHead$delegate);
    }

    public static final /* synthetic */ float access$LinearProgressIndicator_2cYBFYY$lambda$4(State $secondLineTail$delegate) {
        return LinearProgressIndicator_2cYBFYY$lambda$4($secondLineTail$delegate);
    }

    /* JADX INFO: renamed from: access$drawCircularIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final /* synthetic */ void m1729access$drawCircularIndicatorBackgroundbw27NRU(DrawScope $receiver, long color, Stroke stroke) {
        m1735drawCircularIndicatorBackgroundbw27NRU($receiver, color, stroke);
    }

    /* JADX INFO: renamed from: access$drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final /* synthetic */ void m1730access$drawDeterminateCircularIndicator42QJj7c(DrawScope $receiver, float startAngle, float sweep, long color, Stroke stroke) {
        m1736drawDeterminateCircularIndicator42QJj7c($receiver, startAngle, sweep, color, stroke);
    }

    /* JADX INFO: renamed from: access$drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final /* synthetic */ void m1731access$drawIndeterminateCircularIndicatorhrjfTZI(DrawScope $receiver, float startAngle, float strokeWidth, float sweep, long color, Stroke stroke) {
        m1737drawIndeterminateCircularIndicatorhrjfTZI($receiver, startAngle, strokeWidth, sweep, color, stroke);
    }

    /* JADX INFO: renamed from: access$drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final /* synthetic */ void m1732access$drawLinearIndicatorqYKTg0g(DrawScope $receiver, float startFraction, float endFraction, long color, float strokeWidth, int strokeCap) {
        m1738drawLinearIndicatorqYKTg0g($receiver, startFraction, endFraction, color, strokeWidth, strokeCap);
    }

    /* JADX INFO: renamed from: access$drawLinearIndicatorBackground-AZGd3zU, reason: not valid java name */
    public static final /* synthetic */ void m1733access$drawLinearIndicatorBackgroundAZGd3zU(DrawScope $receiver, long color, float strokeWidth, int strokeCap) {
        m1739drawLinearIndicatorBackgroundAZGd3zU($receiver, color, strokeWidth, strokeCap);
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

    public static final Modifier increaseSemanticsBounds(Modifier $this$increaseSemanticsBounds) {
        final float padding = Dp.m6973constructorimpl(10);
        return PaddingKt.m727paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout($this$increaseSemanticsBounds, new AnonymousClass1(padding)), true, AnonymousClass2.INSTANCE), 0.0f, padding, 1, null);
    }

    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    public static final void m1727LinearProgressIndicator_5eSRE(float progress, Modifier modifier, long color, long backgroundColor, int strokeCap, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(-531984864);
        ComposerKt.sourceInformation($composer2, "C(LinearProgressIndicator)P(3,2,1:c#ui.graphics.Color,0:c#ui.graphics.Color,4:c#ui.graphics.StrokeCap)115@5358L204,110@5177L385:ProgressIndicator.kt#jmzs0o");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        float r2 = progress;
    L13:
        int r3 = r35 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        long color2 = color;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long backgroundColor2 = backgroundColor;
    L47:
        if (($changed & 24576) == 0) goto L49;
        int strokeCap2 = strokeCap;
    L57:
        boolean r17 = true;
        if (($dirty & 9363) == 9362) goto L60;
        boolean r6 = true;
    L62:
        if ($composer2.shouldExecute(r6, $dirty & 1) == false) goto L139;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "105@4977L6");
        if (($changed & 1) != 0) goto L66;
    L78:
        if (r3 == 0) goto L80;
        Modifier.Companion modifier2 = Modifier.Companion;
    L82:
        if ((r35 & 4) == 0) goto L84;
        $dirty = $dirty & (-897);
        long color3 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1598getPrimary0d7_KjU();
    L86:
        if ((r35 & 8) == 0) goto L88;
        long backgroundColor3 = Color.m4365copywmQWz5c$default(color3, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
        $dirty = $dirty & (-7169);
    L90:
        if ((r35 & 16) == 0) goto L92;
        $dirty = $dirty & (-57345);
        strokeCap2 = StrokeCap.Companion.m4719getButtKaPHkGw();
        backgroundColor2 = backgroundColor3;
        color2 = color3;
    L93:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L96;
        ComposerKt.traceEventStart(-531984864, $dirty, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:108)");
    L96:
        float $this$fastCoerceAtLeast$iv$iv = progress;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L100;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L100:
        if ($this$fastCoerceAtLeast$iv$iv <= 1.0f) goto L102;
        float coercedProgress = 1.0f;
    L103:
        final float coercedProgress2 = coercedProgress;
        Modifier r0 = SizeKt.m774sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(increaseSemanticsBounds(modifier2), coercedProgress2, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
        ComposerKt.sourceInformationMarkerStart($composer2, -1318321181, "CC(remember):ProgressIndicator.kt#9igjgp");
        if ((($dirty & 7168) ^ 3072) <= 2048) goto L108;
        if ($composer2.changed(backgroundColor2) == false) goto L108;
    L109:
        boolean r7 = true;
    L112:
        if (((57344 & $dirty) ^ 24576) <= 16384) goto L116;
        if ($composer2.changed(strokeCap2) == false) goto L116;
    L117:
        boolean r8 = true;
    L119:
        boolean r9 = (r7 | r8) | $composer2.changed(coercedProgress2);
        if ((($dirty & 896) ^ 384) <= 256) goto L124;
        if ($composer2.changed(color2) == false) goto L124;
    L127:
        boolean invalid$iv = r9 | r17;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L134;
        if (it$iv == Composer.Companion.getEmpty()) goto L134;
        final int strokeCap3 = strokeCap2;
        final long color4 = color2;
        final long backgroundColor4 = backgroundColor2;
    L135:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r0, (Function1) it$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L138;
        ComposerKt.traceEventEnd();
    L138:
        final long backgroundColor5 = backgroundColor4;
        final int strokeCap4 = strokeCap3;
    L140:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L144;
        final float r1 = r2;
        final Modifier modifier3 = modifier2;
        final long color5 = color4;
        r11.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$2(r1, modifier3, color5, backgroundColor5, strokeCap4, $changed, r35));
        return;
    L144:
        return;
    L134:
        strokeCap3 = strokeCap2;
        color4 = color2;
        backgroundColor4 = backgroundColor2;
        Object value$iv = (Function1) new ProgressIndicatorKt$LinearProgressIndicator$1$1(backgroundColor4, strokeCap3, coercedProgress2, color4);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L124:
        if (($dirty & 384) == 256) goto L127;
        r17 = false;
    L116:
        if (($dirty & 24576) == 16384) goto L117;
        r8 = false;
    L108:
        if (($dirty & 3072) == 2048) goto L109;
        r7 = false;
        goto L112
    L102:
        coercedProgress = $this$fastCoerceAtLeast$iv$iv;
        goto L103
    L92:
        backgroundColor2 = backgroundColor3;
        color2 = color3;
        goto L93
    L88:
        backgroundColor3 = backgroundColor2;
        goto L90
    L84:
        color3 = color2;
        goto L86
    L80:
        modifier2 = r4;
        goto L82
    L66:
        if ($composer2.getDefaultsInvalid() == true) goto L78;
        $composer2.skipToGroupEnd();
        if ((r35 & 4) == 0) goto L72;
        $dirty = $dirty & (-897);
    L72:
        if ((r35 & 8) == 0) goto L75;
        $dirty = $dirty & (-7169);
    L75:
        if ((r35 & 16) == 0) goto L77;
        $dirty = $dirty & (-57345);
    L77:
        modifier2 = r4;
        goto L93
    L139:
        $composer2.skipToGroupEnd();
        modifier2 = r4;
        strokeCap4 = strokeCap2;
        color4 = color2;
        backgroundColor5 = backgroundColor2;
        goto L140
    L60:
        r6 = false;
        goto L62
    L49:
        if ((r35 & 16) != 0) goto L53;
        strokeCap2 = strokeCap;
        if ($composer2.changed(strokeCap2) == false) goto L54;
        int r15 = 16384;
    L55:
        $dirty = $dirty | r15;
    L54:
        r15 = 8192;
        goto L55
    L53:
        strokeCap2 = strokeCap;
        goto L54
    L38:
        if ((r35 & 8) != 0) goto L42;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L43;
        int r5 = 2048;
    L44:
        $dirty = $dirty | r5;
    L43:
        r5 = 1024;
        goto L44
    L42:
        backgroundColor2 = backgroundColor;
        goto L43
    L27:
        if ((r35 & 4) != 0) goto L31;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
    L32:
        r10 = 128;
        goto L33
    L31:
        color2 = color;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r12 = 32;
    L22:
        $dirty = $dirty | r12;
        goto L25
    L21:
        r12 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r2 = progress;
        if ($composer2.changed(r2) == false) goto L10;
        int r13 = 4;
    L11:
        $dirty = $dirty | r13;
        goto L13
    L10:
        r13 = 2;
        goto L11
    L12:
        r2 = progress;
        goto L13
    }

    /* JADX INFO: renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    public static final void m1725LinearProgressIndicator2cYBFYY(Modifier modifier, long color, long backgroundColor, int strokeCap, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(1501635280);
        ComposerKt.sourceInformation($composer2, "C(LinearProgressIndicator)P(2,1:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)145@6658L28,150@6948L396,163@7397L396,176@7847L400,189@8301L400,206@8872L624,201@8706L790:ProgressIndicator.kt#jmzs0o");
        int $dirty = $changed;
        int r2 = r40 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long color2 = color;
    L25:
        if (($changed & 384) == 0) goto L27;
        long r10 = backgroundColor;
    L36:
        if (($changed & 3072) == 0) goto L38;
        int r4 = strokeCap;
    L47:
        if (($dirty & 1171) == 1170) goto L49;
        boolean r14 = true;
    L51:
        if ($composer2.shouldExecute(r14, $dirty & 1) == false) goto L121;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "141@6489L6");
        if (($changed & 1) != 0) goto L55;
    L67:
        if (r2 == 0) goto L69;
        Modifier.Companion modifier2 = Modifier.Companion;
    L71:
        if ((r40 & 2) == 0) goto L73;
        $dirty = $dirty & (-113);
        long color3 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1598getPrimary0d7_KjU();
    L75:
        if ((r40 & 4) == 0) goto L77;
        long backgroundColor2 = Color.m4365copywmQWz5c$default(color3, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
        $dirty = $dirty & (-897);
    L79:
        if ((r40 & 8) == 0) goto L81;
        long r30 = backgroundColor2;
        int $dirty2 = $dirty & (-7169);
        int $dirty3 = StrokeCap.Companion.m4719getButtKaPHkGw();
        long color4 = color3;
        long backgroundColor3 = r30;
    L82:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L85;
        ComposerKt.traceEventStart(1501635280, $dirty2, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:144)");
    L85:
        InfiniteTransition infiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, $composer2, 0, 1);
        int $dirty4 = $dirty2;
        long backgroundColor4 = backgroundColor3;
        final State<Float> r23 = InfiniteTransitionKt.animateFloat(infiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2.INSTANCE), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        final State<Float> r24 = InfiniteTransitionKt.animateFloat(infiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2.INSTANCE), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        final State<Float> r25 = InfiniteTransitionKt.animateFloat(infiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2.INSTANCE), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        final State<Float> r26 = InfiniteTransitionKt.animateFloat(infiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2.INSTANCE), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        Modifier r11 = SizeKt.m774sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(increaseSemanticsBounds(modifier2)), LinearIndicatorWidth, LinearIndicatorHeight);
        ComposerKt.sourceInformationMarkerStart($composer2, -1318208313, "CC(remember):ProgressIndicator.kt#9igjgp");
        if ((($dirty4 & 896) ^ 384) <= 256) goto L90;
        if ($composer2.changed(backgroundColor4) == false) goto L90;
    L91:
        boolean r12 = true;
    L94:
        if ((($dirty4 & 7168) ^ 3072) <= 2048) goto L98;
        if ($composer2.changed($dirty3) == false) goto L98;
    L99:
        boolean r5 = true;
    L101:
        boolean r6 = ((r5 | r12) | $composer2.changed(r23)) | $composer2.changed(r24);
        if ((($dirty4 & 112) ^ 48) <= 32) goto L106;
        if ($composer2.changed(color4) == false) goto L106;
    L107:
        boolean r17 = true;
    L109:
        boolean invalid$iv = ((r6 | r17) | $composer2.changed(r25)) | $composer2.changed(r26);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L115;
        final int strokeCap2 = $dirty3;
        if (it$iv == Composer.Companion.getEmpty()) goto L116;
        final long color5 = color4;
        final long backgroundColor5 = backgroundColor4;
    L117:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r11, (Function1) it$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L120;
        ComposerKt.traceEventEnd();
    L120:
        final Modifier modifier3 = modifier2;
        final long backgroundColor6 = backgroundColor5;
        final int strokeCap3 = strokeCap2;
        final long color6 = color5;
    L122:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L126;
        r9.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$4(modifier3, color6, backgroundColor6, strokeCap3, $changed, r40));
        return;
    L126:
        return;
    L116:
        color5 = color4;
        backgroundColor5 = backgroundColor4;
        Object value$iv = (Function1) new ProgressIndicatorKt$LinearProgressIndicator$3$1(backgroundColor5, strokeCap2, color5, r23, r24, r25, r26);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
        goto L117
    L115:
        strokeCap2 = $dirty3;
    L106:
        if (($dirty4 & 48) == 32) goto L107;
        r17 = false;
    L98:
        if (($dirty4 & 3072) == 2048) goto L99;
        r5 = false;
    L90:
        if (($dirty4 & 384) == 256) goto L91;
        r12 = false;
        goto L94
    L81:
        long r31 = backgroundColor2;
        $dirty2 = $dirty;
        $dirty3 = r4;
        color4 = color3;
        backgroundColor3 = r31;
        goto L82
    L77:
        backgroundColor2 = r10;
        goto L79
    L73:
        color3 = color2;
        goto L75
    L69:
        modifier2 = r3;
        goto L71
    L55:
        if ($composer2.getDefaultsInvalid() == true) goto L67;
        $composer2.skipToGroupEnd();
        if ((r40 & 2) == 0) goto L61;
        $dirty = $dirty & (-113);
    L61:
        if ((r40 & 4) == 0) goto L64;
        $dirty = $dirty & (-897);
    L64:
        if ((r40 & 8) == 0) goto L66;
        $dirty = $dirty & (-7169);
    L66:
        modifier2 = r3;
        backgroundColor3 = r10;
        long r32 = color2;
        $dirty2 = $dirty;
        $dirty3 = r4;
        color4 = r32;
        goto L82
    L121:
        $composer2.skipToGroupEnd();
        modifier3 = r3;
        strokeCap3 = r4;
        color6 = color2;
        backgroundColor6 = r10;
        goto L122
    L49:
        r14 = false;
        goto L51
    L38:
        if ((r40 & 8) != 0) goto L42;
        r4 = strokeCap;
        if ($composer2.changed(r4) == false) goto L43;
        int r15 = 2048;
    L44:
        $dirty = $dirty | r15;
    L43:
        r15 = 1024;
        goto L44
    L42:
        r4 = strokeCap;
        goto L43
    L27:
        if ((r40 & 4) != 0) goto L31;
        r10 = backgroundColor;
        if ($composer2.changed(r10) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
    L32:
        r7 = 128;
        goto L33
    L31:
        r10 = backgroundColor;
        goto L32
    L16:
        if ((r40 & 2) != 0) goto L20;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
    L21:
        r8 = 16;
        goto L22
    L20:
        color2 = color;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r13 = 4;
    L11:
        $dirty = $dirty | r13;
        goto L14
    L10:
        r13 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L14
    }

    private static final float LinearProgressIndicator_2cYBFYY$lambda$1(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final float LinearProgressIndicator_2cYBFYY$lambda$2(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final float LinearProgressIndicator_2cYBFYY$lambda$3(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final float LinearProgressIndicator_2cYBFYY$lambda$4(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    public static final /* synthetic */ void m1728LinearProgressIndicatoreaDK9VM(final float progress, Modifier modifier, long color, long backgroundColor, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(-850309746);
        ComposerKt.sourceInformation($composer2, "C(LinearProgressIndicator)P(3,2,1:c#ui.graphics.Color,0:c#ui.graphics.Color)238@9814L142:ProgressIndicator.kt#jmzs0o");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        float r8 = progress;
    L13:
        int r2 = r32 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r3 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        long r4 = color;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long r9 = backgroundColor;
    L47:
        if (($dirty & 1171) == 1170) goto L49;
        boolean r6 = true;
    L51:
        if ($composer2.shouldExecute(r6, $dirty & 1) == false) goto L82;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "235@9714L6");
        if (($changed & 1) != 0) goto L55;
    L64:
        if (r2 == 0) goto L66;
        Modifier.Companion modifier2 = Modifier.Companion;
    L68:
        if ((r32 & 4) == 0) goto L70;
        $dirty = $dirty & (-897);
        long color2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1598getPrimary0d7_KjU();
    L72:
        if ((r32 & 8) == 0) goto L74;
        $dirty = $dirty & (-7169);
        Modifier modifier3 = modifier2;
        long backgroundColor2 = Color.m4365copywmQWz5c$default(color2, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
        long color3 = color2;
    L75:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L78;
        ComposerKt.traceEventStart(-850309746, $dirty, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:238)");
    L78:
        m1727LinearProgressIndicator_5eSRE(r8, modifier3, color3, backgroundColor2, StrokeCap.Companion.m4719getButtKaPHkGw(), $composer2, ((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L81;
        ComposerKt.traceEventEnd();
    L81:
        final Modifier modifier4 = modifier3;
        final long color4 = color3;
        final long backgroundColor3 = backgroundColor2;
    L83:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L87;
        r10.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$5(progress, modifier4, color4, backgroundColor3, $changed, r32));
        return;
    L87:
        return;
    L74:
        backgroundColor2 = r9;
        color3 = color2;
        modifier3 = modifier2;
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
        if ((r32 & 4) == 0) goto L61;
        $dirty = $dirty & (-897);
    L61:
        if ((r32 & 8) == 0) goto L63;
        $dirty = $dirty & (-7169);
    L63:
        backgroundColor2 = r9;
        modifier3 = r3;
        color3 = r4;
        goto L75
    L82:
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        color4 = r4;
        backgroundColor3 = r9;
        goto L83
    L49:
        r6 = false;
        goto L51
    L38:
        if ((r32 & 8) != 0) goto L42;
        r9 = backgroundColor;
        if ($composer2.changed(r9) == false) goto L43;
        int r7 = 2048;
    L44:
        $dirty = $dirty | r7;
    L43:
        r7 = 1024;
        goto L44
    L42:
        r9 = backgroundColor;
        goto L43
    L27:
        if ((r32 & 4) != 0) goto L31;
        r4 = color;
        if ($composer2.changed(r4) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
    L32:
        r11 = 128;
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
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L13
    L10:
        r12 = 2;
        goto L11
    L12:
        r8 = progress;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m1726LinearProgressIndicatorRIQooxk(Modifier modifier, long color, long backgroundColor, Composer $composer, final int $changed, final int r31) {
        Composer $composer2 = $composer.startRestartGroup(-819397058);
        ComposerKt.sourceInformation($composer2, "C(LinearProgressIndicator)P(2,1:c#ui.graphics.Color,0:c#ui.graphics.Color)253@10251L124:ProgressIndicator.kt#jmzs0o");
        int $dirty = $changed;
        int r2 = r31 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long r4 = color;
    L25:
        if (($changed & 384) == 0) goto L27;
        long r7 = backgroundColor;
    L36:
        if (($dirty & 147) == 146) goto L38;
        boolean r9 = true;
    L40:
        if ($composer2.shouldExecute(r9, $dirty & 1) == false) goto L71;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "250@10151L6");
        if (($changed & 1) != 0) goto L44;
    L53:
        if (r2 == 0) goto L55;
        Modifier.Companion modifier2 = Modifier.Companion;
    L57:
        if ((r31 & 2) == 0) goto L59;
        $dirty = $dirty & (-113);
        long color2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1598getPrimary0d7_KjU();
    L61:
        if ((r31 & 4) == 0) goto L63;
        $dirty = $dirty & (-897);
        Modifier modifier3 = modifier2;
        long backgroundColor2 = Color.m4365copywmQWz5c$default(color2, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
        long color3 = color2;
    L64:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L67;
        ComposerKt.traceEventStart(-819397058, $dirty, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:253)");
    L67:
        m1725LinearProgressIndicator2cYBFYY(modifier3, color3, backgroundColor2, StrokeCap.Companion.m4719getButtKaPHkGw(), $composer2, (($dirty & 14) | ($dirty & 112)) | ($dirty & 896), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventEnd();
    L70:
        final long color4 = color3;
        final long backgroundColor3 = backgroundColor2;
        final Modifier modifier4 = modifier3;
    L72:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L76;
        r10.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$6(modifier4, color4, backgroundColor3, $changed, r31));
        return;
    L76:
        return;
    L63:
        backgroundColor2 = r7;
        color3 = color2;
        modifier3 = modifier2;
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
        if ((r31 & 2) == 0) goto L50;
        $dirty = $dirty & (-113);
    L50:
        if ((r31 & 4) == 0) goto L52;
        $dirty = $dirty & (-897);
    L52:
        backgroundColor2 = r7;
        modifier3 = r3;
        color3 = r4;
        goto L64
    L71:
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        color4 = r4;
        backgroundColor3 = r7;
        goto L72
    L38:
        r9 = false;
        goto L40
    L27:
        if ((r31 & 4) != 0) goto L31;
        r7 = backgroundColor;
        if ($composer2.changed(r7) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
    L32:
        r11 = 128;
        goto L33
    L31:
        r7 = backgroundColor;
        goto L32
    L16:
        if ((r31 & 2) != 0) goto L20;
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

    /* JADX INFO: renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    private static final void m1738drawLinearIndicatorqYKTg0g(DrawScope $this$drawLinearIndicator_u2dqYKTg0g, float startFraction, float endFraction, long color, float strokeWidth, int strokeCap) {
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

    /* JADX INFO: renamed from: drawLinearIndicatorBackground-AZGd3zU, reason: not valid java name */
    private static final void m1739drawLinearIndicatorBackgroundAZGd3zU(DrawScope $this$drawLinearIndicatorBackground_u2dAZGd3zU, long color, float strokeWidth, int strokeCap) {
        m1738drawLinearIndicatorqYKTg0g($this$drawLinearIndicatorBackground_u2dAZGd3zU, 0.0f, 1.0f, color, strokeWidth, strokeCap);
    }

    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    public static final void m1721CircularProgressIndicatorDUhRLBM(final float progress, Modifier modifier, long color, float strokeWidth, long backgroundColor, int strokeCap, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(1746618448);
        ComposerKt.sourceInformation($composer2, "C(CircularProgressIndicator)P(3,2,1:c#ui.graphics.Color,5:c#ui.unit.Dp,0:c#ui.graphics.Color,4:c#ui.graphics.StrokeCap)*340@13786L7,341@13939L251,341@13855L335:ProgressIndicator.kt#jmzs0o");
        int $dirty = $changed;
        if ((r37 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r3 = r37 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        long color2 = color;
    L35:
        int r5 = r37 & 8;
        if (r5 == 0) goto L39;
        $dirty = $dirty | 3072;
        float strokeWidth2 = strokeWidth;
    L46:
        int r12 = r37 & 16;
        if (r12 == 0) goto L50;
        $dirty = $dirty | 24576;
        long backgroundColor2 = backgroundColor;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L60;
        int r6 = strokeCap;
    L68:
        boolean r18 = true;
        if (($dirty & 74899) == 74898) goto L71;
        boolean r0 = true;
    L73:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L133;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "334@13523L6");
        if (($changed & 1) != 0) goto L77;
    L86:
        if (r3 == 0) goto L88;
        Modifier.Companion modifier2 = Modifier.Companion;
    L90:
        if ((r37 & 4) == 0) goto L92;
        $dirty = $dirty & (-897);
        color2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1598getPrimary0d7_KjU();
    L92:
        if (r5 == 0) goto L94;
        strokeWidth2 = ProgressIndicatorDefaults.INSTANCE.m1720getStrokeWidthD9Ej5fM();
    L94:
        if (r12 == 0) goto L97;
        backgroundColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L97:
        if ((r37 & 32) == 0) goto L99;
        $dirty = $dirty & (-458753);
        int strokeCap2 = StrokeCap.Companion.m4719getButtKaPHkGw();
    L100:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L103;
        ComposerKt.traceEventStart(1746618448, $dirty, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:338)");
    L103:
        float $this$fastCoerceAtLeast$iv$iv = progress;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L107;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L107:
        if ($this$fastCoerceAtLeast$iv$iv <= 1.0f) goto L109;
        $this$fastCoerceAtLeast$iv$iv = 1.0f;
    L109:
        ProvidableCompositionLocal<Density> r7 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r8 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$CircularProgressIndicator_DUhRLBM_u24lambda_u246 = (Density) r8;
        final Stroke stroke = new Stroke($this$CircularProgressIndicator_DUhRLBM_u24lambda_u246.mo376toPx0680j_4(strokeWidth2), 0.0f, strokeCap2, 0, null, 26, null);
        Modifier modifier3 = modifier2;
        float coercedProgress = $this$fastCoerceAtLeast$iv$iv;
        Modifier r1 = SizeKt.m772size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier3, coercedProgress, null, 0, 6, null), CircularIndicatorDiameter);
        ComposerKt.sourceInformationMarkerStart($composer2, -973391752, "CC(remember):ProgressIndicator.kt#9igjgp");
        boolean r9 = $composer2.changed($this$fastCoerceAtLeast$iv$iv);
        if ((57344 & $dirty) != 16384) goto L112;
        boolean r10 = true;
    L113:
        boolean r11 = (r9 | r10) | $composer2.changedInstance(stroke);
        if ((($dirty & 896) ^ 384) <= 256) goto L118;
        if ($composer2.changed(color2) == false) goto L118;
    L121:
        boolean invalid$iv = r11 | r18;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L128;
        if (it$iv == Composer.Companion.getEmpty()) goto L128;
    L129:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r1, (Function1) it$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L132;
        ComposerKt.traceEventEnd();
    L132:
        final Modifier modifier4 = modifier3;
        final long color3 = color2;
        final int strokeCap3 = strokeCap2;
        final float strokeWidth3 = strokeWidth2;
        final long backgroundColor3 = backgroundColor2;
    L134:
        ScopeUpdateScope r13 = $composer2.endRestartGroup();
        if (r13 == null) goto L138;
        r13.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$2(progress, modifier4, color3, strokeWidth3, backgroundColor3, strokeCap3, $changed, r37));
        return;
    L138:
        return;
    L128:
        final long color4 = color2;
        final float coercedProgress2 = $this$fastCoerceAtLeast$iv$iv;
        final long backgroundColor4 = backgroundColor2;
        Object value$iv = (Function1) new ProgressIndicatorKt$CircularProgressIndicator$1$1(coercedProgress2, backgroundColor4, stroke, color4);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L118:
        if (($dirty & 384) == 256) goto L121;
        r18 = false;
        goto L121
    L112:
        r10 = false;
        goto L113
    L99:
        strokeCap2 = r6;
        goto L100
    L88:
        modifier2 = r4;
        goto L90
    L77:
        if ($composer2.getDefaultsInvalid() == true) goto L86;
        $composer2.skipToGroupEnd();
        if ((r37 & 4) == 0) goto L83;
        $dirty = $dirty & (-897);
    L83:
        if ((r37 & 32) == 0) goto L85;
        $dirty = $dirty & (-458753);
        modifier2 = r4;
        strokeCap2 = r6;
        goto L100
    L85:
        modifier2 = r4;
        strokeCap2 = r6;
        goto L100
    L133:
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        color3 = color2;
        strokeCap3 = r6;
        strokeWidth3 = strokeWidth2;
        backgroundColor3 = backgroundColor2;
        goto L134
    L71:
        r0 = false;
        goto L73
    L60:
        if ((r37 & 32) != 0) goto L64;
        r6 = strokeCap;
        if ($composer2.changed(r6) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
    L65:
        r16 = 65536;
        goto L66
    L64:
        r6 = strokeCap;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
        goto L58
    L54:
        r17 = 8192;
        goto L55
    L56:
        backgroundColor2 = backgroundColor;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        strokeWidth2 = strokeWidth;
        if ($composer2.changed(strokeWidth2) == false) goto L43;
        int r14 = 2048;
    L44:
        $dirty = $dirty | r14;
        goto L46
    L43:
        r14 = 1024;
        goto L44
    L45:
        strokeWidth2 = strokeWidth;
        goto L46
    L27:
        if ((r37 & 4) != 0) goto L31;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L32;
        int r15 = 256;
    L33:
        $dirty = $dirty | r15;
    L32:
        r15 = 128;
        goto L33
    L31:
        color2 = color;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r19 = 32;
    L22:
        $dirty = $dirty | r19;
        goto L25
    L21:
        r19 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(progress) == false) goto L10;
        int r20 = 4;
    L11:
        $dirty = $dirty | r20;
        goto L13
    L10:
        r20 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    public static final void m1722CircularProgressIndicatorLxG7B9w(Modifier modifier, long color, float strokeWidth, long backgroundColor, int strokeCap, Composer $composer, final int $changed, final int r41) {
        Composer $composer2 = $composer.startRestartGroup(-1119119072);
        ComposerKt.sourceInformation($composer2, "C(CircularProgressIndicator)P(2,1:c#ui.graphics.Color,4:c#ui.unit.Dp,0:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)*375@15403L7,377@15490L28,380@15656L350,394@16129L208,403@16463L422,417@16928L431,429@17433L538,429@17364L607:ProgressIndicator.kt#jmzs0o");
        int $dirty = $changed;
        int r2 = r41 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long color2 = color;
    L24:
        int r5 = r41 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        float strokeWidth2 = strokeWidth;
    L35:
        int r12 = r41 & 8;
        if (r12 == 0) goto L39;
        $dirty = $dirty | 3072;
    L47:
        if (($changed & 24576) == 0) goto L49;
        int r6 = strokeCap;
    L58:
        if (($dirty & 9363) == 9362) goto L60;
        boolean r3 = true;
    L62:
        if ($composer2.shouldExecute(r3, $dirty & 1) == false) goto L121;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "370@15194L6");
        if (($changed & 1) != 0) goto L66;
    L75:
        if (r2 == 0) goto L77;
        Modifier.Companion modifier2 = Modifier.Companion;
    L79:
        if ((r41 & 2) == 0) goto L81;
        $dirty = $dirty & (-113);
        color2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1598getPrimary0d7_KjU();
    L81:
        if (r5 == 0) goto L83;
        strokeWidth2 = ProgressIndicatorDefaults.INSTANCE.m1720getStrokeWidthD9Ej5fM();
    L83:
        if (r12 == 0) goto L85;
        long backgroundColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L87:
        if ((r41 & 16) == 0) goto L89;
        final long backgroundColor3 = backgroundColor2;
        int strokeCap2 = StrokeCap.Companion.m4721getSquareKaPHkGw();
        long backgroundColor4 = color2;
        int $dirty2 = $dirty & (-57345);
        float strokeWidth3 = strokeWidth2;
    L90:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L93;
        ComposerKt.traceEventStart(-1119119072, $dirty2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:374)");
    L93:
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$CircularProgressIndicator_LxG7B9w_u24lambda_u248 = (Density) r9;
        final Stroke stroke = new Stroke($this$CircularProgressIndicator_LxG7B9w_u24lambda_u248.mo376toPx0680j_4(strokeWidth3), 0.0f, strokeCap2, 0, null, 26, null);
        int r7 = strokeCap2;
        InfiniteTransition transition = InfiniteTransitionKt.rememberInfiniteTransition(null, $composer2, 0, 1);
        final float strokeWidth4 = strokeWidth3;
        Modifier modifier3 = modifier2;
        final State currentRotation$delegate = InfiniteTransitionKt.animateValue(transition, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 12), 16);
        final State<Float> r30 = InfiniteTransitionKt.animateFloat(transition, 0.0f, BaseRotationAngle, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        final State<Float> r28 = InfiniteTransitionKt.animateFloat(transition, 0.0f, JumpRotationAngle, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$CircularProgressIndicator$endAngle$2.INSTANCE), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        final State<Float> r29 = InfiniteTransitionKt.animateFloat(transition, 0.0f, JumpRotationAngle, AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$CircularProgressIndicator$startAngle$2.INSTANCE), null, 0, 6, null), null, $composer2, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8);
        Modifier r13 = SizeKt.m772size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter);
        ComposerKt.sourceInformationMarkerStart($composer2, -973279657, "CC(remember):ProgressIndicator.kt#9igjgp");
        if (($dirty2 & 7168) != 2048) goto L96;
        boolean r14 = true;
    L97:
        boolean r1 = (((($composer2.changedInstance(stroke) | r14) | $composer2.changed(currentRotation$delegate)) | $composer2.changed(r28)) | $composer2.changed(r29)) | $composer2.changed(r30);
        if (($dirty2 & 896) != 256) goto L100;
        boolean r15 = true;
    L101:
        boolean r8 = r1 | r15;
        if ((($dirty2 & 112) ^ 48) <= 32) goto L106;
        if ($composer2.changed(backgroundColor4) == false) goto L106;
    L107:
        boolean r16 = true;
    L109:
        boolean invalid$iv = r8 | r16;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L116;
        if (it$iv == Composer.Companion.getEmpty()) goto L116;
        final long color3 = backgroundColor4;
    L117:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r13, (Function1) it$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L120;
        ComposerKt.traceEventEnd();
    L120:
        final int strokeCap3 = r7;
        final long backgroundColor5 = backgroundColor3;
        final float strokeWidth5 = strokeWidth4;
        final long color4 = color3;
        final Modifier modifier4 = modifier3;
    L122:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L126;
        r11.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$4(modifier4, color4, strokeWidth5, backgroundColor5, strokeCap3, $changed, r41));
        return;
    L126:
        return;
    L116:
        color3 = backgroundColor4;
        Object value$iv = (Function1) new ProgressIndicatorKt$CircularProgressIndicator$3$1(backgroundColor3, stroke, strokeWidth4, color3, currentRotation$delegate, r28, r29, r30);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L106:
        if (($dirty2 & 48) == 32) goto L107;
        r16 = false;
        goto L109
    L100:
        r15 = false;
        goto L101
    L96:
        r14 = false;
        goto L97
    L89:
        $dirty2 = $dirty;
        backgroundColor3 = backgroundColor2;
        strokeCap2 = r6;
        backgroundColor4 = color2;
        strokeWidth3 = strokeWidth2;
        goto L90
    L85:
        backgroundColor2 = backgroundColor;
        goto L87
    L77:
        modifier2 = r4;
        goto L79
    L66:
        if ($composer2.getDefaultsInvalid() == true) goto L75;
        $composer2.skipToGroupEnd();
        if ((r41 & 2) == 0) goto L72;
        $dirty = $dirty & (-113);
    L72:
        if ((r41 & 16) == 0) goto L74;
        backgroundColor3 = backgroundColor;
        $dirty2 = $dirty & (-57345);
        modifier2 = r4;
        strokeCap2 = r6;
        backgroundColor4 = color2;
        strokeWidth3 = strokeWidth2;
        goto L90
    L74:
        backgroundColor3 = backgroundColor;
        $dirty2 = $dirty;
        modifier2 = r4;
        strokeCap2 = r6;
        backgroundColor4 = color2;
        strokeWidth3 = strokeWidth2;
        goto L90
    L121:
        $composer2.skipToGroupEnd();
        strokeCap3 = r6;
        color4 = color2;
        backgroundColor5 = backgroundColor;
        modifier4 = r4;
        strokeWidth5 = strokeWidth2;
        goto L122
    L60:
        r3 = false;
        goto L62
    L49:
        if ((r41 & 16) != 0) goto L53;
        r6 = strokeCap;
        if ($composer2.changed(r6) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
    L54:
        r17 = 8192;
        goto L55
    L53:
        r6 = strokeCap;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L47;
        if ($composer2.changed(backgroundColor) == false) goto L43;
        int r18 = 2048;
    L44:
        $dirty = $dirty | r18;
        goto L47
    L43:
        r18 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        strokeWidth2 = strokeWidth;
        if ($composer2.changed(strokeWidth2) == false) goto L32;
        int r19 = 256;
    L33:
        $dirty = $dirty | r19;
        goto L35
    L32:
        r19 = 128;
        goto L33
    L34:
        strokeWidth2 = strokeWidth;
        goto L35
    L16:
        if ((r41 & 2) != 0) goto L20;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L21;
        int r10 = 32;
    L22:
        $dirty = $dirty | r10;
    L21:
        r10 = 16;
        goto L22
    L20:
        color2 = color;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r20 = 4;
    L11:
        $dirty = $dirty | r20;
        goto L14
    L10:
        r20 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L14
    }

    private static final int CircularProgressIndicator_LxG7B9w$lambda$9(State<Integer> r4) {
        return r4.getValue().intValue();
    }

    private static final float CircularProgressIndicator_LxG7B9w$lambda$10(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final float CircularProgressIndicator_LxG7B9w$lambda$11(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final float CircularProgressIndicator_LxG7B9w$lambda$12(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    public static final /* synthetic */ void m1723CircularProgressIndicatorMBs18nI(final float progress, Modifier modifier, long color, float strokeWidth, Composer $composer, final int $changed, final int r25) {
        Composer $composer2 = $composer.startRestartGroup(-409649739);
        ComposerKt.sourceInformation($composer2, "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,3:c#ui.unit.Dp)451@18275L185:ProgressIndicator.kt#jmzs0o");
        int $dirty = $changed;
        if ((r25 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        float r7 = progress;
    L13:
        int r2 = r25 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r3 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        long r4 = color;
    L35:
        int r8 = r25 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        float r9 = strokeWidth;
    L47:
        if (($dirty & 1171) == 1170) goto L49;
        boolean r10 = true;
    L51:
        if ($composer2.shouldExecute(r10, $dirty & 1) == false) goto L78;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "448@18191L6");
        if (($changed & 1) != 0) goto L55;
    L61:
        if (r2 == 0) goto L63;
        Modifier.Companion modifier2 = Modifier.Companion;
    L65:
        if ((r25 & 4) == 0) goto L67;
        long color2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1598getPrimary0d7_KjU();
        $dirty = $dirty & (-897);
    L68:
        if (r8 == 0) goto L70;
        Modifier modifier3 = modifier2;
        long color3 = color2;
        float strokeWidth2 = ProgressIndicatorDefaults.INSTANCE.m1720getStrokeWidthD9Ej5fM();
    L71:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventStart(-409649739, $dirty, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:451)");
    L74:
        m1721CircularProgressIndicatorDUhRLBM(r7, modifier3, color3, strokeWidth2, Color.Companion.m4401getTransparent0d7_KjU(), StrokeCap.Companion.m4719getButtKaPHkGw(), $composer2, (((($dirty & 14) | 24576) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L77;
        ComposerKt.traceEventEnd();
    L77:
        final Modifier modifier4 = modifier3;
        final long color4 = color3;
        final float strokeWidth3 = strokeWidth2;
    L79:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L83;
        r11.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$5(progress, modifier4, color4, strokeWidth3, $changed, r25));
        return;
    L83:
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
        if ((r25 & 4) == 0) goto L60;
        $dirty = $dirty & (-897);
    L60:
        modifier3 = r3;
        strokeWidth2 = r9;
        color3 = r4;
        goto L71
    L78:
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        color4 = r4;
        strokeWidth3 = r9;
        goto L79
    L49:
        r10 = false;
        goto L51
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = strokeWidth;
        if ($composer2.changed(r9) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L47
    L43:
        r12 = 1024;
        goto L44
    L45:
        r9 = strokeWidth;
        goto L47
    L27:
        if ((r25 & 4) != 0) goto L31;
        r4 = color;
        if ($composer2.changed(r4) == false) goto L32;
        int r13 = 256;
    L33:
        $dirty = $dirty | r13;
    L32:
        r13 = 128;
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
    public static final /* synthetic */ void m1724CircularProgressIndicatoraMcp0Q(Modifier modifier, long color, float strokeWidth, Composer $composer, final int $changed, final int r24) {
        Composer $composer2 = $composer.startRestartGroup(-392089979);
        ComposerKt.sourceInformation($composer2, "C(CircularProgressIndicator)P(1,0:c#ui.graphics.Color,2:c#ui.unit.Dp)467@18741L169:ProgressIndicator.kt#jmzs0o");
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
        boolean r9 = true;
    L40:
        if ($composer2.shouldExecute(r9, $dirty & 1) == false) goto L66;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "464@18657L6");
        if (($changed & 1) != 0) goto L44;
    L50:
        if (r2 == 0) goto L52;
        Modifier.Companion modifier2 = Modifier.Companion;
    L54:
        if ((r24 & 2) == 0) goto L56;
        color2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1598getPrimary0d7_KjU();
        $dirty = $dirty & (-113);
    L56:
        if (r4 == 0) goto L58;
        float strokeWidth2 = ProgressIndicatorDefaults.INSTANCE.m1720getStrokeWidthD9Ej5fM();
        long color3 = color2;
        Modifier modifier3 = modifier2;
    L59:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventStart(-392089979, $dirty, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:467)");
    L62:
        m1722CircularProgressIndicatorLxG7B9w(modifier3, color3, strokeWidth2, Color.Companion.m4401getTransparent0d7_KjU(), StrokeCap.Companion.m4721getSquareKaPHkGw(), $composer2, ((($dirty & 14) | 3072) | ($dirty & 112)) | ($dirty & 896), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L65;
        ComposerKt.traceEventEnd();
    L65:
        final long color4 = color3;
        final float strokeWidth3 = strokeWidth2;
        final Modifier modifier4 = modifier3;
    L67:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L71;
        r10.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$6(modifier4, color4, strokeWidth3, $changed, r24));
        return;
    L71:
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
    L66:
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        color4 = color2;
        strokeWidth3 = r8;
        goto L67
    L38:
        r9 = false;
        goto L40
    L28:
        if (($changed & 384) != 0) goto L34;
        r8 = strokeWidth;
        if ($composer2.changed(r8) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
        goto L36
    L32:
        r11 = 128;
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
    private static final void m1734drawCircularIndicator42QJj7c(DrawScope $this$drawCircularIndicator_u2d42QJj7c, float startAngle, float sweep, long color, Stroke stroke) {
        float diameterOffset = stroke.getWidth() / 2.0f;
        float arcDimen = Size.m4194getWidthimpl($this$drawCircularIndicator_u2d42QJj7c.mo4917getSizeNHjbRc()) - (2.0f * diameterOffset);
        DrawScope.m4896drawArcyD3GUKo$default($this$drawCircularIndicator_u2d42QJj7c, color, startAngle, sweep, false, OffsetKt.Offset(diameterOffset, diameterOffset), androidx.compose.ui.geometry.SizeKt.Size(arcDimen, arcDimen), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: renamed from: drawCircularIndicatorBackground-bw27NRU, reason: not valid java name */
    private static final void m1735drawCircularIndicatorBackgroundbw27NRU(DrawScope $this$drawCircularIndicatorBackground_u2dbw27NRU, long color, Stroke stroke) {
        m1734drawCircularIndicator42QJj7c($this$drawCircularIndicatorBackground_u2dbw27NRU, 0.0f, 360.0f, color, stroke);
    }

    /* JADX INFO: renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m1736drawDeterminateCircularIndicator42QJj7c(DrawScope $this$drawDeterminateCircularIndicator_u2d42QJj7c, float startAngle, float sweep, long color, Stroke stroke) {
        m1734drawCircularIndicator42QJj7c($this$drawDeterminateCircularIndicator_u2d42QJj7c, startAngle, sweep, color, stroke);
    }

    /* JADX INFO: renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    private static final void m1737drawIndeterminateCircularIndicatorhrjfTZI(DrawScope $this$drawIndeterminateCircularIndicator_u2dhrjfTZI, float startAngle, float strokeWidth, float sweep, long color, Stroke stroke) {
        if (StrokeCap.m4715equalsimpl0(stroke.m4986getCapKaPHkGw(), StrokeCap.Companion.m4719getButtKaPHkGw()) == false) goto L5;
        float strokeCapOffset = 0.0f;
    L6:
        float adjustedStartAngle = startAngle + strokeCapOffset;
        float adjustedSweep = Math.max(sweep, 0.1f);
        m1734drawCircularIndicator42QJj7c($this$drawIndeterminateCircularIndicator_u2dhrjfTZI, adjustedStartAngle, adjustedSweep, color, stroke);
        return;
    L5:
        float arg0$iv = CircularIndicatorDiameter;
        float other$iv = strokeWidth / Dp.m6973constructorimpl(arg0$iv / 2);
        strokeCapOffset = (other$iv * 57.29578f) / 2.0f;
        goto L6
    }

    static {
        LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m1720getStrokeWidthD9Ej5fM();
        LinearIndicatorWidth = Dp.m6973constructorimpl(240);
        CircularIndicatorDiameter = Dp.m6973constructorimpl(40);
        FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }
}
