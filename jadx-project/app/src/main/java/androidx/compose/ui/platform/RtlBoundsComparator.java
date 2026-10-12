package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/RtlBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class RtlBoundsComparator implements Comparator<SemanticsNode> {
    public static final RtlBoundsComparator INSTANCE = null;

    static {
        INSTANCE = new RtlBoundsComparator();
    }

    private RtlBoundsComparator() {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(SemanticsNode r3, SemanticsNode r4) {
        return compare2(r3, r4);
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(SemanticsNode a, SemanticsNode b) {
        Rect ab = a.getBoundsInWindow();
        Rect bb = b.getBoundsInWindow();
        int r = Float.compare(bb.getRight(), ab.getRight());
        if (r == 0) goto L5;
        return r;
    L5:
        int r2 = Float.compare(ab.getTop(), bb.getTop());
        if (r2 == 0) goto L8;
        return r2;
    L8:
        int r3 = Float.compare(ab.getBottom(), bb.getBottom());
        if (r3 == 0) goto L12;
        return r3;
    L12:
        return Float.compare(bb.getLeft(), ab.getLeft());
    }
}
