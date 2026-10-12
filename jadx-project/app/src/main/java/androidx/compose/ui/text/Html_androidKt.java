package androidx.compose.ui.text;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.text.HtmlCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Html.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000i\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0005\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002\u001a8\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002\u001a(\u0010\u0017\u001a\u00020\f*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002\u001a*\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u001a$\u0010\u001e\u001a\u00020\u001b*\u00020\u00192\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0001\u001a\f\u0010\u001f\u001a\u00020 *\u00020!H\u0002\u001a\u000e\u0010\"\u001a\u0004\u0018\u00010#*\u00020$H\u0002\u001a\f\u0010\"\u001a\u00020#*\u00020%H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"AnnotationTag", "", Html_androidKt.ContentHandlerReplacementTag, "Li", "TagHandler", "androidx/compose/ui/text/Html_androidKt$TagHandler$1", "Landroidx/compose/ui/text/Html_androidKt$TagHandler$1;", "Ul", "optionalFontFamilyFromName", "Landroidx/compose/ui/text/font/FontFamily;", "familyName", "addSpan", "", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "span", "", "start", "", "end", "linkStyles", "Landroidx/compose/ui/text/TextLinkStyles;", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "addSpans", "spanned", "Landroid/text/Spanned;", "fromHtml", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/AnnotatedString$Companion;", "htmlString", "toAnnotatedString", "toParagraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "Landroid/text/style/AlignmentSpan;", "toSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "Landroid/text/style/StyleSpan;", "Landroid/text/style/TypefaceSpan;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Html_androidKt {
    private static final String AnnotationTag = "annotation";
    private static final String ContentHandlerReplacementTag = "ContentHandlerReplacementTag";
    private static final String Li = "li";
    private static final Html_androidKt$TagHandler$1 TagHandler = null;
    private static final String Ul = "ul";

    /* JADX INFO: compiled from: Html.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Layout.Alignment.values().length];
            r0[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static /* synthetic */ AnnotatedString fromHtml$default(AnnotatedString.Companion r1, String r2, TextLinkStyles r3, LinkInteractionListener r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = null;
    L9:
        return fromHtml(r1, r2, r3, r4);
    }

    public static final AnnotatedString fromHtml(AnnotatedString.Companion $this$fromHtml, String htmlString, TextLinkStyles linkStyles, LinkInteractionListener linkInteractionListener) {
        String stringToParse = "<ContentHandlerReplacementTag />" + htmlString;
        Spanned spanned = HtmlCompat.fromHtml(stringToParse, 63, null, TagHandler);
        return toAnnotatedString(spanned, linkStyles, linkInteractionListener);
    }

    public static /* synthetic */ AnnotatedString toAnnotatedString$default(Spanned r1, TextLinkStyles r2, LinkInteractionListener r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r3 = null;
    L9:
        return toAnnotatedString(r1, r2, r3);
    }

    public static final AnnotatedString toAnnotatedString(Spanned $this$toAnnotatedString, TextLinkStyles linkStyles, LinkInteractionListener linkInteractionListener) {
        AnnotatedString.Builder it = new AnnotatedString.Builder($this$toAnnotatedString.length()).append($this$toAnnotatedString);
        addSpans(it, $this$toAnnotatedString, linkStyles, linkInteractionListener);
        return it.toAnnotatedString();
    }

    private static final void addSpans(AnnotatedString.Builder $this$addSpans, Spanned spanned, TextLinkStyles linkStyles, LinkInteractionListener linkInteractionListener) {
        int r3 = 0;
        Object[] $this$forEach$iv = spanned.getSpans(0, $this$addSpans.getLength(), Object.class);
        int r4 = $this$forEach$iv.length;
    L3:
        if (r3 >= r4) goto L6;
        Object element$iv = $this$forEach$iv[r3];
        long range = TextRangeKt.TextRange(spanned.getSpanStart(element$iv), spanned.getSpanEnd(element$iv));
        addSpan($this$addSpans, element$iv, TextRange.m6417getStartimpl(range), TextRange.m6412getEndimpl(range), linkStyles, linkInteractionListener);
        r3 = r3 + 1;
        goto L3
    }

    private static final void addSpan(AnnotatedString.Builder $this$addSpan, Object span, int start, int end, TextLinkStyles linkStyles, LinkInteractionListener linkInteractionListener) {
        if ((span instanceof AbsoluteSizeSpan) == true) goto L52;
        if ((span instanceof AlignmentSpan) == false) goto L8;
        $this$addSpan.addStyle(toParagraphStyle((AlignmentSpan) span), start, end);
        return;
    L8:
        if ((span instanceof AnnotationSpan) == false) goto L11;
        $this$addSpan.addStringAnnotation(((AnnotationSpan) span).getKey(), ((AnnotationSpan) span).getValue(), start, end);
        return;
    L11:
        if ((span instanceof BackgroundColorSpan) == false) goto L14;
        $this$addSpan.addStyle(new SpanStyle(0, 0, null, null, null, null, null, 0, null, null, null, ColorKt.Color(((BackgroundColorSpan) span).getBackgroundColor()), null, null, null, null, 63487, null), start, end);
        return;
    L14:
        if ((span instanceof BulletSpanWithLevel) == false) goto L17;
        long arg0$iv = BulletKt.getDefaultBulletIndentation();
        int other$iv = ((BulletSpanWithLevel) span).getIndentationLevel();
        TextUnitKt.m7180checkArithmeticR2X_6o(arg0$iv);
        $this$addSpan.m6248addBulletr9BaKPg$ui_text_release(((BulletSpanWithLevel) span).getBullet(), TextUnitKt.pack(TextUnit.m7165getRawTypeimpl(arg0$iv), TextUnit.m7167getValueimpl(arg0$iv) * other$iv), start, end);
        return;
    L17:
        if ((span instanceof ForegroundColorSpan) == false) goto L20;
        $this$addSpan.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) span).getForegroundColor()), 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 65534, null), start, end);
        return;
    L20:
        if ((span instanceof RelativeSizeSpan) == false) goto L23;
        $this$addSpan.addStyle(new SpanStyle(0, TextUnitKt.getEm(((RelativeSizeSpan) span).getSizeChange()), null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 65533, null), start, end);
        return;
    L23:
        if ((span instanceof StrikethroughSpan) == false) goto L26;
        $this$addSpan.addStyle(new SpanStyle(0, 0, null, null, null, null, null, 0, null, null, null, 0, TextDecoration.Companion.getLineThrough(), null, null, null, 61439, null), start, end);
        return;
    L26:
        if ((span instanceof StyleSpan) == false) goto L32;
        SpanStyle it = toSpanStyle((StyleSpan) span);
        if (it == null) goto L61;
        $this$addSpan.addStyle(it, start, end);
        return;
    L61:
        return;
    L32:
        if ((span instanceof SubscriptSpan) == false) goto L35;
        $this$addSpan.addStyle(new SpanStyle(0, 0, null, null, null, null, null, 0, BaselineShift.m6707boximpl(BaselineShift.Companion.m6718getSubscripty9eOQZs()), null, null, 0, null, null, null, null, 65279, null), start, end);
        return;
    L35:
        if ((span instanceof SuperscriptSpan) == false) goto L38;
        $this$addSpan.addStyle(new SpanStyle(0, 0, null, null, null, null, null, 0, BaselineShift.m6707boximpl(BaselineShift.Companion.m6719getSuperscripty9eOQZs()), null, null, 0, null, null, null, null, 65279, null), start, end);
        return;
    L38:
        if ((span instanceof TypefaceSpan) == false) goto L41;
        $this$addSpan.addStyle(toSpanStyle((TypefaceSpan) span), start, end);
        return;
    L41:
        if ((span instanceof UnderlineSpan) == false) goto L44;
        $this$addSpan.addStyle(new SpanStyle(0, 0, null, null, null, null, null, 0, null, null, null, 0, TextDecoration.Companion.getUnderline(), null, null, null, 61439, null), start, end);
        return;
    L44:
        if ((span instanceof URLSpan) == false) goto L66;
        String url = ((URLSpan) span).getURL();
        if (url == null) goto L67;
        LinkAnnotation.Url link = new LinkAnnotation.Url(url, linkStyles, linkInteractionListener);
        $this$addSpan.addLink(link, start, end);
        return;
    L67:
        return;
    L66:
        return;
    }

    private static final ParagraphStyle toParagraphStyle(AlignmentSpan $this$toParagraphStyle) {
        Layout.Alignment r0 = $this$toParagraphStyle.getAlignment();
        if (r0 != null) goto L5;
        int r1 = -1;
    L6:
        switch(r1) {
            case 1: goto L10;
            case 2: goto L9;
            case 3: goto L8;
            default: goto L7;
        };
    L7:
        int r2 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
    L11:
        int alignment = r2;
        return new ParagraphStyle(alignment, 0, 0, null, null, null, 0, 0, null, 510, null);
    L8:
        r2 = TextAlign.Companion.m6836getEnde0LSkKk();
        goto L11
    L9:
        r2 = TextAlign.Companion.m6835getCentere0LSkKk();
        goto L11
    L10:
        r2 = TextAlign.Companion.m6840getStarte0LSkKk();
        goto L11
    L5:
        r1 = WhenMappings.$EnumSwitchMapping$0[r0.ordinal()];
        goto L6
    }

    private static final SpanStyle toSpanStyle(StyleSpan $this$toSpanStyle) {
        switch($this$toSpanStyle.getStyle()) {
            case 1: goto L8;
            case 2: goto L11;
            case 3: goto L10;
            default: goto L4;
        };
    L4:
        return null;
    L10:
        return new SpanStyle(0, 0, FontWeight.Companion.getBold(), FontStyle.m6525boximpl(FontStyle.Companion.m6534getItalic_LCdwA()), null, null, null, 0, null, null, null, 0, null, null, null, null, 65523, null);
    L11:
        return new SpanStyle(0, 0, null, FontStyle.m6525boximpl(FontStyle.Companion.m6534getItalic_LCdwA()), null, null, null, 0, null, null, null, 0, null, null, null, null, 65527, null);
    L8:
        return new SpanStyle(0, 0, FontWeight.Companion.getBold(), null, null, null, null, 0, null, null, null, 0, null, null, null, null, 65531, null);
    }

    private static final SpanStyle toSpanStyle(TypefaceSpan $this$toSpanStyle) {
        String r0 = $this$toSpanStyle.getFamily();
        if (Intrinsics.areEqual(r0, FontFamily.Companion.getCursive().getName()) == false) goto L6;
        GenericFontFamily r1 = FontFamily.Companion.getCursive();
    L15:
        FontFamily fontFamily = r1;
        return new SpanStyle(0, 0, null, null, null, fontFamily, null, 0, null, null, null, 0, null, null, null, null, 65503, null);
    L6:
        if (Intrinsics.areEqual(r0, FontFamily.Companion.getMonospace().getName()) == false) goto L9;
        r1 = FontFamily.Companion.getMonospace();
        goto L15
    L9:
        if (Intrinsics.areEqual(r0, FontFamily.Companion.getSansSerif().getName()) == false) goto L12;
        r1 = FontFamily.Companion.getSansSerif();
        goto L15
    L12:
        if (Intrinsics.areEqual(r0, FontFamily.Companion.getSerif().getName()) == false) goto L14;
        r1 = FontFamily.Companion.getSerif();
        goto L15
    L14:
        r1 = optionalFontFamilyFromName($this$toSpanStyle.getFamily());
        goto L15
    }

    private static final FontFamily optionalFontFamilyFromName(String familyName) {
        String r0 = familyName;
        boolean r1 = true;
        if (r0 != null) goto L5;
    L8:
        boolean r2 = true;
    L10:
        if (r2 == false) goto L12;
        return null;
    L12:
        Typeface typeface = Typeface.create(familyName, 0);
        if (Intrinsics.areEqual(typeface, Typeface.DEFAULT) == false) goto L15;
    L17:
        r1 = false;
    L18:
        if (r1 == false) goto L20;
        Typeface it = typeface;
    L21:
        if (it != null) goto L23;
        return null;
    L23:
        return AndroidTypeface_androidKt.FontFamily(it);
    L20:
        it = null;
        goto L21
    L15:
        if (Intrinsics.areEqual(typeface, Typeface.create(Typeface.DEFAULT, 0)) == true) goto L17;
    L5:
        if (r0.length() == 0) goto L8;
        r2 = false;
        goto L10
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.text.Html_androidKt$TagHandler$1] */
    static {
        TagHandler = new Html_androidKt$TagHandler$1();
    }
}
