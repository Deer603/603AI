package androidx.compose.material3;

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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J6\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001aR/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "", "()V", "<set-?>", "Landroidx/compose/material3/SnackbarData;", "currentSnackbarData", "getCurrentSnackbarData", "()Landroidx/compose/material3/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material3/SnackbarData;)V", "currentSnackbarData$delegate", "Landroidx/compose/runtime/MutableState;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "showSnackbar", "Landroidx/compose/material3/SnackbarResult;", "visuals", "Landroidx/compose/material3/SnackbarVisuals;", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "message", "", "actionLabel", "withDismissAction", "", "duration", "Landroidx/compose/material3/SnackbarDuration;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SnackbarDataImpl", "SnackbarVisualsImpl", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final MutableState currentSnackbarData$delegate;
    private final Mutex mutex;

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material3/SnackbarData;", "visuals", "Landroidx/compose/material3/SnackbarVisuals;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Landroidx/compose/material3/SnackbarResult;", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlinx/coroutines/CancellableContinuation;)V", "getVisuals", "()Landroidx/compose/material3/SnackbarVisuals;", "dismiss", "", "equals", "", "other", "", "hashCode", "", "performAction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class SnackbarDataImpl implements SnackbarData {
        private final CancellableContinuation<SnackbarResult> continuation;
        private final SnackbarVisuals visuals;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(SnackbarVisuals visuals, CancellableContinuation<? super SnackbarResult> r2) {
            this.visuals = visuals;
            this.continuation = r2;
        }

        @Override // androidx.compose.material3.SnackbarData
        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void performAction() {
            if (this.continuation.isActive() == false) goto L6;
            CancellableContinuation<SnackbarResult> r0 = this.continuation;
            Result.Companion r1 = Result.Companion;
            r0.resumeWith(Result.m7425constructorimpl(SnackbarResult.ActionPerformed));
            return;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive() == false) goto L6;
            CancellableContinuation<SnackbarResult> r0 = this.continuation;
            Result.Companion r1 = Result.Companion;
            r0.resumeWith(Result.m7425constructorimpl(SnackbarResult.Dismissed));
            return;
        }

        public boolean equals(Object other) {
            if (this != other) goto L6;
            return true;
        L6:
            if (other != null) goto L8;
        L17:
            return false;
        L8:
            if (getClass() != other.getClass()) goto L17;
            SnackbarDataImpl r2 = (SnackbarDataImpl) other;
            if (Intrinsics.areEqual(getVisuals(), ((SnackbarDataImpl) other).getVisuals()) == true) goto L14;
            return false;
        L14:
            if (Intrinsics.areEqual(this.continuation, ((SnackbarDataImpl) other).continuation) == true) goto L16;
            return false;
        L16:
            return true;
        }

        public int hashCode() {
            int result = getVisuals().hashCode();
            return (result * 31) + this.continuation.hashCode();
        }
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarVisualsImpl;", "Landroidx/compose/material3/SnackbarVisuals;", "message", "", "actionLabel", "withDismissAction", "", "duration", "Landroidx/compose/material3/SnackbarDuration;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;)V", "getActionLabel", "()Ljava/lang/String;", "getDuration", "()Landroidx/compose/material3/SnackbarDuration;", "getMessage", "getWithDismissAction", "()Z", "equals", "other", "", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class SnackbarVisualsImpl implements SnackbarVisuals {
        private final String actionLabel;
        private final SnackbarDuration duration;
        private final String message;
        private final boolean withDismissAction;

        public SnackbarVisualsImpl(String message, String actionLabel, boolean withDismissAction, SnackbarDuration duration) {
            this.message = message;
            this.actionLabel = actionLabel;
            this.withDismissAction = withDismissAction;
            this.duration = duration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        public boolean equals(Object other) {
            if (this != other) goto L6;
            return true;
        L6:
            if (other != null) goto L8;
        L23:
            return false;
        L8:
            if (getClass() != other.getClass()) goto L23;
            SnackbarVisualsImpl r2 = (SnackbarVisualsImpl) other;
            if (Intrinsics.areEqual(getMessage(), ((SnackbarVisualsImpl) other).getMessage()) == true) goto L14;
            return false;
        L14:
            if (Intrinsics.areEqual(getActionLabel(), ((SnackbarVisualsImpl) other).getActionLabel()) == true) goto L17;
            return false;
        L17:
            if (getWithDismissAction() == ((SnackbarVisualsImpl) other).getWithDismissAction()) goto L20;
            return false;
        L20:
            if (getDuration() == ((SnackbarVisualsImpl) other).getDuration()) goto L22;
            return false;
        L22:
            return true;
        }

        public int hashCode() {
            int result = getMessage().hashCode();
            int r1 = result * 31;
            String r2 = getActionLabel();
            if (r2 == null) goto L5;
            int r3 = r2.hashCode();
        L6:
            int result2 = r1 + r3;
            return (((result2 * 31) + Boolean.hashCode(getWithDismissAction())) * 31) + getDuration().hashCode();
        L5:
            r3 = 0;
            goto L6
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SnackbarHostState$showSnackbar$2, reason: invalid class name */
    /* JADX INFO: compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {446, 449}, m = "showSnackbar", n = {"this", "visuals", "$this$withLock_u24default$iv", "this", "visuals", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SnackbarHostState this$0;

        AnonymousClass2(SnackbarHostState r1, Continuation<? super AnonymousClass2> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.showSnackbar(null, this);
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

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState r6, String r7, String r8, boolean r9, SnackbarDuration r10, Continuation r11, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        String r2 = null;
    L7:
        if ((r12 & 4) == 0) goto L9;
        boolean r3 = false;
    L11:
        if ((r12 & 8) == 0) goto L16;
        if (r2 != null) goto L14;
        SnackbarDuration r14 = SnackbarDuration.Short;
    L15:
        SnackbarDuration r4 = r14;
    L18:
        return r6.showSnackbar(r7, r2, r3, r4, r11);
    L14:
        r14 = SnackbarDuration.Indefinite;
        goto L15
    L16:
        r4 = r10;
        goto L18
    L9:
        r3 = r9;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    public final Object showSnackbar(String message, String actionLabel, boolean withDismissAction, SnackbarDuration duration, Continuation<? super SnackbarResult> r6) {
        return showSnackbar(new SnackbarVisualsImpl(message, actionLabel, withDismissAction, duration), r6);
    }

    public final Object showSnackbar(SnackbarVisuals r19, Continuation<? super SnackbarResult> r20) {
        if ((r20 instanceof AnonymousClass2) == false) goto L7;
        AnonymousClass2 r1 = (AnonymousClass2) r20;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L18;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        AnonymousClass2 r7 = (AnonymousClass2) r1.L$3;
        Mutex $this$withLock_u24default$iv = (Mutex) r1.L$2;
        SnackbarVisuals r8 = (SnackbarVisuals) r1.L$1;
        SnackbarHostState r9 = (SnackbarHostState) r1.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Object r2 = $result;
        Object owner$iv = null;
    L50:
        r9.setCurrentSnackbarData(null);     // Catch: Throwable -> L35
        $this$withLock_u24default$iv.unlock(owner$iv);
        return r2;
    L35:
        th = th;
    L46:
        $this$withLock_u24default$iv.unlock(owner$iv);
        throw th;
    L15:
        th = th;
        Object owner$iv2 = null;
    L48:
        r9.setCurrentSnackbarData(null);     // Catch: Throwable -> L44
        throw th;     // Catch: Throwable -> L44
    L44:
        th = th;
        owner$iv = owner$iv2;
        goto L46
    L17:
        Mutex $this$withLock_u24default$iv2 = (Mutex) r1.L$2;
        SnackbarVisuals visuals = (SnackbarVisuals) r1.L$1;
        SnackbarHostState r10 = (SnackbarHostState) r1.L$0;
        ResultKt.throwOnFailure($result);
        owner$iv = null;
        $this$withLock_u24default$iv = $this$withLock_u24default$iv2;
        r9 = r10;
    L22:
        Continuation $completion$iv = r1;
        r1.L$0 = r9;     // Catch: Throwable -> L39
        r1.L$1 = visuals;     // Catch: Throwable -> L39
        r1.L$2 = $this$withLock_u24default$iv;     // Catch: Throwable -> L39
        r1.L$3 = $completion$iv;     // Catch: Throwable -> L39
        r1.label = 2;     // Catch: Throwable -> L39
        Continuation uCont$iv = $completion$iv;     // Catch: Throwable -> L39
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);     // Catch: Throwable -> L37
        cancellable$iv.initCancellability();     // Catch: Throwable -> L37
        CancellableContinuationImpl continuation = cancellable$iv;     // Catch: Throwable -> L37
        access$setCurrentSnackbarData(r9, new SnackbarDataImpl(visuals, continuation));     // Catch: Throwable -> L37
        r2 = cancellable$iv.getResult();     // Catch: Throwable -> L37
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L28;
        DebugProbesKt.probeCoroutineSuspended($completion$iv);     // Catch: Throwable -> L37
    L28:
        if (r2 != r0) goto L50;
        return r0;
    L37:
        th = th;
        owner$iv2 = owner$iv;
    L39:
        th = th;
        owner$iv2 = owner$iv;
        goto L48
    L18:
        ResultKt.throwOnFailure($result);
        visuals = r19;
        $this$withLock_u24default$iv = this.mutex;
        r1.L$0 = this;
        r1.L$1 = visuals;
        r1.L$2 = $this$withLock_u24default$iv;
        r1.label = 1;
        if ($this$withLock_u24default$iv.lock(null, r1) != r0) goto L21;
        return r0;
    L21:
        r9 = this;
        owner$iv = null;
        goto L22
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new AnonymousClass2(this, r20);
        goto L8
    }
}
