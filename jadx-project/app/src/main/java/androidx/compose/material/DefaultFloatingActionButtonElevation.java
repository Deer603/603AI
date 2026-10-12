package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/DefaultFloatingActionButtonElevation;", "Landroidx/compose/material/FloatingActionButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "hoveredElevation", "focusedElevation", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "elevation", "Landroidx/compose/runtime/State;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "", "other", "", "hashCode", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultFloatingActionButtonElevation implements FloatingActionButtonElevation {
    private final float defaultElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ DefaultFloatingActionButtonElevation(float r1, float r2, float r3, float r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
    }

    private DefaultFloatingActionButtonElevation(float defaultElevation, float pressedElevation, float hoveredElevation, float focusedElevation) {
        this.defaultElevation = defaultElevation;
        this.pressedElevation = pressedElevation;
        this.hoveredElevation = hoveredElevation;
        this.focusedElevation = focusedElevation;
    }

    public static final /* synthetic */ float access$getDefaultElevation$p(DefaultFloatingActionButtonElevation $this) {
        return $this.defaultElevation;
    }

    public static final /* synthetic */ float access$getFocusedElevation$p(DefaultFloatingActionButtonElevation $this) {
        return $this.focusedElevation;
    }

    public static final /* synthetic */ float access$getHoveredElevation$p(DefaultFloatingActionButtonElevation $this) {
        return $this.hoveredElevation;
    }

    public static final /* synthetic */ float access$getPressedElevation$p(DefaultFloatingActionButtonElevation $this) {
        return $this.pressedElevation;
    }

    @Override // androidx.compose.material.FloatingActionButtonElevation
    public State<Dp> elevation(InteractionSource interactionSource, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-478475335);
        ComposerKt.sourceInformation($composer, "C(elevation)261@11405L345,270@11781L276,270@11760L297,279@12101L1282,279@12067L1316:FloatingActionButton.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-478475335, $changed, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:259)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -1395510500, "CC(remember):FloatingActionButton.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(interactionSource) == false) goto L10;
    L11:
        boolean invalid$iv = true;
    L13:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L16;
    L19:
        Object value$iv = new FloatingActionButtonElevationAnimatable(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L20:
        FloatingActionButtonElevationAnimatable animatable = (FloatingActionButtonElevationAnimatable) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -1395498537, "CC(remember):FloatingActionButton.kt#9igjgp");
        boolean r4 = $composer.changedInstance(animatable);
        if ((($changed & 112) ^ 48) <= 32) goto L25;
        if ($composer.changed(this) == false) goto L25;
    L26:
        boolean r6 = true;
    L28:
        boolean invalid$iv2 = r4 | r6;
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L31;
    L34:
        Object value$iv2 = (Function2) new DefaultFloatingActionButtonElevation$elevation$1$1(animatable, this, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L35:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(this, (Function2) it$iv2, $composer, ($changed >> 3) & 14);
        ComposerKt.sourceInformationMarkerStart($composer, -1395487291, "CC(remember):FloatingActionButton.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L40;
        if ($composer.changed(interactionSource) == false) goto L40;
    L41:
        boolean r7 = true;
    L43:
        boolean invalid$iv3 = $composer.changedInstance(animatable) | r7;
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv3 == false) goto L46;
    L49:
        Object value$iv3 = (Function2) new DefaultFloatingActionButtonElevation$elevation$2$1(interactionSource, animatable, null);
        $composer.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L50:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(interactionSource, (Function2) it$iv3, $composer, $changed & 14);
        State<Dp> r5 = animatable.asState();
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventEnd();
    L53:
        $composer.endReplaceGroup();
        return r5;
    L46:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L50;
    L40:
        if (($changed & 6) == 4) goto L41;
        r7 = false;
        goto L43
    L31:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L35;
    L25:
        if (($changed & 48) == 32) goto L26;
        r6 = false;
        goto L28
    L16:
        if (it$iv != Composer.Companion.getEmpty()) goto L20;
    L10:
        if (($changed & 6) == 4) goto L11;
        invalid$iv = false;
        goto L13
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof DefaultFloatingActionButtonElevation) == true) goto L9;
        return false;
    L9:
        if (Dp.m6978equalsimpl0(this.defaultElevation, ((DefaultFloatingActionButtonElevation) other).defaultElevation) == true) goto L12;
        return false;
    L12:
        if (Dp.m6978equalsimpl0(this.pressedElevation, ((DefaultFloatingActionButtonElevation) other).pressedElevation) == true) goto L15;
        return false;
    L15:
        if (Dp.m6978equalsimpl0(this.hoveredElevation, ((DefaultFloatingActionButtonElevation) other).hoveredElevation) == true) goto L18;
        return false;
    L18:
        return Dp.m6978equalsimpl0(this.focusedElevation, ((DefaultFloatingActionButtonElevation) other).focusedElevation);
    }

    public int hashCode() {
        int result = Dp.m6979hashCodeimpl(this.defaultElevation);
        int result2 = (result * 31) + Dp.m6979hashCodeimpl(this.pressedElevation);
        return (((result2 * 31) + Dp.m6979hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m6979hashCodeimpl(this.focusedElevation);
    }
}
