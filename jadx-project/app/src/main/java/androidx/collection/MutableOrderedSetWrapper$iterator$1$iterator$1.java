package androidx.collection;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: OrderedScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", i = {0, 0, 0}, l = {1489}, m = "invokeSuspend", n = {"$this$iterator", "nodes$iv", "previousNode$iv"}, s = {"L$0", "L$3", "I$0"})
final class MutableOrderedSetWrapper$iterator$1$iterator$1<E> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableOrderedSetWrapper<E> this$0;
    final /* synthetic */ MutableOrderedSetWrapper.AnonymousClass1 this$1;

    MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper<E> r2, MutableOrderedSetWrapper.AnonymousClass1 r3, Continuation<? super MutableOrderedSetWrapper$iterator$1$iterator$1> r4) {
        this.this$0 = r2;
        this.this$1 = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 r0 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, r5);
        r0.L$0 = r4;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
        return invoke((SequenceScope) r2, r3);
    }

    public final Object invoke(SequenceScope<? super E> r3, Continuation<? super Unit> r4) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0085 -> B:14:0x008d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        int previousNode$iv = this.I$0;
        long[] nodes$iv = (long[]) this.L$3;
        MutableOrderedSetWrapper<E> r7 = (MutableOrderedSetWrapper) this.L$2;
        MutableOrderedSetWrapper.AnonymousClass1 r8 = (MutableOrderedSetWrapper.AnonymousClass1) this.L$1;
        SequenceScope $this$iterator = (SequenceScope) this.L$0;
        ResultKt.throwOnFailure($result);
        MutableOrderedSetWrapper.AnonymousClass1 r10 = r8;
        MutableOrderedSetWrapper<E> r9 = r7;
        long[] nodes$iv2 = nodes$iv;
        MutableOrderedSetWrapper$iterator$1$iterator$1<E> r6 = this;
    L14:
        SequenceScope $this$iterator2 = $this$iterator;
        int candidate$iv = previousNode$iv;
        MutableOrderedSetWrapper$iterator$1$iterator$1<E> r5 = r6;
        long[] nodes$iv3 = nodes$iv2;
        MutableOrderedSetWrapper<E> r11 = r9;
        MutableOrderedSetWrapper.AnonymousClass1 r12 = r10;
    L9:
        if (candidate$iv == Integer.MAX_VALUE) goto L16;
        long $this$previousNode$iv$iv = nodes$iv3[candidate$iv];
        int previousNode$iv2 = (int) (($this$previousNode$iv$iv >> 31) & SieveCacheKt.NodeLinkMask);
        r12.setCurrent(candidate$iv);
        Object r13 = MutableOrderedSetWrapper.access$getParent$p(r11).elements[candidate$iv];
        r5.L$0 = $this$iterator2;
        r5.L$1 = r12;
        r5.L$2 = r11;
        r5.L$3 = nodes$iv3;
        r5.I$0 = previousNode$iv2;
        r5.label = 1;
        if ($this$iterator2.yield(r13, r5) != r1) goto L13;
        return r1;
    L13:
        long[] r14 = nodes$iv3;
        r6 = r5;
        previousNode$iv = previousNode$iv2;
        r10 = r12;
        r9 = r11;
        nodes$iv2 = r14;
        $this$iterator = $this$iterator2;
        goto L14
    L16:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        SequenceScope $this$iterator3 = (SequenceScope) this.L$0;
        OrderedScatterSet this_$iv = MutableOrderedSetWrapper.access$getParent$p(this.this$0);
        MutableOrderedSetWrapper.AnonymousClass1 r15 = this.this$1;
        MutableOrderedSetWrapper<E> r16 = this.this$0;
        long[] nodes$iv4 = this_$iv.nodes;
        candidate$iv = this_$iv.tail;
        $this$iterator2 = $this$iterator3;
        r11 = r16;
        nodes$iv3 = nodes$iv4;
        r12 = r15;
        r5 = this;
        goto L9
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
