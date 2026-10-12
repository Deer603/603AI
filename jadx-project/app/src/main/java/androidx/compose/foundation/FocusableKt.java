package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\"\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"focusGroup", "Landroidx/compose/ui/Modifier;", "focusable", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusableKt {
    public static /* synthetic */ Modifier focusable$default(Modifier r0, boolean r1, MutableInteractionSource r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = true;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = null;
    L9:
        return focusable(r0, r1, r2);
    }

    public static final Modifier focusable(Modifier $this$focusable, boolean enabled, MutableInteractionSource interactionSource) {
        if (enabled == false) goto L4;
        Modifier.Companion r0 = new FocusableElement(interactionSource);
    L6:
        return $this$focusable.then(r0);
    L4:
        r0 = Modifier.Companion;
        goto L6
    }

    public static final Modifier focusGroup(Modifier $this$focusGroup) {
        return $this$focusGroup.then(FocusGroupElement.INSTANCE);
    }
}
