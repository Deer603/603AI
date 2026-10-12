package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: AndroidShader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aL\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aL\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a<\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001\u001a\u001e\u0010 \u001a\u00020!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001\u001a0\u0010#\u001a\u0004\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001\u001a&\u0010&\u001a\u00020'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0002*\n\u0010(\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"ActualImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualLinearGradientShader", "from", "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualSweepGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "countTransparentColors", "", "makeTransparentColors", "", "numTransparentColors", "makeTransparentStops", "", "stops", "validateColorStops", "", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidShader_androidKt {
    /* JADX INFO: renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m4267ActualLinearGradientShaderVjE6UOU(long from, long to, List<Color> r18, List<Float> r19, int tileMode) {
        validateColorStops(r18, r19);
        int numTransparentColors = countTransparentColors(r18);
        int bits$iv$iv$iv = (int) (from >> 32);
        int bits$iv$iv$iv2 = (int) (from & 4294967295L);
        int bits$iv$iv$iv3 = (int) (to >> 32);
        int bits$iv$iv$iv4 = (int) (4294967295L & to);
        return new android.graphics.LinearGradient(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2), Float.intBitsToFloat(bits$iv$iv$iv3), Float.intBitsToFloat(bits$iv$iv$iv4), makeTransparentColors(r18, numTransparentColors), makeTransparentStops(r19, r18, numTransparentColors), AndroidTileMode_androidKt.m4271toAndroidTileMode0vamqd0(tileMode));
    }

    /* JADX INFO: renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m4268ActualRadialGradientShader8uybcMk(long center, float radius, List<Color> r12, List<Float> r13, int tileMode) {
        validateColorStops(r12, r13);
        int numTransparentColors = countTransparentColors(r12);
        int bits$iv$iv$iv = (int) (center >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & center);
        return new android.graphics.RadialGradient(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2), radius, makeTransparentColors(r12, numTransparentColors), makeTransparentStops(r13, r12, numTransparentColors), AndroidTileMode_androidKt.m4271toAndroidTileMode0vamqd0(tileMode));
    }

    /* JADX INFO: renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m4269ActualSweepGradientShader9KIMszo(long center, List<Color> r11, List<Float> r12) {
        validateColorStops(r11, r12);
        int numTransparentColors = countTransparentColors(r11);
        int bits$iv$iv$iv = (int) (center >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & center);
        return new android.graphics.SweepGradient(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2), makeTransparentColors(r11, numTransparentColors), makeTransparentStops(r12, r11, numTransparentColors));
    }

    /* JADX INFO: renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m4266ActualImageShaderF49vj9s(ImageBitmap image, int tileModeX, int tileModeY) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(image), AndroidTileMode_androidKt.m4271toAndroidTileMode0vamqd0(tileModeX), AndroidTileMode_androidKt.m4271toAndroidTileMode0vamqd0(tileModeY));
    }

    public static final int countTransparentColors(List<Color> r1) {
        return 0;
    }

    public static final int[] makeTransparentColors(List<Color> r5, int numTransparentColors) {
        int r0 = r5.size();
        int[] r1 = new int[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1[r2] = ColorKt.m4420toArgb8_81llA(r5.get(r2).m4376unboximpl());
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public static final float[] makeTransparentStops(List<Float> r10, List<Color> r11, int numTransparentColors) {
        if (numTransparentColors != 0) goto L7;
        if (r10 != null) goto L33;
        return null;
    L33:
        return CollectionsKt.toFloatArray(r10);
    L7:
        float[] newStops = new float[r11.size() + numTransparentColors];
        if (r10 == null) goto L10;
        float r3 = r10.get(0).floatValue();
    L11:
        newStops[0] = r3;
        int newStopsIndex = 1;
        int i = 1;
        int r5 = CollectionsKt.getLastIndex(r11);
    L12:
        if (i >= r5) goto L25;
        long color = r11.get(i).m4376unboximpl();
        if (r10 == null) goto L16;
        float stop = r10.get(i).floatValue();
    L17:
        int newStopsIndex2 = newStopsIndex + 1;
        newStops[newStopsIndex] = stop;
        if (Color.m4368getAlphaimpl(color) != 0.0f) goto L20;
        boolean r4 = true;
    L21:
        if (r4 == false) goto L23;
        newStopsIndex = newStopsIndex2 + 1;
        newStops[newStopsIndex2] = stop;
    L24:
        i = i + 1;
        goto L12
    L23:
        newStopsIndex = newStopsIndex2;
        goto L24
    L20:
        r4 = false;
        goto L21
    L16:
        stop = i / CollectionsKt.getLastIndex(r11);
        goto L17
    L25:
        if (r10 == null) goto L27;
        float r1 = r10.get(CollectionsKt.getLastIndex(r11)).floatValue();
    L28:
        newStops[newStopsIndex] = r1;
        return newStops;
    L27:
        r1 = 1.0f;
        goto L28
    L10:
        r3 = 0.0f;
        goto L11
    }

    private static final void validateColorStops(List<Color> r2, List<Float> r3) {
        if (r3 != null) goto L9;
        if (r2.size() < 2) goto L7;
        return;
    L7:
        throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
    L9:
        if (r2.size() != r3.size()) goto L12;
        return;
    L12:
        throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
    }
}
