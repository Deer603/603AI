package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u001a|\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u008e\u0001\u0010\n\u001a\u00020\u000b2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001c2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001c2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001aq\u0010&\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aq\u0010)\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010(\u001aq\u0010+\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010(\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"ExtendedFabCollapseAnimation", "Landroidx/compose/animation/ExitTransition;", "ExtendedFabEndIconPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabExpandAnimation", "Landroidx/compose/animation/EnterTransition;", "ExtendedFabMinimumWidth", "ExtendedFabStartIconPadding", "ExtendedFabTextPadding", "ExtendedFloatingActionButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "ExtendedFloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "text", "icon", "expanded", "", "ExtendedFloatingActionButton-ElI5-7k", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "FloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LargeFloatingActionButton", "LargeFloatingActionButton-X-z6DiA", "SmallFloatingActionButton", "SmallFloatingActionButton-X-z6DiA", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FloatingActionButtonKt {
    private static final ExitTransition ExtendedFabCollapseAnimation = null;
    private static final float ExtendedFabEndIconPadding = 0.0f;
    private static final EnterTransition ExtendedFabExpandAnimation = null;
    private static final float ExtendedFabMinimumWidth = 0.0f;
    private static final float ExtendedFabStartIconPadding = 0.0f;
    private static final float ExtendedFabTextPadding = 0.0f;

    public static final /* synthetic */ ExitTransition access$getExtendedFabCollapseAnimation$p() {
        return ExtendedFabCollapseAnimation;
    }

    public static final /* synthetic */ float access$getExtendedFabEndIconPadding$p() {
        return ExtendedFabEndIconPadding;
    }

    public static final /* synthetic */ EnterTransition access$getExtendedFabExpandAnimation$p() {
        return ExtendedFabExpandAnimation;
    }

    public static final /* synthetic */ float access$getExtendedFabMinimumWidth$p() {
        return ExtendedFabMinimumWidth;
    }

    public static final /* synthetic */ float access$getExtendedFabStartIconPadding$p() {
        return ExtendedFabStartIconPadding;
    }

    public static final /* synthetic */ float access$getExtendedFabTextPadding$p() {
        return ExtendedFabTextPadding;
    }

    /* JADX INFO: renamed from: FloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m2252FloatingActionButtonXz6DiA(final Function0<Unit> r32, Modifier modifier, Shape shape, long containerColor, long contentColor, FloatingActionButtonElevation elevation, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r41, Composer $composer, final int $changed, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(-731723913);
        ComposerKt.sourceInformation($composer2, "C(FloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)100@4948L5,101@5012L14,102@5054L31,103@5163L11,116@5678L54,118@5792L536,109@5399L929:FloatingActionButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r44 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r13 = r32;
    L13:
        int r2 = r44 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        Shape r4 = shape;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long r7 = containerColor;
    L47:
        if (($changed & 24576) == 0) goto L49;
        final long contentColor2 = contentColor;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        FloatingActionButtonElevation elevation2 = elevation;
    L68:
        int r16 = r44 & 64;
        if (r16 == 0) goto L72;
        $dirty = $dirty | 1572864;
        MutableInteractionSource interactionSource2 = interactionSource;
    L80:
        if ((r44 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        if ((4793491 & $dirty) == 4793490) goto L92;
    L95:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L98;
    L113:
        if (r2 == 0) goto L115;
        Modifier.Companion modifier3 = Modifier.Companion;
    L117:
        if ((r44 & 4) == 0) goto L119;
        $dirty = $dirty & (-897);
        Shape shape2 = FloatingActionButtonDefaults.INSTANCE.getShape($composer2, 6);
    L121:
        if ((r44 & 8) == 0) goto L123;
        int $dirty2 = $dirty & (-7169);
        long containerColor2 = FloatingActionButtonDefaults.INSTANCE.getContainerColor($composer2, 6);
    L125:
        if ((r44 & 16) == 0) goto L127;
        contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty2 >> 9) & 14);
        int $dirty3 = $dirty2 & (-57345);
    L129:
        if ((r44 & 32) == 0) goto L131;
        long containerColor3 = containerColor2;
        $dirty3 = $dirty3 & (-458753);
        elevation2 = FloatingActionButtonDefaults.INSTANCE.m2244elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, $composer2, 24576, 15);
    L132:
        if (r16 == 0) goto L134;
        modifier2 = modifier3;
        interactionSource2 = null;
        Shape shape3 = shape2;
        $dirty = $dirty3;
        long containerColor4 = containerColor3;
        int r0 = -731723913;
    L135:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L138;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:106)");
    L138:
        $composer2.startReplaceGroup(519755085);
        ComposerKt.sourceInformation($composer2, "108@5355L39");
        if (interactionSource2 != null) goto L145;
        ComposerKt.sourceInformationMarkerStart($composer2, 519755736, "CC(remember):FloatingActionButton.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L143;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L144:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) value$iv;
    L146:
        $composer2.endReplaceGroup();
        long contentColor3 = contentColor2;
        Composer $composer3 = $composer2;
        SurfaceKt.m2673Surfaceo_FOJdg(r13, SemanticsModifierKt.semantics$default(modifier2, false, FloatingActionButtonKt$FloatingActionButton$1.INSTANCE, 1, null), false, shape3, containerColor4, contentColor3, elevation2.m2247tonalElevationD9Ej5fM$material3_release(), elevation2.shadowElevation$material3_release(interactionSource3, $composer2, ($dirty >> 12) & 112).getValue().m6987unboximpl(), null, interactionSource3, ComposableLambdaKt.rememberComposableLambda(1249316354, true, new FloatingActionButtonKt$FloatingActionButton$2(contentColor2, r41), $composer2, 54), $composer3, ((($dirty & 14) | (($dirty << 3) & 7168)) | (($dirty << 3) & 57344)) | (458752 & ($dirty << 3)), 6, 260);
        if (ComposerKt.isTraceInProgress() == false) goto L149;
        ComposerKt.traceEventEnd();
    L149:
        final Modifier modifier4 = modifier2;
        final FloatingActionButtonElevation elevation3 = elevation2;
        final Shape shape4 = shape3;
        final long contentColor4 = contentColor3;
        final MutableInteractionSource interactionSource4 = interactionSource2;
        final long containerColor5 = containerColor4;
    L150:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L154;
        r14.updateScope(new FloatingActionButtonKt$FloatingActionButton$3(r32, modifier4, shape4, containerColor5, contentColor4, elevation3, interactionSource4, r41, $changed, r44));
        return;
    L154:
        return;
    L143:
        value$iv = it$iv;
        goto L144
    L145:
        interactionSource3 = interactionSource2;
        goto L146
    L134:
        interactionSource2 = interactionSource;
        modifier2 = modifier3;
        shape3 = shape2;
        $dirty = $dirty3;
        containerColor4 = containerColor3;
        r0 = -731723913;
        goto L135
    L131:
        containerColor3 = containerColor2;
        goto L132
    L127:
        $dirty3 = $dirty2;
        goto L129
    L123:
        $dirty2 = $dirty;
        containerColor2 = r7;
        goto L125
    L119:
        shape2 = r4;
        goto L121
    L115:
        modifier3 = modifier2;
        goto L117
    L98:
        if ($composer2.getDefaultsInvalid() == true) goto L113;
        $composer2.skipToGroupEnd();
        if ((r44 & 4) == 0) goto L104;
        $dirty = $dirty & (-897);
    L104:
        if ((r44 & 8) == 0) goto L107;
        $dirty = $dirty & (-7169);
    L107:
        if ((r44 & 16) == 0) goto L110;
        $dirty = $dirty & (-57345);
    L110:
        if ((r44 & 32) == 0) goto L112;
        $dirty = $dirty & (-458753);
        shape3 = r4;
        containerColor4 = r7;
        r0 = -731723913;
        goto L135
    L112:
        shape3 = r4;
        containerColor4 = r7;
        r0 = -731723913;
        goto L135
    L92:
        if ($composer2.getSkipping() == false) goto L95;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        shape4 = r4;
        $composer3 = $composer2;
        FloatingActionButtonElevation r30 = elevation2;
        interactionSource4 = interactionSource2;
        containerColor5 = r7;
        elevation3 = r30;
        contentColor4 = contentColor2;
        goto L150
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r41) == false) goto L87;
        int r1 = 8388608;
    L88:
        $dirty = $dirty | r1;
        goto L90
    L87:
        r1 = 4194304;
        goto L88
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        interactionSource2 = interactionSource;
        if ($composer2.changed(interactionSource2) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty = $dirty | r17;
        goto L80
    L76:
        r17 = 524288;
        goto L77
    L78:
        interactionSource2 = interactionSource;
        goto L80
    L60:
        if ((r44 & 32) != 0) goto L64;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L65;
        int r5 = 131072;
    L66:
        $dirty = $dirty | r5;
    L65:
        r5 = 65536;
        goto L66
    L64:
        elevation2 = elevation;
        goto L65
    L49:
        if ((r44 & 16) != 0) goto L53;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L54;
        int r6 = 16384;
    L55:
        $dirty = $dirty | r6;
    L54:
        r6 = 8192;
        goto L55
    L53:
        contentColor2 = contentColor;
        goto L54
    L38:
        if ((r44 & 8) != 0) goto L42;
        r7 = containerColor;
        if ($composer2.changed(r7) == false) goto L43;
        int r8 = 2048;
    L44:
        $dirty = $dirty | r8;
    L43:
        r8 = 1024;
        goto L44
    L42:
        r7 = containerColor;
        goto L43
    L27:
        if ((r44 & 4) != 0) goto L31;
        r4 = shape;
        if ($composer2.changed(r4) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
    L32:
        r9 = 128;
        goto L33
    L31:
        r4 = shape;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r10 = 32;
    L22:
        $dirty = $dirty | r10;
        goto L25
    L21:
        r10 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r32;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r3 = 4;
    L11:
        $dirty = $dirty | r3;
        goto L13
    L10:
        r3 = 2;
        goto L11
    L12:
        r13 = r32;
        goto L13
    }

    /* JADX INFO: renamed from: SmallFloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m2254SmallFloatingActionButtonXz6DiA(final Function0<Unit> r28, Modifier modifier, Shape shape, long containerColor, long contentColor, FloatingActionButtonElevation elevation, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r37, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(1444748300);
        ComposerKt.sourceInformation($composer2, "C(SmallFloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)170@8224L10,171@8293L14,172@8335L31,173@8444L11,177@8559L455:FloatingActionButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r13 = r28;
    L13:
        int r2 = r40 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        Shape r4 = shape;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long r7 = containerColor;
    L47:
        if (($changed & 24576) == 0) goto L49;
        long contentColor2 = contentColor;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        FloatingActionButtonElevation elevation2 = elevation;
    L68:
        int r15 = r40 & 64;
        if (r15 == 0) goto L72;
        $dirty = $dirty | 1572864;
        MutableInteractionSource r5 = interactionSource;
    L80:
        if ((r40 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if (($dirty & 4793491) == 4793490) goto L93;
    L96:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L99;
    L114:
        if (r2 == 0) goto L116;
        Modifier.Companion modifier3 = Modifier.Companion;
    L118:
        if ((r40 & 4) == 0) goto L120;
        $dirty = $dirty & (-897);
        Shape shape2 = FloatingActionButtonDefaults.INSTANCE.getSmallShape($composer2, 6);
    L122:
        if ((r40 & 8) == 0) goto L124;
        int $dirty2 = $dirty & (-7169);
        long containerColor2 = FloatingActionButtonDefaults.INSTANCE.getContainerColor($composer2, 6);
    L126:
        if ((r40 & 16) == 0) goto L128;
        contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty2 >> 9) & 14);
        int $dirty3 = $dirty2 & (-57345);
    L130:
        if ((r40 & 32) == 0) goto L132;
        long containerColor3 = containerColor2;
        $dirty3 = $dirty3 & (-458753);
        elevation2 = FloatingActionButtonDefaults.INSTANCE.m2244elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, $composer2, 24576, 15);
    L133:
        if (r15 == 0) goto L135;
        modifier2 = modifier3;
        Shape shape3 = shape2;
        long containerColor4 = containerColor3;
        int r0 = 1444748300;
        MutableInteractionSource interactionSource2 = null;
        FloatingActionButtonElevation elevation3 = elevation2;
        $dirty = $dirty3;
        long contentColor3 = contentColor2;
    L136:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L139;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:176)");
    L139:
        Composer $composer3 = $composer2;
        m2252FloatingActionButtonXz6DiA(r13, SizeKt.m776sizeInqDBjuR0$default(modifier2, FabPrimarySmallTokens.INSTANCE.m3328getContainerWidthD9Ej5fM(), FabPrimarySmallTokens.INSTANCE.m3327getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape3, containerColor4, contentColor3, elevation3, interactionSource2, r37, $composer3, (((((($dirty & 14) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L142;
        ComposerKt.traceEventEnd();
    L142:
        final Modifier modifier4 = modifier2;
        final Shape shape4 = shape3;
        final long containerColor5 = containerColor4;
        final long contentColor4 = contentColor3;
        final FloatingActionButtonElevation elevation4 = elevation3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L143:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L147;
        r14.updateScope(new FloatingActionButtonKt$SmallFloatingActionButton$1(r28, modifier4, shape4, containerColor5, contentColor4, elevation4, interactionSource3, r37, $changed, r40));
        return;
    L147:
        return;
    L135:
        modifier2 = modifier3;
        shape3 = shape2;
        $dirty = $dirty3;
        containerColor4 = containerColor3;
        r0 = 1444748300;
        interactionSource2 = interactionSource;
        contentColor3 = contentColor2;
        elevation3 = elevation2;
        goto L136
    L132:
        containerColor3 = containerColor2;
        goto L133
    L128:
        $dirty3 = $dirty2;
        goto L130
    L124:
        $dirty2 = $dirty;
        containerColor2 = r7;
        goto L126
    L120:
        shape2 = r4;
        goto L122
    L116:
        modifier3 = modifier2;
        goto L118
    L99:
        if ($composer2.getDefaultsInvalid() == true) goto L114;
        $composer2.skipToGroupEnd();
        if ((r40 & 4) == 0) goto L105;
        $dirty = $dirty & (-897);
    L105:
        if ((r40 & 8) == 0) goto L108;
        $dirty = $dirty & (-7169);
    L108:
        if ((r40 & 16) == 0) goto L111;
        $dirty = $dirty & (-57345);
    L111:
        if ((r40 & 32) == 0) goto L113;
        $dirty = $dirty & (-458753);
        shape3 = r4;
        interactionSource2 = r5;
        containerColor4 = r7;
        contentColor3 = contentColor2;
        elevation3 = elevation2;
        r0 = 1444748300;
        goto L136
    L113:
        shape3 = r4;
        interactionSource2 = r5;
        containerColor4 = r7;
        contentColor3 = contentColor2;
        elevation3 = elevation2;
        r0 = 1444748300;
        goto L136
    L93:
        if ($composer2.getSkipping() == false) goto L96;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        shape4 = r4;
        $composer3 = $composer2;
        long r26 = contentColor2;
        interactionSource3 = r5;
        containerColor5 = r7;
        contentColor4 = r26;
        elevation4 = elevation2;
        goto L143
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changedInstance(r37) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty = $dirty | r17;
        goto L91
    L87:
        r17 = 4194304;
        goto L88
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r5 = interactionSource;
        if ($composer2.changed(r5) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
        goto L80
    L76:
        r16 = 524288;
        goto L77
    L78:
        r5 = interactionSource;
        goto L80
    L60:
        if ((r40 & 32) != 0) goto L64;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L65;
        int r6 = 131072;
    L66:
        $dirty = $dirty | r6;
    L65:
        r6 = 65536;
        goto L66
    L64:
        elevation2 = elevation;
        goto L65
    L49:
        if ((r40 & 16) != 0) goto L53;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L54;
        int r8 = 16384;
    L55:
        $dirty = $dirty | r8;
    L54:
        r8 = 8192;
        goto L55
    L53:
        contentColor2 = contentColor;
        goto L54
    L38:
        if ((r40 & 8) != 0) goto L42;
        r7 = containerColor;
        if ($composer2.changed(r7) == false) goto L43;
        int r9 = 2048;
    L44:
        $dirty = $dirty | r9;
    L43:
        r9 = 1024;
        goto L44
    L42:
        r7 = containerColor;
        goto L43
    L27:
        if ((r40 & 4) != 0) goto L31;
        r4 = shape;
        if ($composer2.changed(r4) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
    L32:
        r10 = 128;
        goto L33
    L31:
        r4 = shape;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r11 = 32;
    L22:
        $dirty = $dirty | r11;
        goto L25
    L21:
        r11 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r28;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r3 = 4;
    L11:
        $dirty = $dirty | r3;
        goto L13
    L10:
        r3 = 2;
        goto L11
    L12:
        r13 = r28;
        goto L13
    }

    /* JADX INFO: renamed from: LargeFloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m2253LargeFloatingActionButtonXz6DiA(final Function0<Unit> r28, Modifier modifier, Shape shape, long containerColor, long contentColor, FloatingActionButtonElevation elevation, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r37, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(-1650866856);
        ComposerKt.sourceInformation($composer2, "C(LargeFloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)226@10910L10,227@10979L14,228@11021L31,229@11130L11,233@11245L455:FloatingActionButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r13 = r28;
    L13:
        int r2 = r40 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        Shape r4 = shape;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long r7 = containerColor;
    L47:
        if (($changed & 24576) == 0) goto L49;
        long contentColor2 = contentColor;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        FloatingActionButtonElevation elevation2 = elevation;
    L68:
        int r15 = r40 & 64;
        if (r15 == 0) goto L72;
        $dirty = $dirty | 1572864;
        MutableInteractionSource r5 = interactionSource;
    L80:
        if ((r40 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if (($dirty & 4793491) == 4793490) goto L93;
    L96:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L99;
    L114:
        if (r2 == 0) goto L116;
        Modifier.Companion modifier3 = Modifier.Companion;
    L118:
        if ((r40 & 4) == 0) goto L120;
        $dirty = $dirty & (-897);
        Shape shape2 = FloatingActionButtonDefaults.INSTANCE.getLargeShape($composer2, 6);
    L122:
        if ((r40 & 8) == 0) goto L124;
        int $dirty2 = $dirty & (-7169);
        long containerColor2 = FloatingActionButtonDefaults.INSTANCE.getContainerColor($composer2, 6);
    L126:
        if ((r40 & 16) == 0) goto L128;
        contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty2 >> 9) & 14);
        int $dirty3 = $dirty2 & (-57345);
    L130:
        if ((r40 & 32) == 0) goto L132;
        long containerColor3 = containerColor2;
        $dirty3 = $dirty3 & (-458753);
        elevation2 = FloatingActionButtonDefaults.INSTANCE.m2244elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, $composer2, 24576, 15);
    L133:
        if (r15 == 0) goto L135;
        modifier2 = modifier3;
        Shape shape3 = shape2;
        long containerColor4 = containerColor3;
        int r0 = -1650866856;
        MutableInteractionSource interactionSource2 = null;
        FloatingActionButtonElevation elevation3 = elevation2;
        $dirty = $dirty3;
        long contentColor3 = contentColor2;
    L136:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L139;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:232)");
    L139:
        Composer $composer3 = $composer2;
        m2252FloatingActionButtonXz6DiA(r13, SizeKt.m776sizeInqDBjuR0$default(modifier2, FabPrimaryLargeTokens.INSTANCE.m3317getContainerWidthD9Ej5fM(), FabPrimaryLargeTokens.INSTANCE.m3316getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape3, containerColor4, contentColor3, elevation3, interactionSource2, r37, $composer3, (((((($dirty & 14) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L142;
        ComposerKt.traceEventEnd();
    L142:
        final Modifier modifier4 = modifier2;
        final Shape shape4 = shape3;
        final long containerColor5 = containerColor4;
        final long contentColor4 = contentColor3;
        final FloatingActionButtonElevation elevation4 = elevation3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L143:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L147;
        r14.updateScope(new FloatingActionButtonKt$LargeFloatingActionButton$1(r28, modifier4, shape4, containerColor5, contentColor4, elevation4, interactionSource3, r37, $changed, r40));
        return;
    L147:
        return;
    L135:
        modifier2 = modifier3;
        shape3 = shape2;
        $dirty = $dirty3;
        containerColor4 = containerColor3;
        r0 = -1650866856;
        interactionSource2 = interactionSource;
        contentColor3 = contentColor2;
        elevation3 = elevation2;
        goto L136
    L132:
        containerColor3 = containerColor2;
        goto L133
    L128:
        $dirty3 = $dirty2;
        goto L130
    L124:
        $dirty2 = $dirty;
        containerColor2 = r7;
        goto L126
    L120:
        shape2 = r4;
        goto L122
    L116:
        modifier3 = modifier2;
        goto L118
    L99:
        if ($composer2.getDefaultsInvalid() == true) goto L114;
        $composer2.skipToGroupEnd();
        if ((r40 & 4) == 0) goto L105;
        $dirty = $dirty & (-897);
    L105:
        if ((r40 & 8) == 0) goto L108;
        $dirty = $dirty & (-7169);
    L108:
        if ((r40 & 16) == 0) goto L111;
        $dirty = $dirty & (-57345);
    L111:
        if ((r40 & 32) == 0) goto L113;
        $dirty = $dirty & (-458753);
        shape3 = r4;
        interactionSource2 = r5;
        containerColor4 = r7;
        contentColor3 = contentColor2;
        elevation3 = elevation2;
        r0 = -1650866856;
        goto L136
    L113:
        shape3 = r4;
        interactionSource2 = r5;
        containerColor4 = r7;
        contentColor3 = contentColor2;
        elevation3 = elevation2;
        r0 = -1650866856;
        goto L136
    L93:
        if ($composer2.getSkipping() == false) goto L96;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        shape4 = r4;
        $composer3 = $composer2;
        long r26 = contentColor2;
        interactionSource3 = r5;
        containerColor5 = r7;
        contentColor4 = r26;
        elevation4 = elevation2;
        goto L143
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changedInstance(r37) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty = $dirty | r17;
        goto L91
    L87:
        r17 = 4194304;
        goto L88
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r5 = interactionSource;
        if ($composer2.changed(r5) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
        goto L80
    L76:
        r16 = 524288;
        goto L77
    L78:
        r5 = interactionSource;
        goto L80
    L60:
        if ((r40 & 32) != 0) goto L64;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L65;
        int r6 = 131072;
    L66:
        $dirty = $dirty | r6;
    L65:
        r6 = 65536;
        goto L66
    L64:
        elevation2 = elevation;
        goto L65
    L49:
        if ((r40 & 16) != 0) goto L53;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L54;
        int r8 = 16384;
    L55:
        $dirty = $dirty | r8;
    L54:
        r8 = 8192;
        goto L55
    L53:
        contentColor2 = contentColor;
        goto L54
    L38:
        if ((r40 & 8) != 0) goto L42;
        r7 = containerColor;
        if ($composer2.changed(r7) == false) goto L43;
        int r9 = 2048;
    L44:
        $dirty = $dirty | r9;
    L43:
        r9 = 1024;
        goto L44
    L42:
        r7 = containerColor;
        goto L43
    L27:
        if ((r40 & 4) != 0) goto L31;
        r4 = shape;
        if ($composer2.changed(r4) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
    L32:
        r10 = 128;
        goto L33
    L31:
        r4 = shape;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r11 = 32;
    L22:
        $dirty = $dirty | r11;
        goto L25
    L21:
        r11 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r28;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r3 = 4;
    L11:
        $dirty = $dirty | r3;
        goto L13
    L10:
        r3 = 2;
        goto L11
    L12:
        r13 = r28;
        goto L13
    }

    /* JADX INFO: renamed from: ExtendedFloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m2251ExtendedFloatingActionButtonXz6DiA(final Function0<Unit> r28, Modifier modifier, Shape shape, long containerColor, long contentColor, FloatingActionButtonElevation elevation, MutableInteractionSource interactionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r37, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(-326283107);
        ComposerKt.sourceInformation($composer2, "C(ExtendedFloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)285@13734L16,286@13809L14,287@13851L31,288@13960L11,300@14347L335,292@14084L598:FloatingActionButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r13 = r28;
    L13:
        int r2 = r40 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r3 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        Shape r4 = shape;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long r7 = containerColor;
    L47:
        if (($changed & 24576) == 0) goto L49;
        long contentColor2 = contentColor;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        FloatingActionButtonElevation elevation2 = elevation;
    L68:
        int r16 = r40 & 64;
        if (r16 == 0) goto L72;
        $dirty = $dirty | 1572864;
        MutableInteractionSource r5 = interactionSource;
    L80:
        if ((r40 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        if ((4793491 & $dirty) == 4793490) goto L92;
    L95:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L98;
    L113:
        if (r2 == 0) goto L115;
        Modifier.Companion modifier2 = Modifier.Companion;
    L117:
        if ((r40 & 4) == 0) goto L119;
        $dirty = $dirty & (-897);
        Shape shape2 = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape($composer2, 6);
    L121:
        if ((r40 & 8) == 0) goto L123;
        int $dirty2 = $dirty & (-7169);
        long containerColor2 = FloatingActionButtonDefaults.INSTANCE.getContainerColor($composer2, 6);
    L125:
        if ((r40 & 16) == 0) goto L127;
        contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty2 >> 9) & 14);
        int $dirty3 = $dirty2 & (-57345);
    L129:
        if ((r40 & 32) == 0) goto L131;
        long containerColor3 = containerColor2;
        $dirty3 = $dirty3 & (-458753);
        elevation2 = FloatingActionButtonDefaults.INSTANCE.m2244elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, $composer2, 24576, 15);
    L132:
        if (r16 == 0) goto L134;
        long r17 = contentColor2;
        Modifier modifier3 = modifier2;
        long contentColor3 = r17;
        int r6 = $dirty3;
        MutableInteractionSource interactionSource2 = null;
        $dirty = r6;
        Shape shape3 = shape2;
        long containerColor4 = containerColor3;
        int r8 = -326283107;
        FloatingActionButtonElevation elevation3 = elevation2;
    L135:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L138;
        ComposerKt.traceEventStart(r8, $dirty, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:291)");
    L138:
        Composer $composer3 = $composer2;
        m2252FloatingActionButtonXz6DiA(r13, modifier3, shape3, containerColor4, contentColor3, elevation3, interactionSource2, ComposableLambdaKt.rememberComposableLambda(398457247, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$1(r37), $composer2, 54), $composer3, ((((((12582912 | ($dirty & 14)) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L141;
        ComposerKt.traceEventEnd();
    L141:
        final Modifier modifier4 = modifier3;
        final Shape shape4 = shape3;
        final long containerColor5 = containerColor4;
        final long contentColor4 = contentColor3;
        final FloatingActionButtonElevation elevation4 = elevation3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L142:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L146;
        r14.updateScope(new FloatingActionButtonKt$ExtendedFloatingActionButton$2(r28, modifier4, shape4, containerColor5, contentColor4, elevation4, interactionSource3, r37, $changed, r40));
        return;
    L146:
        return;
    L134:
        long r1 = contentColor2;
        modifier3 = modifier2;
        contentColor3 = r1;
        shape3 = shape2;
        $dirty = $dirty3;
        containerColor4 = containerColor3;
        r8 = -326283107;
        interactionSource2 = interactionSource;
        elevation3 = elevation2;
        goto L135
    L131:
        containerColor3 = containerColor2;
        goto L132
    L127:
        $dirty3 = $dirty2;
        goto L129
    L123:
        $dirty2 = $dirty;
        containerColor2 = r7;
        goto L125
    L119:
        shape2 = r4;
        goto L121
    L115:
        modifier2 = r3;
        goto L117
    L98:
        if ($composer2.getDefaultsInvalid() == true) goto L113;
        $composer2.skipToGroupEnd();
        if ((r40 & 4) == 0) goto L104;
        $dirty = $dirty & (-897);
    L104:
        if ((r40 & 8) == 0) goto L107;
        $dirty = $dirty & (-7169);
    L107:
        if ((r40 & 16) == 0) goto L110;
        $dirty = $dirty & (-57345);
    L110:
        if ((r40 & 32) == 0) goto L112;
        $dirty = $dirty & (-458753);
        interactionSource2 = r5;
        containerColor4 = r7;
        elevation3 = elevation2;
        r8 = -326283107;
        contentColor3 = contentColor2;
        modifier3 = r3;
        shape3 = r4;
        goto L135
    L112:
        interactionSource2 = r5;
        containerColor4 = r7;
        elevation3 = elevation2;
        r8 = -326283107;
        contentColor3 = contentColor2;
        modifier3 = r3;
        shape3 = r4;
        goto L135
    L92:
        if ($composer2.getSkipping() == false) goto L95;
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        shape4 = r4;
        $composer3 = $composer2;
        FloatingActionButtonElevation r26 = elevation2;
        interactionSource3 = r5;
        containerColor5 = r7;
        elevation4 = r26;
        contentColor4 = contentColor2;
        goto L142
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r37) == false) goto L87;
        int r0 = 8388608;
    L88:
        $dirty = $dirty | r0;
        goto L90
    L87:
        r0 = 4194304;
        goto L88
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r5 = interactionSource;
        if ($composer2.changed(r5) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
        goto L80
    L76:
        r18 = 524288;
        goto L77
    L78:
        r5 = interactionSource;
        goto L80
    L60:
        if ((r40 & 32) != 0) goto L64;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L65;
        int r9 = 131072;
    L66:
        $dirty = $dirty | r9;
    L65:
        r9 = 65536;
        goto L66
    L64:
        elevation2 = elevation;
        goto L65
    L49:
        if ((r40 & 16) != 0) goto L53;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L54;
        int r10 = 16384;
    L55:
        $dirty = $dirty | r10;
    L54:
        r10 = 8192;
        goto L55
    L53:
        contentColor2 = contentColor;
        goto L54
    L38:
        if ((r40 & 8) != 0) goto L42;
        r7 = containerColor;
        if ($composer2.changed(r7) == false) goto L43;
        int r11 = 2048;
    L44:
        $dirty = $dirty | r11;
    L43:
        r11 = 1024;
        goto L44
    L42:
        r7 = containerColor;
        goto L43
    L27:
        if ((r40 & 4) != 0) goto L31;
        r4 = shape;
        if ($composer2.changed(r4) == false) goto L32;
        int r12 = 256;
    L33:
        $dirty = $dirty | r12;
    L32:
        r12 = 128;
        goto L33
    L31:
        r4 = shape;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L21;
        int r15 = 32;
    L22:
        $dirty = $dirty | r15;
        goto L25
    L21:
        r15 = 16;
        goto L22
    L23:
        r3 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r28;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r19 = 4;
    L11:
        $dirty = $dirty | r19;
        goto L13
    L10:
        r19 = 2;
        goto L11
    L12:
        r13 = r28;
        goto L13
    }

    /* JADX INFO: renamed from: ExtendedFloatingActionButton-ElI5-7k, reason: not valid java name */
    public static final void m2250ExtendedFloatingActionButtonElI57k(Function2<? super Composer, ? super Integer, Unit> r29, final Function2<? super Composer, ? super Integer, Unit> r30, final Function0<Unit> r31, Modifier modifier, boolean expanded, Shape shape, long containerColor, long contentColor, FloatingActionButtonElevation elevation, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r43) {
        Composer $composer2 = $composer.startRestartGroup(-1387401842);
        ComposerKt.sourceInformation($composer2, "C(ExtendedFloatingActionButton)P(9,4,7,6,3,8,0:c#ui.graphics.Color,1:c#ui.graphics.Color)359@17300L16,360@17375L14,361@17417L31,362@17526L11,373@17867L1053,365@17604L1316:FloatingActionButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r43 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r43 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r43 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
        Function0<Unit> r15 = r31;
    L33:
        int r4 = r43 & 8;
        if (r4 == 0) goto L37;
        $dirty = $dirty | 3072;
        Modifier modifier2 = modifier;
    L44:
        int r6 = r43 & 16;
        if (r6 == 0) goto L48;
        $dirty = $dirty | 24576;
        final boolean expanded2 = expanded;
    L56:
        if ((196608 & $changed) == 0) goto L58;
        Shape r9 = shape;
    L67:
        if ((1572864 & $changed) == 0) goto L69;
        long r10 = containerColor;
    L78:
        if (($changed & 12582912) != 0) goto L89;
        if ((r43 & 128) != 0) goto L85;
        if ($composer2.changed(contentColor) == false) goto L85;
        int r16 = 8388608;
    L86:
        $dirty = $dirty | r16;
    L85:
        r16 = 4194304;
    L89:
        if (($changed & 100663296) == 0) goto L91;
        FloatingActionButtonElevation r12 = elevation;
    L99:
        int r5 = r43 & 512;
        if (r5 == 0) goto L103;
        $dirty = $dirty | 805306368;
        MutableInteractionSource r7 = interactionSource;
    L111:
        if (($dirty & 306783379) == 306783378) goto L113;
    L116:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L119;
    L134:
        if (r4 == 0) goto L136;
        Modifier.Companion modifier3 = Modifier.Companion;
    L137:
        if (r6 == 0) goto L139;
        boolean expanded3 = true;
    L141:
        if ((r43 & 32) == 0) goto L143;
        $dirty = $dirty & (-458753);
        Shape shape2 = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape($composer2, 6);
    L145:
        if ((r43 & 64) == 0) goto L147;
        long containerColor2 = FloatingActionButtonDefaults.INSTANCE.getContainerColor($composer2, 6);
        $dirty = $dirty & (-3670017);
    L149:
        if ((r43 & 128) == 0) goto L151;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty >> 18) & 14);
        int $dirty2 = $dirty & (-29360129);
    L153:
        if ((r43 & 256) == 0) goto L155;
        long containerColor3 = containerColor2;
        FloatingActionButtonElevation elevation2 = FloatingActionButtonDefaults.INSTANCE.m2244elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, $composer2, 24576, 15);
        $dirty2 = $dirty2 & (-234881025);
    L156:
        if (r5 == 0) goto L158;
        modifier2 = modifier3;
        expanded2 = expanded3;
        Shape shape3 = shape2;
        long contentColor3 = contentColor2;
        long containerColor4 = containerColor3;
        MutableInteractionSource interactionSource2 = null;
        FloatingActionButtonElevation elevation3 = elevation2;
        $dirty = $dirty2;
    L159:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L162;
        ComposerKt.traceEventStart(-1387401842, $dirty, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:364)");
    L162:
        final Function2<? super Composer, ? super Integer, Unit> r1 = r29;
        Modifier modifier4 = modifier2;
        Composer $composer3 = $composer2;
        m2252FloatingActionButtonXz6DiA(r15, modifier4, shape3, containerColor4, contentColor3, elevation3, interactionSource2, ComposableLambdaKt.rememberComposableLambda(1172118032, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$3(expanded2, r30, r1), $composer2, 54), $composer3, (((((((($dirty >> 6) & 14) | 12582912) | (($dirty >> 6) & 112)) | (($dirty >> 9) & 896)) | (($dirty >> 9) & 7168)) | (($dirty >> 9) & 57344)) | (($dirty >> 9) & 458752)) | (3670016 & ($dirty >> 9)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L165;
        ComposerKt.traceEventEnd();
    L165:
        final boolean expanded4 = expanded2;
        final Modifier modifier5 = modifier4;
        final Shape shape4 = shape3;
        final long containerColor5 = containerColor4;
        final long contentColor4 = contentColor3;
        final FloatingActionButtonElevation elevation4 = elevation3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        int $dirty3 = $dirty;
    L166:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L170;
        r0.updateScope(new FloatingActionButtonKt$ExtendedFloatingActionButton$4(r1, r30, r31, modifier5, expanded4, shape4, containerColor5, contentColor4, elevation4, interactionSource3, $changed, r43));
        return;
    L170:
        return;
    L158:
        modifier2 = modifier3;
        expanded2 = expanded3;
        shape3 = shape2;
        contentColor3 = contentColor2;
        containerColor4 = containerColor3;
        interactionSource2 = interactionSource;
        elevation3 = elevation2;
        $dirty = $dirty2;
        goto L159
    L155:
        containerColor3 = containerColor2;
        elevation2 = r12;
        goto L156
    L151:
        contentColor2 = contentColor;
        $dirty2 = $dirty;
        goto L153
    L147:
        containerColor2 = r10;
        goto L149
    L143:
        shape2 = r9;
        goto L145
    L139:
        expanded3 = expanded2;
        goto L141
    L136:
        modifier3 = modifier2;
        goto L137
    L119:
        if ($composer2.getDefaultsInvalid() == true) goto L134;
        $composer2.skipToGroupEnd();
        if ((r43 & 32) == 0) goto L125;
        $dirty = $dirty & (-458753);
    L125:
        if ((r43 & 64) == 0) goto L128;
        $dirty = $dirty & (-3670017);
    L128:
        if ((r43 & 128) == 0) goto L131;
        $dirty = $dirty & (-29360129);
    L131:
        if ((r43 & 256) == 0) goto L133;
        contentColor3 = contentColor;
        $dirty = $dirty & (-234881025);
        interactionSource2 = r7;
        shape3 = r9;
        containerColor4 = r10;
        elevation3 = r12;
        goto L159
    L133:
        contentColor3 = contentColor;
        interactionSource2 = r7;
        shape3 = r9;
        containerColor4 = r10;
        elevation3 = r12;
        goto L159
    L113:
        if ($composer2.getSkipping() == false) goto L116;
        $composer2.skipToGroupEnd();
        r1 = r29;
        $composer3 = $composer2;
        shape4 = r9;
        FloatingActionButtonElevation r28 = r12;
        interactionSource3 = r7;
        modifier5 = modifier2;
        expanded4 = expanded2;
        containerColor5 = r10;
        elevation4 = r28;
        contentColor4 = contentColor;
        $dirty3 = $dirty;
        goto L166
    L103:
        if (($changed & 805306368) != 0) goto L109;
        r7 = interactionSource;
        if ($composer2.changed(r7) == false) goto L107;
        int r19 = 536870912;
    L108:
        $dirty = $dirty | r19;
        goto L111
    L107:
        r19 = 268435456;
        goto L108
    L109:
        r7 = interactionSource;
        goto L111
    L91:
        if ((r43 & 256) != 0) goto L95;
        r12 = elevation;
        if ($composer2.changed(r12) == false) goto L96;
        int r17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        $dirty = $dirty | r17;
    L96:
        r17 = 33554432;
        goto L97
    L95:
        r12 = elevation;
        goto L96
    L69:
        if ((r43 & 64) != 0) goto L73;
        r10 = containerColor;
        if ($composer2.changed(r10) == false) goto L74;
        int r13 = 1048576;
    L75:
        $dirty = $dirty | r13;
    L74:
        r13 = 524288;
        goto L75
    L73:
        r10 = containerColor;
        goto L74
    L58:
        if ((r43 & 32) != 0) goto L62;
        r9 = shape;
        if ($composer2.changed(r9) == false) goto L63;
        int r11 = 131072;
    L64:
        $dirty = $dirty | r11;
    L63:
        r11 = 65536;
        goto L64
    L62:
        r9 = shape;
        goto L63
    L48:
        if (($changed & 24576) != 0) goto L54;
        expanded2 = expanded;
        if ($composer2.changed(expanded2) == false) goto L52;
        int r14 = 16384;
    L53:
        $dirty = $dirty | r14;
        goto L56
    L52:
        r14 = 8192;
        goto L53
    L54:
        expanded2 = expanded;
        goto L56
    L37:
        if (($changed & 3072) != 0) goto L43;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L41;
        int r8 = 2048;
    L42:
        $dirty = $dirty | r8;
        goto L44
    L41:
        r8 = 1024;
        goto L42
    L43:
        modifier2 = modifier;
        goto L44
    L26:
        if (($changed & 384) != 0) goto L32;
        r15 = r31;
        if ($composer2.changedInstance(r15) == false) goto L30;
        int r18 = 256;
    L31:
        $dirty = $dirty | r18;
        goto L33
    L30:
        r18 = 128;
        goto L31
    L32:
        r15 = r31;
        goto L33
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r30) == false) goto L20;
        int r20 = 32;
    L21:
        $dirty = $dirty | r20;
        goto L23
    L20:
        r20 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(r29) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L13
    L10:
        r21 = 2;
        goto L11
    }

    static {
        ExtendedFabStartIconPadding = Dp.m6973constructorimpl(16);
        ExtendedFabEndIconPadding = Dp.m6973constructorimpl(12);
        ExtendedFabTextPadding = Dp.m6973constructorimpl(20);
        ExtendedFabMinimumWidth = Dp.m6973constructorimpl(80);
        ExtendedFabCollapseAnimation = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, MotionTokens.INSTANCE.getEasingLinearCubicBezier(), 2, null), 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedCubicBezier(), 2, null), Alignment.Companion.getStart(), false, null, 12, null));
        ExtendedFabExpandAnimation = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(ComposerKt.invocationKey, 100, MotionTokens.INSTANCE.getEasingLinearCubicBezier()), 0.0f, 2, null).plus(EnterExitTransitionKt.expandHorizontally$default(AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedCubicBezier(), 2, null), Alignment.Companion.getStart(), false, null, 12, null));
    }
}
