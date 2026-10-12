package androidx.graphics.path;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ConicConverter.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0004J1\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0082 J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/graphics/path/ConicConverter;", "", "()V", "currentQuadratic", "", "getCurrentQuadratic", "()I", "setCurrentQuadratic", "(I)V", "<set-?>", "quadraticCount", "getQuadraticCount", "quadraticData", "", "convert", "", "points", "weight", "", "tolerance", "offset", "internalConicToQuadratics", "conicPoints", "quadraticPoints", "nextQuadratic", "", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConicConverter {
    private int currentQuadratic;
    private int quadraticCount;
    private float[] quadraticData;

    private final native int internalConicToQuadratics(float[] r1, int r2, float[] r3, float r4, float r5);

    public ConicConverter() {
        this.quadraticData = new float[130];
    }

    public final int getQuadraticCount() {
        return this.quadraticCount;
    }

    public final int getCurrentQuadratic() {
        return this.currentQuadratic;
    }

    public final void setCurrentQuadratic(int r1) {
        this.currentQuadratic = r1;
    }

    public static /* synthetic */ boolean nextQuadratic$default(ConicConverter r0, float[] r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        return r0.nextQuadratic(r1, r2);
    }

    public final boolean nextQuadratic(float[] points, int offset) {
        Intrinsics.checkNotNullParameter(points, "points");
        if (this.currentQuadratic >= this.quadraticCount) goto L6;
        int index = (this.currentQuadratic * 2) * 2;
        points[offset + 0] = this.quadraticData[index];
        points[offset + 1] = this.quadraticData[index + 1];
        points[offset + 2] = this.quadraticData[index + 2];
        points[offset + 3] = this.quadraticData[index + 3];
        points[offset + 4] = this.quadraticData[index + 4];
        points[offset + 5] = this.quadraticData[index + 5];
        this.currentQuadratic++;
        return true;
    L6:
        return false;
    }

    public static /* synthetic */ void convert$default(ConicConverter r0, float[] r1, float r2, float r3, int r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = 0;
    L5:
        r0.convert(r1, r2, r3, r4);
    }

    public final void convert(float[] points, float weight, float tolerance, int offset) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.quadraticCount = internalConicToQuadratics(points, offset, this.quadraticData, weight, tolerance);
        int newDataSize = ((this.quadraticCount * 2) * 2) + 2;
        if (newDataSize <= this.quadraticData.length) goto L5;
        this.quadraticData = new float[newDataSize];
        this.quadraticCount = internalConicToQuadratics(points, offset, this.quadraticData, weight, tolerance);
    L5:
        this.currentQuadratic = 0;
    }
}
