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

/* JADX INFO: compiled from: SelectableTextAnnotatedStringElement.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015\u0012\u001e\b\u0002\u0010\u0018\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u0010 J\t\u0010\"\u001a\u00020\u0004HÂ\u0003J\u001f\u0010#\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÂ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u001bHÂ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u001dHÂ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u001fHÂ\u0003J\t\u0010'\u001a\u00020\u0006HÂ\u0003J\t\u0010(\u001a\u00020\bHÂ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÂ\u0003J\u0016\u0010*\u001a\u00020\u000eHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\t\u0010-\u001a\u00020\u0010HÂ\u0003J\t\u0010.\u001a\u00020\u0012HÂ\u0003J\t\u0010/\u001a\u00020\u0012HÂ\u0003J\u0017\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015HÂ\u0003JÍ\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u00152\u001e\b\u0002\u0010\u0018\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J\b\u00104\u001a\u00020\u0002H\u0016J\u0013\u00105\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u00020\u0012H\u0016J\t\u00109\u001a\u00020:HÖ\u0001J\u0010\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020\u0002H\u0016J\f\u0010=\u001a\u00020\f*\u00020>H\u0016R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u00020\u000eX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010!R\u001c\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "autoSize", "Landroidx/compose/foundation/text/TextAutoSize;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "I", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component5-gIe3tQ8", "()I", "component6", "component7", "component8", "component9", "copy", "copy-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "create", "equals", "other", "", "hashCode", "toString", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {
    public static final int $stable = 0;
    private final TextAutoSize autoSize;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final Function1<List<Rect>, Unit> onPlaceholderLayout;
    private final Function1<TextLayoutResult, Unit> onTextLayout;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final SelectionController selectionController;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    static {
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString r1, TextStyle r2, FontFamily.Resolver r3, Function1 r4, int r5, boolean r6, int r7, int r8, List r9, Function1 r10, SelectionController r11, ColorProducer r12, TextAutoSize r13, DefaultConstructorMarker r14) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    }

    private final AnnotatedString component1() {
        return this.text;
    }

    private final Function1<List<Rect>, Unit> component10() {
        return this.onPlaceholderLayout;
    }

    private final SelectionController component11() {
        return this.selectionController;
    }

    private final ColorProducer component12() {
        return this.color;
    }

    private final TextAutoSize component13() {
        return this.autoSize;
    }

    private final TextStyle component2() {
        return this.style;
    }

    private final FontFamily.Resolver component3() {
        return this.fontFamilyResolver;
    }

    private final Function1<TextLayoutResult, Unit> component4() {
        return this.onTextLayout;
    }

    /* JADX INFO: renamed from: component5-gIe3tQ8, reason: not valid java name */
    private final int m1421component5gIe3tQ8() {
        return this.overflow;
    }

    private final boolean component6() {
        return this.softWrap;
    }

    private final int component7() {
        return this.maxLines;
    }

    private final int component8() {
        return this.minLines;
    }

    private final List<AnnotatedString.Range<Placeholder>> component9() {
        return this.placeholders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-RWo7tUw$default, reason: not valid java name */
    public static /* synthetic */ SelectableTextAnnotatedStringElement m1422copyRWo7tUw$default(SelectableTextAnnotatedStringElement r12, AnnotatedString r13, TextStyle r14, FontFamily.Resolver r15, Function1 r16, int r17, boolean r18, int r19, int r20, List r21, Function1 r22, SelectionController r23, ColorProducer r24, TextAutoSize r25, int r26, Object r27) {
        if ((r26 & 1) == 0) goto L6;
        r13 = r12.text;
    L6:
        if ((r26 & 2) == 0) goto L8;
        TextStyle r1 = r12.style;
    L10:
        if ((r26 & 4) == 0) goto L12;
        FontFamily.Resolver r2 = r12.fontFamilyResolver;
    L14:
        if ((r26 & 8) == 0) goto L16;
        Function1 r3 = r12.onTextLayout;
    L18:
        if ((r26 & 16) == 0) goto L20;
        int r4 = r12.overflow;
    L22:
        if ((r26 & 32) == 0) goto L24;
        boolean r5 = r12.softWrap;
    L26:
        if ((r26 & 64) == 0) goto L28;
        int r6 = r12.maxLines;
    L30:
        if ((r26 & 128) == 0) goto L32;
        int r7 = r12.minLines;
    L34:
        if ((r26 & 256) == 0) goto L36;
        List r8 = r12.placeholders;
    L38:
        if ((r26 & 512) == 0) goto L40;
        Function1 r9 = r12.onPlaceholderLayout;
    L42:
        if ((r26 & 1024) == 0) goto L44;
        SelectionController r10 = r12.selectionController;
    L46:
        if ((r26 & 2048) == 0) goto L48;
        ColorProducer r11 = r12.color;
    L50:
        if ((r26 & 4096) == 0) goto L52;
        TextAutoSize r28 = r12.autoSize;
    L54:
        return r12.m1423copyRWo7tUw(r13, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r28);
    L52:
        r28 = r25;
        goto L54
    L48:
        r11 = r24;
        goto L50
    L44:
        r10 = r23;
        goto L46
    L40:
        r9 = r22;
        goto L42
    L36:
        r8 = r21;
        goto L38
    L32:
        r7 = r20;
        goto L34
    L28:
        r6 = r19;
        goto L30
    L24:
        r5 = r18;
        goto L26
    L20:
        r4 = r17;
        goto L22
    L16:
        r3 = r16;
        goto L18
    L12:
        r2 = r15;
        goto L14
    L8:
        r1 = r14;
        goto L10
    }

    /* JADX INFO: renamed from: copy-RWo7tUw, reason: not valid java name */
    public final SelectableTextAnnotatedStringElement m1423copyRWo7tUw(AnnotatedString r16, TextStyle r17, FontFamily.Resolver r18, Function1<? super TextLayoutResult, Unit> r19, int r20, boolean r21, int r22, int r23, List<AnnotatedString.Range<Placeholder>> r24, Function1<? super List<Rect>, Unit> r25, SelectionController r26, ColorProducer r27, TextAutoSize r28) {
        return new SelectableTextAnnotatedStringElement(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, null);
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("SelectableTextAnnotatedStringElement(text=").append(this.text).append(", style=").append(this.style).append(", fontFamilyResolver=").append(this.fontFamilyResolver).append(", onTextLayout=").append(this.onTextLayout).append(", overflow=").append(TextOverflow.m6879toStringimpl(this.overflow)).append(", softWrap=").append(this.softWrap).append(", maxLines=").append(this.maxLines).append(", minLines=").append(this.minLines).append(", placeholders=").append(this.placeholders).append(", onPlaceholderLayout=").append(this.onPlaceholderLayout).append(", selectionController=").append(this.selectionController).append(", color=");
        r0.append(this.color).append(", autoSize=").append(this.autoSize).append(')');
        return r0.toString();
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString r19, TextStyle r20, FontFamily.Resolver r21, Function1 r22, int r23, boolean r24, int r25, int r26, List r27, Function1 r28, SelectionController r29, ColorProducer r30, TextAutoSize r31, int r32, DefaultConstructorMarker r33) {
        if ((r32 & 8) == 0) goto L5;
        Function1 r7 = null;
    L7:
        if ((r32 & 16) == 0) goto L9;
        int r8 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L11:
        if ((r32 & 32) == 0) goto L13;
        boolean r9 = true;
    L15:
        if ((r32 & 64) == 0) goto L17;
        int r10 = Integer.MAX_VALUE;
    L19:
        if ((r32 & 128) == 0) goto L21;
        int r11 = 1;
    L23:
        if ((r32 & 256) == 0) goto L25;
        List r12 = null;
    L27:
        if ((r32 & 512) == 0) goto L29;
        Function1 r13 = null;
    L31:
        if ((r32 & 1024) == 0) goto L33;
        SelectionController r14 = null;
    L35:
        if ((r32 & 2048) == 0) goto L37;
        ColorProducer r15 = null;
    L39:
        if ((r32 & 4096) == 0) goto L41;
        TextAutoSize r16 = null;
    L42:
        this(r19, r20, r21, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, null);
        return;
    L41:
        r16 = r31;
        goto L42
    L37:
        r15 = r30;
        goto L39
    L33:
        r14 = r29;
        goto L35
    L29:
        r13 = r28;
        goto L31
    L25:
        r12 = r27;
        goto L27
    L21:
        r11 = r26;
        goto L23
    L17:
        r10 = r25;
        goto L19
    L13:
        r9 = r24;
        goto L15
    L9:
        r8 = r23;
        goto L11
    L5:
        r7 = r22;
        goto L7
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((SelectableTextAnnotatedStringNode) node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1<? super TextLayoutResult, Unit> r4, int overflow, boolean softWrap, int maxLines, int minLines, List<AnnotatedString.Range<Placeholder>> r9, Function1<? super List<Rect>, Unit> r10, SelectionController selectionController, ColorProducer color, TextAutoSize autoSize) {
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
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SelectableTextAnnotatedStringNode create() {
        Function1 r15 = null;
        return new SelectableTextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize, r15, 8192, null);
    }

    public void update(SelectableTextAnnotatedStringNode node) {
        node.m1424update7NebLg4(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof SelectableTextAnnotatedStringElement) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.color, ((SelectableTextAnnotatedStringElement) other).color) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.text, ((SelectableTextAnnotatedStringElement) other).text) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.style, ((SelectableTextAnnotatedStringElement) other).style) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.placeholders, ((SelectableTextAnnotatedStringElement) other).placeholders) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.fontFamilyResolver, ((SelectableTextAnnotatedStringElement) other).fontFamilyResolver) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.autoSize, ((SelectableTextAnnotatedStringElement) other).autoSize) == true) goto L27;
        return false;
    L27:
        if (this.onTextLayout == ((SelectableTextAnnotatedStringElement) other).onTextLayout) goto L30;
        return false;
    L30:
        if (TextOverflow.m6877equalsimpl0(this.overflow, ((SelectableTextAnnotatedStringElement) other).overflow) == true) goto L33;
        return false;
    L33:
        if (this.softWrap == ((SelectableTextAnnotatedStringElement) other).softWrap) goto L36;
        return false;
    L36:
        if (this.maxLines == ((SelectableTextAnnotatedStringElement) other).maxLines) goto L39;
        return false;
    L39:
        if (this.minLines == ((SelectableTextAnnotatedStringElement) other).minLines) goto L42;
        return false;
    L42:
        if (this.onPlaceholderLayout == ((SelectableTextAnnotatedStringElement) other).onPlaceholderLayout) goto L45;
        return false;
    L45:
        if (Intrinsics.areEqual(this.selectionController, ((SelectableTextAnnotatedStringElement) other).selectionController) == true) goto L47;
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
        TextAutoSize r11 = this.autoSize;
        if (r11 == null) goto L21;
        int r12 = r11.hashCode();
    L22:
        int result7 = (result6 + r12) * 31;
        ColorProducer r13 = this.color;
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
