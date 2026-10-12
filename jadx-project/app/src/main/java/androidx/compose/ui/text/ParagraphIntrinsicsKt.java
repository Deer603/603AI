package androidx.compose.ui.text;

import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: ParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aT\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001aT\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001aR\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\b0\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007¨\u0006\u0014"}, d2 = {"ParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "annotations", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ParagraphIntrinsicsKt {
    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String r6, TextStyle r7, List r8, List r9, Density r10, Font.ResourceLoader r11, int r12, Object r13) {
        if ((r12 & 4) == 0) goto L5;
        List r2 = CollectionsKt.emptyList();
    L7:
        if ((r12 & 8) == 0) goto L9;
        List r3 = CollectionsKt.emptyList();
    L11:
        return ParagraphIntrinsics(r6, r7, r2, r3, r10, r11);
    L9:
        r3 = r9;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    @Deprecated(message = "Font.ResourceLoader is deprecated, instead use FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "ParagraphIntrinsics(text, style, spanStyles, placeholders, density, fontFamilyResolver", imports = {}))
    public static final ParagraphIntrinsics ParagraphIntrinsics(String text, TextStyle style, List<AnnotatedString.Range<SpanStyle>> r8, List<AnnotatedString.Range<Placeholder>> r9, Density density, Font.ResourceLoader resourceLoader) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(text, style, r8, r9, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String r6, TextStyle r7, List r8, List r9, Density r10, FontFamily.Resolver r11, int r12, Object r13) {
        if ((r12 & 4) == 0) goto L5;
        List r2 = CollectionsKt.emptyList();
    L7:
        if ((r12 & 8) == 0) goto L9;
        List r3 = CollectionsKt.emptyList();
    L11:
        return ParagraphIntrinsics(r6, r7, r2, r3, r10, r11);
    L9:
        r3 = r9;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    @Deprecated(message = "Use an overload that takes `annotations` instead", replaceWith = @ReplaceWith(expression = "ParagraphIntrinsics(text, style, spanStyles, density, fontFamilyResolver, placeholders)", imports = {}))
    public static final ParagraphIntrinsics ParagraphIntrinsics(String text, TextStyle style, List<AnnotatedString.Range<SpanStyle>> r3, List<AnnotatedString.Range<Placeholder>> r4, Density density, FontFamily.Resolver fontFamilyResolver) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(text, style, r3, r4, density, fontFamilyResolver);
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String r6, TextStyle r7, List r8, Density r9, FontFamily.Resolver r10, List r11, int r12, Object r13) {
        if ((r12 & 32) == 0) goto L5;
        List r5 = CollectionsKt.emptyList();
    L7:
        return ParagraphIntrinsics(r6, r7, r8, r9, r10, r5);
    L5:
        r5 = r11;
        goto L7
    }

    public static final ParagraphIntrinsics ParagraphIntrinsics(String text, TextStyle style, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> r4, Density density, FontFamily.Resolver fontFamilyResolver, List<AnnotatedString.Range<Placeholder>> r7) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(text, style, r4, r7, density, fontFamilyResolver);
    }
}
