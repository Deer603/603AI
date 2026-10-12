package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

/* JADX INFO: compiled from: BitmapPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"BitmapPainter", "Landroidx/compose/ui/graphics/painter/BitmapPainter;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "BitmapPainter-QZhYCtY", "(Landroidx/compose/ui/graphics/ImageBitmap;JJI)Landroidx/compose/ui/graphics/painter/BitmapPainter;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BitmapPainterKt {
    /* JADX INFO: renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ BitmapPainter m5040BitmapPainterQZhYCtY$default(ImageBitmap r10, long r11, long r13, int r15, int r16, Object r17) {
        if ((r16 & 2) == 0) goto L5;
        long r1 = IntOffset.Companion.m7112getZeronOccac();
    L7:
        if ((r16 & 4) == 0) goto L9;
        int width$iv = r10.getWidth();
        int height$iv = r10.getHeight();
        long r3 = IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
    L11:
        if ((r16 & 8) == 0) goto L13;
        int r5 = FilterQuality.Companion.m4465getLowfv9h1I();
    L15:
        return m5039BitmapPainterQZhYCtY(r10, r1, r3, r5);
    L13:
        r5 = r15;
        goto L15
    L9:
        r3 = r13;
        goto L11
    L5:
        r1 = r11;
        goto L7
    }

    /* JADX INFO: renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final BitmapPainter m5039BitmapPainterQZhYCtY(ImageBitmap image, long srcOffset, long srcSize, int filterQuality) {
        BitmapPainter $this$BitmapPainter_QZhYCtY_u24lambda_u240 = new BitmapPainter(image, srcOffset, srcSize, null);
        $this$BitmapPainter_QZhYCtY_u24lambda_u240.m5038setFilterQualityvDHp3xo$ui_graphics_release(filterQuality);
        return $this$BitmapPainter_QZhYCtY_u24lambda_u240;
    }
}
