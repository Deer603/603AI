package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002JF\u0010'\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "widthParameter", "Landroidx/compose/ui/unit/Dp;", "brushParameter", "Landroidx/compose/ui/graphics/Brush;", "shapeParameter", "Landroidx/compose/ui/graphics/Shape;", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "borderCache", "Landroidx/compose/foundation/BorderCache;", "value", "brush", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "shape", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "width", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "F", "drawGenericBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "fillArea", "", "strokeWidth", "", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 0;
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private Shape shape;
    private float width;

    static {
        $stable = 8;
    }

    public /* synthetic */ BorderModifierNode(float r1, Brush r2, Shape r3, DefaultConstructorMarker r4) {
        this(r1, r2, r3);
    }

    public static final /* synthetic */ DrawResult access$drawGenericBorder(BorderModifierNode $this, CacheDrawScope $receiver, Brush brush, Outline.Generic outline, boolean fillArea, float strokeWidth) {
        return $this.drawGenericBorder($receiver, brush, outline, fillArea, strokeWidth);
    }

    /* JADX INFO: renamed from: access$drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public static final /* synthetic */ DrawResult m250access$drawRoundRectBorderJqoCqck(BorderModifierNode $this, CacheDrawScope $receiver, Brush brush, Outline.Rounded outline, long topLeft, long borderSize, boolean fillArea, float strokeWidth) {
        return $this.m251drawRoundRectBorderJqoCqck($receiver, brush, outline, topLeft, borderSize, fillArea, strokeWidth);
    }

    private BorderModifierNode(float widthParameter, Brush brushParameter, Shape shapeParameter) {
        this.width = widthParameter;
        this.brush = brushParameter;
        this.shape = shapeParameter;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new BorderModifierNode$drawWithCacheModifierNode$1(this)));
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m252getWidthD9Ej5fM() {
        return this.width;
    }

    /* JADX INFO: renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m253setWidth0680j_4(float value) {
        if (Dp.m6978equalsimpl0(this.width, value) == true) goto L6;
        this.width = value;
        this.drawWithCacheModifierNode.invalidateDrawCache();
        return;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(Brush value) {
        if (Intrinsics.areEqual(this.brush, value) == true) goto L6;
        this.brush = value;
        this.drawWithCacheModifierNode.invalidateDrawCache();
        return;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(Shape value) {
        if (Intrinsics.areEqual(this.shape, value) == true) goto L6;
        this.shape = value;
        this.drawWithCacheModifierNode.invalidateDrawCache();
        return;
    }

    /* JADX WARN: Type inference failed for: r42v1, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    private final DrawResult drawGenericBorder(CacheDrawScope $this$drawGenericBorder, final Brush brush, final Outline.Generic outline, boolean fillArea, float strokeWidth) {
        if (fillArea == false) goto L6;
        return $this$drawGenericBorder.onDrawWithContent(new AnonymousClass1(outline, brush));
    L6:
        if ((brush instanceof SolidColor) == false) goto L8;
        int config = ImageBitmapConfig.Companion.m4585getAlpha8_sVssgQ();
        ColorFilter colorFilter = ColorFilter.Companion.m4407tintxETnrds$default(ColorFilter.Companion, Color.m4365copywmQWz5c$default(((SolidColor) brush).m4701getValue0d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), 0, 2, null);
        int config2 = config;
        ColorFilter colorFilter2 = colorFilter;
    L9:
        final Rect pathBounds = outline.getPath().getBounds();
        if (this.borderCache != null) goto L12;
        this.borderCache = new BorderCache(null, null, null, null, 15, null);
    L12:
        BorderCache r0 = this.borderCache;
        Intrinsics.checkNotNull(r0);
        Path $this$drawGenericBorder_u24lambda_u240 = r0.obtainPath();
        $this$drawGenericBorder_u24lambda_u240.reset();
        ImageBitmapConfig r8 = null;
        Path.addRect$default($this$drawGenericBorder_u24lambda_u240, pathBounds, null, 2, null);
        $this$drawGenericBorder_u24lambda_u240.mo4258opN5in7k0($this$drawGenericBorder_u24lambda_u240, outline.getPath(), PathOperation.Companion.m4658getDifferenceb3I0S0c());
        final Ref.ObjectRef cacheImageBitmap = new Ref.ObjectRef();
        int width$iv = (int) Math.ceil(pathBounds.getRight() - pathBounds.getLeft());
        int height$iv = (int) Math.ceil(pathBounds.getBottom() - pathBounds.getTop());
        final long pathBoundsSize = IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
        BorderCache $this$drawGenericBorder_u24lambda_u244 = this.borderCache;
        Intrinsics.checkNotNull($this$drawGenericBorder_u24lambda_u244);
        ImageBitmap targetImageBitmap$iv = BorderCache.access$getImageBitmap$p($this$drawGenericBorder_u24lambda_u244);
        Canvas targetCanvas$iv = BorderCache.access$getCanvas$p($this$drawGenericBorder_u24lambda_u244);
        if (targetImageBitmap$iv == null) goto L15;
        ImageBitmapConfig r9 = ImageBitmapConfig.m4578boximpl(targetImageBitmap$iv.mo4233getConfig_sVssgQ());
    L16:
        int r10 = ImageBitmapConfig.Companion.m4586getArgb8888_sVssgQ();
        boolean r11 = false;
        if (r9 != null) goto L19;
        boolean r12 = false;
    L20:
        if (r12 == true) goto L25;
        if (targetImageBitmap$iv == null) goto L24;
        r8 = ImageBitmapConfig.m4578boximpl(targetImageBitmap$iv.mo4233getConfig_sVssgQ());
    L24:
        if (ImageBitmapConfig.m4580equalsimpl(config2, r8) == true) goto L25;
    L26:
        boolean compatibleConfig$iv = r11;
        if (targetImageBitmap$iv == null) goto L38;
        if (targetCanvas$iv == null) goto L38;
        long arg0$iv$iv = $this$drawGenericBorder.m3986getSizeNHjbRc();
        int bits$iv$iv$iv$iv = (int) (arg0$iv$iv >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv$iv) > targetImageBitmap$iv.getWidth()) goto L38;
        long arg0$iv$iv2 = $this$drawGenericBorder.m3986getSizeNHjbRc();
        int bits$iv$iv$iv$iv2 = (int) (arg0$iv$iv2 & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv$iv2) > targetImageBitmap$iv.getHeight()) goto L38;
        if (compatibleConfig$iv == false) goto L38;
        ImageBitmap targetImageBitmap$iv2 = targetImageBitmap$iv;
        Canvas targetCanvas$iv2 = targetCanvas$iv;
    L39:
        CanvasDrawScope it$iv = BorderCache.access$getCanvasDrawScope$p($this$drawGenericBorder_u24lambda_u244);
        if (it$iv != null) goto L42;
        it$iv = new CanvasDrawScope();
        BorderCache.access$setCanvasDrawScope$p($this$drawGenericBorder_u24lambda_u244, it$iv);
    L42:
        CanvasDrawScope targetDrawScope$iv = it$iv;
        long drawSize$iv = IntSizeKt.m7156toSizeozmzZPI(pathBoundsSize);
        LayoutDirection layoutDirection$iv$iv = $this$drawGenericBorder.getLayoutDirection();
        CanvasDrawScope.DrawParams r1 = targetDrawScope$iv.getDrawParams();
        Density prevDensity$iv$iv = r1.component1();
        LayoutDirection prevLayoutDirection$iv$iv = r1.component2();
        Canvas prevCanvas$iv$iv = r1.component3();
        long prevSize$iv$iv = r1.m4834component4NHjbRc();
        CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u240$iv$iv = targetDrawScope$iv.getDrawParams();
        $this$draw_yzxVdVo_u24lambda_u240$iv$iv.setDensity($this$drawGenericBorder);
        $this$draw_yzxVdVo_u24lambda_u240$iv$iv.setLayoutDirection(layoutDirection$iv$iv);
        $this$draw_yzxVdVo_u24lambda_u240$iv$iv.setCanvas(targetCanvas$iv2);
        $this$draw_yzxVdVo_u24lambda_u240$iv$iv.m4837setSizeuvyYCjk(drawSize$iv);
        targetCanvas$iv2.save();
        CanvasDrawScope $this$drawBorderCache_EMwLDEs_u24lambda_u243$iv = targetDrawScope$iv;
        DrawScope.m4911drawRectnJ9OG0$default($this$drawBorderCache_EMwLDEs_u24lambda_u243$iv, Color.Companion.m4392getBlack0d7_KjU(), 0, drawSize$iv, 0.0f, null, null, BlendMode.Companion.m4281getClear0nO6VwU(), 58, null);
        float left$iv = -pathBounds.getLeft();
        float top$iv = -pathBounds.getTop();
        $this$drawBorderCache_EMwLDEs_u24lambda_u243$iv.getDrawContext().getTransform().translate(left$iv, top$iv);
        Canvas targetCanvas$iv3 = targetCanvas$iv2;
        float left$iv2 = left$iv;
        ?? r42 = targetImageBitmap$iv2;
        DrawScope.m4906drawPathGBMwjPU$default($this$drawBorderCache_EMwLDEs_u24lambda_u243$iv, outline.getPath(), brush, 0.0f, new Stroke(strokeWidth * 2.0f, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);     // Catch: Throwable -> L71
        long arg0$iv = $this$drawBorderCache_EMwLDEs_u24lambda_u243$iv.mo4917getSizeNHjbRc();     // Catch: Throwable -> L71
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);     // Catch: Throwable -> L71
        float r13 = Float.intBitsToFloat(bits$iv$iv$iv) + 1.0f;     // Catch: Throwable -> L71
        long arg0$iv2 = $this$drawBorderCache_EMwLDEs_u24lambda_u243$iv.mo4917getSizeNHjbRc();     // Catch: Throwable -> L71
        float top$iv2 = top$iv;
        int bits$iv$iv$iv2 = (int) (arg0$iv2 >> 32);
        float scaleX$iv = r13 / Float.intBitsToFloat(bits$iv$iv$iv2);     // Catch: Throwable -> L69
        long arg0$iv3 = $this$drawBorderCache_EMwLDEs_u24lambda_u243$iv.mo4917getSizeNHjbRc();     // Catch: Throwable -> L69
        int bits$iv$iv$iv3 = (int) (arg0$iv3 & 4294967295L);     // Catch: Throwable -> L69
        float r14 = Float.intBitsToFloat(bits$iv$iv$iv3) + 1.0f;     // Catch: Throwable -> L69
        long arg0$iv4 = $this$drawBorderCache_EMwLDEs_u24lambda_u243$iv.mo4917getSizeNHjbRc();     // Catch: Throwable -> L69
        int bits$iv$iv$iv4 = (int) (arg0$iv4 & 4294967295L);     // Catch: Throwable -> L69
        float scaleY$iv = r14 / Float.intBitsToFloat(bits$iv$iv$iv4);     // Catch: Throwable -> L69
        long pivot$iv = $this$drawBorderCache_EMwLDEs_u24lambda_u243$iv.mo4916getCenterF1C5BW0();     // Catch: Throwable -> L69
        DrawContext $this$withTransform_u24lambda_u246$iv$iv = $this$drawBorderCache_EMwLDEs_u24lambda_u243$iv.getDrawContext();     // Catch: Throwable -> L69
        long previousSize$iv$iv = $this$withTransform_u24lambda_u246$iv$iv.mo4838getSizeNHjbRc();     // Catch: Throwable -> L69
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().save();     // Catch: Throwable -> L69
        DrawTransform $this$scale_Fgt4K4Q_u24lambda_u242$iv = $this$withTransform_u24lambda_u246$iv$iv.getTransform();     // Catch: Throwable -> L63
        $this$scale_Fgt4K4Q_u24lambda_u242$iv.mo4845scale0AR0LA0(scaleX$iv, scaleY$iv, pivot$iv);     // Catch: Throwable -> L63
        long previousSize$iv$iv2 = previousSize$iv$iv;
        DrawScope.m4906drawPathGBMwjPU$default($this$drawBorderCache_EMwLDEs_u24lambda_u243$iv, $this$drawGenericBorder_u24lambda_u240, brush, 0.0f, null, null, BlendMode.Companion.m4281getClear0nO6VwU(), 28, null);     // Catch: Throwable -> L59
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();     // Catch: Throwable -> L57
        $this$withTransform_u24lambda_u246$iv$iv.mo4839setSizeuvyYCjk(previousSize$iv$iv2);     // Catch: Throwable -> L57
        $this$drawBorderCache_EMwLDEs_u24lambda_u243$iv.getDrawContext().getTransform().translate(-left$iv2, -top$iv2);
        targetCanvas$iv3.restore();
        CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u241$iv$iv = targetDrawScope$iv.getDrawParams();
        $this$draw_yzxVdVo_u24lambda_u241$iv$iv.setDensity(prevDensity$iv$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv$iv.setLayoutDirection(prevLayoutDirection$iv$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv$iv.setCanvas(prevCanvas$iv$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv$iv.m4837setSizeuvyYCjk(prevSize$iv$iv);
        r42.prepareToDraw();
        cacheImageBitmap.element = r42;
        final ColorFilter colorFilter3 = colorFilter2;
        return $this$drawGenericBorder.onDrawWithContent(new AnonymousClass3(pathBounds, cacheImageBitmap, pathBoundsSize, colorFilter3));
    L57:
        th = th;
        top$iv2 = top$iv2;
    L75:
        $this$drawBorderCache_EMwLDEs_u24lambda_u243$iv.getDrawContext().getTransform().translate(-left$iv2, -top$iv2);
        throw th;
    L59:
        th = th;
        DrawContext $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
    L77:
        $this$withTransform_u24lambda_u246$iv$iv2.getCanvas().restore();     // Catch: Throwable -> L67
        $this$withTransform_u24lambda_u246$iv$iv2.mo4839setSizeuvyYCjk(previousSize$iv$iv2);     // Catch: Throwable -> L67
        throw th;     // Catch: Throwable -> L67
    L67:
        th = th;
    L61:
        th = th;
        $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
        previousSize$iv$iv2 = previousSize$iv$iv;
    L63:
        th = th;
        $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
        previousSize$iv$iv2 = previousSize$iv$iv;
    L69:
        th = th;
        top$iv2 = top$iv2;
    L71:
        th = th;
        top$iv2 = top$iv;
    L73:
        th = th;
        top$iv2 = top$iv;
        left$iv2 = left$iv;
    L38:
        ImageBitmap targetImageBitmap$iv3 = ImageBitmapKt.m4591ImageBitmapx__hDU$default((int) (pathBoundsSize >> 32), (int) (pathBoundsSize & 4294967295L), config2, false, null, 24, null);
        BorderCache.access$setImageBitmap$p($this$drawGenericBorder_u24lambda_u244, targetImageBitmap$iv3);
        Canvas it$iv2 = androidx.compose.ui.graphics.CanvasKt.Canvas(targetImageBitmap$iv3);
        BorderCache.access$setCanvas$p($this$drawGenericBorder_u24lambda_u244, it$iv2);
        targetImageBitmap$iv2 = targetImageBitmap$iv3;
        targetCanvas$iv2 = it$iv2;
    L25:
        r11 = true;
        goto L26
    L19:
        r12 = ImageBitmapConfig.m4581equalsimpl0(r9.m4584unboximpl(), r10);
        goto L20
    L15:
        r9 = null;
        goto L16
    L8:
        int config3 = ImageBitmapConfig.Companion.m4586getArgb8888_sVssgQ();
        config2 = config3;
        colorFilter2 = null;
        goto L9
    }

    /* JADX INFO: renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    private final DrawResult m251drawRoundRectBorderJqoCqck(CacheDrawScope $this$drawRoundRectBorder_u2dJqoCqck, final Brush brush, Outline.Rounded outline, final long topLeft, final long borderSize, final boolean fillArea, final float strokeWidth) {
        if (RoundRectKt.isSimple(outline.getRoundRect()) == false) goto L6;
        final long cornerRadius = outline.getRoundRect().m4175getTopLeftCornerRadiuskKHJgLs();
        final float halfStroke = strokeWidth / 2.0f;
        final Stroke borderStroke = new Stroke(strokeWidth, 0.0f, 0, 0, null, 30, null);
        return $this$drawRoundRectBorder_u2dJqoCqck.onDrawWithContent(new BorderModifierNode$drawRoundRectBorder$1(fillArea, brush, cornerRadius, halfStroke, strokeWidth, topLeft, borderSize, borderStroke));
    L6:
        if (this.borderCache != null) goto L8;
        ImageBitmap r10 = null;
        Canvas r11 = null;
        CanvasDrawScope r12 = null;
        Path r13 = null;
        this.borderCache = new BorderCache(r10, r11, r12, r13, 15, null);
    L8:
        BorderCache r2 = this.borderCache;
        Intrinsics.checkNotNull(r2);
        Path path = r2.obtainPath();
        final Path roundedRectPath = BorderKt.access$createRoundRectPath(path, outline.getRoundRect(), strokeWidth, fillArea);
        return $this$drawRoundRectBorder_u2dJqoCqck.onDrawWithContent(new BorderModifierNode$drawRoundRectBorder$2(roundedRectPath, brush));
    }
}
