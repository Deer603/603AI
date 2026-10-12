package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"hasEmojiCompat", "", "Landroidx/compose/ui/text/TextStyle;", "getHasEmojiCompat", "(Landroidx/compose/ui/text/TextStyle;)Z", "ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "resolveTextDirectionHeuristics", "", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirectionHeuristics-HklW4sA", "(ILandroidx/compose/ui/text/intl/LocaleList;)I", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidParagraphIntrinsics_androidKt {
    public static final /* synthetic */ boolean access$getHasEmojiCompat(TextStyle $receiver) {
        return getHasEmojiCompat($receiver);
    }

    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m6675resolveTextDirectionHeuristicsHklW4sA$default(int r0, LocaleList r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = null;
    L6:
        return m6674resolveTextDirectionHeuristicsHklW4sA(r0, r1);
    }

    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    public static final int m6674resolveTextDirectionHeuristicsHklW4sA(int textDirection, LocaleList localeList) {
        if (TextDirection.m6845equalsimpl0(textDirection, TextDirection.Companion.m6850getContentOrLtrs_7Xco()) == false) goto L6;
        return 2;
    L6:
        if (TextDirection.m6845equalsimpl0(textDirection, TextDirection.Companion.m6851getContentOrRtls_7Xco()) == false) goto L9;
        return 3;
    L9:
        if (TextDirection.m6845equalsimpl0(textDirection, TextDirection.Companion.m6852getLtrs_7Xco()) == true) goto L31;
        boolean r4 = true;
        if (TextDirection.m6845equalsimpl0(textDirection, TextDirection.Companion.m6853getRtls_7Xco()) == false) goto L15;
        return 1;
    L15:
        if (TextDirection.m6845equalsimpl0(textDirection, TextDirection.Companion.m6849getContents_7Xco()) == true) goto L18;
        r4 = TextDirection.m6845equalsimpl0(textDirection, TextDirection.Companion.m6854getUnspecifieds_7Xco());
    L18:
        if (r4 == false) goto L30;
        if (localeList == null) goto L22;
        Locale currentLocale = localeList.get(0).getPlatformLocale();
        if (currentLocale == null) goto L22;
    L24:
        switch(TextUtilsCompat.getLayoutDirectionFromLocale(currentLocale)) {
            case 0: goto L35;
            case 1: goto L33;
            default: goto L35;
        };
    L35:
        return 2;
    L33:
        return 3;
    L22:
        currentLocale = Locale.getDefault();
        goto L24
    L30:
        throw new IllegalStateException("Invalid TextDirection.".toString());
    L31:
        return 0;
    }

    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String text, TextStyle style, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> r9, List<AnnotatedString.Range<Placeholder>> r10, Density density, FontFamily.Resolver fontFamilyResolver) {
        return new AndroidParagraphIntrinsics(text, style, r9, r10, fontFamilyResolver, density);
    }

    private static final boolean getHasEmojiCompat(TextStyle $this$hasEmojiCompat) {
        PlatformTextStyle r0 = $this$hasEmojiCompat.getPlatformStyle();
        if (r0 == null) goto L7;
        PlatformParagraphStyle r1 = r0.getParagraphStyle();
        if (r1 == null) goto L7;
        EmojiSupportMatch r2 = EmojiSupportMatch.m6254boximpl(r1.m6335getEmojiSupportMatch_3YsG6Y());
    L8:
        int r3 = EmojiSupportMatch.Companion.m6263getNone_3YsG6Y();
        if (r2 != null) goto L11;
        boolean r4 = false;
    L13:
        return !r4;
    L11:
        r4 = EmojiSupportMatch.m6257equalsimpl0(r2.m6260unboximpl(), r3);
    L7:
        r2 = null;
        goto L8
    }
}
