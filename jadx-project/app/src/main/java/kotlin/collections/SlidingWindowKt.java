package kotlin.collections;

import androidx.core.view.MotionEventCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aD\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001aH\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\r\"\u0004\b\u0000\u0010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000¨\u0006\u000f"}, d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedSequence", "Lkotlin/sequences/Sequence;", "", "T", "partialWindows", "", "reuseBuffer", "windowedIterator", "", "iterator", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class SlidingWindowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.SlidingWindowKt$windowedIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SlidingWindow.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, l = {MotionEventCompat.AXIS_GENERIC_3, MotionEventCompat.AXIS_GENERIC_9, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "e", "bufferInitialCapacity", "gap", "skip", "$this$iterator", "buffer", "bufferInitialCapacity", "gap", "skip", "$this$iterator", "buffer", "e", "bufferInitialCapacity", "gap", "$this$iterator", "buffer", "bufferInitialCapacity", "gap", "$this$iterator", "buffer", "bufferInitialCapacity", "gap"}, s = {"L$0", "L$1", "L$3", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "L$3", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
    static final class AnonymousClass1<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Iterator<T> $iterator;
        final /* synthetic */ boolean $partialWindows;
        final /* synthetic */ boolean $reuseBuffer;
        final /* synthetic */ int $size;
        final /* synthetic */ int $step;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(int r2, int r3, Iterator<? extends T> r4, boolean r5, boolean r6, Continuation<? super AnonymousClass1> r7) {
            this.$size = r2;
            this.$step = r3;
            this.$iterator = r4;
            this.$reuseBuffer = r5;
            this.$partialWindows = r6;
            super(2, r7);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
            AnonymousClass1 r0 = new AnonymousClass1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, r9);
            r0.L$0 = r8;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((SequenceScope) r2, r3);
        }

        public final Object invoke(SequenceScope<? super List<? extends T>> r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ca -> B:25:0x00d0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x017f -> B:56:0x0182). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01bf -> B:69:0x01c2). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            SequenceScope r0 = (SequenceScope) this.L$0;
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
            int gap = this.I$1;
            int bufferInitialCapacity = this.I$0;
            RingBuffer r3 = (RingBuffer) this.L$1;
            ResultKt.throwOnFailure($result);
        L80:
            return Unit.INSTANCE;
        L7:
            int bufferInitialCapacity2 = this.I$1;
            int bufferInitialCapacity3 = this.I$0;
            RingBuffer buffer = (RingBuffer) this.L$1;
            ResultKt.throwOnFailure($result);
            Object r2 = r1;
            gap = bufferInitialCapacity2;
            AnonymousClass1<T> r8 = this;
            RingBuffer buffer2 = buffer;
        L69:
            buffer2.removeFirst(r8.$step);
        L61:
            if (buffer2.size() <= r8.$step) goto L71;
            if (r8.$reuseBuffer == false) goto L65;
            List r5 = buffer2;
        L66:
            r8.L$0 = r0;
            r8.L$1 = buffer2;
            r8.L$2 = null;
            r8.L$3 = null;
            r8.I$0 = bufferInitialCapacity3;
            r8.I$1 = gap;
            r8.label = 4;
            if (r0.yield(r5, r8) != r2) goto L69;
            return r2;
        L65:
            r5 = new ArrayList(buffer2);
            goto L66
        L71:
            if (buffer2.isEmpty() == true) goto L80;
            r8.L$0 = SpillingKt.nullOutSpilledVariable(r0);
            r8.L$1 = SpillingKt.nullOutSpilledVariable(buffer2);
            r8.L$2 = null;
            r8.L$3 = null;
            r8.I$0 = bufferInitialCapacity3;
            r8.I$1 = gap;
            r8.label = 5;
            if (r0.yield(buffer2, r8) != r2) goto L75;
            return r2;
        L75:
            bufferInitialCapacity = bufferInitialCapacity3;
            goto L80
        L8:
            int gap2 = this.I$1;
            bufferInitialCapacity3 = this.I$0;
            Object r6 = this.L$3;
            Iterator<T> r7 = (Iterator) this.L$2;
            buffer2 = (RingBuffer) this.L$1;
            ResultKt.throwOnFailure($result);
            r8 = this;
        L56:
            buffer2.removeFirst(r8.$step);
        L43:
            if (r7.hasNext() == false) goto L58;
            T r9 = r7.next();
            buffer2.add(r9);
            if (buffer2.isFull() == false) goto L43;
            if (buffer2.size() >= r8.$size) goto L50;
            buffer2 = buffer2.expanded(r8.$size);
            goto L43
        L50:
            if (r8.$reuseBuffer == false) goto L52;
            List r10 = buffer2;
        L53:
            r8.L$0 = r0;
            r8.L$1 = buffer2;
            r8.L$2 = r7;
            r8.L$3 = SpillingKt.nullOutSpilledVariable(r9);
            r8.I$0 = bufferInitialCapacity3;
            r8.I$1 = gap2;
            r8.label = 3;
            if (r0.yield(r10, r8) != r1) goto L56;
            return r1;
        L52:
            r10 = new ArrayList(buffer2);
            goto L53
        L58:
            if (r8.$partialWindows == false) goto L80;
            int r12 = gap2;
            r2 = r1;
            gap = r12;
            goto L61
        L9:
            int r4 = this.I$2;
            int gap3 = this.I$1;
            int bufferInitialCapacity4 = this.I$0;
            ArrayList r11 = (ArrayList) this.L$1;
            ResultKt.throwOnFailure($result);
            goto L80
        L10:
            int gap4 = this.I$2;
            int gap5 = this.I$1;
            int bufferInitialCapacity5 = this.I$0;
            Object r13 = this.L$3;
            Iterator<T> r14 = (Iterator) this.L$2;
            ArrayList buffer3 = (ArrayList) this.L$1;
            ResultKt.throwOnFailure($result);
            ArrayList buffer4 = buffer3;
            AnonymousClass1<T> r15 = this;
        L26:
            if (r15.$reuseBuffer == false) goto L28;
            buffer4.clear();
        L29:
            int skip = gap5;
            Object r16 = r1;
            int skip2 = skip;
            ArrayList buffer5 = buffer4;
        L15:
            if (r14.hasNext() == false) goto L31;
            T r17 = r14.next();
            if (skip2 > 0) goto L18;
            buffer5.add(r17);
            if (buffer5.size() != r15.$size) goto L15;
            r15.L$0 = r0;
            r15.L$1 = buffer5;
            r15.L$2 = r14;
            r15.L$3 = SpillingKt.nullOutSpilledVariable(r17);
            r15.I$0 = bufferInitialCapacity5;
            r15.I$1 = gap5;
            r15.I$2 = skip2;
            r15.label = 1;
            if (r0.yield(buffer5, r15) != r16) goto L24;
            return r16;
        L24:
            r1 = r16;
            buffer4 = buffer5;
            goto L26
        L18:
            skip2 = skip2 - 1;
            goto L15
        L31:
            if (buffer5.isEmpty() == true) goto L80;
            if (r15.$partialWindows == false) goto L35;
        L36:
            r15.L$0 = SpillingKt.nullOutSpilledVariable(r0);
            r15.L$1 = SpillingKt.nullOutSpilledVariable(buffer5);
            r15.L$2 = null;
            r15.L$3 = null;
            r15.I$0 = bufferInitialCapacity5;
            r15.I$1 = gap5;
            r15.I$2 = skip2;
            r15.label = 2;
            if (r0.yield(buffer5, r15) != r16) goto L39;
            return r16;
        L39:
            gap3 = gap5;
            bufferInitialCapacity4 = bufferInitialCapacity5;
            goto L80
        L35:
            if (buffer5.size() != r15.$size) goto L80;
        L28:
            buffer4 = new ArrayList(r15.$size);
            goto L29
        L11:
            ResultKt.throwOnFailure($result);
            int bufferInitialCapacity6 = RangesKt.coerceAtMost(this.$size, 1024);
            gap5 = this.$step - this.$size;
            if (gap5 < 0) goto L41;
            ArrayList buffer6 = new ArrayList(bufferInitialCapacity6);
            r14 = this.$iterator;
            r16 = r1;
            skip2 = 0;
            buffer5 = buffer6;
            bufferInitialCapacity5 = bufferInitialCapacity6;
            r15 = this;
            goto L15
        L41:
            RingBuffer buffer7 = new RingBuffer(bufferInitialCapacity6);
            r7 = this.$iterator;
            bufferInitialCapacity3 = bufferInitialCapacity6;
            gap2 = gap5;
            r8 = this;
            buffer2 = buffer7;
            goto L43
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void checkWindowSizeStep(int size, int step) {
        if (size <= 0) goto L5;
        if (step <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        return;
    L8:
        if (size == step) goto L10;
        String r1 = "Both size " + size + " and step " + step + " must be greater than zero.";
    L12:
        throw new IllegalArgumentException(r1.toString());
    L10:
        r1 = "size " + size + " must be greater than zero.";
    L5:
        r0 = false;
        goto L6
    }

    public static final <T> Sequence<List<T>> windowedSequence(final Sequence<? extends T> r7, final int r8, final int r9, final boolean r10, final boolean r11) {
        Intrinsics.checkNotNullParameter(r7, "<this>");
        checkWindowSizeStep(r8, r9);
        return new SlidingWindowKt$windowedSequence$$inlined$Sequence$1(r7, r8, r9, r10, r11);
    }

    public static final <T> Iterator<List<T>> windowedIterator(Iterator<? extends T> r8, int size, int step, boolean partialWindows, boolean reuseBuffer) {
        Intrinsics.checkNotNullParameter(r8, "iterator");
        if (r8.hasNext() == true) goto L7;
        return EmptyIterator.INSTANCE;
    L7:
        return SequencesKt.iterator(new AnonymousClass1(size, step, r8, reuseBuffer, partialWindows, null));
    }
}
