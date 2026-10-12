package kotlinx.coroutines;

import androidx.autofill.HintConstants;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause0Impl;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\nµ\u0001¶\u0001·\u0001¸\u0001¹\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0002J\u001e\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00112\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110KH\u0002J\u0012\u0010L\u001a\u00020H2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0014J\u000e\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\u0002J\u0010\u0010O\u001a\u0004\u0018\u00010\u000bH\u0084@¢\u0006\u0002\u0010PJ\u0010\u0010Q\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0002\u0010PJ\u0012\u0010R\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0017J\u0018\u0010R\u001a\u00020H2\u000e\u0010S\u001a\n\u0018\u00010Tj\u0004\u0018\u0001`UH\u0016J\u0010\u0010V\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u0011J\u0017\u0010W\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\bXJ\u0010\u0010Y\u001a\u00020H2\u0006\u0010S\u001a\u00020\u0011H\u0016J\u0014\u0010Z\u001a\u0004\u0018\u00010\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010[\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0011H\u0002J\b\u0010\\\u001a\u00020]H\u0014J\u0010\u0010^\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0011H\u0016J\u001a\u0010_\u001a\u00020H2\u0006\u00108\u001a\u00020?2\b\u0010`\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010a\u001a\u00020H2\u0006\u00108\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010f\u001a\u00020\u00112\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0002J&\u0010g\u001a\u00020h2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010]2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0011H\u0080\b¢\u0006\u0002\bjJ\u001c\u0010k\u001a\u0004\u0018\u00010\u000b2\u0006\u00108\u001a\u00020b2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010l\u001a\u0004\u0018\u00010d2\u0006\u00108\u001a\u00020?H\u0002J\n\u0010m\u001a\u00060Tj\u0002`UJ\f\u0010n\u001a\u00060Tj\u0002`UH\u0016J\u000f\u0010o\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\bpJ\b\u0010q\u001a\u0004\u0018\u00010\u0011J \u0010r\u001a\u0004\u0018\u00010\u00112\u0006\u00108\u001a\u00020b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110KH\u0002J\u0012\u0010s\u001a\u0004\u0018\u00010D2\u0006\u00108\u001a\u00020?H\u0002J\u0010\u0010t\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\u0011H\u0014J\u0015\u0010v\u001a\u00020H2\u0006\u0010u\u001a\u00020\u0011H\u0010¢\u0006\u0002\bwJ\u0012\u0010x\u001a\u00020H2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0004JA\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020\u00052\u0006\u0010|\u001a\u00020\u00052)\u0010}\u001a%\u0012\u0016\u0012\u0014\u0018\u00010\u0011¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020H0~j\u0003`\u0081\u0001J1\u0010y\u001a\u00020z2)\u0010}\u001a%\u0012\u0016\u0012\u0014\u0018\u00010\u0011¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020H0~j\u0003`\u0081\u0001J(\u0010\u0082\u0001\u001a\u00020z2\u0006\u0010{\u001a\u00020\u00052\u0006\u0010|\u001a\u00020\u00052\u0007\u0010}\u001a\u00030\u0083\u0001H\u0000¢\u0006\u0003\b\u0084\u0001J\u000f\u0010\u0085\u0001\u001a\u00020HH\u0086@¢\u0006\u0002\u0010PJ\t\u0010\u0086\u0001\u001a\u00020\u0005H\u0002J\u000f\u0010\u0087\u0001\u001a\u00020HH\u0082@¢\u0006\u0002\u0010PJ\"\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u0015\u0010\u008a\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020H0~H\u0082\bJ\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0002J\u0019\u0010\u008c\u0001\u001a\u00020\u00052\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0003\b\u008d\u0001J\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0003\b\u008f\u0001J\u001a\u0010\u0090\u0001\u001a\u00020F2\u0007\u0010}\u001a\u00030\u0083\u00012\u0006\u0010{\u001a\u00020\u0005H\u0002J\u000f\u0010\u0091\u0001\u001a\u00020]H\u0010¢\u0006\u0003\b\u0092\u0001J\u0019\u0010\u0093\u0001\u001a\u00020H2\u0006\u0010C\u001a\u00020D2\u0006\u0010S\u001a\u00020\u0011H\u0002J)\u0010\u0094\u0001\u001a\u00020H\"\u000b\b\u0000\u0010\u0095\u0001\u0018\u0001*\u00020F2\u0006\u0010C\u001a\u00020D2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0082\bJ!\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010\u0099\u0001\u001a\u00020H2\f\u0010\u009a\u0001\u001a\u0007\u0012\u0002\b\u00030\u009b\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010{\u001a\u00020H2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0014J\u0013\u0010\u009c\u0001\u001a\u00020H2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0014J\t\u0010\u009d\u0001\u001a\u00020HH\u0014J\u0010\u0010\u009e\u0001\u001a\u00020H2\u0007\u0010\u009f\u0001\u001a\u00020\u0003J\u0012\u0010 \u0001\u001a\u00020H2\u0007\u00108\u001a\u00030¡\u0001H\u0002J\u0011\u0010¢\u0001\u001a\u00020H2\u0006\u00108\u001a\u00020FH\u0002J\"\u0010£\u0001\u001a\u00020H2\f\u0010\u009a\u0001\u001a\u0007\u0012\u0002\b\u00030\u009b\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\u0017\u0010¤\u0001\u001a\u00020H2\u0006\u0010E\u001a\u00020FH\u0000¢\u0006\u0003\b¥\u0001J\u0007\u0010¦\u0001\u001a\u00020\u0005J\u0014\u0010§\u0001\u001a\u00030¨\u00012\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0002J\u0013\u0010©\u0001\u001a\u00020]2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0002J\t\u0010ª\u0001\u001a\u00020]H\u0007J\t\u0010«\u0001\u001a\u00020]H\u0016J\u001b\u0010¬\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020?2\b\u0010`\u001a\u0004\u0018\u00010\u000bH\u0002J\u0019\u0010\u00ad\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020?2\u0006\u0010I\u001a\u00020\u0011H\u0002J\u001f\u0010®\u0001\u001a\u0004\u0018\u00010\u000b2\b\u00108\u001a\u0004\u0018\u00010\u000b2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J\u001d\u0010¯\u0001\u001a\u0004\u0018\u00010\u000b2\u0006\u00108\u001a\u00020?2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J$\u0010°\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020b2\u0006\u0010N\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0082\u0010J\u0010\u0010±\u0001\u001a\u0004\u0018\u00010d*\u00030²\u0001H\u0002J\u0017\u0010³\u0001\u001a\u00020H*\u00020D2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0002J\u001d\u0010´\u0001\u001a\u00060Tj\u0002`U*\u00020\u00112\n\b\u0002\u0010i\u001a\u0004\u0018\u00010]H\u0004R\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bX\u0082\u0004R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0015\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u001e\u0010\"\u001a\u0006\u0012\u0002\b\u00030#8DX\u0084\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0017\u0010*\u001a\u00020+8F¢\u0006\f\u0012\u0004\b,\u0010%\u001a\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R(\u00103\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\t8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00108\u001a\u0004\u0018\u00010\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0018\u0010>\u001a\u00020\u0005*\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010@¨\u0006º\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "active", "", "(Z)V", "_parentHandle", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/ChildHandle;", "_state", "", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "completionCause", "", "getCompletionCause", "()Ljava/lang/Throwable;", "completionCauseHandled", "getCompletionCauseHandled", "()Z", "handlesException", "getHandlesException$kotlinx_coroutines_core", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onAwaitInternal", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwaitInternal$annotations", "()V", "getOnAwaitInternal", "()Lkotlinx/coroutines/selects/SelectClause1;", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin$annotations", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "parent", "getParent", "()Lkotlinx/coroutines/Job;", "value", "parentHandle", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "exceptionOrNull", "getExceptionOrNull", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "isCancelling", "Lkotlinx/coroutines/Incomplete;", "(Lkotlinx/coroutines/Incomplete;)Z", "addLastAtomic", "expect", "list", "Lkotlinx/coroutines/NodeList;", "node", "Lkotlinx/coroutines/JobNode;", "addSuppressedExceptions", "", "rootCause", "exceptions", "", "afterCompletion", "attachChild", "child", "awaitInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSuspend", "cancel", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelCoroutine", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelInternal", "cancelMakeCompleting", "cancelParent", "cancellationExceptionMessage", "", "childCancelled", "completeStateFinalization", "update", "continueCompleting", "Lkotlinx/coroutines/JobSupport$Finishing;", "lastChild", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "createCauseException", "defaultCancellationException", "Lkotlinx/coroutines/JobCancellationException;", "message", "defaultCancellationException$kotlinx_coroutines_core", "finalizeFinishingState", "firstChild", "getCancellationException", "getChildJobCancellationCause", "getCompletedInternal", "getCompletedInternal$kotlinx_coroutines_core", "getCompletionExceptionOrNull", "getFinalRootCause", "getOrPromoteCancellingList", "handleJobException", "exception", "handleOnCompletionException", "handleOnCompletionException$kotlinx_coroutines_core", "initParentJob", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "Lkotlinx/coroutines/CompletionHandler;", "invokeOnCompletionInternal", "Lkotlinx/coroutines/InternalCompletionHandler;", "invokeOnCompletionInternal$kotlinx_coroutines_core", "join", "joinInternal", "joinSuspend", "loopOnState", "", "block", "makeCancelling", "makeCompleting", "makeCompleting$kotlinx_coroutines_core", "makeCompletingOnce", "makeCompletingOnce$kotlinx_coroutines_core", "makeNode", "nameString", "nameString$kotlinx_coroutines_core", "notifyCancelling", "notifyHandlers", "T", "onAwaitInternalProcessResFunc", "ignoredParam", "result", "onAwaitInternalRegFunc", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "onCompletionInternal", "onStart", "parentCancelled", "parentJob", "promoteEmptyToNodeList", "Lkotlinx/coroutines/Empty;", "promoteSingleToNodeList", "registerSelectForOnJoin", "removeNode", "removeNode$kotlinx_coroutines_core", "start", "startInternal", "", "stateString", "toDebugString", "toString", "tryFinalizeSimpleState", "tryMakeCancelling", "tryMakeCompleting", "tryMakeCompletingSlowPath", "tryWaitForChild", "nextChild", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "notifyCompletion", "toCancellationException", "AwaitContinuation", "ChildCompletion", "Finishing", "SelectOnAwaitCompletionHandler", "SelectOnJoinCompletionHandler", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class JobSupport implements Job, ChildJob, ParentJob {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _parentHandle$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = null;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", "", "parent", "Lkotlinx/coroutines/Job;", "nameString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class AwaitContinuation<T> extends CancellableContinuationImpl<T> {
        private final JobSupport job;

        public AwaitContinuation(Continuation<? super T> r2, JobSupport job) {
            super(r2, 1);
            this.job = job;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public Throwable getContinuationCancellationCause(Job parent) {
            Object state = this.job.getState$kotlinx_coroutines_core();
            if ((state instanceof Finishing) == false) goto L9;
            Throwable it = ((Finishing) state).getRootCause();
            if (it == null) goto L9;
            return it;
        L9:
            if ((state instanceof CompletedExceptionally) == false) goto L13;
            return ((CompletedExceptionally) state).cause;
        L13:
            return parent.getCancellationException();
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        protected String nameString() {
            return "AwaitContinuation";
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ChildCompletion extends JobNode {
        private final ChildHandleNode child;
        private final JobSupport parent;
        private final Object proposedUpdate;
        private final Finishing state;

        public ChildCompletion(JobSupport parent, Finishing state, ChildHandleNode child, Object proposedUpdate) {
            this.parent = parent;
            this.state = state;
            this.child = child;
            this.proposedUpdate = proposedUpdate;
        }

        @Override // kotlinx.coroutines.InternalCompletionHandler
        public void invoke(Throwable cause) {
            JobSupport.access$continueCompleting(this.parent, this.state, this.child, this.proposedUpdate);
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\tJ\u0018\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\t0&j\b\u0012\u0004\u0012\u00020\t`'H\u0002J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0)2\b\u0010*\u001a\u0004\u0018\u00010\tJ\b\u0010+\u001a\u00020,H\u0016R\u0011\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fX\u0082\u0004R\t\u0010\r\u001a\u00020\u000eX\u0082\u0004R\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fX\u0082\u0004R(\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006-"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "isCompleting", "", "rootCause", "", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "_exceptionsHolder", "Lkotlinx/atomicfu/AtomicRef;", "_isCompleting", "Lkotlinx/atomicfu/AtomicBoolean;", "_rootCause", "value", "exceptionsHolder", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "isActive", "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "(Ljava/lang/Throwable;)V", "addExceptionLocked", "", "exception", "allocateList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sealLocked", "", "proposedException", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Finishing implements Incomplete {
        private static final /* synthetic */ AtomicReferenceFieldUpdater _exceptionsHolder$volatile$FU = null;
        private static final /* synthetic */ AtomicIntegerFieldUpdater _isCompleting$volatile$FU = null;
        private static final /* synthetic */ AtomicReferenceFieldUpdater _rootCause$volatile$FU = null;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;
        private final NodeList list;

        static {
            _isCompleting$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Finishing.class, "_isCompleting$volatile");
            _rootCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_rootCause$volatile");
            _exceptionsHolder$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_exceptionsHolder$volatile");
        }

        private final /* synthetic */ Object get_exceptionsHolder$volatile() {
            return this._exceptionsHolder$volatile;
        }

        private static final /* synthetic */ AtomicReferenceFieldUpdater get_exceptionsHolder$volatile$FU() {
            return _exceptionsHolder$volatile$FU;
        }

        private final /* synthetic */ int get_isCompleting$volatile() {
            return this._isCompleting$volatile;
        }

        private static final /* synthetic */ AtomicIntegerFieldUpdater get_isCompleting$volatile$FU() {
            return _isCompleting$volatile$FU;
        }

        private final /* synthetic */ Object get_rootCause$volatile() {
            return this._rootCause$volatile;
        }

        private static final /* synthetic */ AtomicReferenceFieldUpdater get_rootCause$volatile$FU() {
            return _rootCause$volatile$FU;
        }

        private final /* synthetic */ void set_exceptionsHolder$volatile(Object r1) {
            this._exceptionsHolder$volatile = r1;
        }

        private final /* synthetic */ void set_isCompleting$volatile(int r1) {
            this._isCompleting$volatile = r1;
        }

        private final /* synthetic */ void set_rootCause$volatile(Object r1) {
            this._rootCause$volatile = r1;
        }

        @Override // kotlinx.coroutines.Incomplete
        public NodeList getList() {
            return this.list;
        }

        public Finishing(NodeList r1, boolean r2, Throwable r3) {
            this.list = r1;
            this._isCompleting$volatile = r2 ? 1 : 0;
            this._rootCause$volatile = r3;
        }

        public final boolean isCompleting() {
            if (get_isCompleting$volatile$FU().get(this) == 0) goto L5;
            return true;
        L5:
            return false;
        }

        public final void setCompleting(boolean r2) {
            get_isCompleting$volatile$FU().set(this, r2 ? 1 : 0);
        }

        public final Throwable getRootCause() {
            return (Throwable) get_rootCause$volatile$FU().get(this);
        }

        public final void setRootCause(Throwable value) {
            get_rootCause$volatile$FU().set(this, value);
        }

        private final Object getExceptionsHolder() {
            return get_exceptionsHolder$volatile$FU().get(this);
        }

        private final void setExceptionsHolder(Object value) {
            get_exceptionsHolder$volatile$FU().set(this, value);
        }

        public final boolean isSealed() {
            if (getExceptionsHolder() != JobSupportKt.access$getSEALED$p()) goto L5;
            return true;
        L5:
            return false;
        }

        public final boolean isCancelling() {
            if (getRootCause() == null) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // kotlinx.coroutines.Incomplete
        public boolean isActive() {
            if (getRootCause() != null) goto L5;
            return true;
        L5:
            return false;
        }

        public final List<Throwable> sealLocked(Throwable proposedException) {
            Object eh = getExceptionsHolder();
            if (eh != null) goto L6;
            ArrayList<Throwable> r1 = allocateList();
        L11:
            Throwable rootCause = getRootCause();
            if (rootCause == null) goto L14;
            r1.add(0, rootCause);
        L14:
            if (proposedException != null) goto L16;
        L18:
            setExceptionsHolder(JobSupportKt.access$getSEALED$p());
            return r1;
        L16:
            if (Intrinsics.areEqual(proposedException, rootCause) == true) goto L18;
            r1.add(proposedException);
            goto L18
        L6:
            if ((eh instanceof Throwable) == false) goto L9;
            r1 = allocateList();
            r1.add(eh);
            goto L11
        L9:
            if ((eh instanceof ArrayList) == false) goto L21;
            r1 = (ArrayList) eh;
            goto L11
        L21:
            throw new IllegalStateException(("State is " + eh).toString());
        }

        public final void addExceptionLocked(Throwable exception) {
            Throwable rootCause = getRootCause();
            if (rootCause != null) goto L6;
            setRootCause(exception);
            return;
        L6:
            if (exception != rootCause) goto L8;
            return;
        L8:
            Object eh = getExceptionsHolder();
            if (eh != null) goto L12;
            setExceptionsHolder(exception);
            return;
        L12:
            if ((eh instanceof Throwable) == false) goto L17;
            if (exception != eh) goto L15;
            return;
        L15:
            ArrayList<Throwable> r2 = allocateList();
            r2.add(eh);
            r2.add(exception);
            setExceptionsHolder(r2);
            return;
        L17:
            if ((eh instanceof ArrayList) == false) goto L21;
            ((ArrayList) eh).add(exception);
            return;
        L21:
            throw new IllegalStateException(("State is " + eh).toString());
        }

        private final ArrayList<Throwable> allocateList() {
            return new ArrayList(4);
        }

        public String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + isCompleting() + ", rootCause=" + getRootCause() + ", exceptions=" + getExceptionsHolder() + ", list=" + getList() + ']';
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnAwaitCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class SelectOnAwaitCompletionHandler extends JobNode {
        private final SelectInstance<?> select;
        final /* synthetic */ JobSupport this$0;

        public SelectOnAwaitCompletionHandler(JobSupport this$0, SelectInstance<?> r2) {
            this.this$0 = this$0;
            this.select = r2;
        }

        @Override // kotlinx.coroutines.InternalCompletionHandler
        public void invoke(Throwable cause) {
            Object state = this.this$0.getState$kotlinx_coroutines_core();
            if ((state instanceof CompletedExceptionally) == false) goto L5;
            Object result = state;
        L6:
            this.select.trySelect(this.this$0, result);
            return;
        L5:
            result = JobSupportKt.unboxState(state);
            goto L6
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnJoinCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class SelectOnJoinCompletionHandler extends JobNode {
        private final SelectInstance<?> select;
        final /* synthetic */ JobSupport this$0;

        public SelectOnJoinCompletionHandler(JobSupport this$0, SelectInstance<?> r2) {
            this.this$0 = this$0;
            this.select = r2;
        }

        @Override // kotlinx.coroutines.InternalCompletionHandler
        public void invoke(Throwable cause) {
            this.select.trySelect(this.this$0, Unit.INSTANCE);
        }
    }

    static {
        _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");
        _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
    }

    protected static /* synthetic */ void getOnAwaitInternal$annotations() {
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    private final /* synthetic */ Object get_parentHandle$volatile() {
        return this._parentHandle$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_parentHandle$volatile$FU() {
        return _parentHandle$volatile$FU;
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_state$volatile$FU() {
        return _state$volatile$FU;
    }

    private final /* synthetic */ void loop$atomicfu(Object r2, AtomicReferenceFieldUpdater r3, Function1<Object, Unit> r4) {
    L2:
        r4.invoke(r3.get(r2));
        goto L2
    }

    private final /* synthetic */ void set_parentHandle$volatile(Object r1) {
        this._parentHandle$volatile = r1;
    }

    private final /* synthetic */ void set_state$volatile(Object r1) {
        this._state$volatile = r1;
    }

    public JobSupport(boolean active) {
        if (active == false) goto L5;
        Empty r0 = JobSupportKt.access$getEMPTY_ACTIVE$p();
    L6:
        this._state$volatile = r0;
        return;
    L5:
        r0 = JobSupportKt.access$getEMPTY_NEW$p();
        goto L6
    }

    public static final /* synthetic */ Object access$awaitSuspend(JobSupport $this, Continuation $completion) {
        return $this.awaitSuspend($completion);
    }

    public static final /* synthetic */ String access$cancellationExceptionMessage(JobSupport $this) {
        return $this.cancellationExceptionMessage();
    }

    public static final /* synthetic */ void access$continueCompleting(JobSupport $this, Finishing state, ChildHandleNode lastChild, Object proposedUpdate) {
        $this.continueCompleting(state, lastChild, proposedUpdate);
    }

    public static final /* synthetic */ Object access$joinSuspend(JobSupport $this, Continuation $completion) {
        return $this.joinSuspend($completion);
    }

    public static final /* synthetic */ Object access$onAwaitInternalProcessResFunc(JobSupport $this, Object ignoredParam, Object result) {
        return $this.onAwaitInternalProcessResFunc(ignoredParam, result);
    }

    public static final /* synthetic */ void access$onAwaitInternalRegFunc(JobSupport $this, SelectInstance select, Object ignoredParam) {
        $this.onAwaitInternalRegFunc(select, ignoredParam);
    }

    public static final /* synthetic */ void access$registerSelectForOnJoin(JobSupport $this, SelectInstance select, Object ignoredParam) {
        $this.registerSelectForOnJoin(select, ignoredParam);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        Job.DefaultImpls.cancel(this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> r3) {
        return (R) Job.DefaultImpls.fold(this, r2, r3);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> r2) {
        return (E) Job.DefaultImpls.get(this, r2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> r2) {
        return Job.DefaultImpls.minusKey(this, r2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext context) {
        return Job.DefaultImpls.plus(this, context);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public Job plus(Job other) {
        return Job.DefaultImpls.plus(this, other);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key<?> getKey() {
        return Job.Key;
    }

    public final ChildHandle getParentHandle$kotlinx_coroutines_core() {
        return (ChildHandle) get_parentHandle$volatile$FU().get(this);
    }

    public final void setParentHandle$kotlinx_coroutines_core(ChildHandle value) {
        get_parentHandle$volatile$FU().set(this, value);
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        ChildHandle r0 = getParentHandle$kotlinx_coroutines_core();
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getParent();
    }

    protected final void initParentJob(Job parent) {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        if (parent != null) goto L15;
        setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        return;
    L15:
        parent.start();
        ChildHandle handle = parent.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(handle);
        if (isCompleted() == false) goto L19;
        handle.dispose();
        setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        return;
    L19:
        return;
    L5:
        if (getParentHandle$kotlinx_coroutines_core() != null) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L12;
        throw new AssertionError();
    L7:
        r1 = false;
        goto L8
    }

    public final Object getState$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
    L3:
        Object state = handler$atomicfu$iv.get(this);
        if ((state instanceof OpDescriptor) == false) goto L5;
        ((OpDescriptor) state).perform(this);
        goto L3
    L5:
        return state;
    }

    private final Void loopOnState(Function1<Object, Unit> r3) {
    L3:
        r3.invoke(getState$kotlinx_coroutines_core());
        goto L3
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof Incomplete) == true) goto L5;
    L7:
        return false;
    L5:
        if (((Incomplete) state).isActive() == false) goto L7;
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof Incomplete);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof CompletedExceptionally) == false) goto L5;
    L10:
        return true;
    L5:
        if ((state instanceof Finishing) == true) goto L7;
    L9:
        return false;
    L7:
        if (((Finishing) state).isCancelling() == false) goto L9;
        goto L9
    }

    private final Object finalizeFinishingState(Finishing state, Object proposedUpdate) {
        boolean handled = true;
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L13;
        if (getState$kotlinx_coroutines_core() != state) goto L7;
        int r0 = 1;
    L8:
        if (r0 != 0) goto L13;
        throw new AssertionError();
    L7:
        r0 = 0;
    L13:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L20;
        if (state.isSealed() == false) goto L20;
        throw new AssertionError();
    L20:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L27;
        if (state.isCompleting() == true) goto L27;
        throw new AssertionError();
    L27:
        if ((proposedUpdate instanceof CompletedExceptionally) == false) goto L29;
        CompletedExceptionally r1 = (CompletedExceptionally) proposedUpdate;
    L30:
        if (r1 == null) goto L32;
        Throwable proposedException = r1.cause;
    L34:
        monitor-enter(state);
        boolean wasCancelling = state.isCancelling();     // Catch: Throwable -> L67
        List<Throwable> r8 = state.sealLocked(proposedException);     // Catch: Throwable -> L67
        Throwable finalCause = getFinalRootCause(state, r8);     // Catch: Throwable -> L67
        if (finalCause == null) goto L40;
        addSuppressedExceptions(finalCause, r8);     // Catch: Throwable -> L67
    L40:
        monitor-exit(state);
        if (finalCause == null) goto L44;
        if (finalCause == proposedException) goto L44;
        Object finalState = new CompletedExceptionally(finalCause, false, 2, null);
    L47:
        if (finalCause != null) goto L49;
    L56:
        if (wasCancelling == true) goto L58;
        onCancelling(finalCause);
    L58:
        onCompletionInternal(finalState);
        boolean casSuccess = AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, JobSupportKt.boxIncomplete(finalState));
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L61;
    L65:
        completeStateFinalization(state, finalState);
        return finalState;
    L61:
        if (casSuccess == true) goto L65;
        throw new AssertionError();
    L49:
        if (cancelParent(finalCause) == false) goto L51;
    L54:
        if (handled == false) goto L56;
        Intrinsics.checkNotNull(finalState, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
        ((CompletedExceptionally) finalState).makeHandled();
        goto L56
    L51:
        if (handleJobException(finalCause) == true) goto L54;
        handled = false;
    L44:
        finalState = proposedUpdate;
    L67:
        th = move-exception;
        throw th;
    L32:
        proposedException = null;
        goto L34
    L29:
        r1 = null;
        goto L30
    }

    private final Throwable getFinalRootCause(Finishing state, List<? extends Throwable> r13) {
        Object r1 = null;
        if (r13.isEmpty() == true) goto L5;
        List<? extends Throwable> $this$firstOrNull$iv = r13;
        Iterator r3 = $this$firstOrNull$iv.iterator();
    L11:
        if (r3.hasNext() == false) goto L15;
        Object element$iv = r3.next();
        if ((((Throwable) element$iv) instanceof CancellationException) == true) goto L11;
    L16:
        Throwable firstNonCancellation = (Throwable) element$iv;
        if (firstNonCancellation == null) goto L19;
        return firstNonCancellation;
    L19:
        Throwable first = r13.get(0);
        if ((first instanceof TimeoutCancellationException) == false) goto L36;
        List<? extends Throwable> $this$firstOrNull$iv2 = r13;
        Iterator r6 = $this$firstOrNull$iv2.iterator();
    L23:
        if (r6.hasNext() == false) goto L33;
        Object element$iv2 = r6.next();
        Throwable it = (Throwable) element$iv2;
        if (it != first) goto L27;
    L29:
        boolean r10 = false;
    L30:
        if (r10 == false) goto L23;
        r1 = element$iv2;
        goto L33
    L27:
        if ((it instanceof TimeoutCancellationException) == false) goto L29;
        r10 = true;
    L33:
        Throwable detailedTimeoutException = (Throwable) r1;
        if (detailedTimeoutException == null) goto L36;
        return detailedTimeoutException;
    L36:
        return first;
    L15:
        element$iv = null;
        goto L16
    L5:
        if (state.isCancelling() == true) goto L7;
        return null;
    L7:
        return new JobCancellationException(access$cancellationExceptionMessage(this), null, this);
    }

    private final void addSuppressedExceptions(Throwable rootCause, List<? extends Throwable> r8) {
        if (r8.size() > 1) goto L5;
        return;
    L5:
        int expectedSize$iv = r8.size();
        Set seenExceptions = Collections.newSetFromMap(new IdentityHashMap(expectedSize$iv));
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L8;
        Throwable unwrappedCause = rootCause;
    L9:
        Iterator<? extends Throwable> r1 = r8.iterator();
    L11:
        if (r1.hasNext() == false) goto L24;
        Throwable exception = r1.next();
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L15;
        Throwable unwrapped = exception;
    L17:
        if (unwrapped == rootCause) goto L11;
        if (unwrapped == unwrappedCause) goto L11;
        if ((unwrapped instanceof CancellationException) == true) goto L11;
        if (seenExceptions.add(unwrapped) == false) goto L11;
        kotlin.ExceptionsKt.addSuppressed(rootCause, unwrapped);
        goto L11
    L15:
        unwrapped = StackTraceRecoveryKt.unwrapImpl(exception);
        goto L17
    L24:
        return;
    L8:
        unwrappedCause = StackTraceRecoveryKt.unwrapImpl(rootCause);
        goto L9
    }

    private final boolean tryFinalizeSimpleState(Incomplete state, Object update) {
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L16;
        if ((state instanceof Empty) == false) goto L7;
    L10:
        int r0 = 1;
    L11:
        if (r0 != 0) goto L16;
        throw new AssertionError();
    L7:
        if ((state instanceof JobNode) == true) goto L10;
        r0 = 0;
    L16:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L23;
        if ((update instanceof CompletedExceptionally) == false) goto L23;
        throw new AssertionError();
    L23:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, JobSupportKt.boxIncomplete(update)) == true) goto L25;
        return false;
    L25:
        onCancelling(null);
        onCompletionInternal(update);
        completeStateFinalization(state, update);
        return true;
    }

    private final void completeStateFinalization(Incomplete state, Object update) {
        ChildHandle it = getParentHandle$kotlinx_coroutines_core();
        if (it == null) goto L5;
        it.dispose();
        setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
    L5:
        Throwable cause = null;
        if ((update instanceof CompletedExceptionally) == false) goto L8;
        CompletedExceptionally r0 = (CompletedExceptionally) update;
    L9:
        if (r0 == null) goto L12;
        cause = r0.cause;
    L12:
        if ((state instanceof JobNode) == true) goto L21;
        NodeList r1 = state.getList();
        if (r1 == null) goto L24;
        notifyCompletion(r1, cause);
        return;
    L24:
        return;
    L21:
        ((JobNode) state).invoke(cause);     // Catch: Throwable -> L15
        return;
    L15:
        ex = move-exception;
        handleOnCompletionException$kotlinx_coroutines_core(new CompletionHandlerException("Exception in completion handler " + state + " for " + this, ex));
        return;
    L8:
        r0 = null;
        goto L9
    }

    private final void notifyCancelling(NodeList list, Throwable cause) {
        onCancelling(cause);
        NodeList this_$iv$iv = list;
        Object r7 = this_$iv$iv.getNext();
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        LockFreeLinkedListNode cur$iv$iv = (LockFreeLinkedListNode) r7;
        Object exception$iv = null;
    L4:
        if (Intrinsics.areEqual(cur$iv$iv, this_$iv$iv) == true) goto L18;
        if ((cur$iv$iv instanceof JobCancellingNode) == false) goto L17;
        JobNode node$iv = (JobNode) cur$iv$iv;
        node$iv.invoke(cause);     // Catch: Throwable -> L10
    L10:
        ex$iv = move-exception;
        Throwable $this$notifyHandlers_u24lambda_u2414_u24lambda_u2412$iv = (Throwable) exception$iv;
        if ($this$notifyHandlers_u24lambda_u2414_u24lambda_u2412$iv == null) goto L15;
        kotlin.ExceptionsKt.addSuppressed($this$notifyHandlers_u24lambda_u2414_u24lambda_u2412$iv, ex$iv);
        if ($this$notifyHandlers_u24lambda_u2414_u24lambda_u2412$iv != null) goto L17;
    L15:
        Object exception$iv2 = new CompletionHandlerException("Exception in completion handler " + node$iv + " for " + this, ex$iv);
        Unit r8 = Unit.INSTANCE;
        exception$iv = exception$iv2;
    L17:
        cur$iv$iv = cur$iv$iv.getNextNode();
        goto L4
    L18:
        Throwable it$iv = (Throwable) exception$iv;
        if (it$iv == null) goto L21;
        handleOnCompletionException$kotlinx_coroutines_core(it$iv);
    L21:
        cancelParent(cause);
    }

    private final boolean cancelParent(Throwable cause) {
        if (isScopedCoroutine() == false) goto L5;
        return true;
    L5:
        boolean isCancellation = cause instanceof CancellationException;
        ChildHandle parent = getParentHandle$kotlinx_coroutines_core();
        if (parent != null) goto L8;
    L16:
        return isCancellation;
    L8:
        if (parent == NonDisposableHandle.INSTANCE) goto L16;
        if (parent.childCancelled(cause) == true) goto L17;
        if (isCancellation == true) goto L18;
        return false;
    L18:
        return true;
    L17:
        return true;
    }

    private final void notifyCompletion(NodeList $this$notifyCompletion, Throwable cause) {
        NodeList this_$iv$iv = $this$notifyCompletion;
        Object r5 = this_$iv$iv.getNext();
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        LockFreeLinkedListNode cur$iv$iv = (LockFreeLinkedListNode) r5;
        Object exception$iv = null;
    L4:
        if (Intrinsics.areEqual(cur$iv$iv, this_$iv$iv) == true) goto L19;
        if ((cur$iv$iv instanceof JobNode) == false) goto L18;
        JobNode node$iv = (JobNode) cur$iv$iv;
        node$iv.invoke(cause);     // Catch: Throwable -> L10
    L10:
        ex$iv = move-exception;
        Throwable $this$notifyHandlers_u24lambda_u2414_u24lambda_u2412$iv = (Throwable) exception$iv;
        if ($this$notifyHandlers_u24lambda_u2414_u24lambda_u2412$iv == null) goto L15;
        kotlin.ExceptionsKt.addSuppressed($this$notifyHandlers_u24lambda_u2414_u24lambda_u2412$iv, ex$iv);
        if ($this$notifyHandlers_u24lambda_u2414_u24lambda_u2412$iv != null) goto L18;
    L15:
        Object exception$iv2 = new CompletionHandlerException("Exception in completion handler " + node$iv + " for " + this, ex$iv);
        Unit r6 = Unit.INSTANCE;
        exception$iv = exception$iv2;
    L18:
        cur$iv$iv = cur$iv$iv.getNextNode();
        goto L4
    L19:
        Throwable it$iv = (Throwable) exception$iv;
        if (it$iv == null) goto L31;
        handleOnCompletionException$kotlinx_coroutines_core(it$iv);
        return;
    }

    private final /* synthetic */ <T extends JobNode> void notifyHandlers(NodeList list, Throwable cause) {
        Object exception = null;
        NodeList this_$iv = list;
        Object r4 = this_$iv.getNext();
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        LockFreeLinkedListNode cur$iv = (LockFreeLinkedListNode) r4;
    L4:
        if (Intrinsics.areEqual(cur$iv, this_$iv) == true) goto L18;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((cur$iv instanceof LockFreeLinkedListNode) == false) goto L17;
        JobNode node = (JobNode) cur$iv;
        node.invoke(cause);     // Catch: Throwable -> L10
    L10:
        ex = move-exception;
        Throwable r8 = (Throwable) exception;
        if (r8 == null) goto L15;
        Throwable $this$notifyHandlers_u24lambda_u2414_u24lambda_u2412 = r8;
        kotlin.ExceptionsKt.addSuppressed($this$notifyHandlers_u24lambda_u2414_u24lambda_u2412, ex);
        if (r8 != null) goto L17;
    L15:
        JobSupport $this$notifyHandlers_u24lambda_u2414_u24lambda_u2413 = this;
        Object exception2 = new CompletionHandlerException("Exception in completion handler " + node + " for " + $this$notifyHandlers_u24lambda_u2414_u24lambda_u2413, ex);
        Unit r1 = Unit.INSTANCE;
        exception = exception2;
    L17:
        cur$iv = cur$iv.getNextNode();
        goto L4
    L18:
        Throwable r2 = (Throwable) exception;
        if (r2 == null) goto L29;
        Throwable it = r2;
        handleOnCompletionException$kotlinx_coroutines_core(it);
        return;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
    L3:
        Object state = getState$kotlinx_coroutines_core();
        switch(startInternal(state)) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L3;
        };
    L6:
        return true;
    L8:
        return false;
    }

    private final int startInternal(Object state) {
        if ((state instanceof Empty) == false) goto L13;
        if (((Empty) state).isActive() == false) goto L8;
        return 0;
    L8:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, JobSupportKt.access$getEMPTY_ACTIVE$p()) == true) goto L10;
        return -1;
    L10:
        onStart();
        return 1;
    L13:
        if ((state instanceof InactiveNodeList) == true) goto L15;
        return 0;
    L15:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, ((InactiveNodeList) state).getList()) == true) goto L17;
        return -1;
    L17:
        onStart();
        return 1;
    }

    protected void onStart() {
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException getCancellationException() {
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof Finishing) == false) goto L12;
        Throwable r1 = ((Finishing) state).getRootCause();
        if (r1 == null) goto L10;
        CancellationException r2 = toCancellationException(r1, DebugStringsKt.getClassSimpleName(this) + " is cancelling");
        if (r2 == null) goto L10;
        return r2;
    L10:
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    L12:
        if ((state instanceof Incomplete) == true) goto L19;
        if ((state instanceof CompletedExceptionally) == false) goto L17;
        return toCancellationException$default(this, ((CompletedExceptionally) state).cause, null, 1, null);
    L17:
        return new JobCancellationException(DebugStringsKt.getClassSimpleName(this) + " has completed normally", null, this);
    L19:
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public static /* synthetic */ CancellationException toCancellationException$default(JobSupport r0, Throwable r1, String r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r2 = null;
    L7:
        return r0.toCancellationException(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    protected final CancellationException toCancellationException(Throwable $this$toCancellationException, String message) {
        if (($this$toCancellationException instanceof CancellationException) == false) goto L5;
        CancellationException r0 = (CancellationException) $this$toCancellationException;
    L6:
        if (r0 == null) goto L8;
        return r0;
    L8:
        if (message != null) goto L10;
        String r3 = access$cancellationExceptionMessage(this);
    L12:
        return new JobCancellationException(r3, $this$toCancellationException, this);
    L10:
        r3 = message;
        goto L12
    L5:
        r0 = null;
        goto L6
    }

    protected final Throwable getCompletionCause() {
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof Finishing) == false) goto L10;
        Throwable r1 = ((Finishing) state).getRootCause();
        if (r1 == null) goto L8;
        return r1;
    L8:
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    L10:
        if ((state instanceof Incomplete) == true) goto L17;
        if ((state instanceof CompletedExceptionally) == true) goto L18;
        return null;
    L18:
        return ((CompletedExceptionally) state).cause;
    L17:
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    protected final boolean getCompletionCauseHandled() {
        Object it = getState$kotlinx_coroutines_core();
        if ((it instanceof CompletedExceptionally) == true) goto L5;
    L7:
        return false;
    L5:
        if (((CompletedExceptionally) it).getHandled() == false) goto L7;
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(Function1<? super Throwable, Unit> r4) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(false, true, new InternalCompletionHandler.UserSupplied(r4));
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, Function1<? super Throwable, Unit> r4) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(onCancelling, invokeImmediately, new InternalCompletionHandler.UserSupplied(r4));
    }

    public final DisposableHandle invokeOnCompletionInternal$kotlinx_coroutines_core(boolean onCancelling, boolean invokeImmediately, InternalCompletionHandler handler) {
        JobNode node = makeNode(handler, onCancelling);
    L3:
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof Empty) == true) goto L6;
        if ((state instanceof Incomplete) == false) goto L57;
        NodeList list = ((Incomplete) state).getList();
        if (list == null) goto L16;
        Throwable r6 = null;
        Object handle = NonDisposableHandle.INSTANCE;
        if (onCancelling == false) goto L46;
        if ((state instanceof Finishing) == false) goto L46;
        monitor-enter(state);
        r6 = ((Finishing) state).getRootCause();     // Catch: Throwable -> L43
        if (r6 == null) goto L31;
        if ((handler instanceof ChildHandleNode) == false) goto L40;
        if (((Finishing) state).isCompleting() == false) goto L31;
    L40:
        Unit r10 = Unit.INSTANCE;     // Catch: Throwable -> L43
        monitor-exit(state);
    L31:
        if (addLastAtomic(state, list, node) == false) goto L32;
        if (r6 == null) goto L35;
        handle = node;
        goto L40
    L35:
        JobNode r11 = node;     // Catch: Throwable -> L43
        monitor-exit(state);
        return r11;
    L32:
        monitor-exit(state);
    L43:
        th = move-exception;
        throw th;
    L46:
        if (r6 != null) goto L47;
        if (addLastAtomic(state, list, node) == false) goto L3;
        return node;
    L47:
        if (invokeImmediately == false) goto L50;
        handler.invoke(r6);
    L50:
        return (DisposableHandle) handle;
    L16:
        Intrinsics.checkNotNull(state, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
        promoteSingleToNodeList((JobNode) state);
        goto L3
    L57:
        if (invokeImmediately == false) goto L66;
        Throwable r7 = null;
        if ((state instanceof CompletedExceptionally) == false) goto L61;
        CompletedExceptionally r5 = (CompletedExceptionally) state;
    L62:
        if (r5 == null) goto L64;
        r7 = r5.cause;
    L64:
        handler.invoke(r7);
        goto L66
    L61:
        r5 = null;
    L66:
        return NonDisposableHandle.INSTANCE;
    L6:
        if (((Empty) state).isActive() == true) goto L8;
        promoteEmptyToNodeList((Empty) state);
        goto L3
    L8:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, node) == false) goto L3;
        return node;
    }

    private final JobNode makeNode(InternalCompletionHandler handler, boolean onCancelling) {
        InvokeOnCompletion node = null;
        if (onCancelling == false) goto L11;
        if ((handler instanceof JobCancellingNode) == false) goto L7;
        node = (JobCancellingNode) handler;
    L7:
        if (node != null) goto L9;
        node = new InvokeOnCancelling(handler);
    L9:
        node = node;
    L23:
        node.setJob(this);
        return node;
    L11:
        if ((handler instanceof JobNode) == false) goto L13;
        node = (JobNode) handler;
    L13:
        if (node == null) goto L22;
        JobNode it = node;
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L23;
        if ((it instanceof JobCancellingNode) == false) goto L23;
        throw new AssertionError();
    L22:
        node = new InvokeOnCompletion(handler);
        goto L23
    }

    private final boolean addLastAtomic(final Object expect, NodeList list, JobNode node) {
        NodeList this_$iv = list;
        final JobNode r5 = node;
        LockFreeLinkedListNode.CondAddOp condAdd$iv = new JobSupport$addLastAtomic$$inlined$addLastIf$1(r5, this, expect);
    L3:
        LockFreeLinkedListNode prev$iv = this_$iv.getPrevNode();
        switch(prev$iv.tryCondAddNext(node, this_$iv, condAdd$iv)) {
            case 1: goto L7;
            case 2: goto L6;
            default: goto L3;
        };
    L6:
        return false;
    L7:
        return true;
    }

    private final void promoteEmptyToNodeList(Empty state) {
        NodeList list = new NodeList();
        if (state.isActive() == false) goto L5;
        Incomplete update = list;
    L6:
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, update);
        return;
    L5:
        update = new InactiveNodeList(list);
        goto L6
    }

    private final void promoteSingleToNodeList(JobNode state) {
        state.addOneIfEmpty(new NodeList());
        LockFreeLinkedListNode list = state.getNextNode();
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, list);
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation<? super Unit> r3) {
        if (joinInternal() == true) goto L6;
        JobKt.ensureActive(r3.getContext());
        return Unit.INSTANCE;
    L6:
        Object r0 = joinSuspend(r3);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r0;
    L10:
        return Unit.INSTANCE;
    }

    private final boolean joinInternal() {
    L3:
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof Incomplete) == false) goto L5;
        if (startInternal(state) < 0) goto L3;
        return true;
    L5:
        return false;
    }

    private final Object joinSuspend(Continuation<? super Unit> r13) {
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r13), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl cont = cancellable$iv;
        CancellableContinuationKt.disposeOnCancellation(cont, JobKt.invokeOnCompletion$default(this, false, false, new ResumeOnCompletion(cont), 3, null));
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        DebugProbesKt.probeCoroutineSuspended(r13);
    L6:
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L9;
        return r1;
    L9:
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    public final SelectClause0 getOnJoin() {
        JobSupport$onJoin$1 r1 = JobSupport$onJoin$1.INSTANCE;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 r3 = null;
        return new SelectClause0Impl(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, 3), r3, 4, null);
    }

    private final void registerSelectForOnJoin(SelectInstance<?> r8, Object ignoredParam) {
        if (joinInternal() == true) goto L6;
        r8.selectInRegistrationPhase(Unit.INSTANCE);
        return;
    L6:
        DisposableHandle disposableHandle = JobKt.invokeOnCompletion$default(this, false, false, new SelectOnJoinCompletionHandler(this, r8), 3, null);
        r8.disposeOnCompletion(disposableHandle);
    }

    public final void removeNode$kotlinx_coroutines_core(JobNode node) {
    L3:
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof JobNode) == false) goto L12;
        if (state != node) goto L6;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, JobSupportKt.access$getEMPTY_ACTIVE$p()) == false) goto L3;
        return;
    L6:
        return;
    L12:
        if ((state instanceof Incomplete) == true) goto L14;
        return;
    L14:
        if (((Incomplete) state).getList() == null) goto L22;
        node.mo8969remove();
        return;
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(CancellationException cause) {
        if (cause != null) goto L4;
        JobCancellationException r3 = new JobCancellationException(access$cancellationExceptionMessage(this), null, this);
    L5:
        cancelInternal(r3);
        return;
    L4:
        r3 = cause;
        goto L5
    }

    protected String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(Throwable cause) {
        if (cause == null) goto L6;
        JobCancellationException r1 = toCancellationException$default(this, cause, null, 1, null);
        if (r1 == null) goto L6;
    L7:
        cancelInternal(r1);
        return true;
    L6:
        r1 = new JobCancellationException(access$cancellationExceptionMessage(this), null, this);
        goto L7
    }

    public void cancelInternal(Throwable cause) {
        cancelImpl$kotlinx_coroutines_core(cause);
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(ParentJob parentJob) {
        cancelImpl$kotlinx_coroutines_core(parentJob);
    }

    public boolean childCancelled(Throwable cause) {
        if ((cause instanceof CancellationException) == false) goto L6;
        return true;
    L6:
        if (cancelImpl$kotlinx_coroutines_core(cause) == true) goto L8;
    L10:
        return false;
    L8:
        if (getHandlesException$kotlinx_coroutines_core() == false) goto L10;
        return true;
    }

    public final boolean cancelCoroutine(Throwable cause) {
        return cancelImpl$kotlinx_coroutines_core(cause);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(Object cause) {
        Object finalState = JobSupportKt.access$getCOMPLETING_ALREADY$p();
        if (getOnCancelComplete$kotlinx_coroutines_core() == false) goto L8;
        finalState = cancelMakeCompleting(cause);
        if (finalState != JobSupportKt.COMPLETING_WAITING_CHILDREN) goto L8;
        return true;
    L8:
        if (finalState != JobSupportKt.access$getCOMPLETING_ALREADY$p()) goto L11;
        finalState = makeCancelling(cause);
    L11:
        if (finalState != JobSupportKt.access$getCOMPLETING_ALREADY$p()) goto L14;
        return true;
    L14:
        if (finalState != JobSupportKt.COMPLETING_WAITING_CHILDREN) goto L17;
        return true;
    L17:
        if (finalState != JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()) goto L19;
        return false;
    L19:
        afterCompletion(finalState);
        return true;
    }

    private final Object cancelMakeCompleting(Object cause) {
    L3:
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof Incomplete) == false) goto L15;
        if ((state instanceof Finishing) == true) goto L8;
    L10:
        CompletedExceptionally proposedUpdate = new CompletedExceptionally(createCauseException(cause), false, 2, null);
        Object finalState = tryMakeCompleting(state, proposedUpdate);
        if (finalState == JobSupportKt.access$getCOMPLETING_RETRY$p()) goto L3;
        return finalState;
    L8:
        if (((Finishing) state).isCompleting() == false) goto L10;
    L15:
        return JobSupportKt.access$getCOMPLETING_ALREADY$p();
    }

    public static /* synthetic */ JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(JobSupport $this, String message, Throwable cause, int r5, Object r6) {
        if (r6 != null) goto L16;
        if ((r5 & 1) == 0) goto L7;
        message = null;
    L7:
        if ((r5 & 2) == 0) goto L10;
        cause = null;
    L10:
        if (message != null) goto L12;
        String r0 = access$cancellationExceptionMessage($this);
    L14:
        return new JobCancellationException(r0, cause, $this);
    L12:
        r0 = message;
        goto L14
    L16:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    public final JobCancellationException defaultCancellationException$kotlinx_coroutines_core(String message, Throwable cause) {
        if (message != null) goto L5;
        String r2 = access$cancellationExceptionMessage(this);
    L7:
        return new JobCancellationException(r2, cause, this);
    L5:
        r2 = message;
        goto L7
    }

    @Override // kotlinx.coroutines.ParentJob
    public CancellationException getChildJobCancellationCause() {
        Object state = getState$kotlinx_coroutines_core();
        CancellationException r2 = null;
        if ((state instanceof Finishing) == false) goto L6;
        Throwable rootCause = ((Finishing) state).getRootCause();
    L12:
        if ((rootCause instanceof CancellationException) == false) goto L14;
        r2 = (CancellationException) rootCause;
    L14:
        if (r2 == null) goto L16;
        return r2;
    L16:
        return new JobCancellationException("Parent job is " + stateString(state), rootCause, this);
    L6:
        if ((state instanceof CompletedExceptionally) == false) goto L9;
        rootCause = ((CompletedExceptionally) state).cause;
        goto L12
    L9:
        if ((state instanceof Incomplete) == true) goto L18;
        rootCause = null;
        goto L12
    L18:
        throw new IllegalStateException(("Cannot be cancelling child in this state: " + state).toString());
    }

    private final Throwable createCauseException(Object cause) {
        if (cause != null) goto L4;
        boolean r0 = true;
    L5:
        if (r0 == false) goto L9;
        Throwable r1 = (Throwable) cause;
        if (r1 == null) goto L12;
        return r1;
    L12:
        return new JobCancellationException(access$cancellationExceptionMessage(this), null, this);
    L9:
        Intrinsics.checkNotNull(cause, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ParentJob) cause).getChildJobCancellationCause();
    L4:
        r0 = cause instanceof Throwable;
        goto L5
    }

    private final Object makeCancelling(Object cause) {
        Throwable causeException = null;
    L3:
        Object state = getState$kotlinx_coroutines_core();
        Throwable notifyRootCause = null;
        boolean r8 = false;
        if ((state instanceof Finishing) == true) goto L6;
        if ((state instanceof Incomplete) == false) goto L59;
        if (causeException != null) goto L42;
        Throwable r0 = createCauseException(cause);
        Throwable r9 = r0;
        causeException = r0;
    L44:
        if (((Incomplete) state).isActive() == true) goto L46;
        Object finalState = tryMakeCompleting(state, new CompletedExceptionally(causeException, false, 2, null));
        if (finalState == JobSupportKt.access$getCOMPLETING_ALREADY$p()) goto L57;
        if (finalState == JobSupportKt.access$getCOMPLETING_RETRY$p()) goto L55;
        return finalState;
    L55:
        causeException = r9;
        goto L3
    L57:
        throw new IllegalStateException(("Cannot happen in " + state).toString());
    L46:
        if (tryMakeCancelling((Incomplete) state, causeException) == false) goto L55;
        return JobSupportKt.access$getCOMPLETING_ALREADY$p();
    L42:
        r9 = causeException;
        goto L44
    L59:
        return JobSupportKt.access$getTOO_LATE_TO_CANCEL$p();
    L6:
        monitor-enter(state);
    L35:
        th = th;
    L36:
        monitor-exit(state);
        throw th;
    L9:
        if (((Finishing) state).isSealed() == false) goto L13;
        Symbol r7 = JobSupportKt.access$getTOO_LATE_TO_CANCEL$p();     // Catch: Throwable -> L35
        monitor-exit(state);
        return r7;
    L13:
        boolean wasCancelling = ((Finishing) state).isCancelling();     // Catch: Throwable -> L35
        if (cause != null) goto L16;
        if (wasCancelling == false) goto L16;
    L22:
        Throwable r12 = ((Finishing) state).getRootCause();     // Catch: Throwable -> L35
        if (wasCancelling == true) goto L26;
        r8 = true;
    L26:
        if (r8 == false) goto L28;
        notifyRootCause = r12;
    L28:
        monitor-exit(state);
        if (notifyRootCause == null) goto L32;
        notifyCancelling(((Finishing) state).getList(), notifyRootCause);
    L32:
        return JobSupportKt.access$getCOMPLETING_ALREADY$p();
    L16:
        if (causeException != null) goto L19;
        Throwable it = createCauseException(cause);     // Catch: Throwable -> L35
        Object causeExceptionCache = it;
        causeException = it;
    L61:
        ((Finishing) state).addExceptionLocked(causeException);     // Catch: Throwable -> L33
    L33:
        th = th;
        goto L36
    L19:
        causeExceptionCache = causeException;
        goto L61
    }

    private final NodeList getOrPromoteCancellingList(Incomplete state) {
        NodeList r0 = state.getList();
        if (r0 == null) goto L5;
        return r0;
    L5:
        if ((state instanceof Empty) == false) goto L8;
        return new NodeList();
    L8:
        if ((state instanceof JobNode) == false) goto L11;
        promoteSingleToNodeList((JobNode) state);
        return null;
    L11:
        throw new IllegalStateException(("State should have list: " + state).toString());
    }

    private final boolean tryMakeCancelling(Incomplete state, Throwable rootCause) {
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L10;
        if ((state instanceof Finishing) == false) goto L10;
        throw new AssertionError();
    L10:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L12;
    L16:
        NodeList list = getOrPromoteCancellingList(state);
        if (list != null) goto L19;
        return false;
    L19:
        Finishing cancelling = new Finishing(list, false, rootCause);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, cancelling) == true) goto L22;
        return false;
    L22:
        notifyCancelling(list, rootCause);
        return true;
    L12:
        if (state.isActive() == true) goto L16;
        throw new AssertionError();
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(Object proposedUpdate) {
    L3:
        Object state = getState$kotlinx_coroutines_core();
        Object finalState = tryMakeCompleting(state, proposedUpdate);
        if (finalState == JobSupportKt.access$getCOMPLETING_ALREADY$p()) goto L5;
        if (finalState == JobSupportKt.COMPLETING_WAITING_CHILDREN) goto L9;
        if (finalState == JobSupportKt.access$getCOMPLETING_RETRY$p()) goto L3;
        afterCompletion(finalState);
        return true;
    L9:
        return true;
    L5:
        return false;
    }

    public final Object makeCompletingOnce$kotlinx_coroutines_core(Object proposedUpdate) {
    L3:
        Object state = getState$kotlinx_coroutines_core();
        Object finalState = tryMakeCompleting(state, proposedUpdate);
        if (finalState == JobSupportKt.access$getCOMPLETING_ALREADY$p()) goto L10;
        if (finalState == JobSupportKt.access$getCOMPLETING_RETRY$p()) goto L3;
        return finalState;
    L10:
        throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, getExceptionOrNull(proposedUpdate));
    }

    private final Object tryMakeCompleting(Object state, Object proposedUpdate) {
        if ((state instanceof Incomplete) == true) goto L7;
        return JobSupportKt.access$getCOMPLETING_ALREADY$p();
    L7:
        if ((state instanceof Empty) == true) goto L11;
        if ((state instanceof JobNode) == true) goto L11;
    L20:
        return tryMakeCompletingSlowPath((Incomplete) state, proposedUpdate);
    L11:
        if ((state instanceof ChildHandleNode) == true) goto L20;
        if ((proposedUpdate instanceof CompletedExceptionally) == true) goto L20;
        if (tryFinalizeSimpleState((Incomplete) state, proposedUpdate) == false) goto L18;
        return proposedUpdate;
    L18:
        return JobSupportKt.access$getCOMPLETING_RETRY$p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object tryMakeCompletingSlowPath(Incomplete state, Object proposedUpdate) {
        NodeList list = getOrPromoteCancellingList(state);
        if (list == null) goto L5;
        T r2 = 0;
        if ((state instanceof Finishing) == false) goto L9;
        Finishing finishing = (Finishing) state;
    L10:
        boolean r3 = false;
        if (finishing != null) goto L13;
        finishing = new Finishing(list, false, null);
    L13:
        Ref.ObjectRef notifyRootCause = new Ref.ObjectRef();
        monitor-enter(finishing);
    L61:
        th = move-exception;
        throw th;
    L17:
        if (finishing.isCompleting() == false) goto L22;
        Symbol r4 = JobSupportKt.access$getCOMPLETING_ALREADY$p();     // Catch: Throwable -> L61
        monitor-exit(finishing);
        return r4;
    L22:
        finishing.setCompleting(true);     // Catch: Throwable -> L61
        if (finishing == state) goto L30;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, finishing) == true) goto L30;
        Symbol r5 = JobSupportKt.access$getCOMPLETING_RETRY$p();     // Catch: Throwable -> L61
        monitor-exit(finishing);
        return r5;
    L30:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L32;
    L36:
        boolean wasCancelling = finishing.isCancelling();     // Catch: Throwable -> L61
        if ((proposedUpdate instanceof CompletedExceptionally) == false) goto L39;
        CompletedExceptionally it = (CompletedExceptionally) proposedUpdate;     // Catch: Throwable -> L61
    L40:
        if (it == null) goto L42;
        finishing.addExceptionLocked(it.cause);     // Catch: Throwable -> L61
    L42:
        Throwable r10 = finishing.getRootCause();     // Catch: Throwable -> L61
        if (wasCancelling == true) goto L46;
        r3 = true;
    L46:
        if (Boolean.valueOf(r3).booleanValue() == false) goto L48;
        r2 = r10;
    L48:
        notifyRootCause.element = r2;     // Catch: Throwable -> L61
        Unit r6 = Unit.INSTANCE;     // Catch: Throwable -> L61
        monitor-exit(finishing);
        Throwable it2 = (Throwable) notifyRootCause.element;
        if (it2 == null) goto L53;
        notifyCancelling(list, it2);
    L53:
        ChildHandleNode child = firstChild(state);
        if (child == null) goto L60;
        if (tryWaitForChild(finishing, child, proposedUpdate) == false) goto L60;
        return JobSupportKt.COMPLETING_WAITING_CHILDREN;
    L60:
        return finalizeFinishingState(finishing, proposedUpdate);
    L39:
        it = null;
        goto L40
    L32:
        if (finishing.isSealed() == false) goto L36;
        throw new AssertionError();     // Catch: Throwable -> L61
    L9:
        finishing = null;
        goto L10
    L5:
        return JobSupportKt.access$getCOMPLETING_RETRY$p();
    }

    private final Throwable getExceptionOrNull(Object $this$exceptionOrNull) {
        if (($this$exceptionOrNull instanceof CompletedExceptionally) == false) goto L5;
        CompletedExceptionally r0 = (CompletedExceptionally) $this$exceptionOrNull;
    L6:
        if (r0 != null) goto L8;
        return null;
    L8:
        return r0.cause;
    L5:
        r0 = null;
        goto L6
    }

    private final ChildHandleNode firstChild(Incomplete state) {
        if ((state instanceof ChildHandleNode) == false) goto L5;
        ChildHandleNode r0 = (ChildHandleNode) state;
    L6:
        if (r0 != null) goto L11;
        NodeList r1 = state.getList();
        if (r1 != null) goto L13;
        return null;
    L13:
        return nextChild(r1);
    L11:
        return r0;
    L5:
        r0 = null;
        goto L6
    }

    private final boolean tryWaitForChild(Finishing state, ChildHandleNode child, Object proposedUpdate) {
    L2:
        DisposableHandle handle = JobKt.invokeOnCompletion$default(child.childJob, false, false, new ChildCompletion(this, state, child, proposedUpdate), 1, null);
        if (handle != NonDisposableHandle.INSTANCE) goto L4;
        ChildHandleNode nextChild = nextChild(child);
        if (nextChild == null) goto L8;
        child = nextChild;
        goto L2
    L8:
        return false;
    L4:
        return true;
    }

    private final void continueCompleting(Finishing state, ChildHandleNode lastChild, Object proposedUpdate) {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        ChildHandleNode waitChild = nextChild(lastChild);
        if (waitChild != null) goto L15;
    L17:
        Object finalState = finalizeFinishingState(state, proposedUpdate);
        afterCompletion(finalState);
        return;
    L15:
        if (tryWaitForChild(state, waitChild, proposedUpdate) == false) goto L17;
        return;
    L5:
        if (getState$kotlinx_coroutines_core() != state) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L12;
        throw new AssertionError();
    L7:
        r1 = false;
        goto L8
    }

    private final ChildHandleNode nextChild(LockFreeLinkedListNode $this$nextChild) {
        LockFreeLinkedListNode cur = $this$nextChild;
    L4:
        if (cur.isRemoved() == false) goto L6;
        cur = cur.getPrevNode();
    L6:
        cur = cur.getNextNode();
        if (cur.isRemoved() == true) goto L6;
        if ((cur instanceof ChildHandleNode) == true) goto L11;
        if ((cur instanceof NodeList) == false) goto L6;
        return null;
    L11:
        return (ChildHandleNode) cur;
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence<Job> getChildren() {
        return SequencesKt.sequence(new JobSupport$children$1(this, null));
    }

    @Override // kotlinx.coroutines.Job
    public final ChildHandle attachChild(ChildJob child) {
        DisposableHandle r0 = JobKt.invokeOnCompletion$default(this, true, false, new ChildHandleNode(child), 2, null);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (ChildHandle) r0;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(Throwable exception) {
        throw exception;
    }

    protected void onCancelling(Throwable cause) {
    }

    protected boolean isScopedCoroutine() {
        return false;
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    protected boolean handleJobException(Throwable exception) {
        return false;
    }

    protected void onCompletionInternal(Object state) {
    }

    protected void afterCompletion(Object state) {
    }

    public String toString() {
        return toDebugString() + '@' + DebugStringsKt.getHexAddress(this);
    }

    public final String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + stateString(getState$kotlinx_coroutines_core()) + '}';
    }

    public String nameString$kotlinx_coroutines_core() {
        return DebugStringsKt.getClassSimpleName(this);
    }

    private final String stateString(Object state) {
        if ((state instanceof Finishing) == false) goto L12;
        if (((Finishing) state).isCancelling() == false) goto L8;
        return "Cancelling";
    L8:
        if (((Finishing) state).isCompleting() == false) goto L26;
        return "Completing";
    L26:
        return "Active";
    L12:
        if ((state instanceof Incomplete) == false) goto L18;
        if (((Incomplete) state).isActive() == true) goto L27;
        return "New";
    L27:
        return "Active";
    L18:
        if ((state instanceof CompletedExceptionally) == false) goto L20;
        return "Cancelled";
    L20:
        return "Completed";
    }

    private final boolean isCancelling(Incomplete $this$isCancelling) {
        if (($this$isCancelling instanceof Finishing) == true) goto L5;
    L7:
        return false;
    L5:
        if (((Finishing) $this$isCancelling).isCancelling() == false) goto L7;
        return true;
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof CompletedExceptionally;
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof Incomplete) == true) goto L7;
        return getExceptionOrNull(state);
    L7:
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final Object getCompletedInternal$kotlinx_coroutines_core() {
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof Incomplete) == true) goto L11;
        if ((state instanceof CompletedExceptionally) == true) goto L9;
        return JobSupportKt.unboxState(state);
    L9:
        throw ((CompletedExceptionally) state).cause;
    L11:
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    protected final Object awaitInternal(Continuation<Object> r7) {
    L2:
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof Incomplete) == false) goto L5;
        if (startInternal(state) < 0) goto L2;
        return awaitSuspend(r7);
    L5:
        if ((state instanceof CompletedExceptionally) == false) goto L15;
        Throwable exception$iv = ((CompletedExceptionally) state).cause;
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L9;
        throw exception$iv;
    L9:
        if ((r7 instanceof CoroutineStackFrame) == true) goto L12;
        throw exception$iv;
    L12:
        throw StackTraceRecoveryKt.access$recoverFromStackFrame(exception$iv, (CoroutineStackFrame) r7);
    L15:
        return JobSupportKt.unboxState(state);
    }

    private final Object awaitSuspend(Continuation<Object> r11) {
        AwaitContinuation cont = new AwaitContinuation(IntrinsicsKt.intercepted(r11), this);
        cont.initCancellability();
        CancellableContinuationKt.disposeOnCancellation(cont, JobKt.invokeOnCompletion$default(this, false, false, new ResumeAwaitOnCompletion(cont), 3, null));
        Object r0 = cont.getResult();
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L5;
        DebugProbesKt.probeCoroutineSuspended(r11);
    L5:
        return r0;
    }

    protected final SelectClause1<?> getOnAwaitInternal() {
        JobSupport$onAwaitInternal$1 r1 = JobSupport$onAwaitInternal$1.INSTANCE;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 r2 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, 3);
        JobSupport$onAwaitInternal$2 r3 = JobSupport$onAwaitInternal$2.INSTANCE;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        Function3 r4 = null;
        return new SelectClause1Impl(this, r2, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 3), r4, 8, null);
    }

    private final void onAwaitInternalRegFunc(SelectInstance<?> r9, Object ignoredParam) {
    L2:
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof Incomplete) == false) goto L5;
        if (startInternal(state) < 0) goto L2;
        DisposableHandle disposableHandle = JobKt.invokeOnCompletion$default(this, false, false, new SelectOnAwaitCompletionHandler(this, r9), 3, null);
        r9.disposeOnCompletion(disposableHandle);
        return;
    L5:
        if ((state instanceof CompletedExceptionally) == false) goto L7;
        Object result = state;
    L8:
        r9.selectInRegistrationPhase(result);
        return;
    L7:
        result = JobSupportKt.unboxState(state);
        goto L8
    }

    private final Object onAwaitInternalProcessResFunc(Object ignoredParam, Object result) {
        if ((result instanceof CompletedExceptionally) == true) goto L6;
        return result;
    L6:
        throw ((CompletedExceptionally) result).cause;
    }
}
