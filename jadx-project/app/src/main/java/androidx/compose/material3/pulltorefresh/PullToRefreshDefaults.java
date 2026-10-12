package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PullToRefresh.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\n\u001a\u00020\u000b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u000b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;", "", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "PositionalThreshold", "getPositionalThreshold-D9Ej5fM", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "indicatorColor", "getIndicatorColor", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "Indicator", "", "state", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "isRefreshing", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "threshold", "Indicator-2poqoh4", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZLandroidx/compose/ui/Modifier;JJFLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PullToRefreshDefaults {
    public static final int $stable = 0;
    private static final float Elevation = 0.0f;
    public static final PullToRefreshDefaults INSTANCE = null;
    private static final float PositionalThreshold = 0.0f;
    private static final Shape shape = null;

    private PullToRefreshDefaults() {
    }

    static {
        INSTANCE = new PullToRefreshDefaults();
        shape = RoundedCornerShapeKt.getCircleShape();
        PositionalThreshold = Dp.m6973constructorimpl(80);
        Elevation = ElevationTokens.INSTANCE.m3301getLevel2D9Ej5fM();
    }

    public final Shape getShape() {
        return shape;
    }

    public final long getContainerColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1066257972, "C419@15907L11:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1066257972, $changed, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-containerColor> (PullToRefresh.kt:419)");
    L5:
        long r0 = MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2046getSurfaceContainerHigh0d7_KjU();
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getIndicatorColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1441334156, "C423@16068L11:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1441334156, $changed, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorColor> (PullToRefresh.kt:423)");
    L5:
        long r0 = MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2033getOnSurfaceVariant0d7_KjU();
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: getPositionalThreshold-D9Ej5fM, reason: not valid java name */
    public final float m3112getPositionalThresholdD9Ej5fM() {
        return PositionalThreshold;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m3111getElevationD9Ej5fM() {
        return Elevation;
    }

    /* JADX INFO: renamed from: Indicator-2poqoh4, reason: not valid java name */
    public final void m3110Indicator2poqoh4(final PullToRefreshState state, final boolean isRefreshing, Modifier modifier, long containerColor, long color, float threshold, Composer $composer, final int $changed, final int r48) {
        Composer $composer2 = $composer.startRestartGroup(-1076870256);
        ComposerKt.sourceInformation($composer2, "C(Indicator)P(4,2,3,1:c#ui.graphics.Color,0:c#ui.graphics.Color,5:c#ui.unit.Dp)437@16566L14,438@16627L14,441@16704L1007:PullToRefresh.kt#djiw08");
        int $dirty = $changed;
        if ((r48 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r48 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        int r4 = r48 & 4;
        if (r4 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier r5 = modifier;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long r6 = containerColor;
    L46:
        if (($changed & 24576) == 0) goto L48;
        long r8 = color;
    L57:
        if ((196608 & $changed) == 0) goto L59;
        float r11 = threshold;
    L68:
        if ((r48 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
        PullToRefreshDefaults r13 = this;
    L79:
        if ((599187 & $dirty) == 599186) goto L81;
    L84:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L87;
    L99:
        if (r4 == 0) goto L101;
        Modifier.Companion modifier2 = Modifier.Companion;
    L103:
        if ((r48 & 8) == 0) goto L105;
        long containerColor2 = INSTANCE.getContainerColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L107:
        if ((r48 & 16) == 0) goto L109;
        long color2 = INSTANCE.getIndicatorColor($composer2, 6);
        $dirty = $dirty & (-57345);
    L111:
        if ((r48 & 32) == 0) goto L113;
        int $dirty2 = $dirty & (-458753);
        float threshold2 = PositionalThreshold;
    L114:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L117;
        ComposerKt.traceEventStart(-1076870256, $dirty2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:440)");
    L117:
        final long color3 = color2;
        Modifier modifier3 = modifier2;
        int $dirty3 = $dirty2;
        Modifier modifier$iv = PullToRefreshKt.m3126pullToRefreshIndicatorwUdLESc$default(modifier3, state, isRefreshing, threshold2, null, containerColor2, 0.0f, 40, null);
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        float threshold3 = threshold2;
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L120;
        ComposablesKt.invalidApplier();
    L120:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L123;
        Function0<ComposeUiNode> r3 = r18;
        $composer2.createNode(r3);
    L124:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L130;
        long containerColor3 = containerColor2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L132;
    L131:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r7);
    L132:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r9 = BoxScopeInstance.INSTANCE;
        int r10 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 396611011, "C454@17197L504,451@17052L649:PullToRefresh.kt#djiw08");
        CrossfadeKt.Crossfade(Boolean.valueOf(isRefreshing), null, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, ComposableLambdaKt.rememberComposableLambda(167807595, true, new PullToRefreshDefaults$Indicator$1$1(color3, state), $composer2, 54), $composer2, (($dirty3 >> 3) & 14) | 24960, 10);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L135;
        ComposerKt.traceEventEnd();
    L135:
        final Modifier modifier4 = modifier3;
        final float threshold4 = threshold3;
        final long color4 = color3;
        final long containerColor4 = containerColor3;
    L136:
        ScopeUpdateScope r15 = $composer2.endRestartGroup();
        if (r15 == null) goto L140;
        final PullToRefreshDefaults r1 = r13;
        r15.updateScope(new PullToRefreshDefaults$Indicator$2(r1, state, isRefreshing, modifier4, containerColor4, color4, threshold4, $changed, r48));
        return;
    L140:
        return;
    L130:
        containerColor3 = containerColor2;
        goto L131
    L123:
        r3 = r18;
        $composer2.useNode();
        goto L124
    L113:
        threshold2 = r11;
        $dirty2 = $dirty;
        goto L114
    L109:
        color2 = r8;
        goto L111
    L105:
        containerColor2 = r6;
        goto L107
    L101:
        modifier2 = r5;
        goto L103
    L87:
        if ($composer2.getDefaultsInvalid() == true) goto L99;
        $composer2.skipToGroupEnd();
        if ((r48 & 8) == 0) goto L93;
        $dirty = $dirty & (-7169);
    L93:
        if ((r48 & 16) == 0) goto L96;
        $dirty = $dirty & (-57345);
    L96:
        if ((r48 & 32) == 0) goto L98;
        $dirty = $dirty & (-458753);
    L98:
        modifier2 = r5;
        containerColor2 = r6;
        color2 = r8;
        threshold2 = r11;
        $dirty2 = $dirty;
        goto L114
    L81:
        if ($composer2.getSkipping() == false) goto L84;
        $composer2.skipToGroupEnd();
        modifier4 = r5;
        containerColor4 = r6;
        color4 = r8;
        threshold4 = r11;
        goto L136
    L71:
        if (($changed & 1572864) != 0) goto L77;
        r13 = this;
        if ($composer2.changed(r13) == false) goto L75;
        int r14 = 1048576;
    L76:
        $dirty = $dirty | r14;
        goto L79
    L75:
        r14 = 524288;
        goto L76
    L77:
        r13 = this;
        goto L79
    L59:
        if ((r48 & 32) != 0) goto L63;
        r11 = threshold;
        if ($composer2.changed(r11) == false) goto L64;
        int r16 = 131072;
    L65:
        $dirty = $dirty | r16;
    L64:
        r16 = 65536;
        goto L65
    L63:
        r11 = threshold;
        goto L64
    L48:
        if ((r48 & 16) != 0) goto L52;
        r8 = color;
        if ($composer2.changed(r8) == false) goto L53;
        int r12 = 16384;
    L54:
        $dirty = $dirty | r12;
    L53:
        r12 = 8192;
        goto L54
    L52:
        r8 = color;
        goto L53
    L37:
        if ((r48 & 8) != 0) goto L41;
        r6 = containerColor;
        if ($composer2.changed(r6) == false) goto L42;
        int r17 = 2048;
    L43:
        $dirty = $dirty | r17;
    L42:
        r17 = 1024;
        goto L43
    L41:
        r6 = containerColor;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L33;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L31;
        int r19 = 256;
    L32:
        $dirty = $dirty | r19;
        goto L35
    L31:
        r19 = 128;
        goto L32
    L33:
        r5 = modifier;
        goto L35
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(isRefreshing) == false) goto L20;
        int r20 = 32;
    L21:
        $dirty = $dirty | r20;
        goto L23
    L20:
        r20 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(state) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L13
    L10:
        r21 = 2;
        goto L11
    }
}
