package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class PaintCompat {
    private static final String EM_STRING = "m";
    private static final String TOFU_STRING = "\udfffd";
    private static final ThreadLocal<Pair<Rect, Rect>> sRectThreadLocal = null;

    static class Api23Impl {
        private Api23Impl() {
        }

        static boolean hasGlyph(Paint paint, String string) {
            return paint.hasGlyph(string);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void setBlendMode(Paint paint, Object blendmode) {
            paint.setBlendMode((BlendMode) blendmode);
        }
    }

    static {
        sRectThreadLocal = new ThreadLocal();
    }

    public static boolean hasGlyph(Paint paint, String string) {
        return Api23Impl.hasGlyph(paint, string);
    }

    public static boolean setBlendMode(Paint r4, BlendModeCompat r5) {
        PorterDuffXfermode r3 = null;
        Object r6 = null;
        if (Build.VERSION.SDK_INT < 29) goto L9;
        if (r5 == null) goto L7;
        r6 = BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(r5);
    L7:
        Api29Impl.setBlendMode(r4, r6);
        return true;
    L9:
        if (r5 == null) goto L18;
        PorterDuff.Mode r0 = BlendModeUtils.obtainPorterDuffFromCompat(r5);
        if (r0 == null) goto L13;
        r3 = new PorterDuffXfermode(r0);
    L13:
        r4.setXfermode(r3);
        if (r0 != null) goto L20;
        return false;
    L20:
        return true;
    L18:
        r4.setXfermode(null);
        return true;
    }

    private static Pair<Rect, Rect> obtainEmptyRects() {
        Pair<Rect, Rect> rects = sRectThreadLocal.get();
        if (rects != null) goto L5;
        Pair<Rect, Rect> rects2 = new Pair(new Rect(), new Rect());
        sRectThreadLocal.set(rects2);
        return rects2;
    L5:
        rects.first.setEmpty();
        rects.second.setEmpty();
        return rects;
    }

    private PaintCompat() {
    }
}
