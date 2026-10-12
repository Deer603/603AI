package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: MonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\b0\nH\u0086@¢\u0006\u0002\u0010\u000f\u001a7\u0010\u0010\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\b0\nH\u0086@¢\u0006\u0002\u0010\u000f\u001a=\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b*\u00020\u00012#\b\u0004\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\b0\nH\u0086H¢\u0006\u0002\u0010\u0012\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"monotonicFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/CoroutineContext;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "getMonotonicFrameClock", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/MonotonicFrameClock;", "withFrameMillis", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "frameTimeMillis", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withFrameNanos", "frameTimeNanos", "(Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MonotonicFrameClockKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2, reason: invalid class name */
    /* JADX INFO: compiled from: MonotonicFrameClock.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "R", "it", "", "invoke", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass2<R> extends Lambda implements Function1<Long, R> {
        final /* synthetic */ Function1<Long, R> $onFrame;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super Long, ? extends R> r2) {
            this.$onFrame = r2;
            super(1);
        }

        public final R invoke(long it) {
            return this.$onFrame.invoke(Long.valueOf(it / AnimationKt.MillisToNanos));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Long r3) {
            return invoke(r3.longValue());
        }
    }

    public static /* synthetic */ void getMonotonicFrameClock$annotations(CoroutineContext r0) {
    }

    public static final <R> Object withFrameMillis(MonotonicFrameClock $this$withFrameMillis, Function1<? super Long, ? extends R> r3, Continuation<? super R> r4) {
        return $this$withFrameMillis.withFrameNanos(new AnonymousClass2(r3), r4);
    }

    private static final <R> Object withFrameMillis$$forInline(MonotonicFrameClock $this$withFrameMillis, Function1<? super Long, ? extends R> r3, Continuation<? super R> r4) {
        return $this$withFrameMillis.withFrameNanos(new AnonymousClass2(r3), r4);
    }

    public static final <R> Object withFrameNanos(Function1<? super Long, ? extends R> r1, Continuation<? super R> r2) {
        return getMonotonicFrameClock(r2.getContext()).withFrameNanos(r1, r2);
    }

    public static final <R> Object withFrameMillis(Function1<? super Long, ? extends R> r3, Continuation<? super R> r4) {
        MonotonicFrameClock $this$withFrameMillis$iv = getMonotonicFrameClock(r4.getContext());
        return $this$withFrameMillis$iv.withFrameNanos(new AnonymousClass2(r3), r4);
    }

    public static final MonotonicFrameClock getMonotonicFrameClock(CoroutineContext $this$monotonicFrameClock) {
        MonotonicFrameClock r0 = (MonotonicFrameClock) $this$monotonicFrameClock.get(MonotonicFrameClock.Key);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }
}
