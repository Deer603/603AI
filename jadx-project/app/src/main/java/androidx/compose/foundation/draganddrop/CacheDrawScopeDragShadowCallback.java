package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidDragAndDropSource.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;", "", "()V", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "cachePicture", "Landroidx/compose/ui/draw/DrawResult;", "scope", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawDragShadow", "", "drawScope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CacheDrawScopeDragShadowCallback {
    public static final int $stable = 0;
    private GraphicsLayer graphicsLayer;

    static {
        $stable = 8;
    }

    public CacheDrawScopeDragShadowCallback() {
    }

    public static final /* synthetic */ GraphicsLayer access$getGraphicsLayer$p(CacheDrawScopeDragShadowCallback $this) {
        return $this.graphicsLayer;
    }

    public final void drawDragShadow(DrawScope drawScope) {
        GraphicsLayer layer = this.graphicsLayer;
        if (layer == null) goto L7;
        GraphicsLayerKt.drawLayer(drawScope, layer);
        return;
    L7:
        throw new IllegalArgumentException("No cached drag shadow. Check if the drag source node was rendered first");
    }

    public final DrawResult cachePicture(CacheDrawScope scope) {
        GraphicsLayer $this$cachePicture_u24lambda_u242_u24lambda_u241 = scope.obtainGraphicsLayer();
        CacheDrawScope.m3985recordTdoYBX4$default(scope, $this$cachePicture_u24lambda_u242_u24lambda_u241, null, null, 0, CacheDrawScopeDragShadowCallback$cachePicture$1$1$1.INSTANCE, 7, null);
        this.graphicsLayer = $this$cachePicture_u24lambda_u242_u24lambda_u241;
        return scope.onDrawWithContent(new CacheDrawScopeDragShadowCallback$cachePicture$1$2(this));
    }
}
