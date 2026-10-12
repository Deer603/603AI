package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFont.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000e\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\b\u0010\u0015\u001a\u00020\u0016H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-Ej4NQ78", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "file", "Ljava/io/File;", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "path", "", "assetManager", "Landroid/content/res/AssetManager;", "Font-MuC2MFs", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "generateAndroidFontKtForApiCompatibility", "", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidFontKt {
    /* JADX INFO: renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m6479FontMuC2MFs$default(String r0, AssetManager r1, FontWeight r2, int r3, FontVariation.Settings r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r2 = FontWeight.Companion.getNormal();
    L6:
        if ((r5 & 8) == 0) goto L9;
        r3 = FontStyle.Companion.m6535getNormal_LCdwA();
    L9:
        if ((r5 & 16) == 0) goto L12;
        r4 = FontVariation.INSTANCE.m6550Settings6EWAqTQ(r2, r3, new FontVariation.Setting[0]);
    L12:
        return m6478FontMuC2MFs(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m6478FontMuC2MFs(String path, AssetManager assetManager, FontWeight weight, int style, FontVariation.Settings variationSettings) {
        return new AndroidAssetFont(assetManager, path, weight, style, variationSettings, null);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m6477FontEj4NQ78$default(File r0, FontWeight r1, int r2, FontVariation.Settings r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r1 = FontWeight.Companion.getNormal();
    L6:
        if ((r4 & 4) == 0) goto L9;
        r2 = FontStyle.Companion.m6535getNormal_LCdwA();
    L9:
        if ((r4 & 8) == 0) goto L12;
        r3 = FontVariation.INSTANCE.m6550Settings6EWAqTQ(r1, r2, new FontVariation.Setting[0]);
    L12:
        return m6475FontEj4NQ78(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m6475FontEj4NQ78(File file, FontWeight weight, int style, FontVariation.Settings variationSettings) {
        return new AndroidFileFont(file, weight, style, variationSettings, null);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m6476FontEj4NQ78$default(ParcelFileDescriptor r0, FontWeight r1, int r2, FontVariation.Settings r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r1 = FontWeight.Companion.getNormal();
    L6:
        if ((r4 & 4) == 0) goto L9;
        r2 = FontStyle.Companion.m6535getNormal_LCdwA();
    L9:
        if ((r4 & 8) == 0) goto L12;
        r3 = FontVariation.INSTANCE.m6550Settings6EWAqTQ(r1, r2, new FontVariation.Setting[0]);
    L12:
        return m6474FontEj4NQ78(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m6474FontEj4NQ78(ParcelFileDescriptor fileDescriptor, FontWeight weight, int style, FontVariation.Settings variationSettings) {
        return new AndroidFileDescriptorFont(fileDescriptor, weight, style, variationSettings, null);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }
}
