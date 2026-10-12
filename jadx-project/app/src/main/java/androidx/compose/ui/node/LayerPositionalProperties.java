package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/LayerPositionalProperties;", "", "()V", "cameraDistance", "", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "translationX", "translationY", "copyFrom", "", "scope", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "other", "hasSameValuesAs", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LayerPositionalProperties {
    private float cameraDistance;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private long transformOrigin;
    private float translationX;
    private float translationY;

    public LayerPositionalProperties() {
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.cameraDistance = 8.0f;
        this.transformOrigin = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
    }

    public final void copyFrom(LayerPositionalProperties other) {
        this.scaleX = other.scaleX;
        this.scaleY = other.scaleY;
        this.translationX = other.translationX;
        this.translationY = other.translationY;
        this.rotationX = other.rotationX;
        this.rotationY = other.rotationY;
        this.rotationZ = other.rotationZ;
        this.cameraDistance = other.cameraDistance;
        this.transformOrigin = other.transformOrigin;
    }

    public final void copyFrom(GraphicsLayerScope scope) {
        this.scaleX = scope.getScaleX();
        this.scaleY = scope.getScaleY();
        this.translationX = scope.getTranslationX();
        this.translationY = scope.getTranslationY();
        this.rotationX = scope.getRotationX();
        this.rotationY = scope.getRotationY();
        this.rotationZ = scope.getRotationZ();
        this.cameraDistance = scope.getCameraDistance();
        this.transformOrigin = scope.mo4554getTransformOriginSzJe1aQ();
    }

    public final boolean hasSameValuesAs(LayerPositionalProperties other) {
        if (this.scaleX != other.scaleX) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L46;
        if (this.scaleY != other.scaleY) goto L10;
        boolean r1 = true;
    L11:
        if (r1 == false) goto L46;
        if (this.translationX != other.translationX) goto L15;
        boolean r2 = true;
    L16:
        if (r2 == false) goto L46;
        if (this.translationY != other.translationY) goto L20;
        boolean r3 = true;
    L21:
        if (r3 == false) goto L46;
        if (this.rotationX != other.rotationX) goto L25;
        boolean r4 = true;
    L26:
        if (r4 == false) goto L46;
        if (this.rotationY != other.rotationY) goto L30;
        boolean r5 = true;
    L31:
        if (r5 == false) goto L46;
        if (this.rotationZ != other.rotationZ) goto L35;
        boolean r6 = true;
    L36:
        if (r6 == false) goto L46;
        if (this.cameraDistance != other.cameraDistance) goto L40;
        boolean r7 = true;
    L41:
        if (r7 == false) goto L46;
        if (TransformOrigin.m4751equalsimpl0(this.transformOrigin, other.transformOrigin) == false) goto L46;
        return true;
    L40:
        r7 = false;
        goto L41
    L35:
        r6 = false;
        goto L36
    L30:
        r5 = false;
        goto L31
    L25:
        r4 = false;
        goto L26
    L20:
        r3 = false;
        goto L21
    L15:
        r2 = false;
        goto L16
    L10:
        r1 = false;
    L46:
        return false;
    L5:
        r0 = false;
        goto L6
    }
}
