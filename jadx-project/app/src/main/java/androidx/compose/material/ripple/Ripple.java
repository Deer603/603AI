package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Replaced by the new RippleNode implementation")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014JF\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H'ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/material/ripple/Ripple;", "Landroidx/compose/foundation/Indication;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "equals", "other", "", "hashCode", "", "rememberUpdatedInstance", "Landroidx/compose/foundation/IndicationInstance;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/IndicationInstance;", "rememberUpdatedRippleInstance", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Ripple implements Indication {
    public static final int $stable = 0;
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;

    static {
    }

    public /* synthetic */ Ripple(boolean r1, float r2, State r3, DefaultConstructorMarker r4) {
        this(r1, r2, r3);
    }

    /* JADX INFO: renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo1864rememberUpdatedRippleInstance942rkJo(InteractionSource r1, boolean r2, float r3, State<Color> r4, State<RippleAlpha> r5, Composer r6, int r7);

    private Ripple(boolean bounded, float radius, State<Color> r3) {
        this.bounded = bounded;
        this.radius = radius;
        this.color = r3;
    }

    @Override // androidx.compose.foundation.Indication
    @Deprecated(message = "Super method is deprecated")
    public final IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer $composer, int $changed) {
        $composer.startReplaceGroup(988743187);
        ComposerKt.sourceInformation($composer, "C(rememberUpdatedInstance)191@9512L7,193@9552L229,200@9866L13,200@9839L41,203@9917L85,205@10056L491,205@10012L535:Ripple.kt#vhb33q");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(988743187, $changed, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:190)");
    L5:
        ProvidableCompositionLocal<RippleTheme> r0 = RippleThemeKt.getLocalRippleTheme();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        RippleTheme theme = (RippleTheme) r3;
        long $this$isSpecified$iv = this.color.getValue().m4376unboximpl();
        boolean r10 = true;
        if ($this$isSpecified$iv == 16) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == false) goto L11;
        $composer.startReplaceGroup(-303557454);
        $composer.endReplaceGroup();
        long r2 = this.color.getValue().m4376unboximpl();
    L12:
        RippleIndicationInstance instance = mo1864rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r2), $composer, 0), SnapshotStateKt.rememberUpdatedState(theme.rippleAlpha($composer, 0), $composer, 0), $composer, ($changed & 14) | (($changed << 12) & 458752));
        ComposerKt.sourceInformationMarkerStart($composer, -9777752, "CC(remember):Ripple.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L17;
        if ($composer.changed(interactionSource) == false) goto L17;
    L20:
        boolean invalid$iv = $composer.changedInstance(instance) | r10;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L23;
    L26:
        Object value$iv = (Function2) new Ripple$rememberUpdatedInstance$1$1(interactionSource, instance, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L27:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(instance, interactionSource, (Function2) it$iv, $composer, ($changed << 3) & 112);
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventEnd();
    L30:
        $composer.endReplaceGroup();
        return instance;
    L23:
        if (it$iv != Composer.Companion.getEmpty()) goto L27;
    L17:
        if (($changed & 6) == 4) goto L20;
        r10 = false;
        goto L20
    L11:
        $composer.startReplaceGroup(-303499670);
        ComposerKt.sourceInformation($composer, "197@9735L14");
        r2 = theme.mo1866defaultColorWaAFU9c($composer, 0);
        $composer.endReplaceGroup();
        goto L12
    L8:
        r1 = false;
        goto L9
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof Ripple) == true) goto L9;
        return false;
    L9:
        if (this.bounded == ((Ripple) other).bounded) goto L12;
        return false;
    L12:
        if (Dp.m6978equalsimpl0(this.radius, ((Ripple) other).radius) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.color, ((Ripple) other).color) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int result = Boolean.hashCode(this.bounded);
        int result2 = (result * 31) + Dp.m6979hashCodeimpl(this.radius);
        return (result2 * 31) + this.color.hashCode();
    }
}
