package androidx.compose.ui.platform;

import android.view.ViewParent;
import kotlin.Metadata;

/* JADX INFO: compiled from: RenderNodeLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/WrapperRenderNodeLayerHelperMethods;", "", "()V", "onDescendantInvalidated", "", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WrapperRenderNodeLayerHelperMethods {
    public static final int $stable = 0;
    public static final WrapperRenderNodeLayerHelperMethods INSTANCE = null;

    static {
        INSTANCE = new WrapperRenderNodeLayerHelperMethods();
    }

    private WrapperRenderNodeLayerHelperMethods() {
    }

    public final void onDescendantInvalidated(AndroidComposeView ownerView) {
        ViewParent r0 = ownerView.getParent();
        if (r0 == null) goto L6;
        r0.onDescendantInvalidated(ownerView, ownerView);
        return;
    }
}
