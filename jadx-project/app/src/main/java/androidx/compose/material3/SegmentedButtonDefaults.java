package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SegmentedButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015JA\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00140\u001a¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0002\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010&J\u008a\u0001\u0010%\u001a\u00020\u000f2\b\b\u0002\u0010'\u001a\u00020!2\b\b\u0002\u0010(\u001a\u00020!2\b\b\u0002\u0010)\u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020!2\b\b\u0002\u0010+\u001a\u00020!2\b\b\u0002\u0010,\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020!2\b\b\u0002\u0010.\u001a\u00020!2\b\b\u0002\u0010/\u001a\u00020!2\b\b\u0002\u00100\u001a\u00020!2\b\b\u0002\u00101\u001a\u00020!2\b\b\u0002\u00102\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u00104J'\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010:R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/material3/SegmentedButtonDefaults;", "", "()V", "BorderWidth", "Landroidx/compose/ui/unit/Dp;", "getBorderWidth-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "baseShape", "Landroidx/compose/foundation/shape/CornerBasedShape;", "getBaseShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/shape/CornerBasedShape;", "defaultSegmentedButtonColors", "Landroidx/compose/material3/SegmentedButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSegmentedButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SegmentedButtonColors;", "ActiveIcon", "", "(Landroidx/compose/runtime/Composer;I)V", "Icon", "active", "", "activeContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "inactiveContent", "(ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "borderStroke", "Landroidx/compose/foundation/BorderStroke;", "color", "Landroidx/compose/ui/graphics/Color;", "width", "borderStroke-l07J4OM", "(JF)Landroidx/compose/foundation/BorderStroke;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SegmentedButtonColors;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "colors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SegmentedButtonColors;", "itemShape", "Landroidx/compose/ui/graphics/Shape;", "index", "", "count", "(IILandroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/Shape;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SegmentedButtonDefaults {
    public static final int $stable = 0;
    private static final float BorderWidth = 0.0f;
    public static final SegmentedButtonDefaults INSTANCE = null;
    private static final float IconSize = 0.0f;

    private SegmentedButtonDefaults() {
    }

    public final SegmentedButtonColors colors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 679457321, "C(colors)431@18542L11:SegmentedButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(679457321, $changed, -1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:431)");
    L5:
        SegmentedButtonColors r0 = getDefaultSegmentedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: colors-XqyqHi0, reason: not valid java name */
    public final SegmentedButtonColors m2579colorsXqyqHi0(long activeContainerColor, long activeContentColor, long activeBorderColor, long inactiveContainerColor, long inactiveContentColor, long inactiveBorderColor, long disabledActiveContainerColor, long disabledActiveContentColor, long disabledActiveBorderColor, long disabledInactiveContainerColor, long disabledInactiveContentColor, long disabledInactiveBorderColor, Composer $composer, int $changed, int $changed1, int r58) {
        ComposerKt.sourceInformationMarkerStart($composer, 132526205, "C(colors)P(1:c#ui.graphics.Color,2:c#ui.graphics.Color,0:c#ui.graphics.Color,10:c#ui.graphics.Color,11:c#ui.graphics.Color,9:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,7:c#ui.graphics.Color,8:c#ui.graphics.Color,6:c#ui.graphics.Color)467@20709L11:SegmentedButton.kt#uh7d8r");
        if ((r58 & 1) == 0) goto L5;
        long activeContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r58 & 2) == 0) goto L9;
        long activeContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r58 & 4) == 0) goto L13;
        long activeBorderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r58 & 8) == 0) goto L17;
        long inactiveContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r58 & 16) == 0) goto L21;
        long inactiveContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r58 & 32) == 0) goto L25;
        long inactiveBorderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if ((r58 & 64) == 0) goto L29;
        long disabledActiveContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L31:
        if ((r58 & 128) == 0) goto L33;
        long disabledActiveContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L35:
        if ((r58 & 256) == 0) goto L37;
        long disabledActiveBorderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L39:
        if ((r58 & 512) == 0) goto L41;
        long disabledInactiveContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L43:
        if ((r58 & 1024) == 0) goto L45;
        long disabledInactiveContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L47:
        if ((r58 & 2048) == 0) goto L49;
        long disabledInactiveBorderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if (ComposerKt.isTraceInProgress() == false) goto L54;
        ComposerKt.traceEventStart(132526205, $changed, $changed1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:467)");
    L54:
        SegmentedButtonColors r1 = getDefaultSegmentedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2564copy2qZNXz8(activeContainerColor2, activeContentColor2, activeBorderColor2, inactiveContainerColor2, inactiveContentColor2, inactiveBorderColor2, disabledActiveContainerColor2, disabledActiveContentColor2, disabledActiveBorderColor2, disabledInactiveContainerColor2, disabledInactiveContentColor2, disabledInactiveBorderColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventEnd();
    L57:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L49:
        disabledInactiveBorderColor2 = disabledInactiveBorderColor;
        goto L51
    L45:
        disabledInactiveContentColor2 = disabledInactiveContentColor;
        goto L47
    L41:
        disabledInactiveContainerColor2 = disabledInactiveContainerColor;
        goto L43
    L37:
        disabledActiveBorderColor2 = disabledActiveBorderColor;
        goto L39
    L33:
        disabledActiveContentColor2 = disabledActiveContentColor;
        goto L35
    L29:
        disabledActiveContainerColor2 = disabledActiveContainerColor;
        goto L31
    L25:
        inactiveBorderColor2 = inactiveBorderColor;
        goto L27
    L21:
        inactiveContentColor2 = inactiveContentColor;
        goto L23
    L17:
        inactiveContainerColor2 = inactiveContainerColor;
        goto L19
    L13:
        activeBorderColor2 = activeBorderColor;
        goto L15
    L9:
        activeContentColor2 = activeContentColor;
        goto L11
    L5:
        activeContainerColor2 = activeContainerColor;
        goto L7
    }

    public final SegmentedButtonColors getDefaultSegmentedButtonColors$material3_release(ColorScheme $this$defaultSegmentedButtonColors) {
        SegmentedButtonColors it = $this$defaultSegmentedButtonColors.getDefaultSegmentedButtonColorsCached$material3_release();
        if (it != null) goto L6;
        SegmentedButtonColors it2 = new SegmentedButtonColors(ColorSchemeKt.fromToken($this$defaultSegmentedButtonColors, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken($this$defaultSegmentedButtonColors, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken($this$defaultSegmentedButtonColors, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), $this$defaultSegmentedButtonColors.m2043getSurface0d7_KjU(), ColorSchemeKt.fromToken($this$defaultSegmentedButtonColors, OutlinedSegmentedButtonTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken($this$defaultSegmentedButtonColors, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), ColorSchemeKt.fromToken($this$defaultSegmentedButtonColors, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedContainerColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSegmentedButtonColors, OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextColor()), OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSegmentedButtonColors, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), OutlinedSegmentedButtonTokens.INSTANCE.getDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), $this$defaultSegmentedButtonColors.m2043getSurface0d7_KjU(), ColorSchemeKt.fromToken($this$defaultSegmentedButtonColors, OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextColor()), ColorSchemeKt.fromToken($this$defaultSegmentedButtonColors, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), null);
        $this$defaultSegmentedButtonColors.setDefaultSegmentedButtonColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final CornerBasedShape getBaseShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1264240381, "C512@23272L5:SegmentedButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1264240381, $changed, -1, "androidx.compose.material3.SegmentedButtonDefaults.<get-baseShape> (SegmentedButton.kt:512)");
    L5:
        Shape r0 = ShapesKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getShape(), $composer, 6);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        CornerBasedShape r1 = (CornerBasedShape) r0;
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    }

    static {
        INSTANCE = new SegmentedButtonDefaults();
        BorderWidth = OutlinedSegmentedButtonTokens.INSTANCE.m3485getOutlineWidthD9Ej5fM();
        IconSize = OutlinedSegmentedButtonTokens.INSTANCE.m3484getIconSizeD9Ej5fM();
    }

    /* JADX INFO: renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name */
    public final float m2580getBorderWidthD9Ej5fM() {
        return BorderWidth;
    }

    public final Shape itemShape(int index, int count, CornerBasedShape baseShape, Composer $composer, int $changed, int r8) {
        ComposerKt.sourceInformationMarkerStart($composer, -942072063, "C(itemShape)P(2,1)528@23938L9:SegmentedButton.kt#uh7d8r");
        if ((r8 & 4) == 0) goto L6;
        baseShape = getBaseShape($composer, ($changed >> 9) & 14);
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(-942072063, $changed, -1, "androidx.compose.material3.SegmentedButtonDefaults.itemShape (SegmentedButton.kt:528)");
    L9:
        if (count == 1) goto L11;
        if (index != 0) goto L19;
        CornerBasedShape r9 = ShapesKt.start(baseShape);
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventEnd();
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r9;
    L19:
        if (index != (count - 1)) goto L21;
        r9 = ShapesKt.end(baseShape);
        goto L23
    L21:
        r9 = RectangleShapeKt.getRectangleShape();
        goto L23
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventEnd();
    L13:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return baseShape;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2581getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final void ActiveIcon(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1273041460);
        ComposerKt.sourceInformation($composer2, "C(ActiveIcon)546@24428L147:SegmentedButton.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(this) == false) goto L7;
        int r1 = 4;
    L8:
        $dirty = $dirty | r1;
        goto L10
    L7:
        r1 = 2;
    L10:
        if (($dirty & 3) != 2) goto L16;
        if ($composer2.getSkipping() == false) goto L16;
        $composer2.skipToGroupEnd();
    L21:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L25;
        r0.updateScope(new AnonymousClass1(this, $changed));
        return;
    L25:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-1273041460, $dirty, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:545)");
    L18:
        IconKt.m2277Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), null, SizeKt.m772size3ABfNKs(Modifier.Companion, IconSize), 0, $composer2, 48, 8);
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventEnd();
        goto L21
    }

    public final void Icon(final boolean active, Function2<? super Composer, ? super Integer, Unit> r18, Function2<? super Composer, ? super Integer, Unit> r19, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(683517296);
        ComposerKt.sourceInformation($composer2, "C(Icon):SegmentedButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r22 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r2 = active;
    L13:
        int r4 = r22 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        Function2<? super Composer, ? super Integer, Unit> r6 = r18;
    L24:
        int r7 = r22 & 4;
        if (r7 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r8 = r19;
    L35:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L38;
    L41:
        if (r4 == 0) goto L43;
        final Function2<? super Composer, ? super Integer, Unit> r1 = ComposableSingletons$SegmentedButtonKt.INSTANCE.m2107getLambda1$material3_release();
    L44:
        if (r7 == 0) goto L46;
        final Function2<? super Composer, ? super Integer, Unit> r5 = null;
    L48:
        if (ComposerKt.isTraceInProgress() == false) goto L51;
        ComposerKt.traceEventStart(683517296, $dirty2, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon (SegmentedButton.kt:566)");
    L51:
        if (r5 != null) goto L53;
        $composer2.startReplaceGroup(1631306250);
        ComposerKt.sourceInformation($composer2, "578@25645L47,568@25168L524");
        ExitTransition r9 = ExitTransition.Companion.getNone();
        r1 = r1;
        AnimatedVisibilityKt.AnimatedVisibility(r2, null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(350, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m75scaleInL8ZKhE(AnimationSpecKt.tween$default(350, 0, null, 6, null), 0.0f, TransformOriginKt.TransformOrigin(0.0f, 1.0f))), r9, null, ComposableLambdaKt.rememberComposableLambda(-750750819, true, new C05511(r1), $composer2, 54), $composer2, ($dirty2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
        $composer2 = $composer2;
        $composer2.endReplaceGroup();
    L55:
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventEnd();
    L57:
        final Function2<? super Composer, ? super Integer, Unit> r3 = r1;
    L58:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L62;
        r10.updateScope(new AnonymousClass3(this, active, r3, r5, $changed, r22));
        return;
    L62:
        return;
    L53:
        $composer2.startReplaceGroup(1631842116);
        ComposerKt.sourceInformation($composer2, "582@25754L50,582@25722L82");
        CrossfadeKt.Crossfade(Boolean.valueOf(active), null, null, null, ComposableLambdaKt.rememberComposableLambda(-1364873619, true, new AnonymousClass2(r1, r5), $composer2, 54), $composer2, ($dirty2 & 14) | 24576, 14);
        $composer2.endReplaceGroup();
        goto L55
    L46:
        r5 = r8;
        goto L48
    L43:
        r1 = r6;
        goto L44
    L38:
        if ($composer2.getSkipping() == false) goto L41;
        $composer2.skipToGroupEnd();
        r3 = r6;
        r5 = r8;
        goto L58
    L28:
        if (($changed & 384) != 0) goto L34;
        r8 = r19;
        if ($composer2.changedInstance(r8) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
        goto L35
    L32:
        r11 = 128;
        goto L33
    L34:
        r8 = r19;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r6 = r18;
        if ($composer2.changedInstance(r6) == false) goto L21;
        int r12 = 32;
    L22:
        $dirty = $dirty | r12;
        goto L24
    L21:
        r12 = 16;
        goto L22
    L23:
        r6 = r18;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r2 = active;
        if ($composer2.changed(r2) == false) goto L10;
        int r13 = 4;
    L11:
        $dirty = $dirty | r13;
        goto L13
    L10:
        r13 = 2;
        goto L11
    L12:
        r2 = active;
        goto L13
    }

    /* JADX INFO: renamed from: borderStroke-l07J4OM$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m2577borderStrokel07J4OM$default(SegmentedButtonDefaults r0, long r1, float r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r3 = BorderWidth;
    L6:
        return r0.m2578borderStrokel07J4OM(r1, r3);
    }

    /* JADX INFO: renamed from: borderStroke-l07J4OM, reason: not valid java name */
    public final BorderStroke m2578borderStrokel07J4OM(long color, float width) {
        return BorderStrokeKt.m261BorderStrokecXLIe8U(width, color);
    }
}
