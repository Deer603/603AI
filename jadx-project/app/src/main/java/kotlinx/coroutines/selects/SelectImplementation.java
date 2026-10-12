package kotlinx.coroutines.selects;

import androidx.autofill.HintConstants;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001HB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u001a\u0010\u001d\u001a\u00020\u001b2\u0010\u0010\u001e\u001a\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u000e\u0010\u001f\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\u00028\u0000H\u0091@¢\u0006\u0002\u0010 J\u000e\u0010%\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010 J\u001c\u0010&\u001a\u000e\u0018\u00010\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u0012\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001c\u0010*\u001a\u00020\u001b2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010-\u001a\u00020\u0014H\u0016J*\u0010.\u001a\u00028\u00002\u0010\u0010/\u001a\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u0012\u00102\u001a\u00020\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u00103\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u00105\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u000eJ\u001a\u00107\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002J\u000e\u00108\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010 J0\u0010'\u001a\u00020\u001b*\u0002092\u001c\u0010:\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u000e0;H\u0096\u0002¢\u0006\u0002\u0010=JB\u0010'\u001a\u00020\u001b\"\u0004\b\u0001\u0010>*\b\u0012\u0004\u0012\u0002H>0?2\"\u0010:\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H>\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u000e0@H\u0096\u0002¢\u0006\u0002\u0010AJV\u0010'\u001a\u00020\u001b\"\u0004\b\u0001\u0010B\"\u0004\b\u0002\u0010>*\u000e\u0012\u0004\u0012\u0002HB\u0012\u0004\u0012\u0002H>0C2\u0006\u0010D\u001a\u0002HB2\"\u0010:\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H>\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u000e0@H\u0096\u0002¢\u0006\u0002\u0010EJ \u0010F\u001a\u00020\u001b*\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010G\u001a\u00020\u0010H\u0001R$\u0010\b\u001a\u0014\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019X\u0082\u0004¨\u0006I"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "clauses", "", "Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "disposableHandleOrSegment", "", "inRegistrationPhase", "", "getInRegistrationPhase", "()Z", "indexInSegment", "", "internalResult", "isCancelled", "isSelected", "state", "Lkotlinx/atomicfu/AtomicRef;", "checkClauseObject", "", "clauseObject", "cleanup", "selectedClause", "complete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disposeOnCompletion", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "doSelect", "doSelectSuspend", "findClause", "invoke", "cause", "", "invokeOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "processResultAndInvokeBlockRecoveringException", "clause", "(Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reregisterClause", "selectInRegistrationPhase", "trySelect", "result", "trySelectDetailed", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "trySelectInternal", "waitUntilSelected", "Lkotlinx/coroutines/selects/SelectClause0;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "register", "reregister", "ClauseData", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SelectImplementation<R> implements CancelHandler, SelectBuilder<R>, SelectInstanceInternal<R> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater state$volatile$FU = null;
    private List<SelectImplementation<R>.ClauseData> clauses;
    private final CoroutineContext context;
    private Object disposableHandleOrSegment;
    private int indexInSegment;
    private Object internalResult;
    private volatile /* synthetic */ Object state$volatile;

    /* JADX INFO: compiled from: Select.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B¶\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012U\u0010\u0003\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000b\u0012U\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u000e\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012g\u0010\u0010\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012\u0018\u00010\u0004j\u0004\u0018\u0001`\u0014¢\u0006\u0002\u0010\u0015J*\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u00122\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u001a\u001a\u00020\nJ\u0018\u0010\u001b\u001a\u00028\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001J\u0014\u0010 \u001a\u00020!2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\"R\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000Rq\u0010\u0010\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012\u0018\u00010\u0004j\u0004\u0018\u0001`\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R]\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R]\u0010\u0003\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "clauseObject", "regFunc", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "Lkotlinx/coroutines/selects/SelectInstance;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "processResFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "block", "onCancellationConstructor", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "(Lkotlinx/coroutines/selects/SelectImplementation;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "disposableHandleOrSegment", "indexInSegment", "", "createOnCancellationAction", "dispose", "invokeBlock", "argument", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processResult", "result", "tryRegisterAsWaiter", "", "Lkotlinx/coroutines/selects/SelectImplementation;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ClauseData {
        private final Object block;
        public final Object clauseObject;
        public Object disposableHandleOrSegment;
        public int indexInSegment;
        public final Function3<SelectInstance<?>, Object, Object, Function1<Throwable, Unit>> onCancellationConstructor;
        private final Object param;
        private final Function3<Object, Object, Object, Object> processResFunc;
        private final Function3<Object, SelectInstance<?>, Object, Unit> regFunc;
        final /* synthetic */ SelectImplementation<R> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public ClauseData(SelectImplementation this$0, Object clauseObject, Function3<Object, ? super SelectInstance<?>, Object, Unit> r4, Function3<Object, Object, Object, ? extends Object> r5, Object param, Object block, Function3<? super SelectInstance<?>, Object, Object, ? extends Function1<? super Throwable, Unit>> r8) {
            this.this$0 = this$0;
            this.clauseObject = clauseObject;
            this.regFunc = r4;
            this.processResFunc = r5;
            this.param = param;
            this.block = block;
            this.onCancellationConstructor = r8;
            this.indexInSegment = -1;
        }

        public final boolean tryRegisterAsWaiter(SelectImplementation<R> r6) {
            if (DebugKt.getASSERTIONS_ENABLED() == false) goto L16;
            if (SelectImplementation.access$getInRegistrationPhase(r6) == false) goto L7;
        L10:
            int r0 = 1;
        L11:
            if (r0 != 0) goto L16;
            throw new AssertionError();
        L7:
            if (SelectImplementation.access$isCancelled(r6) == true) goto L10;
            r0 = 0;
        L16:
            if (DebugKt.getASSERTIONS_ENABLED() == true) goto L18;
        L25:
            this.regFunc.invoke(this.clauseObject, r6, this.param);
            if (SelectImplementation.access$getInternalResult$p(r6) == SelectKt.access$getNO_RESULT$p()) goto L28;
            return false;
        L28:
            return true;
        L18:
            if (SelectImplementation.access$getInternalResult$p(r6) != SelectKt.access$getNO_RESULT$p()) goto L20;
            int r1 = 1;
        L21:
            if (r1 != 0) goto L25;
            throw new AssertionError();
        L20:
            r1 = 0;
            goto L21
        }

        public final Object processResult(Object result) {
            return this.processResFunc.invoke(this.clauseObject, this.param, result);
        }

        public final Object invokeBlock(Object argument, Continuation<? super R> r5) {
            Object block = this.block;
            if (this.param != SelectKt.getPARAM_CLAUSE_0()) goto L6;
            Intrinsics.checkNotNull(block, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
            Function1 r1 = (Function1) block;
            return ((Function1) block).invoke(r5);
        L6:
            Intrinsics.checkNotNull(block, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            Function2 r2 = (Function2) block;
            return ((Function2) block).invoke(argument, r5);
        }

        public final void dispose() {
            Object $this$dispose_u24lambda_u242 = this.disposableHandleOrSegment;
            SelectImplementation<R> r1 = this.this$0;
            DisposableHandle r4 = null;
            if (($this$dispose_u24lambda_u242 instanceof Segment) == false) goto L6;
            ((Segment) $this$dispose_u24lambda_u242).onCancellation(this.indexInSegment, null, r1.getContext());
            return;
        L6:
            if (($this$dispose_u24lambda_u242 instanceof DisposableHandle) == false) goto L8;
            r4 = (DisposableHandle) $this$dispose_u24lambda_u242;
        L8:
            if (r4 == null) goto L13;
            r4.dispose();
            return;
        }

        public final Function1<Throwable, Unit> createOnCancellationAction(SelectInstance<?> r3, Object internalResult) {
            Function3<SelectInstance<?>, Object, Object, Function1<Throwable, Unit>> r0 = this.onCancellationConstructor;
            if (r0 != null) goto L7;
            return null;
        L7:
            return r0.invoke(r3, this.param, internalResult);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1, reason: invalid class name */
    /* JADX INFO: compiled from: Select.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {438, 441}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SelectImplementation<R> this$0;

        AnonymousClass1(SelectImplementation<R> r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return SelectImplementation.access$doSelectSuspend(this.this$0, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Select.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {712}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
    static final class C07771 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SelectImplementation<R> this$0;

        C07771(SelectImplementation<R> r1, Continuation<? super C07771> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return SelectImplementation.access$processResultAndInvokeBlockRecoveringException(this.this$0, null, null, this);
        }
    }

    static {
        state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");
    }

    private final /* synthetic */ Object getState$volatile() {
        return this.state$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater getState$volatile$FU() {
        return state$volatile$FU;
    }

    private final /* synthetic */ void loop$atomicfu(Object r2, AtomicReferenceFieldUpdater r3, Function1<Object, Unit> r4) {
    L2:
        r4.invoke(r3.get(r2));
        goto L2
    }

    private final /* synthetic */ void setState$volatile(Object r1) {
        this.state$volatile = r1;
    }

    private final /* synthetic */ void update$atomicfu(Object r3, AtomicReferenceFieldUpdater r4, Function1<Object, ? extends Object> r5) {
    L2:
        Object r0 = r4.get(r3);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r3, r0, r5.invoke(r0)) == false) goto L2;
    }

    public Object doSelect(Continuation<? super R> r2) {
        return doSelect$suspendImpl(this, r2);
    }

    public SelectImplementation(CoroutineContext context) {
        this.context = context;
        this.state$volatile = SelectKt.access$getSTATE_REG$p();
        this.clauses = new ArrayList(2);
        this.indexInSegment = -1;
        this.internalResult = SelectKt.access$getNO_RESULT$p();
    }

    public static final /* synthetic */ Object access$complete(SelectImplementation $this, Continuation $completion) {
        return $this.complete($completion);
    }

    public static final /* synthetic */ Object access$doSelectSuspend(SelectImplementation $this, Continuation $completion) {
        return $this.doSelectSuspend($completion);
    }

    public static final /* synthetic */ boolean access$getInRegistrationPhase(SelectImplementation $this) {
        return $this.getInRegistrationPhase();
    }

    public static final /* synthetic */ Object access$getInternalResult$p(SelectImplementation $this) {
        return $this.internalResult;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater access$getState$volatile$FU() {
        return getState$volatile$FU();
    }

    public static final /* synthetic */ boolean access$isCancelled(SelectImplementation $this) {
        return $this.isCancelled();
    }

    public static final /* synthetic */ Object access$processResultAndInvokeBlockRecoveringException(SelectImplementation $this, ClauseData clause, Object internalResult, Continuation $completion) {
        return $this.processResultAndInvokeBlockRecoveringException(clause, internalResult, $completion);
    }

    public static final /* synthetic */ void access$reregisterClause(SelectImplementation $this, Object clauseObject) {
        $this.reregisterClause(clauseObject);
    }

    public static final /* synthetic */ Object access$waitUntilSelected(SelectImplementation $this, Continuation $completion) {
        return $this.waitUntilSelected($completion);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> r1, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> r2) {
        SelectBuilder.DefaultImpls.invoke(this, r1, r2);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    @Deprecated(level = DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    public void onTimeout(long timeMillis, Function1<? super Continuation<? super R>, ? extends Object> r3) {
        SelectBuilder.DefaultImpls.onTimeout(this, timeMillis, r3);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public CoroutineContext getContext() {
        return this.context;
    }

    private final boolean getInRegistrationPhase() {
        Object it = getState$volatile$FU().get(this);
        if (it != SelectKt.access$getSTATE_REG$p()) goto L5;
    L8:
        return true;
    L5:
        if ((it instanceof List) == true) goto L8;
        return false;
    }

    private final boolean isSelected() {
        return getState$volatile$FU().get(this) instanceof ClauseData;
    }

    private final boolean isCancelled() {
        if (getState$volatile$FU().get(this) != SelectKt.access$getSTATE_CANCELLED$p()) goto L5;
        return true;
    L5:
        return false;
    }

    static /* synthetic */ <R> Object doSelect$suspendImpl(SelectImplementation<R> r1, Continuation<? super R> r2) {
        if (r1.isSelected() == false) goto L7;
        return r1.complete(r2);
    L7:
        return r1.doSelectSuspend(r2);
    }

    private final Object doSelectSuspend(Continuation<? super R> r5) {
        if ((r5 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r5;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
        return $result;
    L13:
        SelectImplementation r2 = (SelectImplementation) r0.L$0;
        ResultKt.throwOnFailure($result);
    L17:
        r0.L$0 = null;
        r0.label = 2;
        Object r3 = r2.complete(r0);
        if (r3 != r1) goto L21;
        return r1;
    L21:
        return r3;
    L14:
        ResultKt.throwOnFailure($result);
        r2 = this;
        r0.L$0 = r2;
        r0.label = 1;
        if (r2.waitUntilSelected(r0) != r1) goto L17;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r5);
        goto L8
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(SelectClause0 $this$invoke, Function1<? super Continuation<? super R>, ? extends Object> r10) {
        register$default(this, new ClauseData(this, $this$invoke.getClauseObject(), $this$invoke.getRegFunc(), $this$invoke.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), r10, $this$invoke.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(SelectClause1<? extends Q> r9, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> r10) {
        register$default(this, new ClauseData(this, r9.getClauseObject(), r9.getRegFunc(), r9.getProcessResFunc(), null, r10, r9.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> r9, P r10, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> r11) {
        register$default(this, new ClauseData(this, r9.getClauseObject(), r9.getRegFunc(), r9.getProcessResFunc(), r10, r11, r9.getOnCancellationConstructor()), false, 1, null);
    }

    public static /* synthetic */ void register$default(SelectImplementation r0, ClauseData r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L6;
        r2 = false;
    L6:
        r0.register(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
    }

    public final void register(SelectImplementation<R>.ClauseData r4, boolean reregister) {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        Object it = getState$volatile$FU().get(this);
        if ((it instanceof ClauseData) == false) goto L15;
        return;
    L15:
        if (reregister == true) goto L18;
        checkClauseObject(r4.clauseObject);
    L18:
        if (r4.tryRegisterAsWaiter(this) == false) goto L22;
        if (reregister == true) goto L21;
        List<SelectImplementation<R>.ClauseData> r0 = this.clauses;
        Intrinsics.checkNotNull(r0);
        r0.add(r4);
    L21:
        r4.disposableHandleOrSegment = this.disposableHandleOrSegment;
        r4.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
        return;
    L22:
        getState$volatile$FU().set(this, r4);
        return;
    L5:
        if (getState$volatile$FU().get(this) == SelectKt.access$getSTATE_CANCELLED$p()) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L12;
        throw new AssertionError();
    L7:
        r1 = false;
        goto L8
    }

    private final void checkClauseObject(Object clauseObject) {
        Iterable r0 = this.clauses;
        Intrinsics.checkNotNull(r0);
        Iterable $this$none$iv = r0;
        boolean r4 = true;
        if (($this$none$iv instanceof Collection) == true) goto L5;
    L7:
        Iterator r3 = $this$none$iv.iterator();
    L9:
        if (r3.hasNext() == false) goto L17;
        Object element$iv = r3.next();
        ClauseData it = (ClauseData) element$iv;
        if (it.clauseObject != clauseObject) goto L13;
        boolean r6 = true;
    L14:
        if (r6 == false) goto L9;
        r4 = false;
        goto L17
    L13:
        r6 = false;
    L17:
        if (r4 == false) goto L20;
        return;
    L20:
        throw new IllegalStateException(("Cannot use select clauses on the same object: " + clauseObject).toString());
    L5:
        if (((Collection) $this$none$iv).isEmpty() == false) goto L7;
        goto L7
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(DisposableHandle disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> r1, int index) {
        this.disposableHandleOrSegment = r1;
        this.indexInSegment = index;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(Object internalResult) {
        this.internalResult = internalResult;
    }

    private final Object waitUntilSelected(Continuation<? super Unit> r18) {
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r18), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl cont = cancellable$iv;
        AtomicReferenceFieldUpdater handler$atomicfu$iv = access$getState$volatile$FU();
    L3:
        Object curState = handler$atomicfu$iv.get(this);
        if (curState == SelectKt.access$getSTATE_REG$p()) goto L6;
        if ((curState instanceof List) == false) goto L19;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(access$getState$volatile$FU(), this, curState, SelectKt.access$getSTATE_REG$p()) == false) goto L3;
        List r11 = (List) curState;
        Iterable $this$forEach$iv = (Iterable) curState;
        Iterator r13 = $this$forEach$iv.iterator();
    L14:
        if (r13.hasNext() == false) goto L3;
        Object element$iv = r13.next();
        access$reregisterClause(this, element$iv);
        goto L14
    L19:
        if ((curState instanceof ClauseData) == false) goto L30;
        cont.resume(Unit.INSTANCE, ((ClauseData) curState).createOnCancellationAction(this, access$getInternalResult$p(this)));
    L21:
        Object r2 = cancellable$iv.getResult();
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L25;
        DebugProbesKt.probeCoroutineSuspended(r18);
    L25:
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L28;
        return r2;
    L28:
        return Unit.INSTANCE;
    L30:
        throw new IllegalStateException(("unexpected state: " + curState).toString());
    L6:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(access$getState$volatile$FU(), this, curState, cont) == false) goto L3;
        CancellableContinuationKt.invokeOnCancellation(cont, this);
        goto L21
    }

    private final void reregisterClause(Object clauseObject) {
        SelectImplementation<R>.ClauseData r0 = findClause(clauseObject);
        Intrinsics.checkNotNull(r0);
        r0.disposableHandleOrSegment = null;
        r0.indexInSegment = -1;
        register(r0, true);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(Object clauseObject, Object result) {
        if (trySelectInternal(clauseObject, result) != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final TrySelectDetailedResult trySelectDetailed(Object clauseObject, Object result) {
        return SelectKt.access$TrySelectDetailedResult(trySelectInternal(clauseObject, result));
    }

    private final int trySelectInternal(Object clauseObject, Object internalResult) {
    L2:
        Object curState = getState$volatile$FU().get(this);
        if ((curState instanceof CancellableContinuation) == true) goto L4;
        if (Intrinsics.areEqual(curState, SelectKt.access$getSTATE_COMPLETED$p()) == false) goto L18;
        boolean r1 = true;
    L19:
        if (r1 == true) goto L20;
        if (Intrinsics.areEqual(curState, SelectKt.access$getSTATE_CANCELLED$p()) == true) goto L24;
        if (Intrinsics.areEqual(curState, SelectKt.access$getSTATE_REG$p()) == true) goto L28;
        if ((curState instanceof List) == false) goto L36;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getState$volatile$FU(), this, curState, CollectionsKt.plus((Collection) curState, clauseObject)) == false) goto L2;
        return 1;
    L36:
        throw new IllegalStateException(("Unexpected state: " + curState).toString());
    L28:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getState$volatile$FU(), this, curState, CollectionsKt.listOf(clauseObject)) == false) goto L2;
        return 1;
    L24:
        return 2;
    L20:
        return 3;
    L18:
        r1 = curState instanceof ClauseData;
        goto L19
    L4:
        SelectImplementation<R>.ClauseData r2 = findClause(clauseObject);
        if (r2 == null) goto L2;
        Function1<Throwable, Unit> r3 = r2.createOnCancellationAction(this, internalResult);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getState$volatile$FU(), this, curState, r2) == false) goto L2;
        CancellableContinuation cont = (CancellableContinuation) curState;
        this.internalResult = internalResult;
        if (SelectKt.access$tryResume(cont, r3) == false) goto L13;
        return 0;
    L13:
        this.internalResult = SelectKt.access$getNO_RESULT$p();
        return 2;
    }

    private final SelectImplementation<R>.ClauseData findClause(Object clauseObject) {
        List<SelectImplementation<R>.ClauseData> r0 = this.clauses;
        Object r1 = null;
        if (r0 != null) goto L5;
        return null;
    L5:
        Iterator<T> r2 = r0.iterator();
    L7:
        if (r2.hasNext() == false) goto L14;
        Object r3 = r2.next();
        ClauseData it = (ClauseData) r3;
        if (it.clauseObject != clauseObject) goto L11;
        boolean r6 = true;
    L12:
        if (r6 == false) goto L7;
        r1 = r3;
        goto L14
    L11:
        r6 = false;
    L14:
        SelectImplementation<R>.ClauseData r4 = (ClauseData) r1;
        if (r4 == null) goto L18;
        return r4;
    L18:
        throw new IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    private final Object complete(Continuation<? super R> r5) {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L9:
        Object r0 = getState$volatile$FU().get(this);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        SelectImplementation<R>.ClauseData r1 = (ClauseData) r0;
        Object internalResult = this.internalResult;
        cleanup(r1);
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L13;
        Object blockArgument = r1.processResult(internalResult);
        return r1.invokeBlock(blockArgument, r5);
    L13:
        Object blockArgument2 = processResultAndInvokeBlockRecoveringException(r1, internalResult, r5);
        return blockArgument2;
    L5:
        if (isSelected() == true) goto L9;
        throw new AssertionError();
    }

    private final Object processResultAndInvokeBlockRecoveringException(SelectImplementation<R>.ClauseData r5, Object internalResult, Continuation<? super R> r7) {
        if ((r7 instanceof C07771) == false) goto L7;
        C07771 r0 = (C07771) r7;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L16;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L14
        Object r6 = $result;
    L30:
        return r6;
    L16:
        ResultKt.throwOnFailure($result);
        Object blockArgument = r5.processResult(internalResult);     // Catch: Throwable -> L14
        r0.label = 1;     // Catch: Throwable -> L14
        r6 = r5.invokeBlock(blockArgument, r0);     // Catch: Throwable -> L14
        if (r6 != r1) goto L30;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        e = move-exception;
        if (DebugKt.getRECOVER_STACK_TRACES() == false) goto L29;
        Continuation it$iv = r0;
        if ((it$iv instanceof CoroutineStackFrame) == true) goto L28;
        throw e;
    L28:
        throw StackTraceRecoveryKt.access$recoverFromStackFrame(e, (CoroutineStackFrame) it$iv);
    L29:
        throw e;
    L7:
        r0 = new C07771(this, r7);
        goto L8
    }

    private final void cleanup(SelectImplementation<R>.ClauseData r8) {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L9:
        Iterable r0 = this.clauses;
        if (r0 != null) goto L12;
        return;
    L12:
        Iterable $this$forEach$iv = r0;
        Iterator r3 = $this$forEach$iv.iterator();
    L14:
        if (r3.hasNext() == false) goto L19;
        Object element$iv = r3.next();
        SelectImplementation<R>.ClauseData r5 = (ClauseData) element$iv;
        if (r5 == r8) goto L14;
        r5.dispose();
        goto L14
    L19:
        getState$volatile$FU().set(this, SelectKt.access$getSTATE_COMPLETED$p());
        this.internalResult = SelectKt.access$getNO_RESULT$p();
        this.clauses = null;
        return;
    L5:
        if (Intrinsics.areEqual(getState$volatile$FU().get(this), r8) == true) goto L9;
        throw new AssertionError();
    }

    @Override // kotlinx.coroutines.CancelHandler
    public void invoke(Throwable cause) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = getState$volatile$FU();
    L3:
        Object cur = handler$atomicfu$iv.get(this);
        if (cur == SelectKt.access$getSTATE_COMPLETED$p()) goto L5;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu$iv, this, cur, SelectKt.access$getSTATE_CANCELLED$p()) == false) goto L3;
        Iterable r0 = this.clauses;
        if (r0 != null) goto L11;
        return;
    L11:
        Iterable $this$forEach$iv = r0;
        Iterator r3 = $this$forEach$iv.iterator();
    L13:
        if (r3.hasNext() == false) goto L15;
        Object element$iv = r3.next();
        ClauseData it = (ClauseData) element$iv;
        it.dispose();
        goto L13
    L15:
        this.internalResult = SelectKt.access$getNO_RESULT$p();
        this.clauses = null;
        return;
    }
}
