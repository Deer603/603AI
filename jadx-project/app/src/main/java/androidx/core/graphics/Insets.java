package androidx.core.graphics;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes4.dex */
public final class Insets {
    public static final Insets NONE = null;
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.graphics.Insets of(int left, int top, int right, int bottom) {
            return android.graphics.Insets.of(left, top, right, bottom);
        }
    }

    static {
        NONE = new Insets(0, 0, 0, 0);
    }

    private Insets(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public static Insets of(int left, int top, int right, int bottom) {
        if (left != 0) goto L9;
        if (top != 0) goto L9;
        if (right != 0) goto L9;
        if (bottom != 0) goto L9;
        return NONE;
    L9:
        return new Insets(left, top, right, bottom);
    }

    public static Insets of(Rect r) {
        return of(r.left, r.top, r.right, r.bottom);
    }

    public static Insets add(Insets a, Insets b) {
        return of(a.left + b.left, a.top + b.top, a.right + b.right, a.bottom + b.bottom);
    }

    public static Insets subtract(Insets a, Insets b) {
        return of(a.left - b.left, a.top - b.top, a.right - b.right, a.bottom - b.bottom);
    }

    public static Insets max(Insets a, Insets b) {
        return of(Math.max(a.left, b.left), Math.max(a.top, b.top), Math.max(a.right, b.right), Math.max(a.bottom, b.bottom));
    }

    public static Insets min(Insets a, Insets b) {
        return of(Math.min(a.left, b.left), Math.min(a.top, b.top), Math.min(a.right, b.right), Math.min(a.bottom, b.bottom));
    }

    public boolean equals(Object o) {
        if (this != o) goto L6;
        return true;
    L6:
        if (o != null) goto L8;
    L23:
        return false;
    L8:
        if (getClass() != o.getClass()) goto L23;
        Insets insets = (Insets) o;
        if (this.bottom == insets.bottom) goto L14;
        return false;
    L14:
        if (this.left == insets.left) goto L17;
        return false;
    L17:
        if (this.right == insets.right) goto L20;
        return false;
    L20:
        if (this.top == insets.top) goto L22;
        return false;
    L22:
        return true;
    }

    public int hashCode() {
        int result = this.left;
        int result2 = (result * 31) + this.top;
        return (((result2 * 31) + this.right) * 31) + this.bottom;
    }

    public String toString() {
        return "Insets{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }

    @Deprecated
    public static Insets wrap(android.graphics.Insets insets) {
        return toCompatInsets(insets);
    }

    public static Insets toCompatInsets(android.graphics.Insets insets) {
        return of(insets.left, insets.top, insets.right, insets.bottom);
    }

    public android.graphics.Insets toPlatformInsets() {
        return Api29Impl.of(this.left, this.top, this.right, this.bottom);
    }
}
