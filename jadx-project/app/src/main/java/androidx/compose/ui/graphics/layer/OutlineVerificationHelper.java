package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/layer/OutlineVerificationHelper;", "", "()V", "setPath", "", "outline", "Landroid/graphics/Outline;", "path", "Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OutlineVerificationHelper {
    public static final OutlineVerificationHelper INSTANCE = null;

    static {
        INSTANCE = new OutlineVerificationHelper();
    }

    private OutlineVerificationHelper() {
    }

    public final void setPath(Outline outline, Path path) {
        if ((path instanceof AndroidPath) == false) goto L7;
        outline.setPath(((AndroidPath) path).getInternalPath());
        return;
    L7:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
