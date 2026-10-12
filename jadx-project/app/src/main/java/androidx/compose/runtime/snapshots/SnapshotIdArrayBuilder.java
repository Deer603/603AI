package androidx.compose.runtime.snapshots;

import androidx.collection.LongList;
import androidx.collection.MutableLongList;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotId.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\fJ\u000e\u0010\r\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;", "", "array", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "([J)V", "list", "Landroidx/collection/MutableLongList;", "add", "", "id", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "toArray", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnapshotIdArrayBuilder {
    public static final int $stable = 0;
    private final MutableLongList list;

    static {
        $stable = 8;
    }

    public SnapshotIdArrayBuilder(long[] array) {
        if (array == null) goto L5;
        long[] elements$iv = Arrays.copyOf(array, array.length);
        MutableLongList $this$mutableLongListOf_u24lambda_u241$iv = new MutableLongList(elements$iv.length);
        $this$mutableLongListOf_u24lambda_u241$iv.addAll($this$mutableLongListOf_u24lambda_u241$iv._size, elements$iv);
    L6:
        this.list = $this$mutableLongListOf_u24lambda_u241$iv;
        return;
    L5:
        $this$mutableLongListOf_u24lambda_u241$iv = new MutableLongList(0, 1, null);
        goto L6
    }

    public final void add(long id) {
        this.list.add(id);
    }

    public final long[] toArray() {
        int size = this.list._size;
        if (size != 0) goto L6;
        return null;
    L6:
        long[] result = new long[size];
        LongList this_$iv = this.list;
        long[] content$iv = this_$iv.content;
        int i$iv = 0;
        int r6 = this_$iv._size;
    L7:
        if (i$iv >= r6) goto L10;
        long element = content$iv[i$iv];
        int index = i$iv;
        result[index] = element;
        i$iv = i$iv + 1;
        goto L7
    L10:
        return result;
    }
}
