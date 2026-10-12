package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÂ\u0003J9\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\tJ\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J@\u0010\u0018\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b\"H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/BorderCache;", "", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "borderPath", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;Landroidx/compose/ui/graphics/Path;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "obtainPath", "toString", "", "drawBorderCache", "Landroidx/compose/ui/draw/CacheDrawScope;", "borderSize", "Landroidx/compose/ui/unit/IntSize;", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawBorderCache-EMwLDEs", "(Landroidx/compose/ui/draw/CacheDrawScope;JILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/ImageBitmap;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BorderCache {
    private Path borderPath;
    private Canvas canvas;
    private CanvasDrawScope canvasDrawScope;
    private ImageBitmap imageBitmap;

    public BorderCache() {
        ImageBitmap r1 = null;
        Canvas r2 = null;
        CanvasDrawScope r3 = null;
        Path r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    private final ImageBitmap component1() {
        return this.imageBitmap;
    }

    private final Canvas component2() {
        return this.canvas;
    }

    private final CanvasDrawScope component3() {
        return this.canvasDrawScope;
    }

    private final Path component4() {
        return this.borderPath;
    }

    public static /* synthetic */ BorderCache copy$default(BorderCache r0, ImageBitmap r1, Canvas r2, CanvasDrawScope r3, Path r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.imageBitmap;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.canvas;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.canvasDrawScope;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.borderPath;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final BorderCache copy(ImageBitmap r2, Canvas r3, CanvasDrawScope r4, Path r5) {
        return new BorderCache(r2, r3, r4, r5);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof BorderCache) == true) goto L8;
        return false;
    L8:
        BorderCache r1 = (BorderCache) r6;
        if (Intrinsics.areEqual(this.imageBitmap, r1.imageBitmap) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.canvas, r1.canvas) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.canvasDrawScope, r1.canvasDrawScope) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.borderPath, r1.borderPath) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r1 = 0;
        if (this.imageBitmap != null) goto L5;
        int r0 = 0;
    L6:
        int r2 = r0 * 31;
        if (this.canvas != null) goto L9;
        int r3 = 0;
    L10:
        int r4 = (r2 + r3) * 31;
        if (this.canvasDrawScope != null) goto L13;
        int r5 = 0;
    L14:
        int r6 = (r4 + r5) * 31;
        if (this.borderPath == null) goto L19;
        r1 = this.borderPath.hashCode();
    L19:
        return r6 + r1;
    L13:
        r5 = this.canvasDrawScope.hashCode();
        goto L14
    L9:
        r3 = this.canvas.hashCode();
        goto L10
    L5:
        r0 = this.imageBitmap.hashCode();
        goto L6
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path borderPath) {
        this.imageBitmap = imageBitmap;
        this.canvas = canvas;
        this.canvasDrawScope = canvasDrawScope;
        this.borderPath = borderPath;
    }

    public /* synthetic */ BorderCache(ImageBitmap r2, Canvas r3, CanvasDrawScope r4, Path r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }

    public static final /* synthetic */ Canvas access$getCanvas$p(BorderCache $this) {
        return $this.canvas;
    }

    public static final /* synthetic */ CanvasDrawScope access$getCanvasDrawScope$p(BorderCache $this) {
        return $this.canvasDrawScope;
    }

    public static final /* synthetic */ ImageBitmap access$getImageBitmap$p(BorderCache $this) {
        return $this.imageBitmap;
    }

    public static final /* synthetic */ void access$setCanvas$p(BorderCache $this, Canvas r1) {
        $this.canvas = r1;
    }

    public static final /* synthetic */ void access$setCanvasDrawScope$p(BorderCache $this, CanvasDrawScope r1) {
        $this.canvasDrawScope = r1;
    }

    public static final /* synthetic */ void access$setImageBitmap$p(BorderCache $this, ImageBitmap r1) {
        $this.imageBitmap = r1;
    }

    /* JADX INFO: renamed from: drawBorderCache-EMwLDEs, reason: not valid java name */
    public final ImageBitmap m242drawBorderCacheEMwLDEs(CacheDrawScope $this$drawBorderCache_u2dEMwLDEs, long borderSize, int config, Function1<? super DrawScope, Unit> r35) {
        ImageBitmap targetImageBitmap = access$getImageBitmap$p(this);
        Canvas targetCanvas = access$getCanvas$p(this);
        ImageBitmapConfig r4 = null;
        if (targetImageBitmap == null) goto L5;
        ImageBitmapConfig r5 = ImageBitmapConfig.m4578boximpl(targetImageBitmap.mo4233getConfig_sVssgQ());
    L6:
        int r6 = ImageBitmapConfig.Companion.m4586getArgb8888_sVssgQ();
        boolean compatibleConfig = false;
        if (r5 != null) goto L9;
        boolean r7 = false;
    L10:
        if (r7 == true) goto L16;
        if (targetImageBitmap == null) goto L13;
        r4 = ImageBitmapConfig.m4578boximpl(targetImageBitmap.mo4233getConfig_sVssgQ());
    L13:
        int r10 = config;
        if (ImageBitmapConfig.m4580equalsimpl(r10, r4) == false) goto L19;
    L17:
        compatibleConfig = true;
    L19:
        if (targetImageBitmap == null) goto L28;
        if (targetCanvas == null) goto L27;
        long arg0$iv = $this$drawBorderCache_u2dEMwLDEs.m3986getSizeNHjbRc();
        long r15 = 4294967295L;
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv) > targetImageBitmap.getWidth()) goto L29;
        long arg0$iv2 = $this$drawBorderCache_u2dEMwLDEs.m3986getSizeNHjbRc();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv2) > targetImageBitmap.getHeight()) goto L29;
        if (compatibleConfig == false) goto L29;
    L30:
        CanvasDrawScope it = access$getCanvasDrawScope$p(this);
        if (it != null) goto L33;
        it = new CanvasDrawScope();
        access$setCanvasDrawScope$p(this, it);
    L33:
        long drawSize = IntSizeKt.m7156toSizeozmzZPI(borderSize);
        LayoutDirection layoutDirection$iv = $this$drawBorderCache_u2dEMwLDEs.getLayoutDirection();
        CanvasDrawScope this_$iv = it;
        CanvasDrawScope.DrawParams r8 = this_$iv.getDrawParams();
        Density prevDensity$iv = r8.component1();
        LayoutDirection prevLayoutDirection$iv = r8.component2();
        Canvas prevCanvas$iv = r8.component3();
        long prevSize$iv = r8.m4834component4NHjbRc();
        CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u240$iv = this_$iv.getDrawParams();
        $this$draw_yzxVdVo_u24lambda_u240$iv.setDensity($this$drawBorderCache_u2dEMwLDEs);
        $this$draw_yzxVdVo_u24lambda_u240$iv.setLayoutDirection(layoutDirection$iv);
        $this$draw_yzxVdVo_u24lambda_u240$iv.setCanvas(targetCanvas);
        $this$draw_yzxVdVo_u24lambda_u240$iv.m4837setSizeuvyYCjk(drawSize);
        targetCanvas.save();
        CanvasDrawScope $this$drawBorderCache_EMwLDEs_u24lambda_u243 = this_$iv;
        ImageBitmap targetImageBitmap2 = targetImageBitmap;
        Canvas prevCanvas$iv2 = targetCanvas;
        DrawScope.m4911drawRectnJ9OG0$default($this$drawBorderCache_EMwLDEs_u24lambda_u243, Color.Companion.m4392getBlack0d7_KjU(), 0, drawSize, 0.0f, null, null, BlendMode.Companion.m4281getClear0nO6VwU(), 58, null);
        r35.invoke($this$drawBorderCache_EMwLDEs_u24lambda_u243);
        prevCanvas$iv2.restore();
        CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u241$iv = this_$iv.getDrawParams();
        $this$draw_yzxVdVo_u24lambda_u241$iv.setDensity(prevDensity$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv.setLayoutDirection(prevLayoutDirection$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv.setCanvas(prevCanvas$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv.m4837setSizeuvyYCjk(prevSize$iv);
        targetImageBitmap2.prepareToDraw();
        return targetImageBitmap2;
    L29:
        int $i$f$unpackInt2 = (int) (borderSize & r15);
        ImageBitmap it2 = ImageBitmapKt.m4591ImageBitmapx__hDU$default((int) (borderSize >> 32), $i$f$unpackInt2, r10, false, null, 24, null);
        access$setImageBitmap$p(this, it2);
        targetImageBitmap = it2;
        Canvas it3 = androidx.compose.ui.graphics.CanvasKt.Canvas(targetImageBitmap);
        access$setCanvas$p(this, it3);
        targetCanvas = it3;
        goto L30
    L27:
        r15 = 4294967295L;
        goto L29
    L28:
        r15 = 4294967295L;
        goto L29
    L16:
        r10 = config;
        goto L17
    L9:
        r7 = ImageBitmapConfig.m4581equalsimpl0(r5.m4584unboximpl(), r6);
        goto L10
    L5:
        r5 = null;
        goto L6
    }

    public final Path obtainPath() {
        Path r0 = this.borderPath;
        if (r0 != null) goto L6;
        Path it = AndroidPath_androidKt.Path();
        this.borderPath = it;
        return it;
    L6:
        return r0;
    }
}
