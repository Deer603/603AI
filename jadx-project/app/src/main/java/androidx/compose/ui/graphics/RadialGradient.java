package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RadialGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List r1, List r2, long r3, float r5, int r6, DefaultConstructorMarker r7) {
        this(r1, r2, r3, r5, r6);
    }

    public /* synthetic */ RadialGradient(List r9, List r10, long r11, float r13, int r14, int r15, DefaultConstructorMarker r16) {
        if ((r15 & 2) == 0) goto L5;
        List r2 = null;
    L7:
        if ((r15 & 16) == 0) goto L9;
        int r6 = TileMode.Companion.m4739getClamp3opZhB0();
    L10:
        this(r9, r2, r11, r13, r6, null);
        return;
    L9:
        r6 = r14;
        goto L10
    L5:
        r2 = r10;
        goto L7
    }

    private RadialGradient(List<Color> r1, List<Float> r2, long center, float radius, int tileMode) {
        this.colors = r1;
        this.stops = r2;
        this.center = center;
        this.radius = radius;
        this.tileMode = tileMode;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo4314getIntrinsicSizeNHjbRc() {
        float $this$fastIsFinite$iv = this.radius;
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv) & Integer.MAX_VALUE) >= 2139095040) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L9;
        float width$iv = this.radius * 2.0f;
        float height$iv = this.radius * 2.0f;
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    L9:
        return Size.Companion.m4202getUnspecifiedNHjbRc();
    L5:
        r2 = false;
        goto L6
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo4335createShaderuvyYCjk(long size) {
        long $this$isUnspecified$iv = this.center;
        boolean r7 = true;
        if ((9223372034707292159L & $this$isUnspecified$iv) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r3 = true;
    L7:
        if (r3 == false) goto L9;
        long drawCenter = SizeKt.m4204getCenteruvyYCjk(size);
        float r15 = Float.POSITIVE_INFINITY;
        long r16 = 4294967295L;
        int bits$iv$iv$iv = (int) (drawCenter >> 32);
        float centerX = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (drawCenter & 4294967295L);
        float centerY = Float.intBitsToFloat(bits$iv$iv$iv2);
    L24:
        List<Color> r1 = this.colors;
        List<Float> r2 = this.stops;
        long v1$iv$iv = Float.floatToRawIntBits(centerX);
        long v2$iv$iv = Float.floatToRawIntBits(centerY);
        long r18 = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & r16));
        if (this.radius == r15) goto L28;
        r7 = false;
    L28:
        if (r7 == false) goto L30;
        float r4 = Size.m4193getMinDimensionimpl(size) / 2.0f;
    L32:
        return ShaderKt.m4683RadialGradientShader8uybcMk(r18, r4, r1, r2, this.tileMode);
    L30:
        r4 = this.radius;
        goto L32
    L9:
        r15 = Float.POSITIVE_INFINITY;
        r16 = 4294967295L;
        long arg0$iv = this.center;
        int bits$iv$iv$iv3 = (int) (arg0$iv >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv3) != Float.POSITIVE_INFINITY) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        int bits$iv$iv$iv4 = (int) (size >> 32);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv4);
    L16:
        centerX = r10;
        long arg0$iv2 = this.center;
        int bits$iv$iv$iv5 = (int) (arg0$iv2 & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv5) != Float.POSITIVE_INFINITY) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        int bits$iv$iv$iv6 = (int) (size & 4294967295L);
        float r11 = Float.intBitsToFloat(bits$iv$iv$iv6);
    L23:
        centerY = r11;
        goto L24
    L22:
        long arg0$iv3 = this.center;
        int bits$iv$iv$iv7 = (int) (arg0$iv3 & 4294967295L);
        r11 = Float.intBitsToFloat(bits$iv$iv$iv7);
        goto L23
    L19:
        r6 = false;
        goto L20
    L15:
        long arg0$iv4 = this.center;
        int bits$iv$iv$iv8 = (int) (arg0$iv4 >> 32);
        r10 = Float.intBitsToFloat(bits$iv$iv$iv8);
        goto L16
    L12:
        r5 = false;
        goto L13
    L5:
        r3 = false;
        goto L7
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof RadialGradient) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.colors, ((RadialGradient) other).colors) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.stops, ((RadialGradient) other).stops) == true) goto L15;
        return false;
    L15:
        if (Offset.m4122equalsimpl0(this.center, ((RadialGradient) other).center) == true) goto L18;
        return false;
    L18:
        if (this.radius != ((RadialGradient) other).radius) goto L20;
        boolean r1 = true;
    L21:
        if (r1 == true) goto L24;
        return false;
    L24:
        if (TileMode.m4735equalsimpl0(this.tileMode, ((RadialGradient) other).tileMode) == true) goto L26;
        return false;
    L26:
        return true;
    L20:
        r1 = false;
        goto L21
    }

    public int hashCode() {
        int result = this.colors.hashCode();
        int r1 = result * 31;
        List<Float> r2 = this.stops;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L6:
        int result2 = r1 + r3;
        return (((((result2 * 31) + Offset.m4127hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m4736hashCodeimpl(this.tileMode);
    L5:
        r3 = 0;
        goto L6
    }

    public String toString() {
        long $this$isSpecified$iv = this.center;
        boolean r4 = true;
        if ((9223372034707292159L & $this$isSpecified$iv) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r0 = true;
    L6:
        String radiusValue = "";
        if (r0 == false) goto L9;
        String centerValue = "center=" + Offset.m4133toStringimpl(this.center) + ", ";
    L10:
        float $this$fastIsFinite$iv = this.radius;
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv) & Integer.MAX_VALUE) < 2139095040) goto L14;
        r4 = false;
    L14:
        if (r4 == false) goto L17;
        radiusValue = "radius=" + this.radius + ", ";
    L17:
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + centerValue + radiusValue + "tileMode=" + TileMode.m4737toStringimpl(this.tileMode) + ')';
    L9:
        centerValue = "";
        goto L10
    L5:
        r0 = false;
        goto L6
    }
}
