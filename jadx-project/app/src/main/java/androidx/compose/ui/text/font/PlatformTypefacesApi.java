package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlatformTypefaces.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\fJ<\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "()V", "createAndroidTypefaceUsingTypefaceStyle", "Landroid/graphics/Typeface;", "genericFontFamily", "", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "createAndroidTypefaceUsingTypefaceStyle-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createDefault", "createDefault-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createNamed", HintConstants.AUTOFILL_HINT_NAME, "Landroidx/compose/ui/text/font/GenericFontFamily;", "createNamed-RetOiIg", "(Landroidx/compose/ui/text/font/GenericFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "loadNamedFromTypefaceCacheOrNull", "familyName", "weight", "style", "loadNamedFromTypefaceCacheOrNull-RetOiIg", "optionalOnDeviceFontFamilyByName", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "context", "Landroid/content/Context;", "optionalOnDeviceFontFamilyByName-78DK7lM", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class PlatformTypefacesApi implements PlatformTypefaces {
    public PlatformTypefacesApi() {
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo6555createDefaultFO1MlWM(FontWeight fontWeight, int fontStyle) {
        return m6558createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, fontStyle);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo6556createNamedRetOiIg(GenericFontFamily name, FontWeight fontWeight, int fontStyle) {
        android.graphics.Typeface r0 = m6560loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(name.getName(), fontWeight), fontWeight, fontStyle);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return m6558createAndroidTypefaceUsingTypefaceStyleRetOiIg(name.getName(), fontWeight, fontStyle);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo6557optionalOnDeviceFontFamilyByName78DK7lM(String familyName, FontWeight weight, int style, FontVariation.Settings variationSettings, Context context) {
        if (Intrinsics.areEqual(familyName, FontFamily.Companion.getSansSerif().getName()) == false) goto L6;
        android.graphics.Typeface typeface = mo6556createNamedRetOiIg(FontFamily.Companion.getSansSerif(), weight, style);
    L16:
        return PlatformTypefaces_androidKt.setFontVariationSettings(typeface, variationSettings, context);
    L6:
        if (Intrinsics.areEqual(familyName, FontFamily.Companion.getSerif().getName()) == false) goto L9;
        typeface = mo6556createNamedRetOiIg(FontFamily.Companion.getSerif(), weight, style);
        goto L16
    L9:
        if (Intrinsics.areEqual(familyName, FontFamily.Companion.getMonospace().getName()) == false) goto L12;
        typeface = mo6556createNamedRetOiIg(FontFamily.Companion.getMonospace(), weight, style);
        goto L16
    L12:
        if (Intrinsics.areEqual(familyName, FontFamily.Companion.getCursive().getName()) == false) goto L14;
        typeface = mo6556createNamedRetOiIg(FontFamily.Companion.getCursive(), weight, style);
        goto L16
    L14:
        typeface = m6560loadNamedFromTypefaceCacheOrNullRetOiIg(familyName, weight, style);
        goto L16
    }

    /* JADX INFO: renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m6560loadNamedFromTypefaceCacheOrNullRetOiIg(String familyName, FontWeight weight, int style) {
        boolean r1 = true;
        if (familyName.length() != 0) goto L5;
        boolean r0 = true;
    L7:
        if (r0 == false) goto L9;
        return null;
    L9:
        android.graphics.Typeface typeface = m6558createAndroidTypefaceUsingTypefaceStyleRetOiIg(familyName, weight, style);
        if (Intrinsics.areEqual(typeface, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m6480getAndroidTypefaceStyleFO1MlWM(weight, style))) == false) goto L12;
    L14:
        r1 = false;
    L15:
        if (r1 == true) goto L17;
        return null;
    L17:
        return typeface;
    L12:
        if (Intrinsics.areEqual(typeface, m6558createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, weight, style)) == true) goto L14;
    L5:
        r0 = false;
        goto L7
    }

    /* JADX INFO: renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m6559createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi r0, String r1, FontWeight r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = null;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = FontWeight.Companion.getNormal();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = FontStyle.Companion.m6535getNormal_LCdwA();
    L12:
        return r0.m6558createAndroidTypefaceUsingTypefaceStyleRetOiIg(r1, r2, r3);
    }

    /* JADX INFO: renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m6558createAndroidTypefaceUsingTypefaceStyleRetOiIg(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        boolean r1 = false;
        if (FontStyle.m6528equalsimpl0(fontStyle, FontStyle.Companion.m6535getNormal_LCdwA()) == true) goto L5;
    L16:
        int targetStyle = AndroidFontUtils_androidKt.m6480getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle);
        String r3 = genericFontFamily;
        if (r3 != null) goto L19;
    L20:
        r1 = true;
    L21:
        if (r1 == false) goto L24;
        return android.graphics.Typeface.defaultFromStyle(targetStyle);
    L24:
        return android.graphics.Typeface.create(genericFontFamily, targetStyle);
    L19:
        if (r3.length() != 0) goto L21;
    L5:
        if (Intrinsics.areEqual(fontWeight, FontWeight.Companion.getNormal()) == false) goto L16;
        String r0 = genericFontFamily;
        if (r0 != null) goto L9;
    L12:
        boolean r2 = true;
    L13:
        if (r2 == false) goto L16;
        return android.graphics.Typeface.DEFAULT;
    L9:
        if (r0.length() == 0) goto L12;
        r2 = false;
        goto L13
    }
}
