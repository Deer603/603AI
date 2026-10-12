package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.core.os.HandlerCompat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayerManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\rJ\u0016\u0010\u0017\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\rJ\u0006\u0010\u001b\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerManager;", "", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "(Landroidx/compose/ui/graphics/CanvasHolder;)V", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "handler", "Landroid/os/Handler;", "imageReader", "Landroid/media/ImageReader;", "layerSet", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "persistenceIterationInProgress", "", "postponedReleaseRequests", "Landroidx/collection/MutableObjectList;", "destroy", "", "hasImageReader", "persist", "layer", "persistLayers", "layers", "Landroidx/collection/ScatterSet;", "release", "updateLayerPersistence", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayerManager {
    public static final Companion Companion = null;
    private static final boolean isRobolectric = false;
    private final CanvasHolder canvasHolder;
    private final Handler handler;
    private ImageReader imageReader;
    private final MutableScatterSet<GraphicsLayer> layerSet;
    private boolean persistenceIterationInProgress;
    private MutableObjectList<GraphicsLayer> postponedReleaseRequests;

    /* JADX INFO: compiled from: LayerManager.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerManager$Companion;", "", "()V", "isRobolectric", "", "()Z", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final boolean isRobolectric() {
            return LayerManager.access$isRobolectric$cp();
        }
    }

    public LayerManager(CanvasHolder canvasHolder) {
        this.canvasHolder = canvasHolder;
        this.layerSet = ScatterSetKt.mutableScatterSetOf();
        this.handler = HandlerCompat.createAsync(Looper.getMainLooper(), new LayerManager$$ExternalSyntheticLambda1(this));
    }

    public static final /* synthetic */ boolean access$isRobolectric$cp() {
        return isRobolectric;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    static final boolean handler$lambda$0(LayerManager this$0, Message it) {
        this$0.persistLayers(this$0.layerSet);
        return true;
    }

    public final void persist(GraphicsLayer layer) {
        this.layerSet.add(layer);
        if (this.handler.hasMessages(0) == true) goto L6;
        this.handler.sendMessageAtFrontOfQueue(Message.obtain());
        return;
    }

    public final void release(GraphicsLayer layer) {
        if (this.persistenceIterationInProgress == false) goto L5;
        MutableObjectList<GraphicsLayer> r0 = this.postponedReleaseRequests;
        if (r0 != null) goto L10;
        int r4 = 0;
        r0 = new MutableObjectList(r4, 1, null);
        this.postponedReleaseRequests = r0;
    L10:
        r0.add(layer);
        return;
    L5:
        if (this.layerSet.remove(layer) == false) goto L12;
        layer.discardDisplayList$ui_graphics_release();
        return;
    }

    private final void persistLayers(ScatterSet<GraphicsLayer> r32) {
        if (1 != 0) goto L5;
    L9:
        boolean shouldPersistLayers = false;
    L10:
        if (shouldPersistLayers == false) goto L44;
        ImageReader $this$persistLayers_u24lambda_u243 = this.imageReader;
        if ($this$persistLayers_u24lambda_u243 != null) goto L14;
        $this$persistLayers_u24lambda_u243 = ImageReader.newInstance(1, 1, 1, 3);
        $this$persistLayers_u24lambda_u243.setOnImageAvailableListener(new LayerManager$$ExternalSyntheticLambda0(), this.handler);
        this.imageReader = $this$persistLayers_u24lambda_u243;
    L14:
        Surface surface = $this$persistLayers_u24lambda_u243.getSurface();
        Canvas canvas = LockHardwareCanvasHelper.INSTANCE.lockHardwareCanvas(surface);
        this.persistenceIterationInProgress = true;
        CanvasHolder this_$iv = this.canvasHolder;
        int $i$f$drawInto = 0;
        Canvas previousCanvas$iv = this_$iv.getAndroidCanvas().getInternalCanvas();
        this_$iv.getAndroidCanvas().setInternalCanvas(canvas);
        androidx.compose.ui.graphics.Canvas $this$persistLayers_u24lambda_u246 = this_$iv.getAndroidCanvas();
        canvas.save();
        canvas.clipRect(0, 0, 1, 1);
        Object[] elements$iv = r32.elements;
        long[] m$iv$iv = r32.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L32;
    L16:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long[] m$iv$iv2 = m$iv$iv;
        boolean shouldPersistLayers2 = shouldPersistLayers;
        CanvasHolder this_$iv2 = this_$iv;
        int $i$f$drawInto2 = $i$f$drawInto;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L30;
        int r4 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L19:
        if (j$iv$iv >= bitCount$iv$iv) goto L29;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L23;
        int $i$f$isFull = 1;
    L24:
        if ($i$f$isFull == 0) goto L27;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        GraphicsLayer layer = (GraphicsLayer) elements$iv[index$iv$iv];
        layer.drawForPersistence$ui_graphics_release($this$persistLayers_u24lambda_u246);
    L27:
        slot$iv$iv = slot$iv$iv >> r4;
        j$iv$iv = j$iv$iv + 1;
        r4 = r4;
        goto L19
    L23:
        $i$f$isFull = 0;
        goto L24
    L29:
        if (bitCount$iv$iv == r4) goto L30;
    L34:
        canvas.restore();
        this_$iv2.getAndroidCanvas().setInternalCanvas(previousCanvas$iv);
        this.persistenceIterationInProgress = false;
        MutableObjectList<GraphicsLayer> r1 = this.postponedReleaseRequests;
        if (r1 != null) goto L37;
    L42:
        surface.unlockCanvasAndPost(canvas);
        return;
    L37:
        if (r1.isNotEmpty() == false) goto L42;
        MutableObjectList<GraphicsLayer> this_$iv3 = r1;
        Object[] content$iv = this_$iv3.content;
        int i$iv = 0;
        int r9 = this_$iv3._size;
    L39:
        if (i$iv >= r9) goto L41;
        GraphicsLayer it = (GraphicsLayer) content$iv[i$iv];
        release(it);
        i$iv = i$iv + 1;
        goto L39
    L41:
        r1.clear();
    L30:
        if (i$iv$iv == lastIndex$iv$iv) goto L34;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$drawInto = $i$f$drawInto2;
        shouldPersistLayers = shouldPersistLayers2;
        m$iv$iv = m$iv$iv2;
        goto L16
    L32:
        this_$iv2 = this_$iv;
        goto L34
    L44:
        return;
    L5:
        if (r32.isNotEmpty() == false) goto L9;
        if (isRobolectric == true) goto L9;
        shouldPersistLayers = true;
        goto L10
    }

    static final void persistLayers$lambda$3$lambda$2(ImageReader it) {
        if (it == null) goto L7;
        Image r0 = it.acquireLatestImage();
        if (r0 == null) goto L8;
        r0.close();
        return;
    L8:
        return;
    }

    public final void destroy() {
        ImageReader r0 = this.imageReader;
        if (r0 == null) goto L5;
        r0.close();
    L5:
        this.imageReader = null;
    }

    public final boolean hasImageReader() {
        if (this.imageReader == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final void updateLayerPersistence() {
        destroy();
        persistLayers(this.layerSet);
    }

    static {
        Companion = new Companion(null);
        String r0 = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r0, "toLowerCase(...)");
        isRobolectric = Intrinsics.areEqual(r0, "robolectric");
    }
}
