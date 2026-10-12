package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPreloadedFont.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceBuilderCompat;", "", "()V", "createFromAssets", "Landroid/graphics/Typeface;", "assetManager", "Landroid/content/res/AssetManager;", "path", "", "context", "Landroid/content/Context;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "createFromFile", "file", "Ljava/io/File;", "createFromFileDescriptor", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "toVariationSettings", "", "Landroid/graphics/fonts/FontVariationAxis;", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class TypefaceBuilderCompat {
    public static final TypefaceBuilderCompat INSTANCE = null;

    static {
        INSTANCE = new TypefaceBuilderCompat();
    }

    private TypefaceBuilderCompat() {
    }

    public final android.graphics.Typeface createFromAssets(AssetManager assetManager, String path, Context context, FontVariation.Settings variationSettings) {
        if (context != null) goto L6;
        return null;
    L6:
        return new android.graphics.Typeface.Builder(assetManager, path).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    public final android.graphics.Typeface createFromFile(File file, Context context, FontVariation.Settings variationSettings) {
        if (context != null) goto L6;
        return null;
    L6:
        return new android.graphics.Typeface.Builder(file).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    public final android.graphics.Typeface createFromFileDescriptor(ParcelFileDescriptor fileDescriptor, Context context, FontVariation.Settings variationSettings) {
        if (context != null) goto L6;
        return null;
    L6:
        return new android.graphics.Typeface.Builder(fileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    private final FontVariationAxis[] toVariationSettings(FontVariation.Settings $this$toVariationSettings, Context context) {
        if (context == null) goto L5;
        Density density = AndroidDensity_androidKt.Density(context);
    L7:
        List<FontVariation.Setting> r1 = $this$toVariationSettings.getSettings();
        Collection target$iv = new ArrayList(r1.size());
        int index$iv$iv = 0;
        int r7 = r1.size();
    L8:
        if (index$iv$iv >= r7) goto L10;
        Object item$iv$iv = r1.get(index$iv$iv);
        FontVariation.Setting setting = (FontVariation.Setting) item$iv$iv;
        List<FontVariation.Setting> r16 = r1;
        target$iv.add(new FontVariationAxis(setting.getAxisName(), setting.toVariationValue(density)));
        index$iv$iv = index$iv$iv + 1;
        r1 = r16;
        goto L8
    L10:
        Collection $this$toTypedArray$iv = (List) target$iv;
        return (FontVariationAxis[]) $this$toTypedArray$iv.toArray(new FontVariationAxis[0]);
    L5:
        if ($this$toVariationSettings.getNeedsDensity$ui_text_release() == true) goto L13;
        density = DensityKt.Density(1.0f, 1.0f);
        goto L7
    L13:
        throw new IllegalStateException("Required density, but not provided");
    }
}
