package androidx.compose.ui.draw;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0006\u0010\u0010\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/draw/ScopedGraphicsContext;", "Landroidx/compose/ui/graphics/GraphicsContext;", "()V", "allocatedGraphicsLayers", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "value", "graphicsContext", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "setGraphicsContext", "(Landroidx/compose/ui/graphics/GraphicsContext;)V", "createGraphicsLayer", "releaseGraphicsLayer", "", "layer", "releaseGraphicsLayers", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ScopedGraphicsContext implements GraphicsContext {
    private MutableObjectList<GraphicsLayer> allocatedGraphicsLayers;
    private GraphicsContext graphicsContext;

    public ScopedGraphicsContext() {
    }

    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    public final void setGraphicsContext(GraphicsContext value) {
        releaseGraphicsLayers();
        this.graphicsContext = value;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public GraphicsLayer createGraphicsLayer() {
        GraphicsContext gContext = this.graphicsContext;
        if (gContext == null) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("GraphicsContext not provided");
    L9:
        GraphicsLayer layer = gContext.createGraphicsLayer();
        MutableObjectList<GraphicsLayer> r2 = this.allocatedGraphicsLayers;
        if (r2 != null) goto L12;
        this.allocatedGraphicsLayers = ObjectListKt.mutableObjectListOf(layer);
    L13:
        return layer;
    L12:
        r2.add(layer);
        goto L13
    L5:
        value$iv = false;
        goto L7
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public void releaseGraphicsLayer(GraphicsLayer layer) {
        GraphicsContext r0 = this.graphicsContext;
        if (r0 == null) goto L6;
        r0.releaseGraphicsLayer(layer);
        return;
    }

    public final void releaseGraphicsLayers() {
        MutableObjectList<GraphicsLayer> r0 = this.allocatedGraphicsLayers;
        if (r0 == null) goto L10;
        MutableObjectList<GraphicsLayer> this_$iv = r0;
        Object[] content$iv = this_$iv.content;
        int i$iv = 0;
        int r6 = this_$iv._size;
    L5:
        if (i$iv >= r6) goto L7;
        GraphicsLayer layer = (GraphicsLayer) content$iv[i$iv];
        releaseGraphicsLayer(layer);
        i$iv = i$iv + 1;
        goto L5
    L7:
        r0.clear();
        return;
    }
}
