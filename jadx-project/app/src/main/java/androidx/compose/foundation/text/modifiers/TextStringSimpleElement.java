package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextStringSimpleElement.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0013\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\f\u0010\u001c\u001a\u00020\u001a*\u00020\u001dH\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "I", "create", "equals", "other", "", "hashCode", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextStringSimpleElement extends ModifierNodeElement<TextStringSimpleNode> {
    public static final int $stable = 0;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private final boolean softWrap;
    private final TextStyle style;
    private final String text;

    static {
    }

    public /* synthetic */ TextStringSimpleElement(String r1, TextStyle r2, FontFamily.Resolver r3, int r4, boolean r5, int r6, int r7, ColorProducer r8, DefaultConstructorMarker r9) {
        this(r1, r2, r3, r4, r5, r6, r7, r8);
    }

    public /* synthetic */ TextStringSimpleElement(String r13, TextStyle r14, FontFamily.Resolver r15, int r16, boolean r17, int r18, int r19, ColorProducer r20, int r21, DefaultConstructorMarker r22) {
        if ((r21 & 8) == 0) goto L5;
        int r6 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L7:
        if ((r21 & 16) == 0) goto L9;
        boolean r7 = true;
    L11:
        if ((r21 & 32) == 0) goto L13;
        int r8 = Integer.MAX_VALUE;
    L15:
        if ((r21 & 64) == 0) goto L17;
        int r9 = 1;
    L19:
        if ((r21 & 128) == 0) goto L21;
        ColorProducer r10 = null;
    L22:
        this(r13, r14, r15, r6, r7, r8, r9, r10, null);
        return;
    L21:
        r10 = r20;
        goto L22
    L17:
        r9 = r19;
        goto L19
    L13:
        r8 = r18;
        goto L15
    L9:
        r7 = r17;
        goto L11
    L5:
        r6 = r16;
        goto L7
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((TextStringSimpleNode) node);
    }

    private TextStringSimpleElement(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, ColorProducer color) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.color = color;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextStringSimpleNode create() {
        return new TextStringSimpleNode(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    public void update(TextStringSimpleNode node) {
        node.doInvalidations(node.updateDraw(this.color, this.style), node.updateText(this.text), node.m1427updateLayoutRelatedArgsHuAbxIM(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof TextStringSimpleElement) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.color, ((TextStringSimpleElement) other).color) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.text, ((TextStringSimpleElement) other).text) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.style, ((TextStringSimpleElement) other).style) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.fontFamilyResolver, ((TextStringSimpleElement) other).fontFamilyResolver) == true) goto L21;
        return false;
    L21:
        if (TextOverflow.m6877equalsimpl0(this.overflow, ((TextStringSimpleElement) other).overflow) == true) goto L24;
        return false;
    L24:
        if (this.softWrap == ((TextStringSimpleElement) other).softWrap) goto L27;
        return false;
    L27:
        if (this.maxLines == ((TextStringSimpleElement) other).maxLines) goto L30;
        return false;
    L30:
        if (this.minLines == ((TextStringSimpleElement) other).minLines) goto L32;
        return false;
    L32:
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int result = this.text.hashCode();
        int result2 = (result * 31) + this.style.hashCode();
        int result3 = ((((((((((result2 * 31) + this.fontFamilyResolver.hashCode()) * 31) + TextOverflow.m6878hashCodeimpl(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        ColorProducer r2 = this.color;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return result3 + r3;
    L5:
        r3 = 0;
        goto L7
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
    }
}
