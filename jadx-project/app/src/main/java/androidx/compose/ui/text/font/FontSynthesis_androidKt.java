package androidx.compose.ui.text.font;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FontSynthesis.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"synthesizeTypeface", "", "Landroidx/compose/ui/text/font/FontSynthesis;", "typeface", "font", "Landroidx/compose/ui/text/font/Font;", "requestedWeight", "Landroidx/compose/ui/text/font/FontWeight;", "requestedStyle", "Landroidx/compose/ui/text/font/FontStyle;", "synthesizeTypeface-FxwP2eA", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FontSynthesis_androidKt {
    /* JADX INFO: renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    public static final Object m6549synthesizeTypefaceFxwP2eA(int $this$synthesizeTypeface_u2dFxwP2eA, Object typeface, Font font, FontWeight requestedWeight, int requestedStyle) {
        if ((typeface instanceof android.graphics.Typeface) == true) goto L5;
        return typeface;
    L5:
        boolean r1 = true;
        if (FontSynthesis.m6542isWeightOnimpl$ui_text_release($this$synthesizeTypeface_u2dFxwP2eA) == true) goto L8;
    L14:
        boolean synthesizeWeight = false;
    L16:
        if (FontSynthesis.m6541isStyleOnimpl$ui_text_release($this$synthesizeTypeface_u2dFxwP2eA) == true) goto L18;
    L20:
        boolean synthesizeStyle = false;
    L21:
        if (synthesizeStyle == true) goto L25;
        if (synthesizeWeight == true) goto L25;
        return typeface;
    L25:
        if (Build.VERSION.SDK_INT >= 28) goto L32;
        if (synthesizeStyle == true) goto L28;
    L30:
        r1 = false;
    L31:
        int targetStyle = AndroidFontUtils_androidKt.getAndroidTypefaceStyle(synthesizeWeight, r1);
        return android.graphics.Typeface.create((android.graphics.Typeface) typeface, targetStyle);
    L28:
        if (FontStyle.m6528equalsimpl0(requestedStyle, FontStyle.Companion.m6534getItalic_LCdwA()) == false) goto L30;
    L32:
        if (synthesizeWeight == false) goto L34;
        int finalFontWeight = requestedWeight.getWeight();
    L36:
        if (synthesizeStyle == false) goto L38;
        boolean finalFontStyle = FontStyle.m6528equalsimpl0(requestedStyle, FontStyle.Companion.m6534getItalic_LCdwA());
    L40:
        return TypefaceHelperMethodsApi28.INSTANCE.create((android.graphics.Typeface) typeface, finalFontWeight, finalFontStyle);
    L38:
        finalFontStyle = FontStyle.m6528equalsimpl0(font.mo6481getStyle_LCdwA(), FontStyle.Companion.m6534getItalic_LCdwA());
        goto L40
    L34:
        finalFontWeight = font.getWeight().getWeight();
        goto L36
    L18:
        if (FontStyle.m6528equalsimpl0(requestedStyle, font.mo6481getStyle_LCdwA()) == true) goto L20;
        synthesizeStyle = true;
        goto L21
    L8:
        if (Intrinsics.areEqual(font.getWeight(), requestedWeight) == true) goto L14;
        if (requestedWeight.compareTo2(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.Companion)) < 0) goto L14;
        if (font.getWeight().compareTo2(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.Companion)) >= 0) goto L14;
        synthesizeWeight = true;
        goto L16
    }
}
