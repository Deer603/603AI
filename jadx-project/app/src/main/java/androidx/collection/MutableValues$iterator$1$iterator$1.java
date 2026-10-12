package androidx.collection;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableValues$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1696}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
final class MutableValues$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MutableValues<K, V> this$0;

    MutableValues$iterator$1$iterator$1(MutableValues<K, V> r2, Continuation<? super MutableValues$iterator$1$iterator$1> r3) {
        this.this$0 = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        MutableValues$iterator$1$iterator$1 r0 = new MutableValues$iterator$1$iterator$1(this.this$0, r4);
        r0.L$0 = r3;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super Integer> r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(SequenceScope<? super Integer> r3, Continuation<? super Unit> r4) {
        return ((MutableValues$iterator$1$iterator$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0063 -> B:13:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00aa -> B:22:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c4 -> B:27:0x00c8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        int $i$f$forEachIndexed = 0;
        int j$iv = this.I$3;
        int bitCount$iv = this.I$2;
        long slot$iv = this.J$0;
        int i$iv = this.I$1;
        int lastIndex$iv = this.I$0;
        long[] m$iv = (long[]) this.L$1;
        SequenceScope $this$iterator = (SequenceScope) this.L$0;
        ResultKt.throwOnFailure($result);
        MutableValues$iterator$1$iterator$1 r3 = this;
        int r16 = 8;
    L22:
        slot$iv = slot$iv >> r16;
        j$iv = j$iv + 1;
    L13:
        if (j$iv >= bitCount$iv) goto L24;
        long value$iv$iv = slot$iv & 255;
        if (value$iv$iv >= 128) goto L34;
        if (1 == 0) goto L22;
        int index = (i$iv << 3) + j$iv;
        Integer r15 = Boxing.boxInt(index);
        r3.L$0 = $this$iterator;
        r3.L$1 = m$iv;
        r3.I$0 = lastIndex$iv;
        r3.I$1 = i$iv;
        r3.J$0 = slot$iv;
        r3.I$2 = bitCount$iv;
        r3.I$3 = j$iv;
        r3.label = 1;
        if ($this$iterator.yield(r15, r3) != r1) goto L22;
        return r1;
    L34:
        if (0 == 0) goto L22;
        goto L22
    L24:
        if (bitCount$iv != r16) goto L33;
        MutableValues$iterator$1$iterator$1 r10 = r3;
        int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        int i$iv2 = i$iv;
        int bitCount$iv2 = lastIndex$iv;
        long[] m$iv2 = m$iv;
        SequenceScope $this$iterator2 = $this$iterator;
    L27:
        if (i$iv2 == bitCount$iv2) goto L33;
        i$iv2 = i$iv2 + 1;
    L10:
        long slot$iv2 = m$iv2[i$iv2];
        r16 = 8;
        if (((((~slot$iv2) << 7) & slot$iv2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L27;
        $this$iterator = $this$iterator2;
        m$iv = m$iv2;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        j$iv = 0;
        int r22 = bitCount$iv2;
        bitCount$iv = 8 - ((~(i$iv2 - bitCount$iv2)) >>> 31);
        r3 = r10;
        lastIndex$iv = r22;
        i$iv = i$iv2;
        slot$iv = slot$iv2;
    L33:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        $this$iterator2 = (SequenceScope) this.L$0;
        ScatterMap this_$iv = MutableValues.access$getParent$p(this.this$0);
        $i$f$forEachIndexed2 = 0;
        m$iv2 = this_$iv.metadata;
        bitCount$iv2 = m$iv2.length - 2;
        i$iv2 = 0;
        if (0 > bitCount$iv2) goto L33;
        r10 = this;
        goto L10
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
