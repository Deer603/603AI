package androidx.compose.ui.text;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: TextPainter.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001af\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001ah\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0080\u0001\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aj\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020/2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a&\u00102\u001a\u000203*\u00020\u00062\u0006\u0010+\u001a\u00020,2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"clip", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "drawText", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "size", "Landroidx/compose/ui/geometry/Size;", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "textLayoutConstraints", "Landroidx/compose/ui/unit/Constraints;", "textLayoutConstraints-v_w8tDc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextPainterKt {
    /* JADX INFO: renamed from: drawText-JFhB2K4$default, reason: not valid java name */
    public static /* synthetic */ void m6397drawTextJFhB2K4$default(DrawScope r16, TextMeasurer r17, AnnotatedString r18, long r19, TextStyle r21, int r22, boolean r23, int r24, List r25, long r26, int r28, int r29, Object r30) {
        if ((r29 & 4) == 0) goto L5;
        long r6 = Offset.Companion.m4141getZeroF1C5BW0();
    L7:
        if ((r29 & 8) == 0) goto L9;
        TextStyle r8 = TextStyle.Companion.getDefault();
    L11:
        if ((r29 & 16) == 0) goto L13;
        int r9 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L15:
        if ((r29 & 32) == 0) goto L17;
        boolean r10 = true;
    L19:
        if ((r29 & 64) == 0) goto L21;
        int r11 = Integer.MAX_VALUE;
    L23:
        if ((r29 & 128) == 0) goto L25;
        List r12 = CollectionsKt.emptyList();
    L27:
        if ((r29 & 256) == 0) goto L29;
        long r13 = Size.Companion.m4202getUnspecifiedNHjbRc();
    L31:
        if ((r29 & 512) == 0) goto L33;
        int r15 = DrawScope.Companion.m4919getDefaultBlendMode0nO6VwU();
    L34:
        m6396drawTextJFhB2K4(r16, r17, r18, r6, r8, r9, r10, r11, r12, r13, r15);
        return;
    L33:
        r15 = r28;
        goto L34
    L29:
        r13 = r26;
        goto L31
    L25:
        r12 = r25;
        goto L27
    L21:
        r11 = r24;
        goto L23
    L17:
        r10 = r23;
        goto L19
    L13:
        r9 = r22;
        goto L15
    L9:
        r8 = r21;
        goto L11
    L5:
        r6 = r19;
        goto L7
    }

    /* JADX INFO: renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m6396drawTextJFhB2K4(DrawScope $this$drawText_u2dJFhB2K4, TextMeasurer textMeasurer, AnnotatedString text, long topLeft, TextStyle style, int overflow, boolean softWrap, int maxLines, List<AnnotatedString.Range<Placeholder>> r32, long size, int blendMode) {
        TextLayoutResult textLayoutResult = TextMeasurer.m6391measurexDpz5zY$default(textMeasurer, text, style, overflow, softWrap, maxLines, r32, m6404textLayoutConstraintsv_w8tDc($this$drawText_u2dJFhB2K4, size, topLeft), $this$drawText_u2dJFhB2K4.getLayoutDirection(), $this$drawText_u2dJFhB2K4, null, false, 1536, null);
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$drawText_u2dJFhB2K4.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$drawText_JFhB2K4_u24lambda_u240 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L6
        int bits$iv$iv$iv = (int) (topLeft >> 32);     // Catch: Throwable -> L6
        float r3 = Float.intBitsToFloat(bits$iv$iv$iv);     // Catch: Throwable -> L6
        int bits$iv$iv$iv2 = (int) (topLeft & 4294967295L);     // Catch: Throwable -> L6
        $this$drawText_JFhB2K4_u24lambda_u240.translate(r3, Float.intBitsToFloat(bits$iv$iv$iv2));     // Catch: Throwable -> L6
        clip($this$drawText_JFhB2K4_u24lambda_u240, textLayoutResult);     // Catch: Throwable -> L6
        MultiParagraph.m6264paintLG529CI$default(textLayoutResult.getMultiParagraph(), $this$drawText_u2dJFhB2K4.getDrawContext().getCanvas(), 0, null, null, null, blendMode, 30, null);     // Catch: Throwable -> L6
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L6:
        th = move-exception;
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    }

    /* JADX INFO: renamed from: drawText-TPWCCtM$default, reason: not valid java name */
    public static /* synthetic */ void m6401drawTextTPWCCtM$default(DrawScope r15, TextMeasurer r16, String r17, long r18, TextStyle r20, int r21, boolean r22, int r23, long r24, int r26, int r27, Object r28) {
        if ((r27 & 4) == 0) goto L5;
        long r6 = Offset.Companion.m4141getZeroF1C5BW0();
    L7:
        if ((r27 & 8) == 0) goto L9;
        TextStyle r8 = TextStyle.Companion.getDefault();
    L11:
        if ((r27 & 16) == 0) goto L13;
        int r9 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L15:
        if ((r27 & 32) == 0) goto L17;
        boolean r10 = true;
    L19:
        if ((r27 & 64) == 0) goto L21;
        int r11 = Integer.MAX_VALUE;
    L23:
        if ((r27 & 128) == 0) goto L25;
        long r12 = Size.Companion.m4202getUnspecifiedNHjbRc();
    L27:
        if ((r27 & 256) == 0) goto L29;
        int r14 = DrawScope.Companion.m4919getDefaultBlendMode0nO6VwU();
    L30:
        m6400drawTextTPWCCtM(r15, r16, r17, r6, r8, r9, r10, r11, r12, r14);
        return;
    L29:
        r14 = r26;
        goto L30
    L25:
        r12 = r24;
        goto L27
    L21:
        r11 = r23;
        goto L23
    L17:
        r10 = r22;
        goto L19
    L13:
        r9 = r21;
        goto L15
    L9:
        r8 = r20;
        goto L11
    L5:
        r6 = r18;
        goto L7
    }

    /* JADX INFO: renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m6400drawTextTPWCCtM(DrawScope $this$drawText_u2dTPWCCtM, TextMeasurer textMeasurer, String text, long topLeft, TextStyle style, int overflow, boolean softWrap, int maxLines, long size, int blendMode) {
        TextLayoutResult textLayoutResult = TextMeasurer.m6391measurexDpz5zY$default(textMeasurer, new AnnotatedString(text, null, 2, null), style, overflow, softWrap, maxLines, null, m6404textLayoutConstraintsv_w8tDc($this$drawText_u2dTPWCCtM, size, topLeft), $this$drawText_u2dTPWCCtM.getLayoutDirection(), $this$drawText_u2dTPWCCtM, null, false, 1568, null);
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$drawText_u2dTPWCCtM.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$drawText_TPWCCtM_u24lambda_u242 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L10
        int bits$iv$iv$iv = (int) (topLeft >> 32);     // Catch: Throwable -> L10
        float r1 = Float.intBitsToFloat(bits$iv$iv$iv);     // Catch: Throwable -> L10
        int bits$iv$iv$iv2 = (int) (4294967295L & topLeft);
        $this$drawText_TPWCCtM_u24lambda_u242.translate(r1, Float.intBitsToFloat(bits$iv$iv$iv2));     // Catch: Throwable -> L8
        clip($this$drawText_TPWCCtM_u24lambda_u242, textLayoutResult);     // Catch: Throwable -> L8
        MultiParagraph.m6264paintLG529CI$default(textLayoutResult.getMultiParagraph(), $this$drawText_u2dTPWCCtM.getDrawContext().getCanvas(), 0, null, null, null, blendMode, 30, null);     // Catch: Throwable -> L8
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L8:
        th = th;
    L12:
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    L10:
        th = th;
        goto L12
    }

    /* JADX INFO: renamed from: drawText-d8-rzKo$default, reason: not valid java name */
    public static /* synthetic */ void m6403drawTextd8rzKo$default(DrawScope r10, TextLayoutResult r11, long r12, long r14, float r16, Shadow r17, TextDecoration r18, DrawStyle r19, int r20, int r21, Object r22) {
        if ((r21 & 2) == 0) goto L5;
        long r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r21 & 4) == 0) goto L9;
        long r3 = Offset.Companion.m4141getZeroF1C5BW0();
    L11:
        if ((r21 & 8) == 0) goto L13;
        float r5 = Float.NaN;
    L14:
        DrawStyle r7 = null;
        if ((r21 & 16) == 0) goto L17;
        Shadow r6 = null;
    L19:
        if ((r21 & 32) == 0) goto L21;
        TextDecoration r8 = null;
    L23:
        if ((r21 & 64) != 0) goto L27;
        r7 = r19;
    L27:
        if ((r21 & 128) == 0) goto L29;
        int r0 = DrawScope.Companion.m4919getDefaultBlendMode0nO6VwU();
    L30:
        TextDecoration r23 = r8;
        m6402drawTextd8rzKo(r10, r11, r1, r3, r5, r6, r23, r7, r0);
        return;
    L29:
        r0 = r20;
        goto L30
    L21:
        r8 = r18;
        goto L23
    L17:
        r6 = r17;
        goto L19
    L13:
        r5 = r16;
        goto L14
    L9:
        r3 = r14;
        goto L11
    L5:
        r1 = r12;
        goto L7
    }

    /* JADX INFO: renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m6402drawTextd8rzKo(DrawScope $this$drawText_u2dd8_u2drzKo, TextLayoutResult textLayoutResult, long color, long topLeft, float alpha, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int blendMode) {
        if (shadow != null) goto L4;
        Shadow r0 = textLayoutResult.getLayoutInput().getStyle().getShadow();
    L5:
        Shadow newShadow = r0;
        if (textDecoration != null) goto L8;
        TextDecoration newTextDecoration = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
    L9:
        if (drawStyle != null) goto L11;
        DrawStyle newDrawStyle = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
    L12:
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$drawText_u2dd8_u2drzKo.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$drawText_d8_rzKo_u24lambda_u244 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L38
        int bits$iv$iv$iv = (int) (topLeft >> 32);     // Catch: Throwable -> L38
        float r15 = Float.intBitsToFloat(bits$iv$iv$iv);     // Catch: Throwable -> L38
        int bits$iv$iv$iv2 = (int) (topLeft & 4294967295L);     // Catch: Throwable -> L38
        $this$drawText_d8_rzKo_u24lambda_u244.translate(r15, Float.intBitsToFloat(bits$iv$iv$iv2));     // Catch: Throwable -> L38
        clip($this$drawText_d8_rzKo_u24lambda_u244, textLayoutResult);     // Catch: Throwable -> L36
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();     // Catch: Throwable -> L36
        boolean r2 = false;
        if (brush != null) goto L18;
    L27:
        MultiParagraph r1 = textLayoutResult.getMultiParagraph();     // Catch: Throwable -> L36
        Canvas r4 = $this$drawText_u2dd8_u2drzKo.getDrawContext().getCanvas();     // Catch: Throwable -> L36
        if (color == 16) goto L30;
        r2 = true;
    L30:
        if (r2 == false) goto L32;
        long r3 = color;
    L33:
        r1.m6271paintLG529CI(r4, TextDrawStyleKt.m6855modulateDxMtmZc(r3, alpha), newShadow, newTextDecoration, newDrawStyle, blendMode);     // Catch: Throwable -> L36
    L34:
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L32:
        r3 = textLayoutResult.getLayoutInput().getStyle().m6447getColor0d7_KjU();     // Catch: Throwable -> L36
        goto L33
    L18:
        if (color != 16) goto L20;
        int r5 = 1;
    L21:
        if (r5 == 0) goto L27;
        MultiParagraph r6 = textLayoutResult.getMultiParagraph();     // Catch: Throwable -> L36
        Canvas r7 = $this$drawText_u2dd8_u2drzKo.getDrawContext().getCanvas();     // Catch: Throwable -> L36
        if (Float.isNaN(alpha) == true) goto L25;
        float r8 = alpha;
    L26:
        r6.m6273painthn5TExg(r7, brush, r8, newShadow, newTextDecoration, newDrawStyle, blendMode);     // Catch: Throwable -> L36
        goto L34
    L25:
        r8 = textLayoutResult.getLayoutInput().getStyle().getAlpha();     // Catch: Throwable -> L36
        goto L26
    L20:
        r5 = 0;
    L36:
        th = th;
    L40:
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    L38:
        th = th;
        goto L40
    L11:
        newDrawStyle = drawStyle;
        goto L12
    L8:
        newTextDecoration = textDecoration;
        goto L9
    L4:
        r0 = shadow;
        goto L5
    }

    /* JADX INFO: renamed from: drawText-LVfH_YU$default, reason: not valid java name */
    public static /* synthetic */ void m6399drawTextLVfH_YU$default(DrawScope r13, TextLayoutResult r14, Brush r15, long r16, float r18, Shadow r19, TextDecoration r20, DrawStyle r21, int r22, int r23, Object r24) {
        if ((r23 & 4) == 0) goto L5;
        long r6 = Offset.Companion.m4141getZeroF1C5BW0();
    L7:
        if ((r23 & 8) == 0) goto L9;
        float r8 = Float.NaN;
    L11:
        if ((r23 & 16) == 0) goto L13;
        Shadow r9 = null;
    L15:
        if ((r23 & 32) == 0) goto L17;
        TextDecoration r10 = null;
    L19:
        if ((r23 & 64) == 0) goto L21;
        DrawStyle r11 = null;
    L23:
        if ((r23 & 128) == 0) goto L25;
        int r12 = DrawScope.Companion.m4919getDefaultBlendMode0nO6VwU();
    L26:
        m6398drawTextLVfH_YU(r13, r14, r15, r6, r8, r9, r10, r11, r12);
        return;
    L25:
        r12 = r22;
        goto L26
    L21:
        r11 = r21;
        goto L23
    L17:
        r10 = r20;
        goto L19
    L13:
        r9 = r19;
        goto L15
    L9:
        r8 = r18;
        goto L11
    L5:
        r6 = r16;
        goto L7
    }

    /* JADX INFO: renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m6398drawTextLVfH_YU(DrawScope $this$drawText_u2dLVfH_YU, TextLayoutResult textLayoutResult, Brush brush, long topLeft, float alpha, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int blendMode) {
        if (shadow != null) goto L4;
        Shadow r0 = textLayoutResult.getLayoutInput().getStyle().getShadow();
    L5:
        Shadow newShadow = r0;
        if (textDecoration != null) goto L8;
        TextDecoration newTextDecoration = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
    L9:
        if (drawStyle != null) goto L11;
        DrawStyle newDrawStyle = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
    L12:
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$drawText_u2dLVfH_YU.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$drawText_LVfH_YU_u24lambda_u247 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L24
        int bits$iv$iv$iv = (int) (topLeft >> 32);     // Catch: Throwable -> L24
        float r15 = Float.intBitsToFloat(bits$iv$iv$iv);     // Catch: Throwable -> L24
        int bits$iv$iv$iv2 = (int) (topLeft & 4294967295L);     // Catch: Throwable -> L24
        $this$drawText_LVfH_YU_u24lambda_u247.translate(r15, Float.intBitsToFloat(bits$iv$iv$iv2));     // Catch: Throwable -> L24
        clip($this$drawText_LVfH_YU_u24lambda_u247, textLayoutResult);     // Catch: Throwable -> L22
        MultiParagraph r1 = textLayoutResult.getMultiParagraph();     // Catch: Throwable -> L22
        Canvas r2 = $this$drawText_u2dLVfH_YU.getDrawContext().getCanvas();     // Catch: Throwable -> L22
        if (Float.isNaN(alpha) == true) goto L18;
        float r4 = alpha;
    L19:
        r1.m6273painthn5TExg(r2, brush, r4, newShadow, newTextDecoration, newDrawStyle, blendMode);     // Catch: Throwable -> L22
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L18:
        r4 = textLayoutResult.getLayoutInput().getStyle().getAlpha();     // Catch: Throwable -> L22
    L22:
        th = th;
    L26:
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    L24:
        th = th;
        goto L26
    L11:
        newDrawStyle = drawStyle;
        goto L12
    L8:
        newTextDecoration = textDecoration;
        goto L9
    L4:
        r0 = shadow;
        goto L5
    }

    private static final void clip(DrawTransform $this$clip, TextLayoutResult textLayoutResult) {
        if (textLayoutResult.getHasVisualOverflow() == false) goto L9;
        if (TextOverflow.m6877equalsimpl0(textLayoutResult.getLayoutInput().m6384getOverflowgIe3tQ8(), TextOverflow.Companion.m6890getVisiblegIe3tQ8()) == true) goto L11;
        long arg0$iv = textLayoutResult.m6388getSizeYbymL2g();
        float r7 = (int) (arg0$iv >> 32);
        long arg0$iv2 = textLayoutResult.m6388getSizeYbymL2g();
        DrawTransform.m4974clipRectN_I0leg$default($this$clip, 0.0f, 0.0f, r7, (int) (4294967295L & arg0$iv2), 0, 16, null);
        return;
    L11:
        return;
    }

    /* JADX INFO: renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m6404textLayoutConstraintsv_w8tDc(DrawScope $this$textLayoutConstraints_u2dv_w8tDc, long size, long topLeft) {
        boolean isHeightNaN = true;
        if (size != InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r2 = true;
    L7:
        if (r2 == true) goto L12;
        int bits$iv$iv$iv = (int) (size >> 32);
        if (Float.isNaN(Float.intBitsToFloat(bits$iv$iv$iv)) == true) goto L12;
        boolean isWidthNaN = false;
    L13:
        if (isWidthNaN == false) goto L15;
        int minWidth = 0;
        long arg0$iv = $this$textLayoutConstraints_u2dv_w8tDc.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv2 = (int) (arg0$iv >> 32);
        int bits$iv$iv$iv3 = (int) (topLeft >> 32);
        float $this$fastRoundToInt$iv = (float) Math.ceil(Float.intBitsToFloat(bits$iv$iv$iv2) - Float.intBitsToFloat(bits$iv$iv$iv3));
        int maxWidth = Math.round($this$fastRoundToInt$iv);
    L17:
        if (size != InlineClassHelperKt.UnspecifiedPackedFloats) goto L19;
        boolean r5 = true;
    L21:
        if (r5 == true) goto L26;
        int bits$iv$iv$iv4 = (int) (size & 4294967295L);
        if (Float.isNaN(Float.intBitsToFloat(bits$iv$iv$iv4)) == true) goto L26;
        isHeightNaN = false;
    L26:
        if (isHeightNaN == false) goto L28;
        int minHeight = 0;
        long arg0$iv2 = $this$textLayoutConstraints_u2dv_w8tDc.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv5 = (int) (arg0$iv2 & 4294967295L);
        int bits$iv$iv$iv6 = (int) (4294967295L & topLeft);
        float $this$fastRoundToInt$iv2 = (float) Math.ceil(Float.intBitsToFloat(bits$iv$iv$iv5) - Float.intBitsToFloat(bits$iv$iv$iv6));
        int maxHeight = Math.round($this$fastRoundToInt$iv2);
    L30:
        return ConstraintsKt.Constraints(minWidth, maxWidth, minHeight, maxHeight);
    L28:
        int bits$iv$iv$iv7 = (int) (4294967295L & size);
        float $this$fastRoundToInt$iv3 = (float) Math.ceil(Float.intBitsToFloat(bits$iv$iv$iv7));
        maxHeight = Math.round($this$fastRoundToInt$iv3);
        minHeight = maxHeight;
        goto L30
    L19:
        r5 = false;
        goto L21
    L15:
        int bits$iv$iv$iv8 = (int) (size >> 32);
        float $this$fastRoundToInt$iv4 = (float) Math.ceil(Float.intBitsToFloat(bits$iv$iv$iv8));
        maxWidth = Math.round($this$fastRoundToInt$iv4);
        minWidth = maxWidth;
    L12:
        isWidthNaN = true;
        goto L13
    L5:
        r2 = false;
        goto L7
    }
}
