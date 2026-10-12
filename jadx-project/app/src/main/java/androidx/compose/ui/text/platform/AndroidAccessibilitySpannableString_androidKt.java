package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidAccessibilitySpannableString.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a$\u0010\f\u001a\u00020\u0002*\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¨\u0006\u0014"}, d2 = {"setSpanStyle", "", "Landroid/text/SpannableString;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "start", "", "end", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "toAccessibilitySpannableString", "Landroidx/compose/ui/text/AnnotatedString;", "urlSpanCache", "Landroidx/compose/ui/text/platform/URLSpanCache;", "toUrlLink", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "Landroidx/compose/ui/text/LinkAnnotation;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidAccessibilitySpannableString_androidKt {
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString $this$toAccessibilitySpannableString, Density density, FontFamily.Resolver fontFamilyResolver, URLSpanCache urlSpanCache) {
        SpannableString spannableString = new SpannableString($this$toAccessibilitySpannableString.getText());
        List<AnnotatedString.Range<SpanStyle>> r2 = $this$toAccessibilitySpannableString.getSpanStylesOrNull$ui_text_release();
        if (r2 == null) goto L8;
        int r10 = r2.size();
        int index$iv = 0;
    L5:
        if (index$iv >= r10) goto L8;
        Object item$iv = r2.get(index$iv);
        AnnotatedString.Range<SpanStyle> r5 = (AnnotatedString.Range) item$iv;
        SpanStyle style = r5.component1();
        int start = r5.component2();
        int end = r5.component3();
        SpanStyle noFontStyle = SpanStyle.m6349copyGSF8kmg$default(style, 0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 65503, null);
        setSpanStyle(spannableString, noFontStyle, start, end, density, fontFamilyResolver);
        index$iv = index$iv + 1;
    L8:
        List<AnnotatedString.Range<TtsAnnotation>> r3 = $this$toAccessibilitySpannableString.getTtsAnnotations(0, $this$toAccessibilitySpannableString.length());
        int index$iv2 = 0;
        int r7 = r3.size();
    L10:
        if (index$iv2 >= r7) goto L12;
        Object item$iv2 = r3.get(index$iv2);
        AnnotatedString.Range<TtsAnnotation> r11 = (AnnotatedString.Range) item$iv2;
        TtsAnnotation ttsAnnotation = r11.component1();
        int start2 = r11.component2();
        int end2 = r11.component3();
        spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan(ttsAnnotation), start2, end2, 33);
        index$iv2 = index$iv2 + 1;
        goto L10
    L12:
        List<AnnotatedString.Range<UrlAnnotation>> r4 = $this$toAccessibilitySpannableString.getUrlAnnotations(0, $this$toAccessibilitySpannableString.length());
        int index$iv3 = 0;
        int r8 = r4.size();
    L13:
        if (index$iv3 >= r8) goto L15;
        Object item$iv3 = r4.get(index$iv3);
        AnnotatedString.Range<UrlAnnotation> r12 = (AnnotatedString.Range) item$iv3;
        UrlAnnotation urlAnnotation = r12.component1();
        int start3 = r12.component2();
        int end3 = r12.component3();
        spannableString.setSpan(urlSpanCache.toURLSpan(urlAnnotation), start3, end3, 33);
        index$iv3 = index$iv3 + 1;
        goto L13
    L15:
        List<AnnotatedString.Range<LinkAnnotation>> r6 = $this$toAccessibilitySpannableString.getLinkAnnotations(0, $this$toAccessibilitySpannableString.length());
        int index$iv4 = 0;
        int r9 = r6.size();
    L16:
        if (index$iv4 >= r9) goto L27;
        Object item$iv4 = r6.get(index$iv4);
        AnnotatedString.Range<LinkAnnotation> r13 = (AnnotatedString.Range) item$iv4;
        if (r13.getStart() == r13.getEnd()) goto L25;
        LinkAnnotation link = r13.getItem();
        if ((link instanceof LinkAnnotation.Url) == true) goto L22;
    L24:
        spannableString.setSpan(urlSpanCache.toClickableSpan(r13), r13.getStart(), r13.getEnd(), 33);
        goto L25
    L22:
        if (link.getLinkInteractionListener() != null) goto L24;
        spannableString.setSpan(urlSpanCache.toURLSpan(toUrlLink(r13)), r13.getStart(), r13.getEnd(), 33);
    L25:
        index$iv4 = index$iv4 + 1;
        goto L16
    L27:
        return spannableString;
    }

    private static final void setSpanStyle(SpannableString $this$setSpanStyle, SpanStyle spanStyle, int start, int end, Density density, FontFamily.Resolver fontFamilyResolver) {
        SpannableExtensions_androidKt.m6696setColorRPmYEkk($this$setSpanStyle, spanStyle.m6358getColor0d7_KjU(), start, end);
        SpannableExtensions_androidKt.m6697setFontSizeKmRG4DE($this$setSpanStyle, spanStyle.m6359getFontSizeXSAIIZE(), density, start, end);
        if (spanStyle.getFontWeight() == null) goto L5;
    L6:
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) goto L9;
        fontWeight = FontWeight.Companion.getNormal();
    L9:
        FontStyle r2 = spanStyle.m6360getFontStyle4Lr2A7w();
        if (r2 == null) goto L12;
        int fontStyle = r2.m6531unboximpl();
    L13:
        $this$setSpanStyle.setSpan(new StyleSpan(AndroidFontUtils_androidKt.m6480getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle)), start, end, 33);
    L15:
        if (spanStyle.getFontFamily() == null) goto L27;
        if ((spanStyle.getFontFamily() instanceof GenericFontFamily) == false) goto L20;
        $this$setSpanStyle.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName()), start, end, 33);
        goto L27
    L20:
        if (Build.VERSION.SDK_INT < 28) goto L27;
        FontFamily r7 = spanStyle.getFontFamily();
        FontSynthesis r0 = spanStyle.m6361getFontSynthesisZQGJjVo();
        if (r0 == null) goto L24;
        int r1 = r0.m6544unboximpl();
    L25:
        Object r3 = FontFamily.Resolver.m6500resolveDPcqOEQ$default(fontFamilyResolver, r7, null, 0, r1, 6, null).getValue();
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type android.graphics.Typeface");
        Typeface typeface = (Typeface) r3;
        $this$setSpanStyle.setSpan(Api28Impl.INSTANCE.createTypefaceSpan(typeface), start, end, 33);
        goto L27
    L24:
        r1 = FontSynthesis.Companion.m6545getAllGVVA2EU();
    L27:
        if (spanStyle.getTextDecoration() == null) goto L35;
        if (spanStyle.getTextDecoration().contains(TextDecoration.Companion.getUnderline()) == false) goto L32;
        $this$setSpanStyle.setSpan(new UnderlineSpan(), start, end, 33);
    L32:
        if (spanStyle.getTextDecoration().contains(TextDecoration.Companion.getLineThrough()) == false) goto L35;
        $this$setSpanStyle.setSpan(new StrikethroughSpan(), start, end, 33);
    L35:
        if (spanStyle.getTextGeometricTransform() == null) goto L37;
        $this$setSpanStyle.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), start, end, 33);
    L37:
        SpannableExtensions_androidKt.setLocaleList($this$setSpanStyle, spanStyle.getLocaleList(), start, end);
        SpannableExtensions_androidKt.m6694setBackgroundRPmYEkk($this$setSpanStyle, spanStyle.m6356getBackground0d7_KjU(), start, end);
        return;
    L12:
        fontStyle = FontStyle.Companion.m6535getNormal_LCdwA();
        goto L13
    L5:
        if (spanStyle.m6360getFontStyle4Lr2A7w() == null) goto L15;
        goto L6
    }

    private static final AnnotatedString.Range<LinkAnnotation.Url> toUrlLink(AnnotatedString.Range<LinkAnnotation> r4) {
        LinkAnnotation r1 = r4.getItem();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new AnnotatedString.Range((LinkAnnotation.Url) r1, r4.getStart(), r4.getEnd());
    }
}
