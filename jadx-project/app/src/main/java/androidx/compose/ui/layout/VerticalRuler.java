package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

/* JADX INFO: compiled from: Ruler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/layout/VerticalRuler;", "Landroidx/compose/ui/layout/Ruler;", "()V", "calculateCoordinate", "", "coordinate", "sourceCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "targetCoordinates", "calculateCoordinate$ui_release", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VerticalRuler extends Ruler {
    public static final int $stable = 0;

    static {
    }

    public VerticalRuler() {
        super(null);
    }

    @Override // androidx.compose.ui.layout.Ruler
    public float calculateCoordinate$ui_release(float coordinate, LayoutCoordinates sourceCoordinates, LayoutCoordinates targetCoordinates) {
        long arg0$iv = sourceCoordinates.mo5722getSizeYbymL2g();
        float y$iv = ((int) (arg0$iv & 4294967295L)) / 2.0f;
        long v1$iv$iv = Float.floatToRawIntBits(coordinate);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long offset = Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
        long arg0$iv2 = targetCoordinates.mo5723localPositionOfR5De75A(sourceCoordinates, offset);
        int bits$iv$iv$iv = (int) (arg0$iv2 >> 32);
        return Float.intBitsToFloat(bits$iv$iv$iv);
    }
}
