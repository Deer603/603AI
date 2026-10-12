package androidx.compose.material;

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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/material/DefaultButtonElevation;", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "elevation", "Landroidx/compose/runtime/State;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultButtonElevation implements ButtonElevation {
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ DefaultButtonElevation(float r1, float r2, float r3, float r4, float r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    private DefaultButtonElevation(float defaultElevation, float pressedElevation, float disabledElevation, float hoveredElevation, float focusedElevation) {
        this.defaultElevation = defaultElevation;
        this.pressedElevation = pressedElevation;
        this.disabledElevation = disabledElevation;
        this.hoveredElevation = hoveredElevation;
        this.focusedElevation = focusedElevation;
    }

    public static final /* synthetic */ float access$getFocusedElevation$p(DefaultButtonElevation $this) {
        return $this.focusedElevation;
    }

    public static final /* synthetic */ float access$getHoveredElevation$p(DefaultButtonElevation $this) {
        return $this.hoveredElevation;
    }

    public static final /* synthetic */ float access$getPressedElevation$p(DefaultButtonElevation $this) {
        return $this.pressedElevation;
    }

    @Override // androidx.compose.material.ButtonElevation
    public State<Dp> elevation(boolean enabled, InteractionSource interactionSource, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1588756907);
        ComposerKt.sourceInformation($composer, "C(elevation)504@21072L46,505@21161L1077,505@21127L1111,547@22735L51,549@22819L863,549@22796L886:Button.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1588756907, $changed, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:503)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1976563341, "CC(remember):Button.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = SnapshotStateKt.mutableStateListOf();
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        SnapshotStateList interactions = (SnapshotStateList) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 1976567220, "CC(remember):Button.kt#9igjgp");
        if ((($changed & 112) ^ 48) <= 32) goto L14;
        if ($composer.changed(interactionSource) == false) goto L14;
    L15:
        boolean invalid$iv = true;
    L17:
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L20;
    L23:
        Object value$iv2 = (Function2) new DefaultButtonElevation$elevation$1$1(interactionSource, interactions, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(interactionSource, (Function2) it$iv2, $composer, ($changed >> 3) & 14);
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull(interactions);
        if (enabled == true) goto L28;
        float target = this.disabledElevation;
    L37:
        ComposerKt.sourceInformationMarkerStart($composer, 1976616562, "CC(remember):Button.kt#9igjgp");
        Object it$iv3 = $composer.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L41;
        Object value$iv3 = new Animatable(Dp.m6971boximpl(target), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
        $composer.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L41:
        Animatable animatable = (Animatable) it$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Dp r12 = Dp.m6971boximpl(target);
        ComposerKt.sourceInformationMarkerStart($composer, 1976620062, "CC(remember):Button.kt#9igjgp");
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
        DefaultButtonElevation$elevation$2$1 value$iv4 = new DefaultButtonElevation$elevation$2$1(animatable2, target, enabled, this, interaction, null);
        $composer.updateRememberedValue(value$iv4);
    L64:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r12, (Function2) value$iv4, $composer, 0);
        State<Dp> r0 = animatable2.asState();
        if (ComposerKt.isTraceInProgress() == false) goto L67;
        ComposerKt.traceEventEnd();
    L67:
        $composer.endReplaceGroup();
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
        if (it$iv2 != Composer.Companion.getEmpty()) goto L24;
    L14:
        if (($changed & 48) == 32) goto L15;
        invalid$iv = false;
        goto L17
    }
}
