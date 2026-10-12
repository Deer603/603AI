package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class BlendModeColorFilterCompat {

    static class Api29Impl {
        private Api29Impl() {
        }

        static ColorFilter createBlendModeColorFilter(int color, Object mode) {
            return new BlendModeColorFilter(color, (BlendMode) mode);
        }
    }

    public static ColorFilter createBlendModeColorFilterCompat(int color, BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT < 29) goto L9;
        Object blendMode = BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(blendModeCompat);
        if (blendMode != null) goto L8;
        return null;
    L8:
        return Api29Impl.createBlendModeColorFilter(color, blendMode);
    L9:
        PorterDuff.Mode porterDuffMode = BlendModeUtils.obtainPorterDuffFromCompat(blendModeCompat);
        if (porterDuffMode != null) goto L13;
        return null;
    L13:
        return new PorterDuffColorFilter(color, porterDuffMode);
    }

    private BlendModeColorFilterCompat() {
    }
}
