package androidx.compose.foundation.gestures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0000¢\u0006\u0002\b\u0010J\r\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0015\u001a\u00020\u0014*\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0086\u0004¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", "T", "", "()V", "keys", "", "getKeys$foundation_release", "()Ljava/util/List;", "positions", "", "getPositions$foundation_release", "()[F", "setPositions$foundation_release", "([F)V", "buildKeys", "", "buildKeys$foundation_release", "buildPositions", "buildPositions$foundation_release", "expandPositions", "", "at", "position", "", "(Ljava/lang/Object;F)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 0;
    private final List<T> keys;
    private float[] positions;

    static {
        $stable = 8;
    }

    public DraggableAnchorsConfig() {
        this.keys = new ArrayList();
        float[] r1 = new float[5];
        int r2 = 0;
    L3:
        if (r2 >= 5) goto L5;
        r1[r2] = Float.NaN;
        r2 = r2 + 1;
        goto L3
    L5:
        this.positions = r1;
    }

    public final List<T> getKeys$foundation_release() {
        return this.keys;
    }

    public final float[] getPositions$foundation_release() {
        return this.positions;
    }

    public final void setPositions$foundation_release(float[] r1) {
        this.positions = r1;
    }

    public final void at(T r3, float position) {
        this.keys.add(r3);
        if (this.positions.length >= this.keys.size()) goto L5;
        expandPositions();
    L5:
        this.positions[this.keys.size() - 1] = position;
    }

    public final float[] buildPositions$foundation_release() {
        return ArraysKt.copyOfRange(this.positions, 0, this.keys.size());
    }

    public final List<T> buildKeys$foundation_release() {
        return this.keys;
    }

    private final void expandPositions() {
        float[] r0 = Arrays.copyOf(this.positions, this.keys.size() + 2);
        Intrinsics.checkNotNullExpressionValue(r0, "copyOf(...)");
        this.positions = r0;
    }
}
