package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a=\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u0002H\u00040\b\u001a\b\u0010\f\u001a\u00020\rH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0002\u001a\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"sync", "", "SnapshotStateList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "size", "", "init", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "invalidIteratorSet", "", "modificationError", "validateRange", "", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnapshotStateListKt {
    private static final Object sync = null;

    public static final /* synthetic */ Object access$getSync$p() {
        return sync;
    }

    public static final /* synthetic */ Void access$invalidIteratorSet() {
        return invalidIteratorSet();
    }

    public static final /* synthetic */ Void access$modificationError() {
        return modificationError();
    }

    public static final /* synthetic */ void access$validateRange(int index, int size) {
        validateRange(index, size);
    }

    public static final <T> SnapshotStateList<T> SnapshotStateList(int size, Function1<? super Integer, ? extends T> r4) {
        if (size == 0) goto L4;
        PersistentList.Builder builder = ExtensionsKt.persistentListOf().builder();
        int i = 0;
    L6:
        if (i >= size) goto L9;
        builder.add(r4.invoke(Integer.valueOf(i)));
        i = i + 1;
        goto L6
    L9:
        return new SnapshotStateList(builder.build());
    L4:
        return new SnapshotStateList();
    }

    static {
        sync = new Object();
    }

    private static final Void modificationError() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    private static final void validateRange(int index, int size) {
        boolean r0 = false;
        if (index < 0) goto L6;
        if (index >= size) goto L6;
        r0 = true;
    L6:
        if (r0 == false) goto L9;
        return;
    L9:
        throw new IndexOutOfBoundsException("index (" + index + ") is out of bound of [0, " + size + ')');
    }

    private static final Void invalidIteratorSet() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString());
    }
}
