package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFontUtils.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"AndroidBold", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "getAndroidBold", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/ui/text/font/FontWeight;", "getAndroidTypefaceStyle", "", "fontWeight", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "getAndroidTypefaceStyle-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)I", "isBold", "", "isItalic", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidFontUtils_androidKt {
    public static final FontWeight getAndroidBold(FontWeight.Companion $this$AndroidBold) {
        return $this$AndroidBold.getW600();
    }

    /* JADX INFO: renamed from: getAndroidTypefaceStyle-FO1MlWM, reason: not valid java name */
    public static final int m6480getAndroidTypefaceStyleFO1MlWM(FontWeight fontWeight, int fontStyle) {
        if (fontWeight.compareTo2(getAndroidBold(FontWeight.Companion)) < 0) goto L5;
        boolean isBold = true;
    L6:
        boolean isItalic = FontStyle.m6528equalsimpl0(fontStyle, FontStyle.Companion.m6534getItalic_LCdwA());
        return getAndroidTypefaceStyle(isBold, isItalic);
    L5:
        isBold = false;
        goto L6
    }

    public static final int getAndroidTypefaceStyle(boolean isBold, boolean isItalic) {
        if (isItalic == false) goto L5;
        if (isBold == false) goto L5;
        return 3;
    L5:
        if (isBold == false) goto L7;
        return 1;
    L7:
        if (isItalic == false) goto L9;
        return 2;
    L9:
        return 0;
    }
}
