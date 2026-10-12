package androidx.compose.ui.text.font;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "Font-YpTlLL0", "(ILandroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/font/Font;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "toFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FontKt {
    /* JADX INFO: renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m6507FontRetOiIg$default(int r0, FontWeight r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r1 = FontWeight.Companion.getNormal();
    L6:
        if ((r3 & 4) == 0) goto L9;
        r2 = FontStyle.Companion.m6535getNormal_LCdwA();
    L9:
        return m6506FontRetOiIg(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @ReplaceWith(expression = "Font(resId, weight, style)", imports = {}))
    /* JADX INFO: renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m6506FontRetOiIg(int resId, FontWeight weight, int style) {
        return new ResourceFont(resId, weight, style, null, FontLoadingStrategy.Companion.m6520getBlockingPKNRLFQ(), 8, null);
    }

    /* JADX INFO: renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m6509FontYpTlLL0$default(int r0, FontWeight r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r1 = FontWeight.Companion.getNormal();
    L6:
        if ((r4 & 4) == 0) goto L9;
        r2 = FontStyle.Companion.m6535getNormal_LCdwA();
    L9:
        if ((r4 & 8) == 0) goto L12;
        r3 = FontLoadingStrategy.Companion.m6520getBlockingPKNRLFQ();
    L12:
        return m6508FontYpTlLL0(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m6508FontYpTlLL0(int resId, FontWeight weight, int style, int loadingStrategy) {
        return new ResourceFont(resId, weight, style, new FontVariation.Settings(new FontVariation.Setting[0]), loadingStrategy, null);
    }

    /* JADX INFO: renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ Font m6505FontF3nL8kk$default(int r0, FontWeight r1, int r2, int r3, FontVariation.Settings r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r1 = FontWeight.Companion.getNormal();
    L6:
        if ((r5 & 4) == 0) goto L9;
        r2 = FontStyle.Companion.m6535getNormal_LCdwA();
    L9:
        if ((r5 & 8) == 0) goto L12;
        r3 = FontLoadingStrategy.Companion.m6520getBlockingPKNRLFQ();
    L12:
        if ((r5 & 16) == 0) goto L15;
        r4 = FontVariation.INSTANCE.m6550Settings6EWAqTQ(r1, r2, new FontVariation.Setting[0]);
    L15:
        return m6504FontF3nL8kk(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final Font m6504FontF3nL8kk(int resId, FontWeight weight, int style, int loadingStrategy, FontVariation.Settings variationSettings) {
        return new ResourceFont(resId, weight, style, variationSettings, loadingStrategy, null);
    }

    public static final FontFamily toFontFamily(Font $this$toFontFamily) {
        return FontFamilyKt.FontFamily(new Font[]{$this$toFontFamily});
    }
}
