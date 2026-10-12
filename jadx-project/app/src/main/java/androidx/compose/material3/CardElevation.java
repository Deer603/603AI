package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0017\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/CardElevation;", "", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "animateElevation", "Landroidx/compose/runtime/State;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "shadowElevation", "shadowElevation$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    static {
    }

    public /* synthetic */ CardElevation(float r1, float r2, float r3, float r4, float r5, float r6, DefaultConstructorMarker r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    private CardElevation(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation) {
        this.defaultElevation = defaultElevation;
        this.pressedElevation = pressedElevation;
        this.focusedElevation = focusedElevation;
        this.hoveredElevation = hoveredElevation;
        this.draggedElevation = draggedElevation;
        this.disabledElevation = disabledElevation;
    }

    public static final /* synthetic */ float access$getDraggedElevation$p(CardElevation $this) {
        return $this.draggedElevation;
    }

    public static final /* synthetic */ float access$getFocusedElevation$p(CardElevation $this) {
        return $this.focusedElevation;
    }

    public static final /* synthetic */ float access$getHoveredElevation$p(CardElevation $this) {
        return $this.hoveredElevation;
    }

    public static final /* synthetic */ float access$getPressedElevation$p(CardElevation $this) {
        return $this.pressedElevation;
    }

    public final State<Dp> shadowElevation$material3_release(boolean enabled, InteractionSource interactionSource, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1763481333);
        ComposerKt.sourceInformation($composer, "C(shadowElevation)663@29753L74:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1763481333, $changed, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:659)");
    L5:
        $composer.startReplaceGroup(-734838460);
        ComposerKt.sourceInformation($composer, "661@29682L45");
        if (interactionSource != null) goto L16;
        ComposerKt.sourceInformationMarkerStart($composer, -734836858, "CC(remember):Card.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L10;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(Dp.m6971boximpl(this.defaultElevation), null, 2, null);
        $composer.updateRememberedValue(value$iv);
    L11:
        MutableState r5 = (MutableState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventEnd();
    L14:
        $composer.endReplaceGroup();
        return r5;
    L10:
        value$iv = it$iv;
        goto L11
    L16:
        $composer.endReplaceGroup();
        State<Dp> r0 = animateElevation(enabled, interactionSource, $composer, (($changed & 14) | ($changed & 112)) | ($changed & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        $composer.endReplaceGroup();
        return r0;
    }

    private final State<Dp> animateElevation(boolean enabled, InteractionSource interactionSource, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1421890746, "C(animateElevation)671@30002L46,672@30091L1473,672@30057L1507,724@32126L51,726@32210L936,726@32187L959:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1421890746, $changed, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:670)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -1719589842, "CC(remember):Card.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L8;
        Object value$iv = SnapshotStateKt.mutableStateListOf();
        $composer.updateRememberedValue(value$iv);
    L9:
        SnapshotStateList interactions = (SnapshotStateList) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -1719585567, "CC(remember):Card.kt#9igjgp");
        if ((($changed & 112) ^ 48) <= 32) goto L14;
        if ($composer.changed(interactionSource) == false) goto L14;
    L15:
        boolean invalid$iv = true;
    L17:
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L20;
    L23:
        CardElevation$animateElevation$1$1 value$iv2 = new CardElevation$animateElevation$1$1(interactionSource, interactions, null);
        $composer.updateRememberedValue(value$iv2);
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(interactionSource, (Function2) value$iv2, $composer, ($changed >> 3) & 14);
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull(interactions);
        if (enabled == true) goto L28;
        float target = this.disabledElevation;
    L40:
        ComposerKt.sourceInformationMarkerStart($composer, -1719521869, "CC(remember):Card.kt#9igjgp");
        Object it$iv3 = $composer.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L43;
        Object value$iv3 = new Animatable(Dp.m6971boximpl(target), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
        $composer.updateRememberedValue(value$iv3);
    L44:
        Animatable animatable = (Animatable) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Dp r12 = Dp.m6971boximpl(target);
        ComposerKt.sourceInformationMarkerStart($composer, -1719518296, "CC(remember):Card.kt#9igjgp");
        boolean r1 = $composer.changedInstance(animatable) | $composer.changed(target);
        if ((($changed & 14) ^ 6) <= 4) goto L49;
        if ($composer.changed(enabled) == false) goto L49;
    L50:
        boolean r6 = true;
    L52:
        boolean r2 = r1 | r6;
        if ((($changed & 896) ^ 384) <= 256) goto L57;
        if ($composer.changed(this) == false) goto L57;
    L58:
        boolean r16 = true;
    L60:
        boolean invalid$iv2 = (r2 | r16) | $composer.changedInstance(interaction);
        Object it$iv4 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L63;
    L66:
        Animatable animatable2 = animatable;
        CardElevation$animateElevation$2$1 value$iv4 = new CardElevation$animateElevation$2$1(animatable2, target, enabled, this, interaction, null);
        $composer.updateRememberedValue(value$iv4);
    L67:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r12, (Function2) value$iv4, $composer, 0);
        State<Dp> r0 = animatable2.asState();
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventEnd();
    L70:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L63:
        if (it$iv4 == Composer.Companion.getEmpty()) goto L66;
        animatable2 = animatable;
        value$iv4 = it$iv4;
    L57:
        if (($changed & 384) == 256) goto L58;
        r16 = false;
    L49:
        if (($changed & 6) == 4) goto L50;
        r6 = false;
        goto L52
    L43:
        value$iv3 = it$iv3;
        goto L44
    L28:
        if ((interaction instanceof PressInteraction.Press) == false) goto L31;
        target = this.pressedElevation;
        goto L40
    L31:
        if ((interaction instanceof HoverInteraction.Enter) == false) goto L34;
        target = this.hoveredElevation;
        goto L40
    L34:
        if ((interaction instanceof FocusInteraction.Focus) == false) goto L37;
        target = this.focusedElevation;
        goto L40
    L37:
        if ((interaction instanceof DragInteraction.Start) == false) goto L39;
        target = this.draggedElevation;
        goto L40
    L39:
        target = this.defaultElevation;
        goto L40
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
        if ((other instanceof CardElevation) == false) goto L26;
        if (Dp.m6978equalsimpl0(this.defaultElevation, ((CardElevation) other).defaultElevation) == true) goto L14;
        return false;
    L14:
        if (Dp.m6978equalsimpl0(this.pressedElevation, ((CardElevation) other).pressedElevation) == true) goto L17;
        return false;
    L17:
        if (Dp.m6978equalsimpl0(this.focusedElevation, ((CardElevation) other).focusedElevation) == true) goto L20;
        return false;
    L20:
        if (Dp.m6978equalsimpl0(this.hoveredElevation, ((CardElevation) other).hoveredElevation) == true) goto L23;
        return false;
    L23:
        if (Dp.m6978equalsimpl0(this.disabledElevation, ((CardElevation) other).disabledElevation) == true) goto L25;
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
