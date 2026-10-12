package kotlinx.coroutines.stream;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Stream.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096@¢\u0006\u0002\u0010\fR\t\u0010\u0006\u001a\u00020\u0007X\u0082\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "stream", "Ljava/util/stream/Stream;", "(Ljava/util/stream/Stream;)V", "consumed", "Lkotlinx/atomicfu/AtomicBoolean;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StreamFlow<T> implements Flow<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater consumed$volatile$FU = null;
    private volatile /* synthetic */ int consumed$volatile;
    private final Stream<T> stream;

    /* JADX INFO: renamed from: kotlinx.coroutines.stream.StreamFlow$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: Stream.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {22}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StreamFlow<T> this$0;

        AnonymousClass1(StreamFlow<T> r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    static {
        consumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed$volatile");
    }

    private final /* synthetic */ int getConsumed$volatile() {
        return this.consumed$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater getConsumed$volatile$FU() {
        return consumed$volatile$FU;
    }

    private final /* synthetic */ void setConsumed$volatile(int r1) {
        this.consumed$volatile = r1;
    }

    public StreamFlow(Stream<T> r2) {
        this.stream = r2;
        this.consumed$volatile = 0;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> r9, Continuation<? super Unit> r10) {
        if ((r10 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L15;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Iterator<T> r11 = (Iterator) r0.L$2;
        FlowCollector collector = (FlowCollector) r0.L$1;
        StreamFlow<T> r4 = (StreamFlow) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L26
    L18:
        if (r11.hasNext() == false) goto L24;
        T r5 = r11.next();     // Catch: Throwable -> L26
        r0.L$0 = r4;     // Catch: Throwable -> L26
        r0.L$1 = collector;     // Catch: Throwable -> L26
        r0.L$2 = r11;     // Catch: Throwable -> L26
        r0.label = 1;     // Catch: Throwable -> L26
        if (collector.emit(r5, r0) != r1) goto L18;
        return r1;
    L24:
        r4.stream.close();
        return Unit.INSTANCE;
    L15:
        ResultKt.throwOnFailure($result);
        r4 = this;
        if (getConsumed$volatile$FU().compareAndSet(r4, 0, 1) == false) goto L30;
        collector = r9;
        r11 = r4.stream.iterator();     // Catch: Throwable -> L26
        goto L18
    L30:
        throw new IllegalStateException("Stream.consumeAsFlow can be collected only once".toString());
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L26:
        th = move-exception;
        r4.stream.close();
        throw th;
    L7:
        r0 = new AnonymousClass1(this, r10);
        goto L8
    }
}
