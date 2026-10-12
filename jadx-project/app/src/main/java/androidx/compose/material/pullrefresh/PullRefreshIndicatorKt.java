package androidx.compose.material.pullrefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PullRefreshIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002\u001a*\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aJ\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001a2\b\b\u0002\u0010#\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a>\u0010'\u001a\u00020\u0016*\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\f\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061²\u0006\n\u00102\u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u00020\u0002X\u008a\u0084\u0002"}, d2 = {"AlphaTween", "Landroidx/compose/animation/core/TweenSpec;", "", "ArcRadius", "Landroidx/compose/ui/unit/Dp;", "F", "ArrowHeight", "ArrowWidth", "CrossfadeDurationMs", "", "Elevation", "IndicatorSize", "MaxAlpha", "MaxProgressArc", "MinAlpha", "SpinnerShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "StrokeWidth", "ArrowValues", "Landroidx/compose/material/pullrefresh/ArrowValues;", NotificationCompat.CATEGORY_PROGRESS, "CircularArrowIndicator", "", "state", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "color", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "CircularArrowIndicator-iJQMabo", "(Landroidx/compose/material/pullrefresh/PullRefreshState;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "PullRefreshIndicator", "refreshing", "", "backgroundColor", "contentColor", "scale", "PullRefreshIndicator-jB83MbM", "(ZLandroidx/compose/material/pullrefresh/PullRefreshState;Landroidx/compose/ui/Modifier;JJZLandroidx/compose/runtime/Composer;II)V", "drawArrow", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "arrow", "Landroidx/compose/ui/graphics/Path;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "alpha", "values", "drawArrow-Bx497Mc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material/pullrefresh/ArrowValues;)V", "material_release", "showElevation", "targetAlpha"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PullRefreshIndicatorKt {
    private static final TweenSpec<Float> AlphaTween = null;
    private static final float ArcRadius = 0.0f;
    private static final float ArrowHeight = 0.0f;
    private static final float ArrowWidth = 0.0f;
    private static final int CrossfadeDurationMs = 100;
    private static final float Elevation = 0.0f;
    private static final float IndicatorSize = 0.0f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final RoundedCornerShape SpinnerShape = null;
    private static final float StrokeWidth = 0.0f;

    public static final /* synthetic */ ArrowValues access$ArrowValues(float progress) {
        return ArrowValues(progress);
    }

    /* JADX INFO: renamed from: access$CircularArrowIndicator-iJQMabo, reason: not valid java name */
    public static final /* synthetic */ void m1859access$CircularArrowIndicatoriJQMabo(PullRefreshState state, long color, Modifier modifier, Composer $composer, int $changed) {
        m1857CircularArrowIndicatoriJQMabo(state, color, modifier, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$drawArrow-Bx497Mc, reason: not valid java name */
    public static final /* synthetic */ void m1860access$drawArrowBx497Mc(DrawScope $receiver, Path arrow, Rect bounds, long color, float alpha, ArrowValues values) {
        m1861drawArrowBx497Mc($receiver, arrow, bounds, color, alpha, values);
    }

    public static final /* synthetic */ float access$getArcRadius$p() {
        return ArcRadius;
    }

    public static final /* synthetic */ float access$getStrokeWidth$p() {
        return StrokeWidth;
    }

    /* JADX INFO: renamed from: PullRefreshIndicator-jB83MbM, reason: not valid java name */
    public static final void m1858PullRefreshIndicatorjB83MbM(final boolean refreshing, final PullRefreshState state, Modifier modifier, long backgroundColor, long contentColor, boolean scale, Composer $composer, final int $changed, final int r52) {
        Composer $composer2 = $composer.startRestartGroup(308716636);
        ComposerKt.sourceInformation($composer2, "C(PullRefreshIndicator)P(3,5,2,0:c#ui.graphics.Color,1:c#ui.graphics.Color)83@3564L86,88@3935L7,92@4063L1049:PullRefreshIndicator.kt#t44y28");
        int $dirty = $changed;
        if ((r52 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r52 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r5 = r52 & 4;
        if (r5 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier r7 = modifier;
    L34:
        if (($changed & 3072) == 0) goto L36;
        long r10 = backgroundColor;
    L45:
        if (($changed & 24576) == 0) goto L47;
        long r12 = contentColor;
    L55:
        int r8 = r52 & 32;
        if (r8 == 0) goto L59;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean scale2 = scale;
    L67:
        if ((74899 & $dirty) == 74898) goto L69;
        boolean r6 = true;
    L71:
        if ($composer2.shouldExecute(r6, $dirty & 1) == false) goto L142;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "78@3424L6,79@3466L32");
        if (($changed & 1) != 0) goto L75;
    L84:
        if (r5 == 0) goto L86;
        Modifier.Companion modifier2 = Modifier.Companion;
    L88:
        if ((r52 & 8) == 0) goto L90;
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
        $dirty = $dirty & (-7169);
    L92:
        if ((r52 & 16) == 0) goto L94;
        final long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty >> 9) & 14);
        $dirty = $dirty & (-57345);
    L95:
        if (r8 == 0) goto L97;
        scale2 = false;
    L97:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L100;
        ComposerKt.traceEventStart(308716636, $dirty, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
    L100:
        ComposerKt.sourceInformationMarkerStart($composer2, 1619083213, "CC(remember):PullRefreshIndicator.kt#9igjgp");
        if (($dirty & 14) != 4) goto L103;
        boolean r9 = true;
    L104:
        boolean invalid$iv = r9 | $composer2.changed(state);
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L110;
        int $changed2 = 6;
        if (value$iv != Composer.Companion.getEmpty()) goto L112;
    L111:
        value$iv = SnapshotStateKt.derivedStateOf(new PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1(refreshing, state));
        $composer2.updateRememberedValue(value$iv);
    L112:
        State showElevation$delegate = (State) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<ElevationOverlay> r11 = ElevationOverlayKt.getLocalElevationOverlay();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r0 = $composer2.consume(r11);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ElevationOverlay elevationOverlay = (ElevationOverlay) r0;
        if (elevationOverlay != null) goto L115;
        $composer2.startReplaceGroup(-1347611339);
        $composer2.endReplaceGroup();
        Composer $composer3 = $composer2;
        long backgroundColor3 = backgroundColor2;
        Color r3 = null;
    L116:
        if (r3 == null) goto L118;
        long color = r3.m4376unboximpl();
    L119:
        Modifier r20 = PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform(SizeKt.m772size3ABfNKs(modifier2, IndicatorSize), state, scale2);
        if (PullRefreshIndicator_jB83MbM$lambda$1(showElevation$delegate) == false) goto L122;
        float r21 = Elevation;
    L123:
        Modifier modifier$iv = BackgroundKt.m233backgroundbw27NRU(ShadowKt.m4001shadows4CzXII$default(r20, r21, SpinnerShape, true, 0, 0, 24, null), color, SpinnerShape);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        int $dirty2 = $dirty;
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
        Function0<ComposeUiNode> r23 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L126;
        ComposablesKt.invalidApplier();
    L126:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L129;
        Function0<ComposeUiNode> r4 = r23;
        $composer3.createNode(r4);
    L130:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r13 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L137;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L137;
    L138:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv$iv >> 6) & 14;
        Composer $composer$iv = $composer3;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r2 = BoxScopeInstance.INSTANCE;
        int r14 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -1392950731, "C103@4509L597,100@4378L728:PullRefreshIndicator.kt#t44y28");
        CrossfadeKt.Crossfade(Boolean.valueOf(refreshing), null, AnimationSpecKt.tween$default(100, 0, null, $changed2, null), null, ComposableLambdaKt.rememberComposableLambda(1853731063, true, new PullRefreshIndicatorKt$PullRefreshIndicator$1$1(contentColor2, state), $composer$iv, 54), $composer$iv, ($dirty2 & 14) | 24960, 10);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L141;
        ComposerKt.traceEventEnd();
    L141:
        final long color2 = contentColor2;
        final long backgroundColor4 = backgroundColor3;
        final Modifier modifier4 = modifier3;
        final boolean scale3 = scale2;
    L143:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L147;
        r15.updateScope(new PullRefreshIndicatorKt$PullRefreshIndicator$2(refreshing, state, modifier4, backgroundColor4, color2, scale3, $changed, r52));
        return;
    L147:
        return;
    L137:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r13);
        goto L138
    L129:
        r4 = r23;
        $composer3.useNode();
        goto L130
    L122:
        r21 = Dp.m6973constructorimpl(0);
        goto L123
    L118:
        color = backgroundColor3;
        goto L119
    L115:
        $composer2.startReplaceGroup(1619096652);
        ComposerKt.sourceInformation($composer2, "90@3985L53");
        long backgroundColor5 = backgroundColor2;
        long backgroundColor6 = elevationOverlay.mo1639apply7g2Lkgo(backgroundColor5, Elevation, $composer2, (($dirty >> 9) & 14) | 48);
        backgroundColor3 = backgroundColor5;
        $composer3 = $composer2;
        $composer3.endReplaceGroup();
        r3 = Color.m4356boximpl(backgroundColor6);
        goto L116
    L110:
        $changed2 = 6;
        goto L111
    L103:
        r9 = false;
        goto L104
    L94:
        contentColor2 = r12;
        goto L95
    L90:
        backgroundColor2 = r10;
        goto L92
    L86:
        modifier2 = r7;
        goto L88
    L75:
        if ($composer2.getDefaultsInvalid() == true) goto L84;
        $composer2.skipToGroupEnd();
        if ((r52 & 8) == 0) goto L81;
        $dirty = $dirty & (-7169);
    L81:
        if ((r52 & 16) == 0) goto L83;
        $dirty = $dirty & (-57345);
    L83:
        modifier2 = r7;
        backgroundColor2 = r10;
        contentColor2 = r12;
        goto L97
    L142:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = r7;
        backgroundColor4 = r10;
        color2 = r12;
        scale3 = scale2;
        goto L143
    L69:
        r6 = false;
        goto L71
    L59:
        if ((196608 & $changed) != 0) goto L65;
        scale2 = scale;
        if ($composer2.changed(scale2) == false) goto L63;
        int r16 = 131072;
    L64:
        $dirty = $dirty | r16;
        goto L67
    L63:
        r16 = 65536;
        goto L64
    L65:
        scale2 = scale;
        goto L67
    L47:
        if ((r52 & 16) != 0) goto L51;
        r12 = contentColor;
        if ($composer2.changed(r12) == false) goto L52;
        int r17 = 16384;
    L53:
        $dirty = $dirty | r17;
    L52:
        r17 = 8192;
        goto L53
    L51:
        r12 = contentColor;
        goto L52
    L36:
        if ((r52 & 8) != 0) goto L40;
        r10 = backgroundColor;
        if ($composer2.changed(r10) == false) goto L41;
        int r18 = 2048;
    L42:
        $dirty = $dirty | r18;
    L41:
        r18 = 1024;
        goto L42
    L40:
        r10 = backgroundColor;
        goto L41
    L26:
        if (($changed & 384) != 0) goto L32;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L30;
        int r19 = 256;
    L31:
        $dirty = $dirty | r19;
        goto L34
    L30:
        r19 = 128;
        goto L31
    L32:
        r7 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(state) == false) goto L20;
        int r22 = 32;
    L21:
        $dirty = $dirty | r22;
        goto L22
    L20:
        r22 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(refreshing) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L13
    L10:
        r24 = 2;
        goto L11
    }

    private static final boolean PullRefreshIndicator_jB83MbM$lambda$1(State<Boolean> r4) {
        return r4.getValue().booleanValue();
    }

    /* JADX INFO: renamed from: CircularArrowIndicator-iJQMabo, reason: not valid java name */
    private static final void m1857CircularArrowIndicatoriJQMabo(final PullRefreshState state, final long color, final Modifier modifier, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-486016981);
        ComposerKt.sourceInformation($composer2, "C(CircularArrowIndicator)P(2,0:c#ui.graphics.Color)129@5319L61,132@5413L87,134@5523L74,137@5666L948,137@5636L978:PullRefreshIndicator.kt#t44y28");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(state) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
        goto L10
    L7:
        r3 = 2;
    L10:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(color) == false) goto L14;
        int r4 = 32;
    L15:
        $dirty = $dirty | r4;
        goto L18
    L14:
        r4 = 16;
    L18:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changed(modifier) == false) goto L22;
        int r5 = 256;
    L23:
        $dirty = $dirty | r5;
        goto L25
    L22:
        r5 = 128;
    L25:
        if (($dirty & 147) == 146) goto L27;
        boolean r6 = true;
    L29:
        if ($composer2.shouldExecute(r6, $dirty & 1) == true) goto L31;
        $composer2.skipToGroupEnd();
    L59:
        ScopeUpdateScope r7 = $composer2.endRestartGroup();
        if (r7 == null) goto L63;
        r7.updateScope(new PullRefreshIndicatorKt$CircularArrowIndicator$3(state, color, modifier, $changed));
        return;
    L63:
        return;
    L31:
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventStart(-486016981, $dirty, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:128)");
    L33:
        ComposerKt.sourceInformationMarkerStart($composer2, -659481792, "CC(remember):PullRefreshIndicator.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L37;
        Path $this$CircularArrowIndicator_iJQMabo_u24lambda_u244_u24lambda_u243 = AndroidPath_androidKt.Path();
        $this$CircularArrowIndicator_iJQMabo_u24lambda_u244_u24lambda_u243.mo4259setFillTypeoQ8Xj4U(PathFillType.Companion.m4648getEvenOddRgk1Os());
        $composer2.updateRememberedValue($this$CircularArrowIndicator_iJQMabo_u24lambda_u244_u24lambda_u243);
        it$iv = $this$CircularArrowIndicator_iJQMabo_u24lambda_u244_u24lambda_u243;
    L37:
        final Path path = (Path) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -659478758, "CC(remember):PullRefreshIndicator.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(state);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L40;
    L43:
        Object value$iv = SnapshotStateKt.derivedStateOf(new PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1(state));
        $composer2.updateRememberedValue(value$iv);
        it$iv2 = value$iv;
    L44:
        State targetAlpha$delegate = (State) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final State<Float> r8 = AnimateAsStateKt.animateFloatAsState(CircularArrowIndicator_iJQMabo$lambda$6(targetAlpha$delegate), AlphaTween, 0.0f, null, null, $composer2, 48, 28);
        Modifier r9 = SemanticsModifierKt.semantics$default(modifier, false, PullRefreshIndicatorKt$CircularArrowIndicator$1.INSTANCE, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -659469801, "CC(remember):PullRefreshIndicator.kt#9igjgp");
        boolean r10 = $composer2.changedInstance(state) | $composer2.changed(r8);
        if (($dirty & 112) != 32) goto L47;
        boolean r11 = true;
    L48:
        boolean invalid$iv2 = (r10 | r11) | $composer2.changedInstance(path);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L51;
    L54:
        Object value$iv2 = (Function1) new PullRefreshIndicatorKt$CircularArrowIndicator$2$1(state, r8, color, path);
        $composer2.updateRememberedValue(value$iv2);
        it$iv3 = value$iv2;
    L55:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r9, (Function1) it$iv3, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L59;
        ComposerKt.traceEventEnd();
        goto L59
    L51:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L55;
    L47:
        r11 = false;
        goto L48
    L40:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L44;
    L27:
        r6 = false;
        goto L29
    }

    private static final float CircularArrowIndicator_iJQMabo$lambda$6(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final ArrowValues ArrowValues(float progress) {
        float adjustedPercent = (Math.max(Math.min(1.0f, progress) - 0.4f, 0.0f) * 5.0f) / 3.0f;
        float overshootPercent = Math.abs(progress) - 1.0f;
        float $this$fastCoerceAtLeast$iv$iv = overshootPercent;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L6;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv <= 2.0f) goto L8;
        $this$fastCoerceAtLeast$iv$iv = 2.0f;
    L8:
        float tensionPercent = $this$fastCoerceAtLeast$iv$iv - (((float) Math.pow($this$fastCoerceAtLeast$iv$iv, 2.0d)) / 4.0f);
        float endTrim = 0.8f * adjustedPercent;
        float rotation = (((0.4f * adjustedPercent) - 0.25f) + tensionPercent) * 0.5f;
        float startAngle = rotation * 360.0f;
        float endAngle = (rotation + endTrim) * 360.0f;
        float scale = Math.min(1.0f, adjustedPercent);
        return new ArrowValues(rotation, startAngle, endAngle, scale);
    }

    /* JADX INFO: renamed from: drawArrow-Bx497Mc, reason: not valid java name */
    private static final void m1861drawArrowBx497Mc(DrawScope $this$drawArrow_u2dBx497Mc, Path arrow, Rect bounds, long color, float alpha, ArrowValues values) {
        arrow.reset();
        arrow.moveTo(0.0f, 0.0f);
        arrow.lineTo($this$drawArrow_u2dBx497Mc.mo376toPx0680j_4(ArrowWidth) * values.getScale(), 0.0f);
        arrow.lineTo(($this$drawArrow_u2dBx497Mc.mo376toPx0680j_4(ArrowWidth) * values.getScale()) / 2.0f, $this$drawArrow_u2dBx497Mc.mo376toPx0680j_4(ArrowHeight) * values.getScale());
        float radius = Math.min(bounds.getWidth(), bounds.getHeight()) / 2.0f;
        float inset = ($this$drawArrow_u2dBx497Mc.mo376toPx0680j_4(ArrowWidth) * values.getScale()) / 2.0f;
        arrow.mo4261translatek4lQ0M(OffsetKt.Offset((Offset.m4125getXimpl(bounds.m4155getCenterF1C5BW0()) + radius) - inset, Offset.m4126getYimpl(bounds.m4155getCenterF1C5BW0()) + ($this$drawArrow_u2dBx497Mc.mo376toPx0680j_4(StrokeWidth) / 2.0f)));
        arrow.close();
        float degrees$iv = values.getEndAngle();
        long pivot$iv = $this$drawArrow_u2dBx497Mc.mo4916getCenterF1C5BW0();
        DrawContext $this$withTransform_u24lambda_u246$iv$iv = $this$drawArrow_u2dBx497Mc.getDrawContext();
        long previousSize$iv$iv = $this$withTransform_u24lambda_u246$iv$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().save();
        DrawTransform $this$rotate_Rg1IO4c_u24lambda_u240$iv = $this$withTransform_u24lambda_u246$iv$iv.getTransform();     // Catch: Throwable -> L10
        $this$rotate_Rg1IO4c_u24lambda_u240$iv.mo4844rotateUv8p0NA(degrees$iv, pivot$iv);     // Catch: Throwable -> L10
        long previousSize$iv$iv2 = previousSize$iv$iv;
        DrawScope.m4907drawPathLG529CI$default($this$drawArrow_u2dBx497Mc, arrow, color, alpha, null, null, 0, 56, null);     // Catch: Throwable -> L8
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv.mo4839setSizeuvyYCjk(previousSize$iv$iv2);
        return;
    L8:
        th = th;
        DrawContext $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
    L12:
        $this$withTransform_u24lambda_u246$iv$iv2.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv2.mo4839setSizeuvyYCjk(previousSize$iv$iv2);
        throw th;
    L10:
        th = th;
        previousSize$iv$iv2 = previousSize$iv$iv;
        $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
        goto L12
    }

    static {
        IndicatorSize = Dp.m6973constructorimpl(40);
        SpinnerShape = RoundedCornerShapeKt.getCircleShape();
        ArcRadius = Dp.m6973constructorimpl((float) 7.5d);
        StrokeWidth = Dp.m6973constructorimpl((float) 2.5d);
        ArrowWidth = Dp.m6973constructorimpl(10);
        ArrowHeight = Dp.m6973constructorimpl(5);
        Elevation = Dp.m6973constructorimpl(6);
        AlphaTween = AnimationSpecKt.tween$default(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getLinearEasing(), 2, null);
    }
}
