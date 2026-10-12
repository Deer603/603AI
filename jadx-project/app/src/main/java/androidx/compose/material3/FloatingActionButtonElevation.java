package androidx.compose.material3;

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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u0003H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevation;", "", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "animateElevation", "Landroidx/compose/runtime/State;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "", "other", "hashCode", "", "shadowElevation", "shadowElevation$material3_release", "tonalElevation", "tonalElevation-D9Ej5fM$material3_release", "()F", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FloatingActionButtonElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    static {
    }

    public /* synthetic */ FloatingActionButtonElevation(float r1, float r2, float r3, float r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
    }

    private FloatingActionButtonElevation(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation) {
        this.defaultElevation = defaultElevation;
        this.pressedElevation = pressedElevation;
        this.focusedElevation = focusedElevation;
        this.hoveredElevation = hoveredElevation;
    }

    public static final /* synthetic */ float access$getDefaultElevation$p(FloatingActionButtonElevation $this) {
        return $this.defaultElevation;
    }

    public static final /* synthetic */ float access$getFocusedElevation$p(FloatingActionButtonElevation $this) {
        return $this.focusedElevation;
    }

    public static final /* synthetic */ float access$getHoveredElevation$p(FloatingActionButtonElevation $this) {
        return $this.hoveredElevation;
    }

    public static final /* synthetic */ float access$getPressedElevation$p(FloatingActionButtonElevation $this) {
        return $this.pressedElevation;
    }

    public final State<Dp> shadowElevation$material3_release(InteractionSource interactionSource, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -424810125, "C(shadowElevation)517@24051L55:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-424810125, $changed, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:516)");
    L5:
        State<Dp> r0 = animateElevation(interactionSource, $composer, ($changed & 14) | ($changed & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: tonalElevation-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m2247tonalElevationD9Ej5fM$material3_release() {
        return this.defaultElevation;
    }

    private final State<Dp> animateElevation(InteractionSource interactionSource, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1845106002, "C(animateElevation)527@24330L345,536@24706L276,536@24685L297,545@25026L1282,545@24992L1316:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1845106002, $changed, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:525)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1492982391, "CC(remember):FloatingActionButton.kt#9igjgp");
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
    L20:
        FloatingActionButtonElevationAnimatable animatable = (FloatingActionButtonElevationAnimatable) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 1492994354, "CC(remember):FloatingActionButton.kt#9igjgp");
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
        FloatingActionButtonElevation$animateElevation$1$1 value$iv2 = new FloatingActionButtonElevation$animateElevation$1$1(animatable, this, null);
        $composer.updateRememberedValue(value$iv2);
    L35:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(this, (Function2) value$iv2, $composer, ($changed >> 3) & 14);
        ComposerKt.sourceInformationMarkerStart($composer, 1493005600, "CC(remember):FloatingActionButton.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L40;
        if ($composer.changed(interactionSource) == false) goto L40;
    L41:
        boolean r7 = true;
    L43:
        boolean invalid$iv3 = $composer.changedInstance(animatable) | r7;
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv3 == false) goto L46;
    L49:
        FloatingActionButtonElevation$animateElevation$2$1 value$iv3 = new FloatingActionButtonElevation$animateElevation$2$1(interactionSource, animatable, null);
        $composer.updateRememberedValue(value$iv3);
    L50:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(interactionSource, (Function2) value$iv3, $composer, $changed & 14);
        State<Dp> r5 = animatable.asState();
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventEnd();
    L53:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L46:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L49;
        value$iv3 = it$iv3;
    L40:
        if (($changed & 6) == 4) goto L41;
        r7 = false;
        goto L43
    L31:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L34;
        value$iv2 = it$iv2;
    L25:
        if (($changed & 48) == 32) goto L26;
        r6 = false;
        goto L28
    L16:
        if (it$iv == Composer.Companion.getEmpty()) goto L19;
        value$iv = it$iv;
    L10:
        if (($changed & 6) == 4) goto L11;
        invalid$iv = false;
        goto L13
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L21:
        return false;
    L8:
        if ((other instanceof FloatingActionButtonElevation) == false) goto L21;
        if (Dp.m6978equalsimpl0(this.defaultElevation, ((FloatingActionButtonElevation) other).defaultElevation) == true) goto L14;
        return false;
    L14:
        if (Dp.m6978equalsimpl0(this.pressedElevation, ((FloatingActionButtonElevation) other).pressedElevation) == true) goto L17;
        return false;
    L17:
        if (Dp.m6978equalsimpl0(this.focusedElevation, ((FloatingActionButtonElevation) other).focusedElevation) == true) goto L20;
        return false;
    L20:
        return Dp.m6978equalsimpl0(this.hoveredElevation, ((FloatingActionButtonElevation) other).hoveredElevation);
    }

    public int hashCode() {
        int result = Dp.m6979hashCodeimpl(this.defaultElevation);
        int result2 = (result * 31) + Dp.m6979hashCodeimpl(this.pressedElevation);
        return (((result2 * 31) + Dp.m6979hashCodeimpl(this.focusedElevation)) * 31) + Dp.m6979hashCodeimpl(this.hoveredElevation);
    }
}
