package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DeviceFontFamilyNameFont.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u001c\u0010\u0006\u001a\u00020\u0007X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyNameFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "familyName", "Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljava/lang/String;", "getStyle-_-LCdwA", "()I", "I", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "equals", "", "other", "", "hashCode", "", "loadCached", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "toString", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DeviceFontFamilyNameFont extends AndroidFont {
    private final String familyName;
    private final int style;
    private final FontWeight weight;

    public /* synthetic */ DeviceFontFamilyNameFont(String r1, FontWeight r2, int r3, FontVariation.Settings r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    public int mo6481getStyle_LCdwA() {
        return this.style;
    }

    private DeviceFontFamilyNameFont(String familyName, FontWeight weight, int style, FontVariation.Settings variationSettings) {
        super(FontLoadingStrategy.Companion.m6521getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, variationSettings, null);
        this.familyName = familyName;
        this.weight = weight;
        this.style = style;
    }

    public final android.graphics.Typeface loadCached(Context context) {
        return PlatformTypefaces_androidKt.PlatformTypefaces().mo6557optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), mo6481getStyle_LCdwA(), getVariationSettings(), context);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof DeviceFontFamilyNameFont) == true) goto L9;
        return false;
    L9:
        if (DeviceFontFamilyName.m6494equalsimpl0(this.familyName, ((DeviceFontFamilyNameFont) other).familyName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(getWeight(), ((DeviceFontFamilyNameFont) other).getWeight()) == true) goto L15;
        return false;
    L15:
        if (FontStyle.m6528equalsimpl0(mo6481getStyle_LCdwA(), ((DeviceFontFamilyNameFont) other).mo6481getStyle_LCdwA()) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(getVariationSettings(), ((DeviceFontFamilyNameFont) other).getVariationSettings()) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int result = DeviceFontFamilyName.m6495hashCodeimpl(this.familyName);
        int result2 = (result * 31) + getWeight().hashCode();
        return (((result2 * 31) + FontStyle.m6529hashCodeimpl(mo6481getStyle_LCdwA())) * 31) + getVariationSettings().hashCode();
    }

    public String toString() {
        return "Font(familyName=\"" + DeviceFontFamilyName.m6496toStringimpl(this.familyName) + "\", weight=" + getWeight() + ", style=" + FontStyle.m6530toStringimpl(mo6481getStyle_LCdwA()) + ')';
    }
}
