package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import androidx.autofill.HintConstants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NonDisposableHandle;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0002J\u001c\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0016J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", HintConstants.AUTOFILL_HINT_NAME, "", "(Landroid/os/Handler;Ljava/lang/String;)V", "invokeImmediately", "", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "cancelOnRejection", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "equals", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "isDispatchNeeded", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "kotlinx-coroutines-android"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HandlerContext extends HandlerDispatcher implements Delay {
    private final Handler handler;
    private final HandlerContext immediate;
    private final boolean invokeImmediately;
    private final String name;

    public static final /* synthetic */ Handler access$getHandler$p(HandlerContext $this) {
        return $this.handler;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public /* bridge */ /* synthetic */ MainCoroutineDispatcher getImmediate() {
        return getImmediate();
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.MainCoroutineDispatcher
    public /* bridge */ /* synthetic */ HandlerDispatcher getImmediate() {
        return getImmediate();
    }

    private HandlerContext(Handler handler, String name, boolean invokeImmediately) {
        super(null);
        this.handler = handler;
        this.name = name;
        this.invokeImmediately = invokeImmediately;
        if (this.invokeImmediately == false) goto L5;
        HandlerContext r0 = this;
    L6:
        this.immediate = r0;
        return;
    L5:
        r0 = new HandlerContext(this.handler, this.name, true);
        goto L6
    }

    public /* synthetic */ HandlerContext(Handler r1, String r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }

    public HandlerContext(Handler handler, String name) {
        this(handler, name, false);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.MainCoroutineDispatcher
    public HandlerContext getImmediate() {
        return this.immediate;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext context) {
        if (this.invokeImmediately == true) goto L5;
    L8:
        return true;
    L5:
        if (Intrinsics.areEqual(Looper.myLooper(), this.handler.getLooper()) == false) goto L8;
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo8970dispatch(CoroutineContext context, Runnable block) {
        if (this.handler.post(block) == true) goto L6;
        cancelOnRejection(context, block);
        return;
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo8971scheduleResumeAfterDelay(long timeMillis, final CancellableContinuation<? super Unit> r7) {
        final Runnable block = new HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1(r7, this);
        if (this.handler.postDelayed(block, RangesKt.coerceAtMost(timeMillis, 4611686018427387903L)) == false) goto L5;
        r7.invokeOnCancellation(new AnonymousClass1(this, block));
        return;
    L5:
        cancelOnRejection(r7.getContext(), block);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long timeMillis, final Runnable block, CoroutineContext context) {
        if (this.handler.postDelayed(block, RangesKt.coerceAtMost(timeMillis, 4611686018427387903L)) == true) goto L5;
        cancelOnRejection(context, block);
        return NonDisposableHandle.INSTANCE;
    L5:
        return new HandlerContext$$ExternalSyntheticLambda0(this, block);
    }

    static final void invokeOnTimeout$lambda$2(HandlerContext this$0, Runnable $block) {
        this$0.handler.removeCallbacks($block);
    }

    private final void cancelOnRejection(CoroutineContext context, Runnable block) {
        JobKt.cancel(context, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Dispatchers.getIO().mo8970dispatch(context, block);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String r0 = toStringInternalImpl();
        if (r0 != null) goto L13;
        HandlerContext $this$toString_u24lambda_u243 = this;
        String str = $this$toString_u24lambda_u243.name;
        if (str != null) goto L8;
        str = $this$toString_u24lambda_u243.handler.toString();
    L8:
        if ($this$toString_u24lambda_u243.invokeImmediately == false) goto L12;
        return str + ".immediate";
    L12:
        return str;
    L13:
        return r0;
    }

    public boolean equals(Object other) {
        if ((other instanceof HandlerContext) == true) goto L5;
    L9:
        return false;
    L5:
        if (((HandlerContext) other).handler != this.handler) goto L9;
        if (((HandlerContext) other).invokeImmediately != this.invokeImmediately) goto L9;
        return true;
    }

    public int hashCode() {
        int r0 = System.identityHashCode(this.handler);
        if (this.invokeImmediately == false) goto L5;
        int r1 = 1231;
    L7:
        return r0 ^ r1;
    L5:
        r1 = 1237;
        goto L7
    }
}
