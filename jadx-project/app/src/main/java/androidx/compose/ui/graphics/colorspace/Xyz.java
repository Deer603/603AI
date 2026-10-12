package androidx.compose.ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Xyz.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0082\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J%\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J%\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\u001bJ=\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Xyz;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", HintConstants.AUTOFILL_HINT_NAME, "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "clamp", "", "x", "fromXyz", "", "v", "getMaxValue", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Xyz extends ColorSpace {
    public Xyz(String name, int id) {
        super(name, ColorModel.Companion.m4781getXyzxdoWZVw(), id, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v) {
        float x$iv = v[0];
        float $this$fastCoerceAtLeast$iv$iv$iv = x$iv;
        if ($this$fastCoerceAtLeast$iv$iv$iv >= (-2.0f)) goto L6;
        $this$fastCoerceAtLeast$iv$iv$iv = -2.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv$iv <= 2.0f) goto L8;
        $this$fastCoerceAtLeast$iv$iv$iv = 2.0f;
    L8:
        v[0] = $this$fastCoerceAtLeast$iv$iv$iv;
        float x$iv2 = v[1];
        float $this$fastCoerceAtLeast$iv$iv$iv2 = x$iv2;
        if ($this$fastCoerceAtLeast$iv$iv$iv2 >= (-2.0f)) goto L12;
        $this$fastCoerceAtLeast$iv$iv$iv2 = -2.0f;
    L12:
        if ($this$fastCoerceAtLeast$iv$iv$iv2 <= 2.0f) goto L14;
        $this$fastCoerceAtLeast$iv$iv$iv2 = 2.0f;
    L14:
        v[1] = $this$fastCoerceAtLeast$iv$iv$iv2;
        float x$iv3 = v[2];
        float $this$fastCoerceAtLeast$iv$iv$iv3 = x$iv3;
        if ($this$fastCoerceAtLeast$iv$iv$iv3 >= (-2.0f)) goto L18;
        $this$fastCoerceAtLeast$iv$iv$iv3 = -2.0f;
    L18:
        if ($this$fastCoerceAtLeast$iv$iv$iv3 <= 2.0f) goto L20;
        $this$fastCoerceAtLeast$iv$iv$iv3 = 2.0f;
    L20:
        v[2] = $this$fastCoerceAtLeast$iv$iv$iv3;
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v1, float v2) {
        float $this$fastCoerceAtLeast$iv$iv$iv = v0;
        if ($this$fastCoerceAtLeast$iv$iv$iv >= (-2.0f)) goto L6;
        $this$fastCoerceAtLeast$iv$iv$iv = -2.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv$iv <= 2.0f) goto L8;
        $this$fastCoerceAtLeast$iv$iv$iv = 2.0f;
    L8:
        float $this$fastCoerceAtLeast$iv$iv$iv2 = v1;
        if ($this$fastCoerceAtLeast$iv$iv$iv2 >= (-2.0f)) goto L12;
        $this$fastCoerceAtLeast$iv$iv$iv2 = -2.0f;
    L12:
        if ($this$fastCoerceAtLeast$iv$iv$iv2 <= 2.0f) goto L14;
        $this$fastCoerceAtLeast$iv$iv$iv2 = 2.0f;
    L14:
        long v1$iv = Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv$iv);
        long v2$iv = Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv$iv2);
        return (v1$iv << 32) | (4294967295L & v2$iv);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v1, float v2) {
        float $this$fastCoerceAtLeast$iv$iv$iv = v2;
        if ($this$fastCoerceAtLeast$iv$iv$iv >= (-2.0f)) goto L6;
        $this$fastCoerceAtLeast$iv$iv$iv = -2.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv$iv > 2.0f) goto L9;
        return $this$fastCoerceAtLeast$iv$iv$iv;
    L9:
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4783xyzaToColorJlNiLsg$ui_graphics_release(float x, float y, float z, float a, ColorSpace colorSpace) {
        float $this$fastCoerceAtLeast$iv$iv$iv = x;
        if ($this$fastCoerceAtLeast$iv$iv$iv >= (-2.0f)) goto L6;
        $this$fastCoerceAtLeast$iv$iv$iv = -2.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv$iv <= 2.0f) goto L8;
        $this$fastCoerceAtLeast$iv$iv$iv = 2.0f;
    L8:
        float $this$fastCoerceAtLeast$iv$iv$iv2 = y;
        if ($this$fastCoerceAtLeast$iv$iv$iv2 >= (-2.0f)) goto L12;
        $this$fastCoerceAtLeast$iv$iv$iv2 = -2.0f;
    L12:
        if ($this$fastCoerceAtLeast$iv$iv$iv2 <= 2.0f) goto L14;
        $this$fastCoerceAtLeast$iv$iv$iv2 = 2.0f;
    L14:
        float $this$fastCoerceAtLeast$iv$iv$iv3 = z;
        if ($this$fastCoerceAtLeast$iv$iv$iv3 >= (-2.0f)) goto L18;
        $this$fastCoerceAtLeast$iv$iv$iv3 = -2.0f;
    L18:
        if ($this$fastCoerceAtLeast$iv$iv$iv3 <= 2.0f) goto L21;
        $this$fastCoerceAtLeast$iv$iv$iv3 = 2.0f;
    L21:
        return ColorKt.Color($this$fastCoerceAtLeast$iv$iv$iv, $this$fastCoerceAtLeast$iv$iv$iv2, $this$fastCoerceAtLeast$iv$iv$iv3, a, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v) {
        float x$iv = v[0];
        float $this$fastCoerceAtLeast$iv$iv$iv = x$iv;
        if ($this$fastCoerceAtLeast$iv$iv$iv >= (-2.0f)) goto L6;
        $this$fastCoerceAtLeast$iv$iv$iv = -2.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv$iv <= 2.0f) goto L8;
        $this$fastCoerceAtLeast$iv$iv$iv = 2.0f;
    L8:
        v[0] = $this$fastCoerceAtLeast$iv$iv$iv;
        float x$iv2 = v[1];
        float $this$fastCoerceAtLeast$iv$iv$iv2 = x$iv2;
        if ($this$fastCoerceAtLeast$iv$iv$iv2 >= (-2.0f)) goto L12;
        $this$fastCoerceAtLeast$iv$iv$iv2 = -2.0f;
    L12:
        if ($this$fastCoerceAtLeast$iv$iv$iv2 <= 2.0f) goto L14;
        $this$fastCoerceAtLeast$iv$iv$iv2 = 2.0f;
    L14:
        v[1] = $this$fastCoerceAtLeast$iv$iv$iv2;
        float x$iv3 = v[2];
        float $this$fastCoerceAtLeast$iv$iv$iv3 = x$iv3;
        if ($this$fastCoerceAtLeast$iv$iv$iv3 >= (-2.0f)) goto L18;
        $this$fastCoerceAtLeast$iv$iv$iv3 = -2.0f;
    L18:
        if ($this$fastCoerceAtLeast$iv$iv$iv3 <= 2.0f) goto L20;
        $this$fastCoerceAtLeast$iv$iv$iv3 = 2.0f;
    L20:
        v[2] = $this$fastCoerceAtLeast$iv$iv$iv3;
        return v;
    }

    private final float clamp(float x) {
        float $this$fastCoerceAtLeast$iv$iv = x;
        if ($this$fastCoerceAtLeast$iv$iv >= (-2.0f)) goto L6;
        $this$fastCoerceAtLeast$iv$iv = -2.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv > 2.0f) goto L9;
        return $this$fastCoerceAtLeast$iv$iv;
    L9:
        return 2.0f;
    }
}
