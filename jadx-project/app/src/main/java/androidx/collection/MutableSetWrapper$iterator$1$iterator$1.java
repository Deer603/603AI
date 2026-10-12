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
/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1188}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
final class MutableSetWrapper$iterator$1$iterator$1<E> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableSetWrapper<E> this$0;
    final /* synthetic */ MutableSetWrapper.AnonymousClass1 this$1;

    MutableSetWrapper$iterator$1$iterator$1(MutableSetWrapper<E> r2, MutableSetWrapper.AnonymousClass1 r3, Continuation<? super MutableSetWrapper$iterator$1$iterator$1> r4) {
        this.this$0 = r2;
        this.this$1 = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        MutableSetWrapper$iterator$1$iterator$1 r0 = new MutableSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, r5);
        r0.L$0 = r4;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
        return invoke((SequenceScope) r2, r3);
    }

    public final Object invoke(SequenceScope<? super E> r3, Continuation<? super Unit> r4) {
        return ((MutableSetWrapper$iterator$1$iterator$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0073 -> B:13:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00cd -> B:25:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d2 -> B:25:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ee -> B:30:0x00f4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r26) {
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        Object $result = r26;
        int $i$f$forEachIndex = 0;
        int j$iv = this.I$3;
        int bitCount$iv = this.I$2;
        long slot$iv = this.J$0;
        int i$iv = this.I$1;
        int lastIndex$iv = this.I$0;
        long[] m$iv = (long[]) this.L$3;
        MutableSetWrapper<E> r14 = (MutableSetWrapper) this.L$2;
        MutableSetWrapper.AnonymousClass1 r15 = (MutableSetWrapper.AnonymousClass1) this.L$1;
        int r16 = 8;
        SequenceScope $this$iterator = (SequenceScope) this.L$0;
        ResultKt.throwOnFailure($result);
        MutableSetWrapper$iterator$1$iterator$1<E> r4 = this;
    L25:
        slot$iv = slot$iv >> r16;
        j$iv = j$iv + 1;
    L13:
        if (j$iv >= bitCount$iv) goto L26;
        long value$iv$iv = slot$iv & 255;
        if (value$iv$iv >= 128) goto L17;
        boolean r17 = true;
    L18:
        if (r17 == false) goto L25;
        int index = (i$iv << 3) + j$iv;
        r15.setCurrent(index);
        Object r0 = MutableSetWrapper.access$getParent$p(r14).elements[index];
        r4.L$0 = $this$iterator;
        r4.L$1 = r15;
        r4.L$2 = r14;
        r4.L$3 = m$iv;
        r4.I$0 = lastIndex$iv;
        r4.I$1 = i$iv;
        r4.J$0 = slot$iv;
        r4.I$2 = bitCount$iv;
        r4.I$3 = j$iv;
        Object $result2 = $result;
        r4.label = 1;
        if ($this$iterator.yield(r0, r4) != r1) goto L22;
        return r1;
    L22:
        $result = $result2;
        goto L25
    L17:
        r17 = false;
        goto L18
    L26:
        int r2 = r16;
        if (bitCount$iv != r2) goto L36;
        int bitCount$iv2 = $i$f$forEachIndex;
        int i$iv2 = i$iv;
        int lastIndex$iv2 = lastIndex$iv;
        long[] m$iv2 = m$iv;
        MutableSetWrapper<E> r7 = r14;
        MutableSetWrapper.AnonymousClass1 r6 = r15;
        MutableSetWrapper$iterator$1$iterator$1<E> r11 = r4;
    L30:
        if (i$iv2 == lastIndex$iv2) goto L36;
        i$iv2 = i$iv2 + 1;
        r16 = r2;
    L10:
        long slot$iv2 = m$iv2[i$iv2];
        long[] m$iv3 = m$iv2;
        if (((((~slot$iv2) << 7) & slot$iv2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L29;
        int bitCount$iv3 = 8 - ((~(i$iv2 - lastIndex$iv2)) >>> 31);
        r15 = r6;
        r14 = r7;
        j$iv = 0;
        $i$f$forEachIndex = bitCount$iv2;
        bitCount$iv = bitCount$iv3;
        r4 = r11;
        i$iv = i$iv2;
        m$iv = m$iv3;
        lastIndex$iv = lastIndex$iv2;
        slot$iv = slot$iv2;
        goto L13
    L29:
        r2 = r16;
        m$iv2 = m$iv3;
    L36:
        return Unit.INSTANCE;
    L7:
        r16 = 8;
        ResultKt.throwOnFailure(r26);
        $result = r26;
        $this$iterator = (SequenceScope) this.L$0;
        ScatterSet this_$iv = MutableSetWrapper.access$getParent$p(this.this$0);
        r6 = this.this$1;
        r7 = this.this$0;
        bitCount$iv2 = 0;
        m$iv2 = this_$iv.metadata;
        lastIndex$iv2 = m$iv2.length - 2;
        i$iv2 = 0;
        if (0 > lastIndex$iv2) goto L36;
        r11 = this;
        goto L10
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
