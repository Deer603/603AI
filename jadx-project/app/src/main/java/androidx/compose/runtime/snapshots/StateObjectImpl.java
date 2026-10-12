package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;
import kotlin.Metadata;

/* JADX INFO: compiled from: StateObjectImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/StateObject;", "()V", "readerKind", "Landroidx/compose/runtime/internal/AtomicInt;", "isReadIn", "", "reader", "Landroidx/compose/runtime/snapshots/ReaderKind;", "isReadIn-h_f27i8$runtime_release", "(I)Z", "recordReadIn", "", "recordReadIn-h_f27i8$runtime_release", "(I)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class StateObjectImpl implements StateObject {
    public static final int $stable = 0;
    private final AtomicInt readerKind;

    static {
    }

    public StateObjectImpl() {
        this.readerKind = new AtomicInt(0);
    }

    /* JADX INFO: renamed from: recordReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final void m3941recordReadInh_f27i8$runtime_release(int reader) {
    L2:
        int old = ReaderKind.m3928constructorimpl(this.readerKind.get());
        if ((old & reader) == 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L7;
        int r1 = ReaderKind.m3928constructorimpl(old | reader);
        if (this.readerKind.compareAndSet(old, r1) == false) goto L2;
        return;
    L7:
        return;
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: isReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final boolean m3940isReadInh_f27i8$runtime_release(int reader) {
        int arg0$iv = ReaderKind.m3928constructorimpl(this.readerKind.get());
        if ((arg0$iv & reader) == 0) goto L5;
        return true;
    L5:
        return false;
    }
}
