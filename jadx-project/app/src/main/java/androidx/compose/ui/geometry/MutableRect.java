package androidx.compose.ui.geometry;

import kotlin.Metadata;

/* JADX INFO: compiled from: MutableRect.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u001b\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\rH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u000e\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0003J\u000e\u0010=\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0003J&\u0010>\u001a\u00020;2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u0000J\u000e\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020AJ&\u0010B\u001a\u00020;2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010C\u001a\u00020DH\u0016J\u0018\u0010E\u001a\u00020;2\u0006\u00107\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u0016\u0010E\u001a\u00020;2\u0006\u0010H\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u0003R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0018\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0012\u0010\u001a\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u000bR\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\tR\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR\u0017\u0010)\u001a\u00020*8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\t\"\u0004\b-\u0010\u000bR\u0017\u0010.\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b/\u0010\u000fR\u0017\u00100\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b1\u0010\u000fR\u0017\u00102\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b3\u0010\u000fR\u0012\u00104\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b5\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "", "left", "", "top", "right", "bottom", "(FFFF)V", "getBottom", "()F", "setBottom", "(F)V", "bottomCenter", "Landroidx/compose/ui/geometry/Offset;", "getBottomCenter-F1C5BW0", "()J", "bottomLeft", "getBottomLeft-F1C5BW0", "bottomRight", "getBottomRight-F1C5BW0", "center", "getCenter-F1C5BW0", "centerLeft", "getCenterLeft-F1C5BW0", "centerRight", "getCenterRight-F1C5BW0", "height", "getHeight", "isEmpty", "", "()Z", "isFinite", "isInfinite", "getLeft", "setLeft", "maxDimension", "getMaxDimension", "minDimension", "getMinDimension", "getRight", "setRight", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "getTop", "setTop", "topCenter", "getTopCenter-F1C5BW0", "topLeft", "getTopLeft-F1C5BW0", "topRight", "getTopRight-F1C5BW0", "width", "getWidth", "contains", "offset", "contains-k-4lQ0M", "(J)Z", "deflate", "", "delta", "inflate", "intersect", "overlaps", "other", "Landroidx/compose/ui/geometry/Rect;", "set", "toString", "", "translate", "translate-k-4lQ0M", "(J)V", "translateX", "translateY", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableRect {
    public static final int $stable = 0;
    private float bottom;
    private float left;
    private float right;
    private float top;

    static {
        $stable = 8;
    }

    public MutableRect(float left, float top, float right, float bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public final void setBottom(float r1) {
        this.bottom = r1;
    }

    public final void setLeft(float r1) {
        this.left = r1;
    }

    public final void setRight(float r1) {
        this.right = r1;
    }

    public final void setTop(float r1) {
        this.top = r1;
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m4106getSizeNHjbRc() {
        float width$iv = getRight() - getLeft();
        float height$iv = getBottom() - getTop();
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    public final boolean isInfinite() {
        boolean r2 = true;
        if (this.left != Float.POSITIVE_INFINITY) goto L5;
        boolean r0 = true;
    L7:
        if (this.top != Float.POSITIVE_INFINITY) goto L9;
        boolean r4 = true;
    L10:
        boolean r1 = r0 | r4;
        if (this.right != Float.POSITIVE_INFINITY) goto L13;
        boolean r5 = true;
    L14:
        boolean r3 = r1 | r5;
        if (this.bottom == Float.POSITIVE_INFINITY) goto L19;
        r2 = false;
    L19:
        return r3 | r2;
    L13:
        r5 = false;
        goto L14
    L9:
        r4 = false;
        goto L10
    L5:
        r0 = false;
        goto L7
    }

    public final boolean isFinite() {
        boolean r2 = true;
        if ((Float.floatToRawIntBits(this.left) & Integer.MAX_VALUE) >= 2139095040) goto L5;
        boolean r0 = true;
    L7:
        if ((Float.floatToRawIntBits(this.top) & Integer.MAX_VALUE) >= 2139095040) goto L9;
        boolean r5 = true;
    L10:
        boolean r1 = r0 & r5;
        if ((Float.floatToRawIntBits(this.right) & Integer.MAX_VALUE) >= 2139095040) goto L13;
        boolean r6 = true;
    L14:
        boolean r3 = r1 & r6;
        if ((Integer.MAX_VALUE & Float.floatToRawIntBits(this.bottom)) < 2139095040) goto L19;
        r2 = false;
    L19:
        return r3 & r2;
    L13:
        r6 = false;
        goto L14
    L9:
        r5 = false;
        goto L10
    L5:
        r0 = false;
        goto L7
    }

    public final boolean isEmpty() {
        boolean r1 = true;
        if (this.left < this.right) goto L5;
        boolean r0 = true;
    L7:
        if (this.top >= this.bottom) goto L11;
        r1 = false;
    L11:
        return r0 | r1;
    L5:
        r0 = false;
        goto L7
    }

    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final void m4110translatek4lQ0M(long offset) {
        int bits$iv$iv$iv = (int) (offset >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & offset);
        translate(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2));
    }

    public final void translate(float translateX, float translateY) {
        this.left += translateX;
        this.top += translateY;
        this.right += translateX;
        this.bottom += translateY;
    }

    public final void inflate(float delta) {
        this.left -= delta;
        this.top -= delta;
        this.right += delta;
        this.bottom += delta;
    }

    public final void deflate(float delta) {
        inflate(-delta);
    }

    public final void intersect(float left, float top, float right, float bottom) {
        this.left = Math.max(left, this.left);
        this.top = Math.max(top, this.top);
        this.right = Math.min(right, this.right);
        this.bottom = Math.min(bottom, this.bottom);
    }

    public final boolean overlaps(Rect other) {
        boolean r1 = true;
        if (this.left >= other.getRight()) goto L5;
        boolean r0 = true;
    L7:
        if (other.getLeft() >= this.right) goto L9;
        boolean r3 = true;
    L10:
        boolean r2 = r0 & r3;
        if (this.top >= other.getBottom()) goto L13;
        boolean r4 = true;
    L14:
        boolean r5 = r2 & r4;
        if (other.getTop() < this.bottom) goto L19;
        r1 = false;
    L19:
        return r5 & r1;
    L13:
        r4 = false;
        goto L14
    L9:
        r3 = false;
        goto L10
    L5:
        r0 = false;
        goto L7
    }

    public final boolean overlaps(MutableRect other) {
        if (this.right > other.left) goto L5;
    L15:
        return false;
    L5:
        if (other.right <= this.left) goto L15;
        if (this.bottom > other.top) goto L10;
    L14:
        return false;
    L10:
        if (other.bottom <= this.top) goto L14;
        return true;
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    /* JADX INFO: renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m4108getTopLeftF1C5BW0() {
        float x$iv = this.left;
        float y$iv = this.top;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m4107getTopCenterF1C5BW0() {
        float x$iv = this.left + ((getRight() - getLeft()) / 2.0f);
        float y$iv = this.top;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m4109getTopRightF1C5BW0() {
        float x$iv = this.right;
        float y$iv = this.top;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m4104getCenterLeftF1C5BW0() {
        float x$iv = this.left;
        float y$iv = this.top + ((getBottom() - getTop()) / 2.0f);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m4103getCenterF1C5BW0() {
        float x$iv = this.left + ((getRight() - getLeft()) / 2.0f);
        float y$iv = this.top + ((getBottom() - getTop()) / 2.0f);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m4105getCenterRightF1C5BW0() {
        float x$iv = this.right;
        float y$iv = this.top + ((getBottom() - getTop()) / 2.0f);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m4101getBottomLeftF1C5BW0() {
        float x$iv = this.left;
        float y$iv = this.bottom;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m4100getBottomCenterF1C5BW0() {
        float x$iv = this.left + ((getRight() - getLeft()) / 2.0f);
        float y$iv = this.bottom;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m4102getBottomRightF1C5BW0() {
        float x$iv = this.right;
        float y$iv = this.bottom;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m4099containsk4lQ0M(long offset) {
        int bits$iv$iv$iv = (int) (offset >> 32);
        float x = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (4294967295L & offset);
        float y = Float.intBitsToFloat(bits$iv$iv$iv2);
        boolean r1 = true;
        if (x < this.left) goto L5;
        boolean r0 = true;
    L7:
        if (x >= this.right) goto L9;
        boolean r3 = true;
    L10:
        boolean r2 = r0 & r3;
        if (y < this.top) goto L13;
        boolean r4 = true;
    L14:
        boolean r5 = r2 & r4;
        if (y < this.bottom) goto L19;
        r1 = false;
    L19:
        return r5 & r1;
    L13:
        r4 = false;
        goto L14
    L9:
        r3 = false;
        goto L10
    L5:
        r0 = false;
        goto L7
    }

    public final void set(float left, float top, float right, float bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }
}
