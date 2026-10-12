package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u0019"}, d2 = {"androidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "distance", "", "getDistance", "()F", "setDistance", "(F)V", "leftBound", "getLeftBound", "()Ljava/lang/Object;", "setLeftBound", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "rightBound", "getRightBound", "setRightBound", "dragTo", "", "newOffset", "lastKnownVelocity", "updateBounds", "isMovingForward", "", "updateIfNeeded", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnchoredDraggableState$anchoredDragScope$1 implements AnchoredDragScope {
    private float distance;
    private T leftBound;
    private T rightBound;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    AnchoredDraggableState$anchoredDragScope$1(AnchoredDraggableState<T> r2) {
        this.this$0 = r2;
        this.distance = Float.NaN;
    }

    public final T getLeftBound() {
        return this.leftBound;
    }

    public final void setLeftBound(T r1) {
        this.leftBound = r1;
    }

    public final T getRightBound() {
        return this.rightBound;
    }

    public final void setRightBound(T r1) {
        this.rightBound = r1;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final void setDistance(float r1) {
        this.distance = r1;
    }

    @Override // androidx.compose.foundation.gestures.AnchoredDragScope
    public void dragTo(float newOffset, float lastKnownVelocity) {
        float previousOffset = this.this$0.getOffset();
        AnchoredDraggableState.access$setOffset(this.this$0, newOffset);
        AnchoredDraggableState.access$setLastVelocity(this.this$0, lastKnownVelocity);
        if (Float.isNaN(previousOffset) == false) goto L6;
        return;
    L6:
        if (newOffset < previousOffset) goto L8;
        boolean isMovingForward = true;
    L9:
        updateIfNeeded(isMovingForward);
        return;
    L8:
        isMovingForward = false;
        goto L9
    }

    public final void updateIfNeeded(boolean isMovingForward) {
        updateBounds(isMovingForward);
        float distanceToCurrentAnchor = Math.abs(this.this$0.getOffset() - this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue()));
        if (distanceToCurrentAnchor < (this.distance / 2.0f)) goto L5;
        boolean crossedThreshold = true;
    L6:
        if (crossedThreshold == false) goto L16;
        if (isMovingForward == false) goto L9;
        Object closestAnchor = this.rightBound;
    L10:
        if (closestAnchor != null) goto L13;
        closestAnchor = this.this$0.getCurrentValue();
    L13:
        if (((Boolean) this.this$0.getConfirmValueChange$foundation_release().invoke(closestAnchor)).booleanValue() == false) goto L17;
        AnchoredDraggableState.access$setCurrentValue(this.this$0, closestAnchor);
        return;
    L17:
        return;
    L9:
        closestAnchor = this.leftBound;
        goto L10
    L16:
        return;
    L5:
        crossedThreshold = false;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.Object] */
    public final void updateBounds(boolean r6) {
        if (this.this$0.getOffset() != this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue())) goto L5;
        boolean r1 = true;
    L6:
        AnchoredDraggableState<T> r4 = this.this$0;
        if (r1 == false) goto L19;
        float r2 = r4.getOffset();
        if (r6 == false) goto L11;
        float r3 = 1.0f;
    L12:
        Object r5 = this.this$0.getAnchors().closestAnchor(r2 + r3, r6);
        T r7 = r5;
        if (r5 != null) goto L16;
        r7 = this.this$0.getCurrentValue();
    L16:
        if (r6 == false) goto L18;
        this.leftBound = this.this$0.getCurrentValue();
        this.rightBound = r7;
    L26:
        DraggableAnchors r8 = this.this$0.getAnchors();
        T r9 = this.leftBound;
        Intrinsics.checkNotNull(r9);
        float r10 = r8.positionOf(r9);
        DraggableAnchors r11 = this.this$0.getAnchors();
        T r12 = this.rightBound;
        Intrinsics.checkNotNull(r12);
        this.distance = Math.abs(r10 - r11.positionOf(r12));
        return;
    L18:
        this.leftBound = r7;
        this.rightBound = this.this$0.getCurrentValue();
        goto L26
    L11:
        r3 = -1.0f;
        goto L12
    L19:
        Object r13 = r4.getAnchors().closestAnchor(this.this$0.getOffset(), false);
        T r14 = r13;
        if (r13 != null) goto L22;
        r14 = this.this$0.getCurrentValue();
    L22:
        Object r15 = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset(), true);
        T r16 = r15;
        if (r15 != null) goto L25;
        r16 = this.this$0.getCurrentValue();
    L25:
        this.leftBound = r14;
        this.rightBound = r16;
        goto L26
    L5:
        r1 = false;
        goto L6
    }
}
