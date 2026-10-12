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

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001e\u0010\u0018R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f²\u0006\f\u0010 \u001a\u0004\u0018\u00010!X\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/SelectableChipElevation;", "", "elevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDisabledElevation-D9Ej5fM", "()F", "F", "getDraggedElevation-D9Ej5fM", "getElevation-D9Ej5fM", "getFocusedElevation-D9Ej5fM", "getHoveredElevation-D9Ej5fM", "getPressedElevation-D9Ej5fM", "animateElevation", "Landroidx/compose/runtime/State;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "shadowElevation", "shadowElevation$material3_release", "material3_release", "lastInteraction", "Landroidx/compose/foundation/interaction/Interaction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SelectableChipElevation {
    public static final int $stable = 0;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float elevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    static {
    }

    public /* synthetic */ SelectableChipElevation(float r1, float r2, float r3, float r4, float r5, float r6, DefaultConstructorMarker r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    private SelectableChipElevation(float elevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation) {
        this.elevation = elevation;
        this.pressedElevation = pressedElevation;
        this.focusedElevation = focusedElevation;
        this.hoveredElevation = hoveredElevation;
        this.draggedElevation = draggedElevation;
        this.disabledElevation = disabledElevation;
    }

    public static final /* synthetic */ Interaction access$animateElevation$lambda$2(MutableState $lastInteraction$delegate) {
        return animateElevation$lambda$2($lastInteraction$delegate);
    }

    public static final /* synthetic */ void access$animateElevation$lambda$3(MutableState $lastInteraction$delegate, Interaction value) {
        animateElevation$lambda$3($lastInteraction$delegate, value);
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2593getElevationD9Ej5fM() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: getPressedElevation-D9Ej5fM, reason: not valid java name */
    public final float m2596getPressedElevationD9Ej5fM() {
        return this.pressedElevation;
    }

    /* JADX INFO: renamed from: getFocusedElevation-D9Ej5fM, reason: not valid java name */
    public final float m2594getFocusedElevationD9Ej5fM() {
        return this.focusedElevation;
    }

    /* JADX INFO: renamed from: getHoveredElevation-D9Ej5fM, reason: not valid java name */
    public final float m2595getHoveredElevationD9Ej5fM() {
        return this.hoveredElevation;
    }

    /* JADX INFO: renamed from: getDraggedElevation-D9Ej5fM, reason: not valid java name */
    public final float m2592getDraggedElevationD9Ej5fM() {
        return this.draggedElevation;
    }

    /* JADX INFO: renamed from: getDisabledElevation-D9Ej5fM, reason: not valid java name */
    public final float m2591getDisabledElevationD9Ej5fM() {
        return this.disabledElevation;
    }

    public final State<Dp> shadowElevation$material3_release(boolean enabled, InteractionSource interactionSource, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1888175651, "C(shadowElevation)2311@110081L74:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1888175651, $changed, -1, "androidx.compose.material3.SelectableChipElevation.shadowElevation (Chip.kt:2310)");
    L5:
        State<Dp> r0 = animateElevation(enabled, interactionSource, $composer, (($changed & 14) | ($changed & 112)) | ($changed & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    private final State<Dp> animateElevation(boolean enabled, InteractionSource interactionSource, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 664514136, "C(animateElevation)2319@110330L46,2320@110408L47,2321@110498L1473,2321@110464L1507,2373@112526L51,2375@112610L514,2375@112587L537:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(664514136, $changed, -1, "androidx.compose.material3.SelectableChipElevation.animateElevation (Chip.kt:2318)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -208085728, "CC(remember):Chip.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L8;
        Object value$iv = SnapshotStateKt.mutableStateListOf();
        $composer.updateRememberedValue(value$iv);
    L9:
        SnapshotStateList interactions = (SnapshotStateList) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -208083231, "CC(remember):Chip.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L12;
        Object value$iv2 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        $composer.updateRememberedValue(value$iv2);
    L13:
        MutableState lastInteraction$delegate = (MutableState) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -208078925, "CC(remember):Chip.kt#9igjgp");
        if ((($changed & 112) ^ 48) <= 32) goto L18;
        if ($composer.changed(interactionSource) == false) goto L18;
    L19:
        boolean invalid$iv = true;
    L21:
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv == false) goto L24;
    L27:
        SelectableChipElevation$animateElevation$1$1 value$iv3 = new SelectableChipElevation$animateElevation$1$1(interactionSource, interactions, null);
        $composer.updateRememberedValue(value$iv3);
    L28:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(interactionSource, (Function2) value$iv3, $composer, ($changed >> 3) & 14);
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull(interactions);
        if (enabled == true) goto L32;
        float target = this.disabledElevation;
    L44:
        ComposerKt.sourceInformationMarkerStart($composer, -208015451, "CC(remember):Chip.kt#9igjgp");
        Object it$iv4 = $composer.rememberedValue();
        if (it$iv4 != Composer.Companion.getEmpty()) goto L47;
        Object value$iv4 = new Animatable(Dp.m6971boximpl(target), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
        $composer.updateRememberedValue(value$iv4);
    L48:
        Animatable animatable = (Animatable) value$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Dp r12 = Dp.m6971boximpl(target);
        ComposerKt.sourceInformationMarkerStart($composer, -208012300, "CC(remember):Chip.kt#9igjgp");
        boolean r2 = $composer.changedInstance(animatable) | $composer.changed(target);
        if ((($changed & 14) ^ 6) <= 4) goto L53;
        if ($composer.changed(enabled) == false) goto L53;
    L54:
        boolean r17 = true;
    L56:
        boolean invalid$iv2 = (r2 | r17) | $composer.changedInstance(interaction);
        Object it$iv5 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L59;
    L62:
        Animatable animatable2 = animatable;
        SelectableChipElevation$animateElevation$2$1 value$iv5 = new SelectableChipElevation$animateElevation$2$1(animatable2, target, enabled, interaction, lastInteraction$delegate, null);
        $composer.updateRememberedValue(value$iv5);
    L63:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r12, (Function2) value$iv5, $composer, 0);
        State<Dp> r1 = animatable2.asState();
        if (ComposerKt.isTraceInProgress() == false) goto L66;
        ComposerKt.traceEventEnd();
    L66:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L59:
        if (it$iv5 == Composer.Companion.getEmpty()) goto L62;
        animatable2 = animatable;
        value$iv5 = it$iv5;
    L53:
        if (($changed & 6) == 4) goto L54;
        r17 = false;
        goto L56
    L47:
        value$iv4 = it$iv4;
        goto L48
    L32:
        if ((interaction instanceof PressInteraction.Press) == false) goto L35;
        target = this.pressedElevation;
        goto L44
    L35:
        if ((interaction instanceof HoverInteraction.Enter) == false) goto L38;
        target = this.hoveredElevation;
        goto L44
    L38:
        if ((interaction instanceof FocusInteraction.Focus) == false) goto L41;
        target = this.focusedElevation;
        goto L44
    L41:
        if ((interaction instanceof DragInteraction.Start) == false) goto L43;
        target = this.draggedElevation;
        goto L44
    L43:
        target = this.elevation;
        goto L44
    L24:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L27;
        value$iv3 = it$iv3;
    L18:
        if (($changed & 48) == 32) goto L19;
        invalid$iv = false;
        goto L21
    L12:
        value$iv2 = it$iv2;
        goto L13
    L8:
        value$iv = it$iv;
        goto L9
    }

    private static final Interaction animateElevation$lambda$2(MutableState<Interaction> r4) {
        MutableState<Interaction> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue();
    }

    private static final void animateElevation$lambda$3(MutableState<Interaction> r4, Interaction value) {
        r4.setValue(value);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L26:
        return false;
    L8:
        if ((other instanceof SelectableChipElevation) == false) goto L26;
        if (Dp.m6978equalsimpl0(this.elevation, ((SelectableChipElevation) other).elevation) == true) goto L14;
        return false;
    L14:
        if (Dp.m6978equalsimpl0(this.pressedElevation, ((SelectableChipElevation) other).pressedElevation) == true) goto L17;
        return false;
    L17:
        if (Dp.m6978equalsimpl0(this.focusedElevation, ((SelectableChipElevation) other).focusedElevation) == true) goto L20;
        return false;
    L20:
        if (Dp.m6978equalsimpl0(this.hoveredElevation, ((SelectableChipElevation) other).hoveredElevation) == true) goto L23;
        return false;
    L23:
        if (Dp.m6978equalsimpl0(this.disabledElevation, ((SelectableChipElevation) other).disabledElevation) == true) goto L25;
        return false;
    L25:
        return true;
    }

    public int hashCode() {
        int result = Dp.m6979hashCodeimpl(this.elevation);
        int result2 = (result * 31) + Dp.m6979hashCodeimpl(this.pressedElevation);
        return (((((result2 * 31) + Dp.m6979hashCodeimpl(this.focusedElevation)) * 31) + Dp.m6979hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m6979hashCodeimpl(this.disabledElevation);
    }
}
