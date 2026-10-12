package androidx.compose.ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Lab.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J=\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", HintConstants.AUTOFILL_HINT_NAME, "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Lab extends ColorSpace {
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;
    public static final Companion Companion = null;
    private static final float D = 0.20689656f;

    /* JADX INFO: compiled from: Lab.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab$Companion;", "", "()V", "A", "", "B", "C", "D", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public Lab(String name, int id) {
        super(name, ColorModel.Companion.m4779getLabxdoWZVw(), id, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        if (component != 0) goto L4;
        return 0.0f;
    L4:
        return -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        if (component != 0) goto L4;
        return 100.0f;
    L4:
        return 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v) {
        float $this$fastCoerceIn$iv = v[0];
        float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L6;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv <= 100.0f) goto L8;
        $this$fastCoerceAtLeast$iv$iv = 100.0f;
    L8:
        v[0] = $this$fastCoerceAtLeast$iv$iv;
        float $this$fastCoerceIn$iv2 = v[1];
        float $this$fastCoerceAtLeast$iv$iv2 = $this$fastCoerceIn$iv2;
        if ($this$fastCoerceAtLeast$iv$iv2 >= (-128.0f)) goto L12;
        $this$fastCoerceAtLeast$iv$iv2 = -128.0f;
    L12:
        if ($this$fastCoerceAtLeast$iv$iv2 <= 128.0f) goto L14;
        $this$fastCoerceAtLeast$iv$iv2 = 128.0f;
    L14:
        v[1] = $this$fastCoerceAtLeast$iv$iv2;
        float $this$fastCoerceIn$iv3 = v[2];
        float $this$fastCoerceAtLeast$iv$iv3 = $this$fastCoerceIn$iv3;
        if ($this$fastCoerceAtLeast$iv$iv3 >= (-128.0f)) goto L18;
        $this$fastCoerceAtLeast$iv$iv3 = -128.0f;
    L18:
        if ($this$fastCoerceAtLeast$iv$iv3 <= 128.0f) goto L20;
        $this$fastCoerceAtLeast$iv$iv3 = 128.0f;
    L20:
        v[2] = $this$fastCoerceAtLeast$iv$iv3;
        float fy = (v[0] + 16.0f) / 116.0f;
        float fx = (v[1] * 0.002f) + fy;
        float fz = fy - (v[2] * 0.005f);
        if (fx <= D) goto L23;
        float x = (fx * fx) * fx;
    L25:
        if (fy <= D) goto L27;
        float y = (fy * fy) * fy;
    L29:
        if (fz <= D) goto L31;
        float z = (fz * fz) * fz;
    L32:
        v[0] = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0] * x;
        v[1] = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1] * y;
        v[2] = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2] * z;
        return v;
    L31:
        z = (fz - C) * 0.12841855f;
        goto L32
    L27:
        y = (fy - C) * 0.12841855f;
        goto L29
    L23:
        x = (fx - C) * 0.12841855f;
        goto L25
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v1, float v2) {
        float $this$fastCoerceAtLeast$iv$iv = v0;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L6;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv <= 100.0f) goto L8;
        $this$fastCoerceAtLeast$iv$iv = 100.0f;
    L8:
        float $this$fastCoerceAtLeast$iv$iv2 = v1;
        if ($this$fastCoerceAtLeast$iv$iv2 >= (-128.0f)) goto L12;
        $this$fastCoerceAtLeast$iv$iv2 = -128.0f;
    L12:
        if ($this$fastCoerceAtLeast$iv$iv2 <= 128.0f) goto L14;
        $this$fastCoerceAtLeast$iv$iv2 = 128.0f;
    L14:
        float fy = (16.0f + $this$fastCoerceAtLeast$iv$iv) / 116.0f;
        float fx = (0.002f * $this$fastCoerceAtLeast$iv$iv2) + fy;
        if (fx <= D) goto L17;
        float x = (fx * fx) * fx;
    L19:
        if (fy <= D) goto L21;
        float y = (fy * fy) * fy;
    L22:
        float val1$iv = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0] * x;
        float val2$iv = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1] * y;
        long v1$iv = Float.floatToRawIntBits(val1$iv);
        long v2$iv = Float.floatToRawIntBits(val2$iv);
        return (v1$iv << 32) | (4294967295L & v2$iv);
    L21:
        y = (fy - C) * 0.12841855f;
        goto L22
    L17:
        x = (fx - C) * 0.12841855f;
        goto L19
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v1, float v2) {
        float $this$fastCoerceAtLeast$iv$iv = v0;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L6;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv <= 100.0f) goto L8;
        $this$fastCoerceAtLeast$iv$iv = 100.0f;
    L8:
        float $this$fastCoerceAtLeast$iv$iv2 = v2;
        if ($this$fastCoerceAtLeast$iv$iv2 >= (-128.0f)) goto L12;
        $this$fastCoerceAtLeast$iv$iv2 = -128.0f;
    L12:
        if ($this$fastCoerceAtLeast$iv$iv2 <= 128.0f) goto L14;
        $this$fastCoerceAtLeast$iv$iv2 = 128.0f;
    L14:
        float fy = (16.0f + $this$fastCoerceAtLeast$iv$iv) / 116.0f;
        float fz = fy - (0.005f * $this$fastCoerceAtLeast$iv$iv2);
        if (fz <= D) goto L17;
        float z = (fz * fz) * fz;
    L19:
        return Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2] * z;
    L17:
        z = (fz - C) * 0.12841855f;
        goto L19
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4783xyzaToColorJlNiLsg$ui_graphics_release(float x, float y, float z, float a, ColorSpace colorSpace) {
        float x1 = x / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        float y1 = y / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        float z1 = z / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        if (x1 <= A) goto L5;
        float fx = (float) Math.cbrt(x1);
    L7:
        if (y1 <= A) goto L9;
        float fy = (float) Math.cbrt(y1);
    L11:
        if (z1 <= A) goto L13;
        float fz = (float) Math.cbrt(z1);
    L14:
        float l = (116.0f * fy) - 16.0f;
        float a1 = (fx - fy) * 500.0f;
        float b = (fy - fz) * 200.0f;
        float $this$fastCoerceAtLeast$iv$iv = l;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L18;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L18:
        if ($this$fastCoerceAtLeast$iv$iv <= 100.0f) goto L20;
        $this$fastCoerceAtLeast$iv$iv = 100.0f;
    L20:
        float $this$fastCoerceAtLeast$iv$iv2 = a1;
        if ($this$fastCoerceAtLeast$iv$iv2 >= (-128.0f)) goto L24;
        $this$fastCoerceAtLeast$iv$iv2 = -128.0f;
    L24:
        if ($this$fastCoerceAtLeast$iv$iv2 <= 128.0f) goto L26;
        $this$fastCoerceAtLeast$iv$iv2 = 128.0f;
    L26:
        float $this$fastCoerceAtLeast$iv$iv3 = b;
        if ($this$fastCoerceAtLeast$iv$iv3 >= (-128.0f)) goto L30;
        $this$fastCoerceAtLeast$iv$iv3 = -128.0f;
    L30:
        if ($this$fastCoerceAtLeast$iv$iv3 <= 128.0f) goto L33;
        $this$fastCoerceAtLeast$iv$iv3 = 128.0f;
    L33:
        return ColorKt.Color($this$fastCoerceAtLeast$iv$iv, $this$fastCoerceAtLeast$iv$iv2, $this$fastCoerceAtLeast$iv$iv3, a, colorSpace);
    L13:
        fz = (B * z1) + C;
        goto L14
    L9:
        fy = (y1 * B) + C;
        goto L11
    L5:
        fx = (x1 * B) + C;
        goto L7
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v) {
        float x = v[0] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        float y = v[1] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        float z = v[2] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        if (x <= A) goto L5;
        float fx = (float) Math.cbrt(x);
    L7:
        if (y <= A) goto L9;
        float fy = (float) Math.cbrt(y);
    L11:
        if (z <= A) goto L13;
        float fz = (float) Math.cbrt(z);
    L14:
        float l = (116.0f * fy) - 16.0f;
        float a = (fx - fy) * 500.0f;
        float b = (fy - fz) * 200.0f;
        float $this$fastCoerceAtLeast$iv$iv = l;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L18;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L18:
        if ($this$fastCoerceAtLeast$iv$iv <= 100.0f) goto L20;
        $this$fastCoerceAtLeast$iv$iv = 100.0f;
    L20:
        v[0] = $this$fastCoerceAtLeast$iv$iv;
        float $this$fastCoerceAtLeast$iv$iv2 = a;
        if ($this$fastCoerceAtLeast$iv$iv2 >= (-128.0f)) goto L24;
        $this$fastCoerceAtLeast$iv$iv2 = -128.0f;
    L24:
        if ($this$fastCoerceAtLeast$iv$iv2 <= 128.0f) goto L26;
        $this$fastCoerceAtLeast$iv$iv2 = 128.0f;
    L26:
        v[1] = $this$fastCoerceAtLeast$iv$iv2;
        float $this$fastCoerceAtLeast$iv$iv3 = b;
        if ($this$fastCoerceAtLeast$iv$iv3 >= (-128.0f)) goto L30;
        $this$fastCoerceAtLeast$iv$iv3 = -128.0f;
    L30:
        if ($this$fastCoerceAtLeast$iv$iv3 <= 128.0f) goto L32;
        $this$fastCoerceAtLeast$iv$iv3 = 128.0f;
    L32:
        v[2] = $this$fastCoerceAtLeast$iv$iv3;
        return v;
    L13:
        fz = (B * z) + C;
        goto L14
    L9:
        fy = (y * B) + C;
        goto L11
    L5:
        fx = (x * B) + C;
        goto L7
    }
}
