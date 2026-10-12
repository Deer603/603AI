package androidx.compose.ui.unit;

import kotlin.Metadata;

/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, d2 = {"Density", "Landroidx/compose/ui/unit/Density;", "density", "", "fontScale", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DensityKt {
    public static final Density Density(float density, float fontScale) {
        return new DensityImpl(density, fontScale);
    }

    public static /* synthetic */ Density Density$default(float r0, float r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = 1.0f;
    L6:
        return Density(r0, r1);
    }
}
