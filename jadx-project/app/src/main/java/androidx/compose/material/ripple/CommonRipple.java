package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CommonRipple.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Replaced by the new RippleNode implementation")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJF\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/ripple/CommonRipple;", "Landroidx/compose/material/ripple/Ripple;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "rememberUpdatedRippleInstance", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CommonRipple extends Ripple {
    public static final int $stable = 0;

    static {
    }

    public /* synthetic */ CommonRipple(boolean r1, float r2, State r3, DefaultConstructorMarker r4) {
        this(r1, r2, r3);
    }

    private CommonRipple(boolean bounded, float radius, State<Color> r4) {
        super(bounded, radius, r4, null);
    }

    @Override // androidx.compose.material.ripple.Ripple
    /* JADX INFO: renamed from: rememberUpdatedRippleInstance-942rkJo, reason: not valid java name */
    public RippleIndicationInstance mo1864rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean bounded, float radius, State<Color> r20, State<RippleAlpha> r21, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1768051227);
        ComposerKt.sourceInformation($composer, "C(rememberUpdatedRippleInstance)P(2!1,3:c#ui.unit.Dp)57@2185L125:CommonRipple.kt#vhb33q");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1768051227, $changed, -1, "androidx.compose.material.ripple.CommonRipple.rememberUpdatedRippleInstance (CommonRipple.kt:56)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -1865672587, "CC(remember):CommonRipple.kt#9igjgp");
        boolean r3 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L12;
        if ($composer.changed(interactionSource) == false) goto L12;
    L13:
        boolean r5 = true;
    L16:
        if (((458752 & $changed) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) goto L22;
        if ($composer.changed(this) == false) goto L22;
    L23:
        r3 = true;
    L24:
        boolean invalid$iv = r3 | r5;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L27;
    L30:
        Object value$iv = new CommonRippleIndicationInstance(bounded, radius, r20, r21, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L31:
        CommonRippleIndicationInstance r7 = (CommonRippleIndicationInstance) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L34;
        ComposerKt.traceEventEnd();
    L34:
        $composer.endReplaceGroup();
        return r7;
    L27:
        if (it$iv != Composer.Companion.getEmpty()) goto L31;
    L22:
        if ((196608 & $changed) != 131072) goto L24;
    L12:
        if (($changed & 6) == 4) goto L13;
        r5 = false;
        goto L16
    }
}
