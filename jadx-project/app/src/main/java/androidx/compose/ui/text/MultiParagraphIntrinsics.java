package androidx.compose.ui.text;

import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B;\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0018\u0010&\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001fR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001b¨\u0006)"}, d2 = {"Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "hasStaleResolvedFonts", "", "getHasStaleResolvedFonts", "()Z", "infoList", "Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "getInfoList$ui_text_release", "()Ljava/util/List;", "maxIntrinsicWidth", "", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth$delegate", "Lkotlin/Lazy;", "minIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth$delegate", "getPlaceholders", "resolveTextDirection", "Landroidx/compose/ui/text/ParagraphStyle;", "defaultStyle", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 0;
    private final AnnotatedString annotatedString;
    private final List<ParagraphIntrinsicInfo> infoList;
    private final Lazy maxIntrinsicWidth$delegate;
    private final Lazy minIntrinsicWidth$delegate;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    static {
        $stable = 8;
    }

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle style, List<AnnotatedString.Range<Placeholder>> r35, Density density, FontFamily.Resolver fontFamilyResolver) {
        this.annotatedString = annotatedString;
        this.placeholders = r35;
        this.minIntrinsicWidth$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new MultiParagraphIntrinsics$minIntrinsicWidth$2(this));
        this.maxIntrinsicWidth$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new MultiParagraphIntrinsics$maxIntrinsicWidth$2(this));
        ParagraphStyle paragraphStyle = style.toParagraphStyle();
        AnnotatedString $this$mapEachParagraphStyle$iv = this.annotatedString;
        int $i$f$mapEachParagraphStyle = 0;
        List<AnnotatedString.Range<ParagraphStyle>> r6 = AnnotatedStringKt.normalizedParagraphStyles($this$mapEachParagraphStyle$iv, paragraphStyle);
        ArrayList target$iv$iv = new ArrayList(r6.size());
        int index$iv$iv$iv = 0;
        int r12 = r6.size();
    L3:
        if (index$iv$iv$iv >= r12) goto L8;
        Object item$iv$iv$iv = r6.get(index$iv$iv$iv);
        ArrayList r1 = target$iv$iv;
        AnnotatedString.Range<ParagraphStyle> r16 = (AnnotatedString.Range) item$iv$iv$iv;
        int r2 = r16.getStart();
        int $i$f$mapEachParagraphStyle2 = $i$f$mapEachParagraphStyle;
        int $i$f$mapEachParagraphStyle3 = r16.getEnd();
        AnnotatedString annotatedString$iv = AnnotatedStringKt.access$substringWithoutParagraphStyles($this$mapEachParagraphStyle$iv, r2, $i$f$mapEachParagraphStyle3);
        ParagraphStyle currentParagraphStyle = access$resolveTextDirection(this, r16.getItem(), paragraphStyle);
        ParagraphStyle paragraphStyle2 = paragraphStyle;
        String r23 = annotatedString$iv.getText();
        AnnotatedString $this$mapEachParagraphStyle$iv2 = $this$mapEachParagraphStyle$iv;
        TextStyle r24 = style.merge(currentParagraphStyle);
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> r25 = annotatedString$iv.getAnnotations$ui_text_release();
        if (r25 != null) goto L7;
        r25 = CollectionsKt.emptyList();
    L7:
        r1.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(r23, r24, r25, density, fontFamilyResolver, MultiParagraphIntrinsicsKt.access$getLocalPlaceholders(getPlaceholders(), r16.getStart(), r16.getEnd())), r16.getStart(), r16.getEnd()));
        index$iv$iv$iv = index$iv$iv$iv + 1;
        $i$f$mapEachParagraphStyle = $i$f$mapEachParagraphStyle2;
        paragraphStyle = paragraphStyle2;
        $this$mapEachParagraphStyle$iv = $this$mapEachParagraphStyle$iv2;
        goto L3
    L8:
        this.infoList = target$iv$iv;
    }

    public static final /* synthetic */ ParagraphStyle access$resolveTextDirection(MultiParagraphIntrinsics $this, ParagraphStyle style, ParagraphStyle defaultStyle) {
        return $this.resolveTextDirection(style, defaultStyle);
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    @Deprecated(message = "Font.ResourceLoader is deprecated, call with fontFamilyResolver", replaceWith = @ReplaceWith(expression = "MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver)", imports = {}))
    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle style, List<AnnotatedString.Range<Placeholder>> r9, Density density, Font.ResourceLoader resourceLoader) {
        this(annotatedString, style, r9, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth$delegate.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth$delegate.getValue()).floatValue();
    }

    public final List<ParagraphIntrinsicInfo> getInfoList$ui_text_release() {
        return this.infoList;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        List<ParagraphIntrinsicInfo> r0 = this.infoList;
        int index$iv$iv = 0;
        int r5 = r0.size();
    L3:
        if (index$iv$iv >= r5) goto L8;
        Object item$iv$iv = r0.get(index$iv$iv);
        ParagraphIntrinsicInfo it = (ParagraphIntrinsicInfo) item$iv$iv;
        if (it.getIntrinsics().getHasStaleResolvedFonts() == true) goto L6;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        return true;
    L8:
        return false;
    }

    private final ParagraphStyle resolveTextDirection(ParagraphStyle style, ParagraphStyle defaultStyle) {
        if (TextDirection.m6845equalsimpl0(style.m6314getTextDirections_7Xco(), TextDirection.Companion.m6854getUnspecifieds_7Xco()) == true) goto L6;
        return style;
    L6:
        return ParagraphStyle.m6296copyykzQM6k$default(style, 0, defaultStyle.m6314getTextDirections_7Xco(), 0, null, null, null, 0, 0, null, 509, null);
    }
}
