package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class LazyStaggeredGridMeasureKt$measure$1$29$1 extends Lambda implements Function1<LazyStaggeredGridMeasuredItem, CharSequence> {
    public static final LazyStaggeredGridMeasureKt$measure$1$29$1 INSTANCE = null;

    static {
        INSTANCE = new LazyStaggeredGridMeasureKt$measure$1$29$1();
    }

    LazyStaggeredGridMeasureKt$measure$1$29$1() {
        super(1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(LazyStaggeredGridMeasuredItem it) {
        return String.valueOf(it.getIndex());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(LazyStaggeredGridMeasuredItem r2) {
        return invoke2(r2);
    }
}
