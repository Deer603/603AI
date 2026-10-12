package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MutatorMutex$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ boolean m(AtomicReference r1, Object r2, Object r3) {
    L3:
        if (r1.compareAndSet(r2, r3) == true) goto L4;
        if (r1.get() == r2) goto L3;
        return false;
    L4:
        return true;
    }
}
