package androidx.compose.ui.focus;

import kotlin.Metadata;

/* JADX INFO: compiled from: FocusOwnerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Warning", "", "is1dFocusSearch", "", "Landroidx/compose/ui/focus/FocusDirection;", "is1dFocusSearch-3ESFkO8", "(I)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusOwnerImplKt {
    private static final String Warning = "FocusRelatedWarning";

    /* JADX INFO: renamed from: is1dFocusSearch-3ESFkO8, reason: not valid java name */
    public static final boolean m4033is1dFocusSearch3ESFkO8(int $this$is1dFocusSearch_u2d3ESFkO8) {
        if (FocusDirection.m4009equalsimpl0($this$is1dFocusSearch_u2d3ESFkO8, FocusDirection.Companion.m4017getNextdhqQ8s()) == false) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L10;
        return false;
    L10:
        return true;
    L5:
        r0 = FocusDirection.m4009equalsimpl0($this$is1dFocusSearch_u2d3ESFkO8, FocusDirection.Companion.m4018getPreviousdhqQ8s());
        goto L6
    }
}
