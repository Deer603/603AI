package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TextStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b\u001a\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f\u001a\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"createPlatformTextStyleInternal", "Landroidx/compose/ui/text/PlatformTextStyle;", "platformSpanStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "platformParagraphStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lerp", "Landroidx/compose/ui/text/TextStyle;", "start", "stop", "fraction", "", "resolveDefaults", "style", "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "resolveTextDirection", "Landroidx/compose/ui/text/style/TextDirection;", "layoutDirection", "textDirection", "resolveTextDirection-IhaHGbI", "(Landroidx/compose/ui/unit/LayoutDirection;I)I", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextStyleKt {

    /* JADX INFO: compiled from: TextStyle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[LayoutDirection.values().length];
            r0[LayoutDirection.Ltr.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[LayoutDirection.Rtl.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ PlatformTextStyle access$createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        return createPlatformTextStyleInternal(platformSpanStyle, platformParagraphStyle);
    }

    public static final TextStyle lerp(TextStyle start, TextStyle stop, float fraction) {
        return new TextStyle(SpanStyleKt.lerp(start.toSpanStyle(), stop.toSpanStyle(), fraction), ParagraphStyleKt.lerp(start.toParagraphStyle(), stop.toParagraphStyle(), fraction));
    }

    public static final TextStyle resolveDefaults(TextStyle style, LayoutDirection direction) {
        return new TextStyle(SpanStyleKt.resolveSpanStyleDefaults(style.getSpanStyle$ui_text_release()), ParagraphStyleKt.resolveParagraphStyleDefaults(style.getParagraphStyle$ui_text_release(), direction), style.getPlatformStyle());
    }

    /* JADX INFO: renamed from: resolveTextDirection-IhaHGbI, reason: not valid java name */
    public static final int m6463resolveTextDirectionIhaHGbI(LayoutDirection layoutDirection, int textDirection) {
        if (TextDirection.m6845equalsimpl0(textDirection, TextDirection.Companion.m6849getContents_7Xco()) == false) goto L11;
        switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()]) {
            case 1: goto L21;
            case 2: goto L20;
            default: goto L7;
        };
    L7:
        throw new NoWhenBranchMatchedException();
    L20:
        return TextDirection.Companion.m6851getContentOrRtls_7Xco();
    L21:
        return TextDirection.Companion.m6850getContentOrLtrs_7Xco();
    L11:
        if (TextDirection.m6845equalsimpl0(textDirection, TextDirection.Companion.m6854getUnspecifieds_7Xco()) == false) goto L19;
        switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()]) {
            case 1: goto L23;
            case 2: goto L22;
            default: goto L15;
        };
    L15:
        throw new NoWhenBranchMatchedException();
    L22:
        return TextDirection.Companion.m6853getRtls_7Xco();
    L23:
        return TextDirection.Companion.m6852getLtrs_7Xco();
    L19:
        return textDirection;
    }

    private static final PlatformTextStyle createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle != null) goto L6;
        if (platformParagraphStyle != null) goto L6;
        return null;
    L6:
        return AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }
}
