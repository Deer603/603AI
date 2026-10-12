package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends FunctionReferenceImpl implements Function2<Integer, Integer, int[]> {
    LazyStaggeredGridState$scrollPosition$1(Object r8) {
        super(2, r8, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ int[] invoke(Integer r3, Integer r4) {
        return invoke(r3.intValue(), r4.intValue());
    }

    public final int[] invoke(int p0, int p1) {
        return LazyStaggeredGridState.access$fillNearestIndices((LazyStaggeredGridState) this.receiver, p0, p1);
    }
}
