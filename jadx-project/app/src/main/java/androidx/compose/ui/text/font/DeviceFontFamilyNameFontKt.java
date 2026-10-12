package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* JADX INFO: compiled from: DeviceFontFamilyNameFont.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "familyName", "Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-vxs03AY", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DeviceFontFamilyNameFontKt {
    /* JADX INFO: renamed from: Font-vxs03AY$default, reason: not valid java name */
    public static /* synthetic */ Font m6499Fontvxs03AY$default(String r0, FontWeight r1, int r2, FontVariation.Settings r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r1 = FontWeight.Companion.getNormal();
    L6:
        if ((r4 & 4) == 0) goto L9;
        r2 = FontStyle.Companion.m6535getNormal_LCdwA();
    L9:
        if ((r4 & 8) == 0) goto L12;
        r3 = new FontVariation.Settings(new FontVariation.Setting[0]);
    L12:
        return m6498Fontvxs03AY(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: Font-vxs03AY, reason: not valid java name */
    public static final Font m6498Fontvxs03AY(String familyName, FontWeight weight, int style, FontVariation.Settings variationSettings) {
        return new DeviceFontFamilyNameFont(familyName, weight, style, variationSettings, null);
    }
}
