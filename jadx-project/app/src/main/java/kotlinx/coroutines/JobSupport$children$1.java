package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceScope;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/Job;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {963, 965}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
final class JobSupport$children$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Job>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ JobSupport this$0;

    JobSupport$children$1(JobSupport r2, Continuation<? super JobSupport$children$1> r3) {
        this.this$0 = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        JobSupport$children$1 r0 = new JobSupport$children$1(this.this$0, r4);
        r0.L$0 = r3;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super Job> r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(SequenceScope<? super Job> r3, Continuation<? super Unit> r4) {
        return ((JobSupport$children$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007c -> B:29:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:29:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L8;
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        JobSupport$children$1 r1 = this;
        LockFreeLinkedListNode cur$iv = (LockFreeLinkedListNode) r1.L$2;
        LockFreeLinkedListHead this_$iv = (LockFreeLinkedListHead) r1.L$1;
        SequenceScope $this$sequence = (SequenceScope) r1.L$0;
        ResultKt.throwOnFailure($result);
    L29:
        cur$iv = cur$iv.getNextNode();
    L21:
        if (Intrinsics.areEqual(cur$iv, this_$iv) == true) goto L32;
        if ((cur$iv instanceof ChildHandleNode) == false) goto L29;
        ChildHandleNode it = (ChildHandleNode) cur$iv;
        ChildJob r9 = it.childJob;
        r1.L$0 = $this$sequence;
        r1.L$1 = this_$iv;
        r1.L$2 = cur$iv;
        r1.label = 2;
        if ($this$sequence.yield(r9, r1) != r0) goto L29;
        return r0;
    L32:
        return Unit.INSTANCE;
    L7:
        JobSupport$children$1 r2 = this;
        ResultKt.throwOnFailure($result);
        goto L32
    L8:
        ResultKt.throwOnFailure($result);
        r1 = this;
        SequenceScope $this$sequence2 = (SequenceScope) r1.L$0;
        Object state = r1.this$0.getState$kotlinx_coroutines_core();
        if ((state instanceof ChildHandleNode) == false) goto L16;
        r1.label = 1;
        if ($this$sequence2.yield(((ChildHandleNode) state).childJob, r1) != r0) goto L13;
        return r0;
    L13:
        r2 = r1;
        goto L32
    L16:
        if ((state instanceof Incomplete) == false) goto L32;
        LockFreeLinkedListHead state2 = ((Incomplete) state).getList();
        if (state2 == null) goto L32;
        LockFreeLinkedListHead this_$iv2 = state2;
        Object r6 = this_$iv2.getNext();
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        LockFreeLinkedListNode r7 = (LockFreeLinkedListNode) r6;
        this_$iv = this_$iv2;
        cur$iv = r7;
        $this$sequence = $this$sequence2;
        goto L21
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
