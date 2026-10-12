package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: SnapshotIdSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 &2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001&B3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000J\u0012\u0010\u000e\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J>\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002+\u0010\u0012\u001a'\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00000\u0013H\u0082\bJ!\u0010\u0017\u001a\u00020\u00182\u0016\u0010\u0019\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00180\u001aH\u0086\bJ\u0012\u0010\u001b\u001a\u00020\u001c2\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J\u0013\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001eH\u0096\u0002J\u0016\u0010\u001f\u001a\u00060\u0002j\u0002`\u00032\n\u0010 \u001a\u00060\u0002j\u0002`\u0003J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000J\u0012\u0010#\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J\b\u0010$\u001a\u00020%H\u0016R\u0016\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "belowBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "(JJJ[J)V", "and", "ids", "andNot", "clear", "id", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "fastForEach", "", "block", "Lkotlin/Function1;", "get", "", "iterator", "", "lowest", "default", "or", "bits", "set", "toString", "", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnapshotIdSet implements Iterable<Long>, KMappedMarker {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final SnapshotIdSet EMPTY = null;
    private final long[] belowBound;
    private final long lowerBound;
    private final long lowerSet;
    private final long upperSet;

    /* JADX INFO: compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.access$getEMPTY$cp();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {252, 256, 263}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Long>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SnapshotIdSet this$0;

        AnonymousClass1(SnapshotIdSet r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super Long> r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(SequenceScope<? super Long> r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0089 -> B:17:0x008c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b5 -> B:30:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d3 -> B:30:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f8 -> B:42:0x011d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0119 -> B:42:0x011d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            int index = this.I$0;
            SequenceScope $this$sequence = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure($result);
            AnonymousClass1 r4 = this;
            long r19 = 1;
        L42:
            index = index + 1;
        L35:
            if (index >= 64) goto L45;
            if ((SnapshotIdSet.access$getUpperSet$p(r4.this$0) & (r19 << index)) == 0) goto L42;
            r4.L$0 = $this$sequence;
            r4.L$1 = null;
            r4.I$0 = index;
            r4.label = 3;
            if ($this$sequence.yield(Boxing.boxLong((SnapshotIdSet.access$getLowerBound$p(r4.this$0) + ((long) index)) + 64), r4) != r1) goto L42;
            return r1;
        L45:
            return Unit.INSTANCE;
        L7:
            int index2 = this.I$0;
            SequenceScope $this$sequence2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure($result);
            SequenceScope $this$sequence3 = $this$sequence2;
            r19 = 1;
            AnonymousClass1 r11 = this;
        L30:
            index2 = index2 + 1;
        L23:
            if (index2 < 64) goto L25;
            SequenceScope $this$sequence4 = $this$sequence3;
        L33:
            if (SnapshotIdSet.access$getUpperSet$p(r11.this$0) == 0) goto L45;
            SequenceScope r21 = $this$sequence4;
            index = 0;
            r4 = r11;
            $this$sequence = r21;
            goto L35
        L25:
            if ((SnapshotIdSet.access$getLowerSet$p(r11.this$0) & (r19 << index2)) == 0) goto L30;
            r11.L$0 = $this$sequence3;
            r11.L$1 = null;
            r11.I$0 = index2;
            r11.label = 2;
            if ($this$sequence3.yield(Boxing.boxLong(SnapshotIdSet.access$getLowerBound$p(r11.this$0) + ((long) index2)), r11) != r1) goto L30;
            return r1;
        L8:
            int $i$f$forEach = this.I$1;
            int r13 = this.I$0;
            long[] $this$forEach$iv = (long[]) this.L$1;
            SequenceScope $this$sequence5 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure($result);
            AnonymousClass1 r5 = this;
        L17:
            r13 = r13 + 1;
            r11 = r5;
        L12:
            if (r13 >= $i$f$forEach) goto L18;
            long it = $this$forEach$iv[r13];
            Long r6 = Boxing.boxLong(it);
            r11.L$0 = $this$sequence5;
            r11.L$1 = $this$forEach$iv;
            r11.I$0 = r13;
            r11.I$1 = $i$f$forEach;
            r11.label = 1;
            if ($this$sequence5.yield(r6, r11) != r1) goto L16;
            return r1;
        L16:
            r5 = r11;
            goto L17
        L18:
            r19 = 1;
            $this$sequence4 = $this$sequence5;
        L21:
            if (SnapshotIdSet.access$getLowerSet$p(r11.this$0) == 0) goto L33;
            SequenceScope r22 = $this$sequence4;
            index2 = 0;
            $this$sequence3 = r22;
            goto L23
        L9:
            ResultKt.throwOnFailure($result);
            $this$sequence4 = (SequenceScope) this.L$0;
            long[] $this$forEach$iv2 = SnapshotIdSet.access$getBelowBound$p(this.this$0);
            if ($this$forEach$iv2 == null) goto L19;
            $this$sequence5 = $this$sequence4;
            $i$f$forEach = $this$forEach$iv2.length;
            r13 = 0;
            $this$forEach$iv = $this$forEach$iv2;
            r11 = this;
            goto L12
        L19:
            r19 = 1;
            r11 = this;
            goto L21
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private SnapshotIdSet(long upperSet, long lowerSet, long lowerBound, long[] belowBound) {
        this.upperSet = upperSet;
        this.lowerSet = lowerSet;
        this.lowerBound = lowerBound;
        this.belowBound = belowBound;
    }

    public static final /* synthetic */ long[] access$getBelowBound$p(SnapshotIdSet $this) {
        return $this.belowBound;
    }

    public static final /* synthetic */ SnapshotIdSet access$getEMPTY$cp() {
        return EMPTY;
    }

    public static final /* synthetic */ long access$getLowerBound$p(SnapshotIdSet $this) {
        return $this.lowerBound;
    }

    public static final /* synthetic */ long access$getLowerSet$p(SnapshotIdSet $this) {
        return $this.lowerSet;
    }

    public static final /* synthetic */ long access$getUpperSet$p(SnapshotIdSet $this) {
        return $this.upperSet;
    }

    public final boolean get(long id) {
        long offset = id - this.lowerBound;
        if (offset < 0) goto L11;
        if (offset >= 64) goto L11;
        if (((1 << ((int) offset)) & this.lowerSet) == 0) goto L29;
        return true;
    L29:
        return false;
    L11:
        if (offset < 64) goto L19;
        if (offset >= 128) goto L19;
        if (((1 << (((int) offset) - 64)) & this.upperSet) == 0) goto L30;
        return true;
    L30:
        return false;
    L19:
        if (offset > 0) goto L31;
        long[] it = this.belowBound;
        if (it == null) goto L28;
        if (SnapshotId_jvmKt.binarySearch(it, id) < 0) goto L32;
        return true;
    L32:
        return false;
    L28:
        return false;
    L31:
        return false;
    }

    public final SnapshotIdSet set(long id) {
        long offset = id - this.lowerBound;
        long r10 = 1;
        if (offset < 0) goto L11;
        if (offset >= 64) goto L11;
        long mask = 1 << ((int) offset);
        if ((this.lowerSet & mask) == 0) goto L9;
    L58:
        return this;
    L9:
        return new SnapshotIdSet(this.upperSet, this.lowerSet | mask, this.lowerBound, this.belowBound);
    L11:
        if (offset < 64) goto L19;
        if (offset >= 128) goto L19;
        long mask2 = 1 << (((int) offset) - 64);
        if ((this.upperSet & mask2) != 0) goto L58;
        return new SnapshotIdSet(this.upperSet | mask2, this.lowerSet, this.lowerBound, this.belowBound);
    L19:
        if (offset >= 128) goto L21;
        long[] array = this.belowBound;
        if (array == null) goto L53;
        int location = SnapshotId_jvmKt.binarySearch(array, id);
        if (location >= 0) goto L58;
        int insertLocation = -(location + 1);
        long[] newBelowBound = SnapshotId_jvmKt.withIdInsertedAt(array, insertLocation, id);
        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, newBelowBound);
    L53:
        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, new long[]{id});
    L21:
        if (get(id) == true) goto L58;
        long newUpperSet = this.upperSet;
        long newLowerSet = this.lowerSet;
        long newLowerBound = this.lowerBound;
        SnapshotIdArrayBuilder r7 = null;
        long it = ((id + 1) / 64) * 64;
        if (it >= 0) goto L25;
        it = 9223372036854775680L;
    L25:
        long newUpperSet2 = newUpperSet;
    L27:
        if (newLowerBound >= it) goto L42;
        if (newLowerSet == 0) goto L39;
        if (r7 != null) goto L32;
        r7 = new SnapshotIdArrayBuilder(this.belowBound);
    L32:
        int r14 = 0;
    L33:
        if (r14 >= 64) goto L39;
        int bitOffset = r14;
        if ((newLowerSet & (r10 << bitOffset)) == 0) goto L37;
        r7.add(((long) bitOffset) + newLowerBound);
    L37:
        r14 = r14 + 1;
        r10 = 1;
    L39:
        if (newUpperSet2 == 0) goto L40;
        newLowerSet = newUpperSet2;
        newUpperSet2 = 0;
        newLowerBound = newLowerBound + 64;
        r10 = 1;
        goto L27
    L40:
        long newLowerBound2 = it;
        long newLowerSet2 = 0;
        long newLowerBound3 = newLowerBound2;
    L44:
        if (r7 == null) goto L47;
        long[] r5 = r7.toArray();
        if (r5 == null) goto L47;
    L49:
        return new SnapshotIdSet(newUpperSet2, newLowerSet2, newLowerBound3, r5).set(id);
    L47:
        r5 = this.belowBound;
        goto L49
    L42:
        newLowerSet2 = newLowerSet;
        newLowerBound3 = newLowerBound;
        goto L44
    }

    public final SnapshotIdSet clear(long id) {
        long offset = id - this.lowerBound;
        if (offset < 0) goto L11;
        if (offset >= 64) goto L11;
        long mask = 1 << ((int) offset);
        if ((this.lowerSet & mask) != 0) goto L9;
    L26:
        return this;
    L9:
        return new SnapshotIdSet(this.upperSet, (~mask) & this.lowerSet, this.lowerBound, this.belowBound);
    L11:
        if (offset < 64) goto L19;
        if (offset >= 128) goto L19;
        long mask2 = 1 << (((int) offset) - 64);
        if ((this.upperSet & mask2) == 0) goto L26;
        return new SnapshotIdSet((~mask2) & this.upperSet, this.lowerSet, this.lowerBound, this.belowBound);
    L19:
        if (offset >= 0) goto L26;
        long[] array = this.belowBound;
        if (array == null) goto L26;
        int location = SnapshotId_jvmKt.binarySearch(array, id);
        if (location < 0) goto L26;
        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(array, location));
    }

    public final SnapshotIdSet andNot(SnapshotIdSet ids) {
        if (ids != EMPTY) goto L6;
        return this;
    L6:
        if (this != EMPTY) goto L10;
        return EMPTY;
    L10:
        if (ids.lowerBound == this.lowerBound) goto L12;
    L14:
        SnapshotIdSet this_$iv = ids;
        Object accumulator$iv = this;
        long[] $this$forEach$iv$iv$iv = access$getBelowBound$p(this_$iv);
        if ($this$forEach$iv$iv$iv == null) goto L22;
        int r9 = $this$forEach$iv$iv$iv.length;
        int r10 = 0;
    L17:
        if (r10 >= r9) goto L22;
        long value$iv$iv$iv = $this$forEach$iv$iv$iv[r10];
        SnapshotIdSet previous = (SnapshotIdSet) accumulator$iv;
        accumulator$iv = previous.clear(value$iv$iv$iv);
        r10 = r10 + 1;
        this_$iv = this_$iv;
    L22:
        if (access$getLowerSet$p(this_$iv) == 0) goto L30;
        int index$iv$iv = 0;
    L24:
        if (index$iv$iv >= 64) goto L30;
        if ((access$getLowerSet$p(this_$iv) & (1 << index$iv$iv)) == 0) goto L28;
        long element$iv = access$getLowerBound$p(this_$iv) + ((long) index$iv$iv);
        SnapshotIdSet previous2 = (SnapshotIdSet) accumulator$iv;
        accumulator$iv = previous2.clear(element$iv);
    L28:
        index$iv$iv = index$iv$iv + 1;
    L30:
        if (access$getUpperSet$p(this_$iv) == 0) goto L38;
        int index$iv$iv2 = 0;
    L32:
        if (index$iv$iv2 >= 64) goto L38;
        if ((access$getUpperSet$p(this_$iv) & (1 << index$iv$iv2)) == 0) goto L36;
        long element$iv2 = (access$getLowerBound$p(this_$iv) + ((long) index$iv$iv2)) + 64;
        SnapshotIdSet previous3 = (SnapshotIdSet) accumulator$iv;
        accumulator$iv = previous3.clear(element$iv2);
    L36:
        index$iv$iv2 = index$iv$iv2 + 1;
    L38:
        return (SnapshotIdSet) accumulator$iv;
    L12:
        if (ids.belowBound != this.belowBound) goto L14;
        long r2 = this.upperSet;
        long r5 = (~ids.upperSet) & r2;
        long r3 = this.lowerSet;
        return new SnapshotIdSet(r5, (~ids.lowerSet) & r3, this.lowerBound, this.belowBound);
    }

    public final SnapshotIdSet and(SnapshotIdSet ids) {
        if (Intrinsics.areEqual(ids, EMPTY) == false) goto L7;
        return EMPTY;
    L7:
        if (Intrinsics.areEqual(this, EMPTY) == false) goto L11;
        return EMPTY;
    L11:
        if (ids.lowerBound == this.lowerBound) goto L13;
    L22:
        int r7 = 0;
        if (this.belowBound != null) goto L58;
        SnapshotIdSet initial$iv = EMPTY;
        SnapshotIdSet previous = initial$iv;
        long[] $this$forEach$iv$iv$iv = access$getBelowBound$p(this);
        if ($this$forEach$iv$iv$iv == null) goto L34;
        int r4 = $this$forEach$iv$iv$iv.length;
    L27:
        if (r7 >= r4) goto L33;
        long value$iv$iv$iv = $this$forEach$iv$iv$iv[r7];
        SnapshotIdSet previous2 = previous;
        if (ids.get(value$iv$iv$iv) == false) goto L32;
        previous2 = previous2.set(value$iv$iv$iv);
    L32:
        previous = previous2;
        r7 = r7 + 1;
        goto L27
    L33:
        long r25 = 1;
        long r28 = 64;
    L36:
        if (access$getLowerSet$p(this) == r3) goto L47;
        int index$iv$iv = 0;
    L38:
        if (index$iv$iv >= 64) goto L47;
        if ((access$getLowerSet$p(this) & (r25 << index$iv$iv)) == 0) goto L45;
        long element$iv = access$getLowerBound$p(this) + ((long) index$iv$iv);
        SnapshotIdSet previous3 = previous;
        if (ids.get(element$iv) == false) goto L44;
        previous3 = previous3.set(element$iv);
    L44:
        previous = previous3;
    L45:
        index$iv$iv = index$iv$iv + 1;
    L47:
        if (access$getUpperSet$p(this) == r3) goto L57;
        int index$iv$iv2 = 0;
    L49:
        if (index$iv$iv2 >= 64) goto L57;
        if ((access$getUpperSet$p(this) & (r25 << index$iv$iv2)) == r3) goto L56;
        long element$iv2 = (access$getLowerBound$p(this) + ((long) index$iv$iv2)) + r28;
        SnapshotIdSet previous4 = previous;
        if (ids.get(element$iv2) == false) goto L55;
        previous4 = previous4.set(element$iv2);
    L55:
        previous = previous4;
    L56:
        index$iv$iv2 = index$iv$iv2 + 1;
    L57:
        SnapshotIdSet initial$iv2 = previous;
        return initial$iv2;
    L34:
        r25 = 1;
        r28 = 64;
        goto L36
    L58:
        SnapshotIdSet initial$iv3 = EMPTY;
        SnapshotIdSet previous5 = initial$iv3;
        long[] $this$forEach$iv$iv$iv2 = access$getBelowBound$p(ids);
        if ($this$forEach$iv$iv$iv2 == null) goto L69;
        int $i$f$forEach = 0;
        int r12 = $this$forEach$iv$iv$iv2.length;
    L61:
        if (r7 >= r12) goto L69;
        long value$iv$iv$iv2 = $this$forEach$iv$iv$iv2[r7];
        SnapshotIdSet previous6 = previous5;
        int $i$f$forEach2 = $i$f$forEach;
        if (get(value$iv$iv$iv2) == false) goto L66;
        previous6 = previous6.set(value$iv$iv$iv2);
    L66:
        previous5 = previous6;
        r7 = r7 + 1;
        $i$f$forEach = $i$f$forEach2;
    L69:
        if (access$getLowerSet$p(ids) == 0) goto L81;
        int index$iv$iv3 = 0;
    L72:
        if (index$iv$iv3 >= 64) goto L81;
        if ((access$getLowerSet$p(ids) & (1 << index$iv$iv3)) == 0) goto L79;
        long element$iv3 = access$getLowerBound$p(ids) + ((long) index$iv$iv3);
        SnapshotIdSet previous7 = previous5;
        if (get(element$iv3) == false) goto L78;
        previous7 = previous7.set(element$iv3);
    L78:
        previous5 = previous7;
    L79:
        index$iv$iv3 = index$iv$iv3 + 1;
    L81:
        if (access$getUpperSet$p(ids) == 0) goto L92;
        int index$iv$iv4 = 0;
    L84:
        if (index$iv$iv4 >= 64) goto L92;
        if ((access$getUpperSet$p(ids) & (1 << index$iv$iv4)) == 0) goto L91;
        long element$iv4 = (access$getLowerBound$p(ids) + ((long) index$iv$iv4)) + 64;
        SnapshotIdSet previous8 = previous5;
        if (get(element$iv4) == false) goto L90;
        previous8 = previous8.set(element$iv4);
    L90:
        previous5 = previous8;
    L91:
        index$iv$iv4 = index$iv$iv4 + 1;
    L92:
        SnapshotIdSet initial$iv4 = previous5;
        return initial$iv4;
    L13:
        if (ids.belowBound != this.belowBound) goto L22;
        long newUpper = this.upperSet & ids.upperSet;
        long newLower = this.lowerSet & ids.lowerSet;
        if (newUpper == 0) goto L17;
    L21:
        long r2 = this.upperSet;
        long r10 = ids.upperSet & r2;
        long r3 = this.lowerSet;
        SnapshotIdSet initial$iv5 = new SnapshotIdSet(r10, ids.lowerSet & r3, this.lowerBound, this.belowBound);
        return initial$iv5;
    L17:
        if (newLower != 0) goto L21;
        if (this.belowBound != null) goto L21;
        SnapshotIdSet initial$iv6 = EMPTY;
        return initial$iv6;
    }

    public final SnapshotIdSet or(SnapshotIdSet bits) {
        if (bits != EMPTY) goto L6;
        return this;
    L6:
        if (this != EMPTY) goto L9;
        return bits;
    L9:
        if (bits.lowerBound == this.lowerBound) goto L11;
    L13:
        int r5 = 0;
        if (this.belowBound != null) goto L41;
        SnapshotIdSet r12 = bits;
        long[] $this$forEach$iv$iv$iv = access$getBelowBound$p(this);
        if ($this$forEach$iv$iv$iv == null) goto L21;
        long r17 = 64;
        int r3 = $this$forEach$iv$iv$iv.length;
    L18:
        if (r5 >= r3) goto L20;
        long value$iv$iv$iv = $this$forEach$iv$iv$iv[r5];
        SnapshotIdSet previous = r12;
        r12 = previous.set(value$iv$iv$iv);
        r5 = r5 + 1;
        goto L18
    L20:
        long r24 = 0;
        long r27 = 1;
    L23:
        if (access$getLowerSet$p(this) == r24) goto L31;
        int index$iv$iv = 0;
    L25:
        if (index$iv$iv >= 64) goto L31;
        if ((access$getLowerSet$p(this) & (r27 << index$iv$iv)) == r24) goto L29;
        long element$iv = access$getLowerBound$p(this) + ((long) index$iv$iv);
        SnapshotIdSet previous2 = r12;
        r12 = previous2.set(element$iv);
    L29:
        index$iv$iv = index$iv$iv + 1;
    L31:
        if (access$getUpperSet$p(this) == r24) goto L82;
        int index$iv$iv2 = 0;
    L33:
        if (index$iv$iv2 >= 64) goto L83;
        if ((access$getUpperSet$p(this) & (r27 << index$iv$iv2)) == r24) goto L37;
        long element$iv2 = (access$getLowerBound$p(this) + ((long) index$iv$iv2)) + r17;
        SnapshotIdSet previous3 = r12;
        r12 = previous3.set(element$iv2);
    L37:
        index$iv$iv2 = index$iv$iv2 + 1;
        goto L33
    L83:
        return r12;
    L82:
        return r12;
    L21:
        r17 = 64;
        r24 = 0;
        r27 = 1;
        goto L23
    L41:
        Object accumulator$iv = this;
        long[] $this$forEach$iv$iv$iv2 = access$getBelowBound$p(bits);
        if ($this$forEach$iv$iv$iv2 == null) goto L48;
        int r11 = $this$forEach$iv$iv$iv2.length;
    L44:
        if (r5 >= r11) goto L48;
        long value$iv$iv$iv2 = $this$forEach$iv$iv$iv2[r5];
        SnapshotIdSet previous4 = (SnapshotIdSet) accumulator$iv;
        accumulator$iv = previous4.set(value$iv$iv$iv2);
        r5 = r5 + 1;
        $this$forEach$iv$iv$iv2 = $this$forEach$iv$iv$iv2;
    L48:
        if (access$getLowerSet$p(bits) == 0) goto L57;
        int index$iv$iv3 = 0;
    L51:
        if (index$iv$iv3 >= 64) goto L57;
        if ((access$getLowerSet$p(bits) & (1 << index$iv$iv3)) == 0) goto L55;
        long element$iv3 = access$getLowerBound$p(bits) + ((long) index$iv$iv3);
        SnapshotIdSet previous5 = (SnapshotIdSet) accumulator$iv;
        accumulator$iv = previous5.set(element$iv3);
    L55:
        index$iv$iv3 = index$iv$iv3 + 1;
    L57:
        if (access$getUpperSet$p(bits) == 0) goto L66;
        int index$iv$iv4 = 0;
    L60:
        if (index$iv$iv4 >= 64) goto L66;
        if ((access$getUpperSet$p(bits) & (1 << index$iv$iv4)) == 0) goto L64;
        long element$iv4 = (access$getLowerBound$p(bits) + ((long) index$iv$iv4)) + 64;
        SnapshotIdSet previous6 = (SnapshotIdSet) accumulator$iv;
        accumulator$iv = previous6.set(element$iv4);
    L64:
        index$iv$iv4 = index$iv$iv4 + 1;
    L66:
        return (SnapshotIdSet) accumulator$iv;
    L11:
        if (bits.belowBound != this.belowBound) goto L13;
        long r2 = this.upperSet;
        long r6 = bits.upperSet | r2;
        long r4 = this.lowerSet;
        return new SnapshotIdSet(r6, bits.lowerSet | r4, this.lowerBound, this.belowBound);
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return SequencesKt.sequence(new AnonymousClass1(this, null)).iterator();
    }

    private final SnapshotIdSet fastFold(SnapshotIdSet initial, Function2<? super SnapshotIdSet, ? super Long, SnapshotIdSet> r17) {
        Object accumulator = initial;
        long[] $this$forEach$iv$iv = access$getBelowBound$p(this);
        if ($this$forEach$iv$iv == null) goto L9;
        int r7 = $this$forEach$iv$iv.length;
        int r8 = 0;
    L5:
        if (r8 >= r7) goto L9;
        long value$iv$iv = $this$forEach$iv$iv[r8];
        accumulator = r17.invoke(accumulator, Long.valueOf(value$iv$iv));
        r8 = r8 + 1;
    L9:
        if (access$getLowerSet$p(this) == 0) goto L17;
        int index$iv = 0;
    L11:
        if (index$iv >= 64) goto L17;
        if ((access$getLowerSet$p(this) & (1 << index$iv)) == 0) goto L15;
        long element = access$getLowerBound$p(this) + ((long) index$iv);
        accumulator = r17.invoke(accumulator, Long.valueOf(element));
    L15:
        index$iv = index$iv + 1;
    L17:
        if (access$getUpperSet$p(this) == 0) goto L25;
        int index$iv2 = 0;
    L19:
        if (index$iv2 >= 64) goto L25;
        if ((access$getUpperSet$p(this) & (1 << index$iv2)) == 0) goto L23;
        long element2 = (access$getLowerBound$p(this) + ((long) index$iv2)) + 64;
        accumulator = r17.invoke(accumulator, Long.valueOf(element2));
    L23:
        index$iv2 = index$iv2 + 1;
    L25:
        return (SnapshotIdSet) accumulator;
    }

    public final void fastForEach(Function1<? super Long, Unit> r12) {
        long[] $this$forEach$iv = access$getBelowBound$p(this);
        if ($this$forEach$iv == null) goto L9;
        int r3 = $this$forEach$iv.length;
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L9;
        long value$iv = $this$forEach$iv[r4];
        r12.invoke(Long.valueOf(value$iv));
        r4 = r4 + 1;
    L9:
        if (access$getLowerSet$p(this) == 0) goto L17;
        int index = 0;
    L11:
        if (index >= 64) goto L17;
        if ((access$getLowerSet$p(this) & (1 << index)) == 0) goto L15;
        r12.invoke(Long.valueOf(access$getLowerBound$p(this) + ((long) index)));
    L15:
        index = index + 1;
    L17:
        if (access$getUpperSet$p(this) == 0) goto L24;
        int index2 = 0;
    L19:
        if (index2 >= 64) goto L32;
        if ((access$getUpperSet$p(this) & (1 << index2)) == 0) goto L23;
        r12.invoke(Long.valueOf((access$getLowerBound$p(this) + ((long) index2)) + 64));
    L23:
        index2 = index2 + 1;
        goto L19
    L32:
        return;
    }

    public final long lowest(long r6) {
        long[] belowBound = this.belowBound;
        if (belowBound == null) goto L7;
        return belowBound[0];
    L7:
        if (this.lowerSet == 0) goto L11;
        return this.lowerBound + ((long) Long.numberOfTrailingZeros(this.lowerSet));
    L11:
        if (this.upperSet != 0) goto L13;
        return r6;
    L13:
        return (this.lowerBound + 64) + ((long) Long.numberOfTrailingZeros(this.upperSet));
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder().append(super.toString()).append(" [");
        SnapshotIdSet $this$map$iv = this;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<Long> r6 = $this$map$iv.iterator();
    L4:
        if (r6.hasNext() == false) goto L7;
        Object item$iv$iv = r6.next();
        long it = ((Number) item$iv$iv).longValue();
        destination$iv$iv.add(String.valueOf(it));
        goto L4
    L7:
        return r0.append(ListUtilsKt.fastJoinToString$default((List) destination$iv$iv, null, null, null, 0, null, null, 63, null)).append(']').toString();
    }

    static {
        Companion = new Companion(null);
        EMPTY = new SnapshotIdSet(0, 0, 0, null);
    }
}
