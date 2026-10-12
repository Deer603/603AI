package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: WithLifecycleState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086H¢\u0006\u0002\u0010\u0007\u001a(\u0010\b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086H¢\u0006\u0002\u0010\t\u001a(\u0010\n\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086H¢\u0006\u0002\u0010\t\u001a(\u0010\u000b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086H¢\u0006\u0002\u0010\t\u001a0\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086H¢\u0006\u0002\u0010\r\u001a(\u0010\b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086H¢\u0006\u0002\u0010\u000e\u001a(\u0010\n\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086H¢\u0006\u0002\u0010\u000e\u001a(\u0010\u000b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086H¢\u0006\u0002\u0010\u000e\u001a0\u0010\u000f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0081H¢\u0006\u0002\u0010\u0007\u001a>\u0010\u0010\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0081@¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"withStateAtLeast", "R", "Landroidx/lifecycle/Lifecycle;", "state", "Landroidx/lifecycle/Lifecycle$State;", "block", "Lkotlin/Function0;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withCreated", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withStarted", "withResumed", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withStateAtLeastUnchecked", "suspendWithStateAtLeastUnchecked", "dispatchNeeded", "", "lifecycleDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WithLifecycleStateKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2, reason: invalid class name */
    /* JADX INFO: compiled from: WithLifecycleState.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass2<R> implements Function0<R> {
        final /* synthetic */ Function0<R> $block;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function0<? extends R> r1) {
            this.$block = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final R invoke() {
            return this.$block.invoke();
        }
    }

    public static final <R> Object withStateAtLeast(Lifecycle $this$withStateAtLeast, Lifecycle.State state, Function0<? extends R> r11, Continuation<? super R> r12) {
        if (state.compareTo(Lifecycle.State.CREATED) < 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L19;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded(r12.getContext());
        if (dispatchNeeded$iv == true) goto L17;
        if ($this$withStateAtLeast.getCurrentState() == Lifecycle.State.DESTROYED) goto L15;
        if ($this$withStateAtLeast.getCurrentState().compareTo(state) < 0) goto L17;
        return r11.invoke();
    L15:
        throw new LifecycleDestroyedException();
    L17:
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeast, state, dispatchNeeded$iv, lifecycleDispatcher$iv, new AnonymousClass2(r11), r12);
    L19:
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    L5:
        r1 = false;
        goto L6
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle $this$withStateAtLeast, Lifecycle.State state, Function0<? extends R> r6, Continuation<? super R> r7) {
        if (state.compareTo(Lifecycle.State.CREATED) < 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L8;
        Dispatchers.getMain().getImmediate();
        Continuation r4 = null;
        r4.getContext();
        throw null;
    L8:
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    L5:
        r1 = false;
        goto L6
    }

    public static final <R> Object withCreated(Lifecycle $this$withCreated, Function0<? extends R> r10, Continuation<? super R> r11) {
        Lifecycle.State state$iv = Lifecycle.State.CREATED;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded(r11.getContext());
        if (dispatchNeeded$iv == true) goto L12;
        if ($this$withCreated.getCurrentState() == Lifecycle.State.DESTROYED) goto L10;
        if ($this$withCreated.getCurrentState().compareTo(state$iv) < 0) goto L12;
        return r10.invoke();
    L10:
        throw new LifecycleDestroyedException();
    L12:
        return suspendWithStateAtLeastUnchecked($this$withCreated, state$iv, dispatchNeeded$iv, lifecycleDispatcher$iv, new AnonymousClass2(r10), r11);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle $this$withCreated, Function0<? extends R> r1, Continuation<? super R> r2) {
        Lifecycle.State r0 = Lifecycle.State.CREATED;
        Dispatchers.getMain().getImmediate();
        Continuation r3 = null;
        r3.getContext();
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle $this$withStarted, Function0<? extends R> r10, Continuation<? super R> r11) {
        Lifecycle.State state$iv = Lifecycle.State.STARTED;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded(r11.getContext());
        if (dispatchNeeded$iv == true) goto L12;
        if ($this$withStarted.getCurrentState() == Lifecycle.State.DESTROYED) goto L10;
        if ($this$withStarted.getCurrentState().compareTo(state$iv) < 0) goto L12;
        return r10.invoke();
    L10:
        throw new LifecycleDestroyedException();
    L12:
        return suspendWithStateAtLeastUnchecked($this$withStarted, state$iv, dispatchNeeded$iv, lifecycleDispatcher$iv, new AnonymousClass2(r10), r11);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle $this$withStarted, Function0<? extends R> r1, Continuation<? super R> r2) {
        Lifecycle.State r0 = Lifecycle.State.STARTED;
        Dispatchers.getMain().getImmediate();
        Continuation r3 = null;
        r3.getContext();
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle $this$withResumed, Function0<? extends R> r10, Continuation<? super R> r11) {
        Lifecycle.State state$iv = Lifecycle.State.RESUMED;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded(r11.getContext());
        if (dispatchNeeded$iv == true) goto L12;
        if ($this$withResumed.getCurrentState() == Lifecycle.State.DESTROYED) goto L10;
        if ($this$withResumed.getCurrentState().compareTo(state$iv) < 0) goto L12;
        return r10.invoke();
    L10:
        throw new LifecycleDestroyedException();
    L12:
        return suspendWithStateAtLeastUnchecked($this$withResumed, state$iv, dispatchNeeded$iv, lifecycleDispatcher$iv, new AnonymousClass2(r10), r11);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle $this$withResumed, Function0<? extends R> r1, Continuation<? super R> r2) {
        Lifecycle.State r0 = Lifecycle.State.RESUMED;
        Dispatchers.getMain().getImmediate();
        Continuation r3 = null;
        r3.getContext();
        throw null;
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner $this$withStateAtLeast, Lifecycle.State state, Function0<? extends R> r13, Continuation<? super R> r14) {
        Lifecycle $this$withStateAtLeast$iv = $this$withStateAtLeast.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) < 0) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L20;
        MainCoroutineDispatcher lifecycleDispatcher$iv$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv$iv = lifecycleDispatcher$iv$iv.isDispatchNeeded(r14.getContext());
        if (dispatchNeeded$iv$iv == true) goto L18;
        if ($this$withStateAtLeast$iv.getCurrentState() == Lifecycle.State.DESTROYED) goto L15;
        if ($this$withStateAtLeast$iv.getCurrentState().compareTo(state) < 0) goto L18;
        return r13.invoke();
    L15:
        throw new LifecycleDestroyedException();
    L18:
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeast$iv, state, dispatchNeeded$iv$iv, lifecycleDispatcher$iv$iv, new AnonymousClass2(r13), r14);
    L20:
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    L5:
        r3 = false;
        goto L6
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner $this$withStateAtLeast, Lifecycle.State state, Function0<? extends R> r8, Continuation<? super R> r9) {
        $this$withStateAtLeast.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) < 0) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L8;
        Dispatchers.getMain().getImmediate();
        Continuation r6 = null;
        r6.getContext();
        throw null;
    L8:
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    L5:
        r3 = false;
        goto L6
    }

    public static final <R> Object withCreated(LifecycleOwner $this$withCreated, Function0<? extends R> r10, Continuation<? super R> r11) {
        Lifecycle $this$withStateAtLeastUnchecked$iv = $this$withCreated.getLifecycle();
        Lifecycle.State state$iv = Lifecycle.State.CREATED;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded(r11.getContext());
        if (dispatchNeeded$iv == true) goto L12;
        if ($this$withStateAtLeastUnchecked$iv.getCurrentState() == Lifecycle.State.DESTROYED) goto L10;
        if ($this$withStateAtLeastUnchecked$iv.getCurrentState().compareTo(state$iv) < 0) goto L12;
        return r10.invoke();
    L10:
        throw new LifecycleDestroyedException();
    L12:
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked$iv, state$iv, dispatchNeeded$iv, lifecycleDispatcher$iv, new AnonymousClass2(r10), r11);
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner $this$withCreated, Function0<? extends R> r1, Continuation<? super R> r2) {
        $this$withCreated.getLifecycle();
        Lifecycle.State r0 = Lifecycle.State.CREATED;
        Dispatchers.getMain().getImmediate();
        Continuation r3 = null;
        r3.getContext();
        throw null;
    }

    public static final <R> Object withStarted(LifecycleOwner $this$withStarted, Function0<? extends R> r10, Continuation<? super R> r11) {
        Lifecycle $this$withStateAtLeastUnchecked$iv = $this$withStarted.getLifecycle();
        Lifecycle.State state$iv = Lifecycle.State.STARTED;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded(r11.getContext());
        if (dispatchNeeded$iv == true) goto L12;
        if ($this$withStateAtLeastUnchecked$iv.getCurrentState() == Lifecycle.State.DESTROYED) goto L10;
        if ($this$withStateAtLeastUnchecked$iv.getCurrentState().compareTo(state$iv) < 0) goto L12;
        return r10.invoke();
    L10:
        throw new LifecycleDestroyedException();
    L12:
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked$iv, state$iv, dispatchNeeded$iv, lifecycleDispatcher$iv, new AnonymousClass2(r10), r11);
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner $this$withStarted, Function0<? extends R> r1, Continuation<? super R> r2) {
        $this$withStarted.getLifecycle();
        Lifecycle.State r0 = Lifecycle.State.STARTED;
        Dispatchers.getMain().getImmediate();
        Continuation r3 = null;
        r3.getContext();
        throw null;
    }

    public static final <R> Object withResumed(LifecycleOwner $this$withResumed, Function0<? extends R> r10, Continuation<? super R> r11) {
        Lifecycle $this$withStateAtLeastUnchecked$iv = $this$withResumed.getLifecycle();
        Lifecycle.State state$iv = Lifecycle.State.RESUMED;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded(r11.getContext());
        if (dispatchNeeded$iv == true) goto L12;
        if ($this$withStateAtLeastUnchecked$iv.getCurrentState() == Lifecycle.State.DESTROYED) goto L10;
        if ($this$withStateAtLeastUnchecked$iv.getCurrentState().compareTo(state$iv) < 0) goto L12;
        return r10.invoke();
    L10:
        throw new LifecycleDestroyedException();
    L12:
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked$iv, state$iv, dispatchNeeded$iv, lifecycleDispatcher$iv, new AnonymousClass2(r10), r11);
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner $this$withResumed, Function0<? extends R> r1, Continuation<? super R> r2) {
        $this$withResumed.getLifecycle();
        Lifecycle.State r0 = Lifecycle.State.RESUMED;
        Dispatchers.getMain().getImmediate();
        Continuation r3 = null;
        r3.getContext();
        throw null;
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle $this$withStateAtLeastUnchecked, Lifecycle.State state, Function0<? extends R> r11, Continuation<? super R> r12) {
        MainCoroutineDispatcher lifecycleDispatcher = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded = lifecycleDispatcher.isDispatchNeeded(r12.getContext());
        if (dispatchNeeded == true) goto L13;
        if ($this$withStateAtLeastUnchecked.getCurrentState() == Lifecycle.State.DESTROYED) goto L11;
        if ($this$withStateAtLeastUnchecked.getCurrentState().compareTo(state) < 0) goto L13;
        return r11.invoke();
    L11:
        throw new LifecycleDestroyedException();
    L13:
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked, state, dispatchNeeded, lifecycleDispatcher, new AnonymousClass2(r11), r12);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle $this$withStateAtLeastUnchecked, Lifecycle.State state, Function0<? extends R> r2, Continuation<? super R> r3) {
        Dispatchers.getMain().getImmediate();
        Continuation r0 = null;
        r0.getContext();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle $this$suspendWithStateAtLeastUnchecked, final Lifecycle.State state, boolean dispatchNeeded, final CoroutineDispatcher lifecycleDispatcher, final Function0<? extends R> r13, Continuation<? super R> r14) {
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r14), 1);
        cancellable$iv.initCancellability();
        final CancellableContinuationImpl co = cancellable$iv;
        final ?? r6 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1(state, $this$suspendWithStateAtLeastUnchecked, co, r13);
        if (dispatchNeeded == false) goto L5;
        lifecycleDispatcher.mo8970dispatch(EmptyCoroutineContext.INSTANCE, new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1($this$suspendWithStateAtLeastUnchecked, r6));
    L6:
        co.invokeOnCancellation(new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(lifecycleDispatcher, $this$suspendWithStateAtLeastUnchecked, r6));
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        DebugProbesKt.probeCoroutineSuspended(r14);
    L10:
        return r1;
    L5:
        $this$suspendWithStateAtLeastUnchecked.addObserver((LifecycleObserver) r6);
        goto L6
    }
}
