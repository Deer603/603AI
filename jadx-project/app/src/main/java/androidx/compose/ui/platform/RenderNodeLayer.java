package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.autofill.HintConstants;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RenderNodeLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0002XYBU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00128\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0002\u0010\u0010J\u0010\u00103\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0002J\b\u00104\u001a\u00020\rH\u0016J\u001a\u00105\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u00106\u001a\u00020\rH\u0016J\u001a\u00107\u001a\u00020\r2\u0006\u00108\u001a\u000200H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001a\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020=H\u0016ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\r2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0014H\u0016J\"\u0010D\u001a\u00020=2\u0006\u0010E\u001a\u00020=2\u0006\u0010C\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001a\u0010H\u001a\u00020\r2\u0006\u0010<\u001a\u00020IH\u0016ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u001a\u0010L\u001a\u00020\r2\u0006\u0010M\u001a\u00020NH\u0016ø\u0001\u0000¢\u0006\u0004\bO\u0010KJP\u0010P\u001a\u00020\r28\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0016J\u001a\u0010Q\u001a\u00020\r2\u0006\u00108\u001a\u000200H\u0016ø\u0001\u0000¢\u0006\u0004\bR\u0010:J\b\u0010S\u001a\u00020\rH\u0002J\b\u0010T\u001a\u00020\rH\u0016J\u0010\u0010U\u001a\u00020\r2\u0006\u0010V\u001a\u00020WH\u0016R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u0005\u001a6\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u000e\u0010)\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\u00020-X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010.R\u001a\u0010/\u001a\u0002008VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "drawBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "", "invalidateParentLayer", "Lkotlin/Function0;", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "drawnWithZ", "", "isDestroyed", "value", "isDirty", "setDirty", "(Z)V", "layerId", "", "getLayerId", "()J", "matrixCache", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "mutatedFields", "", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerViewId", "getOwnerViewId", "renderNode", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "underlyingMatrix", "Landroidx/compose/ui/graphics/Matrix;", "getUnderlyingMatrix-sQKQjiQ", "()[F", "clipRenderNode", "destroy", "drawLayer", "invalidate", "inverseTransform", "matrix", "inverseTransform-58bKbWc", "([F)V", "isInLayer", "position", "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "resize", "size", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "reuseLayer", "transform", "transform-58bKbWc", "triggerRepaint", "updateDisplayList", "updateLayerProperties", "scope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Function2<DeviceRenderNode, Matrix, Unit> getMatrix = null;
    private final CanvasHolder canvasHolder;
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock;
    private boolean drawnWithZ;
    private Function0<Unit> invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private final LayerMatrixCache<DeviceRenderNode> matrixCache;
    private int mutatedFields;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    private final DeviceRenderNode renderNode;
    private Paint softwareLayerPaint;
    private long transformOrigin;

    /* JADX INFO: compiled from: RenderNodeLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$Companion;", "", "()V", "getMatrix", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroid/graphics/Matrix;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: RenderNodeLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29;", "", "()V", "getUniqueDrawingId", "", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public RenderNodeLayer(AndroidComposeView ownerView, Function2<? super Canvas, ? super GraphicsLayer, Unit> r6, Function0<Unit> r7) {
        this.ownerView = ownerView;
        this.drawBlock = r6;
        this.invalidateParentLayer = r7;
        this.outlineResolver = new OutlineResolver();
        this.matrixCache = new LayerMatrixCache(getMatrix);
        this.canvasHolder = new CanvasHolder();
        this.transformOrigin = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
        if (Build.VERSION.SDK_INT < 29) goto L5;
        RenderNodeApi23 r0 = new RenderNodeApi29(this.ownerView);
    L6:
        DeviceRenderNode $this$renderNode_u24lambda_u240 = r0;
        $this$renderNode_u24lambda_u240.setHasOverlappingRendering(true);
        $this$renderNode_u24lambda_u240.setClipToBounds(false);
        this.renderNode = r0;
        return;
    L5:
        r0 = new RenderNodeApi23(this.ownerView);
        goto L6
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    private final void setDirty(boolean value) {
        if (value == this.isDirty) goto L6;
        this.isDirty = value;
        this.ownerView.notifyLayerIsDirty$ui_release(this, value);
        return;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) goto L7;
        return -1;
    L7:
        return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope scope) {
        int maybeChangedFields = scope.getMutatedFields$ui_release() | this.mutatedFields;
        if ((maybeChangedFields & 4096) == 0) goto L5;
        this.transformOrigin = scope.mo4554getTransformOriginSzJe1aQ();
    L5:
        boolean isClippingManually = false;
        if (this.renderNode.getClipToOutline() == true) goto L8;
    L10:
        boolean wasClippingManually = false;
    L12:
        if ((maybeChangedFields & 1) == 0) goto L15;
        this.renderNode.setScaleX(scope.getScaleX());
    L15:
        if ((maybeChangedFields & 2) == 0) goto L18;
        this.renderNode.setScaleY(scope.getScaleY());
    L18:
        if ((maybeChangedFields & 4) == 0) goto L21;
        this.renderNode.setAlpha(scope.getAlpha());
    L21:
        if ((maybeChangedFields & 8) == 0) goto L24;
        this.renderNode.setTranslationX(scope.getTranslationX());
    L24:
        if ((maybeChangedFields & 16) == 0) goto L27;
        this.renderNode.setTranslationY(scope.getTranslationY());
    L27:
        if ((maybeChangedFields & 32) == 0) goto L30;
        this.renderNode.setElevation(scope.getShadowElevation());
    L30:
        if ((maybeChangedFields & 64) == 0) goto L33;
        this.renderNode.setAmbientShadowColor(ColorKt.m4420toArgb8_81llA(scope.mo4550getAmbientShadowColor0d7_KjU()));
    L33:
        if ((maybeChangedFields & 128) == 0) goto L36;
        this.renderNode.setSpotShadowColor(ColorKt.m4420toArgb8_81llA(scope.mo4553getSpotShadowColor0d7_KjU()));
    L36:
        if ((maybeChangedFields & 1024) == 0) goto L39;
        this.renderNode.setRotationZ(scope.getRotationZ());
    L39:
        if ((maybeChangedFields & 256) == 0) goto L42;
        this.renderNode.setRotationX(scope.getRotationX());
    L42:
        if ((maybeChangedFields & 512) == 0) goto L45;
        this.renderNode.setRotationY(scope.getRotationY());
    L45:
        if ((maybeChangedFields & 2048) == 0) goto L48;
        this.renderNode.setCameraDistance(scope.getCameraDistance());
    L48:
        if ((maybeChangedFields & 4096) == 0) goto L51;
        this.renderNode.setPivotX(TransformOrigin.m4752getPivotFractionXimpl(this.transformOrigin) * this.renderNode.getWidth());
        this.renderNode.setPivotY(TransformOrigin.m4753getPivotFractionYimpl(this.transformOrigin) * this.renderNode.getHeight());
    L51:
        if (scope.getClip() == true) goto L53;
    L55:
        boolean r4 = false;
    L56:
        boolean clipToOutline = r4;
        if ((maybeChangedFields & 24576) == 0) goto L66;
        this.renderNode.setClipToOutline(clipToOutline);
        DeviceRenderNode r5 = this.renderNode;
        if (scope.getClip() == true) goto L61;
    L63:
        boolean r6 = false;
    L64:
        r5.setClipToBounds(r6);
        goto L66
    L61:
        if (scope.getShape() != RectangleShapeKt.getRectangleShape()) goto L63;
        r6 = true;
    L66:
        if ((131072 & maybeChangedFields) == 0) goto L69;
        this.renderNode.setRenderEffect(scope.getRenderEffect());
    L69:
        if ((32768 & maybeChangedFields) == 0) goto L71;
        this.renderNode.mo6111setCompositingStrategyaDBOjCE(scope.mo4551getCompositingStrategyNrFUSI());
    L71:
        boolean shapeChanged = this.outlineResolver.m6156updateS_szKao(scope.getOutline$ui_release(), scope.getAlpha(), clipToOutline, scope.getShadowElevation(), scope.mo4552getSizeNHjbRc());
        if (this.outlineResolver.getCacheIsDirty$ui_release() == false) goto L74;
        this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
    L74:
        if (clipToOutline == true) goto L76;
    L78:
        if (wasClippingManually != isClippingManually) goto L83;
        if (isClippingManually == false) goto L82;
        if (shapeChanged == true) goto L83;
    L82:
        triggerRepaint();
    L85:
        if (this.drawnWithZ == true) goto L92;
        if (this.renderNode.getElevation() <= 0.0f) goto L92;
        Function0<Unit> r3 = this.invalidateParentLayer;
        if (r3 == null) goto L92;
        r3.invoke();
    L92:
        if ((maybeChangedFields & Fields.MatrixAffectingFields) == 0) goto L94;
        this.matrixCache.invalidate();
    L94:
        this.mutatedFields = scope.getMutatedFields$ui_release();
        return;
    L83:
        invalidate();
        goto L85
    L76:
        if (this.outlineResolver.getOutlineClipSupported() == true) goto L78;
        isClippingManually = true;
        goto L78
    L53:
        if (scope.getShape() == RectangleShapeKt.getRectangleShape()) goto L55;
        r4 = true;
        goto L56
    L8:
        if (this.outlineResolver.getOutlineClipSupported() == true) goto L10;
        wasClippingManually = true;
        goto L12
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo6029isInLayerk4lQ0M(long position) {
        int bits$iv$iv$iv = (int) (position >> 32);
        float x = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (4294967295L & position);
        float y = Float.intBitsToFloat(bits$iv$iv$iv2);
        if (this.renderNode.getClipToBounds() == false) goto L16;
        if (0.0f <= x) goto L7;
    L13:
        return false;
    L7:
        if (x >= this.renderNode.getWidth()) goto L13;
        if (0.0f > y) goto L13;
        if (y >= this.renderNode.getHeight()) goto L13;
        return true;
    L16:
        if (this.renderNode.getClipToOutline() == true) goto L18;
        return true;
    L18:
        return this.outlineResolver.m6155isInOutlinek4lQ0M(position);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo6032resizeozmzZPI(long size) {
        int width = (int) (size >> 32);
        int height = (int) (4294967295L & size);
        this.renderNode.setPivotX(TransformOrigin.m4752getPivotFractionXimpl(this.transformOrigin) * width);
        this.renderNode.setPivotY(TransformOrigin.m4753getPivotFractionYimpl(this.transformOrigin) * height);
        if (this.renderNode.setPosition(this.renderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + width, this.renderNode.getTop() + height) == false) goto L6;
        this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
        invalidate();
        this.matrixCache.invalidate();
        return;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo6031movegyyYBs(long position) {
        int oldLeft = this.renderNode.getLeft();
        int oldTop = this.renderNode.getTop();
        int newLeft = IntOffset.m7101getXimpl(position);
        int newTop = IntOffset.m7102getYimpl(position);
        if (oldLeft != newLeft) goto L5;
        if (oldTop != newTop) goto L5;
        return;
    L5:
        if (oldLeft == newLeft) goto L7;
        this.renderNode.offsetLeftAndRight(newLeft - oldLeft);
    L7:
        if (oldTop == newTop) goto L9;
        this.renderNode.offsetTopAndBottom(newTop - oldTop);
    L9:
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty == false) goto L5;
        return;
    L5:
        if (this.isDestroyed == true) goto L9;
        this.ownerView.invalidate();
        setDirty(true);
        return;
    }

    private final void triggerRepaint() {
        WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer parentLayer) {
        android.graphics.Canvas androidCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean r6 = false;
        if (androidCanvas.isHardwareAccelerated() == false) goto L13;
        updateDisplayList();
        if (this.renderNode.getElevation() <= 0.0f) goto L7;
        r6 = true;
    L7:
        this.drawnWithZ = r6;
        if (this.drawnWithZ == false) goto L10;
        canvas.enableZ();
    L10:
        this.renderNode.drawInto(androidCanvas);
        if (this.drawnWithZ == false) goto L25;
        canvas.disableZ();
        return;
    L25:
        return;
    L13:
        float left = this.renderNode.getLeft();
        float top = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() >= 1.0f) goto L19;
        Paint it = this.softwareLayerPaint;
        if (it != null) goto L18;
        it = AndroidPaint_androidKt.Paint();
        this.softwareLayerPaint = it;
    L18:
        Paint it2 = it;
        it2.setAlpha(this.renderNode.getAlpha());
        androidCanvas.saveLayer(left, top, right, bottom, it2.asFrameworkPaint());
    L20:
        canvas.translate(left, top);
        canvas.mo4221concat58bKbWc(this.matrixCache.m6128calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        Function2<? super Canvas, ? super GraphicsLayer, Unit> r5 = this.drawBlock;
        if (r5 == null) goto L23;
        r5.invoke(canvas, null);
    L23:
        canvas.restore();
        setDirty(false);
        return;
    L19:
        canvas.save();
        goto L20
    }

    private final void clipRenderNode(Canvas canvas) {
        if (this.renderNode.getClipToOutline() == false) goto L5;
    L6:
        this.outlineResolver.clipToOutline(canvas);
        return;
    L5:
        if (this.renderNode.getClipToBounds() == true) goto L6;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty == true) goto L7;
        if (this.renderNode.getHasDisplayList() == false) goto L7;
        return;
    L7:
        if (this.renderNode.getClipToOutline() == true) goto L9;
    L11:
        Path clipPath = null;
    L12:
        final Function2<? super Canvas, ? super GraphicsLayer, Unit> r1 = this.drawBlock;
        if (r1 == null) goto L15;
        this.renderNode.record(this.canvasHolder, clipPath, new RenderNodeLayer$updateDisplayList$1$1(r1));
    L15:
        setDirty(false);
        return;
    L9:
        if (this.outlineResolver.getOutlineClipSupported() == true) goto L11;
        clipPath = this.outlineResolver.getClipPath();
        goto L12
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.getHasDisplayList() == false) goto L5;
        this.renderNode.discardDisplayList();
    L5:
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo6027getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.m6128calculateMatrixGrdbGEg(this.renderNode);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo6030mapOffset8S9VItk(long point, boolean inverse) {
        LayerMatrixCache<DeviceRenderNode> r0 = this.matrixCache;
        if (inverse == false) goto L6;
        return r0.m6130mapInverseR5De75A(this.renderNode, point);
    L6:
        return r0.m6129mapR5De75A(this.renderNode, point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect rect, boolean inverse) {
        LayerMatrixCache<DeviceRenderNode> r0 = this.matrixCache;
        if (inverse == false) goto L5;
        r0.mapInverse(this.renderNode, rect);
        return;
    L5:
        r0.map(this.renderNode, rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> r3, Function0<Unit> r4) {
        this.matrixCache.reset();
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
        this.drawBlock = r3;
        this.invalidateParentLayer = r4;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo6033transform58bKbWc(float[] matrix) {
        androidx.compose.ui.graphics.Matrix.m4615timesAssign58bKbWc(matrix, this.matrixCache.m6128calculateMatrixGrdbGEg(this.renderNode));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo6028inverseTransform58bKbWc(float[] matrix) {
        float[] inverse = this.matrixCache.m6127calculateInverseMatrixbWbORWo(this.renderNode);
        if (inverse == null) goto L6;
        androidx.compose.ui.graphics.Matrix.m4615timesAssign58bKbWc(matrix, inverse);
        return;
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        getMatrix = RenderNodeLayer$Companion$getMatrix$1.INSTANCE;
    }
}
