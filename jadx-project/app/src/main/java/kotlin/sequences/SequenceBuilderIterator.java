package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\r\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\"H\u0016¢\u0006\u0002\u0010#R\u0012\u0010\b\u001a\u00060\tj\u0002`\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", "T", "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "<init>", "()V", "state", "", "Lkotlin/sequences/State;", "nextValue", "Ljava/lang/Object;", "nextIterator", "nextStep", "getNextStep", "()Lkotlin/coroutines/Continuation;", "setNextStep", "(Lkotlin/coroutines/Continuation;)V", "hasNext", "", "next", "()Ljava/lang/Object;", "nextNotReady", "exceptionalState", "", "yield", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "iterator", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class SequenceBuilderIterator<T> extends SequenceScope<T> implements Iterator<T>, Continuation<Unit>, KMappedMarker {
    private Iterator<? extends T> nextIterator;
    private Continuation<? super Unit> nextStep;
    private T nextValue;
    private int state;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public SequenceBuilderIterator() {
    }

    public final Continuation<Unit> getNextStep() {
        return this.nextStep;
    }

    public final void setNextStep(Continuation<? super Unit> r1) {
        this.nextStep = r1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
    L3:
        switch(this.state) {
            case 0: goto L14;
            case 1: goto L9;
            case 2: goto L8;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L5;
        };
    L9:
        Iterator<? extends T> r0 = this.nextIterator;
        Intrinsics.checkNotNull(r0);
        if (r0.hasNext() == true) goto L11;
        this.nextIterator = null;
        goto L14
    L11:
        this.state = 2;
        return true;
    L5:
        throw exceptionalState();
    L6:
        return false;
    L8:
        return true;
    L14:
        this.state = 5;
        Continuation<? super Unit> r1 = this.nextStep;
        Intrinsics.checkNotNull(r1);
        this.nextStep = null;
        Unit r2 = Unit.INSTANCE;
        Result.Companion r3 = Result.Companion;
        r1.resumeWith(Result.m7425constructorimpl(r2));
        goto L3
    }

    @Override // java.util.Iterator
    public T next() {
        switch(this.state) {
            case 0: goto L11;
            case 1: goto L11;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        this.state = 0;
        T r0 = this.nextValue;
        this.nextValue = null;
        return r0;
    L8:
        this.state = 1;
        Iterator<? extends T> r1 = this.nextIterator;
        Intrinsics.checkNotNull(r1);
        return r1.next();
    L5:
        throw exceptionalState();
    L11:
        return nextNotReady();
    }

    private final T nextNotReady() {
        if (hasNext() == false) goto L7;
        return next();
    L7:
        throw new NoSuchElementException();
    }

    private final Throwable exceptionalState() {
        switch(this.state) {
            case 4: goto L7;
            case 5: goto L9;
            default: goto L8;
        };
    L8:
        return new IllegalStateException("Unexpected state of the iterator: " + this.state);
    L9:
        return new IllegalStateException("Iterator has failed.");
    L7:
        return new NoSuchElementException();
    }

    @Override // kotlin.sequences.SequenceScope
    public Object yield(T r3, Continuation<? super Unit> r4) {
        this.nextValue = r3;
        this.state = 3;
        this.nextStep = r4;
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        DebugProbesKt.probeCoroutineSuspended(r4);
    L6:
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L9;
        return r0;
    L9:
        return Unit.INSTANCE;
    }

    @Override // kotlin.sequences.SequenceScope
    public Object yieldAll(Iterator<? extends T> r3, Continuation<? super Unit> r4) {
        if (r3.hasNext() == false) goto L5;
        this.nextIterator = r3;
        this.state = 2;
        this.nextStep = r4;
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        DebugProbesKt.probeCoroutineSuspended(r4);
    L10:
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L13;
        return r0;
    L13:
        return Unit.INSTANCE;
    L5:
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        ResultKt.throwOnFailure(result);
        this.state = 4;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
}
