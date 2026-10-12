package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: ShapeContainingUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000\u001a4\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002\u001a \u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a4\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002\u001a:\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u001bH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"isInOutline", "", "outline", "Landroidx/compose/ui/graphics/Outline;", "x", "", "y", "tmpTouchPointPath", "Landroidx/compose/ui/graphics/Path;", "tmpOpPath", "isInPath", "path", "isInRectangle", "rect", "Landroidx/compose/ui/geometry/Rect;", "isInRoundedRect", "Landroidx/compose/ui/graphics/Outline$Rounded;", "touchPointPath", "opPath", "isWithinEllipse", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "centerX", "centerY", "isWithinEllipse-VE1yxkc", "(FFJFF)Z", "cornersFit", "Landroidx/compose/ui/geometry/RoundRect;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ShapeContainingUtilKt {
    public static /* synthetic */ boolean isInOutline$default(Outline r1, float r2, float r3, Path r4, Path r5, int r6, Object r7) {
        if ((r6 & 8) == 0) goto L6;
        r4 = null;
    L6:
        if ((r6 & 16) == 0) goto L9;
        r5 = null;
    L9:
        return isInOutline(r1, r2, r3, r4, r5);
    }

    public static final boolean isInOutline(Outline outline, float x, float y, Path tmpTouchPointPath, Path tmpOpPath) {
        if ((outline instanceof Outline.Rectangle) == false) goto L6;
        return isInRectangle(((Outline.Rectangle) outline).getRect(), x, y);
    L6:
        if ((outline instanceof Outline.Rounded) == false) goto L9;
        return isInRoundedRect((Outline.Rounded) outline, x, y, tmpTouchPointPath, tmpOpPath);
    L9:
        if ((outline instanceof Outline.Generic) == false) goto L13;
        return isInPath(((Outline.Generic) outline).getPath(), x, y, tmpTouchPointPath, tmpOpPath);
    L13:
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean isInRectangle(Rect rect, float x, float y) {
        if (rect.getLeft() <= x) goto L5;
    L11:
        return false;
    L5:
        if (x >= rect.getRight()) goto L11;
        if (rect.getTop() > y) goto L11;
        if (y >= rect.getBottom()) goto L11;
        return true;
    }

    private static final boolean isInRoundedRect(Outline.Rounded outline, float x, float y, Path touchPointPath, Path opPath) {
        RoundRect rrect = outline.getRoundRect();
        if (x < rrect.getLeft()) goto L41;
        if (x >= rrect.getRight()) goto L41;
        if (y < rrect.getTop()) goto L41;
        if (y < rrect.getBottom()) goto L12;
        return false;
    L12:
        if (cornersFit(rrect) == true) goto L18;
        if (opPath != null) goto L15;
        Path path = AndroidPath_androidKt.Path();
    L16:
        Path.addRoundRect$default(path, rrect, null, 2, null);
        return isInPath(path, x, y, touchPointPath, opPath);
    L15:
        path = opPath;
        goto L16
    L18:
        float r2 = rrect.getLeft();
        long arg0$iv = rrect.m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float topLeftX = r2 + Float.intBitsToFloat(bits$iv$iv$iv);
        float r3 = rrect.getTop();
        long arg0$iv2 = rrect.m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 & 4294967295L);
        float topLeftY = r3 + Float.intBitsToFloat(bits$iv$iv$iv2);
        float r4 = rrect.getRight();
        long arg0$iv3 = rrect.m4176getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv3 = (int) (arg0$iv3 >> 32);
        float topRightX = r4 - Float.intBitsToFloat(bits$iv$iv$iv3);
        float r5 = rrect.getTop();
        long arg0$iv4 = rrect.m4176getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv4 = (int) (arg0$iv4 & 4294967295L);
        float topRightY = r5 + Float.intBitsToFloat(bits$iv$iv$iv4);
        float r0 = rrect.getRight();
        long arg0$iv5 = rrect.m4174getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv5 = (int) (arg0$iv5 >> 32);
        float bottomRightX = r0 - Float.intBitsToFloat(bits$iv$iv$iv5);
        float r1 = rrect.getBottom();
        long arg0$iv6 = rrect.m4174getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv6 = (int) (arg0$iv6 & 4294967295L);
        float bottomRightY = r1 - Float.intBitsToFloat(bits$iv$iv$iv6);
        float r6 = rrect.getBottom();
        long arg0$iv7 = rrect.m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv7 = (int) (arg0$iv7 & 4294967295L);
        float bottomLeftX = r6 - Float.intBitsToFloat(bits$iv$iv$iv7);
        float r7 = rrect.getLeft();
        long arg0$iv8 = rrect.m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv8 = (int) (arg0$iv8 >> 32);
        float bottomLeftY = r7 + Float.intBitsToFloat(bits$iv$iv$iv8);
        if (x >= topLeftX) goto L24;
        if (y >= topLeftY) goto L24;
        return m6158isWithinEllipseVE1yxkc(x, y, rrect.m4175getTopLeftCornerRadiuskKHJgLs(), topLeftX, topLeftY);
    L24:
        if (x >= bottomLeftY) goto L29;
        if (y <= bottomLeftX) goto L29;
        return m6158isWithinEllipseVE1yxkc(x, y, rrect.m4173getBottomLeftCornerRadiuskKHJgLs(), bottomLeftY, bottomLeftX);
    L29:
        if (x <= topRightX) goto L34;
        if (y >= topRightY) goto L34;
        return m6158isWithinEllipseVE1yxkc(x, y, rrect.m4176getTopRightCornerRadiuskKHJgLs(), topRightX, topRightY);
    L34:
        if (x <= bottomRightX) goto L39;
        if (y <= bottomRightY) goto L39;
        return m6158isWithinEllipseVE1yxkc(x, y, rrect.m4174getBottomRightCornerRadiuskKHJgLs(), bottomRightX, bottomRightY);
    L39:
        return true;
    L41:
        return false;
    }

    private static final boolean cornersFit(RoundRect $this$cornersFit) {
        long arg0$iv = $this$cornersFit.m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float r7 = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv2 = $this$cornersFit.m4176getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 >> 32);
        if ((r7 + Float.intBitsToFloat(bits$iv$iv$iv2)) > $this$cornersFit.getWidth()) goto L11;
        long arg0$iv3 = $this$cornersFit.m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv3 = (int) (arg0$iv3 >> 32);
        float r8 = Float.intBitsToFloat(bits$iv$iv$iv3);
        long arg0$iv4 = $this$cornersFit.m4174getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv4 = (int) (arg0$iv4 >> 32);
        if ((r8 + Float.intBitsToFloat(bits$iv$iv$iv4)) > $this$cornersFit.getWidth()) goto L11;
        long arg0$iv5 = $this$cornersFit.m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv5 = (int) (arg0$iv5 & 4294967295L);
        float r9 = Float.intBitsToFloat(bits$iv$iv$iv5);
        long arg0$iv6 = $this$cornersFit.m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv6 = (int) (arg0$iv6 & 4294967295L);
        if ((r9 + Float.intBitsToFloat(bits$iv$iv$iv6)) > $this$cornersFit.getHeight()) goto L11;
        long arg0$iv7 = $this$cornersFit.m4176getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv7 = (int) (arg0$iv7 & 4294967295L);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv7);
        long arg0$iv8 = $this$cornersFit.m4174getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv8 = (int) (4294967295L & arg0$iv8);
        if ((r10 + Float.intBitsToFloat(bits$iv$iv$iv8)) > $this$cornersFit.getHeight()) goto L11;
        return true;
    L11:
        return false;
    }

    /* JADX INFO: renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m6158isWithinEllipseVE1yxkc(float x, float y, long cornerRadius, float centerX, float centerY) {
        float px = x - centerX;
        float py = y - centerY;
        int bits$iv$iv$iv = (int) (cornerRadius >> 32);
        float radiusX = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (4294967295L & cornerRadius);
        float radiusY = Float.intBitsToFloat(bits$iv$iv$iv2);
        if ((((px * px) / (radiusX * radiusX)) + ((py * py) / (radiusY * radiusY))) > 1.0f) goto L5;
        return true;
    L5:
        return false;
    }

    private static final boolean isInPath(Path path, float x, float y, Path tmpTouchPointPath, Path tmpOpPath) {
        Rect rect = new Rect(x - 0.005f, y - 0.005f, x + 0.005f, 0.005f + y);
        if (tmpTouchPointPath != null) goto L5;
        Path touchPointPath = AndroidPath_androidKt.Path();
    L6:
        Path.addRect$default(touchPointPath, rect, null, 2, null);
        if (tmpOpPath != null) goto L9;
        Path opPath = AndroidPath_androidKt.Path();
    L10:
        opPath.mo4258opN5in7k0(path, touchPointPath, PathOperation.Companion.m4659getIntersectb3I0S0c());
        boolean isClipped = opPath.isEmpty();
        opPath.reset();
        touchPointPath.reset();
        return !isClipped;
    L9:
        opPath = tmpOpPath;
        goto L10
    L5:
        touchPointPath = tmpTouchPointPath;
        goto L6
    }
}
