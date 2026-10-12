package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextPainter.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextPainter {
    public static final int $stable = 0;
    public static final TextPainter INSTANCE = null;

    static {
        INSTANCE = new TextPainter();
    }

    private TextPainter() {
    }

    public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
        if (textLayoutResult.getHasVisualOverflow() == true) goto L5;
    L7:
        boolean r0 = false;
    L8:
        boolean needClipping = r0;
        if (needClipping == false) goto L11;
        long arg0$iv = textLayoutResult.m6388getSizeYbymL2g();
        float width = (int) (arg0$iv >> 32);
        long arg0$iv2 = textLayoutResult.m6388getSizeYbymL2g();
        float height = (int) (arg0$iv2 & 4294967295L);
        long r4 = Offset.Companion.m4141getZeroF1C5BW0();
        long v1$iv$iv = Float.floatToRawIntBits(width);
        long v2$iv$iv = Float.floatToRawIntBits(height);
        Rect bounds = RectKt.m4165Recttz77jQw(r4, Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv)));
        canvas.save();
        Canvas r8 = canvas;
        Canvas.m4339clipRectmtrdDE$default(r8, bounds, 0, 2, null);
    L12:
        SpanStyle style = textLayoutResult.getLayoutInput().getStyle().getSpanStyle$ui_text_release();
        TextDecoration r1 = style.getTextDecoration();
        if (r1 != null) goto L15;
        r1 = TextDecoration.Companion.getNone();
    L15:
        TextDecoration textDecoration = r1;
        Shadow r2 = style.getShadow();
        if (r2 != null) goto L18;
        r2 = Shadow.Companion.getNone();
    L18:
        Shadow shadow = r2;
        Fill r3 = style.getDrawStyle();
        if (r3 != null) goto L21;
        r3 = Fill.INSTANCE;
    L21:
        DrawStyle drawStyle = r3;
        Brush brush = style.getBrush();     // Catch: Throwable -> L38
        if (brush == null) goto L30;
        if (style.getTextForegroundStyle$ui_text_release() == TextForegroundStyle.Unspecified.INSTANCE) goto L27;
        float alpha = style.getTextForegroundStyle$ui_text_release().getAlpha();     // Catch: Throwable -> L38
    L28:
        MultiParagraph.m6266painthn5TExg$default(textLayoutResult.getMultiParagraph(), r8, brush, alpha, shadow, textDecoration, drawStyle, 0, 64, null);     // Catch: Throwable -> L38
    L34:
        if (needClipping == false) goto L43;
        canvas.restore();
        return;
    L43:
        return;
    L27:
        alpha = 1.0f;
        goto L28
    L30:
        if (style.getTextForegroundStyle$ui_text_release() == TextForegroundStyle.Unspecified.INSTANCE) goto L32;
        long color = style.getTextForegroundStyle$ui_text_release().mo6721getColor0d7_KjU();     // Catch: Throwable -> L38
    L33:
        MultiParagraph.m6264paintLG529CI$default(textLayoutResult.getMultiParagraph(), canvas, color, shadow, textDecoration, drawStyle, 0, 32, null);     // Catch: Throwable -> L38
        goto L34
    L32:
        color = Color.Companion.m4392getBlack0d7_KjU();     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        if (needClipping == false) goto L41;
        canvas.restore();
    L41:
        throw th;
    L11:
        r8 = canvas;
        goto L12
    L5:
        if (TextOverflow.m6877equalsimpl0(textLayoutResult.getLayoutInput().m6384getOverflowgIe3tQ8(), TextOverflow.Companion.m6890getVisiblegIe3tQ8()) == true) goto L7;
        r0 = true;
        goto L8
    }
}
