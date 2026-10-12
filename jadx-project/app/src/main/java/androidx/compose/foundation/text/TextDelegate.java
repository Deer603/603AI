package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TextDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 G2\u00020\u0001:\u0001GBc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012¢\u0006\u0002\u0010\u0015J,\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u001b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010:ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u000e\u0010A\u001a\u00020B2\u0006\u0010=\u001a\u00020\u001bJ\"\u0010C\u001a\u00020D2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010FR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010$\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b+\u0010\"R\u001c\u0010-\u001a\u0004\u0018\u00010(X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u00100R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate;", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "maxLines", "", "minLines", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getIntrinsicsLayoutDirection$foundation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setIntrinsicsLayoutDirection$foundation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "()I", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "getMinLines", "nonNullIntrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getNonNullIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getOverflow-gIe3tQ8", "I", "paragraphIntrinsics", "getParagraphIntrinsics$foundation_release", "setParagraphIntrinsics$foundation_release", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;)V", "getPlaceholders", "()Ljava/util/List;", "getSoftWrap", "()Z", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "layout", "Landroidx/compose/ui/text/TextLayoutResult;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutDirection", "prevResult", "layout-NN6Ew-U", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;", "layoutIntrinsics", "", "layoutText", "Landroidx/compose/ui/text/MultiParagraph;", "layoutText-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    /* JADX INFO: compiled from: TextDelegate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate$Companion;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public /* synthetic */ TextDelegate(AnnotatedString r1, TextStyle r2, int r3, int r4, boolean r5, int r6, Density r7, FontFamily.Resolver r8, List r9, DefaultConstructorMarker r10) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    private TextDelegate(AnnotatedString text, TextStyle style, int maxLines, int minLines, boolean softWrap, int overflow, Density density, FontFamily.Resolver fontFamilyResolver, List<AnnotatedString.Range<Placeholder>> r14) {
        this.text = text;
        this.style = style;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.softWrap = softWrap;
        this.overflow = overflow;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.placeholders = r14;
        boolean value$iv = true;
        if (this.maxLines <= 0) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("no maxLines");
    L10:
        if (this.minLines <= 0) goto L12;
        boolean value$iv3 = true;
    L14:
        if (value$iv3 == true) goto L17;
        InlineClassHelperKt.throwIllegalArgumentException("no minLines");
    L17:
        if (this.minLines <= this.maxLines) goto L21;
        value$iv = false;
    L21:
        if (value$iv == true) goto L25;
        InlineClassHelperKt.throwIllegalArgumentException("minLines greater than maxLines");
        return;
    L25:
        return;
    L12:
        value$iv3 = false;
        goto L14
    L5:
        value$iv2 = false;
        goto L7
    }

    public /* synthetic */ TextDelegate(AnnotatedString r14, TextStyle r15, int r16, int r17, boolean r18, int r19, Density r20, FontFamily.Resolver r21, List r22, int r23, DefaultConstructorMarker r24) {
        if ((r23 & 4) == 0) goto L5;
        int r5 = Integer.MAX_VALUE;
    L7:
        if ((r23 & 8) == 0) goto L9;
        int r6 = 1;
    L11:
        if ((r23 & 16) == 0) goto L13;
        boolean r7 = true;
    L15:
        if ((r23 & 32) == 0) goto L17;
        int r8 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L19:
        if ((r23 & 256) == 0) goto L21;
        List r11 = CollectionsKt.emptyList();
    L22:
        this(r14, r15, r5, r6, r7, r8, r20, r21, r11, null);
        return;
    L21:
        r11 = r22;
        goto L22
    L17:
        r8 = r19;
        goto L19
    L13:
        r7 = r18;
        goto L15
    L9:
        r6 = r17;
        goto L11
    L5:
        r5 = r16;
        goto L7
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinLines() {
        return this.minLines;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    /* JADX INFO: renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m1127getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final MultiParagraphIntrinsics getParagraphIntrinsics$foundation_release() {
        return this.paragraphIntrinsics;
    }

    public final void setParagraphIntrinsics$foundation_release(MultiParagraphIntrinsics r1) {
        this.paragraphIntrinsics = r1;
    }

    public final LayoutDirection getIntrinsicsLayoutDirection$foundation_release() {
        return this.intrinsicsLayoutDirection;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(LayoutDirection r1) {
        this.intrinsicsLayoutDirection = r1;
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics r0 = this.paragraphIntrinsics;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int getMinIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final void layoutIntrinsics(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics localIntrinsics = this.paragraphIntrinsics;
        if (localIntrinsics != null) goto L5;
    L10:
        this.intrinsicsLayoutDirection = layoutDirection;
        AnnotatedString r3 = this.text;
        TextStyle r4 = TextStyleKt.resolveDefaults(this.style, layoutDirection);
        Density r6 = this.density;
        FontFamily.Resolver r7 = this.fontFamilyResolver;
        MultiParagraphIntrinsics intrinsics = new MultiParagraphIntrinsics(r3, r4, this.placeholders, r6, r7);
    L11:
        this.paragraphIntrinsics = intrinsics;
        return;
    L5:
        if (layoutDirection != this.intrinsicsLayoutDirection) goto L10;
        if (localIntrinsics.getHasStaleResolvedFonts() == true) goto L10;
        intrinsics = localIntrinsics;
        goto L11
    }

    /* JADX INFO: renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m1126layoutTextK40F9xA(long constraints, LayoutDirection layoutDirection) {
        layoutIntrinsics(layoutDirection);
        int minWidth = Constraints.m6928getMinWidthimpl(constraints);
        int r3 = 1;
        if (this.softWrap == false) goto L5;
    L8:
        boolean widthMatters = true;
    L9:
        if (widthMatters == true) goto L11;
    L13:
        int maxWidth = Integer.MAX_VALUE;
    L15:
        if (this.softWrap == false) goto L17;
    L19:
        boolean overwriteMaxLines = false;
    L20:
        if (overwriteMaxLines == true) goto L23;
        r3 = this.maxLines;
    L23:
        int finalMaxLines = r3;
        if (minWidth != maxWidth) goto L26;
        int width = maxWidth;
    L28:
        return new MultiParagraph(getNonNullIntrinsics(), Constraints.Companion.m6935fitPrioritizingWidthZbe2FdA(0, width, 0, Constraints.m6925getMaxHeightimpl(constraints)), finalMaxLines, this.overflow, null);
    L26:
        width = RangesKt.coerceIn(getMaxIntrinsicWidth(), minWidth, maxWidth);
        goto L28
    L17:
        if (TextOverflow.m6877equalsimpl0(this.overflow, TextOverflow.Companion.m6887getEllipsisgIe3tQ8()) == false) goto L19;
        overwriteMaxLines = true;
        goto L20
    L11:
        if (Constraints.m6922getHasBoundedWidthimpl(constraints) == false) goto L13;
        maxWidth = Constraints.m6926getMaxWidthimpl(constraints);
        goto L15
    L5:
        if (TextOverflow.m6877equalsimpl0(this.overflow, TextOverflow.Companion.m6887getEllipsisgIe3tQ8()) == true) goto L8;
        widthMatters = false;
        goto L9
    }

    /* JADX INFO: renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m1125layoutNN6EwU$default(TextDelegate r0, long r1, LayoutDirection r3, TextLayoutResult r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r4 = null;
    L6:
        return r0.m1128layoutNN6EwU(r1, r3, r4);
    }

    /* JADX INFO: renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final TextLayoutResult m1128layoutNN6EwU(long constraints, LayoutDirection layoutDirection, TextLayoutResult prevResult) {
        if (prevResult == null) goto L10;
        if (TextLayoutHelperKt.m1161canReuse7_7YC6M(prevResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints) == false) goto L10;
        TextLayoutInput r1 = new TextLayoutInput(prevResult.getLayoutInput().getText(), this.style, prevResult.getLayoutInput().getPlaceholders(), prevResult.getLayoutInput().getMaxLines(), prevResult.getLayoutInput().getSoftWrap(), prevResult.getLayoutInput().m6384getOverflowgIe3tQ8(), prevResult.getLayoutInput().getDensity(), prevResult.getLayoutInput().getLayoutDirection(), prevResult.getLayoutInput().getFontFamilyResolver(), constraints, null);
        int width$iv = TextDelegateKt.ceilToIntPx(prevResult.getMultiParagraph().getWidth());
        int height$iv = TextDelegateKt.ceilToIntPx(prevResult.getMultiParagraph().getHeight());
        return prevResult.m6386copyO0kMr_c(r1, ConstraintsKt.m6940constrain4WqzIAM(constraints, IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L))));
    L10:
        MultiParagraph multiParagraph = m1126layoutTextK40F9xA(constraints, layoutDirection);
        int width$iv2 = TextDelegateKt.ceilToIntPx(multiParagraph.getWidth());
        int height$iv2 = TextDelegateKt.ceilToIntPx(multiParagraph.getHeight());
        long size = ConstraintsKt.m6940constrain4WqzIAM(constraints, IntSize.m7139constructorimpl((((long) width$iv2) << 32) | (((long) height$iv2) & 4294967295L)));
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints, null), multiParagraph, size, null);
    }
}
