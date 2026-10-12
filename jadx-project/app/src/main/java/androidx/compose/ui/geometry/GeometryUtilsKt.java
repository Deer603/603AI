package androidx.compose.ui.geometry;

import kotlin.Metadata;

/* JADX INFO: compiled from: GeometryUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toStringAsFixed", "", "", "digits", "", "ui-geometry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class GeometryUtilsKt {
    public static final String toStringAsFixed(float $this$toStringAsFixed, int digits) {
        if (Float.isNaN($this$toStringAsFixed) == false) goto L7;
        return "NaN";
    L7:
        if (Float.isInfinite($this$toStringAsFixed) == true) goto L9;
        int clampedDigits = Math.max(digits, 0);
        float pow = (float) Math.pow(10.0d, clampedDigits);
        float shifted = $this$toStringAsFixed * pow;
        float decimal = shifted - ((int) shifted);
        if (decimal < 0.5f) goto L16;
        int roundedShifted = ((int) shifted) + 1;
    L17:
        float rounded = roundedShifted / pow;
        if (clampedDigits <= 0) goto L21;
        return String.valueOf(rounded);
    L21:
        return String.valueOf((int) rounded);
    L16:
        roundedShifted = (int) shifted;
        goto L17
    L9:
        if ($this$toStringAsFixed >= 0.0f) goto L11;
        return "-Infinity";
    L11:
        return "Infinity";
    }
}
