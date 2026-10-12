package androidx.compose.ui.graphics.layer;

import android.view.View;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;

/* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayerVerificationHelper31;", "", "()V", "setRenderEffect", "", "view", "Landroid/view/View;", "target", "Landroidx/compose/ui/graphics/RenderEffect;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ViewLayerVerificationHelper31 {
    public static final ViewLayerVerificationHelper31 INSTANCE = null;

    static {
        INSTANCE = new ViewLayerVerificationHelper31();
    }

    private ViewLayerVerificationHelper31() {
    }

    public final void setRenderEffect(View view, RenderEffect target) {
        if (target == null) goto L4;
        android.graphics.RenderEffect r0 = target.asAndroidRenderEffect();
    L5:
        view.setRenderEffect(r0);
        return;
    L4:
        r0 = null;
        goto L5
    }
}
