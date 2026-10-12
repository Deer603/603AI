package androidx.compose.ui.platform;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/SemanticsNodeCopy;", "", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "currentSemanticsNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/collection/IntObjectMap;)V", "children", "Landroidx/collection/MutableIntSet;", "getChildren", "()Landroidx/collection/MutableIntSet;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SemanticsNodeCopy {
    public static final int $stable = 0;
    private final MutableIntSet children;
    private final SemanticsConfiguration unmergedConfig;

    static {
        $stable = 8;
    }

    public SemanticsNodeCopy(SemanticsNode semanticsNode, IntObjectMap<SemanticsNodeWithAdjustedBounds> r12) {
        this.unmergedConfig = semanticsNode.getUnmergedConfig$ui_release();
        this.children = new MutableIntSet(semanticsNode.getReplacedChildren$ui_release().size());
        List<SemanticsNode> r0 = semanticsNode.getReplacedChildren$ui_release();
        int index$iv = 0;
        int r3 = r0.size();
    L3:
        if (index$iv >= r3) goto L9;
        Object item$iv = r0.get(index$iv);
        SemanticsNode child = (SemanticsNode) item$iv;
        int key$iv = child.getId();
        if (r12.containsKey(key$iv) == false) goto L7;
        this.children.add(child.getId());
    L7:
        index$iv = index$iv + 1;
        goto L3
    }

    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    public final MutableIntSet getChildren() {
        return this.children;
    }
}
