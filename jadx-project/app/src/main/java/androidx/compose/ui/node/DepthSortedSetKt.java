package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: compiled from: DepthSortedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\"\u001e\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"DepthComparator", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DepthSortedSetKt {
    private static final Comparator<LayoutNode> DepthComparator = null;

    public static final /* synthetic */ Comparator access$getDepthComparator$p() {
        return DepthComparator;
    }

    static {
        DepthComparator = new DepthSortedSetKt$DepthComparator$1();
    }
}
