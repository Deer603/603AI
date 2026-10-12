package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: SnapshotFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0002*\u0002H\u0007\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u0002H\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\r\u001a%\u0010\u000e\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0002\b\u0014¨\u0006\u0015"}, d2 = {"snapshotFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function0;", "collectAsState", "Landroidx/compose/runtime/State;", "R", "initial", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "intersects", "", "Landroidx/collection/MutableScatterSet;", "", "set", "", "intersects$SnapshotStateKt__SnapshotFlowKt", "runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotFlow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {142, 146, 169}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class AnonymousClass1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<T> $block;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function0<? extends T> r2, Continuation<? super AnonymousClass1> r3) {
            this.$block = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.$block, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((FlowCollector) r2, r3);
        }

        public final Object invoke(FlowCollector<? super T> r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v13 */
        /* JADX WARN: Type inference failed for: r10v16 */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v20 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0173 -> B:58:0x017c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r20) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int r3 = 0;
            int r4 = 1;
            switch(this.label) {
                case 0: goto L19;
                case 1: goto L14;
                case 2: goto L9;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            Object r2 = r20;
            Object r5 = this.L$5;
            ObserverHandle r6 = (ObserverHandle) this.L$4;
            final Channel r7 = (Channel) this.L$3;
            Function1<Object, Unit> r8 = (Function1) this.L$2;
            final MutableScatterSet r9 = (MutableScatterSet) this.L$1;
            FlowCollector r10 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(r2);     // Catch: Throwable -> L17
            AnonymousClass1<T> r11 = this;
            ?? r12 = r10;
        L58:
            r3 = 0;
        L29:
            int r13 = 0;
            r11.L$0 = r12;     // Catch: Throwable -> L70
            r11.L$1 = r9;     // Catch: Throwable -> L70
            r11.L$2 = r8;     // Catch: Throwable -> L70
            r11.L$3 = r7;     // Catch: Throwable -> L70
            r11.L$4 = r6;     // Catch: Throwable -> L70
            r11.L$5 = r5;     // Catch: Throwable -> L70
            r11.I$0 = 0;     // Catch: Throwable -> L70
            r11.label = 2;     // Catch: Throwable -> L70
            Object r14 = r7.receive(r11);     // Catch: Throwable -> L70
            if (r14 != r0) goto L33;
            return r0;
        L33:
            Object r18 = r5;
            Object r15 = r2;
            Object r16 = r14;
            AnonymousClass1<T> r17 = r11;
            ?? r19 = r12;
            MutableScatterSet r110 = r9;
            Function1<Object, Unit> r21 = r8;
            Channel r22 = r7;
            ObserverHandle r23 = r6;
            Object r24 = r18;
        L90:
            Set r25 = (Set) r16;     // Catch: Throwable -> L68
        L36:
            if (r13 == 0) goto L38;
        L41:
            int r26 = 1;
        L42:
            r13 = r26;
            r25 = (Set) ChannelResult.m8931getOrNullimpl(r22.mo8920tryReceivePtdJZtk());     // Catch: Throwable -> L68
            if (r25 == null) goto L44;
            r3 = 0;
            goto L36
        L44:
            if (r13 == 0) goto L66;
            r110.clear();     // Catch: Throwable -> L68
            Snapshot r27 = Snapshot.Companion.takeSnapshot(r21);     // Catch: Throwable -> L68
            Function0<T> r111 = r17.$block;     // Catch: Throwable -> L68
            Snapshot r112 = r27.makeCurrent();     // Catch: Throwable -> L63
            T r113 = r111.invoke();     // Catch: Throwable -> L59
        L51:
            r27.restoreCurrent(r112);     // Catch: Throwable -> L63
            r27.dispose();     // Catch: Throwable -> L68
            if (Intrinsics.areEqual(r113, r24) == true) goto L66;
            r17.L$0 = r19;     // Catch: Throwable -> L68
            r17.L$1 = r110;     // Catch: Throwable -> L68
            r17.L$2 = r21;     // Catch: Throwable -> L68
            r17.L$3 = r22;     // Catch: Throwable -> L68
            r17.L$4 = r23;     // Catch: Throwable -> L68
            r17.L$5 = r113;     // Catch: Throwable -> L68
            r17.label = 3;     // Catch: Throwable -> L68
            if (r19.emit(r113, r17) != r0) goto L57;
            return r0;
        L57:
            Object r28 = r15;
            r5 = r113;
            r2 = r28;
            r6 = r23;
            r7 = r22;
            r8 = r21;
            r9 = r110;
            r12 = r19;
            r11 = r17;
            goto L58
        L66:
            r2 = r15;
            r5 = r24;
            r6 = r23;
            r7 = r22;
            r8 = r21;
            r9 = r110;
            r12 = r19;
            r11 = r17;
            r3 = 0;
        L59:
            th = move-exception;
            r27.restoreCurrent(r112);     // Catch: Throwable -> L63
            throw th;     // Catch: Throwable -> L63
        L63:
            th = move-exception;
            r27.dispose();     // Catch: Throwable -> L68
            throw th;     // Catch: Throwable -> L68
        L97:
            r2 = r15;
            r5 = r24;
            r6 = r23;
            r7 = r22;
            r8 = r21;
            r9 = r110;
            r12 = r19;
            r11 = r17;
            r3 = 0;
            goto L29
        L38:
            if (SnapshotStateKt__SnapshotFlowKt.access$intersects(r110, r25) == true) goto L41;
            r26 = r3;
        L68:
            th = th;
            r6 = r23;
        L80:
            r6.dispose();
            throw th;
        L70:
            th = th;
            goto L80
        L9:
            r16 = r20;
            int r29 = this.I$0;
            r24 = this.L$5;
            r23 = (ObserverHandle) this.L$4;
            r22 = (Channel) this.L$3;
            r21 = (Function1) this.L$2;
            r110 = (MutableScatterSet) this.L$1;
            FlowCollector r114 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(r16);     // Catch: Throwable -> L12
            r17 = this;
            r13 = r29;
            r15 = r16;
            r19 = r114;
        L12:
            th = th;
            r6 = r23;
            goto L80
        L14:
            r2 = r20;
            r5 = this.L$5;
            r6 = (ObserverHandle) this.L$4;
            r7 = (Channel) this.L$3;
            r8 = (Function1) this.L$2;
            r9 = (MutableScatterSet) this.L$1;
            FlowCollector r115 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(r2);     // Catch: Throwable -> L17
            r12 = r115;
        L28:
            r11 = this;
            goto L29
        L19:
            ResultKt.throwOnFailure(r20);
            r2 = r20;
            ?? r116 = (FlowCollector) this.L$0;
            r9 = new MutableScatterSet(r3, r4, null);
            r8 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1(r9);
            r7 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            r6 = Snapshot.Companion.registerApplyObserver(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1(r7));
            Snapshot r30 = Snapshot.Companion.takeSnapshot(r8);     // Catch: Throwable -> L78
            Function0<T> r117 = this.$block;     // Catch: Throwable -> L78
            Snapshot r118 = r30.makeCurrent();     // Catch: Throwable -> L75
            T r119 = r117.invoke();     // Catch: Throwable -> L72
            r30.restoreCurrent(r118);     // Catch: Throwable -> L75
            r30.dispose();     // Catch: Throwable -> L78
            r5 = r119;
            this.L$0 = r116;     // Catch: Throwable -> L78
            this.L$1 = r9;     // Catch: Throwable -> L78
            this.L$2 = r8;     // Catch: Throwable -> L78
            this.L$3 = r7;     // Catch: Throwable -> L78
            this.L$4 = r6;     // Catch: Throwable -> L78
            this.L$5 = r5;     // Catch: Throwable -> L78
            this.label = 1;     // Catch: Throwable -> L78
            Object r120 = r116.emit(r5, this);     // Catch: Throwable -> L78
            r12 = r116;
            if (r120 != r0) goto L28;
            return r0;
        L72:
            th = move-exception;
            r30.restoreCurrent(r118);     // Catch: Throwable -> L75
            throw th;     // Catch: Throwable -> L75
        L75:
            th = move-exception;
            r30.dispose();     // Catch: Throwable -> L78
            throw th;     // Catch: Throwable -> L78
        L78:
            th = th;
            goto L80
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L17:
            th = th;
            goto L80
        }
    }

    public static final /* synthetic */ boolean access$intersects(MutableScatterSet $receiver, Set set) {
        return intersects$SnapshotStateKt__SnapshotFlowKt($receiver, set);
    }

    public static final <T> State<T> collectAsState(StateFlow<? extends T> r7, CoroutineContext context, Composer $composer, int $changed, int r11) {
        ComposerKt.sourceInformationMarkerStart($composer, -1439883919, "C(collectAsState)48@1905L30:SnapshotFlow.kt#9igjgp");
        if ((r11 & 1) == 0) goto L5;
        CoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
        CoroutineContext context3 = context2;
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(-1439883919, $changed, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:48)");
    L9:
        State<T> r8 = SnapshotStateKt.collectAsState(r7, r7.getValue(), context3, $composer, ($changed & 14) | (($changed << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L5:
        context3 = context;
        goto L7
    }

    public static final <T extends R, R> State<R> collectAsState(Flow<? extends T> r7, R r8, CoroutineContext context, Composer $composer, int $changed, int r12) {
        ComposerKt.sourceInformationMarkerStart($composer, -606625098, "C(collectAsState)P(1)64@2575L153,64@2538L190:SnapshotFlow.kt#9igjgp");
        if ((r12 & 2) == 0) goto L5;
        CoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
        CoroutineContext context3 = context2;
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(-606625098, $changed, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:64)");
    L9:
        ComposerKt.sourceInformationMarkerStart($composer, -498556475, "CC(remember):SnapshotFlow.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance(context3) | $composer.changedInstance(r7);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L12;
    L15:
        Object value$iv = (Function2) new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(context3, r7, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        State<R> r9 = SnapshotStateKt.produceState(r8, r7, context3, (Function2) it$iv, $composer, (((($changed >> 3) & 8) | (($changed >> 3) & 14)) | (($changed << 3) & 112)) | ($changed & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r9;
    L12:
        if (it$iv != Composer.Companion.getEmpty()) goto L16;
    L5:
        context3 = context;
        goto L7
    }

    public static final <T> Flow<T> snapshotFlow(Function0<? extends T> r2) {
        return FlowKt.flow(new AnonymousClass1(r2, null));
    }

    private static final boolean intersects$SnapshotStateKt__SnapshotFlowKt(MutableScatterSet<Object> r24, Set<? extends Object> r25) {
        MutableScatterSet<Object> this_$iv = r24;
        Object[] elements$iv$iv = this_$iv.elements;
        long[] m$iv$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L27;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        long slot$iv$iv$iv2 = slot$iv$iv$iv;
        if (((((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r11 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L7:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L19;
        long value$iv$iv$iv$iv = slot$iv$iv$iv2 & 255;
        if (value$iv$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L18;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        Object element$iv = elements$iv$iv[index$iv$iv$iv];
        if (r25.contains(element$iv) == false) goto L18;
        return true;
    L18:
        slot$iv$iv$iv2 = slot$iv$iv$iv2 >> r11;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        this_$iv = this_$iv;
        r11 = r11;
        goto L7
    L11:
        r13 = false;
        goto L12
    L19:
        ScatterSet this_$iv2 = this_$iv;
        if (bitCount$iv$iv$iv != r11) goto L27;
    L23:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L27;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        this_$iv = this_$iv2;
        goto L4
    L22:
        this_$iv2 = this_$iv;
    L27:
        return false;
    }
}
