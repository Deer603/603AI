package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "", "()V", "<set-?>", "Landroidx/compose/material/SnackbarData;", "currentSnackbarData", "getCurrentSnackbarData", "()Landroidx/compose/material/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material/SnackbarData;)V", "currentSnackbarData$delegate", "Landroidx/compose/runtime/MutableState;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "showSnackbar", "Landroidx/compose/material/SnackbarResult;", "message", "", "actionLabel", "duration", "Landroidx/compose/material/SnackbarDuration;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SnackbarDataImpl", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final MutableState currentSnackbarData$delegate;
    private final Mutex mutex;

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material/SnackbarData;", "message", "", "actionLabel", "duration", "Landroidx/compose/material/SnackbarDuration;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Landroidx/compose/material/SnackbarResult;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlinx/coroutines/CancellableContinuation;)V", "getActionLabel", "()Ljava/lang/String;", "getDuration", "()Landroidx/compose/material/SnackbarDuration;", "getMessage", "dismiss", "", "performAction", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SnackbarDataImpl implements SnackbarData {
        private final String actionLabel;
        private final CancellableContinuation<SnackbarResult> continuation;
        private final SnackbarDuration duration;
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(String message, String actionLabel, SnackbarDuration duration, CancellableContinuation<? super SnackbarResult> r4) {
            this.message = message;
            this.actionLabel = actionLabel;
            this.duration = duration;
            this.continuation = r4;
        }

        @Override // androidx.compose.material.SnackbarData
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material.SnackbarData
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material.SnackbarData
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material.SnackbarData
        public void performAction() {
            if (this.continuation.isActive() == false) goto L6;
            CancellableContinuation<SnackbarResult> r0 = this.continuation;
            Result.Companion r1 = Result.Companion;
            r0.resumeWith(Result.m7425constructorimpl(SnackbarResult.ActionPerformed));
            return;
        }

        @Override // androidx.compose.material.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive() == false) goto L6;
            CancellableContinuation<SnackbarResult> r0 = this.continuation;
            Result.Companion r1 = Result.Companion;
            r0.resumeWith(Result.m7425constructorimpl(SnackbarResult.Dismissed));
            return;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SnackbarHostState$showSnackbar$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {368, 371}, m = "showSnackbar", n = {"this", "message", "actionLabel", "duration", "$this$withLock_u24default$iv", "this", "message", "actionLabel", "duration", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SnackbarHostState this$0;

        AnonymousClass1(SnackbarHostState r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.showSnackbar(null, null, null, this);
        }
    }

    static {
    }

    public SnackbarHostState() {
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.currentSnackbarData$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static final /* synthetic */ void access$setCurrentSnackbarData(SnackbarHostState $this, SnackbarData r1) {
        $this.setCurrentSnackbarData(r1);
    }

    private final void setCurrentSnackbarData(SnackbarData r4) {
        MutableState $this$setValue$iv = this.currentSnackbarData$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final SnackbarData getCurrentSnackbarData() {
        State $this$getValue$iv = this.currentSnackbarData$delegate;
        return (SnackbarData) $this$getValue$iv.getValue();
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState r0, String r1, String r2, SnackbarDuration r3, Continuation r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = SnackbarDuration.Short;
    L9:
        return r0.showSnackbar(r1, r2, r3, r4);
    }

    public final Object showSnackbar(String message, String actionLabel, SnackbarDuration r22, Continuation<? super SnackbarResult> r23) {
        if ((r23 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r23;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        AnonymousClass1 r3 = r0;
        Object $result = r3.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r3.label) {
            case 0: goto L18;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        AnonymousClass1 r8 = (AnonymousClass1) r3.L$5;
        Mutex $this$withLock_u24default$iv = (Mutex) r3.L$4;
        SnackbarDuration r9 = (SnackbarDuration) r3.L$3;
        String r10 = (String) r3.L$2;
        String r11 = (String) r3.L$1;
        SnackbarHostState r12 = (SnackbarHostState) r3.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Object r2 = $result;
        Object owner$iv = null;
    L44:
        r12.setCurrentSnackbarData(null);     // Catch: Throwable -> L33
        $this$withLock_u24default$iv.unlock(owner$iv);
        return r2;
    L33:
        th = th;
    L42:
        $this$withLock_u24default$iv.unlock(owner$iv);
        throw th;
    L15:
        th = th;
        Object owner$iv2 = null;
    L50:
        r12.setCurrentSnackbarData(null);     // Catch: Throwable -> L40
        throw th;     // Catch: Throwable -> L40
    L40:
        th = th;
        owner$iv = owner$iv2;
        goto L42
    L17:
        Mutex $this$withLock_u24default$iv2 = (Mutex) r3.L$4;
        SnackbarDuration duration = (SnackbarDuration) r3.L$3;
        String actionLabel2 = (String) r3.L$2;
        String message2 = (String) r3.L$1;
        SnackbarHostState r13 = (SnackbarHostState) r3.L$0;
        ResultKt.throwOnFailure($result);
        owner$iv = null;
        $this$withLock_u24default$iv = $this$withLock_u24default$iv2;
        r12 = r13;
        String message3 = message2;
        String message4 = actionLabel2;
    L46:
        r3.L$0 = r12;     // Catch: Throwable -> L35
        r3.L$1 = message3;     // Catch: Throwable -> L35
        r3.L$2 = message4;     // Catch: Throwable -> L35
        r3.L$3 = duration;     // Catch: Throwable -> L35
        r3.L$4 = $this$withLock_u24default$iv;     // Catch: Throwable -> L35
        r3.L$5 = r3;     // Catch: Throwable -> L35
        r3.label = 2;     // Catch: Throwable -> L35
        AnonymousClass1 uCont$iv = r3;     // Catch: Throwable -> L35
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);     // Catch: Throwable -> L35
        cancellable$iv.initCancellability();     // Catch: Throwable -> L35
        CancellableContinuationImpl continuation = cancellable$iv;     // Catch: Throwable -> L35
        access$setCurrentSnackbarData(r12, new SnackbarDataImpl(message3, message4, duration, continuation));     // Catch: Throwable -> L35
        r2 = cancellable$iv.getResult();     // Catch: Throwable -> L35
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L26;
        DebugProbesKt.probeCoroutineSuspended(r3);     // Catch: Throwable -> L35
    L26:
        if (r2 != r1) goto L44;
        return r1;
    L35:
        th = th;
        owner$iv2 = owner$iv;
        goto L50
    L18:
        ResultKt.throwOnFailure($result);
        duration = r22;
        $this$withLock_u24default$iv = this.mutex;
        r3.L$0 = this;
        r3.L$1 = message;
        r3.L$2 = actionLabel;
        r3.L$3 = duration;
        r3.L$4 = $this$withLock_u24default$iv;
        r3.label = 1;
        if ($this$withLock_u24default$iv.lock(null, r3) != r1) goto L21;
        return r1;
    L21:
        r12 = this;
        message3 = message;
        message4 = actionLabel;
        owner$iv = null;
        goto L46
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r23);
        goto L8
    }
}
