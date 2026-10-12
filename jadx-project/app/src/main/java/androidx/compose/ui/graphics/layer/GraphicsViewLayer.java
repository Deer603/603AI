package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
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
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u009a\u00012\u00020\u0001:\u0002\u009a\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010w\u001a\u00020x2\u0006\u00106\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0004\by\u0010\u001eJ\b\u0010z\u001a\u00020{H\u0016J\b\u0010|\u001a\u00020xH\u0016J\u0010\u0010}\u001a\u00020x2\u0006\u0010~\u001a\u00020\u007fH\u0016J\t\u0010\u0080\u0001\u001a\u00020>H\u0002JD\u0010\u0081\u0001\u001a\u00020x2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u001b\u0010\u0088\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0004\u0012\u00020x0\u0089\u0001¢\u0006\u0003\b\u008b\u0001H\u0016J\t\u0010\u008c\u0001\u001a\u00020xH\u0002J\t\u0010\u008d\u0001\u001a\u00020%H\u0002J\t\u0010\u008e\u0001\u001a\u00020%H\u0002J*\u0010\u008f\u0001\u001a\u00020x2\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00012\u0007\u0010\u0092\u0001\u001a\u00020fH\u0016ø\u0001\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J-\u0010\u0095\u0001\u001a\u00020x2\u0006\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020u2\u0006\u0010e\u001a\u00020fH\u0016ø\u0001\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\t\u0010\u0098\u0001\u001a\u00020xH\u0002J\t\u0010\u0099\u0001\u001a\u00020xH\u0002R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R,\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0019@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R$\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R(\u00100\u001a\u0004\u0018\u00010/2\b\u0010\u000b\u001a\u0004\u0018\u00010/@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R,\u00106\u001a\u0002052\u0006\u0010\u000b\u001a\u000205@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001eR\u001a\u00109\u001a\u00020%X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0015R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0015R\u0010\u0010A\u001a\u0004\u0018\u00010BX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010F\u001a\u00020E2\u0006\u0010\u000b\u001a\u00020E@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bG\u0010\u0015\"\u0004\bH\u0010\u0017R(\u0010J\u001a\u0004\u0018\u00010I2\b\u0010\u000b\u001a\u0004\u0018\u00010I@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010O\u001a\n Q*\u0004\u0018\u00010P0PX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010R\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u000f\"\u0004\bT\u0010\u0011R$\u0010U\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u000f\"\u0004\bW\u0010\u0011R$\u0010X\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u000f\"\u0004\bZ\u0010\u0011R$\u0010[\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u000f\"\u0004\b]\u0010\u0011R$\u0010^\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u000f\"\u0004\b`\u0010\u0011R$\u0010a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u000f\"\u0004\bc\u0010\u0011R\u000e\u0010d\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010e\u001a\u00020fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0018R,\u0010g\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bh\u0010\u0015\"\u0004\bi\u0010\u0017R\u0014\u0010j\u001a\u00020%X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010(R$\u0010l\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u000f\"\u0004\bn\u0010\u0011R$\u0010o\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u000f\"\u0004\bq\u0010\u0011R\u000e\u0010r\u001a\u00020sX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020uX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020uX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009b\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "layerContainer", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "ownerId", "", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "(Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "value", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "J", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "I", "cameraDistance", "getCameraDistance", "setCameraDistance", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "", "clip", "getClip", "()Z", "setClip", "(Z)V", "clipBoundsInvalidated", "clipRect", "Landroid/graphics/Rect;", "clipToBounds", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "compositingStrategy", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "isInvalidated", "setInvalidated", "layerId", "getLayerId", "layerPaint", "Landroid/graphics/Paint;", "outlineIsProvided", "getOwnerId", "picture", "Landroid/graphics/Picture;", "pictureCanvasHolder", "pictureDrawScope", "Landroidx/compose/ui/geometry/Offset;", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "shouldManuallySetCenterPivot", "size", "Landroidx/compose/ui/unit/IntSize;", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "supportsSoftwareRendering", "getSupportsSoftwareRendering", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "viewLayer", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "x", "", "y", "applyCompositingLayer", "", "applyCompositingLayer-Wpw9cng", "calculateMatrix", "Landroid/graphics/Matrix;", "discardDisplayList", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "obtainLayerPaint", "record", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "recordDrawingOperations", "requiresCompositingLayer", "requiresLayerPaint", "setOutline", "outline", "Landroid/graphics/Outline;", "outlineSize", "setOutline-O0kMr_c", "(Landroid/graphics/Outline;J)V", "setPosition", "setPosition-H0pRuoY", "(IIJ)V", "updateClipBounds", "updateLayerProperties", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    public static final Companion Companion = null;
    private static final Canvas PlaceholderCanvas = null;
    private static final boolean mayRenderInSoftware = false;
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private final CanvasHolder canvasHolder;
    private boolean clipBoundsInvalidated;
    private final Rect clipRect;
    private boolean clipToBounds;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private final DrawChildContainer layerContainer;
    private final long layerId;
    private Paint layerPaint;
    private boolean outlineIsProvided;
    private final long ownerId;
    private final Picture picture;
    private final CanvasHolder pictureCanvasHolder;
    private final CanvasDrawScope pictureDrawScope;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final Resources resources;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private final boolean supportsSoftwareRendering;
    private float translationX;
    private float translationY;
    private final ViewLayer viewLayer;
    private int x;
    private int y;

    /* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer$Companion;", "", "()V", "PlaceholderCanvas", "Landroid/graphics/Canvas;", "getPlaceholderCanvas", "()Landroid/graphics/Canvas;", "mayRenderInSoftware", "", "getMayRenderInSoftware", "()Z", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final boolean getMayRenderInSoftware() {
            return GraphicsViewLayer.access$getMayRenderInSoftware$cp();
        }

        public final Canvas getPlaceholderCanvas() {
            return GraphicsViewLayer.access$getPlaceholderCanvas$cp();
        }
    }

    public GraphicsViewLayer(DrawChildContainer layerContainer, long ownerId, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.layerContainer = layerContainer;
        this.ownerId = ownerId;
        this.canvasHolder = canvasHolder;
        this.viewLayer = new ViewLayer(this.layerContainer, this.canvasHolder, canvasDrawScope);
        this.resources = this.layerContainer.getResources();
        this.clipRect = new Rect();
        if (mayRenderInSoftware == false) goto L5;
        Picture r0 = new Picture();
    L6:
        this.picture = r0;
        if (mayRenderInSoftware == false) goto L9;
        CanvasDrawScope r1 = new CanvasDrawScope();
    L10:
        this.pictureDrawScope = r1;
        if (mayRenderInSoftware == false) goto L13;
        CanvasHolder r2 = new CanvasHolder();
    L14:
        this.pictureCanvasHolder = r2;
        this.layerContainer.addView(this.viewLayer);
        this.viewLayer.setClipBounds(null);
        this.size = IntSize.Companion.m7149getZeroYbymL2g();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = BlendMode.Companion.m4308getSrcOver0nO6VwU();
        this.compositingStrategy = CompositingStrategy.Companion.m4997getAutoke2Ky5w();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.Companion.m4141getZeroF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.ambientShadowColor = Color.Companion.m4392getBlack0d7_KjU();
        this.spotShadowColor = Color.Companion.m4392getBlack0d7_KjU();
        this.supportsSoftwareRendering = mayRenderInSoftware;
        return;
    L13:
        r2 = null;
        goto L14
    L9:
        r1 = null;
        goto L10
    L5:
        r0 = null;
        goto L6
    }

    public /* synthetic */ GraphicsViewLayer(DrawChildContainer r7, long r8, CanvasHolder r10, CanvasDrawScope r11, int r12, DefaultConstructorMarker r13) {
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

    public static final /* synthetic */ boolean access$getMayRenderInSoftware$cp() {
        return mayRenderInSoftware;
    }

    public static final /* synthetic */ Canvas access$getPlaceholderCanvas$cp() {
        return PlaceholderCanvas;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.ownerId;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
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
    public long getLayerId() {
        return this.layerId;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public int mo5021getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public void mo5026setBlendModes9anfk8(int value) {
        this.blendMode = value;
        Paint $this$setBlendMode_s9anfk8_u24lambda_u240 = obtainLayerPaint();
        $this$setBlendMode_s9anfk8_u24lambda_u240.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m4218toPorterDuffModes9anfk8(value)));
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(ColorFilter value) {
        this.colorFilter = value;
        Paint $this$_set_colorFilter__u24lambda_u241 = obtainLayerPaint();
        if (value == null) goto L5;
        android.graphics.ColorFilter r2 = AndroidColorFilter_androidKt.asAndroidColorFilter(value);
    L6:
        $this$_set_colorFilter__u24lambda_u241.setColorFilter(r2);
        updateLayerProperties();
        return;
    L5:
        r2 = null;
        goto L6
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

    /* JADX INFO: renamed from: applyCompositingLayer-Wpw9cng, reason: not valid java name */
    private final void m5034applyCompositingLayerWpw9cng(int compositingStrategy) {
        ViewLayer r0 = this.viewLayer;
        boolean r2 = true;
        if (CompositingStrategy.m4993equalsimpl0(compositingStrategy, CompositingStrategy.Companion.m4999getOffscreenke2Ky5w()) == false) goto L5;
        this.viewLayer.setLayerType(2, this.layerPaint);
    L9:
        r0.setCanUseCompositingLayer$ui_graphics_release(r2);
        return;
    L5:
        boolean r1 = CompositingStrategy.m4993equalsimpl0(compositingStrategy, CompositingStrategy.Companion.m4998getModulateAlphake2Ky5w());
        ViewLayer r3 = this.viewLayer;
        if (r1 == false) goto L8;
        r3.setLayerType(0, this.layerPaint);
        r2 = false;
        goto L9
    L8:
        r3.setLayerType(0, this.layerPaint);
        goto L9
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer() == false) goto L5;
        m5034applyCompositingLayerWpw9cng(CompositingStrategy.Companion.m4999getOffscreenke2Ky5w());
        return;
    L5:
        m5034applyCompositingLayerWpw9cng(mo5022getCompositingStrategyke2Ky5w());
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

    private final boolean requiresCompositingLayer() {
        if (CompositingStrategy.m4993equalsimpl0(mo5022getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m4999getOffscreenke2Ky5w()) == false) goto L5;
    L8:
        return true;
    L5:
        if (requiresLayerPaint() == true) goto L8;
        return false;
    }

    private final boolean requiresLayerPaint() {
        if (BlendMode.m4277equalsimpl0(mo5021getBlendMode0nO6VwU(), BlendMode.Companion.m4308getSrcOver0nO6VwU()) == true) goto L5;
    L8:
        return true;
    L5:
        if (getColorFilter() != null) goto L8;
        return false;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float value) {
        this.alpha = value;
        this.viewLayer.setAlpha(value);
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
        if (r0 == true) goto L9;
        this.shouldManuallySetCenterPivot = false;
        int bits$iv$iv$iv = (int) (value >> 32);
        this.viewLayer.setPivotX(Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (4294967295L & value);
        this.viewLayer.setPivotY(Float.intBitsToFloat(bits$iv$iv$iv2));
        return;
    L9:
        if (Build.VERSION.SDK_INT < 28) goto L11;
        ViewLayerVerificationHelper28.INSTANCE.resetPivot(this.viewLayer);
        return;
    L11:
        this.shouldManuallySetCenterPivot = true;
        ViewLayer r1 = this.viewLayer;
        long arg0$iv = this.size;
        r1.setPivotX(((int) (arg0$iv >> 32)) / 2.0f);
        ViewLayer r2 = this.viewLayer;
        long arg0$iv2 = this.size;
        r2.setPivotY(((int) (4294967295L & arg0$iv2)) / 2.0f);
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
        this.viewLayer.setScaleX(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float value) {
        this.scaleY = value;
        this.viewLayer.setScaleY(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float value) {
        this.translationX = value;
        this.viewLayer.setTranslationX(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float value) {
        this.translationY = value;
        this.viewLayer.setTranslationY(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float value) {
        this.shadowElevation = value;
        this.viewLayer.setElevation(value);
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
        ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this.viewLayer, ColorKt.m4420toArgb8_81llA(value));
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
        ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this.viewLayer, ColorKt.m4420toArgb8_81llA(value));
        return;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float value) {
        this.rotationX = value;
        this.viewLayer.setRotationX(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float value) {
        this.rotationY = value;
        this.viewLayer.setRotationY(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float value) {
        this.rotationZ = value;
        this.viewLayer.setRotation(value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float value) {
        this.viewLayer.setCameraDistance(this.resources.getDisplayMetrics().densityDpi * value);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        if (this.clipToBounds == false) goto L5;
    L8:
        return true;
    L5:
        if (this.viewLayer.getClipToOutline() == true) goto L8;
        return false;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean value) {
        boolean r0 = false;
        if (value == true) goto L5;
    L7:
        boolean r2 = false;
    L8:
        this.clipToBounds = r2;
        this.clipBoundsInvalidated = true;
        ViewLayer r3 = this.viewLayer;
        if (value == true) goto L11;
    L13:
        r3.setClipToOutline(r0);
        return;
    L11:
        if (this.outlineIsProvided == false) goto L13;
        r0 = true;
        goto L13
    L5:
        if (this.outlineIsProvided == true) goto L7;
        r2 = true;
        goto L8
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect value) {
        this.renderEffect = value;
        if (Build.VERSION.SDK_INT < 31) goto L6;
        ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this.viewLayer, value);
        return;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setPosition-H0pRuoY */
    public void mo5030setPositionH0pRuoY(int x, int y, long size) {
        if (IntSize.m7142equalsimpl0(this.size, size) == true) goto L11;
        if (getClip() == false) goto L7;
        this.clipBoundsInvalidated = true;
    L7:
        this.viewLayer.layout(x, y, ((int) (size >> 32)) + x, ((int) (size & 4294967295L)) + y);
        this.size = size;
        if (this.shouldManuallySetCenterPivot == false) goto L16;
        this.viewLayer.setPivotX(((int) (size >> 32)) / 2.0f);
        this.viewLayer.setPivotY(((int) (size & 4294967295L)) / 2.0f);
    L16:
        this.x = x;
        this.y = y;
        return;
    L11:
        if (this.x == x) goto L14;
        this.viewLayer.offsetLeftAndRight(x - this.x);
    L14:
        if (this.y == y) goto L16;
        this.viewLayer.offsetTopAndBottom(y - this.y);
        goto L16
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setOutline-O0kMr_c */
    public void mo5028setOutlineO0kMr_c(Outline outline, long outlineSize) {
        boolean r1 = true;
        boolean requiresRedraw = !this.viewLayer.setLayerOutline(outline);
        if (getClip() == false) goto L8;
        if (outline == null) goto L8;
        this.viewLayer.setClipToOutline(true);
        if (this.clipToBounds == false) goto L8;
        this.clipToBounds = false;
        this.clipBoundsInvalidated = true;
    L8:
        if (outline != null) goto L11;
        r1 = false;
    L11:
        this.outlineIsProvided = r1;
        if (requiresRedraw == false) goto L15;
        this.viewLayer.invalidate();
        recordDrawingOperations();
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [androidx.compose.ui.graphics.drawscope.DrawContext] */
    /* JADX WARN: Type inference failed for: r16v1, types: [androidx.compose.ui.graphics.drawscope.DrawContext] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [android.graphics.Picture] */
    /* JADX WARN: Type inference failed for: r18v7, types: [androidx.compose.ui.unit.Density] */
    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void record(Density density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1<? super DrawScope, Unit> r29) {
        if (this.viewLayer.getParent() != null) goto L5;
        this.layerContainer.addView(this.viewLayer);
    L5:
        this.viewLayer.setDrawParams(density, layoutDirection, layer, r29);
        if (this.viewLayer.isAttachedToWindow() == false) goto L34;
        this.viewLayer.setVisibility(4);
        this.viewLayer.setVisibility(0);
        recordDrawingOperations();
        Picture r0 = this.picture;
        if (r0 == null) goto L40;
        Picture p = r0;
        long arg0$iv = this.size;
        int r10 = (int) (arg0$iv >> 32);
        long arg0$iv2 = this.size;
        Canvas pictureCanvas = p.beginRecording(r10, (int) (4294967295L & arg0$iv2));
        CanvasHolder this_$iv = this.pictureCanvasHolder;     // Catch: Throwable -> L30
        if (this_$iv == null) goto L28;
        Canvas previousCanvas$iv = this_$iv.getAndroidCanvas().getInternalCanvas();     // Catch: Throwable -> L30
        this_$iv.getAndroidCanvas().setInternalCanvas(pictureCanvas);     // Catch: Throwable -> L30
        androidx.compose.ui.graphics.Canvas $this$record_u24lambda_u244_u24lambda_u243 = this_$iv.getAndroidCanvas();     // Catch: Throwable -> L30
        DrawScope r1 = this.pictureDrawScope;     // Catch: Throwable -> L30
        if (r1 == null) goto L24;
        DrawScope $this$draw_u2dymL40Pk$iv = r1;     // Catch: Throwable -> L30
        long size$iv = IntSizeKt.m7156toSizeozmzZPI(this.size);     // Catch: Throwable -> L30
        ?? r18 = $this$draw_u2dymL40Pk$iv.getDrawContext().getDensity();     // Catch: Throwable -> L30
        LayoutDirection prevLayoutDirection$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().getLayoutDirection();     // Catch: Throwable -> L30
        androidx.compose.ui.graphics.Canvas prevCanvas$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().getCanvas();     // Catch: Throwable -> L30
        long prevSize$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().mo4838getSizeNHjbRc();     // Catch: Throwable -> L30
        GraphicsLayer prevLayer$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().getGraphicsLayer();     // Catch: Throwable -> L30
        DrawContext $this$draw_ymL40Pk_u24lambda_u247$iv = $this$draw_u2dymL40Pk$iv.getDrawContext();     // Catch: Throwable -> L30
        $this$draw_ymL40Pk_u24lambda_u247$iv.setDensity(density);     // Catch: Throwable -> L30
        $this$draw_ymL40Pk_u24lambda_u247$iv.setLayoutDirection(layoutDirection);     // Catch: Throwable -> L30
        $this$draw_ymL40Pk_u24lambda_u247$iv.setCanvas($this$record_u24lambda_u244_u24lambda_u243);     // Catch: Throwable -> L30
        $this$draw_ymL40Pk_u24lambda_u247$iv.mo4839setSizeuvyYCjk(size$iv);     // Catch: Throwable -> L30
        $this$draw_ymL40Pk_u24lambda_u247$iv.setGraphicsLayer(layer);     // Catch: Throwable -> L30
        $this$record_u24lambda_u244_u24lambda_u243.save();     // Catch: Throwable -> L30
        r29.invoke($this$draw_u2dymL40Pk$iv);     // Catch: Throwable -> L20
        $this$record_u24lambda_u244_u24lambda_u243.restore();     // Catch: Throwable -> L30
        ?? r2 = $this$draw_u2dymL40Pk$iv.getDrawContext();     // Catch: Throwable -> L30
        r2.setDensity(r18);     // Catch: Throwable -> L30
        r2.setLayoutDirection(prevLayoutDirection$iv);     // Catch: Throwable -> L30
        r2.setCanvas(prevCanvas$iv);     // Catch: Throwable -> L30
        r2.mo4839setSizeuvyYCjk(prevSize$iv);     // Catch: Throwable -> L30
        r2.setGraphicsLayer(prevLayer$iv);     // Catch: Throwable -> L26
        goto L24
    L20:
        th = move-exception;
        $this$record_u24lambda_u244_u24lambda_u243.restore();     // Catch: Throwable -> L26
        ?? r16 = $this$draw_u2dymL40Pk$iv.getDrawContext();     // Catch: Throwable -> L26
        r16.setDensity(r18);     // Catch: Throwable -> L26
        r16.setLayoutDirection(prevLayoutDirection$iv);     // Catch: Throwable -> L26
        r16.setCanvas(prevCanvas$iv);     // Catch: Throwable -> L26
        r16.mo4839setSizeuvyYCjk(prevSize$iv);     // Catch: Throwable -> L26
        r16.setGraphicsLayer(prevLayer$iv);     // Catch: Throwable -> L26
        throw th;     // Catch: Throwable -> L26
    L24:
        this_$iv.getAndroidCanvas().setInternalCanvas(previousCanvas$iv);     // Catch: Throwable -> L26
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L26
    L29:
        p.endRecording();
        return;
    L26:
        th = th;
    L32:
        r18.endRecording();
        throw th;
    L28:
        p = p;
    L30:
        th = th;
        r18 = p;
        goto L32
    L40:
        return;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
    }

    private final void recordDrawingOperations() {
        CanvasHolder this_$iv = this.canvasHolder;     // Catch: Throwable -> L4
        Canvas targetCanvas$iv = PlaceholderCanvas;     // Catch: Throwable -> L4
        Canvas previousCanvas$iv = this_$iv.getAndroidCanvas().getInternalCanvas();     // Catch: Throwable -> L4
        this_$iv.getAndroidCanvas().setInternalCanvas(targetCanvas$iv);     // Catch: Throwable -> L4
        androidx.compose.ui.graphics.Canvas $this$recordDrawingOperations_u24lambda_u245 = this_$iv.getAndroidCanvas();     // Catch: Throwable -> L4
        this.layerContainer.drawChild$ui_graphics_release($this$recordDrawingOperations_u24lambda_u245, this.viewLayer, this.viewLayer.getDrawingTime());     // Catch: Throwable -> L4
        this_$iv.getAndroidCanvas().setInternalCanvas(previousCanvas$iv);     // Catch: Throwable -> L4
        return;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(androidx.compose.ui.graphics.Canvas canvas) {
        updateClipBounds();
        Canvas androidCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (androidCanvas.isHardwareAccelerated() == false) goto L5;
        this.layerContainer.drawChild$ui_graphics_release(canvas, this.viewLayer, this.viewLayer.getDrawingTime());
        return;
    L5:
        Picture it = this.picture;
        if (it == null) goto L10;
        androidCanvas.drawPicture(it);
        return;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix calculateMatrix() {
        return this.viewLayer.getMatrix();
    }

    private final void updateClipBounds() {
        if (this.clipBoundsInvalidated == false) goto L12;
        ViewLayer r0 = this.viewLayer;
        if (getClip() == true) goto L7;
    L9:
        Rect $this$updateClipBounds_u24lambda_u247 = null;
    L10:
        r0.setClipBounds($this$updateClipBounds_u24lambda_u247);
        return;
    L7:
        if (this.outlineIsProvided == true) goto L9;
        $this$updateClipBounds_u24lambda_u247 = this.clipRect;
        $this$updateClipBounds_u24lambda_u247.left = 0;
        $this$updateClipBounds_u24lambda_u247.top = 0;
        $this$updateClipBounds_u24lambda_u247.right = this.viewLayer.getWidth();
        $this$updateClipBounds_u24lambda_u247.bottom = this.viewLayer.getHeight();
        goto L10
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    static {
        Companion = new Companion(null);
        mayRenderInSoftware = !SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable();
        PlaceholderCanvas = new GraphicsViewLayer$Companion$PlaceholderCanvas$1();
    }
}
