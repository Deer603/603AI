package kotlin.sequences;

import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\t\"\u0002H\u0002¢\u0006\u0002\u0010\n\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000b\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\f\u001a\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a!\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u001a2\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a)\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00120\u0001H\u0007¢\u0006\u0002\b\u0013\u001aC\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00050\u0015H\u0002¢\u0006\u0002\b\u0016\u001a@\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00190\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0014*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00140\u00180\u0001\u001a\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a&\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0007\u001ab\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u001e\"\u0004\b\u0002\u0010\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u001e0!2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00050\u0015H\u0000\u001a\u001c\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020%2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a=\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020%2\b\u0010'\u001a\u0004\u0018\u0001H\u00022\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0015H\u0007¢\u0006\u0002\u0010(\u001a<\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020%2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006*"}, d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "asSequence", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "element", "(Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "emptySequence", "orEmpty", "ifEmpty", "defaultValue", "flatten", "", "flattenSequenceOfIterable", "R", "Lkotlin/Function1;", "flatten$SequencesKt__SequencesKt", "unzip", "Lkotlin/Pair;", "", "shuffled", "random", "Lkotlin/random/Random;", "flatMapIndexed", "C", "source", "transform", "Lkotlin/Function2;", "", "constrainOnce", "generateSequence", "", "nextFunction", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "seedFunction", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "R", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0, 0, 0}, l = {383}, m = "invokeSuspend", n = {"$this$sequence", "element", "result", "index"}, s = {"L$0", "L$2", "L$3", "I$0"})
    static final class C07011<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<C, Iterator<R>> $iterator;
        final /* synthetic */ Sequence<T> $source;
        final /* synthetic */ Function2<Integer, T, C> $transform;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07011(Sequence<? extends T> r2, Function2<? super Integer, ? super T, ? extends C> r3, Function1<? super C, ? extends Iterator<? extends R>> r4, Continuation<? super C07011> r5) {
            this.$source = r2;
            this.$transform = r3;
            this.$iterator = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            C07011 r0 = new C07011(this.$source, this.$transform, this.$iterator, r6);
            r0.L$0 = r5;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((SequenceScope) r2, r3);
        }

        public final Object invoke(SequenceScope<? super R> r3, Continuation<? super Unit> r4) {
            return ((C07011) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:17:0x0079). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r11) {
            SequenceScope r0 = (SequenceScope) this.L$0;
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            int r2 = this.I$0;
            Object r3 = this.L$3;
            Object r4 = this.L$2;
            Iterator r5 = (Iterator) this.L$1;
            ResultKt.throwOnFailure(r11);
            Iterator r6 = r5;
            C07011<R> r7 = this;
        L17:
            C07011<R> r8 = r7;
            Iterator r9 = r6;
        L9:
            if (r9.hasNext() == false) goto L19;
            Object r10 = r9.next();
            Function2<Integer, T, C> r12 = r8.$transform;
            int r13 = r2 + 1;
            if (r2 >= 0) goto L13;
            CollectionsKt.throwIndexOverflow();
        L13:
            Object r14 = r12.invoke(Boxing.boxInt(r2), (T) r10);
            r8.L$0 = r0;
            r8.L$1 = r9;
            r8.L$2 = SpillingKt.nullOutSpilledVariable(r10);
            r8.L$3 = SpillingKt.nullOutSpilledVariable(r14);
            r8.I$0 = r13;
            r8.label = 1;
            if (r0.yieldAll(r8.$iterator.invoke((C) r14), r8) != r1) goto L16;
            return r1;
        L16:
            r6 = r9;
            r7 = r8;
            r2 = r13;
            goto L17
        L19:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure(r11);
            r2 = 0;
            r9 = this.$source.iterator();
            r8 = this;
            goto L9
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {0, 0, 1, 1}, l = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, LocationRequestCompat.QUALITY_LOW_POWER}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "$this$sequence", "iterator"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C07021<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Sequence<T>> $defaultValue;
        final /* synthetic */ Sequence<T> $this_ifEmpty;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07021(Sequence<? extends T> r2, Function0<? extends Sequence<? extends T>> r3, Continuation<? super C07021> r4) {
            this.$this_ifEmpty = r2;
            this.$defaultValue = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07021 r0 = new C07021(this.$this_ifEmpty, this.$defaultValue, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((SequenceScope) r2, r3);
        }

        public final Object invoke(SequenceScope<? super T> r3, Continuation<? super Unit> r4) {
            return ((C07021) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r7) {
            SequenceScope r0 = (SequenceScope) this.L$0;
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            Iterator r2 = (Iterator) this.L$1;
            ResultKt.throwOnFailure(r7);
        L21:
            return Unit.INSTANCE;
        L7:
            Iterator r3 = (Iterator) this.L$1;
            ResultKt.throwOnFailure(r7);
            goto L21
        L8:
            ResultKt.throwOnFailure(r7);
            Iterator<? extends T> r4 = this.$this_ifEmpty.iterator();
            if (r4.hasNext() == false) goto L15;
            this.L$0 = SpillingKt.nullOutSpilledVariable(r0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(r4);
            this.label = 1;
            if (r0.yieldAll(r4, this) != r1) goto L21;
            return r1;
        L15:
            this.L$0 = SpillingKt.nullOutSpilledVariable(r0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(r4);
            this.label = 2;
            if (r0.yieldAll(this.$defaultValue.invoke(), this) != r1) goto L21;
            return r1;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$shuffled$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0, 0, 0, 0}, l = {178}, m = "invokeSuspend", n = {"$this$sequence", "buffer", "last", "value", "j"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
    static final class C07031<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Random $random;
        final /* synthetic */ Sequence<T> $this_shuffled;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07031(Sequence<? extends T> r2, Random r3, Continuation<? super C07031> r4) {
            this.$this_shuffled = r2;
            this.$random = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07031 r0 = new C07031(this.$this_shuffled, this.$random, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((SequenceScope) r2, r3);
        }

        public final Object invoke(SequenceScope<? super T> r3, Continuation<? super Unit> r4) {
            return ((C07031) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:18:0x0075). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            SequenceScope r0 = (SequenceScope) this.L$0;
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            int r2 = this.I$0;
            Object r3 = this.L$3;
            Object r4 = this.L$2;
            List buffer = (List) this.L$1;
            ResultKt.throwOnFailure($result);
            C07031<T> r5 = this;
        L18:
            C07031<T> r6 = r5;
        L9:
            if (buffer.isEmpty() == true) goto L20;
            int j = r6.$random.nextInt(buffer.size());
            Object last = CollectionsKt.removeLast(buffer);
            if (j >= buffer.size()) goto L13;
            Object value = buffer.set(j, last);
        L14:
            r6.L$0 = r0;
            r6.L$1 = buffer;
            r6.L$2 = SpillingKt.nullOutSpilledVariable(last);
            r6.L$3 = SpillingKt.nullOutSpilledVariable(value);
            r6.I$0 = j;
            r6.label = 1;
            if (r0.yield(value, r6) != r1) goto L17;
            return r1;
        L17:
            r5 = r6;
            goto L18
        L13:
            value = last;
            goto L14
        L20:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            buffer = SequencesKt.toMutableList(this.$this_shuffled);
            r6 = this;
            goto L9
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$ZYYDtTr-TNi199dwYKp-UFChQ3A, reason: not valid java name */
    public static /* synthetic */ Object m8701$r8$lambda$ZYYDtTrTNi199dwYKpUFChQ3A(Object r0) {
        return flatten$lambda$4$SequencesKt__SequencesKt(r0);
    }

    /* JADX INFO: renamed from: $r8$lambda$gsNk3IlLxIkg3S0p5D-eswlyP2I, reason: not valid java name */
    public static /* synthetic */ Object m8702$r8$lambda$gsNk3IlLxIkg3S0p5DeswlyP2I(Object r0) {
        return generateSequence$lambda$6$SequencesKt__SequencesKt(r0);
    }

    /* JADX INFO: renamed from: $r8$lambda$hgw4Q_3eFL-A68Db_jKdsWYueJs, reason: not valid java name */
    public static /* synthetic */ Object m8703$r8$lambda$hgw4Q_3eFLA68Db_jKdsWYueJs(Function0 r0, Object r1) {
        return generateSequence$lambda$5$SequencesKt__SequencesKt(r0, r1);
    }

    public static /* synthetic */ Iterator $r8$lambda$npkZ5B6xt9ItzV16xBh3sZ6Q6Uo(Iterable r0) {
        return flatten$lambda$3$SequencesKt__SequencesKt(r0);
    }

    public static /* synthetic */ Iterator $r8$lambda$q9yeNhsLElZymTg2z31PJZp_xO8(Sequence r0) {
        return flatten$lambda$2$SequencesKt__SequencesKt(r0);
    }

    public SequencesKt__SequencesKt() {
    }

    private static final <T> Sequence<T> Sequence(final Function0<? extends Iterator<? extends T>> r1) {
        Intrinsics.checkNotNullParameter(r1, "iterator");
        return new AnonymousClass1(r1);
    }

    public static final <T> Sequence<T> asSequence(final Iterator<? extends T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return SequencesKt.constrainOnce(new SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1(r1));
    }

    public static final <T> Sequence<T> sequenceOf(T... r1) {
        Intrinsics.checkNotNullParameter(r1, "elements");
        return ArraysKt.asSequence(r1);
    }

    public static final <T> Sequence<T> sequenceOf(final T r1) {
        return new SequencesKt__SequencesKt$sequenceOf$$inlined$Sequence$1(r1);
    }

    private static final <T> Sequence<T> sequenceOf() {
        return SequencesKt.emptySequence();
    }

    public static final <T> Sequence<T> emptySequence() {
        return EmptySequence.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Sequence<T> orEmpty(Sequence<? extends T> r1) {
        if (r1 != 0) goto L5;
        return SequencesKt.emptySequence();
    L5:
        return r1;
    }

    public static final <T> Sequence<T> ifEmpty(Sequence<? extends T> r2, Function0<? extends Sequence<? extends T>> r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "defaultValue");
        return SequencesKt.sequence(new C07021(r2, r3, null));
    }

    public static final <T> Sequence<T> flatten(Sequence<? extends Sequence<? extends T>> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return flatten$SequencesKt__SequencesKt(r1, new SequencesKt__SequencesKt$$ExternalSyntheticLambda2());
    }

    private static final Iterator flatten$lambda$2$SequencesKt__SequencesKt(Sequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }

    private static final Iterator flatten$lambda$3$SequencesKt__SequencesKt(Iterable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }

    public static final <T> Sequence<T> flattenSequenceOfIterable(Sequence<? extends Iterable<? extends T>> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return flatten$SequencesKt__SequencesKt(r1, new SequencesKt__SequencesKt$$ExternalSyntheticLambda3());
    }

    private static final <T, R> Sequence<R> flatten$SequencesKt__SequencesKt(Sequence<? extends T> r2, Function1<? super T, ? extends Iterator<? extends R>> r3) {
        if ((r2 instanceof TransformingSequence) == false) goto L7;
        return ((TransformingSequence) r2).flatten$kotlin_stdlib(r3);
    L7:
        return new FlatteningSequence(r2, new SequencesKt__SequencesKt$$ExternalSyntheticLambda4(), r3);
    }

    private static final Object flatten$lambda$4$SequencesKt__SequencesKt(Object it) {
        return it;
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(Sequence<? extends Pair<? extends T, ? extends R>> r5) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        ArrayList listT = new ArrayList();
        ArrayList listR = new ArrayList();
        Iterator<? extends Pair<? extends T, ? extends R>> r2 = r5.iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        Pair<? extends T, ? extends R> r3 = r2.next();
        listT.add(r3.getFirst());
        listR.add(r3.getSecond());
        goto L4
    L7:
        return TuplesKt.to(listT, listR);
    }

    public static final <T> Sequence<T> shuffled(Sequence<? extends T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return SequencesKt.shuffled(r1, Random.Default);
    }

    public static final <T> Sequence<T> shuffled(Sequence<? extends T> r2, Random random) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        return SequencesKt.sequence(new C07031(r2, random, null));
    }

    public static final <T, C, R> Sequence<R> flatMapIndexed(Sequence<? extends T> r2, Function2<? super Integer, ? super T, ? extends C> r3, Function1<? super C, ? extends Iterator<? extends R>> r4) {
        Intrinsics.checkNotNullParameter(r2, "source");
        Intrinsics.checkNotNullParameter(r3, "transform");
        Intrinsics.checkNotNullParameter(r4, "iterator");
        return SequencesKt.sequence(new C07011(r2, r3, r4, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Sequence<T> constrainOnce(Sequence<? extends T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        if ((r1 instanceof ConstrainedOnceSequence) == false) goto L6;
        return r1;
    L6:
        return new ConstrainedOnceSequence(r1);
    }

    public static final <T> Sequence<T> generateSequence(final Function0<? extends T> r2) {
        Intrinsics.checkNotNullParameter(r2, "nextFunction");
        return SequencesKt.constrainOnce(new GeneratorSequence(r2, new SequencesKt__SequencesKt$$ExternalSyntheticLambda1(r2)));
    }

    private static final Object generateSequence$lambda$5$SequencesKt__SequencesKt(Function0 $nextFunction, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return $nextFunction.invoke();
    }

    public static final <T> Sequence<T> generateSequence(final T r2, Function1<? super T, ? extends T> r3) {
        Intrinsics.checkNotNullParameter(r3, "nextFunction");
        if (r2 != null) goto L6;
        return EmptySequence.INSTANCE;
    L6:
        return new GeneratorSequence(new SequencesKt__SequencesKt$$ExternalSyntheticLambda0(r2), r3);
    }

    private static final Object generateSequence$lambda$6$SequencesKt__SequencesKt(Object $seed) {
        return $seed;
    }

    public static final <T> Sequence<T> generateSequence(Function0<? extends T> r1, Function1<? super T, ? extends T> r2) {
        Intrinsics.checkNotNullParameter(r1, "seedFunction");
        Intrinsics.checkNotNullParameter(r2, "nextFunction");
        return new GeneratorSequence(r1, r2);
    }
}
