package androidx.compose.material;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\rJ\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Landroidx/compose/material/MapDraggableAnchors;", "T", "Landroidx/compose/material/DraggableAnchors;", "anchors", "", "", "(Ljava/util/Map;)V", "size", "", "getSize", "()I", "closestAnchor", "position", "(F)Ljava/lang/Object;", "searchUpwards", "", "(FZ)Ljava/lang/Object;", "equals", "other", "", "hasAnchorFor", "value", "(Ljava/lang/Object;)Z", "hashCode", "maxAnchor", "minAnchor", "positionOf", "(Ljava/lang/Object;)F", "toString", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MapDraggableAnchors<T> implements DraggableAnchors<T> {
    private final Map<T, Float> anchors;

    public MapDraggableAnchors(Map<T, Float> r1) {
        this.anchors = r1;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public float positionOf(T r2) {
        Float r0 = this.anchors.get(r2);
        if (r0 != null) goto L7;
        return Float.NaN;
    L7:
        return r0.floatValue();
    }

    @Override // androidx.compose.material.DraggableAnchors
    public boolean hasAnchorFor(T r2) {
        return this.anchors.containsKey(r2);
    }

    @Override // androidx.compose.material.DraggableAnchors
    public T closestAnchor(float r9) {
        Iterator<T> r0 = this.anchors.entrySet().iterator();
        if (r0.hasNext() == true) goto L5;
        T r1 = null;
    L15:
        Map.Entry r2 = (Map.Entry) r1;
        if (r2 != null) goto L18;
        return null;
    L18:
        return (T) r2.getKey();
    L5:
        r1 = r0.next();
        if (r0.hasNext() == false) goto L15;
        float r5 = Math.abs(r9 - ((Number) ((Map.Entry) r1).getValue()).floatValue());
    L9:
        T r3 = r0.next();
        float r7 = Math.abs(r9 - ((Number) ((Map.Entry) r3).getValue()).floatValue());
        if (Float.compare(r5, r7) <= 0) goto L13;
        r1 = r3;
        r5 = r7;
    L13:
        if (r0.hasNext() == true) goto L9;
        goto L15
    }

    @Override // androidx.compose.material.DraggableAnchors
    public T closestAnchor(float r12, boolean r13) {
        Iterator<T> r0 = this.anchors.entrySet().iterator();
        if (r0.hasNext() == true) goto L5;
        T r1 = null;
    L28:
        Map.Entry r2 = (Map.Entry) r1;
        if (r2 != null) goto L31;
        return null;
    L31:
        return (T) r2.getKey();
    L5:
        r1 = r0.next();
        if (r0.hasNext() == false) goto L28;
        float r3 = ((Number) ((Map.Entry) r1).getValue()).floatValue();
        if (r13 == false) goto L11;
        float r5 = r3 - r12;
    L13:
        if (r5 >= 0.0f) goto L15;
        r5 = Float.POSITIVE_INFINITY;
    L15:
        T r4 = r0.next();
        float r6 = ((Number) ((Map.Entry) r4).getValue()).floatValue();
        if (r13 == false) goto L18;
        float r9 = r6 - r12;
    L20:
        if (r9 >= 0.0f) goto L23;
        r9 = Float.POSITIVE_INFINITY;
    L23:
        if (Float.compare(r5, r9) <= 0) goto L26;
        r1 = r4;
        r5 = r9;
    L26:
        if (r0.hasNext() == true) goto L15;
    L18:
        r9 = r12 - r6;
        goto L20
    L11:
        r5 = r12 - r3;
        goto L13
    }

    @Override // androidx.compose.material.DraggableAnchors
    public float minAnchor() {
        Float r0 = CollectionsKt.minOrNull(this.anchors.values());
        if (r0 != null) goto L7;
        return Float.NaN;
    L7:
        return r0.floatValue();
    }

    @Override // androidx.compose.material.DraggableAnchors
    public float maxAnchor() {
        Float r0 = CollectionsKt.maxOrNull(this.anchors.values());
        if (r0 != null) goto L7;
        return Float.NaN;
    L7:
        return r0.floatValue();
    }

    @Override // androidx.compose.material.DraggableAnchors
    public int getSize() {
        return this.anchors.size();
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof MapDraggableAnchors) == true) goto L10;
        return false;
    L10:
        return Intrinsics.areEqual(this.anchors, ((MapDraggableAnchors) other).anchors);
    }

    public int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.anchors + ')';
    }
}
