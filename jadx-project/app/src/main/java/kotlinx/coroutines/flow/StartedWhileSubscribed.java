package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0017J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/SharingStarted;", "stopTimeout", "", "replayExpiration", "(JJ)V", "command", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "equals", "", "other", "", "hashCode", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StartedWhileSubscribed implements SharingStarted {
    private final long replayExpiration;
    private final long stopTimeout;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", "count", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {174, 176, 178, 179, 181}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super SharingCommand>, Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ StartedWhileSubscribed this$0;

        AnonymousClass1(StartedWhileSubscribed r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r2;
            super(3, r3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super SharingCommand> r4, Integer r5, Continuation<? super Unit> r6) {
            return invoke(r4, r5.intValue(), r6);
        }

        public final Object invoke(FlowCollector<? super SharingCommand> r3, int r4, Continuation<? super Unit> r5) {
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, r5);
            r0.L$0 = r3;
            r0.I$0 = r4;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L11;
                case 1: goto L10;
                case 2: goto L9;
                case 3: goto L8;
                case 4: goto L7;
                case 5: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L36:
            return Unit.INSTANCE;
        L7:
            AnonymousClass1 r1 = this;
            FlowCollector $this$transformLatest = (FlowCollector) r1.L$0;
            ResultKt.throwOnFailure($result);
        L30:
            r1.L$0 = null;
            r1.label = 5;
            if ($this$transformLatest.emit(SharingCommand.STOP_AND_RESET_REPLAY_CACHE, r1) != r0) goto L36;
            return r0;
        L8:
            r1 = this;
            $this$transformLatest = (FlowCollector) r1.L$0;
            ResultKt.throwOnFailure($result);
        L26:
            r1.L$0 = $this$transformLatest;
            r1.label = 4;
            if (DelayKt.delay(StartedWhileSubscribed.access$getReplayExpiration$p(r1.this$0), r1) != r0) goto L30;
            return r0;
        L9:
            r1 = this;
            $this$transformLatest = (FlowCollector) r1.L$0;
            ResultKt.throwOnFailure($result);
        L22:
            if (StartedWhileSubscribed.access$getReplayExpiration$p(r1.this$0) <= 0) goto L30;
            r1.L$0 = $this$transformLatest;
            r1.label = 3;
            if ($this$transformLatest.emit(SharingCommand.STOP, r1) != r0) goto L26;
            return r0;
        L10:
            ResultKt.throwOnFailure($result);
            goto L36
        L11:
            ResultKt.throwOnFailure($result);
            r1 = this;
            $this$transformLatest = (FlowCollector) r1.L$0;
            int count = r1.I$0;
            if (count <= 0) goto L18;
            r1.label = 1;
            if ($this$transformLatest.emit(SharingCommand.START, r1) != r0) goto L36;
            return r0;
        L18:
            r1.L$0 = $this$transformLatest;
            r1.label = 2;
            if (DelayKt.delay(StartedWhileSubscribed.access$getStopTimeout$p(r1.this$0), r1) != r0) goto L22;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$2, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<SharingCommand, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> r2) {
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            AnonymousClass2 r0 = new AnonymousClass2(r3);
            r0.L$0 = r2;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SharingCommand r2, Continuation<? super Boolean> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(SharingCommand r3, Continuation<? super Boolean> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r4);
            SharingCommand it = (SharingCommand) this.L$0;
            if (it == SharingCommand.START) goto L9;
            boolean r2 = true;
        L11:
            return Boxing.boxBoolean(r2);
        L9:
            r2 = false;
            goto L11
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public StartedWhileSubscribed(long stopTimeout, long replayExpiration) {
        this.stopTimeout = stopTimeout;
        this.replayExpiration = replayExpiration;
        boolean r1 = true;
        if (this.stopTimeout < 0) goto L5;
        boolean r0 = true;
    L7:
        if (r0 == false) goto L17;
        if (this.replayExpiration >= 0) goto L12;
        r1 = false;
    L12:
        if (r1 == false) goto L15;
        return;
    L15:
        throw new IllegalArgumentException(("replayExpiration(" + this.replayExpiration + " ms) cannot be negative").toString());
    L17:
        throw new IllegalArgumentException(("stopTimeout(" + this.stopTimeout + " ms) cannot be negative").toString());
    L5:
        r0 = false;
        goto L7
    }

    public static final /* synthetic */ long access$getReplayExpiration$p(StartedWhileSubscribed $this) {
        return $this.replayExpiration;
    }

    public static final /* synthetic */ long access$getStopTimeout$p(StartedWhileSubscribed $this) {
        return $this.stopTimeout;
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow<SharingCommand> command(StateFlow<Integer> r4) {
        return FlowKt.distinctUntilChanged(FlowKt.dropWhile(FlowKt.transformLatest(r4, new AnonymousClass1(this, null)), new AnonymousClass2(null)));
    }

    public String toString() {
        List $this$toString_u24lambda_u242 = CollectionsKt.createListBuilder(2);
        if (this.stopTimeout <= 0) goto L6;
        $this$toString_u24lambda_u242.add("stopTimeout=" + this.stopTimeout + "ms");
    L6:
        if (this.replayExpiration >= Long.MAX_VALUE) goto L8;
        $this$toString_u24lambda_u242.add("replayExpiration=" + this.replayExpiration + "ms");
    L8:
        List params = CollectionsKt.build($this$toString_u24lambda_u242);
        return "SharingStarted.WhileSubscribed(" + CollectionsKt.joinToString$default(params, null, null, null, 0, null, null, 63, null) + ')';
    }

    public boolean equals(Object other) {
        if ((other instanceof StartedWhileSubscribed) == true) goto L5;
    L9:
        return false;
    L5:
        if (this.stopTimeout != ((StartedWhileSubscribed) other).stopTimeout) goto L9;
        if (this.replayExpiration != ((StartedWhileSubscribed) other).replayExpiration) goto L9;
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(this.stopTimeout) * 31) + Long.hashCode(this.replayExpiration);
    }
}
