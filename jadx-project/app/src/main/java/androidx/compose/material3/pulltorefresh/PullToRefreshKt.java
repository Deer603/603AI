package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: PullToRefresh.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u001a(\u0010\u0017\u001a\u00020\u00182\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u007f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00192\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\u001e\b\u0002\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00180)¢\u0006\u0002\b+¢\u0006\u0002\b,2\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00180)¢\u0006\u0002\b+¢\u0006\u0002\b,H\u0007¢\u0006\u0002\u0010.\u001a\b\u0010/\u001a\u00020%H\u0007\u001a\r\u00100\u001a\u00020%H\u0007¢\u0006\u0002\u00101\u001aF\u00102\u001a\u00020\u0018*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a>\u0010=\u001a\u00020\u0018*\u0002032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00152\u0006\u0010>\u001a\u0002072\u0006\u0010:\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001aH\u0010A\u001a\u00020#*\u00020#2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010B\u001a\u00020 2\b\b\u0002\u0010C\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001aN\u0010F\u001a\u00020#*\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010C\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020\u001b2\b\b\u0002\u0010J\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bK\u0010L\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u000e\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0011\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u0010\"\u0010\u0010\u0013\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006M²\u0006\n\u0010N\u001a\u00020\u0002X\u008a\u0084\u0002"}, d2 = {"AlphaTween", "Landroidx/compose/animation/core/TweenSpec;", "", "ArcRadius", "Landroidx/compose/ui/unit/Dp;", "F", "ArrowHeight", "ArrowWidth", "CrossfadeDurationMs", "", "DragMultiplier", "MaxAlpha", "MaxProgressArc", "MinAlpha", "SpinnerContainerSize", "getSpinnerContainerSize", "()F", "SpinnerSize", "getSpinnerSize", "StrokeWidth", "ArrowValues", "Landroidx/compose/material3/pulltorefresh/ArrowValues;", NotificationCompat.CATEGORY_PROGRESS, "CircularArrowProgressIndicator", "", "Lkotlin/Function0;", "color", "Landroidx/compose/ui/graphics/Color;", "CircularArrowProgressIndicator-RPmYEkk", "(Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "PullToRefreshBox", "isRefreshing", "", "onRefresh", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "indicator", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PullToRefreshState", "rememberPullToRefreshState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "drawArrow", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "arrow", "Landroidx/compose/ui/graphics/Path;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "alpha", "values", "strokeWidth", "drawArrow-uDrxG_w", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V", "drawCircularIndicator", "arcBounds", "drawCircularIndicator-KzyDr3Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V", "pullToRefresh", "enabled", "threshold", "pullToRefresh-Z4HSEVQ", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "pullToRefreshIndicator", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "elevation", "pullToRefreshIndicator-wUdLESc", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLandroidx/compose/ui/graphics/Shape;JF)Landroidx/compose/ui/Modifier;", "material3_release", "targetAlpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PullToRefreshKt {
    private static final TweenSpec<Float> AlphaTween = null;
    private static final float ArcRadius = 0.0f;
    private static final float ArrowHeight = 0.0f;
    private static final float ArrowWidth = 0.0f;
    private static final int CrossfadeDurationMs = 100;
    private static final float DragMultiplier = 0.5f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float SpinnerContainerSize = 0.0f;
    private static final float SpinnerSize = 0.0f;
    private static final float StrokeWidth = 0.0f;

    public static final /* synthetic */ ArrowValues access$ArrowValues(float progress) {
        return ArrowValues(progress);
    }

    /* JADX INFO: renamed from: access$CircularArrowProgressIndicator-RPmYEkk, reason: not valid java name */
    public static final /* synthetic */ void m3118access$CircularArrowProgressIndicatorRPmYEkk(Function0 progress, long color, Composer $composer, int $changed) {
        m3117CircularArrowProgressIndicatorRPmYEkk(progress, color, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$drawArrow-uDrxG_w, reason: not valid java name */
    public static final /* synthetic */ void m3119access$drawArrowuDrxG_w(DrawScope $receiver, Path arrow, Rect bounds, long color, float alpha, ArrowValues values, float strokeWidth) {
        m3121drawArrowuDrxG_w($receiver, arrow, bounds, color, alpha, values, strokeWidth);
    }

    /* JADX INFO: renamed from: access$drawCircularIndicator-KzyDr3Q, reason: not valid java name */
    public static final /* synthetic */ void m3120access$drawCircularIndicatorKzyDr3Q(DrawScope $receiver, long color, float alpha, ArrowValues values, Rect arcBounds, float strokeWidth) {
        m3122drawCircularIndicatorKzyDr3Q($receiver, color, alpha, values, arcBounds, strokeWidth);
    }

    public static final /* synthetic */ float access$getArcRadius$p() {
        return ArcRadius;
    }

    public static final /* synthetic */ float access$getStrokeWidth$p() {
        return StrokeWidth;
    }

    public static final void PullToRefreshBox(final boolean isRefreshing, final Function0<Unit> r27, Modifier modifier, PullToRefreshState state, Alignment contentAlignment, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> r31, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(1902956467);
        ComposerKt.sourceInformation($composer2, "C(PullToRefreshBox)P(3,5,4,6,1,2)124@5580L28,126@5713L163,135@5931L199:PullToRefresh.kt#djiw08");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r35 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
        Function0<Unit> r5 = r27;
    L23:
        int r3 = r35 & 4;
        if (r3 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L35:
        if (($changed & 3072) == 0) goto L37;
        final PullToRefreshState state2 = state;
    L45:
        int r7 = r35 & 16;
        if (r7 == 0) goto L49;
        $dirty = $dirty | 24576;
        Alignment contentAlignment2 = contentAlignment;
    L56:
        int r12 = r35 & 32;
        if (r12 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> r13 = r31;
    L68:
        if ((r35 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
    L78:
        if ((599187 & $dirty) == 599186) goto L80;
    L83:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L86;
    L92:
        if (r3 == 0) goto L94;
        Modifier.Companion modifier2 = Modifier.Companion;
    L96:
        if ((r35 & 8) == 0) goto L98;
        $dirty = $dirty & (-7169);
        state2 = rememberPullToRefreshState($composer2, 0);
    L98:
        if (r7 == 0) goto L100;
        contentAlignment2 = Alignment.Companion.getTopStart();
    L100:
        if (r12 == 0) goto L102;
        int $dirty2 = $dirty;
        r13 = ComposableLambdaKt.rememberComposableLambda(1989171225, true, new AnonymousClass1(state2, isRefreshing), $composer2, 54);
        PullToRefreshState state3 = state2;
    L103:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventStart(1902956467, $dirty2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:134)");
    L106:
        Modifier modifier3 = modifier2;
        Modifier modifier$iv = m3124pullToRefreshZ4HSEVQ$default(modifier3, isRefreshing, state3, false, 0.0f, r5, 12, null);
        int $changed$iv = ($dirty2 >> 9) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment2, false);
        int $changed$iv$iv = ($changed$iv << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        PullToRefreshState state4 = state3;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L109;
        ComposablesKt.invalidApplier();
    L109:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L112;
        Function0<ComposeUiNode> r1 = r16;
        $composer2.createNode(r1);
    L113:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L120;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L120;
    L121:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r6 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        int $changed2 = (($changed$iv >> 6) & 112) | 6;
        BoxScope $this$PullToRefreshBox_u24lambda_u240 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 1101976897, "C139@6095L9,140@6113L11:PullToRefresh.kt#djiw08");
        r32.invoke($this$PullToRefreshBox_u24lambda_u240, $composer2, Integer.valueOf(($changed2 & 14) | (($dirty2 >> 15) & 112)));
        r13.invoke($this$PullToRefreshBox_u24lambda_u240, $composer2, Integer.valueOf(($changed2 & 14) | (($dirty2 >> 12) & 112)));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L124;
        ComposerKt.traceEventEnd();
    L124:
        final Modifier modifier4 = modifier3;
        final PullToRefreshState state5 = state4;
        final Alignment contentAlignment3 = contentAlignment2;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> r8 = r13;
    L125:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L129;
        r11.updateScope(new AnonymousClass3(isRefreshing, r27, modifier4, state5, contentAlignment3, r8, r32, $changed, r35));
        return;
    L129:
        return;
    L120:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r2);
        goto L121
    L112:
        r1 = r16;
        $composer2.useNode();
        goto L113
    L102:
        $dirty2 = $dirty;
        state3 = state2;
        goto L103
    L94:
        modifier2 = r4;
        goto L96
    L86:
        if ($composer2.getDefaultsInvalid() == true) goto L92;
        $composer2.skipToGroupEnd();
        if ((r35 & 8) == 0) goto L91;
        $dirty = $dirty & (-7169);
    L91:
        $dirty2 = $dirty;
        modifier2 = r4;
        state3 = state2;
        goto L103
    L80:
        if ($composer2.getSkipping() == false) goto L83;
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        state5 = state2;
        contentAlignment3 = contentAlignment2;
        r8 = r13;
        goto L125
    L71:
        if (($changed & 1572864) != 0) goto L78;
        if ($composer2.changedInstance(r32) == false) goto L75;
        int r14 = 1048576;
    L76:
        $dirty = $dirty | r14;
        goto L78
    L75:
        r14 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r13 = r31;
        if ($composer2.changedInstance(r13) == false) goto L64;
        int r15 = 131072;
    L65:
        $dirty = $dirty | r15;
        goto L68
    L64:
        r15 = 65536;
        goto L65
    L66:
        r13 = r31;
        goto L68
    L49:
        if (($changed & 24576) != 0) goto L55;
        contentAlignment2 = contentAlignment;
        if ($composer2.changed(contentAlignment2) == false) goto L53;
        int r17 = 16384;
    L54:
        $dirty = $dirty | r17;
        goto L56
    L53:
        r17 = 8192;
        goto L54
    L55:
        contentAlignment2 = contentAlignment;
        goto L56
    L37:
        if ((r35 & 8) != 0) goto L41;
        state2 = state;
        if ($composer2.changed(state2) == false) goto L42;
        int r9 = 2048;
    L43:
        $dirty = $dirty | r9;
    L42:
        r9 = 1024;
        goto L43
    L41:
        state2 = state;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L33;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L31;
        int r10 = 256;
    L32:
        $dirty = $dirty | r10;
        goto L35
    L31:
        r10 = 128;
        goto L32
    L33:
        r4 = modifier;
        goto L35
    L16:
        if (($changed & 48) != 0) goto L22;
        r5 = r27;
        if ($composer2.changedInstance(r5) == false) goto L20;
        int r18 = 32;
    L21:
        $dirty = $dirty | r18;
        goto L23
    L20:
        r18 = 16;
        goto L21
    L22:
        r5 = r27;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(isRefreshing) == false) goto L10;
        int r19 = 4;
    L11:
        $dirty = $dirty | r19;
        goto L13
    L10:
        r19 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: pullToRefreshIndicator-wUdLESc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3126pullToRefreshIndicatorwUdLESc$default(Modifier r8, PullToRefreshState r9, boolean r10, float r11, Shape r12, long r13, float r15, int r16, Object r17) {
        if ((r16 & 4) == 0) goto L5;
        float r3 = PullToRefreshDefaults.INSTANCE.m3112getPositionalThresholdD9Ej5fM();
    L7:
        if ((r16 & 8) == 0) goto L9;
        Shape r4 = PullToRefreshDefaults.INSTANCE.getShape();
    L11:
        if ((r16 & 16) == 0) goto L13;
        long r5 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r16 & 32) == 0) goto L17;
        float r7 = PullToRefreshDefaults.INSTANCE.m3111getElevationD9Ej5fM();
    L19:
        return m3125pullToRefreshIndicatorwUdLESc(r8, r9, r10, r3, r4, r5, r7);
    L17:
        r7 = r15;
        goto L19
    L13:
        r5 = r13;
        goto L15
    L9:
        r4 = r12;
        goto L11
    L5:
        r3 = r11;
        goto L7
    }

    /* JADX INFO: renamed from: pullToRefreshIndicator-wUdLESc, reason: not valid java name */
    public static final Modifier m3125pullToRefreshIndicatorwUdLESc(Modifier $this$pullToRefreshIndicator_u2dwUdLESc, final PullToRefreshState state, final boolean isRefreshing, final float threshold, final Shape shape, long containerColor, final float elevation) {
        return BackgroundKt.m233backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(SizeKt.m772size3ABfNKs($this$pullToRefreshIndicator_u2dwUdLESc, SpinnerContainerSize), PullToRefreshKt$pullToRefreshIndicator$1.INSTANCE), new PullToRefreshKt$pullToRefreshIndicator$2(state, isRefreshing, threshold, elevation, shape)), containerColor, shape);
    }

    /* JADX INFO: renamed from: pullToRefresh-Z4HSEVQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3124pullToRefreshZ4HSEVQ$default(Modifier r6, boolean r7, PullToRefreshState r8, boolean r9, float r10, Function0 r11, int r12, Object r13) {
        if ((r12 & 4) == 0) goto L5;
        boolean r3 = true;
    L7:
        if ((r12 & 8) == 0) goto L9;
        float r4 = PullToRefreshDefaults.INSTANCE.m3112getPositionalThresholdD9Ej5fM();
    L11:
        return m3123pullToRefreshZ4HSEVQ(r6, r7, r8, r3, r4, r11);
    L9:
        r4 = r10;
        goto L11
    L5:
        r3 = r9;
        goto L7
    }

    /* JADX INFO: renamed from: pullToRefresh-Z4HSEVQ, reason: not valid java name */
    public static final Modifier m3123pullToRefreshZ4HSEVQ(Modifier $this$pullToRefresh_u2dZ4HSEVQ, boolean isRefreshing, PullToRefreshState state, boolean enabled, float threshold, Function0<Unit> r12) {
        return $this$pullToRefresh_u2dZ4HSEVQ.then(new PullToRefreshElement(isRefreshing, r12, enabled, state, threshold, null));
    }

    public static final PullToRefreshState rememberPullToRefreshState(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 318623070, "C(rememberPullToRefreshState)513@19156L83:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(318623070, $changed, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:512)");
    L5:
        PullToRefreshStateImpl r8 = (PullToRefreshStateImpl) RememberSaveableKt.m3923rememberSaveable(new Object[0], PullToRefreshStateImpl.Companion.getSaver(), null, C06041.INSTANCE, $composer, 3072, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    }

    public static final PullToRefreshState PullToRefreshState() {
        return new PullToRefreshStateImpl();
    }

    /* JADX INFO: renamed from: CircularArrowProgressIndicator-RPmYEkk, reason: not valid java name */
    private static final void m3117CircularArrowProgressIndicatorRPmYEkk(final Function0<Float> r20, final long r21, Composer r23, final int r24) {
        Composer r12 = r23.startRestartGroup(-569718810);
        ComposerKt.sourceInformation(r12, "C(CircularArrowProgressIndicator)P(1,0:c#ui.graphics.Color)562@20583L61,564@20745L76,565@20843L74,567@20982L98,571@21118L443,566@20922L639:PullToRefresh.kt#djiw08");
        int r2 = r24;
        if ((r24 & 6) != 0) goto L10;
        if (r12.changedInstance(r20) == false) goto L7;
        int r5 = 4;
    L8:
        r2 = r2 | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if ((r24 & 48) != 0) goto L17;
        if (r12.changed(r21) == false) goto L14;
        int r6 = 32;
    L15:
        r2 = r2 | r6;
        goto L17
    L14:
        r6 = 16;
    L17:
        if ((r2 & 19) != 18) goto L23;
        if (r12.getSkipping() == false) goto L23;
        r12.skipToGroupEnd();
    L62:
        ScopeUpdateScope r0 = r12.endRestartGroup();
        if (r0 == null) goto L66;
        r0.updateScope(new PullToRefreshKt$CircularArrowProgressIndicator$3(r20, r21, r24));
        return;
    L66:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-569718810, r2, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:561)");
    L25:
        ComposerKt.sourceInformationMarkerStart(r12, 1136642763, "CC(remember):PullToRefresh.kt#9igjgp");
        Object r10 = r12.rememberedValue();
        if (r10 != Composer.Companion.getEmpty()) goto L28;
        Path r14 = AndroidPath_androidKt.Path();
        r14.mo4259setFillTypeoQ8Xj4U(PathFillType.Companion.m4648getEvenOddRgk1Os());
        r12.updateRememberedValue(r14);
        Object r15 = r14;
    L29:
        final Path r1 = (Path) r15;
        ComposerKt.sourceInformationMarkerEnd(r12);
        ComposerKt.sourceInformationMarkerStart(r12, 1136647962, "CC(remember):PullToRefresh.kt#9igjgp");
        Object r11 = r12.rememberedValue();
        if (r11 != Composer.Companion.getEmpty()) goto L32;
        Object r13 = SnapshotStateKt.derivedStateOf(new PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1(r20));
        r12.updateRememberedValue(r13);
    L33:
        ComposerKt.sourceInformationMarkerEnd(r12);
        int r25 = r2;
        final State<Float> r7 = AnimateAsStateKt.animateFloatAsState(CircularArrowProgressIndicator_RPmYEkk$lambda$4((State) r13), AlphaTween, 0.0f, null, null, r12, 48, 28);
        Modifier.Companion r8 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart(r12, 1136655568, "CC(remember):PullToRefresh.kt#9igjgp");
        if ((r25 & 14) != 4) goto L36;
        boolean r9 = true;
    L37:
        Object r16 = r12.rememberedValue();
        if (r9 == false) goto L40;
    L43:
        Object r17 = (Function1) new PullToRefreshKt$CircularArrowProgressIndicator$1$1(r20);
        r12.updateRememberedValue(r17);
    L44:
        ComposerKt.sourceInformationMarkerEnd(r12);
        Modifier r18 = SizeKt.m772size3ABfNKs(SemanticsModifierKt.semantics(r8, true, (Function1) r17), SpinnerSize);
        ComposerKt.sourceInformationMarkerStart(r12, 1136660265, "CC(remember):PullToRefresh.kt#9igjgp");
        if ((r25 & 14) != 4) goto L47;
        boolean r19 = true;
    L48:
        boolean r22 = r19 | r12.changed(r7);
        if ((r25 & 112) != 32) goto L51;
        boolean r110 = true;
    L52:
        boolean r26 = (r22 | r110) | r12.changedInstance(r1);
        Object r111 = r12.rememberedValue();
        if (r26 == false) goto L55;
    L58:
        Object r3 = (Function1) new PullToRefreshKt$CircularArrowProgressIndicator$2$1(r20, r7, r21, r1);
        r12.updateRememberedValue(r3);
    L59:
        ComposerKt.sourceInformationMarkerEnd(r12);
        CanvasKt.Canvas(r18, (Function1) r3, r12, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventEnd();
        goto L62
    L55:
        if (r111 == Composer.Companion.getEmpty()) goto L58;
        r3 = r111;
        goto L59
    L51:
        r110 = false;
        goto L52
    L47:
        r19 = false;
        goto L48
    L40:
        if (r16 == Composer.Companion.getEmpty()) goto L43;
        r17 = r16;
        goto L44
    L36:
        r9 = false;
        goto L37
    L32:
        r13 = r11;
        goto L33
    L28:
        r15 = r10;
        goto L29
    }

    private static final float CircularArrowProgressIndicator_RPmYEkk$lambda$4(State<Float> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Number) thisObj$iv).floatValue();
    }

    /* JADX INFO: renamed from: drawCircularIndicator-KzyDr3Q, reason: not valid java name */
    private static final void m3122drawCircularIndicatorKzyDr3Q(DrawScope $this$drawCircularIndicator_u2dKzyDr3Q, long color, float alpha, ArrowValues values, Rect arcBounds, float strokeWidth) {
        DrawScope.m4896drawArcyD3GUKo$default($this$drawCircularIndicator_u2dKzyDr3Q, color, values.getStartAngle(), values.getEndAngle() - values.getStartAngle(), false, arcBounds.m4160getTopLeftF1C5BW0(), arcBounds.m4158getSizeNHjbRc(), alpha, new Stroke($this$drawCircularIndicator_u2dKzyDr3Q.mo376toPx0680j_4(strokeWidth), 0.0f, StrokeCap.Companion.m4719getButtKaPHkGw(), 0, null, 26, null), null, 0, 768, null);
    }

    private static final ArrowValues ArrowValues(float progress) {
        float adjustedPercent = (Math.max(Math.min(1.0f, progress) - 0.4f, 0.0f) * 5.0f) / 3.0f;
        float overshootPercent = Math.abs(progress) - 1.0f;
        float linearTension = RangesKt.coerceIn(overshootPercent, 0.0f, 2.0f);
        float tensionPercent = linearTension - (((float) Math.pow(linearTension, 2.0d)) / 4.0f);
        float endTrim = 0.8f * adjustedPercent;
        float rotation = (((0.4f * adjustedPercent) - 0.25f) + tensionPercent) * 0.5f;
        float startAngle = rotation * 360.0f;
        float endAngle = (rotation + endTrim) * 360.0f;
        float scale = Math.min(1.0f, adjustedPercent);
        return new ArrowValues(rotation, startAngle, endAngle, scale);
    }

    /* JADX INFO: renamed from: drawArrow-uDrxG_w, reason: not valid java name */
    private static final void m3121drawArrowuDrxG_w(DrawScope $this$drawArrow_u2duDrxG_w, Path arrow, Rect bounds, long color, float alpha, ArrowValues values, float strokeWidth) {
        arrow.reset();
        arrow.moveTo(0.0f, 0.0f);
        arrow.lineTo(($this$drawArrow_u2duDrxG_w.mo376toPx0680j_4(ArrowWidth) * values.getScale()) / 2.0f, $this$drawArrow_u2duDrxG_w.mo376toPx0680j_4(ArrowHeight) * values.getScale());
        arrow.lineTo($this$drawArrow_u2duDrxG_w.mo376toPx0680j_4(ArrowWidth) * values.getScale(), 0.0f);
        float radius = Math.min(bounds.getWidth(), bounds.getHeight()) / 2.0f;
        float inset = ($this$drawArrow_u2duDrxG_w.mo376toPx0680j_4(ArrowWidth) * values.getScale()) / 2.0f;
        arrow.mo4261translatek4lQ0M(OffsetKt.Offset((Offset.m4125getXimpl(bounds.m4155getCenterF1C5BW0()) + radius) - inset, Offset.m4126getYimpl(bounds.m4155getCenterF1C5BW0()) - $this$drawArrow_u2duDrxG_w.mo376toPx0680j_4(strokeWidth)));
        float degrees$iv = values.getEndAngle() - $this$drawArrow_u2duDrxG_w.mo376toPx0680j_4(strokeWidth);
        long pivot$iv = $this$drawArrow_u2duDrxG_w.mo4916getCenterF1C5BW0();
        DrawContext $this$withTransform_u24lambda_u246$iv$iv = $this$drawArrow_u2duDrxG_w.getDrawContext();
        long previousSize$iv$iv = $this$withTransform_u24lambda_u246$iv$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().save();
        DrawTransform $this$rotate_Rg1IO4c_u24lambda_u240$iv = $this$withTransform_u24lambda_u246$iv$iv.getTransform();     // Catch: Throwable -> L14
        $this$rotate_Rg1IO4c_u24lambda_u240$iv.mo4844rotateUv8p0NA(degrees$iv, pivot$iv);     // Catch: Throwable -> L14
        DrawContext $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
        long previousSize$iv$iv2 = previousSize$iv$iv;
        DrawScope.m4907drawPathLG529CI$default($this$drawArrow_u2duDrxG_w, arrow, color, alpha, new Stroke($this$drawArrow_u2duDrxG_w.mo376toPx0680j_4(strokeWidth), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);     // Catch: Throwable -> L10
        $this$withTransform_u24lambda_u246$iv$iv2.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv2.mo4839setSizeuvyYCjk(previousSize$iv$iv2);
        return;
    L10:
        th = th;
        $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv2;
    L16:
        $this$withTransform_u24lambda_u246$iv$iv2.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv2.mo4839setSizeuvyYCjk(previousSize$iv$iv2);
        throw th;
    L12:
        th = th;
        previousSize$iv$iv2 = previousSize$iv$iv;
    L14:
        th = th;
        $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
        previousSize$iv$iv2 = previousSize$iv$iv;
        goto L16
    }

    static {
        StrokeWidth = Dp.m6973constructorimpl((float) 2.5d);
        ArcRadius = Dp.m6973constructorimpl((float) 5.5d);
        SpinnerSize = Dp.m6973constructorimpl(16);
        SpinnerContainerSize = Dp.m6973constructorimpl(40);
        ArrowWidth = Dp.m6973constructorimpl(10);
        ArrowHeight = Dp.m6973constructorimpl(5);
        AlphaTween = AnimationSpecKt.tween$default(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getLinearEasing(), 2, null);
    }

    public static final float getSpinnerSize() {
        return SpinnerSize;
    }

    public static final float getSpinnerContainerSize() {
        return SpinnerContainerSize;
    }
}
