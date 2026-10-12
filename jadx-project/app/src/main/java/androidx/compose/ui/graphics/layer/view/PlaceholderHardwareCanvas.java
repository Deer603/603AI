package androidx.compose.ui.graphics.layer.view;

import android.graphics.Rect;
import android.view.HardwareCanvas;
import android.view.RenderNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlaceholderHardwareCanvas.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/layer/view/PlaceholderHardwareCanvas;", "Landroid/view/HardwareCanvas;", "()V", "drawRenderNode", "", "renderNode", "Landroid/view/RenderNode;", "dirty", "Landroid/graphics/Rect;", "flags", "isHardwareAccelerated", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PlaceholderHardwareCanvas extends HardwareCanvas {
    public PlaceholderHardwareCanvas() {
    }

    public int drawRenderNode(RenderNode renderNode, Rect dirty, int flags) {
        return 0;
    }

    public boolean isHardwareAccelerated() {
        return true;
    }
}
