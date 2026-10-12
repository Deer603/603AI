package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.autofill.HintConstants;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 q2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002qrB]\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00128\u0010\b\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0002\u0010\u0013J\b\u0010B\u001a\u00020\u0010H\u0016J\u0010\u0010C\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020DH\u0014J\u001a\u0010E\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010F\u001a\u00020\u0010H\u0016J\b\u0010G\u001a\u00020 H\u0016J\b\u0010H\u001a\u00020\u0010H\u0016J\u001a\u0010I\u001a\u00020\u00102\u0006\u0010J\u001a\u00020?H\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001a\u0010M\u001a\u00020 2\u0006\u0010N\u001a\u00020OH\u0016ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ\u0018\u0010R\u001a\u00020\u00102\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020 H\u0016J\"\u0010V\u001a\u00020O2\u0006\u0010W\u001a\u00020O2\u0006\u0010U\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\u001a\u0010Z\u001a\u00020\u00102\u0006\u0010N\u001a\u00020[H\u0016ø\u0001\u0000¢\u0006\u0004\b\\\u0010]J0\u0010^\u001a\u00020\u00102\u0006\u0010_\u001a\u00020 2\u0006\u0010`\u001a\u0002072\u0006\u0010a\u001a\u0002072\u0006\u0010b\u001a\u0002072\u0006\u0010c\u001a\u000207H\u0014J\b\u0010d\u001a\u00020\u0010H\u0002J\u001a\u0010e\u001a\u00020\u00102\u0006\u0010f\u001a\u00020gH\u0016ø\u0001\u0000¢\u0006\u0004\bh\u0010]JP\u0010i\u001a\u00020\u001028\u0010\b\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0016J\u001a\u0010j\u001a\u00020\u00102\u0006\u0010J\u001a\u00020?H\u0016ø\u0001\u0000¢\u0006\u0004\bk\u0010LJ\b\u0010l\u001a\u00020\u0010H\u0016J\u0010\u0010m\u001a\u00020\u00102\u0006\u0010n\u001a\u00020oH\u0016J\b\u0010p\u001a\u00020\u0010H\u0002R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"RB\u0010\b\u001a6\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010$\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020 @BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\u00020.X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010/R\u0016\u00100\u001a\u0004\u0018\u0001018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\u000105X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010+R\u001a\u0010>\u001a\u00020?8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b@\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006s"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "container", "Landroidx/compose/ui/platform/DrawChildContainer;", "drawBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "", "invalidateParentLayer", "Lkotlin/Function0;", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "value", "", "cameraDistancePx", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipBoundsCache", "Landroid/graphics/Rect;", "clipToBounds", "", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "drawnWithZ", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "layerId", "", "getLayerId", "()J", "mHasOverlappingRendering", "mTransformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "manualClipPath", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "matrixCache", "Landroidx/compose/ui/platform/LayerMatrixCache;", "mutatedFields", "", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerViewId", "getOwnerViewId", "underlyingMatrix", "Landroidx/compose/ui/graphics/Matrix;", "getUnderlyingMatrix-sQKQjiQ", "()[F", "destroy", "dispatchDraw", "Landroid/graphics/Canvas;", "drawLayer", "forceLayout", "hasOverlappingRendering", "invalidate", "inverseTransform", "matrix", "inverseTransform-58bKbWc", "([F)V", "isInLayer", "position", "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "onLayout", "changed", "l", "t", "r", "b", "resetClipBounds", "resize", "size", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "reuseLayer", "transform", "transform-58bKbWc", "updateDisplayList", "updateLayerProperties", "scope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "updateOutlineResolver", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final ViewOutlineProvider OutlineProvider = null;
    private static final Function2<View, Matrix, Unit> getMatrix = null;
    private static boolean hasRetrievedMethod;
    private static Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;
    private static Method updateDisplayListIfDirtyMethod;
    private final CanvasHolder canvasHolder;
    private Rect clipBoundsCache;
    private boolean clipToBounds;
    private final DrawChildContainer container;
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock;
    private boolean drawnWithZ;
    private Function0<Unit> invalidateParentLayer;
    private boolean isInvalidated;
    private final long layerId;
    private boolean mHasOverlappingRendering;
    private long mTransformOrigin;
    private final LayerMatrixCache<View> matrixCache;
    private int mutatedFields;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\tH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "()V", "OutlineProvider", "Landroid/view/ViewOutlineProvider;", "getOutlineProvider", "()Landroid/view/ViewOutlineProvider;", "getMatrix", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/graphics/Matrix;", "", "<set-?>", "", "hasRetrievedMethod", "getHasRetrievedMethod", "()Z", "recreateDisplayList", "Ljava/lang/reflect/Field;", "shouldUseDispatchDraw", "getShouldUseDispatchDraw", "setShouldUseDispatchDraw$ui_release", "(Z)V", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "updateDisplayList", "view", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.access$getOutlineProvider$cp();
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.access$getHasRetrievedMethod$cp();
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.access$getShouldUseDispatchDraw$cp();
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean r1) {
            ViewLayer.access$setShouldUseDispatchDraw$cp(r1);
        }

        public final void updateDisplayList(View view) {
            if (getHasRetrievedMethod() == true) goto L18;
            ViewLayer.access$setHasRetrievedMethod$cp(true);     // Catch: Throwable -> L25
            if (Build.VERSION.SDK_INT >= 28) goto L9;
            ViewLayer.access$setUpdateDisplayListIfDirtyMethod$cp(View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]));     // Catch: Throwable -> L25
            ViewLayer.access$setRecreateDisplayList$cp(View.class.getDeclaredField("mRecreateDisplayList"));     // Catch: Throwable -> L25
        L10:
            Method getDeclaredMethod = ViewLayer.access$getUpdateDisplayListIfDirtyMethod$cp();     // Catch: Throwable -> L25
            if (getDeclaredMethod == null) goto L14;
            getDeclaredMethod.setAccessible(true);     // Catch: Throwable -> L25
        L14:
            Field r1 = ViewLayer.access$getRecreateDisplayList$cp();     // Catch: Throwable -> L25
            if (r1 == null) goto L18;
            r1.setAccessible(true);     // Catch: Throwable -> L25
            goto L18
        L9:
            ViewLayer.access$setUpdateDisplayListIfDirtyMethod$cp((Method) Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()}).invoke(View.class, new Object[]{"updateDisplayListIfDirty", new Class[0]}));     // Catch: Throwable -> L25
            Method getDeclaredField = Class.class.getDeclaredMethod("getDeclaredField", new Class[]{String.class});     // Catch: Throwable -> L25
            ViewLayer.access$setRecreateDisplayList$cp((Field) getDeclaredField.invoke(View.class, new Object[]{"mRecreateDisplayList"}));     // Catch: Throwable -> L25
        L18:
            Field r2 = ViewLayer.access$getRecreateDisplayList$cp();     // Catch: Throwable -> L25
            if (r2 == null) goto L21;
            r2.setBoolean(view, true);     // Catch: Throwable -> L25
        L21:
            Method r3 = ViewLayer.access$getUpdateDisplayListIfDirtyMethod$cp();     // Catch: Throwable -> L25
            if (r3 == null) goto L30;
            r3.invoke(view, new Object[0]);     // Catch: Throwable -> L25
            return;
        L30:
            return;
        L26:
            setShouldUseDispatchDraw$ui_release(true);
        }
    }

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$UniqueDrawingIdApi29;", "", "()V", "getUniqueDrawingId", "", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public static final /* synthetic */ boolean access$getHasRetrievedMethod$cp() {
        return hasRetrievedMethod;
    }

    public static final /* synthetic */ ViewOutlineProvider access$getOutlineProvider$cp() {
        return OutlineProvider;
    }

    public static final /* synthetic */ OutlineResolver access$getOutlineResolver$p(ViewLayer $this) {
        return $this.outlineResolver;
    }

    public static final /* synthetic */ Field access$getRecreateDisplayList$cp() {
        return recreateDisplayList;
    }

    public static final /* synthetic */ boolean access$getShouldUseDispatchDraw$cp() {
        return shouldUseDispatchDraw;
    }

    public static final /* synthetic */ Method access$getUpdateDisplayListIfDirtyMethod$cp() {
        return updateDisplayListIfDirtyMethod;
    }

    public static final /* synthetic */ void access$setHasRetrievedMethod$cp(boolean r0) {
        hasRetrievedMethod = r0;
    }

    public static final /* synthetic */ void access$setRecreateDisplayList$cp(Field r0) {
        recreateDisplayList = r0;
    }

    public static final /* synthetic */ void access$setShouldUseDispatchDraw$cp(boolean r0) {
        shouldUseDispatchDraw = r0;
    }

    public static final /* synthetic */ void access$setUpdateDisplayListIfDirtyMethod$cp(Method r0) {
        updateDisplayListIfDirtyMethod = r0;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public ViewLayer(AndroidComposeView ownerView, DrawChildContainer container, Function2<? super Canvas, ? super GraphicsLayer, Unit> r5, Function0<Unit> r6) {
        super(ownerView.getContext());
        this.ownerView = ownerView;
        this.container = container;
        this.drawBlock = r5;
        this.invalidateParentLayer = r6;
        this.outlineResolver = new OutlineResolver();
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new LayerMatrixCache(getMatrix);
        this.mTransformOrigin = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        this.container.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (getClipToOutline() == true) goto L5;
    L8:
        return null;
    L5:
        if (this.outlineResolver.getOutlineClipSupported() == true) goto L8;
        return this.outlineResolver.getClipPath();
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    private final void setInvalidated(boolean value) {
        if (value == this.isInvalidated) goto L6;
        this.isInvalidated = value;
        this.ownerView.notifyLayerIsDirty$ui_release(this, value);
        return;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo6027getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.m6128calculateMatrixGrdbGEg(this);
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.layerId;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) goto L7;
        return -1;
    L7:
        return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final void setCameraDistancePx(float value) {
        setCameraDistance(getResources().getDisplayMetrics().densityDpi * value);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope scope) {
        int maybeChangedFields = scope.getMutatedFields$ui_release() | this.mutatedFields;
        if ((maybeChangedFields & 4096) == 0) goto L6;
        this.mTransformOrigin = scope.mo4554getTransformOriginSzJe1aQ();
        setPivotX(TransformOrigin.m4752getPivotFractionXimpl(this.mTransformOrigin) * getWidth());
        setPivotY(TransformOrigin.m4753getPivotFractionYimpl(this.mTransformOrigin) * getHeight());
    L6:
        if ((maybeChangedFields & 1) == 0) goto L9;
        setScaleX(scope.getScaleX());
    L9:
        if ((maybeChangedFields & 2) == 0) goto L12;
        setScaleY(scope.getScaleY());
    L12:
        if ((maybeChangedFields & 4) == 0) goto L15;
        setAlpha(scope.getAlpha());
    L15:
        if ((maybeChangedFields & 8) == 0) goto L18;
        setTranslationX(scope.getTranslationX());
    L18:
        if ((maybeChangedFields & 16) == 0) goto L21;
        setTranslationY(scope.getTranslationY());
    L21:
        if ((maybeChangedFields & 32) == 0) goto L24;
        setElevation(scope.getShadowElevation());
    L24:
        if ((maybeChangedFields & 1024) == 0) goto L27;
        setRotation(scope.getRotationZ());
    L27:
        if ((maybeChangedFields & 256) == 0) goto L30;
        setRotationX(scope.getRotationX());
    L30:
        if ((maybeChangedFields & 512) == 0) goto L33;
        setRotationY(scope.getRotationY());
    L33:
        if ((maybeChangedFields & 2048) == 0) goto L35;
        setCameraDistancePx(scope.getCameraDistance());
    L35:
        boolean r2 = false;
        if (getManualClipPath() == null) goto L38;
        boolean wasClippingManually = true;
    L40:
        if (scope.getClip() == true) goto L42;
    L44:
        boolean r4 = false;
    L45:
        boolean clipToOutline = r4;
        if ((maybeChangedFields & 24576) != 0) goto L48;
    L54:
        boolean shapeChanged = this.outlineResolver.m6156updateS_szKao(scope.getOutline$ui_release(), scope.getAlpha(), clipToOutline, scope.getShadowElevation(), scope.mo4552getSizeNHjbRc());
        if (this.outlineResolver.getCacheIsDirty$ui_release() == false) goto L58;
        updateOutlineResolver();
    L58:
        if (getManualClipPath() == null) goto L60;
        boolean isClippingManually = true;
    L61:
        if (wasClippingManually != isClippingManually) goto L64;
        if (isClippingManually == false) goto L66;
        if (shapeChanged == true) goto L64;
    L66:
        if (this.drawnWithZ == true) goto L73;
        if (getElevation() <= 0.0f) goto L73;
        Function0<Unit> r6 = this.invalidateParentLayer;
        if (r6 == null) goto L73;
        r6.invoke();
    L73:
        if ((maybeChangedFields & Fields.MatrixAffectingFields) == 0) goto L76;
        this.matrixCache.invalidate();
    L76:
        if (Build.VERSION.SDK_INT < 28) goto L84;
        if ((maybeChangedFields & 64) == 0) goto L81;
        ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this, ColorKt.m4420toArgb8_81llA(scope.mo4550getAmbientShadowColor0d7_KjU()));
    L81:
        if ((maybeChangedFields & 128) == 0) goto L84;
        ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this, ColorKt.m4420toArgb8_81llA(scope.mo4553getSpotShadowColor0d7_KjU()));
    L84:
        if (Build.VERSION.SDK_INT < 31) goto L89;
        if ((131072 & maybeChangedFields) == 0) goto L89;
        ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, scope.getRenderEffect());
    L89:
        if ((32768 & maybeChangedFields) == 0) goto L98;
        int r7 = scope.mo4551getCompositingStrategyNrFUSI();
        if (CompositingStrategy.m4450equalsimpl0(r7, CompositingStrategy.Companion.m4456getOffscreenNrFUSI()) == false) goto L94;
        setLayerType(2, null);
        r2 = true;
    L97:
        this.mHasOverlappingRendering = r2;
        goto L98
    L94:
        if (CompositingStrategy.m4450equalsimpl0(r7, CompositingStrategy.Companion.m4455getModulateAlphaNrFUSI()) == false) goto L96;
        setLayerType(0, null);
        goto L97
    L96:
        setLayerType(0, null);
        r2 = true;
    L98:
        this.mutatedFields = scope.getMutatedFields$ui_release();
        return;
    L64:
        invalidate();
        goto L66
    L60:
        isClippingManually = false;
        goto L61
    L48:
        if (scope.getClip() == true) goto L50;
    L52:
        boolean r5 = false;
    L53:
        this.clipToBounds = r5;
        resetClipBounds();
        setClipToOutline(clipToOutline);
        goto L54
    L50:
        if (scope.getShape() != RectangleShapeKt.getRectangleShape()) goto L52;
        r5 = true;
        goto L53
    L42:
        if (scope.getShape() == RectangleShapeKt.getRectangleShape()) goto L44;
        r4 = true;
        goto L45
    L38:
        wasClippingManually = false;
        goto L40
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo6029isInLayerk4lQ0M(long position) {
        int bits$iv$iv$iv = (int) (position >> 32);
        float x = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (4294967295L & position);
        float y = Float.intBitsToFloat(bits$iv$iv$iv2);
        if (this.clipToBounds == false) goto L16;
        if (0.0f <= x) goto L7;
    L13:
        return false;
    L7:
        if (x >= getWidth()) goto L13;
        if (0.0f > y) goto L13;
        if (y >= getHeight()) goto L13;
        return true;
    L16:
        if (getClipToOutline() == true) goto L18;
        return true;
    L18:
        return this.outlineResolver.m6155isInOutlinek4lQ0M(position);
    }

    private final void updateOutlineResolver() {
        if (this.outlineResolver.getAndroidOutline() == null) goto L5;
        ViewOutlineProvider r0 = OutlineProvider;
    L6:
        setOutlineProvider(r0);
        return;
    L5:
        r0 = null;
        goto L6
    }

    private final void resetClipBounds() {
        if (this.clipToBounds == true) goto L5;
        Rect r0 = null;
    L10:
        setClipBounds(r0);
        return;
    L5:
        if (this.clipBoundsCache != null) goto L7;
        this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
    L8:
        r0 = this.clipBoundsCache;
        goto L10
    L7:
        Rect r1 = this.clipBoundsCache;
        Intrinsics.checkNotNull(r1);
        r1.set(0, 0, getWidth(), getHeight());
        goto L8
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo6032resizeozmzZPI(long size) {
        int width = (int) (size >> 32);
        int height = (int) (4294967295L & size);
        if (width == getWidth()) goto L5;
    L6:
        setPivotX(TransformOrigin.m4752getPivotFractionXimpl(this.mTransformOrigin) * width);
        setPivotY(TransformOrigin.m4753getPivotFractionYimpl(this.mTransformOrigin) * height);
        updateOutlineResolver();
        layout(getLeft(), getTop(), getLeft() + width, getTop() + height);
        resetClipBounds();
        this.matrixCache.invalidate();
        return;
    L5:
        if (height != getHeight()) goto L6;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo6031movegyyYBs(long position) {
        int left = IntOffset.m7101getXimpl(position);
        if (left == getLeft()) goto L5;
        offsetLeftAndRight(left - getLeft());
        this.matrixCache.invalidate();
    L5:
        int top = IntOffset.m7102getYimpl(position);
        if (top == getTop()) goto L9;
        offsetTopAndBottom(top - getTop());
        this.matrixCache.invalidate();
        return;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer parentLayer) {
        if (getElevation() <= 0.0f) goto L5;
        boolean r0 = true;
    L6:
        this.drawnWithZ = r0;
        if (this.drawnWithZ == false) goto L9;
        canvas.enableZ();
    L9:
        this.container.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.drawnWithZ == false) goto L13;
        canvas.disableZ();
        return;
    L13:
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        CanvasHolder this_$iv = this.canvasHolder;
        android.graphics.Canvas previousCanvas$iv = this_$iv.getAndroidCanvas().getInternalCanvas();
        this_$iv.getAndroidCanvas().setInternalCanvas(canvas);
        Canvas $this$dispatchDraw_u24lambda_u240 = this_$iv.getAndroidCanvas();
        boolean didClip = false;
        Path clipPath = getManualClipPath();
        if (clipPath == null) goto L5;
    L6:
        didClip = true;
        $this$dispatchDraw_u24lambda_u240.save();
        this.outlineResolver.clipToOutline($this$dispatchDraw_u24lambda_u240);
    L7:
        Function2<? super Canvas, ? super GraphicsLayer, Unit> r7 = this.drawBlock;
        if (r7 == null) goto L10;
        r7.invoke($this$dispatchDraw_u24lambda_u240, null);
    L10:
        if (didClip == false) goto L12;
        $this$dispatchDraw_u24lambda_u240.restore();
    L12:
        this_$iv.getAndroidCanvas().setInternalCanvas(previousCanvas$iv);
        setInvalidated(false);
        return;
    L5:
        if (canvas.isHardwareAccelerated() == true) goto L7;
        goto L6
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated == true) goto L6;
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
        return;
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui_release(this);
        this.container.removeViewInLayout(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isInvalidated == true) goto L5;
        return;
    L5:
        if (shouldUseDispatchDraw == true) goto L9;
        Companion.updateDisplayList(this);
        setInvalidated(false);
        return;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo6030mapOffset8S9VItk(long point, boolean inverse) {
        LayerMatrixCache<View> r0 = this.matrixCache;
        if (inverse == false) goto L6;
        return r0.m6130mapInverseR5De75A(this, point);
    L6:
        return r0.m6129mapR5De75A(this, point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect rect, boolean inverse) {
        LayerMatrixCache<View> r0 = this.matrixCache;
        if (inverse == false) goto L5;
        r0.mapInverse(this, rect);
        return;
    L5:
        r0.map(this, rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> r4, Function0<Unit> r5) {
        this.container.addView(this);
        this.matrixCache.reset();
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
        this.drawBlock = r4;
        this.invalidateParentLayer = r5;
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo6033transform58bKbWc(float[] matrix) {
        androidx.compose.ui.graphics.Matrix.m4615timesAssign58bKbWc(matrix, this.matrixCache.m6128calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo6028inverseTransform58bKbWc(float[] matrix) {
        float[] inverse = this.matrixCache.m6127calculateInverseMatrixbWbORWo(this);
        if (inverse == null) goto L6;
        androidx.compose.ui.graphics.Matrix.m4615timesAssign58bKbWc(matrix, inverse);
        return;
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        getMatrix = ViewLayer$Companion$getMatrix$1.INSTANCE;
        OutlineProvider = new ViewLayer$Companion$OutlineProvider$1();
    }
}
