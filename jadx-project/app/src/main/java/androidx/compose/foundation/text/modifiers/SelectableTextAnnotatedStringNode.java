package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SelectableTextAnnotatedStringNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BÑ\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017\u0012\u001e\b\u0002\u0010\u001a\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0002\u0010$J\u0010\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,H\u0016J°\u0001\u0010-\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u001c\u0010\u001a\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010.\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0004\b/\u00100J\f\u00101\u001a\u00020\u000e*\u000202H\u0016J\u001c\u00103\u001a\u00020\u0014*\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0014H\u0016J\u001c\u00108\u001a\u00020\u0014*\u0002042\u0006\u00105\u001a\u0002062\u0006\u00109\u001a\u00020\u0014H\u0016J&\u0010:\u001a\u00020;*\u00020<2\u0006\u00105\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001c\u0010B\u001a\u00020\u0014*\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0014H\u0016J\u001c\u0010C\u001a\u00020\u0014*\u0002042\u0006\u00105\u001a\u0002062\u0006\u00109\u001a\u00020\u0014H\u0016R\u001c\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "overrideColor", "Landroidx/compose/ui/graphics/ColorProducer;", "autoSize", "Landroidx/compose/foundation/text/TextAutoSize;", "onShowTranslation", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "textAnnotatedStringNode", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "onGloballyPositioned", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "update", "color", "update-7NebLg4", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;)V", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelectableTextAnnotatedStringNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode {
    public static final int $stable = 0;
    private Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> onShowTranslation;
    private SelectionController selectionController;
    private final TextAnnotatedStringNode textAnnotatedStringNode;

    static {
        $stable = 8;
    }

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString r1, TextStyle r2, FontFamily.Resolver r3, Function1 r4, int r5, boolean r6, int r7, int r8, List r9, Function1 r10, SelectionController r11, ColorProducer r12, TextAutoSize r13, Function1 r14, DefaultConstructorMarker r15) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    }

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString r20, TextStyle r21, FontFamily.Resolver r22, Function1 r23, int r24, boolean r25, int r26, int r27, List r28, Function1 r29, SelectionController r30, ColorProducer r31, TextAutoSize r32, Function1 r33, int r34, DefaultConstructorMarker r35) {
        if ((r34 & 8) == 0) goto L5;
        Function1 r7 = null;
    L7:
        if ((r34 & 16) == 0) goto L9;
        int r8 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L11:
        if ((r34 & 32) == 0) goto L13;
        boolean r9 = true;
    L15:
        if ((r34 & 64) == 0) goto L17;
        int r10 = Integer.MAX_VALUE;
    L19:
        if ((r34 & 128) == 0) goto L21;
        int r11 = 1;
    L23:
        if ((r34 & 256) == 0) goto L25;
        List r12 = null;
    L27:
        if ((r34 & 512) == 0) goto L29;
        Function1 r13 = null;
    L31:
        if ((r34 & 1024) == 0) goto L33;
        SelectionController r14 = null;
    L35:
        if ((r34 & 2048) == 0) goto L37;
        ColorProducer r15 = null;
    L39:
        if ((r34 & 4096) == 0) goto L41;
        TextAutoSize r16 = null;
    L43:
        if ((r34 & 8192) == 0) goto L45;
        Function1 r17 = null;
    L46:
        this(r20, r21, r22, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, null);
        return;
    L45:
        r17 = r33;
        goto L46
    L41:
        r16 = r32;
        goto L43
    L37:
        r15 = r31;
        goto L39
    L33:
        r14 = r30;
        goto L35
    L29:
        r13 = r29;
        goto L31
    L25:
        r12 = r28;
        goto L27
    L21:
        r11 = r27;
        goto L23
    L17:
        r10 = r26;
        goto L19
    L13:
        r9 = r25;
        goto L15
    L9:
        r8 = r24;
        goto L11
    L5:
        r7 = r23;
        goto L7
    }

    private SelectableTextAnnotatedStringNode(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1<? super TextLayoutResult, Unit> r23, int overflow, boolean softWrap, int maxLines, int minLines, List<AnnotatedString.Range<Placeholder>> r28, Function1<? super List<Rect>, Unit> r29, SelectionController selectionController, ColorProducer overrideColor, TextAutoSize autoSize, Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> r33) {
        this.selectionController = selectionController;
        this.onShowTranslation = r33;
        this.textAnnotatedStringNode = (TextAnnotatedStringNode) delegate(new TextAnnotatedStringNode(text, style, fontFamilyResolver, r23, overflow, softWrap, maxLines, minLines, r28, r29, this.selectionController, overrideColor, autoSize, this.onShowTranslation, null));
        Object value$iv = this.selectionController;
        if (value$iv == null) goto L5;
        return;
    L5:
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        SelectionController r0 = this.selectionController;
        if (r0 == null) goto L6;
        r0.updateGlobalPosition(coordinates);
        return;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        this.textAnnotatedStringNode.drawNonExtension($this$draw);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        return this.textAnnotatedStringNode.m1425measureNonExtension3p2s80s($this$measure_u2d3p2s80s, measurable, constraints);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        return this.textAnnotatedStringNode.minIntrinsicWidthNonExtension($this$minIntrinsicWidth, measurable, height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        return this.textAnnotatedStringNode.minIntrinsicHeightNonExtension($this$minIntrinsicHeight, measurable, width);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        return this.textAnnotatedStringNode.maxIntrinsicWidthNonExtension($this$maxIntrinsicWidth, measurable, height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        return this.textAnnotatedStringNode.maxIntrinsicHeightNonExtension($this$maxIntrinsicHeight, measurable, width);
    }

    /* JADX INFO: renamed from: update-7NebLg4, reason: not valid java name */
    public final void m1424update7NebLg4(AnnotatedString text, TextStyle style, List<AnnotatedString.Range<Placeholder>> r19, int minLines, int maxLines, boolean softWrap, FontFamily.Resolver fontFamilyResolver, int overflow, Function1<? super TextLayoutResult, Unit> r25, Function1<? super List<Rect>, Unit> r26, SelectionController selectionController, ColorProducer color, TextAutoSize autoSize) {
        this.textAnnotatedStringNode.doInvalidations(this.textAnnotatedStringNode.updateDraw(color, style), this.textAnnotatedStringNode.updateText$foundation_release(text), this.textAnnotatedStringNode.m1426updateLayoutRelatedArgsy0kMQk(style, r19, minLines, maxLines, softWrap, fontFamilyResolver, overflow, autoSize), this.textAnnotatedStringNode.updateCallbacks(r25, r26, selectionController, this.onShowTranslation));
        this.selectionController = selectionController;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }
}
