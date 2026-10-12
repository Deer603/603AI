package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: BulletSpan.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0002\u0010\u0010Jp\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0016R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/compose/ui/text/platform/style/CustomBulletSpan;", "Landroid/text/style/LeadingMarginSpan;", "shape", "Landroidx/compose/ui/graphics/Shape;", "bulletWidthPx", "", "bulletHeightPx", "gapWidthPx", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "density", "Landroidx/compose/ui/unit/Density;", "textIndentPx", "(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/unit/Density;F)V", "diff", "", "minimumRequiredIndent", "drawLeadingMargin", "", "c", "Landroid/graphics/Canvas;", "p", "Landroid/graphics/Paint;", "x", "dir", "top", "baseline", "bottom", "text", "", "start", "end", "first", "", "layout", "Landroid/text/Layout;", "getLeadingMargin", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CustomBulletSpan implements LeadingMarginSpan {
    public static final int $stable = 0;
    private final float alpha;
    private final Brush brush;
    private final float bulletHeightPx;
    private final float bulletWidthPx;
    private final Density density;
    private final int diff;
    private final DrawStyle drawStyle;
    private final int minimumRequiredIndent;
    private final Shape shape;

    static {
        $stable = 8;
    }

    public CustomBulletSpan(Shape shape, float bulletWidthPx, float bulletHeightPx, float gapWidthPx, Brush brush, float alpha, DrawStyle drawStyle, Density density, float textIndentPx) {
        this.shape = shape;
        this.bulletWidthPx = bulletWidthPx;
        this.bulletHeightPx = bulletHeightPx;
        this.brush = brush;
        this.alpha = alpha;
        this.drawStyle = drawStyle;
        this.density = density;
        this.minimumRequiredIndent = MathKt.roundToInt(this.bulletWidthPx + gapWidthPx);
        this.diff = MathKt.roundToInt(textIndentPx) - this.minimumRequiredIndent;
    }

    public static final /* synthetic */ Density access$getDensity$p(CustomBulletSpan $this) {
        return $this.density;
    }

    public static final /* synthetic */ Shape access$getShape$p(CustomBulletSpan $this) {
        return $this.shape;
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        if (this.diff < 0) goto L6;
        return 0;
    L6:
        return Math.abs(this.diff);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(final Canvas c, final Paint p, int x, final int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
        if (c != null) goto L5;
        return;
    L5:
        final float yCenter = (top + bottom) / 2.0f;
        final int xStart = RangesKt.coerceAtLeast(x - this.minimumRequiredIndent, 0);
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) text).getSpanStart(this) != start) goto L10;
        if (p == null) goto L11;
        Paint.Style currentStyle = p.getStyle();
        BulletSpan_androidKt.access$setDrawStyle(p, this.drawStyle);
        float width$iv = this.bulletWidthPx;
        float height$iv = this.bulletHeightPx;
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        final long bulletSize = Size.m4185constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        BulletSpan_androidKt.m6701access$setBrushAndDrawyzxVdVo(p, this.brush, this.alpha, bulletSize, new CustomBulletSpan$drawLeadingMargin$1$1(this, bulletSize, dir, c, p, xStart, yCenter));
        p.setStyle(currentStyle);
        return;
    L11:
        return;
    }
}
