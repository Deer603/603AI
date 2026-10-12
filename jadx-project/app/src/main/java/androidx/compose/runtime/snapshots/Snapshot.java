package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.Thread_jvmKt;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0017\b\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001b\b\u0004\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\r\u00109\u001a\u00020$H\u0000¢\u0006\u0002\b:J\r\u0010;\u001a\u00020$H\u0010¢\u0006\u0002\b<J\b\u0010=\u001a\u00020$H\u0016J\"\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2\f\u0010@\u001a\b\u0012\u0004\u0012\u0002H?0AH\u0086\b¢\u0006\u0002\u0010BJ\b\u0010C\u001a\u00020\fH&J\n\u0010D\u001a\u0004\u0018\u00010\u0000H\u0011J\u0015\u0010E\u001a\u00020$2\u0006\u0010F\u001a\u00020\u0000H ¢\u0006\u0002\bGJ\u0015\u0010H\u001a\u00020$2\u0006\u0010F\u001a\u00020\u0000H ¢\u0006\u0002\bIJ\r\u0010J\u001a\u00020$H ¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020\u001dH ¢\u0006\u0002\bNJ\r\u0010O\u001a\u00020$H\u0000¢\u0006\u0002\bPJ\r\u0010Q\u001a\u00020$H\u0010¢\u0006\u0002\bRJ\u0012\u0010S\u001a\u00020$2\b\u0010F\u001a\u0004\u0018\u00010\u0000H\u0011J \u0010T\u001a\u00020\u00002\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020$\u0018\u00010#H&J\r\u0010U\u001a\u00020\u0003H\u0000¢\u0006\u0002\bVJ\b\u0010W\u001a\u0004\u0018\u00010\u0000J\u0010\u0010X\u001a\u00020$2\b\u0010Y\u001a\u0004\u0018\u00010\u0000J\r\u0010Z\u001a\u00020$H\u0000¢\u0006\u0002\b[R\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0019\u001a\u00020\f8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX \u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u0003X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\u0012R(\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020$\u0018\u00010#8 X¡\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010'R\u0012\u0010(\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u000eR\u0012\u0010*\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R,\u0010\u0007\u001a\u00060\bj\u0002`\t2\n\u0010-\u001a\u00060\bj\u0002`\t@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00103\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u00038P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u00106R \u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020$\u0018\u00010#X \u0004¢\u0006\u0006\u001a\u0004\b8\u0010'\u0082\u0001\u0004]^_`¨\u0006a"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "disposed", "", "getDisposed$runtime_release", "()Z", "setDisposed$runtime_release", "(Z)V", "getId$annotations", "()V", "getId", "()I", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "isPinned", "isPinned$runtime_release", "modified", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "pinningTrackingHandle", "getPinningTrackingHandle$annotations", "readObserver", "Lkotlin/Function1;", "", "getReadObserver$annotations", "getReadObserver", "()Lkotlin/jvm/functions/Function1;", "readOnly", "getReadOnly", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "<set-?>", "getSnapshotId", "()J", "setSnapshotId$runtime_release", "(J)V", "value", "writeCount", "getWriteCount$runtime_release", "setWriteCount$runtime_release", "(I)V", "writeObserver", "getWriteObserver$runtime_release", "closeAndReleasePinning", "closeAndReleasePinning$runtime_release", "closeLocked", "closeLocked$runtime_release", "dispose", "enter", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hasPendingChanges", "makeCurrent", "nestedActivated", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "releasePinnedSnapshotLocked", "releasePinnedSnapshotLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "restoreCurrent", "takeNestedSnapshot", "takeoverPinnedSnapshot", "takeoverPinnedSnapshot$runtime_release", "unsafeEnter", "unsafeLeave", "oldSnapshot", "validateNotDisposed", "validateNotDisposed$runtime_release", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Snapshot {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    public static final int PreexistingSnapshotId = 1;
    private boolean disposed;
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;
    private long snapshotId;

    /* JADX INFO: compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0001J\"\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001bH\u0086\b¢\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0001J\u0006\u0010\u001f\u001a\u00020 JO\u0010!\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010#2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010#2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001b¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0004H\u0007J&\u0010'\u001a\u00020(2\u001e\u0010)\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010+\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0*J\u001a\u0010,\u001a\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 0#J\n\u0010-\u001a\u0004\u0018\u00010\u0007H\u0001J\u0012\u0010.\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0001J0\u0010/\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u00100\u001a\u00020\u00072\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010#H\u0001J\u0006\u00101\u001a\u00020 J6\u00102\u001a\u0002032\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010#2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010#J\u001e\u00104\u001a\u00020\u00072\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010#J\"\u00105\u001a\u0002H6\"\u0004\b\u0000\u001062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H60\u001bH\u0086\b¢\u0006\u0002\u0010\u001cJ4\u00107\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u0002H\u00190\u001b¢\u0006\u0002\b8H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\tR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0011\u001a\u00020\u000e*\u00020\u00128Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0011\u001a\u00020\u000e*\u00020\u00158Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016¨\u00069"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "()V", "PreexistingSnapshotId", "", "getPreexistingSnapshotId$annotations", "current", "Landroidx/compose/runtime/snapshots/Snapshot;", "getCurrent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "currentThreadSnapshot", "getCurrentThreadSnapshot$annotations", "getCurrentThreadSnapshot", "isApplyObserverNotificationPending", "", "()Z", "isInSnapshot", "canBeReused", "Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;", "getCanBeReused", "(Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;)Z", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "(Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;)Z", "createNonObservableSnapshot", "global", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "makeCurrentNonObservable", "previous", "notifyObjectsInitialized", "", "observe", "readObserver", "Lkotlin/Function1;", "writeObserver", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "openSnapshotCount", "registerApplyObserver", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "observer", "Lkotlin/Function2;", "", "registerGlobalWriteObserver", "removeCurrent", "restoreCurrent", "restoreNonObservable", "nonObservable", "sendApplyNotifications", "takeMutableSnapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "takeSnapshot", "withMutableSnapshot", "R", "withoutReadObservation", "Landroidx/compose/runtime/DisallowComposableCalls;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }

        private Companion() {
        }

        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final boolean isInSnapshot() {
            if (SnapshotKt.access$getThreadSnapshot$p().get() == null) goto L5;
            return true;
        L5:
            return false;
        }

        public final boolean isApplyObserverNotificationPending() {
            if (SnapshotKt.access$getPendingApplyObserverCount$p().get() <= 0) goto L5;
            return true;
        L5:
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Snapshot takeSnapshot$default(Companion r0, Function1 r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = null;
        L6:
            return r0.takeSnapshot(r1);
        }

        public final Snapshot takeSnapshot(Function1<Object, Unit> r2) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(r2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion r1, Function1 r2, Function1 r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r3 = null;
        L9:
            return r1.takeMutableSnapshot(r2, r3);
        }

        public final MutableSnapshot takeMutableSnapshot(Function1<Object, Unit> r3, Function1<Object, Unit> r4) {
            Snapshot r0 = SnapshotKt.currentSnapshot();
            if ((r0 instanceof MutableSnapshot) == false) goto L5;
            MutableSnapshot r1 = (MutableSnapshot) r0;
        L6:
            if (r1 == null) goto L11;
            MutableSnapshot r2 = r1.takeNestedMutableSnapshot(r3, r4);
            if (r2 == null) goto L11;
            return r2;
        L11:
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        L5:
            r1 = null;
            goto L6
        }

        public final <T> T global(Function0<? extends T> r4) {
            Snapshot previous = removeCurrent();
            T r2 = r4.invoke();     // Catch: Throwable -> L6
            restoreCurrent(previous);
            return r2;
        L6:
            th = move-exception;
            restoreCurrent(previous);
            throw th;
        }

        public final <R> R withMutableSnapshot(Function0<? extends R> r9) {
            MutableSnapshot $this$withMutableSnapshot_u24lambda_u240 = takeMutableSnapshot$default(this, null, null, 3, null);
            MutableSnapshot this_$iv = $this$withMutableSnapshot_u24lambda_u240;     // Catch: Throwable -> L11
            Snapshot previous$iv = this_$iv.makeCurrent();     // Catch: Throwable -> L11
            R r7 = r9.invoke();     // Catch: Throwable -> L8
            this_$iv.restoreCurrent(previous$iv);     // Catch: Throwable -> L11
            $this$withMutableSnapshot_u24lambda_u240.apply().check();
            $this$withMutableSnapshot_u24lambda_u240.dispose();
            return r7;
        L8:
            th = move-exception;
            this_$iv.restoreCurrent(previous$iv);     // Catch: Throwable -> L11
            throw th;     // Catch: Throwable -> L11
        L11:
            e = move-exception;
            throw e;     // Catch: Throwable -> L14
        L14:
            e = move-exception;
            if (1 != 0) goto L17;
            $this$withMutableSnapshot_u24lambda_u240.apply().check();
        L17:
            $this$withMutableSnapshot_u24lambda_u240.dispose();
            throw e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object observe$default(Companion r1, Function1 r2, Function1 r3, Function0 r4, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = null;
        L9:
            return r1.observe(r2, r3, r4);
        }

        public final <T> T observe(Function1<Object, Unit> r10, Function1<Object, Unit> r11, Function0<? extends T> r12) {
            if (r10 != null) goto L6;
            if (r11 != null) goto L6;
            return r12.invoke();
        L6:
            Snapshot previous = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
            if ((previous instanceof TransparentObserverMutableSnapshot) == false) goto L21;
            TransparentObserverMutableSnapshot $this$canBeReused$iv = (TransparentObserverMutableSnapshot) previous;
            if ($this$canBeReused$iv.getThreadId$runtime_release() != Thread_jvmKt.currentThreadId()) goto L11;
            boolean r5 = true;
        L12:
            if (r5 == false) goto L21;
            Function1<Object, Unit> r3 = ((TransparentObserverMutableSnapshot) previous).getReadObserver$runtime_release();
            Function1<Object, Unit> r4 = ((TransparentObserverMutableSnapshot) previous).getWriteObserver$runtime_release();
            ((TransparentObserverMutableSnapshot) previous).setReadObserver(SnapshotKt.mergedReadObserver$default(r10, r3, false, 4, null));     // Catch: Throwable -> L17
            ((TransparentObserverMutableSnapshot) previous).setWriteObserver(SnapshotKt.access$mergedWriteObserver(r11, r4));     // Catch: Throwable -> L17
            T r0 = r12.invoke();     // Catch: Throwable -> L17
            ((TransparentObserverMutableSnapshot) previous).setReadObserver(r3);
            ((TransparentObserverMutableSnapshot) previous).setWriteObserver(r4);
            return r0;
        L17:
            th = move-exception;
            ((TransparentObserverMutableSnapshot) previous).setReadObserver(r3);
            ((TransparentObserverMutableSnapshot) previous).setWriteObserver(r4);
            throw th;
        L11:
            r5 = false;
        L21:
            if (previous != null) goto L23;
        L29:
            MutableSnapshot r1 = null;
            if ((previous instanceof MutableSnapshot) == false) goto L32;
            r1 = (MutableSnapshot) previous;
        L32:
            TransparentObserverMutableSnapshot r2 = new TransparentObserverMutableSnapshot(r1, r10, r11, true, false);
        L33:
            Snapshot snapshot = r2;
            Snapshot previous$iv = snapshot.makeCurrent();     // Catch: Throwable -> L43
            T r6 = r12.invoke();     // Catch: Throwable -> L40
            snapshot.restoreCurrent(previous$iv);     // Catch: Throwable -> L43
            snapshot.dispose();
            return r6;
        L40:
            th = move-exception;
            snapshot.restoreCurrent(previous$iv);     // Catch: Throwable -> L43
            throw th;     // Catch: Throwable -> L43
        L43:
            th = move-exception;
            snapshot.dispose();
            throw th;
        L23:
            if ((previous instanceof MutableSnapshot) == true) goto L29;
            if (r10 == null) goto L27;
            r2 = previous.takeNestedSnapshot(r10);
            goto L33
        L27:
            return r12.invoke();
        }

        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) SnapshotKt.access$getThreadSnapshot$p().get(), null, false, 6, null);
        }

        public final Snapshot getCurrentThreadSnapshot() {
            return (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
        }

        private final boolean getCanBeReused(TransparentObserverMutableSnapshot $this$canBeReused) {
            if ($this$canBeReused.getThreadId$runtime_release() != Thread_jvmKt.currentThreadId()) goto L5;
            return true;
        L5:
            return false;
        }

        private final boolean getCanBeReused(TransparentObserverSnapshot $this$canBeReused) {
            if ($this$canBeReused.getThreadId$runtime_release() != Thread_jvmKt.currentThreadId()) goto L5;
            return true;
        L5:
            return false;
        }

        public final Snapshot makeCurrentNonObservable(Snapshot previous) {
            boolean r1 = true;
            if ((previous instanceof TransparentObserverMutableSnapshot) == false) goto L11;
            TransparentObserverMutableSnapshot $this$canBeReused$iv = (TransparentObserverMutableSnapshot) previous;
            if ($this$canBeReused$iv.getThreadId$runtime_release() != Thread_jvmKt.currentThreadId()) goto L7;
            boolean r0 = true;
        L8:
            if (r0 == false) goto L11;
            ((TransparentObserverMutableSnapshot) previous).setReadObserver(null);
        L21:
            return previous;
        L7:
            r0 = false;
        L11:
            if ((previous instanceof TransparentObserverSnapshot) == false) goto L19;
            TransparentObserverSnapshot $this$canBeReused$iv2 = (TransparentObserverSnapshot) previous;
            if ($this$canBeReused$iv2.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId()) goto L16;
            r1 = false;
        L16:
            if (r1 == false) goto L19;
            ((TransparentObserverSnapshot) previous).setReadObserver(null);
        L19:
            Snapshot snapshot = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default(previous, null, false, 6, null);
            snapshot.makeCurrent();
            return snapshot;
        }

        public final void restoreNonObservable(Snapshot previous, Snapshot nonObservable, Function1<Object, Unit> r6) {
            if (previous == nonObservable) goto L4;
            nonObservable.restoreCurrent(previous);
            nonObservable.dispose();
            return;
        L4:
            if ((previous instanceof TransparentObserverMutableSnapshot) == false) goto L7;
            ((TransparentObserverMutableSnapshot) previous).setReadObserver(r6);
            return;
        L7:
            if ((previous instanceof TransparentObserverSnapshot) == false) goto L10;
            ((TransparentObserverSnapshot) previous).setReadObserver(r6);
            return;
        L10:
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + previous).toString());
        }

        public final <T> T withoutReadObservation(Function0<? extends T> r6) {
            Snapshot previousSnapshot = getCurrentThreadSnapshot();
            if (previousSnapshot == null) goto L5;
            Function1<Object, Unit> r2 = previousSnapshot.getReadObserver();
        L6:
            Snapshot newSnapshot = makeCurrentNonObservable(previousSnapshot);
            T r4 = r6.invoke();     // Catch: Throwable -> L10
            restoreNonObservable(previousSnapshot, newSnapshot, r2);
            return r4;
        L10:
            th = move-exception;
            restoreNonObservable(previousSnapshot, newSnapshot, r2);
            throw th;
        L5:
            r2 = null;
            goto L6
        }

        public final ObserverHandle registerApplyObserver(final Function2<? super Set<? extends Object>, ? super Snapshot, Unit> r6) {
            SnapshotKt.access$advanceGlobalSnapshot(SnapshotKt.access$getEmptyLambda$p());
            Object lock$iv$iv = SnapshotKt.getLock();
            monitor-enter(lock$iv$iv);
            SnapshotKt.access$setApplyObservers$p(CollectionsKt.plus(SnapshotKt.access$getApplyObservers$p(), r6));     // Catch: Throwable -> L9
            Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L9
            monitor-exit(lock$iv$iv);
            return new Snapshot$Companion$$ExternalSyntheticLambda0(r6);
        L9:
            th = move-exception;
            throw th;
        }

        static final void registerApplyObserver$lambda$4(Function2 $observer) {
            Object lock$iv$iv = SnapshotKt.getLock();
            monitor-enter(lock$iv$iv);
            SnapshotKt.access$setApplyObservers$p(CollectionsKt.minus(SnapshotKt.access$getApplyObservers$p(), $observer));     // Catch: Throwable -> L8
            Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L8
            monitor-exit(lock$iv$iv);
            return;
        L8:
            th = move-exception;
            throw th;
        }

        public final ObserverHandle registerGlobalWriteObserver(final Function1<Object, Unit> r6) {
            Object lock$iv$iv = SnapshotKt.getLock();
            monitor-enter(lock$iv$iv);
            SnapshotKt.access$setGlobalWriteObservers$p(CollectionsKt.plus(SnapshotKt.access$getGlobalWriteObservers$p(), r6));     // Catch: Throwable -> L9
            Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L9
            monitor-exit(lock$iv$iv);
            SnapshotKt.access$advanceGlobalSnapshot();
            return new Snapshot$Companion$$ExternalSyntheticLambda1(r6);
        L9:
            th = move-exception;
            throw th;
        }

        static final void registerGlobalWriteObserver$lambda$7(Function1 $observer) {
            Object lock$iv$iv = SnapshotKt.getLock();
            monitor-enter(lock$iv$iv);
            SnapshotKt.access$setGlobalWriteObservers$p(CollectionsKt.minus(SnapshotKt.access$getGlobalWriteObservers$p(), $observer));     // Catch: Throwable -> L9
            Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L9
            monitor-exit(lock$iv$iv);
            SnapshotKt.access$advanceGlobalSnapshot();
            return;
        L9:
            th = move-exception;
            throw th;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final void sendApplyNotifications() {
            Object lock$iv$iv = SnapshotKt.getLock();
            monitor-enter(lock$iv$iv);
            boolean changes = SnapshotKt.access$getGlobalSnapshot$p().hasPendingChanges();     // Catch: Throwable -> L10
            monitor-exit(lock$iv$iv);
            if (changes == false) goto L15;
            SnapshotKt.access$advanceGlobalSnapshot();
            return;
        L15:
            return;
        L10:
            th = move-exception;
            throw th;
        }

        public final int openSnapshotCount() {
            return CollectionsKt.toList(SnapshotKt.access$getOpenSnapshots$p()).size();
        }

        public final Snapshot removeCurrent() {
            Snapshot previous = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
            if (previous == null) goto L5;
            SnapshotKt.access$getThreadSnapshot$p().set(null);
        L5:
            return previous;
        }

        public final void restoreCurrent(Snapshot previous) {
            if (previous == null) goto L5;
            SnapshotKt.access$getThreadSnapshot$p().set(previous);
            return;
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public /* synthetic */ Snapshot(int r1, SnapshotIdSet r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    public /* synthetic */ Snapshot(long r1, SnapshotIdSet r3, DefaultConstructorMarker r4) {
        this(r1, r3);
    }

    @Deprecated(message = "Use snapshotId instead", replaceWith = @ReplaceWith(expression = "snapshotId", imports = {}))
    public static /* synthetic */ void getId$annotations() {
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    public static /* synthetic */ void getReadObserver$annotations() {
    }

    public abstract MutableScatterSet<StateObject> getModified$runtime_release();

    public abstract Function1<Object, Unit> getReadObserver();

    public abstract boolean getReadOnly();

    public abstract Snapshot getRoot();

    public abstract Function1<Object, Unit> getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public abstract void mo3924nestedActivated$runtime_release(Snapshot r1);

    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public abstract void mo3925nestedDeactivated$runtime_release(Snapshot r1);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* JADX INFO: renamed from: recordModified$runtime_release */
    public abstract void mo3926recordModified$runtime_release(StateObject r1);

    public abstract Snapshot takeNestedSnapshot(Function1<Object, Unit> r1);

    private Snapshot(long snapshotId, SnapshotIdSet invalid) {
        this.invalid = invalid;
        this.snapshotId = snapshotId;
        if (snapshotId == SnapshotKt.access$getINVALID_SNAPSHOT$p()) goto L5;
        int r0 = SnapshotKt.trackPinning(snapshotId, getInvalid$runtime_release());
    L6:
        this.pinningTrackingHandle = r0;
        return;
    L5:
        r0 = -1;
        goto L6
    }

    public static final /* synthetic */ int access$getPinningTrackingHandle$p(Snapshot $this) {
        return $this.pinningTrackingHandle;
    }

    public SnapshotIdSet getInvalid$runtime_release() {
        return this.invalid;
    }

    public void setInvalid$runtime_release(SnapshotIdSet r1) {
        this.invalid = r1;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use id: Long constructor instead")
    private /* synthetic */ Snapshot(int id, SnapshotIdSet invalid) {
        this(SnapshotId_jvmKt.toSnapshotId(id), invalid, null);
    }

    public int getId() {
        return (int) getSnapshotId();
    }

    public long getSnapshotId() {
        return this.snapshotId;
    }

    public void setSnapshotId$runtime_release(long r1) {
        this.snapshotId = r1;
    }

    public int getWriteCount$runtime_release() {
        return 0;
    }

    public void setWriteCount$runtime_release(int value) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public void dispose() {
        this.disposed = true;
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        releasePinnedSnapshotLocked$runtime_release();     // Catch: Throwable -> L8
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(lock$iv$iv);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot r0, Function1 r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = null;
    L7:
        return r0.takeNestedSnapshot(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
    }

    public final <T> T enter(Function0<? extends T> r4) {
        Snapshot previous = makeCurrent();
        T r2 = r4.invoke();     // Catch: Throwable -> L6
        restoreCurrent(previous);
        return r2;
    L6:
        th = move-exception;
        restoreCurrent(previous);
        throw th;
    }

    public Snapshot makeCurrent() {
        Snapshot previous = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
        SnapshotKt.access$getThreadSnapshot$p().set(this);
        return previous;
    }

    public void restoreCurrent(Snapshot snapshot) {
        SnapshotKt.access$getThreadSnapshot$p().set(snapshot);
    }

    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    public final void unsafeLeave(Snapshot oldSnapshot) {
        if (SnapshotKt.access$getThreadSnapshot$p().get() != this) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        PreconditionsKt.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
    L9:
        restoreCurrent(oldSnapshot);
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final boolean getDisposed$runtime_release() {
        return this.disposed;
    }

    public final void setDisposed$runtime_release(boolean r1) {
        this.disposed = r1;
    }

    public final boolean isPinned$runtime_release() {
        if (access$getPinningTrackingHandle$p(this) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void closeAndReleasePinning$runtime_release() {
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        closeLocked$runtime_release();     // Catch: Throwable -> L8
        releasePinnedSnapshotsForCloseLocked$runtime_release();     // Catch: Throwable -> L8
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(lock$iv$iv);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().clear(getSnapshotId()));
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    public final void validateNotDisposed$runtime_release() {
        boolean value$iv = !this.disposed;
        if (value$iv == true) goto L7;
        PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        return;
    }

    public final void releasePinnedSnapshotLocked$runtime_release() {
        if (this.pinningTrackingHandle < 0) goto L6;
        SnapshotKt.releasePinningLocked(this.pinningTrackingHandle);
        this.pinningTrackingHandle = -1;
        return;
    }

    public final int takeoverPinnedSnapshot$runtime_release() {
        int r0 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return r0;
    }
}
