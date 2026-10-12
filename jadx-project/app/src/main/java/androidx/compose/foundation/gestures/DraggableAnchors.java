package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ\u001f\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\fH&J\b\u0010\u0015\u001a\u00020\fH&J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004H&J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0018R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableAnchors;", "T", "", "size", "", "getSize", "()I", "anchorAt", "index", "(I)Ljava/lang/Object;", "closestAnchor", "position", "", "(F)Ljava/lang/Object;", "searchUpwards", "", "(FZ)Ljava/lang/Object;", "hasPositionFor", "anchor", "(Ljava/lang/Object;)Z", "maxPosition", "minPosition", "positionAt", "positionOf", "(Ljava/lang/Object;)F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DraggableAnchors<T> {
    T anchorAt(int r1);

    T closestAnchor(float r1);

    T closestAnchor(float r1, boolean r2);

    int getSize();

    boolean hasPositionFor(T r1);

    float maxPosition();

    float minPosition();

    float positionAt(int r1);

    float positionOf(T r1);
}
