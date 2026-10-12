package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.ReplaceWith;

/* JADX INFO: loaded from: classes4.dex */
public final class BitmapCompat {

    static class Api27Impl {
        private Api27Impl() {
        }

        static Bitmap createBitmapWithSourceColorspace(int w, int h, Bitmap src, boolean linear) {
            Bitmap.Config config = src.getConfig();
            ColorSpace colorSpace = src.getColorSpace();
            ColorSpace linearCs = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (linear == false) goto L8;
            if (src.getColorSpace().equals(linearCs) == true) goto L8;
            config = Bitmap.Config.RGBA_F16;
            colorSpace = linearCs;
        L13:
            return Bitmap.createBitmap(w, h, config, src.hasAlpha(), colorSpace);
        L8:
            if (src.getConfig() != Bitmap.Config.HARDWARE) goto L13;
            config = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT < 31) goto L13;
            config = Api31Impl.getHardwareBitmapConfig(src);
            goto L13
        }

        static boolean isAlreadyF16AndLinear(Bitmap b) {
            ColorSpace linearCs = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (b.getConfig() == Bitmap.Config.RGBA_F16) goto L5;
        L7:
            return false;
        L5:
            if (b.getColorSpace().equals(linearCs) == false) goto L7;
            return true;
        }

        static Bitmap copyBitmapIfHardware(Bitmap bm) {
            if (bm.getConfig() != Bitmap.Config.HARDWARE) goto L9;
            Bitmap.Config newConfig = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT < 31) goto L8;
            newConfig = Api31Impl.getHardwareBitmapConfig(bm);
        L8:
            return bm.copy(newConfig, true);
        L9:
            return bm;
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void setPaintBlendMode(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static Bitmap.Config getHardwareBitmapConfig(Bitmap bm) {
            if (bm.getHardwareBuffer().getFormat() != 22) goto L7;
            return Bitmap.Config.RGBA_F16;
        L7:
            return Bitmap.Config.ARGB_8888;
        }
    }

    @ReplaceWith(expression = "bitmap.hasMipMap()")
    @Deprecated
    public static boolean hasMipMap(Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    @ReplaceWith(expression = "bitmap.setHasMipMap(hasMipMap)")
    @Deprecated
    public static void setHasMipMap(Bitmap bitmap, boolean hasMipMap) {
        bitmap.setHasMipMap(hasMipMap);
    }

    @ReplaceWith(expression = "bitmap.getAllocationByteCount()")
    @Deprecated
    public static int getAllocationByteCount(Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static Bitmap createScaledBitmap(Bitmap srcBm, int dstW, int dstH, Rect srcRect, boolean scaleInLinearSpace) {
        int r1 = dstW;
        int r2 = dstH;
        if (r1 <= 0) goto L144;
        if (r2 <= 0) goto L144;
        if (srcRect != null) goto L7;
    L19:
        Bitmap src = srcBm;
        if (Build.VERSION.SDK_INT < 27) goto L22;
        src = Api27Impl.copyBitmapIfHardware(srcBm);
    L22:
        if (srcRect == null) goto L24;
        int srcW = srcRect.width();
    L25:
        if (srcRect == null) goto L27;
        int srcH = srcRect.height();
    L28:
        float sx = r1 / srcW;
        float sy = r2 / srcH;
        if (srcRect == null) goto L31;
        int srcX = srcRect.left;
    L32:
        if (srcRect == null) goto L34;
        int srcY = srcRect.top;
    L36:
        if (srcX != 0) goto L48;
        if (srcY != 0) goto L48;
        if (r1 != srcBm.getWidth()) goto L48;
        if (r2 != srcBm.getHeight()) goto L48;
        if (srcBm.isMutable() == false) goto L47;
        if (srcBm != src) goto L47;
        return srcBm.copy(srcBm.getConfig(), true);
    L47:
        return src;
    L48:
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        if (Build.VERSION.SDK_INT < 29) goto L51;
        Api29Impl.setPaintBlendMode(paint);
    L52:
        if (srcW != r1) goto L56;
        if (srcH != r2) goto L56;
        Bitmap out = Bitmap.createBitmap(r1, r2, src.getConfig());
        Canvas canvasForCopy = new Canvas(out);
        canvasForCopy.drawBitmap(src, -srcX, -srcY, paint);
        return out;
    L56:
        double log2 = Math.log(2.0d);
        if (sx <= 1.0f) goto L59;
        int stepsX = (int) Math.ceil(Math.log(sx) / log2);
    L61:
        if (sy <= 1065353216(0x3f800000, float:1.0)) goto L63;
        int stepsY = (int) Math.ceil(Math.log(sy) / log2);
    L64:
        int totalStepsX = stepsX;
        int totalStepsY = stepsY;
        Bitmap dst = null;
        int r22 = 0;
        if (scaleInLinearSpace == true) goto L67;
        int totalStepsY2 = totalStepsY;
    L80:
        Rect currRect = new Rect(srcX, srcY, srcW, srcH);
        Rect nextRect = new Rect();
        Bitmap dst2 = dst;
        int stepsX2 = stepsX;
    L81:
        if (stepsX2 != 0) goto L88;
        if (stepsY != 0) goto L88;
        if (dst2 == srcBm) goto L87;
        if (dst2 == null) goto L87;
        dst2.recycle();
    L87:
        return src;
    L88:
        if (stepsX2 >= 0) goto L90;
        stepsX2 = stepsX2 + 1;
    L92:
        if (stepsY >= 0) goto L94;
        stepsY = stepsY + 1;
    L96:
        int srcY2 = srcY;
        int nextW = sizeAtStep(srcW, r1, stepsX2, totalStepsX);
        int stepsX3 = stepsX2;
        int nextH = sizeAtStep(srcH, r2, stepsY, totalStepsY2);
        int stepsY2 = stepsY;
        nextRect.set(0, 0, nextW, nextH);
        if (stepsX3 != 0) goto L100;
        if (stepsY2 != 0) goto L100;
        boolean lastStep = true;
    L101:
        if (dst2 != null) goto L103;
    L107:
        boolean dstSizeIsFinal = false;
    L108:
        if (dst2 == null) goto L123;
        if (dst2 == srcBm) goto L123;
        if (scaleInLinearSpace == false) goto L117;
        int nextH2 = Build.VERSION.SDK_INT;
        if (nextH2 < 27) goto L117;
        if (Api27Impl.isAlreadyF16AndLinear(dst2) == false) goto L123;
    L117:
        if (lastStep == false) goto L121;
        if (dstSizeIsFinal == false) goto L123;
        if (r22 != 0) goto L123;
    L121:
        int srcW2 = srcW;
    L142:
        Canvas canvas = new Canvas(dst2);
        canvas.drawBitmap(src, currRect, nextRect, paint);
        Bitmap swap = src;
        src = dst2;
        dst2 = swap;
        currRect.set(nextRect);
        r1 = dstW;
        r2 = dstH;
        srcY = srcY2;
        stepsY = stepsY2;
        srcW = srcW2;
        stepsX2 = stepsX3;
    L123:
        if (dst2 == srcBm) goto L126;
        if (dst2 == null) goto L126;
        dst2.recycle();
    L126:
        int lastScratchStep = r22;
        if (stepsX3 <= 0) goto L129;
        int r12 = lastScratchStep;
    L130:
        int allocW = sizeAtStep(srcW, r1, r12, totalStepsX);
        if (stepsY2 <= 0) goto L133;
        int r3 = lastScratchStep;
    L134:
        int allocH = sizeAtStep(srcH, r2, r3, totalStepsY2);
        srcW2 = srcW;
        if (Build.VERSION.SDK_INT < 27) goto L141;
        if (scaleInLinearSpace == false) goto L139;
        if (lastStep == true) goto L139;
        boolean linear = true;
    L140:
        dst2 = Api27Impl.createBitmapWithSourceColorspace(allocW, allocH, srcBm, linear);
    L139:
        linear = false;
        goto L140
    L141:
        dst2 = Bitmap.createBitmap(allocW, allocH, src.getConfig());
        goto L142
    L133:
        r3 = stepsY2;
        goto L134
    L129:
        r12 = stepsX3;
        goto L130
    L103:
        if (dst2.getWidth() != r1) goto L107;
        if (dst2.getHeight() != r2) goto L107;
        dstSizeIsFinal = true;
    L100:
        lastStep = false;
        goto L101
    L94:
        if (stepsY <= 0) goto L96;
        stepsY = stepsY - 1;
        goto L96
    L90:
        if (stepsX2 <= 0) goto L92;
        stepsX2 = stepsX2 - 1;
        goto L92
    L67:
        if (Build.VERSION.SDK_INT >= 27) goto L69;
    L78:
        totalStepsY2 = totalStepsY;
        goto L80
    L69:
        if (Api27Impl.isAlreadyF16AndLinear(srcBm) == true) goto L78;
        if (stepsX <= 0) goto L72;
        ?? r4 = 1;
        int r19 = sizeAtStep(srcW, r1, 1, totalStepsX);
    L73:
        int allocW2 = r19;
        if (stepsY <= 0) goto L76;
        totalStepsY2 = totalStepsY;
        int totalStepsY3 = sizeAtStep(srcH, r2, r4, totalStepsY2);
    L77:
        Bitmap dst3 = Api27Impl.createBitmapWithSourceColorspace(allocW2, totalStepsY3, srcBm, r4);
        Canvas canvasForCopy2 = new Canvas(dst3);
        canvasForCopy2.drawBitmap(src, -srcX, -srcY, paint);
        srcY = 0;
        dst = src;
        src = dst3;
        r22 = 1;
        srcX = 0;
        goto L80
    L76:
        totalStepsY2 = totalStepsY;
        totalStepsY3 = srcH;
        goto L77
    L72:
        r4 = 1;
        r19 = srcW;
        goto L73
    L63:
        stepsY = (int) Math.floor(Math.log(sy) / log2);
        goto L64
    L59:
        stepsX = (int) Math.floor(Math.log(sx) / log2);
        goto L61
    L51:
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        goto L52
    L34:
        srcY = 0;
        goto L36
    L31:
        srcX = 0;
        goto L32
    L27:
        srcH = srcBm.getHeight();
        goto L28
    L24:
        srcW = srcBm.getWidth();
        goto L25
    L7:
        if (srcRect.isEmpty() == true) goto L18;
        if (srcRect.left < 0) goto L18;
        if (srcRect.right > srcBm.getWidth()) goto L18;
        if (srcRect.top < 0) goto L18;
        if (srcRect.bottom <= srcBm.getHeight()) goto L19;
    L18:
        throw new IllegalArgumentException("srcRect must be contained by srcBm!");
    L144:
        throw new IllegalArgumentException("dstW and dstH must be > 0!");
    }

    static int sizeAtStep(int srcSize, int dstSize, int step, int totalSteps) {
        if (step != 0) goto L5;
        return dstSize;
    L5:
        if (step <= 0) goto L9;
        return (1 << (totalSteps - step)) * srcSize;
    L9:
        return dstSize << ((-step) - 1);
    }

    private BitmapCompat() {
    }
}
