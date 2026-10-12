package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.Metadata;

/* JADX INFO: compiled from: ImageBitmap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u000e\u001aP\u0010\u000f\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"ImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "decodeToImageBitmap", "", "toPixelMap", "Landroidx/compose/ui/graphics/PixelMap;", "startX", "startY", "buffer", "", "bufferOffset", "stride", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ImageBitmapKt {
    public static /* synthetic */ PixelMap toPixelMap$default(ImageBitmap r1, int r2, int r3, int r4, int r5, int[] r6, int r7, int r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = r1.getWidth();
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = r1.getHeight();
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = new int[r4 * r5];
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r8 = r4;
    L24:
        return toPixelMap(r1, r2, r3, r4, r5, r6, r7, r8);
    }

    public static final PixelMap toPixelMap(ImageBitmap $this$toPixelMap, int startX, int startY, int width, int height, int[] buffer, int bufferOffset, int stride) {
        $this$toPixelMap.readPixels(buffer, startX, startY, width, height, bufferOffset, stride);
        return new PixelMap(buffer, width, height, bufferOffset, stride);
    }

    /* JADX INFO: renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static /* synthetic */ ImageBitmap m4591ImageBitmapx__hDU$default(int r0, int r1, int r2, boolean r3, Rgb r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r2 = ImageBitmapConfig.Companion.m4586getArgb8888_sVssgQ();
    L6:
        if ((r5 & 8) == 0) goto L9;
        r3 = true;
    L9:
        if ((r5 & 16) == 0) goto L12;
        r4 = ColorSpaces.INSTANCE.getSrgb();
    L12:
        return m4590ImageBitmapx__hDU(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: ImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m4590ImageBitmapx__hDU(int width, int height, int config, boolean hasAlpha, ColorSpace colorSpace) {
        return AndroidImageBitmap_androidKt.m4234ActualImageBitmapx__hDU(width, height, config, hasAlpha, colorSpace);
    }

    public static final ImageBitmap decodeToImageBitmap(byte[] $this$decodeToImageBitmap) {
        return AndroidImageBitmap_androidKt.createImageBitmap($this$decodeToImageBitmap);
    }
}
