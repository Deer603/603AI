package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/ButtonElevation;", "", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "animateElevation", "Landroidx/compose/runtime/State;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "shadowElevation", "shadowElevation$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ButtonElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    static {
    }

    public /* synthetic */ ButtonElevation(float r1, float r2, float r3, float r4, float r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    private ButtonElevation(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation, float disabledElevation) {
        this.defaultElevation = defaultElevation;
        this.pressedElevation = pressedElevation;
        this.focusedElevation = focusedElevation;
        this.hoveredElevation = hoveredElevation;
        this.disabledElevation = disabledElevation;
    }

    public static final /* synthetic */ float access$getFocusedElevation$p(ButtonElevation $this) {
        return $this.focusedElevation;
    }

    public static final /* synthetic */ float access$getHoveredElevation$p(ButtonElevation $this) {
        return $this.hoveredElevation;
    }

    public static final /* synthetic */ float access$getPressedElevation$p(ButtonElevation $this) {
        return $this.pressedElevation;
    }

    public final State<Dp> shadowElevation$material3_release(boolean enabled, InteractionSource interactionSource, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -2045116089, "C(shadowElevation)931@43193L74:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2045116089, $changed, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:930)");
    L5:
        State<Dp> r0 = animateElevation(enabled, interactionSource, $composer, (($changed & 14) | ($changed & 112)) | ($changed & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    private final State<Dp> animateElevation(boolean enabled, InteractionSource interactionSource, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1312510462, "C(animateElevation)939@43442L46,940@43531L1077,940@43497L1111,982@45105L51,984@45189L863,984@45166L886:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1312510462, $changed, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:938)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -842871664, "CC(remember):Button.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L8;
        Object value$iv = SnapshotStateKt.mutableStateListOf();
        $composer.updateRememberedValue(value$iv);
    L9:
        SnapshotStateList interactions = (SnapshotStateList) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -842867785, "CC(remember):Button.kt#9igjgp");
        if ((($changed & 112) ^ 48) <= 32) goto L14;
        if ($composer.changed(interactionSource) == false) goto L14;
    L15:
        boolean invalid$iv = true;
    L17:
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L20;
    L23:
        ButtonElevation$animateElevation$1$1 value$iv2 = new ButtonElevation$animateElevation$1$1(interactionSource, interactions, null);
        $composer.updateRememberedValue(value$iv2);
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(interactionSource, (Function2) value$iv2, $composer, ($changed >> 3) & 14);
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull(interactions);
        if (enabled == true) goto L28;
        float target = this.disabledElevation;
    L37:
        ComposerKt.sourceInformationMarkerStart($composer, -842818443, "CC(remember):Button.kt#9igjgp");
        Object it$iv3 = $composer.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L40;
        Object value$iv3 = new Animatable(Dp.m6971boximpl(target), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
        $composer.updateRememberedValue(value$iv3);
    L41:
        Animatable animatable = (Animatable) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Dp r12 = Dp.m6971boximpl(target);
        ComposerKt.sourceInformationMarkerStart($composer, -842814943, "CC(remember):Button.kt#9igjgp");
        boolean r1 = $composer.changedInstance(animatable) | $composer.changed(target);
        if ((($changed & 14) ^ 6) <= 4) goto L46;
        if ($composer.changed(enabled) == false) goto L46;
    L47:
        boolean r6 = true;
    L49:
        boolean r2 = r1 | r6;
        if ((($changed & 896) ^ 384) <= 256) goto L54;
        if ($composer.changed(this) == false) goto L54;
    L55:
        boolean r16 = true;
    L57:
        boolean invalid$iv2 = (r2 | r16) | $composer.changedInstance(interaction);
        Object it$iv4 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L60;
    L63:
        Animatable animatable2 = animatable;
        ButtonElevation$animateElevation$2$1 value$iv4 = new ButtonElevation$animateElevation$2$1(animatable2, target, enabled, this, interaction, null);
        $composer.updateRememberedValue(value$iv4);
    L64:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r12, (Function2) value$iv4, $composer, 0);
        State<Dp> r0 = animatable2.asState();
        if (ComposerKt.isTraceInProgress() == false) goto L67;
        ComposerKt.traceEventEnd();
    L67:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L60:
        if (it$iv4 == Composer.Companion.getEmpty()) goto L63;
        animatable2 = animatable;
        value$iv4 = it$iv4;
    L54:
        if (($changed & 384) == 256) goto L55;
        r16 = false;
    L46:
        if (($changed & 6) == 4) goto L47;
        r6 = false;
        goto L49
    L40:
        value$iv3 = it$iv3;
        goto L41
    L28:
        if ((interaction instanceof PressInteraction.Press) == false) goto L31;
        target = this.pressedElevation;
        goto L37
    L31:
        if ((interaction instanceof HoverInteraction.Enter) == false) goto L34;
        target = this.hoveredElevation;
        goto L37
    L34:
        if ((interaction instanceof FocusInteraction.Focus) == false) goto L36;
        target = this.focusedElevation;
        goto L37
    L36:
        target = this.defaultElevation;
        goto L37
    L20:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L23;
        value$iv2 = it$iv2;
    L14:
        if (($changed & 48) == 32) goto L15;
        invalid$iv = false;
        goto L17
    L8:
        value$iv = it$iv;
        goto L9
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L26:
        return false;
    L8:
        if ((other instanceof ButtonElevation) == false) goto L26;
        if (Dp.m6978equalsimpl0(this.defaultElevation, ((ButtonElevation) other).defaultElevation) == true) goto L14;
        return false;
    L14:
        if (Dp.m6978equalsimpl0(this.pressedElevation, ((ButtonElevation) other).pressedElevation) == true) goto L17;
        return false;
    L17:
        if (Dp.m6978equalsimpl0(this.focusedElevation, ((ButtonElevation) other).focusedElevation) == true) goto L20;
        return false;
    L20:
        if (Dp.m6978equalsimpl0(this.hoveredElevation, ((ButtonElevation) other).hoveredElevation) == true) goto L23;
        return false;
    L23:
        if (Dp.m6978equalsimpl0(this.disabledElevation, ((ButtonElevation) other).disabledElevation) == true) goto L25;
        return false;
    L25:
        return true;
    }

    public int hashCode() {
        int result = Dp.m6979hashCodeimpl(this.defaultElevation);
        int result2 = (result * 31) + Dp.m6979hashCodeimpl(this.pressedElevation);
        return (((((result2 * 31) + Dp.m6979hashCodeimpl(this.focusedElevation)) * 31) + Dp.m6979hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m6979hashCodeimpl(this.disabledElevation);
    }
}
