package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Drawable.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a,\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a2\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "toBitmapOrNull", "updateBounds", "", "left", "top", "right", "bottom", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DrawableKt {
    public static /* synthetic */ Bitmap toBitmap$default(Drawable r0, int r1, int r2, Bitmap.Config r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.getIntrinsicWidth();
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.getIntrinsicHeight();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = null;
    L12:
        return toBitmap(r0, r1, r2, r3);
    }

    public static final Bitmap toBitmap(Drawable $this$toBitmap, int width, int height, Bitmap.Config config) {
        if (($this$toBitmap instanceof BitmapDrawable) == true) goto L5;
    L19:
        Rect $this$component4$iv = $this$toBitmap.getBounds();
        int oldLeft = $this$component4$iv.left;
        int oldTop = $this$component4$iv.top;
        int oldRight = $this$component4$iv.right;
        int oldBottom = $this$component4$iv.bottom;
        if (config != null) goto L22;
        Bitmap.Config r4 = Bitmap.Config.ARGB_8888;
    L23:
        Bitmap bitmap = Bitmap.createBitmap(width, height, r4);
        $this$toBitmap.setBounds(0, 0, width, height);
        $this$toBitmap.draw(new Canvas(bitmap));
        $this$toBitmap.setBounds(oldLeft, oldTop, oldRight, oldBottom);
        return bitmap;
    L22:
        r4 = config;
        goto L23
    L5:
        if (((BitmapDrawable) $this$toBitmap).getBitmap() == null) goto L18;
        if (config == null) goto L10;
        if (((BitmapDrawable) $this$toBitmap).getBitmap().getConfig() != config) goto L19;
    L10:
        if (width != ((BitmapDrawable) $this$toBitmap).getBitmap().getWidth()) goto L16;
        if (height != ((BitmapDrawable) $this$toBitmap).getBitmap().getHeight()) goto L16;
        return ((BitmapDrawable) $this$toBitmap).getBitmap();
    L16:
        return Bitmap.createScaledBitmap(((BitmapDrawable) $this$toBitmap).getBitmap(), width, height, true);
    L18:
        throw new IllegalArgumentException("bitmap is null");
    }

    public static /* synthetic */ Bitmap toBitmapOrNull$default(Drawable r0, int r1, int r2, Bitmap.Config r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.getIntrinsicWidth();
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.getIntrinsicHeight();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = null;
    L12:
        return toBitmapOrNull(r0, r1, r2, r3);
    }

    public static final Bitmap toBitmapOrNull(Drawable $this$toBitmapOrNull, int width, int height, Bitmap.Config config) {
        if (($this$toBitmapOrNull instanceof BitmapDrawable) == false) goto L9;
        if (((BitmapDrawable) $this$toBitmapOrNull).getBitmap() != null) goto L9;
        return null;
    L9:
        return toBitmap($this$toBitmapOrNull, width, height, config);
    }

    public static /* synthetic */ void updateBounds$default(Drawable r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.getBounds().left;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.getBounds().top;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.getBounds().right;
    L12:
        if ((r5 & 8) == 0) goto L14;
        r4 = r0.getBounds().bottom;
    L14:
        updateBounds(r0, r1, r2, r3, r4);
    }

    public static final void updateBounds(Drawable $this$updateBounds, int left, int top, int right, int bottom) {
        $this$updateBounds.setBounds(left, top, right, bottom);
    }
}
