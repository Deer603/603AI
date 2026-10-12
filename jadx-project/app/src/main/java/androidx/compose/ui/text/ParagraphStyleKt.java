package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ParagraphStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a&\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001af\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u0018\u0010\"\u001a\u0004\u0018\u00010\n*\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\nH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"DefaultLineHeight", "Landroidx/compose/ui/unit/TextUnit;", "J", "lerp", "Landroidx/compose/ui/text/ParagraphStyle;", "start", "stop", "fraction", "", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "resolveParagraphStyleDefaults", "style", "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "fastMerge", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "platformStyle", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "fastMerge-j5T8yCg", "(Landroidx/compose/ui/text/ParagraphStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "mergePlatformStyle", "other", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = 0;

    static {
        DefaultLineHeight = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    }

    public static final ParagraphStyle lerp(ParagraphStyle start, ParagraphStyle stop, float fraction) {
        int r1 = ((TextAlign) SpanStyleKt.lerpDiscrete(TextAlign.m6828boximpl(start.m6312getTextAligne0LSkKk()), TextAlign.m6828boximpl(stop.m6312getTextAligne0LSkKk()), fraction)).m6834unboximpl();
        int r2 = ((TextDirection) SpanStyleKt.lerpDiscrete(TextDirection.m6842boximpl(start.m6314getTextDirections_7Xco()), TextDirection.m6842boximpl(stop.m6314getTextDirections_7Xco()), fraction)).m6848unboximpl();
        long r3 = SpanStyleKt.m6364lerpTextUnitInheritableC3pnCVY(start.m6310getLineHeightXSAIIZE(), stop.m6310getLineHeightXSAIIZE(), fraction);
        TextIndent r5 = start.getTextIndent();
        if (r5 != null) goto L5;
        r5 = TextIndent.Companion.getNone();
    L5:
        TextIndent r6 = stop.getTextIndent();
        if (r6 != null) goto L9;
        r6 = TextIndent.Companion.getNone();
    L9:
        return new ParagraphStyle(r1, r2, r3, TextIndentKt.lerp(r5, r6, fraction), lerpPlatformStyle(start.getPlatformStyle(), stop.getPlatformStyle(), fraction), (LineHeightStyle) SpanStyleKt.lerpDiscrete(start.getLineHeightStyle(), stop.getLineHeightStyle(), fraction), ((LineBreak) SpanStyleKt.lerpDiscrete(LineBreak.m6736boximpl(start.m6309getLineBreakrAG3T2k()), LineBreak.m6736boximpl(stop.m6309getLineBreakrAG3T2k()), fraction)).m6748unboximpl(), ((Hyphens) SpanStyleKt.lerpDiscrete(Hyphens.m6726boximpl(start.m6307getHyphensvmbZdU8()), Hyphens.m6726boximpl(stop.m6307getHyphensvmbZdU8()), fraction)).m6732unboximpl(), (TextMotion) SpanStyleKt.lerpDiscrete(start.getTextMotion(), stop.getTextMotion(), fraction), null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle start, PlatformParagraphStyle stop, float fraction) {
        if (start != null) goto L6;
        if (stop != null) goto L6;
        return null;
    L6:
        if (start != null) goto L8;
        PlatformParagraphStyle startNonNull = PlatformParagraphStyle.Companion.getDefault();
    L9:
        if (stop != null) goto L11;
        PlatformParagraphStyle stopNonNull = PlatformParagraphStyle.Companion.getDefault();
    L13:
        return AndroidTextStyle_androidKt.lerp(startNonNull, stopNonNull, fraction);
    L11:
        stopNonNull = stop;
        goto L13
    L8:
        startNonNull = start;
        goto L9
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle style, LayoutDirection direction) {
        if (TextAlign.m6831equalsimpl0(style.m6312getTextAligne0LSkKk(), TextAlign.Companion.m6841getUnspecifiede0LSkKk()) == false) goto L5;
        int r1 = TextAlign.Companion.m6840getStarte0LSkKk();
    L6:
        int r2 = TextStyleKt.m6463resolveTextDirectionIhaHGbI(direction, style.m6314getTextDirections_7Xco());
        long $this$isUnspecified$iv = style.m6310getLineHeightXSAIIZE();
        if (TextUnit.m7165getRawTypeimpl($this$isUnspecified$iv) != 0) goto L9;
        boolean r6 = true;
    L10:
        if (r6 == false) goto L12;
        long r3 = DefaultLineHeight;
    L13:
        TextIndent r5 = style.getTextIndent();
        if (r5 != null) goto L16;
        r5 = TextIndent.Companion.getNone();
    L16:
        PlatformParagraphStyle r7 = style.getPlatformStyle();
        LineHeightStyle r8 = style.getLineHeightStyle();
        if (LineBreak.m6742equalsimpl0(style.m6309getLineBreakrAG3T2k(), LineBreak.Companion.m6756getUnspecifiedrAG3T2k()) == false) goto L19;
        int r9 = LineBreak.Companion.m6755getSimplerAG3T2k();
    L21:
        if (Hyphens.m6729equalsimpl0(style.m6307getHyphensvmbZdU8(), Hyphens.Companion.m6735getUnspecifiedvmbZdU8()) == false) goto L23;
        int r10 = Hyphens.Companion.m6734getNonevmbZdU8();
    L24:
        TextMotion r11 = style.getTextMotion();
        if (r11 != null) goto L28;
        r11 = TextMotion.Companion.getStatic();
    L28:
        return new ParagraphStyle(r1, r2, r3, r5, r7, r8, r9, r10, r11, null);
    L23:
        r10 = style.m6307getHyphensvmbZdU8();
        goto L24
    L19:
        r9 = style.m6309getLineBreakrAG3T2k();
        goto L21
    L12:
        r3 = style.m6310getLineHeightXSAIIZE();
        goto L13
    L9:
        r6 = false;
        goto L10
    L5:
        r1 = style.m6312getTextAligne0LSkKk();
        goto L6
    }

    /* JADX INFO: renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    public static final ParagraphStyle m6315fastMergej5T8yCg(ParagraphStyle $this$fastMerge_u2dj5T8yCg, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
        boolean r12 = true;
        if (TextAlign.m6831equalsimpl0(textAlign, TextAlign.Companion.m6841getUnspecifiede0LSkKk()) == true) goto L9;
        if (TextAlign.m6831equalsimpl0(textAlign, $this$fastMerge_u2dj5T8yCg.m6312getTextAligne0LSkKk()) == true) goto L9;
        long r16 = 0;
        long r10 = lineHeight;
    L42:
        boolean requiresAlloc = true;
    L45:
        if (requiresAlloc == true) goto L48;
        return $this$fastMerge_u2dj5T8yCg;
    L48:
        if (TextUnit.m7165getRawTypeimpl(lineHeight) == r16) goto L51;
        r12 = false;
    L51:
        if (r12 == false) goto L53;
        long r17 = $this$fastMerge_u2dj5T8yCg.m6310getLineHeightXSAIIZE();
    L55:
        if (textIndent != null) goto L57;
        TextIndent r19 = $this$fastMerge_u2dj5T8yCg.getTextIndent();
    L59:
        if (TextAlign.m6831equalsimpl0(textAlign, TextAlign.Companion.m6841getUnspecifiede0LSkKk()) == true) goto L61;
        int r15 = textAlign;
    L63:
        if (TextDirection.m6845equalsimpl0(textDirection, TextDirection.Companion.m6854getUnspecifieds_7Xco()) == true) goto L65;
        int r18 = textDirection;
    L66:
        PlatformParagraphStyle r20 = mergePlatformStyle($this$fastMerge_u2dj5T8yCg, platformStyle);
        if (lineHeightStyle != null) goto L69;
        LineHeightStyle r21 = $this$fastMerge_u2dj5T8yCg.getLineHeightStyle();
    L71:
        if (LineBreak.m6742equalsimpl0(lineBreak, LineBreak.Companion.m6756getUnspecifiedrAG3T2k()) == true) goto L73;
        int r22 = lineBreak;
    L75:
        if (Hyphens.m6729equalsimpl0(hyphens, Hyphens.Companion.m6735getUnspecifiedvmbZdU8()) == true) goto L77;
        int r23 = hyphens;
    L78:
        if (textMotion != null) goto L80;
        TextMotion r24 = $this$fastMerge_u2dj5T8yCg.getTextMotion();
    L82:
        return new ParagraphStyle(r15, r18, r17, r19, r20, r21, r22, r23, r24, null);
    L80:
        r24 = textMotion;
        goto L82
    L77:
        r23 = $this$fastMerge_u2dj5T8yCg.m6307getHyphensvmbZdU8();
        goto L78
    L73:
        r22 = $this$fastMerge_u2dj5T8yCg.m6309getLineBreakrAG3T2k();
        goto L75
    L69:
        r21 = lineHeightStyle;
        goto L71
    L65:
        r18 = $this$fastMerge_u2dj5T8yCg.m6314getTextDirections_7Xco();
        goto L66
    L61:
        r15 = $this$fastMerge_u2dj5T8yCg.m6312getTextAligne0LSkKk();
        goto L63
    L57:
        r19 = textIndent;
        goto L59
    L53:
        r17 = r10;
    L9:
        if (TextUnit.m7165getRawTypeimpl(lineHeight) != 0) goto L11;
        boolean r110 = true;
    L13:
        if (r110 == true) goto L17;
        r16 = 0;
        r10 = lineHeight;
        if (TextUnit.m7164equalsimpl0(r10, $this$fastMerge_u2dj5T8yCg.m6310getLineHeightXSAIIZE()) == false) goto L42;
    L18:
        if (textIndent == null) goto L22;
        if (Intrinsics.areEqual(textIndent, $this$fastMerge_u2dj5T8yCg.getTextIndent()) == false) goto L42;
    L22:
        if (TextDirection.m6845equalsimpl0(textDirection, TextDirection.Companion.m6854getUnspecifieds_7Xco()) == false) goto L24;
    L25:
        if (platformStyle != null) goto L27;
    L28:
        if (lineHeightStyle == null) goto L32;
        if (Intrinsics.areEqual(lineHeightStyle, $this$fastMerge_u2dj5T8yCg.getLineHeightStyle()) == false) goto L42;
    L32:
        if (LineBreak.m6742equalsimpl0(lineBreak, LineBreak.Companion.m6756getUnspecifiedrAG3T2k()) == true) goto L36;
        if (LineBreak.m6742equalsimpl0(lineBreak, $this$fastMerge_u2dj5T8yCg.m6309getLineBreakrAG3T2k()) == false) goto L42;
    L36:
        if (Hyphens.m6729equalsimpl0(hyphens, Hyphens.Companion.m6735getUnspecifiedvmbZdU8()) == false) goto L38;
    L39:
        if (textMotion != null) goto L41;
    L43:
        requiresAlloc = false;
        goto L45
    L41:
        if (Intrinsics.areEqual(textMotion, $this$fastMerge_u2dj5T8yCg.getTextMotion()) == true) goto L43;
    L38:
        if (Hyphens.m6729equalsimpl0(hyphens, $this$fastMerge_u2dj5T8yCg.m6307getHyphensvmbZdU8()) == false) goto L42;
    L27:
        if (Intrinsics.areEqual(platformStyle, $this$fastMerge_u2dj5T8yCg.getPlatformStyle()) == false) goto L42;
    L24:
        if (TextDirection.m6845equalsimpl0(textDirection, $this$fastMerge_u2dj5T8yCg.m6314getTextDirections_7Xco()) == false) goto L42;
    L17:
        r16 = 0;
        r10 = lineHeight;
        goto L18
    L11:
        r110 = false;
        goto L13
    }

    private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle $this$mergePlatformStyle, PlatformParagraphStyle other) {
        if ($this$mergePlatformStyle.getPlatformStyle() != null) goto L5;
        return other;
    L5:
        if (other != null) goto L9;
        return $this$mergePlatformStyle.getPlatformStyle();
    L9:
        return $this$mergePlatformStyle.getPlatformStyle().merge(other);
    }
}
