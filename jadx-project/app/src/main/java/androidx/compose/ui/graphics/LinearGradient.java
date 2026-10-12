package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinearGradient extends ShaderBrush {
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List r1, List r2, long r3, long r5, int r7, DefaultConstructorMarker r8) {
        this(r1, r2, r3, r5, r7);
    }

    public /* synthetic */ LinearGradient(List r10, List r11, long r12, long r14, int r16, int r17, DefaultConstructorMarker r18) {
        if ((r17 & 2) == 0) goto L5;
        List r2 = null;
    L7:
        if ((r17 & 16) == 0) goto L9;
        int r7 = TileMode.Companion.m4739getClamp3opZhB0();
    L10:
        this(r10, r2, r12, r14, r7, null);
        return;
    L9:
        r7 = r16;
        goto L10
    L5:
        r2 = r11;
        goto L7
    }

    private LinearGradient(List<Color> r1, List<Float> r2, long start, long end, int tileMode) {
        this.colors = r1;
        this.stops = r2;
        this.start = start;
        this.end = end;
        this.tileMode = tileMode;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo4314getIntrinsicSizeNHjbRc() {
        long arg0$iv = this.start;
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float r7 = Float.intBitsToFloat(bits$iv$iv$iv);
        boolean r1 = true;
        if (Float.isInfinite(r7) == false) goto L5;
    L7:
        boolean r0 = false;
    L8:
        float height$iv = Float.NaN;
        if (r0 == false) goto L18;
        long arg0$iv2 = this.end;
        int bits$iv$iv$iv2 = (int) (arg0$iv2 >> 32);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv2);
        if (Float.isInfinite(r10) == false) goto L13;
    L15:
        boolean r2 = false;
    L16:
        if (r2 == false) goto L18;
        long arg0$iv3 = this.start;
        int bits$iv$iv$iv3 = (int) (arg0$iv3 >> 32);
        float r11 = Float.intBitsToFloat(bits$iv$iv$iv3);
        long arg0$iv4 = this.end;
        int bits$iv$iv$iv4 = (int) (arg0$iv4 >> 32);
        float width$iv = Math.abs(r11 - Float.intBitsToFloat(bits$iv$iv$iv4));
    L19:
        long arg0$iv5 = this.start;
        int bits$iv$iv$iv5 = (int) (arg0$iv5 & 4294967295L);
        float r13 = Float.intBitsToFloat(bits$iv$iv$iv5);
        if (Float.isInfinite(r13) == false) goto L22;
    L24:
        boolean r4 = false;
    L25:
        if (r4 == false) goto L34;
        long arg0$iv6 = this.end;
        int bits$iv$iv$iv6 = (int) (arg0$iv6 & 4294967295L);
        float r14 = Float.intBitsToFloat(bits$iv$iv$iv6);
        if (Float.isInfinite(r14) == false) goto L29;
    L31:
        r1 = false;
    L32:
        if (r1 == false) goto L34;
        long arg0$iv7 = this.start;
        int bits$iv$iv$iv7 = (int) (arg0$iv7 & 4294967295L);
        float r8 = Float.intBitsToFloat(bits$iv$iv$iv7);
        long arg0$iv8 = this.end;
        int bits$iv$iv$iv8 = (int) (arg0$iv8 & 4294967295L);
        height$iv = Math.abs(r8 - Float.intBitsToFloat(bits$iv$iv$iv8));
        goto L34
    L29:
        if (Float.isNaN(r14) == true) goto L31;
    L34:
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    L22:
        if (Float.isNaN(r13) == true) goto L24;
        r4 = true;
        goto L25
    L13:
        if (Float.isNaN(r10) == true) goto L15;
        r2 = true;
    L18:
        width$iv = Float.NaN;
        goto L19
    L5:
        if (Float.isNaN(r7) == true) goto L7;
        r0 = true;
        goto L8
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo4335createShaderuvyYCjk(long size) {
        long arg0$iv = this.start;
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv) != Float.POSITIVE_INFINITY) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L8;
        int bits$iv$iv$iv2 = (int) (size >> 32);
        float startX = Float.intBitsToFloat(bits$iv$iv$iv2);
    L9:
        long arg0$iv2 = this.start;
        int bits$iv$iv$iv3 = (int) (arg0$iv2 & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv3) != Float.POSITIVE_INFINITY) goto L12;
        boolean r3 = true;
    L13:
        if (r3 == false) goto L15;
        int bits$iv$iv$iv4 = (int) (size & 4294967295L);
        float startY = Float.intBitsToFloat(bits$iv$iv$iv4);
    L16:
        long arg0$iv3 = this.end;
        int bits$iv$iv$iv5 = (int) (arg0$iv3 >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv5) != Float.POSITIVE_INFINITY) goto L19;
        boolean r1 = true;
    L20:
        if (r1 == false) goto L22;
        int bits$iv$iv$iv6 = (int) (size >> 32);
        float endX = Float.intBitsToFloat(bits$iv$iv$iv6);
    L23:
        long arg0$iv4 = this.end;
        int bits$iv$iv$iv7 = (int) (arg0$iv4 & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv7) != Float.POSITIVE_INFINITY) goto L26;
        boolean r16 = true;
    L27:
        if (r16 == false) goto L29;
        int bits$iv$iv$iv8 = (int) (size & 4294967295L);
        float endY = Float.intBitsToFloat(bits$iv$iv$iv8);
        long r17 = 4294967295L;
    L30:
        List<Color> r4 = this.colors;
        List<Float> r5 = this.stops;
        long v1$iv$iv = Float.floatToRawIntBits(startX);
        long v2$iv$iv = Float.floatToRawIntBits(startY);
        long r18 = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & r17));
        long v1$iv$iv2 = Float.floatToRawIntBits(endX);
        long v2$iv$iv2 = Float.floatToRawIntBits(endY);
        return ShaderKt.m4681LinearGradientShaderVjE6UOU(r18, Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & r17)), r4, r5, this.tileMode);
    L29:
        long arg0$iv5 = this.end;
        r17 = 4294967295L;
        int bits$iv$iv$iv9 = (int) (arg0$iv5 & 4294967295L);
        endY = Float.intBitsToFloat(bits$iv$iv$iv9);
        goto L30
    L26:
        r16 = false;
        goto L27
    L22:
        long arg0$iv6 = this.end;
        int bits$iv$iv$iv10 = (int) (arg0$iv6 >> 32);
        endX = Float.intBitsToFloat(bits$iv$iv$iv10);
        goto L23
    L19:
        r1 = false;
        goto L20
    L15:
        long arg0$iv7 = this.start;
        int bits$iv$iv$iv11 = (int) (arg0$iv7 & 4294967295L);
        startY = Float.intBitsToFloat(bits$iv$iv$iv11);
        goto L16
    L12:
        r3 = false;
        goto L13
    L8:
        long arg0$iv8 = this.start;
        int bits$iv$iv$iv12 = (int) (arg0$iv8 >> 32);
        startX = Float.intBitsToFloat(bits$iv$iv$iv12);
        goto L9
    L5:
        r2 = false;
        goto L6
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof LinearGradient) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.colors, ((LinearGradient) other).colors) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.stops, ((LinearGradient) other).stops) == true) goto L15;
        return false;
    L15:
        if (Offset.m4122equalsimpl0(this.start, ((LinearGradient) other).start) == true) goto L18;
        return false;
    L18:
        if (Offset.m4122equalsimpl0(this.end, ((LinearGradient) other).end) == true) goto L21;
        return false;
    L21:
        if (TileMode.m4735equalsimpl0(this.tileMode, ((LinearGradient) other).tileMode) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int result = this.colors.hashCode();
        int r1 = result * 31;
        List<Float> r2 = this.stops;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L6:
        int result2 = r1 + r3;
        return (((((result2 * 31) + Offset.m4127hashCodeimpl(this.start)) * 31) + Offset.m4127hashCodeimpl(this.end)) * 31) + TileMode.m4736hashCodeimpl(this.tileMode);
    L5:
        r3 = 0;
        goto L6
    }

    public String toString() {
        long $this$isFinite$iv = this.start;
        long v$iv = ($this$isFinite$iv & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase;
        boolean r11 = true;
        if (((v$iv - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) != 0) goto L5;
        boolean r1 = true;
    L6:
        String endValue = "";
        if (r1 == false) goto L9;
        String startValue = "start=" + Offset.m4133toStringimpl(this.start) + ", ";
    L10:
        long $this$isFinite$iv2 = this.end;
        long v$iv2 = ($this$isFinite$iv2 & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase;
        if (((v$iv2 - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) goto L14;
        r11 = false;
    L14:
        if (r11 == false) goto L17;
        endValue = "end=" + Offset.m4133toStringimpl(this.end) + ", ";
    L17:
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + startValue + endValue + "tileMode=" + TileMode.m4737toStringimpl(this.tileMode) + ')';
    L9:
        startValue = "";
        goto L10
    L5:
        r1 = false;
        goto L6
    }
}
