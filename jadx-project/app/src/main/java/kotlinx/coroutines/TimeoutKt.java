package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\\\u0010\b\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\n\"\b\b\u0001\u0010\u000b*\u0002H\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000b0\f2'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0002\u0010\u0012\u001aR\u0010\u0013\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0014\u001a\u00020\u00032'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e¢\u0006\u0002\b\u0011H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0015\u001aW\u0010\u0013\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0016\u001a\u00020\u00172'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e¢\u0006\u0002\b\u0011H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0018\u0010\u0015\u001aG\u0010\u0019\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0014\u001a\u00020\u00032'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e¢\u0006\u0002\b\u0011H\u0086@¢\u0006\u0002\u0010\u0015\u001aL\u0010\u0019\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0016\u001a\u00020\u00172'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e¢\u0006\u0002\b\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"TimeoutCancellationException", "Lkotlinx/coroutines/TimeoutCancellationException;", "time", "", "delay", "Lkotlinx/coroutines/Delay;", "coroutine", "Lkotlinx/coroutines/Job;", "setupTimeout", "", "U", "T", "Lkotlinx/coroutines/TimeoutCoroutine;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/TimeoutCoroutine;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "withTimeout", "timeMillis", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeout", "Lkotlin/time/Duration;", "withTimeout-KLykuaI", "withTimeoutOrNull", "withTimeoutOrNull-KLykuaI", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TimeoutKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1, reason: invalid class name */
    /* JADX INFO: compiled from: Timeout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {101}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            this.result = r5;
            this.label |= Integer.MIN_VALUE;
            return TimeoutKt.withTimeoutOrNull(0, null, this);
        }
    }

    public static final <T> Object withTimeout(long timeMillis, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> r5, Continuation<? super T> r6) {
        if (timeMillis <= 0) goto L9;
        Object r0 = setupTimeout(new TimeoutCoroutine(timeMillis, r6), r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L7;
        DebugProbesKt.probeCoroutineSuspended(r6);
    L7:
        return r0;
    L9:
        throw new TimeoutCancellationException("Timed out immediately");
    }

    /* JADX INFO: renamed from: withTimeout-KLykuaI, reason: not valid java name */
    public static final <T> Object m8913withTimeoutKLykuaI(long timeout, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> r4, Continuation<? super T> r5) {
        return withTimeout(DelayKt.m8905toDelayMillisLRDsOJo(timeout), r4, r5);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [T, kotlinx.coroutines.TimeoutCoroutine] */
    public static final <T> Object withTimeoutOrNull(long r7, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> r9, Continuation<? super T> r10) {
        if ((r10 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r11 = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        long r8 = r0.J$0;
        Ref.ObjectRef r12 = (Ref.ObjectRef) r0.L$1;
        Function2 r13 = (Function2) r0.L$0;
        ResultKt.throwOnFailure(r11);     // Catch: TimeoutCancellationException -> L15
        return r11;
    L15:
        e = e;
    L31:
        if (e.coroutine != r12.element) goto L33;
        return null;
    L33:
        throw e;
    L17:
        ResultKt.throwOnFailure(r11);
        if (r7 > 0) goto L20;
        return null;
    L20:
        Ref.ObjectRef r2 = new Ref.ObjectRef();
        r0.L$0 = r9;     // Catch: TimeoutCancellationException -> L28
        r0.L$1 = r2;     // Catch: TimeoutCancellationException -> L28
        r0.J$0 = r7;     // Catch: TimeoutCancellationException -> L28
        r0.label = 1;     // Catch: TimeoutCancellationException -> L28
        ?? r6 = (T) new TimeoutCoroutine(r7, r0);
        r2.element = r6;     // Catch: TimeoutCancellationException -> L28
        Object r14 = setupTimeout(r6, r9);     // Catch: TimeoutCancellationException -> L28
        if (r14 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L24;
        DebugProbesKt.probeCoroutineSuspended(r0);     // Catch: TimeoutCancellationException -> L28
    L24:
        if (r14 != r1) goto L27;
        return r1;
    L27:
        return r14;
    L28:
        e = e;
        r12 = r2;
        goto L31
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r10);
        goto L8
    }

    /* JADX INFO: renamed from: withTimeoutOrNull-KLykuaI, reason: not valid java name */
    public static final <T> Object m8914withTimeoutOrNullKLykuaI(long timeout, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> r4, Continuation<? super T> r5) {
        return withTimeoutOrNull(DelayKt.m8905toDelayMillisLRDsOJo(timeout), r4, r5);
    }

    private static final <U, T extends U> Object setupTimeout(TimeoutCoroutine<U, ? super T> r8, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> r9) {
        CoroutineContext context = r8.uCont.getContext();
        JobKt.disposeOnCompletion(r8, DelayKt.getDelay(context).invokeOnTimeout(r8.time, r8, r8.getContext()));
        return UndispatchedKt.startUndispatchedOrReturnIgnoreTimeout(r8, r8, r9);
    }

    public static final TimeoutCancellationException TimeoutCancellationException(long time, Delay delay, Job coroutine) {
        if ((delay instanceof DelayWithTimeoutDiagnostics) == false) goto L5;
        DelayWithTimeoutDiagnostics r0 = (DelayWithTimeoutDiagnostics) delay;
    L6:
        if (r0 == null) goto L9;
        Duration.Companion r1 = Duration.Companion;
        String message = r0.m8906timeoutMessageLRDsOJo(DurationKt.toDuration(time, DurationUnit.MILLISECONDS));
        if (message == null) goto L9;
    L11:
        return new TimeoutCancellationException(message, coroutine);
    L9:
        message = "Timed out waiting for " + time + " ms";
        goto L11
    L5:
        r0 = null;
        goto L6
    }
}
