package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Toggleable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0002\b\u000e\u001aD\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0002\b\u000f\u001aR\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014ø\u0001\u0000¢\u0006\u0002\b\u0015\u001a>\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014ø\u0001\u0000¢\u0006\u0002\b\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"toggleable", "Landroidx/compose/ui/Modifier;", "value", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "role", "Landroidx/compose/ui/semantics/Role;", "onValueChange", "Lkotlin/Function1;", "", "toggleable-O2vRcR0", "toggleable-XHw0xAI", "triStateToggleable", "state", "Landroidx/compose/ui/state/ToggleableState;", "onClick", "Lkotlin/Function0;", "triStateToggleable-O2vRcR0", "triStateToggleable-XHw0xAI", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ToggleableKt {
    /* JADX INFO: renamed from: toggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m994toggleableXHw0xAI$default(Modifier r0, boolean r1, boolean r2, Role r3, Function1 r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = true;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = null;
    L9:
        return m993toggleableXHw0xAI(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: toggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m993toggleableXHw0xAI(Modifier $this$toggleable_u2dXHw0xAI, final boolean value, final boolean enabled, final Role role, final Function1<? super Boolean, Unit> r6) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1(value, enabled, role, r6);
    L7:
        return ComposedModifierKt.composed($this$toggleable_u2dXHw0xAI, r1, new ToggleableKt$toggleable$2(value, enabled, role, r6));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: toggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m992toggleableO2vRcR0$default(Modifier r7, boolean r8, MutableInteractionSource r9, Indication r10, boolean r11, Role r12, Function1 r13, int r14, Object r15) {
        if ((r14 & 8) == 0) goto L5;
        boolean r4 = true;
    L7:
        if ((r14 & 16) == 0) goto L9;
        Role r5 = null;
    L11:
        return m991toggleableO2vRcR0(r7, r8, r9, r10, r4, r5, r13);
    L9:
        r5 = r12;
        goto L11
    L5:
        r4 = r11;
        goto L7
    }

    /* JADX INFO: renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m991toggleableO2vRcR0(Modifier $this$toggleable_u2dO2vRcR0, final boolean value, MutableInteractionSource interactionSource, final Indication indication, final boolean enabled, final Role role, final Function1<? super Boolean, Unit> r30) {
        if ((indication instanceof IndicationNodeFactory) == false) goto L5;
        IndicationNodeFactory indicationNodeFactory = (IndicationNodeFactory) indication;
        ToggleableElement r8 = new ToggleableElement(value, interactionSource, indicationNodeFactory, enabled, role, r30, null);
    L11:
        return $this$toggleable_u2dO2vRcR0.then(r8);
    L5:
        if (indication != null) goto L7;
        r8 = new ToggleableElement(value, interactionSource, null, enabled, role, r30, null);
        goto L11
    L7:
        if (interactionSource == null) goto L9;
        r8 = IndicationKt.indication(Modifier.Companion, interactionSource, indication).then(new ToggleableElement(value, interactionSource, null, enabled, role, r30, null));
        goto L11
    L9:
        r8 = ComposedModifierKt.composed$default(Modifier.Companion, null, new ToggleableKt$toggleableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(indication, value, enabled, role, r30), 1, null);
        goto L11
    }

    /* JADX INFO: renamed from: triStateToggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m998triStateToggleableXHw0xAI$default(Modifier r0, ToggleableState r1, boolean r2, Role r3, Function0 r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = true;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = null;
    L9:
        return m997triStateToggleableXHw0xAI(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m997triStateToggleableXHw0xAI(Modifier $this$triStateToggleable_u2dXHw0xAI, final ToggleableState state, final boolean enabled, final Role role, final Function0<Unit> r6) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new ToggleableKt$triStateToggleableXHw0xAI$$inlined$debugInspectorInfo$1(state, enabled, role, r6);
    L7:
        return ComposedModifierKt.composed($this$triStateToggleable_u2dXHw0xAI, r1, new ToggleableKt$triStateToggleable$2(state, enabled, role, r6));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: triStateToggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m996triStateToggleableO2vRcR0$default(Modifier r7, ToggleableState r8, MutableInteractionSource r9, Indication r10, boolean r11, Role r12, Function0 r13, int r14, Object r15) {
        if ((r14 & 8) == 0) goto L5;
        boolean r4 = true;
    L7:
        if ((r14 & 16) == 0) goto L9;
        Role r5 = null;
    L11:
        return m995triStateToggleableO2vRcR0(r7, r8, r9, r10, r4, r5, r13);
    L9:
        r5 = r12;
        goto L11
    L5:
        r4 = r11;
        goto L7
    }

    /* JADX INFO: renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m995triStateToggleableO2vRcR0(Modifier $this$triStateToggleable_u2dO2vRcR0, final ToggleableState state, MutableInteractionSource interactionSource, final Indication indication, final boolean enabled, final Role role, final Function0<Unit> r30) {
        if ((indication instanceof IndicationNodeFactory) == false) goto L5;
        IndicationNodeFactory indicationNodeFactory = (IndicationNodeFactory) indication;
        TriStateToggleableElement r8 = new TriStateToggleableElement(state, interactionSource, indicationNodeFactory, enabled, role, r30, null);
    L11:
        return $this$triStateToggleable_u2dO2vRcR0.then(r8);
    L5:
        if (indication != null) goto L7;
        r8 = new TriStateToggleableElement(state, interactionSource, null, enabled, role, r30, null);
        goto L11
    L7:
        if (interactionSource == null) goto L9;
        r8 = IndicationKt.indication(Modifier.Companion, interactionSource, indication).then(new TriStateToggleableElement(state, interactionSource, null, enabled, role, r30, null));
        goto L11
    L9:
        r8 = ComposedModifierKt.composed$default(Modifier.Companion, null, new ToggleableKt$triStateToggleableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(indication, state, enabled, role, r30), 1, null);
        goto L11
    }
}
