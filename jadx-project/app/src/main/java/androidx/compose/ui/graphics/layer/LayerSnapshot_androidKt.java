package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayerSnapshot.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/media/Image;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LayerSnapshot_androidKt {
    public static final /* synthetic */ Bitmap access$toBitmap(Image $receiver) {
        return toBitmap($receiver);
    }

    private static final Bitmap toBitmap(Image $this$toBitmap) {
        Image.Plane[] it = $this$toBitmap.getPlanes();
        Intrinsics.checkNotNull(it);
        Image.Plane plane = it[0];
        int pixelCount = $this$toBitmap.getWidth() * $this$toBitmap.getHeight();
        int[] colors = new int[pixelCount];
        plane.getBuffer().asIntBuffer().get(colors);
        int i = 0;
    L3:
        if (i >= pixelCount) goto L5;
        int color = colors[i];
        int red = color & 255;
        int green = (color >> 8) & 255;
        int blue = (color >> 16) & 255;
        int alpha = (color >> 24) & 255;
        colors[i] = ColorKt.m4420toArgb8_81llA(ColorKt.Color(red, green, blue, alpha));
        i = i + 1;
        goto L3
    L5:
        int i2 = $this$toBitmap.getWidth();
        return Bitmap.createBitmap(colors, i2, $this$toBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    }
}
