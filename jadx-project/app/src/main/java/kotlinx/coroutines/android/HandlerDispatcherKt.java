package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.autofill.HintConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\b\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\t\u001a\u000e\u0010\n\u001a\u00020\u0001H\u0082@¢\u0006\u0002\u0010\t\u001a\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a\u001d\u0010\u0010\u001a\u00020\u0003*\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\b\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0011*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"MAX_DELAY", "", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getMain$annotations", "()V", "choreographer", "Landroid/view/Choreographer;", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFrameSlowPath", "postFrameCallback", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "updateChoreographerAndPostFrameCallback", "asCoroutineDispatcher", "Landroid/os/Handler;", HintConstants.AUTOFILL_HINT_NAME, "", "from", "asHandler", "Landroid/os/Looper;", "async", "", "kotlinx-coroutines-android"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HandlerDispatcherKt {
    private static final long MAX_DELAY = 4611686018427387903L;
    public static final HandlerDispatcher Main = null;
    private static volatile Choreographer choreographer;

    public static final /* synthetic */ Object access$awaitFrameSlowPath(Continuation $completion) {
        return awaitFrameSlowPath($completion);
    }

    public static final /* synthetic */ void access$postFrameCallback(Choreographer choreographer2, CancellableContinuation cont) {
        postFrameCallback(choreographer2, cont);
    }

    public static final /* synthetic */ void access$updateChoreographerAndPostFrameCallback(CancellableContinuation cont) {
        updateChoreographerAndPostFrameCallback(cont);
    }

    public static final HandlerDispatcher from(Handler r2) {
        return from$default(r2, null, 1, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void getMain$annotations() {
    }

    public static /* synthetic */ HandlerDispatcher from$default(Handler r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = null;
    L6:
        return from(r0, r1);
    }

    public static final HandlerDispatcher from(Handler $this$asCoroutineDispatcher, String name) {
        return new HandlerContext($this$asCoroutineDispatcher, name);
    }

    public static final Handler asHandler(Looper $this$asHandler, boolean async) {
        if (async == false) goto L15;
        if (Build.VERSION.SDK_INT < 28) goto L16;
        Method factoryMethod = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class});
        Object r1 = factoryMethod.invoke(null, new Object[]{$this$asHandler});
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) r1;
    L16:
        Constructor constructor = Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE});     // Catch: NoSuchMethodException -> L11
        return (Handler) constructor.newInstance(new Object[]{$this$asHandler, null, true});
    L13:
        return new Handler($this$asHandler);
    L15:
        return new Handler($this$asHandler);
    }

    static {
        Object r0 = null;
        Result.Companion r1 = Result.Companion;     // Catch: Throwable -> L5
        Object r2 = Result.m7425constructorimpl(new HandlerContext(asHandler(Looper.getMainLooper(), true), null, 2, null));     // Catch: Throwable -> L5
    L8:
        if (Result.m7431isFailureimpl(r2) == true) goto L11;
        r0 = r2;
    L11:
        Main = (HandlerDispatcher) r0;
        return;
    L5:
        th = move-exception;
        Result.Companion r3 = Result.Companion;
        r2 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L8
    }

    public static final Object awaitFrame(Continuation<? super Long> r7) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) goto L10;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r7), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl cont = cancellable$iv;
        access$postFrameCallback(choreographer2, cont);
        Object r2 = cancellable$iv.getResult();
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L8;
        DebugProbesKt.probeCoroutineSuspended(r7);
    L8:
        return r2;
    L10:
        return awaitFrameSlowPath(r7);
    }

    private static final Object awaitFrameSlowPath(Continuation<? super Long> r10) {
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r10), 1);
        cancellable$iv.initCancellability();
        final CancellableContinuationImpl cont = cancellable$iv;
        if (Looper.myLooper() != Looper.getMainLooper()) goto L5;
        access$updateChoreographerAndPostFrameCallback(cont);
    L6:
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        DebugProbesKt.probeCoroutineSuspended(r10);
    L10:
        return r1;
    L5:
        Dispatchers.getMain().mo8970dispatch(cont.getContext(), new HandlerDispatcherKt$awaitFrameSlowPath$lambda$3$$inlined$Runnable$1(cont));
        goto L6
    }

    private static final void updateChoreographerAndPostFrameCallback(CancellableContinuation<? super Long> r3) {
        Choreographer it = choreographer;
        if (it != null) goto L5;
        it = Choreographer.getInstance();
        Intrinsics.checkNotNull(it);
        choreographer = it;
    L5:
        postFrameCallback(it, r3);
    }

    private static final void postFrameCallback(Choreographer choreographer2, final CancellableContinuation<? super Long> r2) {
        choreographer2.postFrameCallback(new HandlerDispatcherKt$$ExternalSyntheticLambda0(r2));
    }

    static final void postFrameCallback$lambda$6(CancellableContinuation $cont, long nanos) {
        $cont.resumeUndispatched(Dispatchers.getMain(), Long.valueOf(nanos));
    }
}
