package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidParagraph.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001a\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\n\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001cH\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u0006*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002\u001a\u0016\u0010 \u001a\u00020\u0006*\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-aXe7zB0", "(I)I", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-xImikfE", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency--3fSNIE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-hpcqdu8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-wPN0Rpw", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "toLayoutTextGranularity", "Landroidx/compose/ui/text/TextGranularity;", "toLayoutTextGranularity-duNsdkg", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidParagraph_androidKt {
    public static final /* synthetic */ CharSequence access$attachIndentationFixSpan(CharSequence $receiver) {
        return attachIndentationFixSpan($receiver);
    }

    public static final /* synthetic */ int access$numberOfLinesThatFitMaxHeight(TextLayout $receiver, int maxHeight) {
        return numberOfLinesThatFitMaxHeight($receiver, maxHeight);
    }

    public static final /* synthetic */ boolean access$shouldAttachIndentationFixSpan(TextStyle textStyle, boolean ellipsis) {
        return shouldAttachIndentationFixSpan(textStyle, ellipsis);
    }

    /* JADX INFO: renamed from: access$toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final /* synthetic */ int m6234access$toLayoutAlignaXe7zB0(int align) {
        return m6240toLayoutAlignaXe7zB0(align);
    }

    /* JADX INFO: renamed from: access$toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final /* synthetic */ int m6235access$toLayoutBreakStrategyxImikfE(int breakStrategy) {
        return m6241toLayoutBreakStrategyxImikfE(breakStrategy);
    }

    /* JADX INFO: renamed from: access$toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final /* synthetic */ int m6236access$toLayoutHyphenationFrequency3fSNIE(int hyphens) {
        return m6242toLayoutHyphenationFrequency3fSNIE(hyphens);
    }

    /* JADX INFO: renamed from: access$toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final /* synthetic */ int m6237access$toLayoutLineBreakStylehpcqdu8(int lineBreakStrictness) {
        return m6243toLayoutLineBreakStylehpcqdu8(lineBreakStrictness);
    }

    /* JADX INFO: renamed from: access$toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final /* synthetic */ int m6238access$toLayoutLineBreakWordStylewPN0Rpw(int lineBreakWordStyle) {
        return m6244toLayoutLineBreakWordStylewPN0Rpw(lineBreakWordStyle);
    }

    /* JADX INFO: renamed from: access$toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final /* synthetic */ int m6239access$toLayoutTextGranularityduNsdkg(int $receiver) {
        return m6245toLayoutTextGranularityduNsdkg($receiver);
    }

    /* JADX INFO: renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    private static final int m6240toLayoutAlignaXe7zB0(int align) {
        if (TextAlign.m6831equalsimpl0(align, TextAlign.Companion.m6838getLefte0LSkKk()) == false) goto L6;
        return 3;
    L6:
        if (TextAlign.m6831equalsimpl0(align, TextAlign.Companion.m6839getRighte0LSkKk()) == false) goto L9;
        return 4;
    L9:
        if (TextAlign.m6831equalsimpl0(align, TextAlign.Companion.m6835getCentere0LSkKk()) == false) goto L12;
        return 2;
    L12:
        if (TextAlign.m6831equalsimpl0(align, TextAlign.Companion.m6840getStarte0LSkKk()) == false) goto L15;
        return 0;
    L15:
        if (TextAlign.m6831equalsimpl0(align, TextAlign.Companion.m6836getEnde0LSkKk()) == false) goto L18;
        return 1;
    L18:
        return 0;
    }

    /* JADX INFO: renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    private static final int m6242toLayoutHyphenationFrequency3fSNIE(int hyphens) {
        if (Hyphens.m6729equalsimpl0(hyphens, Hyphens.Companion.m6733getAutovmbZdU8()) == false) goto L9;
        if (Build.VERSION.SDK_INT > 32) goto L7;
        return 2;
    L7:
        return 4;
    L9:
        if (Hyphens.m6729equalsimpl0(hyphens, Hyphens.Companion.m6734getNonevmbZdU8()) == false) goto L12;
        return 0;
    L12:
        return 0;
    }

    /* JADX INFO: renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    private static final int m6241toLayoutBreakStrategyxImikfE(int breakStrategy) {
        if (LineBreak.Strategy.m6760equalsimpl0(breakStrategy, LineBreak.Strategy.Companion.m6766getSimplefcGXIks()) == false) goto L6;
        return 0;
    L6:
        if (LineBreak.Strategy.m6760equalsimpl0(breakStrategy, LineBreak.Strategy.Companion.m6765getHighQualityfcGXIks()) == false) goto L9;
        return 1;
    L9:
        if (LineBreak.Strategy.m6760equalsimpl0(breakStrategy, LineBreak.Strategy.Companion.m6764getBalancedfcGXIks()) == false) goto L15;
        return 2;
    L15:
        return 0;
    }

    /* JADX INFO: renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    private static final int m6243toLayoutLineBreakStylehpcqdu8(int lineBreakStrictness) {
        if (LineBreak.Strictness.m6771equalsimpl0(lineBreakStrictness, LineBreak.Strictness.Companion.m6775getDefaultusljTpc()) == false) goto L6;
        return 0;
    L6:
        if (LineBreak.Strictness.m6771equalsimpl0(lineBreakStrictness, LineBreak.Strictness.Companion.m6776getLooseusljTpc()) == false) goto L9;
        return 1;
    L9:
        if (LineBreak.Strictness.m6771equalsimpl0(lineBreakStrictness, LineBreak.Strictness.Companion.m6777getNormalusljTpc()) == false) goto L12;
        return 2;
    L12:
        if (LineBreak.Strictness.m6771equalsimpl0(lineBreakStrictness, LineBreak.Strictness.Companion.m6778getStrictusljTpc()) == false) goto L19;
        return 3;
    L19:
        return 0;
    }

    /* JADX INFO: renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    private static final int m6244toLayoutLineBreakWordStylewPN0Rpw(int lineBreakWordStyle) {
        if (LineBreak.WordBreak.m6783equalsimpl0(lineBreakWordStyle, LineBreak.WordBreak.Companion.m6787getDefaultjp8hJ3c()) == false) goto L6;
        return 0;
    L6:
        if (LineBreak.WordBreak.m6783equalsimpl0(lineBreakWordStyle, LineBreak.WordBreak.Companion.m6788getPhrasejp8hJ3c()) == false) goto L11;
        return 1;
    L11:
        return 0;
    }

    private static final int numberOfLinesThatFitMaxHeight(TextLayout $this$numberOfLinesThatFitMaxHeight, int maxHeight) {
        int lineIndex = 0;
        int r1 = $this$numberOfLinesThatFitMaxHeight.getLineCount();
    L3:
        if (lineIndex >= r1) goto L8;
        if ($this$numberOfLinesThatFitMaxHeight.getLineBottom(lineIndex) > maxHeight) goto L6;
        lineIndex = lineIndex + 1;
        goto L3
    L6:
        return lineIndex;
    L8:
        int lineIndex2 = $this$numberOfLinesThatFitMaxHeight.getLineCount();
        return lineIndex2;
    }

    private static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean ellipsis) {
        if (ellipsis == true) goto L5;
        return false;
    L5:
        if (TextUnit.m7164equalsimpl0(textStyle.m6453getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) == false) goto L7;
        return false;
    L7:
        if (TextUnit.m7164equalsimpl0(textStyle.m6453getLetterSpacingXSAIIZE(), TextUnit.Companion.m7178getUnspecifiedXSAIIZE()) == false) goto L9;
        return false;
    L9:
        if (TextAlign.m6831equalsimpl0(textStyle.m6458getTextAligne0LSkKk(), TextAlign.Companion.m6841getUnspecifiede0LSkKk()) == false) goto L11;
        return false;
    L11:
        if (TextAlign.m6831equalsimpl0(textStyle.m6458getTextAligne0LSkKk(), TextAlign.Companion.m6840getStarte0LSkKk()) == false) goto L13;
        return false;
    L13:
        if (TextAlign.m6831equalsimpl0(textStyle.m6458getTextAligne0LSkKk(), TextAlign.Companion.m6837getJustifye0LSkKk()) == true) goto L23;
        return true;
    L23:
        return false;
    }

    private static final CharSequence attachIndentationFixSpan(CharSequence $this$attachIndentationFixSpan) {
        if ($this$attachIndentationFixSpan.length() != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return $this$attachIndentationFixSpan;
    L9:
        if (($this$attachIndentationFixSpan instanceof Spannable) == false) goto L11;
        SpannableString spannable = (Spannable) $this$attachIndentationFixSpan;
    L12:
        if (spannable != null) goto L15;
        spannable = new SpannableString($this$attachIndentationFixSpan);
    L15:
        if (SpannedExtensions_androidKt.hasSpan(spannable, IndentationFixSpan.class) == true) goto L18;
        SpannableExtensions_androidKt.setSpan(spannable, new IndentationFixSpan(), spannable.length() - 1, spannable.length() - 1);
    L18:
        return spannable;
    L11:
        spannable = null;
        goto L12
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    private static final int m6245toLayoutTextGranularityduNsdkg(int $this$toLayoutTextGranularity_u2dduNsdkg) {
        if (TextGranularity.m6375equalsimpl0($this$toLayoutTextGranularity_u2dduNsdkg, TextGranularity.Companion.m6379getCharacterDRrd7Zo()) == false) goto L6;
        return 0;
    L6:
        if (TextGranularity.m6375equalsimpl0($this$toLayoutTextGranularity_u2dduNsdkg, TextGranularity.Companion.m6380getWordDRrd7Zo()) == false) goto L11;
        return 1;
    L11:
        return 0;
    }
}
