package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "", "()V", "cachedX", "", "getCachedX", "()F", "setCachedX", "(F)V", "resetCachedX", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldPreparedSelectionState {
    public static final int $stable = 0;
    private float cachedX;

    static {
        $stable = 8;
    }

    public TextFieldPreparedSelectionState() {
        this.cachedX = Float.NaN;
    }

    public final float getCachedX() {
        return this.cachedX;
    }

    public final void setCachedX(float r1) {
        this.cachedX = r1;
    }

    public final void resetCachedX() {
        this.cachedX = Float.NaN;
    }
}
