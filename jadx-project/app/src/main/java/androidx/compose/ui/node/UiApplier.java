package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import kotlin.Metadata;

/* JADX INFO: compiled from: UiApplier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/UiApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/node/LayoutNode;", "root", "(Landroidx/compose/ui/node/LayoutNode;)V", "insertBottomUp", "", "index", "", "instance", "insertTopDown", "move", "from", "to", "count", "onClear", "onEndChanges", "remove", "reuse", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UiApplier extends AbstractApplier<LayoutNode> {
    public static final int $stable = 0;

    static {
    }

    public UiApplier(LayoutNode root) {
        super(root);
    }

    @Override // androidx.compose.runtime.Applier
    public /* bridge */ /* synthetic */ void insertBottomUp(int index, Object instance) {
        insertBottomUp(index, (LayoutNode) instance);
    }

    @Override // androidx.compose.runtime.Applier
    public /* bridge */ /* synthetic */ void insertTopDown(int index, Object instance) {
        insertTopDown(index, (LayoutNode) instance);
    }

    public void insertTopDown(int index, LayoutNode instance) {
    }

    public void insertBottomUp(int index, LayoutNode instance) {
        getCurrent().insertAt$ui_release(index, instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        getCurrent().removeAt$ui_release(index, count);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to, int count) {
        getCurrent().move$ui_release(from, to, count);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    protected void onClear() {
        getRoot().removeAll$ui_release();
    }

    @Override // androidx.compose.runtime.Applier
    public void onEndChanges() {
        super.onEndChanges();
        Owner r0 = getRoot().getOwner$ui_release();
        if (r0 == null) goto L6;
        r0.onEndApplyChanges();
        return;
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        getCurrent().onReuse();
    }
}
