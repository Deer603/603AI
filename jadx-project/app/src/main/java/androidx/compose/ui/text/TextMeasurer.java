package androidx.compose.ui.text;

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

/* JADX INFO: compiled from: TextMeasurer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u008a\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#Jt\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020$2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "defaultFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "defaultDensity", "Landroidx/compose/ui/unit/Density;", "defaultLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "cacheSize", "", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V", "textLayoutCache", "Landroidx/compose/ui/text/TextLayoutCache;", "measure", "Landroidx/compose/ui/text/TextLayoutResult;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "measure-xDpz5zY", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "", "measure-wNUYSr0", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextMeasurer {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private final int cacheSize;
    private final Density defaultDensity;
    private final FontFamily.Resolver defaultFontFamilyResolver;
    private final LayoutDirection defaultLayoutDirection;
    private final TextLayoutCache textLayoutCache;

    /* JADX INFO: compiled from: TextMeasurer.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "()V", "layout", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ TextLayoutResult access$layout(Companion $this, TextLayoutInput textLayoutInput) {
            return $this.layout(textLayoutInput);
        }

        private final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            MultiParagraphIntrinsics nonNullIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int minWidth = Constraints.m6928getMinWidthimpl(textLayoutInput.m6383getConstraintsmsEJaDk());
            int r5 = 1;
            if (textLayoutInput.getSoftWrap() == false) goto L5;
        L8:
            boolean r3 = true;
        L9:
            boolean widthMatters = r3;
            if (widthMatters == true) goto L12;
        L14:
            int r4 = Integer.MAX_VALUE;
        L15:
            int maxWidth = r4;
            if (textLayoutInput.getSoftWrap() == false) goto L18;
        L20:
            boolean r6 = false;
        L21:
            boolean overwriteMaxLines = r6;
            if (overwriteMaxLines == true) goto L25;
            r5 = textLayoutInput.getMaxLines();
        L25:
            int finalMaxLines = r5;
            if (minWidth != maxWidth) goto L28;
            int r7 = maxWidth;
        L29:
            int width = r7;
            MultiParagraph multiParagraph = new MultiParagraph(nonNullIntrinsics, Constraints.Companion.m6935fitPrioritizingWidthZbe2FdA(0, width, 0, Constraints.m6925getMaxHeightimpl(textLayoutInput.m6383getConstraintsmsEJaDk())), finalMaxLines, textLayoutInput.m6384getOverflowgIe3tQ8(), null);
            long r8 = textLayoutInput.m6383getConstraintsmsEJaDk();
            int width$iv = (int) Math.ceil(multiParagraph.getWidth());
            int height$iv = (int) Math.ceil(multiParagraph.getHeight());
            return new TextLayoutResult(textLayoutInput, multiParagraph, ConstraintsKt.m6940constrain4WqzIAM(r8, IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L))), null);
        L28:
            r7 = RangesKt.coerceIn(ParagraphKt.ceilToInt(nonNullIntrinsics.getMaxIntrinsicWidth()), minWidth, maxWidth);
            goto L29
        L18:
            if (TextMeasurerKt.m6394access$isEllipsisMW5ApA(textLayoutInput.m6384getOverflowgIe3tQ8()) == false) goto L20;
            r6 = true;
            goto L21
        L12:
            if (Constraints.m6922getHasBoundedWidthimpl(textLayoutInput.m6383getConstraintsmsEJaDk()) == false) goto L14;
            r4 = Constraints.m6926getMaxWidthimpl(textLayoutInput.m6383getConstraintsmsEJaDk());
            goto L15
        L5:
            if (TextMeasurerKt.m6394access$isEllipsisMW5ApA(textLayoutInput.m6384getOverflowgIe3tQ8()) == true) goto L8;
            r3 = false;
            goto L9
        }
    }

    static {
        Companion = new Companion(null);
    }

    public TextMeasurer(FontFamily.Resolver defaultFontFamilyResolver, Density defaultDensity, LayoutDirection defaultLayoutDirection, int cacheSize) {
        this.defaultFontFamilyResolver = defaultFontFamilyResolver;
        this.defaultDensity = defaultDensity;
        this.defaultLayoutDirection = defaultLayoutDirection;
        this.cacheSize = cacheSize;
        if (this.cacheSize <= 0) goto L5;
        TextLayoutCache r0 = new TextLayoutCache(this.cacheSize);
    L6:
        this.textLayoutCache = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver r1, Density r2, LayoutDirection r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = 8;
    L5:
        this(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m6391measurexDpz5zY$default(TextMeasurer r13, AnnotatedString r14, TextStyle r15, int r16, boolean r17, int r18, List r19, long r20, LayoutDirection r22, Density r23, FontFamily.Resolver r24, boolean r25, int r26, Object r27) {
        if ((r26 & 2) == 0) goto L5;
        TextStyle r2 = TextStyle.Companion.getDefault();
    L7:
        if ((r26 & 4) == 0) goto L9;
        int r3 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L11:
        if ((r26 & 8) == 0) goto L13;
        boolean r4 = true;
    L15:
        if ((r26 & 16) == 0) goto L17;
        int r5 = Integer.MAX_VALUE;
    L19:
        if ((r26 & 32) == 0) goto L21;
        List r6 = CollectionsKt.emptyList();
    L23:
        if ((r26 & 64) == 0) goto L25;
        long r7 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    L27:
        if ((r26 & 128) == 0) goto L29;
        LayoutDirection r9 = r13.defaultLayoutDirection;
    L31:
        if ((r26 & 256) == 0) goto L33;
        Density r10 = r13.defaultDensity;
    L35:
        if ((r26 & 512) == 0) goto L37;
        FontFamily.Resolver r11 = r13.defaultFontFamilyResolver;
    L39:
        if ((r26 & 1024) == 0) goto L41;
        boolean r12 = false;
    L43:
        return r13.m6393measurexDpz5zY(r14, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12);
    L41:
        r12 = r25;
        goto L43
    L37:
        r11 = r24;
        goto L39
    L33:
        r10 = r23;
        goto L35
    L29:
        r9 = r22;
        goto L31
    L25:
        r7 = r20;
        goto L27
    L21:
        r6 = r19;
        goto L23
    L17:
        r5 = r18;
        goto L19
    L13:
        r4 = r17;
        goto L15
    L9:
        r3 = r16;
        goto L11
    L5:
        r2 = r15;
        goto L7
    }

    /* JADX INFO: renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m6393measurexDpz5zY(AnnotatedString text, TextStyle style, int overflow, boolean softWrap, int maxLines, List<AnnotatedString.Range<Placeholder>> r19, long constraints, LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
        TextLayoutInput requestedTextLayoutInput = new TextLayoutInput(text, style, r19, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints, null);
        if (skipCache == false) goto L5;
    L7:
        TextLayoutResult cacheResult = null;
    L9:
        if (cacheResult == null) goto L11;
        int width$iv = ParagraphKt.ceilToInt(cacheResult.getMultiParagraph().getWidth());
        int height$iv = ParagraphKt.ceilToInt(cacheResult.getMultiParagraph().getHeight());
        return cacheResult.m6386copyO0kMr_c(requestedTextLayoutInput, ConstraintsKt.m6940constrain4WqzIAM(constraints, IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L))));
    L11:
        TextLayoutResult it = Companion.access$layout(Companion, requestedTextLayoutInput);
        TextLayoutCache r5 = this.textLayoutCache;
        if (r5 == null) goto L17;
        r5.put(requestedTextLayoutInput, it);
        return it;
    L17:
        return it;
    L5:
        if (this.textLayoutCache == null) goto L7;
        cacheResult = this.textLayoutCache.get(requestedTextLayoutInput);
        goto L9
    }

    /* JADX INFO: renamed from: measure-wNUYSr0$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m6390measurewNUYSr0$default(TextMeasurer r12, String r13, TextStyle r14, int r15, boolean r16, int r17, long r18, LayoutDirection r20, Density r21, FontFamily.Resolver r22, boolean r23, int r24, Object r25) {
        if ((r24 & 2) == 0) goto L5;
        TextStyle r2 = TextStyle.Companion.getDefault();
    L7:
        if ((r24 & 4) == 0) goto L9;
        int r3 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L11:
        if ((r24 & 8) == 0) goto L13;
        boolean r4 = true;
    L15:
        if ((r24 & 16) == 0) goto L17;
        int r5 = Integer.MAX_VALUE;
    L19:
        if ((r24 & 32) == 0) goto L21;
        long r6 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    L23:
        if ((r24 & 64) == 0) goto L25;
        LayoutDirection r8 = r12.defaultLayoutDirection;
    L27:
        if ((r24 & 128) == 0) goto L29;
        Density r9 = r12.defaultDensity;
    L31:
        if ((r24 & 256) == 0) goto L33;
        FontFamily.Resolver r10 = r12.defaultFontFamilyResolver;
    L35:
        if ((r24 & 512) == 0) goto L37;
        boolean r11 = false;
    L39:
        return r12.m6392measurewNUYSr0(r13, r2, r3, r4, r5, r6, r8, r9, r10, r11);
    L37:
        r11 = r23;
        goto L39
    L33:
        r10 = r22;
        goto L35
    L29:
        r9 = r21;
        goto L31
    L25:
        r8 = r20;
        goto L27
    L21:
        r6 = r18;
        goto L23
    L17:
        r5 = r17;
        goto L19
    L13:
        r4 = r16;
        goto L15
    L9:
        r3 = r15;
        goto L11
    L5:
        r2 = r14;
        goto L7
    }

    /* JADX INFO: renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m6392measurewNUYSr0(String text, TextStyle style, int overflow, boolean softWrap, int maxLines, long constraints, LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
        return m6391measurexDpz5zY$default(this, new AnnotatedString(text, null, 2, null), style, overflow, softWrap, maxLines, null, constraints, layoutDirection, density, fontFamilyResolver, skipCache, 32, null);
    }
}
