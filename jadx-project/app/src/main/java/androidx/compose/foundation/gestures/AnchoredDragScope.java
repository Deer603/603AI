package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDragScope;", "", "dragTo", "", "newOffset", "", "lastKnownVelocity", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AnchoredDragScope {
    void dragTo(float r1, float r2);

    static /* synthetic */ void dragTo$default(AnchoredDragScope r0, float r1, float r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = 0.0f;
    L6:
        r0.dragTo(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
    }
}
