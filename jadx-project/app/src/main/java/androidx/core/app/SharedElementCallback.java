package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SharedElementCallback {
    private static final String BUNDLE_SNAPSHOT_BITMAP = "sharedElement:snapshot:bitmap";
    private static final String BUNDLE_SNAPSHOT_IMAGE_MATRIX = "sharedElement:snapshot:imageMatrix";
    private static final String BUNDLE_SNAPSHOT_IMAGE_SCALETYPE = "sharedElement:snapshot:imageScaleType";
    private static final int MAX_IMAGE_SIZE = 1048576;
    private Matrix mTempMatrix;

    public interface OnSharedElementsReadyListener {
        void onSharedElementsReady();
    }

    public SharedElementCallback() {
    }

    public void onSharedElementStart(List<String> sharedElementNames, List<View> sharedElements, List<View> sharedElementSnapshots) {
    }

    public void onSharedElementEnd(List<String> sharedElementNames, List<View> sharedElements, List<View> sharedElementSnapshots) {
    }

    public void onRejectSharedElements(List<View> rejectedSharedElements) {
    }

    public void onMapSharedElements(List<String> names, Map<String, View> sharedElements) {
    }

    public Parcelable onCaptureSharedElementSnapshot(View sharedElement, Matrix viewToGlobalMatrix, RectF screenBounds) {
        if ((sharedElement instanceof ImageView) == false) goto L13;
        ImageView imageView = (ImageView) sharedElement;
        Drawable d = imageView.getDrawable();
        Drawable bg = imageView.getBackground();
        if (d == null) goto L13;
        if (bg != null) goto L13;
        Bitmap bitmap = createDrawableBitmap(d);
        if (bitmap == null) goto L13;
        Bundle bundle = new Bundle();
        bundle.putParcelable(BUNDLE_SNAPSHOT_BITMAP, bitmap);
        bundle.putString(BUNDLE_SNAPSHOT_IMAGE_SCALETYPE, imageView.getScaleType().toString());
        if (imageView.getScaleType() != ImageView.ScaleType.MATRIX) goto L12;
        Matrix matrix = imageView.getImageMatrix();
        float[] values = new float[9];
        matrix.getValues(values);
        bundle.putFloatArray(BUNDLE_SNAPSHOT_IMAGE_MATRIX, values);
    L12:
        return bundle;
    L13:
        int bitmapWidth = Math.round(screenBounds.width());
        int bitmapHeight = Math.round(screenBounds.height());
        if (bitmapWidth <= 0) goto L21;
        if (bitmapHeight <= 0) goto L22;
        float scale = Math.min(1.0f, 1048576.0f / (bitmapWidth * bitmapHeight));
        int bitmapWidth2 = (int) (bitmapWidth * scale);
        int bitmapHeight2 = (int) (bitmapHeight * scale);
        if (this.mTempMatrix != null) goto L19;
        this.mTempMatrix = new Matrix();
    L19:
        this.mTempMatrix.set(viewToGlobalMatrix);
        this.mTempMatrix.postTranslate(-screenBounds.left, -screenBounds.top);
        this.mTempMatrix.postScale(scale, scale);
        Bitmap bitmap2 = Bitmap.createBitmap(bitmapWidth2, bitmapHeight2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap2);
        canvas.concat(this.mTempMatrix);
        sharedElement.draw(canvas);
        return bitmap2;
    L22:
        return null;
    L21:
        return null;
    }

    private static Bitmap createDrawableBitmap(Drawable drawable) {
        int width = drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight();
        if (width <= 0) goto L14;
        if (height <= 0) goto L16;
        float scale = Math.min(1.0f, 1048576.0f / (width * height));
        if ((drawable instanceof BitmapDrawable) == true) goto L9;
    L12:
        int bitmapWidth = (int) (width * scale);
        int bitmapHeight = (int) (height * scale);
        Bitmap bitmap = Bitmap.createBitmap(bitmapWidth, bitmapHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Rect existingBounds = drawable.getBounds();
        int left = existingBounds.left;
        int top = existingBounds.top;
        int right = existingBounds.right;
        int bottom = existingBounds.bottom;
        drawable.setBounds(0, 0, bitmapWidth, bitmapHeight);
        drawable.draw(canvas);
        drawable.setBounds(left, top, right, bottom);
        return bitmap;
    L9:
        if (scale != 1.0f) goto L12;
        return ((BitmapDrawable) drawable).getBitmap();
    L16:
        return null;
    L14:
        return null;
    }

    public View onCreateSnapshotView(Context context, Parcelable snapshot) {
        if ((snapshot instanceof Bundle) == false) goto L12;
        Bundle bundle = (Bundle) snapshot;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(BUNDLE_SNAPSHOT_BITMAP);
        if (bitmap != null) goto L8;
        return null;
    L8:
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(bitmap);
        imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString(BUNDLE_SNAPSHOT_IMAGE_SCALETYPE)));
        if (imageView.getScaleType() != ImageView.ScaleType.MATRIX) goto L16;
        float[] values = bundle.getFloatArray(BUNDLE_SNAPSHOT_IMAGE_MATRIX);
        Matrix matrix = new Matrix();
        matrix.setValues(values);
        imageView.setImageMatrix(matrix);
        return imageView;
    L16:
        return imageView;
    L12:
        if ((snapshot instanceof Bitmap) == false) goto L18;
        ImageView view = new ImageView(context);
        view.setImageBitmap((Bitmap) snapshot);
        return view;
    L18:
        return null;
    }

    public void onSharedElementsArrived(List<String> sharedElementNames, List<View> sharedElements, OnSharedElementsReadyListener listener) {
        listener.onSharedElementsReady();
    }
}
