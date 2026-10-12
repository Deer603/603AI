package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: AndroidUiFrameClock.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J(\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H\u000b0\rH\u0096@¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "choreographer", "Landroid/view/Choreographer;", "(Landroid/view/Choreographer;)V", "dispatcher", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/AndroidUiDispatcher;)V", "getChoreographer", "()Landroid/view/Choreographer;", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 0;
    private final Choreographer choreographer;
    private final AndroidUiDispatcher dispatcher;

    static {
        $stable = 8;
    }

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher dispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = dispatcher;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> r3) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r2, r3);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> r2) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, r2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> r2) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, r2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext context) {
        return MonotonicFrameClock.DefaultImpls.plus(this, context);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public AndroidUiFrameClock(Choreographer choreographer) {
        this(choreographer, null);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(final Function1<? super Long, ? extends R> r11, Continuation<? super R> r12) {
        final AndroidUiDispatcher uiDispatcher = this.dispatcher;
        if (uiDispatcher != null) goto L8;
        CoroutineContext.Element r0 = r12.getContext().get(ContinuationInterceptor.Key);
        if ((r0 instanceof AndroidUiDispatcher) == false) goto L7;
        uiDispatcher = (AndroidUiDispatcher) r0;
        goto L8
    L7:
        uiDispatcher = null;
    L8:
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r12), 1);
        cancellable$iv.initCancellability();
        final CancellableContinuationImpl co = cancellable$iv;
        final Choreographer.FrameCallback callback = new AndroidUiFrameClock$withFrameNanos$2$callback$1(co, this, r11);
        if (uiDispatcher != null) goto L11;
    L13:
        getChoreographer().postFrameCallback(callback);
        co.invokeOnCancellation(new AndroidUiFrameClock$withFrameNanos$2$2(this, callback));
    L14:
        Object r2 = cancellable$iv.getResult();
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L18;
        DebugProbesKt.probeCoroutineSuspended(r12);
    L18:
        return r2;
    L11:
        if (Intrinsics.areEqual(uiDispatcher.getChoreographer(), getChoreographer()) == false) goto L13;
        uiDispatcher.postFrameCallback$ui_release(callback);
        co.invokeOnCancellation(new AndroidUiFrameClock$withFrameNanos$2$1(uiDispatcher, callback));
        goto L14
    }
}
