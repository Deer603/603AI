package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextAndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/android/CanvasCompatS;", "", "()V", "drawGlyphs", "", "canvas", "Landroid/graphics/Canvas;", "glyphIds", "", "glyphIdOffset", "", "positions", "", "positionOffset", "glyphCount", "font", "Landroid/graphics/fonts/Font;", "paint", "Landroid/graphics/Paint;", "drawPatch", "patch", "Landroid/graphics/NinePatch;", "dst", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CanvasCompatS {
    public static final CanvasCompatS INSTANCE = null;

    static {
        INSTANCE = new CanvasCompatS();
    }

    private CanvasCompatS() {
    }

    public final void drawPatch(Canvas canvas, NinePatch patch, Rect dst, Paint paint) {
        canvas.drawPatch(patch, dst, paint);
    }

    public final void drawPatch(Canvas canvas, NinePatch patch, RectF dst, Paint paint) {
        canvas.drawPatch(patch, dst, paint);
    }

    public final void drawGlyphs(Canvas canvas, int[] glyphIds, int glyphIdOffset, float[] positions, int positionOffset, int glyphCount, Font font, Paint paint) {
        canvas.drawGlyphs(glyphIds, glyphIdOffset, positions, positionOffset, glyphCount, font, paint);
    }
}
