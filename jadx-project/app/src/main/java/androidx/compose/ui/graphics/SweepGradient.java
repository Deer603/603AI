package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u001e\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "center", "Landroidx/compose/ui/geometry/Offset;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "Landroidx/compose/ui/geometry/Size;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SweepGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final List<Float> stops;

    public /* synthetic */ SweepGradient(long r1, List r3, List r4, DefaultConstructorMarker r5) {
        this(r1, r3, r4);
    }

    public /* synthetic */ SweepGradient(long r7, List r9, List r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 4) == 0) goto L5;
        List r4 = null;
    L6:
        this(r7, r9, r4, null);
        return;
    L5:
        r4 = r10;
        goto L6
    }

    private SweepGradient(long center, List<Color> r3, List<Float> r4) {
        this.center = center;
        this.colors = r3;
        this.stops = r4;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo4335createShaderuvyYCjk(long size) {
        long $this$isUnspecified$iv = this.center;
        boolean r5 = true;
        if ((9223372034707292159L & $this$isUnspecified$iv) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L8;
        long r2 = SizeKt.m4204getCenteruvyYCjk(size);
    L24:
        return ShaderKt.m4685SweepGradientShader9KIMszo(r2, this.colors, this.stops);
    L8:
        long arg0$iv = this.center;
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv) != Float.POSITIVE_INFINITY) goto L11;
        boolean r3 = true;
    L12:
        if (r3 == false) goto L14;
        int bits$iv$iv$iv2 = (int) (size >> 32);
        float x$iv = Float.intBitsToFloat(bits$iv$iv$iv2);
    L15:
        long arg0$iv2 = this.center;
        int bits$iv$iv$iv3 = (int) (arg0$iv2 & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv3) == Float.POSITIVE_INFINITY) goto L19;
        r5 = false;
    L19:
        if (r5 == false) goto L21;
        int bits$iv$iv$iv4 = (int) (size & 4294967295L);
        float y$iv = Float.intBitsToFloat(bits$iv$iv$iv4);
    L22:
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        r2 = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        goto L24
    L21:
        long arg0$iv3 = this.center;
        int bits$iv$iv$iv5 = (int) (arg0$iv3 & 4294967295L);
        y$iv = Float.intBitsToFloat(bits$iv$iv$iv5);
        goto L22
    L14:
        long arg0$iv4 = this.center;
        int bits$iv$iv$iv6 = (int) (arg0$iv4 >> 32);
        x$iv = Float.intBitsToFloat(bits$iv$iv$iv6);
        goto L15
    L11:
        r3 = false;
        goto L12
    L5:
        r1 = false;
        goto L6
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof SweepGradient) == true) goto L9;
        return false;
    L9:
        if (Offset.m4122equalsimpl0(this.center, ((SweepGradient) other).center) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.colors, ((SweepGradient) other).colors) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.stops, ((SweepGradient) other).stops) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int result = Offset.m4127hashCodeimpl(this.center);
        int result2 = (result * 31) + this.colors.hashCode();
        int result3 = result2 * 31;
        List<Float> r2 = this.stops;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return result3 + r3;
    L5:
        r3 = 0;
        goto L7
    }

    public String toString() {
        long $this$isSpecified$iv = this.center;
        if ((9223372034707292159L & $this$isSpecified$iv) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L8;
        String centerValue = "center=" + Offset.m4133toStringimpl(this.center) + ", ";
    L10:
        return "SweepGradient(" + centerValue + "colors=" + this.colors + ", stops=" + this.stops + ')';
    L8:
        centerValue = "";
        goto L10
    L5:
        r3 = false;
        goto L6
    }
}
