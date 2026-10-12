package androidx.compose.ui.graphics;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerV23;
import androidx.compose.ui.graphics.layer.GraphicsLayerV29;
import androidx.compose.ui.graphics.layer.GraphicsViewLayer;
import androidx.compose.ui.graphics.layer.LayerManager;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\bJ\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0011H\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/AndroidGraphicsContext;", "Landroidx/compose/ui/graphics/GraphicsContext;", "ownerView", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "componentCallback", "Landroid/content/ComponentCallbacks2;", "componentCallbackRegistered", "", "layerManager", "Landroidx/compose/ui/graphics/layer/LayerManager;", "lock", "", "predrawListenerRegistered", "viewLayerContainer", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "createGraphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getUniqueDrawingId", "", "view", "Landroid/view/View;", "isLayerManagerInitialized", "obtainViewLayerContainer", "registerComponentCallback", "", "context", "Landroid/content/Context;", "releaseGraphicsLayer", "layer", "unregisterComponentCallback", "Companion", "UniqueDrawingIdApi29", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AndroidGraphicsContext implements GraphicsContext {
    public static final Companion Companion = null;
    public static final boolean enableLayerPersistence = false;
    private static boolean isRenderNodeCompatible;
    private final ComponentCallbacks2 componentCallback;
    private boolean componentCallbackRegistered;
    private final LayerManager layerManager;
    private final Object lock;
    private final ViewGroup ownerView;
    private boolean predrawListenerRegistered;
    private DrawChildContainer viewLayerContainer;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"androidx/compose/ui/graphics/AndroidGraphicsContext$1", "Landroid/content/ComponentCallbacks2;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "onTrimMemory", "level", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements ComponentCallbacks2 {
        final /* synthetic */ AndroidGraphicsContext this$0;

        AnonymousClass1(AndroidGraphicsContext $receiver) {
            this.this$0 = $receiver;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            if (level >= 40) goto L5;
            return;
        L5:
            if (AndroidGraphicsContext.access$getPredrawListenerRegistered$p(this.this$0) == true) goto L9;
            AndroidGraphicsContext.access$getLayerManager$p(this.this$0).destroy();
            ViewTreeObserver r0 = AndroidGraphicsContext.access$getOwnerView$p(this.this$0).getViewTreeObserver();
            final AndroidGraphicsContext r2 = this.this$0;
            r0.addOnPreDrawListener(new AndroidGraphicsContext$1$onTrimMemory$1(r2));
            AndroidGraphicsContext.access$setPredrawListenerRegistered$p(this.this$0, true);
            return;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"androidx/compose/ui/graphics/AndroidGraphicsContext$2", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 implements View.OnAttachStateChangeListener {
        final /* synthetic */ AndroidGraphicsContext this$0;

        AnonymousClass2(AndroidGraphicsContext $receiver) {
            this.this$0 = $receiver;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            AndroidGraphicsContext.access$registerComponentCallback(this.this$0, v.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            AndroidGraphicsContext.access$unregisterComponentCallback(this.this$0, v.getContext());
            AndroidGraphicsContext.access$getLayerManager$p(this.this$0).destroy();
        }
    }

    /* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/AndroidGraphicsContext$Companion;", "", "()V", "enableLayerPersistence", "", "isRenderNodeCompatible", "()Z", "setRenderNodeCompatible", "(Z)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final boolean isRenderNodeCompatible() {
            return AndroidGraphicsContext.access$isRenderNodeCompatible$cp();
        }

        public final void setRenderNodeCompatible(boolean r1) {
            AndroidGraphicsContext.access$setRenderNodeCompatible$cp(r1);
        }
    }

    /* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/AndroidGraphicsContext$UniqueDrawingIdApi29;", "", "()V", "getUniqueDrawingId", "", "view", "Landroid/view/View;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = null;

        static {
            INSTANCE = new UniqueDrawingIdApi29();
        }

        private UniqueDrawingIdApi29() {
        }

        @JvmStatic
        public static final long getUniqueDrawingId(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public AndroidGraphicsContext(ViewGroup ownerView) {
        this.ownerView = ownerView;
        this.lock = new Object();
        this.layerManager = null;
        this.componentCallback = null;
    }

    public static final /* synthetic */ LayerManager access$getLayerManager$p(AndroidGraphicsContext $this) {
        return $this.layerManager;
    }

    public static final /* synthetic */ ViewGroup access$getOwnerView$p(AndroidGraphicsContext $this) {
        return $this.ownerView;
    }

    public static final /* synthetic */ boolean access$getPredrawListenerRegistered$p(AndroidGraphicsContext $this) {
        return $this.predrawListenerRegistered;
    }

    public static final /* synthetic */ boolean access$isRenderNodeCompatible$cp() {
        return isRenderNodeCompatible;
    }

    public static final /* synthetic */ void access$registerComponentCallback(AndroidGraphicsContext $this, Context context) {
        $this.registerComponentCallback(context);
    }

    public static final /* synthetic */ void access$setPredrawListenerRegistered$p(AndroidGraphicsContext $this, boolean r1) {
        $this.predrawListenerRegistered = r1;
    }

    public static final /* synthetic */ void access$setRenderNodeCompatible$cp(boolean r0) {
        isRenderNodeCompatible = r0;
    }

    public static final /* synthetic */ void access$unregisterComponentCallback(AndroidGraphicsContext $this, Context context) {
        $this.unregisterComponentCallback(context);
    }

    public final boolean isLayerManagerInitialized() {
        LayerManager r0 = this.layerManager;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.hasImageReader();
    }

    private final void registerComponentCallback(Context context) {
        if (this.componentCallbackRegistered == true) goto L6;
        context.getApplicationContext().registerComponentCallbacks(this.componentCallback);
        this.componentCallbackRegistered = true;
        return;
    }

    private final void unregisterComponentCallback(Context context) {
        if (this.componentCallbackRegistered == false) goto L6;
        context.getApplicationContext().unregisterComponentCallbacks(this.componentCallback);
        this.componentCallbackRegistered = false;
        return;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public GraphicsLayer createGraphicsLayer() {
        Object r1 = this.lock;
        monitor-enter(r1);
        long ownerId = getUniqueDrawingId(this.ownerView);     // Catch: Throwable -> L20
        if (Build.VERSION.SDK_INT < 29) goto L9;
        CanvasHolder r8 = null;
        CanvasDrawScope r9 = null;
        GraphicsViewLayer layerImpl = new GraphicsLayerV29(ownerId, r8, r9, 6, null);     // Catch: Throwable -> L20
    L17:
        GraphicsLayer r0 = new GraphicsLayer(layerImpl, this.layerManager);     // Catch: Throwable -> L20
        monitor-exit(r1);
        return r0;
    L9:
        if (isRenderNodeCompatible == true) goto L23;
        CanvasHolder r10 = null;
        CanvasDrawScope r11 = null;
        layerImpl = new GraphicsViewLayer(obtainViewLayerContainer(this.ownerView), ownerId, r10, r11, 12, null);     // Catch: Throwable -> L20
        goto L17
    L23:
        CanvasHolder r12 = null;
        CanvasDrawScope r13 = null;
        layerImpl = new GraphicsLayerV23(this.ownerView, ownerId, r12, r13, 12, null);     // Catch: Throwable -> L12
    L14:
        isRenderNodeCompatible = false;     // Catch: Throwable -> L20
        CanvasHolder r14 = null;
        CanvasDrawScope r15 = null;
        layerImpl = new GraphicsViewLayer(obtainViewLayerContainer(this.ownerView), ownerId, r14, r15, 12, null);     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public void releaseGraphicsLayer(GraphicsLayer layer) {
        Object r0 = this.lock;
        monitor-enter(r0);
        layer.release$ui_graphics_release();     // Catch: Throwable -> L8
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(r0);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    private final DrawChildContainer obtainViewLayerContainer(ViewGroup ownerView) {
        DrawChildContainer container = this.viewLayerContainer;
        if (container != null) goto L6;
        Context context = ownerView.getContext();
        DrawChildContainer container2 = new ViewLayerContainer(context);
        ownerView.addView(container2);
        this.viewLayerContainer = container2;
        return container2;
    L6:
        return container;
    }

    private final long getUniqueDrawingId(View view) {
        if (Build.VERSION.SDK_INT >= 29) goto L7;
        return -1;
    L7:
        return UniqueDrawingIdApi29.getUniqueDrawingId(view);
    }

    static {
        Companion = new Companion(null);
        isRenderNodeCompatible = true;
    }
}
