package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import androidx.core.graphics.BitmapCompat;
import androidx.core.view.GravityCompat;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class RoundedBitmapDrawableFactory {
    private static final String TAG = "RoundedBitmapDrawableFa";

    private static class DefaultRoundedBitmapDrawable extends RoundedBitmapDrawable {
        DefaultRoundedBitmapDrawable(Resources res, Bitmap bitmap) {
            super(res, bitmap);
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public void setMipMap(boolean mipMap) {
            if (this.mBitmap == null) goto L6;
            BitmapCompat.setHasMipMap(this.mBitmap, mipMap);
            invalidateSelf();
            return;
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public boolean hasMipMap() {
            if (this.mBitmap != null) goto L5;
        L7:
            return false;
        L5:
            if (BitmapCompat.hasMipMap(this.mBitmap) == false) goto L7;
            return true;
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        void gravityCompatApply(int gravity, int bitmapWidth, int bitmapHeight, Rect bounds, Rect outRect) {
            GravityCompat.apply(gravity, bitmapWidth, bitmapHeight, bounds, outRect, 0);
        }
    }

    public static RoundedBitmapDrawable create(Resources res, Bitmap bitmap) {
        return new RoundedBitmapDrawable21(res, bitmap);
    }

    public static RoundedBitmapDrawable create(Resources res, String filepath) {
        RoundedBitmapDrawable drawable = create(res, BitmapFactory.decodeFile(filepath));
        if (drawable.getBitmap() != null) goto L5;
        Log.w(TAG, "RoundedBitmapDrawable cannot decode " + filepath);
    L5:
        return drawable;
    }

    public static RoundedBitmapDrawable create(Resources res, InputStream is) {
        RoundedBitmapDrawable drawable = create(res, BitmapFactory.decodeStream(is));
        if (drawable.getBitmap() != null) goto L5;
        Log.w(TAG, "RoundedBitmapDrawable cannot decode " + is);
    L5:
        return drawable;
    }

    private RoundedBitmapDrawableFactory() {
    }
}
