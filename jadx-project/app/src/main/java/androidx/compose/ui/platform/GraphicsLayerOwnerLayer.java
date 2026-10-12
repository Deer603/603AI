package androidx.compose.ui.platform;

import android.os.Build;
import androidx.autofill.HintConstants;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GraphicsLayerOwnerLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00128\u0010\t\u001a4\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0002\u0010\u0013J\b\u0010@\u001a\u00020\u0010H\u0016J\u001a\u0010A\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0017\u0010B\u001a\u0004\u0018\u00010\u0019H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010?J\u0015\u0010D\u001a\u00020\u0019H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010?J\b\u0010F\u001a\u00020\u0010H\u0016J\u001a\u0010G\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u001a\u0010K\u001a\u00020\u00172\u0006\u0010L\u001a\u00020MH\u0016ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ\u0018\u0010P\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u0017H\u0016J\"\u0010T\u001a\u00020M2\u0006\u0010U\u001a\u00020M2\u0006\u0010S\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\u001a\u0010X\u001a\u00020\u00102\u0006\u0010L\u001a\u00020YH\u0016ø\u0001\u0000¢\u0006\u0004\bZ\u0010[J\u001a\u0010\\\u001a\u00020\u00102\u0006\u00106\u001a\u000207H\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010[JP\u0010^\u001a\u00020\u001028\u0010\t\u001a4\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0016J\u001a\u0010_\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b`\u0010JJ\b\u0010a\u001a\u00020\u0010H\u0002J\b\u0010b\u001a\u00020\u0010H\u0016J\u0010\u0010c\u001a\u00020\u00102\u0006\u00104\u001a\u00020dH\u0016J\b\u0010e\u001a\u00020\u0010H\u0002J\b\u0010f\u001a\u00020\u0010H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000RB\u0010\t\u001a6\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\u00020\u0019X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010&R\u001f\u00100\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001001¢\u0006\u0002\b3X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00106\u001a\u000207X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00108R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010;\u001a\u00020<X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00108R\u001a\u0010=\u001a\u00020\u00198VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, d2 = {"Landroidx/compose/ui/platform/GraphicsLayerOwnerLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "context", "Landroidx/compose/ui/graphics/GraphicsContext;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "drawBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "canvas", "parentLayer", "", "invalidateParentLayer", "Lkotlin/Function0;", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "density", "Landroidx/compose/ui/unit/Density;", "drawnWithEnabledZ", "", "inverseMatrixCache", "Landroidx/compose/ui/graphics/Matrix;", "[F", "isDestroyed", "value", "isDirty", "setDirty", "(Z)V", "isIdentity", "isInverseMatrixDirty", "isMatrixDirty", "layerId", "", "getLayerId", "()J", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "matrixCache", "mutatedFields", "", "outline", "Landroidx/compose/ui/graphics/Outline;", "ownerViewId", "getOwnerViewId", "recordLambda", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "scope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "size", "Landroidx/compose/ui/unit/IntSize;", "J", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "underlyingMatrix", "getUnderlyingMatrix-sQKQjiQ", "()[F", "destroy", "drawLayer", "getInverseMatrix", "getInverseMatrix-3i98HWw", "getMatrix", "getMatrix-sQKQjiQ", "invalidate", "inverseTransform", "matrix", "inverseTransform-58bKbWc", "([F)V", "isInLayer", "position", "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "resize", "resize-ozmzZPI", "reuseLayer", "transform", "transform-58bKbWc", "triggerRepaint", "updateDisplayList", "updateLayerProperties", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "updateMatrix", "updateOutline", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 0;
    private final GraphicsContext context;
    private Density density;
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock;
    private boolean drawnWithEnabledZ;
    private GraphicsLayer graphicsLayer;
    private Function0<Unit> invalidateParentLayer;
    private float[] inverseMatrixCache;
    private boolean isDestroyed;
    private boolean isDirty;
    private boolean isIdentity;
    private boolean isInverseMatrixDirty;
    private boolean isMatrixDirty;
    private LayoutDirection layoutDirection;
    private final float[] matrixCache;
    private int mutatedFields;
    private Outline outline;
    private final AndroidComposeView ownerView;
    private final Function1<DrawScope, Unit> recordLambda;
    private final CanvasDrawScope scope;
    private long size;
    private Paint softwareLayerPaint;
    private long transformOrigin;

    static {
        $stable = 8;
    }

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext context, AndroidComposeView ownerView, Function2<? super Canvas, ? super GraphicsLayer, Unit> r14, Function0<Unit> r15) {
        this.graphicsLayer = graphicsLayer;
        this.context = context;
        this.ownerView = ownerView;
        this.drawBlock = r14;
        this.invalidateParentLayer = r15;
        this.size = IntSize.m7139constructorimpl((((long) Integer.MAX_VALUE) << 32) | (((long) Integer.MAX_VALUE) & 4294967295L));
        this.matrixCache = Matrix.m4596constructorimpl$default(null, 1, null);
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.layoutDirection = LayoutDirection.Ltr;
        this.scope = new CanvasDrawScope();
        this.transformOrigin = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
        this.isIdentity = true;
        this.recordLambda = new GraphicsLayerOwnerLayer$recordLambda$1(this);
    }

    public static final /* synthetic */ Function2 access$getDrawBlock$p(GraphicsLayerOwnerLayer $this) {
        return $this.drawBlock;
    }

    private final void setDirty(boolean value) {
        if (value == this.isDirty) goto L6;
        this.isDirty = value;
        this.ownerView.notifyLayerIsDirty$ui_release(this, value);
        return;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope scope) {
        int maybeChangedFields = scope.getMutatedFields$ui_release() | this.mutatedFields;
        this.layoutDirection = scope.getLayoutDirection$ui_release();
        this.density = scope.getGraphicsDensity$ui_release();
        if ((maybeChangedFields & 4096) == 0) goto L6;
        this.transformOrigin = scope.mo4554getTransformOriginSzJe1aQ();
    L6:
        if ((maybeChangedFields & 1) == 0) goto L9;
        this.graphicsLayer.setScaleX(scope.getScaleX());
    L9:
        if ((maybeChangedFields & 2) == 0) goto L12;
        this.graphicsLayer.setScaleY(scope.getScaleY());
    L12:
        if ((maybeChangedFields & 4) == 0) goto L15;
        this.graphicsLayer.setAlpha(scope.getAlpha());
    L15:
        if ((maybeChangedFields & 8) == 0) goto L18;
        this.graphicsLayer.setTranslationX(scope.getTranslationX());
    L18:
        if ((maybeChangedFields & 16) == 0) goto L21;
        this.graphicsLayer.setTranslationY(scope.getTranslationY());
    L21:
        if ((maybeChangedFields & 32) == 0) goto L30;
        this.graphicsLayer.setShadowElevation(scope.getShadowElevation());
        if (scope.getShadowElevation() <= 0.0f) goto L30;
        if (this.drawnWithEnabledZ == true) goto L30;
        Function0<Unit> r2 = this.invalidateParentLayer;
        if (r2 == null) goto L30;
        r2.invoke();
    L30:
        if ((maybeChangedFields & 64) == 0) goto L33;
        this.graphicsLayer.m5012setAmbientShadowColor8_81llA(scope.mo4550getAmbientShadowColor0d7_KjU());
    L33:
        if ((maybeChangedFields & 128) == 0) goto L36;
        this.graphicsLayer.m5018setSpotShadowColor8_81llA(scope.mo4553getSpotShadowColor0d7_KjU());
    L36:
        if ((maybeChangedFields & 1024) == 0) goto L39;
        this.graphicsLayer.setRotationZ(scope.getRotationZ());
    L39:
        if ((maybeChangedFields & 256) == 0) goto L42;
        this.graphicsLayer.setRotationX(scope.getRotationX());
    L42:
        if ((maybeChangedFields & 512) == 0) goto L45;
        this.graphicsLayer.setRotationY(scope.getRotationY());
    L45:
        if ((maybeChangedFields & 2048) == 0) goto L48;
        this.graphicsLayer.setCameraDistance(scope.getCameraDistance());
    L48:
        if ((maybeChangedFields & 4096) == 0) goto L54;
        boolean r3 = TransformOrigin.m4751equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m4757getCenterSzJe1aQ());
        GraphicsLayer r4 = this.graphicsLayer;
        if (r3 == false) goto L52;
        r4.m5015setPivotOffsetk4lQ0M(Offset.Companion.m4140getUnspecifiedF1C5BW0());
        goto L54
    L52:
        float r5 = TransformOrigin.m4752getPivotFractionXimpl(this.transformOrigin);
        long arg0$iv = this.size;
        float x$iv = r5 * ((int) (arg0$iv >> 32));
        float r6 = TransformOrigin.m4753getPivotFractionYimpl(this.transformOrigin);
        long arg0$iv2 = this.size;
        float y$iv = r6 * ((int) (arg0$iv2 & 4294967295L));
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        r4.m5015setPivotOffsetk4lQ0M(Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)));
    L54:
        if ((maybeChangedFields & 16384) == 0) goto L57;
        this.graphicsLayer.setClip(scope.getClip());
    L57:
        if ((131072 & maybeChangedFields) == 0) goto L60;
        this.graphicsLayer.setRenderEffect(scope.getRenderEffect());
    L60:
        if ((32768 & maybeChangedFields) == 0) goto L74;
        GraphicsLayer r7 = this.graphicsLayer;
        int r8 = scope.mo4551getCompositingStrategyNrFUSI();
        if (CompositingStrategy.m4450equalsimpl0(r8, CompositingStrategy.Companion.m4454getAutoNrFUSI()) == false) goto L65;
        int r9 = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m4997getAutoke2Ky5w();
    L70:
        r7.m5014setCompositingStrategyWpw9cng(r9);
        goto L74
    L65:
        if (CompositingStrategy.m4450equalsimpl0(r8, CompositingStrategy.Companion.m4456getOffscreenNrFUSI()) == false) goto L68;
        r9 = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m4999getOffscreenke2Ky5w();
        goto L70
    L68:
        if (CompositingStrategy.m4450equalsimpl0(r8, CompositingStrategy.Companion.m4455getModulateAlphaNrFUSI()) == false) goto L72;
        r9 = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m4998getModulateAlphake2Ky5w();
        goto L70
    L72:
        throw new IllegalStateException("Not supported composition strategy");
    L74:
        if ((maybeChangedFields & Fields.MatrixAffectingFields) == 0) goto L76;
        this.isMatrixDirty = true;
        this.isInverseMatrixDirty = true;
    L76:
        boolean outlineChanged = false;
        if (Intrinsics.areEqual(this.outline, scope.getOutline$ui_release()) == true) goto L79;
        outlineChanged = true;
        this.outline = scope.getOutline$ui_release();
        updateOutline();
    L79:
        this.mutatedFields = scope.getMutatedFields$ui_release();
        if (maybeChangedFields != 0) goto L82;
        if (outlineChanged == true) goto L82;
        return;
    L82:
        triggerRepaint();
    }

    private final void triggerRepaint() {
        WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
    }

    private final void updateOutline() {
        Outline outline = this.outline;
        if (outline != null) goto L5;
        return;
    L5:
        GraphicsLayerKt.setOutline(this.graphicsLayer, outline);
        if ((outline instanceof Outline.Generic) == true) goto L8;
        return;
    L8:
        if (Build.VERSION.SDK_INT >= 33) goto L14;
        Function0<Unit> r1 = this.invalidateParentLayer;
        if (r1 == null) goto L15;
        r1.invoke();
        return;
    L15:
        return;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo6029isInLayerk4lQ0M(long position) {
        int bits$iv$iv$iv = (int) (position >> 32);
        float x = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (4294967295L & position);
        float y = Float.intBitsToFloat(bits$iv$iv$iv2);
        if (this.graphicsLayer.getClip() == true) goto L5;
        return true;
    L5:
        return ShapeContainingUtilKt.isInOutline$default(this.graphicsLayer.getOutline(), x, y, null, null, 24, null);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo6031movegyyYBs(long position) {
        this.graphicsLayer.m5019setTopLeftgyyYBs(position);
        triggerRepaint();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo6032resizeozmzZPI(long size) {
        if (IntSize.m7142equalsimpl0(size, this.size) == true) goto L6;
        this.size = size;
        invalidate();
        return;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer parentLayer) {
        updateDisplayList();
        if (this.graphicsLayer.getShadowElevation() <= 0.0f) goto L5;
        boolean r0 = true;
    L6:
        this.drawnWithEnabledZ = r0;
        DrawContext it = this.scope.getDrawContext();
        it.setCanvas(canvas);
        it.setGraphicsLayer(parentLayer);
        GraphicsLayerKt.drawLayer(this.scope, this.graphicsLayer);
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty == true) goto L5;
        return;
    L5:
        if (TransformOrigin.m4751equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m4757getCenterSzJe1aQ()) == false) goto L7;
    L9:
        this.graphicsLayer.m5011recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
        setDirty(false);
        return;
    L7:
        if (IntSize.m7142equalsimpl0(this.graphicsLayer.m5008getSizeYbymL2g(), this.size) == true) goto L9;
        GraphicsLayer r0 = this.graphicsLayer;
        float r1 = TransformOrigin.m4752getPivotFractionXimpl(this.transformOrigin);
        long arg0$iv = this.size;
        float x$iv = r1 * ((int) (arg0$iv >> 32));
        float r2 = TransformOrigin.m4753getPivotFractionYimpl(this.transformOrigin);
        long arg0$iv2 = this.size;
        float y$iv = r2 * ((int) (arg0$iv2 & 4294967295L));
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        r0.m5015setPivotOffsetk4lQ0M(Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)));
        goto L9
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

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        if (this.context == null) goto L6;
        this.context.releaseGraphicsLayer(this.graphicsLayer);
        this.ownerView.recycle$ui_release(this);
        return;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo6030mapOffset8S9VItk(long point, boolean inverse) {
        if (inverse == false) goto L7;
        float[] matrix = m6123getInverseMatrix3i98HWw();
        if (matrix != null) goto L9;
        return Offset.Companion.m4139getInfiniteF1C5BW0();
    L9:
        if (this.isIdentity == false) goto L12;
        return point;
    L12:
        return Matrix.m4602mapMKHz9U(matrix, point);
    L7:
        matrix = m6124getMatrixsQKQjiQ();
        goto L9
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect rect, boolean inverse) {
        if (inverse == false) goto L4;
        float[] matrix = m6123getInverseMatrix3i98HWw();
    L6:
        if (this.isIdentity == true) goto L11;
        if (matrix != null) goto L9;
        rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        return;
    L9:
        Matrix.m4604mapimpl(matrix, rect);
        return;
    L11:
        return;
    L4:
        matrix = m6124getMatrixsQKQjiQ();
        goto L6
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> r13, Function0<Unit> r14) {
        GraphicsContext context = this.context;
        if (context == null) goto L12;
        boolean value$iv = this.graphicsLayer.isReleased();
        if (value$iv == true) goto L7;
        InlineClassHelperKt.throwIllegalArgumentException("layer should have been released before reuse");
    L7:
        this.graphicsLayer = context.createGraphicsLayer();
        this.isDestroyed = false;
        this.drawBlock = r13;
        this.invalidateParentLayer = r14;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        Matrix.m4605resetimpl(this.matrixCache);
        float[] r2 = this.inverseMatrixCache;
        if (r2 == null) goto L10;
        Matrix.m4605resetimpl(r2);
    L10:
        this.transformOrigin = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
        this.drawnWithEnabledZ = false;
        this.size = IntSize.m7139constructorimpl((((long) Integer.MAX_VALUE) << 32) | (((long) Integer.MAX_VALUE) & 4294967295L));
        this.outline = null;
        this.mutatedFields = 0;
        return;
    L12:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("currently reuse is only supported when we manage the layer lifecycle");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo6033transform58bKbWc(float[] matrix) {
        Matrix.m4615timesAssign58bKbWc(matrix, m6124getMatrixsQKQjiQ());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo6028inverseTransform58bKbWc(float[] matrix) {
        float[] inverse = m6123getInverseMatrix3i98HWw();
        if (inverse == null) goto L6;
        Matrix.m4615timesAssign58bKbWc(matrix, inverse);
        return;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.graphicsLayer.getLayerId();
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return this.graphicsLayer.getOwnerViewId();
    }

    /* JADX INFO: renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m6124getMatrixsQKQjiQ() {
        updateMatrix();
        return this.matrixCache;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo6027getUnderlyingMatrixsQKQjiQ() {
        return m6124getMatrixsQKQjiQ();
    }

    /* JADX INFO: renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m6123getInverseMatrix3i98HWw() {
        float[] it = this.inverseMatrixCache;
        if (it != null) goto L6;
        it = Matrix.m4596constructorimpl$default(null, 1, null);
        this.inverseMatrixCache = it;
    L6:
        if (this.isInverseMatrixDirty == false) goto L8;
        this.isInverseMatrixDirty = false;
        float[] matrix = m6124getMatrixsQKQjiQ();
        if (this.isIdentity == false) goto L15;
        return matrix;
    L15:
        if (InvertMatrixKt.m6125invertToJiSxe2E(matrix, it) == true) goto L20;
        it[(0 * 4) + 0] = Float.NaN;
        return null;
    L20:
        return it;
    L8:
        if (Float.isNaN(it[(0 * 4) + 0]) == false) goto L10;
        return null;
    L10:
        return it;
    }

    private final void updateMatrix() {
        if (this.isMatrixDirty == false) goto L13;
        GraphicsLayer $this$updateMatrix_u24lambda_u244 = this.graphicsLayer;
        long $this$isUnspecified$iv = $this$updateMatrix_u24lambda_u244.m5007getPivotOffsetF1C5BW0();
        if ((9223372034707292159L & $this$isUnspecified$iv) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) goto L7;
        boolean r6 = true;
    L8:
        if (r6 == false) goto L10;
        long value$iv$iv$iv = SizeKt.m4204getCenteruvyYCjk(IntSizeKt.m7156toSizeozmzZPI(this.size));
    L11:
        int bits$iv$iv$iv$iv = (int) (value$iv$iv$iv >> 32);
        float x = Float.intBitsToFloat(bits$iv$iv$iv$iv);
        int bits$iv$iv$iv$iv2 = (int) (4294967295L & value$iv$iv$iv);
        float y = Float.intBitsToFloat(bits$iv$iv$iv$iv2);
        Matrix.m4606resetToPivotedTransformimpl(this.matrixCache, x, y, $this$updateMatrix_u24lambda_u244.getTranslationX(), $this$updateMatrix_u24lambda_u244.getTranslationY(), 1.0f, $this$updateMatrix_u24lambda_u244.getRotationX(), $this$updateMatrix_u24lambda_u244.getRotationY(), $this$updateMatrix_u24lambda_u244.getRotationZ(), $this$updateMatrix_u24lambda_u244.getScaleX(), $this$updateMatrix_u24lambda_u244.getScaleY(), 1.0f);
        this.isMatrixDirty = false;
        this.isIdentity = MatrixKt.m4621isIdentity58bKbWc(this.matrixCache);
        return;
    L10:
        value$iv$iv$iv = $this$updateMatrix_u24lambda_u244.m5007getPivotOffsetF1C5BW0();
        goto L11
    L7:
        r6 = false;
        goto L8
    }
}
