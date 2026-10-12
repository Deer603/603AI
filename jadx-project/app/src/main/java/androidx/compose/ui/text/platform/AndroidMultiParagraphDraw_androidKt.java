package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidMultiParagraphDraw.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a^\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aT\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"drawMultiParagraph", "", "Landroidx/compose/ui/text/MultiParagraph;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawMultiParagraph-7AXcY_I", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "drawParagraphs", "drawParagraphs-7AXcY_I", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidMultiParagraphDraw_androidKt {
    /* JADX INFO: renamed from: drawMultiParagraph-7AXcY_I$default, reason: not valid java name */
    public static /* synthetic */ void m6671drawMultiParagraph7AXcY_I$default(MultiParagraph r8, Canvas r9, Brush r10, float r11, Shadow r12, TextDecoration r13, DrawStyle r14, int r15, int r16, Object r17) {
        if ((r16 & 4) == 0) goto L5;
        float r3 = Float.NaN;
    L7:
        if ((r16 & 8) == 0) goto L9;
        Shadow r4 = null;
    L11:
        if ((r16 & 16) == 0) goto L13;
        TextDecoration r5 = null;
    L15:
        if ((r16 & 32) == 0) goto L17;
        DrawStyle r6 = null;
    L19:
        if ((r16 & 64) == 0) goto L21;
        int r7 = BlendMode.Companion.m4308getSrcOver0nO6VwU();
    L22:
        m6670drawMultiParagraph7AXcY_I(r8, r9, r10, r3, r4, r5, r6, r7);
        return;
    L21:
        r7 = r15;
        goto L22
    L17:
        r6 = r14;
        goto L19
    L13:
        r5 = r13;
        goto L15
    L9:
        r4 = r12;
        goto L11
    L5:
        r3 = r11;
        goto L7
    }

    /* JADX INFO: renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m6670drawMultiParagraph7AXcY_I(MultiParagraph $this$drawMultiParagraph_u2d7AXcY_I, Canvas canvas, Brush brush, float alpha, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        canvas.save();
        if ($this$drawMultiParagraph_u2d7AXcY_I.getParagraphInfoList$ui_text_release().size() > 1) goto L6;
        m6672drawParagraphs7AXcY_I($this$drawMultiParagraph_u2d7AXcY_I, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    L18:
        canvas.restore();
        return;
    L6:
        if ((brush instanceof SolidColor) == false) goto L9;
        m6672drawParagraphs7AXcY_I($this$drawMultiParagraph_u2d7AXcY_I, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
        goto L18
    L9:
        if ((brush instanceof ShaderBrush) == false) goto L18;
        float height = 0.0f;
        float width = 0.0f;
        List<ParagraphInfo> r3 = $this$drawMultiParagraph_u2d7AXcY_I.getParagraphInfoList$ui_text_release();
        int index$iv = 0;
        int r6 = r3.size();
    L11:
        if (index$iv >= r6) goto L13;
        Object item$iv = r3.get(index$iv);
        ParagraphInfo it = (ParagraphInfo) item$iv;
        height = height + it.getParagraph().getHeight();
        width = Math.max(width, it.getParagraph().getWidth());
        index$iv = index$iv + 1;
        goto L11
    L13:
        float height$iv = height;
        float width$iv = width;
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        Shader shader = ((ShaderBrush) brush).mo4335createShaderuvyYCjk(Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv)));
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        List<ParagraphInfo> r5 = $this$drawMultiParagraph_u2d7AXcY_I.getParagraphInfoList$ui_text_release();
        int index$iv2 = 0;
        int r8 = r5.size();
    L14:
        if (index$iv2 >= r8) goto L18;
        Object item$iv2 = r5.get(index$iv2);
        ParagraphInfo it2 = (ParagraphInfo) item$iv2;
        it2.getParagraph().mo6233painthn5TExg(canvas, BrushKt.ShaderBrush(shader), alpha, shadow, decoration, drawStyle, blendMode);
        canvas.translate(0.0f, it2.getParagraph().getHeight());
        matrix.setTranslate(0.0f, -it2.getParagraph().getHeight());
        shader.setLocalMatrix(matrix);
        index$iv2 = index$iv2 + 1;
        goto L14
    }

    /* JADX INFO: renamed from: drawParagraphs-7AXcY_I, reason: not valid java name */
    private static final void m6672drawParagraphs7AXcY_I(MultiParagraph $this$drawParagraphs_u2d7AXcY_I, Canvas canvas, Brush brush, float alpha, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        List<ParagraphInfo> r0 = $this$drawParagraphs_u2d7AXcY_I.getParagraphInfoList$ui_text_release();
        int index$iv = 0;
        int r3 = r0.size();
    L3:
        if (index$iv >= r3) goto L6;
        Object item$iv = r0.get(index$iv);
        ParagraphInfo it = (ParagraphInfo) item$iv;
        it.getParagraph().mo6233painthn5TExg(canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
        canvas.translate(0.0f, it.getParagraph().getHeight());
        index$iv = index$iv + 1;
        goto L3
    }
}
