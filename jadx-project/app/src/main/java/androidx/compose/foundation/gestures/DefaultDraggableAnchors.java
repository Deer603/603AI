package androidx.compose.foundation.gestures;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0017\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u001f\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\tH\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\tH\u0016J\u0015\u0010 \u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", "T", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "keys", "", "anchors", "", "(Ljava/util/List;[F)V", "size", "", "getSize", "()I", "anchorAt", "index", "(I)Ljava/lang/Object;", "closestAnchor", "position", "", "(F)Ljava/lang/Object;", "searchUpwards", "", "(FZ)Ljava/lang/Object;", "equals", "other", "", "hasPositionFor", "anchor", "(Ljava/lang/Object;)Z", "hashCode", "maxPosition", "minPosition", "positionAt", "positionOf", "(Ljava/lang/Object;)F", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultDraggableAnchors<T> implements DraggableAnchors<T> {
    private final float[] anchors;
    private final List<T> keys;
    private final int size;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableAnchors(List<? extends T> r6, float[] anchors) {
        this.keys = r6;
        this.anchors = anchors;
        if (this.keys.size() != this.anchors.length) goto L5;
        boolean statement$iv = true;
    L7:
        if (statement$iv == false) goto L11;
        this.size = this.anchors.length;
        return;
    L11:
        throw new AssertionError("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + this.keys + " | Anchors: " + ArraysKt.toList(this.anchors));
    L5:
        statement$iv = false;
        goto L7
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionOf(T r5) {
        int index = this.keys.indexOf(r5);
        float[] r1 = this.anchors;
        Function1 r2 = AnchoredDraggableKt.access$getGetOrNan$p();
        if (index < 0) goto L8;
        if (index > ArraysKt.getLastIndex(r1)) goto L8;
        return r1[index];
    L8:
        return ((Number) r2.invoke(Integer.valueOf(index))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public boolean hasPositionFor(T r3) {
        if (this.keys.indexOf(r3) == (-1)) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T closestAnchor(float position) {
        int minAnchorIndex = -1;
        float minDistance = Float.POSITIVE_INFINITY;
        float[] $this$forEachIndexed$iv = this.anchors;
        int index$iv = 0;
        int r5 = $this$forEachIndexed$iv.length;
        int r6 = 0;
    L3:
        if (r6 >= r5) goto L9;
        float item$iv = $this$forEachIndexed$iv[r6];
        int index$iv2 = index$iv + 1;
        float distance = Math.abs(position - item$iv);
        if (distance > minDistance) goto L7;
        minAnchorIndex = index$iv;
        minDistance = distance;
    L7:
        r6 = r6 + 1;
        index$iv = index$iv2;
        goto L3
    L9:
        return this.keys.get(minAnchorIndex);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T closestAnchor(float position, boolean searchUpwards) {
        int minAnchorIndex = -1;
        float minDistance = Float.POSITIVE_INFINITY;
        float[] $this$forEachIndexed$iv = this.anchors;
        int index$iv = 0;
        int r5 = $this$forEachIndexed$iv.length;
        int r6 = 0;
    L3:
        if (r6 >= r5) goto L17;
        float item$iv = $this$forEachIndexed$iv[r6];
        int index$iv2 = index$iv + 1;
        if (searchUpwards == false) goto L7;
        float delta = item$iv - position;
    L9:
        if (delta >= 0.0f) goto L11;
        float distance = Float.POSITIVE_INFINITY;
    L13:
        if (distance > minDistance) goto L15;
        minAnchorIndex = index$iv;
        minDistance = distance;
    L15:
        r6 = r6 + 1;
        index$iv = index$iv2;
        goto L3
    L11:
        distance = delta;
        goto L13
    L7:
        delta = position - item$iv;
        goto L9
    L17:
        return this.keys.get(minAnchorIndex);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float minPosition() {
        Float r0 = ArraysKt.minOrNull(this.anchors);
        if (r0 != null) goto L7;
        return Float.NaN;
    L7:
        return r0.floatValue();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float maxPosition() {
        Float r0 = ArraysKt.maxOrNull(this.anchors);
        if (r0 != null) goto L7;
        return Float.NaN;
    L7:
        return r0.floatValue();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T anchorAt(int r2) {
        return (T) CollectionsKt.getOrNull(this.keys, r2);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionAt(int index) {
        float[] r0 = this.anchors;
        Function1 r1 = AnchoredDraggableKt.access$getGetOrNan$p();
        if (index < 0) goto L8;
        if (index > ArraysKt.getLastIndex(r0)) goto L8;
        return r0[index];
    L8:
        return ((Number) r1.invoke(Integer.valueOf(index))).floatValue();
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof DefaultDraggableAnchors) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.keys, ((DefaultDraggableAnchors) other).keys) == true) goto L12;
        return false;
    L12:
        if (Arrays.equals(this.anchors, ((DefaultDraggableAnchors) other).anchors) == true) goto L15;
        return false;
    L15:
        if (getSize() == ((DefaultDraggableAnchors) other).getSize()) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int result = this.keys.hashCode();
        int result2 = (result * 31) + Arrays.hashCode(this.anchors);
        return (result2 * 31) + getSize();
    }

    public String toString() {
        StringBuilder $this$toString_u24lambda_u243 = new StringBuilder();
        $this$toString_u24lambda_u243.append("DraggableAnchors(anchors={");
        int i = 0;
        int r4 = getSize();
    L3:
        if (i >= r4) goto L8;
        $this$toString_u24lambda_u243.append(new StringBuilder().append(anchorAt(i)).append('=').append(positionAt(i)).toString());
        if (i >= (getSize() - 1)) goto L7;
        $this$toString_u24lambda_u243.append(", ");
    L7:
        i = i + 1;
        goto L3
    L8:
        $this$toString_u24lambda_u243.append("})");
        String r0 = $this$toString_u24lambda_u243.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }
}
