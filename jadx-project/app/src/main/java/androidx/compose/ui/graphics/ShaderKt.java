package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Shader.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\u001a0\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aN\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aN\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a<\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"ImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "LinearGradientShader", "from", "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "LinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "RadialGradientShader", "center", "radius", "RadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "SweepGradientShader", "SweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ShaderKt {
    /* JADX INFO: renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m4682LinearGradientShaderVjE6UOU$default(long r7, long r9, List r11, List r12, int r13, int r14, Object r15) {
        if ((r14 & 8) == 0) goto L5;
        List r5 = null;
    L7:
        if ((r14 & 16) == 0) goto L9;
        int r6 = TileMode.Companion.m4739getClamp3opZhB0();
    L11:
        return m4681LinearGradientShaderVjE6UOU(r7, r9, r11, r5, r6);
    L9:
        r6 = r13;
        goto L11
    L5:
        r5 = r12;
        goto L7
    }

    /* JADX INFO: renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m4681LinearGradientShaderVjE6UOU(long from, long to, List<Color> r5, List<Float> r6, int tileMode) {
        return AndroidShader_androidKt.m4267ActualLinearGradientShaderVjE6UOU(from, to, r5, r6, tileMode);
    }

    /* JADX INFO: renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m4684RadialGradientShader8uybcMk$default(long r6, float r8, List r9, List r10, int r11, int r12, Object r13) {
        if ((r12 & 8) == 0) goto L5;
        List r4 = null;
    L7:
        if ((r12 & 16) == 0) goto L9;
        int r5 = TileMode.Companion.m4739getClamp3opZhB0();
    L11:
        return m4683RadialGradientShader8uybcMk(r6, r8, r9, r4, r5);
    L9:
        r5 = r11;
        goto L11
    L5:
        r4 = r10;
        goto L7
    }

    /* JADX INFO: renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m4683RadialGradientShader8uybcMk(long center, float radius, List<Color> r4, List<Float> r5, int tileMode) {
        return AndroidShader_androidKt.m4268ActualRadialGradientShader8uybcMk(center, radius, r4, r5, tileMode);
    }

    /* JADX INFO: renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m4686SweepGradientShader9KIMszo$default(long r0, List r2, List r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = null;
    L6:
        return m4685SweepGradientShader9KIMszo(r0, r2, r3);
    }

    /* JADX INFO: renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m4685SweepGradientShader9KIMszo(long center, List<Color> r3, List<Float> r4) {
        return AndroidShader_androidKt.m4269ActualSweepGradientShader9KIMszo(center, r3, r4);
    }

    /* JADX INFO: renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m4680ImageShaderF49vj9s$default(ImageBitmap r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r1 = TileMode.Companion.m4739getClamp3opZhB0();
    L6:
        if ((r3 & 4) == 0) goto L9;
        r2 = TileMode.Companion.m4739getClamp3opZhB0();
    L9:
        return m4679ImageShaderF49vj9s(r0, r1, r2);
    }

    /* JADX INFO: renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m4679ImageShaderF49vj9s(ImageBitmap image, int tileModeX, int tileModeY) {
        return AndroidShader_androidKt.m4266ActualImageShaderF49vj9s(image, tileModeX, tileModeY);
    }
}
