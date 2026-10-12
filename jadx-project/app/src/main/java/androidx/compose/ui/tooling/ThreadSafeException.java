package androidx.compose.ui.tooling;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: PreviewUtils.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/ui/tooling/ThreadSafeException;", "", "()V", "exception", "", "lock", "set", "", "throwable", "throwIfPresent", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ThreadSafeException {
    public static final int $stable = 0;
    private Throwable exception;
    private final Object lock;

    static {
        $stable = 8;
    }

    public ThreadSafeException() {
        this.lock = new Object();
    }

    public final void set(Throwable throwable) {
        Object r0 = this.lock;
        monitor-enter(r0);
        this.exception = throwable;     // Catch: Throwable -> L8
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(r0);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final void throwIfPresent() {
        Object r0 = this.lock;
        monitor-enter(r0);
        Throwable it = this.exception;     // Catch: Throwable -> L12
        if (it != null) goto L10;
        monitor-exit(r0);
        return;
    L10:
        this.exception = null;     // Catch: Throwable -> L12
        throw it;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }
}
