package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.emoji2.text.EmojiCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidParagraphHelper.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000]\n\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0001\u001a\u0082\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\f2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u0011\u001a\u00020\u00122&\u0010\u0013\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0000\u001a\f\u0010\u001c\u001a\u00020\u001b*\u00020\nH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u001d"}, d2 = {"NoopSpan", "androidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt$NoopSpan$1", "Landroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt$NoopSpan$1;", "createCharSequence", "", "text", "", "contextFontSize", "", "contextTextStyle", "Landroidx/compose/ui/text/TextStyle;", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "useEmojiCompat", "", "isIncludeFontPaddingEnabled", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidParagraphHelper_androidKt {
    private static final AndroidParagraphHelper_androidKt$NoopSpan$1 NoopSpan = null;

    public static final CharSequence createCharSequence(String text, float contextFontSize, TextStyle contextTextStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> r14, List<AnnotatedString.Range<Placeholder>> r15, Density density, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> r17, boolean useEmojiCompat) {
        boolean r0 = true;
        if (useEmojiCompat == true) goto L5;
    L20:
        String r3 = text;
    L21:
        CharSequence currentText = r3;
        if (r14.isEmpty() == false) goto L34;
        if (r15.isEmpty() == false) goto L34;
        if (Intrinsics.areEqual(contextTextStyle.getTextIndent(), TextIndent.Companion.getNone()) == false) goto L34;
        long $this$isUnspecified$iv = contextTextStyle.m6456getLineHeightXSAIIZE();
        if (TextUnit.m7165getRawTypeimpl($this$isUnspecified$iv) == 0) goto L31;
        r0 = false;
    L31:
        if (r0 == false) goto L34;
        return currentText;
    L34:
        if ((currentText instanceof Spannable) == false) goto L36;
        SpannableString spannableString = (Spannable) currentText;
    L38:
        if (Intrinsics.areEqual(contextTextStyle.getTextDecoration(), TextDecoration.Companion.getUnderline()) == false) goto L41;
        SpannableExtensions_androidKt.setSpan(spannableString, NoopSpan, 0, text.length());
    L41:
        if (isIncludeFontPaddingEnabled(contextTextStyle) == true) goto L43;
    L45:
        LineHeightStyle r1 = contextTextStyle.getLineHeightStyle();
        if (r1 != null) goto L48;
        r1 = LineHeightStyle.Companion.getDefault();
    L48:
        LineHeightStyle lineHeightStyle = r1;
        SpannableExtensions_androidKt.m6698setLineHeightKmRG4DE(spannableString, contextTextStyle.m6456getLineHeightXSAIIZE(), contextFontSize, density, lineHeightStyle);
    L49:
        SpannableExtensions_androidKt.setTextIndent(spannableString, contextTextStyle.getTextIndent(), contextFontSize, density);
        SpannableExtensions_androidKt.setSpanStyles(spannableString, contextTextStyle, r14, density, r17);
        SpannableExtensions_androidKt.setBulletSpans(spannableString, r14, contextFontSize, density, contextTextStyle.getTextIndent());
        PlaceholderExtensions_androidKt.setPlaceholders(spannableString, r15, density);
        return spannableString;
    L43:
        if (contextTextStyle.getLineHeightStyle() != null) goto L45;
        SpannableExtensions_androidKt.m6699setLineHeightr9BaKPg(spannableString, contextTextStyle.m6456getLineHeightXSAIIZE(), contextFontSize, density);
        goto L49
    L36:
        spannableString = new SpannableString(currentText);
        goto L38
    L5:
        if (EmojiCompat.isConfigured() == false) goto L20;
        PlatformTextStyle r2 = contextTextStyle.getPlatformStyle();
        if (r2 == null) goto L11;
        PlatformParagraphStyle r4 = r2.getParagraphStyle();
        if (r4 == null) goto L11;
        EmojiSupportMatch emojiSupportMatch = EmojiSupportMatch.m6254boximpl(r4.m6335getEmojiSupportMatch_3YsG6Y());
    L12:
        int r5 = EmojiSupportMatch.Companion.m6261getAll_3YsG6Y();
        if (emojiSupportMatch != null) goto L15;
        boolean r6 = false;
    L16:
        if (r6 == false) goto L18;
        int r7 = 1;
    L19:
        int replaceStrategy = r7;
        r3 = EmojiCompat.get().process(text, 0, text.length(), Integer.MAX_VALUE, replaceStrategy);
        Intrinsics.checkNotNull(r3);
        goto L21
    L18:
        r7 = 0;
        goto L19
    L15:
        r6 = EmojiSupportMatch.m6257equalsimpl0(emojiSupportMatch.m6260unboximpl(), r5);
    L11:
        emojiSupportMatch = null;
        goto L12
    }

    public static final boolean isIncludeFontPaddingEnabled(TextStyle $this$isIncludeFontPaddingEnabled) {
        PlatformTextStyle r0 = $this$isIncludeFontPaddingEnabled.getPlatformStyle();
        if (r0 == null) goto L7;
        PlatformParagraphStyle r1 = r0.getParagraphStyle();
        if (r1 == null) goto L7;
        return r1.getIncludeFontPadding();
    L7:
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1] */
    static {
        NoopSpan = new AndroidParagraphHelper_androidKt$NoopSpan$1();
    }
}
