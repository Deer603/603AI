package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: DrawCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JI\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u001c¢\u0006\u0002\b\u001eø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&J\f\u0010'\u001a\u00020\u0019*\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u00020\u0016X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/vector/DrawCache;", "", "()V", "cacheScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "cachedCanvas", "Landroidx/compose/ui/graphics/Canvas;", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "I", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "mCachedImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "getMCachedImage$annotations", "getMCachedImage", "()Landroidx/compose/ui/graphics/ImageBitmap;", "setMCachedImage", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "scopeDensity", "Landroidx/compose/ui/unit/Density;", "size", "Landroidx/compose/ui/unit/IntSize;", "J", "drawCachedImage", "", "density", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "drawCachedImage-FqjB98A", "(IJLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)V", "drawInto", "target", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "clear", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DrawCache {
    public static final int $stable = 0;
    private final CanvasDrawScope cacheScope;
    private Canvas cachedCanvas;
    private int config;
    private LayoutDirection layoutDirection;
    private ImageBitmap mCachedImage;
    private Density scopeDensity;
    private long size;

    static {
        $stable = 8;
    }

    public static /* synthetic */ void getMCachedImage$annotations() {
    }

    public DrawCache() {
        this.layoutDirection = LayoutDirection.Ltr;
        this.size = IntSize.Companion.m7149getZeroYbymL2g();
        this.config = ImageBitmapConfig.Companion.m4586getArgb8888_sVssgQ();
        this.cacheScope = new CanvasDrawScope();
    }

    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(ImageBitmap r1) {
        this.mCachedImage = r1;
    }

    /* JADX INFO: renamed from: drawCachedImage-FqjB98A, reason: not valid java name */
    public final void m5044drawCachedImageFqjB98A(int config, long size, Density density, LayoutDirection layoutDirection, Function1<? super DrawScope, Unit> r23) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        ImageBitmap targetImage = this.mCachedImage;
        Canvas targetCanvas = this.cachedCanvas;
        if (targetImage == null) goto L11;
        if (targetCanvas == null) goto L11;
        if (((int) (size >> 32)) > targetImage.getWidth()) goto L11;
        if (((int) (size & 4294967295L)) > targetImage.getHeight()) goto L11;
        if (ImageBitmapConfig.m4581equalsimpl0(this.config, config) == false) goto L11;
    L12:
        this.size = size;
        CanvasDrawScope this_$iv = this.cacheScope;
        long size$iv = IntSizeKt.m7156toSizeozmzZPI(size);
        CanvasDrawScope.DrawParams r12 = this_$iv.getDrawParams();
        Density prevDensity$iv = r12.component1();
        LayoutDirection prevLayoutDirection$iv = r12.component2();
        Canvas prevCanvas$iv = r12.component3();
        long prevSize$iv = r12.m4834component4NHjbRc();
        CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u240$iv = this_$iv.getDrawParams();
        $this$draw_yzxVdVo_u24lambda_u240$iv.setDensity(density);
        $this$draw_yzxVdVo_u24lambda_u240$iv.setLayoutDirection(layoutDirection);
        $this$draw_yzxVdVo_u24lambda_u240$iv.setCanvas(targetCanvas);
        $this$draw_yzxVdVo_u24lambda_u240$iv.m4837setSizeuvyYCjk(size$iv);
        targetCanvas.save();
        CanvasDrawScope $this$drawCachedImage_FqjB98A_u24lambda_u240 = this_$iv;
        clear($this$drawCachedImage_FqjB98A_u24lambda_u240);
        r23.invoke($this$drawCachedImage_FqjB98A_u24lambda_u240);
        targetCanvas.restore();
        CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u241$iv = this_$iv.getDrawParams();
        $this$draw_yzxVdVo_u24lambda_u241$iv.setDensity(prevDensity$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv.setLayoutDirection(prevLayoutDirection$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv.setCanvas(prevCanvas$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv.m4837setSizeuvyYCjk(prevSize$iv);
        targetImage.prepareToDraw();
        return;
    L11:
        targetImage = ImageBitmapKt.m4591ImageBitmapx__hDU$default((int) (size >> 32), (int) (4294967295L & size), config, false, null, 24, null);
        targetCanvas = CanvasKt.Canvas(targetImage);
        this.mCachedImage = targetImage;
        this.cachedCanvas = targetCanvas;
        this.config = config;
        goto L12
    }

    public static /* synthetic */ void drawInto$default(DrawCache r0, DrawScope r1, float r2, ColorFilter r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 1.0f;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = null;
    L8:
        r0.drawInto(r1, r2, r3);
    }

    public final void drawInto(DrawScope target, float alpha, ColorFilter colorFilter) {
        ImageBitmap targetImage = this.mCachedImage;
        if (targetImage == null) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
    L9:
        DrawScope.m4900drawImageAZ2fEMs$default(target, targetImage, 0, this.size, 0, 0, alpha, null, colorFilter, 0, 0, 858, null);
        return;
    L5:
        value$iv = false;
        goto L7
    }

    private final void clear(DrawScope $this$clear) {
        DrawScope.m4911drawRectnJ9OG0$default($this$clear, Color.Companion.m4392getBlack0d7_KjU(), 0, 0, 0.0f, null, null, BlendMode.Companion.m4281getClear0nO6VwU(), 62, null);
    }
}
