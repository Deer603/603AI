package kotlinx.coroutines;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0005\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0007\u001a\u0016\u0010\u0000\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\u0000\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u0016\u0010\u000f\u001a\u00020\n*\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"delay", "Lkotlinx/coroutines/Delay;", "Lkotlin/coroutines/CoroutineContext;", "getDelay", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Delay;", "awaitCancellation", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeMillis", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "duration", "Lkotlin/time/Duration;", "delay-VtjQ1oo", "toDelayMillis", "toDelayMillis-LRDsOJo", "(J)J", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DelayKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.DelayKt$awaitCancellation$1, reason: invalid class name */
    /* JADX INFO: compiled from: Delay.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {160}, m = "awaitCancellation", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return DelayKt.awaitCancellation(this);
        }
    }

    public static final Object awaitCancellation(Continuation<?> r8) {
        if ((r8 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r8;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
    L20:
        throw new KotlinNothingValueException();
    L13:
        ResultKt.throwOnFailure($result);
        r0.label = 1;
        Continuation uCont$iv = r0;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);
        cancellable$iv.initCancellability();
        Object r3 = cancellable$iv.getResult();
        if (r3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L16;
        DebugProbesKt.probeCoroutineSuspended(r0);
    L16:
        if (r3 != r1) goto L20;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r8);
        goto L8
    }

    public static final Object delay(long timeMillis, Continuation<? super Unit> r10) {
        if (timeMillis <= 0) goto L5;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r10), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl cont = cancellable$iv;
        if (timeMillis >= Long.MAX_VALUE) goto L9;
        getDelay(cont.getContext()).mo8971scheduleResumeAfterDelay(timeMillis, cont);
    L9:
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L13;
        DebugProbesKt.probeCoroutineSuspended(r10);
    L13:
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L16;
        return r1;
    L16:
        return Unit.INSTANCE;
    L5:
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final Object m8904delayVtjQ1oo(long duration, Continuation<? super Unit> r4) {
        Object r0 = delay(m8905toDelayMillisLRDsOJo(duration), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public static final Delay getDelay(CoroutineContext $this$delay) {
        CoroutineContext.Element r0 = $this$delay.get(ContinuationInterceptor.Key);
        if ((r0 instanceof Delay) == false) goto L5;
        Delay r1 = (Delay) r0;
    L6:
        if (r1 == null) goto L8;
        return r1;
    L8:
        return DefaultExecutorKt.getDefaultDelay();
    L5:
        r1 = null;
        goto L6
    }

    /* JADX INFO: renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m8905toDelayMillisLRDsOJo(long $this$toDelayMillis_u2dLRDsOJo) {
        boolean r0 = Duration.m8791isPositiveimpl($this$toDelayMillis_u2dLRDsOJo);
        if (r0 != true) goto L5;
        Duration.Companion r1 = Duration.Companion;
        return Duration.m8775getInWholeMillisecondsimpl(Duration.m8793plusLRDsOJo($this$toDelayMillis_u2dLRDsOJo, DurationKt.toDuration(999999, DurationUnit.NANOSECONDS)));
    L5:
        if (r0 == true) goto L9;
        return 0;
    L9:
        throw new NoWhenBranchMatchedException();
    }
}
