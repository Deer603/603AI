package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "requestedFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "", "isCanceled", "()Z", "getRequestedFocusDirection-dhqQ-8s", "()I", "I", "cancelFocusChange", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CancelIndicatingFocusBoundaryScope implements FocusEnterExitScope {
    public static final int $stable = 0;
    private boolean isCanceled;
    private final int requestedFocusDirection;

    static {
        $stable = 8;
    }

    public /* synthetic */ CancelIndicatingFocusBoundaryScope(int r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    private CancelIndicatingFocusBoundaryScope(int requestedFocusDirection) {
        this.requestedFocusDirection = requestedFocusDirection;
    }

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    /* JADX INFO: renamed from: getRequestedFocusDirection-dhqQ-8s, reason: not valid java name */
    public int mo4005getRequestedFocusDirectiondhqQ8s() {
        return this.requestedFocusDirection;
    }

    public final boolean isCanceled() {
        return this.isCanceled;
    }

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    public void cancelFocusChange() {
        this.isCanceled = true;
    }
}
