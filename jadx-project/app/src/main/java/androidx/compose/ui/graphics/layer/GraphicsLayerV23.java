package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GraphicsLayerV23.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \u0091\u00012\u00020\u0001:\u0002\u0091\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010l\u001a\u00020mH\u0002J\u001a\u0010n\u001a\u00020m2\u0006\u00102\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0004\bo\u0010\u001eJ\b\u0010p\u001a\u00020>H\u0016J\b\u0010q\u001a\u00020mH\u0016J\r\u0010r\u001a\u00020mH\u0000¢\u0006\u0002\bsJ\u0010\u0010t\u001a\u00020m2\u0006\u0010u\u001a\u00020vH\u0016J\b\u0010w\u001a\u00020<H\u0002J<\u0010x\u001a\u00020m2\u0006\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020~2\u001a\u0010\u007f\u001a\u0016\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0004\u0012\u00020m0\u0080\u0001¢\u0006\u0003\b\u0082\u0001H\u0016J\t\u0010\u0083\u0001\u001a\u00020#H\u0002J)\u0010\u0084\u0001\u001a\u00020m2\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00012\u0006\u0010@\u001a\u00020AH\u0016ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J1\u0010\u0089\u0001\u001a\u00020m2\b\u0010\u008a\u0001\u001a\u00030\u008b\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0006\u0010b\u001a\u00020AH\u0016ø\u0001\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\t\u0010\u008f\u0001\u001a\u00020mH\u0002J\u0011\u0010\u0090\u0001\u001a\u00020m2\u0006\u0010M\u001a\u00020NH\u0002R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R,\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0019@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010$\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020#@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u000b\u001a\u0004\u0018\u00010+@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R,\u00102\u001a\u0002012\u0006\u0010\u000b\u001a\u000201@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u0014\u00105\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010&R\u001a\u00107\u001a\u00020#X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\u0014\u00109\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0015R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010@\u001a\u00020AX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0015R,\u0010D\u001a\u00020C2\u0006\u0010\u000b\u001a\u00020C@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bE\u0010\u0015\"\u0004\bF\u0010\u0017R\u001c\u0010G\u001a\u0004\u0018\u00010HX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u000e\u0010M\u001a\u00020NX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010O\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u000f\"\u0004\bQ\u0010\u0011R$\u0010R\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u000f\"\u0004\bT\u0010\u0011R$\u0010U\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u000f\"\u0004\bW\u0010\u0011R$\u0010X\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u000f\"\u0004\bZ\u0010\u0011R$\u0010[\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u000f\"\u0004\b]\u0010\u0011R$\u0010^\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u000f\"\u0004\b`\u0010\u0011R\u000e\u0010a\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010b\u001a\u00020AX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0018R,\u0010c\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bd\u0010\u0015\"\u0004\be\u0010\u0017R$\u0010f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u000f\"\u0004\bh\u0010\u0011R$\u0010i\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u000f\"\u0004\bk\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0092\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV23;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "ownerView", "Landroid/view/View;", "ownerId", "", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "(Landroid/view/View;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "value", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "J", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "I", "cameraDistance", "getCameraDistance", "setCameraDistance", "", "clip", "getClip", "()Z", "setClip", "(Z)V", "clipToBounds", "clipToOutline", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "compositingStrategy", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "hasDisplayList", "getHasDisplayList", "isInvalidated", "setInvalidated", "layerId", "getLayerId", "layerPaint", "Landroid/graphics/Paint;", "matrix", "Landroid/graphics/Matrix;", "outlineIsProvided", "outlineSize", "Landroidx/compose/ui/unit/IntSize;", "getOwnerId", "Landroidx/compose/ui/geometry/Offset;", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderNode", "Landroid/view/RenderNode;", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "shouldManuallySetCenterPivot", "size", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "applyClip", "", "applyCompositingStrategy", "applyCompositingStrategy-Wpw9cng", "calculateMatrix", "discardDisplayList", "discardDisplayListInternal", "discardDisplayListInternal$ui_graphics_release", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "obtainLayerPaint", "record", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "requiresCompositingLayer", "setOutline", "outline", "Landroid/graphics/Outline;", "setOutline-O0kMr_c", "(Landroid/graphics/Outline;J)V", "setPosition", "x", "", "y", "setPosition-H0pRuoY", "(IIJ)V", "updateLayerProperties", "verifyShadowColorProperties", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GraphicsLayerV23 implements GraphicsLayerImpl {
    public static final Companion Companion = null;
    private static final AtomicBoolean needToValidateAccess = null;
    private static boolean testFailCreateRenderNode;
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private float cameraDistance;
    private final CanvasDrawScope canvasDrawScope;
    private final CanvasHolder canvasHolder;
    private boolean clip;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private final long layerId;
    private Paint layerPaint;
    private Matrix matrix;
    private boolean outlineIsProvided;
    private long outlineSize;
    private final long ownerId;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final RenderNode renderNode;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private float translationX;
    private float translationY;

    /* JADX INFO: compiled from: GraphicsLayerV23.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV23$Companion;", "", "()V", "needToValidateAccess", "Ljava/util/concurrent/atomic/AtomicBoolean;", "testFailCreateRenderNode", "", "getTestFailCreateRenderNode$ui_graphics_release", "()Z", "setTestFailCreateRenderNode$ui_graphics_release", "(Z)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final boolean getTestFailCreateRenderNode$ui_graphics_release() {
            return GraphicsLayerV23.access$getTestFailCreateRenderNode$cp();
        }

        public final void setTestFailCreateRenderNode$ui_graphics_release(boolean r1) {
            GraphicsLayerV23.access$setTestFailCreateRenderNode$cp(r1);
        }
    }

    public GraphicsLayerV23(View ownerView, long ownerId, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.ownerId = ownerId;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        this.renderNode = RenderNode.create("Compose", ownerView);
        this.size = IntSize.Companion.m7149getZeroYbymL2g();
        this.outlineSize = IntSize.Companion.m7149getZeroYbymL2g();
        if (needToValidateAccess.getAndSet(false) == false) goto L6;
        this.renderNode.setScaleX(this.renderNode.getScaleX());
        this.renderNode.setScaleY(this.renderNode.getScaleY());
        this.renderNode.setTranslationX(this.renderNode.getTranslationX());
        this.renderNode.setTranslationY(this.renderNode.getTranslationY());
        this.renderNode.setElevation(this.renderNode.getElevation());
        this.renderNode.setRotation(this.renderNode.getRotation());
        this.renderNode.setRotationX(this.renderNode.getRotationX());
        this.renderNode.setRotationY(this.renderNode.getRotationY());
        this.renderNode.setCameraDistance(this.renderNode.getCameraDistance());
        this.renderNode.setPivotX(this.renderNode.getPivotX());
        this.renderNode.setPivotY(this.renderNode.getPivotY());
        this.renderNode.setClipToOutline(this.renderNode.getClipToOutline());
        this.renderNode.setClipToBounds(false);
        this.renderNode.setAlpha(this.renderNode.getAlpha());
        this.renderNode.isValid();
        this.renderNode.setLeftTopRightBottom(0, 0, 0, 0);
        this.renderNode.offsetLeftAndRight(0);
        this.renderNode.offsetTopAndBottom(0);
        verifyShadowColorProperties(this.renderNode);
        discardDisplayListInternal$ui_graphics_release();
        this.renderNode.setLayerType(0);
        this.renderNode.setHasOverlappingRendering(this.renderNode.hasOverlappingRendering());
    L6:
        if (testFailCreateRenderNode == true) goto L10;
        this.renderNode.setClipToBounds(false);
        m5032applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m4997getAutoke2Ky5w());
        this.compositingStrategy = CompositingStrategy.Companion.m4997getAutoke2Ky5w();
        this.blendMode = BlendMode.Companion.m4308getSrcOver0nO6VwU();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.ambientShadowColor = Color.Companion.m4392getBlack0d7_KjU();
        this.spotShadowColor = Color.Companion.m4392getBlack0d7_KjU();
        this.cameraDistance = 8.0f;
        this.isInvalidated = true;
        return;
    L10:
        throw new NoClassDefFoundError();
    }

    public static final /* synthetic */ boolean access$getTestFailCreateRenderNode$cp() {
        return testFailCreateRenderNode;
    }

    public static final /* synthetic */ void access$setTestFailCreateRenderNode$cp(boolean r0) {
        testFailCreateRenderNode = r0;
    }

    public /* synthetic */ GraphicsLayerV23(View r7, long r8, CanvasHolder r10, CanvasDrawScope r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 4) == 0) goto L5;
        CanvasHolder r4 = new CanvasHolder();
    L7:
        if ((r12 & 8) == 0) goto L9;
        CanvasDrawScope r5 = new CanvasDrawScope();
    L10:
        this(r7, r8, r4, r5);
        return;
    L9:
        r5 = r11;
        goto L10
    L5:
        r4 = r10;
        goto L7
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.ownerId;
    }

    private final Paint obtainLayerPaint() {
        Paint r0 = this.layerPaint;
        if (r0 != null) goto L6;
        Paint it = new Paint();
        this.layerPaint = it;
        return it;
    L6:
        return r0;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w */
    public int mo5022getCompositingStrategyke2Ky5w() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng */
    public void mo5027setCompositingStrategyWpw9cng(int value) {
        this.compositingStrategy = value;
        updateLayerProperties();
    }

    /* JADX INFO: renamed from: applyCompositingStrategy-Wpw9cng, reason: not valid java name */
    private final void m5032applyCompositingStrategyWpw9cng(int compositingStrategy) {
        RenderNode $this$applyCompositingStrategy_Wpw9cng_u24lambda_u241 = this.renderNode;
        if (CompositingStrategy.m4993equalsimpl0(compositingStrategy, CompositingStrategy.Companion.m4999getOffscreenke2Ky5w()) == false) goto L6;
        $this$applyCompositingStrategy_Wpw9cng_u24lambda_u241.setLayerType(2);
        $this$applyCompositingStrategy_Wpw9cng_u24lambda_u241.setLayerPaint(this.layerPaint);
        $this$applyCompositingStrategy_Wpw9cng_u24lambda_u241.setHasOverlappingRendering(true);
        return;
    L6:
        if (CompositingStrategy.m4993equalsimpl0(compositingStrategy, CompositingStrategy.Companion.m4998getModulateAlphake2Ky5w()) == false) goto L8;
        $this$applyCompositingStrategy_Wpw9cng_u24lambda_u241.setLayerType(0);
        $this$applyCompositingStrategy_Wpw9cng_u24lambda_u241.setLayerPaint(this.layerPaint);
        $this$applyCompositingStrategy_Wpw9cng_u24lambda_u241.setHasOverlappingRendering(false);
        return;
    L8:
        $this$applyCompositingStrategy_Wpw9cng_u24lambda_u241.setLayerType(0);
        $this$applyCompositingStrategy_Wpw9cng_u24lambda_u241.setLayerPaint(this.layerPaint);
        $this$applyCompositingStrategy_Wpw9cng_u24lambda_u241.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public int mo5021getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public void mo5026setBlendModes9anfk8(int value) {
        if (BlendMode.m4277equalsimpl0(this.blendMode, value) == true) goto L6;
        this.blendMode = value;
        Paint $this$setBlendMode_s9anfk8_u24lambda_u242 = obtainLayerPaint();
        $this$setBlendMode_s9anfk8_u24lambda_u242.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m4218toPorterDuffModes9anfk8(value)));
        updateLayerProperties();
        return;
    }

    private final boolean requiresCompositingLayer() {
        if (CompositingStrategy.m4993equalsimpl0(mo5022getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m4999getOffscreenke2Ky5w()) == false) goto L5;
    L10:
        return true;
    L5:
        if (BlendMode.m4277equalsimpl0(mo5021getBlendMode0nO6VwU(), BlendMode.Companion.m4308getSrcOver0nO6VwU()) == false) goto L10;
        if (getColorFilter() != null) goto L10;
        return false;
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer() == false) goto L5;
        m5032applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m4999getOffscreenke2Ky5w());
        return;
    L5:
        m5032applyCompositingStrategyWpw9cng(mo5022getCompositingStrategyke2Ky5w());
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(ColorFilter value) {
        this.colorFilter = value;
        if (value == null) goto L5;
        m5032applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m4999getOffscreenke2Ky5w());
        RenderNode r0 = this.renderNode;
        Paint $this$_set_colorFilter__u24lambda_u243 = obtainLayerPaint();
        $this$_set_colorFilter__u24lambda_u243.setColorFilter(AndroidColorFilter_androidKt.asAndroidColorFilter(value));
        r0.setLayerPaint($this$_set_colorFilter__u24lambda_u243);
        return;
    L5:
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float value) {
        this.alpha = value;
        this.renderNode.setAlpha(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0 */
    public long mo5023getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M */
    public void mo5029setPivotOffsetk4lQ0M(long value) {
        this.pivotOffset = value;
        if ((9223372034707292159L & value) != InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r0 = true;
    L7:
        if (r0 == false) goto L9;
        this.shouldManuallySetCenterPivot = true;
        RenderNode r1 = this.renderNode;
        long arg0$iv = this.size;
        r1.setPivotX(((int) (arg0$iv >> 32)) / 2.0f);
        RenderNode r2 = this.renderNode;
        long arg0$iv2 = this.size;
        r2.setPivotY(((int) (4294967295L & arg0$iv2)) / 2.0f);
        return;
    L9:
        this.shouldManuallySetCenterPivot = false;
        int bits$iv$iv$iv = (int) (value >> 32);
        this.renderNode.setPivotX(Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (4294967295L & value);
        this.renderNode.setPivotY(Float.intBitsToFloat(bits$iv$iv$iv2));
        return;
    L5:
        r0 = false;
        goto L7
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float value) {
        this.scaleX = value;
        this.renderNode.setScaleX(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float value) {
        this.scaleY = value;
        this.renderNode.setScaleY(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float value) {
        this.translationX = value;
        this.renderNode.setTranslationX(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float value) {
        this.translationY = value;
        this.renderNode.setTranslationY(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float value) {
        this.shadowElevation = value;
        this.renderNode.setElevation(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo5020getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA */
    public void mo5025setAmbientShadowColor8_81llA(long value) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        this.ambientShadowColor = value;
        RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(this.renderNode, ColorKt.m4420toArgb8_81llA(value));
        return;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU */
    public long mo5024getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA */
    public void mo5031setSpotShadowColor8_81llA(long value) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        this.spotShadowColor = value;
        RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(this.renderNode, ColorKt.m4420toArgb8_81llA(value));
        return;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float value) {
        this.rotationX = value;
        this.renderNode.setRotationX(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float value) {
        this.rotationY = value;
        this.renderNode.setRotationY(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float value) {
        this.rotationZ = value;
        this.renderNode.setRotation(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float value) {
        this.cameraDistance = value;
        this.renderNode.setCameraDistance(-value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean value) {
        this.clip = value;
        applyClip();
    }

    private final void applyClip() {
        boolean newClipToOutline = true;
        if (getClip() == true) goto L5;
    L7:
        boolean newClipToBounds = false;
    L9:
        if (getClip() == true) goto L11;
    L13:
        newClipToOutline = false;
    L15:
        if (newClipToBounds == this.clipToBounds) goto L18;
        this.clipToBounds = newClipToBounds;
        this.renderNode.setClipToBounds(this.clipToBounds);
    L18:
        if (newClipToOutline == this.clipToOutline) goto L21;
        this.clipToOutline = newClipToOutline;
        this.renderNode.setClipToOutline(newClipToOutline);
        return;
    L21:
        return;
    L11:
        if (this.outlineIsProvided == false) goto L13;
    L5:
        if (this.outlineIsProvided == true) goto L7;
        newClipToBounds = true;
        goto L9
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect r1) {
        this.renderEffect = r1;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setPosition-H0pRuoY */
    public void mo5030setPositionH0pRuoY(int x, int y, long size) {
        this.renderNode.setLeftTopRightBottom(x, y, ((int) (size >> 32)) + x, ((int) (size & 4294967295L)) + y);
        if (IntSize.m7142equalsimpl0(this.size, size) == false) goto L5;
        return;
    L5:
        if (this.shouldManuallySetCenterPivot == false) goto L7;
        this.renderNode.setPivotX(((int) (size >> 32)) / 2.0f);
        this.renderNode.setPivotY(((int) (size & 4294967295L)) / 2.0f);
    L7:
        this.size = size;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setOutline-O0kMr_c */
    public void mo5028setOutlineO0kMr_c(Outline outline, long outlineSize) {
        this.outlineSize = outlineSize;
        this.renderNode.setOutline(outline);
        if (outline == null) goto L5;
        boolean r0 = true;
    L6:
        this.outlineIsProvided = r0;
        applyClip();
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setInvalidated(boolean r1) {
        this.isInvalidated = r1;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getHasDisplayList() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void record(Density density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1<? super DrawScope, Unit> r25) {
        RenderNode r0 = this.renderNode;
        long arg0$iv = this.size;
        int r5 = (int) (arg0$iv >> 32);
        long arg0$iv2 = this.outlineSize;
        int r2 = Math.max(r5, (int) (arg0$iv2 >> 32));
        long arg0$iv3 = this.size;
        int r6 = (int) (arg0$iv3 & 4294967295L);
        long arg0$iv4 = this.outlineSize;
        Canvas r1 = r0.start(r2, Math.max(r6, (int) (4294967295L & arg0$iv4)));
        CanvasHolder this_$iv = this.canvasHolder;     // Catch: Throwable -> L13
        Canvas previousCanvas$iv = this_$iv.getAndroidCanvas().getInternalCanvas();     // Catch: Throwable -> L13
        this_$iv.getAndroidCanvas().setInternalCanvas(r1);     // Catch: Throwable -> L13
        androidx.compose.ui.graphics.Canvas $this$record_u24lambda_u244 = this_$iv.getAndroidCanvas();     // Catch: Throwable -> L13
        DrawScope $this$draw_u2dymL40Pk$iv = this.canvasDrawScope;     // Catch: Throwable -> L13
        long size$iv = IntSizeKt.m7156toSizeozmzZPI(this.size);     // Catch: Throwable -> L13
        Density prevDensity$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().getDensity();     // Catch: Throwable -> L13
        LayoutDirection prevLayoutDirection$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().getLayoutDirection();     // Catch: Throwable -> L13
        androidx.compose.ui.graphics.Canvas prevCanvas$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().getCanvas();     // Catch: Throwable -> L13
        long prevSize$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().mo4838getSizeNHjbRc();     // Catch: Throwable -> L13
        GraphicsLayer prevLayer$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().getGraphicsLayer();     // Catch: Throwable -> L13
        DrawContext $this$draw_ymL40Pk_u24lambda_u247$iv = $this$draw_u2dymL40Pk$iv.getDrawContext();     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u247$iv.setDensity(density);     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u247$iv.setLayoutDirection(layoutDirection);     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u247$iv.setCanvas($this$record_u24lambda_u244);     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u247$iv.mo4839setSizeuvyYCjk(size$iv);     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u247$iv.setGraphicsLayer(layer);     // Catch: Throwable -> L13
        $this$record_u24lambda_u244.save();     // Catch: Throwable -> L13
        r25.invoke($this$draw_u2dymL40Pk$iv);     // Catch: Throwable -> L9
        $this$record_u24lambda_u244.restore();     // Catch: Throwable -> L13
        DrawContext $this$draw_ymL40Pk_u24lambda_u248$iv = $this$draw_u2dymL40Pk$iv.getDrawContext();     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u248$iv.setDensity(prevDensity$iv);     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u248$iv.setLayoutDirection(prevLayoutDirection$iv);     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u248$iv.setCanvas(prevCanvas$iv);     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u248$iv.mo4839setSizeuvyYCjk(prevSize$iv);     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u248$iv.setGraphicsLayer(prevLayer$iv);     // Catch: Throwable -> L13
        this_$iv.getAndroidCanvas().setInternalCanvas(previousCanvas$iv);     // Catch: Throwable -> L13
        this.renderNode.end(r1);
        setInvalidated(false);
        return;
    L9:
        th = move-exception;
        $this$record_u24lambda_u244.restore();     // Catch: Throwable -> L13
        DrawContext $this$draw_ymL40Pk_u24lambda_u248$iv2 = $this$draw_u2dymL40Pk$iv.getDrawContext();     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setDensity(prevDensity$iv);     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setLayoutDirection(prevLayoutDirection$iv);     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setCanvas(prevCanvas$iv);     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u248$iv2.mo4839setSizeuvyYCjk(prevSize$iv);     // Catch: Throwable -> L13
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setGraphicsLayer(prevLayer$iv);     // Catch: Throwable -> L13
        throw th;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        this.renderNode.end(r1);
        throw th;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(androidx.compose.ui.graphics.Canvas canvas) {
        DisplayListCanvas r0 = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        r0.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix calculateMatrix() {
        Matrix it = this.matrix;
        if (it != null) goto L5;
        it = new Matrix();
        this.matrix = it;
    L5:
        this.renderNode.getMatrix(it);
        return it;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        discardDisplayListInternal$ui_graphics_release();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.layerId;
    }

    private final void verifyShadowColorProperties(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(renderNode, RenderNodeVerificationHelper28.INSTANCE.getAmbientShadowColor(renderNode));
        RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(renderNode, RenderNodeVerificationHelper28.INSTANCE.getSpotShadowColor(renderNode));
        return;
    }

    public final void discardDisplayListInternal$ui_graphics_release() {
        RenderNodeVerificationHelper24.INSTANCE.discardDisplayList(this.renderNode);
    }

    static {
        Companion = new Companion(null);
        needToValidateAccess = new AtomicBoolean(true);
    }
}
