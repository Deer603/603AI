package kotlinx.coroutines.debug.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private {
    private static final /* synthetic */ AtomicIntegerFieldUpdater installations$volatile$FU = null;
    private static final /* synthetic */ AtomicLongFieldUpdater sequenceNumber$volatile$FU = null;
    private volatile /* synthetic */ int installations$volatile;
    private volatile /* synthetic */ long sequenceNumber$volatile;

    static {
        installations$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.class, "installations$volatile");
        sequenceNumber$volatile$FU = AtomicLongFieldUpdater.newUpdater(DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.class, "sequenceNumber$volatile");
    }

    private DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private() {
    }

    public /* synthetic */ DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private(DefaultConstructorMarker r1) {
        this();
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater access$getInstallations$volatile$FU() {
        return getInstallations$volatile$FU();
    }

    public static final /* synthetic */ AtomicLongFieldUpdater access$getSequenceNumber$volatile$FU() {
        return getSequenceNumber$volatile$FU();
    }

    private final /* synthetic */ int getInstallations$volatile() {
        return this.installations$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater getInstallations$volatile$FU() {
        return installations$volatile$FU;
    }

    private final /* synthetic */ long getSequenceNumber$volatile() {
        return this.sequenceNumber$volatile;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater getSequenceNumber$volatile$FU() {
        return sequenceNumber$volatile$FU;
    }

    private final /* synthetic */ void setInstallations$volatile(int r1) {
        this.installations$volatile = r1;
    }

    private final /* synthetic */ void setSequenceNumber$volatile(long r1) {
        this.sequenceNumber$volatile = r1;
    }
}
