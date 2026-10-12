package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.ObjectsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DisplayCutoutCompat {
    private final DisplayCutout mDisplayCutout;

    static class Api28Impl {
        private Api28Impl() {
        }

        static DisplayCutout createDisplayCutout(Rect safeInsets, List<Rect> boundingRects) {
            return new DisplayCutout(safeInsets, boundingRects);
        }

        static int getSafeInsetTop(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        static int getSafeInsetBottom(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int getSafeInsetLeft(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int getSafeInsetRight(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static List<Rect> getBoundingRects(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static DisplayCutout createDisplayCutout(Insets safeInsets, Rect boundLeft, Rect boundTop, Rect boundRight, Rect boundBottom) {
            return new DisplayCutout(safeInsets, boundLeft, boundTop, boundRight, boundBottom);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static DisplayCutout createDisplayCutout(Insets safeInsets, Rect boundLeft, Rect boundTop, Rect boundRight, Rect boundBottom, Insets waterfallInsets) {
            return new DisplayCutout(safeInsets, boundLeft, boundTop, boundRight, boundBottom, waterfallInsets);
        }

        static Insets getWaterfallInsets(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static Path getCutoutPath(DisplayCutout displayCutout) {
            return displayCutout.getCutoutPath();
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static DisplayCutout createDisplayCutout(Insets safeInsets, Rect boundLeft, Rect boundTop, Rect boundRight, Rect boundBottom, Insets waterfallInsets, Path cutoutPath) {
            DisplayCutout.Builder builder = new DisplayCutout.Builder().setSafeInsets(safeInsets).setWaterfallInsets(waterfallInsets);
            if (boundLeft == null) goto L5;
            builder.setBoundingRectLeft(boundLeft);
        L5:
            if (boundTop == null) goto L7;
            builder.setBoundingRectTop(boundTop);
        L7:
            if (boundRight == null) goto L9;
            builder.setBoundingRectRight(boundRight);
        L9:
            if (boundBottom == null) goto L11;
            builder.setBoundingRectBottom(boundBottom);
        L11:
            if (cutoutPath == null) goto L14;
            builder.setCutoutPath(cutoutPath);
        L14:
            return builder.build();
        }
    }

    public DisplayCutoutCompat(Rect safeInsets, List<Rect> boundingRects) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        DisplayCutout r0 = Api28Impl.createDisplayCutout(safeInsets, boundingRects);
    L6:
        this(r0);
        return;
    L5:
        r0 = null;
        goto L6
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets safeInsets, Rect boundLeft, Rect boundTop, Rect boundRight, Rect boundBottom, androidx.core.graphics.Insets waterfallInsets) {
        this(constructDisplayCutout(safeInsets, boundLeft, boundTop, boundRight, boundBottom, waterfallInsets, null));
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets safeInsets, Rect boundLeft, Rect boundTop, Rect boundRight, Rect boundBottom, androidx.core.graphics.Insets waterfallInsets, Path cutoutPath) {
        this(constructDisplayCutout(safeInsets, boundLeft, boundTop, boundRight, boundBottom, waterfallInsets, cutoutPath));
    }

    private static DisplayCutout constructDisplayCutout(androidx.core.graphics.Insets safeInsets, Rect boundLeft, Rect boundTop, Rect boundRight, Rect boundBottom, androidx.core.graphics.Insets waterfallInsets, Path cutoutPath) {
        if (Build.VERSION.SDK_INT < 33) goto L7;
        return Api33Impl.createDisplayCutout(safeInsets.toPlatformInsets(), boundLeft, boundTop, boundRight, boundBottom, waterfallInsets.toPlatformInsets(), cutoutPath);
    L7:
        if (Build.VERSION.SDK_INT < 30) goto L11;
        return Api30Impl.createDisplayCutout(safeInsets.toPlatformInsets(), boundLeft, boundTop, boundRight, boundBottom, waterfallInsets.toPlatformInsets());
    L11:
        if (Build.VERSION.SDK_INT < 29) goto L15;
        return Api29Impl.createDisplayCutout(safeInsets.toPlatformInsets(), boundLeft, boundTop, boundRight, boundBottom);
    L15:
        if (Build.VERSION.SDK_INT < 28) goto L27;
        Rect safeInsetRect = new Rect(safeInsets.left, safeInsets.top, safeInsets.right, safeInsets.bottom);
        ArrayList<Rect> boundingRects = new ArrayList();
        if (boundLeft == null) goto L19;
        boundingRects.add(boundLeft);
    L19:
        if (boundTop == null) goto L21;
        boundingRects.add(boundTop);
    L21:
        if (boundRight == null) goto L23;
        boundingRects.add(boundRight);
    L23:
        if (boundBottom == null) goto L26;
        boundingRects.add(boundBottom);
    L26:
        return Api28Impl.createDisplayCutout(safeInsetRect, boundingRects);
    L27:
        return null;
    }

    private DisplayCutoutCompat(DisplayCutout displayCutout) {
        this.mDisplayCutout = displayCutout;
    }

    public int getSafeInsetTop() {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return 0;
    L5:
        return Api28Impl.getSafeInsetTop(this.mDisplayCutout);
    }

    public int getSafeInsetBottom() {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return 0;
    L5:
        return Api28Impl.getSafeInsetBottom(this.mDisplayCutout);
    }

    public int getSafeInsetLeft() {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return 0;
    L5:
        return Api28Impl.getSafeInsetLeft(this.mDisplayCutout);
    }

    public int getSafeInsetRight() {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return 0;
    L5:
        return Api28Impl.getSafeInsetRight(this.mDisplayCutout);
    }

    public List<Rect> getBoundingRects() {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return Api28Impl.getBoundingRects(this.mDisplayCutout);
    L7:
        return Collections.emptyList();
    }

    public androidx.core.graphics.Insets getWaterfallInsets() {
        if (Build.VERSION.SDK_INT < 30) goto L7;
        return androidx.core.graphics.Insets.toCompatInsets(Api30Impl.getWaterfallInsets(this.mDisplayCutout));
    L7:
        return androidx.core.graphics.Insets.NONE;
    }

    public Path getCutoutPath() {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return null;
    L5:
        return Api31Impl.getCutoutPath(this.mDisplayCutout);
    }

    public boolean equals(Object o) {
        if (this != o) goto L5;
        return true;
    L5:
        if (o != null) goto L7;
        return false;
    L7:
        if (getClass() != o.getClass()) goto L13;
        DisplayCutoutCompat other = (DisplayCutoutCompat) o;
        return ObjectsCompat.equals(this.mDisplayCutout, other.mDisplayCutout);
    L13:
        return false;
    }

    public int hashCode() {
        if (this.mDisplayCutout != null) goto L6;
        return 0;
    L6:
        return this.mDisplayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }

    static DisplayCutoutCompat wrap(DisplayCutout displayCutout) {
        if (displayCutout != null) goto L5;
        return null;
    L5:
        return new DisplayCutoutCompat(displayCutout);
    }

    DisplayCutout unwrap() {
        return this.mDisplayCutout;
    }
}
