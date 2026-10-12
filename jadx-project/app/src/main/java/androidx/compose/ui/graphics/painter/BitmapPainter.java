package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BitmapPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0013\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\"\u0010$\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\f\u0010'\u001a\u00020(*\u00020)H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u00020\u000eX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/graphics/ImageBitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I$ui_graphics_release", "()I", "setFilterQuality-vDHp3xo$ui_graphics_release", "(I)V", "I", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "size", "J", "applyAlpha", "", "applyColorFilter", "equals", "other", "", "hashCode", "", "toString", "", "validateSize", "validateSize-N5eqBDc", "(JJ)J", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BitmapPainter extends Painter {
    private float alpha;
    private ColorFilter colorFilter;
    private int filterQuality;
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap r1, long r2, long r4, DefaultConstructorMarker r6) {
        this(r1, r2, r4);
    }

    public /* synthetic */ BitmapPainter(ImageBitmap r8, long r9, long r11, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 2) == 0) goto L5;
        long r2 = IntOffset.Companion.m7112getZeronOccac();
    L7:
        if ((r13 & 4) == 0) goto L9;
        int width$iv = r8.getWidth();
        int height$iv = r8.getHeight();
        long r4 = IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
    L10:
        this(r8, r2, r4, null);
        return;
    L9:
        r4 = r11;
        goto L10
    L5:
        r2 = r9;
        goto L7
    }

    private BitmapPainter(ImageBitmap image, long srcOffset, long srcSize) {
        this.image = image;
        this.srcOffset = srcOffset;
        this.srcSize = srcSize;
        this.filterQuality = FilterQuality.Companion.m4465getLowfv9h1I();
        this.size = m5035validateSizeN5eqBDc(this.srcOffset, this.srcSize);
        this.alpha = 1.0f;
    }

    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name */
    public final int m5036getFilterQualityfv9h1I$ui_graphics_release() {
        return this.filterQuality;
    }

    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m5038setFilterQualityvDHp3xo$ui_graphics_release(int r1) {
        this.filterQuality = r1;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope $this$onDraw) {
        ImageBitmap r2 = this.image;
        long r3 = this.srcOffset;
        long r5 = this.srcSize;
        long arg0$iv = $this$onDraw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float $this$fastRoundToInt$iv = Float.intBitsToFloat(bits$iv$iv$iv);
        int $i$f$fastRoundToInt = Math.round($this$fastRoundToInt$iv);
        long arg0$iv2 = $this$onDraw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 & 4294967295L);
        float $this$fastRoundToInt$iv2 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int $i$f$fastRoundToInt2 = Math.round($this$fastRoundToInt$iv2);
        DrawScope.m4900drawImageAZ2fEMs$default($this$onDraw, r2, r3, r5, 0, IntSize.m7139constructorimpl((((long) $i$f$fastRoundToInt) << 32) | (((long) $i$f$fastRoundToInt2) & 4294967295L)), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo5037getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m7156toSizeozmzZPI(this.size);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    /* JADX INFO: renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m5035validateSizeN5eqBDc(long srcOffset, long srcSize) {
        if (IntOffset.m7101getXimpl(srcOffset) >= 0) goto L5;
    L15:
        boolean r0 = false;
    L16:
        if (r0 == false) goto L19;
        return srcSize;
    L19:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L5:
        if (IntOffset.m7102getYimpl(srcOffset) < 0) goto L15;
        if (((int) (srcSize >> 32)) < 0) goto L15;
        if (((int) (srcSize & 4294967295L)) < 0) goto L15;
        if (((int) (srcSize >> 32)) > this.image.getWidth()) goto L15;
        if (((int) (srcSize & 4294967295L)) > this.image.getHeight()) goto L15;
        r0 = true;
        goto L16
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof BitmapPainter) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.image, ((BitmapPainter) other).image) == true) goto L12;
        return false;
    L12:
        if (IntOffset.m7100equalsimpl0(this.srcOffset, ((BitmapPainter) other).srcOffset) == true) goto L15;
        return false;
    L15:
        if (IntSize.m7142equalsimpl0(this.srcSize, ((BitmapPainter) other).srcSize) == true) goto L18;
        return false;
    L18:
        if (FilterQuality.m4460equalsimpl0(this.filterQuality, ((BitmapPainter) other).filterQuality) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int result = this.image.hashCode();
        int result2 = (result * 31) + IntOffset.m7103hashCodeimpl(this.srcOffset);
        return (((result2 * 31) + IntSize.m7145hashCodeimpl(this.srcSize)) * 31) + FilterQuality.m4461hashCodeimpl(this.filterQuality);
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + IntOffset.m7108toStringimpl(this.srcOffset) + ", srcSize=" + IntSize.m7147toStringimpl(this.srcSize) + ", filterQuality=" + FilterQuality.m4462toStringimpl(this.filterQuality) + ')';
    }
}
