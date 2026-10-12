package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002\u001a0\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"DefaultTweenSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "createRippleModifierNode", "Landroidx/compose/ui/node/DelegatableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "createRippleModifierNode-TDGSqEk", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/DelegatableNode;", "incomingStateLayerAnimationSpecFor", "Landroidx/compose/animation/core/AnimationSpec;", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "outgoingStateLayerAnimationSpecFor", "rememberRipple", "Landroidx/compose/foundation/Indication;", "Landroidx/compose/ui/graphics/Color;", "rememberRipple-9IZ8Weo", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "material-ripple_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RippleKt {
    private static final TweenSpec<Float> DefaultTweenSpec = null;

    public static final /* synthetic */ AnimationSpec access$incomingStateLayerAnimationSpecFor(Interaction interaction) {
        return incomingStateLayerAnimationSpecFor(interaction);
    }

    public static final /* synthetic */ AnimationSpec access$outgoingStateLayerAnimationSpecFor(Interaction interaction) {
        return outgoingStateLayerAnimationSpecFor(interaction);
    }

    /* JADX INFO: renamed from: createRippleModifierNode-TDGSqEk, reason: not valid java name */
    public static final DelegatableNode m1873createRippleModifierNodeTDGSqEk(InteractionSource interactionSource, boolean bounded, float radius, ColorProducer color, Function0<RippleAlpha> r5) {
        return Ripple_androidKt.m1879createPlatformRippleNodeTDGSqEk(interactionSource, bounded, radius, color, r5);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "rememberRipple has been deprecated - it returns an old Indication implementation that is not compatible with the new Indication APIs that provide notable performance improvements. Instead, use the new ripple APIs provided by design system libraries, such as material and material3. If you are implementing your own design system library, use createRippleNode to create your own custom ripple implementation that queries your own theme values. For a migration guide and background information, please visit developer.android.com")
    /* JADX INFO: renamed from: rememberRipple-9IZ8Weo, reason: not valid java name */
    public static final Indication m1874rememberRipple9IZ8Weo(boolean bounded, float radius, long color, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, 1635163520, "C(rememberRipple)P(!1,2:c#ui.unit.Dp,1:c#ui.graphics.Color)145@7585L27,146@7624L73:Ripple.kt#vhb33q");
        if ((r14 & 1) == 0) goto L6;
        bounded = true;
    L6:
        if ((r14 & 2) == 0) goto L9;
        radius = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        if ((r14 & 4) == 0) goto L12;
        color = Color.Companion.m4402getUnspecified0d7_KjU();
    L12:
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventStart(1635163520, $changed, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:144)");
    L14:
        State colorState = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(color), $composer, ($changed >> 6) & 14);
        ComposerKt.sourceInformationMarkerStart($composer, 487972510, "CC(remember):Ripple.kt#9igjgp");
        boolean r2 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L19;
        if ($composer.changed(bounded) == false) goto L19;
    L20:
        boolean r0 = true;
    L23:
        if ((($changed & 112) ^ 48) <= 32) goto L27;
        if ($composer.changed(radius) == false) goto L27;
    L28:
        r2 = true;
    L29:
        boolean invalid$iv = r0 | r2;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L32;
    L35:
        Object value$iv = new PlatformRipple(bounded, radius, colorState, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L36:
        PlatformRipple r3 = (PlatformRipple) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventEnd();
    L39:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L32:
        if (it$iv != Composer.Companion.getEmpty()) goto L36;
    L27:
        if (($changed & 48) != 32) goto L29;
    L19:
        if (($changed & 6) == 4) goto L20;
        r0 = false;
        goto L23
    }

    private static final AnimationSpec<Float> incomingStateLayerAnimationSpecFor(Interaction interaction) {
        if ((interaction instanceof HoverInteraction.Enter) == false) goto L6;
        return DefaultTweenSpec;
    L6:
        if ((interaction instanceof FocusInteraction.Focus) == false) goto L9;
        return new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null);
    L9:
        if ((interaction instanceof DragInteraction.Start) == false) goto L12;
        return new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null);
    L12:
        return DefaultTweenSpec;
    }

    private static final AnimationSpec<Float> outgoingStateLayerAnimationSpecFor(Interaction interaction) {
        if ((interaction instanceof HoverInteraction.Enter) == false) goto L6;
        return DefaultTweenSpec;
    L6:
        if ((interaction instanceof FocusInteraction.Focus) == false) goto L9;
        return DefaultTweenSpec;
    L9:
        if ((interaction instanceof DragInteraction.Start) == false) goto L12;
        return new TweenSpec(150, 0, EasingKt.getLinearEasing(), 2, null);
    L12:
        return DefaultTweenSpec;
    }

    static {
        DefaultTweenSpec = new TweenSpec(15, 0, EasingKt.getLinearEasing(), 2, null);
    }
}
