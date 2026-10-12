package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: LazyLayoutPinnableItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020\"H\u0016R/\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem;", "Landroidx/compose/ui/layout/PinnableContainer;", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "key", "", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "(Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)V", "<set-?>", "_parentPinnableContainer", "get_parentPinnableContainer", "()Landroidx/compose/ui/layout/PinnableContainer;", "set_parentPinnableContainer", "(Landroidx/compose/ui/layout/PinnableContainer;)V", "_parentPinnableContainer$delegate", "Landroidx/compose/runtime/MutableState;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "isDisposed", "", "getKey", "()Ljava/lang/Object;", "parentHandle", "value", "parentPinnableContainer", "getParentPinnableContainer", "setParentPinnableContainer", "pinsCount", "onDisposed", "", "pin", "release", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {
    private final MutableState _parentPinnableContainer$delegate;
    private int index;
    private boolean isDisposed;
    private final Object key;
    private PinnableContainer.PinnedHandle parentHandle;
    private final LazyLayoutPinnedItemList pinnedItemList;
    private int pinsCount;

    public LazyLayoutPinnableItem(Object key, LazyLayoutPinnedItemList pinnedItemList) {
        this.key = key;
        this.pinnedItemList = pinnedItemList;
        this.index = -1;
        this._parentPinnableContainer$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public int getIndex() {
        return this.index;
    }

    public void setIndex(int r1) {
        this.index = r1;
    }

    private final PinnableContainer get_parentPinnableContainer() {
        State $this$getValue$iv = this._parentPinnableContainer$delegate;
        return (PinnableContainer) $this$getValue$iv.getValue();
    }

    private final void set_parentPinnableContainer(PinnableContainer r4) {
        MutableState $this$setValue$iv = this._parentPinnableContainer$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final PinnableContainer getParentPinnableContainer() {
        return get_parentPinnableContainer();
    }

    public final void setParentPinnableContainer(PinnableContainer value) {
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        PinnableContainer.PinnedHandle r3 = null;
        if (previousSnapshot$iv == null) goto L5;
        Function1<Object, Unit> r4 = previousSnapshot$iv.getReadObserver();
    L6:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        PinnableContainer previous = get_parentPinnableContainer();     // Catch: Throwable -> L20
        if (value == previous) goto L17;
        set_parentPinnableContainer(value);     // Catch: Throwable -> L20
        if (this.pinsCount <= 0) goto L17;
        PinnableContainer.PinnedHandle r8 = this.parentHandle;     // Catch: Throwable -> L20
        if (r8 == null) goto L14;
        r8.release();     // Catch: Throwable -> L20
    L14:
        if (value == null) goto L16;
        r3 = value.pin();     // Catch: Throwable -> L20
    L16:
        this.parentHandle = r3;     // Catch: Throwable -> L20
    L17:
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L20
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r4);
        return;
    L20:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r4);
        throw th;
    L5:
        r4 = null;
        goto L6
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    public PinnableContainer.PinnedHandle pin() {
        boolean value$iv = !this.isDisposed;
        if (value$iv == true) goto L6;
        InlineClassHelperKt.throwIllegalStateException("Pin should not be called on an already disposed item ");
    L6:
        if (this.pinsCount != 0) goto L12;
        this.pinnedItemList.pin$foundation_release(this);
        PinnableContainer r0 = getParentPinnableContainer();
        if (r0 == null) goto L10;
        PinnableContainer.PinnedHandle r1 = r0.pin();
    L11:
        this.parentHandle = r1;
        goto L12
    L10:
        r1 = null;
    L12:
        this.pinsCount++;
        return this;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public void release() {
        if (this.isDisposed == false) goto L6;
        return;
    L6:
        if (this.pinsCount <= 0) goto L8;
        boolean value$iv = true;
    L10:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalStateException("Release should only be called once");
    L12:
        this.pinsCount--;
        if (this.pinsCount != 0) goto L19;
        this.pinnedItemList.release$foundation_release(this);
        PinnableContainer.PinnedHandle r0 = this.parentHandle;
        if (r0 == null) goto L17;
        r0.release();
    L17:
        this.parentHandle = null;
        return;
    L19:
        return;
    L8:
        value$iv = false;
        goto L10
    }

    public final void onDisposed() {
        this.isDisposed = true;
    }
}
