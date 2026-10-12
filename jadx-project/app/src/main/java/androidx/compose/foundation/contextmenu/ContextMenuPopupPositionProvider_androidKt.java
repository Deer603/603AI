package androidx.compose.foundation.contextmenu;

import kotlin.Metadata;

/* JADX INFO: compiled from: ContextMenuPopupPositionProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001\u001a \u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\r"}, d2 = {"alignEndEdges", "", "popupLength", "windowLength", "closeAffinity", "", "alignPopupAxis", "position", "alignPopupEndEdgeToPosition", "alignPopupStartEdgeToPosition", "alignStartEdges", "popupFitsBetweenPositionAndEndEdge", "popupFitsBetweenPositionAndStartEdge", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContextMenuPopupPositionProvider_androidKt {
    public static /* synthetic */ int alignPopupAxis$default(int r0, int r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 8) == 0) goto L6;
        r3 = true;
    L6:
        return alignPopupAxis(r0, r1, r2, r3);
    }

    public static final int alignPopupAxis(int position, int popupLength, int windowLength, boolean closeAffinity) {
        if (popupLength < windowLength) goto L5;
        return alignStartEdges(popupLength, windowLength, closeAffinity);
    L5:
        if (popupFitsBetweenPositionAndEndEdge(position, popupLength, windowLength, closeAffinity) == false) goto L8;
        return alignPopupStartEdgeToPosition(position, popupLength, closeAffinity);
    L8:
        if (popupFitsBetweenPositionAndStartEdge(position, popupLength, windowLength, closeAffinity) == false) goto L11;
        return alignPopupEndEdgeToPosition(position, popupLength, closeAffinity);
    L11:
        return alignEndEdges(popupLength, windowLength, closeAffinity);
    }

    private static final boolean popupFitsBetweenPositionAndStartEdge(int position, int popupLength, int windowLength, boolean closeAffinity) {
        if (closeAffinity == false) goto L8;
        if (popupLength > position) goto L12;
        return true;
    L12:
        return false;
    L8:
        if ((windowLength - popupLength) <= position) goto L11;
        return true;
    L11:
        return false;
    }

    private static final boolean popupFitsBetweenPositionAndEndEdge(int position, int popupLength, int windowLength, boolean closeAffinity) {
        return popupFitsBetweenPositionAndStartEdge(position, popupLength, windowLength, !closeAffinity);
    }

    private static final int alignPopupStartEdgeToPosition(int position, int popupLength, boolean closeAffinity) {
        if (closeAffinity == false) goto L5;
        return position;
    L5:
        return position - popupLength;
    }

    private static final int alignPopupEndEdgeToPosition(int position, int popupLength, boolean closeAffinity) {
        return alignPopupStartEdgeToPosition(position, popupLength, !closeAffinity);
    }

    private static final int alignStartEdges(int popupLength, int windowLength, boolean closeAffinity) {
        if (closeAffinity == false) goto L5;
        return 0;
    L5:
        return windowLength - popupLength;
    }

    private static final int alignEndEdges(int popupLength, int windowLength, boolean closeAffinity) {
        return alignStartEdges(popupLength, windowLength, !closeAffinity);
    }
}
