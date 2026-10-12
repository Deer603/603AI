package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: Paragraph.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001ax\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001az\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001ap\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001ap\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0007\u001a\f\u0010'\u001a\u00020\u0001*\u00020\u0012H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"DefaultMaxLines", "", "Paragraph", "Landroidx/compose/ui/text/Paragraph;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "maxLines", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "Paragraph-czeN-Hc", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JII)Landroidx/compose/ui/text/Paragraph;", "ellipsis", "", "Paragraph-_EkL_-Y", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JIZ)Landroidx/compose/ui/text/Paragraph;", "width", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "Paragraph-Ul8oQg4", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;II)Landroidx/compose/ui/text/Paragraph;", "Paragraph-UdtVg6A", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;IZ)Landroidx/compose/ui/text/Paragraph;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ceilToInt", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    public static /* synthetic */ Paragraph Paragraph$default(String r9, TextStyle r10, List r11, List r12, int r13, boolean r14, float r15, Density r16, Font.ResourceLoader r17, int r18, Object r19) {
        if ((r18 & 4) == 0) goto L5;
        List r2 = CollectionsKt.emptyList();
    L7:
        if ((r18 & 8) == 0) goto L9;
        List r3 = CollectionsKt.emptyList();
    L11:
        if ((r18 & 16) == 0) goto L13;
        int r4 = Integer.MAX_VALUE;
    L15:
        if ((r18 & 32) == 0) goto L17;
        boolean r5 = false;
    L19:
        return Paragraph(r9, r10, r2, r3, r4, r5, r15, r16, r17);
    L17:
        r5 = r14;
        goto L19
    L13:
        r4 = r13;
        goto L15
    L9:
        r3 = r12;
        goto L11
    L5:
        r2 = r11;
        goto L7
    }

    @Deprecated(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public static final Paragraph Paragraph(String text, TextStyle style, List<AnnotatedString.Range<SpanStyle>> r3, List<AnnotatedString.Range<Placeholder>> r4, int maxLines, boolean ellipsis, float width, Density density, Font.ResourceLoader resourceLoader) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.ActualParagraph(text, style, r3, r4, maxLines, ellipsis, width, density, resourceLoader);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String r11, TextStyle r12, float r13, Density r14, FontFamily.Resolver r15, List r16, List r17, int r18, boolean r19, int r20, Object r21) {
        if ((r20 & 32) == 0) goto L5;
        List r7 = CollectionsKt.emptyList();
    L7:
        if ((r20 & 64) == 0) goto L9;
        List r8 = CollectionsKt.emptyList();
    L11:
        if ((r20 & 128) == 0) goto L13;
        int r9 = Integer.MAX_VALUE;
    L15:
        if ((r20 & 256) == 0) goto L17;
        boolean r10 = false;
    L19:
        return Paragraph(r11, r12, r13, r14, r15, r7, r8, r9, r10);
    L17:
        r10 = r19;
        goto L19
    L13:
        r9 = r18;
        goto L15
    L9:
        r8 = r17;
        goto L11
    L5:
        r7 = r16;
        goto L7
    }

    @Deprecated(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final Paragraph Paragraph(String text, TextStyle style, float width, Density density, FontFamily.Resolver fontFamilyResolver, List<AnnotatedString.Range<SpanStyle>> r16, List<AnnotatedString.Range<Placeholder>> r17, int maxLines, boolean ellipsis) {
        TextOverflow.Companion r0 = TextOverflow.Companion;
        if (ellipsis == false) goto L5;
        int r1 = r0.m6887getEllipsisgIe3tQ8();
    L7:
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6677ActualParagraphXGqx6AY(text, style, r16, r17, maxLines, r1, ConstraintsKt.Constraints$default(0, ceilToInt(width), 0, 0, 13, null), density, fontFamilyResolver);
    L5:
        r1 = r0.m6886getClipgIe3tQ8();
        goto L7
    }

    /* JADX INFO: renamed from: Paragraph-UdtVg6A$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m6285ParagraphUdtVg6A$default(String r12, TextStyle r13, long r14, Density r16, FontFamily.Resolver r17, List r18, List r19, int r20, boolean r21, int r22, Object r23) {
        if ((r22 & 32) == 0) goto L5;
        List r8 = CollectionsKt.emptyList();
    L7:
        if ((r22 & 64) == 0) goto L9;
        List r9 = CollectionsKt.emptyList();
    L11:
        if ((r22 & 128) == 0) goto L13;
        int r10 = Integer.MAX_VALUE;
    L15:
        if ((r22 & 256) == 0) goto L17;
        boolean r11 = false;
    L19:
        return m6284ParagraphUdtVg6A(r12, r13, r14, r16, r17, r8, r9, r10, r11);
    L17:
        r11 = r21;
        goto L19
    L13:
        r10 = r20;
        goto L15
    L9:
        r9 = r19;
        goto L11
    L5:
        r8 = r18;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Paragraph that takes `ellipsis: Boolean` is deprecated, pass TextOverflow instead.")
    /* JADX INFO: renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final /* synthetic */ Paragraph m6284ParagraphUdtVg6A(String text, TextStyle style, long constraints, Density density, FontFamily.Resolver fontFamilyResolver, List spanStyles, List placeholders, int maxLines, boolean ellipsis) {
        TextOverflow.Companion r0 = TextOverflow.Companion;
        if (ellipsis == false) goto L5;
        int r1 = r0.m6887getEllipsisgIe3tQ8();
    L7:
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6677ActualParagraphXGqx6AY(text, style, spanStyles, placeholders, maxLines, r1, constraints, density, fontFamilyResolver);
    L5:
        r1 = r0.m6886getClipgIe3tQ8();
        goto L7
    }

    /* JADX INFO: renamed from: Paragraph-Ul8oQg4$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m6287ParagraphUl8oQg4$default(String r12, TextStyle r13, long r14, Density r16, FontFamily.Resolver r17, List r18, List r19, int r20, int r21, int r22, Object r23) {
        if ((r22 & 32) == 0) goto L5;
        List r8 = CollectionsKt.emptyList();
    L7:
        if ((r22 & 64) == 0) goto L9;
        List r9 = CollectionsKt.emptyList();
    L11:
        if ((r22 & 128) == 0) goto L13;
        int r10 = Integer.MAX_VALUE;
    L15:
        if ((r22 & 256) == 0) goto L17;
        int r11 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L19:
        return m6286ParagraphUl8oQg4(r12, r13, r14, r16, r17, r8, r9, r10, r11);
    L17:
        r11 = r21;
        goto L19
    L13:
        r10 = r20;
        goto L15
    L9:
        r9 = r19;
        goto L11
    L5:
        r8 = r18;
        goto L7
    }

    /* JADX INFO: renamed from: Paragraph-Ul8oQg4, reason: not valid java name */
    public static final Paragraph m6286ParagraphUl8oQg4(String text, TextStyle style, long constraints, Density density, FontFamily.Resolver fontFamilyResolver, List<AnnotatedString.Range<SpanStyle>> r9, List<AnnotatedString.Range<Placeholder>> r10, int maxLines, int overflow) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6677ActualParagraphXGqx6AY(text, style, r9, r10, maxLines, overflow, constraints, density, fontFamilyResolver);
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics r0, int r1, boolean r2, float r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r1 = Integer.MAX_VALUE;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r2 = false;
    L9:
        return Paragraph(r0, r1, r2, r3);
    }

    @Deprecated(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final Paragraph Paragraph(ParagraphIntrinsics paragraphIntrinsics, int maxLines, boolean ellipsis, float width) {
        TextOverflow.Companion r0 = TextOverflow.Companion;
        if (ellipsis == false) goto L5;
        int r1 = r0.m6887getEllipsisgIe3tQ8();
    L7:
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6676ActualParagraph4FmOz70(paragraphIntrinsics, maxLines, r1, ConstraintsKt.Constraints$default(0, ceilToInt(width), 0, 0, 13, null));
    L5:
        r1 = r0.m6886getClipgIe3tQ8();
        goto L7
    }

    /* JADX INFO: renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m6289Paragraph_EkL_Y$default(ParagraphIntrinsics r0, long r1, int r3, boolean r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = Integer.MAX_VALUE;
    L6:
        if ((r5 & 8) == 0) goto L9;
        r4 = false;
    L9:
        return m6288Paragraph_EkL_Y(r0, r1, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Paragraph that takes ellipsis: Boolean is deprecated, pass TextOverflow instead.", replaceWith = @ReplaceWith(expression = "Paragraph(paragraphIntrinsics, constraints, maxLines, if (ellipsis) TextOverflow.Ellipsis else TextOverflow.Clip", imports = {}))
    /* JADX INFO: renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final /* synthetic */ Paragraph m6288Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long constraints, int maxLines, boolean ellipsis) {
        TextOverflow.Companion r0 = TextOverflow.Companion;
        if (ellipsis == false) goto L5;
        int r1 = r0.m6887getEllipsisgIe3tQ8();
    L7:
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6676ActualParagraph4FmOz70(paragraphIntrinsics, maxLines, r1, constraints);
    L5:
        r1 = r0.m6886getClipgIe3tQ8();
        goto L7
    }

    /* JADX INFO: renamed from: Paragraph-czeN-Hc$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m6291ParagraphczeNHc$default(ParagraphIntrinsics r0, long r1, int r3, int r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = Integer.MAX_VALUE;
    L6:
        if ((r5 & 8) == 0) goto L9;
        r4 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L9:
        return m6290ParagraphczeNHc(r0, r1, r3, r4);
    }

    /* JADX INFO: renamed from: Paragraph-czeN-Hc, reason: not valid java name */
    public static final Paragraph m6290ParagraphczeNHc(ParagraphIntrinsics paragraphIntrinsics, long constraints, int maxLines, int overflow) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6676ActualParagraph4FmOz70(paragraphIntrinsics, maxLines, overflow, constraints);
    }

    public static final int ceilToInt(float $this$ceilToInt) {
        return (int) Math.ceil($this$ceilToInt);
    }
}
