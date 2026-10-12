package androidx.compose.ui;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SessionMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", i = {0, 1}, l = {LockFreeTaskQueueCore.CLOSED_SHIFT, 63}, m = "invokeSuspend", n = {"newSession", "newSession"}, s = {"L$0", "L$0"})
final class SessionMutex$withSessionCancellingPrevious$2<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
    final /* synthetic */ AtomicReference<SessionMutex.Session<T>> $arg0;
    final /* synthetic */ Function2<T, Continuation<? super R>, Object> $session;
    final /* synthetic */ Function1<CoroutineScope, T> $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: Multi-variable type inference failed */
    SessionMutex$withSessionCancellingPrevious$2(Function1<? super CoroutineScope, ? extends T> r2, AtomicReference<SessionMutex.Session<T>> r3, Function2<? super T, ? super Continuation<? super R>, ? extends Object> r4, Continuation<? super SessionMutex$withSessionCancellingPrevious$2> r5) {
        this.$sessionInitializer = r2;
        this.$arg0 = r3;
        this.$session = r4;
        super(2, r5);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
        SessionMutex$withSessionCancellingPrevious$2 r0 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, r6);
        r0.L$0 = r5;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Object r3) {
        return invoke(r2, (Continuation) r3);
    }

    public final Object invoke(CoroutineScope r3, Continuation<? super R> r4) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2<R> for r7v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r1 = r7.label;
        switch(r1) {
            case 0: goto L12;
            case 1: goto L11;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw r8;
    L6:
        java.lang.Object r0 = r7.L$0;
        androidx.compose.ui.SessionMutex.Session r0 = (androidx.compose.ui.SessionMutex.Session) r0;
        kotlin.ResultKt.throwOnFailure(r8);     // Catch: java.lang.Throwable -> L9
        androidx.compose.ui.SessionMutex.Session r1 = r0;
    L24:
        java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> r3 = r7.$arg0;
        androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(r3, r1, null);
        return r8;
    L9:
        java.lang.Throwable r1 = th;
    L28:
        java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> r3 = r7.$arg0;
        androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(r3, r0, null);
        throw r1;
    L11:
        java.lang.Object r1 = r7.L$0;
        r1 = (androidx.compose.ui.SessionMutex.Session) r1;
        kotlin.ResultKt.throwOnFailure(r8);
    L30:
        kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r7.$session;     // Catch: java.lang.Throwable -> L26
        java.lang.Object r4 = r1.getValue();     // Catch: java.lang.Throwable -> L26
        r7.L$0 = r1;     // Catch: java.lang.Throwable -> L26
        r7.label = 2;     // Catch: java.lang.Throwable -> L26
        T r4 = (T) r4;
        java.lang.Object r7 = (kotlin.coroutines.Continuation<? super R>) r7;
        java.lang.Object r3 = r3.invoke(r4, r7);     // Catch: java.lang.Throwable -> L26
        if (r3 != r0) goto L23;
        return r0;
    L23:
        r8 = r3;
    L26:
        r0 = move-exception;
        androidx.compose.ui.SessionMutex.Session r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L28
    L12:
        kotlin.ResultKt.throwOnFailure(r8);
        java.lang.Object r1 = r7.L$0;
        kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1;
        kotlin.coroutines.CoroutineContext r4 = r1.getCoroutineContext();
        kotlinx.coroutines.Job r4 = kotlinx.coroutines.JobKt.getJob(r4);
        kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, T> r5 = r7.$sessionInitializer;
        java.lang.Object r5 = r5.invoke(r1);
        androidx.compose.ui.SessionMutex.Session r3 = new androidx.compose.ui.SessionMutex.Session(r4, r5);
        r1 = r3;
        java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> r3 = r7.$arg0;
        androidx.compose.ui.SessionMutex.Session<T> r1 = (androidx.compose.ui.SessionMutex.Session<T>) r1;
        java.lang.Object r3 = r3.getAndSet(r1);
        androidx.compose.ui.SessionMutex.Session r3 = (androidx.compose.ui.SessionMutex.Session) r3;
        if (r3 == null) goto L30;
        kotlinx.coroutines.Job r3 = r3.getJob();
        if (r3 == null) goto L30;
        androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2<R> r4 = (kotlin.coroutines.Continuation) r7;
        r7.L$0 = r1;
        r7.label = 1;
        java.lang.Object r3 = kotlinx.coroutines.JobKt.cancelAndJoin(r3, r4);
        if (r3 != r0) goto L30;
        return r0;
    }
}
