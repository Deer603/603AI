package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextAnnotatedStringElement.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÑ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015\u0012\u001e\b\u0002\u0010\u0018\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0002\u0010\"J\b\u0010$\u001a\u00020\u0002H\u0016J\u0013\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020\u0012H\u0016J\u0010\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0002H\u0016J\f\u0010+\u001a\u00020\f*\u00020,H\u0016R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u00020\u000eX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010#R\u001c\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "autoSize", "Landroidx/compose/foundation/text/TextAutoSize;", "onShowTranslation", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "I", "create", "equals", "other", "", "hashCode", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {
    public static final int $stable = 0;
    private final TextAutoSize autoSize;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final Function1<List<Rect>, Unit> onPlaceholderLayout;
    private final Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit> onShowTranslation;
    private final Function1<TextLayoutResult, Unit> onTextLayout;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final SelectionController selectionController;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    static {
    }

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString r1, TextStyle r2, FontFamily.Resolver r3, Function1 r4, int r5, boolean r6, int r7, int r8, List r9, Function1 r10, SelectionController r11, ColorProducer r12, TextAutoSize r13, Function1 r14, DefaultConstructorMarker r15) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    }

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString r20, TextStyle r21, FontFamily.Resolver r22, Function1 r23, int r24, boolean r25, int r26, int r27, List r28, Function1 r29, SelectionController r30, ColorProducer r31, TextAutoSize r32, Function1 r33, int r34, DefaultConstructorMarker r35) {
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

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((TextAnnotatedStringNode) node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1<? super TextLayoutResult, Unit> r4, int overflow, boolean softWrap, int maxLines, int minLines, List<AnnotatedString.Range<Placeholder>> r9, Function1<? super List<Rect>, Unit> r10, SelectionController selectionController, ColorProducer color, TextAutoSize autoSize, Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> r14) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.onTextLayout = r4;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.placeholders = r9;
        this.onPlaceholderLayout = r10;
        this.selectionController = selectionController;
        this.color = color;
        this.autoSize = autoSize;
        this.onShowTranslation = r14;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextAnnotatedStringNode create() {
        return new TextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize, this.onShowTranslation, null);
    }

    public void update(TextAnnotatedStringNode node) {
        node.doInvalidations(node.updateDraw(this.color, this.style), node.updateText$foundation_release(this.text), node.m1426updateLayoutRelatedArgsy0kMQk(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.autoSize), node.updateCallbacks(this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.onShowTranslation));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof TextAnnotatedStringElement) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.color, ((TextAnnotatedStringElement) other).color) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.text, ((TextAnnotatedStringElement) other).text) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.style, ((TextAnnotatedStringElement) other).style) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.placeholders, ((TextAnnotatedStringElement) other).placeholders) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.fontFamilyResolver, ((TextAnnotatedStringElement) other).fontFamilyResolver) == true) goto L24;
        return false;
    L24:
        if (this.onTextLayout == ((TextAnnotatedStringElement) other).onTextLayout) goto L27;
        return false;
    L27:
        if (this.onShowTranslation == ((TextAnnotatedStringElement) other).onShowTranslation) goto L30;
        return false;
    L30:
        if (TextOverflow.m6877equalsimpl0(this.overflow, ((TextAnnotatedStringElement) other).overflow) == true) goto L33;
        return false;
    L33:
        if (this.softWrap == ((TextAnnotatedStringElement) other).softWrap) goto L36;
        return false;
    L36:
        if (this.maxLines == ((TextAnnotatedStringElement) other).maxLines) goto L39;
        return false;
    L39:
        if (this.minLines == ((TextAnnotatedStringElement) other).minLines) goto L42;
        return false;
    L42:
        if (this.onPlaceholderLayout == ((TextAnnotatedStringElement) other).onPlaceholderLayout) goto L45;
        return false;
    L45:
        if (Intrinsics.areEqual(this.selectionController, ((TextAnnotatedStringElement) other).selectionController) == true) goto L47;
        return false;
    L47:
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int result = this.text.hashCode();
        int result2 = ((((result * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        Function1<TextLayoutResult, Unit> r2 = this.onTextLayout;
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = r2.hashCode();
    L6:
        int result3 = (((((((((result2 + r4) * 31) + TextOverflow.m6878hashCodeimpl(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<AnnotatedString.Range<Placeholder>> r5 = this.placeholders;
        if (r5 == null) goto L9;
        int r6 = r5.hashCode();
    L10:
        int result4 = (result3 + r6) * 31;
        Function1<List<Rect>, Unit> r7 = this.onPlaceholderLayout;
        if (r7 == null) goto L13;
        int r8 = r7.hashCode();
    L14:
        int result5 = (result4 + r8) * 31;
        SelectionController r9 = this.selectionController;
        if (r9 == null) goto L17;
        int r10 = r9.hashCode();
    L18:
        int result6 = (result5 + r10) * 31;
        ColorProducer r11 = this.color;
        if (r11 == null) goto L21;
        int r12 = r11.hashCode();
    L22:
        int result7 = (result6 + r12) * 31;
        Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit> r13 = this.onShowTranslation;
        if (r13 == null) goto L26;
        r3 = r13.hashCode();
    L26:
        return result7 + r3;
    L21:
        r12 = 0;
        goto L22
    L17:
        r10 = 0;
        goto L18
    L13:
        r8 = 0;
        goto L14
    L9:
        r6 = 0;
        goto L10
    L5:
        r4 = 0;
        goto L6
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
    }
}
