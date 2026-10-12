package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidColorSpace.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/ColorSpaceVerificationHelperV34;", "", "()V", "obtainAndroidColorSpace", "Landroid/graphics/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "obtainComposeColorSpaceFromId", "id", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ColorSpaceVerificationHelperV34 {
    public static final ColorSpaceVerificationHelperV34 INSTANCE = null;

    static {
        INSTANCE = new ColorSpaceVerificationHelperV34();
    }

    private ColorSpaceVerificationHelperV34() {
    }

    @JvmStatic
    public static final ColorSpace obtainAndroidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        if (Intrinsics.areEqual(colorSpace, ColorSpaces.INSTANCE.getBt2020Hlg()) == false) goto L6;
        return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
    L6:
        if (Intrinsics.areEqual(colorSpace, ColorSpaces.INSTANCE.getBt2020Pq()) == true) goto L11;
        return null;
    L11:
        return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
    }

    @JvmStatic
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace obtainComposeColorSpaceFromId(int id) {
        if (id != ColorSpace.Named.BT2020_HLG.ordinal()) goto L6;
        return ColorSpaces.INSTANCE.getBt2020Hlg();
    L6:
        if (id != ColorSpace.Named.BT2020_PQ.ordinal()) goto L9;
        return ColorSpaces.INSTANCE.getBt2020Pq();
    L9:
        return ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release();
    }
}
