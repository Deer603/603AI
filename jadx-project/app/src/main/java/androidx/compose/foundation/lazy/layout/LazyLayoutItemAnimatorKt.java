package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"EmptyArray", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "specs", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "", "getSpecs", "(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutItemAnimatorKt {
    private static final LazyLayoutItemAnimation[] EmptyArray = null;

    public static final /* synthetic */ LazyLayoutItemAnimation[] access$getEmptyArray$p() {
        return EmptyArray;
    }

    public static final /* synthetic */ LazyLayoutAnimationSpecsNode access$getSpecs(Object $receiver) {
        return getSpecs($receiver);
    }

    private static final LazyLayoutAnimationSpecsNode getSpecs(Object $this$specs) {
        if (($this$specs instanceof LazyLayoutAnimationSpecsNode) == true) goto L7;
        return null;
    L7:
        return (LazyLayoutAnimationSpecsNode) $this$specs;
    }

    static {
        EmptyArray = new LazyLayoutItemAnimation[0];
    }
}
