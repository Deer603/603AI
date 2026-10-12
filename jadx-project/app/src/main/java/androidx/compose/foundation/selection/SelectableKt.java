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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Selectable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aR\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0002\b\u000e\u001a>\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0002\b\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"selectable", "Landroidx/compose/ui/Modifier;", "selected", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "selectable-O2vRcR0", "selectable-XHw0xAI", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectableKt {
    /* JADX INFO: renamed from: selectable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m989selectableXHw0xAI$default(Modifier r0, boolean r1, boolean r2, Role r3, Function0 r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = true;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = null;
    L9:
        return m988selectableXHw0xAI(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: selectable-XHw0xAI, reason: not valid java name */
    public static final Modifier m988selectableXHw0xAI(Modifier $this$selectable_u2dXHw0xAI, final boolean selected, final boolean enabled, final Role role, final Function0<Unit> r6) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new SelectableKt$selectableXHw0xAI$$inlined$debugInspectorInfo$1(selected, enabled, role, r6);
    L7:
        return ComposedModifierKt.composed($this$selectable_u2dXHw0xAI, r1, new SelectableKt$selectable$2(selected, enabled, role, r6));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: selectable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m987selectableO2vRcR0$default(Modifier r7, boolean r8, MutableInteractionSource r9, Indication r10, boolean r11, Role r12, Function0 r13, int r14, Object r15) {
        if ((r14 & 8) == 0) goto L5;
        boolean r4 = true;
    L7:
        if ((r14 & 16) == 0) goto L9;
        Role r5 = null;
    L11:
        return m986selectableO2vRcR0(r7, r8, r9, r10, r4, r5, r13);
    L9:
        r5 = r12;
        goto L11
    L5:
        r4 = r11;
        goto L7
    }

    /* JADX INFO: renamed from: selectable-O2vRcR0, reason: not valid java name */
    public static final Modifier m986selectableO2vRcR0(Modifier $this$selectable_u2dO2vRcR0, final boolean selected, MutableInteractionSource interactionSource, final Indication indication, final boolean enabled, final Role role, final Function0<Unit> r30) {
        if ((indication instanceof IndicationNodeFactory) == false) goto L5;
        IndicationNodeFactory indicationNodeFactory = (IndicationNodeFactory) indication;
        SelectableElement r8 = new SelectableElement(selected, interactionSource, indicationNodeFactory, enabled, role, r30, null);
    L11:
        return $this$selectable_u2dO2vRcR0.then(r8);
    L5:
        if (indication != null) goto L7;
        r8 = new SelectableElement(selected, interactionSource, null, enabled, role, r30, null);
        goto L11
    L7:
        if (interactionSource == null) goto L9;
        r8 = IndicationKt.indication(Modifier.Companion, interactionSource, indication).then(new SelectableElement(selected, interactionSource, null, enabled, role, r30, null));
        goto L11
    L9:
        r8 = ComposedModifierKt.composed$default(Modifier.Companion, null, new SelectableKt$selectableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(indication, selected, enabled, role, r30), 1, null);
        goto L11
    }
}
