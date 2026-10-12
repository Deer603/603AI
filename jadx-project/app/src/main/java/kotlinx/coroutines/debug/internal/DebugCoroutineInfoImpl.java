package kotlinx.coroutines.debug.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B#\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0002\b&J\b\u0010'\u001a\u00020\u000eH\u0016J)\u0010(\u001a\u00020)2\u0006\u0010 \u001a\u00020\u000e2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b.J\"\u0010/\u001a\u00020)*\b\u0012\u0004\u0012\u00020\u0015002\b\u0010*\u001a\u0004\u0018\u00010\fH\u0082P¢\u0006\u0002\u00101R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "", "context", "Lkotlin/coroutines/CoroutineContext;", "creationStackBottom", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "sequenceNumber", "", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/debug/internal/StackTraceFrame;J)V", "_context", "Ljava/lang/ref/WeakReference;", "_lastObservedFrame", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "_state", "", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCreationStackBottom$kotlinx_coroutines_core", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "creationStackTrace", "", "Ljava/lang/StackTraceElement;", "getCreationStackTrace", "()Ljava/util/List;", "value", "lastObservedFrame", "getLastObservedFrame$kotlinx_coroutines_core", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "setLastObservedFrame$kotlinx_coroutines_core", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "lastObservedThread", "Ljava/lang/Thread;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/String;", "unmatchedResume", "", "lastObservedStackTrace", "lastObservedStackTrace$kotlinx_coroutines_core", "toString", "updateState", "", "frame", "Lkotlin/coroutines/Continuation;", "shouldBeMatched", "", "updateState$kotlinx_coroutines_core", "yieldFrames", "Lkotlin/sequences/SequenceScope;", "(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DebugCoroutineInfoImpl {
    private final WeakReference<CoroutineContext> _context;
    public volatile WeakReference<CoroutineStackFrame> _lastObservedFrame;
    public volatile String _state;
    private final StackTraceFrame creationStackBottom;
    public volatile Thread lastObservedThread;
    public final long sequenceNumber;
    private int unmatchedResume;

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1, reason: invalid class name */
    /* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/lang/StackTraceElement;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super StackTraceElement>, Continuation<? super Unit>, Object> {
        final /* synthetic */ StackTraceFrame $bottom;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DebugCoroutineInfoImpl this$0;

        AnonymousClass1(DebugCoroutineInfoImpl r2, StackTraceFrame r3, Continuation<? super AnonymousClass1> r4) {
            this.this$0 = r2;
            this.$bottom = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, this.$bottom, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super StackTraceElement> r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(SequenceScope<? super StackTraceElement> r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L12:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            SequenceScope $this$sequence = (SequenceScope) this.L$0;
            this.label = 1;
            if (DebugCoroutineInfoImpl.access$yieldFrames(this.this$0, $this$sequence, this.$bottom.getCallerFrame(), this) != r0) goto L12;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0, 0}, l = {167}, m = "yieldFrames", n = {"this", "$this$yieldFrames", "frame"}, s = {"L$0", "L$1", "L$2"})
    static final class C07561 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DebugCoroutineInfoImpl this$0;

        C07561(DebugCoroutineInfoImpl r1, Continuation<? super C07561> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return DebugCoroutineInfoImpl.access$yieldFrames(this.this$0, null, null, this);
        }
    }

    public DebugCoroutineInfoImpl(CoroutineContext context, StackTraceFrame creationStackBottom, long sequenceNumber) {
        this.creationStackBottom = creationStackBottom;
        this.sequenceNumber = sequenceNumber;
        this._context = new WeakReference(context);
        this._state = DebugCoroutineInfoImplKt.CREATED;
    }

    public static final /* synthetic */ Object access$yieldFrames(DebugCoroutineInfoImpl $this, SequenceScope $receiver, CoroutineStackFrame frame, Continuation $completion) {
        return $this.yieldFrames($receiver, frame, $completion);
    }

    public final StackTraceFrame getCreationStackBottom$kotlinx_coroutines_core() {
        return this.creationStackBottom;
    }

    public final CoroutineContext getContext() {
        return this._context.get();
    }

    public final List<StackTraceElement> getCreationStackTrace() {
        return creationStackTrace();
    }

    public final String getState$kotlinx_coroutines_core() {
        return this._state;
    }

    public final synchronized void updateState$kotlinx_coroutines_core(String state, Continuation<?> r4, boolean shouldBeMatched) {
        monitor-enter(this);
    L35:
        th = move-exception;
        throw th;
    L4:
        if (Intrinsics.areEqual(this._state, DebugCoroutineInfoImplKt.RUNNING) == false) goto L10;
        if (Intrinsics.areEqual(state, DebugCoroutineInfoImplKt.RUNNING) == false) goto L10;
        if (shouldBeMatched == false) goto L10;
        this.unmatchedResume++;     // Catch: Throwable -> L35
    L17:
        if (Intrinsics.areEqual(this._state, state) == true) goto L19;
    L24:
        this._state = state;     // Catch: Throwable -> L35
        Thread r1 = null;
        if ((r4 instanceof CoroutineStackFrame) == false) goto L27;
        CoroutineStackFrame r0 = (CoroutineStackFrame) r4;     // Catch: Throwable -> L35
    L28:
        setLastObservedFrame$kotlinx_coroutines_core(r0);     // Catch: Throwable -> L35
        if (Intrinsics.areEqual(state, DebugCoroutineInfoImplKt.RUNNING) == false) goto L32;
        r1 = Thread.currentThread();     // Catch: Throwable -> L35
    L32:
        this.lastObservedThread = r1;     // Catch: Throwable -> L35
        monitor-exit(this);
        return;
    L27:
        r0 = null;
        goto L28
    L19:
        if (Intrinsics.areEqual(state, DebugCoroutineInfoImplKt.SUSPENDED) == false) goto L24;
        if (getLastObservedFrame$kotlinx_coroutines_core() == null) goto L24;
        monitor-exit(this);
        return;
    L10:
        if (this.unmatchedResume <= 0) goto L17;
        if (Intrinsics.areEqual(state, DebugCoroutineInfoImplKt.SUSPENDED) == false) goto L17;
        this.unmatchedResume--;     // Catch: Throwable -> L35
        monitor-exit(this);
    }

    public final CoroutineStackFrame getLastObservedFrame$kotlinx_coroutines_core() {
        WeakReference<CoroutineStackFrame> r0 = this._lastObservedFrame;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.get();
    }

    public final void setLastObservedFrame$kotlinx_coroutines_core(CoroutineStackFrame value) {
        if (value == null) goto L4;
        WeakReference<CoroutineStackFrame> r2 = new WeakReference(value);
    L5:
        this._lastObservedFrame = r2;
        return;
    L4:
        r2 = null;
        goto L5
    }

    public final List<StackTraceElement> lastObservedStackTrace$kotlinx_coroutines_core() {
        CoroutineStackFrame frame = getLastObservedFrame$kotlinx_coroutines_core();
        if (frame == null) goto L5;
        ArrayList result = new ArrayList();
    L7:
        if (frame == null) goto L13;
        StackTraceElement it = frame.getStackTraceElement();
        if (it == null) goto L11;
        result.add(it);
    L11:
        frame = frame.getCallerFrame();
        goto L7
    L13:
        return result;
    L5:
        return CollectionsKt.emptyList();
    }

    private final List<StackTraceElement> creationStackTrace() {
        StackTraceFrame bottom = this.creationStackBottom;
        if (bottom != null) goto L7;
        return CollectionsKt.emptyList();
    L7:
        return SequencesKt.toList(SequencesKt.sequence(new AnonymousClass1(this, bottom, null)));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004c -> B:24:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:24:0x0061). Please report as a decompilation issue!!! */
    private final Object yieldFrames(SequenceScope<? super StackTraceElement> r7, CoroutineStackFrame frame, Continuation<? super Unit> r9) {
        if ((r9 instanceof C07561) == false) goto L7;
        C07561 r0 = (C07561) r9;
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
        frame = (CoroutineStackFrame) r0.L$2;
        SequenceScope $this$yieldFrames = (SequenceScope) r0.L$1;
        DebugCoroutineInfoImpl r3 = (DebugCoroutineInfoImpl) r0.L$0;
        ResultKt.throwOnFailure($result);
    L24:
        CoroutineStackFrame caller = frame.getCallerFrame();
        if (caller == null) goto L28;
        frame = caller;
    L14:
        if (frame == null) goto L16;
        StackTraceElement it = frame.getStackTraceElement();
        if (it == null) goto L24;
        r0.L$0 = r3;
        r0.L$1 = $this$yieldFrames;
        r0.L$2 = frame;
        r0.label = 1;
        if ($this$yieldFrames.yield(it, r0) != r1) goto L24;
        return r1;
    L16:
        return Unit.INSTANCE;
    L28:
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        r3 = this;
        $this$yieldFrames = r7;
        goto L14
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07561(this, r9);
        goto L8
    }

    public String toString() {
        return "DebugCoroutineInfo(state=" + getState$kotlinx_coroutines_core() + ",context=" + getContext() + ')';
    }
}
